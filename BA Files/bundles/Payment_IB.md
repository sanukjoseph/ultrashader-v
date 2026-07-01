# Payment IB

## Payment IB/V26.1.1.0/EdifecsProduct_Audit_JSON_Mapping_PaymentInbound_ZelisAdoption_V1.1.xlsx — Cover Sheet

```csv
Business Requirement Document,,,,,,,,,
,,,,,,,,,
EDIFECS PRODUCT_ Payment Inbound_Zelis Adoption,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
UST - HealthProof,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,Version,,26.1.1.0,,,
,,,,,,,,,
,,,,,,,,,
,Notice of Confidentiality and Custodial Responsibilities,,,,,,,,
,"This Edifecs  product document contains confidential information that is
Healthproof intellectual property. As a holder of this document, you
 may NOT disclose its content or any information derived from it to
any person outside of  UST Product Team.",,,,,,,,
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

## Payment IB/V26.1.1.0/EdifecsProduct_Audit_JSON_Mapping_PaymentInbound_ZelisAdoption_V1.1.xlsx — Revision History

```csv
REVISION HISTORY,,,,
,,,,
,,,,
V#,Date,Author,Reviewer(s)/ Contributor(s),Comments
0.1,12/09/2025,Swedha Kumar,Ambily Raj,Initial Draft
1.0,18/09/2025,Swedha Kumar,Ambily Raj,Baselined
1.1,5/12/25,Swedha Kumar,Ambily Raj,Updated Audit events as per Java suggestion
```

## Payment IB/V26.1.1.0/EdifecsProduct_Audit_JSON_Mapping_PaymentInbound_ZelisAdoption_V1.1.xlsx — Correspondence Audit Mapping

```csv
Group,Fields,Sub Fields,Data Type,Usage,Sample Values,Description,Comments
inputDetails,inputId,,String,Y,Value passed is  - {UID}- Unique for each file,Unique ID of the input file received from source.,
,inputFileName,,String,,Input Filename of the JSON file received with filename extension,Name of the input file received from source.,
,inputType,,String,,json,Defines the type of input file,
,sourceTypeIdentifier,,String,,,,
,tenantIdentifier,,String,,,Field to send the vendor name(CHC or PNC or Zelis) and should be configurable,
,totalTransactions,,Integer,,Total count of the records in the inbound file,Total no. of transactions/Record received in API/File,
,inputArchiveFilename,,String,,Input Filename of the JSON file archived in s3 with filename extension,Name of the input file after archiving the input file.,
process,processStageName,,String,Y,refer Audit events tab,Represent the name of the process stage which post the Audit point.,
,processStatus,,String,Y,refer Audit events tab,Represent the Intermediate or Final status of the process stage which posts the Audit point.,
,processMessage,,String,,refer Audit events tab,Specific information of a particular step after the process is completed.,
,auditTime,,DateTime,Y,"The time the audit trigger event got generated in YYYY-MM-DD HH:MM:SS.SSS format
Sample: 2025-08-07 10:49:02.993",Auditing time of each audit point,
identifiers,rayIdentifier,,String,Y,GUID(record level),"Unique Identifier for the complete lifecycle of transaction/Record. Will be unchanged even the transaction is Split, passed across various system, reprocessed.",Mandatory for record level
,recordIdentifier,,String,Y,UID(record level),Unique Identifier for transaction level. Will be different when reprocess a same record.,Mandatory for record level
,recordIdentifierFromSource,,String,,Blank,,
Correspondence,paymentDetails,,,,,,
,,paymentId,String,,,,
,,paymentTransactionId,String,,,,
,,remittanceIssueDate,DateTime,,,,
```

## Payment IB/V26.1.1.0/EdifecsProduct_Audit_JSON_Mapping_PaymentInbound_ZelisAdoption_V1.1.xlsx — Payment status Audit Mapping

```csv
Group,Fields,Sub Fields,Data Type,Mandatory,Sample Values,Description,Comments,Record level or file
inputDetails,inputId,,String,Y,Value passed is  - {UID}- Uniqie for each file,Unique ID of the input file received from source.,,
,inputFileName,,String,,Input Filename of the JSON file received with filename extension,Name of the input file received from source.,,
,inputType,,String,,,Defines the type of input file - API or File,,
,paymentSourceName,,String,,blank,,,
,tenantIdentifier,,String,,blank,A new field tenantIdentifier has been added under the inputDetails block. This should be passed to iPlus.,Field to send the vendor name(CHC or PNC or Zelis) and should be configurable,
,totalTransactions,,Integer,,blank,"Total no. of transactions
The value should be trigger for each audit event",,
,totalSuccessCount,,Integer,,blank,Total Number of successfully processed records,NA for Edifecs,
,totalFailureCount,,Integer,,blank,Total Number of failed records,NA for Edifecs,
,inputArchiveFilename,,String,,Input Filename of the json file archived in s3 with filename extension,Name of the input file after archiving the input file.,,
,fileLoadStatus,,String,,,,,
process,processStageName,,String,Y,refer Audit events tab,Represent the name of the process stage which post the Audit point.,,
,processStatus,,String,Y,refer Audit events tab,Represent the Intermediate or Final status of the process stage which posts the Audit point.,,
,processMessage,,String,,refer Audit events tab,Specific information of a particular step after the process is completed.,,
,processInputArchiveFilename,,String,,Input Filename of the Json file received with filename extension,Name of the input Archive file of the process stage which posts the Audit point.,This field is required only if Edifecs is archiving the Input File,
,processOutputArchiveFilename,,String,,NA,Name of the output Archive file of the process stage which posts the Audit point.,This field is required only if Edifecs is archiving the Output File,
,auditTime,,DateTime,Y,"The time the audit trigger event got generated in YYYY-MM-DD HH:MM:SS.SSS format
Sample: 2025-08-07 10:49:02.993",Auditing time of each audit point,Format changed and Updated based on Dev confirmation,
identifiers,rayIdentifier,,String,Y,544EBB07-F93F-431F-A5A8-1A496F8E29C5,"Unique Identifier for the complete lifecycle of transaction/Record. Will be unchanged even the transaction is Split, passed across various system, reprocessed.",Mandatory for record level,
,recordIdentifier,,String,Y,CFD38507-277B-4342-857D-EE220D971AFE,Unique Identifier for transaction level. Will be different when reprocess a same record.,,
,recordIdentifierFromSource,,String,,blank,,,
,retriedReferenceIdentifier,,String,,NA,"This field indicates unique identifier for a transaction that has been retried.
Note: If implementation team want to retry the failed record using the archived file, we have to populate. Can be ignored this for now.",,
payment,paymentNumber,,String,,,,,
,checkNumber,,String,,,,,
,paymentStatus,,String,,,,,
,hrpResponse,cvcId,Integer,,,,,
,,hrpResponseStatus,String,,,,,
,archive,paymentRequestArchiveFilename,String,,,,,
,,paymentResponseArchiveFilename,String,,,,,
```

## Payment IB/V26.1.1.0/EdifecsProduct_Audit_JSON_Mapping_PaymentInbound_ZelisAdoption_V1.1.xlsx — Audit events

```csv
Payment Inbound,,,,,
Process Stage Name,Process Status,Process Message,File Level/Record level,JSON Trigger Event,Description
edifecs:file received,FILE RECEIVED,,File Level,When the inbound Payment IB file is received via Listener,As soon as IB file is picked up by Edifecs for processing (File level)
edifecs:file validation,PROCESSED,,File Level,File level Validation,Start of validations and spilting (File Level )
edifecs:file validation,ERROR,Error description,Blank File - File Level,"This audit will be sent at any stage, in case of error in the transaction",Empty files - failed in file level validation
edifecs:message split,PROCESSED,,Record level,When the inbound Payment IB file is split into record level,Once the record level split happens
edifecs:publish completed,MESSAGE PUBLISHED,,Record level,Send the grouped json to java queue,
,,,,,
Success,,,,,
edifecs:file received,FILE RECEIVED,,,,
edifecs:file validation,PROCESSED,,,,
,,,,,
Error Scenario 1,,,,,
edifecs:file received,FILE RECEIVED,,,,
edifecs:file validation,ERROR,,,,
```

## Payment IB/V26.1.1.0/EdifecsProduct_Audit_JSON_Mapping_PaymentInbound_ZelisAdoption_V1.1.xlsx — Attachments

```csv
Payment Audit structure,https://usthp-products.atlassian.net/wiki/spaces/IPLUSCore/pages/716734492/Audit+JSON+Structure+-+Payment+IB
Correspondence Audit Structure,https://usthp-products.atlassian.net/wiki/spaces/IPLUSCore/pages/904069180/Edifecs+-+Audit+Json+structure
Audit QueueApi Details,https://usthp-products.atlassian.net/browse/INTP-21280
```

## Payment IB/V26.1.1.0/EdifecsProduct_Audit_JSON_Mapping_PaymentInbound_ZelisAdoption_V1.1.xlsx — Sample Audit Json

```csv
//--------------fILE LEVEL
1)This audit point defines the file has been received
{
"""inputDetails"":"
{
"""inputId"": ""7GAhmuhZngfMDJsQ"","
"""inputFileName"": ""USTDailyStatusReport_20250628000_DF307987_55 (2) - Copy"","
"""totalTransactions"":""3"","
"""inputArchiveFilename"": ""Input_2025120402520058_USTDailyStatusReport_20250628000_DF307987_55 (2) - Copy"""

"},"
"""process"":"
{
"""processStageName"": ""edifecs:file received"","
"""processStatus"": ""FILE RECEIVED"","
"""processInputArchiveFilename"": ""USTDailyStatusReport_20250628000_DF307987_55 (2) - Copy"","
"""processOutputArchiveFilename"": """","
"""auditTime"": ""2025-12-04 02:52:59.156"""
}
}

