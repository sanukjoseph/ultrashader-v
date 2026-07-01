# Repricer OB-IB

## Repricer OB-IB/IB Repricer/V26.1.0.0/EDIFECSProduct_AuditProcessing_InboundRepricer_V2.0.xlsx — Cover Page

```csv
,IB Claims Repricer Audit Processing -  EDIFECS,,,,,,,,,
,,,,,,,,,,
,Business Area: Repricer IB,,,,,,,,,
,,,,,,,,,,
,This document provides the Audit Mapping for Claims Repricer IB. Document is intended for EDIFECS Product Team,,,,,,,,,
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

## Repricer OB-IB/IB Repricer/V26.1.0.0/EDIFECSProduct_AuditProcessing_InboundRepricer_V2.0.xlsx — Audit Mapping

```csv
Group,Fields,Values,Usage,Description,
inputDetails,inputId,"Value passed is  - {UID}- Uniqie for each file
Example - -dtBkcCHu9bkKu8O",Mandatory,File id,
,inputFileName,Input Filename of the EDI file received with filename extension,,Name of the input file received from source.,
,inputType,Hardcode as 'EDI',,,
,sourceTypeIdentifier,"Repricer Name
Should be able to populate Repricer name  based on ISA06/2300.HCP04 /file name from the Inbound repricer crosswalk. Must be a configurable field",,Identifier to find from where we received(Starting point) the initial Transaction/Record. Configurable field,
,claimsDefinition,Hardcode as Repricer,Mandatory,,
,tenantIdentifier,"Hardcode as 'PRODUCT'( Configurable field)
""Hardcode as """"Product"""" in adaptor.properties file and assign to variable"""" tenantIdentifier""""
and call in profile """,,"Identifier for the implementation team, Configurable field",
,totalTransactions,Total no. of Claims in file,Mandatory,,
,inputArchiveFilename,Input Filename of the DFF/EDI file archived in s3 with filename extension,,Name of the input file after archiving the input file.,
process,processStageName,Refer Audit events Tab,Mandatory,Represent the name of the process stage which post the Audit point.,
,processStatus,Refer Audit events Tab,Mandatory,Represent the Intermediate or Final status of the process stage which posts the Audit point.,
,processMessage,Refer Audit events Tab,,Specific information of a particular step after the process is completed.,
,processInputArchiveFilename,Input Filename of the DFF/EDI file received with filename extension,,Name of the input Archive file of the process stage which posts the Audit point.,
,processOutputArchiveFilename,NA,,Name of the output Archive file of the process stage which posts the Audit point.,
,auditTime,"The time the audit trigger event got generated in yyyy-MM-dd HH:mm:ss.SSSSSSSSS format
2024-08-05 00:24:16:480",Mandatory,Auditing time of each audit point,"Need to confirm on Format - Indhu to confirm
 as of now we are having 2024-08-05 00:24:16:480
- pls proceed with same format"
identifiers,rayIdentifier,GUID,Mandatory for record level,"Unique Identifier for the complete lifecycle of transaction/Record. Will be unchanged even the transaction is Split, passed across various system, reprocessed.",
,recordIdentifier,GUID,Mandatory for record level,"Unique Identifier for transaction level. Will be different when we split, reprocess a same record.",
,recordIdentifierFromSource,Same as recordIdentifier,,,
claims,,,,,
,claimId,2300.REF*D9(EDI),,HCC id of the claim,
,claimStatus,"Hardcode as ""Needs Repricing""",,,
```

## Repricer OB-IB/IB Repricer/V26.1.0.0/EDIFECSProduct_AuditProcessing_InboundRepricer_V2.0.xlsx — Audit Events

```csv
processStageName,processStatus,processMessage,JSON TRIGGER EVENT,Comments
edifecs:message received,MESSAGE READ,File Level,When the inbound IB file is received via mount path,
edifecs:message received,ERROR,,,Do we need this event?
edifecs:validation,PROCESSED,,"After the Validations, if it’s a good record",
edifecs:validation failed,ERROR,"Detailed Error details in below format( for EDI )
(Err ID, ErrData, ErrSegment, ErrPath, ErrBrief) seprated by '||'.  Total error message length is 5000  with a max of 300 characters  recorded for  one error.","After the Validations, if it’s a bad record",
edifecs:conversion,PROCESSED,,After the XML conversion if it’s a success,
edifecs:conversion failed,ERROR,"Detailed Error details in below format( for EDI )
(Err ID, ErrData, ErrSegment, ErrPath, ErrBrief) seprated by '||'.  Total error message length is 5000  with a max of 300 characters  recorded for  one error.",After the XML conversion if it’s a failure,
,,,,
edifecs:file level validation error,ERROR,"Detailed Error details
(Err ID, ErrData, ErrSegment, ErrPath, ErrBrief) seprated by '||'.  Total error message length is 5000  with a max of 300 characters  recorded for  one error.",Incase of Interchange related errors like Parsing Error or Incorrect Info in ISA & GS,
edifecs:validation failed,ERROR,Duplicate_File_<FileName>,,
edifecs:validation failed,ERROR,Duplicate_Interchange_<SenderId>_<ReciverId>_<Time>_<Date>_<InterchangeControlNumber>,,
```

## Repricer OB-IB/IB Repricer/V26.1.0.0/EdifecsProduct_MappingSpec_IB Repricer_837_EDI_to_XMLConversion_V1.0.xlsx — Cover Page

```csv
EDI 837I/P Mapping Specification- EDIFECS,,,,,,,,,
,,,,,,,,,
Business Area: IB Repricer,,,,,,,,,
,,,,,,,,,
This document provides the Mapping Specification for EDI 837I/P Repriced Claims IB. Document is intended for EDIFECS Product Team,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,Version,,V26.1.0.0,,,
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

## Repricer OB-IB/IB Repricer/V26.1.0.0/EdifecsProduct_MappingSpec_IB Repricer_837_EDI_to_XMLConversion_V1.0.xlsx — Sheet1

```csv
institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/supplierInformation/address
```

## Repricer OB-IB/IB Repricer/V26.1.0.0/EdifecsProduct_MappingSpec_IB Repricer_837_EDI_to_XMLConversion_V1.0.xlsx — Version History

```csv
Revision History,,,,
,,,,
,,,,
,,,,
V#,Date,Author,Reviewer(s)/ Contributor(s),Comments
1,29/11/2023,Ambily Raj,Shijila M,Initial Version. Baselined
2,11/02.2026,Swedha kumar,Ambily Raj,XSD upgrade. RayID has been mapped.
```

## Repricer OB-IB/IB Repricer/V26.1.0.0/EdifecsProduct_MappingSpec_IB Repricer_837_EDI_to_XMLConversion_V1.0.xlsx — Mapping

```csv
EDILoopID. Segment,EDI Data Element Name,EDI Element Description,Enumeration Values,XSD Field Name,Field Description,X12 Element 837I,X12 Element 837P,Mapping Logic,Custom Field,Notes
,,,,ClaimRepricingIBRequestRoot/header/inputFilename,Inbound EDI File Name,Populate the IB file name,Populate the IB file name,,,These fields are used for internal reference. Not loaded to HRP UI
,,,,ClaimRepricingIBRequestRoot/header/inputFileId,This will be UniqueFile ID({UID}) from profile process flow,,,,,
,,,,ClaimRepricingIBRequestRoot/header/totalInputTransaction,Shows the total number of claim records in IB file.,Populate the total claim count in IB file,Populate the total claim count in IB file,,,
,,,,ClaimRepricingIBRequestRoot/header/inputFileType,,,,,,
,,,,ClaimRepricingIBRequestRoot/header/totalClaimCount,Shows the total number of claim records.,,,,,
,,,,ClaimRepricingIBRequestRoot/header/totalXMLTransactionCount,Shows the total number of claim records in a single xml file,Hardcoded as 1,Hardcoded as 1,,,
,,,,ClaimRepricingIBRequestRoot/header/fileCreationDate,File created date.,"Processing date/time in the format:
YYYY-MM-DD T HH:mm:ss:sss","Processing date/time in the format:
YYYY-MM-DD T HH:mm:ss:sss",,,
ISA13,Interchange Control Number,A control number assigned by the interchange sender,,ClaimRepricingIBRequestRoot/header/correlationId,Unique string or alphanumeric value identifying each file.,This will be ISA06 from IB EDI file,This will be ISA06 from IB EDI file,,,
,,,,ClaimRepricingIBRequestRoot/header/correlationIdDesc,,,,,,
ISA06,Interchange Sender ID,"Identification code published by the sender for other parties to use as the receiver
ID to route data to them; the sender always codes this value in the sender ID
element",,ClaimRepricingIBRequestRoot/header/senderId,This will be ISA06 from IB EDI file,ISA06,ISA06,,,
ISA08,Interchange Receiver ID,Receiver Id,,ClaimRepricingIBRequestRoot/header/receiverId,This will be ISA08 from IB EDI file,ISA08,ISA08,,,
,,,,ClaimRepricingIBRequestRoot/ClaimRepricingIBRequest/ClaimRepricingSubmitRequestRecordList/recordCount,Shows the total number of /ClaimRepricingSubmitRequestRecord tags  in a single xml file,,,,,
ISA13,Interchange Control Number,A control number assigned by the interchange sender,,ClaimRepricingIBRequestRoot/ClaimRepricingIBRequest/ClaimRepricingSubmitRequestRecordList/ClaimRepricingSubmitRequestRecord/recordId,Unique Record Number or ID to identify each claim in a file,A unique Identifier,A unique Identifier,,,
,,,,ClaimRepricingIBRequestRoot/ClaimRepricingIBRequest/ClaimRepricingSubmitRequestRecordList/ClaimRepricingSubmitRequestRecord/rayId,,GUID,GUID,,,
,,,,ClaimRepricingIBRequestRoot/ClaimRepricingIBRequest/ClaimRepricingSubmitRequestRecordList/ClaimRepricingSubmitRequestRecord/recordIdDesc,,,,,,
2300.REF02,Reference Identification,Repricer control number,,ClaimRepricingIBRequestRoot/ClaimRepricingIBRequest/ClaimRepricingSubmitRequestRecordList/ClaimRepricingSubmitRequestRecord/repricingClaimInput/hccClaimNumber,HCC ID of the repriced claim.,2300.REF02,2300.REF02,When 2300.REF01 = D9,,
2300.HCP06,,,,ClaimRepricingIBRequestRoot/ClaimRepricingIBRequest/ClaimRepricingSubmitRequestRecordList/ClaimRepricingSubmitRequestRecord/repricingClaimInput/calculatedDRG,Approved DRG.,2300.HCP06,2300.HCP06,,Yes,
,,,,ClaimRepricingIBRequestRoot/ClaimRepricingIBRequest/ClaimRepricingSubmitRequestRecordList/ClaimRepricingSubmitRequestRecord/repricingClaimInput/calculatedDRGType,"Enumerated value specifying the
DRG type (MS DRG, APR DRG, or
AP DRG).",Hardcode as 'APR DRG',Hardcode as 'APR DRG',Populate only if we have value in 2300.HCP06.,,
,,,,ClaimRepricingIBRequestRoot/ClaimRepricingIBRequest/ClaimRepricingSubmitRequestRecordList/ClaimRepricingSubmitRequestRecord/repricingClaimInput/deliveredService/repricerName,"Name of the repricing
organization.",,,,Yes,Should be able to populate Repricer name  based on ISA06/2300.HCP04 /file name
,,,,ClaimRepricingIBRequestRoot/ClaimRepricingIBRequest/ClaimRepricingSubmitRequestRecordList/ClaimRepricingSubmitRequestRecord/repricingClaimInput/deliveredService/repricerID,ID of the repricing organization.,,,,,
,,,,ClaimRepricingIBRequestRoot/ClaimRepricingIBRequest/ClaimRepricingSubmitRequestRecordList/ClaimRepricingSubmitRequestRecord/repricingClaimInput/deliveredService/allowedAmount,Allowed amount.,2400.HCP02,2400.HCP02,,,
,,,,ClaimRepricingIBRequestRoot/ClaimRepricingIBRequest/ClaimRepricingSubmitRequestRecordList/ClaimRepricingSubmitRequestRecord/repricingClaimInput/deliveredService/healthrulesDecisionCode,"An enumerated value that can be
either of the following:
Priced, Denied, Not Contracted.",2400.HCP01,2400.HCP01,"00 : Not contracted
01 to 14  :Priced
Spaces/Null : Denied",,
,,,,ClaimRepricingIBRequestRoot/ClaimRepricingIBRequest/ClaimRepricingSubmitRequestRecordList/ClaimRepricingSubmitRequestRecord/repricingClaimInput/deliveredService/hipaaDecisionCode,"Either this or
healthRulesDecisionCode
is populated, not both.",,,,,
,,,,ClaimRepricingIBRequestRoot/ClaimRepricingIBRequest/ClaimRepricingSubmitRequestRecordList/ClaimRepricingSubmitRequestRecord/repricingClaimInput/deliveredService/benefitNetworkName,Benefit network.,,,,Yes,Custom Field. Should be able to populate benefit network name from the network code send in EDI.
,,,,ClaimRepricingIBRequestRoot/ClaimRepricingIBRequest/ClaimRepricingSubmitRequestRecordList/ClaimRepricingSubmitRequestRecord/repricingClaimInput/deliveredService/responseDate,"Date the response was
received.",Processing Date Expressed in Format CCYY-MM-DD,Processing Date Expressed in Format CCYY-MM-DD,,,
,,,,ClaimRepricingIBRequestRoot/ClaimRepricingIBRequest/ClaimRepricingSubmitRequestRecordList/ClaimRepricingSubmitRequestRecord/repricingClaimInput/deliveredService/messageCodes/messageCode,Repricer message code.,,,,Yes,"Custom Requirement.
Can be used to map any repricer messages.
Also should be able to map the message text corresponding to the messagecode supplied in EDI.
Adaptor logic in Product:
Populate from 2400.K301. If this is not present, populate from 2400.NTE*TPO.
If 2400.K301 and 2400.NTE*TPO is not present, popualte from 2300.NTE*ADD for 837I /2300.NTE*TPO for 837P."
,,,,ClaimRepricingIBRequestRoot/ClaimRepricingIBRequest/ClaimRepricingSubmitRequestRecordList/ClaimRepricingSubmitRequestRecord/repricingClaimInput/deliveredService/messageCodes/messageCodeType,"An enumerated value that can be
either of the following:
1. RepricerMessage
2. HealthRulesMessage",HealthRulesMessage,HealthRulesMessage,,,
,,,,ClaimRepricingIBRequestRoot/ClaimRepricingIBRequest/ClaimRepricingSubmitRequestRecordList/ClaimRepricingSubmitRequestRecord/repricingClaimInput/deliveredService/messageCodes/messageText,Text of the repricer message.,,,,,
,,,,ClaimRepricingIBRequestRoot/ClaimRepricingIBRequest/ClaimRepricingSubmitRequestRecordList/ClaimRepricingSubmitRequestRecord/repricingClaimInput/deliveredService/messageCodes/policyName,"If the message is the result of a
HealthRules policy, the name of the
policy.",NA,NA,,,
,,,,ClaimRepricingIBRequestRoot/ClaimRepricingIBRequest/ClaimRepricingSubmitRequestRecordList/ClaimRepricingSubmitRequestRecord/repricingClaimInput/deliveredService/denialMessageCode/codeSetName,,NA,NA,,,
,,,,ClaimRepricingIBRequestRoot/ClaimRepricingIBRequest/ClaimRepricingSubmitRequestRecordList/ClaimRepricingSubmitRequestRecord/repricingClaimInput/deliveredService/denialMessageCode/codeEntry,,NA,NA,,,
,,,,ClaimRepricingIBRequestRoot/ClaimRepricingIBRequest/ClaimRepricingSubmitRequestRecordList/ClaimRepricingSubmitRequestRecord/repricingClaimInput/deliveredService/denialMessageCode/shortName,,NA,NA,,,
,,,,ClaimRepricingIBRequestRoot/ClaimRepricingIBRequest/ClaimRepricingSubmitRequestRecordList/ClaimRepricingSubmitRequestRecord/repricingClaimInput/deliveredService/hccClaimLineNumber,HealthRule Payor internal service line number,2400.LX01,2400.LX01,,,
```

## Repricer OB-IB/IB Repricer/V26.1.0.0/EdifecsProduct_MappingSpec_IB Repricer_837_EDI_to_XMLConversion_V1.0.xlsx — Ref

```csv
First Health,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
Multiplan,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
Megellan,,,,,,
,,,,,,
HCP04 – Reference Identification,,,,,,
"Represents the network for repricers with multiple networks claim (2300 loop) or line (2400 loop).  If not applicable, do not use.",,,,,,
Example of a successfully priced line/claim,,,,,,
HCP*10*123.22*55*ABC~,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
,,,,,,
Emblem,,,,,,
,,,,,,
,,,,,,
,,,,,,
Loop ID,Reference,Name,Codes,Length,Comments - 837P,Comments - 837I
2300,HCP,Claim Pricing/Repricing Information,,,,
2300,HCP01,Pricing Methodology,,,This field will be populated with either ‘00’ (allowance equals $0.00) or ’10’ (allowance greater than $0.00).,This field will always be populated with’10’
2300,HCP02,Monetary Amount,,,Total Claim Allowance,Total Claim Allowance
2300,HCP04,Reference Identification,,15,GHI + The 12 digit Claim Reference ID,"GHI + The 12 digit Claim Reference ID + a 5 digit code.  If the claim is priced, the 5 digit code will be F0000.  If the claim is not priced, status code identifying reason(s) will be set. The reason code may be a 5 bytes code or multiple 5 bytes code concatenated with ‘|’ (pipe symbol). Attached below is a list of the status codes and their description."
2400,HCP,Line Pricing/Repricing Information,,,,
2400,HCP01,Pricing Methodology,,,This field will be populated with either  ’00’ or ‘10’.,
2400,HCP02,Monetary Amount,,,Service Line Allowance,
2400,HCP04,Reference Identification,,19,"When HCP01 = ‘10’, HCP04 will be structured as: GHI + The 12 digit Claim Reference ID + the 2 digit Line Reference Number + ‘10’.",
2400,HCP04,Reference Identification,,,"When HCP01 = ‘00’, HCP04 will be structured as: GHI + The 12-digit Claim Reference ID + the 2-digit Line Reference Number + Remark Code. Attached below is a list of the current remark codes and their description.",
,,,,,Remark code may be 3-byte explanation code or 5 bytes error codes or multiple 5 bytes code concatenated with ‘|’ (pipe symbol).,
2400,HCP09,Product/Service ID Qualifier,HC,,,
2400,HCP10,Product Service ID,,,Original CPT/HCPCS code,
2400,HCP11,Unit or Basis for Measurement Code,UN,,UN will always be reported even if MJ (anesthesia minutes) was submitted.,
2400,HCP12,Quantity,,,Unit Count,
2400,HCP13,Reject Reason Code,,,This field will be populated with T6 when there is a remark code present in HCP04. Attached below is a list of the remark codes and their description.,
,,,,,,
,,,,,,
,,,,,Sample 2400/HCP Segments,Sample 2300/HCP Segment
,,,,,,
,,,,,HCP*10*7.92**GHI120149622410-10-10*****HC*99441*UN*1~,HCP*10*6633.9**GHI202012109021-F0000 – Priced
,,,,,HCP*00*0**GHI120114615439-50-50120*****HC*3725F*UN*1*T6~,HCP*10*0**GHI202014009276-F0001 – Priced at $0 per the contract
,,,,,,"HCP*10*0**GHI202014009276-51950 – Problem with the claim, and claim could not be priced- Claim submission issue"
```

## Repricer OB-IB/OB Repricer/V26.1.0.0/EdifecsProduct_AuditProcessing_OB Repricer_V2.0.xlsx — Cover Page

```csv
,OB Repricer Audit Processing -  EDIFECS,,,,,,,,,
,,,,,,,,,,
,Business Area: OB Repricer,,,,,,,,,
,,,,,,,,,,
,This document provides the Audit Mapping for OB Repricer (EDI 837I/P). Document is intended for EDIFECS Product Team,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,Version,,V6.1.0.0,,,
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

## Repricer OB-IB/OB Repricer/V26.1.0.0/EdifecsProduct_AuditProcessing_OB Repricer_V2.0.xlsx — JSON Mapping

```csv
Group,Fields,,Description
jobDetails,identifier,EXECUTION_IDENTIFIER,
,claimsDefinition,,
,sourceTypeIdentifier,REPRICER_NAME (from the first occurrence which is not spaces),
,jobStatus,,
,totalCount,,
,successCount,,
,falloutCount,,
,jobStartDateTime,,
,jobEndDateTime,,
process,processStageName,Refer Audit events Tab,Represent the name of the process stage which post the Audit point.
,processStatus,Refer Audit events Tab,Represent the Intermediate or Final status of the process stage which posts the Audit point.
,processMessage,Refer Audit events Tab,Specific information of a particular step after the process is completed.
,processInputArchiveFilename,Input DFF name received with filename extension,Name of the input Archive file of the process stage which posts the Audit point.
,processOutputArchiveFilename,Ob EDI file name with extension (if applicable),Name of the output Archive file of the process stage which posts the Audit point.
,auditTime,The time the audit trigger event got generated in yyyy-MM-dd HH:mm:ss.SSSSSSSSS format,Auditing time of each audit point
identifiers,rayIdentifier,RAY_IDENTIFIER,"Unique Identifier for the complete lifecycle of transaction/Record. Will be unchanged even the transaction is Split, passed across various system, reprocessed."
,recordIdentifier,RECORD_IDENTIFIER,"Unique Identifier for transaction level. Will be different when we split, reprocess a same record."
,recordIdentifierFromSource,,
,sequenceIdentifier,,
,referenceIdentifier,,
,retriedReferenceIdentifier,,
claim,claimHCCId,CLAIM_ID,HCC id of the claim
,claimNumber,CLAIM_NUM,
,claimStatus,,
,requestClaimArchiveFilename,Input DFF name received with filename extension,
,responseClaimArchiveFilename,Ob EDI file name with extension,
```

## Repricer OB-IB/OB Repricer/V26.1.0.0/EdifecsProduct_AuditProcessing_OB Repricer_V2.0.xlsx — Audit events

```csv
processStageName,processStatus,processMessage,JSON TRIGGER EVENT,Comments
EDIFECS-Conversion,PROCESSED,,After the XML conversion if it’s a success,
EDIFECS-Conversion,FAILURE,"Detailed Error details
(Err ID, ErrData, ErrSegment, ErrPath, ErrBrief) seprated by '||'.  Total error message length is 5000  with a max of 300 characters  recorded for  one error.",After the XML conversion if it’s a failure,
EDIFECS-Validation,SUCCESS,,"After the Validations, if it’s a good record",
EDIFECS-Validation,FAILURE,"Detailed Error details
(Err ID, ErrData, ErrSegment, ErrPath, ErrBrief) seprated by '||'.  Total error message length is 5000  with a max of 300 characters  recorded for  one error.","After the Validations, if it’s a bad record",
```

## Repricer OB-IB/OB Repricer/V26.1.0.0/EdifecsProduct_MappingSpec_OB Repricer_837_DFF_to_EDI Conversion_V2.1.xlsx — Cover Page

```csv
EDI OB Repricer Mapping Specification- EDIFECS,,,,,,,,,
,,,,,,,,,
Business Area: Repricer OB,,,,,,,,,
,,,,,,,,,
This document provides the Mapping Specification for EDI Repricer OB. Document is intended for EDIFECS Product Team,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,Version,,V26.1.0.0,,,
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

## Repricer OB-IB/OB Repricer/V26.1.0.0/EdifecsProduct_MappingSpec_OB Repricer_837_DFF_to_EDI Conversion_V2.1.xlsx — Version History

```csv
Revision History,,,,
,,,,
,,,,
,,,,
V#,Date,Author,Reviewer(s)/ Contributor(s),Comments
1.3,5/2/24,Jishnu Kumar,Shijila M/Rameshwar Singh,
1.4,20-06-2024,Deepthi Marella,Rameshwar Singh,"1. Logic changed in 2300.CLM07
2. Included ""DISCHARGE_TIME_MM"" in 2300.DTP03 (Instituitional)
3. 2010BB.N404 - Value changed from ""Default Value as ""CO"" to ""Leave It blank"""
1.5,01-07-2024,Ambily R,Rameshwar Singh,Updated the mapping for 2010AA.NM1 and 2010AA.PER segment
1.6,02-07-2024,Deepthi Marella,Rameshwar Singh,Updated the mapping for N404 with comments
1.6,03-07-2024,Deepthi Marella,Rameshwar Singh,Comment added for 2010AA.NM102
1.7,30-07-2024,Deepthi Marella,Rameshwar Singh,Mapping logic added for 1000B.NM103 & 2300.REF02
2.0,20/3/2025,Ambily Raj,Rameshwar Singh,Changes for the PSD-5336/PSD-5174/PSD-5377
2.1,8/9/2025,Ambily Raj,Rameshwar Singh,Updated the DFF layout as part of the Audt processing enhancement
```

## Repricer OB-IB/OB Repricer/V26.1.0.0/EdifecsProduct_MappingSpec_OB Repricer_837_DFF_to_EDI Conversion_V2.1.xlsx — 837P Mapping

```csv
Loop ID,EDI Segment,EDI Data Element Name,EDI Element Description,USAGE,Enumeration Values,CDS Field Name / Hardcode,Extract layout name,Position,Level,Mapping Logic,Cuztomization,Comments,PIEDMONT,
ISA (Interchange Control Header),,,,,,,,,,,,,Mapping Value,
,ISA,Segment: Interchange Control Header,,R,,,,,,,,,,
,ISA01,Authorization Information Qualifier,Code identifying the type of information in the Authorization Information,R,"00 No Authorization Information Present (No Meaningful Information in I02)
03 Additional Data Identification","Hardcode as ""00""",,,,,,,,
,ISA02,Authorization Information,Information used for additional identification or authorization of the interchange sender or the data in the interchange; the type of information is set by the Authorization Information Qualifier (I01),R,,Leave it blank,,,,,,,,
,ISA03,Security Information Qualifier,Code identifying the type of information in the Security Information,R,"00 No Security Information Present (No Meaningful Information in I04)
01 Password","Hardcode as ""00""",,,,,,,,
,ISA04,Security Information,This is used for identifying the security information about the interchange sender or the data in the interchange; the type of information is set by the Security Information Qualifier (I03),R,,Leave it blank,,,,,,,,
,ISA05,Interchange ID Qualifier,Code indicating the system/method of code structure used to designate the sender or receiver ID element being qualified,R,"01 Duns (Dun & Bradstreet)
 14 Duns Plus Suffix
 20 Health Industry Number (HIN) CODE SOURCE 121: Health Industry Number
 27 Carrier Identification Number as assigned by Health Care Financing Administration (HCFA)
28 Fiscal Intermediary Identification Number as assigned by Health Care Financing Administration (HCFA)
29 Medicare Provider and Supplier Identification Number as assigned by Health Care Financing Administration (HCFA)
30 U.S. Federal Tax Identification Number
33 National Association of Insurance Commissioners Company Code (NAIC)
ZZ Mutually Defined","Hardcode as ""ZZ""",,,,,,,,
,ISA06,Interchange Sender ID,Identification code published by the sender for other parties to use as the receiver ID to route data to them; the sender always codes this value in the sender ID element,R,,"We need to refer the crosswalk for mapping the sender id for products is ""PRODUCT""",,,,,Yes,"Configurable value for Implementation team
PRODUCT",ClaimServiceStronglyTypedOBResponseRoot/header/senderId,
,ISA07,Interchange ID Qualifier,Code indicating the system/method of code structure used to designate the sender or receiver ID element being qualified,R,"01 Duns (Dun & Bradstreet)
14 Duns Plus Suffix
20 Health Industry Number (HIN) CODE SOURCE 121: Health Industry Number
27 Carrier Identification Number as assigned by Health Care Financing Administration (HCFA)
28 Fiscal Intermediary Identification Number as assigned by Health Care Financing Administration (HCFA)
29 Medicare Provider and Supplier Identification Number as assigned by Health Care Financing Administration (HCFA)
30 U.S. Federal Tax Identification Number
33 National Association of Insurance Commissioners Company Code (NAIC)
ZZ Mutually Defined","Hardcode as ""ZZ""",,,,,,,,
,ISA08,Interchange Receiver ID,"Identification code published by the receiver of the data; When sending, it is used by the sender as their sending ID, thus other parties sending to them will use this as a receiving ID to route data to them",R,,"Hardcode  <default value>
Hardcode  as ""123456789123456""",,,,We need to pull it from line level repricer name,Yes,"Configurable value for Implementation team
updated default values",,
,ISA09,Interchange Date,Date of the interchange,R,,"Map this value from  current date in the format of ""YYMMDD""",,,,,,,,
,ISA10,Interchange Time,Time of the interchange,R,,Map this value from   current time in the format of HHMM,,,,,,,,
,ISA11,Repetition Separator,"Type is not applicable; the repetition separator is a delimiter and not a data element; this field provides the delimiter used to separate repeated occurrences of a simple data element or a composite data structure; this value must be different than the data element separator, component element separator, and the segment terminator",R,,"Hardcode as ""^""",,,,,,,,
,ISA12,Interchange Control Version Number,Code specifying the version number of the interchange control segments,R,00501 Standards Approved for Publication by ASC X12 Procedures Review Board through October 2003,Hardcode as “00501”,,,,,,,,
,ISA13,Interchange Control Number,A control number assigned by the interchange sender,R,,Unique ISA control number needs to generated in Edifecs for each 837 EDI file. It has to be 9 digits (for example -  000000764),,,,,,,,
,ISA14,Acknowledgment Requested,Code indicating sender’s request for an interchange acknowledgment,R,"0 No Interchange Acknowledgment Requested
1 Interchange Acknowledgment Requested (TA1)","Hardcode as ""0""",,,,,,,,
,ISA15,Interchange Usage Indicator,"Code indicating whether data enclosed by this interchange envelope is test, production or information",R,"P Production Data
T Test Data","""P""  if it is a Production region
""T""  if it is a Non-Production region",,,,,,According to enviroinment it should be configurable,,
,ISA16,Component Element Separator,Type is not applicable; the component element separator is a delimiter and not a data element; this field provides the delimiter used to separate component data elements within a composite data structure; this value must be different than the data element separator and the segment terminator,R,,"Hardcode  as "":""",,,,,,,,
GS (Functional Group Header),,,,,,,,,,,,,,
,GS,Segment: Functional Group Header,,R,,,,,,,,,,
,GS01,Functional Identifier Code,Code identifying a group of application related transaction sets,R,,Hardcode as “HC”,,,,,,,,
,GS02,Application Sender's Code,Code identifying party sending transmission; codes agreed to by trading partners,R,,"We need to refer the crosswalk for mapping the sender id for products is ""PRODUCT""",,,,"Application Sender Code will be different for each customer.From product standpoint, we have hardcoded a random Application Sender Code.",Yes,"Configurable value for Implementation team
PRODUCT",,
,GS03,Application Receiver's Code,Code identifying party receiving transmission; codes agreed to by trading partners,R,,"Reveiver code for products is ""PRODUCT""",,,,"Application Receiver ID will be different for each customer.From product standpoint, we have hardcoded a random Application Application Receiver ID.",Yes,"Configurable value for Implementation team
PRODUCT",,
,GS04,Date,Date the Group Header is created.,R,,"Map this value from  current date in the format of ""YYYYMMDD""",,,,,,,,
,GS05,Time,"Time expressed in 24-hour clock time as follows: HHMM, or HHMMSS, or HHMMSSD, or HHMMSSDD, where H = hours (00-23), M = minutes (00-59), S = integer seconds (00-59) and DD = decimal seconds; decimal seconds are expressed as follows: D = tenths (0-9) and DD = hundredths (00-99)",R,,"Map this value from   current Time in the format of ""HHMMSS""",,,,,,,,
,GS06,Group Control Number,Assigned number originated and maintained by the sender,R,,Generate unique ID In EDIFECS (1-9 Bytes),,,,,,,,
,GS07,Responsible Agency Code,Code identifying the issuer of the standard; this code is used in conjunction with Data Element 480,R,X : Accredited Standards Committee X12,"Hardcode as ""X""",,,,,,,,
,GS08,Version / Release / Industry Identifier Code,"Code indicating the version, release, subrelease, and industry identifier of the EDI standard being used, including the GS and GE segments; if code in DE455 in GS segment is X, then in DE 480 positions 1-3 are the version number; positions 4-6 are the release and subrelease, level of the version; and positions 7-12 are the industry or trade association identifiers (optionally assigned by user); if code in DE455 in GS segment is T, then other formats are allowed",R,005010X222 Standards Approved for Publication by ASC X12 Procedures Review Board through October 2003,"Hardcode as ""005010X222A1""",,,,,,,,
ST Transaction Set Header,,,,,,,,,,,,,,
,ST,Segment: Transaction Set Header,,R,,,,,,,,,,
,ST01,Transaction Set Identifier Code,Code uniquely identifying a Transaction Set,R,837 Health Care Claim,837,,,,,,,,
,ST02,Transaction Set Control Number,Identifying control number that must be unique within the transaction set functional group assigned by the originator for a transaction set,R,,Unique control number needs to populated from process flow or map within a file,,,,,,,,
,ST03,Implementation Convention Reference,Reference assigned to identify Implementation Convention,R,,005010X222A1,,,,,,,,
BHT Beginning of Hierarchical Transaction,,,,,,,,,,,,,,
,BHT,Segment: Beginning of Hierarchical Transaction,,R,,,,,,,,,,
,BHT01,Hierarchical Structure Code,Code indicating the hierarchical application structure of a transaction set that utilizes the HL segment to define the structure of the transaction set,R,"0019- Information Source, Subscriber, Dependent",0019,,,,,,,,
,BHT02,Transaction Set Purpose Code,Code identifying purpose of transaction set,R,"00 Original
18 Reissue","Hardcode as ""00""",,,,,,,,
,BHT03,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,Auto Generate In EDIFECS.,,,,,,,,
,BHT04,Date,Date expressed as CCYYMMDD where CC represents the first two digits of the calendar year,R,,"Map this value from  current date in the format of ""YYYYMMDD""",,,,,,,,
,BHT05,Time,"Time expressed in 24-hour clock time as follows: HHMM, or HHMMSS, or HHMMSSD, or HHMMSSDD, where H = hours (00-23), M = minutes (00-59), S = integer seconds (00-59) and DD = decimal seconds; decimal seconds are expressed as follows: D = tenths (0-9) and DD = hundredths (00-99)",R,,"Map this value from   current Time in the format of ""HHMMSS""",,,,,,,,
,BHT06,Transaction Type Code,Code specifying the type of transaction,R,"31 Subrogation Demand
CH Chargeable
RP Reporting","Hardcode as ""RP""",,,,,,,,
LOOP 1000A - SUBMITTER,,,,,,,,,,,,,,
1000A,NM1,Submitter Name (Required),,R,,,,,,,,,,
1000A,1000A.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,41 Submitter,"Hardcode as ""41""",,,,,,,,
1000A,1000A.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,"1 Person
2 Non-Person Entity","Hardcode as ""2""",,,,,,,,
1000A,1000A.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,"""PRODUCT""",,,,,Yes,"Configurable value for Implementation team
PRODUCT",ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/payerInformation/hicName,
1000A,1000A.NM104,Name First,Individual first name,S,,,,,,,,,,
1000A,1000A.NM105,Name Middle,Individual middle name or initial,S,,,,,,,,,.,
1000A,1000A.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),R,46 Electronic Transmitter Identification Number (ETIN),"Hardcode as ""46""",,,,,,,,
1000A,1000A.NM109,Identification Code,Code identifying a party or other code,R,,"Default values
<123456789123>",,,,,Yes,"Configurable value for Implementation team
updated default values",ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/payerInformation/taxId,
1000A,PER,Submitter EDI Contact Name (Required),,R,,,,,,,,,,
1000A,1000A.PER01,Contact Function Code,Code identifying the major duty or responsibility of the person or group named,R,IC Information Contact,"Hardcode  as ""IC""",,,,,,,,
1000A,1000A.PER02,Name,Free-form name,R,,"""PRODUCT""",,,,,Yes,Configurable value for Implementation team,"Qn, 05/20 - what needs to be populated here for Piedmont?",
1000A,1000A.PER03,Communication Number Qualifier,Code identifying the type of communication number,R,"EM Electronic Mail
FX Facsimile
TE Telephone","Hardcode  as ""TE""",,,,,,,,
1000A,1000A.PER04,Communication Number,Complete communications number including country or area code when applicable,R,,"Hardcode as ""1234567890""",,,,,Yes,"Configurable value for Implementation team
updated default values","Qn, 05/20 -What will be the contact number for Piedmont?",
1000A,1000A.PER05,Communication Number Qualifier,Code identifying the type of communication number,S,"EM Electronic Mail
EX Telephone Extension
FX Facsimile
TE Telephone
TE Telephone",,,,,,,,,
1000A,1000A.PER06,Communication Number,Complete communications number including country or area code when applicable,S,,,,,,,,,,
1000A,1000A.PER07,Communication Number Qualifier,Code identifying the type of communication number,S,"EM Electronic Mail
 EX Telephone Extension
FX Facsimile
TE Telephone",,,,,,,,,
1000A,1000A.PER08,Communication Number,Complete communications number including country or area code when applicable,S,,,,,,,,,,
LOOP 1000B - RECEIVER,,,,,,,,,,,,,,
1000B,NM1,NM1 Receiver Name (Required),,R,,,,,,,,,,
1000B,1000B.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,40 Receiver,"Hardcode as ""40""",,,,,,,,
1000B,1000B.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,2 Non-Person Entity,"Hardcode as ""2""",,,,,,,,
1000B,1000B.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,REPRICER_NAME,REPRICER_NAME,515,Line,If the 1st line is not in 'Need Repricing' the logic should search for other lines which is in 'Need Repricing' state to update the Repricer Name,,,"Qn, 05/20- If we can get the Receiver ID for First health and Aetna, EDIFECS can populate the Org name here. So need to get the Full name to be populated for both and Receiver id's
Details for First Health seems as below. Needs to get for Aetna also
Org Name: FIRST HEALTH Group Corp
Receiver id: 201736437",
1000B,1000B.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),R,46 Electronic Transmitter Identification Number (ETIN),"Hardcode as ""46""",,,,,,,,
1000B,1000B.NM109,Identification Code,Code identifying a party or other code,R,,"Default values
<123456789123>",,,,,Yes,configurable item need to update (based on repricer name,,
LOOP 2000A - BILLING PROVIDER HL LOOP,,,,,,,,,,,,,,
2000A,HL,Billing Provider Hierarchical Level (Required),,,,,,,,,,,,
2000A,2000A.HL01,Hierarchical ID Number,,,,Generated by Edifecs,,,,,,,,
2000A,2000A.HL03,Hierarchical Level Code,,,20 Information Source,"Hardcode as ""20""",,,,,,,,
2000A,2000A.HL04,Hierarchical Child Code,,,"1 Additional Subordinate HL Data Segment in This
Hierarchical Structure",Generated by Edifecs,,,,,,,,
2000A,PRV,Billing Provider Speciality Information,,,,,,,,,,,,
2000A,2000A.PRV01,Provider Code,,,BI Billing,,,,,,,,,
2000A,2000A.PRV02,Reference Identification Qualifier,,,PXC Health Care Provider Taxonomy Code,,,,,,,,,
2000A,2000A.PRV03,Reference Identification,,,,,,,,,,,,
2000A,CUR,Foreign Currency Information,,,,,,,,,,,,
2000A,2000A.CUR01,Entity Identifier Code,,,85 Billing Provider,,,,,,,,,
2000A,2000A.CUR02,Currency Code,,,,,,,,,,,,
LOOP 2010AA - BILLING PROVIDER,,,,,,,,,,,,,,
2010AA,NM1,Billing Provider Name (Required),,R,,,,,,,,,,
2010AA,2010AA.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,85 Billing Provider,"Hardcode as ""85""",,,,,,,,
2010AA,2010AA.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,"1 Person
2 Non-Person Entit",Hard code as '2',,112,Line,,,"DFF will contain the Supplier name in BILLING_LAST_NAME field.
As of now, DFF file does not contain a field to identify whether supplier is a person or non person entity. So from EDIFECS, hardcoding to 2.
If we need to handle the supplier who is a person scenario, DFF changes are needed. THis is still in discussion with IPLus.
Deepthi(3 July):
After discussion with Iplus team. Hardcoding the value as 2 for this release. ""1 Person"" is not configurable in HRP and if any implementation team needs 'Person' value it canbe taken as an Enhancement.",,
2010AA,2010AA.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,BILLING_LAST_NAME,BILLING_LAST_NAME,113,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/supplierInformation/supplierBillingName,
2010AA,2010AA.NM104,Name First,ndividual first name,S,,,,114,Line,,,,,
2010AA,2010AA.NM105,Name Middle,Individual middle name or initial,S,,,,115,Line,,,,,
2010AA,2010AA.NM107,Name Suffix,Suffix to individual name,S,,,,116,Line,,,,,
2010AA,2010AA.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),S,XX Centers for Medicare and Medicaid Services National Provider Identifier,"Hardcode as ""XX""",,,,,,,,
2010AA,2010AA.NM109,Identification Code,Code identifying a party or other code,S,,BILLING_NPI,BILLING_NPI,107,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/supplierInformation/npi,
2010AA,N3,Billing Provider Address (Required),,R,,,,,,,,,,
2010AA,2010AA.N301,Address Information,Address information,R,,BILLING_ADDRESS_1,BILLING_ADDRESS_01,117,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/supplierInformation/address/address,
2010AA,2010AA.N302,Address Information,Address information,S,,BILLING_ADDRESS_2,BILLING_ADDRESS_02,118,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/supplierInformation/address/address2,
2010AA,N4,"Billing Provider City, State, ZIP Code (Required)",,R,,,,,,,,,,
2010AA,2010AA.N401,City Name,Free-form text for city name,R,,BILLING_CITY,BILLING_CITY,119,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/supplierInformation/address/city,
2010AA,2010AA.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,BILLING_STATE,BILLING_STATE,120,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/supplierInformation/address/stateCode,
2010AA,2010AA.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,(BILLING_ZIP) + (BILLING_ZIP_PLUS_4),(BILLING_ZIP) + (BILLING_ZIP_PLUS_FOUR),122,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/supplierInformation/address/zipCode + ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/supplierInformation/address/zipExtension,
2010AA,2010AA.N404,Country Code,Code identifying the country,S,,Leave it blank,,123,Line,,,"I checked in OB Payment. Seems Country Code is not displaying in EDI. As we do not have any logic with Country Code and we are blocked with this issue (Snip Validation Error while translating with the Value as US), we can remove the Country Code mapping.",ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/supplierInformation/address/countryCode,
2010AA,2010AA.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,,,,,
2010AA,REF,Billing Provider Tax Identification (Required),,R,,,,,,,,,,
2010AA,2010AA.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"EI Employer’s Identification Number
SY Social Security Number","Hardcode as ""EI""",,,,,,,,
2010AA,2010AA.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,BILLING_TAXGROUP_ID,BILLING_TAXGROUP_ID,106,Line,EI’ then it will be mapped into ‘XX-XXXXXXX’ format to taxIdentificationNumber(Remove hypen),,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/supplierInformation/taxIdentificationNumber,
2010AA,REF,Billing Provider UPIN/License Information,,S,,,,,,,,,,
2010AA,2010AA.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B State License Number
1G Provider UPIN Number",,,,,,,,,
2010AA,2010AA.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,BILLING_STATE_LICENSE,BILLING_STATE_LICENSE,105,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/supplierInformation/supplierPINNumber,
2010AA,PER,Billing Provider Contact Information,,S,,,,,,,,,,
2010AA,2010AA.PER01,Contact Function Code,Code identifying the major duty or responsibility of the person or group named,R,IC Information Contact,"Hardcode as ""IC""",,,,,,,,
2010AA,2010AA.PER02,Name,Free-form name,S,,,,,,,,,,
2010AA,2010AA.PER03,Communication Number Qualifier,Code identifying the type of communication number,R,"EM Electronic Mail
FX Facsimile
TE Telephone","Hardcode as ""TE""",,,,Only if   BILLING_PHONE is having values.,,BILLING_PHONE in DFF should contain 10 byte phone number including area code.,,
2010AA,2010AA.PER04,Communication Number,Complete communications number including country or area code when applicable,R,,BILLING_PHONE,BILLING_PHONE,127,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/supplierInformation/telephoneNumber,
2010AA,2010AA.PER05,Communication Number Qualifier,Code identifying the type of communication number,S,"EM Electronic Mail
EX Telephone Extension
FX Facsimile
TE Telephone","Hardcode as ""EX""",,,,Only if   BILLING_PHONE_EXT is having values.,,,,
2010AA,2010AA.PER06,Communication Number,Complete communications number including country or area code when applicable,S,,BILLING_PHONE_EXT,BILLING_PHONE_EXT,128,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/supplierInformation/faxNumber,
2010AA,2010AA.PER07,Communication Number Qualifier,Code identifying the type of communication number,S,"EM Electronic Mail
EX Telephone Extension
FX Facsimile
TE Telephone","Hardcode as ""FX""",,,,"Only if   BILLING_FAX is having values.

If BILLING_PHONE is not present, this should be mapped in PER03/PER04

If BILLING_PHONE is  present, and BILLING_PHONE_EXT not present, this should be mapped in PER05/PER06",,,,
2010AA,2010AA.PER08,Communication Number,Complete communications number including country or area code when applicable,S,,BILLING_FAX,BILLING_FAX,133,Line,,,,,
LOOP 2010AB - PAY-TO PROVIDER,,,,,,,,,,,,,,
2010AB,PER,Billing Provider Contact Information,,S,,,,,,,,,,
2010AB,2010AB.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,87 Pay-to Provider,"Hardcode as ""87""",,,,,,,,
2010AB,2010AB.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,"1 Person
2 Non-Person Entity","Hardcode as ""2""",,,,,,,,
2010AB,N3,Pay-to Address - ADDRESS (Required),,R,,,,,,,,,,
2010AB,2010AB.N301,Address Information,Address information,R,,PAY_TO_ADDRESS_1,PAY_TO_ADDRESS_01,272,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/payToAddress/address,
2010AB,2010AB.N302,Address Information,Address information,S,,PAY_TO_ADDRESS_2,PAY_TO_ADDRESS_02,273,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/payToAddress/address2,
2010AB,N4,"Pay-To Address City, State, ZIP Code (Required)",,R,,,,,,,,,,
2010AB,2010AB.N401,City Name,Free-form text for city name,R,,PAY_TO_CITY,PAY_TO_CITY,274,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/payToAddress/city,
2010AB,2010AB.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,PAY_TO_STATE,PAY_TO_STATE,275,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/payToAddress/stateCode,
2010AB,2010AB.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,(PAY_TO_ZIP) + (PAY_TO_ZIP_PLUS_4),(PAY_TO_ZIP) + (PAY_TO_ZIP_PLUS_FOUR),276 + 277,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/payToAddress/zipCode + ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/payToAddress/zipExtension,
2010AB,2010AB.N404,Country Code,Code identifying the country,S,,Leave it blank,,278,Line,,,"I checked in OB Payment. Seems Country Code is not displaying in EDI. As we do not have any logic with Country Code and we are blocked with this issue (Snip Validation Error while translating with the Value as US), we can remove the Country Code mapping",ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/payToAddress/countryCode,
2010AB,2010AB.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,,,,,
LOOP 2010AC - PAY-TO PLAN NAME,,,,,,,,,,,,,,
2010AC,NM1,"Pay-To Address City, State, ZIP Code (Required)",,S,,,,,,,,,,
2010AC,2010AC.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,PE Payee,,,,,,,,,
2010AC,2010AC.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,2 Non-Person Entity,,,,,,,,,
2010AC,2010AC.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,,,,,,,,
2010AC,2010AC.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),R,"PI Payor Identification
XV Centers for Medicare and Medicaid Services PlanID",,,,,,,,,
2010AC,2010AC.NM109,Identification Code,Code identifying a party or other code,R,,,,,,,,,,
2010AC,N3,Pay-to Plan Address (Required),,R,,,,,,,,,,
2010AC,2010AC.N301,Address Information,Address information,R,,,,,,,,,,
2010AC,2010AC.N302,Address Information,Address information,S,,,,,,,,,,
2010AC,N4,"Pay-To Plan City, State, ZIP Code (Required)",,,,,,,,,,,,
2010AC,2010AC.N401,City Name,,,,,,,,,,,,
2010AC,2010AC.N402,State or Province Code,,,,,,,,,,,,
2010AC,2010AC.N403,Postal Code,,,,,,,,,,,,
2010AC,2010AC.N404,Country Code,,,,,,,,,,,,
2010AC,2010AC.N407,Country Subdivision Code,,,,,,,,,,,,
2010AC,REF,Pay-to Plan Secondary Identification,,,,,,,,,,,,
2010AC,2010AC.REF01,Reference Identification Qualifier,,,"2U Payer Identification Number
FY Claim Office Number
NF National Association of Insurance Commissioners
(NAIC) Code",,,,,,,,,
2010AC,2010AC.REF02,Reference Identification,,,,,,,,,,,,
2010AC,REF,Pay-To Plan Tax Identification Number (Required),,,,,,,,,,,,
2010AC,2010AC.REF01,Reference Identification Qualifier,,,EI Employer’s Identification Number,,,,,,,,,
2010AC,2010AC.REF02,Reference Identification,,,,,,,,,,,,
"LOOP 2000B - SUBSCRIBER HIERARCHICAL
LEVEL",,,,,,,,,,,,,,
2000B,HL,Subscriber Hierarchical Level (Required),,,,,,,,,,,,
2000B,2000B.HL01,Hierarchical ID Number,,,,Generated by Edifecs,,,,,,,,
2000B,2000B.HL02,Hierarchical Parent ID Number,,,,2000A.HL01,,,,,,,,
2000B,2000B.HL03,Hierarchical Level Code,,,22 Subscriber,"Hardcode as ""22""",,,,,,,,
2000B,2000B.HL04,Hierarchical Child Code,,,"0 No Subordinate HL Segment in This Hierarchical
Structure.
1 Additional Subordinate HL Data Segment in This
Hierarchical Structure.",Generated by Edifecs,,,,,,,,
2000B,SBR,Subscriber Information (Required),,R,,,,,,,,,,
2000B,2000B.SBR01,Payer Responsibility Sequence Number Code,Code identifying the insurance carrier’s level of responsibility for a payment of a claim,R,"A Payer Responsibility Four
B Payer Responsibility Five
C Payer Responsibility Six
D Payer Responsibility Seven
E Payer Responsibility Eight
F Payer Responsibility Nine
G Payer Responsibility Ten
H Payer Responsibility Eleven
P Primary
S Secondary
T Tertiary
U Unknown","Hardcode as ""P""",,,,,,,,
2000B,2000B.SBR02,Individual Relationship Code,Code indicating the relationship between two individuals or entities,S,18 Self,"Hardcode as ""18""",,,,Only if RELATIONSHIP_TO_SUB = Self (18),,,,
2000B,2000B.SBR03,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,S,,"CLAIM_SI_MEB_SUB_FACT
SI_MEMBER_GROUP_NUMBER",,503,Claim,,,,"AETNA:
ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/subscriptionInformation/groupNumber
if group number is '10302', then pass PDCNTRASF. Pass 'PEDMNT' for all other self Insured groups
FirstHealth:
Pass Acro ID's here",
2000B,2000B.SBR04,Name,Free-form name,S,,,,,,,,,,
2000B,2000B.SBR05,Insurance Type Code,Code identifying the type of insurance policy within a specific insurance program,S,"12 Medicare Secondary Working Aged Beneficiary or
Spouse with Employer Group Health Plan
13 Medicare Secondary End-Stage Renal Disease
Beneficiary in the Mandated Coordination Period
with an Employer’s Group Health Plan
14 Medicare Secondary, No-fault Insurance including
Auto is Primary
15 Medicare Secondary Worker’s Compensation
16 Medicare Secondary Public Health Service (PHS)or
Other Federal Agency
41 Medicare Secondary Black Lung
42 Medicare Secondary Veteran’s Administration
43 Medicare Secondary Disabled Beneficiary Under
Age 65 with Large Group Health Plan (LGHP)
47 Medicare Secondary, Other Liability Insurance is
Primary",,,,,,,,,
2000B,2000B.SBR09,Claim Filing Indicator Code,Code identifying type of claim,S,"11 Other Non-Federal Programs
12 Preferred Provider Organization (PPO)
13 Point of Service (POS)
14 Exclusive Provider Organization (EPO)
15 Indemnity Insurance
16 Health Maintenance Organization (HMO) Medicare
Risk
17 Dental Maintenance Organization
AM Automobile Medical
BL Blue Cross/Blue Shield
CH Champus
CI Commercial Insurance Co.
DS Disability
FI Federal Employees Program
HM Health Maintenance Organization
LM Liability Medical
MA Medicare Part A
MB Medicare Part B
MC Medicaid
OF Other Federal Program
TV Title V
VA Veterans Affairs Plan
WC Workers’ Compensation Health Claim
ZZ Mutually Defined",SUB_CLAIM_FILING_CODE,,242,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/baseBenefitPlan/product/planType,
2000B,PAT,Patient Information,,,,,,,,,,,,
2000B,2000B.PAT05,Date Time Period Format Qualifier,,,D8 Date Expressed in Format CCYYMMDD,,,,,,,,,
2000B,2000B.PAT06,Date Time Period,,,,,,,,,,,,
2000B,2000B.PAT07,Unit or Basis for Measurement Code,,,01 Actual Pounds,,,,,,,,,
2000B,2000B.PAT08,Weight,,,,,,,,,,,,
2000B,2000B.PAT09,Yes/No Condition or Response Code,,,Y Yes,,,,,,,,,
LOOP 2010BA - SUBSCRIBER NAME,,,,,,,,,,,,,,
2010BA,NM1,Subscriber Name (Required),,R,,,,,,,,,,
2010BA,2010BA.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,IL Insured or Subscriber,"Hardcode as ""IL""",,,,,,,,
2010BA,2010BA.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,"1 Person
2 Non-Person Entity","Hardcode as ""1""",,,,,,,,
2010BA,2010BA.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,SUB_LAST_NAME,SUB_LAST_NAME,243,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/subscriberInformation/individual/lastName,
2010BA,2010BA.NM104,Name First,Individual first name,S,,SUB_FIRST_NAME,SUB_FIRST_NAME,244,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/subscriberInformation/individual/firstName,
2010BA,2010BA.NM105,Name Middle,Individual middle name or initial,S,,SUB_MIDDLE_NAME,SUB_MIDDLE_NAME,245,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/subscriberInformation/individual/middleName,
2010BA,2010BA.NM107,Name Suffix,Suffix to individual name,SS,,SUB_NAME_SUFFIX,SUB_NAME_SUFFIX,246,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/subscriberInformation/individual/nameSuffix,
2010BA,2010BA.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),R,"II Standard Unique Health Identifier for each Individual
in the United States
MI Member Identification Number","Hardcode as ""MI""",,,,,,,,
2010BA,2010BA.NM109,Identification Code,Code identifying a party or other code,R,,SUB_ID,SUB_ID,3,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/subscriptionInformation/hccId,
2010BA,N3,Subscriber Address,,S,,,,,,,,,,
2010BA,2010BA.N301,Address Information,Address information,R,,SUB_ADDRESS_1,SUB_ADDRESS_01,247,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/subscriptionInformation/correspondenceAddress/address,
2010BA,2010BA.N302,Address Information,Address information,S,,SUB_ADDDRESS_2,SUB_ADDDRESS_02,248,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/subscriptionInformation/correspondenceAddress/address2,
2010BA,N4,"Subscriber City, State, ZIP Code",,R,,,,,,,,,,
2010BA,2010BA.N401,City Name,Free-form text for city name,R,,SUB_CITY,SUB_CITY,249,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/subscriptionInformation/correspondenceAddress/city,
2010BA,2010BA.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,SUB_STATE,SUB_STATE,250,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/subscriptionInformation/correspondenceAddress/stateCode,
2010BA,2010BA.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,(SUB_ZIP) + ( SUB_ZIP_PLUS_4),(SUB_ZIP) + ( SUB_ZIP_PLUS_FOUR),251 + 252,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/subscriptionInformation/correspondenceAddress/zipCode + ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/subscriptionInformation/correspondenceAddress/zipExtension,
2010BA,2010BA.N404,Country Code,Code identifying the country,S,,Leave it blank,,253,Claim,,,"I checked in OB Payment. Seems Country Code is not displaying in EDI. As we do not have any logic with Country Code and we are blocked with this issue (Snip Validation Error while translating with the Value as US), we can remove the Country Code mapping",ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/subscriptionInformation/correspondenceAddress/countryCode,
2010BA,2010BA.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,,,,,
2010BA,DMG,Subscriber Demographic Information,,S,,,,,,,,,,
2010BA,2010BA.DMG01,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,,
2010BA,2010BA.DMG02,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,SUB_DOB,SUB_DOB,255,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/subscriptionInformation/subscriber/birthdate,
2010BA,2010BA.DMG03,Gender Code,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,"F Female
M Male
U Unknown",SUB_GENDER_ID,SUB_GENDER_ID,256,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/subscriptionInformation/subscriber/genderCode,
2010BA,REF,Subscriber Secondary Identification,,,,,,,,,,,,
2010BA,2010BA.REF01,Reference Identification Qualifier,,,SY Social Security Number,,,,,,,,,
2010BA,2010BA.REF02,Reference Identification,,,,,,,,,,,,
2010BA,REF,Property and Casualty Claim Number,,,,,,,,,,,,
2010BA,2010BA.REF01,Reference Identification Qualifier,,,Y4 Agency Claim Number,,,,,,,,,
2010BA,2010BA.REF02,Reference Identification,,,,,,,,,,,,
2010BA,PER,Property and Casualty Subscriber Contact Information,,,,,,,,,,,,
2010BA,2010BA.PER01,Contact Function Code,,,IC Information Contact,,,,,,,,,
2010BA,2010BA.PER02,Name,,,,,,,,,,,,
2010BA,2010BA.PER03,Communication Number Qualifier,,,TE Telephone,,,,,,,,,
2010BA,2010BA.PER04,Communication Number,,,,,,,,,,,,
2010BA,2010BA.PER05,Communication Number Qualifier,,,EX Telephone Extension,,,,,,,,,
2010BA,2010BA.PER06,Communication Number,,,,,,,,,,,,
LOOP 2010BB - PAYER NAME,,,,,,,,,,,,,,
2010BB,NM1,Payer Name (Required),,R,,,,,,,,,,
2010BB,2010BB.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,PR Payer,"Hardcode as ""PR""",,,,,,,,
2010BB,2010BB.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,2 Non-Person Entity,"Hardcode as ""2""",,,,,,,,
2010BB,2010BB.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,Product,,,,,Yes,Configurable value for Implementation team,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/payerInformation/hicName,
2010BB,2010BB.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),R,"PI Payor Identification
XV Centers for Medicare and Medicaid Services PlanID","Hardcode as ""PI""",,,,,,,,
2010BB,2010BB.NM109,Identification Code,Code identifying a party or other code,R,,"Default value ""1234567""",,,,,Yes,"Configurable value for Implementation team
updated default values",ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/payerInformation/taxId,
2010BB,N3,Payer Address,,S,,,,,,,,,,
2010BB,2010BB.N301,Address Information,Address Information,R,,"Hardcode as ""XXXX""",,,,,,Not found In hrdw . Hence hardcode,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/payerInformation/hicAddress/address,
2010BB,2010BB.N302,Address Information,Address Information,S,,,,,,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/payerInformation/hicAddress/address2,
2010BB,N4,"Payer City, State, ZIP Code",,R,,,,,,,,,,
2010BB,2010BB.N401,City Name,Free-form text for city name,R,,"Default value as ""Product""",,,,,,Configurable value for Implementation team. Random values updated,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/payerInformation/hicAddress/city,
2010BB,2010BB.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,"Default  value as ""CO""",,,,,,Configurable value for Implementation team. Random values updated,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/payerInformation/hicAddress/stateCode,
2010BB,2010BB.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,"Default  value as ""CO""",,,,,,Configurable value for Implementation team. Random values updated,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/payerInformation/hicAddress/zipCode + ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/payerInformation/hicAddress/zipExtension,
2010BB,2010BB.N404,Country Code,Code identifying the country,S,,Leave it blank,,,,,,"Configurable value for Implementation team. Random values updated
20/6/2024: CO cannot be hardcoded as it is not a valid value. So leaving it Blank",ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/payerInformation/hicAddress/countryCode,
2010BB,2010BB.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,,,,,
2010BB,REF,Payer Secondary Identification,,S,,,,,,,,,,
2010BB,2010BB.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"2U Payer Identification Number
EI Employer’s Identification Number
FY Claim Office Number
NF National Association of Insurance Commissioners
(NAIC) Code",,,,,,,,,
2010BB,2010BB.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,,,
LOOP 2000C - PATIENT HIERARCHICAL LEVEL,,,,,,,,,,,,,,
2000C,HL,Patient Hierarchical Level,,S,,,,,,,,,,
2000C,2000C.HL01,Hierarchical ID Number,,,,System Generated,System Generated,,,,,,,
2000C,2000C.HL02,Hierarchical Parent ID Number,,,,2000B.HL01,2000B.HL01,,,,,,,
2000C,2000C.HL03,Hierarchical Level Code,,,23 Dependent,"Hardcode as ""23""",23,,,,,,,
2000C,2000C.HL04,Hierarchical Child Code,,,"0 No Subordinate HL Segment in This Hierarchical
Structure.","Hardcode as ""0""",0,,,,,,,
2000C,PAT,Patient Information (Required),,R,,,,,,,,,,
2000C,2000C.PAT01,Individual Relationship Code,Code indicating the relationship between two individuals or entities,R,"01 Spouse
19 Child
20 Employee
21 Unknown
39 Organ Donor
40 Cadaver Donor
53 Life Partner
G8 Other Relationship",RELATIONSHIP_TO_SUB,RELATIONSHIP_TO_SUB,16,Claim,Generate 2000C loop only if  RELATIONSHIP_TO_SUB   is not 18,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/patientInformation/relationshipToSubscriber,
2000C,2000C.PAT05,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",S,D8 Date Expressed in Format CCYYMMDD,,,,,,,,,
2000C,2000C.PAT06,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",S,,,,,,,,,,
2000C,2000C.PAT07,Unit or Basis for Measurement Code,"Code specifying the units in which a value is being expressed, or manner in which a measurement has been taken",S,01 Actual Pounds,,,,,,,,,
2000C,2000C.PAT08,Weight,Numeric value of weight,S,,,,,,,,,,
2000C,2000C.PAT09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,Y Yes,,,,,,,,,
LOOP 2010CA - PATIENT NAME,,,,,,,,,,,,,,
2010CA,NM1,Patient Name (Required),,R,,,,,,,,,,
2010CA,2010CA.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,QC Patient,"Hardcode as ""QC""",,,,,,,,
2010CA,2010CA.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,1 Person,"Hardcode as ""1""",,,,,,,,
2010CA,2010CA.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,PATIENT_LAST_NAME,PATIENT_LAST_NAME,12,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/memberInformation/individual/lastName,
2010CA,2010CA.NM104,Name First,Individual first name,S,,PATIENT_FIRST_NAME,PATIENT_FIRST_NAME,13,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/memberInformation/individual/firstName,
2010CA,2010CA.NM105,Name Middle,Individual middle name or initial,S,,PATIENT_MIDDLE_NAME,PATIENT_MIDDLE_NAME,14,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/memberInformation/individual/middleName,
2010CA,2010CA.NM107,Name Suffix,Suffix to individual name,S,,PATIENT_NAME_SUFFIX,PATIENT_NAME_SUFFIX,15,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/memberInformation/individual/nameSuffix,
2010CA,N3,Patient Address (Required),,R,,,,,,,,,,
2010CA,2010CA.N301,Address Information,Address information,R,,PATIENT_ADDRESS_1,PATIENT_ADDRESS_01,258,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/patientInformation/correspondenceAddress/address,
2010CA,2010CA.N302,Address Information,Address information,S,,PATIENT_ADDRESS_2,PATIENT_ADDRESS_02,259,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/patientInformation/correspondenceAddress/address2,
2010CA,N4,"Patient City, State, ZIP Code (Required)",,R,,,,,,,,,,
2010CA,2010CA.N401,City Name,Free-form text for city name,R,,PATIENT_CITY,PATIENT_CITY,260,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/patientInformation/correspondenceAddress/city,
2010CA,2010CA.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,PATIENT_STATE,PATIENT_STATE,261,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/patientInformation/correspondenceAddress/stateCode,
2010CA,2010CA.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,(PATIENT_ZIP) + (PATIENT_ZIP_PLUS_4),(PATIENT_ZIP) + (PATIENT_ZIP_PLUS_FOUR),262 + 263,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/patientInformation/correspondenceAddress/zipCode + ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/patientInformation/correspondenceAddress/zipExtension,
2010CA,2010CA.N404,Country Code,Code identifying the country,S,,Leave it blank,,264,Claim,,,"I checked in OB Payment. Seems Country Code is not displaying in EDI. As we do not have any logic with Country Code and we are blocked with this issue (Snip Validation Error while translating with the Value as US), we can remove the Country Code mapping",ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/patientInformation/correspondenceAddress/countyCode,
2010CA,2010CA.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,,,,,
2010CA,DMG,Patient Demographic Information (Required),,R,,,,,,,,,,
2010CA,2010CA.DMG01,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,,
2010CA,2010CA.DMG02,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,PATIENT_DOB,PATIENT_DOB,5,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/patientInformation/member/birthdate,
2010CA,2010CA.DMG03,Gender Code,Code indicating the sex of the individual,R,"F Female
M Male
U Unknown",PATIENT_GENDER_ID,PATIENT_GENDER_ID,6,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/patientInformation/member/genderCode,
2010CA,REF,Property and Casualty Claim Number,,,,,,,,,,,,
2010CA,2010CA.REF01,Reference Identification Qualifier,,,Y4 Agency Claim Number,,,,,,,,,
2010CA,2010CA.REF02,Reference Identification,,,,,,,,,,,,
2010CA,REF,Property and Casualty Patient Identifier,,,,,,,,,,,,
2010CA,2010CA.REF01,Reference Identification Qualifier,,,,,,,,,,,,
2010CA,2010CA.REF02,Reference Identification,,,,,,,,,,,,
2010CA,PER,Property and Casualty Patient Contact Information,,,,,,,,,,,,
2010CA,2010CA.PER01,Contact Function Code,,,IC Information Contact,,,,,,,,,
2010CA,2010CA.PER02,Name,,,,,,,,,,,,
2010CA,2010CA.PER03,Communication Number Qualifier,,,TE Telephone,,,,,,,,,
2010CA,2010CA.PER04,Communication Number,,,,,,,,,,,,
2010CA,2010CA.PER05,Communication Number Qualifier,,,EX Telephone Extension,,,,,,,,,
2010CA,2010CA.PER06,Communication Number,,,,,,,,,,,,
LOOP 2300- Required,,,,,,,,,,,,,,
2300,CLM,Claim Information (Required),,R,,,,,,,,,,
2300,2300.CLM01,Claim Submitter's Identifier,Identifier used to track a claim from creation by the health care provider through payment,R,,PATIENT_CONTROL_NUM,PATIENT_CONTROL_NUM,11,Claim,,,,,
2300,2300.CLM02,Monetary Amount,Monetary amount,R,,CLAIM_BILLED_AMOUNT,CLAIM_BILLED_AMOUNT,208,Claim,,,,,
2300,2300.CLM05.01,Facility Code Value,"Code identifying where services were, or may be, performed; the first and second positions of the Uniform Bill Type Code for Institutional Services or the Place of Service Codes for Professional or Dental Services.",R,,POS_ID,PLACE_OF_SERVICE,144,Line,,,,,
2300,2300.CLM05.02,Facility Code Qualifier,Code identifying the type of facility referenced,R,B : Place of Service Codes for Professional or Dental Services,"Hardcode as ""B""",,,,,,,,
2300,2300.CLM05.03,Claim Frequency Type Code,Code specifying the frequency of the claim; this is the third position of the Uniform Billing Claim Form Bill Type,R,,CLAIM_FREQUENCY_CODE,CLAIM_FREQUENCY_CODE,426,Claim,,,,,
2300,2300.CLM06,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,R,"N No
Y Yes",PROVIDER_SIGNATURE_PRESENT,PROVIDER_SIGNATURE_PRESENT,504,Claim,,,,,
2300,2300.CLM07,Provider Accept Assignment Code,Code indicating whether the provider accepts assignment,R,"A Assigned
B Assignment Accepted on Clinical Lab Services Only
C Not Assigned",ASSIGNMENT_ACCEPTANCE,ASSIGNMENT_ACCEPTANCE,505,Claim,"If the 2300.CLM07 Enumuration Value is ""A"" display ""Y""
If the 2300.CLM07 Enumuration Value is ""C"" display ""N""",,"""Y"" and ""N"" are the valid values. So the below logic to be followed
Maps assignment acceptance as ""Y"" for ""A"" and ""N"" for ""C""
if(Fields[4] == ""A"")
{
	Fields[4] = ""Y"";
}
else if (Fields[4] == ""C"")
{
	Fields[4] = ""N"";
}",,
2300,2300.CLM08,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,R,"N No
W Not Applicable
Y Yes",ASSIGNMENT_OF_BENEFITS,ASSIGNMENT_OF_BENEFITS,207,Claim,,,,,
2300,2300.CLM09,Release of Information Code,Code indicating whether the provider has on file a signed statement by the patient authorizing the release of medical data to other organizations,R,"I Informed Consent to Release Medical Information for Conditions or Diagnoses Regulated by Federal Statutes
Y Yes, Provider has a Signed Statement Permitting
Release of Medical Billing Data Related to a Claim",INFORMATION_RELEASE,INFORMATION_RELEASE,506,Claim,,,,,
2300,2300.CLM10,Patient Signature Source Code,Code indicating how the patient or subscriber authorization signatures were obtained and how they are being retained by the provider,S,P Signature generated by provider because the patient was not physically present for services,,,,,,,,,
2300,2300.CLM11.01,Related-Causes Code,"Code identifying an accompanying cause of an illness, injury or an acciden",R,"AA Auto Accident
EM Employment
 OA Other Accident",,,,,,,,,
2300,2300.CLM11.02,Related-Causes Code,"Code identifying an accompanying cause of an illness, injury or an
accident",S,,,,,,,,,,
2300,2300.CLM11.04,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,,,,,,,,
2300,2300.CLM11.05,Country Code,Code identifying the country,S,,,,,,,,,,
2300,2300.CLM12,Special Program Code,Code indicating the Special Program under which the services rendered to the patient were performed,S,"02 Physically Handicapped Children’s Program
03 Special Federal Funding
 05 Disability
 09 Second Opinion or Surgery 492 This code is used for Medicaid claims only",,,,,,,,,
2300,2300.CLM20,Delay Reason Code,Code indicating the reason why a request was delayed,S,"1 Proof of Eligibility Unknown or Unavailable
2 Litigation
3 Authorization Delays
4 Delay in Certifying Provider
5 Delay in Supplying Billing Forms
6 Delay in Delivery of Custom-made Appliances
7 Third Party Processing Delay
8 Delay in Eligibility Determination
9 Original Claim Rejected or Denied Due to a Reason Unrelated to the Billing Limitation Rules
10 Administration Delay in the Prior Approval Process
11 Other
15 Natural Disaster",,,,,,,,,
2300,DTP,Onset of Current Illness or Symptom (Situational),,,,,,,,,,,,
2300,2300.DTP01,Date/Time Qualifier,,,,,,,,,,,,
2300,2300.DTP02,Date Time Period Format Qualifier,,,,,,,,,,,,
2300,2300.DTP03,Date Time Period,,,,,,,,,,,,
2300,DTP,Initial Treatment Date (Situational),,,,,,,,,,,,
2300,2300.DTP01,Date/Time Qualifier,,,,,,,,,,,,
2300,2300.DTP02,Date Time Period Format Qualifier,,,,,,,,,,,,
2300,2300.DTP03,Date Time Period,,,,,,,,,,,,
2300,DTP,Last Seen Date (Situational),,,,,,,,,,,,
2300,2300.DTP01,Date/Time Qualifier,,,,,,,,,,,,
2300,2300.DTP02,Date Time Period Format Qualifier,,,,,,,,,,,,
2300,2300.DTP03,Date Time Period,,,,,,,,,,,,
2300,DTP,Acute Manifestation (Situational),,,,,,,,,,,,
2300,2300.DTP01,Date/Time Qualifier,,,,,,,,,,,,
2300,2300.DTP02,Date Time Period Format Qualifier,,,,,,,,,,,,
2300,2300.DTP03,Date Time Period,,,,,,,,,,,,
2300,DTP,Accident (Situational),,,,,,,,,,,,
2300,2300.DTP01,Date/Time Qualifier,,,,,,,,,,,,
2300,2300.DTP02,Date Time Period Format Qualifier,,,,,,,,,,,,
2300,2300.DTP03,Date Time Period,,,,,,,,,,,,
2300,DTP,Last Menstrual Period (Situational),,,,,,,,,,,,
2300,2300.DTP01,Date/Time Qualifier,,,,,,,,,,,,
2300,2300.DTP02,Date Time Period Format Qualifier,,,,,,,,,,,,
9,2300.DTP03,Date Time Period,,,,,,,,,,,,
2300,DTP,Last X-ray Date (Situational),,,,,,,,,,,,
2300,2300.DTP01,Date/Time Qualifier,,,,,,,,,,,,
2300,2300.DTP02,Date Time Period Format Qualifier,,,,,,,,,,,,
2300,2300.DTP03,Date Time Period,,,,,,,,,,,,
2300,DTP,Hearing and Vision Prescription Date (Situational),,,,,,,,,,,,
2300,2300.DTP01,Date/Time Qualifier,,,,,,,,,,,,
2300,2300.DTP02,Date Time Period Format Qualifier,,,,,,,,,,,,
2300,2300.DTP03,Date Time Period,,,,,,,,,,,,
2300,DTP,Disability Dates (Situational),,,,,,,,,,,,
2300,2300.DTP01,Date/Time Qualifier,,,,,,,,,,,,
2300,2300.DTP02,Date Time Period Format Qualifier,,,,,,,,,,,,
2300,2300.DTP03,Date Time Period,,,,,,,,,,,,
2300,DTP,Last Worked (Situational),,,,,,,,,,,,
2300,2300.DTP01,Date/Time Qualifier,,,,,,,,,,,,
2300,2300.DTP02,Date Time Period Format Qualifier,,,,,,,,,,,,
2300,2300.DTP03,Date Time Period,,,,,,,,,,,,
2300,DTP,Authorized Return to Work (Situational),,,,,,,,,,,,
2300,2300.DTP01,Date/Time Qualifier,,,,,,,,,,,,
2300,2300.DTP02,Date Time Period Format Qualifier,,,,,,,,,,,,
2300,2300.DTP03,Date Time Period,,,,,,,,,,,,
2300,DTP,DTP Date - Admission (Situational),,,,,,,,,,,,
2300,2300.DTP01,Date/Time Qualifier,,,,,,,,,,,,
2300,2300.DTP02,Date Time Period Format Qualifier,,,,,,,,,,,,
2300,2300.DTP03,Date Time Period,,,,,,,,,,,,
2300,DTP,Discharge (Situational),,,,,,,,,,,,
2300,2300.DTP01,Date/Time Qualifier,,,,,,,,,,,,
2300,2300.DTP02,Date Time Period Format Qualifier,,,,,,,,,,,,
2300,2300.DTP03,Date Time Period,,,,,,,,,,,,
2300,DTP,Assumed and Relinquished Care Dates (Situational),,,,,,,,,,,,
2300,2300.DTP01,Date/Time Qualifier,,,,,,,,,,,,
2300,2300.DTP02,Date Time Period Format Qualifier,,,,,,,,,,,,
2300,2300.DTP03,Date Time Period,,,,,,,,,,,,
2300,DTP,Property and Casualty Date of First Contact (Situational),,,,,,,,,,,,
2300,2300.DTP01,Date/Time Qualifier,,,,,,,,,,,,
2300,2300.DTP02,Date Time Period Format Qualifier,,,,,,,,,,,,
2300,2300.DTP03,Date Time Period,,,,,,,,,,,,
2300,DTP,Repricer Received Date (Situational),,,,,,,,,,,,
2300,2300.DTP01,Date/Time Qualifier,,,,,,,,,,,,
2300,2300.DTP02,Date Time Period Format Qualifier,,,,,,,,,,,,
2300,2300.DTP03,Date Time Period,,,,,,,,,,,,
2300,PWK,Claim Supplemental Information (Situational),,,,,,,,,,,,
2300,2300.PWK01,Report Type Code,,,,,,,,,,,,
2300,2300.PWK02,Report Transmission Code,,,,,,,,,,,,
2300,2300.PWK05,Identification Code Qualifier,,,,,,,,,,,,
2300,2300.PWK06,Identification Code,,,,,,,,,,,,
2300,CN1,Contract Information (Situational),,,,,,,,,,,,
2300,2300.CN101,Contract Type Code,,,,,,,,,,,,
2300,2300.CN102,Monetary Amount,,,,,,,,,,,,
2300,2300.CN103,"Percent, Decimal Format",,,,,,,,,,,,
2300,2300.CN104,Reference Identification,,,,,,,,,,,,
2300,2300.CN105,Terms Discount Percent,,,,,,,,,,,,
2300,2300.CN106,Version Identifier,,,,,,,,,,,,
2300,AMT,Patient Amount Paid (Situational),,,,,,,,,,,,
2300,2300.AMT01,Amount Qualifier Code,,,,,,,,,,,,
2300,2300.AMT02,Monetary Amount,,,,,,,,,,,,
2300,REF,Service Authorization Exception Code (Situational),,,,,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,,,,,,,,,,,,
2300,2300.REF02,Reference Identification,,,,,,,,,,,,
2300,REF,Mandatory Medicare (Section 4081) Crossover Indicator (Situational),,,,,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,,,,,,,,,,,,
2300,2300.REF02,Reference Identification,,,,,,,,,,,,
2300,REF,Mammography Certification Number (Situational),,,,,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,,,,,,,,,,,,
2300,2300.REF02,Reference Identification,,,,,,,,,,,,
2300,REF,Referral Number (Situational),,,,,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,,,,,,,,,,,,
2300,2300.REF02,Reference Identification,,,,,,,,,,,,
2300,REF,Prior Authorization (Situational),,S,,,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,G1 Prior Authorization Number,,,,,,,,,
2300,2300.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,,,
2300,REF,Payer Claim Control Number (Situational),,S,,,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,F8 Original Reference Number,"Hardcode as ""F8""",,,,,,,,
2300,2300.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,CLAIM_ID_ORIG,CLAIM_ID_ORIG,237,Claim,"Map only for
 void/replacement claims (2300.CLM05.03 = '7' or '8'
Deepthi(30/7):
Map only for replacement claims (2300.CLM05.03 = '7')",,,,
2300,REF,Clinical Laboratory Improvement Amendment (CLIA) Number (Situational),,S,,,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,,,,,,,,,,,
2300,2300.REF02,Reference Identification,,,,,,,,,,,,
2300,REF,Repriced Claim Number (Situational),,,,,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,,,,,,,,,,,,
2300,2300.REF02,Reference Identification,,,,,,,,,,,,
2300,REF,Adjusted Repriced Claim Number (Situational),,,,,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,,,,,,,,,,,,
2300,2300.REF02,Reference Identification,,,,,,,,,,,,
2300,REF,Investigational Device Exemption Number (Situational),,,,,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,,,,,,,,,,,,
2300,2300.REF02,Reference Identification,,,,,,,,,,,,
2300,REF,Claim Identifier For Transmission Intermediaries (Situational),,S,,,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,D9 Claim Number,"Hardcode as ""D9""",,,,,,,,
2300,2300.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,CLAIM_ID,CLAIM_ID,19,Claim,,,,,
2300,REF,Medical Record Number (Situational),,S,,,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,EA Medical Record Identification Number,"Hardcode as ""EA""",,,,,,,,
2300,2300.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,MED_REC_NO,MED_REC_NO,21,Claim,,,,,
2300,REF,Demonstration Project Identifier (Situational),,,,,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,,,,,,,,,,,,
2300,2300.REF02,Reference Identification,,,,,,,,,,,,
2300,REF,Care Plan Oversight (Situational),,,,,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,,,,,,,,,,,,
2300,2300.REF02,Reference Identification,,,,,,,,,,,,
2300,K3,File Information (Situational),,,,,,,,,,,,
2300,2300.K301,Fixed Format Information,,,,,,,,,,,,
2300,NTE,Claim Note (Situational),,,,,,,,,,,,
2300,2300.NTE01,Note Reference Code,,,,,,,,,,,,
2300,2300.NTE02,Description,,,,,,,,,,,,
2300,CR1,Ambulance Transport Information (Situational),,,,,,,,,,,,
2300,2300.CR101,Unit or Basis for Measurement Code,,,,,,,,,,,,
2300,2300.CR102,Weight,,,,,,,,,,,,
2300,2300.CR104,Ambulance Transport Reason Code,,,,,,,,,,,,
2300,2300.CR105,Unit or Basis for Measurement Code,,,,,,,,,,,,
2300,2300.CR106,Quantity,,,,,,,,,,,,
2300,2300.CR109,Description,,,,,,,,,,,,
2300,2300.CR110,Description,,,,,,,,,,,,
2300,CR2,Spinal Manipulation Service Information (Situational),,,,,,,,,,,,
2300,2300.CR208,Nature of Condition Code,,,,,,,,,,,,
2300,2300.CR210,Description,,,,,,,,,,,,
2300,2300.CR211,Description,,,,,,,,,,,,
2300,CRC,Ambulance Certification (Situational),,,,,,,,,,,,
2300,2300.CRC01,Code Category,,,,,,,,,,,,
2300,2300.CRC02,Yes/No Condition or Response Code,,,,,,,,,,,,
2300,2300.CRC03,Condition Indicator,,,,,,,,,,,,
2300,2300.CRC04,Condition Indicator,,,,,,,,,,,,
2300,2300.CRC05,Condition Indicator,,,,,,,,,,,,
2300,2300.CRC06,Condition Indicator,,,,,,,,,,,,
2300,2300.CRC07,Condition Indicator,,,,,,,,,,,,
2300,CRC,Patient Condition Information: Vision (Situational),,,,,,,,,,,,
2300,2300.CRC01,Code Category,,,,,,,,,,,,
2300,2300.CRC02,Yes/No Condition or Response Code,,,,,,,,,,,,
2300,2300.CRC03,Condition Indicator,,,,,,,,,,,,
2300,2300.CRC04,Condition Indicator,,,,,,,,,,,,
2300,2300.CRC05,Condition Indicator,,,,,,,,,,,,
2300,2300.CRC06,Condition Indicator,,,,,,,,,,,,
2300,2300.CRC07,Condition Indicator,,,,,,,,,,,,
2300,CRC,Homebound Indicator (Situational),,,,,,,,,,,,
2300,2300.CRC01,Code Category,,,,,,,,,,,,
2300,2300.CRC02,Yes/No Condition or Response Code,,,,,,,,,,,,
2300,2300.CRC03,Condition Indicator,,,,,,,,,,,,
2300,CRC,EPSDT Referral (Situational),,,,,,,,,,,,
2300,2300.CRC01,Code Category,,,,,,,,,,,,
2300,2300.CRC02,Yes/No Condition or Response Code,,,,,,,,,,,,
2300,2300.CRC03,Condition Indicator,,,,,,,,,,,,
2300,2300.CRC04,Condition Indicator,,,,,,,,,,,,
2300,2300.CRC05,Condition Indicator,,,,,,,,,,,,
2300,HI,Health Care Diagnosis Code (Required),,R,,,,,,,,,,
2300,2300.HI01.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABK International Classification of Diseases Clinical Modification (ICD-10-CM) Principal Diagnosis
BK International Classification of Diseases Clinical
Modification (ICD-9-CM) Principal Diagnosis","Hardcode as ""ABK""",,,,,,,,
2300,2300.HI01.02,Industry Code,Code indicating a code from a specific industry code list,R,,DIAGNOSIS_CODE_1,DIAGNOSIS_CODE_01,23,CLaim,,,,,
2300,2300.HI02.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,,,
2300,2300.HI02.02,Industry Code,Code indicating a code from a specific industry code list,R,,DIAGNOSIS_CODE_2,DIAGNOSIS_CODE_02,25,CLaim,,,,,
2300,2300.HI03.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,,,
2300,2300.HI03.02,Industry Code,Code indicating a code from a specific industry code list,R,,DIAGNOSIS_CODE_3,DIAGNOSIS_CODE_03,27,CLaim,,,,,
2300,2300.HI04.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,,,
2300,2300.HI04.02,Industry Code,Code indicating a code from a specific industry code list,R,,DIAGNOSIS_CODE_4,DIAGNOSIS_CODE_04,29,CLaim,,,,,
2300,2300.HI05.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,,,
2300,2300.HI05.02,Industry Code,Code indicating a code from a specific industry code list,R,,DIAGNOSIS_CODE_5,DIAGNOSIS_CODE_05,31,CLaim,,,,,
2300,2300.HI06.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,,,
2300,2300.HI06.02,Industry Code,Code indicating a code from a specific industry code list,R,,DIAGNOSIS_CODE_6,DIAGNOSIS_CODE_06,33,CLaim,,,,,
2300,2300.HI07.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,,,
2300,2300.HI07.02,Industry Code,Code indicating a code from a specific industry code list,R,,DIAGNOSIS_CODE_7,DIAGNOSIS_CODE_07,35,CLaim,,,,,
2300,2300.HI08.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,,,
2300,2300.HI08.02,Industry Code,Code indicating a code from a specific industry code list,R,,DIAGNOSIS_CODE_8,DIAGNOSIS_CODE_08,37,CLaim,,,,,
2300,2300.HI09.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,,,
2300,2300.HI09.02,Industry Code,Code indicating a code from a specific industry code list,R,,DIAGNOSIS_CODE_9,DIAGNOSIS_CODE_09,39,CLaim,,,,,
2300,2300.HI10.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,,,
2300,2300.HI10.02,Industry Code,Code indicating a code from a specific industry code list,R,,DIAGNOSIS_CODE_10,DIAGNOSIS_CODE_10,41,CLaim,,,,,
2300,2300.HI11.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,,,
2300,2300.HI11.02,Industry Code,Code indicating a code from a specific industry code list,R,,DIAGNOSIS_CODE_11,DIAGNOSIS_CODE_11,43,CLaim,,,,,
2300,2300.HI12.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,,,
2300,2300.HI12.02,Industry Code,Code indicating a code from a specific industry code list,R,,DIAGNOSIS_CODE_12,DIAGNOSIS_CODE_12,45,CLaim,,,,,
2300,2300.HI13.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,,,
2300,2300.HI13.02,Industry Code,Code indicating a code from a specific industry code list,R,,DIAGNOSIS_CODE_13,DIAGNOSIS_CODE_13,47,CLaim,,,,,
2300,HI,Anesthesia Related Procedure (Situational),,,,,,,,,,,,
2300,2300.HI01.01,Code List Qualifier Code,,,,,,,,,,,,
2300,2300.HI01.02,Industry Code,,,,,,,,,,,,
2300,2300.HI02.01,Code List Qualifier Code,,,,,,,,,,,,
2300,2300.HI02.02,Industry Code,,,,,,,,,,,,
2300,HI,Condition Information (Situational),,,,,,,,,,,,
2300,2300.HI01.01,Code List Qualifier Code,,,BG - Condition,,,,,,,,,
2300,2300.HI01.02,Industry Code,,,,,,,,,,,,
2300,2300.HI02.01,Code List Qualifier Code,,,BG - Condition,,,,,,,,,
2300,2300.HI02.02,Industry Code,,,,,,,,,,,,
2300,2300.HI03.01,Code List Qualifier Code,,,BG - Condition,,,,,,,,,
2300,2300.HI03.02,Industry Code,,,,,,,,,,,,
2300,2300.HI04.01,Code List Qualifier Code,,,BG - Condition,,,,,,,,,
2300,2300.HI04.02,Industry Code,,,,,,,,,,,,
2300,2300.HI05.01,Code List Qualifier Code,,,BG - Condition,,,,,,,,,
2300,2300.HI05.02,Industry Code,,,,,,,,,,,,
2300,2300.HI06.01,Code List Qualifier Code,,,BG - Condition,,,,,,,,,
2300,2300.HI06.02,Industry Code,,,,,,,,,,,,
2300,2300.HI07.01,Code List Qualifier Code,,,BG - Condition,,,,,,,,,
2300,2300.HI07.02,Industry Code,,,,,,,,,,,,
2300,2300.HI08.01,Code List Qualifier Code,,,BG - Condition,,,,,,,,,
2300,2300.HI08.02,Industry Code,,,,,,,,,,,,
2300,2300.HI09.01,Code List Qualifier Code,,,BG - Condition,,,,,,,,,
2300,2300.HI09.02,Industry Code,,,,,,,,,,,,
2300,2300.HI10.01,Code List Qualifier Code,,,BG - Condition,,,,,,,,,
2300,2300.HI10.02,Industry Code,,,,,,,,,,,,
2300,2300.HI11.01,Code List Qualifier Code,,,BG - Condition,,,,,,,,,
2300,2300.HI11.02,Industry Code,,,,,,,,,,,,
2300,2300.HI12.01,Code List Qualifier Code,,,BG - Condition,,,,,,,,,
2300,2300.HI12.02,Industry Code,,,,,,,,,,,,
2300,HCP,Claim Pricing/Repricing Information,,,,,,,,,,,,
2300,2300.HCP01,Pricing Methodology,,,"00 Zero Pricing (Not Covered Under Contract)
01 Priced as Billed at 100%
02 Priced at the Standard Fee Schedule
03 Priced at a Contractual Percentage
04 Bundled Pricing
05 Peer Review Pricing
07 Flat Rate Pricing
08 Combination Pricing
09 Maternity Pricing
10 Other Pricing
11 Lower of Cost
12 Ratio of Cost
13 Cost Reimbursed
14 Adjustment Pricing",,,,,,,,,
2300,2300.HCP02,Monetary Amount,,,,,,,,,,,,
2300,2300.HCP03,Monetary Amount,,,,,,,,,,,,
2300,2300.HCP04,Reference Identification,,,,,,,,,,,,
2300,2300.HCP05,Rate,,,,,,,,,,,,
2300,2300.HCP06,Reference Identification,,,,,,,,,,,,
2300,2300.HCP07,Monetary Amount,,,,,,,,,,,,
2300,2300.HCP13,Reject Reason Code,,,"T1 Cannot Identify Provider as TPO (Third Party
Organization) Participant
T2 Cannot Identify Payer as TPO (Third Party
Organization) Participant
T3 Cannot Identify Insured as TPO (Third Party
Organization) Participant
T4 Payer Name or Identifier Missing
T5 Certification Information Missing
T6 Claim does not contain enough information for repricing",,,,,,,,,
2300,2300.HCP14,Policy Compliance Code,,,"1 Procedure Followed (Compliance)
2 Not Followed - Call Not Made (Non-Compliance Call
Not Made)
3 Not Medically Necessary (Non-Compliance Non-
Medically Necessary)
4 Not Followed Other (Non-Compliance Other)
5 Emergency Admit to Non-Network Hospital",,,,,,,,,
2300,2300.HCP15,Exception Code,,,"1 Non-Network Professional Provider in Network
Hospital
2 Emergency Care
3 Services or Specialist not in Network
4 Out-of-Service Area
5 State Mandates
6 Other",,,,,,,,,
LOOP 2310A - REFERRING PROVIDER NAME,,,,,,,,,,,,,,
2310A,NM1,Referring Provider Name,,S,,,,,,,,,,
2310A,2310A.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,"DN Referring Provider
P3 Primary Care Provider","Hardcode as ""DN""",,,,,,,,
2310A,2310A.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,1 Person,"Hardcode as ""1""",,,,,,,,
2310A,2310A.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,REFERRING_LAST_NAME,REFERRING_LAST_NAME,288,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/referringInformation/practitioner/lastName,
2310A,2310A.NM104,Name First,Individual first name,S,,REFERRING_FIRST_NAME,REFERRING_FIRST_NAME,289,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/referringInformation/practitioner/firstName,
2310A,2310A.NM105,Name Middle,Individual middle name or initia,S,,REFERRING_MIDDLE_NAME,REFERRING_MIDDLE_NAME,290,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/referringInformation/practitioner/middleName,
2310A,2310A.NM107,Name Suffix,Suffix to individual name,S,,REFERRING_NAME_SUFFIX,REFERRING_NAME_SUFFIX,291,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/referringInformation/practitioner/nameSuffix,
2310A,2310A.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),S,XX Centers for Medicare and Medicaid Services National Provider Identifier,"Hardcode as ""XX""",,,,,,,,
2310A,2310A.NM109,Identification Code,Code identifying a party or other code,S,,REFERRING_NPI,REFERRING_NPI,283,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/referringInformation/NPI,
2310A,REF,Referring Provider Secondary Identification,,,,,,,,,,,,
2310A,2310A.REF01,Reference Identification Qualifier,,,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number",,,,,,,,,
2310A,2310A.REF02,Reference Identification,,,,,,,,,,,,
LOOP 2310B - RENDERING PROVIDER NAME,,,,,,,,,,,,,,
2310B,NM1,Rendering Provider Name,,S,,,,,,,,,,
2310B,2310B.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,82 Rendering Provider,"Hardcode as ""82""",82,,,,,,,
2310B,2310B.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,"1 Person
2 Non-Person Entity","Hardcode as ""1""",,,,,,,,
2310B,2310B.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,,,,If 2420A loop not exist,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/renderingPractitioner/practitioner/lastName,need to add logic in header and go head with line level
2310B,2310B.NM104,Name First,Individual first name,S,,,,,,If 2420A loop not exist,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/renderingPractitioner/practitioner/firstName,
2310B,2310B.NM105,Name Middle,Individual middle name or initia,S,,,,,,If 2420A loop not exist,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/renderingPractitioner/practitioner/middleName,
2310B,2310B.NM107,Name Suffix,Suffix to individual name,S,,,,,,If 2420A loop not exist,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/renderingPractitioner/practitioner/nameSuffix,
2310B,2310B.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),S,XX Centers for Medicare and Medicaid Services National Provider Identifier,"Hardcode as ""XX""",,,,,,,"Always Equals 'XX""",
2310B,2310B.NM109,Identification Code,Code identifying a party or other code,S,,,,,,if  Loop 2420A does not exist,,No claim level Redndering provider info available in HRP hence go with line level,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/renderingPractitioner/NPI,
2310B,PRV,Rendering Provider Specialty Information,,S,,,,,,,,,,
2310B,2310B.PRV01,Provider Code,Code identifying the type of provider,R,PE Performing,"Hardcode as ""PE""",PE,,,,,,,
2310B,2310B.PRV02,Reference Identification Qualifier,Code qualifying the Reference Identification,R,PXC Health Care Provider Taxonomy Code,"Hardcode as ""PXC""",,,,,,,,
2310B,2310B.PRV03,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,if  Loop 2420A does not exist,,No claim level Redndering provider info available in HRP hence go with line level,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/renderingPractitioner/primarySpecialty/taxonomyCode,
2310B,REF,Rendering Provider Secondary Identification,,,,,,,,,,,,
2310B,2310B.REF01,Reference Identification Qualifier,,,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number
LU Location Number",,,,,,,,,
2310B,2310B.REF02,Reference Identification,,,,,,,,,,,,
"LOOP 2310C - SERVICE FACILITY LOCATION
NAME",,,,,,,,,,,,,,
2310C,NM1,Service Facility Location Name,,S,,,,,,,,,,
2310C,2310C.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,77 Service Location,"Hardcode as ""77""",,,,,,,,
2310C,2310C.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,2 Non-Person Entity,"Hardcode as ""2""",,,,,,,,
2310C,2310C.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,Rendering_Facility_ Name,Rendering_Facility_ Name,507,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/renderingFacility/facilityName,
2310C,2310C.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),S,"XX Centers for Medicare and Medicaid Services
National Provider Identifier","Hardcode as ""XX""",,,,,,,,
2310C,2310C.NM109,Identification Code,Code identifying a party or other code,S,,Rendering_Facility_ NPI,Rendering_Facility_ NPI,508,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/renderingFacility/npi,
2310C,N3,Service Facility Location Address (Required),,R,,,,,,,,,,
2310C,2310C.N301,Address Information,Address information,R,,Rendering_Facility_ Address_1,Rendering_Facility_ Address_01,509,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/renderingFacility/address/address,
2310C,2310C.N302,Address Information,Address information,S,,Rendering_Facility_ Address_2,Rendering_Facility_ Address_02,510,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/renderingFacility/address/address2,
2310C,N4,"Service Facility Location City, State, ZIP Code (Required)",,R,,,,,,,,,,
2310C,2310C.N401,City Name,Free-form text for city name,R,,Rendering_Facility_ Address_City,Rendering_Facility_ Address_City,511,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/renderingFacility/address/city,
2310C,2310C.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,Rendering_Facility_ Address_State,Rendering_Facility_ Address_State,512,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/renderingFacility/address/stateCode,
2310C,2310C.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,Rendering_Facility_ Address_Zip + Rendering_Facility_ Addres_ZIP_PLUS_4,Rendering_Facility_ Address_Zip + Rendering_Facility_ Addres_ZIP_PLUS_Four,513,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/renderingFacility/address/zipCode + ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/renderingFacility/address/zipExtension,
2310C,2310C.N404,Country Code,Code identifying the country,S,,Leave it blank,,514,Claim,,,"I checked in OB Payment. Seems Country Code is not displaying in EDI. As we do not have any logic with Country Code and we are blocked with this issue (Snip Validation Error while translating with the Value as US), we can remove the Country Code mapping",ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/renderingFacility/address/countryCode,
2310C,2310C.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,,,,,
2310C,REF,Service Facility Location Secondary Identification,,,,,,,,,,,,
2310C,2310C.REF01,Reference Identification Qualifier,,,"0B State License Number
G2 Provider Commercial Number
LU Location Number",,,,,,,,,
2310C,2310C.REF02,Reference Identification,,,,,,,,,,,,
2310C,PER,Service Facility Contact Information,,,,,,,,,,,,
2310C,2310C.PER01,Contact Function Code,,,IC Information Contact,,,,,,,,,
2310C,2310C.PER02,Name,,,,,,,,,,,,
2310C,2310C.PER03,Communication Number Qualifier,,,TE Telephone,,,,,,,,,
2310C,2310C.PER04,Communication Number,,,,,,,,,,,,
2310C,2310C.PER05,Communication Number Qualifier,,,EX Telephone Extension,,,,,,,,,
2310C,2310C.PER06,Communication Number,,,,,,,,,,,,
LOOP 2310D - SUPERVISING PROVIDER NAME,,,,,,,,,,,,,,
2310D,NM1,Supervising Provider Name,,,,,,,,,,,,
2310D,2310D.NM101,Entity Identifier Code,,,DQ Supervising Physician,,,,,,,,,
2310D,2310D.NM102,Entity Type Qualifier,,,1 Person,,,,,,,,,
2310D,2310D.NM103,Name Last or Organization Name,,,,,,,,,,,,
2310D,2310D.NM104,Name First,,,,,,,,,,,,
2310D,2310D.NM105,Name Middle,,,,,,,,,,,,
2310D,2310D.NM107,Name Suffix,,,,,,,,,,,,
2310D,2310D.NM108,Identification Code Qualifier,,,"XX Centers for Medicare and Medicaid Services
National Provider Identifier",,,,,,,,,
2310D,2310D.NM109,Identification Code,,,,,,,,,,,,
2310D,REF,Supervising Provider Secondary Identification,,,,,,,,,,,,
2310D,2310D.REF01,Reference Identification Qualifier,,,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number
LU Location Number",,,,,,,,,
2310D,2310D.REF02,Reference Identification,,,,,,,,,,,,
LOOP 2310E - AMBULANCE PICK-UP LOCATION,,,,,,,,,,,,,,
2310E,NM1,Ambulance Pick-up Location,,,,,,,,,,,,
2310E,2310E.NM101,Entity Identifier Code,,,PW Pickup Address,,,,,,,,,
2310E,2310E.NM102,Entity Type Qualifier,,,2 Non-Person Entity,,,,,,,,,
2310E,N3,Ambulance Pick-up Location Address (Required),,,,,,,,,,,,
2310E,2310E.N301,Address Information,,,,,,,,,,,,
2310E,2310E.N302,Address Information,,,,,,,,,,,,
2310E,N4,"Ambulance Pick-up Location City, State, ZIP Code (Required)",,,,,,,,,,,,
2310E,2310E.N401,City Name,,,,,,,,,,,,
2310E,2310E.N402,State or Province Code,,,,,,,,,,,,
2310E,2310E.N403,Postal Code,,,,,,,,,,,,
2310E,2310E.N404,Country Code,,,,,,,,,,,,
2310E,2310E.N407,Country Subdivision Code,,,,,,,,,,,,
LOOP 2310F - AMBULANCE DROP-OFF LOCATION,,,,,,,,,,,,,,
2310F,NM1,Ambulance Drop-off Location,,,,,,,,,,,,
2310F,2310F.NM101,Entity Identifier Code,,,45 Drop-off Location,,,,,,,,,
2310F,2310F.NM102,Entity Type Qualifier,,,2 Non-Person Entity,,,,,,,,,
2310F,2310F.NM103,Name Last or Organization Name,,,,,,,,,,,,
2310F,N3,Ambulance Drop-off Location Address (Required),,,,,,,,,,,,
2310F,2310F.N301,Address Information,,,,,,,,,,,,
2310F,2310F.N302,Address Information,,,,,,,,,,,,
2310F,N4,"Ambulance Drop-off Location City, State, ZIP Code (Required)",,,,,,,,,,,,
2310F,2310F.N401,City Name,,,,,,,,,,,,
2310F,2310F.N402,State or Province Code,,,,,,,,,,,,
2310F,2310F.N403,Postal Code,,,,,,,,,,,,
2310F,2310F.N404,Country Code,,,,,,,,,,,,
2310F,2310F.N407,Country Subdivision Code,,,,,,,,,,,,
LOOP 2320 - OTHER SUBSCRIBER INFORMATION,,,,,,,,,,,,,,
2320,SBR,Other Subscriber Information,,,,,,,,,,,,
2320,2320.SBR01,Payer Responsibility Sequence Number Code,,,"A Payer Responsibility Four
B Payer Responsibility Five
C Payer Responsibility Six
D Payer Responsibility Seven
E Payer Responsibility Eight
F Payer Responsibility Nine
G Payer Responsibility Ten
H Payer Responsibility Eleven
P Primary
S Secondary
T Tertiary
U Unknown",,,,,,,,,
2320,2320.SBR02,Individual Relationship Code,,,"01 Spouse
18 Self
19 Child
20 Employee
21 Unknown
39 Organ Donor
40 Cadaver Donor
53 Life Partner
G8 Other Relationship",,,,,,,,,
2320,2320.SBR03,Reference Identification,,,,,,,,,,,,
2320,2320.SBR04,Name,,,,,,,,,,,,
2320,2320.SBR05,Insurance Type Code,,,"12 Medicare Secondary Working Aged Beneficiary or
Spouse with Employer Group Health Plan
13 Medicare Secondary End-Stage Renal Disease
Beneficiary in the Mandated Coordination Period
with an Employer’s Group Health Plan
14 Medicare Secondary, No-fault Insurance including
Auto is Primary
15 Medicare Secondary Worker’s Compensation
16 Medicare Secondary Public Health Service (PHS)or
Other Federal Agency
41 Medicare Secondary Black Lung
42 Medicare Secondary Veteran’s Administration
43 Medicare Secondary Disabled Beneficiary Under
Age 65 with Large Group Health Plan (LGHP)
47 Medicare Secondary, Other Liability Insurance is
Primary",,,,,,,,,
2320,2320.SBR09,Claim Filing Indicator Code,,,"11 Other Non-Federal Programs
12 Preferred Provider Organization (PPO)
13 Point of Service (POS)
14 Exclusive Provider Organization (EPO)
15 Indemnity Insurance
16 Health Maintenance Organization (HMO) Medicare
Risk
17 Dental Maintenance Organization
AM Automobile Medical
BL Blue Cross/Blue Shield
CH Champus
CI Commercial Insurance Co.
DS Disability
FI Federal Employees Program
HM Health Maintenance Organization
LM Liability Medical
MA Medicare Part A
MB Medicare Part B
MC Medicaid
OF Other Federal Program
TV Title V
VA Veterans Affairs Plan
WC Workers’ Compensation Health Claim
ZZ Mutually Defined",,,,,,,,,
2320,CAS,Claim Level Adjustments,,,,,,,,,,,,
2320,2320.CAS01,Claim Adjustment Group Code,,,"CO Contractual Obligations
CR Correction and Reversals
OA Other adjustments
PI Payor Initiated Reductions
PR Patient Responsibility",,,,,,,,,
2320,2320.CAS02,Claim Adjustment Reason Code,,,,,,,,,,,,
2320,2320.CAS03,Monetary Amount,,,,,,,,,,,,
2320,2320.CAS04,Quantity,,,,,,,,,,,,
2320,2320.CAS05,Claim Adjustment Reason Code,,,,,,,,,,,,
2320,2320.CAS06,Monetary Amount,,,,,,,,,,,,
2320,2320.CAS07,Quantity,,,,,,,,,,,,
2320,2320.CAS08,Claim Adjustment Reason Code,,,,,,,,,,,,
2320,2320.CAS09,Monetary Amount,,,,,,,,,,,,
2320,2320.CAS10,Quantity,,,,,,,,,,,,
2320,2320.CAS11,Claim Adjustment Reason Code,,,,,,,,,,,,
2320,2320.CAS12,Monetary Amount,,,,,,,,,,,,
2320,2320.CAS13,Quantity,,,,,,,,,,,,
2320,2320.CAS14,Claim Adjustment Reason Code,,,,,,,,,,,,
2320,2320.CAS15,Monetary Amount,,,,,,,,,,,,
2320,2320.CAS16,Quantity,,,,,,,,,,,,
2320,2320.CAS17,Claim Adjustment Reason Code,,,,,,,,,,,,
2320,2320.CAS18,Monetary Amount,,,,,,,,,,,,
2320,2320.CAS19,Quantity,,,,,,,,,,,,
2320,AMT,Coordination of Benefits (COB) Payer Paid Amount,,,,,,,,,,,,
2320,2320.AMT01,Amount Qualifier Code,,,D Payor Amount Paid,,,,,,,,,
2320,2320.AMT02,Monetary Amount,,,,,,,,,,,,
2320,AMT,Coordination of Benefits (COB) Total Non-Covered Amount,,,,,,,,,,,,
2320,2320.AMT01,Amount Qualifier Code,,,A8 Noncovered Charges - Actual,,,,,,,,,
2320,2320.AMT02,Monetary Amount,,,,,,,,,,,,
2320,AMT,Remaining Patient Liability,,,,,,,,,,,,
2320,2320.AMT01,Amount Qualifier Code,,,EAF Amount Owed,,,,,,,,,
2320,2320.AMT02,Monetary Amount,,,,,,,,,,,,
2320,OI,Other Insurance Coverage Information (Required),,,,,,,,,,,,
2320,2320.OI03,Yes/No Condition or Response Code,,,"N No
W Not Applicable
Y Yes",,,,,,,,,
2320,2320.OI04,Patient Signature Source Code,,,"P Signature generated by provider because the patient
was not physically present for services",,,,,,,,,
2320,2320.OI06,Release of Information Code,,,"I Informed Consent to Release Medical Information
for Conditions or Diagnoses Regulated by Federal
Statutes
Y Yes, Provider has a Signed Statement Permitting
Release of Medical Billing Data Related to a Claim",,,,,,,,,
2320,MOA,Outpatient Adjudication Information,,,,,,,,,,,,
2320,2320.MOA01,Percentage as Decimal,,,,,,,,,,,,
2320,2320.MOA02,Monetary Amount,,,,,,,,,,,,
2320,2320.MOA03,Reference Identification,,,,,,,,,,,,
2320,2320.MOA04,Reference Identification,,,,,,,,,,,,
2320,2320.MOA05,Reference Identification,,,,,,,,,,,,
2320,2320.MOA06,Reference Identification,,,,,,,,,,,,
2320,2320.MOA07,Reference Identification,,,,,,,,,,,,
2320,2320.MOA08,Monetary Amount,,,,,,,,,,,,
2320,2320.MOA09,Monetary Amount,,,,,,,,,,,,
LOOP 2330A - OTHER SUBSCRIBER NAME,,,,,,,,,,,,,,
2330A,NM1,Other Subscriber Name (Required),,,,,,,,,,,,
2330A,2330A.NM101,Entity Identifier Code,,,IL Insured or Subscriber,,,,,,,,,
2330A,2330A.NM102,Entity Type Qualifier,,,"1 Person
2 Non-Person Entity",,,,,,,,,
2330A,2330A.NM103,Name Last or Organization Name,,,,,,,,,,,,
2330A,2330A.NM104,Name First,,,,,,,,,,,,
2330A,2330A.NM105,Name Middle,,,,,,,,,,,,
2330A,2330A.NM107,Name Suffix,,,,,,,,,,,,
2330A,2330A.NM108,Identification Code Qualifier,,,"II Standard Unique Health Identifier for each Individual
in the United States
MI Member Identification Number",,,,,,,,,
2330A,2330A.NM109,Identification Code,,,,,,,,,,,,
2330A,N3,Other Subscriber Address,,,,,,,,,,,,
2330A,2330A.N301,Address Information,,,,,,,,,,,,
2330A,2330A.N302,Address Information,,,,,,,,,,,,
2330A,N4,"Other Subscriber City, State, ZIP Code",,,,,,,,,,,,
2330A,2330A.N401,City Name,,,,,,,,,,,,
2330A,2330A.N402,State or Province Code,,,,,,,,,,,,
2330A,2330A.N403,Postal Code,,,,,,,,,,,,
2330A,2330A.N404,Country Code,,,,,,,,,,,,
2330A,2330A.N407,Country Subdivision Code,,,,,,,,,,,,
2330A,REF,Subscriber Secondary Identification,,,,,,,,,,,,
2330A,2330A.REF01,Reference Identification Qualifier,,,SY Social Security Number,,,,,,,,,
2330A,2330A.REF02,Reference Identification,,,,,,,,,,,,
LOOP 2330B - OTHER PAYER NAME,,,,,,,,,,,,,,
2330B,NM1,Other Payer Name (Required),,,,,,,,,,,,
2330B,2330B.NM101,Entity Identifier Code,,,PR Payer,,,,,,,,,
2330B,2330B.NM102,Entity Type Qualifier,,,2 Non-Person Entity,,,,,,,,,
2330B,2330B.NM103,Name Last or Organization Name,,,,,,,,,,,,
2330B,2330B.NM108,Identification Code Qualifier,,,"PI Payor Identification
XV Centers for Medicare and Medicaid Services PlanID",,,,,,,,,
2330B,2330B.NM109,Identification Code,,,,,,,,,,,,
2330B,N3,Other Payer Address,,,,,,,,,,,,
2330B,2330B.N301,Address Information,,,,,,,,,,,,
2330B,2330B.N302,Address Information,,,,,,,,,,,,
2330B,N4,"Other Payer City, State, ZIP Code",,,,,,,,,,,,
2330B,2330B.N401,City Name,,,,,,,,,,,,
2330B,2330B.N402,State or Province Code,,,,,,,,,,,,
2330B,2330B.N403,Postal Code,,,,,,,,,,,,
2330B,2330B.N404,Country Code,,,,,,,,,,,,
2330B,2330B.N407,Country Subdivision Code,,,,,,,,,,,,
2330B,DTP,Claim Check or Remittance Date,,,,,,,,,,,,
2330B,2330B.DTP01,Date/Time Qualifier,,,573 Date Claim Paid,,,,,,,,,
2330B,2330B.DTP02,Date Time Period Format Qualifier,,,D8 Date Expressed in Format CCYYMMDD,,,,,,,,,
2330B,2330B.DTP03,Date Time Period,,,,,,,,,,,,
2330B,REF,Other Payer Secondary Identifier,,,,,,,,,,,,
2330B,2330B.REF01,Reference Identification Qualifier,,,"2U Payer Identification Number
EI Employer’s Identification Number
FY Claim Office Number
NF National Association of Insurance Commissioners
(NAIC) Code",,,,,,,,,
2330B,2330B.REF02,Reference Identification,,,,,,,,,,,,
2330B,REF,Other Payer Prior Authorization Number,,,,,,,,,,,,
2330B,2330B.REF01,Reference Identification Qualifier,,,G1 Prior Authorization Number,,,,,,,,,
2330B,2330B.REF02,Reference Identification,,,,,,,,,,,,
2330B,REF,Other Payer Referral Number,,,,,,,,,,,,
2330B,2330B.REF01,Reference Identification Qualifier,,,9F Referral Number,,,,,,,,,
2330B,2330B.REF02,Reference Identification,,,,,,,,,,,,
2330B,REF,Other Payer Claim Adjustment Indicator,,,,,,,,,,,,
2330B,2330B.REF01,Reference Identification Qualifier,,,T4 Signal Code,,,,,,,,,
2330B,2330B.REF02,Reference Identification,,,,,,,,,,,,
2330B,REF,Other Payer Claim Control Number,,,,,,,,,,,,
2330B,2330B.REF01,Reference Identification Qualifier,,,F8 Original Reference Number,,,,,,,,,
2330B,2330B.REF02,Reference Identification,,,,,,,,,,,,
"LOOP 2330C - OTHER PAYER REFERRING
PROVIDER",,,,,,,,,,,,,,
2330C,NM1,Other Payer Referring Provider,,,,,,,,,,,,
2330C,2330C.NM101,Entity Identifier Code,,,"DN Referring Provider
P3 Primary Care Provider",,,,,,,,,
2330C,2330C.NM102,Entity Type Qualifier,,,1 Person,,,,,,,,,
2330C,REF,Other Payer Referring Provider Secondary Identification (Required),,,,,,,,,,,,
2330C,2330C.REF01,Reference Identification Qualifier,,,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number",,,,,,,,,
2330C,2330C.REF02,Reference Identification,,,,,,,,,,,,
"LOOP 2330D - OTHER PAYER RENDERING
PROVIDER",,,,,,,,,,,,,,
2330D,NM1,Other Payer Rendering Provider,,,,,,,,,,,,
2330D,2330D.NM101,Entity Identifier Code,,,82 Rendering Provider,,,,,,,,,
2330D,2330D.NM102,Entity Type Qualifier,,,"1 Person
2 Non-Person Entity",,,,,,,,,
2330D,REF,Other Payer Rendering Provider Secondary Identification (Required),,,,,,,,,,,,
2330D,2330D.REF01,Reference Identification Qualifier,,,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number
LU Location Number",,,,,,,,,
2330D,2330D.REF02,Reference Identification,,,,,,,,,,,,
"LOOP 2330E - OTHER PAYER SERVICE FACILITY
LOCATION",,,,,,,,,,,,,,
2330E,NM1,Other Payer Service Facility Location,,,,,,,,,,,,
2330E,2330E.NM101,Entity Identifier Code,,,77 Service Location,,,,,,,,,
2330E,2330E.NM102,Entity Type Qualifier,,,2 Non-Person Entity,,,,,,,,,
2330E,REF,Other Payer Service Facility Location Secondary Identification (Required),,,,,,,,,,,,
2330E,2330E.REF01,Reference Identification Qualifier,,,"0B State License Number
G2 Provider Commercial Number
LU Location Number",,,,,,,,,
2330E,2330E.REF02,Reference Identification,,,,,,,,,,,,
"LOOP 2330F - OTHER PAYER SUPERVISING
PROVIDER",,,,,,,,,,,,,,
2330F,NM1,Other Payer Supervising Provider,,,,,,,,,,,,
2330F,2330F.NM101,Entity Identifier Code,,,DQ Supervising Physician,,,,,,,,,
2330F,2330F.NM102,Entity Type Qualifier,,,1 Person,,,,,,,,,
2330F,REF,Other Payer Supervising Provider Secondary Identification (Required),,,,,,,,,,,,
2330F,2330F.REF01,Reference Identification Qualifier,,,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number
LU Location Number",,,,,,,,,
2330F,2330F.REF02,Reference Identification,,,,,,,,,,,,
LOOP 2330G - OTHER PAYER BILLING PROVIDER,,,,,,,,,,,,,,
2330G,NM1,Other Payer Billing Provider,,,,,,,,,,,,
2330G,2330G.NM101,Entity Identifier Code,,,85 Billing Provider,,,,,,,,,
2330G,2330G.NM102,Entity Type Qualifier,,,"1 Person
2 Non-Person Entity",,,,,,,,,
2330G,REF,Other Payer Billing Provider Secondary Identification (Required),,,,,,,,,,,,
2330G,2330G.REF01,Reference Identification Qualifier,,,"G2 Provider Commercial Number
LU Location Number",,,,,,,,,
2330G,2330G.REF02,Reference Identification,,,,,,,,,,,,
LOOP 2400 - SERVICE LINE NUMBER,,,,,,,,,,,,,,
2400,LX,Service Line Number (Required),,R,,,,,,,,,,
2400,2400.LX01,Assigned Number,Number assigned for differentiation within a transaction set,R,,LINE_SEQ,LINE_SEQ,141,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/claimLineId,
2400,SV1,Professional Service (Required),,,,,,,,,,,,
2400,2400.SV101.01,Product/Service ID Qualifier,Code identifying the type/source of the descriptive number used in Product/Service ID (234),R,"ER Jurisdiction Specific Procedure and Supply Codes
HC Health Care Financing Administration Common
Procedural Coding System (HCPCS) Codes
IV Home Infusion EDI Coalition (HIEC) Product/Service
Code
WK Advanced Billing Concepts (ABC) Codes","Hardcode as ""HC""",,,,,,,,
2400,2400.SV101.02,Product/Service ID,Identifying number for a product or service,R,,SUB_HCPCS,SUB_HCPCS,158,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/serviceCode,
2400,2400.SV101.03,Procedure Modifier,"This identifies special circumstances related to the performance of the service, as defined by trading partners",S,,SUB_MOD_01,SUB_MOD_01,159,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/modifierList/string,
2400,2400.SV101.04,Procedure Modifier,"This identifies special circumstances related to the performance of the service, as defined by trading partners",S,,SUB_MOD_02,SUB_MOD_02,160,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/modifierList/string,
2400,2400.SV101.05,Procedure Modifier,"This identifies special circumstances related to the performance of the service, as defined by trading partners",S,,SUB_MOD_03,SUB_MOD_03,161,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/modifierList/string,
2400,2400.SV101.06,Procedure Modifier,"This identifies special circumstances related to the performance of the service, as defined by trading partners",S,,SUB_MOD_04,SUB_MOD_04,162,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/modifierList/string,
2400,2400.SV101.07,Description,A free-form description to clarify the related data elements and their content,S,,SUB_HCPCS_DESC,SUB_HCPCS_DESC,516,Line,,,,,
2400,2400.SV102,Monetary Amount,Monetary amount,R,,SUB_AMOUNT,SUB_AMOUNT,169,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/requestedAmount,
2400,2400.SV103,Unit or Basis for Measurement Code,"Code specifying the units in which a value is being expressed, or manner in which a measurement has been taken",R,"MJ Minutes
UN Unit",UNITS_TYPE,UNITS_TYPE,167,Line,,,,,
2400,2400.SV104,Quantity,Numeric value of quantity,R,,SUB_UNITS,SUB_UNITS,168,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/minuteCount OR ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/units,
2400,2400.SV105,Facility Code Value,"Code identifying where services were, or may be, performed; the first and second positions of the Uniform Bill Type Code for Institutional Services or the Place of Service Codes for Professional or Dental Services.",S,,POS_ID,PLACE_OF_SERVICE,144,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/placeOfService,
2400,2400.SV107.01,Diagnosis Code Pointer,A pointer to the diagnosis code in the order of importance to this service,R,,DIAG_PTR1,DIAGNOSIS_POINTER_01,146,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/diagnosisList/string,
2400,2400.SV107.02,Diagnosis Code Pointer,A pointer to the diagnosis code in the order of importance to this service,S,,DIAG_PTR2,DIAGNOSIS_POINTER_02,147,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/diagnosisList/string,
2400,2400.SV107.03,Diagnosis Code Pointer,A pointer to the diagnosis code in the order of importance to this service,S,,DIAG_PTR3,DIAGNOSIS_POINTER_03,148,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/diagnosisList/string,
2400,2400.SV107.04,Diagnosis Code Pointer,A pointer to the diagnosis code in the order of importance to this service,S,,DIAG_PTR4,DIAGNOSIS_POINTER_04,149,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/diagnosisList/string,
2400,2400.SV109,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,Y Yes,,,,,,,,,
2400,2400.SV111,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,Y Yes,,,,,,,,,
2400,2400.SV112,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,Y Yes,,,,,,,,,
2400,2400.SV115,Copay Status Code,Code indicating whether or not co-payment requirements were met on a line by line basis,S,0 Copay exempt,,,,,,,,,
2400,SV5,Durable Medical Equipment Service,,,,,,,,,,,,
2400,2400.SV501.01,Product/Service ID Qualifier,,,"HC Health Care Financing Administration Common
Procedural Coding System (HCPCS) Codes",,,,,,,,,
2400,2400.SV501.02,Product/Service ID,,,,,,,,,,,,
2400,2400.SV502,Unit or Basis for Measurement Code,,,DA Days,,,,,,,,,
2400,2400.SV503,Quantity,,,,,,,,,,,,
2400,2400.SV504,Monetary Amount,,,,,,,,,,,,
2400,2400.SV505,Monetary Amount,,,,,,,,,,,,
2400,2400.SV506,Frequency Code,,,"1 Weekly
4 Monthly
6 Daily",,,,,,,,,
2400,PWK,Line Supplemental Information,,,,,,,,,,,,
2400,2400.PWK01,Report Type Code,,,"03 Report Justifying Treatment Beyond Utilization
Guidelines
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
A3 Allergies/Sensitivities Document
A4 Autopsy Report
AM Ambulance Certification
AS Admission Summary
B2 Prescription
B3 Physician Order
B4 Referral Form
BR Benchmark Testing Results
BS Baseline
BT Blanket Test Results
CB Chiropractic Justification
CK Consent Form(s)
CT Certification
D2 Drug Profile Document
DA Dental Models
DB Durable Medical Equipment Prescription
DG Diagnostic Report
DJ Discharge Monitoring Report
DS Discharge Summary
EB Explanation of Benefits (Coordination of Benefits or
Medicare Secondary Payor)
HC Health Certificate
HR Health Clinic Records
I5 Immunization Record
IR State School Immunization Records
LA Laboratory Results
M1 Medical Record Attachment
MT Models
NN Nursing Notes
OB Operative Note
OC Oxygen Content Averaging Report
OD Orders and Treatments Document
OE Objective Physical Examination (including vital
signs) Document
OX Oxygen Therapy Certification
OZ Support Data for Claim
P4 Pathology Report
P5 Patient Medical History Document
PE Parenteral or Enteral Certification
PN Physical Therapy Notes
PO Prosthetics or Orthotic Certification
PQ Paramedical Results
PY Physician’s Report
PZ Physical Therapy Certification
RB Radiology Films
RR Radiology Reports
RT Report of Tests and Analysis Report
RX Renewable Oxygen Content Averaging Report
SG Symptoms Document
V5 Death Notification
XP Photographs",,,,,,,,,
2400,2400.PWK02,Report Transmission Code,,,"AA Available on Request at Provider Site
BM By Mail
EL Electronically Only
EM E-Mail
FT File Transfer
FX By Fax",,,,,,,,,
2400,2400.PWK05,Identification Code Qualifier,,,AC Attachment Control Number,,,,,,,,,
2400,2400.PWK06,Identification Code,,,,,,,,,,,,
2400,PWK,Durable Medical Equipment Certificate of Medical Necessity Indicator,,,,,,,,,,,,
2400,2400.PWK01,Report Type Code,,,CT Certification,,,,,,,,,
2400,2400.PWK02,Report Transmission Code,,,"AB Previously Submitted to Payer
AD Certification Included in this Claim
AF Narrative Segment Included in this Claim
AG No Documentation is Required
NS Not Specified",,,,,,,,,
2400,CR1,Ambulance Transport Information,,,,,,,,,,,,
2400,2400.CR101,Unit or Basis for Measurement Code,,,LB Pound,,,,,,,,,
2400,2400.CR102,Weight,,,,,,,,,,,,
2400,2400.CR104,Ambulance Transport Reason Code,,,"A Patient was transported to nearest facility for care of
symptoms, complaints, or both
B Patient was transported for the benefit of a preferred
physician
C Patient was transported for the nearness of family
members
D Patient was transported for the care of a specialist
or for availability of specialized equipment
E Patient Transferred to Rehabilitation Facility",,,,,,,,,
2400,2400.CR105,Unit or Basis for Measurement Code,,,DH Miles,,,,,,,,,
2400,2400.CR106,Quantity,,,,,,,,,,,,
2400,2400.CR109,Description,,,,,,,,,,,,
2400,2400.CR110,Description,,,,,,,,,,,,
2400,CR3,Durable Medical Equipment Certification,,,,,,,,,,,,
2400,2400.CR301,Certification Type Code,,,"I Initial
R Renewal
S Revised",,,,,,,,,
2400,2400.CR302,Unit or Basis for Measurement Code,,,MO Months,,,,,,,,,
2400,2400.CR303,Quantity,,,,,,,,,,,,
2400,CRC,Ambulance Certification,,,,,,,,,,,,
2400,2400.CRC01,Code Category,,,07 Ambulance Certification,,,,,,,,,
2400,2400.CRC02,Yes/No Condition or Response Code,,,"N No
Y Yes",,,,,,,,,
2400,2400.CRC03,Condition Indicator,,,"01 Patient was admitted to a hospital
04 Patient was moved by stretcher
05 Patient was unconscious or in shock
06 Patient was transported in an emergency situation
07 Patient had to be physically restrained
08 Patient had visible hemorrhaging
09 Ambulance service was medically necessary
12 Patient is confined to a bed or chair",,,,,,,,,
2400,2400.CRC04,Condition Indicator,,,,,,,,,,,,
2400,2400.CRC05,Condition Indicator,,,,,,,,,,,,
2400,2400.CRC06,Condition Indicator,,,,,,,,,,,,
2400,2400.CRC07,Condition Indicator,,,,,,,,,,,,
2400,CRC,Hospice Employee Indicator,,,,,,,,,,,,
2400,2400.CRC01,Code Category,,,70 Hospice,,,,,,,,,
2400,2400.CRC02,Yes/No Condition or Response Code,,,"N No
Y Yes",,,,,,,,,
2400,2400.CRC03,Condition Indicator,,,65 Open,,,,,,,,,
2400,CRC,Condition Indicator/Durable Medical Equipment,,,,,,,,,,,,
2400,2400.CRC01,Code Category,,,09 Durable Medical Equipment Certification,,,,,,,,,
2400,2400.CRC02,Yes/No Condition or Response Code,,,"N No
Y Yes",,,,,,,,,
2400,2400.CRC03,Condition Indicator,,,"38 Certification signed by the physician is on file at the
supplier’s office
ZV Replacement Item",,,,,,,,,
2400,2400.CRC04,Condition Indicator,,,,,,,,,,,,
2400,DTP,Date - Service Date (Required),,R,,,,,,,,,,
2400,2400.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,472 Service,"Hardcode as ""472""",,,,,,,,
2400,2400.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,"D8 Date Expressed in Format CCYYMMDD
RD8 Range of Dates Expressed in Format CCYYMMDDCCYYMMDD","Hardcode ""RD8""  if LINE_END_DOS is present. Else D8.",,,,,,,,
2400,2400.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,DOS_FROM - DOS_TO,"LINE_BEGIN_DOS -
LINE_END_DOS",142 + 143,Line,,,,"ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/serviceStartDate ""-"" ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/serviceEndDate",
2400,DTP,Date - Prescription Date,,,,,,,,,,,,
2400,2400.DTP01,Date/Time Qualifier,,,471 Prescription,,,,,,,,,
2400,2400.DTP02,Date Time Period Format Qualifier,,,D8 Date Expressed in Format CCYYMMDD,,,,,,,,,
2400,2400.DTP03,Date Time Period,,,,,,,,,,,,
2400,DTP,DATE - Certification Revision/Recertification Date,,,,,,,,,,,,
2400,2400.DTP01,Date/Time Qualifier,,,607 Certification Revision,,,,,,,,,
2400,2400.DTP02,Date Time Period Format Qualifier,,,D8 Date Expressed in Format CCYYMMDD,,,,,,,,,
2400,2400.DTP03,Date Time Period,,,,,,,,,,,,
2400,DTP,Date - Begin Therapy Date,,,,,,,,,,,,
2400,2400.DTP01,Date/Time Qualifier,,,463 Begin Therapy,,,,,,,,,
2400,2400.DTP02,Date Time Period Format Qualifier,,,D8 Date Expressed in Format CCYYMMDD,,,,,,,,,
2400,2400.DTP03,Date Time Period,,,,,,,,,,,,
2400,DTP,Date - Last Certification Date,,,,,,,,,,,,
2400,2400.DTP01,Date/Time Qualifier,,,461 Last Certification,,,,,,,,,
2400,2400.DTP02,Date Time Period Format Qualifier,,,D8 Date Expressed in Format CCYYMMDD,,,,,,,,,
2400,2400.DTP03,Date Time Period,,,,,,,,,,,,
2400,DTP,Date - Last Seen Date,,,,,,,,,,,,
2400,2400.DTP01,Date/Time Qualifier,,,304 Latest Visit or Consultation,,,,,,,,,
2400,2400.DTP02,Date Time Period Format Qualifier,,,D8 Date Expressed in Format CCYYMMDD,,,,,,,,,
2400,2400.DTP03,Date Time Period,,,,,,,,,,,,
2400,DTP,Date - Test Date,,,,,,,,,,,,
2400,2400.DTP01,Date/Time Qualifier,,,"738 Most Recent Hemoglobin or Hematocrit or Both
739 Most Recent Serum Creatine",,,,,,,,,
2400,2400.DTP02,Date Time Period Format Qualifier,,,D8 Date Expressed in Format CCYYMMDD,,,,,,,,,
2400,2400.DTP03,Date Time Period,,,,,,,,,,,,
2400,DTP,Date - Shipped Date,,,,,,,,,,,,
2400,2400.DTP01,Date/Time Qualifier,,,011 Shipped,,,,,,,,,
2400,2400.DTP02,Date Time Period Format Qualifier,,,D8 Date Expressed in Format CCYYMMDD,,,,,,,,,
2400,2400.DTP03,Date Time Period,,,,,,,,,,,,
2400,DTP,Date - Last X-ray Date,,,,,,,,,,,,
2400,2400.DTP01,Date/Time Qualifier,,,455 Last X-Ray,,,,,,,,,
2400,2400.DTP02,Date Time Period Format Qualifier,,,D8 Date Expressed in Format CCYYMMDD,,,,,,,,,
2400,2400.DTP03,Date Time Period,,,,,,,,,,,,
2400,DTP,Date - Initial Treatment Date,,,,,,,,,,,,
2400,2400.DTP01,Date/Time Qualifier,,,454 Initial Treatment,,,,,,,,,
2400,2400.DTP02,Date Time Period Format Qualifier,,,D8 Date Expressed in Format CCYYMMDD,,,,,,,,,
2400,2400.DTP03,Date Time Period,,,,,,,,,,,,
2400,QTY,Ambulance Patient Count,,,,,,,,,,,,
2400,2400.QTY01,Quantity Qualifier,,,PT Patients,,,,,,,,,
2400,2400.QTY02,Quantity,,,,,,,,,,,,
2400,QTY,Obstetric Anesthesia Additional Units,,,,,,,,,,,,
2400,2400.QTY01,Quantity Qualifier,,,FL Units,,,,,,,,,
2400,2400.QTY02,Quantity,,,,,,,,,,,,
2400,MEA,Test Result,,,,,,,,,,,,
2400,2400.MEA01,Measurement Reference ID Code,,,"OG Original
TR Test Results",,,,,,,,,
2400,2400.MEA02,Measurement Qualifier,,,"HT Height
R1 Hemoglobin
R2 Hematocrit
R3 Epoetin Starting Dosage
R4 Creatinine",,,,,,,,,
2400,2400.MEA03,Measurement Value,,,,,,,,,,,,
2400,CN1,Contract Information,,,,,,,,,,,,
2400,2400.CN101,Contract Type Code,,,"01 Diagnosis Related Group (DRG)
02 Per Diem
03 Variable Per Diem
04 Flat
05 Capitated
06 Percent
09 Other",,,,,,,,,
2400,2400.CN102,Monetary Amount,,,,,,,,,,,,
2400,2400.CN103,"Percent, Decimal Format",,,,,,,,,,,,
2400,2400.CN104,Reference Identification,,,,,,,,,,,,
2400,2400.CN105,Terms Discount Percent,,,,,,,,,,,,
2400,2400.CN106,Version Identifier,,,,,,,,,,,,
2400,REF,Repriced Line Item Reference Number,,,,,,,,,,,,
2400,2400.REF01,Reference Identification Qualifier,,,9B Repriced Line Item Reference Number,,,,,,,,,
2400,2400.REF02,Reference Identification,,,,,,,,,,,,
2400,REF,Adjusted Repriced Line Item Reference Number,,,,,,,,,,,,
2400,2400.REF01,Reference Identification Qualifier,,,9D Adjusted Repriced Line Item Reference Number,,,,,,,,,
2400,2400.REF02,Reference Identification,,,,,,,,,,,,
2400,REF,Prior Authorization,,,,,,,,,,,,
2400,2400.REF01,Reference Identification Qualifier,,,G1 Prior Authorization Number,,,,,,,,,
2400,2400.REF02,Reference Identification,,,,,,,,,,,,
2400,2400.REF04.01,Reference Identification Qualifier,,,2U Payer Identification Number,,,,,,,,,
2400,2400.REF04.02,Reference Identification,,,,,,,,,,,,
2400,REF,Line Item Control Number,,,,,,,,,,,,
2400,2400.REF01,Reference Identification Qualifier,,,6R Provider Control Number,,,,,,,,,
2400,2400.REF02,Reference Identification,,,,,,,,,,,,
2400,REF,Mammography Certification Number,,,,,,,,,,,,
2400,2400.REF01,Reference Identification Qualifier,,,EW Mammography Certification Number,,,,,,,,,
2400,2400.REF02,Reference Identification,,,,,,,,,,,,
2400,REF,Clinical Laboratory Improvement Amendment (CLIA) Number,,,,,,,,,,,,
2400,2400.REF01,Reference Identification Qualifier,,,"X4 Clinical Laboratory Improvement Amendment
Number",,,,,,,,,
2400,2400.REF02,Reference Identification,,,,,,,,,,,,
2400,REF,Referring Clinical Laboratory Improvement Amendment (CLIA) Facility Identification,,,,,,,,,,,,
2400,2400.REF01,Reference Identification Qualifier,,,F4 Facility Certification Number,,,,,,,,,
2400,2400.REF02,Reference Identification,,,,,,,,,,,,
2400,REF,Immunization Batch Number,,,,,,,,,,,,
2400,2400.REF01,Reference Identification Qualifier,,,BT Batch Number,,,,,,,,,
2400,2400.REF02,Reference Identification,,,,,,,,,,,,
2400,REF,Referral Number,,,,,,,,,,,,
2400,2400.REF01,Reference Identification Qualifier,,,9F Referral Number,,,,,,,,,
2400,2400.REF02,Reference Identification,,,,,,,,,,,,
2400,2400.REF04.01,Reference Identification Qualifier,,,2U Payer Identification Number,,,,,,,,,
2400,2400.REF04.02,Reference Identification,,,,,,,,,,,,
2400,AMT,Sales Tax Amount,,,,,,,,,,,,
2400,2400.AMT01,Amount Qualifier Code,,,T Tax,,,,,,,,,
2400,2400.AMT02,Monetary Amount,,,,,,,,,,,,
2400,AMT,Postage Claimed Amount,,,,,,,,,,,,
2400,2400.AMT01,Amount Qualifier Code,,,F4 Postage Claimed,,,,,,,,,
2400,2400.AMT02,Monetary Amount,,,,,,,,,,,,
2400,K3,File Information,,,,,,,,,,,,
2400,2400.K301,Fixed Format Information,,,,,,,,,,,,
2400,NTE,Line Note,,,,,,,,,,,,
2400,2400.NTE01,Note Reference Code,,,"ADD Additional Information
DCP Goals, Rehabilitation Potential, or Discharge Plans",,,,,,,,,
2400,2400.NTE02,Description,,,,,,,,,,,,
2400,NTE,Third Party Organization Notes,,,,,,,,,,,,
2400,2400.NTE01,Note Reference Code,,,TPO Third Party Organization Notes,,,,,,,,,
2400,2400.NTE02,Description,,,,,,,,,,,,
2400,PS1,Purchased Service Information,,,,,,,,,,,,
2400,2400.PS101,Reference Identification,,,,,,,,,,,,
2400,2400.PS102,Monetary Amount,,,,,,,,,,,,
2400,HCP,Line Pricing/Repricing Information,,,,,,,,,,,,
2400,2400.HCP01,Pricing Methodology,,,"00 Zero Pricing (Not Covered Under Contract)
01 Priced as Billed at 100%
02 Priced at the Standard Fee Schedule
03 Priced at a Contractual Percentage
04 Bundled Pricing
05 Peer Review Pricing
06 Per Diem Pricing
07 Flat Rate Pricing
08 Combination Pricing
09 Maternity Pricing
10 Other Pricing
11 Lower of Cost
12 Ratio of Cost
13 Cost Reimbursed
14 Adjustment Pricing",,,,,,,,,
2400,2400.HCP02,Monetary Amount,,,,,,,,,,,,
2400,2400.HCP03,Monetary Amount,,,,,,,,,,,,
2400,2400.HCP04,Reference Identification,,,,,,,,,,,,
2400,2400.HCP05,Rate,,,,,,,,,,,,
2400,2400.HCP06,Reference Identification,,,,,,,,,,,,
2400,2400.HCP07,Monetary Amount,,,,,,,,,,,,
2400,2400.HCP09,Product/Service ID Qualifier,,,"ER Jurisdiction Specific Procedure and Supply Codes
HC Health Care Financing Administration Common
Procedural Coding System (HCPCS) Codes
IV Home Infusion EDI Coalition (HIEC) Product/Service
Code
WK Advanced Billing Concepts (ABC) Codes",,,,,,,,,
2400,2400.HCP10,Product/Service ID,,,,,,,,,,,,
2400,2400.HCP11,Unit or Basis for Measurement Code,,,"MJ Minutes
UN Unit",,,,,,,,,
2400,2400.HCP12,Quantity,,,,,,,,,,,,
2400,2400.HCP13,Reject Reason Code,,,"T1 Cannot Identify Provider as TPO (Third Party
Organization) Participant
T2 Cannot Identify Payer as TPO (Third Party
Organization) Participant
T3 Cannot Identify Insured as TPO (Third Party
Organization) Participant
T4 Payer Name or Identifier Missing
T5 Certification Information Missing
T6 Claim does not contain enough information for repricing",,,,,,,,,
2400,2400.HCP14,Policy Compliance Code,,,"1 Procedure Followed (Compliance)
2 Not Followed - Call Not Made (Non-Compliance Call
Not Made)
3 Not Medically Necessary (Non-Compliance Non-
Medically Necessary)
4 Not Followed Other (Non-Compliance Other)
5 Emergency Admit to Non-Network Hospital",,,,,,,,,
2400,2400.HCP15,Exception Code,,,"1 Non-Network Professional Provider in Network
Hospital
2 Emergency Care
3 Services or Specialist not in Network
4 Out-of-Service Area
5 State Mandates
6 Other",,,,,,,,,
LOOP 2410 - 2410 DRUG IDENTIFICATION,,,,,,,,,,,,,,
2410,LIN,Drug Identification,,S,,,,,,,,,,
2410,2410.LIN02,Product/Service ID Qualifier,Code identifying the type/source of the descriptive number used in Product/Service ID (234),R,N4 National Drug Code in 5-4-2 Format,"Hardcode as ""N4""",,,,,,,,
2410,2410.LIN03,Product/Service ID,Identifying number for a product or service,R,,SUB_NDC,SUB_NDC,171,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/ndcCodes/NDCCode/ndcCode,
2410,CTP,Drug Quantity (Required),,R,,,,,,,,,,
2410,2410.CTP04,Quantity,Numeric value of quantity,R,,SUB_NDC_UNITS,SUB_NDC_UNITS,172,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/ndcCodes/NDCCode/quantity,
2410,2410.CTP05.01,Unit or Basis for Measurement Code,"Code specifying the units in which a value is being expressed, or manner in which a measurement has been taken",R,"F2 International Unit
GR Gram
ME Milligram
ML Milliliter
UN Unit",SUB_NDC_UNITS_TYPE,SUB_NDC_UNITS_TYPE,173,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/ndcCodes/NDCCode/measurementType,
2410,REF,Prescription or Compound Drug Association Number,,,,,,,,,,,,
2410,2410.REF01,Reference Identification Qualifier,,,"VY Link Sequence Number
XZ Pharmacy Prescription Number",,,,,,,,,
2410,2410.REF02,Reference Identification,,,,,,,,,,,,
LOOP 2420A - RENDERING PROVIDER NAME,,,,,,,,,,,,,,
2420A,NM1,Rendering Provider Name,,S,,,,,,,,,Export is different from Loop 2310B,
2420A,2420A.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individua",R,82 Rendering Provider,"Hardcode as ""82""",,,,,,,,
2420A,2420A.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,"1 Person
2 Non-Person Entity","Hardcode as ""1""",,,,,,,,
2420A,2420A.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,RENDERING_PRACTITIONER__LAST_NAME,RENDERING_PRACTITIONER__LAST_NAME,85,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/renderingPractitioner/practitioner/lastName,
2420A,2420A.NM104,Name First,ndividual first name,S,,RENDERING_PRACTITIONER__FIRST_NAME,RENDERING_PRACTITIONER__FIRST_NAME,86,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/renderingPractitioner/practitioner/firstName,
2420A,2420A.NM105,Name Middle,Individual middle name or initia,S,,RENDERING_PRACTITIONER__MIDDLE_NAME,RENDERING_PRACTITIONER__MIDDLE_NAME,87,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/renderingPractitioner/practitioner/middleName,
2420A,2420A.NM107,Name Suffix,Suffix to individual name,S,,RENDERING_PRACTITIONER__NAME_SUFFIX,RENDERING_PRACTITIONER__NAME_SUFFIX,88,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/renderingPractitioner/practitioner/nameSuffix,
2420A,2420A.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),S,"XX Centers for Medicare and Medicaid Services
National Provider Identifier","Hardcode as ""XX""",,,,,,,,
2420A,2420A.NM109,Identification Code,Code identifying a party or other code,S,,RENDERING_PRACTITIONER__NPI,RENDERING_PRACTITIONER__NPI,80,Line,,,Iplus- Need to add new fields for this rendering provider .Edifec to confirm on UI  placeholder,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/renderingPractitioner/NPI,
2420A,PRV,Rendering Provider Specialty Information,,S,,,,,,,,,,
2420A,2420A.PRV01,Provider Code,Code identifying the type of provider,R,PE Performing,"Hardcode as ""PE""",,,,,,,,
2420A,2420A.PRV02,Reference Identification Qualifier,Code qualifying the Reference Identification,R,PXC Health Care Provider Taxonomy Code,"Hardcode as ""PXC""",,,,,,,,
2420A,2420A.PRV03,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,RENDERING_PRACTITIONER__TAXONOMY_CODE,RENDERING_PRACTITIONER__TAXONOMY_CODE,83,Line,,,Iplus- Need to add new fields for this rendering provider .Edifec to confirm on UI  placeholder,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/renderingPractitioner/primarySpecialty/taxonomyCode,
2420A,REF,Rendering Provider Secondary Identification,,S,,,,,,,,,,
2420A,2420A.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number
LU Location Number",,,,,,,,,
2420A,2420A.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,,,
2420A,2420A.REF04.01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,2U Payer Identification Number,,,,,,,,,
2420A,2420A.REF04.02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,,,
"LOOP 2420B - PURCHASED SERVICE PROVIDER
NAME",,,,,,,,,,,,,,
2420B,NM1,Purchased Service Provider Name,,,,,,,,,,,,
2420B,2420B.NM101,Entity Identifier Code,,,QB Purchase Service Provider,,,,,,,,,
2420B,2420B.NM102,Entity Type Qualifier,,,"1 Person
2 Non-Person Entity",,,,,,,,,
2420B,2420B.NM108,Identification Code Qualifier,,,"XX Centers for Medicare and Medicaid Services
National Provider Identifier",,,,,,,,,
2420B,2420B.NM109,Identification Code,,,,,,,,,,,,
2420B,REF,Purchased Service Provider Secondary Identification,,,,,,,,,,,,
2420B,2420B.REF01,Reference Identification Qualifier,,,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number",,,,,,,,,
2420B,2420B.REF02,Reference Identification,,,,,,,,,,,,
2420B,2420B.REF04.01,Reference Identification Qualifier,,,2U Payer Identification Number,,,,,,,,,
2420B,2420B.REF04.02,Reference Identification,,,,,,,,,,,,
"LOOP 2420C - SERVICE FACILITY LOCATION
NAME",,,,,,,,,,,,,,
2420C,NM1,Service Facility Location Name,,,,,,,,,,,,
2420C,2420C.NM101,Entity Identifier Code,,,77 Service Location,,,,,,,,,
2420C,2420C.NM102,Entity Type Qualifier,,,2 Non-Person Entity,,,,,,,,,
2420C,2420C.NM103,Name Last or Organization Name,,,,,,,,,,,,
2420C,2420C.NM108,Identification Code Qualifier,,,"XX Centers for Medicare and Medicaid Services
National Provider Identifier",,,,,,,,,
2420C,2420C.NM109,Identification Code,,,,,,,,,,,,
2420C,N3,Service Facility Location Address (Required),,,,,,,,,,,,
2420C,2420C.N301,Address Information,,,,,,,,,,,,
2420C,2420C.N302,Address Information,,,,,,,,,,,,
2420C,N4,"Service Facility Location City, State, ZIP Code (Required)",,,,,,,,,,,,
2420C,2420C.N401,City Name,,,,,,,,,,,,
2420C,2420C.N402,State or Province Code,,,,,,,,,,,,
2420C,2420C.N403,Postal Code,,,,,,,,,,,,
2420C,2420C.N404,Country Code,,,,,,,,,,,,
2420C,2420C.N407,Country Subdivision Code,,,,,,,,,,,,
2420C,REF,Service Facility Location Secondary Identification,,,,,,,,,,,,
2420C,2420C.REF01,Reference Identification Qualifier,,,"G2 Provider Commercial Number
LU Location Number",,,,,,,,,
2420C,2420C.REF02,Reference Identification,,,,,,,,,,,,
2420C,2420C.REF04.01,Reference Identification Qualifier,,,2U Payer Identification Number,,,,,,,,,
2420C,2420C.REF04.02,Reference Identification,,,,,,,,,,,,
LOOP 2420D - SUPERVISING PROVIDER NAME,,,,,,,,,,,,,,
2420D,NM1,Supervising Provider Name,,,,,,,,,,,,
2420D,2420D.NM101,Entity Identifier Code,,,DQ Supervising Physician,,,,,,,,,
2420D,2420D.NM102,Entity Type Qualifier,,,1 Person,,,,,,,,,
2420D,2420D.NM103,Name Last or Organization Name,,,,,,,,,,,,
2420D,2420D.NM104,Name First,,,,,,,,,,,,
2420D,2420D.NM105,Name Middle,,,,,,,,,,,,
2420D,2420D.NM107,Name Suffix,,,,,,,,,,,,
2420D,2420D.NM108,Identification Code Qualifier,,,"XX Centers for Medicare and Medicaid Services
National Provider Identifier",,,,,,,,,
2420D,2420D.NM109,Identification Code,,,,,,,,,,,,
2420D,REF,Supervising Provider Secondary Identification,,,,,,,,,,,,
2420D,2420D.REF01,Reference Identification Qualifier,,,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number
LU Location Number",,,,,,,,,
2420D,2420D.REF02,Reference Identification,,,,,,,,,,,,
2420D,2420D.REF04.01,Reference Identification Qualifier,,,2U Payer Identification Number,,,,,,,,,
2420D,2420D.REF04.02,Reference Identification,,,,,,,,,,,,
LOOP 2420E - ORDERING PROVIDER NAME,,,,,,,,,,,,,,
2420E,NM1,Ordering Provider Name,,,,,,,,,,,,
2420E,2420E.NM101,Entity Identifier Code,,,DK Ordering Physician,,,,,,,,,
2420E,2420E.NM102,Entity Type Qualifier,,,1 Person,,,,,,,,,
2420E,2420E.NM103,Name Last or Organization Name,,,,,,,,,,,,
2420E,2420E.NM104,Name First,,,,,,,,,,,,
2420E,2420E.NM105,Name Middle,,,,,,,,,,,,
2420E,2420E.NM107,Name Suffix,,,,,,,,,,,,
2420E,2420E.NM108,Identification Code Qualifier,,,"XX Centers for Medicare and Medicaid Services
National Provider Identifier",,,,,,,,,
2420E,2420E.NM109,Identification Code,,,,,,,,,,,,
2420E,N3,Ordering Provider Address,,,,,,,,,,,,
2420E,2420E.N301,Address Information,,,,,,,,,,,,
2420E,2420E.N302,Address Information,,,,,,,,,,,,
2420E,N4,"Ordering Provider City, State, ZIP Code",,,,,,,,,,,,
2420E,2420E.N401,City Name,,,,,,,,,,,,
2420E,2420E.N402,State or Province Code,,,,,,,,,,,,
2420E,2420E.N403,Postal Code,,,,,,,,,,,,
2420E,2420E.N404,Country Code,,,,,,,,,,,,
2420E,2420E.N407,Country Subdivision Code,,,,,,,,,,,,
2420E,REF,Ordering Provider Secondary Identification,,,,,,,,,,,,
2420E,2420E.REF01,Reference Identification Qualifier,,,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number",,,,,,,,,
2420E,2420E.REF02,Reference Identification,,,,,,,,,,,,
2420E,2420E.REF04.01,Reference Identification Qualifier,,,2U Payer Identification Number,,,,,,,,,
2420E,2420E.REF04.02,Reference Identification,,,,,,,,,,,,
2420E,PER,Ordering Provider Contact Information,,,,,,,,,,,,
2420E,2420E.PER01,Contact Function Code,,,IC Information Contact,,,,,,,,,
2420E,2420E.PER02,Name,,,,,,,,,,,,
2420E,2420E.PER03,Communication Number Qualifier,,,"EM Electronic Mail
FX Facsimile
TE Telephone",,,,,,,,,
2420E,2420E.PER04,Communication Number,,,,,,,,,,,,
2420E,2420E.PER05,Communication Number Qualifier,,,"EM Electronic Mail
EX Telephone Extension
FX Facsimile
TE Telephone",,,,,,,,,
2420E,2420E.PER06,Communication Number,,,,,,,,,,,,
2420E,2420E.PER07,Communication Number Qualifier,,,"EM Electronic Mail
EX Telephone Extension
FX Facsimile
TE Telephone",,,,,,,,,
2420E,2420E.PER08,Communication Number,,,,,,,,,,,,
LOOP 2420F - REFERRING PROVIDER NAME,,,,,,,,,,,,,,
2420F,NM1,Referring Provider Name,,,,,,,,,,,,
2420F,2420F.NM101,Entity Identifier Code,,,"DN Referring Provider
P3 Primary Care Provider",,,,,,,,,
2420F,2420F.NM102,Entity Type Qualifier,,,1 Person,,,,,,,,,
2420F,2420F.NM103,Name Last or Organization Name,,,,,,,,,,,,
2420F,2420F.NM104,Name First,,,,,,,,,,,,
2420F,2420F.NM105,Name Middle,,,,,,,,,,,,
2420F,2420F.NM107,Name Suffix,,,,,,,,,,,,
2420F,2420F.NM108,Identification Code Qualifier,,,"XX Centers for Medicare and Medicaid Services
National Provider Identifier",,,,,,,,,
2420F,2420F.NM109,Identification Code,,,,,,,,,,,,
2420F,REF,Referring Provider Secondary Identification,,,,,,,,,,,,
2420F,2420F.REF01,Reference Identification Qualifier,,,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number",,,,,,,,,
2420F,2420F.REF02,Reference Identification,,,,,,,,,,,,
2420F,2420F.REF04.01,Reference Identification Qualifier,,,2U Payer Identification Number,,,,,,,,,
2420F,2420F.REF04.02,Reference Identification,,,,,,,,,,,,
LOOP 2420G - AMBULANCE PICK-UP LOCATION,,,,,,,,,,,,,,
2420G,NM1,Ambulance Pick-up Location,,,,,,,,,,,,
2420G,2420G.NM101,Entity Identifier Code,,,PW Pickup Address,,,,,,,,,
2420G,2420G.NM102,Entity Type Qualifier,,,2 Non-Person Entity,,,,,,,,,
2420G,N3,Ambulance Pick-up Location Address (Required),,,,,,,,,,,,
2420G,2420G.N301,Address Information,,,,,,,,,,,,
2420G,2420G.N302,Address Information,,,,,,,,,,,,
2420G,N4,"Ambulance Pick-up Location City, State, ZIP Code (Required)",,,,,,,,,,,,
2420G,2420G.N401,City Name,,,,,,,,,,,,
2420G,2420G.N402,State or Province Code,,,,,,,,,,,,
2420G,2420G.N403,Postal Code,,,,,,,,,,,,
2420G,2420G.N404,Country Code,,,,,,,,,,,,
2420G,2420G.N407,Country Subdivision Code,,,,,,,,,,,,
LOOP 2420H - AMBULANCE DROP-OFF LOCATION,,,,,,,,,,,,,,
2420H,NM1,Ambulance Drop-off Location,,,,,,,,,,,,
2420H,2420H.NM101,Entity Identifier Code,,,45 Drop-off Location,,,,,,,,,
2420H,2420H.NM102,Entity Type Qualifier,,,2 Non-Person Entity,,,,,,,,,
2420H,2420H.NM103,Name Last or Organization Name,,,,,,,,,,,,
2420H,N3,Ambulance Drop-off Location Address (Required),,,,,,,,,,,,
2420H,2420H.N301,Address Information,,,,,,,,,,,,
2420H,2420H.N302,Address Information,,,,,,,,,,,,
2420H,N4,"Ambulance Drop-off Location City, State, ZIP Code (Required)",,,,,,,,,,,,
2420H,2420H.N401,City Name,,,,,,,,,,,,
2420H,2420H.N402,State or Province Code,,,,,,,,,,,,
2420H,2420H.N403,Postal Code,,,,,,,,,,,,
2420H,2420H.N404,Country Code,,,,,,,,,,,,
2420H,2420H.N407,Country Subdivision Code,,,,,,,,,,,,
LOOP 2430 - LINE ADJUDICATION INFORMATION,,,,,,,,,,,,,,
2430,SVD,Line Adjudication Information,,,,,,,,,,,,
2430,2430.SVD01,Identification Code,,,,,,,,,,,,
2430,2430.SVD02,Monetary Amount,,,,,,,,,,,,
2430,2430.SVD03.01,Product/Service ID Qualifier,,,"ER Jurisdiction Specific Procedure and Supply Codes
HC Health Care Financing Administration Common
Procedural Coding System (HCPCS) Codes
IV Home Infusion EDI Coalition (HIEC) Product/Service
Code
WK Advanced Billing Concepts (ABC) Codes",,,,,,,,,
2430,2430.SVD03.02,Product/Service ID,,,,,,,,,,,,
2430,2430.SVD03.03,Procedure Modifier,,,,,,,,,,,,
2430,2430.SVD03.04,Procedure Modifier,,,,,,,,,,,,
2430,2430.SVD03.05,Procedure Modifier,,,,,,,,,,,,
2430,2430.SVD03.06,Procedure Modifier,,,,,,,,,,,,
2430,2430.SVD03.07,Description,,,,,,,,,,,,
2430,2430.SVD05,Quantity,,,,,,,,,,,,
2430,2430.SVD06,Assigned Number,,,,,,,,,,,,
2430,CAS,Line Adjustment,,,,,,,,,,,,
2430,2430.CAS01,Claim Adjustment Group Code,,,"CO Contractual Obligations
CR Correction and Reversals
OA Other adjustments
PI Payor Initiated Reductions
PR Patient Responsibility",,,,,,,,,
2430,2430.CAS02,Claim Adjustment Reason Code,,,,,,,,,,,,
2430,2430.CAS03,Monetary Amount,,,,,,,,,,,,
2430,2430.CAS04,Quantity,,,,,,,,,,,,
2430,2430.CAS05,Claim Adjustment Reason Code,,,,,,,,,,,,
2430,2430.CAS06,Monetary Amount,,,,,,,,,,,,
2430,2430.CAS07,Quantity,,,,,,,,,,,,
2430,2430.CAS08,Claim Adjustment Reason Code,,,,,,,,,,,,
2430,2430.CAS09,Monetary Amount,,,,,,,,,,,,
2430,2430.CAS10,Quantity,,,,,,,,,,,,
2430,2430.CAS11,Claim Adjustment Reason Code,,,,,,,,,,,,
2430,2430.CAS12,Monetary Amount,,,,,,,,,,,,
2430,2430.CAS13,Quantity,,,,,,,,,,,,
2430,2430.CAS14,Claim Adjustment Reason Code,,,,,,,,,,,,
2430,2430.CAS15,Monetary Amount,,,,,,,,,,,,
2430,2430.CAS16,Quantity,,,,,,,,,,,,
2430,2430.CAS17,Claim Adjustment Reason Code,,,,,,,,,,,,
2430,2430.CAS18,Monetary Amount,,,,,,,,,,,,
2430,2430.CAS19,Quantity,,,,,,,,,,,,
2430,DTP,Line Check or Remittance Date (Required),,,,,,,,,,,,
2430,2430.DTP01,Date/Time Qualifier,,,573 Date Claim Paid,,,,,,,,,
2430,2430.DTP02,Date Time Period Format Qualifier,,,D8 Date Expressed in Format CCYYMMDD,,,,,,,,,
2430,2430.DTP03,Date Time Period,,,,,,,,,,,,
2430,AMT,Remaining Patient Liability,,,,,,,,,,,,
2430,2430.AMT01,Amount Qualifier Code,,,EAF Amount Owed,,,,,,,,,
2430,2430.AMT02,Monetary Amount,,,,,,,,,,,,
LOOP 2440 - FORM IDENTIFICATION CODE,,,,,,,,,,,,,,
2440,LQ,Form Identification Code,,,,,,,,,,,,
2440,2440.LQ01,Code List Qualifier Code,,,"AS Form Type Code
UT Centers for Medicare and Medicaid Services (CMS)
Durable Medical Equipment Regional Carrier
(DMERC) Certificate of Medical Necessity (CMN)
Forms",,,,,,,,,
2440,2440.LQ02,Industry Code,,,,,,,,,,,,
2440,FRM,Supporting Documentation (Required),,,,,,,,,,,,
2440,2440.FRM01,Assigned Identification,,,,,,,,,,,,
2440,2440.FRM02,Yes/No Condition or Response Code,,,"N No
W Not Applicable
Y Yes",,,,,,,,,
2440,2440.FRM03,Reference Identification,,,,,,,,,,,,
2440,2440.FRM04,Date,,,,,,,,,,,,
2440,2440.FRM05,"Percent, Decimal Format",,,,,,,,,,,,
,SE,Transaction Set Trailer (Required),,,,,,,,,,,,
,SE01,Number of Included Segments,,,,Count Of ST,,,,,,,,
,SE02,Transaction Set Control Number,,,,,,,,,,,,
,GE,Functional Group Trailer (Required),,,,,,,,,,,,
,GE01,Number of Transaction Sets Included,,,,Count Of GS,,,,,,,,
,GE02,Group Control Number,,,,GS06 Value,,,,,,,,
,IEA,Interchange Control Trailer (Required),,,,,,,,,,,,
,IEA01,Number of Included Functional Groups,,,,Count Of ISA,,,,,,,,
,IEA02,Interchange Control Number,,,,ISA13 Value,,,,,,,,
```

## Repricer OB-IB/OB Repricer/V26.1.0.0/EdifecsProduct_MappingSpec_OB Repricer_837_DFF_to_EDI Conversion_V2.1.xlsx — 837I Mapping 

```csv
Loop ID,EDI Segment,EDI Data Element Name,EDI Element Description,Usage,Enumeration Values,CDS VALUE / Hardcode,Extract layout name,Position,Level,Mapping Logic,Customization,COMMENTS,PIEDMONT
d,,,,,,,,,,,,,Mapping Value
,ISA,Segment: Interchange Control Header,,R,,,,,,,,,
,ISA01,Authorization Information Qualifier,"Code identifying the type of
information in the Authorization Information",R,"00 No Authorization Information Present (No Meaningful Information in I02)
03 Additional Data Identification","Hardcode as ""00""",,,,,,,
,ISA02,Authorization Information,Information used for additional identification or authorization of the interchange sender or the data in the interchange; the type of information is set by the Authorization Information Qualifier (I01),R,,Leave it blank,,,,,,,
,ISA03,Security Information Qualifier,"Code identifying the type of
 information in the Security Information",R,"00 No Security Information Present (No Meaningful Information in I04)
01 Password","Hardcode as ""00""",,,,,,,
,ISA04,Security Information,This is used for identifying the security information about the interchange sender or the data in the interchange; the type of information is set by the Security Information Qualifier (I03),R,,Leave it blank,,,,,,,
,ISA05,Interchange ID Qualifier,Code indicating the system/method of code structure used to designate the sender or receiver ID element being qualified,R,"01: Duns (Dun & Bradstreet)
14: Duns Plus Suffix
20: Health Industry Number (HIN)
       CODE SOURCE 121: Health Industry Number
27: Carrier Identification Number as assigned by Health Care Financing Administration (HCFA)
28: Fiscal Intermediary Identification Number as assigned by Health Care Financing Administration (HCFA)
29: Medicare Provider and Supplier Identification Number as assigned by Health Care Financing Administration (HCFA)
30: U.S. Federal Tax Identification Number
33: National Association of Insurance Commissioners Company Code (NAIC)
ZZ: Mutually Defined","Hardcode as ""ZZ""",,,,,,,
,ISA06,Interchange Sender ID,Identification code published by the sender for other parties to use as the receiver ID to route data to them; the sender always codes this value in the sender ID element,R,,"We need to refer the crosswalk for mapping the sender id for products is ""PRODUCT""",,,,,Yes,"Configurable value for Implementation team
PRODUCT",ClaimServiceStronglyTypedOBResponseRoot/header/senderId
,ISA07,Interchange ID Qualifier,Code indicating the system/method of code structure used to designate the sender or receiver ID element being qualified,R,"01: Duns (Dun & Bradstreet)
14 :Duns Plus Suffix
20 :Health Industry Number (HIN)
      CODE SOURCE 121: Health Industry Number
27 :Carrier Identification Number as assigned by Health Care Financing Administration (HCFA)
28 :Fiscal Intermediary Identification Number as assigned by Health Care Financing Administration (HCFA)
29 :Medicare Provider and Supplier Identification Number as assigned by Health Care Financing Administration (HCFA)
30 :U.S. Federal Tax Identification Number
33 :National Association of Insurance Commissioners Company Code (NAIC)
ZZ :Mutually Defined","Hardcode as ""ZZ""",,,,,,,
,ISA08,Interchange Receiver ID,"Identification code published by the receiver of the data; When sending, it is used by the sender as their sending ID, thus other parties sending to them will use this as a receiving ID to route data to them",R,,Hardcode  <default value>,,,,We need to pull it from line level repricer name,Yes,"Configurable value for Implementation team
updated default values",
,ISA09,Interchange Date,Date of the interchange,R,,"Map this value from  current date in the format of ""YYMMDD""",,,,,,,
,ISA10,Interchange Time,Time of the interchange,R,,Map this value from   current time in the format of HHMM,,,,,,,
,ISA11,Repetition Separator,"Type is not applicable; the repetition separator is a delimiter and not a data element; this field provides the delimiter used to separate repeated occurrences of a simple data element or a composite data structure; this value must be different than the data element separator, component element separator, and the segment terminator",R,,"Hardcode as ""^""",,,,,,,
,ISA12,Interchange Control Version Number,$)$,R,00501 : Standards Approved for Publication by ASC X12 Procedures Review Board through October 2003,Hardcode as “00501”,,,,,,,
,ISA13,Interchange Control Number,A control number assigned by the interchange sender,R,,Unique ISI control number needs to generated in Edifecs for each 837 EDI file. It has to be 9 digits (for example -  000000764),,,,,,,
,ISA14,Acknowledgment Requested,Code indicating sender’s request for an interchange acknowledgment,R,"0 : No Interchange Acknowledgment Requested
1 : Interchange Acknowledgment Requested (TA1)","Hardcode as ""0""",,,,,,,
,ISA15,Interchange Usage Indicator,"Code indicating whether data enclosed by this interchange envelope is test, production or information",R,"P : Production Data
T : Test Data","""P""  if it is a Production region
""T""  if it is a Non-Production region",,,,,,According to enviroinment it should be configurable,
,ISA16,Component Element Separator,Type is not applicable; the component element separator is a delimiter and not a data element; this field provides the delimiter used to separate component data elements within a composite data structure; this value must be different than the data element separator and the segment terminator,R,,"Hardcode  as "":""",,,,,,,
GS (Functional Group Header),,,,,,,,,,,,,
,GS,Segment: Functional Group Header,,R,,,,,,,,,
,GS01,Functional Identifier Code,Code identifying a group of application related transaction sets,R,,Hardcode as “HC”,,,,,,,
,GS02,Application Sender's Code,Code identifying party sending transmission; codes agreed to by trading partners,R,,"We need to refer the crosswalk for mapping the sender id for products is ""PRODUCT""",,,,"Application Sender Code will be different for each customer.From product standpoint, we have hardcoded a random Application Sender Code.",Yes,"Configurable value for Implementation team
PRODUCT",ClaimServiceStronglyTypedOBResponseRoot/header/senderId
,GS03,Application Receiver's Code,Code identifying party receiving transmission; codes agreed to by trading partners,R,,"Reveiver code for products is ""PRODUCT""",,,,"Application Receiver ID will be different for each customer.From product standpoint, we have hardcoded a random Application Application Receiver ID.",Yes,"Configurable value for Implementation team
PRODUCT",
,GS04,Date,Date expressed as CCYYMMDD where CC represents the first two digits of the calendar year,R,,"Map this value from  current date in the format of ""YYYYMMDD""",,,,,,,
,GS05,Time,"Time expressed in 24-hour clock time as follows: HHMM, or HHMMSS, or HHMMSSD, or HHMMSSDD, where H = hours (00-23), M = minutes (00-59), S = integer seconds (00-59) and DD = decimal seconds; decimal seconds are expressed as follows: D = tenths (0-9) and DD = hundredths (00-99)",R,,"Map this value from   current Time in the format of ""HHMMSS""",,,,,,,
,GS06,Group Control Number,Assigned number originated and maintained by the sender,R,,Generate ID In EDIFECS (1-9 Bytes),,,,,,,
,GS07,Responsible Agency Code,Code identifying the issuer of the standard; this code is used in conjunction with Data Element 480,R,X : Accredited Standards Committee X12,"Hardcode as ""X""",,,,,,,
,GS08,Version / Release / Industry Identifier Code,"Code indicating the version, release, subrelease, and industry identifier of the EDI standard being used, including the GS and GE segments; if code in DE455 in GS segment is X, then in DE 480 positions 1-3 are the version number; positions 4-6 are the release and subrelease, level of the version; and positions 7-12 are the industry or trade association identifiers (optionally assigned by user); if code in DE455 in GS segment is T, then other formats are allowed",R,005010X223 : Standards Approved for Publication by ASC X12 Procedures Review Board through October 2003,"Hardcode as ""005010X222A2""",,,,,,,
ST Transaction Set Header,,,,,,,,,,,,,
,ST,Segment: Transaction Set Header,,R,,,,,,,,,
,ST01,Transaction Set Identifier Code,Code uniquely identifying a Transaction Set,R,837 : Health Care Claim,837,,,,,,,
,ST02,Transaction Set Control Number,Identifying control number that must be unique within the transaction set functional group assigned by the originator for a transaction set,R,,Unique control number needs to populated from process flow or map,,,,,,,
,ST03,Implementation Convention Reference,Reference assigned to identify Implementation Convention,R,,005010X222A2,,,,,,,
BHT Beginning of Hierarchical Transaction,,,,,,,,,,,,,
,BHT,Segment: Beginning of Hierarchical Transaction,,R,,,,,,,,,
,BHT01,Hierarchical Structure Code,Code indicating the hierarchical application structure of a transaction set that utilizes the HL segment to define the structure of the transaction set,R,"0019 : Information Source, Subscriber, Dependent",0019,,,,,,,t
,BHT02,Transaction Set Purpose Code,Code identifying purpose of transaction set,R,"00 : Original
18 : Reissue","Hardcode as ""00""",,,,,,,
,BHT03,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,Auto Generate In EDIFECS.,,,,,,,
,BHT04,Date,Date expressed as CCYYMMDD where CC represents the first two digits of the calendar year,R,,"Map this value from  current date in the format of ""YYYYMMDD""",,,,,,,
,BHT05,Time,"Time expressed in 24-hour clock time as follows: HHMM, or HHMMSS, or HHMMSSD, or HHMMSSDD, where H = hours (00-23), M = minutes (00-59), S = integer seconds (00-59) and DD = decimal seconds; decimal seconds are expressed as follows: D = tenths (0-9) and DD = hundredths (00-99)",R,,"Map this value from   current Time in the format of ""HHMMSS""",,,,,,,
,BHT06,Transaction Type Code,Code specifying the type of transaction,R,"31 :  Subrogation Demand
CH : Chargeable
RP :  Reporting","Hardcode as ""RP""",,,,,,,
LOOP 1000A - SUBMITTER,,,,,,,,,,,,,
1000A,NM1,Submitter Name (Required),,R,,,,,,,,,
1000A,1000A.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,41 : Submitter,"Hardcode as ""41""",,,,,,,
1000A,1000A.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,"1 : Person
2 : Non-Person Entity","Hardcode as ""2""",,,,,,,
1000A,1000A.NM103,Name Last or Organization Name,ndividual last name or organizational name,R,,Hardcode <Default>,,,,,Yes,"Configurable value for Implementation team
PRODUCT",ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/payerInformation/hicName
1000A,1000A.NM104,Name First,Individual first name,S,,,,,,,,,
1000A,1000A.NM105,Name Middle,Individual middle name or initial,S,,,,,,,,,
1000A,1000A.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),R,46 : Electronic Transmitter Identification Number (ETIN),"Hardcode as ""46""",,,,,,,
1000A,1000A.NM109,Identification Code,Code identifying a party or other code,R,,"Default values
<123456789123>",,,,,Yes,"Configurable value for Implementation team
updated default values",ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/payerInformation/taxId
1000A,PER,Submitter EDI Contact Information (Required),,R,,,,,,,,,
1000A,1000A.PER01,Contact Function Code,Code identifying the major duty or responsibility of the person or group named,R,IC : Information Contact,"Hardcode  as ""IC""",,,,,,,
1000A,1000A.PER02,Name,Free-form name,S,,"""PRODUCT""",,,,,Yes,Configurable value for Implementation team,"Qn, 05/20 - what needs to be populated here for Piedmont?"
1000A,1000A.PER03,Communication Number Qualifier,Code identifying the type of communication number,R,"EM : Electronic Mail
 FX : Facsimile
TE : Telephone","Hardcode  as ""TE""",,,,,,,
1000A,1000A.PER04,Communication Number,Complete communications number including country or area code when applicable,R,,"Hardcode as ""1234567890""",,,,,Yes,"Configurable value for Implementation team
updated default values","Qn, 05/20 -What will be the contact number for Piedmont?"
1000A,1000A.PER05,Communication Number Qualifier,Code identifying the type of communication number,S,"EM : Electronic Mail
EX : Telephone Extension
FX : Facsimile
TE : Telephone",,,,,,,,
1000A,1000A.PER06,Communication Number,Complete communications number including country or area code when applicable,S,,,,,,,,,
1000A,1000A.PER07,Communication Number Qualifier,Code identifying the type of communication number,S,"EM : Electronic Mail
EX : Telephone Extension
FX : Facsimile
TE : Telephone",,,,,,,,
1000A,1000A.PER08,Communication Number,Complete communications number including country or area code when applicable,S,,,,,,,,,
LOOP 1000B - RECEIVER,,,,,,,,,,,,,
1000B,NM1,Receiver Name (Required),,R,,,,,,,,,
1000B,1000B.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,40 : Receiver,"Hardcode as ""40""",,,,,,,
1000B,1000B.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,2 : Non-Person Entity,"Hardcode as ""2""",,,,,,,
1000B,1000B.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,REPRICER_NAME,REPRICER_NAME,827,Claim,If the 1st line is not in 'Need Repricing' the logic should search for other lines which is in 'Need Repricing' state to update the Repricer Name,Yes,"Configurable value for Implementation team
PRODUCT","Qn, 05/20- If we can get the Receiver ID for First health and Aetna, EDIFECS can populate the Org name here. So need to get the Full name to be populated for both and Receiver id's
Details for First Health seems as below. Needs to get for Aetna also
Org Name: FIRST HEALTH Group Corp
Receiver id: 201736437"
1000B,1000B.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),R,46 : Electronic Transmitter Identification Number (ETIN),"Hardcode as ""46""",,,,,,,
1000B,1000B.NM109,Identification Code,Code identifying a party or other code,R,,"Default values
<123456789123>",042064683 - for Aetna,,,,Yes,configurable item need to update (based on repricer name,
LOOP 2000A - BILLING/PAY-TO PROVIDER HL LOOP,,,,,,,,,,,,,
2000A,HL,Billing Provider Hierarchical Level (Required),,R,,,,,,,,,
2000A,2000A.HL01,Hierarchical ID Number,A unique number assigned by the sender to identify a particular data segment in a hierarchical structure,R,"The first HL01 within each ST-SE envelope must begin with “1”,
and be incremented by one each time an HL is used in the
transaction. Only numeric values are allowed in HL01.",Generated by Edifecs,,,,,,,
2000A,2000A.HL03,Hierarchical Level Code,Code defining the characteristic of a level in a hierarchical structure,R,20 : Information Source,"Hardcode as ""20""",,,,,,,
2000A,2000A.HL04,Hierarchical Child Code,Code indicating if there are hierarchical child data segments subordinate to the level being described,R,1 : Additional Subordinate HL Data Segment in This Hierarchical Structure.,Generated by Edifecs,,,,,,,
2000A,PRV,Billing Provider Specialty Information,,S,,,,,,,,,
2000A,2000A.PRV01,Provider Code,Code identifying the type of provider,R,BI : Billing,,,,,,,,
2000A,2000A.PRV02,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"PXC : Health Care Provider Taxonomy Code
         CODE SOURCE 682: Health Care Provider Taxonomy",,,,,,,,
2000A,2000A.PRV03,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,,
2000A,CUR,Foreign Currency Information,,S,,,,,,,,,
2000A,2000A.CUR01,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,85 : Billing Provider,,,,,,,,
2000A,2000A.CUR02,Currency Code,Code (Standard ISO) for country in whose currency the charges are specified,R,,,,,,,,,
LOOP 2010AA - BILLING PROVIDER,,,,,,,,,,,,,
2010AA,NM1,Billing Provider Name (Required),,R,,,,,,,,,
2010AA,2010AA.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,85 : Billing Provider,"Hardcode as ""85""",,,,,,,
2010AA,2010AA.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,2 : Non-Person Entity,"Hardcode as ""2""",,,Claim,,,,
2010AA,2010AA.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,BILLING_NAME,BILLING_FULL_NAME,357,Claim,,,Iplus will receive the full name in last name field,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/ub92Info/supplierInformation/supplierName
2010AA,2010AA.NM104,Name First,,,,,,,,,,Iplus will receive the full name in first  name field,
2010AA,2010AA.NM105,Name Middle,,,,,,,,,,Sending it as blank,
2010AA,2010AA.NM107,Name Suffix,,,,,,,,,,Sending it as blank,
2010AA,2010AA.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),S,"XX : Centers for Medicare and Medicaid Services National Provider Identifier
       CODE SOURCE 537: Centers for Medicare and Medicaid Services National Provider Identifier","Hardcode as ""XX""",,,,,,,
2010AA,2010AA.NM109,Identification Code,Code identifying a party or other code,S,,BILLING_NPI,BILLING_NPI,351,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/ub92Info/supplierInformation/npi
2010AA,N3,Billing Provider Address (Required),,R,,,,,,,,,
2010AA,2010AA.N301,Address Information,Address information,R,,BILLING_ADDRESS_1,BILLING_ADDRESS_01,358,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/ub92Info/supplierInformation/address/address
2010AA,2010AA.N302,Address Information,Address information,S,,BILLING_ADDRESS_2,BILLING_ADDRESS_02,359,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/ub92Info/supplierInformation/address/address2
2010AA,N4,Billing Provider City/State/ZIP Code (Required),,R,,,,,,,,,
2010AA,2010AA.N401,City Name,Free-form text for city name,R,,BILLING_CITY,BILLING_CITY,360,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/ub92Info/supplierInformation/address/city
2010AA,2010AA.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,BILLING_STATE,BILLING_STATE,361,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/ub92Info/supplierInformation/address/stateCode
2010AA,2010AA.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,(BILLING_ZIP) + ( BILLING_ZIP_PLUS_4),(BILLING_ZIP) + ( BILLING_ZIP_PLUS_FOUR),362 + 363,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/ub92Info/supplierInformation/address/zipCode + ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/ub92Info/supplierInformation/address/zipExtension
2010AA,2010AA.N404,Country Code,Code identifying the country,S,,Leave it blank,,364,Claim,,,"I checked in OB Payment. Seems Country Code is not displaying in EDI. As we do not have any logic with Country Code and we are blocked with this issue (Snip Validation Error while translating with the Value as US), we can remove the Country Code mapping",ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/ub92Info/supplierInformation/address/countryCode
2010AA,2010AA.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,,,,
2010AA,REF,"REF - BILLING PROVIDER TAX
IDENTIFICATION",,R,,,,,,,,,
2010AA,2010AA.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,EI : Employer’s Identification Number,"Hardcode as ""EI""",,,,,,,
2010AA,2010AA.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,BILLING_TAXGROUP_ID,BILLING_TAXGROUP_ID,350,Claim,EI’ then it will be mapped into ‘XX-XXXXXXX’ format to taxIdentificationNumber(Remove hypen),,,"ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/ub92Info/supplierInformation/taxIdentificationNumber (1-50 bytes, no hyphens)"
2010AA,PER,Billing Provider Contact Information,,S,,,,,,,,,
2010AA,2010AA.PER01,Contact Function Code,Code identifying the major duty or responsibility of the person or group named,R,IC : Information Contact,,,,,,,,
2010AA,2010AA.PER02,Name,Free-form name,S,,,,,,,,,
2010AA,2010AA.PER03,Communication Number Qualifier,Code identifying the type of communication number,R,"EM : Electronic Mail
FX : Facsimile
TE : Telephone",,,,,,,,
2010AA,2010AA.PER04,Communication Number,Complete communications number including country or area code when applicable,R,,,,,,,,,
2010AA,2010AA.PER05,Communication Number Qualifier,Code identifying the type of communication number,S,"EM : Electronic Mail
EX : Telephone Extension
FX : Facsimile
TE : Telephone",,,,,,,,
2010AA,2010AA.PER06,Communication Number,Complete communications number including country or area code when applicable,S,,,,,,,,,
2010AA,2010AA.PER07,Communication Number Qualifier,Code identifying the type of communication number,S,"EM Electronic Mail
EX Telephone Extension
FX Facsimile
TE Telephone",,,,,,,,
2010AA,2010AA.PER08,Communication Number,"Complete communications number including country or area code when
applicable",S,,,,,,,,,
LOOP 2010AB - PAY-TO ADDRESS NAME,,,,,,,,,,,,,
2010AB,NM1,Pay-To Address Name,,S,,,,,,,,,
2010AB,2010AB.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,87 : Pay-to Provider,"Hardcode as ""87""",,,,,,,
2010AB,2010AB.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,2 : Non-Person Entity,"Hardcode as ""2""",,,,,,,
2010AB,N3,Pay-To Address (Required),,R,,,,,,,,,
2010AB,2010AB.N301,Address Information,Address information,R,,PAY_TO_ADDRESS_1,PAY_TO_ADDRESS_01,528,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/payToAddress/address
2010AB,2010AB.N302,Address Information,Address information,S,,PAY_TO_ADDRESS_2,PAY_TO_ADDRESS_02,529,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/payToAddress/address2
2010AB,N4,Pay-To Address City/State/ZIP Code (Required),,R,,,,,,,,,
,2010AB.N401,City Name,Free-form text for city name,R,,PAY_TO_CITY,PAY_TO_CITY,530,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/payToAddress/city
2010AB,2010AB.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,PAY_TO_STATE,PAY_TO_STATE,531,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/payToAddress/stateCode
2010AB,2010AB.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,(PAY_TO_ZIP) + ( PAY_TO_ZIP_PLUS_4),(PAY_TO_ZIP) + ( PAY_TO_ZIP_PLUS_FOUR),532 + 533,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/payToAddress/zipCode + ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/payToAddress/zipExtension
,2010AB.N404,Country Code,Code identifying the country,S,,Leave it blank,,534,Claim,,,"I checked in OB Payment. Seems Country Code is not displaying in EDI. As we do not have any logic with Country Code and we are blocked with this issue (Snip Validation Error while translating with the Value as US), we can remove the Country Code mapping",ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/payToAddress/countryCode
2010AB,2010AB.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,,,,
LOOP 2010AC - PAY-TO PLAN NAME,,,,,,,,,,,,,
2010AC,NM1,Pay-To Plan Name,,S,,,,,,,,,
2010AC,2010AC.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,PE : Payee,,,,,,,,
2010AC,2010AC.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,2 : Non-Person Entity,,,,,,,,
2010AC,2010AC.NM103,Name Last or Organization Name,Individual last name or organizational nam,R,,,,,,,,,
2010AC,2010AC.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),R,"PI : Payor Identification
 XV : Centers for Medicare and Medicaid Services PlanID",,,,,,,,
2010AC,2010AC.NM109,Identification Code,Code identifying a party or other code,R,,,,,,,,,
2010AC,N3,Pay-To Plan Address (Required),,R,,,,,,,,,
2010AC,2010AC.N301,Address Information,Address information,R,,,,,,,,,
2010AC,2010AC.N302,Address Information,Address information,S,,,,,,,,,
2010AC,N4,Pay-To Plan City/State/Zip Code (Required),,R,,,,,,,,,
2010AC,2010AC.N401,City Name,Free-form text for city name,R,,,,,,,,,
2010AC,2010AC.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,,,,,,,
2010AC,2010AC.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,,,,,,,,
2010AC,2010AC.N404,Country Code,Code identifying the country,S,,,,,,,,,
2010AC,2010AC.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,,,,
2010AC,REF,Pay-To Plan Secondary Identification,,S,,,,,,,,,
2010AC,2010AC.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"2U : Payer Identification Number
FY :Claim Office Number
NF : National Association of Insurance Commissioners (NAIC) Code",,,,,,,,
2010AC,2010AC.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,,
2010AC,REF,Pay-To Plan Tax Identification Number (Required),,R,,,,,,,,,
2010AC,2010AC.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,EI : Employer’s Identification Number,,,,,,,,
2010AC,2010AC.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,,
"LOOP 2000B - SUBSCRIBER HIERARCHICAL
LEVEL",,,,,,,,,,,,,
2000B,HL,Subscriber Hierarchical Level (Required),,R,,,,,,,,,
2000B,2000B.HL01,Hierarchical ID Number,A unique number assigned by the sender to identify a particular data segment in a hierarchical structure,R,,Generated by Edifecs,,,,,,,
2000B,2000B.HL02,Hierarchical Parent ID Number,Identification number of the next higher hierarchical data segment that the data segment being described is subordinate to,R,,2000A.HL01,,,,,,,
2000B,2000B.HL03,Hierarchical Level Code,Code defining the characteristic of a level in a hierarchical structure,R,22 : Subscriber,"Hardcode as ""22""",,,,,,,
2000B,2000B.HL04,Hierarchical Child Code,Code indicating if there are hierarchical child data segments subordinate to the level being described,R,"0 : No Subordinate HL Segment in This Hierarchical Structure.
1 : Additional Subordinate HL Data Segment in This Hierarchical Structure",Generated by Edifecs,,,,,,,
2000B,SBR,Subscriber Information (Required),,R,,,,,,,,,
2000B,2000B.SBR01,Payer Responsibility Sequence Number Code,Code identifying the insurance carrier’s level of responsibility for a payment of a claim,R,"A : Payer Responsibility Four
B : Payer Responsibility Five
C : Payer Responsibility Six
D : Payer Responsibility Seven
E : Payer Responsibility Eight
F : Payer Responsibility Nine
G : Payer Responsibility Ten
H : Payer Responsibility Eleven
P : Primary S Secondary
T : Tertiary
U : Unknown","Hardcode as ""P""",,,,,,,
2000B,2000B.SBR02,Individual Relationship Code,Code indicating the relationship between two individuals or entities,S,18 : Self,"Hardcode as ""18""",,,,Only if RELATIONSHIP_TO_SUB = Self (18),,,
2000B,2000B.SBR03,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifie,S,,SUB_MEMBER_GROUP_NUMBER,SUB_MEMBER_GROUP_NUMBER,823,Claim,,,,"AETNA:
ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/subscriptionInformation/groupNumber
if group number is '10302', then pass PDCNTRASF. Pass 'PEDMNT' for all other self Insured groups
FirstHealth:
Pass Acro ID's here"
2000B,2000B.SBR04,Name,Free-form name,S,,,,,,,,,
2000B,2000B.SBR09,Claim Filing Indicator Code,Code identifying type of claim,S,"11 : Other Non-Federal Programs
12 : Preferred Provider Organization (PPO)
13 : Point of Service (POS)
14 : Exclusive Provider Organization (EPO)
15 : Indemnity Insurance
16 : Health Maintenance Organization (HMO) Medicare
Risk
17 : Dental Maintenance Organization
AM : Automobile Medical
BL : Blue Cross/Blue Shield
CH : Champus
CI : Commercial Insurance Co.
DS : Disability
FI : Federal Employees Program
HM : Health Maintenance Organization
LM : Liability Medical
MA : Medicare Part A
MB : Medicare Part B
MC : Medicaid
OF : Other Federal Program
TV : Title V
VA : Veterans Affairs Plan
WC : Workers’ Compensation Health Claim
ZZ : Mutually Defined",SUB_CLAIM_FILING_CODE,SUB_CLAIM_FILING_CODE,824,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/baseBenefitPlan/product/planType
LOOP 2010BA - SUBSCRIBER NAME,,,,,,,,,,,,,
2010BA,NM1,Subscriber Name (Required),,R,,,,,,,,,
2010BA,2010BA.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,IL Insured or Subscriber,"Hardcode as ""IL""",,,,,,,
2010BA,2010BA.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,"1 Person
2 Non-Person Entity","Hardcode as ""1""",,,,,,,
2010BA,2010BA.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,SUB_LAST_NAME,SUB_LAST_NAME,502,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/ub92Info/subscriberInformation/individual/lastName
2010BA,2010BA.NM104,Name First,Individual first name,S,,SUB_FIRST_NAME,SUB_FIRST_NAME,503,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/ub92Info/subscriberInformation/individual/firstName
2010BA,2010BA.NM105,Name Middle,Individual middle name or initial,S,,SUB_MIDDLE_NAME,SUB_MIDDLE_NAME,504,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/ub92Info/subscriberInformation/individual/middleName
2010BA,2010BA.NM107,Name Suffix,Suffix to individual name,S,,SUB_NAME_SUFFIX,SUB_NAME_SUFFIX,505,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/ub92Info/subscriberInformation/individual/nameSuffix
2010BA,2010BA.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),R,"II : Standard Unique Health Identifier for each Individual
in the United States
MI : Member Identification Number","Hardcode as ""MI""",,,,,,,
2010BA,2010BA.NM109,Identification Code,Code identifying a party or other code,R,,SUB_ID,SUB_ID,3,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/subscriptionInformation/hccId
2010BA,N3,Subscriber Address,,S,,,,,,,,,
2010BA,2010BA.N301,Address Information,Address information,R,,SUB_ADDRESS_1,SUB_ADDRESS_01,506,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/subscriptionInformation/correspondenceAddress/address
2010BA,2010BA.N302,Address Information,Address information,S,,SUB_ADDDRESS_2,SUB_ADDRESS_02,507,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/subscriptionInformation/correspondenceAddress/address2
2010BA,N4,Subscriber City/State/ZIP Code,,R,,,,,,,,,
2010BA,2010BA.N401,City Name,Free-form text for city name,R,,SUB_CITY,SUB_CITY,508,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/subscriptionInformation/correspondenceAddress/city
2010BA,2010BA.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,SUB_STATE,SUB_STATE,509,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/subscriptionInformation/correspondenceAddress/stateCode
.,2010BA.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,SUB_ZIP + SUB_ZIP_PLUS_4,(SUB_ZIP) + ( SUB_ZIP_PLUS_FOUR),510 + 511,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/subscriptionInformation/correspondenceAddress/zipCode + ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/subscriptionInformation/correspondenceAddress/zipExtension
2010BA,2010BA.N404,Country Code,Code identifying the country,S,,Leave it blank,,512,Claim,,,"I checked in OB Payment. Seems Country Code is not displaying in EDI. As we do not have any logic with Country Code and we are blocked with this issue (Snip Validation Error while translating with the Value as US), we can remove the Country Code mapping",ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/subscriptionInformation/correspondenceAddress/countryCode
2010BA,2010BA.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,,,,
2010BA,DMG,Subscriber Demographic Information,,S,,,,,,,,,
2010BA,2010BA.DMG01,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 : Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2010BA,2010BA.DMG02,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,SUB_DOB,SUB_DOB,514,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/subscriptionInformation/subscriber/birthDate
2010BA,2010BA.DMG03,Gender Code,Code indicating the sex of the individual,R,"F : Female
M : Male
U : Unknown",SUB_GENDER_ID,SUB_GENDER_ID,515,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/subscriptionInformation/subscriber/genderCode
2010BA,REF,Subscriber Secondary Identification,,S,,,,,,,,,
2010BA,2010BA.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,SY : Social Security Number,,,,,,,,
2010BA,2010BA.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,,
2010BA,REF,Property and Casualty Claim Number,,S,,,,,,,,,
2010BA,2010BA.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,Y4 : Agency Claim Number,,,,,,,,
2010BA,2010BA.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,,
LOOP 2010BB - PAYER NAME,,,,,,,,,,,,,
2010BB,NM1,Payer Name (Required),,R,,,,,,,,,
2010BB,2010BB.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,PR : Payer,"Hardcode as ""PR""",,,,,,,
2010BB,2010BB.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,2 : Non-Person Entity,"Hardcode as ""2""",,,,,,,
2010BB,2010BB.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,Product,,,,,Yes,Configurable value for Implementation team,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/payerInformation/hicName
2010BB,2010BB.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),R,"PI : Payor Identification
XV : Centers for Medicare and Medicaid Services PlanID","Hardcode as ""PI""",,,,,,,
2010BB,2010BB.NM109,Identification Code,Code identifying a party or other code,R,,"Default value ""1234567""",,,,,Yes,"Configurable value for Implementation team
updated default values",ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/payerInformation/taxId
2010BB,N3,Payer Address,,S,,,,,,,,,
2010BB,2010BB.N301,Address Information,Address Information,R,,"Hardcode as ""XXXX""",,,,,,Not found In hrdw . Hence hardcode,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/payerInformation/hicAddress/address
2010BB,2010BB.N302,Address Information,Address Information,S,,,,,,,,Not found In hrdw . Hence hardcode,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/payerInformation/hicAddress/address2
2010BB,N4,Payer City/State/ZIP Code,,R,,,,,,,,,
2010BB,2010BB.N401,City Name,Free-form text for city name,R,,"Default value as ""Product""",,,,,,Configurable value for Implementation team. Random values updated,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/payerInformation/hicAddress/city
2010BB,2010BB.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,"Default  value as ""CO""",,,,,,Configurable value for Implementation team. Random values updated,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/payerInformation/hicAddress/stateCode
2010BB,2010BB.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,"Default  value as ""80014""",,,,,,Configurable value for Implementation team. Random values updated,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/payerInformation/hicAddress/zipCode + ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/payerInformation/hicAddress/zipExtension
2010BB,2010BB.N404,Country Code,Code identifying the country,S,,Leave it blank,,,,,,"Configurable value for Implementation team. Random values updated
20/6/2024: CO cannot be hardcoded as it is not a valid value. So leaving it Blank",ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/payerInformation/hicAddress/countryCode
2010BB,2010BB.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,,,,
2010BB,REF,Payer Secondary Identification,,S,,,,,,,,,
2010BB,2010BB.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,S,"2U : Payer Identification Number
EI : Employer’s Identification Number
FY : Claim Office Number
NF : National Association of Insurance Commissioners
(NAIC) Code",,,,,,,,
2010BB,2010BB.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,,
2010BB,REF,Billing Provider Secondary Identification,,S,,,,,,,,,
2010BB,2010BB.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"G2 Provider Commercial Number
LU Location Number",,,,,,,,
2010BB,2010BB.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,,
LOOP 2000C - PATIENT HIERARCHICAL LEVEL,,,,,,,,,,,,,
2000C,HL,Patient Hierarchical Level,,S,,,,,,,,,
2000C,2000C.HL01,Hierarchical ID Number,A unique number assigned by the sender to identify a particular data segment in a hierarchical structure,R,,System Generated,,,,,,,
2000C,2000C.HL02,Hierarchical Parent ID Number,Identification number of the next higher hierarchical data segment that the data segment being described is subordinate to,R,,2000B.HL01,,,,,,,
2000C,2000C.HL03,Hierarchical Level Code,Code defining the characteristic of a level in a hierarchical structure,R,23 : Dependent,"Hardcode as ""23""",,,,,,,
2000C,2000C.HL04,Hierarchical Child Code,Code indicating if there are hierarchical child data segments subordinate to the level being described,R,"0 : No Subordinate HL Segment in This Hierarchical
Structure.","Hardcode as ""0""",,,,,,,
2000C,PAT,Patient Information (Required),,R,,,,,,,,,
2000C,2000C.PAT01,Individual Relationship Code,Code indicating the relationship between two individuals or entities,R,"01 : Spouse
19 : Child
20 : Employee
21 : Unknown
39 : Organ Donor
40 : Cadaver Donor
53 : Life Partner
G8 : Other Relationship",RELATIONSHIP_TO_SUB,RELATIONSHIP_TO_SUB,16,Claim,Generate 2000C loop only if  RELATIONSHIP_TO_SUB   is not 18,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/patientInformation/relationshipToSubscriber
LOOP 2010CA - PATIENT NAME,,,,,,,,,,,,,
2010CA,NM1,Patient Name (Required),,R,,,,,,,,,
2010CA,2010CA.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,QC : Patient,"Hardcode as ""QC""",,,,,,,
2010CA,2010CA.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,1 : Person,"Hardcode as ""1""",,,,,,,
2010CA,2010CA.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,PATIENT_LAST_NAME,PATIENT_LAST_NAME,12,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/ub92Info/memberInformation/individual/lastName
2010CA,2010CA.NM104,Name First,Individual first name,S,,PATIENT_FIRST_NAME,PATIENT_FIRST_NAME,13,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/ub92Info/memberInformation/individual/firstName
2010CA,2010CA.NM105,Name Middle,Individual middle name or initial,S,,PATIENT_MIDDLE_NAME,PATIENT_MIDDLE_NAME,14,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/ub92Info/memberInformation/individual/middleName
2010CA,2010CA.NM107,Name Suffix,Suffix to individual name,S,,PATIENT_NAME_SUFFIX,PATIENT_NAME_SUFFIX,15,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/ub92Info/memberInformation/individual/nameSuffix
2010CA,N3,Patient Address (Required),,R,,,,,,,,,
2010CA,2010CA.N301,Address Information,Address information,R,,PATIENT_ADDRESS_1,PATIENT_ADDRESS_01,517,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/patientInformation/correspondenceAddress/address
2010CA,2010CA.N302,Address Information,Address information,S,,PATIENT_ADDRESS_2,PATIENT_ADDRESS_02,518,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/patientInformation/correspondenceAddress/address2
2010CA,N4,Patient City/State/ZIP Code (Required),,R,,,,,,,,,
2010CA,2010CA.N401,City Name,Free-form text for city name,R,,PATIENT_CITY,PATIENT_CITY,519,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/patientInformation/correspondenceAddress/city
2010CA,2010CA.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,PATIENT_STATE,PATIENT_STATE,520,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/patientInformation/correspondenceAddress/stateCode
2010CA,2010CA.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,(PATIENT_ZIP) + ( PATIENT_ZIP_PLUS_4),(PATIENT_ZIP) + ( PATIENT_ZIP_PLUS_FOUR),521 + 522,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/patientInformation/correspondenceAddress/zipCode + ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/patientInformation/correspondenceAddress/zipExtension
2010CA,2010CA.N404,Country Code,Code identifying the country,S,,Leave it blank,,523,Claim,,,"I checked in OB Payment. Seems Country Code is not displaying in EDI. As we do not have any logic with Country Code and we are blocked with this issue (Snip Validation Error while translating with the Value as US), we can remove the Country Code mapping",ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/patientInformation/correspondenceAddress/countryCode
2010CA,2010CA.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,,,,
2010CA,DMG,Patient Demographic Information (Required),,R,,,,,,,,,
2010CA,2010CA.DMG01,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 : Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2010CA,2010CA.DMG02,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,PATIENT_DOB,PATIENT_DOB,5,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/patientInformation/member/birthdate
2010CA,2010CA.DMG03,Gender Code,Code indicating the sex of the individuaL,R,"F : Female
M : Male
U : Unknown",PATIENT_GENDER_ID,PATIENT_GENDER_ID,6,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/patientInformation/member/genderCode
2010CA,REF,Property and Casualty Claim Number,,S,,,,,,,,,
2010CA,2010CA.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,Y4 :  Agency Claim Number,,,,,,,,
2010CA,2010CA.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,,
LOOP 2300 - CLAIM INFORMATION,,,,,,,,,,,,,
2300,CLM,Claim information (Required),,R,,,,,,,,,
2300,2300.CLM01,Claim Submitter's Identifier,Identifier used to track a claim from creation by the health care provider through payment,R,,PATIENT_CONTROL_NUMBER,PATIENT_CONTROL_NUM,11,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/patientControlNumber
2300,2300.CLM02,Monetary Amount,Monetary amount,R,,CLAIM_BILLED_AMOUNT,CLAIM_BILLED_AMOUNT,438,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/requestedFeeAmount
2300,2300.CLM05,Healthcare service location information,To provide information that identifies the place of service or the type of bill related to the location at which a health care service was rendered,R,,,,,,,,,
2300,2300.CLM05.01,Facility Code Value,"Code identifying where services were, or may be, performed; the first and second positions of the Uniform Bill Type Code for Institutional Services or the Place of Service Codes for Professional or Dental Services.",R,,BILL_TYPE,BILL_TYPE,21,Claim,,,,First 2 Bytes of ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/typeOfBillCode
2300,2300.CLM05.02,Facility Code Qualifier,Code identifying the type of facility referenced,R,A : Uniform Billing Claim Form Bill Type,"Hardcode as ""A""",,,,,,,
2300,2300.CLM05.03,Claim Frequency Type Code,Code specifying the frequency of the claim; this is the third position of the Uniform Billing Claim Form Bill Type,R,,CLAIM_FREQUENCY_CODE,CLAIM_FREQUENCY_CODE,828,Claim,,,,The 3rd byte of ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/typeOfBillCode
2300,2300.CLM07,Provider Accept Assignment Code,Code indicating whether the provider accepts assignment,R,"A : Assigned
B : Assignment Accepted on Clinical Lab Services Only
C : Not Assigned",ASSIGNMENT_ACCEPTANCE,ASSIGNMENT_ACCEPTANCE,825,Claim,"If the 2300.CLM07 Enumuration Value is ""A"" display ""Y""
If the 2300.CLM07 Enumuration Value is ""C"" display ""N""",,"""Y"" and ""N"" are the valid values. So the below logic to be followed
Maps assignment acceptance as ""Y"" for ""A"" and ""N"" for ""C""
if(Fields[4] == ""A"")
{
	Fields[4] = ""Y"";
}
else if (Fields[4] == ""C"")
{
	Fields[4] = ""N"";
}",ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/benefitAssignment
2300,2300.CLM08,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,R,"N No
W Not Applicable
Y Yes",ASSIGNMENT_OF_BENEFITS,ASSIGNMENT_OF_BENEFITS,437,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/assignmentAcceptance
2300,2300.CLM09,Release of Information Code,Code indicating whether the provider has on file a signed statement by the patient authorizing the release of medical data to other organizations,R,"I Informed Consent to Release Medical Information
for Conditions or Diagnoses Regulated by Federal
Statutes
Y Yes, Provider has a Signed Statement Permitting
Release of Medical Billing Data Related to a Claim",INFORMATION_RELEASE,INFORMATION_RELEASE,826,Claim,,,(New field)Iplus should provide the details,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/informationRelease
2300,2300.CLM20,Delay Reason Code,Code indicating the reason why a request was delayed,S,"1 Proof of Eligibility Unknown or Unavailable
2 Litigation
3 Authorization Delays
4 Delay in Certifying Provider
5 Delay in Supplying Billing Forms
6 Delay in Delivery of Custom-made Appliances
7 Third Party Processing Delay
8 Delay in Eligibility Determination
9 Original Claim Rejected or Denied Due to a Reason
Unrelated to the Billing Limitation Rules
10 Administration Delay in the Prior Approval Process
11 Other
15 Natural Disaster",,,,,,,,
2300,DTP,Discharge Date/Hour,,S,,,,,,,,,
2300,2300.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,096 Discharge,"Hardcode as ""96""",,,,,,,
2300,2300.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,TM Time Expressed in Format HHMM,"Hardcode as ""TM""",,,,,,,
2300,2300.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,"DISCHARGE_TIME_HH
DISCHARGE_TIME_MM","DISCHARGE_TIME_HH
DISCHARGE_TIME_MM",103 + 104,Claim,,,Two separate fields in DFF which needs to be appended and displayed together in EDI,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/dischargeTime
2300,DTP,Statement Dates (Required),,R,,,,,,,,,
2300,2300.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,434 : Statement,"Hardcode as ""434""",,,,,,,
2300,2300.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8 : Range of Dates Expressed in Format CCYYMMDDCCYYMMDD,"Hardcode as ""RD8""",,,,,,,
2300,2300.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,CLAIM_DOS_FROM + CLAIM_DOS_TO,"CLAIM_DOS_BEGIN_DATE +
CLAIM_DOS_END_DATE",94 + 95,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/startDate + ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/endDate
2300,DTP,Admission Date/Hour,,S,,,,,,,,,
2300,2300.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,435 : Admission,"Hardcode as ""435""",,,,,,,
2300,2300.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,"D8 : Date Expressed in Format CCYYMMDD
DT : Date and Time Expressed in Format
CCYYMMDDHHMM","Hardcode as ""DT""",,,,,,,
2300,2300.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,"ADMIT_DATE +
ADMIT_TIME_HH / ADMIT_TIME_MM","ADMIT_DATE +
ADMIT_TIME_HH / ADMIT_TIME_MM",97 + 98/99,Claim,,,,"ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/admitDate +
ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/admitTime"
2300,DTP,Date - Repricer Received Date,,S,,,,,,,,,
2300,2300.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,050 Received,,,,,,,,
2300,2300.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,,,,,,,,
2300,2300.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,,,,,
2300,CL1,Institutional Claim Code (Required),,R,,,,,,,,,
2300,2300.CL101,Admission Type Code,Code indicating the priority of this admission,S,,ADMIT_TYPE,ADMIT_TYPE,100,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/admissionTypeCode
2300,2300.CL102,Admission Source Code,Code indicating the source of this admission,S,,ADMIT_SOURCE_CODE,ADMIT_SOURCE_CODE,101,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/admissionSource
2300,2300.CL103,Patient Status Code,Code indicating patient status as of the “statement covers through date”,R,,DISCHARGE_STATUS,DISCHARGE_STATUS,105,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/dischargeStatus
2300,PWK,Claim Supplemental Information,,S,,,,,,,,,
2300,2300.PWK01,Report Type Code,"Code indicating the title or contents of a document, report or supporting item",R,"03 Report Justifying Treatment Beyond Utilization
Guidelines
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
A3 Allergies/Sensitivities Document
A4 Autopsy Report
AM Ambulance Certification
AS Admission Summary
B2 Prescription
B3 Physician Order
B4 Referral Form
BR Benchmark Testing Results
BS Baseline
BT Blanket Test Results
CB Chiropractic Justification
CK Consent Form(s)
CT Certification
D2 Drug Profile Document
DA Dental Models
DB Durable Medical Equipment Prescription
DG Diagnostic Report
DJ Discharge Monitoring Report
DS Discharge Summary
EB Explanation of Benefits (Coordination of Benefits or
Medicare Secondary Payor)
HC Health Certificate
HR Health Clinic Records
I5 Immunization Record
IR State School Immunization Records
LA Laboratory Results
M1 Medical Record Attachment
MT Models
NN Nursing Notes
OB Operative Note
OC Oxygen Content Averaging Report
OD Orders and Treatments Document
OE Objective Physical Examination (including vital
signs) Document
OX Oxygen Therapy Certification
OZ Support Data for Claim
P4 Pathology Report
P5 Patient Medical History Document
PE Parenteral or Enteral Certification
PN Physical Therapy Notes
PO Prosthetics or Orthotic Certification
PQ Paramedical Results
PY Physician’s Report
PZ Physical Therapy Certification
RB Radiology Films
RR Radiology Reports
RT Report of Tests and Analysis Report
RX Renewable Oxygen Content Averaging Report
SG Symptoms Document
V5 Death Notification
XP Photographs",,,,,,,,
2300,2300.PWK02,Report Transmission Code,"Code defining timing, transmission method or format by which reports are to be sent",R,"AA Available on Request at Provider Site
BM By Mail
EL Electronically Only
EM E-Mail
FT File Transfer
FX By Fax",,,,,,,,
2300,2300.PWK05,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),R,AC Attachment Control Number,,,,,,,,
2300,2300.PWK06,Identification Code,Code identifying a party or other code,S,,,,,,,,,
2300,CN1,Contract Information,,S,,,,,,,,,
2300,2300.CN101,Contract Type Code,Code identifying a contract type,R,"01 Diagnosis Related Group (DRG)
02 Per Diem
03 Variable Per Diem
04 Flat
05 Capitated
06 Percent
09 Other",,,,,,,,
2300,2300.CN102,Monetary Amount,Monetary amount,S,,,,,,,,,
2300,2300.CN103,"Percent, Decimal Format","Percent given in decimal format (e.g., 0.0 through 100.0 represents 0% through 100%)",S,,,,,,,,,
2300,2300.CN104,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,S,,,,,,,,,
2300,2300.CN105,Terms Discount Percent,"Terms discount percentage, expressed as a percent, available to the purchaser if an invoice is paid on or before the Terms Discount Due Date",S,,,,,,,,,
2300,2300.CN106,Version Identifier,"Revision level of a particular format, program, technique or algorithm",S,,,,,,,,,
2300,AMT,Patient Estimated Amount Due,,S,,,,,,,,,
2300,2300.AMT01,Amount Qualifier Code,Code to qualify amount,R,F3 Patient Responsibility - Estimated,,,,,,,,
2300,2300.AMT02,Monetary Amount,Monetary amount,R,,,,,,,,,
2300,REF,Service Authorization Exception Code,,S,,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,4N Special Payment Reference Number,,,,,,,,
d,2300.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,,
2300,REF,Referral Number,,S,,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,9F Referral Number,,,,,,,,
2300,2300.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,,
2300,REF,Prior Authorization,,S,,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,G1 Prior Authorization Number,,,,,,,,
2300,2300.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,,
2300,REF,Payer Claim Control Number,,S,,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,F8 Original Reference Number,"Hardcode as ""F8""",,,,,,,
2300,2300.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,CLAIM_ID_ORIG,CLAIM_ID_ORIG,482,Claim,"Map only for
 void/replacement claims (2300.CLM05.03 = '7' or '8'
Deepthi(30/7):
Map only for replacement claims (2300.CLM05.03 = '7')",,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hccId
2300,REF,Repriced Claim Number,,S,,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,9A Repriced Claim Reference Number,,,,,,,,
2300,2300.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,,
2300,REF,Adjusted Repriced Claim Number,,S,,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,9C Adjusted Repriced Claim Reference Number,,,,,,,,
2300,2300.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,,
2300,REF,Investigational Device Exemption Number,,S,,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,LX Qualified Products List,,,,,,,,
2300,2300.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,,
2300,REF,Claim Identification For Transmission Intermediaries,,S,,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,D9 Claim Number,"Hardcode as ""D9""",,,,,,,
2300,2300.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,CLAIM_ID,CLAIM_ID,18,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hccId
2300,REF,Auto Accident State,,S,,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,LU Location Number,,,,,,,,
2300,2300.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,,
2300,REF,Medical Record Number,,S,,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,EA Medical Record Identification Number,"Hardcode as ""EA""",,,,,,,
2300,2300.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,MED_REC_NO,MED_REC_NO,20,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/medicalRecordNumber
2300,REF,Demonstration Project Identifier,,S,,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,P4 Project Code,,,,,,,,
2300,2300.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,,
2300,REF,Peer Review Organization (PRO) Approval Number,,S,,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,G4 Peer Review Organization (PRO) Approval Number,,,,,,,,
2300,2300.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,,
2300,K3,File Information,,S,,,,,,,,,
2300,2300.K301,Fixed Format Information,Data in fixed format agreed upon by sender and receiver,R,,,,,,,,,
2300,NTE,Claim Note,,S,,,,,,,,,
2300,2300.NTE01,Note Reference Code,Code identifying the functional area or purpose for which the note applies,R,"ALG Allergies
DCP Goals, Rehabilitation Potential, or Discharge Plans
DGN Diagnosis Description
DME Durable Medical Equipment (DME) and Supplies
MED Medications
NTR Nutritional Requirements
ODT Orders for Disciplines and Treatments
RHB Functional Limitations, Reason Homebound, or Both
RLH Reasons Patient Leaves Home
RNH Times and Reasons Patient Not at Home
SET Unusual Home, Social Environment, or Both
SFM Safety Measures
SPT Supplementary Plan of Treatment
UPI Updated Information",,,,,,,,
2300,2300.NTE02,Description,A free-form description to clarify the related data elements and their content,R,,,,,,,,,
2300,NTE,Billing Note,,S,,,,,,,,,
2300,2300.NTE01,Note Reference Code,Code identifying the functional area or purpose for which the note applies,R,ADD Additional Information,,,,,,,,
2300,2300.NTE02,Description,,R,,,,,,,,,
2300,CRC,EPSDT Referral,,S,,,,,,,,,
2300,2300.CRC01,Code Category,Specifies the situation or category to which the code applies,R,ZZ Mutually Defined,,,,,,,,
2300,2300.CRC02,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,R,"N No
Y Yes",,,,,,,,
2300,2300.CRC03,Condition Indicator,Code indicating a condition,R,"AV Available - Not Used
NU Not Used
S2 Under Treatment
ST New Services Requested",,,,,,,,
2300,2300.CRC04,Condition Indicator,Code indicating a condition,S,,,,,,,,,
2300,2300.CRC05,Condition Indicator,Code indicating a condition,S,,,,,,,,,
2300,HI,Principal Diagnosis (Required),,R,,,,,,,,,
2300,2300.HI01,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",R,,,,,,,,,
2300,2300.HI01.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABK International Classification of Diseases Clinical Modification (ICD-10-CM) Principal Diagnosis
BK International Classification of Diseases Clinical
Modification (ICD-9-CM) Principal Diagnosis","Hardcode as ""ABK""",,,,,,,
2300,2300.HI01.02,Industry Code,Code indicating a code from a specific industry code list,R,,PRINCIPAL_DIAGNOSIS_CODE,PRINCIPAL_DIAGNOSIS_CODE,121,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/principalDiagnosis/diagnosisCode
2300,2300.HI01.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",PRINCIPAL_DIAGNOSIS_POA,PRINCIPAL_DIAGNOSIS_POA,122,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/principalDiagnosis/poaIndicator
2300,HI,Admitting Diagnosis,,S,,,,,,,,,
2300,2300.HI01,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",R,,,,,,,,,
2300,2300.HI01.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABJ International Classification of Diseases Clinical
Modification (ICD-10-CM) Admitting Diagnosis
International Classification of Diseases Clinical
Modification (ICD-9-CM) Admitting Diagnosis","Hardcode as ""ABJ""",,,,,,,
2300,2300.HI01.02,Industry Code,Code indicating a code from a specific industry code list,R,,ADMITTING_DIAGNOSIS,ADMITTING_DIAGNOSIS,196,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/admitDiagnosis/diagnosisCode
2300,HI,Patient Reason For Visit,,S,,,,,,,,,
2300,2300.HI01,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",R,,,,,,,,,
2300,2300.HI01.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"APR International Classification of Diseases Clinical
Modification (ICD-10-CM) Patient’s Reason for Visit
PR International Classification of Diseases Clinical
Modification (ICD-9-CM) Patient’s Reason for Visit","Hardcode as ""APR""",,,,,,,
2300,2300.HI01.02,Industry Code,Code indicating a code from a specific industry code list,R,,PATIENTS_REASON_FOR_VISIT_1,PATIENT_REASON_FOR_VISIT_01,234,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/reasonForVisitDiagnosis/diagnosisInfo/diagnosisCode
2300,2300.HI02,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI02.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"APR International Classification of Diseases Clinical
Modification (ICD-10-CM) Patient’s Reason for Visit
PR International Classification of Diseases Clinical
Modification (ICD-9-CM) Patient’s Reason for Visit","Hardcode as ""APR""",,,,,,,
2300,2300.HI02.02,Industry Code,Code indicating a code from a specific industry code list,R,,PATIENTS_REASON_FOR_VISIT_2,PATIENT_REASON_FOR_VISIT_02,236,Claim,,,,
2300,2300.HI03,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI03.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"APR International Classification of Diseases Clinical
Modification (ICD-10-CM) Patient’s Reason for Visit
PR International Classification of Diseases Clinical
Modification (ICD-9-CM) Patient’s Reason for Visit","Hardcode as ""APR""",,,,,,,
2300,2300.HI03.02,Industry Code,Code indicating a code from a specific industry code list,R,,PATIENTS_REASON_FOR_VISIT_3,PATIENT_REASON_FOR_VISIT_03,238,Claim,,,,
2300,HI,External Cause of Injury,,S,,,,,,,,,
2300,2300.HI01,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",R,,,,,,,,,
2300,2300.HI01.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABN International Classification of Diseases Clinical Modification (ICD-10-CM) External Cause of Injury Code
BN International Classification of Diseases Clinical
Modification (ICD-9-CM) External Cause of Injury
Code (E-codes)","Hardcode as ""ABN""",,,,,,,
2300,2300.HI01.02,Industry Code,Code indicating a code from a specific industry code list,R,,EXTERNAL_CAUSE_OF_INJURY_1,EXTERNAL_CAUSE_OF_INJURY_01,198,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/externalDiagnosis/diagnosisInfo/diagnosisCode
2300,2300.HI01.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",EXTERNAL_CAUSE_OF_INJURY_1_POA,EXTERNAL_CAUSE_OF_INJURY_01_POA,199,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/externalDiagnosis/diagnosisInfo/poaIndicator
2300,2300.HI02,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI02.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABN International Classification of Diseases Clinical Modification (ICD-10-CM) External Cause of Injury Code
BN International Classification of Diseases Clinical
Modification (ICD-9-CM) External Cause of Injury
Code (E-codes)","Hardcode as ""ABN""",,,,,,,
2300,2300.HI02.02,Industry Code,Code indicating a code from a specific industry code list,R,,EXTERNAL_CAUSE_OF_INJURY_2,EXTERNAL_CAUSE_OF_INJURY_02,201,Claim,,,,
2300,2300.HI02.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",EXTERNAL_CAUSE_OF_INJURY_2_POA,EXTERNAL_CAUSE_OF_INJURY_02_POA,202,Claim,,,,
2300,2300.HI03,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI03.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABN : International Classification of Diseases Clinical Modification (ICD-10-CM) External Cause of Injury Code
BN : International Classification of Diseases Clinical
Modification (ICD-9-CM) External Cause of Injury
Code (E-codes)","Hardcode as ""ABN""",,,,,,,
2300,2300.HI03.02,Industry Code,Code indicating a code from a specific industry code list,R,,EXTERNAL_CAUSE_OF_INJURY_3,EXTERNAL_CAUSE_OF_INJURY_03,204,Claim,,,,
2300,2300.HI03.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",EXTERNAL_CAUSE_OF_INJURY_3_POA,EXTERNAL_CAUSE_OF_INJURY_03_POA,205,Claim,,,,
2300,2300.HI04,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI04.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABN International Classification of Diseases Clinical Modification (ICD-10-CM) External Cause of Injury Code
BN International Classification of Diseases Clinical
Modification (ICD-9-CM) External Cause of Injury
Code (E-codes)","Hardcode as ""ABN""",,,,,,,
2300,2300.HI04.02,Industry Code,Code indicating a code from a specific industry code list,R,,EXTERNAL_CAUSE_OF_INJURY_4,EXTERNAL_CAUSE_OF_INJURY_04,207,Claim,,,,
2300,2300.HI04.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",EXTERNAL_CAUSE_OF_INJURY_4_POA,EXTERNAL_CAUSE_OF_INJURY_04_POA,208,Claim,,,,
2300,2300.HI05,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI05.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABN International Classification of Diseases Clinical Modification (ICD-10-CM) External Cause of Injury Code
BN International Classification of Diseases Clinical
Modification (ICD-9-CM) External Cause of Injury
Code (E-codes)","Hardcode as ""ABN""",,,,,,,
2300,2300.HI05.02,Industry Code,Code indicating a code from a specific industry code list,R,,EXTERNAL_CAUSE_OF_INJURY_5,EXTERNAL_CAUSE_OF_INJURY_05,210,Claim,,,,
2300,2300.HI05.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",EXTERNAL_CAUSE_OF_INJURY_5_POA,EXTERNAL_CAUSE_OF_INJURY_05_POA,211,Claim,,,,
2300,2300.HI06,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI06.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABN International Classification of Diseases Clinical Modification (ICD-10-CM) External Cause of Injury Code
BN International Classification of Diseases Clinical
Modification (ICD-9-CM) External Cause of Injury
Code (E-codes)","Hardcode as ""ABN""",,,,,,,
2300,2300.HI06.02,Industry Code,Code indicating a code from a specific industry code list,R,,EXTERNAL_CAUSE_OF_INJURY_6,EXTERNAL_CAUSE_OF_INJURY_06,213,Claim,,,,
2300,2300.HI06.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",EXTERNAL_CAUSE_OF_INJURY_6_POA,EXTERNAL_CAUSE_OF_INJURY_06_POA,214,Claim,,,,
2300,2300.HI07,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI07.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABN International Classification of Diseases Clinical Modification (ICD-10-CM) External Cause of Injury Code
BN International Classification of Diseases Clinical
Modification (ICD-9-CM) External Cause of Injury
Code (E-codes)","Hardcode as ""ABN""",,,,,,,
2300,2300.HI07.02,Industry Code,Code indicating a code from a specific industry code list,R,,EXTERNAL_CAUSE_OF_INJURY_7,EXTERNAL_CAUSE_OF_INJURY_07,216,Claim,,,,
2300,2300.HI07.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",EXTERNAL_CAUSE_OF_INJURY_7_POA,EXTERNAL_CAUSE_OF_INJURY_07_POA,217,Claim,,,,
2300,2300.HI08,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI08.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABN International Classification of Diseases Clinical Modification (ICD-10-CM) External Cause of Injury Code
BN International Classification of Diseases Clinical
Modification (ICD-9-CM) External Cause of Injury
Code (E-codes)","Hardcode as ""ABN""",,,,,,,
2300,2300.HI08.02,Industry Code,Code indicating a code from a specific industry code list,R,,EXTERNAL_CAUSE_OF_INJURY_8,EXTERNAL_CAUSE_OF_INJURY_08,219,Claim,,,,
2300,2300.HI08.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",EXTERNAL_CAUSE_OF_INJURY_8_POA,EXTERNAL_CAUSE_OF_INJURY_08_POA,220,Claim,,,,
2300,2300.HI09,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI09.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABN International Classification of Diseases Clinical Modification (ICD-10-CM) External Cause of Injury Code
BN International Classification of Diseases Clinical
Modification (ICD-9-CM) External Cause of Injury
Code (E-codes)","Hardcode as ""ABN""",,,,,,,
2300,2300.HI09.02,Industry Code,Code indicating a code from a specific industry code list,R,,EXTERNAL_CAUSE_OF_INJURY_9,EXTERNAL_CAUSE_OF_INJURY_09,222,Claim,,,,
2300,2300.HI09.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",EXTERNAL_CAUSE_OF_INJURY_9_POA,EXTERNAL_CAUSE_OF_INJURY_09_POA,223,Claim,,,,
2300,2300.HI10,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI10.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABN International Classification of Diseases Clinical Modification (ICD-10-CM) External Cause of Injury Code
BN International Classification of Diseases Clinical
Modification (ICD-9-CM) External Cause of Injury
Code (E-codes)","Hardcode as ""ABN""",,,,,,,
2300,2300.HI10.02,Industry Code,Code indicating a code from a specific industry code list,R,,EXTERNAL_CAUSE_OF_INJURY_10,EXTERNAL_CAUSE_OF_INJURY_10,225,Claim,,,,
2300,2300.HI10.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",EXTERNAL_CAUSE_OF_INJURY_10_POA,EXTERNAL_CAUSE_OF_INJURY_10_POA,226,Claim,,,,
2300,2300.HI11,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI11.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABN International Classification of Diseases Clinical Modification (ICD-10-CM) External Cause of Injury Code
BN International Classification of Diseases Clinical
Modification (ICD-9-CM) External Cause of Injury
Code (E-codes)","Hardcode as ""ABN""",,,,,,,
2300,2300.HI11.02,Industry Code,Code indicating a code from a specific industry code list,R,,EXTERNAL_CAUSE_OF_INJURY_11,EXTERNAL_CAUSE_OF_INJURY_11,228,Claim,,,,
2300,2300.HI11.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",EXTERNAL_CAUSE_OF_INJURY_11_POA,EXTERNAL_CAUSE_OF_INJURY_11_POA,229,Claim,,,,
2300,2300.HI12,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI12.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABN International Classification of Diseases Clinical Modification (ICD-10-CM) External Cause of Injury Code
BN International Classification of Diseases Clinical
Modification (ICD-9-CM) External Cause of Injury
Code (E-codes)","Hardcode as ""ABN""",,,,,,,
2300,2300.HI12.02,Industry Code,Code indicating a code from a specific industry code list,R,,EXTERNAL_CAUSE_OF_INJURY_12,EXTERNAL_CAUSE_OF_INJURY_12,231,Claim,,,,
2300,2300.HI12.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",EXTERNAL_CAUSE_OF_INJURY_12_POA,EXTERNAL_CAUSE_OF_INJURY_12_POA,232,Claim,,,,
2300,HI,Diagnosis Related Group (DRG) Information -Segment Repeat: 2,,S,,,,,,,,,
2300,2300.HI01,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",R,,,,,,,,,
2300,2300.HI01.01,Code List Qualifier Code,Code identifying a specific industry code list,R,DR Diagnosis Related Group (DRG),,,,,,,,
2300,2300.HI01.02,Industry Code,Code indicating a code from a specific industry code list,R,,,,,,,,,
2300,HI,Other Diagnosis Information-Segment Repeat: 2,,S,,,,,,,,,
2300,2300.HI01,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",R,,,,,,,,,
2300,2300.HI01.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical
Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,,
2300,2300.HI01.02,Industry Code,Code indicating a code from a specific industry code list,R,,OTHER_DIAGNOSIS_CODE_2,DIAGNOSIS_CODE_02,124,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/otherDiagnosis/diagnosisInfo/diagnosisCode
2300,2300.HI01.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",OTHER_DIAGNOSIS_CODE_2_POA,DIAGNOSIS_CODE_02_POA,125,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/otherDiagnosis/diagnosisInfo/poaIndicator
2300,2300.HI02,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI02.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical
Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,,
2300,2300.HI02.02,Industry Code,Code indicating a code from a specific industry code list,R,,OTHER_DIAGNOSIS_CODE_3,DIAGNOSIS_CODE_03,127,Claim,,,,
2300,2300.HI02.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",OTHER_DIAGNOSIS_CODE_3_POA,DIAGNOSIS_CODE_03_POA,128,Claim,,,,
2300,2300.HI03,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI03.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical
Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,,
2300,2300.HI03.02,Industry Code,Code indicating a code from a specific industry code list,R,,OTHER_DIAGNOSIS_CODE_4,DIAGNOSIS_CODE_04,130,Claim,,,,
2300,2300.HI03.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",OTHER_DIAGNOSIS_CODE_4_POA,DIAGNOSIS_CODE_04_POA,131,Claim,,,,
2300,2300.HI04,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI04.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical
Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,,
2300,2300.HI04.02,Industry Code,Code indicating a code from a specific industry code list,R,,OTHER_DIAGNOSIS_CODE_5,DIAGNOSIS_CODE_05,133,Claim,,,,
2300,2300.HI04.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",OTHER_DIAGNOSIS_CODE_5_POA,DIAGNOSIS_CODE_05_POA,134,Claim,,,,
2300,2300.HI05,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI05.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical
Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,,
2300,2300.HI05.02,Industry Code,Code indicating a code from a specific industry code list,R,,OTHER_DIAGNOSIS_CODE_6,DIAGNOSIS_CODE_06,136,Claim,,,,
2300,2300.HI05.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",OTHER_DIAGNOSIS_CODE_6_POA,DIAGNOSIS_CODE_06_POA,137,Claim,,,,
2300,2300.HI06,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI06.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical
Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,,
2300,2300.HI06.02,Industry Code,Code indicating a code from a specific industry code list,R,,OTHER_DIAGNOSIS_CODE_7,DIAGNOSIS_CODE_07,139,Claim,,,,
2300,2300.HI06.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",OTHER_DIAGNOSIS_CODE_7_POA,DIAGNOSIS_CODE_07_POA,140,Claim,,,,
2300,2300.HI07,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI07.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical
Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,,
2300,2300.HI07.02,Industry Code,Code indicating a code from a specific industry code list,R,,OTHER_DIAGNOSIS_CODE_8,DIAGNOSIS_CODE_08,142,Claim,,,,
2300,2300.HI07.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",OTHER_DIAGNOSIS_CODE_8_POA,DIAGNOSIS_CODE_08_POA,143,Claim,,,,
2300,2300.HI08,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI08.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical
Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,,
2300,2300.HI08.02,Industry Code,Code indicating a code from a specific industry code list,R,,OTHER_DIAGNOSIS_CODE_9,DIAGNOSIS_CODE_09,145,Claim,,,,
2300,2300.HI08.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",OTHER_DIAGNOSIS_CODE_9_POA,DIAGNOSIS_CODE_09_POA,146,Claim,,,,
2300,2300.HI09,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI09.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical
Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,,
2300,2300.HI09.02,Industry Code,Code indicating a code from a specific industry code list,R,,OTHER_DIAGNOSIS_CODE_10,DIAGNOSIS_CODE_10,148,Claim,,,,
2300,2300.HI09.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",OTHER_DIAGNOSIS_CODE_10_POA,DIAGNOSIS_CODE_10_POA,149,Claim,,,,
2300,2300.HI10,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI10.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical
Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,,
2300,2300.HI10.02,Industry Code,Code indicating a code from a specific industry code list,R,,OTHER_DIAGNOSIS_CODE_11,DIAGNOSIS_CODE_11,151,Claim,,,,
2300,2300.HI10.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",OTHER_DIAGNOSIS_CODE_11_POA,DIAGNOSIS_CODE_11_POA,152,Claim,,,,
2300,2300.HI11,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI11.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical
Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,,
2300,2300.HI11.02,Industry Code,Code indicating a code from a specific industry code list,R,,OTHER_DIAGNOSIS_CODE_12,DIAGNOSIS_CODE_12,154,Claim,,,,
2300,2300.HI11.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",OTHER_DIAGNOSIS_CODE_12_POA,DIAGNOSIS_CODE_12_POA,155,Claim,,,,
2300,2300.HI12,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI12.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical
Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,,
2300,2300.HI12.02,Industry Code,Code indicating a code from a specific industry code list,R,,OTHER_DIAGNOSIS_CODE_13,DIAGNOSIS_CODE_13,157,Claim,,,,
2300,2300.HI12.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",OTHER_DIAGNOSIS_CODE_13_POA,DIAGNOSIS_CODE_13_POA,158,Claim,,,,
2300,2300.HI13,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI13.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical
Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,,
2300,2300.HI13.02,Industry Code,Code indicating a code from a specific industry code list,R,,OTHER_DIAGNOSIS_CODE_14,DIAGNOSIS_CODE_14,160,Claim,,,,
2300,2300.HI13.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",OTHER_DIAGNOSIS_CODE_14_POA,DIAGNOSIS_CODE_14_POA,161,Claim,,,,
2300,2300.HI14,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI14.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical
Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,,
2300,2300.HI14.02,Industry Code,Code indicating a code from a specific industry code list,R,,OTHER_DIAGNOSIS_CODE_15,DIAGNOSIS_CODE_15,163,Claim,,,,
2300,2300.HI14.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",OTHER_DIAGNOSIS_CODE_15_POA,DIAGNOSIS_CODE_15_POA,164,Claim,,,,
2300,2300.HI15,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI15.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical
Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,,
2300,2300.HI15.02,Industry Code,Code indicating a code from a specific industry code list,R,,OTHER_DIAGNOSIS_CODE_16,DIAGNOSIS_CODE_16,166,Claim,,,,
2300,2300.HI15.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",OTHER_DIAGNOSIS_CODE_16_POA,DIAGNOSIS_CODE_16_POA,167,Claim,,,,
2300,2300.HI16,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI16.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical
Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,,
2300,2300.HI16.02,Industry Code,Code indicating a code from a specific industry code list,R,,OTHER_DIAGNOSIS_CODE_17,DIAGNOSIS_CODE_17,169,Claim,,,,
2300,2300.HI16.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",OTHER_DIAGNOSIS_CODE_17_POA,DIAGNOSIS_CODE_17_POA,170,Claim,,,,
2300,2300.HI17,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI17.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical
Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,,
2300,2300.HI17.02,Industry Code,Code indicating a code from a specific industry code list,R,,OTHER_DIAGNOSIS_CODE_18,DIAGNOSIS_CODE_18,172,Claim,,,,
2300,2300.HI17.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",OTHER_DIAGNOSIS_CODE_18_POA,DIAGNOSIS_CODE_18_POA,173,Claim,,,,
2300,2300.HI18,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI18.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical
Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,,
2300,2300.HI18.02,Industry Code,Code indicating a code from a specific industry code list,R,,OTHER_DIAGNOSIS_CODE_19,DIAGNOSIS_CODE_19,175,Claim,,,,
2300,2300.HI18.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",OTHER_DIAGNOSIS_CODE_19_POA,DIAGNOSIS_CODE_19_POA,176,Claim,,,,
2300,2300.HI19,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI19.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical
Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,,
2300,2300.HI19.02,Industry Code,Code indicating a code from a specific industry code list,R,,OTHER_DIAGNOSIS_CODE_20,DIAGNOSIS_CODE_20,178,Claim,,,,
2300,2300.HI19.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",OTHER_DIAGNOSIS_CODE_20_POA,DIAGNOSIS_CODE_20_POA,179,Claim,,,,
2300,2300.HI20,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI20.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical
Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,,
2300,2300.HI20.02,Industry Code,Code indicating a code from a specific industry code list,R,,OTHER_DIAGNOSIS_CODE_21,DIAGNOSIS_CODE_21,181,Claim,,,,
2300,2300.HI20.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",OTHER_DIAGNOSIS_CODE_21_POA,DIAGNOSIS_CODE_21_POA,182,Claim,,,,
2300,2300.HI21,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI21.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical
Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,,
2300,2300.HI21.02,Industry Code,Code indicating a code from a specific industry code list,R,,OTHER_DIAGNOSIS_CODE_22,DIAGNOSIS_CODE_22,184,Claim,,,,
2300,2300.HI21.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",OTHER_DIAGNOSIS_CODE_22_POA,DIAGNOSIS_CODE_22_POA,185,Claim,,,,
2300,2300.HI22,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI22.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical
Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,,
2300,2300.HI22.02,Industry Code,Code indicating a code from a specific industry code list,R,,OTHER_DIAGNOSIS_CODE_23,DIAGNOSIS_CODE_23,187,Claim,,,,
2300,2300.HI22.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",OTHER_DIAGNOSIS_CODE_23_POA,DIAGNOSIS_CODE_23_POA,188,Claim,,,,
2300,2300.HI23,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI23.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical
Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,,
2300,2300.HI23.02,Industry Code,Code indicating a code from a specific industry code list,R,,OTHER_DIAGNOSIS_CODE_24,DIAGNOSIS_CODE_24,190,Claim,,,,
2300,2300.HI23.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",OTHER_DIAGNOSIS_CODE_24_POA,DIAGNOSIS_CODE_24_POA,191,Claim,,,,
2300,2300.HI24,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI24.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical
Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,,
2300,2300.HI24.02,Industry Code,Code indicating a code from a specific industry code list,R,,OTHER_DIAGNOSIS_CODE_25,DIAGNOSIS_CODE_25,193,Claim,,,,
2300,2300.HI24.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",OTHER_DIAGNOSIS_CODE_25_POA,DIAGNOSIS_CODE_25_POA,194,Claim,,,,
2300,HI,Principal Procedure Information,,S,,,,,,,,,
2300,2300.HI01,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",R,,,,,,,,,
2300,2300.HI01.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BBR : International Classification of Diseases Clinical
Modification (ICD-10-PCS) Principal Procedure
Codes
BR : International Classification of Diseases Clinical
Modification (ICD-9-CM) Principal Procedure Codes
CAH : Advanced Billing Concepts (ABC) Codes","Hardcode as ""BBR""",,,,,,,
2300,2300.HI01.02,Industry Code,Code indicating a code from a specific industry code list,R,,PRINCIPAL_PROCEDURE,PRINCIPAL_PROCEDURE,240,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/procedureInfo/principalProcedure/procedureCode
2300,2300.HI01.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 : Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2300,2300.HI01.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,PRINCIPAL_PROCEDURE_DATE,PRINCIPAL_PROCEDURE_DATE,241,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/procedureInfo/principalProcedure/procedureDate
2300,HI,Other Procedure Information -Segment Repeat: 2,,S,,,,,,,,,
2300,2300.HI01,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",R,,,,,,,,,
2300,2300.HI01.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BBQ International Classification of Diseases Clinical Modification (ICD-10-PCS) Other Procedure Codes
BQ International Classification of Diseases Clinical
Modification (ICD-9-CM) Other Procedure Codes","Hardcode as ""BBQ""",,,,,,,
2300,2300.HI01.02,Industry Code,Code indicating a code from a specific industry code list,R,,OTHER_PROCEDURE_2,PROCEDURE_02,243,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/procedureInfo/otherProcedure/procedure/procedureCode
2300,2300.HI01.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2300,2300.HI01.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OTHER_PROCEDURE_2_DATE,PROCEDURE_02_DATE,244,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/procedureInfo/otherProcedure/procedure/procedureDate
2300,2300.HI02,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI02.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BBQ International Classification of Diseases Clinical Modification (ICD-10-PCS) Other Procedure Codes
BQ International Classification of Diseases Clinical
Modification (ICD-9-CM) Other Procedure Codes","Hardcode as ""BBQ""",,,,,,,
2300,2300.HI02.02,Industry Code,Code indicating a code from a specific industry code list,R,,OTHER_PROCEDURE_3,PROCEDURE_03,246,Claim,,,,
2300,2300.HI02.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2300,2300.HI02.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OTHER_PROCEDURE_3_DATE,PROCEDURE_03_DATE,247,Claim,,,,
2300,2300.HI03,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI03.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BBQ International Classification of Diseases Clinical Modification (ICD-10-PCS) Other Procedure Codes
BQ International Classification of Diseases Clinical
Modification (ICD-9-CM) Other Procedure Codes","Hardcode as ""BBQ""",,,,,,,
2300,2300.HI03.02,Industry Code,Code indicating a code from a specific industry code list,R,,OTHER_PROCEDURE_4,PROCEDURE_04,249,Claim,,,,
2300,2300.HI03.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2300,2300.HI03.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OTHER_PROCEDURE_4_DATE,PROCEDURE_04_DATE,250,Claim,,,,
2300,2300.HI04,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI04.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BBQ International Classification of Diseases Clinical Modification (ICD-10-PCS) Other Procedure Codes
BQ International Classification of Diseases Clinical
Modification (ICD-9-CM) Other Procedure Codes","Hardcode as ""BBQ""",,,,,,,
2300,2300.HI04.02,Industry Code,Code indicating a code from a specific industry code list,R,,OTHER_PROCEDURE_5,PROCEDURE_05,252,Claim,,,,
2300,2300.HI04.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2300,2300.HI04.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OTHER_PROCEDURE_5_DATE,PROCEDURE_05_DATE,253,Claim,,,,
2300,2300.HI05,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI05.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BBQ International Classification of Diseases Clinical Modification (ICD-10-PCS) Other Procedure Codes
BQ International Classification of Diseases Clinical
Modification (ICD-9-CM) Other Procedure Codes","Hardcode as ""BBQ""",,,,,,,
2300,2300.HI05.02,Industry Code,Code indicating a code from a specific industry code list,R,,OTHER_PROCEDURE_6,PROCEDURE_06,255,Claim,,,,
2300,2300.HI05.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2300,2300.HI05.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OTHER_PROCEDURE_6_DATE,PROCEDURE_06_DATE,256,Claim,,,,
2300,2300.HI06,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI06.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BBQ International Classification of Diseases Clinical Modification (ICD-10-PCS) Other Procedure Codes
BQ International Classification of Diseases Clinical
Modification (ICD-9-CM) Other Procedure Codes","Hardcode as ""BBQ""",,,,,,,
2300,2300.HI06.02,Industry Code,Code indicating a code from a specific industry code list,R,,OTHER_PROCEDURE_7,PROCEDURE_07,258,Claim,,,,
2300,2300.HI06.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2300,2300.HI06.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OTHER_PROCEDURE_7_DATE,PROCEDURE_07_DATE,259,Claim,,,,
2300,2300.HI07,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI07.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BBQ International Classification of Diseases Clinical Modification (ICD-10-PCS) Other Procedure Codes
BQ International Classification of Diseases Clinical
Modification (ICD-9-CM) Other Procedure Codes","Hardcode as ""BBQ""",,,,,,,
2300,2300.HI07.02,Industry Code,Code indicating a code from a specific industry code list,R,,OTHER_PROCEDURE_8,PROCEDURE_08,261,Claim,,,,
2300,2300.HI07.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2300,2300.HI07.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OTHER_PROCEDURE_8_DATE,PROCEDURE_08_DATE,262,Claim,,,,
2300,2300.HI08,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI08.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BBQ International Classification of Diseases Clinical Modification (ICD-10-PCS) Other Procedure Codes
BQ International Classification of Diseases Clinical
Modification (ICD-9-CM) Other Procedure Codes","Hardcode as ""BBQ""",,,,,,,
2300,2300.HI08.02,Industry Code,Code indicating a code from a specific industry code list,R,,OTHER_PROCEDURE_9,PROCEDURE_09,264,Claim,,,,
2300,2300.HI08.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2300,2300.HI08.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OTHER_PROCEDURE_9_DATE,PROCEDURE_09_DATE,265,Claim,,,,
2300,2300.HI09,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI09.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BBQ International Classification of Diseases Clinical Modification (ICD-10-PCS) Other Procedure Codes
BQ International Classification of Diseases Clinical
Modification (ICD-9-CM) Other Procedure Codes","Hardcode as ""BBQ""",,,,,,,
2300,2300.HI09.02,Industry Code,Code indicating a code from a specific industry code list,R,,OTHER_PROCEDURE_10,PROCEDURE_10,267,Claim,,,,
2300,2300.HI09.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2300,2300.HI09.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OTHER_PROCEDURE_10_DATE,PROCEDURE_10_DATE,268,Claim,,,,
2300,2300.HI10,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI10.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BBQ International Classification of Diseases Clinical Modification (ICD-10-PCS) Other Procedure Codes
BQ International Classification of Diseases Clinical
Modification (ICD-9-CM) Other Procedure Codes","Hardcode as ""BBQ""",,,,,,,
2300,2300.HI10.02,Industry Code,Code indicating a code from a specific industry code list,R,,OTHER_PROCEDURE_11,PROCEDURE_11,270,Claim,,,,
2300,2300.HI10.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2300,2300.HI10.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OTHER_PROCEDURE_11_DATE,PROCEDURE_11_DATE,271,Claim,,,,
2300,2300.HI11,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI11.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BBQ International Classification of Diseases Clinical Modification (ICD-10-PCS) Other Procedure Codes
BQ International Classification of Diseases Clinical
Modification (ICD-9-CM) Other Procedure Codes","Hardcode as ""BBQ""",,,,,,,
2300,2300.HI11.02,Industry Code,Code indicating a code from a specific industry code list,R,,OTHER_PROCEDURE_12,PROCEDURE_12,273,Claim,,,,
2300,2300.HI11.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2300,2300.HI11.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OTHER_PROCEDURE_12_DATE,PROCEDURE_12_DATE,274,Claim,,,,
2300,2300.HI12,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI12.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BBQ International Classification of Diseases Clinical Modification (ICD-10-PCS) Other Procedure Codes
BQ International Classification of Diseases Clinical
Modification (ICD-9-CM) Other Procedure Codes","Hardcode as ""BBQ""",,,,,,,
2300,2300.HI12.02,Industry Code,Code indicating a code from a specific industry code list,R,,OTHER_PROCEDURE_13,PROCEDURE_13,276,Claim,,,,
2300,2300.HI12.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2300,2300.HI12.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OTHER_PROCEDURE_13_DATE,PROCEDURE_13_DATE,277,Claim,,,,
2300,2300.HI013,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",R,,,,,,,,,
2300,2300.HI13.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BBQ International Classification of Diseases Clinical Modification (ICD-10-PCS) Other Procedure Codes
BQ International Classification of Diseases Clinical
Modification (ICD-9-CM) Other Procedure Codes","Hardcode as ""BBQ""",,,,,,,
2300,2300.HI13.02,Industry Code,Code indicating a code from a specific industry code list,R,,OTHER_PROCEDURE_14,PROCEDURE_14,279,Claim,,,,
2300,2300.HI13.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2300,2300.HI13.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OTHER_PROCEDURE_14_DATE,PROCEDURE_14_DATE,280,Claim,,,,
2300,2300.HI14,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI14.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BBQ International Classification of Diseases Clinical Modification (ICD-10-PCS) Other Procedure Codes
BQ International Classification of Diseases Clinical
Modification (ICD-9-CM) Other Procedure Codes","Hardcode as ""BBQ""",,,,,,,
2300,2300.HI14.02,Industry Code,Code indicating a code from a specific industry code list,R,,OTHER_PROCEDURE_15,PROCEDURE_15,282,Claim,,,,
2300,2300.HI14.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2300,2300.HI14.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OTHER_PROCEDURE_15_DATE,PROCEDURE_15_DATE,283,Claim,,,,
2300,2300.HI15,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI15.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BBQ International Classification of Diseases Clinical Modification (ICD-10-PCS) Other Procedure Codes
BQ International Classification of Diseases Clinical
Modification (ICD-9-CM) Other Procedure Codes","Hardcode as ""BBQ""",,,,,,,
2300,2300.HI15.02,Industry Code,Code indicating a code from a specific industry code list,R,,OTHER_PROCEDURE_16,PROCEDURE_16,285,Claim,,,,
2300,2300.HI15.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2300,2300.HI15.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OTHER_PROCEDURE_16_DATE,PROCEDURE_16_DATE,286,Claim,,,,
2300,2300.HI16,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI16.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BBQ International Classification of Diseases Clinical Modification (ICD-10-PCS) Other Procedure Codes
BQ International Classification of Diseases Clinical
Modification (ICD-9-CM) Other Procedure Codes","Hardcode as ""BBQ""",,,,,,,
2300,2300.HI16.02,Industry Code,Code indicating a code from a specific industry code list,R,,OTHER_PROCEDURE_17,PROCEDURE_17,288,Claim,,,,
2300,2300.HI16.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2300,2300.HI16.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OTHER_PROCEDURE_17_DATE,PROCEDURE_17_DATE,289,Claim,,,,
2300,2300.HI17,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI17.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BBQ International Classification of Diseases Clinical Modification (ICD-10-PCS) Other Procedure Codes
BQ International Classification of Diseases Clinical
Modification (ICD-9-CM) Other Procedure Codes","Hardcode as ""BBQ""",,,,,,,
2300,2300.HI17.02,Industry Code,Code indicating a code from a specific industry code list,R,,OTHER_PROCEDURE_18,PROCEDURE_18,291,Claim,,,,
2300,2300.HI17.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2300,2300.HI17.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OTHER_PROCEDURE_18_DATE,PROCEDURE_18_DATE,292,Claim,,,,
2300,2300.HI18,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI18.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BBQ International Classification of Diseases Clinical Modification (ICD-10-PCS) Other Procedure Codes
BQ International Classification of Diseases Clinical
Modification (ICD-9-CM) Other Procedure Codes","Hardcode as ""BBQ""",,,,,,,
2300,2300.HI18.02,Industry Code,Code indicating a code from a specific industry code list,R,,OTHER_PROCEDURE_19,PROCEDURE_19,294,Claim,,,,
2300,2300.HI18.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2300,2300.HI18.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OTHER_PROCEDURE_19_DATE,PROCEDURE_19_DATE,295,Claim,,,,
2300,2300.HI19,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI19.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BBQ International Classification of Diseases Clinical Modification (ICD-10-PCS) Other Procedure Codes
BQ International Classification of Diseases Clinical
Modification (ICD-9-CM) Other Procedure Codes","Hardcode as ""BBQ""",,,,,,,
2300,2300.HI19.02,Industry Code,Code indicating a code from a specific industry code list,R,,OTHER_PROCEDURE_20,PROCEDURE_20,297,Claim,,,,
2300,2300.HI19.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2300,2300.HI19.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OTHER_PROCEDURE_20_DATE,PROCEDURE_20_DATE,298,Claim,,,,
2300,2300.HI20,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI20.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BBQ International Classification of Diseases Clinical Modification (ICD-10-PCS) Other Procedure Codes
BQ International Classification of Diseases Clinical
Modification (ICD-9-CM) Other Procedure Codes","Hardcode as ""BBQ""",,,,,,,
2300,2300.HI20.02,Industry Code,Code indicating a code from a specific industry code list,R,,OTHER_PROCEDURE_21,PROCEDURE_21,300,Claim,,,,
2300,2300.HI20.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2300,2300.HI20.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OTHER_PROCEDURE_21_DATE,PROCEDURE_21_DATE,301,Claim,,,,
2300,2300.HI21,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI21.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BBQ International Classification of Diseases Clinical Modification (ICD-10-PCS) Other Procedure Codes
BQ International Classification of Diseases Clinical
Modification (ICD-9-CM) Other Procedure Codes","Hardcode as ""BBQ""",,,,,,,
2300,2300.HI21.02,Industry Code,Code indicating a code from a specific industry code list,R,,OTHER_PROCEDURE_22,PROCEDURE_22,303,Claim,,,,
2300,2300.HI21.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2300,2300.HI21.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OTHER_PROCEDURE_22_DATE,PROCEDURE_22_DATE,304,Claim,,,,
2300,2300.HI22,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI22.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BBQ International Classification of Diseases Clinical Modification (ICD-10-PCS) Other Procedure Codes
BQ International Classification of Diseases Clinical
Modification (ICD-9-CM) Other Procedure Codes","Hardcode as ""BBQ""",,,,,,,
2300,2300.HI22.02,Industry Code,Code indicating a code from a specific industry code list,R,,OTHER_PROCEDURE_23,PROCEDURE_23,306,Claim,,,,
2300,2300.HI22.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2300,2300.HI22.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OTHER_PROCEDURE_23_DATE,PROCEDURE_23_DATE,307,Claim,,,,
2300,2300.HI23,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI23.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BBQ International Classification of Diseases Clinical Modification (ICD-10-PCS) Other Procedure Codes
BQ International Classification of Diseases Clinical
Modification (ICD-9-CM) Other Procedure Codes","Hardcode as ""BBQ""",,,,,,,
2300,2300.HI23.02,Industry Code,Code indicating a code from a specific industry code list,R,,OTHER_PROCEDURE_24,PROCEDURE_24,309,Claim,,,,
2300,2300.HI23.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2300,2300.HI23.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OTHER_PROCEDURE_24_DATE,PROCEDURE_24_DATE,310,Claim,,,,
2300,2300.HI24,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI24.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BBQ International Classification of Diseases Clinical Modification (ICD-10-PCS) Other Procedure Codes
BQ International Classification of Diseases Clinical
Modification (ICD-9-CM) Other Procedure Codes","Hardcode as ""BBQ""",,,,,,,
2300,2300.HI24.02,Industry Code,Code indicating a code from a specific industry code list,R,,OTHER_PROCEDURE_25,PROCEDURE_25,312,Claim,,,,
2300,2300.HI24.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2300,2300.HI24.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OTHER_PROCEDURE_25_DATE,PROCEDURE_25_DATE,313,Claim,,,,
2300,HI,Occurrence Span Information - Segment Repeat: 2,,S,,,,,,,,,
2300,2300.HI01,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",R,,,,,,,,,
2300,2300.HI01.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BI Occurrence Span,"Hardcode as ""BI""",,,,,,,
2300,2300.HI01.02,Industry Code,Code indicating a code from a specific industry code list,R,,OCCUR_SPAN_CODE_1,OCCUR_SPAN_CODE_01,593,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/prOccurrenceSpan/occurrenceCode/occurrenceCode
2300,2300.HI01.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD,"Hardcode as ""RD8""",,,,,,,
2300,2300.HI01.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OCCUR_SPAN_FROM_DATE_1 + OCCUR_SPAN_TO_DATE_1,OCCUR_SPAN_FROM_DATE_01  + OCCUR_SPAN_TO_DATE_01,594+595,Claim,,,,"ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/prOccurrenceSpan/occurrenceCode/prStartDate ""-""
ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/prOccurrenceSpan/occurrenceCode/prEndDate"
2300,2300.HI02,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI02.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BI Occurrence Span,"Hardcode as ""BI""",,,,,,,
2300,2300.HI02.02,Industry Code,Code indicating a code from a specific industry code list,R,,OCCUR_SPAN_CODE_2,OCCUR_SPAN_CODE_02,596,Claim,,,,
2300,2300.HI02.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD,"Hardcode as ""RD8""",,,,,,,
2300,2300.HI02.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OCCUR_SPAN_FROM_DATE_2 + OCCUR_SPAN_TO_DATE_2,OCCUR_SPAN_FROM_DATE_02  + OCCUR_SPAN_TO_DATE_02,597+598,Claim,,,,
2300,2300.HI03,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI03.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BI Occurrence Span,"Hardcode as ""BI""",,,,,,,
2300,2300.HI03.02,Industry Code,Code indicating a code from a specific industry code list,R,,OCCUR_SPAN_CODE_3,OCCUR_SPAN_CODE_03,599,Claim,,,,
2300,2300.HI03.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD,"Hardcode as ""RD8""",,,,,,,
2300,2300.HI03.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OCCUR_SPAN_FROM_DATE_3 + OCCUR_SPAN_TO_DATE_3,OCCUR_SPAN_FROM_DATE_03  + OCCUR_SPAN_TO_DATE_03,600+601,Claim,,,,
2300,2300.HI04,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI04.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BI Occurrence Span,"Hardcode as ""BI""",,,,,,,
2300,2300.HI04.02,Industry Code,Code indicating a code from a specific industry code list,R,,OCCUR_SPAN_CODE_4,OCCUR_SPAN_CODE_04,602,Claim,,,,
2300,2300.HI04.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD,"Hardcode as ""RD8""",,,,,,,
2300,2300.HI04.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OCCUR_SPAN_FROM_DATE_4 + OCCUR_SPAN_TO_DATE_4,OCCUR_SPAN_FROM_DATE_04  + OCCUR_SPAN_TO_DATE_04,603+604,Claim,,,,
2300,2300.HI05,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI05.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BI Occurrence Span,"Hardcode as ""BI""",,,,,,,
2300,2300.HI05.02,Industry Code,Code indicating a code from a specific industry code list,R,,OCCUR_SPAN_CODE_5,OCCUR_SPAN_CODE_05,605,Claim,,,,
2300,2300.HI05.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD,"Hardcode as ""RD8""",,,,,,,
2300,2300.HI05.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OCCUR_SPAN_FROM_DATE_5 + OCCUR_SPAN_TO_DATE_5,OCCUR_SPAN_FROM_DATE_05  + OCCUR_SPAN_TO_DATE_05,606+607,Claim,,,,
2300,2300.HI06,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI06.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BI Occurrence Span,"Hardcode as ""BI""",,,,,,,
2300,2300.HI06.02,Industry Code,Code indicating a code from a specific industry code list,R,,OCCUR_SPAN_CODE_6,OCCUR_SPAN_CODE_06,608,Claim,,,,
2300,2300.HI06.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD,"Hardcode as ""RD8""",,,,,,,
2300,2300.HI06.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OCCUR_SPAN_FROM_DATE_6 + OCCUR_SPAN_TO_DATE_6,OCCUR_SPAN_FROM_DATE_06  + OCCUR_SPAN_TO_DATE_06,609+610,Claim,,,,
2300,2300.HI07,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI07.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BI Occurrence Span,"Hardcode as ""BI""",,,,,,,
2300,2300.HI07.02,Industry Code,Code indicating a code from a specific industry code list,R,,OCCUR_SPAN_CODE_7,OCCUR_SPAN_CODE_07,611,Claim,,,,
2300,2300.HI07.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD,"Hardcode as ""RD8""",,,,,,,
2300,2300.HI07.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OCCUR_SPAN_FROM_DATE_7 + OCCUR_SPAN_TO_DATE_7,OCCUR_SPAN_FROM_DATE_07  + OCCUR_SPAN_TO_DATE_07,612+613,Claim,,,,
2300,2300.HI08,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI08.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BI Occurrence Span,"Hardcode as ""BI""",,,,,,,
2300,2300.HI08.02,Industry Code,Code indicating a code from a specific industry code list,R,,OCCUR_SPAN_CODE_8,OCCUR_SPAN_CODE_08,614,Claim,,,,
2300,2300.HI08.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD,"Hardcode as ""RD8""",,,,,,,
2300,2300.HI08.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OCCUR_SPAN_FROM_DATE_8 + OCCUR_SPAN_TO_DATE_8,OCCUR_SPAN_FROM_DATE_08  + OCCUR_SPAN_TO_DATE_08,615+616,Claim,,,,
2300,2300.HI09,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI09.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BI Occurrence Span,"Hardcode as ""BI""",,,,,,,
2300,2300.HI09.02,Industry Code,Code indicating a code from a specific industry code list,R,,OCCUR_SPAN_CODE_9,OCCUR_SPAN_CODE_09,617,Claim,,,,
2300,2300.HI09.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD,"Hardcode as ""RD8""",,,,,,,
2300,2300.HI09.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OCCUR_SPAN_FROM_DATE_9 + OCCUR_SPAN_TO_DATE_9,OCCUR_SPAN_FROM_DATE_09  + OCCUR_SPAN_TO_DATE_09,618+619,Claim,,,,
2300,2300.HI10,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI10.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BI Occurrence Span,"Hardcode as ""BI""",,,,,,,
2300,2300.HI10.02,Industry Code,Code indicating a code from a specific industry code list,R,,OCCUR_SPAN_CODE_10,OCCUR_SPAN_CODE_10,620,Claim,,,,
2300,2300.HI10.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD,"Hardcode as ""RD8""",,,,,,,
2300,2300.HI10.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OCCUR_SPAN_FROM_DATE_10 + OCCUR_SPAN_TO_DATE_10,OCCUR_SPAN_FROM_DATE_10  + OCCUR_SPAN_TO_DATE_10,621+622,Claim,,,,
2300,2300.HI11,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI11.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BI Occurrence Span,"Hardcode as ""BI""",,,,,,,
2300,2300.HI11.02,Industry Code,Code indicating a code from a specific industry code list,R,,OCCUR_SPAN_CODE_11,OCCUR_SPAN_CODE_11,623,Claim,,,,
2300,2300.HI11.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD,"Hardcode as ""RD8""",,,,,,,
2300,2300.HI11.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OCCUR_SPAN_FROM_DATE_11 + OCCUR_SPAN_TO_DATE_11,OCCUR_SPAN_FROM_DATE_11  + OCCUR_SPAN_TO_DATE_11,624+625,Claim,,,,
2300,2300.HI12,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI12.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BI Occurrence Span,"Hardcode as ""BI""",,,,,,,
2300,2300.HI12.02,Industry Code,Code indicating a code from a specific industry code list,R,,OCCUR_SPAN_CODE_12,OCCUR_SPAN_CODE_12,626,Claim,,,,
2300,2300.HI12.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD,"Hardcode as ""RD8""",,,,,,,
2300,2300.HI12.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OCCUR_SPAN_FROM_DATE_12 + OCCUR_SPAN_TO_DATE_12,OCCUR_SPAN_FROM_DATE_12  + OCCUR_SPAN_TO_DATE_12,627+628,Claim,,,,
2300,2300.HI13,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI13.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BI Occurrence Span,"Hardcode as ""BI""",,,,,,,
2300,2300.HI13.02,Industry Code,Code indicating a code from a specific industry code list,R,,OCCUR_SPAN_CODE_13,OCCUR_SPAN_CODE_13,629,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/prOccurrenceSpan/occurrenceCode/occurrenceCode
2300,2300.HI13.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD,"Hardcode as ""RD8""",,,,,,,
2300,2300.HI13.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OCCUR_SPAN_FROM_DATE_13 + OCCUR_SPAN_TO_DATE_13,OCCUR_SPAN_FROM_DATE_13  + OCCUR_SPAN_TO_DATE_13,630+631,Claim,,,,"ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/prOccurrenceSpan/occurrenceCode/prStartDate ""-""
ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/prOccurrenceSpan/occurrenceCode/prEndDate"
2300,2300.HI14,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI14.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BI Occurrence Span,"Hardcode as ""BI""",,,,,,,
2300,2300.HI14.02,Industry Code,Code indicating a code from a specific industry code list,R,,OCCUR_SPAN_CODE_14,OCCUR_SPAN_CODE_14,632,Claim,,,,
2300,2300.HI14.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD,"Hardcode as ""RD8""",,,,,,,
2300,2300.HI14.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OCCUR_SPAN_FROM_DATE_14 + OCCUR_SPAN_TO_DATE_14,OCCUR_SPAN_FROM_DATE_14  + OCCUR_SPAN_TO_DATE_14,633+634,Claim,,,,
2300,2300.HI15,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI15.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BI Occurrence Span,"Hardcode as ""BI""",,,,,,,
2300,2300.HI15.02,Industry Code,Code indicating a code from a specific industry code list,R,,OCCUR_SPAN_CODE_15,OCCUR_SPAN_CODE_15,635,Claim,,,,
2300,2300.HI15.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD,"Hardcode as ""RD8""",,,,,,,
2300,2300.HI15.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OCCUR_SPAN_FROM_DATE_15 + OCCUR_SPAN_TO_DATE_15,OCCUR_SPAN_FROM_DATE_15  + OCCUR_SPAN_TO_DATE_15,636+637,Claim,,,,
2300,2300.HI16,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI16.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BI Occurrence Span,"Hardcode as ""BI""",,,,,,,
2300,2300.HI16.02,Industry Code,Code indicating a code from a specific industry code list,R,,OCCUR_SPAN_CODE_16,OCCUR_SPAN_CODE_16,638,Claim,,,,
2300,2300.HI16.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD,"Hardcode as ""RD8""",,,,,,,
2300,2300.HI16.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OCCUR_SPAN_FROM_DATE_16 + OCCUR_SPAN_TO_DATE_16,OCCUR_SPAN_FROM_DATE_16  + OCCUR_SPAN_TO_DATE_16,639+640,Claim,,,,
2300,2300.HI17,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI17.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BI Occurrence Span,"Hardcode as ""BI""",,,,,,,
2300,2300.HI17.02,Industry Code,Code indicating a code from a specific industry code list,R,,OCCUR_SPAN_CODE_17,OCCUR_SPAN_CODE_17,641,Claim,,,,
2300,2300.HI17.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD,"Hardcode as ""RD8""",,,,,,,
2300,2300.HI17.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OCCUR_SPAN_FROM_DATE_17 + OCCUR_SPAN_TO_DATE_17,OCCUR_SPAN_FROM_DATE_17  + OCCUR_SPAN_TO_DATE_17,642+643,Claim,,,,
2300,2300.HI18,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI18.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BI Occurrence Span,"Hardcode as ""BI""",,,,,,,
2300,2300.HI18.02,Industry Code,Code indicating a code from a specific industry code list,R,,OCCUR_SPAN_CODE_18,OCCUR_SPAN_CODE_18,644,Claim,,,,
2300,2300.HI18.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD,"Hardcode as ""RD8""",,,,,,,
2300,2300.HI18.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OCCUR_SPAN_FROM_DATE_18 + OCCUR_SPAN_TO_DATE_18,OCCUR_SPAN_FROM_DATE_18  + OCCUR_SPAN_TO_DATE_18,645+646,Claim,,,,
2300,2300.HI19,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI19.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BI Occurrence Span,"Hardcode as ""BI""",,,,,,,
2300,2300.HI19.02,Industry Code,Code indicating a code from a specific industry code list,R,,OCCUR_SPAN_CODE_19,OCCUR_SPAN_CODE_19,647,Claim,,,,
2300,2300.HI19.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD,"Hardcode as ""RD8""",,,,,,,
2300,2300.HI19.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OCCUR_SPAN_FROM_DATE_19 + OCCUR_SPAN_TO_DATE_19,OCCUR_SPAN_FROM_DATE_19  + OCCUR_SPAN_TO_DATE_19,648+649,Claim,,,,
2300,2300.HI20,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI20.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BI Occurrence Span,"Hardcode as ""BI""",,,,,,,
2300,2300.HI20.02,Industry Code,Code indicating a code from a specific industry code list,R,,OCCUR_SPAN_CODE_20,OCCUR_SPAN_CODE_20,650,Claim,,,,
2300,2300.HI20.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD,"Hardcode as ""RD8""",,,,,,,
2300,2300.HI20.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OCCUR_SPAN_FROM_DATE_20 + OCCUR_SPAN_TO_DATE_20,OCCUR_SPAN_FROM_DATE_20  + OCCUR_SPAN_TO_DATE_20,651+652,Claim,,,,
2300,2300.HI21,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI21.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BI Occurrence Span,"Hardcode as ""BI""",,,,,,,
2300,2300.HI21.02,Industry Code,Code indicating a code from a specific industry code list,R,,OCCUR_SPAN_CODE_21,OCCUR_SPAN_CODE_21,653,Claim,,,,
2300,2300.HI21.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD,"Hardcode as ""RD8""",,,,,,,
2300,2300.HI21.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OCCUR_SPAN_FROM_DATE_21 + OCCUR_SPAN_TO_DATE_21,OCCUR_SPAN_FROM_DATE_21  + OCCUR_SPAN_TO_DATE_21,654+655,Claim,,,,
2300,2300.HI22,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI22.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BI Occurrence Span,"Hardcode as ""BI""",,,,,,,
2300,2300.HI22.02,Industry Code,Code indicating a code from a specific industry code list,R,,OCCUR_SPAN_CODE_22,OCCUR_SPAN_CODE_22,656,Claim,,,,
2300,2300.HI22.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD,"Hardcode as ""RD8""",,,,,,,
2300,2300.HI22.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OCCUR_SPAN_FROM_DATE_22 + OCCUR_SPAN_TO_DATE_22,OCCUR_SPAN_FROM_DATE_22  + OCCUR_SPAN_TO_DATE_22,657+658,Claim,,,,
2300,2300.HI23,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI23.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BI Occurrence Span,"Hardcode as ""BI""",,,,,,,
2300,2300.HI23.02,Industry Code,Code indicating a code from a specific industry code list,R,,OCCUR_SPAN_CODE_23,OCCUR_SPAN_CODE_23,659,Claim,,,,
2300,2300.HI23.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD,"Hardcode as ""RD8""",,,,,,,
2300,2300.HI23.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OCCUR_SPAN_FROM_DATE_23 + OCCUR_SPAN_TO_DATE_23,OCCUR_SPAN_FROM_DATE_23  + OCCUR_SPAN_TO_DATE_23,660+661,Claim,,,,
2300,2300.HI24,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI24.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BI Occurrence Span,"Hardcode as ""BI""",,,,,,,
2300,2300.HI24.02,Industry Code,Code indicating a code from a specific industry code list,R,,OCCUR_SPAN_CODE_24,OCCUR_SPAN_CODE_24,662,Claim,,,,
2300,2300.HI24.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD,"Hardcode as ""RD8""",,,,,,,
2300,2300.HI24.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OCCUR_SPAN_FROM_DATE_24 + OCCUR_SPAN_TO_DATE_24,OCCUR_SPAN_FROM_DATE_24  + OCCUR_SPAN_TO_DATE_24,663+664,Claim,,,,
2300,HI,Occurrence Information-Segment Repeat: 2,,S,,,,,,,,,
2300,2300.HI01,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",R,,,,,,,,,
2300,2300.HI01.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BH Occurrence,"Hardcode as ""BH""",,,,,,,
2300,2300.HI01.02,Industry Code,Code indicating a code from a specific industry code list,R,,OCCUR_CODE_1,OCCUR_CODE_01,665,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/prOccurrenceSpan/occurrenceCode/occurrenceCode
2300,2300.HI01.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2300,2300.HI01.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OCCUR_DATE_01,OCCUR_DATE_01,666,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/prOccurrenceCode/occurrenceCode/prStartDate
2300,2300.HI02,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI02.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BH Occurrence,"Hardcode as ""BH""",,,,,,,
2300,2300.HI02.02,Industry Code,Code indicating a code from a specific industry code list,R,,OCCUR_CODE_2,OCCUR_CODE_02,667,Claim,,,,
2300,2300.HI02.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2300,2300.HI02.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OCCUR_DATE_2,OCCUR_DATE_02,668,Claim,,,,
2300,2300.HI03,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI03.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BH Occurrence,"Hardcode as ""BH""",,,,,,,
2300,2300.HI03.02,Industry Code,Code indicating a code from a specific industry code list,R,,OCCUR_CODE_3,OCCUR_CODE_03,669,Claim,,,,
2300,2300.HI03.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2300,2300.HI03.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OCCUR_DATE_3,OCCUR_DATE_03,670,Claim,,,,
2300,2300.HI04,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI04.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BH Occurrence,"Hardcode as ""BH""",,,,,,,
2300,2300.HI04.02,Industry Code,Code indicating a code from a specific industry code list,R,,OCCUR_CODE_4,OCCUR_CODE_04,671,Claim,,,,
2300,2300.HI04.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2300,2300.HI04.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OCCUR_DATE_4,OCCUR_DATE_04,672,Claim,,,,
2300,2300.HI05,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI05.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BH Occurrence,"Hardcode as ""BH""",,,,,,,
2300,2300.HI05.02,Industry Code,Code indicating a code from a specific industry code list,R,,OCCUR_CODE_5,OCCUR_CODE_05,673,Claim,,,,
2300,2300.HI05.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2300,2300.HI05.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OCCUR_DATE_5,OCCUR_DATE_05,674,Claim,,,,
2300,2300.HI06,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI06.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BH Occurrence,"Hardcode as ""BH""",,,,,,,
2300,2300.HI06.02,Industry Code,Code indicating a code from a specific industry code list,R,,OCCUR_CODE_6,OCCUR_CODE_06,675,Claim,,,,
2300,2300.HI06.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2300,2300.HI06.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OCCUR_DATE_6,OCCUR_DATE_06,676,Claim,,,,
2300,2300.HI07,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI07.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BH Occurrence,"Hardcode as ""BH""",,,,,,,
2300,2300.HI07.02,Industry Code,Code indicating a code from a specific industry code list,R,,OCCUR_CODE_7,OCCUR_CODE_07,677,Claim,,,,
2300,2300.HI07.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2300,2300.HI07.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OCCUR_DATE_7,OCCUR_DATE_07,678,Claim,,,,
2300,2300.HI08,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI08.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BH Occurrence,"Hardcode as ""BH""",,,,,,,
2300,2300.HI08.02,Industry Code,Code indicating a code from a specific industry code list,R,,OCCUR_CODE_8,OCCUR_CODE_08,679,Claim,,,,
2300,2300.HI08.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2300,2300.HI08.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OCCUR_DATE_8,OCCUR_DATE_08,680,Claim,,,,
2300,2300.HI09,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI09.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BH Occurrence,"Hardcode as ""BH""",,,,,,,
2300,2300.HI09.02,Industry Code,Code indicating a code from a specific industry code list,R,,OCCUR_CODE_9,OCCUR_CODE_09,681,Claim,,,,
2300,2300.HI09.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2300,2300.HI09.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OCCUR_DATE_9,OCCUR_DATE_09,682,Claim,,,,
2300,2300.HI10,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI10.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BH Occurrence,"Hardcode as ""BH""",,,,,,,
2300,2300.HI10.02,Industry Code,Code indicating a code from a specific industry code list,R,,OCCUR_CODE_10,OCCUR_CODE_10,683,Claim,,,,
2300,2300.HI10.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2300,2300.HI10.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OCCUR_DATE_10,OCCUR_DATE_10,684,Claim,,,,
2300,2300.HI11,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI11.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BH Occurrence,"Hardcode as ""BH""",,,,,,,
2300,2300.HI11.02,Industry Code,Code indicating a code from a specific industry code list,R,,OCCUR_CODE_11,OCCUR_CODE_11,685,Claim,,,,
2300,2300.HI11.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2300,2300.HI11.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OCCUR_DATE_11,OCCUR_DATE_11,686,Claim,,,,
2300,2300.HI12,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI12.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BH Occurrence,"Hardcode as ""BH""",,,,,,,
2300,2300.HI12.02,Industry Code,Code indicating a code from a specific industry code list,R,,OCCUR_CODE_12,OCCUR_CODE_12,687,Claim,,,,
2300,2300.HI12.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2300,2300.HI12.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OCCUR_DATE_12,OCCUR_DATE_12,688,Claim,,,,
2300,2300.HI13,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",R,,,,,,,,,
2300,2300.HI13.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BH Occurrence,"Hardcode as ""BH""",,,,,,,
2300,2300.HI13.02,Industry Code,Code indicating a code from a specific industry code list,R,,OCCUR_CODE_13,OCCUR_CODE_13,689,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/prOccurrenceSpan/occurrenceCode/occurrenceCode
2300,2300.HI13.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2300,2300.HI13.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OCCUR_DATE_13,OCCUR_DATE_13,690,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/prOccurrenceCode/occurrenceCode/prStartDate
2300,2300.HI14,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI14.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BH Occurrence,"Hardcode as ""BH""",,,,,,,
2300,2300.HI14.02,Industry Code,Code indicating a code from a specific industry code list,R,,OCCUR_CODE_14,OCCUR_CODE_14,691,Claim,,,,
2300,2300.HI14.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2300,2300.HI14.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OCCUR_DATE_14,OCCUR_DATE_14,692,Claim,,,,
2300,2300.HI15,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI15.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BH Occurrence,"Hardcode as ""BH""",,,,,,,
2300,2300.HI15.02,Industry Code,Code indicating a code from a specific industry code list,R,,OCCUR_CODE_15,OCCUR_CODE_15,693,Claim,,,,
2300,2300.HI15.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2300,2300.HI15.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OCCUR_DATE_15,OCCUR_DATE_15,694,Claim,,,,
2300,2300.HI16,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI16.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BH Occurrence,"Hardcode as ""BH""",,,,,,,
2300,2300.HI16.02,Industry Code,Code indicating a code from a specific industry code list,R,,OCCUR_CODE_16,OCCUR_CODE_16,695,Claim,,,,
2300,2300.HI16.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2300,2300.HI16.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OCCUR_DATE_16,OCCUR_DATE_16,696,Claim,,,,
2300,2300.HI17,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI17.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BH Occurrence,"Hardcode as ""BH""",,,,,,,
2300,2300.HI17.02,Industry Code,Code indicating a code from a specific industry code list,R,,OCCUR_CODE_17,OCCUR_CODE_17,697,Claim,,,,
2300,2300.HI17.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2300,2300.HI17.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OCCUR_DATE_17,OCCUR_DATE_17,698,Claim,,,,
2300,2300.HI18,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI18.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BH Occurrence,"Hardcode as ""BH""",,,,,,,
2300,2300.HI18.02,Industry Code,Code indicating a code from a specific industry code list,R,,OCCUR_CODE_18,OCCUR_CODE_18,699,Claim,,,,
2300,2300.HI18.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2300,2300.HI18.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OCCUR_DATE_18,OCCUR_DATE_18,700,Claim,,,,
2300,2300.HI19,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI19.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BH Occurrence,"Hardcode as ""BH""",,,,,,,
2300,2300.HI19.02,Industry Code,Code indicating a code from a specific industry code list,R,,OCCUR_CODE_19,OCCUR_CODE_19,701,Claim,,,,
2300,2300.HI19.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2300,2300.HI19.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OCCUR_DATE_19,OCCUR_DATE_19,702,Claim,,,,
2300,2300.HI20,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI20.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BH Occurrence,"Hardcode as ""BH""",,,,,,,
2300,2300.HI20.02,Industry Code,Code indicating a code from a specific industry code list,R,,OCCUR_CODE_20,OCCUR_CODE_20,703,Claim,,,,
2300,2300.HI20.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2300,2300.HI20.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OCCUR_DATE_20,OCCUR_DATE_20,704,Claim,,,,
2300,2300.HI21,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI21.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BH Occurrence,"Hardcode as ""BH""",,,,,,,
2300,2300.HI21.02,Industry Code,Code indicating a code from a specific industry code list,R,,OCCUR_CODE_21,OCCUR_CODE_21,705,Claim,,,,
2300,2300.HI21.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2300,2300.HI21.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OCCUR_DATE_21,OCCUR_DATE_21,706,Claim,,,,
2300,2300.HI22,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI22.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BH Occurrence,"Hardcode as ""BH""",,,,,,,
2300,2300.HI22.02,Industry Code,Code indicating a code from a specific industry code list,R,,OCCUR_CODE_22,OCCUR_CODE_22,707,Claim,,,,
2300,2300.HI22.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2300,2300.HI22.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OCCUR_DATE_22,OCCUR_DATE_22,708,Claim,,,,
2300,2300.HI23,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI23.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BH Occurrence,"Hardcode as ""BH""",,,,,,,
2300,2300.HI23.02,Industry Code,Code indicating a code from a specific industry code list,R,,OCCUR_CODE_23,OCCUR_CODE_23,709,Claim,,,,
2300,2300.HI23.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2300,2300.HI23.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OCCUR_DATE_23,OCCUR_DATE_23,710,Claim,,,,
2300,2300.HI24,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI24.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BH Occurrence,"Hardcode as ""BH""",,,,,,,
2300,2300.HI24.02,Industry Code,Code indicating a code from a specific industry code list,R,,OCCUR_CODE_24,OCCUR_CODE_24,711,Claim,,,,
2300,2300.HI24.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2300,2300.HI24.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,OCCUR_DATE_24,OCCUR_DATE_24,712,Claim,,,,
2300,HI,Value Information-Segment Repeat: 2,,S,,,,,,,,,
2300,2300.HI01,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",R,,,,,,,,,
2300,2300.HI01.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BE Value,"Hardcode as ""BE""",,,,,,,
2300,2300.HI01.02,Industry Code,Code indicating a code from a specific industry code list,R,,VALUE_CODE_1,VALUE_CODE_01,46,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/prValueCodes/paymentRequestValueCode/valueCode
2300,2300.HI01.05,Monetary Amount,Monetary amount,R,,VALUE_AMOUNT_1,VALUE_AMOUNT_01,47,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/prValueCodes/paymentRequestValueCode/amount
2300,2300.HI02,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI02.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BE Value,"Hardcode as ""BE""",,,,,,,
2300,2300.HI02.02,Industry Code,Code indicating a code from a specific industry code list,R,,VALUE_CODE_2,VALUE_CODE_02,48,Claim,,,,
2300,2300.HI02.05,Monetary Amount,Monetary amount,R,,VALUE_AMOUNT_2,VALUE_AMOUNT_02,49,Claim,,,,
2300,2300.HI03,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI03.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BE Value,"Hardcode as ""BE""",,,,,,,
2300,2300.HI03.02,Industry Code,Code indicating a code from a specific industry code list,R,,VALUE_CODE_3,VALUE_CODE_03,50,Claim,,,,
2300,2300.HI03.05,Monetary Amount,Monetary amount,R,,VALUE_AMOUNT_3,VALUE_AMOUNT_03,51,Claim,,,,
2300,2300.HI04,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI04.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BE Value,"Hardcode as ""BE""",,,,,,,
2300,2300.HI04.02,Industry Code,Code indicating a code from a specific industry code list,R,,VALUE_CODE_4,VALUE_CODE_04,52,Claim,,,,
2300,2300.HI04.05,Monetary Amount,Monetary amount,R,,VALUE_AMOUNT_4,VALUE_AMOUNT_04,53,Claim,,,,
2300,2300.HI05,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI05.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BE Value,"Hardcode as ""BE""",,,,,,,
2300,2300.HI05.02,Industry Code,Code indicating a code from a specific industry code list,R,,VALUE_CODE_5,VALUE_CODE_05,54,Claim,,,,
2300,2300.HI05.05,Monetary Amount,Monetary amount,R,,VALUE_AMOUNT_5,VALUE_AMOUNT_05,55,Claim,,,,
2300,2300.HI06,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI06.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BE Value,"Hardcode as ""BE""",,,,,,,
2300,2300.HI06.02,Industry Code,Code indicating a code from a specific industry code list,R,,VALUE_CODE_6,VALUE_CODE_06,56,Claim,,,,
2300,2300.HI06.05,Monetary Amount,Monetary amount,R,,VALUE_AMOUNT_6,VALUE_AMOUNT_06,57,Claim,,,,
2300,2300.HI07,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI07.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BE Value,"Hardcode as ""BE""",,,,,,,
2300,2300.HI07.02,Industry Code,Code indicating a code from a specific industry code list,R,,VALUE_CODE_7,VALUE_CODE_07,58,Claim,,,,
2300,2300.HI07.05,Monetary Amount,Monetary amount,R,,VALUE_AMOUNT_7,VALUE_AMOUNT_07,59,Claim,,,,
2300,2300.HI08,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI08.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BE Value,"Hardcode as ""BE""",,,,,,,
2300,2300.HI08.02,Industry Code,Code indicating a code from a specific industry code list,R,,VALUE_CODE_8,VALUE_CODE_08,60,Claim,,,,
2300,2300.HI08.05,Monetary Amount,Monetary amount,R,,VALUE_AMOUNT_8,VALUE_AMOUNT_08,61,Claim,,,,
2300,2300.HI09,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI09.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BE Value,"Hardcode as ""BE""",,,,,,,
2300,2300.HI09.02,Industry Code,Code indicating a code from a specific industry code list,R,,VALUE_CODE_9,VALUE_CODE_09,62,Claim,,,,
2300,2300.HI09.05,Monetary Amount,Monetary amount,R,,VALUE_AMOUNT_9,VALUE_AMOUNT_09,63,Claim,,,,
2300,2300.HI10,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI10.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BE Value,"Hardcode as ""BE""",,,,,,,
2300,2300.HI10.02,Industry Code,Code indicating a code from a specific industry code list,R,,VALUE_CODE_10,VALUE_CODE_10,64,Claim,,,,
2300,2300.HI10.05,Monetary Amount,Monetary amount,R,,VALUE_AMOUNT_10,VALUE_AMOUNT_10,65,Claim,,,,
2300,2300.HI11,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI11.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BE Value,"Hardcode as ""BE""",,,,,,,
2300,2300.HI11.02,Industry Code,Code indicating a code from a specific industry code list,R,,VALUE_CODE_11,VALUE_CODE_11,66,Claim,,,,
2300,2300.HI11.05,Monetary Amount,Monetary amount,R,,VALUE_AMOUNT_11,VALUE_AMOUNT_11,67,Claim,,,,
2300,2300.HI12,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI12.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BE Value,"Hardcode as ""BE""",,,,,,,
2300,2300.HI12.02,Industry Code,Code indicating a code from a specific industry code list,R,,VALUE_CODE_12,VALUE_CODE_12,68,Claim,,,,
2300,2300.HI12.05,Monetary Amount,Monetary amount,R,,VALUE_AMOUNT_12,VALUE_AMOUNT_12,69,Claim,,,,
2300,2300.HI13,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI13.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BE Value,"Hardcode as ""BE""",,,,,,,
2300,2300.HI13.02,Industry Code,Code indicating a code from a specific industry code list,R,,VALUE_CODE_13,VALUE_CODE_13,70,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/prValueCodes/paymentRequestValueCode/valueCode
2300,2300.HI13.05,Monetary Amount,Monetary amount,R,,VALUE_AMOUNT_13,VALUE_AMOUNT_13,71,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/prValueCodes/paymentRequestValueCode/amount
2300,2300.HI14,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI14.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BE Value,"Hardcode as ""BE""",,,,,,,
2300,2300.HI14.02,Industry Code,Code indicating a code from a specific industry code list,R,,VALUE_CODE_14,VALUE_CODE_14,72,Claim,,,,
2300,2300.HI14.05,Monetary Amount,Monetary amount,R,,VALUE_AMOUNT_14,VALUE_AMOUNT_14,73,Claim,,,,
2300,2300.HI15,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI15.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BE Value,"Hardcode as ""BE""",,,,,,,
2300,2300.HI15.02,Industry Code,Code indicating a code from a specific industry code list,R,,VALUE_CODE_15,VALUE_CODE_15,74,Claim,,,,
2300,2300.HI15.05,Monetary Amount,Monetary amount,R,,VALUE_AMOUNT_15,VALUE_AMOUNT_15,75,Claim,,,,
2300,2300.HI16,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI16.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BE Value,"Hardcode as ""BE""",,,,,,,
2300,2300.HI16.02,Industry Code,Code indicating a code from a specific industry code list,R,,VALUE_CODE_16,VALUE_CODE_16,76,Claim,,,,
2300,2300.HI16.05,Monetary Amount,Monetary amount,R,,VALUE_AMOUNT_16,VALUE_AMOUNT_16,77,Claim,,,,
2300,2300.HI17,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI17.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BE Value,"Hardcode as ""BE""",,,,,,,
2300,2300.HI17.02,Industry Code,Code indicating a code from a specific industry code list,R,,VALUE_CODE_17,VALUE_CODE_17,78,Claim,,,,
2300,2300.HI17.05,Monetary Amount,Monetary amount,R,,VALUE_AMOUNT_17,VALUE_AMOUNT_17,79,Claim,,,,
2300,2300.HI18,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI18.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BE Value,"Hardcode as ""BE""",,,,,,,
2300,2300.HI18.02,Industry Code,Code indicating a code from a specific industry code list,R,,VALUE_CODE_18,VALUE_CODE_18,80,Claim,,,,
2300,2300.HI18.05,Monetary Amount,Monetary amount,R,,VALUE_AMOUNT_18,VALUE_AMOUNT_18,81,Claim,,,,
2300,2300.HI19,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI19.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BE Value,"Hardcode as ""BE""",,,,,,,
2300,2300.HI19.02,Industry Code,Code indicating a code from a specific industry code list,R,,VALUE_CODE_19,VALUE_CODE_19,82,Claim,,,,
2300,2300.HI19.05,Monetary Amount,Monetary amount,R,,VALUE_AMOUNT_19,VALUE_AMOUNT_19,83,Claim,,,,
2300,2300.HI20,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI20.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BE Value,"Hardcode as ""BE""",,,,,,,
2300,2300.HI20.02,Industry Code,Code indicating a code from a specific industry code list,R,,VALUE_CODE_20,VALUE_CODE_20,84,Claim,,,,
2300,2300.HI20.05,Monetary Amount,Monetary amount,R,,VALUE_AMOUNT_20,VALUE_AMOUNT_20,85,Claim,,,,
2300,2300.HI21,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI21.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BE Value,"Hardcode as ""BE""",,,,,,,
2300,2300.HI21.02,Industry Code,Code indicating a code from a specific industry code list,R,,VALUE_CODE_21,VALUE_CODE_21,86,Claim,,,,
2300,2300.HI21.05,Monetary Amount,Monetary amount,R,,VALUE_AMOUNT_21,VALUE_AMOUNT_21,87,Claim,,,,
2300,2300.HI22,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI22.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BE Value,"Hardcode as ""BE""",,,,,,,
2300,2300.HI22.02,Industry Code,Code indicating a code from a specific industry code list,R,,VALUE_CODE_22,VALUE_CODE_22,88,Claim,,,,
2300,2300.HI22.05,Monetary Amount,Monetary amount,R,,VALUE_AMOUNT_22,VALUE_AMOUNT_22,89,Claim,,,,
2300,2300.HI23,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI23.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BE Value,"Hardcode as ""BE""",,,,,,,
2300,2300.HI23.02,Industry Code,Code indicating a code from a specific industry code list,R,,VALUE_CODE_23,VALUE_CODE_23,90,Claim,,,,
2300,2300.HI23.05,Monetary Amount,Monetary amount,R,,VALUE_AMOUNT_23,VALUE_AMOUNT_23,91,Claim,,,,
2300,2300.HI24,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI24.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BE Value,"Hardcode as ""BE""",,,,,,,
2300,2300.HI24.02,Industry Code,Code indicating a code from a specific industry code list,R,,VALUE_CODE_24,VALUE_CODE_24,92,Claim,,,,
2300,2300.HI24.05,Monetary Amount,Monetary amount,R,,VALUE_AMOUNT_24,VALUE_AMOUNT_24,93,Claim,,,,
2300,HI,Condition Information -Segment Repeat: 2,,S,,,,,,,,,
2300,2300.HI01,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",R,,,,,,,,,
2300,2300.HI01.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG Condition,"Hardcode as ""BG""",,,,,,,
2300,2300.HI01.02,Industry Code,Code indicating a code from a specific industry code list,R,,CONDITION_CODE_1,CONDITION_CODE_01,22,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/prConditionCodes/string
2300,2300.HI02,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI02.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG Condition,"Hardcode as ""BG""",,,,,,,
2300,2300.HI02.02,Industry Code,Code indicating a code from a specific industry code list,R,,CONDITION_CODE_2,CONDITION_CODE_02,23,Claim,,,,
2300,2300.HI03,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI03.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG Condition,"Hardcode as ""BG""",,,,,,,
2300,2300.HI03.02,Industry Code,Code indicating a code from a specific industry code list,R,,CONDITION_CODE_3,CONDITION_CODE_03,24,Claim,,,,
2300,2300.HI04,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI04.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG Condition,"Hardcode as ""BG""",,,,,,,
2300,2300.HI04.02,Industry Code,Code indicating a code from a specific industry code list,R,,CONDITION_CODE_4,CONDITION_CODE_04,25,Claim,,,,
2300,2300.HI05,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI05.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG Condition,"Hardcode as ""BG""",,,,,,,
2300,2300.HI05.02,Industry Code,Code indicating a code from a specific industry code list,R,,CONDITION_CODE_5,CONDITION_CODE_05,26,Claim,,,,
2300,2300.HI06,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI06.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG Condition,"Hardcode as ""BG""",,,,,,,
2300,2300.HI06.02,Industry Code,Code indicating a code from a specific industry code list,R,,CONDITION_CODE_6,CONDITION_CODE_06,27,Claim,,,,
2300,2300.HI07,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI07.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG Condition,"Hardcode as ""BG""",,,,,,,
2300,2300.HI07.02,Industry Code,Code indicating a code from a specific industry code list,R,,CONDITION_CODE_7,CONDITION_CODE_07,28,Claim,,,,
2300,2300.HI08,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI08.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG Condition,"Hardcode as ""BG""",,,,,,,
2300,2300.HI08.02,Industry Code,Code indicating a code from a specific industry code list,R,,CONDITION_CODE_8,CONDITION_CODE_08,29,Claim,,,,
2300,2300.HI09,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI09.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG Condition,"Hardcode as ""BG""",,,,,,,
2300,2300.HI09.02,Industry Code,Code indicating a code from a specific industry code list,R,,CONDITION_CODE_9,CONDITION_CODE_09,30,Claim,,,,
2300,2300.HI10,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI10.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG Condition,"Hardcode as ""BG""",,,,,,,
2300,2300.HI10.02,Industry Code,Code indicating a code from a specific industry code list,R,,CONDITION_CODE_10,CONDITION_CODE_10,31,Claim,,,,
2300,2300.HI11,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI11.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG Condition,"Hardcode as ""BG""",,,,,,,
2300,2300.HI11.02,Industry Code,Code indicating a code from a specific industry code list,R,,CONDITION_CODE_11,CONDITION_CODE_11,32,Claim,,,,
2300,2300.HI12,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI12.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG Condition,"Hardcode as ""BG""",,,,,,,
2300,2300.HI12.02,Industry Code,Code indicating a code from a specific industry code list,R,,CONDITION_CODE_12,CONDITION_CODE_12,33,Claim,,,,
2300,2300.HI13,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI13.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG Condition,"Hardcode as ""BG""",,,,,,,
2300,2300.HI13.02,Industry Code,Code indicating a code from a specific industry code list,R,,CONDITION_CODE_13,CONDITION_CODE_13,34,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/prConditionCodes/string
2300,2300.HI14,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI14.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG Condition,"Hardcode as ""BG""",,,,,,,
2300,2300.HI14.02,Industry Code,Code indicating a code from a specific industry code list,R,,CONDITION_CODE_14,CONDITION_CODE_14,35,Claim,,,,
2300,2300.HI15,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI15.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG Condition,"Hardcode as ""BG""",,,,,,,
2300,2300.HI15.02,Industry Code,Code indicating a code from a specific industry code list,R,,CONDITION_CODE_15,CONDITION_CODE_15,36,Claim,,,,
2300,2300.HI16,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI16.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG Condition,"Hardcode as ""BG""",,,,,,,
2300,2300.HI16.02,Industry Code,Code indicating a code from a specific industry code list,R,,CONDITION_CODE_16,CONDITION_CODE_16,37,Claim,,,,
2300,2300.HI17,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI17.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG Condition,"Hardcode as ""BG""",,,,,,,
2300,2300.HI17.02,Industry Code,Code indicating a code from a specific industry code list,R,,CONDITION_CODE_17,CONDITION_CODE_17,38,Claim,,,,
2300,2300.HI18,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI18.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG Condition,"Hardcode as ""BG""",,,,,,,
2300,2300.HI18.02,Industry Code,Code indicating a code from a specific industry code list,R,,CONDITION_CODE_18,CONDITION_CODE_18,39,Claim,,,,
2300,2300.HI19,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI19.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG Condition,"Hardcode as ""BG""",,,,,,,
2300,2300.HI19.02,Industry Code,Code indicating a code from a specific industry code list,R,,CONDITION_CODE_19,CONDITION_CODE_19,40,Claim,,,,
2300,2300.HI20,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI20.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG Condition,"Hardcode as ""BG""",,,,,,,
2300,2300.HI20.02,Industry Code,Code indicating a code from a specific industry code list,R,,CONDITION_CODE_20,CONDITION_CODE_20,41,Claim,,,,
2300,2300.HI21,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI21.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG Condition,"Hardcode as ""BG""",,,,,,,
2300,2300.HI21.02,Industry Code,Code indicating a code from a specific industry code list,R,,CONDITION_CODE_21,CONDITION_CODE_21,42,Claim,,,,
2300,2300.HI22,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI22.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG Condition,"Hardcode as ""BG""",,,,,,,
2300,2300.HI22.02,Industry Code,Code indicating a code from a specific industry code list,R,,CONDITION_CODE_22,CONDITION_CODE_22,43,Claim,,,,
2300,2300.HI23,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI23.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG Condition,"Hardcode as ""BG""",,,,,,,
2300,2300.HI23.02,Industry Code,Code indicating a code from a specific industry code list,R,,CONDITION_CODE_23,CONDITION_CODE_23,44,Claim,,,,
2300,2300.HI24,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,,
2300,2300.HI24.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG Condition,"Hardcode as ""BG""",,,,,,,
2300,2300.HI24.02,Industry Code,Code indicating a code from a specific industry code list,R,,CONDITION_CODE_24,CONDITION_CODE_24,45,Claim,,,,
2300,HI,Treatment Code Information,,S,,,,,,,,,
2300,2300.HI01.01,Code List Qualifier Code,,,TC Treatment Codes,,,,,,,,
2300,2300.HI01.02,Industry Code,,,,,,,,,,,
2300,2300.HI02.01,Code List Qualifier Code,,,,,,,,,,,
2300,2300.HI02.02,Industry Code,,,,,,,,,,,
2300,2300.HI03.01,Code List Qualifier Code,,,,,,,,,,,
2300,2300.HI03.02,Industry Code,,,,,,,,,,,
2300,2300.HI04.01,Code List Qualifier Code,,,,,,,,,,,
2300,2300.HI04.02,Industry Code,,,,,,,,,,,
2300,2300.HI05.01,Code List Qualifier Code,,,,,,,,,,,
2300,2300.HI05.02,Industry Code,,,,,,,,,,,
2300,2300.HI06.01,Code List Qualifier Code,,,,,,,,,,,
2300,2300.HI06.02,Industry Code,,,,,,,,,,,
2300,2300.HI07.01,Code List Qualifier Code,,,,,,,,,,,
2300,2300.HI07.02,Industry Code,,,,,,,,,,,
2300,2300.HI08.01,Code List Qualifier Code,,,,,,,,,,,
2300,2300.HI08.02,Industry Code,,,,,,,,,,,
2300,2300.HI09.01,Code List Qualifier Code,,,,,,,,,,,
2300,2300.HI09.02,Industry Code,,,,,,,,,,,
2300,2300.HI10.01,Code List Qualifier Code,,,,,,,,,,,
2300,2300.HI10.02,Industry Code,,,,,,,,,,,
2300,2300.HI11.01,Code List Qualifier Code,,,,,,,,,,,
2300,2300.HI11.02,Industry Code,,,,,,,,,,,
2300,2300.HI12.01,Code List Qualifier Code,,,,,,,,,,,
2300,2300.HI12.02,Industry Code,,,,,,,,,,,
2300,HI,Claim Pricing/Repricing Information,,,,,,,,,,,
2300,2300.HCP01,Pricing Methodology,,,,,,,,,,,
2300,2300.HCP02,Monetary Amount,,,,,,,,,,,
2300,2300.HCP03,Monetary Amount,,,,,,,,,,,
2300,2300.HCP04,Reference Identification,,,,,,,,,,,
2300,2300.HCP05,Rate,,,,,,,,,,,
2300,2300.HCP06,Reference Identification,,,,,,,,,,,
2300,2300.HCP07,Monetary Amount,,,,,,,,,,,
2300,2300.HCP08,Product/Service ID,,,,,,,,,,,
2300,2300.HCP11,Unit or Basis for Measurement Code,,,"DA Days
UN Unit",,,,,,,,
2300,2300.HCP12,Quantity,,,,,,,,,,,
2300,2300.HCP13,Reject Reason Code,,,"T1 Cannot Identify Provider as TPO (Third Party
Organization) Participant
T2 Cannot Identify Payer as TPO (Third Party
Organization) Participant
T3 Cannot Identify Insured as TPO (Third Party
Organization) Participant
T4 Payer Name or Identifier Missing
T5 Certification Information Missing
T6 Claim does not contain enough information for repricing",,,,,,,,
2300,2300.HCP14,Policy Compliance Code,,,"1 Procedure Followed (Compliance)
2 Not Followed - Call Not Made (Non-Compliance Call
Not Made)
3 Not Medically Necessary (Non-Compliance Non-
Medically Necessary)
4 Not Followed Other (Non-Compliance Other)
5 Emergency Admit to Non-Network Hospital",,,,,,,,
2300,2300.HCP15,Exception Code,,,"1 Non-Network Professional Provider in Network
Hospital
2 Emergency Care
3 Services or Specialist not in Network
4 Out-of-Service Area
5 State Mandates
6 Other",,,,,,,,
LOOP 2310A - ATTENDING PROVIDER NAME,,,,,,,,,,,,,
2310A,NM1,Attending Provider Name,,S,,,,,,,,,
2310A,2310A.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,71 Attending Physician,"Hardcode as ""71""",,,,,,,
2310A,2310A.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,1 Person,"Hardcode as ""1""",,,,,,,
2310A,2310A.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,ATTENDING_LAST_NAME,ATTENDING_LAST_NAME,543,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/attendingInformation/practitioner/lastName
2310A,2310A.NM104,Name First,ndividual first name,S,,ATTENDING_FIRST_NAME,ATTENDING_FIRST_NAME,544,Claim,,,,"ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/attendingInformation/practitioner/firstName
ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/referringInformation/practitioner/firstName"
2310A,2310A.NM105,Name Middle,Individual middle name or initial,S,,ATTENDING_MIDDLE_NAME,ATTENDING_MIDDLE_NAME,545,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/attendingInformation/practitioner/middleName
2310A,2310A.NM107,Name Suffix,Suffix to individual name,S,,ATTENDING_NAME_SUFFIX,ATTENDING_NAME_SUFFIX,546,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/attendingInformation/practitioner/nameSuffix
2310A,2310A.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),S,"XX Centers for Medicare and Medicaid Services
National Provider Identifier","Hardcode as ""XX""",,,,,,,
2310A,2310A.NM109,Identification Code,Code identifying a party or other code,S,,ATTENDING_NPI,ATTENDING_NPI,538,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/attendingInformation/NPI
2310A,PRV,Provider Information,,S,,,,,,,,,
2310A,2310A.PRV01,Provider Code,Code identifying the type of provider,R,AT Attending,"Hardcode as ""AT""",,,,,,,
2310A,2310A.PRV02,Reference Identification Qualifier,Code qualifying the Reference Identification,R,PXC Health Care Provider Taxonomy Code,"Hardcode as ""PXC""",,,,,,,
2310A,2310A.PRV03,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,ATTENDING_TAXONOMY_CODE,ATTENDING_TAXONOMY_CODE,541,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/attendingInformation/primarySpecialty/taxonomyCode
2310A,REF,Attending Provider Secondary Identification,,S,,,,,,,,,
2310A,2310A.REF01,Reference Identification Qualifier,,,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number
LU Location Number",,,,,,,,
2310A,2310A.REF02,Reference Identification,,,,,,,,,,,
LOOP 2310B - OPERATING PHYSICIAN NAME,,,,,,,,,,,,,
LOOP 2310B - RENDERING PROVIDER NAME,NM1,Operating Physician Name,,,,,,,,,,,
2310B,2310B.NM101,Entity Identifier Code,,,72 Operating Physician,,,,,,,,
2310B,2310B.NM102,Entity Type Qualifier,,,1 Person,,,,,,,,
2310B,2310B.NM103,Name Last or Organization Name,,,,,,,,,,,
2310B,2310B.NM104,Name First,,,,,,,,,,,
2310B,2310B.NM105,Name Middle,,,,,,,,,,,
2310B,2310B.NM107,Name Suffix,,,,,,,,,,,
2310B,2310B.NM108,Identification Code Qualifier,,,"XX Centers for Medicare and Medicaid Services
National Provider Identifier",,,,,,,,
2310B,2310B.NM109,Identification Code,,,,,,,,,,,
2310B,REF,Operating Physician Secondary Identification,,,,,,,,,,,
2310B,2310B.REF01,Reference Identification Qualifier,,,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number
LU Location Number",,,,,,,,
2310B,2310B.REF02,Reference Identification,,,,,,,,,,,
"LOOP 2310C - OTHER OPERATING PHYSICIAN
NAME",,,,,,,,,,,,,
2310C,NM1,Other Operating Physician Name,,S,,,,,,,,,
2310C,2310C.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,ZZ Mutually Defined,"Hardcode as ""ZZ""",,,,,,,
2310C,2310C.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,1 Person,"Hardcode as ""1""",,,,,,,
2310C,2310C.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,OTHER_OPERATING_LAST_NAME,OTHER_OPERATING_LAST_NAME,565,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/otherPractitionerList/practitioner/practitioner/lastName
2310C,2310C.NM104,Name First,Individual first name,R,,OTHER_OPERATING_FIRST_NAME,OTHER_OPERATING_FIRST_NAME,566,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/otherPractitionerList/practitioner/practitioner/firstName
2310C,2310C.NM105,Name Middle,Individual middle name or initial,S,,OTHER_OPERATING_MIDDLE_NAME,OTHER_OPERATING_MIDDLE_NAME,567,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/otherPractitionerList/practitioner/practitioner/middleName
2310C,2310C.NM107,Name Suffix,Suffix to individual name,S,,OTHER_OPERATING_NAME_SUFFIX,OTHER_OPERATING_NAME_SUFFIX,568,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/otherPractitionerList/practitioner/practitioner/nameSuffix
2310C,2310C.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),S,XX Centers for Medicare and Medicaid Services National Provider Identifier,"Hardcode as ""XX""",,,,,,,
2310C,2310C.NM109,Identification Code,Code identifying a party or other code,S,,OTHER_OPERATING_NPI,OTHER_OPERATING_NPI,560,Claim,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/otherPractitionerList/practitioner/NPI
2310C,REF,Other Operating Physician Secondary Identification,,,,,,,,,,,
2310C,2310C.REF01,Reference Identification Qualifier,,,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number
LU Location Number",,,,,,,,
2310C,2310C.REF02,Reference Identification,,,,,,,,,,,
LOOP 2310D - RENDERING PROVIDER NAME,,,,,,,,,,,,,
2310D,NM1,Rendering Provider Name,,,,,,,,,,,
2310D,2310D.NM101,Entity Identifier Code,,,82 Rendering Provider,,,,,,,,
2310D,2310D.NM102,Entity Type Qualifier,,,1 Person,,,,,,,,
2310D,2310D.NM103,Name Last or Organization Name,,,,,,,,,,,
2310D,2310D.NM104,Name First,,,,,,,,,,,
2310D,2310D.NM105,Name Middle,,,,,,,,,,,
2310D,2310D.NM107,Name Suffix,,,,,,,,,,,
2310D,2310D.NM108,Identification Code Qualifier,,,"XX Centers for Medicare and Medicaid Services
National Provider Identifier",,,,,,,,
2310D,2310D.NM109,Identification Code,,,,,,,,,,,
2310D,REF,Rendering Provider Secondary Identification,,,,,,,,,,,
2310D,2310D.REF01,Reference Identification Qualifier,,,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number
LU Location Number",,,,,,,,
2310D,2310D.REF02,Reference Identification,,,,,,,,,,,
"LOOP 2310E - SERVICE FACILITY LOCATION
NAME",,,,,,,,,,,,,
2310E,NM1,Service Facility Location Name,,,,,,,,,,,
2310E,2310E.NM101,Entity Identifier Code,,,77 Service Location,,,,,,,,
2310E,2310E.NM102,Entity Type Qualifier,,,2 Non-Person Entity,,,,,,,,
2310E,2310E.NM103,Name Last or Organization Name,,,,,,,,,,,
2310E,2310E.NM108,Identification Code Qualifier,,,"XX Centers for Medicare and Medicaid Services
National Provider Identifier",,,,,,,,
2310E,2310E.NM109,Identification Code,,,,,,,,,,,
2310E,N3,Service Facility Location Address (Required),,,,,,,,,,,
2310E,2310E.N301,Address Information,,,,,,,,,,,
2310E,2310E.N302,Address Information,,,,,,,,,,,
2310E,N4,"Service Facility Location City, State, ZIP Code (Required)",,,,,,,,,,,
2310E,2310E.N401,City Name,,,,,,,,,,,
2310E,2310E.N402,State or Province Code,,,,,,,,,,,
2310E,2310E.N403,Postal Code,,,,,,,,,,,
2310E,2310E.N404,Country Code,,,,,,,,,,,
2310E,2310E.N407,Country Subdivision Code,,,,,,,,,,,
2310E,REF,Service Facility Location Secondary Identification,,S,,,,,,,,,
2310E,2310E.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B State License Number
G2 Provider Commercial Number
LU Location Number",,,,,,,,
2310E,2310E.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,,
LOOP 2310F - REFERRING PROVIDER NAME,,,,,,,,,,,,,
2310F,NM1,Referring Provider Name,,S,,,,,,,,,
2310F,2310F.NM101,Entity Identifier Code,,,DN Referring Provider,,,,,,,,
2310F,2310F.NM102,Entity Type Qualifier,,,1 Person,,,,,,,,
2310F,2310F.NM103,Name Last or Organization Name,,,,,,,,,,,
2310F,2310F.NM104,Name First,,,,,,,,,,,
2310F,2310F.NM105,Name Middle,,,,,,,,,,,
2310F,2310F.NM107,Name Suffix,,,,,,,,,,,
2310F,2310F.NM108,Identification Code Qualifier,,,"XX Centers for Medicare and Medicaid Services
National Provider Identifier",,,,,,,,
2310F,2310F.NM109,Identification Code,,,,,,,,,,,
2310F,REF,Referring Provider Secondary Identification,,,,,,,,,,,
2310F,2310F.REF01,Reference Identification Qualifier,,,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number",,,,,,,,
2310F,2310F.REF02,Reference Identification,,,,,,,,,,,
LOOP 2320 - OTHER SUBSCRIBER INFORMATION,,,,,,,,,,,,,
2320,SBR,Other Subscriber Information,,S,,,,,,,,,
2320,2320.SBR01,Payer Responsibility Sequence Number Code,Code identifying the insurance carrier’s level of responsibility for a payment of a claim,R,"A Payer Responsibility Four
B Payer Responsibility Five
C Payer Responsibility Six
D Payer Responsibility Seven
E Payer Responsibility Eight
F Payer Responsibility Nine
G Payer Responsibility Ten
H Payer Responsibility Eleven
P Primary
S Secondary
T Tertiary
U Unknown",,,,,,,,
2320,2320.SBR02,Individual Relationship Code,Code indicating the relationship between two individuals or entities,R,"01 Spouse
18 Self
19 Child
20 Employee
21 Unknown
39 Organ Donor
40 Cadaver Donor
53 Life Partner
G8 Other Relationship",,,,,,,,
2320,2320.SBR03,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,S,,,,,,,,,
2320,2320.SBR04,Name,Free-form name,S,,,,,,,,,
2320,2320.SBR09,Claim Filing Indicator Code,,,"11 Other Non-Federal Programs
12 Preferred Provider Organization (PPO)
13 Point of Service (POS)
14 Exclusive Provider Organization (EPO)
15 Indemnity Insurance
16 Health Maintenance Organization (HMO) Medicare
Risk
17 Dental Maintenance Organization
AM Automobile Medical
BL Blue Cross/Blue Shield
CH Champus
CI Commercial Insurance Co.
DS Disability
FI Federal Employees Program
HM Health Maintenance Organization
LM Liability Medical
MA Medicare Part A
MB Medicare Part B
MC Medicaid
OF Other Federal Program
TV Title V
VA Veterans Affairs Plan
WC Workers’ Compensation Health Claim
ZZ Mutually Defined",,,,,,,,
2320,CAS,Claim Level Adjustments,,,,,,,,,,,
2320,2320.CAS01,Claim Adjustment Group Code,,,"CO Contractual Obligations
CR Correction and Reversals
OA Other adjustments
PI Payor Initiated Reductions
PR Patient Responsibility",,,,,,,,
2320,2320.CAS02,Claim Adjustment Reason Code,,,,,,,,,,,
2320,2320.CAS03,Monetary Amount,,,,,,,,,,,
2320,2320.CAS04,Quantity,,,,,,,,,,,
2320,2320.CAS05,Claim Adjustment Reason Code,,,,,,,,,,,
2320,2320.CAS06,Monetary Amount,,,,,,,,,,,
2320,2320.CAS07,Quantity,,,,,,,,,,,
2320,2320.CAS08,Claim Adjustment Reason Code,,,,,,,,,,,
2320,2320.CAS09,Monetary Amount,,,,,,,,,,,
2320,2320.CAS10,Quantity,,,,,,,,,,,
2320,2320.CAS11,Claim Adjustment Reason Code,,,,,,,,,,,
2320,2320.CAS12,Monetary Amount,,,,,,,,,,,
2320,2320.CAS13,Quantity,,,,,,,,,,,
2320,2320.CAS14,Claim Adjustment Reason Code,,,,,,,,,,,
2320,2320.CAS15,Monetary Amount,,,,,,,,,,,
2320,2320.CAS16,Quantity,,,,,,,,,,,
2320,2320.CAS17,Claim Adjustment Reason Code,,,,,,,,,,,
2320,2320.CAS18,Monetary Amount,,,,,,,,,,,
2320,2320.CAS19,Quantity,,,,,,,,,,,
2320,AMT,Coordination of Benefits (COB) Payer Paid Amount,,S,,,,,,,,,
2320,2320.AMT01,Amount Qualifier Code,Code to qualify amount,R,D Payor Amount Paid,,,,,,,,
2320,2320.AMT02,Monetary Amount,Monetary amount,R,,,,,,,,,
2320,AMT,Remaining Patient Liability,,S,,,,,,,,,
2320,2320.AMT01,Amount Qualifier Code,Code to qualify amount,R,EAF Amount Owed,,,,,,,,
2320,2320.AMT02,Monetary Amount,,,,,,,,,,,
2320,AMT,Coordination of Benefits (COB) Total Non-covered Amount,,,,,,,,,,,
2320,2320.AMT01,Amount Qualifier Code,,,A8 Noncovered Charges - Actual,,,,,,,,
2320,2320.AMT02,Monetary Amount,,,,,,,,,,,
2320,OI,Other Insurance Coverage Information (Required),,R,,,,,,,,,
2320,2320.OI03,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,R,"N No
W Not Applicable
Y Yes",,,,,,,,
2320,2320.OI06,Release of Information Code,Code indicating whether the provider has on file a signed statement by the patient authorizing the release of medical data to other organizations,R,"I Informed Consent to Release Medical Information
for Conditions or Diagnoses Regulated by Federal
Statutes
Y Yes, Provider has a Signed Statement Permitting
Release of Medical Billing Data Related to a Claim",,,,,,,,
2320,MIA,Inpatient Adjudication Information,,,,,,,,,,,
2320,2320.MIA01,Quantity,,,,,,,,,,,
2320,2320.MIA03,Quantity,,,,,,,,,,,
2320,2320.MIA04,Monetary Amount,,,,,,,,,,,
2320,2320.MIA05,Reference Identification,,,,,,,,,,,
2320,2320.MIA06,Monetary Amount,,,,,,,,,,,
2320,2320.MIA07,Monetary Amount,,,,,,,,,,,
2320,2320.MIA08,Monetary Amount,,,,,,,,,,,
2320,2320.MIA09,Monetary Amount,,,,,,,,,,,
2320,2320.MIA10,Monetary Amount,,,,,,,,,,,
2320,2320.MIA11,Monetary Amount,,,,,,,,,,,
2320,2320.MIA12,Monetary Amount,,,,,,,,,,,
2320,2320.MIA13,Monetary Amount,,,,,,,,,,,
2320,2320.MIA14,Monetary Amount,,,,,,,,,,,
2320,2320.MIA15,Quantity,,,,,,,,,,,
2320,2320.MIA16,Monetary Amount,,,,,,,,,,,
2320,2320.MIA17,Monetary Amount,,,,,,,,,,,
2320,2320.MIA18,Monetary Amount,,,,,,,,,,,
2320,2320.MIA19,Monetary Amount,,,,,,,,,,,
2320,2320.MIA20,Reference Identification,,,,,,,,,,,
2320,2320.MIA21,Reference Identification,,,,,,,,,,,
2320,2320.MIA22,Reference Identification,,,,,,,,,,,
2320,2320.MIA23,Reference Identification,,,,,,,,,,,
2320,2320.MIA24,Monetary Amount,,,,,,,,,,,
2320,MOA,Outpatient Adjudication Information,,,,,,,,,,,
2320,2320.MOA01,Percentage as Decimal,,,,,,,,,,,
2320,2320.MOA02,Monetary Amount,,,,,,,,,,,
2320,2320.MOA03,Reference Identification,,,,,,,,,,,
2320,2320.MOA04,Reference Identification,,,,,,,,,,,
2320,2320.MOA05,Reference Identification,,,,,,,,,,,
2320,2320.MOA06,Reference Identification,,,,,,,,,,,
2320,2320.MOA07,Reference Identification,,,,,,,,,,,
2320,2320.MOA08,Monetary Amount,,,,,,,,,,,
2320,2320.MOA09,Monetary Amount,,,,,,,,,,,
LOOP 2330A - OTHER SUBSCRIBER NAME,,,,,,,,,,,,,
2330A,NM1,Other Subscriber Name (Required),,R,,,,,,,,,
2330A,2330A.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,IL Insured or Subscriber,,,,,,,,
2330A,2330A.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,"1 Person
2 Non-Person Entity",,,,,,,,
2330A,2330A.NM103,Name Last or Organization Name,Individual last name or organizational name,S,,,,,,,,,
2330A,2330A.NM104,Name First,Individual first name,S,,,,,,,,,
2330A,2330A.NM105,Name Middle,Individual middle name or initia,S,,,,,,,,,
2330A,2330A.NM107,Name Suffix,Suffix to individual name,S,,,,,,,,,
2330A,2330A.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),R,"II Standard Unique Health Identifier for each Individual
in the United States
MI Member Identification Number",,,,,,,,
2330A,2330A.NM109,Identification Code,Code designating the system/method of code structure used for Identification Code (67),R,,,,,,,,,
2330A,N3,Other Subscriber Address,,S,,,,,,,,,
2330A,2330A.N301,Address Information,Address information,R,,,,,,,,,
2330A,2330A.N302,Address Information,Address information,S,,,,,,,,,
2330A,N4,Other Subscriber City/State/ZIP Code,,R,,,,,,,,,
2330A,2330A.N401,City Name,Free-form text for city name,R,,,,,,,,,
2330A,2330A.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,,,,,,,
2330A,2330A.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,,,,,,,,
2330A,2330A.N404,Country Code,Code identifying the country,S,,,,,,,,,
2330A,2330A.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,,,,
2330A,REF,Other Subscriber Secondary Information,,,,,,,,,,,
2330A,2330A.REF01,Reference Identification Qualifier,,,SY Social Security Number,,,,,,,,
2330A,2330A.REF02,Reference Identification,,,,,,,,,,,
LOOP 2330B - OTHER PAYER NAME,,,,,,,,,,,,,
2330B,NM1,Other Payer Name (Required),,R,,,,,,,,,
2330B,2330B.NM101,Entity Identifier Code,,R,PR Payer,,,,,,,,
2330B,2330B.NM102,Entity Type Qualifier,,R,2 Non-Person Entity,,,,,,,,
2330B,2330B.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,,,,,,,
2330B,2330B.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),R,"PI Payor Identification
XV Centers for Medicare and Medicaid Services PlanID",,,,,,,,
2330B,2330B.NM109,Identification Code,Code identifying a party or other code,R,,,,,,,,,
2330B,N3,Other Payer Address,,S,,,,,,,,,
2330B,2330B.N301,Address Information,Address information,R,,,,,,,,,
2330B,2330B.N302,Address Information,Address information,S,,,,,,,,,
2330B,N4,Other Payer City/State/ZIP Code,,R,,,,,,,,,
2330B,2330B.N401,City Name,Free-form text for city name,R,,,,,,,,,
2330B,2330B.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,,,,,,,
2330B,2330B.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,,,,,,,,
2330B,2330B.N404,Country Code,Code identifying the country,S,,,,,,,,,
2330B,2330B.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,,,,
2330B,DTP,Claim Check or Remittance Date,,,,,,,,,,,
2330B,2330B.DTP01,Date/Time Qualifier,,,573 Date Claim Paid,,,,,,,,
2330B,2330B.DTP02,Date Time Period Format Qualifier,,,D8 Date Expressed in Format CCYYMMDD,,,,,,,,
2330B,2330B.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,,,,,
2330B,REF,Other Payer Secondary Identifier,,,,,,,,,,,
2330B,2330B.REF01,Reference Identification Qualifier,,,"2U Payer Identification Number
EI Employer’s Identification Number
FY Claim Office Number
NF National Association of Insurance Commissioners
(NAIC) Code",,,,,,,,
2330B,2330B.REF02,Reference Identification,,,,,,,,,,,
2330B,REF,Other Payer Prior Authorization Number,,S,,,,,,,,,
2330B,2330B.REF01,Reference Identification Qualifier,,R,G1 Prior Authorization Number,,,,,,,,
2330B,2330B.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,,
2330B,REF,Other Payer Referral Number,,,,,,,,,,,
2330B,2330B.REF01,Reference Identification Qualifier,,,9F Referral Number,,,,,,,,
2330B,2330B.REF02,Reference Identification,,,,,,,,,,,
2330B,REF,Other Payer Claim Adjustment Indicator,,,,,,,,,,,
2330B,2330B.REF01,Reference Identification Qualifier,,,T4 Signal Code,,,,,,,,
2330B,2330B.REF02,Reference Identification,,,,,,,,,,,
2330B,REF,Other Payer Claim Control Number,,S,,,,,,,,,
2330B,2330B.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,F8 Original Reference Number,,,,,,,,
2330B,2330B.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,,
"LOOP 2330C - OTHER PAYER ATTENDING
PROVIDER",,,,,,,,,,,,,
2330C,NM1,Other Payer Attending Provider,,S,,,,,,,,,
2330C,2330C.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,71 Attending Physician,,,,,,,,
2330C,2330C.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,1 Person,,,,,,,,
2330C,REF,Other Payer Attending Provider Secondary Identification (Required),,,,,,,,,,,
2330C,2330C.REF01,Reference Identification Qualifier,,,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number
LU Location Number",,,,,,,,
2330C,2330C.REF02,Reference Identification,,,,,,,,,,,
"LOOP 2330D - OTHER PAYER OPERATING
PHYSICIAN",,,,,,,,,,,,,
2330D,NM1,Other Payer Operating Physician,,,,,,,,,,,
2330D,2330D.NM101,Entity Identifier Code,,,72 Operating Physician,,,,,,,,
2330D,2330D.NM102,Entity Type Qualifier,,,1 Person,,,,,,,,
2330D,REF,Other Payer Operating Physician Secondary Identification (Required),,,,,,,,,,,
2330D,2330D.REF01,Reference Identification Qualifier,,,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number
LU Location Number",,,,,,,,
2330D,2330D.REF02,Reference Identification,,,,,,,,,,,
"LOOP 2330E - OTHER PAYER OTHER OPERATING
PHYSICIAN",,,,,,,,,,,,,
2330E,NM1,Other Payer Other Operating Physician,,,,,,,,,,,
2330E,2330E.NM101,Entity Identifier Code,,,ZZ Mutually Defined,,,,,,,,
2330E,2330E.NM102,Entity Type Qualifier,,,1 Person,,,,,,,,
2330E,REF,Other Payer Other Operating Physician Secondary Identification (Required),,,,,,,,,,,
2330E,2330E.REF01,Reference Identification Qualifier,,,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number
LU Location Number",,,,,,,,
2330E,2330E.REF02,Reference Identification,,,,,,,,,,,
"LOOP 2330F - OTHER PAYER SERVICE FACILITY
LOCATION",,,,,,,,,,,,,
2330F,NM1,Other Payer Service Facility Location,,,,,,,,,,,
2330F,2330F.NM101,Entity Identifier Code,,,77 Service Location,,,,,,,,
2330F,2330F.NM102,Entity Type Qualifier,,,2 Non-Person Entity,,,,,,,,
2330F,REF,Other Payer Service Facility Location Identification (Required),,,,,,,,,,,
2330F,2330F.REF01,Reference Identification Qualifier,,,"0B State License Number
G2 Provider Commercial Number
LU Location Number",,,,,,,,
2330F,2330F.REF02,Reference Identification,,,,,,,,,,,
"LOOP 2330G - OTHER PAYER RENDERING
PROVIDER NAME",,,,,,,,,,,,,
2330G,NM1,Other Payer Rendering Provider Name,,,,,,,,,,,
2330G,2330G.NM101,Entity Identifier Code,,,82 Rendering Provider,,,,,,,,
2330G,2330G.NM102,Entity Type Qualifier,,,1 Person,,,,,,,,
2330G,REF,Other Payer Rendering Provider Secondary Identification (Required),,,,,,,,,,,
2330G,2330G.REF01,Reference Identification Qualifier,,,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number
LU Location Number",,,,,,,,
2330G,2330G.REF02,Reference Identification,,,,,,,,,,,
"LOOP 2330H - OTHER PAYER REFERRING
PROVIDER",,,,,,,,,,,,,
2330H,NM1,Other Payer Referring Provider,,,,,,,,,,,
2330H,2330H.NM101,Entity Identifier Code,,,DN Referring Provider,,,,,,,,
2330H,2330H.NM102,Entity Type Qualifier,,,1 Person,,,,,,,,
2330H,REF,Other Payer Referring Provider Secondary Identification (Required),,,,,,,,,,,
2330H,2330H.REF01,Reference Identification Qualifier,,,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number",,,,,,,,
2330H,2330H.REF02,Reference Identification,,,,,,,,,,,
LOOP 2330I - OTHER PAYER BILLING PROVIDER,,,,,,,,,,,,,
2330I,NM1,Other Payer Billing Provider,,,,,,,,,,,
2330I,2330I.NM101,Entity Identifier Code,,,85 Billing Provider,,,,,,,,
2330I,2330I.NM102,Entity Type Qualifier,,,2 Non-Person Entity,,,,,,,,
2330I,REF,Other Payer Billing Provider Secondary Identification (Required),,,,,,,,,,,
2330I,2330I.REF01,Reference Identification Qualifier,,,"G2 Provider Commercial Number
LU Location Number",,,,,,,,
2330I,2330I.REF02,Reference Identification,,,,,,,,,,,
LOOP 2400 - SERVICE LINE NUMBER,,,,,,,,,,,,,
2400,LX,Service Line Number (Required),,R,,,,,,,,,
2400,2400.LX01,Assigned Number,Number assigned for differentiation within a transaction set,R,,LINE_SEQ,LINE_SEQ,382,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/claimLineId
2400,SV2,Institutional Service Line (Required),,R,,,,,,,,,
2400,2400.SV201,Product/Service ID,Identifying number for a product or service,R,,SUB_REV_CODE,SUB_REV_CODE,385,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/revenueCode
2400,2400.SV202.01,Product/Service ID Qualifier,Code identifying the type/source of the descriptive number used in Product/Service ID (234),R,"ER Jurisdiction Specific Procedure and Supply Codes
HC Health Care Financing Administration Common
Procedural Coding System (HCPCS) Codes
HP Health Insurance Prospective Payment System
(HIPPS) Skilled Nursing Facility Rate Code
IV Home Infusion EDI Coalition (HIEC) Product/Service
Code
WK Advanced Billing Concepts (ABC) Codes","Hardcode as ""HC""",,,,,,,
2400,2400.SV202.02,Product/Service ID,Identifying number for a product or service,R,,SUB_HCPCS,SUB_HCPCS,386,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/serviceCode
2400,2400.SV202.03,Procedure Modifier,"This identifies special circumstances related to the performance of the service, as defined by trading partners",S,,SUB_MOD1,SUB_MOD_01,387,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/modifierList/string
2400,2400.SV202.04,Procedure Modifier,"This identifies special circumstances related to the performance of the service, as defined by trading partners",S,,SUB_MOD2,SUB_MOD_02,388,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/modifierList/string
2400,2400.SV202.05,Procedure Modifier,"This identifies special circumstances related to the performance of the service, as defined by trading partners",S,,SUB_MOD3,SUB_MOD_03,389,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/modifierList/string
2400,2400.SV202.06,Procedure Modifier,"This identifies special circumstances related to the performance of the service, as defined by trading partners",S,,SUB_MOD4,SUB_MOD_04,390,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/modifierList/string
2400,2400.SV202.07,Description,A free-form description to clarify the related data elements and their content,S,,SUB_HCPCS_DESC,SUB_HCPCS_DESC,829,Line,,,,
2400,2400.SV203,Monetary Amount,Monetary amount,R,,SUB_AMOUNT,SUB_AMOUNT,397,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/requestedAmount
2400,2400.SV204,Unit or Basis for Measurement Code,"Code specifying the units in which a value is being expressed, or manner in which a measurement has been taken",R,"DA Days
UN Unit",Hardcode as 'UN',UNITS_TYPE,,Line,,,New field- Iplus to confirm on the field information,
2400,2400.SV205,Quantity,Numeric value of quantity,R,,SUB_UNITS,SUB_UNITS,396,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/units
2400,2400.SV207,Monetary Amount,Monetary amount,S,,,,,,,,,
2400,PWK,Line Supplemental Information,,,,,,,,,,,
2400,2400.PWK01,Report Type Code,,,"03 Report Justifying Treatment Beyond Utilization
Guidelines
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
A3 Allergies/Sensitivities Document
A4 Autopsy Report
AM Ambulance Certification
AS Admission Summary
B2 Prescription
B3 Physician Order
B4 Referral Form
BR Benchmark Testing Results
BS Baseline
BT Blanket Test Results
CB Chiropractic Justification
CK Consent Form(s)
CT Certification
D2 Drug Profile Document
DA Dental Models
DB Durable Medical Equipment Prescription
DG Diagnostic Report
DJ Discharge Monitoring Report
DS Discharge Summary
EB Explanation of Benefits (Coordination of Benefits or
Medicare Secondary Payor)
HC Health Certificate
HR Health Clinic Records
I5 Immunization Record
IR State School Immunization Records
LA Laboratory Results
M1 Medical Record Attachment
MT Models
NN Nursing Notes
OB Operative Note
OC Oxygen Content Averaging Report
OD Orders and Treatments Document
OE Objective Physical Examination (including vital
signs) Document
OX Oxygen Therapy Certification
OZ Support Data for Claim
P4 Pathology Report
P5 Patient Medical History Document
PE Parenteral or Enteral Certification
PN Physical Therapy Notes
PO Prosthetics or Orthotic Certification
PQ Paramedical Results
PY Physician’s Report
PZ Physical Therapy Certification
RB Radiology Films
RR Radiology Reports
RT Report of Tests and Analysis Report
RX Renewable Oxygen Content Averaging Report
SG Symptoms Document
V5 Death Notification
XP Photographs",,,,,,,,
2400,2400.PWK02,Report Transmission Code,,,"AA Available on Request at Provider Site
BM By Mail
EL Electronically Only
EM E-Mail
FT File Transfer
FX By Fax",,,,,,,,
2400,2400.PWK05,Identification Code Qualifier,,,AC Attachment Control Number,,,,,,,,
2400,2400.PWK06,Identification Code,,,,,,,,,,,
2400,DTP,Date - Service Date,,S,,,,,,,,,
2400,2400.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,472 Service,"Hardcode as ""472""",,,,,,,
2400,2400.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,"D8 Date Expressed in Format CCYYMMDD
RD8 Range of Dates Expressed in Format CCYYMMDDCCYYMMDD","Hardcode ""RD8""  if LINE_END_DOS is present. Else D8.",,,,"RD8 is ServiceStartDate is not the same as ServiceEndDate. D8 if they are the same, just export the ServiceStartDate",,,
2400,2400.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,DOS_FROM + DOS_TO,LINE_BEGIN_DOS + LINE_END_DOS,383 + 384,Line,,,,"ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/serviceStartDate ""-"" ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/serviceEndDate"
2400,REF,Line Item Control Number,,S,,,,,,,,,
2400,2400.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,6R Provider Control Number,,,,,,,,
2400,2400.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,,
2400,REF,REF Repriced Line Item Reference Number,,,,,,,,,,,
2400,2400.REF01,Reference Identification Qualifier,,,9B Repriced Line Item Reference Number,,,,,,,,
2400,2400.REF02,Reference Identification,,,,,,,,,,,
2400,REF,Adjusted Repriced Line Item Reference Number,,,,,,,,,,,
2400,2400.REF01,Reference Identification Qualifier,,,9D Adjusted Repriced Line Item Reference Number,,,,,,,,
2400,2400.REF02,Reference Identification,,,,,,,,,,,
2400,AMT,Service Tax Amount,,,,,,,,,,,
2400,2400.AMT01,Amount Qualifier Code,,,GT Goods and Services Tax,,,,,,,,
2400,2400.AMT02,Monetary Amount,,,,,,,,,,,
2400,AMT,Facility Tax Amount,,,,,,,,,,,
2400,2400.AMT01,Amount Qualifier Code,,,N8 Miscellaneous Taxes,,,,,,,,
2400,2400.AMT02,Monetary Amount,,,,,,,,,,,
2400,NTE,Third Party Organization Notes,,,,,,,,,,,
2400,2400.NTE01,Note Reference Code,,,TPO Third Party Organization Notes,,,,,,,,
2400,2400.NTE02,Description,,,,,,,,,,,
2400,HCP,Line Pricing/Repricing Information,,,,,,,,,,,
2400,2400.HCP01,Pricing Methodology,,,"00 Zero Pricing (Not Covered Under Contract)
01 Priced as Billed at 100%
02 Priced at the Standard Fee Schedule
03 Priced at a Contractual Percentage
04 Bundled Pricing
05 Peer Review Pricing
06 Per Diem Pricing
07 Flat Rate Pricing
08 Combination Pricing
09 Maternity Pricing
10 Other Pricing
11 Lower of Cost
12 Ratio of Cost
13 Cost Reimbursed
14 Adjustment Pricing",,,,,,,,
2400,2400.HCP02,Monetary Amount,,,,,,,,,,,
2400,2400.HCP03,Monetary Amount,,,,,,,,,,,
2400,2400.HCP04,Reference Identification,,,,,,,,,,,
2400,2400.HCP05,Rate,,,,,,,,,,,
2400,2400.HCP06,Reference Identification,,,,,,,,,,,
2400,2400.HCP07,Monetary Amount,,,,,,,,,,,
2400,2400.HCP08,Product/Service ID,,,,,,,,,,,
2400,2400.HCP09,Product/Service ID Qualifier,,,"ER Jurisdiction Specific Procedure and Supply Codes
HC Health Care Financing Administration Common
Procedural Coding System (HCPCS) Codes
HP Health Insurance Prospective Payment System
(HIPPS) Skilled Nursing Facility Rate Code
IV Home Infusion EDI Coalition (HIEC) Product/Service
Code
WK Advanced Billing Concepts (ABC) Codes",,,,,,,,
2400,2400.HCP10,Product/Service ID,,,,,,,,,,,
2400,2400.HCP11,Unit or Basis for Measurement Code,,,"DA Days
UN Unit",,,,,,,,
2400,2400.HCP12,Quantity,,,,,,,,,,,
2400,2400.HCP13,Reject Reason Code,,,"T1 Cannot Identify Provider as TPO (Third Party
Organization) Participant
T2 Cannot Identify Payer as TPO (Third Party
Organization) Participant
T3 Cannot Identify Insured as TPO (Third Party
Organization) Participant
T4 Payer Name or Identifier Missing
T5 Certification Information Missing
T6 Claim does not contain enough information for repricing",,,,,,,,
2400,2400.HCP14,Policy Compliance Code,,,"1 Procedure Followed (Compliance)
2 Not Followed - Call Not Made (Non-Compliance Call
Not Made)
3 Not Medically Necessary (Non-Compliance Non-
Medically Necessary)
4 Not Followed Other (Non-Compliance Other)
5 Emergency Admit to Non-Network Hospital",,,,,,,,
2400,2400.HCP15,Exception Code,,,"1 Non-Network Professional Provider in Network
Hospital
2 Emergency Care
3 Services or Specialist not in Network
4 Out-of-Service Area
5 State Mandates
6 Other",,,,,,,,
LOOP 2410 - DRUG IDENTIFICATION,,,,,,,,,,,,,
2410,LIN,Drug Identification,,S,,,,,,,,,
2410,2410.LIN02,Product/Service ID Qualifier,Code identifying the type/source of the descriptive number used in Product/Service ID (234),R,N4 National Drug Code in 5-4-2 Format,"Hardcode as ""N4""",,,,,,,
2410,2410.LIN03,Product/Service ID,Identifying number for a product or service,R,,SUB_NDC,SUB_NDC,399,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/ndcCodes/NDCCode/ndcCode
2410,CTP,Drug Quantity (Required),,R,,,,,,,,,
2410,2410.CTP04,Quantity,Numeric value of quantity,R,,SUB_NDC_UNITS,SUB_NDC_UNITS,400,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/ndcCodes/NDCCode/quantity
2410,2410.CTP05,COMPOSITE UNIT OF MEASURE,To identify a composite unit of measure,R,,,,,,,,,
2410,2410.CTP05.01,Unit or Basis for Measurement Code,"Code specifying the units in which a value is being expressed, or manner in which a measurement has been taken",R,"F2 International Unit
GR Gram
ME Milligram
ML Milliliter
UN Unit",SUB_NDC_UNITS_TYPE,SUB_NDC_UNITS_TYPE,401,Line,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/ndcCodes/NDCCode/measurementType
2410,REF,Prescription or Compound Drug Association Number,,,,,,,,,,,
2410,2410.REF01,Reference Identification Qualifier,,,"VY Link Sequence Number
XZ Pharmacy Prescription Number",,,,,,,,
2410,2410.REF02,Reference Identification,,,,,,,,,,,
LOOP 2420A - OPERATING PHYSICIAN NAME,,,,,,,,,,,,,
2420A,NM1,Operating Physician Name,,,,,,,,,,,
2420A,2420A.NM101,Entity Identifier Code,,,72 Operating Physician,,,,,,,,
2420A,2420A.NM102,Entity Type Qualifier,,,1 Person,,,,,,,,
2420A,2420A.NM103,Name Last or Organization Name,,,,,,,,,,,
2420A,2420A.NM104,Name First,,,,,,,,,,,
2420A,2420A.NM105,Name Middle,,,,,,,,,,,
2420A,2420A.NM107,Name Suffix,,,,,,,,,,,
2420A,2420A.NM108,Identification Code Qualifier,,,"XX Centers for Medicare and Medicaid Services
National Provider Identifier",,,,,,,,
2420A,2420A.NM109,Identification Code,,,,,,,,,,,
2420A,REF,Operating Physician Secondary Identification,,,,,,,,,,,
2420A,2420A.REF01,Reference Identification Qualifier,,,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number
LU Location Number",,,,,,,,
2420A,2420A.REF02,Reference Identification,,,,,,,,,,,
2420A,2420A.REF04.01,Reference Identification Qualifier,,,2U Payer Identification Number,,,,,,,,
2420A,2420A.REF04.02,Reference Identification,,,,,,,,,,,
"LOOP 2420B - OTHER OPERATING PHYSICIAN
NAME",,,,,,,,,,,,,
2420B,NM1,Other Operating Physician Name,,,,,,,,,,,
2420B,2420B.NM101,Entity Identifier Code,,,ZZ Mutually Defined,,,,,,,,
2420B,2420B.NM102,Entity Type Qualifier,,,1 Person,,,,,,,,
2420B,2420B.NM103,Name Last or Organization Name,,,,,,,,,,,
2420B,2420B.NM104,Name First,,,,,,,,,,,
2420B,2420B.NM105,Name Middle,,,,,,,,,,,
2420B,2420B.NM107,Name Suffix,,,,,,,,,,,
2420B,2420B.NM108,Identification Code Qualifier,,,"XX Centers for Medicare and Medicaid Services
National Provider Identifier",,,,,,,,
2420B,2420B.NM109,Identification Code,,,,,,,,,,,
2420B,REF,Other Operating Physician Secondary Identification,,,,,,,,,,,
2420B,2420B.REF01,Reference Identification Qualifier,,,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number
LU Location Number",,,,,,,,
2420B,2420B.REF02,Reference Identification,,,,,,,,,,,
2420B,2420B.REF04.01,Reference Identification Qualifier,,,2U Payer Identification Number,,,,,,,,
2420B,2420B.REF04.02,Reference Identification,,,,,,,,,,,
LOOP 2420C - RENDERING PROVIDER NAME,,,,,,,,,,,,,
2420C,NM1,Rendering Provider Name,,S,,,,,,,,,
2420C,2420C.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,82 Rendering Provider,,,,,,,,
2420C,2420C.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,1 Person,,,,,,,,
2420C,2420C.NM103,Name Last or Organization Name,Individual last name or organizational nam,R,,,,,,,,,
2420C,2420C.NM104,Name First,Individual first name,S,,,,,,,,,
2420C,2420C.NM105,Name Middle,Individual middle name or initial,S,,,,,,,,,
2420C,2420C.NM107,Name Suffix,Suffix to individual name,S,,,,,,,,,
2420C,2420C.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),S,XX Centers for Medicare and Medicaid Services National Provider Identifier,,,,,,,,
2420C,2420C.NM109,Identification Code,Code identifying a party or other code,,,,,,,,,,
2420C,REF,Rendering Provider Secondary Identification,,,,,,,,,,,
2420C,2420C.REF01,Reference Identification Qualifier,,,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number
LU Location Number",,,,,,,,
2420C,2420C.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,,
2420C,2420C.REF04.01,Reference Identification Qualifier,,,2U Payer Identification Number,,,,,,,,
2420C,2420C.REF04.02,Reference Identification,,,,,,,,,,,
LOOP 2420D - REFERRING PROVIDER NAME,,,,,,,,,,,,,
2420D,NM1,Referring Provider Name,,,,,,,,,,,
2420D,2420D.NM101,Entity Identifier Code,,,DN Referring Provider,,,,,,,,
2420D,2420D.NM102,Entity Type Qualifier,,,1 Person,,,,,,,,
2420D,2420D.NM103,Name Last or Organization Name,,,,,,,,,,,
2420D,2420D.NM104,Name First,,,,,,,,,,,
2420D,2420D.NM105,Name Middle,,,,,,,,,,,
2420D,2420D.NM107,Name Suffix,,,,,,,,,,,
2420D,2420D.NM108,Identification Code Qualifier,,,"XX Centers for Medicare and Medicaid Services
National Provider Identifier",,,,,,,,
2420D,2420D.NM109,Identification Code,,,,,,,,,,,
2420D,REF,Referring Provider Secondary Identification,,,,,,,,,,,
2420D,2420D.REF01,Reference Identification Qualifier,,,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number",,,,,,,,
2420D,2420D.REF02,Reference Identification,,,,,,,,,,,
2420D,2420D.REF04.01,Reference Identification Qualifier,,,2U Payer Identification Number,,,,,,,,
2420D,2420D.REF04.02,Reference Identification,,,,,,,,,,,
LOOP 2430 - LINE ADJUDICATION INFORMATION,,,,,,,,,,,,,
2430,SVD,Line Adjudication Information,,,,,,,,,,,
2430,2430.SVD01,Identification Code,Code identifying a party or other code,R,,,,,,,,,
2430,2430.SVD02,Monetary Amount,Monetary amount,R,,,,,,,,,
2430,2430.SVD03.01,Product/Service ID Qualifier,Code identifying the type/source of the descriptive number used in Product/Service ID (234),R,"ER Jurisdiction Specific Procedure and Supply Codes
HC Health Care Financing Administration Common
Procedural Coding System (HCPCS) Codes
HP Health Insurance Prospective Payment System
(HIPPS) Skilled Nursing Facility Rate Code
IV Home Infusion EDI Coalition (HIEC) Product/Service
Code
WK Advanced Billing Concepts (ABC) Codes",,,,,,,,
2430,2430.SVD03.02,Product/Service ID,Identifying number for a product or service,R,,,,,,,,,
2430,2430.SVD03.03,Procedure Modifier,"This identifies special circumstances related to the performance of the service, as defined by trading partners",S,,,,,,,,,
2430,2430.SVD03.04,Procedure Modifier,"This identifies special circumstances related to the performance of the service, as defined by trading partners",S,,,,,,,,,
2430,2430.SVD03.05,Procedure Modifier,"This identifies special circumstances related to the performance of the service, as defined by trading partners",S,,,,,,,,,
2430,2430.SVD03.06,Procedure Modifier,"This identifies special circumstances related to the performance of the service, as defined by trading partners",S,,,,,,,,,
2430,2430.SVD03.07,Description,A free-form description to clarify the related data elements and their content,S,,,,,,,,,
2430,2430.SVD04,Product/Service ID,,,,,,,,,,,
2430,2430.SVD05,Quantity,Numeric value of quantity,R,,,,,,,,,
2430,2430.SVD06,Assigned Number,Number assigned for differentiation within a transaction set,S,,,,,,,,,
2430,CAS,Line Adjustment,,S,,,,,,,,,
2430,2430.CAS01,Claim Adjustment Group Code,,,"CO Contractual Obligations
CR Correction and Reversals
OA Other adjustments
PI Payor Initiated Reductions
PR Patient Responsibility",,,,,,,,
2430,2430.CAS02,Claim Adjustment Reason Code,,,,,,,,,,,
2430,2430.CAS03,Monetary Amount,,,,,,,,,,,
2430,2430.CAS04,Quantity,,,,,,,,,,,
2430,2430.CAS05,Claim Adjustment Reason Code,,,,,,,,,,,
2430,2430.CAS06,Monetary Amount,,,,,,,,,,,
2430,2430.CAS07,Quantity,,,,,,,,,,,
2430,2430.CAS08,Claim Adjustment Reason Code,,,,,,,,,,,
2430,2430.CAS09,Monetary Amount,,,,,,,,,,,
2430,2430.CAS10,Quantity,,,,,,,,,,,
2430,2430.CAS11,Claim Adjustment Reason Code,,,,,,,,,,,
2430,2430.CAS12,Monetary Amount,,,,,,,,,,,
2430,2430.CAS13,Quantity,,,,,,,,,,,
2430,2430.CAS14,Claim Adjustment Reason Code,,,,,,,,,,,
2430,2430.CAS15,Monetary Amount,,,,,,,,,,,
2430,2430.CAS16,Quantity,,,,,,,,,,,
2430,2430.CAS17,Claim Adjustment Reason Code,,,,,,,,,,,
2430,2430.CAS18,Monetary Amount,,,,,,,,,,,
2430,2430.CAS19,Quantity,,,,,,,,,,,
2430,DTP,Line Check or Remittance Date (Required),,R,,,,,,,,,
2430,2430.DTP01,Date/Time Qualifier,,R,573 Date Claim Paid,,,,,,,,
2430,2430.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,,,,,,,,
2430,2430.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,,,,,
2430,AMT,Remaining Patient Liability,,,,,,,,,,,
2430,2430.AMT01,Amount Qualifier Code,,,EAF Amount Owed,,,,,,,,
2430,2430.AMT02,Monetary Amount,,,,,,,,,,,
SE Transaction Set Trailer (Required),,,,,,,,,,,,,
,SE01,Number of Included Segments,,,,Count Of ST,,,,,,,
,SE02,Transaction Set Control Number,,,,,,,,,,,
GE Functional Group Trailer (Required),,,,,,,,,,,,,
,GE01,Number of Transaction Sets Included,,,,Count Of GS,,,,,,,
,GE02,Group Control Number,,,,GS06 Value,,,,,,,
IEA Interchange Control Trailer (Required),,,,,,,,,,,,,
,IEA01,Number of Included Functional Groups,,,,Count Of ISA,,,,,,,
,IEA02,Interchange Control Number,,,,ISA13 Value,,,,,,,
```

## Repricer OB-IB/OB Repricer/V26.1.0.0/EdifecsProduct_MappingSpec_OB Repricer_837_DFF_to_EDI Conversion_V2.1.xlsx — Professional Layout

```csv
Incoming File Layout,,,,,,,
,,,,,,,
File Component,Field Name,Field Description,Level,Type,Length,Repricer,Position
,,,,,,,
Header,Header_Prefix,Field valued with ‘Header’,File,,,Y,1
Header,FILE_TYPE,"Valid values:  T or H
This field contains information relating to whether this file is a Daily File (T) or a History file (H).",File,,,Y,2
Header,FILE_SEQ,"This field contains the sequence number of the file.  This should be a value starting at 1 for the first daily and first history files received.  Subsequent files should be incremented by 1 so that each daily file has a unique FILE_SEQ number and then each history file has a unique FILE_SEQ number.  This sequence number will be used during file processing to confirm that the same file sequence number has not previously been loaded into the database.  It is important to note that the file sequence in the file name only increments for multiple files sent in the same day and will always reset to 1 for each new day.

Note: There is a separate file sequence for initial history files loaded prior to going live.  The sequence for ongoing history files should be reset to start at 1 after completion of the initial history load.",File,,,Y,3
Header,PRODUCED_DATE,This field contains the date the file was generated by the client. Date should be in CCYYMMDD format in all places,File,,,Y,4
Header,RECORD_COUNT,This field contains the total number of DETAIL records in the file.,File,,,Y,5
Header,FILE_INDICATOR,"Valid values:  'R' (retro) or 'P' (pre-pay.)
The file indicator identifies whether this file is a Retro (R) or a Pre-Pay (P) file. Use Pre-Pay (P) for prospective TBA claim extracts (claims prior to payment).  Use Retro (R) for retrospective paid claim TBA files.  Use 'R' for all History Extract files.",File,,,Y,6
Header,FILLER,"For Fixed Width files only. The header record is right-padded with spaces to equal the full length of the claim data records, taking into account the characters included in the client defined field.",File,,,Y,7
Header,TYPE_OF_FILE,This value in the field represent whether the claim is a Institutional or Professional ( INST or PROF),File,,,Y,8
,,,,,,,
Detail,TAG_VALUE_PREFIX,The value in this field represents the Tag value of the claim which falls on the prefix on each claim split. Record 0001 – Claim 1,Claim,,,Y,1
Detail,TYPE_OF_FILE,This value in the field represent whether the claim is a Institutional or Professional ( INST or PROF),Claim,,,Y,2
Detail,SUB_ID,"The value in this field represents the member's identification number. In many cases, each member (subscriber and dependents) are issued an ID that is unique in the client’s system. If this ID is not unique, the data in this field combined with the DEPENDENT_NUM will be used to represent a unique member.",Claim,,,Y,3
Detail,DEPENDENT_NUM,"The value in this field represents the member’s dependent status as it relates to the insured. The value in this field, combined with the SUB_ID provides a unique member identifier.  This field is required for PPM only if needed to create a unique member ID.",Claim,,,N,4
Detail,PATIENT_DOB,"The value in this field represents the patient’s date of birth.  Required for CV. (Subscriber:  2010BA, DMG02)  (Patient:  2010CA, DMG02)",Claim,,,Y,5
Detail,PATIENT_GENDER_ID,"The value in this field represents the patient’s gender.  Recommended values are M for Male, F for Female and U for Unknown.  Please provide mapping if outside of the above values. Required for CV.
(Subscriber:  2010BA, DMG03)  (Patient:  2010CA, DMG03)",Claim,,,Y,6
Detail,PATIENT_SSN,The value in this field represents the patient’s social security number.,Claim,,,N,7
Detail,SUB_MEDICARE_ID,"This field represents the subscriber's Medicare ID and should include the trailing alpha character.  The patient's Medicare number would be provided in the PATIENT_ID field.  If the subscriber is the patient, the value in both fields would be the same.",Claim,,,N,8
Detail,MEDICAID_ID,This field represents the patient's unique Medicaid ID as assigned by the State in which they are covered.,Claim,,,N,9
Detail,PATIENT_ID,"The value in this field represents an alternate patient identification number, not otherwise specified in the layout.  Required for CV.",Claim,,,N,10
Detail,PATIENT_CONTROL_NUM,"The value in this field represents the Patient Control Number, also referred to as the Patient Account Number. (2300, CLM01, 1028)",Claim,,,Y,11
Detail,PATIENT_LAST_NAME,"The value in this field represents the patient’s last name.  (2010CA, NM103, 1035)",Claim,,,Y,12
Detail,PATIENT_FIRST_NAME,"The value in this field represents the patient’s first name.  (2010CA, NM104, 1036)",Claim,,,Y,13
Detail,PATIENT_MIDDLE_NAME,"This field represents the patient's middle name as defined by the payer. This is required by CMS when needed to identify the individual. (2010CA, NM105, 1037)",Claim,,,Y,14
Detail,PATIENT_NAME_SUFFIX,"This field represents the suffix associated with the patient's name.  For example, Jr., Sr., III, etc. This is required by CMS when needed to identify the individual.  (2010CA, NM107, 1039)",Claim,,,Y,15
Detail,RELATIONSHIP_TO_SUB,"The value in this field defines the patient's relationship to the subscriber.  Expected Values are:
01  -  Spouse
18  -  Self
19  -  Child
20  -  Employee
21  -  Unknown
39  -  Organ Donor
40  -  Cadaver Donor
53  -  Life Partner
G8  -  Other Relationship
Required for CV.
(Subscriber: 2000B, SBR02)  (Dependent:  2000C, PAT01)",Claim,,,Y,16
Detail,PATIENT_DEATH_DATE,"Patient's date of death when the patient is known to be deceased.  (2000B, PAT06)  2000C, PAT06)",Claim,,,N,17
Detail,PATIENT_WEIGHT,"This data element is the patient's weight at the time of service.  CMS requires this data when claims involve Medicare DMERC CMN or DME MAC 10.03 Enteral or Parenteral Nutrition.  Weight measurement is in pounds. (2000B, PAT08) (2000C, PAT08)",Claim,,,N,18
Detail,CLAIM_ID,"The value in this field represents the client’s claim identification number. This should be a claim ID that is unique in the client’s system. If this ID is not unique, please advise what other data is required to make it unique. Required for CV.",Claim,,,Y,19
Detail,PREGNANCY_INDICATOR_YN,"This field represents the patient's pregnancy status at the time of service.  Expected values are:  'Y', 'N' or may be left blank to indicate the patient is not pregnant or not required by law. (2000B, PAT09)(2000C, PAT09)",Claim,,,N,20
Detail,MED_REC_NO,"The value in this field represents the Medical Record Number from the provider.  (2300, REF02, REF*EA)",Claim,,,Y,21
Detail,DIAGNOSIS_CODE_01_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.  (2300, HI01-1) Required for CV.",Claim,,,N,22
Detail,DIAGNOSIS_CODE_01,"The value in this field represents the header level diagnosis listed in the number one position on the CMS-1500 billed by the provider. To provide accurate adjudication recommendations and CV audit results, all diagnosis codes billed by the provider should be transmitted on the file with appropriate pointers. Required for CV.  (2300, HI01-2)

Note:  It is expected that all lines of a claim will include the same header level diagnosis codes.",Claim,,,Y,23
Detail,DIAGNOSIS_CODE_02_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes. This field is required if the corresponding diagnosis is populated. (2300, HI02-1)",Claim,,,N,24
Detail,DIAGNOSIS_CODE_02,"The value in this field represents the header level diagnosis listed in the number two position on the CMS-1500 billed by the provider. To provide accurate adjudication recommendations and CV audit results, all diagnosis codes billed by the provider should be transmitted on the file with appropriate pointers.  (2300,HI02-2)",Claim,,,Y,25
Detail,DIAGNOSIS_CODE_03_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes. This field is required if the corresponding diagnosis is populated. (2300, HI03-1)",Claim,,,N,26
Detail,DIAGNOSIS_CODE_03,"The value in this field represents the header level diagnosis listed in the number three position on the CMS-1500 billed by the provider. To provide accurate adjudication recommendations and CV audit results, all diagnosis codes billed by the provider should be transmitted on the file with appropriate pointers.  (2300, HI03-2)",Claim,,,Y,27
Detail,DIAGNOSIS_CODE_04_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.  This field is required if the corresponding diagnosis is populated.  (2300, HI04-1)",Claim,,,N,28
Detail,DIAGNOSIS_CODE_04,"The value in this field represents the header level diagnosis listed in the number four position on the CMS-1500 billed by the provider. To provide accurate adjudication recommendations and CV audit results, all diagnosis codes billed by the provider should be transmitted on the file with appropriate pointers.  (2300, HI04-2)",Claim,,,Y,29
Detail,DIAGNOSIS_CODE_05_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.  This field is required if the corresponding diagnosis is populated.  (2300, HI05-1)",Claim,,,N,30
Detail,DIAGNOSIS_CODE_05,"The value in this field represents the header level diagnosis listed in the number five position on the CMS-1500 billed by the provider. To provide accurate adjudication recommendations and CV audit results, all diagnosis codes billed by the provider should be transmitted on the file with appropriate pointers.  (2300, HI05-2)",Claim,,,Y,31
Detail,DIAGNOSIS_CODE_06_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes. This field is required if the corresponding diagnosis is populated.  (2300, HI06-1, HI*BF or HI*ABF)",Claim,,,N,32
Detail,DIAGNOSIS_CODE_06,"The value in this field represents the header level diagnosis listed in the number six position on the CMS-1500 billed by the provider. To provide accurate adjudication recommendations and CV audit results, all diagnosis codes billed by the provider should be transmitted on the file with appropriate pointers.  (2300, HI06-2)",Claim,,,Y,33
Detail,DIAGNOSIS_CODE_07_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '0' for ICD-9 diagnosis codes. This field is required if the corresponding diagnosis is populated.  (2300, HI07-1)",Claim,,,N,34
Detail,DIAGNOSIS_CODE_07,"The value in this field represents the header level diagnosis listed in the number seven position on the CMS-1500 billed by the provider. To provide accurate adjudication recommendations and CV audit results, all diagnosis codes billed by the provider should be transmitted on the file with appropriate pointers.  (2300, HI07-2)",Claim,,,Y,35
Detail,DIAGNOSIS_CODE_08_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes. This field is required if the corresponding diagnosis is populated.  (2300, HI08-1)",Claim,,,N,36
Detail,DIAGNOSIS_CODE_08,"The value in this field represents the header level diagnosis listed in the number eight position on the CMS-1500 billed by the provider. To provide accurate adjudication recommendations and CV audit results, all diagnosis codes billed by the provider should be transmitted on the file with appropriate pointers.  (2300, HI08-2)",Claim,,,Y,37
Detail,DIAGNOSIS_CODE_09_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes. This field is required if the corresponding diagnosis is populated.  (2300, HI09-1)",Claim,,,N,38
Detail,DIAGNOSIS_CODE_09,"The value in this field represents the header level diagnosis listed in the number nine position on the CMS-1500 billed by the provider. To provide accurate adjudication recommendations and CV audit results, all diagnosis codes billed by the provider should be transmitted on the file with appropriate pointers.  (2300, HI09-2)",Claim,,,Y,39
Detail,DIAGNOSIS_CODE_10_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes. This field is required if the corresponding diagnosis is populated.  (2300, HI10-1)",Claim,,,N,40
Detail,DIAGNOSIS_CODE_10,"The value in this field represents the header level diagnosis listed in the number ten position on the CMS-1500 billed by the provider. To provide accurate adjudication recommendations and CV audit results, all diagnosis codes billed by the provider should be transmitted on the file with appropriate pointers. (2300, HI10-2)",Claim,,,Y,41
Detail,DIAGNOSIS_CODE_11_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes. This field is required if the corresponding diagnosis is populated.  (2300, HI11-1)",Claim,,,N,42
Detail,DIAGNOSIS_CODE_11,"The value in this field represents the header level diagnosis listed in the number eleven position on the CMS-1500 billed by the provider. To provide accurate adjudication recommendations and CV audit results, all diagnosis codes billed by the provider should be transmitted on the file with appropriate pointers.  (2300, HI11-2)",Claim,,,Y,43
Detail,DIAGNOSIS_CODE_12_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes. This field is required if the corresponding diagnosis is populated.  (2300, HI12-1)",Claim,,,N,44
Detail,DIAGNOSIS_CODE_12,"The value in this field represents the header level diagnosis listed in the number twelve position on the CMS-1500 billed by the provider. To provide accurate adjudication recommendations and CV audit results, all diagnosis codes billed by the provider should be transmitted on the file with appropriate pointers.  (2300, HI12-2)",Claim,,,Y,45
Detail,DIAGNOSIS_CODE_13_QUAL,The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes. This field is required if the corresponding diagnosis is populated.,Claim,,,N,46
Detail,DIAGNOSIS_CODE_13,"The value in this field represents the additional diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  Note: This field is not currently in the 837 transaction, but is planned for the next version.  This diagnosis will be used in applying payment policies in the future.",Claim,,,Y,47
Detail,DIAGNOSIS_CODE_14_QUAL,The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.  This field is required if the corresponding diagnosis is populated.,Claim,,,N,48
Detail,DIAGNOSIS_CODE_14,"The value in this field represents the additional diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values. Note: This field is not currently in the 837 transaction, but is planned for the next version.  This diagnosis will be used in applying payment policies in the future.",Claim,,,N,49
Detail,DIAGNOSIS_CODE_15_QUAL,The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes. This field is required if the corresponding diagnosis is populated.,Claim,,,N,50
Detail,DIAGNOSIS_CODE_15,"The value in this field represents the additional diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values. Note: This field is not currently in the 837 transaction, but is planned for the next version.   This diagnosis will be used in applying payment policies in the future.",Claim,,,N,51
Detail,DIAGNOSIS_CODE_16_QUAL,The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes. This field is required if the corresponding diagnosis is populated.,Claim,,,N,52
Detail,DIAGNOSIS_CODE_16,"The value in this field represents the additional diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values. Note: This field is not currently in the 837 transaction, but is planned for the next version.  This diagnosis will be used in applying payment policies in the future.",Claim,,,N,53
Detail,DIAGNOSIS_CODE_17_QUAL,The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes. This field is required if the corresponding diagnosis is populated.,Claim,,,N,54
Detail,DIAGNOSIS_CODE_17,"The value in this field represents the additional diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  Note: This field is not currently in the 837 transaction, but is planned for the next version.  This diagnosis will be used in applying payment policies in the future.",Claim,,,N,55
Detail,DIAGNOSIS_CODE_18_QUAL,The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes. This field is required if the corresponding diagnosis is populated.,Claim,,,N,56
Detail,DIAGNOSIS_CODE_18,"The value in this field represents the additional diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values. Note: This field is not currently in the 837 transaction, but is planned for the next version.  This diagnosis will be used in applying payment policies in the future.",Claim,,,N,57
Detail,DIAGNOSIS_CODE_19_QUAL,The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes. This field is required if the corresponding diagnosis is populated.,Claim,,,N,58
Detail,DIAGNOSIS_CODE_19,"The value in this field represents the additional diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values. Note: This field is not currently in the 837 transaction, but is planned for the next version.  This diagnosis will be used in applying payment policies in the future.",Claim,,,N,59
Detail,DIAGNOSIS_CODE_20_QUAL,The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes. This field is required if the corresponding diagnosis is populated.,Claim,,,N,60
Detail,DIAGNOSIS_CODE_20,"The value in this field represents the additional diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  Note: This field is not currently in the 837 transaction, but is planned for the next version.  This diagnosis will be used in applying payment policies in the future.",Claim,,,N,61
Detail,DIAGNOSIS_CODE_21_QUAL,The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes. This field is required if the corresponding diagnosis is populated.,Claim,,,N,62
Detail,DIAGNOSIS_CODE_21,"The value in this field represents the additional diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values. Note: This field is not currently in the 837 transaction, but is planned for the next version.  This diagnosis will be used in applying payment policies in the future.",Claim,,,N,63
Detail,DIAGNOSIS_CODE_22_QUAL,The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes. This field is required if the corresponding diagnosis is populated.,Claim,,,N,64
Detail,DIAGNOSIS_CODE_22,"The value in this field represents the additional diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  Note: This field is not currently in the 837 transaction, but is planned for the next version.  This diagnosis will be used in applying payment policies in the future.",Claim,,,N,65
Detail,DIAGNOSIS_CODE_23_QUAL,The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes. This field is required if the corresponding diagnosis is populated.,Claim,,,N,66
Detail,DIAGNOSIS_CODE_23,"The value in this field represents the additional diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  Note: This field is not currently in the 837 transaction, but is planned for the next version.  This diagnosis will be used in applying payment policies in the future.  (2300, HI*BF or HI*ABF Segment Repeat)",Claim,,,N,67
Detail,DIAGNOSIS_CODE_24_QUAL,The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes. This field is required if the corresponding diagnosis is populated.,Claim,,,N,68
Detail,DIAGNOSIS_CODE_24,"The value in this field represents the additional diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values. Note: This field is not currently in the 837 transaction, but is planned for the next version.  If  this value is present, it will be used in applying payment policies.",Claim,,,N,69
Detail,INSURANCE_LOB,"The value in this field represents the member’s product type or line of business code. The client’s values are mapped to a table that identifies line of business. Examples are: Medicare, Medicaid, Commercial, Duals, BlueCard, etc. Required for CV.",Line,,,N,70
Detail,INSURANCE_LOB_SUBTYPE,"This field further splits the LOB into the type of plan. Examples are: HMO, PPO, POS, EPO, etc.",Line,,,N,71
Detail,BLUE_CARD_INDICATOR,"When INSURANCE_LOB is BlueCard, this field represents BlueCard information provided by the client. Valid values are:
0  -  Non-BlueCard
1  -  ITS Home
2  -  ITS Host",Claim,,,N,72
Detail,ITS_HOME_STATE,The value in this field represents the state of the plan that owns the member's coverage.,Claim,,,N,73
Detail,ITS_HOST_STATE,The value in this field represents the state of the provider's local Blue Cross Blue Shield plan where services were rendered.,Claim,,,N,74
Detail,ITS_SERIAL_NUM,The value in this field represents the Standard Claims Collection Facility (SCCF) number from the ITS system.  This is the unique identifier in the BlueSquared BlueCard claim processing system.,Claim,,,N,75
Detail,MEDICARE_PROVIDER_ID,"Number that uniquely identifies a healthcare provider and is used on billing forms submitted to Medicare (UPIN, OSCAR number, NSC number). It is used for pricing through FHCP.",Line,,,N,76
Detail,MEDICAID_PROVIDER_ID,A number that uniquely identifies a healthcare provider and is used on billing forms submitted to Medicaid.,Line,,,N,77
Detail,RENDERING_PROVIDER_ID,"The value in this field represents a single physician identification number that is unique to the physician in the client’s system for the rendering provider. If a physician has more than one identifying number, there could be an impact to adjudication recommendations which should be discussed.  (2310B, NM109 or 2420A, NM109)  Previously PROVIDER_ID and the provider identifier used for processing on professional claims. Required for CV.",Line,,,N,78
Detail,RENDERING_TAXGROUP_ID,"The value in this field represents the rendering provider's tax identification number.   (2310B, REF02)  BILLING_TAXGROUP_ID is used for processing for all providers.  If Rendering is the same as Billing, it should be duplicated here. Required for CV.",Line,,,N,79
Detail,RENDERING_NPI,"The value in this field represents the CMS National Provider Identifier (NPI) for the provider rendering this service.  Default to spaces if value is not available.  (2310B, NM109)  Previously NPI and the identifier of record for professional providers. Required for CV.",Line,,,Y,80
Detail,RENDERING_STATE_LICENSE,"The value in this field represents the Sate License number for the rendering provider.  A non-zero value is required.  (2310B, REF02)",Line,,,N,81
Detail,RENDERING_SPECIALTY_CODE,"The value in this field is a code that represents the rendering physician’s specialty or subspecialty.  As an example: ORTH or 0015 for orthopedics, PEDCAR or 0030 for pediatric cardiology, etc. In order to make appropriate adjudication recommendations on the claim, the rendering provider’s specialty must be identified. Blank values in this field can be mapped to a “miscellaneous” specialty which will limit payment policies that will be applied, if this method is chosen by the client.  Unrecognizable (unmapped) values will result in the “failing” of the claim during processing and will be reported on the daily processing report.  Client preferences will be discussed during the implementation process.  Please provide a list of client values with descriptions. (2310B, PRV03)  Previously SUBSPEC_ID and used for processing on professional claims. Required for CV.",Line,,,N,82
Detail,RENDERING_TAXONOMY_CODE,Industry standard taxonomy code of the rendering provider used by CMS and sourced by the National Uniform Claim Committee. A list of taxonomy codes is available via http://www.wpc-edi.com/reference/codelists/healthcare/health-care-provider-taxonomy-code-set/.  Required for CV.,Line,,,Y,83
Detail,RENDERING_ENTITY_TYPE,"Expected Values are:  'P' = Person or 'E' = Other Entity or Facility. (2310B,  NM101)",Line,,,N,84
Detail,RENDERING_LAST_NAME,"The value in this field represents the rendering provider’s last name if rendering entity type = 'P' or Organizational Name if rendering entity type = 'E'.  Required for CV. (2310B, NM103)",Line,,,Y,85
Detail,RENDERING_FIRST_NAME,"The value in this field represents the rendering provider’s first name.  Required for CV. (2310B, NM104)",Line,,,Y,86
Detail,RENDERING_MIDDLE_NAME,"The value in this field represents the rendering provider’s middle name.  (2310B, NM105)",Line,,,Y,87
Detail,RENDERING_NAME_SUFFIX,"The value in this field represents the rendering provider's suffix, as required.  (2310B, NM107)",Line,,,Y,88
Detail,RENDERING_ADDRESS_01,The value in this field represents the first line of the rendering provider's address.,Line,,,N,89
Detail,RENDERING_ADDRESS_02,The value in this field represents the second line of the rendering provider's address.,Line,,,N,90
Detail,RENDERING_CITY,The value in this field represents the city of the rendering provider's address.,Line,,,N,91
Detail,RENDERING_STATE,The value in this field represents the state of the rendering provider's address.   Required for CV.,Line,,,N,92
Detail,RENDERING_ZIP,The value in this field represents the postal ZIP code for the rendering provider.  The value is the basic five digit ZIP code.  This value must be submitted for Geographic Policy application. Required for CV.,Line,,,N,93
Detail,RENDERING_ZIP_PLUS_FOUR,The value in this field represents the four digit add-on code for the expanded ZIP code.  The value is four digits.,Line,,,N,94
Detail,RENDERING_COUNTRY,The value in this field represents the country of the rendering provider's address.,Line,,,N,95
Detail,RENDERING_COUNTRY_SUBDIVISION,The value in this field represents the country subdivision code for the rendering provider's address.  This is only used for international addresses.,Line,,,N,96
Detail,RENDERING_PHONE_COUNTRY_CODE,This field represents the unique country code for international dialing for the rendering provider's primary phone number.,Line,,,N,97
Detail,RENDERING_PHONE,The value in this field represents the rendering provider's telephone number.,Line,,,N,98
Detail,RENDERING_PHONE_EXT,The value in this field represents the rendering provider's primary telephone extension.,Line,,,N,99
Detail,RENDERING_ALT_PHONE_COUNTRY_CODE,This field represents the unique country code for international dialing for the rendering provider's alternate phone number.,Line,,,N,100
Detail,RENDERING_ALT_PHONE,The value in this field represents the rendering provider's alternate telephone number.,Line,,,N,101
Detail,RENDERING_ALT_PHONE_EXT,The value in this field represents the rendering provider's alternate telephone extension.,Line,,,N,102
Detail,RENDERING_FAX_COUNTRY_CODE,This field represents the unique country code for international dialing for the rendering provider's fax number.,Line,,,N,103
Detail,RENDERING_FAX,The value in this field represents the rendering provider's fax number.,Line,,,N,104
Detail,BILLING_PROVIDER_ID,"The value in this field represents the billing provider, which is separate from where the services were rendered.  This number is the identification number unique to the billing provider or facility in the client’s system.  This is the same as the Billing Provider Commercial Number in the 837 transaction.  (2010AA, REF02)",Line,,,N,105
Detail,BILLING_TAXGROUP_ID,"The value in this field represents the billing provider’s tax identification number. This number should represent the individual or group practice.  (2010AA, REF02, REF*EI)    Previously TAXGROUP_ID and used for processing on professional claims.",Line,,,Y,106
Detail,BILLING_NPI,"The value in this field represents the CMS National Provider Identifier (NPI) for the billing provider providing this service.  Default to spaces if value is not available. (2010AA, NM109)",Line,,,Y,107
Detail,BILLING_STATE_LICENSE,"The value in this field represents the Sate License number for the billing provider associated with this service.  A non-zero value is required.  This is the same as the Billing Provider Secondary Identifier in the 837 transaction.   (2010AA, REF02)",Line,,,Y,108
Detail,BILLING_SPECIALTY_CODE,"The value in this field represents the specialty of the billing provider, as defined in the client's claim system.",Line,,,N,109
Detail,BILLING_TAXONOMY_CODE,Industry standard taxonomy code of the billing provider used by CMS and sourced by the National Uniform Claim Committee. A list of taxonomy codes is available via http://www.wpc-edi.com/reference/codelists/healthcare/health-care-provider-taxonomy-code-set/.,Line,,,N,110
Detail,BILLING_CURRENCY_CODE,"This field represents the ISO currency code for the billing provider and should correlate with the currency of the funds in which the provider is to be paid.  (2000A, CUR02)",Line,,,N,111
Detail,BILLING_ENTITY_TYPE,Expected Values are:  'P' = Person or 'E' = Other Entity or Facility,Line,,,N,112
Detail,BILLING_LAST_NAME,"The value in this field represents the billing provider’s last name if rendering entity type = 'P' or Organizational Name if rendering entity type = 'E'.  (2010AA, NM103)",Line,,,Y,113
Detail,BILLING_FIRST_NAME,"The value in this field represents the billing provider’s first name.  (2310B, NM104)",Line,,,Y,114
Detail,BILLING_MIDDLE_NAME,"The value in this field represents the billing provider’s middle name.  (2310B, NM105)",Line,,,Y,115
Detail,BILLING_NAME_SUFFIX,"The value in this field represents the billing provider's suffix, as required.  (2310B, NM107)",Line,,,Y,116
Detail,BILLING_ADDRESS_01,"The value in this field represents the first line of the billing entity's address. The Billing Provider Address must be a street address. Post Office Box or Lock Box addresses are to be sent in the Pay-To Address Loop (Loop ID-2010AB), if necessary.  (2010AA, N301)",Line,,,Y,117
Detail,BILLING_ADDRESS_02,"The value in this field represents the second line of the billing entity's address.  (2010AA, N302)",Line,,,Y,118
Detail,BILLING_CITY,"The value in this field represents the city of the billing entity's address.  (2010AA, N401)",Line,,,Y,119
Detail,BILLING_STATE,"The value in this field represents the state of the billing entity's address.  (2010AA, N402)",Line,,,Y,120
Detail,BILLING_ZIP,"The value in this field represents the postal ZIP code for the billing entity.  The value is the basic five digit ZIP code.   (2010AA, N403)",Line,,,Y,121
Detail,BILLING_ZIP_PLUS_FOUR,"The value in this field represents the four digit add-on code for the expanded ZIP code.  The value is four digits.   (2010AA, N403)",Line,,,Y,122
Detail,BILLING_COUNTRY,"The value in this field represents the country of the billing entity's  address.  (2010AA, N404)",Line,,,Y,123
Detail,BILLING_COUNTRY_SUBDIVISION,"The value in this field represents the country subdivision code for the billing entity's address.  This is only used for international addresses.(2010AA, N407)",Line,,,N,124
Detail,BILLING_CONTACT_NAME,"Billing Provider Contact Name (23010AA, PER02)",Line,,,N,125
Detail,BILLING_PHONE_COUNTRY_CODE,"This field represents the unique country code for international dialing for the billing entity's primary phone number.  (2010AA, PER segment)",Line,,,Y,126
Detail,BILLING_PHONE + AREA_CODE,"The value in this field represents the billing entity's telephone number.  (2010AA, PER segment) along with the area code.",Line,,,Y,127
Detail,BILLING_PHONE_EXT,"The value in this field represents the billing entity's primary telephone extension. (2010AA, PER segment)",Line,,,Y,128
Detail,BILLING_ALT_PHONE_COUNTRY_CODE,"This field represents the unique country code for international dialing for the billing entity's alternate phone number. (2010AA, PER segment)",Line,,,N,129
Detail,BILLING_ALT_PHONE,"The value in this field represents the billing entity's alternate telephone number. (2010AA, PER segment)",Line,,,N,130
Detail,BILLING_ALT_PHONE_EXT,"The value in this field represents the billing entity's alternate telephone extension.  (2010AA, PER segment)",Line,,,N,131
Detail,BILLING_FAX_COUNTRY_CODE,"This field represents the unique country code for international dialing for the billing entity's fax number. (2010AA, PER segment)",Line,,,Y,132
Detail,BILLING_FAX,"The value in this field represents the billing entity's fax number. (2010AA, PER segment)",Line,,,Y,133
Detail,CLIENT_CONTRACT_ID,"The value in this field represents a contract identification number for the provider, if needed for adjudication purposes.",Line,,,N,134
Detail,CONTRACT_TYPE_CODE,"The is the contract type as defined in the 837 for Post Adjudicated Claim reporting.  Expected values for this field are:
01  -  Diagnosis Related Group (DRG)
02  -  Per Diem
03  -  Variable Per Diem
04  -  Flat
05  -  Capitated
06  -  Percent
09  -  Other
80  -  APC
81  -  APG
82  -  FFS
(2300, CN101)",Line,,,N,135
Detail,CONTRACT_AMOUNT,"Contract Amount for the claim being submitted. (2300, CN102)",Line,,,N,136
Detail,CONTRACT_PCT,"Contract Percentage for the claim being submitted. (2300, CN103)",Line,,,N,137
Detail,CONTRACT_CODE,"Contract Code for the claim being submitted. (2300, CN104)",Line,,,N,138
Detail,CONTRACT_TERMS_DISC_PCT,"This field represents the terms discount percentage for the claim being submitted. (2300, CN105)",Line,,,N,139
Detail,CONTRACT_VERSION_ID,"This field represents the contract version identifier for the claim being submitted. (2300, CN106)",Line,,,N,140
Detail,LINE_SEQ,"The value in this field represents the sequential number associated to the line number on the claim. As an example: the number 0002 should be sent in this field for the second line on the claim. Required for CV.  (2400, LX01)",Line,,,Y,141
Detail,LINE_BEGIN_DOS,"The value in this field represents the beginning date for services rendered. Required for CV. (2400, DTP03)",Line,,,Y,142
Detail,LINE_END_DOS,"The value in this field represents the date in the Date of Service To field on the CMS-1500.  In order to make appropriate adjudication recommendations, date ranges need to be transmitted. The lack of date ranges could cause inappropriate recommendations. As an example: a provider bills a date range for two days and a procedure with two units of service corresponding to the date range. If the Date of Service From is the only date passed, one unit could be denied as exceeding the number of units allowed on a single date of service. Required for CV. (2400, DTP03)",Line,,,Y,143
Detail,PLACE_OF_SERVICE,"The value in this field represents the industry standard place of service code where the service was rendered. If the client uses non-industry standard place of service codes, please provide a list of the values and their descriptions for mapping purposes.  (2300, CLM05-1 or  2400, SV1-05)",Line,,,Y,144
Detail,TOS,"The value in this field represents the industry standard Type of Service code for the service that was rendered. Required for CV.  (2400, SV106)",Line,,,N,145
Detail,DIAGNOSIS_POINTER_01,"The value in this field represents the diagnosis pointer that correlates the line service to one of the twelve header level diagnosis codes.  Required for CV. (2400, SV107-1)",Line,,,Y,146
Detail,DIAGNOSIS_POINTER_02,"The value in this field represents the diagnosis pointer that correlates the line service to one of the twelve header level diagnosis codes.  (2400, SV107-2)",Line,,,Y,147
Detail,DIAGNOSIS_POINTER_03,"The value in this field represents the diagnosis pointer that correlates the line service to one of the twelve header level diagnosis codes.  (2400, SV107-3)",Line,,,Y,148
Detail,DIAGNOSIS_POINTER_04,"The value in this field represents the diagnosis pointer that correlates the line service to one of the twelve header level diagnosis codes.  (2400, SV107-4)",Line,,,Y,149
Detail,DIAGNOSIS_POINTER_05,The value in this field represents the diagnosis pointer that correlates the line service to one of the twelve header level diagnosis codes.   Note: For future use only.  Slated for upcoming version of X12 837.,Line,,,N,150
Detail,DIAGNOSIS_POINTER_06,The value in this field represents the diagnosis pointer that correlates the line service to one of the twelve header level diagnosis codes.   Note: For future use only.  Slated for upcoming version of X12 837.,Line,,,N,151
Detail,DIAGNOSIS_POINTER_07,The value in this field represents the diagnosis pointer that correlates the line service to one of the twelve header level diagnosis codes.   Note: For future use only.  Slated for upcoming version of X12 837.,Line,,,N,152
Detail,DIAGNOSIS_POINTER_08,The value in this field represents the diagnosis pointer that correlates the line service to one of the twelve header level diagnosis codes.   Note: For future use only.  Slated for upcoming version of X12 837.,Line,,,N,153
Detail,DIAGNOSIS_POINTER_09,The value in this field represents the diagnosis pointer that correlates the line service to one of the twelve header level diagnosis codes.   Note: For future use only.  Slated for upcoming version of X12 837.,Line,,,N,154
Detail,DIAGNOSIS_POINTER_10,The value in this field represents the diagnosis pointer that correlates the line service to one of the twelve header level diagnosis codes.   Note: For future use only.  Slated for upcoming version of X12 837.,Line,,,N,155
Detail,DIAGNOSIS_POINTER_11,The value in this field represents the diagnosis pointer that correlates the line service to one of the twelve header level diagnosis codes.   Note: For future use only.  Slated for upcoming version of X12 837.,Line,,,N,156
Detail,DIAGNOSIS_POINTER_12,The value in this field represents the diagnosis pointer that correlates the line service to one of the twelve header level diagnosis codes.   Note: For future use only.  Slated for upcoming version of X12 837.,Line,,,N,157
Detail,SUB_HCPCS,"The value in this field represents the Level1 (CPT) or Level2 (HCPCS) code billed by the provider for this service. (2400, SV101-2)",Line,,,Y,158
Detail,SUB_MOD_01,"The value in this field represents the first procedure code modifier billed by the provider for this service. (2400, SV101-3)",Line,,,Y,159
Detail,SUB_MOD_02,"The value in this field represents the second procedure code modifier billed by the provider for this service. (2400, SV101-4)",Line,,,Y,160
Detail,SUB_MOD_03,"The value in this field represents the third procedure code modifier billed by the provider for this service. (2400, SV101-5)",Line,,,Y,161
Detail,SUB_MOD_04,"The value in this field represents the fourth procedure code modifier billed by the provider for this service. (2400, SV101-6)",Line,,,Y,162
Detail,SUB_MOD_05,The value in this field represents the fifth procedure code modifier billed by the provider for this service line.  Note: For future use only.  Slated for upcoming version of X12 837.,Line,,,N,163
Detail,SUB_MOD_06,The value in this field represents the sixth procedure code modifier billed by the provider for this service line.  Note: For future use only.  Slated for upcoming version of X12 837.,Line,,,N,164
Detail,SUB_MOD_07,The value in this field represents the seventh procedure code modifier billed by the provider for this service line.  Note: For future use only.  Slated for upcoming version of X12 837.,Line,,,N,165
Detail,SUB_MOD_08,The value in this field represents the eighth procedure code modifier billed by the provider for this service line.  Note: For future use only.  Slated for upcoming version of X12 837.,Line,,,N,166
Detail,UNITS_TYPE,"The value in this field represents the basis for measurement for the units billed.  unique Values are:  'MJ' for minutes, and 'UN' for units and blank. (2400, SV1)",Line,,,Y,167
Detail,SUB_UNITS,"The value in this field represents the number of units billed by the provider for this service. (2400, SV104)",Line,,,Y,168
Detail,SUB_AMOUNT,"The value in this field represents the charge amount billed by the provider for this service. Required for CV. (2400, SV102)",Line,,,Y,169
Detail,SUB_NONCOVERED_AMOUNT,"The value in this field represents the line level Non Covered Charges amount billed by the provider for this service.   (2400, SV207)",Line,,,N,170
Detail,SUB_NDC,"The value in this field represents the National Drug Code (NDC) submitted on the claim line.  (2410, LIN03)",Line,,,Y,171
Detail,SUB_NDC_UNITS,"This field represents the numeric value of quantity for the drug being billed.  (2410, CTP04)",Line,,,Y,172
Detail,SUB_NDC_UNITS_TYPE,"Code specifying the units in which a value is being expressed, or
manner in which a measurement has been taken.  Expected values are:
IU  -  International Unit
GR  -  Gram
ME  -  Milligram
ML  -  Milliliter
UN  -  Unit
(2410, CTP05)",Line,,,Y,173
Detail,ALLOWED_HCPCS,The value in this field represents the Level1 (CPT) or Level2 (HCPCS) code allowed by the client for claim system adjudication. Required for CV.,Line,,,N,174
Detail,ALLOWED_MOD_01,The value in this field represents the first procedure code modifier allowed by the client for claim system adjudication.,Line,,,N,175
Detail,ALLOWED_MOD_02,The value in this field represents the second procedure code modifier allowed by the client for claim system adjudication.,Line,,,N,176
Detail,ALLOWED_MOD_03,The value in this field represents the third procedure code modifier allowed by the client for claim system adjudication.,Line,,,N,177
Detail,ALLOWED_MOD_04,The value in this field represents the fourth procedure code modifier allowed by the client for claim system adjudication.,Line,,,N,178
Detail,ALLOWED_MOD_05,"The value in this field represents the fifth procedure code modifier allowed by the client for claim system adjudication. Note: This field is not currently in the 837 transaction, but is planned for the next version.  If you currently store this value in your claim system, please send.",Line,,,N,179
Detail,ALLOWED_MOD_06,"The value in this field represents the sixth procedure code modifier allowed by the client for claim system adjudication. Note: This field is not currently in the 837 transaction, but is planned for the next version.  If you currently store this value in your claim system, please send.",Line,,,N,180
Detail,ALLOWED_MOD_07,"The value in this field represents the seventh procedure code modifier allowed by the client for claim system adjudication. Note: This field is not currently in the 837 transaction, but is planned for the next version.  If you currently store this value in your claim system, please send.",Line,,,N,181
Detail,ALLOWED_MOD_08,"The value in this field represents the eighth procedure code modifier allowed by the client for claim system adjudication. Note: This field is not currently in the 837 transaction, but is planned for the next version.  If you currently store this value in your claim system, please send.",Line,,,N,182
Detail,ALLOWED_UNITS,The value in this field represents the number of units  allowed by the client for claim system adjudication.,Line,,,N,183
Detail,ALLOWED_AMOUNT,"The value in this field represents the allowed amount (before applying co-pay, coinsurance, deductible, COB, and other reductions) for this service. Required for CV.",Line,,,N,184
Detail,COMPOUND_DRUG_YN,Compound drug indicator.  This field should be set to 'Y' if the prescribed drug is a compound drug.,Line,,,N,185
Detail,ALLOWED_NDC,The value in this field represents the National Drug Code (NDC) allowed after initial adjudication on the claim line. Required when SUB_NDC is submitted.,Line,,,N,186
Detail,ALLOWED_NDC_UNITS,This field represents the numeric value of quantity for the drug allowed after initial adjudication in the client's claim system.  Required when SUB_NDC is submitted.,Line,,,N,187
Detail,ALLOWED_NDC_UNITS_TYPE,"This field represents the units type allowed in the client's claim system after initial adjudication.  Required when SUB_NDC is submitted. Expected values are:
IU  -  International Unit
GR  -  Gram
ME  -  Milligram
ML  -  Milliliter
UN  -  Unit",Line,,,N,188
Detail,COPAY_AMOUNT,The value in this field represents the member's co-pay amount for this service.,Line,,,N,189
Detail,COINSURANCE_AMOUNT,The value in this field represents the member's coinsurance amount for this service.,Line,,,N,190
Detail,DEDUCTIBLE_AMOUNT,The value in this field represents the member's deductible amount for this service.,Line,,,N,191
Detail,COB,The value in this field represents the member's COB amount for this service.,Line,,,N,192
Detail,COB_AMOUNT,The amount paid by the member's other insurance third parties on the claim line item level or the total amount saved on the claim line item because of payment made by the patient's other insurance carrier.,Line,,,N,193
Detail,COB_COINSURANCE_AMOUNT,The value in this field represents the calculated amount paid by the insured based on a percentage of total cost.,Line,,,N,194
Detail,COB_DEDUCTIBLE_AMOUNT,The value in this field represents the dollar amount the subscriber is liable for before other insurance pays for this service line item.,Line,,,N,195
Detail,COB_PAID_AMOUNT,The value in this field represents the other insurance payment amount applied to the service line item.,Line,,,N,196
Detail,COB_ALLOWED_AMOUNT,The value in this field represents the dollar allowance for a procedure or service paid by other insurance for a service line item.,Line,,,N,197
Detail,OTHER_REDUCTION_AMOUNT,"The value in this field represents any other adjustment amounts not reflected above.  Examples of values that may be used in this field are provider withhold amounts or capitation adjustments.  If no further reductions are taken, field should default to zero.",Line,,,N,198
Detail,PAID_AMOUNT,"The value in this field represents the paid amount (after applying co-pay, coinsurance, deductible, COB, and other reductions) for this service. Required for CV.",Line,,,N,199
Detail,PAID_DATE,"The value in this field represents the date of final adjudication or payment on preliminary analysis files or on history files.  The field can be blank for daily files since they have not been finalized, however, it should be populated from the client's system for history.  When blank, the file run date is populated for internal use.",Line,,,N,200
Detail,PAID_UNITS,The value in this field represents the number of units of service paid for each detail line.  Required for CV.,Line,,,N,201
Detail,LINE_CAPITATION_INDICATOR,"Indicates if the claim line was paid under a capitation agreement. Valid values are:
0  -  Non-Capitated Provider
1  -  Capitated Provider",Line,,,N,202
Detail,FEE_SERVICE_AMOUNT,"This field represents the fee schedule amount for the line level service, based on the provider's contract.  The appropriate value should be submitted if defined.  If no contractual agreement exists, this field should be left blank.",Line,,,N,203
Detail,PATIENT_LIABILITY_AMOUNT,This field stores the amount the patient owes on the line level service.,Line,,,N,204
Detail,DISALLOWED_AMOUNT,"Amount that is disallowed and will not be considered in the payment by the client, non billable to the member for the service line item.",Line,,,N,205
Detail,LINE_REIMBURSEMENT_TYPE,This field represents the pricing methodology used to reimburse the service line.,Line,,,N,206
Detail,ASSIGNMENT_OF_BENEFITS,"This field represents a one digit indicator to recognize if the benefits were assigned (Y or N).   (2300, CLM08)",Claim,,,Y,207
Detail,CLAIM_BILLED_AMOUNT,"The value in this field represents the claim header level billed amount billed by the provider for the claim. (2300, CLM02)",Claim,,,Y,208
Detail,CLAIM_NONCOVERED_AMOUNT,The value in this field represents the claim header level non covered amount billed by the provider for the claim.,Claim,,,N,209
Detail,CLAIM_ALLOWED_AMOUNT,"The value in this field represents the claim header level amount that was allowed.  (2320, AMT02)",Claim,,,N,210
Detail,CLAIM_PAID_AMOUNT,The value in this field represents the claim header level amount paid by the client for the claim.,Claim,,,N,211
Detail,CLAIM_COINSURANCE_AMOUNT,The value in this field represents the total coinsurance dollar amount on a claim for which the subscriber/member is responsible  -  usually based on a fixed percentage specified in the health plan. Usually applies after reaching a deductible.,Claim,,,N,212
Detail,CLAIM_COPAY_AMOUNT,The value in this field represents the total copay dollar amount that a subscriber/member pays the provider at the time of service.  Usually a fixed flat charge per visit based on subscriber health insurance plan.,Claim,,,N,213
Detail,CLAIM_DEDUCTIBLE_AMOUNT,The value in this field represents the total deductible dollar amount paid by the subscriber/member on a claim in order to satisfy the annual health plan deductible.,Claim,,,N,214
Detail,CLAIM_DISALLOWED_AMOUNT,"The value in this field represents the total amount that is disallowed and will NOT be considered in the payment by the client, non billable to the subscriber/member.",Claim,,,N,215
Detail,CLAIM_PATIENT_LIABILITY_AMOUNT,The value in this field represents the total patient liability amount (Coinsurance + Copay + Deductible) for a claim.,Claim,,,N,216
Detail,CLAIM_COB_AMOUNT,The value in this field represents the dollar allowance for a procedure or service paid for by the primary insurer.,Claim,,,N,217
Detail,CLAIM_COB_ALLOWED_AMOUNT,The value in this field represents the dollar allowance for a procedure or service paid by other insurance.,Claim,,,N,218
Detail,CLAIM_COB_COINSURANCE_AMOUNT,The value in this field represents the amount paid by the insured based on a percentage of total cost.,Claim,,,N,219
Detail,CLAIM_COB_PAID_AMOUNT,The value in this field represents the other insurance payment applied to the claim.,Claim,,,N,220
Detail,CLAIM_COB_DEDUCT_AMOUNT,The value in this field represents the dollar amount the subscriber is liable for before other insurance is paid.,Claim,,,N,221
Detail,CLAIM_PAID_DATE,"The value in this field represents the claim header level date of final adjudication or payment on daily incoming files or on history files.  If this value is the same as the line level value in PAID_DATE, please insert that date here.",Claim,,,N,222
Detail,CLAIM_CHECK_PAID_DATE,Date of the remittance number (voucher/check number).,Claim,,,N,223
Detail,PAID_TO_CODE,"Who the claim was paid out to. Valid values are: P = Provider, S = Subscriber",Claim,,,N,224
Detail,PAYMENT_STATUS,"The value in this field indicates the Claim header level payment status of the service. Valid values are: Paid, Denied, Pending, Reversed, Adjusted
Required for CV.",Claim,,,N,225
Detail,CLAIM_CAPITATION_INDICATOR,"Indicates if the claim was paid under a capitation agreement. Valid values are:
0  -  Non-Capitated Provider
1  -  Capitated Provider",Claim,,,N,226
Detail,CLAIM_FEE_SCHEDULE_CODE,Client note to indicate the type of pricing (fee schedule) used for the claim.,Claim,,,N,227
Detail,PATIENT_PLAN_CODE,This field represents the member's benefit plan code on the client's system at the time of service.,Claim,,,N,228
Detail,WHOLE_CLAIM_PRICING_LINE_YN,The value in this field indicates whether the claim lines were bundled to pay based on whole claim pricing.,Claim,,,N,229
Detail,OTHER_INSURANCE_INDICATOR,"Other Insurance Indicator that determines if other insurance is being used for payment on a claim. Valid values are:
0  -  Other insurance did not pay on claim
1  -  Other insurance paid on claim",Claim,,,N,230
Detail,COORDINATED_BENEFITS_YN,The value in this field indicates if a third party payment has been made on the claim related to Coordination of Benefits (COB). A 'Y' value indicates a third party payment has been made.,Claim,,,N,231
Detail,BYPASS_CODE,"This field supplies the client with greater control over the processing of specific claims. Should the client decide that they do not want certain claim lines to have logic applied to the service , the client can insert a value into this field to indicate which logic categories should be bypassed in the system.  If bypass codes are not required the field should be defaulted to 0.",Line,,,N,232
Detail,PAYER_BYPASS_CODE,The Payer Bypass allows for greater flexibility in payment policy application.  The use of this field must be discussed with the Implementation Services Director to ensure appropriateness and correct implementation.,Line,,,N,233
Detail,PAR_FLAG,"The value in this field represents the status of the Provider of Service in relation to the Health Plan. Expected values are ‘Y’ for participating or contracted or ‘N’ for Not participating or contracted. (If participating status is not available, default with ‘Y’.)   Required for CV.",Line,,,N,234
Detail,EDIT_0_ALLOWED_YN,"As a default, $0 allowed lines are not considered for editing purposes.  This flag can be used to override this filter and consider a line with a $0 allowed amount for editing in TBA and use as historical reference for future editing.

Null  -  Lines with a zero allowed amount reflecting a denial (default)
N  -  Zero charge and allowed lines that should not be considered for editing (default)
Y  -  Zero charge and allowed lines that should be considered for editing (override)",Line,,,N,235
Detail,DATE_RECEIVED_CLIENT,The value in this field represents the date the claim was received by the client.  This field is required for Timely Filing edits to be applied.  Required for CV.,Claim,,,N,236
Detail,CLAIM_ID_ORIG,"In situations where adjustments result in a new claim number on a client’s claim system, the original claim ID allows the new claim resulting from the adjustment to be linked back to the original claim.  (2300, REF02)",Claim,,,Y,237
Detail,LINE_SEQ_ORIG,"The original line sequence is used to more accurately report payment variance and invoice data for edited TBA lines that are returned in history with one or multiple different line sequence numbers.  It links newly created lines back to the original line number that generated the change recommendation.  (2400, REF02)",Line,,,N,238
Detail,GROUP_ID,The value in this field represents the Employer Group Number for the member’s claim.  This field is used for reporting purposes only.,Claim,,,N,239
Detail,GROUP_NAME,"The value in this field represents the Employer Group Name for the patient's claim.  (2000B, SBR04)",Claim,,,N,240
Detail,RISK_POOL,"The value submitted in this field defines the risk pool associated with the group the member belongs to.  Expected value examples are; ASO, Fully Insured, Large Group Self Funded, Large Group Fully Insured, etc.  These values will be pulled from the appropriate client database for reporting purposes.",Claim,,,N,241
Detail,SUB_CLAIM_FILING_CODE,"The claim filing indicator is a CMS value that identifies the type of insurance for the submitted claim.  This is not to be confused with the CLAIM_TYPE of this layout. Expected values are found on a separate tab.  (2000B, SBR02) (2000C, PAT06)",Claim,,,Y,242
Detail,SUB_LAST_NAME,"The value in this field represents the subscriber’s last name and  will be the same value as submitted in PATIENT_LAST_NAME when the subscriber is the patient.  (Subscriber:  2010BA, NM103)",Claim,,,Y,243
Detail,SUB_FIRST_NAME,"The value in this field represents the subscriber’s first name  and  will be the same value as submitted in PATIENT_FIRST_NAME when the subscriber is the patient.   (Subscriber:  2010BA, NM104)",Claim,,,Y,244
Detail,SUB_MIDDLE_NAME,"The value in this field represents the subscriber's middle name  and  will be the same value as submitted in PATIENT_MIDDLE_NAME when the subscriber is the patient. This is required by CMS when needed to identify the individual. (Subscriber: 2010BA, NM105)",Claim,,,Y,245
Detail,SUB_NAME_SUFFIX,"The value in this field represents the suffix attached to the subscriber's name and will be the same value as submitted in PATIENT_NAME_SUFFIX when the subscriber is the patient.  This is required by CMS when needed to identify the individual. (Subscriber: 2010BA, NM105)",Claim,,,Y,246
Detail,SUB_ADDRESS_01,"The value in this field represents the first line of the subscriber's address.  This value will be the same value as submitted in PATIENT_ADDRESS_01 when the subscriber is the patient.  (2010BA, N301)",Claim,,,Y,247
Detail,SUB_ADDRESS_02,"The value in this field represents the second line of the subscriber's address.  This value will be the same value as submitted in PATIENT_ADDRESS_02 when the subscriber is the patient.   (2010BA, N302)",Claim,,,Y,248
Detail,SUB_CITY,"The value in this field represents the city of the subscriber's address. This value will be the same value as submitted in PATIENT_CITY when the subscriber is the patient.  (2010BA, N401)",Claim,,,Y,249
Detail,SUB_STATE,"The value in this field represents the state of the subscriber's address.  This value will be the same value as submitted in PATIENT_STATE when the subscriber is the patient.  (2010BA, N402)",Claim,,,Y,250
Detail,SUB_ZIP,"The value in this field represents the postal ZIP code associated with the subscriber's address.  The value is the basic five digit ZIP code and will be the same value as submitted in PATIENT_ZIP when the subscriber is the patient.    (2010BA, N403)",Claim,,,Y,251
Detail,SUB_ZIP_PLUS_FOUR,"The value in this field represents the four digit add-on code for the expanded ZIP code associated with the subscriber's address.  The value is four digits and will be the same value as submitted in PATIENT_ZIP_PLUS_FOUR when the subscriber is the patient.     2010BA, N403)",Claim,,,Y,252
Detail,SUB_COUNTRY,"The value in this field represents the country of the subscriber's  address.  This value will be the same value as submitted in PATIENT_COUNTRY when the subscriber is the patient.   (2010BA, N404)",Claim,,,Y,253
Detail,SUB_COUNTRY_SUBDIVISION,"The value in this field represents the country subdivision code for the subscriber's address and only used for international addresses.  This value will be the same value as submitted in PATIENT_COUNTRY_SUBDIVISION when the subscriber is the patient.  (2010BA, N404)",Claim,,,N,254
Detail,SUB_DOB,"This field represents the subscriber’s date of birth and will be the same value as submitted in PATIENT_DOB when the subscriber is the patient.  (2010BA, DMG02)",Claim,,,Y,255
Detail,SUB_GENDER_ID,"The value in this field represents the subscriber’s gender.  This value will be the same value as submitted in PATIENT_GENDER_ID when the subscriber is the patient.  Recommended values are M for Male, F for Female and U for Unknown.  (Subscriber:  2010BA, DMG03)",Claim,,,Y,256
Detail,SUB_SSN,"The value in this field represents the subscriber’s social security number.  (2010BA, REF)",Claim,,,N,257
Detail,PATIENT_ADDRESS_01,"The value in this field represents the first line of the patient's address.  This value will be the same value as submitted in SUB_ADDRESS_01 when the patient is the subscriber.  (2010CA, N301)",Claim,,,Y,258
Detail,PATIENT_ADDRESS_02,"The value in this field represents the second line of the patient's address.  This value will be the same value as submitted in SUB_ADDRESS_02 when the patient is the subscriber.  (2010CA, N302)",Claim,,,Y,259
Detail,PATIENT_CITY,"The value in this field represents the city of the patient's address. (2010CA, N401)",Claim,,,Y,260
Detail,PATIENT_STATE,"The value in this field represents the state of the patient's address.  (2010CA, N402)",Claim,,,Y,261
Detail,PATIENT_ZIP,"The value in this field represents the postal ZIP code associated with the patient's address.  (2010CA, N403)",Claim,,,Y,262
Detail,PATIENT_ZIP_PLUS_FOUR,"The value in this field represents the four digit add-on code for the expanded ZIP code associated with the patient's address.      2010CA, N403)",Claim,,,Y,263
Detail,PATIENT_COUNTRY,"The value in this field represents the country of the patient's  address.  (2010CA, N404)",Claim,,,Y,264
Detail,PATIENT_COUNTRY_SUBDIVISION,"The value in this field represents the country subdivision code for the patient's address and only used for international addresses.  (2010CA, N404)",Claim,,,N,265
Detail,RETIRED_INDICATOR,The value in this field defines indicates whether or not the member is a retiree. Expected values are ‘Y’ for Retiree or ‘N’ for Not Retired.,Claim,,,N,266
Detail,PAY_TO_ENTITY_TYPE,"Expected Values are:  'P' = Person or 'E' = Other Entity or Facility
(2010AB, NM102)",Line,,,N,267
Detail,PAY_TO_LAST_NAME,"This field represents the pay-to entity.  This data is not required by CMS, but it is requested that it be sent when the pay-to entity is different than the billing provider or facility.",Line,,,N,268
Detail,PAY_TO_FIRST_NAME,"The value in this field represents the pay-to provider’s first name.  (2010AB, NM104)",Line,,,N,269
Detail,PAY_TO_MIDDLE_NAME,"The value in this field represents the pay-to provider’s middle name.  (2010AB, NM105)",Line,,,N,270
Detail,PAY_TO_NAME_SUFFIX,"The value in this field represents the pay-to provider's suffix, as required.  (2010AB, NM107)",Line,,,N,271
Detail,PAY_TO_ADDRESS_01,"The value in this field represents the first line of the pay-to entity's address. CMS requires when the address for payment is different than that of the Billing Provider. (2010AB, NM1)",Line,,,Y,272
Detail,PAY_TO_ADDRESS_02,"The value in this field represents the second line of the billing entity's address. CMS requires when the address for payment is different than that of the Billing Provider. (2010AB, N302)",Line,,,Y,273
Detail,PAY_TO_CITY,"The value in this field represents the city of the pay-to entity's address.  (2010AB, N401)",Line,,,Y,274
Detail,PAY_TO_STATE,"The value in this field represents the state of the pay-to entity's address.  (2010AB, N402)",Line,,,Y,275
Detail,PAY_TO_ZIP,"The value in this field represents the postal ZIP code for the pay-to entity.  The value is the basic five digit ZIP code.   (2010AB, N403)",Line,,,Y,276
Detail,PAY_TO_ZIP_PLUS_FOUR,"The value in this field represents the four digit add-on code for the expanded ZIP code.  The value is four digits.   (2010AB, N403)",Line,,,Y,277
Detail,PAY_TO_COUNTRY,"The value in this field represents the country of the pay-to entity's  address.  (2010AB, N404)",Line,,,Y,278
Detail,PAY_TO_COUNTRY_SUBDIVISION,"The value in this field represents the country subdivision code for the pay-to entity's address.  This is only used for international addresses.(2010AB, N407)",Line,,,N,279
Detail,REFERRING_PCP_YN,"Y or N indicator to define whether or not the referring provider is the patient's PCP. (2310A, NM101)",Line,,,N,280
Detail,REFERRING_PROVIDER_ID,"The value in this field represents the provider that referred the patient to the referring provider.  This number is the identification number unique to the provider in the client’s system.  (2310A, REF02)",Line,,,N,281
Detail,REFERRING_TAXGROUP_ID,"The value in this field represents the provider's tax identification number. This number represents the referring provider.  (2310A, REF02)",Line,,,N,282
Detail,REFERRING_NPI,"The value in this field represents the CMS National Provider Identifier (NPI) for the referring provider.  Default to spaces if value is not available.  (2310A, NM109)",Line,,,Y,283
Detail,REFERRING_STATE_LICENSE,"The value in this field represents the Sate License number for the referring provider.  A non-zero value is required.  (2310A, REF02)",Line,,,N,284
Detail,REFERRING_SPECIALTY_CODE,"The value in this field represents the specialty of the referring provider, as defined in the client's claim system.",Line,,,N,285
Detail,REFERRING_TAXONOMY_CODE,Industry standard taxonomy code of the referring provider used by CMS and sourced by the National Uniform Claim Committee. A list of taxonomy codes is available via http://www.wpc-edi.com/reference/codelists/healthcare/health-care-provider-taxonomy-code-set/.,Line,,,N,286
Detail,REFERRING_ENTITY_TYPE,"Expected Values are:  'P' = Person
(2310A, NM102)",Line,,,N,287
Detail,REFERRING_LAST_NAME,"The value in this field represents the referring provider’s last name.  (2310A, NM103)",Line,,,Y,288
Detail,REFERRING_FIRST_NAME,"The value in this field represents the referring provider’s first name.  (2310A, NM104)  Confirm referring D or E? Update for all referring values.",Line,,,Y,289
Detail,REFERRING_MIDDLE_NAME,"The value in this field represents the referring provider’s middle name.  (2310A, NM105)  Confirm referring D or E?",Line,,,Y,290
Detail,REFERRING_NAME_SUFFIX,"The value in this field represents the referring provider's suffix, as required.  (2310A, NM107)",Line,,,Y,291
Detail,SUPERVISING_PROVIDER_ID,"The value in this field represents the provider ID for the supervising provider.  This number is the identification number unique to the provider in the client’s system.  (2310D, REF02)",Line,,,N,292
Detail,SUPERVISING_TAXGROUP_ID,"The value in this field represents the provider's tax identification number. This number represents the supervising provider.  (2310D, REF02)",Line,,,N,293
Detail,SUPERVISING_NPI,"The value in this field represents the CMS National Provider Identifier (NPI) for the supervising provider.  Default to spaces if value is not available. (2310D, NM109)",Line,,,N,294
Detail,SUPERVISING_STATE_LICENSE,"The value in this field represents the State License number for the supervising provider.  A non-zero value is required.  (2310D, REF02)",Line,,,N,295
Detail,SUPERVISING_SPECIALTY_CODE,"The value in this field represents the specialty of the supervising provider, as defined in the client's claim system.",Line,,,N,296
Detail,SUPERVISING_TAXONOMY_CODE,Industry standard taxonomy code of the supervising provider used by CMS and sourced by the National Uniform Claim Committee. A list of taxonomy codes is available via http://www.wpc-edi.com/reference/codelists/healthcare/health-care-provider-taxonomy-code-set/.,Line,,,N,297
Detail,SUPERVISING_ENTITY_TYPE,"Expected Values are:  'P' = Person
(2310D, NM102)",Line,,,N,298
Detail,SUPERVISING_LAST_NAME,"The value in this field represents the supervising provider’s last name.  (2310D, NM103)",Line,,,N,299
Detail,SUPERVISING_FIRST_NAME,"The value in this field represents the supervising provider’s first name.  (2310D, NM104)  Confirm supervising D or E? Update for all supervising values.",Line,,,N,300
Detail,SUPERVISING_MIDDLE_NAME,"The value in this field represents the supervising provider’s middle name.  (2310D, NM105)  Confirm supervising D or E?",Line,,,N,301
Detail,SUPERVISING_NAME_SUFFIX,"The value in this field represents the supervising provider's suffix, as required.  (2310D, NM107)",Line,,,N,302
Detail,ORDERING_PROVIDER_ID,"Ordering provider information is required by CMS when the service or supply was ordered by a provider who is different than the rendering provider for this service line. The value in this field represents a single physician identification number that is unique to the physician in the client’s system for the ordering provider. If a physician has more than one identifying number, there could be an impact to adjudication recommendations which should be discussed.  (2420E, REF02)",Line,,,N,303
Detail,ORDERING_TAXGROUP_ID,"The value in this field represents the ordering provider's tax identification number.  (2420E, REF02)",Line,,,N,304
Detail,ORDERING_NPI,"The value in this field represents the CMS National Provider Identifier (NPI) for the provider ordering this service.  Default to spaces if value is not available.  (2420E, NM109)",Line,,,N,305
Detail,ORDERING_STATE_LICENSE,"The value in this field represents the Sate License number for the ordering provider.  A non-zero value is required.  (2420E, REF02)",Line,,,N,306
Detail,ORDERING_SPECIALTY_CODE,"The value in this field is a code that represents the ordering physician’s specialty or subspecialty.  As an example: ORTH or 0015 for orthopedics, PEDCAR or 0030 for pediatric cardiology, etc. In order to make appropriate adjudication recommendations on the claim, the provider’s specialty must be identified. Blank values in this field can be mapped to a “miscellaneous” specialty which will limit payment policies that will be applied, if this method is chosen by the client.  Unrecognizable (unmapped) values will result in the “failing” of the claim during processing and will be reported on the daily processing report.  Client preferences will be discussed during the implementation process.  Please provide a list of client values with descriptions.",Line,,,N,307
Detail,ORDERING_TAXONOMY_CODE,Industry standard taxonomy code of the ordering provider used by CMS and sourced by the National Uniform Claim Committee. A list of taxonomy codes is available via http://www.wpc-edi.com/reference/codelists/healthcare/health-care-provider-taxonomy-code-set/.,Line,,,N,308
Detail,ORDERING_ENTITY_TYPE,"Expected Values are:  'P' = Person  (2420E, NM102)",Line,,,N,309
Detail,ORDERING_LAST_NAME,"The value in this field represents the ordering provider’s last name.  (2420E, NM103)",Line,,,N,310
Detail,ORDERING_FIRST_NAME,"The value in this field represents the ordering provider’s first name.  (2420E, NM104)",Line,,,N,311
Detail,ORDERING_MIDDLE_NAME,"The value in this field represents the ordering provider's middle name.  (2420E, NM105)",Line,,,N,312
Detail,ORDERING_NAME_SUFFIX,"The value in this field represents the ordering provider's suffix, as required.  (2420E NM107)",Line,,,N,313
Detail,ORDERING_ADDRESS_01,"The value in this field represents the first line of the ordering provider's address. (2420E, N301)",Line,,,N,314
Detail,ORDERING_ADDRESS_02,"The value in this field represents the second line of the ordering provider's address.  (2420E, N302)",Line,,,N,315
Detail,ORDERING_CITY,"The value in this field represents the city of the ordering provider's address.  (2420E, N401)",Line,,,N,316
Detail,ORDERING_STATE,"The value in this field represents the state of the ordering provider's address.  (2420E, N402)",Line,,,N,317
Detail,ORDERING_ZIP,"The value in this field represents the postal ZIP code for the ordering provider.  The value is the basic five digit ZIP code.   (2420E, N403)",Line,,,N,318
Detail,ORDERING_ZIP_PLUS_FOUR,"The value in this field represents the four digit add-on code for the expanded ZIP code.  The value is four digits.   (2420E, N403)",Line,,,N,319
Detail,ORDERING_COUNTRY,The value in this field represents the country of the ORDERING provider's address.  (2420E N404),Line,,,N,320
Detail,ORDERING_COUNTRY_SUBDIVISION,"The value in this field represents the country subdivision code for the ordering provider's address.  This is only used for international addresses.(2420E, N404)",Line,,,N,321
Detail,ORDERING_CONTACT,"This field represents the ordering provider's contact name.  (2420E, PER02)",Line,,,N,322
Detail,ORDERING_PHONE_COUNTRY_CODE,"This field represents the unique country code for international dialing for the ordering provider's primary phone number. (2420E, PER04)",Line,,,N,323
Detail,ORDERING_PHONE,"The value in this field represents the ordering provider's telephone number.    (2420E, PER04)",Line,,,N,324
Detail,ORDERING_PHONE_EXT,"The value in this field represents the ordering provider's primary telephone extension. (2420E, PER04)",Line,,,N,325
Detail,ORDERING_ALT_PHONE_COUNTRY_CODE,"This field represents the unique country code for international dialing for the ordering provider's alternate phone number. (2420E, PER06)",Line,,,N,326
Detail,ORDERING_ALT_PHONE,"The value in this field represents the ordering provider's alternate telephone number. (2420E, PER06)",Line,,,N,327
Detail,ORDERING_ALT_PHONE_EXT,"The value in this field represents the ordering provider's alternate telephone extension.(2420E, PER06)",Line,,,N,328
Detail,ORDERING_FAX_COUNTRY_CODE,"This field represents the unique country code for international dialing for the ordering provider's fax number. (2420E, PER08)",Line,,,N,329
Detail,ORDERING_FAX,"The value in this field represents the ordering provider's fax number. (2420E, PER08)",Line,,,N,330
Detail,AUTH_EXCEPTION_CODE,"Required when mandated by government law or regulation to obtain authorization for specific service(s) but, for the reasons provided, the service was performed without obtaining the authorization.  Allowable values for this element are:
1  -  Immediate/Urgent Care
2  -  Services Rendered in a Retroactive Period
3  -  Emergency Care
4  -  Client has Temporary Medicaid
5  -  Request from County for Second Opinion to Determine if Recipient Can Work
6  -  Request for Override Pending
7  -  Special Handling
(2300, REF02)",Claim,,,N,331
Detail,REFERRAL_NUM,"Required by CMS when a referral number is assigned by the payer or Utilization Management Organization (UMO) AND a referral is involved.  (2300, REF02)",Claim,,,N,332
Detail,AUTH_NO_01,"The value in this field represents the authorization number submitted by the provider for this claim.  If the provider did not submit an authorization number, provide the payer’s prior authorization number for this claim, if available.  (2300, REF)",Claim,,,N,333
Detail,CLAIM_NOTE_REF_CODE,"This field defines the functional area or purpose for which the claim note applies, as submitted by the provider or facility.  Expected Values are:
ADD  -  Additional Information
CER  -  Certificate Narrative
DCP  -  Goals, Rehabilitation Potential, or Discharge Plans
DGN  -  Diagnosis Description
TPO  -  Third Party Organization Notes
(2300, NTE01)",Claim,,,N,334
Detail,CLAIM_NOTE_TEXT,"This field is the free-form description provided by the provider or facility to clarify the related data elements and their content. (2300, NTE02)",Claim,,,N,335
Detail,MEDICARE_CROSSOVER_INDICATOR_YN,"This field represents the Medicare Section 4081 Indicator and is required when the submitter is Medicare and the claim is a Medigap or COB crossover claim.  The allowed values for this element are: 'Y' when the claim is section  4081, and 'N' when it is a Regular crossover claim. (2300, REF)",Claim,,,N,336
Detail,CHIRO_CONDITION_CODE,"This field supplies information related to the chiropractic service rendered to the patient.  This information is required on chiropractic claims involving spinal manipulation when the information is known to impact the payer's adjudication process.  Expected values are:
A  -  Acute Condition
C  -  Chronic Condition
D  -  Non-acute
E  -  Non-Life Threatening
F  -  Routine
G  -  Symptomatic
M  -  Acute Manifestation of a Chronic Condition
(2300, CR208)",Line,,,N,337
Detail,CHIRO_CONDITION_DESC_01,"This field is a free-form description to clarify the patient's condition.  (2300, CR210)",Line,,,N,338
Detail,CHIRO_CONDITION_DESC_02,"This field is a free-form description to clarify the patient's condition.  (2300, CR211)",Line,,,N,339
Detail,CHIRO_LAST_XRAY_DATE,"This field defines the date that the last x-ray was taken and is required by CMS when the service involves spinal manipulation.  (2300, DTP03) or (2400, DTP03)",Claim,,,N,340
Detail,VISION_CODE_CATEGORY,"This field defines the category of vision service provided.  Valid values are:
E1  -   Spectacle Lenses
E2  -  Contact Lenses
E3  -  Spectacle Frames
(2300, CRC01)",Line,,,N,341
Detail,VISION_CONDITION_CODE_01,"This field is used to supply information on patient condition when the claim is vision related and involves the replacement of lenses or frames, and it known to impact reimbursement. Conditions should only be reported if they apply to the claim. Valid values are:
L1  -  General Standard of 20 Degree or .5 Diopter Sphere or Cylinder Change Met
L2  -  Replacement Due to Loss or Theft
L3  -  Replacement Due to Breakage or Damage
L4  -  Replacement Due to Patient Preference
L5  -  Replacement Due to Medical Reason
(2300, CRC03)",Line,,,N,342
Detail,VISION_CONDITION_CODE_02,"See VISION_CONDITION_CODE_01  for valid values.  (2300, CRC07)",Line,,,N,343
Detail,VISION_CONDITION_CODE_03,"See VISION_CONDITION_CODE_01  for valid values.  (2300, CRC07)",Line,,,N,344
Detail,VISION_CONDITION_CODE_04,"See VISION_CONDITION_CODE_01 for valid values.  (2300, CRC06)",Line,,,N,345
Detail,VISION_CONDITION_CODE_05,"See VISION_CONDITION_CODE_01  for valid values.  (2300, CRC07)",Line,,,N,346
Detail,EPSDT_REFERRAL_YN,"This field answers the question: 'Was an EPSDT referral given to the patient?'.  Required on Early & Periodic Screening, Diagnosis, and Treatment (EPSDT) claims when the screening service is being billed in this claim. Valid values are 'Y' and 'N'. (2300, CRC02)",Claim,,,N,347
Detail,EPSDT_CONDITION_CODE_01,"This field represents the condition indicator for the EPSDT referral above.  Expected Values are:
AV  -  Available  -  Not Used  -  Patient refused referral.
NU  -  Not Used  -  This conditioner indicator must be used when the submitter
            answers “N” in CRC02.
S2  -   Under Treatment  -  Patient is currently under treatment for referred
            diagnostic or corrective health problem.
ST  -  New Services Requested  -  Patient is referred to another provider for
           diagnostic or corrective treatment for at least one health problem
           identified during an initial or periodic screening service (not including
           dental referrals).
           OR
           Patient is scheduled for another appointment with screening provider for
           diagnostic or corrective treatment for at least one health problem
           identified during an initial or periodic screening service (not including
           dental referrals).
(2300, CRC03)",Claim,,,N,348
Detail,EPSDT_CONDITION_CODE_02,Additional condition indicator for the EPSDT referral.,Claim,,,N,349
Detail,EPSDT_CONDITION_CODE_03,Additional condition indicator for the EPSDT referral.,Claim,,,N,350
Detail,EPSDT_INDICATOR_YN,"This field defines whether or not the service being billed is the result of an EPSDT screening service and is required by CMS when Medicaid services are the result of a screening referral.  The screening service would be submitted with the value 'N'.  Y” value indicates EPSDT involvement; an “N” value indicates no EPSDT involvement.(2400, SV111)",Claim,,,N,351
Detail,ANESTHESIA_RELATED_SURG_HCPCS_01,"The value in this field represents the Level1 (CPT) or Level2 (HCPCS) code for the surgical code when anesthesiology services are being billed.  (2300, HI01-2)",Claim,,,N,352
Detail,ANESTHESIA_RELATED_SURG_HCPCS_02,"The value in this field represents the Level1 (CPT) or Level2 (HCPCS) code for the surgical code when anesthesiology services are being billed.  (2300, HI02-2)",Claim,,,N,353
Detail,FAMILY_PLANNING_INDICATOR_YN,"The value in this field indicates whether or not the service being billed is the result of Family Planning services.  A “Y” value indicates family planning services involvement; an “N” value indicates no family planning services involvement.  (2300, SV112)",Line,,,N,354
Detail,DME_HCPCS,"The value in this field represents the Level1 (CPT) or Level2 (HCPCS) code for Durable Medical Equipment.  Required when necessary to report both the rental and purchase price information for durable medical equipment. This is not used for claims where the provider is reporting only the rental price or only the purchase price. (2400, SV501-2)",Line,,,N,355
Detail,DME_UNITS,"This field specifies the length (in days) of medical treatment required as it relates to this service.  (2400, SV503)",Line,,,N,356
Detail,DME_RENTAL_PRICE_AMOUNT,"This value is the rental price for the DME service being reported.  (2400, SV504)",Line,,,N,357
Detail,DME_PURCHASE_PRICE_AMOUNT,"This value is the purchase price for the DME service being reported.  (2400,SV505)",Line,,,N,358
Detail,DME_RENTAL_FREQUENCY,"The value in this field define the frequency at which the rental equipment is billed.  Valid values are:
1  -  Weekly
4  -  Monthly
6  -  Daily
(2400,SV507)",Line,,,N,359
Detail,DMERC_CMN_TRANSMIT_CODE,"This value provides the documentation type for Durable Medical Equipment Regional Carrier (DMERC) Certificate of Medically Necessity (CMN).  Valid values are:
AB  -  Previously Submitted to Payer
AD  -  Certification Included in this Claim
AF  -  Narrative Segment Included in this Claim
AG  -  No Documentation is Required
NS  -  Not Specified  (Available upon request at provider's site.) (2400, PWK02)",Line,,,N,360
Detail,DME_CERT_TYPE,"This field defines the type of certification being provided for DME.  CMS requires this when the DMERC_CMN_TRANSMIT_CODE, DMERC Information Form or Oxygen Therapy Certification is included on this service line.  Valid Values are:
I  -  Initial
R  -  Renewal
S  -  Revised
(2400, CR301)",Line,,,N,361
Detail,DME_DURATION,"This field represents the length of time (in months) the DME equipment is needed.  (2400, CR303)",Line,,,N,362
Detail,DME_CONDITION_CODE_01,"This field is utilized to supply information on conditions related to the DME Certification and is submitted when it impacts adjudication. Valid Values are:
38  -  Certification signed by the physician is on file
ZV  -  Replacement Item
(2400, CRC03)",Line,,,N,363
Detail,DME_CONDITION_CODE_02,"This field is utilized to supply information on conditions related to the DME Certification and is submitted when it impacts adjudication. Valid Values are:
38  -  Certification signed by the physician is on file
ZV  -  Replacement Item
(2400, CRC04)",Line,,,N,364
Detail,DME_CERT_REVISION_DATE,"This field is required when a DBERC certification is 'R'  -  Renewal or 'S'  -  Revised, and represents the date the certification was revised or recertification received. (2400, DTP03)",Line,,,N,365
Detail,DME_BEGIN_THERAPY_DATE,"This field defines the first date of therapy for DME services.  (2400, DTP03)",Line,,,N,366
Detail,DME_LAST_CERT_DATE,"This is the date the ordering physician signed the CMN or the date the supplier signed the DMERC CMN.  (2400, DTP03)",Line,,,N,367
Detail,FORM_ID_CODE,"This field identifies the form attached to the claim by the rendering provider.  Examples are: Medicare DMERC CMN form, DMERC Information Form (DIF), Oxygen Therapy Certification from the referring physician or Home Health documentation.  Valid values are:
AS  -  Form Type Code  -  Code value AS indicates that a Home Health form from
           External Code Source 656 is being identified in LQ02.
UT  -  Centers for Medicare and Medicaid Services (CMS) Durable Medical
           Equipment Regional Carrier (DMERC) Certificate of Medical Necessity (CMN)
           Forms
(2440, LQ01)",Claim,,,N,368
Detail,FORM_ID,"This field provides the form identifier as defined in the FORM_ID_CODE field.  (2440, LQ02)",Claim,,,N,369
Detail,DOCUMENT_CONTROL_NUMBER,The value in this field represents the client specific document control number.,Claim,,,N,370
Detail,ATTACHMENT_TYPE_CODE_01,"This field is required when a paper attachment follows the submission of an electronic claim, is sent electronically or available by request from the provider's office and identifies the type of attachment being sent.  This value is defined by CMS in the Institutional 837 TR3 (IG) in loop 2400, segment PWK01.  See tab 'Attachment Codes' for a list of values. (2400, PWK01)",Line,,,N,371
Detail,ATTACHMENT_TRANSMIT_CODE_01,"This field is required when ATTACHMENT_TYPE_CODE_01 is provided.  This value defines how the attachment will be sent.  Valid values are defined by CMS in the Institutional 837 TR3 (IG) in loop 2400, segment PWK02.  See tab 'Attachment Codes' for a list of values.  Expected when corresponding ATTACHMENT_TYPE_CODE is submitted.  (2400, PWK02)",Line,,,N,372
Detail,ACN_01,"This field represents a value assigned by the provider to uniquely identify the attachment referenced in ATTACHMENT_TYPE_CODE_01.  Expected when corresponding ATTACHMENT_TYPE_CODE is submitted.  (2400, PWK06)",Line,,,N,373
Detail,ATTACHMENT_TYPE_CODE_02,"This field is required when a paper attachment follows the submission of an electronic claim, is sent electronically or available by request from the provider's office and identifies the type of attachment being sent.  This value is defined by CMS in the Institutional 837 TR3 (IG) in loop 2400, segment PWK01.  See tab 'Attachment Codes' for a list of values. (2400, PWK01)",Line,,,N,374
Detail,ATTACHMENT_TRANSMIT_CODE_02,"This field is required when ATTACHMENT_TYPE_CODE_02 is provided.  This value defines how the attachment will be sent.  Valid values are defined by CMS in the Institutional 837 TR3 (IG)  in loop 2400, segment PWK02.  See tab 'Attachment Codes' for a list of values.  Expected when corresponding ATTACHMENT_TYPE_CODE is submitted.  (2400, PWK02)",Line,,,N,375
Detail,ACN_02,"This field represents a value assigned by the provider to uniquely identify the attachment referenced in ATTACHMENT_TYPE_CODE_02.  Expected when corresponding ATTACHMENT_TYPE_CODE is submitted.   (2400, PWK06)",Line,,,N,376
Detail,ATTACHMENT_TYPE_CODE_03,"This field is required when a paper attachment follows the submission of an electronic claim, is sent electronically or available by request from the provider's office and identifies the type of attachment being sent.  This value is defined by CMS in the Institutional 837 TR3 (IG) in loop 2400, segment PWK01.  See tab 'Attachment Codes' for a list of values. (2400, PWK01)",Line,,,N,377
Detail,ATTACHMENT_TRANSMIT_CODE_03,"This field is required when ATTACHMENT_TYPE_CODE_03 is provided.  This value defines how the attachment will be sent.  Valid values are defined by CMS in the Institutional 837 TR3 (IG)  in loop 2400, segment PWK02.  See tab 'Attachment Codes' for a list of values.  Expected when corresponding ATTACHMENT_TYPE_CODE is submitted. (2400, PWK02)",Line,,,N,378
Detail,ACN_03,"This field represents a value assigned by the provider to uniquely identify the attachment referenced in ATTACHMENT_TYPE_CODE_03.  This field is required if the corresponding Attachment is present.  Expected when corresponding ATTACHMENT_TYPE_CODE is submitted.  (2400, PWK06)",Line,,,N,379
Detail,ATTACHMENT_TYPE_CODE_04,"This field is required when a paper attachment follows the submission of an electronic claim, is sent electronically or available by request from the provider's office and identifies the type of attachment being sent.  This value is defined by CMS in the Institutional 837 TR3 (IG) in loop 2400, segment PWK01.  See tab 'Attachment Codes' for a list of values. (2400, PWK01)",Line,,,N,380
Detail,ATTACHMENT_TRANSMIT_CODE_04,"This field is required when ATTACHMENT_TYPE_CODE_04 is provided.  This value defines how the attachment will be sent.  Valid values are defined by CMS in the Institutional 837 TR3 (IG)  in loop 2400, segment PWK02.  See tab 'Attachment Codes' for a list of values.  Expected when corresponding ATTACHMENT_TYPE_CODE is submitted. (2400, PWK02)",Line,,,N,381
Detail,ACN_04,"This field represents a value assigned by the provider to uniquely identify the attachment referenced in ATTACHMENT_TYPE_CODE_04.  This field is required if the corresponding Attachment is present.  Expected when corresponding ATTACHMENT_TYPE_CODE is submitted. (2400, PWK06)",Line,,,N,382
Detail,ATTACHMENT_TYPE_CODE_05,"This field is required when a paper attachment follows the submission of an electronic claim, is sent electronically or available by request from the provider's office and identifies the type of attachment being sent.  This value is defined by CMS in the Institutional 837 TR3 (IG) in loop 2400, segment PWK01.  See tab 'Attachment Codes' for a list of values. (2400, PWK01)",Line,,,N,383
Detail,ATTACHMENT_TRANSMIT_CODE_05,"This field is required when ATTACHMENT_TYPE_CODE_05 is provided.  This value defines how the attachment will be sent.  Valid values are defined by CMS in the Institutional 837 TR3 (IG)  in loop 2400, segment PWK02.  See tab 'Attachment Codes' for a list of values.  Expected when corresponding ATTACHMENT_TYPE_CODE is submitted. (2400, PWK02)",Line,,,N,384
Detail,ACN_05,"This field represents a value assigned by the provider to uniquely identify the attachment referenced in ATTACHMENT_TYPE_CODE_05.  Expected when corresponding ATTACHMENT_TYPE_CODE is submitted. (2400, PWK06)",Line,,,N,385
Detail,ATTACHMENT_TYPE_CODE_06,"This field is required when a paper attachment follows the submission of an electronic claim, is sent electronically or available by request from the provider's office and identifies the type of attachment being sent.  This value is defined by CMS in the Institutional 837 TR3 (IG) in loop 2400, segment PWK01.  See tab 'Attachment Codes' for a list of values. (2400, PWK01)",Line,,,N,386
Detail,ATTACHMENT_TRANSMIT_CODE_06,"This field is required when ATTACHMENT_TYPE_CODE_06 is provided.  This value defines how the attachment will be sent.  Valid values are defined by CMS in the Institutional 837 TR3 (IG)  in loop 2400, segment PWK02.  See tab 'Attachment Codes' for a list of values.  Expected when corresponding ATTACHMENT_TYPE_CODE is submitted. (2400, PWK02)",Line,,,N,387
Detail,ACN_06,"This field represents a value assigned by the provider to uniquely identify the attachment referenced in ATTACHMENT_TYPE_CODE_06.  Expected when corresponding ATTACHMENT_TYPE_CODE is submitted.  (2400, PWK06)",Line,,,N,388
Detail,ATTACHMENT_TYPE_CODE_07,"This field is required when a paper attachment follows the submission of an electronic claim, is sent electronically or available by request from the provider's office and identifies the type of attachment being sent.  This value is defined by CMS in the Institutional 837 TR3 (IG) in loop 2400, segment PWK01.  See tab 'Attachment Codes' for a list of values. (2400, PWK01)",Line,,,N,389
Detail,ATTACHMENT_TRANSMIT_CODE_07,"This field is required when ATTACHMENT_TYPE_CODE_07 is provided.  This value defines how the attachment will be sent.  Valid values are defined by CMS in the Institutional 837 TR3 (IG)  in loop 2400, segment PWK02.  See tab 'Attachment Codes' for a list of values.  Expected when corresponding ATTACHMENT_TYPE_CODE is submitted.  (2400, PWK02)",Line,,,N,390
Detail,ACN_07,"This field represents a value assigned by the provider to uniquely identify the attachment referenced in ATTACHMENT_TYPE_CODE_07.  Expected when corresponding ATTACHMENT_TYPE_CODE is submitted.  (2400, PWK06)",Line,,,N,391
Detail,ATTACHMENT_TYPE_CODE_08,"This field is required when a paper attachment follows the submission of an electronic claim, is sent electronically or available by request from the provider's office and identifies the type of attachment being sent.  This value is defined by CMS in the Institutional 837 TR3 (IG) in loop 2400, segment PWK01.  See tab 'Attachment Codes' for a list of values. (2400, PWK01)",Line,,,N,392
Detail,ATTACHMENT_TRANSMIT_CODE_08,"This field is required when ATTACHMENT_TYPE_CODE_08 is provided.  This value defines how the attachment will be sent.  Valid values are defined by CMS in the Institutional 837 TR3 (IG)  in loop 2400, segment PWK02.  See tab 'Attachment Codes' for a list of values.  Expected when corresponding ATTACHMENT_TYPE_CODE is submitted.  (2400, PWK02)",Line,,,N,393
Detail,ACN_08,"This field represents a value assigned by the provider to uniquely identify the attachment referenced in ATTACHMENT_TYPE_CODE_08.  Expected when corresponding ATTACHMENT_TYPE_CODE is submitted.   (2400, PWK06)",Line,,,N,394
Detail,ATTACHMENT_TYPE_CODE_09,"This field is required when a paper attachment follows the submission of an electronic claim, is sent electronically or available by request from the provider's office and identifies the type of attachment being sent.  This value is defined by CMS in the Institutional 837 TR3 (IG) in loop 2400, segment PWK01.  See tab 'Attachment Codes' for a list of values. (2400, PWK01)",Line,,,N,395
Detail,ATTACHMENT_TRANSMIT_CODE_09,"This field is required when ATTACHMENT_TYPE_CODE_09 is provided.  This value defines how the attachment will be sent.  Valid values are defined by CMS in the Institutional 837 TR3 (IG)  in loop 2400, segment PWK02.  See tab 'Attachment Codes' for a list of values.  Expected when corresponding ATTACHMENT_TYPE_CODE is submitted. (2400, PWK02)",Line,,,N,396
Detail,ACN_09,"This field represents a value assigned by the provider to uniquely identify the attachment referenced in ATTACHMENT_TYPE_CODE_09.   Expected when corresponding ATTACHMENT_TYPE_CODE is submitted.  (2400, PWK06)",Line,,,N,397
Detail,ATTACHMENT_TYPE_CODE_10,"This field is required when a paper attachment follows the submission of an electronic claim, is sent electronically or available by request from the provider's office and identifies the type of attachment being sent.  This value is defined by CMS in the Institutional 837 TR3 (IG) in loop 2400, segment PWK01.  See tab 'Attachment Codes' for a list of values. (2400, PWK01)",Line,,,N,398
Detail,ATTACHMENT_TRANSMIT_CODE_10,"This field is required when ATTACHMENT_TYPE_CODE_10 is provided.  This value defines how the attachment will be sent.  Valid values are defined by CMS in the Institutional 837 TR3 (IG)  in loop 2400, segment PWK02.  See tab 'Attachment Codes' for a list of values.  Expected when corresponding ATTACHMENT_TYPE_CODE is submitted. (2400, PWK02)",Line,,,N,399
Detail,ACN_10,"This field represents a value assigned by the provider to uniquely identify the attachment referenced in ATTACHMENT_TYPE_CODE_10.  Expected when corresponding ATTACHMENT_TYPE_CODE is submitted.  (2400, PWK06)",Line,,,N,400
Detail,CLAIM_ATTACHMENT_TYPE_CODE,"This field indicates the title or contents of a document, report or supporting item.  Expected values are defined in the CMS 837 transaction.  (2300, PWK01)",Claim,,,N,401
Detail,CLAIM_ATTACHMENT_TRANSMIT_CODE,"This field represents the code defining timing, transmission method or format by which reports are to be sent.  Expected values are defined in the CMS 837 transaction.  (2300, PWK02)",Claim,,,N,402
Detail,CLAIM_ACN,"This field represents the code designating the system/method of code structure used for identification.  (2300, PWK05)",Claim,,,N,403
Detail,LINE_AUTH_NUM_01,"This field represents the line level authorization number for this service and is only required when it differs from the claim level authorization number found in AUTH_NO_1 in this layout or when it is necessary to report one or more non-destination payer Prior Authorization Numbers.  (2400, REF02)",Line,,,N,404
Detail,LINE_AUTH_NUM_01_NPI,"This field defines the primary identifier (NPI) from the non-destination payer and would match the Other Payer information in Loop ID-2330B, NM109. Default to spaces if value is not available. (2400, REF04-2)",Line,,,N,405
Detail,LINE_AUTH_NUM_02,"This field represents the line level authorization number for this service and is only required when it differs from the claim level authorization number found in AUTH_NO_1 in this layout or when it is necessary to report one or more non-destination payer Prior Authorization Numbers.  (2400, REF02)",Line,,,N,406
Detail,LINE_AUTH_NUM_02_NPI,"This field defines the primary identifier (NPI) from the non-destination payer and would match the Other Payer information in Loop ID-2330B, NM109. Default to spaces if value is not available. (2400, REF04-2)",Line,,,N,407
Detail,LINE_AUTH_NUM_03,"This field represents the line level authorization number for this service and is only required when it differs from the claim level authorization number found in AUTH_NO_1 in this layout or when it is necessary to report one or more non-destination payer Prior Authorization Numbers.  (2400, REF02)",Line,,,N,408
Detail,LINE_AUTH_NUM_03_NPI,"This field defines the primary identifier (NPI) from the non-destination payer and would match the Other Payer information in Loop ID-2330B, NM109. Default to spaces if value is not available.  (2400, REF04-2)",Line,,,N,409
Detail,LINE_AUTH_NUM_04,"This field represents the line level authorization number for this service and is only required when it differs from the claim level authorization number found in AUTH_NO_1 in this layout or when it is necessary to report one or more non-destination payer Prior Authorization Numbers.  (2400, REF02)",Line,,,N,410
Detail,LINE_AUTH_NUM_04_NPI,"This field defines the primary identifier (NPI) from the non-destination payer and would match the Other Payer information in Loop ID-2330B, NM109. Default to spaces if value is not available.  (2400, REF04-2)",Line,,,N,411
Detail,LINE_AUTH_NUM_05,"This field represents the line level authorization number for this service and is only required when it differs from the claim level authorization number found in AUTH_NO_1 in this layout or when it is necessary to report one or more non-destination payer Prior Authorization Numbers.  (2400, REF02)",Line,,,N,412
Detail,LINE_AUTH_NUM_05_NPI,"This field defines the primary identifier (NPI) from the non-destination payer and would match the Other Payer information in Loop ID-2330B, NM109. Default to spaces if value is not available. (2400, REF04-2)",Line,,,N,413
Detail,ONSET_CURRENT_ILLNESS,"This date is the onset of acute symptoms for the current illness or condition.  Required for the initial medical service or visit performed in response to a medical emergency when the date is available and is different than the date of service.  (2300, DTP03)",Claim,,,N,414
Detail,INITIAL_TREATMENT_DATE,"This field is required by CMS when this information is known to impact adjudication for claims involving spinal manipulation, physical therapy, occupational therapy, or speech language pathology.  (2300, DTP03)",Claim,,,N,415
Detail,LAST_SEEN_DATE,"This is the date that the patient was seen by the attending or supervising physician for the qualifying medical condition related to the services performed.  CMS requires this date when claims involve services for routine foot care and it is known to impact the payer’s adjudication process.  (2300, DTP03)",Claim,,,N,416
Detail,ACUTE_MANIFESTATION_DATE,"This field represents the date of acute manifestation and is required when Loop ID-2300 CR208= 'A' or 'M', the claim involves spinal manipulation and the payer is Medicare.  (2300, DTP03)",Claim,,,N,417
Detail,ACCIDENT_DATE,"This field represents the date of accident and is required when the service is rendered as a result of an accident, whether auto, other or in relation to employment. (2300, DTP03)",Claim,,,N,418
Detail,LMP_DATE,"This field represents the date of the patient's last menstrual period and is required when, in the judgment of the provider, the services on this claim are related to the patient’s pregnancy. (2300, DTP03)",Claim,,,N,419
Detail,ADMIT_DATE,"The value in this field should represent the date in the Statement Covers Period From date.  Required on all ambulance claims when the patient was known to be admitted to the hospital. Required for CV.  (2300, DTP03)",Claim,,,N,420
Detail,DISCHARGE_DATE,"The value in this field represents the Discharge Date.   Required on all ambulance claims when the patient was known to be admitted to the hospital. (2300, DTP03)",Claim,,,N,421
Detail,ASSUMED_CARE_DATE,"This field represents the ""assumed care date"" when provider share post-operative care.  Assumed Care Date is the date care was assumed by another provider.  (2300, DTP03)",Claim,,,N,422
Detail,RELINQUISHED_CARE_DATE,"This field represents the ""relinquished care date"" when providers share post-operative care.  The Relinquished Care Date is the date the provider filing this claim ceased post-operative care. (2300, DTP03)",Claim,,,N,423
Detail,LINE_NOTE_REF_CODE,"This field defines the functional area or purpose for which the line note applies, as submitted by the provider or facility.  Valid Values are:
ADD  -  Additional Information
DCP  -  Goals, Rehabilitation Potential, or Discharge Plans
(2400, NTE01)",Line,,,N,424
Detail,LINE_NOTE_TEXT,"This field is the free-form description provided by the provider or facility to clarify the related data elements and their content. (2400, NTE02)",Line,,,N,425
Detail,CLAIM_FREQUENCY_CODE,"This code specifies the frequency of the claim and is the third position of the UBC Form Bill Type.  (2300, CLM05-3)",Claim,,,Y,426
Detail,ADJUSTMENT_NUMBER,"The value in this field provides information on how many adjustments have been made to the claim line (0  -  original, greater than 0 indicates times adjusted).",Line,,,N,427
Detail,ADJ_CODE_01,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.   This field is line level.",Line,,,N,428
Detail,ADJ_TYPE_01,"This field defines the source of the line level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding ADJ_CODE is present.",Line,,,N,429
Detail,ADJUSTOR_ID_01,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding ADJ_CODE is present.,Line,,,N,430
Detail,ADJ_CODE_02,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.   This field is line level.",Line,,,N,431
Detail,ADJ_TYPE_02,"This field defines the source of the line level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding ADJ_CODE is present.",Line,,,N,432
Detail,ADJUSTOR_ID_02,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding ADJ_CODE is present.,Line,,,N,433
Detail,ADJ_CODE_03,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.   This field is line level.",Line,,,N,434
Detail,ADJ_TYPE_03,"This field defines the source of the line level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding ADJ_CODE is present.",Line,,,N,435
Detail,ADJUSTOR_ID_03,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding ADJ_CODE is present.,Line,,,N,436
Detail,ADJ_CODE_04,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.   This field is line level.",Line,,,N,437
Detail,ADJ_TYPE_04,"This field defines the source of the line level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding ADJ_CODE is present.",Line,,,N,438
Detail,ADJUSTOR_ID_04,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding ADJ_CODE is present.,Line,,,N,439
Detail,ADJ_CODE_05,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.   This field is line level.",Line,,,N,440
Detail,ADJ_TYPE_05,"This field defines the source of the line level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding ADJ_CODE is present.",Line,,,N,441
Detail,ADJUSTOR_ID_05,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding ADJ_CODE is present.,Line,,,N,442
Detail,ADJ_CODE_06,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.   This field is line level.",Line,,,N,443
Detail,ADJ_TYPE_06,"This field defines the source of the line level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding ADJ_CODE is present.",Line,,,N,444
Detail,ADJUSTOR_ID_06,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding ADJ_CODE is present.,Line,,,N,445
Detail,ADJ_CODE_07,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.   This field is line level.",Line,,,N,446
Detail,ADJ_TYPE_07,"This field defines the source of the line level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding ADJ_CODE is present.",Line,,,N,447
Detail,ADJUSTOR_ID_07,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted. Expected if corresponding ADJ_CODE is present.,Line,,,N,448
Detail,ADJ_CODE_08,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.   This field is line level.",Line,,,N,449
Detail,ADJ_TYPE_08,"This field defines the source of the line level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding ADJ_CODE is present.",Line,,,N,450
Detail,ADJUSTOR_ID_08,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted. Expected if corresponding ADJ_CODE is present.,Line,,,N,451
Detail,ADJ_CODE_09,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.   This field is line level.",Line,,,N,452
Detail,ADJ_TYPE_09,"This field defines the source of the line level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding ADJ_CODE is present.",Line,,,N,453
Detail,ADJUSTOR_ID_09,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted. Expected if corresponding ADJ_CODE is present.,Line,,,N,454
Detail,ADJ_CODE_10,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.   This field is line level.",Line,,,N,455
Detail,ADJ_TYPE_10,"This field defines the source of the line level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding ADJ_CODE is present.",Line,,,N,456
Detail,ADJUSTOR_ID_10,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding ADJ_CODE is present.,Line,,,N,457
Detail,CLAIM_ADJUSTMENT_NUMBER,"The value in this field provides information on how many adjustments have been made to the claim (0  -  original, greater than 0 indicates number of times adjusted).",Claim,,,N,458
Detail,CLAIM_ADJ_CODE_01,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is claim level.",Claim,,,N,459
Detail,CLAIM_ADJ_TYPE_01,"This field defines the source of the claim level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding CLAIM_ADJ_CODE is present.",Claim,,,N,460
Detail,CLAIM_ADJUSTOR_ID_01,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted. Expected if corresponding CLAIM_ADJ_CODE is present.,Claim,,,N,461
Detail,CLAIM_ADJ_CODE_02,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is claim level.",Claim,,,N,462
Detail,CLAIM_ADJ_TYPE_02,"This field defines the source of the claim level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding CLAIM_ADJ_CODE is present.",Claim,,,N,463
Detail,CLAIM_ADJUSTOR_ID_02,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding CLAIM_ADJ_CODE is present.,Claim,,,N,464
Detail,CLAIM_ADJ_CODE_03,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is claim level.",Claim,,,N,465
Detail,CLAIM_ADJ_TYPE_03,"This field defines the source of the claim level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding CLAIM_ADJ_CODE is present.",Claim,,,N,466
Detail,CLAIM_ADJUSTOR_ID_03,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding CLAIM_ADJ_CODE is present.,Claim,,,N,467
Detail,CLAIM_ADJ_CODE_04,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is claim level.",Claim,,,N,468
Detail,CLAIM_ADJ_TYPE_04,"This field defines the source of the claim level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding CLAIM_ADJ_CODE is present.",Claim,,,N,469
Detail,CLAIM_ADJUSTOR_ID_04,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted. Expected if corresponding CLAIM_ADJ_CODE is present.,Claim,,,N,470
Detail,CLAIM_ADJ_CODE_05,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is claim level.",Claim,,,N,471
Detail,CLAIM_ADJ_TYPE_05,"This field defines the source of the claim level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding CLAIM_ADJ_CODE is present.",Claim,,,N,472
Detail,CLAIM_ADJUSTOR_ID_05,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding CLAIM_ADJ_CODE is present.,Claim,,,N,473
Detail,CLAIM_ADJ_CODE_06,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is claim level.",Claim,,,N,474
Detail,CLAIM_ADJ_TYPE_06,"This field defines the source of the claim level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding CLAIM_ADJ_CODE is present.",Claim,,,N,475
Detail,CLAIM_ADJUSTOR_ID_06,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted. Expected if corresponding CLAIM_ADJ_CODE is present.,Claim,,,N,476
Detail,CLAIM_ADJ_CODE_07,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is claim level.",Claim,,,N,477
Detail,CLAIM_ADJ_TYPE_07,"This field defines the source of the claim level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding CLAIM_ADJ_CODE is present.",Claim,,,N,478
Detail,CLAIM_ADJUSTOR_ID_07,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding CLAIM_ADJ_CODE is present.,Claim,,,N,479
Detail,CLAIM_ADJ_CODE_08,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is claim level.",Claim,,,N,480
Detail,CLAIM_ADJ_TYPE_08,"This field defines the source of the claim level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding CLAIM_ADJ_CODE is present.",Claim,,,N,481
Detail,CLAIM_ADJUSTOR_ID_08,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.   Expected if corresponding CLAIM_ADJ_CODE is present.,Claim,,,N,482
Detail,CLAIM_ADJ_CODE_09,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is claim level.",Claim,,,N,483
Detail,CLAIM_ADJ_TYPE_09,"This field defines the source of the claim level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding CLAIM_ADJ_CODE is present.",Claim,,,N,484
Detail,CLAIM_ADJUSTOR_ID_09,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding CLAIM_ADJ_CODE is present.,Claim,,,N,485
Detail,CLAIM_ADJ_CODE_10,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is claim level.",Claim,,,N,486
Detail,CLAIM_ADJ_TYPE_10,"This field defines the source of the claim level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding CLAIM_ADJ_CODE is present.",Claim,,,N,487
Detail,CLAIM_ADJUSTOR_ID_10,Client employee who actually made the claim level adjustment.  Expected if corresponding CLAIM_ADJ_CODE is present.,Claim,,,N,488
Detail,ANESTHESIA_TIME,This field represents the amount of time that anesthesia was administered to the patient during the service provided.  Time is submitted in whole minutes.,Line,,,N,489
Detail,CHECK_NUM,This field stores the actual check number on which this claim was paid. For incoming (TBA) claims the field should be left blank. The actual check number is populated in the history file.,Claim,,,N,490
Detail,PLATFORM_CODE,"Please provide the name of the claim system used to process the claim.  Examples are Nasco, Facets, Amysis, Power MHS, etc.",Claim,,,N,491
Detail,DATA_SOURCE,"The value in this field defines from where the claim data was pulled within the client’s platform. For example, if the client is a Facets client, the client platform would be Facets and the data may have been pulled from the Data Warehouse.",Claim,,,N,492
Detail,EMERGENCY_INDICATOR_YN,"This field defines whether or not the service being billed is related to an emergency.  Valid values are:  “Y” value indicates service provided was emergency related; an “N” value indicates service provided was not emergency related.  (2300, SV109)",Line,,,N,493
Detail,PAPER_INDICATOR,"Claim submission type. Valid values are:
P  -  Paper
E  -  Electronic",Claim,,,N,494
Detail,CIT_RESTRICTED_ID,This field is a free-form field used to define CIT restrictions that allow clients to define an appropriate level of security for internal data access. This field is not to be used until the client and Implementation Services Director determine a need.,Claim,,,N,495
Detail,CV_US_ONLY_YN,The value in this field indicates whether the claim has to be routed to U.S. only resources. A 'Y' value indicates the claim has to be routed to U.S. only resources.,Claim,,,N,496
Detail,CDF_TEXT_01,Line level client defined field.  Use of this field should be discussed to ensure proper utilization and storage prior to the addition of data in the file.  Data provided in this field will be reflected on the Invoice Detail Report (IDR).,Line,,,N,497
Detail,CDF_TEXT_02,Line level client defined field.  Use of this field should be discussed to ensure proper utilization and storage prior to the addition of data in the file.  Data provided in this field will be reflected on the Invoice Detail Report (IDR).,Line,,,N,498
Detail,CDF_TEXT_03,Line level client defined field.  Use of this field should be discussed to ensure proper utilization and storage prior to the addition of data in the file.  Data provided in this field will be reflected on the Invoice Detail Report (IDR).,Line,,,N,499
Detail,CLAIM_CDF_TEXT_01,Claim level client defined field.  Use of this field should be discussed to ensure proper utilization and storage prior to the addition of data in the file.,Claim,,,N,500
Detail,CLAIM_CDF_TEXT_02,Claim level client defined field.  Use of this field should be discussed to ensure proper utilization and storage prior to the addition of data in the file.,Claim,,,N,501
Detail,CLAIM_CDF_TEXT_03,Claim level client defined field.  Use of this field should be discussed to ensure proper utilization and storage prior to the addition of data in the file.,Claim,,,N,502
Detail,SUB_MEMBER_GROUP_NUMBER,The value in this field represents the Subscriber's group number ( 2000B.SBR03 ),Claim,,,Y,503
Detail,PROVIDER_SIGNATURE_PRESENT,The value in this field represents whether the Provider Signature is present. (2300.CLM06),Claim,,,Y,504
Detail,ASSIGNMENT_ACCEPTANCE,"The value in this field represents whether the Provider agrees to accept assignment under terms of the
payer's program, select ""Yes"" from the drop-down list. Otherwise,
select ""No."" (2300.CLM08)",Claim,,,Y,505
Detail,INFORMATION_RELEASE,"The value in this field represents whether the Patient has signed the release, allowing the sharing of the information (2300.CLM09)",Claim,,,Y,506
Detail,RENDERING_FACILITY_ NAME,The value in this field represents the Name of the Rendering Facility,Claim,,,Y,507
Detail,RENDERING_FACILITY_NPI,The value in this field represents the NPI of the Rendering Facility,Claim,,,Y,508
Detail,RENDERING_FACILITY__ ADDRESS_01,The value in this field represents the Address line 1 of the Rendering Facility,Claim,,,Y,509
Detail,RENDERING_FACILITY_ ADDRESS_02,The value in this field represents the Address line 2 of the Rendering Facility,Claim,,,Y,510
Detail,RENDERING_FACILITY_ ADDRESS_CITY,The value in this field represents the City of the Rendering Facility,Claim,,,Y,511
Detail,RENDERING_FACILITY_ ADDRESS_STATE,The value in this field represents the State of the Rendering Facility,Claim,,,Y,512
Detail,RENDERING_FACILITY_ ADDRESS_Zip + RRENDERING_FACILITY_ ADDRESS_ZIP_PLUS_FOUR,The value in this field represents the Zip code and the Zip plus code of the Rendering Facility,Claim,,,Y,513
Detail,RENDERING_FACILITY_ ADDRESS_COUNTRY,The value in this field represents the Country of the Rendering Facility,Claim,,,Y,514
Detail,RENDERING_PRACTITIONER__LAST_NAME,"The value in this field represents the rendering provider’s last name if rendering entity type = 'P' or Organizational Name if rendering entity type = 'E'.  Required for CV. (2310B, NM103)",Line,,,Y,515
Detail,RENDERING_PRACTITIONER__FIRST_NAME,"The value in this field represents the rendering provider’s first name.  Required for CV. (2310B, NM104)",Line,,,Y,516
Detail,RENDERING_PRACTITIONER__MIDDLE_NAME,"The value in this field represents the rendering provider’s middle name.  (2310B, NM105)",Line,,,Y,517
Detail,RENDERING_PRACTITIONER__NAME_SUFFIX,"The value in this field represents the rendering provider's suffix, as required.  (2310B, NM107)",Line,,,Y,518
Detail,RENDERING_PRACTITIONER__NPI,"The value in this field represents the CMS National Provider Identifier (NPI) for the provider rendering this service.  Default to spaces if value is not available.  (2310B, NM109)  Previously NPI and the identifier of record for professional providers. Required for CV.",Line,,,Y,519
Detail,RENDERING_PRACTITIONER__TAXONOMY_CODE,Industry standard taxonomy code of the rendering provider used by CMS and sourced by the National Uniform Claim Committee. A list of taxonomy codes is available via http://www.wpc-edi.com/reference/codelists/healthcare/health-care-provider-taxonomy-code-set/.  Required for CV.,Line,,,Y,520
Detail,REPRICER_NAME,The value in the field represent the Name of the Repricer,Line,,,Y,515
Detail,SUB_HCPCS_DESC,The value in this field represents the Level1 (CPT) or Level2 (HCPCS) procedure code description submitted by the provider for this service line (2400.SV101-07),Line,,,Y,516
Detail,CLAIM_NUM,The value in this field represent the claim fact key or the Claim versioning number.,Claim,,,Y,517
Detail,RECORD_IDENTIFIER,The value in this field represent the unique identifier of a claim record used for tracking,Claim,,,Y,518
Detail,RAY_IDENTIFIER,The value in this field represent the unique identifier of a claim used for tracking even during retry the claim,Claim,,,Y,519
Detail,EXECUTION_IDENTIFIER,The value in this field represent the unique identifier on a job level used for tracking,Claim,,,Y,520
,,,,,,,
Trailer,TRAILER_CONSTANT,Field valued with ‘TRAILER’,File,,,Y,1
Trailer,DETAIL_COUNT,This field contains the total number of DETAIL records in the file.,File,,,Y,2
Trailer,RUN_DATE,This field contains the date of the file run.,File,,,Y,3
Trailer,RUN_TIME,This field contains the time of the file run.,File,,,Y,4
Trailer,FILLER,"For Fixed Width files only. The trailer record is right-padded with spaces to equal the full length of the claim data records, taking into account the characters included in the client defined field.

The length of this field varies depending on number of characters in detail line.  The ending position will have the same ending character as the detail line.",File,,,Y,5
```

## Repricer OB-IB/OB Repricer/V26.1.0.0/EdifecsProduct_MappingSpec_OB Repricer_837_DFF_to_EDI Conversion_V2.1.xlsx — Institutional Layout

```csv
File Component,Field Name,Field Description,Level,Type,Length,Repricer,Position
,,,,,,,
Header,Header_Prefix,Field valued with ‘Header’,File,,,Y,1
Header,FILE_TYPE,"Valid values:  T or H
The file type indicates whether this file is a “to be audited” TBA File (T) or a History file (H).",File,,,Y,2
Header,FILE_SEQ,"This field contains the sequence number of the file.  This should be a value starting at 1 for the first daily and first history files received.  Subsequent files should be incremented by 1 so that each daily file has a unique FILE_SEQ number and then each history file has a unique FILE_SEQ number.  This sequence number will be used during file processing to confirm that the same file sequence number has not previously been loaded into the database.  It is important to note that the file sequence in the file name only increments for multiple files sent in the same day and will always reset to 1 for each new day.

Note: There is a separate file sequence for initial history files loaded prior to going live.  The sequence for ongoing history files should be reset to start at 1 after completion of the initial history load.",File,,,Y,3
Header,PRODUCED_DATE,This field contains the date the file was generated by the client. Date should be in CCYYMMDD format in all places,File,,,Y,4
Header,RECORD_COUNT,This field contains the total number of DETAIL records in the file.,File,,,Y,5
Header,FILE_INDICATOR,"Valid values:  'R' (retro) or 'P' (pre-pay.)
The file indicator identifies whether this file is a Retro (R) or a Pre-Pay (P) file. Use Pre-Pay (P) for prospective TBA claim extracts (claims prior to payment).  Use Retro (R) for retrospective paid claim TBA files.  Use 'R' for all History Extract files.",File,,,Y,6
Header,FILLER,"For Fixed Width files only. The header record is right-padded with spaces to equal the full length of the claim data records, taking into account the characters included in the client defined field.",File,,,Y,7
Header,TYPE_OF_FILE,This value in the field represent whether the claim is a Institutional or Professional ( INST or PROF),File,,,Y,8
,,,,,,,
Detail,TAG_VALUE_PREFIX,The value in this field represents the Tag value of the claim which falls on the prefix on each claim split. Record 0001 – should be prefixed on each claim and Record 0002 should be prefixed on all the lines of that claim,Claim,,,Y,1
Detail,TYPE_OF_FILE,This value in the field represent whether the claim is a Institutional or Professional ( INST or PROF),Claim,,,Y,2
Detail,SUB_ID,"The value in this field represents the member's identification number. In many cases, each member (subscriber and dependents) are issued an ID that is unique in the client’s system. If this ID is not unique, the data in this field combined with the DEPENDENT_NUM will be used to represent a unique member.
(Subscriber:  2010BA, NM109, NM1*IL*1) (Dependent:  2010CA, NM109, NM1*QC*1)",Claim,,,Y,3
Detail,DEPENDENT_NUM,"The value in this field represents the member’s dependent status as it relates to the insured. The value in this field, combined with the SUB_ID provides a unique member identifier. This field is required only if needed to create a unique member ID.",Claim,,,N,4
Detail,PATIENT_DOB,"The value in this field represents the patient’s date of birth.  Required for CV.  (Subscriber:  2010BA, DMG02) (Patient:  2010CA, DMG02)",Claim,,,Y,5
Detail,PATIENT_GENDER_ID,"The value in this field represents the patient’s gender.  Recommended values are M for Male, F for Female and U for Unknown.  Required for CV.  (Subscriber:  2010BA, DMG03)  (Patient:  2010CA, DMG03)",Claim,,,Y,6
Detail,PATIENT_SSN,The value in this field represents the patient’s social security number.,Claim,,,N,7
Detail,SUB_MEDICARE_ID,"This field represents the subscriber's Medicare ID and should include the trailing alpha character.  The patient's Medicare number would be provided in the PATIENT_ID field.  If the subscriber is the patient, the value in both fields would be the same.",Claim,,,N,8
Detail,MEDICAID_ID,This field represents the patient's unique Medicaid ID as assigned by the State in which they are covered.,Claim,,,N,9
Detail,PATIENT_ID,"The value in this field represents an alternate patient identification number, not otherwise specified in the layout. Required for CV.",Claim,,,N,10
Detail,PATIENT_CONTROL_NUM,"The value in this field represents the Patient Control Number, also referred to as the Patient Account Number and is assigned by the provider or facility.  (2300, CLM01)",Claim,,,Y,11
Detail,PATIENT_LAST_NAME,"The value in this field represents the patient’s last name. (Subscriber:  2010BA, NM103)  (Patient: 2010CA, NM103)",Claim,,,Y,12
Detail,PATIENT_FIRST_NAME,"The value in this field represents the patient’s first name.  (Subscriber:  2010BA, NM104) (Patient: 2010CA, NM104)",Claim,,,Y,13
Detail,PATIENT_MIDDLE_NAME,"The value in this field represents the patient's middle name.  This is required by CMS when needed to identify the individual. (Subscriber: 2010BA, NM105) (Patient: 2010CA, NM105)",Claim,,,Y,14
Detail,PATIENT_NAME_SUFFIX,"The value in this field represents the suffix attached to the patient's name.  This is required by CMS when needed to identify the individual. (Subscriber: 2010BA, NM105) (Patient: 2010CA, NM105)",Claim,,,Y,15
Detail,RELATIONSHIP_TO_SUB,"The value in this field defines the patient's relationship to the subscriber.  CMS values are:
01 - Spouse
18 - Self
19 - Child
20 - Employee
21 - Unknown
39 - Organ Donor
40 - Cadaver Donor
53 - Life Partner
G8 - Other Relationship
Required for CV.
(Subscriber: 2000B, SBR02)  (Dependent:  2000C, PAT01)",Claim,,,Y,16
Detail,PATIENT_DEATH_DATE,The value in this field represents the patient's date of death.,Claim,,,N,17
Detail,CLAIM_ID,"The value in this field represents the client’s claim identification number. This should be a claim ID that is unique in the client’s system. If this ID is not unique, please advise what other data is required to make it unique. Required for CV.",Claim,,,Y,18
Detail,PROVIDER_CLAIM_ID,"The value in this field represents the provider’s claim identification number. This should be a claim ID that is unique in the provider’s system. If this ID is not unique, please advise what other data is required to make it unique.",Claim,,,N,19
Detail,MED_REC_NO,"The value in this field represents the Medical Record Number from the rendering provider or facility.  (2300, REF02, REF*EA)",Claim,,,Y,20
Detail,BILL_TYPE,"The value in this field represents the Type of Bill.  This field is used to indicate the type of bill for Medicare’s billing purposes.  Any legacy 3-digit codes should have a leading 0 added to make up the 4 character value. (2300, CLM05-1) Required for CV.",Claim,,,Y,21
Detail,CONDITION_CODE_01,"The value in this field represents the Condition Code used to indicate the patient’s eligibility, benefits and how to administer the primary and secondary insurances.  (2300, HI01-2, HI*BG)",Claim,,,Y,22
Detail,CONDITION_CODE_02,"The value in this field represents the Condition Code used to indicate the patient’s eligibility, benefits and how to administer the primary and secondary insurances.  (2300, HI02-2, HI*BG)",Claim,,,Y,23
Detail,CONDITION_CODE_03,"The value in this field represents the Condition Code used to indicate the patient’s eligibility, benefits and how to administer the primary and secondary insurances.  (2300, HI03-2, HI*BG)",Claim,,,Y,24
Detail,CONDITION_CODE_04,"The value in this field represents the Condition Code used to indicate the patient’s eligibility, benefits and how to administer the primary and secondary insurances.  (2300, HI04-2, HI*BG)",Claim,,,Y,25
Detail,CONDITION_CODE_05,"The value in this field represents the Condition Code used to indicate the patient’s eligibility, benefits and how to administer the primary and secondary insurances.  (2300, HI05-2, HI*BG)",Claim,,,Y,26
Detail,CONDITION_CODE_06,"The value in this field represents the Condition Code used to indicate the patient’s eligibility, benefits and how to administer the primary and secondary insurances.  (2300, HI06-2, HI*BG)",Claim,,,Y,27
Detail,CONDITION_CODE_07,"The value in this field represents the Condition Code used to indicate the patient’s eligibility, benefits and how to administer the primary and secondary insurances.  (2300, H107-2, HI*BG)",Claim,,,Y,28
Detail,CONDITION_CODE_08,"The value in this field represents the Condition Code used to indicate the patient’s eligibility, benefits and how to administer the primary and secondary insurances.  (2300, HI08-2, HI*BG)",Claim,,,Y,29
Detail,CONDITION_CODE_09,"The value in this field represents the Condition Code used to indicate the patient’s eligibility, benefits and how to administer the primary and secondary insurances.  (2300, HI09-2, HI*BG)",Claim,,,Y,30
Detail,CONDITION_CODE_10,"The value in this field represents the Condition Code used to indicate the patient’s eligibility, benefits and how to administer the primary and secondary insurances.  (2300, HI10-2, HI*BG)",Claim,,,Y,31
Detail,CONDITION_CODE_11,"The value in this field represents the Condition Code used to indicate the patient’s eligibility, benefits and how to administer the primary and secondary insurances.  (2300, HI11-2, HI*BG)",Claim,,,Y,32
Detail,CONDITION_CODE_12,"The value in this field represents the Condition Code used to indicate the patient’s eligibility, benefits and how to administer the primary and secondary insurances.  (2300, HI12-2, HI*BG)",Claim,,,Y,33
Detail,CONDITION_CODE_13,"The value in this field represents the Condition Code used to indicate the patient’s eligibility, benefits and how to administer the primary and secondary insurances.  (2300, HI*BG Segment Repeat)",Claim,,,Y,34
Detail,CONDITION_CODE_14,"The value in this field represents the Condition Code used to indicate the patient’s eligibility, benefits and how to administer the primary and secondary insurances.  (2300, HI*BG Segment Repeat)",Claim,,,Y,35
Detail,CONDITION_CODE_15,"The value in this field represents the Condition Code used to indicate the patient’s eligibility, benefits and how to administer the primary and secondary insurances.  (2300, HI*BG Segment Repeat)",Claim,,,Y,36
Detail,CONDITION_CODE_16,"The value in this field represents the Condition Code used to indicate the patient’s eligibility, benefits and how to administer the primary and secondary insurances.  (2300, HI*BG Segment Repeat)",Claim,,,Y,37
Detail,CONDITION_CODE_17,"The value in this field represents the Condition Code used to indicate the patient’s eligibility, benefits and how to administer the primary and secondary insurances.  (2300, HI*BG Segment Repeat)",Claim,,,Y,38
Detail,CONDITION_CODE_18,"The value in this field represents the Condition Code used to indicate the patient’s eligibility, benefits and how to administer the primary and secondary insurances.  (2300, HI*BG Segment Repeat)",Claim,,,Y,39
Detail,CONDITION_CODE_19,"The value in this field represents the Condition Code used to indicate the patient’s eligibility, benefits and how to administer the primary and secondary insurances.  (2300, HI*BG Segment Repeat)",Claim,,,Y,40
Detail,CONDITION_CODE_20,"The value in this field represents the Condition Code used to indicate the patient’s eligibility, benefits and how to administer the primary and secondary insurances.  (2300, HI*BG Segment Repeat)",Claim,,,Y,41
Detail,CONDITION_CODE_21,"The value in this field represents the Condition Code used to indicate the patient’s eligibility, benefits and how to administer the primary and secondary insurances.  (2300, HI*BG Segment Repeat)",Claim,,,Y,42
Detail,CONDITION_CODE_22,"The value in this field represents the Condition Code used to indicate the patient’s eligibility, benefits and how to administer the primary and secondary insurances.  (2300, HI*BG Segment Repeat)",Claim,,,Y,43
Detail,CONDITION_CODE_23,"The value in this field represents the Condition Code used to indicate the patient’s eligibility, benefits and how to administer the primary and secondary insurances.  (2300, HI*BG Segment Repeat)",Claim,,,Y,44
Detail,CONDITION_CODE_24,"The value in this field represents the Condition Code used to indicate the patient’s eligibility, benefits and how to administer the primary and secondary insurances.  (2300, HI*BG Segment Repeat)",Claim,,,Y,45
Detail,VALUE_CODE_01,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI01-2, HI*BE)",Claim,,,Y,46
Detail,VALUE_AMOUNT_01,"The value in this field represents the Value Amount that includes monetary data necessary for processing the claim.  (2300, HI01-2, HI*BE)",Claim,,,Y,47
Detail,VALUE_CODE_02,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI02-2, HI*BE)",Claim,,,Y,48
Detail,VALUE_AMOUNT_02,"The value in this field represents the Value Amount that includes monetary data necessary for processing the claim.  (2300, HI02-2, HI*BE)",Claim,,,Y,49
Detail,VALUE_CODE_03,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI03-2, HI*BE)",Claim,,,Y,50
Detail,VALUE_AMOUNT_03,"The value in this field represents the Value Amount that includes monetary data necessary for processing the claim.  (2300, HI03-2, HI*BE)",Claim,,,Y,51
Detail,VALUE_CODE_04,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI04-2, HI*BE)",Claim,,,Y,52
Detail,VALUE_AMOUNT_04,"The value in this field represents the Value Amount that includes monetary data necessary for processing the claim.  (2300, HI04-2, HI*BE)",Claim,,,Y,53
Detail,VALUE_CODE_05,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI05-2, HI*BE)",Claim,,,Y,54
Detail,VALUE_AMOUNT_05,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI05-2, HI*BE)",Claim,,,Y,55
Detail,VALUE_CODE_06,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI06-2, HI*BE)",Claim,,,Y,56
Detail,VALUE_AMOUNT_06,"The value in this field represents the Value Amount that includes monetary data necessary for processing the claim.  (2300, HI06-2, HI*BE)",Claim,,,Y,57
Detail,VALUE_CODE_07,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI07-2, HI*BE)",Claim,,,Y,58
Detail,VALUE_AMOUNT_07,"The value in this field represents the Value Amount that includes monetary data necessary for processing the claim.  (2300, HI07-2, HI*BE)",Claim,,,Y,59
Detail,VALUE_CODE_08,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI08-2, HI*BE)",Claim,,,Y,60
Detail,VALUE_AMOUNT_08,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI08-2, HI*BE)",Claim,,,Y,61
Detail,VALUE_CODE_09,"The value in this field represents the Value Amount that includes monetary data necessary for processing the claim.  (2300, HI09-2, HI*BE)",Claim,,,Y,62
Detail,VALUE_AMOUNT_09,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI09-2, HI*BE)",Claim,,,Y,63
Detail,VALUE_CODE_10,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI10-2, HI*BE)",Claim,,,Y,64
Detail,VALUE_AMOUNT_10,"The value in this field represents the Value Amount that includes monetary data necessary for processing the claim.  (2300, HI10-2, HI*BE)",Claim,,,Y,65
Detail,VALUE_CODE_11,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI11-2, HI*BE)",Claim,,,Y,66
Detail,VALUE_AMOUNT_11,"The value in this field represents the Value Amount that includes monetary data necessary for processing the claim.  (2300, HI11-2, HI*BE)",Claim,,,Y,67
Detail,VALUE_CODE_12,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI12-2, HI*BE)",Claim,,,Y,68
Detail,VALUE_AMOUNT_12,"The value in this field represents the Value Amount that includes monetary data necessary for processing the claim.  (2300, HI12-2, HI*BE)",Claim,,,Y,69
Detail,VALUE_CODE_13,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI*BE Segment Repeat)",Claim,,,Y,70
Detail,VALUE_AMOUNT_13,"The value in this field represents the Value Amount that includes monetary data necessary for processing the claim.  (2300, HI*BE Segment Repeat)",Claim,,,Y,71
Detail,VALUE_CODE_14,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI*BE Segment Repeat)",Claim,,,Y,72
Detail,VALUE_AMOUNT_14,"The value in this field represents the Value Amount that includes monetary data necessary for processing the claim.  (2300, HI*BE Segment Repeat)",Claim,,,Y,73
Detail,VALUE_CODE_15,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI*BE Segment Repeat)",Claim,,,Y,74
Detail,VALUE_AMOUNT_15,"The value in this field represents the Value Amount that includes monetary data necessary for processing the claim.  (2300, HI*BE Segment Repeat)",Claim,,,Y,75
Detail,VALUE_CODE_16,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI*BE Segment Repeat)",Claim,,,Y,76
Detail,VALUE_AMOUNT_16,"The value in this field represents the Value Amount that includes monetary data necessary for processing the claim.  (2300, HI*BE Segment Repeat)",Claim,,,Y,77
Detail,VALUE_CODE_17,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI*BE Segment Repeat)",Claim,,,Y,78
Detail,VALUE_AMOUNT_17,"The value in this field represents the Value Amount that includes monetary data necessary for processing the claim.  (2300, HI*BE Segment Repeat)",Claim,,,Y,79
Detail,VALUE_CODE_18,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI*BE Segment Repeat)",Claim,,,Y,80
Detail,VALUE_AMOUNT_18,"The value in this field represents the Value Amount that includes monetary data necessary for processing the claim.  (2300, HI*BE Segment Repeat)",Claim,,,Y,81
Detail,VALUE_CODE_19,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI*BE Segment Repeat)",Claim,,,Y,82
Detail,VALUE_AMOUNT_19,"The value in this field represents the Value Amount that includes monetary data necessary for processing the claim.  (2300, HI*BE Segment Repeat)",Claim,,,Y,83
Detail,VALUE_CODE_20,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI*BE Segment Repeat)",Claim,,,Y,84
Detail,VALUE_AMOUNT_20,"The value in this field represents the Value Amount that includes monetary data necessary for processing the claim.  (2300, HI*BE Segment Repeat)",Claim,,,Y,85
Detail,VALUE_CODE_21,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI*BE Segment Repeat)",Claim,,,Y,86
Detail,VALUE_AMOUNT_21,"The value in this field represents the Value Amount that includes monetary data necessary for processing the claim.  (2300, HI*BE Segment Repeat)",Claim,,,Y,87
Detail,VALUE_CODE_22,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI*BE Segment Repeat)",Claim,,,Y,88
Detail,VALUE_AMOUNT_22,"The value in this field represents the Value Amount that includes monetary data necessary for processing the claim.  (2300, HI*BE Segment Repeat)",Claim,,,Y,89
Detail,VALUE_CODE_23,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI*BE Segment Repeat)",Claim,,,Y,90
Detail,VALUE_AMOUNT_23,"The value in this field represents the Value Amount that includes monetary data necessary for processing the claim.  (2300, HI*BE Segment Repeat)",Claim,,,Y,91
Detail,VALUE_CODE_24,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI*BE Segment Repeat)",Claim,,,Y,92
Detail,VALUE_AMOUNT_24,"The value in this field represents the Value Amount that includes monetary data necessary for processing the claim.  (2300, HI*BE Segment Repeat)",Claim,,,Y,93
Detail,CLAIM_DOS_BEGIN_DATE,"The value in this field should represent the date in the Statement Covers Period From date.  (2300, DTP03, Data Element 1251)",Claim,,,Y,94
Detail,CLAIM_DOS_END_DATE,"The value in this field should represent the date in the Statement Covers Period Through date.   (2300, DTP03, Data Element 1251)",Claim,,,Y,95
Detail,LENGTH_OF_STAY,"The value in this field represents the length of stay (LOS), which is a term to describe the duration of a single episode of hospitalization. Inpatient days are calculated by subtracting day of admission from day of discharge.",Claim,,,N,96
Detail,ADMIT_DATE,"The value in this field should represent the date in the Statement Covers Period From date.  Required for CV.  (2300, DTP03)",Claim,,,Y,97
Detail,ADMIT_TIME_HH,"The value in this field represents the Admit Hour in 24-hour time.  Valid values are 00 to 23. (2300, DTP03)",Claim,,,Y,98
Detail,ADMIT_TIME_MM,"The value in this field represents the Admit Minute.  Valid values are 00 to 59.  (2300, DTP03)",Claim,,,Y,99
Detail,ADMIT_TYPE,"The value in this field represents the type of admission. This field represents the primary reason for admission.  Expected values are:
1 = Emergency
2 = Urgent
3 = Elective
4 = Newborn
5 = Trauma
9 = Information Not Available
(2300, CL101)",Claim,,,Y,100
Detail,ADMIT_SOURCE_CODE,"This field represents the source for the admission.  Expected values are:
1 = Physician Referral
2 = Clinic Referral
3 = HMO Referral
4 = Transfer from Hospital
5 = Transfer from SNF
6 = Transfer From Another Health Care Facility
7 = Emergency Room
8 = Court/Law Enforcement
9 = Information Not Available
In the Case of Newborn:
1 = Normal Delivery
2 = Premature Delivery
3 = Sick Baby
4 = Extramural Birth
(2300, CL102)",Claim,,,Y,101
Detail,DISCHARGE_DATE,The value in this field represents the Discharge Date.,Claim,,,N,102
Detail,DISCHARGE_TIME_HH,"The value in this field represents the Discharge Hour in 24-hour time.  Valid values are 00 to 23.  (2300, DTP03, DTP*096)",Claim,,,Y,103
Detail,DISCHARGE_TIME_MM,"The value in this field represents the Discharge Hour in 24-hour time.  Valid values are 00 to 23.  (2300, DTP03, DTP*096)",Claim,,,N,104
Detail,DISCHARGE_STATUS,The value in this field represents the discharge status of the patient.,Claim,,,Y,105
Detail,SUB_DRG,"The value in this field represents the DRG billed by the provider.  Required when CONTRACT_TYPE_CODE = 01.  If the provider did not provide a submitted DRG, populate the submitted DRG with the allowed DRG value calculated by the payer.  (2300, HI01-2, HI*DR)",Claim,,,N,106
Detail,SUB_SEVERITY,"The value in this field represents the severity of illness (SOI) subclass submitted by the provider.  Valid values are:
1 = Minor
2 = Moderate
3 = Major
4 = Extreme
Required for claims that have APR grouper DRG codes. If the submitted DRG and severity are not available, populate the submitted DRG and submitted severity with the allowed values calculated by the payer.",Claim,,,N,107
Detail,ALLOWED_DRG,"The value in this field represents the payer’s calculated DRG.  Required when CONTRACT_TYPE_CODE = 01. If the payer does not recalculate the submitted DRG, and pays the submitted DRG, populate the allowed DRG with the submitted DRG value.",Claim,,,N,108
Detail,ALLOWED_SEVERITY,"The value in this field represents the severity of illness (SOI) subclass allowed by the payer.  Valid values are:
1 = Minor
2 = Moderate
3 = Major
4 = Extreme.
Required for claims that have APR grouper DRG codes.  If the payer does not recalculate the submitted DRG and severity, and uses the submitted values, populate the allowed DRG and severity with the submitted values.",Claim,,,N,109
Detail,DRG_INLIER_AMOUNT,The value in this field represents the dollar amount associated with the inlier portion of the calculated DRG value.,Claim,,,N,110
Detail,DRG_OUTLIER_AMOUNT,The value in this field represents the dollar amount associated with the outlier portion of the calculated DRG value.,Claim,,,N,111
Detail,GROUPER_ID,"The value in this field represents the DRG grouper associated with the ALLOWED_DRG field on this claim.  Client values will be determined during the implementation, and must be mapped to specific grouper values maintained by CCV.  This field provides the ability to support grouper exceptions if a provider is exempt from the standard grouper configured for this payer/line of business/state.",Claim,,,N,112
Detail,GROUPER_VERSION,The value in this field represents the grouper version that was used to determine the DRG associated with the claim.,Claim,,,N,113
Detail,APC_CODE,This field represents the Ambulatory Payment Classification (APC) code used in the client’s claim system to pay  hospital outpatient services.,Line,,,N,114
Detail,APC_PAYMENT_WEIGHT,The value in this field represents the relative weight associated with the submitted APC and used for calculating payment.,Line,,,N,115
Detail,APC_VERSION,This field represents the APC version used to acquire the relative weight used to calculate the claim payment.,Line,,,N,116
Detail,APG_CODE,This field represents the Ambulatory Patient Group (APG) used to reimburse providers for Medicaid services.,Line,,,N,117
Detail,APG_VERSION,The value in this field represents the APG version used to calculate the claim payment.,Line,,,N,118
Detail,REGULATORY_STATE,"Designates the regulatory state applicable for this claim.  This is a claim-level field.  Required for Medicaid and Commercial lines of business, based on the INSURANCE_LOB mapping.",Claim,,,N,119
Detail,PRINCIPAL_DIAGNOSIS_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes. Required for CV.  (2300, HI01-1, HI*BK or HI*ABK)",Claim,,,N,120
Detail,PRINCIPAL_DIAGNOSIS,"The value in this field represents the Principal Diagnosis which is the principal condition established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values. Required for CV.  (2300, HI01-2, HI*BK or HI*ABK)",Claim,,,Y,121
Detail,PRINCIPAL_DIAGNOSIS_POA,"The value in this field represents the Present on Admission Indicator for the Principal Diagnosis. These should be populated whenever possible.
Valid values:
Y = Yes - Present at time of admission
N = Not present at time of  admission
U = Unknown - Documentation is insufficient to determine if condition was present on admission
W = Clinically undetermined
Blank = unreported, not used, exempt from POA reporting.

Note:  Value ‘1’ was previously used to indicate exempt from POA. This is no longer supported by CMS and should be sent as blank. Inpatient Prospective Payment System (IPPS) hospitals are required to submit POA information on diagnoses for inpatient discharges on or after October 1, 2007.  (2300, HI01-9, HI*BK or HI*ABK)",Claim,,,Y,122
Detail,DIAGNOSIS_CODE_02_QUAL,"NOTE:  The Principal Diagnosis is required by CMS; however, all diagnoses submitted on the claim should be included to ensure accurate payment policy application and CV audit results.  When Diagnosis Codes 2-24 are submitted, the accompanying Qualifier must be provided for the claim to be considered.

The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.  (2300, HI01-1, HI*BF or HI*ABF)",Claim,,,N,123
Detail,DIAGNOSIS_CODE_02,"The value in this field represents the Other Diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  (2300, HI01-2, HI*BF or HI*ABF)",Claim,,,Y,124
Detail,DIAGNOSIS_CODE_02_POA,"The value in this field represents the Present on Admission Indicator for DIAGNOSIS_CODE_02.  See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300, HI01-9, HI*BF or HI*ABF)",Claim,,,Y,125
Detail,DIAGNOSIS_CODE_03_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.  (2300, HI02-1, HI*BF or HI*ABF)",Claim,,,N,126
Detail,DIAGNOSIS_CODE_03,"The value in this field represents the Other Diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  (2300, HI02-2, HI*BF or HI*ABF)",Claim,,,Y,127
Detail,DIAGNOSIS_CODE_03_POA,"The value in this field represents the Present on Admission Indicator for DIAGNOSIS_CODE_03.  See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300, HI02-9, HI*BF or HI*ABF)",Claim,,,Y,128
Detail,DIAGNOSIS_CODE_04_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.  (2300, HI03-1, HI*BF or HI*ABF)",Claim,,,N,129
Detail,DIAGNOSIS_CODE_04,"The value in this field represents the Other Diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  (2300, HI03-2, HI*BF or HI*ABF)",Claim,,,Y,130
Detail,DIAGNOSIS_CODE_04_POA,"The value in this field represents the Present on Admission Indicator for DIAGNOSIS_CODE_04.  See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300, HI03-9, HI*BF or HI*ABF)",Claim,,,Y,131
Detail,DIAGNOSIS_CODE_05_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.  (2300, HI04-1, HI*BF or HI*ABF)",Claim,,,N,132
Detail,DIAGNOSIS_CODE_05,"The value in this field represents the Other Diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  (2300, HI04-2, HI*BF or HI*ABF)",Claim,,,Y,133
Detail,DIAGNOSIS_CODE_05_POA,"The value in this field represents the Present on Admission Indicator for DIAGNOSIS_CODE_05.  See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300, HI04-9, HI*BF or HI*ABF)",Claim,,,Y,134
Detail,DIAGNOSIS_CODE_06_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.  (2300, HI05-1, HI*BF or HI*ABF)",Claim,,,N,135
Detail,DIAGNOSIS_CODE_06,"The value in this field represents the Other Diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  (2300, HI05-2, HI*BF or HI*ABF)",Claim,,,Y,136
Detail,DIAGNOSIS_CODE_06_POA,"The value in this field represents the Present on Admission Indicator for DIAGNOSIS_CODE_06.   See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300, HI05-9, HI*BF or HI*ABF)",Claim,,,Y,137
Detail,DIAGNOSIS_CODE_07_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.   (2300, HI06-1, HI*BF or HI*ABF)",Claim,,,N,138
Detail,DIAGNOSIS_CODE_07,"The value in this field represents the Other Diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  (2300, HI06-2, HI*BF or HI*ABF)",Claim,,,Y,139
Detail,DIAGNOSIS_CODE_07_POA,"The value in this field represents the Present on Admission Indicator for DIAGNOSIS_CODE_07.  See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300, HI06-9, HI*BF or HI*ABF)",Claim,,,Y,140
Detail,DIAGNOSIS_CODE_08_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.   (2300, HI07-1, HI*BF or HI*ABF)",Claim,,,N,141
Detail,DIAGNOSIS_CODE_08,"The value in this field represents the Other Diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  (2300, HI07-2, HI*BF or HI*ABF)",Claim,,,Y,142
Detail,DIAGNOSIS_CODE_08_POA,"The value in this field represents the Present on Admission Indicator for DIAGNOSIS_CODE_08.   See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300, HI07-9, HI*BF or HI*ABF)",Claim,,,Y,143
Detail,DIAGNOSIS_CODE_09_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.   (2300, HI08-1, HI*BF or HI*ABF)",Claim,,,N,144
Detail,DIAGNOSIS_CODE_09,"The value in this field represents the Other Diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  (2300, HI08-2, HI*BF or HI*ABF)",Claim,,,Y,145
Detail,DIAGNOSIS_CODE_09_POA,"The value in this field represents the Present on Admission Indicator for DIAGNOSIS_CODE_09.   See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300, HI08-9, HI*BF or HI*ABF)",Claim,,,Y,146
Detail,DIAGNOSIS_CODE_10_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.   (2300, HI09-1, HI*BF or HI*ABF)",Claim,,,N,147
Detail,DIAGNOSIS_CODE_10,"The value in this field represents the Other Diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  (2300, HI09-2, HI*BF or HI*ABF)",Claim,,,Y,148
Detail,DIAGNOSIS_CODE_10_POA,"The value in this field represents the Present on Admission Indicator for DIAGNOSIS_CODE_10.  See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300, HI09-9, HI*BF or HI*ABF)",Claim,,,Y,149
Detail,DIAGNOSIS_CODE_11_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.  (2300, HI10-1, HI*BF or HI*ABF)",Claim,,,N,150
Detail,DIAGNOSIS_CODE_11,"The value in this field represents the Principal Diagnosis which is the principal condition established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  (2300, HI10-2, HI*BF or HI*ABF)",Claim,,,Y,151
Detail,DIAGNOSIS_CODE_11_POA,"The value in this field represents the Present on Admission Indicator for DIAGNOSIS_CODE_11.  See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300, HI10-9, HI*BF or HI*ABF)",Claim,,,Y,152
Detail,DIAGNOSIS_CODE_12_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.   (2300, HI11-1, HI*BF or HI*ABF)",Claim,,,N,153
Detail,DIAGNOSIS_CODE_12,"The value in this field represents the Other Diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  (2300, HI11-2, HI*BF or HI*ABF)",Claim,,,Y,154
Detail,DIAGNOSIS_CODE_12_POA,"The value in this field represents the Present on Admission Indicator for DIAGNOSIS_CODE_12.   See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300, HI11-9, HI*BF or HI*ABF)",Claim,,,Y,155
Detail,DIAGNOSIS_CODE_13_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.   (2300, HI12-1, HI*BF or HI*ABF)",Claim,,,N,156
Detail,DIAGNOSIS_CODE_13,"The value in this field represents the Other Diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  (2300, HI12-2, HI*BF or HI*ABF)",Claim,,,Y,157
Detail,DIAGNOSIS_CODE_13_POA,"The value in this field represents the Present on Admission Indicator for DIAGNOSIS_CODE_13.   See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300, HI12-9, HI*BF or HI*ABF)",Claim,,,Y,158
Detail,DIAGNOSIS_CODE_14_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.   (2300,  HI*BF or HI*ABF Segment Repeat)",Claim,,,N,159
Detail,DIAGNOSIS_CODE_14,"The value in this field represents the Other Diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  (2300, HI*BF or HI*ABF Segment Repeat)",Claim,,,Y,160
Detail,DIAGNOSIS_CODE_14_POA,"The value in this field represents the Present on Admission Indicator for DIAGNOSIS_CODE_14.    See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300,  HI*BF or HI*ABF Segment Repeat)",Claim,,,Y,161
Detail,DIAGNOSIS_CODE_15_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.   (2300,  HI*BF or HI*ABF Segment Repeat)",Claim,,,N,162
Detail,DIAGNOSIS_CODE_15,"The value in this field represents the Other Diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  (2300, HI*BF or HI*ABF Segment Repeat)",Claim,,,Y,163
Detail,DIAGNOSIS_CODE_15_POA,"The value in this field represents the Present on Admission Indicator for DIAGNOSIS_CODE_15.   See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300,  HI*BF or HI*ABF Segment Repeat)",Claim,,,Y,164
Detail,DIAGNOSIS_CODE_16_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.   (2300,  HI*BF or HI*ABF Segment Repeat)",Claim,,,N,165
Detail,DIAGNOSIS_CODE_16,"The value in this field represents the Other Diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  (2300, HI*BF or HI*ABF Segment Repeat)",Claim,,,Y,166
Detail,DIAGNOSIS_CODE_16_POA,"The value in this field represents the Present on Admission Indicator for DIAGNOSIS_CODE_16.   See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300,  HI*BF or HI*ABF Segment Repeat)",Claim,,,Y,167
Detail,DIAGNOSIS_CODE_17_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.   (2300,  HI*BF or HI*ABF Segment Repeat)",Claim,,,N,168
Detail,DIAGNOSIS_CODE_17,"The value in this field represents the Other Diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  (2300, HI*BF or HI*ABF Segment Repeat)",Claim,,,Y,169
Detail,DIAGNOSIS_CODE_17_POA,"The value in this field represents the Present on Admission Indicator for DIAGNOSIS_CODE_17.  See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300,  HI*BF or HI*ABF Segment Repeat)",Claim,,,Y,170
Detail,DIAGNOSIS_CODE_18_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.   (2300,  HI*BF or HI*ABF Segment Repeat)",Claim,,,N,171
Detail,DIAGNOSIS_CODE_18,"The value in this field represents the Other Diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  (2300, HI*BF or HI*ABF Segment Repeat)",Claim,,,Y,172
Detail,DIAGNOSIS_CODE_18_POA,"The value in this field represents the Present on Admission Indicator for DIAGNOSIS_CODE_18.   See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300,  HI*BF or HI*ABF Segment Repeat)",Claim,,,Y,173
Detail,DIAGNOSIS_CODE_19_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.   (2300,  HI*BF or HI*ABF Segment Repeat)",Claim,,,N,174
Detail,DIAGNOSIS_CODE_19,"The value in this field represents the Other Diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  (2300, HI*BF or HI*ABF Segment Repeat)",Claim,,,Y,175
Detail,DIAGNOSIS_CODE_19_POA,"The value in this field represents the Present on Admission Indicator for DIAGNOSIS_CODE_19.   See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300,  HI*BF or HI*ABF Segment Repeat)",Claim,,,Y,176
Detail,DIAGNOSIS_CODE_20_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.   (2300,  HI*BF or HI*ABF Segment Repeat)",Claim,,,N,177
Detail,DIAGNOSIS_CODE_20,"The value in this field represents the Other Diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  (2300, HI*BF or HI*ABF Segment Repeat)",Claim,,,Y,178
Detail,DIAGNOSIS_CODE_20_POA,"The value in this field represents the Present on Admission Indicator for DIAGNOSIS_CODE_20.   See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300,  HI*BF or HI*ABF Segment Repeat)",Claim,,,Y,179
Detail,DIAGNOSIS_CODE_21_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.   (2300,  HI*BF or HI*ABF Segment Repeat)",Claim,,,N,180
Detail,DIAGNOSIS_CODE_21,"The value in this field represents the Other Diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  (2300, HI*BF or HI*ABF Segment Repeat)",Claim,,,Y,181
Detail,DIAGNOSIS_CODE_21_POA,"The value in this field represents the Present on Admission Indicator for DIAGNOSIS_CODE_21.   See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300,  HI*BF or HI*ABF Segment Repeat)",Claim,,,Y,182
Detail,DIAGNOSIS_CODE_22_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.   (2300,  HI*BF or HI*ABF Segment Repeat)",Claim,,,N,183
Detail,DIAGNOSIS_CODE_22,"The value in this field represents the Other Diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  (2300, HI*BF or HI*ABF Segment Repeat)",Claim,,,Y,184
Detail,DIAGNOSIS_CODE_22_POA,"The value in this field represents the Present on Admission Indicator for DIAGNOSIS_CODE_22.   See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300,  HI*BF or HI*ABF Segment Repeat)",Claim,,,Y,185
Detail,DIAGNOSIS_CODE_23_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.   (2300,  HI*BF or HI*ABF Segment Repeat)",Claim,,,N,186
Detail,DIAGNOSIS_CODE_23,"The value in this field represents the Other Diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  (2300, HI*BF or HI*ABF Segment Repeat)",Claim,,,Y,187
Detail,DIAGNOSIS_CODE_23_POA,"The value in this field represents the Present on Admission Indicator for DIAGNOSIS_CODE_23.   See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300,  HI*BF or HI*ABF Segment Repeat)",Claim,,,Y,188
Detail,DIAGNOSIS_CODE_24_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.   (2300,  HI*BF or HI*ABF Segment Repeat)",Claim,,,N,189
Detail,DIAGNOSIS_CODE_24,"The value in this field represents the Other Diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  (2300, HI*BF or HI*ABF Segment Repeat)",Claim,,,Y,190
Detail,DIAGNOSIS_CODE_24_POA,"The value in this field represents the Present on Admission Indicator for DIAGNOSIS_CODE_24.   See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300,  HI*BF or HI*ABF Segment Repeat)",Claim,,,Y,191
Detail,DIAGNOSIS_CODE_25_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.   (2300,  HI*BF or HI*ABF Segment Repeat)",Claim,,,N,192
Detail,DIAGNOSIS_CODE_25,"The value in this field represents the Other Diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  (2300, HI*BF or HI*ABF Segment Repeat)",Claim,,,Y,193
Detail,DIAGNOSIS_CODE_25_POA,"The value in this field represents the Present on Admission Indicator for DIAGNOSIS_CODE_25.   See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300,  HI*BF or HI*ABF Segment Repeat)",Claim,,,Y,194
Detail,ADMITTING_DIAGNOSIS_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.  Required when ADMITTING_DIAGNOSIS is submitted.  (2300, HI01-1, HI*BJ or HI*ABJ)",Claim,,,N,195
Detail,ADMITTING_DIAGNOSIS,"The value in this field represents the Admitting Diagnosis which is the reason presented for the patient to be registered at the inpatient facility.  (2300, HI01-2, HI*BJ or HI*ABJ)",Claim,,,Y,196
Detail,EXTERNAL_CAUSE_OF_INJURY_01_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.  (2300, HI01-1, HI*BN or HI*ABN)",Claim,,,N,197
Detail,EXTERNAL_CAUSE_OF_INJURY_01,"The value in this field represents the External Cause of Injury Diagnosis.  Previously referred to as E_CODE_DIAGNOSIS_1.  (2300, HI01-2, HI*BN or HI*ABN)",Claim,,,Y,198
Detail,EXTERNAL_CAUSE_OF_INJURY_01_POA,"The value in this field represents the Present on Admission Indicator for the External Cause of Injury 1 Diagnosis.   See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300, HI01-9, HI*BN or HI*ABN)",Claim,,,Y,199
Detail,EXTERNAL_CAUSE_OF_INJURY_02_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.  (2300, HI02-1, HI*BN or HI*ABN)",Claim,,,N,200
Detail,EXTERNAL_CAUSE_OF_INJURY_02,"The value in this field represents the External Cause of Injury Diagnosis.  Previously referred to as E_CODE_DIAGNOSIS_2.  (2300, HI02-2, HI*BN or HI*ABN)",Claim,,,Y,201
Detail,EXTERNAL_CAUSE_OF_INJURY_02_POA,"The value in this field represents the Present on Admission Indicator for the External Cause of Injury 2 Diagnosis.   See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300, HI02-9, HI*BN or HI*ABN)",Claim,,,Y,202
Detail,EXTERNAL_CAUSE_OF_INJURY_03_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.  (2300, HI03-1, HI*BN or HI*ABN)",Claim,,,N,203
Detail,EXTERNAL_CAUSE_OF_INJURY_03,"The value in this field represents the External Cause of Injury Diagnosis.  Previously referred to as E_CODE_DIAGNOSIS_3.  (2300, HI03-2, HI*BN or HI*ABN)",Claim,,,Y,204
Detail,EXTERNAL_CAUSE_OF_INJURY_03_POA,"The value in this field represents the Present on Admission Indicator for the External Cause of Injury 3 Diagnosis.   See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300, HI03-9, HI*BN or HI*ABN)",Claim,,,Y,205
Detail,EXTERNAL_CAUSE_OF_INJURY_04_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.  (2300, HI04-1, HI*BN or HI*ABN)",Claim,,,N,206
Detail,EXTERNAL_CAUSE_OF_INJURY_04,"The value in this field represents the External Cause of Injury Diagnosis.  This field was added in this version to be consistent with the CMS X12 5010 data set.  (2300, HI04-2, HI*BN or HI*ABN)",Claim,,,Y,207
Detail,EXTERNAL_CAUSE_OF_INJURY_04_POA,"The value in this field represents the Present on Admission Indicator for the External Cause of Injury 4 Diagnosis.   See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300, HI04-9, HI*BN or HI*ABN)",Claim,,,Y,208
Detail,EXTERNAL_CAUSE_OF_INJURY_05_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.  (2300, HI05-1, HI*BN or HI*ABN)",Claim,,,N,209
Detail,EXTERNAL_CAUSE_OF_INJURY_05,"The value in this field represents the External Cause of Injury Diagnosis.  This field was added in this version to be consistent with the CMS X12 5010 data set.  (2300, HI05-2, HI*BN or HI*ABN)",Claim,,,Y,210
Detail,EXTERNAL_CAUSE_OF_INJURY_05_POA,"The value in this field represents the Present on Admission Indicator for the External Cause of Injury 5 Diagnosis.   See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300, HI05-9, HI*BN or HI*ABN)",Claim,,,Y,211
Detail,EXTERNAL_CAUSE_OF_INJURY_06_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.  (2300, HI06-1, HI*BN or HI*ABN)",Claim,,,N,212
Detail,EXTERNAL_CAUSE_OF_INJURY_06,"The value in this field represents the External Cause of Injury Diagnosis.  This field was added in this version to be consistent with the CMS X12 5010 data set.  (2300, HI06-2, HI*BN or HI*ABN)",Claim,,,Y,213
Detail,EXTERNAL_CAUSE_OF_INJURY_06_POA,"The value in this field represents the Present on Admission Indicator for the External Cause of Injury 6 Diagnosis.   See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300, HI06-9, HI*BN or HI*ABN)",Claim,,,Y,214
Detail,EXTERNAL_CAUSE_OF_INJURY_07_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.  (2300, HI07-1, HI*BN or HI*ABN)",Claim,,,N,215
Detail,EXTERNAL_CAUSE_OF_INJURY_07,"The value in this field represents the External Cause of Injury Diagnosis.  This field was added in this version to be consistent with the CMS X12 5010 data set.  (2300, HI07-2, HI*BN or HI*ABN)",Claim,,,Y,216
Detail,EXTERNAL_CAUSE_OF_INJURY_07_POA,"The value in this field represents the Present on Admission Indicator for the External Cause of Injury 7 Diagnosis.   See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300, HI07-9, HI*BN or HI*ABN)",Claim,,,Y,217
Detail,EXTERNAL_CAUSE_OF_INJURY_08_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.  (2300, HI08-1, HI*BN or HI*ABN)",Claim,,,N,218
Detail,EXTERNAL_CAUSE_OF_INJURY_08,"The value in this field represents the External Cause of Injury Diagnosis.  This field was added in this version to be consistent with the CMS X12 5010 data set.  (2300, HI08-2, HI*BN or HI*ABN)",Claim,,,Y,219
Detail,EXTERNAL_CAUSE_OF_INJURY_08_POA,"The value in this field represents the Present on Admission Indicator for the External Cause of Injury 8 Diagnosis.   See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300, HI08-9, HI*BN or HI*ABN)",Claim,,,Y,220
Detail,EXTERNAL_CAUSE_OF_INJURY_09_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.  (2300, HI09-1, HI*BN or HI*ABN)",Claim,,,N,221
Detail,EXTERNAL_CAUSE_OF_INJURY_09,"The value in this field represents the External Cause of Injury Diagnosis.  This field was added in this version to be consistent with the CMS X12 5010 data set.  (2300, HI09-2, HI*BN or HI*ABN)",Claim,,,Y,222
Detail,EXTERNAL_CAUSE_OF_INJURY_09_POA,"The value in this field represents the Present on Admission Indicator for the External Cause of Injury 9 Diagnosis.    See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300, HI09-9, HI*BN or HI*ABN)",Claim,,,Y,223
Detail,EXTERNAL_CAUSE_OF_INJURY_10_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.   (2300, HI10-1, HI*BN or HI*ABN)",Claim,,,N,224
Detail,EXTERNAL_CAUSE_OF_INJURY_10,"The value in this field represents the External Cause of Injury Diagnosis.  This field was added in this version to be consistent with the CMS X12 5010 data set.  (2300, HI10-2, HI*BN or HI*ABN)",Claim,,,Y,225
Detail,EXTERNAL_CAUSE_OF_INJURY_10_POA,"The value in this field represents the Present on Admission Indicator for the External Cause of Injury 10 Diagnosis.   See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300, HI10-9, HI*BN or HI*ABN)",Claim,,,Y,226
Detail,EXTERNAL_CAUSE_OF_INJURY_11_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.   (2300, HI11-1, HI*BN or HI*ABN)",Claim,,,N,227
Detail,EXTERNAL_CAUSE_OF_INJURY_11,"The value in this field represents the External Cause of Injury Diagnosis.  This field was added in this version to be consistent with the CMS X12 5010 data set.  (2300, HI11-2, HI*BN or HI*ABN)",Claim,,,Y,228
Detail,EXTERNAL_CAUSE_OF_INJURY_11_POA,"The value in this field represents the Present on Admission Indicator for the External Cause of Injury 11 Diagnosis.   See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300, HI11-9, HI*BN or HI*ABN)",Claim,,,Y,229
Detail,EXTERNAL_CAUSE_OF_INJURY_12_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.   (2300, HI12-1, HI*BN or HI*ABN)",Claim,,,N,230
Detail,EXTERNAL_CAUSE_OF_INJURY_12,"The value in this field represents the External Cause of Injury Diagnosis.  This field was added in this version to be consistent with the CMS X12 5010 data set.  (2300, HI12-2, HI*BN or HI*ABN)",Claim,,,Y,231
Detail,EXTERNAL_CAUSE_OF_INJURY_12_POA,"The value in this field represents the Present on Admission Indicator for the External Cause of Injury 12 Diagnosis.  See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300, HI12-9, HI*BN or HI*ABN)",Claim,,,Y,232
Detail,PATIENT_REASON_FOR_VISIT_01_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.  (2300, HI01-1, HI*PR or HI*APR)",Claim,,,N,233
Detail,PATIENT_REASON_FOR_VISIT_01,"The value in this field represents the Patient’s Reason For Visit 1. (2300, HI01-2, HI*PR or HI*APR)",Claim,,,Y,234
Detail,PATIENT_REASON_FOR_VISIT_02_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.   (2300, HI02-1, HI*PR or HI*APR)",Claim,,,N,235
Detail,PATIENT_REASON_FOR_VISIT_02,"The value in this field represents the Patient’s Reason For Visit 2.  (2300, HI02-2, HI*PR or HI*APR)",Claim,,,Y,236
Detail,PATIENT_REASON_FOR_VISIT_03_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.   (2300, HI03-1, HI*PR or HI*APR)",Claim,,,N,237
Detail,PATIENT_REASON_FOR_VISIT_03,"The value in this field represents the Patient’s Reason For Visit 3.  (2300, HI03-2, HI*PR or HI*APR)",Claim,,,Y,238
Detail,PRINCIPAL_PROCEDURE_QUAL,"The value in this field represents a qualifier to show whether the principal procedure code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 procedure codes and '9' for ICD-9 procedure codes.  (2300, HI01-1, HI*BR or HI*BBR)",Claim,,,N,239
Detail,PRINCIPAL_PROCEDURE,"The value in this field represents the primary procedure code submitted by the provider for this claim.  (2300, HI01-2, HI*BR or HI*BBR)",Claim,,,Y,240
Detail,PRINCIPAL_PROCEDURE_DATE,"The value in this field represents the date of execution of the primary procedure code submitted by the provider for this claim.  (2300, HI01-4, HI*BR or HI*BBR)",Claim,,,Y,241
Detail,PROCEDURE_02_QUAL,"The value in this field represents a qualifier to show whether the additional procedure code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 procedure codes and '9' for ICD-9 procedure codes.  (2300, HI01-1, HI*BQ or HI*BBQ)",Claim,,,N,242
Detail,PROCEDURE_02,"The value in this field represents the additional procedure code submitted by the provider for this claim.  (2300, HI01-2, HI*BQ or HI*BBQ)",Claim,,,Y,243
Detail,PROCEDURE_02_DATE,"The value in this field represents the date of execution of the procedure code submitted by the provider for this claim.  (2300, HI01-4, HI*BQ or HI*BBQ)",Claim,,,Y,244
Detail,PROCEDURE_03_QUAL,"The value in this field represents a qualifier to show whether the additional procedure code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 procedure codes and '9' for ICD-9 procedure codes.  (2300, HI01-1, HI*BQ or HI*BBQ)",Claim,,,N,245
Detail,PROCEDURE_03,"The value in this field represents the additional procedure code submitted by the provider for this claim.  (2300, HI01-2, HI*BQ or HI*BBQ)",Claim,,,Y,246
Detail,PROCEDURE_03_DATE,"The value in this field represents the date of execution of the procedure code submitted by the provider for this claim.  (2300, HI01-4, HI*BQ or HI*BBQ)",Claim,,,Y,247
Detail,PROCEDURE_04_QUAL,"The value in this field represents a qualifier to show whether the additional procedure code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 procedure codes and '9' for ICD-9 procedure codes.  (2300, HI02-1, HI*BQ or HI*BBQ)",Claim,,,N,248
Detail,PROCEDURE_04,"The value in this field represents the additional procedure code submitted by the provider for this claim.  (2300, HI02-2, HI*BQ or HI*BBQ)",Claim,,,Y,249
Detail,PROCEDURE_04_DATE,"The value in this field represents the date of execution of the procedure code submitted by the provider for this claim.  (2300, HI02-4, HI*BQ or HI*BBQ)",Claim,,,Y,250
Detail,PROCEDURE_05_QUAL,"The value in this field represents a qualifier to show whether the additional procedure code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 procedure codes and '9' for ICD-9 procedure codes.  (2300, HI03-1, HI*BQ or HI*BBQ)",Claim,,,N,251
Detail,PROCEDURE_05,"The value in this field represents the additional procedure code submitted by the provider for this claim.  (2300, HI03-2, HI*BQ or HI*BBQ)",Claim,,,Y,252
Detail,PROCEDURE_05_DATE,"The value in this field represents the date of execution of the procedure code submitted by the provider for this claim.  (2300, HI03-4, HI*BQ or HI*BBQ)",Claim,,,Y,253
Detail,PROCEDURE_06_QUAL,"The value in this field represents a qualifier to show whether the additional procedure code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 procedure codes and '9' for ICD-9 procedure codes.  (2300, HI04-1, HI*BQ or HI*BBQ)",Claim,,,N,254
Detail,PROCEDURE_06,"The value in this field represents the additional procedure code submitted by the provider for this claim.  (2300, HI04-2, HI*BQ or HI*BBQ)",Claim,,,Y,255
Detail,PROCEDURE_06_DATE,"The value in this field represents the date of execution of the procedure code submitted by the provider for this claim.  (2300, HI04-4, HI*BQ or HI*BBQ)",Claim,,,Y,256
Detail,PROCEDURE_07_QUAL,"The value in this field represents a qualifier to show whether the additional procedure code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 procedure codes and '9' for ICD-9 procedure codes.  (2300, HI05-1, HI*BQ or HI*BBQ)",Claim,,,N,257
Detail,PROCEDURE_07,"The value in this field represents the additional procedure code submitted by the provider for this claim.  (2300, HI05-2, HI*BQ or HI*BBQ)",Claim,,,Y,258
Detail,PROCEDURE_07_DATE,"The value in this field represents the date of execution of the procedure code submitted by the provider for this claim.  (2300, HI05-4, HI*BQ or HI*BBQ)",Claim,,,Y,259
Detail,PROCEDURE_08_QUAL,"The value in this field represents a qualifier to show whether the additional procedure code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 procedure codes and '9' for ICD-9 procedure codes.  (2300, HI06-1, HI*BQ or HI*BBQ)",Claim,,,N,260
Detail,PROCEDURE_08,"The value in this field represents the additional procedure code submitted by the provider for this claim.  (2300, HI06-2, HI*BQ or HI*BBQ)",Claim,,,Y,261
Detail,PROCEDURE_08_DATE,"The value in this field represents the date of execution of the procedure code submitted by the provider for this claim.  (2300, HI06-4, HI*BQ or HI*BBQ)",Claim,,,Y,262
Detail,PROCEDURE_09_QUAL,"The value in this field represents a qualifier to show whether the additional procedure code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 procedure codes and '9' for ICD-9 procedure codes.  (2300, HI07-1, HI*BQ or HI*BBQ)",Claim,,,N,263
Detail,PROCEDURE_09,"The value in this field represents the additional procedure code submitted by the provider for this claim.  (2300, HI07-2, HI*BQ or HI*BBQ)",Claim,,,Y,264
Detail,PROCEDURE_09_DATE,"The value in this field represents the date of execution of the procedure code submitted by the provider for this claim.  (2300, HI07-4, HI*BQ or HI*BBQ)",Claim,,,Y,265
Detail,PROCEDURE_10_QUAL,"The value in this field represents a qualifier to show whether the additional procedure code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 procedure codes and '9' for ICD-9 procedure codes.  (2300, HI08-1, HI*BQ or HI*BBQ)",Claim,,,N,266
Detail,PROCEDURE_10,"The value in this field represents the additional procedure code submitted by the provider for this claim.  (2300, HI08-2, HI*BQ or HI*BBQ)",Claim,,,Y,267
Detail,PROCEDURE_10_DATE,"The value in this field represents the date of execution of the procedure code submitted by the provider for this claim.  (2300, HI08-4, HI*BQ or HI*BBQ)",Claim,,,Y,268
Detail,PROCEDURE_11_QUAL,"The value in this field represents a qualifier to show whether the additional procedure code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 procedure codes and '9' for ICD-9 procedure codes.  (2300, HI09-1, HI*BQ or HI*BBQ)",Claim,,,N,269
Detail,PROCEDURE_11,"The value in this field represents the additional procedure code submitted by the provider for this claim.  (2300, HI09-2, HI*BQ or HI*BBQ)",Claim,,,Y,270
Detail,PROCEDURE_11_DATE,"The value in this field represents the date of execution of the procedure code submitted by the provider for this claim.  (2300, HI09-4, HI*BQ or HI*BBQ)",Claim,,,Y,271
Detail,PROCEDURE_12_QUAL,"The value in this field represents a qualifier to show whether the additional procedure code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 procedure codes and '9' for ICD-9 procedure codes.  (2300, HI10-1, HI*BQ or HI*BBQ)",Claim,,,N,272
Detail,PROCEDURE_12,"The value in this field represents the additional procedure code submitted by the provider for this claim.  (2300, HI10-2, HI*BQ or HI*BBQ)",Claim,,,Y,273
Detail,PROCEDURE_12_DATE,"The value in this field represents the date of execution of the procedure code submitted by the provider for this claim.  (2300, HI10-4, HI*BQ or HI*BBQ)",Claim,,,Y,274
Detail,PROCEDURE_13_QUAL,"The value in this field represents a qualifier to show whether the additional procedure code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 procedure codes and '9' for ICD-9 procedure codes.  (2300, HI11-1, HI*BQ or HI*BBQ)",Claim,,,N,275
Detail,PROCEDURE_13,"The value in this field represents the additional procedure code submitted by the provider for this claim.  (2300, HI11-2, HI*BQ or HI*BBQ)",Claim,,,Y,276
Detail,PROCEDURE_13_DATE,"The value in this field represents the date of execution of the procedure code submitted by the provider for this claim.  (2300, HI11-4, HI*BQ or HI*BBQ)",Claim,,,Y,277
Detail,PROCEDURE_14_QUAL,"The value in this field represents a qualifier to show whether the additional procedure code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 procedure codes and '9' for ICD-9 procedure codes.  (2300, HI12-1, HI*BQ or HI*BBQ)",Claim,,,N,278
Detail,PROCEDURE_14,"The value in this field represents the additional procedure code submitted by the provider for this claim.  (2300, HI12-2, HI*BQ or HI*BBQ)",Claim,,,Y,279
Detail,PROCEDURE_14_DATE,"The value in this field represents the date of execution of the procedure code submitted by the provider for this claim.  (2300, HI12-4, HI*BQ or HI*BBQ)",Claim,,,Y,280
Detail,PROCEDURE_15_QUAL,"The value in this field represents a qualifier to show whether the additional procedure code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 procedure codes and '9' for ICD-9 procedure codes.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,,,N,281
Detail,PROCEDURE_15,"The value in this field represents the additional procedure code submitted by the provider for this claim.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,,,Y,282
Detail,PROCEDURE_15_DATE,"The value in this field represents the date of execution of the procedure code submitted by the provider for this claim.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,,,Y,283
Detail,PROCEDURE_16_QUAL,"The value in this field represents a qualifier to show whether the additional procedure code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 procedure codes and '9' for ICD-9 procedure codes.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,,,N,284
Detail,PROCEDURE_16,"The value in this field represents the additional procedure code submitted by the provider for this claim.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,,,Y,285
Detail,PROCEDURE_16_DATE,"The value in this field represents the date of execution of the procedure code submitted by the provider for this claim.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,,,Y,286
Detail,PROCEDURE_17_QUAL,"The value in this field represents a qualifier to show whether the additional procedure code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 procedure codes and '9' for ICD-9 procedure codes.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,,,N,287
Detail,PROCEDURE_17,"The value in this field represents the additional procedure code submitted by the provider for this claim.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,,,Y,288
Detail,PROCEDURE_17_DATE,"The value in this field represents the date of execution of the procedure code submitted by the provider for this claim.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,,,Y,289
Detail,PROCEDURE_18_QUAL,"The value in this field represents a qualifier to show whether the additional procedure code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 procedure codes and '9' for ICD-9 procedure codes.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,,,N,290
Detail,PROCEDURE_18,"The value in this field represents the additional procedure code submitted by the provider for this claim.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,,,Y,291
Detail,PROCEDURE_18_DATE,"The value in this field represents the date of execution of the procedure code submitted by the provider for this claim.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,,,Y,292
Detail,PROCEDURE_19_QUAL,"The value in this field represents a qualifier to show whether the additional procedure code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 procedure codes and '9' for ICD-9 procedure codes.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,,,N,293
Detail,PROCEDURE_19,"The value in this field represents the additional procedure code submitted by the provider for this claim.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,,,Y,294
Detail,PROCEDURE_19_DATE,"The value in this field represents the date of execution of the procedure code submitted by the provider for this claim.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,,,Y,295
Detail,PROCEDURE_20_QUAL,"The value in this field represents a qualifier to show whether the additional procedure code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 procedure codes and '9' for ICD-9 procedure codes.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,,,N,296
Detail,PROCEDURE_20,"The value in this field represents the additional procedure code submitted by the provider for this claim.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,,,Y,297
Detail,PROCEDURE_20_DATE,"The value in this field represents the date of execution of the procedure code submitted by the provider for this claim.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,,,Y,298
Detail,PROCEDURE_21_QUAL,"The value in this field represents a qualifier to show whether the additional procedure code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 procedure codes and '9' for ICD-9 procedure codes.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,,,N,299
Detail,PROCEDURE_21,"The value in this field represents the additional procedure code submitted by the provider for this claim.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,,,Y,300
Detail,PROCEDURE_21_DATE,"The value in this field represents the date of execution of the procedure code submitted by the provider for this claim.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,,,Y,301
Detail,PROCEDURE_22_QUAL,"The value in this field represents a qualifier to show whether the additional procedure code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 procedure codes and '9' for ICD-9 procedure codes.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,,,N,302
Detail,PROCEDURE_22,"The value in this field represents the additional procedure code submitted by the provider for this claim.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,,,Y,303
Detail,PROCEDURE_22_DATE,"The value in this field represents the date of execution of the procedure code submitted by the provider for this claim.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,,,Y,304
Detail,PROCEDURE_23_QUAL,"The value in this field represents a qualifier to show whether the additional procedure code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 procedure codes and '9' for ICD-9 procedure codes.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,,,N,305
Detail,PROCEDURE_23,"The value in this field represents the additional procedure code submitted by the provider for this claim.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,,,Y,306
Detail,PROCEDURE_23_DATE,"The value in this field represents the date of execution of the procedure code submitted by the provider for this claim.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,,,Y,307
Detail,PROCEDURE_24_QUAL,"The value in this field represents a qualifier to show whether the additional procedure code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 procedure codes and '9' for ICD-9 procedure codes.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,,,N,308
Detail,PROCEDURE_24,"The value in this field represents the additional procedure code submitted by the provider for this claim.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,,,Y,309
Detail,PROCEDURE_24_DATE,"The value in this field represents the date of execution of the procedure code submitted by the provider for this claim.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,,,Y,310
Detail,PROCEDURE_25_QUAL,"The value in this field represents a qualifier to show whether the additional procedure code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 procedure codes and '9' for ICD-9 procedure codes.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,,,N,311
Detail,PROCEDURE_25,"The value in this field represents the additional procedure code submitted by the provider for this claim.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,,,Y,312
Detail,PROCEDURE_25_DATE,"The value in this field represents the date of execution of the procedure code submitted by the provider for this claim.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,,,Y,313
Detail,INSURANCE_LOB,"The value in this field represents the member’s line of business code. The client’s values are mapped to a table that identifies line of business. Examples are: Medicare, Medicaid, Commercial, Duals, BlueCard, etc. Required for CV.",Line,,,N,314
Detail,INSURANCE_LOB_SUBTYPE,"This field further splits the LOB into the type of plan. Examples are: HMO, PPO, POS, EPO, etc.",Line,,,N,315
Detail,BLUE_CARD_INDICATOR,"When INSURANCE_LOB is BlueCard, this field represents BlueCard information provided by the client. Valid values are:
0 = Non-BlueCard
1 = ITS Home
2 = ITS Host",Claim,,,N,316
Detail,ITS_HOME_STATE,The value in this field represents the state of the plan that owns the member's coverage.,Claim,,,N,317
Detail,ITS_HOST_STATE,The value in this field represents the state of the provider's local Blue Cross Blue Shield plan where services were rendered.,Claim,,,N,318
Detail,ITS_SERIAL_NUM,The value in this field represents the Standard Claims Collection Facility (SCCF) number from the ITS system.  This is the unique identifier in the BlueSquared BlueCard claim processing system.,Claim,,,N,319
Detail,MEDICARE_PROVIDER_ID,"Number that uniquely identifies a healthcare provider or facility and is used on billing forms submitted to Medicare (UPIN, OSCAR number, NSC number). It is used for pricing through FHCP.",Claim,,,N,320
Detail,MEDICAID_PROVIDER_ID,A number that uniquely identifies a healthcare provider or facility and is used on billing forms submitted to Medicaid.,Claim,,,N,321
Detail,RENDERING_PROVIDER_ID,"The value in this field represents the rendering provider when the Rendering Provider is different than the Attending Provider. This number is the identification number unique to the provider or facility in the client’s system. When the Rendering provider is the same as the Attending provider, please provide the Attending Provider's information here. Required for CV.  (2310D, REF02)",Claim,,,N,322
Detail,RENDERING_TAXGROUP_ID,"The value in this field represents the rendering provider's tax identification number when it is different than the Attending provider.  When the Rendering provider is the same as the Attending provider, please provide the Attending Provider's information here. Required for CV. (2310D, REF02, REF*EI)",Claim,,,N,323
Detail,RENDERING_NPI,"The value in this field represents the CMS National Provider Identifier (NPI) for the rendering provider when it is different than the Attending provider.  When the Rendering provider is the same as the Attending provider, please provide the Attending Provider's information here. Default to spaces if value is not available. Required for CV. (2310D, NM109)",Claim,,,N,324
Detail,RENDERING_STATE_LICENSE,"The value in this field represents the Sate License number for the rendering provider providing this service when it is different than the Attending provider.  A non-zero value is required.  When the Rendering provider is the same as the Attending provider, please provide the Attending Provider's information here. (2310D, REF02)",Claim,,,N,325
Detail,RENDERING_SPECIALTY_CODE,"The value in this field represents the specialty of the rendering provider or facility, as defined in the client's claim system.  When the Rendering provider is the same as the Attending provider, please provide the Attending Provider's information here. Required for CV.",Claim,,,N,326
Detail,RENDERING_TAXONOMY_CODE,Industry standard taxonomy code of the rendering provider used by CMS and sourced by the National Uniform Claim Committee. A list of taxonomy codes is available via http://www.wpc-edi.com/reference/codelists/healthcare/health-care-provider-taxonomy-code-set/. Required for CV.,Claim,,,N,327
Detail,RENDERING_ENTITY_TYPE,"Expected Values are:  'P' = Person.  (2310D, NM101)",Claim,,,N,328
Detail,RENDERING_LAST_NAME,"The value in this field represents the rendering provider’s last name when it is different than the Attending provider.  When the Rendering provider is the same as the Attending provider, please provide the Attending Provider's information here. Required for CV. (2310D, NM103)",Claim,,,N,329
Detail,RENDERING_FIRST_NAME,"The value in this field represents the rendering provider’s first name when it is different than the Attending provider. When the Rendering provider is the same as the Attending provider, please provide the Attending Provider's information here. Required for CV.  (2310D, NM104)",Claim,,,N,330
Detail,RENDERING_MIDDLE_NAME,"The value in this field represents the rendering provider’s middle name when it is different than the Attending provider. (2310D, NM105)",Claim,,,N,331
Detail,RENDERING_NAME_SUFFIX,"The value in this field represents the rendering provider's suffix, as required, when it is different than the Attending provider.  When the Rendering provider is the same as the Attending provider, please provide the Attending Provider's information here. (2310D, NM107)",Claim,,,N,332
Detail,RENDERING_ADDRESS_01,"The value in this field represents the first line of the rendering provider's address when it is different than the Attending provider. When the Rendering provider is the same as the Attending provider, please provide the Attending Provider's information here.",Claim,,,N,333
Detail,RENDERING_ADDRESS_02,"The value in this field represents the second line of the rendering provider's address when it is different than the Attending provider. When the Rendering provider is the same as the Attending provider, please provide the Attending Provider's information here.",Claim,,,N,334
Detail,RENDERING_CITY,"The value in this field represents the city of the rendering provider's address when it is different than the Attending provider.  When the Rendering provider is the same as the Attending provider, please provide the Attending Provider's information here.",Claim,,,N,335
Detail,RENDERING_STATE,"The value in this field represents the state of the rendering provider's address when it is different than the Attending provider. When the Rendering provider is the same as the Attending provider, please provide the Attending Provider's information here.   Required for CV.",Claim,,,N,336
Detail,RENDERING_ZIP,"The value in this field represents the postal ZIP code for the rendering provider when it is different than the Attending provider.  The value is the basic five digit ZIP code. When the Rendering provider is the same as the Attending provider, please provide the Attending Provider's information here.  Required for CV.",Claim,,,N,337
Detail,RENDERING_ZIP_PLUS_FOUR,"The value in this field represents the four digit add-on code for the expanded ZIP code.  The value is four digits. When the Rendering provider is the same as the Attending provider, please provide the Attending Provider's information here.",Claim,,,N,338
Detail,RENDERING_COUNTRY,"The value in this field represents the country of the rendering provider's address when it is different than the Attending provider. When the Rendering provider is the same as the Attending provider, please provide the Attending Provider's information here.",Claim,,,N,339
Detail,RENDERING_COUNTRY_SUBDIVISION,"The value in this field represents the country subdivision code for the rendering provider's address when it is different than the Attending provider.  This is only used for international addresses. When the Rendering provider is the same as the Attending provider, please provide the Attending Provider's information here.",Claim,,,N,340
Detail,RENDERING_PHONE_COUNTRY_CODE,"This field represents the unique country code for international dialing for the rendering provider's primary phone number when it is different than the Attending provider. When the Rendering provider is the same as the Attending provider, please provide the Attending Provider's information here.",Claim,,,N,341
Detail,RENDERING_PHONE,"The value in this field represents the rendering provider's telephone number when it is different than the Attending provider. When the Rendering provider is the same as the Attending provider, please provide the Attending Provider's information here.",Claim,,,N,342
Detail,RENDERING_PHONE_EXT,"The value in this field represents the rendering provider's primary telephone extension when it is different than the Attending provider. When the Rendering provider is the same as the Attending provider, please provide the Attending Provider's information here.",Claim,,,N,343
Detail,RENDERING_ALT_PHONE_COUNTRY_CODE,This field represents the unique country code for international dialing for the rendering provider's alternate phone number when it is different than the Attending provider.,Claim,,,N,344
Detail,RENDERING_ALT_PHONE,The value in this field represents the rendering provider's alternate telephone number when it is different than the Attending provider.,Claim,,,N,345
Detail,RENDERING_ALT_PHONE_EXT,The value in this field represents the rendering provider's alternate telephone extension when it is different than the Attending provider.,Claim,,,N,346
Detail,RENDERING_FAX_COUNTRY_CODE,"This field represents the unique country code for international dialing for the rendering provider's fax number when it is different than the Attending provider.  When the Rendering provider is the same as the Attending provider, please provide the Attending Provider's information here.",Claim,,,N,347
Detail,RENDERING_FAX,"The value in this field represents the rendering provider's fax number when it is different than the Attending provider.  When the Rendering provider is the same as the Attending provider, please provide the Attending Provider's information here.",Claim,,,N,348
Detail,BILLING_PROVIDER_ID,"The value in this field represents the billing provider or facility, which is separate from where the services were rendered.  This number is the identification number unique to the provider or facility in the client’s system.  This is the same as the Billing Provider Commercial Number in the 837 transaction. Previously FACILITY_ID and the provider identifier used for processing on Institutional claims.",Claim,,,N,349
Detail,BILLING_TAXGROUP_ID,"The value in this field represents the provider’s tax identification number. This number represents the billing provider or facility.  (2010AA, REF02)  Same as TAXGROUP_ID in previous layout versions and used for processing for Institutional claims.",Claim,,,Y,350
Detail,BILLING_NPI,"The value in this field represents the CMS National Provider Identifier (NPI) for the billing provider or admitting facility providing this service. For PPM, default to spaces if value is not available.   (2010AA, NM109) (Same as NPI in previous layout versions.)",Line,,,Y,351
Detail,BILLING_STATE_LICENSE,The value in this field represents the Sate License number for the billing provider or facility associated with this service.  A non-zero value is required.  This is the same as the Billing Provider Secondary Identifier in the 837 transaction.,Claim,,,N,352
Detail,BILLING_SPECIALTY_CODE,"The value in this field represents the specialty of the billing provider or facility, as defined in the client's claim system.",Claim,,,N,353
Detail,BILLING_TAXONOMY_CODE,Industry standard taxonomy code of the billing provider used by CMS and sourced by the National Uniform Claim Committee. A list of taxonomy codes is available via http://www.wpc-edi.com/reference/codelists/healthcare/health-care-provider-taxonomy-code-set/.,Claim,,,N,354
Detail,BILLING_CURRENCY_CODE,"This field represents the ISO currency code for the billing provider and should correlate with the currency of the funds in which the provider is to be paid.  (2000A, CUR02)",Claim,,,N,355
Detail,BILLING_ENTITY_TYPE,"This field defines the entity type for the billing provider.  The billing provider is required by CMS when the billing provider is different than the rendering provider.  Expected Value is 'E', Other Entity or Facility. (2010AA, NM102)",Claim,,,N,356
Detail,BILLING_FULL_NAME,"This field represents the Billing Provider's Organizational Name.  (2010AA, NM103)",Claim,,,Y,357
Detail,BILLING_ADDRESS_01,"The value in this field represents the first line of the billing entity's address. The Billing Provider Address must be a street address. Post Office Box or Lock Box addresses are to be sent in the Pay-To Address fields, if necessary.

For CCV, this address will be used for provider mailings if no other address is provided during the implementation. (Loop ID-2010AB)  (2010AA, N301)",Claim,,,Y,358
Detail,BILLING_ADDRESS_02,"The value in this field represents the second line of the billing entity's address.

For CCV, this address will be used for provider mailings if no other address is provided during the implementation.  (2010AA, N302)",Claim,,,Y,359
Detail,BILLING_CITY,"The value in this field represents the city of the billing entity's address.

For CCV, this address will be used for provider mailings if no other address is provided during the implementation.  (2010AA, N401)",Claim,,,Y,360
Detail,BILLING_STATE,"The value in this field represents the state of the billing entity's address.

For CCV, this address will be used for provider mailings if no other address is provided during the implementation.  (2010AA, N402)",Claim,,,Y,361
Detail,BILLING_ZIP,"The value in this field represents the postal ZIP code for the billing entity.  The value is the basic five digit ZIP code.

For CCV, this address will be used for provider mailings if no other address is provided during the implementation.  (2010AA, N403)",Line,,,Y,362
Detail,BILLING_ZIP_PLUS_FOUR,"The value in this field represents the four digit add-on code for the expanded ZIP code for the billing provider.  The value is four digits.   (2010AA, N403)",Line,,,Y,363
Detail,BILLING_COUNTRY,"The value in this field represents the country of the billing entity's  address.  (2010AA, N404)",Claim,,,Y,364
Detail,BILLING_COUNTRY_SUBDIVISION,"The value in this field represents the country subdivision code for the billing entity's address.  This is only used for international addresses.(2010AA, N407)",Claim,,,N,365
Detail,BILLING_CONTACT_NAME,"Billing Provider Contact Name (23010AA, PER02)",Claim,,,N,366
Detail,BILLING_PHONE_COUNTRY_CODE,"This field represents the unique country code for international dialing for the billing entity's primary phone number.  (2010AA, PER segment)",Claim,,,N,367
Detail,BILLING_PHONE,"The value in this field represents the billing entity's telephone number.   (2010AA, PER segment)",Claim,,,N,368
Detail,BILLING_PHONE_EXT,"The value in this field represents the billing entity's primary telephone extension. (2010AA, PER segment)",Claim,,,N,369
Detail,BILLING_ALT_PHONE_COUNTRY_CODE,"This field represents the unique country code for international dialing for the billing entity's alternate phone number. (2010AA, PER segment)",Claim,,,N,370
Detail,BILLING_ALT_PHONE,"The value in this field represents the billing entity's alternate telephone number. (2010AA, PER segment)",Claim,,,N,371
Detail,BILLING_ALT_PHONE_EXT,"The value in this field represents the billing entity's alternate telephone extension.(2010AA, PER segment)",Claim,,,N,372
Detail,BILLING_FAX_COUNTRY_CODE,"This field represents the unique country code for international dialing for the billing entity's fax number. (2010AA, PER segment)",Claim,,,N,373
Detail,BILLING_FAX,"The value in this field represents the billing entity's fax number. (2010AA, PER segment)",Claim,,,N,374
Detail,CLIENT_CONTRACT_ID,The value in this field represents the client's contract identification number for the provider or  facility submitting the claim.,Line,,,N,375
Detail,CONTRACT_TYPE_CODE,"The is the contract type as defined in the 837 for Post Adjudicated Claim reporting and represents the predominant payment methodology utilized in claim payment. CMS values for this field are:
01 Diagnosis Related Group (DRG)
02 Per Diem
03 Variable Per Diem
04 Flat
05 Capitated
06 Percent
09 Other
80 APC
81 APG (Not supported at this time.)
(2300, CN101)",Line,,,N,376
Detail,CONTRACT_AMOUNT,"Contract Amount for the claim being submitted. (2300, CN102)",Line,,,N,377
Detail,CONTRACT_PCT,"Contract Percentage for the claim being submitted. (2300, CN103)",Line,,,N,378
Detail,CONTRACT_CODE,"Contract Code for the claim being submitted. (2300, CN104)",Line,,,N,379
Detail,CONTRACT_TERMS_DISC_PCT,"This field represents the terms discount percentage for the claim being submitted. (2300, CN105)",Line,,,N,380
Detail,CONTRACT_VERSION_ID,"This field represents the contract version identifier for the claim being submitted. (2300, CN106)",Line,,,N,381
Detail,LINE_SEQ,"The value in this field represents the sequential number associated to the line number on the claim. As an example: the number 0002 should be sent in this field for the second line on the claim.  Required for CV. (2400, LX01)",Line,,,Y,382
Detail,LINE_BEGIN_DOS,"The value in this field represents the date in the line level Service Date field. There must be a single line item date of service for every iteration of every revenue code on all outpatient bills. Required for CV.   (2400, DTP03, DTP*472)",Line,,,Y,383
Detail,LINE_END_DOS,"Line Date of Service. The value in this field represents the date in the line level Service Date field. Required for CV.   (2400, DTP03, DTP*472)",Line,,,Y,384
Detail,SUB_REV_CODE,"The value in this field represents the Revenue Code submitted by the provider for this service line.  (2400, SV201)",Line,,,Y,385
Detail,SUB_HCPCS,"The value in this field represents the Level1 (CPT) or Level2 (HCPCS) procedure code submitted by the provider for this service line.  (2400, SV202-2)",Line,,,Y,386
Detail,SUB_MOD_01,"The value in this field represents the first procedure code modifier billed by the provider for this service line.  (2400, SV202-3)",Line,,,Y,387
Detail,SUB_MOD_02,"The value in this field represents the second procedure code modifier billed by the provider for this service line.  (2400, SV202-4)",Line,,,Y,388
Detail,SUB_MOD_03,"The value in this field represents the third procedure code modifier billed by the provider for this service line.  (2400, SV202-5)",Line,,,Y,389
Detail,SUB_MOD_04,"The value in this field represents the fourth procedure code modifier billed by the provider for this service line.  (2400, SV202-6)",Line,,,Y,390
Detail,SUB_MOD_05,The value in this field represents the fifth procedure code modifier billed by the provider for this service line.  Note: For future use only.  Slated for upcoming version of X12 837.,Line,,,N,391
Detail,SUB_MOD_06,The value in this field represents the sixth procedure code modifier billed by the provider for this service line.  Note: For future use only.  Slated for upcoming version of X12 837.,Line,,,N,392
Detail,SUB_MOD_07,The value in this field represents the seventh procedure code modifier billed by the provider for this service line.  Note: For future use only.  Slated for upcoming version of X12 837.,Line,,,N,393
Detail,SUB_MOD_08,The value in this field represents the eighth procedure code modifier billed by the provider for this service line.  Note: For future use only.  Slated for upcoming version of X12 837.,Line,,,N,394
Detail,UNITS_TYPE,"The value in this field represents the basis for measurement for the units billed.  Expected values are:  'DA' for days, and 'UN' for units. (2400, SV204)",Line,,,N,395
Detail,SUB_UNITS,"The value in this field represents the Service Units billed by the provider for this service. (2400, SV205)",Line,,,Y,396
Detail,SUB_AMOUNT,"The value in this field represents the line level Total Charges amount billed by the provider for this service.  Required for CV.  (2400, SV203)",Line,,,Y,397
Detail,SUB_NONCOVERED_AMOUNT,"The value in this field represents the line level Non Covered Charges amount billed by the provider for this service.   (2400, SV207)",Line,,,N,398
Detail,SUB_NDC,"The value in this field represents the National Drug Code (NDC) submitted on the claim line. The NDC Code is to be submitted using the industry standard mask of 5-4-2 without dashes. This format pads the labeler, product, or package code segments of the NDC with leading zeroes wherever they are needed to result in a fixed length 5-4-2 configuration.  (2410, LIN03)",Line,,,Y,399
Detail,SUB_NDC_UNITS,"This field represents the numeric value of quantity for the drug being billed.  (2410, CTP04)",Line,,,Y,400
Detail,SUB_NDC_UNITS_TYPE,"Code specifying the units in which a value is being expressed, or manner in which a measurement has been taken.  Expected values are:
'IU' to indicate International Unit
'GR' to indicate Gram
'ME' to indicate Milligram
'ML' to indicate Milliliter
'UN' to indicate Unit
(2410, CTP05)",Line,,,Y,401
Detail,ALLOWED_REV_CODE,The value in this field represents the revenue code allowed by the client for claim system adjudication. Required for CV.,Line,,,N,402
Detail,ALLOWED_HCPCS,The value in this field represents the Level1 (CPT) or Level2 (HCPCS) procedure code allowed by the client for claim system adjudication. Required for CV.,Line,,,N,403
Detail,ALLOWED_MOD_01,The value in this field represents the first procedure code modifier allowed by the client for claim system adjudication.,Line,,,N,404
Detail,ALLOWED_MOD_02,The value in this field represents the second procedure code modifier allowed by the client for claim system adjudication.,Line,,,N,405
Detail,ALLOWED_MOD_03,The value in this field represents the third procedure code modifier allowed by the client for claim system adjudication.,Line,,,N,406
Detail,ALLOWED_MOD_04,The value in this field represents the fourth procedure code modifier allowed by the client for claim system adjudication.,Line,,,N,407
Detail,ALLOWED_MOD_05,"The value in this field represents the fifth procedure code modifier allowed by the client for claim system adjudication.  Note: This field is not currently in the 837 transaction, but is planned for the next version.  If you currently store this value in your claim system, please send.",Line,,,N,408
Detail,ALLOWED_MOD_06,"The value in this field represents the sixth procedure code modifier allowed by the client for claim system adjudication.  Note: This field is not currently in the 837 transaction, but is planned for the next version.  If you currently store this value in your claim system, please send.",Line,,,N,409
Detail,ALLOWED_MOD_07,"The value in this field represents the seventh procedure code modifier allowed by the client for claim system adjudication. Note: This field is not currently in the 837 transaction, but is planned for the next version.  If you currently store this value in your claim system, please send.",Line,,,N,410
Detail,ALLOWED_MOD_08,"The value in this field represents the eighth procedure code modifier allowed by the client for claim system adjudication. Note: This field is not currently in the 837 transaction, but is planned for the next version.  If you currently store this value in your claim system, please send.",Line,,,N,411
Detail,ALLOWED_UNITS,The value in this field represents the number of units allowed by the client for claim system adjudication.,Line,,,N,412
Detail,ALLOWED_AMOUNT,"The value in this field represents the allowed amount (before applying co-pay, coinsurance, deductible, cob, & other reduction) for this service. Required for CV.",Line,,,N,413
Detail,COMPOUND_DRUG_YN,Compound drug indicator.  This field should be set to 'Y' if the prescribed drug is a compound drug.,Line,,,N,414
Detail,ALLOWED_NDC,"The value in this field represents the National Drug Code (NDC) allowed after initial adjudication on the claim line. Required when SUB_NDC is submitted. This format pads the labeler, product, or package code segments of the NDC with leading zeroes wherever they are needed to result in a fixed length 5-4-2 configuration.",Line,,,N,415
Detail,ALLOWED_NDC_UNITS,This field represents the numeric value of quantity for the drug allowed after initial adjudication in the client's claim system.  Required when SUB_NDC is submitted.,Line,,,N,416
Detail,ALLOWED_NDC_UNITS_TYPE,"This field represents the units type allowed in the client's claim system after initial adjudication.  Required when SUB_NDC is submitted. Expected values are:
'IU' to indicate International Unit
'GR' to indicate Gram
'ME' to indicate Milligram
'ML' to indicate Milliliter
'UN' to indicate Units",Line,,,N,417
Detail,COPAY_AMOUNT,The value in this field represents the patient's co-pay amount for this service.,Line,,,N,418
Detail,COINSURANCE_AMOUNT,The value in this field represents the patient's coinsurance amount for this service.,Line,,,N,419
Detail,DEDUCTIBLE_AMOUNT,The value in this field represents the patient's deductible amount for this service.,Line,,,N,420
Detail,COB,The value in this field represents the patient's COB amount for this service.,Line,,,N,421
Detail,COB_AMOUNT,The amount paid by the member's other insurance third parties on the claim line item level or the total amount saved on the claim line item because of payment made by the patient's other insurance carrier.,Line,,,N,422
Detail,COB_COINSURANCE_AMOUNT,The value in this field represents the calculated amount paid by the insured based on a percentage of total cost.,Line,,,N,423
Detail,COB_DEDUCTIBLE_AMOUNT,The value in this field represents the dollar amount the subscriber is liable for before other insurance pays for this service line item.,Line,,,N,424
Detail,COB_PAID_AMOUNT,The value in this field represents the other insurance payment amount applied to the service line item.,Line,,,N,425
Detail,COB_ALLOWED_AMOUNT,The value in this field represents the dollar allowance for a procedure or service paid by other insurance for a service line item.,Line,,,N,426
Detail,OTHER_REDUCTION_AMOUNT,The value in this field represents any other adjustment amounts not reflected above.,Line,,,N,427
Detail,PAID_AMOUNT,"The value in this field represents the paid amount (after applying copay, coinsurance, deductible, cob, & other reduction) for this service. Required for CV.",Line,,,N,428
Detail,PAID_DATE,"The value in this field represents the date of final adjudication or payment on preliminary analysis files or on history files.  The field can be blank for daily files since they have not been finalized, however, it should be populated from the client's system for history.  When blank, is populated with the file run date for internal use.",Line,,,N,429
Detail,PAID_UNITS,The value in this field represents the number of units of service paid for each detail line. Required for CV.,Line,,,N,430
Detail,LINE_CAPITATION_INDICATOR,"Indicates if the claim line was paid under a capitation agreement. Valid values are:
1 = Capitated Provider
0 = Non-Capitated Provider",Line,,,N,431
Detail,CLIENT_TYPE_OF_SERVICE_CODE,"This field holds the client's unique service type value, as defined in their claim system.",Line,,,N,432
Detail,FEE_SERVICE_AMOUNT,"This field represents the fee schedule amount for the line level service, based on the provider's contract.  The appropriate value should be submitted if defined.  If no contractual agreement exists, this field should be left blank.",Line,,,N,433
Detail,PATIENT_LIABILITY_AMOUNT,This field stores the amount the patient owes on the line level service.,Line,,,N,434
Detail,DISALLOWED_AMOUNT,"Amount that is disallowed and will not be considered in the payment by the client, non billable to the member for the service line item.",Line,,,N,435
Detail,LINE_REIMBURSEMENT_TYPE,This field represents the pricing methodology used to reimburse the service line. Typically this would be an outpatient service paid at the line level.,Line,,,N,436
Detail,ASSIGNMENT_OF_BENEFITS,"This field represents a one digit indicator to recognize if the benefits were assigned (Y or N).   (2300, CLM08)",Claim,,,Y,437
Detail,CLAIM_BILLED_AMOUNT,"The value in this field represents the claim header level billed amount billed by the provider for the claim.  (2300, CLM02)",Claim,,,Y,438
Detail,CLAIM_NONCOVERED_AMOUNT,The value in this field represents the claim header level non covered amount billed by the provider for the claim.,Claim,,,N,439
Detail,CLAIM_ALLOWED_AMOUNT,The value in this field represents the claim header level allowed amount by the client for the claim.,Claim,,,N,440
Detail,CLAIM_PAID_AMOUNT,"The value in this field represents the claim header level amount paid by the client for the claim.    (For pre-pay claims this is the calculated net amount to be paid, based on adjudication of the pended claim.  This amount may change after audit recommendations are applied and the claim goes through final adjudication and payment).",Claim,,,N,441
Detail,CLAIM_COINSURANCE_AMOUNT,The value in this field represents the total coinsurance dollar amount on a claim for which the subscriber/member is responsible - usually based on a fixed percentage specified in the health plan. Usually applies after reaching a deductible,Claim,,,N,442
Detail,CLAIM_COPAY_AMOUNT,The value in this field represents the total copay dollar amount that a subscriber/member pays the provider at the time of service.  Usually a fixed flat charge per visit based on subscriber health insurance plan.,Claim,,,N,443
Detail,CLAIM_DEDUCTIBLE_AMOUNT,The value in this field represents the total deductible dollar amount paid by the subscriber/member on a claim in order to satisfy the annual health plan deductible.,Claim,,,N,444
Detail,CLAIM_DISALLOWED_AMOUNT,"The value in this field represents the total amount that is disallowed and will NOT be considered in the payment by the client, non billable to the subscriber/member.",Claim,,,N,445
Detail,CLAIM_PATIENT_LIABILITY_AMOUNT,The value in this field represents the total patient liability amount (Coinsurance + Copay + Deductible) for a claim.,Claim,,,N,446
Detail,CLAIM_COB_AMOUNT,The value in this field represents the dollar allowance for a procedure or service paid for by the primary insurer.,Claim,,,N,447
Detail,CLAIM_COB_ALLOWED_AMOUNT,The value in this field represents the dollar allowance for a procedure or service paid by other insurance.,Claim,,,N,448
Detail,CLAIM_COB_COINSURANCE_AMOUNT,The value in this field represents the amount paid by the insured based on a percentage of total cost.,Claim,,,N,449
Detail,CLAIM_COB_PAID_AMOUNT,The value in this field represents the other insurance payment applied to the claim.,Claim,,,N,450
Detail,CLAIM_COB_DEDUCT_AMOUNT,The value in this field represents the dollar amount the subscriber is liable for before other insurance is paid.,Claim,,,N,451
Detail,PATIENT_RESP_AMOUNT,"The value in this field is the amount due by the patient.  (2300, AMT01)",Claim,,,N,452
Detail,CLAIM_PAID_DATE,"The value in this field represents the date of final adjudication or payment on preliminary analysis file, all history files (FILE_TYPE = H) and Inpatient retro TBA files (FILE_INDICATOR = R).  For file types where claims have not been finalized, this value is not required.  If not required, this field should be populated with the file run date.",Claim,,,N,453
Detail,CLAIM_CHECK_PAID_DATE,Date of the remittance number (voucher/check number).,Claim,,,N,454
Detail,PAID_TO_CODE,"Who the claim was paid out to. Valid values are: P = Provider, S = Subscriber",Claim,,,N,455
Detail,PAYMENT_STATUS,"The value in this field indicates the Claim header level payment status of the service. Valid values are: Paid, Denied, Pending, Reversed, Adjusted
Required for CV.",Claim,,,N,456
Detail,CLAIM_CAPITATION_INDICATOR,"Indicates if the claim was paid under a capitation agreement. Valid values are:
1 = Capitated Provider
0 = Non-Capitated Provider",Claim,,,N,457
Detail,DRG_INDICATOR_YN,"The value in this field defines whether or not the claim is eligible to be paid  based on DRG or was paid based on a DRG. If  DRG eligible or payment was DRG based, 'Y' is to be submitted. If not, then 'N'.",Claim,,,N,458
Detail,PRIOR_PAYMENT_AMOUNT,"The value in this field represents any prior payments.  (2320, AMT02)",Claim,,,N,459
Detail,CLAIM_FEE_SCHEDULE_AMOUNT,"This field stores the claim level fee schedule amount, as defined in the provider's contract.",Claim,,,N,460
Detail,CLAIM_FEE_SCHEDULE_CODE,Client note to indicate the type of pricing (fee schedule) used for the claim.,Claim,,,N,461
Detail,CLAIM_REIMBURSE_TYPE_CODE,This field represents the pricing methodology used to pay the claim. Typically this would be an Inpatient service paid at the claim level.,Claim,,,N,462
Detail,MEDICARE_SERVICE_FEE_AMOUNT,This field represents the MCA fee schedule amount.,Line,,,N,463
Detail,PATIENT_PLAN_CODE,This field represents the member's benefit plan code on the client's system at the time of service.,Claim,,,N,464
Detail,PER_CASE_RATE_AMOUNT,This field represents the contractual amount associated with the Case Rate for this claim.,Claim,,,N,465
Detail,PER_DIEM_RATE_AMOUNT,This field represents the contractual amount associated with the Per Diem for this claim.,Claim,,,N,466
Detail,PER_DIEM_WEIGHTED_AMOUNT,"This field represents the per diem weight used to multiply against the base rate, as defined in the provider's contract.",Claim,,,N,467
Detail,WHOLE_CLAIM_PRICING_LINE_YN,The value in this field indicates whether the claim lines were bundled to pay based on whole claim pricing.,Claim,,,N,468
Detail,OTHER_INSURANCE_INDICATOR,"Other Insurance Indicator that determines if other insurance is being used for payment on a claim. Valid values are:
0 = Other insurance did not pay on Claim
1 = Other insurance paid on Claim",Claim,,,N,469
Detail,COORDINATED_BENEFITS_YN,The value in this field indicates if a third party payment has been made on the claim related to Coordination of Benefits (COB). A 'Y' value indicates a third party payment has been made.,Claim,,,N,470
Detail,BYPASS_CODE,"This field supplies the client with greater control over the processing of specific claims. Should the client decide that they do not want certain claims to have logic applied for specific edit types, the bypass code can be applied on the claim line.  If bypass codes are not used by the client, the field should be defaulted to 0.",Line,,,N,471
Detail,PAYER_BYPASS_CODE,The Payer Bypass allows for greater flexibility in payment policy application.  The use of this field must be discussed with the Implementation Services Director to ensure appropriateness and correct implementation.,Line,,,N,472
Detail,AUDIT_BYPASS_CODE,"This field supplies the client with greater control over the processing of specific claims. Should the client decide that they do not want certain claims to have logic applied for specific selection rules, the bypass code can be applied on the claim line.  If bypass codes are not used by the client, the field should be defaulted to zeros. Applicable to Claim Type = 'D' or 'H'.",Claim,,,N,473
Detail,PAR_FLAG,"The value in this field represents the status of the Provider of Service in relation to the Health Plan. Valid values are ‘Y’ for participating or contracted or ‘N’ for Not participating or contracted (if participating status is not available, default with ‘Y’). Required for CV.",Line,,,N,474
Detail,EDIT_0_ALLOWED_YN,"As a default, $0 allowed lines are not considered for editing purposes.  This flag can be used to override this filter and consider a line with a $0 allowed amount for editing in TBA and use as historical reference for future editing.  Valid Values are:
Null – lines with a zero allowed amount reflecting a denial (default)
N –  zero charge and allowed lines that should not be considered for editing (default)
Y – zero charge and allowed lines that should be considered for editing (override)",Line,,,N,475
Detail,ZERO_CHG_LINE_SEQ,"This field identifies the “rolled to” line that contains applicable charges for zero charge surgery lines.  If a zero charge line is edited, a payment variance will be calculated and invoiced to the “rolled to” line on this claims as indicated by this line sequence.",Line,,,N,476
Detail,ZERO_CHG_SCHED_AMOUNT,This field contains the fee schedule amount for a zero charge surgery line.  This amount will be utilized for estimation and overlook reporting.,Line,,,N,477
Detail,DATE_RECEIVED_CLIENT,The value in this field represents the date the claim was received by the client. This field is required if Timely Filing Policies are being applied. Required for CV.,Claim,,,N,478
Detail,DATE_ADJUDICATED,The value in this field represents the date the claim was adjudicated by the client. Required for CV.,Claim,,,N,479
Detail,CLAIM_APPROVED_BY,The value in this field represents the unique identifier for the person (in the client organization) who approved the claim.,Claim,,,N,480
Detail,LETTER_PLAN_CODE,"The value in this field will be used by the letter generation module to determine which letter templates, logos and signatures should be printed. The client must provide valid values and related logos/signatures for this data element.",Claim,,,N,481
Detail,CLAIM_ID_ORIG,"This area is for the Original Claim ID.  This would ONLY be used in the cases where Claim ID’s are changed for an adjustment and the client has the means to link the Original Claim ID to the Current Claim ID.  (2300, REF02)",Claim,,,Y,482
Detail,LINE_SEQ_ORIG,"The original line sequence is used to more accurately report payment variance and invoice data for edited TBA lines that are returned in history with one or multiple different line sequence numbers.  It links newly created lines back to the original line number that generated the change recommendation.  (2400, REF02)",Line,,,N,483
Detail,GROUP_ID,"The value in this field represents the Employer Group Number for the patient’s claim.  This field is used for reporting purposes only.  (2000B, SBR03)",Claim,,,N,484
Detail,GROUP_NAME,The value in this field represents the Employer Group Name for the patient's claim.,Claim,,,N,485
Detail,RISK_POOL,"The value submitted in this field defines the risk pool associated with the group the member belongs to.  Expected value examples are; ASO, Fully Insured, Large Group Self Funded, Large Group Fully Insured, etc.  These values will be pulled from the appropriate client database for reporting purposes.",Claim,,,N,486
Detail,CLAIM_DENIAL_REASON_CODE,"The value in this field is a claim-level reason code assigned by the client.  It represents the reason a claim was denied.  Values will be agreed to during the implementation project, if applicable.",Claim,,,N,487
Detail,MORTALITY_RISK,"The value in this field represents the risk of mortality (ROM) subclass submitted by the provider. Valid values are:
1 = Minor
2 = Moderate
3 = Major
4 = Extreme",Claim,,,N,488
Detail,BIRTH_WEIGHT,The value in this field represents an infant’s birth weight in grams.,Claim,,,N,489
Detail,ALC_DAYS,The value in this field represents the alternative level of care (ALC) days associated with an inpatient stay.,Claim,,,N,490
Detail,ALC_AMOUNT,The value in this field represents the dollar amount associated with alternative level of care (ALC) days for an inpatient stay.,Claim,,,N,491
Detail,PAYER_ORGANIZATION_NAME,"Payer Name associated with the Payer Short submitted on the claim. (2010BB, NM101)",Claim,,,N,492
Detail,PAYER_ADDRESS_01,"The first line of the Payer's Address. (2010BB, N301)",Claim,,,N,493
Detail,PAYER_ADDRESS_02,"The second line of the Payer's Address (2010BB, N302)",Claim,,,N,494
Detail,PAYER_CITY,"Payer City Name (2010BB, N401)",Claim,,,N,495
Detail,PAYER_STATE,"Payer State or Province Code (2010BB, N402)",Claim,,,N,496
Detail,PAYER_ZIP,"Payer Postal Zone or ZIP Code (2010BB, N403)",Claim,,,N,497
Detail,PAYER_ZIP_PLUS_FOUR,"Payer Postal Zone or ZIP Code  (2010BB, N403)",Claim,,,N,498
Detail,PAYER_COUNTRY,"Country Code (2010BB, N404)",Claim,,,N,499
Detail,PAYER_COUNTRY_SUBDIVISION,"Country Subdivision Code (2010BB, N407)",Claim,,,N,500
Detail,SUB_CLAIM_FILING_CODE,"The claim filing indicator is a CMS value that identifies the type of insurance for the submitted claim.  This is not to be confused with the CLAIM_TYPE in this layout. Expected values are found on a separate tab. (1000B, SBR09)",Claim,,,N,501
Detail,SUB_LAST_NAME,"The value in this field represents the subscriber’s last name and  will be the same value as submitted in PATIENT_LAST_NAME when the subscriber is the patient.  (Subscriber:  2010BA, NM103)",Claim,,,Y,502
Detail,SUB_FIRST_NAME,"The value in this field represents the subscriber’s first name  and  will be the same value as submitted in PATIENT_FIRST_NAME when the subscriber is the patient.   (Subscriber:  2010BA, NM104)",Claim,,,Y,503
Detail,SUB_MIDDLE_NAME,"The value in this field represents the subscriber's middle name  and  will be the same value as submitted in PATIENT_MIDDLE_NAME when the subscriber is the patient. This is required by CMS when needed to identify the individual. (Subscriber: 2010BA, NM105)",Claim,,,Y,504
Detail,SUB_NAME_SUFFIX,"The value in this field represents the suffix attached to the subscriber's name and will be the same value as submitted in PATIENT_FIRST_NAME when the subscriber is the patient.  This is required by CMS when needed to identify the individual. (Subscriber: 2010BA, NM105)",Claim,,,Y,505
Detail,SUB_ADDRESS_01,"The value in this field represents the first line of the subscriber's address.  This value will be the same value as submitted in PATIENT_ADDRESS_01 when the subscriber is the patient.  (2010BA, N301)",Claim,,,Y,506
Detail,SUB_ADDRESS_02,"The value in this field represents the second line of the subscriber's address.  This value will be the same value as submitted in PATIENT_ADDRESS_02 when the subscriber is the patient.   (2010BA, N302)",Claim,,,Y,507
Detail,SUB_CITY,"The value in this field represents the city of the subscriber's address. This value will be the same value as submitted in PATIENT_CITY when the subscriber is the patient.  (2010BA, N401)",Claim,,,Y,508
Detail,SUB_STATE,"The value in this field represents the state of the subscriber's address.  This value will be the same value as submitted in PATIENT_STATE when the subscriber is the patient.  (2010BA, N402)",Claim,,,Y,509
Detail,SUB_ZIP,"The value in this field represents the postal ZIP code associated with the subscriber's address.  The value is the basic five digit ZIP code and will be the same value as submitted in PATIENT_ZIP when the subscriber is the patient.    (2010BA, N403)",Claim,,,Y,510
Detail,SUB_ZIP_PLUS_FOUR,"The value in this field represents the four digit add-on code for the expanded ZIP code associated with the subscriber's address.  The value is four digits and will be the same value as submitted in PATIENT_ZIP_PLUS_FOUR when the subscriber is the patient.  (2010BA, N403)",Claim,,,Y,511
Detail,SUB_COUNTRY,"The value in this field represents the country of the subscriber's  address.  This value will be the same value as submitted in PATIENT_COUNTY when the subscriber is the patient.   (2010BA, N404)",Claim,,,Y,512
Detail,SUB_COUNTRY_SUBDIVISION,"The value in this field represents the country subdivision code for the subscriber's address and only used for international addresses.  This value will be the same value as submitted in PATIENT_COUNTRY_SUBDIVISION when the subscriber is the patient.  (2010BA, N404)",Claim,,,N,513
Detail,SUB_DOB,"This field represents the subscriber’s date of birth and will be the same value as submitted in PATIENT_DOB when the subscriber is the patient.  (2010BA, DMG02)",Claim,,,Y,514
Detail,SUB_GENDER_ID,"The value in this field represents the subscriber’s gender.  This value will be the same value as submitted in PATIENT_DOB when the subscriber is the patient.  Recommended values are M for Male, F for Female and U for Unknown.  (Subscriber:  2010BA, DMG03)",Claim,,,Y,515
Detail,SUB_SSN,"The value in this field represents the subscriber’s social security number.  (2010BA, REF02)",Claim,,,N,516
Detail,PATIENT_ADDRESS_01,"The value in this field represents the first line of the patient's address.  This value will be the same value as submitted in SUB_ADDRESS_01 when the patient is the subscriber.  (2010BA, N301) or (2010CA, N301)",Claim,,,Y,517
Detail,PATIENT_ADDRESS_02,"The value in this field represents the second line of the patient's address.  This value will be the same value as submitted in SUB_ADDRESS_02 when the patient is the subscriber.  (2010BA, N302) or (2010CA, N302)",Claim,,,Y,518
Detail,PATIENT_CITY,"The value in this field represents the city of the patient's address. This value will be the same as SUB_CITY when the patient is the subscriber. (2010BA, N401) or (2010CA, N401)",Claim,,,Y,519
Detail,PATIENT_STATE,"The value in this field represents the state of the patient's address.  This value will be the same value as  submitted in SUB_STATE when the patient is the subscriber. (2010BA, N402) or  (2010CA, N402)",Claim,,,Y,520
Detail,PATIENT_ZIP,"The value in this field represents the postal ZIP code associated with the patient's address.  This value will be the same value as  submitted in SUB_ZIP when the patient is the subscriber. (2010BA, N403) or (2010CA, N403)",Claim,,,Y,521
Detail,PATIENT_ZIP_PLUS_FOUR,"The value in this field represents the four digit add-on code for the expanded ZIP code associated with the patient's address.   This value will be the same value submitted in SUB_ZIP_PLUS_FOUR when the patient is the subscriber.  (2010BA, N403) or (2010CA, N403)",Claim,,,Y,522
Detail,PATIENT_COUNTRY,"The value in this field represents the country of the patient's  address. This value will be the same value as  submitted in SUB_COUNTRY when the patient is the subscriber.   (2010BA, N404) or (2010CA, N404)",Claim,,,Y,523
Detail,PATIENT_COUNTRY_SUBDIVISION,"The value in this field represents the country subdivision code for the patient's address and only used for international addresses. his value will be the same value as  submitted in SUB_COUNTRY_SUBDIVISION when the patient is the subscriber.  (2010BA, N404) or (2010CA, N404)",Claim,,,N,524
Detail,RETIRED_INDICATOR,The value in this field indicates whether or not the member is a retiree. Expected values are ‘Y’ for Retiree or ‘N’ for Not Retired.,Claim,,,N,525
Detail,PAY_TO_ENTITY_TYPE,"This series of fields represent the pay-to-entity and is reported when the address for payment is different than that of the Billing Provider.  Valid Value is:  'E' = Other Entity or Facility.  CMS allows only a non-person entity for this field.  (2010AB, NM102)",Claim,,,N,526
Detail,PAY_TO_ORGANIZATION_NAME,This field represents the organization name for the pay-to entity.,Claim,,,N,527
Detail,PAY_TO_ADDRESS_01,"The value in this field represents the first line of the pay-to entity's address. This field only contains address information when different from the Billing Provider Address. (2010AB, NM301)",Claim,,,Y,528
Detail,PAY_TO_ADDRESS_02,"The value in this field represents the second line of the pay-to entity's address. This field only contains address information when different from the Billing Provider Address.  (2010AB, N302)",Claim,,,Y,529
Detail,PAY_TO_CITY,"The value in this field represents the city of the pay-to entity's address.  (2010AB, N401)",Claim,,,Y,530
Detail,PAY_TO_STATE,"The value in this field represents the state of the pay-to entity's address.  (2010AB, N402)",Claim,,,Y,531
Detail,PAY_TO_ZIP,"The value in this field represents the postal ZIP code for the pay-to entity.  The value is the basic five digit ZIP code.   (2010AB, N403)",Claim,,,Y,532
Detail,PAY_TO_ZIP_PLUS_FOUR,"The value in this field represents the four digit add-on code for the expanded ZIP code.  The value is four digits.   (2010AB, N403)",Claim,,,Y,533
Detail,PAY_TO_COUNTRY,"The value in this field represents the country of the pay-to entity's  address.  (2010AB, N404)",Claim,,,Y,534
Detail,PAY_TO_COUNTRY_SUBDIVISION,"The value in this field represents the country subdivision code for the pay-to entity's address.  This is only used for international addresses.(2010AB, N407)",Claim,,,N,535
Detail,ATTENDING_PROVIDER_ID,"The value in this field represents the attending provider at the  facility where services are rendered.  This number is the identification number unique to the provider in the client’s system.  (2310A, REF02)",Claim,,,N,536
Detail,ATTENDING_TAXGROUP_ID,"The value in this field represents the provider's tax identification number. This number represents the attending provider or facility.  (2310A, REF02)",Claim,,,N,537
Detail,ATTENDING_NPI,"The value in this field represents the CMS National Provider Identifier (NPI) for the attending provider.  Default to spaces if value is not available. (2310A, NM109)",Claim,,,Y,538
Detail,ATTENDING_STATE_LICENSE,"The value in this field represents the Sate License number for the attending provider.  A non-zero value is required.  (2310A, REF02)",Claim,,,N,539
Detail,ATTENDING_SPECIALTY_CODE,"The value in this field represents the specialty of the attending provider, as defined in the client's claim system. (2310, PRV03)",Claim,,,N,540
Detail,ATTENDING_TAXONOMY_CODE,Industry standard taxonomy code of the attending provider used by CMS and sourced by the National Uniform Claim Committee. A list of taxonomy codes is available via http://www.wpc-edi.com/reference/codelists/healthcare/health-care-provider-taxonomy-code-set/.,Claim,,,Y,541
Detail,ATTENDING_ENTITY_TYPE,"Expected Values are:  'P' = Person  (2310A, NM102)",Claim,,,N,542
Detail,ATTENDING_LAST_NAME,"The value in this field represents the attending provider’s last name.  (2310A, NM103)",Claim,,,Y,543
Detail,ATTENDING_FIRST_NAME,"The value in this field represents the attending provider’s first name.  (2310A, NM104)",Claim,,,Y,544
Detail,ATTENDING_MIDDLE_NAME,"The value in this field represents the attending provider’s middle name.  (2310A, NM105)",Claim,,,Y,545
Detail,ATTENDING_NAME_SUFFIX,"The value in this field represents the attending provider's suffix, as required.  (2310A, NM107)",Claim,,,Y,546
Detail,OPERATING_PROVIDER_ID,"The value in this field represents the operating provider at the  facility where services are rendered.  This number is the identification number unique to the provider in the client’s system.  (2310B, REF02)",Claim,,,N,547
Detail,OPERATING_TAXGROUP_ID,"The value in this field represents the provider's tax identification number. This number represents the operating provider.  (2310B, REF02)",Claim,,,N,548
Detail,OPERATING_NPI,"The value in this field represents the CMS National Provider Identifier (NPI) for the operating provider. Default to spaces if value is not available.  (2310B, NM109)",Claim,,,N,549
Detail,OPERATING_STATE_LICENSE,"The value in this field represents the Sate License number for the operating provider.  A non-zero value is required.  (2310B, REF02)",Claim,,,N,550
Detail,OPERATING_SPECIALTY_CODE,"The value in this field represents the specialty of the operating provider, as defined in the client's claim system.",Claim,,,N,551
Detail,OPERATING_TAXONOMY_CODE,Industry standard taxonomy code of the operating provider used by CMS and sourced by the National Uniform Claim Committee. A list of taxonomy codes is available via http://www.wpc-edi.com/reference/codelists/healthcare/health-care-provider-taxonomy-code-set/.,Claim,,,N,552
Detail,OPERATING_ENTITY_TYPE,"Expected Values are:  'P' = Person (2310B, NM102)",Claim,,,N,553
Detail,OPERATING_LAST_NAME,"The value in this field represents the operating provider’s last name.  (2310B, NM103)",Claim,,,N,554
Detail,OPERATING_FIRST_NAME,"The value in this field represents the operating provider’s first name and applies to Outpatient claims only.  (2310B, NM104)",Claim,,,N,555
Detail,OPERATING_MIDDLE_NAME,"The value in this field represents the operating provider’s middle name and applies to Outpatient claims only.  (2310B, NM105)",Claim,,,N,556
Detail,OPERATING_NAME_SUFFIX,"The value in this field represents the operating provider's suffix, as required.  (2310B, NM107)",Claim,,,N,557
Detail,OTHER_OPERATING_PROVIDER_ID,"The value in this field represents the other operating provider at the  facility where services are rendered.  This number is the identification number unique to the provider in the client’s system.  (2310C, REF02)",Claim,,,N,558
Detail,OTHER_OPERATING_TAXGROUP_ID,"The value in this field represents the provider's tax identification number. This number represents the other operating provider.  (2310C, REF02)",Claim,,,N,559
Detail,OTHER_OPERATING_NPI,"The value in this field represents the CMS National Provider Identifier (NPI) for the other operating provider.  Default to spaces if value is not available. (2310C, NM109)",Claim,,,Y,560
Detail,OTHER_OPERATING_STATE_LICENSE,"The value in this field represents the Sate License number for the other operating provider.  A non-zero value is required.  (2310C, REF02)",Claim,,,N,561
Detail,OTHER_OPERATING_SPECIALTY_CODE,"The value in this field represents the specialty of the other operating provider, as defined in the client's claim system.",Claim,,,N,562
Detail,OTHER_OPERATING_TAXONOMY_CODE,Industry standard taxonomy code of the other operating provider used by CMS and sourced by the National Uniform Claim Committee. A list of taxonomy codes is available via http://www.wpc-edi.com/reference/codelists/healthcare/health-care-provider-taxonomy-code-set/.,Claim,,,N,563
Detail,OTHER_OPERATING_ENTITY_TYPE,"Expected Values are:  'P' = Person (2310C, NM102)",Claim,,,N,564
Detail,OTHER_OPERATING_LAST_NAME,"The value in this field represents the other operating provider’s last name.  (2310C, NM103)",Claim,,,Y,565
Detail,OTHER_OPERATING_FIRST_NAME,"The value in this field represents the other operating provider’s first name.  (2310C, NM104)",Claim,,,Y,566
Detail,OTHER_OPERATING_MIDDLE_NAME,"The value in this field represents the other operating provider’s middle name.  (2310C, NM105)",Claim,,,Y,567
Detail,OTHER_OPERATING_NAME_SUFFIX,"The value in this field represents the other operating provider's suffix, as required.  (2310C, NM107)",Claim,,,Y,568
Detail,REFERRING_PCP_YN,Y or N indicator to define whether or not the referring provider is the patient's PCP.,Claim,,,N,569
Detail,REFERRING_PROVIDER_ID,"The value in this field represents the referring provider at the  facility where services are rendered.  This number is the identification number unique to the provider in the client’s system.  (2310F, REF02)",Claim,,,N,570
Detail,REFERRING_TAXGROUP_ID,"The value in this field represents the provider's tax identification number. This number represents the referring provider.  (2310F, REF02)",Claim,,,N,571
Detail,REFERRING_NPI,"The value in this field represents the CMS National Provider Identifier (NPI) for the referring provider.  Default to spaces if value is not available.  (2310F, NM109)",Claim,,,N,572
Detail,REFERRING_STATE_LICENSE,"The value in this field represents the Sate License number for the referring provider.  A non-zero value is required.  (2310F, REF02)",Claim,,,N,573
Detail,REFERRING_SPECIALTY_CODE,"The value in this field represents the specialty of the referring provider, as defined in the client's claim system.",Claim,,,N,574
Detail,REFERRING_TAXONOMY_CODE,Industry standard taxonomy code of the referring provider used by CMS and sourced by the National Uniform Claim Committee. A list of taxonomy codes is available via http://www.wpc-edi.com/reference/codelists/healthcare/health-care-provider-taxonomy-code-set/.,Claim,,,N,575
Detail,REFERRING_ENTITY_TYPE,Expected Values are:  'P' = Person,Claim,,,N,576
Detail,REFERRING_LAST_NAME,"The value in this field represents the referring provider’s last name.  (2310F, NM103)",Claim,,,N,577
Detail,REFERRING_FIRST_NAME,"The value in this field represents the referring provider’s first name.  (2310F, NM104)",Claim,,,N,578
Detail,REFERRING_MIDDLE_NAME,"The value in this field represents the referring provider’s middle name.  (2310F, NM105)",Claim,,,N,579
Detail,REFERRING_NAME_SUFFIX,"The value in this field represents the referring provider's suffix, as required.  (2310F, NM107)",Claim,,,N,580
Detail,AUTH_EXCEPTION_CODE,"Required when mandated by government law or regulation to obtain authorization for specific service(s) but, for the reasons provided, the service was performed without obtaining the authorization.  Allowable values for this element are:
1 Immediate/Urgent Care
2 Services Rendered in a Retroactive Period
3 Emergency Care
4 Client has Temporary Medicaid
5 Request from County for Second Opinion to Determine
if Recipient Can Work
6 Request for Override Pending
7 Special Handling
(2300, REF02)",Claim,,,N,581
Detail,REFERRAL_NUM,"Required by CMS when a referral number is assigned by the payer or Utilization Management Organization (UMO) AND a referral is involved.  (2300, REF02)",Claim,,,N,582
Detail,AUTH_NO_01,"The value in this field represents the authorization number submitted by the provider for this claim.  If the provider did not submit an authorization number, provide the payer’s prior authorization number for this claim, if available.  (2300, REF02)",Claim,,,N,583
Detail,AUTH_NO_02,"The value in this field represents the authorization number submitted by the provider for this claim.  If the provider did not submit an authorization number, provide the payer’s prior authorization number for this claim, if available.",Claim,,,N,584
Detail,AUTH_NO_03,"The value in this field represents the authorization number submitted by the provider for this claim.  If the provider did not submit an authorization number, provide the payer’s prior authorization number for this claim, if available.",Claim,,,N,585
Detail,PRO_AUTH_ID,"Peer Review Organization Authorization number.  Required by CMS when an external Peer Review Organization assigns an Approval Number to services deemed medically necessary by that organization. (2300, REF02)",Claim,,,N,586
Detail,CLAIM_NOTE_REF_CODE,"This field defines the functional area or purpose for which the claim note applies, as submitted by the provider or facility.  Expected Values are:
ALG Allergies
DCP Goals, Rehabilitation Potential, or Discharge Plans
DGN Diagnosis Description
DME Durable Medical Equipment (DME) and Supplies
MED Medications
NTR Nutritional Requirements
ODT Orders for Disciplines and Treatments
RHB Functional Limitations, Reason Homebound, or Both
RLH Reasons Patient Leaves Home
RNH Times and Reasons Patient Not at Home
SET Unusual Home, Social Environment, or Both
SFM Safety Measures
SPT Supplementary Plan of Treatment
UPI Updated Information
(2300, NTE01)",Claim,,,N,587
Detail,CLAIM_NOTE_TEXT,"This field is the free-form description provided by the provider or facility to clarify the related data elements and their content. (2300, NTE02)",Claim,,,N,588
Detail,EPSDT_REFERRAL_YN,"EPSDT Referral is required by CMS on Early & Periodic Screening, Diagnosis, and Treatment (EPSDT) claims when the screening service is being billed in this claim. The value in this field answers the question: Was an EPSDT referral given to the patient?  If no, then choose ""NU"" for Condition Indicator.  Expected Values are Y or N. (2300, CRC02)",Claim,,,N,589
Detail,EPSDT_CONDITION_CODE_01,"This field represents the condition indicator for the EPSDT referral above.  Expected Values are:
AV    Available - Not Used - Patient refused referral.
NU    Not Used - This conditioner indicator must be used when the submitter answers “N” in CRC02.
S2    Under Treatment - Patient is currently under treatment for referred diagnostic or corrective health problem.
ST    New Services Requested - Patient is referred to another provider for diagnostic or corrective treatment for at least one health problem identified during an initial or periodic screening service (not including dental referrals).
OR
Patient is scheduled for another appointment with screening provider for diagnostic or corrective treatment for at least one health problem identified during an initial or periodic screening service (not including dental referrals).
(2300, CRC03)",Claim,,,N,590
Detail,EPSDT_CONDITION_CODE_02,Additional condition indicator for the EPSDT referral.,Claim,,,N,591
Detail,EPSDT_CONDITION_CODE_03,Additional condition indicator for the EPSDT referral.,Claim,,,N,592
Detail,OCCUR_SPAN_CODE_01,"This field defines the Occurrence Span Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence span code is defined by a span of time rather than by a single date. (2300, HI01-2)",Claim,,,Y,593
Detail,OCCUR_SPAN_FROM_DATE_01,"From date associated with OCCUR_SPAN_CODE_01. Expected when corresponding OCCUR_SPAN_CODE is submitted. (2300, HI01-4)",Claim,,,Y,594
Detail,OCCUR_SPAN_TO_DATE_01,"To date associated with OCCUR_SPAN_CODE_01. Expected when corresponding OCCUR_SPAN_CODE is submitted.  (2300, HI01-4)",Claim,,,Y,595
Detail,OCCUR_SPAN_CODE_02,"This field defines the Occurrence Span Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence span code is defined by a span of time rather than by a single date. (2300, HI02-2+C545)",Claim,,,Y,596
Detail,OCCUR_SPAN_FROM_DATE_02,"From date associated with OCCUR_SPAN_CODE_02. Expected when corresponding OCCUR_SPAN_CODE is submitted.  (2300, HI02-4)",Claim,,,Y,597
Detail,OCCUR_SPAN_TO_DATE_02,"To date associated with OCCUR_SPAN_CODE_02. Expected when corresponding OCCUR_SPAN_CODE is submitted.  (2300, HI02-4)",Claim,,,Y,598
Detail,OCCUR_SPAN_CODE_03,"This field defines the Occurrence Span Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence span code is defined by a span of time rather than by a single date. (2300, HI03-2)",Claim,,,Y,599
Detail,OCCUR_SPAN_FROM_DATE_03,"From date associated with OCCUR_SPAN_CODE_03. Expected when corresponding OCCUR_SPAN_CODE is submitted.  (2300, HI03-4)",Claim,,,Y,600
Detail,OCCUR_SPAN_TO_DATE_03,"To date associated with OCCUR_SPAN_CODE_03. Expected when corresponding OCCUR_SPAN_CODE is submitted.  (2300, HI03-4)",Claim,,,Y,601
Detail,OCCUR_SPAN_CODE_04,"This field defines the Occurrence Span Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence span code is defined by a span of time rather than by a single date.
(2300, HI04-2)",Claim,,,Y,602
Detail,OCCUR_SPAN_FROM_DATE_04,"From date associated with OCCUR_SPAN_CODE_04.  Expected when corresponding OCCUR_SPAN_CODE is submitted.  (2300, HI04-4)",Claim,,,Y,603
Detail,OCCUR_SPAN_TO_DATE_04,"To date associated with OCCUR_SPAN_CODE_04. Expected when corresponding OCCUR_SPAN_CODE is submitted.  (2300, HI04-4)",Claim,,,Y,604
Detail,OCCUR_SPAN_CODE_05,"This field defines the Occurrence Span Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence span code is defined by a span of time rather than by a single date.
 (2300, HI05-2)",Claim,,,Y,605
Detail,OCCUR_SPAN_FROM_DATE_05,"From date associated with OCCUR_SPAN_CODE_05. Expected when corresponding OCCUR_SPAN_CODE is submitted.  (2300, HI05-4)",Claim,,,Y,606
Detail,OCCUR_SPAN_TO_DATE_05,"To date associated with OCCUR_SPAN_CODE_05. Expected when corresponding OCCUR_SPAN_CODE is submitted.  (2300, HI05-4)",Claim,,,Y,607
Detail,OCCUR_SPAN_CODE_06,"This field defines the Occurrence Span Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence span code is defined by a span of time rather than by a single date.  (2300, HI06-2)",Claim,,,Y,608
Detail,OCCUR_SPAN_FROM_DATE_06,"From date associated with OCCUR_SPAN_CODE_06. Expected when corresponding OCCUR_SPAN_CODE is submitted.  (2300, HI06-4)",Claim,,,Y,609
Detail,OCCUR_SPAN_TO_DATE_06,"To date associated with OCCUR_SPAN_CODE_06. Expected when corresponding OCCUR_SPAN_CODE is submitted.  (2300, HI06-4)",Claim,,,Y,610
Detail,OCCUR_SPAN_CODE_07,"This field defines the Occurrence Span Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence span code is defined by a span of time rather than by a single date. (2300, HI07-2)",Claim,,,Y,611
Detail,OCCUR_SPAN_FROM_DATE_07,"From date associated with OCCUR_SPAN_CODE_07. Expected when corresponding OCCUR_SPAN_CODE is submitted.  (2300, HI07-4)",Claim,,,Y,612
Detail,OCCUR_SPAN_TO_DATE_07,"To date associated with OCCUR_SPAN_CODE_07. Expected when corresponding OCCUR_SPAN_CODE is submitted.  (2300, HI07-4)",Claim,,,Y,613
Detail,OCCUR_SPAN_CODE_08,"This field defines the Occurrence Span Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence span code is defined by a span of time rather than by a single date. (2300, HI08-2)",Claim,,,Y,614
Detail,OCCUR_SPAN_FROM_DATE_08,"From date associated with OCCUR_SPAN_CODE_08. Expected when corresponding OCCUR_SPAN_CODE is submitted.  (2300, HI08-4)",Claim,,,Y,615
Detail,OCCUR_SPAN_TO_DATE_08,"To date associated with OCCUR_SPAN_CODE_08. Expected when corresponding OCCUR_SPAN_CODE is submitted.  (2300, HI08-4)",Claim,,,Y,616
Detail,OCCUR_SPAN_CODE_09,This field defines the Occurrence Span Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence span code is defined by a span of time rather than by a single date.,Claim,,,Y,617
Detail,OCCUR_SPAN_FROM_DATE_09,From date associated with OCCUR_SPAN_CODE_09. Expected when corresponding OCCUR_SPAN_CODE is submitted.,Claim,,,Y,618
Detail,OCCUR_SPAN_TO_DATE_09,To date associated with OCCUR_SPAN_CODE_09. Expected when corresponding OCCUR_SPAN_CODE is submitted.,Claim,,,Y,619
Detail,OCCUR_SPAN_CODE_10,"This field defines the Occurrence Span Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence span code is defined by a span of time rather than by a single date.(2300, HI010-2)",Claim,,,Y,620
Detail,OCCUR_SPAN_FROM_DATE_10,"From date associated with OCCUR_SPAN_CODE_10. Expected when corresponding OCCUR_SPAN_CODE is submitted. (2300, HI010-4)",Claim,,,Y,621
Detail,OCCUR_SPAN_TO_DATE_10,"To date associated with OCCUR_SPAN_CODE_10. Expected when corresponding OCCUR_SPAN_CODE is submitted. (2300, HI010-4)",Claim,,,Y,622
Detail,OCCUR_SPAN_CODE_11,"This field defines the Occurrence Span Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence span code is defined by a span of time rather than by a single date.(2300, HI011-2)",Claim,,,Y,623
Detail,OCCUR_SPAN_FROM_DATE_11,"From date associated with OCCUR_SPAN_CODE_11. Expected when corresponding OCCUR_SPAN_CODE is submitted. (2300, HI011-4)",Claim,,,Y,624
Detail,OCCUR_SPAN_TO_DATE_11,"To date associated with OCCUR_SPAN_CODE_11. Expected when corresponding OCCUR_SPAN_CODE is submitted. (2300, HI011-4)",Claim,,,Y,625
Detail,OCCUR_SPAN_CODE_12,"This field defines the Occurrence Span Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence span code is defined by a span of time rather than by a single date. (2300, HI012-2)",Claim,,,Y,626
Detail,OCCUR_SPAN_FROM_DATE_12,"From date associated with OCCUR_SPAN_CODE_12. Expected when corresponding OCCUR_SPAN_CODE is submitted. (2300, HI012-4)",Claim,,,Y,627
Detail,OCCUR_SPAN_TO_DATE_12,"To date associated with OCCUR_SPAN_CODE_12. Expected when corresponding OCCUR_SPAN_CODE is submitted. (2300, HI012-4)",Claim,,,Y,628
Detail,OCCUR_SPAN_CODE_13,This field defines the Occurrence Span Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence span code is defined by a span of time rather than by a single date.  Segment Repeat.,Claim,,,Y,629
Detail,OCCUR_SPAN_FROM_DATE_13,From date associated with OCCUR_SPAN_CODE_13. Expected when corresponding OCCUR_SPAN_CODE is submitted. Segment Repeat.,Claim,,,Y,630
Detail,OCCUR_SPAN_TO_DATE_13,To date associated with OCCUR_SPAN_CODE_13.  Expected when corresponding OCCUR_SPAN_CODE is submitted. Segment Repeat.,Claim,,,Y,631
Detail,OCCUR_SPAN_CODE_14,This field defines the Occurrence Span Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence span code is defined by a span of time rather than by a single date.  Segment Repeat.,Claim,,,Y,632
Detail,OCCUR_SPAN_FROM_DATE_14,From date associated with OCCUR_SPAN_CODE_14.  Expected when corresponding OCCUR_SPAN_CODE is submitted. Segment Repeat.,Claim,,,Y,633
Detail,OCCUR_SPAN_TO_DATE_14,To date associated with OCCUR_SPAN_CODE_14.  Expected when corresponding OCCUR_SPAN_CODE is submitted. Segment Repeat.,Claim,,,Y,634
Detail,OCCUR_SPAN_CODE_15,This field defines the Occurrence Span Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence span code is defined by a span of time rather than by a single date.  Segment Repeat.,Claim,,,Y,635
Detail,OCCUR_SPAN_FROM_DATE_15,From date associated with OCCUR_SPAN_CODE_15.  Expected when corresponding OCCUR_SPAN_CODE is submitted. Segment Repeat.,Claim,,,Y,636
Detail,OCCUR_SPAN_TO_DATE_15,To date associated with OCCUR_SPAN_CODE_15.  Expected when corresponding OCCUR_SPAN_CODE is submitted.  Segment Repeat.,Claim,,,Y,637
Detail,OCCUR_SPAN_CODE_16,This field defines the Occurrence Span Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence span code is defined by a span of time rather than by a single date.  Segment Repeat.,Claim,,,Y,638
Detail,OCCUR_SPAN_FROM_DATE_16,From date associated with OCCUR_SPAN_CODE_16.  Expected when corresponding OCCUR_SPAN_CODE is submitted.  Segment Repeat.,Claim,,,Y,639
Detail,OCCUR_SPAN_TO_DATE_16,To date associated with OCCUR_SPAN_CODE_16.  Expected when corresponding OCCUR_SPAN_CODE is submitted.  Segment Repeat.,Claim,,,Y,640
Detail,OCCUR_SPAN_CODE_17,This field defines the Occurrence Span Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence span code is defined by a span of time rather than by a single date.,Claim,,,Y,641
Detail,OCCUR_SPAN_FROM_DATE_17,From date associated with OCCUR_SPAN_CODE_17.  Expected when corresponding OCCUR_SPAN_CODE is submitted.  Segment Repeat.,Claim,,,Y,642
Detail,OCCUR_SPAN_TO_DATE_17,To date associated with OCCUR_SPAN_CODE_17.  Expected when corresponding OCCUR_SPAN_CODE is submitted.  Segment Repeat.,Claim,,,Y,643
Detail,OCCUR_SPAN_CODE_18,This field defines the Occurrence Span Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence span code is defined by a span of time rather than by a single date.  Segment Repeat.,Claim,,,Y,644
Detail,OCCUR_SPAN_FROM_DATE_18,From date associated with OCCUR_SPAN_CODE_18.  Expected when corresponding OCCUR_SPAN_CODE is submitted.  Segment Repeat.,Claim,,,Y,645
Detail,OCCUR_SPAN_TO_DATE_18,To date associated with OCCUR_SPAN_CODE_18.  Expected when corresponding OCCUR_SPAN_CODE is submitted.  Segment Repeat.,Claim,,,Y,646
Detail,OCCUR_SPAN_CODE_19,This field defines the Occurrence Span Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence span code is defined by a span of time rather than by a single date.  Segment Repeat.,Claim,,,Y,647
Detail,OCCUR_SPAN_FROM_DATE_19,From date associated with OCCUR_SPAN_CODE_19.  Expected when corresponding OCCUR_SPAN_CODE is submitted.  Segment Repeat.,Claim,,,Y,648
Detail,OCCUR_SPAN_TO_DATE_19,To date associated with OCCUR_SPAN_CODE_19.  Expected when corresponding OCCUR_SPAN_CODE is submitted.  Segment Repeat.,Claim,,,Y,649
Detail,OCCUR_SPAN_CODE_20,This field defines the Occurrence Span Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence span code is defined by a span of time rather than by a single date.  Segment Repeat.,Claim,,,Y,650
Detail,OCCUR_SPAN_FROM_DATE_20,From date associated with OCCUR_SPAN_CODE_20. Expected when corresponding OCCUR_SPAN_CODE is submitted.  Segment Repeat.,Claim,,,Y,651
Detail,OCCUR_SPAN_TO_DATE_20,To date associated with OCCUR_SPAN_CODE_20.  Expected when corresponding OCCUR_SPAN_CODE is submitted.  Segment Repeat.,Claim,,,Y,652
Detail,OCCUR_SPAN_CODE_21,This field defines the Occurrence Span Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence span code is defined by a span of time rather than by a single date.  Segment Repeat.,Claim,,,Y,653
Detail,OCCUR_SPAN_FROM_DATE_21,From date associated with OCCUR_SPAN_CODE_21. Expected when corresponding OCCUR_SPAN_CODE is submitted.  Segment Repeat.,Claim,,,Y,654
Detail,OCCUR_SPAN_TO_DATE_21,To date associated with OCCUR_SPAN_CODE_21.  Expected when corresponding OCCUR_SPAN_CODE is submitted.  Segment Repeat.,Claim,,,Y,655
Detail,OCCUR_SPAN_CODE_22,This field defines the Occurrence Span Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence span code is defined by a span of time rather than by a single date.  Segment Repeat.,Claim,,,Y,656
Detail,OCCUR_SPAN_FROM_DATE_22,From date associated with OCCUR_SPAN_CODE_22.  Expected when corresponding OCCUR_SPAN_CODE is submitted.  Segment Repeat.,Claim,,,Y,657
Detail,OCCUR_SPAN_TO_DATE_22,To date associated with OCCUR_SPAN_CODE_22.  Expected when corresponding OCCUR_SPAN_CODE is submitted.  Segment Repeat.,Claim,,,Y,658
Detail,OCCUR_SPAN_CODE_23,This field defines the Occurrence Span Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence span code is defined by a span of time rather than by a single date.  Segment Repeat.,Claim,,,Y,659
Detail,OCCUR_SPAN_FROM_DATE_23,From date associated with OCCUR_SPAN_CODE_23.  Expected when corresponding OCCUR_SPAN_CODE is submitted.  Segment Repeat.,Claim,,,Y,660
Detail,OCCUR_SPAN_TO_DATE_23,To date associated with OCCUR_SPAN_CODE_23.  Expected when corresponding OCCUR_SPAN_CODE is submitted.  Segment Repeat.,Claim,,,Y,661
Detail,OCCUR_SPAN_CODE_24,This field defines the Occurrence Span Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence span code is defined by a span of time rather than by a single date.,Claim,,,Y,662
Detail,OCCUR_SPAN_FROM_DATE_24,From date associated with OCCUR_SPAN_CODE_24.  Expected when corresponding OCCUR_SPAN_CODE is submitted. Segment Repeat.,Claim,,,Y,663
Detail,OCCUR_SPAN_TO_DATE_24,To date associated with OCCUR_SPAN_CODE_24.  Expected when corresponding OCCUR_SPAN_CODE is submitted. Segment Repeat.,Claim,,,Y,664
Detail,OCCUR_CODE_01,"This field defines the Occurrence Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence code is for a single date in time and does not span over multiple days.  (2300, HI01-4)",Claim,,,Y,665
Detail,OCCUR_DATE_01,"Date associated with OCCUR_CODE_01.  Expected when corresponding OCCUR_CODE is submitted.  (2300, HI01-4)",Claim,,,Y,666
Detail,OCCUR_CODE_02,"This field defines the Occurrence Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence code is for a single date in time and does not span over multiple days. (2300, HI02-2)",Claim,,,Y,667
Detail,OCCUR_DATE_02,"Date associated with OCCUR_CODE_02.  Expected when corresponding OCCUR_CODE is submitted.  (2300, HI02-4)",Claim,,,Y,668
Detail,OCCUR_CODE_03,"This field defines the Occurrence Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence code is for a single date in time and does not span over multiple days.   (2300, HI03-2)",Claim,,,Y,669
Detail,OCCUR_DATE_03,"Date associated with OCCUR_CODE_03.  Expected when corresponding OCCUR_CODE is submitted.   (2300, HI03-4)",Claim,,,Y,670
Detail,OCCUR_CODE_04,"This field defines the Occurrence Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence code is for a single date in time and does not span over multiple days.   (2300, HI04-2)",Claim,,,Y,671
Detail,OCCUR_DATE_04,"Date associated with OCCUR_CODE_04.  Expected when corresponding OCCUR_CODE is submitted.   (2300, HI04-4)",Claim,,,Y,672
Detail,OCCUR_CODE_05,"This field defines the Occurrence Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence code is for a single date in time and does not span over multiple days.   (2300, HI05-2)",Claim,,,Y,673
Detail,OCCUR_DATE_05,"Date associated with OCCUR_CODE_05.  Expected when corresponding OCCUR_CODE is submitted.  (2300, HI05-4)",Claim,,,Y,674
Detail,OCCUR_CODE_06,"This field defines the Occurrence Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence code is for a single date in time and does not span over multiple days.  (2300, HI06-2)",Claim,,,Y,675
Detail,OCCUR_DATE_06,"Date associated with OCCUR_CODE_06.  Expected when corresponding OCCUR_CODE is submitted.  (2300, HI06-4)",Claim,,,Y,676
Detail,OCCUR_CODE_07,"This field defines the Occurrence Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence code is for a single date in time and does not span over multiple days.  (2300, HI07-2)",Claim,,,Y,677
Detail,OCCUR_DATE_07,"Date associated with OCCUR_CODE_07.   Expected when corresponding OCCUR_CODE is submitted.  (2300, HI07-4)",Claim,,,Y,678
Detail,OCCUR_CODE_08,"This field defines the Occurrence Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence code is for a single date in time and does not span over multiple days.  (2300, HI08-2)",Claim,,,Y,679
Detail,OCCUR_DATE_08,"Date associated with OCCUR_CODE_08. Expected when corresponding OCCUR_CODE is submitted.  (2300, HI08-4)",Claim,,,Y,680
Detail,OCCUR_CODE_09,"This field defines the Occurrence Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence code is for a single date in time and does not span over multiple days.  (2300, HI09-2)",Claim,,,Y,681
Detail,OCCUR_DATE_09,"Date associated with OCCUR_CODE_09.  Expected when corresponding OCCUR_CODE is submitted.  (2300, HI09-4)",Claim,,,Y,682
Detail,OCCUR_CODE_10,"This field defines the Occurrence Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence code is for a single date in time and does not span over multiple days. (2300, HI10-2)",Claim,,,Y,683
Detail,OCCUR_DATE_10,"Date associated with OCCUR_CODE_10.  Expected when corresponding OCCUR_CODE is submitted.   (2300, HI10-4)",Claim,,,Y,684
Detail,OCCUR_CODE_11,"This field defines the Occurrence Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence code is for a single date in time and does not span over multiple days.  (2300, HI11-2)",Claim,,,Y,685
Detail,OCCUR_DATE_11,"Date associated with OCCUR_CODE_11.  Expected when corresponding OCCUR_CODE is submitted. (2300, HI11-4)",Claim,,,Y,686
Detail,OCCUR_CODE_12,"This field defines the Occurrence Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence code is for a single date in time and does not span over multiple days.  (2300, HI12-2)",Claim,,,Y,687
Detail,OCCUR_DATE_12,"Date associated with OCCUR_CODE_12.  Expected when corresponding OCCUR_CODE is submitted.  (2300, HI12-4)",Claim,,,Y,688
Detail,OCCUR_CODE_13,This field defines the Occurrence Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence code is for a single date in time and does not span over multiple days.  Segment Repeat,Claim,,,Y,689
Detail,OCCUR_DATE_13,Date associated with OCCUR_CODE_13.  Expected when corresponding OCCUR_CODE is submitted.  Segment Repeat,Claim,,,Y,690
Detail,OCCUR_CODE_14,This field defines the Occurrence Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence code is for a single date in time and does not span over multiple days. Segment Repeat,Claim,,,Y,691
Detail,OCCUR_DATE_14,Date associated with OCCUR_CODE_14. Expected when corresponding OCCUR_CODE is submitted.  Segment Repeat,Claim,,,Y,692
Detail,OCCUR_CODE_15,This field defines the Occurrence Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence code is for a single date in time and does not span over multiple days. Segment Repeat,Claim,,,Y,693
Detail,OCCUR_DATE_15,Date associated with OCCUR_CODE_15.  Expected when corresponding OCCUR_CODE is submitted.  Segment Repeat,Claim,,,Y,694
Detail,OCCUR_CODE_16,This field defines the Occurrence Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence code is for a single date in time and does not span over multiple days. Segment Repeat,Claim,,,Y,695
Detail,OCCUR_DATE_16,Date associated with OCCUR_CODE_16.  Expected when corresponding OCCUR_CODE is submitted.  Segment Repeat,Claim,,,Y,696
Detail,OCCUR_CODE_17,This field defines the Occurrence Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence code is for a single date in time and does not span over multiple days. Segment Repeat,Claim,,,Y,697
Detail,OCCUR_DATE_17,Date associated with OCCUR_CODE_17.  Expected when corresponding OCCUR_CODE is submitted. Segment Repeat,Claim,,,Y,698
Detail,OCCUR_CODE_18,This field defines the Occurrence Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence code is for a single date in time and does not span over multiple days. Segment Repeat,Claim,,,Y,699
Detail,OCCUR_DATE_18,Date associated with OCCUR_CODE_18.  Expected when corresponding OCCUR_CODE is submitted.  Segment Repeat,Claim,,,Y,700
Detail,OCCUR_CODE_19,This field defines the Occurrence Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence code is for a single date in time and does not span over multiple days. Segment Repeat,Claim,,,Y,701
Detail,OCCUR_DATE_19,Date associated with OCCUR_CODE_19.  Expected when corresponding OCCUR_CODE is submitted. Segment Repeat,Claim,,,Y,702
Detail,OCCUR_CODE_20,This field defines the Occurrence Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence code is for a single date in time and does not span over multiple days. Segment Repeat,Claim,,,Y,703
Detail,OCCUR_DATE_20,Date associated with OCCUR_CODE_20.  Expected when corresponding OCCUR_CODE is submitted. Segment Repeat.,Claim,,,Y,704
Detail,OCCUR_CODE_21,This field defines the Occurrence Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence code is for a single date in time and does not span over multiple days.,Claim,,,Y,705
Detail,OCCUR_DATE_21,Date associated with OCCUR_CODE_21.  Expected when corresponding OCCUR_CODE is submitted.  Segment Repeat,Claim,,,Y,706
Detail,OCCUR_CODE_22,This field defines the Occurrence Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence code is for a single date in time and does not span over multiple days. Segment Repeat,Claim,,,Y,707
Detail,OCCUR_DATE_22,Date associated with OCCUR_CODE_22.  Expected when corresponding OCCUR_CODE is submitted.  Segment Repeat,Claim,,,Y,708
Detail,OCCUR_CODE_23,This field defines the Occurrence Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence code is for a single date in time and does not span over multiple days. Segment Repeat,Claim,,,Y,709
Detail,OCCUR_DATE_23,Date associated with OCCUR_CODE_23.  Expected when corresponding OCCUR_CODE is submitted.  Segment Repeat,Claim,,,Y,710
Detail,OCCUR_CODE_24,This field defines the Occurrence Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence code is for a single date in time and does not span over multiple days. Segment Repeat,Claim,,,Y,711
Detail,OCCUR_DATE_24,Date associated with OCCUR_CODE_24.  Expected when corresponding OCCUR_CODE is submitted.  Segment Repeat,Claim,,,Y,712
Detail,DOCUMENT_CONTROL_NUMBER,The value in this field represents the client specific document control number.,Claim,,,N,713
Detail,CLAIM_ATTACHMENT_TYPE_CODE,"This field indicates the title or contents of a document, report or supporting item.  Expected values are defined in the CMS 837 transaction.  (2300, PWK01)",Claim,,,N,714
Detail,CLAIM_ATTACHMENT_TRANSMIT_CODE,"This field represents the code defining timing, transmission method or format by which reports are to be sent.  Expected values are defined in the CMS 837 transaction.  (2300, PWK02)",Claim,,,N,715
Detail,CLAIM_ACN,"This field represents the code designating the system/method of code structure used for identification.  (2300, PWK05)",Claim,,,N,716
Detail,CLAIM_ATTACHMENT_TYPE_CODE_01,"This field indicates the title or contents of a document, report or supporting item.  Expected values are defined in the CMS 837 transaction.  (2300, PWK01)",Claim,,,N,717
Detail,CLAIM_ATTACHMENT_TRANSMIT_CODE_01,"This field represents the code defining timing, transmission method or format by which reports are to be sent.  Expected values are defined in the CMS 837 transaction.  (2300, PWK02)",Claim,,,N,718
Detail,CLAIM_ACN_01,"This field represents the code designating the system/method of code structure used for identification.  (2300, PWK05)",Claim,,,N,719
Detail,CLAIM_ATTACHMENT_TYPE_CODE_02,"This field indicates the title or contents of a document, report or supporting item.  Expected values are defined in the CMS 837 transaction.  (2300, PWK01)",Claim,,,N,720
Detail,CLAIM_ATTACHMENT_TRANSMIT_CODE_02,"This field represents the code defining timing, transmission method or format by which reports are to be sent.  Expected values are defined in the CMS 837 transaction.  (2300, PWK02)",Claim,,,N,721
Detail,CLAIM_ACN_02,"This field represents the code designating the system/method of code structure used for identification.  (2300, PWK05)",Claim,,,N,722
Detail,CLAIM_ATTACHMENT_TYPE_CODE_03,"This field indicates the title or contents of a document, report or supporting item.  Expected values are defined in the CMS 837 transaction.  (2300, PWK01)",Claim,,,N,723
Detail,CLAIM_ATTACHMENT_TRANSMIT_CODE_03,"This field represents the code defining timing, transmission method or format by which reports are to be sent.  Expected values are defined in the CMS 837 transaction.  (2300, PWK02)",Claim,,,N,724
Detail,CLAIM_ACN_03,"This field represents the code designating the system/method of code structure used for identification.  (2300, PWK05)",Claim,,,N,725
Detail,CLAIM_ATTACHMENT_TYPE_CODE_04,"This field indicates the title or contents of a document, report or supporting item.  Expected values are defined in the CMS 837 transaction.  (2300, PWK01)",Claim,,,N,726
Detail,CLAIM_ATTACHMENT_TRANSMIT_CODE_04,"This field represents the code defining timing, transmission method or format by which reports are to be sent.  Expected values are defined in the CMS 837 transaction.  (2300, PWK02)",Claim,,,N,727
Detail,CLAIM_ACN_04,"This field represents the code designating the system/method of code structure used for identification.  (2300, PWK05)",Claim,,,N,728
Detail,CLAIM_ATTACHMENT_TYPE_CODE_05,"This field indicates the title or contents of a document, report or supporting item.  Expected values are defined in the CMS 837 transaction.  (2300, PWK01)",Claim,,,N,729
Detail,CLAIM_ATTACHMENT_TRANSMIT_CODE_05,"This field represents the code defining timing, transmission method or format by which reports are to be sent.  Expected values are defined in the CMS 837 transaction.  (2300, PWK02)",Claim,,,N,730
Detail,CLAIM_ACN_05,"This field represents the code designating the system/method of code structure used for identification.  (2300, PWK05)",Claim,,,N,731
Detail,CLAIM_ATTACHMENT_TYPE_CODE_06,"This field indicates the title or contents of a document, report or supporting item.  Expected values are defined in the CMS 837 transaction.  (2300, PWK01)",Claim,,,N,732
Detail,CLAIM_ATTACHMENT_TRANSMIT_CODE_06,"This field represents the code defining timing, transmission method or format by which reports are to be sent.  Expected values are defined in the CMS 837 transaction.  (2300, PWK02)",Claim,,,N,733
Detail,CLAIM_ACN_06,"This field represents the code designating the system/method of code structure used for identification.  (2300, PWK05)",Claim,,,N,734
Detail,CLAIM_ATTACHMENT_TYPE_CODE_07,"This field indicates the title or contents of a document, report or supporting item.  Expected values are defined in the CMS 837 transaction.  (2300, PWK01)",Claim,,,N,735
Detail,CLAIM_ATTACHMENT_TRANSMIT_CODE_07,"This field represents the code defining timing, transmission method or format by which reports are to be sent.  Expected values are defined in the CMS 837 transaction.  (2300, PWK02)",Claim,,,N,736
Detail,CLAIM_ACN_07,"This field represents the code designating the system/method of code structure used for identification.  (2300, PWK05)",Claim,,,N,737
Detail,CLAIM_ATTACHMENT_TYPE_CODE_08,"This field indicates the title or contents of a document, report or supporting item.  Expected values are defined in the CMS 837 transaction.  (2300, PWK01)",Claim,,,N,738
Detail,CLAIM_ATTACHMENT_TRANSMIT_CODE_08,"This field represents the code defining timing, transmission method or format by which reports are to be sent.  Expected values are defined in the CMS 837 transaction.  (2300, PWK02)",Claim,,,N,739
Detail,CLAIM_ACN_08,"This field represents the code designating the system/method of code structure used for identification.  (2300, PWK05)",Claim,,,N,740
Detail,CLAIM_ATTACHMENT_TYPE_CODE_09,"This field indicates the title or contents of a document, report or supporting item.  Expected values are defined in the CMS 837 transaction.  (2300, PWK01)",Claim,,,N,741
Detail,CLAIM_ATTACHMENT_TRANSMIT_CODE_09,"This field represents the code defining timing, transmission method or format by which reports are to be sent.  Expected values are defined in the CMS 837 transaction.  (2300, PWK02)",Claim,,,N,742
Detail,CLAIM_ACN_09,"This field represents the code designating the system/method of code structure used for identification.  (2300, PWK05)",Claim,,,N,743
Detail,CLAIM_ATTACHMENT_TYPE_CODE_10,"This field indicates the title or contents of a document, report or supporting item.  Expected values are defined in the CMS 837 transaction.  (2300, PWK01)",Claim,,,N,744
Detail,CLAIM_ATTACHMENT_TRANSMIT_CODE_10,"This field represents the code defining timing, transmission method or format by which reports are to be sent.  Expected values are defined in the CMS 837 transaction.  (2300, PWK02)",Claim,,,N,745
Detail,CLAIM_ACN_10,"This field represents the code designating the system/method of code structure used for identification.  (2300, PWK05)",Claim,,,N,746
Detail,ADJUSTMENT_NUMBER,"The value in this field provides information on how many adjustments have been made to the claim line (0 - original, greater than 0 indicates times adjusted).",Line,,,N,747
Detail,ADJ_CODE_01,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored 'at this time.  This field is line level.",Line,,,N,748
Detail,ADJ_TYPE_01,"This field defines the source of the line level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc. Expected if corresponding ADJ_CODE is present.",Line,,,N,749
Detail,ADJUSTOR_ID_01,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted. Expected if corresponding ADJ_CODE is present.,Line,,,N,750
Detail,ADJ_CODE_02,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is line level.",Line,,,N,751
Detail,ADJ_TYPE_02,"This field defines the source of the line level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc. Expected if corresponding ADJ_CODE is present.",Line,,,N,752
Detail,ADJUSTOR_ID_02,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted. Expected if corresponding ADJ_CODE is present.,Line,,,N,753
Detail,ADJ_CODE_03,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is line level.",Line,,,N,754
Detail,ADJ_TYPE_03,"This field defines the source of the line level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc. Expected if corresponding ADJ_CODE is present.",Line,,,N,755
Detail,ADJUSTOR_ID_03,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted. Expected if corresponding ADJ_CODE is present.,Line,,,N,756
Detail,ADJ_CODE_04,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is line level.",Line,,,N,757
Detail,ADJ_TYPE_04,"This field defines the source of the line level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc. Expected if corresponding ADJ_CODE is present.",Line,,,N,758
Detail,ADJUSTOR_ID_04,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted. Expected if corresponding ADJ_CODE is present.,Line,,,N,759
Detail,ADJ_CODE_05,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is line level.",Line,,,N,760
Detail,ADJ_TYPE_05,"This field defines the source of the line level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc. Expected if corresponding ADJ_CODE is present.",Line,,,N,761
Detail,ADJUSTOR_ID_05,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted. Expected if corresponding ADJ_CODE is present.,Line,,,N,762
Detail,ADJ_CODE_06,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is line level.",Line,,,N,763
Detail,ADJ_TYPE_06,"This field defines the source of the line level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc. Expected if corresponding ADJ_CODE is present.",Line,,,N,764
Detail,ADJUSTOR_ID_06,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding ADJ_CODE is present.,Line,,,N,765
Detail,ADJ_CODE_07,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.",Line,,,N,766
Detail,ADJ_TYPE_07,"This field defines the source of the line level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc. Expected if corresponding ADJ_CODE is present.",Line,,,N,767
Detail,ADJUSTOR_ID_07,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding ADJ_CODE is present.,Line,,,N,768
Detail,ADJ_CODE_08,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is line level.",Line,,,N,769
Detail,ADJ_TYPE_08,"This field defines the source of the line level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding ADJ_CODE is present.",Line,,,N,770
Detail,ADJUSTOR_ID_08,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding ADJ_CODE is present.,Line,,,N,771
Detail,ADJ_CODE_09,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is line level.",Line,,,N,772
Detail,ADJ_TYPE_09,"This field defines the source of the line level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding ADJ_CODE is present.",Line,,,N,773
Detail,ADJUSTOR_ID_09,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding ADJ_CODE is present.,Line,,,N,774
Detail,ADJ_CODE_10,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is line level.",Line,,,N,775
Detail,ADJ_TYPE_10,"This field defines the source of the line level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding ADJ_CODE is present.",Line,,,N,776
Detail,ADJUSTOR_ID_10,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding ADJ_CODE is present.,Line,,,N,777
Detail,CLAIM_ADJUSTMENT_NUMBER,"The value in this field provides information on how many adjustments have been made to the claim (0 - original, greater than 0 indicates number of times adjusted).",Claim,,,N,778
Detail,CLAIM_ADJ_CODE_01,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is claim level.",Claim,,,N,779
Detail,CLAIM_ADJ_TYPE_01,"This field defines the source of the claim level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding CLAIM_ADJ_CODE is present.",Claim,,,N,780
Detail,CLAIM_ADJUSTOR_ID_01,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding CLAIM_ADJ_CODE is present.,Claim,,,N,781
Detail,CLAIM_ADJ_CODE_02,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is claim level.",Claim,,,N,782
Detail,CLAIM_ADJ_TYPE_02,"This field defines the source of the claim level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding CLAIM_ADJ_CODE is present.",Claim,,,N,783
Detail,CLAIM_ADJUSTOR_ID_02,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding CLAIM_ADJ_CODE is present.,Claim,,,N,784
Detail,CLAIM_ADJ_CODE_03,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is claim level.",Claim,,,N,785
Detail,CLAIM_ADJ_TYPE_03,"This field defines the source of the claim level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding CLAIM_ADJ_CODE is present.",Claim,,,N,786
Detail,CLAIM_ADJUSTOR_ID_03,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding CLAIM_ADJ_CODE is present.,Claim,,,N,787
Detail,CLAIM_ADJ_CODE_04,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is claim level.",Claim,,,N,788
Detail,CLAIM_ADJ_TYPE_04,"This field defines the source of the claim level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding CLAIM_ADJ_CODE is present.",Claim,,,N,789
Detail,CLAIM_ADJUSTOR_ID_04,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding CLAIM_ADJ_CODE is present.,Claim,,,N,790
Detail,CLAIM_ADJ_CODE_05,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is claim level.",Claim,,,N,791
Detail,CLAIM_ADJ_TYPE_05,"This field defines the source of the claim level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding CLAIM_ADJ_CODE is present.",Claim,,,N,792
Detail,CLAIM_ADJUSTOR_ID_05,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding CLAIM_ADJ_CODE is present.,Claim,,,N,793
Detail,CLAIM_ADJ_CODE_06,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is claim level.",Claim,,,N,794
Detail,CLAIM_ADJ_TYPE_06,"This field defines the source of the claim level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding CLAIM_ADJ_CODE is present.",Claim,,,N,795
Detail,CLAIM_ADJUSTOR_ID_06,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding CLAIM_ADJ_CODE is present.,Claim,,,N,796
Detail,CLAIM_ADJ_CODE_07,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is claim level.",Claim,,,N,797
Detail,CLAIM_ADJ_TYPE_07,"This field defines the source of the claim level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding CLAIM_ADJ_CODE is present.",Claim,,,N,798
Detail,CLAIM_ADJUSTOR_ID_07,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding CLAIM_ADJ_CODE is present.,Claim,,,N,799
Detail,CLAIM_ADJ_CODE_08,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is claim level.",Claim,,,N,800
Detail,CLAIM_ADJ_TYPE_08,"This field defines the source of the claim level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding CLAIM_ADJ_CODE is present.",Claim,,,N,801
Detail,CLAIM_ADJUSTOR_ID_08,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding CLAIM_ADJ_CODE is present.,Claim,,,N,802
Detail,CLAIM_ADJ_CODE_09,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is claim level.",Claim,,,N,803
Detail,CLAIM_ADJ_TYPE_09,"This field defines the source of the claim level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding CLAIM_ADJ_CODE is present.",Claim,,,N,804
Detail,CLAIM_ADJUSTOR_ID_09,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding CLAIM_ADJ_CODE is present.,Claim,,,N,805
Detail,CLAIM_ADJ_CODE_10,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is claim level.",Claim,,,N,806
Detail,CLAIM_ADJ_TYPE_10,"This field defines the source of the claim level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding CLAIM_ADJ_CODE is present.",Claim,,,N,807
Detail,CLAIM_ADJUSTOR_ID_10,Client employee who actually made the claim level adjustment.  Expected if corresponding CLAIM_ADJ_CODE is present.,Claim,,,N,808
Detail,ANESTHESIA_TIME,This field represents the amount of time that anesthesia was administered to the patient during the service provided.  Time is submitted in whole minutes.,Line,,,N,809
Detail,CHECK_NUM,This field stores the actual check number on which this claim was paid. For incoming (TBA) claims the field should be left blank. The actual check number is populated in the history file.,Claim,,,N,810
Detail,PLATFORM_CODE,"Please provide the name of the claim system used to process the claim.  Examples are Nasco, Facets, Amysis, Power MHS, etc.",Claim,,,N,811
Detail,DATA_SOURCE,"The value in this field defines from where the claim data was pulled within the client’s platform. For example, if the client is a Facets client, the client platform would be Facets and the data may have been pulled from the Data Warehouse.",Claim,,,N,812
Detail,EMERGENCY_INDICATOR_YN,"Is populated if the service was emergency service.  This field defines whether or not the service being billed is the result of an EPSDT screening service and is required by CMS when Medicaid services are the result of a screening referral.  The screening service would be submitted with the value 'N'.  A 'Y' value indicates EPSDT involvement; an 'N' value indicates no EPSDT involvement. (2400, SV111)",Line,,,N,813
Detail,PAPER_INDICATOR,"Claim submission type. Valid values are:
P - Paper
E - Electronic",Claim,,,N,814
Detail,CIT_RESTRICTED_ID,This field is a free-form field used to define CIT restrictions that allow clients to define an appropriate level of security for internal data access. This field is not to be used until the client and Implementation Services Director determine a need.,Claim,,,N,815
Detail,CV_US_ONLY_YN,The value in this field indicates whether the claim has to be routed to U.S. only resources. A 'Y' value indicates the claim has to be routed to U.S. only resources.,Claim,,,N,816
Detail,CDF_TEXT_01,Line level client defined field.  Use of this field should be discussed to ensure proper utilization and storage prior to the addition of data in the file.  Data provided in this field will be reflected on the Invoice Detail Report (IDR).,Line,,,N,817
Detail,CDF_TEXT_02,Line level client defined field.  Use of this field should be discussed to ensure proper utilization and storage prior to the addition of data in the file.  Data provided in this field will be reflected on the Invoice Detail Report (IDR).,Line,,,N,818
Detail,CDF_TEXT_03,Line level client defined field.  Use of this field should be discussed to ensure proper utilization and storage prior to the addition of data in the file.  Data provided in this field will be reflected on the Invoice Detail Report (IDR).,Line,,,N,819
Detail,CLAIM_CDF_TEXT_01,Claim level client defined field.  Use of this field should be discussed to ensure proper utilization and storage prior to the addition of data in the file.,Claim,,,N,820
Detail,CLAIM_CDF_TEXT_02,Claim level client defined field.  Use of this field should be discussed to ensure proper utilization and storage prior to the addition of data in the file.,Claim,,,N,821
Detail,CLAIM_CDF_TEXT_03,Claim level client defined field.  Use of this field should be discussed to ensure proper utilization and storage prior to the addition of data in the file.,Claim,,,N,822
Detail,SUB_MEMBER_GROUP_NUMBER,The value in this field represents the Subscriber's group number ( 2000B.SBR03 ),Claim,,,Y,823
Detail,SUB_CLAIM_FILING_CODE,"The claim filing indicator is a CMS value that identifies the type of insurance for the submitted claim.  This is not to be confused with the CLAIM_TYPE of this layout. Expected values are found on a separate tab.  (2000B, SBR02) (2000C, PAT06)",Claim,,,Y,824
Detail,ASSIGNMENT_ACCEPTANCE,"The value in this field represents whether the Provider agrees to accept assignment under terms of the
payer's program, select ""Yes"" from the drop-down list. Otherwise,
select ""No."" (2300.CLM08)",Claim,,,Y,825
Detail,INFORMATION_RELEASE,"The value in this field represents whether the Patient has signed the release, allowing the sharing of the information (2300.CLM09)",Claim,,,Y,826
Detail,REPRICER_NAME,The value in the field represent the Name of the Repricer,Line,,,Y,827
Detail,CLAIM_FREQUENCY_CODE,"This code specifies the frequency of the claim and is the third position of the UBC Form Bill Type.  (2300, CLM05-3)",Claim,,,Y,828
Detail,SUB_HCPCS_DESC,The value in this field represents the Level1 (CPT) or Level2 (HCPCS) procedure code description submitted by the provider for this service line (2400.SV202.07),Line,,,Y,829
Detail,CLAIM_NUM,The value in this field represent the claim fact key or the Claim versioning number.,Claim,,,Y,830
Detail,RECORD_IDENTIFIER,The value in this field represent the unique identifier of a claim record used for tracking,Claim,,,Y,831
Detail,RAY_IDENTIFIER,The value in this field represent the unique identifier of a claim used for tracking even during retry the claim,Claim,,,Y,832
Detail,EXECUTION_IDENTIFIER,The value in this field represent the unique identifier on a job level used for tracking,Claim,,,Y,833
,,,,,,,
Trailer,TRAILER_CONSTANT,Field valued with ‘TRAILER’,File,,,Y,1
Trailer,DETAIL_COUNT,This field contains the total number of DETAIL records in the file.,File,,,Y,2
Trailer,RUN_DATE,This field contains the date of the file run.,File,,,Y,3
Trailer,RUN_TIME,This field contains the time of the file run.,File,,,Y,4
Trailer,FILLER,"For Fixed Width files only.  The trailer record is right-padded with spaces to equal the full length of the claim data records, taking into account the characters included in the client defined field.

The length of this field varies depending on number of characters in detail line.  The ending position will have the same ending character as the detail line.",File,,,Y,5
```

## Repricer OB-IB/OB Repricer/V26.1.0.0/EdifecsProduct_MappingSpec_OB Repricer_837_DFF_to_EDI Conversion_V2.1.xlsx — 837P CDS Values 

```csv
CDS VALUE / Hardcode,Position,Level
Header,,
Header_Prefix,1,File
FILE_TYPE,2,File
FILE_SEQ,3,File
PRODUCED_DATE,4,File
RECORD_COUNT,5,File
FILE_INDICATOR,6,File
FILLER,7,File
TYPE_OF_FILE,8,File
Details,,
TAG_VALUE_PREFIX,1,Claim
TYPE_OF_FILE,2,Claim
SUB_ID,3,Claim
PATIENT_DOB,5,Claim
PATIENT_GENDER_ID,6,Claim
PATIENT_CONTROL_NUM,11,Claim
PATIENT_LAST_NAME,12,Claim
PATIENT_FIRST_NAME,13,Claim
PATIENT_MIDDLE_NAME,14,Claim
PATIENT_NAME_SUFFIX,15,Claim
RELATIONSHIP_TO_SUB,16,Claim
CLAIM_ID,19,Claim
MED_REC_NO,21,Claim
DIAGNOSIS_CODE_1,23,CLaim
DIAGNOSIS_CODE_2,25,CLaim
DIAGNOSIS_CODE_3,27,CLaim
DIAGNOSIS_CODE_4,29,CLaim
DIAGNOSIS_CODE_5,31,CLaim
DIAGNOSIS_CODE_6,33,CLaim
DIAGNOSIS_CODE_7,35,CLaim
DIAGNOSIS_CODE_8,37,CLaim
DIAGNOSIS_CODE_9,39,CLaim
DIAGNOSIS_CODE_10,41,CLaim
DIAGNOSIS_CODE_11,43,CLaim
DIAGNOSIS_CODE_12,45,CLaim
DIAGNOSIS_CODE_13,47,CLaim
REFERRING_NPI,80,Line
RENDERING_PRACTITIONER__TAXONOMY_CODE,83,Line
RENDERING_PRACTITIONER__LAST_NAME,85,Line
RENDERING_PRACTITIONER__FIRST_NAME,86,Line
RENDERING_PRACTITIONER__MIDDLE_NAME,87,Line
RENDERING_PRACTITIONER__NAME_SUFFIX,88,Line
BILLING_STATE_LICENSE,105,Line
BILLING_TAXGROUP_ID,106,Line
BILLING_NPI,107,Line
Hard code as '2',112,Line
BILLING_LAST_NAME,113,Line
BILLING_FIRST_NAME,114,Line
BILLING_MIDDLE_NAME,115,Line
BILLING_NAME_SUFFIX,116,Line
BILLING_ADDRESS_1,117,Line
BILLING_ADDRESS_2,118,Line
BILLING_CITY,119,Line
BILLING_STATE,120,Line
(BILLING_ZIP) + (BILLING_ZIP_PLUS_4),122,Line
BILLING_COUNTRY,123,Line
LINE_SEQ,141,Line
POS_ID,144,Line
POS_ID,144,Line
DIAG_PTR1,146,Line
DIAG_PTR2,146,Line
DIAG_PTR3,146,Line
DIAG_PTR4,146,Line
SUB_HCPCS,158,Line
SUB_MOD_01,159,Line
SUB_MOD_02,160,Line
SUB_MOD_03,161,Line
SUB_MOD_04,162,Line
SUB_UNITS,168,Line
SUB_AMOUNT,169,Line
SUB_NDC,171,Line
SUB_NDC_UNITS,172,Line
SUB_NDC_UNITS_TYPE,173,Line
ASSIGNMENT_OF_BENEFITS,207,Claim
CLAIM_BILLED_AMOUNT,208,Claim
CLAIM_ID_ORIG,237,Claim
SUB_CLAIM_FILING_CODE,242,Claim
SUB_LAST_NAME,243,Claim
SUB_FIRST_NAME,244,Claim
SUB_MIDDLE_NAME,245,Claim
SUB_NAME_SUFFIX,246,Claim
SUB_ADDRESS_1,247,Claim
SUB_ADDDRESS_2,248,Claim
SUB_CITY,249,Claim
SUB_STATE,250,Claim
SUB_COUNTRY,253,Claim
SUB_DOB,255,Claim
SUB_GENDER_ID,256,Claim
PATIENT_ADDRESS_1,258,Claim
PATIENT_ADDRESS_2,259,Claim
PATIENT_CITY,260,Claim
PATIENT_STATE,261,Claim
PATIENT_COUNTRY,264,Claim
PAY_TO_ADDRESS_1,272,Line
PAY_TO_ADDRESS_2,273,Line
PAY_TO_CITY,274,Line
PAY_TO_STATE,275,Line
PAY_TO_COUNTRY,278,Line
REFERRING_NPI,80,Line
REFERRING_LAST_NAME,288,Line
REFERRING_FIRST_NAME,289,Line
REFERRING_MIDDLE_NAME,290,Line
REFERRING_NAME_SUFFIX,291,Line
CLAIM_FREQUENCY_CODE,426,Claim
SUB_MEMBER_GROUP_NUMBER,503,Claim
PROVIDER_SIGNATURE_PRESENT,504,Claim
ASSIGNMENT_ACCEPTANCE,505,Claim
INFORMATION_RELEASE,506,Claim
Rendering_Facility_ Address_Country,514,Claim
REPRICER_NAME,515,Line
"BILLING_PHONE_COUNTRY_CODE +
BILLING_PHONE + BILLING_PHONE_EXT",126+127+128,Line
"BILLING_FAX_COUNTRY_CODE +
BILLING_FAX",132 + 133,Line
DOS_FROM - DOS_TO,142 + 143,Line
(SUB_ZIP) + ( SUB_ZIP_PLUS_4),251 + 252,Claim
(PATIENT_ZIP) + (PATIENT_ZIP_PLUS_4),262 + 263,Claim
(PAY_TO_ZIP) + (PAY_TO_ZIP_PLUS_4),276 + 277,Line
Rendering_Facility_ Name,507,Claim
Rendering_Facility_ NPI,508,Claim
Rendering_Facility_ Address_1,509,Claim
Rendering_Facility_ Address_2,510,Claim
Rendering_Facility_ Address_City,511,Claim
Rendering_Facility_ Address_State,512,Claim
Rendering_Facility_ Address_Zip + Rendering_Facility_ Addres_ZIP_PLUS_4,513,Claim
,,
TRAILER_CONSTANT,1,File
DETAIL_COUNT,2,File
RUN_DATE,3,File
RUN_TIME,4,File
FILLER,5,File
```

## Repricer OB-IB/OB Repricer/V26.1.0.0/EdifecsProduct_MappingSpec_OB Repricer_837_DFF_to_EDI Conversion_V2.1.xlsx — 837I CDS Values 

```csv
CDS VALUE / Hardcode,Position,Level
Header,,
Header_Prefix,1,File
FILE_TYPE,2,File
FILE_SEQ,3,File
PRODUCED_DATE,4,File
RECORD_COUNT,5,File
FILE_INDICATOR,6,File
FILLER,7,File
TYPE_OF_FILE,8,File
Details,,
TAG_VALUE_PREFIX,1,Claim
TYPE_OF_FILE,2,Claim
SUB_ID,3,Claim
PATIENT_DOB,5,Claim
PATIENT_GENDER_ID,6,Claim
PATIENT_CONTROL_NUMBER,11,Claim
PATIENT_LAST_NAME,12,Claim
PATIENT_FIRST_NAME,13,Claim
PATIENT_MIDDLE_NAME,14,Claim
PATIENT_NAME_SUFFIX,15,Claim
RELATIONSHIP_TO_SUB,16,Claim
CLAIM_ID,18,Claim
MED_REC_NO,20,Claim
BILL_TYPE,21,Claim
CONDITION_CODE_1,22,Claim
CONDITION_CODE_2,23,Claim
CONDITION_CODE_3,24,Claim
CONDITION_CODE_4,25,Claim
CONDITION_CODE_5,26,Claim
CONDITION_CODE_6,27,Claim
CONDITION_CODE_7,28,Claim
CONDITION_CODE_8,29,Claim
CONDITION_CODE_9,30,Claim
CONDITION_CODE_10,31,Claim
CONDITION_CODE_11,32,Claim
CONDITION_CODE_12,33,Claim
CONDITION_CODE_13,34,Claim
CONDITION_CODE_14,35,Claim
CONDITION_CODE_15,36,Claim
CONDITION_CODE_16,37,Claim
CONDITION_CODE_17,38,Claim
CONDITION_CODE_18,39,Claim
CONDITION_CODE_19,40,Claim
CONDITION_CODE_20,41,Claim
CONDITION_CODE_21,42,Claim
CONDITION_CODE_22,43,Claim
CONDITION_CODE_23,44,Claim
CONDITION_CODE_24,45,Claim
VALUE_CODE_1,46,Claim
VALUE_AMOUNT_1,47,Claim
VALUE_CODE_2,48,Claim
VALUE_AMOUNT_2,49,Claim
VALUE_CODE_3,50,Claim
VALUE_AMOUNT_3,51,Claim
VALUE_CODE_4,52,Claim
VALUE_AMOUNT_4,53,Claim
VALUE_CODE_5,54,Claim
VALUE_AMOUNT_5,55,Claim
VALUE_CODE_6,56,Claim
VALUE_AMOUNT_6,57,Claim
VALUE_CODE_7,58,Claim
VALUE_AMOUNT_7,59,Claim
VALUE_CODE_8,60,Claim
VALUE_AMOUNT_8,61,Claim
VALUE_CODE_9,62,Claim
VALUE_AMOUNT_9,63,Claim
VALUE_CODE_10,64,Claim
VALUE_AMOUNT_10,65,Claim
VALUE_CODE_11,66,Claim
VALUE_AMOUNT_11,67,Claim
VALUE_CODE_12,68,Claim
VALUE_AMOUNT_12,69,Claim
VALUE_CODE_13,70,Claim
VALUE_AMOUNT_13,71,Claim
VALUE_CODE_14,72,Claim
VALUE_AMOUNT_14,73,Claim
VALUE_CODE_15,74,Claim
VALUE_AMOUNT_15,75,Claim
VALUE_CODE_16,76,Claim
VALUE_AMOUNT_16,77,Claim
VALUE_CODE_17,78,Claim
VALUE_AMOUNT_17,79,Claim
VALUE_CODE_18,80,Claim
VALUE_AMOUNT_18,81,Claim
VALUE_CODE_19,82,Claim
VALUE_AMOUNT_19,83,Claim
VALUE_CODE_20,84,Claim
VALUE_AMOUNT_20,85,Claim
VALUE_CODE_21,86,Claim
VALUE_AMOUNT_21,87,Claim
VALUE_CODE_22,88,Claim
VALUE_AMOUNT_22,89,Claim
VALUE_CODE_23,90,Claim
VALUE_AMOUNT_23,91,Claim
VALUE_CODE_24,92,Claim
VALUE_AMOUNT_24,93,Claim
ADMIT_TYPE,100,Claim
ADMIT_SOURCE_CODE,101,Claim
DISCHARGE_TIME_HH,103,Claim
DISCHARGE_STATUS,105,Claim
PRINCIPAL_DIAGNOSIS_CODE,121,Claim
PRINCIPAL_DIAGNOSIS_POA,122,Claim
OTHER_DIAGNOSIS_CODE_2,124,Claim
OTHER_DIAGNOSIS_CODE_2_POA,125,Claim
OTHER_DIAGNOSIS_CODE_3,127,Claim
OTHER_DIAGNOSIS_CODE_3_POA,128,Claim
OTHER_DIAGNOSIS_CODE_4,130,Claim
OTHER_DIAGNOSIS_CODE_4_POA,131,Claim
OTHER_DIAGNOSIS_CODE_5,133,Claim
OTHER_DIAGNOSIS_CODE_5_POA,134,Claim
OTHER_DIAGNOSIS_CODE_6,136,Claim
OTHER_DIAGNOSIS_CODE_6_POA,137,Claim
OTHER_DIAGNOSIS_CODE_7,139,Claim
OTHER_DIAGNOSIS_CODE_7_POA,140,Claim
OTHER_DIAGNOSIS_CODE_8,142,Claim
OTHER_DIAGNOSIS_CODE_8_POA,143,Claim
OTHER_DIAGNOSIS_CODE_9,145,Claim
OTHER_DIAGNOSIS_CODE_9_POA,146,Claim
OTHER_DIAGNOSIS_CODE_10,148,Claim
OTHER_DIAGNOSIS_CODE_10_POA,149,Claim
OTHER_DIAGNOSIS_CODE_11,151,Claim
OTHER_DIAGNOSIS_CODE_11_POA,152,Claim
OTHER_DIAGNOSIS_CODE_12,154,Claim
OTHER_DIAGNOSIS_CODE_12_POA,155,Claim
OTHER_DIAGNOSIS_CODE_13,157,Claim
OTHER_DIAGNOSIS_CODE_13_POA,158,Claim
OTHER_DIAGNOSIS_CODE_14,160,Claim
OTHER_DIAGNOSIS_CODE_14_POA,161,Claim
OTHER_DIAGNOSIS_CODE_15,163,Claim
OTHER_DIAGNOSIS_CODE_15_POA,164,Claim
OTHER_DIAGNOSIS_CODE_16,166,Claim
OTHER_DIAGNOSIS_CODE_16_POA,167,Claim
OTHER_DIAGNOSIS_CODE_17,169,Claim
OTHER_DIAGNOSIS_CODE_17_POA,170,Claim
OTHER_DIAGNOSIS_CODE_18,172,Claim
OTHER_DIAGNOSIS_CODE_18_POA,173,Claim
OTHER_DIAGNOSIS_CODE_19,175,Claim
OTHER_DIAGNOSIS_CODE_19_POA,176,Claim
OTHER_DIAGNOSIS_CODE_20,178,Claim
OTHER_DIAGNOSIS_CODE_20_POA,179,Claim
OTHER_DIAGNOSIS_CODE_21,181,Claim
OTHER_DIAGNOSIS_CODE_21_POA,182,Claim
OTHER_DIAGNOSIS_CODE_22,184,Claim
OTHER_DIAGNOSIS_CODE_22_POA,185,Claim
OTHER_DIAGNOSIS_CODE_23,187,Claim
OTHER_DIAGNOSIS_CODE_23_POA,188,Claim
OTHER_DIAGNOSIS_CODE_24,190,Claim
OTHER_DIAGNOSIS_CODE_24_POA,191,Claim
OTHER_DIAGNOSIS_CODE_25,193,Claim
OTHER_DIAGNOSIS_CODE_25_POA,194,Claim
ADMITTING_DIAGNOSIS,196,Claim
EXTERNAL_CAUSE_OF_INJURY_1,198,Claim
EXTERNAL_CAUSE_OF_INJURY_1_POA,199,Claim
EXTERNAL_CAUSE_OF_INJURY_2,201,Claim
EXTERNAL_CAUSE_OF_INJURY_2_POA,202,Claim
EXTERNAL_CAUSE_OF_INJURY_3,204,Claim
EXTERNAL_CAUSE_OF_INJURY_3_POA,205,Claim
EXTERNAL_CAUSE_OF_INJURY_4,207,Claim
EXTERNAL_CAUSE_OF_INJURY_4_POA,208,Claim
EXTERNAL_CAUSE_OF_INJURY_5,210,Claim
EXTERNAL_CAUSE_OF_INJURY_5_POA,211,Claim
EXTERNAL_CAUSE_OF_INJURY_6,213,Claim
EXTERNAL_CAUSE_OF_INJURY_6_POA,214,Claim
EXTERNAL_CAUSE_OF_INJURY_7,216,Claim
EXTERNAL_CAUSE_OF_INJURY_7_POA,217,Claim
EXTERNAL_CAUSE_OF_INJURY_8,219,Claim
EXTERNAL_CAUSE_OF_INJURY_8_POA,220,Claim
EXTERNAL_CAUSE_OF_INJURY_9,222,Claim
EXTERNAL_CAUSE_OF_INJURY_9_POA,223,Claim
EXTERNAL_CAUSE_OF_INJURY_10,225,Claim
EXTERNAL_CAUSE_OF_INJURY_10_POA,226,Claim
EXTERNAL_CAUSE_OF_INJURY_11,228,Claim
EXTERNAL_CAUSE_OF_INJURY_11_POA,229,Claim
EXTERNAL_CAUSE_OF_INJURY_12,231,Claim
EXTERNAL_CAUSE_OF_INJURY_12_POA,232,Claim
PATIENTS_REASON_FOR_VISIT_1,234,Claim
PATIENTS_REASON_FOR_VISIT_2,236,Claim
PATIENTS_REASON_FOR_VISIT_3,238,Claim
PRINCIPAL_PROCEDURE,240,Claim
PRINCIPAL_PROCEDURE_DATE,241,Claim
OTHER_PROCEDURE_2,243,Claim
OTHER_PROCEDURE_2_DATE,244,Claim
OTHER_PROCEDURE_3,246,Claim
OTHER_PROCEDURE_3_DATE,247,Claim
OTHER_PROCEDURE_4,249,Claim
OTHER_PROCEDURE_4_DATE,250,Claim
OTHER_PROCEDURE_5,252,Claim
OTHER_PROCEDURE_5_DATE,253,Claim
OTHER_PROCEDURE_6,255,Claim
OTHER_PROCEDURE_6_DATE,256,Claim
OTHER_PROCEDURE_7,258,Claim
OTHER_PROCEDURE_7_DATE,259,Claim
OTHER_PROCEDURE_8,261,Claim
OTHER_PROCEDURE_8_DATE,262,Claim
OTHER_PROCEDURE_9,264,Claim
OTHER_PROCEDURE_9_DATE,265,Claim
OTHER_PROCEDURE_10,267,Claim
OTHER_PROCEDURE_10_DATE,268,Claim
OTHER_PROCEDURE_11,270,Claim
OTHER_PROCEDURE_11_DATE,271,Claim
OTHER_PROCEDURE_12,273,Claim
OTHER_PROCEDURE_12_DATE,274,Claim
OTHER_PROCEDURE_13,276,Claim
OTHER_PROCEDURE_13_DATE,277,Claim
OTHER_PROCEDURE_14,279,Claim
OTHER_PROCEDURE_14_DATE,280,Claim
OTHER_PROCEDURE_15,282,Claim
OTHER_PROCEDURE_15_DATE,283,Claim
OTHER_PROCEDURE_16,285,Claim
OTHER_PROCEDURE_16_DATE,286,Claim
OTHER_PROCEDURE_17,288,Claim
OTHER_PROCEDURE_17_DATE,289,Claim
OTHER_PROCEDURE_18,291,Claim
OTHER_PROCEDURE_18_DATE,292,Claim
OTHER_PROCEDURE_19,294,Claim
OTHER_PROCEDURE_19_DATE,295,Claim
OTHER_PROCEDURE_20,297,Claim
OTHER_PROCEDURE_20_DATE,298,Claim
OTHER_PROCEDURE_21,300,Claim
OTHER_PROCEDURE_21_DATE,301,Claim
OTHER_PROCEDURE_22,303,Claim
OTHER_PROCEDURE_22_DATE,304,Claim
OTHER_PROCEDURE_23,306,Claim
OTHER_PROCEDURE_23_DATE,307,Claim
OTHER_PROCEDURE_24,309,Claim
OTHER_PROCEDURE_24_DATE,310,Claim
OTHER_PROCEDURE_25,312,Claim
OTHER_PROCEDURE_25_DATE,313,Claim
BILLING_TAXGROUP_ID,350,Claim
BILLING_NPI,351,Line
BILLING_NAME,357,Claim
BILLING_ADDRESS_1,358,Claim
BILLING_ADDRESS_2,359,Claim
BILLING_CITY,360,Claim
BILLING_STATE,361,Claim
BILLING_COUNTRY,364,Claim
LINE_SEQ,382,Line
SUB_REV_CODE,385,Line
SUB_HCPCS,386,Line
SUB_MOD1,387,Line
SUB_MOD2,388,Line
SUB_MOD3,389,Line
SUB_MOD4,390,Line
SUB_UNITS,396,Line
SUB_AMOUNT,397,Line
SUB_NDC,399,Line
SUB_NDC_UNITS,400,Line
SUB_NDC_UNITS_TYPE,401,Line
ASSIGNMENT_OF_BENEFITS,437,Claim
CLAIM_BILLED_AMOUNT,438,Claim
SUB_LAST_NAME,502,Claim
SUB_FIRST_NAME,503,Claim
SUB_MIDDLE_NAME,504,Claim
SUB_NAME_SUFFIX,505,Claim
SUB_ADDRESS_1,506,Claim
SUB_ADDDRESS_2,507,Claim
SUB_CITY,508,Claim
SUB_STATE,509,Claim
SUB_COUNTRY,512,Claim
SUB_DOB,514,Claim
SUB_GENDER_ID,515,Claim
PATIENT_ADDRESS_1,517,Claim
PATIENT_ADDRESS_2,518,Claim
PATIENT_CITY,519,Claim
PATIENT_STATE,520,Claim
PATIENT_COUNTRY,523,Claim
PAY_TO_ADDRESS_1,528,Claim
PAY_TO_ADDRESS_2,529,Claim
PAY_TO_CITY,530,Claim
PAY_TO_STATE,531,Claim
PAY_TO_COUNTRY,534,Claim
ATTENDING_NPI,538,Claim
ATTENDING_TAXONOMY_CODE,541,Claim
ATTENDING_LAST_NAME,543,Claim
ATTENDING_FIRST_NAME,544,Claim
ATTENDING_MIDDLE_NAME,545,Claim
ATTENDING_NAME_SUFFIX,546,Claim
OTHER_OPERATING_NPI,560,Claim
OTHER_OPERATING_LAST_NAME,565,Claim
OTHER_OPERATING_FIRST_NAME,566,Claim
OTHER_OPERATING_MIDDLE_NAME,567,Claim
OTHER_OPERATING_NAME_SUFFIX,568,Claim
OCCUR_SPAN_CODE_1,593,Claim
OCCUR_SPAN_CODE_2,596,Claim
OCCUR_SPAN_CODE_3,599,Claim
OCCUR_SPAN_CODE_4,602,Claim
OCCUR_SPAN_CODE_5,605,Claim
OCCUR_SPAN_CODE_6,608,Claim
OCCUR_SPAN_CODE_7,611,Claim
OCCUR_SPAN_CODE_8,614,Claim
OCCUR_SPAN_CODE_9,617,Claim
OCCUR_SPAN_CODE_10,620,Claim
OCCUR_SPAN_CODE_11,623,Claim
OCCUR_SPAN_CODE_12,626,Claim
OCCUR_SPAN_CODE_13,629,Claim
OCCUR_SPAN_CODE_14,632,Claim
OCCUR_SPAN_CODE_15,635,Claim
OCCUR_SPAN_CODE_16,638,Claim
OCCUR_SPAN_CODE_17,641,Claim
OCCUR_SPAN_CODE_18,644,Claim
OCCUR_SPAN_CODE_19,647,Claim
OCCUR_SPAN_CODE_20,650,Claim
OCCUR_SPAN_CODE_21,653,Claim
OCCUR_SPAN_CODE_22,656,Claim
OCCUR_SPAN_CODE_23,659,Claim
OCCUR_SPAN_CODE_24,662,Claim
OCCUR_CODE_1,665,Claim
OCCUR_DATE_01,666,Claim
OCCUR_CODE_2,667,Claim
OCCUR_DATE_2,668,Claim
OCCUR_CODE_3,669,Claim
OCCUR_DATE_3,670,Claim
OCCUR_CODE_4,671,Claim
OCCUR_DATE_4,672,Claim
OCCUR_CODE_5,673,Claim
OCCUR_DATE_5,674,Claim
OCCUR_CODE_6,675,Claim
OCCUR_DATE_6,676,Claim
OCCUR_CODE_7,677,Claim
OCCUR_DATE_7,678,Claim
OCCUR_CODE_8,679,Claim
OCCUR_DATE_8,680,Claim
OCCUR_CODE_9,681,Claim
OCCUR_DATE_9,682,Claim
OCCUR_CODE_10,683,Claim
OCCUR_DATE_10,684,Claim
OCCUR_CODE_11,685,Claim
OCCUR_DATE_11,686,Claim
OCCUR_CODE_12,687,Claim
OCCUR_DATE_12,688,Claim
OCCUR_CODE_13,689,Claim
OCCUR_DATE_13,690,Claim
OCCUR_CODE_14,691,Claim
OCCUR_DATE_14,692,Claim
OCCUR_CODE_15,693,Claim
OCCUR_DATE_15,694,Claim
OCCUR_CODE_16,695,Claim
OCCUR_DATE_16,696,Claim
OCCUR_CODE_17,697,Claim
OCCUR_DATE_17,698,Claim
OCCUR_CODE_18,699,Claim
OCCUR_DATE_18,700,Claim
OCCUR_CODE_19,701,Claim
OCCUR_DATE_19,702,Claim
OCCUR_CODE_20,703,Claim
OCCUR_DATE_20,704,Claim
OCCUR_CODE_21,705,Claim
OCCUR_DATE_21,706,Claim
OCCUR_CODE_22,707,Claim
OCCUR_DATE_22,708,Claim
OCCUR_CODE_23,709,Claim
OCCUR_DATE_23,710,Claim
OCCUR_CODE_24,711,Claim
OCCUR_DATE_24,712,Claim
SUB_MEMBER_GROUP_NUMBER,823,Claim
SUB_CLAIM_FILING_CODE,824,Claim
ASSIGNMENT_ACCEPTANCE,825,Claim
REPRICER_NAME,827,Claim
CLAIM_FREQUENCY_CODE,828,Claim
(BILLING_ZIP) + ( BILLING_ZIP_PLUS_4),362 + 363,Line
DOS_FROM + DOS_TO,383 + 384,Line
CLAIM_ID_ORIG,482,Claim
SUB_ZIP + SUB_ZIP_PLUS_4,510 + 511,Claim
(PATIENT_ZIP) + ( PATIENT_ZIP_PLUS_4),521 + 522,Claim
(PAY_TO_ZIP) + ( PAY_TO_ZIP_PLUS_4),532 + 533,Claim
OCCUR_SPAN_FROM_DATE_1 + OCCUR_SPAN_TO_DATE_1,594+595,Claim
OCCUR_SPAN_FROM_DATE_2 + OCCUR_SPAN_TO_DATE_2,597+598,Claim
OCCUR_SPAN_FROM_DATE_3 + OCCUR_SPAN_TO_DATE_3,600+601,Claim
OCCUR_SPAN_FROM_DATE_4 + OCCUR_SPAN_TO_DATE_4,603+604,Claim
OCCUR_SPAN_FROM_DATE_5 + OCCUR_SPAN_TO_DATE_5,606+607,Claim
OCCUR_SPAN_FROM_DATE_6 + OCCUR_SPAN_TO_DATE_6,609+610,Claim
OCCUR_SPAN_FROM_DATE_7 + OCCUR_SPAN_TO_DATE_7,612+613,Claim
OCCUR_SPAN_FROM_DATE_8 + OCCUR_SPAN_TO_DATE_8,615+616,Claim
OCCUR_SPAN_FROM_DATE_9 + OCCUR_SPAN_TO_DATE_9,618+619,Claim
OCCUR_SPAN_FROM_DATE_10 + OCCUR_SPAN_TO_DATE_10,621+622,Claim
OCCUR_SPAN_FROM_DATE_11 + OCCUR_SPAN_TO_DATE_11,624+625,Claim
OCCUR_SPAN_FROM_DATE_12 + OCCUR_SPAN_TO_DATE_12,627+628,Claim
OCCUR_SPAN_FROM_DATE_13 + OCCUR_SPAN_TO_DATE_13,630+631,Claim
OCCUR_SPAN_FROM_DATE_14 + OCCUR_SPAN_TO_DATE_14,633+634,Claim
OCCUR_SPAN_FROM_DATE_15 + OCCUR_SPAN_TO_DATE_15,636+637,Claim
OCCUR_SPAN_FROM_DATE_16 + OCCUR_SPAN_TO_DATE_16,639+640,Claim
OCCUR_SPAN_FROM_DATE_17 + OCCUR_SPAN_TO_DATE_17,642+643,Claim
OCCUR_SPAN_FROM_DATE_18 + OCCUR_SPAN_TO_DATE_18,645+646,Claim
OCCUR_SPAN_FROM_DATE_19 + OCCUR_SPAN_TO_DATE_19,648+649,Claim
OCCUR_SPAN_FROM_DATE_20 + OCCUR_SPAN_TO_DATE_20,651+652,Claim
OCCUR_SPAN_FROM_DATE_21 + OCCUR_SPAN_TO_DATE_21,654+655,Claim
OCCUR_SPAN_FROM_DATE_22 + OCCUR_SPAN_TO_DATE_22,657+658,Claim
OCCUR_SPAN_FROM_DATE_23 + OCCUR_SPAN_TO_DATE_23,660+661,Claim
OCCUR_SPAN_FROM_DATE_24 + OCCUR_SPAN_TO_DATE_24,663+664,Claim
CLAIM_DOS_FROM + CLAIM_DOS_TO,94 + 95,Claim
"ADMIT_DATE +
ADMIT_TIME_HH / ADMIT_TIME_MM",97 + 98/99,Claim
Trailer,,
TRAILER_CONSTANT,1,File
DETAIL_COUNT,2,File
RUN_DATE,3,File
RUN_TIME,4,File
FILLER,5,File
```
