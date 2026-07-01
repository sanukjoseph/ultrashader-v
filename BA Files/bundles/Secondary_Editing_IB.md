# Secondary Editing IB

## Secondary Editing IB/V26.1.0.0/EdifecsProduct_AuditProcessing_InboundSecondaryEditing_V3.0.xlsx — Cover Page

```csv
,IB Claims Secondary Editing Audit Processing -  EDIFECS,,,,,,,,,
,,,,,,,,,,
,Business Area: Secondary Editing IB,,,,,,,,,
,,,,,,,,,,
,This document provides the Audit Mapping Specification for Claims Secondary Editing IB. Document is intended for EDIFECS Product Team,,,,,,,,,
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

## Secondary Editing IB/V26.1.0.0/EdifecsProduct_AuditProcessing_InboundSecondaryEditing_V3.0.xlsx — JSON Mapping

```csv
Group,Fields,Values,Usage,Description
inputDetails,inputId,"Value passed is  - {UID}- Uniqie for each file
Example - -dtBkcCHu9bkKu8O",Mandatory,File id
,inputFileName,Input Filename of the DFF/EDI file received with filename extension,,Name of the input file received from source.
,inputType,Hardcode as 'DFF'/'EDI',,
,sourceTypeIdentifier,Cotiviti /Optum/Evicore/Claritev/Zelis(configurable field),,Identifier to find from where we received(Starting point) the initial Transaction/Record. Configurable field
,claimsDefinition,Hardcode as Secondary Editing,Mandatory,
,tenantIdentifier,"Hardcode as 'PRODUCT'( Configurable field)
""Hardcode as """"Product"""" in adaptor.properties file and assign to variable"""" tenantIdentifier""""
and call in profile """,,"Unique identifier for the implementation team, Configurable field"
,totalTransactions,Total no. of Claims in file,Mandatory,
,inputArchiveFilename,Input Filename of the DFF/EDI file archived in s3 with filename extension,,Name of the input file after archiving the input file.
process,processStageName,Refer Audit events Tab,Mandatory,Represent the name of the process stage which post the Audit point.
,processStatus,Refer Audit events Tab,Mandatory,Represent the Intermediate or Final status of the process stage which posts the Audit point.
,processMessage,Refer Audit events Tab,,Specific information of a particular step after the process is completed.
,processInputArchiveFilename,Input Filename of the DFF/EDI file received with filename extension,,Name of the input Archive file of the process stage which posts the Audit point.
,processOutputArchiveFilename,NA,,Name of the output Archive file of the process stage which posts the Audit point.
,auditTime,"The time the audit trigger event got generated in yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS format
2024-08-05 00:24:16:480",Mandatory,Auditing time of each audit point
identifiers,rayIdentifier,GUID,Mandatory for record level,"Unique Identifier for the complete lifecycle of transaction/Record. Will be unchanged even the transaction is Split, passed across various system, reprocessed."
,recordIdentifier,GUID,Mandatory for record level,"Unique Identifier for transaction level. Will be different when we split, reprocess a same record."
,recordIdentifierFromSource,Same as recordIdentifier,,
claims,,,,
,claimId,"CLAIM_ID(Cotivity), Client Claim ID(Optum), HealthPlan Claim Id(Evicore),",,HCC id of the claim
,claimStatus,"Hardcode as ""Waiting for External System"" for Secondary editing",,
```

## Secondary Editing IB/V26.1.0.0/EdifecsProduct_AuditProcessing_InboundSecondaryEditing_V3.0.xlsx — Audit events

```csv
processStageName,processStatus,processMessage,JSON TRIGGER EVENT,Comments
edifecs:message received,MESSAGE READ,,,
edifecs:message received,ERROR,,,Do we need this event?
edifecs:validation,PROCESSED,,"After the Validations, if it’s a good record",
edifecs:validation failed,ERROR,"Detailed Error details in below format( for EDI )
(Err ID, ErrData, ErrSegment, ErrPath, ErrBrief) seprated by '||'.  Total error message length is 5000  with a max of 300 characters  recorded for  one error.","After the Validations, if it’s a bad record",
edifecs:conversion,PROCESSED,,After the XML conversion if it’s a success,
edifecs:conversion failed,ERROR,"Detailed Error details in below format( for EDI )
(Err ID, ErrData, ErrSegment, ErrPath, ErrBrief) seprated by '||'.  Total error message length is 5000  with a max of 300 characters  recorded for  one error.",After the XML conversion if it’s a failure,
,,,,
edifecs:file level validation error,ERROR,"Detailed Error details
(Err ID, ErrData, ErrSegment, ErrPath, ErrBrief) seprated by '||'.  Total error message length is 5000  with a max of 300 characters  recorded for  one error.",In case the full file is rejected due to error in header segments. – File level,
edifecs:validation failed,ERROR,Duplicate_File_<FileName>,In case the duplicate file name,
edifecs:validation failed,ERROR,Duplicate_Interchange_<SenderId>_<ReciverId>_<Time>_<Date>_<InterchangeControlNumber>,In case the interchange Duplicate,
```

## Secondary Editing IB/V26.1.0.0/EdifecsProduct_AuditProcessing_InboundSecondaryEditing_V3.0.xlsx — Sample Json

```csv
{,,
inputDetails: {,,
,"inputId: ""T4ZBnEXrFxllIzuB"",",
,"inputFileName: ""Cotivity_Inst_ediup_V1.txt"",",
,"inputType: ""DFF"",",
,"sourceTypeIdentifier: ""Cotiviti"",",
,"claimsDefinition: ""Secondary Editing IB"",",
,"tenantIdentifier: ""LajBnEXrHaRlIzuD"",",
,"totalTransactions: ""1"",",
,"inputArchiveFilename: ""260209-2359_Cotivity_Inst_ediup_V1.txt""",
"},",,
"""process"": {",,
,"processStageName: ""edifecs:validation"",",
,"processStatus: ""PROCESSED"",",
,"processInputArchiveFilename: ""260209-2359_Cotivity_Inst_ediup_V1.txt"",",
,,"auditTime: ""2026-02-09T23:59:22.000000403"""
"},   ""identifiers"": {",,
,"rayIdentifier: ""A9DDAD85-9CE9-4B54-B032-0D2A6132041E"",",
,"recordIdentifier: ""DC80099C-B70E-470E-8BA3-05C56CD87F60"",",
,"recordIdentifierFromSource: ""DC80099C-B70E-470E-8BA3-05C56CD87F60""",
"},",,
"""claims"": {",,
,"claimId: ""20230213000267"",",
,"claimStatus: ""Waiting for External System""",
,,}
,},
```

## Secondary Editing IB/V26.1.0.0/EdifecsProduct_MappingSpec_Secondary Editing_DFF_to_XMLConversion_V2.0.xlsx — Cover Page

```csv
Secondary Editing IB Mapping Specification- EDIFECS,,,,,,,,,
,,,,,,,,,
Business Area: IB  Claims - Secondary Editing,,,,,,,,,
,,,,,,,,,
This document provides the Mapping Specification for Secondary Editing Claims IB. Document is intended for EDIFECS Product Team,,,,,,,,,
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

