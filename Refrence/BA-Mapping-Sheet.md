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
assets\
└── BA-Mapping-Docs
    ├── EdifecsProduct_Audit_JSON_Mapping_PaymentInbound_ZelisAdoption_V1.1.md
    ├── EdifecsProduct_MappingSpec_Enrollment_DFF - XML Conversion_V3.5.md
    ├── EdifecsProduct_MappingSpec_InboundClaims_837_EDI_to_XMLConversion_V2.2.md
    └── EdifecsProduct_Mappingspec_OutboundEnrollment _834_XML_to_EDIConversion_V1.2.md

<file path="BA-Mapping-Docs/EdifecsProduct_Audit_JSON_Mapping_PaymentInbound_ZelisAdoption_V1.1.md">
# EdifecsProduct_Audit_JSON_Mapping_PaymentInbound_ZelisAdoption_V1.1
|Property|Value|
|----------|-------|
|**Source file**|`EdifecsProduct_Audit_JSON_Mapping_PaymentInbound_ZelisAdoption_V1.1.xlsx`|
|**Sheets**|Cover Sheet, Revision History, Correspondence Audit Mapping, Payment status Audit Mapping, Audit events, Attachments, Sample Audit Json|
|**Converted**|2026-06-24T11:46:42.471Z|
> ℹ️  Formulas are shown inline as `=FORMULA` after the cached value.
> Merged cells: anchor cell shows _(cs=N, rs=N)_; absorbed cells show ⬚.
> Formula Index per sheet is collapsible — click to expand.
---
## Contents
1. [Sheet: Cover Sheet](#sheet-cover-sheet)
2. [Sheet: Revision History](#sheet-revision-history)
3. [Sheet: Correspondence Audit Mapping](#sheet-correspondence-audit-mapping)
4. [Sheet: Payment status Audit Mapping](#sheet-payment-status-audit-mapping)
5. [Sheet: Audit events](#sheet-audit-events)
6. [Sheet: Attachments](#sheet-attachments)
7. [Sheet: Sample Audit Json](#sheet-sample-audit-json)
---
<a id="sheet-cover-sheet"></a>
## Sheet: Cover Sheet
|#|B|C|D|E|F|G|H|I|J|K|L|
|---|---|---|---|---|---|---|---|---|---|---|---|
|**3**||||||||||||
|**4**||||||||||||
|**5**||||||||||||
|**6**|Business Requirement Document  _(cs=11, rs=2)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**7**|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**8**|EDIFECS PRODUCT_ Payment Inbound_Zelis Adoption _(cs=11, rs=3)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**9**|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**10**|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**11**|UST - HealthProof _(cs=11, rs=2)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**12**|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**13**||||||||||||
|**14**||||||||||||
|**15**|||||Version _(cs=2)_|⬚|26.1.0.0|||||
|**16**||||||||||||
|**17**||||||||||||
|**18**||Notice of Confidentiality and Custodial Responsibilities _(cs=9)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚||
|**19**||This Edifecs  product document contains confidential information that is <br>Healthproof intellectual property. As a holder of this document, you<br> may NOT disclose its content or any information derived from it to <br>any person outside of  UST Product Team. _(cs=9, rs=4)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚||
|**20**||⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚||
|**21**||⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚||
|**22**||⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚||
|**23**||||||||||||
|**24**|Sign Off _(cs=11)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**25**||Name _(cs=2)_|⬚|Role _(cs=2)_|⬚|Organization _(cs=2)_|⬚|Date _(cs=2)_|⬚|Approval  _(cs=2)_|⬚|
|**26**|Approver #1|_(cs=2)_|⬚|_(cs=2)_|⬚|_(cs=2)_|⬚|_(cs=2)_|⬚|_(cs=2)_|⬚|
|**27**|Approver #2|_(cs=2)_|⬚|_(cs=2)_|⬚|_(cs=2)_|⬚|_(cs=2)_|⬚|_(cs=2)_|⬚|
|**28**|Approver #3|_(cs=2)_|⬚|_(cs=2)_|⬚|_(cs=2)_|⬚|_(cs=2)_|⬚|_(cs=2)_|⬚|
|**29**|Approver #4|_(cs=2)_|⬚|_(cs=2)_|⬚|_(cs=2)_|⬚|_(cs=2)_|⬚|_(cs=2)_|⬚|
---
<a id="sheet-revision-history"></a>
## Sheet: Revision History
|#|B|C|D|E|F|
|---|---|---|---|---|---|
|**1**||||||
|**2**||||||
|**3**||||||
|**4**|REVISION HISTORY _(cs=5, rs=2)_|⬚|⬚|⬚|⬚|
|**5**|⬚|⬚|⬚|⬚|⬚|
|**6**||||||
|**7**|V#|Date|Author|Reviewer(s)/ Contributor(s)|Comments|
|**8**|0.1|12/09/2025|Swedha Kumar|Ambily Raj|Initial Draft|
|**9**|1.0|18/09/2025|Swedha Kumar|Ambily Raj|Baselined|
|**10**|1.1|5/12/25|Swedha Kumar|Ambily Raj|Updated Audit events as per Java suggestion|
---
<a id="sheet-correspondence-audit-mapping"></a>
## Sheet: Correspondence Audit Mapping
|#|A|B|C|D|E|F|G|H|
|---|---|---|---|---|---|---|---|---|
|**1**|Group|Fields|Sub Fields|Data Type|Usage|Sample Values|Description|Comments|
|**2**|inputDetails _(rs=7)_|inputId||String|Y|Value passed is  - {UID}- Unique for each file|Unique ID of the input file received from source.||
|**3**|⬚|inputFileName||String||Input Filename of the JSON file received with filename extension|Name of the input file received from source.||
|**4**|⬚|inputType||String||json|Defines the type of input file||
|**5**|⬚|sourceTypeIdentifier||String|||||
|**6**|⬚|tenantIdentifier||String|||Field to send the vendor name(CHC or PNC or Zelis) and should be configurable||
|**7**|⬚|totalTransactions||Integer||Total count of the records in the inbound file|Total no. of transactions/Record received in API/File||
|**8**|⬚|inputArchiveFilename||String||Input Filename of the JSON file archived in s3 with filename extension|Name of the input file after archiving the input file.||
|**9**|process _(rs=4)_|processStageName||String|Y|refer Audit events tab|Represent the name of the process stage which post the Audit point.||
|**10**|⬚|processStatus||String|Y|refer Audit events tab|Represent the Intermediate or Final status of the process stage which posts the Audit point.||
|**11**|⬚|processMessage||String||refer Audit events tab|Specific information of a particular step after the process is completed.||
|**12**|⬚|auditTime||DateTime|Y|The time the audit trigger event got generated in YYYY-MM-DD HH:MM:SS.SSS format<br>Sample: 2025-08-07 10:49:02.993|Auditing time of each audit point||
|**13**|identifiers _(rs=3)_|rayIdentifier||String|Y|GUID(record level)|Unique Identifier for the complete lifecycle of transaction/Record. Will be unchanged even the transaction is Split, passed across various system, reprocessed.|Mandatory for record level|
|**14**|⬚|recordIdentifier||String|Y|UID(record level)|Unique Identifier for transaction level. Will be different when reprocess a same record.|Mandatory for record level|
|**15**|⬚|recordIdentifierFromSource||String||Blank|||
|**16**|Correspondence _(rs=4)_|paymentDetails|||||||
|**17**|⬚||paymentId|String|||||
|**18**|⬚||paymentTransactionId|String|||||
|**19**|⬚||remittanceIssueDate|DateTime|||||
---
<a id="sheet-payment-status-audit-mapping"></a>
## Sheet: Payment status Audit Mapping
|#|A|B|C|D|E|F|G|H|I|
|---|---|---|---|---|---|---|---|---|---|
|**1**|Group|Fields|Sub Fields|Data Type|Mandatory|Sample Values|Description|Comments|Record level or file|
|**2**|inputDetails _(rs=10)_|inputId||String|Y|Value passed is  - {UID}- Uniqie for each file|Unique ID of the input file received from source.||_(rs=10)_|
|**3**|⬚|inputFileName||String||Input Filename of the JSON file received with filename extension|Name of the input file received from source.||⬚|
|**4**|⬚|inputType||String|||Defines the type of input file - API or File||⬚|
|**5**|⬚|paymentSourceName||String||blank|||⬚|
|**6**|⬚|tenantIdentifier||String||blank|A new field tenantIdentifier has been added under the inputDetails block. This should be passed to iPlus.|Field to send the vendor name(CHC or PNC or Zelis) and should be configurable|⬚|
|**7**|⬚|totalTransactions||Integer||blank|Total no. of transactions<br>The value should be trigger for each audit event||⬚|
|**8**|⬚|totalSuccessCount||Integer||blank|Total Number of successfully processed records|NA for Edifecs|⬚|
|**9**|⬚|totalFailureCount||Integer||blank|Total Number of failed records|NA for Edifecs|⬚|
|**10**|⬚|inputArchiveFilename||String||Input Filename of the json file archived in s3 with filename extension|Name of the input file after archiving the input file.||⬚|
|**11**|⬚|fileLoadStatus||String|||||⬚|
|**12**|process _(rs=6)_|processStageName||String|Y|refer Audit events tab|Represent the name of the process stage which post the Audit point.|||
|**13**|⬚|processStatus||String|Y|refer Audit events tab|Represent the Intermediate or Final status of the process stage which posts the Audit point.|||
|**14**|⬚|processMessage||String||refer Audit events tab|Specific information of a particular step after the process is completed.|||
|**15**|⬚|processInputArchiveFilename||String||Input Filename of the Json file received with filename extension|Name of the input Archive file of the process stage which posts the Audit point.|This field is required only if Edifecs is archiving the Input File||
|**16**|⬚|processOutputArchiveFilename||String||NA|Name of the output Archive file of the process stage which posts the Audit point.|This field is required only if Edifecs is archiving the Output File||
|**17**|⬚|auditTime||DateTime|Y|The time the audit trigger event got generated in YYYY-MM-DD HH:MM:SS.SSS format<br>Sample: 2025-08-07 10:49:02.993|Auditing time of each audit point|Format changed and Updated based on Dev confirmation||
|**18**|identifiers _(rs=4)_|rayIdentifier||String|Y|544EBB07-F93F-431F-A5A8-1A496F8E29C5|Unique Identifier for the complete lifecycle of transaction/Record. Will be unchanged even the transaction is Split, passed across various system, reprocessed.|Mandatory for record level||
|**19**|⬚|recordIdentifier||String|Y|CFD38507-277B-4342-857D-EE220D971AFE|Unique Identifier for transaction level. Will be different when reprocess a same record.|||
|**20**|⬚|recordIdentifierFromSource||String||blank||||
|**21**|⬚|retriedReferenceIdentifier||String||NA|This field indicates unique identifier for a transaction that has been retried. <br>Note: If implementation team want to retry the failed record using the archived file, we have to populate. Can be ignored this for now.|||
|**22**|payment _(rs=7)_|paymentNumber||String||||||
|**23**|⬚|checkNumber||String||||||
|**24**|⬚|paymentStatus||String||||||
|**25**|⬚|hrpResponse _(rs=2)_|cvcId|Integer||||_(rs=4)_||
|**26**|⬚|⬚|hrpResponseStatus|String||||⬚||
|**27**|⬚|archive _(rs=2)_|paymentRequestArchiveFilename|String||||⬚||
|**28**|⬚|⬚|paymentResponseArchiveFilename|String||||⬚||
---
<a id="sheet-audit-events"></a>
## Sheet: Audit events
|#|A|B|C|D|E|F|
|---|---|---|---|---|---|---|
|**1**|Payment Inbound _(cs=6)_|⬚|⬚|⬚|⬚|⬚|
|**2**|Process Stage Name|Process Status|Process Message|File Level/Record level|JSON Trigger Event|Description|
|**3**|edifecs:file received|FILE RECEIVED||File Level|When the inbound Payment IB file is received via Listener|As soon as IB file is picked up by Edifecs for processing (File level)|
|**4**|edifecs:file validation|PROCESSED||File Level|File level Validation|Start of validations and spilting (File Level )|
|**5**|edifecs:file validation|ERROR|Error description|Blank File - File Level<br>|This audit will be sent at any stage, in case of error in the transaction|Empty files - failed in file level validation|
|**6**|edifecs:message split|PROCESSED||Record level|When the inbound Payment IB file is split into record level|Once the record level split happens|
|**7**|edifecs:publish completed|MESSAGE PUBLISHED||Record level|Send the grouped json to java queue||
|**8**|||||||
|**9**|Success||||||
|**10**|edifecs:file received|FILE RECEIVED|||||
|**11**|edifecs:file validation|PROCESSED|||||
|**12**|||||||
|**13**|Error Scenario 1||||||
|**14**|edifecs:file received|FILE RECEIVED|||||
|**15**|edifecs:file validation|ERROR|||||
---
<a id="sheet-attachments"></a>
## Sheet: Attachments
|#|A|B|
|---|---|---|
|**3**|Payment Audit structure|[https://usthp-products.atlassian.net/wiki/spaces/IPLUSCore/pages/716734492/Audit+JSON+Structure+-+Payment+IB](https://usthp-products.atlassian.net/wiki/spaces/IPLUSCore/pages/716734492/Audit+JSON+Structure+-+Payment+IB)|
|**4**|Correspondence Audit Structure|[https://usthp-products.atlassian.net/wiki/spaces/IPLUSCore/pages/904069180/Edifecs+-+Audit+Json+structure](https://usthp-products.atlassian.net/wiki/spaces/IPLUSCore/pages/904069180/Edifecs+-+Audit+Json+structure)|
|**5**|Audit QueueApi Details|[https://usthp-products.atlassian.net/browse/INTP-21280](https://usthp-products.atlassian.net/browse/INTP-21280)|
---
<a id="sheet-sample-audit-json"></a>
## Sheet: Sample Audit Json
|#|A|
|---|---|
|**1**|//--------------fILE LEVEL|
|**2**|1)This audit point defines the file has been received|
|**3**|{|
|**4**|"inputDetails":|
|**5**|{|
|**6**|"inputId": "7GAhmuhZngfMDJsQ",|
|**7**|"inputFileName": "USTDailyStatusReport_20250628000_DF307987_55 (2) - Copy",|
|**8**|"totalTransactions":"3",|
|**9**|"inputArchiveFilename": "Input_2025120402520058_USTDailyStatusReport_20250628000_DF307987_55 (2) - Copy"|
|**10**||
|**11**|},|
|**12**|"process":|
|**13**|{|
|**14**|"processStageName": "edifecs:file received",|
|**15**|"processStatus": "FILE RECEIVED",|
|**16**|"processInputArchiveFilename": "USTDailyStatusReport_20250628000_DF307987_55 (2) - Copy",|
|**17**|"processOutputArchiveFilename": "",|
|**18**|"auditTime": "2025-12-04 02:52:59.156"|
|**19**|}|
|**20**|}|
|**21**||
|**22**|1)This audit point mentions about the file validation. If validation successful, split happens. If validation fails(eg: empty file or corruped file), the process ends|
|**23**|{|
|**24**|"inputDetails":|
|**25**|{|
|**26**|"inputId": "7GAhmuhZngfMDJsQ",|
|**27**|"inputFileName": "USTDailyStatusReport_20250628000_DF307987_55 (2) - Copy",|
|**28**|"totalTransactions":"3",|
|**29**|"inputArchiveFilename": "Input_2025120402520058_USTDailyStatusReport_20250628000_DF307987_55 (2) - Copy"|
|**30**||
|**31**|},|
|**32**|"process":|
|**33**|{|
|**34**|"processStageName": "edifecs:file validation",|
|**35**|"processStatus": "PROCESSED/ERROR",|
|**36**|"processInputArchiveFilename": "USTDailyStatusReport_20250628000_DF307987_55 (2) - Copy",|
|**37**|"processOutputArchiveFilename": "",|
|**38**|"auditTime": "2025-12-04 02:52:59.156"|
|**39**|}|
|**40**|}|
|**41**||
|**42**|//---------------Transaction level------------------------------|
|**43**|//1st record:|
|**44**|{|
|**45**|"inputDetails":|
|**46**|{|
|**47**|"inputId": "7GAhmuhZngfMDJsQ",|
|**48**|"inputFileName": "USTDailyStatusReport_20250628000_DF307987_55 (2) - Copy",|
|**49**|"totalTransactions":"",|
|**50**|"inputArchiveFilename": "Input_2025120402520058_USTDailyStatusReport_20250628000_DF307987_55 (2) - Copy"|
|**51**||
|**52**|},|
|**53**|"process":|
|**54**|{|
|**55**|"processStageName": "edifecs:message split",|
|**56**|"processStatus": "PROCESSED",|
|**57**|"processInputArchiveFilename": "USTDailyStatusReport_20250628000_DF307987_55 (2) - Copy",|
|**58**|"processOutputArchiveFilename": "",|
|**59**|"auditTime": "2025-12-04 02:52:59.145"|
|**60**|},|
|**61**|"identifiers":|
|**62**|{|
|**63**|"rayIdentifier": "C5642D26-691C-45F1-BAF2-84E38C9EBB32",|
|**64**|"recordIdentifier": "068B51AF-7693-4A99-8F6D-968CBCE0EE99",|
|**65**|"recordIdentifierFromSource": ""|
|**66**|}|
|**67**|}|
|**68**||
|**69**||
|**70**|{|
|**71**|"inputDetails":|
|**72**|{|
|**73**|"inputId": "7GAhmuhZngfMDJsQ",|
|**74**|"inputFileName": "USTDailyStatusReport_20250628000_DF307987_55 (2) - Copy",|
|**75**|"totalTransactions":"",|
|**76**|"inputArchiveFilename": "Input_2025120402520058_USTDailyStatusReport_20250628000_DF307987_55 (2) - Copy"|
|**77**||
|**78**|},|
|**79**|"process":|
|**80**|{|
|**81**|"processStageName": "edifecs:publish completed",|
|**82**|"processStatus": "MESSAGE PUBLISHED",|
|**83**|"processInputArchiveFilename": "USTDailyStatusReport_20250628000_DF307987_55 (2) - Copy",|
|**84**|"processOutputArchiveFilename": "",|
|**85**|"auditTime": "2025-12-04 02:52:59.378"|
|**86**|},|
|**87**|"identifiers":|
|**88**|{|
|**89**|"rayIdentifier": "C5642D26-691C-45F1-BAF2-84E38C9EBB32",|
|**90**|"recordIdentifier": "068B51AF-7693-4A99-8F6D-968CBCE0EE99",|
|**91**|"recordIdentifierFromSource": ""|
|**92**|}|
|**93**|}|
|**94**||
|**95**||
|**96**||
|**97**||
|**98**|//2nd record:|
|**99**|{|
|**100**|"inputDetails":|
|**101**|{|
|**102**|"inputId": "7GAhmuhZngfMDJsQ",|
|**103**|"inputFileName": "USTDailyStatusReport_20250628000_DF307987_55 (2) - Copy",|
|**104**|"totalTransactions":"",|
|**105**|"inputArchiveFilename": "Input_2025120402520058_USTDailyStatusReport_20250628000_DF307987_55 (2) - Copy"|
|**106**||
|**107**|},|
|**108**|"process":|
|**109**|{|
|**110**|"processStageName": "edifecs:message split",|
|**111**|"processStatus": "PROCESSED",|
|**112**|"processInputArchiveFilename": "USTDailyStatusReport_20250628000_DF307987_55 (2) - Copy",|
|**113**|"processOutputArchiveFilename": "",|
|**114**|"auditTime": "2025-12-04 02:52:59.088"|
|**115**|},|
|**116**|"identifiers":|
|**117**|{|
|**118**|"rayIdentifier": "A90CC353-EB5A-4ADA-97A0-A824D3F7FA81",|
|**119**|"recordIdentifier": "775C7D71-44C3-4ED0-A1D8-206D7EF8210C",|
|**120**|"recordIdentifierFromSource": ""|
|**121**|}|
|**122**|}|
|**123**||
|**124**||
|**125**|//------------------------------- File message publish -------------------------------|
|**126**|{|
|**127**|"inputDetails":|
|**128**|{|
|**129**|"inputId": "7GAhmuhZngfMDJsQ",|
|**130**|"inputFileName": "USTDailyStatusReport_20250628000_DF307987_55 (2) - Copy",|
|**131**|"totalTransactions":"",|
|**132**|"inputArchiveFilename": "Input_2025120402520058_USTDailyStatusReport_20250628000_DF307987_55 (2) - Copy"|
|**133**||
|**134**|},|
|**135**|"process":|
|**136**|{|
|**137**|"processStageName": "edifecs:publish completed",|
|**138**|"processStatus": "MESSAGE PUBLISHED",|
|**139**|"processInputArchiveFilename": "USTDailyStatusReport_20250628000_DF307987_55 (2) - Copy",|
|**140**|"processOutputArchiveFilename": "",|
|**141**|"auditTime": "2025-12-04 02:52:59.319"|
|**142**|},|
|**143**|"identifiers":|
|**144**|{|
|**145**|"rayIdentifier": "A90CC353-EB5A-4ADA-97A0-A824D3F7FA81",|
|**146**|"recordIdentifier": "775C7D71-44C3-4ED0-A1D8-206D7EF8210C",|
|**147**|"recordIdentifierFromSource": ""|
|**148**|}|
|**149**|}|
---
</file>
<file path="BA-Mapping-Docs/EdifecsProduct_MappingSpec_Enrollment_DFF - XML Conversion_V3.5.md">
# EdifecsProduct_MappingSpec_Enrollment_DFF - XML Conversion_V3.5
|Property|Value|
|----------|-------|
|**Source file**|`EdifecsProduct_MappingSpec_Enrollment_DFF - XML Conversion_V3.5.xlsx`|
|**Sheets**|Cover Page, Version History, Transactions, Mapping Spec, Sheet1, Header Logic, Cross Walk, Appendix|
|**Converted**|2026-06-24T11:46:42.521Z|
> ℹ️  Formulas are shown inline as `=FORMULA` after the cached value.
> Merged cells: anchor cell shows _(cs=N, rs=N)_; absorbed cells show ⬚.
> Formula Index per sheet is collapsible — click to expand.
---
## Contents
1. [Sheet: Cover Page](#sheet-cover-page)
2. [Sheet: Version History](#sheet-version-history)
3. [Sheet: Transactions](#sheet-transactions)
4. [Sheet: Mapping Spec](#sheet-mapping-spec)
5. [Sheet: Sheet1](#sheet-sheet1)
6. [Sheet: Header Logic](#sheet-header-logic)
7. [Sheet: Cross Walk](#sheet-cross-walk)
8. [Sheet: Appendix](#sheet-appendix)
---
<a id="sheet-cover-page"></a>
## Sheet: Cover Page
|#|B|C|D|E|F|G|H|I|J|K|L|
|---|---|---|---|---|---|---|---|---|---|---|---|
|**5**||||||||||||
|**6**|Advantasure Enrollment MembershipOUT Data File Mapping Specification- EDIFECS _(cs=11, rs=2)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**7**|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**8**|Business Area: Enrollment IB (Non EDI) _(cs=11, rs=2)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**9**|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**10**|This document provides the Mapping Specification for Advantasure Enrollment memout DFF . Document is intended for EDIFECS Product Team<br> _(cs=11)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**11**||||||||||||
|**12**||||||||||||
|**13**|||||Version _(cs=2)_|⬚|26.1.0.0|||||
|**14**||||||||||||
|**15**||Distribution of this document is limited to UST HealthProof _(cs=9)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚||
|**16**||||||||||||
|**17**||Notice of Confidentiality and Custodial Responsibilities _(cs=9)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚||
|**18**||This UST HealthProof document contains confidential information that is <br>UST HealthProof’s intellectual property. As a holder of this document, you<br> may NOT disclose its content or any information derived from it to <br>any person outside of UST Proof Project Team. _(cs=9, rs=4)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚||
|**19**||⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚||
|**20**||⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚||
|**21**||⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚||
|**22**||||||||||||
|**23**|Sign Off _(cs=11)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**24**||Name _(cs=2)_|⬚|Role _(cs=2)_|⬚|Organization _(cs=2)_|⬚|Date _(cs=2)_|⬚|Approval  _(cs=2)_|⬚|
|**25**|Approver #1|_(cs=2)_|⬚|_(cs=2)_|⬚|_(cs=2)_|⬚|_(cs=2)_|⬚|_(cs=2)_|⬚|
|**26**|Approver #2|_(cs=2)_|⬚|_(cs=2)_|⬚|_(cs=2)_|⬚|_(cs=2)_|⬚|_(cs=2)_|⬚|
|**27**|Approver #3|_(cs=2)_|⬚|_(cs=2)_|⬚|_(cs=2)_|⬚|_(cs=2)_|⬚|_(cs=2)_|⬚|
|**28**|Approver #4|_(cs=2)_|⬚|_(cs=2)_|⬚|_(cs=2)_|⬚|_(cs=2)_|⬚|_(cs=2)_|⬚|
---
<a id="sheet-version-history"></a>
## Sheet: Version History
|#|B|C|D|E|F|
|---|---|---|---|---|---|
|**1**||||||
|**2**|Revision History _(cs=5)_|⬚|⬚|⬚|⬚|
|**3**||||||
|**4**||||||
|**5**||||||
|**6**|V#|Date|Author|Reviewer(s)/ Contributor(s)|Comments|
|**7**|2|02/16/23|Mithun M|Shijila M|Initial Version|
|**8**|2.4|45224|Ambily Raj|Rameshwar Singh|Added mapping for /medicaidDual Tag. <br>Mapping Logic changes for fields in FLG transaction<br>|
|**9**|3|04/29/24|Ambily Raj|Rameshwar Singh|Changes to accommodate the new tags in XSD - INTP-8177|
|**10**|3.1|05/17/24|Ambily Raj|Rameshwar Singh|Changes to accommodate the new tags in XSD - INTP-8521|
|**11**|3.2|08/17/24|Ambily Raj|Rameshwar Singh|Changes for PSD-2424|
|**12**|3.3|09/03/24|Ambily Raj|Rameshwar Singh|<br>1. Added mapping for new fields 162,163 and 164(SOGI Chgs)<br>2. Updated mapping for Fields 59, 60, 61(since codeset is updated in HE V24.1) and Fields 65 -71 (since tags are available in HE V24.1 XSD). <br>3.Changes for PSD-3334(Field No 23) and PSD-3374 (Field no 73)<br>4. Added mapping for PWO transaction fields.|
|**13**|3.4|2/12/24|Ambily Raj|Rameshwar Singh|Changes for IB enrollment LCN|
|**14**|3.5|4/15/25|Ambily Raj|Rameshwar Singh|Added mapping for M3P fields. <br>|
---
<a id="sheet-transactions"></a>
## Sheet: Transactions
|#|A|B|
|---|---|---|
|**1**|Transaction type|Mapping details|
|**2**|▪    DEM (Demographics) – Non spanable always contains the latest value|Mapped in Product Core|
|**3**|▪    ADR – Address History<br>|No Need to map as of now|
|**4**|▪    PLN – Plan Enrollment History|Mapped in Product Core|
|**5**|▪    PWO – Premium Withhold|Mapped in Product Core|
|**6**|▪    LIS – Low Income Subsidy|Mapped in Product Core|
|**7**|▪    LEP – Late Enrollment Penalty|Mapped in Product Core|
|**8**|▪    FLG – Flag set in the system|Mapped in Product Core|
|**9**|▪    BRK – Broker|No Need to map. Current direction is not to bring Broker data to HRP,|
|**10**|▪    PCP – Primary Care Physician|Mapped in Product Core. But since PCP information are implementaion specific, account teams needs to be review the mapping logic and make appropriate changes in adaptor if needed.|
|**11**|▪    GRP – Group/Subgroup information|No Need to map as of now|
|**12**|▪    RDR – Rider|No Need to map as of now|
|**13**|▪    COB – Coordination of Benefits|COB transaction is client specific. Needs to be handled at Implementaion side|
|**14**|▪    MCD - Medicaid|Mapped in Product Core|
|**15**|▪    M3P-Medicare Prescription Payment Plan|Mapped in Product Core|
---
<a id="sheet-mapping-spec"></a>
## Sheet: Mapping Spec
|#|A|B|C|D|E|F|G|H|I|J|K|L|M|N|
|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|
|**1**|Advantasure fields _(cs=8)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|HRP   _(cs=3)_|⬚|⬚|HE - Enrollment Sparse _(cs=3)_|⬚|⬚|
|**2**|No|field|Type||Details|Sample|Description|||||XML Mapping|Mapping Logics|Comments|
|**3**|1 _(rs=17)_|Transaction Type<br><br> _(rs=17)_|ALL _(rs=17)_|3 _(rs=17)_|_(rs=17)_|D _(rs=17)_|The transaction type that is being output and determines which fields will be populated on the record.<br>|_(rs=2)_|NA|Not needed _(rs=17)_|NA|NA|||
|**4**|⬚|⬚|⬚|⬚|⬚|⬚||⬚||⬚|||||
|**5**|⬚|⬚|⬚|⬚|⬚|⬚|LOV:|_(rs=2)_||⬚|||||
|**6**|⬚|⬚|⬚|⬚|⬚|⬚|▪    DEM (Demographics) – Non spanable always contains the latest value|⬚||⬚|||||
|**7**|⬚|⬚|⬚|⬚|⬚|⬚|▪    ADR – Address History<br>|||⬚|||||
|**8**|⬚|⬚|⬚|⬚|⬚|⬚|▪    PLN – Plan Enrollment History|||⬚|||||
|**9**|⬚|⬚|⬚|⬚|⬚|⬚|▪    PWO – Premium Withhold|||⬚|||||
|**10**|⬚|⬚|⬚|⬚|⬚|⬚|▪    LIS – Low Income Subsidy|||⬚|||||
|**11**|⬚|⬚|⬚|⬚|⬚|⬚|▪    LEP – Late Enrollment Penalty|||⬚|||||
|**12**|⬚|⬚|⬚|⬚|⬚|⬚|▪    FLG – Flag set in the system|||⬚|||||
|**13**|⬚|⬚|⬚|⬚|⬚|⬚|▪    BRK – Broker|||⬚|||||
|**14**|⬚|⬚|⬚|⬚|⬚|⬚|▪    PCP – Primary Care Physician|||⬚|||||
|**15**|⬚|⬚|⬚|⬚|⬚|⬚|▪    GRP – Group/Subgroup information|||⬚|||||
|**16**|⬚|⬚|⬚|⬚|⬚|⬚|▪    RDR – Rider|||⬚|||||
|**17**|⬚|⬚|⬚|⬚|⬚|⬚|▪    COB – Coordination of Benefits|||⬚|||||
|**18**|⬚|⬚|⬚|⬚|⬚|⬚|▪    MCD - Medicaid|||⬚|||||
|**19**|⬚|⬚|⬚|⬚|⬚|⬚|▪    M3P-Medicare Prescription Payment Plan|||⬚|||||
|**20**|2|Claims SubscriberID Number|ALL|11|Member Details|369258147|Unique ID assigned to each member generally assigned by the Claims system<br>|Field may be blank if a member is new and has not been assigned an ID by the client|Subscrier/Member HCCID<br>|Y|Member - ID details|/enrollment/subscription/hccIdentifier <br><br>/enrollment/member/hccIdentifier <br><br>Member match mapping - <br><br>enrollment/member/memberMatchData/id<br><br><br><br>||a.Member will maintain the same subscriber ID when switching plans (e.g. HMO to PPO and Vice Versa)<br>b. Member will maintain their original subscriber id even if they were disenrolled and reenrolled into the same plan or a different plan<br>c. Member will maintain their original subscriber id if they are reinstated (no gap in coverage)|
|**21**|3|Start Date|ALL|8|PCP/Enroll History|20080101|Span start date|Start date of the span indicated by the specific transaction type of each record|Start Date for each transaction type<br>When Transaction type is PLN - this is the Benefit start date<br>When Transaction type is PCP - this is the PCP start date<br>|Y|Member  - Plan<br>Member - provider<br>|When Transaction type is PLN - this is the Benefit start date<br><br>/enrollment/member/planSelection/startDate<br><br>When Transaction type is PCP - this is the PCP start date<br><br>enrollment/member/providerSelections/providerSelection/providerDateRanges/startDate<br>erollment/member/providerSelections/providerSelection/ providerRoleType  - hard code PCP<br><br>When Transaction type is M3P <br><br>/enrollment/member/medicareHICN/medicarePrescriptionPaymentPlans/medicarePrescriptionPaymentPlan/startDate<br><br>Populate /enrollment/asOfDate  as 1800-01-01<br>|||
|**22**|4|End Date<br>|ALL|8|PCP/Enroll History|20081231|Span end date|End date of the span indicated by the specific transaction type of each record|End Date for each transaction type<br>When Transaction type DEM comes along with an END Date (a date in field 4) - this is the Benefit end date and PCP end date. <br>When Transaction type is PCP - this is the PCP end date<br>|Y|Member  - Plan<br>Member - provider<br>|When Transaction type is PLN - this is the Benefit end date<br><br>/enrollment/member/planSelection/EndDate<br>If  Endate is NULL, populate as 3000-01-01<br><br>When Transaction type is PCP - this is the PCP end date<br><br>enrollment/member/providerSelections/providerSelection/providerDateRanges/endDate<br>If  Endate is NULL, populate as 3000-01-01<br><br>When Transaction type is M3P <br><br>/enrollment/member/medicareHICN/medicarePrescriptionPaymentPlans/medicarePrescriptionPaymentPlan/endDate<br>If  Endate is NULL, populate as 3000-01-01|When Transaction type is PLN, AND term reason code(Field No 122) is "MIS" or "VDE" AND start date and end date are same, those PLN transactio ns will be removed.||
|**23**|5|Subscriber Flag|DEM|1|System Logic|Y|LOV: Y = Yes, or Null|Will always be Y on DEM record and be blank on all other records.|General: Subscriber Relationship|Y|Member Details|/enrollment/member/relationshipToSubscriberDefinitionReference/reference/ID<br><br><br>If the transaction is DEM and subscriber Flag is Y, then map the above field as 'Self'<br><br>If 'Y' then <br><br>/enrollment/member/memberIsSubscriber = true<br><br>in all other cases<br><br>/enrollment/member/memberIsSubscriber = false<br>|||
|**24**|6|MBI|ALL|12|Member Details|357269487A|Medicare Beneficiary Identifier (MBI) of the<br>member in the system||Medicare: Medicare Beneficary ID|Y|Member- Medicare|/enrollment/member/medicarehicn/mbi|||
|**25**|7|Member Name|DEM|105|System Logic|John Smith|First name Last Name|Created by combining first name and last name|General: Primary Name|Y|Member - Demographic||||
|**26**|8|Member’s Last Name|DEM|50|Member Details|Smith|Last name of the member in the system|Note: if member has suffix (e.g. Jr.), it will be appended to the last name|General: Primary Name|Y|Member - Demographic|/enrollment/member/individual/primaryName/lastName<br>Member match mapping - <br><br>enrollment/member/memberMatchData/member/lastName<br>enrollment/member/memberMatchData/subscriber/lastName<br>l|||
|**27**|9|Member’s First Name|DEM|50|Member Details|John|First name of the member in the system||General: Primary Name|Y|Member - Demographic|/enrollment/member/individual/primaryName/firstName<br><br>Member match mapping - <br><br>enrollment/member/memberMatchData/member/firstName<br>enrollment/member/memberMatchData/subscriber/firstName|||
|**28**|10|Middle Initial|DEM|1|Member Details|T|Member middle initial in the system||General: Primary Name|Y|Member - Demographic|/enrollment/member/individual/primaryName/middleName|||
|**29**|11|Member’s Title|DEM|10|Member Details|Mr|Title or prefix of the member in the system. LOV: Mr, Ms, or Mrs||General: Primary Name|Y|Member - Demographic|/enrollment/member/individual/primaryName/namePrefix<br><br>|||
|**30**|12|Member Status<br>|DEM|20|Member Details|ACTIVE<br>PENDING<br>TERM SUBMITTED<br>DENIED<br><br>We will process any member status in EDIFECS<br>|Current status of the member in the Advantasure system|The current status of the member will be sent (see Member Status Values)|General: Status ?? (top most of the screen)|Y|Member - Demographic|/enrollment/member/benefitStatusCode<br><br><br>EDIFECS will map whatever it receives from the sender with no business validations.<br><br><br><br><br><br><br><br><br><br>|||
|**31**|13|Alternate Member ID<br>|DEM|11|Member Details||Alternate member ID issued by the client|ID number is separate from the family link indicator number|General: Other ID|Y|Member - ID details|Here we need to Map the input value (Member ID) to the below tag<br><br>/enrollment/member/qualifierList/qualifierValue<br><br>String "AlternateMemberID" need to be hardcoded to qualifierName in the below tag<br><br>/enrollment/member/qualifierList/qualifierName<br><br><br>|||
|**32**|14|Member Date of Birth|DEM|8|Member Details|19400528|Member’s date of birth in format YYYYMMDD||General : Birth Date|Y|Member- Demograohic|/enrollment/member/individual/birthDate<br><br>Member match mapping - <br><br>enrollment/member/memberMatchData/member/dateOfBirth<br>enrollment/member/memberMatchData/subscriber/dateOfBirth|Date format - YYYY-MM-DD||
|**33**|15|Member Date of Death|DEM|8|Member Details|20080624|Member’s date of death in format YYYYMMDD||General : Date of Death|Y|Member- Demograohic|<br>/enrollment/member/planSelection/endDate<br><br>/enrollment/member/individual/dateofDeath<br><br>Same date is applicable for the above both tags|Date format - YYYY-MM-DD||
|**34**|16|Member Gender|DEM|1|Member Details|M|LOV: M = Male; F = Female; U=Unknown||General : Gender|Y|Member- Demograohic|/enrollment/member/individual/genderCode<br><br>Member match mapping - <br><br>enrollment/member/memberMatchData/member/gender<br>enrollment/member/memberMatchData/subscriber/gender<br><br><br><br>Need to map the following;<br><br>If the input field is 'M' then hardcode the above XML as 'Male' <br>If the input field is 'F' then hardcode the above XML as 'Female'<br><br>Else, if we get any other input field then hardcode the above XML as 'Unknown'|||
|**35**|17|Member Social Security Number|DEM|9|Member Details|159357852|Member’s social security number|Will only populate if SSN is populated on Member Details field but is not collected or required for an MA application|General : SSN|Y|Member- Demograohic|/enrollment/member/individual/taxIdentificationNumber<br><br>Member match mapping - <br><br>enrollment/member/memberMatchData/member/taxId<br>enrollment/member/memberMatchData/subscriber/taxId|Format of tax identification number - 161-11-7187.<br><br>Include hyphen as per the example mentioned above||
|**36**|18|Address Type|ADR|9|PCP/Enroll History|Permanent|Type of address listed on this ADR record|Will be blank for DEM|NA|Y|NA||||
|**37**|19 _(rs=2)_|Member Permanent Address 1 _(rs=2)_|DEM,|55 _(rs=2)_|PCP/Enroll History _(rs=2)_|123 Main Street _(rs=2)_|Address line 1 of the Permanent Residence Address of the member in the system _(rs=2)_|DEM transaction: contains most recent address|Contact: Residential Address _(rs=15)_|Y _(rs=2)_|Member - Contact _(rs=43)_|/enrollment/member/physicalAddress/memberPhysicalAddress/addressTypeCode/codeSetName <br><br>Codesetname need to be hardcoded to "IndividualAddressType"<br><br>/enrollment/member/physicalAddress/memberPhysicalAddress/addressTypeCode/codeEntry = '2'<br><br>Code Entry = "2" <br><br>/enrollment/member/physicalAddress/memberPhysicalAddress/addressInfo/postalAddress/address<br>|Ignore address check for all addresses = let us set as False for now. <br><br>By default it is 'False'<br>||
|**38**|⬚|⬚||⬚|⬚|⬚|⬚||⬚|⬚|⬚||||
|**39**|20 _(rs=2)_|Member Permanent Address 2 _(rs=2)_|DEM,|55 _(rs=2)_|PCP/Enroll History _(rs=2)_|Apt 201 _(rs=2)_|Address line 2 of the Permanent Residence Address of the member in the system _(rs=2)_|DEM transaction: contains most recent address|⬚|Y _(rs=2)_|⬚|/enrollment/member/physicalAddress/memberPhysicalAddress/addressInfo/postalAddress/address2|||
|**40**|⬚|⬚||⬚|⬚|⬚|⬚||⬚|⬚|⬚||||
|**41**|21 _(rs=2)_|Member Permanent Address 3 _(rs=2)_|DEM,|55 _(rs=2)_|PCP/Enroll History _(rs=2)_|_(rs=2)_|Address line 3 of the Permanent Residence Address of the member in the system _(rs=2)_|DEM transaction: contains most recent address|⬚|Y _(rs=2)_|⬚|/enrollment/member/physicalAddress/memberPhysicalAddress/addressInfo/postalAddress/address3|||
|**42**|⬚|⬚||⬚|⬚|⬚|⬚||⬚|⬚|⬚||||
|**43**|22 _(rs=2)_|Member Permanent City _(rs=2)_|DEM,|30 _(rs=2)_|PCP/Enroll History _(rs=2)_|Cambridge _(rs=2)_|City of the Permanent Residence Address of the member in the system _(rs=2)_|DEM transaction: contains most recent address|⬚|Y _(rs=2)_|⬚|/enrollment/member/physicalAddress/memberPhysicalAddress/addressInfo/postalAddress/cityName|||
|**44**|⬚|⬚||⬚|⬚|⬚|⬚||⬚|⬚|⬚||||
|**45**|23 _(rs=2)_|Member Permanent County _(rs=2)_|DEM,|30 _(rs=2)_|PCP/Enroll History _(rs=2)_|Middlesex _(rs=2)_|County of the Permanent Residence Address of the member in the system _(rs=2)_|DEM transaction: contains most recent address|⬚|Y _(rs=2)_|⬚||||
|**46**|⬚|⬚||⬚|⬚|⬚|⬚||⬚|⬚|⬚||||
|**47**|24 _(rs=2)_|Member Permanent State _(rs=2)_|DEM,|2 _(rs=2)_|PCP/Enroll History _(rs=2)_|MA _(rs=2)_|State of the Permanent Residence Address of the member in the system _(rs=2)_|DEM transaction: contains most recent address|⬚|Y _(rs=2)_|⬚|/enrollment/member/physicalAddress/memberPhysicalAddress/addressInfo/postalAddress/stateCode|||
|**48**|⬚|⬚||⬚|⬚|⬚|⬚||⬚|⬚|⬚||||
|**49**|25 _(rs=2)_|Member Permanent SCC<br> _(rs=2)_|DEM, ADR _(rs=2)_|5 _(rs=2)_|PCP/Enroll History _(rs=2)_|25017 _(rs=2)_|Unique code used by SSA to identify each combination of State and County _(rs=2)_|DEM transaction: contains most recent address|⬚|N  _(rs=2)_|⬚||||
|**50**|⬚|⬚|⬚|⬚|⬚|⬚|⬚||⬚|⬚|⬚||||
|**51**|26 _(rs=2)_|Member Permanent Zip Code _(rs=2)_|DEM,|9 _(rs=2)_|PCP/Enroll History _(rs=2)_|02138 (5 Digit) 021389999 (9 Digit) _(rs=2)_|Zip Code of the Permanent Residence Address of the member in the system _(rs=2)_|DEM transaction: contains most recent address|⬚|Y _(rs=2)_|⬚|/enrollment/member/physicalAddress/memberPhysicalAddress/addressInfo/postalAddress/zipCode (byte 1-5)<br><br>/enrollment/member/physicalAddress/memberPhysicalAddress/addressInfo/postalAddress/zipExtensionCode (byte 6-9)|||
|**52**|⬚|⬚||⬚|⬚|⬚|⬚|||⬚|⬚||||
|**53**|27 _(rs=2)_|Member Mailing Address 1 _(rs=2)_|DEM,|55 _(rs=2)_|PCP/Enroll History _(rs=2)_|_(rs=2)_|Address line 1 of the mailing address of the member in the system _(rs=2)_|DEM transaction: contains most recent address|Contact:Correspondence Address _(rs=11)_|Y _(rs=2)_|⬚|/enrollment/member/correspondenceAddress/postalAddress/address1|•  Map the Mailing address from DEM transaction for<br>      •  New enrollment/Re-enrollment<br>      •  Mailing Address changes reported<br>      <br>•  Address Type (field 18) will be blank . Field 27-32 need to be considered for Mailing address.||
|**54**|⬚|⬚||⬚|⬚|⬚|⬚||⬚|⬚|⬚||||
|**55**|28 _(rs=2)_|Member Mailing Address 2 _(rs=2)_|DEM,|55 _(rs=2)_|PCP/Enroll History _(rs=2)_|_(rs=2)_|Address line 2 of the mailing address of the member in the system _(rs=2)_|DEM transaction: contains most recent address|⬚|Y _(rs=2)_|⬚|/enrollment/member/correspondenceAddress/postalAddress/address2|||
|**56**|⬚|⬚||⬚|⬚|⬚|⬚||⬚|⬚|⬚||||
|**57**|29 _(rs=2)_|Member Mailing Address 3 _(rs=2)_|DEM,|55 _(rs=2)_|PCP/Enroll History _(rs=2)_|_(rs=2)_|Address line 3 of the mailing address of the member in the system _(rs=2)_|DEM transaction: contains most recent address|⬚|Y _(rs=2)_|⬚|/enrollment/member/correspondenceAddress/postalAddress/address3|||
|**58**|⬚|⬚||⬚|⬚|⬚|⬚||⬚|⬚|⬚||||
|**59**|30 _(rs=2)_|Member Mailing City _(rs=2)_|DEM,|30 _(rs=2)_|PCP/Enroll History _(rs=2)_|_(rs=2)_|City of the mailing address of the member in the system _(rs=2)_|DEM transaction: contains most recent address|⬚|Y _(rs=2)_|⬚|/enrollment/member/correspondenceAddress/postalAddress/cityName|||
|**60**|⬚|⬚||⬚|⬚|⬚|⬚||⬚|⬚|⬚||||
|**61**|31 _(rs=2)_|Member Mailing State _(rs=2)_|DEM,|2 _(rs=2)_|PCP/Enroll History _(rs=2)_|_(rs=2)_|State of the mailing address of the member in the system _(rs=2)_|DEM transaction: contains most recent address|⬚|Y _(rs=2)_|⬚|/enrollment/member/correspondenceAddress/postalAddress/stateCode|||
|**62**|⬚|⬚||⬚|⬚|⬚|⬚||⬚|⬚|⬚||||
|**63**|32 _(rs=2)_|Member Mailing Zip Code _(rs=2)_|DEM,|9 _(rs=2)_|PCP/Enroll History _(rs=2)_|02138 (5 Digit) 021389999 (9 Digit) _(rs=2)_|Zip code of the mailing address of the member in the system _(rs=2)_|DEM transaction: contains most recent address|⬚|Y _(rs=2)_|⬚|Byte 1-5 <br>/enrollment/member/correspondenceAddress/postalAddress/zipCode<br>Byte 6-9<br>/enrollment/member/correspondenceAddress/postalAddress/zipExtensionCode|||
|**64**|⬚|⬚||⬚|⬚|⬚|⬚|||⬚|⬚||||
|**65**|33 _(rs=2)_|Member Billing Address 1 _(rs=2)_|DEM,|55 _(rs=2)_|PCP/Enroll History _(rs=2)_|_(rs=2)_|Address line 1 of the billing address of the member in the system _(rs=2)_|DEM transaction: contains most recent address|Contact: Billing Address _(rs=11)_|Y _(rs=2)_|⬚|/enrollment/member/physicalAddress/memberPhysicalAddress/addressInfo/postalAddress/address<br><br>/enrollment/member/physicalAddress/memberPhysicalAddress/addressTypeCode/codeSetName<br><br>Codesetname = IndividualAddressType<br><br>/enrollment/member/physicalAddress/memberPhysicalAddress/addressTypeCode/codeEntry = 10<br><br>Code Entry = 10||•  Map the Billing address from DEM transaction for  <br>      •  New enrollment/Re-enrollment<br>      •  Billing Address changes reported<br>      <br>•  Address Type (field 18) will be blank . Field 33-38 need to be considered for Billing address.<br>|
|**66**|⬚|⬚||⬚|⬚|⬚|⬚||⬚|⬚|⬚||||
|**67**|34 _(rs=2)_|Member Billing Address 2 _(rs=2)_|DEM,|55 _(rs=2)_|PCP/Enroll History _(rs=2)_|_(rs=2)_|Address line 2 of the billing address of the member in the system _(rs=2)_|DEM transaction: contains most recent address|⬚|Y _(rs=2)_|⬚|/enrollment/member/physicalAddress/memberPhysicalAddress/addressInfo<br>/postalAddress/address2|||
|**68**|⬚|⬚||⬚|⬚|⬚|⬚||⬚|⬚|⬚||||
|**69**|35 _(rs=2)_|Member Billing Address 3 _(rs=2)_|DEM,|55 _(rs=2)_|PCP/Enroll History _(rs=2)_|_(rs=2)_|Address line 3 of the billing address of the member in the system _(rs=2)_|DEM transaction: contains most recent address|⬚|Y _(rs=2)_|⬚|/enrollment/member/physicalAddress/memberPhysicalAddress/addressInfo<br>/postalAddress/address3|||
|**70**|⬚|⬚||⬚|⬚|⬚|⬚||⬚|⬚|⬚||||
|**71**|36 _(rs=2)_|Member Billing City _(rs=2)_|DEM,|30 _(rs=2)_|PCP/Enroll History _(rs=2)_|_(rs=2)_|City of the billing address of the member in the system _(rs=2)_|DEM transaction: contains most recent address|⬚|Y _(rs=2)_|⬚|/enrollment/member/physicalAddress/memberPhysicalAddress/addressInfo/postalAddress/cityName|||
|**72**|⬚|⬚||⬚|⬚|⬚|⬚||⬚|⬚|⬚||||
|**73**|37 _(rs=2)_|Member Billing State _(rs=2)_|DEM,|2 _(rs=2)_|PCP/Enroll History _(rs=2)_|_(rs=2)_|State of the billing address of the member in the system _(rs=2)_|DEM transaction: contains most recent address|⬚|Y _(rs=2)_|⬚|/enrollment/member/physicalAddress/memberPhysicalAddress/addressInfo<br>/postalAddress/stateCode|||
|**74**|⬚|⬚||⬚|⬚|⬚|⬚||⬚|⬚|⬚||||
|**75**|38 _(rs=2)_|Member Billing Zip Code _(rs=2)_|DEM,|9 _(rs=2)_|PCP/Enroll History _(rs=2)_|02138 (5 Digit) 021389999 (9 Digit) _(rs=2)_|Zip code of the billing address of the member in the system _(rs=2)_|DEM transaction: contains most recent address|⬚|Y _(rs=2)_|⬚|/enrollment/member/physicalAddress/memberPhysicalAddress/addressInfo/postalAddress/zipCode (byte 1-5)<br>/enrollment/member/physicalAddress/memberPhysicalAddress/addressInfo/postalAddress/zipExtensionCode (byte 6-9)|||
|**76**|⬚|⬚||⬚|⬚|⬚|⬚|||⬚|⬚||||
|**77**|39|Member Home Phone Number|DEM|10|Member Details|5552227654|Primary phone number for contact|No dashes or hyphens|Contact:Phone number|Y|⬚|/enrollment/member/physicalAddress/memberPhysicalAddress/addressInfo/addressPhoneList/telephoneNumber/individualPhoneTypeCode/codeSetName<br><br>Code Set Name  = IndividualPhoneType<br><br>/enrollment/member/physicalAddress/memberPhysicalAddress/addressInfo/addressPhoneList/telephoneNumber/individualPhoneTypeCode/codeEntry <br><br>Code Entry = HP<br><br>First 3 digits to<br> /enrollment/member/physicalAddress/memberPhysicalAddress/addressInfo/addressPhoneList/telephoneNumber/phoneAreaCode<br><br>The next 7 digits to<br><br>/enrollment/member/physicalAddress/memberPhysicalAddress/addressInfo/addressPhoneList/telephoneNumber/phoneNumber|||
|**78**|40|Alternate Member Phone Number|DEM|10|Member Details|5552345612|Alternate phone number can be mobile, office, or other voice line|No dashes or hyphens|Contact:Phone number|Y|⬚|/enrollment/member/physicalAddress/memberPhysicalAddress/addressInfo/addressPhoneList/telephoneNumber/individualPhoneTypeCode/codeSetName<br><br>Code Set Name = IndividualPhoneType<br><br>/enrollment/member/physicalAddress/memberPhysicalAddress/addressInfo/addressPhoneList/telephoneNumber/individualPhoneTypeCode/codeEntry <br><br>Code Entry = AP<br><br>First 3 digits to<br> /enrollment/member/physicalAddress/memberPhysicalAddress/addressInfo/addressPhoneList/telephoneNumber/phoneAreaCode<br><br>The next 7 digits to<br><br>/enrollment/member/physicalAddress/memberPhysicalAddress/addressInfo/addressPhoneList/telephoneNumber/phoneNumber|||
|**79**|41|Member Email Address|DEM|60|Member Details|jsmith@add ress.com|Email address supplied by member on the election form||Contact:Email|Y|⬚|/enrollment/member/physicalAddress/memberPhysicalAddress/emailAddress<br>/enrollment/member/correspondenceAddress/emailAddress|||
|**80**|42|Name of Emergency Contact<br>|DEM|200|Member Details|Jane Good|Name of individual to be contacted in case of emergency||Couldn’t locate in HRP UI for other responsible<br>PHI- Personal Representatives|N|NA<br>Member - PHI|/enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsiblePersonName/lastName<br><br>/enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsiblePersonName/firstName<br><br>The Full name is sent across the file. Based on spaces we need to split First name and Last name.<br><br>/enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsibilityTypeCodeCode/codeSetName <br><br>CodeSetName = responsibilityTypeCode<br><br>/enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsibilityTypeCodeCode/codeEntry<br><br>Code Entry = 4<br><br><br><br>|Emergency Contact<br><br>Emergecny  details need to group together. <br><br>'Emergecy Contact Relationship to Member' and 'Emergency Contact phone number' will be applicable if 'Name of Emergency Contact' is available. <br><br>Format - <First Name>  <Last name><br><br><br><br><br><br><br><br><br><br><br><br>Refer the crosswalk of 'Relationship to Member' code entry <br><br> _(rs=3)_||
|**81**|43|Emergency Contact Relationship to Member<br>|DEM|50|Member Details|Daughter|Emergency contacts relationship to member||Couldn’t locate in HRP UI|Y|NA|/enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/relationshipToMemberCode/codeSetName<br><br>Code Set Name = PHIRelationshipToMember<br><br> <br>/enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/relationshipToMemberCode/shortname<br><br>|⬚||
|**82**|44|Emergency Contact Phone Number<br>|DEM|10|Member Details|5551347629|Emergency contact phone number||Couldn’t locate in HRP UI|Y|NA|/enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsibleAddressInfo/addressPhoneList/telephoneNumber/individualPhoneTypeCode/codeEntry<br><br>Code Entry = TE<br><br>/enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsibleAddressInfo/addressPhoneList/telephoneNumber/individualPhoneTypeCode/codeSetName=IndividualPhoneType<br><br>code set name = IndividualPhoneType<br><br>First 3 digits to<br><br>/enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsibleAddressInfo/addressPhoneList/telephoneNumber/phoneAreaCode<br><br>The next 7 digits to<br><br>/enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsibleAddressInfo/addressPhoneList/telephoneNumber/phoneNumber<br>|⬚||
|**83**|45|ID Card Trigger flag<br>The significance of this field|DEM|1|Member Details|Y|Flag indicates if a new ID Card is requested LOV: Y = Yes; N = No|Flag will be reset to No after the file is generated|NA|Not needed|NA|NA|||
|**84**|46|Endangered Member Flag|DEM|1|Member Details|Y|Flag indicates that member is endangered/at risk; LOV: Y = Yes; N = No|If Y, member is at risk from family member or cohabiting person|PHI:Confidential communication||Member-PHI|If input value in 'Endagered Member Flag' is  'Y'<br><br>/enrollment/member/ccDirectiveList/confidentialCommunicationDirective/confidentialCommunicationTypeCode/codeSetName<br><br>Code Set Name = PHIConfidentialCommunicationType<br><br>/enrollment/member/ccDirectiveList/confidentialCommunicationDirective/confidentialCommunicationTypeCode/codeEntry=1<br><br>Code Entry = 1<br><br>/enrollment/member/ccDirectiveList/confidentialCommunicationDirective/confidentialCommunicationScope = "Endangered"<br><br>confidentialCommunicationScope need to hardcode to "Endangered"<br><br>/enrollment/member/ccDirectiveList/confidentialCommunicationDirective/effectiveStartDate<br><br>Start Date is Start date from the DEM transaction<br><br>(the communication scope and effective date is populated because during testing it was identified this is a mandatory xml tag for Enrollment Sparse to process Dual status code to HRP)|hardcode /enrollment/member/ccDirectiveList/listMode as 'REPLACE'.|/enrollment/member/ccDirectiveList/listMode can be changed based on implementaion requirements. With 'REPLACE', existing data will be replaced by the new data.|
|**85**|47|Member in OOA Process<br>|DEM|1|Member Details|Y|Flag indicating that the member is currently in the Out Of Area process; LOV: Y = Yes; N = No||||||||
|**86**|48|Source for placing in OOA process<br>|DEM|30|Member Details|Returned Mail|Provides source of information that placed member in the OOA process|Source could be a TRC received from CMS or an update by a user|Couldn’t locate in HRP UI|N|NA|NA|||
|**87**|49|Date of Move<br>|DEM|8|Member Details|20120416|Date member moved out of the service area, in the format YYYYMMDD|Date of move can be prospective or retroactive|Couldn’t locate in HRP UI|N|NA|NA|||
|**88**|50|Move Deadline<br>|DEM|8|Member Details|20121131|Date calculated by the system based on client logic after which member will be Involuntarily disenrolled|Date Involuntary Termination will be triggered based on move date|Couldn’t locate in HRP UI|N|NA|NA|||
|**89**|51|Medicaid ID|DEM|14|Member Details|612452885|Medicaid number of the member in the system||General:Other ID||Member - ID details|Here we need to Map the input value (Medicaid ID) to the below tag<br><br>/enrollment/member/qualifierList/qualifierValue<br><br>String "MedicaidID" need to be hardcoded to qualifierName in the below tag<br><br>/enrollment/member/qualifierList/qualifierName|||
|**90**|52|Medicare Part A Eff Date|DEM|8|IEQ|20000101|YYYYMMDD|Value received in response to latest IEQ|Medicare: Part A|Y|Member- Medicare|/enrollment/member/medicareHICN/partADates/partADate/effectiveDate<br><br>|Date format - YYYY-MM-DD|Map from field '3'|
|**91**|53|Medicare Part A End Date|DEM|8|IEQ||YYYYMMDD|Value received in response to latest IEQ – usually blank (open)|Medicare: Part A|Y|Member- Medicare|/enrollment/member/medicareHICN/partADates/partADate/terminationDate|Date format - YYYY-MM-DD||
|**92**|54|Medicare Part B Eff Date|DEM|8|IEQ|20020301|YYYYMMDD|Value received in response to latest IEQ|Medicare: Part B|Y|Member- Medicare|/enrollment/member/medicareHICN/partBDates/partBDate/effectiveDate|Date format - YYYY-MM-DD||
|**93**|55|Medicare Part B End Date|DEM|8|IEQ||YYYYMMDD|Value received in response to latest IEQ usually blank (open)|Medicare: Part B|Y|Member- Medicare|/enrollment/member/medicareHICN/partBDates/partBDate/terminationDate|Date format - YYYY-MM-DD||
|**94**|56|Medicare Part D Eff Date|DEM|8|IEQ|20020401|YYYYMMDD|Value received in response to latest IEQ|Medicare: Part D|Y|Member- Medicare|/enrollment/member/medicareHICN/partDDateRanges/partDDateRanges/startDate|Date format - YYYY-MM-DD||
|**95**|57|Medicare Part D End Date|DEM|8|IEQ|20120430|YYYYMMDD|Value received in response to latest IEQ – usually blank (open)|Medicare: Part D|Y|Member- Medicare|/enrollment/member/medicareHICN/partDDateRanges/partDDateRanges/endDate|Date format - YYYY-MM-DD||
|**96**|58|Language Code<br>|DEM|3|Member Details|SPA|Language code selected on Member Details screen|Refer Language Codes in the Advantasure specification document|General:Language|Y|Member-Demographic|/enrollment/member/individual/languages/language/languageDomainCode/codeEntry<br><br>enrollment/member/individual/languages/language/languageDomainCode/codesetName<br><br>Codesetname need to hardcoded to "LanguageDomain"<br><br>Refer Crosswalks tab "Language Code"<br><br>/enrollment/member/individual/languages/language/primaryLanguage = "true"<br>|||
|**97**|59|Alternative Format Large Print<br>|DEM|1|Member Details|Y|Flag indicating materials requested in large print format; LOV: Y = Yes; N = No||Couldn’t locate in HRP UI|N|NA|if Y<br>/enrollment/member/communicationPreferences/contactMethod = "Other"<br><br>/enrollment/member/communicationPreferences/documentDeliveryMethodCode/codeSetName<br>CodeSetName = "DocumentDeliveryMethod"<br><br>/enrollment/member/communicationPreferences/documentDeliveryMethodCode/codeEntry = 4|||
|**98**|60|Alternative Format Braille<br>|DEM|1|Member Details|Y|Flag indicating materials requested in Braille format; LOV: Y = Yes; N = No||Couldn’t locate in HRP UI|N|NA|if Y<br>/enrollment/member/communicationPreferences/contactMethod = "Other"<br><br>/enrollment/member/communicationPreferences/documentDeliveryMethodCode/codeSetName <br>codeSetName =  "DocumentDeliveryMethod"<br><br>/enrollment/member/communicationPreferences/documentDeliveryMethodCode/codeEntry=8<br><br>|||
|**99**|61|Alternative Format Audio Tape<br>|DEM|1|Member Details|Y|Flag indicating materials requested in audio tape format; LOV: Y = Yes; N = No||Couldn’t locate in HRP UI|N|NA|if Y<br>/enrollment/member/communicationPreferences/contactMethod = "Other"<br><br>/enrollment/member/communicationPreferences/documentDeliveryMethodCode/codeSetName codeSetName = "DocumentDeliveryMethod"<br><br>/enrollment/member/communicationPreferences/documentDeliveryMethodCode/codeEntry=6|||
|**100**|62|Fax Number|DEM|10|Member Details|8885552222|Fax number with no hyphens or special characters|Client-specific|Contact:Phone number|Y|Member-Contact|/enrollment/member/physicalAddress/memberPhysicalAddress/addressInfo/addressPhoneList/telephoneNumber/individualPhoneTypeCode/codeSetName <br><br>CodeSetName = IndividualPhoneType<br><br>/enrollment/member/physicalAddress/memberPhysicalAddress/addressInfo/addressPhoneList/telephoneNumber/individualPhoneTypeCode/codeEntry<br><br>Code Entry = FX<br><br>First 3 digits to<br> /enrollment/member/physicalAddress/memberPhysicalAddress/addressInfo/addressPhoneList/telephoneNumber/phoneAreaCode<br><br>The next 7 digits to<br><br>/enrollment/member/physicalAddress/memberPhysicalAddress/addressInfo/addressPhoneList/telephoneNumber/phoneNumber|||
|**101**|63|In LEP Process Status<br>If in LEP process, what are the processes|DEM|1|Member Details|Y|Indicates whether the member is in the LEP queue/creditable coverage determination process; LOV: Y = Yes; N = No||Couldn’t locate in HRP UI|N|NA|NA|||
|**102**|64|Authorized Rep Name <br>Available in UI,|DEM|105|Member Details|Nancy James|Name of individual listed as Authorized Representative on member record. Formerly POA Name field.||PHI:POA _(rs=10)_|Y|Member-PHI _(rs=10)_|enrollment/member/memberRepresentative/authorizedIndividual/authorizedPerson/firstName<br><br>enrollment/member/memberRepresentative/authorizedIndividual/authorizedPerson/lastName<br><br>The Full name is sent across the file. Based on spaces we need to split First name and Last name.<br><br>enrollment/member/memberRepresentative/authorizedIndividual/representativeTypeCode/codeSetName = TypeOfLegalRepresentative<br><br>enrollment/member/memberRepresentative/authorizedIndividual/representativeTypeCode/codeEntry=3<br><br>|Authorized Rep details will be applicable only if Authorized rep name is available.<br><br>Format - <First Name>  <Last name><br><br> _(rs=10)_||
|**103**|65|Authorized Rep<br>Address 1|DEM|55|Member Details|123 Main|Authorized Rep address line 1 from member<br>record. Formerly POA Address 1 field.||⬚|Y|⬚|enrollment/member/memberRepresentative/authorizedIndividual/postalAddress/ignoreAddressCheck=false<br>enrollment/member/memberRepresentative/authorizedIndividual/postalAddress/address|⬚||
|**104**|66|Authorized Rep<br>Address 2|DEM|55|Member Details|Apt 2|Authorized Rep address line 2 from member<br>record. Formerly POA Address 2 field.||⬚|Y|⬚|enrollment/member/memberRepresentative/authorizedIndividual/postalAddress/address2|⬚||
|**105**|67|Authorized Rep<br>Address 3|DEM|55|Member Details||Not applicable and not displayed on UI. Formerly POA Address 3 field.|NA|⬚|Not needed|⬚|enrollment/member/memberRepresentative/authorizedIndividual/postalAddress/address3|⬚||
|**106**|68|Authorized Rep City|DEM|30|Member Details|Las Vegas|Authorized Rep city from member record.<br>Formerly POA City field.||⬚|Y|⬚|enrollment/member/memberRepresentative/authorizedIndividual/postalAddress/cityName|⬚||
|**107**|69|Authorized Rep<br>County|DEM|30|Member Details|Henderson|Authorized Rep county from member record. Formerly POA County field.||⬚|Y|⬚||⬚||
|**108**|70|Authorized Rep State|DEM|2|Member Details|NV|Authorized Rep state from member record.<br>Formerly POA State field.||⬚|Y|⬚|enrollment/member/memberRepresentative/authorizedIndividual/postalAddress/stateCode|⬚||
|**109**|71|Authorized Rep Zip Code|DEM|9|Member Details||Authorized Rep zip code from member record. Formerly POA Zip Code field.||⬚|Y|⬚|enrollment/member/memberRepresentative/authorizedIndividual/postalAddress/zipCode (bytes 1-5)<br><br>enrollment/member/memberRepresentative/authorizedIndividual/postalAddress/zipExtensionCode (bytes 6-9)|⬚||
|**110**|72|Authorized Rep Phone<br>Number|DEM|10|Member Details|5554445678|Authorized Rep phone number from member<br>record. Formerly POA Phone Number field.||⬚|Y|⬚|First 3 digits<br><br>enrollment/member/memberRepresentative/authorizedIndividual/authorizedIndividualGroupPhoneList/telephoneNumber/phoneAreaCode<br><br>Next 7 digits<br>enrollment/member/memberRepresentative/authorizedIndividual/authorizedIndividualGroupPhoneList/telephoneNumber/phoneNumber<br><br>enrollment/member/memberRepresentative/authorizedIndividual/authorizedIndividualGroupPhoneList/telephoneNumber/individualPhoneTypeCode/codeSetName = IndividualPhoneType<br><br>enrollment/member/memberRepresentative/authorizedIndividual/authorizedIndividualGroupPhoneList/telephoneNumber/individualPhoneTypeCode/codeEntry = TE<br>|⬚||
|**111**|73|Authorized Rep<br>Relationship|DEM|30|Member Details|Son|Authorized Rep relationship from member<br>record. Formerly POA Relationship field.||⬚|Y|⬚|enrollment/member/memberRepresentative/authorizedIndividual/relationshipToMemberCode/codeSetName = PHIRelationshipToMember<br>enrollment/member/memberRepresentative/authorizedIndividual/relationshipToMemberCode/Shortname<br><br><br><br>As discussed with dev team, both code set name(TypeOfLegalRepresentative and  PHIRelationshipTomember is required, otherwise it will get error out)|⬚||
|**112**|74|Race Code|DEM|128|Member Details|999|See ‘CMS OEC Race and Ethnicity Values’ section for LOV|Multiple values can be within this one field. Values will be comma separated. IE: 999, 499|Not available|Y|Race|enrollment/member/raceOrEthnicity/raceOrEthnicityCodes/codeSetName<br><br>Code Set Name = RaceOrEthnicityCode<br><br>enrollment/member/raceOrEthnicity/raceOrEthnicityCodes/codeEntry<br><br>Please refer the cross walk table 'Race Values' for code entry mapping||Multiple values can be send across the Memout file for a member. Values will be comma seperated. Refer Tab Crosswalk for code entry details.<br>If multiple values send across , all values should be mapped to HRP.|
|**113**|75|ikaUniqueID<br>|DEM|11|System|1234|Unique sequential number assigned by internal process||NA|Not needed|NA|NA||Seena04/06: Adv team confirmed this id is used for Adv internal processing and this is not fed to upstream/downstream processing|
|**114**|76|Family Link Indicator<br>|DEM|12|Member Details|987654321|ID number used by the client to link family members together in commercial systems||Couldn’t locate in HRP UI|NA|NA|NA|||
|**115**|77|In Premium Delinquency Process<br>|DEM|1|Member Details|Y|Flag indicating if member is currently in the Premium Delinquency process||Couldn’t locate in HRP UI|N|NA|NA|||
|**116**|78|Ethnicity|DEM|128|Member Details|CUB|See ‘CMS OEC Race and Ethnicity Values’ section for LOV|Multiple values can be within this one field. Values will be comma separated. IE: CUB, OTH|General : Ethnicity|Y|Member - Demographic|enrollment/member/raceOrEthnicity/raceOrEthnicityCodes/codeSetName<br><br>Code Set Name = RaceOrEthnicityCode<br><br>enrollment/member/raceOrEthnicity/raceOrEthnicityCodes/codeEntry<br><br>Refer the cross walk table 'Ethnicity Values' for code entry mapping<br><br><br>Multiple values can be send across the Memout file for a member. Values will be comma seperated. Refer Tab Crosswalk for code entry details.<br>If multiple values send across , all values should be mapped to HRP.<br><br>Note : Both Race & Ethnicity needs to be mapped to same XML tags.||Multiple values can be send across the Memout file for a member. Values will be comma seperated. Refer Tab Crosswalk for code entry details.<br>If multiple values send across , all values should be mapped to HRP.<br><br>Note : Both Race & Ethnicity needs to be mapped to same XML tags.|
|**117**|79|Filler Field|DEM|50|||Filler Field – to be used for future enhancements||NA|Not needed|NA|NA|||
|**118**|80|Filler Field|DEM|50|||Filler Field – to be used for future enhancements||NA|Not needed|NA|NA|||
|**119**|81|Filler Field|DEM|50|||Filler Field – to be used for future enhancements||NA|Not needed|NA|NA|||
|**120**|82|od|PCP|25|PCP/Enroll History|IM29867|Provider number or PCP ID for MA and MAPD plans|Information is captured from PCP & Enrollment History|Provider|Y|Provider - Practitioner|This field can contain PCP id or Supplier ID depends on client specification. Based on the requirement from the client we can choose the provider or supplier tag. <br><br>enrollment/member/providerSelections/providerSelection/providerDateRanges/providerMatch/practitioner/hccIdentificationNumber||Field No 82 mapping needs to handled at implementation side.|
|**121**|83|PCP/Provider Address Suffix|PCP|20|PCP/Enroll History|567423|Client-specific|If applicable|Couldn’t locate in HRP UI|N|NA|xml TAG not available in Sparse|||
|**122**|84|PCP/Provider Eff Date|PCP|8|PCP/Enroll History|20120401|PCP effective date as listed in the member record|Information is captured from PCP & Enrollment History|Provider Choice|Y|Member - Provider|No need to map.<br>|||
|**123**|85|Filler Field|PCP|50|PCP/Enroll History||Filler Field – to be used for future enhancements||NA|Not needed|NA|NA|||
|**124**|86|Filler Field|PCP|50|PCP/Enroll History||Filler Field – to be used for future enhancements||NA|Not needed|NA|NA|||
|**125**|87|Broker Name|BRK|105|Application|Amy Cooper|Name of selling broker||Subscriber:Broker Selection|Y|Member- Broker|xml TAG not available in Sparse||no need to map/Current direction is not to bring Broker data to HRP,|
|**126**|88|Broker Code|BRK|10|Application|J3905|Broker code||Subscriber:Broker Selection|Y|Member- Broker|||no need to map|
|**127**|89|Broker Association/Agency|BRK|10|Application|4|Agency code||Subscriber:Broker Selection|Y|Member- Broker|||no need to map|
|**128**|90|Filler Field|BRK|50|PCP/Enroll History||Filler Field – to be used for future enhancements||NA|Not needed|NA|NA|||
|**129**|91|Filler Field|BRK|50|PCP/Enroll History||Filler Field – to be used for future enhancements||NA|Not needed|NA|NA|||
|**130**|92|Filler Field|BRK|50|PCP/Enroll History||Filler Field – to be used for future enhancements||NA|Not needed|NA|NA|||
|**131**|93|Filler Field|BRK|50|PCP/Enroll History||Filler Field – to be used for future enhancements||NA|Not needed|NA|NA|||
|**132**|94|Creditable Coverage Flag|LEP|1|System Logic|N|LOV: Y = Yes; N = No|This value is always NULL|NA|Not needed|NA|NA|||
|**133**|95|LEP Number of Uncovered Months|LEP|3|PCP/Enroll History|18|Number of months for which a member did not have creditable drug coverage||Medicare : Part D LEP|Y|Member-Medicare|enrollment/member/medicareHICN/partDDateRanges/partDDateRanges/partDLEPDateRanges/partDLEPCurrentNumberofUncoveredMonths <br>or enrollment/member/medicareHICN/partDDateRanges/partDDateRanges/partDLEPDateRanges/partDLEPTotalNumberofUncoveredMonths|||
|**134**|96|Part D LEP Amount|LEP|6|PCP/Enroll History|4.4|Member LEP amount received from CMS||Medicare : Part D LEP|Y|Member-Medicare|enrollment/member/medicareHICN/partDDateRanges/partDDateRanges/partDLEPDateRanges/partDLEPAmount<br><br>enrollment/member/medicareHICN/partDDateRanges/partDDateRanges/partDLEPDateRanges/startDate= start Date from LEP transaction<br><br>enrollment/member/medicareHICN/partDDateRanges/partDDateRanges/partDLEPDateRanges/endtDate= end Date from LEP transaction<br><br>(the  effective date is populated because during testing it was identified this is a mandatory xml tag for Enrollment Sparse to process Part D LEP Amount to HRP)<br><br>Here start and end date is based on the LEP transaction 'Start date' (field 3) and 'End date (field 4)<br><br>|||
|**135**|97|PartD LEP Waived Amount|LEP|6|PCP/Enroll History|1|Data from CMS||Medicare : Part D LEP|Y|Member-Medicare|enrollment/member/medicareHICN/partDDateRanges/partDDateRanges/partDLEPDateRanges/partDLEPWaivedAmount|||
|**136**|98|PartD LEP Subsidy Amount|LEP|6|PCP/Enroll History|1|Data from CMS||Medicare : Part D LEP|Y|Member-Medicare|enrollment/member/medicareHICN/partDDateRanges/partDDateRanges/partDLEPDateRanges/partDLEPSubsidyAmount|||
|**137**|99|LEP Source<br>|LEP|6|PCP/Enroll History|TRR|LOV: LISLEP, MPWR, TRR, Other||couldn't locate in HRP|N|NA|NA|||
|**138**|100|Filler Field|LEP|50|PCP/Enroll History||Filler Field – to be used for future enhancements||NA|Not needed|NA|NA|||
|**139**|101|Filler Field|LEP|50|PCP/Enroll History||Filler Field – to be used for future enhancements||NA|Not needed|NA|NA|||
|**140**|102|Current LIS Premium Subsidy|LIS|6|Plan set up value|34.2|Subsidy amount that CMS contributes toward Part D premium||Medicare Part D LIS|Y|Member: Medicare|enrollment/member/medicareHICN/partDDateRanges/partDDateRanges/partDCurrLISPremSubsidyDates/partDCurrentLISPremiumSubsidyAmount<br><br>If Subsidy Amount is send across<br><br>enrollment/member/medicareHICN/partDDateRanges/partDDateRanges/partDCurrLISPremSubsidyDates/startDate = Start date from LIS transaction<br><br>enrollment/member/medicareHICN/partDDateRanges/partDDateRanges/partDCurrLISPremSubsidyDates/endDate = End date from LIS transaction<br><br>Here start and end date is based on the LIS transaction 'Start date' (field 3) and 'End date (field 4)|||
|**141**|103|PartD LIS Subsidy Level|LIS|3|PCP/Enroll History|50|LOV: 000, 025, 050, 075, and 100||Medicare Part D LIS|Y|Member: Medicare|enrollment/member/medicareHICN/partDDateRanges/partDDateRanges/partDLISSubsidyLevelDates/partDLISSubsidyLevel/codeEntry<br><br>The code entry is the input value from this  field<br><br>enrollment/member/medicareHICN/partDDateRanges/partDDateRanges/partDLISSubsidyLevelDates/partDLISSubsidyLevel/codesetname<br><br>codesetname= PartDLISSubsidyLevel<br><br><br>If Subsidy Level is send across<br>enrollment/member/medicareHICN/partDDateRanges/partDDateRanges/partDLISSubsidyLevelDates/startDate = Start date from LIS transaction<br><br>enrollment/member/medicareHICN/partDDateRanges/partDDateRanges/partDLISSubsidyLevelDates/endDate = End date from LIS transaction<br><br>Here start and end date is based on the LIS transaction 'Start date' (field 3) and 'End date (field 4)|||
|**142**|104|PartD LIS Copay Category|LIS|1|PCP/Enroll History|4|LOV: 0, 1, 2, 3, 4||Medicare Part D LIS|Y|Member: Medicare|enrollment/member/medicareHICN/partDDateRanges/partDDateRanges/partDLISCopayCategoryDates/partDLISCopayCategoryCode/codeEntry<br><br>The code entry is the input value from this field<br><br>enrollment/member/medicareHICN/partDDateRanges/partDDateRanges/partDLISCopayCategoryDates/partDLISCopayCategoryCode/codesetname<br><br>codesetname=partDLISCopayCategory<br><br>If Copay Category is send across<br>enrollment/member/medicareHICN/partDDateRanges/partDDateRanges/partDLISCopayCategoryDates/startDate = Start date from LIS transaction<br><br>enrollment/member/medicareHICN/partDDateRanges/partDDateRanges/partDLISCopayCategoryDates/endDate = End date from LIS transaction<br><br>Here start and end date is based on the LIS transaction 'Start date' (field 3) and 'End date (field 4)|||
|**143**|105|LIS Source Code<br>|LIS|50|PCP/Enroll History|A|LOV: A = Applicant; D = Deemed||Couldn’t locate in HRP UI|N|NA|NA|||
|**144**|106|Filler Field|LIS|50|PCP/Enroll History||Filler Field – to be used for future enhancements||NA|Not needed|NA|NA|||
|**145**|107|Filler Field|LIS|50|PCP/Enroll History||Filler Field – to be used for future enhancements||NA|Not needed|NA|NA|||
|**146**|108|Contract Number|PLN|5|PCP/Enroll History|H1234|Contract number (K#) of the current plan||Benefit Plan Configurtaion|Y|NA||||
|**147**|109|PBP Number|PLN|3|PCP/Enroll History|67|PBP number for the plan||Benefit Plan Configurtaion|Y|NA|Here we need to concatenated Contract number +PBP number and map to<br><br>enrollment/member/planSelection/benefitPlanMatchData/parameter/value<br><br>In value we need to map the concatenated value<br><br>enrollment/member/planSelection/benefitPlanMatchData/parameter/name<br><br>In name we hardcode the name as 'BenefitPlanName'|||
|**148**|110|Segment|PLN|3|Claims Eligibility|5|Plan segment number, if applicable|Value is only for segmented plans and has a unique relationship with the county in which a member resides|Benefit plan configuration|Y|NA|NA|||
|**149**|111 _(rs=2)_|Group ID<br> _(rs=2)_|PLN / GRP _(rs=2)_|25 _(rs=2)_|Claims Eligibility _(rs=2)_|56129R _(rs=2)_|Group number associated with the member’s|_(rs=2)_|General:Account|Y|Member-Account|/enrollment/subscription/membergroup<br><br>Account:  First 6 bytes will be used <br>/enrollment/subscription/accountMatchData/accountHccIdentifier/topAccountHccIdentificationNumber<br>/enrollment/member/memberMatchData/topAccount|||
|**150**|⬚|⬚|⬚|⬚|⬚|⬚|plan|⬚||||<br>|||
|**151**|112 _(rs=2)_|Subgroup _(rs=2)_|GRP _(rs=2)_|20 _(rs=2)_|Claims Eligibility _(rs=2)_|1000 _(rs=2)_|Subgroup number associated with the|_(rs=2)_|NA|Not needed|NA|No need to map<br>|||
|**152**|⬚|⬚|⬚|⬚|⬚|⬚|member’s plan|⬚||||<br>|||
|**153**|113|Class ID|PLN|25|Claims Eligibility||Client-specific||May be Benefit plan configuration|Y|NA|NA|||
|**154**|114|Plan Code|PLN|3|Claims Eligibility||Client-specific||Benefit Plan|Y|Member - Coverage||||
|**155**|115|Disenrollment Reason code (DRC)<br>|PLN|2|Plan Span||Disenrollment Reason Code|Refer to the CMS PCUG for the latest<br>Disenrollment Reason Codes.<br>Always populated|Not Available|N|Member-Coverage|enrollment/member/planSelection/enrollmentInfo/disenrollReason<br><br>enrollment/member/planSelection/enrollmentInfo/disenrollDate = End date + 1 from PLN transaction<br><br>End date is captured from the field 4 (End date) + 1<br><br>enrollment/member/planSelection/memberTerminateReasonCode/codeSetName = MemberTerminateReason<br><br>enrollment/member/planSelection/memberTerminateReasonCode/codeEntry<br><br>refer Crosswalk 'Dis Enrollment Reason Code'<br>|||
|**156**|116|Filler Field|PLN|50|||Filler Field – to be used for future enhancements||NA|Not needed|NA|NA|||
|**157**|117|Filler Field|PLN|50|||Filler Field – to be used for future enhancements||NA|Not needed|NA|NA|||
|**158**|118|Filler Field|PLN|50|||Filler Field – to be used for future enhancements||NA|Not needed|NA|NA|||
|**159**|119|Signature Date|PLN|8|Application data|20120210|Date that the application was signed by applicant or POA in the format YYYYMMDD||Not Available|N|Member-Coverage|enrollment/member/planSelection/enrollmentInfo/applicationSignatureDate|Date format - YYYY-MM-DD||
|**160**|120|CSNP Disenrollment Eff. Date<br>|PLN|8|System Logic|20120901|Chronic Special Need Plan Disenrollment Eff date||Couldn’t locate in HRP UI|N|NA|xml TAG not available in Sparse|||
|**161**|121|Election Type<br>|PLN|300|Application data||Election type|Will contain a value only if the last transaction is enrollment or PBP change|Couldn’t locate in HRP UI|N|NA|enrollment/member/planSelection/enrollmentInfo/medicareEnrollmentPeriodCode/codeSetName=MedicareEnrollmentPeriod<br><br>enrollment/member/planSelection/enrollmentInfo/medicareEnrollmentPeriodCode/codeEntry<br><br>The value comes in the field 'Election Type' will be mapped to Code Entry<br><br>|||
|**162**|122|Term Reason Code<br>|PLN|20|PCP/Enroll History|DOD|Termination reason code listed in the Plan Override section of PCP & Enrollment History|Not always populated|Benefit Plan|Y|Member-Coverage||||
|**163**|123|Plan Rider<br>|RDR|1|Claims Eligibility||LOV: D = Dental; V = Vision; R= Rx||Benefit plan configuration|Y|NA|NA|||
|**164**|124|Rider Code<br>|RDR|50|Claims Eligibility||Code used to identify specific rider benefit||Benefit plan configuration|Y|NA|NA|||
|**165**|125|Filler Field|RDR|50|PCP/Enroll History||Filler Field – to be used for future enhancements||NA|Not needed|NA|NA|||
|**166**|126|Filler Field|RDR|50|PCP/Enroll History||Filler Field – to be used for future enhancements||NA|Not needed|NA|NA|||
|**167**|127|Payment Method Type|PWO|20|PCP/Enroll History|SSA|Member premium payment option|No Premium; Receive monthly bill; EFT/APO;CC; RRB; SSA; No data|NA|NA|NA|enrollment/member/medicareHICN/premiumWithholdDateRanges/premiumWithholdDateRange/premiumWithholdPaymentMethodType||no need to map|
|**168**|128|Premium Withhold Option|PWO|1|PCP/Enroll History|SSA|Premium Withhold Option submitted to CMS; LOV: D= Bill; S= SSA; R= RRB|||||enrollment/member/medicareHICN/premiumWithholdDateRanges/premiumWithholdDateRange/premiumWithholdOption<br><br>map START DATE from PWO Transcation type to enrollment/member/medicareHICN/premiumWithholdDateRanges/premiumWithholdDateRange/startDate<br>map END DATE from PWO Transcation type to enrollment/member/medicareHICN/premiumWithholdDateRanges/premiumWithholdDateRange/EndDate|||
|**169**|129|Name of Account Holder|PWO|105|PCP/Enroll History|John Smith|Account holder name listed on member record|No longer supported. Value is always blank|NA|Not needed|NA|NA|||
|**170**|130|Account Number|PWO|20|PCP/Enroll History History|78912378900|Account number listed on member record|NACHA/BizTalk encrypted eff spring 2023|||||||
|**171**|131|Bank Routing Number|PWO|20|PCP/Enroll History|123456789|Bank routing number listed on member record|NACHA/BizTalk encrypted eff spring 2023|||||||
|**172**|132|Bank Account Type|PWO|1|PCP/Enroll History|C|LOV: C = Checking, S = Savings|If applicable|||||||
|**173**|133|Credit Card Type|PWO|50|PCP/Enroll History||Credit card type selected in the system|No longer supported. Value is always blank|NA|Not needed|NA|NA|||
|**174**|134|Credit Card Account Holder Name|PWO|105|PCP/Enroll History||Credit card type selected in the system|No longer supported. Value is always blank|NA|Not needed|NA|NA|||
|**175**|135|Credit Card Number|PWO|16|PCP/Enroll History||Credit card number|No longer supported. Value is always blank|NA|Not needed|NA|NA|||
|**176**|136|Credit card Security Code|PWO|3|PCP/Enroll History||Credit card security code from back of card|No longer supported. Value is always blank|NA|Not needed|NA|NA|||
|**177**|137|Credit Card Expiration Date|PWO|6|PCP/Enroll History||Expiration date of the credit card in the format YYYYMM|No longer supported. Value is always blank|NA|Not needed|NA|NA|||
|**178**|138|Filler Field|PWO|50|PCP/Enroll History||Filler Field – to be used for future enhancements||NA|Not needed|NA|NA|||
|**179**|139|Filler Field|PWO|50|PCP/Enroll History||Filler Field – to be used for future enhancements||NA|Not needed|NA|NA|||
|**180**|140|Hospice Flag|FLG|1|PCP/Enroll History|Y|Member has a Hospice flag; LOV: Y = Yes; N = No U=Unknown|Source can be TRR or user update. Each status flag record in the system will send a separate record on this file|Medicare and General tab|Y|Member - Health Indicators|enrollment/member/medicareHICN/hospiceIndicator<br><br>If Hospice Indicator is Y <br>enrollment/member/medicareHICN/hospiceDateRanges/hospiceDateRange/startDate= Start Date from the FLG Transaction<br><br><br>enrollment/member/medicareHICN/hospiceDateRanges/hospiceDateRange/endDate= End Date from the FLG Transaction<br>(if end date is not provided in file use 01/01/3000 as End date)|Map only if Hospice Flag = Y. <br><br>If Hospice Flag = Y, populate /hospiceIndicator  as 'True' <br><br>||
|**181**|141|Medicaid Flag|FLG|1|PCP/Enroll History|Y|Member has a Medicaid flag; LOV: Y = Yes; N = No|Source can be TRR or user update. Each status flag record in the system will send a separate record on this file|Couldn’t locate in HRP UI|N|NA|<br>enrollment/member/medicareHICN/medicaidDateRanges/medicaidDateRange/startDate = Start Date from the FLG Transction<br><br>enrollment/member/medicareHICN/medicaidDateRanges/medicaidDateRange/endDate = End Date from the FLG Transction|Map only if Medicaid Flag = Y.||
|**182**|142|MSP/Working Aged Flag|FLG|1|PCP/Enroll History|Y|Member has a Medicare Secondary Payer flag; LOV: Y = Yes; N = No|Source can be TRR or user update. Each status flag record in the system will send a separate record on this file|Couldn’t locate in HRP UI|N|NA|xml TAG not available in Sparse|||
|**183**|143|Institutional Flag|FLG|1|PCP/Enroll History|Y|Member is a resident of an institution; LOV: Y = Yes; N = No, U=Unknown|Source can be TRR or user update. Each status flag record in the system will send a separate record on this file|Medicare|Y|Member - Health Indicators|enrollment/member/medicareHICN/institutionalIndicator<br><br><br>If Institutional Flag  is Y <br><br>enrollment/member/medicareHICN/institutionalDateRanges/institutionalDateRange/startDate= Start date from the FLG transactions<br><br>enrollment/member/medicareHICN/institutionalDateRanges/institutionalDateRange/endDate= End date from the FLG transactions<br>(if end date is not provided in file use 01/01/3000 as End date)<br><br>|Map only if Institutional Flag = Y. <br><br>If Institutional Flag = Y, populate /institutionalIndicator  as 'True'||
|**184**|144|ESRD Flag|FLG|1|PCP/Enroll History|Y|Member has ESRD; LOV: Y = Yes; N = No|Source can be TRR or user update. Each status flag record in the system will send a separate record on this file|Medicare|Y|Member - Health Indicators|enrollment/member/medicareHICN/esrdIndicator<br><br><br>If ESRD flag is Y or N<br><br>enrollment/member/medicareHICN/esrdDateRanges/esrdDateRange/startDate = Start date from the FLG transaction<br><br>enrollment/member/medicareHICN/esrdDateRanges/esrdDateRange/endDate = End date from the FLG transaction<br>(if end date is not provided in file use 1/1/300 as End date)|Map only if ESRD Flag = Y. <br><br>If ESRD Flag = Y, populate /esrdIndicator  as 'True'||
|**185**|145|Transplant Flag|FLG|1|PCP/Enroll History|Y|Member received a transplant; LOV: Y = Yes; N = No|Source can be TRR or user update. Each status flag record in the system will send a separate record on this file|couldn't locate in HRP|N|NA|<br>enrollment/member/medicareHICN/transplantDateRanges/transplantDateRange/startDate = Start date from the FLG transaction<br><br>enrollment/member/medicareHICN/transplantDateRanges/transplantDateRange/endDate = End date from the FLG transaction<br>(if end date is not provided in file use 1/1/300 as End date)|Map only if Transplant Flag = Y||
|**186**|146|Dialysis Flag|FLG|1|PCP/Enroll History|Y|Member is on Dialysis; LOV: Y = Yes; N = No|Source can be TRR or user update. Each status flag record in the system will send a separate record on this file|couldn't locate in HRP|N|NA|<br><br>enrollment/member/medicareHICN/dialysisDateRanges/dialysisDateRange/startDate = Start date from the FLG transaction<br><br>enrollment/member/medicareHICN/dialysisDateRanges/dialysisDateRange/endDate = End date from the FLG transaction<br>(if end date is not provided in file use 1/1/300 as End date)|Map only if Dialysis Flag is Y||
|**187**|147|Disabled Flag|FLG|1|PCP/Enroll History|Y|Member disabled; LOV: Y = Yes; N = No|Source can be TRR or user update. Each status flag record in the system will send a separate record on this file|General:Handicapped|Y|Member-Demographic|<br>enrolment/member/isHandicapped|If Disabled Flag = Y, map /isHandicapped as True<br>If Disabled Flag = N, map /isHandicapped as False||
|**188**|148|Plan Override Indicator|FLG|1|PCP/Enroll History|Y|Plan override indicator: Y = Yes; N = No|Source can be TRR or user update. Each status flag record in the system will send a separate record on this file|couldn't locate in HRP|N|NA||||
|**189**|149 _(rs=3)_|Dual Status Code _(rs=3)_|MCD _(rs=3)_|2 _(rs=3)_|PCP/Enroll History _(rs=3)_|_(rs=3)_|Member has Medicaid Dual Status in Medicaid Eligibility History.<br>LOV: 01, 02, 03, 04, 05, 06, 08, 09, 99 _(rs=3)_|Values will be captured from MCMD processing or user updates _(rs=3)_|Medicare  _(rs=3)_|Y _(rs=3)_|Member - Medicare _(rs=3)_|enrollment/member/medicareHICN/medicaidDualStatusRanges/medicaidDualStatus/medicaidDualStatusCode/codeEntry<br><br>The value comes in the field 'Dual Staus Code' will be mapped to Code Entry<br><br>enrollment/member/medicareHICN/medicaidDualStatusRanges/medicaidDualStatus/medicaidDualStatusCode/codesetname<br><br>codesetname= "MedicaidDualStatuscode"|If the transaction is MCD and value coming in Dual status code field.  _(rs=3)_||
|**190**|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|enrollment/member/medicareHICN/medicaidDualStatusRanges/medicaidDualStatus/medicaidDual as True|⬚||
|**191**|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|enrollment/member/medicareHICN/medicaidDualStatusRanges/medicaidDualStatus/effectiveDate  = this needs to be populated from Start Date under MCD transaction <br><br>(the effective is populated because during testing it was identified this is a mandatory xml tag for Enrollment Sparse to process Dual status code to HRP)<br><br>enrollment/member/medicareHICN/medicaidDualStatusRanges/medicaidDualStatus/terminationDate  = this needs to be populated from End Date under MCD transaction|⬚||
|**192**|150|Medicaid Record Type|MCD|1|PCP/Enroll History||Dual Status record type; LOV: A = Audited, V = Valid|Values will be captured from MCMD processing or user updates|Couldn’t locate in HRP UI|N|NA|xml TAG not available in Sparse|||
|**193**|151|COB Update Date|COB|8|CMS Files||YYYYMMDD|Client-specific|Date?|Y|Member-COB|COB transactiosn fields are client specific. SO this can be mapped based on customer specifications.|||
|**194**|152|Name of Other Coverage|COB|50|CMS Files||Other insurance name|Client-specific|COB|Y|Member - COB|COB transactiosn fields are client specific. SO this can be mapped based on customer specifications.|||
|**195**|153|Subscriber ID of Other Coverage|COB|20|CMS Files||Other insurance ID number|Client-specific|COB|Y|Member - COB|COB transactiosn fields are client specific. SO this can be mapped based on customer specifications.|||
|**196**|154|Group ID of other Coverage|COB|20|CMS Files||Other insurance group number|Client-specific|COB|Y|Member - COB|COB transactiosn fields are client specific. SO this can be mapped based on customer specifications.|||
|**197**|155|Kind of Other Insurance|COB|3|CMS Files||Type of other insurance|Client-specific|COB|Y|Member - COB|COB transactiosn fields are client specific. SO this can be mapped based on customer specifications.|||
|**198**|156|Name of Other Insurance Company|COB|200|CMS Files||Name of other insurance company|Client-specific|COB|Y|Member - COB|COB transactiosn fields are client specific. SO this can be mapped based on customer specifications.|||
|**199**|157|Filler Field||50|||Filler Field – to be used for future enhancements|Client-specific|NA|Not needed|NA|NA|||
|**200**|158|Filler Field||50|||Filler Field – to be used for future enhancements|Client-specific|NA|Not needed|NA|NA|||
|**201**|159|Filler Field||50|||Filler Field – to be used for future enhancements|Client-specific|NA|Not needed|NA|NA|||
|**202**|160|M3P Term Reason|M3P|50|PCP/Enroll History||LOV: V = Voluntary, I = Involuntary If a member’s M3P span has an end date, there must be a termination reason populated|M3P Term Reason|NA|Not needed|NA|/enrollment/member/medicareHICN/medicarePrescriptionPaymentPlans/medicarePrescriptionPaymentPlan/medicarePrescriptionPaymentPlanStatusIndicator/codesetname  as  MedicarePrescriptionPaymentPlanStatusIndicator<br><br>/enrollment/member/medicareHICN/medicarePrescriptionPaymentPlans/medicarePrescriptionPaymentPlan/medicarePrescriptionPaymentPlanStatusIndicator/codeEntry  from Field no 160|||
|**203**|161|Filler Field||50|||Filler Field – to be used for future enhancements||NA|Not needed|NA|NA|||
|**204**|162|Gender Identity|DEM|50|Member Details||This element will populate with the code that is stored on the member details table. If a gender code also has an associated free text element, both will display within this field delimited by a comma.||NA|Not needed|NA|/enrollment/member/genderIdentityCode/codesetname  = GenderIdentity<br>/enrollment/member/genderIdentityCode/codeEntry|Refer Cross Walk tab for conversion copy<br>(Take only the code, code can be accompanied by a text separated by comma)||
|**205**|163|Sexual Orientation|DEM|50|Member Details||This element will populate with the code that is stored on the member details table. If a gender code also has an associated free text element, both will display within this field delimited by a comma.||NA|Not needed|NA|/enrollment/member/sexualOrientationCode/codesetname  = sexualOrientation<br>/enrollment/member/sexualOrientationCode/codeEntry|Refer Cross Walk tab for conversion copy<br>(Take only the code, code can be accompanied by a text separated by comma)||
|**206**|164|Alternative Format Data CD|DEM|1|Member Details||Flag indicating materials requested in Data CD format; LOV: Y = Yes; N = No|Alternate Format: Data CD|NA|Not needed|NA|if Y<br>/enrollment/member/communicationPreferences/contactMethod = "Other"<br><br>/enrollment/member/communicationPreferences/documentDeliveryMethodCode/codeSetName <br>codeSetName =  "DocumentDeliveryMethod"<br><br>/enrollment/member/communicationPreferences/documentDeliveryMethodCode/codeEntry=1<br><br>|Data CD is not available in HRP codeentries. So for now it is mapped to 'Online' . Implementaion teams needs to review this and make changes if needed.||
|**207**|165|Filler Field||50|||Filler Field – to be used for future enhancements|Client-specific|NA|Not needed|NA|NA|||
|**208**|166|Filler Field||50|||Filler Field – to be used for future enhancements|Client-specific|NA|Not needed|NA|NA|||
---
<a id="sheet-sheet1"></a>
## Sheet: Sheet1
|#|A|B|C|
|---|---|---|---|
|**1**|Disenrollment Reason codes _(cs=3)_|⬚|⬚|
|**2**||||
|**3**|Advantasure  _(cs=2)_|⬚|HRP /Enrollment sparse value|
|**4**|Value in Memout file|Description|Code entry for code set name=MemberTerminateReason<br><br>disenrollReason<br>|
|**5**|03|Date of Death|59|
|**6**|02 _(rs=2)_|RELOCATION OUT OF PLAN SERVICE AREA (NO SPECIAL PROVISIONS) _(rs=2)_|02CMS `=CONCAT(A6,"CMS")`|
|**7**|⬚|⬚|CMS `=CONCAT(A7,"CMS")`|
|**8**|03|FAILURE TO CONVERT TO RISK PROVISIONS|03CMS `=CONCAT(A8,"CMS")`|
|**9**|04|FRAUD|04CMS `=CONCAT(A9,"CMS")`|
|**10**|05|LOSS OF PART B ENTITLEMENT|05CMS `=CONCAT(A10,"CMS")`|
|**11**|06|LOSS OF PART A ENTITLEMENT (PLAN-SPECIFIC)|06CMS `=CONCAT(A11,"CMS")`|
|**12**|07|FOR CAUSE|07CMS `=CONCAT(A12,"CMS")`|
|**13**|08|REPORT OF DEATH|3|
|**14**|09|TERMINATION OF CONTRACT (CMS-INITIATED)|09CMS `=CONCAT(A14,"CMS")`|
|**15**|10 _(rs=2)_|TERMINATION OF CONTRACT/Plan|10CMS `=CONCAT(A15,"CMS")`|
|**16**|⬚|Benefit Package (PBP)/SEGMENT (PLAN WITHDRAWAL)|CMS `=CONCAT(A16,"CMS")`|
|**17**|11|VOLUNTARY DISENROLLMENT THROUGH PLAN|11CMS `=CONCAT(A17,"CMS")`|
|**18**|12|VOLUNTARY DISENROLLMENT THROUGH DISTRICT OFFICE|12CMS `=CONCAT(A18,"CMS")`|
|**19**|13|DISENROLLMENT BECAUSE OF ENROLLMENT IN ANOTHER PLAN|13CMS `=CONCAT(A19,"CMS")`|
|**20**|14|RETROACTIVE|14CMS `=CONCAT(A20,"CMS")`|
|**21**|15|TERMINATED IN ERROR BY CMS SYSTEM|15CMS `=CONCAT(A21,"CMS")`|
|**22**|16 _(rs=2)_|END OF State and County Code (SCC) CONDITIONAL ENROLLMENT PERIOD _(rs=2)_|16CMS `=CONCAT(A22,"CMS")`|
|**23**|⬚|⬚|CMS `=CONCAT(A23,"CMS")`|
|**24**|17|BENE DOES NOT MEET AGE CRITERION (PLAN-SPECIFIC)|17CMS `=CONCAT(A24,"CMS")`|
|**25**|18|ROLLOVER|18CMS `=CONCAT(A25,"CMS")`|
|**26**|19 _(rs=2)_|TERMINATED BY Social Security Administration (SSA) DISTRICT OFFICE _(rs=2)_|19CMS `=CONCAT(A26,"CMS")`|
|**27**|⬚|⬚|CMS `=CONCAT(A27,"CMS")`|
|**28**|20 _(rs=2)_|INVALID ENROLLMENT WITH End|20CMS `=CONCAT(A28,"CMS")`|
|**29**|⬚|Stage Renal Disease (ESRD)|CMS `=CONCAT(A29,"CMS")`|
|**30**|21 _(rs=2)_|CANNOT TRAVEL/POOR<br>HEALTH/TO Health Maintenance Organization (HMO)/PLAN DOCTORS _(rs=2)_|21CMS `=CONCAT(A30,"CMS")`|
|**31**|⬚|⬚|CMS `=CONCAT(A31,"CMS")`|
|**32**|22|SPOUSE IS NO LONGER MEMBER OF HMO/PLAN|22CMS `=CONCAT(A32,"CMS")`|
|**33**|23|COULDN’T USE MEDICARE CARD TO SEE OTHER PLAN|23CMS `=CONCAT(A33,"CMS")`|
|**34**|24|DID NOT KNOW I JOINED THIS HMO|24CMS `=CONCAT(A34,"CMS")`|
|**35**|25 _(rs=2)_|DIFFICULTY REACHING HMO/PLAN DOCTOR BY PHONE PROBLEM _(rs=2)_|25CMS `=CONCAT(A35,"CMS")`|
|**36**|⬚|⬚|CMS `=CONCAT(A36,"CMS")`|
|**37**|26|CALLED HMO/PLAN COULD NOT GET HELP WITH PROBLEM|26CMS `=CONCAT(A37,"CMS")`|
|**38**|27|DISSATISFIED WITH MEDICAL CARE/DOCS OR HOSPITAL|27CMS `=CONCAT(A38,"CMS")`|
|**39**|28|TOLD BY PLAN DOCTORS OR STAFF I SHOULD DISENROLL|28CMS `=CONCAT(A39,"CMS")`|
|**40**|29|PREFER TRADITIONAL MEDICARE|29CMS `=CONCAT(A40,"CMS")`|
|**41**|30 _(rs=2)_|HAVE OTHER HEALTH INSURANCE BENEFITS AVAILABLE _(rs=2)_|30CMS `=CONCAT(A41,"CMS")`|
|**42**|⬚|⬚|CMS `=CONCAT(A42,"CMS")`|
|**43**|31|FOUND HMO/PLAN TO BE TOO CONFUSING|31CMS `=CONCAT(A43,"CMS")`|
|**44**|32|MY CLAIMS/BILLS WERE NOT PAID|32CMS `=CONCAT(A44,"CMS")`|
|**45**|33|HAD LITTLE OR NO CHOICE OF SPECIALIST|33CMS `=CONCAT(A45,"CMS")`|
|**46**|34|TREATED DISCOURTEOUSLY BY DOCTOR/NURSE/STAFF|34CMS `=CONCAT(A46,"CMS")`|
|**47**|35|DOCTOR COULDN’T IMPROVE MY CONDITION|35CMS `=CONCAT(A47,"CMS")`|
|**48**|36|HMO/PLAN MEDICAL GROUP WAS LOCATED TOO FAR AWAY|36CMS `=CONCAT(A48,"CMS")`|
|**49**|37|HAD LIMITED OR NO CHOICE OF MY PRIMARY DOCTOR|37CMS `=CONCAT(A49,"CMS")`|
|**50**|41 _(rs=2)_|YOU MOVED PERMANENTLY OUT OF AREA WHERE PLAN PROVIDES SERVIC _(rs=2)_|41CMS `=CONCAT(A50,"CMS")`|
|**51**|⬚|⬚|CMS `=CONCAT(A51,"CMS")`|
|**52**|42|YOUR DOCTOR OR THE PLAN TOLD YOU TO DISENROLL|42CMS `=CONCAT(A52,"CMS")`|
|**53**|43|YOUR DOCTOR DIDN’T GIVE YOU GOOD QUALITY CARE|43CMS `=CONCAT(A53,"CMS")`|
|**54**|44|YOU USED UP THE PRESCRIPTION ALLOWANCE|44CMS `=CONCAT(A54,"CMS")`|
|**55**|45|THE PLAN COST YOU TOO MUCH|45CMS `=CONCAT(A55,"CMS")`|
|**56**|46|YOU COULDN’T GET CARE WHEN YOU NEEDED IT|46CMS `=CONCAT(A56,"CMS")`|
|**57**|47|YOUR DOCTOR ISN’T IN THE PLAN|47CMS `=CONCAT(A57,"CMS")`|
|**58**|48|YOU DIDN’T KNOW YOU SIGNED UP FOR THIS PLAN|48CMS `=CONCAT(A58,"CMS")`|
|**59**|49|YOU DIDN’T LIKE HOW THE PLAN WORKED|49CMS `=CONCAT(A59,"CMS")`|
|**60**|50 _(rs=2)_|ROLLED OVER ENROLLMENT REMOVED/AUDITED _(rs=2)_|50CMS `=CONCAT(A60,"CMS")`|
|**61**|⬚|⬚|CMS `=CONCAT(A61,"CMS")`|
|**62**|54|PART A OR B START DATE CHANGE|54CMS `=CONCAT(A62,"CMS")`|
|**63**|56|BENEFICIARY MEDICAID PERIOD RECEIVED|56CMS `=CONCAT(A63,"CMS")`|
|**64**|57|BENEFICIARY HOSPICE PERIOD RECEIVED|57CMS `=CONCAT(A64,"CMS")`|
|**65**|59|INVALID ENROLLMENT WITH HOSPICE|59CMS `=CONCAT(A65,"CMS")`|
|**66**|60|BENEFICIARY LIVES IN USA LESS THAN 183 DAYS A YEAR|60CMS `=CONCAT(A66,"CMS")`|
|**67**|61|LOSS OF PART D ELIGIBILITY|61CMS `=CONCAT(A67,"CMS")`|
|**68**|62|PART D DISENROLLMENT DUE TO FAILURE TO PAY IRMAA|62CMS `=CONCAT(A68,"CMS")`|
|**69**|63|MMP (Medicare and Medicaid Plan) OPT-OUT AFTER ENROLLED|63CMS `=CONCAT(A69,"CMS")`|
|**70**|64|LOSS OF DEMONSTRATION ELIGIBILITY|64CMS `=CONCAT(A70,"CMS")`|
|**71**|65|LOSS OF EMPLOYER GROUP PLAN ELIGIBILITY|65CMS `=CONCAT(A71,"CMS")`|
|**72**|70|CONFIRMED INCARCERATION|70CMS `=CONCAT(A72,"CMS")`|
|**73**|71|NOT LAWFULLY PRESENT|71CMS `=CONCAT(A73,"CMS")`|
|**74**|72|DISENROLLMENT DUE TO PLAN- SUBMITTED ROLLOVER|72CMS `=CONCAT(A74,"CMS")`|
|**75**|88|CONVERSION|88CMS `=CONCAT(A75,"CMS")`|
|**76**|90|ENROLLMENT CANCELLED DUE TO BENEFICIARY MERGE|90CMS `=CONCAT(A76,"CMS")`|
|**77**|91|FAILURE TO PAY PREMIUMS|91CMS `=CONCAT(A77,"CMS")`|
|**78**|92|RELOCATION OUT OF PLAN SERVICE AREA|92CMS `=CONCAT(A78,"CMS")`|
|**79**|93|LOST SPECIFIC PLAN ELIGIBILITY (Special Needs Plan (SNP) ONLY)|93CMS `=CONCAT(A79,"CMS")`|
|**80**|99|OTHER (NOT SUPPLIED BY BENE)|99CMS `=CONCAT(A80,"CMS")`|
|**81**|Y8|REPORT OF DEATH DATE CHANGE|Y8CMS `=CONCAT(A81,"CMS")`|
<details>
<summary><strong>Formula Index</strong> — 75 formulas</summary>
|Cell|Cached Value|Formula|
|------|-------------|---------|
|`C6`|02CMS|`=CONCAT(A6,"CMS")`|
|`C7`|CMS|`=CONCAT(A7,"CMS")`|
|`C8`|03CMS|`=CONCAT(A8,"CMS")`|
|`C9`|04CMS|`=CONCAT(A9,"CMS")`|
|`C10`|05CMS|`=CONCAT(A10,"CMS")`|
|`C11`|06CMS|`=CONCAT(A11,"CMS")`|
|`C12`|07CMS|`=CONCAT(A12,"CMS")`|
|`C14`|09CMS|`=CONCAT(A14,"CMS")`|
|`C15`|10CMS|`=CONCAT(A15,"CMS")`|
|`C16`|CMS|`=CONCAT(A16,"CMS")`|
|`C17`|11CMS|`=CONCAT(A17,"CMS")`|
|`C18`|12CMS|`=CONCAT(A18,"CMS")`|
|`C19`|13CMS|`=CONCAT(A19,"CMS")`|
|`C20`|14CMS|`=CONCAT(A20,"CMS")`|
|`C21`|15CMS|`=CONCAT(A21,"CMS")`|
|`C22`|16CMS|`=CONCAT(A22,"CMS")`|
|`C23`|CMS|`=CONCAT(A23,"CMS")`|
|`C24`|17CMS|`=CONCAT(A24,"CMS")`|
|`C25`|18CMS|`=CONCAT(A25,"CMS")`|
|`C26`|19CMS|`=CONCAT(A26,"CMS")`|
|`C27`|CMS|`=CONCAT(A27,"CMS")`|
|`C28`|20CMS|`=CONCAT(A28,"CMS")`|
|`C29`|CMS|`=CONCAT(A29,"CMS")`|
|`C30`|21CMS|`=CONCAT(A30,"CMS")`|
|`C31`|CMS|`=CONCAT(A31,"CMS")`|
|`C32`|22CMS|`=CONCAT(A32,"CMS")`|
|`C33`|23CMS|`=CONCAT(A33,"CMS")`|
|`C34`|24CMS|`=CONCAT(A34,"CMS")`|
|`C35`|25CMS|`=CONCAT(A35,"CMS")`|
|`C36`|CMS|`=CONCAT(A36,"CMS")`|
|`C37`|26CMS|`=CONCAT(A37,"CMS")`|
|`C38`|27CMS|`=CONCAT(A38,"CMS")`|
|`C39`|28CMS|`=CONCAT(A39,"CMS")`|
|`C40`|29CMS|`=CONCAT(A40,"CMS")`|
|`C41`|30CMS|`=CONCAT(A41,"CMS")`|
|`C42`|CMS|`=CONCAT(A42,"CMS")`|
|`C43`|31CMS|`=CONCAT(A43,"CMS")`|
|`C44`|32CMS|`=CONCAT(A44,"CMS")`|
|`C45`|33CMS|`=CONCAT(A45,"CMS")`|
|`C46`|34CMS|`=CONCAT(A46,"CMS")`|
|`C47`|35CMS|`=CONCAT(A47,"CMS")`|
|`C48`|36CMS|`=CONCAT(A48,"CMS")`|
|`C49`|37CMS|`=CONCAT(A49,"CMS")`|
|`C50`|41CMS|`=CONCAT(A50,"CMS")`|
|`C51`|CMS|`=CONCAT(A51,"CMS")`|
|`C52`|42CMS|`=CONCAT(A52,"CMS")`|
|`C53`|43CMS|`=CONCAT(A53,"CMS")`|
|`C54`|44CMS|`=CONCAT(A54,"CMS")`|
|`C55`|45CMS|`=CONCAT(A55,"CMS")`|
|`C56`|46CMS|`=CONCAT(A56,"CMS")`|
|`C57`|47CMS|`=CONCAT(A57,"CMS")`|
|`C58`|48CMS|`=CONCAT(A58,"CMS")`|
|`C59`|49CMS|`=CONCAT(A59,"CMS")`|
|`C60`|50CMS|`=CONCAT(A60,"CMS")`|
|`C61`|CMS|`=CONCAT(A61,"CMS")`|
|`C62`|54CMS|`=CONCAT(A62,"CMS")`|
|`C63`|56CMS|`=CONCAT(A63,"CMS")`|
|`C64`|57CMS|`=CONCAT(A64,"CMS")`|
|`C65`|59CMS|`=CONCAT(A65,"CMS")`|
|`C66`|60CMS|`=CONCAT(A66,"CMS")`|
|`C67`|61CMS|`=CONCAT(A67,"CMS")`|
|`C68`|62CMS|`=CONCAT(A68,"CMS")`|
|`C69`|63CMS|`=CONCAT(A69,"CMS")`|
|`C70`|64CMS|`=CONCAT(A70,"CMS")`|
|`C71`|65CMS|`=CONCAT(A71,"CMS")`|
|`C72`|70CMS|`=CONCAT(A72,"CMS")`|
|`C73`|71CMS|`=CONCAT(A73,"CMS")`|
|`C74`|72CMS|`=CONCAT(A74,"CMS")`|
|`C75`|88CMS|`=CONCAT(A75,"CMS")`|
|`C76`|90CMS|`=CONCAT(A76,"CMS")`|
|`C77`|91CMS|`=CONCAT(A77,"CMS")`|
|`C78`|92CMS|`=CONCAT(A78,"CMS")`|
|`C79`|93CMS|`=CONCAT(A79,"CMS")`|
|`C80`|99CMS|`=CONCAT(A80,"CMS")`|
|`C81`|Y8CMS|`=CONCAT(A81,"CMS")`|
</details>
---
<a id="sheet-header-logic"></a>
## Sheet: Header Logic
|#|A|B|
|---|---|---|
|**2**|XML Fileds|Description|
|**3**|<Count> Target/Schema/enrollmentSparseIBRequestRoot/enrollmentSparseIBRequest/enrollmentSparseSubmitRequestRecordList/recordCount|Shows the total number of <enrollmentSparseSubmitRequestRecord> in a single xml file|
|**4**|<ediMemberRecordSequence><br>Target/Schema/enrollmentSparseIBRequestRoot/enrollmentSparseIBRequest/enrollmentSparseSubmitRequestRecordList/enrollmentSparseSubmitRequestRecord/ediMemberRecordSequence|Shows the member record sequence|
|**5**|<br>Target/Schema/enrollmentSparseIBRequestRoot/enrollmentSparseIBRequest/enrollmentSparseSubmitRequestRecordList/enrollmentSparseSubmitRequestRecord/ediArchiveFileName|Input Archive file name|
|**6**|<br>Target/Schema/enrollmentSparseIBRequestRoot/enrollmentSparseIBRequest/enrollmentSparseSubmitRequestRecordList/enrollmentSparseSubmitRequestRecord/recordId|Shows the unique ID for each record inside, GUID|
|**7**|<br>Target/Schema/enrollmentSparseIBRequestRoot/enrollmentSparseIBRequest/enrollmentSparseSubmitRequestRecordList/enrollmentSparseSubmitRequestRecord/recordIdFromSource<br>|Shows the unique ID for each record inside, GUID|
|**8**|<memberIdentifier><br>Target/Schema/enrollmentSparseIBRequestRoot/enrollmentSparseIBRequest/enrollmentSparseSubmitRequestRecordList/enrollmentSparseSubmitRequestRecord/memberIdentifier<br>|Map from Claims SubscriberID Number(Field No 2)|
|**9**|<sourceTypeIdentifier><br>Target/Schema/enrollmentSparseIBRequestRoot/enrollmentSparseIBRequest/enrollmentSparseSubmitRequestRecordList/enrollmentSparseSubmitRequestRecord/sourceTypeIdentifier<br>|Hardcode as 'EDIFECS_ADV_DFF'|
|**10**|<rayId>|This will be GUID for each record inside <enrollmentSparseSubmitRequestRecord> tag. It should be different from recordid|
|**11**|<tenantId>|Hardcode as 'Product'|
|**12**|<referenceIdentifier>|Leave it blank from Products|
|**13**|<retriedReferenceIdentifier>|Leave it blank from Products|
|**14**|header/ediFileType|Populate as 'Daily  OR Weekly' <br><br>File Naming Convention:<br><ClientCode><FileType><CreatedDate><CreatedTime><Environment>.txt<br><FileType> will be MBROUT for Daily file<br><FileType> will be FULLMBROUT for Weekly file<br><br>Sample<br>Incremental File - BHPMBROUT202303151930P.txt <br>Full File - BHPFULLMBROUT202303151930P.txt|
---
<a id="sheet-cross-walk"></a>
## Sheet: Cross Walk
|#|A|B|C|D|E|F|G|H|I|J|K|L|
|---|---|---|---|---|---|---|---|---|---|---|---|---|
|**1**|Race Values _(cs=4)_|⬚|⬚|⬚||Disenrollment Reason codes _(cs=3)_|⬚|⬚||PHIRelationshipToMember _(cs=3)_|⬚|⬚|
|**2**|||||||||||||
|**3**|Advantasure  _(cs=2)_|⬚|HRP /Enrollment sparse value|Shortname in HRP||Advantasure  _(cs=2)_|⬚|HRP /Enrollment sparse value||CODEENTRY|SHORTNAME|DESCRIPTION|
|**4**|Value in Memout file|Description|Code entry for code set name=RaceOrEthnicityCode|||Value in Memout file|ShortName|ShortDescription||10|Emancipated Minor|Emancipated Minor|
|**5**|300|American Indian or Alaska Native|I|American Indian or Alaska Native||3|Date of Death Auto-Termination Policy|Date of Death Auto-Termination Policy||11|Employee|Employee|
|**6**|401|Asian Indian|5|Asian Indian||2 _(rs=2)_|Member No longer Eligible  _(rs=2)_|Member No longer Eligible  _(rs=2)_||12|Ex-spouse|Ex-spouse|
|**7**|201|Black or African American|ROEC2|Black or African American||⬚|⬚|⬚||13|Father|Father|
|**8**|411|Chinese|14|Chinese||10|Overdue payment|Overdue payment||14|Father or Mother|Father or Mother|
|**9**|421|Filipino|21|Filipino||1|Qualif  Event-Member Term|Qualif  Event-Member Term||15|Foster Child|Foster Child|
|**10**|521|Guamanian or Chamorro|ROEC4|Guamanian or Chamorro||||||16|Grandmother or Grandfather|Grandmother or Grandfather|
|**11**|431|Japanese|35|Japanese||GenderIdentity Codes (Field 162) _(cs=3)_|⬚|⬚||17|Grandson or Granddaughter|Grandson or Granddaughter|
|**12**|441|Korean|37|Korean||Advantasure  _(cs=2)_|⬚|HRP /Enrollment sparse value||18|Guardian|Guardian|
|**13**|501|Native Hawaiian|J|Native Hawaiian||Value in Memout file|Description|Codeentry for codesetname = GenderIdentity||19|Handicapped Dependent|Handicapped Dependent|
|**14**|499|Other Asian|4|Asian||1|Woman|2||1|Adopted Child|Adopted Child|
|**15**|599|Other Pacific Islander|ROEC3|Other Pacific Islander||2|Man|1||20|Injured Plaintiff|Injured Plaintiff|
|**16**|511|Samoan|52|Samoan||3|Non-binary|5||21|Life Partner|Life Partner|
|**17**|451|Vietnamese|58|Vietnamese||4|I use a different term|7||22|Mother|Mother|
|**18**|101|White|R5|White-CDC||5|I choose not to answer|6||23|Mother-in-law or Father-in-law|Mother-in-law or Father-in-law|
|**19**|999|I choose not to answer|7|Not Provided||||||24|Nephew or Niece|Nephew or Niece|
|**20**||||||SexualOrientation Codes (Field 163) _(cs=3)_|⬚|⬚||25|Other Adult|Other Adult|
|**21**|Ethnicity Values _(cs=4)_|⬚|⬚|⬚||Advantasure  _(cs=2)_|⬚|HRP /Enrollment sparse value||26|Other Relationship|Other Relationship|
|**22**||||||Value in Memout file|Description|Codeentry for codesetname = sexualOrientation||27|Significant Other|Significant Other|
|**23**|Advantasure  _(cs=2)_|⬚|HRP /Enrollment sparse value|Shortname in HRP||1|Lesbian or Gay|1||28|Son-in-law or Daughter-in-law|Son-in-law or Daughter-in-law|
|**24**|Value in Memout file|Description|Code entry for code set name=RaceOrEthnicityCode|||2|Straight|2||29|Sponsored Dependent|Sponsored Dependent|
|**25**|NA|Not of Hispanic, Latino/a or Spanish <br>Origin|ROEC1|Not Hispanic or Latino||3|Bisexual|6||2|Brother or Sister|Brother or Sister|
|**26**|PR|Puerto Rican|47|Puerto Rican||4|I use a different term|4||30|Spouse|Spouse|
|**27**|OTH|Another Hispanic, Latino or Spanish <br>Origin|E1|Hispanic or Latino -CDC||4|I don’t know|4||31|Stepfather|Stepfather|
|**28**|MX|Mexican, Mexican American, Chicano/a|40|Mexican American||5|I choose not to answer|5||32|Stepmother|Stepmother|
|**29**|CUB|Cuban|15|Cuban||||||33|Stepson or Stepdaughter|Stepson or Stepdaughter|
|**30**|NR|I choose not to answer|7|Not Provided||||||34|Uncle or Aunt|Uncle or Aunt|
|**31**||||||||||35|Unknown|Unknown|
|**32**||||||||||36|Ward|Ward|
|**33**|Language Codes _(cs=4)_|⬚|⬚|⬚||||||3|Brother-in-law or Sister-in-law|Brother-in-law or Sister-in-law|
|**34**||||||||||4|Child|Child|
|**35**|Advantasure  _(cs=2)_|⬚|HRP /Enrollment sparse value|Comments||||||5|Child - Insured Has No Financial Responsibility|Child where Insured Has No Financial Responsibility|
|**36**|Value in Memout file|Description|Code entry for code set name=LanguageDomain|||||||6|Collateral Dependent|Collateral Dependent|
|**37**|<null>|English|EN|||||||7|Court Appointed Guardian|Court Appointed Guardian|
|**38**|ENG|English|EN|||||||8|Cousin|Cousin|
|**39**|SPA|Spanish|ES|||||||9|Dependent of a Minor Dependent|Dependent of a Minor Dependent|
|**40**|FRA|French|FR||||||||||
|**41**|GER|German|DE||||||||||
|**42**|OTH|Other|OT||||||||||
|**43**|||||||||||||
|**44**|||||||||||||
|**45**|_(cs=2)_|⬚|||||||||||
|**46**|Relationship to the Member _(cs=2)_|⬚|||||||||||
|**47**|Code|Description|||||||||||
|**48**|1|Spouse|||||||||||
|**49**|3|Parent|||||||||||
|**50**|4|Grandparent|||||||||||
|**51**|5|Grandchild|||||||||||
|**52**|6|Uncle or Aunt|||||||||||
|**53**|7|Nephew or Niece|||||||||||
|**54**|8|Cousin|||||||||||
|**55**|9|Adopted Child|||||||||||
|**56**|10|Foster Child|||||||||||
|**57**|11|Son/Daughter-inlaw|||||||||||
|**58**|12|Brother/Sister-inlaw|||||||||||
|**59**|13|Mother/Fatherin-law|||||||||||
|**60**|14|Sibling|||||||||||
|**61**|15|Ward|||||||||||
|**62**|16|Stepparent|||||||||||
|**63**|17|Stepchild|||||||||||
|**64**|18|Self|||||||||||
|**65**|19|Child|||||||||||
|**66**|23|Sponsored Dependent|||||||||||
|**67**|24|Dependent of a Minor Dependent|||||||||||
|**68**|25|Ex-spouse|||||||||||
|**69**|26|Guardian|||||||||||
|**70**|31|Court Appointed Guardian|||||||||||
|**71**|38|Collateral Dependent|||||||||||
|**72**|53|Life Partner|||||||||||
|**73**|60|Annuitant|||||||||||
|**74**|D2|Trustee|||||||||||
|**75**|G8|Other Relationship|||||||||||
|**76**|G9|Other Relative|||||||||||
---
<a id="sheet-appendix"></a>
## Sheet: Appendix
|#|A|B|C|D|E|
|---|---|---|---|---|---|
|**1**|Transaction type|Retro changes|Full Replace <!-- NOTE: The entire history for a member can change for the specified value -->|Multiple record for a member|Carry Retro chnages to HRP|
|**2**|▪    DEM (Demographics) – Non spanable always contains the latest value|X|X|X|NA|
|**3**|▪    ADR – Address History<br>|ü||ü|X|
|**4**|▪    PLN – Plan Enrollment History|ü||ü|ü|
|**5**|▪    PWO – Premium Withhold|ü||ü||
|**6**|▪    LIS – Low Income Subsidy|ü|ü|ü||
|**7**|▪    LEP – Late Enrollment Penalty|ü|ü|ü||
|**8**|▪    FLG – Flag set in the system|ü||ü||
|**9**|▪    BRK – Broker|ü||ü||
|**10**|▪    PCP – Primary Care Physician|ü||ü|ü|
|**11**|▪    GRP – Group/Subgroup information|ü||ü|ü|
|**12**|▪    RDR – Rider|ü||ü|ü|
|**13**|▪    COB – Coordination of Benefits|ü||ü|ü|
|**14**|▪    MCD - Medicaid|ü||ü||
---
</file>
<file path="BA-Mapping-Docs/EdifecsProduct_MappingSpec_InboundClaims_837_EDI_to_XMLConversion_V2.2.md">
# EdifecsProduct_MappingSpec_InboundClaims_837_EDI_to_XMLConversion_V2.2
|Property|Value|
|----------|-------|
|**Source file**|`EdifecsProduct_MappingSpec_InboundClaims_837_EDI_to_XMLConversion_V2.2.xlsx`|
|**Sheets**|Cover Page, Version History, 837P Base Mapping, 837P Base Mapping(Default Val), 837I Base Mapping, 837I Mapping (Default Value), Sheet1, Crosswalk|
|**Converted**|2026-06-24T11:46:43.102Z|
> ℹ️  Formulas are shown inline as `=FORMULA` after the cached value.
> Merged cells: anchor cell shows _(cs=N, rs=N)_; absorbed cells show ⬚.
> Formula Index per sheet is collapsible — click to expand.
---
## Contents
1. [Sheet: Cover Page](#sheet-cover-page)
2. [Sheet: Version History](#sheet-version-history)
3. [Sheet: 837P Base Mapping](#sheet-837p-base-mapping)
4. [Sheet: 837P Base Mapping(Default Val)](#sheet-837p-base-mappingdefault-val)
5. [Sheet: 837I Base Mapping](#sheet-837i-base-mapping)
6. [Sheet: 837I Mapping (Default Value)](#sheet-837i-mapping-default-value)
7. [Sheet: Sheet1](#sheet-sheet1)
8. [Sheet: Crosswalk](#sheet-crosswalk)
---
<a id="sheet-cover-page"></a>
## Sheet: Cover Page
|#|B|C|D|E|F|G|H|I|J|K|L|
|---|---|---|---|---|---|---|---|---|---|---|---|
|**5**||||||||||||
|**6**|EDI 837I/P Mapping Specification- EDIFECS _(cs=11, rs=2)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**7**|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**8**|Business Area: Claims IB _(cs=11, rs=2)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**9**|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**10**|This document provides the Mapping Specification for EDI 837I/P Claims IB. Document is intended for EDIFECS Product Team<br> _(cs=11)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**11**||||||||||||
|**12**||||||||||||
|**13**|||||Version _(cs=2)_|⬚|V26.1.0.0|||||
|**14**||||||||||||
|**15**||Distribution of this document is limited to UST HealthProof _(cs=9)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚||
|**16**||||||||||||
|**17**||Notice of Confidentiality and Custodial Responsibilities _(cs=9)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚||
|**18**||This UST HealthProof document contains confidential information that is <br>UST HealthProof’s intellectual property. As a holder of this document, you<br> may NOT disclose its content or any information derived from it to <br>any person outside of UST Proof Project Team. _(cs=9, rs=4)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚||
|**19**||⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚||
|**20**||⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚||
|**21**||⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚||
|**22**||||||||||||
|**23**|Sign Off _(cs=11)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**24**||Name _(cs=2)_|⬚|Role _(cs=2)_|⬚|Organization _(cs=2)_|⬚|Date _(cs=2)_|⬚|Approval  _(cs=2)_|⬚|
|**25**|Approver #1|_(cs=2)_|⬚|_(cs=2)_|⬚|_(cs=2)_|⬚|_(cs=2)_|⬚|_(cs=2)_|⬚|
|**26**|Approver #2|_(cs=2)_|⬚|_(cs=2)_|⬚|_(cs=2)_|⬚|_(cs=2)_|⬚|_(cs=2)_|⬚|
|**27**|Approver #3|_(cs=2)_|⬚|_(cs=2)_|⬚|_(cs=2)_|⬚|_(cs=2)_|⬚|_(cs=2)_|⬚|
|**28**|Approver #4|_(cs=2)_|⬚|_(cs=2)_|⬚|_(cs=2)_|⬚|_(cs=2)_|⬚|_(cs=2)_|⬚|
---
<a id="sheet-version-history"></a>
## Sheet: Version History
|#|B|C|D|E|F|
|---|---|---|---|---|---|
|**1**||||||
|**2**|Revision History _(cs=5)_|⬚|⬚|⬚|⬚|
|**3**||||||
|**4**||||||
|**5**||||||
|**6**|V#|Date|Author|Reviewer(s)/ Contributor(s)|Comments|
|**7**|1.0|02/16/23|Ambily Raj/Jishnu|Shijila M/ Rameshwar Singh||
|**8**|1.1|03/13/23|Ambily Raj/Jishnu|Shijila M/ Rameshwar Singh|Removed the mapping logic for  /professionalClaim/memberInformation/  tag in the 2000B and 2010BA Loop. Expectaion is  /professionalClaim/memberInformation/ tag will be mapped from 2000C and 2010CA loop  for dependent claims. <br>Removed the mapping logic for /institutionalClaim/memberInformation/tag in the 2010BA Loop and Edpectation is <br>/institutionalClaim/memberInformation/ tag will mapped from 2010CA loop  for dependent claims. <br><br>|
|**9**|1.2|45049|Ambily Raj/Jishnu|Shijila M/ Rameshwar Singh|Changed the mapping for /header/correlationId and /recordId for 837I and P.|
|**10**|1.3|06/02/2023|Ambily Raj|Shijila M/ Rameshwar Singh|Cosmetic changes done for 837P and changed the mapping of  /recordId  for 837P and 837I|
|**11**|1.4|06/08/2023|Ambily Raj|Shijila M/ Rameshwar Singh|Changed the mapping of  /XMLFileCreationDate  for 837P and 837I|
|**12**|1.5|06/09/2023|Jishnu|Shijila M/ Rameshwar Singh|2300.REF01/REF02 – Added Enumeration values.<br>2320.SBR01 - Added more details in Transformation logic . <br>2010BA – Added more details in Comments. No change in logic<br>2300.PWK01 - Added more detail in comments for attachment type code|
|**13**|1.6|06/09/2023|Jishnu/Ambily|Rameshwar Singh|<br>2320.SBR01 - Added more details in Transformation logic . <br>|
|**14**|1.7|06/09/2023|Jishnu/Ambily|Rameshwar Singh|<br>Made changes in mapping default value tab for file  creation date format<br>|
|**15**|1.8|06/28/2023|Jishnu/Ambily|Rameshwar Singh|Reframed enumeration values2000B.SBR02  and added logic for SBR03|
|**16**|1.9|07/05/2023|Jishnu/Ambily|Rameshwar Singh|2430.DTP03 removed repricer response date mapping as its not required for Inbound claims<br>Corrected /taxamount mapping for COB. <br>Removed CN1 Mapping|
|**17**|1.10|07/13/2023|Jishnu/Ambily|Rameshwar Singh|Removed mapping for 2400.AMT02(Service Tax amount and Facility Tax amount)<br>Added mapping for below tags in 2430.CAS.   <br>Removed mapping for HCP segment|
|**18**|1.11|07/13/2023|Jishnu/Ambily|Rameshwar Singh|Added transformation logic for 2300.CLM07 -Assignment acceptance in 837P &837I<br>Added transformation logic for 2400.SV104 -837P<br>Added Mapping for 2330B.DTP03 -837I/P<br>Added Mapping for 2010BA. N4<br>Added Mapping to 2010CA.N4<br><br>|
|**19**|1.12|07/13/2023|Jishnu/Ambily|Rameshwar Singh|Added mapping for HCC Claim line number -2400.LX1 in 837P<br>Corrected mapping logic for /serviceLineItem/renderingPractitionerSpecialty  from 2000A.PRV03<br>|
|**20**|1.13|07/13/2023|Jishnu/Ambily|Rameshwar Singh|Added transformation logic for 2010BA.NM109<br>|
|**21**|1.14|08/24/2023|Jishnu|Rameshwar Singh|Added transformation logic for  diagnosis code  2300.HI for Both professional and Institutional <br>|
|**22**|1.15|11/9/23|Jishnu|Rameshwar Singh|Added EDI File Type in 837P Base Mapping(Default Val) and 837I Base Mapping(Default Val)|
|**23**|1.16|11/21/2023|Jishnu|Rameshwar Singh|Added mapping for Institutional  2000A.PRV03|
|**24**|1.17|11/28/2023|Jishnu|Rameshwar Singh|Added logic for 2010AA.PER 03<br>Added crosswalk table for PWK<br>Added mapping logic in 2400.DTP|
|**25**|1.18|1/17/24|Jishnu|Rameshwar Singh|Added mapping for -837I 2330B NM109 (NM1*PR)<br>Added mapping for - 837P 2430 CAS codes <br>Added mapping logic for PER segment 837P|
|**26**|1.19|2/5/24|Jishnu|Rameshwar Singh|PSD1569- Added qualifier "DN" for 2310A.NM101' (Professional)<br>PSD 1616- Added logic only two digit allowed after decimal point for allowed amount (Inst & Prof)<br>PSD1640- <br>1)added mapping in 2400.SV101-7  ServiceDescription under serviceLineItem(Both Institutional and Professional).<br>2)2010AA.N302 to the second instance of street address (inst)<br>3)2310C.N302 to the second instance of street address (prof)|
|**27**|V2.0|4/4/24|Ambily|Rameshwar Singh|Changes for INTP-7868. -  Added mapping for /sourceTypeIdentifier  (Institutional/Professional)|
|**28**|V2.1 _(rs=3)_|5/17/24|Ambily|Rameshwar Singh|Changes for INTP-8520. - Added mapping for /recordId  (Institutional/Professional)<br>Changes for PSD-2335 - Updated mapping for 2010AA.PER Segment|
|**29**|⬚|7/24/24|SwedhaKumar|Ambily Raj|Changes for INTP-9238 - Updated the 2300 HI segment, removed mapping for multiple occurances as the target max occurence is one. <br>Changes for INTP - 9197 - Updated the 2300CRC segment, removed mapping for multiple occurances (CRC04, CRC05) as the target max occurence is one.|
|**30**|⬚|8/9/24|SwedhaKumar|Ambily Raj|Changes for INTP-9450 - Updated the Prof mapping - 2300.CLM02 segment mapping logic ie., Map CLM02 <billedAmount> only when 2320.CAS  is pesent<br>|
|**31**|V2.2 _(rs=2)_|9/19/24|Ambily Raj|Rameshwar Singh|Changes for INTP-10071: Claims Lifecycle Notification changes.|
|**32**|⬚|10/24/24|Ambily Raj|Rameshwar Singh|Changes for PSD-3735: To load Referring Practitioner details(837I)|
---
<a id="sheet-837p-base-mapping"></a>
## Sheet: 837P Base Mapping
|#|A|B|C|D|E|F|G|H|I|J|
|---|---|---|---|---|---|---|---|---|---|---|
|**1**|EDILoopID. Segment|EDI Data Element Name|EDI Element Description|Usage|Enumeration Values|Sample values|Mapped to XSD element|HRP Element Description|Transformation Logic|Comments|
|**2**|ISA (Interchange Control Header Segment) _(cs=10)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**3**|ISA|Segment: Interchange Control Header||R|||||||
|**4**|ISA01|Authorization Information Qualifier|Code identifying the type of information in the Authorization Information|R|00 : No Authorization Information Present||||||
|**5**|ISA02|Authorization Information||R|Blank (10 spaces)||||||
|**6**|ISA03|Security Information Qualifier|Code identifying the type of information in the Security Information|R|00 : No Security Information Present||||||
|**7**|ISA04|Security Information|security information about the interchange sender<br>or the data in the interchange|R|Blank (10 spaces)||||||
|**8**|ISA05|Interchange ID Qualifier|radin|R|ZZ : Mutually Defined||||||
|**9**|ISA06 _(rs=3)_|Interchange Sender ID _(rs=3)_|Sender ID _(rs=3)_|R _(rs=3)_|<Sender ID>            _(rs=3)_|_(rs=3)_|professionalClaimIBRequestRoot/header/senderId|Sender ID from EDI837 X12 will be mapped to the header of each claim bundle.|||
|**10**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/tradingPartnerID|Sender ID from EDI837 X12 will be mapped to the Trading Partner ID.|||
|**11**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/claimSource||Crosswalk Name : P_IB_837_ClaimSourceLookup<br>•Provide the Sender Id and Receiver Id as the source columns.<br>•Provide the ClaimSource and ClaimDeliveryType as the target columns.||
|**12**|ISA07|Interchange ID Qualifier|Code indicating the system/method of code structure used to designate the<br>sender or receiver ID element being qualified|R|ZZ : Mutually Defined||||||
|**13**|ISA08|Interchange Receiver ID|Receiver Id|R|<br><Receiver ID>||professionalClaimIBRequestRoot/header/receiverId|Receiver ID from EDI837 X12 will be mapped to the header of each claim bundle.|||
|**14**|ISA09|Interchange Date|Date of the interchange|R|SysDate (YYMMDD)|Example : 210630|||||
|**15**|ISA10|Interchange Time|Time of the interchange|R|SysTime (HHMM)|Example : 1732|||||
|**16**|ISA11|Interchange Control Standards Identifier||R|^||||||
|**17**|ISA12|Interchange Control Version Number|Code specifying the version number of the interchange control segments|R|00501||||||
|**18**|ISA13|Interchange Control Number|A control number assigned by the interchange sender|R||Example : 319003402|||||
|**19**|ISA14|Acknowledgment Requested|Code indicating sender’s request for an interchange acknowledgment|R|0 : No Interchange Acknowledgement Requested<br>1 : Interchange Acknowledgment Requested <br><br>||||||
|**20**|ISA15|Usage Identifier|Code indicating whether data enclosed by this interchange envelope is test,<br>production or information|R|P : Production Data T : Test||||||
|**21**|ISA16|Component Element Separator|The delimiter used to separate component data elements|R|: = Element separator<br>~ = Segment Terminator||||||
|**22**|GS (Functional Group Header) _(cs=10)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**23**|GS|Segment: Functional Group Header||R|||||||
|**24**|GS01|Functional Identifier Code|The two-character identifier Code for the transaction set included.|R|HC : Health Care Claim (837)||||||
|**25**|GS02|Application Senders Code|Code identifying party sending transmission,  codes agreed to by trading partners <br>This is Submitter-specific.|R|<Sender ID>||||||
|**26**|GS03|Application Receivers Code|Code identifying party receiving transmission; codes agreed to by trading partners|R|<HealthPlan ID>/<br>||||||
|**27**|GS04|Date|Date the Group Header is created.|R|SysDate (YYYYMMDD)|Example : 210630|||||
|**28**|GS05|Time|Time the Group Header is created.|R|SysTime (HHMM)|Example : 1732|||||
|**29**|GS06|Group Control Number|Submitter-specific number.|R|<Group Control Number>|319003402|||||
|**30**|GS07|Responsible Agency Code|Code identifying the issuer of the EDI standard being used.<br>|R|X : Accredited Standards Committee X12||||||
|**31**|GS08|Version/Release/Industry Identifier Code|Code indicating the version, release, subrelease, and industry identifier of the EDI<br>standard being used,<br>ST03 and GS08 must be identical|R|005010X222A1||||||
|**32**|ST (Transaction Set Header) _(cs=10)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**33**|ST|Segment: Transaction Set Header||R|||||||
|**34**|ST01|Transaction Set Identifier Code|Code uniquely identifying a Transaction Set|R|837 : Health Care Claim||||||
|**35**|ST02|Transaction Set Control Number|Unique Sequential Number Assigned by Internal Processes for each Transaction Set. Starts from 001 and increments with each transaction set <br>|R|<Transaction set Control Number><br>Starts from 001 and increments with each transaction set|319003402|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/externalBatchSequenceNumber||||
|**36**|ST03|Implementation Convention Reference|Standards Approved by ACS X12 Review Board.                 ST03 and GS08 must be identical|R|005010X222A1||||||
|**37**|BHT|Segment: Beginning Of Hierarchical Transaction||R|||||||
|**38**|BHT01|Hierarchical Structure Code|Code indicating the hierarchical application structure of a transaction set|R|0019 : Information Source, Subscriber, Dependent||||||
|**39**|BHT02|Transaction Set Purpose Code|Code identifying purpose of transaction set.  Used to convey the electronic transmission status of <br>the 837 batch|R|00 : Original<br>18 : Reissue||||||
|**40**|BHT03|Reference Identification|Reference information as defined for a particular Transaction Set|R|<Originator Application Transaction Identifier>|319003402|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/externalClaimBatchNumber|Batch number assigned by external<br>system.|||
|**41**|BHT04 _(rs=2)_|Date _(rs=2)_|The date the transaction was created _(rs=2)_|R _(rs=2)_|SysDate (YYYYMMDD)  _(rs=2)_|20210630 _(rs=2)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/cleanClaimDate|Mapped from BHT04, formatted to YYYY-MM-DD<br>Date as of which all of the information<br>necessary to process the<br>claim was received. This information<br>can be used to determine<br>whether interest should be calculated<br>on the claim. -- reflected in Clean Claim Date at claim line level|||
|**42**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/receiptDate|Mapped from BHT04, formatted to YYYY-MM-DD<br><br>Date on which the Health Care Company<br>was first made aware- of the<br>claim. - reflected as Received Date in HRP UI|||
|**43**|BHT05|Time|The time the transaction was created|R|SysTime (HHMMSS)|173250|||||
|**44**|BHT06|Transaction Type Code|Code specifying the type of transaction|R|CH- Chargeable<br>RP- Reporting||||||
|**45**|Loop 1000A — SUBMITTER NAME (Required)  Loop Repeat: 1 _(cs=10)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**46**|NM1|Segment NM1 - Submitter Name  (Required)||R|||||||
|**47**|1000A.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R|41 : Submitter||||||
|**48**|1000A.NM102|Entity Type Qualifier|Code qualifying the type of entity|R|1 : Person<br>2 : Non-person Entity||||||
|**49**|1000A.NM103|Name Last or Organization Name|Individual last name or organizational name|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/submitterName|<Submitter Last/Org Name><br>|||
|**50**|1000A.NM104|Name First|Individual first name|S|||||||
|**51**|1000A.NM105|Name Middle|Individual middle name or initial|S|||||||
|**52**|1000A.NM108|Identification Code Qualifier|Code designating the system/method of code structure used for Identification<br>Code|R|46 : Electronic Transmitter Identification Number (ETIN||||||
|**53**|1000A.NM109|Identification Code|Code identifying a party or other code|R|100X||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/submitterId|<Submitter ID><br>|||
|**54**|PER|Segment PER - Submitter EDI Contact Information||R|||||||
|**55**|1000A.PER01|Contact Function Code|Code identifying the major duty or responsibility of the person or group named|R|IC -  Information Contact||||||
|**56**|1000A.PER02|Name|Submitter Contact Name|S|<<Submitter Name>>||||||
|**57**|1000A.PER03|Communication Number Qualifier|Code identifying the type of communication number|R|"EM" : Electronic Mail<br>"FX" : Facsimile<br>"TE" : Telephone||||||
|**58**|1000A.PER04|Communication Number|Complete communications number including country or area code when applicable|R|||||||
|**59**|1000A.PER05|Communication Number Qualifier|Code identifying the type of communication number|S|"EM" : Electronic Mail<br>"FX" : Facsimile<br>"TE" : Telephone||||||
|**60**|1000A.PER06|Communication Number|Complete communications number including country or area code when applicable|S|||||||
|**61**|1000A.PER07|Communication Number Qualifier|Code identifying the type of communication number|S|"EM" : Electronic Mail<br>"FX" : Facsimile<br>"TE" : Telephone||||||
|**62**|1000A.PER08|Communication Number|Complete communications number including country or area code when applicable|S|||||||
|**63**|Loop 1000B — RECEIVER NAME (Required) Loop Repeat: 1 _(cs=10)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**64**|NM1|Segment NM1 - Receiver Name  (Required)||R|||||||
|**65**|1000B.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R|40 : Receiver||||||
|**66**|1000B.NM102|Entity Type Qualifier|Code qualifying the type of entity|R|2 : Non-Person Entity||||||
|**67**|1000B.NM103|Name Last or Organization Name|Individual last name or organizational name|R|||||||
|**68**|1000B.NM108|Identification Code Qualifier|Code designating the system/method of code structure used for Identification<br>Code|R|46 :  Electronic Transmitter Identification Number (ETIN||||||
|**69**|1000B.NM109|Identification Code|Code identifying a party|R|||||||
|**70**|Loop 2000A — BILLING PROVIDER HIERARCHICAL LEVEL (Required)  Loop Repeat: >1 _(cs=10)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**71**|HL|Segment HL - Billing Provider Hierarchical Level  (Required)||R|||||||
|**72**|2000A.HL01|Hierarchical ID Number|A unique number assigned by the sender to identify a particular data segment in<br>a hierarchical structure|R|The first HL01 within each ST-SE envelope must begin with “1”,<br>and be incremented by one each time an HL is used in the<br>transaction||||||
|**73**|2000A.HL02|Hierarchical Parent ID Number||R|||||||
|**74**|2000A.HL03|Hierarchical Level Code|Code defining the characteristic of a level in a hierarchical structure|R|20 : Information Source||||||
|**75**|2000A.HL04|Hierarchical Child Code|ndccode|R|1 : Additional Subordinate HL Data Segment in This<br>Hierarchical Structure.||||||
|**76**|PRV|Segment PRV - Billing Provider Specialty Information  (Situational)||S|||||||
|**77**|2000A.PRV01|Provider Code|Code identifying the type of provider|R|BI : Billing||||||
|**78**|2000A.PRV02|Reference Identification Qualifier|Code qualifying the Reference Identification|R|PXC :  Health Care Provider Taxonomy Code||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/additionalCodes/codes/qualifier|||Needs review with configuration team|
|**79**|2000A.PRV03 _(rs=2)_|Reference Identification _(rs=2)_|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier _(rs=2)_|R _(rs=2)_|_(rs=2)_|_(rs=2)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/additionalCodes/codes/code|||Needs review with configuration team|
|**80**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/renderingPractitionerSpecialty||if 2310B loop and 2420A loop  does not exist and 2010AA.NM102='1'||
|**81**|CUR|Segment CUR - Foreign Currency Information (Situational)||S|||||||
|**82**|2000A.CUR01|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R|||||||
|**83**|2000A.CUR02|Currency Code|Code (Standard ISO) for country in whose currency the charges are specified|R|||||||
|**84**|Loop 2010AA - BILLING PROVIDER NAME (Required) Loop Repeat: 1 _(cs=10)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**85**|NM1|Segment NM1 - Billing Provider Name (Required)||R|||||||
|**86**|2010AA.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R|85 :  Billing Provider||||||
|**87**|2010AA.NM102|Entity Type Qualifier|Code qualifying the type of entity|R|1 : Person<br>2 : Non-Person Entity||||||
|**88**|2010AA.NM103 _(rs=3)_|Name Last or Organization Name _(rs=3)_|Individual last name or organizational name  _(rs=3)_|S _(rs=3)_|_(rs=3)_|_(rs=3)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/supplierInformationList/supplierInformation/supplierBillingName|If NM102 is Person, this should be <br>the Billing Provider Last Name.<br>If NM102 is Non-Person, this <br>should be the Organization Name|||
|**89**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/supplierName/lastName||||
|**90**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/renderingProviderLastName||if 2310B loop and 2420A loop  does not exist and 2010AA.NM102='1'||
|**91**|2010AA.NM104 _(rs=2)_|Name First _(rs=2)_|Individual first name  _(rs=2)_|S _(rs=2)_|_(rs=2)_|_(rs=2)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/supplierName/firstName||Required when NM102 = 1||
|**92**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/renderingProviderFirstName||if 2310B loop and 2420A loop  does not exist and 2010AA.NM102='1'||
|**93**|2010AA.NM105 _(rs=2)_|Name Middle _(rs=2)_|Individual middle name or initial  _(rs=2)_|S _(rs=2)_|_(rs=2)_|_(rs=2)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/supplierName/middleName||Required when NM102 = 1||
|**94**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/renderingProviderMiddleName||if 2310B loop and 2420A loop  does not exist and 2010AA.NM102='1'||
|**95**|2010AA.NM107 _(rs=2)_|Name Suffix _(rs=2)_|Suffix to individual name  _(rs=2)_|S _(rs=2)_|_(rs=2)_|_(rs=2)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/supplierName/nameSuffix||Required when NM102 = 1||
|**96**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/renderingProviderSuffix||if 2310B loop and 2420A loop  does not exist and 2010AA.NM102='1'||
|**97**|2010AA.NM108|Identification Code Qualifier|Code designating the system/method of code structure used for Identification<br>Code (67)|S|XX :  Centers for Medicare and Medicaid Services<br>National Provider Identifier||||||
|**98**|2010AA.NM109 _(rs=2)_|Identification Code _(rs=2)_|Code identifying a party or other code / Billing Provider Identifier _(rs=2)_|S _(rs=2)_|_(rs=2)_|1477569838 _(rs=2)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/supplierInformationList/supplierInformation/npi||||
|**99**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/renderingProviderNPI||if 2310B loop and 2420A loop  does not exist and 2010AA.NM102='1'||
|**100**|N3|Segment N3 - Billing Provider Address (Required)||R|||||||
|**101**|2010AA.N301|Address Information|Address information|R||777 BANNOCK ST|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/supplierInformationList/supplierInformation/streetAddress|The first line of the street address.|||
|**102**|2010AA.N302|Address Information|Address information|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/supplierInformationList/supplierInformation/streetAddress||Concatenate the value (if present) to this XML field, separated by comma and space (, )||
|**103**|N4|Segment N4 - Billing Provider City, State, ZIP Code (Required)||R|||||||
|**104**|2010AA.N401|City Name|Free-form text for city name|R||DENVER|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/supplierInformationList/supplierInformation/cityName|City|||
|**105**|2010AA.N402|State or Province Code|Code (Standard State/Province) as defined by appropriate government agency|S||CO|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/supplierInformationList/supplierInformation/stateCode|State abbreviation|||
|**106**|2010AA.N403|Postal Code|Code defining international postal zone code excluding punctuation and blanks (zip code for United States)|S||802044507|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/supplierInformationList/supplierInformation/postalCode|zip code|||
|**107**|2010AA.N404|Country Code|Code identifying the country|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/supplierInformationList/supplierInformation/countryCode|Concrete type for Country code|Map to the value "US" if not present||
|**108**|2010AA.N407|Country Subdivision Code|Code identifying the country subdivision|S|||||||
|**109**|REF|Segment REF - Billing Provider Tax Identification (Required)||R|||||||
|**110**|2010AA.REF01 _(rs=2)_|Reference Identification Qualifier _(rs=2)_|Code qualifying the Reference Identification _(rs=2)_|R _(rs=2)_|EI : Employer’s Identification Number<br>SY : Social Security Number _(rs=2)_|_(rs=2)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/supplierInformationList/supplierInformation/taxIdCode|Supplier tax identification code (SSN, EID, etc.)|||
|**111**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/renderingProviderIdQualifier||if 2310B loop and 2420A loop  does not exist and 2010AA.NM102='1'||
|**112**|2010AA.REF02 _(rs=4)_|Reference Identification _(rs=4)_|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier _(rs=4)_|R _(rs=4)_|_(rs=4)_|_(rs=4)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/supplierInformationList/supplierInformation/taxIdentificationNumber|Billing Provider Tax Identification Number|If /837/2000A/2010AA/REF01 (Reference Identification Qualifier) is ‘EI’ then it will be mapped into ‘XX-XXXXXXX’ format to taxIdentificationNumber||
|**113**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/supplierInformationList/supplierInformation/taxIdentificationNumber|Billing Provider Tax Identification Number|If /837/2000A/2010AA/REF01 (Reference Identification Qualifier) is ‘SY’ then it will be mapped into ‘XXX-XX-XXXX’ format to taxIdentificationNumber||
|**114**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/supplierInformationList/supplierInformation/otherId|Supplier tax identification code (SSN, EID, etc.).|When REF01=SY||
|**115**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/otherRenderingProviderId||if 2310B loop and 2420A loop  does not exist and 2010AA.NM102='1'|Added mapping to copy the Billing provider details to line level rendering provider fields when claim level and service line level rendering provider details are not present and if the billing provider is a person|
|**116**|REF|Segment REF - Billing Provider UPIN/License Information (Situational)||S|||||||
|**117**|2010AA.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|1G  : Provider UPIN Number<br>0B :  State License Number||||||
|**118**|2010AA.REF02 _(rs=2)_|Reference Identification _(rs=2)_|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier _(rs=2)_|R _(rs=2)_|_(rs=2)_|_(rs=2)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/supplierInformationList/supplierInformation/supplierPINNumber|<br>Supplier PIN number.|When REF01=1G||
|**119**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/supplierInformationList/supplierInformation/otherId|<br>Supplier's other ID|When REF01=0B or 1G And <br>if its not already mapped from 2010AA.REF02||
|**120**|PER|Segment - PER Billing Provider Contact Information (Situational)||S|||||||
|**121**|2010AA.PER01|Contact Function Code|Code identifying the major duty or responsibility of the person or group name|R|IC -  Information Contact||||||
|**122**|2010AA.PER02|Name|Billing Provider Contact Name|S|||||||
|**123**|2010AA.PER03|Communication Number Qualifier|Code identifying the type of communication number|R|"EM" : Electronic Mail<br>"FX" : Facsimile<br>"TE" : Telephone||||<br>||
|**124**|2010AA.PER04 _(rs=3)_|Communication Number _(rs=3)_|_(rs=3)_|R _(rs=3)_|_(rs=3)_|_(rs=3)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/supplierInformationList/supplierInformation/phoneCountryCode|<br>Phone Country Code|If PER03/05/07 is TE, Map the Phone number in PER04/06/08<br>/phoneCountryCode  : <br>First byte of Phone number if it is 11 byte<br>/phoneAreaCode:<br>2,3,4 bytes  of Phone number if it is 11 bytes<br>First 3 bytes of Phone number if it  is 10 bytes<br>/phoneNumber :<br>last 7 bytes of Phone number _(rs=3)_||
|**125**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/supplierInformationList/supplierInformation/phoneAreaCode|<br>phoneAreaCode|⬚||
|**126**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/supplierInformationList/supplierInformation/phoneNumber|<br>PhoneNumberType|⬚||
|**127**|2010AA.PER05|Communication Number Qualifier|Code identifying the type of communication numbe|S|"EM" : Electronic Mail<br>"FX" : Facsimile<br>"TE" : Telephone<br>"EX" : Telephone Extension||||||
|**128**|2010AA.PER06|Communication Number|Communication Number|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/supplierInformationList/supplierInformation/phoneExtensionNumber||If PER03/05 is TE and the very next qualifier (PER05/07) following is 'EX', map the Extension in PER06/08|PER✽IC✽JOHN SMITH✽TE✽5555551234✽EX✽123~<br>|
|**129**|2010AA.PER07|Communication Number Qualifier|Code identifying the type of communication number|S|"EM" : Electronic Mail<br>"FX" : Facsimile<br>"TE" : Telephone<br>"EX" : Telephone Extension||||||
|**130**|2010AA.PER08|Communication Number||S|||||||
|**131**|Loop 2010AB - PAY-TO ADDRESS NAME (Situational)  Loop Repeat: 1 _(cs=10)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**132**|NM1|Segment - NM1 Pay-to Address Name (Situational)||S|||||||
|**133**|2010AB.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R|87: Pay-to Provider||||||
|**134**|2010AB.NM102|Entity Type Qualifier|Code qualifying the type of entity|R|1 : Person<br>2:  Non-Person Entity||||||
|**135**|N3|Segment - N3 Pay-to Address - ADDRESS (Required)||R|||||||
|**136**|2010AB.N301|Address Information|Address Information|R||PO BOX 677931|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/payToAddress/streetAddress|The first line of the street address.|||
|**137**|2010AB.N302|Address Information|Address Information|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/payToAddress/streetAddress||Concatenate the value (if present) to this XML field, separated by comma and space (, )||
|**138**|N4|Segment - N4 Pay-To Address City, State, ZIP Code (Required)||R|||||||
|**139**|2010AB.N401|City Name|Free-form text for city name|R||DALLAS|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/payToAddress/cityName|city|||
|**140**|2010AB.N402|State or Province Code|Code (Standard State/Province) as defined by appropriate government agency|S||TX|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/payToAddress/stateCode|State abbreviation|||
|**141**|2010AB.N403|Postal Code|Code defining international postal zone code excluding punctuation and blanks (zip code for United States)|S||752677931|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/payToAddress/postalCode|zip code|||
|**142**|2010AB.N404|Country Code|Code identifying the country|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/payToAddress/countryCode|Country code|Map to the value "US" if not present||
|**143**|2010AB.N407|Country Subdivision Code|Code identifying the country subdivision|S|||||||
|**144**|Loop 2010AC - — PAY-TO PLAN NAME  (Situational)   Loop Repeat: 1 _(cs=10)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**145**|NM1|Segment - NM1 Pay-To Plan Name (Situational)||S|||||||
|**146**|2010AC.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R|PE : Payee||||||
|**147**|2010AC.NM102|Entity Type Qualifier|Code qualifying the type of entity|R|<br>2 : Non-Person Entity||||||
|**148**|2010AC.NM103|Name Last or Organization Name|Individual last name or organizational name|R|||||||
|**149**|2010AC.NM108|Identification Code Qualifier|Code designating the system/method of code structure used for Identification Code (67)|R|||||||
|**150**|2010AC.NM109|Identification Code|Code identifying a party or other code|R|||||||
|**151**|N3|Segment - N3 Pay-to Plan Address (Required)||R|||||||
|**152**|2010AC.N301|Address Information|Address Information|R|||||||
|**153**|2010AC.N302|Address Information|Address Information|S|||||||
|**154**|N4|Segment - N4 Pay-To Plan City, State, ZIP Code (Required)||R|||||||
|**155**|2010AC.N401|City Name|Free-form text for city name|R|||||||
|**156**|2010AC.N402|State or Province Code|Code (Standard State/Province) as defined by appropriate government agency|S|||||||
|**157**|2010AC.N403|Postal Code|Code defining international postal zone code excluding punctuation and blanks (zip code for United States)|S|||||||
|**158**|2010AC.N404|Country Code|Code identifying the country|S|||||||
|**159**|2010AC.N407|Country Subdivision Code|Code identifying the country subdivision|S|||||||
|**160**|REF|Segment - REF Pay-to Plan Secondary Identification (Required)||R|||||||
|**161**|2010AC.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|||||||
|**162**|2010AC.REF02|Reference Identification|Reference information as specified<br>by the Reference Identification Qualifier|R|||||||
|**163**|REF|Segment - REF Pay-To Plan Tax Identification Number (Required)||R|||||||
|**164**|2010AC.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|EI : Employer’s Identification Number||||||
|**165**|2010AC.REF02|Reference Identification|Reference information as specified<br>by the Reference Identification Qualifier|R|||||||
|**166**|Loop 2000B — SUBSCRIBER HIERARCHICAL LEVEL  (Required)  Loop Repeat: >1 _(cs=10)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**167**|HL|Segment - HL Subscriber Hierarchical Level (Required)||R|||||||
| **168** | 2000B.HL01 | Hierarchical ID Number | A unique number assigned by the sender to identify a particular data segment in<br>a hierarchical structure | R | 2000A.HL01 + 1
<br>Incremented at each new HL segment. |  |  |  |  |  |
|**169**|2000B.HL02|Hierarchical Parent ID Number|Identification number of the next higher hierarchical data segment that the data<br>segment being described is subordinate to|R|2000A.HL01||||||
|**170**|2000B.HL03|Hierarchical Level Code|Code defining the characteristic of a level in a hierarchical structure|R|22 - Subscriber||||||
|**171**|2000B.HL04|Hierarchical Child Code|Code indicating if there are hierarchical child data segments subordinate to the<br>level being described.|R|0 :  HL04 has no subordinate levels  (the subscriber is the patient and there are no dependent claims)<br>1: HL04 has subordinate levels||||||
|**172**|SBR|Segment - SBR Subscriber Information (Required)||R|||||||
|**173**|2000B.SBR01|Payer Responsibility Sequence Number Code|Code identifying the insurance carrier’s level of responsibility for a payment of a<br>claim|R|P : Primary <br>S : Secondary <br>T  : Tertiary||||||
|**174**|2000B.SBR02|Individual Relationship Code|Code indicating the relationship between two individuals or entities|S|18 : Self||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/memberInformation/relationshipToSubscriberCode|Code indicating the member's relationship to the subscriber.||If 2000C.PAT  does not exist.|
|**175**|2000B.SBR03|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/subscriberInformation/groupNumber|Subscriber's group number|||
|**176**|2000B.SBR04|Name||S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/subscriberInformation/planName|Name of subscriber's plan|||
|**177**|2000B.SBR05|Insurance Type Code|Code identifying the type of insurance policy within a specific insurance program|S|12 :  Medicare Secondary Working Aged Beneficiary or<br>Spouse with Employer Group Health Plan<br>13 : Medicare Secondary End-Stage Renal Disease<br>Beneficiary in the Mandated Coordination Period<br>with an Employer’s Group Health Plan<br>14 : Medicare Secondary, No-fault Insurance including<br>Auto is Primary<br>15 : Medicare Secondary Worker’s Compensation<br>16 : Medicare Secondary Public Health Service (PHS)or<br>Other Federal Agency<br>41 : Medicare Secondary Black Lung<br>42 : Medicare Secondary Veteran’s Administration<br>43 : Medicare Secondary Disabled Beneficiary Under<br>Age 65 with Large Group Health Plan (LGHP)<br>47 : Medicare Secondary, Other Liability Insurance||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/insuranceTypeCode|The type of health insurance coverage appliable to this claim (for example, Medicare, Group Health Plan, etc.)|||
|**178**|2000B.SBR09|Claim Filing Indicator Code||S|11 : Other Non-Federal Programs<br>12 : Preferred Provider Organization (PPO)<br>13 : Point of Service (POS)<br>14 : Exclusive Provider Organization (EPO)<br>15 : Indemnity Insurance<br>16 : Health Maintenance Organization (HMO) Medicare<br>Risk<br>17 : Dental Maintenance Organization<br>AM :  Automobile Medical<br>BL :  Blue Cross/Blue Shield<br>CH :  Champus<br>CI :  Commercial Insurance Co.<br>DS :  Disability<br>FI :  Federal Employees Program<br>HM :  Health Maintenance Organization<br>LM :  Liability Medical<br>MA :  Medicare Part A<br>MB :  Medicare Part B<br>MC :  Medicaid<br>OF :  Other Federal Program<br>1484 Use code OF when submitting Medicare Part D<br>claims.<br>TV Title V<br>VA Veterans Affairs Plan<br>WC Workers’ Compensation Health Claim<br>ZZ Mutually Defined<br>71 Use Code ZZ when Type of Insurance is not known.||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/claimFilingCode|Claim filing idicator code, passthrough<br>from an external system.|||
|**179**|PAT|Segment - PAT Patient Information (Situational)||S|||||||
|**180**|2000B.PAT05|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|S|D8 : Date Expressed in Format CCYYMMDD||||||
|**181**|2000B.PAT06 _(rs=2)_|Date Time Period _(rs=2)_|Expression of a date, a time, or range of dates, times or dates and times / Patient Death Date _(rs=2)_|S _(rs=2)_|_(rs=2)_|_(rs=2)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/subscriberInformation/dateOfDeath||In the format YYYY-MM-DD||
|**182**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/memberInformation/dateOfDeath||In the format YYYY-MM-DD|If 2000C.PAT  does not exist.<br>|
|**183**|2000B.PAT07|Unit or Basis for Measurement Code|Code specifying the units in which a value is being expressed, or manner in which<br>a measurement has been taken|S|01 : Actual Pounds||||||
|**184**|2000B.PAT08 _(rs=2)_|Weight _(rs=2)_|Numeric value of weight _(rs=2)_|S _(rs=2)_|_(rs=2)_|_(rs=2)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/subscriberInformation/weight||||
|**185**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/memberInformation/weight|||If 2000C.PAT  does not exist.|
|**186**|2000B.PAT09 _(rs=2)_|Yes/No Condition or Response Code _(rs=2)_|Code indicating  whether the patient is pregnant or not pregnant. _(rs=2)_|S _(rs=2)_|Y :Yes _(rs=2)_|_(rs=2)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/subscriberInformation/pregnant||||
|**187**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecordprofessionalClaim/memberInformation/pregnant|||If 2000C.PAT  does not exist.|
|**188**|Loop2010BA — SUBSCRIBER NAME (Required) Loop Repeat: 1 (One instance of OtherInsuranceInformation will always carry the details from 2010BA Loop.) _(cs=10)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**189**|NM1|Segment - NM1 Subscriber Name (Required)||R|||||||
|**190**|2010BA.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R|IL :  Insured or Subscriber||||||
|**191**|2010BA.NM102|Entity Type Qualifier|Code qualifying the type of entity|R|1 : Person<br>2 : Non-Person Entity||||||
|**192**|2010BA.NM103 _(rs=5)_|Name Last or Organization Name _(rs=5)_|Individual last name or organizational name  _(rs=5)_|R _(rs=5)_|_(rs=5)_|_(rs=5)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/subscriberInformation/lastName|Subscriber Last Name|||
|**193**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/OtherInsuranceInformationList/OtherInsuranceInformation/lastname||||
|**194**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/memberInformation/lastName|Member Last Name||If 2010CA.NM1  does not exist.|
|**195**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/subscriberInformation/subscriberName|Subscriber's full name|Subscriber's full name concatenate NM103/5/4/7||
|**196**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/memberInformation/memberName|Subscriber's full name||If 2010CA.NM1  does not exist.|
|**197**|2010BA.NM104 _(rs=3)_|Name First _(rs=3)_|Individual first name  _(rs=3)_|S _(rs=3)_|_(rs=3)_|_(rs=3)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/subscriberInformation/firstName||||
|**198**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/OtherInsuranceInformationList/OtherInsuranceInformation/firstname||||
|**199**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/memberInformation/firstName|||If 2010CA.NM1  does not exist.|
|**200**|2010BA.NM105 _(rs=3)_|Name Middle _(rs=3)_|Individual middle name or initial  _(rs=3)_|S _(rs=3)_|_(rs=3)_|_(rs=3)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/subscriberInformation/middleName||||
|**201**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/OtherInsuranceInformationList/OtherInsuranceInformation/middlename||||
|**202**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/memberInformation/middleName|||If 2010CA.NM1  does not exist.|
|**203**|2010BA.NM107 _(rs=3)_|Name Suffix _(rs=3)_|Suffix to individual name  _(rs=3)_|S _(rs=3)_|_(rs=3)_|_(rs=3)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/subscriberInformation/nameSuffix||||
|**204**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/OtherInsuranceInformationList/OtherInsuranceInformation/suffix||||
|**205**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/memberInformation/nameSuffix|||If 2010CA.NM1  does not exist.|
|**206**|2010BA.NM108|Identification Code Qualifier|Code designating the system/method of code structure used for Identification<br>Code|S|II :  Standard Unique Health Identifier for each Individual in the United States<br>MI  :  Member Identification Number||||||
|**207**|2010BA.NM109 _(rs=3)_|Identification Code _(rs=3)_|Code identifying a party or other code / Subscriber Primary Identifier _(rs=3)_|S _(rs=3)_|_(rs=3)_|_(rs=3)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/submittedSubscriberId|<br><br>Submitted subscriber ID passed<br>through from external system.|||
|**208**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/subscriberInformation/subscriberIdentificationNumber|<br>Identification number of the subscribed individual. This number can be assigned by the Health Care Company, Medicare, or some other organization, and is used as part of the identification system in HealthRules|||
|**209**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/memberInformation/memberIdentificationNumber|<br><br>Member HCC ID|<br>Only 2000C Loop doesn't exist||
|**210**|N3|Segment - N3 Subscriber Address (Situational)||S|||||||
|**211**|2010BA.N301 _(rs=2)_|Address Information _(rs=2)_|Address Information _(rs=2)_|R _(rs=2)_|_(rs=2)_|4600 W 9TH AVE UNIT 216 _(rs=2)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/subscriberInformation/streetAddress|The first line of the street address.|||
|**212**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/memberInformation/streetAddress|The first line of the street address.||If 2010CA.N3  does not exist.|
|**213**|2010BA.N302|Address Information|Address Information|S|||||||
|**214**|N4|Segment - N4 Subscriber City, State, ZIP Code (Situational)||S|||||||
|**215**|2010BA.N401 _(rs=2)_|City Name _(rs=2)_|Free-form text for city name  _(rs=2)_|R _(rs=2)_|_(rs=2)_|DENVER _(rs=2)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/subscriberInformation/cityName|city|||
|**216**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/memberInformation/cityName|city||If 2010CA.N4  does not exist.|
|**217**|2010BA.N402 _(rs=2)_|State or Province Code _(rs=2)_|Code (Standard State/Province) as defined by appropriate government agency  _(rs=2)_|S _(rs=2)_|_(rs=2)_|CO _(rs=2)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/subscriberInformation/stateCode|State abbreviation|||
|**218**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/memberInformation/stateCode|State abbreviation||If 2010CA.N4  does not exist.|
|**219**|2010BA.N403 _(rs=2)_|Postal Code _(rs=2)_|Code defining international postal zone code excluding punctuation and blanks (zip code for United States)  _(rs=2)_|S _(rs=2)_|_(rs=2)_|802042991 _(rs=2)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/subscriberInformation/postalCode|zip code|||
|**220**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/memberInformation/postalCode|zip code||If 2010CA.N4  does not exist.|
|**221**|2010BA.N404 _(rs=2)_|Country Code _(rs=2)_|Code identifying the country  _(rs=2)_|S _(rs=2)_|_(rs=2)_|_(rs=2)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/subscriberInformation/countryCode|Country Code|Map to the value "US" if not present||
|**222**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/memberInformation/countryCode|CountryCode|Map to the value "US" if not present|If 2010CA.N4  does not exist.|
|**223**|2010BA.N407|Country Subdivision Code|Code identifying the country subdivision|S|||||||
|**224**|DMG|Segment - DMG Subscriber Demographic Information (Situational)||S|||||||
|**225**|2010BA.DMG01|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 :  Date Expressed in Format CCYYMMDD||||||
|**226**|2010BA.DMG02 _(rs=2)_|Date Time Period _(rs=2)_|Date Time Period _(rs=2)_|R _(rs=2)_|_(rs=2)_|19471120 _(rs=2)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/subscriberInformation/dateOfBirth|In the format YYYY-MM-DD<br><br>Subscriber's DOB.|In the format YYYY-MM-DD<br><br>||
|**227**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/memberInformation/dateOfBirth|In the format YYYY-MM-DD<br><br>Member's DOB.|<br><br>In the format YYYY-MM-DD<br><br>|If 2010CA.DMG  does not exist.<br><br>In the format YYYY-MM-DD<br><br>|
|**228**|2010BA.DMG03 _(rs=2)_|Gender Code _(rs=2)_|Code indicating the sex of the individual _(rs=2)_|R _(rs=2)_|F : Female<br>M : Male _(rs=2)_|_(rs=2)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/subscriberInformation/genderCode|<br><br>Subscriber's gender code|M=Male, F=Female, U=Unknown||
|**229**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/memberInformation/genderCode|<br><br>Member gender code|<br><br> M=Male, F=Female, U=Unknown|<br>If 2010CA.DMG  does not exist.<br><br> M=Male, F=Female, U=Unknown|
|**230**|REF|Segment - REF Subscriber Secondary Identification (Situational)||S|||||||
|**231**|2010BA.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|||||||
|**232**|2010BA.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier|R|||||||
|**233**|REF|Segment - REF Property and Casualty Claim Number (Situational)||S|||||||
|**234**|2010BA.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|||||||
|**235**|2010BA.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier|R|||||||
|**236**|PER|Segment - PER Property and Casualty Subscriber Contact Information (Situational)||S|||||||
|**237**|2010BA.PER01|Contact Function Code|Code identifying the major duty or responsibility of the person or group named|R|IC : Information Contact||||||
|**238**|2010BA.PER02|Name||S|||||||
|**239**|2010BA.PER03|Communication Number Qualifier|Code identifying the type of communication number|R|TE :  Telephone||||||
|**240**|2010BA.PER04 _(rs=6)_|Communication Number _(rs=6)_|_(rs=6)_|R _(rs=6)_|_(rs=6)_|_(rs=6)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/subscriberInformation/phoneCountryCode|<br>Phone Country Code|First byte  of 2010BA.PER04 Only If 2010BA.PER04  is 11 bytes||
|**241**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/subscriberInformation/phoneAreaCode|<br>phoneAreaCode|2nd, 3rd, 4th bytes  if  2010BA.PER04  is 11 bytes<br><br>First 3 bytes If 2010BA.PER04  is 10 bytes||
|**242**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/subscriberInformation/phoneNumber|<br>PhoneNumberType|last 7 bytes of 2010BA.PER04||
|**243**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/memberInformation/phoneCountryCode|<br>Phone Country Code|First byte  of 2010BA.PER04 Only If 2010BA.PER04  is 11 bytes|If Patient Loop(2000C.PAT)  does not exist.|
|**244**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/memberInformation/phoneAreaCode|<br>phoneAreaCode|2nd, 3rd, 4th bytes  if  2010BA.PER04  is 11 bytes<br><br>First 3 bytes If 2010BA.PER04  is 10 bytes|If Patient Loop(2000C.PAT)  does not exist.|
|**245**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/memberInformation/phoneNumber|<br>PhoneNumberType|last 7 bytes of 2010BA.PER04|If Patient Loop(2000C.PAT)  does not exist.|
|**246**|2010BA.PER05|Communication Number Qualifier|Code identifying the type of communication number|S|EX :  Telephone Extension||||||
|**247**|2010BA.PER06 _(rs=2)_|Communication Number _(rs=2)_|_(rs=2)_|S _(rs=2)_|_(rs=2)_|_(rs=2)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/subscriberInformation/phoneExtensionNumber|Telephone extension number. Theoretically of arbitrary length|||
|**248**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/memberInformation/phoneExtensionNumber|Telephone extension number. Theoretically of arbitrary length||If Patient Loop(2000C.PAT)  does not exist.|
|**249**|Loop 2010BB  — PAYER NAME (Required)  Loop Repeat: 1 _(cs=10)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**250**|NM1|Segment - NM1 Payer Name (Required)||R|||||||
|**251**|2010BB.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R|PR : Payer||||||
|**252**|2010BB.NM102|Entity Type Qualifier|Code qualifying the type of entity|R|2 : Non-Person Entity||||||
|**253**|2010BB.NM103|Name Last or Organization Name||R|||||||
|**254**|2010BB.NM108|Identification Code Qualifier|Code designating the system/method of code structure used for Identification<br>Code|R|PI :  Payor Identification<br>XV : Centers for Medicare and Medicaid Services PlanID||||||
|**255**|2010BB.NM109|Identification Code|Code identifying a party or other code / Payer Identifier|R|||||||
|**256**|N3|Segment - N3 Payer Address (Situational)||S|||||||
|**257**|2010BB.N301|Address Information|Address Information|R|||||||
|**258**|2010BB.N302|Address Information|Address Information|S|||||||
|**259**|N4|Segment - N4 Payer City, State, ZIP Code (Situational)||S|||||||
|**260**|2010BB.N401|City Name|Free-form text for city name|R|||||||
|**261**|2010BB.N402|State or Province Code|Code (Standard State/Province) as defined by appropriate government agency|S|||||||
|**262**|2010BB.N403|Postal Code|Code defining international postal zone code excluding punctuation and blanks (zip code for United States)|S|||||||
|**263**|2010BB.N404|Country Code|Code identifying the country|S|||||||
|**264**|2010BB.N407|Country Subdivision Code|Code identifying the country subdivision|S|||||||
|**265**|REF|Segment - REF Payer Secondary Identification (Situational)||S|||||||
|**266**|2010BB.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|2U : Payer Identification Number<br>EI :  Employer’s Identification Number||||||
|**267**|2010BB.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier|R|||||||
|**268**|REF|Segment - REF Billing Provider Secondary Identification (Situational)||S|||||||
|**269**|2010BB.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|||||||
|**270**|2010BB.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier|R|||||||
|**271**|Loop 2000C - Patient Hierarchical Level (Situational)   Loop Repeat: >1 <br>                In case of dependent claims (if  dependant is the patient ), Loop ID-2000C and Loop ID-2010CA are sent.<br>                When subscriber is the patient, Loop ID-2000C and Loop ID-2010CA are not sent. _(cs=10)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**272**|NM1|NM1 Patient Name (Required)||R|||||||
|**273**|2000C.HL01|Hierarchical ID Number|A unique number assigned by the sender to identify a particular data segment in<br>a hierarchical structure|R|||||||
|**274**|2000C.HL02|Hierarchical Parent ID Number|Identification number of the next higher hierarchical data segment that the data<br>segment being described is subordinate to|R|||||||
|**275**|2000C.HL03|Hierarchical Level Code|Code defining the characteristic of a level in a hierarchical structure|R|23 : Dependent (the information<br>in this HL applies to the patient when the subscriber<br>and the patient are not the same person)||||||
|**276**|2000C.HL04|Hierarchical Child Code|Code indicating if there are hierarchical child data segments subordinate to the<br>level being described|R|0 :  No Subordinate HL Segment in This Hierarchical<br>Structure||||||
|**277**|PAT|Patient information||R|||||||
|**278**|2000C.PAT01|Individual Relationship Code|Code indicating the relationship between two individuals or entities|R|01 : Spouse<br>19 : Child<br>20 : Employee<br>21 : Unknown<br>39 : Organ Donor<br>40:  Cadaver Donor<br>53:  Life Partner<br>G8 : Other Relationship||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/memberInformation/relationshipToSubscriberCode||||
|**279**|2000C.PAT05|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|S|D8 : Date Expressed in Format CCYYMMDD||||||
|**280**|2000C.PAT06|Date Time Period|Expression of a date, a time, or range of dates, times or dates and times / Patient Death Date|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/memberInformation/dateOfDeath||In the format YYYY-MM-DD||
|**281**|2000C.PAT07|Unit or Basis for Measurement Code|Code specifying the units in which a value is being expressed, or manner in which<br>a measurement has been taken|S|01 : Actual Pounds||||||
|**282**|2000C.PAT08|Weight|Numeric value of weight|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/memberInformation/weight||||
|**283**|2000C.PAT09|Yes/No Condition or Response Code|Code indicating  whether the patient is pregnant or not pregnant.|S|Y :Yes||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecordprofessionalClaim/memberInformation/pregnant||||
|**284**|Loop 2010CA - Patient Name (Situational) Loop Repeat: 1 _(cs=10)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**285**|NM1|Patient Name (Required)||R|||||||
|**286**|2010CA.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R|QC : Patient||||||
|**287**|2010CA.NM102|Entity Type Qualifier|Code qualifying the type of entity|R|1: Person||||||
|**288**|2010CA.NM103 _(rs=2)_|Name Last or Organization Name _(rs=2)_|Patient Last Name _(rs=2)_|R _(rs=2)_|_(rs=2)_|_(rs=2)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/memberInformation/lastName||||
|**289**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/memberInformation/memberName||concatenate NM103/5/4/7||
|**290**|2010CA.NM104|Name First|Patient First Name|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/memberInformation/firstName||||
|**291**|2010CA.NM105|Name Middle|Patient Middle Name or Initial|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/memberInformation/middleName||||
|**292**|2010CA.NM107|Name Suffix|Patient Name Suffix|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/memberInformation/nameSuffix||||
|**293**|N3|Segment - N3 Patient Address (Situational)||S|||||||
|**294**|2010CA.N301|Address Information|Patient Address Line|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/memberInformation/streetAddress||||
|**295**|2010CA.N302|Address Information|Patient Address Line|S|||||||
|**296**|N4|Segment - N4 Patient City, State, ZIP Code (Situational)||S|||||||
|**297**|2010CA.N401|City Name|Free-form text for city name|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/memberInformation/cityName||||
|**298**|2010CA.N402|State or Province Code|Code (Standard State/Province) as defined by appropriate government agency|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/memberInformation/stateCode||||
|**299**|2010CA.N403|Postal Code|Code defining international postal zone code excluding punctuation and blanks|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/memberInformation/postalCode||||
|**300**|2010CA.N404|Country Code|Code identifying the country|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/memberInformation/countryCode||Map to the value "US" if not present||
|**301**|2010CA.N407|Country Subdivision Code|Code identifying the country subdivision|S|||||||
|**302**|DMG|Segment - DMG Patient Demographic Information (Situational)||S|||||||
|**303**|2010CA.DMG01|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 : Date Expressed in Format CCYYMMDD||||||
|**304**|2010CA.DMG02|Date Time Period|Expression of a date, a time, or range of dates, times or dates and times/Patient Birth Date|R||19670712|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/memberInformation/dateOfBirth||In the format YYYY-MM-DD||
|**305**|2010CA.DMG03|Gender Code|Code indicating the sex of the individual|R|F: Female<br>M :Male<br>U : Unknown||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/memberInformation/genderCode||M=Male, F=Female, U=Unknown||
|**306**|REF|Segment - Property and Casuality Claim Number (Situational)||S|||||||
|**307**|2010CA.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|||||||
|**308**|2010CA.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier|R|||||||
|**309**|PER|Segment -Property and Casuality Patient Contact Information (Situational)||S|||||||
|**310**|2010CA.PER01|Contact Function Code|Code identifying the major duty or responsibility of the person or group named|R|IC :Information Contact||||||
|**311**|2010CA.PER02|Name|Free-form name|S|||||||
|**312**|2010CA.PER03|Communication Number Qualifier|Code identifying the type of communication number|R|TE :  Telephone||||||
|**313**|2010CA.PER04 _(rs=3)_|Communication Number _(rs=3)_|Complete communications number including country or area code when<br>applicable _(rs=3)_|R _(rs=3)_|_(rs=3)_|_(rs=3)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/memberInformation/phoneCountryCode|<br>Phone Country Code|First byte  of 2010CA.PER04 Only If 2010CA.PER04  is 11 bytes||
|**314**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/memberInformation/phoneAreaCode|<br>phoneAreaCode|2nd, 3rd, 4th bytes  if  2010CA.PER04  is 11 bytes<br><br>First 3 bytes If 2010CA.PER04  is 10 bytes||
|**315**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/memberInformation/phoneNumber|<br>PhoneNumberType|last 7 bytes of 2010CA.PER04||
|**316**|2010CA.PER05|Communication Number Qualifier|Code identifying the type of communication number|S|EX : Telephone Extension||||||
|**317**|2010CA.PER06|Communication Number|Complete communications number including country or area code when applicable|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/memberInformation/phoneExtensionNumber|Telephone extension number. Theoretically of arbitrary length|||
|**318**|Loop 2300  - CLAIM INFORMATION(Required)  Loop Repeat: 100<br>       When patient is the subscriber : The claim information(Loop ID-2300), is placed following Loop ID-2010BB in the Subscriber Hierarchical Level(HL) and patient information is sent in Loop ID-2010BA.<br>       When patient is the dependent :  The claim information(Loop ID-2300),is placed following Loop ID-2010CA  in the Patient HL and the patient information is sent in Loop ID-2010CA . _(cs=10)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**319**|CLM|Segment - CLM Claim information (Situational)||S|||||||
|**320**|2300.CLM01|Claim Submitter's Identifier|Identifier used to track a claim from creation by the health care provider through payment|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/memberInformation/accountNumber|Account Number of the patient|||
|**321**|2300.CLM02 _(rs=2)_|Monetary Amount _(rs=2)_|Monetary Amount _(rs=2)_|R _(rs=2)_|_(rs=2)_|_(rs=2)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/billedAmount|Billed Amount / COB related|Map only when 2320.CAS  is present||
|**322**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/totalPaymentDue/chargedAmount|Submitted Charges|||
|**323**|2300.CLM05.01|Facility Code Value|Code identifying where services were, or may be, performed /Place of Service Code|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/placeOfServiceCode||||
|**324**|2300.CLM05.02|Facility Code Qualifier|Code identifying the type of facility referenced|R|B :Place of Service Codes for Professional Services||||||
|**325**|2300.CLM05.03|Claim Frequency Type Code|Code specifying the frequency of the claim|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/frequencyCode|frequency Code (Trigger value for Void and Replace actions for the claim)|||
|**326**|2300.CLM06|Yes/No Condition or Response Code|Provider or Supplier Signature Indicator|R|Y : provider signature is on file<br>N : provider signature is not on file||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/providerSignature/name|Provider or Supplier Signature Indicator|Map only when CLM06 value is 'Y'||
|**327**|2300.CLM07|Provider Accept Assignment Code|Code indicating whether the provider accepts assignment|R|A : Assigned<br>B : Assignment Accepted on Clinical Lab Services Only<br>C :  Not Assigned||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/supplierInformationList/supplierInformation/assignmentAcceptance|Assignment accepted (Indicates whether or not payment assignment was accepted)|If 2300.CLM07 = “A”, Map “Y”<br>Else If 2300.CLM07  = “C”, Map “N”||
|**328**|2300.CLM08|Yes/No Condition or Response Code|Benefits Assignment Certification Indicator|R|Y : Yes<br>N : No<br>W :  Not Applicable||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/subscriberInformation/benefitAssignment|Benefits accepted (If true, indicates that benefit  assignment was accepted)|||
|**329**|2300.CLM09|Release of Information Code|Code indicating whether the provider has on file a signed statement by the patient<br>authorizing the release of medical data to other organizations|R|I : Informed Consent  to Release Medical Information for Conditions or Diagnoses <br>Y :Yes, Provider has a Signed Statement Permitting<br>Release of Medical Billing Data Related to a Claim||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/memberAuthorization/releaseAuthorization|Release Signature (Member authorization to release medical information)|||
|**330**|2300.CLM10|Patient Signature Source Code|Code indicating how the patient or subscriber authorization signatures were<br>obtained and how they are being retained by the provider|S|P :  Signature generated by provider because the patient was not physically present for services||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/memberAuthorization/insuredSignature|Provider Signature (Signature of the insured person)|||
|**331**|2300.CLM11.01 _(rs=3)_|Related-Causes Code _(rs=3)_|Code identifying an accompanying cause of an illness, injury or an accident _(rs=3)_|R _(rs=3)_|AA : Auto Accident<br>EM : Employment<br>OA : Other Accident _(rs=3)_|_(rs=3)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/conditionRelatedTo/memberEmployment|<br>Employment related indicator|Map Y when value =EM||
|**332**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/conditionRelatedTo/autoAccident|<br>Auto Accident indicator|Map Y when value =AA||
|**333**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/conditionRelatedTo/otherAccident|<br>Other accodent indicator<br>|Map Y when value =OA||
|**334**|2300.CLM11.02 _(rs=3)_|Related-Causes Code _(rs=3)_|Code identifying an accompanying cause of an illness, injury or an accident (when more than one related cause code applies) _(rs=3)_|S _(rs=3)_|AA : Auto Accident<br>EM : Employment<br>OA : Other Accident _(rs=3)_|_(rs=3)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/conditionRelatedTo/memberEmployment|<br>Employment related indicator|Map Y when value =EM||
|**335**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/conditionRelatedTo/autoAccident|<br>Auto Accident indicator|Map Y when value =AA||
|**336**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/conditionRelatedTo/otherAccident|<br>Other accodent indicator|Map Y when value =OA||
|**337**|2300.CLM11.04|State or Province Code|Code (Standard State/Province) as defined by appropriate government<br>agency|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/conditionRelatedTo/autoAccidentStateCode|Accident State (If member condition is related to an auto accident, the state in which the accident occurred)|||
|**338**|2300.CLM11.05|Country Code|Country Code|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/conditionRelatedTo/autoAccidentCountryCode|Accident Country (If member condition is related to an auto accident, the country in which the accident occurred)|Map to the value "US" if not present||
|**339**|2300.CLM12|Special Program Code||S|||||||
|**340**|2300.CLM20|Delay Reason Code||S|||||||
|**341**|DTP|Segment - DTP Date - Onset of Current Illness or Symptom (Situational)||S|||||||
|**342**|2300.DTP01|Date/Time Qualifier|Code specifying type of date or time, or both date and time|R|431 :Onset of Current Symptoms or Illness||||||
|**343**|2300.DTP02|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 :  Date Expressed in Format CCYYMMDD||||||
|**344**|2300.DTP03|Date Time Period|Date Time Period|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/memberCurrentConditionDate|Date of condition's first occurrence|In the format YYYY-MM-DD<br>||
|**345**|DTP|Segment - DTP Date - Initial Treatment Date (Situational)||S|||||||
|**346**|2300.DTP01|Date/Time Qualifier|Code specifying type of date or time, or both date and time|R|454 : Initial Treatment||||||
|**347**|2300.DTP02|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 :  Date Expressed in Format CCYYMMDD||||||
|**348**|2300.DTP03|Date Time Period|Date Time Period|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/priorIllnessInformation/startDate|<br>Date on which the prior illness started|In the format YYYY-MM-DD<br>||
|**349**|DTP|Segment - DTP Date - Last Seen Date (Situational)||S|||||||
|**350**|2300.DTP01|Date/Time Qualifier|Code specifying type of date or time, or both date and time|R|304: Latest Visit or Consultation||||||
|**351**|2300.DTP02|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 :  Date Expressed in Format CCYYMMDD||||||
|**352**|2300.DTP03|Date Time Period|Date Time Period|R|||||||
|**353**|DTP|Segment - DTP Date - Acute Manifestation (Situational)||S|||||||
|**354**|2300.DTP01|Date/Time Qualifier|Code specifying type of date or time, or both date and time|R|453: Acute Manifestation of a Chronic Condition||||||
|**355**|2300.DTP02|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 :  Date Expressed in Format CCYYMMDD||||||
|**356**|2300.DTP03|Date Time Period|Date Time Period|R|||||||
|**357**|DTP|Segment - DTP Date - Accident (Situational)||S|||||||
|**358**|2300.DTP01|Date/Time Qualifier|Code specifying type of date or time, or both date and time|R|439: Accident||||||
|**359**|2300.DTP02|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 :  Date Expressed in Format CCYYMMDD||||||
|**360**|2300.DTP03|Date Time Period|Date Time Period|R|||||||
|**361**|DTP|Segment - DTP Date - Last Menstrual Period (Situational)||S|||||||
|**362**|2300.DTP01|Date/Time Qualifier|Code specifying type of date or time, or both date and time|R|484:  Last Menstrual Period||||||
|**363**|2300.DTP02|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 :  Date Expressed in Format CCYYMMDD||||||
|**364**|2300.DTP03|Date Time Period|Date Time Period|R|||||||
|**365**|DTP|Segment - DTP Date - Last X-ray Date (Situational)||S|||||||
|**366**|2300.DTP01|Date/Time Qualifier|Code specifying type of date or time, or both date and time|R|455: Last X-Ray||||||
|**367**|2300.DTP02|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 :  Date Expressed in Format CCYYMMDD||||||
|**368**|2300.DTP03|Date Time Period|Date Time Period|R|||||||
|**369**|DTP|Segment - DTP Date - Hearing and Vision Prescription Date (Situational)||S|||||||
|**370**|2300.DTP01|Date/Time Qualifier|Code specifying type of date or time, or both date and time|R|471: Prescription||||||
|**371**|2300.DTP02|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 :  Date Expressed in Format CCYYMMDD||||||
|**372**|2300.DTP03|Date Time Period|Date Time Period|R|||||||
|**373**|DTP|Segment - DTP Date - Disability Dates (Situational)||S|||||||
|**374**|2300.DTP01|Date/Time Qualifier|Code specifying type of date or time, or both date and time|R|314 : Disability ( when both disability start and end date are being reported)<br>360 :  Initial Disability Period Start (if patient is currently disabled and<br>disability end date is unknown.)<br>361 : Initial Disability Period End ( if patient is no longer disabled and the)<br>start date is unknown||||||
|**375**|2300.DTP02|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 :  Date Expressed in Format CCYYMMDD<br>RD8 :  Range of Dates Expressed in Format CCYYMMDDCCYYMMDD||||||
|**376**|2300.DTP03 _(rs=2)_|Date Time Period _(rs=2)_|Date Time Period _(rs=2)_|R _(rs=2)_|_(rs=2)_|_(rs=2)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/unableToWorkInOccupation/startDate|<br>If the member is unable to work at their occupation, the start date for that condition|When DTP01=314, DTP03 will be in RD8 format. Map the first CCYYMMDD in the format YYYY-MM-DD. <br>When DTP01 = 360, Map DTP03 In the format YYYY-MM-DD.||
|**377**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/unableToWorkInOccupation/endDate|<br>If the member is unable to work at their occupation, the end date for that condition<br>|When DTP01=314, DTP03 will be in CCYYMMDD-CCYYMMDD format. Map the second CCYYMMDD in the format YYYY-MM-DD. <br>When DTP01 = 361, Map DTP03 In the format YYYY-MM-DD.||
|**378**|DTP|Segment - DTP Date - Last Worked (Situational)||S|||||||
|**379**|2300.DTP01|Date/Time Qualifier|Code specifying type of date or time, or both date and time|R|297 : Initial Disability Period Last Day Worked||||||
|**380**|2300.DTP02|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 :  Date Expressed in Format CCYYMMDD||||||
|**381**|2300.DTP03|Date Time Period|Date Time Period|R|||||||
|**382**|DTP|Segment - DTP Date - Authorized Return to Work (Situational)||S|||||||
|**383**|2300.DTP01|Date/Time Qualifier|Code specifying type of date or time, or both date and time|R|296 : Initial Disability Period Last Day Worked||||||
|**384**|2300.DTP02|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 :  Date Expressed in Format CCYYMMDD||||||
|**385**|2300.DTP03|Date Time Period|Date Time Period|R|||||||
|**386**|DTP|Segment - DTP Date - Admission (Situational)||S|||||||
|**387**|2300.DTP01|Date/Time Qualifier|Code specifying type of date or time, or both date and time|R|435 : Admission||||||
|**388**|2300.DTP02|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 : Date Expressed in Format CCYYMMDD||||||
|**389**|2300.DTP03|Date Time Period|Date Time Period|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/currentServiceHospitalization/startDate|<br>The start date for the hospital stay if the current service involved hospitalization<br>|In the format YYYY-MM-DD||
|**390**|DTP|Segment - DTP Date - Discharge (Situational)||S|||||||
|**391**|2300.DTP01|Date/Time Qualifier|Code specifying type of date or time, or both date and time|R|096 : Discharge||||||
|**392**|2300.DTP02|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 : Date Expressed in Format CCYYMMDD||||||
|**393**|2300.DTP03|Date Time Period|Date Time Period|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/currentServiceHospitalization/endDate|<br>The end date for the hospital stay if the current service involved hospitalization|In the format YYYY-MM-DD||
|**394**|DTP|Segment - DTP Date - Assumed and Relinquished Care Dates (Situational)||S|||||||
|**395**|2300.DTP01|Date/Time Qualifier|Code specifying type of date or time, or both date and time|R|090 :  Report Start||||||
|**396**|2300.DTP02|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 : Date Expressed in Format CCYYMMDD||||||
|**397**|2300.DTP03|Date Time Period|Date Time Period|R|||||||
|**398**|DTP|Segment - DTP Date - Property and Casualty Date of First Contact (Situational)||S|||||||
|**399**|2300.DTP01|Date/Time Qualifier|Code specifying type of date or time, or both date and time|R|096 :  First Visit or Consultation||||||
|**400**|2300.DTP02|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 : Date Expressed in Format CCYYMMDD||||||
|**401**|2300.DTP03|Date Time Period|Date Time Period|R|||||||
|**402**|DTP|Segment - DTP Date - Repricer Received Date (Situational)||S|||||||
|**403**|2300.DTP01|Date/Time Qualifier|Code specifying type of date or time, or both date and time|R|050 :  Received||||||
|**404**|2300.DTP02|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 : Date Expressed in Format CCYYMMDD||||||
|**405**|2300.DTP03|Date Time Period|Date Time Period|R|||||||
|**406**|PWK|Segment - PWK Claim Supplemental Information (Situational)||S|||||||
|**407**|2300.PWK01 _(rs=2)_|Report Type Code _(rs=2)_|Code indicating the title or contents of a document, report or supporting item _(rs=2)_|R _(rs=2)_|03 Report Justifying Treatment Beyond UtilizationGuidelines<br>04 Drugs Administered<br>05 Treatment Diagnosis<br>06 Initial Assessment<br>07 Functional Goals<br>08 Plan of Treatment<br>09 Progress Report<br>10 Continued Treatment<br>11 Chemical Analysis<br>13 Certified Test Report<br>15 Justification for Admission<br>21 Recovery Plan<br>A3 Allergies/Sensitivities Document<br>A4 Autopsy Report<br>AM Ambulance Certification<br>AS Admission Summary<br>B2 Prescription<br>B3 Physician Order<br>B4 Referral Form<br>BR Benchmark Testing Results<br>BS Baseline<br>BT Blanket Test Results<br>CB Chiropractic Justification<br>CK Consent Form(s)<br>CT Certification<br>D2 Drug Profile Document<br>DA Dental Models<br>DB Durable Medical Equipment Prescription<br>DG Diagnostic Report<br>DJ Discharge Monitoring Report<br>DS Discharge Summary<br>EB Explanation of Benefits (Coordination of Benefits or<br>Medicare Secondary Payor)<br>HC Health Certificate<br>HR Health Clinic Records<br>I5 Immunization Record<br>ASC X12N • INSURANCE SUBCOMMITTEE 005010X222 • 837 • 2300 • PWK<br>TECHNICAL REPORT • TYPE 3 CLAIM SUPPLEMENTAL INFORMATION<br>MAY 2006 183<br>IR State School Immunization Records<br>LA Laboratory Results<br>M1 Medical Record Attachment<br>MT Models<br>NN Nursing Notes<br>OB Operative Note<br>OC Oxygen Content Averaging Report<br>OD Orders and Treatments Document<br>OE Objective Physical Examination (including vital<br>signs) Document<br>OX Oxygen Therapy Certification<br>OZ Support Data for Claim<br>P4 Pathology Report<br>P5 Patient Medical History Document<br>PE Parenteral or Enteral Certification<br>PN Physical Therapy Notes<br>PO Prosthetics or Orthotic Certification<br>PQ Paramedical Results<br>PY Physician’s Report<br>PZ Physical Therapy Certification<br>RB Radiology Films<br>RR Radiology Reports<br>RT Report of Tests and Analysis Report<br>RX Renewable Oxygen Content Averaging Report<br>SG Symptoms Document<br>V5 Death Notification<br>XP Photographs _(rs=2)_|_(rs=2)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/attachmentCodeCode/codeEntry|Attachment Type like Prescription|/codeEntry is mapped from 2300.PWK01<br>Please refer crosswalk sheet||
|**408**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/attachmentCodeCode/codeSetName|AttachmentTypeCode<br>Internal field for fetching the Attachment type|/codeSetName will be  hardcoded as AttachmentTypeCode.<br>Please refer crosswalk sheet||
|**409**|2300.PWK02|Report Transmission Code|Code defining timing, transmission method or format by which reports are to be<br>sent|R|AA : Available on Request at Provider Site<br>BM : By Mail<br>EL : Electronically Only<br>EM : E-Mail<br>FT : File Transfer<br>FX : By Fax||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/transmissionType|Attachment transmission mode|If "AA" Map "Available on Request at Provider Site"<br>If "BM" Map "By Mail"<br>If "EL" Map "Electronically Only"<br>If "EM" Map "E-Mail"<br>If "FT" Map "File Transfer"<br>If "FX" Map "By Fax"|Needs review with configuration team|
|**410**|2300.PWK05|Identification Code Qualifier|Code identifying a party or other code|S|AC:  Attachment Control Number||||||
|**411**|2300.PWK06 _(rs=2)_|Identification Code _(rs=2)_|Attachment Control Number. Used to identify the attached electronic documentation.The number in PWK06 is carried in the TRN of the electronic attachment _(rs=2)_|S _(rs=2)_|_(rs=2)_|_(rs=2)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/attachmentSetReference/ID|Attachment Control number|Map only the first occurence of PWK||
|**412**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/attachmentComment|<br>Attachment control number. Static URL to be prefixed for loading the image|||
|**413**|CN1|Segment - CN1 Contract Information (Situational)|||||||||
|**414**|2300.CN101|Contract Type Code|Code identifying a contract type|R|01 : Diagnosis Related Group (DRG)<br>02 : Per Diem<br>03 : Variable Per Diem<br>04 : Flat<br>05 : Capitated<br>06 : Percent<br>09 : Other||||||
|**415**|2300.CN102|Monetary Amount|Contract Amount|S|||||||
|**416**|2300.CN103|Percent, Decimal Format|Contract Percentage|S|||||||
|**417**|2300.CN104|Reference Identification|Contract Code|S|||||||
|**418**|2300.CN105|Terms Discount Percent|Terms discount percentage, expressed as a percent, available to the purchaser if<br>an invoice is paid on or before the Terms Discount Due Date|S|||||||
|**419**|2300.CN106|Version Identifier|Contract Version Identifier|S|||||||
|**420**|AMT|Segment - AMT Patient Amount Paid (Situational)|||||||||
|**421**|2300.AMT01|Amount Qualifier Code|Code to qualify amount|R|F5 : Patient Amount Paid||||||
|**422**|2300.AMT02|Monetary Amount|Patient Amount Paid|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/totalPaymentDue/receivedAmount|Paid Amount|||
|**423**|REF|Segment - REF Service Authorization Exception Code (Situational)|||||||||
|**424**|2300.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|4N :  Special Payment Reference Number||||||
|**425**|2300.REF02|Reference Identification|Service Authorization Exception Code|R|||||||
|**426**|REF|Segment - REF Mandatory Medicare (Section 4081) Crossover Indicator (Situational)|||||||||
|**427**|2300.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|F5 : Medicare Version Code||||||
|**428**|2300.REF02|Reference Identification|Medicare Section 4081 Indicator|R|Y : 4081<br>N : Regular crossover||||||
|**429**|REF|Segment - REF Mammography Certification Number (Situational)|||||||||
|**430**|2300.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|EW:  Mammography Certification Number||||||
|**431**|2300.REF02|Reference Identification|Mammography Certification Number|R|||||||
|**432**|REF|Segment - REF Referral Number (Situational)|||||||||
|**433**|2300.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|9F :  Referral Number||||||
|**434**|2300.REF02|Reference Identification|Referral Number|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/referringPractitionerInformation/referralNumber|Referral Number of Referring Practitioner|||
|**435**|REF|Segment - REF Prior Authorization (Situational)|||||||||
|**436**|2300.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|G1 : Prior Authorization Number||||||
|**437**|2300.REF02|Reference Identification|Prior Authorization Number|R|||||||
|**438**|REF|Segment - REF Payer Claim Control Number (Situational)|||||||||
|**439**|2300.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|F8 : Original Reference Number||||||
|**440**|2300.REF02 _(rs=2)_|Reference Identification _(rs=2)_|Payer Claim Control Number _(rs=2)_|R _(rs=2)_|_(rs=2)_|_(rs=2)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/hccClaimNumber|Original Claim ID<br> Claim ID (Unique identifier assigned to the supplier invoice )<br>HccClaimNumberType|<br>Map only for void/replacement claims (2300.CLM05.03 = '7' or '8'||
|**441**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/medicaidResubmission/originalReferenceNumber|If a resubmission, the original reference number|<br>Map only for void/replacement claims (2300.CLM05.03 = '7' or '8'||
|**442**|REF|Segment - REF Clinical Laboratory Improvement Amendment (CLIA) Number (Situational)|||||||||
|**443**|2300.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|X4 : Clinical Laboratory Improvement Amendment<br>Number||||||
|**444**|2300.REF02|Reference Identification|Clinical Laboratory Improvement Amendment Number|R|||||||
|**445**|REF|Segment - REF Repriced Claim Number (Situational)|||||||||
|**446**|2300.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|9A : Repriced Claim Reference Number||||||
|**447**|2300.REF02|Reference Identification|Repriced Claim Reference Number|R|||||||
|**448**|REF|Segment - REF Adjusted Repriced Claim Number (Situational)|||||||||
|**449**|2300.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|9C :  Adjusted Repriced Claim Reference Number||||||
|**450**|2300.REF02|Reference Identification|Adjusted Repriced Claim Reference Number|R|||||||
|**451**|REF|Segment - REF Investigational Device Exemption Number (Situational)|||||||||
|**452**|2300.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|LX : Qualified Products List||||||
|**453**|2300.REF02|Reference Identification|Investigational Device Exemption Identifier|R|||||||
|**454**|REF|Segment - REF Claim Identification For Transmission Intermediaries (Situational)|||||||||
|**455**|2300.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|D9 : Claim Number||||||
|**456**|2300.REF02|Reference Identification|Value Added Network Trace Number|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/clearingHouseTraceNumber|Clearing house trace number|||
|**457**|REF|Segment - REF Medical Record Number (Situational)|||||||||
|**458**|2300.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|EA :  Medical Record Identification Number||||||
|**459**|2300.REF02|Reference Identification|Value Added Network Trace Number|R|||||||
|**460**|REF|Segment - REF Demonstration Project Identifier (Situational)|||||||||
|**461**|2300.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|P4 :   Project Code||||||
|**462**|2300.REF02|Reference Identification|Value Added Network Trace Number|R|||||||
|**463**|K3|Segment - K3 File Information (Situational)|||||||||
|**464**|2300.K301|Fixed Format Information|Data in fixed format agreed upon by sender and receiver|R|||||||
|**465**|NTE|Segment - NTE Claim Note (Situational)|||||||||
|**466**|2300.NTE01|Note Reference Code|Code identifying the functional area or purpose for which the note applies|R|ADD Additional Information||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/professionalRemarks/remarkCode||||
|**467**|2300.NTE02|Description|A free-form description to clarify the related data elements and their content  /  Claim Note Text|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/professionalRemarks/remarks/remark|Contains general remarks related to the claim|||
|**468**|CR1|Segment - CR1 Ambulance Transport Information (Situational)|||||||||
|**469**|2300.CR101|Unit or Basis for Measurement Code|Code specifying the units in which a value is being expressed, or manner in which<br>a measurement has been taken|S|ZZ Mutually Defined||||||
|**470**|2300.CR102|Weight|Patient Weight|S|N No<br>650 If no, then choose “NU” in CRC03 indicating no<br>referral given.<br>Y Yes||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/ambulanceInformationList/ambulanceInformation/patientWeight|Patient Weight|||
|**471**|2300.CR104|Ambulance Transport Reason Code|Code indicating the reason for ambulance transport|R|A : Patient was transported to nearest facility<br>B : Patient was transported for the benefit of a preferred physician<br>C : Patient was transported for the nearness of family members<br>D : Patient was transported for the care of a specialist<br>E : Patient Transferred to Rehabilitation Facility||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/ambulanceInformationList/ambulanceInformation/transportReasonCode|Transport Reason|||
|**472**|2300.CR105|Unit or Basis for Measurement Code|Code specifying the units in which a value is being expressed, or manner in which a measurement has been taken|R|DH : Miles||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/ambulanceInformationList/ambulanceInformation/transportUnitTypeCode|Transport Unit Type|||
|**473**|2300.CR106|Quantity|Transport Distance|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/ambulanceInformationList/ambulanceInformation/transportValueCount|Transport Value|||
|**474**|2300.CR109|Description|Round Trip Purpose Description. Required when the ambulance service is for a round<br>trip.|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/ambulanceInformationList/ambulanceInformation/roundTripPurpose|Round Trip Purpose|||
|**475**|2300.CR110|Description|Stretcher Purpose Description|S|||||||
|**476**|CR2|Segment - CR2 Spinal Manipulation Service Information (Situational)|||||||||
|**477**|2300.CR208|Nature of Condition Code|Code indicating the nature of a patient’s condition|R|||||||
|**478**|2300.CR210|Description|Patient Condition Description|S|||||||
|**479**|2300.CR211|Description|Patient Condition Description|S|||||||
|**480**|CRC|Segment - CRC Ambulance Certification (Situational)|||||||||
|**481**|2300.CRC01|Code Category|Specifies the situation or category to which the code applies|R|07 : Ambulance Certification||||||
|**482**|2300.CRC02|Yes/No Condition or Response Code|Certification Condition Indicator|R|Y : Yes<br>N : No<br>||||||
|**483**|2300.CRC03|Condition Indicator|Code indicating a condition|R|01 : Patient was admitted to a hospital<br>04 : Patient was moved by stretcher<br>05 : Patient was unconscious or in shock<br>06 : Patient was transported in an emergency situation<br>07 : Patient had to be physically restrained<br>08 : Patient had visible hemorrhaging<br>09 : Ambulance service was medically necessary<br>12 : Patient is confined to a bed or chair||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/ambulanceInformationList/ambulanceInformation/conditionIndicators/conditionCode|Condition code|||
|**484**|2300.CRC04|Condition Indicator|Code indicating a condition when a second condition code is necessary|S|01 : Patient was admitted to a hospital<br>04 : Patient was moved by stretcher<br>05 : Patient was unconscious or in shock<br>06 : Patient was transported in an emergency situation<br>07 : Patient had to be physically restrained<br>08 : Patient had visible hemorrhaging<br>09 : Ambulance service was medically necessary<br>12 : Patient is confined to a bed or chair||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/ambulanceInformationList/ambulanceInformation/conditionIndicators/conditionCode|Condition code|||
|**485**|2300.CRC05|Condition Indicator|Code indicating a condition when a third condition code is necessary|S|01 : Patient was admitted to a hospital<br>04 : Patient was moved by stretcher<br>05 : Patient was unconscious or in shock<br>06 : Patient was transported in an emergency situation<br>07 : Patient had to be physically restrained<br>08 : Patient had visible hemorrhaging<br>09 : Ambulance service was medically necessary<br>12 : Patient is confined to a bed or chair||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/ambulanceInformationList/ambulanceInformation/conditionIndicators/conditionCode|Condition code|||
|**486**|2300.CRC06|Condition Indicator|Code indicating a condition when a fourth condition code is necessary|S|01 : Patient was admitted to a hospital<br>04 : Patient was moved by stretcher<br>05 : Patient was unconscious or in shock<br>06 : Patient was transported in an emergency situation<br>07 : Patient had to be physically restrained<br>08 : Patient had visible hemorrhaging<br>09 : Ambulance service was medically necessary<br>12 : Patient is confined to a bed or chair||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/ambulanceInformationList/ambulanceInformation/conditionIndicators/conditionCode|Condition code|||
|**487**|2300.CRC07|Condition Indicator|Code indicating a condition when a fifth condition code is necessary|S|01 : Patient was admitted to a hospital<br>04 : Patient was moved by stretcher<br>05 : Patient was unconscious or in shock<br>06 : Patient was transported in an emergency situation<br>07 : Patient had to be physically restrained<br>08 : Patient had visible hemorrhaging<br>09 : Ambulance service was medically necessary<br>12 : Patient is confined to a bed or chair||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/ambulanceInformationList/ambulanceInformation/conditionIndicators/conditionCode|Condition code|||
|**488**|CRC|Segment - CRC Patient Condition Information: Vision (Situational)|||||||||
|**489**|2300.CRC01|Code Category|Specifies the situation or category to which the code applies|R|E1 : Spectacle Lenses<br>E2 : Contact Lenses<br>E3 : Spectacle Frames||||||
|**490**|2300.CRC02|Yes/No Condition or Response Code|Certification Condition Indicator|R|Y : Yes<br>N : No<br>||||||
|**491**|2300.CRC03|Condition Indicator|Code indicating a condition|R|L1 : General Standard of 20 Degree or .5 Diopter Sphere or Cylinder Change Met <br>L2 : Replacement Due to Loss or Theft L3 : Replacement Due to Breakage or Damage <br>L4 : Replacement Due to Patient Preference<br> L5 : Replacement Due to Medical Reason||||||
|**492**|2300.CRC04|Condition Indicator|Code indicating a condition|S|||||||
|**493**|2300.CRC05|Condition Indicator|Code indicating a condition|S|||||||
|**494**|2300.CRC06|Condition Indicator|Code indicating a condition|S|||||||
|**495**|2300.CRC07|Condition Indicator|Code indicating a condition|S|||||||
|**496**|CRC|Segment - CRC Homebound Indicator (Situational)|||||||||
|**497**|2300.CRC01|Code Category|Specifies the situation or category to which the code applies|R|75 :  Functional Limitations||||||
|**498**|2300.CRC02|Yes/No Condition or Response Code|Code indicating a Yes or No condition or response|R|Y :Yes||||||
|**499**|2300.CRC03|Condition Indicator|Code indicating a condition|R|IH : Independent at Home||||||
|**500**|CRC|Segment - CRC EPSDT Referral (Situational)|||||||||
|**501**|2300.CRC01|Code Category|Specifies the situation or category to which the code applies|R|ZZ : Mutually Defined||||||
|**502**|2300.CRC02|Yes/No Condition or Response Code|Code indicating a Yes or No condition or response|R|Y : Yes<br>N : No<br>||||||
|**503**|2300.CRC03|Condition Indicator|Code indicating a condition|R|AV : Available - Not Used<br>NU :Not Used<br>S2 :Under Treatment<br>ST :New Services Requested||||||
|**504**|2300.CRC04|Condition Indicator|Code indicating a condition|S|||||||
|**505**|2300.CRC05|Condition Indicator|Code indicating a condition|S|||||||
|**506**|HI|Segment - HEALTH CARE DIAGNOSIS CODE (Required)|||||||||
|**507**|2300.HI01.01|Code List Qualifier Code|Code identifying a specific industry code list/ Principal Diagnosis Type Code|R|ABK : ICD10 -CM - Principal Diagnosis<br>BK : ICD9 -CM - Principal Diagnosis||||||
|**508**|2300.HI01.02|Industry Code|Code indicating a code from a specific industry code list/Principal Diagnosis Code|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/diagnosisCodes/diagnosisCode|Diagnosis code|<br>If we get more than 3 digits, should add a dot (.)after 3rd Character||
|**509**|2300.HI02.01|Code List Qualifier Code|Diagnosis Type Code|R|ABF : ICD10 -CM -  Diagnosis<br>BF : ICD9 -CM -  Diagnosis||||||
|**510**|2300.HI02.02|Industry Code|Diagnosis Code|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/diagnosisCodes/diagnosisCode|Diagnosis code|<br>If we get more than 3 digits, should add a dot (.)after 3rd Character||
|**511**|2300.HI03.01|Code List Qualifier Code|Diagnosis Type Code (Required when it is necessary to report an additional<br>diagnosis and the preceding HI data elements have been used to<br>report other diagnoses)|R|ABF : ICD10 -CM -  Diagnosis<br>BF : ICD9 -CM -  Diagnosis||||||
|**512**|2300.HI03.02|Industry Code|Diagnosis Code|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/diagnosisCodes/diagnosisCode|Diagnosis code|<br>If we get more than 3 digits, should add a dot (.)after 3rd Character||
|**513**|2300.HI04.01|Code List Qualifier Code|Diagnosis Type Code (Required when it is necessary to report an additional<br>diagnosis and the preceding HI data elements have been used to<br>report other diagnoses)|R|ABF : ICD10 -CM -  Diagnosis<br>BF : ICD9 -CM -  Diagnosis||||||
|**514**|2300.HI04.02|Industry Code|Diagnosis Code|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/diagnosisCodes/diagnosisCode|Diagnosis code|<br>If we get more than 3 digits, should add a dot (.)after 3rd Character||
|**515**|2300.HI05.01|Code List Qualifier Code|Diagnosis Type Code (Required when it is necessary to report an additional<br>diagnosis and the preceding HI data elements have been used to<br>report other diagnoses)|R|ABF : ICD10 -CM -  Diagnosis<br>BF : ICD9 -CM -  Diagnosis||||||
|**516**|2300.HI05.02|Industry Code|Diagnosis Code|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/diagnosisCodes/diagnosisCode|Diagnosis code|<br>If we get more than 3 digits, should add a dot (.)after 3rd Character||
|**517**|2300.HI06.01|Code List Qualifier Code|Diagnosis Type Code (Required when it is necessary to report an additional<br>diagnosis and the preceding HI data elements have been used to<br>report other diagnoses)|R|ABF : ICD10 -CM -  Diagnosis<br>BF : ICD9 -CM -  Diagnosis||||||
|**518**|2300.HI06.02|Industry Code|Diagnosis Code|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/diagnosisCodes/diagnosisCode|Diagnosis code|<br>If we get more than 3 digits, should add a dot (.)after 3rd Character||
|**519**|2300.HI07.01|Code List Qualifier Code|Diagnosis Type Code (Required when it is necessary to report an additional<br>diagnosis and the preceding HI data elements have been used to<br>report other diagnoses)|R|ABF : ICD10 -CM -  Diagnosis<br>BF : ICD9 -CM -  Diagnosis||||||
|**520**|2300.HI07.02|Industry Code|Diagnosis Code|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/diagnosisCodes/diagnosisCode|Diagnosis code|<br>If we get more than 3 digits, should add a dot (.)after 3rd Character||
|**521**|2300.HI08.01|Code List Qualifier Code|Diagnosis Type Code (Required when it is necessary to report an additional<br>diagnosis and the preceding HI data elements have been used to<br>report other diagnoses)|R|ABF : ICD10 -CM -  Diagnosis<br>BF : ICD9 -CM -  Diagnosis||||||
|**522**|2300.HI08.02|Industry Code|Diagnosis Code|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/diagnosisCodes/diagnosisCode|Diagnosis code|<br>If we get more than 3 digits, should add a dot (.)after 3rd Character||
|**523**|2300.HI09.01|Code List Qualifier Code|Diagnosis Type Code (Required when it is necessary to report an additional<br>diagnosis and the preceding HI data elements have been used to<br>report other diagnoses)|R|ABF : ICD10 -CM -  Diagnosis<br>BF : ICD9 -CM -  Diagnosis||||||
|**524**|2300.HI09.02|Industry Code|Diagnosis Code|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/diagnosisCodes/diagnosisCode|Diagnosis code|<br>If we get more than 3 digits, should add a dot (.)after 3rd Character||
|**525**|2300.HI10.01|Code List Qualifier Code|Diagnosis Type Code (Required when it is necessary to report an additional<br>diagnosis and the preceding HI data elements have been used to<br>report other diagnoses)|R|ABF : ICD10 -CM -  Diagnosis<br>BF : ICD9 -CM -  Diagnosis||||||
|**526**|2300.HI10.02|Industry Code|Diagnosis Code|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/diagnosisCodes/diagnosisCode|Diagnosis code|<br>If we get more than 3 digits, should add a dot (.)after 3rd Character||
|**527**|2300.HI11.01|Code List Qualifier Code|Diagnosis Type Code (Required when it is necessary to report an additional<br>diagnosis and the preceding HI data elements have been used to<br>report other diagnoses)|R|ABF : ICD10 -CM -  Diagnosis<br>BF : ICD9 -CM -  Diagnosis||||||
|**528**|2300.HI11.02|Industry Code|Diagnosis Code|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/diagnosisCodes/diagnosisCode|Diagnosis code|<br>If we get more than 3 digits, should add a dot (.)after 3rd Character||
|**529**|2300.HI12.01|Code List Qualifier Code|Diagnosis Type Code (Required when it is necessary to report an additional<br>diagnosis and the preceding HI data elements have been used to<br>report other diagnoses)|R|ABF : ICD10 -CM -  Diagnosis<br>BF : ICD9 -CM -  Diagnosis||||||
|**530**|2300.HI12.02|Industry Code|Diagnosis Code|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/diagnosisCodes/diagnosisCode|Diagnosis code|<br>If we get more than 3 digits, should add a dot (.)after 3rd Character||
|**531**|HI|Segment - HI Anesthesia Related Procedure (Situational)|||||||||
|**532**|2300.HI01.01|Code List Qualifier Code|Code identifying a specific industry code list|R|BP : Health Care Financing Administration Common Procedural Coding System Principal Procedure||||||
|**533**|2300.HI01.02|Industry Code|Anesthesia Related Principal Surgical Procedure|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/anesthesiaSurgicalProcedureCodes/anesthesiaSurgicalProcedureCode|Anesthesia related procedure code<br>Datatype: code set|||
|**534**|2300.HI02.01|Code List Qualifier Code|Code identifying a specific industry code list|R|BO :  Health Care Financing Administration Common Procedural Coding System||||||
|**535**|2300.HI02.02|Industry Code|Anesthesia Related  Surgical Procedure|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/anesthesiaSurgicalProcedureCodes/anesthesiaSurgicalProcedureCode|Anesthesia related procedure code<br>Datatype: code set|||
|**536**|HI|Segment - HI CONDITION INFORMATION (Situational)|||||||||
|**537**|2300.HI01.01|Code List Qualifier Code|Code identifying a specific industry code list|R|BG: Condition||||||
|**538**|2300.HI01.02|Industry Code|Condition Code|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/conditionCodes/conditionCode||||
|**539**|2300.HI02.01|Code List Qualifier Code|Code identifying a specific industry code list|R|BG: Condition||||||
|**540**|2300.HI02.02|Industry Code|Condition Code|R|||||||
|**541**|2300.HI03.01|Code List Qualifier Code|Code identifying a specific industry code list|R|BG: Condition||||||
|**542**|2300.HI03.02|Industry Code|Condition Code|R|||||||
|**543**|2300.HI04.01|Code List Qualifier Code|Code identifying a specific industry code list|R|BG: Condition||||||
|**544**|2300.HI04.02|Industry Code|Condition Code|R|||||||
|**545**|2300.HI05.01|Code List Qualifier Code|Code identifying a specific industry code list|R|BG: Condition||||||
|**546**|2300.HI05.02|Industry Code|Condition Code|R|||||||
|**547**|2300.HI06.01|Code List Qualifier Code|Code identifying a specific industry code list|R|BG: Condition||||||
|**548**|2300.HI06.02|Industry Code|Condition Code|R|||||||
|**549**|2300.HI07.01|Code List Qualifier Code|Code identifying a specific industry code list|R|BG: Condition||||||
|**550**|2300.HI07.02|Industry Code|Condition Code|R|||||||
|**551**|2300.HI08.01|Code List Qualifier Code|Code identifying a specific industry code list|R|BG: Condition||||||
|**552**|2300.HI08.02|Industry Code|Condition Code|R|||||||
|**553**|2300.HI09.01|Code List Qualifier Code|Code identifying a specific industry code list|R|BG: Condition||||||
|**554**|2300.HI09.02|Industry Code|Condition Code|R|||||||
|**555**|2300.HI10.01|Code List Qualifier Code|Code identifying a specific industry code list|R|BG: Condition||||||
|**556**|2300.HI10.02|Industry Code|Condition Code|R|||||||
|**557**|2300.HI11.01|Code List Qualifier Code|Code identifying a specific industry code list|R|BG: Condition||||||
|**558**|2300.HI11.02|Industry Code|Condition Code|R|||||||
|**559**|2300.HI12.01|Code List Qualifier Code|Code identifying a specific industry code list|R|BG: Condition||||||
|**560**|2300.HI12.02|Industry Code|Condition Code|R|||||||
|**561**|HCP|Segment - HCP Claim Pricing/Repricing Information (Situational)|||||||||
|**562**|2300.HCP01|Pricing Methodology|Code specifying pricing methodology at which the claim or line item has been<br>priced or repriced|R|||||||
|**563**|2300.HCP02|Monetary Amount|Repriced Allowed Amount|R|||||||
|**564**|2300.HCP03|Monetary Amount|Repriced Saving Amount|S|||||||
|**565**|2300.HCP04|Reference Identification|Repricing Organization Identifier|S|||||||
|**566**|2300.HCP05|Rate|Repricing Per Diem or Flat Rate Amount|S|||||||
|**567**|2300.HCP06|Reference Identification|Repriced Approved Ambulatory Patient Group Code|S|||||||
|**568**|2300.HCP07|Monetary Amount|Repriced Approved Ambulatory Patient Group Amount|S|||||||
|**569**|2300.HCP13|Reject Reason Code|Code assigned by issuer to identify reason for rejection|S|||||||
|**570**|2300.HCP14|Policy Compliance Code|Code specifying policy compliance|S|||||||
|**571**|2300.HCP15|Exception Code|Code specifying the exception reason for consideration of out-of-network health care services|S|||||||
|**572**|Loop 2310A  - REFERRING PROVIDER NAME (Situational)  Loop Repeat: 2 _(cs=10)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**573**|NM1|Segment - NM1 Referring Provider Name (Situational)||R|||||||
|**574**|2310A.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R|DN : Referring Provider<br>P3 : Primary Care Provider||||||
|**575**|2310A.NM102|Entity Type Qualifier|y|R|1 : Person||||||
|**576**|2310A.NM103 _(rs=2)_|Name Last or Organization Name _(rs=2)_|Individual last name or organizational name _(rs=2)_|R _(rs=2)_|_(rs=2)_|_(rs=2)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/referringPractitionerInformation/referringPractitionerName||Form this element by concatenating First Name and Last Name separated by space ( )<br><br>2310A.NM104  + 2310A.NM103<br>||
|**577**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/referringPractitionerInformation/referringPractitionerLastName||||
|**578**|2310A.NM104|Name First|Individual first name|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/referringPractitionerInformation/referringPractitionerFirstName||||
|**579**|2310A.NM105|Name Middle|Individual middle name or initial|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/referringPractitionerInformation/referringPractitionerMiddleName||||
|**580**|2310A.NM107|Name Suffix|Suffix to individual name|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/referringPractitionerInformation/referringPractitionerSuffix||||
|**581**|2310A.NM108|Identification Code Qualifier|Code designating the system/method of code structure used for Identification<br>Code|S|XX :  Centers for Medicare and Medicaid Services<br>National Provider Identifier||||||
|**582**|2310A.NM109|Identification Code|Referring Provider Identifier|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/referringPractitionerInformation/npi|Referring Practitioner's National Provider Id|||
|**583**|REF|Segment - REF Referring Provider Secondary Identification (Situational)|||||||||
|**584**|2310A.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|0B : State License Number<br>1G : Provider UPIN Number<br>G2 : Provider Commercial Number||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/referringPractitionerInformation/idQualifier|Identifies the IdType|||
|**585**|2310A.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier/ Referring Provider Secondary Identifier|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/referringPractitionerInformation/referringPractitionerIdentification|Referring Practitioner's Id|||
|**586**|Loop 2310B — RENDERING PROVIDER NAME Loop Repeat: 1 (Situational) _(cs=10)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**587**|NM1|Segment - NM1 Rendering Physician Name (Situational)|||||||||
|**588**|2310B.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R|82 : Rendering Provider||||||
|**589**|2310B.NM102|Entity Type Qualifier|Code identifying an organizational entity, a physical location, property or an<br>individual|R|1 : Person<br>2 : Non-Person Entity||||||
|**590**|2310B.NM103|Name Last or Organization Name|Individual last name or organizational name|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/renderingProviderLastName||if  Loop 2420A does not exist||
|**591**|2310B.NM104|Name First|Individual first name|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/renderingProviderFirstName||if  Loop 2420A does not exist||
|**592**|2310B.NM105|Name Middle|Individual middle name or initial|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/renderingProviderMiddleName||if  Loop 2420A does not exist||
|**593**|2310B.NM107|Name Suffix|Suffix to individual name|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/renderingProviderSuffix||if  Loop 2420A does not exist||
|**594**|2310B.NM108|Identification Code Qualifier|Code designating the system/method of code structure used for Identification<br>Code|S|XX :  Centers for Medicare and Medicaid Services<br>National Provider Identifier||||||
|**595**|2310B.NM109|Identification Code|Code identifying a party or other code /Rendering Provider Identifier|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/renderingProviderNPI||if  Loop 2420A does not exist||
|**596**|PRV|Segment - PRV Rendering Provider Specialty Information (Situational)|||||||||
|**597**|2310B.PRV01|Provider Code|Code identifying the type of provider|R|PE : Performing||||||
|**598**|2310B.PRV02|Reference Identification Qualifier|Code qualifying the Reference Identification|R|PXC : Health Care Provider Taxonomy Code||||||
|**599**|2310B.PRV03|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier / Provider Taxonomy Code|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/renderingPractitionerSpecialty||if  Loop 2420A does not exist||
|**600**|REF|Segment - REF Rendering Provider Secondary Identification (Situational)|||||||||
|**601**|2310B.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|0B : State License Number<br>1G : Provider UPIN Number<br>G2 : Provider Commercial Number<br>LU : Location Number||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/renderingProviderIdQualifier||if  Loop 2420A does not exist||
|**602**|2310B.REF02|Reference Identification|Rendering Provider Secondary Identifier|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/otherRenderingProviderId||if  Loop 2420A does not exist||
|**603**|Loop 2310C — SERVICE FACILITY LOCATION NAME Loop Repeat: 1 (Situational) _(cs=10)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**604**|NM1|Segment - NM1 Service Facility Location Name (Situational)|||||||||
|**605**|2310C.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an individual|R|77 : Service Location||||||
|**606**|2310C.NM102|Entity Type Qualifier|Code qualifying the type of entity|R|2 : Non-Person Entity||||||
|**607**|2310C.NM103 _(rs=2)_|Name Last or Organization Name _(rs=2)_|Individual last name or organizational name /Laboratory or Facility Name _(rs=2)_|R _(rs=2)_|_(rs=2)_|_(rs=2)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/renderingFacility/facilityName|Facility Name|||
|**608**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/outsideLabUsed/labName|<br>Name of Lab|If 2420C.NM103 present map that, else map this element<br><br>Name of Lab||
|**609**|2310C.NM108|Identification Code Qualifier|Code designating the system/method of code structure used for Identification<br>Code|S|XX :  Centers for Medicare and Medicaid Services<br>National Provider Identifier|||Facility NPI|||
|**610**|2310C.NM109|Identification Code|Laboratory or Facility Primary Identifier|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/renderingFacility/npi||||
|**611**|N3|Segment - N3 Service Facility Location Address (Required)|||||||||
|**612**|2310C.N301|Address Information|Address information|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/renderingFacility/streetAddress||||
|**613**|2310C.N302|Address Information|Address information|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/renderingFacility/streetAddress||second instance of street address||
|**614**|N4|Segment - N4 Service Facility Location City, State, ZIP Code (Required)|||||||||
|**615**|2310C.N401|City Name|Free-form text for city name|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/renderingFacility/cityName|City Name|||
|**616**|2310C.N402|State or Province Code|Code (Standard State/Province) as defined by appropriate government agency|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/renderingFacility/stateCode|State|||
|**617**|2310C.N403|Postal Code|Code defining international postal zone code excluding punctuation and blanks (zip code for United States)|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/renderingFacility/postalCode|Zip Code|||
|**618**|2310C.N404|Country Code|Code identifying the country|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/renderingFacility/countryCode|Country Code|Map to the value "US" if not present||
|**619**|2310C.N407|Country Subdivision Code|Code identifying the country subdivision|S|||||||
|**620**|REF|Segment - REF Service Facility Location Secondary Identification (Situational)|||||||||
|**621**|2310C.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|0B : State License Number<br>G2 : Provider Commercial Number<br>LU : Location Number||||||
|**622**|2310C.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier/Laboratory or Facility Secondary Identifier|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/renderingFacility/otherId|Facility ID|||
|**623**|PER|Segment - PER Service Facility Contact Information (Situational)|||||||||
|**624**|2310C.PER01|Contact Function Code|Code identifying the major duty or responsibility of the person or group named|R|IC : Information Contact||||||
|**625**|2310C.PER02|Name|Name|S|||||||
|**626**|2310C.PER03|Communication Number Qualifier|Code identifying the type of communication number|R|TE : Telephone||||||
|**627**|2310C.PER04|Communication Number|Complete communications number including country or area code when applicable|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/renderingFacility/telephoneNumber|Facility telephone number|||
|**628**|2310C.PER05|Communication Number Qualifier|Code identifying the type of communication number|R|EX :  Telephone Extension||||||
|**629**|2310C.PER06|Communication Number|Complete communications number including country or area code when<br>applicable|S|||||||
|**630**|Loop 2310D — SUPERVISING PROVIDER NAME (Situational)   Loop Repeat: 1 _(cs=10)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**631**|NM1|Segment - NM1 Supervising Provider Name (Situational)|||||||||
|**632**|2310D.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R|DQ : Supervising Physician||||||
|**633**|2310D.NM102|Entity Type Qualifier|Code qualifying the type of entity|R|1 : Person||||||
|**634**|2310D.NM103|Name Last or Organization Name|Individual last name or organizational name|R|||||||
|**635**|2310D.NM104|Name First|Individual first name|S|||||||
|**636**|2310D.NM105|Name Middle|Individual middle name or initial|S|||||||
|**637**|2310D.NM107|Name Suffix|Suffix to individual name|S|||||||
|**638**|2310D.NM108|Identification Code Qualifier|Code designating the system/method of code structure used for Identification<br>Code|S|||||||
|**639**|2310D.NM109|Identification Code|Code identifying a party or other code /  Supervising Provider Identifier|S|||||||
|**640**|REF|Segment - REF Supervising Provider Secondary Identification (Situational)|||||||||
|**641**|2310D.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|0B : State License Number<br>G2 : Provider Commercial Number<br>LU : Location Number||||||
|**642**|2310D.REF02|Reference Identification|Supervising Provider Secondary Identifier|R|||||||
|**643**|Loop 2310E  - AMBULANCE PICK-UP LOCATION  (Situational)  Loop Repeat: 1 _(cs=10)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**644**|NM1|Segment - NM1 Ambulance Pick-up Location (Situational)|||||||||
|**645**|2310E.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R|PW :  Pickup Address||||||
|**646**|2310E.NM102|Entity Type Qualifier|Code qualifying the type of entity|R|2  :  Non-Person Entity||||||
|**647**|N3|Segment - N3 Ambulance Pick-up Location Address (Required)|||||||||
|**648**|2310E.N301|Address Information|Ambulance Pick-up Address Line|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/ambulanceInformationList/ambulanceInformation/pickupAddress/address|Address line 1|||
|**649**|2310E.N302|Address Information|Ambulance Pick-up Address Line|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/ambulanceInformationList/ambulanceInformation/pickupAddress/address2|Address line 2|||
|**650**|N4|Segment - N4 Ambulance Pick-up Location City, State, ZIP Code (Required)|||||||||
|**651**|2310E.N401|City Name|Free-form text for city name|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/ambulanceInformationList/ambulanceInformation/pickupAddress/city||||
|**652**|2310E.N402|State or Province Code|Code (Standard State/Province) as defined by appropriate government agency|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/ambulanceInformationList/ambulanceInformation/pickupAddress/stateCode||||
|**653**|2310E.N403 _(rs=2)_|Postal Code _(rs=2)_|Code defining international postal zone code excluding punctuation and blanks (zip code for United States) _(rs=2)_|S _(rs=2)_|_(rs=2)_|_(rs=2)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/ambulanceInformationList/ambulanceInformation/pickupAddress/zipCode||||
|**654**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/ambulanceInformationList/ambulanceInformation/pickupAddress/zipSuffixCode||||
|**655**|2310E.N404|Country Code|Code identifying the country|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/ambulanceInformationList/ambulanceInformation/pickupAddress/countryCode/countryCode||Map to the value "US" if not present||
|**656**|2310E.N407|Country Subdivision Code|Code identifying the country subdivision|S|||||||
|**657**|Loop 2310F — AMBULANCE DROP-OFF LOCATION (Situational) Loop Repeat: 1 _(cs=10)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**658**|NM1|Segment - NM1 Ambulance Drop-off Location (Situational)|||||||||
|**659**|2310F.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R|45 : Drop-off Location||||||
|**660**|2310F.NM102|Entity Type Qualifier|Code qualifying the type of entity|R|2  :  Non-Person Entity||||||
|**661**|2310F.NM103|Name Last or Organization Name|Ambulance Drop-off Location|S|||||||
|**662**|N3|Segment - N3 Ambulance Drop-off Location Address (Required)|||||||||
|**663**|2310F.N301|Address Information|Ambulance Drop-off Address Line|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/ambulanceInformationList/ambulanceInformation/dropOffAddress/address||||
|**664**|2310F.N302|Address Information|Ambulance Drop-off Address Line|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/ambulanceInformationList/ambulanceInformation/dropOffAddress/address2||||
|**665**|N4|Segment - N4 Ambulance Drop-off Location City, State, ZIP Code (Required)|||||||||
|**666**|2310F.N401|City Name|Free-form text for city name|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/ambulanceInformationList/ambulanceInformation/dropOffAddress/city|City Name|||
|**667**|2310F.N402|State or Province Code|Code (Standard State/Province) as defined by appropriate government agency|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/ambulanceInformationList/ambulanceInformation/dropOffAddress/stateCode|State|||
|**668**|2310F.N403 _(rs=2)_|Postal Code _(rs=2)_|Code defining international postal zone code excluding punctuation and blanks (zip code for United States) _(rs=2)_|S _(rs=2)_|_(rs=2)_|_(rs=2)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/ambulanceInformationList/ambulanceInformation/dropOffAddress/zipCode|Zip Code|Map byte 1-5||
|**669**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/ambulanceInformationList/ambulanceInformation/dropOffAddress/zipSuffixCode|Zip Code Suffix|Map byte 6-9||
|**670**|2310F.N404|Country Code|Code identifying the country|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/ambulanceInformationList/ambulanceInformation/dropOffAddress/countryCode/countryCode|Country|Map to the value "US" if not present||
|**671**|2310F.N407|Country Subdivision Code|Code identifying the country subdivision||||||||
|**672**|Loop 2320 — OTHER SUBSCRIBER INFORMATION(Situational) Loop Repeat: 10 <br><br>The invoice attachment (professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment)<br>will be repeated based upon the number of 2320 loops. .i.e  for each payer loop, one individual invoice attachment loop is populated in target XML. <br> _(cs=10)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**673**|SBR|Segment - SBR Other Subscriber Information (Situational)|||||||||
|**674**|2320.SBR01 _(rs=2)_|Payer Responsibility Sequence Number Code _(rs=2)_|Code identifying the insurance carrier’s level of responsibility for a payment of a<br>claim _(rs=2)_|R _(rs=2)_|P : Primary <br>S : Secondary <br>T : Tertiary _(rs=2)_|_(rs=2)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/payerPriorityCode|Indicates whether other insurance is primary, secondary, or tertiary|||
|**675**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/attachmentCodeCode/codeSetName||Hardcode as 'AttachmentTypeCode'||
|**676**|2320.SBR02|Individual Relationship Code|Code indicating the relationship between two individuals or entities|R|18 : Self||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/attachmentCodeCode/codeEntry||Hardcode  as '18'||
|**677**|2320.SBR03 _(rs=3)_|Reference Identification _(rs=3)_|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier/Insured Group or Policy Number _(rs=3)_|S _(rs=3)_|_(rs=3)_|_(rs=3)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/subscriberInformation/otherHealthPlan|If yes, subscriber has an additional health plan|populate this field only once as ‘Y’ when the claim has at least one 2320 loop||
|**678**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/eobGroupNumber|Group number indicated on the EOB|||
|**679**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/OtherInsuranceInformationList/OtherInsuranceInformation/groupNumber|Group number of the other insurance plan|||
|**680**|2320.SBR04 _(rs=3)_|Name _(rs=3)_|Other Insured Group Name _(rs=3)_|S _(rs=3)_|_(rs=3)_|_(rs=3)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/eobGroupName|Group name indicated on the EOB|||
|**681**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/planName|Plan ID number indicated on the EOB|||
|**682**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/OtherInsuranceInformationList/OtherInsuranceInformation/planName|Name of the insurance plan|||
|**683**|2320.SBR05|Insurance Type Code|Code identifying the type of insurance policy within a specific insurance program|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/insuranceTypeCode|Type of the other insurance|||
|**684**|2320.SBR09|Claim Filing Indicator Code|Code identifying type of claim|S||MB :Medicare Part B<br>MA: Medicare Part A<br>MC: Medicaid|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/eobAttachment/claimFilingIndicator||||
|**685**|CAS|Segment - CAS Claim Level Adjustments (Situational)|||||||||
|**686**|2320.CAS01|Claim Adjustment Group Code|Code identifying the general category of payment adjustment|R|CO : Contractual Obligations<br>CR : Correction and Reversals<br>OA : Other adjustments<br>PI : Payor Initiated Reductions<br>PR : Patient Responsibility||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/casCodes/casCode/groupCode||||
|**687**|2320.CAS02|Claim Adjustment Reason Code|Code identifying the detailed reason the adjustment was made|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/casCodes/casCode/casCode||||
|**688**|2320.CAS03 _(rs=8)_|Monetary Amount _(rs=8)_|Monetary Amount _(rs=8)_|R _(rs=8)_|_(rs=8)_|_(rs=8)_|F||When CAS01='PR' and CAS02='1'||
|**689**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/coInsuranceAmount||When CAS01='PR' and CAS02='2'||
|**690**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/copayAmount||When CAS01='PR' and CAS02='3'||
|**691**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/memberPenalty||When CAS01='PR' and CAS02=225/237/B4||
|**692**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/providerPenalty||When CAS01='CO' and CAS02=225/237/B4||
|**693**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/discountAmount||When CAS01='CO' and CAS02='45'||
|**694**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/taxAmount||When CAS01='CO' and CAS02='105'||
|**695**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/casCodes/casCode/amount||||
|**696**|2320.CAS04|Quantity|Numeric value of quantity|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/casCodes/casCode/quantity||||
|**697**|2320.CAS05|Claim Adjustment Reason Code|Code identifying the detailed reason the adjustment was made|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/casCodes/casCode/casCode||||
|**698**|2320.CAS06 _(rs=8)_|Monetary Amount _(rs=8)_|Monetary Amount _(rs=8)_|S _(rs=8)_|_(rs=8)_|_(rs=8)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/deductibleAmount||When CAS01='PR' and CAS05='1'||
|**699**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/coInsuranceAmount||When CAS01='PR' and CAS05='2'||
|**700**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/copayAmount||When CAS01='PR' and CAS05='3'||
|**701**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/memberPenalty||When CAS01='PR' and CAS05=225/237/B4||
|**702**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/providerPenalty||When CAS01='CO' and CAS05=225/237/B4||
|**703**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/discountAmount||When CAS01='CO' and CAS05='45'||
|**704**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/taxAmount||When CAS01='CO' and CAS05='105'||
|**705**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/casCodes/casCode/amount||||
|**706**|2320.CAS07|Quantity|Numeric value of quantity|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/casCodes/casCode/quantity||||
|**707**|2320.CAS08|Claim Adjustment Reason Code|Code identifying the detailed reason the adjustment was made|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/casCodes/casCode/casCode||||
|**708**|2320.CAS09 _(rs=8)_|Monetary Amount _(rs=8)_|Monetary Amount _(rs=8)_|S _(rs=8)_|_(rs=8)_|_(rs=8)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/deductibleAmount||When CAS01='PR' and CAS08='1'||
|**709**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/coInsuranceAmount||When CAS01='PR' and CAS08='2'||
|**710**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/copayAmount||When CAS01='PR' and CAS08='3'||
|**711**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/memberPenalty||When CAS01='PR' and CAS08=225/237/B4||
|**712**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/providerPenalty||When CAS01='CO' and CAS08=225/237/B4||
|**713**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/discountAmount||When CAS01='CO' and CAS08='45'||
|**714**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/taxAmount||When CAS01='CO' and CAS08='105'||
|**715**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/casCodes/casCode/amount||||
|**716**|2320.CAS10|Quantity|Numeric value of quantity|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/casCodes/casCode/quantity||||
|**717**|2320.CAS11|Claim Adjustment Reason Code|Code identifying the detailed reason the adjustment was made|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/casCodes/casCode/casCode||||
|**718**|2320.CAS12 _(rs=8)_|Monetary Amount _(rs=8)_|_(rs=8)_|S _(rs=8)_|_(rs=8)_|_(rs=8)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/deductibleAmount||When CAS01='PR' and CAS11='1'||
|**719**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/coInsuranceAmount||When CAS01='PR' and CAS11='2'||
|**720**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/copayAmount||When CAS01='PR' and CAS11='3'||
|**721**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/memberPenalty||When CAS01='PR' and CAS11=225/237/B4||
|**722**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/providerPenalty||When CAS01='CO' and CAS11=225/237/B4||
|**723**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/discountAmount||When CAS01='CO' and CAS11='45'||
|**724**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/taxAmount||When CAS01='CO' and CAS11='105'||
|**725**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/casCodes/casCode/amount||||
|**726**|2320.CAS13|Quantity|Numeric value of quantity|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/casCodes/casCode/quantity||||
|**727**|2320.CAS14|Claim Adjustment Reason Code|Code identifying the detailed reason the adjustment was made|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/casCodes/casCode/casCode||||
|**728**|2320.CAS15 _(rs=8)_|Monetary Amount _(rs=8)_|Monetary Amount _(rs=8)_|S _(rs=8)_|_(rs=8)_|_(rs=8)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/deductibleAmount||When CAS01='PR' and CAS14='1'||
|**729**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/coInsuranceAmount||When CAS01='PR' and CAS14='2'||
|**730**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/copayAmount||When CAS01='PR' and CAS14='3'||
|**731**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/memberPenalty||When CAS01='PR' and CAS14=225/237/B4||
|**732**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/providerPenalty||When CAS01='CO' and CAS14=225/237/B4||
|**733**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/discountAmount||When CAS01='CO' and CAS14='45'||
|**734**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/taxAmount||When CAS01='CO' and CAS14='105'||
|**735**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/casCodes/casCode/amount||||
|**736**|2320.CAS16|Quantity|Numeric value of quantity|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/casCodes/casCode/quantity||||
|**737**|2320.CAS17|Claim Adjustment Reason Code|Code identifying the detailed reason the adjustment was made|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/casCodes/casCode/casCode||||
|**738**|2320.CAS18 _(rs=8)_|Monetary Amount _(rs=8)_|Monetary Amount _(rs=8)_|S _(rs=8)_|_(rs=8)_|_(rs=8)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/deductibleAmount||When CAS01='PR' and CAS17='1'||
|**739**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/coInsuranceAmount||When CAS01='PR' and CAS17='2'||
|**740**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/copayAmount||When CAS01='PR' and CAS17='3'||
|**741**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/memberPenalty||When CAS01='PR' and CAS17=225/237/B4||
|**742**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/providerPenalty||When CAS01='CO' and CAS17=225/237/B4||
|**743**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/discountAmount||When CAS01='CO' and CAS17='45'||
|**744**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/taxAmount||When CAS01='CO' and CAS17='105'||
|**745**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/casCodes/casCode/amount||||
|**746**|2320.CAS19|Quantity|Numeric value of quantity|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/casCodes/casCode/quantity||||
|**747**|AMT|Segment - AMT Coordination of Benefits (COB) Payer Paid Amount (Situational)|||||||||
|**748**|2320.AMT01|Amount Qualifier Code|Code to qualify amount|R|D : Payor Amount Paid||||||
|**749**|2320.AMT02 _(rs=2)_|Monetary Amount _(rs=2)_|Monetary Amount _(rs=2)_|R _(rs=2)_|_(rs=2)_|_(rs=2)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/netPaidAmount|Net paid amount.|||
|**750**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/allowedAmount|Net paid amount.|Sum netpaid amount(2320.AMT02) and CAS*PR amounts for the payer in header 2320 loop and map to this field<br><br>Only two digits allowed after the decimal||
|**751**|AMT|Segment - AMT Remaining Patient Liability (Situational)|||||||||
|**752**|2320.AMT01|Amount Qualifier Code|Code to qualify amount|R|EAF :  Amount Owed||||||
|**753**|2320.AMT02|Monetary Amount|Monetary Amount|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/memberResponsibilityAmount|Member Responsibility Amount|||
|**754**|AMT|Segment - AMT Coordination of Benefits (COB) Total Non-covered Amount (Situational)|||||||||
|**755**|2320.AMT01|Amount Qualifier Code|Code to qualify amount|R|A8 :  Noncovered Charges - Actual||||||
|**756**|2320.AMT02|Monetary Amount|Monetary Amount|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/nonCoveredAmount|Monetary Amount|Please refer comments|All 2320.CAS03 / 2320.CAS06 /2320.CAS09 /2320.CAS12/2320.CAS15/2320.CAS18  Amounts for all CAS01-CAS02/05/08/11/14/17 combinations which are not explicitly mentioned in 2320.CAS segment mapping will also get added to  /professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/nonCoveredAmount|
|**757**|OI|Segment - OI Other Insurance Coverage Information (Required)|||||||||
|**758**|2320.OI03|Yes/No Condition or Response Code|Code indicating a Yes or No condition or response|R|||||||
|**759**|2320.OI04|Patient Signature Source Code|Code indicating how the patient or subscriber authorization signatures were<br>obtained and how they are being retained by the provider|S|||||||
|**760**|2320.OI06|Release of Information Code|Code indicating whether the provider has on file a signed statement by the patient authorizing the release of medical data to other organizations|R|||||||
|**761**|MOA|Segment - MOA Outpatient Adjudication Information (Situational)|||||||||
|**762**|2320.MOA01|Percentage as Decimal|Percentage expressed as a decimal (e.g., 0.0 through 1.0 represents 0% through<br>100%)|S|||||||
|**763**|2320.MOA02|Monetary Amount|Monetary amount|S|||||||
|**764**|2320.MOA03|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier /  Claim Payment Remark Code|S|||||||
|**765**|2320.MOA04|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier /  Claim Payment Remark Code|S|||||||
|**766**|2320.MOA05|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier /  Claim Payment Remark Code|S|||||||
|**767**|2320.MOA06|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier /  Claim Payment Remark Code|S|||||||
|**768**|2320.MOA07|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier /  Claim Payment Remark Code|S|||||||
|**769**|2320.MOA08|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier /  Claim Payment Remark Code|S|||||||
|**770**|2320.MOA09|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier /  Claim Payment Remark Code|S|||||||
|**771**|Loop 2330A —  OTHER SUBSCRIBER NAME (Situational) Loop Repeat: 1 _(cs=10)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**772**|NM1|Segment - NM1 Other Subscriber Name (Required)|||||||||
|**773**|2330A.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R|IL : Insured or Subscriber||||||
|**774**|2330A.NM102|Entity Type Qualifier|Code qualifying the type of entity|R|1 : Person <br>2 : Non-Person Entity||||||
|**775**|2330A.NM103 _(rs=2)_|Name Last or Organization Name _(rs=2)_|Individual last name or organizational name _(rs=2)_|R _(rs=2)_|_(rs=2)_|_(rs=2)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/eobSubscriberLastName|Subscriber's Last Name|||
|**776**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/OtherInsuranceInformationList/OtherInsuranceInformation/lastName|Contains information (lastName)relating to the person who is covered by the other insurance, if applicable.|||
|**777**|2330A.NM104 _(rs=2)_|Name First _(rs=2)_|Individual first name _(rs=2)_|S _(rs=2)_|_(rs=2)_|_(rs=2)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/eobSubscriberFirstName||||
|**778**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/OtherInsuranceInformationList/OtherInsuranceInformation/firstName||||
|**779**|2330A.NM105 _(rs=2)_|Name Middle _(rs=2)_|Individual middle name or initial _(rs=2)_|S _(rs=2)_|_(rs=2)_|_(rs=2)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/eobSubscriberMiddleName|Subscriber's Middle Name|||
|**780**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/OtherInsuranceInformationList/OtherInsuranceInformation/middleName|Contains information (middleName) relating to the person who is covered by the other insurance, if applicable.|||
|**781**|2330A.NM107 _(rs=2)_|Name Suffix _(rs=2)_|Suffix to individual name _(rs=2)_|S _(rs=2)_|E _(rs=2)_|_(rs=2)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/eobSubscriberNameSuffix|Subscriber name suffix|||
|**782**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/OtherInsuranceInformationList/OtherInsuranceInformation/nameSuffix|Contains information (The suffix (e.g. Jr, II, III))relating to the person who is covered by the other insurance, if applicable.|||
|**783**|2330A.NM108|Identification Code Qualifier|Code designating the system/method of code structure used for Identification<br>Code|R|II : Standard Unique Health Identifier for each Individual<br>in the United States<br>MI :Member Identification Number||||||
|**784**|2330A.NM109|Identification Code|Code identifying a party or other code|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/otherInsuredID|Member's<br>identification number as assigned by the COB payer|||
|**785**|N3|Segment - N3 Other Subscriber Address (Situational)|||||||||
|**786**|2330A.N301|Address Information|Address Information|R|||||||
|**787**|2330A.N302|Address Information|Address Information|S|||||||
|**788**|N4|Segment - N4 Other Subscriber City/State/ZIP Code (Situational)|||||||||
|**789**|2330A.N401|City Name|Free-form text for city name|R|||||||
|**790**|2330A.N402|State or Province Code|Code (Standard State/Province) as defined by appropriate government agency|S|||||||
|**791**|2330A.N403|Postal Code|Code defining international postal zone code excluding punctuation and blanks (zip code for United States)|S|||||||
|**792**|2330A.N404|Country Code|Code identifying the country|S|||||||
|**793**|2330A.N407|Country Subdivision Code|Code identifying the country subdivision|S|||||||
|**794**|REF|Segment - REF Other Subscriber Secondary Information (Situational)|||||||||
|**795**|2330A.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|SY :  Social Security Number||||||
|**796**|2330A.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified <br>by the Reference Identification Qualifier / Other Insured Additional Identifier|R|||||||
|**797**|Loop 2330B — OTHER PAYER NAME (Situational) Loop Repeat: 1 _(cs=10)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**798**|NM1|Segment - NM1 Other Payer Name (Required)|||||||||
|**799**|2330B.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R|PR : Payer||||||
|**800**|2330B.NM102|Entity Type Qualifier|Code qualifying the type of entity|R|2 :  Non-Person Entity||||||
|**801**|2330B.NM103|Name Last or Organization Name|Individual last name or organizational name|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/eobHccInformation/companyName|Insurance company name|||
|**802**|2330B.NM108|Identification Code Qualifier|Code designating the system/method of code structure used for Identification<br>Code (67)|R|PI :  Payor Identification<br>XV : Centers for Medicare and Medicaid Services PlanID||||||
|**803**|2330B.NM109|Identification Code|Code identifying a party or other code|R|||||||
|**804**|N3|Segment - N3 Other Payer Address (Situational)|||||||||
|**805**|2330B.N301|Address Information|Address Information|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/eobHccInformation/address/postalAddress/address|Address first line|||
|**806**|2330B.N302|Address Information|Address Information|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/eobHccInformation/address/postalAddress/address2|Address second line|||
|**807**|N4|Segment - N4 Other Payer City/State/ZIP Code (Situational)|||||||||
|**808**|2330B.N401|City Name|Free-form text for city name|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/eobHccInformation/address/postalAddress/cityName|City Name|||
|**809**|2330B.N402|State or Province Code|Code (Standard State/Province) as defined by appropriate government agency|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/eobHccInformation/address/postalAddress/stateCode|State Code|||
|**810**|2330B.N403 _(rs=2)_|Postal Code _(rs=2)_|Code defining international postal zone code excluding punctuation and blanks (zip code for United States) _(rs=2)_|S _(rs=2)_|_(rs=2)_|_(rs=2)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/eobHccInformation/address/postalAddress/zipCode|Zip Code <br>byte 1-5|Zip Code <br>byte 1-5||
|**811**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/eobHccInformation/address/postalAddress/zipExtensionCode|Zip Code Extension <br>byte 6-9|Zip Code Extension <br>byte 6-9||
|**812**|2330B.N404|Country Code|Code identifying the country|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/eobHccInformation/address/postalAddress/countryCode/countryCode|Country Code|Map to the value "US" if not present||
|**813**|2330B.N407|Country Subdivision Code|Code identifying the country subdivision|S|||||||
|**814**|DTP|Segment - DTP Claim Check or Remittance Date (Situational)|||||||||
|**815**|2330B.DTP01|Date/Time Qualifier|Code specifying type of date or time, or both date and time|R|573 : Date Claim Paid||||||
|**816**|2330B.DTP02|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 :  Date Expressed in Format CCYYMMDD||||||
|**817**|2330B.DTP03|Date Time Period|Expression of a date, a time, or range of dates, times or dates and times|R||20210305|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/eobDate|User-entered date on which the EOB was generated.<br><br>In the format YYYY-MM-DD|||
|**818**|REF|Segment - REF Other Payer Secondary Identifier (Situational)|||||||||
|**819**|2330B.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|2U : Payer Identification Number<br>EI : Employer’s Identification Number<br>FY : Claim Office Number<br>NF : National Association of Insurance Commissioners<br>(NAIC) Code||||||
|**820**|2330B.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier/Other Payer Secondary Identifier|R||22105302412107COA|||||
|**821**|REF|Segment - REF Other Payer Prior Authorization Number (Situational)|||||||||
|**822**|2330B.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|G1 : Prior Authorization Number||||||
|**823**|2330B.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier/ Other Payer Prior Authorization Number|R|||||||
|**824**|REF|Segment - REF Other Payer Referral Number (Situational)|||||||||
|**825**|2330B.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|9F :  Referral Number||||||
|**826**|2330B.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier/  Other Payer Prior Authorization or Referral<br>Number|R|||||||
|**827**|REF|Segment - REF Other Payer Claim Adjustment Indicator (Situational)|||||||||
|**828**|2330B.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|T4 : Signal Code||||||
|**829**|2330B.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier/ : Other Payer Claim Adjustment Indicator|R|||||||
|**830**|REF|Segment - REF Other Payer Claim Control Number (Situational)|||||||||
|**831**|2330B.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|F8 : Original Reference Number||||||
|**832**|2330B.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier/ : Other Payer’s Claim Control Number|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/eobClaimID||||
|**833**|Loop 2330C — OTHER PAYER REFERRING PROVIDER (Situational)  Loop Repeat: 2 _(cs=10)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**834**|NM1|Segment - NM1 Other Payer Referring Provider (Situational)|||||||||
|**835**|2330C.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R|DN : Referring Provider<br>P3 : Primary Care Provider||||||
|**836**|2330C.NM102|Entity Type Qualifier|Code qualifying the type of entity|R|1 : Person||||||
|**837**|REF|Segment - REF Other Payer Referring Provider Secondary Identification (Required)|||||||||
|**838**|2330C.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|0B : State License Number<br>1G : Provider UPIN Number<br>G2 : Provider Commercial Number||||||
|**839**|2330C.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier  /Other Payer Referring Provider Identifier|R|||||||
|**840**|Loop 2330D — OTHER PAYER RENDERING PROVIDER (Situational) Loop Repeat: 1 _(cs=10)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**841**|NM1|Segment - NM1 Other Payer Rendering Provider (Situational)|||||||||
|**842**|2330D.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R|82 :Other Payer Referring Provider Identifier||||||
|**843**|2330D.NM102|Entity Type Qualifier|Code qualifying the type of entity /Other Payer Referring Provider Identifier|R|1 :Person<br>2 :Non-Person Entity||||||
|**844**|REF|Segment - REF Other Payer Rendering Provider Secondary Identification (Required)|||||||||
|**845**|2330D.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|0B :State License Number<br>1G :Provider UPIN Number<br>G2 :Provider Commercial Number<br>LU :Location Number||||||
|**846**|2330D.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier /Other Payer Referring Provider Identifier|R|||||||
|**847**|Loop 2330E — OTHER PAYER SERVICE FACILITY LOCATION (Situational) Loop Repeat: 1 _(cs=10)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**848**|NM1|Segment - NM1 Other Payer Service Facility Location (Situational)|||||||||
|**849**|2330E.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R|77 : Service Locatio||||||
|**850**|2330E.NM102|Entity Type Qualifier|Code qualifying the type of entity|R|2 :Non-Person Entity||||||
|**851**|REF|Segment - REF Other Payer Service Facility Location Secondary Identification (Required)|||||||||
|**852**|2330E.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|0B : State License Number<br>G2 : Provider Commercial Number<br>LU : Location Number||||||
|**853**|2330E.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier /Other Payer Service Facility Location Secondary<br>Identifie|R|||||||
|**854**|Loop 2330F  — OTHER PAYER SUPERVISING PROVIDER (Situational) Loop Repeat: 1 _(cs=10)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**855**|NM1|Segment - NM1 Other Payer Supervising Provider (Situational)|||||||||
|**856**|2330F.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R|DQ : Supervising Physician||||||
|**857**|2330F.NM102|Entity Type Qualifier|Code qualifying the type of entity|R|1 : Person||||||
|**858**|REF|Segment - REF Other Payer Supervising Provider Secondary Identification (Required)|||||||||
|**859**|2330F.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|0B : State License Number<br>1G : Provider UPIN Number<br>G2 : Provider Commercial Number<br>LU : Location Number||||||
|**860**|2330F.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier/ Other Payer Supervising Provider Identifier|R|||||||
|**861**|Loop 2330G — OTHER PAYER BILLING PROVIDER  (Situational) Loop Repeat: 1 _(cs=10)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**862**|NM1|Segment - NM1 Other Payer Billing Provider (Situational)|||||||||
|**863**|2330G.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R|85 : Billing Provider||||||
|**864**|2330G.NM102|Entity Type Qualifier|Code qualifying the type of entity|R|1 : Person<br>2 : Non-Person Entity||||||
|**865**|REF|Segment - REF Other Payer Billing Provider Secondary Identification (Required)|||||||||
|**866**|2330G.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|G2 : Provider Commercial Number<br>LU : Location Number||||||
|**867**|2330G.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier/ Other Payer Billing Provider Identifier|R|||||||
|**868**|Loop 2400  — SERVICE LINE NUMBER(Required) Loop Repeat: 50 _(cs=10)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**869**|LX|Segment - LX Service Line Number (Required)|||||||||
|**870**|2400.LX01|Assigned Number|Number assigned for differentiation within a transaction set|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/originalLineNumber|Original claim line number|||
|**871**|||||||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/hccClaimLineNumber|Claim Line number|Map only for COB claims(when 2430 Loop exists)||
|**872**|SV1|Segment - SV1 Professional Service (Required)|||||||||
|**873**|2400.SV101.01|Product/Service ID Qualifier|Code identifying the type/source of the descriptive number used in<br>Product/Service ID (234)|R|HC  :  Health Care Financing Administration Common<br>Procedural Coding System (HCPCS) Codes<br>ER : Jurisdiction Specific Procedure and Supply Codes<br>IV :Home Infusion EDI Coalition (HIEC) Product/Service<br>Code<br>WK :Advanced Billing Concepts (ABC) Codes||||||
|**874**|2400.SV101.02|Product/Service ID|identifying number for a product or service|R||90837|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/serviceCode|Service code associated with the claim line|||
|**875**|2400.SV101.03|Procedure Modifier|This identifies special circumstances related to the performance of the service, as defined by trading partners|S||HE|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/modifierList/modifier|Modifier|||
|**876**|2400.SV101.04|Procedure Modifier|This identifies special circumstances related to the performance of the service, as defined by trading partners|S||GT|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/modifierList/modifier|Modifier|||
|**877**|2400.SV101.05|Procedure Modifier|This identifies special circumstances related to the performance of the service, as defined by trading partners|S||GT|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/modifierList/modifier|Modifier|||
|**878**|2400.SV101.06|Procedure Modifier|This identifies special circumstances related to the performance of the service, as defined by trading partners|S||GT|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/modifierList/modifier|Modifier|||
|**879**|2400.SV101.07|Description|A free-form description to clarify the related data elements and their content|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/serviceDescription|||PSD1640 added service description|
|**880**|2400.SV102 _(rs=4)_|Monetary Amount _(rs=4)_|Monetary Amount _(rs=4)_|R _(rs=4)_|_(rs=4)_|233.19 _(rs=4)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/billedAmount|Billed Amount / COB related|Map only for COB claims (when Claim Level 2320 exists)|COB related|
|**881**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/billedAmount|Billed Amount / COB related|Map only for COB claims (when Claim Level 2320 exists)|COB related|
|**882**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/serviceFee|Service Fee|||
|**883**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/outsideLabUsed/chargeAmount|Amount charged by outside Lab|Sum of all service lines' amounts||
|**884**|2400.SV103|Unit or Basis for Measurement Code|Code specifying the units in which a value is being expressed, or manner in which a measurement has been taken|R|UN : Unit<br>MJ : Minutes||||||
|**885**|2400.SV104 _(rs=2)_|Quantity _(rs=2)_|Numeric value of quantity _(rs=2)_|R _(rs=2)_|_(rs=2)_|_(rs=2)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/serviceUnitCount|Identifies the type of unit|If 2400.SV103 = “UN”||
|**886**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/minuteCount|Number of minutes|If 2400.SV103 = “MJ”||
|**887**|2400.SV105|Facility Code Value|Code identifying where services were, or may be, performed; the first and second positions of the Uniform Bill Type Code for Institutional Services or the Place of Service Codes for Professional or Dental Services.|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/placeOfServiceCode|Code indicating the palce of service|<br>Copy from 2300.CLM05-01 if 2400.SV105 is not present||
|**888**|2400.SV107.01|Diagnosis Code Pointer|A pointer to the diagnosis code in the order of importance to this service|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/diagnosisCodePointers/diagnosisCodePointer|Diagnosis code applicable to the service line|||
|**889**|2400.SV107.02|Diagnosis Code Pointer|A pointer to the diagnosis code in the order of importance to this service|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/diagnosisCodePointers/diagnosisCodePointer|Diagnosis code applicable to the service line|||
|**890**|2400.SV107.03|Diagnosis Code Pointer|A pointer to the diagnosis code in the order of importance to this service|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/diagnosisCodePointers/diagnosisCodePointer|Diagnosis code applicable to the service line|||
|**891**|2400.SV107.04|Diagnosis Code Pointer|A pointer to the diagnosis code in the order of importance to this service|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/diagnosisCodePointers/diagnosisCodePointer|Diagnosis code applicable to the service line|||
|**892**|2400.SV109|Yes/No Condition or Response Code|Code indicating a Yes or No condition or response /Emergency Indicator|S|Y :Yes||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/emg|Emergency Indicator|||
|**893**|2400.SV111|Yes/No Condition or Response Code|Code indicating a Yes or No condition or response /EPSDT Indicator|S|Y :Yes||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/epsdtFamilyPlan|Early and Preiodic Screen for Diagnosis and Treatment Indicator|||
|**894**|2400.SV112|Yes/No Condition or Response Code|Code indicating a Yes or No condition or response/ Family Planning Indicator|S|Y :Yes||||||
|**895**|2400.SV115|Copay Status Code|Code indicating whether or not co-payment requirements were met on a line by<br>line basis|S|0 : Copay exempt||||||
|**896**|SV5|Segment - SV5 Durable Medical Equipment Service (Situational)|||||||||
|**897**|2400.SV501.01|Product/Service ID Qualifier|Code identifying the type/source of the descriptive number used in<br>Product/Service ID|R|HC : Health Care Financing Administration Common<br>Procedural Coding System (HCPCS) Codes||||||
|**898**|2400.SV501.02|Product/Service ID|Identifying number for a product or service|R|||||||
|**899**|2400.SV502|Unit or Basis for Measurement Code|Code specifying the units in which a value is being expressed, or manner in which<br>a measurement has been taken|R|DA: Days||||||
|**900**|2400.SV503|Quantity|Numeric value of quantity|R|||||||
|**901**|2400.SV504|Monetary Amount|Monetary Amount|R|||||||
|**902**|2400.SV505|Monetary Amount|Monetary Amount|R|||||||
|**903**|2400.SV506|Frequency Code|Code indicating frequency or type of activities or actions being reported|R|1 :Weekly<br>4 :Monthly<br>6 :Daily||||||
|**904**|PWK|Segment - PWK Line Supplemental Information (Situational)|||||||||
|**905**|2400.PWK01|Report Type Code|Code indicating the title or contents of a document, report or supporting item|R|||||||
|**906**|2400.PWK02|Report Transmission Code|Code defining timing, transmission method or format by which reports are to be sent|R|||||||
|**907**|2400.PWK05|Identification Code Qualifier|Code designating the system/method of code structure used for Identification<br>Code|S|AC :  Attachment Control Number||||||
|**908**|2400.PWK06|Identification Code|Code identifying a party or other code|S|||||||
|**909**|PWK|Segment - PWK Durable Medical Equipment Certificate of Medical Necessity Indicator (Situational)|||||||||
|**910**|2400.PWK01|Report Type Code|Code indicating the title or contents of a document, report or supporting item|R|CT : Certification||||||
|**911**|2400.PWK02|Report Transmission Code|Code defining timing, transmission method or format by which reports are to be<br>sent|R|AB :Previously Submitted to Payer<br>AD :Certification Included in this Claim<br>AF :Narrative Segment Included in this Claim<br>AG :No Documentation is Required<br>NS :Not Specified||||||
|**912**|CR1|Segment - CR1 Ambulance Transport Information (Situational)|||||||||
|**913**|2400.CR101|Unit or Basis for Measurement Code|Code specifying the units in which a value is being expressed, or manner in which a measurement has been taken|S|LB : Pound||||||
|**914**|2400.CR102|Weight|Numeric value of weight|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/lineAmbulanceInformationList/lineAmbulanceInformation/patientWeight|Weight of patient|||
|**915**|2400.CR104|Ambulance Transport Reason Code|Code indicating the reason for ambulance transport|R|A : Patient was transported to nearest facility<br>B : Patient was transported for the benefit of a preferred physician<br>C : Patient was transported for the nearness of family members<br>D : Patient was transported for the care of a specialist<br>E : Patient Transferred to Rehabilitation Facility||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/lineAmbulanceInformationList/lineAmbulanceInformation/transportReasonCode|transportReasonCode|||
|**916**|2400.CR105|Unit or Basis for Measurement Code|Code specifying the units in which a value is being expressed, or manner in which a measurement has been taken|R|DH : Miles||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/lineAmbulanceInformationList/lineAmbulanceInformation/transportUnitTypeCode|transport unit of measurement like Miles.. Etc|||
|**917**|2400.CR106|Quantity|Transport Distance|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/lineAmbulanceInformationList/lineAmbulanceInformation/transportValueCount|transport distance in miles|||
|**918**|2400.CR109|Description|Round Trip Purpose Description. Required when the ambulance service is for a round<br>trip.|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/lineAmbulanceInformationList/lineAmbulanceInformation/roundTripPurpose|Round trip Purpose description|||
|**919**|2400.CR110|Description|Stretcher Purpose Description|S|||||||
|**920**|CR3|Segment - CR3 Durable Medical Equipment Certification (Situational)|||||||||
|**921**|2400.CR301|Certification Type Code|Code indicating the type of certification|R|I : Initial<br>R : Renewal<br>S : Revised||||||
|**922**|2400.CR302|Unit or Basis for Measurement Code|Code specifying the units in which a value is being expressed, or manner in which a measurement has been taken|R|MO : Months||||||
|**923**|2400.CR303|Quantity|Numeric value of quantity|R|||||||
|**924**|CRC|Segment - CRC Ambulance Certification (Situational)|||||||||
|**925**|2400.CRC01|Code Category|Specifies the situation or category to which the code applies|R|07 : Ambulance Certification||||||
|**926**|2400.CRC02|Yes/No Condition or Response Code|Certification Condition Indicator|R|Y : Yes<br>N : No<br>||||||
|**927**|2400.CRC03|Condition Indicator|Code indicating a condition|R|01 : Patient was admitted to a hospital<br>04 : Patient was moved by stretcher<br>05 : Patient was unconscious or in shock<br>06 : Patient was transported in an emergency situation<br>07 : Patient had to be physically restrained<br>08 : Patient had visible hemorrhaging<br>09 : Ambulance service was medically necessary<br>12 : Patient is confined to a bed or chair||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/lineAmbulanceInformationList/lineAmbulanceInformation/conditionIndicators/conditionCode|Condition Code value|||
|**928**|2400.CRC04|Condition Indicator|Code indicating a condition when a second condition code is necessary|S|01 : Patient was admitted to a hospital<br>04 : Patient was moved by stretcher<br>05 : Patient was unconscious or in shock<br>06 : Patient was transported in an emergency situation<br>07 : Patient had to be physically restrained<br>08 : Patient had visible hemorrhaging<br>09 : Ambulance service was medically necessary<br>12 : Patient is confined to a bed or chair||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/lineAmbulanceInformationList/lineAmbulanceInformation/conditionIndicators/conditionCode|Condition Code value|||
|**929**|2400.CRC05|Condition Indicator|Code indicating a condition when a third condition code is necessary|S|01 : Patient was admitted to a hospital<br>04 : Patient was moved by stretcher<br>05 : Patient was unconscious or in shock<br>06 : Patient was transported in an emergency situation<br>07 : Patient had to be physically restrained<br>08 : Patient had visible hemorrhaging<br>09 : Ambulance service was medically necessary<br>12 : Patient is confined to a bed or chair||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/lineAmbulanceInformationList/lineAmbulanceInformation/conditionIndicators/conditionCode|Condition Code value|||
|**930**|2400.CRC06|Condition Indicator|Code indicating a condition when a fourth condition code is necessary|S|01 : Patient was admitted to a hospital<br>04 : Patient was moved by stretcher<br>05 : Patient was unconscious or in shock<br>06 : Patient was transported in an emergency situation<br>07 : Patient had to be physically restrained<br>08 : Patient had visible hemorrhaging<br>09 : Ambulance service was medically necessary<br>12 : Patient is confined to a bed or chair||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/lineAmbulanceInformationList/lineAmbulanceInformation/conditionIndicators/conditionCode|Condition Code value|||
|**931**|2400.CRC07|Condition Indicator|Code indicating a condition when a fifth condition code is necessary|S|01 : Patient was admitted to a hospital<br>04 : Patient was moved by stretcher<br>05 : Patient was unconscious or in shock<br>06 : Patient was transported in an emergency situation<br>07 : Patient had to be physically restrained<br>08 : Patient had visible hemorrhaging<br>09 : Ambulance service was medically necessary<br>12 : Patient is confined to a bed or chair||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/lineAmbulanceInformationList/lineAmbulanceInformation/conditionIndicators/conditionCode|Condition Code value|||
|**932**|CRC|Segment - CRC Hospice Employee Indicator (Situational)||R|||||||
|**933**|2400.CRC01|Code Category|Specifies the situation or category to which the code applies|R|70 : Hospice||||||
|**934**|2400.CRC02|Yes/No Condition or Response Code|Code indicating a Yes or No condition or response|R|Y : Yes<br>N : No<br>||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/isHospiceEmployee|Hospice Employed Provider Indicator|<br><br>Map 'Y' when CRC02='Y'||
|**935**|2400.CRC03|Condition Indicator|Code indicating a condition|R|65 : Open||||||
|**936**|CRC|Segment - CRC Condition Indicator/Durable Medical Equipment (Situational)|||||||||
|**937**|2400.CRC01|Code Category|Specifies the situation or category to which the code applies|R|09 : Durable Medical Equipment Certification||||||
|**938**|2400.CRC02|Yes/No Condition or Response Code|Code indicating a Yes or No condition or response|R|Y : Yes<br>N : No<br>||||||
|**939**|2400.CRC03|Condition Indicator|Code indicating a condition|R|38 :  Certification signed by the physician is on file at the<br>supplier’s office<br>ZV : Replacement Item||||||
|**940**|2400.CRC04|Condition Indicator|Code indicating a condition|S|38 :  Certification signed by the physician is on file at the<br>supplier’s office<br>ZV : Replacement Item||||||
|**941**|DTP|Segment - DTP Date - Service Date (Required)|||||||||
|**942**|2400.DTP01|Date/Time Qualifier|Code specifying type of date or time, or both date and time|R|472 : Service||||||
|**943**|2400.DTP02|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|RD8 :  Range of Dates Expressed in Format CCYYMMDDCCYYMMDD<br>D8 : Date Expressed in Format CCYYMMDD||||||
|**944**|2400.DTP03 _(rs=2)_|Date Time Period _(rs=2)_|Expression of a date, a time, or range of dates, times or dates and times _(rs=2)_|R _(rs=2)_|_(rs=2)_|20201112 _(rs=2)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/startDate|Start date of service|<br>01-08 -If we receive date format  CCYYMMDD We need to map both start date and end date<br><br><br>byte 1-8 in the format YYYY-MM-DD||
|**945**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/endDate|End date of service|<br><br>byte 10-17 in the format YYYY-MM-DD||
|**946**|DTP|Segment - DTP Date - Prescription Date (Situational)|||||||||
|**947**|2400.DTP01|Date/Time Qualifier|Code specifying type of date or time, or both date and time|R|471 : Prescription||||||
|**948**|2400.DTP02|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 : Date Expressed in Format CCYYMMDD||||||
|**949**|2400.DTP03|Date Time Period|Expression of a date, a time, or range of dates, times or dates and times|R|||||||
|**950**|DTP|Segment - DTP DATE - Certification Revision/Recertification Date (Situational)|||||||||
|**951**|2400.DTP01|Date/Time Qualifier|Code specifying type of date or time, or both date and time|R|607 :  Certification Revision||||||
|**952**|2400.DTP02|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 : Date Expressed in Format CCYYMMDD||||||
|**953**|2400.DTP03|Date Time Period|Expression of a date, a time, or range of dates, times or dates and times|R|||||||
|**954**|DTP|Segment - DTP Date - Begin Therapy Date (Situational)|||||||||
|**955**|2400.DTP01|Date/Time Qualifier|Code specifying type of date or time, or both date and time|R|463 : Begin Therapy||||||
|**956**|2400.DTP02|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 : Date Expressed in Format CCYYMMDD||||||
|**957**|2400.DTP03|Date Time Period|Expression of a date, a time, or range of dates, times or dates and times|R|||||||
|**958**|DTP|Segment - DTP Date - Last Certification Date (Situational)|||||||||
|**959**|2400.DTP01|Date/Time Qualifier|Code specifying type of date or time, or both date and time|R|461 : Last Certification||||||
|**960**|2400.DTP02|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 : Date Expressed in Format CCYYMMDD||||||
|**961**|2400.DTP03|Date Time Period|Expression of a date, a time, or range of dates, times or dates and times|R|||||||
|**962**|DTP|Segment - DTP Date - Last Seen Date (Situational)|||||||||
|**963**|2400.DTP01|Date/Time Qualifier|Code specifying type of date or time, or both date and time|R|304 : Latest Visit or Consultation||||||
|**964**|2400.DTP02|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 : Date Expressed in Format CCYYMMDD||||||
|**965**|2400.DTP03|Date Time Period|Expression of a date, a time, or range of dates, times or dates and times|R|||||||
|**966**|DTP|Segment - DTP Date - Test Date (Situational)|||||||||
|**967**|2400.DTP01|Date/Time Qualifier|Code specifying type of date or time, or both date and time|R|738 :Most Recent Hemoglobin or Hematocrit or Both<br>739 :Most Recent Serum Creatine||||||
|**968**|2400.DTP02|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 : Date Expressed in Format CCYYMMDD||||||
|**969**|2400.DTP03|Date Time Period|Expression of a date, a time, or range of dates, times or dates and times|R|||||||
|**970**|DTP|Segment - DTP Date - Shipped Date (Situational)|||||||||
|**971**|2400.DTP01|Date/Time Qualifier|Code specifying type of date or time, or both date and time|R|011 : Shipped||||||
|**972**|2400.DTP02|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 : Date Expressed in Format CCYYMMDD||||||
|**973**|2400.DTP03|Date Time Period|Expression of a date, a time, or range of dates, times or dates and times|R|||||||
|**974**|DTP|Segment - DTP Date - Last X-ray Date (Situational)|||||||||
|**975**|2400.DTP01|Date/Time Qualifier|Code specifying type of date or time, or both date and time|R|455 : Last X-Ray||||||
|**976**|2400.DTP02|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 : Date Expressed in Format CCYYMMDD||||||
|**977**|2400.DTP03|Date Time Period|Expression of a date, a time, or range of dates, times or dates and times|R|||||||
|**978**|DTP|Segment - DTP Date - Initial Treatment Date (Situational)|||||||||
|**979**|2400.DTP01|Date/Time Qualifier|Code specifying type of date or time, or both date and time|R|454:  Initial Treatment||||||
|**980**|2400.DTP02|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 : Date Expressed in Format CCYYMMDD||||||
|**981**|2400.DTP03|Date Time Period|Expression of a date, a time, or range of dates, times or dates and times|R|||||||
|**982**|QTY|Segment - QTY Ambulance Patient Count (Situational)|||||||||
|**983**|2400.QTY01|Quantity Qualifier|Code specifying the type of quantity|R|PT : Patients||||||
|**984**|2400.QTY02|Quantity|Numeric value of quantity|R|||||||
|**985**|QTY|Segment - QTY Obstetric Anesthesia Additional Units (Situational)|||||||||
|**986**|2400.QTY01|Quantity Qualifier|Code specifying the type of quantity|R|FL : Units||||||
|**987**|2400.QTY02|Quantity|Numeric value of quantity|R|||||||
|**988**|MEA|Segment - MEA Test Result (Situational)|||||||||
|**989**|2400.MEA01|Measurement Reference ID Code|Code identifying the broad category to which a measurement applies|R|OG Original<br>TR Test Results||||||
|**990**|2400.MEA02|Measurement Qualifier|Code identifying a specific product or process characteristic to which a<br>measurement applies|R|HT Height<br>R1 Hemoglobin<br>R2 Hematocrit<br>R3 Epoetin Starting Dosage<br>R4 Creatinine||||||
|**991**|2400.MEA03|Measurement Value|The value of the measurement|R|||||||
|**992**|CN1|Segment - CN1 Contract Information (Situational)|||||||||
|**993**|2400.CN101|Contract Type Code|Code identifying a contract type|R|01 : Diagnosis Related Group (DRG)<br>02 : Per Diem<br>03 : Variable Per Diem<br>04 : Flat<br>05 : Capitated<br>06 : Percent<br>09 : Other||||||
|**994**|2400.CN102|Monetary Amount|Monetary Amount|S|||||||
|**995**|2400.CN103|Percent, Decimal Format|Percent given in decimal format|S|||||||
|**996**|2400.CN104|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier /: Contract Code|S|||||||
|**997**|2400.CN105|Terms Discount Percent|Terms discount percentage, expressed as a percent, available to the purchaser if<br>an invoice is paid on or before the Terms Discount Due Date|S|||||||
|**998**|2400.CN106|Version Identifier|Revision level of a particular format, program, technique or algorithm|S|||||||
|**999**|REF|Segment - REF Line Item Control Number (Situational)|||||||||
|**1000**|2400.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|6R : Provider Control Number||||||
|**1001**|2400.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier|R|||||||
|**1002**|REF|Segment - REF Repriced Line Item Reference Number (Situational)|||||||||
|**1003**|2400.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|9B : Repriced Line Item Reference Number||||||
|**1004**|2400.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier|R|||||||
|**1005**|REF|Segment - REF Adjusted Repriced Line Item Reference Number (Situational)|||||||||
|**1006**|2400.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|9D : Adjusted Repriced Line Item Reference Number||||||
|**1007**|2400.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier|R|||||||
|**1008**|REF|Segment - REF Prior Authorization (Situational)|||||||||
|**1009**|2400.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|G1 : Prior Authorization Number||||||
|**1010**|2400.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier|R|||||||
|**1011**|2400.REF04.01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|2U : Payer Identification Number||||||
|**1012**|2400.REF04.02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier|R|||||||
|**1013**|REF|Segment - REF Mammography Certification Number (Situational)|||||||||
|**1014**|2400.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|EW : Mammography Certification Number||||||
|**1015**|2400.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier|R|||||||
|**1016**|REF|Segment - REF Clinical Laboratory Improvement Amendment (CLIA) Number (Situational)|||||||||
|**1017**|2400.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|X4 : Clinical Laboratory Improvement Amendment<br>Number||||||
|**1018**|2400.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier|R|||||||
|**1019**|REF|Segment - REF Immunization Batch Number (Situational)|||||||||
|**1020**|2400.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|BT : Batch Number||||||
|**1021**|2400.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier|R|||||||
|**1022**|REF|Segment - REF Referral Number (Situational)|||||||||
|**1023**|2400.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|9F  :Referral Number||||||
|**1024**|2400.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier|R|||||||
|**1025**|2400.REF04.01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|2U : Payer Identification Number||||||
|**1026**|2400.REF04.02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier|R|||||||
|**1027**|AMT|Segment - AMT Sales Tax Amount (Situational)|||||||||
|**1028**|2400.AMT01|Amount Qualifier Code|Code to qualify amount|R|T :Tax||||||
|**1029**|2400.AMT02|Monetary Amount|Monetary Amount|R||||||COB related|
|**1030**|AMT|Segment - AMT Postage Claimed Amount (Situational)|||||||||
|**1031**|2400.AMT01|Amount Qualifier Code|Code to qualify amount|R|F4 : Postage Claimed||||||
|**1032**|2400.AMT02|Monetary Amount|Monetary Amount|R|||||||
|**1033**|K3|Segment - K3 File Information (Situational)|||||||||
|**1034**|2400.K301|Fixed Format Information|Data in fixed format agreed upon by sender and receiver|R|||||||
|**1035**|NTE|Segment - NTE Line Note (Situational)|||||||||
|**1036**|2400.NTE01|Note Reference Code|Code identifying the functional area or purpose for which the note applies|R|ADD :Additional Information<br>DCP: Goals, Rehabilitation Potential, or Discharge Plans||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/lineItemRemark/remarkCode||||
|**1037**|2400.NTE02|Description|A free-form description to clarify the related data elements and their content|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/lineItemRemark/remark|Remarks added for Service line|||
|**1038**|NTE|Segment - NTE Third Party Organization Notes (Situational)|||||||||
|**1039**|2400.NTE01|Note Reference Code|Code identifying the functional area or purpose for which the note applies|R|TPO : Third Party Organization Notes||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/lineItemRemark/remarkCode||||
|**1040**|2400.NTE02|Description|A free-form description to clarify the related data elements and their content|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/lineItemRemark/remark|Remarks added for Service line|||
|**1041**|PS1|Segment - PS1 Purchased Service Information (Situational)|||||||||
|**1042**|2400.PS101|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier|R|||||||
|**1043**|2400.PS102|Monetary Amount|Monetary Amount|R|||||||
|**1044**|HCP|Segment - HCP Line Pricing/Repricing Information (Situational)|||||||||
|**1045**|2400.HCP01|Pricing Methodology|Code specifying pricing methodology at which the claim or line item has been<br>priced or repriced|R|00: Zero Pricing (Not Covered Under Contract)<br>01: Priced as Billed at 100%<br>02 :Priced at the Standard Fee Schedule<br>03 :Priced at a Contractual Percentage<br>04 : Bundled Pricing<br>05 : Peer Review Pricing<br>06 : Per Diem Pricing<br>07 : Flat Rate Pricing<br>08  :Combination Pricing<br>09 : Maternity Pricing<br>10 : Other Pricing<br>11 : Lower of Cost<br>12 : Ratio of Cost<br>13 : Cost Reimbursed<br>14 : Adjustment Pricing||||||
|**1046**|2400.HCP02|Monetary Amount|Monetary Amount|R||||Amount allowed by the repricer|||
|**1047**|2400.HCP03|Monetary Amount|Monetary Amount|S|||||||
|**1048**|2400.HCP04|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifie /Repricing Organization Identifier|S||||ID of the repricing source|||
|**1049**|2400.HCP05|Rate|Rate expressed in the standard monetary denomination for the currency specified|S|||||||
|**1050**|2400.HCP06|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier /Repriced Approved Ambulatory Patient Group<br>Code|S|||||||
|**1051**|2400.HCP07|Monetary Amount||S|||||||
|**1052**|2400.HCP09|Product/Service ID Qualifier|Code identifying the type/source of the descriptive number used in<br>Product/Service ID|S|ER : Jurisdiction Specific Procedure and Supply Codes<br>HC :Health Care Financing Administration Common<br>Procedural Coding System (HCPCS) Codes<br>IV : Home Infusion EDI Coalition (HIEC) Product/Service<br>Code<br>WK : Advanced Billing Concepts (ABC) Codes||||||
|**1053**|2400.HCP10|Product/Service ID|Identifying number for a product or service|S|||||||
|**1054**|2400.HCP11|Unit or Basis for Measurement Code|Code specifying the units in which a value is being expressed, or manner in which a measurement has been taken|S|MJ : Minutes<br>UN: Unit||||||
|**1055**|2400.HCP12|Quantity|Numeric value of quantity|S|||||||
|**1056**|2400.HCP13|Reject Reason Code|Code assigned by issuer to identify reason for rejection|S|T1 :Cannot Identify Provider as TPO (Third Party<br>Organization) Participant<br>T2 :Cannot Identify Payer as TPO (Third Party<br>Organization) Participant<br>T3 :Cannot Identify Insured as TPO (Third Party<br>Organization) Participant<br>T4 :Payer Name or Identifier Missing<br>T5 :Certification Information Missing<br>T6 :Claim does not contain enough information for repricing|||Reject reason code|||
|**1057**|2400.HCP14|Policy Compliance Code|Code specifying policy compliance|S|1 :Procedure Followed (Compliance)<br>2:Not Followed - Call Not Made (Non-Compliance Call<br>Not Made)<br>3: Not Medically Necessary (Non-Compliance NonMedically Necessary)<br>4 :Not Followed Other (Non-Compliance Other)<br>5 : Emergency Admit to Non-Network Hospital||||||
|**1058**|2400.HCP15|Exception Code|Code specifying the exception reason for consideration of out-of-network health<br>care services|S|1 :Non-Network Professional Provider in Network<br>Hospital<br>2 :Emergency Care<br>3: Services or Specialist not in Network<br>4 :Out-of-Service Area<br>5 :State Mandates<br>6 :Other||||||
|**1059**|Loop 2410  — DRUG IDENTIFICATION Drug identification Loop Repeat: 1 _(cs=10)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**1060**|LIN|Segment - LIN Drug identification (Situational)|||||||||
|**1061**|2410.LIN02|Product/Service ID Qualifier|Code identifying the type/source of the descriptive number used in<br>Product/Service ID|R|N4 : National Drug Code in 5-4-2 Format||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/ndcCodes/qualifier<br><br>Xwalk  N4  as ND to qualifier<br>UP dont require a Xwalk<br>(Birdsong)||Map N4 as 'ND'|need to check the x walk/configuration team|
|**1062**|2410.LIN03|Product/Service ID|Identifying number for a product or service|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/ndcCodes/ndcCode|NationalDrugCodereference.|||
|**1063**|CTP|Segment - CTP Drug Quantity (Required)|||||||||
|**1064**|2410.CTP04|Quantity|Numeric value of quantity|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/ndcCodes/quantity|Quantity; maximum of 8 digits.|||
|**1065**|2410.CTP05-1|COMPOSITE UNIT OF MEASURE-Unit or Basis for Measurement Code|To identify a composite unit of measure. Code specifying the units in which a value is being expressed, or<br>manner in which a measurement has been taken|R|F2 : International Unit <br>GR : Gram <br>ME :Milligram <br>ML :Milliliter <br>UN :Unit||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/ndcCodes/measurementType|Identifies the unit of measurement,such as ML (milliliter),OU (ounce),etc.|||
|**1066**|REF|Segment - REF Prescription or Compound Drug Association Number (Situational)|||||||||
|**1067**|2410.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|VY : Link Sequence Number <br>XZ : Pharmacy Prescription Number||||||
|**1068**|2410.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier|R|||||||
|**1069**|Loop 2420A  — RENDERING PROVIDER NAME(Situational) Loop Repeat: 1 _(cs=10)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**1070**|NM1|Segment - NM1 Renderring Physician Name (Situational)|||||||||
|**1071**|2420A.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R|82 : Rendering Provider||||||
|**1072**|2420A.NM102|Entity Type Qualifier|Code qualifying the type of entity|R|1 : Person<br>2 : Non-Person Entity||||||
|**1073**|2420A.NM103|Name Last or Organization Name|Individual last name or organizational name|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/renderingProviderLastName|Rendering Provider's Last Name|||
|**1074**|2420A.NM104|Name First|Individual first name|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/renderingProviderFirstName|Rendering Provider's First Name|||
|**1075**|2420A.NM105|Name Middle|Individual middle name or initial|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/renderingProviderMiddleName||||
|**1076**|2420A.NM107|Name Suffix|Suffix to individual name|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/renderingProviderSuffix||||
|**1077**|2420A.NM108|Identification Code Qualifier|Code designating the system/method of code structure used for Identification Code|S|XX :  Centers for Medicare and Medicaid Services<br>National Provider Identifier||||||
|**1078**|2420A.NM109|Identification Code|Code identifying a party or other code /: Rendering Provider Identifier|S|1000959250||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/renderingProviderNPI|Rendering Provider's National Provider Id|||
|**1079**|PRV|Segment - PRV Rendering Provider Specialty Information (Situational)|||||||||
|**1080**|2420A.PRV01|Provider Code|Code identifying the type of provider|R|PE : Performing||||||
|**1081**|2420A.PRV02|Reference Identification Qualifier|Code qualifying the Reference Identification|R|PXC : Health Care Provider Taxonomy Code||||||
|**1082**|2420A.PRV03|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier|R||1041C0700X|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/renderingPractitionerSpecialty|Rendering Provider's Speciality|||
|**1083**|REF|Segment - REF Rendering Provider Secondary Identification (Situational)|||||||||
|**1084**|2420A.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|0B: State License Number<br>1G : Provider UPIN Number<br>G2 : Provider Commercial Number<br>LU : Location Number||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/renderingProviderIdQualifier|Rendering provider secondary id type|||
|**1085**|2420A.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/otherRenderingProviderId|Rendering Provider's Id|||
|**1086**|2420A.REF04.01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|2U : Payer Identification Number||||||
|**1087**|2420A.REF04.02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier|R|||||||
|**1088**|Loop 2420B  — PURCHASED SERVICE PROVIDER NAME (Situational) Loop Repeat: 1 _(cs=10)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**1089**|NM1|Segment - NM1 Purchased Service Provider Name (Situational)|||||||||
|**1090**|2420B.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R|QB : Purchase Service Provider||||||
|**1091**|2420B.NM102|Entity Type Qualifier|Code qualifying the type of entity|R|1 : Person<br>2 : Non-Person Entity||||||
|**1092**|2420B.NM108|Identification Code Qualifier|Code designating the system/method of code structure used for Identification<br>Code|S|XX :  Centers for Medicare and Medicaid Services<br>National Provider Identifier||||||
|**1093**|2420B.NM109|Identification Code|Code identifying a party or other code|S|||||||
|**1094**|REF|Segment - REF Purchased Service Provider Secondary Identification (Situational)|||||||||
|**1095**|2420B.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|0B: State License Number<br>1G : Provider UPIN Number<br>G2 : Provider Commercial Number||||||
|**1096**|2420B.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier|R|||||||
|**1097**|2420B.REF04.01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|2U : Payer Identification Number||||||
|**1098**|2420B.REF04.02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier|R|||||||
|**1099**|Loop 2420C  — SERVICE FACILITY LOCATION NAME  (Situational) Loop Repeat: 1 _(cs=10)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**1100**|NM1|Segment - NM1 Service Facility Location Name (Situational)|||||||||
|**1101**|2420C.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R|77 : Service Location||||||
|**1102**|2420C.NM102|Entity Type Qualifier|Code qualifying the type of entity|R|2 :Non-Person Entity||||||
|**1103**|2420C.NM103|Name Last or Organization Name|Individual last name or organizational name|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/outsideLabUsed/labName|Name of Lab/facility|||
|**1104**|2420C.NM108|Identification Code Qualifier|Code designating the system/method of code structure used for Identification<br>Code|S|XX :  Centers for Medicare and Medicaid Services<br>National Provider Identifier||||||
|**1105**|2420C.NM109|Identification Code|Code identifying a party or other code|S|||||||
|**1106**|N3|Segment - N3 Service Facility Location Address (Required)|||||||||
|**1107**|2420C.N301|Address Information|Address Information|R|||||||
|**1108**|2420C.N302|Address Information|Address Information|S|||||||
|**1109**|N4|Segment - N4 Service Facility Location City, State, ZIP Code (Required)|||||||||
|**1110**|2420C.N401|City Name|Free-form text for city name|R|||||||
|**1111**|2420C.N402|State or Province Code|Code (Standard State/Province) as defined by appropriate government agency|S|||||||
|**1112**|2420C.N403|Postal Code|Code defining international postal zone code excluding punctuation and blanks (zip code for United States)|S|||||||
|**1113**|2420C.N404|Country Code|Code identifying the country|S|||||||
|**1114**|2420C.N407|Country Subdivision Code|Code identifying the country subdivision|S|||||||
|**1115**|REF|Segment - REF Service Facility Location Secondary Identification (Situational)|||||||||
|**1116**|2420C.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|LU : Location Number<br>G2 : Provider Commercial Number||||||
|**1117**|2420C.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier|R|||||||
|**1118**|2420C.REF04.01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|2U : Payer Identification Number||||||
|**1119**|2420C.REF04.02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier|R|||||||
|**1120**|Loop 2420D — SUPERVISING PROVIDER NAME (Situational) Loop Repeat: 1 _(cs=10)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**1121**|NM1|Segment - NM1 Supervising Provider Name (Situational)|||||||||
|**1122**|2420D.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R|DQ : Supervising Physician||||||
|**1123**|2420D.NM102|Entity Type Qualifier|Code qualifying the type of entity|R|1 : Person||||||
|**1124**|2420D.NM103|Name Last or Organization Name|Individual last name or organizational name|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/lineSupervisingPhysicianInformation/lastName||||
|**1125**|2420D.NM104|Name First|Individual first name|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/lineSupervisingPhysicianInformation/firstName||||
|**1126**|2420D.NM105|Name Middle|Individual middle name or initial|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/lineSupervisingPhysicianInformation/middleInitial||||
|**1127**|2420D.NM107|Name Suffix|Suffix to individual name|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/lineSupervisingPhysicianInformation/suffix||||
|**1128**|2420D.NM108|Identification Code Qualifier|Code designating the system/method of code structure used for Identification Code|S|XX :  Centers for Medicare and Medicaid Services<br>National Provider Identifier||||||
|**1129**|2420D.NM109|Identification Code|Code identifying a party or other code|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/lineSupervisingPhysicianInformation/npi||||
|**1130**|REF|Segment - REF Supervising Provider Secondary Identification (Situational)|||||||||
|**1131**|2420D.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|0B: State License Number<br>1G : Provider UPIN Number<br>G2 : Provider Commercial Number<br>LU: Location Number||<!-- NOTE: Removed serviceLineItems/serviceLineItem/lineSupervisingPhysicianInformation/otherIdType mapping since this not in XML structure -->||||
|**1132**|2420D.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/lineSupervisingPhysicianInformation/otherId||||
|**1133**|2420D.REF04.01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|2U : Payer Identification Number||||||
|**1134**|2420D.REF04.02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier|R|||||||
|**1135**|Loop 2420E — ORDERING PROVIDER NAME (Situational) Loop Repeat: 1 _(cs=10)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**1136**|NM1|Segment - NM1 Ordering Provider Name (Situational)|||||||||
|**1137**|2420E.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an individual|R|DK :Ordering Physician||||||
|**1138**|2420E.NM102|Entity Type Qualifier|Code qualifying the type of entity|R|1 : Person||||||
|**1139**|2420E.NM103|Name Last or Organization Name|Individual last name or organizational name|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/lineOrderingPhysicianInformation/lastName||||
|**1140**|2420E.NM104|Name First|Individual first name|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/lineOrderingPhysicianInformation/firstName||||
|**1141**|2420E.NM105|Name Middle|Individual middle name or initial|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/lineOrderingPhysicianInformation/middleName||||
|**1142**|2420E.NM107|Name Suffix|Suffix to individual name|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/lineOrderingPhysicianInformation/suffix||||
|**1143**|2420E.NM108|Identification Code Qualifier|Code designating the system/method of code structure used for Identification<br>Code (67)|S|XX :  Centers for Medicare and Medicaid Services<br>National Provider Identifier||||||
|**1144**|2420E.NM109|Identification Code|Code identifying a party or other code|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/lineOrderingPhysicianInformation/npi||||
|**1145**|N3|Segment - N3 Ordering Provider Address (Situational)|||||||||
|**1146**|2420E.N301|Address Information|Address Information|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/lineOrderingPhysicianInformation/address||||
|**1147**|2420E.N302|Address Information|Address Information|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/lineOrderingPhysicianInformation/address2||||
|**1148**|N4|Segment - N4 Ordering Provider City, State, ZIP Code (Situational)|||||||||
|**1149**|2420E.N401|City Name|Free-form text for city name|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/lineOrderingPhysicianInformation/city||||
|**1150**|2420E.N402|State or Province Code|Code (Standard State/Province) as defined by appropriate government agency|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/lineOrderingPhysicianInformation/stateCode||||
|**1151**|2420E.N403 _(rs=2)_|Postal Code _(rs=2)_|Code defining international postal zone code excluding punctuation and blanks (zip code for United States) _(rs=2)_|S _(rs=2)_|_(rs=2)_|_(rs=2)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/lineOrderingPhysicianInformation/zipCode||byte 1-5||
|**1152**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/lineOrderingPhysicianInformation/zipSuffixCode||<br>byte 6-9||
|**1153**|2420E.N404|Country Code|Code identifying the country|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/lineOrderingPhysicianInformation/countryCode/countryCode||Map to the value "US" if not present||
|**1154**|2420E.N407|Country Subdivision Code|Code identifying the country subdivision|S|||||||
|**1155**|REF|Segment - REF Ordering Provider Secondary Identification (Situational)|||||||||
|**1156**|2420E.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|0B: State License Number<br>1G : Provider UPIN Number<br>G2 : Provider Commercial Number<br>||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/lineOrderingPhysicianInformation/otherIdType||||
|**1157**|2420E.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/lineOrderingPhysicianInformation/otherId||||
|**1158**|2420E.REF04.01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|2U  :Payer Identification Number||||||
|**1159**|2420E.REF04.02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier|R|||||||
|**1160**|PER|Segment - PER Ordering Provider Contact Information (Situational)|||||||||
|**1161**|2420E.PER01|Contact Function Code|Code identifying the major duty or responsibility of the person or group named|R|IC -  Information Contact||||||
|**1162**|2420E.PER02|Name|Submitter Contact Name|S|<<Submitter Name>>||||||
|**1163**|2420E.PER03|Communication Number Qualifier|Code identifying the type of communication number|R|"EM" : Electronic Mail<br>"FX" : Facsimile<br>"TE" : Telephone||||||
|**1164**|2420E.PER04|Communication Number|Complete communications number including country or area code when applicable|R|||||||
|**1165**|2420E.PER05|Communication Number Qualifier|Code identifying the type of communication number|S|"EM" : Electronic Mail<br>"FX" : Facsimile<br>"TE" : Telephone||||||
|**1166**|2420E.PER06|Communication Number|Complete communications number including country or area code when applicable|S|||||||
|**1167**|2420E.PER07|Communication Number Qualifier|Code identifying the type of communication number|S|"EM" : Electronic Mail<br>"FX" : Facsimile<br>"TE" : Telephone||||||
|**1168**|2420E.PER08|Communication Number|Complete communications number including country or area code when applicable|S|||||||
|**1169**|Loop 2420F — REFERRING PROVIDER NAME (Situational) Loop Repeat: 2 _(cs=10)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**1170**|NM1|Segment - NM1 Referring Provider Name (Situational)|||||||||
|**1171**|2420F.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an individual|R|DN :Referring Provider<br>P3 :Primary Care Provider||||||
|**1172**|2420F.NM102|Entity Type Qualifier|Code qualifying the type of entity|R|||||||
|**1173**|2420F.NM103|Name Last or Organization Name|Individual last name or organizational name|R|||||||
|**1174**|2420F.NM104|Name First|Individual first name|S|||||||
|**1175**|2420F.NM105|Name Middle|Individual middle name or initial|S|||||||
|**1176**|2420F.NM107|Name Suffix|Suffix to individual name|S|||||||
|**1177**|2420F.NM108|Identification Code Qualifier|Code designating the system/method of code structure used for Identification<br>Code (67)|S|XX :  Centers for Medicare and Medicaid Services<br>National Provider Identifier||||||
|**1178**|2420F.NM109|Identification Code|Code identifying a party or other code|S|||||||
|**1179**|REF|Segment - REF Referring Provider Secondary Identification (Situational)|||||||||
|**1180**|2420F.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|0B: State License Number<br>1G : Provider UPIN Number<br>G2 : Provider Commercial Number<br>||||||
|**1181**|2420F.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier|R|||||||
|**1182**|2420F.REF04.01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|2U : Payer Identification Number||||||
|**1183**|2420F.REF04.02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier|R|||||||
|**1184**|Loop 2420G — AMBULANCE PICK-UP LOCATION (Situational) Loop Repeat: 1 _(cs=10)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**1185**|NM1|Segment - NM1 Ambulance Pick-up Location (Situational)|||||||||
|**1186**|2420G.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R|PW : Pickup Address||||||
|**1187**|2420G.NM102|Entity Type Qualifier|Code qualifying the type of entity|R|2 : Non-Person Entity||||||
|**1188**|N3|Segment- N3 Ambulance Pick-up Location Address (Required)|||||||||
|**1189**|2420G.N301|Address Information|Address Information|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/lineAmbulanceInformationList/lineAmbulanceInformation/pickupAddress/address|Address line 1|||
|**1190**|2420G.N302|Address Information|Address Information|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/lineAmbulanceInformationList/lineAmbulanceInformation/pickupAddress/address2|Address line 2|||
|**1191**|N4|Segment - N4 Ambulance Pick-up Location City, State, ZIP Code (Required)|||||||||
|**1192**|2420G.N401|City Name|Free-form text for city name|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/lineAmbulanceInformationList/lineAmbulanceInformation/pickupAddress/city||||
|**1193**|2420G.N402|State or Province Code|Code (Standard State/Province) as defined by appropriate government agency|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/lineAmbulanceInformationList/lineAmbulanceInformation/pickupAddress/stateCode||||
|**1194**|2420G.N403 _(rs=2)_|Postal Code _(rs=2)_|Code defining international postal zone code excluding punctuation and blanks (zip code for United States) _(rs=2)_|S _(rs=2)_|_(rs=2)_|_(rs=2)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/lineAmbulanceInformationList/lineAmbulanceInformation/pickupAddress/zipCode|Zip Code<br>1-5 digits|Zip Code<br>1-5 digits||
|**1195**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/lineAmbulanceInformationList/lineAmbulanceInformation/pickupAddress/zipSuffixCode|<br>Zip Code Suffix<br><br>6-9 digits|<br>Zip Code Suffix<br><br>6-9 digits||
|**1196**|2420G.N404|Country Code|Code identifying the country|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/lineAmbulanceInformationList/lineAmbulanceInformation/pickupAddress/countryCode/countryCode||Map to the value "US" if not present||
|**1197**|2420G.N407|Country Subdivision Code|Code identifying the country subdivision|S|||||||
|**1198**|Loop 2420H  — AMBULANCE DROP-OFF LOCATION (Situational) Loop Repeat: 1 _(cs=10)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**1199**|NM1|Segment - NM1 Ambulance Drop-off Location (Situational)|||||||||
|**1200**|2420H.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R|45 :  Drop-off Location||||||
|**1201**|2420H.NM102|Entity Type Qualifier|Code qualifying the type of entity|R|2 : Non-Person Entity||||||
|**1202**|2420H.NM103|Name Last or Organization Name|Individual last name or organizational name|S|||||||
|**1203**|N3|Segment - N3 Ambulance Drop-off Location Address (Required)|||||||||
|**1204**|2420H.N301|Address Information|Address Information|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/lineAmbulanceInformationList/lineAmbulanceInformation/dropOffAddress/address|Address line 1|||
|**1205**|2420H.N302|Address Information|Address Information|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/lineAmbulanceInformationList/lineAmbulanceInformation/dropOffAddress/address2|Address line 2|||
|**1206**|N4|Segment - N4 Ambulance Drop-off Location City, State, ZIP Code (Required)|||||||||
|**1207**|2420H.N401|City Name|Free-form text for city name|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/lineAmbulanceInformationList/lineAmbulanceInformation/dropOffAddress/city|City|||
|**1208**|2420H.N402|State or Province Code|Code (Standard State/Province) as defined by appropriate government agency|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/lineAmbulanceInformationList/lineAmbulanceInformation/dropOffAddress/stateCode|State|||
|**1209**|2420H.N403 _(rs=2)_|Postal Code _(rs=2)_|Code defining international postal zone code excluding punctuation and blanks (zip code for United States) _(rs=2)_|S _(rs=2)_|_(rs=2)_|_(rs=2)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/lineAmbulanceInformationList/lineAmbulanceInformation/dropOffAddress/zipCode|Zip Code<br>|Zip Code<br>1-5 digits||
|**1210**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/lineAmbulanceInformationList/lineAmbulanceInformation/dropOffAddress/zipSuffixCode|Zip Code Suffix|<br>Zip Code Suffix<br><br>6-9 digits||
|**1211**|2420H.N404|Country Code|Code identifying the country|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/lineAmbulanceInformationList/lineAmbulanceInformation/dropOffAddress/countryCode/countryCode|Country|Map to the value "US" if not present||
|**1212**|2420H.N407|Country Subdivision Code|Code identifying the country subdivision|S|||||||
|**1213**|Loop 2430   — LINE ADJUDICATION INFORMATION(Situational) Loop Repeat: 15<br><br>1. Service line cob mapping under - /invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation will happen based upon the matching of 2430.SVD01 against the 2330B.NM109.<br><br>2. The below header/sub tag mapping will have sum of all the different payer amounts for each of the service line.<br>/serviceLineItem/eobPaymentInformation<br><br> _(cs=10)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**1214**|SVD|Segment - SVD Line Adjudication Information (Situational)|||||||||
|**1215**|2430.SVD01|Identification Code|Code identifying a party or other code|R||611X1|||This is matched against 2330B.NM109||
|**1216**|2430.SVD02 _(rs=4)_|Monetary Amount _(rs=4)_|Monetary Amount _(rs=4)_|R _(rs=4)_|_(rs=4)_|_(rs=4)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/netPaidAmount|Net Paid Amount|||
|**1217**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/netPaidAmount|Net Paid Amount|||
|**1218**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/allowedAmount||Sum netpaid amount (2430.SVD02) and CAS*PR amounts for the payer in line level - 2430 loop and map to this field||
|**1219**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/allowedAmount||Sum netpaid amount (2430.SVD02) and CAS*PR amounts of all payers in line level (all 2430 loops) and map to this field||
|**1220**|2430.SVD03.01|Product/Service ID Qualifier|Code identifying the type/source of the descriptive number used in Product/Service ID|R|ER : Jurisdiction Specific Procedure and Supply Codes<br>HC : Health Care Financing Administration Common<br>Procedural Coding System (HCPCS) Codes<br>IV :Home Infusion EDI Coalition (HIEC) Product/Service<br>Code|HC|||||
|**1221**|2430.SVD03.02|Product/Service ID|Identifying number for a product or service|R||90837|||||
|**1222**|2430.SVD03.03|Procedure Modifier|This identifies special circumstances related to the performance of the<br>service, as defined by trading partners|S||HE|||||
|**1223**|2430.SVD03.04|Procedure Modifier|This identifies special circumstances related to the performance of the service, as defined by trading partners|S||GT|||||
|**1224**|2430.SVD03.05|Procedure Modifier|This identifies special circumstances related to the performance of the service, as defined by trading partners|S||GT|||||
|**1225**|2430.SVD03.06|Procedure Modifier|This identifies special circumstances related to the performance of the service, as defined by trading partners|S||GT|||||
|**1226**|2430.SVD03.07|Description|A free-form description to clarify the related data elements and their<br>content|S|||||||
|**1227**|2430.SVD05|Quantity|Numeric value of quantity/: Paid Service Unit Count|R|||||||
|**1228**|2430.SVD06|Assigned Number|Number assigned for differentiation within a transaction set/: Bundled or Unbundled Line Number|S|||||||
|**1229**|CAS|Segment - CAS Line Adjustment (Situational)|2430 CAS codes received on the each individual service line needs to be mapped to casCodes under “lineeobinformation/lineeobcasCodes”||||||||
|**1230**|2430.CAS01|Claim Adjustment Group Code|Code identifying the general category of payment adjustment|R|CO : Contractual Obligations<br>CR : Correction and Reversals<br>OA : Other adjustments<br>PI : Payor Initiated Reductions<br>PR : Patient Responsibility||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/lineCasCodes/casCode/groupCode|Group Code|||
|**1231**|||||||/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/lineEobCasCodes/casCode/groupCode|Group Code|||
|**1232**|2430.CAS02|Claim Adjustment Reason Code|Code identifying the detailed reason the adjustment was made|R|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/lineCasCodes/casCode/casCode|CAS code|||
|**1233**|||||||professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/lineEobCasCodes/casCode|CAS code|||
|**1234**|2430.CAS03 _(rs=17)_|Monetary Amount<br> _(rs=17)_|Monetary Amount<br> _(rs=17)_|R _(rs=17)_|_(rs=17)_|_(rs=17)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/deductibleAmount|Deductible amount|When CAS01='PR' and CAS02='1'||
|**1235**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/coInsuranceAmount|Coinsurance amount.|When CAS01='PR' and CAS02='2'||
|**1236**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/copayAmount|Copay amount|When CAS01='PR' and CAS02='3'||
|**1237**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/memberPenalty|Member penalty.|When CAS01='PR' and CAS02=225/237/B4||
|**1238**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/providerPenalty|Provider penalty.|When CAS01='CO' and CAS02=225/237/B4||
|**1239**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/taxAmount|Tax amount|When CAS01='CO' and CAS02='105'||
|**1240**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/nonCoveredAmount|Non-covered amount.|When CAS01='CO' and CAS02='96'<br><br>Please refer the Comments|All 2430.CAS03 / 2430.CAS06 /2430.CAS09 /2430.CAS12/2430.CAS15/2430.CAS18 Amounts  for all 2430.CAS01-2430.CAS02/05/08/11/14/17 combinations which are not explicitly mentioned in 2430.CAS segment mapping  will also get  added to the  /professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/nonCoveredAmount|
|**1241**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/discountAmount|Discount amount|]=||
|**1242**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/deductibleAmount|Deductible amount|When CAS01='PR' and CAS02='1'||
|**1243**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/coInsuranceAmount|Coinsurance amount.|When CAS01='PR' and CAS02='2'||
|**1244**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/copayAmount|Copay amount|When CAS01='PR' and CAS02='3'||
|**1245**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/memberPenalty|Member penalty.|When CAS01='PR' and CAS02=225/237/B4||
|**1246**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/providerPenalty|Provider penalty.|When CAS01='CO' and CAS02=225/237/B4||
|**1247**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/taxAmount|Tax amount|When CAS01='CO' and CAS02='105'||
|**1248**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/nonCoveredAmount|Non-covered amount.|When CAS01='CO' and CAS02='96'<br><br>Please refer the Comments|All 2430.CAS03 / 2430.CAS06 /2430.CAS09 /2430.CAS12/2430.CAS15/2430.CAS18 Amounts  for all 2430.CAS01-2430.CAS02/05/08/11/14/17 combinations which are not explicitly mentioned in 2430.CAS segment mapping  will also get  added to the  professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/nonCoveredAmount.|
|**1249**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/discountAmount|Discount amount|When CAS01='CO' and CAS02='45'||
|**1250**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/lineCasCodes/casCode/amount|Amount|||
|**1251**|2430.CAS04|Quantity|Numeric value of quantity|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/lineCasCodes/casCode/quantity|Quantity|||
|**1252**|||||||/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/lineEobCasCodes/casCode/quantity|Quantity|||
|**1253**|2430.CAS05|Claim Adjustment Reason Code|Code identifying the detailed reason the adjustment was made|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/lineCasCodes/casCode/casCode|CAS code|||
|**1254**|2430.CAS06 _(rs=17)_|Monetary Amount<br> _(rs=17)_|Monetary amount _(rs=17)_|S _(rs=17)_|_(rs=17)_|_(rs=17)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/deductibleAmount|Deductible amount|When CAS01='PR' and CAS05='1'||
|**1255**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/coInsuranceAmount|Coinsurance amount.|When CAS01='PR' and CAS05='2'||
|**1256**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/copayAmount|Copay amount|When CAS01='PR' and CAS05='3'||
|**1257**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/memberPenalty|Member penalty.|When CAS01='PR' and CAS05=225/237/B4||
|**1258**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/providerPenalty|Provider penalty.|When CAS01='CO' and CAS05=225/237/B4||
|**1259**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/taxAmount|Tax amount|When CAS01='CO' and CAS05='105'||
|**1260**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/nonCoveredAmount|Non-covered amount.|When CAS01='CO' and CAS05='96'<br><br>Please refer the Comments|All 2430.CAS03 / 2430.CAS06 /2430.CAS09 /2430.CAS12/2430.CAS15/2430.CAS18 Amounts  for all 2430.CAS01-2430.CAS02/05/08/11/14/17 combinations which are not explicitly mentioned in 2430.CAS segment mapping  will also get  added to the  /professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/nonCoveredAmount|
|**1261**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/discountAmount|Discount amount|When CAS01='CO' and CAS05='45'||
|**1262**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/deductibleAmount|Deductible amount|When CAS01='PR' and CAS05='1'||
|**1263**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/coInsuranceAmount|Coinsurance amount.|When CAS01='PR' and CAS05='2'||
|**1264**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/copayAmount|Copay amount|When CAS01='PR' and CAS05='3'||
|**1265**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/memberPenalty|Member penalty.|When CAS01='PR' and CAS05=225/237/B4||
|**1266**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/providerPenalty|Provider penalty.|When CAS01='CO' and CAS05=225/237/B4||
|**1267**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/taxAmount|Tax amount|When CAS01='CO' and CAS05='105'||
|**1268**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/nonCoveredAmount|Non-covered amount.|When CAS01='CO' and CAS05='96'<br><br>Please refer the Comments|All 2430.CAS03 / 2430.CAS06 /2430.CAS09 /2430.CAS12/2430.CAS15/2430.CAS18 Amounts  for all 2430.CAS01-2430.CAS02/05/08/11/14/17 combinations which are not explicitly mentioned in 2430.CAS segment mapping  will also get  added to the  professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/nonCoveredAmount.|
|**1269**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/discountAmount|Discount amount|When CAS01='CO' and CAS05='45'||
|**1270**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/lineCasCodes/casCode/amount|Amount|||
|**1271**|2430.CAS07|Quantity|Numeric value of quantity|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/lineCasCodes/casCode/quantity|Quantity|||
|**1272**|2430.CAS08|Claim Adjustment Reason Code|Code identifying the detailed reason the adjustment was made|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/lineCasCodes/casCode/casCode|CAS code|||
|**1273**|2430.CAS09 _(rs=17)_|Monetary Amount<br> _(rs=17)_|Monetary Amount<br> _(rs=17)_|S _(rs=17)_|_(rs=17)_|_(rs=17)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/deductibleAmount|Deductible amount|When CAS01='PR' and CAS08='1'||
|**1274**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/coInsuranceAmount|Coinsurance amount.|When CAS01='PR' and CAS08='2'||
|**1275**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/copayAmount|Copay amount|When CAS01='PR' and CAS08='3'||
|**1276**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/memberPenalty|Member penalty.|When CAS01='PR' and CAS08=225/237/B4||
|**1277**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/providerPenalty|Provider penalty.|When CAS01='CO' and CAS08=225/237/B4||
|**1278**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/taxAmount|Tax amount|When CAS01='CO' and CAS08='105'||
|**1279**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/nonCoveredAmount|Non-covered amount.|When CAS01='CO' and CAS08='96'<br><br><br>Please refer the Comments|All 2430.CAS03 / 2430.CAS06 /2430.CAS09 /2430.CAS12/2430.CAS15/2430.CAS18 Amounts  for all 2430.CAS01-2430.CAS02/05/08/11/14/17 combinations which are not explicitly mentioned in 2430.CAS segment mapping  will also get  added to the  /professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/nonCoveredAmount|
|**1280**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/discountAmount|Discount amount|When CAS01='CO' and CAS08='45'||
|**1281**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/deductibleAmount|Deductible amount|When CAS01='PR' and CAS08='1'||
|**1282**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/coInsuranceAmount|Coinsurance amount.|When CAS01='PR' and CAS08='2'||
|**1283**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/copayAmount|Copay amount|When CAS01='PR' and CAS08='3'||
|**1284**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/memberPenalty|Member penalty.|When CAS01='PR' and CAS08=225/237/B4||
|**1285**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/providerPenalty|Provider penalty.|When CAS01='CO' and CAS08=225/237/B4||
|**1286**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/taxAmount|Tax amount|When CAS01='CO' and CAS08='105'||
|**1287**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/nonCoveredAmount|Non-covered amount.|When CAS01='CO' and CAS08='96'<br><br>Please refer the Comments|All 2430.CAS03 / 2430.CAS06 /2430.CAS09 /2430.CAS12/2430.CAS15/2430.CAS18 Amounts  for all 2430.CAS01-2430.CAS02/05/08/11/14/17 combinations which are not explicitly mentioned in 2430.CAS segment mapping  will also get  added to the  professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/nonCoveredAmount.|
|**1288**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/discountAmount|Discount amount|When CAS01='CO' and CAS08='45'||
|**1289**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/lineCasCodes/casCode/amount|Amount|||
|**1290**|2430.CAS10|Quantity|Numeric value of quantity|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/lineCasCodes/casCode/quantity|Quantity|||
|**1291**|2430.CAS11|Claim Adjustment Reason Code|Code identifying the detailed reason the adjustment was made|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/lineCasCodes/casCode/casCode|CAS code|||
|**1292**|2430.CAS12 _(rs=17)_|Monetary Amount<br> _(rs=17)_|Monetary Amount<br> _(rs=17)_|S _(rs=17)_|_(rs=17)_|_(rs=17)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/deductibleAmount|Deductible amount|When CAS01='PR' and CAS11='1'||
|**1293**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/coInsuranceAmount|Coinsurance amount.|When CAS01='PR' and CAS11='2'||
|**1294**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/copayAmount|Copay amount|When CAS01='PR' and CAS11='3'||
|**1295**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/memberPenalty|Member penalty.|When CAS01='PR' and CAS11=225/237/B4||
|**1296**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/providerPenalty|Provider penalty.|When CAS01='CO' and CAS11=225/237/B4||
|**1297**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/taxAmount|Tax amount|When CAS01='CO' and CAS11='105'||
|**1298**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/nonCoveredAmount|Non-covered amount.|When CAS01='CO' and CAS11='96'<br><br>Please refer the Comments|All 2430.CAS03 / 2430.CAS06 /2430.CAS09 /2430.CAS12/2430.CAS15/2430.CAS18 Amounts  for all 2430.CAS01-2430.CAS02/05/08/11/14/17 combinations which are not explicitly mentioned in 2430.CAS segment mapping  will also get  added to the  /professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/nonCoveredAmount|
|**1299**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/discountAmount|Discount amount|When CAS01='CO' and CAS11='45'||
|**1300**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/deductibleAmount|Deductible amount|When CAS01='PR' and CAS11='1'||
|**1301**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/coInsuranceAmount|Coinsurance amount.|When CAS01='PR' and CAS11='2'||
|**1302**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/copayAmount|Copay amount|When CAS01='PR' and CAS11='3'||
|**1303**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/memberPenalty|Member penalty.|When CAS01='PR' and CAS11=225/237/B4||
|**1304**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/providerPenalty|Provider penalty.|When CAS01='CO' and CAS11=225/237/B4||
|**1305**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/taxAmount|Tax amount|When CAS01='CO' and CAS11='105'||
|**1306**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/nonCoveredAmount|Non-covered amount.|When CAS01='CO' and CAS11='96'<br><br><br>Please refer the Comments|All 2430.CAS03 / 2430.CAS06 /2430.CAS09 /2430.CAS12/2430.CAS15/2430.CAS18 Amounts  for all 2430.CAS01-2430.CAS02/05/08/11/14/17 combinations which are not explicitly mentioned in 2430.CAS segment mapping  will also get  added to the  professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/nonCoveredAmount.|
|**1307**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/discountAmount|Discount amount|When CAS01='CO' and CAS11='45'||
|**1308**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/lineCasCodes/casCode/amount|Amount|||
|**1309**|||||||/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/lineEobCasCodes/casCode/amount|Amount|||
|**1310**|2430.CAS13|Quantity|Numeric value of quantity|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/lineCasCodes/casCode/quantity|Quantity|||
|**1311**|2430.CAS14|Claim Adjustment Reason Code|Code identifying the detailed reason the adjustment was made|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/lineCasCodes/casCode/casCode|CAS code|||
|**1312**|2430.CAS15 _(rs=17)_|Monetary Amount<br> _(rs=17)_|Monetary Amount<br> _(rs=17)_|S _(rs=17)_|_(rs=17)_|_(rs=17)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/deductibleAmount|Deductible amount|When CAS01='PR' and CAS14='1'||
|**1313**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/coInsuranceAmount|Coinsurance amount.|When CAS01='PR' and CAS14='2'||
|**1314**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/copayAmount|Copay amount|When CAS01='PR' and CAS14='3'||
|**1315**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/memberPenalty|Member penalty.|When CAS01='PR' and CAS14=225/237/B4||
|**1316**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/providerPenalty|Provider penalty.|When CAS01='CO' and CAS14=225/237/B4||
|**1317**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/taxAmount|Tax amount|When CAS01='CO' and CAS14='105'||
|**1318**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/nonCoveredAmount|Non-covered amount.|When CAS01='CO' and CAS14='96'<br><br>Please refer the Comments|All 2430.CAS03 / 2430.CAS06 /2430.CAS09 /2430.CAS12/2430.CAS15/2430.CAS18 Amounts  for all 2430.CAS01-2430.CAS02/05/08/11/14/17 combinations which are not explicitly mentioned in 2430.CAS segment mapping  will also get  added to the  /professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/nonCoveredAmount|
|**1319**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/discountAmount|Discount amount|When CAS01='CO' and CAS14='45'||
|**1320**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/deductibleAmount|Deductible amount|When CAS01='PR' and CAS14='1'||
|**1321**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/coInsuranceAmount|Coinsurance amount.|When CAS01='PR' and CAS14='2'||
|**1322**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/copayAmount|Copay amount|When CAS01='PR' and CAS14='3'||
|**1323**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/memberPenalty|Member penalty.|When CAS01='PR' and CAS14=225/237/B4||
|**1324**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/providerPenalty|Provider penalty.|When CAS01='CO' and CAS14=225/237/B4||
|**1325**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/taxAmount|Tax amount|When CAS01='CO' and CAS14='105'||
|**1326**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/nonCoveredAmount|Non-covered amount.|When CAS01='CO' and CAS14='96'<br><br>Please refer the Comments|All 2430.CAS03 / 2430.CAS06 /2430.CAS09 /2430.CAS12/2430.CAS15/2430.CAS18 Amounts  for all 2430.CAS01-2430.CAS02/05/08/11/14/17 combinations which are not explicitly mentioned in 2430.CAS segment mapping  will also get  added to the  professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/nonCoveredAmount.|
|**1327**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/discountAmount|Discount amount|When CAS01='CO' and CAS14='45'||
|**1328**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/lineCasCodes/casCode/amount||||
|**1329**|2430.CAS16|Quantity|Numeric value of quantity|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/lineCasCodes/casCode/quantity||||
|**1330**|2430.CAS17|Claim Adjustment Reason Code|Code identifying the detailed reason the adjustment was made|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/lineCasCodes/casCode/casCode||||
|**1331**|2430.CAS18 _(rs=17)_|Monetary Amount<br><br><br> _(rs=17)_|Monetary Amount<br><br><br> _(rs=17)_|S _(rs=17)_|_(rs=17)_|_(rs=17)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/deductibleAmount|Deductible amount|When CAS01='PR' and CAS17='1'||
|**1332**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/coInsuranceAmount|Coinsurance amount.|When CAS01='PR' and CAS17='2'||
|**1333**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/copayAmount|Copay amount|When CAS01='PR' and CAS17='3'||
|**1334**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/memberPenalty|Member penalty.|When CAS01='PR' and CAS17=225/237/B4||
|**1335**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/providerPenalty|Provider penalty.|When CAS01='CO' and CAS17=225/237/B4||
|**1336**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/taxAmount|Tax amount|When CAS01='CO' and CAS17='105'||
|**1337**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/nonCoveredAmount|Non-covered amount.|When CAS01='CO' and CAS17='96'<br><br>Please refer the Comments|All 2430.CAS03 / 2430.CAS06 /2430.CAS09 /2430.CAS12/2430.CAS15/2430.CAS18 Amounts  for all 2430.CAS01-2430.CAS02/05/08/11/14/17 combinations which are not explicitly mentioned in 2430.CAS segment mapping  will also get  added to the  /professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/nonCoveredAmount|
|**1338**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/discountAmount|Discount amount|When CAS01='CO' and CAS17='45'||
|**1339**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/deductibleAmount|Deductible amount|When CAS01='PR' and CAS17='1'||
|**1340**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/coInsuranceAmount|Coinsurance amount.|When CAS01='PR' and CAS17='2'||
|**1341**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/copayAmount|Copay amount|When CAS01='PR' and CAS17='3'||
|**1342**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/memberPenalty|Member penalty.|When CAS01='PR' and CAS17=225/237/B4||
|**1343**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/providerPenalty|Provider penalty.|When CAS01='CO' and CAS17=225/237/B4||
|**1344**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/taxAmount|Tax amount|When CAS01='CO' and CAS17='105'||
|**1345**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/nonCoveredAmount|Non-covered amount.|When CAS01='CO' and CAS17='96'<br><br>Please refer the Comments|All 2430.CAS03 / 2430.CAS06 /2430.CAS09 /2430.CAS12/2430.CAS15/2430.CAS18 Amounts  for all 2430.CAS01-2430.CAS02/05/08/11/14/17 combinations which are not explicitly mentioned in 2430.CAS segment mapping  will also get  added to the  professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/nonCoveredAmount.|
|**1346**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/discountAmount|Discount amount|When CAS01='CO' and CAS17='45'||
|**1347**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/lineCasCodes/casCode/amount|Amount|||
|**1348**|2430.CAS19|Quantity|Numeric value of quantity|S|||professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/lineCasCodes/casCode/quantity|Quantity|||
|**1349**|DTP|Segment - DTP Line Check or Remittance Date (Required)|||||||||
|**1350**|2430.DTP01|Date/Time Qualifier|Code specifying type of date or time, or both date and time|R|573 : Date Claim Paid||||||
|**1351**|2430.DTP02|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 :Date Expressed in Format CCYYMMDD||||||
|**1352**|2430.DTP03|Date Time Period|Expression of a date, a time, or range of dates, times or dates and times|R||20210526|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/eobDate|User-entered date on which the EOB was generated.<br><br>In the format YYYY-MM-DD|In the format YYYY-MM-DD<br>Map the first instance when we have 2430.DTP segment  under more than claim line for same SVD01.||
|**1353**|AMT|Segment - AMT Remaining Patient Liability (Situational)|||||||||
|**1354**|2430.AMT01|Amount Qualifier Code|Code to qualify amounT|R|EAF : Amount Owed||||||
|**1355**|2430.AMT02 _(rs=2)_|Monetary Amount _(rs=2)_|Monetary Amount _(rs=2)_|R _(rs=2)_|_(rs=2)_|_(rs=2)_|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/memberResponsibilityAmount|Member responsibility amount|||
|**1356**|⬚|⬚|⬚|⬚|⬚|⬚|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/memberResponsibilityAmount|Member responsibility amount|||
|**1357**|Loop 2440  — FORM IDENTIFICATION CODE (Situational) Loop Repeat: >1 _(cs=10)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**1358**|LQ|Segment - LQ Form Identification Code (Situational)|||||||||
|**1359**|2440.LQ01|Code List Qualifier Code|Code identifying a specific industry code list|R|AS : Form Type Code<br>UT : Centers for Medicare and Medicaid Services (CMS)<br>Durable Medical Equipment Regional Carrier<br>(DMERC) Certificate of Medical Necessity (CMN)<br>Forms||||||
|**1360**|2440.LQ02|Industry Code|Code indicating a code from a specific industry code list|R|||||||
|**1361**|FRM|Segment - FRM Supporting Documentation (Required)|||||||||
|**1362**|2440.FRM01|Assigned Identification|Alphanumeric characters assigned for differentiation within a transaction set|R|||||||
|**1363**|2440.FRM02|Yes/No Condition or Response Code|Code indicating a Yes or No condition or response/ Question Response|S|N No<br>W Not Applicable<br>Y Yes||||||
|**1364**|2440.FRM03|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier|S|||||||
|**1365**|2440.FRM04|Date|Date expressed as CCYYMMDD where CC represents the first two digits of the<br>calendar year|S|||||||
|**1366**|2440.FRM05|Percent, Decimal Format|Percent given in decimal format (e.g., 0.0 through 100.0 represents 0% through<br>100%)|S|||||||
|**1367**|Segment SE - Transaction Set Trailer (Required) _(cs=10)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**1368**|SE|SE Transaction Set Trailer (Required)||R|||||||
|**1369**|SE01|Number of Included Segments|Total number of segments included in a transaction set including ST and SE<br>segments|R||Count Of ST - 74|||||
|**1370**|SE02|Transaction Set Control Number|Identifying control number that must be unique within the transaction set<br>functional group assigned by the originator for a transaction set.  It must be identical to ST02.|R||ST02 Value - 319003402|||||
|**1371**|Segment GE - Functional Group Trailer  (Required) _(cs=10)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**1372**|GE|GE Functional Group Trailer (Required)||R|||||||
|**1373**|GE01|Number of Transaction Sets Included|Total number of transaction sets included in the functional group or interchange<br>(transmission) group|R||Count Of GS - 1|||||
|**1374**|GE02|Group Control Number|Assigned number originated and maintained by the sender .  It must be identical to GS06.|R||319003402|||||
|**1375**|Segment IEA -  Interchange Control Trailer(Required) _(cs=10)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**1376**|IEA|IEA Interchange Control Trailer (Required)||R|||||||
|**1377**|IEA01|Number of Included Functional Groups|A count of the number of functional groups included in an interchange|R||Count Of ISA - 1|||||
|**1378**|IEA02|Interchange Control Number|A control number assigned by the interchange sender.  It must be identical to ISA13|R||ISA13 Value - 319003402|||||
---
<a id="sheet-837p-base-mappingdefault-val"></a>
## Sheet: 837P Base Mapping(Default Val)
|#|A|B|C|
|---|---|---|---|
|**1**|XSD Element|Element Description|Default Value|
|**2**|professionalClaimIBRequestRoot/header/inputFilename|Inbound EDI File Name|Input Filename of the EDI file received with filename extension|
|**3**|professionalClaimIBRequestRoot/header/inputId|EDI file id|{UID}- Unique for each file <br>Example - -dtBkcCHu9bkKu8O|
|**4**|professionalClaimIBRequestRoot/header/totalClaimCount|Total number of claims|Total Number of claims in the Inbound EDI 837P file|
|**5**|professionalClaimIBRequestRoot/header/inputType|Defines the type of input file - API or File|Hardcode as "FILE"|
|**6**|professionalClaimIBRequestRoot/header/XMLfileCreationDate|<br>File created date in format YYYY-MM-DD HH:mm:ss - This is used for internal reference. Not loaded to HRP UI|Processing date/time in the format: <br>yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS|
|**7**|professionalClaimIBRequestRoot/header/correlationId<br>|Unique string or alphanumeric value identifying each file.|A Unique Record Identifier|
|**8**|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/entryDate|<br><br>Date on which the claim was first<br>entered into HealthRules. - in HRP UI it is auto populated to claim load date/time|Processing date/time in the format: YYYY-MM-DDTHH:mm:ss|
|**9**|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/claimDeliveryType|<br><br>The method by which the claim was<br>received.|E' -  Electronic <br>'S'  - SDS paper 837 <br>Crosswalk Name : P_IB_837_ClaimSourceLookup<br>•Provide the Sender Id and Receiver Id as the source columns.<br>•Provide the ClaimSource and ClaimDeliveryType as the target columns.|
|**10**|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/payeeTypeField|<br><br>Indicates whether the claim is to be<br>paid to a supplier or a member.<br><br>|Hardcode as 'Supplier'|
|**11**|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/claimPayorType|Indicates if the payables and payment<br>are generated internally after<br>adjudicating claims using<br>healthRules (Value 1), or if the payments are handled by an external payor (Value 2).|Hardcode as '1 '|
|**12**|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/benefitPlanType|Benefit plan type (medical, dental,<br>etc.)|Hardcode as 1 (medical)|
|**13**|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/rayId|Unique Identifier for the complete lifecycle of transaction/Record. Will be unchanged even the transaction is Split, passed across various system, reprocessed.|GUID|
|**14**|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/recordId|Unique Identifier for transaction level. Will be different when we split, reprocess a same record.|GUID|
|**15**|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/recordIdFromSource||senderid(ISA06)_patientcontrolnum(CLM01)_clearinghousingnum(2300.REF*D9)|
|**16**|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/sourceTypeIdentifier|Identifier to find from where we received(Starting point) the initial Transaction/Record.|SubmitterName(1000A. NM103+NM104)_{Paper}<br>SubmitterName(1000A. NM103+NM104)_{Electronic}|
|**17**|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/tenantIdentifier|Unique identifier for the implementation team|Hardcode as "Product"|
|**18**|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/nonCoveredAmount|Non covered amount - COB- Claim level|Map 2320.CAS03 / 2320.CAS06 /2320.CAS09 /2320.CAS12/2320.CAS15/2320.CAS18   for all CAS01-CAS02/05/08/11/14/17 combinations which are not explicitly mentioned in 2320.CAS segment mapping.|
|**19**|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/serviceLineItems/serviceLineItem/eobPaymentInformation/nonCoveredAmount|Non covered amount - COB - Line elevel|Map 2430.CAS03 / 2430.CAS06 /2430.CAS09 /2430.CAS12/2430.CAS15/2430.CAS18   for all 2430.CAS01-2430.CAS02/05/08/11/14/17 combinations which are not explicitly mentioned in 2430.CAS segment mapping.|
|**20**|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/nonCoveredAmount|Non covered amount - COB - Line elevel|Map 2430.CAS03 / 2430.CAS06 /2430.CAS09 /2430.CAS12/2430.CAS15/2430.CAS18   for all 2430.CAS01-2430.CAS02/05/08/11/14/17 combinations which are not explicitly mentioned in 2430.CAS segment mapping.|
|**21**|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/claimUDTList/claimUDT/udtListValueSet/attributeRoleName||Hardcode as "Submitted Claim Key"|
|**22**|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/claimUDTList/claimUDT/udtListValueSet/attrValueAsString||Should be same value as pupulated in institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/recordId|
|**23**|professionalClaimIBRequestRoot/professionalClaimIBRequest/professionalClaimSubmitRequestRecordList/professionalClaimSubmitRequestRecord/professionalClaim/claimUDTList/claimUDT/userDefinedTermReference/ID||Hardcode as "Submitted Claim Key"|
---
<a id="sheet-837i-base-mapping"></a>
## Sheet: 837I Base Mapping
|#|A|B|C|D|E|F|G|H|I|J|K|
|---|---|---|---|---|---|---|---|---|---|---|---|
|**1**|EDI LoopID.Segment|EDI Data Element Name|EDI Element Description|Usage|Enumeration Values|Sample values|Mapped to XSD element|HRP Element Description|Transformation Logic|Comments /Needs to review||
|**2**|ISA - Interchange Control Header Segment|||||||||||
|**3**|ISA01|Authorization Information Qualifier|Code identifying the type of information in the Authorization Information|R|00 : No Authorization Information Present|||||||
|**4**|ISA02|Authorization Information|Code identifying the type of information in the Authorization Information|R|00: No Authorization Information Present (No<br>Meaningful Information in I02)<br>03:Additional Data Identification|||||||
|**5**|ISA03|Security Information Qualifier|Code identifying the type of information in the Security Information|R|00|||||||
|**6**|ISA04|Security Information|security information about the interchange sender<br>or the data in the interchange|R|Blank (10 spaces)|||||||
|**7**|ISA05|Interchange ID Qualifier|Code indicating the system/method of code structure used to designate the<br>sender or receiver ID element being qualified|R|ZZ - Mutually Defined|||||||
|**8**|ISA06 _(rs=3)_|Interchange Sender ID _(rs=3)_|Identification code published by the sender for other parties to use as the receiver<br>ID to route data to them; the sender always codes this value in the sender ID<br>element _(rs=3)_|R _(rs=3)_|<Sender ID>  _(rs=3)_|Example: 100SS|institutionalClaimIBRequestRoot/header/senderId|Sender ID from EDI837 X12 will be mapped to the header of each claim bundle.||||
|**9**|⬚|⬚|⬚|⬚|⬚||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/tradingPartnerID|Sender ID from EDI837 X12 will be mapped to the Trading Partner ID.||||
|**10**|⬚|⬚|⬚|⬚|⬚||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/claimSource|Reference to the ClaimSource<br>codeset.||||
|**11**|ISA07|Interchange ID Qualifier|Code indicating the system/method of code structure used to designate the<br>sender or receiver ID element being qualified|R|ZZ|||||||
|**12**|ISA08|Interchange Receiver ID|Receiver Id|R|<br><Receiver ID>||institutionalClaimIBRequestRoot/header/receiverId|Receiver ID from EDI837 X12 will be mapped to the header of each claim bundle.||||
|**13**|ISA09|Interchange Date|Date of the interchange|R|SysDate (YYMMDD)|Example : 220915||||||
|**14**|ISA10|Interchange Time|Time of the interchange|R|SysTime (HHMM)|Example : 0145||||||
|**15**|ISA11|Repetition Separator|the repetition separator is a delimiter and not a data<br>element; this field provides the delimiter used to separate repeated occurrences<br>of a simple data element or a composite data structure; this value must be<br>different than the data element separator, component element separator, and the<br>segment terminator|R|^|||||||
|**16**|ISA12|Interchange Control Version Number|Code specifying the version number of the interchange control segments|R|00501|||||||
|**17**|ISA13|Interchange Control Number|A control number assigned by the interchange sender|R||Exaample:000004846||||||
|**18**|ISA14|Acknowledgment Requested|Code indicating sender’s request for an interchange acknowledgment|R|1= Interchange Acknowledgment Requested|||||||
|**19**|ISA15|Interchange Usage Indicator|Code indicating whether data enclosed by this interchange envelope is test,<br>production or information|R|P=Production|||||||
|**20**|ISA16|Component Element Separator|The delimiter used to separate component data elements|R|: = Element Seperator|||||||
|**21**|GS -Functional Group Header Segment|||||||||||
|**22**|GS01|Functional Identifier Code|The two-character identifier Code for the transaction set included.|R|HC : Health Care Claim (837)|||||||
|**23**|GS02|Application Sender's Code|Code identifying party sending transmission,  codes agreed to by trading partners <br>This is Submitter-specific.|R|<Sender ID>|Example : 100ZM||||||
|**24**|GS03|Application Receiver's Code|Code identifying party receiving transmission; codes agreed to by trading partners|R|<HealthPlan ID>|||||||
|**25**|GS04|Date|Date the Group Header is created.|R|SysDate (YYYYMMDD)|20210701||||||
|**26**|GS05|Time|Time the Group Header is created.|R|SysTime (HHMM)|1213||||||
|**27**|GS06|Group Control Number|Submitter-specific number.|R|<Group Control Number>|75041||||||
|**28**|GS07|Responsible Agency Code|Code identifying the issuer of the EDI standard being used.<br>|R|X : Accredited Standards Committee X12|||||||
|**29**|GS08|Version / Release / Industry Identifier Code|Code indicating the version, release, subrelease, and industry identifier of the EDI<br>standard being used,<br>ST03 and GS08 must be identical|R|005010X223A2|||||||
|**30**|ST - Transaction Set Header Segment|||||||||||
|**31**|ST01|Transaction Set Identifier Code|Code uniquely identifying a Transaction Set|R|837 : Health Care Claim|||||||
|**32**|ST02|Transaction Set Control Number|Unique Sequential Number Assigned by Internal Processes for each Transaction Set. Starts from 001 and increments with each transaction set <br>|R|<Transaction set Control Number><br>Starts from 001 and increments with each transaction set|002|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/externalBatchSequenceNumber|External batch sequence number.||||
|**33**|ST03|Implementation Convention Reference|Standards Approved by ACS X12 Review Board.                 ST03 and GS08 must be identical|R|005010X223A2|||||||
|**34**|BHT - Beginning Of Hierarchical Transaction Segment|||||||||||
|**35**|BHT01|Hierarchical Structure Code|Code indicating the hierarchical application structure of a transaction set|R|0019- Information Source, Subscriber, Dependent|||||||
|**36**|BHT02|Transaction Set Purpose Code|Code identifying purpose of transaction set.  Used to convey the electronic transmission status of <br>the 837 batch|R|00 : Original<br>18 : Reissue|||||||
|**37**|BHT03|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier|R|<Originator Application Transaction Identifier>|75041|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/externalClaimBatchNumber|Batch number assigned by external<br>system.||||
|**38**|BHT04 _(rs=2)_|Date _(rs=2)_|The date the transaction was created _(rs=2)_|R _(rs=2)_|SysDate (YYYYMMDD) -  _(rs=2)_|20210701 _(rs=2)_|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/receiptDate|Date on which the Health Care Company<br>was first made aware of the<br>claim - reflected as Received Date in HRP UI|Mapped from BHT04, formatted to YYYY-MM-DD|||
|**39**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/cleanClaimDate|Date as of which all of the information<br>necessary to process the<br>claim was received. This information<br>can be used to determine<br>whether interest should be calculated<br>on the claim. -- reflected in Clean Claim Date at claim line level|Mapped from BHT04, formatted to YYYY-MM-DD|||
|**40**|BHT05|Time|The time the transaction was created|R|SysTime (HHMMSS)|121314||||||
|**41**|BHT06|Transaction Type Code|Code specifying the type of transaction|R|CH- Chargeable|||||||
|**42**|Loop 1000A (Required)Loop Repeat: 1|||||||||||
|**43**|Segment NM1 - Submitter Name  (Required)|||||||||||
|**44**|1000A.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R|41 : Submitter|||||||
|**45**|1000A.NM102|Entity Type Qualifier|Code qualifying the type of entity|R|1 : Person<br>2 : Non-person Entity|||||||
|**46**|1000A.NM103|Name Last or Organization Name|Individual last name or organizational name|R|<Submitter Last/Org Name>|THE SSI GROUP|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/submitterName|<Submitter Last/Org Name><br>||<br>In highmark it is 1000A.(NM103+NM104+NM105)||
|**47**|1000A.NM104|Name First|Individual first name|S||||||||
|**48**|1000A.NM105|Name Middle|Individual middle name or initial|S||||||||
|**49**|1000A.NM108|Identification Code Qualifier|Code designating the system/method of code structure used for Identification<br>Code|R|46 : Electronic Transmitter Identification Number (ETIN|||||||
|**50**|1000A.NM109|Identification Code|Code identifying a party or other code|R|<Submitter ID>|100SS|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/submitterId|Claim submitter Id||,Claim submitter Id||
|**51**|Segment PER - Submitter EDI Contact Information|||||||||||
|**52**|1000A.PER01|Contact Function Code|Code identifying the major duty or responsibility of the person or group named|R|IC|||||||
|**53**|1000A.PER02|Name|Submitter Contact Name|S|<Submitter Name> - JOAN KOSSOW|||||||
|**54**|1000A.PER03|Communication Number Qualifier|Code identifying the type of communication number|R|"EM" - Electronic Mail<br>"FX" - Facsimile<br>"TE" - Telephone|||||||
|**55**|1000A.PER04|Communication Number|Complete communications number including country or area code when applicable|R|<Email/Faxsimile Number/Telephone Number> - 2513450000|||||||
|**56**|1000A.PER05|Communication Number Qualifier|Code identifying the type of communication number|S|"EM" - Electronic Mail<br>"FX" - Facsimile<br>"TE" - Telephone|||||||
|**57**|1000A.PER06|Communication Number|Complete communications number including country or area code when applicable|S|<Email/Faxsimile Number/Telephone Number> 2513450100|||||||
|**58**|1000A.PER07|Communication Number Qualifier|Code identifying the type of communication number|S|"EM" - Electronic Mail EM<br>"FX" - Facsimile<br>"TE" - Telephone|||||||
|**59**|1000A.PER08|Communication Number|Complete communications number including country or area code when applicable|S|<Email/Faxsimile Number/Telephone Number>|||||||
|**60**|Loop 1000B (Required)Loop Repeat: 1|||||||||||
|**61**|Segment NM1 - Receiver Name  (Required)|||||||||||
|**62**|1000B.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R|40 : Receiver<br>41:Submitter|||||||
|**63**|1000B.NM102|Entity Type Qualifier|Code qualifying the type of entity|R|1 : Person<br>2 : Non-person Entity|||||||
|**64**|1000B.NM103|Name Last or Organization Name|Code identifying an organizational NAME|R|HealthPlan Name|CO ACCESS||||||
|**65**|1000B.NM108|Identification Code Qualifier|Code designating the system/method of code structure used for Identification<br>Code|R|46 : Electronic Transmitter Identification Number (ETIN|||||||
|**66**|1000B.NM109|Identification Code|Code identifying a party|R|<HealthPlan Payer ID> - COA|||||||
|**67**|Loop 2000A (Required)Loop Repeat: >1|||||||||||
|**68**|Segment HL - Billing Provider Hierarchical Level  (Required)|||||||||||
|**69**|2000A.HL01|Hierarchical ID Number|A unique number assigned by the sender to identify a particular data segment in<br>a hierarchical structure|R|The first HL01 within each ST-SE envelope must begin with “1”,<br>and be incremented by one each time an HL is used in the<br>transaction|||||||
|**70**|2000A.HL03|Hierarchical Level Code|Code defining the characteristic of a level in a hierarchical structure|R|20 : Information Source|||||||
|**71**|2000A.HL04|Hierarchical Child Code|Code indicating if there are hierarchical child data segments subordinate to the<br>level being described.|R|1 : Additional Subordinate HL Data Segment in This<br>Hierarchical Structure.|||||||
|**72**|Segment PRV - Billing Provider Specialty Information  (Situational)|||||||||||
|**73**|2000A.PRV01|Provider Code|Code identifying the type of provider|R|BI : Billing|||||||
|**74**|2000A.PRV02|Reference Identification Qualifier|Code qualifying the Reference Identification|R|PXC :  Health Care Provider Taxonomy Code||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/additionalCodes/codes/qualifier|||||
|**75**|2000A.PRV03|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/additionalCodes/codes/code|||||
|**76**|Segment CUR - Foreign Currency Information (Situational)|||||||||||
|**77**|2000A.CUR01|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R|85 - Billing provider|||||||
|**78**|2000A.CUR02|Currency Code|Code (Standard ISO) for country in whose currency the charges are specified|R|<Currency Code>|||||||
|**79**|Loop 2010AA (Required) Loop Repeat: 1|||||||||||
|**80**|Segment NM1 - Billing Provider Name (Required)|||||||||||
|**81**|2010AA.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R|85 - Billing provider|||Indicates if the payables and payment<br>are generated internally after<br>adjudicating claims using<br>healthRules, or if the payments are<br>handled by an external payor.||||
|**82**|2010AA.NM102|Entity Type Qualifier|Code qualifying the type of entity|R|1 : Person<br>2 : Non-Person Entity|||||||
|**83**|2010AA.NM103 _(rs=3)_|Name Last or Organization Name _(rs=3)_|Individual last name or organizational name  _(rs=3)_|R _(rs=3)_|<Billing Provider Organizational Name>  _(rs=3)_|MILLCREEK OF ARKANSAS _(rs=3)_|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/payToInformation/payToName|If NM102 is Person, this should be <br>the Billing Provider Last Name.<br>If NM102 is Non-Person, this <br>should be the Organization Name||||
|**84**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/billingRecipient/fullName|Billing Recipient  Full Name||||
|**85**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/supplierInformation/supplierName|Name of the supplier.||||
|**86**|2010AA.NM108|Identification Code Qualifier|Code designating the system/method of code structure used for Identification<br>Code (67)|S|XX :  Centers for Medicare and Medicaid Services<br>National Provider Identifier|||||||
|**87**|2010AA.NM109|Identification Code|Code identifying a party or other code / Billing Provider Identifier|S|<Billing Provider NPI> -|0052482036|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/supplierInformation/npi|Supplier's National Provider ID||||
|**88**|Segment N3 - Billing Provider Address (Required)|||||||||||
|**89**|2010AA.N301 _(rs=2)_|Address Information _(rs=2)_|Code identifying the address _(rs=2)_|R _(rs=2)_|<Billing Provider Address Line>  _(rs=2)_|4495 YUKON COURT APT 78 _(rs=2)_|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/supplierInformation/address|The first line of the street address.||||
|**90**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/billingRecipient/address|The first line of the street address.||||
|**91**|2010AA.N302 _(rs=2)_|Address Information _(rs=2)_|Code identifying the address _(rs=2)_|S _(rs=2)_|<Billing Provider Address Line>  _(rs=2)_|PO BOX 17471 _(rs=2)_|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/billingRecipient/address||Concatenate the value (if present) to this XML field, separated by comma and space (, )|||
|**92**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/supplierInformation/address2||second instance of street address|||
|**93**|Segment N4 - Billing Provider City, State, ZIP Code (Required)|||||||||||
|**94**|2010AA.N401 _(rs=2)_|City Name _(rs=2)_|Code identifying the address _(rs=2)_|R _(rs=2)_|_(rs=2)_|DENVER _(rs=2)_|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/supplierInformation/cityName|city||Need to confirm on address||
|**95**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/billingRecipient/cityName|city||||
|**96**|2010AA.N402 _(rs=2)_|State or Province Code _(rs=2)_|Code identifying the address _(rs=2)_|S _(rs=2)_|_(rs=2)_|CO _(rs=2)_|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/supplierInformation/stateCode|State abbreviation||||
|**97**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/billingRecipient/stateCode|State abbreviation||||
|**98**|2010AA.N403 _(rs=4)_|Postal Code _(rs=4)_|Code identifying the address _(rs=4)_|S _(rs=4)_|_(rs=4)_|802044507 _(rs=4)_|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/supplierInformation/zipCode|zip code|Map byte 1-5|||
|**99**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/supplierInformation/zipSuffixCode|Zip code suffix|Map byte 6-9|||
|**100**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/billingRecipient/zipCode|zip code|Map byte 1-5|||
|**101**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/billingRecipient/zipSuffixCode|Zip code suffix|Map byte 6-9|||
|**102**|2010AA.N404 _(rs=2)_|Country Code _(rs=2)_|Code identifying the address _(rs=2)_|S _(rs=2)_|_(rs=2)_|_(rs=2)_|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/supplierInformation/countryCode/countryCode|Country code|Map "US" if no value present|||
|**103**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/billingRecipient/countryCode/countryCode|Country code|Map "US" if no value present|||
|**104**|2010AA.N407|Country Subdivision Code||S||||||||
|**105**|Segment REF - Billing Provider Tax Identification (Required)|||||||||||
|**106**|2010AA.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|EI : Employer’s Identification Number<br>|||||||
|**107**|||||||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/supplierInformation/taxIdentificationNumber|Supplier tax identification number|if /837/2000A/2010AA/REF01 (Reference Identification Qualifier) is ‘EI’ then it will be mapped into ‘XX-XXXXXXXX’ format to taxIdentificationNumber (institutionalClaim/supplierInformation/taxIdentificationNumber).|In COA we do have  mapping for SY and EI Seperately but  In care plus only had SSN identidfication segment .Need to confirm||
|**108**|Segment - PER Billing Provider Contact Information (Situational)|||||||||||
|**109**|2010AA.PER01|Contact Function Code|Code identifying the major duty or responsibility of the person or group name|R|IC -  Information Contact|||||||
|**110**|2010AA.PER02|Name|Billing Provider Contact Name|S||||||||
|**111**|2010AA.PER03|Communication Number Qualifier|Code identifying the type of communication number|R|"EM" : Electronic Mail<br>"FX" : Facsimile<br>"TE" : Telephone|"EM" : Electronic Mail<br>"FX" : Facsimile<br>"TE" : Telephone||||If PER03='EM' Don’t mapped to any field in XML||
|**112**|2010AA.PER04 _(rs=3)_|Communication Number _(rs=3)_|Complete communications number including<br>country or area code _(rs=3)_|R _(rs=3)_|_(rs=3)_|3033981735 _(rs=3)_|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/supplierInformation/faxNumber|Supplier's fax number|If PER03/05/07 ='FX', Map the /faxNumber from PER04/06/08|||
|**113**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/supplierInformation/telephoneNumber|Supplier telephone number.|If PER03/05/07 ='TE', Map the/telephoneNumber from PER04/06/08|||
|**114**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/billingRecipient/telephoneNumber|Billing Recipient telephone number.|If PER03/05/07 ='TE', Map the/telephoneNumber from PER04/06/08|||
|**115**|2010AA.PER05|Communication Number Qualifier|Code identifying the type of communication numbe|S|"EM" : Electronic Mail<br>"FX" : Facsimile<br>"TE" : Telephone<br>"EX" : Telephone Extension|||||||
|**116**|2010AA.PER06|Communication Number|Communication Number|S||3033981649||||If PER03='EM' Don’t mapped to any field in XML||
|**117**|2010AA.PER07|Communication Number Qualifier|Code identifying the type of communication number|S|"EM" : Electronic Mail<br>"FX" : Facsimile<br>"TE" : Telephone<br>"EX" : Telephone Extension|||||||
|**118**|2010AA.PER08|Communication Number||S||3033981649||||||
|**119**|Loop 2010AB (Situational) Loop Repeat: 1|||||||||||
|**120**|Segment - NM1 Pay-to Address Name (Situational)|||||||||||
|**121**|2010AB.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R|87: Pay-to Provider|||||||
|**122**|2010AB.NM102|Entity Type Qualifier|Code qualifying the type of entity|R|1 : Person<br>2:  Non-Person Entity|||||||
|**123**|Segment - N3 Pay-to Address - ADDRESS (Required)|||||||||||
|**124**|2010AB.N301|Address Information|Address Information|R|PO BOX 17379||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/payToInformation/address|The first line of the street address.||||
|**125**|2010AB.N302|Address Information|Address Information|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/payToInformation/address||Concatenate the value (if present) to this XML field, separated by comma and space (, )|||
|**126**|Segment - N4 Pay-To Address City, State, ZIP Code (Required)|||||||||||
|**127**|2010AB.N401|City Name|Free-form text for city name|R|DENVER||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/payToInformation/cityName|city||||
|**128**|2010AB.N402|State or Province Code|Code (Standard State/Province) as defined by appropriate government agency|S|CO||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/payToInformation/stateCode|State abbreviation||||
|**129**|2010AB.N403 _(rs=2)_|Postal Code _(rs=2)_|Code defining international postal zone code excluding punctuation and blanks (zip code for United States)  _(rs=2)_|S _(rs=2)_|802170379 _(rs=2)_|_(rs=2)_|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/payToInformation/zipCode|zip code|1-5 digits|||
|**130**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/payToInformation/zipSuffixCode|Zip code suffix|6-9 digits|||
|**131**|2010AB.N404|Country Code|Code identifying the country|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/payToInformation/countryCode/countryCode|Country code|‘countryCode’ tag can be loaded as ‘US’ by default when there is no corresponding value in the N4 segments in EDI|||
|**132**|2010AB.N407|Country Subdivision Code|Code identifying the country subdivision|S||||||||
|**133**|Loop 2010AC (Situational)  Loop Repeat: 1|||||||||||
|**134**|Segment - NM1 Pay-To Plan Name (Situational)|||||||||||
|**135**|2010AC.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R|PE : Payee|||||||
|**136**|2010AC.NM102|Entity Type Qualifier|Code qualifying the type of entity|R|<br>2 : Non-Person Entity|||||||
|**137**|2010AC.NM103|Name Last or Organization Name|Individual last name or organizational name|R||||||||
|**138**|2010AC.NM108|Identification Code Qualifier|Code designating the system/method of code structure used for Identification Code (67)|R||||||||
|**139**|2010AC.NM109|Identification Code|Code identifying a party or other code|R||||||||
|**140**|Segment - N3 Pay-to Plan Address (Required)|||||||||||
|**141**|2010AC.N301|Address Information|Address Information|R||||||||
|**142**|2010AC.N302|Address Information|Address Information|S||||||||
|**143**|Segment - N4 Pay-To Plan City, State, ZIP Code (Required)|||||||||||
|**144**|2010AC.N401|City Name|Free-form text for city name|R||||||||
|**145**|2010AC.N402|State or Province Code|Code (Standard State/Province) as defined by appropriate government agency|S||||||||
|**146**|2010AC.N403|Postal Code|Code defining international postal zone code excluding punctuation and blanks (zip code for United States)|S||||||||
|**147**|2010AC.N404|Country Code|Code identifying the country|S||||||||
|**148**|2010AC.N407|Country Subdivision Code|Code identifying the country subdivision|S||||||||
|**149**|Segment - REF Pay-to Plan Secondary Identification (Required)|||||||||||
|**150**|2010AC.REF01|Reference Identification Qualifier||R||||||||
|**151**|2010AC.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier|R||||||||
|**152**|Segment - REF Pay-To Plan Tax Identification Number (Required)|||||||||||
|**153**|2010AC.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|EI : Employer’s Identification Number|||||||
|**154**|2010AC.REF02|Reference Identification|Reference information as specified<br>by the Reference Identification Qualifier|R||||||||
|**155**|Loop 2000B (Required) Loop Repeat: >1|||||||||||
|**156**|Segment - HL Subscriber Hierarchical Level (Required)|||||||||||
| **157** | 2000B.HL01 | Hierarchical ID Number | A unique number assigned by the sender to identify a particular data segment in<br>a hierarchical structure | R | 2000A.HL01 + 1
<br>Incremented at each new HL segment. |  | 1 |  |  |  |  |
|**158**|2000B.HL02|Hierarchical Parent ID Number|Identification number of the next higher hierarchical data segment that the data<br>segment being described is subordinate to|R|2000A.HL01|||||||
|**159**|2000B.HL03|Hierarchical Level Code|Code defining the characteristic of a level in a hierarchical structure|R|22- Subscriber|||||||
|**160**|2000B.HL04|Hierarchical Child Code|Code indicating if there are hierarchical child data segments subordinate to the<br>level being described.|R|0 :  HL04 has no subordinate levels  (the subscriber is the patient and there are no dependent claims)<br>1: HL04 has subordinate levels|0 /1 Based On The Count - 1||||||
|**161**|Segment - SBR Subscriber Information (Required)|||||||||||
|**162**|2000B.SBR01|Payer Responsibility Sequence Number Code|Code identifying the insurance carrier’s level of responsibility for a payment of a<br>claim|R|P : Primary <br>S : Secondary <br>T  : Tertiary|S||||||
|**163**|2000B.SBR02|Individual Relationship Code|Code indicating the relationship between two individuals or entities|S|<br>18 Self<br>||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/insuranceInformation/subscriberInformation/relationshipToSubscriberCode|Code indicating member's relationship to<br>the account subscriber||If 2000C.PAT  does not exist.||
|**164**|2000B.SBR03|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/insuranceInformation/subscriberInformation/insuranceGroupNumber|insuranceGroupNumber||||
|**165**|2000B.SBR04|Name||S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/insuranceInformation/subscriberInformation/groupName|The name of the group or plan through which the<br>health insurance coverage is provided to the<br>insured.||||
|**166**|2000B.SBR09|Claim Filing Indicator Code|Code identifying type of claim|S|11 : Other Non-Federal Programs<br>12 : Preferred Provider Organization (PPO)<br>13 : Point of Service (POS)<br>14 : Exclusive Provider Organization (EPO)<br>15 : Indemnity Insurance<br>16 : Health Maintenance Organization (HMO) Medicare<br>Risk<br>17 : Dental Maintenance Organization<br>AM :  Automobile Medical<br>BL :  Blue Cross/Blue Shield<br>CH :  Champus<br>CI :  Commercial Insurance Co.<br>DS :  Disability<br>FI :  Federal Employees Program<br>HM :  Health Maintenance Organization<br>LM :  Liability Medical<br>MA :  Medicare Part A<br>MB :  Medicare Part B<br>MC :  Medicaid<br>OF :  Other Federal Program<br>1484 Use code OF when submitting Medicare Part D<br>claims.<br>TV Title V<br>VA Veterans Affairs Plan<br>WC Workers’ Compensation Health Claim<br>ZZ Mutually Defined<br>71 Use Code ZZ when Type of Insurance is not known.||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/claimFilingCode|Claim filing idicator code, passthrough<br>from an external system||||
|**167**|Loop 2010BA (Required)Loop Repeat: 1||One instance of OtherInsuranceInformation will always carry the details from 2010BA Loop.)|||||||||
|**168**|Segment - NM1 Subscriber Name (Required)|||||||||||
|**169**|2010BA.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R|IL :  Insured or Subscriber|||||||
|**170**|2010BA.NM102|Entity Type Qualifier|Code qualifying the type of entity|R|1 : Person<br>2 : Non-Person Entity|||||||
|**171**|2010BA.NM103 _(rs=2)_|Name Last or Organization Name _(rs=2)_|Individual last name or organizational name  _(rs=2)_|R _(rs=2)_|_(rs=2)_|_(rs=2)_|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/memberInformation/lastName|Member Last Name||If 2010CA.NM1  does not exist.||
|**172**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/insuranceInformation/subscriberInformation/segmentedName/lastName|Subscriber Last Name||||
|**173**|2010BA.NM104 _(rs=4)_|Name First _(rs=4)_|Individual first name _(rs=4)_|S _(rs=4)_|_(rs=4)_|_(rs=4)_|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/memberInformation/firstName|Member First Name||If 2010CA.NM1  does not exist.||
|**174**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/insuranceInformation/subscriberInformation/segmentedName/firstName|Subscriber First Name||||
|**175**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/memberInformation/memberName|Member full name.||If 2010CA.NM1  does not exist.||
|**176**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/insuranceInformation/subscriberInformation/subscriberName|Subscriber's full name|<br>Subscriber's full name concatenate <br>NM103,05,04,07 (Last,Middle,First,Suffix)|||
|**177**|2010BA.NM105 _(rs=2)_|Name Middle _(rs=2)_|Individual middle name or initial  _(rs=2)_|S _(rs=2)_|_(rs=2)_|_(rs=2)_|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/memberInformation/middleName|Member Middle Name||||
|**178**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/insuranceInformation/subscriberInformation/segmentedName/middleName|Subscriber Middle Name||If 2010CA.NM1  does not exist.||
|**179**|2010BA.NM107 _(rs=2)_|Name Suffix _(rs=2)_|Suffix _(rs=2)_|S _(rs=2)_|_(rs=2)_|_(rs=2)_|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/memberInformation/nameSuffix|Member name suffix||If 2010CA.NM1  does not exist.||
|**180**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/insuranceInformation/subscriberInformation/segmentedName/suffix|Subscriber name suffix||||
|**181**|2010BA.NM108|Identification Code Qualifier|Code designating the system/method of code structure used for Identification<br>Code|S|II :  Standard Unique Health Identifier for each Individual in the United States<br>MI  :  Member Identification Number|||||||
|**182**|2010BA.NM109 _(rs=3)_|Identification Code _(rs=3)_|Code identifying a party or other code / Subscriber Primary Identifier _(rs=3)_|S _(rs=3)_|000561005 _(rs=3)_|_(rs=3)_|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/submittedSubscriberId|Submitted subscriber ID passed<br>through from external system.|Remove all special characters including space and map only the alphanumeric characters|||
|**183**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/memberInformation/memberIdentificationNumber|Member HCC ID|Remove all special characters including space and map only the alphanumeric characters<br>Only 2000C Loop doesn't exist|||
|**184**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/insuranceInformation/subscriberInformation/identificationNumber|<br>Identification number of the subscribed individual. This number can be assigned by the Health Care Company, Medicare, or some other organization, and is used as part of the identification system in HealthRules|Remove all special characters including space and map only the alphanumeric characters<br><br>|||
|**185**|Segment - N3 Subscriber Address (Situational)|||||||||||
|**186**|2010BA.N301|Address Information|Address Information|R|4495 YUKON COURT APT 78||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/memberInformation/streetAddress|The first line of the street address.||If 2010CA.N3  does not exist.||
|**187**|||||||institutionalClaim/insuranceInformation/subscriberInformation/streetAddress|||||
|**188**|2010BA.N302|Address Information||S||||||||
|**189**|Segment - N4 Subscriber City, State, ZIP Code (Situational)|||||||||||
|**190**|2010BA.N401|City Name|Free-form text for city name|R|WHEAT RIDGE||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/memberInformation/cityName|city||If 2010CA.N4  does not exist.||
|**191**|||||||institutionalClaim/insuranceInformation/subscriberInformation/cityName|||||
|**192**|2010BA.N402|State or Province Code|Code (Standard State/Province) as defined by appropriate government agency|S|CO||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/memberInformation/stateCode|State abbreviation||If 2010CA.N4  does not exist.||
|**193**|||||||institutionalClaim/insuranceInformation/subscriberInformation/stateCode|||||
|**194**|2010BA.N403|Postal Code|Code defining international postal zone code excluding punctuation and blanks (zip code for United States)|S|800333283||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/memberInformation/postalCode|zip code||If 2010CA.N4  does not exist.||
|**195**|||||||institutionalClaim/insuranceInformation/subscriberInformation/postalCode|||||
|**196**|2010BA.N404|Country Code|Code identifying the country|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/memberInformation/countryCode|Country code|Map "US" if no value present|If 2010CA.N4  does not exist.||
|**197**||||||||||||
|**198**|2010BA.N407|Country Subdivision Code|Code identifying the country subdivision|S|||institutionalClaim/insuranceInformation/subscriberInformation/countryCode/countryCode|Country code|Map "US" if no value present|||
|**199**|Segment - DMG Subscriber Demographic Information (Situational)|||||||||||
|**200**|2010BA.DMG01|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 :  Date Expressed in Format|||||||
|**201**|2010BA.DMG02|Date Time Period|Date Time Period|R|YYYYMMDD||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/memberInformation/dateOfBirth|Member dateOfBirth|In the format YYYY-MM-DD<br>|If 2010CA.DMG  does not exist.<br><br>In the format YYYY-MM-DD<br><br>||
|**202**|2010BA.DMG03|Gender Code|Code indicating the sex of the individual|R|F : Female<br>M : Male||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/memberInformation/genderCode|genderCode|M=Male, F=Female, U=Unknown|<br>If 2010CA.DMG  does not exist.||
|**203**|Segment - REF Subscriber Secondary Identification (Situational)|||||||||||
|**204**|2010BA.REF01|Reference Identification Qualifier|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier|R||||||||
|**205**|2010BA.REF02|Reference Identification|Code qualifying the Reference Identification|R||||||||
|**206**|Segment - REF Property and Casualty Claim Number (Situational)|||||||||||
|**207**|2010BA.REF01|Reference Identification Qualifier|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier|R||||||||
|**208**|2010BA.REF02|Reference Identification|Code qualifying the Reference Identification|R||||||||
|**209**|Loop 2010BB (Required) Loop Repeat: 1|||||||||||
|**210**|Segment - NM1 Payer Name (Required)|||||||||||
|**211**|2010BB.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R|PR -Payer|||||||
|**212**|2010BB.NM102|Entity Type Qualifier|Code qualifying the type of entity|R|2 :Non-Person Entity|||||||
|**213**|2010BB.NM103|Name Last or Organization Name|Name Last or Organization Name|R|HealthPlan||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/insuranceInformation/payerInformation/payerName|The name of the Payer, Exchange, etc||||
|**214**|2010BB.NM108|Identification Code Qualifier|Code designating the system/method of code structure used for Identification<br>Code|R|PI :  Payor Identification<br>XV : Centers for Medicare and Medicaid Services PlanID|||||||
|**215**|2010BB.NM109|Identification Code|Code identifying a party or other code / Subscriber Primary Identifier|R|COACC||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/insuranceInformation/payerInformation/payerIdentificationNumber|<br>Identification number of the subscribed individual. This number can be assigned by the Health Care Company, Medicare, or some other organization, and is used as part of the identification system in HealthRules||||
|**216**|Segment - N3 Payer Address (Situational)|||||||||||
|**217**|2010BB.N301|Address Information|Address Information|R|PO BOX 17471|||||||
|**218**|2010BB.N302|Address Information|Address Information|S||||||||
|**219**|Segment - N4 Payer City, State, ZIP Code (Situational)|||||||||||
|**220**|2010BB.N401|City Name|Free-form text for city name|R|DENVER|||||||
|**221**|2010BB.N402|State or Province Code|Code (Standard State/Province) as defined by appropriate government agency|S|CO|||||||
|**222**|2010BB.N403|Postal Code|Code defining international postal zone code excluding punctuation and blanks (zip code for United States)|S|802170470|||||||
|**223**|2010BB.N404|Country Code|Code identifying the country|S||||||||
|**224**|2010BB.N407|Country Subdivision Code|Code identifying the country subdivision|S||||||||
|**225**|Segment - REF Payer Secondary Identification (Situational)|||||||||||
|**226**|2010BB.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R||||||||
|**227**|2010BB.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier|R||||||||
|**228**|Segment - REF Billing Provider Secondary Identification (Situational)|||||||||||
|**229**|2010BB.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R||||||||
|**230**|2010BB.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier|R||||||||
|**231**|2010BB.DMG03|Gender Code||R||||||||
|**232**|Loop 2000C - Patient Hierarchical Level (Situational)  In case of dependent claims (if the dependant is the patient ),  2000C loop will be there and the 2300 and 2400 loop will be below 2000C in that scenario)|||||||||||
|**233**|Segment HL -  Patient Hierarchical Level (Situational)|||||||||||
|**234**|2000C.HL01|Hierarchical ID Number|A unique number assigned by the sender to identify a particular data segment in<br>a hierarchical structure|R||||||||
|**235**|2000C.HL02|Hierarchical Parent ID Number|Identification number of the next higher hierarchical data segment that the data<br>segment being described is subordinate to|R||||||||
|**236**|2000C.HL03|Hierarchical Level Code|Code defining the characteristic of a level in a hierarchical structure|R|23 : Dependent (the information<br>in this HL applies to the patient when the subscriber<br>and the patient are not the same person)|||||||
|**237**|2000C.HL04|Hierarchical Child Code|Code indicating if there are hierarchical child data segments subordinate to the<br>level being described|R|0 :  No Subordinate HL Segment in This Hierarchical<br>Structure|||||||
|**238**|Segment PAT - Patient information|||||||||||
|**239**|2000C.PAT01|Individual Relationship Code|Code indicating the relationship between two individuals or entities|R|01 : Spouse<br>19 : Child<br>18:self<br>20 : Employee<br>21 : Unknown<br>39 : Organ Donor<br>40:  Cadaver Donor<br>53:  Life Partner<br>G8 : Other Relationship||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/insuranceInformation/subscriberInformation/relationshipToSubscriberCode|||||
|**240**|Loop 2010CA - Patient Name (Situational)  Loop Repeat: 1|||||||||||
|**241**|Segment - NM1 Patient Name (Required)|||||||||||
|**242**|2010CA.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R|QC : Patient|||||||
|**243**|2010CA.NM102|Entity Type Qualifier|Code qualifying the type of entity|R|1: Person|||||||
|**244**|2010CA.NM103|Name Last or Organization Name|Organization Name Last Name|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/memberInformation/lastName|||||
|**245**|2010CA.NM104|Name First _(rs=2)_|Patient  First Name _(rs=2)_|S _(rs=2)_|_(rs=2)_|_(rs=2)_|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/memberInformation/firstName|||||
|**246**|2010CA.NM104|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/memberInformation/memberName||concatenate NM103/5/4/7|||
|**247**|2010CA.NM105|Name Middle|Patient Middle Name or Initial|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/memberInformation/middleName|||||
|**248**|2010CA.NM107|Name Suffix|Patient Name Suffix|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/memberInformation/nameSuffix|||||
|**249**|Segment - N3 Patient Address (Situational)|||||||||||
|**250**|2010CA.N301|Address Information|Code identifying the Patient address|R||1000 JACKSON ST|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/memberInformation/Street Address|||||
|**251**|2010CA.N302|Address Information|Code identifying the Patient address|S||||||||
|**252**|Segment - N4 Patient City, State, ZIP Code (Situational)|||||||||||
|**253**|2010CA.N401|City Name|Free-form text for city name|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/memberInformation/cityname|||||
|**254**|2010CA.N402|State or Province Code|Code (Standard State/Province) as defined by appropriate government agency|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/memberInformation/statecode|||||
|**255**|2010CA.N403|Postal Code|Code defining international postal zone code excluding punctuation and blanks|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/memberInformation/postalcode|||||
|**256**|2010CA.N404|Country Code|Code identifying the country|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/memberInformation/countrycode||Map to the value "US" if not present|||
|**257**|2010CA.N407|Country Subdivision Code|Code identifying the country subdivision|S||||||||
|**258**|Segment - DMG Patient Demographic Information (Situational)|||||||||||
|**259**|2010CA.DMG01|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 : Date Expressed in Format CCYYMMDD|||||||
|**260**|2010CA.DMG02|Date Time Period|Expression of a date, a time, or range of dates, times or dates and times/Patient Birth Date|R||19670712|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/memberInformation/dateOfBirth||In the format YYYY-MM-DD|||
|**261**|2010CA.DMG03|Gender Code|Code indicating the sex of the individual|R|F: Female<br>M :Male<br>U : Unknown||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/memberInformation/genderCode||M=Male, F=Female, U=Unknown|||
|**262**|Segment - Property and Casuality Claim Number (Situational)|||||||||||
|**263**|2010CA.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R||||||||
|**264**|2010CA.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier|R||||||||
|**265**|Loop 2300  - CLAIM INFORMATION(Required)  Loop Repeat: 100<br>       When patient is the subscriber : The claim information(Loop ID-2300), is placed following Loop ID-2010BB in the Subscriber Hierarchical Level(HL) and patient information is sent in Loop ID-2010BA.<br>       When patient is the dependent :  The claim information(Loop ID-2300),is placed following Loop ID-2010CA  in the Patient HL and the patient information is sent in Loop ID-2010CA . _(cs=10)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚||
|**266**|Segment - CLM Claim information (Situational)|||||||||||
|**267**|2300.CLM01|Claim Submitter's Identifier|Identifier used to track a claim from creation by the health care provider through payment|R|<patientControlNumber> 1003795048I7791539||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/memberInformation/patientControlNumber|Patient control number.||||
|**268**|2300.CLM02 _(rs=2)_|Monetary Amount _(rs=2)_|Monetary Amount   CLM02 is the total amount of all submitted charges of service segments<br>for this claim. _(rs=2)_|R _(rs=2)_|214.25 _(rs=2)_||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/totals|total amount||||
|**269**|⬚|⬚|⬚|⬚|⬚||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/billedAmount|Amount billed||It falls under COB mapping||
|**270**|2300.CLM05.01|Facility Code Value|Code identifying where services were, or may be, performed; the first<br>and second positions of the Uniform Bill Type Code for Institutional<br>Services or the Place of Service Codes for Professional or Dental<br>Services.|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/typeOfBillCode|The type of bill code submitted on the claim;<br>facility claims only|concatenate 2300.CLM05-01 and 2300.CLM05-03|||
|**271**|2300.CLM05.02|Facility Code Qualifier|Code identifying the type of facility referenced|R|D :Place of Service Codes for institutional Services|||||||
|**272**|2300.CLM05.03|Claim Frequency Type Code|code specifying the frequency of the claim; this is the third position of<br>the Uniform Billing Claim Form Bill Type|R|1||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/frequencyCode|Trigger value for Void and Replace<br>actions for the claim.||||
|**273**|2300.CLM07|Provider Accept Assignment Code|Code indicating whether the provider accepts assignment|R|A : Assigned<br>B : Assignment Accepted on Clinical Lab Services Only<br>C :  Not Assigned||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/supplierInformation/assignmentAcceptance||If 2300.CLM07 = “A”, Map “Y” <br>Else If 2300.CLM07  = “C”, Map “N”|||
|**274**|2300.CLM08|Yes/No Condition or Response Code|Benefits Assignment Certification Indicator|R|Y : Yes<br>N : No<br>W :  Not Applicable||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/insuranceInformation/payerInformation/benefitAssignmentIndicator|benefit Assignment Indicator||||
|**275**|2300.CLM09|Release of Information Code|Code indicating whether the provider has on file a signed statement by the patient<br>authorizing the release of medical data to other organizations|R|I : Informed Consent  to Release Medical Information for Conditions or Diagnoses <br>Y :Yes, Provider has a Signed Statement Permitting<br>Release of Medical Billing Data Related to a Claim||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/insuranceInformation/payerInformation/releaseInformationInd|releaseInformationInd||||
|**276**|2300.CLM20|Delay Reason Code|Code indicating the reason why a request was delayed|S||||||||
|**277**|Segment - DTP Discharge Date/Hour (Situational)|||||||||||
|**278**|2300.DTP01|Date/Time Qualifier|Code specifying type of date or time, or both date and time|R|<br>096 Discharge<br>|||||||
|**279**|2300.DTP02|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 Date Expressed in Format CCYYMMDD<br>DT Date and Time Expressed in Format<br>CCYYMMDDHHMM|||||||
|**280**|2300.DTP03|Date Time Period|Date Time Period|R|HH:MM||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/dischargeInformation/dischargeTimeCount|Time at which member was discharged from the facility||||
|**281**|Segment - DTP Statement Dates (Required)|||||||||||
|**282**|2300.DTP01|Date/Time Qualifier|Code specifying type of date or time, or both date and time|R|434 Statement|||||||
|**283**|2300.DTP02|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|RD8 :  Date Expressed in Format CCYYMMDD|||||||
|**284**|2300.DTP03 _(rs=2)_|Date Time Period _(rs=2)_|Date Time Period _(rs=2)_|R _(rs=2)_|_(rs=2)_|20210311-20210311 _(rs=2)_|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/statementCoveredPeriod/startDate|Contains elements that define the period covered by the payment request - Start Date|byte 1-8 in format YYYY-MM-DD|||
|**285**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/statementCoveredPeriod/endDate|Contains elements that define the period covered by the payment request - End Date|byte 10-17  in format YYYY-MM-DD|||
|**286**|Segment - DTP Admission Date/Hour (Situational)|||||||||||
|**287**|2300.DTP01|Date/Time Qualifier|Code specifying type of date or time, or both date and time|R|435 :Admission|||||||
|**288**|2300.DTP02|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 :  Date Expressed in Format CCYYMMDD|||||||
|**289**|2300.DTP03 _(rs=2)_|Date Time Period _(rs=2)_|Date Time Period _(rs=2)_|R _(rs=2)_|If D8 - CCYYMMDD<br>If DT- CCYYMMDDHH  _(rs=2)_|_(rs=2)_|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/admissionInformation/admissionDate|Date of admission to the facility|In the format YYYY-MM-DD|||
|**290**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/admissionInformation/admissionTimeCount|Time of admission to the facility|when DTP02=DT map byte 9-12|||
|**291**|Segment - DTP Date - Repricer Received Date (Situational)|||||||||||
|**292**|2300.DTP01|Date/Time Qualifier|Code specifying type of date or time, or both date and time|R|050 Received|||||||
|**293**|2300.DTP02|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 :  Date Expressed in Format CCYYMMDD|||||||
|**294**|2300.DTP03|Date Time Period|Date Time Period|R|If D8 - CCYYMMDD<br>If DT- CCYYMMDDHH||||In the format YYYY-MM-DD<br>|||
|**295**|Segment - CL1 Institutional Claim Code (Required)|||||||||||
|**296**|2300.CL101|Admission Type Code|Code indicating the priority of this admission|R|1-Emergency<br>2-Urgent<br>3-Elective||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/admissionInformation/admissionTypeCode|Admission type.||||
|**297**|2300.CL102|Admission Source Code|Code indicating the source of this admissio|S|1||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/admissionInformation/admissionSourceCode|Admission source code.||||
|**298**|2300.CL103|Patient Status Code|Code indicating patient status as of the “statement covers through date|R|01||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/dischargeInformation/dischargeStatusCode|Discharge status code.||||
|**299**|Segment - PWK Claim Supplemental Information (Situational)|||||||||||
|**300**|2300.PWK01 _(rs=2)_|Report Type Code _(rs=2)_|Code indicating the title or contents of a document, report or supporting item _(rs=2)_|R _(rs=2)_|03 Report Justifying Treatment Beyond Utilization<br>Guidelines<br>04 Drugs Administered<br>05 Treatment Diagnosis<br>06 Initial Assessment<br>07 Functional Goals<br>08 Plan of Treatment<br>09 Progress Report<br>10 Continued Treatment<br>11 Chemical Analysis<br>13 Certified Test Report<br>15 Justification for Admission<br>21 Recovery Plan<br>A3 Allergies/Sensitivities Document<br>A4 Autopsy Report<br>AM Ambulance Certification<br>AS Admission Summary<br>B2 Prescription<br>B3 Physician Order<br>B4 Referral Form<br>BR Benchmark Testing Results<br>BS Baseline<br>BT Blanket Test Results<br>CB Chiropractic Justification<br>CK Consent Form(s)<br>CT Certification<br>D2 Drug Profile Document<br>DA Dental Models<br>DB Durable Medical Equipment Prescription<br>DG Diagnostic Report<br>DJ Discharge Monitoring Report<br>DS Discharge Summary<br>EB Explanation of Benefits (Coordination of Benefits or<br>Medicare Secondary Payor)<br>HC Health Certificate<br>HR Health Clinic Records<br>I5 Immunization Record<br>005010X223 • 837 • 2400 • PWK ASC X12N • INSURANCE SUBCOMMITTEE<br>LINE SUPPLEMENTAL INFORMATION TECHNICAL REPORT • TYPE 3<br>430 MAY 2006<br>IR State School Immunization Records<br>LA Laboratory Results<br>M1 Medical Record Attachment<br>MT Models<br>NN Nursing Notes<br>OB Operative Note<br>OC Oxygen Content Averaging Report<br>OD Orders and Treatments Document<br>OE Objective Physical Examination (including vital<br>signs) Document<br>OX Oxygen Therapy Certification<br>OZ Support Data for Claim<br>P4 Pathology Report<br>P5 Patient Medical History Document<br>PE Parenteral or Enteral Certification<br>PN Physical Therapy Notes<br>PO Prosthetics or Orthotic Certification<br>PQ Paramedical Results<br>PY Physician’s Report<br>PZ Physical Therapy Certification<br>RB Radiology Films<br>RR Radiology Reports<br>RT Report of Tests and Analysis Report<br>RX Renewable Oxygen Content Averaging Report<br>SG Symptoms Document<br>V5 Death Notification<br>XP Photographs _(rs=2)_||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/attachmentCodeCode/codeEntry|Attachment Type like Prescription|Please refer crosswalk sheet|Code entry describes the value of the codes <br>E.g "B2"||
|**301**|⬚|⬚|⬚|⬚|⬚||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/attachmentCodeCode/codeSetName|Internal field for fetching the Attachment type|AttachmentTypeCode<br>Please refer crosswalk sheet|Code entry describes the decsription of the codes <br>E.g  B2 - "Prescription"||
|**302**|2300.PWK02|Report Transmission Code|Code defining timing, transmission method or format by which reports are to be<br>sent|R|AA Available on Request at Provider Site<br>179 This means that the additional information is not<br>being sent with the claim at this time. Instead, it is<br>available to the payer (or appropriate entity) at their<br>request.<br>BM By Mail<br>EL Electronically Only<br>180 Indicates that the attachment is being transmitted in<br>a separate X12 functional group.<br>EM E-Mail<br>FT File Transfe||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/transmissionType|Attachment transmission mode|If "AA" Map "Available on Request at Provider Site"<br>If "BM" Map "By Mail"<br>If "EL" Map "Electronically Only"<br>If "EM" Map "E-Mail"<br>If "FT" Map "File Transfer"<br>If "FX" Map "By Fax"|Needs review with configuration team||
|**303**|2300.PWK05|Identification Code Qualifier|Code designating the system/method of code structure used for Identification<br>Code (67)|S||||||||
|**304**|2300.PWK06 _(rs=2)_|Identification Code _(rs=2)_|Code identifying a party or other code _(rs=2)_|S _(rs=2)_|_(rs=2)_|_(rs=2)_|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/attachmentSetReference/ID|Attachment Control number|Map only the first occurence of PWK|||
|**305**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/attachmentComment|Attachment control number. Static URL to be prefixed for loading the image||||
|**306**|Segment - CN1 Contract Information (Situational)|||||||||||
|**307**|2300.CN101|Contract Type Code|Code identifying a contract type|R|01 Diagnosis Related Group (DRG)<br>02 Per Diem<br>03 Variable Per Diem<br>04 Flat<br>05 Capitated<br>06 Percent<br>09 Other||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/externalClaimFees/externalClaimFee/feeTypeCode/codeEntry|Fee type code entry||||
|**308**|2300.CN102|Monetary Amount|Monetary amount|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/externalClaimFees/externalClaimFee/feeAmount|Amount of the fee||||
|**309**|2300.CN103|Percent, Decimal Format|Percent given in decimal format (e.g., 0.0 through 100.0 represents 0% through<br>100%)|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/externalClaimFees/externalClaimFee/feePercent|Percentage of the fee||||
|**310**|2300.CN104|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier|S||||||||
|**311**|2300.CN105|Terms Discount Percent|Terms discount percentage, expressed as a percent, available to the purchaser if<br>an invoice is paid on or before the Terms Discount Due Date|S||||||||
|**312**|2300.CN106|Version Identifier|Revision level of a particular format, program, technique or algorithm|S||||||||
|**313**|Segment - AMT Patient Estimated Amount Due (Situational)|||||||||||
|**314**|2300.AMT01|Amount Qualifier Code|Code to qualify amount|R|F3 Patient Responsibility - Estimated|||||||
|**315**|2300.AMT02|Monetary Amount|Monetary Amount|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/dueFromPatient/estimatedAmount|Estimated due amount from patient||||
|**316**|Segment - REF Service Authorization Exception Code (Situational)|||||||||||
|**317**|2300.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|4N :Special Payment Reference Number|||||||
|**318**|2300.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier|R|1 Immediate/Urgent Care<br>2 Services Rendered in a Retroactive Period<br>3 Emergency Care<br>4 Client has Temporary Medicaid<br>5 Request from County for Second Opinion to Determine<br>if Recipient Can Work<br>6 Request for Override Pending<br>7 Special Handling|||||||
|**319**|Segment - REF Referral Number (Situational)|||||||||||
|**320**|2300.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|9F Referral Number|||||||
|**321**|2300.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier|R||||||||
|**322**|Segment - REF Prior Authorization (Situational)|||||||||||
|**323**|2300.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|G1 : Prior Authorization Number|||||||
|**324**|2300.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/insuranceInformation/treatmentAuthorizationCode|Authorization code for the treatment||||
|**325**|Segment - REF Payer Claim Control Number (Situational)|||||||||||
|**326**|2300.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|F8 Original Reference Number|||||||
|**327**|2300.REF02 _(rs=2)_|Reference Identification _(rs=2)_|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier _(rs=2)_|R _(rs=2)_|_(rs=2)_|_(rs=2)_|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/hccClaimNumber|Original Claim ID<br> Claim ID (Unique identifier assigned to the supplier invoice )<br>HccClaimNumberType|<br>Map only for void/replacement claims|||
|**328**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/insuranceInformation/dcnNumber|If a resubmission, the original reference number||Need to check on HRP field name||
|**329**|Segment - REF Repriced Claim Number (Situational)|||||||||||
|**330**|2300.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|9A-Repriced Claim Reference Number|||||||
|**331**|2300.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier|R||||||||
|**332**|Segment - REF Adjusted Repriced Claim Number (Situational)|||||||||||
|**333**|2300.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|9C :  Adjusted Repriced Claim Reference Number|||||||
|**334**|2300.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier|R||||||||
|**335**|Segment - REF Investigational Device Exemption Number (Situational)|||||||||||
|**336**|2300.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|LX : Qualified Products List|||||||
|**337**|2300.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier|R||||||||
|**338**|Segment - REF Claim Identification For Transmission Intermediaries (Situational)|||||||||||
|**339**|2300.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|D9 : Claim Number|||||||
|**340**|2300.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/clearingHouseTraceNumber|Clearing House Trace Number||||
|**341**|Segment - REF Auto Accident State (Situational)|||||||||||
|**342**|2300.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|LU Location Number|||||||
|**343**|2300.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/accidentStateCode|Accdent State (State in which accident occurred)||||
|**344**|Segment - REF Medical Record Number (Situational)|||||||||||
|**345**|2300.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|EA Medical Record Identification Number|||||||
|**346**|2300.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/memberInformation/medicalRecordNumber|Medical record Number||||
|**347**|Segment - REF Demonstration Project Identifier (Situational)|||||||||||
|**348**|2300.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|P4 -Project Code|||||||
|**349**|2300.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier|R||||||||
|**350**|Segment - REF Peer Review Organization (PRO) Approval Number (Situational)|||||||||||
|**351**|2300.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|G4-Peer Review Organization (PRO) Approval Number|||||||
|**352**|2300.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier|R||||||||
|**353**|Segment - K3 File Information (Situational)|||||||||||
|**354**|2300.K301|Fixed Format Information|Data in fixed format agreed upon by sender and receiver|R||||||||
|**355**|Segment - NTE Claim Note (Situational)|||||||||||
|**356**|2300.NTE01|Note Reference Code|Code identifying the functional area or purpose for which the note applies|R|ALG Allergies<br>DCP Goals, Rehabilitation Potential, or Discharge Plans<br>DGN Diagnosis Description<br>DME Durable Medical Equipment (DME) and Supplies<br>005010X223 • 837 • 2300 • NTE ASC X12N • INSURANCE SUBCOMMITTEE<br>CLAIM NOTE TECHNICAL REPORT • TYPE 3<br>178 MAY 2006<br>MED Medications<br>NTR Nutritional Requirements<br>ODT Orders for Disciplines and Treatments<br>RHB Functional Limitations, Reason Homebound, or Both<br>RLH Reasons Patient Leaves Home<br>RNH Times and Reasons Patient Not at Home<br>SET Unusual Home, Social Environment, or Both<br>SFM Safety Measures<br>SPT Supplementary Plan of Treatment<br>UPI Updated Information||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalRemarks/remarkCode|||||
|**357**|2300.NTE02|Description|A free-form description to clarify the related data elements and their content  /  Claim Note Text|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalRemarks/remarks/remark|Contains general remarks related to claim||||
|**358**|Segment - NTE Billing Note (Situational)|||||||||||
|**359**|2300.NTE01|Note Reference Code|Code identifying the functional area or purpose for which the note applies|R|ADD Additional Information||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalRemarks/remarkCode|||||
|**360**|2300.NTE02|Description|A free-form description to clarify the related data elements and their content  /  Claim Note Text|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalRemarks/remarks/remark|Contains general remarks related to claim||||
|**361**|Segment - CRC EPSDT Referral (Situational)|||||||||||
|**362**|2300.CRC01|Code Category|Specifies the situation or category to which the code applies|R|ZZ Mutually Defined|||||||
|**363**|2300.CRC02|Yes/No Condition or Response Code|Certification Condition Indicator|R|N No<br>650 If no, then choose “NU” in CRC03 indicating no<br>referral given.<br>Y Yes|||||||
|**364**|2300.CRC03|Condition Indicator|Code indicating a condition|R|AV Available - Not Used<br>652 Patient refused referral.<br>NU Not Used<br>653 This conditioner indicator must be used when the<br>submitter answers “N” in CRC02.<br>S2 Under Treatment<br>654 Patient is currently under treatment for referred<br>diagnostic or corrective health problem.<br>ST New Services Requested<br>655 Patient is referred to another provider for diagnostic<br>or corrective treatment for at least one health<br>problem identified during an initial or periodic<br>screening service (not including dental referrals). <br>OR <br>Patient is scheduled for another appointment with<br>screening provider for diagnostic or corrective<br>treatment for at least one health problem identified<br>during an initial or periodic screening service (not<br>including dental referrals).||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/epsdtReferralCodes/epsdtReferralCode|Early & Periodic Screening, Diagnosis, and Treatment Code||||
|**365**|2300.CRC04|Condition Indicator|Code indicating a condition|S||||||||
|**366**|2300.CRC05|Condition Indicator|Code indicating a condition|S||||||||
|**367**|Segment - HI Principal Diagnosis (Required)|||||||||||
|**368**|2300.HI01.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|ABK : ICD10 -CM - Principal Diagnosis<br>BK : ICD9 -CM - Principal Diagnosis|||||||
| **369** | 2300.HI01.02 | Industry Code |  Diagnosis Code  | R |  |  | institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/primaryDiagnosisCode | Primary Diagnosis (Primary diagnosis code for the trial
<br>claim) | <br>If we get more than 3 digits, should add a dot (.)after 3rd Character |  |  |
|**370**|2300.HI01.09|Yes/No Condition or Response Code|Code indicating a Yes or No condition or response|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/primaryDiagnosisPOAIndicator|Primary diagnosis POA indicator||||
|**371**|Segment - HI Admitting Diagnosis (Situational)|||||||||||
|**372**|2300.HI01.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|ABJ -  International Classification of Diseases Clinical<br>Modification (ICD-10-CM) Admitting Diagnosis|||||||
|**373**|2300.HI01.02|Industry Code|Diagnosis Code|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/admitDiagnosisCode|Diagnosis code that resulted in admission.|<br>If we get more than 3 digits, should add a dot (.)after 3rd Character|||
|**374**|Segment - HI Patient Reason For Visit (Situational)|||||||||||
|**375**|2300.HI01.01|Code List Qualifier Code|Code identifying a specific industry code list/ Principal Diagnosis Type Code|R|APR - International Classification of Diseases Clinical<br>Modification (ICD-10-CM) Patient’s Reason for Visit<br>PR- International Classification of Diseases Clinical<br>Modification (ICD-9-CM) Patient’s Reason for Visit|||||||
|**376**|2300.HI01.02|Industry Code|Diagnosis Code|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/patientReasonForVisitList/diagnosisCode|Diagnosis code.|<br>If we get more than 3 digits, should add a dot (.)after 3rd Character|||
|**377**|2300.HI02.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|APR - International Classification of Diseases Clinical<br>Modification (ICD-10-CM) Patient’s Reason for Visit<br>PR- International Classification of Diseases Clinical<br>Modification (ICD-9-CM) Patient’s Reason for Visit|||||||
|**378**|2300.HI02.02|Industry Code|Diagnosis Code|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/patientReasonForVisitList/diagnosisCode|Diagnosis code.|<br>If we get more than 3 digits, should add a dot (.)after 3rd Character|||
|**379**|2300.HI03.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|APR - International Classification of Diseases Clinical<br>Modification (ICD-10-CM) Patient’s Reason for Visit<br>PR- International Classification of Diseases Clinical<br>Modification (ICD-9-CM) Patient’s Reason for Visit|||||||
|**380**|2300.HI03.02|Industry Code|Diagnosis Code|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/patientReasonForVisitList/diagnosisCode|Diagnosis code.|<br>If we get more than 3 digits, should add a dot (.)after 3rd Character|||
|**381**|Segment - HI External Cause of Injury (Situational)|||||||||||
|**382**|2300.HI01.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|ABN : International Classification of Diseases Clinical<br>Modification (ICD-10-CM) External Cause of Injury<br>Code<br>BN : International Classification of Diseases Clinical<br>Modification (ICD-9-CM) External Cause of Injury<br>Code (E-codes)|||||||
|**383**|2300.HI01.02|Industry Code|Diagnosis Code|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/externalDiagnosisList/diagnosisCode|Diagnosis code.|<br>If we get more than 3 digits, should add a dot (.)after 3rd Character|||
|**384**|2300.HI01.09|Yes/No Condition or Response Code|Code indicating a Yes or No condition or response|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/externalDiagnosisList/poaIndicator|POA indicator||||
|**385**|2300.HI02.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|ABN : International Classification of Diseases Clinical<br>Modification (ICD-10-CM) External Cause of Injury<br>Code<br>BN : International Classification of Diseases Clinical<br>Modification (ICD-9-CM) External Cause of Injury<br>Code (E-codes)|||||||
|**386**|2300.HI02.02|Industry Code|Diagnosis Code|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/externalDiagnosisList/diagnosisCode|Diagnosis code.|<br>If we get more than 3 digits, should add a dot (.)after 3rd Character|||
|**387**|2300.HI02.09|Yes/No Condition or Response Code|Code indicating a Yes or No condition or response|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/externalDiagnosisList/poaIndicator|POA indicator||||
|**388**|2300.HI03.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|ABN : International Classification of Diseases Clinical<br>Modification (ICD-10-CM) External Cause of Injury<br>Code<br>BN : International Classification of Diseases Clinical<br>Modification (ICD-9-CM) External Cause of Injury<br>Code (E-codes)|||||||
|**389**|2300.HI03.02|Industry Code|Diagnosis Code|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/externalDiagnosisList/diagnosisCode|Diagnosis code.|<br>If we get more than 3 digits, should add a dot (.)after 3rd Character|||
|**390**|2300.HI03.09|Yes/No Condition or Response Code|Code indicating a Yes or No condition or response|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/externalDiagnosisList/poaIndicator|POA indicator||||
|**391**|2300.HI04.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|ABN : International Classification of Diseases Clinical<br>Modification (ICD-10-CM) External Cause of Injury<br>Code<br>BN : International Classification of Diseases Clinical<br>Modification (ICD-9-CM) External Cause of Injury<br>Code (E-codes)|||||||
|**392**|2300.HI04.02|Industry Code|Diagnosis Code|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/externalDiagnosisList/diagnosisCode|Diagnosis code.|<br>If we get more than 3 digits, should add a dot (.)after 3rd Character|||
|**393**|2300.HI04.09|Yes/No Condition or Response Code|Code indicating a Yes or No condition or response|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/externalDiagnosisList/poaIndicator|POA indicator||||
|**394**|2300.HI05.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|ABN : International Classification of Diseases Clinical<br>Modification (ICD-10-CM) External Cause of Injury<br>Code<br>BN : International Classification of Diseases Clinical<br>Modification (ICD-9-CM) External Cause of Injury<br>Code (E-codes)|||||||
|**395**|2300.HI05.02|Industry Code|Diagnosis Code|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/externalDiagnosisList/diagnosisCode|Diagnosis code.|<br>If we get more than 3 digits, should add a dot (.)after 3rd Character|||
|**396**|2300.HI05.09|Yes/No Condition or Response Code|Code indicating a Yes or No condition or response|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/externalDiagnosisList/poaIndicator|POA indicator||||
|**397**|2300.HI06.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|ABN : International Classification of Diseases Clinical<br>Modification (ICD-10-CM) External Cause of Injury<br>Code<br>BN : International Classification of Diseases Clinical<br>Modification (ICD-9-CM) External Cause of Injury<br>Code (E-codes)|||||||
|**398**|2300.HI06.02|Industry Code|Diagnosis Code|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/externalDiagnosisList/diagnosisCode|Diagnosis code.|<br>If we get more than 3 digits, should add a dot (.)after 3rd Character|||
|**399**|2300.HI06.09|Yes/No Condition or Response Code|Code indicating a Yes or No condition or response|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/externalDiagnosisList/poaIndicator|POA indicator||||
|**400**|2300.HI07.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|ABN : International Classification of Diseases Clinical<br>Modification (ICD-10-CM) External Cause of Injury<br>Code<br>BN : International Classification of Diseases Clinical<br>Modification (ICD-9-CM) External Cause of Injury<br>Code (E-codes)|||||||
|**401**|2300.HI07.02|Industry Code|Diagnosis Code|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/externalDiagnosisList/diagnosisCode|Diagnosis code.|<br>If we get more than 3 digits, should add a dot (.)after 3rd Character|||
|**402**|2300.HI07.09|Yes/No Condition or Response Code|Code indicating a Yes or No condition or response|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/externalDiagnosisList/poaIndicator|POA indicator||||
|**403**|2300.HI08.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|ABN : International Classification of Diseases Clinical<br>Modification (ICD-10-CM) External Cause of Injury<br>Code<br>BN : International Classification of Diseases Clinical<br>Modification (ICD-9-CM) External Cause of Injury<br>Code (E-codes)|||||||
|**404**|2300.HI08.02|Industry Code|Diagnosis Code|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/externalDiagnosisList/diagnosisCode|Diagnosis code.|<br>If we get more than 3 digits, should add a dot (.)after 3rd Character|||
|**405**|2300.HI08.09|Yes/No Condition or Response Code|Code indicating a Yes or No condition or response|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/externalDiagnosisList/poaIndicator|POA indicator||||
|**406**|2300.HI09.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|ABN : International Classification of Diseases Clinical<br>Modification (ICD-10-CM) External Cause of Injury<br>Code<br>BN : International Classification of Diseases Clinical<br>Modification (ICD-9-CM) External Cause of Injury<br>Code (E-codes)|||||||
|**407**|2300.HI09.02|Industry Code|Diagnosis Code|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/externalDiagnosisList/diagnosisCode|Diagnosis code.|<br>If we get more than 3 digits, should add a dot (.)after 3rd Character|||
|**408**|2300.HI09.09|Yes/No Condition or Response Code|Code indicating a Yes or No condition or response|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/externalDiagnosisList/poaIndicator|POA indicator||||
|**409**|2300.HI10.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|ABN : International Classification of Diseases Clinical<br>Modification (ICD-10-CM) External Cause of Injury<br>Code<br>BN : International Classification of Diseases Clinical<br>Modification (ICD-9-CM) External Cause of Injury<br>Code (E-codes)|||||||
|**410**|2300.HI10.02|Industry Code|Diagnosis Code|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/externalDiagnosisList/diagnosisCode|Diagnosis code.|<br>If we get more than 3 digits, should add a dot (.)after 3rd Character|||
|**411**|2300.HI10.09|Yes/No Condition or Response Code|Code indicating a Yes or No condition or response|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/externalDiagnosisList/poaIndicator|POA indicator||||
|**412**|2300.HI11.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|ABN : International Classification of Diseases Clinical<br>Modification (ICD-10-CM) External Cause of Injury<br>Code<br>BN : International Classification of Diseases Clinical<br>Modification (ICD-9-CM) External Cause of Injury<br>Code (E-codes)|||||||
|**413**|2300.HI11.02|Industry Code|Diagnosis Code|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/externalDiagnosisList/diagnosisCode|Diagnosis code.|<br>If we get more than 3 digits, should add a dot (.)after 3rd Character|||
|**414**|2300.HI11.09|Yes/No Condition or Response Code|Code indicating a Yes or No condition or response|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/externalDiagnosisList/poaIndicator|POA indicator||||
|**415**|2300.HI12.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|ABN : International Classification of Diseases Clinical<br>Modification (ICD-10-CM) External Cause of Injury<br>Code<br>BN : International Classification of Diseases Clinical<br>Modification (ICD-9-CM) External Cause of Injury<br>Code (E-codes)|||||||
|**416**|2300.HI12.02|Industry Code|Diagnosis Code|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/externalDiagnosisList/diagnosisCode|Diagnosis code.|<br>If we get more than 3 digits, should add a dot (.)after 3rd Character|||
|**417**|2300.HI12.09|Yes/No Condition or Response Code|Code indicating a Yes or No condition or response|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/externalDiagnosisList/poaIndicator|POA indicator||||
|**418**|Segment - HI Diagnosis Related Group (DRG) Information (Situational)|||||||||||
|**419**|2300.HI01.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|DR Diagnosis Related Group (DRG)|||||||
|**420**|2300.HI01.02|Industry Code|Diagnosis Code|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/ppsCode|Prospective payment system code|001-999|||
|**421**|Segment - HI Other Diagnosis Information (Situational)|||||||||||
|**422**|2300.HI01.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis|||||||
|**423**|2300.HI01.02|Industry Code|Diagnosis Code|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/otherDiagnosisList/diagnosisCode|Diagnosis Code|<br>If we get more than 3 digits, should add a dot (.)after 3rd Character|||
|**424**|2300.HI01.09|Yes/No Condition or Response Code|Code indicating a Yes or No condition or response|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/otherDiagnosisList/poaIndicator|POA Indicator||||
|**425**|2300.HI02.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis|||||||
|**426**|2300.HI02.02|Industry Code|Diagnosis Code|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/otherDiagnosisList/diagnosisCode|Diagnosis Code|<br>If we get more than 3 digits, should add a dot (.)after 3rd Character|||
|**427**|2300.HI02.09|Yes/No Condition or Response Code|Code indicating a Yes or No condition or response|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/otherDiagnosisList/poaIndicator|POA Indicator||||
|**428**|2300.HI03.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis|||||||
|**429**|2300.HI03.02|Industry Code|Diagnosis Code|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/otherDiagnosisList/diagnosisCode|Diagnosis Code|<br>If we get more than 3 digits, should add a dot (.)after 3rd Character|||
|**430**|2300.HI03.09|Yes/No Condition or Response Code|Code indicating a Yes or No condition or response|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/otherDiagnosisList/poaIndicator|POA Indicator||||
|**431**|2300.HI04.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis|||||||
|**432**|2300.HI04.02|Industry Code|Diagnosis Code|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/otherDiagnosisList/diagnosisCode|Diagnosis Code|<br>If we get more than 3 digits, should add a dot (.)after 3rd Character|||
|**433**|2300.HI04.09|Yes/No Condition or Response Code|Code indicating a Yes or No condition or response|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/otherDiagnosisList/poaIndicator|POA Indicator||||
|**434**|2300.HI05.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis|||||||
|**435**|2300.HI05.02|Industry Code|Diagnosis Code|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/otherDiagnosisList/diagnosisCode|Diagnosis Code|<br>If we get more than 3 digits, should add a dot (.)after 3rd Character|||
|**436**|2300.HI05.09|Yes/No Condition or Response Code|Code indicating a Yes or No condition or response|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/otherDiagnosisList/poaIndicator|POA Indicator||||
|**437**|2300.HI06.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis|||||||
|**438**|2300.HI06.02|Industry Code|Diagnosis Code|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/otherDiagnosisList/diagnosisCode|Diagnosis Code|<br>If we get more than 3 digits, should add a dot (.)after 3rd Character|||
|**439**|2300.HI06.09|Yes/No Condition or Response Code|Code indicating a Yes or No condition or response|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/otherDiagnosisList/poaIndicator|POA Indicator||||
|**440**|2300.HI07.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis|||||||
|**441**|2300.HI07.02|Industry Code|Diagnosis Code|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/otherDiagnosisList/diagnosisCode|Diagnosis Code|<br>If we get more than 3 digits, should add a dot (.)after 3rd Character|||
|**442**|2300.HI07.09|Yes/No Condition or Response Code|Code indicating a Yes or No condition or response|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/otherDiagnosisList/poaIndicator|POA Indicator||||
|**443**|2300.HI08.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis|||||||
|**444**|2300.HI08.02|Industry Code|Diagnosis Code|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/otherDiagnosisList/diagnosisCode|Diagnosis Code|<br>If we get more than 3 digits, should add a dot (.)after 3rd Character|||
|**445**|2300.HI08.09|Yes/No Condition or Response Code|Code indicating a Yes or No condition or response|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/otherDiagnosisList/poaIndicator|POA Indicator||||
|**446**|2300.HI09.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis|||||||
|**447**|2300.HI09.02|Industry Code|Diagnosis Code|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/otherDiagnosisList/diagnosisCode|Diagnosis Code|<br>If we get more than 3 digits, should add a dot (.)after 3rd Character|||
|**448**|2300.HI09.09|Yes/No Condition or Response Code|Code indicating a Yes or No condition or response|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/otherDiagnosisList/poaIndicator|POA Indicator||||
|**449**|2300.HI10.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis|||||||
|**450**|2300.HI10.02|Industry Code|Diagnosis Code|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/otherDiagnosisList/diagnosisCode|Diagnosis Code|<br>If we get more than 3 digits, should add a dot (.)after 3rd Character|||
|**451**|2300.HI10.09|Yes/No Condition or Response Code|Code indicating a Yes or No condition or response|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/otherDiagnosisList/poaIndicator|POA Indicator||||
|**452**|2300.HI11.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis|||||||
|**453**|2300.HI11.02|Industry Code|Diagnosis Code|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/otherDiagnosisList/diagnosisCode|Diagnosis Code|<br>If we get more than 3 digits, should add a dot (.)after 3rd Character|||
|**454**|2300.HI11.09|Yes/No Condition or Response Code|Code indicating a Yes or No condition or response|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/otherDiagnosisList/poaIndicator|POA Indicator||||
|**455**|2300.HI12.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis|||||||
|**456**|2300.HI12.02|Industry Code|Diagnosis Code|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/otherDiagnosisList/diagnosisCode|Diagnosis Code|<br>If we get more than 3 digits, should add a dot (.)after 3rd Character|||
|**457**|2300.HI12.09|Yes/No Condition or Response Code|Code indicating a Yes or No condition or response|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/diagnosisList/otherDiagnosisList/poaIndicator|POA Indicator||||
|**458**|Segment - HI Principal Procedure Information (Situational)|||||||||||
|**459**|2300.HI01.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BBR International Classification of Diseases Clinical<br>Modification (ICD-10-PCS) Principal Procedure<br>Codes|||||||
|**460**|2300.HI01.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/primaryProcedure/principleProcedureCode|Principal Procedure Code (Identification code for principal procedure performed)||||
|**461**|2300.HI01.03|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 Date Expressed in Format CCYYMMDD|||||||
|**462**|2300.HI01.04|Date Time Period|Expression of a date, a time, or range of dates, times or dates and times|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/primaryProcedure/procedureDate|Procedure Date|In the format YYYY-MM-DD<br>|||
|**463**|Segment - HI Other Procedure Information (Situational)|||||||||||
|**464**|2300.HI01.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BBQ International Classification of Diseases Clinical<br>Modification (ICD-10-PCS) Other Procedure Codes|||||||
|**465**|2300.HI01.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/otherProcedureList/procedureCode|Procedure Code||||
|**466**|2300.HI01.03|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 Date Expressed in Format CCYYMMDD|||||||
|**467**|2300.HI01.04|Date Time Period|Expression of a date, a time, or range of dates, times or dates and times|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/otherProcedureList/procedureDate|Procedure Date|In the format YYYY-MM-DD<br>|||
|**468**|2300.HI02.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BBQ International Classification of Diseases Clinical<br>Modification (ICD-10-PCS) Other Procedure Codes|||||||
|**469**|2300.HI02.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/otherProcedureList/procedureCode|Procedure Code||||
|**470**|2300.HI02.03|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 Date Expressed in Format CCYYMMDD|||||||
|**471**|2300.HI02.04|Date Time Period|Expression of a date, a time, or range of dates, times or dates and times|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/otherProcedureList/procedureDate|Procedure Date|In the format YYYY-MM-DD<br>|||
|**472**|2300.HI03.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BBQ International Classification of Diseases Clinical<br>Modification (ICD-10-PCS) Other Procedure Codes|||||||
|**473**|2300.HI03.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/otherProcedureList/procedureCode|Procedure Code||||
|**474**|2300.HI03.03|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 Date Expressed in Format CCYYMMDD|||||||
|**475**|2300.HI03.04|Date Time Period|Expression of a date, a time, or range of dates, times or dates and times|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/otherProcedureList/procedureDate|Procedure Date|In the format YYYY-MM-DD<br>|||
|**476**|2300.HI04.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BBQ International Classification of Diseases Clinical<br>Modification (ICD-10-PCS) Other Procedure Codes|||||||
|**477**|2300.HI04.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/otherProcedureList/procedureCode|Procedure Code||||
|**478**|2300.HI04.03|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 Date Expressed in Format CCYYMMDD|||||||
|**479**|2300.HI04.04|Date Time Period|Expression of a date, a time, or range of dates, times or dates and times|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/otherProcedureList/procedureDate|Procedure Date|In the format YYYY-MM-DD<br>|||
|**480**|2300.HI05.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BBQ International Classification of Diseases Clinical<br>Modification (ICD-10-PCS) Other Procedure Codes|||||||
|**481**|2300.HI05.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/otherProcedureList/procedureCode|Procedure Code||||
|**482**|2300.HI05.03|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 Date Expressed in Format CCYYMMDD|||||||
|**483**|2300.HI05.04|Date Time Period|Expression of a date, a time, or range of dates, times or dates and times|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/otherProcedureList/procedureDate|Procedure Date|In the format YYYY-MM-DD<br>|||
|**484**|2300.HI06.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BBQ International Classification of Diseases Clinical<br>Modification (ICD-10-PCS) Other Procedure Codes|||||||
|**485**|2300.HI06.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/otherProcedureList/procedureCode|Procedure Code||||
|**486**|2300.HI06.03|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 Date Expressed in Format CCYYMMDD|||||||
|**487**|2300.HI06.04|Date Time Period|Expression of a date, a time, or range of dates, times or dates and times|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/otherProcedureList/procedureDate|Procedure Date|In the format YYYY-MM-DD<br>|||
|**488**|2300.HI07.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BBQ International Classification of Diseases Clinical<br>Modification (ICD-10-PCS) Other Procedure Codes|||||||
|**489**|2300.HI07.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/otherProcedureList/procedureCode|Procedure Code||||
|**490**|2300.HI07.03|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 Date Expressed in Format CCYYMMDD|||||||
|**491**|2300.HI07.04|Date Time Period|Expression of a date, a time, or range of dates, times or dates and times|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/otherProcedureList/procedureDate|Procedure Date|In the format YYYY-MM-DD<br>|||
|**492**|2300.HI08.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BBQ International Classification of Diseases Clinical<br>Modification (ICD-10-PCS) Other Procedure Codes|||||||
|**493**|2300.HI08.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/otherProcedureList/procedureCode|Procedure Code||||
|**494**|2300.HI08.03|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 Date Expressed in Format CCYYMMDD|||||||
|**495**|2300.HI08.04|Date Time Period|Expression of a date, a time, or range of dates, times or dates and times|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/otherProcedureList/procedureDate|Procedure Date|In the format YYYY-MM-DD<br>|||
|**496**|2300.HI09.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BBQ International Classification of Diseases Clinical<br>Modification (ICD-10-PCS) Other Procedure Codes|||||||
|**497**|2300.HI09.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/otherProcedureList/procedureCode|Procedure Code||||
|**498**|2300.HI09.03|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 Date Expressed in Format CCYYMMDD|||||||
|**499**|2300.HI09.04|Date Time Period|Expression of a date, a time, or range of dates, times or dates and times|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/otherProcedureList/procedureDate|Procedure Date|In the format YYYY-MM-DD<br>|||
|**500**|2300.HI10.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BBQ International Classification of Diseases Clinical<br>Modification (ICD-10-PCS) Other Procedure Codes|||||||
|**501**|2300.HI10.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/otherProcedureList/procedureCode|Procedure Code||||
|**502**|2300.HI10.03|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 Date Expressed in Format CCYYMMDD|||||||
|**503**|2300.HI10.04|Date Time Period|Expression of a date, a time, or range of dates, times or dates and times|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/otherProcedureList/procedureDate|Procedure Date|In the format YYYY-MM-DD<br>|||
|**504**|2300.HI11.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BBQ International Classification of Diseases Clinical<br>Modification (ICD-10-PCS) Other Procedure Codes|||||||
|**505**|2300.HI11.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/otherProcedureList/procedureCode|Procedure Code||||
|**506**|2300.HI11.03|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 Date Expressed in Format CCYYMMDD|||||||
|**507**|2300.HI11.04|Date Time Period|Expression of a date, a time, or range of dates, times or dates and times|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/otherProcedureList/procedureDate|Procedure Date|In the format YYYY-MM-DD<br>|||
|**508**|2300.HI12.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BBQ International Classification of Diseases Clinical<br>Modification (ICD-10-PCS) Other Procedure Codes|||||||
|**509**|2300.HI12.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/otherProcedureList/procedureCode|Procedure Code||||
|**510**|2300.HI12.03|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 Date Expressed in Format CCYYMMDD|||||||
|**511**|2300.HI12.04|Date Time Period|Expression of a date, a time, or range of dates, times or dates and times|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/otherProcedureList/procedureDate|Procedure Date|In the format YYYY-MM-DD<br>|||
|**512**|Segment - HI Occurrence Span Information (Situational)|||||||||||
|**513**|2300.HI01.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BI - Occurrence Span|||||||
| **514** | 2300.HI01.02 | Industry Code |  | R |  |  | institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/occurrenceSpans/spanCode | Occurence Span Code (To identify an event related to payment of the claim. These codes
<br>identify occurrences that happened
<br>over a span of time. |  |  |  |
|**515**|2300.HI01.03|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|RD8-Range of Dates Expressed in Format CCYYMMDDCCYYMMDD|||||||
| **516** | 2300.HI01.04 _(rs=2)_ | Date Time Period _(rs=2)_ | Expression of a date, a time, or range of dates, times or dates and times _(rs=2)_ | R _(rs=2)_ |  _(rs=2)_ |  | institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/occurrenceSpans/startDate | Occuence Span Start Date (Dates
<br>that identify an event related to payment of the claim) | In the format YYYY-MM-DD<br> |  |  |
|**517**|⬚|⬚|⬚|⬚|⬚||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/occurrenceSpans/endDate|Occurence Span End Date||||
|**518**|2300.HI02.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BI - Occurrence Span|||||||
|**519**|2300.HI02.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/occurrenceSpans/spanCode|Occurence Span Code||||
|**520**|2300.HI02.03|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|RD8-Range of Dates Expressed in Format CCYYMMDDCCYYMMDD|||||||
|**521**|2300.HI02.04 _(rs=2)_|Date Time Period _(rs=2)_|Expression of a date, a time, or range of dates, times or dates and times _(rs=2)_|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/occurrenceSpans/startDate|Occurence Span Start Date|In the format YYYY-MM-DD<br>|||
|**522**|⬚|⬚|⬚|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/occurrenceSpans/endDate|Occurence Span End Date||||
|**523**|2300.HI03.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BI - Occurrence Span|||||||
|**524**|2300.HI03.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/occurrenceSpans/spanCode|Occurence Span Code||||
|**525**|2300.HI03.03|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|RD8-Range of Dates Expressed in Format CCYYMMDDCCYYMMDD|||||||
|**526**|2300.HI03.04 _(rs=2)_|Date Time Period _(rs=2)_|Expression of a date, a time, or range of dates, times or dates and times _(rs=2)_|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/occurrenceSpans/startDate|Occurence Span Start Date|In the format YYYY-MM-DD<br>|||
|**527**|⬚|⬚|⬚|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/occurrenceSpans/endDate|Occurence Span End Date||||
|**528**|2300.HI04.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BI - Occurrence Span|||||||
|**529**|2300.HI04.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/occurrenceSpans/spanCode|Occurence Span Code||||
|**530**|2300.HI04.03|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|RD8-Range of Dates Expressed in Format CCYYMMDDCCYYMMDD|||||||
|**531**|2300.HI04.04 _(rs=2)_|Date Time Period _(rs=2)_|Expression of a date, a time, or range of dates, times or dates and times _(rs=2)_|R _(rs=2)_|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/occurrenceSpans/startDate|Occurence Span Start Date|In the format YYYY-MM-DD<br>|||
|**532**|⬚|⬚|⬚|⬚|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/occurrenceSpans/endDate|Occurence Span End Date||||
|**533**|2300.HI05.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BI - Occurrence Span|||||||
|**534**|2300.HI05.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/occurrenceSpans/spanCode|Occurence Span Code||||
|**535**|2300.HI05.03|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|RD8-Range of Dates Expressed in Format CCYYMMDDCCYYMMDD|||||||
|**536**|2300.HI05.04 _(rs=2)_|Date Time Period _(rs=2)_|Expression of a date, a time, or range of dates, times or dates and times _(rs=2)_|R _(rs=2)_|_(rs=2)_||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/occurrenceSpans/startDate|Occurence Span Start Date|In the format YYYY-MM-DD<br>|||
|**537**|⬚|⬚|⬚|⬚|⬚||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/occurrenceSpans/endDate|Occurence Span End Date||||
|**538**|2300.HI06.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BI - Occurrence Span|||||||
|**539**|2300.HI06.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/occurrenceSpans/spanCode|Occurence Span Code||||
|**540**|2300.HI06.03|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|RD8-Range of Dates Expressed in Format CCYYMMDDCCYYMMDD|||||||
|**541**|2300.HI06.04 _(rs=2)_|Date Time Period _(rs=2)_|Expression of a date, a time, or range of dates, times or dates and times _(rs=2)_|R _(rs=2)_|_(rs=2)_||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/occurrenceSpans/startDate|Occurence Span Start Date|In the format YYYY-MM-DD<br>|||
|**542**|⬚|⬚|⬚|⬚|⬚||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/occurrenceSpans/endDate|Occurence Span End Date||||
|**543**|2300.HI07.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BI - Occurrence Span|||||||
|**544**|2300.HI07.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/occurrenceSpans/spanCode|Occurence Span Code||||
|**545**|2300.HI07.03|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|RD8-Range of Dates Expressed in Format CCYYMMDDCCYYMMDD|||||||
|**546**|2300.HI07.04 _(rs=2)_|Date Time Period _(rs=2)_|Expression of a date, a time, or range of dates, times or dates and times _(rs=2)_|R _(rs=2)_|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/occurrenceSpans/startDate|Occurence Span Start Date|In the format YYYY-MM-DD<br>|||
|**547**|⬚|⬚|⬚|⬚|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/occurrenceSpans/endDate|Occurence Span End Date||||
|**548**|2300.HI08.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BI - Occurrence Span|||||||
|**549**|2300.HI08.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/occurrenceSpans/spanCode|Occurence Span Code||||
|**550**|2300.HI08.03|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|RD8-Range of Dates Expressed in Format CCYYMMDDCCYYMMDD|||||||
|**551**|2300.HI08.04|Date Time Period|Expression of a date, a time, or range of dates, times or dates and times|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/occurrenceSpans/startDate|Occurence Span Start Date|In the format YYYY-MM-DD<br>|||
|**552**|2300.HI09.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BI - Occurrence Span||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/occurrenceSpans/endDate|Occurence Span End Date||||
|**553**|2300.HI09.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/occurrenceSpans/spanCode|Occurence Span Code||||
|**554**|2300.HI09.03|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|RD8-Range of Dates Expressed in Format CCYYMMDDCCYYMMDD|||||||
|**555**|2300.HI09.04 _(rs=2)_|Date Time Period _(rs=2)_|Expression of a date, a time, or range of dates, times or dates and times _(rs=2)_|R _(rs=2)_|_(rs=2)_||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/occurrenceSpans/startDate|Occurence Span Start Date|In the format YYYY-MM-DD<br>|||
|**556**|⬚|⬚|⬚|⬚|⬚||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/occurrenceSpans/endDate|Occurence Span End Date||||
|**557**|2300.HI10.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BI - Occurrence Span|||||||
|**558**|2300.HI10.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/occurrenceSpans/spanCode|Occurence Span Code||||
|**559**|2300.HI10.03|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|RD8-Range of Dates Expressed in Format CCYYMMDDCCYYMMDD|||||||
|**560**|2300.HI10.04 _(rs=2)_|Date Time Period _(rs=2)_|Expression of a date, a time, or range of dates, times or dates and times _(rs=2)_|R _(rs=2)_|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/occurrenceSpans/startDate|Occurence Span Start Date|In the format YYYY-MM-DD<br>|||
|**561**|⬚|⬚|⬚|⬚|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/occurrenceSpans/endDate|Occurence Span End Date||||
|**562**|2300.HI11.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BI - Occurrence Span|||||||
|**563**|2300.HI11.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/occurrenceSpans/spanCode|Occurence Span Code||||
|**564**|2300.HI11.03|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|RD8-Range of Dates Expressed in Format CCYYMMDDCCYYMMDD||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/occurrenceSpans/endDate|Occurence Span End Date||||
|**565**|2300.HI11.04 _(rs=2)_|Date Time Period _(rs=2)_|Expression of a date, a time, or range of dates, times or dates and times _(rs=2)_|R _(rs=2)_|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/occurrenceSpans/startDate|Occurence Span Start Date|In the format YYYY-MM-DD<br>|||
|**566**|⬚|⬚|⬚|⬚|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/occurrenceSpans/endDate|Occurence Span End Date||||
|**567**|2300.HI12.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BI - Occurrence Span|||||||
|**568**|2300.HI12.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/occurrenceSpans/spanCode|Occurence Span Code||||
|**569**|2300.HI12.03|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|RD8-Range of Dates Expressed in Format CCYYMMDDCCYYMMDD||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/occurrenceSpans/endDate|Occurence Span End Date||||
|**570**|2300.HI12.04 _(rs=2)_|Date Time Period _(rs=2)_|Expression of a date, a time, or range of dates, times or dates and times _(rs=2)_|R _(rs=2)_|_(rs=2)_||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/occurrenceSpans/startDate|Occurence Span Start Date|In the format YYYY-MM-DD<br>|||
|**571**|⬚|⬚|⬚|⬚|⬚||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/occurrenceSpans/endDate|Occurence Span End Date||||
|**572**|Segment - HI Occurrence Information (Situational)|||||||||||
|**573**|2300.HI01.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BH - Occurrence|||||||
|**574**|2300.HI01.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/eventOccurrences/occurrenceCode|Code indicating cause of event occurrence||||
|**575**|2300.HI01.03|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 - Date Expressed in Format CCYYMMDD|||||||
|**576**|2300.HI01.04|Date Time Period|Expression of a date, a time, or range of dates, times or dates and times|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/eventOccurrences/occurrenceDate|Date on which the event occurred|In the format YYYY-MM-DD<br>|||
|**577**|2300.HI02.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BH - Occurrence|||||||
|**578**|2300.HI02.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/eventOccurrences/occurrenceCode|Code indicating cause of event occurrence||||
|**579**|2300.HI02.03|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 - Date Expressed in Format CCYYMMDD|||||||
|**580**|2300.HI02.04|Date Time Period|Expression of a date, a time, or range of dates, times or dates and times|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/eventOccurrences/occurrenceDate|Date on which the event occurred|In the format YYYY-MM-DD<br>|||
|**581**|2300.HI03.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BH - Occurrence|||||||
|**582**|2300.HI03.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/eventOccurrences/occurrenceCode|Code indicating cause of event occurrence||||
|**583**|2300.HI03.03|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 - Date Expressed in Format CCYYMMDD|||||||
|**584**|2300.HI03.04|Date Time Period|Expression of a date, a time, or range of dates, times or dates and times|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/eventOccurrences/occurrenceDate|Date on which the event occurred|In the format YYYY-MM-DD<br>|||
|**585**|2300.HI04.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BH - Occurrence|||||||
|**586**|2300.HI04.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/eventOccurrences/occurrenceCode|Code indicating cause of event occurrence||||
|**587**|2300.HI04.03|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 - Date Expressed in Format CCYYMMDD|||||||
|**588**|2300.HI04.04|Date Time Period|Expression of a date, a time, or range of dates, times or dates and times|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/eventOccurrences/occurrenceDate|Date on which the event occurred|In the format YYYY-MM-DD<br>|||
|**589**|2300.HI05.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BH - Occurrence|||||||
|**590**|2300.HI05.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/eventOccurrences/occurrenceCode|Code indicating cause of event occurrence||||
|**591**|2300.HI05.03|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 - Date Expressed in Format CCYYMMDD|||||||
|**592**|2300.HI05.04|Date Time Period|Expression of a date, a time, or range of dates, times or dates and times|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/eventOccurrences/occurrenceDate|Date on which the event occurred|In the format YYYY-MM-DD<br>|||
|**593**|2300.HI06.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BH - Occurrence|||||||
|**594**|2300.HI06.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/eventOccurrences/occurrenceCode|Code indicating cause of event occurrence||||
|**595**|2300.HI06.03|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 - Date Expressed in Format CCYYMMDD|||||||
|**596**|2300.HI06.04|Date Time Period|Expression of a date, a time, or range of dates, times or dates and times|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/eventOccurrences/occurrenceDate|Date on which the event occurred|In the format YYYY-MM-DD<br>|||
|**597**|2300.HI07.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BH - Occurrence|||||||
|**598**|2300.HI07.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/eventOccurrences/occurrenceCode|Code indicating cause of event occurrence||||
|**599**|2300.HI07.03|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 - Date Expressed in Format CCYYMMDD|||||||
|**600**|2300.HI07.04|Date Time Period|Expression of a date, a time, or range of dates, times or dates and times|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/eventOccurrences/occurrenceDate|Date on which the event occurred|In the format YYYY-MM-DD<br>|||
|**601**|2300.HI08.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BH - Occurrence|||||||
|**602**|2300.HI08.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/eventOccurrences/occurrenceCode|Code indicating cause of event occurrence||||
|**603**|2300.HI08.03|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 - Date Expressed in Format CCYYMMDD|||||||
|**604**|2300.HI08.04|Date Time Period|Expression of a date, a time, or range of dates, times or dates and times|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/eventOccurrences/occurrenceDate|Date on which the event occurred|In the format YYYY-MM-DD<br>|||
|**605**|2300.HI09.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BH - Occurrence|||||||
|**606**|2300.HI09.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/eventOccurrences/occurrenceCode|Code indicating cause of event occurrence||||
|**607**|2300.HI09.03|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 - Date Expressed in Format CCYYMMDD|||||||
|**608**|2300.HI09.04|Date Time Period|Expression of a date, a time, or range of dates, times or dates and times|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/eventOccurrences/occurrenceDate|Date on which the event occurred|In the format YYYY-MM-DD<br>|||
|**609**|2300.HI10.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BH - Occurrence|||||||
|**610**|2300.HI10.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/eventOccurrences/occurrenceCode|Code indicating cause of event occurrence||||
|**611**|2300.HI10.03|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 - Date Expressed in Format CCYYMMDD|||||||
|**612**|2300.HI10.04|Date Time Period|Expression of a date, a time, or range of dates, times or dates and times|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/eventOccurrences/occurrenceDate|Date on which the event occurred|In the format YYYY-MM-DD<br>|||
|**613**|2300.HI11.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BH - Occurrence|||||||
|**614**|2300.HI11.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/eventOccurrences/occurrenceCode|Code indicating cause of event occurrence||||
|**615**|2300.HI11.03|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 - Date Expressed in Format CCYYMMDD|||||||
|**616**|2300.HI11.04|Date Time Period|Expression of a date, a time, or range of dates, times or dates and times|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/eventOccurrences/occurrenceDate|Date on which the event occurred|In the format YYYY-MM-DD<br>|||
|**617**|2300.HI12.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BH - Occurrence|||||||
|**618**|2300.HI12.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/eventOccurrences/occurrenceCode|Code indicating cause of event occurrence||||
|**619**|2300.HI12.03|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 - Date Expressed in Format CCYYMMDD|||||||
|**620**|2300.HI12.04|Date Time Period|Expression of a date, a time, or range of dates, times or dates and times|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/eventOccurrences/occurrenceDate|Date on which the event occurred|In the format YYYY-MM-DD<br>|||
|**621**|Segment - HI Value Information (Situational)|||||||||||
|**622**|2300.HI01.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BE -Value|||||||
|**623**|2300.HI01.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/valueCodes/valueCode|Value code||||
|**624**|2300.HI01.05|Monetary Amount|Monetary Amount|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/valueCodes/valueCodeAmount|Dollar amount associated with the value code||||
|**625**|2300.HI02.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BE -Value|||||||
|**626**|2300.HI02.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/valueCodes/valueCode|Value code||||
|**627**|2300.HI02.05|Monetary Amount|Monetary Amount|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/valueCodes/valueCodeAmount|Dollar amount associated with the value code||||
|**628**|2300.HI03.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BE -Value|||||||
|**629**|2300.HI03.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/valueCodes/valueCode|Value code||||
|**630**|2300.HI03.05|Monetary Amount|Monetary Amount|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/valueCodes/valueCodeAmount|Dollar amount associated with the value code||||
|**631**|2300.HI04.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BE -Value|||||||
|**632**|2300.HI04.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/valueCodes/valueCode|Value code||||
|**633**|2300.HI04.05|Monetary Amount|Monetary Amount|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/valueCodes/valueCodeAmount|Dollar amount associated with the value code||||
|**634**|2300.HI05.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BE -Value|||||||
|**635**|2300.HI05.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/valueCodes/valueCode|Value code||||
|**636**|2300.HI05.05|Monetary Amount|Monetary Amount|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/valueCodes/valueCodeAmount|Dollar amount associated with the value code||||
|**637**|2300.HI06.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BE -Value|||||||
|**638**|2300.HI06.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/valueCodes/valueCode|Value code||||
|**639**|2300.HI06.05|Monetary Amount|Monetary Amount|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/valueCodes/valueCodeAmount|Dollar amount associated with the value code||||
|**640**|2300.HI07.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BE -Value|||||||
|**641**|2300.HI07.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/valueCodes/valueCode|Value code||||
|**642**|2300.HI07.05|Monetary Amount|Monetary Amount|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/valueCodes/valueCodeAmount|Dollar amount associated with the value code||||
|**643**|2300.HI08.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BE -Value|||||||
|**644**|2300.HI08.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/valueCodes/valueCode|Value code||||
|**645**|2300.HI08.05|Monetary Amount|Monetary Amount|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/valueCodes/valueCodeAmount|Dollar amount associated with the value code||||
|**646**|2300.HI09.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BE -Value|||||||
|**647**|2300.HI09.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/valueCodes/valueCode|Value code||||
|**648**|2300.HI09.05|Monetary Amount|Monetary Amount|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/valueCodes/valueCodeAmount|Dollar amount associated with the value code||||
|**649**|2300.HI10.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BE -Value|||||||
|**650**|2300.HI10.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/valueCodes/valueCode|Value code||||
|**651**|2300.HI10.05|Monetary Amount|Monetary Amount|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/valueCodes/valueCodeAmount|Dollar amount associated with the value code|||_(cs=6)_|
|**652**|2300.HI11.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BE -Value|||||||
|**653**|2300.HI11.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/valueCodes/valueCode|Value code||||
|**654**|2300.HI11.05|Monetary Amount|Monetary Amount|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/valueCodes/valueCodeAmount|Dollar amount associated with the value code||||
|**655**|2300.HI12.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BE -Value|||||||
|**656**|2300.HI12.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/valueCodes/valueCode|Value code||||
|**657**|2300.HI12.05|Monetary Amount|Monetary Amount|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/valueCodes/valueCodeAmount|Dollar amount associated with the value code||||
|**658**|Segment - HI Condition Information (Situational)|||||||||||
|**659**|2300.HI01.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BG - Condition|||||||
|**660**|2300.HI01.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/conditionCodes/conditionCode|Condition code value||||
|**661**|2300.HI02.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BG - Condition|||||||
|**662**|2300.HI02.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/conditionCodes/conditionCode|Condition code value||||
|**663**|2300.HI03.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BG - Condition|||||||
|**664**|2300.HI03.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/conditionCodes/conditionCode|Condition code value||||
|**665**|2300.HI04.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BG - Condition|||||||
|**666**|2300.HI04.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/conditionCodes/conditionCode|Condition code value||||
|**667**|2300.HI05.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BG - Condition|||||||
|**668**|2300.HI05.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/conditionCodes/conditionCode|Condition code value||||
|**669**|2300.HI06.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BG - Condition|||||||
|**670**|2300.HI06.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/conditionCodes/conditionCode|Condition code value||||
|**671**|2300.HI07.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BG - Condition|||||||
|**672**|2300.HI07.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/conditionCodes/conditionCode|Condition code value||||
|**673**|2300.HI08.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BG - Condition|||||||
|**674**|2300.HI08.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/conditionCodes/conditionCode|Condition code value||||
|**675**|2300.HI09.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BG - Condition|||||||
|**676**|2300.HI09.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/conditionCodes/conditionCode|Condition code value||||
|**677**|2300.HI10.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BG - Condition|||||||
|**678**|2300.HI10.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/conditionCodes/conditionCode|Condition code value||||
|**679**|2300.HI11.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BG - Condition|||||||
|**680**|2300.HI11.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/conditionCodes/conditionCode|Condition code value||||
|**681**|2300.HI12.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|BG - Condition|||||||
|**682**|2300.HI12.02|Industry Code||R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/conditionCodes/conditionCode|Condition code value||||
|**683**|Segment - HI Treatment Code Information (Situational)|||||||||||
|**684**|2300.HI01.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|TC -Treatment Codes|||||||
|**685**|2300.HI01.02|Industry Code|Diagnosis Code|R||||||||
|**686**|2300.HI02.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|TC -Treatment Codes|||||||
|**687**|2300.HI02.02|Industry Code|Diagnosis Code|R||||||||
|**688**|2300.HI03.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|TC -Treatment Codes|||||||
|**689**|2300.HI03.02|Industry Code|Diagnosis Code|R||||||||
|**690**|2300.HI04.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|TC -Treatment Codes|||||||
|**691**|2300.HI04.02|Industry Code|Diagnosis Code|R||||||||
|**692**|2300.HI05.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|TC -Treatment Codes|||||||
|**693**|2300.HI05.02|Industry Code|Diagnosis Code|R||||||||
|**694**|2300.HI06.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|TC -Treatment Codes|||||||
|**695**|2300.HI06.02|Industry Code|Diagnosis Code|R||||||||
|**696**|2300.HI07.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|TC -Treatment Codes|||||||
|**697**|2300.HI07.02|Industry Code|Diagnosis Code|R||||||||
|**698**|2300.HI08.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|TC -Treatment Codes|||||||
|**699**|2300.HI08.02|Industry Code|Diagnosis Code|R||||||||
|**700**|2300.HI09.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|TC -Treatment Codes|||||||
|**701**|2300.HI09.02|Industry Code|Diagnosis Code|R||||||||
|**702**|2300.HI10.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|TC -Treatment Codes|||||||
|**703**|2300.HI10.02|Industry Code|Diagnosis Code|R||||||||
|**704**|2300.HI11.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|TC -Treatment Codes|||||||
|**705**|2300.HI11.02|Industry Code|Diagnosis Code|R||||||||
|**706**|2300.HI12.01|Code List Qualifier Code|Code identifying a specific industry code list<br>Principal Diagnosis Type Code|R|TC -Treatment Codes|||||||
|**707**|2300.HI12.02|Industry Code|Diagnosis Code|R||||||||
|**708**|Segment - HCP Claim Pricing/Repricing Information (Situational)|||||||||||
|**709**|2300.HCP01|Pricing Methodology|Code specifying pricing methodology at which the claim or line item has been priced or repriced|R|00 Zero Pricing (Not Covered Under Contract)<br>01 Priced as Billed at 100%<br>02 Priced at the Standard Fee Schedule<br>03 Priced at a Contractual Percentage<br>04 Bundled Pricing<br>05 Peer Review Pricing<br>06 Per Diem Pricing<br>07 Flat Rate Pricing<br>08 Combination Pricing<br>09 Maternity Pricing<br>10 Other Pricing<br>11 Lower of Cost<br>12 Ratio of Cost<br>13 Cost Reimbursed<br>14 Adjustment Pricin|||||||
|**710**|2300.HCP02|Monetary Amount|Monetary amount|R||||||||
|**711**|2300.HCP03|Monetary Amount|Monetary amount|S||||||||
|**712**|2300.HCP04|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier|S||||||||
|**713**|2300.HCP05|Rate|Rate|S||||||||
|**714**|2300.HCP06|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier|S||||||||
|**715**|2300.HCP07|Monetary Amount|Monetary Amount|S||||||||
|**716**|2300.HCP08|Product/Service ID|Identifying number for a product or service|S||||||||
|**717**|2300.HCP09|Product/Service ID Qualifier|Code identifying the type/source of the descriptive number used in<br>Product/Service ID (234|S|ER :Jurisdiction Specific Procedure and Supply Codes<br>HC: Health Care Financing Administration Common<br>Procedural Coding System (HCPCS) Codes<br>HP Health Insurance Prospective Payment System<br>(HIPPS) Skilled Nursing Facility Rate Code<br>HP: Health Insurance Prospective Payment System<br>(HIPPS) Skilled Nursing Facility Rate Code<br>IV: Home Infusion EDI Coalition (HIEC) Product/Service<br>Code<br>WK Advanced Billing Concepts (ABC) Codes|||||This segment not availble in COA and careplus .updated the details based on companion  guide. Need to confirm|Need to check in companion guide|
|**718**|2300.HCP11|Unit or Basis for Measurement Code|Code specifying the units in which a value is being expressed, or manner in which<br>a measurement has been taken|S||||||||
|**719**|2300.HCP12|Quantity|Numeric value of quantity|S||||||||
|**720**|2300.HCP13|Reject Reason Code|Code assigned by issuer to identify reason for rejection|S|T1 Cannot Identify Provider as TPO (Third Party<br>Organization) Participant<br>T2 Cannot Identify Payer as TPO (Third Party<br>Organization) Participant<br>T3 Cannot Identify Insured as TPO (Third Party<br>Organization) Participant<br>T4 Payer Name or Identifier Missing<br>T5 Certification Information Missing<br>T6 Claim does not contain enough information for repricing|||||||
|**721**|2300.HCP14|Policy Compliance Code|Code specifying policy compliance|S|1 Procedure Followed (Compliance)<br>2 Not Followed - Call Not Made (Non-Compliance Call<br>Not Made)<br>3 Not Medically Necessary (Non-Compliance NonMedically Necessary)<br>4 Not Followed Other (Non-Compliance Other)<br>5 Emergency Admit to Non-Network Hospital|||||||
|**722**|2300.HCP15|Exception Code|Code specifying the exception reason for consideration of out-of-network health<br>care services|S|1 Non-Network Professional Provider in Network<br>Hospital<br>2 Emergency Care<br>3 Services or Specialist not in Network<br>4 Out-of-Service Area<br>5 State Mandates<br>6 Other|||||||
|**723**|Loop 2310A (Situational) _(cs=10)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚||
|**724**|Segment - NM1 Attending Provider Name (Situational)|||||||||||
|**725**|2310A.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R|71 Attending Physician|||||||
|**726**|2310A.NM102|Entity Type Qualifier|Code identifying an organizational entity, a physical location, property or an<br>individual|R|1 Person|||||||
|**727**|2310A.NM103|Name Last or Organization Name|Individual last name or organizational name|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/attendingPractitioner/practitionerLastName|Last Name of Attending Practitioner||||
|**728**|2310A.NM104|Name First|Individual first name|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/attendingPractitioner/practitionerFirstName|First Name of Attending Practitioner||||
|**729**|2310A.NM105|Name Middle|Individual middle name or initial|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/attendingPractitioner/practitionerMiddleName|||||
|**730**|2310A.NM107|Name Suffix|Suffix to individual name|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalClaim/attendingPractitioner/practitionerSuffixName|||||
|**731**|2310A.NM108|Identification Code Qualifier|Code designating the system/method of code structure used for Identification<br>Code|S|XX Centers for Medicare and Medicaid Services<br>National Provider Identifier|||||||
|**732**|2310A.NM109|Identification Code|Code identifying a party or other code /Rendering Provider Identifier|S|1851470140||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/attendingPractitioner/practitionerNpi|Attending Practitioner's National Provider Id||||
|**733**|Segment - PRV Provider Information (Situational)|||||||||||
|**734**|2310A.PRV01|Provider Code|Code identifying the type of provider|R|AT  : Attending|||||||
|**735**|2310A.PRV02|Reference Identification Qualifier|Code qualifying the Reference Identification|R|PXC :Health Care Provider Taxonomy Code|||||||
|**736**|2310A.PRV03|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier|R|207Q00000X|||||||
|**737**|Segment - REF Attending Provider Secondary Identification (Situational)|||||||||||
|**738**|2310A.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|0B : State License Number<br>1G : Provider UPIN Number<br>1555 UPINs must be formatted as either X99999 or<br>XXX999.<br>G2 : Provider Commercial Number<br>LU: Location Numbe||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/attendingPractitioner/practitionerIdQualifier|Attending provider secondary id type||||
|**739**|2310A.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier|R|0121T3B0B||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/attendingPractitioner/practitionerId|Secondary ID of Attending Practitioner||||
|**740**|Loop 2310B (Situational)|||||||||||
|**741**|Segment - NM1 Operating Physician Name (Situational)|||||||||||
|**742**|2310B.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R|72 - Operating Physician|||||||
|**743**|2310B.NM102|Entity Type Qualifier|Code identifying an organizational entity, a physical location, property or an<br>individual|R|1 - Person|||||||
|**744**|2310B.NM103|Name Last or Organization Name|Individual last name or organizational name|R|Individual last name or organizational name||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/operatingPractitioner/practitionerLastName|Last Name of Operating Practitioner||||
|**745**|2310B.NM104|Name First|Individual first name|S|Individual first name||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/operatingPractitioner/practitionerFirstName|First Name of Operating Practitioner||||
|**746**|2310B.NM105|Name Middle|Individual middle name or initial|S|Individual middle name or initial||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/operatingPractitioner/practitionerMiddleName|||||
|**747**|2310B.NM107|Name Suffix|Suffix to individual name|S|Suffix to individual name||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/operatingPractitioner/practitionerSuffixName|||||
|**748**|2310B.NM108|Identification Code Qualifier|Code designating the system/method of code structure used for Identification<br>Code|S|XX Centers for Medicare and Medicaid Services<br>National Provider Identifier|||||||
|**749**|2310B.NM109|Identification Code|Code identifying a party or other code /Rendering Provider Identifier|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/operatingPractitioner/practitionerNpi|Operating Practitioner's national Provider Id||||
|**750**|Segment - REF Operating Physician Secondary Identification (Situational)|||||||||||
|**751**|2310B.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/operatingPractitioner/practitionerIdQualifier|Operating provider secondary id type||||
|**752**|2310B.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/operatingPractitioner/practitionerId|Secondary of Operating Practitioner||||
|**753**|Loop 2310C (Situational)|||||||||||
|**754**|Segment - NM1 Other Operating Physician Name (Situational)|||||||||||
|**755**|2310C.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R|ZZ : Mutually Defined||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/otherPractitioner/practitionerIdQualifier|||||
|**756**|2310C.NM102|Entity Type Qualifier|Code identifying an organizational entity, a physical location, property or an<br>individual|R|1 :  Person|||||||
|**757**|2310C.NM103|Name Last or Organization Name|Individual last name or organizational name|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/otherPractitioner/practitionerLastName|Last Name of Practitioner||||
|**758**|2310C.NM104|Name First|Individual first name|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/otherPractitioner/practitionerFirstName|First Name of Practitioner||||
|**759**|2310C.NM105|Name Middle|Individual middle name or initial|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/otherPractitioner/practitionerMiddleName|||||
|**760**|2310C.NM107|Name Suffix|Suffix to individual name|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecordinstitutionalClaim/otherPractitioner/practitionerSuffixName|||||
|**761**|2310C.NM108|Identification Code Qualifier|Code designating the system/method of code structure used for Identification<br>Code|S|XX Centers for Medicare and Medicaid Services<br>National Provider Identifier|||||||
|**762**|2310C.NM109|Identification Code|Code identifying a party or other code /Rendering Provider Identifier|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/otherPractitioner/practitionerNpi|Practitioner's National Provider Id||||
|**763**|Segment - REF Other Operating Physician Secondary Identification (Situational)|||||||||||
|**764**|2310C.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|0B : State License Number<br>1G : Provider UPIN Number<br>1555 UPINs must be formatted as either X99999 or<br>XXX999.<br>G2 :Provider Commercial Number<br>1464: This code designates a proprietary provider number<br>for the destination payer identified in the Payer<br>Name loop, Loop ID-2010BB, associated with this<br>claim. This is to be used by all payers including:<br>Medicare, Medicaid, Blue Cross, etc.<br>LU : Location Numbe|||Other provider secondary id type||||
|**765**|2310C.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier|R||||Secondary Id of Practitioner||||
|**766**|Loop 2310D (Situational)|||||||||||
|**767**|Segment - NM1 Rendering Provider Name (Situational)|||||||||||
|**768**|2310D.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R|82 :Rendering Provider|||||||
|**769**|2310D.NM102|Entity Type Qualifier|Code identifying an organizational entity, a physical location, property or an<br>individual|R|1 : Person|||||||
|**770**|2310D.NM103|Name Last or Organization Name|Individual last name or organizational name|R||||||||
|**771**|2310D.NM104|Name First|Individual first name|S||||||||
|**772**|2310D.NM105|Name Middle|Individual middle name or initial|S||||||||
|**773**|2310D.NM107|Name Suffix|Suffix to individual name|S||||||||
|**774**|2310D.NM108|Identification Code Qualifier|Code designating the system/method of code structure used for Identification<br>Code|S|XX Centers for Medicare and Medicaid Services<br>National Provider Identifier|||||||
|**775**|2310D.NM109|Identification Code|Code identifying a party or other code /Rendering Provider Identifier|S||||||||
|**776**|Segment - REF Rendering Provider Secondary Identification (Situational)|||||||||||
|**777**|2310D.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|0B :  State License Number<br>1G :  Provider UPIN Number<br>1555 UPINs must be formatted as either X99999 or<br>XXX999.<br>G2 :  Provider Commercial Number<br>1464 :  This code designates a proprietary provider number<br>for the destination payer identified in the Payer<br>Name loop, Loop ID-2010BB, associated with this<br>claim. This is to be used by all payers including:<br>Medicare, Medicaid, Blue Cross, etc.<br>LU : Location Number|||||||
|**778**|2310D.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier|R||||||||
|**779**|Loop 2310E (Situational)|||||||||||
|**780**|Segment - NM1 Service Facility Location Name (Situational)|||||||||||
|**781**|2310E.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R|77 : Service Location|||||||
|**782**|2310E.NM102|Entity Type Qualifier|Code qualifying the type of entity|R|2 :  Non-Person Entity|||||||
|**783**|2310E.NM103|Name Last or Organization Name|Individual last name or organizational name|R||||||||
|**784**|2310E.NM108|Identification Code Qualifier|Code designating the system/method of code structure used for Identification<br>Code (67)|S|XX Centers for Medicare and Medicaid Services<br>National Provider Identifier|||||||
|**785**|2310E.NM109|Identification Code|Code identifying a party or other code|S||||||||
|**786**|Segment - N3 Service Facility Location Address (Required)|||||||||||
|**787**|2310E.N301|Address Information|Address Information|R||||||||
|**788**|2310E.N302|Address Information|Address Information|S||||||||
|**789**|Segment - N4 Service Facility Location City, State, ZIP Code (Required)|||||||||||
|**790**|2310E.N401|City Name|Free-form text for city name|R||||||||
|**791**|2310E.N402|State or Province Code|Code (Standard State/Province) as defined by appropriate government agency|S||||||||
|**792**|2310E.N403|Postal Code|Code defining international postal zone code excluding punctuation and blanks<br>(zip code for United States)|S||||||||
|**793**|2310E.N404|Country Code|Code identifying the country|S||||||||
|**794**|2310E.N407|Country Subdivision Code|Code identifying the country subdivision|S||||||||
|**795**|Segment - REF Service Facility Location Secondary Identification (Situational)|||||||||||
|**796**|2310E.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|0B : State License Number<br>G2 :  Provider Commercial Number<br>1464 :  This code designates a proprietary provider number<br>for the destination payer identified in the Payer<br>Name loop, Loop ID-2010BB, associated with this<br>claim. This is to be used by all payers including:<br>Medicare, Medicaid, Blue Cross, etc.<br>LU :  Location Number|||||||
|**797**|2310E.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier|R||||||||
|**798**|Loop 2310F (Situational)|||||||||||
|**799**|Segment - NM1 Referring Provider Name (Situational)|||||||||||
|**800**|2310F.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R|DN : Referring Provider||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/otherPractitionerList/otherPractitioner/practitionerIdQualifier|||||
|**801**|2310F.NM102|Entity Type Qualifier|Code qualifying the type of entity|R|1 Person|||||||
|**802**|2310F.NM103|Name Last or Organization Name|Individual last name or organizational name|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/otherPractitionerList/otherPractitioner/practitionerLastName|||||
|**803**|2310F.NM104|Name First|Individual first name|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/otherPractitionerList/otherPractitioner/practitionerFirstName|||||
|**804**|2310F.NM105|Name Middle|Individual middle name or initial|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/otherPractitionerList/otherPractitioner/practitionerMiddleName|||||
|**805**|2310F.NM107|Name Suffix|Suffix to individual name|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecordinstitutionalClaim/otherPractitionerList/otherPractitioner/practitionerSuffixName|||||
|**806**|2310F.NM108|Identification Code Qualifier|Code designating the system/method of code structure used for Identification<br>Code (67)|S|XX Centers for Medicare and Medicaid Services<br>National Provider Identifier|||||||
|**807**|2310F.NM109|Identification Code|Code identifying a party or other code|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/otherPractitionerList/otherPractitioner/practitionerNpi|||||
|**808**|Segment - REF Referring Provider Secondary Identification (Situational)|||||||||||
|**809**|2310F.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R||||||||
|**810**|2310F.REF02|Reference Identification||R||||||||
|**811**|Loop 2320 (Situational)|||||||||||
|**812**|Segment - SBR Other Subscriber Information (Situational)|||||||||||
|**813**|2320.SBR01 _(rs=3)_|Payer Responsibility Sequence Number Code _(rs=3)_|Code identifying the insurance carrier’s level of responsibility for a payment of a<br>claim _(rs=3)_|R _(rs=3)_|A Payer Responsibility Four<br>B Payer Responsibility Five<br>C Payer Responsibility Six<br>D Payer Responsibility Seven<br>E Payer Responsibility Eight<br>F Payer Responsibility Nine<br>G Payer Responsibility Ten<br>H Payer Responsibility Eleven<br>P Primary<br>S Secondary<br>T Tertiary<br>U Unknown _(rs=3)_|_(rs=3)_|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/payerPriorityCode|Indicates whether otherinsurance is primary, secondary, or tertiary.||||
|**814**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/attachmentCodeCode/codeSetName|The name of the code set|AttachmentTypeCode|||
|**815**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/attachmentCodeCode/codeEntry|The code entry|<br>18|Code entry describes thevalue of the payer priority code||
|**816**|2320.SBR02|Individual Relationship Code|Code indicating the relationship between two individuals or entities|R|01 Spouse<br>18 Self<br>19 Child<br>20 Employee<br>21 Unknown<br>39 Organ Donor<br>40 Cadaver Donor<br>53 Life Partner<br>G8 Other Relationship|18||||||
|**817**|2320.SBR03|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier/Insured Group or Policy Number|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/eobGroupNumber|Group number indicated on the EOB|populate this field only once as ‘Y’ when the claim has at least one 2320 loop|||
|**818**|2320.SBR04|Name|Free-form name|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/eobGroupName|Group name indicated on the EOB||||
|**819**|2320.SBR09|Claim Filing Indicator Code|Code identifying type of claim|S|MA Medicare Part A<br>MB Medicare Part B<br>MC Medicaid<br>OF Other Federal Program||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/claimFilingIndicator|Type of the other insurance||||
|**820**|||||||institutionalClaimSubmitRequestRecord/institutionalClaim/insuranceInformation/subscriberInformation/claimFilingIndicator||Mapping 2320.SBR 09 in the second instance of insurance information|||
|**821**|Segment - CAS Claim Level Adjustments (Situational)|||||||||||
|**822**|2320.CAS01|Claim Adjustment Group Code|Code identifying the general category of payment adjustment|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/casCodes/casCode/groupCode|Group Code||||
|**823**|2320.CAS02|Claim Adjustment Reason Code|Code identifying the detailed reason the adjustment was made|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/casCodes/casCode/casCode|CAS Code||||
|**824**|2320.CAS03 _(rs=8)_|Monetary Amount _(rs=8)_|Monetary Amount _(rs=8)_|R _(rs=8)_|_(rs=8)_|_(rs=8)_|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/deductibleAmount|Deductible Amount|When CAS01='PR' and CAS02='1'|||
|**825**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/coInsuranceAmount|CoInsurance Amount|When CAS01='PR' and CAS02='2'|||
|**826**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/copayAmount|Copay amount|When CAS01='PR' and CAS02='3'|||
|**827**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/memberPenalty|Member Penalty|When CAS01='PR' and CAS02=225/237/B4|||
|**828**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/providerPenalty|Provider Penalty|When CAS01='CO' and CAS02=225/237/B4|||
|**829**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/discountAmount|Discount  Amount|When CAS01='CO' and CAS02='45'|||
|**830**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/taxAmount|Tax Amount|When CAS01='CO' and CAS02='105'|||
|**831**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/casCodes/casCode/amount|Amount||||
|**832**|2320.CAS04|Quantity|Numeric value of quantity|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/casCodes/casCode/quantity|Quantity||||
|**833**|2320.CAS05|Claim Adjustment Reason Code|Code identifying the detailed reason the adjustment was made|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/casCodes/casCode/casCode|CAS Code||||
|**834**|2320.CAS06 _(rs=8)_|Monetary Amount _(rs=8)_|Monetary Amount _(rs=8)_|S _(rs=8)_|_(rs=8)_|_(rs=8)_|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/deductibleAmount|Deductible Amount|When CAS01='PR' and CAS05='1'|||
|**835**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/coInsuranceAmount|CoInsurance Amount|When CAS01='PR' and CAS05='2'|||
|**836**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/copayAmount|Copay amount|When CAS01='PR' and CAS05='3'|||
|**837**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/memberPenalty|Member Penalty|When CAS01='PR' and CAS05=225/237/B4|||
|**838**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/providerPenalty|Provider Penalty|When CAS01='CO' and CAS05=225/237/B4|||
|**839**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/discountAmount|Discount  Amount|When CAS01='CO' and CAS05='45'|||
|**840**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/taxAmount|Tax Amount|When CAS01='CO' and CAS05='105'|||
|**841**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/casCodes/casCode/amount|Amount||||
|**842**|2320.CAS07|Quantity|Numeric value of quantity|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/casCodes/casCode/quantity|Quantity||||
|**843**|2320.CAS08|Claim Adjustment Reason Code|Code identifying the detailed reason the adjustment was made|S|CO Contractual Obligations<br>CR Correction and Reversals<br>OA Other adjustments<br>PI Payor Initiated Reductions<br>PR Patient Responsibility||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/casCodes/casCode/casCode|CAS Code||||
|**844**|2320.CAS09 _(rs=8)_|Monetary Amount _(rs=8)_|Monetary Amount _(rs=8)_|S _(rs=8)_|_(rs=8)_|_(rs=8)_|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/deductibleAmount|Deductible Amount|When CAS01='PR' and CAS08='1'|||
|**845**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/coInsuranceAmount|CoInsurance Amount|When CAS01='PR' and CAS08='2'|||
|**846**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/copayAmount|Copay amount|When CAS01='PR' and CAS08='3'|||
|**847**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/memberPenalty|Member Penalty|When CAS01='PR' and CAS08=225/237/B4|||
|**848**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/providerPenalty|Provider Penalty|When CAS01='CO' and CAS08=225/237/B4|||
|**849**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/discountAmount|Discount  Amount|When CAS01='CO' and CAS08='45'|||
|**850**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/taxAmount|Tax Amount|When CAS01='CO' and CAS08='105'|||
|**851**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/casCodes/casCode/amount|Amount||||
|**852**|2320.CAS10|Quantity|Numeric value of quantity|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/casCodes/casCode/quantity|Quantity||||
|**853**|2320.CAS11|Claim Adjustment Reason Code|Code identifying the detailed reason the adjustment was made|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/casCodes/casCode/casCode|CAS Code||||
|**854**|2320.CAS12 _(rs=8)_|Monetary Amount _(rs=8)_|Monetary Amount _(rs=8)_|S _(rs=8)_|_(rs=8)_|_(rs=8)_|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/deductibleAmount|Deductible Amount|When CAS01='PR' and CAS11='1'|||
|**855**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/coInsuranceAmount|CoInsurance Amount|When CAS01='PR' and CAS11='2'|||
|**856**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/copayAmount|Copay amount|When CAS01='PR' and CAS11='3'|||
|**857**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/memberPenalty|Member Penalty|When CAS01='PR' and CAS11=225/237/B4|||
|**858**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/providerPenalty|Provider Penalty|When CAS01='CO' and CAS11=225/237/B4|||
|**859**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/discountAmount|Discount  Amount|When CAS01='CO' and CAS11='45'|||
|**860**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/taxAmount|Tax Amount|When CAS01='CO' and CAS11='105'|||
|**861**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/casCodes/casCode/amount|Amount||||
|**862**|2320.CAS13|Quantity|Numeric value of quantity|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/casCodes/casCode/quantity|Quantity||||
|**863**|2320.CAS14|Claim Adjustment Reason Code|Code identifying the detailed reason the adjustment was made|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/casCodes/casCode/casCode|CAS Code||||
|**864**|2320.CAS15 _(rs=8)_|Monetary Amount _(rs=8)_|Monetary Amount _(rs=8)_|S _(rs=8)_|_(rs=8)_|_(rs=8)_|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/deductibleAmount|Deductible Amount|When CAS01='PR' and CAS14='1'|||
|**865**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/coInsuranceAmount|CoInsurance Amount|When CAS01='PR' and CAS14='2'|||
|**866**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/copayAmount|Copay amount|When CAS01='PR' and CAS14='3'|||
|**867**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/memberPenalty|Member Penalty|When CAS01='PR' and CAS14=225/237/B4|||
|**868**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/providerPenalty|Provider Penalty|When CAS01='CO' and CAS14=225/237/B4|||
|**869**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/discountAmount|Discount  Amount|When CAS01='CO' and CAS14='45'|||
|**870**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/taxAmount|Tax Amount|When CAS01='CO' and CAS14='105'|||
|**871**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/casCodes/casCode/amount|Amount||||
|**872**|2320.CAS16|Quantity|Numeric value of quantity|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/casCodes/casCode/quantity|Quantity||||
|**873**|2320.CAS17|Claim Adjustment Reason Code|Code identifying the detailed reason the adjustment was made|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/casCodes/casCode/casCode|CAS Code||||
|**874**|2320.CAS18 _(rs=8)_|Monetary Amount _(rs=8)_|Monetary Amount _(rs=8)_|S _(rs=8)_|_(rs=8)_|_(rs=8)_|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/deductibleAmount|Deductible Amount|When CAS01='PR' and CAS17='1'|||
|**875**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/coInsuranceAmount|CoInsurance Amount|When CAS01='PR' and CAS17='2'|||
|**876**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/copayAmount|Copay amount|When CAS01='PR' and CAS17='3'|||
|**877**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/memberPenalty|Member Penalty|When CAS01='PR' and CAS17=225/237/B4|||
|**878**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/providerPenalty|Provider Penalty|When CAS01='CO' and CAS17=225/237/B4|||
|**879**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/discountAmount|Discount  Amount|When CAS01='CO' and CAS17='45'|||
|**880**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/taxAmount|Tax Amount|When CAS01='CO' and CAS17='105'|||
|**881**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/casCodes/casCode/amount|Amount||||
|**882**|2320.CAS19|Quantity|Numeric value of quantity|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/casCodes/casCode/quantity|Quantity||||
|**883**|Segment - AMT Coordination of Benefits (COB) Payer Paid Amount (Situational)|||||||||||
|**884**|2320.AMT01|Amount Qualifier Code|Code to qualify amount|R|D : Payor Amount Paid|||||||
|**885**|2320.AMT02|Monetary Amount|Monetary amount|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/netPaidAmount|Net paid amount||||
|**886**|2320.AMT02|Monetary Amount|Monetary amount||||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/allowedAmount||Sum netpaid amount and CAS*PR amounts for the payer in header 2320 loop and map to this field<br><br>Two digit after decimal only allowed|Updated mapping as per careplus||
|**887**|Segment - AMT Remaining Patient Liability (Situational)|||||||||||
|**888**|2320.AMT01|Amount Qualifier Code|Code to qualify amount|R|EAF Amount Owed|||||||
|**889**|2320.AMT02|Monetary Amount|Monetary amount|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/memberResponsibilityAmount|Member Responsibility Amount||||
|**890**|Segment - AMT Coordination of Benefits (COB) Total Non-covered Amount (Situational)|||||||||||
|**891**|2320.AMT01|Amount Qualifier Code|Code to qualify amount|R|A8 : Noncovered Charges - Actual|||||||
|**892**|2320.AMT02 _(rs=2)_|Monetary Amount _(rs=2)_|Monetary amount _(rs=2)_|R _(rs=2)_|_(rs=2)_|_(rs=2)_|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/nonCoveredAmount|Non Covered amount||All 2320.CAS03 / 2320.CAS06 /2320.CAS09 /2320.CAS12/2320.CAS15/2320.CAS18  Amounts for all CAS01-CAS02/05/08/11/14/17 combinations which are not explicitly mentioned in 2320.CAS segment mapping will also get added to  /institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/nonCoveredAmount||
|**893**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/nonCoveredTotals|Non Covered Totals|Sum COB amounts for the payer in header 2320 loop and map to this field|||
|**894**|Segment - OI Other Insurance Coverage Information (Required)|||||||||||
|**895**|2320.OI03|Yes/No Condition or Response Code|Code indicating a Yes or No condition or response|R|N : No<br>W : Not Applicable<br>1563 Use code ‘W’ when the patient refuses to assign<br>benefits.<br>Y :  Yes|||||||
|**896**|2320.OI06|Release of Information Code|Code indicating whether the provider has on file a signed statement by the patient authorizing the release of medical data to other organizations|R|I  : Informed Consent to Release Medical Information<br>for Conditions or Diagnoses Regulated by Federal<br>Statutes<br>488 Required when the provider has not collected a<br>signature AND state or federal laws do not require a<br>signature be collected.<br>Y : Yes, Provider has a Signed Statement Permitting<br>Release of Medical Billing Data Related to a Claim<br>489 Required when the provider has collected a<br>signature.<br>OR<br>Required when state or federal laws require a<br>signature be collected.|||||||
|**897**|Segment - MIA Inpatient Adjudication Information (Situational)|||||||||||
|**898**|2320.MIA01|Quantity|Numeric value of quantity|R||||||||
|**899**|2320.MIA03|Quantity|Numeric value of quantity|S||||||||
|**900**|2320.MIA04|Monetary Amount|Monetary Amount|S||||||||
|**901**|2320.MIA05|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier|S||||||||
|**902**|2320.MIA06|Monetary Amount|Monetary Amount|S||||||||
|**903**|2320.MIA07|Monetary Amount|Monetary Amount|S||||||||
|**904**|2320.MIA08|Monetary Amount|Monetary Amount|S||||||||
|**905**|2320.MIA09|Monetary Amount|Monetary Amount|S||||||||
|**906**|2320.MIA10|Monetary Amount|Monetary Amount|S||||||||
|**907**|2320.MIA11|Monetary Amount|Monetary Amount|S||||||||
|**908**|2320.MIA12|Monetary Amount|Monetary Amount|S||||||||
|**909**|2320.MIA13|Monetary Amount|Monetary Amount|S||||||||
|**910**|2320.MIA14|Monetary Amount|Monetary Amount|S||||||||
|**911**|2320.MIA15|Quantity|Numeric value of quantity|S||||||||
|**912**|2320.MIA16|Monetary Amount|Monetary Amount|S||||||||
|**913**|2320.MIA17|Monetary Amount|Monetary Amount|S||||||||
|**914**|2320.MIA18|Monetary Amount|Monetary Amount|S||||||||
|**915**|2320.MIA19|Monetary Amount|Monetary Amount|S||||||||
|**916**|2320.MIA20|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier|S||||||||
|**917**|2320.MIA21|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier|S||||||||
|**918**|2320.MIA22|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier|S||||||||
|**919**|2320.MIA23|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier|S||||||||
|**920**|2320.MIA24|Monetary Amount|Monetary Amount|S||||||||
|**921**|Segment - MOA Outpatient Adjudication Information (Situational)|||||||||||
|**922**|2320.MOA01|Percentage as Decimal|Percentage expressed as a decimal (e.g., 0.0 through 1.0 represents 0% through<br>100%)|S||||||||
|**923**|2320.MOA02|Monetary Amount|Monetary Amount|S||||||||
|**924**|2320.MOA03|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier|S||||||||
|**925**|2320.MOA04|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier|S||||||||
|**926**|2320.MOA05|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier|S||||||||
|**927**|2320.MOA06|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier|S||||||||
|**928**|2320.MOA07|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier|S||||||||
|**929**|2320.MOA08|Monetary Amount|Monetary Amount|S||||||||
|**930**|2320.MOA09|Monetary Amount|Monetary Amount|S||||||||
|**931**|Loop 2330A(Situational)|||||||||||
|**932**|Segment - NM1 Other Subscriber Name (Required)|||||||||||
|**933**|2330A.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R|IL : Insured or Subscriber|||||||
|**934**|2330A.NM102|Entity Type Qualifier|Code qualifying the type of entity|R|1 : Person<br>2 : Non-Person Entity|||||||
|**935**|2330A.NM103|Name Last or Organization Name|Individual last name or organizational name|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/eobSubscriberLastName|Subscriber's Last Name||||
|**936**|2330A.NM104|Name First|Individual first name|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/eobSubscriberFirstName|Subscriber's First Name||||
|**937**|2330A.NM105|Name Middle|Individual middle name or initial|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/eobSubscriberMiddleName|Subscriber's Middle Name||||
|**938**|2330A.NM107|Name Suffix|Suffix to individual name|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/eobSubscriberNameSuffix|Subscriber name suffix||||
|**939**|2330A.NM108|Identification Code Qualifier|Code designating the system/method of code structure used for Identification<br>Code (|R|PI  : Payor Identification|||||||
|**940**|2330A.NM109|Identification Code|Code identifying a party or other code|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/OtherInsuredID|||||
|**941**|Segment - N3 Other Subscriber Address (Situational)|||||||||||
|**942**|2330A.N301|Address Information|Address Information|R||||||||
|**943**|2330A.N302|Address Information|Address Information|S||||||||
|**944**|Segment - N4 Other Subscriber City/State/ZIP Code (Situational)|||||||||||
|**945**|2330A.N401|City Name|Free-form text for city name|R||||||||
|**946**|2330A.N402|State or Province Code|Code (Standard State/Province) as defined by appropriate government agency|S||||||||
|**947**|2330A.N403|Postal Code|Code defining international postal zone code excluding punctuation and blanks<br>(zip code for United States)|S||||||||
|**948**||||||||||||
|**949**|2330A.N404|Country Code|Code identifying the country|S||||||||
|**950**|2330A.N407|Country Subdivision Code|Code identifying the country subdivision|S||||||||
|**951**|Segment - REF Other Subscriber Secondary Information (Situational)|||||||||||
|**952**|2330A.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R||||||||
|**953**|2330A.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier|R||||||||
|**954**|Loop 2330B(Situational)|||||||||||
|**955**|Segment - NM1 Other Payer Name (Required)|||||||||||
|**956**|2330B.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R|PR: Payer|||||||
|**957**|2330B.NM102|Entity Type Qualifier|Code qualifying the type of entity|R|2 :  Non-Person Entity|||||||
|**958**|2330B.NM103|Name Last or Organization Name|Individual last name or organizational name|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/eobHccInformation/companyName|Insurance company name||||
|**959**|2330B.NM108|Identification Code Qualifier|Code designating the system/method of code structure used for Identification<br>Code|R||||||||
|**960**|2330B.NM109|Identification Code|Code identifying a party or other code|R|||institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/planName|||||
|**961**|Segment - N3 Other Payer Address (Situational)|||||||||||
|**962**|2330B.N301|Address Information|Address Information|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/eobHccInformation/address/postalAddress/address|Address first line||||
|**963**|2330B.N302|Address Information|Address Information|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/eobHccInformation/address/postalAddress/address2|Address second line||||
|**964**|Segment - N4 Other Payer City/State/ZIP Code (Situational)|||||||||||
|**965**|2330B.N401|City Name|Free-form text for city name|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/eobHccInformation/address/postalAddress/cityName|City Name||||
|**966**|2330B.N402|State or Province Code|Code (Standard State/Province) as defined by appropriate government agency|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/eobHccInformation/address/postalAddress/stateCode|State Code||||
|**967**|2330B.N403 _(rs=2)_|Postal Code _(rs=2)_|Code defining international postal zone code excluding punctuation and blanks<br>(zip code for United States) _(rs=2)_|S _(rs=2)_|_(rs=2)_|_(rs=2)_|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/eobHccInformation/address/postalAddress/zipCode|Zip Code|1-5 digits|||
|**968**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/eobHccInformation/address/postalAddress/zipExtensionCode|Zip Code Extension|6-9 digits|||
|**969**|2330B.N404|Country Code|Code identifying the country|S||US|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/eobHccInformation/address/postalAddress/countryCode/countryCode|Country Code|Map "US" if no value present|If country code not present we need to update "US"||
|**970**|2330B.N407|Country Subdivision Code|Code identifying the country subdivision|S||||||||
|**971**|Segment - DTP Claim Check or Remittance Date (Situational)|||||||||||
|**972**|2330B.DTP01|Date/Time Qualifier|Code specifying type of date or time, or both date and time|R|573 : Date Claim Paid|||||||
|**973**|2330B.DTP02|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8 :Date Expressed in Format CCYYMMDD|||||||
|**974**|2330B.DTP03|Date Time Period|Expression of a date, a time, or range of dates, times or dates and times|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/eobDate|User-entered date on which the EOB was generated||||
|**975**|Segment - REF Other Payer Secondary Identifier (Situational)|||||||||||
|**976**|2330B.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|2U: Payer Identification Number<br>EI: Employer’s Identification Number<br><br>FY: Claim Office Number<br>NF: National Association of Insurance Commissioners<br>(NAIC) Code|||||||
|**977**|2330B.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier|R|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier|||||||
|**978**|Segment - REF Other Payer Prior Authorization Number (Situational)|||||||||||
|**979**|2330B.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|G1: Prior Authorization Number|||||||
|**980**|2330B.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier|R||||||||
|**981**|Segment - REF Other Payer Referral Number (Situational)|||||||||||
|**982**|2330B.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|9F : Referral Number|||||||
|**983**|2330B.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier|R||||||||
|**984**|Segment - REF Other Payer Claim Adjustment Indicator (Situational)|||||||||||
|**985**|2330B.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|T4 : Signal Code|||||||
|**986**|2330B.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier|R||||||||
|**987**|Segment - REF Other Payer Claim Control Number (Situational)|||||||||||
|**988**|2330B.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|F8 : Original Reference Number|||||||
|**989**|2330B.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/eobClaimID|||||
|**990**|Loop 2330C (Situational)|||||||||||
|**991**|Segment - NM1 Other Payer Attending Provider (Situational)|||||||||||
|**992**|2330C.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R|71 : Attending Physician|||||||
|**993**|2330C.NM102|Entity Type Qualifier|Code qualifying the type of entity|R|1 :Person|||||||
|**994**|Segment - REF Other Payer Attending Provider Secondary Identification (Required)|||||||||||
|**995**|2330C.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|0B :State License Number<br>1G: Provider UPIN Number<br>1555 <br>G2 :Provider Commercial Number<br>LU Location Number|||||||
|**996**|2330C.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier|R||||||||
|**997**|Loop 2330D (Situational)|||||||||||
|**998**|Segment - NM1 Other Payer Operating Physician (Situational)|||||||||||
|**999**|2330D.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R||||||||
|**1000**|2330D.NM102|Entity Type Qualifier|Code qualifying the type of entity|R||||||||
|**1001**|Segment - REF Other Payer Operating Physician Secondary Identification (Required)|||||||||||
|**1002**|2330D.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R||||||||
|**1003**|2330D.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier|R||||||||
|**1004**|Loop 2330E (Situational)|||||||||||
|**1005**|Segment - NM1 Other Payer Other Operating Physician (Situational)|||||||||||
|**1006**|2330E.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R||||||||
|**1007**|2330E.NM102|Entity Type Qualifier|Code qualifying the type of entity|R||||||||
|**1008**|Segment - REF Other Payer Other Operating Physician Secondary Identification (Required)|||||||||||
|**1009**|2330E.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R||||||||
|**1010**|2330E.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier|R||||||||
|**1011**|Loop 2330F (Situational)|||||||||||
|**1012**|Segment - NM1 Other Payer Service Facility Location (Situational)|||||||||||
|**1013**|2330F.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R||||||||
|**1014**|2330F.NM102|Entity Type Qualifier|Code qualifying the type of entity|R||||||||
|**1015**|Segment - REF Other Payer Service Facility Location Identification (Required)|||||||||||
|**1016**|2330F.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R||||||||
|**1017**|2330F.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier|R||||||||
|**1018**|Loop 2330G (Situational)|||||||||||
|**1019**|Segment - NM1 Other Payer Rendering Provider Name (Situational)|||||||||||
|**1020**|2330G.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R||||||||
|**1021**|2330G.NM102|Entity Type Qualifier|Code qualifying the type of entity|R||||||||
|**1022**|Segment - REF Other Payer Rendering Provider Secondary Identification (Required)|||||||||||
|**1023**|2330G.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R||||||||
|**1024**|2330G.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier|R||||||||
|**1025**|Loop - 2330H (Situational)|||||||||||
|**1026**|Segment - NM1 Other Payer Referring Provider (Situational)|||||||||||
|**1027**|2330H.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R||||||||
|**1028**|2330H.NM102|Entity Type Qualifier|Code qualifying the type of entity|R||||||||
|**1029**|Segment - REF Other Payer Referring Provider Secondary Identification (Required)|||||||||||
|**1030**|2330H.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R||||||||
|**1031**|2330H.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier|R||||||||
|**1032**|Loop - 2330I (Situational)|||||||||||
|**1033**|Segment - NM1 Other Payer Billing Provider (Situational)|||||||||||
|**1034**|2330I.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R||||||||
|**1035**|2330I.NM102|Entity Type Qualifier|Code qualifying the type of entity|R||||||||
|**1036**|Segment - REF Other Payer Billing Provider Secondary Identification (Required)|||||||||||
|**1037**|2330I.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R||||||||
|**1038**|2330I.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier|R||||||||
|**1039**|Loop 2400 (Required)|||||||||||
|**1040**|Segment - LX Service Line Number (Required)|||||||||||
|**1041**|2400.LX01 _(rs=2)_|Assigned Number _(rs=2)_|Number assigned for differentiation within a transaction set _(rs=2)_|R _(rs=2)_|1 _(rs=2)_|_(rs=2)_|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/originalLineNumber|Original claim line number||||
|**1042**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/hccClaimLineNumber|Claim line number||||
|**1043**|Segment - SV2 Institutional Service Line (Required)|||||||||||
|**1044**|2400.SV201|Product/Service ID|Identifying number for a product or service|R|0900||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/revenueCode|Revenue Code||||
|**1045**|2400.SV202|COMPOSITE MEDICAL PROCEDURE<br>IDENTIFIER|To identify a medical procedure by its standardized codes and applicable<br>modifiers|S||||||||
|**1046**|2400.SV202.01|Product/Service ID Qualifier|Code identifying the type/source of the descriptive number used in<br>Product/Service ID|R|HC :Health Insurance Prospective Payment System<br>(HIPPS) Skilled Nursing Facility Rate Code|||||||
|**1047**|2400.SV202.02|Product/Service ID|Identifying number for a product or service|R|H0023||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/serviceCode|Service Code associated with the claim line||||
|**1048**|2400.SV202.03|Procedure Modifier|This identifies special circumstances related to the performance of the<br>service, as defined by trading partners|S|HE||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/institutionalClaimServiceModifier/modifierCode|Modifier Code||||
|**1049**|2400.SV202.04|Procedure Modifier|This identifies special circumstances related to the performance of the<br>service, as defined by trading partners|S|HT||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/institutionalClaimServiceModifier/modifierCode|Modifier Code||||
|**1050**|2400.SV202.05|Procedure Modifier|This identifies special circumstances related to the performance of the<br>service, as defined by trading partners|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/institutionalClaimServiceModifier/modifierCode|Modifier Code||||
|**1051**|2400.SV202.06|Procedure Modifier|This identifies special circumstances related to the performance of the<br>service, as defined by trading partners|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/institutionalClaimServiceModifier/modifierCode|Modifier Code||||
|**1052**|2400.SV202.07|Description|A free-form description to clarify the related data elements and their<br>content|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/serviceDescription|||PSD#1640||
|**1053**|2400.SV203 _(rs=3)_|Monetary Amount _(rs=3)_|Monetary Amount _(rs=3)_|R _(rs=3)_|200 _(rs=3)_|_(rs=3)_|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/billedAmount|Billed amount||||
|**1054**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/totalChargeAmount|Total charged amount||||
|**1055**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/billedAmount|Billed amount||||
|**1056**|2400.SV204|Unit or Basis for Measurement Code|Code specifying the units in which a value is being expressed, or manner in which<br>a measurement has been taken|R|DA : Days<br>UN : Unit|||||||
|**1057**|2400.SV205|Quantity|Numeric value of quantity|R|1||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/serviceUnitCount|Identifies the type of unit|if decimal point is zero, display as whole number otherwise use fraction|||
|**1058**|2400.SV207|Monetary Amount|Monetary Amount|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/nonCoveredCharges|Amount of charges not covered||||
|**1059**|Segment - PWK Line Supplemental Information (Situational)|||||||||||
|**1060**|2400.PWK01|Report Type Code|Code indicating the title or contents of a document, report or supporting item|R|03 Report Justifying Treatment Beyond Utilization<br>Guidelines<br>04 Drugs Administered<br>05 Treatment Diagnosis<br>06 Initial Assessment<br>07 Functional Goals<br>08 Plan of Treatment<br>09 Progress Report<br>10 Continued Treatment<br>11 Chemical Analysis<br>13 Certified Test Report<br>15 Justification for Admission<br>21 Recovery Plan<br>A3 Allergies/Sensitivities Document<br>A4 Autopsy Report<br>AM Ambulance Certification<br>AS Admission Summary<br>B2 Prescription<br>B3 Physician Order<br>B4 Referral Form<br>BR Benchmark Testing Results<br>BS Baseline<br>BT Blanket Test Results<br>CB Chiropractic Justification<br>CK Consent Form(s)<br>CT Certification<br>D2 Drug Profile Document<br>DA Dental Models<br>DB Durable Medical Equipment Prescription<br>DG Diagnostic Report<br>DJ Discharge Monitoring Report<br>DS Discharge Summary<br>EB Explanation of Benefits (Coordination of Benefits or<br>Medicare Secondary Payor)<br>HC Health Certificate<br>HR Health Clinic Records<br>I5 Immunization Record|||||||
|**1061**|2400.PWK02|Report Transmission Code|Code defining timing, transmission method or format by which reports are to be<br>sent|R|AA Available on Request at Provider Site<br>179 This means that the additional information is not<br>being sent with the claim at this time. Instead, it is<br>available to the payer (or appropriate entity) at their<br>request.<br>BM By Mail<br>EL Electronically Only<br>180 Indicates that the attachment is being transmitted in<br>a separate X12 functional group.<br>EM E-Mail<br>FT File Transfer<br>FX: By FAX|||||||
|**1062**|2400.PWK05|Identification Code Qualifier|Code designating the system/method of code structure used for Identification<br>Code|S|AC Attachment Control Number|||||||
|**1063**|2400.PWK06|Identification Code|Code identifying a party or other code|S||||||||
|**1064**|Segment - DTP Date - Service Date (Situational)|||||||||||
|**1065**|2400.DTP01|Date/Time Qualifier|Code specifying type of date or time, or both date and time|R|472 Service|||||||
|**1066**|2400.DTP02|Date Time Period Format Qualifier|Date Time Period Format Qualifier|R|D8 :Date Expressed in Format CCYYMMDD<br>RD8 :Range of Dates Expressed in Format CCYYMMDDCCYYMMDD|||||No logic there for COA and Careplus||
|**1067**|2400.DTP03 _(rs=2)_|Date Time Period _(rs=2)_|Expression of a date, a time, or range of dates, times or dates and times _(rs=2)_|R _(rs=2)_|Expression of a date, a time, or range of dates, times or dates and times _(rs=2)_|_(rs=2)_|for end date|||||
|**1068**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/serviceDate|Date on which the service occurred||||
|**1069**|Segment - REF Line Item Control Number (Situational)|||||||||||
|**1070**|2400.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R||||||||
|**1071**|2400.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier|R||||||Whether it will be require tobacktrace or encouter||
|**1072**|Segment - REF Repriced Line Item Reference Number (Situational)|||||||||||
|**1073**|2400.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R||||||||
|**1074**|2400.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier|R||||||||
|**1075**|Segment - REF Adjusted Repriced Line Item Reference Number (Situational)|||||||||||
|**1076**|2400.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R||||||||
|**1077**|2400.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier|R||||||||
|**1078**|Segment - AMT Service Tax Amount (Situational)|||||||||||
|**1079**|2400.AMT01|Amount Qualifier Code|Code to qualify amount|R|GT Goods and Services Tax|||||||
|**1080**|2400.AMT02|Monetary Amount|Monetary Amount|R||||Tax Amount||||
|**1081**|Segment - AMT Facility Tax Amount (Situational)|||||||||||
|**1082**|2400.AMT01|Amount Qualifier Code|Code to qualify amount|R|N8 Miscellaneous Taxes|||||||
|**1083**|2400.AMT02 _(rs=2)_|Monetary Amount _(rs=2)_|Monetary Amount _(rs=2)_|R _(rs=2)_|_(rs=2)_|_(rs=2)_||Tax Amount||||
|**1084**|⬚|⬚|⬚|⬚|⬚|⬚||||||
|**1085**|Segment - NTE Third Party Organization Notes (Situational)|||||||||||
|**1086**|2400.NTE01|Note Reference Code|Code identifying the functional area or purpose for which the note applies|R|TPO Third Party Organization Notes||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/lineItemRemark/remarkCode|||||
|**1087**|2400.NTE02|Description|A free-form description to clarify the related data elements and their content|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/lineItemRemark/remark|Remarks added for Service line||||
|**1088**|Segment - HCP Line Pricing/Repricing Information (Situational)|||||||||||
|**1089**|2400.HCP01|Pricing Methodology|Code specifying pricing methodology at which the claim or line item has been<br>priced or repriced|R|00 Zero Pricing (Not Covered Under Contract)<br>01 Priced as Billed at 100%<br>02 Priced at the Standard Fee Schedule<br>03 Priced at a Contractual Percentage<br>04 Bundled Pricing<br>05 Peer Review Pricing<br>06 Per Diem Pricing<br>07 Flat Rate Pricing<br>08 Combination Pricing<br>09 Maternity Pricing<br>10 Other Pricing<br>11 Lower of Cost<br>12 Ratio of Cost<br>13 Cost Reimbursed<br>14 Adjustment Pricing|||||||
|**1090**|2400.HCP02|Monetary Amount|Monetary Amount|R||||Amount allowed by the repricer||||
|**1091**|2400.HCP03|Monetary Amount|Monetary Amount|S||||||||
|**1092**|2400.HCP04|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier|S||||ID of the repricing source||||
|**1093**|2400.HCP05|Rate|Rate expressed in the standard monetary denomination for the currency specified|S||||||||
|**1094**|2400.HCP06|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier|S||||||||
|**1095**|2400.HCP07|Monetary Amount|Monetary Amount|S||||||||
|**1096**|2400.HCP08|Product/Service ID|Identifying number for a product or service|S||||||||
|**1097**|2400.HCP09|Product/Service ID Qualifier|Code identifying the type/source of the descriptive number used in<br>Product/Service ID|S||||||||
|**1098**|2400.HCP10|Product/Service ID|Identifying number for a product or service|S||||||||
|**1099**|2400.HCP11|Unit or Basis for Measurement Code|Code specifying the units in which a value is being expressed, or manner in which<br>a measurement has been taken|S|DA Days<br>UN Unit|||||||
|**1100**|2400.HCP12|Quantity|Numeric value of quantity|S||||||||
|**1101**|2400.HCP13|Reject Reason Code|Code assigned by issuer to identify reason for rejection|S|T1 Cannot Identify Provider as TPO (Third Party<br>Organization) Participant<br>T2 Cannot Identify Payer as TPO (Third Party<br>Organization) Participant<br>T3 Cannot Identify Insured as TPO (Third Party<br>Organization) Participant<br>T4 Payer Name or Identifier Missing<br>T5 Certification Information Missing<br>T6 Claim does not contain enough information for repricing|||||||
|**1102**|2400.HCP14|Policy Compliance Code|Code specifying policy compliance|S|1 Procedure Followed (Compliance)<br>2 Not Followed - Call Not Made (Non-Compliance Call<br>Not Made)<br>3 Not Medically Necessary (Non-Compliance NonMedically Necessary)<br>4 Not Followed Other (Non-Compliance Other)<br>5 Emergency Admit to Non-Network Hospital|||||||
|**1103**|2400.HCP15|Exception Code|Code specifying the exception reason for consideration of out-of-network health<br>care services|S|1 Non-Network Professional Provider in Network<br>Hospital<br>2 Emergency Care<br>3 Services or Specialist not in Network<br>4 Out-of-Service Area<br>5 State Mandates<br>6 Other|||||||
|**1104**|Loop 2410 - Drug identification|||||||||||
|**1105**|Segment - LIN Drug identification (Situational)|||||||||||
|**1106**|2410.LIN02|Product/Service ID Qualifier|Code identifying the type/source of the descriptive number used in<br>Product/Service ID|R|N4 National Drug Code in 5-4-2 Format||institutionalClaim/institutionalServiceLineItem/serviceLine/institutionalNdcCodes/qualifier|Map N4 as 'ND'|Map N4 as 'ND'|Mapping updated as per careplus<br>need to check the x walk/configuration team<br>||
|**1107**|2410.LIN03|Product/Service ID|Identifying number for a product or service|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/institutionalNdcCodes/ndcCode|NationalDrugCodereference.||||
|**1108**|Segment - CTP Drug Quantity (Required)|||||||||||
|**1109**|2410.CTP04|Quantity|Numeric value of quantity|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/institutionalNdcCodes/quantity|Quantity; maximum of 8 digits.||||
|**1110**|2410.CTP05-1|COMPOSITE UNIT OF MEASURE-Unit or Basis for Measurement Code|To identify a composite unit of measure|R|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/institutionalNdcCodes/measurementType|Identifies the unit of measurement,such as ML (milliliter),OU (ounce),etc.||||
|**1111**|Segment - REF Prescription or compound drug association Number (Situational)|||||||||||
|**1112**|2410.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|VY Link Sequence Number<br>XZ Pharmacy Prescription Number|||||||
|**1113**|2410.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier|R||||||||
|**1114**|Loop 2420A (Situational)|||||||||||
|**1115**|Segment - NM1 Operating Physician Name (Situational)|||||||||||
|**1116**|2420A.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R|72 Operating Physician|||||||
|**1117**|2420A.NM102|Entity Type Qualifier|Code qualifying the type of entity|R|1 Person|||||||
|**1118**|2420A.NM103|Name Last or Organization Name|Individual last name or organizational name|R||||||||
|**1119**|2420A.NM104|Name First|Individual first name|S||||||||
|**1120**|2420A.NM105|Name Middle|Individual middle name or initial|S||||||||
|**1121**|2420A.NM107|Name Suffix|Suffix to individual name|S||||||||
|**1122**|2420A.NM108|Identification Code Qualifier|Code designating the system/method of code structure used for Identification<br>Code|S|XX Centers for Medicare and Medicaid Services<br>National Provider Identifier|||||||
|**1123**|2420A.NM109|Identification Code|Code identifying a party or other code|S||||||||
|**1124**|Segment - REF Operating Physician Secondary Identification (Situational)|||||||||||
|**1125**|2420A.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|0B State License Number<br>1G Provider UPIN Number<br>G2 Provider Commercial Number<br>LU Location Number|||||||
|**1126**|2420A.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier|R||||||||
|**1127**|2420A.REF04.01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|2U Payer Identification Number|||||||
|**1128**|2420A.REF04.02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier|R||||||||
|**1129**|Loop 2420B (Situational)|||||||||||
|**1130**|Segment - NM1 Other Operating Physician Name (Situational)|||||||||||
|**1131**|2420B.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R|ZZ Mutually Defined|||||||
|**1132**|2420B.NM102|Entity Type Qualifier|Code qualifying the type of entity|R|1 Person|||||||
|**1133**|2420B.NM103|Name Last or Organization Name|Individual last name or organizational name|R||||||||
|**1134**|2420B.NM104|Name First|Individual first name|S||||||||
|**1135**|2420B.NM105|Name Middle|Individual middle name or initial|S||||||||
|**1136**|2420B.NM107|Name Suffix|Suffix to individual name|S||||||||
|**1137**|2420B.NM108|Identification Code Qualifier||S|XX Centers for Medicare and Medicaid Services National Provider Identifier|||||||
|**1138**|2420B.NM109|Identification Code|Code identifying a party or other code|S||||||||
|**1139**|Segment - REF Other Operating Physician Secondary Identification (Situational)|||||||||||
|**1140**|2420B.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|0B State License Number<br>1G Provider UPIN Number<br>G2 Provider Commercial Number<br>LU Location Number|||||||
|**1141**|2420B.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier|R||||||||
|**1142**|2420B.REF04.01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|2U Payer Identification Number|||||||
|**1143**|2420B.REF04.02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier|R||||||||
|**1144**|Loop 2420C (Situational)|||||||||||
|**1145**|Segment - NM1 Rendering Provider Name (Situational)|||||||||||
|**1146**|2420C.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R|82 Rendering Provider|||||||
|**1147**|2420C.NM102|Entity Type Qualifier|Code qualifying the type of entity|R|1 Person|||||||
|**1148**|2420C.NM103|Name Last or Organization Name|Individual last name or organizational name|R||||||||
|**1149**|2420C.NM104|Name First|Individual first name|S||||||||
|**1150**|2420C.NM105|Name Middle|Individual middle name or initial|S||||||||
|**1151**|2420C.NM107|Name Suffix|Suffix to individual name|S||||||||
|**1152**|2420C.NM108|Identification Code Qualifier||S|XX Centers for Medicare and Medicaid Services<br>National Provider Identifier|||||||
|**1153**|2420C.NM109|Identification Code|Code identifying a party or other code|S||||||||
|**1154**|Segment - REF Rendering Provider Secondary Identification (Situational)|||||||||||
|**1155**|2420C.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|0B State License Number<br>1G Provider UPIN Number<br>G2 Provider Commercial Number<br>LU Location Number|||||||
|**1156**|2420C.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier|R||||||||
|**1157**|2420C.REF04.01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|2U Payer Identification Number|||||||
|**1158**|2420C.REF04.02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier|R||||||||
|**1159**|Loop 2420D (Situational)|||||||||||
|**1160**|Segment - NM1 Referring Provider Name (Situational)|||||||||||
|**1161**|2420D.NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|R|DN Referring Provider|||||||
|**1162**|2420D.NM102|Entity Type Qualifier|Code qualifying the type of entity|R|1 Person|||||||
|**1163**|2420D.NM103|Name Last or Organization Name|Individual last name or organizational name|R||||||||
|**1164**|2420D.NM104|Name First|Individual first name|S||||||||
|**1165**|2420D.NM105|Name Middle|Individual middle name or initial|S||||||||
|**1166**|2420D.NM107|Name Suffix|Suffix to individual name|S||||||||
|**1167**|2420D.NM108|Identification Code Qualifier||S|XX Centers for Medicare and Medicaid Services<br>National Provider Identifier|||||||
|**1168**|2420D.NM109|Identification Code|Code identifying a party or other code|S||||||||
|**1169**|Segment - REF Referring Provider Secondary Identification (Situational)|||||||||||
|**1170**|2420D.REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|0B State License Number<br>1G Provider UPIN Number<br>G2 Provider Commercial Number<br>LU Location Number|||||||
|**1171**|2420D.REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier|S||||||||
|**1172**|2420D.REF04.01|Reference Identification Qualifier|Code qualifying the Reference Identification|R|2U Payer Identification Number|||||||
|**1173**|2420D.REF04.02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier|R||||||||
|**1174**|Loop 2430   — LINE ADJUDICATION INFORMATION(Situational) Loop Repeat: 15<br><br>1. Service line cob mapping under - /invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation will happen based upon the matching of 2430.SVD01 against the 2330B.NM109.<br><br>2. The below header/sub tag mapping will have sum of all the different payer amounts for each of the service line.<br>/serviceLineItem/eobPaymentInformation<br> _(cs=5)_|⬚|⬚|⬚|⬚|||||||
|**1175**|Segment - SVD Line Adjudication Information (Situational)|||||||||||
|**1176**|2430.SVD01|Identification Code|Code identifying a party or other code|R||||||||
|**1177**|2430.SVD02 _(rs=4)_|Monetary Amount _(rs=4)_|Monetary Amount _(rs=4)_|R _(rs=4)_|_(rs=4)_|_(rs=4)_|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/netPaidAmount|Net paid amount||||
|**1178**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/netPaidAmount|Net paid amount||Mapped when the value exists and Other Subsciber loop(SBR01) exists in 2320 and SVD01 is present.||
|**1179**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord{/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/allowedAmount|Sum netpaid amount and CAS*PR amounts for the payer in line level - 2430 loop and map to this field|Two digits after decimal will be allowed|||
|**1180**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/allowedAmount|Sum netpaid amount and CAS*PR amounts of all payers in line level (all 2430 loops) and map to this field|Two digits after decimal will be allowed|||
|**1181**|2430.SVD03.01|Product/Service ID Qualifier|Code identifying the type/source of the descriptive number used in<br>Product/Service ID|R||||||||
|**1182**|2430.SVD03.02|Product/Service ID|Identifying number for a product or service|R||||||||
|**1183**|2430.SVD03.03|Procedure Modifier|This identifies special circumstances related to the performance of the<br>service, as defined by trading partners|S||||||||
|**1184**|2430.SVD03.04|Procedure Modifier|This identifies special circumstances related to the performance of the<br>service, as defined by trading partners|S||||||||
|**1185**|2430.SVD03.05|Procedure Modifier|This identifies special circumstances related to the performance of the<br>service, as defined by trading partners|S||||||||
|**1186**|2430.SVD03.06|Procedure Modifier|This identifies special circumstances related to the performance of the<br>service, as defined by trading partners|S||||||||
|**1187**|2430.SVD03.07|Description|A free-form description to clarify the related data elements and their<br>content|S||||||||
|**1188**|2430.SVD04|Product/Service ID|Identifying number for a product or service|R||||||||
|**1189**|2430.SVD05|Quantity|Numeric value of quantity|R||||||||
|**1190**|2430.SVD06|Assigned Number|Number assigned for differentiation within a transaction set|S||||||||
|**1191**|Segment - CAS Line Adjustment (Situational)|||||||||||
|**1192**|2430.CAS01 _(rs=2)_|Claim Adjustment Group Code _(rs=2)_|_(rs=2)_|R _(rs=2)_|_(rs=2)_|_(rs=2)_|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/lineCasCodes/casCode/groupCode|Group code||||
|**1193**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/lineEobCasCodes/casCode/groupCode|Group code||||
|**1194**|2430.CAS02 _(rs=2)_|Claim Adjustment Reason Code _(rs=2)_|_(rs=2)_|R _(rs=2)_|_(rs=2)_|_(rs=2)_|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/lineCasCodes/casCode/casCode|CAS code||||
|**1195**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/lineEobCasCodes/casCode/casCode|CAS code||||
|**1196**|2430.CAS03 _(rs=18)_|Monetary Amount _(rs=18)_|Monetary Amount _(rs=18)_|R _(rs=18)_|_(rs=18)_|_(rs=18)_|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/deductibleAmount|Deductible amount|When CAS01='PR' and CAS02='1'|||
|**1197**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/coInsuranceAmount|Coinsurance amount.|When CAS01='PR' and CAS02='2'|||
|**1198**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/copayAmount|Copay amount|When CAS01='PR' and CAS02='3'|||
|**1199**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/memberPenalty|Member penalty|When CAS01='PR' and CAS02=225/237/B4|||
|**1200**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/providerPenalty|Provider penalty.|When CAS01='CO' and CAS02=225/237/B4|||
|**1201**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/nonCoveredAmount|Non-covered amount.|When CAS01='CO' and CAS02='96/185'<br><br>Please refer comments|Map 2430.CAS03 / 2430.CAS06 /2430.CAS09 /2430.CAS12/2430.CAS15/2430.CAS18   for all 2430.CAS01-2430.CAS02/05/08/11/14/17 combinations which are not explicitly mentioned in 2430.CAS segment mapping.||
|**1202**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/discountAmount|Discount amount|When CAS01='CO' and CAS02='45'|||
|**1203**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/lineCasCodes/casCode/amount|Amount||||
|**1204**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/Tax amount|Tax amount|When CAS01='CO' and CAS02='105'|||
|**1205**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/deductibleAmount|Deductible amount.|When CAS01='PR' and CAS02='1'|||
|**1206**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/coInsuranceAmount|Coinsurance amount.|When CAS01='PR' and CAS02='2'|||
|**1207**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/copayAmount|Copay amount|When CAS01='PR' and CAS02='3'|||
|**1208**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/memberPenalty|Member penalty|When CAS01='PR' and CAS02=225/237/B4|||
|**1209**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/providerPenalty|Provider penalty.|When CAS01='CO' and CAS02=225/237/B4|||
|**1210**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/nonCoveredAmount|Non-covered amount.|When CAS01='CO' and CAS02='96/185'<br><br>Please refer comments|Map 2430.CAS03 / 2430.CAS06 /2430.CAS09 /2430.CAS12/2430.CAS15/2430.CAS18   for all 2430.CAS01-2430.CAS02/05/08/11/14/17 combinations which are not explicitly mentioned in 2430.CAS segment mapping.||
|**1211**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/discountAmount|Discount amount|When CAS01='CO' and CAS02='45'|||
|**1212**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/taxAmount|Tax amount|When CAS01='CO' and CAS02='105'|||
|**1213**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/lineEobCasCodes/casCode/amount|Amount||||
|**1214**|2430.CAS04|Quantity|Numeric value of quantity|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/lineCasCodes/casCode/quantity|Quantity||||
|**1215**|2430.CAS05 _(rs=2)_|Claim Adjustment Reason Code _(rs=2)_|Code identifying the detailed reason the adjustment was made _(rs=2)_|S _(rs=2)_|_(rs=2)_|_(rs=2)_|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/lineCasCodes/casCode/casCode|CAS code identifier||||
|**1216**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/lineEobCasCodes/casCode/casCode|CAS code identifier||||
|**1217**|2430.CAS06 _(rs=18)_|Monetary Amount _(rs=18)_|Monetary Amount _(rs=18)_|S _(rs=18)_|_(rs=18)_|_(rs=18)_|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/deductibleAmount|Deductible amount|When CAS01='PR' and CAS05='1'|||
|**1218**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/coInsuranceAmount|Coinsurance amount.|When CAS01='PR' and CAS05='2'|||
|**1219**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/copayAmount|Copay amount|When CAS01='PR' and CAS05='3'|||
|**1220**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/memberPenalty|Member penalty|When CAS01='PR' and CAS05=225/237/B4|||
|**1221**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/providerPenalty|Provider penalty.|When CAS01='CO' and CAS05=225/237/B4|||
|**1222**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/nonCoveredAmount|Non-covered amount.|When CAS01='CO' and CAS05='96/185'<br><br>Please refer comments|Map 2430.CAS03 / 2430.CAS06 /2430.CAS09 /2430.CAS12/2430.CAS15/2430.CAS18   for all 2430.CAS01-2430.CAS02/05/08/11/14/17 combinations which are not explicitly mentioned in 2430.CAS segment mapping.||
|**1223**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/discountAmount|Discount amount|When CAS01='CO' and CAS05='45'|||
|**1224**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/lineCasCodes/casCode/amount|Amount||||
|**1225**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/Taxamount|Tax amount|When CAS01='CO' and CAS05='105'|||
|**1226**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/deductibleAmount|Deductible amount|When CAS01='PR' and CAS05='1'|||
|**1227**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/coInsuranceAmount|Coinsurance amount.|When CAS01='PR' and CAS05='2'|||
|**1228**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/copayAmount|Copay amount|When CAS01='PR' and CAS05='3'|||
|**1229**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/memberPenalty|Member penalty|When CAS01='PR' and CAS05=225/237/B4|||
|**1230**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/providerPenalty|Provider penalty.|When CAS01='CO' and CAS05=225/237/B4|||
|**1231**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/nonCoveredAmount|Non-covered amount.|When CAS01='CO' and CAS05='96/185'<br><br>Please refer comments|Map 2430.CAS03 / 2430.CAS06 /2430.CAS09 /2430.CAS12/2430.CAS15/2430.CAS18   for all 2430.CAS01-2430.CAS02/05/08/11/14/17 combinations which are not explicitly mentioned in 2430.CAS segment mapping.||
|**1232**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/discountAmount|Discount amount|When CAS01='CO' and CAS05='45'|||
|**1233**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/taxAmount|Tax amount|When CAS01='CO' and CAS05='105'|||
|**1234**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/lineEobCasCodes/casCode/amount|Amount||||
|**1235**|2430.CAS07|Quantity|Numeric value of quantity|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/lineCasCodes/casCode/quantity|Quantity;maximumof8digits.||||
|**1236**|2430.CAS08 _(rs=2)_|Claim Adjustment Reason Code _(rs=2)_|Code identifying the detailed reason the adjustment was made _(rs=2)_|S _(rs=2)_|_(rs=2)_|_(rs=2)_|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/lineCasCodes/casCode/casCode|CAS code identifier||||
|**1237**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/lineEobCasCodes/casCode/casCode|CAS code identifier||||
|**1238**|2430.CAS09 _(rs=18)_|Monetary Amount _(rs=18)_|Monetary Amount _(rs=18)_|S _(rs=18)_|_(rs=18)_|_(rs=18)_|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/deductibleAmount|Deductible amount|When CAS01='PR' and CAS08='1'|||
|**1239**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/coInsuranceAmount|Coinsurance amount.|When CAS01='PR' and CAS08='2'|||
|**1240**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/copayAmount|Copay amount|When CAS01='PR' and CAS08='3'|||
|**1241**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/memberPenalty|Member penalty|When CAS01='PR' and CAS08=225/237/B4|||
|**1242**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/providerPenalty|Provider penalty.|When CAS01='CO' and CAS08=225/237/B4|||
|**1243**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/nonCoveredAmount|Non-covered amount.|When CAS01='CO' and CAS08='96/185'|||
|**1244**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/discountAmount|Discount amount|When CAS01='CO' and CAS08='45'|||
|**1245**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/lineCasCodes/casCode/amount|Amount||||
|**1246**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/taxamount|Tax amount|When CAS01='CO' and CAS08='105'|||
|**1247**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/deductibleAmount|Deductible amount|When CAS01='PR' and CAS08='1'|||
|**1248**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/coInsuranceAmount|Coinsurance amount.|When CAS01='PR' and CAS08='2'|||
|**1249**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/copayAmount|Copay amount|When CAS01='PR' and CAS08='3'|||
|**1250**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/memberPenalty|Member penalty|When CAS01='PR' and CAS08=225/237/B4|||
|**1251**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/providerPenalty|Provider penalty.|When CAS01='CO' and CAS08=225/237/B4|||
|**1252**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/nonCoveredAmount|Non-covered amount.|When CAS01='CO' and CAS08='96/185'|||
|**1253**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/discountAmount|Discount amount|When CAS01='CO' and CAS08='45'|||
|**1254**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/taxAmount|Tax amount|When CAS01='CO' and CAS08='105'|||
|**1255**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/lineEobCasCodes/casCode/amount|Amount||||
|**1256**|2430.CAS10|Quantity|Numeric value of quantity|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/lineCasCodes/casCode/quantity|Quantity; maximum of 8 digits.||||
|**1257**|2430.CAS11 _(rs=2)_|Claim Adjustment Reason Code _(rs=2)_|Code identifying the detailed reason the adjustment was made _(rs=2)_|S _(rs=2)_|_(rs=2)_|_(rs=2)_|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/lineCasCodes/casCode/casCode|CAS code identifier||||
|**1258**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/lineEobCasCodes/casCode/casCode|CAS code identifier||||
|**1259**|2430.CAS12 _(rs=18)_|Monetary Amount _(rs=18)_|Monetary Amount _(rs=18)_|S _(rs=18)_|_(rs=18)_|_(rs=18)_|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/deductibleAmount|Deductible amount|When CAS01='PR' and CAS11='1'|||
|**1260**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/coInsuranceAmount|Coinsurance amount.|When CAS01='PR' and CAS11='2'|||
|**1261**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/copayAmount|Copay amount|When CAS01='PR' and CAS11='3'|||
|**1262**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/memberPenalty|Member penalty|When CAS01='PR' and CAS11=225/237/B4|||
|**1263**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/providerPenalty|Provider penalty.|When CAS01='CO' and CAS11=225/237/B4|||
|**1264**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/nonCoveredAmount|Non-covered amount.|When CAS01='CO' and CAS11='96/185'|||
|**1265**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/discountAmount|Discount amount|When CAS01='CO' and CAS11='45'|||
|**1266**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/lineCasCodes/casCode/amount|Amount||||
|**1267**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/taxamount|Tax amount|When CAS01='CO' and CAS11='105'|||
|**1268**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/deductibleAmount|Deductible amount|When CAS01='PR' and CAS11='1'|||
|**1269**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/coInsuranceAmount|Coinsurance amount.|When CAS01='PR' and CAS11='2'|||
|**1270**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/copayAmount|Copay amount|When CAS01='PR' and CAS11='3'|||
|**1271**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/memberPenalty|Member penalty|When CAS01='PR' and CAS11=225/237/B4|||
|**1272**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/providerPenalty|Provider penalty.|When CAS01='CO' and CAS11=225/237/B4|||
|**1273**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/nonCoveredAmount|Non-covered amount.|When CAS01='CO' and CAS11='96/185'|||
|**1274**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/discountAmount|Discount amount|When CAS01='CO' and CAS11='45'|||
|**1275**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/taxAmount|Tax amount|When CAS01='CO' and CAS11='105'|||
|**1276**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/lineEobCasCodes/casCode/amount|Amount||||
|**1277**|2430.CAS13|Quantity|Numeric value of quantity|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/lineCasCodes/casCode/quantity|Quantity; maximum of 8 digits.||||
|**1278**|2430.CAS14 _(rs=2)_|Claim Adjustment Reason Code _(rs=2)_|Code identifying the detailed reason the adjustment was made _(rs=2)_|S _(rs=2)_|_(rs=2)_|_(rs=2)_|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/lineCasCodes/casCode/casCode|CAS code identifier||||
|**1279**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/lineEobCasCodes/casCode/casCode|CAS code identifier||||
|**1280**|2430.CAS15 _(rs=18)_|Monetary Amount _(rs=18)_|Monetary Amount _(rs=18)_|S _(rs=18)_|_(rs=18)_|_(rs=18)_|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/deductibleAmount|Deductible amount|When CAS01='PR' and CAS14='1'|||
|**1281**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/coInsuranceAmount|Coinsurance amount.|When CAS01='PR' and CAS14='2'|||
|**1282**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/copayAmount|Copay amount|When CAS01='PR' and CAS14='3'|||
|**1283**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/memberPenalty|Member penalty|When CAS01='PR' and CAS14=225/237/B4|||
|**1284**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/providerPenalty|Provider penalty.|When CAS01='CO' and CAS14=225/237/B4|||
|**1285**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/nonCoveredAmount|Non-covered amount.|When CAS01='CO' and CAS14='96/185'|||
|**1286**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/discountAmount|Discount amount|When CAS01='CO' and CAS14='45'|||
|**1287**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/lineCasCodes/casCode/amount|Amount||||
|**1288**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/taxamount|Tax amount|When CAS01='CO' and CAS14='105'|||
|**1289**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/deductibleAmount|Deductible amount|When CAS01='PR' and CAS14='1'|||
|**1290**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/coInsuranceAmount|Coinsurance amount.|When CAS01='PR' and CAS14='2'|||
|**1291**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/copayAmount|Copay amount|When CAS01='PR' and CAS14='3'|||
|**1292**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/memberPenalty|Member penalty|When CAS01='PR' and CAS14=225/237/B4|||
|**1293**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/providerPenalty|Provider penalty.|When CAS01='CO' and CAS14=225/237/B4|||
|**1294**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/nonCoveredAmount|Non-covered amount.|When CAS01='CO' and CAS14='96/185'|||
|**1295**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/discountAmount|Discount amount|When CAS01='CO' and CAS14='45'|||
|**1296**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/taxAmount|Tax amount|When CAS01='CO' and CAS14='105'|||
|**1297**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/lineEobCasCodes/casCode/amount|Amount||||
|**1298**|2430.CAS16|Quantity|Numeric value of quantity|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/lineCasCodes/casCode/quantity|Quantity; maximum of 8 digits.||||
|**1299**|2430.CAS17 _(rs=2)_|Claim Adjustment Reason Code _(rs=2)_|Code identifying the detailed reason the adjustment was made _(rs=2)_|S _(rs=2)_|_(rs=2)_|_(rs=2)_|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/lineCasCodes/casCode/casCode|CAS code identifier||||
|**1300**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/lineEobCasCodes/casCode/casCode|CAS code identifier||||
|**1301**|2430.CAS18 _(rs=18)_|Monetary Amount _(rs=18)_|Monetary Amount _(rs=18)_|S _(rs=18)_|_(rs=18)_|_(rs=18)_|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/deductibleAmount|Deductible amount|When CAS01='PR' and CAS17='1'|||
|**1302**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/coInsuranceAmount|Coinsurance amount.|When CAS01='PR' and CAS17='2'|||
|**1303**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/copayAmount|Copay amount|When CAS01='PR' and CAS17='3'|||
|**1304**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/memberPenalty|Member penalty|When CAS01='PR' and CAS17=225/237/B4|||
|**1305**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/providerPenalty|Provider penalty.|When CAS01='CO' and CAS17=225/237/B4|||
|**1306**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/nonCoveredAmount|Non-covered amount.|When CAS01='CO' and CAS17='96/185'|||
|**1307**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/discountAmount|Discount amount|When CAS01='CO' and CAS17='45'|||
|**1308**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/lineCasCodes/casCode/amount|Amount||||
|**1309**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/Taxamount|Tax amount|When CAS01='CO' and CAS17='105'|||
|**1310**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/deductibleAmount|Deductible amount|When CAS01='PR' and CAS17='1'|||
|**1311**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/coInsuranceAmount|Coinsurance amount.|When CAS01='PR' and CAS17='2'|||
|**1312**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/copayAmount|Copay amount|When CAS01='PR' and CAS17='3'|||
|**1313**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/memberPenalty|Member penalty|When CAS01='PR' and CAS17=225/237/B4|||
|**1314**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/providerPenalty|Provider penalty.|When CAS01='CO' and CAS17=225/237/B4|||
|**1315**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/nonCoveredAmount|Non-covered amount.|When CAS01='CO' and CAS17='96/185'|||
|**1316**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/discountAmount|Discount amount|When CAS01='CO' and CAS17='45'|||
|**1317**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/taxAmount|Tax amount|When CAS01='CO' and CAS17='105'|||
|**1318**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/lineEobCasCodes/casCode/amount|Amount||||
|**1319**|2430.CAS19|Quantity|Numeric value of quantity|S|||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/lineCasCodes/casCode/quantity|Quantity; maximum of 8 digits.||||
|**1320**|Segment - DTP Line Check or Remittance Date (Required)|||||||||||
|**1321**|2430.DTP01|Date/Time Qualifier|Code specifying type of date or time, or both date and time|R|573||||In the format YYYY-MM-DD<br>|||
|**1322**|2430.DTP02|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|R|D8|||||||
|**1323**|2430.DTP03|Date Time Period|||||institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/eobDate|User-entered date on which the EOB was generated||||
|**1324**|Segment - AMT Remaining Patient Liability (Situational)|||||||||||
|**1325**|2430.AMT01|Amount Qualifier Code|Code to qualify amount|R|EAF|||||||
|**1326**|2430.AMT02 _(rs=2)_|Monetary Amount _(rs=2)_|Monetary Amount _(rs=2)_|R _(rs=2)_|_(rs=2)_|_(rs=2)_|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/memberResponsibilityAmount|Total amount for which the member is responsible for this service.||||
|**1327**|⬚|⬚|⬚|⬚|⬚|⬚|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/memberResponsibilityAmount|Total amount for which the member is responsible for this service.||||
|**1328**|Segment SE (Required)|||||||||||
|**1329**|SE Transaction Set Trailer (Required)|||||||||||
|**1330**|SE01|Number of Included Segments|Total number of segments included in a transaction set including ST and SE<br>segments|R|Count Of ST|||||||
|**1331**|SE02|Transaction Set Control Number|Unique Sequential Number Assigned by Internal Processes for each Transaction Set. Starts from 001 and increments with each transaction set <br>|R|ST02 Value|||||||
|**1332**|Segment GE (Required)|||||||||||
|**1333**|GE Functional Group Trailer (Required)|||||||||||
|**1334**|GE01|Number of Transaction Sets Included|Total number of transaction sets included in the functional group or interchange<br>(transmission) group terminated by the trailer containing this data element|R|Count Of GS|||||||
|**1335**|GE02|Group Control Number|Assigned number originated and maintained by the sender|R|GS06 Value|||||||
|**1336**|Segment IEA (Required)|||||||||||
|**1337**|IEA Interchange Control Trailer (Required)|||||||||||
|**1338**|IEA01|Number of Included Functional Groups|A count of the number of functional groups included in an interchange|R|Count Of ISA|||||||
|**1339**|IEA02|Interchange Control Number|A control number assigned by the interchange sender.  It must be identical to ISA13|R||ISA13 Value - 319003402||||||
---
<a id="sheet-837i-mapping-default-value"></a>
## Sheet: 837I Mapping (Default Value)
|#|A|B|C|
|---|---|---|---|
|**1**|XSD Element|Element Description|Default Value|
|**2**|institutionalClaimIBRequestRoot/header/inputFilename|Inbound EDI File Name|Input Filename of the EDI file received with filename extension|
|**3**|institutionalClaimIBRequestRoot/header/inputId|EDI file id|{UID}- Unique for each file <br>Example - -dtBkcCHu9bkKu8O|
|**4**|institutionalClaimIBRequestRoot/header/totalClaimCount|Total number of claims|Total Number of claims in the Inbound EDI 837P file|
|**5**||||
|**6**|institutionalClaimIBRequestRoot/header/inputType|Defines the type of input file - API or File|Hardcode as "FILE"|
|**7**|institutionalClaimIBRequestRoot/header/XMLfileCreationDate|<br>File created date in format YYYY-MM-DD HH:mm:ss:sss   - This is used for internal reference. Not loaded to HRP UI|Processing date/time in the format: <br>yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS|
|**8**|professionalClaimIBRequestRoot/header/correlationId<br>|Unique string or alphanumeric value identifying each file.|A Unique Record Identifier|
|**9**|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/entryDate|<br><br>Date on which the claim was first<br>entered into HealthRules. - in HRP UI it is auto populated to claim load date/time|Processing date/time in the format: YYYY-MM-DDTHH:mm:ss|
|**10**|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/creationDate|creation Date - Could not find this field in HRP UI.|Mapped from BHT04, formatted to YYYY-MM-DD|
|**11**|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/claimDeliveryType|The method by which the claim was<br>received.|E' -  Electronic <br>'S'  - SDS paper 837 <br>Crosswalk Name : P_IB_837_ClaimSourceLookup<br>•Provide the Sender Id and Receiver Id as the source columns.<br>•Provide the ClaimSource and ClaimDeliveryType as the target columns.|
|**12**|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/payeeTypeField|<br><br>Indicates whether the claim is to be<br>paid to a supplier or a member.<br><br>|Hardcode as Supplier|
|**13**|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/claimPayorType|Benefit plan type (medical, dental,<br>etc.)|Hardcode as 1 (medical)|
|**14**|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/rayId|Unique Identifier for the complete lifecycle of transaction/Record. Will be unchanged even the transaction is Split, passed across various system, reprocessed.|GUID|
|**15**|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/recordId|Unique Identifier for transaction level. Will be different when we split, reprocess a same record.|GUID|
|**16**|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/recordIdFromSource||senderid(ISA06)_patientcontrolnum(CLM01)_clearinghousingnum(2300.REF*D9)|
|**17**|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/sourceTypeIdentifier|Identifier to find from where we received(Starting point) the initial Transaction/Record.|SubmitterName(1000A. NM103+NM104)_{Paper}<br>SubmitterName(1000A. NM103+NM104)_{Electronic}|
|**18**|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/tenantIdentifier|Unique identifier for the implementation team|Hardcode as "Product"|
|**19**|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/institutionalServiceLineItem/serviceLine/eobPaymentInformation/nonCoveredAmount|Non covered amount - COB - Line level|Map 2430.CAS03 / 2430.CAS06 /2430.CAS09 /2430.CAS12/2430.CAS15/2430.CAS18   for all 2430.CAS01-2430.CAS02/05/08/11/14/17 combinations which are not explicitly mentioned in 2430.CAS segment mapping.|
|**20**|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/lineEobInformation/nonCoveredAmount|Non covered amount - COB - Line level|Map 2430.CAS03 / 2430.CAS06 /2430.CAS09 /2430.CAS12/2430.CAS15/2430.CAS18   for all 2430.CAS01-2430.CAS02/05/08/11/14/17 combinations which are not explicitly mentioned in 2430.CAS segment mapping.|
|**21**|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/invoiceAttachments/invoiceAttachment/eobAttachment/submittedEobPaymentInformation/headerEobInformation/nonCoveredAmount|Non covered amount - COB- Claim level|Map 2320.CAS03 / 2320.CAS06 /2320.CAS09 /2320.CAS12/2320.CAS15/2320.CAS18   for all CAS01-CAS02/05/08/11/14/17 combinations which are not explicitly mentioned in 2320.CAS segment mapping.|
|**22**|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/claimUDTList/claimUDT/udtListValueSet/attributeRoleName||Hardcode as "Submitted Claim Key"|
|**23**|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/claimUDTList/claimUDT/udtListValueSet/attrValueAsString||Should be same value as pupulated in institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/recordId|
|**24**|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/claimUDTList/claimUDT/userDefinedTermReference/ID||Hardcode as "Submitted Claim Key"|
---
<a id="sheet-sheet1"></a>
## Sheet: Sheet1
|#|G|
|---|---|
|**1**|institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/supplierInformation/address|
---
<a id="sheet-crosswalk"></a>
## Sheet: Crosswalk
|#|A|B|C|D|E|
|---|---|---|---|---|---|
|**1**|PWK Segment _(cs=5)_|⬚|⬚|⬚|⬚|
|**2**|Enumeration values|Description|HRP Code|Short Name|Short Description|
|**3**|M1|Medical Record Attachment|1|Xray|The attachment is an X-ray|
|**4**|6|Initial Assessment|2|Note|The attachment is a copy of the Doctor's Notes|
|**5**|21|Recovery Plan|3|OPNote|The attachment is a copy of the Operating Room Notes|
|**6**|HR|Health Clinic Records|5|Payment Receipt|The attachment is a receipt or some other proof of payment|
|**7**|HC|Health Certificate|6|Cert|The attachment is a Certificate of Completion|
|**8**|OD|Orders and Treatments Document|7|Bill|The attachment is an itemized bill|
|**9**|9|Progress Report|8|Collection Note|The attachment is a Collections Notice|
|**10**|3|Report Justifying Treatment Beyond UtilizationGuidelines|9|Other|Other Type of Attachment|
|**11**|4|Drugs Administered|9|Other|Other Type of Attachment|
|**12**|5|Treatment Diagnosis|9|Other|Other Type of Attachment|
|**13**|7|Functional Goals|9|Other|Other Type of Attachment|
|**14**|8|Plan of Treatment|9|Other|Other Type of Attachment|
|**15**|10|Continued Treatment|9|Other|Other Type of Attachment|
|**16**|11|Chemical Analysis|9|Other|Other Type of Attachment|
|**17**|13|Certified Test Report|9|Other|Other Type of Attachment|
|**18**|15|Justification for Admission|9|Other|Other Type of Attachment|
|**19**|A3|Allergies/Sensitivities Document|9|Other|Other Type of Attachment|
|**20**|A4|Autopsy Report|9|Other|Other Type of Attachment|
|**21**|AM|Ambulance Certification|9|Other|Other Type of Attachment|
|**22**|BR|Benchmark Testing Results|9|Other|Other Type of Attachment|
|**23**|BS|Baseline|9|Other|Other Type of Attachment|
|**24**|BT|Blanket Test Results|9|Other|Other Type of Attachment|
|**25**|CB|Chiropractic Justification|9|Other|Other Type of Attachment|
|**26**|CK|Consent Form(s)|9|Other|Other Type of Attachment|
|**27**|D2|Drug Profile Document|9|Other|Other Type of Attachment|
|**28**|DB|Durable Medical Equipment Prescription|9|Other|Other Type of Attachment|
|**29**|DJ|Discharge Monitoring Report|9|Other|Other Type of Attachment|
|**30**|I5|Immunization Record|9|Other|Other Type of Attachment|
|**31**|IR|State School Immunization Records|9|Other|Other Type of Attachment|
|**32**|LA|Laboratory Results|9|Other|Other Type of Attachment|
|**33**|OC|Oxygen Content Averaging Report|9|Other|Other Type of Attachment|
|**34**|OE|Objective Physical Examination (including vital signs) Document|9|Other|Other Type of Attachment|
|**35**|OX|Oxygen Therapy Certification|9|Other|Other Type of Attachment|
|**36**|P4|Pathology Report|9|Other|Other Type of Attachment|
|**37**|P5|Patient Medical History Document|9|Other|Other Type of Attachment|
|**38**|PE|Parenteral or Enteral Certification|9|Other|Other Type of Attachment|
|**39**|PQ|Paramedical Results|9|Other|Other Type of Attachment|
|**40**|PY|Physician’s Report|9|Other|Other Type of Attachment|
|**41**|RX|Renewable Oxygen Content Averaging Report|9|Other|Other Type of Attachment|
|**42**|SG|Symptoms Document|9|Other|Other Type of Attachment|
|**43**|V5|Death Notification|9|Other|Other Type of Attachment|
|**44**|XP|Photographs|9|Other|Other Type of Attachment|
|**45**|AS|Admission Summary|10|Admission Summary|Admission Summary|
|**46**|B2|Prescription|11|Prescription|Prescription|
|**47**|B3|Physician Order|12|Physician Order|Physician Order|
|**48**|B4|Referral Form|13|Referral Form|Referral Form|
|**49**|CT|Certification|14|Certification|Certification|
|**50**|DA|Dental Models|15|Dental Models|Dental Models|
|**51**|DG|Diagnostic Report|16|Diagnostic Report|Diagnostic Report|
|**52**|DS|Discharge Summary|17|Discharge Summary|Discharge Summary|
|**53**|EB|Explanation of Benefits (Coordination of Benefits or Medicare Secondary Payor)|18|Explanation of Benefits|Explanation of Benefits|
|**54**|MT|Models|19|Models|Models|
|**55**|NN|Nursing Notes|20|Nursing Notes|Nursing Notes|
|**56**|OB|Operative Note|21|Operative Note|Operative Note|
|**57**|OZ|Support Data for Claim|22|Support Data for Claim|Support Data for Claim|
|**58**|PN|Physical Therapy Notes|23|Physical Therapy Notes|Physical Therapy Notes|
|**59**|PO|Prosthetics or Orthotic Certification|24|Prosthetics or Orthotic Certification|Prosthetics or Orthotic Certification|
|**60**|PZ|Physical Therapy Certification|25|Physical Therapy Certification|Physical Therapy Certification|
|**61**|RB|Radiology Films|26|Radiology Films|Radiology Films|
|**62**|RR|Radiology Reports|27|Radiology Reports|Radiology Reports|
|**63**|RT|Report of Tests and Analysis Report|28|Report of Tests and Analysis Report|Report of Tests and Analysis Report|
---
</file>
<file path="BA-Mapping-Docs/EdifecsProduct_Mappingspec_OutboundEnrollment _834_XML_to_EDIConversion_V1.2.md">
# EdifecsProduct_Mappingspec_OutboundEnrollment _834_XML_to_EDIConversion_V1.2
|Property|Value|
|----------|-------|
|**Source file**|`EdifecsProduct_Mappingspec_OutboundEnrollment _834_XML_to_EDIConversion_V1.2.xlsx`|
|**Sheets**|Cover Sheet, Version History, User Stories, Mapping Outbound, Comparison with IB and OB, Conversion copy|
|**Converted**|2026-06-24T11:46:58.631Z|
> ℹ️  Formulas are shown inline as `=FORMULA` after the cached value.
> Merged cells: anchor cell shows _(cs=N, rs=N)_; absorbed cells show ⬚.
> Formula Index per sheet is collapsible — click to expand.
---
## Contents
1. [Sheet: Cover Sheet](#sheet-cover-sheet)
2. [Sheet: Version History](#sheet-version-history)
3. [Sheet: User Stories](#sheet-user-stories)
4. [Sheet: Mapping Outbound](#sheet-mapping-outbound)
5. [Sheet: Comparison with IB and OB](#sheet-comparison-with-ib-and-ob)
6. [Sheet: Conversion copy](#sheet-conversion-copy)
---
<a id="sheet-cover-sheet"></a>
## Sheet: Cover Sheet
|#|B|C|D|E|F|G|H|I|J|K|L|
|---|---|---|---|---|---|---|---|---|---|---|---|
|**5**||||||||||||
|**6**|Mapping Specification - Integration Plus _EDIFECS _(cs=11, rs=2)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**7**|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**8**|Business Area: Enrollment OB 834 XML to EDI Conversion _(cs=11, rs=2)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**9**|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**10**|This document provides the mapping specification for Outbound Enrollment XML to EDI 834 EDI Conversion. Document is intended for EDIFECS Product Team _(cs=11, rs=2)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**11**|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**12**||||||||||||
|**13**|||||Version _(cs=2)_|⬚|V24.4.0.0|||||
|**14**||||||||||||
|**15**||Distribution of this document is limited to  Associates and UST Healthproof `=CONCAT("Distribution of this document is limited to ",I11," Associates and UST Healthproof")` _(cs=9)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚||
|**16**||||||||||||
|**17**||Notice of Confidentiality and Custodial Responsibilities _(cs=9)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚||
|**18**||This  document contains confidential information that is 's intellectual property. As a holder of this document, you  may NOT disclose its content or any information derived from it to  any person outside of   and UST Healthproof  Project Team `=CONCAT("This ",I11," document contains confidential information that is ",I11,"'s intellectual property. As a holder of this document, you  may NOT disclose its content or any information derived from it to  any person outside of  ",I11," and UST Healthproof ",I11," Project Team")` _(cs=9, rs=4)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚||
|**19**||⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚||
|**20**||⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚||
|**21**||⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚||
|**22**||||||||||||
|**23**|Sign Off _(cs=11)_|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|⬚|
|**24**||Name _(cs=2)_|⬚|Role _(cs=2)_|⬚|Organization _(cs=2)_|⬚|Date _(cs=2)_|⬚|Approval  _(cs=2)_|⬚|
|**25**|Approver #1|_(cs=2)_|⬚|_(cs=2)_|⬚|_(cs=2)_|⬚|_(cs=2)_|⬚|_(cs=2)_|⬚|
|**26**|Approver #2|_(cs=2)_|⬚|_(cs=2)_|⬚|_(cs=2)_|⬚|_(cs=2)_|⬚|_(cs=2)_|⬚|
|**27**|Approver #3|_(cs=2)_|⬚|_(cs=2)_|⬚|_(cs=2)_|⬚|_(cs=2)_|⬚|_(cs=2)_|⬚|
|**28**|Approver #4|_(cs=2)_|⬚|_(cs=2)_|⬚|_(cs=2)_|⬚|_(cs=2)_|⬚|_(cs=2)_|⬚|
<details>
<summary><strong>Formula Index</strong> — 2 formulas</summary>
|Cell|Cached Value|Formula|
|------|-------------|---------|
|`C15`|Distribution of this document is limited to  Associates and UST Healthproof|`=CONCAT("Distribution of this document is limited to ",I11," Associates and UST Healthproof")`|
|`C18`|This  document contains confidential information that is 's intellectual property. As a holder of this document, you  may NOT disclose its content or any information derived from it to  any person outside of   and UST Healthproof  Project Team|`=CONCAT("This ",I11," document contains confidential information that is ",I11,"'s intellectual property. As a holder of this document, you  may NOT disclose its content or any information derived from it to  any person outside of  ",I11," and UST Healthproof ",I11," Project Team")`|
</details>
---
<a id="sheet-version-history"></a>
## Sheet: Version History
|#|A|B|C|D|E|
|---|---|---|---|---|---|
|**1**||||||
|**2**||||||
|**3**||||||
|**4**|Revision History _(cs=5)_|⬚|⬚|⬚|⬚|
|**5**||||||
|**6**|V#|Date|Author|Reviewer(s)/ Contributor(s)|Comments|
|**7**|0.1|07/17/2023|Jishnu RK|Shijila Muralidharan|Created the initial draft|
|**8**|0.2|07/26/2023|Jishnu RK|Shijila Muralidharan|Made changes in segments as per 2nd review|
|**9**|0.3|4/18/2024|Ambily Raj||Updated|
|**10**|0.4|24/12/2024|Swedha Kumar|Ambily Raj|Updated|
|**11**|1.0|27/12/2024|Swedha Kumar|Ambily Raj|Baselined|
|**12**|1.1|25/02/2025|Swedha Kumar|Ambily Raj|Added logic for medicareHICN tags - INTP- 14775|
|**13**|1.2|2/3/25|Swedha Kumar||Added logic for LUI04 Mapping - INTP-17614|
---
<a id="sheet-user-stories"></a>
## Sheet: User Stories
_Empty sheet._
---
<a id="sheet-mapping-outbound"></a>
## Sheet: Mapping Outbound
|#|A|B|C|D|E|F|G|H|I|J|K|L|
|---|---|---|---|---|---|---|---|---|---|---|---|---|
|**1**|Loop ID|Segment ID|Segment Name|Element Description|Enumeration Values|Length|User Option|XML Field|Mapping Logic|Configurable Field?|Comments||
|**2**||ISA|Interchange Control Header||||||||||
|**3**||ISA01|Authorization Information Qualifier|The plans use 00<br>No Authorization Information Present Qualifier|00 No Authorization Information Present (No<br>Meaningful Information in I02)<br>03 Additional Data Identification||||Hardcoded to "00"||||
|**4**||ISA02|Authorization Information|Submitter-specific ID number or 10-space placeholder|||||Leave it blank||||
|**5**||ISA03|Security Information Qualifier|No Security Information Present Qualifier <br>|00 No Security Information Present (No Meaningful<br>Information in I04)<br>01 Password||||Hardcoded to "00"||||
|**6**||ISA04|Security Information|Submitter-specific ID number or 10-space placeholder|||||Leave it blank||||
|**7**||ISA05|Interchange ID Qualifier|Federal Tax Id, Mutually Defined|01 Duns (Dun & Bradstreet)<br>14 Duns Plus Suffix<br>20 Health Industry Number (HIN)<br>CODE SOURCE 121: Health Industry Number<br>27 Carrier Identification Number as assigned by Health<br>Care Financing Administration (HCFA)<br>28 Fiscal Intermediary Identification Number as<br>assigned by Health Care Financing Administration<br>(HCFA)<br>29 Medicare Provider and Supplier Identification<br>Number as assigned by Health Care Financing<br>Administration (HCFA)<br>30 U.S. Federal Tax Identification Number<br>33 National Association of Insurance Commissioners<br>Company Code (NAIC)<br>ZZ Mutually Defined||||Hardcode as "ZZ"||||
|**8**||ISA06|Interchange Sender ID|Interchange Sender ID <br>|||||Hardcode as "1234           "|Yes. Please refer comments|Interchange Sender ID will be different for each customer.From product standpoint, we have hardcoded space and it will be configurable on implementation.||
|**9**||ISA07|Interchange ID Qualifier|Federal Tax Id, Mutually Defined|01 Duns (Dun & Bradstreet)<br>14 Duns Plus Suffix<br>20 Health Industry Number (HIN)<br>CODE SOURCE 121: Health Industry Number<br>27 Carrier Identification Number as assigned by Health<br>Care Financing Administration (HCFA)<br>28 Fiscal Intermediary Identification Number as<br>assigned by Health Care Financing Administration<br>(HCFA)<br>29 Medicare Provider and Supplier Identification<br>Number as assigned by Health Care Financing<br>Administration (HCFA)<br>30 U.S. Federal Tax Identification Number<br>33 National Association of Insurance Commissioners<br>Company Code (NAIC)<br>ZZ Mutually Defined||||Hardcode as  "ZZ"||||
|**10**||ISA08|Interchange Receiver ID|The Trading Partner ID (TPID) assigned|||||Hardcode as "1234           "||Interchange Receiver ID will be different for each customer.From product standpoint, it will be configurable on implementation.||
|**11**||ISA09|Interchange Date|Date the Interchange is created|||||Map this value from  current date in the format of "YYMMDD"||Date  transaction is created – done by translator  (Date for the Process of converting 834OB it will be the EDIFECS time of converting 834 OB ) YYMMDD||
|**12**||ISA10|Interchange Time|Time the Interchange is created|||||Map this value from   current time in the format of HHMM||||
|**13**||ISA11|Interchange Control Standards Identifier|Repetition Separator|||||Hardcode as "^"||||
|**14**||ISA12|Interchange Control Version Number|Standards Approved by ACS X12 Review Board|00501 Standards Approved for Publication by ASC X12<br>Procedures Review Board through October 2003||||Hardcode as "00501"||||
|**15**||ISA13|Interchange Control Number|Sender-specific control number<br>Unique Sequential Number Assigned by Internal Processes for each Interchange - Must be identical to the Interchange Trailer IEA02 <br>|||||Interchange Control Number. Must = IEA02||Unique ISI control number needs to generated in Edifecs for each 834 EDI file. It has to be 9 digits (for example -  000000764)||
|**16**||ISA14|Acknowledgment Requested|0 = No Interchange Acknowledgement Requested<br>1 = Interchange Acknowledgment Requested <br>|00501 Standards Approved for Publication by ASC X12<br>Procedures Review Board through October 2003||||Hardcode as "0"||||
|**17**||ISA15|Usage Identifier|P = Production Data T = Test|P Production Data<br>T Test Data||||Refer Column J and map based on below logic<br>Hardcode as "P"  if it is a Production region<br>Hardcode as "T"  if it is a Non-Production region||Based on Environmental property whether it is lower region or production region.||
|**18**||ISA16|Component Element Separator|Colon - Delimiter to separate component data <br>Header|||||Hardcode  as ":"||||
|**19**|GS (Functional Group Header) _(cs=3)_|⬚|⬚||||||||||
|**20**||GS|Functional Group Header||||||||||
|**21**||GS01|Functional Identifier Code|Benefit Enrollment And Maintenance (834)  <br>|||||Hardcode as "BE"||||
|**22**||GS02|Application Senders Code|Code identifying party sending transmission <br>This is Submitter-specific.|||||Hardcode as "123456789789"|Yes. Please refer comments|Application Sender Code will be different for each customer.From product standpoint we have mentioned the random senderId||
|**23**||GS03|Application Receivers Code|The Trading Partner ID (TPID) assigned for the client|||||Hardcode as "123456789789"|Yes. Please refer comments|Application receiver Code will be different for each customer.From product standpoint we have mentioned the random receiver Id||
|**24**||GS04|Date|Date the Group Header is created. <br>Enter current date in the CCYYMMDD format|||||Map this value from  current date in the format of "YYYYMMDD"||||
|**25**||GS05|Time|Time the Group Header is created. <br>Enter current time in the HHMM format|||||Map this value from   current Time in the format of "HHMMSS"||||
|**26**||GS06|Group Control Number|Unique Sequential Number Assigned by Internal Processes for each Group Header  by the sender.<br>Must be identical to the Interchange Trailer GE02 .<br>This is Submitter-specific.|Assigned number originated and maintained by the sender||||Functional Group Control Number. Value must equal GE02<br><br>GS control number min length - 1 and max is 9||||
|**27**||GS07|Responsible Agency Code|Code identifying the issuer of the EDI standard being used.<br>Accredited Standards Committee X12|X Accredited Standards Committee X12||||Hardcode as "X"||||
|**28**||GS08|Version/Release/Industry Identifier Code||005010X220 Standards Approved for Publication by ASC X12<br>Procedures Review Board through October 2003||||Hardcode to "005010X220A1"||||
|**29**|ST (Transaction Set Header) _(cs=3)_|⬚|⬚||||||||||
|**30**||ST|Transaction Set Header|will contain one or more transactions|||R||||||
|**31**||ST01|Transaction Set Identifier Code|Benefit Enrollment and Maintenance||Min-3   Max-3|R||Hardcode as "834"||||
|**32**||ST02|Transaction Set Control Number|Unique Sequential Number Assigned by Internal Processes for each Transaction Set<br>ST02 and SE02 must be identical||Min-4   Max-9|R||Unique control number needs to populated from process flow or map||||
|**33**||ST03|Implementation Convention Reference|Standards Approved by ACS X12 Review Board <br>ST03 and GS08 must be identical||Min-1   Max-35|R||Hardcode to "005010X220A1"||||
|**34**||BGN|Beginning Segment|Header|||R||||||
|**35**||BGN01|Transaction Set Purpose Code|“00” (original and resubmission of original upon request of trading partner)<br>“15” (re-submission to correct an error on original transmission)<br>22 = Information Copy <br>|00 Original<br>15 Re-Submission<br>22 Information Copy|Min-2   Max-2|R||Hardcode as "00"||||
|**36**||BGN02|Reference Identification|Transaction Set Reference Number||Min-1   Max-50|R||HF834.yymmdd||||
|**37**||BGN03|Date|Date the Transaction Set is created. <br>Enter current date in the CCYYMMDD format||Min-8   Max-8|R||Map this value from  current date in the format of "CCYYMMDD"||||
|**38**||BGN04|Time|Time the Transaction Set is created. <br>Enter current time in the HHMM format||Min-4   Max-8|R||Map this value from   current Time in the format of "HHMMSS"||||
|**39**||BGN05|Time Code|Eastern Time, always sent|D Eastern Daylight Time<br>ES Eastern Standard Time<br>ET Eastern Time|Min-2   Max-2|S||Hardcode as "ET"||||
|**40**||BGN06|Reference Identification|||Min-1   Max-50|S||||||
|**41**||BGN07|Transaction Type Code||||||||||
|**42**||BGN08|Action Code|Code indicating type of action|2 = Change/Update (Additions, Terminations and Changes to Current Enrollment),  <br>4 = Verify (Full File Enrollment)<br>RX Replace|Min-1   Max-2|R||Hardcode as "2"||||
|**43**||BGN09|Security Level Code||||||||||
|**44**||REF|Transaction Set Policy Number||||S||||||
|**45**||REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|38 Master Policy Number|Min-2   Max-3|R||||||
|**46**||REF02|Reference Identification|Master Policy Number||Min-1   Max-50|R||||||
|**47**||DTP|TDTP - File Effective Date||||S||||||
|**48**||DTP01|Date/Time Qualifier|007 - Effecive Date|007 Effective<br>090 Report Start<br>091 Report End<br>303 Maintenance Effective<br>382 Enrollment<br>388 Payment Commencement|Min-3   Max-3|R||Hardcode as "007"||||
|**49**||DTP02|Date Time Period Format Qualifier||D8 Date Expressed in Format CCYYMMDD|Min-2   Max-3|R||D8||||
|**50**||DTP03|Date Time Period|Current Date and time when the 834 batch is created||Min-1   Max-35|R||Current Date in CCYYMMDD||||
|**51**||QTY|Transaction Set Control Totals||||S||Do not Populate||||
|**52**||QTY01|Quantity Qualifier|(Total)|DT Dependent Total<br>ET Employee Total<br>TO Total|Min-2   Max-2|R||||||
|**53**||QTY02|Quantity|||Min-1   Max-15|R||||||
|**54**|1000A|N1|Sponsor Name|This loop identifies the sponsor|||R||||||
|**55**|1000A|N101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|P5 = Plan sponsor|Min-2   Max-3|R||P5||||
|**56**|1000A|N102|Plan Sponsor Name|Plan Sponsor Name||Min-1   Max-60|S||||||
|**57**|1000A|N103|Identification Code Qualifier|FI = Federal Tax ID Number|24 Employer’s Identification Number<br><br>94 Code assigned by the organization that is the<br>ultimate destination of the transaction set<br><br>FI Federal Taxpayer’s Identification Number|Min-1   Max-2|R||FI||||
|**58**|1000A|N104|Identification Code|||Min-2   Max-80|R||Hardcode as "123456789"|Yes. Please refer comments|Sponsor name will be different for each customer.From product standpoint, we have to hardcoded  random numbers .It will be configured on implementation||
|**59**|1000B|N1|Payer||||R||||||
|**60**|1000B|N101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|IN Insurer|Min-2   Max-3|R||IN||||
|**61**|1000B|N102|Name|Payer Name (free-form)||Min-1   Max-60|S||Hardcode as "Product"|Yes. Please refer comments|Payer name will be different for each customer.From product standpoint, we have to hardcoded  random numbers .It will be configured on implementation||
|**62**|1000B|N103|Identification Code Qualifier|FI = Federal Tax ID number<br>(Federal Taxpayer’s Identification Number)|94 Code assigned by the organization that is the<br>ultimate destination of the transaction set<br>FI Federal Taxpayer’s Identification Number<br>XV Centers for Medicare and Medicaid Services PlanID|Min-1   Max-2|R||FI||||
|**63**|1000B|N104|Identification Code|Enter the Tax ID number<br>|(format is '9 digits or '000-00-0000'|Min-2   Max-80|R||Hardcode as "123456789"<br>|Yes. Please refer comments|Payer id will be different for each customer.From product standpoint, we have to hardcoded random numbers .It will be configured on implementation||
|**64**|1000C|N1|TPA/Broker Name||||S||||||
|**65**|1000C|N101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an individual|BO Broker or Sales Office<br>TV Third Party Administrator (TPA)|Min-2   Max-3|R||||||
|**66**|1000C|N102|Name|TPA/Broker Name (free-form)||Min-1   Max-60|R||||||
|**67**|1000C|N103|Identification Code Qualifier|Code designating the system/method of code structure used for Identification<br>Code|94 Code assigned by the organization that is the<br>ultimate destination of the transaction set<br>FI Federal Taxpayer’s Identification Number<br>XV Centers for Medicare and Medicaid Services PlanID|Min-1   Max-2|R||||||
|**68**|1000C|N104|Identification Code|Code that identifies the MCO Broker.||Min-2   Max-80|R||||||
|**69**|1100C|ACT|TPA/Broker Account Information||||S||||||
|**70**|1100c|ACT01|Account Number|Account number assigned||Min-1   Max-35|R||||||
|**71**|1100C|ACT06|Account Number|Account number assigned<br>ACT06 is an account associated with the account in ACT01||Min-1   Max-35|S||||||
|**72**|2000|INS|Member Level Detail||||R||||||
|**73**|2000|INS01|Yes/No Condition or Response Code|Code indicating a Yes or No condition or response|N No<br> Y Yes|Min-1   Max-1|R|Enrollment/member/memberIsSubscriber<br><br>|If True Populate as Y<br>If False Populate as N||||
|**74**|2000|INS02|Individual Relationship Code|“18” (self) – insured is always the subscriber<br><br>|Refer Tab Conversion Copy|Min-2   Max-2|R|<br><br>Enrollment/member/relationshipToSubscriberDefinitionReference/relationshipName<br><br>|Refer Tab Conversion Copy||||
|**75**|2000|INS03|Maintenance Type Code|Code identifying the specific type of item maintenance|001 = Change, <br>021 = Addition, <br>024 = Cancellation or Termination, <br>025 =  Reinstatement<br>030 =  Audit or Compare|Min-3   Max-3|R||Hardcode as '030'||||
|**76**|2000|INS04|Maintenance Reason Code|Code identifying the reason for the maintenance change|01 Divorce<br>02 Birth<br>03 Death<br>04 Retirement<br>05 Adoption<br>06 Strike<br>07 Termination of Benefits<br>08 Termination of Employment<br>09 Consolidation Omnibus Budget Reconciliation Act<br>(COBRA)<br>10 Consolidation Omnibus Budget Reconciliation Act<br>(COBRA) Premium Paid<br>11 Surviving Spouse<br>14 Voluntary Withdrawal<br>15 Primary Care Provider (PCP) Change<br>16 Quit<br>17 Fired<br>18 Suspended<br>20 Active<br>21 Disability<br>22 Plan Change<br>25 Change in Identifying Data Elements<br>26 Declined Coverage<br>27 Pre-Enrollment<br>28 Initial Enrollment<br>29 Benefit Selection<br>31 Legal Separation<br>32 Marriage<br>33 Personnel Data.<br>37 Leave of Absence with Benefits<br>38 Leave of Absence without Benefits<br>39 Lay Off with Benefits<br>40 Lay Off without Benefits<br>41 Re-enrollment<br>43 Change of Location<br>59 Non Payment<br>AA Dissatisfaction with Office Staff<br>AB Dissatisfaction with Medical Care/Services Rendered<br>AC Inconvenient Office Location<br>AD Dissatisfaction with Office Hours<br>AE Unable to Schedule Appointments in a Timely<br>Manner<br>AF Dissatisfaction with Physician’s Referral Policy<br>AG Less Respect and Attention Time Given than to<br>Other Patients<br>AH Patient Moved to a New Location<br>AI No Reason Given<br>AJ Appointment Times not Met in a Timely Manner<br>AL Algorithm Assigned Benefit Selection<br>EC Member Benefit Selection<br>XN Notification Only<br>(Audit/Compare).<br>XT Transfer<br>|Min-2   Max-3|S||Hardcode as 'XN'||||
|**77**|2000|INS05|Benefit Status Code|The type of coverage under which benefits are paid|A Active<br>C Consolidated Omnibus Budget Reconciliation Act<br>(COBRA)<br>S Surviving Insured<br>T Tax Equity and Fiscal Responsibility Act (TEFRA)|Min-1   Max-1|R||Hardcode as  "A"||||
|**78**|2000|INS06|Medicare Status Code|To provide Medicare coverage and associated reason for Medicare eligibility|||S|S|1. In case of multiple /medicareHICN tags, traverse thru all /medicareHICN and take the one where  /medicareHICN/expirationdate is not present, considering it as the highest one and if  /medicareHICN/expirationdate is present then take the highest  /medicareHICN/expirationdate||||
|**79**|2000|INS06-1|Medicare Plan Code|Code identifying the Medicare Plan|A Medicare Part A<br>B Medicare Part B<br>C Medicare Part A and B<br>D Medicare<br>E No Medicare|Min-1   Max-1|R||2. If medicareHICN/mbi != "" AND<br>If  /enrollment/member/medicareHICN/partADates/partADate/effectiveDate != "" , can come alone or when /enrollment/member/medicareHICN/partDDateRanges/partDDateRanges/startDate !="" comes along with this<br>Map  INS06-1 as "A"<br>Else If /enrollment/member/medicareHICN/partBDates/partBDate/effectiveDate != "",  can come alone or when /enrollment/member/medicareHICN/partDDateRanges/partDDateRanges/startDate !="" comes along with this<br>Map  INS06-1 as "B"<br>Else If /enrollment/member/medicareHICN/partBDates/partBDate/effectiveDate != "" and /enrollment/member/medicareHICN/partADates/partADate/effectiveDate != "" <br> Map  INS06-1 as "C"<br>Else If<br>/enrollment/member/medicareHICN/partDDateRanges/partDDateRanges/startDate !=""<br>Map INS06-1 as "D"<br>Else <br> Map it to "E"||||
|**80**|2000|INS06-2|Eligibility Reason Code|Code specifying reason for eligibility|0 Age<br>1 Disability<br>2 End Stage Renal Disease (ESRD)|Min-1   Max-1|S||2. If medicareHICN/mbi != ""<br> If  /enrollment/member/medicareHICN/esrdIndicator == "true"<br>    Map "2"<br> Else If   /member/medicareHICN/medicareEligibilityReasonCode/codeSetName ="MedicareEligibilityReason  and /member/medicareHICN/medicareEligibilityReasonCode/Alternatives/codeEntry = "1"<br>    Map "0"<br>Else if<br>/member/medicareHICN/medicareEligibilityReasonCode/codeSetName ="MedicareEligibilityReason   and /member/medicareHICN/medicareEligibilityReasonCode/Alternatives/codeEntry = "3"<br>    Map "1"||||
|**81**|2000|INS07|COBRA Qualifying Event|A Qualifying Event is any of the following which results in loss of coverage for a<br>Qualified Beneficiary|1 Termination of Employment<br>2 Reduction of work hours<br>3 Medicare<br>4 Death<br>5 Divorce<br>6 Separation<br>7 Ineligible Child<br>8 Bankruptcy of Retiree’s Former Employer (26 U.S.C.<br>4980B(f)(3)(F))<br>9 Layoff<br>10 Leave of Absence<br>ZZ Mutually Defined|Min-1   Max-2|S||||||
|**82**|2000|INS08|Employment Status Code|Code showing the general employment status of an employee/claimant|AC Active<br>AO Active Military - Overseas<br>AU Active Military - USA<br>FT Full-time<br>L1 Leave of Absence<br>PT Part-time<br>RT Retired<br>TE Terminated|Min-2   Max-2|S|/enrollment/member/employmentInfo/employmentStatusCodeCode/codeEntry<br><br>|If  INS01 = Y , map /enrollment/member/employmentInfo/employmentStatusCodeCode/codeSetName  = EmploymentStatusCode<br>Refer Conversion copy<br><br>If INS01 = N, Don't map INS08<br>||||
|**83**|2000|INS09|Student Status Code|Code indicating the student status of the patient if 19 years of age or older, not<br>handicapped and not the insured|F Full-time<br>N Not a Student<br>P Part-time|Min-1   Max-1|S||||||
|**84**|2000|INS10|Handicap Indicator|Code indicating a Yes or No condition or response|N No<br>Y Yes|Min-1   Max-1|S|/enrollment/member/IsHandicapped<br>|If True, populate as Y<br>If False, Populate as N||||
|**85**|2000|INS11|DTP Format Qualifier|Code indicating the date format, time format, or date and time format|D8 Date Expressed in Format CCYYMMDD|Min-2   Max-3|S||Hardcode as "D8" If /enrollment/member/individual/dateOfDeath != ""||||
|**86**|2000|INS12|Date Time Period|Insured Individual Death Date||Min-1   Max-35|S|/enrollment/member/individual/dateOfDeath|||||
|**87**|2000|INS13|Confidentiality Code|Code indicating the access to insured information|R Restricted Access<br>U Unrestricted Access|Min-1   Max-1|S||||||
|**88**|2000|INS17|Birth Sequence Number|A generic number||Min-1   Max-9|S||||||
|**89**|2000|REF|Subscriber Identifier||||R||||||
|**90**|2000|REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|0F Subscriber Number|Min-2   Max-3|R||Hardcode as "OF"||||
|**91**|2000|REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier<br><br>Uniquie Subscriber HCC Identifier created in HRP for each membership from State||Min-1   Max-50|R|/enrollment/subscription/hccIdentifier|||||
|**92**|2000|REF|Member Policy Number||||S||||||
|**93**|2000|REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|1L Group or Policy Number|Min-2   Max-3|R||||||
|**94**|2000|REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier||Min-1   Max-50|R||||||
|**95**|2000|REF|Member Supplemental Identifier||||S||||||
|**96**|2000|REF01|Reference Identification Qualifier|Code qualifying the Reference Identification<br>|17 Client Reporting Category<br>23 Client Number<br>3H Case Number<br>4A Personal Identification Number (PIN)<br>6O Cross Reference Number<br>D3 National Council for Prescription Drug Programs<br>Pharmacy Number<br>F6 Health Insurance Claim (HIC) Number<br>P5 Position Code<br>Q4 Prior Identifier Number<br>QQ Unit Number<br>ZZ Mutually Defined<br>DX Department/Agency Number<br>ABB Personal ID Number|Min-2   Max-3|R|/enrollment/member/otherIdNumberList/identificationNumber/identificationTypeCode/codeEntry|whenever otherIdNumberList/identificationNumber/identificationTypeCode/codeEntry = "F6", exclude the reverse crosswalk and take the <medicareHICN>/<mbi> and incase of multiple <medicareHICN>/<mbi> pls refer logic from INS06.<br><br>For all other code enteries, In case of multiple similar /identificationNumber/identificationTypeCode/codeEntry tags, traverse thru all similar /identificationNumber/identificationTypeCode/codeEntry and take the one where  /identificationNumber/effectiveEndDate is not present and take the latest /identificationNumber/effectiveStartDate and if  /identificationNumber/effectiveEndDate is present then take the highest /identificationNumber/effectiveEndDate , and map accordingly.|Yes. Please refer comments|EDIFECS will do the reverse crosswalk and the corresponding EDI value will be mapped to REF01<br>- From product standpoint map ref*02 only for the mentioned qualifier at ref*01 , else don't map this segment.<br>- Implementation team can customize their specific values at adaptor layer||
|**97**|2000|REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier||Min-1   Max-50|R|/enrollment/member/otherIdNumberList/identificationNumber/identificationNumber||Yes. Please refer comments|||
|**98**|2000|DTP|Member Level Dates||||S||||||
|**99**|2000|DTP01|Date Time Qualifier|Code specifying type of date or time, or both date and time|050 Received<br>1000101 Used to identify the date an enrollment application<br>is received.<br>286 Retirement<br>296 Initial Disability Period Return To Work<br>297 Initial Disability Period Last Day Worked<br>300 Enrollment Signature Date<br>301 Consolidated Omnibus Budget Reconciliation Act<br>(COBRA) Qualifying Event<br>303 Maintenance Effective<br>336 Employment Begin<br>337 Employment End<br>338 Medicare Begin<br>339 Medicare End<br>340 Consolidated Omnibus Budget Reconciliation Act<br>(COBRA) Begin<br>341 Consolidated Omnibus Budget Reconciliation Act<br>(COBRA) End<br>350 Education Begin<br>351 Education End<br>356 Eligibility Begin<br>357 Eligibility End<br>383 Adjusted Hire<br>385 Credited Service Begin<br>386 Credited Service End<br>393 Plan Participation Suspension<br>394 Rehire<br>473 Medicaid Begin<br>474 Medicaid End|Min-3   Max-3|R||Hardcode as  "356"<br>||||
|**100**|2000|DTP02|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|D8 Date Expressed in Format CCYYMMDD|Min-2   Max-3|R||D8||||
|**101**|2000|DTP03|Date Time Period|<br>Expression of a date, a time, or range of dates, times or dates and times||Min-1   Max-35|R|enrollment/member/Planselection/startdate|In case of multiple HD segments, traverse thru all <Planselection> tags and take the earliest of /Planselection/startdate.|||<!-- NOTE: Need to confirm with shiji -->|
|**102**|2000|DTP|Member Level Dates||||S||||||
|**103**|2000|DTP01|Date Time Qualifier|Code specifying type of date or time, or both date and time|050 Received<br>1000101 Used to identify the date an enrollment application<br>is received.<br>286 Retirement<br>296 Initial Disability Period Return To Work<br>297 Initial Disability Period Last Day Worked<br>300 Enrollment Signature Date<br>301 Consolidated Omnibus Budget Reconciliation Act<br>(COBRA) Qualifying Event<br>303 Maintenance Effective<br>336 Employment Begin<br>337 Employment End<br>338 Medicare Begin<br>339 Medicare End<br>340 Consolidated Omnibus Budget Reconciliation Act<br>(COBRA) Begin<br>341 Consolidated Omnibus Budget Reconciliation Act<br>(COBRA) End<br>350 Education Begin<br>351 Education End<br>356 Eligibility Begin<br>357 Eligibility End<br>383 Adjusted Hire<br>385 Credited Service Begin<br>386 Credited Service End<br>393 Plan Participation Suspension<br>394 Rehire<br>473 Medicaid Begin<br>474 Medicaid End|Min-3   Max-3|R||Hardcode as  "357"<br>||custom field - map it in adaptor for testing <br>will be removed once testing is completed||
|**104**|2000|DTP02|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|D8 Date Expressed in Format CCYYMMDD|Min-2   Max-3|R||||||
|**105**|2000|DTP03|Date Time Period|<br>Expression of a date, a time, or range of dates, times or dates and times||Min-1   Max-35|R|enrollment/member/Planselection/enddate|In case of multiple HD segments, traverse thru all <Planselection> tags and take the earliest of /Planselection/startdate and map the corresponding /Planselection/enddate||||
|**106**|2000|DTP|Member Level Dates||||S||1. In case of multiple /medicareHICN tags, traverse thru all /medicareHICN and take the one where  /medicareHICN/expirationdate is not present, considering it as the highest one and if  /medicareHICN/expirationdate is present then take the highest  /medicareHICN/expirationdate||||
|**107**|2000|DTP01|Date Time Qualifier|Code specifying type of date or time, or both date and time|050 Received<br>1000101 Used to identify the date an enrollment application<br>is received.<br>286 Retirement<br>296 Initial Disability Period Return To Work<br>297 Initial Disability Period Last Day Worked<br>300 Enrollment Signature Date<br>301 Consolidated Omnibus Budget Reconciliation Act<br>(COBRA) Qualifying Event<br>303 Maintenance Effective<br>336 Employment Begin<br>337 Employment End<br>338 Medicare Begin<br>339 Medicare End<br>340 Consolidated Omnibus Budget Reconciliation Act<br>(COBRA) Begin<br>341 Consolidated Omnibus Budget Reconciliation Act<br>(COBRA) End<br>350 Education Begin<br>351 Education End<br>356 Eligibility Begin<br>357 Eligibility End<br>383 Adjusted Hire<br>385 Credited Service Begin<br>386 Credited Service End<br>393 Plan Participation Suspension<br>394 Rehire<br>473 Medicaid Begin<br>474 Medicaid End|Min-3   Max-3|R||Hardcode as  "338" if enrollment/member/medicareHICN/effectiveDate  != " "<br>||Medicare Begin date||
|**108**|2000|DTP02|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|D8 Date Expressed in Format CCYYMMDD|Min-2   Max-3|R||D8||||
|**109**|2000|DTP03|Date Time Period|<br>Expression of a date, a time, or range of dates, times or dates and times||Min-1   Max-35|R|enrollment/member/medicareHICN/effectiveDate|||||
|**110**|2000|DTP|Member Level Dates||||S||1. In case of multiple /medicareHICN tags, traverse thru all /medicareHICN and take the one where  /medicareHICN/expirationdate is not present, considering it as the highest one and if  /medicareHICN/expirationdate is present then take the highest  /medicareHICN/expirationdate||||
|**111**|2000|DTP01|Date Time Qualifier|Code specifying type of date or time, or both date and time|050 Received<br>1000101 Used to identify the date an enrollment application<br>is received.<br>286 Retirement<br>296 Initial Disability Period Return To Work<br>297 Initial Disability Period Last Day Worked<br>300 Enrollment Signature Date<br>301 Consolidated Omnibus Budget Reconciliation Act<br>(COBRA) Qualifying Event<br>303 Maintenance Effective<br>336 Employment Begin<br>337 Employment End<br>338 Medicare Begin<br>339 Medicare End<br>340 Consolidated Omnibus Budget Reconciliation Act<br>(COBRA) Begin<br>341 Consolidated Omnibus Budget Reconciliation Act<br>(COBRA) End<br>350 Education Begin<br>351 Education End<br>356 Eligibility Begin<br>357 Eligibility End<br>383 Adjusted Hire<br>385 Credited Service Begin<br>386 Credited Service End<br>393 Plan Participation Suspension<br>394 Rehire<br>473 Medicaid Begin<br>474 Medicaid End|Min-3   Max-3|R||Hardcode as  "339" if enrollment/member/medicareHICN/expirationDate  != " "<br>||||
|**112**|2000|DTP02|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|D8 Date Expressed in Format CCYYMMDD|Min-2   Max-3|R||D8||||
|**113**|2000|DTP03|Date Time Period|<br>Expression of a date, a time, or range of dates, times or dates and times||Min-1   Max-35|R|enrollment/member/medicareHICN/expirationDate|||||
|**114**|2100A|NM1|Member Name||||R||||||
|**115**|2100A|NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|74 Corrected Insured<br>IL Insured or Subscriber|Min-2   Max-3|R||Hardcode as '1L'||||
|**116**|2100A|NM102|Entity Type Qualifier|Code qualifying the type of entity|1 Person|Min-1   Max-1|R||Hardcode as '1'||||
|**117**|2100A|NM103|Subscriber Last Name|Individual last name or organizational name||Min-1   Max-60|R|/enrollment/member/individual/primaryName/lastName|||||
|**118**|2100A|NM104|Subscriber First Name|Individual first name||Min-1   Max-35|S|/enrollment/member/individual/primaryName/firstName|||||
|**119**|2100A|NM105|Subscriber Middle Name|Individual middle name or initial||Min-1   Max-25|S|/enrollment/member/individual/primaryName/middleName<br><br>|||||
|**120**|2100A|NM106|Subscriber Name Prefix|Prefix to individual name||Min-1   Max-10|S|/enrollment/member/individual/primaryName/namePrefix|||||
|**121**|2100A|NM107|Subscriber Name Suffix|Suffix to individual nam||Min-1   Max-10|S|/enrollment/member/individual/primaryName/nameSuffixList/suffix|||||
|**122**|2100A|NM108|Identification Code Qualifier|Code designating the system/method of code structure used for Identification<br>Code|34 Social Security Number<br>ZZ Mutually Defined|Min-1   Max-2|S||Hardcode as '34'||||
|**123**|2100A|NM109|Subscriber Identifier|Code identifying a party or other code||Min-2   Max-80|S|/enrollment/member/individual/taxIdentificationNumber|Remove any "hyphens" from /taxIdentificationNumber||||
|**124**|2100A|PER|Members Communications Numbers||||S||||||
|**125**|2100A|PER01|Contact Function Code|Code identifying the major duty or responsibility of the person or group named|IP Insured Party|Min-2   Max-2|R||Hardcode as 'IP'||||
|**126**|2100A|PER02|Name||||||Not used, leave blank||||
|**127**|2100A|PER03|Communication Number Qualifier|Code identifying the type of communication number|AP Alternate Telephone<br>BN Beeper Number<br>CP Cellular Phone<br>EM Electronic Mail<br>EX Telephone Extension<br>FX Facsimile<br>HP Home Phone Number<br>TE Telephone<br>WP Work Phone Number|Min-2   Max-2|R|Populate with "EM" if /Member/physicalAddress/memberPhysicalAddress/emailAddress is present<br><br>Else<br><br>/enrollment/member/physicalAddress/memberPhysicalAddress/addressInfo/addressPhoneList/telephoneNumber/individualPhoneTypeCode/codeEntry|Depending on the number of  occurences of <telephoneNumber>, /codeEntry   needs to be mapped to PER03/05/07||||
|**128**|2100A _(rs=2)_|PER04 _(rs=2)_|Communication Number _(rs=2)_|Complete communications number including country or area code when<br>applicable _(rs=2)_|_(rs=2)_|Min-1   Max-256 _(rs=2)_|R _(rs=2)_|Enrollment/Member/physicalAddress/memberPhysicalAddress/emailAddress|If PER03 is  EM||||
|**129**|⬚|⬚|⬚|⬚|⬚|⬚|⬚|/enrollment/member/physicalAddress/memberPhysicalAddress/addressInfo/addressPhoneList/telephoneNumber/phoneAreaCode<br>/enrollment/member/physicalAddress/memberPhysicalAddress/addressInfo/addressPhoneList/telephoneNumber/phoneNumber|Depending on the number of  occurences of <telephoneNumber>, /phoneAreaCode+/phoneNumber   needs to be mapped to PER04/06/08||||
|**130**|2100A|PER05|Communication Number Qualifier|Code identifying the type of communication number|AP Alternate Telephone<br>BN Beeper Number<br>CP Cellular Phone<br>EM Electronic Mail<br>EX Telephone Extension<br>FX Facsimile<br>HP Home Phone Number<br>TE Telephone<br>WP Work Phone Number|Min-2   Max-2|S||||||
|**131**|2100A|PER06|Communication Number|Complete communications number including country or area code when<br>applicable||Min-1   Max-256|S||||||
|**132**|2100A|PER07|Communication Number Qualifier|Code identifying the type of communication number|AP Alternate Telephone<br>BN Beeper Number<br>CP Cellular Phone<br>EM Electronic Mail<br>EX Telephone Extension<br>FX Facsimile<br>HP Home Phone Number<br>TE Telephone<br>WP Work Phone Number|Min-2   Max-2|S||||||
|**133**|2100A|PER08|Communication Number|||Min-1   Max-256|S||||||
|**134**|2100A|N3|Members Street Address|Always send both N3 and N4 segments for address changes|||S||||||
|**135**|2100A|N301|Address Information|Address line 1 – input should be up to 35 characters||Min-1   Max-55|R|/enrollment/member/physicalAddress/memberPhysicalAddress/addressInfo/postalAddress/address|||||
|**136**|2100A|N302|Address Information|Address line 2 – input should be up to 35 characters||Min-1   Max-55|S|/enrollment/member/physicalAddress/memberPhysicalAddress/addressInfo/postalAddress/address2|||||
|**137**|2100A|N4|Members City, State, and Zip Code|Always send both N3 and N4 segments for address changes|||S||||||
|**138**|2100A|N401|City Name|Members city||Min-2   Max-30|R|/enrollment/member/physicalAddress/memberPhysicalAddress/addressInfo/postalAddress/cityName|||||
|**139**|2100A|N402|State or Province Code|Members state or province||Min-2   Max-2|S|/enrollment/member/physicalAddress/memberPhysicalAddress/addressInfo/postalAddress/stateCode|||||
|**140**|2100A|N403|Postal Code|Members zip code (no dashes)||Min-3   Max-15|S|Concatenate /enrollment/member/physicalAddress/memberPhysicalAddress/addressInfo/postalAddress/zipCode and /enrollment/member/physicalAddress/memberPhysicalAddress/addressInfo/postalAddress/zipExtensionCode|||||
|**141**|2100A|N404|Country Code|||Min-2   Max-3|S|/enrollment/member/physicalAddress/memberPhysicalAddress/addressInfo/postalAddress/countryCode|||||
|**142**|2100A|N405|Location Qualifier|Code identifying type of location|60 Area<br>CY County/Parish|Min-1   Max-2|S||Hardcode as 'CY'||||
|**143**|2100A|N406|Location Identifier|Indicates County Code||Min-1   Max-30|S|/enrollment/member/physicalAddress/memberPhysicalAddress/addressInfo/postalAddress/countyCode|||||
|**144**|2100A|N407|Country Subdivision Code|Code identifying the country subdivision||Min-1   Max-3|S||||||
|**145**|2100A|DMG|Member Demographics||||S||||||
|**146**|2100A|DMG01|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|D8 Date Expressed in Format CCYYMMDD|Min-2   Max-3|R||Hardcode as D8||||
|**147**|2100A|DMG02|Date Time Period|Member Birth Date|Members date of birth in the format of CCYYDDMM|Min-1   Max-35|R|/enrollment/member/individual/birthDate<br>|Convert to Format : CCYYMMDD||||
|**148**|2100A|DMG03|Gender Code|Code indicating the sex of the individual|F Female<br>M Male<br>U Unknown|Min-1   Max-1|R|/enrollment/member/individual/genderCode<br>|If /genderCode  is <br>Male - Populate as M<br>Female  - Populate as F <br>Unknown - Populate as U||||
|**149**|2100A|DMG04|Marital Status Code|Code defining the marital status of a person|B Registered Domestic Partner<br>D Divorced<br>I Single<br>M Married<br>R Unreported<br>S Separated<br>U Unmarried (Single or Divorced or Widowed)<br>1273 This code should be used if the previous status is<br>unknown.<br>W Widowed<br>X Legally Separated|Min-1   Max-1|S|/enrollment/member/individual/maritalStatusCode<br><br>|Conversion Logic:<br>If /maritalStatusCode  is <br>Divorced   - Populate as D,<br>Legally Separated- Populate as X <br>Married - Populate as M<br>Registered Domestic Partner  - Populate as B <br>Separated - Populate as S<br>Single - Populate as I, <br>Widowed - Populate as  W<br>Unmarried  Populate as  U<br>Unreported -  Populate as  R||||
|**150**|2100 A|DMG05|COMPOSITE RACE OR ETHNICITY INFORMATION|To send general and detailed information on race or ethnicity|||S||||||
|**151**|2100 A|DMG05 - 1|Race or Ethnicity Code|Code indicating the racial or ethnic background of a person; it is<br>normally self-reported; Under certain circumstances this information is<br>collected for United States Government statistical purposes|7 Not Provided<br>8 Not Applicable<br>A Asian or Pacific Islander<br>B Black<br>C Caucasian<br>D Subcontinent Asian American<br>E Other Race or Ethnicity<br>F Asian Pacific American<br>G Native American<br>H Hispanic<br>I American Indian or Alaskan Native<br>J Native Hawaiian<br>N Black (Non-Hispanic)<br>O White (Non-Hispanic)<br>P Pacific Islander<br>Z Mutually Defined|Min-1   Max-1|S|/enrollment/member/raceOrEthnicity/raceOrEthnicityCodes/codeEntry<br>|If /enrollment/member/raceOrEthnicity/raceOrEthnicityCodes/Codeset name = RaceOrEthnicityCode||From product standpoint - please refer convertional copy for the expected available values and map the correspomding enumeration values <br>and dont populate the segment if any other values comes||
|**152**|2100 A|DMG05 - 2|Code List Qualifier Code|Code identifying a specific industry code list|RET :Classification of Race or Ethnicity|Min-1   Max-3|S||||||
|**153**|2100 A|DMG05 - 3|Industry Code|Code indicating a code from a specific industry code list||Min-1   Max-30|S||||Implementation team can handle the  classification of Race and Ethinicity in the adaptor layer||
|**154**|2100A|DMG06|Citizenship Status Code|Code indicating citizenship status|1 U.S. Citizen<br>2 Non-Resident Alien<br>3 Resident Alien<br>4 Illegal Alien<br>5 Alien<br>6 U.S. Citizen - Non-Resident<br>7 U.S. Citizen - Resident|Min-1   Max-2|S|<br>/enrollment/member/individual/immigrationStatusCode/codeEntry <br>|/enrollment/member/individual/immigrationStatusCode/Codeset name as  ImmigrationStatus||||
|**155**|2100A|DMG10|Code List Qualifier Code|Code identifying a specific industry code list|REC Race or Ethnicity Collection Code|Min-1   Max-3|S||||||
|**156**|2100A|DMG11|Industry Code|Code indicating a code from a specific industry code list||Min-1   Max-30|S||||||
|**157**|2100A|EC|Employment Class||||S||||||
|**158**|2100A|EC01|Employment Class Code|Code indicating category of employee|01 Union<br>02 Non-Union<br>03 Executive<br>04 Non-Executive<br>05 Management<br>06 Non-Management<br>07 Hourly<br>08 Salaried<br>09 Administrative<br>10 Non-Administrative<br>11 Exempt<br>12 Non-Exempt<br>17 Highly Compensated<br>18 Key-Employee<br>19 Bargaining<br>20 Non-Bargaining<br>21 Owner<br>22 President<br>23 Vice President|Min-2   Max-3|R||||||
|**159**|2100A|EC02|Employment Class Code|Code indicating category of employee|01 Union<br>02 Non-Union<br>03 Executive<br>04 Non-Executive<br>05 Management<br>06 Non-Management<br>07 Hourly<br>08 Salaried<br>09 Administrative<br>10 Non-Administrative<br>11 Exempt<br>12 Non-Exempt<br>17 Highly Compensated<br>18 Key-Employee<br>19 Bargaining<br>20 Non-Bargaining<br>21 Owner<br>22 President<br>23 Vice President|Min-2   Max-3|S||||||
|**160**|2100A|EC03|Employment Class Code|Code indicating category of employee|01 Union<br>02 Non-Union<br>03 Executive<br>04 Non-Executive<br>05 Management<br>06 Non-Management<br>07 Hourly<br>08 Salaried<br>09 Administrative<br>10 Non-Administrative<br>11 Exempt<br>12 Non-Exempt<br>17 Highly Compensated<br>18 Key-Employee<br>19 Bargaining<br>20 Non-Bargaining<br>21 Owner<br>22 President<br>23 Vice President|Min-2   Max-3|S||||||
|**161**|2100A|ICM|Member Income||||S||||||
|**162**|2100A|ICM01|Frequency Code|Code indicating frequency or type of activities or actions being reported|1 Weekly<br>2 Biweekly<br>3 Semimonthly<br>4 Monthly<br>6 Daily<br>7 Annual<br>8 Two Calendar Months<br>9 Lump-Sum Separation Allowance<br>B Year-to-Date<br>C Single<br>H Hourly<br>Q Quarterly<br>S Semiannual<br>U Unknown|Min-1   Max-1|R||||||
|**163**|2100A|ICM02|Monetary Amount|Monetary amount||Min-1   Max-18|R||||||
|**164**|2100A|ICM03|Quantity|Numeric value of quantity||Min-1   Max-15|S||||||
|**165**|2100A|ICM04|Location Identifier|Code which identifies a specific location||Min-1   Max-30|S||||||
|**166**|2100A|ICM05|Salary Grade|The salary grade code assigned by the employer||Min-1   Max-5|S||||||
|**167**|2100A|AMT|Member Policy Amounts||||S||||||
|**168**|2100A|AMT01|Amount Qualifier Code|Code to qualify amount|B9 Co-insurance - Actual<br>C1 Co-Payment Amount<br>D2 Deductible Amount<br>EBA Expected Expenditure Amount<br>FK Other Unlisted Amount<br>P3 Premium Amount<br>R Spend Down|Min-1   Max-3|R||||||
|**169**|2100A|AMT02|Monetary Amount|Monetary amount||Min-1   Max-18|R||||||
|**170**|2100A|HLH|Member Health Information||||S||||||
|**171**|2100A|HLH01|Health-Related Cod|Code indicating a specific health situation|N None<br>S Substance Abuse<br>T Tobacco Use<br>U Unknown<br>X Tobacco Use and Substance Abuse|Min-1   Max-1|R|/enrollment/member/smokingStatus|If  /smokingStatus is, <br>Non Smoker - Populate N<br>Smoker - Populate S<br>Unknown - Populate U<br>||||
|**172**|2100A|HLH02|Height|Vertical dimension of an object measured when the object is in the upright position||Min-1   Max-8|S|/enrollment/member/physicalCharacteristics/heightInchesCount|||||
|**173**|2100A|HLH03|Weight|Numeric value of weight||Min-1   Max-10|S|/enrollment/member/physicalCharacteristics/weightPoundsCount|||||
|**174**|2100A|LUI|Member Language||||S||||||
|**175**|2100A|LUI01|Identification Code Qualifier|Code designating the system/method of code structure used for Identification Code (67)|LD: NISO Z39.53 Language Codes<br>LE: ISO 639 Language Codes|Min-1   Max-2|S||Hardcode as 'LE'||||
|**176**|2100A|LUI02|Identification Code|Code identifying a party or other code||Min-2   Max-80|S|<br>/enrollment/member/individual/languages/language/languageDomainCode/codeEntry|<br>If /enrollment/member/individual/languages/language/languageDomainCode/codeSetName  as 'LanguageDomain'||||
|**177**|2100A|LUI03|Description|A free-form description to clarify the related data elements and their content||Min-1   Max-80|S||||||
|**178**|2100A|LUI04|Language Indicator|Code indicating the use of a language|5 Language Reading<br>6 Language Writing<br>7 Language Speaking<br>8 Native Language|Min-1   Max-2|S|/enrollment/member/individual/languages/language/primaryLanguage<br>|If True ,Populate as 7||Upon receiving both primary and native language tags in the XML extract, ensure that both values are appropriately mapped into the corresponding segments of the EDI 834 transaction set||
|**179**||||||||/enrollment/member/individual/languages/language/nativeLanguage|If True ,Populate as 6||||
|**180**|2100A|LUI05|Language Proficiency||||||||||
|**181**|2100B|NM1|Incorrect Member Name||||S||||||
|**182**|2100B|NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|70 Prior Incorrect Insured|Min-2   Max-3|R||||||
|**183**|2100B|NM102|Entity Type Qualifier|Code qualifying the type of entity|1 Person|Min-1   Max-1|R||||||
|**184**|2100B|NM103|Name Last or Organization Name|ndividual last name or organizational name||Min-1   Max-60|R||||||
|**185**|2100B|NM104|Name First|Individual first name||Min-1   Max-35|S||||||
|**186**|2100B|NM105|Name Middle|Individual middle name or initia||Min-1   Max-25|S||||||
|**187**|2100B|NM106|Name Prefix|Prefix to individual name||Min-1   Max-10|S||||||
|**188**|2100B|NM107|Name Suffix|Suffix to individual name||Min-1   Max-10|S||||||
|**189**|2100B|NM108|Identification Code Qualifier|Code designating the system/method of code structure used for Identification<br>Code|34 Social Security Number<br>ZZ Mutually Defined|Min-1   Max-2|S||||||
|**190**|2100B|NM109|Identification Code|Code identifying a party or other code||Min-2   Max-80|S||||||
|**191**|2100B|DMG|Incorrect Member Demographics||||S||||||
|**192**|2100B|DMG01|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|D8 Date Expressed in Format CCYYMMDD|Min-2   Max-3|S||||||
|**193**|2100B|DMG02|Date Time Period|Member Birth Date|Members date of birth in the format of CCYYDDMM|Min-1   Max-35|S||||||
|**194**|2100B|DMG03|Gender Code|Code indicating the sex of the individual|F Female<br>M Male<br>U Unknown|Min-1   Max-1|S||||||
|**195**|2100B|DMG04|Marital Status Code|Code defining the marital status of a person|B Registered Domestic Partner<br>D Divorced<br>I Single<br>M Married<br>R Unreported<br>S Separated<br>U Unmarried (Single or Divorced or Widowed)<br>1273 This code should be used if the previous status is<br>unknown.<br>W Widowed<br>X Legally Separated|Min-1   Max-1|S||||||
|**196**|2100B|DMG05|COMPOSITE RACE OR ETHNICITY INFORMATION|To send general and detailed information on race or ethnicity|||S||||||
|**197**|2100B|DMG05 - 1|Race or Ethnicity Code|Code indicating the racial or ethnic background of a person; it is<br>normally self-reported; Under certain circumstances this information is<br>collected for United States Government statistical purposes|7 Not Provided<br>8 Not Applicable<br>A Asian or Pacific Islander<br>B Black<br>C Caucasian<br>D Subcontinent Asian American<br>E Other Race or Ethnicity<br>F Asian Pacific American<br>G Native American<br>H Hispanic<br>I American Indian or Alaskan Native<br>J Native Hawaiian<br>N Black (Non-Hispanic)<br>O White (Non-Hispanic)<br>P Pacific Islander<br>Z Mutually Defined|Min-1   Max-1|S||||||
|**198**|2100B|DMG05 - 2|Code List Qualifier Code|Code identifying a specific industry code list||Min-1   Max-3|S||||||
|**199**|2100B|DMG05 - 3|Industry Code|Code indicating a code from a specific industry code list||Min-1   Max-30|S||||||
|**200**|2100B|DMG06|Citizenship Status Code|Code indicating citizenship status|1 U.S. Citizen<br>2 Non-Resident Alien<br>3 Resident Alien<br>4 Illegal Alien<br>5 Alien<br>6 U.S. Citizen - Non-Resident<br>7 U.S. Citizen - Resident|Min-1   Max-2|S||||||
|**201**|2100B|DMG10|Code List Qualifier Code|Code identifying a specific industry code list|REC Race or Ethnicity Collection Code|Min-1   Max-3|S||||||
|**202**|2100B|DMG11|Industry Code|Code indicating a code from a specific industry code list||Min-1   Max-30|S||||||
|**203**|2100C|NM1|Member mailing address||||S||Transmitted only if the Member's Correspondence Address is present||||
|**204**|2100C|NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|31 Postal Mailing Address|Min-2   Max-3|R||Hardcode as '31'  If /enrollment/member/correspondenceAddress/postalAddress/address is present.||||
|**205**|2100C|NM102|Entity Type Qualifier|Code qualifying the type of entity|1 Person|Min-1   Max-1|R||Hardcode as '1'||||
|**206**|2100C|N3|Member mail street address||||R||||||
|**207**|2100C|N301|Address Information|Member Address Line||Min-1   Max-55|R|/enrollment/member/correspondenceAddress/postalAddress/address|||||
|**208**|2100C|N302|Address Information|Member Address Line 2||Min-1   Max-55|S|/enrollment/member/correspondenceAddress/postalAddress/address2|||||
|**209**|2100C|N4|Member mail,State,city ,zip code||||R||||||
|**210**|2100C|N401|City Name|Member City Name||Min-2   Max-30|R|/enrollment/member/correspondenceAddress/postalAddress/cityName|||||
|**211**|2100C|N402|State Code|Member State Code||Min-2   Max-2|S|/enrollment/member/correspondenceAddress/postalAddress/stateCode|||||
|**212**|2100C|N403|ZIP Code|Member ZIP Code||Min-3   Max-15|S|Concatenate /enrollment/member/correspondenceAddress/postalAddress/zipCode and /enrollment/member/correspondenceAddress/postalAddress/zipExtensionCode|||||
|**213**|2100C|N404|Country Code|Member Country Code||Min-2   Max-3|S||||||
|**214**|2100C|N407|Country Subdivision Code|Code identifying the country subdivision||Min-1   Max-3|S||||||
|**215**|2100D|NM1|Member Employer||||S||||||
|**216**|2100D|NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|36 Employer|Min-2   Max-3|R||||||
|**217**|2100D|NM102|Entity Type Qualifier|Code qualifying the type of entity|1 Person<br>2 Non-Person Entity|Min-1   Max-1|R||||||
|**218**|2100D|NM103|Name Last or Organization Name|ndividual last name or organizational name||Min-1   Max-60|S||||||
|**219**|2100D|NM104|Name First|Individual first name||Min-1   Max-35|S||||||
|**220**|2100D|NM105|Name Middle|Individual middle name or initia||Min-1   Max-25|S||||||
|**221**|2100D|NM106|Name Prefix|Prefix to individual name||Min-1   Max-10|S||||||
|**222**|2100D|NM107|Name Suffix|Suffix to individual name||Min-1   Max-10|S||||||
|**223**|2100D|NM108|Identification Code Qualifier|Code designating the system/method of code structure used for Identification<br>Code|24 Employer’s Identification Number<br>34 Social Security Number|Min-1   Max-2|S||||||
|**224**|2100D|NM109|Identification Code|Code identifying a party or other code||Min-2   Max-80|S||||||
|**225**|2100D|PER|Member Employer Communication Numbers||||S||||||
|**226**|2100D|PER01|Contact Function Code|Code identifying the major duty or responsibility of the person or group named|EP Employer Contact|Min-2   Max-2|R||||||
|**227**|2100D|PER02|Name|Free-form name||Min-1   Max-60|S||||||
|**228**|2100D|PER03|Communication Number Qualifier|Code identifying the type of communication number|AP Alternate Telephone<br>BN Beeper Number<br>CP Cellular Phone<br>EM Electronic Mail<br>EX Telephone Extension<br>FX Facsimile<br>HP Home Phone Number<br>TE Telephone<br>WP Work Phone Number|Min-2   Max-2|R||||||
|**229**|2100D|PER04|Communication Number|Complete communications number including country or area code when<br>applicable||Min-1   Max-256|R||||||
|**230**|2100D|PER05|Communication Number Qualifier|Code identifying the type of communication number|AP Alternate Telephone<br>BN Beeper Number<br>CP Cellular Phone<br>EM Electronic Mail<br>EX Telephone Extension<br>FX Facsimile<br>HP Home Phone Number<br>TE Telephone<br>WP Work Phone Number|Min-2   Max-2|S||||||
|**231**|2100D|PER06|Communication Number|Complete communications number including country or area code when<br>applicable||Min-1   Max-256|S||||||
|**232**|2100D|PER07|Communication Number Qualifier|Code identifying the type of communication number||Min-2   Max-2|S||||||
|**233**|2100D|PER08|Communication Number||AP Alternate Telephone<br>BN Beeper Number<br>CP Cellular Phone<br>EM Electronic Mail<br>EX Telephone Extension<br>FX Facsimile<br>HP Home Phone Number<br>TE Telephone<br>WP Work Phone Number|Min-1   Max-256|S||||||
|**234**|2100D|N3|Member Employeer Street Address||||S||||||
|**235**|2100D|N301|Address Information|Member Employeer Address Line||Min-1   Max-55|R||||||
|**236**|2100D|N302|Address Information|Member Employeer Address Line 2||Min-1   Max-55|S||||||
|**237**|2100D|N4|Member Employeer mail,State,city ,zip code||||S||||||
|**238**|2100D|N401|City Name|Member Employeer City Name||Min-2   Max-30|R||||||
|**239**|2100D|N402|State Code|Member Employeer State Code||Min-2   Max-2|S||||||
|**240**|2100D|N403|ZIP Code|Member Employeer ZIP Code||Min-3   Max-15|S||||||
|**241**|2100D|N404|Country Code|Member Employeer Country Code||Min-2   Max-3|S||||||
|**242**|2100D|N407|Country Subdivision Code|Member Employeer Country subdivision Code||Min-1   Max-3|S||||||
|**243**|2100E|NM1|Member School||||S||||||
|**244**|2100E|NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|36 Employer|Min-2   Max-3|R||||||
|**245**|2100E|NM102|Entity Type Qualifier|Code qualifying the type of entity|1 Person<br>2 Non-Person Entity|Min-1   Max-1|R||||||
|**246**|2100E|NM103|Name Last or Organization Name|ndividual last name or organizational name||Min-1   Max-60|R||||||
|**247**|2100E|PER|Member School Communication Numbers||||S||||||
|**248**|2100E|PER01|Contact Function Code|Code identifying the major duty or responsibility of the person or group named|EP Employer Contact|Min-2   Max-2|R||||||
|**249**|2100E|PER02|Name|Free-form name||Min-1   Max-60|S||||||
|**250**|2100E|PER03|Communication Number Qualifier|Code identifying the type of communication number|AP Alternate Telephone<br>BN Beeper Number<br>CP Cellular Phone<br>EM Electronic Mail<br>EX Telephone Extension<br>FX Facsimile<br>HP Home Phone Number<br>TE Telephone<br>WP Work Phone Number|Min-2   Max-2|R||||||
|**251**|2100E|PER04|Communication Number|Complete communications number including country or area code when<br>applicable||Min-1   Max-256|R||||||
|**252**|2100E|PER05|Communication Number Qualifier|Code identifying the type of communication number|AP Alternate Telephone<br>BN Beeper Number<br>CP Cellular Phone<br>EM Electronic Mail<br>EX Telephone Extension<br>FX Facsimile<br>HP Home Phone Number<br>TE Telephone<br>WP Work Phone Number|Min-2   Max-2|S||||||
|**253**|2100E|PER06|Communication Number|Complete communications number including country or area code when<br>applicable||Min-1   Max-256|S||||||
|**254**|2100E|PER07|Communication Number Qualifier|Code identifying the type of communication number||Min-2   Max-2|S||||||
|**255**|2100E|PER08|Communication Number||AP Alternate Telephone<br>BN Beeper Number<br>CP Cellular Phone<br>EM Electronic Mail<br>EX Telephone Extension<br>FX Facsimile<br>HP Home Phone Number<br>TE Telephone<br>WP Work Phone Number|Min-1   Max-256|S||||||
|**256**|2100E|N3|Member School Street Address||||S||||||
|**257**|2100E|N301|Address Information|Member Employeer Address Line||Min-1   Max-55|R||||||
|**258**|2100E|N302|Address Information|Member Employeer Address Line 2||Min-1   Max-55|S||||||
|**259**|2100E|N4|Member School,State,city ,zip code||||S||||||
|**260**|2100E|N401|City Name|Member Employeer City Name||Min-2   Max-30|R||||||
|**261**|2100E|N402|State Code|Member Employeer State Code||Min-2   Max-2|S||||||
|**262**|2100E|N403|ZIP Code|Member Employeer ZIP Code||Min-3   Max-15|S||||||
|**263**|2100E|N404|Country Code|Member Employeer Country Code||Min-2   Max-3|S||||||
|**264**|2100E|N407|Country Subdivision Code|Member Employeer Country subdivision Code||Min-1   Max-3|S||||||
|**265**|2100F|NM1|Custodial Parent||||S||Populate with the Custodial Parent Information (when available in HRP)<br>(Applicable only for Dependents)||||
|**266**|2100F|NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|S3 Custodial Parent|Min-2   Max-3|R||Hardcode as 'S3' If enrollment/member/otherResponsiblePersonInfo/responsibilityTypeCodeCode/codeSetName as "ResposibilityTypeCode <br>/enrollment/member/otherResponsiblePersonInfo/responsibilityTypeCodeCode/codeEntry as "1"||||
|**267**|2100F|NM102|Entity Type Qualifier|Code qualifying the type of entity|1 = Person|Min-1   Max-1|R||Hardcode as '1'||||
|**268**|2100F|NM103|Name Last or Organization Name|Custodial Parent Last Name||Min-1   Max-60|R|/enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsiblePersonName/lastName|||||
|**269**|2100F|NM104|Name First|Custodial Parent  First Name||Min-1   Max-35|R|/enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsiblePersonName/firstName|||||
|**270**|2100F|NM105|Name Middle|Custodial Parent Middle Name||Min-1   Max-25|S|/enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsiblePersonName/middleName|||||
|**271**|2100F|NM106|Name Prefix|Custodial Parent Name Prefix||Min-1   Max-10|S|/enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsiblePersonName/namePrefix|||||
|**272**|2100F|NM107|Name Suffix|Custodial Parent Name Suffix||Min-1   Max-10|S|/enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsiblePersonName/nameSuffixList/suffix|||||
|**273**|2100F|NM108|Identification Code Qualifier||34 Social Security Number<br>ZZ Mutually Defined|Min-1   Max-2|S||||||
|**274**|2100F|NM109|Subscriber Identifier|||Min-2   Max-80|S||||||
|**275**|2100F|PER|Custodial Parent  Communications Numbers||||S||||||
|**276**|2100F|PER01|Contact Function Code|Code identifying the major duty or responsibility of the person or group named|PQ Parent or Guardian|Min-2   Max-2|R||Hardcode as 'PQ"||||
|**277**|2100F|PER02|Name||||||Not used, leave blank||||
|**278**|2100F|PER03|Communication Number Qualifier|Code identifying the type of communication number|AP Alternate Telephone<br>BN Beeper Number<br>CP Cellular Phone<br>EM Electronic Mail<br>EX Telephone Extension<br>FX Facsimile<br>HP Home Phone Number<br>TE Telephone<br>WP Work Phone Number|Min-2   Max-2|R|Populate with "EM" if enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsiblePersonEmailAddress is present<br>Else<br>Populate  <br>enrollment/member/otherResponsiblePersonInfo/responsibleAddressInfo/addressPhoneList/telephoneNumber/individualPhoneTypeCode/codeEntry|Depending on the number of  occurences of <telephoneNumber>, /codeEntry   needs to be mapped to PER03/05/07||||
|**279**|2100F|PER04|Communication Number|Complete communications number including country or area code when<br>applicable||Min-1   Max-256|R|enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsiblePersonEmailAddress|If PER03 is  EM||||
|**280**||||||||Concatenate<br>enrollment/member/otherResponsiblePersonInfo/responsibleAddressInfo/addressPhoneList/telephoneNumber/phoneAreaCode<br>enrollment/member/otherResponsiblePersonInfo/responsibleAddressInfo/addressPhoneList/telephoneNumber/phoneNumber|Depending on the number of  occurences of <telephoneNumber>, /phoneAreaCode+/phoneNumber   needs to be mapped to PER04/06/08||||
|**281**|2100F|PER05|Communication Number Qualifier|Code identifying the type of communication number|AP Alternate Telephone<br>BN Beeper Number<br>CP Cellular Phone<br>EM Electronic Mail<br>EX Telephone Extension<br>FX Facsimile<br>HP Home Phone Number<br>TE Telephone<br>WP Work Phone Number|Min-2   Max-2|S||||||
|**282**|2100F|PER06|Communication Number|Complete communications number including country or area code when<br>applicable||Min-1   Max-256|S||||||
|**283**|2100F|PER07|Communication Number Qualifier|Code identifying the type of communication number|AP Alternate Telephone<br>BN Beeper Number<br>CP Cellular Phone<br>EM Electronic Mail<br>EX Telephone Extension<br>FX Facsimile<br>HP Home Phone Number<br>TE Telephone<br>WP Work Phone Number|Min-2   Max-2|S||||||
|**284**|2100F|PER08|Communication Number|Complete communications number including country or area code when<br>applicable||Min-1   Max-256|S||||||
|**285**|2100F|N3|Custodial Parent Street Address||||S||||||
|**286**|2100F|N301|Address Information|Address Line 1<br>Input should be up to 35 characters||Min-1   Max-55|R|/enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsibleAddressInfo/postalAddress/address|||||
|**287**|2100F|N302|Address Information|Address Line 2<br>Input should be up to 35 characters||Min-1   Max-55|S|/enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsibleAddressInfo/postalAddress/address2|||||
|**288**|2100F|N4|Custodial Parent City, State, and Zip Code||||S||||||
|**289**|2100F|N401|City Name|Custodial Parent City Name||Min-2   Max-30|R|/enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsibleAddressInfo/postalAddress/cityName|||||
|**290**|2100F|N402|State or Province Code|State||Min-2   Max-2|S|/enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsibleAddressInfo/postalAddress/stateCode|||||
|**291**|2100F|N403|Postal Code|Postal Code||Min-3   Max-15|S|cocatenate /enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsibleAddressInfo/postalAddress/zipExtensionCode and /enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsibleAddressInfo/postalAddress/zipCode|||||
|**292**|2100F|N404|Country Code|If Country Code Not Equal to USA, then populate element||Min-2   Max-3|S|/enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsibleAddressInfo/postalAddress/countryCode/countryCode|||||
|**293**|2100F|N407|Country Subdivision Code|Code identifying the country subdivision||Min-1   Max-3|S||||||
|**294**|2100G|NM1|Responsible Person||||S||||||
|**295**|2100G|NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|6Y Case Manager<br>9K Key Person<br>E1 Person or Other Entity Legally Responsible for a<br>Child<br>EI Executor of Estate<br>EXS Ex-spouse<br>GB Other Insured<br>GD Guardian<br>J6 Power of Attorney<br>LR Legal Representative<br>QD Responsible Party<br>S1 Parent<br>TZ Significant Other<br>X4 Spouse|Min-2   Max-3|R|/enrollment/member/otherResponsiblePersonInfo/responsibilityTypeCodeCode/codeEntry|If enrollment/member/otherResponsiblePersonInfo/responsibilityTypeCodeCode/codeSetName is  "ResposibilityTypeCode AND<br>/enrollment/member/otherResponsiblePersonInfo/responsibilityTypeCodeCode/codeEntry||From product standpoint it looks like only QD/GD is there in HRP.  <br>-Map 2100G only if the responsibilityTypeCodeCode/codeEntry  = GD/QD,<br>ELSE don't map this segment||
|**296**|2100G|NM102|Entity Type Qualifier|Code qualifying the type of entity|1 Person|Min-1   Max-1|R||1||||
|**297**|2100G|NM103|Name Last or Organization Name|Individual last name or organizational name||Min-1   Max-60|R|/enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsiblePersonName/lastName|||||
|**298**|2100G|NM104|Name First|Individual first name||Min-1   Max-35|S|/enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsiblePersonName/firstName|||||
|**299**|2100G|NM105|Name Middle|Individual middle name or initia||Min-1   Max-25|S|/enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsiblePersonName/middleName|||||
|**300**|2100G|NM106|Name Prefix|Prefix to individual name||Min-1   Max-10|S|/enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsiblePersonName/namePrefix|||||
|**301**|2100G|NM107|Name Suffix|Suffix to individual name||Min-1   Max-10|S|/enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsiblePersonName//nameSuffixList/suffix|||||
|**302**|2100G|NM108|Identification Code Qualifier||34 Social Security Number<br>ZZ Mutually Defined|Min-1   Max-2|S||||||
|**303**|2100G|NM109|Identification Code|Subscriber Identifier||Min-2   Max-80|S||||||
|**304**|2100G|PER|Responsible Person Communications Numbers||||S||||||
|**305**|2100G|PER01|Contact Function Code|Code identifying the major duty or responsibility of the person or group named<br>Parent or Guardian|RP Responsible Person|Min-2   Max-2|R||Hardcode as "RP'||||
|**306**|2100G|PER02|Name||||||Not used, leave blank||||
|**307**|2100G|PER03|Communication Number Qualifier|Code identifying the type of communication number|AP Alternate Telephone<br>BN Beeper Number<br>CP Cellular Phone<br>EM Electronic Mail<br>EX Telephone Extension<br>FX Facsimile<br>HP Home Phone Number<br>TE Telephone<br>WP Work Phone Number|Min-2   Max-2|R|Populate with "EM" if enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsiblePersonEmailAddress is present<br>Else<br>Populate  <br>enrollment/member/otherResponsiblePersonInfo/responsibleAddressInfo/addressPhoneList/telephoneNumber/individualPhoneTypeCode/codeEntry|Depending on the number of  occurences of <telephoneNumber>, /codeEntry   needs to be mapped to PER03/05/07||||
|**308**|2100G|PER04|Communication Number|||||enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsiblePersonEmailAddress|If PER03 is  EM||||
|**309**||||Complete communications number including country or area code when<br>applicable||Min-1   Max-256|R|Concatenate<br>enrollment/member/otherResponsiblePersonInfo/responsibleAddressInfo/addressPhoneList/telephoneNumber/phoneAreaCode<br>enrollment/member/otherResponsiblePersonInfo/responsibleAddressInfo/addressPhoneList/telephoneNumber/phoneNumber|Depending on the number of  occurences of <telephoneNumber>, /phoneAreaCode+/phoneNumber   needs to be mapped to PER04/06/08||||
|**310**|2100G|PER05|Communication Number Qualifier|Code identifying the type of communication number|AP Alternate Telephone<br>BN Beeper Number<br>CP Cellular Phone<br>EM Electronic Mail<br>EX Telephone Extension<br>FX Facsimile<br>HP Home Phone Number<br>TE Telephone<br>WP Work Phone Number|Min-2   Max-2|S||||||
|**311**|2100G|PER06|Communication Number|Complete communications number including country or area code when<br>applicable||Min-1   Max-256|S||||||
|**312**|2100G|PER07|Communication Number Qualifier|Code identifying the type of communication number|AP Alternate Telephone<br>BN Beeper Number<br>CP Cellular Phone<br>EM Electronic Mail<br>EX Telephone Extension<br>FX Facsimile<br>HP Home Phone Number<br>TE Telephone<br>WP Work Phone Number|Min-2   Max-2|S||||||
|**313**|2100G|PER08|Communication Number|Complete communications number including country or area code when<br>applicable||Min-1   Max-256|S||||||
|**314**|2100G|N3|Responsible Person Street Address|Always send both N3 and N4 segments for address changes|||S||||||
|**315**|2100G|N301|Address Information|Address Line 1<br>Input should be up to 35 characters||Min-1   Max-55|R|/enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsibleAddressInfo/postalAddress/address|||||
|**316**|2100G|N302|Address Information|Address Line 2<br>Input should be up to 35 characters||Min-1   Max-55|S|/enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsibleAddressInfo/postalAddress/address2|||||
|**317**|2100G|N4|Responsible Person City, State, and Zip Code||||S||||||
|**318**|2100G|N401|City Name|City Name||Min-2   Max-30|R|/enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsibleAddressInfo/postalAddress/cityName|||||
|**319**|2100G|N402|State or Province Code|State||Min-2   Max-2|S|/enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsibleAddressInfo/postalAddress/stateCode|||||
|**320**|2100G|N403|Postal Code|Postal Code||Min-3   Max-15|S|cocatenate /enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsibleAddressInfo/postalAddress/zipExtensionCode and /enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsibleAddressInfo/postalAddress/zipCode|||||
|**321**|2100G|N404|Country Code|If Country Code Not Equal to USA, then populate element||Min-2   Max-3|S|/enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsibleAddressInfo/postalAddress/countryCode/countryCode|||||
|**322**|2100G|N407|Country Subdivision Code|Code identifying the country subdivision||Min-1   Max-3|S||||||
|**323**|2100H|NM1|Drop Off Location||||S||||||
|**324**|2100H|NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|45 Drop-off Location|Min-2   Max-3|R||||||
|**325**|2100H|NM102|Entity Type Qualifier|Code qualifying the type of entity|1 Person|Min-1   Max-1|R||||||
|**326**|2100H|NM103|Name Last or Organization Name|Individual last name or organizational name||Min-1   Max-60|S||||||
|**327**|2100H|NM104|Name First|Individual first name||Min-1   Max-35|S||||||
|**328**|2100H|NM105|Name Middle|Individual middle name or initia||Min-1   Max-25|S||||||
|**329**|2100H|NM106|Name Prefix|Prefix to individual name||Min-1   Max-10|S||||||
|**330**|2100H|NM107|Name Suffix|Suffix to individual name||Min-1   Max-10|S||||||
|**331**|2100H|N3|Drop off location Street Address|Always send both N3 and N4 segments for address changes|||S||||||
|**332**|2100H|N301|Address Information|Address Line 1<br>Input should be up to 35 characters||Min-1   Max-55|R||||||
|**333**|2100H|N302|Address Information|Address Line 2<br>Input should be up to 35 characters||Min-1   Max-55|S||||||
|**334**|2100H|N4|Drop off location City, State, and Zip Code||||S||||||
|**335**|2100H|N401|City Name|City Name||Min-2   Max-30|R||||||
|**336**|2100H|N402|State or Province Code|State||Min-2   Max-2|S||||||
|**337**|2100H|N403|Postal Code|Postal Code||Min-3   Max-15|S||||||
|**338**|2100H|N404|Country Code|If Country Code Not Equal to USA, then populate element||Min-2   Max-3|S||||||
|**339**|2100H|N407|Country Subdivision Code|Code identifying the country subdivision||Min-1   Max-3|S||||||
|**340**|2200|DSB|Disability Information||||S||||||
|**341**|2200|DSB01|Disability Type Code|Code identifying the disability status of the individual|1 Short Term Disability<br>2 Long Term Disability<br>3 Permanent or Total Disability<br>4 No Disability|Min-1   Max-1|R||||||
|**342**|2200|DSB07|Product/Service ID Qualifier|Code identifying the type/source of the descriptive number used in<br>Product/Service|DX International Classification of Diseases, 9th<br>Revision, Clinical Modification (ICD-9-CM) -<br>Diagnosis<br><br>ZZ Mutually Defined|Min-2   Max-2|S||||||
|**343**|2200|DSB08|Medical Code Value|Code value for describing a medical condition or procedure||Min-1   Max-15|S||||||
|**344**||DTP|Disability Eligibility Dates||||S||||||
|**345**|2200|DTP01|Date/Time Qualifier|Code specifying type of date or time, or both date and time|360 Initial Disability Period Start<br>361 Initial Disability Period End|Min-3   Max-3|R||||||
|**346**|2200|DTP02|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|D8 Date Expressed in Format CCYYMMDD|Min-2   Max-3|R||||||
|**347**|2200|DTP03|Date Time Period|Expression of a date, a time, or range of dates, times or dates and times||Min-1   Max-35|R||||||
|**348**|2300|HD|Health Coverage||||S|This loop can occur multiple times. For each <planselection> tag, there should be one HD Loop|||||
|**349**|2300|HD01|Maintenance Type Code|Code identifying the specific type of item maintenance|001 Change<br>002 Delete<br>021 Addition<br>024 Cancellation or Termination<br>025 Reinstatement<br>026 Correction<br>030 Audit or Compare<br>032 Employee Information Not Applicable|Min-3   Max-3|R||Hardcode as '030'||||
|**350**|2300|HD03|Insurance Line Code|Code identifying a group of insurance products|AG Preventative Care/Wellness<br>AH 24 Hour Care<br>AJ Medicare Risk<br>AK Mental Health<br>DCP Dental Capitation<br>DEN Dental<br>EPO Exclusive Provider Organization<br>FAC Facility<br>HE Hearing<br>HLT Health<br>HMO Health Maintenance Organization<br>LTC Long-Term Care<br>LTD Long-Term Disability<br>MM Major Medical<br>MOD Mail Order Drug<br>PDG Prescription Drug<br>POS Point of Service<br>PPO Preferred Provider Organization<br>PRA Practitioners<br>STD Short-Term Disability<br>UR Utilization Review<br>VIS Vision|Min-2   Max-3|R||Hardcode  to "HLT"|Yes|From Product standpoint in current mapping is done for only Health plans <br>Implementation team can handle for vision / dental plans||
|**351**|2300|HD04|Plan Coverage Description|Code identifying a group of insurance products||Min-1   Max-50|S|/enrollment/member/planSelection/benefitPlanMatchData/benefitPlanName<br>||Yes|Benefitplanname information should be fetched from the BenefitPlan Xwalk (crosswalk) table. From a product standpoint, this can be handled in two ways at the adaptor layer, and the implementation team can choose one of the following approaches:<br>1. From product standpoint, after reversecrosswalk taking the parameter 1 and parameter 3 and mapped to  REF*CE and HD04 respectively. <br>- The lookup paramter will be appended with comma following the benefitplanname and then the parameter values can be mapped to respective target - handled in adaptor layer.<br>- Based on the implementation team the target may vary <br>2. Direct mapping can be done, value in the benefitPlanName can be mapped to HD04. - this will be handled in adaptor layer<br>||
|**352**|2300|HD05|Coverage Level Code|Code indicating the level of coverage being provided for this insured|CHD Children Only<br>DEP Dependents Only<br>E1D Employee and One Dependent<br>E2D Employee and Two Dependents<br>E3D Employee and Three Dependents<br>E5D Employee and One or More Dependents<br>E6D Employee and Two or More Dependents<br>E7D Employee and Three or More Dependents<br>E8D Employee and Four or More Dependents<br>E9D Employee and Five or More Dependents<br>ECH Employee and Children<br>EMP Employee Only<br>ESP Employee and Spouse<br>FAM Family<br>IND Individual<br>SPC Spouse and Children<br>SPO Spouse Only<br>TWO Two Party|Min-3   Max-3|S||||||
|**353**|2300|HD09|Yes/No Condition or Response Code|Code indicating a Yes or No condition or response||Min-1   Max-1|S||||||
|**354**|2300|DTP|Health Coverage Dates|This date could be an active, terminated or reinstated coverage for a past date or an future date|||R||||||
|**355**|2300|DTP01|Date Time Qualifier|348 - Being Date|300 Enrollment Signature Date<br>303 Maintenance Effective<br>343 Premium Paid to Date End<br>348 Benefit Begin<br>349 Benefit End<br>543 Last Premium Paid Date<br>695 Previous Period|Min-3   Max-3|R||Hardcode as 348 (Coverage Begin Date)||||
|**356**|2300|DTP02|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|D8 Date Expressed in Format CCYYMMDD<br>RD8 Range of Dates Expressed in Format CCYYMMDDCCYYMMDD|Min-2   Max-3|R||Hardcode  to "D8"||||
|**357**|2300|DTP03|Date Time Period|Coverage Period<br>Expression of a date, a time, or range of dates, times or dates and times||Min-1   Max-35|R|/enrollment/member/planSelection/startDate<br>|||||
|**358**|2300|DTP|Health Coverage Dates|This date could be an active, terminated or reinstated coverage for a past date or an future date|||R||||||
|**359**|2300|DTP01|Date Time Qualifier|349 - End Date||Min-3   Max-3|R||Hardcode as 349  If enrollment/member/planSelection/EndDate is present||||
|**360**|2300|DTP02|Date Time Period Format Qualifier|||Min-2   Max-3|R||Hardcode  to "D8"||||
|**361**|2300|DTP03|Coverage Period|||Min-1   Max-35|R|enrollment/member/planSelection/EndDate|||||
|**362**|2300|AMT|Health Coverage Policy||||S||||||
|**363**|2300|AMT01|Amount Qualifier Code|Code to qualify amount|B9 Co-insurance - Actual<br>C1 Co-Payment Amount<br>D2 Deductible Amount<br>EBA Expected Expenditure Amount<br>FK Other Unlisted Amount<br>P3 Premium Amount<br>R Spend Down|Min-1   Max-3|R||||||
|**364**|2300|AMT02|Monetary Amount|monetary amount||Min-1   Max-18|R||||||
|**365**|2300|REF|Health Coverage Policy Number||||S||||||
|**366**|2300|REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|17 Client Reporting Category<br>1L Group or Policy Number<br>9V Payment Category<br>CE Class of Contract Code<br>E8 Service Contract (Coverage) Number<br>M7 Medical Assistance Category<br>PID Program Identification Number<br>RB Rate code number<br>X9 Internal Control Number<br>XM Issuer Number<br>XX1 Special Program Code<br>XX2 Service Area Code<br>ZX County Code<br>ZZ Mutually Defined|Min-2   Max-3|R||||||
|**367**|2300|REF02|Reference Identification|||Min-1   Max-50|R||||||
|**368**|2300|REF|Prior Covergae Months||||S||||||
|**369**|2300|REF01|Reference Identification Qualifier||QQ Unit Number|Min-2   Max-3|R||||||
|**370**|2300|REF02|Reference Identification|||Min-1   Max-50|R||||||
|**371**|2300|IDC|Identification Card||||S||||||
|**372**|2300|IDC01|Plan Coverage Description|A description or number that identifies the plan or coverage||Min-1   Max-50|R||||||
|**373**|2300|IDC02|Identification Card Type Code|Code identifying the type of identification card|D Dental Insurance<br>H Health Insurance<br>P Prescription Drug Service Drug Insurance|Min-1   Max-1|R||||||
|**374**|2300|IDC03|Quantity|Numeric value of quantity||Min-1   Max-15|S||||||
|**375**|2300|IDC04|Action Code|Code indicating type of action|1 Add<br>2 Change (Update)<br>RX Replace|Min-1   Max-2|S||||||
|**376**|2310|LX|PROVIDER INFORMATION||||S||Do not populate this instance of the loop when the PCP NPI is "P00000000"||We need increment  the value +1 based on counter on every occurrence||
|**377**|2310|LX01|Assigned Number|Assined Number<br>This is a sequential number representing the number of loops for<br>this insured person. Begin with 1 for each insured person.||Min-1   Max-6|R||Hardcode as 1 when reporting PCP||||
|**378**|2310|NM1|PROVIDER NAME|It will be custom change for Implementation team,they can configure the qualifier based on UDT/Otherid<br><br>|||R||||||
|**379**|2310|NM101|Entity Identifier Code|<br>Code identifying an organizational entity, a physical location, property or an<br>individual|1X Laboratory<br>3D Obstetrics and Gynecology Facility<br>80 Hospital<br>FA Facility<br>OD Doctor of Optometry<br>P3 Primary Care Provider<br>QA Pharmacy<br>QN Dentist<br>Y2 Managed Care Organization|Min-2   Max-3|R||Harcode as "P3" if enrollment/member/providerSelections/providerSelection/providerRoleType = '1'||||
|**380**|2310|NM102|Entity Type Qualifier|Code qualifying the type of entity|1 Person<br>2 Non-Person Entity|Min-1   Max-1|R||Hardcode as 1 if <br>enrollment/member/providerSelections/providerSelection/providerDateRanges/providerMatch/practitioner/hccIdentificationNumber != " "<br><br>Hardcode as 2 if <br><br>enrollment/member/providerSelections/providerSelection/providerDateRanges/providerMatch/supplier/hccIdentificationNumber != " "||||
|**381**|2310|NM103|Provider Last Name|Individual last name or organizational /clinicname||Min-1   Max-60|S||||||
|**382**|2310|NM104|Provider First Name|Individual first name||Min-1   Max-35|S||||||
|**383**|2310|NM105|Provider Middle Name|Individual middle name or initia||Min-1   Max-25|S||||||
|**384**|2310|NM106|Provider Name Prefix|Individual middle name or initia||Min-1   Max-10|S||||||
|**385**|2310|NM107|Provider Name Suffix|||Min-1   Max-10|S||||||
|**386**|2310|NM108|ID Code Qualifier|34 Social Security Number<br>FI Federal Taxpayer’s Identification Number<br>SV Service Provider Number<br>XX Centers for Medicare and Medicaid Services<br>National Provider Identifier|34: SSN<br>FI: Federal Tax ID<br>SV: Service Provider Number(This is a number assigned by the payer used to identify a provider.)<br> XX: Centers for Medicare and Medicaid Services<br>National Provider Identifier|Min-1   Max-2|S||Hardcode as 'SV"||||
|**387**|2310 _(rs=2)_|NM109 _(rs=2)_|ID Code _(rs=2)_|Provider Identifier|_(rs=2)_|Min-2   Max-80|S|<br>//Practitioner<br>enrollment/member/providerSelections/providerSelection/providerDateRanges/providerMatch/practitioner/hccIdentificationNumber|||||
|**388**|⬚|⬚|⬚||⬚|||<br>//Supplier<br>enrollment/member/providerSelections/providerSelection/providerDateRanges/providerMatch/supplier/hccIdentificationNumber|||||
|**389**|2310|NM110|Entity Relationship Code|Code describing entity relationship|25 Established Patient<br>26 Not Established Patient<br>72 Unknown|Min-2   Max-2|R||Hardcode as "72"||||
|**390**|2310|N3|PROVIDER ADDRESS||||S||Populate when corresponding PCP address information is available in HRP||||
|**391**|2310|N301|Provider Address Line|Address line1||Min-1   Max-55|R||||||
|**392**|2310|N302|Provider Address Line|Address line2||Min-1   Max-55|S||||||
|**393**|2310|N4|PROVIDER CITY, STATE, ZIP CODE||||S||||||
|**394**|2310|N401|Provider City Name|Free-form text for city name||Min-2   Max-30|R||||||
|**395**|2310|N402|Provider State Code|Code (Standard State/Province) as defined by appropriate government agency||Min-2   Max-2|S||||||
|**396**|2310|N403|Provider ZIP Code|Code defining international postal zone code excluding punctuation and blanks<br>(zip code for United States)||Min-3   Max-15|S||||||
|**397**|2310|N404|Provider Country Code|Code identifying the country||Min-2   Max-3|S||||||
|**398**|2310|N407|Country Subdivision Code|Code identifying the country subdivision||Min-1   Max-3|S||||||
|**399**|2310|PER|PROVIDER COMMUNICATIONS NUMBERS||||S||||||
|**400**|2310|PER01|Contact Function Code|Code identifying the major duty or responsibility of the person or group named|IC = Information Contact|Min-2   Max-2|R||||||
|**401**|2310|PER03|Communication Number Qualifier|Code identifying the type of communication number|AP Alternate Telephone<br>BN Beeper Number<br>CP Cellular Phone<br>EM Electronic Mail<br>EX Telephone Extension<br>FX Facsimile<br>HP Home Phone Number<br>TE Telephone<br>WP Work Phone Number|Min-2   Max-2|R||||||
|**402**|2310|PER04|Communication Number|Code identifying the major duty or responsibility of the person or group named|IC = Information Contact|Min-1   Max-256|R||||||
|**403**|2310|PER05|Communication Number Qualifier|Code identifying the type of communication number|AP Alternate Telephone<br>BN Beeper Number<br>CP Cellular Phone<br>EM Electronic Mail<br>EX Telephone Extension<br>FX Facsimile<br>HP Home Phone Number<br>TE Telephone<br>WP Work Phone Number|Min-2   Max-2|S||||||
|**404**|2310|PER06|Communication Number|Code identifying the major duty or responsibility of the person or group named|IC = Information Contact|Min-1   Max-256|S||||||
|**405**|2310|PER07|Communication Number Qualifier|Code identifying the type of communication number|AP Alternate Telephone<br>BN Beeper Number<br>CP Cellular Phone<br>EM Electronic Mail<br>EX Telephone Extension<br>FX Facsimile<br>HP Home Phone Number<br>TE Telephone<br>WP Work Phone Number|Min-2   Max-2|S||||||
|**406**|2310|PER08|Communication Number||Complete communications number including country or area code when<br>applicable|Min-1   Max-256|S||||||
|**407**|2310|PLA|Provider Change Reason||||S||||||
|**408**|2310|PLA01|Action Code|Code indicating type of action|2 Change (Update)|Min-1   Max-2|R||||||
|**409**|2310|PLA02|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|1P Provider|Min-2   Max-3|R||||||
|**410**|2310|PLA03|Date|Date expressed as CCYYMMDD where CC represents the first two digits of the<br>calendar year<br>Provider Effective Date||Min-8   Max-8|R||||||
|**411**|2310|PLA05|Maintenance Reason Code|Maintenance Reason Code|14 Voluntary Withdrawal<br>22 Plan Change<br>46 Current Customer Information File in Error<br>AA Dissatisfaction with Office Staff<br>AB Dissatisfaction with Medical Care/Services Rendered<br>AC Inconvenient Office Location<br>AD Dissatisfaction with Office Hours<br>AE Unable to Schedule Appointments in a Timely<br>Manner<br>AF Dissatisfaction with Physician’s Referral Policy<br>AG Less Respect and Attention Time Given than to<br>Other Patients<br>AH Patient Moved to a New Location<br>AI No Reason Given<br>AJ Appointment Times not Met in a Timely Manner|Min-2   Max-3|R||||||
|**412**|2320|COB|COB-Coordination of Benefits||||S|COB mapping is currently not in product scope.|This loop occurs up to 5 times depending on number policies for the recipient and whether the coverage dates of the policy are current. If a client has >5 TPL spans, only the 5 most current spans will be used.||This loop should be mapped only on the 1st instance of the HD loop<br><br><br>||
|**413**|2320|COB01|Payer Responsibility Sequence Number Code|Code identifying the insurance carrier’s level of responsibility for a payment of a<br>claim<br>C|P Primary<br>S Secondary<br>T Tertiary<br>U Unknown|Min-1   Max-1|R|/enrollment/member/cobPolicy/dateRanges/responsibilitySequenceCode|<br>P=Primary, S=Secondary, U=Unknown||COB mapping is currently not in product scope.||
|**414**|2320|COB02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier<br>Member Group or Policy Number||Min-1   Max-50|S|enrollment/member/cobPolicy/groupNumber|||||
|**415**|2320|COB03|Coordination of Benefits Code|Code identifying whether there is a coordination of benefits|1 Coordination of Benefits<br>5 Unknown<br>6 No Coordination of Benefits|Min-1   Max-1|R||Always Hardcode it to "1" if <cobPolicy> is present||||
|**416**|2320|COB04|Service Type Code|Code identifying the classification of service|1 Medical Care<br>35 Dental Care<br>48 Hospital - Inpatient<br>50 Hospital - Outpatient<br>54 Long Term Care<br>89 Free Standing Prescription Drug<br>90 Mail Order Prescription Drug<br>A4 Psychiatric<br>AG Skilled Nursing Care<br>AL Vision (Optometry)<br>BB Partial Hospitalization (Psychiatric)|Min-1   Max-2|S||||||
|**417**|2320|REF|Additional Coordination of Benefits Identifiers||||S||||||
|**418**|2320|REF01|Reference Identification Qualifier|6P Group Number|60 Account Suffix Code<br>6P Group Number<br>SY Social Security Number<br>ZZ Mutually Defined|Min-2   Max-3|R||||||
|**419**|2320|REF02|Reference Identification|Member Group or Policy Number|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier|Min-1   Max-50|R||||||
|**420**|2320|DTP|Coordination of Benefits Eligibility Dates||||S||||||
|**421**|2320|DTP01|Date/Time Qualifier|Code specifying type of date or time, or both date and time|344 Coordination of Benefits Begin<br>345 Coordination of Benefits End|Min-3   Max-3|R||Populate with "344" if /enrollment/member/cobPolicy/dateRanges/startDate is present||||
|**422**|2320|DTP02|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|D8 Date Expressed in Format CCYYMMD|Min-2   Max-3|R||Hardcode  with "D8"  if enrollment/member/cobPolicy/dateRanges/startDate is present||||
|**423**|2320|DTP03|Date Time Period|Expression of a date, a time, or range of dates, times or dates and times<br>Coordination of Benefit Date||Min-1   Max-35|R|/enrollment/member/cobPolicy/dateRanges/startDate|||||
|**424**|2320|DTP|Coordination of Benefits Eligibility Dates||||S||Populate only when the Member's COB Eligibility End date is available||||
|**425**|2320|DTP01|Date/Time Qualifier|Code specifying type of date or time, or both date and time|344 Coordination of Benefits Begin<br>345 Coordination of Benefits End|Min-3   Max-3|R||Populate with "345" if enrollment/member/cobPolicy/dateRanges/endDate is present||||
|**426**|2320|DTP02|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|D8 Date Expressed in Format CCYYMMD|Min-2   Max-3|R||Hardcode  with "D8"  if enrollment/member/cobPolicy/dateRanges/endDate is present||||
|**427**|2320|DTP03|Date Time Period|Expression of a date, a time, or range of dates, times or dates and times<br>Coordination of Benefit Date||Min-1   Max-35|R|enrollment/member/cobPolicy/dateRanges/endDate|Populdated with the COB End Date||||
|**428**|2330|NM1|Coordination of Benefits Related Entity||||S||||||
|**429**|2330|NM101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|36 Employer<br>GW Group<br>IN Insurer|Min-2   Max-3|R||||||
|**430**|2330|NM102|Entity Type Qualifier|Code qualifying the type of entity|2 Non-Person Entity|Min-1   Max-1|R||||||
|**431**|2330|NM103|Member Last Name|Name Last or Organization Name||Min-1   Max-60|S||||||
|**432**|2330|NM108|ID Code Qualifier|Code designating the system/method of code structure used for Identification<br>Code|FI Federal Taxpayer’s Identification Number<br>NI National Association of Insurance Commissioners<br>(NAIC) Identification<br>XV Centers for Medicare and Medicaid Services PlanID|Min-1   Max-2|S||||||
|**433**|2330|NM109|Identification Code|Code identifying a party or other code||Min-2   Max-80|S||||||
|**434**|2330|N3|Coordination of Benefits Related Entity Address||||S||||||
|**435**|2330|N301|Address Line|Address Information||Min-1   Max-55|R||||||
|**436**|2330|N302|Address Line|Address Information||Min-1   Max-55|S||||||
|**437**|2330|N4|Coordination of benefits related entity other insurance company city,state,zipcode||||S||||||
|**438**|2330|N401|City Name|Free-form text for city name||Min-2   Max-30|R||||||
|**439**|2330|N402|State Code|Code (Standard State/Province) as defined by appropriate government agency||Min-2   Max-2|S||||||
|**440**|2330|N403|ZIP Code|Code defining international postal zone code excluding punctuation and blanks<br>(zip code for United States)||Min-3   Max-15|S||||||
|**441**|2330|N404|Country Code|Code identifying the country||Min-2   Max-3|S||||||
|**442**|2330|N407|Country Subdivision Code|Code identifying the country subdivision||Min-1   Max-3|S||||||
|**443**|2330|PER|Administrative Communications Contact||||S||||||
|**444**|2330|PER01|Contact Function Code|Code identifying the major duty or responsibility of the person or group named|CN General Contact|Min-2   Max-2|R||||||
|**445**|2330|PER03|Communication Number Qualifier|Code identifying the type of communication number|TE Telephone|Min-2   Max-2|R||||||
|**446**|2330|PER04|Communication Number|Complete communications number including country or area code when<br>applicable||Min-1   Max-256|R||||||
|**447**|2700|LS|Additional Reporting Categories||||S||||||
|**448**|2700|LS01|Loop Identifier Code|The loop ID number given on the transaction set diagram is the value for this data<br>element in segments LS and LE||Min-1   Max-4|R||||||
|**449**|2710|LX|Member reporting categories||||S||||||
|**450**|2710|LX01|Assigned Number|Number assigned for differentiation within a transaction set||Min-1   Max-6|R||||||
|**451**|2750|N1|Reporting Category||||S|From Product standpoint ,we are not currently dealing with the Reporting category. Instead, the implementation team will be responsible for making the necessary changes from their end without touching the core map.|||||
|**452**|2750|N101|Entity Identifier Code|Code identifying an organizational entity, a physical location, property or an<br>individual|75 Participant|Min-2   Max-3|R||||||
|**453**|2750|N102|Name|Free-form name||Min-1   Max-60|R||||||
|**454**|2750|REF|Reporting Category Reference||||S||||||
|**455**|2750|REF01|Reference Identification Qualifier|Code qualifying the Reference Identification|00 Contracting District Number<br>17 Client Reporting Category<br>18 Plan Number<br>19 Division Identifier<br>26 Union Number<br>3L Branch Identifier<br>6M Application Number<br>9V Payment Category<br>9X Account Category<br>GE Geographic Number<br>LU Location Number<br>PID Program Identification Number<br>XX1 Special Program Code<br>XX2 Service Area Code<br>YY Geographic Key<br>ZZ Mutually Defined|Min-2   Max-3|R||||||
|**456**|2750|REF02|Reference Identification|Reference information as defined for a particular Transaction Set or as specified<br>by the Reference Identification Qualifier||Min-1   Max-50|R||||||
|**457**|2750|DTP|Reporting Category Date||||S||||||
|**458**|2750|DTP01|Date/Time Qualifier|Code specifying type of date or time, or both date and time|007 Effective|Min-3   Max-3|R||||||
|**459**|2750|DTP02|Date Time Period Format Qualifier|Code indicating the date format, time format, or date and time format|D8 Date Expressed in Format CCYYMMDD<br>RD8 Range of Dates Expressed in Format CCYYMMDDCCYYMMDD|Min-2   Max-3|R||||||
|**460**|2750|DTP03|Date Time Period|Expression of a date, a time, or range of dates, times or dates and times||Min-1   Max-35|R||||||
|**461**|2000|LE|Additional Reporting Categories loop Termination||||S||||||
|**462**||LE01|Loop Identifier Code|The loop ID number given on the transaction set diagram is the value for this data<br>element in segments LS and LE||Min-1   Max-4|R||||||
|**463**|SE (Transaction Set Trailer) _(cs=3)_|⬚|⬚||||||||||
|**464**||SE|Transaction Set Trailer||||R||||||
|**465**||SE01|Number of Included Segments|The loop ID number given on the transaction set diagram is the value for this data<br>element in segments LS and LE||Min-1   Max-10|R||Total number of segments included in the transaction set including ST and SE segments||||
|**466**||SE02|Transaction Set Control Number|Identifying control number that must be unique within the transaction set<br>functional group assigned by the originator for a transaction set||Min-4   Max-9|R||ST02 and SE02 will be identical||||
|**467**|GE (Functional Group Trailer) _(cs=3)_|⬚|⬚||||||||||
|**468**||GE|Function Group Trailer||||||||||
|**469**||GE01|Number of Transaction Sets Included||||||Total number of transactions set included in the group or interchange||||
|**470**|_(rs=2)_|GE02 _(rs=2)_|Group Control Number _(rs=2)_||||||Submitter-specific number.||||
|**471**|⬚|⬚|⬚||||||GS06 and GE02 will be identical||||
|**472**|IEA (Interchange Control Trailer Segment) _(cs=3)_|⬚|⬚||||||||||
|**473**||IEA|Interchange Control Trailer||||||||||
|**474**||IEA01|Number of Included Functional Groups||||||Submitter-specific number.  A count of the number of functional groups||||
|**475**|_(rs=2)_|IEA02 _(rs=2)_|Interchange Control Number _(rs=2)_||||||Sender-specific control number.||||
|**476**|⬚|⬚|⬚||||||ISA12 and IEA02 will be identical||||
---
<a id="sheet-comparison-with-ib-and-ob"></a>
## Sheet: Comparison with IB and OB
|#|A|B|C|D|E|F|
|---|---|---|---|---|---|---|
|**2**|Enrollment 834 _(cs=6)_|⬚|⬚|⬚|⬚|⬚|
|**3**|Inbound _(cs=3)_|⬚|⬚|Outbound _(cs=3)_|⬚|⬚|
|**4**|1000A|N1|Sponsor Name|1000A|N1|Sponsor Name|
|**5**|1000B|N1|Payer|1000B|N1|Payer|
|**6**|1000C|N1|TPA/Broker Name|1000C|N1|TPA/Broker Name|
|**7**|2000|INS|Member Level Detail|2000|INS|Member Level Detail|
|**8**|2100A|NM1|Member Name|2100A|NM1|Member Name|
|**9**|2100B|NM1|Incorrect Member Name||||
|**10**|2100C|NM1|Member Mailing Address|2100C|NM1|Member Mailing Address|
|**11**|2100F|NM1|Custodial Parent|2100F|NM1|Custodial Parent|
|**12**|2100G|NM1|Responsible Person|2100G|NM1|Responsible Person|
|**13**|2200|DSB|Disability||||
|**14**|2200|DTP|Disability Eligibility Dates||||
|**15**|2300|HD|Health Coverage|2300|HD|Health Coverage|
|**16**|2310|LX|Provider Information|2310|LX|Provider Information|
|**17**|2320|COB|COB-Coordination of Benefits|2320|COB|COB-Coordination of Benefits|
|**18**|2330|NM1|Coordination of Benefits Related Entity|2330|NM1|Coordination of Benefits Related Entity|
|**19**|2700|LS|Additional Reporting Categories Loop||||
|**20**|2710|LX|Member Reporting Categories||||
|**21**|2750|N1|Reporting Category||||
---
<a id="sheet-conversion-copy"></a>
## Sheet: Conversion copy
|#|A|B|C|D|E|F|
|---|---|---|---|---|---|---|
|**1**|Individual Relationship Codes _(cs=2)_|⬚|Employment Status Code _(cs=2)_|⬚|Race Codes - 2100A.DMG05 - 1 _(cs=2)_|⬚|
|**2**|2000.INS02|Value in XML.|Value in XML|2000.INS08|Code|Description|
|**3**|01|Spouse|AC|AC|7|Not Provided|
|**4**|02|Father or Mother|AO|AO|8|Not Applicable|
|**5**|03|Grandmother or Grandfather|3|AU|A|Asian or Pacific Islander|
|**6**|04|Grandson or Granddaughter|1|FT|B|Black|
|**7**|05|Uncle or Aunt|6|L1|C|Caucasian|
|**8**|06|Nephew or Niece|2|PT|D|Subcontinent Asian American|
|**9**|07|Cousin|4|RT|E|Other Race or Ethnicity|
|**10**|08|Adopted Child|TE|TE|F|Asian Pacific American|
|**11**|10|Foster Child|||G|Native American|
|**12**|11|Son-in-law or Daughter-in-law|||H|Hispanic|
|**13**|12|Brother-in-law or Sister-in-law|||I|American Indian or Alaskan Native|
|**14**|13|Mother-in-law or Father-in-law|||J|Native Hawaiian|
|**15**|14|Brother or Sister|||N|Black (Non-Hispanic)|
|**16**|15|Ward|||O|White (Non-Hispanic)|
|**17**|16|Stepparent|||P|Pacific Islander|
|**18**|17|Stepson or Stepdaughter|||Z|Mutually Defined|
|**19**|18|Self|||||
|**20**|19|Child|||||
|**21**|23|Sponsored Dependent|||||
|**22**|24|Dependent of a Minor Dependent|||||
|**23**|25|Ex-spouse|||||
|**24**|26|Guardian|||||
|**25**|31|Court Appointed Guardian|||||
|**26**|38|Collateral Dependent|||||
|**27**|53|Life Partner|||||
|**28**|60|Annuitant|||||
|**29**|D2|Trustee|||||
|**30**|G8|Other Relationship|||||
|**31**|G9|Other Relative|||||
---
</file>