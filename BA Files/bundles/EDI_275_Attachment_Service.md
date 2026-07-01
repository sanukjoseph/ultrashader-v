# EDI 275 Attachment Service

## EDI 275 Attachment Service/EDI 275_Audit Layout_V1.0.xlsx — Cover Sheet

```csv
EDIFECS - EDI 275 Attachment Services - Audit Processing,,,,,,,,,
,,,,,,,,,
Business Area: EDI 275 Attachment Service,,,,,,,,,
,,,,,,,,,
"This document provides the Audit Specification for EDI 275 Attachment services.
Document is intended for EDIFECS Product Team",,,,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,Version,,V25.3.0.0,,,
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

## EDI 275 Attachment Service/EDI 275_Audit Layout_V1.0.xlsx — Audit Layout

```csv
Column Name,DataType,Min Value,Max Value,Remarks
FileLevel_Identifier,VARCHAR,0,100,UID
Vendor_Identifier,VARCHAR,0,100,PRODUCT
Submitter_Name,VARCHAR,1,130,1000B - NM103(60) + NM104(35) + NM105(25) (Submitter)  + 2(delimiter)
FileInput_Type,VARCHAR,0,30,EDI
Input_File_Name,VARCHAR,0,255,FileName
Input_Archive_Name,VARCHAR,0,255,Archived Name
Transaction_RecordIdentifier_Source,VARCHAR,1,50,REF*EJ --> 02 Value
Patient_Identification_Number,VARCHAR,2,80,1000D - NM109
Provider_Id,VARCHAR,2,80,1000C - NM109
Provider_Name,VARCHAR,1,80,1000C - NM103(3) + NM104(35) + NM105(25) + NM107(10)  + 3(delimiter)
Patient_Name,VARCHAR,1,140,1000D - NM103(60) +  NM104(35) + NM105(25) + NM107(10  + 3(delimiter))
AttachmentLevel_Identifier,VARCHAR,0,50,GUID
Attachment_RecordIdentifier_Source,VARCHAR,1,50,2000A - TRN02 | Attachment Controm Number
Attachment_Name,VARCHAR,0,255,AttachmentLevelID(TRN02).Extension
Total_Attachment_Count,VARCHAR,0,10,Total Attachment Count
Process_Stage_Name,VARCHAR,0,100,Stage Name
Process_Status,VARCHAR,0,20,Status - Success or Failure
Error_Message,VARCHAR,0,5000,Error message from LDNS
Audit_Time,VARCHAR,,25,Format - {CDT[yyyy-MM-dd HH:mm:ss.SSS]}
Created_Time,datetime,not null,,
```

## EDI 275 Attachment Service/EDI 275_Audit Layout_V1.0.xlsx — Audit events

```csv
processStageName,processStatus
Message Read,Success
HIPAA validation,Success/ Failure
Binary Conversion,Success/ Failure
```
