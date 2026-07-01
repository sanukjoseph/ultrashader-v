import org.apache.commons.lang.StringUtils
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.Duration
import java.time.format.DateTimeFormatter
import java.util.Date
import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.temporal.ChronoField
import java.time.temporal.ChronoUnit

def ValidationAuditStartDateTime = '';
def ValidationAuditEndDateTime = '';
def ConversionAuditStartDateTime ='';
def ConversionAuditEndDateTime  ='';
def MesssagePublishedAuditDateTime ='';
def RecordIdentifier='';
def auditEventNumber='';

//Increment timestamps by 100 nanoseconds.
String add100NanosecondsToString(String dateTimeStr) {
    def formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSSSSSSS")
    def parsedDateTime = LocalDateTime.parse(dateTimeStr, formatter)
    def updatedDateTime = parsedDateTime.plusNanos(100)
    return updatedDateTime.format(formatter)
}
//Increment timestamps by 200 nanoseconds.
String add200NanosecondsToString(String dateTimeStr) {
    def formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSSSSSSS")
    def parsedDateTime = LocalDateTime.parse(dateTimeStr, formatter)
    def updatedDateTime = parsedDateTime.plusNanos(200)
    return updatedDateTime.format(formatter)
}

def getCurrentTimestamp() {
    def dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSSSSSSS")
    return dateFormat.format(new Date())
}
 
exchange = context.exchange
properties = exchange.properties
messages = exchange.messages
message = messages.first()
messageBodyInputStream = message.bodyAsSmartStream.inputStream
InputStreamReader isr = new InputStreamReader(messageBodyInputStream)
BufferedReader br = new BufferedReader(isr)

RecordIdentifier = properties.get('RecordIdentifier');
auditEventNumber = properties.get('auditEventNumber');

ValidationAuditStartDateTime = properties.get('ValidationAuditStartDateTime')
ConversionAuditStartDateTime = properties.get('ConversionAuditStartDateTime')



def controlnumber = properties.get('controlnumber') ?: ""
def stValues = []
String line = ""
 //Send Audit Events As Exchange
if (auditEventNumber == "1") {
    properties.put("AdaptorStatus", "ERROR")
    properties.put("ProcessStageName", "EDIFECS-Validation")
   // properties.put("adaptorErrorMessage", newMessageBody)
    properties.put("auditTime", getCurrentTimestamp())
    context.createExchangeResponse(properties, messageBodyInputStream)
} else if (auditEventNumber == "2") {
    //"PROCESS_START" for EDIFECS-Validation
    properties.put("AdaptorStatus", "PROCESS_START")
    properties.put("ProcessStageName", "EDIFECS-Validation")
	properties.put("adaptorErrorMessage", "")
    properties.put("auditTime", ValidationAuditStartDateTime)
    context.createExchangeResponse(properties, messageBodyInputStream)
 
    //"PROCESS_END" for EDIFECS-Validation
    ValidationAuditEndDateTime = add100NanosecondsToString(ValidationAuditStartDateTime)
    properties.put("AdaptorStatus", "PROCESS_END")
	properties.put("adaptorErrorMessage", "")
    properties.put("auditTime", ValidationAuditEndDateTime)
    context.createExchangeResponse(properties, messageBodyInputStream)
 
} else if (auditEventNumber == "3") {
    //"PROCESS_START" for EDIFECS-Validation
    properties.put("AdaptorStatus", "PROCESS_START")
    properties.put("ProcessStageName", "EDIFECS-Validation")
    properties.put("adaptorErrorMessage", "")
    properties.put("auditTime", ValidationAuditStartDateTime)
    context.createExchangeResponse(properties, messageBodyInputStream)
 
    //"ERROR" for EDIFECS-Validation
    ValidationAuditEndDateTime = add100NanosecondsToString(ValidationAuditStartDateTime)
    properties.put("AdaptorStatus", "ERROR")
    properties.put("adaptorErrorMessage", newMessageBody)
    properties.put("auditTime", ValidationAuditEndDateTime)
    context.createExchangeResponse(properties, messageBodyInputStream)
}
 
else if (auditEventNumber == "4") {
    //"PROCESS_START" for EDIFECS-Conversion
	ConversionAuditStartDateTime = add200NanosecondsToString(ConversionAuditStartDateTime) 
    properties.put("AdaptorStatus", "PROCESS_START")
    properties.put("ProcessStageName", "EDIFECS-Conversion")
	properties.put("adaptorErrorMessage", "")
    properties.put("auditTime", ConversionAuditStartDateTime)
    context.createExchangeResponse(properties, messageBodyInputStream)
 
    //"PROCESS_END" for EDIFECS-Conversion
    ConversionAuditEndDateTime = add200NanosecondsToString(ConversionAuditStartDateTime)
    properties.put("AdaptorStatus", "PROCESS_END")
	properties.put("adaptorErrorMessage", "")
    properties.put("auditTime", ConversionAuditEndDateTime)
    context.createExchangeResponse(properties, messageBodyInputStream)
 

    //MESSAGE PUBLISHED
    MesssagePublishedAuditDateTime = add200NanosecondsToString(ConversionAuditEndDateTime)
	properties.put("AdaptorStatus","MESSAGE_PUBLISHED");
	properties.put("ProcessStageName","EDIFECS");
	properties.put("adaptorErrorMessage", "")
	properties.put("auditTime",MesssagePublishedAuditDateTime);
	context.createExchangeResponse(properties, messageBodyInputStream)
}
 
else if (auditEventNumber == "5") {
    for (int j = 0; j < 2; j++) {
        if (j == 0) {
            // Log "PROCESS_START" for EDIFECS-Conversion
            properties.put("AdaptorStatus", "PROCESS_START")
            properties.put("ProcessStageName", "EDIFECS-Conversion")
            properties.put("adaptorErrorMessage", "")
            properties.put("auditTime", ConversionAuditStartDateTime)
            context.createExchangeResponse(properties, messageBodyInputStream)
        } else {
            // Log "ERROR" for EDIFECS-Conversion
			ConversionAuditEndDateTime = add200NanosecondsToString(ConversionAuditStartDateTime)
            properties.put("AdaptorStatus", "ERROR")
            properties.put("ProcessStageName", "EDIFECS-Conversion")
            properties.put("adaptorErrorMessage", newMessageBody)
            properties.put("auditTime", ConversionAuditEndDateTime)
            context.createExchangeResponse(properties, messageBodyInputStream)
        }
    }
}