## Secondary Editing IB/V26.1.0.0/EdifecsProduct_MappingSpec_Secondary Editing_DFF_to_XMLConversion_V2.0.xlsx — Version History

```csv
Revision History,,,,
,,,,
,,,,
,,,,
V#,Date,Author,Reviewer(s)/ Contributor(s),Comments
1,24/2/2025,Ambily Raj,Rameshwar Singh,Initial Version. Baselined
2,27/7/2025,Ambily Raj,Rameshwar Singh,Added EDI 837I/P IB Mapping
```

## Secondary Editing IB/V26.1.0.0/EdifecsProduct_MappingSpec_Secondary Editing_DFF_to_XMLConversion_V2.0.xlsx — Sheet1

```csv
institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/supplierInformation/address
```

## Secondary Editing IB/V26.1.0.0/EdifecsProduct_MappingSpec_Secondary Editing_DFF_to_XMLConversion_V2.0.xlsx — Cotivity

```csv
XML Field,HRP Element Description,Cotiviti-Inst,Cotiviti-Prof,Mapping Logic,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/header/inputId,,UID,UID,,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/header/inputType,,"""INST""","""PROF""",,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/header/totalTransaction,,no of input in  file - total number of lines,no of input in  file - total number of lines,,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/header/inputFilename,,IB DFF name with filename extension,IB DFF name with filename extension,,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/header/inputArchiveFilename,,Archived file name with filename extension,Archived file name with filename extension,,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/header/totalClaimCount,,No of claims in DFF,No of claims in DFF,,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/header/totalXMLTransactionCount,,1 (1 claim each file),1 (1 claim each file),,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/header/XMLfileCreationDate,,2008-06-16T07:12:48(format),2008-06-16T07:12:48(format),,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/header/senderId,,Cotiviti Inst,Cotiviti Prof,,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/header/receiverId,,Hardcode as 'Product',Hardcode as 'Product',,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/recordCount,,1 (1 claim each file),1 (1 claim each file),,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/recordIdentifier,,GUID,GUID,,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/rayIdentifier,,GUID,GUID,,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/tenantIdentifier,,NA,NA,,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/SourceTypeIdentifier,,Cotiviti,Cotiviti,,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/recordIdentifierFromSource,,Same as recordIdentifier,Same as recordIdentifier,,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/referenceIdentifier,,NA,NA,,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/hccClaimNumber,HCC Claim number,CLAIM_ID,CLAIM_ID,,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/hccLineNumber,Line number,LINE_SEQ,LINE_SEQ,"Remove leading zeros if present.

i.e.  If the DFF is having 0001, populate hccLineNumber as 1.",
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/subUnit,,SUB_UNITS,SUB_UNITS,"NOT APPLICABLE FOR REC_LINE_STATUS = ""P""",
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/recHcpcs,,REC_HCPCS,REC_HCPCS,"NOT APPLICABLE FOR REC_LINE_STATUS = ""P""",
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/recModifier01,,REC_MOD_01,REC_MOD_01,"NOT APPLICABLE FOR REC_LINE_STATUS = ""P""",
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/recModifier02,,REC_MOD_02,REC_MOD_02,"NOT APPLICABLE FOR REC_LINE_STATUS = ""P""",
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/recModifier03,,REC_MOD_03,REC_MOD_03,"NOT APPLICABLE FOR REC_LINE_STATUS = ""P""",
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/recModifier04,,REC_MOD_04,REC_MOD_04,"NOT APPLICABLE FOR REC_LINE_STATUS = ""P""",
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/recModifier05,,REC_MOD_05,REC_MOD_05,"NOT APPLICABLE FOR REC_LINE_STATUS = ""P""",
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/recModifier06,,REC_MOD_06,REC_MOD_06,"NOT APPLICABLE FOR REC_LINE_STATUS = ""P""",
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/recModifier07,,REC_MOD_07,REC_MOD_07,"NOT APPLICABLE FOR REC_LINE_STATUS = ""P""",
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/recModifier08,"Identifies the type of external edit to apply to the identified claim or claim
line:
DENY_LINE – Denies the specified claim or claim line; no other values are required.
PARTIAL_DENY – Adjust the units in a claim line. You must supply both originalUnits and adjustmentUnits.
APPLY_PERCENTAGE — Adjust the payment amount. The
adjustmentPercentage represents the final value to use for the claim (line).",REC_MOD_08,REC_MOD_08,"NOT APPLICABLE FOR REC_LINE_STATUS = ""P""",
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/actions/action/actionType,Reason code,REC_LINE_STATUS,REC_LINE_STATUS,,"‘P’ = Pay
‘D’ = Deny
‘E’ = Pend
‘C’ = Change/Adjust
‘I’ = Information
'V' = CV Pend"
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/actions/action/reasons/reason/code,Reson code Description,"REASON1_ID
REASON2_ID
REASON3_ID","REASON1_ID
REASON2_ID
REASON3_ID","NOT APPLICABLE FOR REC_LINE_STATUS = ""P""",
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/actions/action/reasons/reason/description,,"reason1Id + Space + "" Action Reason""
reason2Id + Space + "" Action Reason""
reason3Id + Space + "" Action Reason""","reason1Id + Space + "" Action Reason""
reason2Id + Space + "" Action Reason""
reason3Id + Space + "" Action Reason""","NOT APPLICABLE FOR REC_LINE_STATUS = ""P""",
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/actions/action/originalUnits,,ALLOWED_UNITS,ALLOWED_UNITS,"NOT APPLICABLE FOR REC_LINE_STATUS = ""P""",
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/actions/action/adjustedUnits,,REC_UNITS,REC_UNITS,"NOT APPLICABLE FOR REC_LINE_STATUS = ""P""",
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/actions/action/adjustmentPercentage,Must be a CodeEntry that has been defined in HealthRules Payer,REC_PCT,REC_PCT,"NOT APPLICABLE FOR REC_LINE_STATUS = ""P""",
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/actions/action/userMessageCode,,REASON1_ID,REASON1_ID,"NOT APPLICABLE FOR REC_LINE_STATUS = ""P""",
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/adjustmentReasonCode,,1 (hardcoded),1 (hardcoded),,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/adjustmentLogNote,,REC_LINE_STATUS of Line 1,REC_LINE_STATUS of Line 1,"NOT APPLICABLE FOR REC_LINE_STATUS = ""P""",
```

