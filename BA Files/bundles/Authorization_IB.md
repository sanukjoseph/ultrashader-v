# Authorization IB

## Authorization IB/EDI 278/V26.1.1/278 AuthorizationIB_Audit_mapping.xlsx — Cover sheet

```csv
,278 Authorization Inbound Audit Processing -  EDIFECS,,,,,,,,,
,,,,,,,,,,
,Business Area: 278 AuthIB,,,,,,,,,
,,,,,,,,,,
,This document provides the Mapping Specification for 278 Auth IB. Document is intended for EDIFECS Product Team,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,Version,,V24.3.0.0,,,
,,,,,,,,,,
,,Distribution of this document is limited to UST HealthProof,,,,,,,,
,,,,,,,,,,
,,Notice of Confidentiality and Custodial Responsibilities,,,,,,,,
,,"This UST HealthProof document contains confidential information that is
UST HealthProof’s intellectual property. As a holder of this document, you
 may NOT disclose its content or any information derived from it to
any person outside of UST Proof Project Team.",,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,Sign Off,,,,,,,,,
,,Name,,Role,,Organization,,Date,,Approval
,Approver #1,,,,,,,,,
,Approver #2,,,,,,,,,
,Approver #3,,,,,,,,,
,Approver #4,,,,,,,,,
```

## Authorization IB/EDI 278/V26.1.1/278 AuthorizationIB_Audit_mapping.xlsx — Edifecs Json Mapping

```csv
Group,Fields,278 Auth Ib values,Description,Sample values,comments
,recordIdentifier,A Unique Record Identifier.,"Unique Identifier for transaction level. Will be different when we split, reprocess a same record.",GzlBkxrCvJTTBbTj,to be checked
,recordIdentifierFromSource,2000E.HCR,,IP7860004,
,memberId,2010C.NM109,,ak1234567,
,inputFileId,Value passed is  - {UID}- Uniqie for each file,EDI file id,mTQhkxrCu_TTBbTi,
inputHeaderInfo,inputFileType,EDI,Defines the type of input file - API or File,EDI,
,inputArchiveFilename,Input Filename of the EDI file archived in s3 with filename extension,Name of the input file after archiving the input file.,Input_2024-11-11 05:26:30:005_Input_NM1segment.txt,
,inputFileReceiptDateTime,Input file receipt date time of when the file is dropped to edifecs profile,,2024-11-11T05:26:30.000000004,2024-11-11T05:26:30.000000004
,inputFileName,Input Filename of the EDI file received with filename extension,Name of the input file received from source.,Input_NM1segment.txt,
,auditTime,The time the audit json got generated in yyyy-MM-dd'T'HH:mm:ss.SSS format,Auditing time of each audit point,2024-11-11T05:26:30.000000301,to be checked
,sourceTypeIdentifier,Hardcode as Products,Identifier to find from where we received(Starting point) the initial Transaction/Record.,Products,Custom field
businessAdaptor,adaptorReceiptDateTime,The time when the file is dropped to edifecs profile  in yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS format,,2024-11-11T05:26:30.000000004,
,adaptorAuditDateTime,The time the audit trigger event  got generated in yyyy-MM-dd'T'HH:mm:ss.SSS format,Auditing time of each audit point,2024-11-11T05:26:30.000000004,
processStatus,processStageName,Refer Audit events Tab,Represent the name of the process stage which post the Audit point.,EDIFECS-Validation,
,adaptorStatus,Refer Audit events Tab,Represent the Intermediate or Final status of the process stage which posts the Audit point.,SUCCESS,
```

## Authorization IB/EDI 278/V26.1.1/278 AuthorizationIB_Audit_mapping.xlsx — Audit events

```csv
Audit events,,,
processStageName,adaptorStatus,JSON TRIGGER EVENT,Comments
EDIFECS,Message Read,As soon as IB file is picked for processing - File level,
EDIFECS_Validation,Success/Failure,SNIP validations,
EDIFECS_Conversion,Success/Failure,XML Conversion,
EDIFECS_Api call Response,Success/Failure,API static response,
```

## Authorization IB/EDI 278/V26.1.1/278 AuthorizationIB_Audit_mapping.xlsx — Sample Audit

```csv
Audit events,Sample
MESSAGE READ,"{
		""inputFileID"": ""pS3BkyiosYkGHi2d"",
	 ""inputHeaderInfo"": {
		""inputFileType"": ""EDI"",
		""inputArchiveFilename"": ""Input_2024-11-13 22:12:44:429_input44.dat"",
		""inputFileReceiptDateTime"": ""2024-11-13T22:12:44.000000427"",
		""inputFileName"": ""input44.dat"",
		""auditTime"": ""2024-11-13T22:12:49.000000778""
  },
  	 ""businessAdaptor"": {
		""adaptorReceiptDateTime"": ""2024-11-13T22:12:44.000000427"",
		""adaptorAuditDateTime"": ""2024-11-13T22:12:49.000000778""
	 },
	 ""processStatus"": {
	   ""processStageName"": ""EDIFECS"",
	   ""adaptorStatus"": ""MESSAGE READ""
   }

}"
EDIFECS-Validation,"{
""recordIdentifier"": ""GzlBkxrCvJTTBbTj"",
		""recordIdentifierFromSource"": ""IP7860004"",
		""memberId"": ""ak1234567"",
		""inputFileID"": ""mTQhkxrCu_TTBbTi"",
	 ""inputHeaderInfo"": {
		""inputFileType"": ""EDI"",
		""inputArchiveFilename"": ""Input_2024-11-11 05:26:30:005_Input_NM1segment.txt"",
		""inputFileReceiptDateTime"": ""2024-11-11T05:26:30.000000004"",
		""inputFileName"": ""Input_NM1segment.txt"",
		""auditTime"": ""2024-11-11T05:26:30.000000301""
  },
		""sourceTypeIdentifier"": ""SUPPLIER_1615190209006625591_Inpatient"",
  	 ""businessAdaptor"": {
		""adaptorReceiptDateTime"": ""2024-11-11T05:26:30.000000004"",
		""adaptorAuditDateTime"": ""2024-11-11T05:26:30.000000301""
	 },
	 ""processStatus"": {
	   ""processStageName"": ""EDIFECS-Validation"",
	   ""adaptorStatus"": ""SUCCESS""
   }"
```

## Authorization IB/EDI 278/V26.1.1/EDIFECS_Product_MappingSpec_AuthorizationInbound_278_EDI_to_XML Conversion_V1.2.xlsx — Cover Sheet

```csv
EDIFECS Product - 278 Authorization IB Mapping Specification,,,,,,,,,
,,,,,,,,,
Business Area: IB Authorization EDI 278 to XML Conversion,,,,,,,,,
,,,,,,,,,
This document provides the Mapping Specification for EDI 278 to XML Auth IB. Document is intended for EDIFECS Product Team,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,Version,,,,,
,,,,,,,,,
,Distribution of this document is limited to UST HealthProof,,,,,,,,
,,,,,,,,,
,Notice of Confidentiality and Custodial Responsibilities,,,,,,,,
,"This UST HealthProof document contains confidential information that is
UST HealthProof’s intellectual property. As a holder of this document, you
 may NOT disclose its content or any information derived from it to
any person outside of UST Proof Project Team.",,,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
Sign Off,,,,,,,,,
,Name,,Role,,Organization,,Date,,Approval
Approver #1,,,,,,,,,
Approver #2,,,,,,,,,
Approver #3,,,,,,,,,
Approver #4,,,,,,,,,
```

## Authorization IB/EDI 278/V26.1.1/EDIFECS_Product_MappingSpec_AuthorizationInbound_278_EDI_to_XML Conversion_V1.2.xlsx — Version History

```csv
Revision History,,,,
,,,,
,,,,
,,,,
,,,,
V#,Date,Author,Reviewer(s)/ Contributor(s),Comments
1,09-09-2024,Swedha/Deepthi,Rameshwar Singh,Initial version
1.1,01-10-2024,Ambily/Swedha,,Updated.
1.2,09-12-2024,Swedha,Ambily Raj,Updated the Latest XSD - added few mappings as per the tct - INTP-12287
```

## Authorization IB/EDI 278/V26.1.1/EDIFECS_Product_MappingSpec_AuthorizationInbound_278_EDI_to_XML Conversion_V1.2.xlsx — Auth Mapping

