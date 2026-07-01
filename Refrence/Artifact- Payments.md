<!-- SCHEMA DICTIONARY
<CP> = <ConnectionPoint>
<CPs> = <ConnectionPoints>
<P> = <Property>
<Ps> = <Properties>
<F> = <Function>
<Fs> = <Functions>
<C> = <Connector>
<Cs> = <Connectors>
<ES> = <ExternalStorage>
<Vs> = <Variables>
<Ls> = <Links>
C=Category, N=Name, V=Value, T=Template, P=Pos, Pth=Path, S=Source, Tgt=Target, O=OriginCP
C="R" = Category="Runtime", C="S" = Category="Settings"
N="RV" = Name="ResetValue", N="v" = Name="value", N="r" = Name="result", N="a" = Name="activation"
-->
<!-- <Aliases><Alias ID="{S3000}" V="/Record(ID = 'Record Type 2')"/><Alias ID="{S3001}" V="/Record(ID = 'Record Type 3')"/><Alias ID="{S3002}" V="/Loop(ID = '2110')/Segment(ID = 'SVC')"/><Alias ID="{S3003}" V="/Loop(ID = '2110')/Segment(ID = 'CAS')"/><Alias ID="{S3004}" V="/element(name = 'criteria')/complexType(name = 'paymentStatusSearchCriteria')/sequence"/><Alias ID="{S3005}" V="/element(name = 'additionalPaymentInformation')/complexType(name = 'additionalPaymentInformation')/sequence"/><Alias ID="{S3006}" V="/element(name = 'customParameters')/complexType(name = 'customParameters')/sequence"/><Alias ID="{S3007}" V="/Record(ID = 'Record Type 4')"/><Alias ID="{S3008}" V="/Loop(ID = '1000A')/Segment(ID = 'PER')[2]"/><Alias ID="{S3009}" V="/Loop(ID = '1000A')/Segment(ID = 'PER')"/><Alias ID="{S3010}" V="/Level(Name = 'Group')"/><Alias ID="{S3011}" V="/Segment(ID = 'NM1')[4]"/><Alias ID="{S3012}" V="/Segment(ID = 'NM1')[3]"/><Alias ID="{S3013}" V="/Segment(ID = 'NM1')[2]"/><Alias ID="{S3014}" V="/Loop(ID = '1000B')/Segment(ID = 'N1')"/><Alias ID="{S3015}" V="/InternalProperties/Field(Name = 'recordIdentifierFromSource')"/><Alias ID="{S3016}" V="/Loop(ID = '1000B')/Segment(ID = 'N4')"/><Alias ID="{S3017}" V="/Loop(ID = '1000A')/Segment(ID = 'N4')"/><Alias ID="{S3018}" V="/InternalProperties/Field(Name = 'inputArchiveFileName')"/><Alias ID="{S3019}" V="/InternalProperties/Field(Name = 'sourceTypeIdentifier')"/><Alias ID="{S3020}" V="/InternalProperties/Field(Name = 'XMLfileCreationDate')"/><Alias ID="{S3021}" V="/InternalProperties/Field(Name = 'totalTransactions')"/><Alias ID="{S3022}" V="/InternalProperties/Field(Name = 'recordIdentifier')"/><Alias ID="{S1000}" V="/element(name = 'header')/complexType(name = 'header')/sequence"/><Alias ID="{S1001}" V="/element(name = 'updatePaymentStatus')/complexType(name = 'updatePaymentStatus')/sequence"/><Alias ID="{P1}" V="/Transaction(ID = '835')/Loop(ID = '2000')/Loop(ID = '2100')"/><Alias ID="{P2}" V="/schema/element(name = 'updatePaymentStatusIBRequestRoot')/complexType/sequence/element(name = 'updatePaymentStatusRecord')/complexType(name = 'updatePaymentStatusRecord')/sequence"/><Alias ID="{P3}" V="/Transaction(ID = '835')"/><Alias ID="{P4}" V="/Message(ID = '835')/Group Record(ID = 'ClaimLevel')"/><Alias ID="{P5}" V="/schema/element(name = 'updatePaymentStatusIBRequestRoot')/complexType/sequence"/><Alias ID="{P6}" V="/InternalProperties/Level(Name = 'Interchange')"/><Alias ID="{P7}" V="/Message(ID = '835')/Record(ID = 'Record Type 1')"/><Alias ID="{P8}" V="/Message(ID = 'CheckReconciliation')/Record(ID = 'Record')"/><Alias ID="{P9}" V="/Message(ID = 'PFF')/Record(ID = 'Record Type 001')"/><Alias ID="{P10}" V="/Message(ID = 'PFF')/Record(ID = 'Record Type 002')"/></Aliases> -->
assets\
└── ArtifactsRepository
    └── Payments
        ├── Groovy
        │   ├── P_OB_835_API_Token_Reprocess.txt
        │   ├── P_OB_835_ControlReportGroovy.groovy
        │   ├── P_OB_835_ErrorCaptureGroovy.groovy
        │   └── P_OB_835_PulseReportGroovy.groovy
        ├── Guideline
        ├── IBPayments
        │   ├── IBPFFPayments
        │   │   ├── IBPaymentsCheckReconciliation
        │   │   │   ├── Groovy
        │   │   │   │   └── IB_Payments_CheckRecon_Groovy.txt
        │   │   │   ├── Guideline
        │   │   │   ├── Map
        │   │   │   │   └── IB_Payments_CheckRecon_PFF_to_XML.ems
        │   │   │   └── ParserSchema
        │   │   ├── IBPaymentsCommon
        │   │   │   ├── Groovy
        │   │   │   │   └── IB_Payments_Error_Capture_Groovy.txt
        │   │   │   ├── Guideline
        │   │   │   ├── SplitRule
        │   │   │   │   └── IB_Payments_SplitRule.xml
        │   │   │   └── Velocity
        │   │   │       └── IB_Payments_Audit_Template.vtmpl
        │   │   └── IBPaymentsProviderSettlement
        │   │       ├── Groovy
        │   │       │   └── IB_Payments_Provider_Settlement_Groovy.txt
        │   │       ├── Guideline
        │   │       ├── Map
        │   │       │   └── IB_Payments_ProviderSettlement_PFF_to_XML.ems
        │   │       └── ParserSchema
        │   └── IBZelisPayments
        │       └── IBZelisPaymentsCommon
        │           ├── Groovy
        │           │   ├── IB_Zelis_Payments_AuditSplit_Groovy.groovy
        │           │   └── IB_Zelis_Payments_JsonValidation_Groovy.groovy
        │           ├── Guideline
        │           ├── Severity
        │           │   └── IB_Zelis_Payment_Severity.esf
        │           ├── SplitRule
        │           │   └── IB_Zelis_Payments_SplitRule.xml
        │           └── Velocity
        │               ├── IB_Zelis_Payments_FileLevel_Template.vtmpl
        │               └── IB_Zelis_Payments_RecordLevel_Template.vtmpl
        ├── Map
        │   └── P_OB_835_DFF_to_EDI.ems
        ├── ParserSchema
        └── Velocity
            ├── Blank.vtmpl
            └── OB_835_AuditVelocity.vtmpl

