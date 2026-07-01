import com.edifecs.etools.xeserver.proxy.ProxyMessage;
import com.edifecs.etools.commons.io.SmartStream;
import groovy.util.slurpersupport.NodeChild;
import java.io.*;
import groovy.util.XmlSlurper
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




exchange = context.exchange;
exchProperties = exchange.properties;
messages = exchange.messages;
message = messages[0];
msgHeaders = message.headers;

//def ValidationAuditStartDateTime='';
//def ValidationAuditEndDateTime='';


def SeCountErrorCheck = exchProperties.get('SeCountError')
def SeValue = exchProperties.get('SeValue')
def ValidationAuditStartDateTime = '';
def ValidationAuditEndDateTime = '';
def ConversionAuditStartDateTime ='';
def ConversionAuditEndDateTime  ='';
def MesssagePublishedAuditDateTime ='';
def RecordIdentifier='';
def auditEventNumber='';

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

auditEventNumber = exchProperties.get('auditEventNumber')
//if(auditEventNumber =="3")
if (auditEventNumber in ["1", "3", "5"]) 
{
	messageBodyInputStream = message.getBodyAsSmartStream().getInputStream()
def maxFormattedLength = 298;

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
    if(businessPath!="")
		{
			businessPath=": "+"ErrPath-"+"${businessPath}";
		}
	else{
		  businessPath="";
		}
    def errorSegment = errDataInfo.Part1?.text()?.trim()
    if(errorSegment !="")
		{
			errorSegment=": "+"ErrSegment-"+"${errorSegment}";
		}
	else
       {
			errorSegment="";
	   }
    def errData = errDataInfo.ErrData?.text()?.trim()
    if(errData!=""){
    errData=": "+"ErrData-"+"${errData}";
    }
    else{
    errData=="";
    }
    
    String formatted = "ErrID-${errorID}${errData}: SNIP-${errorSnip}${errorSegment}${businessPath}: ErrBrief-${errorBrief}"
 
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

// Optional response creation
// ProxyMessage newMessage = context.createNewMessage(errorDetails.toString(), msgHeaders)
// context.createExchangeResponse(msgHeaders, newMessage)


			def AdaptorErrorMessage = '';
//println ("beforecondition: " + newMessageBody)			

             newMessageBody = errorDetails.toString();
			 //println ("beforecondition: " + newMessageBody)	
	if (auditEventNumber == "3"){			 
		if(newMessageBody!="")
		{
		newMessageBody=errorDetails;
		}
		else{
		newMessageBody="ErrID-0xc000005: SNIP-7: ErrBrief-An error was reported from a JavaScript rule. ErrMsg-All Transaction(s)of this family are rejected due to SNIP Validation Error";
		}
	}
	if(SeCountErrorCheck=="True")
	{
		if(newMessageBody!=""){
		newMessageBody="ErrID-0x810005: ErrData-${SeValue}: ErrSNIP-1: ErrSegment-SE*: ErrPath-SE/96: ErrBrief-The values are not equal.||"+newMessageBody;
	}
	else{
		newMessageBody="ErrID-0x810005: ErrData-${SeValue}: ErrSNIP-1: ErrSegment-SE*: ErrPath-SE/96: ErrBrief-The values are not equal.";
	}
		
	}
if (newMessageBody.length() > 5000) {
		// Trim the string to 5000 characters and add "(...)" at the end
		newMessageBody = newMessageBody.substring(0, 4992) + "(...)"
																													
		}
		
		
		
				
			exchProperties['adaptorErrorMessage'] = newMessageBody;

}

if ((auditEventNumber >= "1") && (auditEventNumber <= "5")) {
																							
// Evaluate the second script file
//println ("started executing second script")
//AdaptorErrorMessage=properties.get('AdaptorErrorMessage')
//evaluate(new File("C:/Edifecs/Core/ArtifactsRepository/Enrollment/IBEnrollmentCommon/Groovy/P_IB_834_AuditJson.groovy"))	
//println ("finished executing second script")




//Increment timestamps by 100 nanoseconds.


//def getCurrentTimestamp() {
   // def dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSSSSSSS")
    //return dateFormat.format(new Date())
//}
 
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
	properties.put("ProcessStageName", "EDIFECS-Validation")
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
	properties.put("ProcessStageName", "EDIFECS-Conversion")
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
}


			
			