```csv
EDI LoopID.Segment,EDI Data Element Name,EDI Element Description,Usage,Enumeration Values,Sample values,ExternalCodeList,Mapped to XSD element,HRP Element Description,Transformation Logic,Comments
ISA (Interchange Control Header Segment),,,,,,,,,,
ISA,Segment: Interchange Control Header,,R,,,,,,,
ISA01,Authorization Information Qualifier,Code identifying the type of information in the Authorization Information,R,00 : No Authorization Information Present,,,,,,
ISA02,Authorization Information,Code identifying the type of information in the Authorization Information,R,Blank (10 spaces),,,,,,
ISA03,Security Information Qualifier,Code identifying the type of information in the Security Information,R,00 : No Security Information Present,,,,,,
ISA04,Security Information,"security information about the interchange sender
or the data in the interchange",R,Blank (10 spaces),,,,,,
ISA05,Interchange ID Qualifier,"Code indicating the system/method of code structure used to designate the
sender or receiver ID element being qualified",R,ZZ : Mutually Defined,,,,,,
ISA06,Interchange Sender ID,Identification code published by the sender for other parties to use as the receiver ID to route data to them; the sender always codes this value in the sender ID element,R,<Sender ID>,Example: 100SS,,/AuthorizationAdaptorRequest/payload/header/senderId,,,
ISA07,Interchange ID Qualifier,"Code indicating the system/method of code structure used to designate the
sender or receiver ID element being qualified",R,ZZ : Mutually Defined,,,,,,
ISA08,Interchange Receiver ID,Receiver Id,R,<Receiver ID>,,,,,,
ISA09,Interchange Date,Date of the interchange,R,SysDate (YYMMDD),,,,,,
ISA10,Interchange Time,Time of the interchange,R,SysTime (HHMM),,,,,,
ISA11,Repetition Separator,"the repetition separator is a delimiter and not a data
element; this field provides the delimiter used to separate repeated occurrences
of a simple data element or a composite data structure; this value must be
different than the data element separator, component element separator, and the
segment terminator",R,^,,,,,,
ISA12,Interchange Control Version Number,Code specifying the version number of the interchange control segments,R,00501,,,,,,
ISA13,Interchange Control Number,A control number assigned by the interchange sender,R,,,,,,,
ISA14,Acknowledgment Requested,Code indicating sender’s request for an interchange acknowledgment,R,"0 : No Interchange Acknowledgement Requested
1 : Interchange Acknowledgment Requested",,,,,,
ISA15,Interchange Usage Indicator,"Code indicating whether data enclosed by this interchange envelope is test,
production or information",R,P : Production Data T : Test,,,,,,
ISA16,Component Element Separator,The delimiter used to separate component data elements,R,": = Element separator
~ = Segment Terminator",,,,,,
GS (Functional Group Header),,,,,,,,,,
GS,Segment: Functional Group Header,,R,,,,,,,
GS01,Functional Identifier Code,The two-character identifier Code for the transaction set included.,R,HC : Authorization (278),,,,,,
GS02,Application Sender's Code,"Code identifying party sending transmission,  codes agreed to by trading partners
This is Submitter-specific.",R,<Sender ID>,Example : 100ZM,,,,,
GS03,Application Receiver's Code,Code identifying party receiving transmission; codes agreed to by trading partners,R,<HealthPlan ID>,,,,,,
GS04,Date,Date the Group Header is created.,R,SysDate (YYYYMMDD),20210701,,,,,
GS05,Time,Time the Group Header is created.,R,SysTime (HHMM),1213,,,,,
GS06,Group Control Number,Submitter-specific number.,R,<Group Control Number>,75041,,,,,
GS07,Responsible Agency Code,Code identifying the issuer of the EDI standard being used.,R,X : Accredited Standards Committee X12,,,,,,
GS08,Version / Release / Industry Identifier Code,"Code indicating the version, release, subrelease, and industry identifier of the EDI
standard being used,
ST03 and GS08 must be identical",R,005010X216,,,,,,
ST - Transaction Set Header Segment,,,,,,,,,,
ST01,Transaction Set Identifier Code,Code uniquely identifying a Transaction Set,R,278 - Health Care Services Review Information,,,,,,
ST02,Transaction Set Control Number,"Identifying control number that must be unique within the transaction set
functional group assigned by the originator for a transaction set",R,"<Transaction set Control Number>
Starts from 001 and increments with each transaction set",000000163,,,,,
ST03,Implementation Convention Reference,Reference assigned to identify Implementation Convention,R,005010X216,,,,,,
BHT - Beginning Of Hierarchical Transaction Segment,,,,,,,,,,
BHT01,Hierarchical Structure Code,"Code indicating the hierarchical application structure of a transaction set that
utilizes the HL segment to define the structure of the transaction set",R,"0007- IInformation Source, Information Receiver, Subscriber, Dependent, Event, Services",,,,,,
BHT02,Transaction Set Purpose Code,Code identifying purpose of transaction set,R,"14 - Advance Notification
22 - Information Copy
CN - Completion Notification",,,,,,
BHT03,Reference Identification,"Reference information as defined for a particular Transaction Set or as
specified by the Reference Identification Qualifier",R,<Originator Application Transaction Identifier>,"IP starts with Inpatient and OP starts with Outpatient.
Sample -IP0034313247, OP0037438359",,/AuthorizationAdaptorRequest/payload/serviceAuthorization/externalAuthBatchNumber,,,
,,,,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/externalAuthorizationId,If 2000E.HCR02 not present,If 2000E.HCR02 is not present,
BHT04,Date,"Date expressed as CCYYMMDD where CC represents the first two digits of
the calendar year",R,SysDate (YYYYMMDD) -,2024-06-12T17:05:00,,,,,
BHT05,Time,"Time expressed in 24-hour clock time as follows: HHMM, or HHMMSS, or
HHMMSSD, or HHMMSSDD, where H = hours (00-23), M = minutes (00-59), S = integer
seconds (00-59) and DD = decimal seconds; decimal seconds are expressed as follows: D
= tenths (0-9) and DD = hundredths (00-99)",R,SysTime (HHMMSS),103607,,,,,
BHT06,Transaction Type Code,Code specifying the type of transaction,S,NO - Notice,,,,,,
Loop 2000A (Required)Loop Repeat: 1,,,,,,,,,,
HL,Segment -  Information Source Level,,R,,,,,,,
2000A.HL01,Hierarchical ID Number,"A unique number assigned by the sender to identify a particular data segment
in a hierarchical structure",R,,,,,,,
2000A.HL03,Hierarchical Level Code,Code defining the characteristic of a level in a hierarchical structure,R,20 - Information Source,,,,,,
2000A.HL04,Hierarchical Child Code,"Code indicating if there are hierarchical child data segments subordinate to
the level being described",R,1 - Additional Subordinate HL Data Segment in This Hierarchical Structure,,,,,,
Loop 2010A (Required)Loop Repeat: 2,,,,,,,,,,
NM1 -Information Source Name (Required),,,,,,,,,,
2010A.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,"1P - Provider
2B - Third-Party Administrator
FA - Facility
PR - Payer
X3 - Utilization Management Organization",,,,,,
2010A.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,"1 : Person
2 : Non-person Entity",,,,,,
2010A.NM103,Name Last or Organization Name,Individual last name or organizational name,,<Submitter Last/Org Name>,,,,,,
,,,S,,,,,,,
,,,,,,,,,,
2010A.NM104,Name First,Individual first name,S,,,,,,,
2010A.NM105,Name Middle,Individual middle name or initial,S,,,,,,,
2010A.NM107,Name Suffix,Suffix to individual name,S,,,,,,,
2010A.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code (67)",R,"24 - Employer's Identification Number
34 - Social Security Number
46 - Electronic Transmitter Identification Number (ETIN)
PI - Payor Identification
XV - Centers for Medicare and Medicaid Services PlanID
XX - Centers for Medicare and Medicaid Services National Provider Identifier",,,,,,
2010A.NM109,Identification Code,Code identifying a party or other code,R,<Submitter ID>,1061059331,,,,,
,,,,,,,,,,
,,,,,,,,,,
Segment REF -Information Source Supplemental Identification (Situational),,,,,,,,,,
2010A.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"1G - Provider UPIN Number
1J - Facility ID Number
EI - Employer's Identification Number
G5 - Provider Site Number
N5 - Provider Plan Network Identification Number
N7 - Facility Network Identification Number
SY - Social Security Number
ZH - Carrier Assigned Reference Number",,,,,,
2010A.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as
specified by the Reference Identification Qualifier",,,,,,,,
Segment N3 - Information Source Address Supplemental Identification (Situational),,,,,,,,,,
2010A.N301,Address Information,Address information,R,,,,,,,
2010A.N302,Address Information,Address information,S,,,,,,,
"Segment N4 - Information Source City, State, ZIP Code Supplemental Identification (Situational)",,,,,,,,,,
2010A.N401,City Name,Free-form text for city name,R,,,,,,,
2010A.N402,State or Province Code,"Code (Standard State/Province) as defined by appropriate government
agency",S,,,,,,,
2010A.N403,Postal Code,"Code defining international postal zone code excluding punctuation and
blanks (zip code for United States)",S,,,,,,,
,,,,,,,,,,
2010A.N404,Country Code,Code identifying the country,S,,,,,,,
2010A.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,,
Segment PER - Information Source Contact Information (Situational),,,,,,,,,,
2010A.PER01,Contact Function Code,Code identifying the major duty or responsibility of the person or group named,R,IC - Information Contact,,,,,,
2010A.PER02,Name,Free-form name,S,,,,,,,
2010A.PER03,Communication Number Qualifier,Code identifying the type of communication number,S,"EM - Electronic Mail
FX - Facsimile
TE - Telephone
UR - Uniform Resource Locator (URL)",,,,,,
2010A.PER04,Communication Number,Complete communications number including country or area code when applicable,S,,,,,,,
2010A.PER05,Communication Number Qualifier,Code identifying the type of communication number,S,"EM - Electronic Mail
EX - Telephone Extension
FX - Facsimile
TE - Telephone
UR - Uniform Resource Locator (URL)",,,,,,
2010A.PER06,Communication Number,Complete communications number including country or area code when,S,,,,,,,
2010A.PER07,Communication Number Qualifier,Code identifying the type of communication number,S,"EM - Electronic Mail
EX - Telephone Extension
FX - Facsimile
TE - Telephone
UR - Uniform Resource Locator (URL)",,,,,,
2010A.PER08,Communication Number,Complete communications number including country or area code when applicable,S,,,,,,,
Segment PRV - Information Source Provider Information (Situational),,,,,,,,,,
2010A.PRV01,Provider Code,Code identifying the type of provider,R,"AD Admitting
AS Assistant Surgeon
AT - Attending
CO - Consulting
CV - Covering
OP - Operating
OR - Ordering
OT - Other Physician
PC - Primary Care Physician
PE - Performing
RF - Referring",,,,,,
2010A.PRV02,Reference Identification Qualifier,Code qualifying the Reference Identification,R,PXC - Health Care Provider Taxonomy Code,,,,,,
2010A.PRV03,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,
Loop 2000B — Information Receiver LEVEL  (Required)  Loop Repeat: >1,,,,,,,,,,
Segment HL -  Information Receiver Level (Required),,,R,,,,,,,
2000B.HL01,Hierarchical ID Number,"A unique number assigned by the sender to identify a particular data segment in
a hierarchical structure",R,"2000A.HL01 + 1
Incremented at each new HL segment.",,,,,,
2000B.HL02,Hierarchical Parent ID Number,"Identification number of the next higher hierarchical data segment that the data
segment being described is subordinate to",R,2000A.HL01,,,,,,
2000B.HL03,Hierarchical Level Code,Code defining the characteristic of a level in a hierarchical structure,R,21 Information Receiver,,,,,,
2000B.HL04,Hierarchical Child Code,"Code indicating if there are hierarchical child data segments subordinate to the
level being described.",R,1 Additional Subordinate HL Data Segment in This Hierarchical Structure.,,,,,,
Loop2010B — Information Receiver Name (Required) Loop Repeat: 1,,,S,,,,,,,
NM1,Segment - NM1 Information Receiver Name (Required),,R,,,,,,,
2010B.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,"1P Provider
2B Third-Party Administrator
FA Facility
PR Payer
X3 Utilization Management Organization",,,,,,
2010B.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,"1 Person
2 Non-Person Entity",,,,,,
2010B.NM103,Name Last or Organization Name,Individual last name or organizational name,S,,,,,,,
2010B.NM104,Name First,Individual first name,S,,,,,,,
2010B.NM105,Name Middle,Individual middle name or initial,S,,,,,,,
2010B.NM107,Name Suffix,Suffix to individual name,S,,,,,,,
2010B.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),S,"24 Employer's Identification Number
34 Social Security Number
46 Electronic Transmitter Identification Number (ETIN)
PI Payor Identification
XV Centers for Medicare and Medicaid Services PlanID
XX Centers for Medicare and Medicaid Services National Provider Identifier",,,,,,
2010B.NM109,Identification Code,Code identifying a party or other code,S,ExternalCodeList Name: 537 Description: Centers for Medicare and Medicaid Services National Provider Identifier ExternalCodeList Name: 540 Description: Centers for Medicare and Medicaid Services PlanI,,,,,,
Loop 2000C — Subscriber Level  (Required)  Loop Repeat: >1,,,,,,,,,,
HL,Segment - Subscriber Level (Required),,R,,,,,,,
2000C.HL01,Hierarchical ID Number,"A unique number assigned by the sender to identify a particular data segment in
a hierarchical structure",R,"2000A.HL01 + 1
Incremented at each new HL segment.",,,,,,
2000C.HL02,Hierarchical Parent ID Number,Identification number of the next higher hierarchical data segment that the data segment being described is subordinate to,R,2000A.HL01,,,,,,
2000C.HL03,Hierarchical Level Code,Code defining the characteristic of a level in a hierarchical structure,R,22 Subscriber,,,,,,
2000C.HL04,Hierarchical Child Code,Code indicating if there are hierarchical child data segments subordinate to the level being described.,R,1 Additional Subordinate HL Data Segment in This Hierarchical Structure.,,,,,,
Loop2010C — Subscriber Name (Required) Loop Repeat: 1,,,S,,,,,,,
NM1,Segment - NM1 Subscriber Name (Required),,R,,,,,,,
2010C.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,IL Insured or Subscriber,,,,,,
2010C.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,1 Person,,,,,,
2010C.NM103,Name Last or Organization Name,Individual last name or organizational name,,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/memberMatchInput/memberMatch/definitionName,,Populate as 'MemberMatchDefinition',
,,,,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/memberMatchInput/memberMatch/member/lastName,,Map when loop 2000D is not present,
,,,S,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/memberMatchInput/memberMatch/subscriber/lastName,,,
,,,,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/memberMatchInput/memberMatch/member/fullName,,"Map when loop 2000D is not present
Member full name. concatenate NM104/3 (First Last)
comma - should be used as seperator.",
,,,,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/memberMatchInput/memberMatch/subscriber/fullName,,"Subscriber's full name concatenate NM104/3 (First  Last )
comma - should be used as seperator.",
,,,,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/memberMatchInput/memberMatch/member/firstName,,Map when loop 2000D is not present,
2010C.NM104,Name First,Individual first name,S,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/memberMatchInput/memberMatch/subscriber/firstName,,,
2010C.NM105,Name Middle,Individual middle name or initial,S,,,,,,,
2010C.NM107,Name Suffix,Suffix to individual name,S,,,,,,,
2010C.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),S,"II Standard Unique Health Identifier for each Individual in the United States
MI Member Identification Number",,,,,,
2010C.NM109,Identification Code,Code identifying a party or other code,S,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/memberMatchInput/memberMatch/id,,,
REF,"Segment -REF Subscriber Supplemental
Identification",,S,,,,,,,
2010C.REF01,Reference Identification Qualifier,: Code qualifying the Reference Identification,,"1L Group or Policy Number
6P Group Number
EJ Patient Account Number
F6 Health Insurance Claim (HIC) Number
HJ Identity Card Number
IG Insurance Policy Number
N6 Plan Network Identification Number
NQ Medicaid Recipient Identification Number
SY Social Security Nu",,,,,,
2010C.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,,,,,,,,
N3,Segment - N3 Subscriber Address,,S,,,,,,,
2010C.N301,Address Information,Address Information,R,,,,,,,
,,,,,,,,,,
2010C.N302,Address Information,Address Information,S,,,,,,,
,,,,,,,,,,
N4,"Segment - N3 Subscriber City, State, ZIP Code",,S,,,,,,,
2010C.N401,City Name,Free-form text for city name,R,,,,,,,
,,,,,,,,,,
2010C.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,,,,,
,,,,,,,,,,
2010C.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
2010C.N404,Country Code,Code identifying the country,S,,,,,,,
,,,,,,,,,,
2010C.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,,
DMG,Segment - DMG Subscriber Demographic Information,,S,,,,,,,
2010C.DMG01,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,,,,,,
2010C.DMG02,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/memberMatchInput/memberMatch/subscriber/dateOfBirth,,In the format YYYY-MM-DD,
,,,,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/memberMatchInput/memberMatch/member/dateOfBirth,,"In the format YYYY-MM-DD
when loop 2000D is not present",
2010C.DMG03,Gender Code,Code indicating the sex of the individual,S,"F Female
M Male
U Unknow",,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/memberMatchInput/memberMatch/member/gender,,when loop 2000D is not present,
,,,,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/memberMatchInput/memberMatch/subscriber/gender,,,
INS,Segment - INS Subscriber Relationship,,S,,,,,,,
2010C.INS01,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,R,Y Yes,,,,,,
2010C.INS02,Individual Relationship Code,Code indicating the relationship between two individuals or entities,R,18 Self,,,,,,
2010C.INS08,Employment Status Code,Code showing the general employment status of an employee/claimant,R,"AO Active Military - Overseas
AU Active Military - USA
DI Deceased
PV Previous
RU Retired Military - USA",,,,,,
Loop 2000D — Dependent Level (Situational)  Loop Repeat: >1,,,,,,,,,,
HL,Segment -  (Required),,R,,,,,,,
2000D.HL01,Hierarchical ID Number,"A unique number assigned by the sender to identify a particular data segment in
a hierarchical structure",R,"2000A.HL01 + 1
Incremented at each new HL segment.",,,,,,
2000D.HL02,Hierarchical Parent ID Number,Identification number of the next higher hierarchical data segment that the data segment being described is subordinate to,R,2000A.HL01,,,,,,
2000D.HL03,Hierarchical Level Code,Code defining the characteristic of a level in a hierarchical structure,R,23 Dependent,,,,,,
2000D.HL04,Hierarchical Child Code,Code indicating if there are hierarchical child data segments subordinate to the level being described.,R,1 Additional Subordinate HL Data Segment in This Hierarchical Structure.,,,,,,
Loop 2010D — Dependent Name (Situational)  Loop Repeat: >1,,,,,,,,,,
NM1,Segment - NM1 Dependent Name (Required),,R,,,,,,,
2010D.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,QC Patient,,,,,,
2010D.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,1 Person,,,,,,
2010D.NM103,Name Last or Organization Name,Individual last name or organizational name,S,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/memberMatchInput/memberMatch/member/lastName,,,
,,,,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/memberMatchInput/memberMatch/member/fullName,,"Member full name. concatenate NM104/3 (First Last)
comma - should be used as seperator.",
2010D.NM104,Name First,Individual first name,S,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/memberMatchInput/memberMatch/member/firstName,,,
2010D.NM105,Name Middle,Individual middle name or initial,S,,,,,,,
2010D.NM107,Name Suffix,Suffix to individual name,S,,,,,,,
REF,Segment -REF Dependent Supplemental Identification,,S,,,,,,,
2010D.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"EJ Patient Account Number
SY Social Security",,,,,,
2010D.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,
N3,Segment - N3 Dependent Address,,S,,,,,,,
2010D.N301,Address Information,Address Information,R,,,,,,,
2010D.N302,Address Information,Address Information,S,,,,,,,
N3,"Segment - N4 Dependent City, State, ZIP Code",,S,,,,,,,
2010D.N401,City Name,Free-form text for city name,R,,,,,,,
2010D.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,,,,,
2010D.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,,,,,,
2010D.N404,Country Code,Code identifying the country,S,,,,,,,
2010D.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,,
DMG,Segment - DMG Dependent Demographic Information,,S,,,,,,,
2010D.DMG01,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,,,,,,
2010D.DMG02,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/memberMatchInput/memberMatch/member/dateOfBirth,,In the format YYYY-MM-DD,
2010D.DMG03,Gender Code,Code indicating the sex of the individual,S,"F Female
M Male
U Unknow",,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/memberMatchInput/memberMatch/member/gender,,,
INS,Segment - INS Dependent Relationship,,S,,,,,,,
2010D.INS01,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,R,N NO,,,,,,
2010D.INS02,Individual Relationship Code,Code indicating the relationship between two individuals or entities,R,"01 Spouse
19 Child
G8 Other Relationship",,,,,,
2010D.INS17,Number,A generic number,R,,,,,,,
Loop 2000E — Patient Event Level (Required)  Loop Repeat: 1,,,,,,,,,,
HL,Segment -  Patient Event Level(Required),,R,,,,,,,
2000E.HL01,Hierarchical ID Number,"A unique number assigned by the sender to identify a particular data segment in
a hierarchical structure",R,,,,,,,
2000E.HL02,Hierarchical Parent ID Number,Identification number of the next higher hierarchical data segment that the data segment being described is subordinate to,R,,,,,,,
2000E.HL03,Hierarchical Level Code,Code defining the characteristic of a level in a hierarchical structure,R,EV Event,,,,,,
2000E.HL04,Hierarchical Child Code,Code indicating if there are hierarchical child data segments subordinate to the level being described.,R,All valid standard codes are used(Total Codes: 2),,,,,,
TRN,Segment -  Patient Event Tracking Number,,S,,,,,,,
2000E.TRN01,Trace Type Code,Code identifying which transaction is being referenced,R,1 Current Transaction Trace Numbers,,,,,,
2000E.TRN02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/traceInfo/traceAdditionalId,,,
2000E.TRN03,Originating Company Identifier,"A unique identifier designating the company initiating the funds transfer instructions, business transaction or assigning tracking reference identification.",R,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/traceInfo/traceEntityId,,,
2000E.TRN04,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,S,,,,,,,
AAA,"Segment - Patient Event Request
Validation (Situational)",,S,,,,,,,
2000E.AAA01,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,R,"N No
Y Yes",,,,,,
2000E.AAA03,Reject Reason Code,Code assigned by issuer to identify reason for rejection,S,"15 Required application data missing
33 Input Errors
52 Service Dates Not Within Provider Plan Enrollment
56 Inappropriate Date
57 Invalid/Missing Date(s) of Service
60 Date of Birth Follows Date(s) of Service
61 Date of Death Precedes Date(s) of Service
62 Date of Service Not Within Allowable Inquiry Period
AF Invalid/Missing Diagnosis Code(s)
AH Invalid/Missing Onset of Current Condition or Illness Date
AI Invalid/Missing Accident Date
AJ Invalid/Missing Last Menstrual Period Date
AK Invalid/Missing Expected Date of Birth
AM Invalid/Missing Admission Date
AN Invalid/Missing Discharge Date
T5 Certification Information Missing",,,,,,
UM,Segment - Health Care Services Review Information,,R,,,,,,,
2000E.UM01,Request Category Code,Code indicating a type of request,R,"AR Admission Review
HS Health Services Review
SC Specialty Care Review",,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/authorizationTypeCode,,"Map If 2000F.UM01 is not present,
If AR/HS  , Map 3
If SC , Map 2",
2000E.UM02,Certification Type Code,Code indicating the type of certification,R,"1 Appeal - Immediate
2 Appeal - Standard
3 Cancel
4 Extension
5 Notification
I Initial
N Reconsideration
R Renewal
S Revise",,,"/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/reviewType/codeSetName  as ServiceAuthReviewType
/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/reviewType/codeEntry",,"Map If 2000F.UM02 is not present,
If I , map codeEntry as 1",
2000E.UM03,Service Type Code,Code identifying the classification of service,S,"1 Medical Care
2 Surgical
3 Consultation
4 Diagnostic X-Ray
5 Diagnostic Lab
6 Radiation Therapy
7 Anesthesia
8 Surgical Assistance
11 Used Durable Medical Equipment
12 Durable Medical Equipment Purchase
14 Renal Supplies in the Home
15 Alternate Method Dialysis
16 Chronic Renal Disease (CRD) Equipment
17 Pre-Admission Testing
18 Durable Medical Equipment Rental
20 Second Surgical Opinion
21 Third Surgical Opinion
23 Diagnostic Dental
24 Periodontics
25 Restorative
26 Endodontics
27 Maxillofacial Prosthetics
28 Adjunctive Dental Services
33 Chiropractic
35 Dental Care
36 Dental Crowns
37 Dental Accident
38 Orthodontics
39 Prosthodontics
40 Oral Surgery
42 Home Health Care
44 Home Health Visits
45 Hospice
46 Respite Care
54 Long Term Care
56 Medically Related Transportation
61 In-vitro Fertilization
62 MRI/CAT Scan
63 Donor Procedures
64 Acupuncture
65 Newborn Care
66 Pathology
67 Smoking Cessation
68 Well Baby Care
69 Maternity
70 Transplants
71 Audiology Exam
72 Inhalation Therapy
73 Diagnostic Medical
74 Private Duty Nursing
75 Prosthetic Device
76 Dialysis
77 Otological Exam
78 Chemotherapy
79 Allergy Testing
80 Immunizations
82 Family Planning
83 Infertility
84 Abortion
85 AIDS
86 Emergency Services
88 Pharmacy
93 Podiatry
A4 Psychiatric
A6 Psychotherapy
A9 Rehabilitation
AD Occupational Therapy
AE Physical Medicine
AF Speech Therapy
AG Skilled Nursing Care
AI Substance Abuse
AJ Alcoholism
AK Drug Addiction
AL Vision (Optometry)
AR Experimental Drug Therapy
B1 Burn Care
BB Partial Hospitalization (Psychiatric)
BC Day Care (Psychiatric)
BD Cognitive Therapy
BE Massage Therapy
BF Pulmonary Rehabilitation
BG Cardiac Rehabilitation
BL Cardiac
BN Gastrointestinal
BP Endocrine
BQ Neurology
BS Invasive Procedures
BY Physician Visit - Office: Sick
BZ Physician Visit - Office: Well
C1 Coronary Care
CQ Case Management
GY Allergy
IC Intensive Care
MH Mental Health
NI Neonatal Intensive Care
ON Oncology
PT Physical Therapy
PU Pulmonary
RN Renal
RT Residential Psychiatric Treatment
TC Transitional Care
TN Transitional Nursery Care",,,,,,
2000E.UM04,Health Care Service Location,To provide information that identifies the place of service or the type of bill related to the location at which a health care service was rendered,S,,,,,,,
2000E.UM04-01,Facility Code Value,"Code identifying where services were, or may be, performed; the first and second positions of the Uniform Bill Type Code for Institutional Services or the Place of Service Codes for Professional or Dental Services.",R,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/placeOfService,,If 2000E.UM04-02 is B,
,,,,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/serviceType/placeOfService,,If 2000E.UM04-02 is B  AND 2000F.UM04 is not present,
,,,,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/typeOfBill/referenceTypeInput/ID,,"If 2000E.UM04-02 is A, Suffix 2000E.UM04-01 with a zero",
,,,,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/requestedAdmitStatusCode,,refer conversional copy tab,
2000E.UM04-02,Facility Code Qualifier,Code identifying the type of facility referenced,R,"A Uniform Billing Claim Form Bill Type
B Place of Service Codes for Professional or Dental Services",,,,,,if 'B' it is professional & if it is 'A'- Institutional
2000E.UM06,Level of Service Code,Code specifying the level of service rendered,S,"E Elective
U Urgent
03 Emergency",,,,,,
HCR,Segment - Health Care Services Review,,S,,,,,,,
2000E.HCR01,Action Code,Code indicating type of action,R,"C Cancelled
A1 Certified in total
A2 Certified - partial
A3 Not Certified
A4 Pended
A6 Modified
CT Contact Payer
NA No Action Require",,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/authorizationStatus,,refer conversional copy tab,
,,,,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/serviceSetStatus,,"If 2000F.HCR  segment not present.
refer conversional copy tab",
2000E.HCR02,Reference Identification,"Reference information as defined for a particular Transaction Set or as
specified by the Reference Identification Qualifier",S,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/externalAuthorizationId,,,
2000E.HCR03,Industry Code,Code indicating a code from a specific industry code list,S,,,,,,,"Can be mapped to /AuthorizationAdaptorRequest/payload/serviceAuthorization/services/authorizedStatusReasonCode. But the HRP codeset (AuthorizationStatusReason) is not matching with EDI values,"
2000E.HCR04,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
Y Yes",,,,,,
REF,"Segment - Previous Review
Authorization Number",,S,,,,,,,
2000E.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,BB Authorization Number,,,,,,
2000E.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/authorizationMatchInput/authorizationId,,,"From Product Standpoint, This will  used to Amend an existing Auth. The Authid in HRP needs to be present here for amending an existing Auth.
Implemetaion teams needs to revisit this logic.
The tags in /authorizationMatchInput can be used to identify an existing auth."
REF,Segment - Administrative Reference Number,,S,,,,,,,
2000E.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,NT Administrator's Reference Number,,,,,,
2000E.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as
specified by the Reference Identification Qualifier",R,,,,,,,
DTP,Segment - Accident Date,,S,,,,,,,
2000E.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,439 Accident,,,,,,
2000E.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,,,,,,
2000E.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,,,
DTP,Segment - Last Menstrual Period Date,,S,,,,,,,
2000E.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,484 Last Menstrual Period,,,,,,
2000E.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,,,,,,
2000E.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,,,
DTP,Segment -Estimated Date of Birth,,S,,,,,,,
2000E.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,ABC Estimated Date of Birth,,,,,,
2000E.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,,,,,,
2000E.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,,,
DTP,Segment -Onset of Current Symptoms or Illness Date,,S,,,,,,,
2000E.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,431 Onset of Current Symptoms or I,,,,,,
2000E.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,,,,,,
2000E.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,,,
DTP,Segment - Event Date,,S,,,,,,,
2000E.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,AAH Event,,,,,,
2000E.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,"D8 Date Expressed in Format CCYYMMDD
RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD",,,,,,
2000E.DTP03,Date Time Period,,R,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/startServiceDate,,"If 2000F.DTP*472 is not present.
 If DTP02 = RD8, Map the first date in DTP03
If DTP02 = D8, Map DTP03",
,,"Expression of a date, a time, or range of dates, times or dates and times",,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/endServiceDate,,"If 2000F.DTP*472 is not present.
If DTP02 = RD8, Map the second date in DTP03
If DTP02 = D8, Map DTP03",
DTP,Segment - Admission Date,,S,,,,,,,
2000E.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,435 Admission,,,,,,
2000E.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,"D8 Date Expressed in Format CCYYMMDD
RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD",CCYYMMDD,,,,,
2000E.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/admissionInformation/expectedAdmissionDateRangeStart,,"If 2000E.DTP02 is RD8, Map the first date
Format:YYYY-MM-DDTHH:MM:SS",
,,,,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/admissionInformation/expectedAdmissionDateRangeEnd,,"If 2000E.DTP02 is RD8, Map the second date
Format:YYYY-MM-DDTHH:MM:SS",
,,,,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/admissionInformation/actualAdmissionDate,,"If 2000E.DTP02 is D8
Format:YYYY-MM-DDTHH:MM:SS",
DTP,Segment - Discharge Date,,S,,,,,,,
2000E.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,096 Discharge,,,,,,
2000E.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,,,,,,
2000E.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/admissionInformation/actualDischargeDate,,Format:YYYY-MM-DDTHH:MM:SS,
DTP,Segment - Certification Issue Date,,S,,,,,,,
2000E.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,102 Issue,,,,,,
2000E.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,,,,,,
2000E.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/hicApproval/authorizedDate,,"If 2000F.DTP*102 is not present
Format:YYYY-MM-DDTHH:MM:SS",
DTP,Segment - Certification Expiration Date,,S,,,,,,,
2000E.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,036 Expiration,,,,,,
2000E.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,,,,,,
2000E.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,,,
DTP,Segment - Certification Effective Date,,S,,,,,,,
2000E.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,007 Effectiv,,,,,,
2000E.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,"D8 Date Expressed in Format CCYYMMDD
RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD",,,,,,
2000E.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,,,
HI,Segment - PATIENT DIAGNOSIS,,S,,,,,,,
2000E.HI01,Health Care Code Information,"To send health care codes and their associated dates, amounts and quantities",R,,,,,,,
2000E.HI01-01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BF International Classification of Diseases Clinical Modification (ICD-9-CM) Diagnosis
BJ International Classification of Diseases Clinical Modification (ICD-9-CM) Admitting
Diagnosis
BK International Classification of Diseases Clinical Modification (ICD-9-CM) Principal
Diagnosis
DR Diagnosis Related Group (DRG)
PR International Classification of Diseases Clinical Modification (ICD-9-CM) Patient's
Reason for Visit
ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis
ABJ International Classification of Diseases Clinical Modification (ICD-10-CM) Admitting
Diagnosis
ABK International Classification of Diseases Clinical Modification (ICD-10-CM) Principal
Diagnosis
APR International Classification of Diseases Clinical Modification (ICD-10-CM) Patient's
Reason for Visit",,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/diagnosis/diagnosisType,,"If HI01-01 = BK/ABK, Map as PRINCIPAL
If HI01-01 = BJ/ABJ, Map as ADMITTING
If HI01-01 = BF/ABF, Map as DIAGNOSIS",
,,,,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/diagnosis/diagnosisCodeType,,"If HI01-01 = BF/BJ/BK/DR/PR, Map as ICD_9
If HI01-01 = ABF/ABJ/ABK/APR, Map as ICD_10",
2000E.HI01-02,Industry Code,Code indicating a code from a specific industry code list,R,,,"ExternalCodeList
Name: 131D
Description: International Classification of Diseases, 9th Revision, Clinical Modification
(ICD-9-CM) - Diagnosis Codes
ExternalCodeList
Name: 229
Description: Diagnosis Related Group Number (DRG)
ExternalCodeList
Name: 897
Description: International Classification of Diseases, 10th Revision, Clinical Modification",/AuthorizationAdaptorRequest/payload/serviceAuthorization/diagnosis/diagnosisCode,,add dot first three characters (XXX.X),
2000E.HI01-03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",S,,,,,,,
2000E.HI01-04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",S,,,,,,,
2000E.HI02,Health Care Code Information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,
2000E.HI02-01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BF International Classification of Diseases Clinical Modification (ICD-9-CM) Diagnosis
BJ International Classification of Diseases Clinical Modification (ICD-9-CM) Admitting
Diagnosis
DR Diagnosis Related Group (DRG)
PR International Classification of Diseases Clinical Modification (ICD-9-CM) Patient's
Reason for Visit
ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis
ABJ International Classification of Diseases Clinical Modification (ICD-10-CM) Admitting
Diagnosis
APR International Classification of Diseases Clinical Modification (ICD-10-CM) Patient's
Reason for Visit",,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/diagnosis/diagnosisType,,"If HI02-01 = BK/ABK, Map as PRINCIPAL
If HI02-01 = BJ/ABJ, Map as ADMITTING
If HI02-01 = BF/ABF, Map as DIAGNOSIS",
,,,,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/diagnosis/diagnosisCodeType,,"If HI02-01 = BF/BJ/BK/DR/PR, Map as ICD_9
If HI02-01 = ABF/ABJ/ABK/APR, Map as ICD_10",
2000E.HI02-02,Industry Code,Code indicating a code from a specific industry code list,R,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/diagnosis/diagnosisCode,,add dot first three characters (XXX.X),
2000E.HI02-03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",S,,,,,,,
2000E.HI02-04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",S,,,,,,,
2000E.HI03,Health Care Code Information,"To send health care codes and their associated dates, amounts and quantities",R,,,,,,,
2000E.HI03-01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BF International Classification of Diseases Clinical Modification (ICD-9-CM) Diagnosis
DR Diagnosis Related Group (DRG)
PR International Classification of Diseases Clinical Modification (ICD-9-CM) Patient's
Reason for Visit
ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis
APR International Classification of Diseases Clinical Modification (ICD-10-CM) Patient's
Reason for Visit",,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/diagnosis/diagnosisType,,"If HI03-01 = BK/ABK, Map as PRINCIPAL
If HI03-01 = BJ/ABJ, Map as ADMITTING
If HI03-01 = BF/ABF, Map as DIAGNOSIS",
,,,,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/diagnosis/diagnosisCodeType,,"If HI03-01 = BF/BJ/BK/DR/PR, Map as ICD_9
If HI03-01 = ABF/ABJ/ABK/APR, Map as ICD_10",
2000E.HI03-02,Industry Code,Code indicating a code from a specific industry code list,R,,,"ExternalCodeList
Name: 131D
Description: International Classification of Diseases, 9th Revision, Clinical Modification
(ICD-9-CM) - Diagnosis Codes
ExternalCodeList
Name: 229
Description: Diagnosis Related Group Number (DRG)
ExternalCodeList
Name: 897
Description: International Classification of Diseases, 10th Revision, Clinical Modification",/AuthorizationAdaptorRequest/payload/serviceAuthorization/diagnosis/diagnosisCode,,add dot first three characters (XXX.X),
2000E.HI03-03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",S,,,,,,,
2000E.HI03-04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",S,,,,,,,
2000E.HI04,Health Care Code Information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,
2000E.HI04-01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BF International Classification of Diseases Clinical Modification (ICD-9-CM) Diagnosis
DR Diagnosis Related Group (DRG)
PR International Classification of Diseases Clinical Modification (ICD-9-CM) Patient's
Reason for Visit
ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis
APR International Classification of Diseases Clinical Modification (ICD-10-CM) Patient's",,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/diagnosis/diagnosisType,,"If HI04-01 = BK/ABK, Map as PRINCIPAL
If HI04-01 = BJ/ABJ, Map as ADMITTING
If HI04-01 = BF/ABF, Map as DIAGNOSIS",
,,,,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/diagnosis/diagnosisCodeType,,"If HI04-01 = BF/BJ/BK/DR/PR, Map as ICD_9
If HI04-01 = ABF/ABJ/ABK/APR, Map as ICD_10",
2000E.HI04-02,Industry Code,Code indicating a code from a specific industry code list,R,,,"ExternalCodeList
Name: 131D
Description: International Classification of Diseases, 9th Revision, Clinical Modification
(ICD-9-CM) - Diagnosis Codes
ExternalCodeList
Name: 229
Description: Diagnosis Related Group Number (DRG)
ExternalCodeList
Name: 897
Description: International Classification of Diseases, 10th Revision, Clinical Modification",/AuthorizationAdaptorRequest/payload/serviceAuthorization/diagnosis/diagnosisCode,,add dot first three characters (XXX.X),
,,,,,,,,,,
2000E.HI04-03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format
All valid standard codes are used",S,,,,,,,
2000E.HI04-04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",S,,,,,,,
2000E.HI05,Health Care Code Information,"To send health care codes and their associated dates, amounts and
quantities",S,,,,,,,
2000E.HI05-01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BF International Classification of Diseases Clinical Modification (ICD-9-CM) Diagnosis
DR Diagnosis Related Group (DRG)
PR International Classification of Diseases Clinical Modification (ICD-9-CM) Patient's
Reason for Visit
ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis
APR International Classification of Diseases Clinical Modification (ICD-10-CM) Patient's
Reason for Visit",,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/diagnosis/diagnosisType,,"If HI05-01 = BK/ABK, Map as PRINCIPAL
If HI05-01 = BJ/ABJ, Map as ADMITTING
If HI05-01 = BF/ABF, Map as DIAGNOSIS",
,,,,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/diagnosis/diagnosisCodeType,,"If HI05-01 = BF/BJ/BK/DR/PR, Map as ICD_9
If HI05-01 = ABF/ABJ/ABK/APR, Map as ICD_10",
2000E.HI05-02,Industry Code,Code indicating a code from a specific industry code list,R,,,"ExternalCodeList
Name: 131D
Description: International Classification of Diseases, 9th Revision, Clinical Modification
(ICD-9-CM) - Diagnosis Codes
ExternalCodeList
Name: 229
Description: Diagnosis Related Group Number (DRG)
ExternalCodeList
Name: 897
Description: International Classification of Diseases, 10th Revision, Clinical Modification",/AuthorizationAdaptorRequest/payload/serviceAuthorization/diagnosis/diagnosisCode,,add dot first three characters (XXX.X),
,,,,,,,,,,
2000E.HI05-03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",S,,,,,,,
2000E.HI05-04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",S,,,,,,,
2000E.HI06,Health Care Code Information,"To send health care codes and their associated dates, amounts and
quantities",S,,,,,,,
2000E.HI06-01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BF International Classification of Diseases Clinical Modification (ICD-9-CM) Diagnosis
DR Diagnosis Related Group (DRG)
PR International Classification of Diseases Clinical Modification (ICD-9-CM) Patient's
Reason for Visit
ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis
APR International Classification of Diseases Clinical Modification (ICD-10-CM) Patient's
Reason for Visi",,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/diagnosis/diagnosisType,,"If HI06-01 = BK/ABK, Map as PRINCIPAL
If HI06-01 = BJ/ABJ, Map as ADMITTING
If HI06-01 = BF/ABF, Map as DIAGNOSIS",
,,,,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/diagnosis/diagnosisCodeType,,"If HI06-01 = BF/BJ/BK/DR/PR, Map as ICD_9
If HI06-01 = ABF/ABJ/ABK/APR, Map as ICD_10",
2000E.HI06-02,Industry Code,Code indicating a code from a specific industry code list,R,,,"ExternalCodeList
Name: 131D
Description: International Classification of Diseases, 9th Revision, Clinical Modification
(ICD-9-CM) - Diagnosis Codes
ExternalCodeList
Name: 229
Description: Diagnosis Related Group Number (DRG)
ExternalCodeList
Name: 897
Description: International Classification of Diseases, 10th Revision, Clinical Modification",/AuthorizationAdaptorRequest/payload/serviceAuthorization/diagnosis/diagnosisCode,,add dot first three characters (XXX.X),
2000E.HI06-03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",S,,,,,,,
2000E.HI06-04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",S,,,,,,,
2000E.HI07,Health Care Code Information,"To send health care codes and their associated dates, amounts and
quantities",S,,,,,,,
2000E.HI07-01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BF International Classification of Diseases Clinical Modification (ICD-9-CM) Diagnosis
DR Diagnosis Related Group (DRG)
PR International Classification of Diseases Clinical Modification (ICD-9-CM) Patient's
Reason for Visit
ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis
APR International Classification of Diseases Clinical Modification (ICD-10-CM) Patient's
Reason for Visit",,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/diagnosis/diagnosisType,,"If HI07-01 = BK/ABK, Map as PRINCIPAL
If HI07-01 = BJ/ABJ, Map as ADMITTING
If HI07-01 = BF/ABF, Map as DIAGNOSIS",
,,,,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/diagnosis/diagnosisCodeType,,"If HI07-01 = BF/BJ/BK/DR/PR, Map as ICD_9
If HI07-01 = ABF/ABJ/ABK/APR, Map as ICD_10",
2000E.HI07-02,Industry Code,Code indicating a code from a specific industry code list,R,,,"ExternalCodeList
Name: 131D
Description: International Classification of Diseases, 9th Revision, Clinical Modification
(ICD-9-CM) - Diagnosis Codes
ExternalCodeList
Name: 229
Description: Diagnosis Related Group Number (DRG)
ExternalCodeList
Name: 897
Description: International Classification of Diseases, 10th Revision, Clinical Modification",/AuthorizationAdaptorRequest/payload/serviceAuthorization/diagnosis/diagnosisCode,,add dot first three characters (XXX.X),
2000E.HI07-03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",S,,,,,,,
2000E.HI07-04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",S,,,,,,,
2000E.HI08,Health Care Code Information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,
2000E.HI08-01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BF International Classification of Diseases Clinical Modification (ICD-9-CM) Diagnosis
DR Diagnosis Related Group (DRG)
PR International Classification of Diseases Clinical Modification (ICD-9-CM) Patient's
Reason for Visit
ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis
APR International Classification of Diseases Clinical Modification (ICD-10-CM) Patient's
Reason for Visit",,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/diagnosis/diagnosisType,,"If HI08-01 = BK/ABK, Map as PRINCIPAL
If HI08-01 = BJ/ABJ, Map as ADMITTING
If HI08-01 = BF/ABF, Map as DIAGNOSIS",
,,,,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/diagnosis/diagnosisCodeType,,"If HI08-01 = BF/BJ/BK/DR/PR, Map as ICD_9
If HI08-01 = ABF/ABJ/ABK/APR, Map as ICD_10",
2000E.HI08-02,Industry Code,Code indicating a code from a specific industry code list,R,,,"ExternalCodeList
Name: 131D
Description: International Classification of Diseases, 9th Revision, Clinical Modification
(ICD-9-CM) - Diagnosis Codes
ExternalCodeList
Name: 229
Description: Diagnosis Related Group Number (DRG)
ExternalCodeList
Name: 897
Description: International Classification of Diseases, 10th Revision, Clinical Modification",/AuthorizationAdaptorRequest/payload/serviceAuthorization/diagnosis/diagnosisCode,,add dot first three characters (XXX.X),
2000E.HI08-03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",S,,,,,,,
2000E.HI08-04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",S,,,,,,,
2000E.HI09,Health Care Code Information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,
2000E.HI09-01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BF International Classification of Diseases Clinical Modification (ICD-9-CM) Diagnosis
DR Diagnosis Related Group (DRG)
PR International Classification of Diseases Clinical Modification (ICD-9-CM) Patient's Reason for Visit
ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis
APR International Classification of Diseases Clinical Modification (ICD-10-CM) Patient's
Reason for Visit",,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/diagnosis/diagnosisType,,"If HI09-01 = BK/ABK, Map as PRINCIPAL
If HI09-01 = BJ/ABJ, Map as ADMITTING
If HI09-01 = BF/ABF, Map as DIAGNOSIS",
,,,,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/diagnosis/diagnosisCodeType,,"If HI09-01 = BF/BJ/BK/DR/PR, Map as ICD_9
If HI09-01 = ABF/ABJ/ABK/APR, Map as ICD_10",
2000E.HI09-02,Industry Code,Code indicating a code from a specific industry code list,R,,,"ExternalCodeList
Name: 131D
Description: International Classification of Diseases, 9th Revision, Clinical Modification
(ICD-9-CM) - Diagnosis Codes
ExternalCodeList
Name: 229
Description: Diagnosis Related Group Number (DRG)
ExternalCodeList
Name: 897
Description: International Classification of Diseases, 10th Revision, Clinical Modification",/AuthorizationAdaptorRequest/payload/serviceAuthorization/diagnosis/diagnosisCode,,add dot first three characters (XXX.X),
2000E.HI09-03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",S,,,,,,,
2000E.HI09-04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",S,,,,,,,
2000E.HI10,Health Care Code Information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,
2000E.HI10-01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BF International Classification of Diseases Clinical Modification (ICD-9-CM) Diagnosis
DR Diagnosis Related Group (DRG)
PR International Classification of Diseases Clinical Modification (ICD-9-CM) Patient's Reason for Visit
ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis
APR International Classification of Diseases Clinical Modification (ICD-10-CM) Patient's
Reason for Visit",,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/diagnosis/diagnosisType,,"If HI010-01 = BK/ABK, Map as PRINCIPAL
If HI10-01 = BJ/ABJ, Map as ADMITTING
If HI10-01 = BF/ABF, Map as DIAGNOSIS",
,,,,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/diagnosis/diagnosisCodeType,,"If HI10-01 = BF/BJ/BK/DR/PR, Map as ICD_9
If HI10-01 = ABF/ABJ/ABK/APR, Map as ICD_10",
2000E.HI10-02,Industry Code,Code indicating a code from a specific industry code list,R,,,"ExternalCodeList
Name: 131D
Description: International Classification of Diseases, 9th Revision, Clinical Modification
(ICD-9-CM) - Diagnosis Codes
ExternalCodeList
Name: 229
Description: Diagnosis Related Group Number (DRG)
ExternalCodeList
Name: 897
Description: International Classification of Diseases, 10th Revision, Clinical Modification",/AuthorizationAdaptorRequest/payload/serviceAuthorization/diagnosis/diagnosisCode,,add dot first three characters (XXX.X),
2000E.HI10-03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",S,,,,,,,
2000E.HI10-04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",S,,,,,,,
2000E.HI11,Health Care Code Information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,
2000E.HI11-01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BF International Classification of Diseases Clinical Modification (ICD-9-CM) Diagnosis
DR Diagnosis Related Group (DRG)
PR International Classification of Diseases Clinical Modification (ICD-9-CM) Patient's Reason for Visit
ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis
APR International Classification of Diseases Clinical Modification (ICD-10-CM) Patient's
Reason for Visit",,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/diagnosis/diagnosisType,,"If HI11-01 = BK/ABK, Map as PRINCIPAL
If HI11-01 = BJ/ABJ, Map as ADMITTING
If HI11-01 = BF/ABF, Map as DIAGNOSIS",
,,,,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/diagnosis/diagnosisCodeType,,"If HI11-01 = BF/BJ/BK/DR/PR, Map as ICD_9
If HI11-01 = ABF/ABJ/ABK/APR, Map as ICD_10",
2000E.HI11-02,Industry Code,Code indicating a code from a specific industry code list,R,,,"ExternalCodeList
Name: 131D
Description: International Classification of Diseases, 9th Revision, Clinical Modification
(ICD-9-CM) - Diagnosis Codes
ExternalCodeList
Name: 229
Description: Diagnosis Related Group Number (DRG)
ExternalCodeList
Name: 897
Description: International Classification of Diseases, 10th Revision, Clinical Modification",/AuthorizationAdaptorRequest/payload/serviceAuthorization/diagnosis/diagnosisCode,,add dot first three characters (XXX.X),
2000E.HI11-03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",S,,,,,,,
2000E.HI11-04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",S,,,,,,,
2000E.HI12,Health Care Code Information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,
2000E.HI12-01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BF International Classification of Diseases Clinical Modification (ICD-9-CM) Diagnosis
DR Diagnosis Related Group (DRG)
PR International Classification of Diseases Clinical Modification (ICD-9-CM) Patient's Reason for Visit
ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis
APR International Classification of Diseases Clinical Modification (ICD-10-CM) Patient's
Reason for Visit",,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/diagnosis/diagnosisType,,"If HI12-01 = BK/ABK, Map as PRINCIPAL
If HI12-01 = BJ/ABJ, Map as ADMITTING
If HI12-01 = BF/ABF, Map as DIAGNOSIS",
,,,,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/diagnosis/diagnosisCodeType,,"If HI12-01 = BF/BJ/BK/DR/PR, Map as ICD_9
If HI12-01 = ABF/ABJ/ABK/APR, Map as ICD_10",
2000E.HI12-02,Industry Code,Code indicating a code from a specific industry code list,R,,,"ExternalCodeList
Name: 131D
Description: International Classification of Diseases, 9th Revision, Clinical Modification
(ICD-9-CM) - Diagnosis Codes
ExternalCodeList
Name: 229
Description: Diagnosis Related Group Number (DRG)
ExternalCodeList
Name: 897
Description: International Classification of Diseases, 10th Revision, Clinical Modification",/AuthorizationAdaptorRequest/payload/serviceAuthorization/diagnosis/diagnosisCode,,add dot first three characters (XXX.X),
2000E.HI12-03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",S,,,,,,,
2000E.HI12-04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",S,,,,,,,
HSD,Segment - Health Care Services Delivery,,S,,,,,,,
2000E.HSD01,Quantity Qualifier,Code specifying the type of quantity,S,"DY Days
FL Units
HS Hours
MN Month
VS Visit",,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/approvedUnits,,"If 2000F.HSD is not present.
If DY :Days
FL - Units",No Placeholder for Visits (referrals) in HRP
2000E.HSD02,Quantity,Numeric value of quantity,S,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/approvedQuantity,"If the value in HSD02=1 and the value in HSD01=VS (Visits), this means “one visit”.",If 2000F.HSD is not present.,
2000E.HSD03,Unit or Basis for Measurement Code,"Code specifying the units in which a value is being expressed, or manner in which a measurement has been taken",S,"DA Days
MO Months
WK Week",,,,,,
2000E.HSD04,Sample Selection Modulus,"To specify the sampling frequency in terms of a modulus of the Unit of Measure, e.g., every fifth bag, every 1.5 minutes",S,,,,,,,
2000E.HSD05,Time Period Qualifier,Code defining periods,S,"6 Hour
7 Day
21 Years
26 Episode
27 Visit
34 Month
35 Wee",,,,,,
2000E.HSD06,Number of Periods,Total number of periods,S,,,,,,,
2000E.HSD07,Ship/Delivery or Calendar Pattern Code,"Code which specifies the routine shipments, deliveries, or calendar pattern",S,"1 1st Week of the Month
2 2nd Week of the Month
3 3rd Week of the Month
4 4th Week of the Month
5 5th Week of the Month
6 1st & 3rd Weeks of the Month
7 2nd & 4th Weeks of the Month
8 1st Working Day of Period
9 Last Working Day of Period
A Monday through Friday
B Monday through Saturday
C Monday through Sunday
D Monday
E Tuesday
F Wednesday
G Thursday
H Friday
J Saturday
K Sunday
L Monday through Thursday
M Immediately
N As Directed
O Daily Mon. through Fri.
P 1/2 Mon. & 1/2 Thurs.
Q 1/2 Tues. & 1/2 Thurs.
R 1/2 Wed. & 1/2 Fri.
S Once Anytime Mon. through Fri.
T 1/2 Tue. & 1/2 Fri.
U 1/2 Mon. & 1/2 Wed.
V 1/3 Mon., 1/3 Wed., 1/3 Fri.
W Whenever Necessary
X 1/2 By Wed., Bal. By Fri.
Y None (Also Used to Cancel or Override a Previous Pattern)
SA Sunday, Monday, Thursday, Friday, Saturday
SB Tuesday through Saturday
SC Sunday, Wednesday, Thursday, Friday, Saturday
SD Monday, Wednesday, Thursday, Friday, Saturday
SG Tuesday through Friday
SL Monday, Tuesday and Thursday
SP Monday, Tuesday and Friday
SX Wednesday and Thursday
SY Monday, Wednesday and Thursday
SZ Tuesday, Thursday and Friday
WE Weekend",,,,,,
2000E.HSD08,Ship/Delivery Pattern Time Code,Code which specifies the time for routine shipments or deliveries,S,"A 1st Shift (Normal Working Hours)
B 2nd Shift
C 3rd Shift
D A.M.
E P.M.
F As Directed
G Any Shift
Y None (Also Used to Cancel or Override a Previous Pattern)",,,,,,
CL1,Segment - Institutional Claim Code,,S,,,,,,,
2000E.CL101,Admission Type Code,Code indicating the priority of this admission,S,,,"ExternalCodeList
Name: 231
Description: Admission Type Code",/AuthorizationAdaptorRequest/payload/serviceAuthorization/admissionInformation/admissionType,Admission type.,,
2000E.CL102,Admission Source Code,Code indicating the source of this admission,S,,,"ExternalCodeList
Name: 230
Description: Admission Source Code",/AuthorizationAdaptorRequest/payload/serviceAuthorization/admissionInformation/admissionSource,Admission source code.,,
2000E.CL103,Patient Status Code,"Code indicating patient status as of the ""statement covers through date""",S,,,"ExternalCodeList
Name: 239
Description: Patient Status Code",/AuthorizationAdaptorRequest/payload/serviceAuthorization/admissionInformation/dischargeStatus/id,Discharge status code.,,
CR1,Segment - Ambulance Transport Information,,S,,,,,,,
2000E.CR103,Ambulance Transport Code,Code indicating the type of ambulance transport,R,,,,,,,
2000E.CR105,Unit or Basis for Measurement Code,"Code specifying the units in which a value is being expressed, or manner in
which a measurement has been taken",S,"DH Miles
DK Kilometers",,,,,,
2000E.CR106,"Quantity
(distance traveled during transport.)",Numeric value of quantity,S,,,,,,,
CR2,Segment - Spinal Manipulation Service Information,,S,,,,,,,
2000E.CR201,Count,Occurrence counter,S,,,,,,,
2000E.CR202,Quantity,Numeric value of quantity,S,,,,,,,
2000E.CR203,Subluxation Level Code,Code identifying the specific level of subluxation,S,,,,,,,
2000E.CR204,Subluxation Level Code,Code identifying the specific level of subluxation,S,,,,,,,
CR5,Segment - Home Oxygen Therapy Information,,S,,,,,,,
2000E.CR503,Oxygen Equipment Type Code,Code indicating the specific type of equipment being prescribed for the delivery of oxygen,R,,,,,,,
2000E.CR504,Oxygen Equipment Type Code,"Code indicating the specific type of equipment being prescribed for the
delivery of oxygen",S,,,,,,,
2000E.CR506,Quantity,Numeric value of quantity,R,,,,,,,
2000E.CR507,Quantity,Numeric value of quantity,S,,,,,,,
2000E.CR508,Quantity,Numeric value of quantity,S,,,,,,,
2000E.CR509,Description,A free-form description to clarify the related data elements and their content,S,,,,,,,
2000E.CR516,Quantity,Numeric value of quantity,S,,,,,,,
2000E.CR517,Oxygen Delivery System Code,Code to indicate if a particular form of delivery was prescribed,R,,,,,,,
2000E.CR518,Oxygen Equipment Type Code,": Code indicating the specific type of equipment being prescribed for the
delivery of oxygen",S,,,,,,,
CR6,"Segment -Home Health Care
Information",,S,,,,,,,
2000E.CR601,Prognosis Code,Code indicating physician's prognosis for the patient,R,,,,,,,
2000E.CR602,Date,"Date expressed as CCYYMMDD where CC represents the first two digits of
the calendar year",S,,,,,,,
2000E.CR603,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time forma",S,RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD,,,,,,
2000E.CR604,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",S,,,,,,,
2000E.CR607,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,R,W Not Applicable,,,,,,
2000E.CR608,Certification Type Code,Code indicating the type of certification,R,"1 Appeal - Immediate
2 Appeal - Standard
3 Cancel
4 Extension
5 Notification
6 Verification
I Initial
R Renewal
S Revise",,,,,,
PWK,Segment - Additional Patient Information,,S,,,,,,,
2000E.PWK01,Report Type Code,,R,"03 Report Justifying Treatment Beyond Utilization Guidelines
04 Drugs Administered
05 Treatment Diagnosis
06 Initial Assessment
07 Functional Goals
08 Plan of Treatment
09 Progress Report
10 Continued Treatment
11 Chemical Analysis
13 Certified Test Report
15 Justification for Admission
21 Recovery Plan
48 Social Security Benefit Letter
55 Rental Agreement
59 Benefit Letter
77 Support Data for Verification
A3 Allergies/Sensitivities Document
A4 Autopsy Report
AM Ambulance Certification
AS Admission Summary
AT Purchase Order Attachment
B2 Prescription
B3 Physician Order
BR Benchmark Testing Results
BS Baseline
BT Blanket Test Results
CB Chiropractic Justification
CK Consent Form(s)
D2 Drug Profile Document
DA Dental Models
DB Durable Medical Equipment Prescription
DG Diagnostic Report
DJ Discharge Monitoring Report
DS Discharge Summary
FM Family Medical History Document
HC Health Certificate
HP History and Physical
HR Health Clinic Records
I5 Immunization Record
IR State School Immunization Records
LA Laboratory Results
M1 Medical Record Attachment
NN Nursing Notes
OB Operative Note
OC Oxygen Content Averaging Report
OD Orders and Treatments Document
OE Objective Physical Examination (including vital signs) Document
OX Oxygen Therapy Certification
P4 Pathology Report
P5 Patient Medical History Document
P6 Periodontal Charts
P7 Periodontal Reports
PE Parenteral or Enteral Certification
PN Physical Therapy Notes
PO Prosthetics or Orthotic Certification
PQ Paramedical Results
PY Physician's Report
PZ Physical Therapy Certification
QC Cause and Corrective Action Report
QR Quality Report
RB Radiology Films
RR Radiology Reports
RT Report of Tests and Analysis Report
RX Renewable Oxygen Content Averaging Report
SG Symptoms Document
T7 Therapy Notes
V5 Death Notification
XP Photograph",,,,,,
2000E.PWK02,Report Transmission Code,"Code defining timing, transmission method or format by which reports are to
be sent",R,"BM By Mail
EL Electronically Only
EM E-Mail
FX By Fax
VO Voice",,,,,,
2000E.PWK05,Identification Code Qualifier,": Code designating the system/method of code structure used for Identification
Code (67)",S,AC Attachment Control Number,,,,,,
2000E.PWK06,Identification Code,Code identifying a party or other code,S,,,,,,,
2000E.PWK07,Description,A free-form description to clarify the related data elements and their conten,S,,,,,,,
,,,,,,,,,,
MSG,Segment - Message Text,,S,,,,,,,
2000E.MSG01,Free-form Message Text,Free-form Message Text,R,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/note,,MAP 2000E.MSG IF 2000F IS NOT PRESENT,
Loop 2010EA — Patient Event  Provider Name (Required)  Loop Repeat: 12,,,,,,,,,,
2010EA.NM1,"Segment - Patient Event Provider
Name",,S,,,,Map /renderingProvider only if 2010F loop is not present.,,,
2010EA.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,"71 Attending Physician
72 Operating Physician
73 Other Physician
77 Service Location
DD Assistant Surgeon
DK Ordering Physician
DN Referring Provider
FA Facility
G3 Clinic
P3 Primary Care Provider
QB Purchase Service Provider
QV Group Practice
SJ Service Provider
AAJ Admitting Services",,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/renderingProvider/providerType,,"If NM101 Not DK/DN
refer conversion copy tab",
,,,,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/requestingProvider/providerType,,"If NM101 = DK/DN
refer conversion copy tab","If NM101 = DK/DN, and NM102 is 2 then ignore the conversion copy  and populate it as 'supplier'
If NM101 = DK/DN, & NM102 is 1 then populate it as practitioner as per the conversional copy."
2010EA.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,"1 Person
2 Non-Person Entity",,,,,,
2010EA.NM103,Name Last or Organization Name,Individual last name or organizational name,S,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/requestingProvider/organizationName,,"If NM102 = 2,
If NM101 = DK/DN",
,,,,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/renderingProvider/organizationName,,"If NM102 = 2,
If NM101 Not DK/DN",
,,,,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/renderingProvider/individualName/lastName,,"If NM102 = 1,
If NM101 Not DK/DN",
,,,,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/requestingProvider/individualName/lastName,,"If NM102 = 1
If NM101 = DK/DN",
2010EA.NM104,Name First,Individual first name,S,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/renderingProvider/individualName/firstName,,"If NM102 = 1,
If NM101 Not DK/DN",
,,,,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/requestingProvider/individualName/firstName,,"If NM102 = 1
If NM101 = DK/DN",
2010EA.NM105,Name Middle,Individual middle name or initial,S,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/renderingProvider/individualName/middleName,,"If NM102 = 1,
If NM101 Not DK/DN",
,,,,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/requestingProvider/individualName/middleName,,"If NM102 = 1
If NM101 = DK/DN",
2010EA.NM106,Name Prefix,Prefix to individual name,S,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/renderingProvider/individualName/namePrefix,,"If NM102 = 1,
If NM101 Not DK/DN",
,,,,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/requestingProvider/individualName/namePrefix,,"If NM102 = 1
If NM101 = DK/DN",
2010EA.NM107,Name Suffix,Suffix to individual name,S,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/renderingProvider/individualName/nameSuffix,,"If NM102 = 1,
If NM101 Not DK/DN",
,,,,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/requestingProvider/individualName/nameSuffix,,"If NM102 = 1
If NM101 = DK/DN",
2010EA.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code (67)",S,"24 Employer's Identification Number
34 Social Security Number
46 Electronic Transmitter Identification Number (ETIN)
XX Centers for Medicare and Medicaid Services National Provider Identifier",,,,,,
2010EA.NM109,Identification Code,Code identifying a party or other code,S,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/renderingProvider/providerNPIId,,"If NM108=XX
If NM101 Not DK/DN",
,,,,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/requestingProvider/providerNPIId,,"If NM108=XX
If NM101 = DK/DN",
,,,,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/renderingProvider/providerTINId,,"If NM108=46
If NM101 Not DK/DN",
,,,,,,"ExternalCodeList
Name: 537
Description: Centers for Medicare and Medicaid Services National Provider Identifier",/AuthorizationAdaptorRequest/payload/serviceAuthorization/requestingProvider/providerTINId,,"If NM108=46
If NM101 = DK/DN",
REF,Segment -,,S,,,,,,,
2010EA.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B State License Number
1G Provider UPIN Number
1J Facility ID Number
EI Employer's Identification Number
N5 Provider Plan Network Identification Number
N7 Facility Network Identification Number
SY Social Security Number
ZH Carrier Assigned Reference Numbe",,,,,,
2010EA.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as
specified by the Reference Identification Qualifier",R,,,,,,,
,,,,,,,,,,
2010EA.REF03,Description,A free-form description to clarify the related data elements and their content,S,,,,,,,
N3,Segment - Patient Event Provider ddress,,S,,,,,,,
2010EA.N301,Address Information,Address Information,R,,,,,,,
2010EA.N302,Address Information,Address Information,S,,,,,,,
N4,"Segment - Patient Event Provider City, State, ZIP Code",,S,,,,,,,
2010EA.N401,City Name,: Free-form text for city name,,,,,,,,
2010EA.N402,State or Province Code,"Code (Standard State/Province) as defined by appropriate government
agency",S,,,,,,,
2010EA.N403,Postal Code,"Code defining international postal zone code excluding punctuation and
blanks (zip code for United States)",,,,,,,,
,,,,,,,,,,
2010EA.N404,Country Code,Code identifying the country,S,,,,,,,
2010EA.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,,
PER,Segment - Patient Event Provider Contact Information,,S,,,,,,,
2010EA.PER01,Contact Function Code,Code identifying the major duty or responsibility of the person or group named,R,IC Information Cont,,,,,,
2010EA.PER02,Name,Free-form name,S,,,,,,,
2010EA.PER03,Communication Number Qualifier,Code identifying the type of communication number,S,"EM Electronic Mail
FX Facsimile
TE Telephone
UR Uniform Resource Locator (URL)",,,,,,
2010EA.PER04,Communication Number,"Complete communications number including country or area code when
applicable",,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
2010EA.PER05,Communication Number Qualifier,Code identifying the type of communication number,S,"EM Electronic Mail
EX Telephone Extension
FX Facsimile
TE Telephone
UR Uniform Resource Locator (URL",,,,,,
2010EA.PER06,Communication Number,"Complete communications number including country or area code when
applicable",S,,,,,,,
2010EA.PER07,Communication Number Qualifier,Code identifying the type of communication number,S,"EM Electronic Mail
EX Telephone Extension
FX Facsimile
TE Telephone
UR Uniform Resource Locator (URL)",,,,,,
2010EA.PER08,Communication Number,"Complete communications number including country or area code when
applicable",S,,,,,,,
AAA,Segment - Patient Event Provider Request Validation,,S,,,,,,,
2010EA.AAA01,Yes/No Condition or Response Code,: Code indicating a Yes or No condition or response,R,"N No
Y Yes",,,,,,
2010EA.AAA03,Reject Reason Code,Code assigned by issuer to identify reason for rejection,R,"15 Required application data missing
33 Input Errors
35 Out of Network
41 Authorization/Access Restrictions
43 Invalid/Missing Provider Identification
44 Invalid/Missing Provider Name
45 Invalid/Missing Provider Specialty
46 Invalid/Missing Provider Phone Number
47 Invalid/Missing Provider State
49 Provider is Not Primary Care Physician
51 Provider Not on File
52 Service Dates Not Within Provider Plan Enrollment
79 Invalid Participant Identification
97 Invalid or Missing Provider Address
IP Inappropriate Provider Role",,,,,,
,,,,,,,,,,
,,,,,,,,,,
PRV,Segment - Patient Event Provider Information,,S,,,,,,,
2010EA.PRV01,Provider Code,Code identifying the type of provider,R,"AD Admitting
AS Assistant Surgeon
AT Attending
OP Operating
OR Ordering
OT Other Physician
PC Primary Care Physician
PE Performing
RF Referring",,,,,,
2010EA.PRV02,Reference Identification Qualifier,Code qualifying the Reference Identification,R,PXC Health Care Provider Taxonomy Co,,,,,,
2010EA.PRV03,Reference Identification,"Reference information as defined for a particular Transaction Set or as
specified by the Reference Identification Qualifier",R,,,"ExternalCodeList
Name: 682
Description: Health Care Provider Taxonomy",/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/renderingProvider  /providerTaxonomyCode,,If PRV01 not  OR/RF,
,,,,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/requestingProvider/providerTaxonomyCode,,If PRV01 = OR/RF,
Loop 2010EB —Additional Patient Information Contact Name (Required)  Loop Repeat: 1,,,,,,,,,,
NM1,"Segment - Additional Patient
Information Contact Name",,S,,,,,,,
2010EB.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,L5 Contact,,,,,,
2010EB.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,"1 Person
2 Non-Person Entity",,,,,,
2010EB.NM103,Name Last or Organization Name,Individual last name or organizational name,S,,,,,,,
2010EB.NM104,Name First,Individual first name,S,,,,,,,
2010EB.NM105,Name Middle,Individual middle name or initial,S,,,,,,,
2010EB.NM106,Name Prefix,Prefix to individual name,S,,,,,,,
2010EB.NM107,Name Suffix,Suffix to individual name,S,,,,,,,
2010EB.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code (67)",S,"24 Employer's Identification Number
34 Social Security Number
46 Electronic Transmitter Identification Number (ETIN)
PI Payor Identification
XV Centers for Medicare and Medicaid Services PlanID
XX Centers for Medicare and Medicaid Services National Provider Identifier",,,,,,
2010EB.NM109,Identification Code,Code identifying a party or other code,S,,,,,,,
N3,Segment - Additional Patient Information Contact Address,,S,,,,,,,
2010EB.N301,Address Information,Address Information,R,,,,,,,
2010EB.N302,Address Information,Address Information,S,,,,,,,
N4,"Segment - Additional Patient Information City, State, ZIP Code",,S,,,,,,,
2010EB.N401,City Name,Free-form text for city name,R,,,,,,,
2010EB.N402,State or Province Code,"Code (Standard State/Province) as defined by appropriate government
agency",S,,,"ExternalCodeList
Name: 22
Description: States and Provinces",,,,
2010EB.N403,Postal Code,"Code defining international postal zone code excluding punctuation and
blanks (zip code for United States)",S,,,"ExternalCodeList
Name: 51
Description: ZIP Code
ExternalCodeList
Name: 932
Description: Universal Postal Codes",,,,
2010EB.N404,Country Code,Code identifying the country,S,,,"ExternalCodeList
Name: 5
Description: Countries, Currencies and Funds",,,,
2010EB.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,"ExternalCodeList
Name: 5
Description: Countries, Currencies and Funds",,,,
PER,Segment - Additional Patient Information Contact Information,,S,,,,,,,
2010EB.PER01,Contact Function Code,Code identifying the major duty or responsibility of the person or group named,R,IC Information Cont,,,,,,
2010EB.PER02,Name,Free-form name,S,,,,,,,
2010EB.PER03,Communication Number Qualifier,Code identifying the type of communication number,S,"EM Electronic Mail
FX Facsimile
TE Telephone
UR Uniform Resource Locator (URL)",,,,,,
2010EB.PER04,Communication Number,"Complete communications number including country or area code when
applicable",S,,,,,,,
2010EB.PER05,Communication Number Qualifier,Code identifying the type of communication number,S,"EM Electronic Mail
EX Telephone Extension
FX Facsimile
TE Telephone",,,,,,
2010EB.PER06,Communication Number,"Complete communications number including country or area code when
applicable",S,,,,,,,
2010EB.PER07,Communication Number Qualifier,Code identifying the type of communication number,S,"EM Electronic Mail
EX Telephone Extension
FX Facsimile
TE Telephone",,,,,,
2010EB.PER08,Communication Number,"Complete communications number including country or area code when
applicable",S,,,,,,,
Loop 2010EC —Loop Patient Event Transport Information (Situational),,,,,,,,,,
NM1,Segment - Additional Patient Information Contact Name,,S,,,,,,,
2010EC.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,"45 Drop-off Location
FS Final Scheduled Destination
ND Next Destination
PW Pickup Address
R3 Next Scheduled Destination",,,,,,
2010EC.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,2 Non-Person Entity,,,,,,
2010EC.NM103,Name Last or Organization Name,Individual last name or organizational name,S,,,,,,,
N3,Segment -Patient Event Transport Location Address (Required),,R,,,,,,,
2010EC.N301,Address Information,Address Information,R,,,,,,,
2010EC.N302,Address Information,Address Information,S,,,,,,,
N4,Segment - Patient Event Transport Location City/State/ZIP Code,,R,,,,,,,
2010EC.N401,City Name,Free-form text for city name,S,,,,,,,
2010EC.N402,State or Province Code,"Code (Standard State/Province) as defined by appropriate government
agency",S,,,"ExternalCodeList
Name: 22
Description: States and Provinces",,,,
2010EC.N403,Postal Code,"Code defining international postal zone code excluding punctuation and
blanks (zip code for United States)",S,,,"ExternalCodeList
Name: 51
Description: ZIP Code
ExternalCodeList
Name: 932
Description: Universal Postal Codes",,,,
2010EC.N404,Country Code,Code identifying the country,S,,,"ExternalCodeList
Name: 5
Description: Countries, Currencies and Funds",,,,
2010EC.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,"ExternalCodeList
Name: 5
Description: Countries, Currencies and Funds",,,,
AAA,Segment - Patient Event Transport Information Request Validation,,S,,,,,,,
2010EC.AAA01,Yes/No Condition or Response Code,: Code indicating a Yes or No condition or response,R,"N No
Y Yes",,,,,,
2010EC.AAA03,Reject Reason Code,Code assigned by issuer to identify reason for rejection,S,"15 - Required application data missing
33 - Input Errors
47 - Invalid/Missing Provider State
97 - Invalid or Missing Provider Address",,,,,,
2010EC.AAA04,Follow-up Action Code,Code identifying follow-up actions allowed,R,"C - Please Correct and Resubmit
N - Resubmission Not Allowed",,,,,,
Loop 2010ED —Loop Patient Event Other UMO Name (Situational),,,,,,,,,,
NM1,Segment - Patient Event Other UMO Name,,S,,,,,,,
2010ED.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,"00 - Alternate Insurer
CA - Carrier
GG - Intermediary",,,,,,
2010ED.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,2 Non-Person Entity,,,,,,
2010ED.NM103,Name Last or Organization Name,Individual last name or organizational name,S,,,,,,,
Segment REF - Other UMO Denial Reason (Situational),,,,,,,,,,
2010ED.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,ZZ - Mutually Defined,,,,,,
2010ED.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,"ExternalCodeList
Name: 886
Description: Health Care Service Review Decision Reason Code",,,,
2010ED.REF04,Reference Identifier,To identify one or more reference numbers or identification numbers as specified by the Reference Qualifier,S,,,,,,,
2010ED.REF04-01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,ZZ - Mutually Defined,,,,,,
2010ED.REF04-02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,"ExternalCodeList
Name: 886
Description: Health Care Service Review Decision Reason Code",,,,
2010ED.REF04-03,Reference Identification Qualifier,Code qualifying the Reference Identification,S,ZZ - Mutually Defined,,,,,,
2010ED.REF04-04,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,S,,,"ExternalCodeList
Name: 886
Description: Health Care Service Review Decision Reason Code",,,,
2010ED.REF04-05,Reference Identification Qualifier,Code qualifying the Reference Identification,S,ZZ - Mutually Defined,,,,,,
2010ED.REF04-06,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,S,,,"ExternalCodeList
Name: 886
Description: Health Care Service Review Decision Reason Code",,,,
Segment DTP - Other UMO Denial Date (Situational),,,,,,,,,,
2010ED.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,598 - Rejected,,,,,,
2010ED.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,,,,,,
2010ED.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,,,
Loop 2000F (Required)Loop Repeat: 1,,,,,,,,,,
Segment HL- Information Source Level (Situational),,,,,,,,,,
2000F.HL01,Hierarchical ID Number,"A unique number assigned by the sender to identify a particular data segment
in a hierarchical structure",R,,,,,,,
2000F.HL02,Hierarchical Parent ID Number,Identification number of the next higher hierarchical data segment that the data segment being described is subordinate to,R,,,,,,,
2000F.HL03,Hierarchical Level Code,Code defining the characteristic of a level in a hierarchical structure,R,SS - Services,Hardcoded as 'SS',,,,,
2000F.HL04,Hierarchical Child Code,Code indicating if there are hierarchical child data segments subordinate to the level being described,R,0 - No Subordinate HL Segment in This Hierarchical Structure.,Hardcoded as '0',,,,,
Segment TRN - Service Trace Number (Situational),,,,,,,,,,
2000F.TRN01,Trace Type Code,Code identifying which transaction is being referenced,R,"1 - Current Transaction Trace Numbers
2 - Referenced Transaction Trace Numbers",,,,,,
2000F.TRN02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,
2000F.TRN03,Originating Company Identifier,"A unique identifier designating the company initiating the funds transfer instructions, business transaction or assigning tracking reference identification",R,,,,,,,
2000F.TRN04,Reference Identification,"Reference information as defined for a particular Transaction Set or as
specified by the Reference Identification Qualifier",S,,,,,,,
Segment AAA - Service Request Validation (Situational),,,,,,,,,,
2000F.AAA01,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,R,"N - No
Y - Yes",,,,,,
2000F.AAA03,Reject Reason Code,Code assigned by issuer to identify reason for rejection,S,"15 - Required application data missing
33 - Input Errors
52 - Service Dates Not Within Provider Plan Enrollment
57 - Invalid/Missing Date(s) of Service
60 - Date of Birth Follows Date(s) of Service
61 - Date of Death Precedes Date(s) of Service
62 - Date of Service Not Within Allowable Inquiry Period
AG - Invalid/Missing Procedure Code(s)
T5 - Certification Information Missing",,,,,,
Segment UM - Health Care Services Review Information (Situational),,,,,,,,,,
2000F.UM01,Request Category Code,Code indicating a type of request,R,"HS - Health Services Review
SC - Specialty Care Review",,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/authorizationTypeCode,,"If HS  , Map 3
If SC , Map 2",
2000F.UM02,Certification Type Code,Code indicating the type of certification,S,"1 - Appeal - Immediate
2 - Appeal - Standard
3 - Cancel
4 - Extension
5 - Notification
I - Initial
R - Renewal
S - Revised",,,"/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/reviewType/codeSetName  as ServiceAuthReviewType
/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/reviewType/codeEntry",,"If I , map codeEntry as 1",
2000F.UM03,Service Type Code,Code identifying the classification of service,S,"1 - Medical Care
2 - Surgical
3 - Consultation
4  - Diagnostic X-Ray
5 - Diagnostic Lab
6 - Radiation Therapy
7 - Anesthesia
8 - Surgical Assistance
11 - Used Durable Medical Equipment
12 - Durable Medical Equipment Purchase
14 - Renal Supplies in the Home
15 - Alternate Method Dialysis
16 - Chronic Renal Disease (CRD) Equipment
17 Pre-Admission Testing
18 Durable Medical Equipment Rental
20 Second Surgical Opinion
21 Third Surgical Opinion
23 Diagnostic Dental
24 Periodontics
25 Restorative
26 Endodontics
27 Maxillofacial Prosthetics
28 Adjunctive Dental Services
33 Chiropractic
35 Dental Care
36 Dental Crowns
37 Dental Accident
38 Orthodontics
39 Prosthodontics
40 Oral Surgery
42 Home Health Care
44 Home Health Visits
45 Hospice
46 Respite Care
54 Long Term Care
56 Medically Related Transportation
61 In-vitro Fertilization
62 MRI/CAT Scan
63 Donor Procedures
64 Acupuncture
65 Newborn Care
66 Pathology
67 Smoking Cessation
68 Well Baby Care
69 Maternity
70 Transplants
71 Audiology Exam
72 Inhalation Therapy
73 Diagnostic Medical
74 Private Duty Nursing
75 Prosthetic Device
76 Dialysis
77 Otological Exam
78 Chemotherapy
79 Allergy Testing
80 Immunizations
82 Family Planning
83 Infertility
84 Abortion
85 AIDS
86 Emergency Services
88 Pharmacy
93 Podiatry
A4 Psychiatric
A6 Psychotherapy
A9 Rehabilitation
AD Occupational Therapy
AE Physical Medicine
AF Speech Therapy
AG Skilled Nursing Care
AI Substance Abuse
AJ Alcoholism
AK Drug Addiction
AL Vision (Optometry)
AR Experimental Drug Therapy
B1 Burn Care
BB Partial Hospitalization (Psychiatric)
BC Day Care (Psychiatric)
BD Cognitive Therapy
BE Massage Therapy
BF Pulmonary Rehabilitation
BG Cardiac Rehabilitation
BL Cardiac
BN Gastrointestinal
BP Endocrine
BQ Neurology
BS Invasive Procedures
BY Physician Visit - Office: Sick
BZ Physician Visit - Office: Well
C1 Coronary Care
GY Allergy
IC Intensive Care
MH Mental Health
NI Neonatal Intensive Care
ON Oncology
PT Physical Therapy
PU Pulmonary
RN Renal
RT Residential Psychiatric Treatment
TC Transitional Care
TN Transitional Nursery Care",,,,,,
2000F.UM04,"Health Care Service Location
Information",To provide information that identifies the place of service or the type of bill related to the location at which a health care service was rendered,S,,,,,,,
2000F.UM04-01,Facility Code Value,,,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/serviceType/placeOfService,,If 2000F.UM04-02 is B,
2000F.UM04-02,Facility Code Qualifier,Code identifying the type of facility referenced,R,"A - Uniform Billing Claim Form Bill Type
B - Place of Service Codes for Professional or Dental Services",,,,,,
2000E.UM06,Level of Service Code,Code specifying the level of service rendered,S,"E Elective
U Urgent
03 Emergency",,,,,,
Segment HCR - Health Care Services Review (Situational),,,,,,,,,,
2000F.HCR01,Action Code,Code indicating type of action,R,"C - Cancelled
A1 - Certified in total
A3 - Not Certified
A4 - Pended
A6 - Modified
CT - Contact Payer
NA - No Action Required",,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/serviceSetStatus,,REFER Conversional copy tab,
2000F.HCR02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,S,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/externalServiceSetId,,,"From Product standpoint,
If service set amend is expected, a unique identifier needs to be present for each service set in 2000F.HCR02 for create/amend transaction.
Implementation Teams needs to revisit this logic. The tags in /authorizationServiceSetMatchInput can be used to identify an existing serviceset."
,,,,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/authorizationServiceSetMatchInput/externalServiceSetId,,,
2000F.HCR03,Industry Code,Code indicating a code from a specific industry code list,S,,,,,,,
2000F.HCR04,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N - No
Y - Yes",,,,,,
Segment REF - Previous Review Authorization Number (Situational),,,,,,,,,,
2000F.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,BB - Authorization Number,,,,,,
2000F.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,
Segment REF - Administrative Reference Number (Situational),,,,,,,,,,
2000F.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,NT - Administrator's Reference Number,,,,,,
,,,,,,,,,,
2000F.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,
Segment DTP - Service Date (Situational),,,,,,,,,,
2000F.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,472 - Service,,,,,,
2000F.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,"D8 - Date Expressed in Format CCYYMMDD
RD8 - Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD",,,,,,
2000F.DTP03,Date Time Period,,R,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/startServiceDate,,"If DTP02 = RD8, map the first date IN DTP03
If DTP02 = D8, map DTP03
Format YYYY-M-DDTHH:MM:SS",
,,"Expression of a date, a time, or range of dates, times or dates and times",,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/endServiceDate,,"If DTP02 = RD8, map the second date IN DTP03
If DTP02 = D8, map DTP03
Mapping Format YYYY-M-DDTHH:MM:SS",
Segment DTP - Certification Issue Date (Situational),,,,,,,,,,
2000F.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,102 - Issue,,,,,,
2000F.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 - Date Expressed in Format CCYYMMDD,,,,,,
2000F.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/hicApproval/authorizedDate,,Format:YYYY-MM-DDTHH:MM:SS,
Segment  DTP - Certification Expiration Date (Situational),,,,,,,,,,
2000F.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,036 - Expiration,,,,,,
2000F.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 - Date Expressed in Format CCYYMMDD,,,,,,
2000F.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,,,
Segment DTP - Certification Effective Date (Situational),,,,,,,,,,
2000F.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,007 - Effective,,,,,,
2000F.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,"D8 - Date Expressed in Format CCYYMMDD
RD8 - Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD",,,,,,
2000F.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,,,
Segment SV1 - Professional Service (Situational),,,,,,,,,,
2000F.SV101,Composite Medical Procedure Identifier,To identify a medical procedure by its  standardized codes and applicable modifiers,R,,,,,,,
2000F.SV101-01,Product/Service ID Qualifier,Code identifying the type/source of the descriptive number used in Product/Service ID (234),R,"HC - Health Care Financing Administration Common Procedural Coding System
(HCPCS) Codes
IV - Home Infusion EDI Coalition (HIEC) Product/Service Code
N4 - National Drug Code in 5-4-2 Format",,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/serviceType/serviceCodeType,,"If SV101-01 is ""HC"", MAP Column H with hardcoded value - ""HCPCS""
Else If SV101-01 is ""N4"", MAP Column H with hardcoded value - ""NDC 5-4-2""","""HIEC-code"" - not configured in HRP. Implementation team can customize and configure  if needed"
2000F.SV101-02,Product/Service ID,Identifying number for a product or service,R,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/serviceType/serviceCode,,,
2000F.SV101-03,Procedure Modifier,"This identifies special circumstances related to the performance of the service, as defined by trading partners",S,,,"ExternalCodeList
Name: 130
Description: Healthcare Common Procedural Coding System
ExternalCodeList
Name: 513
Description: Home Infusion EDI Coalition (HIEC) Product/Service Code List",/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/serviceType/modifierCode,,,
2000F.SV101-04,Procedure Modifier,"This identifies special circumstances related to the performance of the service, as defined by trading partners",S,,,"ExternalCodeList
Name: 130
Description: Healthcare Common Procedural Coding System
ExternalCodeList
Name: 513
Description: Home Infusion EDI Coalition (HIEC) Product/Service Code List",/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/serviceType/modifierCode,,,
2000F.SV101-05,Procedure Modifier,"This identifies special circumstances related to the performance of the service, as defined by trading partners",S,,,"ExternalCodeList
Name: 130
Description: Healthcare Common Procedural Coding System
ExternalCodeList
Name: 513
Description: Home Infusion EDI Coalition (HIEC) Product/Service Code List",/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/serviceType/modifierCode,,,
2000F.SV101-06,Procedure Modifier,"This identifies special circumstances related to the performance of the service, as defined by trading partners",S,,,"ExternalCodeList
Name: 130
Description: Healthcare Common Procedural Coding System
ExternalCodeList
Name: 513
Description: Home Infusion EDI Coalition (HIEC) Product/Service Code List",/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/serviceType/modifierCode,,,
2000F.SV101-07,Description,A free-form description to clarify the related data elements and their content,S,,,,,,,
2000F.SV101-08,Product/Service ID,Identifying number for a product or service,S,,,"ExternalCodeList
Name: 130
Description: Healthcare Common Procedural Coding System
ExternalCodeList
Name: 513
Description: Home Infusion EDI Coalition (HIEC) Product/Service Code List
ExternalCodeList
Name: 240
Description: National Drug Code by Format",,,,
2000F.SV102,Monetary Amount,Monetary amount,S,,,,,,,
2000F.SV103,Unit or Basis for Measurement Code,"Code specifying the units in which a value is being expressed, or manner in which a measurement has been taken",S,"F2 - International Unit
MJ - Minutes
UN - Unit",,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/approvedUnits,,"If UN/F2 - units
Map 2000F.SV103,  If 2000E.HSD AND 2000F.HSD is not present.",
2000F.SV104,Quantity,Numeric value of quantity,S,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/approvedQuantity,Approvedquantity,"Map 2000F.SV104,
If 2000E.HSD AND 2000F.HSD is not present.",
2000F.SV107,Composite Diagnosis Code Pointer,To identify one or more diagnosis code pointers,S,,,,,,,
2000F.SV107-01,Diagnosis Code Pointer,A pointer to the diagnosis code in the order of importance to this service,R,,,,,,,
2000F.SV107-02,Diagnosis Code Pointer,A pointer to the diagnosis code in the order of importance to this service,S,,,,,,,
2000F.SV107-03,Diagnosis Code Pointer,A pointer to the diagnosis code in the order of importance to this service,S,,,,,,,
2000F.SV107-04,Diagnosis Code Pointer,A pointer to the diagnosis code in the order of importance to this service,S,,,,,,,
2000F.SV111,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N - No
Y - Yes",,,,,,
2000F.SV120,Level of Care Code,Code specifying the level of care provided by a nursing home facility,S,,,,,,,
Segment SV2 - Institutional Service Line (Situational),,,,,,,,,,
2000F.SV201,Product/Service ID,Identifying number for a product or service,S,,,"ExternalCodeList
Name: 132
Description: National Uniform Billing Committee (NUBC) Codes",,,,
2000F.SV202,Composite Medical Procedure Identifier,"To identify a medical procedure by its standardized codes and applicable
modifiers",S,,,,,,,
2000F.SV202-01,Product/Service ID Qualifier,Code identifying the type/source of the descriptive number used in Product/Service ID (234),R,"HC - Health Care Financing Administration Common Procedural Coding System
(HCPCS) Codes
ID - International Classification of Diseases, 9th Revision, Clinical Modification
(ICD-9-CM) - Procedure
IV - Home Infusion EDI Coalition (HIEC) Product/Service Code
N4 - National Drug Code in 5-4-2 Format
WK - Advanced Billing Concepts (ABC) Codes
ZZ - Mutually Defined",,,,,,
2000F.SV202-02,Product/Service ID,Identifying number for a product or service,,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/serviceType/serviceCodeType,,"If SV101-01 is ""HC"", MAP Column H with hardcoded value - ""HCPCS""
Else If SV101-01 is ""N4"", MAP Column H with hardcoded value - ""NDC 5-4-2""","""HIEC-code"" - not configured in HRP. Implementation team can customize and configure  if needed"
,,,R,,,"ExternalCodeList
Name: 130
Description: Healthcare Common Procedural Coding System
ExternalCodeList
Name: 131P
Description: International Classification of Diseases, 9th Revision, Clinical Modification
(ICD-9-CM) - Procedure Codes
ExternalCodeList
Name: 513
Description: Home Infusion EDI Coalition (HIEC) Product/Service Code List
ExternalCodeList
Name: 240
Description: National Drug Code by Format
ExternalCodeList
Name: 843
Description: Advanced Billing Concepts (ABC) Codes
ExternalCodeList
Name: 896
Description: International Classification of Diseases, 10th Revision, Procedure Coding
System",/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/serviceType/serviceCode,,,
2000F.SV202-03,Procedure Modifier,"This identifies special circumstances related to the performance of the service, as defined by trading partners",S,,,"ExternalCodeList
Name: 130
Description: Healthcare Common Procedural Coding System
ExternalCodeList
Name: 513
Description: Home Infusion EDI Coalition (HIEC) Product/Service Code List
ExternalCodeList
Name: 843
Description: Advanced Billing Concepts (ABC) Codes",/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/serviceType/modifierCode,,,
2000F.SV202-04,Procedure Modifier,"This identifies special circumstances related to the performance of the service, as defined by trading partners",S,,,"ExternalCodeList
Name: 130
Description: Healthcare Common Procedural Coding System
ExternalCodeList
Name: 513
Description: Home Infusion EDI Coalition (HIEC) Product/Service Code List
ExternalCodeList
Name: 843
Description: Advanced Billing Concepts (ABC) Codes",/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/serviceType/modifierCode,,,
2000F.SV202-05,Procedure Modifier,"This identifies special circumstances related to the performance of the service, as defined by trading partners",S,,,"ExternalCodeList
Name: 130
Description: Healthcare Common Procedural Coding System
ExternalCodeList
Name: 513
Description: Home Infusion EDI Coalition (HIEC) Product/Service Code List
ExternalCodeList
Name: 843
Description: Advanced Billing Concepts (ABC) Codes",/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/serviceType/modifierCode,,,
2000F.SV202-06,Procedure Modifier,"This identifies special circumstances related to the performance of the service, as defined by trading partners",S,,,"ExternalCodeList
Name: 130
Description: Healthcare Common Procedural Coding System
ExternalCodeList
Name: 513
Description: Home Infusion EDI Coalition (HIEC) Product/Service Code List
ExternalCodeList
Name: 843
Description: Advanced Billing Concepts (ABC) Codes",/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/serviceType/modifierCode,,,
2000F.SV202-07,Description,A free-form description to clarify the related data elements and their content,S,,,,,,,
2000F.SV202-08,Product/Service ID,Identifying number for a product or service,S,,,"ExternalCodeList
Name: 130
Description: Healthcare Common Procedural Coding System
ExternalCodeList
Name: 131P
Description: International Classification of Diseases, 9th Revision, Clinical Modification
(ICD-9-CM) - Procedure Codes
ExternalCodeList
Name: 513
Description: Home Infusion EDI Coalition (HIEC) Product/Service Code List
ExternalCodeList
Name: 240
Description: National Drug Code by Format
ExternalCodeList
Name: 843
Description: Advanced Billing Concepts (ABC) Codes
ExternalCodeList
Name: 896
Description: International Classification of Diseases, 10th Revision, Procedure Coding
System",,,,
2000F.SV203,Monetary Amount,Monetary Amount,S,,,,,,,
2000F.SV204,Unit or Basis for Measurement Code,"Code specifying the units in which a value is being expressed, or manner in which a measurement has been taken",S,"DA - Days
F2 - International Unit
UN - Unit",,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/approvedUnits,,"If UN/F2 - units
If DA - Days
Map 2000F.SV203,
If 2000E.HSD & 2000F.HSD & Map 2000F.SV1 is not present.",
2000F.SV205,Quantity,Numeric value of quantity,S,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/approvedQuantity,Approvedquantity,"Map 2000F.SV203,
If 2000E.HSD & 2000F.HSD & Map 2000F.SV1 is not present.",
2000F.SV206,Unit Rate,The rate per unit of associate revenue for hospital accommodation,S,,,,,,,
2000F.SV209,Nursing Home Residential Status Code,Code specifying the status of a nursing home resident at the time of service,S,"1 - Transferred to Intermediate Care Facility - Mentally Retarded (ICF-MR)
2 - Newly Admitted
3 - Newly Eligible
4 - No Longer Eligible
5 - Still a Resident
6 - Temporary Absence - Hospital
7 - Temporary Absence - Other
8 - Transferred to Intermediate Care Facility - Level II (ICF II)",,,,,,
2000F.SV210,Level of Care Code,Code specifying the level of care provided by a nursing home facility,S,,,,,,,
Segment SV3 - Dental Service (Situational),,,,,,,,,,
2000F.SV301,Composite Medical Procedure Identifier,To identify a medical procedure by its standardized codes and applicable modifiers,R,,,,,,,
2000F.SV301-01,Product/Service ID Qualifier,Code identifying the type/source of the descriptive number used in Product/Service ID (234),R,AD - American Dental Association Codes,,,,,,
2000F.SV301-02,,,,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/serviceType/serviceCodeType,,"If SV101-01 is ""HC"", MAP Column H with hardcoded value - ""HCPCS""
Else If SV101-01 is ""N4"", MAP Column H with hardcoded value - ""NDC 5-4-2""","""HIEC-code"" - not configured in HRP. Implementation team can customize and configure  if needed"
,Product/Service ID,Identifying number for a product or service,R,,,"ExternalCodeList
Name: 135
Description: American Dental Association",/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/serviceType/serviceCode,,,
2000F.SV301-03,Procedure Modifier,"This identifies special circumstances related to the performance of the service, as defined by trading partners",S,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/serviceType/modifierCode,,,
2000F.SV301-04,Procedure Modifier,"This identifies special circumstances related to the performance of the service, as defined by trading partners",S,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/serviceType/modifierCode,,,
2000F.SV301-05,Procedure Modifier,"This identifies special circumstances related to the performance of the service, as defined by trading partners",S,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/serviceType/modifierCode,,,
2000F.SV301-06,Procedure Modifier,"This identifies special circumstances related to the performance of the service, as defined by trading partners",S,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/serviceType/modifierCode,,,
2000F.SV301-07,Description,A free-form description to clarify the related data elements and their content,S,,,,,,,
2000F.SV301-08,Product/Service ID,Identifying number for a product or service,S,,,"ExternalCodeList
Name: 135
Description: American Dental Association",,,,
2000F.SV301-08,Product/Service ID,Identifying number for a product or service,S,,,,,,,
2000F.SV302,Monetary Amount,Monetary Amount,S,,,,,,,
2000F.SV304,Oral Cavity Designation,To identify one or more areas of the oral cavity,S,,,,,,,
2000F.SV304-01,Oral Cavity Designation Code,Code Identifying the area of the oral cavity in which service is rendered,R,,,,,,,
2000F.SV304-02,Oral Cavity Designation Code,Code Identifying the area of the oral cavity in which service is rendered,S,,,,,,,
2000F.SV304-03,Oral Cavity Designation Code,Code Identifying the area of the oral cavity in which service is rendered,S,,,,,,,
2000F.SV304-04,Oral Cavity Designation Code,Code specifying the level of care provided by a nursing home facility,S,,,,,,,
2000F.SV304-05,Oral Cavity Designation Code,Code specifying the level of care provided by a nursing home facility,S,,,,,,,
2000F.SV305,"Prosthesis, Crown or Inlay Code",Code specifying the placement status for the dental work,S,,,,,,,
2000F.SV306,Quantity,Numeric value of quantity,S,,,,,,,
2000F.SV307,Description,A free-form description to clarify the related data elements and their content,S,,,,,,,
Segment TOO - Tooth Information (Situational),,,,,,,,,,
2000F.TOO01,Code List Qualifier Code,Code identifying a specific industry code list,R,JP - Universal National Tooth Designation System,,,,,,
2000F.TOO02,Industry Code,Code indicating a code from a specific industry code list,R,,,,,,,
2000F.TOO03,Tooth Surface,To identify one or more tooth surface codes,S,,,,,,,
2000F.TOO03-01,Tooth Surface Code,Code identifying the area of the tooth that was treated,R,,,,,,,
2000F.TOO03-02,Tooth Surface Code,Code identifying the area of the tooth that was treated,S,,,,,,,
2000F.TOO03-03,Tooth Surface Code,Code identifying the area of the tooth that was treated,S,,,,,,,
2000F.TOO03-04,Tooth Surface Code,Code identifying the area of the tooth that was treated,S,,,,,,,
2000F.TOO03-05,Tooth Surface Code,Code identifying the area of the tooth that was treated,S,,,,,,,
Segment HSD - Health Care Services Delivery (Situational),,,,,,,,,,
2000F.HSD01,Quantity Qualifier,Code specifying the type of quantity,S,"DY - Days
FL - Units
HS - Hours
MN - Month
VS - Visits",,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/approvedUnits,,"If DY :Days
FL - Units",
2000F.HSD02,Quantity,Numeric value of quantity,S,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/approvedQuantity,"If the value in HSD02=1 and the value in HSD01=VS (Visits), this means “one visit”.",,
2000F.HSD03,Unit or Basis for Measurement Code,"Code specifying the units in which a value is being expressed, or manner in which a measurement has been taken",S,"DA - Days
MO - Months
WK - Week",,,,,,
2000F.HSD04,Sample Selection Modulus,"To specify the sampling frequency in terms of a modulus of the Unit of Measure, e.g., every fifth bag, every 1.5 minutes",S,,,,,,,
2000F.HSD05,Time Period Qualifier,Code defining periods,S,"6 - Hour
7 - Day
21 - Years
26 - Episode
27 - Visit
34 - Month
35 - Week",,,,,,
2000F.HSD06,Number of Periods,Total number of periods,S,,,,,,,
2000F.HSD07,Ship/Delivery or Calendar Pattern Code,"Code which specifies the routine shipments, deliveries, or calendar pattern",S,"1 1st Week of the Month
2 2nd Week of the Month
3 3rd Week of the Month
4 4th Week of the Month
5 5th Week of the Month
6 1st & 3rd Weeks of the Month
7 2nd & 4th Weeks of the Month
8 1st Working Day of Period
9 Last Working Day of Period
A Monday through Friday
B Monday through Saturday
C Monday through Sunday
D Monday
E Tuesday
F Wednesday
G Thursday
H Friday
J Saturday
K Sunday
L Monday through Thursday
M Immediately
N As Directed
O Daily Mon. through Fri.
P 1/2 Mon. & 1/2 Thurs.
Q 1/2 Tues. & 1/2 Thurs.
R 1/2 Wed. & 1/2 Fri.
S Once Anytime Mon. through Fri.
T 1/2 Tue. & 1/2 Fri.
U 1/2 Mon. & 1/2 Wed.
V 1/3 Mon., 1/3 Wed., 1/3 Fri.
W Whenever Necessary
X 1/2 By Wed., Bal. By Fri.
Y None (Also Used to Cancel or Override a Previous Pattern)
SA Sunday, Monday, Thursday, Friday, Saturday
SB Tuesday through Saturday
SC Sunday, Wednesday, Thursday, Friday, Saturday
SD Monday, Wednesday, Thursday, Friday, Saturday
SG Tuesday through Friday
SL Monday, Tuesday and Thursday
SP Monday, Tuesday and Friday
SX Wednesday and Thursday
SY Monday, Wednesday and Thursday
SZ Tuesday, Thursday and Friday",,,,,,
2000F.HSD08,Ship/Delivery Pattern Time Code,Code which specifies the time for routine shipments or deliveries,S,"A 1st Shift (Normal Working Hours)
B 2nd Shift
C 3rd Shift
D A.M.
E P.M.
F As Directed
G Any Shift
Y None (Also Used to Cancel or Override a Previous Pattern)",,,,,,
Segment PWK - Additional Service Information (Situational),,,,,,,,,,
2000F.PWK01,Report Type Code,"Code indicating the title or contents of a document, report or supporting item",R,"03 Report Justifying Treatment Beyond Utilization Guidelines
04 Drugs Administered
05 Treatment Diagnosis
06 Initial Assessment
07 Functional Goals
08 Plan of Treatment
09 Progress Report
10 Continued Treatment
11 Chemical Analysis
13 Certified Test Report
15 Justification for Admission
21 Recovery Plan
48 Social Security Benefit Letter
55 Rental Agreement
59 Benefit Letter
77 Support Data for Verification
A3 Allergies/Sensitivities Document
A4 Autopsy Report
AM Ambulance Certification
AS Admission Summary
AT Purchase Order Attachment
B2 Prescription
B3 Physician Order
BR Benchmark Testing Results
BS Baseline
BT Blanket Test Results
CB Chiropractic Justification
CK Consent Form(s)
D2 Drug Profile Document
DA Dental Models
DB Durable Medical Equipment Prescription
DG Diagnostic Report
DJ Discharge Monitoring Report
DS Discharge Summary
FM Family Medical History Document
HC Health Certificate
HP History and Physical
HR Health Clinic Records
I5 Immunization Record
IR State School Immunization Records
LA Laboratory Results
M1 Medical Record Attachment
NN Nursing Notes
OB Operative Note
OC Oxygen Content Averaging Report
OD Orders and Treatments Document
OE Objective Physical Examination (including vital signs) Document
OX Oxygen Therapy Certification
P4 Pathology Report
P5 Patient Medical History Document
P6 Periodontal Charts
P7 Periodontal Reports
PE Parenteral or Enteral Certification
PN Physical Therapy Notes
PO Prosthetics or Orthotic Certification
PQ Paramedical Results
PY Physician's Report
PZ Physical Therapy Certification
QC Cause and Corrective Action Report
QR Quality Report
RB Radiology Films
RR Radiology Reports
RT Report of Tests and Analysis Report
RX Renewable Oxygen Content Averaging Report
SG Symptoms Document
T7 Therapy Notes
V5 Death Notification
XP Photographs",,,,,,
,,,,,,,,,,
2000F.PWK02,Report Transmission Code,"Code defining timing, transmission method or format by which reports are to be sent",R,"AA - Available on Request at Provider Site
BM - By Mail
EL - Electronically Only
EM - E-Mail
FX - By Fax
VO - Voice",,,,,,
2000F.PWK05,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),S,AC  - Attachment Control Number,,,,,,
2000F.PWK06,Identification Code,Code identifying a party or other code,S,,,,,,,
,,,,,,,,,,
2000F.PWK07,Description,A free-form description to clarify the related data elements and their content,S,,,,,,,
Segment MSG - Message Text (Situational),,,,,,,,,,
2000F.MSG01,Free-form Message Text,Free-form Message Text,R,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/note,,,
Loop 2010F (Situational):,,,,,,,,,,
Segment NM1- Service Provider Name (Situational),,,,,,,,,,
2000F overrides 2000E.   If 2000F blank then 2000E applies to all service lines.,,,,,,,,,,
2010F.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",,"1T Physician, Clinic or Group Practice
72 Operating Physician
73 Other Physician
DD Assistant Surgeon
DK Ordering Physician
DQ Supervising Physician
FA Facility
G3 Clinic
P3 Primary Care Provider
QB Purchase Service Provider
SJ Service Provider",,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/renderingProvider/providerType,,refer conversion copy tab,
2010F.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,"1 - Person
2 - Non-Person Entity",,,,,,
2010F.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/renderingProvider/organizationName,,If NM102 = 2,
,,,,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/renderingProvider/individualName/lastName,,If NM102 = 1,
2010F.NM104,Name First,Individual first name,S,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/renderingProvider/individualName/firstName,,,
2010F.NM105,Name Middle,,S,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/requestingProvider/individualName/middleName,,,
2010F.NM106,Name Prefix,Prefix to individual name,S,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/renderingProvider/individualName/namePrefix,,,
2010F.NM107,Name Suffix,Suffix to individual name,S,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/renderingProvider/individualName/nameSuffix,,,
2010F.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code (67)",S,"24 - Employer's Identification Number
34 - Social Security Number
46 - Electronic Transmitter Identification Number (ETIN)
XX - Centers for Medicare and Medicaid Services National Provider Identifier",,,,,,
2010F.NM109,Identification Code,Code identifying a party or other code,,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/renderingProvider/providerNPIId,,If NM108=XX,
,,,,,,,/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/renderingProvider/providerTINId,,If NM108=46,
Segment REF - Service Provider Supplemental Identification (Situational),,,,,,,,,,
2010F.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B State License Number
1G Provider UPIN Number
1J Facility ID Number
EI Employer's Identification Number
G5 Provider Site Number
N5 Provider Plan Network Identification Number
N7 Facility Network Identification Number
SY Social Security Number
ZH Carrier Assigned Reference Number",,,,,,
2010F.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,,,,,,,,
,,,,,,,,,,
,,,R,,,,,,,
2010F.REF03,Description,A free-form description to clarify the related data elements and their content,S,,,,,,,
Segment N3 -Service Provider Address (Situational),,,,,,,,,,
2010F.N301,Address Information,Address information,R,,,,,,,
2010F.N302,Address Information,Address information,S,,,,,,,
"Segment N4 - Service Provider City, State, ZIP Code (Situational)",,,,,,,,,,
2010F.N401,City Name,Free-form text for city name,R,,,,,,,
2010F.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,"ExternalCodeList
Name: 22
Description: States and Provinces",,,,
2010F.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,,"ExternalCodeList
Name: 51
Description: ZIP Code
ExternalCodeList
Name: 932
Description: Universal Postal Codes",,,,
,,,,,,,,,,
2010F.N404,Country Code,Code identifying the country,S,,,"ExternalCodeList
Name: 5
Description: Countries, Currencies and Funds",,,,
2010F.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,"ExternalCodeList
Name: 5
Description: Countries, Currencies and Funds",,,,
Segment PER -Service Provider Contact Information (Situational),,,,,,,,,,
2010F.PER01,Contact Function Code,Code identifying the major duty or responsibility of the person or group named,R,IC - Information Contact,,,,,,
2010F.PER02,Name,Free-form name,S,,,,,,,
2010F.PER03,Communication Number Qualifier,Code identifying the type of communication number,S,"EM - Electronic Mail
FX - Facsimile
TE - Telephone
UR - Uniform Resource Locator (URL)",,,,,,
2010F.PER04,Communication Number,Complete communications number including country or area code when applicable,S,,,,,,,
2010F.PER05,Communication Number Qualifier,Code identifying the type of communication number,S,"EM - Electronic Mail
EX - Telephone Extension
FX - Facsimile
TE - Telephone
UR - Uniform Resource Locator (URL)",,,,,,
,,,,,,,,,,
2010F.PER06,Communication Number,Complete communications number including country or area code when,S,,,,,"If PER03/05 is TE and the very next qualifier (PER05/07) following is 'EX', map the Extension in PER06/08",,
2010F.PER07,Communication Number Qualifier,Code identifying the type of communication number,S,"EM - Electronic Mail
EX - Telephone Extension
FX - Facsimile
TE - Telephone
UR - Uniform Resource Locator (URL)",,,,,,
2010F.PER08,Communication Number,Complete communications number including country or area code when applicable,S,,,,,,,
Segment AAA - Service Provider Request Validation (Situational),,,,,,,,,,
2010F.AAA01,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,R,"N - No
Y - Yes",,,,,,
2010F.AAA03,Reject Reason Code,Code assigned by issuer to identify reason for rejection,S,"15 Required application data missing
33 Input Errors
35 Out of Network
41 Authorization/Access Restrictions
43 Invalid/Missing Provider Identification
44 Invalid/Missing Provider Name
45 Invalid/Missing Provider Specialty
46 Invalid/Missing Provider Phone Number
47 Invalid/Missing Provider State
49 Provider is Not Primary Care Physician
51 Provider Not on File
52 Service Dates Not Within Provider Plan Enrollment
79 Invalid Participant Identification
97 Invalid or Missing Provider Address",,,,,,
Segment PRV - Information Source Provider Information (Situational),,,,,,,,,,
2010F.PRV01,Provider Code,Code identifying the type of provider,R,"AS Assistant Surgeon
OP Operating
OR Ordering
OT Other Physician
PC Primary Care Physician
PE Performing",,,,,,
2010F.PRV02,Reference Identification Qualifier,Code qualifying the Reference Identification,R,PXC - Health Care Provider Taxonomy Code,,,,,,
2010F.PRV03,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,"ExternalCodeList
Name: 682
Description: Health Care Provider Taxonomy",/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/renderingProvider/providerTaxonomyCode,,,
Segment SE -Transaction Set Trailer (required),,,,,,,,,,
SE01,Number of Included Segments,Total number of segments included in a transaction set including ST and SE segments,R,Count Of ST,,,,,,
SE02,Transaction Set Control Number,Identifying control number that must be unique within the transaction set functional group assigned by the originator for a transaction set,R,ST02 VALUE,,,,,,
```