## Secondary Editing IB/V26.1.0.0/EdifecsProduct_MappingSpec_Secondary Editing_DFF_to_XMLConversion_V2.0.xlsx — Optum

```csv
XML Field,HRP Element Description,Optum,Mapping Logic
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/header/inputId,,UID,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/header/inputType,,Claim Type,"P - PROF
  I - INST"
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/header/totalTransaction,,no of input in  file - total number of lines,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/header/inputFilename,,IB DFF name with filename extension,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/header/inputArchiveFilename,,Archived file name with filename extension,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/header/totalClaimCount,,No of claims in DFF,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/header/totalXMLTransactionCount,,1 (1 claim each file),
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/header/XMLfileCreationDate,,2008-06-16T07:12:48(format),
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/header/senderId,,Optum,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/header/receiverId,,Hardcode as 'Product',
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/recordCount,,1 (1 claim each file),
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/recordIdentifier,,GUID,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/rayIdentifier,,GUID,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/tenantIdentifier,,NA,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/SourceTypeIdentifier,,Optum,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/recordIdentifierFromSource,,Same as recordIdentifier,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/referenceIdentifier,,NA,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/hccClaimNumber,HCC Claim number,Client Claim ID,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/hccLineNumber,Line number,Line Number,"Remove leading zeros if present.

i.e.  If the DFF is having 0001, populate hccLineNumber as 1."
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/subUnit,,NA,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/recHcpcs,,NA,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/recModifier01,,NA,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/recModifier02,,NA,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/recModifier03,,NA,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/recModifier04,,NA,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/recModifier05,,NA,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/recModifier06,,NA,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/recModifier07,,NA,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/recModifier08,"Identifies the type of external edit to apply to the identified claim or claim
line:
DENY_LINE – Denies the specified claim or claim line; no other values are required.
PARTIAL_DENY – Adjust the units in a claim line. You must supply both originalUnits and adjustmentUnits.
APPLY_PERCENTAGE — Adjust the payment amount. The
adjustmentPercentage represents the final value to use for the claim (line).",NA,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/actions/action/actionType,Reason code,Recommendation Status Code,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/actions/action/reasons/reason/code,Reson code Description,Reason Code,Not applicable for Recommendation Status Code = A
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/actions/action/reasons/reason/description,,Reason Code+Space+ Reason Code Description,Not applicable for Recommendation Status Code = A
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/actions/action/originalUnits,,NA,Not applicable for Recommendation Status Code = A
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/actions/action/adjustedUnits,,Recommended Units of Service To Allow,Not applicable for Recommendation Status Code = A
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/actions/action/adjustmentPercentage,Must be a CodeEntry that has been defined in HealthRules Payer,NA,Not applicable for Recommendation Status Code = A
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/actions/action/userMessageCode,,Reason Code,Not applicable for Recommendation Status Code = A
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/adjustmentReasonCode,,1 (hardcoded),
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/adjustmentLogNote,,Recommendation Status Code of Line 1,Not applicable for Recommendation Status Code = A
```