<file path="ArtifactsRepository/Payments/Groovy/P_OB_835_API_Token_Reprocess.txt">
import com.edifecs.etools.xeserver.proxy.ProxyMessage
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
// Assuming exchange, context, and message headers are already initialized
exchange = context.exchange
messages = exchange.messages
message = messages[0]
msgHeaders = message.headers
// Get the current date and time in the desired format yyyyMMddHHmm
def dateFormat = new SimpleDateFormat("yyyyMMddHHmm")
def currentDate = new Date()
def formattedCurrentDate = dateFormat.format(currentDate)
// Get the current time as a Calendar instance
def calendar = Calendar.getInstance()
calendar.setTime(currentDate)
// Subtract 1, 2, and 3 minutes
calendar.add(Calendar.MINUTE, -1)
def oneMinuteBefore = dateFormat.format(calendar.time)
calendar.add(Calendar.MINUTE, -1)  // Subtract another minute
def twoMinutesBefore = dateFormat.format(calendar.time)
calendar.add(Calendar.MINUTE, -1)  // Subtract another minute
def threeMinutesBefore = dateFormat.format(calendar.time)
// Create the msgHeaders with the calculated properties
def msgHeaders = [:]
msgHeaders['currentDateTime'] = formattedCurrentDate
msgHeaders['oneMinuteBefore'] = oneMinuteBefore
msgHeaders['twoMinutesBefore'] = twoMinutesBefore
msgHeaders['threeMinutesBefore'] = threeMinutesBefore
// If you don't have an actual message body, you can still send an empty message
def newMessageBody = ""  // No message body content in this case
// Create a new message (you can create an empty message if needed)
ProxyMessage newMessage = context.createNewMessage(newMessageBody, msgHeaders)
// Send the response with the new message and headers
context.createExchangeResponse(msgHeaders, newMessage)
</file>
<file path="ArtifactsRepository/Payments/Groovy/P_OB_835_ControlReportGroovy.groovy">
// Importing the ProxyMessage class from the com.edifecs.etools.xeserver.proxy package
import com.edifecs.etools.xeserver.proxy.ProxyMessage
// Importing the SmartStream class from the com.edifecs.etools.commons.io package
import com.edifecs.etools.commons.io.SmartStream
// Importing all classes from the java.io package
import java.io.*
import java.math.BigDecimal
exchange = context.exchange
exchProperties = exchange.properties
fileNameProperty = exchange.properties
messages = exchange.messages
message = messages[0]
msgHeaders = message.headers
String OFN = fileNameProperty.get("835_X12FileName")
String Filename;
print OFN
if(OFN.contains('F11'))
{
Filename = OFN.replace('_F11_','_');
}
fileNameProperty.put("Filename",Filename)
exchProperties.each { k, v -> msgHeaders.put(k, v) }
messageBodyInputStream = message.getBodyAsSmartStream().getInputStream()
def root = new XmlSlurper().parse(messageBodyInputStream) // Reads the message body as an XML stream and parses it using XmlSlurper.
def groupDetailsMap = [:] // Declare a map to store unique groupID, its counter, groupName, and sum of ClaimPaymentAmount
def uniqueGroupIDs = new HashSet<String>() // Store unique group IDs
def uniqueTransactionGroupIDs = new HashSet<String>()
def ListOfGroupIds = [:] // Map to set key as group ID and set BPR checks as value
def UniqueClaimIDmap = [:]
def Total = 0 // Store sum of clp04 amount
def uniquecounter = 0
def uniquedifftransac = 0
def totalPayment
def ProviderAdjustmentL6 = 0 // Store Sum of PLB04 amounts for multiple checks in the payment run
def ProviderAdjustmentWO = 0
def ProviderAdjustmentOB = 0
def ProviderAdjustmente3 = 0
def ProviderAdjustmentFB = 0
def claimID;
def size;
def totalclaimcount=0;
def counter = 0 // Unique id for each entry in map
def formatCurrency(def value)
{
if (value <= 0)
{
return String.format('%.2f', value.abs())
}
else
{
return "-\$" + String.format('%.2f', value)
}
}
root.each { DataReportNode ->
ProviderAdjustmentL6 = DataReportNode.Fields.Field.find { it.@Name.text() == 'ProviderAdjustmentL6' }?.text()?.trim()
ProviderAdjustmentWO = DataReportNode.Fields.Field.find { it.@Name.text() == 'ProviderAdjustmentWO' }?.text()?.trim()
ProviderAdjustmentOB = DataReportNode.Fields.Field.find { it.@Name.text() == 'ProviderAdjustmentOB' }?.text()?.trim()
ProviderAdjustmentE3 = DataReportNode.Fields.Field.find { it.@Name.text() == 'ProviderAdjustmentE3' }?.text()?.trim()
ProviderAdjustmentFB = DataReportNode.Fields.Field.find { it.@Name.text() == 'ProviderAdjustmentFB' }?.text()?.trim()
root.GroupNode.each { interchangeNode ->
def transactionIdMain = 0;
def transactionId = 0;
interchangeNode.GroupNode.each { groupNode ->
groupNode.GroupNode.each { transactionNode ->
transactionId++;
uniqueTransactionGroupIDs.clear() // reset the set for each transaction
transactionNode.GroupNode.each { providerNode ->
providerNode.GroupNode.each { claimNode ->
if (claimNode.@Name == 'Claim') {
def groupID = claimNode.Fields.Field.find { it.@Name.text() == 'groupID' }?.text()?.trim()
def groupName = claimNode.Fields.Field.find { it.@Name.text() == 'GroupName' }?.text()?.trim()
claimID = claimNode.Fields.Field.find { it.@Name.text() == 'claimID' }?.text()?.trim()
def claimPaymentAmount = claimNode.Fields.Field.find { it.@Name.text() == 'ClaimPaymentAmount' }?.text()?.toDouble() ?: 0.0
if (groupID == "")
{
groupID = "GroupID Not Available"
groupName = "Legal Entity Not Available"
// groupIDforcount = "GroupID Not Available"
}
if(!UniqueClaimIDmap.containsKey(groupID)){
UniqueClaimIDmap.put(groupID, [])
}
UniqueClaimIDmap[groupID] << claimID
if (groupID && !uniqueGroupIDs.contains(groupID) && !uniqueTransactionGroupIDs.contains(groupID))
{
uniqueGroupIDs.add(groupID)
counter++
ListOfGroupIds[groupID] = 1
uniqueTransactionGroupIDs.add(groupID) // Mark the groupID as encountered in this transaction
uniquecounter++
} else
{
if (transactionId != transactionIdMain)
{
// Increment ListOfGroupIds[groupID] only if it is not incremented in this transaction
if (!uniqueTransactionGroupIDs.contains(groupID))
{
ListOfGroupIds[groupID] += 1
uniqueTransactionGroupIDs.add(groupID) // Mark the groupID as incremented in this transaction
uniquedifftransac++
}
}
}
//println("inside"+ListOfGroupIds[groupID])
totalPayment = uniquecounter + uniquedifftransac
details = groupDetailsMap.get(groupID) ?: [counter: counter, groupName: groupName, sumAmount: 0.0, totalClaims: 0, claimID: claimID ]
details.sumAmount += new BigDecimal(claimPaymentAmount.toString()).setScale(2, BigDecimal.ROUND_HALF_UP)
groupDetailsMap.put(groupID, details)
Total += claimPaymentAmount // Total paid of all entities
}
}
}
}
transactionIdMain++;
}
}
}
// println("Outside"+ListOfGroupIds[groupID])
// groupDetailsMap with the size of unique claim IDs for each group ID
UniqueClaimIDmap.each { groupID, claimIDs ->
def details = groupDetailsMap.get(groupID)
if (details) {
details.claimID = claimIDs.unique().size() // Update claimID with the size of unique claim IDs
totalclaimcount += details.claimID
groupDetailsMap.put(groupID, details)
}
}
def ControlReportBuilder = new StringBuilder() // StringBuilder to store each record value
ControlReportBuilder.append("S/No")
ControlReportBuilder.append(",")
ControlReportBuilder.append("ECHO Group ID")
ControlReportBuilder.append(",")
ControlReportBuilder.append("Legal Entity")
ControlReportBuilder.append(",")
ControlReportBuilder.append("Total Payments")
ControlReportBuilder.append(",")
ControlReportBuilder.append("Total Claims")
ControlReportBuilder.append(",")
ControlReportBuilder.append("Total Amount")
ControlReportBuilder.append("\r\n")
groupDetailsMap.each { groupID, details ->
ControlReportBuilder.append("${details.counter},${groupID},${details.groupName},${ListOfGroupIds[groupID]},${details.claimID},\$${details.sumAmount}\n")
}
def totalPaid = ("${Total}")
def totalPaidmod = totalPaid.toDouble()
def Totalclaimcount = ("${totalclaimcount}")
def TotalPayable = new BigDecimal(totalPaidmod.toString()).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue() // Round the total value
def formattedTotalPayable = String.format("%.2f", TotalPayable)
ControlReportBuilder.append(",").append(",").append("Total Payable").append("\t").append(",").append(",").append(",").append("\$${formattedTotalPayable}\n")
// Interest Amount
if (ProviderAdjustmentL6 == "")
{
ProviderAdjustmentL6 = 0
}
unsignedProviderAdjustmentL6 = new BigDecimal(ProviderAdjustmentL6.toString()).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue()
ControlReportBuilder.append(",").append(",").append("Interest Amount").append(",").append(",").append(",").append(formatCurrency(unsignedProviderAdjustmentL6)).append("\n")
def providerAdjusL6 = ("${ProviderAdjustmentL6}")
def providerAdjustmentL6mod = 0
if (providerAdjusL6 != "")
{
providerAdjustmentL6mod = providerAdjusL6.toDouble() // Covert to number
}
// ManualPayable
if (ProviderAdjustmentOB == "")
{
ProviderAdjustmentOB = 0
}
def unsignedProviderAdjustmentOB = new BigDecimal(ProviderAdjustmentOB.toString()).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue()
ControlReportBuilder.append(",").append(",").append("Manual Payable").append("\t").append(",").append(",").append(",").append(formatCurrency(unsignedProviderAdjustmentOB)).append("\n")
def providerAdjusOB = ("${ProviderAdjustmentOB}")
def providerAdjustmentOBmod = 0
if (providerAdjusOB != "")
{
providerAdjustmentOBmod = providerAdjusOB.toDouble() // Covert to number
}
// WithholdAmount
if (ProviderAdjustmentE3 == "")
{
ProviderAdjustmentE3 = 0
}
def unsignedProviderAdjustmentE3 = new BigDecimal(ProviderAdjustmentE3.toString()).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue()
ControlReportBuilder.append(",").append(",").append("Withhold Amount").append("\t").append(",").append(",").append(",").append(formatCurrency(unsignedProviderAdjustmentE3)).append("\n")
def providerAdjusE3 = ("${ProviderAdjustmentE3}")
def providerAdjustmentE3mod = 0
if (providerAdjusE3 != "")
{
providerAdjustmentE3mod = providerAdjusE3.toDouble() // Covert to number
}
// ProviderRecoupments
if (ProviderAdjustmentWO == "")
{
ProviderAdjustmentWO = 0
}
def unsignedProviderAdjustmentWO = new BigDecimal(ProviderAdjustmentWO.toString()).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue()
ControlReportBuilder.append(",").append(",").append("Provider Recoupments").append(",").append(",").append(",").append(formatCurrency(unsignedProviderAdjustmentWO)).append("\n")
def providerAdjusWO = ("${ProviderAdjustmentWO}")
def providerAdjustmentWOmod = 0
if (providerAdjusWO != "") {
providerAdjustmentWOmod = providerAdjusWO.toDouble() // Covert to number
}
// forwardBalance
if (ProviderAdjustmentFB == "")
{
ProviderAdjustmentFB = 0
}
def unsignedProviderAdjustmentFB = new BigDecimal(ProviderAdjustmentFB.toString()).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue()
ControlReportBuilder.append(",").append(",").append("Forward Balance").append(",").append(",").append(",").append(formatCurrency(unsignedProviderAdjustmentFB)).append("\n")
def providerAdjusFB = ("${ProviderAdjustmentFB}")
def providerAdjustmentFBmod = 0
if (providerAdjusFB != "")
{
providerAdjustmentFBmod = providerAdjusFB.toDouble() // Covert to number
}
// Total Amount
def Totals = 0
Totals = ((totalPaidmod) +(-1*((unsignedProviderAdjustmentL6) + (unsignedProviderAdjustmentOB)  + (unsignedProviderAdjustmentFB) + (unsignedProviderAdjustmentWO)+(unsignedProviderAdjustmentE3)))) // Report total
def Totalsnew = new BigDecimal(Totals.toString()).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue() // Round the total value
//Totalsnew = Double.parseFloat(Totalsnew);
def formattedTotalsnew = String.format("%.2f", Totalsnew)
ControlReportBuilder.append(",").append(",").append("Total Amount").append(",").append("${totalPayment}").append(",").append("${Totalclaimcount}").append(",").append("\$${formattedTotalsnew}\n")
// Convert the contents of ControlReportBuilder to a string
def newMessageBody = ControlReportBuilder.toString();
ProxyMessage newMessage = context.createNewMessage(newMessageBody, message.getHeaders());
context.createExchangeResponse(msgHeaders, newMessage);
</file>
<file path="ArtifactsRepository/Payments/Groovy/P_OB_835_ErrorCaptureGroovy.groovy">
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
</file>
<file path="ArtifactsRepository/Payments/Groovy/P_OB_835_PulseReportGroovy.groovy">
import com.edifecs.etools.xeserver.proxy.ProxyMessage;
import com.edifecs.etools.commons.io.SmartStream;
import groovy.util.slurpersupport.NodeChild;
import java.io.*;
exchange = context.exchange;
exchProperties = exchange.properties;
messages = exchange.messages;
message = messages[0];
msgHeaders = message.headers;
exchProperties.each{ k, v -> msgHeaders.put(k, v) }
messageBodyInputStream = message.getBodyAsSmartStream().getInputStream();
def root = new XmlSlurper().parse(messageBodyInputStream);
StringBuilder errorBuilder = new StringBuilder();
def transactionSetControlNumber;
def groupSnipCategory;
def groupCoverageSnip;
def groupErrorID;
def groupErrorBrief;
def groupErrorMsg;
def interchangeSnipCategory;
def interchangeCoverageSnip;
def interchangeErrorID='';
def dataReportSnipCategory;
def dataReporCoverageSnip;
def interchangeErrorBrief;
def interchangeErrorMsg;
def dataReportErrorBrief;
def dataReportErrorMsg;
def dataReportErrorID;
StringBuilder fileLevelErrors;
StringBuilder transactionErrors;
StringBuilder providerErrors;
StringBuilder claimErrors;
List snipList;
List snipListFile;
List rejectedMemberIDList;
List memberFoundLDNS;
List maintenanceTypeCode
def TraceNumber = '';
//def EDIFileName = '';
def ediFileId = '';
//def InputFileName = '';
def TotalPaymentAmount = '';
def PatientLastName ='';
def PatientMiddleName ='';
def PatientFirstName ='';
def PatientControlNumber='';
def ClaimHCCId = '';
//def TimeStamp = '';
def CheckDate='';
def SendDate='';
println("EDIFileName = " + EDIFileName);
println("InputFileName = " + InputFileName);
println("TimeStamp = " + TimeStamp);
//println("PatientLastName = " + PatientLastName)
//println("PatientMiddleName = " + PatientMiddleName);
//println("PatientFirstName = " + PatientFirstName);
root.each { DataReportNode ->
int dataReportErrorcount= 0;
def EntireDocumentErrorTotal='';
fileLevelErrorIDMap = new HashMap<String, String>();
snipListFile = new ArrayList();
DataReportNode.Fields.Field.each { DataReportField ->
fileLevelErrors = new StringBuilder();
String entireDocumentField = DataReportField.@Name;
if (entireDocumentField == "InputFileName") {
InputFileName = DataReportField.text();
}
if (entireDocumentField == "EDIFileName") {
EDIFileName = DataReportField.text();
}
if (entireDocumentField == "ediFileId") {
ediFileId = DataReportField.text();
}
if (entireDocumentField == "TimeStamp") {
TimeStamp = DataReportField.text();
}
if (entireDocumentField == "CheckDate") {
CheckDate = DataReportField.text();
}
if (entireDocumentField == "SendDate") {
SendDate = DataReportField.text();
}
}
for(NodeChild error: DataReportNode.Errors.Error)
{
//DataReportNode.Errors.Error.each { error ->
dataReportErrorBrief = error.Brief.text().toString();
dataReportErrorMsg = error.Msg.text().toString();
dataReportSnipCategory = error.@Category;
dataReportErrorID = error.@ID;
if(dataReportSnipCategory == 'Rejecting')
{
dataReporCoverageSnip = error.@SNIP.text().toString();
if(!snipListFile.contains(dataReporCoverageSnip))
{
snipListFile.add(dataReporCoverageSnip);
}
dataReportErrorcount = dataReportErrorcount + 1;
String dataReportErrorcounter = Integer.toString(dataReportErrorcount);
fileLevelErrors.append("EntireDocumentError"+"${dataReportErrorcounter}"+" " + "${dataReportErrorBrief}" + "${dataReportErrorMsg}");
def keyValueED = "EntireDocument"+dataReportErrorcounter;
fileLevelErrorIDMap.put(keyValueED,dataReportErrorID);
break;
}
}
DataReportNode.ErrorStatistics.each { errorStatistics ->
EntireDocumentErrorTotal = errorStatistics.ErrorTotal.text().toString();
}
root.GroupNode.each { InterchangeNode ->
int interchangeErrorcount =0;
for(NodeChild error: InterchangeNode.Errors.Error)
{
//InterchangeNode.Errors.Error.each { error ->
interchangeErrorBrief = error.Brief.text().toString();
interchangeErrorMsg = error.Msg.text().toString();
interchangeSnipCategory = error.@Category;
interchangeErrorID = error.@ID;
if(interchangeSnipCategory == 'Rejecting')
{
interchangeCoverageSnip = error.@SNIP.text().toString();
if(!snipListFile.contains(interchangeCoverageSnip))
{
snipListFile.add(interchangeCoverageSnip);
}
interchangeErrorcount = interchangeErrorcount + 1;
String interchangeErrorcounter = Integer.toString(interchangeErrorcount);
fileLevelErrors.append("InterchangeGroupError " + "${interchangeErrorcounter}" + " " + "${interchangeErrorMsg}");
def keyValueInterchange = "Interchange"+interchangeErrorcounter;
fileLevelErrorIDMap.put(keyValueInterchange,interchangeErrorID);
break;
}
}
InterchangeNode.GroupNode.each { GroupNode ->
int groupErrorcount= 0;
for(NodeChild error: GroupNode.Errors.Error)
{
//GroupNode.Errors.Error.each { error ->
groupErrorBrief = error.Brief.text().toString();
groupErrorMsg = error.Msg.text().toString();
groupSnipCategory = error.@Category;
groupErrorID = error.@ID;
if(groupSnipCategory == 'Rejecting')
{
groupCoverageSnip = error.@SNIP.text().toString();
if(!snipListFile.contains(groupCoverageSnip))
{
snipListFile.add(groupCoverageSnip);
}
groupErrorcount = groupErrorcount + 1;
String groupErrorcounter = Integer.toString(groupErrorcount);
fileLevelErrors.append("FunctionalGroupError " + "${groupErrorcounter}" + " " + "${groupErrorMsg}");
def keyValueGroup = "Group"+groupErrorcounter;
fileLevelErrorIDMap.put(keyValueGroup,groupErrorID);
break;
}
}
if(fileLevelErrors.size() > 0)
{
//println("inside if loop"+fileLevelErrors.toString());
errorBuilder.append("Edifecs");
errorBuilder.append(",");
errorBuilder.append("Provider");
errorBuilder.append(",");
errorBuilder.append(EDIFileName);
errorBuilder.append(",");
errorBuilder.append(InputFileName);
errorBuilder.append(",");
errorBuilder.append("Daily");
errorBuilder.append(",");
errorBuilder.append(TraceNumber);
errorBuilder.append(",");
errorBuilder.append(CheckDate);
errorBuilder.append(",");
errorBuilder.append(TotalPaymentAmount);
errorBuilder.append(",");
errorBuilder.append(ClaimHCCId);
errorBuilder.append(",");
errorBuilder.append(PatientControlNumber);
errorBuilder.append(",");
errorBuilder.append("${PatientLastName}" + " " + "${PatientFirstName}" +" " + "${PatientMiddleName}");
errorBuilder.append(",");
errorBuilder.append("PNC");
errorBuilder.append(",");
if((fileLevelErrorIDMap.size()>0)  || (fileLevelErrors.toString() != ''))
{
errorBuilder.append("R").append(',');
}
else
{
errorBuilder.append("A").append(',');
}
for (Map.Entry<String,String> entry : fileLevelErrorIDMap.entrySet()) {
//String stateIDMap = entry.getKey();
String fileLevelErrorIDFromMap = entry.getValue();
//if(memberID == rejectedMemberIDList[i]){
if(fileLevelErrorIDMap.size() == 1) errorBuilder.append(fileLevelErrorIDFromMap);
else errorBuilder.append(";").append(fileLevelErrorIDFromMap);
//}
}
errorBuilder.append(",");
errorBuilder.append(fileLevelErrors.toString())
errorBuilder.append(",");
//errorBuilder.append(EntireDocumentErrorTotal).append(',');
errorBuilder.append();
errorBuilder.append(",");
errorBuilder.append(",");
errorBuilder.append(",");
errorBuilder.append(",");
errorBuilder.append(",");
if((fileLevelErrors == "") && (transactionErrors == "")){
errorBuilder.append(SendDate);
}
else if ((fileLevelErrors != "") && (dataReportSnipCategory == 'Rejecting')){
errorBuilder.append(SendDate);
}
else errorBuilder.append(SendDate);
errorBuilder.append(",");
errorBuilder.append(TimeStamp);
errorBuilder.append("\r\n");
newMessageBody = errorBuilder.toString();
ProxyMessage newMessage = context.createNewMessage(newMessageBody, message.getHeaders())
context.createExchangeResponse(msgHeaders, newMessage);
}
else{
//println("else loop inside");
GroupNode.GroupNode.each { TransactionNode ->
transactionErrors = new StringBuilder();
snipList = new ArrayList();
transactionErrorIDMap = new HashMap<String, String>();
TransactionNode.Fields.Field.each { TransactionField ->
String var = TransactionField.@Name;
if (var == "TraceNumber") {
TraceNumber = TransactionField.text();
}
if (var == "TotalPaymentAmount") {
TotalPaymentAmount = TransactionField.text();
}
}
int transactionErrorcount = 0;
//int recordLevelErrorCount = 0;
def transactionSnipCategory ='';
def transactionSnip ='';
def transactionErrorID='';
def transactionErrorBrief='';
def transactionErrorMsg='';
for(NodeChild error: TransactionNode.Errors.Error)
{
//TransactionNode.Errors.Error.each { error ->
transactionErrorBrief = error.Brief.text().toString();
transactionErrorMsg = error.Msg.text().toString();
transactionErrorID = error.@ID;
transactionSnipCategory = error.@Category;
if(transactionSnipCategory == 'Rejecting')
{
transactionSnip = error.@SNIP.text().toString();
if(!snipList.contains(transactionSnip))
{
snipList.add(transactionSnip);
}
transactionErrorcount = transactionErrorcount + 1;
String transactionErrorcounter = Integer.toString(transactionErrorcount);
transactionErrors.append("TransactionSetError " + "${transactionErrorcounter}" + " " + "${transactionErrorMsg}");
transactionErrorIDMap.put(transactionErrorcounter,transactionErrorID);
break;
}
}
TransactionNode.GroupNode.each { providerNode ->
providerErrors = new StringBuilder();
claimErrors = new StringBuilder();
providerErrorIDMap = new HashMap<String, String>();
providerErrorsMap = new HashMap<String, String>();
claimErrorsMap = new HashMap<String, String>();
claimErrorIDMap = new HashMap<String, String>();
int providerErrorcount = 0;
int providerErrorTotal = 0;
String recordLevelErrorCountTotal = '';
def providerSnipCategory ='';
def providerSnip ='';
def providerErrorID='';
def providerErrorBrief='';
def providerErrorMsg='';
for(NodeChild error: providerNode.Errors.Error)
{
providerErrorBrief = error.Brief.text().toString();
providerErrorMsg = error.Msg.text().toString();
providerErrorID = error.@ID;
providerSnipCategory = error.@Category;
if(providerSnipCategory == 'Rejecting')
{
providerSnip = error.@SNIP.text().toString();
if(!snipList.contains(providerSnip))
{
snipList.add(providerSnip);
}
providerNode.ErrorStatistics.each { errorStatistics ->
providerErrorTotal = errorStatistics.ErrorTotal.toInteger()
}
providerErrorcount = providerErrorcount + 1;
String providerErrorcounter = Integer.toString(providerErrorcount);
providerErrors.append("ProviderError " + "${providerErrorcounter}" + " " + "${providerErrorMsg}");
providerErrorsMap.put(TraceNumber, providerErrors);
providerErrorIDMap.put(TraceNumber,providerErrorID);
break;
}
}
providerNode.GroupNode.each { claimNode ->
claimErrors = new StringBuilder();
int claimErrorcount = 0;
def claimSnipCategory ='';
def claimSnip ='';
def claimErrorBrief='';
def claimErrorMsg='';
def claimErrorID='';
claimNode.Fields.Field.each { claimField ->
String var = claimField.@Name;
if (var == "ClaimHCCId") {
ClaimHCCId = claimField.text();
}
if (var == "PatientControlNumber") {
PatientControlNumber = claimField.text();
}
if (var == "PatientLastName") {
PatientLastName = claimField.text();
}
if (var == "PatientFirstName") {
PatientFirstName = claimField.text();
}
if (var == "PatientMiddleName") {
PatientMiddleName = claimField.text();
}
}
for(NodeChild error: claimNode.Errors.Error)
{
//claimNode.Errors.Error.each { error ->
claimErrorBrief = error.Brief.text().toString();
claimErrorMsg = error.Msg.text().toString();
claimErrorID = error.@ID;
claimSnipCategory = error.@Category;
if(claimSnipCategory == 'Rejecting')
{
claimSnip = error.@SNIP.text().toString();
if(!snipList.contains(claimSnip))
{
snipList.add(claimSnip);
}
claimErrorcount = claimErrorcount + 1;
String claimErrorcounter = Integer.toString(claimErrorcount);
claimErrors.append("claimError " + "${claimErrorcounter}" + " " + "${claimErrorMsg}");
claimErrorsMap.put(TraceNumber, claimErrors);
claimErrorIDMap.put(TraceNumber,claimErrorID);
break;
}
}
}
errorBuilder.append("Edifecs");
errorBuilder.append(",");
errorBuilder.append("Provider");
errorBuilder.append(",");
errorBuilder.append(EDIFileName);
errorBuilder.append(",");
errorBuilder.append(InputFileName);
errorBuilder.append(",");
errorBuilder.append("Daily");
errorBuilder.append(",");
errorBuilder.append(TraceNumber);
errorBuilder.append(",");
errorBuilder.append(CheckDate);
errorBuilder.append(",");
errorBuilder.append(TotalPaymentAmount);
errorBuilder.append(",");
errorBuilder.append(ClaimHCCId);
errorBuilder.append(",");
errorBuilder.append(PatientControlNumber);
errorBuilder.append(",");
errorBuilder.append("${PatientLastName}" + " " + "${PatientFirstName}" +" " + "${PatientMiddleName}");
errorBuilder.append(",");
errorBuilder.append("PNC");
errorBuilder.append(",");
if((providerErrorsMap.size()>0) || (claimErrorsMap.size()>0) || (transactionErrors.toString() != ''))
{
errorBuilder.append("R").append(',');
}
else
{
errorBuilder.append("A").append(',');
}
if(transactionErrorIDMap.size() >= 1) {
for (Map.Entry<String,String> entry : transactionErrorIDMap.entrySet()) {
//String stateIDMap = entry.getKey();
String transactionErrorIDFromMap = entry.getValue();
//if(memberID == rejectedMemberIDList[i]){
if(transactionErrorIDMap.size() == 1) errorBuilder.append(transactionErrorIDFromMap);
else errorBuilder.append(";").append(transactionErrorIDFromMap);
//}
}
}
else if(providerErrorIDMap.size() >= 1) {
for (Map.Entry<String,String> entry : providerErrorIDMap.entrySet()) {
//String stateIDMap = entry.getKey();
String providerErrorIDFromMap = entry.getValue();
//if(memberID == rejectedMemberIDList[i]){
if(providerErrorIDMap.size() == 1) errorBuilder.append(providerErrorIDFromMap);
else errorBuilder.append(";")+append(providerErrorIDFromMap);
//}
}
}
else if(claimErrorIDMap.size() >= 1) {
for (Map.Entry<String,String> entry : claimErrorIDMap.entrySet()) {
String claimErrorIDFromMap = entry.getValue();
//errorBuilder.append(claimErrorIDFromMap);
if(claimErrorIDMap.size() == 1) errorBuilder.append(claimErrorIDFromMap);
else errorBuilder.append(";")+append(claimErrorIDFromMap);
}
}
errorBuilder.append(",");
//(providerErrorsMap.size()>0) || (claimErrorsMap.size()>0) ||
if(transactionErrors.toString() != '')
{
errorBuilder.append(transactionErrors.toString());
}
else if((providerErrorsMap.size()>0))
{
for (Map.Entry<String,String> entry : providerErrorsMap.entrySet()) {
String providerErrorsFromMap = entry.getValue();
errorBuilder.append(providerErrorsFromMap);
}
}
else if(claimErrorsMap.size()>0)
{
for (Map.Entry<String,String> entry : claimErrorsMap.entrySet()) {
String claimErrorsFromMap = entry.getValue();
errorBuilder.append(claimErrorsFromMap);
}
}
errorBuilder.append(",")
int recordLevelErrorCountInteger=0;
recordLevelErrorCountInteger=transactionErrorcount+providerErrorTotal;
recordLevelErrorCountTotal = Integer.toString(recordLevelErrorCountInteger);
//errorBuilder.append(recordLevelErrorCountTotal).append(',');
errorBuilder.append(",");
errorBuilder.append(",");
errorBuilder.append(",");
errorBuilder.append(",");
errorBuilder.append(",");
if((fileLevelErrors == "") && (transactionErrors !="") && (transactionSnipCategory == 'Rejecting')){
errorBuilder.append(SendDate);
}
else errorBuilder.append(SendDate);
errorBuilder.append(",");
errorBuilder.append(TimeStamp);
errorBuilder.append("\r\n");
}
}
newMessageBody = errorBuilder.toString();
ProxyMessage newMessage = context.createNewMessage(newMessageBody, message.getHeaders())
context.createExchangeResponse(msgHeaders, newMessage);
}
}
}
}
</file>
<file path="ArtifactsRepository/Payments/IBPayments/IBPFFPayments/IBPaymentsCheckReconciliation/Groovy/IB_Payments_CheckRecon_Groovy.txt">
import com.edifecs.etools.xeserver.proxy.ProxyMessage
import com.edifecs.etools.commons.io.SmartStream
def exchange = context.exchange
def exchProperties = exchange.properties
def messages = exchange.messages
def message = messages[0]
def msgHeaders = message.headers
InputStream messageInputStream = message.getBodyAsSmartStream().getInputStream()
String messageContent = new String(messageInputStream.readAllBytes())
// ---- helper: emit exactly one file-level trigger per input (send FIRST) ----
def emitFileLevelTrigger = { int totalTx, String ridHint ->
def trigHdrs = [:]; exchProperties.each { k, v -> trigHdrs.put(k, v) }
trigHdrs["record_status"] = "fileLevel"
trigHdrs["isFileLevelTrigger"] = "true"
trigHdrs["totalTransactions"] = totalTx
String base = (exchProperties["sourceFileName"] ?: exchProperties["fileName"] ?: ridHint ?: "INPUT").toString().trim()
if (base.isEmpty()) base = "INPUT"
String trigRID = base + "_TRIGGER_" + System.currentTimeMillis()
trigHdrs["recordIdentifierFromSource"] = trigRID
trigHdrs["uniqueId"] = trigRID
ProxyMessage trigMsg = context.createNewMessage("FILE_LEVEL_TRIGGER", trigHdrs)
context.createExchangeResponse(msgHeaders, trigMsg)
}
// ---- empty file path: trigger FIRST, then BAD message, then return ----
if (!messageContent || messageContent.trim().isEmpty()) {
emitFileLevelTrigger(0, "EMPTY")
exchProperties["record_status"] = "bad"
exchProperties["errorMessage"] = "File level error - File is empty"
exchProperties["totalTransactions"] = 0
ProxyMessage emptyMsg = context.createNewMessage("File level error - File is empty", exchProperties)
context.createExchangeResponse(msgHeaders, emptyMsg)
return
}
String[] lines = messageContent.split("\\r?\\n")
Map<String, List<String>> checkNumberToLines = [:]
Map<String, Map<String, String>> checkNumberToFieldsMap = [:]
Map<String, Boolean> checkNumberIsBad = [:]
Map<String, String> checkNumberToErrorMessage = [:]
lines.eachWithIndex { line, index ->
if (line.trim().isEmpty()) return
String checkNumber = line.length() >= 50 ? line.substring(0, 50).trim() : "UNKNOWN"
// Line length error
if (line.length() != 257) {
checkNumberToLines.computeIfAbsent(checkNumber) { [] }.add(line)
checkNumberIsBad[checkNumber] = true
String errMsg = "Line ${index + 1} has invalid length ${line.length()} (expected 257)"
checkNumberToErrorMessage[checkNumber] = checkNumberToErrorMessage.containsKey(checkNumber)
? checkNumberToErrorMessage[checkNumber] + " || " + errMsg
: errMsg
return
}
// Field extraction
String groupNumber     = line.substring(50, 100).trim()
String activityDate    = line.substring(166, 174).trim()
String epcDraftNumber  = line.substring(224, 240).trim()
String voidFlag        = line.substring(256, 257).trim()
boolean lineIsBad = false
String errorMessage = null
if (!checkNumber) {
checkNumber = "UNKNOWN"
lineIsBad = true
errorMessage = "Check number is missing"
} else {
if (!activityDate || !epcDraftNumber) {
lineIsBad = true
errorMessage = "Activity date, EPC draft number, or void flag is blank or inconsistent"
} else if (checkNumberToFieldsMap.containsKey(checkNumber)) {
def existing = checkNumberToFieldsMap[checkNumber]
if (
existing.activityDate != activityDate ||
existing.epcDraftNumber != epcDraftNumber ||
existing.voidFlag != voidFlag
) {
lineIsBad = true
errorMessage = "Activity date, EPC draft number, or void flag is inconsistent"
}
} else {
checkNumberToFieldsMap[checkNumber] = [
activityDate   : activityDate,
epcDraftNumber : epcDraftNumber,
voidFlag       : voidFlag
]
}
}
checkNumberToLines.computeIfAbsent(checkNumber) { [] }.add(line)
if (lineIsBad) {
checkNumberIsBad[checkNumber] = true
checkNumberToErrorMessage[checkNumber] = checkNumberToErrorMessage.containsKey(checkNumber)
? checkNumberToErrorMessage[checkNumber] + " || " + errorMessage
: errorMessage
}
}
// === Compute global total output files (triggers are NOT counted) ===
int globalTotalTransactions = checkNumberToLines.size()
// === Send the ONE file-level trigger FIRST ===
emitFileLevelTrigger(globalTotalTransactions, (String)(exchProperties["sourceFileName"] ?: "INPUT"))
// === Output main files ===
checkNumberToLines.each { checkNumber, lineList ->
def sb = new StringBuilder()
lineList.each { sb.append(it).append("\r\n") }
def perFileHeaders = [:]
exchProperties.each { k, v -> perFileHeaders.put(k, v) }
perFileHeaders["checkNumber"] = checkNumber
String firstLine = lineList.size() > 0 ? lineList[0] : ""
String groupNumber = (firstLine.length() >= 100) ? firstLine.substring(50, 100).trim() : ""
perFileHeaders["recordIdentifierFromSource"] = checkNumber + groupNumber
perFileHeaders["uniqueId"] = checkNumber
perFileHeaders["totalTransactions"] = globalTotalTransactions  // global count of main outputs
if (checkNumberIsBad.get(checkNumber)) {
perFileHeaders["record_status"] = "bad"
perFileHeaders["errorMessage"] = "SNIP-1:" + checkNumberToErrorMessage.get(checkNumber)
} else {
perFileHeaders["record_status"] = "good"
}
ProxyMessage newMsg = context.createNewMessage(sb.toString(), perFileHeaders)
context.createExchangeResponse(msgHeaders, newMsg)
}
</file>
<file path="ArtifactsRepository/Payments/IBPayments/IBPFFPayments/IBPaymentsCheckReconciliation/Map/IB_Payments_CheckRecon_PFF_to_XML.ems">
<?xml version="1.0" encoding="UTF-8"?><Map Version="3" ModelVersion="4" ModelRevision="1" LastCPID="87"><Ps C="Variables"><P N="LastVarID">2</P><P N="1/ID">1</P><P N="1/Name">RecordCount</P></Ps><Sources><ES ID="1" Type="File.ECS"><Ps><P N="Name">Source</P><P N="Location">..\Guideline\IB_Payments_CheckRecon_PFF_Source.ecs</P></Ps><CPs><CP ID="11" Pth="{P8}/Field(ID = '1.001')"/><CP ID="15" Pth="{P8}/Field(ID = '1.005')"/><CP ID="17" Pth="{P8}/Field(ID = '1.007')"/><CP ID="19" Pth="{P8}/Field(ID = '1.009')"/><CP ID="30" Pth="/Message(ID = 'CheckReconciliation')"/><CP ID="40" Pth="{P8}"/><CP ID="55" Pth="{P8}/Field(ID = '1.004')"/><CP ID="65" Pth="/InternalProperties/Field(Name = 'inputId')"/><CP ID="67" Pth="/InternalProperties/Field(Name = 'inputType')"/><CP ID="69" Pth="/InternalProperties/Field(Name = 'inputFileName')"/><CP ID="71" Pth="{S3018}"/><CP ID="73" Pth="{S3021}"/><CP ID="75" Pth="{S3020}"/><CP ID="77" Pth="/InternalProperties/Field(Name = 'senderId')"/><CP ID="79" Pth="/InternalProperties/Field(Name = 'receiverId')"/><CP ID="81" Pth="{S3022}"/><CP ID="84" Pth="{S3019}"/><CP ID="86" Pth="/InternalProperties/Field(Name = 'rayIdentifier')"/><CP ID="87" Pth="{S3015}"/></ConnectionPoints/></Sources><Targets><ES ID="2" Type="File.ECS"><Ps><P N="Name">Target</P><P N="Location">..\..\IBPaymentsCommon\Guideline\IB_Payments_XML_Target.ecs</P></Ps><CPs><CP ID="28" Pth="{P2}{S1001}{S3004}/element(name = 'checkNumber')"/><CP ID="34" Pth="{P2}{S1001}/element(name = 'w3cReconciliationDate')"/><CP ID="35" Pth="{P2}{S1001}{S3005}/element(name = 'externalPaymentId')"/><CP ID="36" Pth="{P2}{S1001}/element(name = 'action')"/><CP ID="48" Pth="{P2}/element(name = 'recordIdentifierFromSource')"/><CP ID="51" Pth="{P2}{S1001}{S3004}/element(name = 'checkAmount')"/><CP ID="57" Pth="{P2}{S1001}{S3005}/element(name = 'clearedCheckDate')"/><CP ID="66" Pth="{P5}{S1000}/element(name = 'inputId')"/><CP ID="68" Pth="{P5}{S1000}/element(name = 'inputType')"/><CP ID="70" Pth="{P5}{S1000}/element(name = 'inputFileName')"/><CP ID="72" Pth="{P5}{S1000}/element(name = 'inputArchiveFileName')"/><CP ID="74" Pth="{P5}{S1000}/element(name = 'totalTransactions')"/><CP ID="76" Pth="{P5}{S1000}/element(name = 'XMLfileCreationDate')"/><CP ID="78" Pth="{P5}{S1000}/element(name = 'senderId')"/><CP ID="80" Pth="{P5}{S1000}/element(name = 'receiverId')"/><CP ID="82" Pth="{P2}/element(name = 'rayIdentifier')"/><CP ID="83" Pth="{P2}/element(name = 'recordIdentifier')"/><CP ID="85" Pth="{P2}/element(name = 'sourceTypeIdentifier')"/></CPs><ReverseConnectionPoints//></Targets><Fs><F ID="1" N="JavaScript Input_CheckReconciliation" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">// Retrieving the record set or creating the recordset
myRS1 = ec_VariableHelper.GetRecordSet(&quot;IB_Payments&quot;);
// Creating an empty array and Getting the value by index and assigning it to the array.
resArr1 = new Array();
for(i=0;i&lt;4;i++)
{
resArr1[i] = ec_DataHelper.GetValueByIndex(i);
}
//Updating the newly inserted row with the values from the array
myRS1.insertRow();
myRS1.updateRow(resArr1);
ec_VariableHelper.SetRecordSet(&quot;IB_Payments&quot;, myRS1, true);
</P></Ps><CPs><CP ID="1" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="3" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="4" FP="A" P="2" N="value3"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="5" FP="A" P="3" N="value4"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="2" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="2" N="JavaScript Output_CheckReconciliation" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var myRS = ec_VariableHelper.GetRecordSet(&quot;IB_Payments&quot;);
var Fields = myRS.getFields(); // Retrieve the fields inside the recordSet
var RecordCount=ec_VariableHelper.GetVariable(&quot;RecordCount&quot;);
if(RecordCount==1)
{
for(var i=0;i&lt;3;i++)
{
ec_ResultHelper.ReportResultByIndex(i, Fields[i].trim());
}
if(Fields[3]=='Y')
{
ec_ResultHelper.ReportResultByIndex(3,'VOID');
}
else if( Fields[3]==&quot;&quot;)
{
ec_ResultHelper.ReportResultByIndex(3,'CLEARED');
ec_ResultHelper.ReportResultByIndex(4,Fields[1]);
}
}
</P></Ps><CPs><CP ID="29" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="20" FP="A" P="0" N="value1"/><CP ID="21" FP="X" P="0" N="result1"/><CP ID="22" FP="X" P="1" N="result2"/><CP ID="23" FP="X" P="2" N="result3"/><CP ID="24" FP="X" P="3" N="result4"/><CP ID="56" FP="X" P="4" N="result5"/></ConnectionPoints/><F ID="3" T="Increment"><Ps C="S"><P N="variableID">1</P></Ps><CPs><CP ID="41" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="4" T="ChangeVariable"><Ps C="S"><P N="variableID">1</P></Ps><CPs><CP ID="43" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="42" FP="A" N="v" DirectValue="0"/></ConnectionPoints/><F ID="6" N="JavaScript Output_PayerGroupNumber" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var PayerGroupNumber=ec_VariableHelper.GetVariable(&quot;PayerGroupNumber&quot;);
var RecordCount=ec_VariableHelper.GetVariable(&quot;RecordCount&quot;);
if(RecordCount==1)
{
ec_ResultHelper.ReportResultByIndex(0,PayerGroupNumber.trim());
}  </P></Ps><CPs><CP ID="47" FP="_AP" N="a"/><CP ID="45" FP="A" P="0" N="value1"/><CP ID="46" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="7" N="JavaScript Output_CheckAmt" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var myRS = ec_VariableHelper.GetRecordSet(&quot;CheckAmt&quot;);
myRS.last();
var RS = myRS.getRow(); // Retrieve the row number of the recordSet
var FinalAmt=0;
while(RS&gt;0)
{
var Fields = myRS.getFields(); // Retrieve the fields inside the recordSet
ec_ResultHelper.println(Fields[0]);
FinalAmt=FinalAmt + +Fields[0];
myRS.previous();
RS = myRS.getRow();
}
FinalAmt = (FinalAmt / 100).toFixed(2);// Convert amt to decimal format
ec_ResultHelper.ReportResultByIndex(0,FinalAmt);
</P></Ps><CPs><CP ID="52" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="49" FP="A" P="0" N="value1"/><CP ID="50" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="8" N="JavaScript Input_CheckAmt" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">// Retrieving the record set or creating the recordset
myRS1 = ec_VariableHelper.GetRecordSet(&quot;CheckAmt&quot;);
// Creating an empty array and Getting the value by index and assigning it to the array.
resArr1 = new Array();
for(i=0;i&lt;1;i++)
{
resArr1[i] = ec_DataHelper.GetValueByIndex(i);
}
//Updating the newly inserted row with the values from the array
myRS1.insertRow();
myRS1.updateRow(resArr1);
ec_VariableHelper.SetRecordSet(&quot;CheckAmt&quot;, myRS1, true);
</P></Ps><CPs><CP ID="53" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="54" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="9" T="ConvertDateTime"><Ps C="S"><P N="in_format">CCYYMMDD</P><P N="in_format_spec">1</P><P N="out_format">yyyy-MM-dd</P></Ps><CPs><CP ID="59" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="58" FP="X" N="r"/></ConnectionPoints/><F ID="10" T="ConvertDateTime"><Ps C="S"><P N="in_format">CCYYMMDD</P><P N="in_format_spec">1</P><P N="out_format">yyyy-MM-dd</P></Ps><CPs><CP ID="61" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="60" FP="X" N="r"/></ConnectionPoints/></Fs><Cs><C OutputCP="11" InputCP="1"/><C OutputCP="21" InputCP="28"/><C OutputCP="15" InputCP="3"/><C OutputCP="17" InputCP="4"/><C OutputCP="19" InputCP="5"/><C OutputCP="23" InputCP="35"/><C OutputCP="24" InputCP="36"/><C OutputCP="40" InputCP="29"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="40" InputCP="41"/><C OutputCP="30" InputCP="43"/><C OutputCP="50" InputCP="51"/><C OutputCP="55" InputCP="53"/><C OutputCP="40" InputCP="52"><Ps C="GuidelineFilters"><P N="Event">2</P></Ps></C><C OutputCP="58" InputCP="34"/><C OutputCP="22" InputCP="59"/><C OutputCP="56" InputCP="61"/><C OutputCP="60" InputCP="57"/><C OutputCP="65" InputCP="66"></C><C OutputCP="67" InputCP="68"></C><C OutputCP="69" InputCP="70"></C><C OutputCP="71" InputCP="72"></C><C OutputCP="73" InputCP="74"></C><C OutputCP="75" InputCP="76"></C><C OutputCP="77" InputCP="78"></C><C OutputCP="79" InputCP="80"></C><C OutputCP="81" InputCP="83"></C><C OutputCP="84" InputCP="85"></C><C OutputCP="86" InputCP="82"></C><C OutputCP="87" InputCP="48"></C></Cs></Map>
</file>
<file path="ArtifactsRepository/Payments/IBPayments/IBPFFPayments/IBPaymentsCommon/Groovy/IB_Payments_Error_Capture_Groovy.txt">
import com.edifecs.etools.xeserver.proxy.ProxyMessage;
import com.edifecs.etools.commons.io.SmartStream;
import groovy.util.slurpersupport.NodeChild;
import java.io.*;
// Initialize exchange and message properties
exchange = context.exchange;
exchProperties = exchange.properties;
messages = exchange.messages;
message = messages[0];
msgHeaders = message.headers;
// Transfer properties from exchange to message headers
exchProperties.each { k, v -> msgHeaders.put(k, v) }
// Buffer input stream so it can be reused
InputStream originalInputStream = message.getBodyAsSmartStream().getInputStream();
ByteArrayOutputStream baos = new ByteArrayOutputStream();
originalInputStream.withStream { it.transferTo(baos) }
byte[] messageBytes = baos.toByteArray();
// Parse XML from buffered bytes
def root = new XmlSlurper().parse(new ByteArrayInputStream(messageBytes))
// Prepare StringBuilders
StringBuilder messageLevelErrors = new StringBuilder()
StringBuilder errorBuilder = new StringBuilder()
// Initialize error count
int errorCount = 0
// Function to count errors in messageLevelErrors
def countErrors(StringBuilder errorsSb) {
if (!errorsSb) return 0
return errorsSb.toString().trim().isEmpty() ? 0 : errorsSb.toString().split("\\|\\|").length
}
// Variables to hold error fields
def messageErrorBrief;
def messageErrorMsg;
def messageErrorErrData;
def messageErrorSegment;
def messageErrorPath;
def messageSNIP;
def messageSnipCategory;
def messageErrorID;
// Iterate over GroupNode and Errors
root.GroupNode.each { messageNode ->
for (NodeChild error : messageNode.Errors.Error) {
messageErrorBrief = error.Brief.text().toString().replaceAll(',', '')
messageErrorMsg = error.Msg.text().toString().replaceAll(',', '').replaceAll('\\{br\\}\\{br\\}', ' ').replaceAll('\\{br\\}\\{tab\\}', ' ')
messageErrorErrData = error.ErrorDataInfo.ErrData.text().toString().replaceAll(',', '')
messageErrorSegment = error.ErrorDataInfo.Part1.text().toString().replaceAll(',', '')
messageErrorPath = error.ErrorDataInfo.BusinessPath.text().toString().replaceAll(',', '')
messageSNIP = error.@SNIP.toString()
messageSnipCategory = error.@Category.toString()
messageErrorID = error.@ID.toString()
if (messageSnipCategory == 'Rejecting') {
String temp
if (messageLevelErrors.length() > 0) {
temp = "||ErrID-${messageErrorID}: SNIP-${messageSNIP}: ErrorBrief-${messageErrorBrief}: ErrorMsg-${messageErrorMsg}"
messageLevelErrors.append(temp)
} else {
temp = "ErrID-${messageErrorID}: ErrData-${messageErrorErrData}: SNIP-${messageSNIP}: ErrorBrief-${messageErrorBrief}: ErrorMsg-${messageErrorMsg}"
messageLevelErrors.append(temp)
}
errorCount = countErrors(messageLevelErrors)
}
}
}
// Split errors and truncate each to max 300 chars
String errorString = messageLevelErrors.toString()
String[] errors = errorString.split("\\|\\|")
errors = errors.collect { err ->
err.length() > 300 ? err.substring(0, 297) : err
}
// Replace with truncated errors joined by "||"
messageLevelErrors.setLength(0)
messageLevelErrors.append(errors.join('||'))
// If errors exist, prepare final error message
def errorMessage = ''
if (errorCount > 0 && messageLevelErrors.length() > 0) {
errorBuilder.append(messageLevelErrors.toString()).append("\r\n")
errorMessage = errorBuilder.toString().trim()
// Trim errorMessage if too long
if (errorMessage.length() > 5000) {
errorMessage = errorMessage.substring(0, 4992) + "(...)"
}
}
// Only generate output and set property if errors found
if (errorCount > 0) {
exchProperties['errorMessage'] = errorMessage
exchProperties.put('errorMessage', errorMessage)
context.createExchangeResponse(exchProperties, new ByteArrayInputStream(messageBytes))
}
</file>
<file path="ArtifactsRepository/Payments/IBPayments/IBPFFPayments/IBPaymentsCommon/SplitRule/IB_Payments_SplitRule.xml">
<?xml version="1.0" encoding="UTF-8"?><DataSplitRules Version="2.0" N="Data Splitting rules" Description="Default data splitting rule set" xsi:noNamespaceSchemaLocation="DataSplitRules.xsd" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"><Rule name="good">Message[@AckCode='A']</Rule><Rule name="bad">Message[@AckCode='R']</Rule></DataSplitRules>
</file>
<file path="ArtifactsRepository/Payments/IBPayments/IBPFFPayments/IBPaymentsCommon/Velocity/IB_Payments_Audit_Template.vtmpl">
{
"inputDetails":
#if(${IB_Payments_Audit_Event}=="1" or ${IB_Payments_Audit_Event}=="2" or ${IB_Payments_Audit_Event}=="3" or ${IB_Payments_Audit_Event}=="4" or ${IB_Payments_Audit_Event}=="5"  or ${IB_Payments_Audit_Event}=="6" or ${IB_Payments_Audit_Event}=="7" or ${IB_Payments_Audit_Event}=="8" or ${IB_Payments_Audit_Event}=="9" or ${IB_Payments_Audit_Event}=="10" or ${IB_Payments_Audit_Event}=="11" or ${IB_Payments_Audit_Event}=="12" or ${IB_Payments_Audit_Event}=="13" or ${IB_Payments_Audit_Event}=="14" or ${IB_Payments_Audit_Event}=="15" or ${IB_Payments_Audit_Event}=="16")
{
"inputId": "${IB_Payments_Input_File_Id}",
"inputFileName": "${IB_Payments_FileName}",
#if($IB_Payments_File_Input_Type)
"inputType": "${IB_Payments_File_Input_Type}",
#end
#if($sourceTypeIdentifier)
"sourceTypeIdentifier":${sourceTypeIdentifier},
#end
#if($IB_Payments_File_Input_Type)
"paymentSourceName":"${IB_Payments_File_Input_Type}",
#end
#if($tenantIdentifier)
"tenantIdentifier":${tenantIdentifier},
#end
#if($totalTransactions)
"totalTransactions":"${totalTransactions}",
#end
#if($totalCount)
"totalTransactions":"",
#end
"inputArchiveFilename": "${IB_Payments_Input_Archive_File_Name}"
},#{else}#end
"process":
#if(${IB_Payments_Audit_Event}=="1" or ${IB_Payments_Audit_Event}=="9")
{
"processStageName": "edifecs:message received",
"processStatus": "MESSAGE READ",
"processInputArchiveFilename": "${processInputArchiveFilename}",
"auditTime": "${auditTime}"
}#{else}#end
#if(${IB_Payments_Audit_Event}=="11")
{
"processStageName": "edifecs:file received",
"processStatus": "FILE RECEIVED",
"processInputArchiveFilename": "${processInputArchiveFilename}",
#if($processOutputArchiveFilename)
"processOutputArchiveFilename": "",
#end
"auditTime": "${ZelisauditTime}"
}#{else}#end
#if(${IB_Payments_Audit_Event}=="16")
{
"processStageName": "edifecs:file received",
"processStatus": "FILE RECEIVED",
"processInputArchiveFilename": "${processInputArchiveFilename}",
#if($processOutputArchiveFilename)
"processOutputArchiveFilename": "",
#end
"auditTime": "${ZelisauditTime}"
}#{else}#end
#if(${IB_Payments_Audit_Event}=="12")
{
"processStageName": "edifecs:message split",
"processStatus": "PROCESSED",
"processInputArchiveFilename": "${processInputArchiveFilename}",
"processOutputArchiveFilename": "",
"auditTime": "${auditTime}"
},#{else}#end
#if(${IB_Payments_Audit_Event}=="2" or ${IB_Payments_Audit_Event}=="7")
{
"processStageName": "edifecs:validation",
"processStatus": "PROCESSED",
"processInputArchiveFilename": "${processInputArchiveFilename}",
"auditTime": "${auditTime}"
},#{else}#end
#if(${IB_Payments_Audit_Event}=="3" or ${IB_Payments_Audit_Event}=="8" or ${IB_Payments_Audit_Event}=="10")
{
"processStageName": "edifecs:validation failed",
"processStatus": "ERROR",
"processMessage":"${errorMessage}",
"processInputArchiveFilename": "${processInputArchiveFilename}",
"auditTime": "${auditTime}"
}, #{else}#end
#if(${IB_Payments_Audit_Event}=="15")
{
"processStageName": "edifecs:file validation",
"processStatus": "PROCESSED",
"processInputArchiveFilename": "${processInputArchiveFilename}",
#if($processOutputArchiveFilename)
"processOutputArchiveFilename": "",
#end
"auditTime": "${auditTime}"
} #{else}#end
#if(${IB_Payments_Audit_Event}=="14")
{
"processStageName": "edifecs:file validation",
"processStatus": "ERROR",
"processMessage":"Invalid File",
"processInputArchiveFilename": "${processInputArchiveFilename}",
#if($processOutputArchiveFilename)
"processOutputArchiveFilename": "",
#end
"auditTime": "${auditTime}"
} #{else}#end
#if(${IB_Payments_Audit_Event}=="4")
{
"processStageName": "edifecs:conversion",
"processStatus": "PROCESSED",
"processInputArchiveFilename": "${processInputArchiveFilename}",
"auditTime": "${auditTime}"
}, #{else}#end
#if(${IB_Payments_Audit_Event}=="5")
{
"processStageName": "edifecs:conversion failed",
"processStatus": "ERROR",
"processInputArchiveFilename": "${processInputArchiveFilename}",
"auditTime": "${auditTime}"
}, #{else}#end
#if(${IB_Payments_Audit_Event}=="6" or ${IB_Payments_Audit_Event}=="13")
{
"processStageName": "edifecs:publish completed",
"processStatus": "MESSAGE PUBLISHED",
"processInputArchiveFilename": "${processInputArchiveFilename}",
#if($processOutputArchiveFilename)
"processOutputArchiveFilename": "",
#end
"auditTime": "${auditTime}"
}, #{else}#end
#if(${IB_Payments_Audit_Event}=="2" or ${IB_Payments_Audit_Event}=="3" or ${IB_Payments_Audit_Event}=="4" or ${IB_Payments_Audit_Event}=="5"  or ${IB_Payments_Audit_Event}=="6" or ${IB_Payments_Audit_Event}=="7" or ${IB_Payments_Audit_Event}=="8")
"identifiers":
{
#if($recordIdentifierFromSource)
"rayIdentifier": "${IB_Payments_Ray_Identifier}",
"recordIdentifier": "${IB_Payments_Record_Identifier}",
"recordIdentifierFromSource": "${recordIdentifierFromSource}"
#else
"rayIdentifier": "${IB_Payments_Ray_Identifier}",
"recordIdentifier": "${IB_Payments_Record_Identifier}"
#end
}, #{else}#end
#if(${IB_Payments_Audit_Event}=="12" or ${IB_Payments_Audit_Event}=="13")
"identifiers":
{
"rayIdentifier": "${IB_Payments_Ray_Identifier}",
"recordIdentifier": "${IB_Payments_Record_Identifier}",
"recordIdentifierFromSource": "${recordIdentifierFromSource}"
}
#{else}#end
#if(${IB_Payments_Audit_Event}=="2" or ${IB_Payments_Audit_Event}=="3" or ${IB_Payments_Audit_Event}=="4" or ${IB_Payments_Audit_Event}=="5"  or ${IB_Payments_Audit_Event}=="6" or ${IB_Payments_Audit_Event}=="7" or ${IB_Payments_Audit_Event}=="8")
"payment":
{
#if($paymentNumber)
"paymentNumber": "${paymentNumber}",
#{else}#end
#if($PaymentID)
"paymentId": "${PaymentID}",
#{else}#end
#if($PaymentTransactionID)
"paymentTransactionId": "${PaymentTransactionID}",
#{else}#end
#if($RemittanceIssueDate)
"remittanceIssueDate": "${RemittanceIssueDate}"
#{else}#end
#if($checkNumber)
"checkNumber":"${checkNumber}"
#{else}#end
} #{else}#end
}
</file>
<file path="ArtifactsRepository/Payments/IBPayments/IBPFFPayments/IBPaymentsProviderSettlement/Groovy/IB_Payments_Provider_Settlement_Groovy.txt">
import com.edifecs.etools.xeserver.proxy.ProxyMessage
import com.edifecs.etools.commons.io.SmartStream
// ===== Configurable field/length constants =====
final int MIN_PARSE_LEN = 54      // to read recordType (0-3) and EPPID (4-53)
final int HEADER_LEN    = 869     // 0001 expected length
final int DETAIL_LEN    = 915     // 0002 expected length
// Field positions (0-based, end-exclusive) in 0002
final int CHK_START = 375
final int CHK_END   = 387         // 12 chars
final int PAY_START = 799
final int PAY_END   = 849         // 50 chars
def exchange = context.exchange
def exchProperties = exchange.properties
def messages = context.exchange.messages
def message = messages[0]
def msgHeaders = message.headers
InputStream messageInputStream = message.getBodyAsSmartStream().getInputStream()
String messageContent = new String(messageInputStream.readAllBytes())
// ===== Helper: emit a single file-level trigger (one per input) =====
def emitSingleFileLevelTrigger = { int totalTx, String ridHint ->
def trigHdrs = [:]; exchProperties.each { k, v -> trigHdrs.put(k, v) }
trigHdrs["record_status"] = "fileLevel"
trigHdrs["isFileLevelTrigger"] = "true"
trigHdrs["totalTransactions"] = totalTx
String base = (exchProperties["sourceFileName"] ?: exchProperties["fileName"] ?: ridHint ?: "INPUT").toString().trim()
if (base.isEmpty()) base = "INPUT"
String trigRID = base + "_TRIGGER_" + System.currentTimeMillis()
trigHdrs["recordIdentifierFromSource"] = trigRID
trigHdrs["uniqueId"] = trigRID
ProxyMessage trigMsg = context.createNewMessage("FILE_LEVEL_TRIGGER", trigHdrs)
context.createExchangeResponse(msgHeaders, trigMsg)
}
// ===== Handle empty file (trigger FIRST, then BAD message) =====
if (!messageContent || messageContent.replaceAll("\\s", "").isEmpty()) {
emitSingleFileLevelTrigger(0, "EMPTY")
def badHdrs = [:]; exchProperties.each { k, v -> badHdrs.put(k, v) }
badHdrs["record_status"] = "bad"
badHdrs["errorMessage"] = "File level error - File is empty"
badHdrs["totalTransactions"] = 0
badHdrs["uniqueId"] = "EMPTY"
ProxyMessage emptyMsg = context.createNewMessage("File level error - File is empty", badHdrs)
context.createExchangeResponse(msgHeaders, emptyMsg)
return
}
String[] lines = messageContent.split("\\r?\\n", -1)
// ------- Parse lines into buckets (keep EPPID logic intact) ------
Map<String, List<String>> eppidToLines = [:]
// Collect ONLY 0002 lines with missing EPPID -> BAD bucket
List<String> missingEppidDetailLines = []
lines.each { line ->
if (line.replaceAll("\\s", "").isEmpty()) return
if (line.length() < MIN_PARSE_LEN) {
// Too short to read EPPID—treat as its own bucket; will be handled later as missing header or length error
String badEppid = "SHORTLINE"
eppidToLines.computeIfAbsent(badEppid) { [] }.add(line)
return
}
String recordType = line.substring(0, 4)
// *** Ignore any records other than 0001 or 0002 ***
if (!(recordType == "0001" || recordType == "0002")) {
return
}
String eppid = line.substring(4, 54)
if (eppid.replaceAll("\\s", "").isEmpty()) {
// Only 0002 with blank EPPID is requested to be BAD
if ("0002".equals(recordType)) {
missingEppidDetailLines.add(line)
return
}
// For non-0002 with blank EPPID, do nothing special per requirement
} else {
eppidToLines.computeIfAbsent(eppid.trim()) { [] }.add(line)
}
}
// ===== Helper to count how many outputs a single EPPID bucket will produce =====
Closure<Integer> countOutputsForGroup = { List<String> linesList ->
def headerLine = linesList.find { it.startsWith("0001") }
def detailLines = linesList.findAll { it.startsWith("0002") }
if (!headerLine) {
// Missing header -> single BAD file
return 1
}
List<String> validDetailLines = []
List<String> invalidDetailLines = []
List<String> errorMsgs = []
// Header length check
if (headerLine.length() < HEADER_LEN) {
errorMsgs.add("0001 header length is ${headerLine.length()}, expected 869 (too short).")
} else if (headerLine.length() > HEADER_LEN) {
errorMsgs.add("0001 header length is ${headerLine.length()}, expected 869 (too long).")
}
// Detail length checks
detailLines.eachWithIndex { detailLine, i ->
if (detailLine.length() < DETAIL_LEN) {
invalidDetailLines.add(detailLine)
errorMsgs.add("Detail line ${i + 1} too short, length=${detailLine.length()} (expected 915).")
} else if (detailLine.length() > DETAIL_LEN) {
invalidDetailLines.add(detailLine)
errorMsgs.add("Detail line ${i + 1} too long, length=${detailLine.length()} (expected 915).")
} else {
validDetailLines.add(detailLine)
}
}
int badCount = errorMsgs.isEmpty() ? 0 : 1
if (validDetailLines.isEmpty()) {
// No valid detail -> header-only GOOD file
return badCount + 1
}
// Count groups that will be produced from valid details
Map<String, List<String>> groupKeyToDetailLines = [:]
validDetailLines.each { detailLine ->
String rawCheckNumber = detailLine.substring(CHK_START, CHK_END)
String checkNumber = rawCheckNumber.trim()
String paymentId = detailLine.substring(PAY_START, PAY_END).trim()
String groupKey = (checkNumber == "" || rawCheckNumber == "000000000000") ?
"ZCHK_PAYID_${paymentId}" : "CHK_${checkNumber}"
groupKeyToDetailLines.computeIfAbsent(groupKey) { [] }.add(detailLine)
}
return badCount + groupKeyToDetailLines.size()
}
// ===== PASS 1: compute global total (final number of **main** files to be sent) =====
int globalTotalTransactions = 0
eppidToLines.each { _, linesList ->
globalTotalTransactions += countOutputsForGroup(linesList)
}
// Add one BAD output if we have any 0002 lines with missing EPPID
if (!missingEppidDetailLines.isEmpty()) {
globalTotalTransactions += 1
}
// ===== Send the SINGLE file-level trigger FIRST =====
emitSingleFileLevelTrigger(globalTotalTransactions, (String)(exchProperties["sourceFileName"] ?: "INPUT"))
// ===== PASS 2: emit **main** messages ONLY (no triggers here) =====
eppidToLines.each { eppid, linesList ->
def headerLine = linesList.find { it.startsWith("0001") }
def detailLines = linesList.findAll { it.startsWith("0002") }
if (!headerLine) {
def perFileHeaders = [:]; exchProperties.each { k, v -> perFileHeaders.put(k, v) }
perFileHeaders["EPPID"] = eppid
perFileHeaders["record_status"] = "bad"
perFileHeaders["errorMessage"] = "Missing 0001 header record for EPPID " + eppid
perFileHeaders["totalTransactions"] = globalTotalTransactions
perFileHeaders["recordIdentifierFromSource"] = eppid + "MISSINGHEADER"
perFileHeaders["uniqueId"] = perFileHeaders["recordIdentifierFromSource"]
ProxyMessage newMsg = context.createNewMessage(linesList.join("\r\n"), perFileHeaders)
context.createExchangeResponse(msgHeaders, newMsg)
return
}
List<String> validDetailLines = []
List<String> invalidDetailLines = []
List<String> errorMsgs = []
// Header length check
if (headerLine.length() < HEADER_LEN) {
errorMsgs.add("0001 header length is ${headerLine.length()}, expected 869 (too short).")
} else if (headerLine.length() > HEADER_LEN) {
errorMsgs.add("0001 header length is ${headerLine.length()}, expected 869 (too long).")
}
// Detail length checks
detailLines.eachWithIndex { detailLine, i ->
if (detailLine.length() < DETAIL_LEN) {
invalidDetailLines.add(detailLine)
errorMsgs.add("Detail line ${i + 1} too short, length=${detailLine.length()} (expected 915).")
} else if (detailLine.length() > DETAIL_LEN) {
invalidDetailLines.add(detailLine)
errorMsgs.add("Detail line ${i + 1} too long, length=${detailLine.length()} (expected 915).")
} else {
validDetailLines.add(detailLine)
}
}
// Emit BAD bucket if any length errors
if (!errorMsgs.isEmpty()) {
def badSb = new StringBuilder()
badSb.append(headerLine).append("\r\n")
invalidDetailLines.each { badSb.append(it).append("\r\n") }
String badCheckNumber = ""
String badPaymentId = ""
if (!invalidDetailLines.isEmpty()) {
String firstBadDetail = invalidDetailLines[0]
if (firstBadDetail.length() >= CHK_END) {
badCheckNumber = firstBadDetail.substring(CHK_START, CHK_END).trim()
}
if (firstBadDetail.length() >= PAY_END) {
badPaymentId = firstBadDetail.substring(PAY_START, PAY_END).trim()
}
}
// Distinct BAD RID (safer)
String badRecordId = ""
if (badCheckNumber && badCheckNumber != "000000000000") {
badRecordId = eppid + badCheckNumber + "_BAD"
} else if (badPaymentId) {
badRecordId = eppid + badPaymentId + "_BAD"
} else {
badRecordId = eppid + "_BAD"
}
def badHeaders = [:]; exchProperties.each { k, v -> badHeaders.put(k, v) }
badHeaders["EPPID"] = eppid
badHeaders["record_status"] = "bad"
badHeaders["errorMessage"] = errorMsgs.join("||")
badHeaders["totalTransactions"] = globalTotalTransactions
badHeaders["recordIdentifierFromSource"] = badRecordId
badHeaders["uniqueId"] = badRecordId
badHeaders["checkNumber"] = badCheckNumber ?: ""
badHeaders["paymentNumber"] = badPaymentId ?: ""
ProxyMessage badMsg = context.createNewMessage(badSb.toString(), badHeaders)
context.createExchangeResponse(msgHeaders, badMsg)
}
// If no valid details, emit HEADER_ONLY good file
if (validDetailLines.isEmpty()) {
def sb = new StringBuilder()
sb.append(headerLine).append("\r\n")
def perFileHeaders = [:]; exchProperties.each { k, v -> perFileHeaders.put(k, v) }
perFileHeaders["EPPID"] = eppid
perFileHeaders["groupKey"] = "HEADER_ONLY"
perFileHeaders["paymentId"] = ""
perFileHeaders["checkNumber"] = ""
perFileHeaders["record_status"] = "good"
perFileHeaders["totalTransactions"] = globalTotalTransactions
perFileHeaders["recordIdentifierFromSource"] = eppid + "_HEADER_ONLY"
perFileHeaders["uniqueId"] = perFileHeaders["recordIdentifierFromSource"]
ProxyMessage newMsg = context.createNewMessage(sb.toString(), perFileHeaders)
context.createExchangeResponse(msgHeaders, newMsg)
return
}
// Group valid details by CheckNumber first, else by PaymentId
Map<String, List<String>> groupKeyToDetailLines = [:]
Map<String, String> groupKeyToRID = [:]
Map<String, String> groupKeyToPaymentId = [:]
validDetailLines.each { detailLine ->
String rawCheckNumber = detailLine.substring(CHK_START, CHK_END)
String checkNumber = rawCheckNumber.trim()
String paymentId = detailLine.substring(PAY_START, PAY_END).trim()
String groupKey
String groupRID
if (checkNumber == "" || rawCheckNumber == "000000000000") {
groupKey = "ZCHK_PAYID_${paymentId}"
groupRID = eppid + paymentId
} else {
groupKey = "CHK_${checkNumber}"
groupRID = eppid + checkNumber
}
groupKeyToDetailLines.computeIfAbsent(groupKey) { [] }.add(detailLine)
groupKeyToRID[groupKey] = groupRID
groupKeyToPaymentId[groupKey] = paymentId
}
// Emit GOOD files per group
groupKeyToDetailLines.each { groupKey, detailGroup ->
def sb = new StringBuilder()
sb.append(headerLine).append("\r\n")
detailGroup.each { sb.append(it).append("\r\n") }
String origPaymentNumber = groupKeyToPaymentId[groupKey]
String origCheckNumber = ""
if (groupKey.startsWith("ZCHK_PAYID_")) {
origCheckNumber = "000000000000"
} else if (groupKey.startsWith("CHK_")) {
origCheckNumber = groupKey.substring(4)
}
def perFileHeaders = [:]; exchProperties.each { k, v -> perFileHeaders.put(k, v) }
perFileHeaders["EPPID"] = eppid
perFileHeaders["groupKey"] = groupKey
perFileHeaders["paymentId"] = origPaymentNumber
perFileHeaders["paymentNumber"] = origPaymentNumber ?: ""
perFileHeaders["checkNumber"] = origCheckNumber ?: ""
perFileHeaders["record_status"] = "good"
perFileHeaders["totalTransactions"] = globalTotalTransactions
perFileHeaders["recordIdentifierFromSource"] = groupKeyToRID[groupKey]
perFileHeaders["uniqueId"] = groupKeyToRID[groupKey]
ProxyMessage newMsg = context.createNewMessage(sb.toString(), perFileHeaders)
context.createExchangeResponse(msgHeaders, newMsg)
}
}
// ===== Emit ONE BAD file for 0002 lines with missing EPPID (if present) =====
if (!missingEppidDetailLines.isEmpty()) {
def perFileHeaders = [:]; exchProperties.each { k, v -> perFileHeaders.put(k, v) }
perFileHeaders["EPPID"] = ""
perFileHeaders["record_status"] = "bad"
perFileHeaders["errorMessage"] = "EPPID is missing. This Field's standard option is 'Mandatory'."
perFileHeaders["totalTransactions"] = globalTotalTransactions
perFileHeaders["recordIdentifierFromSource"] = "MISSING_EPPID_0002_" + System.currentTimeMillis()
perFileHeaders["uniqueId"] = perFileHeaders["recordIdentifierFromSource"]
ProxyMessage missingEppidMsg = context.createNewMessage(missingEppidDetailLines.join("\r\n"), perFileHeaders)
context.createExchangeResponse(msgHeaders, missingEppidMsg)
}
</file>
<file path="ArtifactsRepository/Payments/IBPayments/IBPFFPayments/IBPaymentsProviderSettlement/Map/IB_Payments_ProviderSettlement_PFF_to_XML.ems">
<?xml version="1.0" encoding="UTF-8"?><Map Version="3" ModelVersion="4" ModelRevision="1" LastCPID="106"><Ps C="Variables"><P N="LastVarID">5</P><P N="1/ID">2</P><P N="1/Name">EPC_Draft_Number</P><P N="2/ID">3</P><P N="2/Name">EPC_Account_Number</P><P N="3/ID">4</P><P N="3/Name">Payment_Type</P><P N="4/ID">5</P><P N="4/Name">Form_Code</P></Ps><Sources><ES ID="1" Type="File.ECS"><Ps><P N="Name">Source</P><P N="Location">..\Guideline\IB_Payments_ProviderSettlement_PFF_Source.ecs</P></Ps><CPs><CP ID="4" Pth="{P9}"/><CP ID="11" Pth="{P9}/Field(ID = '1.011')"/><CP ID="18" Pth="{P9}/Field(ID = '1.013')"/><CP ID="24" Pth="{P9}/Field(ID = '1.026')"/><CP ID="30" Pth="{P9}/Field(ID = '1.027')"/><CP ID="39" Pth="{P10}/Field(ID = '2.013')"/><CP ID="41" Pth="{P10}/Field(ID = '2.015')"/><CP ID="43" Pth="{P10}/Field(ID = '2.022')"/><CP ID="45" Pth="{P10}/Field(ID = '2.030')"/><CP ID="52" Pth="{P10}"/><CP ID="62" Pth="/InternalProperties/Field(Name = 'inputId')"/><CP ID="64" Pth="/InternalProperties/Field(Name = 'inputType')"/><CP ID="66" Pth="/InternalProperties/Field(Name = 'inputFileName')"/><CP ID="68" Pth="{S3018}"/><CP ID="70" Pth="{S3021}"/><CP ID="72" Pth="{S3020}"/><CP ID="74" Pth="/InternalProperties/Field(Name = 'senderId')"/><CP ID="76" Pth="/InternalProperties/Field(Name = 'receiverId')"/><CP ID="78" Pth="{S3022}"/><CP ID="80" Pth="{S3019}"/><CP ID="82" Pth="/InternalProperties/Field(Name = 'rayIdentifier')"/><CP ID="100" Pth="{S3015}"/><CP ID="101" Pth="{P9}/Field(ID = '1.014')"/><CP ID="105" Pth="/InternalProperties/Field(Name = 'IB_Payments_Vendor')"/></ConnectionPoints/></Sources><Targets><ES ID="2" Type="File.ECS"><Ps><P N="Name">Target</P><P N="Location">..\..\IBPaymentsCommon\Guideline\IB_Payments_XML_Target.ecs</P></Ps><CPs><CP ID="9" Pth="{P2}/element(name = 'recordIdentifierFromSource')"/><CP ID="16" Pth="{P2}{S1001}{S3005}/element(name = 'externalPaymentId')"/><CP ID="22" Pth="{P2}{S1001}{S3004}/element(name = 'bankAccountNumber')"/><CP ID="27" Pth="{P2}{S3006}/element(name = 'paymentTypeCode')"/><CP ID="33" Pth="{P2}{S3006}/element(name = 'formCode')"/><CP ID="53" Pth="{P2}{S3006}/element(name = 'networkName')"/><CP ID="54" Pth="{P2}{S1001}{S3004}/element(name = 'checkNumber')"/><CP ID="55" Pth="{P2}{S1001}{S3004}/element(name = 'checkAmount')"/><CP ID="56" Pth="{P2}{S3006}/element(name = 'paymentId')"/><CP ID="63" Pth="{P5}{S1000}/element(name = 'inputId')"/><CP ID="65" Pth="{P5}{S1000}/element(name = 'inputType')"/><CP ID="67" Pth="{P5}{S1000}/element(name = 'inputFileName')"/><CP ID="69" Pth="{P5}{S1000}/element(name = 'inputArchiveFileName')"/><CP ID="71" Pth="{P5}{S1000}/element(name = 'totalTransactions')"/><CP ID="73" Pth="{P5}{S1000}/element(name = 'XMLfileCreationDate')"/><CP ID="75" Pth="{P5}{S1000}/element(name = 'senderId')"/><CP ID="77" Pth="{P5}{S1000}/element(name = 'receiverId')"/><CP ID="79" Pth="{P2}/element(name = 'recordIdentifier')"/><CP ID="81" Pth="{P2}/element(name = 'sourceTypeIdentifier')"/><CP ID="83" Pth="{P2}/element(name = 'rayIdentifier')"/><CP ID="102" Pth="{P2}{S1001}{S3005}/element(name = 'externalPaymentDate')"/></CPs><ReverseConnectionPoints//></Targets><Fs><F ID="4" T="ChangeVariable"><Ps C="S"><P N="variableID">2</P></Ps><CPs><CP ID="10" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="6" N="Set Value" T="SetValue"><CPs><CP ID="15" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="36" FP="A" N="v" DirectValue="{2}"/><CP ID="14" FP="X" N="r"/></ConnectionPoints/><F ID="7" T="ChangeVariable"><Ps C="S"><P N="variableID">3</P></Ps><CPs><CP ID="17" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="8" T="SetValue"><CPs><CP ID="21" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="20" FP="A" N="v" DirectValue="{3}"/><CP ID="19" FP="X" N="r"/></ConnectionPoints/><F ID="9" T="ChangeVariable"><Ps C="S"><P N="variableID">4</P></Ps><CPs><CP ID="23" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="10" T="SetValue"><CPs><CP ID="26" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="28" FP="A" N="v" DirectValue="{4}"/><CP ID="25" FP="X" N="r"/></ConnectionPoints/><F ID="11" T="ChangeVariable"><Ps C="S"><P N="variableID">5</P></Ps><CPs><CP ID="29" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="12" T="SetValue"><CPs><CP ID="34" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="32" FP="A" N="v" DirectValue="{5}"/><CP ID="31" FP="X" N="r"/></ConnectionPoints/><F ID="13" N="JavaScript Input_RecordType2" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">// Retrieving the record set or creating the recordset
myRS1 = ec_VariableHelper.GetRecordSet(&quot;RecordType2&quot;);
// Creating an empty array and Getting the value by index and assigning it to the array.
resArr1 = new Array();
for(i=0;i&lt;3;i++)
{
resArr1[i] = ec_DataHelper.GetValueByIndex(i);
}
//Updating the newly inserted row with the values from the array
myRS1.insertRow();
myRS1.updateRow(resArr1);
ec_VariableHelper.SetRecordSet(&quot;RecordType2&quot;, myRS1, true);
</P></Ps><CPs><CP ID="37" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="40" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="42" FP="A" P="2" N="value3"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="38" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="14" N="JavaScript Output_RecordType2" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var myRS = ec_VariableHelper.GetRecordSet(&quot;RecordType2&quot;);
myRS.last();
var Fields = myRS.getFields(); // Retrieve the fields inside the recordSet
for(var i=0;i&lt;Fields.length;i++)
{
ec_ResultHelper.ReportResultByIndex(i,Fields[i].trim());
}
</P></Ps><CPs><CP ID="51" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="46" FP="A" P="0" N="value1"/><CP ID="47" FP="X" P="0" N="result1"/><CP ID="48" FP="X" P="1" N="result2"/><CP ID="49" FP="X" P="2" N="result3"/></ConnectionPoints/><F ID="15" N="JavaScript Input_CheckAmt" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">// Retrieving the record set or creating the recordset
myRS1 = ec_VariableHelper.GetRecordSet(&quot;CheckAmt&quot;);
// Creating an empty array and Getting the value by index and assigning it to the array.
resArr1 = new Array();
for(i=0;i&lt;1;i++)
{
resArr1[i] = ec_DataHelper.GetValueByIndex(i);
}
//Updating the newly inserted row with the values from the array
myRS1.insertRow();
myRS1.updateRow(resArr1);
ec_VariableHelper.SetRecordSet(&quot;CheckAmt&quot;, myRS1, true);
</P></Ps><CPs><CP ID="58" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="57" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="16" N="JavaScript Output_CheckAmt" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var myRS = ec_VariableHelper.GetRecordSet(&quot;CheckAmt&quot;);
myRS.last();
var RS = myRS.getRow(); // Retrieve the row number of the recordSet
var FinalAmt=0;
while(RS&gt;0)
{
var Fields = myRS.getFields(); // Retrieve the fields inside the recordSet
ec_ResultHelper.println(Fields[0]);
FinalAmt=FinalAmt + +Fields[0];
myRS.previous();
RS = myRS.getRow();
}
FinalAmt = (FinalAmt / 100).toFixed(2);// Convert amt to decimal format
ec_ResultHelper.ReportResultByIndex(0,FinalAmt.trim());
</P></Ps><CPs><CP ID="60" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="61" FP="A" P="0" N="value1"/><CP ID="59" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="20" T="Trim"><Ps C="S"><P N="paddings">{Space}</P><P N="type">0</P></Ps><CPs><CP ID="91" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="90" FP="X" N="r"/></ConnectionPoints/><F ID="21" T="Trim"><Ps C="S"><P N="paddings">{Space}</P><P N="type">0</P></Ps><CPs><CP ID="93" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="92" FP="X" N="r"/></ConnectionPoints/><F ID="23" T="Trim"><Ps C="S"><P N="paddings">{Space}</P><P N="type">0</P></Ps><CPs><CP ID="97" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="96" FP="X" N="r"/></ConnectionPoints/><F ID="24" T="Trim"><Ps C="S"><P N="paddings">{Space}</P><P N="type">0</P></Ps><CPs><CP ID="99" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="98" FP="X" N="r"/></ConnectionPoints/><F ID="25" N="Conditional Copy -ExternalPaymentDate" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">103</P><P N="if_1/conditions/expression_1/arg1/type">2</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">PNC</P><P N="if_1/actions/assignment_1/lvalue">104</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">106</P><P N="if_1/actions/assignment_1/rvalue/type">2</P></Ps><CPs><CP ID="103" FP="A" P="0" N="PaymentsVendor"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="106" FP="A" P="1" N="DraftDate"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="104" FP="X" P="0" N="result1"/></ConnectionPoints/></Fs><Cs><C OutputCP="11" InputCP="10"/><C OutputCP="18" InputCP="17"/><C OutputCP="4" InputCP="21"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="24" InputCP="23"/><C OutputCP="4" InputCP="26"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="30" InputCP="29"/><C OutputCP="4" InputCP="34"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="4" InputCP="15"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="39" InputCP="37"/><C OutputCP="41" InputCP="40"/><C OutputCP="52" InputCP="51"><Ps C="GuidelineFilters"><P N="Event">2</P></Ps></C><C OutputCP="47" InputCP="53"/><C OutputCP="48" InputCP="54"/><C OutputCP="45" InputCP="42"/><C OutputCP="49" InputCP="56"/><C OutputCP="43" InputCP="58"/><C OutputCP="52" InputCP="60"><Ps C="GuidelineFilters"><P N="Event">2</P></Ps></C><C OutputCP="59" InputCP="55"/><C OutputCP="62" InputCP="63"></C><C OutputCP="64" InputCP="65"></C><C OutputCP="66" InputCP="67"></C><C OutputCP="68" InputCP="69"></C><C OutputCP="70" InputCP="71"></C><C OutputCP="72" InputCP="73"></C><C OutputCP="74" InputCP="75"></C><C OutputCP="76" InputCP="77"></C><C OutputCP="78" InputCP="79"></C><C OutputCP="80" InputCP="81"></C><C OutputCP="82" InputCP="83"></C><C OutputCP="14" InputCP="91"/><C OutputCP="90" InputCP="16"/><C OutputCP="19" InputCP="93"/><C OutputCP="92" InputCP="22"/><C OutputCP="31" InputCP="97"/><C OutputCP="96" InputCP="33"/><C OutputCP="25" InputCP="99"/><C OutputCP="98" InputCP="27"/><C OutputCP="100" InputCP="9"></C><C OutputCP="105" InputCP="103"/><C OutputCP="101" InputCP="106"/><C OutputCP="104" InputCP="102"/></Cs></Map>
</file>
<file path="ArtifactsRepository/Payments/IBPayments/IBZelisPayments/IBZelisPaymentsCommon/Groovy/IB_Zelis_Payments_AuditSplit_Groovy.groovy">
import com.edifecs.etools.xeserver.proxy.ProxyMessage
import groovy.json.JsonSlurper
import groovy.json.JsonOutput
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
void execute() {
def exchange = context.exchange
def message = exchange.messages[0]
// -------------------------
// Read SmartStream input
// -------------------------
def inputJsonStr = new String(
message.getBodyAsSmartStream().getInputStream().readAllBytes(),
"UTF-8"
).trim()
def jsonSlurper = new JsonSlurper()
Map parsedJson = jsonSlurper.parseText(inputJsonStr)
def inputDetails = parsedJson.inputDetails ?: [:]
List transactions = parsedJson.transaction ?: []
// -------------------------
// OUTPUT EACH RECORD SEPARATELY
// -------------------------
transactions.each { record ->
Map dataBlock = record.data
Map idBlock = record.identifiers
// -------------------------
// SET EXCHANGE PROPERTIES
// -------------------------
exchange.properties.put("IB_Payments_Ray_Identifier", idBlock.rayIdentifier ?: "")
exchange.properties.put("IB_Payments_Record_Identifier", idBlock.recordIdentifier ?: "")
// -------------------------
// Prepare single-record output JSON
// -------------------------
Map outputJson = [
"inputDetails": inputDetails,
"transaction" : [
[
"data"       : dataBlock,
"identifiers": idBlock
]
]
]
String finalJson = JsonOutput.prettyPrint(JsonOutput.toJson(outputJson))
def headers = ["Content-Type": "application/json"]
ProxyMessage outMsg = context.createNewMessage(finalJson, headers)
context.createExchangeResponse(headers, outMsg)
}
}
execute()
</file>
<file path="ArtifactsRepository/Payments/IBPayments/IBZelisPayments/IBZelisPaymentsCommon/Groovy/IB_Zelis_Payments_JsonValidation_Groovy.groovy">
import groovy.json.JsonSlurper
import com.edifecs.etools.xeserver.proxy.ProxyMessage
void execute() {
def exchange = context.exchange
def message = exchange.messages[0]
String input = message.getBodyAsString()
boolean isValidJson = true
try {
new JsonSlurper().parseText(input)
} catch (Exception e) {
// Invalid JSON
isValidJson = false
exchange.properties.put("FileSize", 0)
}
// Always pass message as-is
def headers = ["Content-Type": "application/json"]
ProxyMessage outMsg = context.createNewMessage(input, headers)
context.createExchangeResponse(headers, outMsg)
}
execute()
</file>
<file path="ArtifactsRepository/Payments/IBPayments/IBZelisPayments/IBZelisPaymentsCommon/Severity/IB_Zelis_Payment_Severity.esf">
<?xml version="1.0" encoding="utf-8"?>
<SeverityConfigFile Version="2.0" Mode="extension" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:noNamespaceSchemaLocation="SeverityConfig.xsd">
<SeverityDefinition />
<SeverityUsage>
<ApplyTo>
<Criteria N="emp.id" V="0x9C10010" />
<Criteria N="emp.snip" V="1" />
<SetSeverity SeverityID="1001" />
</ApplyTo>
<ApplyTo>
<Criteria N="emp.id" V="0x9c10007" />
<Criteria N="emp.snip" V="1" />
<SetSeverity SeverityID="0" />
</ApplyTo>
<ApplyTo>
<Criteria N="emp.snip" V="1" />
<SetSeverity SeverityID="1001" />
</ApplyTo>
<ApplyTo>
<Criteria N="emp.snip" V="2" />
<SetSeverity SeverityID="1001" />
</ApplyTo>
<ApplyTo>
<Criteria N="emp.snip" V="3" />
<SetSeverity SeverityID="1001" />
</ApplyTo>
<ApplyTo>
<Criteria N="emp.snip" V="4" />
<SetSeverity SeverityID="1001" />
</ApplyTo>
<ApplyTo>
<Criteria N="emp.snip" V="5" />
<SetSeverity SeverityID="1001" />
</ApplyTo>
<ApplyTo>
<Criteria N="emp.snip" V="6" />
<SetSeverity SeverityID="1001" />
</ApplyTo>
<ApplyTo>
<Criteria N="emp.snip" V="7" />
<SetSeverity SeverityID="1001" />
</ApplyTo>
<ApplyTo>
<Criteria N="emp.snip" V="10" />
<SetSeverity SeverityID="1001" />
</ApplyTo>
<ApplyTo>
<Criteria N="emp.snip" V="0" />
<SetSeverity SeverityID="1001" />
</ApplyTo>
</SeverityUsage>
</SeverityConfigFile>
</file>
<file path="ArtifactsRepository/Payments/IBPayments/IBZelisPayments/IBZelisPaymentsCommon/SplitRule/IB_Zelis_Payments_SplitRule.xml">
<?xml version="1.0" encoding="UTF-8"?><DataSplitRules Version="2.0" N="Data Splitting rules" Description="Default data splitting rule set" xsi:noNamespaceSchemaLocation="DataSplitRules.xsd" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"><Rule name="good">Group[@AckCode='A'] and Group[@Uniquevalue='##unique##']</Rule><Rule name="bad">Group[@AckCode='R'] and Group[@Uniquevalue='##unique##']</Rule></DataSplitRules>
</file>
<file path="ArtifactsRepository/Payments/IBPayments/IBZelisPayments/IBZelisPaymentsCommon/Velocity/IB_Zelis_Payments_FileLevel_Template.vtmpl">
{
"inputDetails": {
"inputId": "${InputId}",
"totalTransactions": "${totalTransaction}",
"inputFileName": "${InputFileName}"
},
"transaction":[
${M_Body}
]
}
</file>
<file path="ArtifactsRepository/Payments/IBPayments/IBZelisPayments/IBZelisPaymentsCommon/Velocity/IB_Zelis_Payments_RecordLevel_Template.vtmpl">
{"data":
${M_Body},
"identifiers": {
"rayIdentifier": "${rayIdentifier}",
"recordIdentifier": "${recordIdentifier}",
"recordIdentifierFromSource": "",
"timestamp": "${FileReceiptDateTime}"
}
}
</file>
<file path="ArtifactsRepository/Payments/Map/P_OB_835_DFF_to_EDI.ems">
<?xml version="1.0" encoding="UTF-8"?><Map Version="3" ModelVersion="4" ModelRevision="1" LastCPID="1102"><Ps C="Variables"><P N="LastVarID">35</P><P N="1/ID">1</P><P N="1/Name">LX01_2000</P><P N="1/InitValue">0</P><P N="2/ID">2</P><P N="2/Name">ISA_CNTRL_NUM</P><P N="3/ID">3</P><P N="3/Name">SYS_DATE_TIME</P><P N="4/ID">4</P><P N="4/Name">ENVIRONMENT</P><P N="5/ID">5</P><P N="5/Name">PAYEE_NPI</P><P N="6/ID">6</P><P N="6/Name">FiscalDate_PLB02</P><P N="7/ID">7</P><P N="7/Name">PLB02_Date</P><P N="8/ID">8</P><P N="8/Name">correctedPatientLname</P><P N="9/ID">9</P><P N="9/Name">correctedPatientFname</P><P N="10/ID">10</P><P N="10/Name">correctedPatientMname</P><P N="11/ID">11</P><P N="11/Name">correctedPatientID</P><P N="12/ID">12</P><P N="12/Name">serviceProviderName</P><P N="13/ID">13</P><P N="13/Name">serviceProviderNPI</P><P N="14/ID">14</P><P N="14/Name">SubscriberFirstName</P><P N="15/ID">15</P><P N="15/Name">SubscriberMiddleName</P><P N="16/ID">16</P><P N="16/Name">SubscriberLastName</P><P N="17/ID">17</P><P N="17/Name">SubscriberID</P><P N="18/ID">18</P><P N="18/Name">SubmittedPatientLName</P><P N="19/ID">19</P><P N="19/Name">SubmittedPatientID</P><P N="20/ID">20</P><P N="20/Name">Line_ServiceDate_Flag</P><P N="20/InitValue">false</P><P N="21/ID">21</P><P N="21/Name">CovExpirationDate</P><P N="22/ID">22</P><P N="22/Name">ClaimReceivedDate</P><P N="23/ID">23</P><P N="23/Name">Line_CAS_PR_27_Flag</P><P N="23/InitValue">false</P><P N="24/ID">24</P><P N="24/Name">StatementFromDate</P><P N="25/ID">25</P><P N="25/Name">StatementToDate</P><P N="26/ID">26</P><P N="26/Name">NM1_03</P><P N="27/ID">27</P><P N="27/Name">NM1_04</P><P N="28/ID">28</P><P N="28/Name">NM1_05</P><P N="29/ID">29</P><P N="29/Name">serviceProviderFirstName</P><P N="30/ID">30</P><P N="30/Name">serviceProviderLastName</P><P N="31/ID">31</P><P N="31/Name">serviceProviderMiddleName</P><P N="32/ID">32</P><P N="32/Name">ProviderNameFlag_Payment</P><P N="33/ID">33</P><P N="33/Name">transactionControlNumber</P><P N="34/ID">34</P><P N="34/Name">PayeeName</P></Ps><Sources><ES ID="1" Type="File.ECS"><Ps><P N="Name">Source</P><P N="Location">..\Guideline\P_OB_835_DFF_SOURCE.ecs</P></Ps><CPs><CP ID="1" Pth="{P7}/Field(ID = '1.006')"/><CP ID="3" Pth="{P7}/Field(ID = '1.005')"/><CP ID="10" Pth="{P7}/Field(ID = '1.017')"/><CP ID="12" Pth="{P7}/Field(ID = '1.033')"/><CP ID="14" Pth="{P7}/Field(ID = '1.018')"/><CP ID="16" Pth="{P7}/Field(ID = '1.019')"/><CP ID="18" Pth="{P7}/Field(ID = '1.020')"/><CP ID="20" Pth="{P7}/Field(ID = '1.021')"/><CP ID="22" Pth="{P7}/Field(ID = '1.022')"/><CP ID="24" Pth="{P4}{S3000}/Field(ID = '2.079')"/><CP ID="26" Pth="{P4}{S3000}/Field(ID = '2.040')"/><CP ID="28" Pth="{P4}{S3000}/Field(ID = '2.028')"/><CP ID="30" Pth="{P4}{S3000}/Field(ID = '2.037')"/><CP ID="34" Pth="{P4}{S3000}/Field(ID = '2.003')"/><CP ID="36" Pth="{P4}{S3000}/Field(ID = '2.061')"/><CP ID="38" Pth="{P4}{S3000}/Field(ID = '2.083')"/><CP ID="40" Pth="{P4}{S3000}/Field(ID = '2.080')"/><CP ID="42" Pth="{P4}{S3000}/Field(ID = '2.081')"/><CP ID="44" Pth="{P4}{S3000}/Field(ID = '2.082')"/><CP ID="46" Pth="{P4}{S3000}/Field(ID = '2.005')"/><CP ID="51" Pth="{P4}"/><CP ID="112" Pth="{P4}{S3000}/Field(ID = '2.069')"/><CP ID="114" Pth="{P4}{S3000}/Field(ID = '2.068')"/><CP ID="118" Pth="{P7}"/><CP ID="147" Pth="{P4}{S3000}"/><CP ID="208" Pth="{P4}{S3000}/Field(ID = '2.062')"/><CP ID="210" Pth="{P4}{S3000}/Field(ID = '2.063')"/><CP ID="228" Pth="{P4}{S3000}/Field(ID = '2.051')"/><CP ID="241" Pth="{P4}{S3000}/Field(ID = '2.038')"/><CP ID="323" Pth="{P7}/Field(ID = '1.032')"/><CP ID="329" Pth="{P4}{S3000}/Field(ID = '2.025')"/><CP ID="350" Pth="/Message(ID = '835')"/><CP ID="352" Pth="/InternalProperties/Field(Name = 'SystemDateTime')"/><CP ID="361" Pth="{P4}{S3000}/Field(ID = '2.042')"/><CP ID="473" Pth="{P4}{S3001}/Field(ID = '3.003')"/><CP ID="474" Pth="{P4}{S3001}/Field(ID = '3.004')"/><CP ID="475" Pth="{P4}{S3001}/Field(ID = '3.005')"/><CP ID="476" Pth="{P4}{S3001}/Field(ID = '3.006')"/><CP ID="477" Pth="{P4}{S3001}/Field(ID = '3.007')"/><CP ID="478" Pth="{P4}{S3001}/Field(ID = '3.010')"/><CP ID="479" Pth="{P4}{S3001}/Field(ID = '3.019')"/><CP ID="480" Pth="{P4}{S3001}/Field(ID = '3.024')"/><CP ID="481" Pth="{P4}{S3001}/Field(ID = '3.031')"/><CP ID="482" Pth="{P4}{S3001}/Field(ID = '3.031.1')"/><CP ID="483" Pth="{P4}{S3001}/Field(ID = '3.031.2')"/><CP ID="484" Pth="{P4}{S3001}/Field(ID = '3.031.3')"/><CP ID="485" Pth="{P4}{S3001}/Field(ID = '3.034')"/><CP ID="488" Pth="{P4}{S3001}/Field(ID = '3.036')"/><CP ID="489" Pth="{P4}{S3001}/Field(ID = '3.037')"/><CP ID="496" Pth="{P4}{S3007}/Field(ID = '4.003')"/><CP ID="497" Pth="{P4}{S3007}/Field(ID = '4.004')"/><CP ID="498" Pth="{P4}{S3007}/Field(ID = '4.008')"/><CP ID="499" Pth="{P4}{S3007}/Field(ID = '4.009')"/><CP ID="500" Pth="{P4}{S3007}/Field(ID = '4.011')"/><CP ID="501" Pth="{P7}/Field(ID = '1.0004')"/><CP ID="502" Pth="{P4}{S3000}/Field(ID = '2.053')"/><CP ID="504" Pth="{P4}{S3000}/Field(ID = '2.052')"/><CP ID="580" Pth="/InternalProperties/Field(Name = 'isacontrolnumber')"/><CP ID="589" Pth="/InternalProperties/Field(Name = 'Environment')"/><CP ID="603" Pth="{P4}{S3001}/Field(ID = '3.033')"/><CP ID="613" Pth="{P4}{S3007}/Field(ID = '4.010')"/><CP ID="623" Pth="{P4}{S3007}/Field(ID = '4.013')"/><CP ID="624" Pth="{P4}{S3007}/Field(ID = '4.007')"/><CP ID="667" Pth="{P4}{S3000}/Field(ID = '2.016')"/><CP ID="674" Pth="/InternalProperties/Field(Name = 'ISA06_SenderID')"/><CP ID="675" Pth="/InternalProperties/Field(Name = 'ISA08_ReceiverID')"/><CP ID="676" Pth="/InternalProperties/Field(Name = 'GS02_SenderID')"/><CP ID="677" Pth="/InternalProperties/Field(Name = 'GS03_ReceiverID')"/><CP ID="678" Pth="/InternalProperties/Field(Name = 'TRN03')"/><CP ID="679" Pth="/InternalProperties/Field(Name = 'PayerName_1000AN102')"/><CP ID="680" Pth="/InternalProperties/Field(Name = 'PayerAddress')"/><CP ID="681" Pth="/InternalProperties/Field(Name = 'PayerCity')"/><CP ID="682" Pth="/InternalProperties/Field(Name = 'PayerStateCode')"/><CP ID="683" Pth="/InternalProperties/Field(Name = 'PayerZipCode')"/><CP ID="684" Pth="/InternalProperties/Field(Name = 'AdditionalPayerIdentifier_1000A_REF')"/><CP ID="685" Pth="/InternalProperties/Field(Name = 'BusinessContact_1000A_PER02')"/><CP ID="686" Pth="/InternalProperties/Field(Name = 'BusinessContact_1000A_PER04')"/><CP ID="687" Pth="/InternalProperties/Field(Name = 'BusinessContact_1000A_PER06')"/><CP ID="688" Pth="/InternalProperties/Field(Name = 'TechnicalContact_1000A_PER02')"/><CP ID="689" Pth="/InternalProperties/Field(Name = 'TechnicalContact_1000A_PER04')"/><CP ID="690" Pth="/InternalProperties/Field(Name = 'TechnicalContact_1000A_PER06')"/><CP ID="691" Pth="/InternalProperties/Field(Name = 'PayerWebSite_1000A_PER04')"/><CP ID="695" Pth="/InternalProperties/Field(Name = 'FiscalDate_PLB02')"/><CP ID="720" Pth="{P4}{S3007}"/><CP ID="744" Pth="{P4}{S3000}/Field(ID = '2.088')"/><CP ID="749" Pth="{P4}{S3000}/Field(ID = '2.089')"/><CP ID="751" Pth="{P4}{S3000}/Field(ID = '2.090')"/><CP ID="753" Pth="{P4}{S3000}/Field(ID = '2.091')"/><CP ID="757" Pth="{P4}{S3000}/Field(ID = '2.084')"/><CP ID="763" Pth="{P4}{S3000}/Field(ID = '2.087')"/><CP ID="926" Pth="{P4}{S3000}/Field(ID = '2.018')"/><CP ID="980" Pth="{P4}{S3001}"/><CP ID="1028" Pth="{P4}{S3001}/Field(ID = '3.043')"/><CP ID="1029" Pth="{P4}{S3001}/Field(ID = '3.044')"/><CP ID="1030" Pth="{P4}{S3001}/Field(ID = '3.045')"/><CP ID="1031" Pth="{P4}{S3001}/Field(ID = '3.046')"/><CP ID="1032" Pth="{P4}{S3001}/Field(ID = '3.047')"/><CP ID="1033" Pth="{P4}{S3001}/Field(ID = '3.048')"/><CP ID="1078" Pth="{P4}{S3000}/Field(ID = '2.092')"/><CP ID="1082" Pth="{P4}{S3000}/Field(ID = '2.093')"/><CP ID="1086" Pth="{P4}{S3000}/Field(ID = '2.094')"/><CP ID="1090" Pth="/InternalProperties/Field(Name = 'ProviderNameFlag_Payment')"/><CP ID="1092" Pth="/InternalProperties/Field(Name = 'transactionControlNumber')"/></ConnectionPoints/></Sources><Targets><ES ID="2" Type="File.ECS"><Ps><P N="Name">Target</P><P N="Location">..\Guideline\P_OB_835_X12_TARGET.ecs</P></Ps><Ps C="InstancedNodes"><P N="1/Path">/Transaction(ID = '835')/Loop(ID = '2000')/Loop(ID = '2100')/Segment(ID = 'DTM')</P><P N="1/Instance_1/CustomName">Statement From</P><P N="1/Instance_2/CustomName">Statement To</P><P N="2/Path">/Transaction(ID = '835')/Loop(ID = '2000')/Loop(ID = '2100')/Segment(ID = 'AMT')</P><P N="2/Instance_1/CustomName">CoverageAmount</P><P N="2/Instance_2/CustomName">InterestAmount</P></Ps><CPs><CP ID="2" Pth="{P3}/Segment(ID = 'BPR')/Element(ID = '782')"/><CP ID="4" Pth="{P3}/Segment(ID = 'BPR')/Element(ID = '373')"/><CP ID="6" Pth="{P3}/Segment(ID = 'TRN')/Element(ID = '127')"/><CP ID="8" Pth="{P3}/Segment(ID = 'TRN')/Element(ID = '481')"/><CP ID="11" Pth="{P3}{S3014}/Element(ID = '93')"/><CP ID="13" Pth="{P3}{S3014}/Element(ID = '67')"/><CP ID="15" Pth="{P3}/Loop(ID = '1000B')/Segment(ID = 'N3')/Element(ID = '166')"/><CP ID="17" Pth="{P3}/Loop(ID = '1000B')/Segment(ID = 'N3')/Element(ID = '166')[2]"/><CP ID="19" Pth="{P3}{S3016}/Element(ID = '19')"/><CP ID="21" Pth="{P3}{S3016}/Element(ID = '156')"/><CP ID="23" Pth="{P3}{S3016}/Element(ID = '116')"/><CP ID="25" Pth="{P1}/Segment(ID = 'CLP')/Element(ID = '1028')"/><CP ID="27" Pth="{P1}/Segment(ID = 'CLP')/Element(ID = '1029')"/><CP ID="29" Pth="{P1}/Segment(ID = 'CLP')/Element(ID = '782')"/><CP ID="31" Pth="{P1}/Segment(ID = 'CLP')/Element(ID = '782')[2]"/><CP ID="33" Pth="{P1}/Segment(ID = 'CLP')/Element(ID = '782')[3]"/><CP ID="35" Pth="{P1}/Segment(ID = 'CLP')/Element(ID = '127')"/><CP ID="37" Pth="{P1}/Segment(ID = 'CLP')/Element(ID = '1331')"/><CP ID="39" Pth="{P1}/Segment(ID = 'CLP')/Element(ID = '1325')"/><CP ID="41" Pth="{P1}/Segment(ID = 'NM1')/Element(ID = '1035')"/><CP ID="43" Pth="{P1}/Segment(ID = 'NM1')/Element(ID = '1036')"/><CP ID="45" Pth="{P1}/Segment(ID = 'NM1')/Element(ID = '1037')"/><CP ID="47" Pth="{P1}/Segment(ID = 'NM1')/Element(ID = '67')"/><CP ID="70" Pth="{P1}{S3002}/Composite(ID = 'C003')/Element(ID = '235')"/><CP ID="71" Pth="{P1}{S3002}/Composite(ID = 'C003')/Element(ID = '234')"/><CP ID="80" Pth="{P1}{S3002}/Element(ID = '234')"/><CP ID="98" Pth="{P1}/Loop(ID = '2110')/Segment(ID = 'DTM')/Element(ID = '374')"/><CP ID="99" Pth="{P1}/Loop(ID = '2110')/Segment(ID = 'DTM')/Element(ID = '373')"/><CP ID="113" Pth="{P1}/Segment(ID = 'CLP')/Element(ID = '1354')"/><CP ID="115" Pth="{P1}/Segment(ID = 'CLP')/Element(ID = '380')"/><CP ID="119" Pth="{P3}/Loop(ID = '1000A')/Segment(ID = 'N1')/Element(ID = '98')"/><CP ID="122" Pth="{P3}/Loop(ID = '1000A')/Segment(ID = 'N1')/Element(ID = '93')"/><CP ID="131" Pth="{P3}/Segment(ID = 'ST')/Element(ID = '143')"/><CP ID="134" Pth="{P3}/Segment(ID = 'ST')/Element(ID = '329')"/><CP ID="139" Pth="{P3}/Segment(ID = 'SE')/Element(ID = '96')"/><CP ID="142" Pth="{P3}/Segment(ID = 'ST')"/><CP ID="144" Pth="{P3}/Segment(ID = 'SE')/Element(ID = '329')"/><CP ID="151" Pth="{P3}/Loop(ID = '2000')/Segment(ID = 'LX')/Element(ID = '554')"/><CP ID="156" Pth="{P3}/Segment(ID = 'BPR')/Element(ID = '305')"/><CP ID="158" Pth="{P3}/Segment(ID = 'BPR')/Element(ID = '591')"/><CP ID="160" Pth="{P3}/Segment(ID = 'BPR')/Element(ID = '478')"/><CP ID="166" Pth="{P3}/Segment(ID = 'TRN')/Element(ID = '509')"/><CP ID="172" Pth="{P3}/Loop(ID = '1000A')"/><CP ID="174" Pth="{P3}/Loop(ID = '1000A')/Segment(ID = 'N3')/Element(ID = '166')"/><CP ID="179" Pth="{P3}{S3017}/Element(ID = '19')"/><CP ID="180" Pth="{P3}{S3017}/Element(ID = '156')"/><CP ID="181" Pth="{P3}{S3017}/Element(ID = '116')"/><CP ID="188" Pth="{P3}{S3014}/Element(ID = '66')"/><CP ID="192" Pth="{P3}{S3014}/Element(ID = '98')"/><CP ID="195" Pth="{P1}/Segment(ID = 'CLP')/Element(ID = '1032')"/><CP ID="201" Pth="{P1}/Segment(ID = 'NM1')/Element(ID = '98')"/><CP ID="204" Pth="{P1}/Segment(ID = 'NM1')/Element(ID = '1065')"/><CP ID="205" Pth="{P1}/Segment(ID = 'NM1')/Element(ID = '66')"/><CP ID="209" Pth="{P1}/Segment(ID = 'DTM'){1}/Element(ID = '373')"/><CP ID="211" Pth="{P1}/Segment(ID = 'DTM'){2}/Element(ID = '373')"/><CP ID="216" Pth="{P1}/Segment(ID = 'DTM'){2}/Element(ID = '374')"/><CP ID="219" Pth="{P1}/Segment(ID = 'DTM'){1}/Element(ID = '374')"/><CP ID="229" Pth="{P1}/Segment(ID = 'DTM')[3]/Element(ID = '373')"/><CP ID="238" Pth="{P1}/Segment(ID = 'DTM')[3]/Element(ID = '374')"/><CP ID="259" Pth="{P6}/Field(Name = 'InterchangeAuthorizationInfoQual')"/><CP ID="260" Pth="{P6}/Field(Name = 'InterchangeSecurityInfoQual')"/><CP ID="261" Pth="{P6}/Field(Name = 'InterchangeSenderQual')"/><CP ID="262" Pth="{P6}/Field(Name = 'InterchangeSenderID')"/><CP ID="263" Pth="{P6}/Field(Name = 'InterchangeReceiverQual')"/><CP ID="264" Pth="{P6}/Field(Name = 'InterchangeReceiverID')"/><CP ID="265" Pth="{P6}/Field(Name = 'InterchangeDate')"/><CP ID="266" Pth="{P6}/Field(Name = 'InterchangeTime')"/><CP ID="267" Pth="{P6}/Field(Name = 'InterchangeControlStandard_RepeatingSeparator')"/><CP ID="268" Pth="{P6}/Field(Name = 'InterchangeControlVersion')"/><CP ID="269" Pth="{P6}/Field(Name = 'InterchangeControlNumber')"/><CP ID="270" Pth="{P6}/Field(Name = 'InterchangeAckRequested')"/><CP ID="271" Pth="{P6}/Field(Name = 'InterchangeUsageIndicator')"/><CP ID="272" Pth="{P6}/Field(Name = 'SubelementDelimiter')"/><CP ID="274" Pth="{P6}/Field(Name = 'SegmentDelimiter')"/><CP ID="280" Pth="{P6}/Field(Name = 'ElementDelimiter')"/><CP ID="313" Pth="{P6}{S3010}/Field(Name = 'GroupID')"/><CP ID="314" Pth="{P6}{S3010}/Field(Name = 'GroupSenderID')"/><CP ID="315" Pth="{P6}{S3010}/Field(Name = 'GroupReceiverID')"/><CP ID="316" Pth="{P6}{S3010}/Field(Name = 'GroupDate')"/><CP ID="317" Pth="{P6}{S3010}/Field(Name = 'GroupTime')"/><CP ID="318" Pth="{P6}{S3010}/Field(Name = 'GroupControlNumber')"/><CP ID="319" Pth="{P6}{S3010}/Field(Name = 'GroupAgencyCode')"/><CP ID="320" Pth="{P6}{S3010}/Field(Name = 'GroupVersionNumber')"/><CP ID="324" Pth="{P3}/Loop(ID = '1000B')/Segment(ID = 'REF')/Element(ID = '127')"/><CP ID="327" Pth="{P3}/Loop(ID = '1000B')/Segment(ID = 'REF')/Element(ID = '128')"/><CP ID="330" Pth="{P1}/Segment(ID = 'REF')/Element(ID = '127')"/><CP ID="333" Pth="{P1}/Segment(ID = 'REF')/Element(ID = '128')"/><CP ID="339" Pth="{P3}/Loop(ID = '1000A')/Segment(ID = 'REF')/Element(ID = '128')"/><CP ID="340" Pth="{P3}/Loop(ID = '1000A')/Segment(ID = 'REF')/Element(ID = '127')"/><CP ID="347" Pth="{P1}/Loop(ID = '2110')/Segment(ID = 'REF')[2]/Element(ID = '128')"/><CP ID="353" Pth="{P3}/Segment(ID = 'DTM')/Element(ID = '373')"/><CP ID="355" Pth="{P3}/Segment(ID = 'DTM')/Element(ID = '374')"/><CP ID="362" Pth="{P1}/Segment(ID = 'DTM')[2]/Element(ID = '373')"/><CP ID="369" Pth="{P1}/Segment(ID = 'DTM')[2]/Element(ID = '374')"/><CP ID="376" Pth="{P3}{S3009}/Element(ID = '366')"/><CP ID="383" Pth="{P3}{S3008}/Element(ID = '366')"/><CP ID="390" Pth="{P3}{S3009}[3]/Element(ID = '366')"/><CP ID="393" Pth="{P3}{S3009}/Element(ID = '93')"/><CP ID="414" Pth="{P3}{S3009}/Element(ID = '365')"/><CP ID="415" Pth="{P3}{S3009}/Element(ID = '364')"/><CP ID="416" Pth="{P3}{S3009}/Element(ID = '365')[2]"/><CP ID="417" Pth="{P3}{S3009}/Element(ID = '364')[2]"/><CP ID="424" Pth="{P3}{S3008}/Element(ID = '93')"/><CP ID="441" Pth="{P3}{S3008}/Element(ID = '365')"/><CP ID="442" Pth="{P3}{S3008}/Element(ID = '364')"/><CP ID="443" Pth="{P3}{S3008}/Element(ID = '365')[2]"/><CP ID="444" Pth="{P3}{S3008}/Element(ID = '364')[2]"/><CP ID="457" Pth="{P3}{S3009}[3]/Element(ID = '365')"/><CP ID="458" Pth="{P3}{S3009}[3]/Element(ID = '364')"/><CP ID="503" Pth="{P1}/Segment(ID = 'AMT'){1}/Element(ID = '782')"/><CP ID="505" Pth="{P1}/Segment(ID = 'AMT'){2}/Element(ID = '782')"/><CP ID="512" Pth="{P1}/Segment(ID = 'AMT'){1}/Element(ID = '522')"/><CP ID="519" Pth="{P1}/Segment(ID = 'AMT'){2}/Element(ID = '522')"/><CP ID="538" Pth="{P1}{S3002}/Element(ID = '782')"/><CP ID="539" Pth="{P1}{S3002}/Element(ID = '782')[2]"/><CP ID="540" Pth="{P1}{S3002}/Element(ID = '380')"/><CP ID="545" Pth="{P1}{S3002}/Composite(ID = 'C003')/Element(ID = '1339')"/><CP ID="546" Pth="{P1}{S3002}/Composite(ID = 'C003')/Element(ID = '1339')[2]"/><CP ID="547" Pth="{P1}{S3002}/Composite(ID = 'C003')/Element(ID = '1339')[3]"/><CP ID="548" Pth="{P1}{S3002}/Composite(ID = 'C003')/Element(ID = '1339')[4]"/><CP ID="551" Pth="{P1}{S3002}/Element(ID = '380')[2]"/><CP ID="552" Pth="{P1}/Loop(ID = '2110')/Segment(ID = 'REF')[2]/Element(ID = '127')"/><CP ID="562" Pth="{P1}{S3003}/Element(ID = '1033')"/><CP ID="563" Pth="{P1}{S3003}/Element(ID = '1034')"/><CP ID="564" Pth="{P1}{S3003}/Element(ID = '782')"/><CP ID="565" Pth="{P1}{S3003}/Element(ID = '1034')[2]"/><CP ID="566" Pth="{P1}{S3003}/Element(ID = '782')[2]"/><CP ID="567" Pth="{P1}{S3003}/Element(ID = '1034')[3]"/><CP ID="568" Pth="{P1}{S3003}/Element(ID = '782')[3]"/><CP ID="569" Pth="{P1}{S3003}/Element(ID = '1034')[4]"/><CP ID="570" Pth="{P1}{S3003}/Element(ID = '782')[4]"/><CP ID="575" Pth="{P1}{S3003}/Element(ID = '1034')[5]"/><CP ID="576" Pth="{P1}{S3003}/Element(ID = '782')[5]"/><CP ID="577" Pth="{P1}{S3003}/Element(ID = '1034')[6]"/><CP ID="578" Pth="{P1}{S3003}/Element(ID = '782')[6]"/><CP ID="594" Pth="{P1}/Segment(ID = 'AMT'){1}"/><CP ID="600" Pth="{P1}/Segment(ID = 'AMT'){2}"/><CP ID="608" Pth="{P1}/Loop(ID = '2110')/Segment(ID = 'AMT')/Element(ID = '522')"/><CP ID="609" Pth="{P1}/Loop(ID = '2110')/Segment(ID = 'AMT')/Element(ID = '782')"/><CP ID="610" Pth="{P1}/Loop(ID = '2110')/Segment(ID = 'LQ')/Element(ID = '1270')"/><CP ID="611" Pth="{P1}/Loop(ID = '2110')/Segment(ID = 'LQ')/Element(ID = '1271')"/><CP ID="628" Pth="{P3}/Segment(ID = 'PLB')/Composite(ID = 'C042')/Element(ID = '127')"/><CP ID="629" Pth="{P3}/Segment(ID = 'PLB')/Composite(ID = 'C042')/Element(ID = '426')"/><CP ID="630" Pth="{P3}/Segment(ID = 'PLB')/Element(ID = '782')"/><CP ID="631" Pth="{P3}/Segment(ID = 'PLB')/Element(ID = '127')"/><CP ID="633" Pth="{P3}/Segment(ID = 'PLB')/Element(ID = '373')"/><CP ID="659" Pth="{P1}{S3011}/Element(ID = '98')"/><CP ID="660" Pth="{P1}{S3011}/Element(ID = '1065')"/><CP ID="662" Pth="{P1}{S3011}/Element(ID = '1035')"/><CP ID="666" Pth="{P1}{S3011}/Element(ID = '66')"/><CP ID="669" Pth="{P1}{S3011}/Element(ID = '67')"/><CP ID="729" Pth="{P1}{S3012}/Element(ID = '1035')"/><CP ID="730" Pth="{P1}{S3012}/Element(ID = '1036')"/><CP ID="731" Pth="{P1}{S3012}/Element(ID = '1037')"/><CP ID="732" Pth="{P1}{S3012}/Element(ID = '1065')"/><CP ID="733" Pth="{P1}{S3012}/Element(ID = '98')"/><CP ID="734" Pth="{P1}{S3012}/Element(ID = '67')"/><CP ID="735" Pth="{P1}{S3012}/Element(ID = '66')"/><CP ID="742" Pth="{P1}{S3013}/Element(ID = '98')"/><CP ID="743" Pth="{P1}{S3013}/Element(ID = '1065')"/><CP ID="745" Pth="{P1}{S3013}/Element(ID = '67')"/><CP ID="746" Pth="{P1}{S3013}/Element(ID = '66')"/><CP ID="748" Pth="{P1}{S3013}/Element(ID = '1035')"/><CP ID="750" Pth="{P1}{S3013}/Element(ID = '1036')"/><CP ID="752" Pth="{P1}{S3013}/Element(ID = '1037')"/><CP ID="1040" Pth="{P1}{S3002}/Composite(ID = 'C003')[2]/Element(ID = '235')"/><CP ID="1041" Pth="{P1}{S3002}/Composite(ID = 'C003')[2]/Element(ID = '234')"/><CP ID="1042" Pth="{P1}{S3002}/Composite(ID = 'C003')[2]/Element(ID = '1339')"/><CP ID="1043" Pth="{P1}{S3002}/Composite(ID = 'C003')[2]/Element(ID = '1339')[2]"/><CP ID="1044" Pth="{P1}{S3002}/Composite(ID = 'C003')[2]/Element(ID = '1339')[3]"/><CP ID="1045" Pth="{P1}{S3002}/Composite(ID = 'C003')[2]/Element(ID = '1339')[4]"/><CP ID="1047" Pth="{P1}/Segment(ID = 'NM1')/Element(ID = '1039')"/><CP ID="1075" Pth="{P1}{S3011}/Element(ID = '1036')"/><CP ID="1076" Pth="{P1}{S3011}/Element(ID = '1037')"/></CPs><ReverseConnectionPoints><CP ID="242" O="13"/><CP ID="143" O="142"/><CP ID="173" O="172"/><CP ID="595" O="594"/><CP ID="601" O="600"/></ReverseConnectionPoints/></Targets><Fs><F ID="1" N="Set Value-TRN01" T="SetValue"><Ps C="GlobalUserNotes"><P N="{5e68c831-be3c-4cdc-b6d8-d0d650ed7fca}">TRN01 value hardcoded as 1.</P></Ps><CPs><CP ID="9" FP="A" N="v" DirectValue="1"/><CP ID="7" FP="X" N="r"/></ConnectionPoints/><F ID="11" N="Set Value-N101" T="SetValue"><CPs><CP ID="117" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="120" FP="A" N="v" DirectValue="PR"/><CP ID="116" FP="X" N="r"/></ConnectionPoints/><F ID="13" N="Set Value-ST01" T="SetValue"><CPs><CP ID="130" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="132" FP="A" N="v" DirectValue="835"/><CP ID="129" FP="X" N="r"/></ConnectionPoints/><F ID="14" N="Set Value-ST02_SE02" T="SetValue"><CPs><CP ID="349" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="135" FP="A" N="v" DirectValue="#ControlNumber#"/><CP ID="133" FP="X" N="r"/></ConnectionPoints/><F ID="15" N="Set Value-SE01" T="SetValue"><Ps C="GlobalUserNotes"><P N="{5e68c831-be3c-4cdc-b6d8-d0d650ed7fca}">No of segments can be calculated using the macro #RecordCount#.</P></Ps><CPs><CP ID="137" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="138" FP="A" N="v" DirectValue="#RecordCount#"/><CP ID="136" FP="X" N="r"/></ConnectionPoints/><F ID="17" T="Increment"><Ps C="S"><P N="variableID">1</P></Ps><CPs><CP ID="146" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="18" N="Set Value-LX01" T="SetValue"><CPs><CP ID="150" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="152" FP="A" N="v" DirectValue="{1}"/><CP ID="149" FP="X" N="r"/></ConnectionPoints/><F ID="19" N="Conditional Copy - BPR" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">153</P><P N="if_1/conditions/expression_1/arg1/type">2</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">0</P><P N="if_1/actions/assignment_1/lvalue">154</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">153</P><P N="if_1/actions/assignment_1/rvalue/type">2</P><P N="if_1/actions/assignment_2/lvalue">155</P><P N="if_1/actions/assignment_2/lvalue/type">2</P><P N="if_1/actions/assignment_2/rvalue">H</P><P N="if_1/actions/assignment_3/lvalue">157</P><P N="if_1/actions/assignment_3/lvalue/type">2</P><P N="if_1/actions/assignment_3/rvalue">NON</P><P N="else/actions/assignment_1/lvalue">154</P><P N="else/actions/assignment_1/lvalue/type">2</P><P N="else/actions/assignment_1/rvalue">153</P><P N="else/actions/assignment_1/rvalue/type">2</P><P N="else/actions/assignment_2/lvalue">155</P><P N="else/actions/assignment_2/lvalue/type">2</P><P N="else/actions/assignment_2/rvalue">I</P><P N="else/actions/assignment_3/lvalue">157</P><P N="else/actions/assignment_3/lvalue/type">2</P><P N="else/actions/assignment_3/rvalue">CHK</P></Ps><CPs><CP ID="153" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="154" FP="X" P="0" N="result1"/><CP ID="155" FP="X" P="1" N="result2"/><CP ID="157" FP="X" P="2" N="result3"/></ConnectionPoints/><F ID="20" N="Set Value-BPR03" T="SetValue"><CPs><CP ID="161" FP="A" N="v" DirectValue="C"/><CP ID="159" FP="X" N="r"/></ConnectionPoints/><F ID="21" N="Convert Date/Time-BPR16" T="ConvertDateTime"><Ps C="S"><P N="in_format">MMddyyyy</P><P N="out_format">CCYYMMDD</P><P N="out_format_spec">1</P></Ps><CPs><CP ID="162" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="163" FP="X" N="r"/></ConnectionPoints/><F ID="30" N="Set Value-N103" T="SetValue"><CPs><CP ID="189" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="190" FP="A" N="v" DirectValue="XX"/><CP ID="187" FP="X" N="r"/></ConnectionPoints/><F ID="31" N="Set Value-N101" T="SetValue"><CPs><CP ID="193" FP="A" N="v" DirectValue="PE"/><CP ID="191" FP="X" N="r"/></ConnectionPoints/><F ID="32" N="Set Value-CLP06" T="SetValue"><CPs><CP ID="196" FP="A" N="v" DirectValue="HM"/><CP ID="194" FP="X" N="r"/></ConnectionPoints/><F ID="37" N="Set Value-DTM01-StatementFrom" T="SetValue"><CPs><CP ID="217" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="220" FP="A" N="v" DirectValue="232"/><CP ID="212" FP="X" N="r"/></ConnectionPoints/><F ID="39" N="Set Value-DTM01-StatementTo" T="SetValue"><CPs><CP ID="215" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="221" FP="A" N="v" DirectValue="233"/><CP ID="214" FP="X" N="r"/></ConnectionPoints/><F ID="46" N="JS-ISA" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">// This Javascript is used for mapping all ISA Fields except ISA06 and ISA08
var controlNumber = ec_VariableHelper.GetVariable(&quot;ISA_CNTRL_NUM&quot;);
var systemDateTime = ec_VariableHelper.GetVariable(&quot;SYS_DATE_TIME&quot;);
var environment = ec_VariableHelper.GetVariable(&quot;ENVIRONMENT&quot;);
var interchangeDate = systemDateTime.substr(2,6);
var interchangeTime = systemDateTime.substr(8,4);
ec_ResultHelper.ReportResultByName(&quot;ISA01&quot;,&quot;00&quot;);
ec_ResultHelper.ReportResultByName(&quot;ISA03&quot;,&quot;00&quot;);
ec_ResultHelper.ReportResultByName(&quot;ISA05&quot;,&quot;ZZ&quot;);
ec_ResultHelper.ReportResultByName(&quot;ISA07&quot;,&quot;ZZ&quot;);
ec_ResultHelper.ReportResultByName(&quot;ISA09&quot;,interchangeDate);
ec_ResultHelper.ReportResultByName(&quot;ISA10&quot;,interchangeTime);
ec_ResultHelper.ReportResultByName(&quot;ISA11&quot;,&quot;^&quot;);
ec_ResultHelper.ReportResultByName(&quot;ISA12&quot;,&quot;00501&quot;);
ec_ResultHelper.ReportResultByName(&quot;ISA13&quot;,controlNumber);
ec_ResultHelper.ReportResultByName(&quot;ISA14&quot;,&quot;0&quot;);
ec_ResultHelper.ReportResultByName(&quot;ISA15&quot;,environment);
ec_ResultHelper.ReportResultByName(&quot;ISA16&quot;,&quot;:&quot;);
</P></Ps><CPs><CP ID="254" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="243" FP="A" P="0" N="value1"/><CP ID="244" FP="X" P="0" N="ISA01"/><CP ID="245" FP="X" P="1" N="ISA03"/><CP ID="246" FP="X" P="2" N="ISA05"/><CP ID="247" FP="X" P="3" N="ISA06"/><CP ID="248" FP="X" P="4" N="ISA07"/><CP ID="249" FP="X" P="5" N="ISA08"/><CP ID="250" FP="X" P="6" N="ISA09"/><CP ID="251" FP="X" P="7" N="ISA10"/><CP ID="252" FP="X" P="8" N="ISA11"/><CP ID="253" FP="X" P="9" N="ISA12"/><CP ID="255" FP="X" P="10" N="ISA13"/><CP ID="256" FP="X" P="11" N="ISA14"/><CP ID="257" FP="X" P="12" N="ISA15"/><CP ID="258" FP="X" P="13" N="ISA16"/></ConnectionPoints/><F ID="47" T="SetValue"><CPs><CP ID="275" FP="A" N="v" DirectValue="~"/><CP ID="273" FP="X" N="r"/></ConnectionPoints/><F ID="49" T="SetValue"><CPs><CP ID="279" FP="A" N="v" DirectValue="*"/><CP ID="278" FP="X" N="r"/></ConnectionPoints/><F ID="51" N="JS-GS" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">// This Javascript is used for mapping all GS Fields
var controlNumber = ec_VariableHelper.GetVariable(&quot;ISA_CNTRL_NUM&quot;);
var systemDateTime = ec_VariableHelper.GetVariable(&quot;SYS_DATE_TIME&quot;);
var groupDate = systemDateTime.substr(0,8);
var groupTime = systemDateTime.substr(8,6);
ec_ResultHelper.ReportResultByName(&quot;GS01&quot;,&quot;HP&quot;);
//ec_ResultHelper.ReportResultByName(&quot;GS02&quot;,&quot;1234&quot;);
//ec_ResultHelper.ReportResultByName(&quot;GS03&quot;,&quot;Product&quot;);
ec_ResultHelper.ReportResultByName(&quot;GS04&quot;,groupDate);
ec_ResultHelper.ReportResultByName(&quot;GS05&quot;,groupTime);
ec_ResultHelper.ReportResultByName(&quot;GS06&quot;,controlNumber);
ec_ResultHelper.ReportResultByName(&quot;GS07&quot;,&quot;X&quot;);
ec_ResultHelper.ReportResultByName(&quot;GS08&quot;,&quot;005010X221A1&quot;);
</P></Ps><CPs><CP ID="311" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="312" FP="A" P="0" N="value1"/><CP ID="297" FP="X" P="0" N="GS01"/><CP ID="298" FP="X" P="1" N="GS02"/><CP ID="299" FP="X" P="2" N="GS03"/><CP ID="300" FP="X" P="3" N="GS04"/><CP ID="301" FP="X" P="4" N="GS05"/><CP ID="302" FP="X" P="5" N="GS06"/><CP ID="303" FP="X" P="6" N="GS07"/><CP ID="304" FP="X" P="7" N="GS08"/></ConnectionPoints/><F ID="52" N="Name Normalization-REF02" T="NameNormalization"><CPs><CP ID="321" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="322" FP="X" N="r"/></ConnectionPoints/><F ID="53" N="Set Value-REF01" T="SetValue"><CPs><CP ID="326" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="328" FP="A" N="v" DirectValue="TJ"/><CP ID="325" FP="X" N="r"/></ConnectionPoints/><F ID="54" N="Set Value-REF01-OtherClaimRelatedIdentification" T="SetValue"><CPs><CP ID="332" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="334" FP="A" N="v" DirectValue="1L"/><CP ID="331" FP="X" N="r"/></ConnectionPoints/><F ID="55" N="Set Value-REF01" T="SetValue"><CPs><CP ID="338" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="341" FP="A" N="v" DirectValue="2U"/><CP ID="335" FP="X" N="r"/></ConnectionPoints/><F ID="59" N="Set Value-DTM01" T="SetValue"><CPs><CP ID="356" FP="A" N="v" DirectValue="405"/><CP ID="354" FP="X" N="r"/></ConnectionPoints/><F ID="65" N="Set Value-PER01-Business" T="SetValue"><CPs><CP ID="374" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="375" FP="A" N="v" DirectValue="CX"/><CP ID="373" FP="X" N="r"/></ConnectionPoints/><F ID="67" N="Set Value-PER01-Technical" T="SetValue"><CPs><CP ID="381" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="382" FP="A" N="v" DirectValue="BL"/><CP ID="380" FP="X" N="r"/></ConnectionPoints/><F ID="69" N="Set Value-PER01-WebSite" T="SetValue"><CPs><CP ID="388" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="389" FP="A" N="v" DirectValue="IC"/><CP ID="387" FP="X" N="r"/></ConnectionPoints/><F ID="74" N="Set Value-PER03-Business" T="SetValue"><CPs><CP ID="401" FP="A" N="v" DirectValue="TE"/><CP ID="400" FP="X" N="r"/></ConnectionPoints/><F ID="78" N="Set Value-PER05-Business" T="SetValue"><CPs><CP ID="409" FP="A" N="v" DirectValue="EM"/><CP ID="408" FP="X" N="r"/></ConnectionPoints/><F ID="87" N="Set Value-PER03-Technical" T="SetValue"><CPs><CP ID="434" FP="A" N="v" DirectValue="TE"/><CP ID="433" FP="X" N="r"/></ConnectionPoints/><F ID="89" N="Set Value-PER05-Technical" T="SetValue"><CPs><CP ID="438" FP="A" N="v" DirectValue="EM"/><CP ID="437" FP="X" N="r"/></ConnectionPoints/><F ID="95" N="Set Value-PER03-WebSite" T="SetValue"><CPs><CP ID="454" FP="A" N="v" DirectValue="UR"/><CP ID="453" FP="X" N="r"/></ConnectionPoints/><F ID="97" N="JS-RecordType3-IP" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">// This Javascript is used for creating a recordset for RecordType 0003
var a1 = ec_VariableHelper.GetRecordSet(&quot;RecordType3&quot;);
var b1 = new Array();
for (var i = 0; i &lt; ec_DataHelper.GetInputsCount(); i++)
{
b1[i] = ec_DataHelper.GetValueByIndex(i);
}
a1.insertRow();
a1.updateRow(b1);
ec_VariableHelper.SetRecordSet(&quot;RecordType3&quot;, a1, true);</P></Ps><CPs><CP ID="459" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="461" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="462" FP="A" P="2" N="value3"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="463" FP="A" P="3" N="value4"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="464" FP="A" P="4" N="value5"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="465" FP="A" P="5" N="value6"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="466" FP="A" P="6" N="value7"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="467" FP="A" P="7" N="value8"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="468" FP="A" P="8" N="value9"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="469" FP="A" P="9" N="value10"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="470" FP="A" P="10" N="value11"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="471" FP="A" P="11" N="value12"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="472" FP="A" P="12" N="value13"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="486" FP="A" P="13" N="value14"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="487" FP="A" P="14" N="value15"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="602" FP="A" P="15" N="value16"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1022" FP="A" P="16" N="value17"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1023" FP="A" P="17" N="value18"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1024" FP="A" P="18" N="value19"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1025" FP="A" P="19" N="value20"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1026" FP="A" P="20" N="value21"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1027" FP="A" P="21" N="value22"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="460" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="98" N="JS-RecordType4-IP" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">// This Javascript is used for creating a recordset for RecordType 0004
var a1 = ec_VariableHelper.GetRecordSet(&quot;RecordType4&quot;);
var b1 = new Array();
for (var i = 0; i &lt; ec_DataHelper.GetInputsCount(); i++)
{
b1[i] = ec_DataHelper.GetValueByIndex(i);
}
a1.insertRow();
a1.updateRow(b1);
ec_VariableHelper.SetRecordSet(&quot;RecordType4&quot;, a1, true);</P></Ps><CPs><CP ID="490" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="492" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="493" FP="A" P="2" N="value3"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="494" FP="A" P="3" N="value4"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="495" FP="A" P="4" N="value5"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="612" FP="A" P="5" N="value6"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="491" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="100" N="Set Value-AMT01-SupplementalInfo" T="SetValue"><CPs><CP ID="510" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="511" FP="A" N="v" DirectValue="AU"/><CP ID="509" FP="X" N="r"/></ConnectionPoints/><F ID="102" N="Set Value-AMT01-SupplementalInfo" T="SetValue"><CPs><CP ID="517" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="518" FP="A" N="v" DirectValue="I"/><CP ID="516" FP="X" N="r"/></ConnectionPoints/><F ID="103" N="JS-2110-OP" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">//This javascript is used for mapping 2110 loop in target.
var fromDate = &quot;&quot;;
var toDate = &quot;&quot;;
var procedureCode = &quot;&quot;;
var chargeAmount = &quot;&quot;;
var paidAmount = &quot;&quot;;
var units = &quot;&quot;;
var modifier1 = &quot;&quot;;
var modifier2 = &quot;&quot;;
var modifier3 = &quot;&quot;;
var modifier4 = &quot;&quot;;
var revenueCode = &quot;&quot;;
var originalUnits = &quot;&quot;;
var lineItemControlNumber = &quot;&quot;;
var allowedAmount = &quot;&quot;;
var adjClmNum = &quot;&quot;;
var adjClmLineNum = &quot;&quot;;
var adjAmount = &quot;&quot;;
var adjReasonCode = &quot;&quot;;
var adjGroupCode = &quot;&quot;;
var adjRarc = &quot;&quot;;
var bundlingServiceCodeQual = &quot;&quot;;
var bundlingServiceCode = &quot;&quot;;
var bundlingModifier1 = &quot;&quot;;
var bundlingModifier2 = &quot;&quot;;
var bundlingModifier3 = &quot;&quot;;
var bundlingModifier4 = &quot;&quot;;
//Get Recordset for Record Type 0003
var lineDetails = ec_VariableHelper.GetRecordSet(&quot;RecordType3&quot;);
lineDetails.last();
var rowNum = lineDetails.getRow();
//traverse through each row in the record set &quot;RecordType3&quot;
while(rowNum &gt; 0)
{
var clmNum = lineDetails.getString(1);
var clmLineNum = lineDetails.getString(2);
if((clmNum != &quot;&quot;) &amp;&amp; (clmLineNum != &quot;&quot;))
{
fromDate = lineDetails.getString(3);
toDate = lineDetails.getString(4);
procedureCode = lineDetails.getString(5);
chargeAmount = lineDetails.getString(6);
paidAmount = lineDetails.getString(7);
units = lineDetails.getString(8);
modifier1 = lineDetails.getString(9);
modifier2 = lineDetails.getString(10);
modifier3 = lineDetails.getString(11);
modifier4 = lineDetails.getString(12);
revenueCode = lineDetails.getString(13);
originalUnits = lineDetails.getString(14);
lineItemControlNumber = lineDetails.getString(15);
allowedAmount = lineDetails.getString(16);
bundlingServiceCodeQual = lineDetails.getString(17);
bundlingServiceCode = lineDetails.getString(18);
bundlingModifier1 = lineDetails.getString(19);
bundlingModifier2 = lineDetails.getString(20);
bundlingModifier3 = lineDetails.getString(21);
bundlingModifier4 = lineDetails.getString(22);
if(procedureCode != &quot;&quot;)
{
ec_ResultHelper.ReportResultByIndex(0,&quot;HC&quot;);
ec_ResultHelper.ReportResultByIndex(1,procedureCode);
ec_ResultHelper.ReportResultByIndex(2,revenueCode);
}
else if (revenueCode != &quot;&quot;)
{
ec_ResultHelper.ReportResultByIndex(0,&quot;NU&quot;);
ec_ResultHelper.ReportResultByIndex(1,revenueCode);
}
if(fromDate == toDate)
{
if(fromDate != &quot;&quot;)
{
ec_ResultHelper.ReportResultByIndex(3,&quot;472&quot;);
ec_ResultHelper.ReportResultByIndex(4,fromDate);
}
}
else
{
if(fromDate != &quot;&quot;)
{
ec_ResultHelper.ReportResultByIndex(3,&quot;150&quot;);
ec_ResultHelper.ReportResultByIndex(4,fromDate);
}
ec_ResultHelper.Send();
if(toDate != &quot;&quot;)
{
ec_ResultHelper.ReportResultByIndex(3,&quot;151&quot;);
ec_ResultHelper.ReportResultByIndex(4,toDate);
}
}
ec_ResultHelper.ReportResultByIndex(5,chargeAmount);
ec_ResultHelper.ReportResultByIndex(6,paidAmount);
if(units != &quot;1&quot;)
{
ec_ResultHelper.ReportResultByIndex(7,units);
}
ec_ResultHelper.ReportResultByIndex(8,modifier1);
ec_ResultHelper.ReportResultByIndex(9,modifier2);
ec_ResultHelper.ReportResultByIndex(10,modifier3);
ec_ResultHelper.ReportResultByIndex(11,modifier4);
if((procedureCode) != (bundlingServiceCode))
{
if(bundlingServiceCode != &quot;&quot;)
{
if(bundlingServiceCodeQual != &quot;&quot;) ec_ResultHelper.ReportResultByIndex(32,bundlingServiceCodeQual);
else ec_ResultHelper.ReportResultByIndex(32,&quot;HC&quot;);
ec_ResultHelper.ReportResultByIndex(33,bundlingServiceCode);
ec_ResultHelper.ReportResultByIndex(34,bundlingModifier1);
ec_ResultHelper.ReportResultByIndex(35,bundlingModifier2);
ec_ResultHelper.ReportResultByIndex(36,bundlingModifier3);
ec_ResultHelper.ReportResultByIndex(37,bundlingModifier4);
}
}
if(originalUnits != units)
{
ec_ResultHelper.ReportResultByIndex(12,originalUnits);
}
if(lineItemControlNumber != &quot;&quot;)
{
ec_ResultHelper.ReportResultByIndex(13,&quot;6R&quot;);
ec_ResultHelper.ReportResultByIndex(14,lineItemControlNumber);
}
if((allowedAmount != &quot;&quot;) &amp;&amp; (allowedAmount &gt; 0))
{
ec_ResultHelper.ReportResultByIndex(28,&quot;B6&quot;);
ec_ResultHelper.ReportResultByIndex(29,allowedAmount);
}
//CAS segment mapping
var adjDetails = ec_VariableHelper.GetRecordSet(&quot;RecordType4&quot;);
adjDetails.last();
var adjRowNum = adjDetails.getRow();
var outIndex = 15;
var previousCAGC = &quot;&quot;;
while(adjRowNum &gt; 0)
{
var adjClmNum = adjDetails.getString(1);
var adjClmLineNum = adjDetails.getString(2);
var adjRarc = adjDetails.getString(6);
if((clmNum == adjClmNum) &amp;&amp; (clmLineNum == adjClmLineNum))
{
adjAmount = adjDetails.getString(3);
adjReasonCode = adjDetails.getString(4);
adjGroupCode = adjDetails.getString(5);
currentCAGC = adjGroupCode;
if((currentCAGC != previousCAGC)||(outIndex &gt;= 27))
{
outIndex = 15;
previousCAGC = currentCAGC;
ec_ResultHelper.ReportResultByIndex(outIndex++, adjGroupCode);
ec_ResultHelper.ReportResultByIndex(outIndex++, adjReasonCode);
ec_ResultHelper.ReportResultByIndex(outIndex++, adjAmount);
adjDetails.deleteRow();
adjRowNum = adjDetails.getRow();
}
if(adjRarc != &quot;&quot;)
{
ec_ResultHelper.ReportResultByIndex(30,&quot;HE&quot;);
ec_ResultHelper.ReportResultByIndex(31,adjRarc);
}
//Re iterate through the Record Type 0004 record set to check whether same group code is repeating for a particular servie line.
while(adjRowNum &gt; 0)
{
adjRarc = adjDetails.getString(6);
adjClmLineNum = adjDetails.getString(2);
adjAmount = adjDetails.getString(3);
adjReasonCode = adjDetails.getString(4);
adjGroupCode = adjDetails.getString(5);
if((currentCAGC == adjGroupCode) &amp;&amp; (outIndex&lt;27) &amp;&amp; (clmLineNum == adjClmLineNum))
{
ec_ResultHelper.ReportResultByIndex(outIndex++, adjReasonCode);
ec_ResultHelper.ReportResultByIndex(outIndex++, adjAmount);
adjDetails.deleteRow();
if(adjRarc != &quot;&quot;)
{
ec_ResultHelper.ReportResultByIndex(30,&quot;HE&quot;);
ec_ResultHelper.ReportResultByIndex(31,adjRarc);
}
}
ec_ResultHelper.Send();
adjDetails.previous();
adjRowNum = adjDetails.getRow();
}
ec_ResultHelper.Send();
}
adjDetails.previous();
adjRowNum = adjDetails.getRow();
}
}
ec_ResultHelper.Send();
lineDetails.previous();
rowNum = lineDetails.getRow();
}</P></Ps><CPs><CP ID="522" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="520" FP="A" P="0" N="value1"/><CP ID="521" FP="X" P="0" N="result1"/><CP ID="523" FP="X" P="1" N="result2"/><CP ID="524" FP="X" P="2" N="result3"/><CP ID="525" FP="X" P="3" N="result4"/><CP ID="533" FP="X" P="4" N="result5"/><CP ID="534" FP="X" P="5" N="result6"/><CP ID="535" FP="X" P="6" N="result7"/><CP ID="536" FP="X" P="7" N="result8"/><CP ID="537" FP="X" P="8" N="result9"/><CP ID="541" FP="X" P="9" N="result10"/><CP ID="542" FP="X" P="10" N="result11"/><CP ID="543" FP="X" P="11" N="result12"/><CP ID="544" FP="X" P="12" N="result13"/><CP ID="549" FP="X" P="13" N="result14"/><CP ID="550" FP="X" P="14" N="result15"/><CP ID="553" FP="X" P="15" N="result16"/><CP ID="554" FP="X" P="16" N="result17"/><CP ID="555" FP="X" P="17" N="result18"/><CP ID="556" FP="X" P="18" N="result19"/><CP ID="557" FP="X" P="19" N="result20"/><CP ID="558" FP="X" P="20" N="result21"/><CP ID="559" FP="X" P="21" N="result22"/><CP ID="560" FP="X" P="22" N="result23"/><CP ID="561" FP="X" P="23" N="result24"/><CP ID="571" FP="X" P="24" N="result25"/><CP ID="572" FP="X" P="25" N="result26"/><CP ID="573" FP="X" P="26" N="result27"/><CP ID="574" FP="X" P="27" N="result28"/><CP ID="604" FP="X" P="28" N="result29"/><CP ID="605" FP="X" P="29" N="result30"/><CP ID="606" FP="X" P="30" N="result31"/><CP ID="607" FP="X" P="31" N="result32"/><CP ID="1034" FP="X" P="32" N="result33"/><CP ID="1035" FP="X" P="33" N="result34"/><CP ID="1036" FP="X" P="34" N="result35"/><CP ID="1037" FP="X" P="35" N="result36"/><CP ID="1038" FP="X" P="36" N="result37"/><CP ID="1039" FP="X" P="37" N="result38"/></ConnectionPoints/><F ID="106" N="JS-ClearRS" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">// This Javascript is used for clear the recordset for RecordType 0003 and Record Type 0004
var lineDetails = ec_VariableHelper.GetRecordSet(&quot;RecordType3&quot;);
lineDetails.clear();
var adjDetails = ec_VariableHelper.GetRecordSet(&quot;RecordType4&quot;);
adjDetails.clear();</P></Ps><CPs><CP ID="532" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="530" FP="A" P="0" N="value1"/><CP ID="531" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="107" T="ChangeVariable"><Ps C="S"><P N="variableID">2</P></Ps><CPs><CP ID="579" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="109" N="Set Value-DTM02" T="SetValue"><Ps C="GlobalUserNotes"><P N="{5e68c831-be3c-4cdc-b6d8-d0d650ed7fca}">TRN01 value hardcoded as 1.</P></Ps><CPs><CP ID="585" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="584" FP="A" N="v" DirectValue="{3}"/><CP ID="583" FP="X" N="r"/></ConnectionPoints/><F ID="111" T="ChangeVariable"><Ps C="S"><P N="variableID">4</P></Ps><CPs><CP ID="587" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="112" T="ChangeVariable"><Ps C="S"><P N="variableID">3</P></Ps><CPs><CP ID="588" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="113" N="Substring-DTM02" T="Substring"><Ps C="S"><P N="start">0</P><P N="length">8</P></Ps><CPs><CP ID="590" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="591" FP="X" N="r"/></ConnectionPoints/><F ID="114" N="Conditional Copy-AMT02-SupplementalInfo" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">592</P><P N="if_1/conditions/expression_1/arg1/type">2</P><P N="if_1/conditions/expression_1/operation">1</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">0</P><P N="if_1/actions/assignment_1/lvalue">593</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">592</P><P N="if_1/actions/assignment_1/rvalue/type">2</P></Ps><CPs><CP ID="592" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="593" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="116" N="Conditional Copy-AMT02-SupplementalInfo" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">599</P><P N="if_1/conditions/expression_1/arg1/type">2</P><P N="if_1/conditions/expression_1/operation">1</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">0</P><P N="if_1/actions/assignment_1/lvalue">598</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">599</P><P N="if_1/actions/assignment_1/rvalue/type">2</P></Ps><CPs><CP ID="599" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="598" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="117" T="ChangeVariable"><Ps C="S"><P N="variableID">5</P></Ps><CPs><CP ID="614" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="119" T="ChangeVariable"><Ps C="S"><P N="variableID">5</P></Ps><CPs><CP ID="617" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="616" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="120" N="Conditional Copy-PLB" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">618</P><P N="if_1/conditions/expression_1/arg1/type">2</P><P N="if_1/conditions/expression_1/operation">1</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/actions/assignment_1/lvalue">619</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">618</P><P N="if_1/actions/assignment_1/rvalue/type">2</P><P N="if_1/actions/assignment_2/lvalue">625</P><P N="if_1/actions/assignment_2/lvalue/type">2</P><P N="if_1/actions/assignment_2/rvalue">620</P><P N="if_1/actions/assignment_2/rvalue/type">2</P><P N="if_1/actions/assignment_3/lvalue">626</P><P N="if_1/actions/assignment_3/lvalue/type">2</P><P N="if_1/actions/assignment_3/rvalue">621</P><P N="if_1/actions/assignment_3/rvalue/type">2</P><P N="if_1/actions/assignment_4/lvalue">627</P><P N="if_1/actions/assignment_4/lvalue/type">2</P><P N="if_1/actions/assignment_4/rvalue">5</P><P N="if_1/actions/assignment_4/rvalue/type">1</P><P N="if_1/actions/assignment_5/lvalue">722</P><P N="if_1/actions/assignment_5/lvalue/type">2</P><P N="if_1/actions/assignment_5/rvalue">7</P><P N="if_1/actions/assignment_5/rvalue/type">1</P></Ps><CPs><CP ID="618" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="620" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="621" FP="A" P="2" N="value3"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="619" FP="X" P="0" N="result1"/><CP ID="625" FP="X" P="1" N="result2"/><CP ID="626" FP="X" P="2" N="result3"/><CP ID="627" FP="X" P="3" N="result4"/><CP ID="722" FP="X" P="4" N="result5"/></ConnectionPoints/><F ID="128" N="Conditional Copy-PLB02" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">692</P><P N="if_1/conditions/expression_1/arg1/type">2</P><P N="if_1/conditions/expression_1/operation">1</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/actions/assignment_1/lvalue">693</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">692</P><P N="if_1/actions/assignment_1/rvalue/type">2</P></Ps><CPs><CP ID="692" FP="A" P="0" N="value1"/><CP ID="693" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="129" T="ChangeVariable"><Ps C="S"><P N="variableID">6</P></Ps><CPs><CP ID="694" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="131" N="Conditional Copy-PatientOwnedAmt-CLP05" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">698</P><P N="if_1/conditions/expression_1/arg1/type">2</P><P N="if_1/conditions/expression_1/operation">1</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">0</P><P N="if_1/actions/assignment_1/lvalue">699</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">698</P><P N="if_1/actions/assignment_1/rvalue/type">2</P></Ps><CPs><CP ID="698" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="699" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="132" N="Convert Date/Time-StatementFrom" T="ConvertDateTime"><Ps C="S"><P N="in_format">yyyy-MM-dd</P><P N="out_format">CCYYMMDD</P><P N="out_format_spec">1</P></Ps><CPs><CP ID="705" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="706" FP="X" N="r"/></ConnectionPoints/><F ID="134" N="Convert Date/Time-StatementTo" T="ConvertDateTime"><Ps C="S"><P N="in_format">yyyy-MM-dd</P><P N="out_format">CCYYMMDD</P><P N="out_format_spec">1</P></Ps><CPs><CP ID="710" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="709" FP="X" N="r"/></ConnectionPoints/><F ID="137" N="Convert Date/Time-ServiceDate" T="ConvertDateTime"><Ps C="S"><P N="in_format">yyyy-MM-dd</P><P N="out_format">CCYYMMDD</P><P N="out_format_spec">1</P></Ps><CPs><CP ID="715" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="716" FP="X" N="r"/></ConnectionPoints/><F ID="138" N="JavaScript - PLB02" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var currentyear = new Date().getFullYear();
ec_ResultHelper.ReportResultByIndex(0,currentyear + &quot;12&quot;+&quot;31&quot;);</P></Ps><CPs><CP ID="718" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="719" FP="A" P="0" N="value1"/><CP ID="717" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="139" T="ChangeVariable"><Ps C="S"><P N="variableID">7</P></Ps><CPs><CP ID="721" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="148" T="ChangeVariable"><Ps C="S"><P N="variableID">9</P></Ps><CPs><CP ID="767" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="149" T="ChangeVariable"><Ps C="S"><P N="variableID">8</P></Ps><CPs><CP ID="768" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="150" T="ChangeVariable"><Ps C="S"><P N="variableID">10</P></Ps><CPs><CP ID="769" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="151" T="ChangeVariable"><Ps C="S"><P N="variableID">11</P></Ps><CPs><CP ID="770" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="152" T="ChangeVariable"><Ps C="S"><P N="variableID">11</P></Ps><CPs><CP ID="786" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="785" FP="A" N="v"/></ConnectionPoints/><F ID="153" T="ChangeVariable"><Ps C="S"><P N="variableID">9</P></Ps><CPs><CP ID="788" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="787" FP="A" N="v"/></ConnectionPoints/><F ID="154" T="ChangeVariable"><Ps C="S"><P N="variableID">8</P></Ps><CPs><CP ID="790" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="789" FP="A" N="v"/></ConnectionPoints/><F ID="155" T="ChangeVariable"><Ps C="S"><P N="variableID">10</P></Ps><CPs><CP ID="792" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="791" FP="A" N="v"/></ConnectionPoints/><F ID="158" T="ChangeVariable"><Ps C="S"><P N="variableID">12</P></Ps><CPs><CP ID="811" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="159" T="ChangeVariable"><Ps C="S"><P N="variableID">13</P></Ps><CPs><CP ID="812" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="160" T="ChangeVariable"><Ps C="S"><P N="variableID">12</P></Ps><CPs><CP ID="814" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="813" FP="A" N="v"/></ConnectionPoints/><F ID="161" T="ChangeVariable"><Ps C="S"><P N="variableID">13</P></Ps><CPs><CP ID="816" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="815" FP="A" N="v"/></ConnectionPoints/><F ID="162" T="ChangeVariable"><Ps C="S"><P N="variableID">14</P></Ps><CPs><CP ID="817" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="164" T="ChangeVariable"><Ps C="S"><P N="variableID">15</P></Ps><CPs><CP ID="819" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="165" T="ChangeVariable"><Ps C="S"><P N="variableID">16</P></Ps><CPs><CP ID="820" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="170" T="ChangeVariable"><Ps C="S"><P N="variableID">17</P></Ps><CPs><CP ID="837" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="172" T="ChangeVariable"><Ps C="S"><P N="variableID">14</P></Ps><CPs><CP ID="841" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="840" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="174" T="ChangeVariable"><Ps C="S"><P N="variableID">15</P></Ps><CPs><CP ID="844" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="843" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="176" T="ChangeVariable"><Ps C="S"><P N="variableID">16</P></Ps><CPs><CP ID="847" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="846" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="178" T="ChangeVariable"><Ps C="S"><P N="variableID">17</P></Ps><CPs><CP ID="850" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="849" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="182" T="ChangeVariable"><Ps C="S"><P N="variableID">18</P></Ps><CPs><CP ID="883" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="184" T="ChangeVariable"><Ps C="S"><P N="variableID">19</P></Ps><CPs><CP ID="885" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="186" T="ChangeVariable"><Ps C="S"><P N="variableID">18</P></Ps><CPs><CP ID="888" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="887" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="188" T="ChangeVariable"><Ps C="S"><P N="variableID">19</P></Ps><CPs><CP ID="891" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="890" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="189" N="JS-PatientName" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var submittedPatientName = ec_VariableHelper.GetVariable(&quot;SubmittedPatientLName&quot;);
var SubmittedPatientID = ec_VariableHelper.GetVariable(&quot;SubmittedPatientID&quot;);
var correctedPatientLname = ec_VariableHelper.GetVariable(&quot;correctedPatientLname&quot;);
var correctedPatientFname = ec_VariableHelper.GetVariable(&quot;correctedPatientFname&quot;);
var correctedPatientMname = ec_VariableHelper.GetVariable(&quot;correctedPatientMname&quot;);
var correctedPatientID = ec_VariableHelper.GetVariable(&quot;correctedPatientID&quot;);
var lastName = &quot;&quot;;
var firstName = &quot;&quot;;
var middleName = &quot;&quot;;
var suffixName = &quot;&quot;;
if(submittedPatientName.length &gt; 0) //2.087 field
{
if(submittedPatientName.includes(&quot;,&quot;))
{
var submittedPatientNames = submittedPatientName.split(&quot;,&quot;);
if(submittedPatientNames.length == &quot;4&quot;)
{
lastName = submittedPatientNames[0];
middleName = submittedPatientNames[1];
firstName = submittedPatientNames[2];
suffixName = submittedPatientNames[3];
}
else if(submittedPatientNames.length == &quot;3&quot;)
{
lastName = submittedPatientNames[0];
middleName = submittedPatientNames[1];
firstName = submittedPatientNames[2];
}
else if(submittedPatientNames.length == &quot;2&quot;)
{
lastName = submittedPatientNames[0];
firstName = submittedPatientNames[1];
}
ec_ResultHelper.ReportResultByIndex(0,&quot;QC&quot;);
ec_ResultHelper.ReportResultByIndex(1,&quot;1&quot;);
ec_ResultHelper.ReportResultByIndex(2,lastName);
if(firstName != &quot;&quot;) ec_ResultHelper.ReportResultByIndex(3,firstName);
if(middleName != &quot;&quot;) ec_ResultHelper.ReportResultByIndex(4,middleName);
if(suffixName != &quot;&quot;) ec_ResultHelper.ReportResultByIndex(5,suffixName);
if(SubmittedPatientID.length &gt; 0)//2.084 field
{
ec_ResultHelper.ReportResultByIndex(6,&quot;MI&quot;);
ec_ResultHelper.ReportResultByIndex(7,SubmittedPatientID);
}
else
{
if(correctedPatientID.length &gt; 0)
{
ec_ResultHelper.ReportResultByIndex(6, &quot;MI&quot;);
ec_ResultHelper.ReportResultByIndex(7, correctedPatientID); //2.005 field
}
}
}
else
{
ec_ResultHelper.ReportResultByIndex(0,&quot;QC&quot;);
ec_ResultHelper.ReportResultByIndex(1,&quot;1&quot;);
ec_ResultHelper.ReportResultByIndex(2,correctedPatientLname);
if(correctedPatientFname != &quot;&quot;) ec_ResultHelper.ReportResultByIndex(3,correctedPatientFname);
if(correctedPatientMname != &quot;&quot;) ec_ResultHelper.ReportResultByIndex(4,correctedPatientMname);
if(SubmittedPatientID.length &gt; 0)
{
ec_ResultHelper.ReportResultByIndex(6,&quot;MI&quot;);
ec_ResultHelper.ReportResultByIndex(7,SubmittedPatientID);
}
else
{
if(correctedPatientID.length &gt; 0)
{
ec_ResultHelper.ReportResultByIndex(6, &quot;MI&quot;);
ec_ResultHelper.ReportResultByIndex(7, correctedPatientID);
}
}
}
}
else
{
ec_ResultHelper.ReportResultByIndex(0,&quot;QC&quot;);
ec_ResultHelper.ReportResultByIndex(1,&quot;1&quot;);
ec_ResultHelper.ReportResultByIndex(2,correctedPatientLname);
if(correctedPatientFname != &quot;&quot;) ec_ResultHelper.ReportResultByIndex(3,correctedPatientFname);
if(correctedPatientMname != &quot;&quot;) ec_ResultHelper.ReportResultByIndex(4,correctedPatientMname);
if(SubmittedPatientID.length &gt; 0)
{
ec_ResultHelper.ReportResultByIndex(6,&quot;MI&quot;);
ec_ResultHelper.ReportResultByIndex(7,SubmittedPatientID);
}
else
{
if(correctedPatientID.length &gt; 0)
{
ec_ResultHelper.ReportResultByIndex(6, &quot;MI&quot;);
ec_ResultHelper.ReportResultByIndex(7, correctedPatientID);
}
}
}
</P></Ps><CPs><CP ID="894" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="892" FP="A" P="0" N="value1"/><CP ID="893" FP="X" P="0" N="result1"/><CP ID="895" FP="X" P="1" N="result2"/><CP ID="896" FP="X" P="2" N="result3"/><CP ID="897" FP="X" P="3" N="result4"/><CP ID="898" FP="X" P="4" N="result5"/><CP ID="899" FP="X" P="5" N="result6"/><CP ID="900" FP="X" P="6" N="result7"/><CP ID="1046" FP="X" P="7" N="result8"/></ConnectionPoints/><F ID="190" N="JS-InsuredName" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var correctedPatientID = ec_VariableHelper.GetVariable(&quot;correctedPatientID&quot;);
var SubscriberLastName = ec_VariableHelper.GetVariable(&quot;SubscriberLastName&quot;);
var SubscriberFirstName = ec_VariableHelper.GetVariable(&quot;SubscriberFirstName&quot;);
var SubscriberMiddleName = ec_VariableHelper.GetVariable(&quot;SubscriberMiddleName&quot;);
var SubscriberID = ec_VariableHelper.GetVariable(&quot;SubscriberID&quot;);
if((SubscriberID) != (correctedPatientID))
{
if(SubscriberID != &quot;&quot;)
{
ec_ResultHelper.ReportResultByIndex(0, &quot;IL&quot;);
ec_ResultHelper.ReportResultByIndex(1, &quot;1&quot;);
ec_ResultHelper.ReportResultByIndex(2, SubscriberLastName);
ec_ResultHelper.ReportResultByIndex(3, SubscriberFirstName);
ec_ResultHelper.ReportResultByIndex(4, SubscriberMiddleName);
ec_ResultHelper.ReportResultByIndex(5, &quot;MI&quot;);
ec_ResultHelper.ReportResultByIndex(6, SubscriberID);
}
}</P></Ps><CPs><CP ID="909" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="901" FP="A" P="0" N="value1"/><CP ID="902" FP="X" P="0" N="result1"/><CP ID="903" FP="X" P="1" N="result2"/><CP ID="904" FP="X" P="2" N="result3"/><CP ID="905" FP="X" P="3" N="result4"/><CP ID="906" FP="X" P="4" N="result5"/><CP ID="907" FP="X" P="5" N="result6"/><CP ID="908" FP="X" P="6" N="result7"/></ConnectionPoints/><F ID="191" N="JS-CorrectedPatient" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var correctedPatientID = ec_VariableHelper.GetVariable(&quot;correctedPatientID&quot;);
var correctedPatientLname = ec_VariableHelper.GetVariable(&quot;correctedPatientLname&quot;);
var correctedPatientFname = ec_VariableHelper.GetVariable(&quot;correctedPatientFname&quot;);
var correctedPatientMname = ec_VariableHelper.GetVariable(&quot;correctedPatientMname&quot;);
var SubmittedPatientID = ec_VariableHelper.GetVariable(&quot;SubmittedPatientID&quot;);
var PatientLname = ec_VariableHelper.GetVariable(&quot;NM1_03&quot;);
var PatientFname = ec_VariableHelper.GetVariable(&quot;NM1_04&quot;);
var PatientMname = ec_VariableHelper.GetVariable(&quot;NM1_05&quot;);
function normalizeName(name) {
return name.trim().replace(/\s+/g, ' ').toLowerCase(); // Trims, collapses spaces, and makes lowercase
}
if (
normalizeName(correctedPatientLname) !== normalizeName(PatientLname) ||
normalizeName(correctedPatientFname) !== normalizeName(PatientFname) ||
normalizeName(correctedPatientMname) !== normalizeName(PatientMname)
) {
// if (normalizeName(correctedPatientLname) !== normalizeName(PatientLname)) {
ec_ResultHelper.ReportResultByIndex(2, correctedPatientLname.trim());
// }
// if (normalizeName(correctedPatientFname) !== normalizeName(PatientFname)) {
ec_ResultHelper.ReportResultByIndex(3, correctedPatientFname.trim());
// }
// if (normalizeName(correctedPatientMname) !== normalizeName(PatientMname)) {
ec_ResultHelper.ReportResultByIndex(4, correctedPatientMname.trim());
//}
}
if((correctedPatientID != &quot;&quot;)&amp;&amp;(correctedPatientID != SubmittedPatientID))
{
ec_ResultHelper.ReportResultByIndex(5, &quot;C&quot;);
ec_ResultHelper.ReportResultByIndex(6, correctedPatientID);
}
</P></Ps><CPs><CP ID="912" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="910" FP="A" P="0" N="value1"/><CP ID="911" FP="X" P="0" N="result1"/><CP ID="913" FP="X" P="1" N="result2"/><CP ID="914" FP="X" P="2" N="result3"/><CP ID="915" FP="X" P="3" N="result4"/><CP ID="916" FP="X" P="4" N="result5"/><CP ID="917" FP="X" P="5" N="result6"/><CP ID="918" FP="X" P="6" N="result7"/></ConnectionPoints/><F ID="192" N="JS-ServiceProvider" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var serviceProviderNPI = ec_VariableHelper.GetVariable(&quot;serviceProviderNPI&quot;);
var serviceProviderName = ec_VariableHelper.GetVariable(&quot;serviceProviderName&quot;);
var serviceProviderFirstName = ec_VariableHelper.GetVariable(&quot;serviceProviderFirstName&quot;);
var serviceProviderMiddleName = ec_VariableHelper.GetVariable(&quot;serviceProviderMiddleName&quot;);
var serviceProviderMiddleName = ec_VariableHelper.GetVariable(&quot;serviceProviderMiddleName&quot;);
var serviceProviderLastName = ec_VariableHelper.GetVariable(&quot;serviceProviderLastName&quot;);
var ProviderNameFlag_Payment = ec_VariableHelper.GetVariable(&quot;ProviderNameFlag_Payment&quot;);
var PayeeName = ec_VariableHelper.GetVariable(&quot;PayeeName&quot;);
var PAYEE_NPI = ec_VariableHelper.GetVariable(&quot;PAYEE_NPI&quot;);
if((serviceProviderNPI != &quot;&quot;) &amp;&amp; (PAYEE_NPI!=serviceProviderNPI))
{
ec_ResultHelper.ReportResultByIndex(0, &quot;82&quot;);
ec_ResultHelper.ReportResultByIndex(1, &quot;1&quot;);
if (ProviderNameFlag_Payment == &quot;Y&quot;)
{
ec_ResultHelper.ReportResultByIndex(2, serviceProviderLastName);
ec_ResultHelper.ReportResultByIndex(5, serviceProviderFirstName);
ec_ResultHelper.ReportResultByIndex(6, serviceProviderMiddleName);
}
else if (ProviderNameFlag_Payment == &quot;N&quot;)
{
ec_ResultHelper.ReportResultByIndex(2,serviceProviderName);
}
ec_ResultHelper.ReportResultByIndex(3, &quot;XX&quot;);
ec_ResultHelper.ReportResultByIndex(4, serviceProviderNPI);
}
</P></Ps><CPs><CP ID="921" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="919" FP="A" P="0" N="value1"/><CP ID="920" FP="X" P="0" N="result1"/><CP ID="922" FP="X" P="1" N="result2"/><CP ID="923" FP="X" P="2" N="result3"/><CP ID="924" FP="X" P="3" N="result4"/><CP ID="925" FP="X" P="4" N="result5"/><CP ID="1073" FP="X" P="5" N="result6"/><CP ID="1074" FP="X" P="6" N="result7"/></ConnectionPoints/><F ID="207" N="Convert Date/Time-CovExpDate" T="ConvertDateTime"><Ps C="S"><P N="in_format">MMddyyyy</P><P N="out_format">CCYYMMDD</P><P N="out_format_spec">1</P></Ps><CPs><CP ID="956" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="957" FP="X" N="r"/></ConnectionPoints/><F ID="209" N="Convert Date/Time-ClaimReceivedDate" T="ConvertDateTime"><Ps C="S"><P N="in_format">yyyy-MM-dd</P><P N="out_format">CCYYMMDD</P><P N="out_format_spec">1</P></Ps><CPs><CP ID="961" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="962" FP="X" N="r"/></ConnectionPoints/><F ID="210" N="Conditional Copy-StatementFrom" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">24</P><P N="if_1/conditions/expression_1/arg1/type">1</P><P N="if_1/conditions/expression_1/operation">1</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/connective_1">0</P><P N="if_1/conditions/expression_2/arg1">20</P><P N="if_1/conditions/expression_2/arg1/type">1</P><P N="if_1/conditions/expression_2/operation">1</P><P N="if_1/conditions/expression_2/operation/type">0</P><P N="if_1/conditions/expression_2/arg2">true</P><P N="if_1/actions/assignment_1/lvalue">964</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">24</P><P N="if_1/actions/assignment_1/rvalue/type">1</P></Ps><CPs><CP ID="1016" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="963" FP="A" P="0" N="value1"/><CP ID="964" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="211" N="Conditional Copy-StatementTo" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">25</P><P N="if_1/conditions/expression_1/arg1/type">1</P><P N="if_1/conditions/expression_1/operation">1</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/connective_1">0</P><P N="if_1/conditions/expression_2/arg1">20</P><P N="if_1/conditions/expression_2/arg1/type">1</P><P N="if_1/conditions/expression_2/operation">1</P><P N="if_1/conditions/expression_2/operation/type">0</P><P N="if_1/conditions/expression_2/arg2">true</P><P N="if_1/actions/assignment_1/lvalue">966</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">25</P><P N="if_1/actions/assignment_1/rvalue/type">1</P></Ps><CPs><CP ID="1017" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="965" FP="A" P="0" N="value1"/><CP ID="966" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="217" T="ChangeVariable"><Ps C="S"><P N="variableID">20</P></Ps><CPs><CP ID="978" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="979" FP="A" N="v"/></ConnectionPoints/><F ID="218" T="ChangeVariable"><Ps C="S"><P N="variableID">21</P></Ps><CPs><CP ID="981" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="220" T="ChangeVariable"><Ps C="S"><P N="variableID">21</P></Ps><CPs><CP ID="984" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="983" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="221" N="Conditional Copy-CovExpDate" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">21</P><P N="if_1/conditions/expression_1/arg1/type">1</P><P N="if_1/conditions/expression_1/operation">1</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/connective_1">0</P><P N="if_1/conditions/expression_2/arg1">23</P><P N="if_1/conditions/expression_2/arg1/type">1</P><P N="if_1/conditions/expression_2/operation">0</P><P N="if_1/conditions/expression_2/operation/type">0</P><P N="if_1/conditions/expression_2/arg2">true</P><P N="if_1/actions/assignment_1/lvalue">986</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">036</P><P N="if_1/actions/assignment_2/lvalue">987</P><P N="if_1/actions/assignment_2/lvalue/type">2</P><P N="if_1/actions/assignment_2/rvalue">21</P><P N="if_1/actions/assignment_2/rvalue/type">1</P></Ps><CPs><CP ID="988" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="985" FP="A" P="0" N="value1" DirectValue="{21}"/><CP ID="986" FP="X" P="0" N="result1"/><CP ID="987" FP="X" P="1" N="result2"/></ConnectionPoints/><F ID="223" N="Conditional Copy-ClaimReceivedDate" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">22</P><P N="if_1/conditions/expression_1/arg1/type">1</P><P N="if_1/conditions/expression_1/operation">1</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/actions/assignment_1/lvalue">993</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">050</P><P N="if_1/actions/assignment_2/lvalue">994</P><P N="if_1/actions/assignment_2/lvalue/type">2</P><P N="if_1/actions/assignment_2/rvalue">22</P><P N="if_1/actions/assignment_2/rvalue/type">1</P></Ps><CPs><CP ID="995" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="996" FP="A" P="0" N="value1" DirectValue="{22}"/><CP ID="993" FP="X" P="0" N="result1"/><CP ID="994" FP="X" P="1" N="result2"/></ConnectionPoints/><F ID="224" T="ChangeVariable"><Ps C="S"><P N="variableID">22</P></Ps><CPs><CP ID="997" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="226" T="ChangeVariable"><Ps C="S"><P N="variableID">22</P></Ps><CPs><CP ID="1000" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="999" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="227" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">1001</P><P N="if_1/conditions/expression_1/arg1/type">2</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">27</P><P N="if_1/conditions/connective_1">0</P><P N="if_1/conditions/expression_2/arg1">1003</P><P N="if_1/conditions/expression_2/arg1/type">2</P><P N="if_1/conditions/expression_2/operation">0</P><P N="if_1/conditions/expression_2/operation/type">0</P><P N="if_1/conditions/expression_2/arg2">PR</P><P N="if_1/actions/assignment_1/lvalue">1002</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">true</P></Ps><CPs><CP ID="1001" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1003" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1002" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="228" T="ChangeVariable"><Ps C="S"><P N="variableID">23</P></Ps><CPs><CP ID="1004" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="230" T="ChangeVariable"><Ps C="S"><P N="variableID">23</P></Ps><CPs><CP ID="1007" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1006" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="231" T="ChangeVariable"><Ps C="S"><P N="variableID">24</P></Ps><CPs><CP ID="1008" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="233" T="ChangeVariable"><Ps C="S"><P N="variableID">25</P></Ps><CPs><CP ID="1010" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="235" T="ChangeVariable"><Ps C="S"><P N="variableID">24</P></Ps><CPs><CP ID="1014" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1012" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="236" T="ChangeVariable"><Ps C="S"><P N="variableID">24</P></Ps><CPs><CP ID="1015" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1013" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="237" N="Conditional Copy-ToChkIfLineDateIsPresent" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">1018</P><P N="if_1/conditions/expression_1/arg1/type">2</P><P N="if_1/conditions/expression_1/operation">1</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/connective_1">1</P><P N="if_1/conditions/expression_2/arg1">1020</P><P N="if_1/conditions/expression_2/arg1/type">2</P><P N="if_1/conditions/expression_2/operation">1</P><P N="if_1/conditions/expression_2/operation/type">0</P><P N="if_1/actions/assignment_1/lvalue">1019</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">true</P></Ps><CPs><CP ID="1018" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1020" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1019" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="238" T="ChangeVariable"><Ps C="S"><P N="variableID">20</P></Ps><CPs><CP ID="1021" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="239" T="ChangeVariable"><Ps C="S"><P N="variableID">26</P></Ps><CPs><CP ID="1048" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="241" T="ChangeVariable"><Ps C="S"><P N="variableID">27</P></Ps><CPs><CP ID="1050" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="242" T="ChangeVariable"><Ps C="S"><P N="variableID">28</P></Ps><CPs><CP ID="1051" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="244" T="ChangeVariable"><Ps C="S"><P N="variableID">26</P></Ps><CPs><CP ID="1057" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1058" FP="A" N="v"/></ConnectionPoints/><F ID="245" T="ChangeVariable"><Ps C="S"><P N="variableID">28</P></Ps><CPs><CP ID="1059" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1060" FP="A" N="v"/></ConnectionPoints/><F ID="246" T="ChangeVariable"><Ps C="S"><P N="variableID">27</P></Ps><CPs><CP ID="1061" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1062" FP="A" N="v"/></ConnectionPoints/><F ID="250" T="SetValue"><CPs><CP ID="1071" FP="A" N="v" DirectValue="74"/><CP ID="1069" FP="X" N="r"/></ConnectionPoints/><F ID="251" T="SetValue"><CPs><CP ID="1072" FP="A" N="v" DirectValue="1"/><CP ID="1070" FP="X" N="r"/></ConnectionPoints/><F ID="252" T="ChangeVariable"><Ps C="S"><P N="variableID">29</P></Ps><CPs><CP ID="1077" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="253" T="ChangeVariable"><Ps C="S"><P N="variableID">29</P></Ps><CPs><CP ID="1079" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1080" FP="A" N="v"/></ConnectionPoints/><F ID="254" T="ChangeVariable"><Ps C="S"><P N="variableID">31</P></Ps><CPs><CP ID="1081" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="255" T="ChangeVariable"><Ps C="S"><P N="variableID">31</P></Ps><CPs><CP ID="1083" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1084" FP="A" N="v"/></ConnectionPoints/><F ID="256" T="ChangeVariable"><Ps C="S"><P N="variableID">30</P></Ps><CPs><CP ID="1085" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="257" T="ChangeVariable"><Ps C="S"><P N="variableID">30</P></Ps><CPs><CP ID="1087" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1088" FP="A" N="v"/></ConnectionPoints/><F ID="258" T="ChangeVariable"><Ps C="S"><P N="variableID">32</P></Ps><CPs><CP ID="1089" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="261" T="ChangeVariable"><Ps C="S"><P N="variableID">33</P></Ps><CPs><CP ID="1094" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="262" N="JavaScript - Control Number" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var stControlNumber = ec_VariableHelper.GetVariable(&quot;transactionControlNumber&quot;);
len=stControlNumber.length;
while(len &lt; 4)
{
stControlNumber = &quot;0&quot; + stControlNumber;
len++;
}
ec_ResultHelper.ReportResultByIndex(0, stControlNumber);
</P></Ps><CPs><CP ID="1096" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1097" FP="A" P="0" N="ST02"/><CP ID="1095" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="263" N="JavaScript - Control Number" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var stControlNumber = ec_VariableHelper.GetVariable(&quot;transactionControlNumber&quot;);
len=stControlNumber.length;
while(len &lt; 4)
{
stControlNumber = &quot;0&quot; + stControlNumber;
len++;
}
ec_ResultHelper.ReportResultByIndex(0, stControlNumber);
</P></Ps><CPs><CP ID="1099" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1100" FP="A" P="0" N="ST02"/><CP ID="1098" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="264" N="Change Variable" T="ChangeVariable"><Ps C="S"><P N="variableID">34</P></Ps><CPs><CP ID="1101" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/></Fs><Cs><C OutputCP="7" InputCP="8"/><C OutputCP="14" InputCP="15"></C><C OutputCP="16" InputCP="17"></C><C OutputCP="18" InputCP="19"></C><C OutputCP="20" InputCP="21"></C><C OutputCP="22" InputCP="23"></C><C OutputCP="24" InputCP="25"></C><C OutputCP="26" InputCP="27"></C><C OutputCP="28" InputCP="29"></C><C OutputCP="30" InputCP="31"></C><C OutputCP="34" InputCP="35"></C><C OutputCP="36" InputCP="37"></C><C OutputCP="38" InputCP="39"></C><C OutputCP="112" InputCP="113"></C><C OutputCP="114" InputCP="115"></C><C OutputCP="116" InputCP="119"/><C OutputCP="118" InputCP="117"/><C OutputCP="129" InputCP="131"/><C OutputCP="118" InputCP="130"/><C OutputCP="136" InputCP="139"/><C OutputCP="143" InputCP="137"/><C OutputCP="147" InputCP="146"/><C OutputCP="149" InputCP="151"/><C OutputCP="147" InputCP="150"/><C OutputCP="1" InputCP="153"/><C OutputCP="154" InputCP="2"/><C OutputCP="155" InputCP="156"/><C OutputCP="157" InputCP="158"/><C OutputCP="159" InputCP="160"/><C OutputCP="3" InputCP="162"/><C OutputCP="163" InputCP="4"/><C OutputCP="191" InputCP="192"/><C OutputCP="194" InputCP="195"/><C OutputCP="10" InputCP="11"></C><C OutputCP="187" InputCP="188"/><C OutputCP="12" InputCP="13"></C><C OutputCP="242" InputCP="189"/><C OutputCP="244" InputCP="259"/><C OutputCP="245" InputCP="260"/><C OutputCP="246" InputCP="261"/><C OutputCP="248" InputCP="263"/><C OutputCP="250" InputCP="265"/><C OutputCP="252" InputCP="267"/><C OutputCP="253" InputCP="268"/><C OutputCP="255" InputCP="269"/><C OutputCP="256" InputCP="270"/><C OutputCP="257" InputCP="271"/><C OutputCP="258" InputCP="272"/><C OutputCP="273" InputCP="274"/><C OutputCP="278" InputCP="280"/><C OutputCP="297" InputCP="313"/><C OutputCP="300" InputCP="316"/><C OutputCP="302" InputCP="318"/><C OutputCP="303" InputCP="319"/><C OutputCP="304" InputCP="320"/><C OutputCP="323" InputCP="321"/><C OutputCP="322" InputCP="324"/><C OutputCP="323" InputCP="326"/><C OutputCP="325" InputCP="327"/><C OutputCP="329" InputCP="330"></C><C OutputCP="329" InputCP="332"/><C OutputCP="331" InputCP="333"/><C OutputCP="173" InputCP="338"/><C OutputCP="335" InputCP="339"/><C OutputCP="350" InputCP="349"/><C OutputCP="354" InputCP="355"/><C OutputCP="173" InputCP="374"/><C OutputCP="373" InputCP="376"/><C OutputCP="380" InputCP="383"/><C OutputCP="173" InputCP="381"/><C OutputCP="173" InputCP="388"/><C OutputCP="387" InputCP="390"/><C OutputCP="400" InputCP="414"/><C OutputCP="408" InputCP="416"/><C OutputCP="433" InputCP="441"/><C OutputCP="437" InputCP="443"/><C OutputCP="453" InputCP="457"/><C OutputCP="473" InputCP="459"/><C OutputCP="474" InputCP="461"/><C OutputCP="475" InputCP="462"/><C OutputCP="476" InputCP="463"/><C OutputCP="477" InputCP="464"/><C OutputCP="478" InputCP="465"/><C OutputCP="479" InputCP="466"/><C OutputCP="480" InputCP="467"/><C OutputCP="481" InputCP="468"/><C OutputCP="482" InputCP="469"/><C OutputCP="483" InputCP="470"/><C OutputCP="484" InputCP="471"/><C OutputCP="485" InputCP="472"/><C OutputCP="488" InputCP="486"/><C OutputCP="489" InputCP="487"/><C OutputCP="496" InputCP="490"/><C OutputCP="497" InputCP="492"/><C OutputCP="498" InputCP="493"/><C OutputCP="499" InputCP="494"/><C OutputCP="500" InputCP="495"/><C OutputCP="501" InputCP="6"></C><C OutputCP="509" InputCP="512"/><C OutputCP="516" InputCP="519"/><C OutputCP="51" InputCP="522"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="51" InputCP="532"/><C OutputCP="534" InputCP="538"/><C OutputCP="535" InputCP="539"/><C OutputCP="536" InputCP="540"/><C OutputCP="537" InputCP="545"/><C OutputCP="541" InputCP="546"/><C OutputCP="542" InputCP="547"/><C OutputCP="543" InputCP="548"/><C OutputCP="544" InputCP="551"/><C OutputCP="549" InputCP="347"/><C OutputCP="550" InputCP="552"/><C OutputCP="521" InputCP="70"/><C OutputCP="523" InputCP="71"/><C OutputCP="524" InputCP="80"/><C OutputCP="525" InputCP="98"/><C OutputCP="557" InputCP="566"/><C OutputCP="558" InputCP="567"/><C OutputCP="559" InputCP="568"/><C OutputCP="560" InputCP="569"/><C OutputCP="561" InputCP="570"/><C OutputCP="571" InputCP="575"/><C OutputCP="572" InputCP="576"/><C OutputCP="573" InputCP="577"/><C OutputCP="574" InputCP="578"/><C OutputCP="580" InputCP="579"/><C OutputCP="352" InputCP="588"/><C OutputCP="589" InputCP="587"/><C OutputCP="118" InputCP="585"/><C OutputCP="583" InputCP="590"/><C OutputCP="591" InputCP="353"/><C OutputCP="502" InputCP="592"/><C OutputCP="593" InputCP="503"/><C OutputCP="595" InputCP="510"/><C OutputCP="504" InputCP="599"/><C OutputCP="598" InputCP="505"/><C OutputCP="601" InputCP="517"/><C OutputCP="603" InputCP="602"/><C OutputCP="553" InputCP="562"/><C OutputCP="554" InputCP="563"/><C OutputCP="555" InputCP="564"/><C OutputCP="556" InputCP="565"/><C OutputCP="604" InputCP="608"/><C OutputCP="605" InputCP="609"/><C OutputCP="606" InputCP="610"/><C OutputCP="607" InputCP="611"/><C OutputCP="613" InputCP="612"/><C OutputCP="12" InputCP="614"/><C OutputCP="118" InputCP="617"/><C OutputCP="623" InputCP="618"/><C OutputCP="624" InputCP="620"/><C OutputCP="498" InputCP="621"/><C OutputCP="619" InputCP="628"/><C OutputCP="625" InputCP="629"/><C OutputCP="626" InputCP="630"/><C OutputCP="627" InputCP="631"/><C OutputCP="350" InputCP="254"/><C OutputCP="350" InputCP="311"/><C OutputCP="675" InputCP="264"></C><C OutputCP="674" InputCP="262"></C><C OutputCP="676" InputCP="314"></C><C OutputCP="677" InputCP="315"></C><C OutputCP="678" InputCP="166"></C><C OutputCP="679" InputCP="122"></C><C OutputCP="680" InputCP="174"></C><C OutputCP="681" InputCP="179"></C><C OutputCP="682" InputCP="180"></C><C OutputCP="683" InputCP="181"></C><C OutputCP="684" InputCP="340"></C><C OutputCP="685" InputCP="393"></C><C OutputCP="686" InputCP="415"></C><C OutputCP="687" InputCP="417"></C><C OutputCP="688" InputCP="424"></C><C OutputCP="689" InputCP="442"></C><C OutputCP="690" InputCP="444"></C><C OutputCP="691" InputCP="458"></C><C OutputCP="695" InputCP="694"/><C OutputCP="699" InputCP="33"/><C OutputCP="251" InputCP="266"/><C OutputCP="301" InputCP="317"/><C OutputCP="533" InputCP="715"/><C OutputCP="716" InputCP="99"/><C OutputCP="720" InputCP="718"/><C OutputCP="717" InputCP="721"/><C OutputCP="722" InputCP="633"/><C OutputCP="241" InputCP="698"/><C OutputCP="40" InputCP="768"/><C OutputCP="42" InputCP="767"/><C OutputCP="44" InputCP="769"/><C OutputCP="46" InputCP="770"/><C OutputCP="147" InputCP="786"/><C OutputCP="147" InputCP="788"/><C OutputCP="147" InputCP="790"/><C OutputCP="147" InputCP="792"/><C OutputCP="667" InputCP="812"/><C OutputCP="147" InputCP="814"/><C OutputCP="147" InputCP="816"/><C OutputCP="749" InputCP="817"/><C OutputCP="751" InputCP="819"/><C OutputCP="753" InputCP="820"/><C OutputCP="744" InputCP="837"/><C OutputCP="147" InputCP="841"/><C OutputCP="147" InputCP="844"/><C OutputCP="147" InputCP="847"/><C OutputCP="147" InputCP="850"/><C OutputCP="757" InputCP="885"/><C OutputCP="763" InputCP="883"/><C OutputCP="147" InputCP="888"/><C OutputCP="147" InputCP="891"/><C OutputCP="147" InputCP="894"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="893" InputCP="201"/><C OutputCP="895" InputCP="204"/><C OutputCP="896" InputCP="41"/><C OutputCP="897" InputCP="43"/><C OutputCP="898" InputCP="45"/><C OutputCP="147" InputCP="909"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="902" InputCP="742"/><C OutputCP="903" InputCP="743"/><C OutputCP="904" InputCP="748"/><C OutputCP="905" InputCP="750"/><C OutputCP="906" InputCP="752"/><C OutputCP="907" InputCP="746"/><C OutputCP="908" InputCP="745"/><C OutputCP="920" InputCP="659"/><C OutputCP="922" InputCP="660"/><C OutputCP="923" InputCP="662"/><C OutputCP="924" InputCP="666"/><C OutputCP="925" InputCP="669"/><C OutputCP="147" InputCP="921"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="926" InputCP="811"/><C OutputCP="964" InputCP="217"/><C OutputCP="964" InputCP="705"/><C OutputCP="966" InputCP="215"/><C OutputCP="966" InputCP="710"/><C OutputCP="980" InputCP="978"/><C OutputCP="361" InputCP="981"/><C OutputCP="147" InputCP="984"/><C OutputCP="228" InputCP="997"/><C OutputCP="147" InputCP="1000"/><C OutputCP="994" InputCP="961"/><C OutputCP="499" InputCP="1001"/><C OutputCP="500" InputCP="1003"/><C OutputCP="1002" InputCP="1004"/><C OutputCP="147" InputCP="1007"/><C OutputCP="51" InputCP="988"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="987" InputCP="956"/><C OutputCP="208" InputCP="1008"/><C OutputCP="210" InputCP="1010"/><C OutputCP="147" InputCP="1014"/><C OutputCP="147" InputCP="1015"/><C OutputCP="51" InputCP="1016"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="212" InputCP="219"/><C OutputCP="706" InputCP="209"/><C OutputCP="51" InputCP="1017"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="214" InputCP="216"/><C OutputCP="709" InputCP="211"/><C OutputCP="475" InputCP="1018"/><C OutputCP="476" InputCP="1020"/><C OutputCP="1019" InputCP="1021"/><C OutputCP="986" InputCP="369"/><C OutputCP="957" InputCP="362"/><C OutputCP="993" InputCP="238"/><C OutputCP="962" InputCP="229"/><C OutputCP="51" InputCP="995"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="1028" InputCP="1022"/><C OutputCP="1029" InputCP="1023"/><C OutputCP="1030" InputCP="1024"/><C OutputCP="1031" InputCP="1025"/><C OutputCP="1032" InputCP="1026"/><C OutputCP="1033" InputCP="1027"/><C OutputCP="1034" InputCP="1040"/><C OutputCP="1035" InputCP="1041"/><C OutputCP="1036" InputCP="1042"/><C OutputCP="1037" InputCP="1043"/><C OutputCP="1038" InputCP="1044"/><C OutputCP="1039" InputCP="1045"/><C OutputCP="899" InputCP="1047"/><C OutputCP="900" InputCP="205"/><C OutputCP="1046" InputCP="47"/><C OutputCP="896" InputCP="1048"/><C OutputCP="897" InputCP="1050"/><C OutputCP="898" InputCP="1051"/><C OutputCP="914" InputCP="729"/><C OutputCP="915" InputCP="730"/><C OutputCP="916" InputCP="731"/><C OutputCP="917" InputCP="735"/><C OutputCP="918" InputCP="734"/><C OutputCP="147" InputCP="1057"/><C OutputCP="147" InputCP="1061"/><C OutputCP="147" InputCP="1059"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="147" InputCP="912"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="1069" InputCP="733"/><C OutputCP="1070" InputCP="732"/><C OutputCP="1073" InputCP="1075"/><C OutputCP="1074" InputCP="1076"/><C OutputCP="1078" InputCP="1077"/><C OutputCP="147" InputCP="1079"/><C OutputCP="1082" InputCP="1081"/><C OutputCP="147" InputCP="1083"/><C OutputCP="1086" InputCP="1085"/><C OutputCP="147" InputCP="1087"/><C OutputCP="1090" InputCP="1089"/><C OutputCP="1092" InputCP="1094"/><C OutputCP="1098" InputCP="134"/><C OutputCP="1098" InputCP="144"/><C OutputCP="118" InputCP="1099"/><C OutputCP="10" InputCP="1101"/></Cs></Map>
</file>
<file path="ArtifactsRepository/Payments/Velocity/Blank.vtmpl">

</file>
<file path="ArtifactsRepository/Payments/Velocity/OB_835_AuditVelocity.vtmpl">
{
"process": {
"processStageName": "${ProcessStageName}",
"processStatus": "${ProcessStatus}",
#if($AuditEventCount == "2" or $AuditEventCount == "4" )
"processMessage": "${ProcessMessage}",
#{else}#end
"processInputArchiveFilename":"${processInputArchiveFilename}",
#if($AuditEventCount == "3" or $AuditEventCount == "4" )
"processOutputArchiveFilename": "${ProcessOutputArchiveFilename}",
#{else}#end
"auditTime": "${AuditTime}"
},
"identifiers": {
"rayIdentifier": "${FileRayId}",
"recordIdentifier": "${FileRecordId}",
"tenantIdentifier": "${tenantIdentifier}"
},
"jobDetails": {
"identifier": "${FileJobId}"
},
"payment": {
#if($AuditEventCount == "3" or $AuditEventCount == "4" )
"paymentId": "${PaymentId}",
"outputFileName": "${ProcessOutputArchiveFilename}"
#{else}
"paymentId": "${PaymentId}"
#end
}
}
</file>