## Authorization IB/EDI 278/V26.1.1/EDIFECS_Product_MappingSpec_AuthorizationInbound_278_EDI_to_XML Conversion_V1.2.xlsx — Default Values

```csv
XSD Element,Default values,Description,Comments
/AuthorizationAdaptorRequest/payload/serviceAuthorization/recordType,Hardcode as 'Authorization',An enumerated value that can be either of the following: - Authorization - Agreement,
/AuthorizationAdaptorRequest/payload/header/originPayloadIdentificationCode,Hardcode as 'Products',Source request identification code,Custom field
/AuthorizationAdaptorRequest/payload/header/originSystemCode,Hardcode as 'Products',Source system name,Custom field
/AuthorizationAdaptorRequest/payload/header/apiCallTime,"Processing date/time in the format:
yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS",Static response creation time,
/AuthorizationAdaptorRequest/payload/serviceAuthorization/inputSource,Hardcode as 'EDI',,
/AuthorizationAdaptorRequest/payload/serviceAuthorization/servicesAction,Hardcode as 'Default',An enumerated value that can be either of the following: - Default/Replace,
/AuthorizationAdaptorRequest/payload/serviceAuthorization/receivedDate,Processing date/time in the format: YYYY-MM-DDTHH:mm:ss,,
/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/receivedDate,Processing date/time in the format: YYYY-MM-DDTHH:mm:ss,,
"/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/hicApproval/authorizedByExternalUser/codeSetName
/AuthorizationAdaptorRequest/payload/serviceAuthorization/services/hicApproval/authorizedByExternalUser/codeEntry","codeSetName   as  ServiceAuthExternalUser
/codeEntry as 2",,Custom field
/AuthorizationAdaptorRequest/payload/header/recordIdentifier,A Unique Record Identifier,A Unique Record Identifier,
/AuthorizationAdaptorRequest/payload/header/inputId,Value passed is  - {UID}- Uniqie for each file,EDI file id,
/AuthorizationAdaptorRequest/payload/header/inputType,"Hardcode as ""EDI""",,
/AuthorizationAdaptorRequest/payload/header/inputFileName,Input Filename of the EDI file received with filename extension,Name of the input file received from source.,
/AuthorizationAdaptorRequest/payload/header/inputArchiveFileName,Input Filename of the EDI file archived in s3 with filename extension,Name of the input file after archiving the input file.,
```