## Secondary Editing IB/V26.1.0.0/EdifecsProduct_MappingSpec_Secondary Editing_DFF_to_XMLConversion_V2.0.xlsx — Evicore

```csv
XML Field,HRP Element Description,Evicore,Mapping Logic
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/header/inputId,,UID,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/header/inputType,,HCFA/UB Indicator,"UB04- INST
1500-PROF"
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/header/totalTransaction,,no of input in  file - total number of lines,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/header/inputFilename,,IB DFF name with filename extension,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/header/inputArchiveFilename,,Archived file name with filename extension,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/header/totalClaimCount,,No of claims in DFF,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/header/totalXMLTransactionCount,,1 (1 claim each file),
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/header/XMLfileCreationDate,,2008-06-16T07:12:48(format),
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/header/senderId,,Evicore,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/header/receiverId,,Hardcode as 'Product',
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/recordCount,,1 (1 claim each file),
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/recordIdentifier,,GUID,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/rayIdentifier,,GUID,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/tenantIdentifier,,NA,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/SourceTypeIdentifier,,Evicore,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/recordIdentifierFromSource,,Same as recordIdentifier,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/referenceIdentifier,,NA,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/hccClaimNumber,HCC Claim number,HealthPlan Claim Id,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/hccLineNumber,Line number,HealthPlan Line Number,"Remove leading zeros if present.

i.e.  If the DFF is having 0001, populate hccLineNumber as 1."
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/subUnit,,NA,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/recHcpcs,,NA,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/recModifier01,,NA,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/recModifier02,,NA,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/recModifier03,,NA,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/recModifier04,,NA,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/recModifier05,,NA,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/recModifier06,,NA,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/recModifier07,,NA,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/recModifier08,"Identifies the type of external edit to apply to the identified claim or claim
line:
DENY_LINE – Denies the specified claim or claim line; no other values are required.
PARTIAL_DENY – Adjust the units in a claim line. You must supply both originalUnits and adjustmentUnits.
APPLY_PERCENTAGE — Adjust the payment amount. The
adjustmentPercentage represents the final value to use for the claim (line).",NA,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/actions/action/actionType,Reason code,Reason Code,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/actions/action/reasons/reason/code,Reson code Description,Reason Code,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/actions/action/reasons/reason/description,,"Reason Code + Space + ""Action Reason""",
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/actions/action/originalUnits,,Quantity,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/actions/action/adjustedUnits,,Pay Qty,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/actions/action/adjustmentPercentage,Must be a CodeEntry that has been defined in HealthRules Payer,NA,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/actions/action/userMessageCode,,Reason Code,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/adjustmentReasonCode,,1 (hardcoded),
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/adjustmentLogNote,,Reason Code of line 1,
```

