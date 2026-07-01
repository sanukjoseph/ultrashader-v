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
<!-- <Aliases><Alias ID="{S3000}" V="/element(name = 'actions')/complexType/sequence/element(name = 'action')/complexType/sequence"/><Alias ID="{S3001}" V="/InternalProperties/Field(Name = 'TotalInputTransaction')"/><Alias ID="{S3002}" V="/InternalProperties/Field(Name = 'FileCreationDate')"/><Alias ID="{S3003}" V="/InternalProperties/Field(Name = 'RecordIdentifier')"/><Alias ID="{S3004}" V="/InternalProperties/Field(Name = 'ArchivedFileName')"/><Alias ID="{S3005}" V="/InternalProperties/Field(Name = 'TotalClaimCount')"/><Alias ID="{S3006}" V="/InternalProperties/Field(Name = 'InputFileName')"/><Alias ID="{S3007}" V="/InternalProperties/Field(Name = 'RayIdentifier')"/><Alias ID="{S3008}" V="/InternalProperties/Field(Name = 'InputFileId')"/><Alias ID="{S3009}" V="/element(name = 'recordIdentifierFromSource')"/><Alias ID="{S3010}" V="/element(name = 'totalXMLTransactionCount')"/><Alias ID="{S3011}" V="/element(name = 'adjustmentReasonCode')"/><Alias ID="{S3012}" V="/element(name = 'sourceTypeIdentifier')"/><Alias ID="{S3013}" V="/element(name = 'inputArchiveFilename')"/><Alias ID="{S3014}" V="/element(name = 'XMLfileCreationDate')"/><Alias ID="{S3015}" V="/element(name = 'adjustmentLogNote')"/><Alias ID="{S3016}" V="/element(name = 'totalTransaction')"/><Alias ID="{S3017}" V="/element(name = 'recordIdentifier')"/><Alias ID="{S3018}" V="/element(name = 'totalClaimCount')"/><Alias ID="{S3019}" V="/element(name = 'hccClaimNumber')"/><Alias ID="{S3020}" V="/element(name = 'inputFilename')"/><Alias ID="{S3021}" V="/element(name = 'hccLineNumber')"/><Alias ID="{S3022}" V="/element(name = 'rayIdentifier')"/><Alias ID="{S3023}" V="/element(name = 'recordCount')"/><Alias ID="{S3024}" V="/element(name = 'receiverId')"/><Alias ID="{S3025}" V="/element(name = 'inputType')"/><Alias ID="{S3026}" V="/element(name = 'senderId')"/><Alias ID="{S3027}" V="/element(name = 'inputId')"/><Alias ID="{S1000}" V="/elementRef(ref = 'claimsEditing:externalEditClaim')/element(name = 'externalEditClaim')/complexType/sequence/element(name = 'claimLines')/complexType/sequence/element(name = 'claimLine')/complexType/sequence"/><Alias ID="{S1001}" V="/elementRef(ref = 'claimsEditing:externalEditClaim')/element(name = 'externalEditClaim')/complexType/sequence"/><Alias ID="{S1002}" V="/elementRef(ref = 'header')/element(name = 'header')/complexType/sequence"/><Alias ID="{P1}" V="/schema/element(name = 'ClaimEditingAdaptorRequest')/complexType/sequence/elementRef(ref = 'ClaimEditingIBRequestRoot')/element(name = 'ClaimEditingIBRequestRoot')/complexType/sequence/elementRef(ref = 'ClaimEditingIBRequest')/element(name = 'ClaimEditingIBRequest')/complexType/sequence/elementRef(ref = 'ClaimEditingRequestRecordList')/element(name = 'ClaimEditingRequestRecordList')/complexType/sequence/elementRef(ref = 'ClaimEditingRequestRecord')/element(name = 'ClaimEditingRequestRecord')/complexType/sequence"/><Alias ID="{P2}" V="/schema/element(name = 'ClaimEditingAdaptorRequest')/complexType/sequence/elementRef(ref = 'ClaimEditingIBRequestRoot')/element(name = 'ClaimEditingIBRequestRoot')/complexType/sequence/elementRef(ref = 'ClaimEditingIBRequest')/element(name = 'ClaimEditingIBRequest')/complexType/sequence/elementRef(ref = 'ClaimEditingRequestRecordList')/element(name = 'ClaimEditingRequestRecordList')/complexType/sequence"/><Alias ID="{P3}" V="/schema/element(name = 'ClaimEditingAdaptorRequest')/complexType/sequence/elementRef(ref = 'ClaimEditingIBRequestRoot')/element(name = 'ClaimEditingIBRequestRoot')/complexType/sequence"/><Alias ID="{P4}" V="/Message(ID = 'Message')/Record(ID = 'Detail')"/></Aliases> -->
assets\
└── ArtifactsRepository
    └── SecondaryEditing
        ├── IBSecondaryClaimsCommon
        │   ├── Groovy
        │   │   ├── IB_SecondaryClaims_Audit_Step.txt
        │   │   ├── IB_SecondaryClaims_PrefixScrub.txt
        │   │   └── IB_SecondaryClaims_Split.txt
        │   ├── Guideline
        │   ├── SplitRule
        │   │   └── IB_SecondaryClaims_DFF_MessageSplit.xml
        │   └── Velocity
        │       └── IB_SecondaryClaim_AuditTemplate
        ├── IBSecondaryClaimsCotivitiInstitutional
        │   ├── Guideline
        │   ├── Map
        │   │   └── IB_SecondaryClaims_Inst_Cotiviti_DFF_To_XML.ems
        │   └── parser
        ├── IBSecondaryClaimsCotivitiProfessional
        │   ├── Guideline
        │   ├── Map
        │   │   └── IB_SecondaryClaims_Prof_Cotiviti_DFF_To_XML.ems
        │   └── parser
        ├── IBSecondaryClaimsEvicore
        │   ├── Guideline
        │   ├── Map
        │   │   └── IB_SecondaryClaims_Evicore_DFF_To_XML.ems
        │   └── Parser
        ├── IBSecondaryClaimsOptum
        │   ├── Guideline
        │   ├── Map
        │   │   └── IB_SecondaryClaims_Optum_DFF_To_XML.ems
        │   └── Parser
        └── Test.properties