## Authorization IB/EDI 278/V26.1.1/EDIFECS_Product_MappingSpec_AuthorizationInbound_278_EDI_to_XML Conversion_V1.2.xlsx — conversional copy

```csv
,,,,/providerType conversional copy,
/authorizationStatus - 2000E.HCR01,,,,2010EA/2010F.NM101,Conversional copy
2000E.HCR01,,/authorizationStatus,,71 Attending Physician,Practitioner
A1,Certified in total,APPROVED,,72 Operating Physician,Practitioner
A2,Certified - partial,PARTIALLY_APPROVED,,73 Other Physician,Other
A3,Not Certified,NOT_APPROVED,,77 Service Location,Supplier_Location
A4,Pended,,,DD Assistant Surgeon,Practitioner
A6,Modified,APPROVED,,DK Ordering Physician,Practitioner
CT,Contact Payer,,,DN Referring Provider,Practitioner
NA,No Action Required,NOT_APPROVED,,FA Facility,Supplier
C,Cancelled,,,G3 Clinic,Other
,,,,P3 Primary Care Provider,Practitioner
,,,,QB Purchase Service Provider,Other
/serviceSetStatus - 2000F.HCR01 or 2000E.HCR01,,,,QV Group Practice,Other
2000E/2000F.HCR01,,/serviceSetStatus,,SJ Service Provider,Supplier
A1,Certified in total,APPROVED,,AAJ Admitting Services,Other
A3,Not Certified,DENIED,,"1T Physician, Clinic or Group Practice",Other
A4,Pended,,,DQ Supervising Physician,Practitioner
A6,Modified,APPROVED,,,
CT,Contact Payer,,,,
NA,No Action Require,UNNECESSARY,,,
C,Cancelled,,,,
,,,,,
,,,,,
/requestedAdmitStatusCode,,,,,
"If UM04-02 = A, Take the Second byte of UM04-01",,,,,
1,INPATIENT,,,,
2,INPATIENT,,,,
3,OUTPATIENT,,,,
"If UM04-02 = B, Take UM04-01",,,,,
11,OUTPATIENT,,,,
12,OUTPATIENT,,,,
19,OUTPATIENT,,,,
22,OUTPATIENT,,,,
23,OUTPATIENT,,,,
24,OUTPATIENT,,,,
41,OUTPATIENT,,,,
42,OUTPATIENT,,,,
50,OUTPATIENT,,,,
52,OUTPATIENT,,,,
53,OUTPATIENT,,,,
54,OUTPATIENT,,,,
60,OUTPATIENT,,,,
62,OUTPATIENT,,,,
65,OUTPATIENT,,,,
71,OUTPATIENT,,,,
72,OUTPATIENT,,,,
81,OUTPATIENT,,,,
21,INPATIENT,,,,
51,INPATIENT,,,,
55,INPATIENT,,,,
56,INPATIENT,,,,
61,INPATIENT,,,,
```

