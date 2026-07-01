import com.edifecs.etools.xeserver.proxy.ProxyMessage
import com.edifecs.etools.commons.io.SmartStream
import groovy.util.slurpersupport.NodeChild
import java.io.*
import groovy.util.XmlSlurper
import org.apache.commons.lang.StringUtils
import java.time.LocalDateTime
import java.time.Duration
import java.time.format.DateTimeFormatter

exchange = context.exchange
exchProperties = exchange.properties
messages = exchange.messages
message = messages[0]
msgHeaders = message.headers

def FileLevelErrorCheck = exchProperties.get('FileLevelErrorCheck')
def SE01Value = exchProperties.get('SE01Value')

if (exchProperties.get('auditEventNumber') in ["1", "3", "4", "7", "8"]) {
    def auditEventNumber = exchProperties.get('auditEventNumber')
    def messageBodyInputStream = message.getBodyAsSmartStream().getInputStream()
    def maxFormattedLength = 298

    // Parse XML
    def root = new XmlSlurper().parse(messageBodyInputStream)

    StringBuilder errorDetails = new StringBuilder()
    def errors = root.'**'.findAll { it.name() == 'Error' }

    // Format each error
    errors.eachWithIndex { error, idx ->
        def errorBrief = error.Brief?.text()?.trim()
        def errorID = error.@ID?.toString()
        def errorSnip = error.@SNIP?.toString()

        def errDataInfo = error.ErrorDataInfo
        def businessPath = errDataInfo.BusinessPath?.text()?.trim()
        def errorSegment = errDataInfo.Part1?.text()?.trim()
        def errData = errDataInfo.ErrData?.text()?.trim()

        businessPath = businessPath ? ": ErrPath-${businessPath}" : ""
        errorSegment = errorSegment ? ": ErrSegment-${errorSegment}" : ""
        errData = errData ? ": ErrData-${errData}" : ""

        String formatted = "ErrID-${errorID}${errData}: SNIP-${errorSnip}${errorSegment}${businessPath}: ErrBrief-${errorBrief}"

        if (formatted.length() > maxFormattedLength) {
            formatted = formatted.take(maxFormattedLength)
        }

        if (idx > 0) {
            errorDetails.append("||")
        }

        errorDetails.append(formatted)
    }

    msgHeaders.put("ExtractedErrors", errorDetails.toString())

    def newMessageBody = errorDetails.toString()
    if (auditEventNumber == "3" && newMessageBody != "") {
        newMessageBody = errorDetails.toString()
    }

    if (FileLevelErrorCheck == "True") {
        def fileLevelError = "ErrID-0x810005: ErrData-${SE01Value}: SNIP-1: ErrSegment-SE*: ErrPath-SE/96: ErrBrief-The values are not equal."
        newMessageBody = newMessageBody?.trim() ? fileLevelError + "||" + newMessageBody : fileLevelError
    }

    if (newMessageBody.length() > 5000) {
        newMessageBody = newMessageBody.substring(0, 4992) + "(...)"
    }

    exchProperties['adaptorErrorMessage'] = newMessageBody
}

def auditEventNumber = exchProperties.get('auditEventNumber')
def ValidationAuditStartDateTime = exchProperties.get('ValidationAuditStartDateTime')
def ValidationAuditEndDateTime = exchProperties.get('ValidationAuditEndDateTime')
def ConversionAuditStartDateTime = exchProperties.get('ConversionAuditStartDateTime')
def ConversionAuditEndDateTime = exchProperties.get('ConversionAuditEndDateTime')

def messageBodyInputStream = message.getBodyAsSmartStream().getInputStream()

if (auditEventNumber in ["1", "8"]) {
    context.createExchangeResponse(exchProperties, "")
}

if (auditEventNumber == "2") {
    (0..1).each { i ->
        if (i == 0) {
            exchProperties.put("AdaptorStatus", "PROCESS_START")
            exchProperties.put("ProcessStageName", "EDIFECS-Validation")
            exchProperties.put("AdaptorAuditDateTime", ValidationAuditStartDateTime)
        } else {
            exchProperties.put("AdaptorStatus", "PROCESS_END")
            exchProperties.put("ProcessStageName", "EDIFECS-Validation")
            exchProperties.put("AdaptorAuditDateTime", ValidationAuditEndDateTime)
        }
        context.createExchangeResponse(exchProperties, messageBodyInputStream)
    }
} else if (auditEventNumber == "3") {
    (0..1).each { k ->
        if (k == 0) {
            exchProperties.put("AdaptorStatus", "PROCESS_START")
            exchProperties.put("ProcessStageName", "EDIFECS-Validation")
            exchProperties.put("AdaptorErrorMessage", "")
            exchProperties.put("AdaptorAuditDateTime", ValidationAuditStartDateTime)
        } else {
            exchProperties.put("AdaptorStatus", "ERROR")
            exchProperties.put("ProcessStageName", "EDIFECS-Validation")
            exchProperties.put("AdaptorErrorMessage", "Edifecs HIPAA Validation Error")
            exchProperties.put("AdaptorAuditDateTime", ValidationAuditEndDateTime)
        }
        context.createExchangeResponse(exchProperties, messageBodyInputStream)
    }
} else if (auditEventNumber == "4" || auditEventNumber == "7") {
    (0..1).each { l ->
        if (l == 0) {
            exchProperties.put("AdaptorStatus", "PROCESS_START")
            exchProperties.put("ProcessStageName", "EDIFECS-Conversion")
            exchProperties.put("AdaptorErrorMessage", "")
            exchProperties.put("AdaptorAuditDateTime", ConversionAuditStartDateTime)
        } else {
            exchProperties.put("AdaptorStatus", "ERROR")
            exchProperties.put("ProcessStageName", "EDIFECS-Conversion")
            exchProperties.put("AdaptorErrorMessage", "Edifecs Translator Error")
            exchProperties.put("AdaptorAuditDateTime", ConversionAuditEndDateTime)
        }
        context.createExchangeResponse(exchProperties, messageBodyInputStream)
    }
} else if (auditEventNumber in ["5", "6"]) {
    (0..2).each { j ->
        if (j == 0) {
            exchProperties.put("AdaptorStatus", "PROCESS_START")
            exchProperties.put("ProcessStageName", "EDIFECS-Conversion")
            exchProperties.put("AdaptorAuditDateTime", ConversionAuditStartDateTime)
        } else if (j == 1) {
            exchProperties.put("AdaptorStatus", "PROCESS_END")
            exchProperties.put("ProcessStageName", "EDIFECS-Conversion")
            exchProperties.put("AdaptorAuditDateTime", ConversionAuditEndDateTime)
        } else {
            LocalDateTime end = LocalDateTime.parse(ConversionAuditEndDateTime, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS"))
            LocalDateTime published = end.plus(Duration.ofMillis(10))
            String msgPubTime = published.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS"))

            exchProperties.put("AdaptorStatus", "MESSAGE_PUBLISHED")
            exchProperties.put("ProcessStageName", "EDIFECS")
            exchProperties.put("AdaptorAuditDateTime", msgPubTime)
        }
        context.createExchangeResponse(exchProperties, messageBodyInputStream)
    }
}