"1)This audit point mentions about the file validation. If validation successful, split happens. If validation fails(eg: empty file or corruped file), the process ends"
{
"""inputDetails"":"
{
"""inputId"": ""7GAhmuhZngfMDJsQ"","
"""inputFileName"": ""USTDailyStatusReport_20250628000_DF307987_55 (2) - Copy"","
"""totalTransactions"":""3"","
"""inputArchiveFilename"": ""Input_2025120402520058_USTDailyStatusReport_20250628000_DF307987_55 (2) - Copy"""

"},"
"""process"":"
{
"""processStageName"": ""edifecs:file validation"","
"""processStatus"": ""PROCESSED/ERROR"","
"""processInputArchiveFilename"": ""USTDailyStatusReport_20250628000_DF307987_55 (2) - Copy"","
"""processOutputArchiveFilename"": """","
"""auditTime"": ""2025-12-04 02:52:59.156"""
}
}

//---------------Transaction level------------------------------
//1st record:
{
"""inputDetails"":"
{
"""inputId"": ""7GAhmuhZngfMDJsQ"","
"""inputFileName"": ""USTDailyStatusReport_20250628000_DF307987_55 (2) - Copy"","
"""totalTransactions"":"""","
"""inputArchiveFilename"": ""Input_2025120402520058_USTDailyStatusReport_20250628000_DF307987_55 (2) - Copy"""

"},"
"""process"":"
{
"""processStageName"": ""edifecs:message split"","
"""processStatus"": ""PROCESSED"","
"""processInputArchiveFilename"": ""USTDailyStatusReport_20250628000_DF307987_55 (2) - Copy"","
"""processOutputArchiveFilename"": """","
"""auditTime"": ""2025-12-04 02:52:59.145"""
"},"
"""identifiers"":"
{
"""rayIdentifier"": ""C5642D26-691C-45F1-BAF2-84E38C9EBB32"","
"""recordIdentifier"": ""068B51AF-7693-4A99-8F6D-968CBCE0EE99"","
"""recordIdentifierFromSource"": """""
}
}


{
"""inputDetails"":"
{
"""inputId"": ""7GAhmuhZngfMDJsQ"","
"""inputFileName"": ""USTDailyStatusReport_20250628000_DF307987_55 (2) - Copy"","
"""totalTransactions"":"""","
"""inputArchiveFilename"": ""Input_2025120402520058_USTDailyStatusReport_20250628000_DF307987_55 (2) - Copy"""

"},"
"""process"":"
{
"""processStageName"": ""edifecs:publish completed"","
"""processStatus"": ""MESSAGE PUBLISHED"","
"""processInputArchiveFilename"": ""USTDailyStatusReport_20250628000_DF307987_55 (2) - Copy"","
"""processOutputArchiveFilename"": """","
"""auditTime"": ""2025-12-04 02:52:59.378"""
"},"
"""identifiers"":"
{
"""rayIdentifier"": ""C5642D26-691C-45F1-BAF2-84E38C9EBB32"","
"""recordIdentifier"": ""068B51AF-7693-4A99-8F6D-968CBCE0EE99"","
"""recordIdentifierFromSource"": """""
}
}




//2nd record:
{
"""inputDetails"":"
{
"""inputId"": ""7GAhmuhZngfMDJsQ"","
"""inputFileName"": ""USTDailyStatusReport_20250628000_DF307987_55 (2) - Copy"","
"""totalTransactions"":"""","
"""inputArchiveFilename"": ""Input_2025120402520058_USTDailyStatusReport_20250628000_DF307987_55 (2) - Copy"""

"},"
"""process"":"
{
"""processStageName"": ""edifecs:message split"","
"""processStatus"": ""PROCESSED"","
"""processInputArchiveFilename"": ""USTDailyStatusReport_20250628000_DF307987_55 (2) - Copy"","
"""processOutputArchiveFilename"": """","
"""auditTime"": ""2025-12-04 02:52:59.088"""
"},"
"""identifiers"":"
{
"""rayIdentifier"": ""A90CC353-EB5A-4ADA-97A0-A824D3F7FA81"","
"""recordIdentifier"": ""775C7D71-44C3-4ED0-A1D8-206D7EF8210C"","
"""recordIdentifierFromSource"": """""
}
}


//------------------------------- File message publish -------------------------------
{
"""inputDetails"":"
{
"""inputId"": ""7GAhmuhZngfMDJsQ"","
"""inputFileName"": ""USTDailyStatusReport_20250628000_DF307987_55 (2) - Copy"","
"""totalTransactions"":"""","
"""inputArchiveFilename"": ""Input_2025120402520058_USTDailyStatusReport_20250628000_DF307987_55 (2) - Copy"""

"},"
"""process"":"
{
"""processStageName"": ""edifecs:publish completed"","
"""processStatus"": ""MESSAGE PUBLISHED"","
"""processInputArchiveFilename"": ""USTDailyStatusReport_20250628000_DF307987_55 (2) - Copy"","
"""processOutputArchiveFilename"": """","
"""auditTime"": ""2025-12-04 02:52:59.319"""
"},"
"""identifiers"":"
{
"""rayIdentifier"": ""A90CC353-EB5A-4ADA-97A0-A824D3F7FA81"","
"""recordIdentifier"": ""775C7D71-44C3-4ED0-A1D8-206D7EF8210C"","
"""recordIdentifierFromSource"": """""
}
}
```

## Payment IB/V26.1.1.0/Payment IB_PNC&CHC/EdifecsProduct_Audit JSON_IB Payment Mapping_V1.0.xlsx — Revision History

```csv
,Revision History,,,,
,,,,,
,V#,Date,Author,Reviewer(s)/ Contributor(s),Comments
,0.1,27-06-2025,Deepthi Marella,,"Initial Version
• Mapping Specs"
,1.0,08-08-2025,Deepthi Marella,,Final Version
,,8/29/25,Deepthi Marella,,"Updated the below fields
1. paymentSourceName
2. totalTransactions"
```

## Payment IB/V26.1.1.0/Payment IB_PNC&CHC/EdifecsProduct_Audit JSON_IB Payment Mapping_V1.0.xlsx — Cover Page

```csv
,IB Payment Audit Processing -  EDIFECS,,,,,,,,,
,,,,,,,,,,
,Business Area: Payment IB,,,,,,,,,
,,,,,,,,,,
,This document provides the Mapping Specification for EDI 835 OB Payment. Document is intended for EDIFECS Product Team,,,,,,,,,
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

## Payment IB/V26.1.1.0/Payment IB_PNC&CHC/EdifecsProduct_Audit JSON_IB Payment Mapping_V1.0.xlsx — Audit JSON Mapping

```csv
Group,Fields,Sub Fields,Data Type,Mandatory (Present in all Audit points),Mandatory (Present in atleast one Audit Point),Sample Values,Description,Comments
inputDetails,inputId,,String,Y,,Value passed is  - {UID}- Uniqie for each file,Unique ID of the input file received from source.,
,inputFileName,,String,,,Input Filename of the PFF file received with filename extension,Name of the input file received from source.,
,inputType,,String,,,,Defines the type of input file - API or File,
,paymentSourceName,,String,,,"PROVIDER SETTLEMENT
CHECK RECONCILIATION",,
,tenantIdentifier,,String,,,,A new field tenantIdentifier has been added under the inputDetails block. This should be passed to iPlus.,Field to send the vendor name(CHC or PNC or Zing) and should be configurable
,totalTransactions,,Integer,,,,"Total no. of transactions/Record received in API/File
The value should be trigger for each audit event",
,totalSuccessCount,,Integer,,,,Total Number of successfully processed records,NA for Edifecs
,totalFailureCount,,Integer,,,,Total Number of failed records,NA for Edifecs
,inputArchiveFilename,,String,,,Input Filename of the PFF file archived in s3 with filename extension,Name of the input file after archiving the input file.,
,fileLoadStatus,,String,,,,,
process,processStageName,,String,Y,,,Represent the name of the process stage which post the Audit point.,
,processStatus,,String,Y,,"MESSAGE READ
PROCESSED
MESSAGE PUBLISHED",Represent the Intermediate or Final status of the process stage which posts the Audit point.,
,processMessage,,String,,,"Connection-timeout
Rejected",Specific information of a particular step after the process is completed.,
,processInputArchiveFilename,,String,,,Input Filename of the PFF file received with filename extension,Name of the input Archive file of the process stage which posts the Audit point.,This field is required only if Edifecs is archiving the Input File
,processOutputArchiveFilename,,String,,,NA,Name of the output Archive file of the process stage which posts the Audit point.,This field is required only if Edifecs is archiving the Output File
,auditTime,,DateTime,Y,,"The time the audit trigger event got generated in YYYY-MM-DD HH:MM:SS.SSS format
Sample: 2025-08-07 10:49:02.993",Auditing time of each audit point,Format changed and Updated based on Dev confirmation
identifiers,rayIdentifier,,String,Y,Y,544EBB07-F93F-431F-A5A8-1A496F8E29C5,"Unique Identifier for the complete lifecycle of transaction/Record. Will be unchanged even the transaction is Split, passed across various system, reprocessed.",Mandatory for record level
,recordIdentifier,,String,Y,Y,CFD38507-277B-4342-857D-EE220D971AFE,Unique Identifier for transaction level. Will be different when reprocess a same record.,
,recordIdentifierFromSource,,String,,,,"1. Provider Settlement - EPP ID+check number
2. Check Recon - Group code+check number",
,retriedReferenceIdentifier,,String,,,NA,"This field indicates unique identifier for a transaction that has been retried.
Note: If implementation team want to retry the failed record using the archived file, we have to populate. Can be ignored this for now.",
payment,paymentNumber,,String,,,Actual Payment Id,Payment ID,
,checkNumber,,String,,,,Unique ID for each Payment transaction,
,paymentStatus,,String,,,,The process status of the transaction,
,hrpResponse,cvcId,Integer,,,,,NA for Edifecs
,,hrpResponseStatus,String,,,,,
,archive,paymentRequestArchiveFilename,String,,,,"Unique identifier for each claim, will be different when the claim is reprocessed",
,,paymentResponseArchiveFilename,String,,,,"Claim HCC ID - Unique ID for each claim, will remain unchanged when reprocessed",
```

## Payment IB/V26.1.1.0/Payment IB_PNC&CHC/EdifecsProduct_Audit JSON_IB Payment Mapping_V1.0.xlsx — Audit events

```csv
Both Check Recon & Provider Settlement,,,,,
Process Stage Name,Process Status,Process Message,File Level/Record level,JSON Trigger Event,Description
edifecs:message received,MESSAGE READ,,File Level,When the inbound Payment IB file is received via Listener,As soon as IB file is picked up by Edifecs for processing (File level)
edifecs:validation,PROCESSED,,File Level & Record level,Validations started for the payment records,Start of validations (File Level & Record level)
edifecs:validation failed,ERROR,Error description,"Blank File - File Level
Error records - Record level","This audit will be sent at any stage, in case of error in the transaction",One or more records failed validation and were flagged (File Level & Record level)
edifecs:conversion,PROCESSED,,Record Level,"Splitting, grouping and conversion of payment records to XML format started",Edifecs begins XML conversion after validations (Record Level)
edifecs:conversion failed,ERROR,,Record Level,"This audit will be sent at any stage, in case of error in the transaction",XML conversion failed after validations (Record Level)
edifecs:publish completed,MESSAGE PUBLISHED,,Record Level,Converted payment XML sent to Check Reconciliation adaptor,Edifecs sends grouped and valid XML to Check Recon Adaptor (Record Level)
,,,,,
Success,,,,,
edifecs:message received,MESSAGE READ,,,,
edifecs:validation,PROCESSED,,,,
edifecs:conversion,PROCESSED,,,,
edifecs:publish completed,MESSAGE PUBLISHED,,,,
,,,,,
Error Scenario 1,,,,,
edifecs:message received,MESSAGE READ,,,,
edifecs:validation failed,ERROR,,,,
,,,,,
Error Scenario 2,,,,,
edifecs:message received,MESSAGE READ,,,,
edifecs:validation,PROCESSED,,,,
edifecs:conversion failed,ERROR,,,,
```

## Payment IB/V26.1.1.0/Payment IB_PNC&CHC/EdifecsProduct_Audit JSON_IB Payment Mapping_V1.0.xlsx — Audit Sample

```csv
{
"""inputDetails"":"
{
"""inputId"": ""go8BmJfr5La763da"","
"""inputFileName"": ""IB_Payment_ProviderSettlement_greaterline_checknumber0paymentidblank.dat"","
"""inputType"": ""PROVIDER_SETTLEMENT"","
"""totalTransactions"":2,"
"""inputArchiveFilename"": ""Input_IB_Payment_ProviderSettlement_greaterline_checknumber0paymentidblank.dat"""

"},"
"""process"":"
{
"""processStageName"": ""Edifecs-Validation"","
"""processStatus"": ""PROCESSED"","
"""processInputArchiveFilename"": ""IB_Payment_ProviderSettlement_greaterline_checknumber0paymentidblank.dat"","
"""auditTime"": ""2025-08-11 02:57:57.652"""
"},"
"""identifiers"":"
{
"""rayIdentifier"": ""544EBB07-F93F-431F-A5A8-1A496F8E29C5"","
"""recordIdentifier"": ""CFD38507-277B-4342-857D-EE220D971AFE"","
"""recordIdentifierFromSource"": ""EPP000000509415414000000015051"""
"},"
"""payment"":"
{
"""paymentNumber"": ""15051"","
"""checkNumber"":""000000015051"""
}
}
```

## Payment IB/V26.1.1.0/Payment IB_PNC&CHC/EdifecsProduct_Payment IB_Check Recon_Mapping v1.1.xlsx — Version History

```csv
REVISION HISTORY,,,,
,,,,
,,,,
V#,Date,Author,Reviewer(s)/ Contributor(s),Comments
0.1,19/06/2025,Swedha Kumar,,Initial Draft
1.0,7/11/25,Swedha Kumar,,Initial Draft
1.1,9/24/25,Deepthi Marella,Ambily Raj,Updated the <sourceTypeIdentifier> format matching with Audit
```

## Payment IB/V26.1.1.0/Payment IB_PNC&CHC/EdifecsProduct_Payment IB_Check Recon_Mapping v1.1.xlsx — Header Logic

```csv
XML Tags,Mandatory,Description,Comments
,,,
<inputId>,M,Unique identifier for the input file. [UUID],
<inputType>,M,"Type of input (e.g., CHECK_RECON).",
<inputFileName>,,Input File Name (the actual Input file Name).,
<inputArchiveFileName>,,Name of the archived file.,
<totalTransactions>,M,Total number of payment transactions in the file after spliting and grouping,
<XMLfileCreationDate>2025-06-11T10:00:00,,Date and time when the XML file was generated.,"These are not mandatory for edifecs. If edifecs gets any value in that, edifecs needs to pass."
<senderId>,,Identifier for the sending system or entity.,"These are not mandatory for edifecs. If edifecs gets any value in that, edifecs needs to pass."
<receiverId>,,Identifier for the receiving system or entity.,"These are not mandatory for edifecs. If edifecs gets any value in that, edifecs needs to pass."
<totalTransactions>,,,
<recordIdentifier>,M,From Edifecs,Dev can comeup with logic
<recordIdentifierFromSource>,M,Group code+check number,
<sourceTypeIdentifier>,M,CHECK RECONCILIATION,define Format and should be same in Audit - paymentSourceName
<rayIdentifier>,M,From Edifecs,Dev can comeup with logic
<tenantIdentifier>,,,
<referenceIdentifier>,,,
```

## Payment IB/V26.1.1.0/Payment IB_PNC&CHC/EdifecsProduct_Payment IB_Check Recon_Mapping v1.1.xlsx — Check Reconciliation-CHC

```csv
INDEX,Filed Name,Data Type,Mandatory?,Start position,Length,Format,Update to HRP,xml tag,Comments,Field Description
1.001,PayerCheckNumber,A,M,1,50,"Left Justified, with trailing spaces",,updatePaymentStatusIBRequestRoot/updatePaymentStatusRecord/updatePaymentStatus/criteria/checkNumber,"Grouping Logic - If the Check numbers are  same then Activity Date, EPC Draft number & Void Flag all three should be same in all the records",check number or payment reference number assigned by the payer (typically the health insurance company or the paying entity) for that specific payment or claim.
1.002,PayerGroupNumber,A,,51,50,"Left Justified, with trailing spaces",,updatePaymentStatusIBRequestRoot/updatePaymentStatusRecord/recordIdentifierFromSource,Group code+check number,Group Policy Number assigned by the payer.
1.003,Fundcode,A,,101,50,"Left Justified, with trailing spaces - Value if fund code is populated – this allows for bulk pulls from account",,,,code representing the financial source or fund from which the payment is being made.
1.004,CheckAmount,N,M,151,16,Leading 0s,,updatePaymentStatusIBRequestRoot/updatePaymentStatusRecord/updatePaymentStatus/criteria/checkAmount,"1. The records which has same check Number and the corresponding Check amount should be summed up and stored in this field
2. Last 2 digits are for decimal point in amount fields",Total amount of the check issued to the provider. Represents the gross payment made.
1.005,Activity_Date,N,M,167,8,YYYYMMDD - Void Date or Cleared Date,,updatePaymentStatusIBRequestRoot/updatePaymentStatusRecord/updatePaymentStatus/w3cReconciliationDate,1. Date Format should be YYYY-MM-DD,
,,,,,,,"Only the status in HRP changes to  CLEARED and CLEARED date get updated from the field, after checking the value of 'Void_flag'",updatePaymentStatusIBRequestRoot/updatePaymentStatusRecord/updatePaymentStatus/additionalPaymentInformation/clearedCheckDate,"1. Populate 'clearedCheckDate' when the Void Flag field is empty, as the the check is considered cleared.
2. Date Format should be YYYY-MM-DD","The date the payment activity occurred, usually the date the check/EFT was issued."
1.006,Payee_Name,A,,175,50,"Left Justified, with trailing spaces",,,,Name of the provider or entity receiving the payment. Matches the name associated with the claim or EPPID.
1.007,EPC_Draft_Number,N,M,225,16,Leading 0s,"Cross check  the external payment id -EPC_Draft_Number that gets updated via settlement process matches with 1.007 EPC_Draft_Number in cleared draft, then only the status will be changed to CLEARED.",updatePaymentStatusIBRequestRoot/updatePaymentStatusRecord/updatePaymentStatus/additionalPaymentInformation/externalPaymentId,,Draft/Check/EFT reference number generated by the payment vendor. Used for payment tracking.
1.008,EPC_Draft_Amount,N,,241,16,Leading 0s,,,The input file has same value populated in both EPC_Draft_Amount & Check Amount field,Amount of the payment corresponding to that specific draft/check/EFT.
1.009,Void_flag,A,M,257,1,,,updatePaymentStatusIBRequestRoot/updatePaymentStatusRecord/updatePaymentStatus/action,"1. when Void Flag is 'Y', Populate ""VOID""
2. when Void Flag is Empty, Populate ""CLEARED""
Note: This field cannot be kept as Mandatory in guideline, as it has blank as a valid value.",
,,,,258,,,,,,
```

## Payment IB/V26.1.1.0/Payment IB_PNC&CHC/EdifecsProduct_Payment IB_Check Recon_Mapping v1.1.xlsx — Audit Json Layout

```csv
{,,,
"""inputDetails"": {",,,
"""inputId"": ""String"",",,,
,,"inputFileName: ""String"",",
"""inputType"": ""String"",",,,
"""paymentSourceName"": ""String"",",,,
"""totalTransactions"": ""Int"",",,,
"""inputArchiveFilename"": ""String"",",,,
"""fileLoadStatus"": ""String""",,,
"},",,,
"""process"": {",,,
"""processStageName"": ""String"", // Mandatory",,,
"""processStatus"": ""String"",  // Mandatory",,,
"""processMessage"": ""String"",",,,
"""processInputArchiveFilename"": ""String"",",,,
"""processOutputArchiveFilename"": ""String"",",,,
"""auditTime"": ""2024-08-05T00:24:16:480"" // Mandatory",,,
"},",,,
"""identifiers"": {",,,
"""rayIdentifier"": ""String"",",,,
"""recordIdentifier"": ""String"",",,,
"""recordIdentifierFromSource"": ""String"", //eppID+check number - in provider settlement or group code+check number in check recon",,,
"""retriedReferenceIdentifier"": ""String"" // Previous record Identifier",,,
"},",,,
"""payment"": {",,,
"""paymentNumber"": ""String"",",,,
,,"checkNumber:""String"",",
,,"paymentStatus:""String"", // The process status of the transaction",
"""hrpResponse"":{",,,
"""cvcId"":""Integer"",",,,
"""hrpResponseStatus"": ""String""",,,
"},",,,
,,archive:{,
,,,"paymentRequestArchiveFilename: ""String"","
"""paymentResponseArchiveFilename"": ""String""",,,
,,},
},,,
},,,
```

## Payment IB/V26.1.1.0/Payment IB_PNC&CHC/EdifecsProduct_Payment IB_Provider Settlement_Mapping v1.1.xlsx — Revision History

```csv
,Revision History,,,,
,,,,,
,V#,Date,Author,Reviewer(s)/ Contributor(s),Comments
,0.1,13-06-2025,Deepthi Marella,Ambily Raj,"Initial Version
• Mapping Specs"
,1.0,7/11/2025,Deepthi Marella,Ambily Raj,Final Version
,1.1,9/15/25,Deepthi Marella,Ambily Raj,"As per an enhancement, Updated the mapping for Draft_Date field"
,,9/24/25,Deepthi Marella,Ambily Raj,Updated the <sourceTypeIdentifier> format matching with Audit
```

## Payment IB/V26.1.1.0/Payment IB_PNC&CHC/EdifecsProduct_Payment IB_Provider Settlement_Mapping v1.1.xlsx — Header Logic

```csv
XML Tags,Mandatory,Description,Comments
,,,
<inputId>,M,Unique identifier for the input file. [UUID],
<inputType>,M,"Type of input (e.g., PROVIDER_SETTLEMENT).",
<inputFileName>,,Input File Name (the actual Input file Name).,
<inputArchiveFileName>,,Name of the archived file.,
<totalTransactions>,M,Total number of payment transactions in the file after spliting and grouping (which is combination of 0001 & 0002 records).,
<XMLfileCreationDate>2025-06-11T10:00:00,,Date and time when the XML file was generated.,"These are not mandatory for edifecs. If edifecs gets any value in that, edifecs needs to pass."
<senderId>,,Identifier for the sending system or entity.,"These are not mandatory for edifecs. If edifecs gets any value in that, edifecs needs to pass."
<receiverId>,,Identifier for the receiving system or entity.,"These are not mandatory for edifecs. If edifecs gets any value in that, edifecs needs to pass."
<totalTransactions>,,,
<recordIdentifier>,M,From Edifecs,Dev can comeup with logic
<recordIdentifierFromSource>,M,EPP ID+check number/EPP ID+Payment ID,"EPP ID+Payment ID:
If check number is Zero"
<sourceTypeIdentifier>,M,PROVIDER SETTLEMENT,define Format and should be same in Audit - paymentSourceName
<rayIdentifier>,M,From Edifecs,Dev can comeup with logic
<tenantIdentifier>,,,
<referenceIdentifier>,,,
```

## Payment IB/V26.1.1.0/Payment IB_PNC&CHC/EdifecsProduct_Payment IB_Provider Settlement_Mapping v1.1.xlsx — Provider Settlement_Mapping

```csv
Index,Field Name,Data Type,Mandatory?,Start position,End Position,Length,Format/Description,Sample Value,Mapped to XSD element,XML tag,Mapping Comments,DESCRIPTION,Final Review Comments
Record Type 001 - Payment Record,,,,,,,,,,,,,
1.001,Record_Type,String,,1,4,4,"""0001""",,,,"0001 .One per consolidated Payment. Paper check,EFT Payment or Zero Pay RA","0001 .One per consolidated Payment. Paper check,EFT Payment or Zero Pay RA. Fixed value ""0001"". Identifies this as a Payment Record.",
1.002,EPPID,String,M,5,54,50,,,updatePaymentStatusIBRequestRoot/updatePaymentStatusRecord/recordIdentifierFromSource,,"EPP ID+check number/EPP ID+Payment ID
Note:
EPP ID+Payment ID:
If check number is Zero",Unique document ID assigned by the payment vendor for tracking the payment.,
1.003,Provider_tax_ID,String,,55,63,9,,,,,,Tax ID of the supplier,
1.004,Return_Name,String,,64,113,50,,,,,,Recipient of return address,
1.005,Return_Addr_Line1,String,,114,163,50,,,,,,"Payer/Issuer (Recipient) return address (used for checks or undeliverable mail processing, regulatory compliance).",
1.006,Return_Addr_Line2,String,,164,213,50,,,,,,"Payer/Issuer (Recipient) return address (used for checks or undeliverable mail processing, regulatory compliance).",
1.007,Bank_Name,String,,214,263,50,,,,,,Name of the bank of the payer,
1.008,Bank_City_State_Zip,String,,264,313,50,,,,,,Zip of the Payer bank,
1.009,Bank_code_Line1,String,,314,363,50,,,,,,Payer bank Code,
1.010,Bank_code_Line2,String,,364,413,50,,,,,,Payer bank Code,
1.011,EPC_Draft_Number,Number,M,414,429,16,"Right-justified, zero-filled",,updatePaymentStatusIBRequestRoot/updatePaymentStatusRecord/updatePaymentStatus/additionalPaymentInformation/externalPaymentId,,,Payment vendor’s check/draft number. Used to match payments during reconciliation between the vendor file and HRP.,
1.012,EPC_Routing_Number,String,,430,449,20,,,,,,For EFT transactions – required for banking reconciliation.,
1.013,EPC_Account_Number,String,,450,469,20,,,updatePaymentStatusIBRequestRoot/updatePaymentStatusRecord/updatePaymentStatus/criteria/bankAccountNumber,,,For EFT transactions – required for banking reconciliation.,
1.014,Draft_date,Date,,470,477,8,YYYYMMDD,,updatePaymentStatusIBRequestRoot/updatePaymentStatusRecord/updatePaymentStatus/additionalPaymentInformation/externalPaymentDate,,This field mapping should be only for PNC vendor,Date of the payment. Used to post the transaction to the correct period in HRP.,
1.015,Draft_Amount,Number,,478,493,16,,,,,,Amount of the payment. Used to post the transaction to the correct value in HRP.,
1.016,Payee_Name,String,,494,543,50,,,,,,Name/address of the provider/entity being paid. Used for payee validation and reporting in HRP.,
1.017,Payee_DBA,String,,544,593,50,,,,,,"Alternate or trade name under which the supplier operates, used for identification when different from the legal business name.",
1.018,Payee_Address,String,,594,643,50,,,,,,Name/address of the provider/entity being paid. Used for payee validation and reporting in HRP.,
1.019,Payee_CSZ,String,,644,693,50,,,,,,"Represents the City, State, and ZIP code portion of the supplier’ address.",
1.020,Payment_Week,String,,694,697,4,,,,,,Payment batch/week identifier from the payment vendor.,
1.021,First_Notice,String,,698,713,16,,,,,,Regulatory/compliance notifications for undeliverable payments or pending actions.,
1.022,Second_Notice,String,,714,729,16,,,,,,Regulatory/compliance notifications for undeliverable payments or pending actions.,
1.023,Final_Notice,String,,730,745,16,,,,,,Regulatory/compliance notifications for undeliverable payments or pending actions.,
1.024,W9_Message_Flag,String,,746,748,3,,,,,,Indicates if a W-9 form update is required for this provider.,
1.025,Return_Addr_Line3,String,,749,798,50,,,,,,"Payer/Issuer (Recipient) return address (used for checks or undeliverable mail processing, regulatory compliance).",
1.026,Payment_Type,String,M,799,799,1,Refer Payment type tab,,updatePaymentStatusIBRequestRoot/updatePaymentStatusRecord/customParameters/paymentTypeCode,,,"Defines if the payment was via Paper Draft, EFT, or Zero Pay RA.",
1.027,Form Code,String,M,800,819,20,Refer Payment type tab,,updatePaymentStatusIBRequestRoot/updatePaymentStatusRecord/customParameters/formCode,,,Document Delivery Type,
1.028,PAY_TO_NPI,String,,820,869,50,,,,,,National Provider Identifier (NPI) for the receiving provider.,
Record Type 2 Claim Level Information,,,,,,,,,,,,Description,
2.001,Record_Type,,,1,4,4,"""0002"". One for each claim",,,,,0002. One for each claim,
2.002,EPPID,String,M,5,54,50,,,updatePaymentStatusIBRequestRoot/updatePaymentStatusRecord/recordIdentifierFromSource,,,Unique document ID assigned by the payment vendor for tracking the payment.,
2.003,claim_number,String,,55,104,50,,,,,,Unique identifier of the claim in payer/vendor system.,
2.004,TPA_Number,String,,105,109,5,,,,,,Third Party Administrator identifier,
2.005,Patient_First_Name,String,,110,139,30,,,,,,Patient and insured party information.,
2.006,Ppatient_mi,String,,140,140,1,,,,,,The middle initial of the patient’s name associated with the claim.,
2.007,Patient_last_Name,String,,141,170,30,,,,,,Last name of the patient,
2.008,Insured_First_name,String,,171,200,30,,,,,,Patient and insured party information.,
2.009,Insured_Last_Name,String,,201,230,30,,,,,,Patient and insured party information.,
2.010,Certificate_number,String,,231,245,15,,,,,,Insurance policy or certificate identifier.,
2.011,Patient_account_Number,String,,246,265,20,,,,,,Provider-assigned account number for the patient.,
2.012,Service_Provider_name,String,,266,300,35,,,,,,Name of the servicing provider.,
2.013,Network_Name,String,,301,325,25,"Right-justified, zero-filled",,updatePaymentStatusIBRequestRoot/updatePaymentStatusRecord/customParameters/networkName,,we pass Transaction number from HRP in 835.,Passed-through transaction or network reference,
2.014,Payer_claim_number,String,,326,375,50,,,,,,Claim ID from the payer’s system.,
2.015,Check_number,Number,M,376,387,12,,,updatePaymentStatusIBRequestRoot/updatePaymentStatusRecord/updatePaymentStatus/criteria/checkNumber,,"For the non-issued payment, the Check number field will be 0000",Corresponds to the 001.EPC_Draft_Number.,
2.016,Group_Number,String,,388,397,10,,,,,,Group policy number for insured party.,
2.017,Customer_Service_number,String,,398,422,25,,,,,,Vendor customer support number for inquiries on this claim/payment.,
2.018,TOTAL_Billed_Amount,Number,,423,438,16,,,,,,"The total amount originally billed by the provider to the payer (insurance, TPA) for the claim, before any adjustments, reductions, or payments are applied.",
2.019,TOTAL_Adjustments_Amount,Number,,439,454,16,,,,,,The total amount reduced from the original billed amount due to various adjustments made by the payer before calculating the final payment.,
2.020,TOTAL_Net_Contract_Amount,Number,,455,470,16,,,,,,The total amount allowed for the claim after applying contract rates/agreements between the provider and the payer,
2.021,TOTAL_Patient_Obligation,Number,,471,486,16,,,,,,"The portion of the total claim amount that the patient is responsible to pay, after the payer (insurance) has applied contractual adjustments and calculated their portion of the payment.",
2.022,TOTAL_Net_Payment_Amount,Number,M,487,502,16,"Right-justified, zero-filled",,updatePaymentStatusIBRequestRoot/updatePaymentStatusRecord/updatePaymentStatus/criteria/checkAmount,,"1. Total of netpayment amount of 0002 records (which has same Check Number/Payment ID) should be equal to Type 0001 record EPC Draft amount fields
2. Last 2 digits are for decimal point in amount fields",Amount actually paid for this claim. These add up to the 001.Draft_Amount.,
2.023,COB_Amount,Number,,503,518,16,,,,,,"The amount paid by another insurance or payer before this payment was made.
It applies when the patient has multiple insurances (e.g., primary, secondary insurers).",
2.024,Note_Number,Number,,519,534,16,,,,,,"Associated with remark or explanation codes (e.g., adjustment reason codes).",
2.025,Provider_Discount,Number,,535,550,16,,,,,,The discount agreed upon between the provider and the payer (insurance/TPA) outside of contractual adjustments.,
2.026,Other_Adjustment,Number,,551,566,16,,,,,,"Represents any additional adjustments applied to the claim that do not fall under standard categories like contractual adjustments, provider discounts, or COB.",
2.027,"Customer_Defined_Field ""04""",String,,567,581,15,Used for customized applications,,,,,Used for customized applications,
2.028,"Customer_Defined_Field ""10""",String,,582,631,50,Used for customized applications,,,,,Used for customized applications,
2.029,Filler,String,,632,799,168,,,,,,The Filler field is simply unused or reserved space in the record layout.,
2.030,PaymentID,String,M,800,849,50,Unique identifier from client’s system if available and sent.,,updatePaymentStatusIBRequestRoot/updatePaymentStatusRecord/customParameters/paymentId,,,Unique identifier from client’s system if available and sent.,
2.031,pclaim_payer_payment_Date,Date,,850,857,8,YYYYMMDD - Required for all payment claims (Payer Check Date),,,,,YYYYMMDD - Required for all payment claims (Payer Check Date),
2.032,PClaimReceiptDate,Date,,858,865,8,YYYYMMDD- Pass through when available (Payer Claim received Date),,,,,YYYYMMDD- Pass through when available (Payer Claim received Date),
2.033,Original File ID,String,,866,915,50,,,,,,A unique identifier representing the source file from which the claim record originated.,
```

## Payment IB/V26.1.1.0/Payment IB_PNC&CHC/Payment IB - Audit Structure.txt — (text)

```text
{
    "inputDetails": {
        "inputId": "String",
		"inputFileName": "String",
        "inputType": "String",
        "paymentSourceName": "String",
        "totalTransactions": "Int",
        "inputArchiveFilename": "String",
        "fileLoadStatus": "String"
    },
    "process": {
        "processStageName": "String", // Mandatory
        "processStatus": "String",  // Mandatory
        "processMessage": "String",
        "processInputArchiveFilename": "String",
        "processOutputArchiveFilename": "String",
        "auditTime": "2024-08-05T00:24:16:480" // Mandatory
    },
    "identifiers": {
        "rayIdentifier": "String",
        "recordIdentifier": "String",
        "recordIdentifierFromSource": "String", //eppID+check number - in provider settlement or group code+check number in check recon
        "retriedReferenceIdentifier": "String" // Previous record Identifier
    },
    "payment": {
        "paymentNumber": "String",
		"checkNumber":"String",
		"paymentStatus":"String", // The process status of the transaction
        "hrpResponse":{
          "cvcId":"Integer",
          "hrpResponseStatus": "String"
        },
		"archive":{
			"paymentRequestArchiveFilename": "String",
            "paymentResponseArchiveFilename": "String"
		}
    }
}
```