## Authorization IB/Symphony Auth/V26.1.1/EDIFECSProduct_Symphony Auth IB_Audit mapping_XML to XML_Conversion_V1.0.xlsx — Cover sheet

```csv
,Authorization Inbound Audit Processing -  EDIFECS,,,,,,,,,
,,,,,,,,,,
,Business Area: Symphony Auth Inbound XMLtoXML Conversion,,,,,,,,,
,,,,,,,,,,
,This document provides the Audit Mapping Specification for Symphony Authorization Inbound XML to XML Conversion. Document is intended for EDIFECS Product Team,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,Version,,V26.1.1.0,,,
,,,,,,,,,,
,,Distribution of this document is limited to UST HealthProof,,,,,,,,
,,,,,,,,,,
,,Notice of Confidentiality and Custodial Responsibilities,,,,,,,,
,,"This UST HealthProof document contains confidential information that is
UST HealthProof’s intellectual property. As a holder of this document, you
 may NOT disclose its content or any information derived from it to
any person outside of UST Proof Project Team.",,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,Sign Off,,,,,,,,,
,,Name,,Role,,Organization,,Date,,Approval
,Approver #1,,,,,,,,,
,Approver #2,,,,,,,,,
,Approver #3,,,,,,,,,
,Approver #4,,,,,,,,,
```

