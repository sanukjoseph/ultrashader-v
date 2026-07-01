# Secondary Editing OB

## Secondary Editing OB/V26.1.0.0/EdifecsProduct_AuditProcessing_OB Secondary Editing_V2.0.xlsx — Cover Page

```csv
,OB Repricer Audit Processing -  EDIFECS,,,,,,,,,
,,,,,,,,,,
,Business Area: OB Secondary Editing,,,,,,,,,
,,,,,,,,,,
,This document provides the Mapping Specification for OB secondary editing (EDI 837I/P). Document is intended for EDIFECS Product Team,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,Version,,V26.1.0.0,,,
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

## Secondary Editing OB/V26.1.0.0/EdifecsProduct_AuditProcessing_OB Secondary Editing_V2.0.xlsx — JSON Mapping

```csv
Group,Fields,,Description
jobDetails,identifier,EXECUTION_IDENTIFIER,
,claimsDefinition,,
,sourceTypeIdentifier,REPRICER_NAME/EXTERNAL_EDITOR,
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

## Secondary Editing OB/V26.1.0.0/EdifecsProduct_AuditProcessing_OB Secondary Editing_V2.0.xlsx — Audit events

```csv
processStageName,processStatus,processMessage,JSON TRIGGER EVENT,Comments
EDIFECS-Conversion,PROCESSED,,After the XML conversion if it’s a success,
EDIFECS-Conversion,FAILURE,"Detailed Error details
(Err ID, ErrData, ErrSegment, ErrPath, ErrBrief) seprated by '||'.  Total error message length is 5000  with a max of 300 characters  recorded for  one error.",After the XML conversion if it’s a failure,
EDIFECS-Validation,SUCCESS,,"After the Validations, if it’s a good record",
EDIFECS-Validation,FAILURE,"Detailed Error details
(Err ID, ErrData, ErrSegment, ErrPath, ErrBrief) seprated by '||'.  Total error message length is 5000  with a max of 300 characters  recorded for  one error.","After the Validations, if it’s a bad record",
```

## Secondary Editing OB/V26.1.0.0/EdifecsProduct_MappingSpec_OB Secondary Editing_837_DFF_to_EDI Conversion_V1.0.xlsx — Cover Page

```csv
EDI OB Secondary Editing Mapping Specification- EDIFECS,,,,,,,,,
,,,,,,,,,
Business Area: Secondary Editing OB,,,,,,,,,
,,,,,,,,,
This document provides the Mapping Specification for EDI secondary editing  OB. Document is intended for EDIFECS Product Team,,,,,,,,,
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

## Secondary Editing OB/V26.1.0.0/EdifecsProduct_MappingSpec_OB Secondary Editing_837_DFF_to_EDI Conversion_V1.0.xlsx — Version History

```csv
Revision History,,,,
,,,,
,,,,
,,,,
V#,Date,Author,Reviewer(s)/ Contributor(s),Comments
```

## Secondary Editing OB/V26.1.0.0/EdifecsProduct_MappingSpec_OB Secondary Editing_837_DFF_to_EDI Conversion_V1.0.xlsx — 837P Mapping

```csv
Loop ID,EDI Segment,EDI Data Element Name,EDI Element Description,USAGE,Enumeration Values,Hardcode,Extract layout name,Position,Level,Mapping Logic,Comments,PIEDMONT,
ISA (Interchange Control Header),,,,,,,,,,,,Mapping Value,
,ISA,Segment: Interchange Control Header,,R,,,,,,,,,
,ISA01,Authorization Information Qualifier,Code identifying the type of information in the Authorization Information,R,"00 No Authorization Information Present (No Meaningful Information in I02)
03 Additional Data Identification","Hardcode as ""00""",,,,,,,
,ISA02,Authorization Information,Information used for additional identification or authorization of the interchange sender or the data in the interchange; the type of information is set by the Authorization Information Qualifier (I01),R,,Leave it blank,,,,,,,
,ISA03,Security Information Qualifier,Code identifying the type of information in the Security Information,R,"00 No Security Information Present (No Meaningful Information in I04)
01 Password","Hardcode as ""00""",,,,,,,
,ISA04,Security Information,This is used for identifying the security information about the interchange sender or the data in the interchange; the type of information is set by the Security Information Qualifier (I03),R,,Leave it blank,,,,,,,
,ISA05,Interchange ID Qualifier,Code indicating the system/method of code structure used to designate the sender or receiver ID element being qualified,R,"01 Duns (Dun & Bradstreet)
 14 Duns Plus Suffix
 20 Health Industry Number (HIN) CODE SOURCE 121: Health Industry Number
 27 Carrier Identification Number as assigned by Health Care Financing Administration (HCFA)
28 Fiscal Intermediary Identification Number as assigned by Health Care Financing Administration (HCFA)
29 Medicare Provider and Supplier Identification Number as assigned by Health Care Financing Administration (HCFA)
30 U.S. Federal Tax Identification Number
33 National Association of Insurance Commissioners Company Code (NAIC)
ZZ Mutually Defined","Hardcode as ""ZZ""",,,,,,,
,ISA06,Interchange Sender ID,Identification code published by the sender for other parties to use as the receiver ID to route data to them; the sender always codes this value in the sender ID element,R,,"We need to refer the crosswalk for mapping the sender id for products is ""PRODUCT""",,,,,Configurable value for Implementation team,ClaimServiceStronglyTypedOBResponseRoot/header/senderId,
,ISA07,Interchange ID Qualifier,Code indicating the system/method of code structure used to designate the sender or receiver ID element being qualified,R,"01 Duns (Dun & Bradstreet)
14 Duns Plus Suffix
20 Health Industry Number (HIN) CODE SOURCE 121: Health Industry Number
27 Carrier Identification Number as assigned by Health Care Financing Administration (HCFA)
28 Fiscal Intermediary Identification Number as assigned by Health Care Financing Administration (HCFA)
29 Medicare Provider and Supplier Identification Number as assigned by Health Care Financing Administration (HCFA)
30 U.S. Federal Tax Identification Number
33 National Association of Insurance Commissioners Company Code (NAIC)
ZZ Mutually Defined","Hardcode as ""ZZ""",,,,,,,
,ISA08,Interchange Receiver ID,"Identification code published by the receiver of the data; When sending, it is used by the sender as their sending ID, thus other parties sending to them will use this as a receiving ID to route data to them",R,,"Hardcode  <default value>
Hardcode  as ""123456789123456""",,,,,Configurable value for Implementation team,,
,ISA09,Interchange Date,Date of the interchange,R,,"Map this value from  current date in the format of ""YYMMDD""",,,,,,,
,ISA10,Interchange Time,Time of the interchange,R,,Map this value from   current time in the format of HHMM,,,,,,,
,ISA11,Repetition Separator,"Type is not applicable; the repetition separator is a delimiter and not a data element; this field provides the delimiter used to separate repeated occurrences of a simple data element or a composite data structure; this value must be different than the data element separator, component element separator, and the segment terminator",R,,"Hardcode as ""^""",,,,,,,
,ISA12,Interchange Control Version Number,Code specifying the version number of the interchange control segments,R,00501 Standards Approved for Publication by ASC X12 Procedures Review Board through October 2003,Hardcode as “00501”,,,,,,,
,ISA13,Interchange Control Number,A control number assigned by the interchange sender,R,,Unique ISA control number needs to generated in Edifecs for each 837 EDI file. It has to be 9 digits (for example -  000000764),,,,,,,
,ISA14,Acknowledgment Requested,Code indicating sender’s request for an interchange acknowledgment,R,"0 No Interchange Acknowledgment Requested
1 Interchange Acknowledgment Requested (TA1)","Hardcode as ""0""",,,,,,,
,ISA15,Interchange Usage Indicator,"Code indicating whether data enclosed by this interchange envelope is test, production or information",R,"P Production Data
T Test Data","""P""  if it is a Production region
""T""  if it is a Non-Production region",,,,,According to enviroinment it should be configurable,,
,ISA16,Component Element Separator,Type is not applicable; the component element separator is a delimiter and not a data element; this field provides the delimiter used to separate component data elements within a composite data structure; this value must be different than the data element separator and the segment terminator,R,,"Hardcode  as "":""",,,,,,,
GS (Functional Group Header),,,,,,,,,,,,,
,GS,Segment: Functional Group Header,,R,,,,,,,,,
,GS01,Functional Identifier Code,Code identifying a group of application related transaction sets,R,,Hardcode as “HC”,,,,,,,
,GS02,Application Sender's Code,Code identifying party sending transmission; codes agreed to by trading partners,R,,"We need to refer the crosswalk for mapping the sender id for products is ""PRODUCT""",,,,,Configurable value for Implementation team,,
,GS03,Application Receiver's Code,Code identifying party receiving transmission; codes agreed to by trading partners,R,,"Reveiver code for products is ""PRODUCT""",,,,,Configurable value for Implementation team,,
,GS04,Date,Date the Group Header is created.,R,,"Map this value from  current date in the format of ""YYYYMMDD""",,,,,,,
,GS05,Time,"Time expressed in 24-hour clock time as follows: HHMM, or HHMMSS, or HHMMSSD, or HHMMSSDD, where H = hours (00-23), M = minutes (00-59), S = integer seconds (00-59) and DD = decimal seconds; decimal seconds are expressed as follows: D = tenths (0-9) and DD = hundredths (00-99)",R,,"Map this value from   current Time in the format of ""HHMMSS""",,,,,,,
,GS06,Group Control Number,Assigned number originated and maintained by the sender,R,,Generate unique ID In EDIFECS (1-9 Bytes),,,,,,,
,GS07,Responsible Agency Code,Code identifying the issuer of the standard; this code is used in conjunction with Data Element 480,R,X : Accredited Standards Committee X12,"Hardcode as ""X""",,,,,,,
,GS08,Version / Release / Industry Identifier Code,"Code indicating the version, release, subrelease, and industry identifier of the EDI standard being used, including the GS and GE segments; if code in DE455 in GS segment is X, then in DE 480 positions 1-3 are the version number; positions 4-6 are the release and subrelease, level of the version; and positions 7-12 are the industry or trade association identifiers (optionally assigned by user); if code in DE455 in GS segment is T, then other formats are allowed",R,005010X222 Standards Approved for Publication by ASC X12 Procedures Review Board through October 2003,"Hardcode as ""005010X222A1""",,,,,,,
ST Transaction Set Header,,,,,,,,,,,,,
,ST,Segment: Transaction Set Header,,R,,,,,,,,,
,ST01,Transaction Set Identifier Code,Code uniquely identifying a Transaction Set,R,837 Health Care Claim,837,,,,,,,
,ST02,Transaction Set Control Number,Identifying control number that must be unique within the transaction set functional group assigned by the originator for a transaction set,R,,Unique control number needs to populated from process flow or map within a file,,,,,,,
,ST03,Implementation Convention Reference,Reference assigned to identify Implementation Convention,R,,005010X222A1,,,,,,,
BHT Beginning of Hierarchical Transaction,,,,,,,,,,,,,
,BHT,Segment: Beginning of Hierarchical Transaction,,R,,,,,,,,,
,BHT01,Hierarchical Structure Code,Code indicating the hierarchical application structure of a transaction set that utilizes the HL segment to define the structure of the transaction set,R,"0019- Information Source, Subscriber, Dependent",0019,,,,,,,
,BHT02,Transaction Set Purpose Code,Code identifying purpose of transaction set,R,"00 Original
18 Reissue","Hardcode as ""00""",,,,,,,
,BHT03,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,Auto Generate In EDIFECS.,,,,,,,
,BHT04,Date,Date expressed as CCYYMMDD where CC represents the first two digits of the calendar year,R,,"Map this value from  current date in the format of ""YYYYMMDD""",,,,,,,
,BHT05,Time,"Time expressed in 24-hour clock time as follows: HHMM, or HHMMSS, or HHMMSSD, or HHMMSSDD, where H = hours (00-23), M = minutes (00-59), S = integer seconds (00-59) and DD = decimal seconds; decimal seconds are expressed as follows: D = tenths (0-9) and DD = hundredths (00-99)",R,,"Map this value from   current Time in the format of ""HHMMSS""",,,,,,,
,BHT06,Transaction Type Code,Code specifying the type of transaction,R,"31 Subrogation Demand
CH Chargeable
RP Reporting","Hardcode as ""RP""",,,,,,,
LOOP 1000A - SUBMITTER,,,,,,,,,,,,,
1000A,NM1,Submitter Name (Required),,R,,,,,,,,,
1000A,1000A.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,41 Submitter,"Hardcode as ""41""",,,,,,,
1000A,1000A.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,"1 Person
2 Non-Person Entity","Hardcode as ""2""",,,,,,,
1000A,1000A.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,"""PRODUCT""",,,,,"Configurable value for Implementation team
PRODUCT",ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/payerInformation/hicName,
1000A,1000A.NM104,Name First,Individual first name,S,,,,,,,,,
1000A,1000A.NM105,Name Middle,Individual middle name or initial,S,,,,,,,,.,
1000A,1000A.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),R,46 Electronic Transmitter Identification Number (ETIN),"Hardcode as ""46""",,,,,,,
1000A,1000A.NM109,Identification Code,Code identifying a party or other code,R,,"Default values
<123456789123>",,,,,"Configurable value for Implementation team
updated default values",ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/payerInformation/taxId,
1000A,PER,Submitter EDI Contact Name (Required),,R,,,,,,,,,
1000A,1000A.PER01,Contact Function Code,Code identifying the major duty or responsibility of the person or group named,R,IC Information Contact,"Hardcode  as ""IC""",,,,,,,
1000A,1000A.PER02,Name,Free-form name,R,,"""PRODUCT""",,,,,Configurable value for Implementation team,"Qn, 05/20 - what needs to be populated here for Piedmont?",
1000A,1000A.PER03,Communication Number Qualifier,Code identifying the type of communication number,R,"EM Electronic Mail
FX Facsimile
TE Telephone","Hardcode  as ""TE""",,,,,,,
1000A,1000A.PER04,Communication Number,Complete communications number including country or area code when applicable,R,,"Hardcode as ""1234567890""",,,,,"Configurable value for Implementation team
updated default values","Qn, 05/20 -What will be the contact number for Piedmont?",
1000A,1000A.PER05,Communication Number Qualifier,Code identifying the type of communication number,S,"EM Electronic Mail
EX Telephone Extension
FX Facsimile
TE Telephone
TE Telephone",,,,,,,,
1000A,1000A.PER06,Communication Number,Complete communications number including country or area code when applicable,S,,,,,,,,,
1000A,1000A.PER07,Communication Number Qualifier,Code identifying the type of communication number,S,"EM Electronic Mail
 EX Telephone Extension
FX Facsimile
TE Telephone",,,,,,,,
1000A,1000A.PER08,Communication Number,Complete communications number including country or area code when applicable,S,,,,,,,,,
LOOP 1000B - RECEIVER,,,,,,,,,,,,,
1000B,NM1,NM1 Receiver Name (Required),,R,,,,,,,,,
1000B,1000B.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,40 Receiver,"Hardcode as ""40""",,,,,,,
1000B,1000B.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,2 Non-Person Entity,"Hardcode as ""2""",,,,,,,
1000B,1000B.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,REPRICER_NAME/EXTERNAL_EDITOR,515,Line,Map from first line,,"Qn, 05/20- If we can get the Receiver ID for First health and Aetna, EDIFECS can populate the Org name here. So need to get the Full name to be populated for both and Receiver id's
Details for First Health seems as below. Needs to get for Aetna also
Org Name: FIRST HEALTH Group Corp
Receiver id: 201736437",
1000B,1000B.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),R,46 Electronic Transmitter Identification Number (ETIN),"Hardcode as ""46""",,,,,,,
1000B,1000B.NM109,Identification Code,Code identifying a party or other code,R,,"Default values
<123456789123>",,,,,configurable item need to update (based on repricer name,,
LOOP 2000A - BILLING PROVIDER HL LOOP,,,,,,,,,,,,,
2000A,HL,Billing Provider Hierarchical Level (Required),,,,,,,,,,,
2000A,2000A.HL01,Hierarchical ID Number,,,,Generated by Edifecs,,,,,,,
2000A,2000A.HL03,Hierarchical Level Code,,,20 Information Source,"Hardcode as ""20""",,,,,,,
2000A,2000A.HL04,Hierarchical Child Code,,,"1 Additional Subordinate HL Data Segment in This
Hierarchical Structure",Generated by Edifecs,,,,,,,
2000A,PRV,Billing Provider Speciality Information,,,,,,,,,,,
2000A,2000A.PRV01,Provider Code,,,BI Billing,,,,,,,,
2000A,2000A.PRV02,Reference Identification Qualifier,,,PXC Health Care Provider Taxonomy Code,,,,,,,,
2000A,2000A.PRV03,Reference Identification,,,,,,,,,,,
2000A,CUR,Foreign Currency Information,,,,,,,,,,,
2000A,2000A.CUR01,Entity Identifier Code,,,85 Billing Provider,,,,,,,,
2000A,2000A.CUR02,Currency Code,,,,,,,,,,,
LOOP 2010AA - BILLING PROVIDER,,,,,,,,,,,,,
2010AA,NM1,Billing Provider Name (Required),,R,,,,,,Map this loop from first line,,,
2010AA,2010AA.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,85 Billing Provider,"Hardcode as ""85""",,,,,,,
2010AA,2010AA.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,"1 Person
2 Non-Person Entit",,BILLING_ENTITY_TYPE,112,Line,"If  BILLING_ENTITY_TYPE = P, map 1
If  BILLING_ENTITY_TYPE = E, map 2",,,
2010AA,2010AA.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,BILLING_LAST_NAME,113,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/supplierInformation/supplierBillingName,
2010AA,2010AA.NM104,Name First,ndividual first name,S,,,BILLING_FIRST_NAME,114,Line,Map only if BILLING_ENTITY_TYPE = P,,,
2010AA,2010AA.NM105,Name Middle,Individual middle name or initial,S,,,BILLING_MIDDLE_NAME,115,Line,Map only if BILLING_ENTITY_TYPE = P,,,
2010AA,2010AA.NM107,Name Suffix,Suffix to individual name,S,,,BILLING_NAME_SUFFIX,116,Line,Map only if BILLING_ENTITY_TYPE = P,,,
2010AA,2010AA.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),S,XX Centers for Medicare and Medicaid Services National Provider Identifier,"Hardcode as ""XX""",,,,,,,
2010AA,2010AA.NM109,Identification Code,Code identifying a party or other code,S,,,BILLING_NPI,107,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/supplierInformation/npi,
2010AA,N3,Billing Provider Address (Required),,R,,,,,,,,,
2010AA,2010AA.N301,Address Information,Address information,R,,,BILLING_ADDRESS_01,117,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/supplierInformation/address/address,
2010AA,2010AA.N302,Address Information,Address information,S,,,BILLING_ADDRESS_02,118,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/supplierInformation/address/address2,
2010AA,N4,"Billing Provider City, State, ZIP Code (Required)",,R,,,,,,,,,
2010AA,2010AA.N401,City Name,Free-form text for city name,R,,,BILLING_CITY,119,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/supplierInformation/address/city,
2010AA,2010AA.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,BILLING_STATE,120,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/supplierInformation/address/stateCode,
2010AA,2010AA.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,,(BILLING_ZIP) + (BILLING_ZIP_PLUS_FOUR),122,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/supplierInformation/address/zipCode + ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/supplierInformation/address/zipExtension,
2010AA,2010AA.N404,Country Code,Code identifying the country,S,,,,123,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/supplierInformation/address/countryCode,
2010AA,2010AA.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,,,,
2010AA,REF,Billing Provider Tax Identification (Required),,R,,,,,,,,,
2010AA,2010AA.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"EI Employer’s Identification Number
SY Social Security Number","Hardcode as ""EI""",,,,,,,
2010AA,2010AA.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,BILLING_TAXGROUP_ID,106,Line,Remove hypens ( ‘XX-XXXXXXX’ format),,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/supplierInformation/taxIdentificationNumber,
2010AA,REF,Billing Provider UPIN/License Information,,S,,,,,,,,,
2010AA,2010AA.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B State License Number
1G Provider UPIN Number","Hardcode as ""EI""",,,,only if BILLING_STATE_LICENSE has values,,,
2010AA,2010AA.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,BILLING_STATE_LICENSE,105,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/supplierInformation/supplierPINNumber,
2010AA,PER,Billing Provider Contact Information,,S,,,,,,,,,
2010AA,2010AA.PER01,Contact Function Code,Code identifying the major duty or responsibility of the person or group named,R,IC Information Contact,"Hardcode as ""IC""",,,,,,,
2010AA,2010AA.PER02,Name,Free-form name,S,,,,,,,,,
2010AA,2010AA.PER03,Communication Number Qualifier,Code identifying the type of communication number,R,"EM Electronic Mail
FX Facsimile
TE Telephone","Hardcode as ""TE""",,,,Only if   BILLING_PHONE is having values.,BILLING_PHONE in DFF should contain 10 byte phone number including area code.,,
2010AA,2010AA.PER04,Communication Number,Complete communications number including country or area code when applicable,R,,BILLING_PHONE,BILLING_PHONE,127,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/supplierInformation/telephoneNumber,
2010AA,2010AA.PER05,Communication Number Qualifier,Code identifying the type of communication number,S,"EM Electronic Mail
EX Telephone Extension
FX Facsimile
TE Telephone","Hardcode as ""EX""",,,,Only if   BILLING_PHONE_EXT is having values.,,,
2010AA,2010AA.PER06,Communication Number,Complete communications number including country or area code when applicable,S,,BILLING_PHONE_EXT,BILLING_PHONE_EXT,128,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/supplierInformation/faxNumber,
2010AA,2010AA.PER07,Communication Number Qualifier,Code identifying the type of communication number,S,"EM Electronic Mail
EX Telephone Extension
FX Facsimile
TE Telephone","Hardcode as ""FX""",,,,"Only if   BILLING_FAX is having values.

If BILLING_PHONE is not present, this should be mapped in PER03/PER04

If BILLING_PHONE is  present, and BILLING_PHONE_EXT not present, this should be mapped in PER05/PER06",,,
2010AA,2010AA.PER08,Communication Number,Complete communications number including country or area code when applicable,S,,BILLING_FAX,BILLING_FAX,133,Line,,,,
LOOP 2010AB - PAY-TO PROVIDER,,,,,,,,,,,,,
2010AB,NM1,Pay-to Address -Name (Required),,S,,,Map this loop only if PAY_TO_ADDRESS_01 of First line has values,,,,,,
2010AB,2010AB.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,87 Pay-to Provider,"Hardcode as ""87""",,,,,,,
2010AB,2010AB.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,"1 Person
2 Non-Person Entity","Hardcode as ""2""",,,,,,,
2010AB,N3,Pay-to Address - ADDRESS (Required),,R,,,,,,,,,
2010AB,2010AB.N301,Address Information,Address information,R,,,PAY_TO_ADDRESS_01,272,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/payToAddress/address,
2010AB,2010AB.N302,Address Information,Address information,S,,,PAY_TO_ADDRESS_02,273,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/payToAddress/address2,
2010AB,N4,"Pay-To Address City, State, ZIP Code (Required)",,R,,,,,,,,,
2010AB,2010AB.N401,City Name,Free-form text for city name,R,,,PAY_TO_CITY,274,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/payToAddress/city,
2010AB,2010AB.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,PAY_TO_STATE,275,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/payToAddress/stateCode,
2010AB,2010AB.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,,(PAY_TO_ZIP) + (PAY_TO_ZIP_PLUS_FOUR),276 + 277,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/payToAddress/zipCode + ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/payToAddress/zipExtension,
2010AB,2010AB.N404,Country Code,Code identifying the country,S,,Leave it blank,,,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/payToAddress/countryCode,
2010AB,2010AB.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,,,,
LOOP 2010AC - PAY-TO PLAN NAME,,,,,,,,,,,,,
2010AC,NM1,"Pay-To Address City, State, ZIP Code (Required)",,S,,,,,,,,,
2010AC,2010AC.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,PE Payee,,,,,,,,
2010AC,2010AC.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,2 Non-Person Entity,,,,,,,,
2010AC,2010AC.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,,,,,,,
2010AC,2010AC.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),R,"PI Payor Identification
XV Centers for Medicare and Medicaid Services PlanID",,,,,,,,
2010AC,2010AC.NM109,Identification Code,Code identifying a party or other code,R,,,,,,,,,
2010AC,N3,Pay-to Plan Address (Required),,R,,,,,,,,,
2010AC,2010AC.N301,Address Information,Address information,R,,,,,,,,,
2010AC,2010AC.N302,Address Information,Address information,S,,,,,,,,,
2010AC,N4,"Pay-To Plan City, State, ZIP Code (Required)",,,,,,,,,,,
2010AC,2010AC.N401,City Name,,,,,,,,,,,
2010AC,2010AC.N402,State or Province Code,,,,,,,,,,,
2010AC,2010AC.N403,Postal Code,,,,,,,,,,,
2010AC,2010AC.N404,Country Code,,,,,,,,,,,
2010AC,2010AC.N407,Country Subdivision Code,,,,,,,,,,,
2010AC,REF,Pay-to Plan Secondary Identification,,,,,,,,,,,
2010AC,2010AC.REF01,Reference Identification Qualifier,,,"2U Payer Identification Number
FY Claim Office Number
NF National Association of Insurance Commissioners
(NAIC) Code",,,,,,,,
2010AC,2010AC.REF02,Reference Identification,,,,,,,,,,,
2010AC,REF,Pay-To Plan Tax Identification Number (Required),,,,,,,,,,,
2010AC,2010AC.REF01,Reference Identification Qualifier,,,EI Employer’s Identification Number,,,,,,,,
2010AC,2010AC.REF02,Reference Identification,,,,,,,,,,,
"LOOP 2000B - SUBSCRIBER HIERARCHICAL
LEVEL",,,,,,,,,,,,,
2000B,HL,Subscriber Hierarchical Level (Required),,,,,,,,,,,
2000B,2000B.HL01,Hierarchical ID Number,,,,Generated by Edifecs,,,,,,,
2000B,2000B.HL02,Hierarchical Parent ID Number,,,,2000A.HL01,,,,,,,
2000B,2000B.HL03,Hierarchical Level Code,,,22 Subscriber,"Hardcode as ""22""",,,,,,,
2000B,2000B.HL04,Hierarchical Child Code,,,"0 No Subordinate HL Segment in This Hierarchical
Structure.
1 Additional Subordinate HL Data Segment in This
Hierarchical Structure.",Generated by Edifecs,,,,,,,
2000B,SBR,Subscriber Information (Required),,R,,,,,,,,,
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
U Unknown","Hardcode as ""P""",,,,,,,
2000B,2000B.SBR02,Individual Relationship Code,Code indicating the relationship between two individuals or entities,S,18 Self,"Hardcode as ""18"" Only if RELATIONSHIP_TO_SUB = Self",,,,,,,
2000B,2000B.SBR03,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,S,,,"CLAIM_SI_MEB_SUB_FACT
SI_MEMBER_GROUP_NUMBER",503,Claim,,,"AETNA:
ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/subscriptionInformation/groupNumber
if group number is '10302', then pass PDCNTRASF. Pass 'PEDMNT' for all other self Insured groups
FirstHealth:
Pass Acro ID's here",
2000B,2000B.SBR04,Name,Free-form name,S,,,,,,,,,
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
Primary",,,,,,,,
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
ZZ Mutually Defined",,SUB_CLAIM_FILING_CODE,242,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/baseBenefitPlan/product/planType,
2000B,PAT,Patient Information,,,,,,,,,,,
2000B,2000B.PAT05,Date Time Period Format Qualifier,,,D8 Date Expressed in Format CCYYMMDD,,,,,,,,
2000B,2000B.PAT06,Date Time Period,,,,,,,,,,,
2000B,2000B.PAT07,Unit or Basis for Measurement Code,,,01 Actual Pounds,,,,,,,,
2000B,2000B.PAT08,Weight,,,,,,,,,,,
2000B,2000B.PAT09,Yes/No Condition or Response Code,,,Y Yes,,,,,,,,
LOOP 2010BA - SUBSCRIBER NAME,,,,,,,,,,,,,
2010BA,NM1,Subscriber Name (Required),,R,,,,,,,,,
2010BA,2010BA.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,IL Insured or Subscriber,"Hardcode as ""IL""",,,,,,,
2010BA,2010BA.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,"1 Person
2 Non-Person Entity","Hardcode as ""1""",,,,,,,
2010BA,2010BA.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,SUB_LAST_NAME,243,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/subscriberInformation/individual/lastName,
2010BA,2010BA.NM104,Name First,Individual first name,S,,,SUB_FIRST_NAME,244,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/subscriberInformation/individual/firstName,
2010BA,2010BA.NM105,Name Middle,Individual middle name or initial,S,,,SUB_MIDDLE_NAME,245,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/subscriberInformation/individual/middleName,
2010BA,2010BA.NM107,Name Suffix,Suffix to individual name,SS,,,SUB_NAME_SUFFIX,246,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/subscriberInformation/individual/nameSuffix,
2010BA,2010BA.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),R,"II Standard Unique Health Identifier for each Individual
in the United States
MI Member Identification Number","Hardcode as ""MI""",,,,,,,
2010BA,2010BA.NM109,Identification Code,Code identifying a party or other code,R,,,SUB_ID,3,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/subscriptionInformation/hccId,
2010BA,N3,Subscriber Address,,S,,,,,,,,,
2010BA,2010BA.N301,Address Information,Address information,R,,,SUB_ADDRESS_01,247,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/subscriptionInformation/correspondenceAddress/address,
2010BA,2010BA.N302,Address Information,Address information,S,,,SUB_ADDDRESS_02,248,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/subscriptionInformation/correspondenceAddress/address2,
2010BA,N4,"Subscriber City, State, ZIP Code",,R,,,,,,,,,
2010BA,2010BA.N401,City Name,Free-form text for city name,R,,,SUB_CITY,249,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/subscriptionInformation/correspondenceAddress/city,
2010BA,2010BA.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,SUB_STATE,250,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/subscriptionInformation/correspondenceAddress/stateCode,
2010BA,2010BA.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,,(SUB_ZIP) + ( SUB_ZIP_PLUS_FOUR),251 + 252,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/subscriptionInformation/correspondenceAddress/zipCode + ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/subscriptionInformation/correspondenceAddress/zipExtension,
2010BA,2010BA.N404,Country Code,Code identifying the country,S,,,,,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/subscriptionInformation/correspondenceAddress/countryCode,
2010BA,2010BA.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,,,,
2010BA,DMG,Subscriber Demographic Information,,S,,,,,,,,,
2010BA,2010BA.DMG01,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2010BA,2010BA.DMG02,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,SUB_DOB,255,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/subscriptionInformation/subscriber/birthdate,
2010BA,2010BA.DMG03,Gender Code,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,"F Female
M Male
U Unknown",,SUB_GENDER_ID,256,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/subscriptionInformation/subscriber/genderCode,
2010BA,REF,Subscriber Secondary Identification,,,,,,,,,,,
2010BA,2010BA.REF01,Reference Identification Qualifier,,,SY Social Security Number,,,,,,,,
2010BA,2010BA.REF02,Reference Identification,,,,,,,,,,,
2010BA,REF,Property and Casualty Claim Number,,,,,,,,,,,
2010BA,2010BA.REF01,Reference Identification Qualifier,,,Y4 Agency Claim Number,,,,,,,,
2010BA,2010BA.REF02,Reference Identification,,,,,,,,,,,
2010BA,PER,Property and Casualty Subscriber Contact Information,,,,,,,,,,,
2010BA,2010BA.PER01,Contact Function Code,,,IC Information Contact,,,,,,,,
2010BA,2010BA.PER02,Name,,,,,,,,,,,
2010BA,2010BA.PER03,Communication Number Qualifier,,,TE Telephone,,,,,,,,
2010BA,2010BA.PER04,Communication Number,,,,,,,,,,,
2010BA,2010BA.PER05,Communication Number Qualifier,,,EX Telephone Extension,,,,,,,,
2010BA,2010BA.PER06,Communication Number,,,,,,,,,,,
LOOP 2010BB - PAYER NAME,,,,,,,,,,,,,
2010BB,NM1,Payer Name (Required),,R,,,,,,,,,
2010BB,2010BB.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,PR Payer,"Hardcode as ""PR""",,,,,,,
2010BB,2010BB.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,2 Non-Person Entity,"Hardcode as ""2""",,,,,,,
2010BB,2010BB.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,Product,,,,,Configurable value for Implementation team,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/payerInformation/hicName,
2010BB,2010BB.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),R,"PI Payor Identification
XV Centers for Medicare and Medicaid Services PlanID","Hardcode as ""PI""",,,,,,,
2010BB,2010BB.NM109,Identification Code,Code identifying a party or other code,R,,"Default value ""1234567""",,,,,"Configurable value for Implementation team
updated default values",ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/payerInformation/taxId,
2010BB,N3,Payer Address,,S,,,,,,,,,
2010BB,2010BB.N301,Address Information,Address Information,R,,"Hardcode as ""XXXX""",,,,,"Configurable value for Implementation team
updated default values",ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/payerInformation/hicAddress/address,
2010BB,2010BB.N302,Address Information,Address Information,S,,,,,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/payerInformation/hicAddress/address2,
2010BB,N4,"Payer City, State, ZIP Code",,R,,,,,,,,,
2010BB,2010BB.N401,City Name,Free-form text for city name,R,,"Default value as ""Product""",,,,,Configurable value for Implementation team.,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/payerInformation/hicAddress/city,
2010BB,2010BB.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,"Default  value as ""CO""",,,,,Configurable value for Implementation team.,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/payerInformation/hicAddress/stateCode,
2010BB,2010BB.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,"Default  value as ""80014""",,,,,Configurable value for Implementation team.,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/payerInformation/hicAddress/zipCode + ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/payerInformation/hicAddress/zipExtension,
2010BB,2010BB.N404,Country Code,Code identifying the country,S,,,,,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/payerInformation/hicAddress/countryCode,
2010BB,2010BB.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,,,,
2010BB,REF,Payer Secondary Identification,,S,,,,,,,,,
2010BB,2010BB.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"2U Payer Identification Number
EI Employer’s Identification Number
FY Claim Office Number
NF National Association of Insurance Commissioners
(NAIC) Code",,,,,,,,
2010BB,2010BB.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,,
LOOP 2000C - PATIENT HIERARCHICAL LEVEL,,,,,,,,,,,,,
2000C,HL,Patient Hierarchical Level,,S,,,Generate 2000C loop only if  RELATIONSHIP_TO_SUB   is not 18,,,,,,
2000C,2000C.HL01,Hierarchical ID Number,,,,System Generated,System Generated,,,,,,
2000C,2000C.HL02,Hierarchical Parent ID Number,,,,2000B.HL01,2000B.HL01,,,,,,
2000C,2000C.HL03,Hierarchical Level Code,,,23 Dependent,"Hardcode as ""23""",23,,,,,,
2000C,2000C.HL04,Hierarchical Child Code,,,"0 No Subordinate HL Segment in This Hierarchical
Structure.","Hardcode as ""0""",0,,,,,,
2000C,PAT,Patient Information (Required),,R,,,,,,,,,
2000C,2000C.PAT01,Individual Relationship Code,Code indicating the relationship between two individuals or entities,R,"01 Spouse
19 Child
20 Employee
21 Unknown
39 Organ Donor
40 Cadaver Donor
53 Life Partner
G8 Other Relationship",,RELATIONSHIP_TO_SUB,16,Claim,if  RELATIONSHIP_TO_SUB   is not 18,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/patientInformation/relationshipToSubscriber,
2000C,2000C.PAT05,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",S,D8 Date Expressed in Format CCYYMMDD,,,,,,,,
2000C,2000C.PAT06,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",S,,,,,,,,,
2000C,2000C.PAT07,Unit or Basis for Measurement Code,"Code specifying the units in which a value is being expressed, or manner in which a measurement has been taken",S,01 Actual Pounds,,,,,,,,
2000C,2000C.PAT08,Weight,Numeric value of weight,S,,,,,,,,,
2000C,2000C.PAT09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,Y Yes,,,,,,,,
LOOP 2010CA - PATIENT NAME,,,,,,,,,,,,,
2010CA,NM1,Patient Name (Required),,R,,,,,,,,,
2010CA,2010CA.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,QC Patient,"Hardcode as ""QC""",,,,,,,
2010CA,2010CA.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,1 Person,"Hardcode as ""1""",,,,,,,
2010CA,2010CA.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,PATIENT_LAST_NAME,12,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/memberInformation/individual/lastName,
2010CA,2010CA.NM104,Name First,Individual first name,S,,,PATIENT_FIRST_NAME,13,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/memberInformation/individual/firstName,
2010CA,2010CA.NM105,Name Middle,Individual middle name or initial,S,,,PATIENT_MIDDLE_NAME,14,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/memberInformation/individual/middleName,
2010CA,2010CA.NM107,Name Suffix,Suffix to individual name,S,,,PATIENT_NAME_SUFFIX,15,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/memberInformation/individual/nameSuffix,
2010CA,N3,Patient Address (Required),,R,,,,,,,,,
2010CA,2010CA.N301,Address Information,Address information,R,,,PATIENT_ADDRESS_01,258,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/patientInformation/correspondenceAddress/address,
2010CA,2010CA.N302,Address Information,Address information,S,,,PATIENT_ADDRESS_02,259,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/patientInformation/correspondenceAddress/address2,
2010CA,N4,"Patient City, State, ZIP Code (Required)",,R,,,,,,,,,
2010CA,2010CA.N401,City Name,Free-form text for city name,R,,,PATIENT_CITY,260,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/patientInformation/correspondenceAddress/city,
2010CA,2010CA.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,PATIENT_STATE,261,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/patientInformation/correspondenceAddress/stateCode,
2010CA,2010CA.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,,(PATIENT_ZIP) + (PATIENT_ZIP_PLUS_FOUR),262 + 263,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/patientInformation/correspondenceAddress/zipCode + ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/patientInformation/correspondenceAddress/zipExtension,
2010CA,2010CA.N404,Country Code,Code identifying the country,S,,,,264,Claim,,"I checked in OB Payment. Seems Country Code is not displaying in EDI. As we do not have any logic with Country Code and we are blocked with this issue (Snip Validation Error while translating with the Value as US), we can remove the Country Code mapping",ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/patientInformation/correspondenceAddress/countyCode,
2010CA,2010CA.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,,,,
2010CA,DMG,Patient Demographic Information (Required),,R,,,,,,,,,
2010CA,2010CA.DMG01,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,,
2010CA,2010CA.DMG02,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,PATIENT_DOB,5,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/patientInformation/member/birthdate,
2010CA,2010CA.DMG03,Gender Code,Code indicating the sex of the individual,R,"F Female
M Male
U Unknown",,PATIENT_GENDER_ID,6,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/patientInformation/member/genderCode,
2010CA,REF,Property and Casualty Claim Number,,,,,,,,,,,
2010CA,2010CA.REF01,Reference Identification Qualifier,,,Y4 Agency Claim Number,,,,,,,,
2010CA,2010CA.REF02,Reference Identification,,,,,,,,,,,
2010CA,REF,Property and Casualty Patient Identifier,,,,,,,,,,,
2010CA,2010CA.REF01,Reference Identification Qualifier,,,,,,,,,,,
2010CA,2010CA.REF02,Reference Identification,,,,,,,,,,,
2010CA,PER,Property and Casualty Patient Contact Information,,,,,,,,,,,
2010CA,2010CA.PER01,Contact Function Code,,,IC Information Contact,,,,,,,,
2010CA,2010CA.PER02,Name,,,,,,,,,,,
2010CA,2010CA.PER03,Communication Number Qualifier,,,TE Telephone,,,,,,,,
2010CA,2010CA.PER04,Communication Number,,,,,,,,,,,
2010CA,2010CA.PER05,Communication Number Qualifier,,,EX Telephone Extension,,,,,,,,
2010CA,2010CA.PER06,Communication Number,,,,,,,,,,,
LOOP 2300- Required,,,,,,,,,,,,,
2300,CLM,Claim Information (Required),,R,,,,,,,,,
2300,2300.CLM01,Claim Submitter's Identifier,Identifier used to track a claim from creation by the health care provider through payment,R,,,PATIENT_CONTROL_NUM,11,Claim,,,,
2300,2300.CLM02,Monetary Amount,Monetary amount,R,,,CLAIM_BILLED_AMOUNT,208,Claim,,,,
2300,2300.CLM05.01,Facility Code Value,"Code identifying where services were, or may be, performed; the first and second positions of the Uniform Bill Type Code for Institutional Services or the Place of Service Codes for Professional or Dental Services.",R,,,PLACE_OF_SERVICE,144,Line,,,,
2300,2300.CLM05.02,Facility Code Qualifier,Code identifying the type of facility referenced,R,B : Place of Service Codes for Professional or Dental Services,"Hardcode as ""B""",,,,,,,
2300,2300.CLM05.03,Claim Frequency Type Code,Code specifying the frequency of the claim; this is the third position of the Uniform Billing Claim Form Bill Type,R,,,CLAIM_FREQUENCY_CODE,426,Claim,,,,
2300,2300.CLM06,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,R,"N No
Y Yes",,PROVIDER_SIGNATURE_PRESENT,504,Claim,,,,
2300,2300.CLM07,Provider Accept Assignment Code,Code indicating whether the provider accepts assignment,R,"A Assigned
B Assignment Accepted on Clinical Lab Services Only
C Not Assigned",,ASSIGNMENT_ACCEPTANCE,505,Claim,"If ASSIGNMENT_ACCEPTANCE is Y, map A
If ASSIGNMENT_ACCEPTANCE is N, map C",,,
2300,2300.CLM08,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,R,"N No
W Not Applicable
Y Yes",,ASSIGNMENT_OF_BENEFITS,207,Claim,,,,
2300,2300.CLM09,Release of Information Code,Code indicating whether the provider has on file a signed statement by the patient authorizing the release of medical data to other organizations,R,"I Informed Consent to Release Medical Information for Conditions or Diagnoses Regulated by Federal Statutes
Y Yes, Provider has a Signed Statement Permitting
Release of Medical Billing Data Related to a Claim",,INFORMATION_RELEASE,506,Claim,"If INFORMATION_RELEASE is Yes, map Y, Else map I",,,
2300,2300.CLM10,Patient Signature Source Code,Code indicating how the patient or subscriber authorization signatures were obtained and how they are being retained by the provider,S,P Signature generated by provider because the patient was not physically present for services,,,,,,,,
2300,2300.CLM11.01,Related-Causes Code,"Code identifying an accompanying cause of an illness, injury or an acciden",R,"AA Auto Accident
EM Employment
 OA Other Accident",,,,,,,,
2300,2300.CLM11.02,Related-Causes Code,"Code identifying an accompanying cause of an illness, injury or an
accident",S,,,,,,,,,
2300,2300.CLM11.04,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,,,,,,,
2300,2300.CLM11.05,Country Code,Code identifying the country,S,,,,,,,,,
2300,2300.CLM12,Special Program Code,Code indicating the Special Program under which the services rendered to the patient were performed,S,"02 Physically Handicapped Children’s Program
03 Special Federal Funding
 05 Disability
 09 Second Opinion or Surgery 492 This code is used for Medicaid claims only",,,,,,,,
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
15 Natural Disaster",,,,,,,,
2300,DTP,Onset of Current Illness or Symptom (Situational),,,,,,,,,,,
2300,2300.DTP01,Date/Time Qualifier,,,,,,,,,,,
2300,2300.DTP02,Date Time Period Format Qualifier,,,,,,,,,,,
2300,2300.DTP03,Date Time Period,,,,,,,,,,,
2300,DTP,Initial Treatment Date (Situational),,,,,,,,,,,
2300,2300.DTP01,Date/Time Qualifier,,,,,,,,,,,
2300,2300.DTP02,Date Time Period Format Qualifier,,,,,,,,,,,
2300,2300.DTP03,Date Time Period,,,,,,,,,,,
2300,DTP,Last Seen Date (Situational),,,,,,,,,,,
2300,2300.DTP01,Date/Time Qualifier,,,,,,,,,,,
2300,2300.DTP02,Date Time Period Format Qualifier,,,,,,,,,,,
2300,2300.DTP03,Date Time Period,,,,,,,,,,,
2300,DTP,Acute Manifestation (Situational),,,,,,,,,,,
2300,2300.DTP01,Date/Time Qualifier,,,,,,,,,,,
2300,2300.DTP02,Date Time Period Format Qualifier,,,,,,,,,,,
2300,2300.DTP03,Date Time Period,,,,,,,,,,,
2300,DTP,Accident (Situational),,,,,,,,,,,
2300,2300.DTP01,Date/Time Qualifier,,,,,,,,,,,
2300,2300.DTP02,Date Time Period Format Qualifier,,,,,,,,,,,
2300,2300.DTP03,Date Time Period,,,,,,,,,,,
2300,DTP,Last Menstrual Period (Situational),,,,,,,,,,,
2300,2300.DTP01,Date/Time Qualifier,,,,,,,,,,,
2300,2300.DTP02,Date Time Period Format Qualifier,,,,,,,,,,,
9,2300.DTP03,Date Time Period,,,,,,,,,,,
2300,DTP,Last X-ray Date (Situational),,,,,,,,,,,
2300,2300.DTP01,Date/Time Qualifier,,,,,,,,,,,
2300,2300.DTP02,Date Time Period Format Qualifier,,,,,,,,,,,
2300,2300.DTP03,Date Time Period,,,,,,,,,,,
2300,DTP,Hearing and Vision Prescription Date (Situational),,,,,,,,,,,
2300,2300.DTP01,Date/Time Qualifier,,,,,,,,,,,
2300,2300.DTP02,Date Time Period Format Qualifier,,,,,,,,,,,
2300,2300.DTP03,Date Time Period,,,,,,,,,,,
2300,DTP,Disability Dates (Situational),,,,,,,,,,,
2300,2300.DTP01,Date/Time Qualifier,,,,,,,,,,,
2300,2300.DTP02,Date Time Period Format Qualifier,,,,,,,,,,,
2300,2300.DTP03,Date Time Period,,,,,,,,,,,
2300,DTP,Last Worked (Situational),,,,,,,,,,,
2300,2300.DTP01,Date/Time Qualifier,,,,,,,,,,,
2300,2300.DTP02,Date Time Period Format Qualifier,,,,,,,,,,,
2300,2300.DTP03,Date Time Period,,,,,,,,,,,
2300,DTP,Authorized Return to Work (Situational),,,,,,,,,,,
2300,2300.DTP01,Date/Time Qualifier,,,,,,,,,,,
2300,2300.DTP02,Date Time Period Format Qualifier,,,,,,,,,,,
2300,2300.DTP03,Date Time Period,,,,,,,,,,,
2300,DTP,DTP Date - Admission (Situational),,,,,,,,,,,
2300,2300.DTP01,Date/Time Qualifier,,,,,,,,,,,
2300,2300.DTP02,Date Time Period Format Qualifier,,,,,,,,,,,
2300,2300.DTP03,Date Time Period,,,,,,,,,,,
2300,DTP,Discharge (Situational),,,,,,,,,,,
2300,2300.DTP01,Date/Time Qualifier,,,,,,,,,,,
2300,2300.DTP02,Date Time Period Format Qualifier,,,,,,,,,,,
2300,2300.DTP03,Date Time Period,,,,,,,,,,,
2300,DTP,Assumed and Relinquished Care Dates (Situational),,,,,,,,,,,
2300,2300.DTP01,Date/Time Qualifier,,,,,,,,,,,
2300,2300.DTP02,Date Time Period Format Qualifier,,,,,,,,,,,
2300,2300.DTP03,Date Time Period,,,,,,,,,,,
2300,DTP,Property and Casualty Date of First Contact (Situational),,,,,,,,,,,
2300,2300.DTP01,Date/Time Qualifier,,,,,,,,,,,
2300,2300.DTP02,Date Time Period Format Qualifier,,,,,,,,,,,
2300,2300.DTP03,Date Time Period,,,,,,,,,,,
2300,DTP,Repricer Received Date (Situational),,,,,,,,,,,
2300,2300.DTP01,Date/Time Qualifier,,,,,,,,,,,
2300,2300.DTP02,Date Time Period Format Qualifier,,,,,,,,,,,
2300,2300.DTP03,Date Time Period,,,,,,,,,,,
2300,PWK,Claim Supplemental Information (Situational),,,,,,,,,,,
2300,2300.PWK01,Report Type Code,,,,,,,,,,,
2300,2300.PWK02,Report Transmission Code,,,,,,,,,,,
2300,2300.PWK05,Identification Code Qualifier,,,,,,,,,,,
2300,2300.PWK06,Identification Code,,,,,,,,,,,
2300,CN1,Contract Information (Situational),,,,,,,,,,,
2300,2300.CN101,Contract Type Code,,,,,,,,,,,
2300,2300.CN102,Monetary Amount,,,,,,,,,,,
2300,2300.CN103,"Percent, Decimal Format",,,,,,,,,,,
2300,2300.CN104,Reference Identification,,,,,,,,,,,
2300,2300.CN105,Terms Discount Percent,,,,,,,,,,,
2300,2300.CN106,Version Identifier,,,,,,,,,,,
2300,AMT,Patient Amount Paid (Situational),,,,,,,,,,,
2300,2300.AMT01,Amount Qualifier Code,,,,,,,,,,,
2300,2300.AMT02,Monetary Amount,,,,,,,,,,,
2300,REF,Service Authorization Exception Code (Situational),,,,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,,,,,,,,,,,
2300,2300.REF02,Reference Identification,,,,,,,,,,,
2300,REF,Mandatory Medicare (Section 4081) Crossover Indicator (Situational),,,,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,,,,,,,,,,,
2300,2300.REF02,Reference Identification,,,,,,,,,,,
2300,REF,Mammography Certification Number (Situational),,,,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,,,,,,,,,,,
2300,2300.REF02,Reference Identification,,,,,,,,,,,
2300,REF,Referral Number (Situational),,,,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,,,,,,,,,,,
2300,2300.REF02,Reference Identification,,,,,,,,,,,
2300,REF,Prior Authorization (Situational),,S,,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,G1 Prior Authorization Number,,,,,,,,
2300,2300.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,,
2300,REF,Payer Claim Control Number (Situational),,S,,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,F8 Original Reference Number,"Hardcode as ""F8""",,,,Only if CLAIM_ID_ORIG has values,,,
2300,2300.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,CLAIM_ID_ORIG,CLAIM_ID_ORIG,237,Claim,,,,
2300,REF,Clinical Laboratory Improvement Amendment (CLIA) Number (Situational),,S,,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,,,,,,,,,,
2300,2300.REF02,Reference Identification,,,,,,,,,,,
2300,REF,Repriced Claim Number (Situational),,,,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,,,,,,,,,,,
2300,2300.REF02,Reference Identification,,,,,,,,,,,
2300,REF,Adjusted Repriced Claim Number (Situational),,,,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,,,,,,,,,,,
2300,2300.REF02,Reference Identification,,,,,,,,,,,
2300,REF,Investigational Device Exemption Number (Situational),,,,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,,,,,,,,,,,
2300,2300.REF02,Reference Identification,,,,,,,,,,,
2300,REF,Claim Identifier For Transmission Intermediaries (Situational),,S,,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,D9 Claim Number,"Hardcode as ""D9""",,,,,,,
2300,2300.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,CLAIM_ID,19,Claim,,,,
2300,REF,Medical Record Number (Situational),,S,,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,EA Medical Record Identification Number,"Hardcode as ""EA""",,,,Only if MED_REC_NO has values,,,
2300,2300.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,MED_REC_NO,21,Claim,,,,
2300,REF,Demonstration Project Identifier (Situational),,,,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,,,,,,,,,,,
2300,2300.REF02,Reference Identification,,,,,,,,,,,
2300,REF,Care Plan Oversight (Situational),,,,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,,,,,,,,,,,
2300,2300.REF02,Reference Identification,,,,,,,,,,,
2300,K3,File Information (Situational),,,,,,,,,,,
2300,2300.K301,Fixed Format Information,,,,,,,,,,,
2300,NTE,Claim Note (Situational),,,,,,,,,,,
2300,2300.NTE01,Note Reference Code,,,,,,,,,,,
2300,2300.NTE02,Description,,,,,,,,,,,
2300,CR1,Ambulance Transport Information (Situational),,,,,,,,,,,
2300,2300.CR101,Unit or Basis for Measurement Code,,,,,,,,,,,
2300,2300.CR102,Weight,,,,,,,,,,,
2300,2300.CR104,Ambulance Transport Reason Code,,,,,,,,,,,
2300,2300.CR105,Unit or Basis for Measurement Code,,,,,,,,,,,
2300,2300.CR106,Quantity,,,,,,,,,,,
2300,2300.CR109,Description,,,,,,,,,,,
2300,2300.CR110,Description,,,,,,,,,,,
2300,CR2,Spinal Manipulation Service Information (Situational),,,,,,,,,,,
2300,2300.CR208,Nature of Condition Code,,,,,,,,,,,
2300,2300.CR210,Description,,,,,,,,,,,
2300,2300.CR211,Description,,,,,,,,,,,
2300,CRC,Ambulance Certification (Situational),,,,,,,,,,,
2300,2300.CRC01,Code Category,,,,,,,,,,,
2300,2300.CRC02,Yes/No Condition or Response Code,,,,,,,,,,,
2300,2300.CRC03,Condition Indicator,,,,,,,,,,,
2300,2300.CRC04,Condition Indicator,,,,,,,,,,,
2300,2300.CRC05,Condition Indicator,,,,,,,,,,,
2300,2300.CRC06,Condition Indicator,,,,,,,,,,,
2300,2300.CRC07,Condition Indicator,,,,,,,,,,,
2300,CRC,Patient Condition Information: Vision (Situational),,,,,,,,,,,
2300,2300.CRC01,Code Category,,,,,,,,,,,
2300,2300.CRC02,Yes/No Condition or Response Code,,,,,,,,,,,
2300,2300.CRC03,Condition Indicator,,,,,,,,,,,
2300,2300.CRC04,Condition Indicator,,,,,,,,,,,
2300,2300.CRC05,Condition Indicator,,,,,,,,,,,
2300,2300.CRC06,Condition Indicator,,,,,,,,,,,
2300,2300.CRC07,Condition Indicator,,,,,,,,,,,
2300,CRC,Homebound Indicator (Situational),,,,,,,,,,,
2300,2300.CRC01,Code Category,,,,,,,,,,,
2300,2300.CRC02,Yes/No Condition or Response Code,,,,,,,,,,,
2300,2300.CRC03,Condition Indicator,,,,,,,,,,,
2300,CRC,EPSDT Referral (Situational),,,,,,,,,,,
2300,2300.CRC01,Code Category,,,,,,,,,,,
2300,2300.CRC02,Yes/No Condition or Response Code,,,,,,,,,,,
2300,2300.CRC03,Condition Indicator,,,,,,,,,,,
2300,2300.CRC04,Condition Indicator,,,,,,,,,,,
2300,2300.CRC05,Condition Indicator,,,,,,,,,,,
2300,HI,Health Care Diagnosis Code (Required),,R,,,,,,,,,
2300,2300.HI01.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABK International Classification of Diseases Clinical Modification (ICD-10-CM) Principal Diagnosis
BK International Classification of Diseases Clinical
Modification (ICD-9-CM) Principal Diagnosis","Hardcode as ""ABK""",,,,,,,
2300,2300.HI01.02,Industry Code,Code indicating a code from a specific industry code list,R,,,DIAGNOSIS_CODE_01,23,CLaim,,,,
2300,2300.HI02.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,,
2300,2300.HI02.02,Industry Code,Code indicating a code from a specific industry code list,R,,,DIAGNOSIS_CODE_02,25,CLaim,,,,
2300,2300.HI03.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,,
2300,2300.HI03.02,Industry Code,Code indicating a code from a specific industry code list,R,,,DIAGNOSIS_CODE_03,27,CLaim,,,,
2300,2300.HI04.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,,
2300,2300.HI04.02,Industry Code,Code indicating a code from a specific industry code list,R,,,DIAGNOSIS_CODE_04,29,CLaim,,,,
2300,2300.HI05.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,,
2300,2300.HI05.02,Industry Code,Code indicating a code from a specific industry code list,R,,,DIAGNOSIS_CODE_05,31,CLaim,,,,
2300,2300.HI06.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,,
2300,2300.HI06.02,Industry Code,Code indicating a code from a specific industry code list,R,,,DIAGNOSIS_CODE_06,33,CLaim,,,,
2300,2300.HI07.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,,
2300,2300.HI07.02,Industry Code,Code indicating a code from a specific industry code list,R,,,DIAGNOSIS_CODE_07,35,CLaim,,,,
2300,2300.HI08.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,,
2300,2300.HI08.02,Industry Code,Code indicating a code from a specific industry code list,R,,,DIAGNOSIS_CODE_08,37,CLaim,,,,
2300,2300.HI09.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,,
2300,2300.HI09.02,Industry Code,Code indicating a code from a specific industry code list,R,,,DIAGNOSIS_CODE_09,39,CLaim,,,,
2300,2300.HI10.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,,
2300,2300.HI10.02,Industry Code,Code indicating a code from a specific industry code list,R,,,DIAGNOSIS_CODE_10,41,CLaim,,,,
2300,2300.HI11.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,,
2300,2300.HI11.02,Industry Code,Code indicating a code from a specific industry code list,R,,,DIAGNOSIS_CODE_11,43,CLaim,,,,
2300,2300.HI12.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,,
2300,2300.HI12.02,Industry Code,Code indicating a code from a specific industry code list,R,,,DIAGNOSIS_CODE_12,45,CLaim,,,,
2300,2300.HI13.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,,
2300,2300.HI13.02,Industry Code,Code indicating a code from a specific industry code list,R,,,DIAGNOSIS_CODE_13,47,CLaim,,,,
2300,HI,Anesthesia Related Procedure (Situational),,,,,,,,,,,
2300,2300.HI01.01,Code List Qualifier Code,,,,,,,,,,,
2300,2300.HI01.02,Industry Code,,,,,,,,,,,
2300,2300.HI02.01,Code List Qualifier Code,,,,,,,,,,,
2300,2300.HI02.02,Industry Code,,,,,,,,,,,
2300,HI,Condition Information (Situational),,,,,,,,,,,
2300,2300.HI01.01,Code List Qualifier Code,,,BG - Condition,,,,,,,,
2300,2300.HI01.02,Industry Code,,,,,,,,,,,
2300,2300.HI02.01,Code List Qualifier Code,,,BG - Condition,,,,,,,,
2300,2300.HI02.02,Industry Code,,,,,,,,,,,
2300,2300.HI03.01,Code List Qualifier Code,,,BG - Condition,,,,,,,,
2300,2300.HI03.02,Industry Code,,,,,,,,,,,
2300,2300.HI04.01,Code List Qualifier Code,,,BG - Condition,,,,,,,,
2300,2300.HI04.02,Industry Code,,,,,,,,,,,
2300,2300.HI05.01,Code List Qualifier Code,,,BG - Condition,,,,,,,,
2300,2300.HI05.02,Industry Code,,,,,,,,,,,
2300,2300.HI06.01,Code List Qualifier Code,,,BG - Condition,,,,,,,,
2300,2300.HI06.02,Industry Code,,,,,,,,,,,
2300,2300.HI07.01,Code List Qualifier Code,,,BG - Condition,,,,,,,,
2300,2300.HI07.02,Industry Code,,,,,,,,,,,
2300,2300.HI08.01,Code List Qualifier Code,,,BG - Condition,,,,,,,,
2300,2300.HI08.02,Industry Code,,,,,,,,,,,
2300,2300.HI09.01,Code List Qualifier Code,,,BG - Condition,,,,,,,,
2300,2300.HI09.02,Industry Code,,,,,,,,,,,
2300,2300.HI10.01,Code List Qualifier Code,,,BG - Condition,,,,,,,,
2300,2300.HI10.02,Industry Code,,,,,,,,,,,
2300,2300.HI11.01,Code List Qualifier Code,,,BG - Condition,,,,,,,,
2300,2300.HI11.02,Industry Code,,,,,,,,,,,
2300,2300.HI12.01,Code List Qualifier Code,,,BG - Condition,,,,,,,,
2300,2300.HI12.02,Industry Code,,,,,,,,,,,
2300,HCP,Claim Pricing/Repricing Information,,,,,,,,,,,
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
14 Adjustment Pricing",,,,,,,,
2300,2300.HCP02,Monetary Amount,,,,,,,,,,,
2300,2300.HCP03,Monetary Amount,,,,,,,,,,,
2300,2300.HCP04,Reference Identification,,,,,,,,,,,
2300,2300.HCP05,Rate,,,,,,,,,,,
2300,2300.HCP06,Reference Identification,,,,,,,,,,,
2300,2300.HCP07,Monetary Amount,,,,,,,,,,,
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
LOOP 2310A - REFERRING PROVIDER NAME,,,,,,,,,,,,,
2310A,NM1,Referring Provider Name,,S,,,,,,,,,
2310A,2310A.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,"DN Referring Provider
P3 Primary Care Provider","Hardcode as ""DN""",,,,,,,
2310A,2310A.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,1 Person,"Hardcode as ""1""",,,,,,,
2310A,2310A.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,REFERRING_LAST_NAME,288,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/referringInformation/practitioner/lastName,
2310A,2310A.NM104,Name First,Individual first name,S,,,REFERRING_FIRST_NAME,289,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/referringInformation/practitioner/firstName,
2310A,2310A.NM105,Name Middle,Individual middle name or initia,S,,,REFERRING_MIDDLE_NAME,290,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/referringInformation/practitioner/middleName,
2310A,2310A.NM107,Name Suffix,Suffix to individual name,S,,,REFERRING_NAME_SUFFIX,291,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/referringInformation/practitioner/nameSuffix,
2310A,2310A.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),S,XX Centers for Medicare and Medicaid Services National Provider Identifier,"Hardcode as ""XX""",,,,,,,
2310A,2310A.NM109,Identification Code,Code identifying a party or other code,S,,,REFERRING_NPI,283,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/referringInformation/NPI,
2310A,REF,Referring Provider Secondary Identification,,,,,,,,,,,
2310A,2310A.REF01,Reference Identification Qualifier,,,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number",,,,,,,,
2310A,2310A.REF02,Reference Identification,,,,,,,,,,,
LOOP 2310B - RENDERING PROVIDER NAME,,,,,,,,,,,,,
2310B,NM1,Rendering Provider Name,,S,,,,,,,,,
2310B,2310B.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,82 Rendering Provider,,,,,,,,
2310B,2310B.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,"1 Person
2 Non-Person Entity",,,,,,,,
2310B,2310B.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,,,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/renderingPractitioner/practitioner/lastName,need to add logic in header and go head with line level
2310B,2310B.NM104,Name First,Individual first name,S,,,,,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/renderingPractitioner/practitioner/firstName,
2310B,2310B.NM105,Name Middle,Individual middle name or initia,S,,,,,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/renderingPractitioner/practitioner/middleName,
2310B,2310B.NM107,Name Suffix,Suffix to individual name,S,,,,,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/renderingPractitioner/practitioner/nameSuffix,
2310B,2310B.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),S,XX Centers for Medicare and Medicaid Services National Provider Identifier,,,,,,,"Always Equals 'XX""",
2310B,2310B.NM109,Identification Code,Code identifying a party or other code,S,,,,,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/renderingPractitioner/NPI,
2310B,PRV,Rendering Provider Specialty Information,,S,,,,,,,,,
2310B,2310B.PRV01,Provider Code,Code identifying the type of provider,R,PE Performing,,,,,,,,
2310B,2310B.PRV02,Reference Identification Qualifier,Code qualifying the Reference Identification,R,PXC Health Care Provider Taxonomy Code,,,,,,,,
2310B,2310B.PRV03,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/renderingPractitioner/primarySpecialty/taxonomyCode,
2310B,REF,Rendering Provider Secondary Identification,,,,,,,,,,,
2310B,2310B.REF01,Reference Identification Qualifier,,,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number
LU Location Number",,,,,,,,
2310B,2310B.REF02,Reference Identification,,,,,,,,,,,
"LOOP 2310C - SERVICE FACILITY LOCATION
NAME",,,,,,,,,,,,,
2310C,NM1,Service Facility Location Name,,S,,,,,,,,,
2310C,2310C.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,77 Service Location,"Hardcode as ""77""",Populate only if Rendering_Facility_ Name is having values,,,,,,
2310C,2310C.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,2 Non-Person Entity,"Hardcode as ""2""",,,,,,,
2310C,2310C.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,Rendering_Facility_ Name,507,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/renderingFacility/facilityName,
2310C,2310C.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),S,"XX Centers for Medicare and Medicaid Services
National Provider Identifier","Hardcode as ""XX""",,,,,,,
2310C,2310C.NM109,Identification Code,Code identifying a party or other code,S,,,Rendering_Facility_ NPI,508,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/renderingFacility/npi,
2310C,N3,Service Facility Location Address (Required),,R,,,,,,,,,
2310C,2310C.N301,Address Information,Address information,R,,,Rendering_Facility_ Address_01,509,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/renderingFacility/address/address,
2310C,2310C.N302,Address Information,Address information,S,,,Rendering_Facility_ Address_02,510,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/renderingFacility/address/address2,
2310C,N4,"Service Facility Location City, State, ZIP Code (Required)",,R,,,,,,,,,
2310C,2310C.N401,City Name,Free-form text for city name,R,,,Rendering_Facility_ Address_City,511,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/renderingFacility/address/city,
2310C,2310C.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,Rendering_Facility_ Address_State,512,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/renderingFacility/address/stateCode,
2310C,2310C.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,,Rendering_Facility_ Address_Zip + Rendering_Facility_ Addres_ZIP_PLUS_Four,513,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/renderingFacility/address/zipCode + ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/renderingFacility/address/zipExtension,
2310C,2310C.N404,Country Code,Code identifying the country,S,,,,514,Claim,,"I checked in OB Payment. Seems Country Code is not displaying in EDI. As we do not have any logic with Country Code and we are blocked with this issue (Snip Validation Error while translating with the Value as US), we can remove the Country Code mapping",ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hcfa1500Info/renderingFacility/address/countryCode,
2310C,2310C.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,,,,
2310C,REF,Service Facility Location Secondary Identification,,,,,,,,,,,
2310C,2310C.REF01,Reference Identification Qualifier,,,"0B State License Number
G2 Provider Commercial Number
LU Location Number",,,,,,,,
2310C,2310C.REF02,Reference Identification,,,,,,,,,,,
2310C,PER,Service Facility Contact Information,,,,,,,,,,,
2310C,2310C.PER01,Contact Function Code,,,IC Information Contact,,,,,,,,
2310C,2310C.PER02,Name,,,,,,,,,,,
2310C,2310C.PER03,Communication Number Qualifier,,,TE Telephone,,,,,,,,
2310C,2310C.PER04,Communication Number,,,,,,,,,,,
2310C,2310C.PER05,Communication Number Qualifier,,,EX Telephone Extension,,,,,,,,
2310C,2310C.PER06,Communication Number,,,,,,,,,,,
LOOP 2310D - SUPERVISING PROVIDER NAME,,,,,,,,,,,,,
2310D,NM1,Supervising Provider Name,,,,,,,,,,,
2310D,2310D.NM101,Entity Identifier Code,,,DQ Supervising Physician,,,,,,,,
2310D,2310D.NM102,Entity Type Qualifier,,,1 Person,,,,,,,,
2310D,2310D.NM103,Name Last or Organization Name,,,,,,,,,,,
2310D,2310D.NM104,Name First,,,,,,,,,,,
2310D,2310D.NM105,Name Middle,,,,,,,,,,,
2310D,2310D.NM107,Name Suffix,,,,,,,,,,,
2310D,2310D.NM108,Identification Code Qualifier,,,"XX Centers for Medicare and Medicaid Services
National Provider Identifier",,,,,,,,
2310D,2310D.NM109,Identification Code,,,,,,,,,,,
2310D,REF,Supervising Provider Secondary Identification,,,,,,,,,,,
2310D,2310D.REF01,Reference Identification Qualifier,,,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number
LU Location Number",,,,,,,,
2310D,2310D.REF02,Reference Identification,,,,,,,,,,,
LOOP 2310E - AMBULANCE PICK-UP LOCATION,,,,,,,,,,,,,
2310E,NM1,Ambulance Pick-up Location,,,,,,,,,,,
2310E,2310E.NM101,Entity Identifier Code,,,PW Pickup Address,,,,,,,,
2310E,2310E.NM102,Entity Type Qualifier,,,2 Non-Person Entity,,,,,,,,
2310E,N3,Ambulance Pick-up Location Address (Required),,,,,,,,,,,
2310E,2310E.N301,Address Information,,,,,,,,,,,
2310E,2310E.N302,Address Information,,,,,,,,,,,
2310E,N4,"Ambulance Pick-up Location City, State, ZIP Code (Required)",,,,,,,,,,,
2310E,2310E.N401,City Name,,,,,,,,,,,
2310E,2310E.N402,State or Province Code,,,,,,,,,,,
2310E,2310E.N403,Postal Code,,,,,,,,,,,
2310E,2310E.N404,Country Code,,,,,,,,,,,
2310E,2310E.N407,Country Subdivision Code,,,,,,,,,,,
LOOP 2310F - AMBULANCE DROP-OFF LOCATION,,,,,,,,,,,,,
2310F,NM1,Ambulance Drop-off Location,,,,,,,,,,,
2310F,2310F.NM101,Entity Identifier Code,,,45 Drop-off Location,,,,,,,,
2310F,2310F.NM102,Entity Type Qualifier,,,2 Non-Person Entity,,,,,,,,
2310F,2310F.NM103,Name Last or Organization Name,,,,,,,,,,,
2310F,N3,Ambulance Drop-off Location Address (Required),,,,,,,,,,,
2310F,2310F.N301,Address Information,,,,,,,,,,,
2310F,2310F.N302,Address Information,,,,,,,,,,,
2310F,N4,"Ambulance Drop-off Location City, State, ZIP Code (Required)",,,,,,,,,,,
2310F,2310F.N401,City Name,,,,,,,,,,,
2310F,2310F.N402,State or Province Code,,,,,,,,,,,
2310F,2310F.N403,Postal Code,,,,,,,,,,,
2310F,2310F.N404,Country Code,,,,,,,,,,,
2310F,2310F.N407,Country Subdivision Code,,,,,,,,,,,
LOOP 2320 - OTHER SUBSCRIBER INFORMATION,,,,,,,,,,,,,
2320,SBR,Other Subscriber Information,,,,,,,,,,,
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
U Unknown",,,,,,,,
2320,2320.SBR02,Individual Relationship Code,,,"01 Spouse
18 Self
19 Child
20 Employee
21 Unknown
39 Organ Donor
40 Cadaver Donor
53 Life Partner
G8 Other Relationship",,,,,,,,
2320,2320.SBR03,Reference Identification,,,,,,,,,,,
2320,2320.SBR04,Name,,,,,,,,,,,
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
Primary",,,,,,,,
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
2320,AMT,Coordination of Benefits (COB) Payer Paid Amount,,,,,,,,,,,
2320,2320.AMT01,Amount Qualifier Code,,,D Payor Amount Paid,,,,,,,,
2320,2320.AMT02,Monetary Amount,,,,,,,,,,,
2320,AMT,Coordination of Benefits (COB) Total Non-Covered Amount,,,,,,,,,,,
2320,2320.AMT01,Amount Qualifier Code,,,A8 Noncovered Charges - Actual,,,,,,,,
2320,2320.AMT02,Monetary Amount,,,,,,,,,,,
2320,AMT,Remaining Patient Liability,,,,,,,,,,,
2320,2320.AMT01,Amount Qualifier Code,,,EAF Amount Owed,,,,,,,,
2320,2320.AMT02,Monetary Amount,,,,,,,,,,,
2320,OI,Other Insurance Coverage Information (Required),,,,,,,,,,,
2320,2320.OI03,Yes/No Condition or Response Code,,,"N No
W Not Applicable
Y Yes",,,,,,,,
2320,2320.OI04,Patient Signature Source Code,,,"P Signature generated by provider because the patient
was not physically present for services",,,,,,,,
2320,2320.OI06,Release of Information Code,,,"I Informed Consent to Release Medical Information
for Conditions or Diagnoses Regulated by Federal
Statutes
Y Yes, Provider has a Signed Statement Permitting
Release of Medical Billing Data Related to a Claim",,,,,,,,
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
2330A,NM1,Other Subscriber Name (Required),,,,,,,,,,,
2330A,2330A.NM101,Entity Identifier Code,,,IL Insured or Subscriber,,,,,,,,
2330A,2330A.NM102,Entity Type Qualifier,,,"1 Person
2 Non-Person Entity",,,,,,,,
2330A,2330A.NM103,Name Last or Organization Name,,,,,,,,,,,
2330A,2330A.NM104,Name First,,,,,,,,,,,
2330A,2330A.NM105,Name Middle,,,,,,,,,,,
2330A,2330A.NM107,Name Suffix,,,,,,,,,,,
2330A,2330A.NM108,Identification Code Qualifier,,,"II Standard Unique Health Identifier for each Individual
in the United States
MI Member Identification Number",,,,,,,,
2330A,2330A.NM109,Identification Code,,,,,,,,,,,
2330A,N3,Other Subscriber Address,,,,,,,,,,,
2330A,2330A.N301,Address Information,,,,,,,,,,,
2330A,2330A.N302,Address Information,,,,,,,,,,,
2330A,N4,"Other Subscriber City, State, ZIP Code",,,,,,,,,,,
2330A,2330A.N401,City Name,,,,,,,,,,,
2330A,2330A.N402,State or Province Code,,,,,,,,,,,
2330A,2330A.N403,Postal Code,,,,,,,,,,,
2330A,2330A.N404,Country Code,,,,,,,,,,,
2330A,2330A.N407,Country Subdivision Code,,,,,,,,,,,
2330A,REF,Subscriber Secondary Identification,,,,,,,,,,,
2330A,2330A.REF01,Reference Identification Qualifier,,,SY Social Security Number,,,,,,,,
2330A,2330A.REF02,Reference Identification,,,,,,,,,,,
LOOP 2330B - OTHER PAYER NAME,,,,,,,,,,,,,
2330B,NM1,Other Payer Name (Required),,,,,,,,,,,
2330B,2330B.NM101,Entity Identifier Code,,,PR Payer,,,,,,,,
2330B,2330B.NM102,Entity Type Qualifier,,,2 Non-Person Entity,,,,,,,,
2330B,2330B.NM103,Name Last or Organization Name,,,,,,,,,,,
2330B,2330B.NM108,Identification Code Qualifier,,,"PI Payor Identification
XV Centers for Medicare and Medicaid Services PlanID",,,,,,,,
2330B,2330B.NM109,Identification Code,,,,,,,,,,,
2330B,N3,Other Payer Address,,,,,,,,,,,
2330B,2330B.N301,Address Information,,,,,,,,,,,
2330B,2330B.N302,Address Information,,,,,,,,,,,
2330B,N4,"Other Payer City, State, ZIP Code",,,,,,,,,,,
2330B,2330B.N401,City Name,,,,,,,,,,,
2330B,2330B.N402,State or Province Code,,,,,,,,,,,
2330B,2330B.N403,Postal Code,,,,,,,,,,,
2330B,2330B.N404,Country Code,,,,,,,,,,,
2330B,2330B.N407,Country Subdivision Code,,,,,,,,,,,
2330B,DTP,Claim Check or Remittance Date,,,,,,,,,,,
2330B,2330B.DTP01,Date/Time Qualifier,,,573 Date Claim Paid,,,,,,,,
2330B,2330B.DTP02,Date Time Period Format Qualifier,,,D8 Date Expressed in Format CCYYMMDD,,,,,,,,
2330B,2330B.DTP03,Date Time Period,,,,,,,,,,,
2330B,REF,Other Payer Secondary Identifier,,,,,,,,,,,
2330B,2330B.REF01,Reference Identification Qualifier,,,"2U Payer Identification Number
EI Employer’s Identification Number
FY Claim Office Number
NF National Association of Insurance Commissioners
(NAIC) Code",,,,,,,,
2330B,2330B.REF02,Reference Identification,,,,,,,,,,,
2330B,REF,Other Payer Prior Authorization Number,,,,,,,,,,,
2330B,2330B.REF01,Reference Identification Qualifier,,,G1 Prior Authorization Number,,,,,,,,
2330B,2330B.REF02,Reference Identification,,,,,,,,,,,
2330B,REF,Other Payer Referral Number,,,,,,,,,,,
2330B,2330B.REF01,Reference Identification Qualifier,,,9F Referral Number,,,,,,,,
2330B,2330B.REF02,Reference Identification,,,,,,,,,,,
2330B,REF,Other Payer Claim Adjustment Indicator,,,,,,,,,,,
2330B,2330B.REF01,Reference Identification Qualifier,,,T4 Signal Code,,,,,,,,
2330B,2330B.REF02,Reference Identification,,,,,,,,,,,
2330B,REF,Other Payer Claim Control Number,,,,,,,,,,,
2330B,2330B.REF01,Reference Identification Qualifier,,,F8 Original Reference Number,,,,,,,,
2330B,2330B.REF02,Reference Identification,,,,,,,,,,,
"LOOP 2330C - OTHER PAYER REFERRING
PROVIDER",,,,,,,,,,,,,
2330C,NM1,Other Payer Referring Provider,,,,,,,,,,,
2330C,2330C.NM101,Entity Identifier Code,,,"DN Referring Provider
P3 Primary Care Provider",,,,,,,,
2330C,2330C.NM102,Entity Type Qualifier,,,1 Person,,,,,,,,
2330C,REF,Other Payer Referring Provider Secondary Identification (Required),,,,,,,,,,,
2330C,2330C.REF01,Reference Identification Qualifier,,,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number",,,,,,,,
2330C,2330C.REF02,Reference Identification,,,,,,,,,,,
"LOOP 2330D - OTHER PAYER RENDERING
PROVIDER",,,,,,,,,,,,,
2330D,NM1,Other Payer Rendering Provider,,,,,,,,,,,
2330D,2330D.NM101,Entity Identifier Code,,,82 Rendering Provider,,,,,,,,
2330D,2330D.NM102,Entity Type Qualifier,,,"1 Person
2 Non-Person Entity",,,,,,,,
2330D,REF,Other Payer Rendering Provider Secondary Identification (Required),,,,,,,,,,,
2330D,2330D.REF01,Reference Identification Qualifier,,,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number
LU Location Number",,,,,,,,
2330D,2330D.REF02,Reference Identification,,,,,,,,,,,
"LOOP 2330E - OTHER PAYER SERVICE FACILITY
LOCATION",,,,,,,,,,,,,
2330E,NM1,Other Payer Service Facility Location,,,,,,,,,,,
2330E,2330E.NM101,Entity Identifier Code,,,77 Service Location,,,,,,,,
2330E,2330E.NM102,Entity Type Qualifier,,,2 Non-Person Entity,,,,,,,,
2330E,REF,Other Payer Service Facility Location Secondary Identification (Required),,,,,,,,,,,
2330E,2330E.REF01,Reference Identification Qualifier,,,"0B State License Number
G2 Provider Commercial Number
LU Location Number",,,,,,,,
2330E,2330E.REF02,Reference Identification,,,,,,,,,,,
"LOOP 2330F - OTHER PAYER SUPERVISING
PROVIDER",,,,,,,,,,,,,
2330F,NM1,Other Payer Supervising Provider,,,,,,,,,,,
2330F,2330F.NM101,Entity Identifier Code,,,DQ Supervising Physician,,,,,,,,
2330F,2330F.NM102,Entity Type Qualifier,,,1 Person,,,,,,,,
2330F,REF,Other Payer Supervising Provider Secondary Identification (Required),,,,,,,,,,,
2330F,2330F.REF01,Reference Identification Qualifier,,,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number
LU Location Number",,,,,,,,
2330F,2330F.REF02,Reference Identification,,,,,,,,,,,
LOOP 2330G - OTHER PAYER BILLING PROVIDER,,,,,,,,,,,,,
2330G,NM1,Other Payer Billing Provider,,,,,,,,,,,
2330G,2330G.NM101,Entity Identifier Code,,,85 Billing Provider,,,,,,,,
2330G,2330G.NM102,Entity Type Qualifier,,,"1 Person
2 Non-Person Entity",,,,,,,,
2330G,REF,Other Payer Billing Provider Secondary Identification (Required),,,,,,,,,,,
2330G,2330G.REF01,Reference Identification Qualifier,,,"G2 Provider Commercial Number
LU Location Number",,,,,,,,
2330G,2330G.REF02,Reference Identification,,,,,,,,,,,
LOOP 2400 - SERVICE LINE NUMBER,,,,,,,,,,,,,
2400,LX,Service Line Number (Required),,R,,,,,,,,,
2400,2400.LX01,Assigned Number,Number assigned for differentiation within a transaction set,R,,,LINE_SEQ,141,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/claimLineId,
2400,SV1,Professional Service (Required),,,,,,,,,,,
2400,2400.SV101.01,Product/Service ID Qualifier,Code identifying the type/source of the descriptive number used in Product/Service ID (234),R,"ER Jurisdiction Specific Procedure and Supply Codes
HC Health Care Financing Administration Common
Procedural Coding System (HCPCS) Codes
IV Home Infusion EDI Coalition (HIEC) Product/Service
Code
WK Advanced Billing Concepts (ABC) Codes","Hardcode as ""HC""",,,,,,,
2400,2400.SV101.02,Product/Service ID,Identifying number for a product or service,R,,,SUB_HCPCS,158,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/serviceCode,
2400,2400.SV101.03,Procedure Modifier,"This identifies special circumstances related to the performance of the service, as defined by trading partners",S,,,SUB_MOD_01,159,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/modifierList/string,
2400,2400.SV101.04,Procedure Modifier,"This identifies special circumstances related to the performance of the service, as defined by trading partners",S,,,SUB_MOD_02,160,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/modifierList/string,
2400,2400.SV101.05,Procedure Modifier,"This identifies special circumstances related to the performance of the service, as defined by trading partners",S,,,SUB_MOD_03,161,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/modifierList/string,
2400,2400.SV101.06,Procedure Modifier,"This identifies special circumstances related to the performance of the service, as defined by trading partners",S,,,SUB_MOD_04,162,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/modifierList/string,
2400,2400.SV101.07,Description,A free-form description to clarify the related data elements and their content,S,,,SUB_HCPCS_DESC,516,Line,,This mapping is not handled in Product Core. SNIP exclusions might be needed if SV101.07 is mapped along with SV101.02. This needs to be handled at Imp side if needed.,,
2400,2400.SV102,Monetary Amount,Monetary amount,R,,,SUB_AMOUNT,169,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/requestedAmount,
2400,2400.SV103,Unit or Basis for Measurement Code,"Code specifying the units in which a value is being expressed, or manner in which a measurement has been taken",R,"MJ Minutes
UN Unit",,UNITS_TYPE,167,Line,,,,
2400,2400.SV104,Quantity,Numeric value of quantity,R,,,SUB_UNITS,168,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/minuteCount OR ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/units,
2400,2400.SV105,Facility Code Value,"Code identifying where services were, or may be, performed; the first and second positions of the Uniform Bill Type Code for Institutional Services or the Place of Service Codes for Professional or Dental Services.",S,,,PLACE_OF_SERVICE,144,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/placeOfService,
2400,2400.SV107.01,Diagnosis Code Pointer,A pointer to the diagnosis code in the order of importance to this service,R,,,DIAGNOSIS_POINTER_01,146,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/diagnosisList/string,
2400,2400.SV107.02,Diagnosis Code Pointer,A pointer to the diagnosis code in the order of importance to this service,S,,,DIAGNOSIS_POINTER_02,147,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/diagnosisList/string,
2400,2400.SV107.03,Diagnosis Code Pointer,A pointer to the diagnosis code in the order of importance to this service,S,,,DIAGNOSIS_POINTER_03,148,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/diagnosisList/string,
2400,2400.SV107.04,Diagnosis Code Pointer,A pointer to the diagnosis code in the order of importance to this service,S,,,DIAGNOSIS_POINTER_04,149,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/diagnosisList/string,
2400,2400.SV109,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,Y Yes,,,,,,,,
2400,2400.SV111,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,Y Yes,,,,,,,,
2400,2400.SV112,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,Y Yes,,,,,,,,
2400,2400.SV115,Copay Status Code,Code indicating whether or not co-payment requirements were met on a line by line basis,S,0 Copay exempt,,,,,,,,
2400,SV5,Durable Medical Equipment Service,,,,,,,,,,,
2400,2400.SV501.01,Product/Service ID Qualifier,,,"HC Health Care Financing Administration Common
Procedural Coding System (HCPCS) Codes",,,,,,,,
2400,2400.SV501.02,Product/Service ID,,,,,,,,,,,
2400,2400.SV502,Unit or Basis for Measurement Code,,,DA Days,,,,,,,,
2400,2400.SV503,Quantity,,,,,,,,,,,
2400,2400.SV504,Monetary Amount,,,,,,,,,,,
2400,2400.SV505,Monetary Amount,,,,,,,,,,,
2400,2400.SV506,Frequency Code,,,"1 Weekly
4 Monthly
6 Daily",,,,,,,,
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
2400,PWK,Durable Medical Equipment Certificate of Medical Necessity Indicator,,,,,,,,,,,
2400,2400.PWK01,Report Type Code,,,CT Certification,,,,,,,,
2400,2400.PWK02,Report Transmission Code,,,"AB Previously Submitted to Payer
AD Certification Included in this Claim
AF Narrative Segment Included in this Claim
AG No Documentation is Required
NS Not Specified",,,,,,,,
2400,CR1,Ambulance Transport Information,,,,,,,,,,,
2400,2400.CR101,Unit or Basis for Measurement Code,,,LB Pound,,,,,,,,
2400,2400.CR102,Weight,,,,,,,,,,,
2400,2400.CR104,Ambulance Transport Reason Code,,,"A Patient was transported to nearest facility for care of
symptoms, complaints, or both
B Patient was transported for the benefit of a preferred
physician
C Patient was transported for the nearness of family
members
D Patient was transported for the care of a specialist
or for availability of specialized equipment
E Patient Transferred to Rehabilitation Facility",,,,,,,,
2400,2400.CR105,Unit or Basis for Measurement Code,,,DH Miles,,,,,,,,
2400,2400.CR106,Quantity,,,,,,,,,,,
2400,2400.CR109,Description,,,,,,,,,,,
2400,2400.CR110,Description,,,,,,,,,,,
2400,CR3,Durable Medical Equipment Certification,,,,,,,,,,,
2400,2400.CR301,Certification Type Code,,,"I Initial
R Renewal
S Revised",,,,,,,,
2400,2400.CR302,Unit or Basis for Measurement Code,,,MO Months,,,,,,,,
2400,2400.CR303,Quantity,,,,,,,,,,,
2400,CRC,Ambulance Certification,,,,,,,,,,,
2400,2400.CRC01,Code Category,,,07 Ambulance Certification,,,,,,,,
2400,2400.CRC02,Yes/No Condition or Response Code,,,"N No
Y Yes",,,,,,,,
2400,2400.CRC03,Condition Indicator,,,"01 Patient was admitted to a hospital
04 Patient was moved by stretcher
05 Patient was unconscious or in shock
06 Patient was transported in an emergency situation
07 Patient had to be physically restrained
08 Patient had visible hemorrhaging
09 Ambulance service was medically necessary
12 Patient is confined to a bed or chair",,,,,,,,
2400,2400.CRC04,Condition Indicator,,,,,,,,,,,
2400,2400.CRC05,Condition Indicator,,,,,,,,,,,
2400,2400.CRC06,Condition Indicator,,,,,,,,,,,
2400,2400.CRC07,Condition Indicator,,,,,,,,,,,
2400,CRC,Hospice Employee Indicator,,,,,,,,,,,
2400,2400.CRC01,Code Category,,,70 Hospice,,,,,,,,
2400,2400.CRC02,Yes/No Condition or Response Code,,,"N No
Y Yes",,,,,,,,
2400,2400.CRC03,Condition Indicator,,,65 Open,,,,,,,,
2400,CRC,Condition Indicator/Durable Medical Equipment,,,,,,,,,,,
2400,2400.CRC01,Code Category,,,09 Durable Medical Equipment Certification,,,,,,,,
2400,2400.CRC02,Yes/No Condition or Response Code,,,"N No
Y Yes",,,,,,,,
2400,2400.CRC03,Condition Indicator,,,"38 Certification signed by the physician is on file at the
supplier’s office
ZV Replacement Item",,,,,,,,
2400,2400.CRC04,Condition Indicator,,,,,,,,,,,
2400,DTP,Date - Service Date (Required),,R,,,,,,,,,
2400,2400.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,472 Service,"Hardcode as ""472""",,,,,,,
2400,2400.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,"D8 Date Expressed in Format CCYYMMDD
RD8 Range of Dates Expressed in Format CCYYMMDDCCYYMMDD","Hardcode ""RD8""  if LINE_END_DOS is present. Else D8.",,,,,,,
2400,2400.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,"LINE_BEGIN_DOS -
LINE_END_DOS",142 + 143,Line,,,"ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/serviceStartDate ""-"" ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/serviceEndDate",
2400,DTP,Date - Prescription Date,,,,,,,,,,,
2400,2400.DTP01,Date/Time Qualifier,,,471 Prescription,,,,,,,,
2400,2400.DTP02,Date Time Period Format Qualifier,,,D8 Date Expressed in Format CCYYMMDD,,,,,,,,
2400,2400.DTP03,Date Time Period,,,,,,,,,,,
2400,DTP,DATE - Certification Revision/Recertification Date,,,,,,,,,,,
2400,2400.DTP01,Date/Time Qualifier,,,607 Certification Revision,,,,,,,,
2400,2400.DTP02,Date Time Period Format Qualifier,,,D8 Date Expressed in Format CCYYMMDD,,,,,,,,
2400,2400.DTP03,Date Time Period,,,,,,,,,,,
2400,DTP,Date - Begin Therapy Date,,,,,,,,,,,
2400,2400.DTP01,Date/Time Qualifier,,,463 Begin Therapy,,,,,,,,
2400,2400.DTP02,Date Time Period Format Qualifier,,,D8 Date Expressed in Format CCYYMMDD,,,,,,,,
2400,2400.DTP03,Date Time Period,,,,,,,,,,,
2400,DTP,Date - Last Certification Date,,,,,,,,,,,
2400,2400.DTP01,Date/Time Qualifier,,,461 Last Certification,,,,,,,,
2400,2400.DTP02,Date Time Period Format Qualifier,,,D8 Date Expressed in Format CCYYMMDD,,,,,,,,
2400,2400.DTP03,Date Time Period,,,,,,,,,,,
2400,DTP,Date - Last Seen Date,,,,,,,,,,,
2400,2400.DTP01,Date/Time Qualifier,,,304 Latest Visit or Consultation,,,,,,,,
2400,2400.DTP02,Date Time Period Format Qualifier,,,D8 Date Expressed in Format CCYYMMDD,,,,,,,,
2400,2400.DTP03,Date Time Period,,,,,,,,,,,
2400,DTP,Date - Test Date,,,,,,,,,,,
2400,2400.DTP01,Date/Time Qualifier,,,"738 Most Recent Hemoglobin or Hematocrit or Both
739 Most Recent Serum Creatine",,,,,,,,
2400,2400.DTP02,Date Time Period Format Qualifier,,,D8 Date Expressed in Format CCYYMMDD,,,,,,,,
2400,2400.DTP03,Date Time Period,,,,,,,,,,,
2400,DTP,Date - Shipped Date,,,,,,,,,,,
2400,2400.DTP01,Date/Time Qualifier,,,011 Shipped,,,,,,,,
2400,2400.DTP02,Date Time Period Format Qualifier,,,D8 Date Expressed in Format CCYYMMDD,,,,,,,,
2400,2400.DTP03,Date Time Period,,,,,,,,,,,
2400,DTP,Date - Last X-ray Date,,,,,,,,,,,
2400,2400.DTP01,Date/Time Qualifier,,,455 Last X-Ray,,,,,,,,
2400,2400.DTP02,Date Time Period Format Qualifier,,,D8 Date Expressed in Format CCYYMMDD,,,,,,,,
2400,2400.DTP03,Date Time Period,,,,,,,,,,,
2400,DTP,Date - Initial Treatment Date,,,,,,,,,,,
2400,2400.DTP01,Date/Time Qualifier,,,454 Initial Treatment,,,,,,,,
2400,2400.DTP02,Date Time Period Format Qualifier,,,D8 Date Expressed in Format CCYYMMDD,,,,,,,,
2400,2400.DTP03,Date Time Period,,,,,,,,,,,
2400,QTY,Ambulance Patient Count,,,,,,,,,,,
2400,2400.QTY01,Quantity Qualifier,,,PT Patients,,,,,,,,
2400,2400.QTY02,Quantity,,,,,,,,,,,
2400,QTY,Obstetric Anesthesia Additional Units,,,,,,,,,,,
2400,2400.QTY01,Quantity Qualifier,,,FL Units,,,,,,,,
2400,2400.QTY02,Quantity,,,,,,,,,,,
2400,MEA,Test Result,,,,,,,,,,,
2400,2400.MEA01,Measurement Reference ID Code,,,"OG Original
TR Test Results",,,,,,,,
2400,2400.MEA02,Measurement Qualifier,,,"HT Height
R1 Hemoglobin
R2 Hematocrit
R3 Epoetin Starting Dosage
R4 Creatinine",,,,,,,,
2400,2400.MEA03,Measurement Value,,,,,,,,,,,
2400,CN1,Contract Information,,,,,,,,,,,
2400,2400.CN101,Contract Type Code,,,"01 Diagnosis Related Group (DRG)
02 Per Diem
03 Variable Per Diem
04 Flat
05 Capitated
06 Percent
09 Other",,,,,,,,
2400,2400.CN102,Monetary Amount,,,,,,,,,,,
2400,2400.CN103,"Percent, Decimal Format",,,,,,,,,,,
2400,2400.CN104,Reference Identification,,,,,,,,,,,
2400,2400.CN105,Terms Discount Percent,,,,,,,,,,,
2400,2400.CN106,Version Identifier,,,,,,,,,,,
2400,REF,Repriced Line Item Reference Number,,,,,,,,,,,
2400,2400.REF01,Reference Identification Qualifier,,,9B Repriced Line Item Reference Number,,,,,,,,
2400,2400.REF02,Reference Identification,,,,,,,,,,,
2400,REF,Adjusted Repriced Line Item Reference Number,,,,,,,,,,,
2400,2400.REF01,Reference Identification Qualifier,,,9D Adjusted Repriced Line Item Reference Number,,,,,,,,
2400,2400.REF02,Reference Identification,,,,,,,,,,,
2400,REF,Prior Authorization,,,,,,,,,,,
2400,2400.REF01,Reference Identification Qualifier,,,G1 Prior Authorization Number,,,,,,,,
2400,2400.REF02,Reference Identification,,,,,,,,,,,
2400,2400.REF04.01,Reference Identification Qualifier,,,2U Payer Identification Number,,,,,,,,
2400,2400.REF04.02,Reference Identification,,,,,,,,,,,
2400,REF,Line Item Control Number,,,,,,,,,,,
2400,2400.REF01,Reference Identification Qualifier,,,6R Provider Control Number,,,,,,,,
2400,2400.REF02,Reference Identification,,,,,,,,,,,
2400,REF,Mammography Certification Number,,,,,,,,,,,
2400,2400.REF01,Reference Identification Qualifier,,,EW Mammography Certification Number,,,,,,,,
2400,2400.REF02,Reference Identification,,,,,,,,,,,
2400,REF,Clinical Laboratory Improvement Amendment (CLIA) Number,,,,,,,,,,,
2400,2400.REF01,Reference Identification Qualifier,,,"X4 Clinical Laboratory Improvement Amendment
Number",,,,,,,,
2400,2400.REF02,Reference Identification,,,,,,,,,,,
2400,REF,Referring Clinical Laboratory Improvement Amendment (CLIA) Facility Identification,,,,,,,,,,,
2400,2400.REF01,Reference Identification Qualifier,,,F4 Facility Certification Number,,,,,,,,
2400,2400.REF02,Reference Identification,,,,,,,,,,,
2400,REF,Immunization Batch Number,,,,,,,,,,,
2400,2400.REF01,Reference Identification Qualifier,,,BT Batch Number,,,,,,,,
2400,2400.REF02,Reference Identification,,,,,,,,,,,
2400,REF,Referral Number,,,,,,,,,,,
2400,2400.REF01,Reference Identification Qualifier,,,9F Referral Number,,,,,,,,
2400,2400.REF02,Reference Identification,,,,,,,,,,,
2400,2400.REF04.01,Reference Identification Qualifier,,,2U Payer Identification Number,,,,,,,,
2400,2400.REF04.02,Reference Identification,,,,,,,,,,,
2400,AMT,Sales Tax Amount,,,,,,,,,,,
2400,2400.AMT01,Amount Qualifier Code,,,T Tax,,,,,,,,
2400,2400.AMT02,Monetary Amount,,,,,,,,,,,
2400,AMT,Postage Claimed Amount,,,,,,,,,,,
2400,2400.AMT01,Amount Qualifier Code,,,F4 Postage Claimed,,,,,,,,
2400,2400.AMT02,Monetary Amount,,,,,,,,,,,
2400,K3,File Information,,,,,,,,,,,
2400,2400.K301,Fixed Format Information,,,,,,,,,,,
2400,NTE,Line Note,,,,,,,,,,,
2400,2400.NTE01,Note Reference Code,,,"ADD Additional Information
DCP Goals, Rehabilitation Potential, or Discharge Plans",,,,,,,,
2400,2400.NTE02,Description,,,,,,,,,,,
2400,NTE,Third Party Organization Notes,,,,,,,,,,,
2400,2400.NTE01,Note Reference Code,,,TPO Third Party Organization Notes,,,,,,,,
2400,2400.NTE02,Description,,,,,,,,,,,
2400,PS1,Purchased Service Information,,,,,,,,,,,
2400,2400.PS101,Reference Identification,,,,,,,,,,,
2400,2400.PS102,Monetary Amount,,,,,,,,,,,
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
14 Adjustment Pricing",Hardcode as 03,,,,,,,
2400,2400.HCP02,Monetary Amount,,,,,ALLOWED_AMOUNT,184,Line,,Multiplan,,
2400,2400.HCP03,Monetary Amount,,,,,PPO_discount,517,Line,,Zelis,,
2400,2400.HCP04,Reference Identification,,,,,PPO_ID,518,Line,,Zelis,,
2400,2400.HCP05,Rate,,,,,,,,,,,
2400,2400.HCP06,Reference Identification,,,,,,,,,,,
2400,2400.HCP07,Monetary Amount,,,,,,,,,,,
2400,2400.HCP09,Product/Service ID Qualifier,,,"ER Jurisdiction Specific Procedure and Supply Codes
HC Health Care Financing Administration Common
Procedural Coding System (HCPCS) Codes
IV Home Infusion EDI Coalition (HIEC) Product/Service
Code
WK Advanced Billing Concepts (ABC) Codes",,,,,,,,
2400,2400.HCP10,Product/Service ID,,,,,,,,,,,
2400,2400.HCP11,Unit or Basis for Measurement Code,,,"MJ Minutes
UN Unit",,UNITS_TYPE,167,Line,,,,
2400,2400.HCP12,Quantity,,,,,ALLOWED_UNITS,183,Line,,Multiplan,,
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
LOOP 2410 - 2410 DRUG IDENTIFICATION,,,,,,,,,,,,,
2410,LIN,Drug Identification,,S,,,,,,,,,
2410,2410.LIN02,Product/Service ID Qualifier,Code identifying the type/source of the descriptive number used in Product/Service ID (234),R,N4 National Drug Code in 5-4-2 Format,"Hardcode as ""N4""",,,,Only if SUB_NDC  has values,,,
2410,2410.LIN03,Product/Service ID,Identifying number for a product or service,R,,,SUB_NDC,171,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/ndcCodes/NDCCode/ndcCode,
2410,CTP,Drug Quantity (Required),,R,,,,,,,,,
2410,2410.CTP04,Quantity,Numeric value of quantity,R,,,SUB_NDC_UNITS,172,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/ndcCodes/NDCCode/quantity,
2410,2410.CTP05.01,Unit or Basis for Measurement Code,"Code specifying the units in which a value is being expressed, or manner in which a measurement has been taken",R,"F2 International Unit
GR Gram
ME Milligram
ML Milliliter
UN Unit",,SUB_NDC_UNITS_TYPE,173,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/ndcCodes/NDCCode/measurementType,
2410,REF,Prescription or Compound Drug Association Number,,,,,,,,,,,
2410,2410.REF01,Reference Identification Qualifier,,,"VY Link Sequence Number
XZ Pharmacy Prescription Number",,,,,,,,
2410,2410.REF02,Reference Identification,,,,,,,,,,,
LOOP 2420A - RENDERING PROVIDER NAME,,,,,,,,,,,,,
2420A,NM1,Rendering Provider Name,,S,,,,,,,,Export is different from Loop 2310B,
2420A,2420A.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individua",R,82 Rendering Provider,"Hardcode as ""82""",,,,,,,
2420A,2420A.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,"1 Person
2 Non-Person Entity","Hardcode as ""1""",,,,,,,
2420A,2420A.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,RENDERING_PRACTITIONER__LAST_NAME,85,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/renderingPractitioner/practitioner/lastName,
2420A,2420A.NM104,Name First,ndividual first name,S,,,RENDERING_PRACTITIONER__FIRST_NAME,86,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/renderingPractitioner/practitioner/firstName,
2420A,2420A.NM105,Name Middle,Individual middle name or initia,S,,,RENDERING_PRACTITIONER__MIDDLE_NAME,87,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/renderingPractitioner/practitioner/middleName,
2420A,2420A.NM107,Name Suffix,Suffix to individual name,S,,,RENDERING_PRACTITIONER__NAME_SUFFIX,88,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/renderingPractitioner/practitioner/nameSuffix,
2420A,2420A.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),S,"XX Centers for Medicare and Medicaid Services
National Provider Identifier","Hardcode as ""XX""",,,,,,,
2420A,2420A.NM109,Identification Code,Code identifying a party or other code,S,,,RENDERING_PRACTITIONER__NPI,80,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/renderingPractitioner/NPI,
2420A,PRV,Rendering Provider Specialty Information,,S,,,,,,,,,
2420A,2420A.PRV01,Provider Code,Code identifying the type of provider,R,PE Performing,"Hardcode as ""PE""",,,,,,,
2420A,2420A.PRV02,Reference Identification Qualifier,Code qualifying the Reference Identification,R,PXC Health Care Provider Taxonomy Code,"Hardcode as ""PXC""",,,,,,,
2420A,2420A.PRV03,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,RENDERING_PRACTITIONER__TAXONOMY_CODE,83,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/renderingPractitioner/primarySpecialty/taxonomyCode,
2420A,REF,Rendering Provider Secondary Identification,,S,,,,,,,,,
2420A,2420A.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number
LU Location Number",,,,,,,,
2420A,2420A.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,,
2420A,2420A.REF04.01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,2U Payer Identification Number,,,,,,,,
2420A,2420A.REF04.02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,,
"LOOP 2420B - PURCHASED SERVICE PROVIDER
NAME",,,,,,,,,,,,,
2420B,NM1,Purchased Service Provider Name,,,,,,,,,,,
2420B,2420B.NM101,Entity Identifier Code,,,QB Purchase Service Provider,,,,,,,,
2420B,2420B.NM102,Entity Type Qualifier,,,"1 Person
2 Non-Person Entity",,,,,,,,
2420B,2420B.NM108,Identification Code Qualifier,,,"XX Centers for Medicare and Medicaid Services
National Provider Identifier",,,,,,,,
2420B,2420B.NM109,Identification Code,,,,,,,,,,,
2420B,REF,Purchased Service Provider Secondary Identification,,,,,,,,,,,
2420B,2420B.REF01,Reference Identification Qualifier,,,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number",,,,,,,,
2420B,2420B.REF02,Reference Identification,,,,,,,,,,,
2420B,2420B.REF04.01,Reference Identification Qualifier,,,2U Payer Identification Number,,,,,,,,
2420B,2420B.REF04.02,Reference Identification,,,,,,,,,,,
"LOOP 2420C - SERVICE FACILITY LOCATION
NAME",,,,,,,,,,,,,
2420C,NM1,Service Facility Location Name,,,,,,,,,,,
2420C,2420C.NM101,Entity Identifier Code,,,77 Service Location,,,,,,,,
2420C,2420C.NM102,Entity Type Qualifier,,,2 Non-Person Entity,,,,,,,,
2420C,2420C.NM103,Name Last or Organization Name,,,,,,,,,,,
2420C,2420C.NM108,Identification Code Qualifier,,,"XX Centers for Medicare and Medicaid Services
National Provider Identifier",,,,,,,,
2420C,2420C.NM109,Identification Code,,,,,,,,,,,
2420C,N3,Service Facility Location Address (Required),,,,,,,,,,,
2420C,2420C.N301,Address Information,,,,,,,,,,,
2420C,2420C.N302,Address Information,,,,,,,,,,,
2420C,N4,"Service Facility Location City, State, ZIP Code (Required)",,,,,,,,,,,
2420C,2420C.N401,City Name,,,,,,,,,,,
2420C,2420C.N402,State or Province Code,,,,,,,,,,,
2420C,2420C.N403,Postal Code,,,,,,,,,,,
2420C,2420C.N404,Country Code,,,,,,,,,,,
2420C,2420C.N407,Country Subdivision Code,,,,,,,,,,,
2420C,REF,Service Facility Location Secondary Identification,,,,,,,,,,,
2420C,2420C.REF01,Reference Identification Qualifier,,,"G2 Provider Commercial Number
LU Location Number",,,,,,,,
2420C,2420C.REF02,Reference Identification,,,,,,,,,,,
2420C,2420C.REF04.01,Reference Identification Qualifier,,,2U Payer Identification Number,,,,,,,,
2420C,2420C.REF04.02,Reference Identification,,,,,,,,,,,
LOOP 2420D - SUPERVISING PROVIDER NAME,,,,,,,,,,,,,
2420D,NM1,Supervising Provider Name,,,,,,,,,,,
2420D,2420D.NM101,Entity Identifier Code,,,DQ Supervising Physician,,,,,,,,
2420D,2420D.NM102,Entity Type Qualifier,,,1 Person,,,,,,,,
2420D,2420D.NM103,Name Last or Organization Name,,,,,,,,,,,
2420D,2420D.NM104,Name First,,,,,,,,,,,
2420D,2420D.NM105,Name Middle,,,,,,,,,,,
2420D,2420D.NM107,Name Suffix,,,,,,,,,,,
2420D,2420D.NM108,Identification Code Qualifier,,,"XX Centers for Medicare and Medicaid Services
National Provider Identifier",,,,,,,,
2420D,2420D.NM109,Identification Code,,,,,,,,,,,
2420D,REF,Supervising Provider Secondary Identification,,,,,,,,,,,
2420D,2420D.REF01,Reference Identification Qualifier,,,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number
LU Location Number",,,,,,,,
2420D,2420D.REF02,Reference Identification,,,,,,,,,,,
2420D,2420D.REF04.01,Reference Identification Qualifier,,,2U Payer Identification Number,,,,,,,,
2420D,2420D.REF04.02,Reference Identification,,,,,,,,,,,
LOOP 2420E - ORDERING PROVIDER NAME,,,,,,,,,,,,,
2420E,NM1,Ordering Provider Name,,,,,,,,,,,
2420E,2420E.NM101,Entity Identifier Code,,,DK Ordering Physician,,,,,,,,
2420E,2420E.NM102,Entity Type Qualifier,,,1 Person,,,,,,,,
2420E,2420E.NM103,Name Last or Organization Name,,,,,,,,,,,
2420E,2420E.NM104,Name First,,,,,,,,,,,
2420E,2420E.NM105,Name Middle,,,,,,,,,,,
2420E,2420E.NM107,Name Suffix,,,,,,,,,,,
2420E,2420E.NM108,Identification Code Qualifier,,,"XX Centers for Medicare and Medicaid Services
National Provider Identifier",,,,,,,,
2420E,2420E.NM109,Identification Code,,,,,,,,,,,
2420E,N3,Ordering Provider Address,,,,,,,,,,,
2420E,2420E.N301,Address Information,,,,,,,,,,,
2420E,2420E.N302,Address Information,,,,,,,,,,,
2420E,N4,"Ordering Provider City, State, ZIP Code",,,,,,,,,,,
2420E,2420E.N401,City Name,,,,,,,,,,,
2420E,2420E.N402,State or Province Code,,,,,,,,,,,
2420E,2420E.N403,Postal Code,,,,,,,,,,,
2420E,2420E.N404,Country Code,,,,,,,,,,,
2420E,2420E.N407,Country Subdivision Code,,,,,,,,,,,
2420E,REF,Ordering Provider Secondary Identification,,,,,,,,,,,
2420E,2420E.REF01,Reference Identification Qualifier,,,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number",,,,,,,,
2420E,2420E.REF02,Reference Identification,,,,,,,,,,,
2420E,2420E.REF04.01,Reference Identification Qualifier,,,2U Payer Identification Number,,,,,,,,
2420E,2420E.REF04.02,Reference Identification,,,,,,,,,,,
2420E,PER,Ordering Provider Contact Information,,,,,,,,,,,
2420E,2420E.PER01,Contact Function Code,,,IC Information Contact,,,,,,,,
2420E,2420E.PER02,Name,,,,,,,,,,,
2420E,2420E.PER03,Communication Number Qualifier,,,"EM Electronic Mail
FX Facsimile
TE Telephone",,,,,,,,
2420E,2420E.PER04,Communication Number,,,,,,,,,,,
2420E,2420E.PER05,Communication Number Qualifier,,,"EM Electronic Mail
EX Telephone Extension
FX Facsimile
TE Telephone",,,,,,,,
2420E,2420E.PER06,Communication Number,,,,,,,,,,,
2420E,2420E.PER07,Communication Number Qualifier,,,"EM Electronic Mail
EX Telephone Extension
FX Facsimile
TE Telephone",,,,,,,,
2420E,2420E.PER08,Communication Number,,,,,,,,,,,
LOOP 2420F - REFERRING PROVIDER NAME,,,,,,,,,,,,,
2420F,NM1,Referring Provider Name,,,,,,,,,,,
2420F,2420F.NM101,Entity Identifier Code,,,"DN Referring Provider
P3 Primary Care Provider",,,,,,,,
2420F,2420F.NM102,Entity Type Qualifier,,,1 Person,,,,,,,,
2420F,2420F.NM103,Name Last or Organization Name,,,,,,,,,,,
2420F,2420F.NM104,Name First,,,,,,,,,,,
2420F,2420F.NM105,Name Middle,,,,,,,,,,,
2420F,2420F.NM107,Name Suffix,,,,,,,,,,,
2420F,2420F.NM108,Identification Code Qualifier,,,"XX Centers for Medicare and Medicaid Services
National Provider Identifier",,,,,,,,
2420F,2420F.NM109,Identification Code,,,,,,,,,,,
2420F,REF,Referring Provider Secondary Identification,,,,,,,,,,,
2420F,2420F.REF01,Reference Identification Qualifier,,,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number",,,,,,,,
2420F,2420F.REF02,Reference Identification,,,,,,,,,,,
2420F,2420F.REF04.01,Reference Identification Qualifier,,,2U Payer Identification Number,,,,,,,,
2420F,2420F.REF04.02,Reference Identification,,,,,,,,,,,
LOOP 2420G - AMBULANCE PICK-UP LOCATION,,,,,,,,,,,,,
2420G,NM1,Ambulance Pick-up Location,,,,,,,,,,,
2420G,2420G.NM101,Entity Identifier Code,,,PW Pickup Address,,,,,,,,
2420G,2420G.NM102,Entity Type Qualifier,,,2 Non-Person Entity,,,,,,,,
2420G,N3,Ambulance Pick-up Location Address (Required),,,,,,,,,,,
2420G,2420G.N301,Address Information,,,,,,,,,,,
2420G,2420G.N302,Address Information,,,,,,,,,,,
2420G,N4,"Ambulance Pick-up Location City, State, ZIP Code (Required)",,,,,,,,,,,
2420G,2420G.N401,City Name,,,,,,,,,,,
2420G,2420G.N402,State or Province Code,,,,,,,,,,,
2420G,2420G.N403,Postal Code,,,,,,,,,,,
2420G,2420G.N404,Country Code,,,,,,,,,,,
2420G,2420G.N407,Country Subdivision Code,,,,,,,,,,,
LOOP 2420H - AMBULANCE DROP-OFF LOCATION,,,,,,,,,,,,,
2420H,NM1,Ambulance Drop-off Location,,,,,,,,,,,
2420H,2420H.NM101,Entity Identifier Code,,,45 Drop-off Location,,,,,,,,
2420H,2420H.NM102,Entity Type Qualifier,,,2 Non-Person Entity,,,,,,,,
2420H,2420H.NM103,Name Last or Organization Name,,,,,,,,,,,
2420H,N3,Ambulance Drop-off Location Address (Required),,,,,,,,,,,
2420H,2420H.N301,Address Information,,,,,,,,,,,
2420H,2420H.N302,Address Information,,,,,,,,,,,
2420H,N4,"Ambulance Drop-off Location City, State, ZIP Code (Required)",,,,,,,,,,,
2420H,2420H.N401,City Name,,,,,,,,,,,
2420H,2420H.N402,State or Province Code,,,,,,,,,,,
2420H,2420H.N403,Postal Code,,,,,,,,,,,
2420H,2420H.N404,Country Code,,,,,,,,,,,
2420H,2420H.N407,Country Subdivision Code,,,,,,,,,,,
LOOP 2430 - LINE ADJUDICATION INFORMATION,,,,,,,,,,,,,
2430,SVD,Line Adjudication Information,,,,Map this loop only if REPRICER_NAME/EXTERNAL_EDITOR  is 'Zelis',,,,,,,
2430,2430.SVD01,Identification Code,,,,"Default value ""1234567"" (same as 2010BB.NM109)",,,,,"Configurable value for Implementation team
updated default values",,
2430,2430.SVD02,Monetary Amount,,,,,SUB_AMOUNT,169,Line,,,,
2430,2430.SVD03.01,Product/Service ID Qualifier,,,"ER Jurisdiction Specific Procedure and Supply Codes
HC Health Care Financing Administration Common
Procedural Coding System (HCPCS) Codes
IV Home Infusion EDI Coalition (HIEC) Product/Service
Code
WK Advanced Billing Concepts (ABC) Codes",Hardcode 'HC',,,,,,,
2430,2430.SVD03.02,Product/Service ID,,,,,SUB_HCPCS,158,Line,,,,
2430,2430.SVD03.03,Procedure Modifier,,,,,SUB_MOD_01,159,Line,,,,
2430,2430.SVD03.04,Procedure Modifier,,,,,SUB_MOD_02,160,Line,,,,
2430,2430.SVD03.05,Procedure Modifier,,,,,SUB_MOD_03,161,Line,,,,
2430,2430.SVD03.06,Procedure Modifier,,,,,SUB_MOD_04,162,Line,,,,
2430,2430.SVD03.07,Description,,,,,,,,,,,
2430,2430.SVD05,Quantity,,,,,SUB_UNITS,168,Line,,,,
2430,2430.SVD06,Assigned Number,,,,,,,,,,,
2430,CAS,Line Adjustment,,,,,,,,,,,
2430,2430.CAS01,Claim Adjustment Group Code,,,"CO Contractual Obligations
CR Correction and Reversals
OA Other adjustments
PI Payor Initiated Reductions
PR Patient Responsibility",Hardcode 'PR',,,,,,,
2430,2430.CAS02,Claim Adjustment Reason Code,,,,Hardcode '1',,,,If  DEDUCTIBLE_AMOUNT is not zero,,,
2430,2430.CAS03,Monetary Amount,,,,,DEDUCTIBLE_AMOUNT,191,Line,,,,
2430,2430.CAS04,Quantity,,,,,,,,,,,
2430,2430.CAS05,Claim Adjustment Reason Code,,,,Hardcode '2',,,,If COINSURANCE_AMOUNT is not zero,,,
2430,2430.CAS06,Monetary Amount,,,,,COINSURANCE_AMOUNT,190,Line,,,,
2430,2430.CAS07,Quantity,,,,,,,,,,,
2430,2430.CAS08,Claim Adjustment Reason Code,,,,Hardcode '3',,,,If COPAY_AMOUNT is not zero,,,
2430,2430.CAS09,Monetary Amount,,,,,COPAY_AMOUNT,189,Line,,,,
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
2430,DTP,Line Check or Remittance Date (Required),,,,,,,,,,,
2430,2430.DTP01,Date/Time Qualifier,,,573 Date Claim Paid,Hardcode '573',,,,,,,
2430,2430.DTP02,Date Time Period Format Qualifier,,,D8 Date Expressed in Format CCYYMMDD,Hardcode D8,,,,,,,
2430,2430.DTP03,Date Time Period,,,,Populate current date in format CCYYMMDD,,,,,,,
2430,AMT,Remaining Patient Liability,,,,,,,,,,,
2430,2430.AMT01,Amount Qualifier Code,,,EAF Amount Owed,,,,,,,,
2430,2430.AMT02,Monetary Amount,,,,,,,,,,,
LOOP 2440 - FORM IDENTIFICATION CODE,,,,,,,,,,,,,
2440,LQ,Form Identification Code,,,,,,,,,,,
2440,2440.LQ01,Code List Qualifier Code,,,"AS Form Type Code
UT Centers for Medicare and Medicaid Services (CMS)
Durable Medical Equipment Regional Carrier
(DMERC) Certificate of Medical Necessity (CMN)
Forms",,,,,,,,
2440,2440.LQ02,Industry Code,,,,,,,,,,,
2440,FRM,Supporting Documentation (Required),,,,,,,,,,,
2440,2440.FRM01,Assigned Identification,,,,,,,,,,,
2440,2440.FRM02,Yes/No Condition or Response Code,,,"N No
W Not Applicable
Y Yes",,,,,,,,
2440,2440.FRM03,Reference Identification,,,,,,,,,,,
2440,2440.FRM04,Date,,,,,,,,,,,
2440,2440.FRM05,"Percent, Decimal Format",,,,,,,,,,,
,SE,Transaction Set Trailer (Required),,,,,,,,,,,
,SE01,Number of Included Segments,,,,Count Of ST,,,,,,,
,SE02,Transaction Set Control Number,,,,,,,,,,,
,GE,Functional Group Trailer (Required),,,,,,,,,,,
,GE01,Number of Transaction Sets Included,,,,Count Of GS,,,,,,,
,GE02,Group Control Number,,,,GS06 Value,,,,,,,
,IEA,Interchange Control Trailer (Required),,,,,,,,,,,
,IEA01,Number of Included Functional Groups,,,,Count Of ISA,,,,,,,
,IEA02,Interchange Control Number,,,,ISA13 Value,,,,,,,
```

## Secondary Editing OB/V26.1.0.0/EdifecsProduct_MappingSpec_OB Secondary Editing_837_DFF_to_EDI Conversion_V1.0.xlsx — 837I Mapping 

```csv
Loop ID,EDI Segment,EDI Data Element Name,EDI Element Description,Usage,Enumeration Values,Hardcode,Extract layout name,Position,Level,Mapping Logic,COMMENTS,PIEDMONT
,ISA,Segment: Interchange Control Header,,R,,,,,,,,
,ISA01,Authorization Information Qualifier,"Code identifying the type of
information in the Authorization Information",R,"00 No Authorization Information Present (No Meaningful Information in I02)
03 Additional Data Identification","Hardcode as ""00""",,,,,,
,ISA02,Authorization Information,Information used for additional identification or authorization of the interchange sender or the data in the interchange; the type of information is set by the Authorization Information Qualifier (I01),R,,Leave it blank,,,,,,
,ISA03,Security Information Qualifier,"Code identifying the type of
 information in the Security Information",R,"00 No Security Information Present (No Meaningful Information in I04)
01 Password","Hardcode as ""00""",,,,,,
,ISA04,Security Information,This is used for identifying the security information about the interchange sender or the data in the interchange; the type of information is set by the Security Information Qualifier (I03),R,,Leave it blank,,,,,,
,ISA05,Interchange ID Qualifier,Code indicating the system/method of code structure used to designate the sender or receiver ID element being qualified,R,"01: Duns (Dun & Bradstreet)
14: Duns Plus Suffix
20: Health Industry Number (HIN)
       CODE SOURCE 121: Health Industry Number
27: Carrier Identification Number as assigned by Health Care Financing Administration (HCFA)
28: Fiscal Intermediary Identification Number as assigned by Health Care Financing Administration (HCFA)
29: Medicare Provider and Supplier Identification Number as assigned by Health Care Financing Administration (HCFA)
30: U.S. Federal Tax Identification Number
33: National Association of Insurance Commissioners Company Code (NAIC)
ZZ: Mutually Defined","Hardcode as ""ZZ""",,,,,,
,ISA06,Interchange Sender ID,Identification code published by the sender for other parties to use as the receiver ID to route data to them; the sender always codes this value in the sender ID element,R,,"We need to refer the crosswalk for mapping the sender id for products is ""PRODUCT""",,,,,"Configurable value for Implementation team
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
ZZ :Mutually Defined","Hardcode as ""ZZ""",,,,,,
,ISA08,Interchange Receiver ID,"Identification code published by the receiver of the data; When sending, it is used by the sender as their sending ID, thus other parties sending to them will use this as a receiving ID to route data to them",R,,Hardcode  <default value>,,,,,"Configurable value for Implementation team
updated default values",
,ISA09,Interchange Date,Date of the interchange,R,,"Map this value from  current date in the format of ""YYMMDD""",,,,,,
,ISA10,Interchange Time,Time of the interchange,R,,Map this value from   current time in the format of HHMM,,,,,,
,ISA11,Repetition Separator,"Type is not applicable; the repetition separator is a delimiter and not a data element; this field provides the delimiter used to separate repeated occurrences of a simple data element or a composite data structure; this value must be different than the data element separator, component element separator, and the segment terminator",R,,"Hardcode as ""^""",,,,,,
,ISA12,Interchange Control Version Number,$)$,R,00501 : Standards Approved for Publication by ASC X12 Procedures Review Board through October 2003,Hardcode as “00501”,,,,,,
,ISA13,Interchange Control Number,A control number assigned by the interchange sender,R,,Unique ISI control number needs to generated in Edifecs for each 837 EDI file. It has to be 9 digits (for example -  000000764),,,,,,
,ISA14,Acknowledgment Requested,Code indicating sender’s request for an interchange acknowledgment,R,"0 : No Interchange Acknowledgment Requested
1 : Interchange Acknowledgment Requested (TA1)","Hardcode as ""0""",,,,,,
,ISA15,Interchange Usage Indicator,"Code indicating whether data enclosed by this interchange envelope is test, production or information",R,"P : Production Data
T : Test Data","""P""  if it is a Production region
""T""  if it is a Non-Production region",,,,,According to enviroinment it should be configurable,
,ISA16,Component Element Separator,Type is not applicable; the component element separator is a delimiter and not a data element; this field provides the delimiter used to separate component data elements within a composite data structure; this value must be different than the data element separator and the segment terminator,R,,"Hardcode  as "":""",,,,,,
GS (Functional Group Header),,,,,,,,,,,,
,GS,Segment: Functional Group Header,,R,,,,,,,,
,GS01,Functional Identifier Code,Code identifying a group of application related transaction sets,R,,Hardcode as “HC”,,,,,,
,GS02,Application Sender's Code,Code identifying party sending transmission; codes agreed to by trading partners,R,,"We need to refer the crosswalk for mapping the sender id for products is ""PRODUCT""",,,,"Application Sender Code will be different for each customer.From product standpoint, we have hardcoded a random Application Sender Code.","Configurable value for Implementation team
PRODUCT",ClaimServiceStronglyTypedOBResponseRoot/header/senderId
,GS03,Application Receiver's Code,Code identifying party receiving transmission; codes agreed to by trading partners,R,,"Reveiver code for products is ""PRODUCT""",,,,"Application Receiver ID will be different for each customer.From product standpoint, we have hardcoded a random Application Application Receiver ID.","Configurable value for Implementation team
PRODUCT",
,GS04,Date,Date expressed as CCYYMMDD where CC represents the first two digits of the calendar year,R,,"Map this value from  current date in the format of ""YYYYMMDD""",,,,,,
,GS05,Time,"Time expressed in 24-hour clock time as follows: HHMM, or HHMMSS, or HHMMSSD, or HHMMSSDD, where H = hours (00-23), M = minutes (00-59), S = integer seconds (00-59) and DD = decimal seconds; decimal seconds are expressed as follows: D = tenths (0-9) and DD = hundredths (00-99)",R,,"Map this value from   current Time in the format of ""HHMMSS""",,,,,,
,GS06,Group Control Number,Assigned number originated and maintained by the sender,R,,Generate ID In EDIFECS (1-9 Bytes),,,,,,
,GS07,Responsible Agency Code,Code identifying the issuer of the standard; this code is used in conjunction with Data Element 480,R,X : Accredited Standards Committee X12,"Hardcode as ""X""",,,,,,
,GS08,Version / Release / Industry Identifier Code,"Code indicating the version, release, subrelease, and industry identifier of the EDI standard being used, including the GS and GE segments; if code in DE455 in GS segment is X, then in DE 480 positions 1-3 are the version number; positions 4-6 are the release and subrelease, level of the version; and positions 7-12 are the industry or trade association identifiers (optionally assigned by user); if code in DE455 in GS segment is T, then other formats are allowed",R,005010X223 : Standards Approved for Publication by ASC X12 Procedures Review Board through October 2003,"Hardcode as ""005010X222A2""",,,,,,
ST Transaction Set Header,,,,,,,,,,,,
,ST,Segment: Transaction Set Header,,R,,,,,,,,
,ST01,Transaction Set Identifier Code,Code uniquely identifying a Transaction Set,R,837 : Health Care Claim,837,,,,,,
,ST02,Transaction Set Control Number,Identifying control number that must be unique within the transaction set functional group assigned by the originator for a transaction set,R,,Unique control number needs to populated from process flow or map,,,,,,
,ST03,Implementation Convention Reference,Reference assigned to identify Implementation Convention,R,,005010X222A2,,,,,,
BHT Beginning of Hierarchical Transaction,,,,,,,,,,,,
,BHT,Segment: Beginning of Hierarchical Transaction,,R,,,,,,,,
,BHT01,Hierarchical Structure Code,Code indicating the hierarchical application structure of a transaction set that utilizes the HL segment to define the structure of the transaction set,R,"0019 : Information Source, Subscriber, Dependent",0019,,,,,,t
,BHT02,Transaction Set Purpose Code,Code identifying purpose of transaction set,R,"00 : Original
18 : Reissue","Hardcode as ""00""",,,,,,
,BHT03,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,Auto Generate In EDIFECS.,,,,,,
,BHT04,Date,Date expressed as CCYYMMDD where CC represents the first two digits of the calendar year,R,,"Map this value from  current date in the format of ""YYYYMMDD""",,,,,,
,BHT05,Time,"Time expressed in 24-hour clock time as follows: HHMM, or HHMMSS, or HHMMSSD, or HHMMSSDD, where H = hours (00-23), M = minutes (00-59), S = integer seconds (00-59) and DD = decimal seconds; decimal seconds are expressed as follows: D = tenths (0-9) and DD = hundredths (00-99)",R,,"Map this value from   current Time in the format of ""HHMMSS""",,,,,,
,BHT06,Transaction Type Code,Code specifying the type of transaction,R,"31 :  Subrogation Demand
CH : Chargeable
RP :  Reporting","Hardcode as ""RP""",,,,,,
LOOP 1000A - SUBMITTER,,,,,,,,,,,,
1000A,NM1,Submitter Name (Required),,R,,,,,,,,
1000A,1000A.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,41 : Submitter,"Hardcode as ""41""",,,,,,
1000A,1000A.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,"1 : Person
2 : Non-Person Entity","Hardcode as ""2""",,,,,,
1000A,1000A.NM103,Name Last or Organization Name,ndividual last name or organizational name,R,,Hardcode <Default>,,,,,"Configurable value for Implementation team
PRODUCT",ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/payerInformation/hicName
1000A,1000A.NM104,Name First,Individual first name,S,,,,,,,,
1000A,1000A.NM105,Name Middle,Individual middle name or initial,S,,,,,,,,
1000A,1000A.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),R,46 : Electronic Transmitter Identification Number (ETIN),"Hardcode as ""46""",,,,,,
1000A,1000A.NM109,Identification Code,Code identifying a party or other code,R,,"Default values
<123456789123>",,,,,"Configurable value for Implementation team
updated default values",ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/payerInformation/taxId
1000A,PER,Submitter EDI Contact Information (Required),,R,,,,,,,,
1000A,1000A.PER01,Contact Function Code,Code identifying the major duty or responsibility of the person or group named,R,IC : Information Contact,"Hardcode  as ""IC""",,,,,,
1000A,1000A.PER02,Name,Free-form name,S,,"""PRODUCT""",,,,,Configurable value for Implementation team,"Qn, 05/20 - what needs to be populated here for Piedmont?"
1000A,1000A.PER03,Communication Number Qualifier,Code identifying the type of communication number,R,"EM : Electronic Mail
 FX : Facsimile
TE : Telephone","Hardcode  as ""TE""",,,,,,
1000A,1000A.PER04,Communication Number,Complete communications number including country or area code when applicable,R,,"Hardcode as ""1234567890""",,,,,"Configurable value for Implementation team
updated default values","Qn, 05/20 -What will be the contact number for Piedmont?"
1000A,1000A.PER05,Communication Number Qualifier,Code identifying the type of communication number,S,"EM : Electronic Mail
EX : Telephone Extension
FX : Facsimile
TE : Telephone",,,,,,,
1000A,1000A.PER06,Communication Number,Complete communications number including country or area code when applicable,S,,,,,,,,
1000A,1000A.PER07,Communication Number Qualifier,Code identifying the type of communication number,S,"EM : Electronic Mail
EX : Telephone Extension
FX : Facsimile
TE : Telephone",,,,,,,
1000A,1000A.PER08,Communication Number,Complete communications number including country or area code when applicable,S,,,,,,,,
LOOP 1000B - RECEIVER,,,,,,,,,,,,
1000B,NM1,Receiver Name (Required),,R,,,,,,,,
1000B,1000B.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,40 : Receiver,"Hardcode as ""40""",,,,,,
1000B,1000B.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,2 : Non-Person Entity,"Hardcode as ""2""",,,,,,
1000B,1000B.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,REPRICER_NAME/EXTERNAL_EDITOR,827,Claim,,"Configurable value for Implementation team
PRODUCT","Qn, 05/20- If we can get the Receiver ID for First health and Aetna, EDIFECS can populate the Org name here. So need to get the Full name to be populated for both and Receiver id's
Details for First Health seems as below. Needs to get for Aetna also
Org Name: FIRST HEALTH Group Corp
Receiver id: 201736437"
1000B,1000B.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),R,46 : Electronic Transmitter Identification Number (ETIN),"Hardcode as ""46""",,,,,,
1000B,1000B.NM109,Identification Code,Code identifying a party or other code,R,,"Default values
<123456789123>",,,,,configurable item need to update (based on repricer name,
LOOP 2000A - BILLING/PAY-TO PROVIDER HL LOOP,,,,,,,,,,,,
2000A,HL,Billing Provider Hierarchical Level (Required),,R,,,,,,,,
2000A,2000A.HL01,Hierarchical ID Number,A unique number assigned by the sender to identify a particular data segment in a hierarchical structure,R,"The first HL01 within each ST-SE envelope must begin with “1”,
and be incremented by one each time an HL is used in the
transaction. Only numeric values are allowed in HL01.",Generated by Edifecs,,,,,,
2000A,2000A.HL03,Hierarchical Level Code,Code defining the characteristic of a level in a hierarchical structure,R,20 : Information Source,"Hardcode as ""20""",,,,,,
2000A,2000A.HL04,Hierarchical Child Code,Code indicating if there are hierarchical child data segments subordinate to the level being described,R,1 : Additional Subordinate HL Data Segment in This Hierarchical Structure.,Generated by Edifecs,,,,,,
2000A,PRV,Billing Provider Specialty Information,,S,,,,,,,,
2000A,2000A.PRV01,Provider Code,Code identifying the type of provider,R,BI : Billing,,,,,,,
2000A,2000A.PRV02,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"PXC : Health Care Provider Taxonomy Code
         CODE SOURCE 682: Health Care Provider Taxonomy",,,,,,,
2000A,2000A.PRV03,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,
2000A,CUR,Foreign Currency Information,,S,,,,,,,,
2000A,2000A.CUR01,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,85 : Billing Provider,,,,,,,
2000A,2000A.CUR02,Currency Code,Code (Standard ISO) for country in whose currency the charges are specified,R,,,,,,,,
LOOP 2010AA - BILLING PROVIDER,,,,,,,,,,,,
2010AA,NM1,Billing Provider Name (Required),,R,,,,,,,,
2010AA,2010AA.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,85 : Billing Provider,"Hardcode as ""85""",,,,,,
2010AA,2010AA.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,2 : Non-Person Entity,"Hardcode as ""2""",,,,,,
2010AA,2010AA.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,BILLING_FULL_NAME,357,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/ub92Info/supplierInformation/supplierName
2010AA,2010AA.NM104,Name First,,,,,,,,,,
2010AA,2010AA.NM105,Name Middle,,,,,,,,,,
2010AA,2010AA.NM107,Name Suffix,,,,,,,,,,
2010AA,2010AA.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),S,"XX : Centers for Medicare and Medicaid Services National Provider Identifier
       CODE SOURCE 537: Centers for Medicare and Medicaid Services National Provider Identifier","Hardcode as ""XX""",,,,,,
2010AA,2010AA.NM109,Identification Code,Code identifying a party or other code,S,,,BILLING_NPI,351,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/ub92Info/supplierInformation/npi
2010AA,N3,Billing Provider Address (Required),,R,,,,,,,,
2010AA,2010AA.N301,Address Information,Address information,R,,,BILLING_ADDRESS_01,358,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/ub92Info/supplierInformation/address/address
2010AA,2010AA.N302,Address Information,Address information,S,,,BILLING_ADDRESS_02,359,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/ub92Info/supplierInformation/address/address2
2010AA,N4,Billing Provider City/State/ZIP Code (Required),,R,,,,,,,,
2010AA,2010AA.N401,City Name,Free-form text for city name,R,,,BILLING_CITY,360,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/ub92Info/supplierInformation/address/city
2010AA,2010AA.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,BILLING_STATE,361,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/ub92Info/supplierInformation/address/stateCode
2010AA,2010AA.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,,(BILLING_ZIP) + ( BILLING_ZIP_PLUS_FOUR),362 + 363,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/ub92Info/supplierInformation/address/zipCode + ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/ub92Info/supplierInformation/address/zipExtension
2010AA,2010AA.N404,Country Code,Code identifying the country,S,,,,,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/ub92Info/supplierInformation/address/countryCode
2010AA,2010AA.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,,,
2010AA,REF,"REF - BILLING PROVIDER TAX
IDENTIFICATION",,R,,,,,,,,
2010AA,2010AA.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,EI : Employer’s Identification Number,"Hardcode as ""EI""",,,,,,
2010AA,2010AA.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,BILLING_TAXGROUP_ID,350,Claim,‘XX-XXXXXXX’ format -Remove hypen),,"ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/ub92Info/supplierInformation/taxIdentificationNumber (1-50 bytes, no hyphens)"
2010AA,PER,Billing Provider Contact Information,,S,,,,,,,,
2010AA,2010AA.PER01,Contact Function Code,Code identifying the major duty or responsibility of the person or group named,R,IC : Information Contact,,,,,,,
2010AA,2010AA.PER02,Name,Free-form name,S,,,,,,,,
2010AA,2010AA.PER03,Communication Number Qualifier,Code identifying the type of communication number,R,"EM : Electronic Mail
FX : Facsimile
TE : Telephone",,,,,,,
2010AA,2010AA.PER04,Communication Number,Complete communications number including country or area code when applicable,R,,,,,,,,
2010AA,2010AA.PER05,Communication Number Qualifier,Code identifying the type of communication number,S,"EM : Electronic Mail
EX : Telephone Extension
FX : Facsimile
TE : Telephone",,,,,,,
2010AA,2010AA.PER06,Communication Number,Complete communications number including country or area code when applicable,S,,,,,,,,
2010AA,2010AA.PER07,Communication Number Qualifier,Code identifying the type of communication number,S,"EM Electronic Mail
EX Telephone Extension
FX Facsimile
TE Telephone",,,,,,,
2010AA,2010AA.PER08,Communication Number,"Complete communications number including country or area code when
applicable",S,,,,,,,,
LOOP 2010AB - PAY-TO ADDRESS NAME,,,,,,,,,,,,
2010AB,NM1,Pay-To Address Name,,S,,,,,,,,
2010AB,2010AB.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,87 : Pay-to Provider,"Hardcode as ""87""",,,,,,
2010AB,2010AB.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,2 : Non-Person Entity,"Hardcode as ""2""",,,,,,
2010AB,N3,Pay-To Address (Required),,R,,,,,,,,
2010AB,2010AB.N301,Address Information,Address information,R,,,PAY_TO_ADDRESS_01,528,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/payToAddress/address
2010AB,2010AB.N302,Address Information,Address information,S,,,PAY_TO_ADDRESS_02,529,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/payToAddress/address2
2010AB,N4,Pay-To Address City/State/ZIP Code (Required),,R,,,,,,,,
,2010AB.N401,City Name,Free-form text for city name,R,,,PAY_TO_CITY,530,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/payToAddress/city
2010AB,2010AB.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,PAY_TO_STATE,531,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/payToAddress/stateCode
2010AB,2010AB.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,,(PAY_TO_ZIP) + ( PAY_TO_ZIP_PLUS_FOUR),532 + 533,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/payToAddress/zipCode + ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/payToAddress/zipExtension
,2010AB.N404,Country Code,Code identifying the country,S,,,,,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/payToAddress/countryCode
2010AB,2010AB.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,,,
LOOP 2010AC - PAY-TO PLAN NAME,,,,,,,,,,,,
2010AC,NM1,Pay-To Plan Name,,S,,,,,,,,
2010AC,2010AC.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,PE : Payee,,,,,,,
2010AC,2010AC.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,2 : Non-Person Entity,,,,,,,
2010AC,2010AC.NM103,Name Last or Organization Name,Individual last name or organizational nam,R,,,,,,,,
2010AC,2010AC.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),R,"PI : Payor Identification
 XV : Centers for Medicare and Medicaid Services PlanID",,,,,,,
2010AC,2010AC.NM109,Identification Code,Code identifying a party or other code,R,,,,,,,,
2010AC,N3,Pay-To Plan Address (Required),,R,,,,,,,,
2010AC,2010AC.N301,Address Information,Address information,R,,,,,,,,
2010AC,2010AC.N302,Address Information,Address information,S,,,,,,,,
2010AC,N4,Pay-To Plan City/State/Zip Code (Required),,R,,,,,,,,
2010AC,2010AC.N401,City Name,Free-form text for city name,R,,,,,,,,
2010AC,2010AC.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,,,,,,
2010AC,2010AC.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,,,,,,,
2010AC,2010AC.N404,Country Code,Code identifying the country,S,,,,,,,,
2010AC,2010AC.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,,,
2010AC,REF,Pay-To Plan Secondary Identification,,S,,,,,,,,
2010AC,2010AC.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"2U : Payer Identification Number
FY :Claim Office Number
NF : National Association of Insurance Commissioners (NAIC) Code",,,,,,,
2010AC,2010AC.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,
2010AC,REF,Pay-To Plan Tax Identification Number (Required),,R,,,,,,,,
2010AC,2010AC.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,EI : Employer’s Identification Number,,,,,,,
2010AC,2010AC.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,
"LOOP 2000B - SUBSCRIBER HIERARCHICAL
LEVEL",,,,,,,,,,,,
2000B,HL,Subscriber Hierarchical Level (Required),,R,,,,,,,,
2000B,2000B.HL01,Hierarchical ID Number,A unique number assigned by the sender to identify a particular data segment in a hierarchical structure,R,,Generated by Edifecs,,,,,,
2000B,2000B.HL02,Hierarchical Parent ID Number,Identification number of the next higher hierarchical data segment that the data segment being described is subordinate to,R,,2000A.HL01,,,,,,
2000B,2000B.HL03,Hierarchical Level Code,Code defining the characteristic of a level in a hierarchical structure,R,22 : Subscriber,"Hardcode as ""22""",,,,,,
2000B,2000B.HL04,Hierarchical Child Code,Code indicating if there are hierarchical child data segments subordinate to the level being described,R,"0 : No Subordinate HL Segment in This Hierarchical Structure.
1 : Additional Subordinate HL Data Segment in This Hierarchical Structure",Generated by Edifecs,,,,,,
2000B,SBR,Subscriber Information (Required),,R,,,,,,,,
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
U : Unknown","Hardcode as ""P""",,,,,,
2000B,2000B.SBR02,Individual Relationship Code,Code indicating the relationship between two individuals or entities,S,18 : Self,"Hardcode as ""18""",,,,Only if RELATIONSHIP_TO_SUB = Self (18),,
2000B,2000B.SBR03,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifie,S,,,SUB_MEMBER_GROUP_NUMBER,823,Claim,,,"AETNA:
ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/subscriptionInformation/groupNumber
if group number is '10302', then pass PDCNTRASF. Pass 'PEDMNT' for all other self Insured groups
FirstHealth:
Pass Acro ID's here"
2000B,2000B.SBR04,Name,Free-form name,S,,,,,,,,
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
ZZ : Mutually Defined",,SUB_CLAIM_FILING_CODE,824,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/baseBenefitPlan/product/planType
LOOP 2010BA - SUBSCRIBER NAME,,,,,,,,,,,,
2010BA,NM1,Subscriber Name (Required),,R,,,,,,,,
2010BA,2010BA.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,IL Insured or Subscriber,"Hardcode as ""IL""",,,,,,
2010BA,2010BA.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,"1 Person
2 Non-Person Entity","Hardcode as ""1""",,,,,,
2010BA,2010BA.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,SUB_LAST_NAME,502,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/ub92Info/subscriberInformation/individual/lastName
2010BA,2010BA.NM104,Name First,Individual first name,S,,,SUB_FIRST_NAME,503,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/ub92Info/subscriberInformation/individual/firstName
2010BA,2010BA.NM105,Name Middle,Individual middle name or initial,S,,,SUB_MIDDLE_NAME,504,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/ub92Info/subscriberInformation/individual/middleName
2010BA,2010BA.NM107,Name Suffix,Suffix to individual name,S,,,SUB_NAME_SUFFIX,505,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/ub92Info/subscriberInformation/individual/nameSuffix
2010BA,2010BA.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),R,"II : Standard Unique Health Identifier for each Individual
in the United States
MI : Member Identification Number","Hardcode as ""MI""",,,,,,
2010BA,2010BA.NM109,Identification Code,Code identifying a party or other code,R,,,SUB_ID,3,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/subscriptionInformation/hccId
2010BA,N3,Subscriber Address,,S,,,,,,,,
2010BA,2010BA.N301,Address Information,Address information,R,,,SUB_ADDRESS_01,506,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/subscriptionInformation/correspondenceAddress/address
2010BA,2010BA.N302,Address Information,Address information,S,,,SUB_ADDRESS_02,507,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/subscriptionInformation/correspondenceAddress/address2
2010BA,N4,Subscriber City/State/ZIP Code,,R,,,,,,,,
2010BA,2010BA.N401,City Name,Free-form text for city name,R,,,SUB_CITY,508,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/subscriptionInformation/correspondenceAddress/city
2010BA,2010BA.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,SUB_STATE,509,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/subscriptionInformation/correspondenceAddress/stateCode
.,2010BA.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,,(SUB_ZIP) + ( SUB_ZIP_PLUS_FOUR),510 + 511,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/subscriptionInformation/correspondenceAddress/zipCode + ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/subscriptionInformation/correspondenceAddress/zipExtension
2010BA,2010BA.N404,Country Code,Code identifying the country,S,,,,,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/subscriptionInformation/correspondenceAddress/countryCode
2010BA,2010BA.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,,,
2010BA,DMG,Subscriber Demographic Information,,S,,,,,,,,
2010BA,2010BA.DMG01,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 : Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,
2010BA,2010BA.DMG02,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,SUB_DOB,514,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/subscriptionInformation/subscriber/birthDate
2010BA,2010BA.DMG03,Gender Code,Code indicating the sex of the individual,R,"F : Female
M : Male
U : Unknown",,SUB_GENDER_ID,515,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/subscriptionInformation/subscriber/genderCode
2010BA,REF,Subscriber Secondary Identification,,S,,,,,,,,
2010BA,2010BA.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,SY : Social Security Number,,,,,,,
2010BA,2010BA.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,
2010BA,REF,Property and Casualty Claim Number,,S,,,,,,,,
2010BA,2010BA.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,Y4 : Agency Claim Number,,,,,,,
2010BA,2010BA.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,
LOOP 2010BB - PAYER NAME,,,,,,,,,,,,
2010BB,NM1,Payer Name (Required),,R,,,,,,,,
2010BB,2010BB.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,PR : Payer,"Hardcode as ""PR""",,,,,,
2010BB,2010BB.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,2 : Non-Person Entity,"Hardcode as ""2""",,,,,,
2010BB,2010BB.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,Product,,,,,Configurable value for Implementation team,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/payerInformation/hicName
2010BB,2010BB.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),R,"PI : Payor Identification
XV : Centers for Medicare and Medicaid Services PlanID","Hardcode as ""PI""",,,,,,
2010BB,2010BB.NM109,Identification Code,Code identifying a party or other code,R,,"Default value ""1234567""",,,,,"Configurable value for Implementation team
updated default values",ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/payerInformation/taxId
2010BB,N3,Payer Address,,S,,,,,,,,
2010BB,2010BB.N301,Address Information,Address Information,R,,"Hardcode as ""XXXX""",,,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/payerInformation/hicAddress/address
2010BB,2010BB.N302,Address Information,Address Information,S,,,,,,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/payerInformation/hicAddress/address2
2010BB,N4,Payer City/State/ZIP Code,,R,,,,,,,,
2010BB,2010BB.N401,City Name,Free-form text for city name,R,,"Default value as ""Product""",,,,,Configurable value for Implementation team. Random values updated,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/payerInformation/hicAddress/city
2010BB,2010BB.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,"Default  value as ""CO""",,,,,Configurable value for Implementation team. Random values updated,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/payerInformation/hicAddress/stateCode
2010BB,2010BB.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,"Default  value as ""80014""",,,,,Configurable value for Implementation team. Random values updated,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/payerInformation/hicAddress/zipCode + ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/payerInformation/hicAddress/zipExtension
2010BB,2010BB.N404,Country Code,Code identifying the country,S,,Leave it blank,,,,,"Configurable value for Implementation team. Random values updated
20/6/2024: CO cannot be hardcoded as it is not a valid value. So leaving it Blank",ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/payerInformation/hicAddress/countryCode
2010BB,2010BB.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,,,
2010BB,REF,Payer Secondary Identification,,S,,,,,,,,
2010BB,2010BB.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,S,"2U : Payer Identification Number
EI : Employer’s Identification Number
FY : Claim Office Number
NF : National Association of Insurance Commissioners
(NAIC) Code",,,,,,,
2010BB,2010BB.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,
2010BB,REF,Billing Provider Secondary Identification,,S,,,,,,,,
2010BB,2010BB.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"G2 Provider Commercial Number
LU Location Number",,,,,,,
2010BB,2010BB.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,
LOOP 2000C - PATIENT HIERARCHICAL LEVEL,,,,,,,,,,,,
2000C,HL,Patient Hierarchical Level,,S,,,,,,,,
2000C,2000C.HL01,Hierarchical ID Number,A unique number assigned by the sender to identify a particular data segment in a hierarchical structure,R,,System Generated,,,,,,
2000C,2000C.HL02,Hierarchical Parent ID Number,Identification number of the next higher hierarchical data segment that the data segment being described is subordinate to,R,,2000B.HL01,,,,,,
2000C,2000C.HL03,Hierarchical Level Code,Code defining the characteristic of a level in a hierarchical structure,R,23 : Dependent,"Hardcode as ""23""",,,,,,
2000C,2000C.HL04,Hierarchical Child Code,Code indicating if there are hierarchical child data segments subordinate to the level being described,R,"0 : No Subordinate HL Segment in This Hierarchical
Structure.","Hardcode as ""0""",,,,,,
2000C,PAT,Patient Information (Required),,R,,,,,,,,
2000C,2000C.PAT01,Individual Relationship Code,Code indicating the relationship between two individuals or entities,R,"01 : Spouse
19 : Child
20 : Employee
21 : Unknown
39 : Organ Donor
40 : Cadaver Donor
53 : Life Partner
G8 : Other Relationship",RELATIONSHIP_TO_SUB,RELATIONSHIP_TO_SUB,16,Claim,Generate 2000C loop only if  RELATIONSHIP_TO_SUB   is not 18,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/patientInformation/relationshipToSubscriber
LOOP 2010CA - PATIENT NAME,,,,,,,,,,,,
2010CA,NM1,Patient Name (Required),,R,,,,,,,,
2010CA,2010CA.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,QC : Patient,"Hardcode as ""QC""",,,,,,
2010CA,2010CA.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,1 : Person,"Hardcode as ""1""",,,,,,
2010CA,2010CA.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,PATIENT_LAST_NAME,12,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/ub92Info/memberInformation/individual/lastName
2010CA,2010CA.NM104,Name First,Individual first name,S,,,PATIENT_FIRST_NAME,13,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/ub92Info/memberInformation/individual/firstName
2010CA,2010CA.NM105,Name Middle,Individual middle name or initial,S,,,PATIENT_MIDDLE_NAME,14,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/ub92Info/memberInformation/individual/middleName
2010CA,2010CA.NM107,Name Suffix,Suffix to individual name,S,,,PATIENT_NAME_SUFFIX,15,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/ub92Info/memberInformation/individual/nameSuffix
2010CA,N3,Patient Address (Required),,R,,,,,,,,
2010CA,2010CA.N301,Address Information,Address information,R,,,PATIENT_ADDRESS_01,517,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/patientInformation/correspondenceAddress/address
2010CA,2010CA.N302,Address Information,Address information,S,,,PATIENT_ADDRESS_02,518,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/patientInformation/correspondenceAddress/address2
2010CA,N4,Patient City/State/ZIP Code (Required),,R,,,,,,,,
2010CA,2010CA.N401,City Name,Free-form text for city name,R,,,PATIENT_CITY,519,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/patientInformation/correspondenceAddress/city
2010CA,2010CA.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,PATIENT_STATE,520,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/patientInformation/correspondenceAddress/stateCode
2010CA,2010CA.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,,(PATIENT_ZIP) + ( PATIENT_ZIP_PLUS_FOUR),521 + 522,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/patientInformation/correspondenceAddress/zipCode + ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/patientInformation/correspondenceAddress/zipExtension
2010CA,2010CA.N404,Country Code,Code identifying the country,S,,,,523,Claim,,"I checked in OB Payment. Seems Country Code is not displaying in EDI. As we do not have any logic with Country Code and we are blocked with this issue (Snip Validation Error while translating with the Value as US), we can remove the Country Code mapping",ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/patientInformation/correspondenceAddress/countryCode
2010CA,2010CA.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,,,
2010CA,DMG,Patient Demographic Information (Required),,R,,,,,,,,
2010CA,2010CA.DMG01,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 : Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,
2010CA,2010CA.DMG02,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,PATIENT_DOB,5,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/patientInformation/member/birthdate
2010CA,2010CA.DMG03,Gender Code,Code indicating the sex of the individuaL,R,"F : Female
M : Male
U : Unknown",,PATIENT_GENDER_ID,6,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/patientInformation/member/genderCode
2010CA,REF,Property and Casualty Claim Number,,S,,,,,,,,
2010CA,2010CA.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,Y4 :  Agency Claim Number,,,,,,,
2010CA,2010CA.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,
LOOP 2300 - CLAIM INFORMATION,,,,,,,,,,,,
2300,CLM,Claim information (Required),,R,,,,,,,,
2300,2300.CLM01,Claim Submitter's Identifier,Identifier used to track a claim from creation by the health care provider through payment,R,,,PATIENT_CONTROL_NUM,11,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/patientControlNumber
2300,2300.CLM02,Monetary Amount,Monetary amount,R,,,CLAIM_BILLED_AMOUNT,438,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/requestedFeeAmount
2300,2300.CLM05,Healthcare service location information,To provide information that identifies the place of service or the type of bill related to the location at which a health care service was rendered,R,,,,,,,,
2300,2300.CLM05.01,Facility Code Value,"Code identifying where services were, or may be, performed; the first and second positions of the Uniform Bill Type Code for Institutional Services or the Place of Service Codes for Professional or Dental Services.",R,,,BILL_TYPE,21,Claim,,,First 2 Bytes of ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/typeOfBillCode
2300,2300.CLM05.02,Facility Code Qualifier,Code identifying the type of facility referenced,R,A : Uniform Billing Claim Form Bill Type,"Hardcode as ""A""",,,,,,
2300,2300.CLM05.03,Claim Frequency Type Code,Code specifying the frequency of the claim; this is the third position of the Uniform Billing Claim Form Bill Type,R,,,CLAIM_FREQUENCY_CODE,828,Claim,,,The 3rd byte of ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/typeOfBillCode
2300,2300.CLM07,Provider Accept Assignment Code,Code indicating whether the provider accepts assignment,R,"A : Assigned
B : Assignment Accepted on Clinical Lab Services Only
C : Not Assigned",,ASSIGNMENT_ACCEPTANCE,825,Claim,"If ASSIGNMENT_ACCEPTANCE is Y, map A
If ASSIGNMENT_ACCEPTANCE is N, map C",,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/benefitAssignment
2300,2300.CLM08,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,R,"N No
W Not Applicable
Y Yes",,ASSIGNMENT_OF_BENEFITS,437,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/assignmentAcceptance
2300,2300.CLM09,Release of Information Code,Code indicating whether the provider has on file a signed statement by the patient authorizing the release of medical data to other organizations,R,"I Informed Consent to Release Medical Information
for Conditions or Diagnoses Regulated by Federal
Statutes
Y Yes, Provider has a Signed Statement Permitting
Release of Medical Billing Data Related to a Claim",,INFORMATION_RELEASE,826,Claim,"If INFORMATION_RELEASE is Yes, map Y, Else map I",,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/informationRelease
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
15 Natural Disaster",,,,,,,
2300,DTP,Discharge Date/Hour,,S,,,,,,,,
2300,2300.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,096 Discharge,"Hardcode as ""96""",,,,,,
2300,2300.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,TM Time Expressed in Format HHMM,"Hardcode as ""TM""",,,,,,
2300,2300.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,"DISCHARGE_TIME_HH
DISCHARGE_TIME_MM",103 + 104,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/dischargeTime
2300,DTP,Statement Dates (Required),,R,,,,,,,,
2300,2300.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,434 : Statement,"Hardcode as ""434""",,,,,,
2300,2300.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8 : Range of Dates Expressed in Format CCYYMMDDCCYYMMDD,"Hardcode as ""RD8""",,,,,,
2300,2300.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,"CLAIM_DOS_BEGIN_DATE and
CLAIM_DOS_END_DATE  separated by hyphen",94 + 95,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/startDate + ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/endDate
2300,DTP,Admission Date/Hour,,S,,,,,,,,
2300,2300.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,435 : Admission,"Hardcode as ""435""",,,,,,
2300,2300.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,"D8 : Date Expressed in Format CCYYMMDD
DT : Date and Time Expressed in Format
CCYYMMDDHHMM","Hardcode as ""DT""",,,,,,
2300,2300.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,"Concatenate ADMIT_DATE,
ADMIT_TIME_HH and  ADMIT_TIME_MM",97 + 98/99,Claim,,,"ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/admitDate +
ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/admitTime"
2300,DTP,Date - Repricer Received Date,,S,,,,,,,,
2300,2300.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,050 Received,,,,,,,
2300,2300.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,,,,,,,
2300,2300.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,,,,
2300,CL1,Institutional Claim Code (Required),,R,,,,,,,,
2300,2300.CL101,Admission Type Code,Code indicating the priority of this admission,S,,,ADMIT_TYPE,100,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/admissionTypeCode
2300,2300.CL102,Admission Source Code,Code indicating the source of this admission,S,,,ADMIT_SOURCE_CODE,101,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/admissionSource
2300,2300.CL103,Patient Status Code,Code indicating patient status as of the “statement covers through date”,R,,,DISCHARGE_STATUS,105,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/dischargeStatus
2300,PWK,Claim Supplemental Information,,S,,,,,,,,
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
XP Photographs",,,,,,,
2300,2300.PWK02,Report Transmission Code,"Code defining timing, transmission method or format by which reports are to be sent",R,"AA Available on Request at Provider Site
BM By Mail
EL Electronically Only
EM E-Mail
FT File Transfer
FX By Fax",,,,,,,
2300,2300.PWK05,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),R,AC Attachment Control Number,,,,,,,
2300,2300.PWK06,Identification Code,Code identifying a party or other code,S,,,,,,,,
2300,CN1,Contract Information,,S,,,,,,,,
2300,2300.CN101,Contract Type Code,Code identifying a contract type,R,"01 Diagnosis Related Group (DRG)
02 Per Diem
03 Variable Per Diem
04 Flat
05 Capitated
06 Percent
09 Other",,,,,,,
2300,2300.CN102,Monetary Amount,Monetary amount,S,,,,,,,,
2300,2300.CN103,"Percent, Decimal Format","Percent given in decimal format (e.g., 0.0 through 100.0 represents 0% through 100%)",S,,,,,,,,
2300,2300.CN104,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,S,,,,,,,,
2300,2300.CN105,Terms Discount Percent,"Terms discount percentage, expressed as a percent, available to the purchaser if an invoice is paid on or before the Terms Discount Due Date",S,,,,,,,,
2300,2300.CN106,Version Identifier,"Revision level of a particular format, program, technique or algorithm",S,,,,,,,,
2300,AMT,Patient Estimated Amount Due,,S,,,,,,,,
2300,2300.AMT01,Amount Qualifier Code,Code to qualify amount,R,F3 Patient Responsibility - Estimated,,,,,,,
2300,2300.AMT02,Monetary Amount,Monetary amount,R,,,,,,,,
2300,REF,Service Authorization Exception Code,,S,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,4N Special Payment Reference Number,,,,,,,
d,2300.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,
2300,REF,Referral Number,,S,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,9F Referral Number,,,,,,,
2300,2300.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,
2300,REF,Prior Authorization,,S,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,G1 Prior Authorization Number,,,,,,,
2300,2300.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,
2300,REF,Payer Claim Control Number,,S,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,F8 Original Reference Number,"Hardcode as ""F8"" only if CLAIM_ID_ORIG has values",,,,,,
2300,2300.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,CLAIM_ID_ORIG,482,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hccId
2300,REF,Repriced Claim Number,,S,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,9A Repriced Claim Reference Number,,,,,,,
2300,2300.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,
2300,REF,Adjusted Repriced Claim Number,,S,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,9C Adjusted Repriced Claim Reference Number,,,,,,,
2300,2300.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,
2300,REF,Investigational Device Exemption Number,,S,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,LX Qualified Products List,,,,,,,
2300,2300.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,
2300,REF,Claim Identification For Transmission Intermediaries,,S,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,D9 Claim Number,"Hardcode as ""D9""",,,,,,
2300,2300.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,CLAIM_ID,18,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/hccId
2300,REF,Auto Accident State,,S,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,LU Location Number,,,,,,,
2300,2300.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,
2300,REF,Medical Record Number,,S,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,EA Medical Record Identification Number,"Hardcode as ""EA"" only if MED_REC_NO has values",,,,,,
2300,2300.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,MED_REC_NO,20,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/medicalRecordNumber
2300,REF,Demonstration Project Identifier,,S,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,P4 Project Code,,,,,,,
2300,2300.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,
2300,REF,Peer Review Organization (PRO) Approval Number,,S,,,,,,,,
2300,2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,G4 Peer Review Organization (PRO) Approval Number,,,,,,,
2300,2300.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,
2300,K3,File Information,,S,,,,,,,,
2300,2300.K301,Fixed Format Information,Data in fixed format agreed upon by sender and receiver,R,,,,,,,,
2300,NTE,Claim Note,,S,,,,,,,,
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
UPI Updated Information",,,,,,,
2300,2300.NTE02,Description,A free-form description to clarify the related data elements and their content,R,,,,,,,,
2300,NTE,Billing Note,,S,,,,,,,,
2300,2300.NTE01,Note Reference Code,Code identifying the functional area or purpose for which the note applies,R,ADD Additional Information,,,,,,,
2300,2300.NTE02,Description,,R,,,,,,,,
2300,CRC,EPSDT Referral,,S,,,,,,,,
2300,2300.CRC01,Code Category,Specifies the situation or category to which the code applies,R,ZZ Mutually Defined,,,,,,,
2300,2300.CRC02,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,R,"N No
Y Yes",,,,,,,
2300,2300.CRC03,Condition Indicator,Code indicating a condition,R,"AV Available - Not Used
NU Not Used
S2 Under Treatment
ST New Services Requested",,,,,,,
2300,2300.CRC04,Condition Indicator,Code indicating a condition,S,,,,,,,,
2300,2300.CRC05,Condition Indicator,Code indicating a condition,S,,,,,,,,
2300,HI,Principal Diagnosis (Required),,R,,,,,,,,
2300,2300.HI01,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",R,,,,,,,,
2300,2300.HI01.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABK International Classification of Diseases Clinical Modification (ICD-10-CM) Principal Diagnosis
BK International Classification of Diseases Clinical
Modification (ICD-9-CM) Principal Diagnosis","Hardcode as ""ABK""",,,,,,
2300,2300.HI01.02,Industry Code,Code indicating a code from a specific industry code list,R,,,PRINCIPAL_DIAGNOSIS_CODE,121,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/principalDiagnosis/diagnosisCode
2300,2300.HI01.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",,PRINCIPAL_DIAGNOSIS_POA,122,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/principalDiagnosis/poaIndicator
2300,HI,Admitting Diagnosis,,S,,,,,,,,
2300,2300.HI01,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",R,,,,,,,,
2300,2300.HI01.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABJ International Classification of Diseases Clinical
Modification (ICD-10-CM) Admitting Diagnosis
International Classification of Diseases Clinical
Modification (ICD-9-CM) Admitting Diagnosis","Hardcode as ""ABJ""",,,,,,
2300,2300.HI01.02,Industry Code,Code indicating a code from a specific industry code list,R,,,ADMITTING_DIAGNOSIS,196,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/admitDiagnosis/diagnosisCode
2300,HI,Patient Reason For Visit,,S,,,,,,,,
2300,2300.HI01,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",R,,,,,,,,
2300,2300.HI01.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"APR International Classification of Diseases Clinical
Modification (ICD-10-CM) Patient’s Reason for Visit
PR International Classification of Diseases Clinical
Modification (ICD-9-CM) Patient’s Reason for Visit","Hardcode as ""APR""",,,,,,
2300,2300.HI01.02,Industry Code,Code indicating a code from a specific industry code list,R,,,PATIENT_REASON_FOR_VISIT_01,234,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/reasonForVisitDiagnosis/diagnosisInfo/diagnosisCode
2300,2300.HI02,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI02.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"APR International Classification of Diseases Clinical
Modification (ICD-10-CM) Patient’s Reason for Visit
PR International Classification of Diseases Clinical
Modification (ICD-9-CM) Patient’s Reason for Visit","Hardcode as ""APR""",,,,,,
2300,2300.HI02.02,Industry Code,Code indicating a code from a specific industry code list,R,,,PATIENT_REASON_FOR_VISIT_02,236,Claim,,,
2300,2300.HI03,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI03.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"APR International Classification of Diseases Clinical
Modification (ICD-10-CM) Patient’s Reason for Visit
PR International Classification of Diseases Clinical
Modification (ICD-9-CM) Patient’s Reason for Visit","Hardcode as ""APR""",,,,,,
2300,2300.HI03.02,Industry Code,Code indicating a code from a specific industry code list,R,,,PATIENT_REASON_FOR_VISIT_03,238,Claim,,,
2300,HI,External Cause of Injury,,S,,,,,,,,
2300,2300.HI01,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",R,,,,,,,,
2300,2300.HI01.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABN International Classification of Diseases Clinical Modification (ICD-10-CM) External Cause of Injury Code
BN International Classification of Diseases Clinical
Modification (ICD-9-CM) External Cause of Injury
Code (E-codes)","Hardcode as ""ABN""",,,,,,
2300,2300.HI01.02,Industry Code,Code indicating a code from a specific industry code list,R,,,EXTERNAL_CAUSE_OF_INJURY_01,198,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/externalDiagnosis/diagnosisInfo/diagnosisCode
2300,2300.HI01.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",,EXTERNAL_CAUSE_OF_INJURY_01_POA,199,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/externalDiagnosis/diagnosisInfo/poaIndicator
2300,2300.HI02,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI02.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABN International Classification of Diseases Clinical Modification (ICD-10-CM) External Cause of Injury Code
BN International Classification of Diseases Clinical
Modification (ICD-9-CM) External Cause of Injury
Code (E-codes)","Hardcode as ""ABN""",,,,,,
2300,2300.HI02.02,Industry Code,Code indicating a code from a specific industry code list,R,,,EXTERNAL_CAUSE_OF_INJURY_02,201,Claim,,,
2300,2300.HI02.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",,EXTERNAL_CAUSE_OF_INJURY_02_POA,202,Claim,,,
2300,2300.HI03,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI03.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABN : International Classification of Diseases Clinical Modification (ICD-10-CM) External Cause of Injury Code
BN : International Classification of Diseases Clinical
Modification (ICD-9-CM) External Cause of Injury
Code (E-codes)","Hardcode as ""ABN""",,,,,,
2300,2300.HI03.02,Industry Code,Code indicating a code from a specific industry code list,R,,,EXTERNAL_CAUSE_OF_INJURY_03,204,Claim,,,
2300,2300.HI03.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",,EXTERNAL_CAUSE_OF_INJURY_03_POA,205,Claim,,,
2300,2300.HI04,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI04.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABN International Classification of Diseases Clinical Modification (ICD-10-CM) External Cause of Injury Code
BN International Classification of Diseases Clinical
Modification (ICD-9-CM) External Cause of Injury
Code (E-codes)","Hardcode as ""ABN""",,,,,,
2300,2300.HI04.02,Industry Code,Code indicating a code from a specific industry code list,R,,,EXTERNAL_CAUSE_OF_INJURY_04,207,Claim,,,
2300,2300.HI04.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",,EXTERNAL_CAUSE_OF_INJURY_04_POA,208,Claim,,,
2300,2300.HI05,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI05.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABN International Classification of Diseases Clinical Modification (ICD-10-CM) External Cause of Injury Code
BN International Classification of Diseases Clinical
Modification (ICD-9-CM) External Cause of Injury
Code (E-codes)","Hardcode as ""ABN""",,,,,,
2300,2300.HI05.02,Industry Code,Code indicating a code from a specific industry code list,R,,,EXTERNAL_CAUSE_OF_INJURY_05,210,Claim,,,
2300,2300.HI05.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",,EXTERNAL_CAUSE_OF_INJURY_05_POA,211,Claim,,,
2300,2300.HI06,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI06.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABN International Classification of Diseases Clinical Modification (ICD-10-CM) External Cause of Injury Code
BN International Classification of Diseases Clinical
Modification (ICD-9-CM) External Cause of Injury
Code (E-codes)","Hardcode as ""ABN""",,,,,,
2300,2300.HI06.02,Industry Code,Code indicating a code from a specific industry code list,R,,,EXTERNAL_CAUSE_OF_INJURY_06,213,Claim,,,
2300,2300.HI06.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",,EXTERNAL_CAUSE_OF_INJURY_06_POA,214,Claim,,,
2300,2300.HI07,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI07.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABN International Classification of Diseases Clinical Modification (ICD-10-CM) External Cause of Injury Code
BN International Classification of Diseases Clinical
Modification (ICD-9-CM) External Cause of Injury
Code (E-codes)","Hardcode as ""ABN""",,,,,,
2300,2300.HI07.02,Industry Code,Code indicating a code from a specific industry code list,R,,,EXTERNAL_CAUSE_OF_INJURY_07,216,Claim,,,
2300,2300.HI07.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",,EXTERNAL_CAUSE_OF_INJURY_07_POA,217,Claim,,,
2300,2300.HI08,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI08.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABN International Classification of Diseases Clinical Modification (ICD-10-CM) External Cause of Injury Code
BN International Classification of Diseases Clinical
Modification (ICD-9-CM) External Cause of Injury
Code (E-codes)","Hardcode as ""ABN""",,,,,,
2300,2300.HI08.02,Industry Code,Code indicating a code from a specific industry code list,R,,,EXTERNAL_CAUSE_OF_INJURY_08,219,Claim,,,
2300,2300.HI08.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",,EXTERNAL_CAUSE_OF_INJURY_08_POA,220,Claim,,,
2300,2300.HI09,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI09.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABN International Classification of Diseases Clinical Modification (ICD-10-CM) External Cause of Injury Code
BN International Classification of Diseases Clinical
Modification (ICD-9-CM) External Cause of Injury
Code (E-codes)","Hardcode as ""ABN""",,,,,,
2300,2300.HI09.02,Industry Code,Code indicating a code from a specific industry code list,R,,,EXTERNAL_CAUSE_OF_INJURY_09,222,Claim,,,
2300,2300.HI09.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",,EXTERNAL_CAUSE_OF_INJURY_09_POA,223,Claim,,,
2300,2300.HI10,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI10.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABN International Classification of Diseases Clinical Modification (ICD-10-CM) External Cause of Injury Code
BN International Classification of Diseases Clinical
Modification (ICD-9-CM) External Cause of Injury
Code (E-codes)","Hardcode as ""ABN""",,,,,,
2300,2300.HI10.02,Industry Code,Code indicating a code from a specific industry code list,R,,,EXTERNAL_CAUSE_OF_INJURY_10,225,Claim,,,
2300,2300.HI10.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",,EXTERNAL_CAUSE_OF_INJURY_10_POA,226,Claim,,,
2300,2300.HI11,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI11.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABN International Classification of Diseases Clinical Modification (ICD-10-CM) External Cause of Injury Code
BN International Classification of Diseases Clinical
Modification (ICD-9-CM) External Cause of Injury
Code (E-codes)","Hardcode as ""ABN""",,,,,,
2300,2300.HI11.02,Industry Code,Code indicating a code from a specific industry code list,R,,,EXTERNAL_CAUSE_OF_INJURY_11,228,Claim,,,
2300,2300.HI11.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",,EXTERNAL_CAUSE_OF_INJURY_11_POA,229,Claim,,,
2300,2300.HI12,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI12.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABN International Classification of Diseases Clinical Modification (ICD-10-CM) External Cause of Injury Code
BN International Classification of Diseases Clinical
Modification (ICD-9-CM) External Cause of Injury
Code (E-codes)","Hardcode as ""ABN""",,,,,,
2300,2300.HI12.02,Industry Code,Code indicating a code from a specific industry code list,R,,,EXTERNAL_CAUSE_OF_INJURY_12,231,Claim,,,
2300,2300.HI12.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",,EXTERNAL_CAUSE_OF_INJURY_12_POA,232,Claim,,,
2300,HI,Diagnosis Related Group (DRG) Information -Segment Repeat: 2,,S,,,,,,,,
2300,2300.HI01,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",R,,,,,,,,
2300,2300.HI01.01,Code List Qualifier Code,Code identifying a specific industry code list,R,DR Diagnosis Related Group (DRG),Hardcode as 'DR' if ALLOWED_DRG has values,,,,,,
2300,2300.HI01.02,Industry Code,Code indicating a code from a specific industry code list,R,,,ALLOWED_DRG,110,Claims,,,
2300,HI,Other Diagnosis Information-Segment Repeat: 2,,S,,,,,,,,
2300,2300.HI01,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",R,,,,,,,,
2300,2300.HI01.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical
Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,
2300,2300.HI01.02,Industry Code,Code indicating a code from a specific industry code list,R,,,DIAGNOSIS_CODE_02,124,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/otherDiagnosis/diagnosisInfo/diagnosisCode
2300,2300.HI01.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",,DIAGNOSIS_CODE_02_POA,125,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/otherDiagnosis/diagnosisInfo/poaIndicator
2300,2300.HI02,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI02.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical
Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,
2300,2300.HI02.02,Industry Code,Code indicating a code from a specific industry code list,R,,,DIAGNOSIS_CODE_03,127,Claim,,,
2300,2300.HI02.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",,DIAGNOSIS_CODE_03_POA,128,Claim,,,
2300,2300.HI03,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI03.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical
Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,
2300,2300.HI03.02,Industry Code,Code indicating a code from a specific industry code list,R,,,DIAGNOSIS_CODE_04,130,Claim,,,
2300,2300.HI03.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",,DIAGNOSIS_CODE_04_POA,131,Claim,,,
2300,2300.HI04,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI04.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical
Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,
2300,2300.HI04.02,Industry Code,Code indicating a code from a specific industry code list,R,,,DIAGNOSIS_CODE_05,133,Claim,,,
2300,2300.HI04.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",,DIAGNOSIS_CODE_05_POA,134,Claim,,,
2300,2300.HI05,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI05.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical
Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,
2300,2300.HI05.02,Industry Code,Code indicating a code from a specific industry code list,R,,,DIAGNOSIS_CODE_06,136,Claim,,,
2300,2300.HI05.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",,DIAGNOSIS_CODE_06_POA,137,Claim,,,
2300,2300.HI06,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI06.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical
Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,
2300,2300.HI06.02,Industry Code,Code indicating a code from a specific industry code list,R,,,DIAGNOSIS_CODE_07,139,Claim,,,
2300,2300.HI06.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",,DIAGNOSIS_CODE_07_POA,140,Claim,,,
2300,2300.HI07,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI07.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical
Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,
2300,2300.HI07.02,Industry Code,Code indicating a code from a specific industry code list,R,,,DIAGNOSIS_CODE_08,142,Claim,,,
2300,2300.HI07.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",,DIAGNOSIS_CODE_08_POA,143,Claim,,,
2300,2300.HI08,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI08.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical
Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,
2300,2300.HI08.02,Industry Code,Code indicating a code from a specific industry code list,R,,,DIAGNOSIS_CODE_09,145,Claim,,,
2300,2300.HI08.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",,DIAGNOSIS_CODE_09_POA,146,Claim,,,
2300,2300.HI09,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI09.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical
Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,
2300,2300.HI09.02,Industry Code,Code indicating a code from a specific industry code list,R,,,DIAGNOSIS_CODE_10,148,Claim,,,
2300,2300.HI09.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",,DIAGNOSIS_CODE_10_POA,149,Claim,,,
2300,2300.HI10,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI10.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical
Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,
2300,2300.HI10.02,Industry Code,Code indicating a code from a specific industry code list,R,,,DIAGNOSIS_CODE_11,151,Claim,,,
2300,2300.HI10.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",,DIAGNOSIS_CODE_11_POA,152,Claim,,,
2300,2300.HI11,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI11.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical
Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,
2300,2300.HI11.02,Industry Code,Code indicating a code from a specific industry code list,R,,,DIAGNOSIS_CODE_12,154,Claim,,,
2300,2300.HI11.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",,DIAGNOSIS_CODE_12_POA,155,Claim,,,
2300,2300.HI12,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI12.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical
Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,
2300,2300.HI12.02,Industry Code,Code indicating a code from a specific industry code list,R,,,DIAGNOSIS_CODE_13,157,Claim,,,
2300,2300.HI12.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",,DIAGNOSIS_CODE_13_POA,158,Claim,,,
2300,2300.HI13,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI13.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical
Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,
2300,2300.HI13.02,Industry Code,Code indicating a code from a specific industry code list,R,,,DIAGNOSIS_CODE_14,160,Claim,,,
2300,2300.HI13.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",,DIAGNOSIS_CODE_14_POA,161,Claim,,,
2300,2300.HI14,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI14.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical
Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,
2300,2300.HI14.02,Industry Code,Code indicating a code from a specific industry code list,R,,,DIAGNOSIS_CODE_15,163,Claim,,,
2300,2300.HI14.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",,DIAGNOSIS_CODE_15_POA,164,Claim,,,
2300,2300.HI15,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI15.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical
Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,
2300,2300.HI15.02,Industry Code,Code indicating a code from a specific industry code list,R,,,DIAGNOSIS_CODE_16,166,Claim,,,
2300,2300.HI15.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",,DIAGNOSIS_CODE_16_POA,167,Claim,,,
2300,2300.HI16,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI16.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical
Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,
2300,2300.HI16.02,Industry Code,Code indicating a code from a specific industry code list,R,,,DIAGNOSIS_CODE_17,169,Claim,,,
2300,2300.HI16.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",,DIAGNOSIS_CODE_17_POA,170,Claim,,,
2300,2300.HI17,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI17.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical
Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,
2300,2300.HI17.02,Industry Code,Code indicating a code from a specific industry code list,R,,,DIAGNOSIS_CODE_18,172,Claim,,,
2300,2300.HI17.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",,DIAGNOSIS_CODE_18_POA,173,Claim,,,
2300,2300.HI18,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI18.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical
Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,
2300,2300.HI18.02,Industry Code,Code indicating a code from a specific industry code list,R,,,DIAGNOSIS_CODE_19,175,Claim,,,
2300,2300.HI18.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",,DIAGNOSIS_CODE_19_POA,176,Claim,,,
2300,2300.HI19,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI19.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical
Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,
2300,2300.HI19.02,Industry Code,Code indicating a code from a specific industry code list,R,,,DIAGNOSIS_CODE_20,178,Claim,,,
2300,2300.HI19.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",,DIAGNOSIS_CODE_20_POA,179,Claim,,,
2300,2300.HI20,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI20.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical
Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,
2300,2300.HI20.02,Industry Code,Code indicating a code from a specific industry code list,R,,,DIAGNOSIS_CODE_21,181,Claim,,,
2300,2300.HI20.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",,DIAGNOSIS_CODE_21_POA,182,Claim,,,
2300,2300.HI21,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI21.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical
Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,
2300,2300.HI21.02,Industry Code,Code indicating a code from a specific industry code list,R,,,DIAGNOSIS_CODE_22,184,Claim,,,
2300,2300.HI21.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",,DIAGNOSIS_CODE_22_POA,185,Claim,,,
2300,2300.HI22,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI22.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical
Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,
2300,2300.HI22.02,Industry Code,Code indicating a code from a specific industry code list,R,,,DIAGNOSIS_CODE_23,187,Claim,,,
2300,2300.HI22.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",,DIAGNOSIS_CODE_23_POA,188,Claim,,,
2300,2300.HI23,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI23.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical
Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,
2300,2300.HI23.02,Industry Code,Code indicating a code from a specific industry code list,R,,,DIAGNOSIS_CODE_24,190,Claim,,,
2300,2300.HI23.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",,DIAGNOSIS_CODE_24_POA,191,Claim,,,
2300,2300.HI24,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI24.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"ABF International Classification of Diseases Clinical
Modification (ICD-10-CM) Diagnosis
BF International Classification of Diseases Clinical
Modification (ICD-9-CM) Diagnosis","Hardcode as ""ABF""",,,,,,
2300,2300.HI24.02,Industry Code,Code indicating a code from a specific industry code list,R,,,DIAGNOSIS_CODE_25,193,Claim,,,
2300,2300.HI24.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,"N No
U Unknown
W Not Applicable
Y Yes",,DIAGNOSIS_CODE_25_POA,194,Claim,,,
2300,HI,Principal Procedure Information,,S,,,,,,,,
2300,2300.HI01,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",R,,,,,,,,
2300,2300.HI01.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BBR : International Classification of Diseases Clinical
Modification (ICD-10-PCS) Principal Procedure
Codes
BR : International Classification of Diseases Clinical
Modification (ICD-9-CM) Principal Procedure Codes
CAH : Advanced Billing Concepts (ABC) Codes","Hardcode as ""BBR""",,,,,,
2300,2300.HI01.02,Industry Code,Code indicating a code from a specific industry code list,R,,,PRINCIPAL_PROCEDURE,240,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/procedureInfo/principalProcedure/procedureCode
2300,2300.HI01.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 : Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,
2300,2300.HI01.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,PRINCIPAL_PROCEDURE_DATE,241,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/procedureInfo/principalProcedure/procedureDate
2300,HI,Other Procedure Information -Segment Repeat: 2,,S,,,,,,,,
2300,2300.HI01,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",R,,,,,,,,
2300,2300.HI01.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BBQ International Classification of Diseases Clinical Modification (ICD-10-PCS) Other Procedure Codes
BQ International Classification of Diseases Clinical
Modification (ICD-9-CM) Other Procedure Codes","Hardcode as ""BBQ""",,,,,,
2300,2300.HI01.02,Industry Code,Code indicating a code from a specific industry code list,R,,,PROCEDURE_02,243,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/procedureInfo/otherProcedure/procedure/procedureCode
2300,2300.HI01.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,
2300,2300.HI01.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,PROCEDURE_02_DATE,244,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/procedureInfo/otherProcedure/procedure/procedureDate
2300,2300.HI02,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI02.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BBQ International Classification of Diseases Clinical Modification (ICD-10-PCS) Other Procedure Codes
BQ International Classification of Diseases Clinical
Modification (ICD-9-CM) Other Procedure Codes","Hardcode as ""BBQ""",,,,,,
2300,2300.HI02.02,Industry Code,Code indicating a code from a specific industry code list,R,,,PROCEDURE_03,246,Claim,,,
2300,2300.HI02.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,
2300,2300.HI02.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,PROCEDURE_03_DATE,247,Claim,,,
2300,2300.HI03,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI03.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BBQ International Classification of Diseases Clinical Modification (ICD-10-PCS) Other Procedure Codes
BQ International Classification of Diseases Clinical
Modification (ICD-9-CM) Other Procedure Codes","Hardcode as ""BBQ""",,,,,,
2300,2300.HI03.02,Industry Code,Code indicating a code from a specific industry code list,R,,,PROCEDURE_04,249,Claim,,,
2300,2300.HI03.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,
2300,2300.HI03.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,PROCEDURE_04_DATE,250,Claim,,,
2300,2300.HI04,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI04.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BBQ International Classification of Diseases Clinical Modification (ICD-10-PCS) Other Procedure Codes
BQ International Classification of Diseases Clinical
Modification (ICD-9-CM) Other Procedure Codes","Hardcode as ""BBQ""",,,,,,
2300,2300.HI04.02,Industry Code,Code indicating a code from a specific industry code list,R,,,PROCEDURE_05,252,Claim,,,
2300,2300.HI04.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,
2300,2300.HI04.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,PROCEDURE_05_DATE,253,Claim,,,
2300,2300.HI05,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI05.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BBQ International Classification of Diseases Clinical Modification (ICD-10-PCS) Other Procedure Codes
BQ International Classification of Diseases Clinical
Modification (ICD-9-CM) Other Procedure Codes","Hardcode as ""BBQ""",,,,,,
2300,2300.HI05.02,Industry Code,Code indicating a code from a specific industry code list,R,,,PROCEDURE_06,255,Claim,,,
2300,2300.HI05.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,
2300,2300.HI05.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,PROCEDURE_06_DATE,256,Claim,,,
2300,2300.HI06,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI06.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BBQ International Classification of Diseases Clinical Modification (ICD-10-PCS) Other Procedure Codes
BQ International Classification of Diseases Clinical
Modification (ICD-9-CM) Other Procedure Codes","Hardcode as ""BBQ""",,,,,,
2300,2300.HI06.02,Industry Code,Code indicating a code from a specific industry code list,R,,,PROCEDURE_07,258,Claim,,,
2300,2300.HI06.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,
2300,2300.HI06.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,PROCEDURE_07_DATE,259,Claim,,,
2300,2300.HI07,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI07.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BBQ International Classification of Diseases Clinical Modification (ICD-10-PCS) Other Procedure Codes
BQ International Classification of Diseases Clinical
Modification (ICD-9-CM) Other Procedure Codes","Hardcode as ""BBQ""",,,,,,
2300,2300.HI07.02,Industry Code,Code indicating a code from a specific industry code list,R,,,PROCEDURE_08,261,Claim,,,
2300,2300.HI07.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,
2300,2300.HI07.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,PROCEDURE_08_DATE,262,Claim,,,
2300,2300.HI08,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI08.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BBQ International Classification of Diseases Clinical Modification (ICD-10-PCS) Other Procedure Codes
BQ International Classification of Diseases Clinical
Modification (ICD-9-CM) Other Procedure Codes","Hardcode as ""BBQ""",,,,,,
2300,2300.HI08.02,Industry Code,Code indicating a code from a specific industry code list,R,,,PROCEDURE_09,264,Claim,,,
2300,2300.HI08.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,
2300,2300.HI08.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,PROCEDURE_09_DATE,265,Claim,,,
2300,2300.HI09,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI09.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BBQ International Classification of Diseases Clinical Modification (ICD-10-PCS) Other Procedure Codes
BQ International Classification of Diseases Clinical
Modification (ICD-9-CM) Other Procedure Codes","Hardcode as ""BBQ""",,,,,,
2300,2300.HI09.02,Industry Code,Code indicating a code from a specific industry code list,R,,,PROCEDURE_10,267,Claim,,,
2300,2300.HI09.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,
2300,2300.HI09.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,PROCEDURE_10_DATE,268,Claim,,,
2300,2300.HI10,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI10.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BBQ International Classification of Diseases Clinical Modification (ICD-10-PCS) Other Procedure Codes
BQ International Classification of Diseases Clinical
Modification (ICD-9-CM) Other Procedure Codes","Hardcode as ""BBQ""",,,,,,
2300,2300.HI10.02,Industry Code,Code indicating a code from a specific industry code list,R,,,PROCEDURE_11,270,Claim,,,
2300,2300.HI10.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,
2300,2300.HI10.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,PROCEDURE_11_DATE,271,Claim,,,
2300,2300.HI11,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI11.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BBQ International Classification of Diseases Clinical Modification (ICD-10-PCS) Other Procedure Codes
BQ International Classification of Diseases Clinical
Modification (ICD-9-CM) Other Procedure Codes","Hardcode as ""BBQ""",,,,,,
2300,2300.HI11.02,Industry Code,Code indicating a code from a specific industry code list,R,,,PROCEDURE_12,273,Claim,,,
2300,2300.HI11.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,
2300,2300.HI11.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,PROCEDURE_12_DATE,274,Claim,,,
2300,2300.HI12,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI12.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BBQ International Classification of Diseases Clinical Modification (ICD-10-PCS) Other Procedure Codes
BQ International Classification of Diseases Clinical
Modification (ICD-9-CM) Other Procedure Codes","Hardcode as ""BBQ""",,,,,,
2300,2300.HI12.02,Industry Code,Code indicating a code from a specific industry code list,R,,,PROCEDURE_13,276,Claim,,,
2300,2300.HI12.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,
2300,2300.HI12.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,PROCEDURE_13_DATE,277,Claim,,,
2300,2300.HI013,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",R,,,,,,,,
2300,2300.HI13.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BBQ International Classification of Diseases Clinical Modification (ICD-10-PCS) Other Procedure Codes
BQ International Classification of Diseases Clinical
Modification (ICD-9-CM) Other Procedure Codes","Hardcode as ""BBQ""",,,,,,
2300,2300.HI13.02,Industry Code,Code indicating a code from a specific industry code list,R,,,PROCEDURE_14,279,Claim,,,
2300,2300.HI13.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,
2300,2300.HI13.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,PROCEDURE_14_DATE,280,Claim,,,
2300,2300.HI14,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI14.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BBQ International Classification of Diseases Clinical Modification (ICD-10-PCS) Other Procedure Codes
BQ International Classification of Diseases Clinical
Modification (ICD-9-CM) Other Procedure Codes","Hardcode as ""BBQ""",,,,,,
2300,2300.HI14.02,Industry Code,Code indicating a code from a specific industry code list,R,,,PROCEDURE_15,282,Claim,,,
2300,2300.HI14.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,
2300,2300.HI14.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,PROCEDURE_15_DATE,283,Claim,,,
2300,2300.HI15,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI15.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BBQ International Classification of Diseases Clinical Modification (ICD-10-PCS) Other Procedure Codes
BQ International Classification of Diseases Clinical
Modification (ICD-9-CM) Other Procedure Codes","Hardcode as ""BBQ""",,,,,,
2300,2300.HI15.02,Industry Code,Code indicating a code from a specific industry code list,R,,,PROCEDURE_16,285,Claim,,,
2300,2300.HI15.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,
2300,2300.HI15.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,PROCEDURE_16_DATE,286,Claim,,,
2300,2300.HI16,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI16.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BBQ International Classification of Diseases Clinical Modification (ICD-10-PCS) Other Procedure Codes
BQ International Classification of Diseases Clinical
Modification (ICD-9-CM) Other Procedure Codes","Hardcode as ""BBQ""",,,,,,
2300,2300.HI16.02,Industry Code,Code indicating a code from a specific industry code list,R,,,PROCEDURE_17,288,Claim,,,
2300,2300.HI16.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,
2300,2300.HI16.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,PROCEDURE_17_DATE,289,Claim,,,
2300,2300.HI17,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI17.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BBQ International Classification of Diseases Clinical Modification (ICD-10-PCS) Other Procedure Codes
BQ International Classification of Diseases Clinical
Modification (ICD-9-CM) Other Procedure Codes","Hardcode as ""BBQ""",,,,,,
2300,2300.HI17.02,Industry Code,Code indicating a code from a specific industry code list,R,,,PROCEDURE_18,291,Claim,,,
2300,2300.HI17.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,
2300,2300.HI17.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,PROCEDURE_18_DATE,292,Claim,,,
2300,2300.HI18,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI18.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BBQ International Classification of Diseases Clinical Modification (ICD-10-PCS) Other Procedure Codes
BQ International Classification of Diseases Clinical
Modification (ICD-9-CM) Other Procedure Codes","Hardcode as ""BBQ""",,,,,,
2300,2300.HI18.02,Industry Code,Code indicating a code from a specific industry code list,R,,,PROCEDURE_19,294,Claim,,,
2300,2300.HI18.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,
2300,2300.HI18.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,PROCEDURE_19_DATE,295,Claim,,,
2300,2300.HI19,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI19.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BBQ International Classification of Diseases Clinical Modification (ICD-10-PCS) Other Procedure Codes
BQ International Classification of Diseases Clinical
Modification (ICD-9-CM) Other Procedure Codes","Hardcode as ""BBQ""",,,,,,
2300,2300.HI19.02,Industry Code,Code indicating a code from a specific industry code list,R,,,PROCEDURE_20,297,Claim,,,
2300,2300.HI19.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,
2300,2300.HI19.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,PROCEDURE_20_DATE,298,Claim,,,
2300,2300.HI20,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI20.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BBQ International Classification of Diseases Clinical Modification (ICD-10-PCS) Other Procedure Codes
BQ International Classification of Diseases Clinical
Modification (ICD-9-CM) Other Procedure Codes","Hardcode as ""BBQ""",,,,,,
2300,2300.HI20.02,Industry Code,Code indicating a code from a specific industry code list,R,,,PROCEDURE_21,300,Claim,,,
2300,2300.HI20.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,
2300,2300.HI20.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,PROCEDURE_21_DATE,301,Claim,,,
2300,2300.HI21,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI21.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BBQ International Classification of Diseases Clinical Modification (ICD-10-PCS) Other Procedure Codes
BQ International Classification of Diseases Clinical
Modification (ICD-9-CM) Other Procedure Codes","Hardcode as ""BBQ""",,,,,,
2300,2300.HI21.02,Industry Code,Code indicating a code from a specific industry code list,R,,,PROCEDURE_22,303,Claim,,,
2300,2300.HI21.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,
2300,2300.HI21.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,PROCEDURE_22_DATE,304,Claim,,,
2300,2300.HI22,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI22.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BBQ International Classification of Diseases Clinical Modification (ICD-10-PCS) Other Procedure Codes
BQ International Classification of Diseases Clinical
Modification (ICD-9-CM) Other Procedure Codes","Hardcode as ""BBQ""",,,,,,
2300,2300.HI22.02,Industry Code,Code indicating a code from a specific industry code list,R,,,PROCEDURE_23,306,Claim,,,
2300,2300.HI22.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,
2300,2300.HI22.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,PROCEDURE_23_DATE,307,Claim,,,
2300,2300.HI23,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI23.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BBQ International Classification of Diseases Clinical Modification (ICD-10-PCS) Other Procedure Codes
BQ International Classification of Diseases Clinical
Modification (ICD-9-CM) Other Procedure Codes","Hardcode as ""BBQ""",,,,,,
2300,2300.HI23.02,Industry Code,Code indicating a code from a specific industry code list,R,,,PROCEDURE_24,309,Claim,,,
2300,2300.HI23.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,
2300,2300.HI23.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,PROCEDURE_24_DATE,310,Claim,,,
2300,2300.HI24,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI24.01,Code List Qualifier Code,Code identifying a specific industry code list,R,"BBQ International Classification of Diseases Clinical Modification (ICD-10-PCS) Other Procedure Codes
BQ International Classification of Diseases Clinical
Modification (ICD-9-CM) Other Procedure Codes","Hardcode as ""BBQ""",,,,,,
2300,2300.HI24.02,Industry Code,Code indicating a code from a specific industry code list,R,,,PROCEDURE_25,312,Claim,,,
2300,2300.HI24.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,
2300,2300.HI24.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,PROCEDURE_25_DATE,313,Claim,,,
2300,HI,Occurrence Span Information - Segment Repeat: 2,,S,,,,,,,,
2300,2300.HI01,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",R,,,,,,,,
2300,2300.HI01.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BI Occurrence Span,"Hardcode as ""BI""",,,,,,
2300,2300.HI01.02,Industry Code,Code indicating a code from a specific industry code list,R,,,OCCUR_SPAN_CODE_01,593,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/prOccurrenceSpan/occurrenceCode/occurrenceCode
2300,2300.HI01.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD,"Hardcode as ""RD8""",,,,,,
2300,2300.HI01.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,OCCUR_SPAN_FROM_DATE_01  + OCCUR_SPAN_TO_DATE_01,594+595,Claim,,,"ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/prOccurrenceSpan/occurrenceCode/prStartDate ""-""
ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/prOccurrenceSpan/occurrenceCode/prEndDate"
2300,2300.HI02,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI02.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BI Occurrence Span,"Hardcode as ""BI""",,,,,,
2300,2300.HI02.02,Industry Code,Code indicating a code from a specific industry code list,R,,,OCCUR_SPAN_CODE_02,596,Claim,,,
2300,2300.HI02.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD,"Hardcode as ""RD8""",,,,,,
2300,2300.HI02.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,OCCUR_SPAN_FROM_DATE_02  + OCCUR_SPAN_TO_DATE_02,597+598,Claim,,,
2300,2300.HI03,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI03.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BI Occurrence Span,"Hardcode as ""BI""",,,,,,
2300,2300.HI03.02,Industry Code,Code indicating a code from a specific industry code list,R,,,OCCUR_SPAN_CODE_03,599,Claim,,,
2300,2300.HI03.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD,"Hardcode as ""RD8""",,,,,,
2300,2300.HI03.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,OCCUR_SPAN_FROM_DATE_03  + OCCUR_SPAN_TO_DATE_03,600+601,Claim,,,
2300,2300.HI04,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI04.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BI Occurrence Span,"Hardcode as ""BI""",,,,,,
2300,2300.HI04.02,Industry Code,Code indicating a code from a specific industry code list,R,,,OCCUR_SPAN_CODE_04,602,Claim,,,
2300,2300.HI04.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD,"Hardcode as ""RD8""",,,,,,
2300,2300.HI04.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,OCCUR_SPAN_FROM_DATE_04  + OCCUR_SPAN_TO_DATE_04,603+604,Claim,,,
2300,2300.HI05,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI05.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BI Occurrence Span,"Hardcode as ""BI""",,,,,,
2300,2300.HI05.02,Industry Code,Code indicating a code from a specific industry code list,R,,,OCCUR_SPAN_CODE_05,605,Claim,,,
2300,2300.HI05.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD,"Hardcode as ""RD8""",,,,,,
2300,2300.HI05.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,OCCUR_SPAN_FROM_DATE_05  + OCCUR_SPAN_TO_DATE_05,606+607,Claim,,,
2300,2300.HI06,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI06.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BI Occurrence Span,"Hardcode as ""BI""",,,,,,
2300,2300.HI06.02,Industry Code,Code indicating a code from a specific industry code list,R,,,OCCUR_SPAN_CODE_06,608,Claim,,,
2300,2300.HI06.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD,"Hardcode as ""RD8""",,,,,,
2300,2300.HI06.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,OCCUR_SPAN_FROM_DATE_06  + OCCUR_SPAN_TO_DATE_06,609+610,Claim,,,
2300,2300.HI07,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI07.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BI Occurrence Span,"Hardcode as ""BI""",,,,,,
2300,2300.HI07.02,Industry Code,Code indicating a code from a specific industry code list,R,,,OCCUR_SPAN_CODE_07,611,Claim,,,
2300,2300.HI07.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD,"Hardcode as ""RD8""",,,,,,
2300,2300.HI07.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,OCCUR_SPAN_FROM_DATE_07  + OCCUR_SPAN_TO_DATE_07,612+613,Claim,,,
2300,2300.HI08,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI08.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BI Occurrence Span,"Hardcode as ""BI""",,,,,,
2300,2300.HI08.02,Industry Code,Code indicating a code from a specific industry code list,R,,,OCCUR_SPAN_CODE_08,614,Claim,,,
2300,2300.HI08.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD,"Hardcode as ""RD8""",,,,,,
2300,2300.HI08.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,OCCUR_SPAN_FROM_DATE_08  + OCCUR_SPAN_TO_DATE_08,615+616,Claim,,,
2300,2300.HI09,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI09.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BI Occurrence Span,"Hardcode as ""BI""",,,,,,
2300,2300.HI09.02,Industry Code,Code indicating a code from a specific industry code list,R,,,OCCUR_SPAN_CODE_09,617,Claim,,,
2300,2300.HI09.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD,"Hardcode as ""RD8""",,,,,,
2300,2300.HI09.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,OCCUR_SPAN_FROM_DATE_09  + OCCUR_SPAN_TO_DATE_09,618+619,Claim,,,
2300,2300.HI10,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI10.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BI Occurrence Span,"Hardcode as ""BI""",,,,,,
2300,2300.HI10.02,Industry Code,Code indicating a code from a specific industry code list,R,,,OCCUR_SPAN_CODE_10,620,Claim,,,
2300,2300.HI10.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD,"Hardcode as ""RD8""",,,,,,
2300,2300.HI10.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,OCCUR_SPAN_FROM_DATE_10  + OCCUR_SPAN_TO_DATE_10,621+622,Claim,,,
2300,2300.HI11,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI11.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BI Occurrence Span,"Hardcode as ""BI""",,,,,,
2300,2300.HI11.02,Industry Code,Code indicating a code from a specific industry code list,R,,,OCCUR_SPAN_CODE_11,623,Claim,,,
2300,2300.HI11.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD,"Hardcode as ""RD8""",,,,,,
2300,2300.HI11.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,OCCUR_SPAN_FROM_DATE_11  + OCCUR_SPAN_TO_DATE_11,624+625,Claim,,,
2300,2300.HI12,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI12.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BI Occurrence Span,"Hardcode as ""BI""",,,,,,
2300,2300.HI12.02,Industry Code,Code indicating a code from a specific industry code list,R,,,OCCUR_SPAN_CODE_12,626,Claim,,,
2300,2300.HI12.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD,"Hardcode as ""RD8""",,,,,,
2300,2300.HI12.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,OCCUR_SPAN_FROM_DATE_12  + OCCUR_SPAN_TO_DATE_12,627+628,Claim,,,
2300,2300.HI13,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI13.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BI Occurrence Span,"Hardcode as ""BI""",,,,,,
2300,2300.HI13.02,Industry Code,Code indicating a code from a specific industry code list,R,,,OCCUR_SPAN_CODE_13,629,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/prOccurrenceSpan/occurrenceCode/occurrenceCode
2300,2300.HI13.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD,"Hardcode as ""RD8""",,,,,,
2300,2300.HI13.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,OCCUR_SPAN_FROM_DATE_13  + OCCUR_SPAN_TO_DATE_13,630+631,Claim,,,"ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/prOccurrenceSpan/occurrenceCode/prStartDate ""-""
ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/prOccurrenceSpan/occurrenceCode/prEndDate"
2300,2300.HI14,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI14.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BI Occurrence Span,"Hardcode as ""BI""",,,,,,
2300,2300.HI14.02,Industry Code,Code indicating a code from a specific industry code list,R,,,OCCUR_SPAN_CODE_14,632,Claim,,,
2300,2300.HI14.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD,"Hardcode as ""RD8""",,,,,,
2300,2300.HI14.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,OCCUR_SPAN_FROM_DATE_14  + OCCUR_SPAN_TO_DATE_14,633+634,Claim,,,
2300,2300.HI15,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI15.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BI Occurrence Span,"Hardcode as ""BI""",,,,,,
2300,2300.HI15.02,Industry Code,Code indicating a code from a specific industry code list,R,,,OCCUR_SPAN_CODE_15,635,Claim,,,
2300,2300.HI15.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD,"Hardcode as ""RD8""",,,,,,
2300,2300.HI15.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,OCCUR_SPAN_FROM_DATE_15  + OCCUR_SPAN_TO_DATE_15,636+637,Claim,,,
2300,2300.HI16,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI16.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BI Occurrence Span,"Hardcode as ""BI""",,,,,,
2300,2300.HI16.02,Industry Code,Code indicating a code from a specific industry code list,R,,,OCCUR_SPAN_CODE_16,638,Claim,,,
2300,2300.HI16.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD,"Hardcode as ""RD8""",,,,,,
2300,2300.HI16.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,OCCUR_SPAN_FROM_DATE_16  + OCCUR_SPAN_TO_DATE_16,639+640,Claim,,,
2300,2300.HI17,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI17.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BI Occurrence Span,"Hardcode as ""BI""",,,,,,
2300,2300.HI17.02,Industry Code,Code indicating a code from a specific industry code list,R,,,OCCUR_SPAN_CODE_17,641,Claim,,,
2300,2300.HI17.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD,"Hardcode as ""RD8""",,,,,,
2300,2300.HI17.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,OCCUR_SPAN_FROM_DATE_17  + OCCUR_SPAN_TO_DATE_17,642+643,Claim,,,
2300,2300.HI18,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI18.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BI Occurrence Span,"Hardcode as ""BI""",,,,,,
2300,2300.HI18.02,Industry Code,Code indicating a code from a specific industry code list,R,,,OCCUR_SPAN_CODE_18,644,Claim,,,
2300,2300.HI18.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD,"Hardcode as ""RD8""",,,,,,
2300,2300.HI18.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,OCCUR_SPAN_FROM_DATE_18  + OCCUR_SPAN_TO_DATE_18,645+646,Claim,,,
2300,2300.HI19,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI19.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BI Occurrence Span,"Hardcode as ""BI""",,,,,,
2300,2300.HI19.02,Industry Code,Code indicating a code from a specific industry code list,R,,,OCCUR_SPAN_CODE_19,647,Claim,,,
2300,2300.HI19.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD,"Hardcode as ""RD8""",,,,,,
2300,2300.HI19.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,OCCUR_SPAN_FROM_DATE_19  + OCCUR_SPAN_TO_DATE_19,648+649,Claim,,,
2300,2300.HI20,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI20.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BI Occurrence Span,"Hardcode as ""BI""",,,,,,
2300,2300.HI20.02,Industry Code,Code indicating a code from a specific industry code list,R,,,OCCUR_SPAN_CODE_20,650,Claim,,,
2300,2300.HI20.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD,"Hardcode as ""RD8""",,,,,,
2300,2300.HI20.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,OCCUR_SPAN_FROM_DATE_20  + OCCUR_SPAN_TO_DATE_20,651+652,Claim,,,
2300,2300.HI21,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI21.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BI Occurrence Span,"Hardcode as ""BI""",,,,,,
2300,2300.HI21.02,Industry Code,Code indicating a code from a specific industry code list,R,,,OCCUR_SPAN_CODE_21,653,Claim,,,
2300,2300.HI21.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD,"Hardcode as ""RD8""",,,,,,
2300,2300.HI21.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,OCCUR_SPAN_FROM_DATE_21  + OCCUR_SPAN_TO_DATE_21,654+655,Claim,,,
2300,2300.HI22,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI22.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BI Occurrence Span,"Hardcode as ""BI""",,,,,,
2300,2300.HI22.02,Industry Code,Code indicating a code from a specific industry code list,R,,,OCCUR_SPAN_CODE_22,656,Claim,,,
2300,2300.HI22.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD,"Hardcode as ""RD8""",,,,,,
2300,2300.HI22.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,OCCUR_SPAN_FROM_DATE_22  + OCCUR_SPAN_TO_DATE_22,657+658,Claim,,,
2300,2300.HI23,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI23.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BI Occurrence Span,"Hardcode as ""BI""",,,,,,
2300,2300.HI23.02,Industry Code,Code indicating a code from a specific industry code list,R,,,OCCUR_SPAN_CODE_23,659,Claim,,,
2300,2300.HI23.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD,"Hardcode as ""RD8""",,,,,,
2300,2300.HI23.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,OCCUR_SPAN_FROM_DATE_23  + OCCUR_SPAN_TO_DATE_23,660+661,Claim,,,
2300,2300.HI24,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI24.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BI Occurrence Span,"Hardcode as ""BI""",,,,,,
2300,2300.HI24.02,Industry Code,Code indicating a code from a specific industry code list,R,,,OCCUR_SPAN_CODE_24,662,Claim,,,
2300,2300.HI24.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8 Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD,"Hardcode as ""RD8""",,,,,,
2300,2300.HI24.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,OCCUR_SPAN_FROM_DATE_24  + OCCUR_SPAN_TO_DATE_24,663+664,Claim,,,
2300,HI,Occurrence Information-Segment Repeat: 2,,S,,,,,,,,
2300,2300.HI01,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",R,,,,,,,,
2300,2300.HI01.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BH Occurrence,"Hardcode as ""BH""",,,,,,
2300,2300.HI01.02,Industry Code,Code indicating a code from a specific industry code list,R,,,OCCUR_CODE_01,665,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/prOccurrenceSpan/occurrenceCode/occurrenceCode
2300,2300.HI01.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,
2300,2300.HI01.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,OCCUR_DATE_01,666,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/prOccurrenceCode/occurrenceCode/prStartDate
2300,2300.HI02,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI02.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BH Occurrence,"Hardcode as ""BH""",,,,,,
2300,2300.HI02.02,Industry Code,Code indicating a code from a specific industry code list,R,,,OCCUR_CODE_02,667,Claim,,,
2300,2300.HI02.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,
2300,2300.HI02.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,OCCUR_DATE_02,668,Claim,,,
2300,2300.HI03,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI03.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BH Occurrence,"Hardcode as ""BH""",,,,,,
2300,2300.HI03.02,Industry Code,Code indicating a code from a specific industry code list,R,,,OCCUR_CODE_03,669,Claim,,,
2300,2300.HI03.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,
2300,2300.HI03.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,OCCUR_DATE_03,670,Claim,,,
2300,2300.HI04,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI04.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BH Occurrence,"Hardcode as ""BH""",,,,,,
2300,2300.HI04.02,Industry Code,Code indicating a code from a specific industry code list,R,,,OCCUR_CODE_04,671,Claim,,,
2300,2300.HI04.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,
2300,2300.HI04.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,OCCUR_DATE_04,672,Claim,,,
2300,2300.HI05,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI05.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BH Occurrence,"Hardcode as ""BH""",,,,,,
2300,2300.HI05.02,Industry Code,Code indicating a code from a specific industry code list,R,,,OCCUR_CODE_05,673,Claim,,,
2300,2300.HI05.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,
2300,2300.HI05.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,OCCUR_DATE_05,674,Claim,,,
2300,2300.HI06,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI06.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BH Occurrence,"Hardcode as ""BH""",,,,,,
2300,2300.HI06.02,Industry Code,Code indicating a code from a specific industry code list,R,,,OCCUR_CODE_06,675,Claim,,,
2300,2300.HI06.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,
2300,2300.HI06.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,OCCUR_DATE_06,676,Claim,,,
2300,2300.HI07,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI07.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BH Occurrence,"Hardcode as ""BH""",,,,,,
2300,2300.HI07.02,Industry Code,Code indicating a code from a specific industry code list,R,,,OCCUR_CODE_07,677,Claim,,,
2300,2300.HI07.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,
2300,2300.HI07.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,OCCUR_DATE_07,678,Claim,,,
2300,2300.HI08,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI08.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BH Occurrence,"Hardcode as ""BH""",,,,,,
2300,2300.HI08.02,Industry Code,Code indicating a code from a specific industry code list,R,,,OCCUR_CODE_08,679,Claim,,,
2300,2300.HI08.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,
2300,2300.HI08.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,OCCUR_DATE_08,680,Claim,,,
2300,2300.HI09,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI09.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BH Occurrence,"Hardcode as ""BH""",,,,,,
2300,2300.HI09.02,Industry Code,Code indicating a code from a specific industry code list,R,,,OCCUR_CODE_09,681,Claim,,,
2300,2300.HI09.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,
2300,2300.HI09.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,OCCUR_DATE_09,682,Claim,,,
2300,2300.HI10,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI10.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BH Occurrence,"Hardcode as ""BH""",,,,,,
2300,2300.HI10.02,Industry Code,Code indicating a code from a specific industry code list,R,,,OCCUR_CODE_10,683,Claim,,,
2300,2300.HI10.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,
2300,2300.HI10.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,OCCUR_DATE_10,684,Claim,,,
2300,2300.HI11,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI11.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BH Occurrence,"Hardcode as ""BH""",,,,,,
2300,2300.HI11.02,Industry Code,Code indicating a code from a specific industry code list,R,,,OCCUR_CODE_11,685,Claim,,,
2300,2300.HI11.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,
2300,2300.HI11.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,OCCUR_DATE_11,686,Claim,,,
2300,2300.HI12,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI12.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BH Occurrence,"Hardcode as ""BH""",,,,,,
2300,2300.HI12.02,Industry Code,Code indicating a code from a specific industry code list,R,,,OCCUR_CODE_12,687,Claim,,,
2300,2300.HI12.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,
2300,2300.HI12.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,OCCUR_DATE_12,688,Claim,,,
2300,2300.HI13,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",R,,,,,,,,
2300,2300.HI13.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BH Occurrence,"Hardcode as ""BH""",,,,,,
2300,2300.HI13.02,Industry Code,Code indicating a code from a specific industry code list,R,,,OCCUR_CODE_13,689,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/prOccurrenceSpan/occurrenceCode/occurrenceCode
2300,2300.HI13.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,
2300,2300.HI13.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,OCCUR_DATE_13,690,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/prOccurrenceCode/occurrenceCode/prStartDate
2300,2300.HI14,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI14.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BH Occurrence,"Hardcode as ""BH""",,,,,,
2300,2300.HI14.02,Industry Code,Code indicating a code from a specific industry code list,R,,,OCCUR_CODE_14,691,Claim,,,
2300,2300.HI14.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,
2300,2300.HI14.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,OCCUR_DATE_14,692,Claim,,,
2300,2300.HI15,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI15.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BH Occurrence,"Hardcode as ""BH""",,,,,,
2300,2300.HI15.02,Industry Code,Code indicating a code from a specific industry code list,R,,,OCCUR_CODE_15,693,Claim,,,
2300,2300.HI15.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,
2300,2300.HI15.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,OCCUR_DATE_15,694,Claim,,,
2300,2300.HI16,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI16.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BH Occurrence,"Hardcode as ""BH""",,,,,,
2300,2300.HI16.02,Industry Code,Code indicating a code from a specific industry code list,R,,,OCCUR_CODE_16,695,Claim,,,
2300,2300.HI16.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,
2300,2300.HI16.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,OCCUR_DATE_16,696,Claim,,,
2300,2300.HI17,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI17.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BH Occurrence,"Hardcode as ""BH""",,,,,,
2300,2300.HI17.02,Industry Code,Code indicating a code from a specific industry code list,R,,,OCCUR_CODE_17,697,Claim,,,
2300,2300.HI17.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,
2300,2300.HI17.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,OCCUR_DATE_17,698,Claim,,,
2300,2300.HI18,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI18.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BH Occurrence,"Hardcode as ""BH""",,,,,,
2300,2300.HI18.02,Industry Code,Code indicating a code from a specific industry code list,R,,,OCCUR_CODE_18,699,Claim,,,
2300,2300.HI18.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,
2300,2300.HI18.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,OCCUR_DATE_18,700,Claim,,,
2300,2300.HI19,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI19.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BH Occurrence,"Hardcode as ""BH""",,,,,,
2300,2300.HI19.02,Industry Code,Code indicating a code from a specific industry code list,R,,,OCCUR_CODE_19,701,Claim,,,
2300,2300.HI19.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,
2300,2300.HI19.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,OCCUR_DATE_19,702,Claim,,,
2300,2300.HI20,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI20.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BH Occurrence,"Hardcode as ""BH""",,,,,,
2300,2300.HI20.02,Industry Code,Code indicating a code from a specific industry code list,R,,,OCCUR_CODE_20,703,Claim,,,
2300,2300.HI20.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,
2300,2300.HI20.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,OCCUR_DATE_20,704,Claim,,,
2300,2300.HI21,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI21.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BH Occurrence,"Hardcode as ""BH""",,,,,,
2300,2300.HI21.02,Industry Code,Code indicating a code from a specific industry code list,R,,,OCCUR_CODE_21,705,Claim,,,
2300,2300.HI21.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,
2300,2300.HI21.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,OCCUR_DATE_21,706,Claim,,,
2300,2300.HI22,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI22.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BH Occurrence,"Hardcode as ""BH""",,,,,,
2300,2300.HI22.02,Industry Code,Code indicating a code from a specific industry code list,R,,,OCCUR_CODE_22,707,Claim,,,
2300,2300.HI22.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,
2300,2300.HI22.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,OCCUR_DATE_22,708,Claim,,,
2300,2300.HI23,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI23.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BH Occurrence,"Hardcode as ""BH""",,,,,,
2300,2300.HI23.02,Industry Code,Code indicating a code from a specific industry code list,R,,,OCCUR_CODE_23,709,Claim,,,
2300,2300.HI23.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,
2300,2300.HI23.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,OCCUR_DATE_23,710,Claim,,,
2300,2300.HI24,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI24.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BH Occurrence,"Hardcode as ""BH""",,,,,,
2300,2300.HI24.02,Industry Code,Code indicating a code from a specific industry code list,R,,,OCCUR_CODE_24,711,Claim,,,
2300,2300.HI24.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,"Hardcode as ""D8""",,,,,,
2300,2300.HI24.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,OCCUR_DATE_24,712,Claim,,,
2300,HI,Value Information-Segment Repeat: 2,,S,,,,,,,,
2300,2300.HI01,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",R,,,,,,,,
2300,2300.HI01.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BE Value,"Hardcode as ""BE""",,,,,,
2300,2300.HI01.02,Industry Code,Code indicating a code from a specific industry code list,R,,,VALUE_CODE_01,46,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/prValueCodes/paymentRequestValueCode/valueCode
2300,2300.HI01.05,Monetary Amount,Monetary amount,R,,,VALUE_AMOUNT_01,47,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/prValueCodes/paymentRequestValueCode/amount
2300,2300.HI02,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI02.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BE Value,"Hardcode as ""BE""",,,,,,
2300,2300.HI02.02,Industry Code,Code indicating a code from a specific industry code list,R,,,VALUE_CODE_02,48,Claim,,,
2300,2300.HI02.05,Monetary Amount,Monetary amount,R,,,VALUE_AMOUNT_02,49,Claim,,,
2300,2300.HI03,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI03.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BE Value,"Hardcode as ""BE""",,,,,,
2300,2300.HI03.02,Industry Code,Code indicating a code from a specific industry code list,R,,,VALUE_CODE_03,50,Claim,,,
2300,2300.HI03.05,Monetary Amount,Monetary amount,R,,,VALUE_AMOUNT_03,51,Claim,,,
2300,2300.HI04,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI04.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BE Value,"Hardcode as ""BE""",,,,,,
2300,2300.HI04.02,Industry Code,Code indicating a code from a specific industry code list,R,,,VALUE_CODE_04,52,Claim,,,
2300,2300.HI04.05,Monetary Amount,Monetary amount,R,,,VALUE_AMOUNT_04,53,Claim,,,
2300,2300.HI05,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI05.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BE Value,"Hardcode as ""BE""",,,,,,
2300,2300.HI05.02,Industry Code,Code indicating a code from a specific industry code list,R,,,VALUE_CODE_05,54,Claim,,,
2300,2300.HI05.05,Monetary Amount,Monetary amount,R,,,VALUE_AMOUNT_05,55,Claim,,,
2300,2300.HI06,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI06.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BE Value,"Hardcode as ""BE""",,,,,,
2300,2300.HI06.02,Industry Code,Code indicating a code from a specific industry code list,R,,,VALUE_CODE_06,56,Claim,,,
2300,2300.HI06.05,Monetary Amount,Monetary amount,R,,,VALUE_AMOUNT_06,57,Claim,,,
2300,2300.HI07,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI07.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BE Value,"Hardcode as ""BE""",,,,,,
2300,2300.HI07.02,Industry Code,Code indicating a code from a specific industry code list,R,,,VALUE_CODE_07,58,Claim,,,
2300,2300.HI07.05,Monetary Amount,Monetary amount,R,,,VALUE_AMOUNT_07,59,Claim,,,
2300,2300.HI08,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI08.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BE Value,"Hardcode as ""BE""",,,,,,
2300,2300.HI08.02,Industry Code,Code indicating a code from a specific industry code list,R,,,VALUE_CODE_08,60,Claim,,,
2300,2300.HI08.05,Monetary Amount,Monetary amount,R,,,VALUE_AMOUNT_08,61,Claim,,,
2300,2300.HI09,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI09.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BE Value,"Hardcode as ""BE""",,,,,,
2300,2300.HI09.02,Industry Code,Code indicating a code from a specific industry code list,R,,,VALUE_CODE_09,62,Claim,,,
2300,2300.HI09.05,Monetary Amount,Monetary amount,R,,,VALUE_AMOUNT_09,63,Claim,,,
2300,2300.HI10,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI10.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BE Value,"Hardcode as ""BE""",,,,,,
2300,2300.HI10.02,Industry Code,Code indicating a code from a specific industry code list,R,,,VALUE_CODE_10,64,Claim,,,
2300,2300.HI10.05,Monetary Amount,Monetary amount,R,,,VALUE_AMOUNT_10,65,Claim,,,
2300,2300.HI11,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI11.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BE Value,"Hardcode as ""BE""",,,,,,
2300,2300.HI11.02,Industry Code,Code indicating a code from a specific industry code list,R,,,VALUE_CODE_11,66,Claim,,,
2300,2300.HI11.05,Monetary Amount,Monetary amount,R,,,VALUE_AMOUNT_11,67,Claim,,,
2300,2300.HI12,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI12.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BE Value,"Hardcode as ""BE""",,,,,,
2300,2300.HI12.02,Industry Code,Code indicating a code from a specific industry code list,R,,,VALUE_CODE_12,68,Claim,,,
2300,2300.HI12.05,Monetary Amount,Monetary amount,R,,,VALUE_AMOUNT_12,69,Claim,,,
2300,2300.HI13,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI13.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BE Value,"Hardcode as ""BE""",,,,,,
2300,2300.HI13.02,Industry Code,Code indicating a code from a specific industry code list,R,,,VALUE_CODE_13,70,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/prValueCodes/paymentRequestValueCode/valueCode
2300,2300.HI13.05,Monetary Amount,Monetary amount,R,,,VALUE_AMOUNT_13,71,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/prValueCodes/paymentRequestValueCode/amount
2300,2300.HI14,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI14.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BE Value,"Hardcode as ""BE""",,,,,,
2300,2300.HI14.02,Industry Code,Code indicating a code from a specific industry code list,R,,,VALUE_CODE_14,72,Claim,,,
2300,2300.HI14.05,Monetary Amount,Monetary amount,R,,,VALUE_AMOUNT_14,73,Claim,,,
2300,2300.HI15,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI15.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BE Value,"Hardcode as ""BE""",,,,,,
2300,2300.HI15.02,Industry Code,Code indicating a code from a specific industry code list,R,,,VALUE_CODE_15,74,Claim,,,
2300,2300.HI15.05,Monetary Amount,Monetary amount,R,,,VALUE_AMOUNT_15,75,Claim,,,
2300,2300.HI16,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI16.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BE Value,"Hardcode as ""BE""",,,,,,
2300,2300.HI16.02,Industry Code,Code indicating a code from a specific industry code list,R,,,VALUE_CODE_16,76,Claim,,,
2300,2300.HI16.05,Monetary Amount,Monetary amount,R,,,VALUE_AMOUNT_16,77,Claim,,,
2300,2300.HI17,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI17.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BE Value,"Hardcode as ""BE""",,,,,,
2300,2300.HI17.02,Industry Code,Code indicating a code from a specific industry code list,R,,,VALUE_CODE_17,78,Claim,,,
2300,2300.HI17.05,Monetary Amount,Monetary amount,R,,,VALUE_AMOUNT_17,79,Claim,,,
2300,2300.HI18,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI18.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BE Value,"Hardcode as ""BE""",,,,,,
2300,2300.HI18.02,Industry Code,Code indicating a code from a specific industry code list,R,,,VALUE_CODE_18,80,Claim,,,
2300,2300.HI18.05,Monetary Amount,Monetary amount,R,,,VALUE_AMOUNT_18,81,Claim,,,
2300,2300.HI19,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI19.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BE Value,"Hardcode as ""BE""",,,,,,
2300,2300.HI19.02,Industry Code,Code indicating a code from a specific industry code list,R,,,VALUE_CODE_19,82,Claim,,,
2300,2300.HI19.05,Monetary Amount,Monetary amount,R,,,VALUE_AMOUNT_19,83,Claim,,,
2300,2300.HI20,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI20.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BE Value,"Hardcode as ""BE""",,,,,,
2300,2300.HI20.02,Industry Code,Code indicating a code from a specific industry code list,R,,,VALUE_CODE_20,84,Claim,,,
2300,2300.HI20.05,Monetary Amount,Monetary amount,R,,,VALUE_AMOUNT_20,85,Claim,,,
2300,2300.HI21,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI21.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BE Value,"Hardcode as ""BE""",,,,,,
2300,2300.HI21.02,Industry Code,Code indicating a code from a specific industry code list,R,,,VALUE_CODE_21,86,Claim,,,
2300,2300.HI21.05,Monetary Amount,Monetary amount,R,,,VALUE_AMOUNT_21,87,Claim,,,
2300,2300.HI22,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI22.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BE Value,"Hardcode as ""BE""",,,,,,
2300,2300.HI22.02,Industry Code,Code indicating a code from a specific industry code list,R,,,VALUE_CODE_22,88,Claim,,,
2300,2300.HI22.05,Monetary Amount,Monetary amount,R,,,VALUE_AMOUNT_22,89,Claim,,,
2300,2300.HI23,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI23.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BE Value,"Hardcode as ""BE""",,,,,,
2300,2300.HI23.02,Industry Code,Code indicating a code from a specific industry code list,R,,,VALUE_CODE_23,90,Claim,,,
2300,2300.HI23.05,Monetary Amount,Monetary amount,R,,,VALUE_AMOUNT_23,91,Claim,,,
2300,2300.HI24,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI24.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BE Value,"Hardcode as ""BE""",,,,,,
2300,2300.HI24.02,Industry Code,Code indicating a code from a specific industry code list,R,,,VALUE_CODE_24,92,Claim,,,
2300,2300.HI24.05,Monetary Amount,Monetary amount,R,,,VALUE_AMOUNT_24,93,Claim,,,
2300,HI,Condition Information -Segment Repeat: 2,,S,,,,,,,,
2300,2300.HI01,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",R,,,,,,,,
2300,2300.HI01.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG Condition,"Hardcode as ""BG""",,,,,,
2300,2300.HI01.02,Industry Code,Code indicating a code from a specific industry code list,R,,,CONDITION_CODE_01,22,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/prConditionCodes/string
2300,2300.HI02,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI02.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG Condition,"Hardcode as ""BG""",,,,,,
2300,2300.HI02.02,Industry Code,Code indicating a code from a specific industry code list,R,,,CONDITION_CODE_02,23,Claim,,,
2300,2300.HI03,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI03.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG Condition,"Hardcode as ""BG""",,,,,,
2300,2300.HI03.02,Industry Code,Code indicating a code from a specific industry code list,R,,,CONDITION_CODE_03,24,Claim,,,
2300,2300.HI04,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI04.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG Condition,"Hardcode as ""BG""",,,,,,
2300,2300.HI04.02,Industry Code,Code indicating a code from a specific industry code list,R,,,CONDITION_CODE_04,25,Claim,,,
2300,2300.HI05,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI05.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG Condition,"Hardcode as ""BG""",,,,,,
2300,2300.HI05.02,Industry Code,Code indicating a code from a specific industry code list,R,,,CONDITION_CODE_05,26,Claim,,,
2300,2300.HI06,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI06.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG Condition,"Hardcode as ""BG""",,,,,,
2300,2300.HI06.02,Industry Code,Code indicating a code from a specific industry code list,R,,,CONDITION_CODE_06,27,Claim,,,
2300,2300.HI07,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI07.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG Condition,"Hardcode as ""BG""",,,,,,
2300,2300.HI07.02,Industry Code,Code indicating a code from a specific industry code list,R,,,CONDITION_CODE_07,28,Claim,,,
2300,2300.HI08,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI08.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG Condition,"Hardcode as ""BG""",,,,,,
2300,2300.HI08.02,Industry Code,Code indicating a code from a specific industry code list,R,,,CONDITION_CODE_08,29,Claim,,,
2300,2300.HI09,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI09.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG Condition,"Hardcode as ""BG""",,,,,,
2300,2300.HI09.02,Industry Code,Code indicating a code from a specific industry code list,R,,,CONDITION_CODE_09,30,Claim,,,
2300,2300.HI10,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI10.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG Condition,"Hardcode as ""BG""",,,,,,
2300,2300.HI10.02,Industry Code,Code indicating a code from a specific industry code list,R,,,CONDITION_CODE_10,31,Claim,,,
2300,2300.HI11,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI11.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG Condition,"Hardcode as ""BG""",,,,,,
2300,2300.HI11.02,Industry Code,Code indicating a code from a specific industry code list,R,,,CONDITION_CODE_11,32,Claim,,,
2300,2300.HI12,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI12.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG Condition,"Hardcode as ""BG""",,,,,,
2300,2300.HI12.02,Industry Code,Code indicating a code from a specific industry code list,R,,,CONDITION_CODE_12,33,Claim,,,
2300,2300.HI13,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI13.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG Condition,"Hardcode as ""BG""",,,,,,
2300,2300.HI13.02,Industry Code,Code indicating a code from a specific industry code list,R,,,CONDITION_CODE_13,34,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/prConditionCodes/string
2300,2300.HI14,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI14.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG Condition,"Hardcode as ""BG""",,,,,,
2300,2300.HI14.02,Industry Code,Code indicating a code from a specific industry code list,R,,,CONDITION_CODE_14,35,Claim,,,
2300,2300.HI15,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI15.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG Condition,"Hardcode as ""BG""",,,,,,
2300,2300.HI15.02,Industry Code,Code indicating a code from a specific industry code list,R,,,CONDITION_CODE_15,36,Claim,,,
2300,2300.HI16,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI16.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG Condition,"Hardcode as ""BG""",,,,,,
2300,2300.HI16.02,Industry Code,Code indicating a code from a specific industry code list,R,,,CONDITION_CODE_16,37,Claim,,,
2300,2300.HI17,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI17.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG Condition,"Hardcode as ""BG""",,,,,,
2300,2300.HI17.02,Industry Code,Code indicating a code from a specific industry code list,R,,,CONDITION_CODE_17,38,Claim,,,
2300,2300.HI18,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI18.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG Condition,"Hardcode as ""BG""",,,,,,
2300,2300.HI18.02,Industry Code,Code indicating a code from a specific industry code list,R,,,CONDITION_CODE_18,39,Claim,,,
2300,2300.HI19,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI19.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG Condition,"Hardcode as ""BG""",,,,,,
2300,2300.HI19.02,Industry Code,Code indicating a code from a specific industry code list,R,,,CONDITION_CODE_19,40,Claim,,,
2300,2300.HI20,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI20.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG Condition,"Hardcode as ""BG""",,,,,,
2300,2300.HI20.02,Industry Code,Code indicating a code from a specific industry code list,R,,,CONDITION_CODE_20,41,Claim,,,
2300,2300.HI21,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI21.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG Condition,"Hardcode as ""BG""",,,,,,
2300,2300.HI21.02,Industry Code,Code indicating a code from a specific industry code list,R,,,CONDITION_CODE_21,42,Claim,,,
2300,2300.HI22,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI22.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG Condition,"Hardcode as ""BG""",,,,,,
2300,2300.HI22.02,Industry Code,Code indicating a code from a specific industry code list,R,,,CONDITION_CODE_22,43,Claim,,,
2300,2300.HI23,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI23.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG Condition,"Hardcode as ""BG""",,,,,,
2300,2300.HI23.02,Industry Code,Code indicating a code from a specific industry code list,R,,,CONDITION_CODE_23,44,Claim,,,
2300,2300.HI24,Healthcare code information,"To send health care codes and their associated dates, amounts and quantities",S,,,,,,,,
2300,2300.HI24.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG Condition,"Hardcode as ""BG""",,,,,,
2300,2300.HI24.02,Industry Code,Code indicating a code from a specific industry code list,R,,,CONDITION_CODE_24,45,Claim,,,
2300,HI,Treatment Code Information,,S,,,,,,,,
2300,2300.HI01.01,Code List Qualifier Code,,,TC Treatment Codes,,,,,,,
2300,2300.HI01.02,Industry Code,,,,,,,,,,
2300,2300.HI02.01,Code List Qualifier Code,,,,,,,,,,
2300,2300.HI02.02,Industry Code,,,,,,,,,,
2300,2300.HI03.01,Code List Qualifier Code,,,,,,,,,,
2300,2300.HI03.02,Industry Code,,,,,,,,,,
2300,2300.HI04.01,Code List Qualifier Code,,,,,,,,,,
2300,2300.HI04.02,Industry Code,,,,,,,,,,
2300,2300.HI05.01,Code List Qualifier Code,,,,,,,,,,
2300,2300.HI05.02,Industry Code,,,,,,,,,,
2300,2300.HI06.01,Code List Qualifier Code,,,,,,,,,,
2300,2300.HI06.02,Industry Code,,,,,,,,,,
2300,2300.HI07.01,Code List Qualifier Code,,,,,,,,,,
2300,2300.HI07.02,Industry Code,,,,,,,,,,
2300,2300.HI08.01,Code List Qualifier Code,,,,,,,,,,
2300,2300.HI08.02,Industry Code,,,,,,,,,,
2300,2300.HI09.01,Code List Qualifier Code,,,,,,,,,,
2300,2300.HI09.02,Industry Code,,,,,,,,,,
2300,2300.HI10.01,Code List Qualifier Code,,,,,,,,,,
2300,2300.HI10.02,Industry Code,,,,,,,,,,
2300,2300.HI11.01,Code List Qualifier Code,,,,,,,,,,
2300,2300.HI11.02,Industry Code,,,,,,,,,,
2300,2300.HI12.01,Code List Qualifier Code,,,,,,,,,,
2300,2300.HI12.02,Industry Code,,,,,,,,,,
2300,HI,Claim Pricing/Repricing Information,,,,,,,,,,
2300,2300.HCP01,Pricing Methodology,,,,,,,,,,
2300,2300.HCP02,Monetary Amount,,,,,,,,,,
2300,2300.HCP03,Monetary Amount,,,,,,,,,,
2300,2300.HCP04,Reference Identification,,,,,,,,,,
2300,2300.HCP05,Rate,,,,,,,,,,
2300,2300.HCP06,Reference Identification,,,,,,,,,,
2300,2300.HCP07,Monetary Amount,,,,,,,,,,
2300,2300.HCP08,Product/Service ID,,,,,,,,,,
2300,2300.HCP11,Unit or Basis for Measurement Code,,,"DA Days
UN Unit",,,,,,,
2300,2300.HCP12,Quantity,,,,,,,,,,
2300,2300.HCP13,Reject Reason Code,,,"T1 Cannot Identify Provider as TPO (Third Party
Organization) Participant
T2 Cannot Identify Payer as TPO (Third Party
Organization) Participant
T3 Cannot Identify Insured as TPO (Third Party
Organization) Participant
T4 Payer Name or Identifier Missing
T5 Certification Information Missing
T6 Claim does not contain enough information for repricing",,,,,,,
2300,2300.HCP14,Policy Compliance Code,,,"1 Procedure Followed (Compliance)
2 Not Followed - Call Not Made (Non-Compliance Call
Not Made)
3 Not Medically Necessary (Non-Compliance Non-
Medically Necessary)
4 Not Followed Other (Non-Compliance Other)
5 Emergency Admit to Non-Network Hospital",,,,,,,
2300,2300.HCP15,Exception Code,,,"1 Non-Network Professional Provider in Network
Hospital
2 Emergency Care
3 Services or Specialist not in Network
4 Out-of-Service Area
5 State Mandates
6 Other",,,,,,,
LOOP 2310A - ATTENDING PROVIDER NAME,,,,,,,,,,,,
2310A,NM1,Attending Provider Name,,S,,Generate this loop only if ATTENDING_LAST_NAME has value,,,,,,
2310A,2310A.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,71 Attending Physician,"Hardcode as ""71""",,,,,,
2310A,2310A.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,1 Person,"Hardcode as ""1""",,,,,,
2310A,2310A.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,ATTENDING_LAST_NAME,543,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/attendingInformation/practitioner/lastName
2310A,2310A.NM104,Name First,ndividual first name,S,,,ATTENDING_FIRST_NAME,544,Claim,,,"ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/attendingInformation/practitioner/firstName
ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/referringInformation/practitioner/firstName"
2310A,2310A.NM105,Name Middle,Individual middle name or initial,S,,,ATTENDING_MIDDLE_NAME,545,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/attendingInformation/practitioner/middleName
2310A,2310A.NM107,Name Suffix,Suffix to individual name,S,,,ATTENDING_NAME_SUFFIX,546,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/attendingInformation/practitioner/nameSuffix
2310A,2310A.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),S,"XX Centers for Medicare and Medicaid Services
National Provider Identifier","Hardcode as ""XX""",,,,,,
2310A,2310A.NM109,Identification Code,Code identifying a party or other code,S,,,ATTENDING_NPI,538,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/attendingInformation/NPI
2310A,PRV,Provider Information,,S,,,,,,,,
2310A,2310A.PRV01,Provider Code,Code identifying the type of provider,R,AT Attending,"Hardcode as ""AT""",,,,,,
2310A,2310A.PRV02,Reference Identification Qualifier,Code qualifying the Reference Identification,R,PXC Health Care Provider Taxonomy Code,"Hardcode as ""PXC""",,,,,,
2310A,2310A.PRV03,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,ATTENDING_TAXONOMY_CODE,541,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/attendingInformation/primarySpecialty/taxonomyCode
2310A,REF,Attending Provider Secondary Identification,,S,,,,,,,,
2310A,2310A.REF01,Reference Identification Qualifier,,,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number
LU Location Number",,,,,,,
2310A,2310A.REF02,Reference Identification,,,,,,,,,,
LOOP 2310B - OPERATING PHYSICIAN NAME,,,,,,,,,,,,
LOOP 2310B - RENDERING PROVIDER NAME,NM1,Operating Physician Name,,,,,,,,,,
2310B,2310B.NM101,Entity Identifier Code,,,72 Operating Physician,,,,,,,
2310B,2310B.NM102,Entity Type Qualifier,,,1 Person,,,,,,,
2310B,2310B.NM103,Name Last or Organization Name,,,,,,,,,,
2310B,2310B.NM104,Name First,,,,,,,,,,
2310B,2310B.NM105,Name Middle,,,,,,,,,,
2310B,2310B.NM107,Name Suffix,,,,,,,,,,
2310B,2310B.NM108,Identification Code Qualifier,,,"XX Centers for Medicare and Medicaid Services
National Provider Identifier",,,,,,,
2310B,2310B.NM109,Identification Code,,,,,,,,,,
2310B,REF,Operating Physician Secondary Identification,,,,,,,,,,
2310B,2310B.REF01,Reference Identification Qualifier,,,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number
LU Location Number",,,,,,,
2310B,2310B.REF02,Reference Identification,,,,,,,,,,
"LOOP 2310C - OTHER OPERATING PHYSICIAN
NAME",,,,,,,,,,,,
2310C,NM1,Other Operating Physician Name,,S,,Generate this loop if OTHER_OPERATING_LAST_NAME has value.,,,,,,
2310C,2310C.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,ZZ Mutually Defined,"Hardcode as ""ZZ""",,,,,,
2310C,2310C.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,1 Person,"Hardcode as ""1""",,,,,,
2310C,2310C.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,OTHER_OPERATING_LAST_NAME,565,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/otherPractitionerList/practitioner/practitioner/lastName
2310C,2310C.NM104,Name First,Individual first name,R,,,OTHER_OPERATING_FIRST_NAME,566,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/otherPractitionerList/practitioner/practitioner/firstName
2310C,2310C.NM105,Name Middle,Individual middle name or initial,S,,,OTHER_OPERATING_MIDDLE_NAME,567,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/otherPractitionerList/practitioner/practitioner/middleName
2310C,2310C.NM107,Name Suffix,Suffix to individual name,S,,,OTHER_OPERATING_NAME_SUFFIX,568,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/otherPractitionerList/practitioner/practitioner/nameSuffix
2310C,2310C.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),S,XX Centers for Medicare and Medicaid Services National Provider Identifier,"Hardcode as ""XX""",,,,,,
2310C,2310C.NM109,Identification Code,Code identifying a party or other code,S,,,OTHER_OPERATING_NPI,560,Claim,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/otherPractitionerList/practitioner/NPI
2310C,REF,Other Operating Physician Secondary Identification,,,,,,,,,,
2310C,2310C.REF01,Reference Identification Qualifier,,,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number
LU Location Number",,,,,,,
2310C,2310C.REF02,Reference Identification,,,,,,,,,,
LOOP 2310D - RENDERING PROVIDER NAME,,,,,,,,,,,,
2310D,NM1,Rendering Provider Name,,,,,,,,,,
2310D,2310D.NM101,Entity Identifier Code,,,82 Rendering Provider,,,,,,,
2310D,2310D.NM102,Entity Type Qualifier,,,1 Person,,,,,,,
2310D,2310D.NM103,Name Last or Organization Name,,,,,,,,,,
2310D,2310D.NM104,Name First,,,,,,,,,,
2310D,2310D.NM105,Name Middle,,,,,,,,,,
2310D,2310D.NM107,Name Suffix,,,,,,,,,,
2310D,2310D.NM108,Identification Code Qualifier,,,"XX Centers for Medicare and Medicaid Services
National Provider Identifier",,,,,,,
2310D,2310D.NM109,Identification Code,,,,,,,,,,
2310D,REF,Rendering Provider Secondary Identification,,,,,,,,,,
2310D,2310D.REF01,Reference Identification Qualifier,,,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number
LU Location Number",,,,,,,
2310D,2310D.REF02,Reference Identification,,,,,,,,,,
"LOOP 2310E - SERVICE FACILITY LOCATION
NAME",,,,,,,,,,,,
2310E,NM1,Service Facility Location Name,,,,,,,,,,
2310E,2310E.NM101,Entity Identifier Code,,,77 Service Location,,,,,,,
2310E,2310E.NM102,Entity Type Qualifier,,,2 Non-Person Entity,,,,,,,
2310E,2310E.NM103,Name Last or Organization Name,,,,,,,,,,
2310E,2310E.NM108,Identification Code Qualifier,,,"XX Centers for Medicare and Medicaid Services
National Provider Identifier",,,,,,,
2310E,2310E.NM109,Identification Code,,,,,,,,,,
2310E,N3,Service Facility Location Address (Required),,,,,,,,,,
2310E,2310E.N301,Address Information,,,,,,,,,,
2310E,2310E.N302,Address Information,,,,,,,,,,
2310E,N4,"Service Facility Location City, State, ZIP Code (Required)",,,,,,,,,,
2310E,2310E.N401,City Name,,,,,,,,,,
2310E,2310E.N402,State or Province Code,,,,,,,,,,
2310E,2310E.N403,Postal Code,,,,,,,,,,
2310E,2310E.N404,Country Code,,,,,,,,,,
2310E,2310E.N407,Country Subdivision Code,,,,,,,,,,
2310E,REF,Service Facility Location Secondary Identification,,S,,,,,,,,
2310E,2310E.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B State License Number
G2 Provider Commercial Number
LU Location Number",,,,,,,
2310E,2310E.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,
LOOP 2310F - REFERRING PROVIDER NAME,,,,,,,,,,,,
2310F,NM1,Referring Provider Name,,S,,,,,,,,
2310F,2310F.NM101,Entity Identifier Code,,,DN Referring Provider,,,,,,,
2310F,2310F.NM102,Entity Type Qualifier,,,1 Person,,,,,,,
2310F,2310F.NM103,Name Last or Organization Name,,,,,,,,,,
2310F,2310F.NM104,Name First,,,,,,,,,,
2310F,2310F.NM105,Name Middle,,,,,,,,,,
2310F,2310F.NM107,Name Suffix,,,,,,,,,,
2310F,2310F.NM108,Identification Code Qualifier,,,"XX Centers for Medicare and Medicaid Services
National Provider Identifier",,,,,,,
2310F,2310F.NM109,Identification Code,,,,,,,,,,
2310F,REF,Referring Provider Secondary Identification,,,,,,,,,,
2310F,2310F.REF01,Reference Identification Qualifier,,,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number",,,,,,,
2310F,2310F.REF02,Reference Identification,,,,,,,,,,
LOOP 2320 - OTHER SUBSCRIBER INFORMATION,,,,,,,,,,,,
2320,SBR,Other Subscriber Information,,S,,,,,,,,
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
U Unknown",,,,,,,
2320,2320.SBR02,Individual Relationship Code,Code indicating the relationship between two individuals or entities,R,"01 Spouse
18 Self
19 Child
20 Employee
21 Unknown
39 Organ Donor
40 Cadaver Donor
53 Life Partner
G8 Other Relationship",,,,,,,
2320,2320.SBR03,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,S,,,,,,,,
2320,2320.SBR04,Name,Free-form name,S,,,,,,,,
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
ZZ Mutually Defined",,,,,,,
2320,CAS,Claim Level Adjustments,,,,,,,,,,
2320,2320.CAS01,Claim Adjustment Group Code,,,"CO Contractual Obligations
CR Correction and Reversals
OA Other adjustments
PI Payor Initiated Reductions
PR Patient Responsibility",,,,,,,
2320,2320.CAS02,Claim Adjustment Reason Code,,,,,,,,,,
2320,2320.CAS03,Monetary Amount,,,,,,,,,,
2320,2320.CAS04,Quantity,,,,,,,,,,
2320,2320.CAS05,Claim Adjustment Reason Code,,,,,,,,,,
2320,2320.CAS06,Monetary Amount,,,,,,,,,,
2320,2320.CAS07,Quantity,,,,,,,,,,
2320,2320.CAS08,Claim Adjustment Reason Code,,,,,,,,,,
2320,2320.CAS09,Monetary Amount,,,,,,,,,,
2320,2320.CAS10,Quantity,,,,,,,,,,
2320,2320.CAS11,Claim Adjustment Reason Code,,,,,,,,,,
2320,2320.CAS12,Monetary Amount,,,,,,,,,,
2320,2320.CAS13,Quantity,,,,,,,,,,
2320,2320.CAS14,Claim Adjustment Reason Code,,,,,,,,,,
2320,2320.CAS15,Monetary Amount,,,,,,,,,,
2320,2320.CAS16,Quantity,,,,,,,,,,
2320,2320.CAS17,Claim Adjustment Reason Code,,,,,,,,,,
2320,2320.CAS18,Monetary Amount,,,,,,,,,,
2320,2320.CAS19,Quantity,,,,,,,,,,
2320,AMT,Coordination of Benefits (COB) Payer Paid Amount,,S,,,,,,,,
2320,2320.AMT01,Amount Qualifier Code,Code to qualify amount,R,D Payor Amount Paid,,,,,,,
2320,2320.AMT02,Monetary Amount,Monetary amount,R,,,,,,,,
2320,AMT,Remaining Patient Liability,,S,,,,,,,,
2320,2320.AMT01,Amount Qualifier Code,Code to qualify amount,R,EAF Amount Owed,,,,,,,
2320,2320.AMT02,Monetary Amount,,,,,,,,,,
2320,AMT,Coordination of Benefits (COB) Total Non-covered Amount,,,,,,,,,,
2320,2320.AMT01,Amount Qualifier Code,,,A8 Noncovered Charges - Actual,,,,,,,
2320,2320.AMT02,Monetary Amount,,,,,,,,,,
2320,OI,Other Insurance Coverage Information (Required),,R,,,,,,,,
2320,2320.OI03,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,R,"N No
W Not Applicable
Y Yes",,,,,,,
2320,2320.OI06,Release of Information Code,Code indicating whether the provider has on file a signed statement by the patient authorizing the release of medical data to other organizations,R,"I Informed Consent to Release Medical Information
for Conditions or Diagnoses Regulated by Federal
Statutes
Y Yes, Provider has a Signed Statement Permitting
Release of Medical Billing Data Related to a Claim",,,,,,,
2320,MIA,Inpatient Adjudication Information,,,,,,,,,,
2320,2320.MIA01,Quantity,,,,,,,,,,
2320,2320.MIA03,Quantity,,,,,,,,,,
2320,2320.MIA04,Monetary Amount,,,,,,,,,,
2320,2320.MIA05,Reference Identification,,,,,,,,,,
2320,2320.MIA06,Monetary Amount,,,,,,,,,,
2320,2320.MIA07,Monetary Amount,,,,,,,,,,
2320,2320.MIA08,Monetary Amount,,,,,,,,,,
2320,2320.MIA09,Monetary Amount,,,,,,,,,,
2320,2320.MIA10,Monetary Amount,,,,,,,,,,
2320,2320.MIA11,Monetary Amount,,,,,,,,,,
2320,2320.MIA12,Monetary Amount,,,,,,,,,,
2320,2320.MIA13,Monetary Amount,,,,,,,,,,
2320,2320.MIA14,Monetary Amount,,,,,,,,,,
2320,2320.MIA15,Quantity,,,,,,,,,,
2320,2320.MIA16,Monetary Amount,,,,,,,,,,
2320,2320.MIA17,Monetary Amount,,,,,,,,,,
2320,2320.MIA18,Monetary Amount,,,,,,,,,,
2320,2320.MIA19,Monetary Amount,,,,,,,,,,
2320,2320.MIA20,Reference Identification,,,,,,,,,,
2320,2320.MIA21,Reference Identification,,,,,,,,,,
2320,2320.MIA22,Reference Identification,,,,,,,,,,
2320,2320.MIA23,Reference Identification,,,,,,,,,,
2320,2320.MIA24,Monetary Amount,,,,,,,,,,
2320,MOA,Outpatient Adjudication Information,,,,,,,,,,
2320,2320.MOA01,Percentage as Decimal,,,,,,,,,,
2320,2320.MOA02,Monetary Amount,,,,,,,,,,
2320,2320.MOA03,Reference Identification,,,,,,,,,,
2320,2320.MOA04,Reference Identification,,,,,,,,,,
2320,2320.MOA05,Reference Identification,,,,,,,,,,
2320,2320.MOA06,Reference Identification,,,,,,,,,,
2320,2320.MOA07,Reference Identification,,,,,,,,,,
2320,2320.MOA08,Monetary Amount,,,,,,,,,,
2320,2320.MOA09,Monetary Amount,,,,,,,,,,
LOOP 2330A - OTHER SUBSCRIBER NAME,,,,,,,,,,,,
2330A,NM1,Other Subscriber Name (Required),,R,,,,,,,,
2330A,2330A.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,IL Insured or Subscriber,,,,,,,
2330A,2330A.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,"1 Person
2 Non-Person Entity",,,,,,,
2330A,2330A.NM103,Name Last or Organization Name,Individual last name or organizational name,S,,,,,,,,
2330A,2330A.NM104,Name First,Individual first name,S,,,,,,,,
2330A,2330A.NM105,Name Middle,Individual middle name or initia,S,,,,,,,,
2330A,2330A.NM107,Name Suffix,Suffix to individual name,S,,,,,,,,
2330A,2330A.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),R,"II Standard Unique Health Identifier for each Individual
in the United States
MI Member Identification Number",,,,,,,
2330A,2330A.NM109,Identification Code,Code designating the system/method of code structure used for Identification Code (67),R,,,,,,,,
2330A,N3,Other Subscriber Address,,S,,,,,,,,
2330A,2330A.N301,Address Information,Address information,R,,,,,,,,
2330A,2330A.N302,Address Information,Address information,S,,,,,,,,
2330A,N4,Other Subscriber City/State/ZIP Code,,R,,,,,,,,
2330A,2330A.N401,City Name,Free-form text for city name,R,,,,,,,,
2330A,2330A.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,,,,,,
2330A,2330A.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,,,,,,,
2330A,2330A.N404,Country Code,Code identifying the country,S,,,,,,,,
2330A,2330A.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,,,
2330A,REF,Other Subscriber Secondary Information,,,,,,,,,,
2330A,2330A.REF01,Reference Identification Qualifier,,,SY Social Security Number,,,,,,,
2330A,2330A.REF02,Reference Identification,,,,,,,,,,
LOOP 2330B - OTHER PAYER NAME,,,,,,,,,,,,
2330B,NM1,Other Payer Name (Required),,R,,,,,,,,
2330B,2330B.NM101,Entity Identifier Code,,R,PR Payer,,,,,,,
2330B,2330B.NM102,Entity Type Qualifier,,R,2 Non-Person Entity,,,,,,,
2330B,2330B.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,,,,,,
2330B,2330B.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),R,"PI Payor Identification
XV Centers for Medicare and Medicaid Services PlanID",,,,,,,
2330B,2330B.NM109,Identification Code,Code identifying a party or other code,R,,,,,,,,
2330B,N3,Other Payer Address,,S,,,,,,,,
2330B,2330B.N301,Address Information,Address information,R,,,,,,,,
2330B,2330B.N302,Address Information,Address information,S,,,,,,,,
2330B,N4,Other Payer City/State/ZIP Code,,R,,,,,,,,
2330B,2330B.N401,City Name,Free-form text for city name,R,,,,,,,,
2330B,2330B.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,,,,,,
2330B,2330B.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,,,,,,,
2330B,2330B.N404,Country Code,Code identifying the country,S,,,,,,,,
2330B,2330B.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,,,
2330B,DTP,Claim Check or Remittance Date,,,,,,,,,,
2330B,2330B.DTP01,Date/Time Qualifier,,,573 Date Claim Paid,,,,,,,
2330B,2330B.DTP02,Date Time Period Format Qualifier,,,D8 Date Expressed in Format CCYYMMDD,,,,,,,
2330B,2330B.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,,,,
2330B,REF,Other Payer Secondary Identifier,,,,,,,,,,
2330B,2330B.REF01,Reference Identification Qualifier,,,"2U Payer Identification Number
EI Employer’s Identification Number
FY Claim Office Number
NF National Association of Insurance Commissioners
(NAIC) Code",,,,,,,
2330B,2330B.REF02,Reference Identification,,,,,,,,,,
2330B,REF,Other Payer Prior Authorization Number,,S,,,,,,,,
2330B,2330B.REF01,Reference Identification Qualifier,,R,G1 Prior Authorization Number,,,,,,,
2330B,2330B.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,
2330B,REF,Other Payer Referral Number,,,,,,,,,,
2330B,2330B.REF01,Reference Identification Qualifier,,,9F Referral Number,,,,,,,
2330B,2330B.REF02,Reference Identification,,,,,,,,,,
2330B,REF,Other Payer Claim Adjustment Indicator,,,,,,,,,,
2330B,2330B.REF01,Reference Identification Qualifier,,,T4 Signal Code,,,,,,,
2330B,2330B.REF02,Reference Identification,,,,,,,,,,
2330B,REF,Other Payer Claim Control Number,,S,,,,,,,,
2330B,2330B.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,F8 Original Reference Number,,,,,,,
2330B,2330B.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,
"LOOP 2330C - OTHER PAYER ATTENDING
PROVIDER",,,,,,,,,,,,
2330C,NM1,Other Payer Attending Provider,,S,,,,,,,,
2330C,2330C.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,71 Attending Physician,,,,,,,
2330C,2330C.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,1 Person,,,,,,,
2330C,REF,Other Payer Attending Provider Secondary Identification (Required),,,,,,,,,,
2330C,2330C.REF01,Reference Identification Qualifier,,,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number
LU Location Number",,,,,,,
2330C,2330C.REF02,Reference Identification,,,,,,,,,,
"LOOP 2330D - OTHER PAYER OPERATING
PHYSICIAN",,,,,,,,,,,,
2330D,NM1,Other Payer Operating Physician,,,,,,,,,,
2330D,2330D.NM101,Entity Identifier Code,,,72 Operating Physician,,,,,,,
2330D,2330D.NM102,Entity Type Qualifier,,,1 Person,,,,,,,
2330D,REF,Other Payer Operating Physician Secondary Identification (Required),,,,,,,,,,
2330D,2330D.REF01,Reference Identification Qualifier,,,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number
LU Location Number",,,,,,,
2330D,2330D.REF02,Reference Identification,,,,,,,,,,
"LOOP 2330E - OTHER PAYER OTHER OPERATING
PHYSICIAN",,,,,,,,,,,,
2330E,NM1,Other Payer Other Operating Physician,,,,,,,,,,
2330E,2330E.NM101,Entity Identifier Code,,,ZZ Mutually Defined,,,,,,,
2330E,2330E.NM102,Entity Type Qualifier,,,1 Person,,,,,,,
2330E,REF,Other Payer Other Operating Physician Secondary Identification (Required),,,,,,,,,,
2330E,2330E.REF01,Reference Identification Qualifier,,,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number
LU Location Number",,,,,,,
2330E,2330E.REF02,Reference Identification,,,,,,,,,,
"LOOP 2330F - OTHER PAYER SERVICE FACILITY
LOCATION",,,,,,,,,,,,
2330F,NM1,Other Payer Service Facility Location,,,,,,,,,,
2330F,2330F.NM101,Entity Identifier Code,,,77 Service Location,,,,,,,
2330F,2330F.NM102,Entity Type Qualifier,,,2 Non-Person Entity,,,,,,,
2330F,REF,Other Payer Service Facility Location Identification (Required),,,,,,,,,,
2330F,2330F.REF01,Reference Identification Qualifier,,,"0B State License Number
G2 Provider Commercial Number
LU Location Number",,,,,,,
2330F,2330F.REF02,Reference Identification,,,,,,,,,,
"LOOP 2330G - OTHER PAYER RENDERING
PROVIDER NAME",,,,,,,,,,,,
2330G,NM1,Other Payer Rendering Provider Name,,,,,,,,,,
2330G,2330G.NM101,Entity Identifier Code,,,82 Rendering Provider,,,,,,,
2330G,2330G.NM102,Entity Type Qualifier,,,1 Person,,,,,,,
2330G,REF,Other Payer Rendering Provider Secondary Identification (Required),,,,,,,,,,
2330G,2330G.REF01,Reference Identification Qualifier,,,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number
LU Location Number",,,,,,,
2330G,2330G.REF02,Reference Identification,,,,,,,,,,
"LOOP 2330H - OTHER PAYER REFERRING
PROVIDER",,,,,,,,,,,,
2330H,NM1,Other Payer Referring Provider,,,,,,,,,,
2330H,2330H.NM101,Entity Identifier Code,,,DN Referring Provider,,,,,,,
2330H,2330H.NM102,Entity Type Qualifier,,,1 Person,,,,,,,
2330H,REF,Other Payer Referring Provider Secondary Identification (Required),,,,,,,,,,
2330H,2330H.REF01,Reference Identification Qualifier,,,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number",,,,,,,
2330H,2330H.REF02,Reference Identification,,,,,,,,,,
LOOP 2330I - OTHER PAYER BILLING PROVIDER,,,,,,,,,,,,
2330I,NM1,Other Payer Billing Provider,,,,,,,,,,
2330I,2330I.NM101,Entity Identifier Code,,,85 Billing Provider,,,,,,,
2330I,2330I.NM102,Entity Type Qualifier,,,2 Non-Person Entity,,,,,,,
2330I,REF,Other Payer Billing Provider Secondary Identification (Required),,,,,,,,,,
2330I,2330I.REF01,Reference Identification Qualifier,,,"G2 Provider Commercial Number
LU Location Number",,,,,,,
2330I,2330I.REF02,Reference Identification,,,,,,,,,,
LOOP 2400 - SERVICE LINE NUMBER,,,,,,,,,,,,
2400,LX,Service Line Number (Required),,R,,,,,,,,
2400,2400.LX01,Assigned Number,Number assigned for differentiation within a transaction set,R,,,LINE_SEQ,382,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/claimLineId
2400,SV2,Institutional Service Line (Required),,R,,,,,,,,
2400,2400.SV201,Product/Service ID,Identifying number for a product or service,R,,SUB_REV_CODE,SUB_REV_CODE,385,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/revenueCode
2400,2400.SV202.01,Product/Service ID Qualifier,Code identifying the type/source of the descriptive number used in Product/Service ID (234),R,"ER Jurisdiction Specific Procedure and Supply Codes
HC Health Care Financing Administration Common
Procedural Coding System (HCPCS) Codes
HP Health Insurance Prospective Payment System
(HIPPS) Skilled Nursing Facility Rate Code
IV Home Infusion EDI Coalition (HIEC) Product/Service
Code
WK Advanced Billing Concepts (ABC) Codes","Hardcode as ""HC""",,,,,,
2400,2400.SV202.02,Product/Service ID,Identifying number for a product or service,R,,,SUB_HCPCS,386,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/serviceCode
2400,2400.SV202.03,Procedure Modifier,"This identifies special circumstances related to the performance of the service, as defined by trading partners",S,,,SUB_MOD_01,387,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/modifierList/string
2400,2400.SV202.04,Procedure Modifier,"This identifies special circumstances related to the performance of the service, as defined by trading partners",S,,,SUB_MOD_02,388,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/modifierList/string
2400,2400.SV202.05,Procedure Modifier,"This identifies special circumstances related to the performance of the service, as defined by trading partners",S,,,SUB_MOD_03,389,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/modifierList/string
2400,2400.SV202.06,Procedure Modifier,"This identifies special circumstances related to the performance of the service, as defined by trading partners",S,,,SUB_MOD_04,390,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/modifierList/string
2400,2400.SV202.07,Description,A free-form description to clarify the related data elements and their content,S,,,SUB_HCPCS_DESC,829,Line,,,
2400,2400.SV203,Monetary Amount,Monetary amount,R,,,SUB_AMOUNT,397,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/requestedAmount
2400,2400.SV204,Unit or Basis for Measurement Code,"Code specifying the units in which a value is being expressed, or manner in which a measurement has been taken",R,"DA Days
UN Unit",Hardcode as 'UN',,,,,,
2400,2400.SV205,Quantity,Numeric value of quantity,R,,,SUB_UNITS,396,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/units
2400,2400.SV207,Monetary Amount,Monetary amount,S,,,,,,,,
2400,PWK,Line Supplemental Information,,,,,,,,,,
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
XP Photographs",,,,,,,
2400,2400.PWK02,Report Transmission Code,,,"AA Available on Request at Provider Site
BM By Mail
EL Electronically Only
EM E-Mail
FT File Transfer
FX By Fax",,,,,,,
2400,2400.PWK05,Identification Code Qualifier,,,AC Attachment Control Number,,,,,,,
2400,2400.PWK06,Identification Code,,,,,,,,,,
2400,DTP,Date - Service Date,,S,,,,,,,,
2400,2400.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,472 Service,"Hardcode as ""472""",,,,,,
2400,2400.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,"D8 Date Expressed in Format CCYYMMDD
RD8 Range of Dates Expressed in Format CCYYMMDDCCYYMMDD","Hardcode ""RD8""  if LINE_END_DOS is present. Else D8.",,,,,,
2400,2400.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,LINE_BEGIN_DOS + LINE_END_DOS separated by hyphen,383 + 384,Line,,,"ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/serviceStartDate ""-"" ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/serviceEndDate"
2400,REF,Line Item Control Number,,S,,,,,,,,
2400,2400.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,6R Provider Control Number,,,,,,,
2400,2400.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,
2400,REF,REF Repriced Line Item Reference Number,,,,,,,,,,
2400,2400.REF01,Reference Identification Qualifier,,,9B Repriced Line Item Reference Number,,,,,,,
2400,2400.REF02,Reference Identification,,,,,,,,,,
2400,REF,Adjusted Repriced Line Item Reference Number,,,,,,,,,,
2400,2400.REF01,Reference Identification Qualifier,,,9D Adjusted Repriced Line Item Reference Number,,,,,,,
2400,2400.REF02,Reference Identification,,,,,,,,,,
2400,AMT,Service Tax Amount,,,,,,,,,,
2400,2400.AMT01,Amount Qualifier Code,,,GT Goods and Services Tax,,,,,,,
2400,2400.AMT02,Monetary Amount,,,,,,,,,,
2400,AMT,Facility Tax Amount,,,,,,,,,,
2400,2400.AMT01,Amount Qualifier Code,,,N8 Miscellaneous Taxes,,,,,,,
2400,2400.AMT02,Monetary Amount,,,,,,,,,,
2400,NTE,Third Party Organization Notes,,,,,,,,,,
2400,2400.NTE01,Note Reference Code,,,TPO Third Party Organization Notes,,,,,,,
2400,2400.NTE02,Description,,,,,,,,,,
2400,HCP,Line Pricing/Repricing Information,,,,,,,,,,
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
14 Adjustment Pricing",Hardcode as 03,,,,,,
2400,2400.HCP02,Monetary Amount,,,,,ALLOWED_AMOUNT,,Line,,,
2400,2400.HCP03,Monetary Amount,,,,,PPO_discount,,Line,,,
2400,2400.HCP04,Reference Identification,,,,,PPO_ID,,Line,,,
2400,2400.HCP05,Rate,,,,,,,,,,
2400,2400.HCP06,Reference Identification,,,,,,,,,,
2400,2400.HCP07,Monetary Amount,,,,,,,,,,
2400,2400.HCP08,Product/Service ID,,,,,,,,,,
2400,2400.HCP09,Product/Service ID Qualifier,,,"ER Jurisdiction Specific Procedure and Supply Codes
HC Health Care Financing Administration Common
Procedural Coding System (HCPCS) Codes
HP Health Insurance Prospective Payment System
(HIPPS) Skilled Nursing Facility Rate Code
IV Home Infusion EDI Coalition (HIEC) Product/Service
Code
WK Advanced Billing Concepts (ABC) Codes",,,,,,,
2400,2400.HCP10,Product/Service ID,,,,,,,,,,
2400,2400.HCP11,Unit or Basis for Measurement Code,,,"DA Days
UN Unit",Hardcode as 'UN',,,,,,
2400,2400.HCP12,Quantity,,,,,ALLOWED_UNITS,,Line,,,
2400,2400.HCP13,Reject Reason Code,,,"T1 Cannot Identify Provider as TPO (Third Party
Organization) Participant
T2 Cannot Identify Payer as TPO (Third Party
Organization) Participant
T3 Cannot Identify Insured as TPO (Third Party
Organization) Participant
T4 Payer Name or Identifier Missing
T5 Certification Information Missing
T6 Claim does not contain enough information for repricing",,,,,,,
2400,2400.HCP14,Policy Compliance Code,,,"1 Procedure Followed (Compliance)
2 Not Followed - Call Not Made (Non-Compliance Call
Not Made)
3 Not Medically Necessary (Non-Compliance Non-
Medically Necessary)
4 Not Followed Other (Non-Compliance Other)
5 Emergency Admit to Non-Network Hospital",,,,,,,
2400,2400.HCP15,Exception Code,,,"1 Non-Network Professional Provider in Network
Hospital
2 Emergency Care
3 Services or Specialist not in Network
4 Out-of-Service Area
5 State Mandates
6 Other",,,,,,,
LOOP 2410 - DRUG IDENTIFICATION,,,,,,,,,,,,
2410,LIN,Drug Identification,,S,,,,,,,,
2410,2410.LIN02,Product/Service ID Qualifier,Code identifying the type/source of the descriptive number used in Product/Service ID (234),R,N4 National Drug Code in 5-4-2 Format,"Hardcode as ""N4""",,,,,,
2410,2410.LIN03,Product/Service ID,Identifying number for a product or service,R,,SUB_NDC,SUB_NDC,399,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/ndcCodes/NDCCode/ndcCode
2410,CTP,Drug Quantity (Required),,R,,,,,,,,
2410,2410.CTP04,Quantity,Numeric value of quantity,R,,SUB_NDC_UNITS,SUB_NDC_UNITS,400,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/ndcCodes/NDCCode/quantity
2410,2410.CTP05,COMPOSITE UNIT OF MEASURE,To identify a composite unit of measure,R,,,,,,,,
2410,2410.CTP05.01,Unit or Basis for Measurement Code,"Code specifying the units in which a value is being expressed, or manner in which a measurement has been taken",R,"F2 International Unit
GR Gram
ME Milligram
ML Milliliter
UN Unit",SUB_NDC_UNITS_TYPE,SUB_NDC_UNITS_TYPE,401,Line,,,ClaimServiceStronglyTypedOBResponseRoot/ClaimServiceStronglyTypedOBResponse/getClaimDetailsByHccIDResponseRecordList/getClaimDetailsByHccIDResponseRecord/getClaimDetailsByHccIDResponse/claimDetails/claimExtract/EOBPaymentInformation/eobClaimDetail/claim/claimLine/claimLine/ndcCodes/NDCCode/measurementType
2410,REF,Prescription or Compound Drug Association Number,,,,,,,,,,
2410,2410.REF01,Reference Identification Qualifier,,,"VY Link Sequence Number
XZ Pharmacy Prescription Number",,,,,,,
2410,2410.REF02,Reference Identification,,,,,,,,,,
LOOP 2420A - OPERATING PHYSICIAN NAME,,,,,,,,,,,,
2420A,NM1,Operating Physician Name,,,,,,,,,,
2420A,2420A.NM101,Entity Identifier Code,,,72 Operating Physician,,,,,,,
2420A,2420A.NM102,Entity Type Qualifier,,,1 Person,,,,,,,
2420A,2420A.NM103,Name Last or Organization Name,,,,,,,,,,
2420A,2420A.NM104,Name First,,,,,,,,,,
2420A,2420A.NM105,Name Middle,,,,,,,,,,
2420A,2420A.NM107,Name Suffix,,,,,,,,,,
2420A,2420A.NM108,Identification Code Qualifier,,,"XX Centers for Medicare and Medicaid Services
National Provider Identifier",,,,,,,
2420A,2420A.NM109,Identification Code,,,,,,,,,,
2420A,REF,Operating Physician Secondary Identification,,,,,,,,,,
2420A,2420A.REF01,Reference Identification Qualifier,,,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number
LU Location Number",,,,,,,
2420A,2420A.REF02,Reference Identification,,,,,,,,,,
2420A,2420A.REF04.01,Reference Identification Qualifier,,,2U Payer Identification Number,,,,,,,
2420A,2420A.REF04.02,Reference Identification,,,,,,,,,,
"LOOP 2420B - OTHER OPERATING PHYSICIAN
NAME",,,,,,,,,,,,
2420B,NM1,Other Operating Physician Name,,,,,,,,,,
2420B,2420B.NM101,Entity Identifier Code,,,ZZ Mutually Defined,,,,,,,
2420B,2420B.NM102,Entity Type Qualifier,,,1 Person,,,,,,,
2420B,2420B.NM103,Name Last or Organization Name,,,,,,,,,,
2420B,2420B.NM104,Name First,,,,,,,,,,
2420B,2420B.NM105,Name Middle,,,,,,,,,,
2420B,2420B.NM107,Name Suffix,,,,,,,,,,
2420B,2420B.NM108,Identification Code Qualifier,,,"XX Centers for Medicare and Medicaid Services
National Provider Identifier",,,,,,,
2420B,2420B.NM109,Identification Code,,,,,,,,,,
2420B,REF,Other Operating Physician Secondary Identification,,,,,,,,,,
2420B,2420B.REF01,Reference Identification Qualifier,,,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number
LU Location Number",,,,,,,
2420B,2420B.REF02,Reference Identification,,,,,,,,,,
2420B,2420B.REF04.01,Reference Identification Qualifier,,,2U Payer Identification Number,,,,,,,
2420B,2420B.REF04.02,Reference Identification,,,,,,,,,,
LOOP 2420C - RENDERING PROVIDER NAME,,,,,,,,,,,,
2420C,NM1,Rendering Provider Name,,S,,,,,,,,
2420C,2420C.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,82 Rendering Provider,,,,,,,
2420C,2420C.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,1 Person,,,,,,,
2420C,2420C.NM103,Name Last or Organization Name,Individual last name or organizational nam,R,,,,,,,,
2420C,2420C.NM104,Name First,Individual first name,S,,,,,,,,
2420C,2420C.NM105,Name Middle,Individual middle name or initial,S,,,,,,,,
2420C,2420C.NM107,Name Suffix,Suffix to individual name,S,,,,,,,,
2420C,2420C.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),S,XX Centers for Medicare and Medicaid Services National Provider Identifier,,,,,,,
2420C,2420C.NM109,Identification Code,Code identifying a party or other code,,,,,,,,,
2420C,REF,Rendering Provider Secondary Identification,,,,,,,,,,
2420C,2420C.REF01,Reference Identification Qualifier,,,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number
LU Location Number",,,,,,,
2420C,2420C.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,,
2420C,2420C.REF04.01,Reference Identification Qualifier,,,2U Payer Identification Number,,,,,,,
2420C,2420C.REF04.02,Reference Identification,,,,,,,,,,
LOOP 2420D - REFERRING PROVIDER NAME,,,,,,,,,,,,
2420D,NM1,Referring Provider Name,,,,,,,,,,
2420D,2420D.NM101,Entity Identifier Code,,,DN Referring Provider,,,,,,,
2420D,2420D.NM102,Entity Type Qualifier,,,1 Person,,,,,,,
2420D,2420D.NM103,Name Last or Organization Name,,,,,,,,,,
2420D,2420D.NM104,Name First,,,,,,,,,,
2420D,2420D.NM105,Name Middle,,,,,,,,,,
2420D,2420D.NM107,Name Suffix,,,,,,,,,,
2420D,2420D.NM108,Identification Code Qualifier,,,"XX Centers for Medicare and Medicaid Services
National Provider Identifier",,,,,,,
2420D,2420D.NM109,Identification Code,,,,,,,,,,
2420D,REF,Referring Provider Secondary Identification,,,,,,,,,,
2420D,2420D.REF01,Reference Identification Qualifier,,,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number",,,,,,,
2420D,2420D.REF02,Reference Identification,,,,,,,,,,
2420D,2420D.REF04.01,Reference Identification Qualifier,,,2U Payer Identification Number,,,,,,,
2420D,2420D.REF04.02,Reference Identification,,,,,,,,,,
LOOP 2430 - LINE ADJUDICATION INFORMATION,,,,,,,,,,,,
2430,SVD,Line Adjudication Information,,,,Map this loop only if REPRICER_NAME/EXTERNAL_EDITOR  is 'Zelis',,,,,,
2430,2430.SVD01,Identification Code,Code identifying a party or other code,R,,"Default value ""1234567""",,,,,,
2430,2430.SVD02,Monetary Amount,Monetary amount,R,,,SUB_AMOUNT,297,Line,,,
2430,2430.SVD03.01,Product/Service ID Qualifier,Code identifying the type/source of the descriptive number used in Product/Service ID (234),R,"ER Jurisdiction Specific Procedure and Supply Codes
HC Health Care Financing Administration Common
Procedural Coding System (HCPCS) Codes
HP Health Insurance Prospective Payment System
(HIPPS) Skilled Nursing Facility Rate Code
IV Home Infusion EDI Coalition (HIEC) Product/Service
Code
WK Advanced Billing Concepts (ABC) Codes",Hardcode as 'HC',,,,,,
2430,2430.SVD03.02,Product/Service ID,Identifying number for a product or service,R,,,SUB_HCPCS,386,Line,,,
2430,2430.SVD03.03,Procedure Modifier,"This identifies special circumstances related to the performance of the service, as defined by trading partners",S,,,SUB_MOD_01,387,Line,,,
2430,2430.SVD03.04,Procedure Modifier,"This identifies special circumstances related to the performance of the service, as defined by trading partners",S,,,SUB_MOD_02,388,Line,,,
2430,2430.SVD03.05,Procedure Modifier,"This identifies special circumstances related to the performance of the service, as defined by trading partners",S,,,SUB_MOD_03,389,Line,,,
2430,2430.SVD03.06,Procedure Modifier,"This identifies special circumstances related to the performance of the service, as defined by trading partners",S,,,SUB_MOD_04,390,Line,,,
2430,2430.SVD03.07,Description,A free-form description to clarify the related data elements and their content,S,,,SUB_HCPCS_DESC,829,Line,,,
2430,2430.SVD04,Product/Service ID,,,,,,,,,,
2430,2430.SVD05,Quantity,Numeric value of quantity,R,,,SUB_UNITS,396,Line,,,
2430,2430.SVD06,Assigned Number,Number assigned for differentiation within a transaction set,S,,,,,,,,
2430,CAS,Line Adjustment,,S,,,,,,,,
2430,2430.CAS01,Claim Adjustment Group Code,,,"CO Contractual Obligations
CR Correction and Reversals
OA Other adjustments
PI Payor Initiated Reductions
PR Patient Responsibility",Hardcode 'PR',,,,,,
2430,2430.CAS02,Claim Adjustment Reason Code,,,,Hardcode '1',,,,If  DEDUCTIBLE_AMOUNT is not zero,,
2430,2430.CAS03,Monetary Amount,,,,,DEDUCTIBLE_AMOUNT,191,Line,,,
2430,2430.CAS04,Quantity,,,,,,,,,,
2430,2430.CAS05,Claim Adjustment Reason Code,,,,Hardcode '2',,,,If COINSURANCE_AMOUNT is not zero,,
2430,2430.CAS06,Monetary Amount,,,,,COINSURANCE_AMOUNT,190,Line,,,
2430,2430.CAS07,Quantity,,,,,,,,,,
2430,2430.CAS08,Claim Adjustment Reason Code,,,,Hardcode '3',,,,If COPAY_AMOUNT is not zero,,
2430,2430.CAS09,Monetary Amount,,,,,COPAY_AMOUNT,189,Line,,,
2430,2430.CAS10,Quantity,,,,,,,,,,
2430,2430.CAS11,Claim Adjustment Reason Code,,,,,,,,,,
2430,2430.CAS12,Monetary Amount,,,,,,,,,,
2430,2430.CAS13,Quantity,,,,,,,,,,
2430,2430.CAS14,Claim Adjustment Reason Code,,,,,,,,,,
2430,2430.CAS15,Monetary Amount,,,,,,,,,,
2430,2430.CAS16,Quantity,,,,,,,,,,
2430,2430.CAS17,Claim Adjustment Reason Code,,,,,,,,,,
2430,2430.CAS18,Monetary Amount,,,,,,,,,,
2430,2430.CAS19,Quantity,,,,,,,,,,
2430,DTP,Line Check or Remittance Date (Required),,R,,,,,,,,
2430,2430.DTP01,Date/Time Qualifier,,R,573 Date Claim Paid,Hardcode '573',,,,,,
2430,2430.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,Hardcode D8,,,,,,
2430,2430.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,Populate current date in format CCYYMMDD,,,,,,
2430,AMT,Remaining Patient Liability,,,,,,,,,,
2430,2430.AMT01,Amount Qualifier Code,,,EAF Amount Owed,,,,,,,
2430,2430.AMT02,Monetary Amount,,,,,,,,,,
SE Transaction Set Trailer (Required),,,,,,,,,,,,
,SE01,Number of Included Segments,,,,Count Of ST,,,,,,
,SE02,Transaction Set Control Number,,,,,,,,,,
GE Functional Group Trailer (Required),,,,,,,,,,,,
,GE01,Number of Transaction Sets Included,,,,Count Of GS,,,,,,
,GE02,Group Control Number,,,,GS06 Value,,,,,,
IEA Interchange Control Trailer (Required),,,,,,,,,,,,
,IEA01,Number of Included Functional Groups,,,,Count Of ISA,,,,,,
,IEA02,Interchange Control Number,,,,ISA13 Value,,,,,,
,,,,,,,,,,,,
,,,,,,,,,,,,
,,,,,,,,,,,,
,,,,,,,,,,,,
,,,,,,,,,,,,
,,,,,,,,,,,,
,,,,,,,,,,,,
,,,,,,,,,,,,
,,,,,,,,,,,,
,,,,,,,,,,,,
,,,,,,,,,,,,
4,,,,,,,,,,,,
```

## Secondary Editing OB/V26.1.0.0/EdifecsProduct_MappingSpec_OB Secondary Editing_837_DFF_to_EDI Conversion_V1.0.xlsx — Prof DFF Layout

```csv
Incoming File Layout,,,,,,,,,,,,
,,,,,,,,,,,,
File Component,Field Name,Field Description,Level,Type,Length,"Fixed Width
files only",,Repricer,Position,Secondary Editing,Position,Comments
,,,,,,From,To,,,,,
Header,STREAM_ID,The value in this field represents a short description of the client’s payer stream name under which multiple payer short files will be provided. Example [XYZ Health Plan of NY] should be represented by “XYZNY”.  This value will be assigned and provided to the client during the implementation phase.,File,Text,5,1,5,1,5,Y,1,
Header,FILE_TYPE,"Valid values:  T or H
This field contains information relating to whether this file is a Daily File (T) or a History file (H).",File,Text,1,6,6,Y,2,Y,2,
Header,FILE_SEQ,"This field contains the sequence number of the file.  This should be a value starting at 1 for the first daily and first history files received.  Subsequent files should be incremented by 1 so that each daily file has a unique FILE_SEQ number and then each history file has a unique FILE_SEQ number.  This sequence number will be used during file processing to confirm that the same file sequence number has not previously been loaded into the database.  It is important to note that the file sequence in the file name only increments for multiple files sent in the same day and will always reset to 1 for each new day.

Note: There is a separate file sequence for initial history files loaded prior to going live.  The sequence for ongoing history files should be reset to start at 1 after completion of the initial history load.",File,Numeric,7,7,13,Y,3,Y,3,
Header,PRODUCED_DATE,This field contains the date the file was generated by the client. Date should be in CCYYMMDD format in all places,File,"Date
YYYYMMDD",8,14,21,Y,4,Y,4,
Header,RECORD_COUNT,This field contains the total number of DETAIL records in the file.,File,Numeric,10,22,31,Y,5,Y,5,
Header,FILE_INDICATOR,"Valid values:  'R' (retro) or 'P' (pre-pay.)
The file indicator identifies whether this file is a Retro (R) or a Pre-Pay (P) file. Use Pre-Pay (P) for prospective TBA claim extracts (claims prior to payment).  Use Retro (R) for retrospective paid claim TBA files.  Use 'R' for all History Extract files.",File,Text,1,32,32,Y,6,Y,6,
Header,FILLER,"For Fixed Width files only. The header record is right-padded with spaces to equal the full length of the claim data records, taking into account the characters included in the client defined field.",File,Text,7220,33,7252,Y,7,Y,7,
,,,,,,,,,,,,
Detail,TAG_VALUE_PREFIX,The value in this field represents the Tag value of the claim which falls on the prefix on each claim split. Record 0001 – Claim 1,Claim,Numeric,4,1,4,Y,1,Y,1,
Detail,TYPE_OF_FILE,This value in the field represent whether the claim is a Institutional or Professional ( INST or PROF),Claim,Text,4,5,8,Y,2,Y,2,
Detail,SUB_ID,"The value in this field represents the member's identification number. In many cases, each member (subscriber and dependents) are issued an ID that is unique in the client’s system. If this ID is not unique, the data in this field combined with the DEPENDENT_NUM will be used to represent a unique member.",Claim,Text,25,9,33,Y,3,Y,3,
Detail,DEPENDENT_NUM,"The value in this field represents the member’s dependent status as it relates to the insured. The value in this field, combined with the SUB_ID provides a unique member identifier.  This field is required for PPM only if needed to create a unique member ID.",Claim,Text,10,34,43,N,4,N,4,
Detail,PATIENT_DOB,"The value in this field represents the patient’s date of birth.  Required for CV. (Subscriber:  2010BA, DMG02)  (Patient:  2010CA, DMG02)",Claim,Date YYYYMMDD,8,44,51,Y,5,Y,5,
Detail,PATIENT_GENDER_ID,"The value in this field represents the patient’s gender.  Recommended values are M for Male, F for Female and U for Unknown.  Please provide mapping if outside of the above values. Required for CV.
(Subscriber:  2010BA, DMG03)  (Patient:  2010CA, DMG03)",Claim,Text,10,52,61,Y,6,Y,6,
Detail,PATIENT_SSN,The value in this field represents the patient’s social security number.,Claim,Text,9,62,70,N,7,N,7,
Detail,SUB_MEDICARE_ID,"This field represents the subscriber's Medicare ID and should include the trailing alpha character.  The patient's Medicare number would be provided in the PATIENT_ID field.  If the subscriber is the patient, the value in both fields would be the same.",Claim,Text,25,71,95,N,8,N,8,
Detail,MEDICAID_ID,This field represents the patient's unique Medicaid ID as assigned by the State in which they are covered.,Claim,Text,25,96,120,N,9,N,9,
Detail,PATIENT_ID,"The value in this field represents an alternate patient identification number, not otherwise specified in the layout.  Required for CV.",Claim,Text,20,121,140,N,10,N,10,
Detail,PATIENT_CONTROL_NUM,"The value in this field represents the Patient Control Number, also referred to as the Patient Account Number. (2300, CLM01, 1028)",Claim,Text,24,141,164,Y,11,Y,11,
Detail,PATIENT_LAST_NAME,"The value in this field represents the patient’s last name.  (2010CA, NM103, 1035)",Claim,Text,60,165,224,Y,12,Y,12,
Detail,PATIENT_FIRST_NAME,"The value in this field represents the patient’s first name.  (2010CA, NM104, 1036)",Claim,Text,35,225,259,Y,13,Y,13,
Detail,PATIENT_MIDDLE_NAME,"This field represents the patient's middle name as defined by the payer. This is required by CMS when needed to identify the individual. (2010CA, NM105, 1037)",Claim,Text,25,260,284,Y,14,Y,14,
Detail,PATIENT_NAME_SUFFIX,"This field represents the suffix associated with the patient's name.  For example, Jr., Sr., III, etc. This is required by CMS when needed to identify the individual.  (2010CA, NM107, 1039)",Claim,Text,10,285,294,Y,15,Y,15,
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
(Subscriber: 2000B, SBR02)  (Dependent:  2000C, PAT01)",Claim,Text,2,295,296,Y,16,Y,16,
Detail,PATIENT_DEATH_DATE,"Patient's date of death when the patient is known to be deceased.  (2000B, PAT06)  2000C, PAT06)",Claim,"Date
YYYYMMDD",8,297,304,N,17,N,17,
Detail,PATIENT_WEIGHT,"This data element is the patient's weight at the time of service.  CMS requires this data when claims involve Medicare DMERC CMN or DME MAC 10.03 Enteral or Parenteral Nutrition.  Weight measurement is in pounds. (2000B, PAT08) (2000C, PAT08)",Claim,Numeric,6,305,310,N,18,N,18,
Detail,CLAIM_ID,"The value in this field represents the client’s claim identification number. This should be a claim ID that is unique in the client’s system. If this ID is not unique, please advise what other data is required to make it unique. Required for CV.",Claim,Text,25,311,335,Y,19,Y,19,
Detail,PREGNANCY_INDICATOR_YN,"This field represents the patient's pregnancy status at the time of service.  Expected values are:  'Y', 'N' or may be left blank to indicate the patient is not pregnant or not required by law. (2000B, PAT09)(2000C, PAT09)",Claim,Text,1,336,336,N,20,N,20,
Detail,MED_REC_NO,"The value in this field represents the Medical Record Number from the provider.  (2300, REF02, REF*EA)",Claim,Text,24,337,360,Y,21,Y,21,
Detail,DIAGNOSIS_CODE_01_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.  (2300, HI01-1) Required for CV.",Claim,Text,1,361,361,N,22,N,22,
Detail,DIAGNOSIS_CODE_01,"The value in this field represents the header level diagnosis listed in the number one position on the CMS-1500 billed by the provider. To provide accurate adjudication recommendations and CV audit results, all diagnosis codes billed by the provider should be transmitted on the file with appropriate pointers. Required for CV.  (2300, HI01-2)

Note:  It is expected that all lines of a claim will include the same header level diagnosis codes.",Claim,Text,7,362,368,Y,23,Y,23,
Detail,DIAGNOSIS_CODE_02_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes. This field is required if the corresponding diagnosis is populated. (2300, HI02-1)",Claim,Text,1,369,369,N,24,N,24,
Detail,DIAGNOSIS_CODE_02,"The value in this field represents the header level diagnosis listed in the number two position on the CMS-1500 billed by the provider. To provide accurate adjudication recommendations and CV audit results, all diagnosis codes billed by the provider should be transmitted on the file with appropriate pointers.  (2300,HI02-2)",Claim,Text,7,370,376,Y,25,Y,25,
Detail,DIAGNOSIS_CODE_03_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes. This field is required if the corresponding diagnosis is populated. (2300, HI03-1)",Claim,Text,1,377,377,N,26,N,26,
Detail,DIAGNOSIS_CODE_03,"The value in this field represents the header level diagnosis listed in the number three position on the CMS-1500 billed by the provider. To provide accurate adjudication recommendations and CV audit results, all diagnosis codes billed by the provider should be transmitted on the file with appropriate pointers.  (2300, HI03-2)",Claim,Text,7,378,384,Y,27,Y,27,
Detail,DIAGNOSIS_CODE_04_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.  This field is required if the corresponding diagnosis is populated.  (2300, HI04-1)",Claim,Text,1,385,385,N,28,N,28,
Detail,DIAGNOSIS_CODE_04,"The value in this field represents the header level diagnosis listed in the number four position on the CMS-1500 billed by the provider. To provide accurate adjudication recommendations and CV audit results, all diagnosis codes billed by the provider should be transmitted on the file with appropriate pointers.  (2300, HI04-2)",Claim,Text,7,386,392,Y,29,Y,29,
Detail,DIAGNOSIS_CODE_05_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.  This field is required if the corresponding diagnosis is populated.  (2300, HI05-1)",Claim,Text,1,393,393,N,30,N,30,
Detail,DIAGNOSIS_CODE_05,"The value in this field represents the header level diagnosis listed in the number five position on the CMS-1500 billed by the provider. To provide accurate adjudication recommendations and CV audit results, all diagnosis codes billed by the provider should be transmitted on the file with appropriate pointers.  (2300, HI05-2)",Claim,Text,7,394,400,Y,31,Y,31,
Detail,DIAGNOSIS_CODE_06_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes. This field is required if the corresponding diagnosis is populated.  (2300, HI06-1, HI*BF or HI*ABF)",Claim,Text,1,401,401,N,32,N,32,
Detail,DIAGNOSIS_CODE_06,"The value in this field represents the header level diagnosis listed in the number six position on the CMS-1500 billed by the provider. To provide accurate adjudication recommendations and CV audit results, all diagnosis codes billed by the provider should be transmitted on the file with appropriate pointers.  (2300, HI06-2)",Claim,Text,7,402,408,Y,33,Y,33,
Detail,DIAGNOSIS_CODE_07_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '0' for ICD-9 diagnosis codes. This field is required if the corresponding diagnosis is populated.  (2300, HI07-1)",Claim,Text,1,409,409,N,34,N,34,
Detail,DIAGNOSIS_CODE_07,"The value in this field represents the header level diagnosis listed in the number seven position on the CMS-1500 billed by the provider. To provide accurate adjudication recommendations and CV audit results, all diagnosis codes billed by the provider should be transmitted on the file with appropriate pointers.  (2300, HI07-2)",Claim,Text,7,410,416,Y,35,Y,35,
Detail,DIAGNOSIS_CODE_08_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes. This field is required if the corresponding diagnosis is populated.  (2300, HI08-1)",Claim,Text,1,417,417,N,36,N,36,
Detail,DIAGNOSIS_CODE_08,"The value in this field represents the header level diagnosis listed in the number eight position on the CMS-1500 billed by the provider. To provide accurate adjudication recommendations and CV audit results, all diagnosis codes billed by the provider should be transmitted on the file with appropriate pointers.  (2300, HI08-2)",Claim,Text,7,418,424,Y,37,Y,37,
Detail,DIAGNOSIS_CODE_09_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes. This field is required if the corresponding diagnosis is populated.  (2300, HI09-1)",Claim,Text,1,425,425,N,38,N,38,
Detail,DIAGNOSIS_CODE_09,"The value in this field represents the header level diagnosis listed in the number nine position on the CMS-1500 billed by the provider. To provide accurate adjudication recommendations and CV audit results, all diagnosis codes billed by the provider should be transmitted on the file with appropriate pointers.  (2300, HI09-2)",Claim,Text,7,426,432,Y,39,Y,39,
Detail,DIAGNOSIS_CODE_10_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes. This field is required if the corresponding diagnosis is populated.  (2300, HI10-1)",Claim,Text,1,433,433,N,40,N,40,
Detail,DIAGNOSIS_CODE_10,"The value in this field represents the header level diagnosis listed in the number ten position on the CMS-1500 billed by the provider. To provide accurate adjudication recommendations and CV audit results, all diagnosis codes billed by the provider should be transmitted on the file with appropriate pointers. (2300, HI10-2)",Claim,Text,7,434,440,Y,41,Y,41,
Detail,DIAGNOSIS_CODE_11_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes. This field is required if the corresponding diagnosis is populated.  (2300, HI11-1)",Claim,Text,1,441,441,N,42,N,42,
Detail,DIAGNOSIS_CODE_11,"The value in this field represents the header level diagnosis listed in the number eleven position on the CMS-1500 billed by the provider. To provide accurate adjudication recommendations and CV audit results, all diagnosis codes billed by the provider should be transmitted on the file with appropriate pointers.  (2300, HI11-2)",Claim,Text,7,442,448,Y,43,Y,43,
Detail,DIAGNOSIS_CODE_12_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes. This field is required if the corresponding diagnosis is populated.  (2300, HI12-1)",Claim,Text,1,449,449,N,44,N,44,
Detail,DIAGNOSIS_CODE_12,"The value in this field represents the header level diagnosis listed in the number twelve position on the CMS-1500 billed by the provider. To provide accurate adjudication recommendations and CV audit results, all diagnosis codes billed by the provider should be transmitted on the file with appropriate pointers.  (2300, HI12-2)",Claim,Text,7,450,456,Y,45,Y,45,
Detail,DIAGNOSIS_CODE_13_QUAL,The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes. This field is required if the corresponding diagnosis is populated.,Claim,Text,1,457,457,N,46,N,46,
Detail,DIAGNOSIS_CODE_13,"The value in this field represents the additional diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  Note: This field is not currently in the 837 transaction, but is planned for the next version.  This diagnosis will be used in applying payment policies in the future.",Claim,Text,7,458,464,Y,47,Y,47,
Detail,DIAGNOSIS_CODE_14_QUAL,The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.  This field is required if the corresponding diagnosis is populated.,Claim,Text,1,465,465,N,48,N,48,
Detail,DIAGNOSIS_CODE_14,"The value in this field represents the additional diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values. Note: This field is not currently in the 837 transaction, but is planned for the next version.  This diagnosis will be used in applying payment policies in the future.",Claim,Text,7,466,472,N,49,N,49,
Detail,DIAGNOSIS_CODE_15_QUAL,The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes. This field is required if the corresponding diagnosis is populated.,Claim,Text,1,473,473,N,50,N,50,
Detail,DIAGNOSIS_CODE_15,"The value in this field represents the additional diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values. Note: This field is not currently in the 837 transaction, but is planned for the next version.   This diagnosis will be used in applying payment policies in the future.",Claim,Text,7,474,480,N,51,N,51,
Detail,DIAGNOSIS_CODE_16_QUAL,The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes. This field is required if the corresponding diagnosis is populated.,Claim,Text,1,481,481,N,52,N,52,
Detail,DIAGNOSIS_CODE_16,"The value in this field represents the additional diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values. Note: This field is not currently in the 837 transaction, but is planned for the next version.  This diagnosis will be used in applying payment policies in the future.",Claim,Text,7,482,488,N,53,N,53,
Detail,DIAGNOSIS_CODE_17_QUAL,The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes. This field is required if the corresponding diagnosis is populated.,Claim,Text,1,489,489,N,54,N,54,
Detail,DIAGNOSIS_CODE_17,"The value in this field represents the additional diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  Note: This field is not currently in the 837 transaction, but is planned for the next version.  This diagnosis will be used in applying payment policies in the future.",Claim,Text,7,490,496,N,55,N,55,
Detail,DIAGNOSIS_CODE_18_QUAL,The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes. This field is required if the corresponding diagnosis is populated.,Claim,Text,1,497,497,N,56,N,56,
Detail,DIAGNOSIS_CODE_18,"The value in this field represents the additional diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values. Note: This field is not currently in the 837 transaction, but is planned for the next version.  This diagnosis will be used in applying payment policies in the future.",Claim,Text,7,498,504,N,57,N,57,
Detail,DIAGNOSIS_CODE_19_QUAL,The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes. This field is required if the corresponding diagnosis is populated.,Claim,Text,1,505,505,N,58,N,58,
Detail,DIAGNOSIS_CODE_19,"The value in this field represents the additional diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values. Note: This field is not currently in the 837 transaction, but is planned for the next version.  This diagnosis will be used in applying payment policies in the future.",Claim,Text,7,506,512,N,59,N,59,
Detail,DIAGNOSIS_CODE_20_QUAL,The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes. This field is required if the corresponding diagnosis is populated.,Claim,Text,1,513,513,N,60,N,60,
Detail,DIAGNOSIS_CODE_20,"The value in this field represents the additional diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  Note: This field is not currently in the 837 transaction, but is planned for the next version.  This diagnosis will be used in applying payment policies in the future.",Claim,Text,7,514,520,N,61,N,61,
Detail,DIAGNOSIS_CODE_21_QUAL,The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes. This field is required if the corresponding diagnosis is populated.,Claim,Text,1,521,521,N,62,N,62,
Detail,DIAGNOSIS_CODE_21,"The value in this field represents the additional diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values. Note: This field is not currently in the 837 transaction, but is planned for the next version.  This diagnosis will be used in applying payment policies in the future.",Claim,Text,7,522,528,N,63,N,63,
Detail,DIAGNOSIS_CODE_22_QUAL,The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes. This field is required if the corresponding diagnosis is populated.,Claim,Text,1,529,529,N,64,N,64,
Detail,DIAGNOSIS_CODE_22,"The value in this field represents the additional diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  Note: This field is not currently in the 837 transaction, but is planned for the next version.  This diagnosis will be used in applying payment policies in the future.",Claim,Text,7,530,536,N,65,N,65,
Detail,DIAGNOSIS_CODE_23_QUAL,The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes. This field is required if the corresponding diagnosis is populated.,Claim,Text,1,537,537,N,66,N,66,
Detail,DIAGNOSIS_CODE_23,"The value in this field represents the additional diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  Note: This field is not currently in the 837 transaction, but is planned for the next version.  This diagnosis will be used in applying payment policies in the future.  (2300, HI*BF or HI*ABF Segment Repeat)",Claim,Text,7,538,544,N,67,N,67,
Detail,DIAGNOSIS_CODE_24_QUAL,The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes. This field is required if the corresponding diagnosis is populated.,Claim,Text,1,545,545,N,68,N,68,
Detail,DIAGNOSIS_CODE_24,"The value in this field represents the additional diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values. Note: This field is not currently in the 837 transaction, but is planned for the next version.  If  this value is present, it will be used in applying payment policies.",Claim,Text,7,546,552,N,69,N,69,
Detail,INSURANCE_LOB,"The value in this field represents the member’s product type or line of business code. The client’s values are mapped to a table that identifies line of business. Examples are: Medicare, Medicaid, Commercial, Duals, BlueCard, etc. Required for CV.",Line,Text,15,553,567,N,70,N,70,
Detail,INSURANCE_LOB_SUBTYPE,"This field further splits the LOB into the type of plan. Examples are: HMO, PPO, POS, EPO, etc.",Line,Text,15,568,582,N,71,N,71,
Detail,BLUE_CARD_INDICATOR,"When INSURANCE_LOB is BlueCard, this field represents BlueCard information provided by the client. Valid values are:
0  -  Non-BlueCard
1  -  ITS Home
2  -  ITS Host",Claim,Text,1,583,583,N,72,N,72,
Detail,ITS_HOME_STATE,The value in this field represents the state of the plan that owns the member's coverage.,Claim,Text,2,584,585,N,73,N,73,
Detail,ITS_HOST_STATE,The value in this field represents the state of the provider's local Blue Cross Blue Shield plan where services were rendered.,Claim,Text,2,586,587,N,74,N,74,
Detail,ITS_SERIAL_NUM,The value in this field represents the Standard Claims Collection Facility (SCCF) number from the ITS system.  This is the unique identifier in the BlueSquared BlueCard claim processing system.,Claim,Text,20,588,607,N,75,N,75,
Detail,MEDICARE_PROVIDER_ID,"Number that uniquely identifies a healthcare provider and is used on billing forms submitted to Medicare (UPIN, OSCAR number, NSC number). It is used for pricing through FHCP.",Line,Text,80,608,687,N,76,N,76,
Detail,MEDICAID_PROVIDER_ID,A number that uniquely identifies a healthcare provider and is used on billing forms submitted to Medicaid.,Line,Text,80,688,767,N,77,N,77,
Detail,RENDERING_PROVIDER_ID,"The value in this field represents a single physician identification number that is unique to the physician in the client’s system for the rendering provider. If a physician has more than one identifying number, there could be an impact to adjudication recommendations which should be discussed.  (2310B, NM109 or 2420A, NM109)  Previously PROVIDER_ID and the provider identifier used for processing on professional claims. Required for CV.",Line,Text,25,768,792,N,78,N,78,
Detail,RENDERING_TAXGROUP_ID,"The value in this field represents the rendering provider's tax identification number.   (2310B, REF02)  BILLING_TAXGROUP_ID is used for processing for all providers.  If Rendering is the same as Billing, it should be duplicated here. Required for CV.",Line,Text,9,793,801,N,79,N,79,
Detail,RENDERING_NPI,"The value in this field represents the CMS National Provider Identifier (NPI) for the provider rendering this service.  Default to spaces if value is not available.  (2310B, NM109)  Previously NPI and the identifier of record for professional providers. Required for CV.",Line,Numeric,10,802,811,Y,80,Y,80,
Detail,RENDERING_STATE_LICENSE,"The value in this field represents the Sate License number for the rendering provider.  A non-zero value is required.  (2310B, REF02)",Line,Text,10,812,821,N,81,N,81,
Detail,RENDERING_SPECIALTY_CODE,"The value in this field is a code that represents the rendering physician’s specialty or subspecialty.  As an example: ORTH or 0015 for orthopedics, PEDCAR or 0030 for pediatric cardiology, etc. In order to make appropriate adjudication recommendations on the claim, the rendering provider’s specialty must be identified. Blank values in this field can be mapped to a “miscellaneous” specialty which will limit payment policies that will be applied, if this method is chosen by the client.  Unrecognizable (unmapped) values will result in the “failing” of the claim during processing and will be reported on the daily processing report.  Client preferences will be discussed during the implementation process.  Please provide a list of client values with descriptions. (2310B, PRV03)  Previously SUBSPEC_ID and used for processing on professional claims. Required for CV.",Line,Text,10,822,831,N,82,N,82,
Detail,RENDERING_TAXONOMY_CODE,Industry standard taxonomy code of the rendering provider used by CMS and sourced by the National Uniform Claim Committee. A list of taxonomy codes is available via http://www.wpc-edi.com/reference/codelists/healthcare/health-care-provider-taxonomy-code-set/.  Required for CV.,Line,Text,50,832,881,Y,83,Y,83,
Detail,RENDERING_ENTITY_TYPE,"Expected Values are:  'P' = Person or 'E' = Other Entity or Facility. (2310B,  NM101)",Line,Text,1,882,882,N,84,N,84,
Detail,RENDERING_LAST_NAME,"The value in this field represents the rendering provider’s last name if rendering entity type = 'P' or Organizational Name if rendering entity type = 'E'.  Required for CV. (2310B, NM103)",Line,Text,60,883,942,Y,85,Y,85,
Detail,RENDERING_FIRST_NAME,"The value in this field represents the rendering provider’s first name.  Required for CV. (2310B, NM104)",Line,Text,35,943,977,Y,86,Y,86,
Detail,RENDERING_MIDDLE_NAME,"The value in this field represents the rendering provider’s middle name.  (2310B, NM105)",Line,Text,25,978,1002,Y,87,Y,87,
Detail,RENDERING_NAME_SUFFIX,"The value in this field represents the rendering provider's suffix, as required.  (2310B, NM107)",Line,Text,10,1003,1012,Y,88,Y,88,
Detail,RENDERING_ADDRESS_01,The value in this field represents the first line of the rendering provider's address.,Line,Text,55,1013,1067,N,89,N,89,
Detail,RENDERING_ADDRESS_02,The value in this field represents the second line of the rendering provider's address.,Line,Text,55,1068,1122,N,90,N,90,
Detail,RENDERING_CITY,The value in this field represents the city of the rendering provider's address.,Line,Text,30,1123,1152,N,91,N,91,
Detail,RENDERING_STATE,The value in this field represents the state of the rendering provider's address.   Required for CV.,Line,Text,2,1153,1154,N,92,N,92,
Detail,RENDERING_ZIP,The value in this field represents the postal ZIP code for the rendering provider.  The value is the basic five digit ZIP code.  This value must be submitted for Geographic Policy application. Required for CV.,Line,Text,5,1155,1159,N,93,N,93,
Detail,RENDERING_ZIP_PLUS_FOUR,The value in this field represents the four digit add-on code for the expanded ZIP code.  The value is four digits.,Line,Text,4,1160,1163,N,94,N,94,
Detail,RENDERING_COUNTRY,The value in this field represents the country of the rendering provider's address.,Line,Text,3,1164,1166,N,95,N,95,
Detail,RENDERING_COUNTRY_SUBDIVISION,The value in this field represents the country subdivision code for the rendering provider's address.  This is only used for international addresses.,Line,Text,3,1167,1169,N,96,N,96,
Detail,RENDERING_PHONE_COUNTRY_CODE,This field represents the unique country code for international dialing for the rendering provider's primary phone number.,Line,Text,5,1170,1174,N,97,N,97,
Detail,RENDERING_PHONE,The value in this field represents the rendering provider's telephone number.,Line,Text,10,1175,1184,N,98,N,98,
Detail,RENDERING_PHONE_EXT,The value in this field represents the rendering provider's primary telephone extension.,Line,Text,6,1185,1190,N,99,N,99,
Detail,RENDERING_ALT_PHONE_COUNTRY_CODE,This field represents the unique country code for international dialing for the rendering provider's alternate phone number.,Line,Text,5,1191,1195,N,100,N,100,
Detail,RENDERING_ALT_PHONE,The value in this field represents the rendering provider's alternate telephone number.,Line,Text,10,1196,1205,N,101,N,101,
Detail,RENDERING_ALT_PHONE_EXT,The value in this field represents the rendering provider's alternate telephone extension.,Line,Text,6,1206,1211,N,102,N,102,
Detail,RENDERING_FAX_COUNTRY_CODE,This field represents the unique country code for international dialing for the rendering provider's fax number.,Line,Text,5,1212,1216,N,103,N,103,
Detail,RENDERING_FAX,The value in this field represents the rendering provider's fax number.,Line,Text,10,1217,1226,N,104,N,104,
Detail,BILLING_PROVIDER_ID,"The value in this field represents the billing provider, which is separate from where the services were rendered.  This number is the identification number unique to the billing provider or facility in the client’s system.  This is the same as the Billing Provider Commercial Number in the 837 transaction.  (2010AA, REF02)",Line,Text,25,1227,1251,N,105,N,105,
Detail,BILLING_TAXGROUP_ID,"The value in this field represents the billing provider’s tax identification number. This number should represent the individual or group practice.  (2010AA, REF02, REF*EI)    Previously TAXGROUP_ID and used for processing on professional claims.",Line,Text,9,1252,1260,Y,106,Y,106,
Detail,BILLING_NPI,"The value in this field represents the CMS National Provider Identifier (NPI) for the billing provider providing this service.  Default to spaces if value is not available. (2010AA, NM109)",Line,Numeric,10,1261,1270,Y,107,Y,107,
Detail,BILLING_STATE_LICENSE,"The value in this field represents the Sate License number for the billing provider associated with this service.  A non-zero value is required.  This is the same as the Billing Provider Secondary Identifier in the 837 transaction.   (2010AA, REF02)",Line,Text,10,1271,1280,Y,108,Y,108,
Detail,BILLING_SPECIALTY_CODE,"The value in this field represents the specialty of the billing provider, as defined in the client's claim system.",Line,Text,10,1281,1290,N,109,N,109,
Detail,BILLING_TAXONOMY_CODE,Industry standard taxonomy code of the billing provider used by CMS and sourced by the National Uniform Claim Committee. A list of taxonomy codes is available via http://www.wpc-edi.com/reference/codelists/healthcare/health-care-provider-taxonomy-code-set/.,Line,Text,50,1291,1340,N,110,N,110,
Detail,BILLING_CURRENCY_CODE,"This field represents the ISO currency code for the billing provider and should correlate with the currency of the funds in which the provider is to be paid.  (2000A, CUR02)",Line,Text,3,1341,1343,N,111,N,111,
Detail,BILLING_ENTITY_TYPE,Expected Values are:  'P' = Person or 'E' = Other Entity or Facility,Line,Text,1,1344,1344,N,112,Y,112,
Detail,BILLING_LAST_NAME,"The value in this field represents the billing provider’s last name if rendering entity type = 'P' or Organizational Name if rendering entity type = 'E'.  (2010AA, NM103)",Line,Text,255,1345,1599,Y,113,Y,113,
Detail,BILLING_FIRST_NAME,"The value in this field represents the billing provider’s first name.  (2310B, NM104)",Line,Text,35,1600,1634,Y,114,Y,114,
Detail,BILLING_MIDDLE_NAME,"The value in this field represents the billing provider’s middle name.  (2310B, NM105)",Line,Text,25,1635,1659,Y,115,Y,115,
Detail,BILLING_NAME_SUFFIX,"The value in this field represents the billing provider's suffix, as required.  (2310B, NM107)",Line,Text,10,1660,1669,Y,116,Y,116,
Detail,BILLING_ADDRESS_01,"The value in this field represents the first line of the billing entity's address. The Billing Provider Address must be a street address. Post Office Box or Lock Box addresses are to be sent in the Pay-To Address Loop (Loop ID-2010AB), if necessary.  (2010AA, N301)",Line,Text,255,1670,1924,Y,117,Y,117,
Detail,BILLING_ADDRESS_02,"The value in this field represents the second line of the billing entity's address.  (2010AA, N302)",Line,Text,255,1925,2179,Y,118,Y,118,
Detail,BILLING_CITY,"The value in this field represents the city of the billing entity's address.  (2010AA, N401)",Line,Text,50,2180,2229,Y,119,Y,119,
Detail,BILLING_STATE,"The value in this field represents the state of the billing entity's address.  (2010AA, N402)",Line,Text,2,2230,2231,Y,120,Y,120,
Detail,BILLING_ZIP,"The value in this field represents the postal ZIP code for the billing entity.  The value is the basic five digit ZIP code.   (2010AA, N403)",Line,Text,5,2232,2236,Y,121,Y,121,
Detail,BILLING_ZIP_PLUS_FOUR,"The value in this field represents the four digit add-on code for the expanded ZIP code.  The value is four digits.   (2010AA, N403)",Line,Text,4,2237,2240,Y,122,Y,122,
Detail,BILLING_COUNTRY,"The value in this field represents the country of the billing entity's  address.  (2010AA, N404)",Line,Text,3,2241,2243,Y,123,Y,123,
Detail,BILLING_COUNTRY_SUBDIVISION,"The value in this field represents the country subdivision code for the billing entity's address.  This is only used for international addresses.(2010AA, N407)",Line,Text,3,2244,2246,N,124,N,124,
Detail,BILLING_CONTACT_NAME,"Billing Provider Contact Name (23010AA, PER02)",Line,Text,60,2247,2306,N,125,N,125,
Detail,BILLING_PHONE_COUNTRY_CODE,"This field represents the unique country code for international dialing for the billing entity's primary phone number.  (2010AA, PER segment)",Line,Text,5,2307,2311,Y,126,Y,126,
Detail,BILLING_PHONE + AREA_CODE,"The value in this field represents the billing entity's telephone number.  (2010AA, PER segment) along with the area code.",Line,Text,10,2312,2321,Y,127,Y,127,
Detail,BILLING_PHONE_EXT,"The value in this field represents the billing entity's primary telephone extension. (2010AA, PER segment)",Line,Text,6,2322,2327,Y,128,Y,128,
Detail,BILLING_ALT_PHONE_COUNTRY_CODE,"This field represents the unique country code for international dialing for the billing entity's alternate phone number. (2010AA, PER segment)",Line,Text,5,2328,2332,N,129,N,129,
Detail,BILLING_ALT_PHONE,"The value in this field represents the billing entity's alternate telephone number. (2010AA, PER segment)",Line,Text,10,2333,2342,N,130,N,130,
Detail,BILLING_ALT_PHONE_EXT,"The value in this field represents the billing entity's alternate telephone extension.  (2010AA, PER segment)",Line,Text,6,2343,2348,N,131,N,131,
Detail,BILLING_FAX_COUNTRY_CODE,"This field represents the unique country code for international dialing for the billing entity's fax number. (2010AA, PER segment)",Line,Text,5,2349,2353,Y,132,N,132,
Detail,BILLING_FAX,"The value in this field represents the billing entity's fax number. (2010AA, PER segment)",Line,Text,10,2354,2363,Y,133,Y,133,
Detail,CLIENT_CONTRACT_ID,"The value in this field represents a contract identification number for the provider, if needed for adjudication purposes.",Line,Text,25,2364,2388,N,134,N,134,
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
(2300, CN101)",Line,Text,2,2389,2390,N,135,N,135,
Detail,CONTRACT_AMOUNT,"Contract Amount for the claim being submitted. (2300, CN102)",Line,Numeric 9(8)V99,10,2391,2400,N,136,N,136,
Detail,CONTRACT_PCT,"Contract Percentage for the claim being submitted. (2300, CN103)",Line,"Numeric
9(5)V99999",10,2401,2410,N,137,N,137,
Detail,CONTRACT_CODE,"Contract Code for the claim being submitted. (2300, CN104)",Line,Text,50,2411,2460,N,138,N,138,
Detail,CONTRACT_TERMS_DISC_PCT,"This field represents the terms discount percentage for the claim being submitted. (2300, CN105)",Line,"Numeric
9(5)V99999",10,2461,2470,N,139,N,139,
Detail,CONTRACT_VERSION_ID,"This field represents the contract version identifier for the claim being submitted. (2300, CN106)",Line,Text,30,2471,2500,N,140,N,140,
Detail,LINE_SEQ,"The value in this field represents the sequential number associated to the line number on the claim. As an example: the number 0002 should be sent in this field for the second line on the claim. Required for CV.  (2400, LX01)",Line,Numeric,4,2501,2504,Y,141,Y,141,
Detail,LINE_BEGIN_DOS,"The value in this field represents the beginning date for services rendered. Required for CV. (2400, DTP03)",Line,"Date
YYYYMMDD",8,2505,2512,Y,142,Y,142,
Detail,LINE_END_DOS,"The value in this field represents the date in the Date of Service To field on the CMS-1500.  In order to make appropriate adjudication recommendations, date ranges need to be transmitted. The lack of date ranges could cause inappropriate recommendations. As an example: a provider bills a date range for two days and a procedure with two units of service corresponding to the date range. If the Date of Service From is the only date passed, one unit could be denied as exceeding the number of units allowed on a single date of service. Required for CV. (2400, DTP03)",Line,"Date
YYYYMMDD",8,2513,2520,Y,143,Y,143,
Detail,PLACE_OF_SERVICE,"The value in this field represents the industry standard place of service code where the service was rendered. If the client uses non-industry standard place of service codes, please provide a list of the values and their descriptions for mapping purposes.  (2300, CLM05-1 or  2400, SV1-05)",Line,Text,2,2521,2522,Y,144,Y,144,
Detail,TOS,"The value in this field represents the industry standard Type of Service code for the service that was rendered. Required for CV.  (2400, SV106)",Line,Text,1,2523,2523,N,145,N,145,
Detail,DIAGNOSIS_POINTER_01,"The value in this field represents the diagnosis pointer that correlates the line service to one of the twelve header level diagnosis codes.  Required for CV. (2400, SV107-1)",Line,Numeric,2,2524,2525,Y,146,Y,146,
Detail,DIAGNOSIS_POINTER_02,"The value in this field represents the diagnosis pointer that correlates the line service to one of the twelve header level diagnosis codes.  (2400, SV107-2)",Line,Numeric,2,2526,2527,Y,147,Y,147,
Detail,DIAGNOSIS_POINTER_03,"The value in this field represents the diagnosis pointer that correlates the line service to one of the twelve header level diagnosis codes.  (2400, SV107-3)",Line,Numeric,2,2528,2529,Y,148,Y,148,
Detail,DIAGNOSIS_POINTER_04,"The value in this field represents the diagnosis pointer that correlates the line service to one of the twelve header level diagnosis codes.  (2400, SV107-4)",Line,Numeric,2,2530,2531,Y,149,Y,149,
Detail,DIAGNOSIS_POINTER_05,The value in this field represents the diagnosis pointer that correlates the line service to one of the twelve header level diagnosis codes.   Note: For future use only.  Slated for upcoming version of X12 837.,Line,Numeric,2,2532,2533,N,150,N,150,
Detail,DIAGNOSIS_POINTER_06,The value in this field represents the diagnosis pointer that correlates the line service to one of the twelve header level diagnosis codes.   Note: For future use only.  Slated for upcoming version of X12 837.,Line,Numeric,2,2534,2535,N,151,N,151,
Detail,DIAGNOSIS_POINTER_07,The value in this field represents the diagnosis pointer that correlates the line service to one of the twelve header level diagnosis codes.   Note: For future use only.  Slated for upcoming version of X12 837.,Line,Numeric,2,2536,2537,N,152,N,152,
Detail,DIAGNOSIS_POINTER_08,The value in this field represents the diagnosis pointer that correlates the line service to one of the twelve header level diagnosis codes.   Note: For future use only.  Slated for upcoming version of X12 837.,Line,Numeric,2,2538,2539,N,153,N,153,
Detail,DIAGNOSIS_POINTER_09,The value in this field represents the diagnosis pointer that correlates the line service to one of the twelve header level diagnosis codes.   Note: For future use only.  Slated for upcoming version of X12 837.,Line,Numeric,2,2540,2541,N,154,N,154,
Detail,DIAGNOSIS_POINTER_10,The value in this field represents the diagnosis pointer that correlates the line service to one of the twelve header level diagnosis codes.   Note: For future use only.  Slated for upcoming version of X12 837.,Line,Numeric,2,2542,2543,N,155,N,155,
Detail,DIAGNOSIS_POINTER_11,The value in this field represents the diagnosis pointer that correlates the line service to one of the twelve header level diagnosis codes.   Note: For future use only.  Slated for upcoming version of X12 837.,Line,Numeric,2,2544,2545,N,156,N,156,
Detail,DIAGNOSIS_POINTER_12,The value in this field represents the diagnosis pointer that correlates the line service to one of the twelve header level diagnosis codes.   Note: For future use only.  Slated for upcoming version of X12 837.,Line,Numeric,2,2546,2547,N,157,N,157,
Detail,SUB_HCPCS,"The value in this field represents the Level1 (CPT) or Level2 (HCPCS) code billed by the provider for this service. (2400, SV101-2)",Line,Text,5,2548,2552,Y,158,Y,158,
Detail,SUB_MOD_01,"The value in this field represents the first procedure code modifier billed by the provider for this service. (2400, SV101-3)",Line,Text,2,2553,2554,Y,159,Y,159,
Detail,SUB_MOD_02,"The value in this field represents the second procedure code modifier billed by the provider for this service. (2400, SV101-4)",Line,Text,2,2555,2556,Y,160,Y,160,
Detail,SUB_MOD_03,"The value in this field represents the third procedure code modifier billed by the provider for this service. (2400, SV101-5)",Line,Text,2,2557,2558,Y,161,Y,161,
Detail,SUB_MOD_04,"The value in this field represents the fourth procedure code modifier billed by the provider for this service. (2400, SV101-6)",Line,Text,2,2559,2560,Y,162,Y,162,
Detail,SUB_MOD_05,The value in this field represents the fifth procedure code modifier billed by the provider for this service line.  Note: For future use only.  Slated for upcoming version of X12 837.,Line,Text,2,2561,2562,N,163,N,163,
Detail,SUB_MOD_06,The value in this field represents the sixth procedure code modifier billed by the provider for this service line.  Note: For future use only.  Slated for upcoming version of X12 837.,Line,Text,2,2563,2564,N,164,N,164,
Detail,SUB_MOD_07,The value in this field represents the seventh procedure code modifier billed by the provider for this service line.  Note: For future use only.  Slated for upcoming version of X12 837.,Line,Text,2,2565,2566,N,165,N,165,
Detail,SUB_MOD_08,The value in this field represents the eighth procedure code modifier billed by the provider for this service line.  Note: For future use only.  Slated for upcoming version of X12 837.,Line,Text,2,2567,2568,N,166,N,166,
Detail,UNITS_TYPE,"The value in this field represents the basis for measurement for the units billed.  unique Values are:  'MJ' for minutes, and 'UN' for units and blank. (2400, SV1)",Line,Text,2,2569,2570,Y,167,Y,167,
Detail,SUB_UNITS,"The value in this field represents the number of units billed by the provider for this service. (2400, SV104)",Line,Numeric 9(10)V999,13,2571,2583,Y,168,Y,168,
Detail,SUB_AMOUNT,"The value in this field represents the charge amount billed by the provider for this service. Required for CV. (2400, SV102)",Line,Numeric 9(8)V99,10,2584,2593,Y,169,Y,169,
Detail,SUB_NONCOVERED_AMOUNT,"The value in this field represents the line level Non Covered Charges amount billed by the provider for this service.   (2400, SV207)",Line,Numeric 9(8)V99,10,2594,2603,N,170,N,170,
Detail,SUB_NDC,"The value in this field represents the National Drug Code (NDC) submitted on the claim line.  (2410, LIN03)",Line,Text,11,2604,2614,Y,171,Y,171,
Detail,SUB_NDC_UNITS,"This field represents the numeric value of quantity for the drug being billed.  (2410, CTP04)",Line,Numeric 9(10)V999,13,2615,2627,Y,172,Y,172,
Detail,SUB_NDC_UNITS_TYPE,"Code specifying the units in which a value is being expressed, or
manner in which a measurement has been taken.  Expected values are:
IU  -  International Unit
GR  -  Gram
ME  -  Milligram
ML  -  Milliliter
UN  -  Unit
(2410, CTP05)",Line,Text,2,2628,2629,Y,173,Y,173,
Detail,ALLOWED_HCPCS,The value in this field represents the Level1 (CPT) or Level2 (HCPCS) code allowed by the client for claim system adjudication. Required for CV.,Line,Text,5,2630,2634,N,174,N,174,
Detail,ALLOWED_MOD_01,The value in this field represents the first procedure code modifier allowed by the client for claim system adjudication.,Line,Text,2,2635,2636,N,175,N,175,
Detail,ALLOWED_MOD_02,The value in this field represents the second procedure code modifier allowed by the client for claim system adjudication.,Line,Text,2,2637,2638,N,176,N,176,
Detail,ALLOWED_MOD_03,The value in this field represents the third procedure code modifier allowed by the client for claim system adjudication.,Line,Text,2,2639,2640,N,177,N,177,
Detail,ALLOWED_MOD_04,The value in this field represents the fourth procedure code modifier allowed by the client for claim system adjudication.,Line,Text,2,2641,2642,N,178,N,178,
Detail,ALLOWED_MOD_05,"The value in this field represents the fifth procedure code modifier allowed by the client for claim system adjudication. Note: This field is not currently in the 837 transaction, but is planned for the next version.  If you currently store this value in your claim system, please send.",Line,Text,2,2643,2644,N,179,N,179,
Detail,ALLOWED_MOD_06,"The value in this field represents the sixth procedure code modifier allowed by the client for claim system adjudication. Note: This field is not currently in the 837 transaction, but is planned for the next version.  If you currently store this value in your claim system, please send.",Line,Text,2,2645,2646,N,180,N,180,
Detail,ALLOWED_MOD_07,"The value in this field represents the seventh procedure code modifier allowed by the client for claim system adjudication. Note: This field is not currently in the 837 transaction, but is planned for the next version.  If you currently store this value in your claim system, please send.",Line,Text,2,2647,2648,N,181,N,181,
Detail,ALLOWED_MOD_08,"The value in this field represents the eighth procedure code modifier allowed by the client for claim system adjudication. Note: This field is not currently in the 837 transaction, but is planned for the next version.  If you currently store this value in your claim system, please send.",Line,Text,2,2649,2650,N,182,N,182,
Detail,ALLOWED_UNITS,The value in this field represents the number of units  allowed by the client for claim system adjudication.,Line,"Numeric
9(10)V999",13,2651,2663,N,183,Y,183,Zelis and Claritev
Detail,ALLOWED_AMOUNT,"The value in this field represents the allowed amount (before applying co-pay, coinsurance, deductible, COB, and other reductions) for this service. Required for CV.",Line,Numeric 9(8)V99,10,2664,2673,N,184,Y,184,Zelis and Claritev
Detail,COMPOUND_DRUG_YN,Compound drug indicator.  This field should be set to 'Y' if the prescribed drug is a compound drug.,Line,Text,1,2674,2674,N,185,N,185,
Detail,ALLOWED_NDC,The value in this field represents the National Drug Code (NDC) allowed after initial adjudication on the claim line. Required when SUB_NDC is submitted.,Line,Text,11,2675,2685,N,186,N,186,
Detail,ALLOWED_NDC_UNITS,This field represents the numeric value of quantity for the drug allowed after initial adjudication in the client's claim system.  Required when SUB_NDC is submitted.,Line,Numeric 9(10)V999,13,2686,2698,N,187,N,187,
Detail,ALLOWED_NDC_UNITS_TYPE,"This field represents the units type allowed in the client's claim system after initial adjudication.  Required when SUB_NDC is submitted. Expected values are:
IU  -  International Unit
GR  -  Gram
ME  -  Milligram
ML  -  Milliliter
UN  -  Unit",Line,Text,2,2699,2700,N,188,N,188,
Detail,COPAY_AMOUNT,The value in this field represents the member's co-pay amount for this service.,Line,Numeric 9(8)V99,10,2701,2710,N,189,Y,189,Zelis
Detail,COINSURANCE_AMOUNT,The value in this field represents the member's coinsurance amount for this service.,Line,Numeric 9(8)V99,10,2711,2720,N,190,Y,190,Zelis
Detail,DEDUCTIBLE_AMOUNT,The value in this field represents the member's deductible amount for this service.,Line,Numeric 9(8)V99,10,2721,2730,N,191,Y,191,Zelis
Detail,COB,The value in this field represents the member's COB amount for this service.,Line,Numeric 9(8)V99,10,2731,2740,N,192,N,192,
Detail,COB_AMOUNT,The amount paid by the member's other insurance third parties on the claim line item level or the total amount saved on the claim line item because of payment made by the patient's other insurance carrier.,Line,Numeric 9(8)V99,10,2741,2750,N,193,N,193,
Detail,COB_COINSURANCE_AMOUNT,The value in this field represents the calculated amount paid by the insured based on a percentage of total cost.,Line,Numeric 9(8)V99,10,2751,2760,N,194,N,194,
Detail,COB_DEDUCTIBLE_AMOUNT,The value in this field represents the dollar amount the subscriber is liable for before other insurance pays for this service line item.,Line,Numeric 9(8)V99,10,2761,2770,N,195,N,195,
Detail,COB_PAID_AMOUNT,The value in this field represents the other insurance payment amount applied to the service line item.,Line,Numeric 9(8)V99,10,2771,2780,N,196,N,196,
Detail,COB_ALLOWED_AMOUNT,The value in this field represents the dollar allowance for a procedure or service paid by other insurance for a service line item.,Line,Numeric 9(8)V99,10,2781,2790,N,197,N,197,
Detail,OTHER_REDUCTION_AMOUNT,"The value in this field represents any other adjustment amounts not reflected above.  Examples of values that may be used in this field are provider withhold amounts or capitation adjustments.  If no further reductions are taken, field should default to zero.",Line,Numeric 9(8)V99,10,2791,2800,N,198,N,198,
Detail,PAID_AMOUNT,"The value in this field represents the paid amount (after applying co-pay, coinsurance, deductible, COB, and other reductions) for this service. Required for CV.",Line,Numeric 9(8)V99,10,2801,2810,N,199,N,199,
Detail,PAID_DATE,"The value in this field represents the date of final adjudication or payment on preliminary analysis files or on history files.  The field can be blank for daily files since they have not been finalized, however, it should be populated from the client's system for history.  When blank, the file run date is populated for internal use.",Line,"Date
YYYYMMDD",8,2811,2818,N,200,N,200,
Detail,PAID_UNITS,The value in this field represents the number of units of service paid for each detail line.  Required for CV.,Line,Numeric 9(10)V999,13,2819,2831,N,201,N,201,
Detail,LINE_CAPITATION_INDICATOR,"Indicates if the claim line was paid under a capitation agreement. Valid values are:
0  -  Non-Capitated Provider
1  -  Capitated Provider",Line,Text,1,2832,2832,N,202,N,202,
Detail,FEE_SERVICE_AMOUNT,"This field represents the fee schedule amount for the line level service, based on the provider's contract.  The appropriate value should be submitted if defined.  If no contractual agreement exists, this field should be left blank.",Line,Numeric 9(8)V99,10,2833,2842,N,203,N,203,
Detail,PATIENT_LIABILITY_AMOUNT,This field stores the amount the patient owes on the line level service.,Line,Numeric 9(8)V99,10,2843,2852,N,204,N,204,
Detail,DISALLOWED_AMOUNT,"Amount that is disallowed and will not be considered in the payment by the client, non billable to the member for the service line item.",Line,Numeric 9(8)V99,10,2853,2862,N,205,N,205,
Detail,LINE_REIMBURSEMENT_TYPE,This field represents the pricing methodology used to reimburse the service line.,Line,Text,20,2863,2882,N,206,N,206,
Detail,ASSIGNMENT_OF_BENEFITS,"This field represents a one digit indicator to recognize if the benefits were assigned (Y or N).   (2300, CLM08)",Claim,Text,1,2883,2883,Y,207,Y,207,
Detail,CLAIM_BILLED_AMOUNT,"The value in this field represents the claim header level billed amount billed by the provider for the claim. (2300, CLM02)",Claim,Numeric 9(8)V99,10,2884,2893,Y,208,Y,208,
Detail,CLAIM_NONCOVERED_AMOUNT,The value in this field represents the claim header level non covered amount billed by the provider for the claim.,Claim,Numeric 9(8)V99,10,2894,2903,N,209,Y,209,Zelis
Detail,CLAIM_ALLOWED_AMOUNT,"The value in this field represents the claim header level amount that was allowed.  (2320, AMT02)",Claim,Numeric 9(8)V99,10,2904,2913,N,210,N,210,
Detail,CLAIM_PAID_AMOUNT,The value in this field represents the claim header level amount paid by the client for the claim.,Claim,Numeric 9(8)V99,10,2914,2923,N,211,N,211,
Detail,CLAIM_COINSURANCE_AMOUNT,The value in this field represents the total coinsurance dollar amount on a claim for which the subscriber/member is responsible  -  usually based on a fixed percentage specified in the health plan. Usually applies after reaching a deductible.,Claim,Numeric 9(8)V99,10,2924,2933,N,212,N,212,
Detail,CLAIM_COPAY_AMOUNT,The value in this field represents the total copay dollar amount that a subscriber/member pays the provider at the time of service.  Usually a fixed flat charge per visit based on subscriber health insurance plan.,Claim,Numeric 9(8)V99,10,2934,2943,N,213,N,213,
Detail,CLAIM_DEDUCTIBLE_AMOUNT,The value in this field represents the total deductible dollar amount paid by the subscriber/member on a claim in order to satisfy the annual health plan deductible.,Claim,Numeric 9(8)V99,10,2944,2953,N,214,N,214,
Detail,CLAIM_DISALLOWED_AMOUNT,"The value in this field represents the total amount that is disallowed and will NOT be considered in the payment by the client, non billable to the subscriber/member.",Claim,Numeric 9(8)V99,10,2954,2963,N,215,N,215,
Detail,CLAIM_PATIENT_LIABILITY_AMOUNT,The value in this field represents the total patient liability amount (Coinsurance + Copay + Deductible) for a claim.,Claim,Numeric 9(8)V99,10,2964,2973,N,216,N,216,
Detail,CLAIM_COB_AMOUNT,The value in this field represents the dollar allowance for a procedure or service paid for by the primary insurer.,Claim,Numeric 9(8)V99,10,2974,2983,N,217,N,217,
Detail,CLAIM_COB_ALLOWED_AMOUNT,The value in this field represents the dollar allowance for a procedure or service paid by other insurance.,Claim,Numeric 9(8)V99,10,2984,2993,N,218,N,218,
Detail,CLAIM_COB_COINSURANCE_AMOUNT,The value in this field represents the amount paid by the insured based on a percentage of total cost.,Claim,Numeric 9(8)V99,10,2994,3003,N,219,N,219,
Detail,CLAIM_COB_PAID_AMOUNT,The value in this field represents the other insurance payment applied to the claim.,Claim,Numeric 9(8)V99,10,3004,3013,N,220,N,220,
Detail,CLAIM_COB_DEDUCT_AMOUNT,The value in this field represents the dollar amount the subscriber is liable for before other insurance is paid.,Claim,Numeric 9(8)V99,10,3014,3023,N,221,N,221,
Detail,CLAIM_PAID_DATE,"The value in this field represents the claim header level date of final adjudication or payment on daily incoming files or on history files.  If this value is the same as the line level value in PAID_DATE, please insert that date here.",Claim,"Date
YYYYMMDD",8,3024,3031,N,222,N,222,
Detail,CLAIM_CHECK_PAID_DATE,Date of the remittance number (voucher/check number).,Claim,"Date
YYYYMMDD",8,3032,3039,N,223,N,223,
Detail,PAID_TO_CODE,"Who the claim was paid out to. Valid values are: P = Provider, S = Subscriber",Claim,Text,1,3040,3040,N,224,N,224,
Detail,PAYMENT_STATUS,"The value in this field indicates the Claim header level payment status of the service. Valid values are: Paid, Denied, Pending, Reversed, Adjusted
Required for CV.",Claim,Text,20,3041,3060,N,225,N,225,
Detail,CLAIM_CAPITATION_INDICATOR,"Indicates if the claim was paid under a capitation agreement. Valid values are:
0  -  Non-Capitated Provider
1  -  Capitated Provider",Claim,Text,1,3061,3061,N,226,N,226,
Detail,CLAIM_FEE_SCHEDULE_CODE,Client note to indicate the type of pricing (fee schedule) used for the claim.,Claim,Text,25,3062,3086,N,227,N,227,
Detail,PATIENT_PLAN_CODE,This field represents the member's benefit plan code on the client's system at the time of service.,Claim,Text,20,3087,3106,N,228,N,228,
Detail,WHOLE_CLAIM_PRICING_LINE_YN,The value in this field indicates whether the claim lines were bundled to pay based on whole claim pricing.,Claim,Text,1,3107,3107,N,229,N,229,
Detail,OTHER_INSURANCE_INDICATOR,"Other Insurance Indicator that determines if other insurance is being used for payment on a claim. Valid values are:
0  -  Other insurance did not pay on claim
1  -  Other insurance paid on claim",Claim,Text,1,3108,3108,N,230,N,230,
Detail,COORDINATED_BENEFITS_YN,The value in this field indicates if a third party payment has been made on the claim related to Coordination of Benefits (COB). A 'Y' value indicates a third party payment has been made.,Claim,Text,1,3109,3109,N,231,N,231,
Detail,BYPASS_CODE,"This field supplies the client with greater control over the processing of specific claims. Should the client decide that they do not want certain claim lines to have logic applied to the service , the client can insert a value into this field to indicate which logic categories should be bypassed in the system.  If bypass codes are not required the field should be defaulted to 0.",Line,Numeric,20,3110,3129,N,232,N,232,
Detail,PAYER_BYPASS_CODE,The Payer Bypass allows for greater flexibility in payment policy application.  The use of this field must be discussed with the Implementation Services Director to ensure appropriateness and correct implementation.,Line,Numeric,20,3130,3149,N,233,N,233,
Detail,PAR_FLAG,"The value in this field represents the status of the Provider of Service in relation to the Health Plan. Expected values are ‘Y’ for participating or contracted or ‘N’ for Not participating or contracted. (If participating status is not available, default with ‘Y’.)   Required for CV.",Line,Text,1,3150,3150,N,234,N,234,
Detail,EDIT_0_ALLOWED_YN,"As a default, $0 allowed lines are not considered for editing purposes.  This flag can be used to override this filter and consider a line with a $0 allowed amount for editing in TBA and use as historical reference for future editing.

Null  -  Lines with a zero allowed amount reflecting a denial (default)
N  -  Zero charge and allowed lines that should not be considered for editing (default)
Y  -  Zero charge and allowed lines that should be considered for editing (override)",Line,Text,1,3151,3151,N,235,N,235,
Detail,DATE_RECEIVED_CLIENT,The value in this field represents the date the claim was received by the client.  This field is required for Timely Filing edits to be applied.  Required for CV.,Claim,"Date
YYYYMMDD",8,3152,3159,N,236,N,236,
Detail,CLAIM_ID_ORIG,"In situations where adjustments result in a new claim number on a client’s claim system, the original claim ID allows the new claim resulting from the adjustment to be linked back to the original claim.  (2300, REF02)",Claim,Text,25,3160,3184,Y,237,Y,237,
Detail,LINE_SEQ_ORIG,"The original line sequence is used to more accurately report payment variance and invoice data for edited TBA lines that are returned in history with one or multiple different line sequence numbers.  It links newly created lines back to the original line number that generated the change recommendation.  (2400, REF02)",Line,Numeric,4,3185,3188,N,238,N,238,
Detail,GROUP_ID,The value in this field represents the Employer Group Number for the member’s claim.  This field is used for reporting purposes only.,Claim,Text,15,3189,3203,N,239,N,239,
Detail,GROUP_NAME,"The value in this field represents the Employer Group Name for the patient's claim.  (2000B, SBR04)",Claim,Text,60,3204,3263,N,240,N,240,
Detail,RISK_POOL,"The value submitted in this field defines the risk pool associated with the group the member belongs to.  Expected value examples are; ASO, Fully Insured, Large Group Self Funded, Large Group Fully Insured, etc.  These values will be pulled from the appropriate client database for reporting purposes.",Claim,Text,60,3264,3323,N,241,N,241,
Detail,SUB_CLAIM_FILING_CODE,"The claim filing indicator is a CMS value that identifies the type of insurance for the submitted claim.  This is not to be confused with the CLAIM_TYPE of this layout. Expected values are found on a separate tab.  (2000B, SBR02) (2000C, PAT06)",Claim,Text,2,3324,3325,Y,242,N,242,
Detail,SUB_LAST_NAME,"The value in this field represents the subscriber’s last name and  will be the same value as submitted in PATIENT_LAST_NAME when the subscriber is the patient.  (Subscriber:  2010BA, NM103)",Claim,Text,60,3326,3385,Y,243,Y,243,
Detail,SUB_FIRST_NAME,"The value in this field represents the subscriber’s first name  and  will be the same value as submitted in PATIENT_FIRST_NAME when the subscriber is the patient.   (Subscriber:  2010BA, NM104)",Claim,Text,35,3386,3420,Y,244,Y,244,
Detail,SUB_MIDDLE_NAME,"The value in this field represents the subscriber's middle name  and  will be the same value as submitted in PATIENT_MIDDLE_NAME when the subscriber is the patient. This is required by CMS when needed to identify the individual. (Subscriber: 2010BA, NM105)",Claim,Text,25,3421,3445,Y,245,Y,245,
Detail,SUB_NAME_SUFFIX,"The value in this field represents the suffix attached to the subscriber's name and will be the same value as submitted in PATIENT_NAME_SUFFIX when the subscriber is the patient.  This is required by CMS when needed to identify the individual. (Subscriber: 2010BA, NM105)",Claim,Text,10,3446,3455,Y,246,Y,246,
Detail,SUB_ADDRESS_01,"The value in this field represents the first line of the subscriber's address.  This value will be the same value as submitted in PATIENT_ADDRESS_01 when the subscriber is the patient.  (2010BA, N301)",Claim,Text,55,3456,3510,Y,247,Y,247,
Detail,SUB_ADDRESS_02,"The value in this field represents the second line of the subscriber's address.  This value will be the same value as submitted in PATIENT_ADDRESS_02 when the subscriber is the patient.   (2010BA, N302)",Claim,Text,55,3511,3565,Y,248,Y,248,
Detail,SUB_CITY,"The value in this field represents the city of the subscriber's address. This value will be the same value as submitted in PATIENT_CITY when the subscriber is the patient.  (2010BA, N401)",Claim,Text,30,3566,3595,Y,249,Y,249,
Detail,SUB_STATE,"The value in this field represents the state of the subscriber's address.  This value will be the same value as submitted in PATIENT_STATE when the subscriber is the patient.  (2010BA, N402)",Claim,Text,2,3596,3597,Y,250,Y,250,
Detail,SUB_ZIP,"The value in this field represents the postal ZIP code associated with the subscriber's address.  The value is the basic five digit ZIP code and will be the same value as submitted in PATIENT_ZIP when the subscriber is the patient.    (2010BA, N403)",Claim,Text,5,3598,3602,Y,251,Y,251,
Detail,SUB_ZIP_PLUS_FOUR,"The value in this field represents the four digit add-on code for the expanded ZIP code associated with the subscriber's address.  The value is four digits and will be the same value as submitted in PATIENT_ZIP_PLUS_FOUR when the subscriber is the patient.     2010BA, N403)",Claim,Text,4,3603,3606,Y,252,Y,252,
Detail,SUB_COUNTRY,"The value in this field represents the country of the subscriber's  address.  This value will be the same value as submitted in PATIENT_COUNTRY when the subscriber is the patient.   (2010BA, N404)",Claim,Text,3,3607,3609,Y,253,Y,253,
Detail,SUB_COUNTRY_SUBDIVISION,"The value in this field represents the country subdivision code for the subscriber's address and only used for international addresses.  This value will be the same value as submitted in PATIENT_COUNTRY_SUBDIVISION when the subscriber is the patient.  (2010BA, N404)",Claim,Text,3,3610,3612,N,254,N,254,
Detail,SUB_DOB,"This field represents the subscriber’s date of birth and will be the same value as submitted in PATIENT_DOB when the subscriber is the patient.  (2010BA, DMG02)",Claim,Date YYYYMMDD,8,3613,3620,Y,255,Y,255,
Detail,SUB_GENDER_ID,"The value in this field represents the subscriber’s gender.  This value will be the same value as submitted in PATIENT_GENDER_ID when the subscriber is the patient.  Recommended values are M for Male, F for Female and U for Unknown.  (Subscriber:  2010BA, DMG03)",Claim,Text,10,3621,3630,Y,256,Y,256,
Detail,SUB_SSN,"The value in this field represents the subscriber’s social security number.  (2010BA, REF)",Claim,Text,9,3631,3639,N,257,N,257,
Detail,PATIENT_ADDRESS_01,"The value in this field represents the first line of the patient's address.  This value will be the same value as submitted in SUB_ADDRESS_01 when the patient is the subscriber.  (2010CA, N301)",Claim,Text,55,3640,3694,Y,258,Y,258,
Detail,PATIENT_ADDRESS_02,"The value in this field represents the second line of the patient's address.  This value will be the same value as submitted in SUB_ADDRESS_02 when the patient is the subscriber.  (2010CA, N302)",Claim,Text,55,3695,3749,Y,259,Y,259,
Detail,PATIENT_CITY,"The value in this field represents the city of the patient's address. (2010CA, N401)",Claim,Text,30,3750,3779,Y,260,Y,260,
Detail,PATIENT_STATE,"The value in this field represents the state of the patient's address.  (2010CA, N402)",Claim,Text,2,3780,3781,Y,261,Y,261,
Detail,PATIENT_ZIP,"The value in this field represents the postal ZIP code associated with the patient's address.  (2010CA, N403)",Claim,Text,5,3782,3786,Y,262,Y,262,
Detail,PATIENT_ZIP_PLUS_FOUR,"The value in this field represents the four digit add-on code for the expanded ZIP code associated with the patient's address.      2010CA, N403)",Claim,Text,4,3787,3790,Y,263,Y,263,
Detail,PATIENT_COUNTRY,"The value in this field represents the country of the patient's  address.  (2010CA, N404)",Claim,Text,3,3791,3793,Y,264,Y,264,
Detail,PATIENT_COUNTRY_SUBDIVISION,"The value in this field represents the country subdivision code for the patient's address and only used for international addresses.  (2010CA, N404)",Claim,Text,3,3794,3796,N,265,N,265,
Detail,RETIRED_INDICATOR,The value in this field defines indicates whether or not the member is a retiree. Expected values are ‘Y’ for Retiree or ‘N’ for Not Retired.,Claim,Text,1,3797,3797,N,266,N,266,
Detail,PAY_TO_ENTITY_TYPE,"Expected Values are:  'P' = Person or 'E' = Other Entity or Facility
(2010AB, NM102)",Line,Text,1,3798,3798,N,267,N,267,
Detail,PAY_TO_LAST_NAME,"This field represents the pay-to entity.  This data is not required by CMS, but it is requested that it be sent when the pay-to entity is different than the billing provider or facility.",Line,Text,60,3799,3858,N,268,N,268,
Detail,PAY_TO_FIRST_NAME,"The value in this field represents the pay-to provider’s first name.  (2010AB, NM104)",Line,Text,35,3859,3893,N,269,N,269,
Detail,PAY_TO_MIDDLE_NAME,"The value in this field represents the pay-to provider’s middle name.  (2010AB, NM105)",Line,Text,25,3894,3918,N,270,N,270,
Detail,PAY_TO_NAME_SUFFIX,"The value in this field represents the pay-to provider's suffix, as required.  (2010AB, NM107)",Line,Text,10,3919,3928,N,271,N,271,
Detail,PAY_TO_ADDRESS_01,"The value in this field represents the first line of the pay-to entity's address. CMS requires when the address for payment is different than that of the Billing Provider. (2010AB, NM1)",Line,Text,55,3929,3983,Y,272,Y,272,
Detail,PAY_TO_ADDRESS_02,"The value in this field represents the second line of the billing entity's address. CMS requires when the address for payment is different than that of the Billing Provider. (2010AB, N302)",Line,Text,55,3984,4038,Y,273,Y,273,
Detail,PAY_TO_CITY,"The value in this field represents the city of the pay-to entity's address.  (2010AB, N401)",Line,Text,30,4039,4068,Y,274,Y,274,
Detail,PAY_TO_STATE,"The value in this field represents the state of the pay-to entity's address.  (2010AB, N402)",Line,Text,2,4069,4070,Y,275,Y,275,
Detail,PAY_TO_ZIP,"The value in this field represents the postal ZIP code for the pay-to entity.  The value is the basic five digit ZIP code.   (2010AB, N403)",Line,Text,5,4071,4075,Y,276,Y,276,
Detail,PAY_TO_ZIP_PLUS_FOUR,"The value in this field represents the four digit add-on code for the expanded ZIP code.  The value is four digits.   (2010AB, N403)",Line,Text,4,4076,4079,Y,277,Y,277,
Detail,PAY_TO_COUNTRY,"The value in this field represents the country of the pay-to entity's  address.  (2010AB, N404)",Line,Text,3,4080,4082,Y,278,Y,278,
Detail,PAY_TO_COUNTRY_SUBDIVISION,"The value in this field represents the country subdivision code for the pay-to entity's address.  This is only used for international addresses.(2010AB, N407)",Line,Text,3,4083,4085,N,279,N,279,
Detail,REFERRING_PCP_YN,"Y or N indicator to define whether or not the referring provider is the patient's PCP. (2310A, NM101)",Line,Text,1,4086,4086,N,280,N,280,
Detail,REFERRING_PROVIDER_ID,"The value in this field represents the provider that referred the patient to the referring provider.  This number is the identification number unique to the provider in the client’s system.  (2310A, REF02)",Line,Text,25,4087,4111,N,281,N,281,
Detail,REFERRING_TAXGROUP_ID,"The value in this field represents the provider's tax identification number. This number represents the referring provider.  (2310A, REF02)",Line,Text,9,4112,4120,N,282,N,282,
Detail,REFERRING_NPI,"The value in this field represents the CMS National Provider Identifier (NPI) for the referring provider.  Default to spaces if value is not available.  (2310A, NM109)",Line,Numeric,10,4121,4130,Y,283,Y,283,
Detail,REFERRING_STATE_LICENSE,"The value in this field represents the Sate License number for the referring provider.  A non-zero value is required.  (2310A, REF02)",Line,Text,10,4131,4140,N,284,N,284,
Detail,REFERRING_SPECIALTY_CODE,"The value in this field represents the specialty of the referring provider, as defined in the client's claim system.",Line,Text,10,4141,4150,N,285,N,285,
Detail,REFERRING_TAXONOMY_CODE,Industry standard taxonomy code of the referring provider used by CMS and sourced by the National Uniform Claim Committee. A list of taxonomy codes is available via http://www.wpc-edi.com/reference/codelists/healthcare/health-care-provider-taxonomy-code-set/.,Line,Text,50,4151,4200,N,286,N,286,
Detail,REFERRING_ENTITY_TYPE,"Expected Values are:  'P' = Person
(2310A, NM102)",Line,Text,1,4201,4201,N,287,N,287,
Detail,REFERRING_LAST_NAME,"The value in this field represents the referring provider’s last name.  (2310A, NM103)",Line,Text,60,4202,4261,Y,288,Y,288,
Detail,REFERRING_FIRST_NAME,"The value in this field represents the referring provider’s first name.  (2310A, NM104)  Confirm referring D or E? Update for all referring values.",Line,Text,35,4262,4296,Y,289,Y,289,
Detail,REFERRING_MIDDLE_NAME,"The value in this field represents the referring provider’s middle name.  (2310A, NM105)  Confirm referring D or E?",Line,Text,25,4297,4321,Y,290,Y,290,
Detail,REFERRING_NAME_SUFFIX,"The value in this field represents the referring provider's suffix, as required.  (2310A, NM107)",Line,Text,10,4322,4331,Y,291,Y,291,
Detail,SUPERVISING_PROVIDER_ID,"The value in this field represents the provider ID for the supervising provider.  This number is the identification number unique to the provider in the client’s system.  (2310D, REF02)",Line,Text,25,4332,4356,N,292,N,292,
Detail,SUPERVISING_TAXGROUP_ID,"The value in this field represents the provider's tax identification number. This number represents the supervising provider.  (2310D, REF02)",Line,Text,9,4357,4365,N,293,N,293,
Detail,SUPERVISING_NPI,"The value in this field represents the CMS National Provider Identifier (NPI) for the supervising provider.  Default to spaces if value is not available. (2310D, NM109)",Line,Numeric,10,4366,4375,N,294,N,294,
Detail,SUPERVISING_STATE_LICENSE,"The value in this field represents the State License number for the supervising provider.  A non-zero value is required.  (2310D, REF02)",Line,Text,10,4376,4385,N,295,N,295,
Detail,SUPERVISING_SPECIALTY_CODE,"The value in this field represents the specialty of the supervising provider, as defined in the client's claim system.",Line,Text,10,4386,4395,N,296,N,296,
Detail,SUPERVISING_TAXONOMY_CODE,Industry standard taxonomy code of the supervising provider used by CMS and sourced by the National Uniform Claim Committee. A list of taxonomy codes is available via http://www.wpc-edi.com/reference/codelists/healthcare/health-care-provider-taxonomy-code-set/.,Line,Text,50,4396,4445,N,297,N,297,
Detail,SUPERVISING_ENTITY_TYPE,"Expected Values are:  'P' = Person
(2310D, NM102)",Line,Text,1,4446,4446,N,298,N,298,
Detail,SUPERVISING_LAST_NAME,"The value in this field represents the supervising provider’s last name.  (2310D, NM103)",Line,Text,60,4447,4506,N,299,N,299,
Detail,SUPERVISING_FIRST_NAME,"The value in this field represents the supervising provider’s first name.  (2310D, NM104)  Confirm supervising D or E? Update for all supervising values.",Line,Text,35,4507,4541,N,300,N,300,
Detail,SUPERVISING_MIDDLE_NAME,"The value in this field represents the supervising provider’s middle name.  (2310D, NM105)  Confirm supervising D or E?",Line,Text,25,4542,4566,N,301,N,301,
Detail,SUPERVISING_NAME_SUFFIX,"The value in this field represents the supervising provider's suffix, as required.  (2310D, NM107)",Line,Text,10,4567,4576,N,302,N,302,
Detail,ORDERING_PROVIDER_ID,"Ordering provider information is required by CMS when the service or supply was ordered by a provider who is different than the rendering provider for this service line. The value in this field represents a single physician identification number that is unique to the physician in the client’s system for the ordering provider. If a physician has more than one identifying number, there could be an impact to adjudication recommendations which should be discussed.  (2420E, REF02)",Line,Text,25,4577,4601,N,303,N,303,
Detail,ORDERING_TAXGROUP_ID,"The value in this field represents the ordering provider's tax identification number.  (2420E, REF02)",Line,Text,9,4602,4610,N,304,N,304,
Detail,ORDERING_NPI,"The value in this field represents the CMS National Provider Identifier (NPI) for the provider ordering this service.  Default to spaces if value is not available.  (2420E, NM109)",Line,Numeric,10,4611,4620,N,305,N,305,
Detail,ORDERING_STATE_LICENSE,"The value in this field represents the Sate License number for the ordering provider.  A non-zero value is required.  (2420E, REF02)",Line,Text,10,4621,4630,N,306,N,306,
Detail,ORDERING_SPECIALTY_CODE,"The value in this field is a code that represents the ordering physician’s specialty or subspecialty.  As an example: ORTH or 0015 for orthopedics, PEDCAR or 0030 for pediatric cardiology, etc. In order to make appropriate adjudication recommendations on the claim, the provider’s specialty must be identified. Blank values in this field can be mapped to a “miscellaneous” specialty which will limit payment policies that will be applied, if this method is chosen by the client.  Unrecognizable (unmapped) values will result in the “failing” of the claim during processing and will be reported on the daily processing report.  Client preferences will be discussed during the implementation process.  Please provide a list of client values with descriptions.",Line,Text,10,4631,4640,N,307,N,307,
Detail,ORDERING_TAXONOMY_CODE,Industry standard taxonomy code of the ordering provider used by CMS and sourced by the National Uniform Claim Committee. A list of taxonomy codes is available via http://www.wpc-edi.com/reference/codelists/healthcare/health-care-provider-taxonomy-code-set/.,Line,Text,50,4641,4690,N,308,N,308,
Detail,ORDERING_ENTITY_TYPE,"Expected Values are:  'P' = Person  (2420E, NM102)",Line,Text,1,4691,4691,N,309,N,309,
Detail,ORDERING_LAST_NAME,"The value in this field represents the ordering provider’s last name.  (2420E, NM103)",Line,Text,60,4692,4751,N,310,N,310,
Detail,ORDERING_FIRST_NAME,"The value in this field represents the ordering provider’s first name.  (2420E, NM104)",Line,Text,35,4752,4786,N,311,N,311,
Detail,ORDERING_MIDDLE_NAME,"The value in this field represents the ordering provider's middle name.  (2420E, NM105)",Line,Text,25,4787,4811,N,312,N,312,
Detail,ORDERING_NAME_SUFFIX,"The value in this field represents the ordering provider's suffix, as required.  (2420E NM107)",Line,Text,10,4812,4821,N,313,N,313,
Detail,ORDERING_ADDRESS_01,"The value in this field represents the first line of the ordering provider's address. (2420E, N301)",Line,Text,55,4822,4876,N,314,N,314,
Detail,ORDERING_ADDRESS_02,"The value in this field represents the second line of the ordering provider's address.  (2420E, N302)",Line,Text,55,4877,4931,N,315,N,315,
Detail,ORDERING_CITY,"The value in this field represents the city of the ordering provider's address.  (2420E, N401)",Line,Text,30,4932,4961,N,316,N,316,
Detail,ORDERING_STATE,"The value in this field represents the state of the ordering provider's address.  (2420E, N402)",Line,Text,2,4962,4963,N,317,N,317,
Detail,ORDERING_ZIP,"The value in this field represents the postal ZIP code for the ordering provider.  The value is the basic five digit ZIP code.   (2420E, N403)",Line,Text,5,4964,4968,N,318,N,318,
Detail,ORDERING_ZIP_PLUS_FOUR,"The value in this field represents the four digit add-on code for the expanded ZIP code.  The value is four digits.   (2420E, N403)",Line,Text,4,4969,4972,N,319,N,319,
Detail,ORDERING_COUNTRY,The value in this field represents the country of the ORDERING provider's address.  (2420E N404),Line,Text,3,4973,4975,N,320,N,320,
Detail,ORDERING_COUNTRY_SUBDIVISION,"The value in this field represents the country subdivision code for the ordering provider's address.  This is only used for international addresses.(2420E, N404)",Line,Text,3,4976,4978,N,321,N,321,
Detail,ORDERING_CONTACT,"This field represents the ordering provider's contact name.  (2420E, PER02)",Line,Text,60,4979,5038,N,322,N,322,
Detail,ORDERING_PHONE_COUNTRY_CODE,"This field represents the unique country code for international dialing for the ordering provider's primary phone number. (2420E, PER04)",Line,Text,5,5039,5043,N,323,N,323,
Detail,ORDERING_PHONE,"The value in this field represents the ordering provider's telephone number.    (2420E, PER04)",Line,Text,10,5044,5053,N,324,N,324,
Detail,ORDERING_PHONE_EXT,"The value in this field represents the ordering provider's primary telephone extension. (2420E, PER04)",Line,Text,6,5054,5059,N,325,N,325,
Detail,ORDERING_ALT_PHONE_COUNTRY_CODE,"This field represents the unique country code for international dialing for the ordering provider's alternate phone number. (2420E, PER06)",Line,Text,5,5060,5064,N,326,N,326,
Detail,ORDERING_ALT_PHONE,"The value in this field represents the ordering provider's alternate telephone number. (2420E, PER06)",Line,Text,10,5065,5074,N,327,N,327,
Detail,ORDERING_ALT_PHONE_EXT,"The value in this field represents the ordering provider's alternate telephone extension.(2420E, PER06)",Line,Text,6,5075,5080,N,328,N,328,
Detail,ORDERING_FAX_COUNTRY_CODE,"This field represents the unique country code for international dialing for the ordering provider's fax number. (2420E, PER08)",Line,Text,5,5081,5085,N,329,N,329,
Detail,ORDERING_FAX,"The value in this field represents the ordering provider's fax number. (2420E, PER08)",Line,Text,10,5086,5095,N,330,N,330,
Detail,AUTH_EXCEPTION_CODE,"Required when mandated by government law or regulation to obtain authorization for specific service(s) but, for the reasons provided, the service was performed without obtaining the authorization.  Allowable values for this element are:
1  -  Immediate/Urgent Care
2  -  Services Rendered in a Retroactive Period
3  -  Emergency Care
4  -  Client has Temporary Medicaid
5  -  Request from County for Second Opinion to Determine if Recipient Can Work
6  -  Request for Override Pending
7  -  Special Handling
(2300, REF02)",Claim,Text,4,5096,5099,N,331,N,331,
Detail,REFERRAL_NUM,"Required by CMS when a referral number is assigned by the payer or Utilization Management Organization (UMO) AND a referral is involved.  (2300, REF02)",Claim,Text,30,5100,5129,N,332,N,332,
Detail,AUTH_NO_01,"The value in this field represents the authorization number submitted by the provider for this claim.  If the provider did not submit an authorization number, provide the payer’s prior authorization number for this claim, if available.  (2300, REF)",Claim,Text,30,5130,5159,N,333,N,333,
Detail,CLAIM_NOTE_REF_CODE,"This field defines the functional area or purpose for which the claim note applies, as submitted by the provider or facility.  Expected Values are:
ADD  -  Additional Information
CER  -  Certificate Narrative
DCP  -  Goals, Rehabilitation Potential, or Discharge Plans
DGN  -  Diagnosis Description
TPO  -  Third Party Organization Notes
(2300, NTE01)",Claim,Text,3,5160,5162,N,334,N,334,
Detail,CLAIM_NOTE_TEXT,"This field is the free-form description provided by the provider or facility to clarify the related data elements and their content. (2300, NTE02)",Claim,Text,80,5163,5242,N,335,N,335,
Detail,MEDICARE_CROSSOVER_INDICATOR_YN,"This field represents the Medicare Section 4081 Indicator and is required when the submitter is Medicare and the claim is a Medigap or COB crossover claim.  The allowed values for this element are: 'Y' when the claim is section  4081, and 'N' when it is a Regular crossover claim. (2300, REF)",Claim,Text,1,5243,5243,N,336,N,336,
Detail,CHIRO_CONDITION_CODE,"This field supplies information related to the chiropractic service rendered to the patient.  This information is required on chiropractic claims involving spinal manipulation when the information is known to impact the payer's adjudication process.  Expected values are:
A  -  Acute Condition
C  -  Chronic Condition
D  -  Non-acute
E  -  Non-Life Threatening
F  -  Routine
G  -  Symptomatic
M  -  Acute Manifestation of a Chronic Condition
(2300, CR208)",Line,Text,1,5244,5244,N,337,N,337,
Detail,CHIRO_CONDITION_DESC_01,"This field is a free-form description to clarify the patient's condition.  (2300, CR210)",Line,Text,80,5245,5324,N,338,N,338,
Detail,CHIRO_CONDITION_DESC_02,"This field is a free-form description to clarify the patient's condition.  (2300, CR211)",Line,Text,80,5325,5404,N,339,N,339,
Detail,CHIRO_LAST_XRAY_DATE,"This field defines the date that the last x-ray was taken and is required by CMS when the service involves spinal manipulation.  (2300, DTP03) or (2400, DTP03)",Claim,"Date
YYYYMMDD",8,5405,5412,N,340,N,340,
Detail,VISION_CODE_CATEGORY,"This field defines the category of vision service provided.  Valid values are:
E1  -   Spectacle Lenses
E2  -  Contact Lenses
E3  -  Spectacle Frames
(2300, CRC01)",Line,Text,2,5413,5414,N,341,N,341,
Detail,VISION_CONDITION_CODE_01,"This field is used to supply information on patient condition when the claim is vision related and involves the replacement of lenses or frames, and it known to impact reimbursement. Conditions should only be reported if they apply to the claim. Valid values are:
L1  -  General Standard of 20 Degree or .5 Diopter Sphere or Cylinder Change Met
L2  -  Replacement Due to Loss or Theft
L3  -  Replacement Due to Breakage or Damage
L4  -  Replacement Due to Patient Preference
L5  -  Replacement Due to Medical Reason
(2300, CRC03)",Line,Text,3,5415,5417,N,342,N,342,
Detail,VISION_CONDITION_CODE_02,"See VISION_CONDITION_CODE_01  for valid values.  (2300, CRC07)",Line,Text,3,5418,5420,N,343,N,343,
Detail,VISION_CONDITION_CODE_03,"See VISION_CONDITION_CODE_01  for valid values.  (2300, CRC07)",Line,Text,3,5421,5423,N,344,N,344,
Detail,VISION_CONDITION_CODE_04,"See VISION_CONDITION_CODE_01 for valid values.  (2300, CRC06)",Line,Text,3,5424,5426,N,345,N,345,
Detail,VISION_CONDITION_CODE_05,"See VISION_CONDITION_CODE_01  for valid values.  (2300, CRC07)",Line,Text,3,5427,5429,N,346,N,346,
Detail,EPSDT_REFERRAL_YN,"This field answers the question: 'Was an EPSDT referral given to the patient?'.  Required on Early & Periodic Screening, Diagnosis, and Treatment (EPSDT) claims when the screening service is being billed in this claim. Valid values are 'Y' and 'N'. (2300, CRC02)",Claim,Text,1,5430,5430,N,347,N,347,
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
(2300, CRC03)",Claim,Text,3,5431,5433,N,348,N,348,
Detail,EPSDT_CONDITION_CODE_02,Additional condition indicator for the EPSDT referral.,Claim,Text,3,5434,5436,N,349,N,349,
Detail,EPSDT_CONDITION_CODE_03,Additional condition indicator for the EPSDT referral.,Claim,Text,3,5437,5439,N,350,N,350,
Detail,EPSDT_INDICATOR_YN,"This field defines whether or not the service being billed is the result of an EPSDT screening service and is required by CMS when Medicaid services are the result of a screening referral.  The screening service would be submitted with the value 'N'.  Y” value indicates EPSDT involvement; an “N” value indicates no EPSDT involvement.(2400, SV111)",Claim,Text,1,5440,5440,N,351,N,351,
Detail,ANESTHESIA_RELATED_SURG_HCPCS_01,"The value in this field represents the Level1 (CPT) or Level2 (HCPCS) code for the surgical code when anesthesiology services are being billed.  (2300, HI01-2)",Claim,Text,5,5441,5445,N,352,N,352,
Detail,ANESTHESIA_RELATED_SURG_HCPCS_02,"The value in this field represents the Level1 (CPT) or Level2 (HCPCS) code for the surgical code when anesthesiology services are being billed.  (2300, HI02-2)",Claim,Text,5,5446,5450,N,353,N,353,
Detail,FAMILY_PLANNING_INDICATOR_YN,"The value in this field indicates whether or not the service being billed is the result of Family Planning services.  A “Y” value indicates family planning services involvement; an “N” value indicates no family planning services involvement.  (2300, SV112)",Line,Text,1,5451,5451,N,354,N,354,
Detail,DME_HCPCS,"The value in this field represents the Level1 (CPT) or Level2 (HCPCS) code for Durable Medical Equipment.  Required when necessary to report both the rental and purchase price information for durable medical equipment. This is not used for claims where the provider is reporting only the rental price or only the purchase price. (2400, SV501-2)",Line,Text,5,5452,5456,N,355,N,355,
Detail,DME_UNITS,"This field specifies the length (in days) of medical treatment required as it relates to this service.  (2400, SV503)",Line,Numeric 9(10)V999,13,5457,5469,N,356,N,356,
Detail,DME_RENTAL_PRICE_AMOUNT,"This value is the rental price for the DME service being reported.  (2400, SV504)",Line,Numeric 9(8)V99,10,5470,5479,N,357,N,357,
Detail,DME_PURCHASE_PRICE_AMOUNT,"This value is the purchase price for the DME service being reported.  (2400,SV505)",Line,Numeric 9(8)V99,10,5480,5489,N,358,N,358,
Detail,DME_RENTAL_FREQUENCY,"The value in this field define the frequency at which the rental equipment is billed.  Valid values are:
1  -  Weekly
4  -  Monthly
6  -  Daily
(2400,SV507)",Line,Numeric,1,5490,5490,N,359,N,359,
Detail,DMERC_CMN_TRANSMIT_CODE,"This value provides the documentation type for Durable Medical Equipment Regional Carrier (DMERC) Certificate of Medically Necessity (CMN).  Valid values are:
AB  -  Previously Submitted to Payer
AD  -  Certification Included in this Claim
AF  -  Narrative Segment Included in this Claim
AG  -  No Documentation is Required
NS  -  Not Specified  (Available upon request at provider's site.) (2400, PWK02)",Line,Text,2,5491,5492,N,360,N,360,
Detail,DME_CERT_TYPE,"This field defines the type of certification being provided for DME.  CMS requires this when the DMERC_CMN_TRANSMIT_CODE, DMERC Information Form or Oxygen Therapy Certification is included on this service line.  Valid Values are:
I  -  Initial
R  -  Renewal
S  -  Revised
(2400, CR301)",Line,Text,1,5493,5493,N,361,N,361,
Detail,DME_DURATION,"This field represents the length of time (in months) the DME equipment is needed.  (2400, CR303)",Line,Numeric 9(10)V999,13,5494,5506,N,362,N,362,
Detail,DME_CONDITION_CODE_01,"This field is utilized to supply information on conditions related to the DME Certification and is submitted when it impacts adjudication. Valid Values are:
38  -  Certification signed by the physician is on file
ZV  -  Replacement Item
(2400, CRC03)",Line,Text,3,5507,5509,N,363,N,363,
Detail,DME_CONDITION_CODE_02,"This field is utilized to supply information on conditions related to the DME Certification and is submitted when it impacts adjudication. Valid Values are:
38  -  Certification signed by the physician is on file
ZV  -  Replacement Item
(2400, CRC04)",Line,Text,3,5510,5512,N,364,N,364,
Detail,DME_CERT_REVISION_DATE,"This field is required when a DBERC certification is 'R'  -  Renewal or 'S'  -  Revised, and represents the date the certification was revised or recertification received. (2400, DTP03)",Line,"Date
YYYYMMDD",8,5513,5520,N,365,N,365,
Detail,DME_BEGIN_THERAPY_DATE,"This field defines the first date of therapy for DME services.  (2400, DTP03)",Line,"Date
YYYYMMDD",8,5521,5528,N,366,N,366,
Detail,DME_LAST_CERT_DATE,"This is the date the ordering physician signed the CMN or the date the supplier signed the DMERC CMN.  (2400, DTP03)",Line,"Date
YYYYMMDD",8,5529,5536,N,367,N,367,
Detail,FORM_ID_CODE,"This field identifies the form attached to the claim by the rendering provider.  Examples are: Medicare DMERC CMN form, DMERC Information Form (DIF), Oxygen Therapy Certification from the referring physician or Home Health documentation.  Valid values are:
AS  -  Form Type Code  -  Code value AS indicates that a Home Health form from
           External Code Source 656 is being identified in LQ02.
UT  -  Centers for Medicare and Medicaid Services (CMS) Durable Medical
           Equipment Regional Carrier (DMERC) Certificate of Medical Necessity (CMN)
           Forms
(2440, LQ01)",Claim,Text,3,5537,5539,N,368,N,368,
Detail,FORM_ID,"This field provides the form identifier as defined in the FORM_ID_CODE field.  (2440, LQ02)",Claim,Text,30,5540,5569,N,369,N,369,
Detail,DOCUMENT_CONTROL_NUMBER,The value in this field represents the client specific document control number.,Claim,Text,20,5570,5589,N,370,N,370,
Detail,ATTACHMENT_TYPE_CODE_01,"This field is required when a paper attachment follows the submission of an electronic claim, is sent electronically or available by request from the provider's office and identifies the type of attachment being sent.  This value is defined by CMS in the Institutional 837 TR3 (IG) in loop 2400, segment PWK01.  See tab 'Attachment Codes' for a list of values. (2400, PWK01)",Line,Text,2,5590,5591,N,371,N,371,
Detail,ATTACHMENT_TRANSMIT_CODE_01,"This field is required when ATTACHMENT_TYPE_CODE_01 is provided.  This value defines how the attachment will be sent.  Valid values are defined by CMS in the Institutional 837 TR3 (IG) in loop 2400, segment PWK02.  See tab 'Attachment Codes' for a list of values.  Expected when corresponding ATTACHMENT_TYPE_CODE is submitted.  (2400, PWK02)",Line,Text,2,5592,5593,N,372,N,372,
Detail,ACN_01,"This field represents a value assigned by the provider to uniquely identify the attachment referenced in ATTACHMENT_TYPE_CODE_01.  Expected when corresponding ATTACHMENT_TYPE_CODE is submitted.  (2400, PWK06)",Line,Text,24,5594,5617,N,373,N,373,
Detail,ATTACHMENT_TYPE_CODE_02,"This field is required when a paper attachment follows the submission of an electronic claim, is sent electronically or available by request from the provider's office and identifies the type of attachment being sent.  This value is defined by CMS in the Institutional 837 TR3 (IG) in loop 2400, segment PWK01.  See tab 'Attachment Codes' for a list of values. (2400, PWK01)",Line,Text,2,5618,5619,N,374,N,374,
Detail,ATTACHMENT_TRANSMIT_CODE_02,"This field is required when ATTACHMENT_TYPE_CODE_02 is provided.  This value defines how the attachment will be sent.  Valid values are defined by CMS in the Institutional 837 TR3 (IG)  in loop 2400, segment PWK02.  See tab 'Attachment Codes' for a list of values.  Expected when corresponding ATTACHMENT_TYPE_CODE is submitted.  (2400, PWK02)",Line,Text,2,5620,5621,N,375,N,375,
Detail,ACN_02,"This field represents a value assigned by the provider to uniquely identify the attachment referenced in ATTACHMENT_TYPE_CODE_02.  Expected when corresponding ATTACHMENT_TYPE_CODE is submitted.   (2400, PWK06)",Line,Text,24,5622,5645,N,376,N,376,
Detail,ATTACHMENT_TYPE_CODE_03,"This field is required when a paper attachment follows the submission of an electronic claim, is sent electronically or available by request from the provider's office and identifies the type of attachment being sent.  This value is defined by CMS in the Institutional 837 TR3 (IG) in loop 2400, segment PWK01.  See tab 'Attachment Codes' for a list of values. (2400, PWK01)",Line,Text,2,5646,5647,N,377,N,377,
Detail,ATTACHMENT_TRANSMIT_CODE_03,"This field is required when ATTACHMENT_TYPE_CODE_03 is provided.  This value defines how the attachment will be sent.  Valid values are defined by CMS in the Institutional 837 TR3 (IG)  in loop 2400, segment PWK02.  See tab 'Attachment Codes' for a list of values.  Expected when corresponding ATTACHMENT_TYPE_CODE is submitted. (2400, PWK02)",Line,Text,2,5648,5649,N,378,N,378,
Detail,ACN_03,"This field represents a value assigned by the provider to uniquely identify the attachment referenced in ATTACHMENT_TYPE_CODE_03.  This field is required if the corresponding Attachment is present.  Expected when corresponding ATTACHMENT_TYPE_CODE is submitted.  (2400, PWK06)",Line,Text,24,5650,5673,N,379,N,379,
Detail,ATTACHMENT_TYPE_CODE_04,"This field is required when a paper attachment follows the submission of an electronic claim, is sent electronically or available by request from the provider's office and identifies the type of attachment being sent.  This value is defined by CMS in the Institutional 837 TR3 (IG) in loop 2400, segment PWK01.  See tab 'Attachment Codes' for a list of values. (2400, PWK01)",Line,Text,2,5674,5675,N,380,N,380,
Detail,ATTACHMENT_TRANSMIT_CODE_04,"This field is required when ATTACHMENT_TYPE_CODE_04 is provided.  This value defines how the attachment will be sent.  Valid values are defined by CMS in the Institutional 837 TR3 (IG)  in loop 2400, segment PWK02.  See tab 'Attachment Codes' for a list of values.  Expected when corresponding ATTACHMENT_TYPE_CODE is submitted. (2400, PWK02)",Line,Text,2,5676,5677,N,381,N,381,
Detail,ACN_04,"This field represents a value assigned by the provider to uniquely identify the attachment referenced in ATTACHMENT_TYPE_CODE_04.  This field is required if the corresponding Attachment is present.  Expected when corresponding ATTACHMENT_TYPE_CODE is submitted. (2400, PWK06)",Line,Text,24,5678,5701,N,382,N,382,
Detail,ATTACHMENT_TYPE_CODE_05,"This field is required when a paper attachment follows the submission of an electronic claim, is sent electronically or available by request from the provider's office and identifies the type of attachment being sent.  This value is defined by CMS in the Institutional 837 TR3 (IG) in loop 2400, segment PWK01.  See tab 'Attachment Codes' for a list of values. (2400, PWK01)",Line,Text,2,5702,5703,N,383,N,383,
Detail,ATTACHMENT_TRANSMIT_CODE_05,"This field is required when ATTACHMENT_TYPE_CODE_05 is provided.  This value defines how the attachment will be sent.  Valid values are defined by CMS in the Institutional 837 TR3 (IG)  in loop 2400, segment PWK02.  See tab 'Attachment Codes' for a list of values.  Expected when corresponding ATTACHMENT_TYPE_CODE is submitted. (2400, PWK02)",Line,Text,2,5704,5705,N,384,N,384,
Detail,ACN_05,"This field represents a value assigned by the provider to uniquely identify the attachment referenced in ATTACHMENT_TYPE_CODE_05.  Expected when corresponding ATTACHMENT_TYPE_CODE is submitted. (2400, PWK06)",Line,Text,24,5706,5729,N,385,N,385,
Detail,ATTACHMENT_TYPE_CODE_06,"This field is required when a paper attachment follows the submission of an electronic claim, is sent electronically or available by request from the provider's office and identifies the type of attachment being sent.  This value is defined by CMS in the Institutional 837 TR3 (IG) in loop 2400, segment PWK01.  See tab 'Attachment Codes' for a list of values. (2400, PWK01)",Line,Text,2,5730,5731,N,386,N,386,
Detail,ATTACHMENT_TRANSMIT_CODE_06,"This field is required when ATTACHMENT_TYPE_CODE_06 is provided.  This value defines how the attachment will be sent.  Valid values are defined by CMS in the Institutional 837 TR3 (IG)  in loop 2400, segment PWK02.  See tab 'Attachment Codes' for a list of values.  Expected when corresponding ATTACHMENT_TYPE_CODE is submitted. (2400, PWK02)",Line,Text,2,5732,5733,N,387,N,387,
Detail,ACN_06,"This field represents a value assigned by the provider to uniquely identify the attachment referenced in ATTACHMENT_TYPE_CODE_06.  Expected when corresponding ATTACHMENT_TYPE_CODE is submitted.  (2400, PWK06)",Line,Text,24,5734,5757,N,388,N,388,
Detail,ATTACHMENT_TYPE_CODE_07,"This field is required when a paper attachment follows the submission of an electronic claim, is sent electronically or available by request from the provider's office and identifies the type of attachment being sent.  This value is defined by CMS in the Institutional 837 TR3 (IG) in loop 2400, segment PWK01.  See tab 'Attachment Codes' for a list of values. (2400, PWK01)",Line,Text,2,5758,5759,N,389,N,389,
Detail,ATTACHMENT_TRANSMIT_CODE_07,"This field is required when ATTACHMENT_TYPE_CODE_07 is provided.  This value defines how the attachment will be sent.  Valid values are defined by CMS in the Institutional 837 TR3 (IG)  in loop 2400, segment PWK02.  See tab 'Attachment Codes' for a list of values.  Expected when corresponding ATTACHMENT_TYPE_CODE is submitted.  (2400, PWK02)",Line,Text,2,5760,5761,N,390,N,390,
Detail,ACN_07,"This field represents a value assigned by the provider to uniquely identify the attachment referenced in ATTACHMENT_TYPE_CODE_07.  Expected when corresponding ATTACHMENT_TYPE_CODE is submitted.  (2400, PWK06)",Line,Text,24,5762,5785,N,391,N,391,
Detail,ATTACHMENT_TYPE_CODE_08,"This field is required when a paper attachment follows the submission of an electronic claim, is sent electronically or available by request from the provider's office and identifies the type of attachment being sent.  This value is defined by CMS in the Institutional 837 TR3 (IG) in loop 2400, segment PWK01.  See tab 'Attachment Codes' for a list of values. (2400, PWK01)",Line,Text,2,5786,5787,N,392,N,392,
Detail,ATTACHMENT_TRANSMIT_CODE_08,"This field is required when ATTACHMENT_TYPE_CODE_08 is provided.  This value defines how the attachment will be sent.  Valid values are defined by CMS in the Institutional 837 TR3 (IG)  in loop 2400, segment PWK02.  See tab 'Attachment Codes' for a list of values.  Expected when corresponding ATTACHMENT_TYPE_CODE is submitted.  (2400, PWK02)",Line,Text,2,5788,5789,N,393,N,393,
Detail,ACN_08,"This field represents a value assigned by the provider to uniquely identify the attachment referenced in ATTACHMENT_TYPE_CODE_08.  Expected when corresponding ATTACHMENT_TYPE_CODE is submitted.   (2400, PWK06)",Line,Text,24,5790,5813,N,394,N,394,
Detail,ATTACHMENT_TYPE_CODE_09,"This field is required when a paper attachment follows the submission of an electronic claim, is sent electronically or available by request from the provider's office and identifies the type of attachment being sent.  This value is defined by CMS in the Institutional 837 TR3 (IG) in loop 2400, segment PWK01.  See tab 'Attachment Codes' for a list of values. (2400, PWK01)",Line,Text,2,5814,5815,N,395,N,395,
Detail,ATTACHMENT_TRANSMIT_CODE_09,"This field is required when ATTACHMENT_TYPE_CODE_09 is provided.  This value defines how the attachment will be sent.  Valid values are defined by CMS in the Institutional 837 TR3 (IG)  in loop 2400, segment PWK02.  See tab 'Attachment Codes' for a list of values.  Expected when corresponding ATTACHMENT_TYPE_CODE is submitted. (2400, PWK02)",Line,Text,2,5816,5817,N,396,N,396,
Detail,ACN_09,"This field represents a value assigned by the provider to uniquely identify the attachment referenced in ATTACHMENT_TYPE_CODE_09.   Expected when corresponding ATTACHMENT_TYPE_CODE is submitted.  (2400, PWK06)",Line,Text,24,5818,5841,N,397,N,397,
Detail,ATTACHMENT_TYPE_CODE_10,"This field is required when a paper attachment follows the submission of an electronic claim, is sent electronically or available by request from the provider's office and identifies the type of attachment being sent.  This value is defined by CMS in the Institutional 837 TR3 (IG) in loop 2400, segment PWK01.  See tab 'Attachment Codes' for a list of values. (2400, PWK01)",Line,Text,2,5842,5843,N,398,N,398,
Detail,ATTACHMENT_TRANSMIT_CODE_10,"This field is required when ATTACHMENT_TYPE_CODE_10 is provided.  This value defines how the attachment will be sent.  Valid values are defined by CMS in the Institutional 837 TR3 (IG)  in loop 2400, segment PWK02.  See tab 'Attachment Codes' for a list of values.  Expected when corresponding ATTACHMENT_TYPE_CODE is submitted. (2400, PWK02)",Line,Text,2,5844,5845,N,399,N,399,
Detail,ACN_10,"This field represents a value assigned by the provider to uniquely identify the attachment referenced in ATTACHMENT_TYPE_CODE_10.  Expected when corresponding ATTACHMENT_TYPE_CODE is submitted.  (2400, PWK06)",Line,Text,24,5846,5869,N,400,N,400,
Detail,CLAIM_ATTACHMENT_TYPE_CODE,"This field indicates the title or contents of a document, report or supporting item.  Expected values are defined in the CMS 837 transaction.  (2300, PWK01)",Claim,Text,2,5870,5871,N,401,N,401,
Detail,CLAIM_ATTACHMENT_TRANSMIT_CODE,"This field represents the code defining timing, transmission method or format by which reports are to be sent.  Expected values are defined in the CMS 837 transaction.  (2300, PWK02)",Claim,Text,2,5872,5873,N,402,N,402,
Detail,CLAIM_ACN,"This field represents the code designating the system/method of code structure used for identification.  (2300, PWK05)",Claim,Text,80,5874,5953,N,403,N,403,
Detail,LINE_AUTH_NUM_01,"This field represents the line level authorization number for this service and is only required when it differs from the claim level authorization number found in AUTH_NO_1 in this layout or when it is necessary to report one or more non-destination payer Prior Authorization Numbers.  (2400, REF02)",Line,Text,30,5954,5983,N,404,N,404,
Detail,LINE_AUTH_NUM_01_NPI,"This field defines the primary identifier (NPI) from the non-destination payer and would match the Other Payer information in Loop ID-2330B, NM109. Default to spaces if value is not available. (2400, REF04-2)",Line,Numeric,10,5984,5993,N,405,N,405,
Detail,LINE_AUTH_NUM_02,"This field represents the line level authorization number for this service and is only required when it differs from the claim level authorization number found in AUTH_NO_1 in this layout or when it is necessary to report one or more non-destination payer Prior Authorization Numbers.  (2400, REF02)",Line,Text,30,5994,6023,N,406,N,406,
Detail,LINE_AUTH_NUM_02_NPI,"This field defines the primary identifier (NPI) from the non-destination payer and would match the Other Payer information in Loop ID-2330B, NM109. Default to spaces if value is not available. (2400, REF04-2)",Line,Numeric,10,6024,6033,N,407,N,407,
Detail,LINE_AUTH_NUM_03,"This field represents the line level authorization number for this service and is only required when it differs from the claim level authorization number found in AUTH_NO_1 in this layout or when it is necessary to report one or more non-destination payer Prior Authorization Numbers.  (2400, REF02)",Line,Text,30,6034,6063,N,408,N,408,
Detail,LINE_AUTH_NUM_03_NPI,"This field defines the primary identifier (NPI) from the non-destination payer and would match the Other Payer information in Loop ID-2330B, NM109. Default to spaces if value is not available.  (2400, REF04-2)",Line,Numeric,10,6064,6073,N,409,N,409,
Detail,LINE_AUTH_NUM_04,"This field represents the line level authorization number for this service and is only required when it differs from the claim level authorization number found in AUTH_NO_1 in this layout or when it is necessary to report one or more non-destination payer Prior Authorization Numbers.  (2400, REF02)",Line,Text,30,6074,6103,N,410,N,410,
Detail,LINE_AUTH_NUM_04_NPI,"This field defines the primary identifier (NPI) from the non-destination payer and would match the Other Payer information in Loop ID-2330B, NM109. Default to spaces if value is not available.  (2400, REF04-2)",Line,Numeric,10,6104,6113,N,411,N,411,
Detail,LINE_AUTH_NUM_05,"This field represents the line level authorization number for this service and is only required when it differs from the claim level authorization number found in AUTH_NO_1 in this layout or when it is necessary to report one or more non-destination payer Prior Authorization Numbers.  (2400, REF02)",Line,Text,30,6114,6143,N,412,N,412,
Detail,LINE_AUTH_NUM_05_NPI,"This field defines the primary identifier (NPI) from the non-destination payer and would match the Other Payer information in Loop ID-2330B, NM109. Default to spaces if value is not available. (2400, REF04-2)",Line,Numeric,10,6144,6153,N,413,N,413,
Detail,ONSET_CURRENT_ILLNESS,"This date is the onset of acute symptoms for the current illness or condition.  Required for the initial medical service or visit performed in response to a medical emergency when the date is available and is different than the date of service.  (2300, DTP03)",Claim,"Date
YYYYMMDD",8,6154,6161,N,414,N,414,
Detail,INITIAL_TREATMENT_DATE,"This field is required by CMS when this information is known to impact adjudication for claims involving spinal manipulation, physical therapy, occupational therapy, or speech language pathology.  (2300, DTP03)",Claim,"Date
YYYYMMDD",8,6162,6169,N,415,N,415,
Detail,LAST_SEEN_DATE,"This is the date that the patient was seen by the attending or supervising physician for the qualifying medical condition related to the services performed.  CMS requires this date when claims involve services for routine foot care and it is known to impact the payer’s adjudication process.  (2300, DTP03)",Claim,"Date
YYYYMMDD",8,6170,6177,N,416,N,416,
Detail,ACUTE_MANIFESTATION_DATE,"This field represents the date of acute manifestation and is required when Loop ID-2300 CR208= 'A' or 'M', the claim involves spinal manipulation and the payer is Medicare.  (2300, DTP03)",Claim,"Date
YYYYMMDD",8,6178,6185,N,417,N,417,
Detail,ACCIDENT_DATE,"This field represents the date of accident and is required when the service is rendered as a result of an accident, whether auto, other or in relation to employment. (2300, DTP03)",Claim,"Date
YYYYMMDD",8,6186,6193,N,418,N,418,
Detail,LMP_DATE,"This field represents the date of the patient's last menstrual period and is required when, in the judgment of the provider, the services on this claim are related to the patient’s pregnancy. (2300, DTP03)",Claim,"Date
YYYYMMDD",8,6194,6201,N,419,N,419,
Detail,ADMIT_DATE,"The value in this field should represent the date in the Statement Covers Period From date.  Required on all ambulance claims when the patient was known to be admitted to the hospital. Required for CV.  (2300, DTP03)",Claim,Date YYYYMMDD,8,6202,6209,N,420,N,420,
Detail,DISCHARGE_DATE,"The value in this field represents the Discharge Date.   Required on all ambulance claims when the patient was known to be admitted to the hospital. (2300, DTP03)",Claim,Date YYYYMMDD,8,6210,6217,N,421,N,421,
Detail,ASSUMED_CARE_DATE,"This field represents the ""assumed care date"" when provider share post-operative care.  Assumed Care Date is the date care was assumed by another provider.  (2300, DTP03)",Claim,"Date
YYYYMMDD",8,6218,6225,N,422,N,422,
Detail,RELINQUISHED_CARE_DATE,"This field represents the ""relinquished care date"" when providers share post-operative care.  The Relinquished Care Date is the date the provider filing this claim ceased post-operative care. (2300, DTP03)",Claim,"Date
YYYYMMDD",8,6226,6233,N,423,N,423,
Detail,LINE_NOTE_REF_CODE,"This field defines the functional area or purpose for which the line note applies, as submitted by the provider or facility.  Valid Values are:
ADD  -  Additional Information
DCP  -  Goals, Rehabilitation Potential, or Discharge Plans
(2400, NTE01)",Line,Text,3,6234,6236,N,424,N,424,
Detail,LINE_NOTE_TEXT,"This field is the free-form description provided by the provider or facility to clarify the related data elements and their content. (2400, NTE02)",Line,Text,80,6237,6316,N,425,N,425,
Detail,CLAIM_FREQUENCY_CODE,"This code specifies the frequency of the claim and is the third position of the UBC Form Bill Type.  (2300, CLM05-3)",Claim,Text,1,6317,6317,Y,426,Y,426,
Detail,ADJUSTMENT_NUMBER,"The value in this field provides information on how many adjustments have been made to the claim line (0  -  original, greater than 0 indicates times adjusted).",Line,Text,1,6318,6318,N,427,N,427,
Detail,ADJ_CODE_01,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.   This field is line level.",Line,Text,10,6319,6328,N,428,N,428,
Detail,ADJ_TYPE_01,"This field defines the source of the line level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding ADJ_CODE is present.",Line,Text,2,6329,6330,N,429,N,429,
Detail,ADJUSTOR_ID_01,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding ADJ_CODE is present.,Line,Text,20,6331,6350,N,430,N,430,
Detail,ADJ_CODE_02,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.   This field is line level.",Line,Text,10,6351,6360,N,431,N,431,
Detail,ADJ_TYPE_02,"This field defines the source of the line level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding ADJ_CODE is present.",Line,Text,2,6361,6362,N,432,N,432,
Detail,ADJUSTOR_ID_02,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding ADJ_CODE is present.,Line,Text,20,6363,6382,N,433,N,433,
Detail,ADJ_CODE_03,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.   This field is line level.",Line,Text,10,6383,6392,N,434,N,434,
Detail,ADJ_TYPE_03,"This field defines the source of the line level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding ADJ_CODE is present.",Line,Text,2,6393,6394,N,435,N,435,
Detail,ADJUSTOR_ID_03,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding ADJ_CODE is present.,Line,Text,20,6395,6414,N,436,N,436,
Detail,ADJ_CODE_04,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.   This field is line level.",Line,Text,10,6415,6424,N,437,N,437,
Detail,ADJ_TYPE_04,"This field defines the source of the line level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding ADJ_CODE is present.",Line,Text,2,6425,6426,N,438,N,438,
Detail,ADJUSTOR_ID_04,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding ADJ_CODE is present.,Line,Text,20,6427,6446,N,439,N,439,
Detail,ADJ_CODE_05,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.   This field is line level.",Line,Text,10,6447,6456,N,440,N,440,
Detail,ADJ_TYPE_05,"This field defines the source of the line level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding ADJ_CODE is present.",Line,Text,2,6457,6458,N,441,N,441,
Detail,ADJUSTOR_ID_05,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding ADJ_CODE is present.,Line,Text,20,6459,6478,N,442,N,442,
Detail,ADJ_CODE_06,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.   This field is line level.",Line,Text,10,6479,6488,N,443,N,443,
Detail,ADJ_TYPE_06,"This field defines the source of the line level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding ADJ_CODE is present.",Line,Text,2,6489,6490,N,444,N,444,
Detail,ADJUSTOR_ID_06,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding ADJ_CODE is present.,Line,Text,20,6491,6510,N,445,N,445,
Detail,ADJ_CODE_07,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.   This field is line level.",Line,Text,10,6511,6520,N,446,N,446,
Detail,ADJ_TYPE_07,"This field defines the source of the line level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding ADJ_CODE is present.",Line,Text,2,6521,6522,N,447,N,447,
Detail,ADJUSTOR_ID_07,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted. Expected if corresponding ADJ_CODE is present.,Line,Text,20,6523,6542,N,448,N,448,
Detail,ADJ_CODE_08,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.   This field is line level.",Line,Text,10,6543,6552,N,449,N,449,
Detail,ADJ_TYPE_08,"This field defines the source of the line level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding ADJ_CODE is present.",Line,Text,2,6553,6554,N,450,N,450,
Detail,ADJUSTOR_ID_08,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted. Expected if corresponding ADJ_CODE is present.,Line,Text,20,6555,6574,N,451,N,451,
Detail,ADJ_CODE_09,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.   This field is line level.",Line,Text,10,6575,6584,N,452,N,452,
Detail,ADJ_TYPE_09,"This field defines the source of the line level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding ADJ_CODE is present.",Line,Text,2,6585,6586,N,453,N,453,
Detail,ADJUSTOR_ID_09,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted. Expected if corresponding ADJ_CODE is present.,Line,Text,20,6587,6606,N,454,N,454,
Detail,ADJ_CODE_10,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.   This field is line level.",Line,Text,10,6607,6616,N,455,N,455,
Detail,ADJ_TYPE_10,"This field defines the source of the line level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding ADJ_CODE is present.",Line,Text,2,6617,6618,N,456,N,456,
Detail,ADJUSTOR_ID_10,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding ADJ_CODE is present.,Line,Text,20,6619,6638,N,457,N,457,
Detail,CLAIM_ADJUSTMENT_NUMBER,"The value in this field provides information on how many adjustments have been made to the claim (0  -  original, greater than 0 indicates number of times adjusted).",Claim,Text,1,6639,6639,N,458,N,458,
Detail,CLAIM_ADJ_CODE_01,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is claim level.",Claim,Text,10,6640,6649,N,459,N,459,
Detail,CLAIM_ADJ_TYPE_01,"This field defines the source of the claim level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding CLAIM_ADJ_CODE is present.",Claim,Text,2,6650,6651,N,460,N,460,
Detail,CLAIM_ADJUSTOR_ID_01,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted. Expected if corresponding CLAIM_ADJ_CODE is present.,Claim,Text,20,6652,6671,N,461,N,461,
Detail,CLAIM_ADJ_CODE_02,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is claim level.",Claim,Text,10,6672,6681,N,462,N,462,
Detail,CLAIM_ADJ_TYPE_02,"This field defines the source of the claim level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding CLAIM_ADJ_CODE is present.",Claim,Text,2,6682,6683,N,463,N,463,
Detail,CLAIM_ADJUSTOR_ID_02,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding CLAIM_ADJ_CODE is present.,Claim,Text,20,6684,6703,N,464,N,464,
Detail,CLAIM_ADJ_CODE_03,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is claim level.",Claim,Text,10,6704,6713,N,465,N,465,
Detail,CLAIM_ADJ_TYPE_03,"This field defines the source of the claim level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding CLAIM_ADJ_CODE is present.",Claim,Text,2,6714,6715,N,466,N,466,
Detail,CLAIM_ADJUSTOR_ID_03,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding CLAIM_ADJ_CODE is present.,Claim,Text,20,6716,6735,N,467,N,467,
Detail,CLAIM_ADJ_CODE_04,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is claim level.",Claim,Text,10,6736,6745,N,468,N,468,
Detail,CLAIM_ADJ_TYPE_04,"This field defines the source of the claim level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding CLAIM_ADJ_CODE is present.",Claim,Text,2,6746,6747,N,469,N,469,
Detail,CLAIM_ADJUSTOR_ID_04,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted. Expected if corresponding CLAIM_ADJ_CODE is present.,Claim,Text,20,6748,6767,N,470,N,470,
Detail,CLAIM_ADJ_CODE_05,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is claim level.",Claim,Text,10,6768,6777,N,471,N,471,
Detail,CLAIM_ADJ_TYPE_05,"This field defines the source of the claim level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding CLAIM_ADJ_CODE is present.",Claim,Text,2,6778,6779,N,472,N,472,
Detail,CLAIM_ADJUSTOR_ID_05,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding CLAIM_ADJ_CODE is present.,Claim,Text,20,6780,6799,N,473,N,473,
Detail,CLAIM_ADJ_CODE_06,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is claim level.",Claim,Text,10,6800,6809,N,474,N,474,
Detail,CLAIM_ADJ_TYPE_06,"This field defines the source of the claim level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding CLAIM_ADJ_CODE is present.",Claim,Text,2,6810,6811,N,475,N,475,
Detail,CLAIM_ADJUSTOR_ID_06,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted. Expected if corresponding CLAIM_ADJ_CODE is present.,Claim,Text,20,6812,6831,N,476,N,476,
Detail,CLAIM_ADJ_CODE_07,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is claim level.",Claim,Text,10,6832,6841,N,477,N,477,
Detail,CLAIM_ADJ_TYPE_07,"This field defines the source of the claim level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding CLAIM_ADJ_CODE is present.",Claim,Text,2,6842,6843,N,478,N,478,
Detail,CLAIM_ADJUSTOR_ID_07,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding CLAIM_ADJ_CODE is present.,Claim,Text,20,6844,6863,N,479,N,479,
Detail,CLAIM_ADJ_CODE_08,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is claim level.",Claim,Text,10,6864,6873,N,480,N,480,
Detail,CLAIM_ADJ_TYPE_08,"This field defines the source of the claim level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding CLAIM_ADJ_CODE is present.",Claim,Text,2,6874,6875,N,481,N,481,
Detail,CLAIM_ADJUSTOR_ID_08,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.   Expected if corresponding CLAIM_ADJ_CODE is present.,Claim,Text,20,6876,6895,N,482,N,482,
Detail,CLAIM_ADJ_CODE_09,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is claim level.",Claim,Text,10,6896,6905,N,483,N,483,
Detail,CLAIM_ADJ_TYPE_09,"This field defines the source of the claim level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding CLAIM_ADJ_CODE is present.",Claim,Text,2,6906,6907,N,484,N,484,
Detail,CLAIM_ADJUSTOR_ID_09,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding CLAIM_ADJ_CODE is present.,Claim,Text,20,6908,6927,N,485,N,485,
Detail,CLAIM_ADJ_CODE_10,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is claim level.",Claim,Text,10,6928,6937,N,486,N,486,
Detail,CLAIM_ADJ_TYPE_10,"This field defines the source of the claim level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding CLAIM_ADJ_CODE is present.",Claim,Text,2,6938,6939,N,487,N,487,
Detail,CLAIM_ADJUSTOR_ID_10,Client employee who actually made the claim level adjustment.  Expected if corresponding CLAIM_ADJ_CODE is present.,Claim,Text,20,6940,6959,N,488,N,488,
Detail,ANESTHESIA_TIME,This field represents the amount of time that anesthesia was administered to the patient during the service provided.  Time is submitted in whole minutes.,Line,"Numeric
9(10)",10,6960,6969,N,489,N,489,
Detail,CHECK_NUM,This field stores the actual check number on which this claim was paid. For incoming (TBA) claims the field should be left blank. The actual check number is populated in the history file.,Claim,Text,25,6970,6994,N,490,N,490,
Detail,PLATFORM_CODE,"Please provide the name of the claim system used to process the claim.  Examples are Nasco, Facets, Amysis, Power MHS, etc.",Claim,Text,20,6995,7014,N,491,N,491,
Detail,DATA_SOURCE,"The value in this field defines from where the claim data was pulled within the client’s platform. For example, if the client is a Facets client, the client platform would be Facets and the data may have been pulled from the Data Warehouse.",Claim,Text,20,7015,7034,N,492,N,492,
Detail,EMERGENCY_INDICATOR_YN,"This field defines whether or not the service being billed is related to an emergency.  Valid values are:  “Y” value indicates service provided was emergency related; an “N” value indicates service provided was not emergency related.  (2300, SV109)",Line,Text,1,7035,7035,N,493,N,493,
Detail,PAPER_INDICATOR,"Claim submission type. Valid values are:
P  -  Paper
E  -  Electronic",Claim,Text,1,7036,7036,N,494,N,494,
Detail,CIT_RESTRICTED_ID,This field is a free-form field used to define CIT restrictions that allow clients to define an appropriate level of security for internal data access. This field is not to be used until the client and Implementation Services Director determine a need.,Claim,Text,25,7037,7061,N,495,N,495,
Detail,CV_US_ONLY_YN,The value in this field indicates whether the claim has to be routed to U.S. only resources. A 'Y' value indicates the claim has to be routed to U.S. only resources.,Claim,Text,1,7062,7062,N,496,N,496,
Detail,CDF_TEXT_01,Line level client defined field.  Use of this field should be discussed to ensure proper utilization and storage prior to the addition of data in the file.  Data provided in this field will be reflected on the Invoice Detail Report (IDR).,Line,Text,32,7063,7094,N,497,N,497,
Detail,CDF_TEXT_02,Line level client defined field.  Use of this field should be discussed to ensure proper utilization and storage prior to the addition of data in the file.  Data provided in this field will be reflected on the Invoice Detail Report (IDR).,Line,Text,32,7095,7126,N,498,N,498,
Detail,CDF_TEXT_03,Line level client defined field.  Use of this field should be discussed to ensure proper utilization and storage prior to the addition of data in the file.  Data provided in this field will be reflected on the Invoice Detail Report (IDR).,Line,Text,32,7127,7158,N,499,N,499,
Detail,CLAIM_CDF_TEXT_01,Claim level client defined field.  Use of this field should be discussed to ensure proper utilization and storage prior to the addition of data in the file.,Claim,Text,32,7159,7190,N,500,N,500,
Detail,CLAIM_CDF_TEXT_02,Claim level client defined field.  Use of this field should be discussed to ensure proper utilization and storage prior to the addition of data in the file.,Claim,Text,32,7191,7222,N,501,N,501,
Detail,CLAIM_CDF_TEXT_03,Claim level client defined field.  Use of this field should be discussed to ensure proper utilization and storage prior to the addition of data in the file.,Claim,Text,32,7223,7254,N,502,N,502,
Detail,SUB_MEMBER_GROUP_NUMBER,The value in this field represents the Subscriber's group number ( 2000B.SBR03 ),Claim,,,7255,7254,Y,503,N,503,
Detail,PROVIDER_SIGNATURE_PRESENT,The value in this field represents whether the Provider Signature is present. (2300.CLM06),Claim,,,7255,7254,Y,504,Y,504,
Detail,ASSIGNMENT_ACCEPTANCE,"The value in this field represents whether the Provider agrees to accept assignment under terms of the
payer's program, select ""Yes"" from the drop-down list. Otherwise,
select ""No."" (2300.CLM08)",Claim,,,7255,7254,Y,505,Y,505,
Detail,INFORMATION_RELEASE,"The value in this field represents whether the Patient has signed the release, allowing the sharing of the information (2300.CLM09)",Claim,,,7255,7254,Y,506,Y,506,
Detail,RENDERING_FACILITY_ NAME,The value in this field represents the Name of the Rendering Facility,Claim,,,7255,7254,Y,507,Y,507,
Detail,RENDERING_FACILITY_NPI,The value in this field represents the NPI of the Rendering Facility,Claim,,,7255,7254,Y,508,Y,508,
Detail,RENDERING_FACILITY__ ADDRESS_01,The value in this field represents the Address line 1 of the Rendering Facility,Claim,,,7255,7254,Y,509,Y,509,
Detail,RENDERING_FACILITY_ ADDRESS_02,The value in this field represents the Address line 2 of the Rendering Facility,Claim,,,7255,7254,Y,510,Y,510,
Detail,RENDERING_FACILITY_ ADDRESS_CITY,The value in this field represents the City of the Rendering Facility,Claim,,,7255,7254,Y,511,Y,511,
Detail,RENDERING_FACILITY_ ADDRESS_STATE,The value in this field represents the State of the Rendering Facility,Claim,,,7255,7254,Y,512,Y,512,
Detail,RENDERING_FACILITY_ ADDRESS_Zip + RRENDERING_FACILITY_ ADDRESS_ZIP_PLUS_FOUR,The value in this field represents the Zip code and the Zip plus code of the Rendering Facility,Claim,,,7255,7254,Y,513,Y,513,
Detail,RENDERING_FACILITY_ ADDRESS_COUNTRY,The value in this field represents the Country of the Rendering Facility,Claim,,,7255,7254,Y,514,Y,514,
Detail,REPRICER_NAME/EXTERNAL_EDITOR,The value in the field represent the Name of the Repricer or secondary Editor name,Line,,,7255,7254,Y,515,Y,515,
Detail,SUB_HCPCS_DESC,The value in this field represents the Level1 (CPT) or Level2 (HCPCS) procedure code description submitted by the provider for this service line (2400.SV101-07),Line,,,7255,7254,Y,516,Y,516,
Detail,PPO_discount,The value in the field represent the difference in the Billed and allowed amount,Line,,,7255,7254,Y,,Y,517,Zelis
Detail,PPO_ID,The value in the field represent the Benfit network name,Line,,,7255,7254,,,Y,518,Zelis
Detail,CLAIM_NUM,The value in this field represent the claim fact key or the Claim versioning number.,Claim,,,7255,7254,Y,,Y,519,
Detail,RECORD_IDENTIFIER,The value in this field represent the unique identifier of a claim record used for tracking,Claim,,,7255,7254,Y,,Y,520,
Detail,RAY_IDENTIFIER,The value in this field represent the unique identifier of a claim used for tracking even during retry the claim,Claim,,,7255,7254,Y,,Y,521,
Detail,EXECUTION_IDENTIFIER,The value in this field represent the unique identifier on a job level used for tracking,Claim,,,7255,7254,,,Y,519,Zelis
,,,,,,,,,,,,
Trailer,TRAILER_CONSTANT,Field valued with ‘TRAILER’,File,Text,7,1,7,Y,1,Y,1,
Trailer,DETAIL_COUNT,This field contains the total number of DETAIL records in the file.,File,Numeric,10,8,17,Y,2,Y,2,
Trailer,RUN_DATE,This field contains the date of the file run.,File,"Date
YYYYMMDD",8,18,25,Y,3,Y,3,
Trailer,RUN_TIME,This field contains the time of the file run.,File,Time,6,26,31,Y,4,Y,4,
Trailer,FILLER,"For Fixed Width files only. The trailer record is right-padded with spaces to equal the full length of the claim data records, taking into account the characters included in the client defined field.

The length of this field varies depending on number of characters in detail line.  The ending position will have the same ending character as the detail line.",File,Text,9168,32,9199,Y,5,Y,5,
```

## Secondary Editing OB/V26.1.0.0/EdifecsProduct_MappingSpec_OB Secondary Editing_837_DFF_to_EDI Conversion_V1.0.xlsx — Inst DFF Layout

```csv
File Component,Field Name,Field Description,Level,Type,Length,"Fixed Width
files only",,Repricer,Position,Secomdary Editing,Position,
,,,,,,From,To,,,,,
Header,STREAM_ID,The value in this field represents a short description of the client’s payer stream name under which multiple payer short files will be provided. Example [XYZ Health Plan of NY] should be represented by “XYZNY”.  This value will be assigned and provided to the client during the implementation phase.,File,Text,5,1,5,Y,1,Y,1,
Header,FILE_TYPE,"Valid values:  T or H
The file type indicates whether this file is a “to be audited” TBA File (T) or a History file (H).",File,Text,1,6,6,Y,2,Y,2,
Header,FILE_SEQ,"This field contains the sequence number of the file.  This should be a value starting at 1 for the first daily and first history files received.  Subsequent files should be incremented by 1 so that each daily file has a unique FILE_SEQ number and then each history file has a unique FILE_SEQ number.  This sequence number will be used during file processing to confirm that the same file sequence number has not previously been loaded into the database.  It is important to note that the file sequence in the file name only increments for multiple files sent in the same day and will always reset to 1 for each new day.

Note: There is a separate file sequence for initial history files loaded prior to going live.  The sequence for ongoing history files should be reset to start at 1 after completion of the initial history load.",File,Numeric,7,7,13,Y,3,Y,3,
Header,PRODUCED_DATE,This field contains the date the file was generated by the client. Date should be in CCYYMMDD format in all places,File,"Date
YYYYMMDD",8,14,21,Y,4,Y,4,
Header,RECORD_COUNT,This field contains the total number of DETAIL records in the file.,File,Numeric,10,22,31,Y,5,Y,5,
Header,FILE_INDICATOR,"Valid values:  'R' (retro) or 'P' (pre-pay.)
The file indicator identifies whether this file is a Retro (R) or a Pre-Pay (P) file. Use Pre-Pay (P) for prospective TBA claim extracts (claims prior to payment).  Use Retro (R) for retrospective paid claim TBA files.  Use 'R' for all History Extract files.",File,Text,1,32,32,Y,6,Y,6,
Header,FILLER,"For Fixed Width files only. The header record is right-padded with spaces to equal the full length of the claim data records, taking into account the characters included in the client defined field.",File,Text,7220,33,7252,Y,7,Y,7,
,,,,,,,,,,,,
Detail,TAG_VALUE_PREFIX,The value in this field represents the Tag value of the claim which falls on the prefix on each claim split. Record 0001 – should be prefixed on each claim and Record 0002 should be prefixed on all the lines of that claim,Claim,Numeric,4,1,5,Y,1,Y,1,
Detail,TYPE_OF_FILE,This value in the field represent whether the claim is a Institutional or Professional ( INST or PROF),Claim,Text,4,6,9,,,Y,2,
Detail,PAYER_SHORT,The value in this field represents a short description of the client’s name. Example [XYZ Health Plan of NY] should be represented by “XYZNY”.  This value will be assigned and provided to the client during the implementation phase.,Claim,Text,5,10,14,,,Y,3,
Detail,CLAIM_TYPE,"The value in this field represents the type of claim submitted for payment.  The following values are valid for this field:
     O - Outpatient facility claims
     S - Ambulatory Surgical Center claims
     I - Inpatient claims processed via Outpatient
Required for CV.",Claim,Text,1,15,15,Y,2,Y,4,
Detail,SUB_ID,"The value in this field represents the member's identification number. In many cases, each member (subscriber and dependents) are issued an ID that is unique in the client’s system. If this ID is not unique, the data in this field combined with the DEPENDENT_NUM will be used to represent a unique member.
(Subscriber:  2010BA, NM109, NM1*IL*1) (Dependent:  2010CA, NM109, NM1*QC*1)",Claim,Text,25,16,40,Y,3,Y,5,
Detail,DEPENDENT_NUM,"The value in this field represents the member’s dependent status as it relates to the insured. The value in this field, combined with the SUB_ID provides a unique member identifier. This field is required only if needed to create a unique member ID.",Claim,Text,10,41,50,N,4,N,6,
Detail,PATIENT_DOB,"The value in this field represents the patient’s date of birth.  Required for CV.  (Subscriber:  2010BA, DMG02) (Patient:  2010CA, DMG02)",Claim,"Date
YYYYMMDD",8,51,58,Y,5,Y,7,
Detail,PATIENT_GENDER_ID,"The value in this field represents the patient’s gender.  Recommended values are M for Male, F for Female and U for Unknown.  Required for CV.  (Subscriber:  2010BA, DMG03)  (Patient:  2010CA, DMG03)",Claim,Text,10,59,68,Y,6,Y,8,
Detail,PATIENT_SSN,The value in this field represents the patient’s social security number.,Claim,Text,9,69,77,N,7,N,9,
Detail,SUB_MEDICARE_ID,"This field represents the subscriber's Medicare ID and should include the trailing alpha character.  The patient's Medicare number would be provided in the PATIENT_ID field.  If the subscriber is the patient, the value in both fields would be the same.",Claim,Text,25,78,102,N,8,N,10,
Detail,MEDICAID_ID,This field represents the patient's unique Medicaid ID as assigned by the State in which they are covered.,Claim,Text,25,103,127,N,9,N,11,
Detail,PATIENT_ID,"The value in this field represents an alternate patient identification number, not otherwise specified in the layout. Required for CV.",Claim,Text,20,128,147,N,10,N,12,
Detail,PATIENT_CONTROL_NUM,"The value in this field represents the Patient Control Number, also referred to as the Patient Account Number and is assigned by the provider or facility.  (2300, CLM01)",Claim,Text,24,148,171,Y,11,Y,13,
Detail,PATIENT_LAST_NAME,"The value in this field represents the patient’s last name. (Subscriber:  2010BA, NM103)  (Patient: 2010CA, NM103)",Claim,Text,60,172,231,Y,12,Y,14,
Detail,PATIENT_FIRST_NAME,"The value in this field represents the patient’s first name.  (Subscriber:  2010BA, NM104) (Patient: 2010CA, NM104)",Claim,Text,35,232,266,Y,13,Y,15,
Detail,PATIENT_MIDDLE_NAME,"The value in this field represents the patient's middle name.  This is required by CMS when needed to identify the individual. (Subscriber: 2010BA, NM105) (Patient: 2010CA, NM105)",Claim,Text,25,267,291,Y,14,Y,16,
Detail,PATIENT_NAME_SUFFIX,"The value in this field represents the suffix attached to the patient's name.  This is required by CMS when needed to identify the individual. (Subscriber: 2010BA, NM105) (Patient: 2010CA, NM105)",Claim,Text,10,292,301,Y,15,Y,17,
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
(Subscriber: 2000B, SBR02)  (Dependent:  2000C, PAT01)",Claim,Text,2,302,303,Y,16,Y,18,
Detail,PATIENT_DEATH_DATE,The value in this field represents the patient's date of death.,Claim,"Date
YYYYMMDD",8,304,311,N,17,N,19,
Detail,CLAIM_ID,"The value in this field represents the client’s claim identification number. This should be a claim ID that is unique in the client’s system. If this ID is not unique, please advise what other data is required to make it unique. Required for CV.",Claim,Text,25,312,336,Y,18,Y,20,
Detail,PROVIDER_CLAIM_ID,"The value in this field represents the provider’s claim identification number. This should be a claim ID that is unique in the provider’s system. If this ID is not unique, please advise what other data is required to make it unique.",Claim,Text,25,337,361,N,19,N,21,
Detail,MED_REC_NO,"The value in this field represents the Medical Record Number from the rendering provider or facility.  (2300, REF02, REF*EA)",Claim,Text,24,362,385,Y,20,Y,22,
Detail,BILL_TYPE,"The value in this field represents the Type of Bill.  This field is used to indicate the type of bill for Medicare’s billing purposes.  Any legacy 3-digit codes should have a leading 0 added to make up the 4 character value. (2300, CLM05-1) Required for CV.",Claim,Text,4,386,389,Y,21,Y,23,
Detail,CONDITION_CODE_01,"The value in this field represents the Condition Code used to indicate the patient’s eligibility, benefits and how to administer the primary and secondary insurances.  (2300, HI01-2, HI*BG)",Claim,Text,2,390,391,Y,22,Y,24,
Detail,CONDITION_CODE_02,"The value in this field represents the Condition Code used to indicate the patient’s eligibility, benefits and how to administer the primary and secondary insurances.  (2300, HI02-2, HI*BG)",Claim,Text,2,392,393,Y,23,Y,25,
Detail,CONDITION_CODE_03,"The value in this field represents the Condition Code used to indicate the patient’s eligibility, benefits and how to administer the primary and secondary insurances.  (2300, HI03-2, HI*BG)",Claim,Text,2,394,395,Y,24,Y,26,
Detail,CONDITION_CODE_04,"The value in this field represents the Condition Code used to indicate the patient’s eligibility, benefits and how to administer the primary and secondary insurances.  (2300, HI04-2, HI*BG)",Claim,Text,2,396,397,Y,25,Y,27,
Detail,CONDITION_CODE_05,"The value in this field represents the Condition Code used to indicate the patient’s eligibility, benefits and how to administer the primary and secondary insurances.  (2300, HI05-2, HI*BG)",Claim,Text,2,398,399,Y,26,Y,28,
Detail,CONDITION_CODE_06,"The value in this field represents the Condition Code used to indicate the patient’s eligibility, benefits and how to administer the primary and secondary insurances.  (2300, HI06-2, HI*BG)",Claim,Text,2,400,401,Y,27,Y,29,
Detail,CONDITION_CODE_07,"The value in this field represents the Condition Code used to indicate the patient’s eligibility, benefits and how to administer the primary and secondary insurances.  (2300, H107-2, HI*BG)",Claim,Text,2,402,403,Y,28,Y,30,
Detail,CONDITION_CODE_08,"The value in this field represents the Condition Code used to indicate the patient’s eligibility, benefits and how to administer the primary and secondary insurances.  (2300, HI08-2, HI*BG)",Claim,Text,2,404,405,Y,29,Y,31,
Detail,CONDITION_CODE_09,"The value in this field represents the Condition Code used to indicate the patient’s eligibility, benefits and how to administer the primary and secondary insurances.  (2300, HI09-2, HI*BG)",Claim,Text,2,406,407,Y,30,Y,32,
Detail,CONDITION_CODE_10,"The value in this field represents the Condition Code used to indicate the patient’s eligibility, benefits and how to administer the primary and secondary insurances.  (2300, HI10-2, HI*BG)",Claim,Text,2,408,409,Y,31,Y,33,
Detail,CONDITION_CODE_11,"The value in this field represents the Condition Code used to indicate the patient’s eligibility, benefits and how to administer the primary and secondary insurances.  (2300, HI11-2, HI*BG)",Claim,Text,2,410,411,Y,32,Y,34,
Detail,CONDITION_CODE_12,"The value in this field represents the Condition Code used to indicate the patient’s eligibility, benefits and how to administer the primary and secondary insurances.  (2300, HI12-2, HI*BG)",Claim,Text,2,412,413,Y,33,Y,35,
Detail,CONDITION_CODE_13,"The value in this field represents the Condition Code used to indicate the patient’s eligibility, benefits and how to administer the primary and secondary insurances.  (2300, HI*BG Segment Repeat)",Claim,Text,2,414,415,Y,34,Y,36,
Detail,CONDITION_CODE_14,"The value in this field represents the Condition Code used to indicate the patient’s eligibility, benefits and how to administer the primary and secondary insurances.  (2300, HI*BG Segment Repeat)",Claim,Text,2,416,417,Y,35,Y,37,
Detail,CONDITION_CODE_15,"The value in this field represents the Condition Code used to indicate the patient’s eligibility, benefits and how to administer the primary and secondary insurances.  (2300, HI*BG Segment Repeat)",Claim,Text,2,418,419,Y,36,Y,38,
Detail,CONDITION_CODE_16,"The value in this field represents the Condition Code used to indicate the patient’s eligibility, benefits and how to administer the primary and secondary insurances.  (2300, HI*BG Segment Repeat)",Claim,Text,2,420,421,Y,37,Y,39,
Detail,CONDITION_CODE_17,"The value in this field represents the Condition Code used to indicate the patient’s eligibility, benefits and how to administer the primary and secondary insurances.  (2300, HI*BG Segment Repeat)",Claim,Text,2,422,423,Y,38,Y,40,
Detail,CONDITION_CODE_18,"The value in this field represents the Condition Code used to indicate the patient’s eligibility, benefits and how to administer the primary and secondary insurances.  (2300, HI*BG Segment Repeat)",Claim,Text,2,424,425,Y,39,Y,41,
Detail,CONDITION_CODE_19,"The value in this field represents the Condition Code used to indicate the patient’s eligibility, benefits and how to administer the primary and secondary insurances.  (2300, HI*BG Segment Repeat)",Claim,Text,2,426,427,Y,40,Y,42,
Detail,CONDITION_CODE_20,"The value in this field represents the Condition Code used to indicate the patient’s eligibility, benefits and how to administer the primary and secondary insurances.  (2300, HI*BG Segment Repeat)",Claim,Text,2,428,429,Y,41,Y,43,
Detail,CONDITION_CODE_21,"The value in this field represents the Condition Code used to indicate the patient’s eligibility, benefits and how to administer the primary and secondary insurances.  (2300, HI*BG Segment Repeat)",Claim,Text,2,430,431,Y,42,Y,44,
Detail,CONDITION_CODE_22,"The value in this field represents the Condition Code used to indicate the patient’s eligibility, benefits and how to administer the primary and secondary insurances.  (2300, HI*BG Segment Repeat)",Claim,Text,2,432,433,Y,43,Y,45,
Detail,CONDITION_CODE_23,"The value in this field represents the Condition Code used to indicate the patient’s eligibility, benefits and how to administer the primary and secondary insurances.  (2300, HI*BG Segment Repeat)",Claim,Text,2,434,435,Y,44,Y,46,
Detail,CONDITION_CODE_24,"The value in this field represents the Condition Code used to indicate the patient’s eligibility, benefits and how to administer the primary and secondary insurances.  (2300, HI*BG Segment Repeat)",Claim,Text,2,436,437,Y,45,Y,47,
Detail,VALUE_CODE_01,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI01-2, HI*BE)",Claim,Text,2,438,439,Y,46,Y,48,
Detail,VALUE_AMOUNT_01,"The value in this field represents the Value Amount that includes monetary data necessary for processing the claim.  (2300, HI01-2, HI*BE)",Claim,Numeric 9(8)V99,10,440,449,Y,47,Y,49,
Detail,VALUE_CODE_02,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI02-2, HI*BE)",Claim,Text,2,450,451,Y,48,Y,50,
Detail,VALUE_AMOUNT_02,"The value in this field represents the Value Amount that includes monetary data necessary for processing the claim.  (2300, HI02-2, HI*BE)",Claim,Numeric 9(8)V99,10,452,461,Y,49,Y,51,
Detail,VALUE_CODE_03,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI03-2, HI*BE)",Claim,Text,2,462,463,Y,50,Y,52,
Detail,VALUE_AMOUNT_03,"The value in this field represents the Value Amount that includes monetary data necessary for processing the claim.  (2300, HI03-2, HI*BE)",Claim,Numeric 9(8)V99,10,464,473,Y,51,Y,53,
Detail,VALUE_CODE_04,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI04-2, HI*BE)",Claim,Text,2,474,475,Y,52,Y,54,
Detail,VALUE_AMOUNT_04,"The value in this field represents the Value Amount that includes monetary data necessary for processing the claim.  (2300, HI04-2, HI*BE)",Claim,Numeric 9(8)V99,10,476,485,Y,53,Y,55,
Detail,VALUE_CODE_05,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI05-2, HI*BE)",Claim,Text,2,486,487,Y,54,Y,56,
Detail,VALUE_AMOUNT_05,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI05-2, HI*BE)",Claim,Numeric 9(8)V99,10,488,497,Y,55,Y,57,
Detail,VALUE_CODE_06,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI06-2, HI*BE)",Claim,Text,2,498,499,Y,56,Y,58,
Detail,VALUE_AMOUNT_06,"The value in this field represents the Value Amount that includes monetary data necessary for processing the claim.  (2300, HI06-2, HI*BE)",Claim,Numeric 9(8)V99,10,500,509,Y,57,Y,59,
Detail,VALUE_CODE_07,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI07-2, HI*BE)",Claim,Text,2,510,511,Y,58,Y,60,
Detail,VALUE_AMOUNT_07,"The value in this field represents the Value Amount that includes monetary data necessary for processing the claim.  (2300, HI07-2, HI*BE)",Claim,Numeric 9(8)V99,10,512,521,Y,59,Y,61,
Detail,VALUE_CODE_08,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI08-2, HI*BE)",Claim,Text,2,522,523,Y,60,Y,62,
Detail,VALUE_AMOUNT_08,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI08-2, HI*BE)",Claim,Numeric 9(8)V99,10,524,533,Y,61,Y,63,
Detail,VALUE_CODE_09,"The value in this field represents the Value Amount that includes monetary data necessary for processing the claim.  (2300, HI09-2, HI*BE)",Claim,Text,2,534,535,Y,62,Y,64,
Detail,VALUE_AMOUNT_09,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI09-2, HI*BE)",Claim,Numeric 9(8)V99,10,536,545,Y,63,Y,65,
Detail,VALUE_CODE_10,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI10-2, HI*BE)",Claim,Text,2,546,547,Y,64,Y,66,
Detail,VALUE_AMOUNT_10,"The value in this field represents the Value Amount that includes monetary data necessary for processing the claim.  (2300, HI10-2, HI*BE)",Claim,Numeric 9(8)V99,10,548,557,Y,65,Y,67,
Detail,VALUE_CODE_11,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI11-2, HI*BE)",Claim,Text,2,558,559,Y,66,Y,68,
Detail,VALUE_AMOUNT_11,"The value in this field represents the Value Amount that includes monetary data necessary for processing the claim.  (2300, HI11-2, HI*BE)",Claim,Numeric 9(8)V99,10,560,569,Y,67,Y,69,
Detail,VALUE_CODE_12,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI12-2, HI*BE)",Claim,Text,2,570,571,Y,68,Y,70,
Detail,VALUE_AMOUNT_12,"The value in this field represents the Value Amount that includes monetary data necessary for processing the claim.  (2300, HI12-2, HI*BE)",Claim,Numeric 9(8)V99,10,572,581,Y,69,Y,71,
Detail,VALUE_CODE_13,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI*BE Segment Repeat)",Claim,Text,2,582,583,Y,70,Y,72,
Detail,VALUE_AMOUNT_13,"The value in this field represents the Value Amount that includes monetary data necessary for processing the claim.  (2300, HI*BE Segment Repeat)",Claim,Numeric 9(8)V99,10,584,593,Y,71,Y,73,
Detail,VALUE_CODE_14,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI*BE Segment Repeat)",Claim,Text,2,594,595,Y,72,Y,74,
Detail,VALUE_AMOUNT_14,"The value in this field represents the Value Amount that includes monetary data necessary for processing the claim.  (2300, HI*BE Segment Repeat)",Claim,Numeric 9(8)V99,10,596,605,Y,73,Y,75,
Detail,VALUE_CODE_15,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI*BE Segment Repeat)",Claim,Text,2,606,607,Y,74,Y,76,
Detail,VALUE_AMOUNT_15,"The value in this field represents the Value Amount that includes monetary data necessary for processing the claim.  (2300, HI*BE Segment Repeat)",Claim,Numeric 9(8)V99,10,608,617,Y,75,Y,77,
Detail,VALUE_CODE_16,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI*BE Segment Repeat)",Claim,Text,2,618,619,Y,76,Y,78,
Detail,VALUE_AMOUNT_16,"The value in this field represents the Value Amount that includes monetary data necessary for processing the claim.  (2300, HI*BE Segment Repeat)",Claim,Numeric 9(8)V99,10,620,629,Y,77,Y,79,
Detail,VALUE_CODE_17,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI*BE Segment Repeat)",Claim,Text,2,630,631,Y,78,Y,80,
Detail,VALUE_AMOUNT_17,"The value in this field represents the Value Amount that includes monetary data necessary for processing the claim.  (2300, HI*BE Segment Repeat)",Claim,Numeric 9(8)V99,10,632,641,Y,79,Y,81,
Detail,VALUE_CODE_18,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI*BE Segment Repeat)",Claim,Text,2,642,643,Y,80,Y,82,
Detail,VALUE_AMOUNT_18,"The value in this field represents the Value Amount that includes monetary data necessary for processing the claim.  (2300, HI*BE Segment Repeat)",Claim,Numeric 9(8)V99,10,644,653,Y,81,Y,83,
Detail,VALUE_CODE_19,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI*BE Segment Repeat)",Claim,Text,2,654,655,Y,82,Y,84,
Detail,VALUE_AMOUNT_19,"The value in this field represents the Value Amount that includes monetary data necessary for processing the claim.  (2300, HI*BE Segment Repeat)",Claim,Numeric 9(8)V99,10,656,665,Y,83,Y,85,
Detail,VALUE_CODE_20,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI*BE Segment Repeat)",Claim,Text,2,666,667,Y,84,Y,86,
Detail,VALUE_AMOUNT_20,"The value in this field represents the Value Amount that includes monetary data necessary for processing the claim.  (2300, HI*BE Segment Repeat)",Claim,Numeric 9(8)V99,10,668,677,Y,85,Y,87,
Detail,VALUE_CODE_21,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI*BE Segment Repeat)",Claim,Text,2,678,679,Y,86,Y,88,
Detail,VALUE_AMOUNT_21,"The value in this field represents the Value Amount that includes monetary data necessary for processing the claim.  (2300, HI*BE Segment Repeat)",Claim,Numeric 9(8)V99,10,680,689,Y,87,Y,89,
Detail,VALUE_CODE_22,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI*BE Segment Repeat)",Claim,Text,2,690,691,Y,88,Y,90,
Detail,VALUE_AMOUNT_22,"The value in this field represents the Value Amount that includes monetary data necessary for processing the claim.  (2300, HI*BE Segment Repeat)",Claim,Numeric 9(8)V99,10,692,701,Y,89,Y,91,
Detail,VALUE_CODE_23,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI*BE Segment Repeat)",Claim,Text,2,702,703,Y,90,Y,92,
Detail,VALUE_AMOUNT_23,"The value in this field represents the Value Amount that includes monetary data necessary for processing the claim.  (2300, HI*BE Segment Repeat)",Claim,Numeric 9(8)V99,10,704,713,Y,91,Y,93,
Detail,VALUE_CODE_24,"The value in this field represents the Value Code related to monetary data necessary for processing the claim.  (2300, HI*BE Segment Repeat)",Claim,Text,2,714,715,Y,92,Y,94,
Detail,VALUE_AMOUNT_24,"The value in this field represents the Value Amount that includes monetary data necessary for processing the claim.  (2300, HI*BE Segment Repeat)",Claim,Numeric 9(8)V99,10,716,725,Y,93,Y,95,
Detail,CLAIM_DOS_BEGIN_DATE,"The value in this field should represent the date in the Statement Covers Period From date.  (2300, DTP03, Data Element 1251)",Claim,"Date
YYYYMMDD",8,726,733,Y,94,Y,96,
Detail,CLAIM_DOS_END_DATE,"The value in this field should represent the date in the Statement Covers Period Through date.   (2300, DTP03, Data Element 1251)",Claim,"Date
YYYYMMDD",8,734,741,Y,95,Y,97,
Detail,LENGTH_OF_STAY,"The value in this field represents the length of stay (LOS), which is a term to describe the duration of a single episode of hospitalization. Inpatient days are calculated by subtracting day of admission from day of discharge.",Claim,Numeric,4,742,745,N,96,,98,
Detail,ADMIT_DATE,"The value in this field should represent the date in the Statement Covers Period From date.  Required for CV.  (2300, DTP03)",Claim,"Date
YYYYMMDD",8,746,753,Y,97,,99,
Detail,ADMIT_TIME_HH,"The value in this field represents the Admit Hour in 24-hour time.  Valid values are 00 to 23. (2300, DTP03)",Claim,"Numeric
(HH)",2,754,755,Y,98,Y,100,
Detail,ADMIT_TIME_MM,"The value in this field represents the Admit Minute.  Valid values are 00 to 59.  (2300, DTP03)",Claim,Numeric (MM),2,756,757,Y,99,Y,101,
Detail,ADMIT_TYPE,"The value in this field represents the type of admission. This field represents the primary reason for admission.  Expected values are:
1 = Emergency
2 = Urgent
3 = Elective
4 = Newborn
5 = Trauma
9 = Information Not Available
(2300, CL101)",Claim,Text,1,758,758,Y,100,Y,102,
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
(2300, CL102)",Claim,Text,1,759,759,Y,101,Y,103,
Detail,DISCHARGE_DATE,The value in this field represents the Discharge Date.,Claim,"Date
YYYYMMDD",8,760,767,N,102,N,104,
Detail,DISCHARGE_TIME_HH,"The value in this field represents the Discharge Hour in 24-hour time.  Valid values are 00 to 23.  (2300, DTP03, DTP*096)",Claim,"Numeric
(HH)",2,768,769,Y,103,Y,105,
Detail,DISCHARGE_TIME_MM,"The value in this field represents the Discharge Hour in 24-hour time.  Valid values are 00 to 23.  (2300, DTP03, DTP*096)",Claim,Numeric (MM),2,770,771,N,104,Y,106,
Detail,DISCHARGE_STATUS,The value in this field represents the discharge status of the patient.,Claim,Text,2,772,773,Y,105,Y,107,
Detail,SUB_DRG,"The value in this field represents the DRG billed by the provider.  Required when CONTRACT_TYPE_CODE = 01.  If the provider did not provide a submitted DRG, populate the submitted DRG with the allowed DRG value calculated by the payer.  (2300, HI01-2, HI*DR)",Claim,Text,5,774,778,N,106,N,108,
Detail,SUB_SEVERITY,"The value in this field represents the severity of illness (SOI) subclass submitted by the provider.  Valid values are:
1 = Minor
2 = Moderate
3 = Major
4 = Extreme
Required for claims that have APR grouper DRG codes. If the submitted DRG and severity are not available, populate the submitted DRG and submitted severity with the allowed values calculated by the payer.",Claim,Text,2,779,780,N,107,N,109,
Detail,ALLOWED_DRG,"The value in this field represents the payer’s calculated DRG.  Required when CONTRACT_TYPE_CODE = 01. If the payer does not recalculate the submitted DRG, and pays the submitted DRG, populate the allowed DRG with the submitted DRG value.",Claim,Text,5,781,785,N,108,Y,110,Zelis
Detail,ALLOWED_SEVERITY,"The value in this field represents the severity of illness (SOI) subclass allowed by the payer.  Valid values are:
1 = Minor
2 = Moderate
3 = Major
4 = Extreme.
Required for claims that have APR grouper DRG codes.  If the payer does not recalculate the submitted DRG and severity, and uses the submitted values, populate the allowed DRG and severity with the submitted values.",Claim,Text,2,786,787,N,109,N,111,
Detail,DRG_INLIER_AMOUNT,The value in this field represents the dollar amount associated with the inlier portion of the calculated DRG value.,Claim,Numeric 9(8)V99,10,788,797,N,110,N,112,
Detail,DRG_OUTLIER_AMOUNT,The value in this field represents the dollar amount associated with the outlier portion of the calculated DRG value.,Claim,Numeric 9(8)V99,10,798,807,N,111,Y,113,Zelis
Detail,GROUPER_ID,"The value in this field represents the DRG grouper associated with the ALLOWED_DRG field on this claim.  Client values will be determined during the implementation, and must be mapped to specific grouper values maintained by CCV.  This field provides the ability to support grouper exceptions if a provider is exempt from the standard grouper configured for this payer/line of business/state.",Claim,Text,30,808,837,N,112,N,114,
Detail,GROUPER_VERSION,The value in this field represents the grouper version that was used to determine the DRG associated with the claim.,Claim,Text,5,838,842,N,113,N,115,
Detail,APC_CODE,This field represents the Ambulatory Payment Classification (APC) code used in the client’s claim system to pay  hospital outpatient services.,Line,Numeric,4,843,846,N,114,N,116,
Detail,APC_PAYMENT_WEIGHT,The value in this field represents the relative weight associated with the submitted APC and used for calculating payment.,Line,Numeric 9(3)V9999,7,847,853,N,115,N,117,
Detail,APC_VERSION,This field represents the APC version used to acquire the relative weight used to calculate the claim payment.,Line,Text,5,854,858,N,116,N,118,
Detail,APG_CODE,This field represents the Ambulatory Patient Group (APG) used to reimburse providers for Medicaid services.,Line,Text,5,859,863,N,117,N,119,
Detail,APG_VERSION,The value in this field represents the APG version used to calculate the claim payment.,Line,Text,5,864,868,N,118,N,120,
Detail,REGULATORY_STATE,"Designates the regulatory state applicable for this claim.  This is a claim-level field.  Required for Medicaid and Commercial lines of business, based on the INSURANCE_LOB mapping.",Claim,Text,3,869,871,N,119,N,121,
Detail,PRINCIPAL_DIAGNOSIS_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes. Required for CV.  (2300, HI01-1, HI*BK or HI*ABK)",Claim,Text,1,872,872,N,120,N,122,
Detail,PRINCIPAL_DIAGNOSIS,"The value in this field represents the Principal Diagnosis which is the principal condition established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values. Required for CV.  (2300, HI01-2, HI*BK or HI*ABK)",Claim,Text,7,873,879,Y,121,Y,,
Detail,PRINCIPAL_DIAGNOSIS_POA,"The value in this field represents the Present on Admission Indicator for the Principal Diagnosis. These should be populated whenever possible.
Valid values:
Y = Yes - Present at time of admission
N = Not present at time of  admission
U = Unknown - Documentation is insufficient to determine if condition was present on admission
W = Clinically undetermined
Blank = unreported, not used, exempt from POA reporting.

Note:  Value ‘1’ was previously used to indicate exempt from POA. This is no longer supported by CMS and should be sent as blank. Inpatient Prospective Payment System (IPPS) hospitals are required to submit POA information on diagnoses for inpatient discharges on or after October 1, 2007.  (2300, HI01-9, HI*BK or HI*ABK)",Claim,Text,1,880,880,Y,122,Y,,
Detail,DIAGNOSIS_CODE_02_QUAL,"NOTE:  The Principal Diagnosis is required by CMS; however, all diagnoses submitted on the claim should be included to ensure accurate payment policy application and CV audit results.  When Diagnosis Codes 2-24 are submitted, the accompanying Qualifier must be provided for the claim to be considered.

The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.  (2300, HI01-1, HI*BF or HI*ABF)",Claim,Text,1,881,881,N,123,N,,
Detail,DIAGNOSIS_CODE_02,"The value in this field represents the Other Diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  (2300, HI01-2, HI*BF or HI*ABF)",Claim,Text,7,882,888,Y,124,Y,,
Detail,DIAGNOSIS_CODE_02_POA,"The value in this field represents the Present on Admission Indicator for DIAGNOSIS_CODE_02.  See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300, HI01-9, HI*BF or HI*ABF)",Claim,Text,1,889,889,Y,125,Y,,
Detail,DIAGNOSIS_CODE_03_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.  (2300, HI02-1, HI*BF or HI*ABF)",Claim,Text,1,890,890,N,126,N,,
Detail,DIAGNOSIS_CODE_03,"The value in this field represents the Other Diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  (2300, HI02-2, HI*BF or HI*ABF)",Claim,Text,7,891,897,Y,127,Y,,
Detail,DIAGNOSIS_CODE_03_POA,"The value in this field represents the Present on Admission Indicator for DIAGNOSIS_CODE_03.  See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300, HI02-9, HI*BF or HI*ABF)",Claim,Text,1,898,898,Y,128,Y,,
Detail,DIAGNOSIS_CODE_04_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.  (2300, HI03-1, HI*BF or HI*ABF)",Claim,Text,1,899,899,N,129,N,,
Detail,DIAGNOSIS_CODE_04,"The value in this field represents the Other Diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  (2300, HI03-2, HI*BF or HI*ABF)",Claim,Text,7,900,906,Y,130,Y,,
Detail,DIAGNOSIS_CODE_04_POA,"The value in this field represents the Present on Admission Indicator for DIAGNOSIS_CODE_04.  See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300, HI03-9, HI*BF or HI*ABF)",Claim,Text,1,907,907,Y,131,Y,,
Detail,DIAGNOSIS_CODE_05_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.  (2300, HI04-1, HI*BF or HI*ABF)",Claim,Text,1,908,908,N,132,N,,
Detail,DIAGNOSIS_CODE_05,"The value in this field represents the Other Diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  (2300, HI04-2, HI*BF or HI*ABF)",Claim,Text,7,909,915,Y,133,Y,,
Detail,DIAGNOSIS_CODE_05_POA,"The value in this field represents the Present on Admission Indicator for DIAGNOSIS_CODE_05.  See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300, HI04-9, HI*BF or HI*ABF)",Claim,Text,1,916,916,Y,134,Y,,
Detail,DIAGNOSIS_CODE_06_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.  (2300, HI05-1, HI*BF or HI*ABF)",Claim,Text,1,917,917,N,135,N,,
Detail,DIAGNOSIS_CODE_06,"The value in this field represents the Other Diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  (2300, HI05-2, HI*BF or HI*ABF)",Claim,Text,7,918,924,Y,136,Y,,
Detail,DIAGNOSIS_CODE_06_POA,"The value in this field represents the Present on Admission Indicator for DIAGNOSIS_CODE_06.   See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300, HI05-9, HI*BF or HI*ABF)",Claim,Text,1,925,925,Y,137,Y,,
Detail,DIAGNOSIS_CODE_07_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.   (2300, HI06-1, HI*BF or HI*ABF)",Claim,Text,1,926,926,N,138,N,,
Detail,DIAGNOSIS_CODE_07,"The value in this field represents the Other Diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  (2300, HI06-2, HI*BF or HI*ABF)",Claim,Text,7,927,933,Y,139,Y,,
Detail,DIAGNOSIS_CODE_07_POA,"The value in this field represents the Present on Admission Indicator for DIAGNOSIS_CODE_07.  See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300, HI06-9, HI*BF or HI*ABF)",Claim,Text,1,934,934,Y,140,Y,,
Detail,DIAGNOSIS_CODE_08_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.   (2300, HI07-1, HI*BF or HI*ABF)",Claim,Text,1,935,935,N,141,N,,
Detail,DIAGNOSIS_CODE_08,"The value in this field represents the Other Diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  (2300, HI07-2, HI*BF or HI*ABF)",Claim,Text,7,936,942,Y,142,Y,,
Detail,DIAGNOSIS_CODE_08_POA,"The value in this field represents the Present on Admission Indicator for DIAGNOSIS_CODE_08.   See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300, HI07-9, HI*BF or HI*ABF)",Claim,Text,1,943,943,Y,143,Y,,
Detail,DIAGNOSIS_CODE_09_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.   (2300, HI08-1, HI*BF or HI*ABF)",Claim,Text,1,944,944,N,144,N,,
Detail,DIAGNOSIS_CODE_09,"The value in this field represents the Other Diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  (2300, HI08-2, HI*BF or HI*ABF)",Claim,Text,7,945,951,Y,145,Y,,
Detail,DIAGNOSIS_CODE_09_POA,"The value in this field represents the Present on Admission Indicator for DIAGNOSIS_CODE_09.   See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300, HI08-9, HI*BF or HI*ABF)",Claim,Text,1,952,952,Y,146,Y,,
Detail,DIAGNOSIS_CODE_10_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.   (2300, HI09-1, HI*BF or HI*ABF)",Claim,Text,1,953,953,N,147,N,,
Detail,DIAGNOSIS_CODE_10,"The value in this field represents the Other Diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  (2300, HI09-2, HI*BF or HI*ABF)",Claim,Text,7,954,960,Y,148,Y,,
Detail,DIAGNOSIS_CODE_10_POA,"The value in this field represents the Present on Admission Indicator for DIAGNOSIS_CODE_10.  See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300, HI09-9, HI*BF or HI*ABF)",Claim,Text,1,961,961,Y,149,Y,,
Detail,DIAGNOSIS_CODE_11_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.  (2300, HI10-1, HI*BF or HI*ABF)",Claim,Text,1,962,962,N,150,N,,
Detail,DIAGNOSIS_CODE_11,"The value in this field represents the Principal Diagnosis which is the principal condition established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  (2300, HI10-2, HI*BF or HI*ABF)",Claim,Text,7,963,969,Y,151,Y,,
Detail,DIAGNOSIS_CODE_11_POA,"The value in this field represents the Present on Admission Indicator for DIAGNOSIS_CODE_11.  See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300, HI10-9, HI*BF or HI*ABF)",Claim,Text,1,970,970,Y,152,Y,,
Detail,DIAGNOSIS_CODE_12_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.   (2300, HI11-1, HI*BF or HI*ABF)",Claim,Text,1,971,971,N,153,N,,
Detail,DIAGNOSIS_CODE_12,"The value in this field represents the Other Diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  (2300, HI11-2, HI*BF or HI*ABF)",Claim,Text,7,972,978,Y,154,Y,,
Detail,DIAGNOSIS_CODE_12_POA,"The value in this field represents the Present on Admission Indicator for DIAGNOSIS_CODE_12.   See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300, HI11-9, HI*BF or HI*ABF)",Claim,Text,1,979,979,Y,155,Y,,
Detail,DIAGNOSIS_CODE_13_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.   (2300, HI12-1, HI*BF or HI*ABF)",Claim,Text,1,980,980,N,156,N,,
Detail,DIAGNOSIS_CODE_13,"The value in this field represents the Other Diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  (2300, HI12-2, HI*BF or HI*ABF)",Claim,Text,7,981,987,Y,157,Y,,
Detail,DIAGNOSIS_CODE_13_POA,"The value in this field represents the Present on Admission Indicator for DIAGNOSIS_CODE_13.   See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300, HI12-9, HI*BF or HI*ABF)",Claim,Text,1,988,988,Y,158,Y,,
Detail,DIAGNOSIS_CODE_14_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.   (2300,  HI*BF or HI*ABF Segment Repeat)",Claim,Text,1,989,989,N,159,N,,
Detail,DIAGNOSIS_CODE_14,"The value in this field represents the Other Diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  (2300, HI*BF or HI*ABF Segment Repeat)",Claim,Text,7,990,996,Y,160,Y,,
Detail,DIAGNOSIS_CODE_14_POA,"The value in this field represents the Present on Admission Indicator for DIAGNOSIS_CODE_14.    See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300,  HI*BF or HI*ABF Segment Repeat)",Claim,Text,1,997,997,Y,161,Y,,
Detail,DIAGNOSIS_CODE_15_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.   (2300,  HI*BF or HI*ABF Segment Repeat)",Claim,Text,1,998,998,N,162,N,,
Detail,DIAGNOSIS_CODE_15,"The value in this field represents the Other Diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  (2300, HI*BF or HI*ABF Segment Repeat)",Claim,Text,7,999,1005,Y,163,Y,,
Detail,DIAGNOSIS_CODE_15_POA,"The value in this field represents the Present on Admission Indicator for DIAGNOSIS_CODE_15.   See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300,  HI*BF or HI*ABF Segment Repeat)",Claim,Text,1,1006,1006,Y,164,Y,,
Detail,DIAGNOSIS_CODE_16_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.   (2300,  HI*BF or HI*ABF Segment Repeat)",Claim,Text,1,1007,1007,N,165,N,,
Detail,DIAGNOSIS_CODE_16,"The value in this field represents the Other Diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  (2300, HI*BF or HI*ABF Segment Repeat)",Claim,Text,7,1008,1014,Y,166,Y,,
Detail,DIAGNOSIS_CODE_16_POA,"The value in this field represents the Present on Admission Indicator for DIAGNOSIS_CODE_16.   See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300,  HI*BF or HI*ABF Segment Repeat)",Claim,Text,1,1015,1015,Y,167,Y,,
Detail,DIAGNOSIS_CODE_17_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.   (2300,  HI*BF or HI*ABF Segment Repeat)",Claim,Text,1,1016,1016,N,168,N,,
Detail,DIAGNOSIS_CODE_17,"The value in this field represents the Other Diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  (2300, HI*BF or HI*ABF Segment Repeat)",Claim,Text,7,1017,1023,Y,169,Y,,
Detail,DIAGNOSIS_CODE_17_POA,"The value in this field represents the Present on Admission Indicator for DIAGNOSIS_CODE_17.  See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300,  HI*BF or HI*ABF Segment Repeat)",Claim,Text,1,1024,1024,Y,170,Y,,
Detail,DIAGNOSIS_CODE_18_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.   (2300,  HI*BF or HI*ABF Segment Repeat)",Claim,Text,1,1025,1025,N,171,N,,
Detail,DIAGNOSIS_CODE_18,"The value in this field represents the Other Diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  (2300, HI*BF or HI*ABF Segment Repeat)",Claim,Text,7,1026,1032,Y,172,Y,,
Detail,DIAGNOSIS_CODE_18_POA,"The value in this field represents the Present on Admission Indicator for DIAGNOSIS_CODE_18.   See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300,  HI*BF or HI*ABF Segment Repeat)",Claim,Text,1,1033,1033,Y,173,Y,,
Detail,DIAGNOSIS_CODE_19_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.   (2300,  HI*BF or HI*ABF Segment Repeat)",Claim,Text,1,1034,1034,N,174,N,,
Detail,DIAGNOSIS_CODE_19,"The value in this field represents the Other Diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  (2300, HI*BF or HI*ABF Segment Repeat)",Claim,Text,7,1035,1041,Y,175,Y,,
Detail,DIAGNOSIS_CODE_19_POA,"The value in this field represents the Present on Admission Indicator for DIAGNOSIS_CODE_19.   See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300,  HI*BF or HI*ABF Segment Repeat)",Claim,Text,1,1042,1042,Y,176,Y,,
Detail,DIAGNOSIS_CODE_20_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.   (2300,  HI*BF or HI*ABF Segment Repeat)",Claim,Text,1,1043,1043,N,177,N,,
Detail,DIAGNOSIS_CODE_20,"The value in this field represents the Other Diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  (2300, HI*BF or HI*ABF Segment Repeat)",Claim,Text,7,1044,1050,Y,178,Y,,
Detail,DIAGNOSIS_CODE_20_POA,"The value in this field represents the Present on Admission Indicator for DIAGNOSIS_CODE_20.   See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300,  HI*BF or HI*ABF Segment Repeat)",Claim,Text,1,1051,1051,Y,179,Y,,
Detail,DIAGNOSIS_CODE_21_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.   (2300,  HI*BF or HI*ABF Segment Repeat)",Claim,Text,1,1052,1052,N,180,N,,
Detail,DIAGNOSIS_CODE_21,"The value in this field represents the Other Diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  (2300, HI*BF or HI*ABF Segment Repeat)",Claim,Text,7,1053,1059,Y,181,Y,,
Detail,DIAGNOSIS_CODE_21_POA,"The value in this field represents the Present on Admission Indicator for DIAGNOSIS_CODE_21.   See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300,  HI*BF or HI*ABF Segment Repeat)",Claim,Text,1,1060,1060,Y,182,Y,,
Detail,DIAGNOSIS_CODE_22_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.   (2300,  HI*BF or HI*ABF Segment Repeat)",Claim,Text,1,1061,1061,N,183,N,,
Detail,DIAGNOSIS_CODE_22,"The value in this field represents the Other Diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  (2300, HI*BF or HI*ABF Segment Repeat)",Claim,Text,7,1062,1068,Y,184,Y,,
Detail,DIAGNOSIS_CODE_22_POA,"The value in this field represents the Present on Admission Indicator for DIAGNOSIS_CODE_22.   See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300,  HI*BF or HI*ABF Segment Repeat)",Claim,Text,1,1069,1069,Y,185,Y,,
Detail,DIAGNOSIS_CODE_23_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.   (2300,  HI*BF or HI*ABF Segment Repeat)",Claim,Text,1,1070,1070,N,186,N,,
Detail,DIAGNOSIS_CODE_23,"The value in this field represents the Other Diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  (2300, HI*BF or HI*ABF Segment Repeat)",Claim,Text,7,1071,1077,Y,187,Y,,
Detail,DIAGNOSIS_CODE_23_POA,"The value in this field represents the Present on Admission Indicator for DIAGNOSIS_CODE_23.   See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300,  HI*BF or HI*ABF Segment Repeat)",Claim,Text,1,1078,1078,Y,188,Y,,
Detail,DIAGNOSIS_CODE_24_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.   (2300,  HI*BF or HI*ABF Segment Repeat)",Claim,Text,1,1079,1079,N,189,N,,
Detail,DIAGNOSIS_CODE_24,"The value in this field represents the Other Diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  (2300, HI*BF or HI*ABF Segment Repeat)",Claim,Text,7,1080,1086,Y,190,Y,,
Detail,DIAGNOSIS_CODE_24_POA,"The value in this field represents the Present on Admission Indicator for DIAGNOSIS_CODE_24.   See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300,  HI*BF or HI*ABF Segment Repeat)",Claim,Text,1,1087,1087,Y,191,Y,,
Detail,DIAGNOSIS_CODE_25_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.   (2300,  HI*BF or HI*ABF Segment Repeat)",Claim,Text,1,1088,1088,N,192,N,,
Detail,DIAGNOSIS_CODE_25,"The value in this field represents the Other Diagnosis established after evaluation and treatment. This field will be used for both ICD-9 and ICD-10 values.  (2300, HI*BF or HI*ABF Segment Repeat)",Claim,Text,7,1089,1095,Y,193,Y,,
Detail,DIAGNOSIS_CODE_25_POA,"The value in this field represents the Present on Admission Indicator for DIAGNOSIS_CODE_25.   See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300,  HI*BF or HI*ABF Segment Repeat)",Claim,Text,1,1096,1096,Y,194,Y,,
Detail,ADMITTING_DIAGNOSIS_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.  Required when ADMITTING_DIAGNOSIS is submitted.  (2300, HI01-1, HI*BJ or HI*ABJ)",Claim,Text,1,1097,1097,N,195,N,,
Detail,ADMITTING_DIAGNOSIS,"The value in this field represents the Admitting Diagnosis which is the reason presented for the patient to be registered at the inpatient facility.  (2300, HI01-2, HI*BJ or HI*ABJ)",Claim,Text,7,1098,1104,Y,196,Y,,
Detail,EXTERNAL_CAUSE_OF_INJURY_01_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.  (2300, HI01-1, HI*BN or HI*ABN)",Claim,Text,1,1105,1105,N,197,N,,
Detail,EXTERNAL_CAUSE_OF_INJURY_01,"The value in this field represents the External Cause of Injury Diagnosis.  Previously referred to as E_CODE_DIAGNOSIS_1.  (2300, HI01-2, HI*BN or HI*ABN)",Claim,Text,7,1106,1112,Y,198,Y,,
Detail,EXTERNAL_CAUSE_OF_INJURY_01_POA,"The value in this field represents the Present on Admission Indicator for the External Cause of Injury 1 Diagnosis.   See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300, HI01-9, HI*BN or HI*ABN)",Claim,Text,1,1113,1113,Y,199,Y,,
Detail,EXTERNAL_CAUSE_OF_INJURY_02_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.  (2300, HI02-1, HI*BN or HI*ABN)",Claim,Text,1,1114,1114,N,200,N,,
Detail,EXTERNAL_CAUSE_OF_INJURY_02,"The value in this field represents the External Cause of Injury Diagnosis.  Previously referred to as E_CODE_DIAGNOSIS_2.  (2300, HI02-2, HI*BN or HI*ABN)",Claim,Text,7,1115,1121,Y,201,Y,,
Detail,EXTERNAL_CAUSE_OF_INJURY_02_POA,"The value in this field represents the Present on Admission Indicator for the External Cause of Injury 2 Diagnosis.   See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300, HI02-9, HI*BN or HI*ABN)",Claim,Text,1,1122,1122,Y,202,Y,,
Detail,EXTERNAL_CAUSE_OF_INJURY_03_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.  (2300, HI03-1, HI*BN or HI*ABN)",Claim,Text,1,1123,1123,N,203,N,,
Detail,EXTERNAL_CAUSE_OF_INJURY_03,"The value in this field represents the External Cause of Injury Diagnosis.  Previously referred to as E_CODE_DIAGNOSIS_3.  (2300, HI03-2, HI*BN or HI*ABN)",Claim,Text,7,1124,1130,Y,204,Y,,
Detail,EXTERNAL_CAUSE_OF_INJURY_03_POA,"The value in this field represents the Present on Admission Indicator for the External Cause of Injury 3 Diagnosis.   See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300, HI03-9, HI*BN or HI*ABN)",Claim,Text,1,1131,1131,Y,205,Y,,
Detail,EXTERNAL_CAUSE_OF_INJURY_04_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.  (2300, HI04-1, HI*BN or HI*ABN)",Claim,Text,1,1132,1132,N,206,N,,
Detail,EXTERNAL_CAUSE_OF_INJURY_04,"The value in this field represents the External Cause of Injury Diagnosis.  This field was added in this version to be consistent with the CMS X12 5010 data set.  (2300, HI04-2, HI*BN or HI*ABN)",Claim,Text,7,1133,1139,Y,207,Y,,
Detail,EXTERNAL_CAUSE_OF_INJURY_04_POA,"The value in this field represents the Present on Admission Indicator for the External Cause of Injury 4 Diagnosis.   See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300, HI04-9, HI*BN or HI*ABN)",Claim,Text,1,1140,1140,Y,208,Y,,
Detail,EXTERNAL_CAUSE_OF_INJURY_05_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.  (2300, HI05-1, HI*BN or HI*ABN)",Claim,Text,1,1141,1141,N,209,N,,
Detail,EXTERNAL_CAUSE_OF_INJURY_05,"The value in this field represents the External Cause of Injury Diagnosis.  This field was added in this version to be consistent with the CMS X12 5010 data set.  (2300, HI05-2, HI*BN or HI*ABN)",Claim,Text,7,1142,1148,Y,210,Y,,
Detail,EXTERNAL_CAUSE_OF_INJURY_05_POA,"The value in this field represents the Present on Admission Indicator for the External Cause of Injury 5 Diagnosis.   See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300, HI05-9, HI*BN or HI*ABN)",Claim,Text,1,1149,1149,Y,211,Y,,
Detail,EXTERNAL_CAUSE_OF_INJURY_06_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.  (2300, HI06-1, HI*BN or HI*ABN)",Claim,Text,1,1150,1150,N,212,N,,
Detail,EXTERNAL_CAUSE_OF_INJURY_06,"The value in this field represents the External Cause of Injury Diagnosis.  This field was added in this version to be consistent with the CMS X12 5010 data set.  (2300, HI06-2, HI*BN or HI*ABN)",Claim,Text,7,1151,1157,Y,213,Y,,
Detail,EXTERNAL_CAUSE_OF_INJURY_06_POA,"The value in this field represents the Present on Admission Indicator for the External Cause of Injury 6 Diagnosis.   See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300, HI06-9, HI*BN or HI*ABN)",Claim,Text,1,1158,1158,Y,214,Y,,
Detail,EXTERNAL_CAUSE_OF_INJURY_07_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.  (2300, HI07-1, HI*BN or HI*ABN)",Claim,Text,1,1159,1159,N,215,N,,
Detail,EXTERNAL_CAUSE_OF_INJURY_07,"The value in this field represents the External Cause of Injury Diagnosis.  This field was added in this version to be consistent with the CMS X12 5010 data set.  (2300, HI07-2, HI*BN or HI*ABN)",Claim,Text,7,1160,1166,Y,216,Y,,
Detail,EXTERNAL_CAUSE_OF_INJURY_07_POA,"The value in this field represents the Present on Admission Indicator for the External Cause of Injury 7 Diagnosis.   See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300, HI07-9, HI*BN or HI*ABN)",Claim,Text,1,1167,1167,Y,217,Y,,
Detail,EXTERNAL_CAUSE_OF_INJURY_08_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.  (2300, HI08-1, HI*BN or HI*ABN)",Claim,Text,1,1168,1168,N,218,N,,
Detail,EXTERNAL_CAUSE_OF_INJURY_08,"The value in this field represents the External Cause of Injury Diagnosis.  This field was added in this version to be consistent with the CMS X12 5010 data set.  (2300, HI08-2, HI*BN or HI*ABN)",Claim,Text,7,1169,1175,Y,219,Y,,
Detail,EXTERNAL_CAUSE_OF_INJURY_08_POA,"The value in this field represents the Present on Admission Indicator for the External Cause of Injury 8 Diagnosis.   See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300, HI08-9, HI*BN or HI*ABN)",Claim,Text,1,1176,1176,Y,220,Y,,
Detail,EXTERNAL_CAUSE_OF_INJURY_09_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.  (2300, HI09-1, HI*BN or HI*ABN)",Claim,Text,1,1177,1177,N,221,N,,
Detail,EXTERNAL_CAUSE_OF_INJURY_09,"The value in this field represents the External Cause of Injury Diagnosis.  This field was added in this version to be consistent with the CMS X12 5010 data set.  (2300, HI09-2, HI*BN or HI*ABN)",Claim,Text,7,1178,1184,Y,222,Y,,
Detail,EXTERNAL_CAUSE_OF_INJURY_09_POA,"The value in this field represents the Present on Admission Indicator for the External Cause of Injury 9 Diagnosis.    See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300, HI09-9, HI*BN or HI*ABN)",Claim,Text,1,1185,1185,Y,223,Y,,
Detail,EXTERNAL_CAUSE_OF_INJURY_10_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.   (2300, HI10-1, HI*BN or HI*ABN)",Claim,Text,1,1186,1186,N,224,N,,
Detail,EXTERNAL_CAUSE_OF_INJURY_10,"The value in this field represents the External Cause of Injury Diagnosis.  This field was added in this version to be consistent with the CMS X12 5010 data set.  (2300, HI10-2, HI*BN or HI*ABN)",Claim,Text,7,1187,1193,Y,225,Y,,
Detail,EXTERNAL_CAUSE_OF_INJURY_10_POA,"The value in this field represents the Present on Admission Indicator for the External Cause of Injury 10 Diagnosis.   See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300, HI10-9, HI*BN or HI*ABN)",Claim,Text,1,1194,1194,Y,226,Y,,
Detail,EXTERNAL_CAUSE_OF_INJURY_11_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.   (2300, HI11-1, HI*BN or HI*ABN)",Claim,Text,1,1195,1195,N,227,N,,
Detail,EXTERNAL_CAUSE_OF_INJURY_11,"The value in this field represents the External Cause of Injury Diagnosis.  This field was added in this version to be consistent with the CMS X12 5010 data set.  (2300, HI11-2, HI*BN or HI*ABN)",Claim,Text,7,1196,1202,Y,228,Y,,
Detail,EXTERNAL_CAUSE_OF_INJURY_11_POA,"The value in this field represents the Present on Admission Indicator for the External Cause of Injury 11 Diagnosis.   See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300, HI11-9, HI*BN or HI*ABN)",Claim,Text,1,1203,1203,Y,229,Y,,
Detail,EXTERNAL_CAUSE_OF_INJURY_12_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.   (2300, HI12-1, HI*BN or HI*ABN)",Claim,Text,1,1204,1204,N,230,N,,
Detail,EXTERNAL_CAUSE_OF_INJURY_12,"The value in this field represents the External Cause of Injury Diagnosis.  This field was added in this version to be consistent with the CMS X12 5010 data set.  (2300, HI12-2, HI*BN or HI*ABN)",Claim,Text,7,1205,1211,Y,231,Y,,
Detail,EXTERNAL_CAUSE_OF_INJURY_12_POA,"The value in this field represents the Present on Admission Indicator for the External Cause of Injury 12 Diagnosis.  See valid values above under PRINCIPAL_DIAGNOSIS_POA.  (2300, HI12-9, HI*BN or HI*ABN)",Claim,Text,1,1212,1212,Y,232,Y,,
Detail,PATIENT_REASON_FOR_VISIT_01_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.  (2300, HI01-1, HI*PR or HI*APR)",Claim,Text,1,1213,1213,N,233,N,,
Detail,PATIENT_REASON_FOR_VISIT_01,"The value in this field represents the Patient’s Reason For Visit 1. (2300, HI01-2, HI*PR or HI*APR)",Claim,Text,7,1214,1220,Y,234,Y,,
Detail,PATIENT_REASON_FOR_VISIT_02_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.   (2300, HI02-1, HI*PR or HI*APR)",Claim,Text,1,1221,1221,N,235,N,,
Detail,PATIENT_REASON_FOR_VISIT_02,"The value in this field represents the Patient’s Reason For Visit 2.  (2300, HI02-2, HI*PR or HI*APR)",Claim,Text,7,1222,1228,Y,236,Y,,
Detail,PATIENT_REASON_FOR_VISIT_03_QUAL,"The value in this field represents a qualifier to show whether the corresponding diagnosis code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 diagnosis codes and '9' for ICD-9 diagnosis codes.   (2300, HI03-1, HI*PR or HI*APR)",Claim,Text,1,1229,1229,N,237,N,,
Detail,PATIENT_REASON_FOR_VISIT_03,"The value in this field represents the Patient’s Reason For Visit 3.  (2300, HI03-2, HI*PR or HI*APR)",Claim,Text,7,1230,1236,Y,238,Y,,
Detail,PRINCIPAL_PROCEDURE_QUAL,"The value in this field represents a qualifier to show whether the principal procedure code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 procedure codes and '9' for ICD-9 procedure codes.  (2300, HI01-1, HI*BR or HI*BBR)",Claim,Text,1,1237,1237,N,239,N,,
Detail,PRINCIPAL_PROCEDURE,"The value in this field represents the primary procedure code submitted by the provider for this claim.  (2300, HI01-2, HI*BR or HI*BBR)",Claim,Text,7,1238,1244,Y,240,Y,,
Detail,PRINCIPAL_PROCEDURE_DATE,"The value in this field represents the date of execution of the primary procedure code submitted by the provider for this claim.  (2300, HI01-4, HI*BR or HI*BBR)",Claim,"Date
YYYYMMDD",8,1245,1252,Y,241,Y,,
Detail,PROCEDURE_02_QUAL,"The value in this field represents a qualifier to show whether the additional procedure code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 procedure codes and '9' for ICD-9 procedure codes.  (2300, HI01-1, HI*BQ or HI*BBQ)",Claim,Text,1,1253,1253,N,242,N,,
Detail,PROCEDURE_02,"The value in this field represents the additional procedure code submitted by the provider for this claim.  (2300, HI01-2, HI*BQ or HI*BBQ)",Claim,Text,7,1254,1260,Y,243,Y,,
Detail,PROCEDURE_02_DATE,"The value in this field represents the date of execution of the procedure code submitted by the provider for this claim.  (2300, HI01-4, HI*BQ or HI*BBQ)",Claim,"Date
YYYYMMDD",8,1261,1268,Y,244,Y,,
Detail,PROCEDURE_03_QUAL,"The value in this field represents a qualifier to show whether the additional procedure code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 procedure codes and '9' for ICD-9 procedure codes.  (2300, HI01-1, HI*BQ or HI*BBQ)",Claim,Text,1,1269,1269,N,245,N,,
Detail,PROCEDURE_03,"The value in this field represents the additional procedure code submitted by the provider for this claim.  (2300, HI01-2, HI*BQ or HI*BBQ)",Claim,Text,7,1270,1276,Y,246,Y,,
Detail,PROCEDURE_03_DATE,"The value in this field represents the date of execution of the procedure code submitted by the provider for this claim.  (2300, HI01-4, HI*BQ or HI*BBQ)",Claim,"Date
YYYYMMDD",8,1277,1284,Y,247,Y,,
Detail,PROCEDURE_04_QUAL,"The value in this field represents a qualifier to show whether the additional procedure code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 procedure codes and '9' for ICD-9 procedure codes.  (2300, HI02-1, HI*BQ or HI*BBQ)",Claim,Text,1,1285,1285,N,248,N,,
Detail,PROCEDURE_04,"The value in this field represents the additional procedure code submitted by the provider for this claim.  (2300, HI02-2, HI*BQ or HI*BBQ)",Claim,Text,7,1286,1292,Y,249,Y,,
Detail,PROCEDURE_04_DATE,"The value in this field represents the date of execution of the procedure code submitted by the provider for this claim.  (2300, HI02-4, HI*BQ or HI*BBQ)",Claim,"Date
YYYYMMDD",8,1293,1300,Y,250,Y,,
Detail,PROCEDURE_05_QUAL,"The value in this field represents a qualifier to show whether the additional procedure code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 procedure codes and '9' for ICD-9 procedure codes.  (2300, HI03-1, HI*BQ or HI*BBQ)",Claim,Text,1,1301,1301,N,251,N,,
Detail,PROCEDURE_05,"The value in this field represents the additional procedure code submitted by the provider for this claim.  (2300, HI03-2, HI*BQ or HI*BBQ)",Claim,Text,7,1302,1308,Y,252,Y,,
Detail,PROCEDURE_05_DATE,"The value in this field represents the date of execution of the procedure code submitted by the provider for this claim.  (2300, HI03-4, HI*BQ or HI*BBQ)",Claim,"Date
YYYYMMDD",8,1309,1316,Y,253,Y,,
Detail,PROCEDURE_06_QUAL,"The value in this field represents a qualifier to show whether the additional procedure code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 procedure codes and '9' for ICD-9 procedure codes.  (2300, HI04-1, HI*BQ or HI*BBQ)",Claim,Text,1,1317,1317,N,254,N,,
Detail,PROCEDURE_06,"The value in this field represents the additional procedure code submitted by the provider for this claim.  (2300, HI04-2, HI*BQ or HI*BBQ)",Claim,Text,7,1318,1324,Y,255,Y,,
Detail,PROCEDURE_06_DATE,"The value in this field represents the date of execution of the procedure code submitted by the provider for this claim.  (2300, HI04-4, HI*BQ or HI*BBQ)",Claim,"Date
YYYYMMDD",8,1325,1332,Y,256,Y,,
Detail,PROCEDURE_07_QUAL,"The value in this field represents a qualifier to show whether the additional procedure code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 procedure codes and '9' for ICD-9 procedure codes.  (2300, HI05-1, HI*BQ or HI*BBQ)",Claim,Text,1,1333,1333,N,257,N,,
Detail,PROCEDURE_07,"The value in this field represents the additional procedure code submitted by the provider for this claim.  (2300, HI05-2, HI*BQ or HI*BBQ)",Claim,Text,7,1334,1340,Y,258,Y,,
Detail,PROCEDURE_07_DATE,"The value in this field represents the date of execution of the procedure code submitted by the provider for this claim.  (2300, HI05-4, HI*BQ or HI*BBQ)",Claim,"Date
YYYYMMDD",8,1341,1348,Y,259,Y,,
Detail,PROCEDURE_08_QUAL,"The value in this field represents a qualifier to show whether the additional procedure code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 procedure codes and '9' for ICD-9 procedure codes.  (2300, HI06-1, HI*BQ or HI*BBQ)",Claim,Text,1,1349,1349,N,260,N,,
Detail,PROCEDURE_08,"The value in this field represents the additional procedure code submitted by the provider for this claim.  (2300, HI06-2, HI*BQ or HI*BBQ)",Claim,Text,7,1350,1356,Y,261,Y,,
Detail,PROCEDURE_08_DATE,"The value in this field represents the date of execution of the procedure code submitted by the provider for this claim.  (2300, HI06-4, HI*BQ or HI*BBQ)",Claim,"Date
YYYYMMDD",8,1357,1364,Y,262,Y,,
Detail,PROCEDURE_09_QUAL,"The value in this field represents a qualifier to show whether the additional procedure code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 procedure codes and '9' for ICD-9 procedure codes.  (2300, HI07-1, HI*BQ or HI*BBQ)",Claim,Text,1,1365,1365,N,263,N,,
Detail,PROCEDURE_09,"The value in this field represents the additional procedure code submitted by the provider for this claim.  (2300, HI07-2, HI*BQ or HI*BBQ)",Claim,Text,7,1366,1372,Y,264,Y,,
Detail,PROCEDURE_09_DATE,"The value in this field represents the date of execution of the procedure code submitted by the provider for this claim.  (2300, HI07-4, HI*BQ or HI*BBQ)",Claim,"Date
YYYYMMDD",8,1373,1380,Y,265,Y,,
Detail,PROCEDURE_10_QUAL,"The value in this field represents a qualifier to show whether the additional procedure code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 procedure codes and '9' for ICD-9 procedure codes.  (2300, HI08-1, HI*BQ or HI*BBQ)",Claim,Text,1,1381,1381,N,266,N,,
Detail,PROCEDURE_10,"The value in this field represents the additional procedure code submitted by the provider for this claim.  (2300, HI08-2, HI*BQ or HI*BBQ)",Claim,Text,7,1382,1388,Y,267,Y,,
Detail,PROCEDURE_10_DATE,"The value in this field represents the date of execution of the procedure code submitted by the provider for this claim.  (2300, HI08-4, HI*BQ or HI*BBQ)",Claim,"Date
YYYYMMDD",8,1389,1396,Y,268,Y,,
Detail,PROCEDURE_11_QUAL,"The value in this field represents a qualifier to show whether the additional procedure code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 procedure codes and '9' for ICD-9 procedure codes.  (2300, HI09-1, HI*BQ or HI*BBQ)",Claim,Text,1,1397,1397,N,269,N,,
Detail,PROCEDURE_11,"The value in this field represents the additional procedure code submitted by the provider for this claim.  (2300, HI09-2, HI*BQ or HI*BBQ)",Claim,Text,7,1398,1404,Y,270,Y,,
Detail,PROCEDURE_11_DATE,"The value in this field represents the date of execution of the procedure code submitted by the provider for this claim.  (2300, HI09-4, HI*BQ or HI*BBQ)",Claim,"Date
YYYYMMDD",8,1405,1412,Y,271,Y,,
Detail,PROCEDURE_12_QUAL,"The value in this field represents a qualifier to show whether the additional procedure code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 procedure codes and '9' for ICD-9 procedure codes.  (2300, HI10-1, HI*BQ or HI*BBQ)",Claim,Text,1,1413,1413,N,272,N,,
Detail,PROCEDURE_12,"The value in this field represents the additional procedure code submitted by the provider for this claim.  (2300, HI10-2, HI*BQ or HI*BBQ)",Claim,Text,7,1414,1420,Y,273,Y,,
Detail,PROCEDURE_12_DATE,"The value in this field represents the date of execution of the procedure code submitted by the provider for this claim.  (2300, HI10-4, HI*BQ or HI*BBQ)",Claim,"Date
YYYYMMDD",8,1421,1428,Y,274,Y,,
Detail,PROCEDURE_13_QUAL,"The value in this field represents a qualifier to show whether the additional procedure code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 procedure codes and '9' for ICD-9 procedure codes.  (2300, HI11-1, HI*BQ or HI*BBQ)",Claim,Text,1,1429,1429,N,275,N,,
Detail,PROCEDURE_13,"The value in this field represents the additional procedure code submitted by the provider for this claim.  (2300, HI11-2, HI*BQ or HI*BBQ)",Claim,Text,7,1430,1436,Y,276,Y,,
Detail,PROCEDURE_13_DATE,"The value in this field represents the date of execution of the procedure code submitted by the provider for this claim.  (2300, HI11-4, HI*BQ or HI*BBQ)",Claim,"Date
YYYYMMDD",8,1437,1444,Y,277,Y,,
Detail,PROCEDURE_14_QUAL,"The value in this field represents a qualifier to show whether the additional procedure code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 procedure codes and '9' for ICD-9 procedure codes.  (2300, HI12-1, HI*BQ or HI*BBQ)",Claim,Text,1,1445,1445,N,278,N,,
Detail,PROCEDURE_14,"The value in this field represents the additional procedure code submitted by the provider for this claim.  (2300, HI12-2, HI*BQ or HI*BBQ)",Claim,Text,7,1446,1452,Y,279,Y,,
Detail,PROCEDURE_14_DATE,"The value in this field represents the date of execution of the procedure code submitted by the provider for this claim.  (2300, HI12-4, HI*BQ or HI*BBQ)",Claim,"Date
YYYYMMDD",8,1453,1460,Y,280,Y,,
Detail,PROCEDURE_15_QUAL,"The value in this field represents a qualifier to show whether the additional procedure code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 procedure codes and '9' for ICD-9 procedure codes.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,Text,1,1461,1461,N,281,N,,
Detail,PROCEDURE_15,"The value in this field represents the additional procedure code submitted by the provider for this claim.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,Text,7,1462,1468,Y,282,Y,,
Detail,PROCEDURE_15_DATE,"The value in this field represents the date of execution of the procedure code submitted by the provider for this claim.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,"Date
YYYYMMDD",8,1469,1476,Y,283,Y,,
Detail,PROCEDURE_16_QUAL,"The value in this field represents a qualifier to show whether the additional procedure code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 procedure codes and '9' for ICD-9 procedure codes.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,Text,1,1477,1477,N,284,N,,
Detail,PROCEDURE_16,"The value in this field represents the additional procedure code submitted by the provider for this claim.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,Text,7,1478,1484,Y,285,Y,,
Detail,PROCEDURE_16_DATE,"The value in this field represents the date of execution of the procedure code submitted by the provider for this claim.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,"Date
YYYYMMDD",8,1485,1492,Y,286,Y,,
Detail,PROCEDURE_17_QUAL,"The value in this field represents a qualifier to show whether the additional procedure code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 procedure codes and '9' for ICD-9 procedure codes.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,Text,1,1493,1493,N,287,N,,
Detail,PROCEDURE_17,"The value in this field represents the additional procedure code submitted by the provider for this claim.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,Text,7,1494,1500,Y,288,Y,,
Detail,PROCEDURE_17_DATE,"The value in this field represents the date of execution of the procedure code submitted by the provider for this claim.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,"Date
YYYYMMDD",8,1501,1508,Y,289,Y,,
Detail,PROCEDURE_18_QUAL,"The value in this field represents a qualifier to show whether the additional procedure code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 procedure codes and '9' for ICD-9 procedure codes.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,Text,1,1509,1509,N,290,N,,
Detail,PROCEDURE_18,"The value in this field represents the additional procedure code submitted by the provider for this claim.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,Text,7,1510,1516,Y,291,Y,,
Detail,PROCEDURE_18_DATE,"The value in this field represents the date of execution of the procedure code submitted by the provider for this claim.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,"Date
YYYYMMDD",8,1517,1524,Y,292,Y,,
Detail,PROCEDURE_19_QUAL,"The value in this field represents a qualifier to show whether the additional procedure code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 procedure codes and '9' for ICD-9 procedure codes.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,Text,1,1525,1525,N,293,N,,
Detail,PROCEDURE_19,"The value in this field represents the additional procedure code submitted by the provider for this claim.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,Text,7,1526,1532,Y,294,Y,,
Detail,PROCEDURE_19_DATE,"The value in this field represents the date of execution of the procedure code submitted by the provider for this claim.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,"Date
YYYYMMDD",8,1533,1540,Y,295,Y,,
Detail,PROCEDURE_20_QUAL,"The value in this field represents a qualifier to show whether the additional procedure code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 procedure codes and '9' for ICD-9 procedure codes.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,Text,1,1541,1541,N,296,N,,
Detail,PROCEDURE_20,"The value in this field represents the additional procedure code submitted by the provider for this claim.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,Text,7,1542,1548,Y,297,Y,,
Detail,PROCEDURE_20_DATE,"The value in this field represents the date of execution of the procedure code submitted by the provider for this claim.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,"Date
YYYYMMDD",8,1549,1556,Y,298,Y,,
Detail,PROCEDURE_21_QUAL,"The value in this field represents a qualifier to show whether the additional procedure code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 procedure codes and '9' for ICD-9 procedure codes.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,Text,1,1557,1557,N,299,N,,
Detail,PROCEDURE_21,"The value in this field represents the additional procedure code submitted by the provider for this claim.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,Text,7,1558,1564,Y,300,Y,,
Detail,PROCEDURE_21_DATE,"The value in this field represents the date of execution of the procedure code submitted by the provider for this claim.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,"Date
YYYYMMDD",8,1565,1572,Y,301,Y,,
Detail,PROCEDURE_22_QUAL,"The value in this field represents a qualifier to show whether the additional procedure code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 procedure codes and '9' for ICD-9 procedure codes.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,Text,1,1573,1573,N,302,N,,
Detail,PROCEDURE_22,"The value in this field represents the additional procedure code submitted by the provider for this claim.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,Text,7,1574,1580,Y,303,Y,,
Detail,PROCEDURE_22_DATE,"The value in this field represents the date of execution of the procedure code submitted by the provider for this claim.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,"Date
YYYYMMDD",8,1581,1588,Y,304,Y,,
Detail,PROCEDURE_23_QUAL,"The value in this field represents a qualifier to show whether the additional procedure code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 procedure codes and '9' for ICD-9 procedure codes.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,Text,1,1589,1589,N,305,N,,
Detail,PROCEDURE_23,"The value in this field represents the additional procedure code submitted by the provider for this claim.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,Text,7,1590,1596,Y,306,Y,,
Detail,PROCEDURE_23_DATE,"The value in this field represents the date of execution of the procedure code submitted by the provider for this claim.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,"Date
YYYYMMDD",8,1597,1604,Y,307,Y,,
Detail,PROCEDURE_24_QUAL,"The value in this field represents a qualifier to show whether the additional procedure code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 procedure codes and '9' for ICD-9 procedure codes.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,Text,1,1605,1605,N,308,N,,
Detail,PROCEDURE_24,"The value in this field represents the additional procedure code submitted by the provider for this claim.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,Text,7,1606,1612,Y,309,Y,,
Detail,PROCEDURE_24_DATE,"The value in this field represents the date of execution of the procedure code submitted by the provider for this claim.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,"Date
YYYYMMDD",8,1613,1620,Y,310,Y,,
Detail,PROCEDURE_25_QUAL,"The value in this field represents a qualifier to show whether the additional procedure code noted below is in ICD-9 or ICD-10 format.  Value should be '0' for ICD-10 procedure codes and '9' for ICD-9 procedure codes.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,Text,1,1621,1621,N,311,N,,
Detail,PROCEDURE_25,"The value in this field represents the additional procedure code submitted by the provider for this claim.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,Text,7,1622,1628,Y,312,Y,,
Detail,PROCEDURE_25_DATE,"The value in this field represents the date of execution of the procedure code submitted by the provider for this claim.  (2300, HI*BQ or HI*BBQ Segment Repeat)",Claim,"Date
YYYYMMDD",8,1629,1636,Y,313,Y,,
Detail,INSURANCE_LOB,"The value in this field represents the member’s line of business code. The client’s values are mapped to a table that identifies line of business. Examples are: Medicare, Medicaid, Commercial, Duals, BlueCard, etc. Required for CV.",Line,Text,15,1637,1651,N,314,N,,
Detail,INSURANCE_LOB_SUBTYPE,"This field further splits the LOB into the type of plan. Examples are: HMO, PPO, POS, EPO, etc.",Line,Text,15,1652,1666,N,315,N,,
Detail,BLUE_CARD_INDICATOR,"When INSURANCE_LOB is BlueCard, this field represents BlueCard information provided by the client. Valid values are:
0 = Non-BlueCard
1 = ITS Home
2 = ITS Host",Claim,Text,1,1667,1667,N,316,N,,
Detail,ITS_HOME_STATE,The value in this field represents the state of the plan that owns the member's coverage.,Claim,Text,2,1668,1669,N,317,N,,
Detail,ITS_HOST_STATE,The value in this field represents the state of the provider's local Blue Cross Blue Shield plan where services were rendered.,Claim,Text,2,1670,1671,N,318,N,,
Detail,ITS_SERIAL_NUM,The value in this field represents the Standard Claims Collection Facility (SCCF) number from the ITS system.  This is the unique identifier in the BlueSquared BlueCard claim processing system.,Claim,Text,20,1672,1691,N,319,N,,
Detail,MEDICARE_PROVIDER_ID,"Number that uniquely identifies a healthcare provider or facility and is used on billing forms submitted to Medicare (UPIN, OSCAR number, NSC number). It is used for pricing through FHCP.",Claim,Text,80,1692,1771,N,320,N,,
Detail,MEDICAID_PROVIDER_ID,A number that uniquely identifies a healthcare provider or facility and is used on billing forms submitted to Medicaid.,Claim,Text,80,1772,1851,N,321,N,,
Detail,RENDERING_PROVIDER_ID,"The value in this field represents the rendering provider when the Rendering Provider is different than the Attending Provider. This number is the identification number unique to the provider or facility in the client’s system. When the Rendering provider is the same as the Attending provider, please provide the Attending Provider's information here. Required for CV.  (2310D, REF02)",Claim,Text,25,1852,1876,N,322,N,,
Detail,RENDERING_TAXGROUP_ID,"The value in this field represents the rendering provider's tax identification number when it is different than the Attending provider.  When the Rendering provider is the same as the Attending provider, please provide the Attending Provider's information here. Required for CV. (2310D, REF02, REF*EI)",Claim,Text,9,1877,1885,N,323,N,,
Detail,RENDERING_NPI,"The value in this field represents the CMS National Provider Identifier (NPI) for the rendering provider when it is different than the Attending provider.  When the Rendering provider is the same as the Attending provider, please provide the Attending Provider's information here. Default to spaces if value is not available. Required for CV. (2310D, NM109)",Claim,Numeric,10,1886,1895,N,324,N,,
Detail,RENDERING_STATE_LICENSE,"The value in this field represents the Sate License number for the rendering provider providing this service when it is different than the Attending provider.  A non-zero value is required.  When the Rendering provider is the same as the Attending provider, please provide the Attending Provider's information here. (2310D, REF02)",Claim,Text,10,1896,1905,N,325,N,,
Detail,RENDERING_SPECIALTY_CODE,"The value in this field represents the specialty of the rendering provider or facility, as defined in the client's claim system.  When the Rendering provider is the same as the Attending provider, please provide the Attending Provider's information here. Required for CV.",Claim,Text,10,1906,1915,N,326,N,,
Detail,RENDERING_TAXONOMY_CODE,Industry standard taxonomy code of the rendering provider used by CMS and sourced by the National Uniform Claim Committee. A list of taxonomy codes is available via http://www.wpc-edi.com/reference/codelists/healthcare/health-care-provider-taxonomy-code-set/. Required for CV.,Claim,Text,50,1916,1965,N,327,N,,
Detail,RENDERING_ENTITY_TYPE,"Expected Values are:  'P' = Person.  (2310D, NM101)",Claim,Text,1,1966,1966,N,328,N,,
Detail,RENDERING_LAST_NAME,"The value in this field represents the rendering provider’s last name when it is different than the Attending provider.  When the Rendering provider is the same as the Attending provider, please provide the Attending Provider's information here. Required for CV. (2310D, NM103)",Claim,Text,60,1967,2026,N,329,N,,
Detail,RENDERING_FIRST_NAME,"The value in this field represents the rendering provider’s first name when it is different than the Attending provider. When the Rendering provider is the same as the Attending provider, please provide the Attending Provider's information here. Required for CV.  (2310D, NM104)",Claim,Text,35,2027,2061,N,330,N,,
Detail,RENDERING_MIDDLE_NAME,"The value in this field represents the rendering provider’s middle name when it is different than the Attending provider. (2310D, NM105)",Claim,Text,25,2062,2086,N,331,N,,
Detail,RENDERING_NAME_SUFFIX,"The value in this field represents the rendering provider's suffix, as required, when it is different than the Attending provider.  When the Rendering provider is the same as the Attending provider, please provide the Attending Provider's information here. (2310D, NM107)",Claim,Text,10,2087,2096,N,332,N,,
Detail,RENDERING_ADDRESS_01,"The value in this field represents the first line of the rendering provider's address when it is different than the Attending provider. When the Rendering provider is the same as the Attending provider, please provide the Attending Provider's information here.",Claim,Text,55,2097,2151,N,333,N,,
Detail,RENDERING_ADDRESS_02,"The value in this field represents the second line of the rendering provider's address when it is different than the Attending provider. When the Rendering provider is the same as the Attending provider, please provide the Attending Provider's information here.",Claim,Text,55,2152,2206,N,334,N,,
Detail,RENDERING_CITY,"The value in this field represents the city of the rendering provider's address when it is different than the Attending provider.  When the Rendering provider is the same as the Attending provider, please provide the Attending Provider's information here.",Claim,Text,30,2207,2236,N,335,N,,
Detail,RENDERING_STATE,"The value in this field represents the state of the rendering provider's address when it is different than the Attending provider. When the Rendering provider is the same as the Attending provider, please provide the Attending Provider's information here.   Required for CV.",Claim,Text,2,2237,2238,N,336,N,,
Detail,RENDERING_ZIP,"The value in this field represents the postal ZIP code for the rendering provider when it is different than the Attending provider.  The value is the basic five digit ZIP code. When the Rendering provider is the same as the Attending provider, please provide the Attending Provider's information here.  Required for CV.",Claim,Text,5,2239,2243,N,337,N,,
Detail,RENDERING_ZIP_PLUS_FOUR,"The value in this field represents the four digit add-on code for the expanded ZIP code.  The value is four digits. When the Rendering provider is the same as the Attending provider, please provide the Attending Provider's information here.",Claim,Text,4,2244,2247,N,338,N,,
Detail,RENDERING_COUNTRY,"The value in this field represents the country of the rendering provider's address when it is different than the Attending provider. When the Rendering provider is the same as the Attending provider, please provide the Attending Provider's information here.",Claim,Text,3,2248,2250,N,339,N,,
Detail,RENDERING_COUNTRY_SUBDIVISION,"The value in this field represents the country subdivision code for the rendering provider's address when it is different than the Attending provider.  This is only used for international addresses. When the Rendering provider is the same as the Attending provider, please provide the Attending Provider's information here.",Claim,Text,3,2251,2253,N,340,N,,
Detail,RENDERING_PHONE_COUNTRY_CODE,"This field represents the unique country code for international dialing for the rendering provider's primary phone number when it is different than the Attending provider. When the Rendering provider is the same as the Attending provider, please provide the Attending Provider's information here.",Claim,Text,5,2254,2258,N,341,N,,
Detail,RENDERING_PHONE,"The value in this field represents the rendering provider's telephone number when it is different than the Attending provider. When the Rendering provider is the same as the Attending provider, please provide the Attending Provider's information here.",Claim,Text,10,2259,2268,N,342,N,,
Detail,RENDERING_PHONE_EXT,"The value in this field represents the rendering provider's primary telephone extension when it is different than the Attending provider. When the Rendering provider is the same as the Attending provider, please provide the Attending Provider's information here.",Claim,Text,6,2269,2274,N,343,N,,
Detail,RENDERING_ALT_PHONE_COUNTRY_CODE,This field represents the unique country code for international dialing for the rendering provider's alternate phone number when it is different than the Attending provider.,Claim,Text,5,2275,2279,N,344,N,,
Detail,RENDERING_ALT_PHONE,The value in this field represents the rendering provider's alternate telephone number when it is different than the Attending provider.,Claim,Text,10,2280,2289,N,345,N,,
Detail,RENDERING_ALT_PHONE_EXT,The value in this field represents the rendering provider's alternate telephone extension when it is different than the Attending provider.,Claim,Text,6,2290,2295,N,346,N,,
Detail,RENDERING_FAX_COUNTRY_CODE,"This field represents the unique country code for international dialing for the rendering provider's fax number when it is different than the Attending provider.  When the Rendering provider is the same as the Attending provider, please provide the Attending Provider's information here.",Claim,Text,5,2296,2300,N,347,N,,
Detail,RENDERING_FAX,"The value in this field represents the rendering provider's fax number when it is different than the Attending provider.  When the Rendering provider is the same as the Attending provider, please provide the Attending Provider's information here.",Claim,Text,10,2301,2310,N,348,N,,
Detail,BILLING_PROVIDER_ID,"The value in this field represents the billing provider or facility, which is separate from where the services were rendered.  This number is the identification number unique to the provider or facility in the client’s system.  This is the same as the Billing Provider Commercial Number in the 837 transaction. Previously FACILITY_ID and the provider identifier used for processing on Institutional claims.",Claim,Text,25,2311,2335,N,349,N,,
Detail,BILLING_TAXGROUP_ID,"The value in this field represents the provider’s tax identification number. This number represents the billing provider or facility.  (2010AA, REF02)  Same as TAXGROUP_ID in previous layout versions and used for processing for Institutional claims.",Claim,Text,9,2336,2344,Y,350,Y,,
Detail,BILLING_NPI,"The value in this field represents the CMS National Provider Identifier (NPI) for the billing provider or admitting facility providing this service. For PPM, default to spaces if value is not available.   (2010AA, NM109) (Same as NPI in previous layout versions.)",Line,Numeric,10,2345,2354,Y,351,Y,,
Detail,BILLING_STATE_LICENSE,The value in this field represents the Sate License number for the billing provider or facility associated with this service.  A non-zero value is required.  This is the same as the Billing Provider Secondary Identifier in the 837 transaction.,Claim,Text,10,2355,2364,N,352,N,,
Detail,BILLING_SPECIALTY_CODE,"The value in this field represents the specialty of the billing provider or facility, as defined in the client's claim system.",Claim,Text,10,2365,2374,N,353,N,,
Detail,BILLING_TAXONOMY_CODE,Industry standard taxonomy code of the billing provider used by CMS and sourced by the National Uniform Claim Committee. A list of taxonomy codes is available via http://www.wpc-edi.com/reference/codelists/healthcare/health-care-provider-taxonomy-code-set/.,Claim,Text,50,2375,2424,N,354,N,,
Detail,BILLING_CURRENCY_CODE,"This field represents the ISO currency code for the billing provider and should correlate with the currency of the funds in which the provider is to be paid.  (2000A, CUR02)",Claim,Text,3,2425,2427,N,355,N,,
Detail,BILLING_ENTITY_TYPE,"This field defines the entity type for the billing provider.  The billing provider is required by CMS when the billing provider is different than the rendering provider.  Expected Value is 'E', Other Entity or Facility. (2010AA, NM102)",Claim,Text,1,2428,2428,N,356,N,,
Detail,BILLING_FULL_NAME,"This field represents the Billing Provider's Organizational Name.  (2010AA, NM103)",Claim,Text,255,2429,2683,Y,357,Y,,
Detail,BILLING_ADDRESS_01,"The value in this field represents the first line of the billing entity's address. The Billing Provider Address must be a street address. Post Office Box or Lock Box addresses are to be sent in the Pay-To Address fields, if necessary.

For CCV, this address will be used for provider mailings if no other address is provided during the implementation. (Loop ID-2010AB)  (2010AA, N301)",Claim,Text,255,2684,2938,Y,358,Y,,
Detail,BILLING_ADDRESS_02,"The value in this field represents the second line of the billing entity's address.

For CCV, this address will be used for provider mailings if no other address is provided during the implementation.  (2010AA, N302)",Claim,Text,255,2939,3193,Y,359,Y,,
Detail,BILLING_CITY,"The value in this field represents the city of the billing entity's address.

For CCV, this address will be used for provider mailings if no other address is provided during the implementation.  (2010AA, N401)",Claim,Text,50,3194,3243,Y,360,Y,,
Detail,BILLING_STATE,"The value in this field represents the state of the billing entity's address.

For CCV, this address will be used for provider mailings if no other address is provided during the implementation.  (2010AA, N402)",Claim,Text,2,3244,3245,Y,361,Y,,
Detail,BILLING_ZIP,"The value in this field represents the postal ZIP code for the billing entity.  The value is the basic five digit ZIP code.

For CCV, this address will be used for provider mailings if no other address is provided during the implementation.  (2010AA, N403)",Line,Text,5,3246,3250,Y,362,Y,,
Detail,BILLING_ZIP_PLUS_FOUR,"The value in this field represents the four digit add-on code for the expanded ZIP code for the billing provider.  The value is four digits.   (2010AA, N403)",Line,Text,4,3251,3254,Y,363,Y,,
Detail,BILLING_COUNTRY,"The value in this field represents the country of the billing entity's  address.  (2010AA, N404)",Claim,Text,3,3255,3257,Y,364,Y,,
Detail,BILLING_COUNTRY_SUBDIVISION,"The value in this field represents the country subdivision code for the billing entity's address.  This is only used for international addresses.(2010AA, N407)",Claim,Text,3,3258,3260,N,365,N,,
Detail,BILLING_CONTACT_NAME,"Billing Provider Contact Name (23010AA, PER02)",Claim,Text,60,3261,3320,N,366,N,,
Detail,BILLING_PHONE_COUNTRY_CODE,"This field represents the unique country code for international dialing for the billing entity's primary phone number.  (2010AA, PER segment)",Claim,Text,5,3321,3325,N,367,N,,
Detail,BILLING_PHONE,"The value in this field represents the billing entity's telephone number.   (2010AA, PER segment)",Claim,Text,10,3326,3335,N,368,N,,
Detail,BILLING_PHONE_EXT,"The value in this field represents the billing entity's primary telephone extension. (2010AA, PER segment)",Claim,Text,6,3336,3341,N,369,N,,
Detail,BILLING_ALT_PHONE_COUNTRY_CODE,"This field represents the unique country code for international dialing for the billing entity's alternate phone number. (2010AA, PER segment)",Claim,Text,5,3342,3346,N,370,N,,
Detail,BILLING_ALT_PHONE,"The value in this field represents the billing entity's alternate telephone number. (2010AA, PER segment)",Claim,Text,10,3347,3356,N,371,N,,
Detail,BILLING_ALT_PHONE_EXT,"The value in this field represents the billing entity's alternate telephone extension.(2010AA, PER segment)",Claim,Text,6,3357,3362,N,372,N,,
Detail,BILLING_FAX_COUNTRY_CODE,"This field represents the unique country code for international dialing for the billing entity's fax number. (2010AA, PER segment)",Claim,Text,5,3363,3367,N,373,N,,
Detail,BILLING_FAX,"The value in this field represents the billing entity's fax number. (2010AA, PER segment)",Claim,Text,10,3368,3377,N,374,N,,
Detail,CLIENT_CONTRACT_ID,The value in this field represents the client's contract identification number for the provider or  facility submitting the claim.,Line,Text,25,3378,3402,N,375,N,,
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
(2300, CN101)",Line,Text,2,3403,3404,N,376,N,,
Detail,CONTRACT_AMOUNT,"Contract Amount for the claim being submitted. (2300, CN102)",Line,Numeric 9(8)V99,10,3405,3414,N,377,N,,
Detail,CONTRACT_PCT,"Contract Percentage for the claim being submitted. (2300, CN103)",Line,"Numeric
9(5)V99999",10,3415,3424,N,378,N,,
Detail,CONTRACT_CODE,"Contract Code for the claim being submitted. (2300, CN104)",Line,Text,50,3425,3474,N,379,N,,
Detail,CONTRACT_TERMS_DISC_PCT,"This field represents the terms discount percentage for the claim being submitted. (2300, CN105)",Line,"Numeric
9(5)V99999",10,3475,3484,N,380,N,,
Detail,CONTRACT_VERSION_ID,"This field represents the contract version identifier for the claim being submitted. (2300, CN106)",Line,Text,30,3485,3514,N,381,N,,
Detail,LINE_SEQ,"The value in this field represents the sequential number associated to the line number on the claim. As an example: the number 0002 should be sent in this field for the second line on the claim.  Required for CV. (2400, LX01)",Line,Numeric,4,3515,3518,Y,382,Y,,
Detail,LINE_BEGIN_DOS,"The value in this field represents the date in the line level Service Date field. There must be a single line item date of service for every iteration of every revenue code on all outpatient bills. Required for CV.   (2400, DTP03, DTP*472)",Line,"Date
YYYYMMDD",8,3519,3526,Y,383,Y,,
Detail,LINE_END_DOS,"Line Date of Service. The value in this field represents the date in the line level Service Date field. Required for CV.   (2400, DTP03, DTP*472)",Line,"Date
YYYYMMDD",8,3527,3534,Y,384,Y,,
Detail,SUB_REV_CODE,"The value in this field represents the Revenue Code submitted by the provider for this service line.  (2400, SV201)",Line,Text,4,3535,3538,Y,385,Y,,
Detail,SUB_HCPCS,"The value in this field represents the Level1 (CPT) or Level2 (HCPCS) procedure code submitted by the provider for this service line.  (2400, SV202-2)",Line,Text,5,3539,3543,Y,386,Y,,
Detail,SUB_MOD_01,"The value in this field represents the first procedure code modifier billed by the provider for this service line.  (2400, SV202-3)",Line,Text,2,3544,3545,Y,387,Y,,
Detail,SUB_MOD_02,"The value in this field represents the second procedure code modifier billed by the provider for this service line.  (2400, SV202-4)",Line,Text,2,3546,3547,Y,388,Y,,
Detail,SUB_MOD_03,"The value in this field represents the third procedure code modifier billed by the provider for this service line.  (2400, SV202-5)",Line,Text,2,3548,3549,Y,389,Y,,
Detail,SUB_MOD_04,"The value in this field represents the fourth procedure code modifier billed by the provider for this service line.  (2400, SV202-6)",Line,Text,2,3550,3551,Y,390,Y,,
Detail,SUB_MOD_05,The value in this field represents the fifth procedure code modifier billed by the provider for this service line.  Note: For future use only.  Slated for upcoming version of X12 837.,Line,Text,2,3552,3553,N,391,N,,
Detail,SUB_MOD_06,The value in this field represents the sixth procedure code modifier billed by the provider for this service line.  Note: For future use only.  Slated for upcoming version of X12 837.,Line,Text,2,3554,3555,N,392,N,,
Detail,SUB_MOD_07,The value in this field represents the seventh procedure code modifier billed by the provider for this service line.  Note: For future use only.  Slated for upcoming version of X12 837.,Line,Text,2,3556,3557,N,393,N,,
Detail,SUB_MOD_08,The value in this field represents the eighth procedure code modifier billed by the provider for this service line.  Note: For future use only.  Slated for upcoming version of X12 837.,Line,Text,2,3558,3559,N,394,N,,
Detail,UNITS_TYPE,"The value in this field represents the basis for measurement for the units billed.  Expected values are:  'DA' for days, and 'UN' for units. (2400, SV204)",Line,Text,2,3560,3561,N,395,Y,,
Detail,SUB_UNITS,"The value in this field represents the Service Units billed by the provider for this service. (2400, SV205)",Line,Numeric 9(10)V999,13,3562,3574,Y,396,Y,,
Detail,SUB_AMOUNT,"The value in this field represents the line level Total Charges amount billed by the provider for this service.  Required for CV.  (2400, SV203)",Line,Numeric 9(8)V99,10,3575,3584,Y,397,Y,,
Detail,SUB_NONCOVERED_AMOUNT,"The value in this field represents the line level Non Covered Charges amount billed by the provider for this service.   (2400, SV207)",Line,Numeric 9(8)V99,10,3585,3594,N,398,N,,
Detail,SUB_NDC,"The value in this field represents the National Drug Code (NDC) submitted on the claim line. The NDC Code is to be submitted using the industry standard mask of 5-4-2 without dashes. This format pads the labeler, product, or package code segments of the NDC with leading zeroes wherever they are needed to result in a fixed length 5-4-2 configuration.  (2410, LIN03)",Line,Text,11,3595,3605,Y,399,Y,,
Detail,SUB_NDC_UNITS,"This field represents the numeric value of quantity for the drug being billed.  (2410, CTP04)",Line,Numeric 9(10)V999,13,3606,3618,Y,400,Y,,
Detail,SUB_NDC_UNITS_TYPE,"Code specifying the units in which a value is being expressed, or manner in which a measurement has been taken.  Expected values are:
'IU' to indicate International Unit
'GR' to indicate Gram
'ME' to indicate Milligram
'ML' to indicate Milliliter
'UN' to indicate Unit
(2410, CTP05)",Line,Text,2,3619,3620,Y,401,Y,,
Detail,ALLOWED_REV_CODE,The value in this field represents the revenue code allowed by the client for claim system adjudication. Required for CV.,Line,Text,4,3621,3624,N,402,N,,
Detail,ALLOWED_HCPCS,The value in this field represents the Level1 (CPT) or Level2 (HCPCS) procedure code allowed by the client for claim system adjudication. Required for CV.,Line,Text,5,3625,3629,N,403,N,,
Detail,ALLOWED_MOD_01,The value in this field represents the first procedure code modifier allowed by the client for claim system adjudication.,Line,Text,2,3630,3631,N,404,N,,
Detail,ALLOWED_MOD_02,The value in this field represents the second procedure code modifier allowed by the client for claim system adjudication.,Line,Text,2,3632,3633,N,405,N,,
Detail,ALLOWED_MOD_03,The value in this field represents the third procedure code modifier allowed by the client for claim system adjudication.,Line,Text,2,3634,3635,N,406,N,,
Detail,ALLOWED_MOD_04,The value in this field represents the fourth procedure code modifier allowed by the client for claim system adjudication.,Line,Text,2,3636,3637,N,407,N,,
Detail,ALLOWED_MOD_05,"The value in this field represents the fifth procedure code modifier allowed by the client for claim system adjudication.  Note: This field is not currently in the 837 transaction, but is planned for the next version.  If you currently store this value in your claim system, please send.",Line,Text,2,3638,3639,N,408,N,,
Detail,ALLOWED_MOD_06,"The value in this field represents the sixth procedure code modifier allowed by the client for claim system adjudication.  Note: This field is not currently in the 837 transaction, but is planned for the next version.  If you currently store this value in your claim system, please send.",Line,Text,2,3640,3641,N,409,N,,
Detail,ALLOWED_MOD_07,"The value in this field represents the seventh procedure code modifier allowed by the client for claim system adjudication. Note: This field is not currently in the 837 transaction, but is planned for the next version.  If you currently store this value in your claim system, please send.",Line,Text,2,3642,3643,N,410,N,,
Detail,ALLOWED_MOD_08,"The value in this field represents the eighth procedure code modifier allowed by the client for claim system adjudication. Note: This field is not currently in the 837 transaction, but is planned for the next version.  If you currently store this value in your claim system, please send.",Line,Text,2,3644,3645,N,411,N,,
Detail,ALLOWED_UNITS,The value in this field represents the number of units allowed by the client for claim system adjudication.,Line,Numeric 9(10)V999,13,3646,3658,N,412,Y,,Zelis and Multiplan
Detail,ALLOWED_AMOUNT,"The value in this field represents the allowed amount (before applying co-pay, coinsurance, deductible, cob, & other reduction) for this service. Required for CV.",Line,Numeric 9(8)V99,10,3659,3668,N,413,Y,,Zelis and Multiplan
Detail,COMPOUND_DRUG_YN,Compound drug indicator.  This field should be set to 'Y' if the prescribed drug is a compound drug.,Line,Text,1,3669,3669,N,414,N,,
Detail,ALLOWED_NDC,"The value in this field represents the National Drug Code (NDC) allowed after initial adjudication on the claim line. Required when SUB_NDC is submitted. This format pads the labeler, product, or package code segments of the NDC with leading zeroes wherever they are needed to result in a fixed length 5-4-2 configuration.",Line,Text,11,3670,3680,N,415,N,,
Detail,ALLOWED_NDC_UNITS,This field represents the numeric value of quantity for the drug allowed after initial adjudication in the client's claim system.  Required when SUB_NDC is submitted.,Line,Numeric 9(10)V999,13,3681,3693,N,416,N,,
Detail,ALLOWED_NDC_UNITS_TYPE,"This field represents the units type allowed in the client's claim system after initial adjudication.  Required when SUB_NDC is submitted. Expected values are:
'IU' to indicate International Unit
'GR' to indicate Gram
'ME' to indicate Milligram
'ML' to indicate Milliliter
'UN' to indicate Units",Line,Text,2,3694,3695,N,417,N,,
Detail,COPAY_AMOUNT,The value in this field represents the patient's co-pay amount for this service.,Line,Numeric 9(8)V99,10,3696,3705,N,418,Y,,Zelis
Detail,COINSURANCE_AMOUNT,The value in this field represents the patient's coinsurance amount for this service.,Line,Numeric 9(8)V99,10,3706,3715,N,419,Y,,Zelis
Detail,DEDUCTIBLE_AMOUNT,The value in this field represents the patient's deductible amount for this service.,Line,Numeric 9(8)V99,10,3716,3725,N,420,Y,,Zelis
Detail,COB,The value in this field represents the patient's COB amount for this service.,Line,Numeric 9(8)V99,10,3726,3735,N,421,N,,
Detail,COB_AMOUNT,The amount paid by the member's other insurance third parties on the claim line item level or the total amount saved on the claim line item because of payment made by the patient's other insurance carrier.,Line,Numeric 9(8)V99,10,3736,3745,N,422,N,,
Detail,COB_COINSURANCE_AMOUNT,The value in this field represents the calculated amount paid by the insured based on a percentage of total cost.,Line,Numeric 9(8)V99,10,3746,3755,N,423,N,,
Detail,COB_DEDUCTIBLE_AMOUNT,The value in this field represents the dollar amount the subscriber is liable for before other insurance pays for this service line item.,Line,Numeric 9(8)V99,10,3756,3765,N,424,N,,
Detail,COB_PAID_AMOUNT,The value in this field represents the other insurance payment amount applied to the service line item.,Line,Numeric 9(8)V99,10,3766,3775,N,425,N,,
Detail,COB_ALLOWED_AMOUNT,The value in this field represents the dollar allowance for a procedure or service paid by other insurance for a service line item.,Line,Numeric 9(8)V99,10,3776,3785,N,426,N,,
Detail,OTHER_REDUCTION_AMOUNT,The value in this field represents any other adjustment amounts not reflected above.,Line,Numeric 9(8)V99,10,3786,3795,N,427,N,,
Detail,PAID_AMOUNT,"The value in this field represents the paid amount (after applying copay, coinsurance, deductible, cob, & other reduction) for this service. Required for CV.",Line,Numeric 9(8)V99,10,3796,3805,N,428,N,,
Detail,PAID_DATE,"The value in this field represents the date of final adjudication or payment on preliminary analysis files or on history files.  The field can be blank for daily files since they have not been finalized, however, it should be populated from the client's system for history.  When blank, is populated with the file run date for internal use.",Line,"Date
YYYYMMDD",8,3806,3813,N,429,N,,
Detail,PAID_UNITS,The value in this field represents the number of units of service paid for each detail line. Required for CV.,Line,Numeric 9(10)V999,13,3814,3826,N,430,N,,
Detail,LINE_CAPITATION_INDICATOR,"Indicates if the claim line was paid under a capitation agreement. Valid values are:
1 = Capitated Provider
0 = Non-Capitated Provider",Line,Text,1,3827,3827,N,431,N,,
Detail,CLIENT_TYPE_OF_SERVICE_CODE,"This field holds the client's unique service type value, as defined in their claim system.",Line,Text,20,3828,3847,N,432,N,,
Detail,FEE_SERVICE_AMOUNT,"This field represents the fee schedule amount for the line level service, based on the provider's contract.  The appropriate value should be submitted if defined.  If no contractual agreement exists, this field should be left blank.",Line,Numeric 9(8)V99,10,3848,3857,N,433,N,,
Detail,PATIENT_LIABILITY_AMOUNT,This field stores the amount the patient owes on the line level service.,Line,Numeric 9(8)V99,10,3858,3867,N,434,N,,
Detail,DISALLOWED_AMOUNT,"Amount that is disallowed and will not be considered in the payment by the client, non billable to the member for the service line item.",Line,Numeric 9(8)V99,10,3868,3877,N,435,N,,
Detail,LINE_REIMBURSEMENT_TYPE,This field represents the pricing methodology used to reimburse the service line. Typically this would be an outpatient service paid at the line level.,Line,Text,20,3878,3897,N,436,N,,
Detail,ASSIGNMENT_OF_BENEFITS,"This field represents a one digit indicator to recognize if the benefits were assigned (Y or N).   (2300, CLM08)",Claim,Text,1,3898,3898,Y,437,Y,,
Detail,CLAIM_BILLED_AMOUNT,"The value in this field represents the claim header level billed amount billed by the provider for the claim.  (2300, CLM02)",Claim,Numeric 9(8)V99,10,3899,3908,Y,438,Y,,
Detail,CLAIM_NONCOVERED_AMOUNT,The value in this field represents the claim header level non covered amount billed by the provider for the claim.,Claim,Numeric 9(8)V99,10,3909,3918,N,439,Y,,Zelis
Detail,CLAIM_ALLOWED_AMOUNT,The value in this field represents the claim header level allowed amount by the client for the claim.,Claim,Numeric 9(8)V99,10,3919,3928,N,440,N,,
Detail,CLAIM_PAID_AMOUNT,"The value in this field represents the claim header level amount paid by the client for the claim.    (For pre-pay claims this is the calculated net amount to be paid, based on adjudication of the pended claim.  This amount may change after audit recommendations are applied and the claim goes through final adjudication and payment).",Claim,Numeric 9(8)V99,10,3929,3938,N,441,N,,
Detail,CLAIM_COINSURANCE_AMOUNT,The value in this field represents the total coinsurance dollar amount on a claim for which the subscriber/member is responsible - usually based on a fixed percentage specified in the health plan. Usually applies after reaching a deductible,Claim,Numeric 9(8)V99,10,3939,3948,N,442,N,,
Detail,CLAIM_COPAY_AMOUNT,The value in this field represents the total copay dollar amount that a subscriber/member pays the provider at the time of service.  Usually a fixed flat charge per visit based on subscriber health insurance plan.,Claim,Numeric 9(8)V99,10,3949,3958,N,443,N,,
Detail,CLAIM_DEDUCTIBLE_AMOUNT,The value in this field represents the total deductible dollar amount paid by the subscriber/member on a claim in order to satisfy the annual health plan deductible.,Claim,Numeric 9(8)V99,10,3959,3968,N,444,N,,
Detail,CLAIM_DISALLOWED_AMOUNT,"The value in this field represents the total amount that is disallowed and will NOT be considered in the payment by the client, non billable to the subscriber/member.",Claim,Numeric 9(8)V99,10,3969,3978,N,445,N,,
Detail,CLAIM_PATIENT_LIABILITY_AMOUNT,The value in this field represents the total patient liability amount (Coinsurance + Copay + Deductible) for a claim.,Claim,Numeric 9(8)V99,10,3979,3988,N,446,N,,
Detail,CLAIM_COB_AMOUNT,The value in this field represents the dollar allowance for a procedure or service paid for by the primary insurer.,Claim,Numeric 9(8)V99,10,3989,3998,N,447,N,,
Detail,CLAIM_COB_ALLOWED_AMOUNT,The value in this field represents the dollar allowance for a procedure or service paid by other insurance.,Claim,Numeric 9(8)V99,10,3999,4008,N,448,N,,
Detail,CLAIM_COB_COINSURANCE_AMOUNT,The value in this field represents the amount paid by the insured based on a percentage of total cost.,Claim,Numeric 9(8)V99,10,4009,4018,N,449,N,,
Detail,CLAIM_COB_PAID_AMOUNT,The value in this field represents the other insurance payment applied to the claim.,Claim,Numeric 9(8)V99,10,4019,4028,N,450,N,,
Detail,CLAIM_COB_DEDUCT_AMOUNT,The value in this field represents the dollar amount the subscriber is liable for before other insurance is paid.,Claim,Numeric 9(8)V99,10,4029,4038,N,451,N,,
Detail,PATIENT_RESP_AMOUNT,"The value in this field is the amount due by the patient.  (2300, AMT01)",Claim,Numeric 9(8)V99,10,4039,4048,N,452,N,,
Detail,CLAIM_PAID_DATE,"The value in this field represents the date of final adjudication or payment on preliminary analysis file, all history files (FILE_TYPE = H) and Inpatient retro TBA files (FILE_INDICATOR = R).  For file types where claims have not been finalized, this value is not required.  If not required, this field should be populated with the file run date.",Claim,"Date
YYYYMMDD",8,4049,4056,N,453,N,,
Detail,CLAIM_CHECK_PAID_DATE,Date of the remittance number (voucher/check number).,Claim,"Date
YYYYMMDD",8,4057,4064,N,454,N,,
Detail,PAID_TO_CODE,"Who the claim was paid out to. Valid values are: P = Provider, S = Subscriber",Claim,Text,1,4065,4065,N,455,N,,
Detail,PAYMENT_STATUS,"The value in this field indicates the Claim header level payment status of the service. Valid values are: Paid, Denied, Pending, Reversed, Adjusted
Required for CV.",Claim,Text,20,4066,4085,N,456,N,,
Detail,CLAIM_CAPITATION_INDICATOR,"Indicates if the claim was paid under a capitation agreement. Valid values are:
1 = Capitated Provider
0 = Non-Capitated Provider",Claim,Text,1,4086,4086,N,457,N,,
Detail,DRG_INDICATOR_YN,"The value in this field defines whether or not the claim is eligible to be paid  based on DRG or was paid based on a DRG. If  DRG eligible or payment was DRG based, 'Y' is to be submitted. If not, then 'N'.",Claim,Text,1,4087,4087,N,458,N,,
Detail,PRIOR_PAYMENT_AMOUNT,"The value in this field represents any prior payments.  (2320, AMT02)",Claim,Numeric 9(8)V99,10,4088,4097,N,459,N,,
Detail,CLAIM_FEE_SCHEDULE_AMOUNT,"This field stores the claim level fee schedule amount, as defined in the provider's contract.",Claim,Numeric 9(8)V99,10,4098,4107,N,460,N,,
Detail,CLAIM_FEE_SCHEDULE_CODE,Client note to indicate the type of pricing (fee schedule) used for the claim.,Claim,Text,25,4108,4132,N,461,N,,
Detail,CLAIM_REIMBURSE_TYPE_CODE,This field represents the pricing methodology used to pay the claim. Typically this would be an Inpatient service paid at the claim level.,Claim,Text,20,4133,4152,N,462,N,,
Detail,MEDICARE_SERVICE_FEE_AMOUNT,This field represents the MCA fee schedule amount.,Line,Numeric 9(8)V99,10,4153,4162,N,463,N,,
Detail,PATIENT_PLAN_CODE,This field represents the member's benefit plan code on the client's system at the time of service.,Claim,Text,20,4163,4182,N,464,N,,
Detail,PER_CASE_RATE_AMOUNT,This field represents the contractual amount associated with the Case Rate for this claim.,Claim,Numeric 9(8)V99,10,4183,4192,N,465,N,,
Detail,PER_DIEM_RATE_AMOUNT,This field represents the contractual amount associated with the Per Diem for this claim.,Claim,Numeric 9(8)V99,10,4193,4202,N,466,N,,
Detail,PER_DIEM_WEIGHTED_AMOUNT,"This field represents the per diem weight used to multiply against the base rate, as defined in the provider's contract.",Claim,Numeric 9(8)V99,10,4203,4212,N,467,N,,
Detail,WHOLE_CLAIM_PRICING_LINE_YN,The value in this field indicates whether the claim lines were bundled to pay based on whole claim pricing.,Claim,Text,1,4213,4213,N,468,N,,
Detail,OTHER_INSURANCE_INDICATOR,"Other Insurance Indicator that determines if other insurance is being used for payment on a claim. Valid values are:
0 = Other insurance did not pay on Claim
1 = Other insurance paid on Claim",Claim,Text,1,4214,4214,N,469,N,,
Detail,COORDINATED_BENEFITS_YN,The value in this field indicates if a third party payment has been made on the claim related to Coordination of Benefits (COB). A 'Y' value indicates a third party payment has been made.,Claim,Text,1,4215,4215,N,470,N,,
Detail,BYPASS_CODE,"This field supplies the client with greater control over the processing of specific claims. Should the client decide that they do not want certain claims to have logic applied for specific edit types, the bypass code can be applied on the claim line.  If bypass codes are not used by the client, the field should be defaulted to 0.",Line,Numeric,20,4216,4235,N,471,N,,
Detail,PAYER_BYPASS_CODE,The Payer Bypass allows for greater flexibility in payment policy application.  The use of this field must be discussed with the Implementation Services Director to ensure appropriateness and correct implementation.,Line,Numeric,20,4236,4255,N,472,N,,
Detail,AUDIT_BYPASS_CODE,"This field supplies the client with greater control over the processing of specific claims. Should the client decide that they do not want certain claims to have logic applied for specific selection rules, the bypass code can be applied on the claim line.  If bypass codes are not used by the client, the field should be defaulted to zeros. Applicable to Claim Type = 'D' or 'H'.",Claim,Numeric,20,4256,4275,N,473,N,,
Detail,PAR_FLAG,"The value in this field represents the status of the Provider of Service in relation to the Health Plan. Valid values are ‘Y’ for participating or contracted or ‘N’ for Not participating or contracted (if participating status is not available, default with ‘Y’). Required for CV.",Line,Text,1,4276,4276,N,474,N,,
Detail,EDIT_0_ALLOWED_YN,"As a default, $0 allowed lines are not considered for editing purposes.  This flag can be used to override this filter and consider a line with a $0 allowed amount for editing in TBA and use as historical reference for future editing.  Valid Values are:
Null – lines with a zero allowed amount reflecting a denial (default)
N –  zero charge and allowed lines that should not be considered for editing (default)
Y – zero charge and allowed lines that should be considered for editing (override)",Line,Text,1,4277,4277,N,475,N,,
Detail,ZERO_CHG_LINE_SEQ,"This field identifies the “rolled to” line that contains applicable charges for zero charge surgery lines.  If a zero charge line is edited, a payment variance will be calculated and invoiced to the “rolled to” line on this claims as indicated by this line sequence.",Line,Numeric,4,4278,4281,N,476,N,,
Detail,ZERO_CHG_SCHED_AMOUNT,This field contains the fee schedule amount for a zero charge surgery line.  This amount will be utilized for estimation and overlook reporting.,Line,Numeric 9(8)V99,10,4282,4291,N,477,N,,
Detail,DATE_RECEIVED_CLIENT,The value in this field represents the date the claim was received by the client. This field is required if Timely Filing Policies are being applied. Required for CV.,Claim,"Date
YYYYMMDD",8,4292,4299,N,478,N,,
Detail,DATE_ADJUDICATED,The value in this field represents the date the claim was adjudicated by the client. Required for CV.,Claim,"Date
YYYYMMDD",8,4300,4307,N,479,N,,
Detail,CLAIM_APPROVED_BY,The value in this field represents the unique identifier for the person (in the client organization) who approved the claim.,Claim,Text,15,4308,4322,N,480,N,,
Detail,LETTER_PLAN_CODE,"The value in this field will be used by the letter generation module to determine which letter templates, logos and signatures should be printed. The client must provide valid values and related logos/signatures for this data element.",Claim,Text,6,4323,4328,N,481,N,,
Detail,CLAIM_ID_ORIG,"This area is for the Original Claim ID.  This would ONLY be used in the cases where Claim ID’s are changed for an adjustment and the client has the means to link the Original Claim ID to the Current Claim ID.  (2300, REF02)",Claim,Text,25,4329,4353,Y,482,Y,,
Detail,LINE_SEQ_ORIG,"The original line sequence is used to more accurately report payment variance and invoice data for edited TBA lines that are returned in history with one or multiple different line sequence numbers.  It links newly created lines back to the original line number that generated the change recommendation.  (2400, REF02)",Line,Numeric,4,4354,4357,N,483,N,,
Detail,GROUP_ID,"The value in this field represents the Employer Group Number for the patient’s claim.  This field is used for reporting purposes only.  (2000B, SBR03)",Claim,Text,15,4358,4372,N,484,N,,
Detail,GROUP_NAME,The value in this field represents the Employer Group Name for the patient's claim.,Claim,Text,60,4373,4432,N,485,N,,
Detail,RISK_POOL,"The value submitted in this field defines the risk pool associated with the group the member belongs to.  Expected value examples are; ASO, Fully Insured, Large Group Self Funded, Large Group Fully Insured, etc.  These values will be pulled from the appropriate client database for reporting purposes.",Claim,Text,60,4433,4492,N,486,N,,
Detail,CLAIM_DENIAL_REASON_CODE,"The value in this field is a claim-level reason code assigned by the client.  It represents the reason a claim was denied.  Values will be agreed to during the implementation project, if applicable.",Claim,Text,10,4493,4502,N,487,N,,
Detail,MORTALITY_RISK,"The value in this field represents the risk of mortality (ROM) subclass submitted by the provider. Valid values are:
1 = Minor
2 = Moderate
3 = Major
4 = Extreme",Claim,Text,2,4503,4504,N,488,N,,
Detail,BIRTH_WEIGHT,The value in this field represents an infant’s birth weight in grams.,Claim,Numeric,6,4505,4510,N,489,N,,
Detail,ALC_DAYS,The value in this field represents the alternative level of care (ALC) days associated with an inpatient stay.,Claim,Numeric,4,4511,4514,N,490,N,,
Detail,ALC_AMOUNT,The value in this field represents the dollar amount associated with alternative level of care (ALC) days for an inpatient stay.,Claim,Numeric 9(8)V99,10,4515,4524,N,491,N,,
Detail,PAYER_ORGANIZATION_NAME,"Payer Name associated with the Payer Short submitted on the claim. (2010BB, NM101)",Claim,Text,60,4525,4584,N,492,N,,
Detail,PAYER_ADDRESS_01,"The first line of the Payer's Address. (2010BB, N301)",Claim,Text,55,4585,4639,N,493,N,,
Detail,PAYER_ADDRESS_02,"The second line of the Payer's Address (2010BB, N302)",Claim,Text,55,4640,4694,N,494,N,,
Detail,PAYER_CITY,"Payer City Name (2010BB, N401)",Claim,Text,30,4695,4724,N,495,N,,
Detail,PAYER_STATE,"Payer State or Province Code (2010BB, N402)",Claim,Text,2,4725,4726,N,496,N,,
Detail,PAYER_ZIP,"Payer Postal Zone or ZIP Code (2010BB, N403)",Claim,Text,5,4727,4731,N,497,N,,
Detail,PAYER_ZIP_PLUS_FOUR,"Payer Postal Zone or ZIP Code  (2010BB, N403)",Claim,Text,4,4732,4735,N,498,N,,
Detail,PAYER_COUNTRY,"Country Code (2010BB, N404)",Claim,Text,3,4736,4738,N,499,N,,
Detail,PAYER_COUNTRY_SUBDIVISION,"Country Subdivision Code (2010BB, N407)",Claim,Text,3,4739,4741,N,500,N,,
Detail,SUB_CLAIM_FILING_CODE,"The claim filing indicator is a CMS value that identifies the type of insurance for the submitted claim.  This is not to be confused with the CLAIM_TYPE in this layout. Expected values are found on a separate tab. (1000B, SBR09)",Claim,Text,2,4742,4743,N,501,N,,
Detail,SUB_LAST_NAME,"The value in this field represents the subscriber’s last name and  will be the same value as submitted in PATIENT_LAST_NAME when the subscriber is the patient.  (Subscriber:  2010BA, NM103)",Claim,Text,60,4744,4803,Y,502,Y,,
Detail,SUB_FIRST_NAME,"The value in this field represents the subscriber’s first name  and  will be the same value as submitted in PATIENT_FIRST_NAME when the subscriber is the patient.   (Subscriber:  2010BA, NM104)",Claim,Text,35,4804,4838,Y,503,Y,,
Detail,SUB_MIDDLE_NAME,"The value in this field represents the subscriber's middle name  and  will be the same value as submitted in PATIENT_MIDDLE_NAME when the subscriber is the patient. This is required by CMS when needed to identify the individual. (Subscriber: 2010BA, NM105)",Claim,Text,25,4839,4863,Y,504,Y,,
Detail,SUB_NAME_SUFFIX,"The value in this field represents the suffix attached to the subscriber's name and will be the same value as submitted in PATIENT_FIRST_NAME when the subscriber is the patient.  This is required by CMS when needed to identify the individual. (Subscriber: 2010BA, NM105)",Claim,Text,10,4864,4873,Y,505,Y,,
Detail,SUB_ADDRESS_01,"The value in this field represents the first line of the subscriber's address.  This value will be the same value as submitted in PATIENT_ADDRESS_01 when the subscriber is the patient.  (2010BA, N301)",Claim,Text,55,4874,4928,Y,506,Y,,
Detail,SUB_ADDRESS_02,"The value in this field represents the second line of the subscriber's address.  This value will be the same value as submitted in PATIENT_ADDRESS_02 when the subscriber is the patient.   (2010BA, N302)",Claim,Text,55,4929,4983,Y,507,Y,,
Detail,SUB_CITY,"The value in this field represents the city of the subscriber's address. This value will be the same value as submitted in PATIENT_CITY when the subscriber is the patient.  (2010BA, N401)",Claim,Text,30,4984,5013,Y,508,Y,,
Detail,SUB_STATE,"The value in this field represents the state of the subscriber's address.  This value will be the same value as submitted in PATIENT_STATE when the subscriber is the patient.  (2010BA, N402)",Claim,Text,2,5014,5015,Y,509,Y,,
Detail,SUB_ZIP,"The value in this field represents the postal ZIP code associated with the subscriber's address.  The value is the basic five digit ZIP code and will be the same value as submitted in PATIENT_ZIP when the subscriber is the patient.    (2010BA, N403)",Claim,Text,5,5016,5020,Y,510,Y,,
Detail,SUB_ZIP_PLUS_FOUR,"The value in this field represents the four digit add-on code for the expanded ZIP code associated with the subscriber's address.  The value is four digits and will be the same value as submitted in PATIENT_ZIP_PLUS_FOUR when the subscriber is the patient.  (2010BA, N403)",Claim,Text,4,5021,5024,Y,511,Y,,
Detail,SUB_COUNTRY,"The value in this field represents the country of the subscriber's  address.  This value will be the same value as submitted in PATIENT_COUNTY when the subscriber is the patient.   (2010BA, N404)",Claim,Text,3,5025,5027,Y,512,Y,,
Detail,SUB_COUNTRY_SUBDIVISION,"The value in this field represents the country subdivision code for the subscriber's address and only used for international addresses.  This value will be the same value as submitted in PATIENT_COUNTRY_SUBDIVISION when the subscriber is the patient.  (2010BA, N404)",Claim,Text,3,5028,5030,N,513,N,,
Detail,SUB_DOB,"This field represents the subscriber’s date of birth and will be the same value as submitted in PATIENT_DOB when the subscriber is the patient.  (2010BA, DMG02)",Claim,"Date
YYYYMMDD",8,5031,5038,Y,514,Y,,
Detail,SUB_GENDER_ID,"The value in this field represents the subscriber’s gender.  This value will be the same value as submitted in PATIENT_DOB when the subscriber is the patient.  Recommended values are M for Male, F for Female and U for Unknown.  (Subscriber:  2010BA, DMG03)",Claim,Text,10,5039,5048,Y,515,Y,,
Detail,SUB_SSN,"The value in this field represents the subscriber’s social security number.  (2010BA, REF02)",Claim,Text,9,5049,5057,N,516,,,
Detail,PATIENT_ADDRESS_01,"The value in this field represents the first line of the patient's address.  This value will be the same value as submitted in SUB_ADDRESS_01 when the patient is the subscriber.  (2010BA, N301) or (2010CA, N301)",Claim,Text,55,5058,5112,Y,517,Y,,
Detail,PATIENT_ADDRESS_02,"The value in this field represents the second line of the patient's address.  This value will be the same value as submitted in SUB_ADDRESS_02 when the patient is the subscriber.  (2010BA, N302) or (2010CA, N302)",Claim,Text,55,5113,5167,Y,518,Y,,
Detail,PATIENT_CITY,"The value in this field represents the city of the patient's address. This value will be the same as SUB_CITY when the patient is the subscriber. (2010BA, N401) or (2010CA, N401)",Claim,Text,30,5168,5197,Y,519,Y,,
Detail,PATIENT_STATE,"The value in this field represents the state of the patient's address.  This value will be the same value as  submitted in SUB_STATE when the patient is the subscriber. (2010BA, N402) or  (2010CA, N402)",Claim,Text,2,5198,5199,Y,520,Y,,
Detail,PATIENT_ZIP,"The value in this field represents the postal ZIP code associated with the patient's address.  This value will be the same value as  submitted in SUB_ZIP when the patient is the subscriber. (2010BA, N403) or (2010CA, N403)",Claim,Text,5,5200,5204,Y,521,Y,,
Detail,PATIENT_ZIP_PLUS_FOUR,"The value in this field represents the four digit add-on code for the expanded ZIP code associated with the patient's address.   This value will be the same value submitted in SUB_ZIP_PLUS_FOUR when the patient is the subscriber.  (2010BA, N403) or (2010CA, N403)",Claim,Text,4,5205,5208,Y,522,Y,,
Detail,PATIENT_COUNTRY,"The value in this field represents the country of the patient's  address. This value will be the same value as  submitted in SUB_COUNTRY when the patient is the subscriber.   (2010BA, N404) or (2010CA, N404)",Claim,Text,3,5209,5211,Y,523,Y,,
Detail,PATIENT_COUNTRY_SUBDIVISION,"The value in this field represents the country subdivision code for the patient's address and only used for international addresses. his value will be the same value as  submitted in SUB_COUNTRY_SUBDIVISION when the patient is the subscriber.  (2010BA, N404) or (2010CA, N404)",Claim,Text,3,5212,5214,N,524,N,,
Detail,RETIRED_INDICATOR,The value in this field indicates whether or not the member is a retiree. Expected values are ‘Y’ for Retiree or ‘N’ for Not Retired.,Claim,Text,1,5215,5215,N,525,N,,
Detail,PAY_TO_ENTITY_TYPE,"This series of fields represent the pay-to-entity and is reported when the address for payment is different than that of the Billing Provider.  Valid Value is:  'E' = Other Entity or Facility.  CMS allows only a non-person entity for this field.  (2010AB, NM102)",Claim,Text,1,5216,5216,N,526,N,,
Detail,PAY_TO_ORGANIZATION_NAME,This field represents the organization name for the pay-to entity.,Claim,Text,60,5217,5276,N,527,N,,
Detail,PAY_TO_ADDRESS_01,"The value in this field represents the first line of the pay-to entity's address. This field only contains address information when different from the Billing Provider Address. (2010AB, NM301)",Claim,Text,55,5277,5331,Y,528,Y,,
Detail,PAY_TO_ADDRESS_02,"The value in this field represents the second line of the pay-to entity's address. This field only contains address information when different from the Billing Provider Address.  (2010AB, N302)",Claim,Text,55,5332,5386,Y,529,Y,,
Detail,PAY_TO_CITY,"The value in this field represents the city of the pay-to entity's address.  (2010AB, N401)",Claim,Text,30,5387,5416,Y,530,Y,,
Detail,PAY_TO_STATE,"The value in this field represents the state of the pay-to entity's address.  (2010AB, N402)",Claim,Text,2,5417,5418,Y,531,Y,,
Detail,PAY_TO_ZIP,"The value in this field represents the postal ZIP code for the pay-to entity.  The value is the basic five digit ZIP code.   (2010AB, N403)",Claim,Text,5,5419,5423,Y,532,Y,,
Detail,PAY_TO_ZIP_PLUS_FOUR,"The value in this field represents the four digit add-on code for the expanded ZIP code.  The value is four digits.   (2010AB, N403)",Claim,Text,4,5424,5427,Y,533,Y,,
Detail,PAY_TO_COUNTRY,"The value in this field represents the country of the pay-to entity's  address.  (2010AB, N404)",Claim,Text,3,5428,5430,Y,534,Y,,
Detail,PAY_TO_COUNTRY_SUBDIVISION,"The value in this field represents the country subdivision code for the pay-to entity's address.  This is only used for international addresses.(2010AB, N407)",Claim,Text,3,5431,5433,N,535,N,,
Detail,ATTENDING_PROVIDER_ID,"The value in this field represents the attending provider at the  facility where services are rendered.  This number is the identification number unique to the provider in the client’s system.  (2310A, REF02)",Claim,Text,25,5434,5458,N,536,N,,
Detail,ATTENDING_TAXGROUP_ID,"The value in this field represents the provider's tax identification number. This number represents the attending provider or facility.  (2310A, REF02)",Claim,Text,9,5459,5467,N,537,N,,
Detail,ATTENDING_NPI,"The value in this field represents the CMS National Provider Identifier (NPI) for the attending provider.  Default to spaces if value is not available. (2310A, NM109)",Claim,Numeric,10,5468,5477,Y,538,Y,,
Detail,ATTENDING_STATE_LICENSE,"The value in this field represents the Sate License number for the attending provider.  A non-zero value is required.  (2310A, REF02)",Claim,Text,10,5478,5487,N,539,N,,
Detail,ATTENDING_SPECIALTY_CODE,"The value in this field represents the specialty of the attending provider, as defined in the client's claim system. (2310, PRV03)",Claim,Text,10,5488,5497,N,540,N,,
Detail,ATTENDING_TAXONOMY_CODE,Industry standard taxonomy code of the attending provider used by CMS and sourced by the National Uniform Claim Committee. A list of taxonomy codes is available via http://www.wpc-edi.com/reference/codelists/healthcare/health-care-provider-taxonomy-code-set/.,Claim,Text,50,5498,5547,Y,541,Y,,
Detail,ATTENDING_ENTITY_TYPE,"Expected Values are:  'P' = Person  (2310A, NM102)",Claim,Text,1,5548,5548,N,542,N,,
Detail,ATTENDING_LAST_NAME,"The value in this field represents the attending provider’s last name.  (2310A, NM103)",Claim,Text,60,5549,5608,Y,543,Y,,
Detail,ATTENDING_FIRST_NAME,"The value in this field represents the attending provider’s first name.  (2310A, NM104)",Claim,Text,35,5609,5643,Y,544,Y,,
Detail,ATTENDING_MIDDLE_NAME,"The value in this field represents the attending provider’s middle name.  (2310A, NM105)",Claim,Text,25,5644,5668,Y,545,Y,,
Detail,ATTENDING_NAME_SUFFIX,"The value in this field represents the attending provider's suffix, as required.  (2310A, NM107)",Claim,Text,10,5669,5678,Y,546,Y,,
Detail,OPERATING_PROVIDER_ID,"The value in this field represents the operating provider at the  facility where services are rendered.  This number is the identification number unique to the provider in the client’s system.  (2310B, REF02)",Claim,Text,25,5679,5703,N,547,N,,
Detail,OPERATING_TAXGROUP_ID,"The value in this field represents the provider's tax identification number. This number represents the operating provider.  (2310B, REF02)",Claim,Text,9,5704,5712,N,548,N,,
Detail,OPERATING_NPI,"The value in this field represents the CMS National Provider Identifier (NPI) for the operating provider. Default to spaces if value is not available.  (2310B, NM109)",Claim,Numeric,10,5713,5722,N,549,N,,
Detail,OPERATING_STATE_LICENSE,"The value in this field represents the Sate License number for the operating provider.  A non-zero value is required.  (2310B, REF02)",Claim,Text,10,5723,5732,N,550,N,,
Detail,OPERATING_SPECIALTY_CODE,"The value in this field represents the specialty of the operating provider, as defined in the client's claim system.",Claim,Text,10,5733,5742,N,551,N,,
Detail,OPERATING_TAXONOMY_CODE,Industry standard taxonomy code of the operating provider used by CMS and sourced by the National Uniform Claim Committee. A list of taxonomy codes is available via http://www.wpc-edi.com/reference/codelists/healthcare/health-care-provider-taxonomy-code-set/.,Claim,Text,50,5743,5792,N,552,N,,
Detail,OPERATING_ENTITY_TYPE,"Expected Values are:  'P' = Person (2310B, NM102)",Claim,Text,1,5793,5793,N,553,N,,
Detail,OPERATING_LAST_NAME,"The value in this field represents the operating provider’s last name.  (2310B, NM103)",Claim,Text,60,5794,5853,N,554,N,,
Detail,OPERATING_FIRST_NAME,"The value in this field represents the operating provider’s first name and applies to Outpatient claims only.  (2310B, NM104)",Claim,Text,35,5854,5888,N,555,N,,
Detail,OPERATING_MIDDLE_NAME,"The value in this field represents the operating provider’s middle name and applies to Outpatient claims only.  (2310B, NM105)",Claim,Text,25,5889,5913,N,556,N,,
Detail,OPERATING_NAME_SUFFIX,"The value in this field represents the operating provider's suffix, as required.  (2310B, NM107)",Claim,Text,10,5914,5923,N,557,N,,
Detail,OTHER_OPERATING_PROVIDER_ID,"The value in this field represents the other operating provider at the  facility where services are rendered.  This number is the identification number unique to the provider in the client’s system.  (2310C, REF02)",Claim,Text,25,5924,5948,N,558,N,,
Detail,OTHER_OPERATING_TAXGROUP_ID,"The value in this field represents the provider's tax identification number. This number represents the other operating provider.  (2310C, REF02)",Claim,Text,9,5949,5957,N,559,N,,
Detail,OTHER_OPERATING_NPI,"The value in this field represents the CMS National Provider Identifier (NPI) for the other operating provider.  Default to spaces if value is not available. (2310C, NM109)",Claim,Numeric,10,5958,5967,Y,560,Y,,
Detail,OTHER_OPERATING_STATE_LICENSE,"The value in this field represents the Sate License number for the other operating provider.  A non-zero value is required.  (2310C, REF02)",Claim,Text,10,5968,5977,N,561,N,,
Detail,OTHER_OPERATING_SPECIALTY_CODE,"The value in this field represents the specialty of the other operating provider, as defined in the client's claim system.",Claim,Text,10,5978,5987,N,562,N,,
Detail,OTHER_OPERATING_TAXONOMY_CODE,Industry standard taxonomy code of the other operating provider used by CMS and sourced by the National Uniform Claim Committee. A list of taxonomy codes is available via http://www.wpc-edi.com/reference/codelists/healthcare/health-care-provider-taxonomy-code-set/.,Claim,Text,50,5988,6037,N,563,N,,
Detail,OTHER_OPERATING_ENTITY_TYPE,"Expected Values are:  'P' = Person (2310C, NM102)",Claim,Text,1,6038,6038,N,564,N,,
Detail,OTHER_OPERATING_LAST_NAME,"The value in this field represents the other operating provider’s last name.  (2310C, NM103)",Claim,Text,60,6039,6098,Y,565,Y,,
Detail,OTHER_OPERATING_FIRST_NAME,"The value in this field represents the other operating provider’s first name.  (2310C, NM104)",Claim,Text,35,6099,6133,Y,566,Y,,
Detail,OTHER_OPERATING_MIDDLE_NAME,"The value in this field represents the other operating provider’s middle name.  (2310C, NM105)",Claim,Text,25,6134,6158,Y,567,Y,,
Detail,OTHER_OPERATING_NAME_SUFFIX,"The value in this field represents the other operating provider's suffix, as required.  (2310C, NM107)",Claim,Text,10,6159,6168,Y,568,Y,,
Detail,REFERRING_PCP_YN,Y or N indicator to define whether or not the referring provider is the patient's PCP.,Claim,Text,1,6169,6169,N,569,N,,
Detail,REFERRING_PROVIDER_ID,"The value in this field represents the referring provider at the  facility where services are rendered.  This number is the identification number unique to the provider in the client’s system.  (2310F, REF02)",Claim,Text,25,6170,6194,N,570,N,,
Detail,REFERRING_TAXGROUP_ID,"The value in this field represents the provider's tax identification number. This number represents the referring provider.  (2310F, REF02)",Claim,Text,9,6195,6203,N,571,N,,
Detail,REFERRING_NPI,"The value in this field represents the CMS National Provider Identifier (NPI) for the referring provider.  Default to spaces if value is not available.  (2310F, NM109)",Claim,Numeric,10,6204,6213,N,572,N,,
Detail,REFERRING_STATE_LICENSE,"The value in this field represents the Sate License number for the referring provider.  A non-zero value is required.  (2310F, REF02)",Claim,Text,10,6214,6223,N,573,N,,
Detail,REFERRING_SPECIALTY_CODE,"The value in this field represents the specialty of the referring provider, as defined in the client's claim system.",Claim,Text,10,6224,6233,N,574,N,,
Detail,REFERRING_TAXONOMY_CODE,Industry standard taxonomy code of the referring provider used by CMS and sourced by the National Uniform Claim Committee. A list of taxonomy codes is available via http://www.wpc-edi.com/reference/codelists/healthcare/health-care-provider-taxonomy-code-set/.,Claim,Text,50,6234,6283,N,575,N,,
Detail,REFERRING_ENTITY_TYPE,Expected Values are:  'P' = Person,Claim,Text,1,6284,6284,N,576,N,,
Detail,REFERRING_LAST_NAME,"The value in this field represents the referring provider’s last name.  (2310F, NM103)",Claim,Text,60,6285,6344,N,577,N,,
Detail,REFERRING_FIRST_NAME,"The value in this field represents the referring provider’s first name.  (2310F, NM104)",Claim,Text,35,6345,6379,N,578,N,,
Detail,REFERRING_MIDDLE_NAME,"The value in this field represents the referring provider’s middle name.  (2310F, NM105)",Claim,Text,25,6380,6404,N,579,N,,
Detail,REFERRING_NAME_SUFFIX,"The value in this field represents the referring provider's suffix, as required.  (2310F, NM107)",Claim,Text,10,6405,6414,N,580,N,,
Detail,AUTH_EXCEPTION_CODE,"Required when mandated by government law or regulation to obtain authorization for specific service(s) but, for the reasons provided, the service was performed without obtaining the authorization.  Allowable values for this element are:
1 Immediate/Urgent Care
2 Services Rendered in a Retroactive Period
3 Emergency Care
4 Client has Temporary Medicaid
5 Request from County for Second Opinion to Determine
if Recipient Can Work
6 Request for Override Pending
7 Special Handling
(2300, REF02)",Claim,Text,4,6415,6418,N,581,N,,
Detail,REFERRAL_NUM,"Required by CMS when a referral number is assigned by the payer or Utilization Management Organization (UMO) AND a referral is involved.  (2300, REF02)",Claim,Text,30,6419,6448,N,582,N,,
Detail,AUTH_NO_01,"The value in this field represents the authorization number submitted by the provider for this claim.  If the provider did not submit an authorization number, provide the payer’s prior authorization number for this claim, if available.  (2300, REF02)",Claim,Text,30,6449,6478,N,583,N,,
Detail,AUTH_NO_02,"The value in this field represents the authorization number submitted by the provider for this claim.  If the provider did not submit an authorization number, provide the payer’s prior authorization number for this claim, if available.",Claim,Text,30,6479,6508,N,584,N,,
Detail,AUTH_NO_03,"The value in this field represents the authorization number submitted by the provider for this claim.  If the provider did not submit an authorization number, provide the payer’s prior authorization number for this claim, if available.",Claim,Text,30,6509,6538,N,585,N,,
Detail,PRO_AUTH_ID,"Peer Review Organization Authorization number.  Required by CMS when an external Peer Review Organization assigns an Approval Number to services deemed medically necessary by that organization. (2300, REF02)",Claim,Text,24,6539,6562,N,586,N,,
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
(2300, NTE01)",Claim,Text,3,6563,6565,N,587,N,,
Detail,CLAIM_NOTE_TEXT,"This field is the free-form description provided by the provider or facility to clarify the related data elements and their content. (2300, NTE02)",Claim,Text,80,6566,6645,N,588,N,,
Detail,EPSDT_REFERRAL_YN,"EPSDT Referral is required by CMS on Early & Periodic Screening, Diagnosis, and Treatment (EPSDT) claims when the screening service is being billed in this claim. The value in this field answers the question: Was an EPSDT referral given to the patient?  If no, then choose ""NU"" for Condition Indicator.  Expected Values are Y or N. (2300, CRC02)",Claim,Text,1,6646,6646,N,589,N,,
Detail,EPSDT_CONDITION_CODE_01,"This field represents the condition indicator for the EPSDT referral above.  Expected Values are:
AV    Available - Not Used - Patient refused referral.
NU    Not Used - This conditioner indicator must be used when the submitter answers “N” in CRC02.
S2    Under Treatment - Patient is currently under treatment for referred diagnostic or corrective health problem.
ST    New Services Requested - Patient is referred to another provider for diagnostic or corrective treatment for at least one health problem identified during an initial or periodic screening service (not including dental referrals).
OR
Patient is scheduled for another appointment with screening provider for diagnostic or corrective treatment for at least one health problem identified during an initial or periodic screening service (not including dental referrals).
(2300, CRC03)",Claim,Text,3,6647,6649,N,590,N,,
Detail,EPSDT_CONDITION_CODE_02,Additional condition indicator for the EPSDT referral.,Claim,Text,3,6650,6652,N,591,N,,
Detail,EPSDT_CONDITION_CODE_03,Additional condition indicator for the EPSDT referral.,Claim,Text,3,6653,6655,N,592,N,,
Detail,OCCUR_SPAN_CODE_01,"This field defines the Occurrence Span Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence span code is defined by a span of time rather than by a single date. (2300, HI01-2)",Claim,Text,2,6656,6657,Y,593,Y,,
Detail,OCCUR_SPAN_FROM_DATE_01,"From date associated with OCCUR_SPAN_CODE_01. Expected when corresponding OCCUR_SPAN_CODE is submitted. (2300, HI01-4)",Claim,"Date
YYYYMMDD",8,6658,6665,Y,594,Y,,
Detail,OCCUR_SPAN_TO_DATE_01,"To date associated with OCCUR_SPAN_CODE_01. Expected when corresponding OCCUR_SPAN_CODE is submitted.  (2300, HI01-4)",Claim,"Date
YYYYMMDD",8,6666,6673,Y,595,Y,,
Detail,OCCUR_SPAN_CODE_02,"This field defines the Occurrence Span Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence span code is defined by a span of time rather than by a single date. (2300, HI02-2+C545)",Claim,Text,2,6674,6675,Y,596,Y,,
Detail,OCCUR_SPAN_FROM_DATE_02,"From date associated with OCCUR_SPAN_CODE_02. Expected when corresponding OCCUR_SPAN_CODE is submitted.  (2300, HI02-4)",Claim,"Date
YYYYMMDD",8,6676,6683,Y,597,Y,,
Detail,OCCUR_SPAN_TO_DATE_02,"To date associated with OCCUR_SPAN_CODE_02. Expected when corresponding OCCUR_SPAN_CODE is submitted.  (2300, HI02-4)",Claim,"Date
YYYYMMDD",8,6684,6691,Y,598,Y,,
Detail,OCCUR_SPAN_CODE_03,"This field defines the Occurrence Span Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence span code is defined by a span of time rather than by a single date. (2300, HI03-2)",Claim,Text,2,6692,6693,Y,599,Y,,
Detail,OCCUR_SPAN_FROM_DATE_03,"From date associated with OCCUR_SPAN_CODE_03. Expected when corresponding OCCUR_SPAN_CODE is submitted.  (2300, HI03-4)",Claim,"Date
YYYYMMDD",8,6694,6701,Y,600,Y,,
Detail,OCCUR_SPAN_TO_DATE_03,"To date associated with OCCUR_SPAN_CODE_03. Expected when corresponding OCCUR_SPAN_CODE is submitted.  (2300, HI03-4)",Claim,"Date
YYYYMMDD",8,6702,6709,Y,601,Y,,
Detail,OCCUR_SPAN_CODE_04,"This field defines the Occurrence Span Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence span code is defined by a span of time rather than by a single date.
(2300, HI04-2)",Claim,Text,2,6710,6711,Y,602,Y,,
Detail,OCCUR_SPAN_FROM_DATE_04,"From date associated with OCCUR_SPAN_CODE_04.  Expected when corresponding OCCUR_SPAN_CODE is submitted.  (2300, HI04-4)",Claim,"Date
YYYYMMDD",8,6712,6719,Y,603,Y,,
Detail,OCCUR_SPAN_TO_DATE_04,"To date associated with OCCUR_SPAN_CODE_04. Expected when corresponding OCCUR_SPAN_CODE is submitted.  (2300, HI04-4)",Claim,"Date
YYYYMMDD",8,6720,6727,Y,604,Y,,
Detail,OCCUR_SPAN_CODE_05,"This field defines the Occurrence Span Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence span code is defined by a span of time rather than by a single date.
 (2300, HI05-2)",Claim,Text,2,6728,6729,Y,605,Y,,
Detail,OCCUR_SPAN_FROM_DATE_05,"From date associated with OCCUR_SPAN_CODE_05. Expected when corresponding OCCUR_SPAN_CODE is submitted.  (2300, HI05-4)",Claim,"Date
YYYYMMDD",8,6730,6737,Y,606,Y,,
Detail,OCCUR_SPAN_TO_DATE_05,"To date associated with OCCUR_SPAN_CODE_05. Expected when corresponding OCCUR_SPAN_CODE is submitted.  (2300, HI05-4)",Claim,"Date
YYYYMMDD",8,6738,6745,Y,607,Y,,
Detail,OCCUR_SPAN_CODE_06,"This field defines the Occurrence Span Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence span code is defined by a span of time rather than by a single date.  (2300, HI06-2)",Claim,Text,2,6746,6747,Y,608,Y,,
Detail,OCCUR_SPAN_FROM_DATE_06,"From date associated with OCCUR_SPAN_CODE_06. Expected when corresponding OCCUR_SPAN_CODE is submitted.  (2300, HI06-4)",Claim,"Date
YYYYMMDD",8,6748,6755,Y,609,Y,,
Detail,OCCUR_SPAN_TO_DATE_06,"To date associated with OCCUR_SPAN_CODE_06. Expected when corresponding OCCUR_SPAN_CODE is submitted.  (2300, HI06-4)",Claim,"Date
YYYYMMDD",8,6756,6763,Y,610,Y,,
Detail,OCCUR_SPAN_CODE_07,"This field defines the Occurrence Span Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence span code is defined by a span of time rather than by a single date. (2300, HI07-2)",Claim,Text,2,6764,6765,Y,611,Y,,
Detail,OCCUR_SPAN_FROM_DATE_07,"From date associated with OCCUR_SPAN_CODE_07. Expected when corresponding OCCUR_SPAN_CODE is submitted.  (2300, HI07-4)",Claim,"Date
YYYYMMDD",8,6766,6773,Y,612,Y,,
Detail,OCCUR_SPAN_TO_DATE_07,"To date associated with OCCUR_SPAN_CODE_07. Expected when corresponding OCCUR_SPAN_CODE is submitted.  (2300, HI07-4)",Claim,"Date
YYYYMMDD",8,6774,6781,Y,613,Y,,
Detail,OCCUR_SPAN_CODE_08,"This field defines the Occurrence Span Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence span code is defined by a span of time rather than by a single date. (2300, HI08-2)",Claim,Text,2,6782,6783,Y,614,Y,,
Detail,OCCUR_SPAN_FROM_DATE_08,"From date associated with OCCUR_SPAN_CODE_08. Expected when corresponding OCCUR_SPAN_CODE is submitted.  (2300, HI08-4)",Claim,"Date
YYYYMMDD",8,6784,6791,Y,615,Y,,
Detail,OCCUR_SPAN_TO_DATE_08,"To date associated with OCCUR_SPAN_CODE_08. Expected when corresponding OCCUR_SPAN_CODE is submitted.  (2300, HI08-4)",Claim,"Date
YYYYMMDD",8,6792,6799,Y,616,Y,,
Detail,OCCUR_SPAN_CODE_09,This field defines the Occurrence Span Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence span code is defined by a span of time rather than by a single date.,Claim,Text,2,6800,6801,Y,617,Y,,
Detail,OCCUR_SPAN_FROM_DATE_09,From date associated with OCCUR_SPAN_CODE_09. Expected when corresponding OCCUR_SPAN_CODE is submitted.,Claim,"Date
YYYYMMDD",8,6802,6809,Y,618,Y,,
Detail,OCCUR_SPAN_TO_DATE_09,To date associated with OCCUR_SPAN_CODE_09. Expected when corresponding OCCUR_SPAN_CODE is submitted.,Claim,"Date
YYYYMMDD",8,6810,6817,Y,619,Y,,
Detail,OCCUR_SPAN_CODE_10,"This field defines the Occurrence Span Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence span code is defined by a span of time rather than by a single date.(2300, HI010-2)",Claim,Text,2,6818,6819,Y,620,Y,,
Detail,OCCUR_SPAN_FROM_DATE_10,"From date associated with OCCUR_SPAN_CODE_10. Expected when corresponding OCCUR_SPAN_CODE is submitted. (2300, HI010-4)",Claim,"Date
YYYYMMDD",8,6820,6827,Y,621,Y,,
Detail,OCCUR_SPAN_TO_DATE_10,"To date associated with OCCUR_SPAN_CODE_10. Expected when corresponding OCCUR_SPAN_CODE is submitted. (2300, HI010-4)",Claim,"Date
YYYYMMDD",8,6828,6835,Y,622,Y,,
Detail,OCCUR_SPAN_CODE_11,"This field defines the Occurrence Span Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence span code is defined by a span of time rather than by a single date.(2300, HI011-2)",Claim,Text,2,6836,6837,Y,623,Y,,
Detail,OCCUR_SPAN_FROM_DATE_11,"From date associated with OCCUR_SPAN_CODE_11. Expected when corresponding OCCUR_SPAN_CODE is submitted. (2300, HI011-4)",Claim,"Date
YYYYMMDD",8,6838,6845,Y,624,Y,,
Detail,OCCUR_SPAN_TO_DATE_11,"To date associated with OCCUR_SPAN_CODE_11. Expected when corresponding OCCUR_SPAN_CODE is submitted. (2300, HI011-4)",Claim,"Date
YYYYMMDD",8,6846,6853,Y,625,Y,,
Detail,OCCUR_SPAN_CODE_12,"This field defines the Occurrence Span Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence span code is defined by a span of time rather than by a single date. (2300, HI012-2)",Claim,Text,2,6854,6855,Y,626,Y,,
Detail,OCCUR_SPAN_FROM_DATE_12,"From date associated with OCCUR_SPAN_CODE_12. Expected when corresponding OCCUR_SPAN_CODE is submitted. (2300, HI012-4)",Claim,"Date
YYYYMMDD",8,6856,6863,Y,627,Y,,
Detail,OCCUR_SPAN_TO_DATE_12,"To date associated with OCCUR_SPAN_CODE_12. Expected when corresponding OCCUR_SPAN_CODE is submitted. (2300, HI012-4)",Claim,"Date
YYYYMMDD",8,6864,6871,Y,628,Y,,
Detail,OCCUR_SPAN_CODE_13,This field defines the Occurrence Span Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence span code is defined by a span of time rather than by a single date.  Segment Repeat.,Claim,Text,2,6872,6873,Y,629,Y,,
Detail,OCCUR_SPAN_FROM_DATE_13,From date associated with OCCUR_SPAN_CODE_13. Expected when corresponding OCCUR_SPAN_CODE is submitted. Segment Repeat.,Claim,"Date
YYYYMMDD",8,6874,6881,Y,630,Y,,
Detail,OCCUR_SPAN_TO_DATE_13,To date associated with OCCUR_SPAN_CODE_13.  Expected when corresponding OCCUR_SPAN_CODE is submitted. Segment Repeat.,Claim,"Date
YYYYMMDD",8,6882,6889,Y,631,Y,,
Detail,OCCUR_SPAN_CODE_14,This field defines the Occurrence Span Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence span code is defined by a span of time rather than by a single date.  Segment Repeat.,Claim,Text,2,6890,6891,Y,632,Y,,
Detail,OCCUR_SPAN_FROM_DATE_14,From date associated with OCCUR_SPAN_CODE_14.  Expected when corresponding OCCUR_SPAN_CODE is submitted. Segment Repeat.,Claim,"Date
YYYYMMDD",8,6892,6899,Y,633,Y,,
Detail,OCCUR_SPAN_TO_DATE_14,To date associated with OCCUR_SPAN_CODE_14.  Expected when corresponding OCCUR_SPAN_CODE is submitted. Segment Repeat.,Claim,"Date
YYYYMMDD",8,6900,6907,Y,634,Y,,
Detail,OCCUR_SPAN_CODE_15,This field defines the Occurrence Span Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence span code is defined by a span of time rather than by a single date.  Segment Repeat.,Claim,Text,2,6908,6909,Y,635,Y,,
Detail,OCCUR_SPAN_FROM_DATE_15,From date associated with OCCUR_SPAN_CODE_15.  Expected when corresponding OCCUR_SPAN_CODE is submitted. Segment Repeat.,Claim,"Date
YYYYMMDD",8,6910,6917,Y,636,Y,,
Detail,OCCUR_SPAN_TO_DATE_15,To date associated with OCCUR_SPAN_CODE_15.  Expected when corresponding OCCUR_SPAN_CODE is submitted.  Segment Repeat.,Claim,"Date
YYYYMMDD",8,6918,6925,Y,637,Y,,
Detail,OCCUR_SPAN_CODE_16,This field defines the Occurrence Span Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence span code is defined by a span of time rather than by a single date.  Segment Repeat.,Claim,Text,2,6926,6927,Y,638,Y,,
Detail,OCCUR_SPAN_FROM_DATE_16,From date associated with OCCUR_SPAN_CODE_16.  Expected when corresponding OCCUR_SPAN_CODE is submitted.  Segment Repeat.,Claim,"Date
YYYYMMDD",8,6928,6935,Y,639,Y,,
Detail,OCCUR_SPAN_TO_DATE_16,To date associated with OCCUR_SPAN_CODE_16.  Expected when corresponding OCCUR_SPAN_CODE is submitted.  Segment Repeat.,Claim,"Date
YYYYMMDD",8,6936,6943,Y,640,Y,,
Detail,OCCUR_SPAN_CODE_17,This field defines the Occurrence Span Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence span code is defined by a span of time rather than by a single date.,Claim,Text,2,6944,6945,Y,641,Y,,
Detail,OCCUR_SPAN_FROM_DATE_17,From date associated with OCCUR_SPAN_CODE_17.  Expected when corresponding OCCUR_SPAN_CODE is submitted.  Segment Repeat.,Claim,"Date
YYYYMMDD",8,6946,6953,Y,642,Y,,
Detail,OCCUR_SPAN_TO_DATE_17,To date associated with OCCUR_SPAN_CODE_17.  Expected when corresponding OCCUR_SPAN_CODE is submitted.  Segment Repeat.,Claim,"Date
YYYYMMDD",8,6954,6961,Y,643,Y,,
Detail,OCCUR_SPAN_CODE_18,This field defines the Occurrence Span Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence span code is defined by a span of time rather than by a single date.  Segment Repeat.,Claim,Text,2,6962,6963,Y,644,Y,,
Detail,OCCUR_SPAN_FROM_DATE_18,From date associated with OCCUR_SPAN_CODE_18.  Expected when corresponding OCCUR_SPAN_CODE is submitted.  Segment Repeat.,Claim,"Date
YYYYMMDD",8,6964,6971,Y,645,Y,,
Detail,OCCUR_SPAN_TO_DATE_18,To date associated with OCCUR_SPAN_CODE_18.  Expected when corresponding OCCUR_SPAN_CODE is submitted.  Segment Repeat.,Claim,"Date
YYYYMMDD",8,6972,6979,Y,646,Y,,
Detail,OCCUR_SPAN_CODE_19,This field defines the Occurrence Span Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence span code is defined by a span of time rather than by a single date.  Segment Repeat.,Claim,Text,2,6980,6981,Y,647,Y,,
Detail,OCCUR_SPAN_FROM_DATE_19,From date associated with OCCUR_SPAN_CODE_19.  Expected when corresponding OCCUR_SPAN_CODE is submitted.  Segment Repeat.,Claim,"Date
YYYYMMDD",8,6982,6989,Y,648,Y,,
Detail,OCCUR_SPAN_TO_DATE_19,To date associated with OCCUR_SPAN_CODE_19.  Expected when corresponding OCCUR_SPAN_CODE is submitted.  Segment Repeat.,Claim,"Date
YYYYMMDD",8,6990,6997,Y,649,Y,,
Detail,OCCUR_SPAN_CODE_20,This field defines the Occurrence Span Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence span code is defined by a span of time rather than by a single date.  Segment Repeat.,Claim,Text,2,6998,6999,Y,650,Y,,
Detail,OCCUR_SPAN_FROM_DATE_20,From date associated with OCCUR_SPAN_CODE_20. Expected when corresponding OCCUR_SPAN_CODE is submitted.  Segment Repeat.,Claim,"Date
YYYYMMDD",8,7000,7007,Y,651,Y,,
Detail,OCCUR_SPAN_TO_DATE_20,To date associated with OCCUR_SPAN_CODE_20.  Expected when corresponding OCCUR_SPAN_CODE is submitted.  Segment Repeat.,Claim,"Date
YYYYMMDD",8,7008,7015,Y,652,Y,,
Detail,OCCUR_SPAN_CODE_21,This field defines the Occurrence Span Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence span code is defined by a span of time rather than by a single date.  Segment Repeat.,Claim,Text,2,7016,7017,Y,653,Y,,
Detail,OCCUR_SPAN_FROM_DATE_21,From date associated with OCCUR_SPAN_CODE_21. Expected when corresponding OCCUR_SPAN_CODE is submitted.  Segment Repeat.,Claim,"Date
YYYYMMDD",8,7018,7025,Y,654,Y,,
Detail,OCCUR_SPAN_TO_DATE_21,To date associated with OCCUR_SPAN_CODE_21.  Expected when corresponding OCCUR_SPAN_CODE is submitted.  Segment Repeat.,Claim,"Date
YYYYMMDD",8,7026,7033,Y,655,Y,,
Detail,OCCUR_SPAN_CODE_22,This field defines the Occurrence Span Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence span code is defined by a span of time rather than by a single date.  Segment Repeat.,Claim,Text,2,7034,7035,Y,656,Y,,
Detail,OCCUR_SPAN_FROM_DATE_22,From date associated with OCCUR_SPAN_CODE_22.  Expected when corresponding OCCUR_SPAN_CODE is submitted.  Segment Repeat.,Claim,"Date
YYYYMMDD",8,7036,7043,Y,657,Y,,
Detail,OCCUR_SPAN_TO_DATE_22,To date associated with OCCUR_SPAN_CODE_22.  Expected when corresponding OCCUR_SPAN_CODE is submitted.  Segment Repeat.,Claim,"Date
YYYYMMDD",8,7044,7051,Y,658,Y,,
Detail,OCCUR_SPAN_CODE_23,This field defines the Occurrence Span Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence span code is defined by a span of time rather than by a single date.  Segment Repeat.,Claim,Text,2,7052,7053,Y,659,Y,,
Detail,OCCUR_SPAN_FROM_DATE_23,From date associated with OCCUR_SPAN_CODE_23.  Expected when corresponding OCCUR_SPAN_CODE is submitted.  Segment Repeat.,Claim,"Date
YYYYMMDD",8,7054,7061,Y,660,Y,,
Detail,OCCUR_SPAN_TO_DATE_23,To date associated with OCCUR_SPAN_CODE_23.  Expected when corresponding OCCUR_SPAN_CODE is submitted.  Segment Repeat.,Claim,"Date
YYYYMMDD",8,7062,7069,Y,661,Y,,
Detail,OCCUR_SPAN_CODE_24,This field defines the Occurrence Span Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence span code is defined by a span of time rather than by a single date.,Claim,Text,2,7070,7071,Y,662,Y,,
Detail,OCCUR_SPAN_FROM_DATE_24,From date associated with OCCUR_SPAN_CODE_24.  Expected when corresponding OCCUR_SPAN_CODE is submitted. Segment Repeat.,Claim,"Date
YYYYMMDD",8,7072,7079,Y,663,Y,,
Detail,OCCUR_SPAN_TO_DATE_24,To date associated with OCCUR_SPAN_CODE_24.  Expected when corresponding OCCUR_SPAN_CODE is submitted. Segment Repeat.,Claim,"Date
YYYYMMDD",8,7080,7087,Y,664,Y,,
Detail,OCCUR_CODE_01,"This field defines the Occurrence Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence code is for a single date in time and does not span over multiple days.  (2300, HI01-4)",Claim,Text,2,7088,7089,Y,665,Y,,
Detail,OCCUR_DATE_01,"Date associated with OCCUR_CODE_01.  Expected when corresponding OCCUR_CODE is submitted.  (2300, HI01-4)",Claim,"Date
YYYYMMDD",8,7090,7097,Y,666,Y,,
Detail,OCCUR_CODE_02,"This field defines the Occurrence Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence code is for a single date in time and does not span over multiple days. (2300, HI02-2)",Claim,Text,2,7098,7099,Y,667,Y,,
Detail,OCCUR_DATE_02,"Date associated with OCCUR_CODE_02.  Expected when corresponding OCCUR_CODE is submitted.  (2300, HI02-4)",Claim,"Date
YYYYMMDD",8,7100,7107,Y,668,Y,,
Detail,OCCUR_CODE_03,"This field defines the Occurrence Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence code is for a single date in time and does not span over multiple days.   (2300, HI03-2)",Claim,Text,2,7108,7109,Y,669,Y,,
Detail,OCCUR_DATE_03,"Date associated with OCCUR_CODE_03.  Expected when corresponding OCCUR_CODE is submitted.   (2300, HI03-4)",Claim,"Date
YYYYMMDD",8,7110,7117,Y,670,Y,,
Detail,OCCUR_CODE_04,"This field defines the Occurrence Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence code is for a single date in time and does not span over multiple days.   (2300, HI04-2)",Claim,Text,2,7118,7119,Y,671,Y,,
Detail,OCCUR_DATE_04,"Date associated with OCCUR_CODE_04.  Expected when corresponding OCCUR_CODE is submitted.   (2300, HI04-4)",Claim,"Date
YYYYMMDD",8,7120,7127,Y,672,Y,,
Detail,OCCUR_CODE_05,"This field defines the Occurrence Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence code is for a single date in time and does not span over multiple days.   (2300, HI05-2)",Claim,Text,2,7128,7129,Y,673,Y,,
Detail,OCCUR_DATE_05,"Date associated with OCCUR_CODE_05.  Expected when corresponding OCCUR_CODE is submitted.  (2300, HI05-4)",Claim,"Date
YYYYMMDD",8,7130,7137,Y,674,Y,,
Detail,OCCUR_CODE_06,"This field defines the Occurrence Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence code is for a single date in time and does not span over multiple days.  (2300, HI06-2)",Claim,Text,2,7138,7139,Y,675,Y,,
Detail,OCCUR_DATE_06,"Date associated with OCCUR_CODE_06.  Expected when corresponding OCCUR_CODE is submitted.  (2300, HI06-4)",Claim,"Date
YYYYMMDD",8,7140,7147,Y,676,Y,,
Detail,OCCUR_CODE_07,"This field defines the Occurrence Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence code is for a single date in time and does not span over multiple days.  (2300, HI07-2)",Claim,Text,2,7148,7149,Y,677,Y,,
Detail,OCCUR_DATE_07,"Date associated with OCCUR_CODE_07.   Expected when corresponding OCCUR_CODE is submitted.  (2300, HI07-4)",Claim,"Date
YYYYMMDD",8,7150,7157,Y,678,Y,,
Detail,OCCUR_CODE_08,"This field defines the Occurrence Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence code is for a single date in time and does not span over multiple days.  (2300, HI08-2)",Claim,Text,2,7158,7159,Y,679,Y,,
Detail,OCCUR_DATE_08,"Date associated with OCCUR_CODE_08. Expected when corresponding OCCUR_CODE is submitted.  (2300, HI08-4)",Claim,"Date
YYYYMMDD",8,7160,7167,Y,680,Y,,
Detail,OCCUR_CODE_09,"This field defines the Occurrence Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence code is for a single date in time and does not span over multiple days.  (2300, HI09-2)",Claim,Text,2,7168,7169,Y,681,Y,,
Detail,OCCUR_DATE_09,"Date associated with OCCUR_CODE_09.  Expected when corresponding OCCUR_CODE is submitted.  (2300, HI09-4)",Claim,"Date
YYYYMMDD",8,7170,7177,Y,682,Y,,
Detail,OCCUR_CODE_10,"This field defines the Occurrence Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence code is for a single date in time and does not span over multiple days. (2300, HI10-2)",Claim,Text,2,7178,7179,Y,683,Y,,
Detail,OCCUR_DATE_10,"Date associated with OCCUR_CODE_10.  Expected when corresponding OCCUR_CODE is submitted.   (2300, HI10-4)",Claim,"Date
YYYYMMDD",8,7180,7187,Y,684,Y,,
Detail,OCCUR_CODE_11,"This field defines the Occurrence Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence code is for a single date in time and does not span over multiple days.  (2300, HI11-2)",Claim,Text,2,7188,7189,Y,685,Y,,
Detail,OCCUR_DATE_11,"Date associated with OCCUR_CODE_11.  Expected when corresponding OCCUR_CODE is submitted. (2300, HI11-4)",Claim,"Date
YYYYMMDD",8,7190,7197,Y,686,Y,,
Detail,OCCUR_CODE_12,"This field defines the Occurrence Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence code is for a single date in time and does not span over multiple days.  (2300, HI12-2)",Claim,Text,2,7198,7199,Y,687,Y,,
Detail,OCCUR_DATE_12,"Date associated with OCCUR_CODE_12.  Expected when corresponding OCCUR_CODE is submitted.  (2300, HI12-4)",Claim,"Date
YYYYMMDD",8,7200,7207,Y,688,Y,,
Detail,OCCUR_CODE_13,This field defines the Occurrence Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence code is for a single date in time and does not span over multiple days.  Segment Repeat,Claim,Text,2,7208,7209,Y,689,Y,,
Detail,OCCUR_DATE_13,Date associated with OCCUR_CODE_13.  Expected when corresponding OCCUR_CODE is submitted.  Segment Repeat,Claim,"Date
YYYYMMDD",8,7210,7217,Y,690,Y,,
Detail,OCCUR_CODE_14,This field defines the Occurrence Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence code is for a single date in time and does not span over multiple days. Segment Repeat,Claim,Text,2,7218,7219,Y,691,Y,,
Detail,OCCUR_DATE_14,Date associated with OCCUR_CODE_14. Expected when corresponding OCCUR_CODE is submitted.  Segment Repeat,Claim,"Date
YYYYMMDD",8,7220,7227,Y,692,Y,,
Detail,OCCUR_CODE_15,This field defines the Occurrence Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence code is for a single date in time and does not span over multiple days. Segment Repeat,Claim,Text,2,7228,7229,Y,693,Y,,
Detail,OCCUR_DATE_15,Date associated with OCCUR_CODE_15.  Expected when corresponding OCCUR_CODE is submitted.  Segment Repeat,Claim,"Date
YYYYMMDD",8,7230,7237,Y,694,Y,,
Detail,OCCUR_CODE_16,This field defines the Occurrence Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence code is for a single date in time and does not span over multiple days. Segment Repeat,Claim,Text,2,7238,7239,Y,695,Y,,
Detail,OCCUR_DATE_16,Date associated with OCCUR_CODE_16.  Expected when corresponding OCCUR_CODE is submitted.  Segment Repeat,Claim,"Date
YYYYMMDD",8,7240,7247,Y,696,Y,,
Detail,OCCUR_CODE_17,This field defines the Occurrence Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence code is for a single date in time and does not span over multiple days. Segment Repeat,Claim,Text,2,7248,7249,Y,697,Y,,
Detail,OCCUR_DATE_17,Date associated with OCCUR_CODE_17.  Expected when corresponding OCCUR_CODE is submitted. Segment Repeat,Claim,"Date
YYYYMMDD",8,7250,7257,Y,698,Y,,
Detail,OCCUR_CODE_18,This field defines the Occurrence Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence code is for a single date in time and does not span over multiple days. Segment Repeat,Claim,Text,2,7258,7259,Y,699,Y,,
Detail,OCCUR_DATE_18,Date associated with OCCUR_CODE_18.  Expected when corresponding OCCUR_CODE is submitted.  Segment Repeat,Claim,"Date
YYYYMMDD",8,7260,7267,Y,700,Y,,
Detail,OCCUR_CODE_19,This field defines the Occurrence Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence code is for a single date in time and does not span over multiple days. Segment Repeat,Claim,Text,2,7268,7269,Y,701,Y,,
Detail,OCCUR_DATE_19,Date associated with OCCUR_CODE_19.  Expected when corresponding OCCUR_CODE is submitted. Segment Repeat,Claim,"Date
YYYYMMDD",8,7270,7277,Y,702,Y,,
Detail,OCCUR_CODE_20,This field defines the Occurrence Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence code is for a single date in time and does not span over multiple days. Segment Repeat,Claim,Text,2,7278,7279,Y,703,Y,,
Detail,OCCUR_DATE_20,Date associated with OCCUR_CODE_20.  Expected when corresponding OCCUR_CODE is submitted. Segment Repeat.,Claim,"Date
YYYYMMDD",8,7280,7287,Y,704,Y,,
Detail,OCCUR_CODE_21,This field defines the Occurrence Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence code is for a single date in time and does not span over multiple days.,Claim,Text,2,7288,7289,Y,705,Y,,
Detail,OCCUR_DATE_21,Date associated with OCCUR_CODE_21.  Expected when corresponding OCCUR_CODE is submitted.  Segment Repeat,Claim,"Date
YYYYMMDD",8,7290,7297,Y,706,Y,,
Detail,OCCUR_CODE_22,This field defines the Occurrence Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence code is for a single date in time and does not span over multiple days. Segment Repeat,Claim,Text,2,7298,7299,Y,707,Y,,
Detail,OCCUR_DATE_22,Date associated with OCCUR_CODE_22.  Expected when corresponding OCCUR_CODE is submitted.  Segment Repeat,Claim,"Date
YYYYMMDD",8,7300,7307,Y,708,Y,,
Detail,OCCUR_CODE_23,This field defines the Occurrence Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence code is for a single date in time and does not span over multiple days. Segment Repeat,Claim,Text,2,7308,7309,Y,709,Y,,
Detail,OCCUR_DATE_23,Date associated with OCCUR_CODE_23.  Expected when corresponding OCCUR_CODE is submitted.  Segment Repeat,Claim,"Date
YYYYMMDD",8,7310,7317,Y,710,Y,,
Detail,OCCUR_CODE_24,This field defines the Occurrence Codes associated with this service.  These codes are used to record significant occurrences connected with claims that can affect benefits and payment.  The occurrence code is for a single date in time and does not span over multiple days. Segment Repeat,Claim,Text,2,7318,7319,Y,711,Y,,
Detail,OCCUR_DATE_24,Date associated with OCCUR_CODE_24.  Expected when corresponding OCCUR_CODE is submitted.  Segment Repeat,Claim,"Date
YYYYMMDD",8,7320,7327,Y,712,Y,,
Detail,DOCUMENT_CONTROL_NUMBER,The value in this field represents the client specific document control number.,Claim,Text,20,7328,7347,N,713,N,,
Detail,CLAIM_ATTACHMENT_TYPE_CODE,"This field indicates the title or contents of a document, report or supporting item.  Expected values are defined in the CMS 837 transaction.  (2300, PWK01)",Claim,Text,2,7348,7349,N,714,N,,
Detail,CLAIM_ATTACHMENT_TRANSMIT_CODE,"This field represents the code defining timing, transmission method or format by which reports are to be sent.  Expected values are defined in the CMS 837 transaction.  (2300, PWK02)",Claim,Text,2,7350,7351,N,715,N,,
Detail,CLAIM_ACN,"This field represents the code designating the system/method of code structure used for identification.  (2300, PWK05)",Claim,Text,80,7352,7431,N,716,N,,
Detail,CLAIM_ATTACHMENT_TYPE_CODE_01,"This field indicates the title or contents of a document, report or supporting item.  Expected values are defined in the CMS 837 transaction.  (2300, PWK01)",Claim,Text,2,7432,7433,N,717,N,,
Detail,CLAIM_ATTACHMENT_TRANSMIT_CODE_01,"This field represents the code defining timing, transmission method or format by which reports are to be sent.  Expected values are defined in the CMS 837 transaction.  (2300, PWK02)",Claim,Text,2,7434,7435,N,718,N,,
Detail,CLAIM_ACN_01,"This field represents the code designating the system/method of code structure used for identification.  (2300, PWK05)",Claim,Text,80,7436,7515,N,719,N,,
Detail,CLAIM_ATTACHMENT_TYPE_CODE_02,"This field indicates the title or contents of a document, report or supporting item.  Expected values are defined in the CMS 837 transaction.  (2300, PWK01)",Claim,Text,2,7516,7517,N,720,N,,
Detail,CLAIM_ATTACHMENT_TRANSMIT_CODE_02,"This field represents the code defining timing, transmission method or format by which reports are to be sent.  Expected values are defined in the CMS 837 transaction.  (2300, PWK02)",Claim,Text,2,7518,7519,N,721,N,,
Detail,CLAIM_ACN_02,"This field represents the code designating the system/method of code structure used for identification.  (2300, PWK05)",Claim,Text,80,7520,7599,N,722,N,,
Detail,CLAIM_ATTACHMENT_TYPE_CODE_03,"This field indicates the title or contents of a document, report or supporting item.  Expected values are defined in the CMS 837 transaction.  (2300, PWK01)",Claim,Text,2,7600,7601,N,723,N,,
Detail,CLAIM_ATTACHMENT_TRANSMIT_CODE_03,"This field represents the code defining timing, transmission method or format by which reports are to be sent.  Expected values are defined in the CMS 837 transaction.  (2300, PWK02)",Claim,Text,2,7602,7603,N,724,N,,
Detail,CLAIM_ACN_03,"This field represents the code designating the system/method of code structure used for identification.  (2300, PWK05)",Claim,Text,80,7604,7683,N,725,N,,
Detail,CLAIM_ATTACHMENT_TYPE_CODE_04,"This field indicates the title or contents of a document, report or supporting item.  Expected values are defined in the CMS 837 transaction.  (2300, PWK01)",Claim,Text,2,7684,7685,N,726,N,,
Detail,CLAIM_ATTACHMENT_TRANSMIT_CODE_04,"This field represents the code defining timing, transmission method or format by which reports are to be sent.  Expected values are defined in the CMS 837 transaction.  (2300, PWK02)",Claim,Text,2,7686,7687,N,727,N,,
Detail,CLAIM_ACN_04,"This field represents the code designating the system/method of code structure used for identification.  (2300, PWK05)",Claim,Text,80,7688,7767,N,728,N,,
Detail,CLAIM_ATTACHMENT_TYPE_CODE_05,"This field indicates the title or contents of a document, report or supporting item.  Expected values are defined in the CMS 837 transaction.  (2300, PWK01)",Claim,Text,2,7768,7769,N,729,N,,
Detail,CLAIM_ATTACHMENT_TRANSMIT_CODE_05,"This field represents the code defining timing, transmission method or format by which reports are to be sent.  Expected values are defined in the CMS 837 transaction.  (2300, PWK02)",Claim,Text,2,7770,7771,N,730,N,,
Detail,CLAIM_ACN_05,"This field represents the code designating the system/method of code structure used for identification.  (2300, PWK05)",Claim,Text,80,7772,7851,N,731,N,,
Detail,CLAIM_ATTACHMENT_TYPE_CODE_06,"This field indicates the title or contents of a document, report or supporting item.  Expected values are defined in the CMS 837 transaction.  (2300, PWK01)",Claim,Text,2,7852,7853,N,732,N,,
Detail,CLAIM_ATTACHMENT_TRANSMIT_CODE_06,"This field represents the code defining timing, transmission method or format by which reports are to be sent.  Expected values are defined in the CMS 837 transaction.  (2300, PWK02)",Claim,Text,2,7854,7855,N,733,N,,
Detail,CLAIM_ACN_06,"This field represents the code designating the system/method of code structure used for identification.  (2300, PWK05)",Claim,Text,80,7856,7935,N,734,N,,
Detail,CLAIM_ATTACHMENT_TYPE_CODE_07,"This field indicates the title or contents of a document, report or supporting item.  Expected values are defined in the CMS 837 transaction.  (2300, PWK01)",Claim,Text,2,7936,7937,N,735,N,,
Detail,CLAIM_ATTACHMENT_TRANSMIT_CODE_07,"This field represents the code defining timing, transmission method or format by which reports are to be sent.  Expected values are defined in the CMS 837 transaction.  (2300, PWK02)",Claim,Text,2,7938,7939,N,736,N,,
Detail,CLAIM_ACN_07,"This field represents the code designating the system/method of code structure used for identification.  (2300, PWK05)",Claim,Text,80,7940,8019,N,737,N,,
Detail,CLAIM_ATTACHMENT_TYPE_CODE_08,"This field indicates the title or contents of a document, report or supporting item.  Expected values are defined in the CMS 837 transaction.  (2300, PWK01)",Claim,Text,2,8020,8021,N,738,N,,
Detail,CLAIM_ATTACHMENT_TRANSMIT_CODE_08,"This field represents the code defining timing, transmission method or format by which reports are to be sent.  Expected values are defined in the CMS 837 transaction.  (2300, PWK02)",Claim,Text,2,8022,8023,N,739,N,,
Detail,CLAIM_ACN_08,"This field represents the code designating the system/method of code structure used for identification.  (2300, PWK05)",Claim,Text,80,8024,8103,N,740,N,,
Detail,CLAIM_ATTACHMENT_TYPE_CODE_09,"This field indicates the title or contents of a document, report or supporting item.  Expected values are defined in the CMS 837 transaction.  (2300, PWK01)",Claim,Text,2,8104,8105,N,741,N,,
Detail,CLAIM_ATTACHMENT_TRANSMIT_CODE_09,"This field represents the code defining timing, transmission method or format by which reports are to be sent.  Expected values are defined in the CMS 837 transaction.  (2300, PWK02)",Claim,Text,2,8106,8107,N,742,N,,
Detail,CLAIM_ACN_09,"This field represents the code designating the system/method of code structure used for identification.  (2300, PWK05)",Claim,Text,80,8108,8187,N,743,N,,
Detail,CLAIM_ATTACHMENT_TYPE_CODE_10,"This field indicates the title or contents of a document, report or supporting item.  Expected values are defined in the CMS 837 transaction.  (2300, PWK01)",Claim,Text,2,8188,8189,N,744,N,,
Detail,CLAIM_ATTACHMENT_TRANSMIT_CODE_10,"This field represents the code defining timing, transmission method or format by which reports are to be sent.  Expected values are defined in the CMS 837 transaction.  (2300, PWK02)",Claim,Text,2,8190,8191,N,745,N,,
Detail,CLAIM_ACN_10,"This field represents the code designating the system/method of code structure used for identification.  (2300, PWK05)",Claim,Text,80,8192,8271,N,746,N,,
Detail,ADJUSTMENT_NUMBER,"The value in this field provides information on how many adjustments have been made to the claim line (0 - original, greater than 0 indicates times adjusted).",Line,Text,1,8272,8272,N,747,N,,
Detail,ADJ_CODE_01,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored 'at this time.  This field is line level.",Line,Text,10,8273,8282,N,748,N,,
Detail,ADJ_TYPE_01,"This field defines the source of the line level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc. Expected if corresponding ADJ_CODE is present.",Line,Text,2,8283,8284,N,749,N,,
Detail,ADJUSTOR_ID_01,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted. Expected if corresponding ADJ_CODE is present.,Line,Text,20,8285,8304,N,750,N,,
Detail,ADJ_CODE_02,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is line level.",Line,Text,10,8305,8314,N,751,N,,
Detail,ADJ_TYPE_02,"This field defines the source of the line level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc. Expected if corresponding ADJ_CODE is present.",Line,Text,2,8315,8316,N,752,N,,
Detail,ADJUSTOR_ID_02,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted. Expected if corresponding ADJ_CODE is present.,Line,Text,20,8317,8336,N,753,N,,
Detail,ADJ_CODE_03,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is line level.",Line,Text,10,8337,8346,N,754,N,,
Detail,ADJ_TYPE_03,"This field defines the source of the line level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc. Expected if corresponding ADJ_CODE is present.",Line,Text,2,8347,8348,N,755,N,,
Detail,ADJUSTOR_ID_03,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted. Expected if corresponding ADJ_CODE is present.,Line,Text,20,8349,8368,N,756,N,,
Detail,ADJ_CODE_04,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is line level.",Line,Text,10,8369,8378,N,757,N,,
Detail,ADJ_TYPE_04,"This field defines the source of the line level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc. Expected if corresponding ADJ_CODE is present.",Line,Text,2,8379,8380,N,758,N,,
Detail,ADJUSTOR_ID_04,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted. Expected if corresponding ADJ_CODE is present.,Line,Text,20,8381,8400,N,759,N,,
Detail,ADJ_CODE_05,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is line level.",Line,Text,10,8401,8410,N,760,N,,
Detail,ADJ_TYPE_05,"This field defines the source of the line level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc. Expected if corresponding ADJ_CODE is present.",Line,Text,2,8411,8412,N,761,N,,
Detail,ADJUSTOR_ID_05,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted. Expected if corresponding ADJ_CODE is present.,Line,Text,20,8413,8432,N,762,N,,
Detail,ADJ_CODE_06,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is line level.",Line,Text,10,8433,8442,N,763,N,,
Detail,ADJ_TYPE_06,"This field defines the source of the line level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc. Expected if corresponding ADJ_CODE is present.",Line,Text,2,8443,8444,N,764,N,,
Detail,ADJUSTOR_ID_06,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding ADJ_CODE is present.,Line,Text,20,8445,8464,N,765,N,,
Detail,ADJ_CODE_07,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.",Line,Text,10,8465,8474,N,766,N,,
Detail,ADJ_TYPE_07,"This field defines the source of the line level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc. Expected if corresponding ADJ_CODE is present.",Line,Text,2,8475,8476,N,767,N,,
Detail,ADJUSTOR_ID_07,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding ADJ_CODE is present.,Line,Text,20,8477,8496,N,768,N,,
Detail,ADJ_CODE_08,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is line level.",Line,Text,10,8497,8506,N,769,N,,
Detail,ADJ_TYPE_08,"This field defines the source of the line level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding ADJ_CODE is present.",Line,Text,2,8507,8508,N,770,N,,
Detail,ADJUSTOR_ID_08,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding ADJ_CODE is present.,Line,Text,20,8509,8528,N,771,N,,
Detail,ADJ_CODE_09,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is line level.",Line,Text,10,8529,8538,N,772,N,,
Detail,ADJ_TYPE_09,"This field defines the source of the line level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding ADJ_CODE is present.",Line,Text,2,8539,8540,N,773,N,,
Detail,ADJUSTOR_ID_09,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding ADJ_CODE is present.,Line,Text,20,8541,8560,N,774,N,,
Detail,ADJ_CODE_10,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is line level.",Line,Text,10,8561,8570,N,775,N,,
Detail,ADJ_TYPE_10,"This field defines the source of the line level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding ADJ_CODE is present.",Line,Text,2,8571,8572,N,776,N,,
Detail,ADJUSTOR_ID_10,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding ADJ_CODE is present.,Line,Text,20,8573,8592,N,777,N,,
Detail,CLAIM_ADJUSTMENT_NUMBER,"The value in this field provides information on how many adjustments have been made to the claim (0 - original, greater than 0 indicates number of times adjusted).",Claim,Text,1,8593,8593,N,778,N,,
Detail,CLAIM_ADJ_CODE_01,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is claim level.",Claim,Text,10,8594,8603,N,779,N,,
Detail,CLAIM_ADJ_TYPE_01,"This field defines the source of the claim level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding CLAIM_ADJ_CODE is present.",Claim,Text,2,8604,8605,N,780,N,,
Detail,CLAIM_ADJUSTOR_ID_01,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding CLAIM_ADJ_CODE is present.,Claim,Text,20,8606,8625,N,781,N,,
Detail,CLAIM_ADJ_CODE_02,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is claim level.",Claim,Text,10,8626,8635,N,782,N,,
Detail,CLAIM_ADJ_TYPE_02,"This field defines the source of the claim level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding CLAIM_ADJ_CODE is present.",Claim,Text,2,8636,8637,N,783,N,,
Detail,CLAIM_ADJUSTOR_ID_02,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding CLAIM_ADJ_CODE is present.,Claim,Text,20,8638,8657,N,784,N,,
Detail,CLAIM_ADJ_CODE_03,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is claim level.",Claim,Text,10,8658,8667,N,785,N,,
Detail,CLAIM_ADJ_TYPE_03,"This field defines the source of the claim level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding CLAIM_ADJ_CODE is present.",Claim,Text,2,8668,8669,N,786,N,,
Detail,CLAIM_ADJUSTOR_ID_03,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding CLAIM_ADJ_CODE is present.,Claim,Text,20,8670,8689,N,787,N,,
Detail,CLAIM_ADJ_CODE_04,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is claim level.",Claim,Text,10,8690,8699,N,788,N,,
Detail,CLAIM_ADJ_TYPE_04,"This field defines the source of the claim level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding CLAIM_ADJ_CODE is present.",Claim,Text,2,8700,8701,N,789,N,,
Detail,CLAIM_ADJUSTOR_ID_04,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding CLAIM_ADJ_CODE is present.,Claim,Text,20,8702,8721,N,790,N,,
Detail,CLAIM_ADJ_CODE_05,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is claim level.",Claim,Text,10,8722,8731,N,791,N,,
Detail,CLAIM_ADJ_TYPE_05,"This field defines the source of the claim level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding CLAIM_ADJ_CODE is present.",Claim,Text,2,8732,8733,N,792,N,,
Detail,CLAIM_ADJUSTOR_ID_05,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding CLAIM_ADJ_CODE is present.,Claim,Text,20,8734,8753,N,793,N,,
Detail,CLAIM_ADJ_CODE_06,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is claim level.",Claim,Text,10,8754,8763,N,794,N,,
Detail,CLAIM_ADJ_TYPE_06,"This field defines the source of the claim level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding CLAIM_ADJ_CODE is present.",Claim,Text,2,8764,8765,N,795,N,,
Detail,CLAIM_ADJUSTOR_ID_06,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding CLAIM_ADJ_CODE is present.,Claim,Text,20,8766,8785,N,796,N,,
Detail,CLAIM_ADJ_CODE_07,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is claim level.",Claim,Text,10,8786,8795,N,797,N,,
Detail,CLAIM_ADJ_TYPE_07,"This field defines the source of the claim level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding CLAIM_ADJ_CODE is present.",Claim,Text,2,8796,8797,N,798,N,,
Detail,CLAIM_ADJUSTOR_ID_07,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding CLAIM_ADJ_CODE is present.,Claim,Text,20,8798,8817,N,799,N,,
Detail,CLAIM_ADJ_CODE_08,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is claim level.",Claim,Text,10,8818,8827,N,800,N,,
Detail,CLAIM_ADJ_TYPE_08,"This field defines the source of the claim level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding CLAIM_ADJ_CODE is present.",Claim,Text,2,8828,8829,N,801,N,,
Detail,CLAIM_ADJUSTOR_ID_08,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding CLAIM_ADJ_CODE is present.,Claim,Text,20,8830,8849,N,802,N,,
Detail,CLAIM_ADJ_CODE_09,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is claim level.",Claim,Text,10,8850,8859,N,803,N,,
Detail,CLAIM_ADJ_TYPE_09,"This field defines the source of the claim level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding CLAIM_ADJ_CODE is present.",Claim,Text,2,8860,8861,N,804,N,,
Detail,CLAIM_ADJUSTOR_ID_09,This is the username for the individual that processed the adjustment in the client's claim system and is associated with the claim line adjusted.  Expected if corresponding CLAIM_ADJ_CODE is present.,Claim,Text,20,8862,8881,N,805,N,,
Detail,CLAIM_ADJ_CODE_10,"This field is the client’s adjustment code, as maintained in their system.  Should this information be needed for further data analysis, a detailed mapping will be requested from the client.  Mapping and/or descriptions will not be stored at this time.  This field is claim level.",Claim,Text,10,8882,8891,N,806,N,,
Detail,CLAIM_ADJ_TYPE_10,"This field defines the source of the claim level adjustment that was completed by the client.  Examples might be Internally Generated, Contractual, Government Mandate, etc.  Expected if corresponding CLAIM_ADJ_CODE is present.",Claim,Text,2,8892,8893,N,807,N,,
Detail,CLAIM_ADJUSTOR_ID_10,Client employee who actually made the claim level adjustment.  Expected if corresponding CLAIM_ADJ_CODE is present.,Claim,Text,20,8894,8913,N,808,N,,
Detail,ANESTHESIA_TIME,This field represents the amount of time that anesthesia was administered to the patient during the service provided.  Time is submitted in whole minutes.,Line,"Numeric
9(10)",10,8914,8923,N,809,N,,
Detail,CHECK_NUM,This field stores the actual check number on which this claim was paid. For incoming (TBA) claims the field should be left blank. The actual check number is populated in the history file.,Claim,Text,25,8924,8948,N,810,N,,
Detail,PLATFORM_CODE,"Please provide the name of the claim system used to process the claim.  Examples are Nasco, Facets, Amysis, Power MHS, etc.",Claim,Text,20,8949,8968,N,811,N,,
Detail,DATA_SOURCE,"The value in this field defines from where the claim data was pulled within the client’s platform. For example, if the client is a Facets client, the client platform would be Facets and the data may have been pulled from the Data Warehouse.",Claim,Text,20,8969,8988,N,812,N,,
Detail,EMERGENCY_INDICATOR_YN,"Is populated if the service was emergency service.  This field defines whether or not the service being billed is the result of an EPSDT screening service and is required by CMS when Medicaid services are the result of a screening referral.  The screening service would be submitted with the value 'N'.  A 'Y' value indicates EPSDT involvement; an 'N' value indicates no EPSDT involvement. (2400, SV111)",Line,Text,1,8989,8989,N,813,N,,
Detail,PAPER_INDICATOR,"Claim submission type. Valid values are:
P - Paper
E - Electronic",Claim,Text,1,8990,8990,N,814,N,,
Detail,CIT_RESTRICTED_ID,This field is a free-form field used to define CIT restrictions that allow clients to define an appropriate level of security for internal data access. This field is not to be used until the client and Implementation Services Director determine a need.,Claim,Text,25,8991,9015,N,815,N,,
Detail,CV_US_ONLY_YN,The value in this field indicates whether the claim has to be routed to U.S. only resources. A 'Y' value indicates the claim has to be routed to U.S. only resources.,Claim,Text,1,9016,9016,N,816,N,,
Detail,CDF_TEXT_01,Line level client defined field.  Use of this field should be discussed to ensure proper utilization and storage prior to the addition of data in the file.  Data provided in this field will be reflected on the Invoice Detail Report (IDR).,Line,Text,32,9017,9048,N,817,N,,
Detail,CDF_TEXT_02,Line level client defined field.  Use of this field should be discussed to ensure proper utilization and storage prior to the addition of data in the file.  Data provided in this field will be reflected on the Invoice Detail Report (IDR).,Line,Text,32,9049,9080,N,818,N,,
Detail,CDF_TEXT_03,Line level client defined field.  Use of this field should be discussed to ensure proper utilization and storage prior to the addition of data in the file.  Data provided in this field will be reflected on the Invoice Detail Report (IDR).,Line,Text,32,9081,9112,N,819,N,,
Detail,CLAIM_CDF_TEXT_01,Claim level client defined field.  Use of this field should be discussed to ensure proper utilization and storage prior to the addition of data in the file.,Claim,Text,32,9113,9144,N,820,N,,
Detail,CLAIM_CDF_TEXT_02,Claim level client defined field.  Use of this field should be discussed to ensure proper utilization and storage prior to the addition of data in the file.,Claim,Text,32,9145,9176,N,821,N,,
Detail,CLAIM_CDF_TEXT_03,Claim level client defined field.  Use of this field should be discussed to ensure proper utilization and storage prior to the addition of data in the file.,Claim,Text,32,9177,9208,N,822,N,,
Detail,SUB_MEMBER_GROUP_NUMBER,The value in this field represents the Subscriber's group number ( 2000B.SBR03 ),Claim,,,9209,9208,Y,823,Y,,
Detail,SUB_CLAIM_FILING_CODE,"The claim filing indicator is a CMS value that identifies the type of insurance for the submitted claim.  This is not to be confused with the CLAIM_TYPE of this layout. Expected values are found on a separate tab.  (2000B, SBR02) (2000C, PAT06)",Claim,,,9209,9208,Y,824,Y,,
Detail,ASSIGNMENT_ACCEPTANCE,"The value in this field represents whether the Provider agrees to accept assignment under terms of the
payer's program, select ""Yes"" from the drop-down list. Otherwise,
select ""No."" (2300.CLM08)",Claim,,,9209,9208,Y,825,Y,,
Detail,INFORMATION_RELEASE,"The value in this field represents whether the Patient has signed the release, allowing the sharing of the information (2300.CLM09)",Claim,,,9209,9208,Y,826,Y,,
Detail,REPRICER_NAME/EXTERNAL_EDITOR,The value in the field represent the Name of the Repricer,Line,,,9209,9208,Y,827,Y,,
Detail,CLAIM_FREQUENCY_CODE,"This code specifies the frequency of the claim and is the third position of the UBC Form Bill Type.  (2300, CLM05-3)",Claim,,,9209,9208,Y,828,Y,,
Detail,SUB_HCPCS_DESC,The value in this field represents the Level1 (CPT) or Level2 (HCPCS) procedure code description submitted by the provider for this service line (2400.SV202.07),Line,,,9209,9208,Y,829,Y,,
Detail,PPO_discount,The value in the field represent the difference in the Billed and allowed amount,Line,,,9209,9208,Y,,Y,,
Detail,PPO_ID,The value in the field represent the Benfit network name,Line,,,9209,9208,,,Y,,
Detail,DRG_Rate,The value in this field represents the DRG rate,Line,,,9209,9208,,,Y,,
Detail,CLAIM_NUM,The value in this field represent the claim fact key or the Claim versioning number.,Claim,,,9209,9208,Y,,Y,,
Detail,RECORD_IDENTIFIER,The value in this field represent the unique identifier of a claim record used for tracking,Claim,,,9209,9208,Y,,Y,,
Detail,RAY_IDENTIFIER,The value in this field represent the unique identifier of a claim used for tracking even during retry the claim,Claim,,,9209,9208,Y,,Y,,
Detail,EXECUTION_IDENTIFIER,The value in this field represent the unique identifier on a job level used for tracking,Claim,,,9209,9208,Y,,Y,,
,,,,,,,,,,,,
Trailer,TRAILER_CONSTANT,Field valued with ‘TRAILER’,File,Text,7,1,7,Y,1,Y,,
Trailer,DETAIL_COUNT,This field contains the total number of DETAIL records in the file.,File,Numeric,10,8,17,Y,2,Y,,
Trailer,RUN_DATE,This field contains the date of the file run.,File,"Date
YYYYMMDD",8,18,25,Y,3,Y,,
Trailer,RUN_TIME,This field contains the time of the file run.,File,Time,6,26,31,Y,4,Y,,
Trailer,FILLER,"For Fixed Width files only.  The trailer record is right-padded with spaces to equal the full length of the claim data records, taking into account the characters included in the client defined field.

The length of this field varies depending on number of characters in detail line.  The ending position will have the same ending character as the detail line.",File,Text,9168,32,9199,Y,5,Y,,
```

## Secondary Editing OB/V26.1.0.0/EdifecsProduct_MappingSpec_OB Secondary Editing_837_DFF_to_EDI Conversion_V1.0.xlsx — sample prof1

```csv
Column1.1,Column1.2,Column1.3,Column1.4,Column1.5,Column1.6,Column1.7,Column1.8,Column1.9,Column1.10,Column1.11,Column1.12,Column1.13,Column1.14,Column1.15,Column1.16,Column1.17,Column1.18,Column1.19,Column1.20,Column1.21,Column1.22,Column1.23,Column1.24,Column1.25,Column1.26,Column1.27,Column1.28,Column1.29,Column1.30,Column1.31,Column1.32,Column1.33,Column1.34,Column1.35,Column1.36,Column1.37,Column1.38,Column1.39,Column1.40,Column1.41,Column1.42,Column1.43,Column1.44,Column1.45,Column1.46,Column1.47,Column1.48,Column1.49,Column1.50,Column1.51,Column1.52,Column1.53,Column1.54,Column1.55,Column1.56,Column1.57,Column1.58,Column1.59,Column1.60,Column1.61,Column1.62,Column1.63,Column1.64,Column1.65,Column1.66,Column1.67,Column1.68,Column1.69,Column1.70,Column1.71,Column1.72,Column1.73,Column1.74,Column1.75,Column1.76,Column1.77,Column1.78,Column1.79,Column1.80,Column1.81,Column1.82,Column1.83,Column1.84,Column1.85,Column1.86,Column1.87,Column1.88,Column1.89,Column1.90,Column1.91,Column1.92,Column1.93,Column1.94,Column1.95,Column1.96,Column1.97,Column1.98,Column1.99,Column1.100,Column1.101,Column1.102,Column1.103,Column1.104,Column1.105,Column1.106,Column1.107,Column1.108,Column1.109,Column1.110,Column1.111,Column1.112,Column1.113,Column1.114,Column1.115,Column1.116,Column1.117,Column1.118,Column1.119,Column1.120,Column1.121,Column1.122,Column1.123,Column1.124,Column1.125,Column1.126,Column1.127,Column1.128,Column1.129,Column1.130,Column1.131,Column1.132,Column1.133,Column1.134,Column1.135,Column1.136,Column1.137,Column1.138,Column1.139,Column1.140,Column1.141,Column1.142,Column1.143,Column1.144,Column1.145,Column1.146,Column1.147,Column1.148,Column1.149,Column1.150,Column1.151,Column1.152,Column1.153,Column1.154,Column1.155,Column1.156,Column1.157,Column1.158,Column1.159,Column1.160,Column1.161,Column1.162,Column1.163,Column1.164,Column1.165,Column1.166,Column1.167,Column1.168,Column1.169,Column1.170,Column1.171,Column1.172,Column1.173,Column1.174,Column1.175,Column1.176,Column1.177,Column1.178,Column1.179,Column1.180,Column1.181,Column1.182,Column1.183,Column1.184,Column1.185,Column1.186,Column1.187,Column1.188,Column1.189,Column1.190,Column1.191,Column1.192,Column1.193,Column1.194,Column1.195,Column1.196,Column1.197,Column1.198,Column1.199,Column1.200,Column1.201,Column1.202,Column1.203,Column1.204,Column1.205,Column1.206,Column1.207,Column1.208,Column1.209,Column1.210,Column1.211,Column1.212,Column1.213,Column1.214,Column1.215,Column1.216,Column1.217,Column1.218,Column1.219,Column1.220,Column1.221,Column1.222,Column1.223,Column1.224,Column1.225,Column1.226,Column1.227,Column1.228,Column1.229,Column1.230,Column1.231,Column1.232,Column1.233,Column1.234,Column1.235,Column1.236,Column1.237,Column1.238,Column1.239,Column1.240,Column1.241,Column1.242,Column1.243,Column1.244,Column1.245,Column1.246,Column1.247,Column1.248,Column1.249,Column1.250,Column1.251,Column1.252,Column1.253,Column1.254,Column1.255,Column1.256,Column1.257,Column1.258,Column1.259,Column1.260,Column1.261,Column1.262,Column1.263,Column1.264,Column1.265,Column1.266,Column1.267,Column1.268,Column1.269,Column1.270,Column1.271,Column1.272,Column1.273,Column1.274,Column1.275,Column1.276,Column1.277,Column1.278,Column1.279,Column1.280,Column1.281,Column1.282,Column1.283,Column1.284,Column1.285,Column1.286,Column1.287,Column1.288,Column1.289,Column1.290,Column1.291,Column1.292,Column1.293,Column1.294,Column1.295,Column1.296,Column1.297,Column1.298,Column1.299,Column1.300,Column1.301,Column1.302,Column1.303,Column1.304,Column1.305,Column1.306,Column1.307,Column1.308,Column1.309,Column1.310,Column1.311,Column1.312,Column1.313,Column1.314,Column1.315,Column1.316,Column1.317,Column1.318,Column1.319,Column1.320,Column1.321,Column1.322,Column1.323,Column1.324,Column1.325,Column1.326,Column1.327,Column1.328,Column1.329,Column1.330,Column1.331,Column1.332,Column1.333,Column1.334,Column1.335,Column1.336,Column1.337,Column1.338,Column1.339,Column1.340,Column1.341,Column1.342,Column1.343,Column1.344,Column1.345,Column1.346,Column1.347,Column1.348,Column1.349,Column1.350,Column1.351,Column1.352,Column1.353,Column1.354,Column1.355,Column1.356,Column1.357,Column1.358,Column1.359,Column1.360,Column1.361,Column1.362,Column1.363,Column1.364,Column1.365,Column1.366,Column1.367,Column1.368,Column1.369,Column1.370,Column1.371,Column1.372,Column1.373,Column1.374,Column1.375,Column1.376,Column1.377,Column1.378,Column1.379,Column1.380,Column1.381,Column1.382,Column1.383,Column1.384,Column1.385,Column1.386,Column1.387,Column1.388,Column1.389,Column1.390,Column1.391,Column1.392,Column1.393,Column1.394,Column1.395,Column1.396,Column1.397,Column1.398,Column1.399,Column1.400,Column1.401,Column1.402,Column1.403,Column1.404,Column1.405,Column1.406,Column1.407,Column1.408,Column1.409,Column1.410,Column1.411,Column1.412,Column1.413,Column1.414,Column1.415,Column1.416,Column1.417,Column1.418,Column1.419,Column1.420,Column1.421,Column1.422,Column1.423,Column1.424,Column1.425,Column1.426,Column1.427,Column1.428,Column1.429,Column1.430,Column1.431,Column1.432,Column1.433,Column1.434,Column1.435,Column1.436,Column1.437,Column1.438,Column1.439,Column1.440,Column1.441,Column1.442,Column1.443,Column1.444,Column1.445,Column1.446,Column1.447,Column1.448,Column1.449,Column1.450,Column1.451,Column1.452,Column1.453,Column1.454,Column1.455,Column1.456,Column1.457,Column1.458,Column1.459,Column1.460,Column1.461,Column1.462,Column1.463,Column1.464,Column1.465,Column1.466,Column1.467,Column1.468,Column1.469,Column1.470,Column1.471,Column1.472,Column1.473,Column1.474,Column1.475,Column1.476,Column1.477,Column1.478,Column1.479,Column1.480,Column1.481,Column1.482,Column1.483,Column1.484,Column1.485,Column1.486,Column1.487,Column1.488,Column1.489,Column1.490,Column1.491,Column1.492,Column1.493,Column1.494,Column1.495,Column1.496,Column1.497,Column1.498,Column1.499,Column1.500,Column1.501,Column1.502,Column1.503,Column1.504,Column1.505,Column1.506,Column1.507,Column1.508,Column1.509,Column1.510,Column1.511,Column1.512,Column1.513,Column1.514,Column1.515,Column1.516,Column1.517,Column1.518,Column1.519,Column1.520,Column1.521,Column1.522,Column1.523
HEADER,T,1,20250814,1,P,PROF,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,
0001,,M000004864,,19760906,M,,,,,TNM0G2931,Ranjith,David,X,,Self,,,2.02307E+13,,,,Z00.00,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,99-9999999,,,,,,Supplier,Supplier_Clinic,Supplier_Clinic,,,2050 E Osceola Pkwy,redcross street,Kissimmee,FL,34743,8602,US,,,,6171231234,,,,,,,,,,,,,,1,20230612,,11,,1,,,,,,,,,,,,80061,,,,,,,,,UN,1,1000,,,,,,,,,,,,,,1,700,,,,,0,0,0,,,,,,,,,,,,,,,,Y,1000,0,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,MA,Ranjith,David,X,,3576 Airport Way Unit 9,,Fairbanks,AK,99709,4760,US,,19760906,M,,3576 Airport Way Unit 9,,Fairbanks,AK,99709,4760,US,,,,,,,,2050 E Osceola Pkwy,redcross street,Kissimmee,FL,34743,8602,US,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,1,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,Y,Y,Yes,Speciality Location,1851722417,110 Liberty Dr,,Clemson,SC,296313157,US,SOURCE_TYPE_IDENTIFIER,LIPID PANEL,300,Zelis,,184036,9482B456-0391-4BD7-9572-2DB6A3719508,90920123-2348-4EA0-B875-0D9A500F1722,DA291DAE-C1D9-40C6-8E9C-87EB921E5A9C
TRAILER,1,20250814,35916,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,
```

## Secondary Editing OB/V26.1.0.0/EdifecsProduct_MappingSpec_OB Secondary Editing_837_DFF_to_EDI Conversion_V1.0.xlsx — sample inst2

```csv
Column1,Column2,Column3,Column4,Column5,Column6,Column7,Column8,Column9,Column10,Column11,Column12,Column13,Column14,Column15,Column16,Column17,Column18,Column19,Column20,Column21,Column22,Column23,Column24,Column25,Column26,Column27,Column28,Column29,Column30,Column31,Column32,Column33,Column34,Column35,Column36,Column37,Column38,Column39,Column40,Column41,Column42,Column43,Column44,Column45,Column46,Column47,Column48,Column49,Column50,Column51,Column52,Column53,Column54,Column55,Column56,Column57,Column58,Column59,Column60,Column61,Column62,Column63,Column64,Column65,Column66,Column67,Column68,Column69,Column70,Column71,Column72,Column73,Column74,Column75,Column76,Column77,Column78,Column79,Column80,Column81,Column82,Column83,Column84,Column85,Column86,Column87,Column88,Column89,Column90,Column91,Column92,Column93,Column94,Column95,Column96,Column97,Column98,Column99,Column100,Column101,Column102,Column103,Column104,Column105,Column106,Column107,Column108,Column109,Column110,Column111,Column112,Column113,Column114,Column115,Column116,Column117,Column118,Column119,Column120,Column121,Column122,Column123,Column124,Column125,Column126,Column127,Column128,Column129,Column130,Column131,Column132,Column133,Column134,Column135,Column136,Column137,Column138,Column139,Column140,Column141,Column142,Column143,Column144,Column145,Column146,Column147,Column148,Column149,Column150,Column151,Column152,Column153,Column154,Column155,Column156,Column157,Column158,Column159,Column160,Column161,Column162,Column163,Column164,Column165,Column166,Column167,Column168,Column169,Column170,Column171,Column172,Column173,Column174,Column175,Column176,Column177,Column178,Column179,Column180,Column181,Column182,Column183,Column184,Column185,Column186,Column187,Column188,Column189,Column190,Column191,Column192,Column193,Column194,Column195,Column196,Column197,Column198,Column199,Column200,Column201,Column202,Column203,Column204,Column205,Column206,Column207,Column208,Column209,Column210,Column211,Column212,Column213,Column214,Column215,Column216,Column217,Column218,Column219,Column220,Column221,Column222,Column223,Column224,Column225,Column226,Column227,Column228,Column229,Column230,Column231,Column232,Column233,Column234,Column235,Column236,Column237,Column238,Column239,Column240,Column241,Column242,Column243,Column244,Column245,Column246,Column247,Column248,Column249,Column250,Column251,Column252,Column253,Column254,Column255,Column256,Column257,Column258,Column259,Column260,Column261,Column262,Column263,Column264,Column265,Column266,Column267,Column268,Column269,Column270,Column271,Column272,Column273,Column274,Column275,Column276,Column277,Column278,Column279,Column280,Column281,Column282,Column283,Column284,Column285,Column286,Column287,Column288,Column289,Column290,Column291,Column292,Column293,Column294,Column295,Column296,Column297,Column298,Column299,Column300,Column301,Column302,Column303,Column304,Column305,Column306,Column307,Column308,Column309,Column310,Column311,Column312,Column313,Column314,Column315,Column316,Column317,Column318,Column319,Column320,Column321,Column322,Column323,Column324,Column325,Column326,Column327,Column328,Column329,Column330,Column331,Column332,Column333,Column334,Column335,Column336,Column337,Column338,Column339,Column340,Column341,Column342,Column343,Column344,Column345,Column346,Column347,Column348,Column349,Column350,Column351,Column352,Column353,Column354,Column355,Column356,Column357,Column358,Column359,Column360,Column361,Column362,Column363,Column364,Column365,Column366,Column367,Column368,Column369,Column370,Column371,Column372,Column373,Column374,Column375,Column376,Column377,Column378,Column379,Column380,Column381,Column382,Column383,Column384,Column385,Column386,Column387,Column388,Column389,Column390,Column391,Column392,Column393,Column394,Column395,Column396,Column397,Column398,Column399,Column400,Column401,Column402,Column403,Column404,Column405,Column406,Column407,Column408,Column409,Column410,Column411,Column412,Column413,Column414,Column415,Column416,Column417,Column418,Column419,Column420,Column421,Column422,Column423,Column424,Column425,Column426,Column427,Column428,Column429,Column430,Column431,Column432,Column433,Column434,Column435,Column436,Column437,Column438,Column439,Column440,Column441,Column442,Column443,Column444,Column445,Column446,Column447,Column448,Column449,Column450,Column451,Column452,Column453,Column454,Column455,Column456,Column457,Column458,Column459,Column460,Column461,Column462,Column463,Column464,Column465,Column466,Column467,Column468,Column469,Column470,Column471,Column472,Column473,Column474,Column475,Column476,Column477,Column478,Column479,Column480,Column481,Column482,Column483,Column484,Column485,Column486,Column487,Column488,Column489,Column490,Column491,Column492,Column493,Column494,Column495,Column496,Column497,Column498,Column499,Column500,Column501,Column502,Column503,Column504,Column505,Column506,Column507,Column508,Column509,Column510,Column511,Column512,Column513,Column514,Column515,Column516,Column517,Column518,Column519,Column520,Column521,Column522,Column523,Column524,Column525,Column526,Column527,Column528,Column529,Column530,Column531,Column532,Column533,Column534,Column535,Column536,Column537,Column538,Column539,Column540,Column541,Column542,Column543,Column544,Column545,Column546,Column547,Column548,Column549,Column550,Column551,Column552,Column553,Column554,Column555,Column556,Column557,Column558,Column559,Column560,Column561,Column562,Column563,Column564,Column565,Column566,Column567,Column568,Column569,Column570,Column571,Column572,Column573,Column574,Column575,Column576,Column577,Column578,Column579,Column580,Column581,Column582,Column583,Column584,Column585,Column586,Column587,Column588,Column589,Column590,Column591,Column592,Column593,Column594,Column595,Column596,Column597,Column598,Column599,Column600,Column601,Column602,Column603,Column604,Column605,Column606,Column607,Column608,Column609,Column610,Column611,Column612,Column613,Column614,Column615,Column616,Column617,Column618,Column619,Column620,Column621,Column622,Column623,Column624,Column625,Column626,Column627,Column628,Column629,Column630,Column631,Column632,Column633,Column634,Column635,Column636,Column637,Column638,Column639,Column640,Column641,Column642,Column643,Column644,Column645,Column646,Column647,Column648,Column649,Column650,Column651,Column652,Column653,Column654,Column655,Column656,Column657,Column658,Column659,Column660,Column661,Column662,Column663,Column664,Column665,Column666,Column667,Column668,Column669,Column670,Column671,Column672,Column673,Column674,Column675,Column676,Column677,Column678,Column679,Column680,Column681,Column682,Column683,Column684,Column685,Column686,Column687,Column688,Column689,Column690,Column691,Column692,Column693,Column694,Column695,Column696,Column697,Column698,Column699,Column700,Column701,Column702,Column703,Column704,Column705,Column706,Column707,Column708,Column709,Column710,Column711,Column712,Column713,Column714,Column715,Column716,Column717,Column718,Column719,Column720,Column721,Column722,Column723,Column724,Column725,Column726,Column727,Column728,Column729,Column730,Column731,Column732,Column733,Column734,Column735,Column736,Column737,Column738,Column739,Column740,Column741,Column742,Column743,Column744,Column745,Column746,Column747,Column748,Column749,Column750,Column751,Column752,Column753,Column754,Column755,Column756,Column757,Column758,Column759,Column760,Column761,Column762,Column763,Column764,Column765,Column766,Column767,Column768,Column769,Column770,Column771,Column772,Column773,Column774,Column775,Column776,Column777,Column778,Column779,Column780,Column781,Column782,Column783,Column784,Column785,Column786,Column787,Column788,Column789,Column790,Column791,Column792,Column793,Column794,Column795,Column796,Column797,Column798,Column799,Column800,Column801,Column802,Column803,Column804,Column805,Column806,Column807,Column808,Column809,Column810,Column811,Column812,Column813,Column814,Column815,Column816,Column817,Column818,Column819,Column820,Column821,Column822,Column823,Column824,Column825,Column826,Column827,Column828,Column829,Column830,Column831,Column832,Column833,Column834,Column835,Column836
HEADER,T,1,20250814,9,P,INST,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,
0001,INST,123456,,19930209,M,,,,,,John,Don,,,Self,,2.02105E+13,,,131,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,20210519,20210519,,,,,1,1,,,,1,,,,,,,,,,,,,,,,R42,N/S,,I10,N/S,,Z23,N/S,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,R42,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,99-9999999,,,,,,,Supplier_Clinic,2050 E Osceola Pkwy,redcross street,Kissimmee,FL,34743,8602,US,,,,,,,,,,,,,,,,,,1,20210519,20210519,301,80053,,,,,,,,,UN,1,100,,,,,,,,,,,,,,,1,70,,,,,0,0,0,,,,,,,,,,,,,,,,,Y,200,0,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,2.02105E+13,,,,,,,,,,,,,,,,,,,,John,Don,,,Test,,Newcity,AS,,,US,,19930209,M,,Test,,Newcity,AS,,,US,,,,,2050 E Osceola Pkwy,redcross street,Kissimmee,FL,34743,8602,US,,,,1053609644,,,208D00000X,,Practitioner 2 Test,Test,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,MA,U,Yes,Zelis,1,COMPREHEN METABOLIC PANEL,30,CON001,,184209,E371183F-61D4-48D2-BC21-84A48357FD39,30BA5E54-E682-49B1-83AD-F5DB490B89CA,5B3A7318-265C-4A2C-905B-4339B096AB62
0002,INST,123456,,19930209,M,,,,,,John,Don,,,Self,,2.02105E+13,,,131,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,20210519,20210519,,,,,1,1,,,,1,,,,,,,,,,,,,,,,R42,N/S,,I10,N/S,,Z23,N/S,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,R42,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,99-9999999,,,,,,,Supplier_Clinic,2050 E Osceola Pkwy,redcross street,Kissimmee,FL,34743,8602,US,,,,,,,,,,,,,,,,,,2,20210519,20210519,301,99211,,,,,,,,,UN,1,100,,,,,,,,,,,,,,,1,70,,,,,0,0,0,,,,,,,,,,,,,,,,,Y,200,0,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,2.02105E+13,,,,,,,,,,,,,,,,,,,,John,Don,,,Test,,Newcity,AS,,,US,,19930209,M,,Test,,Newcity,AS,,,US,,,,,2050 E Osceola Pkwy,redcross street,Kissimmee,FL,34743,8602,US,,,,1053609644,,,208D00000X,,Practitioner 2 Test,Test,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,MA,U,Yes,Zelis,1,OFFICE/OUTPATIENT VISIT EST,30,CON001,,184209,E371183F-61D4-48D2-BC21-84A48357FD39,30BA5E54-E682-49B1-83AD-F5DB490B89CA,5B3A7318-265C-4A2C-905B-4339B096AB62
0001,INST,EMNTEST05,,19890430,M,,,,,,DEN,David,,,Self,,2.02109E+13,,,131,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,20210903,20210903,,,,,1,1,,,,1,,,,,,,,,,,,,,,,R42,N/S,,I10,N/S,,Z23,N/S,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,R42,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,99-9999999,,,,,,,Supplier_Clinic,2050 E Osceola Pkwy,redcross street,Kissimmee,FL,34743,8602,US,,,,,,,,,,,,,,,,,,1,20210903,20210903,301,80053,,,,,,,,,UN,1,100,,,,,,,,,,,,,,,1,70,,,,,0,0,70,,,,,,,,,,,,,,,,,Y,200,0,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,DEN,David,,,PO BOX 75,,Greeley,CO,80639,,US,,19890430,M,,PO BOX 75,,Greeley,CO,80639,,US,,,,,2050 E Osceola Pkwy,redcross street,Kissimmee,FL,34743,8602,US,,,,1053609644,,,208D00000X,,Practitioner 2 Test,Test,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,MA,U,Yes,Zelis,1,COMPREHEN METABOLIC PANEL,30,CON003,,184267,98032F7F-DF74-40AF-B341-52993E894522,94A5C171-594C-4C15-8CB4-4A74ABAEBE26,5B3A7318-265C-4A2C-905B-4339B096AB62
0002,INST,EMNTEST05,,19890430,M,,,,,,DEN,David,,,Self,,2.02109E+13,,,131,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,20210903,20210903,,,,,1,1,,,,1,,,,,,,,,,,,,,,,R42,N/S,,I10,N/S,,Z23,N/S,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,R42,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,99-9999999,,,,,,,Supplier_Clinic,2050 E Osceola Pkwy,redcross street,Kissimmee,FL,34743,8602,US,,,,,,,,,,,,,,,,,,2,20210903,20210903,301,99211,,,,,,,,,UN,1,100,,,,,,,,,,,,,,,1,70,,,,,0,0,70,,,,,,,,,,,,,,,,,Y,200,0,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,DEN,David,,,PO BOX 75,,Greeley,CO,80639,,US,,19890430,M,,PO BOX 75,,Greeley,CO,80639,,US,,,,,2050 E Osceola Pkwy,redcross street,Kissimmee,FL,34743,8602,US,,,,1053609644,,,208D00000X,,Practitioner 2 Test,Test,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,MA,U,Yes,Zelis,1,OFFICE/OUTPATIENT VISIT EST,30,CON003,,184267,98032F7F-DF74-40AF-B341-52993E894522,94A5C171-594C-4C15-8CB4-4A74ABAEBE26,5B3A7318-265C-4A2C-905B-4339B096AB62
0001,INST,200000950,,19540101,F,,,,,,Mem1,Medicare,,,Self,,2.02003E+13,,,110,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,20200101,20200123,,20200101,12,30,7,5,,,,62,,,,,,,,,,,,,,,,R45.5,N/S,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,22-3456789,5324601025,,,,,,IHM Hospital,10425 Narcoossee Rd,,Orlando,FL,32832,6902,US,,,,,,,,,,,,,,,,,,1,20200101,20200103,191,,,,,,,,,,UN,3,1000,,,,,,,,,,,,,,,3,1500,,,,,1500,0,0,,,,,,,,,,,,,,,,,Y,4600,0,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,2.02003E+13,,,,,,,,,,,,,,,,,,,,Mem1,Medicare,,,,,,,,,,,19540101,F,,,,,,,,,,,,,10425 Narcoossee Rd,,Orlando,FL,32832,6902,US,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,U,,Zelis,,,-500,PPO,,184693,0E18B96C-CF18-42EA-AE20-BAA14B623E5C,4FE2B528-A0E0-4763-9481-2ACB4510CA4E,5B3A7318-265C-4A2C-905B-4339B096AB62
0002,INST,200000950,,19540101,F,,,,,,Mem1,Medicare,,,Self,,2.02003E+13,,,110,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,20200101,20200123,,20200101,12,30,7,5,,,,62,,,,,,,,,,,,,,,,R45.5,N/S,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,22-3456789,5324601025,,,,,,IHM Hospital,10425 Narcoossee Rd,,Orlando,FL,32832,6902,US,,,,,,,,,,,,,,,,,,2,20200104,20200106,191,,,,,,,,,,UN,3,1000,,,,,,,,,,,,,,,3,1100,,,,,0,0,0,,,,,,,,,,,,,,,,,Y,4600,0,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,2.02003E+13,,,,,,,,,,,,,,,,,,,,Mem1,Medicare,,,,,,,,,,,19540101,F,,,,,,,,,,,,,10425 Narcoossee Rd,,Orlando,FL,32832,6902,US,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,U,,Zelis,,,-100,PPO,,184693,0E18B96C-CF18-42EA-AE20-BAA14B623E5C,4FE2B528-A0E0-4763-9481-2ACB4510CA4E,5B3A7318-265C-4A2C-905B-4339B096AB62
0002,INST,200000950,,19540101,F,,,,,,Mem1,Medicare,,,Self,,2.02003E+13,,,110,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,20200101,20200123,,20200101,12,30,7,5,,,,62,,,,,,,,,,,,,,,,R45.5,N/S,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,22-3456789,5324601025,,,,,,IHM Hospital,10425 Narcoossee Rd,,Orlando,FL,32832,6902,US,,,,,,,,,,,,,,,,,,3,20200108,20200108,300,,,,,,,,,,UN,1,200,,,,,,,,,,,,,,,1,0,,,,,0,0,0,,,,,,,,,,,,,,,,,Y,4600,0,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,2.02003E+13,,,,,,,,,,,,,,,,,,,,Mem1,Medicare,,,,,,,,,,,19540101,F,,,,,,,,,,,,,10425 Narcoossee Rd,,Orlando,FL,32832,6902,US,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,U,,Zelis,,,200,PPO,,184693,0E18B96C-CF18-42EA-AE20-BAA14B623E5C,4FE2B528-A0E0-4763-9481-2ACB4510CA4E,5B3A7318-265C-4A2C-905B-4339B096AB62
0002,INST,200000950,,19540101,F,,,,,,Mem1,Medicare,,,Self,,2.02003E+13,,,110,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,20200101,20200123,,20200101,12,30,7,5,,,,62,,,,,,,,,,,,,,,,R45.5,N/S,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,22-3456789,5324601025,,,,,,IHM Hospital,10425 Narcoossee Rd,,Orlando,FL,32832,6902,US,,,,,,,,,,,,,,,,,,4,20200109,20200109,360,10021,,,,,,,,,UN,1,200,,,,,,,,,,,,,,,1,0,,,,,0,0,0,,,,,,,,,,,,,,,,,Y,4600,0,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,2.02003E+13,,,,,,,,,,,,,,,,,,,,Mem1,Medicare,,,,,,,,,,,19540101,F,,,,,,,,,,,,,10425 Narcoossee Rd,,Orlando,FL,32832,6902,US,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,U,,Zelis,,FNA W/O IMAGE,200,PPO,,184693,0E18B96C-CF18-42EA-AE20-BAA14B623E5C,4FE2B528-A0E0-4763-9481-2ACB4510CA4E,5B3A7318-265C-4A2C-905B-4339B096AB62
0002,INST,200000950,,19540101,F,,,,,,Mem1,Medicare,,,Self,,2.02003E+13,,,110,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,20200101,20200123,,20200101,12,30,7,5,,,,62,,,,,,,,,,,,,,,,R45.5,N/S,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,22-3456789,5324601025,,,,,,IHM Hospital,10425 Narcoossee Rd,,Orlando,FL,32832,6902,US,,,,,,,,,,,,,,,,,,5,20200110,20200110,300,,,,,,,,,,UN,1,200,,,,,,,,,,,,,,,1,0,,,,,0,0,0,,,,,,,,,,,,,,,,,Y,4600,0,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,2.02003E+13,,,,,,,,,,,,,,,,,,,,Mem1,Medicare,,,,,,,,,,,19540101,F,,,,,,,,,,,,,10425 Narcoossee Rd,,Orlando,FL,32832,6902,US,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,U,,Zelis,,,200,PPO,,184693,0E18B96C-CF18-42EA-AE20-BAA14B623E5C,4FE2B528-A0E0-4763-9481-2ACB4510CA4E,5B3A7318-265C-4A2C-905B-4339B096AB62
TRAILER,9,20250814,35836,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,
```

## Secondary Editing OB/V26.1.0.0/EdifecsProduct_MappingSpec_OB Secondary Editing_837_DFF_to_EDI Conversion_V1.0.xlsx — 837P CDS Values 

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

## Secondary Editing OB/V26.1.0.0/EdifecsProduct_MappingSpec_OB Secondary Editing_837_DFF_to_EDI Conversion_V1.0.xlsx — 837I CDS Values 

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
