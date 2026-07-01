import groovy.util.XmlSlurper
import java.io.*

exchange = context.exchange
exchProperties = exchange.properties
messages = exchange.messages
message = messages[0]
msgHeaders = message.headers

def AuditEventCount = exchProperties.get('AuditEventCount')
def newMessageBody = ''
def messageBodyInputStream = null

// if(AuditEventCount =="2")
if (AuditEventCount in ["2", "4"]) {

    messageBodyInputStream = message.getBodyAsSmartStream().getInputStream()
    def maxFormattedLength = 298

    // Parse XML
    def root = new XmlSlurper().parse(messageBodyInputStream)

    StringBuilder errorDetails = new StringBuilder()
    def errors = root.'**'.findAll { it.name() == 'Error' }

    // Iterate and format each error (excluding description)
    errors.eachWithIndex { error, idx ->

        def errorBrief = error.Brief?.text()?.trim()
        def errorID = error.@ID?.toString()
        def errorCategory = error.@Category?.toString()
        def errorSeverity = error.@Severity?.toString()
        def errorSnip = error.@SNIP?.toString()

        // Nested info inside ErrorDataInfo
        def errDataInfo = error.ErrorDataInfo

        def businessPath = errDataInfo.BusinessPath?.text()?.trim()
        if (businessPath != "") {
            businessPath = ": " + "ErrPath-" + "${businessPath}"
        } else {
            businessPath = ""
        }

        def errorSegment = errDataInfo.Part1?.text()?.trim()
        if (errorSegment != "") {
            errorSegment = ": " + "ErrSegment-" + "${errorSegment}"
        } else {
            errorSegment = ""
        }

        def errData = errDataInfo.ErrData?.text()?.trim()
        if (errData != "") {
            errData = ": " + "ErrData-" + "${errData}"
        } else {
            errData = ""
        }

        String formatted =
                "ErrID-${errorID}${errData}: SNIP-${errorSnip}${errorSegment}${businessPath}: ErrBrief-${errorBrief}"

        // Truncate if longer than allowed
        if (formatted.length() > maxFormattedLength) {
            formatted = formatted.take(maxFormattedLength)
        }

        // Append with || separator if not first
        if (idx > 0) {
            errorDetails.append("||")
        }

        errorDetails.append(formatted)
    }

    // Add to headers
    msgHeaders.put("ExtractedErrors", errorDetails.toString())

    def AdaptorErrorMessage = ''
    newMessageBody = errorDetails.toString()
}

// Length check
if (newMessageBody && newMessageBody.length() > 5000) {
    newMessageBody = newMessageBody.substring(0, 4992) + "(...)"
}

// Set exchange property
exchProperties['adaptorErrorMessage'] = newMessageBody
exchProperties.put('ProcessMessage', newMessageBody)

context.createExchangeResponse(exchProperties, messageBodyInputStream)