## Authorization IB/Symphony Auth/V26.1.1/EDIFECSProduct_Symphony Auth IB_Audit mapping_XML to XML_Conversion_V1.0.xlsx — Edifecs Json Mapping

```csv
Group,Fields,Auth Ib values,Description,Sample values
,,,,
,inputFileID,UID,,
inputHeaderInfo,,,,
,inputFileType,XML,Defines the type of input file - XML,
,inputArchiveFilename,Input Filename of the EDI file archived in s3 with filename extension,Name of the input file after archiving the input file.,Input_20251103-001556463_Test-APIData-7-Multiple Records.xml
,inputFileReceiptDateTime,"Input file receipt date time of when the file is dropped to edifecs profile
yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS",,2025-11-03T00:15:56.000000462
,inputFileName,Input Filename of the EDI file received with filename extension,Name of the input file received from source.,Test-APIData-7-Multiple Records.xml
,auditTime,The time the audit json got generated in yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS format,Auditing time of each audit point,2025-11-03T00:15:56.000000462
,totalRecordCount,Total number Auth transaction in a batch file,,9
,sourceTypeIdentifier,Hardcode as EDIFECS,Identifier to find from where we received(Starting point) the initial Transaction/Record.,EDIFECS
,,,,
,,,,
,recordIdentifier,A Unique Record Identifier. GUID,"Unique Identifier for transaction level. Will be different when we split, reprocess a same record.",14918E29-4C01-4A01-9440-49BCBFDB3DD9
,recordIdentifierFromSource,externalAuthorizationID,,KSUM00032748
,memberId,member Id,,K44008029
,inputFileId,Value passed is  - {UID}- Uniqie for each file,EDI file id,PtChmkgktLNLFz9N
businessAdaptor,adaptorReceiptDateTime,The time when the file is dropped to edifecs profile  in yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS format,,2025-11-03T00:15:56.000000462
,adaptorAuditDateTime,The time the audit trigger event  got generated in yyyy-MM-dd'T'HH:mm:ss.SSS format,Auditing time of each audit point,2025-11-03T00:16:10.000000079
processStatus,processStageName,Refer Audit events Tab,Represent the name of the process stage which post the Audit point.,EDIFECS-Record-sent-via-API
,adaptorStatus,Refer Audit events Tab,Represent the Intermediate or Final status of the process stage which posts the Audit point.,SUCCESS
,sourceTypeIdentifier,Hardcode as EDIFECS,Identifier to find from where we received(Starting point) the initial Transaction/Record.,EDIFECS
```