<file path="ArtifactsRepository/SecondaryEditing/IBSecondaryClaimsCommon/Groovy/IB_SecondaryClaims_Audit_Step.txt">
import org.apache.commons.lang.StringUtils
exchange = context.exchange
properties = exchange.properties
messages = exchange.messages
message = messages.first()
messageBodyInputStream = message.bodyAsSmartStream.inputStream
InputStreamReader isr = new InputStreamReader(messageBodyInputStream)
BufferedReader br = new BufferedReader(isr)
def auditEventNumber = properties.get('auditEventNumber')
//def Customization = properties.get('Customization')
// Flag to check if the event has been logged
def alreadyLogged = properties.get("alreadyLogged") ?: false
if (auditEventNumber == "1" && !alreadyLogged) {
properties.put("processStageName", "EDIFECS-Validation")
properties.put("processstatus", "SUCCESS")
context.createExchangeResponse(properties, messageBodyInputStream)
properties.put("alreadyLogged", true)
}
else if (auditEventNumber == "2") {
properties.put("processStageName", "EDIFECS-Validation")
properties.put("processmessage", "Edifecs Validation Error")
properties.put("processstatus", "FAILURE")
context.createExchangeResponse(properties, messageBodyInputStream)
}
else if (auditEventNumber == "3") {
properties.put("processStageName", "EDIFECS-Conversion")
properties.put("processstatus", "SUCCESS")
context.createExchangeResponse(properties, messageBodyInputStream)
}
else if (auditEventNumber == "4") {
properties.put("processStageName", "EDIFECS-Conversion")
properties.put("processmessage", "Edifecs Translator Error")
properties.put("processstatus", "FAILURE")
context.createExchangeResponse(properties, messageBodyInputStream)
}
// Clear the alreadyLogged flag if needed for the next execution
if (auditEventNumber != "1") {
properties.remove("alreadyLogged")
}
</file>
<file path="ArtifactsRepository/SecondaryEditing/IBSecondaryClaimsCommon/Groovy/IB_SecondaryClaims_PrefixScrub.txt">
import com.edifecs.etools.xeserver.proxy.ProxyMessage
void execute() {
def exchange = context.exchange
def message = exchange.messages[0]
// Read body as string
String messageContent = new String(message.getBodyAsSmartStream().getInputStream().readAllBytes())
// Process each line: remove first field
List<String> cleanedLines = messageContent.readLines().collect { line ->
def parts = line.split("\\|")
return parts.size() > 1 ? parts[1..-1].join('|') : ""
}
// Join back with CRLF
String output = cleanedLines.join("\r\n") + "\r\n"
// Send output as a new message
def headers = ["Processed": "true"]
ProxyMessage newMessage = context.createNewMessage(output, headers)
context.createExchangeResponse(headers, newMessage)
}
execute()
</file>
<file path="ArtifactsRepository/SecondaryEditing/IBSecondaryClaimsCommon/Groovy/IB_SecondaryClaims_Split.txt">
import com.edifecs.etools.xeserver.proxy.ProxyMessage
final String DEFAULT_LOB = "Unknown"
// Get line number index based on LOB
int getLineNumberIndex(String lob) {
switch (lob) {
case "Cotiviti Inst": return 14
case "Cotiviti Prof": return 10
case "Evicore": return 1
case "Optum": return 6
default: return -1
}
}
// Get claim ID index based on LOB
int getClaimIDIndex(String lob) {
switch (lob) {
case "Evicore": return 0
case "Cotiviti Inst": return 13
case "Cotiviti Prof": return 9
case "Optum": return 4
default: return -1
}
}
// Clean input lines
List<String> preprocessLines(String content, String lob) {
List<String> lines = content.split("\\R") as List
if (lines.size() < 2) return lines
lines = lines.subList(1, lines.size()) // Remove HDR
if (lob != "Optum" && lines.size() > 1) {
lines = lines.subList(0, lines.size() - 1) // Remove TLR
}
return lines
}
// Logic to generate line prefixes and track unique groups
List<String> prefixLinesByClaimGrouping(List<String> lines, int claimIDIndex, int lineNumberIndex, Set<String> uniqueGroups) {
List<String> result = []
Map<String, Integer> claimLineTracker = [:]
int anonymousGroupCounter = 0
String lastGroupKey = ""
for (String line : lines) {
String[] parts = line.split("\\|")
String claimID = (claimIDIndex >= 0 && claimIDIndex < parts.length) ? parts[claimIDIndex]?.trim() : ""
String lineNumStr = (lineNumberIndex >= 0 && lineNumberIndex < parts.length) ? parts[lineNumberIndex]?.trim() : ""
int lineNum = lineNumStr.isInteger() ? lineNumStr.toInteger() : -1
String groupKey
if (claimID) {
groupKey = claimID
} else if (lineNum == 1 || lastGroupKey == "") {
anonymousGroupCounter++
groupKey = "UNKNOWN_${anonymousGroupCounter}"
} else {
groupKey = lastGroupKey
}
int lineCount = claimLineTracker.getOrDefault(groupKey, 0) + 1
claimLineTracker[groupKey] = lineCount
lastGroupKey = groupKey
String prefix = String.format("%03d", lineCount)
result.add("${prefix}|${line}")
uniqueGroups.add(groupKey)
}
return result
}
// Main logic
void execute() {
def exchange = context.exchange
def message = exchange.messages[0]
String lob = exchange.properties.get("Lob") ?: DEFAULT_LOB
String messageContent = new String(message.getBodyAsSmartStream().getInputStream().readAllBytes())
List<String> lines = preprocessLines(messageContent, lob)
exchange.properties.put("ProcessedLineCount", lines.size())
int claimIDIndex = getClaimIDIndex(lob)
int lineNumberIndex = getLineNumberIndex(lob)
Set<String> uniqueGroups = new HashSet<>()
List<String> prefixedLines = prefixLinesByClaimGrouping(lines, claimIDIndex, lineNumberIndex, uniqueGroups)
exchange.properties.put("UniqueSplitCount", uniqueGroups.size())
String finalData = prefixedLines.join("\r\n") + "\r\n"
def headers = ["LOB": lob]
ProxyMessage singleMessage = context.createNewMessage(finalData, headers)
context.createExchangeResponse(headers, singleMessage)
}
// Run it
execute()
</file>
<file path="ArtifactsRepository/SecondaryEditing/IBSecondaryClaimsCommon/SplitRule/IB_SecondaryClaims_DFF_MessageSplit.xml">
<?xml version="1.0" encoding="UTF-8"?><DataSplitRules Version="2.0" N="Data Splitting rules" Description="Default data splitting rule set" xsi:noNamespaceSchemaLocation="DataSplitRules.xsd" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"><Rule name="bad">Message[@AckCode='R' and @ClaimID='##unique##']</Rule><Rule name="good">Message[@AckCode='A'and @ClaimID='##unique##']</Rule></DataSplitRules>
</file>
<file path="ArtifactsRepository/SecondaryEditing/IBSecondaryClaimsCommon/Velocity/IB_SecondaryClaim_AuditTemplate">
{
"inputDetails": {
#if($InputId != "" and $InputId != "(N/A)" and $InputId != "{Prp[InputId]}")
"inputId": "${UID}",
#{else}#end
#if($inputType != "" and $inputType != "(N/A)" and $inputType != "{Prp[inputType]}")
"inputType": "DFF",
#{else}#end
#if($UniqueSplitCount != "" and $UniqueSplitCount != "(N/A)" and $UniqueSplitCount != "{Prp[UniqueSplitCount]}")
"totalTransactions": "${UniqueSplitCount}",
#{else}#end
#if($FileName != "" and $FileName != "(N/A)" and $FileName != "{Prp[FileName]}")
"inputFileName": "${FileName}",
#{else}#end
#if($inputArchiveFilename != "" and $inputArchiveFilename != "(N/A)" and $inputArchiveFilename != "{Prp[inputArchiveFilename]}")
"inputArchiveFilename": "${inputArchiveFilename}"
#{else}#end
},
"process": {
#if($ProcessStageName != "" and $ProcessStageName != "(N/A)" and $ProcessStageName != "{Prp[ProcessStageName]}" and $MessageRead =="Yes")
"processStageName": "${processStageName}",
#{else}#end
#if($ProcessStageName != "" and $ProcessStageName != "(N/A)" and $ProcessStageName != "{Prp[ProcessStageName]}" and $MessageRead =="No")
"processStageName": "${processStageName}",
#{else}#end
#if($processmessage != "" and $processmessage != "(N/A)" and $processmessage != "{Prp[processmessage]}" and $HasError =="true")
"processMessage": "${processmessage}",
#{else}#end
#if($processstatus != "" and $processstatus != "(N/A)" and $processstatus != "{Prp[processstatus]}")
"processStatus": "${processstatus}",
#{else}#end
#if($inputArchiveFilename != "" and $inputArchiveFilename != "(N/A)" and $inputArchiveFilename != "{Prp[inputArchiveFilename]}" and $MessageRead =="No")
"processInputArchiveFilename": "${inputArchiveFilename}",
#{else}#end
#if($inputArchiveFilename != "" and $inputArchiveFilename != "(N/A)" and $inputArchiveFilename != "{Prp[inputArchiveFilename]}" and $MessageRead =="Yes")
"processInputArchiveFilename": "${inputArchiveFilename}",
#{else}#end
#if($processOutputArchiveFilename != "" and $processOutputArchiveFilename != "(N/A)" and $processOutputArchiveFilename != "{Prp[processOutputArchiveFilename]}" and $MessageRead =="Yes")
"processOutputArchiveFilename": "${FileName}",
#{else}#end
#if($processAuditSendDateTime != "" and $processAuditSendDateTime != "(N/A)" and $processAuditSendDateTime != "{Prp[processAuditSendDateTime]}" and $MessageRead =="No")
"auditTime": "${processAuditSendDateTime}"
#{else}#end
},
"identifiers": {
#if($RayIdentifier != "" and $RayIdentifier != "(N/A)" and $RayIdentifier != "{Prp[RayIdentifier]}")
"rayIdentifier": "${RayIdentifier}",
#{else}#end
#if($RecordIdentifier != "" and $RecordIdentifier != "(N/A)" and $RecordIdentifier != "{Prp[RecordIdentifier]}")
"recordIdentifier": "${RecordIdentifier}",
#{else}#end
##if($Tenant_Identifier != "" and $Tenant_Identifier != "(N/A)" and $Tenant_Identifier != "{Prp[Tenant_Identifier]}")
##"tenantIdentifier": "${Tenant_Identifier}",
##{else}#end
#if($sourceTypeIdentifier != "(N/A)" and $sourceTypeIdentifier != "{Prp[sourceTypeIdentifier]}")
"sourceTypeIdentifier": "${sourceTypeIdentifier}",
#{else}#end
#if($RecordIdentifier != "" and $RecordIdentifier != "(N/A)" and $RecordIdentifier != "{Prp[RecordIdentifier]}")
"recordIdentifierFromSource": "${RecordIdentifier}"
#{else}#end
},
"secondaryEditing": {
#if($UniqueClaimId != "" and $UniqueClaimId != "(N/A)" and $UniqueClaimId != "{Prp[UniqueClaimId]}")
"claimHCCId": "${UniqueClaimId}"
#{else}#end
}
}
</file>
<file path="ArtifactsRepository/SecondaryEditing/IBSecondaryClaimsCotivitiInstitutional/Map/IB_SecondaryClaims_Inst_Cotiviti_DFF_To_XML.ems">
<?xml version="1.0" encoding="UTF-8"?><Map Version="3" ModelVersion="4" ModelRevision="1" LastCPID="410"><Ps C="Variables"><P N="LastVarID">7</P><P N="1/ID">1</P><P N="1/Name">Claim_ID</P><P N="2/ID">2</P><P N="2/Name">FileCreationDate</P><P N="3/ID">3</P><P N="3/Name">REC_LINE_STATUS</P><P N="3/InitValue">0</P><P N="4/ID">4</P><P N="4/Name">Allowed_Units</P><P N="5/ID">5</P><P N="5/Name">REC_LINE_STATUS_ADJ</P><P N="6/ID">6</P><P N="6/Name">Adj_LogNote</P><P N="7/ID">7</P><P N="7/Name">AlloweUnits</P><P N="7/InitValue"/></Ps><Sources><ES ID="1" Type="File.ECS"><Ps><P N="Name">Source</P><P N="Location">..\Guideline\IB_SecondaryClaims_Inst_Cotiviti_DFF_Translation_SOURCE.ecs</P></Ps><CPs><CP ID="29" Pth="{S3006}"/><CP ID="30" Pth="{S3008}"/><CP ID="35" Pth="{S3005}"/><CP ID="44" Pth="{S3002}"/><CP ID="61" Pth="{P4}"/><CP ID="69" Pth="{P4}/Field(ID = 'CLAIM_ID')"/><CP ID="77" Pth="{P4}/Field(ID = 'LINE_SEQ')"/><CP ID="79" Pth="{P4}/Field(ID = 'REC_HCPCS')"/><CP ID="91" Pth="{P4}/Field(ID = 'REC_MOD_01')"/><CP ID="92" Pth="{P4}/Field(ID = 'REC_MOD_02')"/><CP ID="93" Pth="{P4}/Field(ID = 'REC_MOD_03')"/><CP ID="94" Pth="{P4}/Field(ID = 'REC_MOD_04')"/><CP ID="95" Pth="{P4}/Field(ID = 'REC_MOD_05')"/><CP ID="96" Pth="{P4}/Field(ID = 'REC_MOD_06')"/><CP ID="117" Pth="{P4}/Field(ID = 'REC_MOD_07')"/><CP ID="118" Pth="{P4}/Field(ID = 'REC_MOD_08')"/><CP ID="123" Pth="{P4}/Field(ID = 'REC_UNITS')"/><CP ID="124" Pth="{P4}/Field(ID = 'REC_PCT')"/><CP ID="139" Pth="{P4}/Field(ID = 'REC_LINE_STATUS')"/><CP ID="282" Pth="{P4}/Field(ID = 'REASON1_ID')"/><CP ID="283" Pth="{P4}/Field(ID = 'REASON2_ID')"/><CP ID="284" Pth="{P4}/Field(ID = 'REASON3_ID')"/><CP ID="287" Pth="{P4}/Field(ID = 'ALLOWED_UNITS')"/><CP ID="331" Pth="{S3001}"/><CP ID="378" Pth="{S3003}"/><CP ID="380" Pth="{S3007}"/><CP ID="396" Pth="{P4}/Field(ID = 'SUB_UNITS')"/><CP ID="397" Pth="{S3004}"/></ConnectionPoints/></Sources><Targets><ES ID="2" Type="File.ECS"><Ps><P N="Name">Target</P><P N="Location">..\..\IBSecondaryClaimsCommon\Guideline\IB_SecondaryClaims_XML_Target.ecs</P></Ps><Ps C="InstancedNodes"><P N="1/Path">/schema/element(name = 'ClaimEditingIBRequestRoot')/complexType/sequence/elementRef(ref = 'ClaimEditingIBRequest')/element(name = 'ClaimEditingIBRequest')/complexType/sequence/elementRef(ref = 'ClaimEditingRequestRecordList')/element(name = 'ClaimEditingRequestRecordList')/complexType/sequence/elementRef(ref = 'ClaimEditingRequestRecord')/element(name = 'ClaimEditingRequestRecord')/complexType/sequence{S1000}{S3000}/element(name = 'reasons')/complexType/sequence/element(name = 'reason')/complexType/sequence/element(name = 'code')</P><P N="1/Instance_1/CustomName">REASON1_ID</P><P N="1/Instance_2/CustomName">REASON2_ID</P><P N="1/Instance_3/CustomName">REASON3_ID</P><P N="2/Path">/schema/element(name = 'ClaimEditingIBRequestRoot')/complexType/sequence/elementRef(ref = 'ClaimEditingIBRequest')/element(name = 'ClaimEditingIBRequest')/complexType/sequence/elementRef(ref = 'ClaimEditingRequestRecordList')/element(name = 'ClaimEditingRequestRecordList')/complexType/sequence/elementRef(ref = 'ClaimEditingRequestRecord')/element(name = 'ClaimEditingRequestRecord')/complexType/sequence{S1000}{S3000}/element(name = 'reasons')/complexType/sequence/element(name = 'reason')/complexType/sequence/element(name = 'description')</P><P N="2/Instance_1/CustomName">
reason1Id + &quot; Action Reason&quot;</P><P N="2/Instance_2/CustomName">
reason2Id + &quot; Action Reason&quot;</P><P N="2/Instance_3/CustomName">
reason3Id + &quot; Action Reason&quot;</P><P N="3/Path">/schema/element(name = 'ClaimEditingAdaptorRequest')/complexType/sequence/elementRef(ref = 'ClaimEditingIBRequestRoot')/element(name = 'ClaimEditingIBRequestRoot')/complexType/sequence/elementRef(ref = 'ClaimEditingIBRequest')/element(name = 'ClaimEditingIBRequest')/complexType/sequence/elementRef(ref = 'ClaimEditingRequestRecordList')/element(name = 'ClaimEditingRequestRecordList')/complexType/sequence/elementRef(ref = 'ClaimEditingRequestRecord')/element(name = 'ClaimEditingRequestRecord')/complexType/sequence{S1000}{S3000}/element(name = 'reasons')/complexType/sequence/element(name = 'reason')/complexType/sequence/element(name = 'code')</P><P N="3/Instance_1/CustomName">REASON1_ID</P><P N="3/Instance_2/CustomName">REASON2_ID</P><P N="3/Instance_3/CustomName">REASON3_ID</P><P N="4/Path">/schema/element(name = 'ClaimEditingAdaptorRequest')/complexType/sequence/elementRef(ref = 'ClaimEditingIBRequestRoot')/element(name = 'ClaimEditingIBRequestRoot')/complexType/sequence/elementRef(ref = 'ClaimEditingIBRequest')/element(name = 'ClaimEditingIBRequest')/complexType/sequence/elementRef(ref = 'ClaimEditingRequestRecordList')/element(name = 'ClaimEditingRequestRecordList')/complexType/sequence/elementRef(ref = 'ClaimEditingRequestRecord')/element(name = 'ClaimEditingRequestRecord')/complexType/sequence{S1000}{S3000}/element(name = 'reasons')/complexType/sequence/element(name = 'reason')/complexType/sequence/element(name = 'description')</P><P N="4/Instance_1/CustomName">reason1Id+&quot;Action Reason&quot;</P><P N="4/Instance_2/CustomName">reason2Id+&quot;Action Reason&quot;</P><P N="4/Instance_3/CustomName">reason3Id+&quot;Action Reason&quot;</P></Ps><CPs><CP ID="341" Pth="{P3}{S1002}{S3020}"/><CP ID="343" Pth="{P3}{S1002}{S3018}"/><CP ID="348" Pth="{P3}{S1002}{S3010}"/><CP ID="349" Pth="{P3}{S1002}{S3026}"/><CP ID="350" Pth="{P3}{S1002}{S3024}"/><CP ID="351" Pth="{P1}{S1001}{S3019}"/><CP ID="352" Pth="{P1}{S1000}{S3021}"/><CP ID="353" Pth="{P1}{S1000}/element(name = 'recHcpcs')"/><CP ID="354" Pth="{P1}{S1000}/element(name = 'recModifier01')"/><CP ID="355" Pth="{P1}{S1000}/element(name = 'recModifier02')"/><CP ID="356" Pth="{P1}{S1000}/element(name = 'recModifier03')"/><CP ID="357" Pth="{P1}{S1000}/element(name = 'recModifier04')"/><CP ID="358" Pth="{P1}{S1000}/element(name = 'recModifier05')"/><CP ID="359" Pth="{P1}{S1000}/element(name = 'recModifier06')"/><CP ID="360" Pth="{P1}{S1000}/element(name = 'recModifier07')"/><CP ID="361" Pth="{P1}{S1000}/element(name = 'recModifier08')"/><CP ID="362" Pth="{P1}{S1000}{S3000}/element(name = 'adjustedUnits')"/><CP ID="363" Pth="{P1}{S1000}{S3000}/element(name = 'adjustmentPercentage')"/><CP ID="364" Pth="{P1}{S1000}{S3000}/element(name = 'actionType')"/><CP ID="365" Pth="{P1}{S1000}{S3000}/element(name = 'reasons')/complexType/sequence/element(name = 'reason')/complexType/sequence/element(name = 'code'){1}"/><CP ID="366" Pth="{P1}{S1000}{S3000}/element(name = 'reasons')/complexType/sequence/element(name = 'reason')/complexType/sequence/element(name = 'code'){2}"/><CP ID="367" Pth="{P1}{S1000}{S3000}/element(name = 'reasons')/complexType/sequence/element(name = 'reason')/complexType/sequence/element(name = 'code'){3}"/><CP ID="368" Pth="{P1}{S1000}{S3000}/element(name = 'reasons')/complexType/sequence/element(name = 'reason')/complexType/sequence/element(name = 'description'){1}"/><CP ID="369" Pth="{P1}{S1000}{S3000}/element(name = 'reasons')/complexType/sequence/element(name = 'reason')/complexType/sequence/element(name = 'description'){2}"/><CP ID="370" Pth="{P1}{S1000}{S3000}/element(name = 'reasons')/complexType/sequence/element(name = 'reason')/complexType/sequence/element(name = 'description'){3}"/><CP ID="371" Pth="{P1}{S1000}{S3000}/element(name = 'originalUnits')"/><CP ID="372" Pth="{P1}{S1001}{S3011}"/><CP ID="373" Pth="{P1}{S1001}{S3015}"/><CP ID="374" Pth="{P1}{S1000}{S3000}/element(name = 'userMessageCode')"/><CP ID="375" Pth="{P3}{S1002}{S3027}"/><CP ID="376" Pth="{P3}{S1002}{S3025}"/><CP ID="377" Pth="{P3}{S1002}{S3016}"/><CP ID="379" Pth="{P1}{S3017}"/><CP ID="381" Pth="{P1}{S3022}"/><CP ID="385" Pth="{P3}{S1002}{S3014}"/><CP ID="390" Pth="{P2}{S3023}"/><CP ID="391" Pth="{P1}{S3012}"/><CP ID="392" Pth="{P1}{S3009}"/><CP ID="395" Pth="{P1}{S1000}/element(name = 'subUnit')"/><CP ID="398" Pth="{P3}{S1002}{S3013}"/></CPs><ReverseConnectionPoints//></Targets><Fs><F ID="3" T="ChangeVariable"><Ps C="S"><P N="variableID">1</P></Ps><CPs><CP ID="14" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="5" T="SetValue"><CPs><CP ID="34" FP="A" N="v" DirectValue="INST"/><CP ID="33" FP="X" N="r"/></ConnectionPoints/><F ID="7" T="SetValue"><CPs><CP ID="40" FP="A" N="v" DirectValue="1"/><CP ID="39" FP="X" N="r"/></ConnectionPoints/><F ID="10" T="SetValue"><CPs><CP ID="49" FP="A" N="v" DirectValue="Cotiviti Inst"/><CP ID="48" FP="X" N="r"/></ConnectionPoints/><F ID="12" T="SetValue"><CPs><CP ID="54" FP="A" N="v" DirectValue="Product"/><CP ID="53" FP="X" N="r"/></ConnectionPoints/><F ID="14" T="ChangeVariable"><Ps C="S"><P N="variableID">2</P></Ps><CPs><CP ID="57" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="15" N="JavaScript-FileCreationDate" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var FileCreationDate = ec_VariableHelper.GetVariable(&quot;FileCreationDate&quot;);
// Ensure the input is valid
if (FileCreationDate &amp;&amp; typeof FileCreationDate === &quot;string&quot;) {
FileCreationDate = FileCreationDate.trim();
}
// Function to convert 'yyyy-MM-dd HH:mm:ss.S' to 'yyyy-MM-ddTHH:mm:ss'
function convertToISOFormat(dateStr) {
var match = dateStr.match(/^(\d{4})-(\d{2})-(\d{2}) (\d{2}):(\d{2}):(\d{2})/);
if (!match) {
return &quot;Invalid date format&quot;;
}
var year = match[1];
var month = match[2];
var day = match[3];
var hours = match[4];
var minutes = match[5];
var seconds = match[6];
return year + &quot;-&quot; + month + &quot;-&quot; + day + &quot;T&quot; + hours + &quot;:&quot; + minutes + &quot;:&quot; + seconds;
}
// Convert and report the result
if (FileCreationDate) {
var formattedDateTime = convertToISOFormat(FileCreationDate);
ec_ResultHelper.ReportResultByIndex(0, formattedDateTime);
}</P></Ps><CPs><CP ID="60" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="58" FP="A" P="0" N="value1"/><CP ID="59" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="17" T="SetValue"><CPs><CP ID="74" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="73" FP="A" N="v" DirectValue="{1}"/><CP ID="72" FP="X" N="r"/></ConnectionPoints/><F ID="22" T="ChangeVariable"><Ps C="S"><P N="variableID">3</P></Ps><CPs><CP ID="138" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="24" N="JavaScript_claimLine" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var REC_LINE_STATUS = ec_VariableHelper.GetVariable(&quot;REC_LINE_STATUS&quot;);
var REC_HCPCS = ec_DataHelper.GetValueByIndex(0);
var REC_MOD_01 = ec_DataHelper.GetValueByIndex(1);
var REC_MOD_02 = ec_DataHelper.GetValueByIndex(2);
var REC_MOD_03 = ec_DataHelper.GetValueByIndex(3);
var REC_MOD_04 = ec_DataHelper.GetValueByIndex(4);
var REC_MOD_05 = ec_DataHelper.GetValueByIndex(5);
var REC_MOD_06 = ec_DataHelper.GetValueByIndex(6);
var REC_MOD_07 = ec_DataHelper.GetValueByIndex(7);
var REC_MOD_08 = ec_DataHelper.GetValueByIndex(8);
var REC_UNITS = ec_DataHelper.GetValueByIndex(9);
var REC_PCT = ec_DataHelper.GetValueByIndex(10);
var SUB_UNITS = ec_DataHelper.GetValueByIndex(11);
if (REC_LINE_STATUS != &quot;P&quot;)
{
ec_ResultHelper.ReportResultByIndex(0,REC_HCPCS);
ec_ResultHelper.ReportResultByIndex(1,REC_MOD_01);
ec_ResultHelper.ReportResultByIndex(2,REC_MOD_02);
ec_ResultHelper.ReportResultByIndex(3,REC_MOD_03);
ec_ResultHelper.ReportResultByIndex(4,REC_MOD_04);
ec_ResultHelper.ReportResultByIndex(5,REC_MOD_05);
ec_ResultHelper.ReportResultByIndex(6,REC_MOD_06);
ec_ResultHelper.ReportResultByIndex(7,REC_MOD_07);
ec_ResultHelper.ReportResultByIndex(8,REC_MOD_08);
ec_ResultHelper.ReportResultByIndex(9,REC_UNITS);
ec_ResultHelper.ReportResultByIndex(10,REC_PCT);
ec_ResultHelper.ReportResultByIndex(11,SUB_UNITS);
}</P></Ps><CPs><CP ID="151" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="152" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="153" FP="A" P="2" N="value3"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="154" FP="A" P="3" N="value4"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="155" FP="A" P="4" N="value5"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="156" FP="A" P="5" N="value6"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="157" FP="A" P="6" N="value7"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="158" FP="A" P="7" N="value8"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="159" FP="A" P="8" N="value9"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="289" FP="A" P="9" N="value10"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="292" FP="A" P="10" N="value11"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="393" FP="A" P="11" N="value12"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="150" FP="X" P="0" N="result1"/><CP ID="202" FP="X" P="1" N="result2"/><CP ID="203" FP="X" P="2" N="result3"/><CP ID="204" FP="X" P="3" N="result4"/><CP ID="205" FP="X" P="4" N="result5"/><CP ID="206" FP="X" P="5" N="result6"/><CP ID="207" FP="X" P="6" N="result7"/><CP ID="208" FP="X" P="7" N="result8"/><CP ID="209" FP="X" P="8" N="result9"/><CP ID="290" FP="X" P="9" N="result10"/><CP ID="293" FP="X" P="10" N="result11"/><CP ID="394" FP="X" P="11" N="result12"/></ConnectionPoints/><F ID="33" N="Conditional Copy_originalUnits" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">3</P><P N="if_1/conditions/expression_1/arg1/type">1</P><P N="if_1/conditions/expression_1/operation">1</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">P</P><P N="if_1/actions/assignment_1/lvalue">286</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">4</P><P N="if_1/actions/assignment_1/rvalue/type">1</P></Ps><CPs><CP ID="326" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="285" FP="A" P="0" N="value1"/><CP ID="286" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="38" N="JavaScript_reason" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var REC_LINE_STATUS = ec_VariableHelper.GetVariable(&quot;REC_LINE_STATUS&quot;);
var REASON1_ID = ec_DataHelper.GetValueByIndex(0);
var REASON2_ID = ec_DataHelper.GetValueByIndex(1);
var REASON3_ID = ec_DataHelper.GetValueByIndex(2);
if (REC_LINE_STATUS !=&quot;P&quot;)
{
var output1 = REASON1_ID + &quot; &quot; + &quot;Action Reason&quot;; // Modify format if needed
var output2 = REASON2_ID + &quot; &quot; + &quot;Action Reason&quot;;
var output3 = REASON3_ID + &quot; &quot; + &quot;Action Reason&quot;;
if(REASON1_ID != &quot;&quot;){
ec_ResultHelper.ReportResultByIndex(0, REASON1_ID);
ec_ResultHelper.ReportResultByIndex(1, output1);
}
if(REASON2_ID != &quot;&quot;)
{
ec_ResultHelper.ReportResultByIndex(2, REASON2_ID);
ec_ResultHelper.ReportResultByIndex(3, output2);
}
if(REASON3_ID != &quot;&quot;)
{
ec_ResultHelper.ReportResultByIndex(4, REASON3_ID);
ec_ResultHelper.ReportResultByIndex(5, output3);
}
}</P></Ps><CPs><CP ID="305" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="307" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="309" FP="A" P="2" N="value3"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="306" FP="X" P="0" N="result1"/><CP ID="308" FP="X" P="1" N="result2"/><CP ID="310" FP="X" P="2" N="result3"/><CP ID="318" FP="X" P="3" N="result4"/><CP ID="319" FP="X" P="4" N="result5"/><CP ID="320" FP="X" P="5" N="result6"/></ConnectionPoints/><F ID="45" T="ChangeVariable"><Ps C="S"><P N="variableID">4</P></Ps><CPs><CP ID="325" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="47" T="ChangeVariable"><Ps C="S"><P N="variableID">3</P></Ps><CPs><CP ID="329" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="328" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="48" T="ChangeVariable"><Ps C="S"><P N="variableID">5</P></Ps><CPs><CP ID="330" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="49" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">334</P><P N="if_1/conditions/expression_1/arg1/type">2</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">1</P><P N="if_1/actions/assignment_1/lvalue">333</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">335</P><P N="if_1/actions/assignment_1/rvalue/type">2</P></Ps><CPs><CP ID="334" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="335" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="333" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="50" T="ChangeVariable"><Ps C="S"><P N="variableID">6</P></Ps><CPs><CP ID="336" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="51" N="JavaScript_AdjLogNote" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var REC_LINE_STATUS = ec_VariableHelper.GetVariable(&quot;Adj_LogNote&quot;);
if (REC_LINE_STATUS != &quot;P&quot;)
{
ec_ResultHelper.ReportResultByIndex(0,REC_LINE_STATUS);
}
</P></Ps><CPs><CP ID="338" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="339" FP="A" P="0" N="value1"/><CP ID="337" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="53" T="SetValue"><CPs><CP ID="389" FP="A" N="v" DirectValue="1"/><CP ID="388" FP="X" N="r"/></ConnectionPoints/><F ID="55" T="SetValue"><CPs><CP ID="402" FP="A" N="v" DirectValue="Cotiviti"/><CP ID="401" FP="X" N="r"/></ConnectionPoints/><F ID="56" N="Trim-Line Sequence" T="Trim"><Ps C="S"><P N="paddings">0</P><P N="type">1</P></Ps><CPs><CP ID="404" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="403" FP="X" N="r"/></ConnectionPoints/><F ID="57" T="ChangeVariable"><Ps C="S"><P N="variableID">7</P></Ps><CPs><CP ID="405" FP="A" N="v"/></ConnectionPoints/><F ID="59" T="ChangeVariable"><Ps C="S"><P N="variableID">7</P></Ps><CPs><CP ID="408" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="407" FP="A" N="v"/></ConnectionPoints/><F ID="60" T="SetValue"><CPs><CP ID="410" FP="A" N="v" DirectValue="1"/><CP ID="409" FP="X" N="r"/></ConnectionPoints/></Fs><Cs><C OutputCP="44" InputCP="57"/><C OutputCP="61" InputCP="60"><Ps C="GuidelineFilters"><P N="Event">2</P></Ps></C><C OutputCP="69" InputCP="14"/><C OutputCP="61" InputCP="74"><Ps C="GuidelineFilters"><P N="Event">2</P></Ps></C><C OutputCP="139" InputCP="138"/><C OutputCP="79" InputCP="151"/><C OutputCP="91" InputCP="152"/><C OutputCP="92" InputCP="153"/><C OutputCP="93" InputCP="154"/><C OutputCP="94" InputCP="155"/><C OutputCP="95" InputCP="156"/><C OutputCP="96" InputCP="157"/><C OutputCP="117" InputCP="158"/><C OutputCP="118" InputCP="159"/><C OutputCP="123" InputCP="289"/><C OutputCP="124" InputCP="292"/><C OutputCP="282" InputCP="305"/><C OutputCP="283" InputCP="307"/><C OutputCP="284" InputCP="309"/><C OutputCP="287" InputCP="325"/><C OutputCP="61" InputCP="326"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="61" InputCP="329"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="139" InputCP="330"/><C OutputCP="139" InputCP="335"/><C OutputCP="333" InputCP="336"/><C OutputCP="61" InputCP="338"><Ps C="GuidelineFilters"><P N="Event">2</P></Ps></C><C OutputCP="29" InputCP="341"></C><C OutputCP="35" InputCP="343"></C><C OutputCP="39" InputCP="348"/><C OutputCP="150" InputCP="353"/><C OutputCP="202" InputCP="354"/><C OutputCP="203" InputCP="355"/><C OutputCP="204" InputCP="356"/><C OutputCP="205" InputCP="357"/><C OutputCP="206" InputCP="358"/><C OutputCP="207" InputCP="359"/><C OutputCP="208" InputCP="360"/><C OutputCP="209" InputCP="361"/><C OutputCP="290" InputCP="362"/><C OutputCP="293" InputCP="363"/><C OutputCP="306" InputCP="365"/><C OutputCP="310" InputCP="366"/><C OutputCP="319" InputCP="367"/><C OutputCP="308" InputCP="368"/><C OutputCP="318" InputCP="369"/><C OutputCP="320" InputCP="370"/><C OutputCP="286" InputCP="371"/><C OutputCP="337" InputCP="373"/><C OutputCP="306" InputCP="374"/><C OutputCP="30" InputCP="375"></C><C OutputCP="33" InputCP="376"/><C OutputCP="331" InputCP="377"></C><C OutputCP="378" InputCP="379"></C><C OutputCP="380" InputCP="381"></C><C OutputCP="59" InputCP="385"/><C OutputCP="53" InputCP="350"/><C OutputCP="388" InputCP="390"/><C OutputCP="378" InputCP="392"></C><C OutputCP="394" InputCP="395"/><C OutputCP="396" InputCP="393"/><C OutputCP="397" InputCP="398"></C><C OutputCP="139" InputCP="364"></C><C OutputCP="48" InputCP="349"/><C OutputCP="401" InputCP="391"/><C OutputCP="72" InputCP="351"/><C OutputCP="77" InputCP="404"/><C OutputCP="403" InputCP="352"/><C OutputCP="403" InputCP="334"/><C OutputCP="61" InputCP="408"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="409" InputCP="372"/></Cs></Map>
</file>
<file path="ArtifactsRepository/SecondaryEditing/IBSecondaryClaimsCotivitiProfessional/Map/IB_SecondaryClaims_Prof_Cotiviti_DFF_To_XML.ems">
<?xml version="1.0" encoding="UTF-8"?><Map Version="3" ModelVersion="4" ModelRevision="1" LastCPID="233"><Ps C="Variables"><P N="LastVarID">6</P><P N="1/ID">1</P><P N="1/Name">Claim_ID</P><P N="2/ID">2</P><P N="2/Name">FileCreationDate</P><P N="3/ID">3</P><P N="3/Name">REC_LINE_STATUS</P><P N="4/ID">4</P><P N="4/Name">REC_LINE_STATUS_ADJ</P><P N="5/ID">5</P><P N="5/Name">Adj_LogNote</P><P N="6/ID">6</P><P N="6/Name">AlloweUnits</P><P N="6/InitValue"/></Ps><Sources><ES ID="1" Type="File.ECS"><Ps><P N="Name">Source</P><P N="Location">..\Guideline\IB_SecondaryClaims_Prof_Cotiviti_DFF_Translation_SOURCE.ecs</P></Ps><CPs><CP ID="21" Pth="{S3006}"/><CP ID="23" Pth="{S3008}"/><CP ID="25" Pth="{S3005}"/><CP ID="28" Pth="{S3002}"/><CP ID="33" Pth="{P4}"/><CP ID="52" Pth="{P4}/Field(ID = 'CLAIM_ID')"/><CP ID="57" Pth="{P4}/Field(ID = 'LINE_SEQ')"/><CP ID="60" Pth="{P4}/Field(ID = 'REC_LINE_STATUS')"/><CP ID="83" Pth="{P4}/Field(ID = 'REC_HCPCS')"/><CP ID="84" Pth="{P4}/Field(ID = 'REC_MOD_01')"/><CP ID="85" Pth="{P4}/Field(ID = 'REC_MOD_02')"/><CP ID="86" Pth="{P4}/Field(ID = 'REC_MOD_03')"/><CP ID="87" Pth="{P4}/Field(ID = 'REC_MOD_04')"/><CP ID="88" Pth="{P4}/Field(ID = 'REC_MOD_05')"/><CP ID="89" Pth="{P4}/Field(ID = 'REC_MOD_06')"/><CP ID="90" Pth="{P4}/Field(ID = 'REC_MOD_07')"/><CP ID="91" Pth="{P4}/Field(ID = 'REC_MOD_08')"/><CP ID="92" Pth="{P4}/Field(ID = 'REC_UNITS')"/><CP ID="93" Pth="{P4}/Field(ID = 'REC_PCT')"/><CP ID="118" Pth="{P4}/Field(ID = 'REASON1_ID')"/><CP ID="119" Pth="{P4}/Field(ID = 'REASON2_ID')"/><CP ID="120" Pth="{P4}/Field(ID = 'REASON3_ID')"/><CP ID="152" Pth="{S3001}"/><CP ID="198" Pth="{S3003}"/><CP ID="200" Pth="{S3007}"/><CP ID="206" Pth="{S3004}"/><CP ID="217" Pth="{P4}/Field(ID = 'SUB_UNITS')"/><CP ID="231" Pth="{P4}/Field(ID = 'ALLOWED_UNITS')"/></ConnectionPoints/></Sources><Targets><ES ID="2" Type="File.ECS"><Ps><P N="Name">Target</P><P N="Location">..\..\IBSecondaryClaimsCommon\Guideline\IB_SecondaryClaims_XML_Target.ecs</P></Ps><Ps C="InstancedNodes"><P N="1/Path">/schema/element(name = 'ClaimEditingIBRequestRoot')/complexType/sequence/elementRef(ref = 'ClaimEditingIBRequest')/element(name = 'ClaimEditingIBRequest')/complexType/sequence/elementRef(ref = 'ClaimEditingRequestRecordList')/element(name = 'ClaimEditingRequestRecordList')/complexType/sequence/elementRef(ref = 'ClaimEditingRequestRecord')/element(name = 'ClaimEditingRequestRecord')/complexType/sequence{S1000}{S3000}/element(name = 'reasons')/complexType/sequence/element(name = 'reason')/complexType/sequence/element(name = 'code')</P><P N="1/Instance_1/CustomName">REASON1_ID</P><P N="1/Instance_2/CustomName">REASON2_ID</P><P N="1/Instance_3/CustomName">REASON3_ID</P><P N="2/Path">/schema/element(name = 'ClaimEditingIBRequestRoot')/complexType/sequence/elementRef(ref = 'ClaimEditingIBRequest')/element(name = 'ClaimEditingIBRequest')/complexType/sequence/elementRef(ref = 'ClaimEditingRequestRecordList')/element(name = 'ClaimEditingRequestRecordList')/complexType/sequence/elementRef(ref = 'ClaimEditingRequestRecord')/element(name = 'ClaimEditingRequestRecord')/complexType/sequence{S1000}{S3000}/element(name = 'reasons')/complexType/sequence/element(name = 'reason')/complexType/sequence/element(name = 'description')</P><P N="2/Instance_1/CustomName">REASON1_ID+&quot;ACTION REASON&quot;</P><P N="2/Instance_2/CustomName">REASON2_ID+&quot;ACTION REASON&quot;</P><P N="2/Instance_3/CustomName">REASON3_ID+&quot;ACTION REASON&quot;</P><P N="3/Path">/schema/element(name = 'ClaimEditingAdaptorRequest')/complexType/sequence/elementRef(ref = 'ClaimEditingIBRequestRoot')/element(name = 'ClaimEditingIBRequestRoot')/complexType/sequence/elementRef(ref = 'ClaimEditingIBRequest')/element(name = 'ClaimEditingIBRequest')/complexType/sequence/elementRef(ref = 'ClaimEditingRequestRecordList')/element(name = 'ClaimEditingRequestRecordList')/complexType/sequence/elementRef(ref = 'ClaimEditingRequestRecord')/element(name = 'ClaimEditingRequestRecord')/complexType/sequence{S1000}{S3000}/element(name = 'reasons')/complexType/sequence/element(name = 'reason')/complexType/sequence/element(name = 'code')</P><P N="3/Instance_1/CustomName">REASON1_ID</P><P N="3/Instance_2/CustomName">REASON2_ID</P><P N="3/Instance_3/CustomName">REASON3_ID</P><P N="4/Path">/schema/element(name = 'ClaimEditingAdaptorRequest')/complexType/sequence/elementRef(ref = 'ClaimEditingIBRequestRoot')/element(name = 'ClaimEditingIBRequestRoot')/complexType/sequence/elementRef(ref = 'ClaimEditingIBRequest')/element(name = 'ClaimEditingIBRequest')/complexType/sequence/elementRef(ref = 'ClaimEditingRequestRecordList')/element(name = 'ClaimEditingRequestRecordList')/complexType/sequence/elementRef(ref = 'ClaimEditingRequestRecord')/element(name = 'ClaimEditingRequestRecord')/complexType/sequence{S1000}{S3000}/element(name = 'reasons')/complexType/sequence/element(name = 'reason')/complexType/sequence/element(name = 'description')</P><P N="4/Instance_1/CustomName">REASON1_ID+&quot;ACTION REASON&quot;</P><P N="4/Instance_2/CustomName">REASON2_ID+&quot;ACTION REASON&quot;</P><P N="4/Instance_3/CustomName">REASON3_ID+&quot;ACTION REASON&quot;</P></Ps><CPs><CP ID="162" Pth="{P3}{S1002}{S3020}"/><CP ID="165" Pth="{P3}{S1002}{S3018}"/><CP ID="169" Pth="{P3}{S1002}{S3026}"/><CP ID="170" Pth="{P3}{S1002}{S3024}"/><CP ID="171" Pth="{P3}{S1002}{S3010}"/><CP ID="172" Pth="{P1}{S1001}{S3019}"/><CP ID="173" Pth="{P1}{S1000}{S3021}"/><CP ID="174" Pth="{P1}{S1000}/element(name = 'recHcpcs')"/><CP ID="175" Pth="{P1}{S1000}/element(name = 'recModifier01')"/><CP ID="176" Pth="{P1}{S1000}/element(name = 'recModifier02')"/><CP ID="177" Pth="{P1}{S1000}/element(name = 'recModifier03')"/><CP ID="178" Pth="{P1}{S1000}/element(name = 'recModifier04')"/><CP ID="179" Pth="{P1}{S1000}/element(name = 'recModifier05')"/><CP ID="180" Pth="{P1}{S1000}/element(name = 'recModifier06')"/><CP ID="181" Pth="{P1}{S1000}/element(name = 'recModifier07')"/><CP ID="182" Pth="{P1}{S1000}/element(name = 'recModifier08')"/><CP ID="183" Pth="{P1}{S1000}{S3000}/element(name = 'adjustedUnits')"/><CP ID="184" Pth="{P1}{S1000}{S3000}/element(name = 'adjustmentPercentage')"/><CP ID="185" Pth="{P1}{S1000}{S3000}/element(name = 'actionType')"/><CP ID="186" Pth="{P1}{S1000}{S3000}/element(name = 'reasons')/complexType/sequence/element(name = 'reason')/complexType/sequence/element(name = 'code'){1}"/><CP ID="187" Pth="{P1}{S1000}{S3000}/element(name = 'reasons')/complexType/sequence/element(name = 'reason')/complexType/sequence/element(name = 'code'){2}"/><CP ID="188" Pth="{P1}{S1000}{S3000}/element(name = 'reasons')/complexType/sequence/element(name = 'reason')/complexType/sequence/element(name = 'code'){3}"/><CP ID="189" Pth="{P1}{S1000}{S3000}/element(name = 'reasons')/complexType/sequence/element(name = 'reason')/complexType/sequence/element(name = 'description'){1}"/><CP ID="190" Pth="{P1}{S1000}{S3000}/element(name = 'reasons')/complexType/sequence/element(name = 'reason')/complexType/sequence/element(name = 'description'){2}"/><CP ID="191" Pth="{P1}{S1000}{S3000}/element(name = 'reasons')/complexType/sequence/element(name = 'reason')/complexType/sequence/element(name = 'description'){3}"/><CP ID="192" Pth="{P1}{S1000}{S3000}/element(name = 'originalUnits')"/><CP ID="193" Pth="{P1}{S1001}{S3011}"/><CP ID="194" Pth="{P1}{S1001}{S3015}"/><CP ID="195" Pth="{P1}{S1000}{S3000}/element(name = 'userMessageCode')"/><CP ID="196" Pth="{P3}{S1002}{S3027}"/><CP ID="197" Pth="{P3}{S1002}{S3016}"/><CP ID="199" Pth="{P1}{S3017}"/><CP ID="201" Pth="{P1}{S3022}"/><CP ID="204" Pth="{P3}{S1002}{S3025}"/><CP ID="205" Pth="{P3}{S1002}{S3014}"/><CP ID="207" Pth="{P3}{S1002}{S3013}"/><CP ID="212" Pth="{P2}{S3023}"/><CP ID="213" Pth="{P1}{S3012}"/><CP ID="214" Pth="{P1}{S3009}"/><CP ID="218" Pth="{P1}{S1000}/element(name = 'subUnit')"/></CPs><ReverseConnectionPoints//></Targets><Fs><F ID="4" T="ChangeVariable"><Ps C="S"><P N="variableID">2</P></Ps><CPs><CP ID="27" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="5" N="JavaScript_fileCreationDate" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var FileCreationDate = ec_VariableHelper.GetVariable(&quot;FileCreationDate&quot;);
// Ensure the input is valid
if (FileCreationDate &amp;&amp; typeof FileCreationDate === &quot;string&quot;) {
FileCreationDate = FileCreationDate.trim();
}
// Function to convert 'yyyy-MM-dd HH:mm:ss.S' to 'yyyy-MM-ddTHH:mm:ss'
function convertToISOFormat(dateStr) {
var match = dateStr.match(/^(\d{4})-(\d{2})-(\d{2}) (\d{2}):(\d{2}):(\d{2})/);
if (!match) {
return &quot;Invalid date format&quot;;
}
var year = match[1];
var month = match[2];
var day = match[3];
var hours = match[4];
var minutes = match[5];
var seconds = match[6];
return year + &quot;-&quot; + month + &quot;-&quot; + day + &quot;T&quot; + hours + &quot;:&quot; + minutes + &quot;:&quot; + seconds;
}
// Convert and report the result
if (FileCreationDate) {
var formattedDateTime = convertToISOFormat(FileCreationDate);
ec_ResultHelper.ReportResultByIndex(0, formattedDateTime);
}</P></Ps><CPs><CP ID="30" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="31" FP="A" P="0" N="value1"/><CP ID="29" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="6" T="SetValue"><CPs><CP ID="37" FP="A" N="v" DirectValue="PROF"/><CP ID="35" FP="X" N="r"/></ConnectionPoints/><F ID="8" T="SetValue"><CPs><CP ID="41" FP="A" N="v" DirectValue="1"/><CP ID="40" FP="X" N="r"/></ConnectionPoints/><F ID="9" T="SetValue"><CPs><CP ID="44" FP="A" N="v" DirectValue="Cotiviti"/><CP ID="43" FP="X" N="r"/></ConnectionPoints/><F ID="11" T="SetValue"><CPs><CP ID="48" FP="A" N="v" DirectValue="Product"/><CP ID="47" FP="X" N="r"/></ConnectionPoints/><F ID="12" T="ChangeVariable"><Ps C="S"><P N="variableID">1</P></Ps><CPs><CP ID="51" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="13" T="SetValue"><CPs><CP ID="54" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="55" FP="A" N="v" DirectValue="{1}"/><CP ID="53" FP="X" N="r"/></ConnectionPoints/><F ID="14" T="ChangeVariable"><Ps C="S"><P N="variableID">3</P></Ps><CPs><CP ID="59" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="15" N="JavaScript_claimLine" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var REC_LINE_STATUS = ec_VariableHelper.GetVariable(&quot;REC_LINE_STATUS&quot;);
var REC_HCPCS = ec_DataHelper.GetValueByIndex(0);
var REC_MOD_01 = ec_DataHelper.GetValueByIndex(1);
var REC_MOD_02 = ec_DataHelper.GetValueByIndex(2);
var REC_MOD_03 = ec_DataHelper.GetValueByIndex(3);
var REC_MOD_04 = ec_DataHelper.GetValueByIndex(4);
var REC_MOD_05 = ec_DataHelper.GetValueByIndex(5);
var REC_MOD_06 = ec_DataHelper.GetValueByIndex(6);
var REC_MOD_07 = ec_DataHelper.GetValueByIndex(7);
var REC_MOD_08 = ec_DataHelper.GetValueByIndex(8);
var REC_UNITS = ec_DataHelper.GetValueByIndex(9);
var REC_PCT = ec_DataHelper.GetValueByIndex(10);
var SUB_UNITS = ec_DataHelper.GetValueByIndex(11);
if (REC_LINE_STATUS != &quot;P&quot;)
{
ec_ResultHelper.ReportResultByIndex(0,REC_HCPCS);
ec_ResultHelper.ReportResultByIndex(1,REC_MOD_01);
ec_ResultHelper.ReportResultByIndex(2,REC_MOD_02);
ec_ResultHelper.ReportResultByIndex(3,REC_MOD_03);
ec_ResultHelper.ReportResultByIndex(4,REC_MOD_04);
ec_ResultHelper.ReportResultByIndex(5,REC_MOD_05);
ec_ResultHelper.ReportResultByIndex(6,REC_MOD_06);
ec_ResultHelper.ReportResultByIndex(7,REC_MOD_07);
ec_ResultHelper.ReportResultByIndex(8,REC_MOD_08);
ec_ResultHelper.ReportResultByIndex(9,REC_UNITS);
ec_ResultHelper.ReportResultByIndex(10,REC_PCT);
ec_ResultHelper.ReportResultByIndex(11,SUB_UNITS);
}</P></Ps><CPs><CP ID="72" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="73" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="74" FP="A" P="2" N="value3"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="75" FP="A" P="3" N="value4"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="76" FP="A" P="4" N="value5"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="77" FP="A" P="5" N="value6"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="78" FP="A" P="6" N="value7"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="79" FP="A" P="7" N="value8"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="80" FP="A" P="8" N="value9"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="81" FP="A" P="9" N="value10"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="82" FP="A" P="10" N="value11"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="215" FP="A" P="11" N="value12"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="61" FP="X" P="0" N="result1"/><CP ID="62" FP="X" P="1" N="result2"/><CP ID="63" FP="X" P="2" N="result3"/><CP ID="64" FP="X" P="3" N="result4"/><CP ID="65" FP="X" P="4" N="result5"/><CP ID="66" FP="X" P="5" N="result6"/><CP ID="67" FP="X" P="6" N="result7"/><CP ID="68" FP="X" P="7" N="result8"/><CP ID="69" FP="X" P="8" N="result9"/><CP ID="70" FP="X" P="9" N="result10"/><CP ID="71" FP="X" P="10" N="result11"/><CP ID="216" FP="X" P="11" N="result12"/></ConnectionPoints/><F ID="17" N="Conditional Copy_originalUnits" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">3</P><P N="if_1/conditions/expression_1/arg1/type">1</P><P N="if_1/conditions/expression_1/operation">1</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">P</P><P N="if_1/actions/assignment_1/lvalue">108</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">6</P><P N="if_1/actions/assignment_1/rvalue/type">1</P></Ps><CPs><CP ID="151" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="109" FP="A" P="0" N="value1"/><CP ID="108" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="21" N="JavaScript_reason" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var REC_LINE_STATUS = ec_VariableHelper.GetVariable(&quot;REC_LINE_STATUS&quot;);
var REASON1_ID = ec_DataHelper.GetValueByIndex(0);
var REASON2_ID = ec_DataHelper.GetValueByIndex(1);
var REASON3_ID = ec_DataHelper.GetValueByIndex(2);
if (REC_LINE_STATUS !=&quot;P&quot;)
{
var output1 = REASON1_ID + &quot; &quot; + &quot;Action Reason&quot;; // Modify format if needed
var output2 = REASON2_ID + &quot; &quot; + &quot;Action Reason&quot;;
var output3 = REASON3_ID + &quot; &quot; + &quot;Action Reason&quot;;
if(REASON1_ID != &quot;&quot;){
ec_ResultHelper.ReportResultByIndex(0, REASON1_ID);
ec_ResultHelper.ReportResultByIndex(1, output1);
}
if(REASON2_ID != &quot;&quot;)
{
ec_ResultHelper.ReportResultByIndex(2, REASON2_ID);
ec_ResultHelper.ReportResultByIndex(3, output2);
}
if(REASON3_ID != &quot;&quot;)
{
ec_ResultHelper.ReportResultByIndex(4, REASON3_ID);
ec_ResultHelper.ReportResultByIndex(5, output3);
}
}</P></Ps><CPs><CP ID="143" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="144" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="145" FP="A" P="2" N="value3"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="137" FP="X" P="0" N="result1"/><CP ID="138" FP="X" P="1" N="result2"/><CP ID="139" FP="X" P="2" N="result3"/><CP ID="140" FP="X" P="3" N="result4"/><CP ID="141" FP="X" P="4" N="result5"/><CP ID="142" FP="X" P="5" N="result6"/></ConnectionPoints/><F ID="23" T="ChangeVariable"><Ps C="S"><P N="variableID">3</P></Ps><CPs><CP ID="149" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="148" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="24" T="ChangeVariable"><Ps C="S"><P N="variableID">4</P></Ps><CPs><CP ID="150" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="25" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">155</P><P N="if_1/conditions/expression_1/arg1/type">2</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">1</P><P N="if_1/actions/assignment_1/lvalue">154</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">156</P><P N="if_1/actions/assignment_1/rvalue/type">2</P></Ps><CPs><CP ID="155" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="156" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="154" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="26" T="ChangeVariable"><Ps C="S"><P N="variableID">5</P></Ps><CPs><CP ID="157" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="27" N="JavaScript_AdjLogNote" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var REC_LINE_STATUS = ec_VariableHelper.GetVariable(&quot;Adj_LogNote&quot;);
if (REC_LINE_STATUS != &quot;P&quot;)
{
ec_ResultHelper.ReportResultByIndex(0,REC_LINE_STATUS);
}
</P></Ps><CPs><CP ID="159" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="160" FP="A" P="0" N="value1"/><CP ID="158" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="29" T="SetValue"><CPs><CP ID="211" FP="A" N="v" DirectValue="1"/><CP ID="210" FP="X" N="r"/></ConnectionPoints/><F ID="31" T="SetValue"><CPs><CP ID="222" FP="A" N="v" DirectValue="Cotiviti Prof"/><CP ID="221" FP="X" N="r"/></ConnectionPoints/><F ID="32" N="Trim-Line Sequence" T="Trim"><Ps C="S"><P N="paddings">0</P><P N="type">1</P></Ps><CPs><CP ID="223" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="224" FP="X" N="r"/></ConnectionPoints/><F ID="35" T="ChangeVariable"><Ps C="S"><P N="variableID">6</P></Ps><CPs><CP ID="228" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="36" T="ChangeVariable"><Ps C="S"><P N="variableID">6</P></Ps><CPs><CP ID="230" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="229" FP="A" N="v"/></ConnectionPoints/><F ID="37" T="SetValue"><CPs><CP ID="233" FP="A" N="v" DirectValue="1"/><CP ID="232" FP="X" N="r"/></ConnectionPoints/></Fs><Cs><C OutputCP="28" InputCP="27"/><C OutputCP="33" InputCP="30"><Ps C="GuidelineFilters"><P N="Event">2</P></Ps></C><C OutputCP="52" InputCP="51"/><C OutputCP="33" InputCP="54"><Ps C="GuidelineFilters"><P N="Event">2</P></Ps></C><C OutputCP="60" InputCP="59"/><C OutputCP="83" InputCP="72"/><C OutputCP="84" InputCP="73"/><C OutputCP="85" InputCP="74"/><C OutputCP="86" InputCP="75"/><C OutputCP="87" InputCP="76"/><C OutputCP="88" InputCP="77"/><C OutputCP="89" InputCP="78"/><C OutputCP="90" InputCP="79"/><C OutputCP="91" InputCP="80"/><C OutputCP="92" InputCP="81"/><C OutputCP="93" InputCP="82"/><C OutputCP="118" InputCP="143"/><C OutputCP="119" InputCP="144"/><C OutputCP="120" InputCP="145"/><C OutputCP="33" InputCP="149"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="60" InputCP="150"/><C OutputCP="33" InputCP="151"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="60" InputCP="156"/><C OutputCP="154" InputCP="157"/><C OutputCP="33" InputCP="159"><Ps C="GuidelineFilters"><P N="Event">2</P></Ps></C><C OutputCP="21" InputCP="162"></C><C OutputCP="25" InputCP="165"></C><C OutputCP="40" InputCP="171"/><C OutputCP="53" InputCP="172"/><C OutputCP="61" InputCP="174"/><C OutputCP="62" InputCP="175"/><C OutputCP="63" InputCP="176"/><C OutputCP="64" InputCP="177"/><C OutputCP="65" InputCP="178"/><C OutputCP="66" InputCP="179"/><C OutputCP="67" InputCP="180"/><C OutputCP="68" InputCP="181"/><C OutputCP="69" InputCP="182"/><C OutputCP="70" InputCP="183"/><C OutputCP="71" InputCP="184"/><C OutputCP="137" InputCP="186"/><C OutputCP="139" InputCP="187"/><C OutputCP="141" InputCP="188"/><C OutputCP="138" InputCP="189"/><C OutputCP="140" InputCP="190"/><C OutputCP="142" InputCP="191"/><C OutputCP="108" InputCP="192"/><C OutputCP="158" InputCP="194"/><C OutputCP="137" InputCP="195"/><C OutputCP="23" InputCP="196"></C><C OutputCP="152" InputCP="197"></C><C OutputCP="198" InputCP="199"></C><C OutputCP="200" InputCP="201"></C><C OutputCP="35" InputCP="204"/><C OutputCP="29" InputCP="205"/><C OutputCP="206" InputCP="207"></C><C OutputCP="210" InputCP="212"/><C OutputCP="47" InputCP="170"/><C OutputCP="198" InputCP="214"></C><C OutputCP="217" InputCP="215"/><C OutputCP="216" InputCP="218"/><C OutputCP="60" InputCP="185"></C><C OutputCP="43" InputCP="213"/><C OutputCP="221" InputCP="169"/><C OutputCP="57" InputCP="223"/><C OutputCP="224" InputCP="173"/><C OutputCP="224" InputCP="155"/><C OutputCP="33" InputCP="230"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="231" InputCP="228"/><C OutputCP="232" InputCP="193"/></Cs></Map>
</file>
<file path="ArtifactsRepository/SecondaryEditing/IBSecondaryClaimsEvicore/Map/IB_SecondaryClaims_Evicore_DFF_To_XML.ems">
<?xml version="1.0" encoding="UTF-8"?><Map Version="3" ModelVersion="4" ModelRevision="1" LastCPID="163"><Ps C="Variables"><P N="LastVarID">9</P><P N="1/ID">1</P><P N="1/Name">Claim_ID</P><P N="2/ID">2</P><P N="2/Name">SystemDateTime</P><P N="3/ID">3</P><P N="3/Name">ReasonCode</P><P N="4/ID">4</P><P N="4/Name">Adj_LogNote</P><P N="5/ID">6</P><P N="5/Name">HCFA_UB_Indicator</P><P N="5/InitValue"/><P N="6/ID">7</P><P N="6/Name">ReasonCode_Adj</P><P N="6/InitValue"/><P N="7/ID">8</P><P N="7/Name">Quantity</P><P N="7/InitValue"/><P N="8/ID">9</P><P N="8/Name">Pay_Qty</P><P N="8/InitValue"/></Ps><Sources><ES ID="1" Type="File.ECS"><Ps><P N="Name">Source</P><P N="Location">..\Guideline\IB_SecondaryClaims_Evicore_DFF_Translation_SOURCE.ecs</P></Ps><CPs><CP ID="4" Pth="{P4}/Field(ID = 'HealthPlan Claim Id')"/><CP ID="6" Pth="{P4}/Field(ID = 'HealthPlan Line Number')"/><CP ID="8" Pth="{P4}/Field(ID = 'Reason Code')"/><CP ID="20" Pth="{P4}"/><CP ID="43" Pth="{S3002}"/><CP ID="44" Pth="{S3005}"/><CP ID="45" Pth="{S3008}"/><CP ID="46" Pth="{S3006}"/><CP ID="52" Pth="{P4}/Field(ID = 'Quantity')"/><CP ID="54" Pth="{P4}/Field(ID = 'Pay Qty')"/><CP ID="62" Pth="{S3001}"/><CP ID="107" Pth="{S3003}"/><CP ID="109" Pth="{S3007}"/><CP ID="116" Pth="{P4}/Field(ID = 'HCFA/UB Indicator')"/><CP ID="118" Pth="{S3004}"/></ConnectionPoints/></Sources><Targets><ES ID="2" Type="File.ECS"><Ps><P N="Name">Target</P><P N="Location">..\..\IBSecondaryClaimsCommon\Guideline\IB_SecondaryClaims_XML_Target.ecs</P></Ps><CPs><CP ID="82" Pth="{P3}{S1002}{S3020}"/><CP ID="85" Pth="{P3}{S1002}{S3018}"/><CP ID="88" Pth="{P3}{S1002}{S3010}"/><CP ID="89" Pth="{P3}{S1002}{S3026}"/><CP ID="90" Pth="{P1}{S1001}{S3019}"/><CP ID="91" Pth="{P1}{S1000}{S3021}"/><CP ID="92" Pth="{P1}{S1000}{S3000}/element(name = 'actionType')"/><CP ID="93" Pth="{P1}{S1000}{S3000}/element(name = 'reasons')/complexType/sequence/element(name = 'reason')/complexType/sequence/element(name = 'code')"/><CP ID="94" Pth="{P1}{S1000}{S3000}/element(name = 'reasons')/complexType/sequence/element(name = 'reason')/complexType/sequence/element(name = 'description')"/><CP ID="95" Pth="{P1}{S1000}{S3000}/element(name = 'originalUnits')"/><CP ID="96" Pth="{P1}{S1000}{S3000}/element(name = 'adjustedUnits')"/><CP ID="97" Pth="{P1}{S1000}{S3000}/element(name = 'userMessageCode')"/><CP ID="98" Pth="{P1}{S1001}{S3015}"/><CP ID="99" Pth="{P1}{S1001}{S3011}"/><CP ID="104" Pth="{P3}{S1002}{S3024}"/><CP ID="105" Pth="{P3}{S1002}{S3027}"/><CP ID="106" Pth="{P3}{S1002}{S3016}"/><CP ID="108" Pth="{P1}{S3017}"/><CP ID="110" Pth="{P1}{S3022}"/><CP ID="113" Pth="{P3}{S1002}{S3014}"/><CP ID="117" Pth="{P3}{S1002}{S3025}"/><CP ID="119" Pth="{P3}{S1002}{S3013}"/><CP ID="124" Pth="{P2}{S3023}"/><CP ID="125" Pth="{P1}{S3012}"/><CP ID="126" Pth="{P1}{S3009}"/></CPs><ReverseConnectionPoints//></Targets><Fs><F ID="1" T="SetValue"><CPs><CP ID="3" FP="A" N="v" DirectValue="Evicore"/><CP ID="1" FP="X" N="r"/></ConnectionPoints/><F ID="3" T="ChangeVariable"><Ps C="S"><P N="variableID">1</P></Ps><CPs><CP ID="14" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="5" T="SetValue"><CPs><CP ID="19" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="18" FP="A" N="v" DirectValue="{1}"/><CP ID="17" FP="X" N="r"/></ConnectionPoints/><F ID="7" T="SetValue"><CPs><CP ID="30" FP="A" N="v" DirectValue="1"/><CP ID="29" FP="X" N="r"/></ConnectionPoints/><F ID="9" N="JavaScript_fileCreationDate" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var systemDateTime = ec_VariableHelper.GetVariable(&quot;SystemDateTime&quot;);
// Ensure the input is valid
if (systemDateTime &amp;&amp; typeof systemDateTime === &quot;string&quot;) {
systemDateTime = systemDateTime.trim();
}
// Function to convert 'yyyy-MM-dd HH:mm:ss.S' to 'yyyy-MM-ddTHH:mm:ss'
function convertToISOFormat(dateStr) {
var match = dateStr.match(/^(\d{4})-(\d{2})-(\d{2}) (\d{2}):(\d{2}):(\d{2})/);
if (!match) {
return &quot;Invalid date format&quot;;
}
var year = match[1];
var month = match[2];
var day = match[3];
var hours = match[4];
var minutes = match[5];
var seconds = match[6];
return year + &quot;-&quot; + month + &quot;-&quot; + day + &quot;T&quot; + hours + &quot;:&quot; + minutes + &quot;:&quot; + seconds;
}
// Convert and report the result
if (systemDateTime) {
var formattedDateTime = convertToISOFormat(systemDateTime);
ec_ResultHelper.ReportResultByIndex(0, formattedDateTime);
}
</P></Ps><CPs><CP ID="41" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="38" FP="A" P="0" N="value1"/><CP ID="39" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="10" T="ChangeVariable"><Ps C="S"><P N="variableID">2</P></Ps><CPs><CP ID="40" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="17" N="JavaScript_reason" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var ReasonCode = ec_DataHelper.GetValueByIndex(0);
// Replace with the actual action reason string
var output = ReasonCode + &quot; &quot; + &quot;Action Reason&quot;; // Modify format if needed
ec_ResultHelper.ReportResultByIndex(0, output);
</P></Ps><CPs><CP ID="71" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="70" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="21" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">76</P><P N="if_1/conditions/expression_1/arg1/type">2</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">1</P><P N="if_1/actions/assignment_1/lvalue">77</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">78</P><P N="if_1/actions/assignment_1/rvalue/type">2</P></Ps><CPs><CP ID="76" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="78" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="77" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="23" T="SetValue"><CPs><CP ID="103" FP="A" N="v" DirectValue="Product"/><CP ID="102" FP="X" N="r"/></ConnectionPoints/><F ID="26" T="SetValue"><CPs><CP ID="123" FP="A" N="v" DirectValue="1"/><CP ID="122" FP="X" N="r"/></ConnectionPoints/><F ID="32" T="ChangeVariable"><Ps C="S"><P N="variableID">7</P></Ps><CPs><CP ID="143" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="39" T="SetValue"><CPs><CP ID="154" FP="A" N="v" DirectValue="1"/><CP ID="153" FP="X" N="r"/></ConnectionPoints/><F ID="41" T="ChangeVariable"><Ps C="S"><P N="variableID">6</P></Ps><CPs><CP ID="158" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="42" N="JavaScript_InputFileType" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var HCFA_UB_Indicator = ec_VariableHelper.GetVariable(&quot;HCFA_UB_Indicator&quot;);
if (HCFA_UB_Indicator == &quot;UB04&quot;)
{
ec_ResultHelper.ReportResultByIndex(0,&quot;INST&quot;);
}
else if(HCFA_UB_Indicator == &quot;1500&quot;)
{
ec_ResultHelper.ReportResultByIndex(0,&quot;PROF&quot;);
}</P></Ps><CPs><CP ID="160" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="161" FP="A" P="0" N="value1"/><CP ID="159" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="43" N="Trim-Linenumber" T="Trim"><Ps C="S"><P N="paddings">0</P><P N="type">1</P></Ps><CPs><CP ID="162" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="163" FP="X" N="r"/></ConnectionPoints/></Fs><Cs><C OutputCP="4" InputCP="14"/><C OutputCP="20" InputCP="19"><Ps C="GuidelineFilters"><P N="Event">2</P></Ps></C><C OutputCP="20" InputCP="41"><Ps C="GuidelineFilters"><P N="Event">2</P></Ps></C><C OutputCP="43" InputCP="40"/><C OutputCP="8" InputCP="71"/><C OutputCP="8" InputCP="78"/><C OutputCP="46" InputCP="82"></C><C OutputCP="44" InputCP="85"></C><C OutputCP="29" InputCP="88"/><C OutputCP="1" InputCP="89"/><C OutputCP="17" InputCP="90"/><C OutputCP="70" InputCP="94"/><C OutputCP="77" InputCP="98"/><C OutputCP="45" InputCP="105"></C><C OutputCP="62" InputCP="106"></C><C OutputCP="107" InputCP="108"></C><C OutputCP="109" InputCP="110"></C><C OutputCP="39" InputCP="113"/><C OutputCP="118" InputCP="119"></C><C OutputCP="102" InputCP="104"/><C OutputCP="122" InputCP="124"/><C OutputCP="1" InputCP="125"/><C OutputCP="107" InputCP="126"></C><C OutputCP="8" InputCP="143"/><C OutputCP="153" InputCP="99"/><C OutputCP="8" InputCP="92"></C><C OutputCP="8" InputCP="93"></C><C OutputCP="52" InputCP="95"></C><C OutputCP="54" InputCP="96"></C><C OutputCP="8" InputCP="97"></C><C OutputCP="116" InputCP="158"/><C OutputCP="20" InputCP="160"><Ps C="GuidelineFilters"><P N="Event">2</P></Ps></C><C OutputCP="159" InputCP="117"/><C OutputCP="163" InputCP="91"/><C OutputCP="6" InputCP="162"/><C OutputCP="163" InputCP="76"/></Cs></Map>
</file>
<file path="ArtifactsRepository/SecondaryEditing/IBSecondaryClaimsOptum/Map/IB_SecondaryClaims_Optum_DFF_To_XML.ems">
<?xml version="1.0" encoding="UTF-8"?><Map Version="3" ModelVersion="4" ModelRevision="1" LastCPID="171"><Ps C="Variables"><P N="LastVarID">9</P><P N="1/ID">1</P><P N="1/Name">FileCreationDate</P><P N="2/ID">3</P><P N="2/Name">Client_Claim_ID</P><P N="3/ID">4</P><P N="3/Name">Rec_Status_Code</P><P N="4/ID">5</P><P N="4/Name">Reason_Code</P><P N="5/ID">6</P><P N="5/Name">ClaimType</P><P N="6/ID">7</P><P N="6/Name">Rec_Status_Code_Adj</P><P N="7/ID">8</P><P N="7/Name">LogNote</P><P N="7/InitValue"/><P N="8/ID">9</P><P N="8/Name">Adj_LogNote</P><P N="8/InitValue"/></Ps><Sources><ES ID="1" Type="File.ECS"><Ps><P N="Name">Source</P><P N="Location">..\Guideline\IB_SecondaryClaims_Optum_DFF_Translation_SOURCE.ecs</P></Ps><CPs><CP ID="1" Pth="{S3006}"/><CP ID="3" Pth="{S3008}"/><CP ID="5" Pth="{S3005}"/><CP ID="11" Pth="{S3002}"/><CP ID="15" Pth="{P4}"/><CP ID="27" Pth="{P4}/Field(ID = 'Client Claim ID')"/><CP ID="32" Pth="{P4}/Field(ID = 'Line Number')"/><CP ID="36" Pth="{P4}/Field(ID = 'Recommendation Status Code')"/><CP ID="42" Pth="{P4}/Field(ID = 'Reason Code')"/><CP ID="46" Pth="{P4}/Field(ID = 'Reason Code Description')"/><CP ID="51" Pth="{P4}/Field(ID = 'Recommended Units of Service To Allow')"/><CP ID="61" Pth="{P4}/Field(ID = 'Claim Type')"/><CP ID="75" Pth="{S3001}"/><CP ID="152" Pth="{S3003}"/><CP ID="154" Pth="{S3007}"/><CP ID="159" Pth="{S3004}"/></ConnectionPoints/></Sources><Targets><ES ID="2" Type="File.ECS"><Ps><P N="Name">Target</P><P N="Location">..\..\IBSecondaryClaimsCommon\Guideline\IB_SecondaryClaims_XML_Target.ecs</P></Ps><CPs><CP ID="130" Pth="{P3}{S1002}{S3020}"/><CP ID="134" Pth="{P3}{S1002}{S3018}"/><CP ID="137" Pth="{P3}{S1002}{S3010}"/><CP ID="138" Pth="{P3}{S1002}{S3026}"/><CP ID="139" Pth="{P3}{S1002}{S3024}"/><CP ID="140" Pth="{P1}{S1001}{S3019}"/><CP ID="141" Pth="{P1}{S1000}{S3021}"/><CP ID="142" Pth="{P1}{S1000}{S3000}/element(name = 'actionType')"/><CP ID="143" Pth="{P1}{S1000}{S3000}/element(name = 'reasons')/complexType/sequence/element(name = 'reason')/complexType/sequence/element(name = 'code')"/><CP ID="144" Pth="{P1}{S1000}{S3000}/element(name = 'reasons')/complexType/sequence/element(name = 'reason')/complexType/sequence/element(name = 'description')"/><CP ID="145" Pth="{P1}{S1000}{S3000}/element(name = 'adjustedUnits')"/><CP ID="146" Pth="{P1}{S1000}{S3000}/element(name = 'userMessageCode')"/><CP ID="147" Pth="{P1}{S1001}{S3015}"/><CP ID="148" Pth="{P1}{S1001}{S3011}"/><CP ID="149" Pth="{P3}{S1002}{S3027}"/><CP ID="150" Pth="{P3}{S1002}{S3025}"/><CP ID="151" Pth="{P3}{S1002}{S3016}"/><CP ID="153" Pth="{P1}{S3017}"/><CP ID="155" Pth="{P1}{S3022}"/><CP ID="158" Pth="{P3}{S1002}{S3014}"/><CP ID="160" Pth="{P3}{S1002}{S3013}"/><CP ID="165" Pth="{P2}{S3023}"/><CP ID="166" Pth="{P1}{S3012}"/><CP ID="167" Pth="{P1}{S3009}"/></CPs><ReverseConnectionPoints//></Targets><Fs><F ID="1" T="SetValue"><CPs><CP ID="8" FP="A" N="v" DirectValue="1"/><CP ID="7" FP="X" N="r"/></ConnectionPoints/><F ID="2" T="ChangeVariable"><Ps C="S"><P N="variableID">1</P></Ps><CPs><CP ID="10" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="3" N="JavaScript_fileCreationDate" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var FileCreationDate = ec_VariableHelper.GetVariable(&quot;FileCreationDate&quot;);
// Ensure the input is valid
if (FileCreationDate &amp;&amp; typeof FileCreationDate === &quot;string&quot;) {
FileCreationDate = FileCreationDate.trim();
}
// Function to convert 'yyyy-MM-dd HH:mm:ss.S' to 'yyyy-MM-ddTHH:mm:ss'
function convertToISOFormat(dateStr) {
var match = dateStr.match(/^(\d{4})-(\d{2})-(\d{2}) (\d{2}):(\d{2}):(\d{2})/);
if (!match) {
return &quot;Invalid date format&quot;;
}
var year = match[1];
var month = match[2];
var day = match[3];
var hours = match[4];
var minutes = match[5];
var seconds = match[6];
return year + &quot;-&quot; + month + &quot;-&quot; + day + &quot;T&quot; + hours + &quot;:&quot; + minutes + &quot;:&quot; + seconds;
}
// Convert and report the result
if (FileCreationDate) {
var formattedDateTime = convertToISOFormat(FileCreationDate);
ec_ResultHelper.ReportResultByIndex(0, formattedDateTime);
}</P></Ps><CPs><CP ID="13" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="14" FP="A" P="0" N="value1"/><CP ID="12" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="4" T="SetValue"><CPs><CP ID="18" FP="A" N="v" DirectValue="Optum"/><CP ID="17" FP="X" N="r"/></ConnectionPoints/><F ID="6" T="SetValue"><CPs><CP ID="23" FP="A" N="v" DirectValue="Product"/><CP ID="22" FP="X" N="r"/></ConnectionPoints/><F ID="7" T="ChangeVariable"><Ps C="S"><P N="variableID">3</P></Ps><CPs><CP ID="26" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="8" T="SetValue"><CPs><CP ID="29" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="30" FP="A" N="v" DirectValue="{3}"/><CP ID="28" FP="X" N="r"/></ConnectionPoints/><F ID="10" N="Conditional Copy_reason" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">4</P><P N="if_1/conditions/expression_1/arg1/type">1</P><P N="if_1/conditions/expression_1/operation">1</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">A</P><P N="if_1/actions/assignment_1/lvalue">41</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">40</P><P N="if_1/actions/assignment_1/rvalue/type">2</P><P N="if_1/actions/assignment_2/lvalue">50</P><P N="if_1/actions/assignment_2/lvalue/type">2</P><P N="if_1/actions/assignment_2/rvalue">49</P><P N="if_1/actions/assignment_2/rvalue/type">2</P><P N="if_1/actions/assignment_3/lvalue">54</P><P N="if_1/actions/assignment_3/lvalue/type">2</P><P N="if_1/actions/assignment_3/rvalue">40</P><P N="if_1/actions/assignment_3/rvalue/type">2</P></Ps><CPs><CP ID="40" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="49" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="41" FP="X" P="0" N="result1"/><CP ID="50" FP="X" P="1" N="result2"/><CP ID="54" FP="X" P="2" N="result3"/></ConnectionPoints/><F ID="11" N="JavaScript_reason_description" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var Rec_Status_Code = ec_VariableHelper.GetVariable(&quot;Rec_Status_Code&quot;);
var Reason_Code = ec_DataHelper.GetValueByIndex(0);
var Reason_Code_Description = ec_DataHelper.GetValueByIndex(1);
if (Rec_Status_Code !=&quot;A&quot;)
{
var output1 = Reason_Code + &quot; &quot; + Reason_Code_Description;
ec_ResultHelper.ReportResultByIndex(0, output1);
}</P></Ps><CPs><CP ID="44" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="48" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="45" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="14" T="ChangeVariable"><Ps C="S"><P N="variableID">6</P></Ps><CPs><CP ID="63" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="15" T="ChangeVariable"><Ps C="S"><P N="variableID">4</P></Ps><CPs><CP ID="65" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="19" T="ChangeVariable"><Ps C="S"><P N="variableID">4</P></Ps><CPs><CP ID="73" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="72" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="20" T="ChangeVariable"><Ps C="S"><P N="variableID">7</P></Ps><CPs><CP ID="74" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="24" N="JavaScript_InputFileType" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var ClaimType = ec_VariableHelper.GetVariable(&quot;ClaimType&quot;);
if (ClaimType == &quot;P&quot;)
{
ec_ResultHelper.ReportResultByIndex(0,&quot;PROF&quot;);
}
else if(ClaimType == &quot;I&quot;)
{
ec_ResultHelper.ReportResultByIndex(0,&quot;INST&quot;);
}</P></Ps><CPs><CP ID="87" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="88" FP="A" P="0" N="value1"/><CP ID="86" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="29" N="JavaScript_AdjLogNote" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var Rec_Status_Code = ec_VariableHelper.GetVariable(&quot;Adj_LogNote&quot;);
if (Rec_Status_Code != &quot;A&quot;)
{
ec_ResultHelper.ReportResultByIndex(0,Rec_Status_Code);
}
</P></Ps><CPs><CP ID="108" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="109" FP="A" P="0" N="value1"/><CP ID="107" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="31" T="ChangeVariable"><Ps C="S"><P N="variableID">9</P></Ps><CPs><CP ID="111" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="34" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">116</P><P N="if_1/conditions/expression_1/arg1/type">2</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">1</P><P N="if_1/actions/assignment_1/lvalue">117</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">118</P><P N="if_1/actions/assignment_1/rvalue/type">2</P></Ps><CPs><CP ID="116" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="118" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="117" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="36" T="SetValue"><CPs><CP ID="164" FP="A" N="v" DirectValue="1"/><CP ID="163" FP="X" N="r"/></ConnectionPoints/><F ID="37" N="Trim-Linenumber" T="Trim"><Ps C="S"><P N="paddings">0</P><P N="type">1</P></Ps><CPs><CP ID="168" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="169" FP="X" N="r"/></ConnectionPoints/><F ID="38" T="SetValue"><CPs><CP ID="171" FP="A" N="v" DirectValue="1"/><CP ID="170" FP="X" N="r"/></ConnectionPoints/></Fs><Cs><C OutputCP="11" InputCP="10"/><C OutputCP="15" InputCP="13"><Ps C="GuidelineFilters"><P N="Event">2</P></Ps></C><C OutputCP="27" InputCP="26"/><C OutputCP="15" InputCP="29"><Ps C="GuidelineFilters"><P N="Event">2</P></Ps></C><C OutputCP="42" InputCP="40"/><C OutputCP="42" InputCP="44"/><C OutputCP="46" InputCP="48"/><C OutputCP="51" InputCP="49"/><C OutputCP="61" InputCP="63"/><C OutputCP="36" InputCP="65"/><C OutputCP="15" InputCP="73"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="36" InputCP="74"/><C OutputCP="15" InputCP="87"><Ps C="GuidelineFilters"><P N="Event">2</P></Ps></C><C OutputCP="36" InputCP="118"/><C OutputCP="15" InputCP="108"><Ps C="GuidelineFilters"><P N="Event">2</P></Ps></C><C OutputCP="117" InputCP="111"/><C OutputCP="1" InputCP="130"></C><C OutputCP="5" InputCP="134"></C><C OutputCP="7" InputCP="137"/><C OutputCP="17" InputCP="138"/><C OutputCP="22" InputCP="139"/><C OutputCP="28" InputCP="140"/><C OutputCP="41" InputCP="143"/><C OutputCP="45" InputCP="144"/><C OutputCP="50" InputCP="145"/><C OutputCP="54" InputCP="146"/><C OutputCP="107" InputCP="147"/><C OutputCP="3" InputCP="149"></C><C OutputCP="86" InputCP="150"/><C OutputCP="75" InputCP="151"></C><C OutputCP="152" InputCP="153"></C><C OutputCP="154" InputCP="155"></C><C OutputCP="12" InputCP="158"/><C OutputCP="159" InputCP="160"></C><C OutputCP="163" InputCP="165"/><C OutputCP="17" InputCP="166"/><C OutputCP="152" InputCP="167"></C><C OutputCP="36" InputCP="142"></C><C OutputCP="32" InputCP="168"/><C OutputCP="169" InputCP="141"/><C OutputCP="169" InputCP="116"/><C OutputCP="170" InputCP="148"/></Cs></Map>
</file>
<file path="ArtifactsRepository/SecondaryEditing/Test.properties">
#
#Wed Feb 05 01:29:08 EST 2025
Test_Automation_Customization=true
</file>