## Secondary Editing IB/V26.1.0.0/EdifecsProduct_MappingSpec_Secondary Editing_DFF_to_XMLConversion_V2.0.xlsx — EDI 837

```csv
XML Field,HRP Element Description,CLaritev,,Zelis,,Notes
,HRP Element Description,EDI 837I/P,Mapping Logic,EDI 837I/P,Mapping Logic,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/header/inputId,,UID,,UID,,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/header/inputType,,"""INST"" for 837I
""PROF"" for 837P",,"""INST"" for 837I
""PROF"" for 837P",,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/header/totalTransaction,,No of claims in EDI,,No of claims in EDI,,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/header/inputFilename,,IB EDI file name with filename extension,,IB EDI file name with filename extension,,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/header/inputArchiveFilename,,Archived file name with filename extension,,Archived file name with filename extension,,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/header/totalClaimCount,,No of claims in EDI,,No of claims in EDI,,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/header/totalXMLTransactionCount,,1 (1 claim each file),,1 (1 claim each file),,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/header/XMLfileCreationDate,,2008-06-16T07:12:48(format),,2008-06-16T07:12:48(format),,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/header/senderId,,ISA06,,ISA06,,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/header/receiverId,,ISA08,,ISA08,,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/recordCount,,1 (1 claim each file),,1 (1 claim each file),,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/recordIdentifier,,GUID,,GUID,,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/rayIdentifier,,GUID,,GUID,,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/tenantIdentifier,,NA,,NA,,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/SourceTypeIdentifier,,Claritev,Based on ISA06,Zelis,Based on ISA06,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/recordIdentifierFromSource,,Same as recordIdentifier,,Same as recordIdentifier,,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/referenceIdentifier,,NA,,NA,,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/hccClaimNumber,HCC Claim number,2300.REF*D9,,2300.REF*D9,,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/hccLineNumber,Line number,2400.LX01,,2400.LX01,,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/subUnit,,,,,,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/recHcpcs,,,,,,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/recModifier01,,,,,,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/recModifier02,,,,,,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/recModifier03,,,,,,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/recModifier04,,,,,,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/recModifier05,,,,,,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/recModifier06,,,,,,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/recModifier07,,,,,,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/recModifier08,"Identifies the type of external edit to apply to the identified claim or claim
line:
DENY_LINE – Denies the specified claim or claim line; no other values are required.
PARTIAL_DENY – Adjust the units in a claim line. You must supply both originalUnits and adjustmentUnits.
APPLY_PERCENTAGE — Adjust the payment amount. The
adjustmentPercentage represents the final value to use for the claim (line).",,,,,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/actions/action/actionType,Reason code,"If  2400.NTE*TPO is present
        Map 'APPLY_PERCENTAGE' when      2400.NTE02 = LAF2 (following 'RMRK=')
      Map 'DENY_LINE' when 2400.NTE02 = LAF1 (following 'RMRK=')

Else
     Map 'PAY_LINE'",,"Map 'PEND' when 2300.HCP13 = Y

When 2400.HCP01 = 10
    Map 'APPLY_PERCENTAGE'
Else
    Map 'PAY_LINE'",,Please refer 'EDI Format' tab for the expected input format
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/actions/action/reasons/reason/code,Reson code Description,2400.NTE02  (following 'EOBC='),Only if 2400.NTE*TPO is present,2400.HCP04,When 2400.HCP01 = 10,"Claritev mapping is not handled in Product COre Map since it may vary depending on implementaion.

Reason code/desc  XWALK will be maintained Iplus Java layer. Implementaion teams has to Enable and maintain the xwalk in java layer if needed."
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/actions/action/reasons/reason/description,,,,"2400.NTE02 when NTE01 = ADD
Format for NTE02 is 'Reason code - Reason desc'. Map the Reason desc.",When 2400.HCP01 = 10,Reason code/desc  XWALK will be maintained Iplus Java layer. Implementaion teams has to Enable and maintain the xwalk in java layer if needed.
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/actions/action/originalUnits,,,,,,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/actions/action/adjustedUnits,,,,,,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/actions/action/adjustmentPercentage,Must be a CodeEntry that has been defined in HealthRules Payer,2400.HCP02,Only if 2400.NTE*TPO is present,2400.HCP02,When 2400.HCP01 = 10,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/claimLines/claimLine/actions/action/userMessageCode,,2400.NTE02  (following 'EOBC='),Only if 2400.NTE*TPO is present,2400.HCP04,When 2400.HCP01 = 10,"Claritev mapping is not handled in Product COre Map since it may vary depending on implementaion.

Reason code/desc  XWALK will be maintained Iplus Java layer. Implementaion teams has to Enable and maintain the xwalk in java layer if needed."
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/adjustmentReasonCode,,1 (hardcoded),,1 (hardcoded),,
ClaimEditingAdaptorRequest/ClaimEditingIBRequestRoot/ClaimEditingIBRequest/ClaimEditingRequestRecordList/ClaimEditingRequestRecord/externalEditClaim/adjustmentLogNote,,"Map 'Apply Percentage Log Note' when 2400.NTE02 = LAF2 (following 'RMRK=')
Map 'Deny Line Log Note' when 2400.NTE02 = LAF1 (following 'RMRK=')",Only if 2400.NTE*TPO is present (FIrst occurence of TPO),Map 'Apply Percentage Log Note' when 2400.HCP01 = 10,When 2400.HCP01 = 10(FIrst occurence),
```

## Secondary Editing IB/V26.1.0.0/EdifecsProduct_MappingSpec_Secondary Editing_DFF_to_XMLConversion_V2.0.xlsx — IB file Layouts

```csv
Cotivity






Optum





Evicore




Sample XML Layout
```

## Secondary Editing IB/V26.1.0.0/EdifecsProduct_MappingSpec_Secondary Editing_DFF_to_XMLConversion_V2.0.xlsx — EDI Format

```csv
Multiplan/Calritev,,,,,,,,Zelis
```