## Authorization IB/Symphony Auth/V26.1.1/EDIFECSProduct_Symphony Auth IB_Audit mapping_XML to XML_Conversion_V1.0.xlsx — Audit events

```csv
Audit events,,,
processStageName,adaptorStatus,JSON TRIGGER EVENT,Comments
EDIFECS-Record-sent-via-API,Success/Failure,When file hits rest client API,
EDIFECS-Record-sent-via-Queue,Success/Failure,When file hits SQS queue,
```

## Authorization IB/Symphony Auth/V26.1.1/EDIFECSProduct_Symphony Auth IB_Audit mapping_XML to XML_Conversion_V1.0.xlsx — Sample Audit

```csv
,Sample
Header,"{
		""inputFileID"": ""PtChmkgktLNLFz9N"",
	 ""inputHeaderInfo"": {
		""inputFileType"": ""XML"",
		""inputArchiveFilename"": ""Input_20251103-001556463_Test-APIData-7-Multiple Records.xml"",
		""inputFileReceiptDateTime"": ""2025-11-03T00:15:56.000000462"",
		""inputFileName"": ""Test-APIData-7-Multiple Records.xml"",
		""auditTime"": ""2025-11-03T00:15:56.000000462"",
		""totalRecordCount"": ""6""
	},
	    ""sourceTypeIdentifier"": ""EDIFECS""
}"
Detail,"{
		""recordIdentifier"": ""14918E29-4C01-4A01-9440-49BCBFDB3DD9"",
		""recordIdentifierFromSource"": ""KSUM00032748"",
		""memberId"": ""K44008029"",
		""inputFileID"": ""PtChmkgktLNLFz9N"",
	 ""businessAdaptor"": {
		""adaptorReceiptDateTime"": ""2025-11-03T00:15:56.000000462"",
		""adaptorAuditDateTime"": ""2025-11-03T00:16:10.000000079""
	 },
	 ""processStatus"": {
	   ""processStageName"": ""EDIFECS-Record-sent-via-API"",
	   ""adaptorStatus"": ""SUCCESS""
   },
		""sourceTypeIdentifier"": ""EDIFECS""
}"
```
