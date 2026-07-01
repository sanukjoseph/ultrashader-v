# Payment OB

## Payment OB/Archive/V24.3.0.0/EdifecsProduct_Mapping Spec_OutboundPayment_835_DFF_to_EDIConversion_V1.4.xlsx — Coversheet

```csv
Mapping Specification,,,,,,,,,
,,,,,,,,,
EDIFECS - Payment Extract (835) Outbound file,,,,,,,,,
,,,,,,,,,
"Healthcare Advisory and Consulting Team, UST HealthProof",,,,,,,,,
<Account Name> -,,,,,,,,,
,,,,,,,,,
,,,,Version,,1.1,,,
,,,,,,,,,
,Distribution of this document is limited to <Account Name> and UST HealthProof Associates,,,,,,,,
,,,,,,,,,
,Notice of Confidentiality and Custodial Responsibilities,,,,,,,,
,"This <Account Name> document contains confidential information that is
<Account Name> intellectual property. As a holder of this document, you
 may NOT disclose its content or any information derived from it to
any person outside of <Account Name> and UST <Account Name> Project Team.",,,,,,,,
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

## Payment OB/Archive/V24.3.0.0/EdifecsProduct_Mapping Spec_OutboundPayment_835_DFF_to_EDIConversion_V1.4.xlsx — Revision History

```csv
Revision History,,,,
,,,,
V#,Date,Author,Reviewer(s)/ Contributor(s),Comments
1.0,07/01/2023,Vijaya Raj Geethan P,Shijila Raveendran,Updated maaping spec
1.1,11/20/2023,Jishnu,Shijila Raveendran,"Changed the field position for 2100.NM103 2.018 to 2.019
Updated mapping in NM1*IL
Updated mapping in DTM*036
Updated mapping in DTM*232
Added bundling information"
1.2,02/05/2024,Jishnu,Shijila Raveendran,"Updated the mapping 2100.NM1*QC(Patient Name—PSD 1592)
Updated the mapping 2100.NM109(Patient Id—PSD 1628)
Updated the mapping 2110.SVC0-6(Patient Id—PSD 1592)"
1.3,30/4/2024,Ambily,Shijila Raveendran,Updated mapping for 2100.NM1*74 (PSD-2247)
1.4,9/10/24,Deepthi,Shijila Raveendran,Updated mapping for NM1*82*1  (User Story-8473)
```

## Payment OB/Archive/V24.3.0.0/EdifecsProduct_Mapping Spec_OutboundPayment_835_DFF_to_EDIConversion_V1.4.xlsx — 835 Mapping

```csv
Loop ID,EDI Segment,EDI Data Element Name,User Option,Length,Enumeration Values,Mapping Logic OR  DFF Position,DFF Field Description,Mapping Comments,Final Review Comments
ISA (Interchange Control Header),,,,,,,,,
,ISA,Segment: Interchange Control Header,R,,,,,,
,ISA01,Authorization Information Qualifier,R,"Min - 2
Max - 2","00 : No Authorization Information Present
03: Additional Data Identification","Hardcode as ""00""",NA,,
,ISA02,Authorization Information,R,"Min - 10
Max - 10",,Leave it blank,NA,,
,ISA03,Security Information Qualifier,R,"Min - 2
Max - 2","00 : No Security Information Present
01 : Password","Hardcode as ""00""",NA,,
,ISA04,Security InformationLQ,R,"Min - 10
Max - 10",,Leave it blank,NA,,
,ISA05,Interchange Sender ID Qualifier,R,"Min - 2
Max - 2","01: Duns (Dun & Bradstreet)
14 Duns Plus Suffix
20 Health Industry Number (HIN)
27 Carrier Identification Number
28 Fiscal Intermediary Identification Number
29 Medicare Provider and Supplier IdentificationNumber
30 U.S. Federal Tax Identification Number
33 National Association of Insurance Commissioners Company Code (NAIC)
ZZ Mutually Defined","Hardcode as ""ZZ""",NA,,
,ISA06,Interchange Sender ID,R,"Min - 15
Max - 15",,"Hardcode as  ""1234           """,NA,"Interchange Sender ID will be different for each customer.From product standpoint, we have hardcoded a random sender ID.",
,ISA07,Interchange Receiver ID Qualifier,R,"Min - 2
Max - 2","01: Duns (Dun & Bradstreet)
14 Duns Plus Suffix
20 Health Industry Number (HIN)
27 Carrier Identification Number
28 Fiscal Intermediary Identification Number
29 Medicare Provider and Supplier IdentificationNumber
30 U.S. Federal Tax Identification Number
33 National Association of Insurance Commissioners Company Code (NAIC)
ZZ Mutually Defined","Hardcode as ""ZZ""",NA,,
,ISA08,Interchange Receiver ID,R,"Min - 15
Max - 15",,"Hardcode  as ""123456789123456""",NA,"Interchange Receiver ID will be different for each customer.From product standpoint, we have hardcoded a random Receiver ID.",
,ISA09,Interchange Date,R,"Min - 6
Max - 6",The date format is YYMMDD.,"Map this value from  current date in the format of ""YYMMDD""",NA,Date  transaction is created – done by translator  (Date for the Process of converting 835 it will be the EDIFECS time of converting 835 ) YYMMDD,
,ISA10,Interchange Time,R,"Min -4
Max - 4",The time format is HHMM.,Map this value from   current time in the format of HHMM,NA,,
,ISA11,Interchange Control Standards Identifier,R,"Min - 1
Max - 1",,"Hardcode as ""^""",NA,,
,ISA12,Interchange Control Version Number,R,"Min - 5
Max - 5","00501 Standards Approved for Publication by ASC X12
Procedures Review Board through October 2003",Hardcode as “00501”,NA,,
,ISA13,Interchange Control Number,R,"Min - 9
Max - 9","The Interchange Control Number, ISA13, must be identical to the
associated Interchange Trailer IEA02.
This Must be a positive unsigned number and must be identical to the value in IEA02.",Refer Column H,NA,Unique ISI control number needs to generated in Edifecs for each 835 EDI file. It has to be 9 digits (for example -  000000764),
,ISA14,Acknowledgement Requested,R,"Min - 1
Max - 1","0 No Interchange Acknowledgment Requested
1 Interchange Acknowledgment Requested (TA1)","Hardcode as ""0""",NA,,
,ISA15,Usage Indicator,R,"Min - 1
Max - 1","P Production Data
T Test Data","Refer Column I and map based on below logic
Hardcode as ""P""  if it is a Production region
Hardcode as ""T""  if it is a Non-Production region",NA,Based on Environmental property whether it is lower region or production region.,
,ISA16,Component element Separator,R,"Min - 1
Max - 1",,"Hardcode  as "":""",NA,,
GS (Functional Group Header),,,,,,,,,
,GS,Segment: Functional Group Header,R,,,,,,
,GS01,Functional Identifier Code,R,"Min - 2
Max - 2",HP Health Care Claim Payment/Advice (835),Hardcode as “HP”,NA,,
,GS02,Application Sender Code,R,"Min -2
Max - 15",,"Hardcode as ""1234""",NA,"Application Sender Code will be different for each customer.From product standpoint, we have hardcoded a random Application Sender Code.",
,GS03,Application Receiver ID,R,"Min -2
Max - 15",,"Hardcode as ""Product""",NA,"Application Receiver ID will be different for each customer.From product standpoint, we have hardcoded a random Application Application Receiver ID.",
,GS04,Date,R,"Min - 8
Max - 8",Date Expressed in YYYYMMDD format (Current Date),"Map this value from  current date in the format of ""YYYYMMDD""",NA,,
,GS05,Time,R,"Min - 4
Max - 8",,"Map this value from   current Time in the format of ""HHMMSS""",NA,,
,GS06,Group Control Number,R,"Min - 1
Max - 9",,,NA,"Functional Group Control Number. Value must equal GE02

GS control number min length - 1 and max is 9",
,GS07,Responsible Agency Code,R,"Min - 1
Max - 2",X Accredited Standards Committee X12,"Hardcode as ""X""",NA,,
,GS08,Version/Release/Industry Identifier,R,"Min - 1
Max - 12","005010X221 Standards Approved for Publication by ASC X12
Procedures Review Board through October 2003","Hardcode as ""005010X221A1""",NA,,
ST Transaction Set Header,,,,,,,,,
,ST,Segment: Transaction Set Header,R,,,,,,
,ST01,Transaction Set Identifier Code,R,"Min - 3
Max - 3",835 Health Care Claim Payment/Advice,"Hardcode as ""835""",NA,,
,ST02,Transaction Set Control Number,R,"Min - 4
Max - 9",,Refer Column H,NA,Unique control number needs to populated from process flow or map,
BPR Financial Information,,,,,,,,,
,BPR,Segment: Financial Information,R,,,,,Currently we are not mapping ACH payments,
,BPR01,Transaction Handling Code,R,"Min - 1
Max - 2","C Payment Accompanies Remittance Advice
D Make Payment Only
H Notification Only
I Remittance Information Only
P Prenotification of Future Transfers
U Split Payment and Remittance
X Handling Party’s Option to Split Payment and
Remittance","Hardcode as ""I"" for EFT/Check payments
Hardcode as ""H"" when the actual provider payment amount(BPR02) is zero.",NA,Currently ACH payment is not in scope for product. Need to verify future scope for ACH payment mapping . IBC conifrmed they don’t have ACH scope.,
,BPR02,Monetary Amount,R,"Min - 1
Max - 18",Cheque Amount,Map this value from the DFF index 1.006,CheckAmount,,
,BPR03,Credit/Debit Flag,R,"Min - 1
Max - 1","C Credit
D Debit","Hardcode as ""C""",NA,,
,BPR04,PAYMENT METHOD CODE,R,"Min - 3
Max - 3","ACH Automated Clearing House (ACH)
BOP Financial Institution Option
CHK Check
FWT Federal Reserve Funds/Wire Transfer - Nonrepetitive
NON Non-Payment Data","Hardcode as ""CHK""  for check
Hardcode as ""ACH"" for Electronic payment
Hardcode as ""NON"" if the the actual provider payment amount(BPR02) is zero.",NA,"""CHK"" = Check, ""ACH"" = EFT payments, ""NON"" = Non payments",
,BPR05,PAYMENT FORMAT CODE,S,"Min - 1
Max - 10","CCP Cash Concentration/Disbursement plus Addenda
(CCD+) (ACH)

CTX Corporate Trade Exchange (CTX) (ACH)",,NA,Currently ACH payment is not in scope for product. Need to verify future scope for ACH payment mapping . IBC conifrmed they don’t have ACH scope.,
,BPR06,(DFI) ID NUMBER QUALIFIER,S,"Min - 2
Max - 2","01 ABA Transit Routing Number Including Check Digits
(9 digits)
04 Canadian Bank Branch and Institution Number",,NA,,
,BPR07,(DFI) IDENTIFICATION NUMBER,S,"Min - 3
Max - 12",,,MICRTransitNumber,,
,BPR08,Account Number Qualifier,S,"Min - 1
Max - 3",DA Demand Deposit,,NA,,
,BPR09,Sender Bank Account Number,S,"Min - 1
Max - 35",,,AccountNumber,,
,BPR010,ORIGINATING COMPANY IDENTIFIER,S,"Min - 10
Max - 10",,,NA,,
,BPR11,Originating Company Supplemental Code,S,"Min -9
Max - 9",,,NA,,
,BPR12,DFI Identification Number Qualifier,S,"Min - 2
Max - 2","01 ABA Transit Routing Number Including Check Digits
(9 digits)
04 Canadian Bank Branch and Institution Number",,NA,,
,BPR013,Receiver or Provider Bank ID Number,S,"Min - 3
Max - 12",,,Payee Bank ID Number,,
,BPR014,ACCOUNT NUMBER QUALIFIER,S,"Min - 1
Max - 3","DA Demand Deposit
SG Savings",,Account Number Qualifier,,
,BPR015,Receiver or Provider Account Number,S,"Min - 1
Max - 35",,,Payee Account Number,,
,BPR016,Check Issue or EFT Effective Date,S,"Min - 8
Max - 8",,"Map this value from the DFF index 1.005

Date format ""YYYYMMDD""",CheckDate,YYYYMMDD,
TRN Reassociation Trace Number,,,,,,,,,
,TRN,Segment: Reassociation Trace Number,R,,,,,,
,TRN01,Trace Type Code,R,"Min - 1
Max - 2",1 Current Transaction Trace Numbers,"Hardcode as ""1""",NA,,
,TRN02,REFERENCE IDENTIFICATION,R,"Min - 1
Max - 50",,Map this value from the DFF index 1.004,CheckNumber,,
,TRN03,ORIGINATING COMPANY IDENTIFIER,R,"Min - 10
Max - 10",,"Hardcode as ""1841297547""",NA,"1 Followed by payer TIN

ORIGINATING COMPANY IDENTIFIER will be different for each customer.From product standpoint, we have hardcoded a random ORIGINATING COMPANY IDENTIFIER.",
,TRN04,Originating Company Supplemental Code,S,"Min - 1
Max - 50",,NA,NA,,
CUR Foreign Currency Information,,,,,,,,,
,CUR,Segment: Foreign Currency Information,S,,,,,,
,CUR01,Entity Identifier Code,R,"Min - 2
Max - 3",PR Payer,NA,NA,,
,CUR02,Currency Code,R,"Min - 3
Max - 3",,NA,NA,,
REF Receiver Identification,,,,,,,,,
,REF,Segment: Receiver Identification,S,,,,,,
,REF01,Reference Identification Qualifier,R,"Min - 2
Max - 3",EV Receiver Identification Number,NA,NA,,
,REF02,Reference Identification,R,"Min - 1
Max - 50",,NA,NA,,
REF Version Identification,,,,,,,,,
,REF,Segment: Version Identification,S,,,,,,
,REF01,Reference Identification Qualifier,R,"Min - 2
Max - 3",F2 Version Code - Local,NA,NA,,
,REF02,Reference Identification,R,"Min - 1
Max - 50",,NA,NA,,
DTM Production Date,,,,,,,,,
,DTM,Segment: Production Date,S,,,,,,
,DTM01,Date/Time qualifier,R,"Min - 3
Max - 3",405 Production,"Hardcode as ""405""",NA,,
,DTM02,Date,R,"Min - 8
Max - 8",,"Map this value from  system date in the format ""YYYYMMDD""",NA,,
LOOP 1000A - Payer Identification,,,,,,,,,
1000A,N1,Payer Identification,R,,,,,,
1000A,N101,Payer Identifier Code,R,"Min - 2
Max - 3",PR Payer,"Hardcode as ""PR""",NA,,
1000A,N102,Payer NAME,R,"Min - 1
Maxi - 60",,"Hardcode as ""PRODUCT""",NA,,
1000A,N103,Identification Code Qualifier,S,"Min - 1
Max - 2",XV Centers for Medicare and Medicaid Services PlanID,NA,NA,,
1000A,N104,Payer Identification Code,S,"Min- 2
Max - 80",,NA,NA,,
1000A,N3,Payer Address,R,,,,,,
1000A,N301,Payer Address Line,R,"Min - 1
Max - 55",,"Hardcode as ""XXXX""",NA,,
1000A,N302,Payer Address Line,S,"Min - 1
Max - 55",,NA,NA,,
1000A,N4,"Segment : Payer City, State, Zip Code",R,,,,,,
1000A,N401,Payer City Name,R,"Min - 1
Max - 30",,"Hardcode as ""Aurora""",NA,"Payer City Name will be different for each customer.From product standpoint, we have hardcoded a random Payer City Name.",
1000A,N402,Payer State Code,S,"Min - 2
Max - 2",,"Hardcode as ""CO""",NA,"Payer state will be different for each customer.From product standpoint, we have hardcoded a random Payer state.",
1000A,N403,Payer Postal Zone or Zip Code,S,"Min - 1
Max - 15",,"Hardcode as ""80014""",NA,"Payer Postal Zone will be different for each customer.From product standpoint, we have hardcoded a random Payer Postal Zone.",
1000A,REF,Additional Payer Identification,S,,,,,,
1000A,REF01,Reference Identifier Qualifier,R,"Min - 2
Max - 3","2U Payer Identification Number
EO Submitter Identification Number
HI Health Industry Number (HIN)NF National Association of Insurance Commissioners (NAIC) Code","Hardcode as ""2U""",NA,,
1000A,REF02,Additional Payer Identifier,R,"Min - 1
Max - 50",,"Hardcode as ""6058028""",NA,"Payer identifier will be different for each customer.From product standpoint, we have hardcoded a random Payer identifier.",
1000A,PER,Payer Business Contact Information,S,,,,,,
1000A,PER01,Contact Function Code,R,"Min - 2
Max - 2",CX Payers Claim Office,"Hardcode as ""CX""",NA,,
1000A,PER02,Payer Contact Name,S,"Min - 1
Max - 60",,"Hardode as ""EDI Coordinator""",NA,"Payer Contact Name will be different for each customer.From product standpoint, we have hardcoded a random Payer Contact Name.",
1000A,PER03,Communication Number Qualifier,S,"Min - 2
Max - 2","EM Electronic Mail
FX Facsimile
TE Telephone","Hardcode as ""TE""",NA,,
1000A,PER04,Payer Contact Communication Number,S,"Min - 1
Max - 256",,"Hardcode as ""1234567890""",NA,"Payer Contact Communication Number will be different for each customer.From product standpoint, we have hardcoded a random Payer Contact Communication Number.",
1000A,PER05,Communication Email Qualifier,S,"Min - 2
Max - 2","EM Electronic Mail
EX Telephone Extension
FX Facsimile
TE Telephone",Hardcode as “EM”,NA,,
1000A,PER06,Payer Contact Communication Email,S,"Min - 1
Max - 256",,Hardcode as “xyz@xyz.com”,NA,"Payer Contact Communication Email will be different for each customer.From product standpoint, we have hardcoded a random Payer Contact Communication Email.",
1000A,PER07,Communication Number Qualifier,S,"Min - 2
Max - 2",EX Telephone Extension,,,,
1000A,PER08,Communication Number,S,"Min - 1
Max - 256",,,,,
1000A,PER,Payer Technical Contact Information,R,,,,,,
1000A,PER01,Contact Function Code,R,"Min - 2
Max - 2",BL Technical Department,Hardcode as “BL”,NA,,
1000A,PER02,Payer Technical Contact Name,S,"Min - 1
Max - 60",,"Hardode as ""EDI Coordinator""",NA,"Payer Technical Contact Name will be different for each customer.From product standpoint, we have hardcoded a random Payer Technical Contact Name.",
1000A,PER03,Communication Number Qualifier,S,"Min - 2
Max - 2","EM Electronic Mail
TE Telephone
Recommended
UR Uniform Resource Locator (URL)
Use only when there is no central telephone number
for the payer entity.",Hardcode as “TE”,NA,,
1000A,PER04,Payer Contact Communication Number,S,"Min - 1
Max - 256",,"Hardcode as ""1234567890""",NA,"Payer Contact Communication Number will be different for each customer.From product standpoint, we have hardcoded a random Payer Contact Communication Number.",
1000A,PER05,Payer Contact Communication Number,S,"Min - 2
Max - 2","M Electronic Mail
EX Telephone Extension
FX Facsimile
TE Telephone
UR Uniform Resource Locator (URL)",Hardcode as “EM”,NA,,
1000A,PER06,Payer Technical Contact Communication,S,"Min - 1
Max - 256",,"Hardcode as ""contactus@uhc.com""",NA,"Payer Technical Contact Communication will be different for each customer.From product standpoint, we have hardcoded a random Payer Technical Contact Communication.",
1000A,PER07,Communication Number Qualifier,S,"Min - 2
Max - 2","EM Electronic Mail
EX Telephone Extension
FX Facsimile
UR Uniform Resource Locator (URL)",,,,
1000A,PER08,Communication Number,S,"Min - 1
Max - 256",,,,,
1000A,PER,Payer Web Site,S,,,,,,
1000A,PER01,Contact Function Code,R,"Min - 2
Max - 2",IC Information Contact,"Hardcode as ""IC""",NA,,
1000A,PER02,Name,R,NA,NA,NA,NA,,
1000A,PER03,Communication Number Qualifier,R,"Min - 2
Max - 2",UR Uniform Resource Locator (URL),"Hardcode as ""UR""",NA,,
1000A,PER04,Communication Number,R,"Min - 1
Max - 256",,"Hardcode as ""www.uhc.com""",,"Communication Number will be different for each customer.From product standpoint, we have hardcoded a random Communication Number.",
LOOP 1000B Payee Identification,,,,,,,,,
1000B,N1,Payee Identification,R,,,,,,
1000B,N101,Payer Identifier Code,R,"Min - 2
Max - 3",PE Payee,"Hardcode as ""PE""",NA,,
1000B,N102,Payee Name,R,"Min - 1
Max - 60",,Map this value from the DFF index 1.017,PayeeName,,
1000B,N103,Payee Identification Code Qualifier,R,"Min - 1
Max - 2","FI Federal Taxpayer’s Identification Number
XV Centers for Medicare and Medicaid Services PlanID
XX Centers for Medicare and Medicaid Services
National Provider Identifier","Hardcode as ""XX""",NA,,
1000B,N104,Payee Identification Code,R,"Min - 2
Max - 80",,Map this value from the DFF index 1.033,Payee NPI,,
1000B,N3,Payee Address,S,,,,,,
1000B,N301,Payee Address Line,R,"Min - 1
Max - 55",,Map this value from the DFF index  1.018,PayeeAddress1,,
1000B,N302,Payee Address Line,S,"Min - 1
Max - 56",,Map this value from the DFF index  1.019,PayeeAddress2,,
1000B,N4,"Payee City, State, Zip Code",S,,,,,,
1000B,N401,Payee City Name,R,"Min - 2
Max - 30",,Map this value from the DFF index  1.020,PayeeCity,,
1000B,N402,Payee State Code,S,"Min - 2
Max - 2",,Map this value from the DFF index  1.021,PayeeState,,
1000B,N403,Payee Postal Zone or Zip Code,S,"Min - 3
Max - 15",,Map this value from the DFF index  1.022,PayeeZip,,
1000B,N404,Country Code,S,"Min - 2
Max - 3",,NA,NA,,
1000B,N407,Country Subdivision Code,S,"Min - 1
Max - 3",,NA,NA,,
1000B,REF,Payee Additional Identification,S,,,,,,
1000B,REF01,Additional Payee Identification Qualifier,R,"Min - 2
Max - 3","0B State License Number
D3 National Council for Prescription Drug Programs
Pharmacy Number
PQ Payee Identification
TJ Federal Taxpayer’s Identification Number","Hardcode as ""TJ""",NA,,
1000B,REF02,Reference Identification Code,R,"Min - 1
Max - 50",,Map this value from the DFF index  1.032,Payee SSN/TIN,"Remove ""-"" If it is present in 1.032",
1000B,RDM,Remittance Delivery Method,S,,,,,,
1000B,RDM01,Report Transmission Code,R,"Min - 1
Max - 2","BM By Mail
EM E-Mail
FT File Transfer
OL On-Line",NA,NA,,
1000B,RDM02,Name,S,"Min - 1
Max - 60",,NA,NA,,
1000B,RDM03,Communication Number,S,"Min - 1
Max - 256",,NA,NA,,
LOOP 2000 Header Number,,,,,,,,,
2000,LX,Header Number,S,,,,,,
2000,LX01,Assigned Number,R,"Min - 1
Max - 6",,Refer to column I,NA,"Assigned Number - When 835 is created it needs to generated, starts with 1 , it increments for each CLP segement mentioned in Row#174, 2100 Loop",
2000,TS3,Provider Summary Information,S,,,,,,
2000,TS301,Reference Identification,R,"Min - 1
Max - 50",,NA,NA,,
2000,TS302,Facility Code Value,R,"Min - 1
Max - 2",,NA,NA,,
2000,TS303,Date,R,"Min - 8
Max - 8",,,NA,,
2000,TS304,Quantity,R,"Min - 1
Max - 15",,NA,NA,,
2000,TS305,Monetary Amount,R,"Min - 1
Max - 18",,NA,NA,,
2000,TS313,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS315,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS317,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS318,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS320,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS321,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS322,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS323,Quantity,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS324,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS2,Provider supplemental Summary Information,S,,,,,,
2000,TS201,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS202,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS203,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS204,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS205,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS206,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS207,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2000,TS208,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS209,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS210,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2000,TS211,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2000,TS212,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2000,TS213,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2000,TS214,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2000,TS215,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS216,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2000,TS217,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS218,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS219,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
LOOP 2100 Claim payment Information,,,,,,,,,
2100,CLP,Claim payment Information,R,,,,,,
2100,CLP01,Patient Control Number,R,"Min - 1
Max - 38",,Map this value from the DFF index  2.079,Patient Control Number,,
2100,CLP02,Claim Status Code,R,"Min - 1
Max - 2","1 Processed as Primary
2 Processed as Secondary
3 Processed as Tertiary
4 Denied
19 Processed as Primary, Forwarded to Additional
Payer(s)
20 Processed as Secondary, Forwarded to Additional
Payer(s)
21 Processed as Tertiary, Forwarded to Additional
Payer(s)
22 Reversal of Previous Payment
23 Not Our Claim, Forwarded to Additional Payer(s)
25 Predetermination Pricing Only - No Payment",Map this value from the DFF index   2.04,ClaimStatusCode,,
2100,CLP03,Total Claim Charge Amount,R,"Min - 1
Ma - 18",,Map this value from the DFF index  2.028,ChargeAmount,,
2100,CLP04,Total Claim Payment Amount,R,"Min - 1
Max - 18",,Map this value from the DFF index  2.037,PaidAmount,,
2100,CLP05,Patient Responsibility Amount,S,"Min - 1
Max - 18",,Map this value from the DFF index  2.038,PatientOwedamount,"This mapping is required when the patient responsibility is greater than zero, if not required.",
2100,CLP06,Claim Filing Indicator Code,R,"Min - 2
Max - 2","12 Preferred Provider Organization (PPO)
13 Point of Service (POS)
14 Exclusive Provider Organization (EPO)
15 Indemnity Insurance
16 Health Maintenance Organization (HMO) Medicare
Risk
17 Dental Maintenance Organization
AM Automobile Medical
CH Champus
DS DisabilityHM Health Maintenance Organization
LM Liability Medical
MA Medicare Part A
MB Medicare Part B
MC Medicaid
OF Other Federal Program
TV Title V
VA Veterans Affairs Plan
WC Workers’ Compensation Health Claim
ZZ Mutually Defined","Hardcode as ""HM""",NA,,
2100,CLP07,Payer Claim Control Number (Payer Claim Control Number – HRP claim number ),R,"Min - 1
Max - 50",,Map this value from the DFF index 2.003,ClaimNumber,,
2100,CLP08,Facility Type Code,S,"Min - 1
Max - 2",,Map this value from the DFF index 2.061,Facility Code Value,,
2100,CLP09,Claim Frequency Code,S,"Min - 1
Max - 1",,Map this value from the DFF index 2.083,Frequency code,,
2100,CLP10,Patient Status Code,NA,NA,NA,NA,NA,,
2100,CLP11,Diagnosis Related Group (DRG) Code,S,"Min - 1
Max - 4",,Map this value from the DFF index 2.069,Diagnosis Related Group Code,,
2100,CLP12,DRG Weight,S,"Min - 1
Max - 15",,Map this value from the DFF index 2.068,DRG Weight (Record Type 2 Claim Level Information),,
2100,CLP13,PERCENT - Discharge Fraction,S,"Min - 1
Max - 10",,NA,NA,,
2100,CAS,Claim Adjustment,S,,,,,All the adjustment details are mentioned in line level (2110 CAS Segment),
2100,CAS01,Claim Adjustment Group Code,R,"Min - 1
Max - 2","CO Contractual Obligations
OA Other adjustments
PI Payor Initiated Reductions
PR Patient Responsibility",NA,NA,,
2100,CAS02,Adjustment Reason Code,R,"Min - 1
Max - 5",,NA,NA,,
2100,CAS03,Adjustment Amount,R,"Min - 1
Max - 18",,NA,NA,,
2100,CAS04,QUANTITY,S,"Min - 1
Max - 15",,NA,NA,,
2100,CAS05,Claim Adjustment Reason Code,S,"Min - 1
Max - 2",,NA,NA,,
2100,CAS06,Monetary Amount,S,"Min - 1
Max - 18",,,,,
2100,CAS07,Quantity,S,"Min - 1
Max - 15",,,,,
2100,CAS08,Claim Adjustment Reason Code,S,"Min - 1
Max - 2",,,,,
2100,CAS09,Monetary Amount,S,"Min - 1
Max - 18",,,,,
2100,CAS10,Quantity,S,"Min - 1
Max - 15",,,,,
2100,CAS11,Claim Adjustment Reason Code,S,"Min - 1
Max - 2",,,,,
2100,CAS12,Monetary Amount,S,"Min - 1
Max - 18",,,,,
2100,CAS13,Quantity,S,"Min - 1
Max - 15",,,,,
2100,CAS14,Claim Adjustment Reason Code,S,"Min - 1
Max - 2",,,,,
2100,CAS15,Monetary Amount,S,"Min - 1
Max - 18",,,,,
2100,CAS16,Quantity,S,"Min - 1
Max - 15",,,,,
2100,CAS17,Claim Adjustment Reason Code,S,"Min - 1
Max - 2",,,,,
2100,CAS18,Monetary Amount,S,"Min - 1
Max - 18",,,,,
2100,CAS19,Quantity,S,"Min - 1
Max - 15",,,,,
2100,NM1,Patient Name,R,,,,,,
2100,NM101,Patient Identifier Code,R,"Min - 2
Max - 3",QC Patient,"Hardcode as ""QC""",NA,,
2100,NM102,Entity Type Qualifier,R,"Min - 1
Max - 1",1 Person,"Hardcode as ""1""",NA,,
2100,NM103,Patient Last  Name,S,"Min - 1
Max - 60",,Map this value from the DFF index 2.087 - Map only the Lastname,"SubmittedPatientLastName
Format: (SubmittedPatientLastName, Middle Name,Firstname)","If 2.087 doesnt have comma(,) Map from position 2.080 (Corrected patient information)",
2100,NM104,Patient First Name,S,"Min - 1
Max - 35",,Map this value from the DFF index 2.087 - Map only the First name,"SubmittedPatientLastName
Format: (SubmittedPatientLastName, Middle Name,Firstname)","If 2.087 doesnt have comma(,) Map from position 2.081 (Corrected patient information)",
2100,NM105,Patient Middle Initial,S,"Min - 1
Max - 25",,Map this value from the DFF index 2.087- Map only the Middle name,"SubmittedPatientLastName
Format: (SubmittedPatientLastName, Middle Name,Firstname)","If 2.087 doesnt have comma(,) Map from position 2.082 (Corrected patient information)",
2100,NM106,Name Prefix,NA,NA,,NA,NA,,
2100,NM107,Patient Name Suffix,S,"Min - 1
Max - 10",,NA,NA,,
2100,NM108,Identification Code Qualifier,S,"Min - 1
Max - 2","34 Social Security Number
HN Health Insurance Claim (HIC) Number
II Standard Unique Health Identifier for each Individual
in the United States
Use this code if mandated in a final Federal Rule.
MI Member Identification Number
MR Medicaid Recipient Identification Number","Hardcode as ""MI""",NA,,
2100,NM109,Patient Member Number,S,"Min - 2
Max - 80",,Map this value from the DFF index 2.084,SubmittedPatientID,If no values present in 2.084 then map from 2.005 (Corrected patient id),
2100,NM1,Insured Name,S,,If subscriber and patient are same we will not map this entire segment,,,,
2100,NM101,Entity Identifier Code,R,"Min - 2
Max - 3",IL,"Hardcode as ""IL""",,If the subscriber is not same as patient,
2100,NM102,Entity Type Qualifier,R,"Min - 1
Max - 1","1,2","Hardcode as ""1""",,,
2100,NM103,Name Last or Organization Name,S,"Min - 1
Max - 60",,Map this value from the DFF index 2.091,SubscriberLastName,,
2100,NM104,Name First,S,"Min - 1
Max - 35",,Map this value from the DFF index 2.089,SubscriberFirstName,,
2100,NM105,Name Middle,S,"Min - 1
Max - 25",,Map this value from the DFF index 2.090,SubscriberMiddleName,,
2100,NM107,Name Suffix,ISA,"Min - 1
Max - 10",,NA,NA,,
2100,NM108,Identification Code Qualifier,R,"Min - 1
Max - 2","FI,II,MI","Hardcode as ""MI""",NA,,
2100,NM109,Identification Code,R,"Min - 2
Max - 80",,Map this value from the DFF index 2.088,SubscriberID,,
2100,NM1,Corrected Patient/Insured Name,S,,,,,,
2100,NM101,Entity Identifier Code,R,"Min - 2
Max - 3",74 Corrected Insured,"Hardcode as ""74""",NA,"Map this segment only if
the name in 2.080+2.082+2.081 is different from 2.087
OR
ID in 2.005 is different from 2.084",
2100,NM102,Entity Type Qualifier,R,"Min - 1
Max - 1","1 Person
2 Non-Person Entity","Hardcode as ""1""",NA,,
2100,NM103,Name Last or Organization Name,S,"Min - 1
Max - 60",,Map this value from the DFF index 2.080,Patient Last name,Map only if  the name in 2.080+2.082+2.081 is different from 2.087,
2100,NM104,Name First,S,"Min - 1
Max - 35",,Map this value from the DFF index 2.081,Patient First name,Map only if  the name in 2.080+2.082+2.081 is different from 2.087,
2100,NM105,Name Middle,S,"Min - 1
Max - 25",,Map this value from the DFF index 2.082,Patient Middle name,Map only if  the name in 2.080+2.082+2.081 is different from 2.087,
2100,NM107,Name Suffix,S,"Min - 1
Max - 10",,NA,NA,,
2100,NM108,Identification Code Qualifier,S,"Min - 1
Max - 2",C Insured’s Changed Unique Identification Number,"Hardcode as ""C""",NA,,
2100,NM109,Identification Code,S,"Min - 2
Max - 80",,Map this value from the DFF index 2.005,PatientID,Map only if  ID in 2.005 is different from 2.084,
2100,NM1,Service Provider Name,S,,,,,,
2100,NM101,Entity Identifier Code,R,"Min - 2
Max - 3",82 Rendering Provider,"Hardcode as ""82""",NA,"This NM1*82 is a configurable item. A flag will be configured in Edifecs layer with Y/N value.
If Y - NM103, NM104 & NM105 will be splited and populated.
If N - only NM103 will populated with value. NM104 & NM105 should be blank",
2100,NM102,Entity Type Qualifier,R,"Min - 1
Max - 1","1 Person
2 Non-Person Entity","Hardcode as ""1""",NA,,
2100,NM103,Name Last or Organization Name,S,"Min - 1
Max - 60",,"If Flag Y - Map this value from the DFF index 2.094
If Flag N - Map this value from the DFF index 2.018",,,
2100,NM104,Name First,S,"Min - 1
Max - 35",,"If Flag Y - Map this value from the DFF index 2.092
If Flag N - NA",NA,,
2100,NM105,Name Middle,S,"Min - 1
Max - 25",,"If Flag Y - Map this value from the DFF index 2.093
If Flag N - NA",NA,,
2100,NM107,Name Suffix,S,"Min - 1
Max - 10",,NA,NA,,
2100,NM108,Identification Code Qualifier,R,"Min - 1
Max - 2","BD Blue Cross Provider Number
BS Blue Shield Provider Number
FI Federal Taxpayer’s Identification Number
MC Medicaid Provider Number
PC Provider Commercial Number
SL State License Number
UP Unique Physician Identification Number (UPIN)
XX Centers for Medicare and Medicaid Services
National Provider Identifier","Hardcode as ""XX""",NA,,
2100,NM109,Identification Code,R,"Min - 2
Max - 80",,Map this value from the DFF index 2.016,ProviderNPI,,
2100,NM1,Crossover Carrier Name,S,,,,,,
2100,NM101,Entity Identifier Code,R,"Min - 2
Max - 3",TT Transfer To,NA,NA,,
2100,NM102,Entity Type Qualifier,R,"Min - 1
Max - 1",2 Non-Person Entity,NA,NA,,
2100,NM103,Name Last or Organization Name,R,"Min - 1
Max - 60",,NA,NA,,
2100,NM108,Identification Code Qualifier,R,"Min - 1
Max - 2","AD Blue Cross Blue Shield Association Plan Code
FI Federal Taxpayer’s Identification Number
NI National Association of Insurance Commissioners
(NAIC) Identification
PI Payor Identification
PP Pharmacy Processor Number
XV Centers for Medicare and Medicaid Services PlanID",NA,NA,,
2100,NM109,Identification Code,R,"Min - 2
Max - 80",,NA,NA,,
2100,NM1,Corrected Priority Payer Name,S,,,,,,
2100,NM101,Entity Identifier Code,R,"Min - 2
Max - 3",PR Payer,NA,NA,,
2100,NM102,Entity Type Qualifier,R,"Min - 1
Max - 1",2 Non-Person Entity,NA,NA,,
2100,NM103,Name Last or Organization Name,R,"Min - 2
Max - 60",,NA,NA,,
2100,NM108,Identification Code Qualifier,R,"Min - 1
Max - 2","AD Blue Cross Blue Shield Association Plan Code
FI Federal Taxpayer’s Identification Number
NI National Association of Insurance Commissioners
(NAIC) Identification
PI Payor Identification
PP Pharmacy Processor Number
XV Centers for Medicare and Medicaid Services PlanID",NA,NA,,
2100,NM109,Identification Code,R,"Min - 2
Max - 80",,NA,NA,,
2100,NM1,Other Subscriber Name,S,,,,,,
2100,NM101,Entity Identifier Code,R,"Min - 2
Max - 3",GB Other Insured,NA,NA,,
2100,NM102,Entity Type Qualifier,R,"Min - 1
Max - 1","1 Person
2 Non-Person Entity",NA,NA,,
2100,NM103,Name Last or Organization Name,S,"Min - 1
Max - 60",,NA,NA,,
2100,NM104,Name First,S,"Min - 1
Max - 35",,NA,NA,,
2100,NM105,Name Middle,S,"Min - 1
Max - 25",,NA,NA,,
2100,NM107,Name Suffix,S,"Min - 1
Max - 10",,NA,NA,,
2100,NM108,Identification Code Qualifier,S,"Min - 1
Max - 2","FI Federal Taxpayer’s Identification Number
II Standard Unique Health Identifier for each Individual
in the United States
MI Member Identification Number",NA,NA,,
2100,NM109,Identification Code,S,"Min - 2
Max - 80",,NA,NA,,
2100,MIA,Inpatient Adjudication Information,S,,,,,,
2100,MIA01,Quantity,R,"Min - 1
Max - 15",,NA,NA,,
2100,MIA02,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA03,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2100,MIA04,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA05,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2100,MIA06,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA07,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA08,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA09,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA10,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA11,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA12,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA13,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA14,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA15,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2100,MIA16,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA17,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA18,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA19,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA20,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2100,MIA21,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2100,MIA22,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2100,MIA23,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2100,MIA24,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MOA,Outpatient Adjudication Information,S,,,,,,
2100,MOA01,Percentage as Decimal,S,"Min - 1
Max - 10",,NA,NA,,
2100,MOA02,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MOA03,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2100,MOA04,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2100,MOA05,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2100,MOA06,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2100,MOA07,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2100,MOA08,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MOA09,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,REF,Other Claim Related Identification,S,,,,,,
2100,REF01,Reference Identification Qualifier,R,"Min - 2
Max - 3","1L Group or Policy Number
1W Member Identification Number
28 Employee Identification Number
6P Group Number
9A Repriced Claim Reference Number
9C Adjusted Repriced Claim Reference Number
BB Authorization Number
CE Class of Contract Code
EA Medical Record Identification Number
F8 Original Reference Number
G1 Prior Authorization Number
G3 Predetermination of Benefits Identification Number
IG Insurance Policy Number
SY Social Security Number","Hardcode as ""1L""",NA,,
2100,REF02,Reference Identification,R,"Min - 1
Max - 50",,Map this value from the DFF index 2.025,GroupCode,,
2100,REF,Rendering Provider Identification,S,,,,,,
2100,REF01,Reference Identification Qualifier,R,"Min - 2
Max - 3","0B State License Number
1A Blue Cross Provider Number
1B Blue Shield Provider Number
1C Medicare Provider Number
1D Medicaid Provider Number
1G Provider UPIN Number
1H CHAMPUS Identification Number
1J Facility ID Number
D3 National Council for Prescription Drug Programs
Pharmacy Number
G2 Provider Commercial Number
LU Location Number",NA,NA,,
2100,REF02,Reference Identification,R,"Min - 1
Max - 50",,NA,NA,,
2100,DTM,Statement From or To Date,S,,,,,,
2100,DTM01,Date/Time Qualifier,R,"Min - 3
Max - 3",232 Claim Statement Period Start,"Hardcode as ""232""",NA,Only map when linelevel date is not present,
2100,DTM02,Date,R,"Min - 8
Max - 8",,Map this value from the DFF index 2.062,From Date,Date format is YYYYMMDD,
2100,DTM01,Date/Time Qualifier,R,"Min - 3
Max - 3",233 Claim Statement Period End,"Hardcode as ""233""",,Only map when linelevel date is not present,
2100,DTM02,Date,R,"Min - 8
Max - 8",,Map this value from the DFF index 2.063,To Date,Date format is YYYYMMDD,
2100,DTM,Coverage Expiration Date,S,,,,,,
2100,DTM01,Date Time Qualifier,R,"Min - 3
Max - 3",036 Expiration,Hardcode as “036”,NA,Coverage Expiration Date (DTM*036) should be populated only if one of the adjustment codes on the Line level is “27”,
2100,DTM02,Expiration Date,R,"Min - 8
Max - 8",,Map this value from the DFF index 2.042,CoverageExpiration,Date format is YYYYMMDD,
2100,DTM,Claim Received Date,S,,,,,,
2100,DTM01,Date Time Qualifier,R,"Min - 3
Max - 3",050 Received,Hardcode as “050”,NA,,
2100,DTM02,Received Date,R,"Min - 8
Max - 8",,Map this value from the DFF index 2.051,Claim Received Date,Date format is YYYYMMDD,
2100,PER,Claim Contact Information,S,,,,,,
2100,PER01,Contact Function Code,R,"Min - 2
Max - 2",CX Payers Claim Office,NA,NA,,
2100,PER02,Name,S,"Min - 1
Max - 60",,NA,NA,,
2100,PER03,Communication Number Qualifier,R,"Min - 2
Max - 2","EM Electronic Mail
FX Facsimile
TE Telephone",NA,NA,,
2100,PER04,Communication Number,R,"Min - 1
Max - 256",,NA,NA,,
2100,PER05,Communication Number Qualifier,S,"Min - 2
Max - 2","EM Electronic Mail
EX Telephone Extension
FX Facsimile
TE Telephone",NA,NA,,
2100,PER06,Communication Number,S,"Min - 1
Max - 256",,NA,NA,,
2100,PER07,Communication Number Qualifier,S,"Min - 2
Max - 2",EX Telephone Extension,NA,NA,,
2100,PER08,Communication Number,S,"Min - 1
Max - 256",,NA,NA,,
2100,AMT,Claim Supplemental Information,S,,,,,,
2100,6,Amount Qualifier Code,R,"Min - 1
Max - 3","AU Coverage Amount
D8 Discount Amount
DY Per Day Limit
F5 Patient Amount Paid
I Interest
NL Negative Ledger Balance
T Tax
T2 Total Claim Before Taxes
ZK Federal Medicare or Medicaid Payment Mandate -
Category 1
ZL Federal Medicare or Medicaid Payment Mandate -
Category 2
ZM Federal Medicare or Medicaid Payment Mandate -
Category 3
ZN Federal Medicare or Medicaid Payment Mandate -
Category 4
ZO Federal Medicare or Medicaid Payment Mandate -
Category 52","Hardcode as ""AU""",NA,,
2100,AMT02,Claim Supplemental Information Amount,R,"Min - 1
Max - 18",,Map this value from the DFF index 2.053,Prompt Pay Discount,This mapping required when the amount is greater than zero.,
2100,AMT01,Amount Qualifier Code,R,"Min - 1
Max - 3","AU Coverage Amount
D8 Discount Amount
DY Per Day Limit
F5 Patient Amount Paid
I Interest
NL Negative Ledger Balance
T Tax
T2 Total Claim Before Taxes
ZK Federal Medicare or Medicaid Payment Mandate -
Category 1
ZL Federal Medicare or Medicaid Payment Mandate -
Category 2
ZM Federal Medicare or Medicaid Payment Mandate -
Category 3
ZN Federal Medicare or Medicaid Payment Mandate -
Category 4
ZO Federal Medicare or Medicaid Payment Mandate -
Category 52","Hardcode as ""I""",NA,,
2100,AMT02,Claim Supplemental Information Amount,R,"Min - 1
Max - 18",,Map this value from the DFF index 2.052,Interest Amounts,,
2100,QTY,Claim Supplemental Information Quantity,S,,,,,,
2100,QTY01,Quantity Qualifier,R,"Min - 2
Max - 2","CA Covered - Actual
CD Co-insured - Actual
LA Life-time Reserve - Actual
LE Life-time Reserve - Estimated
NE Non-Covered - Estimated
NR Not Replaced Blood Units
OU Outlier Days
PS Prescription
VS Visits
ZK Federal Medicare or Medicaid Payment Mandate -
Category 1
ZL Federal Medicare or Medicaid Payment Mandate -
Category 2
ZM Federal Medicare or Medicaid Payment Mandate -
Category 3
ZN Federal Medicare or Medicaid Payment Mandate -
Category 4
ZO Federal Medicare or Medicaid Payment Mandate -
Category 5",NA,NA,,
2100,QTY02,Quantity,R,"Min - 1
Max - 15",,NA,NA,,
LOOP 2110 Service Payment Information,,,,,,,,,
2110,SVC,SERVICE PAYMENT INFORMATION,S,,,,,,
2110,SVC01,"COMPOSITE MEDICAL PROCEDURE
IDENTIFIER",R,"Min -
Max -",,NA,NA,,
2110,SVC01-1,Product/Service ID Qualifier,R,"Min - 2
Max - 2","AD American Dental Association Codes
ER Jurisdiction Specific Procedure and Supply Codes
HC Health Care Financing Administration Common
HP Health Insurance Prospective Payment System
IV Home Infusion EDI Coalition (HIEC) Product/Service
Code
N4 National Drug Code in 5-4-2 Format
N6 National Health Related Item Code
NU National Uniform Billing Committee (NUBC) UB92
Codes
UI U.P.C. Consumer Package Code (1-5-5)
WK Advanced Billing Concepts (ABC) Codes","If the procedure code(3.007) is present in DFF, then we need to Hardcode as ""HC""
Else If the procedure code (3.007) is blank and revenue code is present in index 3.034 then we need hardcode as ""NU""",NA,,
2110,SVC01-2,Product/Service ID,R,"Min - 1
Max - 48",,"If the procedure code is present Map this value from the DFF index 3.007
Else If the procedure code is blank and revenue code is present Map the value from the DFF index 3.034",ProcedureCode,,
2110,SVC01-3,PROCEDURE MODIFIER,S,"Min - 2
Max - 2",,Map this value from the DFF index 3.031,Procedure Modifier,,
2110,SVC01-4,PROCEDURE MODIFIER 2,S,"Min - 2
Max - 2",,Map this value from the DFF index 3.031.1,Procedure Modifier 2,,
2110,SVC01-5,PROCEDURE MODIFIER 3,S,"Min - 2
Max - 2",,Map this value from the DFF index 3.031.2,Procedure Modifier 3,,
2110,SVC01-6,PROCEDURE MODIFIER 4,S,"Min - 2
Max - 2",,Map this value from the DFF index 3.031.3,Procedure Modifier 4,,
2110,SVC01-7,Procedure Code Description,NA,NA,NA,NA,NA,,
2110,SVC02,Monetary Amount,R,"Min - 1
Max - 18",,Map this value from the DFF index 3.010,ChargeAmount,,
2110,SVC03,Monetary Amount,R,"Min - 1
Max - 18",,Map this value from the DFF index 3.019,PaidAmount,,
2110,SVC04,NUBC Revenue Code,S,"Min - 1
Max - 48",,When the procedure code is present and revenue code is present then Map SVC04 from the DFF index 3.034,Revenue Code,,
2110,SVC05,Units of Service Paid Count,S,"Min - 1
Max - 15",,Map this value from the DFF index 3.024,Units,The SVC05(Paid Units) required when the paid units of service are different than one if not required,
2110,SVC06-1,PRODUCT/SERVICE ID QUALIFIER,R,"Min - 2
Max - 2","AD American Dental Association Codes
ER Jurisdiction Specific Procedure and Supply Codes
HC Health Care Financing Administration Common
Procedural Coding System (HCPCS) Codes
HP Health Insurance Prospective Payment System
(HIPPS) Skilled Nursing Facility Rate Code
IV Home Infusion EDI Coalition (HIEC) Product/Service
Code
N4 National Drug Code
NU National Uniform Billing Committee (NUBC) UB92
Codes
WK Advanced Billing Concepts (ABC) Codes",Map this value from the DFF index 3.043,"Place holder for Submitted Product/Service id qualifier

Mapped based on getPaymentDetailsByIDResponse/paymentDetails/heexns:paymentExtract/eopPayment/eopClaimDetails/claim/claimLine/claimLine/serviceCode",Map SVC06 only when the valuein 3.007 is different from 3.044 (Service code),"PSD Ticket#502, 500, 499 based upon grooming call dated 11/7 , we are working along with IPlus team to analyse the feasiblity"
2110,SVC06-2,Procedure Code,R,"Min - 1
Max - 48",,Map this value from the DFF index 3.044,"Place holder for Submitted ProcedureCode

getPaymentDetailsByIDResponse/paymentDetails/heexns:paymentExtract/eopPayment/eopClaimDetails/claim/claimLine/claimLine/serviceCode",,
2110,SVC06-3,Procedure Modifier 1,S,"Min - 2
Max - 2",,Map this value from the DFF index 3.045,"Place holder for Submitted Procedure Modifier

getPaymentDetailsByIDResponse/paymentDetails/heexns:paymentExtract/eopPayment/eopClaimDetails/claim/claimLine/claimLine/modifierList",,
2110,SVC06-4,Procedure Modifier 2,S,"Min - 2
Max - 2",,Map this value from the DFF index 3.046,"Place holder for Submitted Procedure Modifier 2

getPaymentDetailsByIDResponse/paymentDetails/heexns:paymentExtract/eopPayment/eopClaimDetails/claim/claimLine/claimLine/modifierList",,
2110,SVC06-5,Procedure Modifier 3,S,"Min - 2
Max - 2",,Map this value from the DFF index 3.047,"Place holder for Submitted Procedure Modifier 3

getPaymentDetailsByIDResponse/paymentDetails/heexns:paymentExtract/eopPayment/eopClaimDetails/claim/claimLine/claimLine/modifierList",,
2110,SVC06-6,Procedure Modifier 4,S,"Min - 2
Max - 2",,Map this value from the DFF index 3.048,"Place holder for Submitted Procedure Modifier 4

getPaymentDetailsByIDResponse/paymentDetails/heexns:paymentExtract/eopPayment/eopClaimDetails/claim/claimLine/claimLine/modifierList",,
2110,SVC06-7,Procedure Code Description,S,"Min - 1
Max - 80",,NA,NA,,
2110,SVC07,Original Units of Service Count,S,"Min - 1
Max - 15",,Map this value from the DFF index 3.036,Original Units,The SVC07(Submitted Units) required when the paid unites of service provided in SVC05 is different from the submitted units of service from the original claim.,
2110,DTM,Service Start Date,S,,,,,,
2110,DTM01,Date Time Qualifier,R,"Min - 3
Max - 3",150 Service Period Start,"Hardcode as ""150""",NA,"1) Format the date to the below format ""YYYYMMDD""
2) If 3.005 and 3.006 same then map the DTM segment with qualifier 472(Rows 364 and 365).
Else If 3.005 is not equal to 3.006 Map the DTM segment with qualifiers 150 and 151(Rows 358 till 362)",
2110,DTM02,Service Date,R,"Min - 8
Max - 8",,Map this value from the DFF index 3.005,FromDate,,
2110,DTM,Service End Date,S,,,NA,NA,,
2110,DTM01,Date Time Qualifier,R,"Min - 3
Max - 3",151 Service Period End,"Hardcode as ""151""",NA,,
2110,DTM02,Service End Date,R,"Min - 8
Max - 8",,Map this value from the DFF index 3.006,ToDate,,
2110,DTM,Service Date,S,,,,,,
2110,DTM01,Date Time Qualifier,R,"Min - 3
Max - 3",472 Service,"Hardcode as ""472""",NA,,
2110,DTM02,Service Date,R,"Min - 8
Max - 8",,"Date format ""YYYYMMDD""",NA,,
2110,CAS,Service Adjustment,S,,,,,,
2110,CAS01,Claim Adjustment Group Code,R,"Min - 1
Max - 2","CO Contractual Obligations
OA Other adjustments
PI Payor Initiated Reductions",Map this value from the DFF index 4.011,CAGC,,
2110,CAS02,Claim Adjustment Reason Code,R,"Min - 1
Max - 5",,Map this value from the DFF index 4.009,CARC,,
2110,CAS03,Monetary Amount,R,"Min - 1
Max - 18",,Map this value from the DFF index 4.008,835 Adjusted Amount,,
2110,CAS04,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2110,CAS05,Claim Adjustment Reason Code,S,"Min - 1
Max - 2",,Map the same logic present in Rows 367 and 368,Map the same logic present in Rows 367 and 368,,
2110,CAS06,Monetary Amount,S,"Min - 1
Max - 18",,,,,
2110,CAS07,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2110,CAS08,Claim Adjustment Reason Code,S,"Min - 1
Max - 2",,Map the same logic present in Rows 367 and 368,Map the same logic present in Rows 367 and 368,,
2110,CAS09,Monetary Amount,S,"Min - 1
Max - 18",,,,,
2110,CAS10,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2110,CAS11,Claim Adjustment Reason Code,S,"Min - 1
Max - 2",,Map the same logic present in Rows 367 and 368,Map the same logic present in Rows 367 and 368,,
2110,CAS12,Monetary Amount,S,"Min - 1
Max - 18",,,,,
2110,CAS13,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2110,CAS14,Claim Adjustment Reason Code,S,"Min - 1
Max - 2",,Map the same logic present in Rows 367 and 368,Map the same logic present in Rows 367 and 368,,
2110,CAS15,Monetary Amount,S,"Min - 1
Max - 18",,,,,
2110,CAS16,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2110,CAS17,Claim Adjustment Reason Code,S,"Min - 1
Max - 2",,Map the same logic present in Rows 367 and 368,Map the same logic present in Rows 367 and 368,,
2110,CAS18,Monetary Amount,S,"Min - 1
Max - 18",,,,,
2110,CAS19,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2110,REF,Service Identification,S,,,,,,
2110,REF01,Reference Identification Qualifier,R,"Min - 2
Max - 3","1S Ambulatory Patient Group (APG) Number
APC Ambulatory Payment Classification
BB Authorization Number
E9 Attachment Code
G1 Prior Authorization Number
G3 Predetermination of Benefits Identification Number
LU Location Number
RB Rate code number",NA,NA,,
2110,REF02,Provider Identifier,R,"Min - 1
Max - 50",,NA,NA,,
2110,REF,Line Item Control Number,S,,,,,,
2110,REF01,Reference Identification Qualifier,R,"Min - 2
Max - 3",6R Provider Control Number,"Hardcode as ""6R""",NA,,
2110,REF02,Reference Identification,R,"Min - 1
Max - 50",,Map this value from the DFF index 3.037,Line Item Control Number,,
2110,REF,Rendering Provider Information,S,,,,,,
2110,REF01,Reference Identification Number,R,"Min - 2
Max - 3","0B State License Number
1A Blue Cross Provider Number
1B Blue Shield Provider Number
1C Medicare Provider Number
1D Medicaid Provider Number
1G Provider UPIN Number
1H CHAMPUS Identification Number
1J Facility ID Number
D3 National Council for Prescription Drug Programs
G2 Provider Commercial Number
HPI Centers for Medicare and Medicaid Services
National Provider Identifier
SY Social Security Number
TJ Federal Taxpayer’s Identification Number",NA,NA,,
2110,REF02,Rendering Provider Federal ID,R,"Min - 1
Max - 50",,NA,NA,"Corresponding identifier, Federal ID differs from provider to provider.",
2110,REF,HealthCare Policy Identification,S,,,,,,
2110,REF01,Reference Identification Qualifier,R,"Min - 2
Max - 3",0K Policy Form Identifying Number,NA,NA,,
2110,REF02,Reference Identification,R,"Min - 1
Max - 50",,NA,NA,,
2110,AMT,Service Supplemental Amount,S,,,,,,
2110,AMT01,Amount Qualifier Code,R,"Min - 1
Max - 3","B6 Allowed - Actual
KH Deduction Amount
T Tax
T2 Total Claim Before Taxes
ZK Federal Medicare or Medicaid Payment Mandate -
Category 1
ZL Federal Medicare or Medicaid Payment Mandate -
Category 2
ZM Federal Medicare or Medicaid Payment Mandate -
Category 3
ZN Federal Medicare or Medicaid Payment Mandate -
Category 4
ZO Federal Medicare or Medicaid Payment Mandate -
Category 5","Hardcode as ""B6""",NA,,
2110,AMT02,Service Line Allowed Amount,R,"Min - 1
Max - 18",,Map this value from the DFF index 3.033,Allowed Amount,This mapping required when the amount is greater than zero.,
2110,QTY,Service Supplemental Quantity,S,,,,,,
2110,QTY01,Quantity Qualifier,R,"Min - 2
Max - 2","ZK Federal Medicare or Medicaid Payment Mandate -
Category 1
ZL Federal Medicare or Medicaid Payment Mandate -
Category 2
ZM Federal Medicare or Medicaid Payment Mandate -
Category 3
ZN Federal Medicare or Medicaid Payment Mandate -
Category 4
ZO Federal Medicare or Medicaid Payment Mandate -
Category 5",NA,NA,,
2110,QTY02,Quantity,R,"Min - 1
Max - 15",,NA,NA,,
2110,LQ,Health Care Remark Code,S,,,,,,
2110,LQ01,Service Line Remittance Remark Code 1,R,"Min - 1
Max - 3","HE Claim Payment Remark Codes
RX National Council for Prescription Drug Programs","Hardcode as ""HE""",NA,,
2110,LQ02,Service Line Remittance Remark Code 2,R,"Min - 1
Max - 30",,Map this value from the DFF index 4.01,RARC,,
2110,PLB,Provider Adjustment,S,,,,,,
2110,PLB01,Provider Identifier,R,"Min - 1
Max - 50",,Map this value from the DFF index 1.033,Payee NPI,,
2110,PLB02,Fiscal Period Date,R,"Min - 8
Max - 8",,System Date YYYYMMDD format - December 31 of current year for example - 20231231,NA,"Last day of provider’s fiscal year(Financial Year) in YYYYMMDD format; if not known, December 31 of current year. (adjustment for the whole bill payment, monthly rebate , over payment )",
2110,PLB03-1,PROVIDER ADJUSTMENT REASON CODE,R,"Min - 2
Max - 2",20,Map this value from the DFF index 4.007,ProviderAdjustmentCode,,
2110,PLB03-2,Provider Adjustment Identifier,R,"Min - 1
Max - 50",,Map this value from the DFF index 4.013,PLB Identifier,,
2110,PLB04,Provider Adjustment Amount,R,"Min - 1
Max - 18",,Map this value from the DFF index 4.008,835 Adjusted Amount,,
2110,PLB05,Provider Adjustment Identifier,S,"Min - 1
Max - 50",,NA,NA,,
2110,PLB05-1,PROVIDER ADJUSTMENT REASON CODE,S,"Min - 2
Max - 2",,NA,NA,,
2110,PLB05-2,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2110,PLB06,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2110,PLB07,ADJUSTMENT IDENTIFIER,S,"Min - 1
Max - 50",,NA,NA,,
2110,PLB07-1,Adjustment Reason Code,S,"Min - 2
Max - 2",,NA,NA,,
2110,PLB07-2,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2110,PLB08,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2110,PLB09,ADJUSTMENT IDENTIFIER,S,"Min - 1
Max - 50",,NA,NA,,
2110,PLB09-1,Adjustment Reason Code,S,"Min - 2
Max - 2",,NA,NA,,
2110,PLB09-2,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2110,PLB010,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2110,PLB11,ADJUSTMENT IDENTIFIER,S,"Min - 1
Max - 50",,NA,NA,,
2110,PLB11-1,Adjustment Reason Code,S,"Min - 2
Max - 2",,NA,NA,,
2110,PLB11-2,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2110,PLB12,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2110,PLB13,ADJUSTMENT IDENTIFIER,S,"Min - 1
Max - 50",,NA,NA,,
2110,PLB13-1,Adjustment Reason Code,S,"Min - 2
Max - 2",,NA,NA,,
2110,PLB13-2,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2110,PLB14,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
SE - TRANSACTION SET TRAILER,,,,,,,,,
,SE,Transaction Set Trailer,R,,,,,,
,SE01,Number Of Included Segments,R,"Min - 1
Max - 10",,"Total number of segments included in a transaction set including ST and SE
segments",NA,,
,SE02,Transaction Set Control Number,R,"Min -
Max -",,STO2 Value,NA,,
,GE,Functional Group Trailer,R,,,,,,
,GE01,Number of Transaction Sets Included,R,"Min -
Max -",,"Total number of transaction sets included in the functional group or interchange
(transmission) group terminated by the trailer containing this data element",NA,,
,GE02,Group Control Number,R,"Min -
Max -",,GS06 Value,NA,,
Interchange Control Loop (End),,,,,,,,,
,IEA,Interchange Control Trailer,R,,,,,,
,IEA01,Number of Included Functional Groups,R,"Min -
Max -",,A count of the number of functional groups included in an interchange,NA,,
,IEA02,Interchange Control Number,R,"Min -
Max -",,ISA13 Value,NA,,
```

## Payment OB/Archive/V24.3.0.0/EdifecsProduct_Mapping Spec_OutboundPayment_835_DFF_to_EDIConversion_V1.4.xlsx — Payment Extract

```csv
Record Type 1 Payment Level Information,,,,,,
,,,,,,
INDEX,DATA ELEMENT,DATA TYPE,REQ,DESCRIPTION,Highmark Comments,UST
1.001,Record,Varchar(4),Required,0001,,
1.002,BatchKey,Varchar(75),Required,See key generation,,
1.003,CheckNumberPrefix,Varchar(4),Optional,The prefix for the check number assigned to the check.,,
1.004,CheckNumber,Varchar(25),Optional,The check number assigned to the check.,,
1.005,CheckDate,Date,Optional,The check date MMDDYYYY,,
1.006,CheckAmount,Money,Required,The numeric payment for the check,,
1.007,FractionTransitNumber,Varchar(25),Optional,"The Fractional Transit Number for the bank, as held in Fund Accounting for the applicable account for the group.",,
1.008,MICRTransitNumber,Varchar(9),Required,"The MICR Transit Number for the bank, as held in Fund Accounting for the applicable account for the group.",,
1.009,AccountNumber,Varchar(255),Required,"The Bank Account Number for the bank, as held in Fund Accounting for the applicable account for the group.",,
1.010,BankName,Varchar(255),Required,The Bank Name,,
1.011,BankAddress1,Varchar(255),Optional,The first bank address field,,
1.012,BankAddress2,Varchar(255),Optional,The second bank address field,,
1.013,BankCity,Varchar(255),Optional,The city for the bank,,
1.014,BankState,Varchar(2),Optional,The state for the bank,,
1.015,BankZip,Varchar(10),Optional,The zip for the bank,,
1.016,BankCountry,Varchar(255),Optional,The country code for the bank,,
1.017,PayeeName,Varchar(255),Required,The payee name. This is the recipient for the check.,,
1.018,PayeeAddress1,Varchar(255),Required,The first address line for the payee,,
1.019,PayeeAddress2,Varchar(255),"Required, if available",The second address line for the payee,Missing in the sample PNC extract,If address Line 2 is available in HRP this will be populated
1.020,PayeeCity,Varchar(255),Required,The city for the payee,,
1.021,PayeeState,Varchar(2),Required,The state for the payee,,
1.022,PayeeZip,Varchar(10),Required,The zip for the payee,,
1.023,PayeeCountry,Varchar(255),Required,The country for the payee,,
1.024,SpecHandle,Varchar(10),Optional,"Special Handling for the payment, i.e. reinsurance",,
1.025,ResponseType,Varchar(10),Optional,"Indicates the original response provided by payment vendor in the Response File (2). Valid values are: Payment, 835Only, None.",Missing in the sample PNC extract,This was a required field for another client. For 835 generation this is not used. Marked as optional field
1.026,PPO Network Contract Identifier,Varchar(3),Optional,"(If Available)PPO Contract Identifier from ClaimHeader. For provider voucher processing, it is assumed that the first non-blank PPO Contract Identifier will be communicated (if available).",Missing in the sample PNC extract,This was a required field for another client. For 835 generation this is not used. Marked as optional field
1.027,Provider Phone Number,Varchar(15),Optional,,,
1.028,Provider Email,Varchar(100,Optional,,,
1.029,Provider Type,Varchar(50),Optional,Provider taxonomy code,,
1.030,Provider TIN Sequence Code,Varchar(10),Optional,Sequence code for the payee provider,Missing in the sample PNC extract,This was a required field for another client. For 835 generation this is not used. Marked as optional field
1.031,Paid To,Varchar(1),Required,"if Fully Funded Paid To (E=Employee, D=Dependent, M = Member, P=Provider, S=Split pay)",,
1.032,Payee SSN/TIN,Varchar(9),Required,(if Member Payment) Payee SSN or TIN,,
1.033,Payee NPI,Int,Required,(If Available) The NPI for the payee provider,,
,,,,,,
,,,,,,
,,,,,,
Record Type 2 Claim Level Information,,,,,,
,,,,,,
INDEX,Data Element,Data Type,REQ,Description,,
2.001,Record,Varchar(4),Required,002,,
2.002,BatchKey,Varchar(75),Required,See key generation,,
2.003,ClaimNumber,Varchar(50),Required,The claim number assigned for the claim.,,
2.004,EOBNumber,Varchar(10),Optional,The EOB number assigned for the claim.,,
2.005,PatientID,Varchar(30),Required,The patient account number for the claim. This is assigned by the provider (ie. SSN),,
2.006,PatientName,Varchar(255),Required,The patient's name,,
2.007,PatientDOB,Date,Optional,The patient's Date of Birth.   MMDDYYYY,Missing in the sample PNC file,Marking as optional as it is not used for 835 mapping
2.008,ParticipantKey,Varchar(30),Optional,The insured's employee number Enrollee Member ID,Missing in the sample PNC file,Marking as optional as it is not used for 835 mapping
2.009,ParticipantName,Varchar(255),Optional,The insured's name,,
2.01,ParticipantAddress1,Varchar(255),Optional,The first address line for the insured,,
2.011,ParticipantAddress2,Varchar(255),Optional,The second address line for the insured,,
2.012,ParticipantCity,Varchar(255),Optional,The city for the insured,,
2.013,ParticipantState,Varchar(2),Optional,The state for the insured,,
2.014,ParticipantZip,Varchar(10),Optional,The zip for the insured,,
2.015,ParticipantCountry,Varchar(255),Optional,The country for the insured,,
2.016,ProviderNPI,Int,Required (If Available),The NPI for the provider of service,Missing in the sample PNC file,Available in the sample file.
2.017,ProviderTIN,Varchar(9),Required (If Available),The TIN for the provider of service,Missing in the sample PNC file,
2.017.1,Provider TIN Sequence Code,Varchar(7),Required (If Available),Sequence code for the providers,Missing in the sample PNC file,
2.018,ProviderName,Varchar(255),Required (If Available),The provider's name,Missing in the sample PNC file,
2.019,ProviderAddress1,Varchar(255),Required (If Available),The first address line for the provider,Missing in the sample PNC file,
2.02,ProviderAddress2,Varchar(255),Required (If Available),The second address line for the provider,Missing in the sample PNC file,
2.021,ProviderCity,Varchar(255),Required (If Available),The city for the provider,Missing in the sample PNC file,
2.022,ProviderState,Varchar(2),Required (If Available),The state for the provider,Missing in the sample PNC file,
2.023,ProviderZip,Varchar(10),Required (If Available),The zip for the provider,Missing in the sample PNC file,
2.024,ProviderCountry,Varchar(255),Required (If Available),The country for the provider,Missing in the sample PNC file,
2.025,GroupCode,Varchar(30),Required (If Available),The Group number for the insured,Missing in the sample PNC file,
2.026,GroupSubCode,Varchar(30),Required (If Available),The Sub Group number for the insured,,
2.027,GroupName,Varchar(255),Required (If Available),The group name for the insured.,,
2.028,ChargeAmount,Money,Required,"The amount billed, for all service lines for this claim.",,
2.029,PPODiscountAmount,Money,Required (If Available),"The PPO discount amount, for all service lines for this claim.",Missing in the sample PNC file,
2.03,RNCDiscountAmount,Money,Required (If Available),"The Reasonable and customary amount, for all service lines for this claim.",Missing in the sample PNC file,
2.031,COBAmount,Money,Required (If Available),"The COB amount, for all service lines for this claim for this claim",Missing in the sample PNC file,
2.032,DeductableAmount,Money,Required (If Available),The total amount applied to a deductible for all service lines for this claim,Missing in the sample PNC file,
2.033,CoInsuranceAmount,Money,Required (If Available),The total amount of Co -Insurance for all service lines for this claim,Missing in the sample PNC file,
2.034,CopayAmount,Money,Required (If Available),The total amount of the co-pay for all service lines for this claim,Missing in the sample PNC file,
2.035,SumDedCoinsCopayAmount,Money,Required (If Available),"The SUM of all Deductible Amounts, Co - Insurance, and CoPay for all service lines for this claim.",Missing in the sample PNC file,
2.036,OtherAdjustmentsAmount,Money,Required (If Available),The total amount of all other adjustments for all service lines for this claim. This will include all other adjustments not mentioned individually above.,Missing in the sample PNC file,
2.037,PaidAmount,Money,Required,"The total plan paid amount, for all service lines for this claim.",,
2.038,PatientOwedAmount,Money,Required (If Available),The employee responsibility for the service line,Missing in the sample PNC file,
2.039,PatientPaidAmountTotal,Money,Required (If Available),"The total patient paid amount, for all service lines for this claim.",,
2.04,ClaimStatusCode,Varchar(5),Required (If Available),"Determined based on whether it is a primary paid, denied, or reversal claim, etc. (1, 4, 22, etc.).",,
2.041,AlternateProcedureCode,Varchar(15),Required (If Available),Alternate Procedure Code/DRG. For Institutional Claims with DRG code.,Missing in the sample PNC file,
2.042,CoverageExpiration,Date,Required (If Available),Expiration date of patient’s coverage.,Missing in the sample PNC file,
2.043,AdjudicationAllowedAmount,Money,Required (If Available),This value is calculated as (Charge) minus (PPO Discount/RNC Discount) minus (Ineligible Amounts).,Missing in the sample PNC file,
2.044,Provider NAIC Code,Varchar(255),Required (If Available),National Association of Insurance Commissioners (NAIC) Code,Missing in the sample PNC file,
2.045,Corrected Patient/Insured Name,Varchar(255),Required (If Available),Corrected information about the patient or insured.,Missing in the sample PNC file,
2.046,Corrected Patient/Insured Member ID,Varchar(255),Required (If Available),Insured's Changed Unique Identification Number,Missing in the sample PNC file,
2.047,Corrected Priority Payer Name,Varchar(255),Required (If Available),Another payer has priority for making a payment and the claim is not being automatically transferred to that payer. This is the name of the new priority payer.,Missing in the sample PNC file,
2.048,Corrected Priority Payer NAIC or TIN,Varchar(255),Required (If Available),Another payer has priority for making a payment and the claim is not being automatically transferred to that payer. This is the unique id of the new priority payer.,Missing in the sample PNC file,
2.049,Corrected Priority Payer Subscriber Name,Varchar(255),Required (If Available),Another payer has priority for making a payment and the claim is not being automatically transferred to that payer. This is the name of the subscriber with the new priority payer.,Missing in the sample PNC file,
2.05,Corrected Priority Payer Subscriber Member Id,Varchar(255),Required (If Available),Another payer has priority for making a payment and the claim is not being automatically transferred to that payer. This is the name of the subscriber id the new priority payer.,Missing in the sample PNC file,
2.051,Claim Received Date,Date,Required,This is the date that the claim was received by the payer.,,
2.052,Interest Amounts,Money,Not Required,Use this monetary amount for the interest amount,Missing in the sample PNC file,This is not required field
2.053,Prompt Pay Discount,Money,Required (If Available),,Missing in the sample PNC file,
2.054,Over Coinsurance Maximum Amount,Money,Required (If Available),This is the total over coinsurance maximum ineligible amounts for the claim,Missing in the sample PNC file,
2.055,Over Benefit Maximum Amount,Money,Required (If Available),This is the total over benefit maximum ineligible amounts for the claim,Missing in the sample PNC file,
2.056,Over Period A Maximum Amount,Money,Required (If Available),This is the total Period A maximum ineligible amounts for the claim,Missing in the sample PNC file,
2.057,Over Period B Maximum Amount,Money,Required (If Available),This is the total Period B maximum ineligible amounts for the claim,Missing in the sample PNC file,
2.058,Miscellaneous Ineligible Amount,Money,Required (If Available),This is the total of any ineligible amounts not otherwise defined for the claim,Missing in the sample PNC file,
2.059,PPO Network Contract Identifier,Varchar(3),Required (If Available),"PPO Contract Identifier from Claim Header.  For provider voucher processing, this field may contain a different value than the value sent in the Pre-Pass record since there may be multiple record type 0002 records per voucher payment (if available).",Missing in the sample PNC file,
2.06,Provider Type,Varchar(50),Optional,Provider taxonomy code,Missing in the sample PNC file,
2.061,Facility Code Value,Varchar(50),Required (If Available),"Code identifying where services were, or may be, performed; the first and second positions of the Uniform Bill Type Code for Institutional Services or the Place of Service Codes for Professional or Dental Services. Loop 2100 CLP08 from the 835 specifications. Since professional or dental claims can have different place of service codes for services within a single claim, default to the place of service of the first service line when the service lines are not all for the same place of service. This number was received in CLM05-1 of the 837 claims.",,
2.062,From Date,DateTime,Required (If Available),"2100 DTM FROM AND TO DATES. Claim service date, may be overridden at the service level.
Required when the “Statement From or To Dates” are not supplied at the service (2110 loop) level. Dates at the claim level apply to the entire claim, including all service lines. Dates at the service line level apply only to the service line where they appear. When claim dates are not provided, service dates are required for every service line. When claim dates are provided, service dates are not required, but if used they override the claim dates for individual service lines. If the claim statement period start date is conveyed without a subsequent claim statement period end date, the end date is assumed to be the same as the start date.",Missing in the sample PNC file,
2.063,To Date,DateTime,Optional,"2100 DTM FROM AND TO DATES. Claim service date, may be overridden at the service level.
Required when the “Statement From or To Dates” are not supplied at the service (2110 loop) level. Dates at the claim level apply to the entire claim, including all service lines. Dates at the service line. level apply only to the service line where they appear. When claim dates are not provided, service dates are required for every service line. When claim dates are provided, service dates are not required, but if used they override the claim dates for individual service lines.",Missing in the sample PNC file,
2.064,Claim Filing Indicator Code,Varchar(5)`,Required (If Available),"Loop 2100 CLP06 For many providers to electronically post the 835remittance data to their patient accounting systems without human intervention, a unique, provider-specific insurance plan code is needed. This code allows the provider to separately identify and manage the different product lines or contractual arrangements between the payer and the provider. Because most payers maintain the same Originating Company Identifier in the TRN03 or BPR10 for all product lines or contractual relationships, the CLP06 is used by the provider as a table pointer in combination with the TRN03 or BPR10 to identify the unique, provider-specific insurance plan code needed to post the payment without human intervention. The value should mirror the value received in the original claim (2-005 SBR09 of the 837), if applicable, or provide the value as assigned or edited by the payer. For example, the BL from the SBR09 in the 837 would be returned as 12, 13, 15, in the 835 when more details are known. The 837 SBR09 code CI (Commercial Insurance) is generic, if through adjudication the specific type of plan is obtained a more specific code must be returned in the 835.
12  Preferred Provider
Organization (PPO)
13  Point of Service (POS)
14  Exclusive Provider Organization
(EPO)
15  Indemnity Insurance
16  Health Maintenance
Organization (HMO) Medicare
Risk
17  Dental Maintenance
Organization
AM Automobile Medical
CH Champus
DS Disability
HM Health Maintenance
Organization
LM Liability Medical
MA Medicare Part A
MB Medicare Part B
MC Medicaid
OF Other Federal Program 1049 Use this code for the Black Lung Program.
TV Title V
VA Veterans Affairs Plan
WC Workers’ Compensation
Health Claim
ZZ Mutually Defined",,
2.065,Discharge Fraction,"Decimal(3,2)",Required (If Available),"Loop 2100 CLP13 Percentage expressed as a decimal (e.g., 0.0 through 1.0 represents 0% through
100%). Required when a discharge
fraction was applied in the adjudication process.",Missing in the sample PNC file,
2.066,Patient Type Identifier,Varchar(2),Required (If Available),“I” for inpatient and “O” for outpatient. Needed for RARC reporting.,Missing in the sample PNC file,
2.067,Original Reference Number,Varchar(50),Required (If Available),"When this is a correction claim and CLP07 does not equal the CLP07 value from the original claim payment, one iteration of this REF segment using this qualifier is REQUIRED to identify the original claim CLP07 value in REF02. See section 1.10.2.8, Reversals and Corrections, for additional information.",Missing in the sample PNC file,
2.068,DRG Weight,Varchar(15),Required (If Available),Loop 2100 CLP12. The average diagnosis-related group (DRG) weight.,Missing in the sample PNC file,
2.069,Diagnosis Related Group Code,Varchar(4),Required (If Available),"Loop 2100 CLP11. Code indicating a patient’s diagnosis group based on a patient’s illness, diseases, and medical problems. Required for institutional claims when the claim was adjudicated using a DRG.",Missing in the sample PNC file,
2.07,Other Subscriber Name,Varchar(100),Required (If Available),"2100 NM1.  LAST, FIRST. This is the name and ID number of the other subscriber when a corrected priority payer has been identified. When used, either the name or ID must be supplied. Required when a corrected priority payer has been identified in another NM1 segment AND the name or ID of the other subscriber is known. If not required by this implementation guide, do not send.",Missing in the sample PNC file,
2.071,CDHP Type,Nvarchar(3),Optional,"Possible Values:
DEP
FSA
HRA
LFS
TMT
TPC
TPR

Populated when a claim is a CDHP claim to indicate CDHP status.",Missing in the sample PNC file,
2.072,Relationship Code,Varchar(5),Optional,Code representing relationship of insured to patient,Missing in the sample PNC file,
2.073,Alternate Provider ID,Varchar(50),Required (If Available),Required when additional rendering provider identification numbers not already reported in the Provider NM1 segment for this claim were submitted on the original claim and impacted adjudication.,Missing in the sample PNC file,
2.074,Crossover Carrier Name,Varchar(255),Required (If Available),"Required when the claim is transferred to another carrier or coverage (CLP02 equals 19, 20, 21 or 23).",Missing in the sample PNC file,
2.075,Crossover Carrier NAIC or TIN,Varchar(255),Required (If Available),"Required when the claim is transferred to another carrier or coverage (CLP02 equals 19, 20, 21 or 23).",Missing in the sample PNC file,
2.076,Claim Contact Telephone,Varchar(256),Required (If Available),Required when there is a claim specific communications contact.,Missing in the sample PNC file,
2.077,Tax Amount,Money,Required (If Available),Required when tax is non-zero.,Missing in the sample PNC file,
2.078,Total Claim Before Tax,Money,Required (If Available),Used only when tax also applies to the claim.,Missing in the sample PNC file,
2.079,Patient Control Number,,Required,Patient Control Number,,
2.080,Patient Last name,,Required,Last name,,
2.081,Patient First name,,Required,First Name,,
2.082,Patient Middle name,,Required,Middle Name,,
2.083,Frequency Code,,Required,Frequency  Code,,
2.084,SubmittedPatientID,Varchar(30),Required,Patient member ID as originally submitted in the claim,,
2.085,SubmittedPatientFirstName,Varchar(255),Required,First Name as originally submitted in the claim,,
2.086,SubmittedPatientMiddleName,Varchar(255),Required,Middle Name as originally submitted in the claim,,
2.087,SubmittedPatientLastName,Varchar(255),Required,Last name as originally submitted in the claim. This will be used to send the submitted patient Full Name as it is in HRDW database.,,
2.088,SubscriberID,Varchar(30),Required,Subscriber ID if the patient is not subscriber,,
2.089,SubscriberFirstName,Varchar(255),Required,Subscriber First Name if the patient is not subscriber,,
2.090,SubscriberMiddleName,Varchar(255),Required,Subscriber Middle Name if the patient is not subscriber,,
2.091,SubscriberLastName,Varchar(255),Required,Subscriber Last Name if the patient is not subscriber,,
2.092,PractitionerFirstName,varchar(107),Required (If Available),Practitioner First Name from the Claim,,
2.093,PractitionerMiddleName,varchar(107),Required (If Available),Practitioner Middle Initial from the Claim,,
2.094,PractitionerLastName,varchar(107),Required (If Available),Practitioner last name from the Claim,,
,,,,,,
Record Type 3 Claim line Level Information,,,,,,
,,,,,,
INDEX,Data Element,Data Type,REQ,Description,,
3.001,Record,Varchar(4),Required,0003,,
3.002,BatchKey,Varchar(75),Required,See key generation,,
3.003,ClaimNumber,Varchar(50),Required,The claim number assigned for the claim.,,
3.004,ClaimLineNumber,Varchar(4),Required(If Available),The service line number is used to specify the order of the services rendered on the claim,,
3.005,FromDate,Date,Required (If Available),The incurred from date MMDDYYYY,,
3.006,ToDate,Date,Required (If Available),The incurred through date MMDDYYYY,,
3.007,ProcedureCode,Varchar(5),Required (If Available),The procedure code,,
3.008,ProcedureDescription,Varchar(40),Required (If Available),The procedure description,,
3.009,LayProcedureDescription,Varchar(40),Required (If Available),The layperson procedure description,Missing in the sample PNC file,
3.010,ChargeAmount,Money,Required,The amount billed for the serviceline,,
3.011,PPODiscountAmount,Money,Required(If Available),The discount amount for the service line,,
3.012,RNCDiscountAmount,Money,Required(If Available),The Reasonable and customaryamount for the service line,Missing in the sample PNC file,
3.013,COBAmount,Money,Required(If Available),The COB amount for the service line,Missing in the sample PNC file,
3.014,DeductableAmount,Money,Required(If Available),Any amount applied to the deductible for the service line,Missing in the sample PNC file,
3.015,CoInsuranceAmount,Money,Required (If Available),Co-Insurance Amount detail line,Missing in the sample PNC file,
3.016,CopayAmount,Money,Required (If Available),Co-Payment amount per detail line,Missing in the sample PNC file,
3.017,SumDedCoinsCopayAmount,Money,Required(If Available),"The SUM of all deductible amounts,Co-Insurance, and Co-Payment",Missing in the sample PNC file,
3.018,OtherAdjustmentsAmount,Money,Required(If Available),Any other adjustment amount perdetail line,Missing in the sample PNC file,
3.019,PaidAmount,Money,Required,The plan paid amount for the service line,,
3.020,PatientOwedAmount,Money,Required (If Available),The employee responsibility for the service line,Missing in the sample PNC file,
3.021,ServiceProviderName,Varchar(255),Conditional,Only required if the service providername is not the payee for the claim,Missing in the sample PNC file,
3.022,ServiceProviderNationalProviderID,Varchar(255),Conditional,Only required if the service provider ID is not the payee for the claim,,
3.023,Product/Service ID Qualifier,Varchar(255),Required,The database from which the procedure code is derived,Missing in the sample PNC file,This is not used for 835 mapping yet this will be populated if its available in HRP
3.024,Units,Int,Required (if available),Units on the claim line. This is required by HIPAA if units on the claim line are > 1,,
3.025,Previously Paid Amount,Money,Required (If Available),"The previously paid amount on the claim, for “underpayment reversal” claims. This amount corresponds tothe amount already paid on the claim, on a check that is NOT being reversed (although the claim in the adjudication system IS being reversed.",Missing in the sample PNC file,
3.026,Over Coinsurance Maximum Amount,Money,Required (If Available),This is the total over coinsurance maximum ineligible amounts for the claim,Missing in the sample PNC file,
3.027,Over Benefit Maximum Amount,Money,Required (If Available),This is the total over benefit maximum ineligible amounts for the claim,Missing in the sample PNC file,
3.028,Over Period A Maximum Amount,Money,Required (If Available),This is the total Period A maximum ineligible amounts for the claim,Missing in the sample PNC file,
3.029,Over Period B Maximum Amount,Money,Required (If Available),This is the total Period B maximum ineligible amounts for the claim,Missing in the sample PNC file,
3.030,Miscellaneous Ineligible Amount,Money,Required (If Available),This is the total of any ineligible amounts not otherwise defined for the claim,Missing in the sample PNC file,
3.031,Procedure Modifier,Varchar(60),Required (if applies),Loop 2110 SV01-3. This identifies the special circumstances related to the performance of the service.,Missing in the sample PNC file,
3.031.1,Procedure Modifier 2,Varchar(60),Required (if applies),Loop 2110 SV01-4. This identifies the special circumstances related to the performance of the service.,Missing in the sample PNC file,
3.031.2,Procedure Modifier 3,Varchar(60),Required (if applies),Loop 2110 SV01-5. This identifies the special circumstances related to the performance of the service.,Missing in the sample PNC file,
3.031.3,Procedure Modifier 4,Varchar(60),Required (if applies),Loop 2110 SV01-6. This identifies the special circumstances related to the performance of the service.,Missing in the sample PNC file,
3.032,Healthcare Policy ID,Varchar(50),Required(if available),"Loop 2110 REF02. Supply the Healthcare policy identifier as provided by the payer’s published Healthcare policy code list. This policy code will be used to explain the policy used to process the claim which resulted
in the adjusted payment.
Required when;
• The payment is adjusted in
accordance with the Payer’s
published Healthcare Policy Code
list and
•A Claim Adjustment Reason Code
identified by the notation, “refer to
835 Healthcare Policy identification
segment”, in the Claim Adjustment
Reason Code List is present in a
related CAS segment and
• The payer has a published
enumerated healthcare policy code
list available to healthcare
providers via an un-secure public
website.|",Missing in the sample PNC file,
3.033,Allowed Amount,Money,Required,Loop 2110 AMT*B6. Allowed amount on this service line. Allowed amount is the amount the payer deems payable prior to considering patient responsibility. This can also be the COB allowed amount on a secondary claim.,,
3.034,Revenue Code,Varchar(4),Required(if available),Loop 2110 SVC01-2. Used when SVC01-1 is NU. National Uniform Billing Committee Revenue code,Missing in the sample PNC file,
3.035,Composite Code,Varchar(80),Required(if available),Used when sending the full 835 composite procedure code already formed for SVC01,Missing in the sample PNC file,
3.036,Original Units,Integer,Required(if available),Loop 2101 SVC07. The original submitted units of service,Missing in the sample PNC file,
3.037,Line Item Control Number,Varchar(20),Required(if available),"Loop 2110 RF02. This is the Line Item Control Number submitted in the 837, which is utilized by the provider for tracking purposes. Note - the value in REF02 can include alpha characters. Required when a Line Item Control Number was received on the original claim or when claim or service line splitting has occurred. If not required by this implementation guide, do not send",,
3.038,Rendering Provider TIN,Varchar(20),Required (if different from claim),"Loop 2110 REF02. The Service provider TIN, if it is different from the claim TIN. Required when the rendering provider for this service is different than the rendering provider applicable at the claim level",Missing in the sample PNC file,
3.039,Rendering Provider NPI,Varchar(50),Required (if available),Rendering provider NPI. Required if different from claim level NPI.,,
3.040,Tax Amount,Money,Required (If Available),Required if tax is non-zero.,Missing in the sample PNC file,
3.041,Late Filing Deduction,Money,Required (If Available),Required when there is a Late Filing Reduction,Missing in the sample PNC file,
3.042,Total Claim Before Taxes,Money,Required (If Available),Use this monetary amount for the service charge before taxes. This is only used when there is an applicable tax amount on this service.,Missing in the sample PNC file,
3.043,Submitted Product/Service id qualifier,Varchar(255),Required,The database from which the procedure code is derived,,
3.044,Submitted ProcedureCode,Varchar(5),Required (If Available),The procedure code,,
3.045,Submitted Procedure Modifier,Varchar(60),Required (if applies),Loop 2110 SV01-3. This identifies the special circumstances related to the performance of the service.,,
3.046,Submitted Procedure Modifier 2,Varchar(60),Required (if applies),Loop 2110 SV01-4. This identifies the special circumstances related to the performance of the service.,,
3.047,Submitted Procedure Modifier 3,Varchar(60),Required (if applies),Loop 2110 SV01-5. This identifies the special circumstances related to the performance of the service.,,
3.048,Submitted Procedure Modifier 4,Varchar(60),Required (if applies),Loop 2110 SV01-6. This identifies the special circumstances related to the performance of the service.,,
,,,,,,
Record Layout 4 (Remarks/ adjustment level information),,,,,,
,,,,,,
INDEX,Data Element,Data Type,REQ,Description,,
4.001,Record,Varchar(4),Required,0004,,
4.002,BatchKey,Varchar(75),Required,See key generation,,
4.003,ClaimNumber,Varchar(50),Optional,The claim number assigned for the claim. Required if remark is at claim line or claim service line,,
4.004,ClaimLineNumber,Varchar(15),Optional,The claim line number assigned for the particular service line. Required if remark is at the claim service line,,
4.005,System Remark Code,Varchar(10),Required,The internal system remark code for a service line,,
4.006,System Remark Description,Varchar(1000),Required (If Available),The description used for the above remark code,,
4.007,ProviderAdjustmentCode,Varchar(2),Required (If Available),Adjustments to the actual payment that are NOT specific to a particular claim or service,Missing in the sample PNC file,
4.008,835 Adjusted Amount,Money,Required (If Available),The respective adjusted amount for the aforementioned Remark Code,,
4.009,CARC,Varchar(50),Required (If Available),Client CARC Code mapped to System Remark Code,,
4.01,RARC,Varchar(50),Required (If Available),Client RARC Code mapped to corresponding 4.009 CARC,,
4.011,CAGC,Varchar(50),Required (If Available),Client CAGC Code mapped to corresponding 4.009 CARC,,
4.012,Remark Type,Varchar(10),Required (If Available),Defines type of ineligible amount from Payments File Detail record,Missing in the sample PNC file,
4.013,PLB Identifier,Varchar(100),Required (if available),"835 Summary Field PLB03-2. Provider Level Adjustment Code related claim number of another identifier.
Required when a control, account or tracking number applies to this adjustment.
For example, for Provider Level Adjustment Code 72, PLB03-2 must always contain an identifying reference number when the value is used.
For code “CS”, you must provide supporting identification information in PLB03-2.",Missing in the sample PNC file,
4.014,Covered Days,Int,Required (if available),"The number of days being adjusted. A positive value decreases the covered days, and a negative number increases the covered days. CAS04, CAS07, CAS10, CAS13, CAS16, CAS19",Missing in the sample PNC file,
```

## Payment OB/Archive/V24.3.0.0/EdifecsProduct_Mapping Spec_OutboundPayment_835_DFF_to_EDIConversion_V1.4.xlsx — PSD Tickets

```csv
S/No,PSD Ticket#,Clarification From Customer
1,503,"1. Current payment HRP webservice and DFF data - it fetches the original submitted Insured ID or matched data?  Based on above, changes needed on DFF file, Edifecs mapping to map   insured/patient names separately as per TR3.
 1. Step-1  evaluate DFF
 2. Evaluate the impact in existing customers

2. We do not have placeholder for dependents in DFF yet, need to add that and perform mapping according to that in Edifecs"
2,"502, 500, 499","1. Details related to bundling and unbundling fields has to be shared in DFF before we proceed with Edifecs Mapping.
2. We can discuss on this once Theju is back"
```

## Payment OB/Archive/V24.3.0.0/EdifecsProduct_Mapping Spec_OutboundPayment_835_DFF_to_EDIConversion_V1.4.xlsx — Attachments

```csv
Sl #,Attachment Name,Attachment
1,Sample EDI 835,
,,
,,
,,
2,Sample DFF,
,,
,,
3,Sample Payment Extract,
```

## Payment OB/Archive/V25.2.0.0/Archive/Audit JSON_Payment Mapping_V0.1.xlsx — Cover Page

```csv
,OB Payment Audit Processing -  EDIFECS,,,,,,,,,
,,,,,,,,,,
,Business Area: Claims IB,,,,,,,,,
,,,,,,,,,,
,This document provides the Mapping Specification for EDI 835 OB Payment. Document is intended for EDIFECS Product Team,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,Version,,V25.2.0.0,,,
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

## Payment OB/Archive/V25.2.0.0/Archive/Audit JSON_Payment Mapping_V0.1.xlsx — Legend

```csv
Legend,
,Mandatory for Edifecs to populate
```

## Payment OB/Archive/V25.2.0.0/Archive/Audit JSON_Payment Mapping_V0.1.xlsx — Audit JSON Mapping

```csv
Group,Fields,Sub Fields,Data Type,Mandatory (Present in all Audit points),Mandatory (Present in atleast one Audit Point),835 - Values,Description,Comments,
inputDetails,inputId,,String,,,"Value passed is  - {UID}- Uniqie for each file
Example - -dtBkcCHu9bkKu8O",EDI file id,NA for Edifecs,NA for OB payments
,inputType,,String,,,,Defines the type of input file - API or File,,
,totalTransactions,,Integer,,,,Total no. of transactions/Record received in API/File,,
,inputFileName,,String,,,Input Filename of the EDI file received with filename extension,Name of the input file received from source.,,
,inputArchiveFilename,,String,,,Input Filename of the EDI file archived in s3 with filename extension,Name of the input file after archiving the input file.,,
process,processStageName,,String,Y,,Edifecs-FileRead,Represent the name of the process stage which post the Audit point.,,
,processStatus,,String,Y,,"PROCESSED
SUCCESS
ERROR",Represent the Intermediate or Final status of the process stage which posts the Audit point.,,
,processMessage,,String,,,"Connection-timeout
Rejected",Specific information of a particular step after the process is completed.,,
,processInputArchiveFilename,,String,,,Input Filename of the DFF file received with filename extension,Name of the input Archive file of the process stage which posts the Audit point.,This field is required only if Edifecs is archiving the Input File,
,processOutputArchiveFilename,,String,,,NA,Name of the output Archive file of the process stage which posts the Audit point.,This field is required only if Edifecs is archiving the Input File,
,auditTime,,DateTime,Y,,"The time the audit trigger event got generated in YYYY-MM-ddTHH:mm:ss.SSS format
Sample: 2024-08-05T00:24:16:480",Auditing time of each audit point,,
identifiers,rayIdentifier,,String,Y,,"Shared as part of Summary file by Iplus Core team
Ex: RAYID_001","Unique Identifier for the complete lifecycle of transaction/Record. Will be unchanged even the transaction is Split, passed across various system, reprocessed.",,
,recordIdentifier,,String,,Y,"Shared as part of Summary file by Iplus Core team
q_5BkDy1SnLR3dO4-000083
q_5BkDy1SnLR3dO4-000083_D",Unique Identifier for transaction level. Will be different when reprocess a same record.,,
,tenantIdentifier,,String,,,Product - Can be editable by Implementation team to send their client Name.,Unique identifier for the implementation team,,
,sourceTypeIdentifier,,String,,,"Enrollment_ADV, SMOKER_STATUS",Identifier to find from where we received(Starting point) the initial Transaction/Record.,,
,recordIdentifierFromSource,,String,,,BlueCard_T78601104_1000178899,,,
,referenceIdentifier,,String,,,NA,Place holder to add any specific Reference Identifier based on Business Requirement,,
,retriedReferenceIdentifier,,String,Y (for retried transaction),,NA,This field indicates unique identifier for a transaction that has been retried,,
jobDetails,identifier,,String,Y,,UUID - Primary Identifier (Job Identifier),"Unique identifier for the job, will be unchanged throughout the lifecycle of the job",,
,referenceIdentifier,,String,,,,Placeholder to add any identifier specific to the job,,
,definition,,String,,Y,,Payment definition identifier,,
,transactionCount,,Integer,,Y,,Total number of payments available for processing in the job,,
,startTime,,String,,Y,,Job start time,,
,completionTime,,String,,Y,,"Job completion time, i.e., generation of EDI835 files for all the Payments in the job",,
,status,,String,,Y,,Current status of the job,,
payment,notifyOfs,,Boolean,Y,,,Flag sent from functional services to LCN to identify whether it has to be published to OFS or not,,
,paymentId,,String,,Y,Actual Payment Id,Unique ID for each Payment transaction,,
,totalClaimCount,,Integer,,Y,Total Claim Count,Total number of claims associated/available under the specific Payment transaction,,
,outputFileName,,String,,Y,edi835 File Name,Generated EDI835 file name for the Payment,,
,requestPaymentArchiveFilename,,String,,,,,No use with business,
,responsePaymentArchiveFilename,,String,,,,,No use with business,
,claims,claimIdentifier,String,,Y,UUID - Claim level Identifier,"Unique identifier for each claim, will be different when the claim is reprocessed",Claim Level Audit events for Edifecs  are not in current scope,
,,claimHccId,String,,Y,20241110000948,"Claim HCC ID - Unique ID for each claim, will remain unchanged when reprocessed",DFF Index - 3.003,
,,claimNumber,String,,Y,714045,"Claim Number - Unique number for each claim, will remain unchanged when reprocessed",,
,,claimStatus,String,,Y,,PDS insertion status of the processed Claim,,
,,requestClaimArchiveFilename,String,,,,,,
,,responseClaimArchiveFilename,String,,,,,,
```

## Payment OB/Archive/V25.2.0.0/Archive/Audit JSON_Payment Mapping_V0.1.xlsx — Summary File

```csv
Group,Fields,Sub Fields,Data Type,Mandatory (Present in all Audit points),Mandatory (Present in atleast one Audit Point),835 - Values,Description,Comments
inputDetails,inputId,,String,,,"Value passed is  - {UID}- Uniqie for each file
Example - -dtBkcCHu9bkKu8O",EDI file id,Generated if its not sent in Input file.
,inputType,,String,,,,Defines the type of input file - API or File,
,totalTransactions,,Integer,,,,Total no. of transactions/Record received in API/File,
,inputFileName,,String,,,Input Filename of the EDI file received with filename extension,Name of the input file received from source.,
,inputArchiveFilename,,String,,,Input Filename of the EDI file archived in s3 with filename extension,Name of the input file after archiving the input file.,
process,processStageName,,String,Y,,Edifecs-FileRead,Represent the name of the process stage which post the Audit point.,
,processStatus,,String,Y,,"PROCESSED
SUCCESS
ERROR",Represent the Intermediate or Final status of the process stage which posts the Audit point.,
,processMessage,,String,,,"Connection-timeout
Rejected",Specific information of a particular step after the process is completed.,
,processInputArchiveFilename,,String,,,Input Filename of the EDI file received with filename extension,Name of the input Archive file of the process stage which posts the Audit point.,
,processOutputArchiveFilename,,String,,,NA,Name of the output Archive file of the process stage which posts the Audit point.,
,auditTime,,DateTime,Y,,"The time the audit trigger event got generated in YYYY-MM-ddTHH:mm:ss.SSS format
Sample: 2024-08-05T00:24:16:480",Auditing time of each audit point,
identifiers,rayIdentifier,,String,Y,,RAYID_001,"Unique Identifier for the complete lifecycle of transaction/Record. Will be unchanged even the transaction is Split, passed across various system, reprocessed.",
,recordIdentifier,,String,,Y,"q_5BkDy1SnLR3dO4-000083
q_5BkDy1SnLR3dO4-000083_D",Unique Identifier for transaction level. Will be different when reprocess a same record.,
,tenantIdentifier,,String,,,Product - Can be editable by Implementation team to send their client Name.,Unique identifier for the implementation team,
,sourceTypeIdentifier,,String,,,"Enrollment_ADV, SMOKER_STATUS",Identifier to find from where we received(Starting point) the initial Transaction/Record.,
,recordIdentifierFromSource,,String,,,BlueCard_T78601104_1000178899,,
,referenceIdentifier,,String,,,NA,Place holder to add any specific Reference Identifier based on Business Requirement,
,retriedReferenceIdentifier,,String,Y (for retried transaction),,NA,This field indicates unique identifier for a transaction that has been retried,
jobDetails,identifier,,String,Y,,UUID - Primary Identifier (Job Identifier),"Unique identifier for the job, will be unchanged throughout the lifecycle of the job",
,referenceIdentifier,,String,,,,Placeholder to add any identifier specific to the job,
,definition,,String,,Y,,Payment definition identifier,
,transactionCount,,Integer,,Y,,Total number of payments available for processing in the job,
,startTime,,String,,Y,,Job start time,
,completionTime,,String,,Y,,"Job completion time, i.e., generation of EDI835 files for all the Payments in the job",
,status,,String,,Y,,Current status of the job,
payment,notifyOfs,,Boolean,Y,,,Flag sent from functional services to LCN to identify whether it has to be published to OFS or not,
,paymentId,,String,,Y,Actual Payment Id,Unique ID for each Payment transaction,
,totalClaimCount,,Integer,,Y,Total Claim Count,Total number of claims associated/available under the specific Payment transaction,
,outputFileName,,String,,Y,edi835 File Name,Generated EDI835 file name for the Payment,
,requestPaymentArchiveFilename,,String,,,,,No use with business
,responsePaymentArchiveFilename,,String,,,,,No use with business
,claims,claimIdentifier,String,,Y,UUID - Claim level Identifier,"Unique identifier for each claim, will be different when the claim is reprocessed",Claim Level Audit events for Edifecs  are not in current scope
,,claimHccId,String,,Y,20241110000948,"Claim HCC ID - Unique ID for each claim, will remain unchanged when reprocessed",DFF Index - 3.003
,,claimNumber,String,,Y,714045,"Claim Number - Unique number for each claim, will remain unchanged when reprocessed",
,,claimStatus,String,,Y,,PDS insertion status of the processed Claim,
,,requestClaimArchiveFilename,String,,,,,
,,responseClaimArchiveFilename,String,,,,,
```

## Payment OB/Archive/V25.2.0.0/Archive/Audit JSON_Payment Mapping_V0.1.xlsx — Audit events

```csv
processStageName,processStatus(Payment Level),processMessage,JSON TRIGGER EVENT,Comments
EDIFECS-Conversion,PROCESSED,,After the EDI conversion if it’s a success,
EDIFECS-Conversion,ERROR,Edifecs Translator Error,After the EDI conversion if it’s a failure,
EDIFECS-Validation,SUCCESS,,,
EDIFECS-Validation,ERROR,Edifecs HIPAA Validation Error,"After the SNIP Validations, if it’s a bad record",
,,,,
EDIFECS-Validation,ERROR,File Level Validation Error,In case the full file is rejected due to error in header segments. – File level,
,,,,
,,,,
Success,,,,
EDIFECS-Conversion,PROCESSED,,After the EDI conversion if it’s a success,
EDIFECS-Validation,SUCCESS,,,
,,,,
Error Scenario 1,,,,
EDIFECS-Conversion,ERROR,Edifecs Translator Error,After the EDI conversion if it’s a failure,
,,,,
Error Scenario 2,,,,
EDIFECS-Conversion,PROCESSED,,After the EDI conversion if it’s a success,
EDIFECS-Validation,ERROR,Edifecs HIPAA Validation Error,"After the SNIP Validations, if it’s a bad record",
```

## Payment OB/Archive/V25.2.0.0/Archive/Audit JSON_Payment Mapping_V0.2.xlsx — Cover Page

```csv
,OB Payment Audit Processing -  EDIFECS,,,,,,,,,
,,,,,,,,,,
,Business Area: Claims IB,,,,,,,,,
,,,,,,,,,,
,This document provides the Mapping Specification for EDI 835 OB Payment. Document is intended for EDIFECS Product Team,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,Version,,V25.2.0.0,,,
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

## Payment OB/Archive/V25.2.0.0/Archive/Audit JSON_Payment Mapping_V0.2.xlsx — Legend

```csv
Legend,
,Mandatory for Edifecs to populate for all Audit points
,Mandatory for Edifecs to populate for the last point
,Optional fields can be passed if we have information
```

## Payment OB/Archive/V25.2.0.0/Archive/Audit JSON_Payment Mapping_V0.2.xlsx — Audit JSON Mapping

```csv
Group,Fields,Sub Fields,Data Type,Mandatory (Present in all Audit points),Mandatory (Present in atleast one Audit Point),835 - Values,Description,Comments,
inputDetails,inputId,,String,,,"Value passed is  - {UID}- Uniqie for each file
Example - -dtBkcCHu9bkKu8O",EDI file id,NA for Edifecs,NA for OB payments
,inputType,,String,,,,Defines the type of input file - API or File,,
,totalTransactions,,Integer,,,,Total no. of transactions/Record received in API/File,,
,inputFileName,,String,,,Input Filename of the EDI file received with filename extension,Name of the input file received from source.,,
,inputArchiveFilename,,String,,,Input Filename of the EDI file archived in s3 with filename extension,Name of the input file after archiving the input file.,,
process,processStageName,,String,Y,,Edifecs-FileConversion & File Validation,Represent the name of the process stage which post the Audit point.,,
,processStatus,,String,Y,,"PROCESSED
SUCCESS
ERROR",Represent the Intermediate or Final status of the process stage which posts the Audit point.,,
,processMessage,,String,,,Error,Specific information of a particular step after the process is completed.,,
,processInputArchiveFilename,,String,,,Input Filename of the DFF file received with filename extension,Name of the input Archive file of the process stage which posts the Audit point.,This field is required only if Edifecs is archiving the Input File,
,processOutputArchiveFilename,,String,,,NA,Name of the output Archive file of the process stage which posts the Audit point.,This field is required only if Edifecs is archiving the Output File,
,auditTime,,DateTime,Y,,"The time the audit trigger event got generated in yyyy-MM-dd HH:mm:ss.SSS format
Sample: 2024-08-05 00:24:16:480",Auditing time of each audit point,,
identifiers,rayIdentifier,,String,Y,,"Shared as part of Summary file by Iplus Core team
Format: PaymentExtract_JobID_RayID_RecID_PaymentID
Sample: PaymentExtract_c5f8e2d9-4b6a-42d1-a3f7-9e01b5c3d7e8_a12f7b9d-3e4c-45f0-b8a6-71d9c25e0f34_f8d2a3b7-9c5e-42d1-b6a0-e71f4c0d95e2_62054","Unique Identifier for the complete lifecycle of transaction/Record. Will be unchanged even the transaction is Split, passed across various system, reprocessed.",,
,recordIdentifier,,String,,Y,"Shared as part of Summary file by Iplus Core team
Format: PaymentExtract_JobID_RayID_RecID_PaymentID
Sample: PaymentExtract_c5f8e2d9-4b6a-42d1-a3f7-9e01b5c3d7e8_a12f7b9d-3e4c-45f0-b8a6-71d9c25e0f34_f8d2a3b7-9c5e-42d1-b6a0-e71f4c0d95e2_62054",Unique Identifier for transaction level. Will be different when reprocess a same record.,,
,tenantIdentifier,,String,,,Product - Can be editable by Implementation team to send their client Name.,Unique identifier for the implementation team,,
,sourceTypeIdentifier,,String,,,"Enrollment_ADV, SMOKER_STATUS",Identifier to find from where we received(Starting point) the initial Transaction/Record.,Iplus Core team will be populating,
,recordIdentifierFromSource,,String,,,BlueCard_T78601104_1000178899,,,
,referenceIdentifier,,String,,,NA,Place holder to add any specific Reference Identifier based on Business Requirement,,
,retriedReferenceIdentifier,,String,Y (for retried transaction),,NA,This field indicates unique identifier for a transaction that has been retried,,
jobDetails,identifier,,String,Y,,"Extract File Name:
ExtractName_JobId_RayId_RecId_PaymentId.dat","Unique identifier for the job, will be unchanged throughout the lifecycle of the job","Use the 'JobID' from the Extract File name
ExtractName_JobId_RayId_RecId_PaymentId.dat

E.g.  PaymentExtract_c5f8e2d9-4b6a-42d1-a3f7-9e01b5c3d7e8_a12f7b9d-3e4c-45f0-b8a6-71d9c25e0f34_f8d2a3b7-9c5e-42d1-b6a0-e71f4c0d95e2_62054.dat

where,
ExtractName = PaymentExtract
JobId = c5f8e2d9-4b6a-42d1-a3f7-9e01b5c3d7e8
RayId = a12f7b9d-3e4c-45f0-b8a6-71d9c25e0f34
RecId = f8d2a3b7-9c5e-42d1-b6a0-e71f4c0d95e
PaymentId = 18002",
,referenceIdentifier,,String,,,,Placeholder to add any identifier specific to the job,,
,definition,,String,,Y,,Payment definition identifier,,
,transactionCount,,Integer,,Y,,Total number of payments available for processing in the job,,
,startTime,,String,,Y,,Job start time,,
,completionTime,,String,,Y,,"Job completion time, i.e., generation of EDI835 files for all the Payments in the job",,
,status,,String,,Y,,Current status of the job,,
,paymentId,,String,,Y,Actual Payment Id,Unique ID for each Payment transaction,,
,totalClaimCount,,Integer,,Y,Total Claim Count,Total number of claims associated/available under the specific Payment transaction,,
,outputFileName,,String,,Y,edi835 File Name,Generated EDI835 file name for the Payment,,
,requestPaymentArchiveFilename,,String,,,,,No use with business,
,responsePaymentArchiveFilename,,String,,,,,No use with business,
,claims,claimIdentifier,String,,Y,UUID - Claim level Identifier,"Unique identifier for each claim, will be different when the claim is reprocessed",NA for Edifecs,
,,claimHccId,String,,Y,20241110000948,"Claim HCC ID - Unique ID for each claim, will remain unchanged when reprocessed",,
,,claimNumber,String,,Y,714045,"Claim Number - Unique number for each claim, will remain unchanged when reprocessed",,
,,claimStatus,String,,Y,,PDS insertion status of the processed Claim,,
,,requestClaimArchiveFilename,String,,,,,,
,,responseClaimArchiveFilename,String,,,,,,
```

## Payment OB/Archive/V25.2.0.0/Archive/Audit JSON_Payment Mapping_V0.2.xlsx — Audit events

```csv
processStageName,processStatus(Payment Level),processMessage,JSON TRIGGER EVENT,Comments
EDIFECS-Conversion,PROCESSED,,After the EDI conversion if it’s a success,
EDIFECS-Conversion,ERROR,Edifecs Translator Error,After the EDI conversion if it’s a failure,
EDIFECS-Validation,SUCCESS,,,Need an aggregation status for good and bad
EDIFECS-Validation,ERROR,Edifecs HIPAA Validation Error,"After the SNIP Validations, if it’s a bad record",
,,,,
,,,,
,,,,
Success,,,,
EDIFECS-Conversion,PROCESSED,,After the EDI conversion if it’s a success,
EDIFECS-Validation,SUCCESS,,,
,,,,
Error Scenario 1,,,,
EDIFECS-Conversion,ERROR,Edifecs Translator Error,After the EDI conversion if it’s a failure,"As this pre-requisite is difficult to implement in Test environment, this may not be able to be tested in SIT"
,,,,
Error Scenario 2,,,,
EDIFECS-Conversion,PROCESSED,,After the EDI conversion if it’s a success,
EDIFECS-Validation,ERROR,Edifecs HIPAA Validation Error,"After the SNIP Validations, if it’s a bad record",
```

## Payment OB/Archive/V25.2.0.0/EdifecsProduct_Audit JSON_OB Payment Mapping_V1.0.xlsx — Cover Page

```csv
,OB Payment Audit Processing -  EDIFECS,,,,,,,,,
,,,,,,,,,,
,Business Area: Claims IB,,,,,,,,,
,,,,,,,,,,
,This document provides the Mapping Specification for EDI 835 OB Payment. Document is intended for EDIFECS Product Team,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,Version,,V25.2.0.0,,,
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

## Payment OB/Archive/V25.2.0.0/EdifecsProduct_Audit JSON_OB Payment Mapping_V1.0.xlsx — Legend

```csv
Legend,
,Mandatory for Edifecs to populate for all Audit points
,Mandatory for Edifecs to populate for the last point
,Optional fields can be passed if we have information
```

## Payment OB/Archive/V25.2.0.0/EdifecsProduct_Audit JSON_OB Payment Mapping_V1.0.xlsx — Audit JSON Mapping

```csv
Group,Fields,Sub Fields,Data Type,Mandatory (Present in all Audit points),Mandatory (Present in atleast one Audit Point),835 - Values,Description,Comments,
inputDetails,inputId,,String,,,"Value passed is  - {UID}- Uniqie for each file
Example - -dtBkcCHu9bkKu8O",EDI file id,NA for Edifecs,NA for OB payments
,inputType,,String,,,,Defines the type of input file - API or File,,
,totalTransactions,,Integer,,,,Total no. of transactions/Record received in API/File,,
,inputFileName,,String,,,Input Filename of the EDI file received with filename extension,Name of the input file received from source.,,
,inputArchiveFilename,,String,,,Input Filename of the EDI file archived in s3 with filename extension,Name of the input file after archiving the input file.,,
process,processStageName,,String,Y,,Edifecs-FileConversion & File Validation,Represent the name of the process stage which post the Audit point.,,
,processStatus,,String,Y,,"PROCESSED
SUCCESS
ERROR",Represent the Intermediate or Final status of the process stage which posts the Audit point.,,
,processMessage,,String,,,Error,Specific information of a particular step after the process is completed.,,
,processInputArchiveFilename,,String,,,Input Filename of the DFF file received with filename extension,Name of the input Archive file of the process stage which posts the Audit point.,This field is required only if Edifecs is archiving the Input File,
,processOutputArchiveFilename,,String,,,NA,Name of the output Archive file of the process stage which posts the Audit point.,This field is required only if Edifecs is archiving the Output File,
,auditTime,,DateTime,Y,,"The time the audit trigger event got generated in yyyy-MM-dd HH:mm:ss.SSS format
Sample: 2024-08-05 00:24:16:480",Auditing time of each audit point,,
identifiers,rayIdentifier,,String,Y,,"Shared as part of Summary file by Iplus Core team
Format: PaymentExtract_JobID_RayID_RecID_PaymentID
Sample: PaymentExtract_c5f8e2d9-4b6a-42d1-a3f7-9e01b5c3d7e8_a12f7b9d-3e4c-45f0-b8a6-71d9c25e0f34_f8d2a3b7-9c5e-42d1-b6a0-e71f4c0d95e2_62054","Unique Identifier for the complete lifecycle of transaction/Record. Will be unchanged even the transaction is Split, passed across various system, reprocessed.",,
,recordIdentifier,,String,,Y,"Shared as part of Summary file by Iplus Core team
Format: PaymentExtract_JobID_RayID_RecID_PaymentID
Sample: PaymentExtract_c5f8e2d9-4b6a-42d1-a3f7-9e01b5c3d7e8_a12f7b9d-3e4c-45f0-b8a6-71d9c25e0f34_f8d2a3b7-9c5e-42d1-b6a0-e71f4c0d95e2_62054",Unique Identifier for transaction level. Will be different when reprocess a same record.,,
,tenantIdentifier,,String,,,Product - Can be editable by Implementation team to send their client Name.,Unique identifier for the implementation team,,
,sourceTypeIdentifier,,String,,,"Enrollment_ADV, SMOKER_STATUS",Identifier to find from where we received(Starting point) the initial Transaction/Record.,Iplus Core team will be populating,
,recordIdentifierFromSource,,String,,,BlueCard_T78601104_1000178899,,,
,referenceIdentifier,,String,,,NA,Place holder to add any specific Reference Identifier based on Business Requirement,,
,retriedReferenceIdentifier,,String,Y (for retried transaction),,NA,This field indicates unique identifier for a transaction that has been retried,,
jobDetails,identifier,,String,Y,,"Extract File Name:
ExtractName_JobId_RayId_RecId_PaymentId.dat","Unique identifier for the job, will be unchanged throughout the lifecycle of the job","Use the 'JobID' from the Extract File name
ExtractName_JobId_RayId_RecId_PaymentId.dat

E.g.  PaymentExtract_c5f8e2d9-4b6a-42d1-a3f7-9e01b5c3d7e8_a12f7b9d-3e4c-45f0-b8a6-71d9c25e0f34_f8d2a3b7-9c5e-42d1-b6a0-e71f4c0d95e2_62054.dat

where,
ExtractName = PaymentExtract
JobId = c5f8e2d9-4b6a-42d1-a3f7-9e01b5c3d7e8
RayId = a12f7b9d-3e4c-45f0-b8a6-71d9c25e0f34
RecId = f8d2a3b7-9c5e-42d1-b6a0-e71f4c0d95e
PaymentId = 18002",
,referenceIdentifier,,String,,,,Placeholder to add any identifier specific to the job,,
,definition,,String,,Y,,Payment definition identifier,,
,transactionCount,,Integer,,Y,,Total number of payments available for processing in the job,,
,startTime,,String,,Y,,Job start time,,
,completionTime,,String,,Y,,"Job completion time, i.e., generation of EDI835 files for all the Payments in the job",,
,status,,String,,Y,,Current status of the job,,
,paymentId,,String,,Y,Actual Payment Id,Unique ID for each Payment transaction,,
,totalClaimCount,,Integer,,Y,Total Claim Count,Total number of claims associated/available under the specific Payment transaction,,
,outputFileName,,String,,Y,edi835 File Name,Generated EDI835 file name for the Payment,,
,requestPaymentArchiveFilename,,String,,,,,No use with business,
,responsePaymentArchiveFilename,,String,,,,,No use with business,
,claims,claimIdentifier,String,,Y,UUID - Claim level Identifier,"Unique identifier for each claim, will be different when the claim is reprocessed",NA for Edifecs,
,,claimHccId,String,,Y,20241110000948,"Claim HCC ID - Unique ID for each claim, will remain unchanged when reprocessed",,
,,claimNumber,String,,Y,714045,"Claim Number - Unique number for each claim, will remain unchanged when reprocessed",,
,,claimStatus,String,,Y,,PDS insertion status of the processed Claim,,
,,requestClaimArchiveFilename,String,,,,,,
,,responseClaimArchiveFilename,String,,,,,,
```

## Payment OB/Archive/V25.2.0.0/EdifecsProduct_Audit JSON_OB Payment Mapping_V1.0.xlsx — Audit events

```csv
processStageName,processStatus(Payment Level),processMessage,JSON TRIGGER EVENT,Comments
EDIFECS-Conversion,PROCESSED,,After the EDI conversion if it’s a success,
EDIFECS-Conversion,ERROR,Edifecs Translator Error,After the EDI conversion if it’s a failure,
EDIFECS-Validation,SUCCESS,,,Need an aggregation status for good and bad
EDIFECS-Validation,ERROR,Edifecs HIPAA Validation Error,"After the SNIP Validations, if it’s a bad record",
,,,,
,,,,
,,,,
Success,,,,
EDIFECS-Conversion,PROCESSED,,After the EDI conversion if it’s a success,
EDIFECS-Validation,SUCCESS,,,
,,,,
Error Scenario 1,,,,
EDIFECS-Conversion,ERROR,Edifecs Translator Error,After the EDI conversion if it’s a failure,"As this pre-requisite is difficult to implement in Test environment, this may not be able to be tested in SIT"
,,,,
Error Scenario 2,,,,
EDIFECS-Conversion,PROCESSED,,After the EDI conversion if it’s a success,
EDIFECS-Validation,ERROR,Edifecs HIPAA Validation Error,"After the SNIP Validations, if it’s a bad record",
```

## Payment OB/Archive/V25.2.0.0/EdifecsProduct_Mapping Spec_OutboundPayment_835_DFF_to_EDIConversion_V1.5.xlsx — Coversheet

```csv
Mapping Specification,,,,,,,,,
,,,,,,,,,
EDIFECS - Payment Extract (835) Outbound file,,,,,,,,,
,,,,,,,,,
"Healthcare Advisory and Consulting Team, UST HealthProof",,,,,,,,,
<Account Name> -,,,,,,,,,
,,,,,,,,,
,,,,Version,,1.1,,,
,,,,,,,,,
,Distribution of this document is limited to <Account Name> and UST HealthProof Associates,,,,,,,,
,,,,,,,,,
,Notice of Confidentiality and Custodial Responsibilities,,,,,,,,
,"This <Account Name> document contains confidential information that is
<Account Name> intellectual property. As a holder of this document, you
 may NOT disclose its content or any information derived from it to
any person outside of <Account Name> and UST <Account Name> Project Team.",,,,,,,,
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

## Payment OB/Archive/V25.2.0.0/EdifecsProduct_Mapping Spec_OutboundPayment_835_DFF_to_EDIConversion_V1.5.xlsx — Revision History

```csv
Revision History,,,,
,,,,
V#,Date,Author,Reviewer(s)/ Contributor(s),Comments
1.0,07/01/2023,Vijaya Raj Geethan P,Shijila Raveendran,Updated maaping spec
1.1,11/20/2023,Jishnu,Shijila Raveendran,"Changed the field position for 2100.NM103 2.018 to 2.019
Updated mapping in NM1*IL
Updated mapping in DTM*036
Updated mapping in DTM*232
Added bundling information"
1.2,02/05/2024,Jishnu,Shijila Raveendran,"Updated the mapping 2100.NM1*QC(Patient Name—PSD 1592)
Updated the mapping 2100.NM109(Patient Id—PSD 1628)
Updated the mapping 2110.SVC0-6(Patient Id—PSD 1592)"
1.3,30/4/2024,Ambily,Shijila Raveendran,Updated mapping for 2100.NM1*74 (PSD-2247)
1.4,9/10/24,Deepthi,Shijila Raveendran,Updated mapping for NM1*82*1  (User Story-8473)
1.5,5/7/25,Deepthi,Ambily,"Updated mapping for 1000B & NM1*82*3 (User Story - 16884)
Included NPI logic check"
```

## Payment OB/Archive/V25.2.0.0/EdifecsProduct_Mapping Spec_OutboundPayment_835_DFF_to_EDIConversion_V1.5.xlsx — 835 Mapping

```csv
Loop ID,EDI Segment,EDI Data Element Name,User Option,Length,Enumeration Values,Mapping Logic OR  DFF Position,DFF Field Description,Mapping Comments,Final Review Comments
ISA (Interchange Control Header),,,,,,,,,
,ISA,Segment: Interchange Control Header,R,,,,,,
,ISA01,Authorization Information Qualifier,R,"Min - 2
Max - 2","00 : No Authorization Information Present
03: Additional Data Identification","Hardcode as ""00""",NA,,
,ISA02,Authorization Information,R,"Min - 10
Max - 10",,Leave it blank,NA,,
,ISA03,Security Information Qualifier,R,"Min - 2
Max - 2","00 : No Security Information Present
01 : Password","Hardcode as ""00""",NA,,
,ISA04,Security InformationLQ,R,"Min - 10
Max - 10",,Leave it blank,NA,,
,ISA05,Interchange Sender ID Qualifier,R,"Min - 2
Max - 2","01: Duns (Dun & Bradstreet)
14 Duns Plus Suffix
20 Health Industry Number (HIN)
27 Carrier Identification Number
28 Fiscal Intermediary Identification Number
29 Medicare Provider and Supplier IdentificationNumber
30 U.S. Federal Tax Identification Number
33 National Association of Insurance Commissioners Company Code (NAIC)
ZZ Mutually Defined","Hardcode as ""ZZ""",NA,,
,ISA06,Interchange Sender ID,R,"Min - 15
Max - 15",,"Hardcode as  ""1234           """,NA,"Interchange Sender ID will be different for each customer.From product standpoint, we have hardcoded a random sender ID.",
,ISA07,Interchange Receiver ID Qualifier,R,"Min - 2
Max - 2","01: Duns (Dun & Bradstreet)
14 Duns Plus Suffix
20 Health Industry Number (HIN)
27 Carrier Identification Number
28 Fiscal Intermediary Identification Number
29 Medicare Provider and Supplier IdentificationNumber
30 U.S. Federal Tax Identification Number
33 National Association of Insurance Commissioners Company Code (NAIC)
ZZ Mutually Defined","Hardcode as ""ZZ""",NA,,
,ISA08,Interchange Receiver ID,R,"Min - 15
Max - 15",,"Hardcode  as ""123456789123456""",NA,"Interchange Receiver ID will be different for each customer.From product standpoint, we have hardcoded a random Receiver ID.",
,ISA09,Interchange Date,R,"Min - 6
Max - 6",The date format is YYMMDD.,"Map this value from  current date in the format of ""YYMMDD""",NA,Date  transaction is created – done by translator  (Date for the Process of converting 835 it will be the EDIFECS time of converting 835 ) YYMMDD,
,ISA10,Interchange Time,R,"Min -4
Max - 4",The time format is HHMM.,Map this value from   current time in the format of HHMM,NA,,
,ISA11,Interchange Control Standards Identifier,R,"Min - 1
Max - 1",,"Hardcode as ""^""",NA,,
,ISA12,Interchange Control Version Number,R,"Min - 5
Max - 5","00501 Standards Approved for Publication by ASC X12
Procedures Review Board through October 2003",Hardcode as “00501”,NA,,
,ISA13,Interchange Control Number,R,"Min - 9
Max - 9","The Interchange Control Number, ISA13, must be identical to the
associated Interchange Trailer IEA02.
This Must be a positive unsigned number and must be identical to the value in IEA02.",Refer Column H,NA,Unique ISI control number needs to generated in Edifecs for each 835 EDI file. It has to be 9 digits (for example -  000000764),
,ISA14,Acknowledgement Requested,R,"Min - 1
Max - 1","0 No Interchange Acknowledgment Requested
1 Interchange Acknowledgment Requested (TA1)","Hardcode as ""0""",NA,,
,ISA15,Usage Indicator,R,"Min - 1
Max - 1","P Production Data
T Test Data","Refer Column I and map based on below logic
Hardcode as ""P""  if it is a Production region
Hardcode as ""T""  if it is a Non-Production region",NA,Based on Environmental property whether it is lower region or production region.,
,ISA16,Component element Separator,R,"Min - 1
Max - 1",,"Hardcode  as "":""",NA,,
GS (Functional Group Header),,,,,,,,,
,GS,Segment: Functional Group Header,R,,,,,,
,GS01,Functional Identifier Code,R,"Min - 2
Max - 2",HP Health Care Claim Payment/Advice (835),Hardcode as “HP”,NA,,
,GS02,Application Sender Code,R,"Min -2
Max - 15",,"Hardcode as ""1234""",NA,"Application Sender Code will be different for each customer.From product standpoint, we have hardcoded a random Application Sender Code.",
,GS03,Application Receiver ID,R,"Min -2
Max - 15",,"Hardcode as ""Product""",NA,"Application Receiver ID will be different for each customer.From product standpoint, we have hardcoded a random Application Application Receiver ID.",
,GS04,Date,R,"Min - 8
Max - 8",Date Expressed in YYYYMMDD format (Current Date),"Map this value from  current date in the format of ""YYYYMMDD""",NA,,
,GS05,Time,R,"Min - 4
Max - 8",,"Map this value from   current Time in the format of ""HHMMSS""",NA,,
,GS06,Group Control Number,R,"Min - 1
Max - 9",,,NA,"Functional Group Control Number. Value must equal GE02

GS control number min length - 1 and max is 9",
,GS07,Responsible Agency Code,R,"Min - 1
Max - 2",X Accredited Standards Committee X12,"Hardcode as ""X""",NA,,
,GS08,Version/Release/Industry Identifier,R,"Min - 1
Max - 12","005010X221 Standards Approved for Publication by ASC X12
Procedures Review Board through October 2003","Hardcode as ""005010X221A1""",NA,,
ST Transaction Set Header,,,,,,,,,
,ST,Segment: Transaction Set Header,R,,,,,,
,ST01,Transaction Set Identifier Code,R,"Min - 3
Max - 3",835 Health Care Claim Payment/Advice,"Hardcode as ""835""",NA,,
,ST02,Transaction Set Control Number,R,"Min - 4
Max - 9",,Refer Column H,NA,Unique control number needs to populated from process flow or map,
BPR Financial Information,,,,,,,,,
,BPR,Segment: Financial Information,R,,,,,Currently we are not mapping ACH payments,
,BPR01,Transaction Handling Code,R,"Min - 1
Max - 2","C Payment Accompanies Remittance Advice
D Make Payment Only
H Notification Only
I Remittance Information Only
P Prenotification of Future Transfers
U Split Payment and Remittance
X Handling Party’s Option to Split Payment and
Remittance","Hardcode as ""I"" for EFT/Check payments
Hardcode as ""H"" when the actual provider payment amount(BPR02) is zero.",NA,Currently ACH payment is not in scope for product. Need to verify future scope for ACH payment mapping . IBC conifrmed they don’t have ACH scope.,
,BPR02,Monetary Amount,R,"Min - 1
Max - 18",Cheque Amount,Map this value from the DFF index 1.006,CheckAmount,,
,BPR03,Credit/Debit Flag,R,"Min - 1
Max - 1","C Credit
D Debit","Hardcode as ""C""",NA,,
,BPR04,PAYMENT METHOD CODE,R,"Min - 3
Max - 3","ACH Automated Clearing House (ACH)
BOP Financial Institution Option
CHK Check
FWT Federal Reserve Funds/Wire Transfer - Nonrepetitive
NON Non-Payment Data","Hardcode as ""CHK""  for check
Hardcode as ""ACH"" for Electronic payment
Hardcode as ""NON"" if the the actual provider payment amount(BPR02) is zero.",NA,"""CHK"" = Check, ""ACH"" = EFT payments, ""NON"" = Non payments",
,BPR05,PAYMENT FORMAT CODE,S,"Min - 1
Max - 10","CCP Cash Concentration/Disbursement plus Addenda
(CCD+) (ACH)

CTX Corporate Trade Exchange (CTX) (ACH)",,NA,Currently ACH payment is not in scope for product. Need to verify future scope for ACH payment mapping . IBC conifrmed they don’t have ACH scope.,
,BPR06,(DFI) ID NUMBER QUALIFIER,S,"Min - 2
Max - 2","01 ABA Transit Routing Number Including Check Digits
(9 digits)
04 Canadian Bank Branch and Institution Number",,NA,,
,BPR07,(DFI) IDENTIFICATION NUMBER,S,"Min - 3
Max - 12",,,MICRTransitNumber,,
,BPR08,Account Number Qualifier,S,"Min - 1
Max - 3",DA Demand Deposit,,NA,,
,BPR09,Sender Bank Account Number,S,"Min - 1
Max - 35",,,AccountNumber,,
,BPR010,ORIGINATING COMPANY IDENTIFIER,S,"Min - 10
Max - 10",,,NA,,
,BPR11,Originating Company Supplemental Code,S,"Min -9
Max - 9",,,NA,,
,BPR12,DFI Identification Number Qualifier,S,"Min - 2
Max - 2","01 ABA Transit Routing Number Including Check Digits
(9 digits)
04 Canadian Bank Branch and Institution Number",,NA,,
,BPR013,Receiver or Provider Bank ID Number,S,"Min - 3
Max - 12",,,Payee Bank ID Number,,
,BPR014,ACCOUNT NUMBER QUALIFIER,S,"Min - 1
Max - 3","DA Demand Deposit
SG Savings",,Account Number Qualifier,,
,BPR015,Receiver or Provider Account Number,S,"Min - 1
Max - 35",,,Payee Account Number,,
,BPR016,Check Issue or EFT Effective Date,S,"Min - 8
Max - 8",,"Map this value from the DFF index 1.005

Date format ""YYYYMMDD""",CheckDate,YYYYMMDD,
TRN Reassociation Trace Number,,,,,,,,,
,TRN,Segment: Reassociation Trace Number,R,,,,,,
,TRN01,Trace Type Code,R,"Min - 1
Max - 2",1 Current Transaction Trace Numbers,"Hardcode as ""1""",NA,,
,TRN02,REFERENCE IDENTIFICATION,R,"Min - 1
Max - 50",,Map this value from the DFF index 1.004,CheckNumber,,
,TRN03,ORIGINATING COMPANY IDENTIFIER,R,"Min - 10
Max - 10",,"Hardcode as ""1841297547""",NA,"1 Followed by payer TIN

ORIGINATING COMPANY IDENTIFIER will be different for each customer.From product standpoint, we have hardcoded a random ORIGINATING COMPANY IDENTIFIER.",
,TRN04,Originating Company Supplemental Code,S,"Min - 1
Max - 50",,NA,NA,,
CUR Foreign Currency Information,,,,,,,,,
,CUR,Segment: Foreign Currency Information,S,,,,,,
,CUR01,Entity Identifier Code,R,"Min - 2
Max - 3",PR Payer,NA,NA,,
,CUR02,Currency Code,R,"Min - 3
Max - 3",,NA,NA,,
REF Receiver Identification,,,,,,,,,
,REF,Segment: Receiver Identification,S,,,,,,
,REF01,Reference Identification Qualifier,R,"Min - 2
Max - 3",EV Receiver Identification Number,NA,NA,,
,REF02,Reference Identification,R,"Min - 1
Max - 50",,NA,NA,,
REF Version Identification,,,,,,,,,
,REF,Segment: Version Identification,S,,,,,,
,REF01,Reference Identification Qualifier,R,"Min - 2
Max - 3",F2 Version Code - Local,NA,NA,,
,REF02,Reference Identification,R,"Min - 1
Max - 50",,NA,NA,,
DTM Production Date,,,,,,,,,
,DTM,Segment: Production Date,S,,,,,,
,DTM01,Date/Time qualifier,R,"Min - 3
Max - 3",405 Production,"Hardcode as ""405""",NA,,
,DTM02,Date,R,"Min - 8
Max - 8",,"Map this value from  system date in the format ""YYYYMMDD""",NA,,
LOOP 1000A - Payer Identification,,,,,,,,,
1000A,N1,Payer Identification,R,,,,,,
1000A,N101,Payer Identifier Code,R,"Min - 2
Max - 3",PR Payer,"Hardcode as ""PR""",NA,,
1000A,N102,Payer NAME,R,"Min - 1
Maxi - 60",,"Hardcode as ""PRODUCT""",NA,,
1000A,N103,Identification Code Qualifier,S,"Min - 1
Max - 2",XV Centers for Medicare and Medicaid Services PlanID,NA,NA,,
1000A,N104,Payer Identification Code,S,"Min- 2
Max - 80",,NA,NA,,
1000A,N3,Payer Address,R,,,,,,
1000A,N301,Payer Address Line,R,"Min - 1
Max - 55",,"Hardcode as ""XXXX""",NA,,
1000A,N302,Payer Address Line,S,"Min - 1
Max - 55",,NA,NA,,
1000A,N4,"Segment : Payer City, State, Zip Code",R,,,,,,
1000A,N401,Payer City Name,R,"Min - 1
Max - 30",,"Hardcode as ""Aurora""",NA,"Payer City Name will be different for each customer.From product standpoint, we have hardcoded a random Payer City Name.",
1000A,N402,Payer State Code,S,"Min - 2
Max - 2",,"Hardcode as ""CO""",NA,"Payer state will be different for each customer.From product standpoint, we have hardcoded a random Payer state.",
1000A,N403,Payer Postal Zone or Zip Code,S,"Min - 1
Max - 15",,"Hardcode as ""80014""",NA,"Payer Postal Zone will be different for each customer.From product standpoint, we have hardcoded a random Payer Postal Zone.",
1000A,REF,Additional Payer Identification,S,,,,,,
1000A,REF01,Reference Identifier Qualifier,R,"Min - 2
Max - 3","2U Payer Identification Number
EO Submitter Identification Number
HI Health Industry Number (HIN)NF National Association of Insurance Commissioners (NAIC) Code","Hardcode as ""2U""",NA,,
1000A,REF02,Additional Payer Identifier,R,"Min - 1
Max - 50",,"Hardcode as ""6058028""",NA,"Payer identifier will be different for each customer.From product standpoint, we have hardcoded a random Payer identifier.",
1000A,PER,Payer Business Contact Information,S,,,,,,
1000A,PER01,Contact Function Code,R,"Min - 2
Max - 2",CX Payers Claim Office,"Hardcode as ""CX""",NA,,
1000A,PER02,Payer Contact Name,S,"Min - 1
Max - 60",,"Hardode as ""EDI Coordinator""",NA,"Payer Contact Name will be different for each customer.From product standpoint, we have hardcoded a random Payer Contact Name.",
1000A,PER03,Communication Number Qualifier,S,"Min - 2
Max - 2","EM Electronic Mail
FX Facsimile
TE Telephone","Hardcode as ""TE""",NA,,
1000A,PER04,Payer Contact Communication Number,S,"Min - 1
Max - 256",,"Hardcode as ""1234567890""",NA,"Payer Contact Communication Number will be different for each customer.From product standpoint, we have hardcoded a random Payer Contact Communication Number.",
1000A,PER05,Communication Email Qualifier,S,"Min - 2
Max - 2","EM Electronic Mail
EX Telephone Extension
FX Facsimile
TE Telephone",Hardcode as “EM”,NA,,
1000A,PER06,Payer Contact Communication Email,S,"Min - 1
Max - 256",,Hardcode as “xyz@xyz.com”,NA,"Payer Contact Communication Email will be different for each customer.From product standpoint, we have hardcoded a random Payer Contact Communication Email.",
1000A,PER07,Communication Number Qualifier,S,"Min - 2
Max - 2",EX Telephone Extension,,,,
1000A,PER08,Communication Number,S,"Min - 1
Max - 256",,,,,
1000A,PER,Payer Technical Contact Information,R,,,,,,
1000A,PER01,Contact Function Code,R,"Min - 2
Max - 2",BL Technical Department,Hardcode as “BL”,NA,,
1000A,PER02,Payer Technical Contact Name,S,"Min - 1
Max - 60",,"Hardode as ""EDI Coordinator""",NA,"Payer Technical Contact Name will be different for each customer.From product standpoint, we have hardcoded a random Payer Technical Contact Name.",
1000A,PER03,Communication Number Qualifier,S,"Min - 2
Max - 2","EM Electronic Mail
TE Telephone
Recommended
UR Uniform Resource Locator (URL)
Use only when there is no central telephone number
for the payer entity.",Hardcode as “TE”,NA,,
1000A,PER04,Payer Contact Communication Number,S,"Min - 1
Max - 256",,"Hardcode as ""1234567890""",NA,"Payer Contact Communication Number will be different for each customer.From product standpoint, we have hardcoded a random Payer Contact Communication Number.",
1000A,PER05,Payer Contact Communication Number,S,"Min - 2
Max - 2","M Electronic Mail
EX Telephone Extension
FX Facsimile
TE Telephone
UR Uniform Resource Locator (URL)",Hardcode as “EM”,NA,,
1000A,PER06,Payer Technical Contact Communication,S,"Min - 1
Max - 256",,"Hardcode as ""contactus@uhc.com""",NA,"Payer Technical Contact Communication will be different for each customer.From product standpoint, we have hardcoded a random Payer Technical Contact Communication.",
1000A,PER07,Communication Number Qualifier,S,"Min - 2
Max - 2","EM Electronic Mail
EX Telephone Extension
FX Facsimile
UR Uniform Resource Locator (URL)",,,,
1000A,PER08,Communication Number,S,"Min - 1
Max - 256",,,,,
1000A,PER,Payer Web Site,S,,,,,,
1000A,PER01,Contact Function Code,R,"Min - 2
Max - 2",IC Information Contact,"Hardcode as ""IC""",NA,,
1000A,PER02,Name,R,NA,NA,NA,NA,,
1000A,PER03,Communication Number Qualifier,R,"Min - 2
Max - 2",UR Uniform Resource Locator (URL),"Hardcode as ""UR""",NA,,
1000A,PER04,Communication Number,R,"Min - 1
Max - 256",,"Hardcode as ""www.uhc.com""",,"Communication Number will be different for each customer.From product standpoint, we have hardcoded a random Communication Number.",
LOOP 1000B Payee Identification,,,,,,,,,
1000B,N1,Payee Identification,R,,,,,,
1000B,N101,Payer Identifier Code,R,"Min - 2
Max - 3",PE Payee,"Hardcode as ""PE""",NA,,
1000B,N102,Payee Name,R,"Min - 1
Max - 60",,Map this value from the DFF index 1.017,PayeeName,,
1000B,N103,Payee Identification Code Qualifier,R,"Min - 1
Max - 2","FI Federal Taxpayer’s Identification Number
XV Centers for Medicare and Medicaid Services PlanID
XX Centers for Medicare and Medicaid Services
National Provider Identifier","Hardcode as ""XX""",NA,,
1000B,N104,Payee Identification Code,R,"Min - 2
Max - 80",,Map this value from the DFF index 1.033,Payee NPI,,
1000B,N3,Payee Address,S,,,,,,
1000B,N301,Payee Address Line,R,"Min - 1
Max - 55",,Map this value from the DFF index  1.018,PayeeAddress1,,
1000B,N302,Payee Address Line,S,"Min - 1
Max - 56",,Map this value from the DFF index  1.019,PayeeAddress2,,
1000B,N4,"Payee City, State, Zip Code",S,,,,,,
1000B,N401,Payee City Name,R,"Min - 2
Max - 30",,Map this value from the DFF index  1.020,PayeeCity,,
1000B,N402,Payee State Code,S,"Min - 2
Max - 2",,Map this value from the DFF index  1.021,PayeeState,,
1000B,N403,Payee Postal Zone or Zip Code,S,"Min - 3
Max - 15",,Map this value from the DFF index  1.022,PayeeZip,,
1000B,N404,Country Code,S,"Min - 2
Max - 3",,NA,NA,,
1000B,N407,Country Subdivision Code,S,"Min - 1
Max - 3",,NA,NA,,
1000B,REF,Payee Additional Identification,S,,,,,,
1000B,REF01,Additional Payee Identification Qualifier,R,"Min - 2
Max - 3","0B State License Number
D3 National Council for Prescription Drug Programs
Pharmacy Number
PQ Payee Identification
TJ Federal Taxpayer’s Identification Number","Hardcode as ""TJ""",NA,,
1000B,REF02,Reference Identification Code,R,"Min - 1
Max - 50",,Map this value from the DFF index  1.032,Payee SSN/TIN,"Remove ""-"" If it is present in 1.032",
1000B,RDM,Remittance Delivery Method,S,,,,,,
1000B,RDM01,Report Transmission Code,R,"Min - 1
Max - 2","BM By Mail
EM E-Mail
FT File Transfer
OL On-Line",NA,NA,,
1000B,RDM02,Name,S,"Min - 1
Max - 60",,NA,NA,,
1000B,RDM03,Communication Number,S,"Min - 1
Max - 256",,NA,NA,,
LOOP 2000 Header Number,,,,,,,,,
2000,LX,Header Number,S,,,,,,
2000,LX01,Assigned Number,R,"Min - 1
Max - 6",,Refer to column I,NA,"Assigned Number - When 835 is created it needs to generated, starts with 1 , it increments for each CLP segement mentioned in Row#174, 2100 Loop",
2000,TS3,Provider Summary Information,S,,,,,,
2000,TS301,Reference Identification,R,"Min - 1
Max - 50",,NA,NA,,
2000,TS302,Facility Code Value,R,"Min - 1
Max - 2",,NA,NA,,
2000,TS303,Date,R,"Min - 8
Max - 8",,,NA,,
2000,TS304,Quantity,R,"Min - 1
Max - 15",,NA,NA,,
2000,TS305,Monetary Amount,R,"Min - 1
Max - 18",,NA,NA,,
2000,TS313,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS315,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS317,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS318,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS320,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS321,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS322,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS323,Quantity,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS324,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS2,Provider supplemental Summary Information,S,,,,,,
2000,TS201,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS202,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS203,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS204,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS205,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS206,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS207,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2000,TS208,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS209,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS210,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2000,TS211,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2000,TS212,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2000,TS213,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2000,TS214,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2000,TS215,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS216,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2000,TS217,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS218,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS219,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
LOOP 2100 Claim payment Information,,,,,,,,,
2100,CLP,Claim payment Information,R,,,,,,
2100,CLP01,Patient Control Number,R,"Min - 1
Max - 38",,Map this value from the DFF index  2.079,Patient Control Number,,
2100,CLP02,Claim Status Code,R,"Min - 1
Max - 2","1 Processed as Primary
2 Processed as Secondary
3 Processed as Tertiary
4 Denied
19 Processed as Primary, Forwarded to Additional
Payer(s)
20 Processed as Secondary, Forwarded to Additional
Payer(s)
21 Processed as Tertiary, Forwarded to Additional
Payer(s)
22 Reversal of Previous Payment
23 Not Our Claim, Forwarded to Additional Payer(s)
25 Predetermination Pricing Only - No Payment",Map this value from the DFF index   2.04,ClaimStatusCode,,
2100,CLP03,Total Claim Charge Amount,R,"Min - 1
Ma - 18",,Map this value from the DFF index  2.028,ChargeAmount,,
2100,CLP04,Total Claim Payment Amount,R,"Min - 1
Max - 18",,Map this value from the DFF index  2.037,PaidAmount,,
2100,CLP05,Patient Responsibility Amount,S,"Min - 1
Max - 18",,Map this value from the DFF index  2.038,PatientOwedamount,"This mapping is required when the patient responsibility is greater than zero, if not required.",
2100,CLP06,Claim Filing Indicator Code,R,"Min - 2
Max - 2","12 Preferred Provider Organization (PPO)
13 Point of Service (POS)
14 Exclusive Provider Organization (EPO)
15 Indemnity Insurance
16 Health Maintenance Organization (HMO) Medicare
Risk
17 Dental Maintenance Organization
AM Automobile Medical
CH Champus
DS DisabilityHM Health Maintenance Organization
LM Liability Medical
MA Medicare Part A
MB Medicare Part B
MC Medicaid
OF Other Federal Program
TV Title V
VA Veterans Affairs Plan
WC Workers’ Compensation Health Claim
ZZ Mutually Defined","Hardcode as ""HM""",NA,,
2100,CLP07,Payer Claim Control Number (Payer Claim Control Number – HRP claim number ),R,"Min - 1
Max - 50",,Map this value from the DFF index 2.003,ClaimNumber,,
2100,CLP08,Facility Type Code,S,"Min - 1
Max - 2",,Map this value from the DFF index 2.061,Facility Code Value,,
2100,CLP09,Claim Frequency Code,S,"Min - 1
Max - 1",,Map this value from the DFF index 2.083,Frequency code,,
2100,CLP10,Patient Status Code,NA,NA,NA,NA,NA,,
2100,CLP11,Diagnosis Related Group (DRG) Code,S,"Min - 1
Max - 4",,Map this value from the DFF index 2.069,Diagnosis Related Group Code,,
2100,CLP12,DRG Weight,S,"Min - 1
Max - 15",,Map this value from the DFF index 2.068,DRG Weight (Record Type 2 Claim Level Information),,
2100,CLP13,PERCENT - Discharge Fraction,S,"Min - 1
Max - 10",,NA,NA,,
2100,CAS,Claim Adjustment,S,,,,,All the adjustment details are mentioned in line level (2110 CAS Segment),
2100,CAS01,Claim Adjustment Group Code,R,"Min - 1
Max - 2","CO Contractual Obligations
OA Other adjustments
PI Payor Initiated Reductions
PR Patient Responsibility",NA,NA,,
2100,CAS02,Adjustment Reason Code,R,"Min - 1
Max - 5",,NA,NA,,
2100,CAS03,Adjustment Amount,R,"Min - 1
Max - 18",,NA,NA,,
2100,CAS04,QUANTITY,S,"Min - 1
Max - 15",,NA,NA,,
2100,CAS05,Claim Adjustment Reason Code,S,"Min - 1
Max - 2",,NA,NA,,
2100,CAS06,Monetary Amount,S,"Min - 1
Max - 18",,,,,
2100,CAS07,Quantity,S,"Min - 1
Max - 15",,,,,
2100,CAS08,Claim Adjustment Reason Code,S,"Min - 1
Max - 2",,,,,
2100,CAS09,Monetary Amount,S,"Min - 1
Max - 18",,,,,
2100,CAS10,Quantity,S,"Min - 1
Max - 15",,,,,
2100,CAS11,Claim Adjustment Reason Code,S,"Min - 1
Max - 2",,,,,
2100,CAS12,Monetary Amount,S,"Min - 1
Max - 18",,,,,
2100,CAS13,Quantity,S,"Min - 1
Max - 15",,,,,
2100,CAS14,Claim Adjustment Reason Code,S,"Min - 1
Max - 2",,,,,
2100,CAS15,Monetary Amount,S,"Min - 1
Max - 18",,,,,
2100,CAS16,Quantity,S,"Min - 1
Max - 15",,,,,
2100,CAS17,Claim Adjustment Reason Code,S,"Min - 1
Max - 2",,,,,
2100,CAS18,Monetary Amount,S,"Min - 1
Max - 18",,,,,
2100,CAS19,Quantity,S,"Min - 1
Max - 15",,,,,
2100,NM1,Patient Name,R,,,,,,
2100,NM101,Patient Identifier Code,R,"Min - 2
Max - 3",QC Patient,"Hardcode as ""QC""",NA,,
2100,NM102,Entity Type Qualifier,R,"Min - 1
Max - 1",1 Person,"Hardcode as ""1""",NA,,
2100,NM103,Patient Last  Name,S,"Min - 1
Max - 60",,Map this value from the DFF index 2.087 - Map only the Lastname,"SubmittedPatientLastName
Format: (SubmittedPatientLastName, Middle Name,Firstname)","If 2.087 doesnt have comma(,) Map from position 2.080 (Corrected patient information)",
2100,NM104,Patient First Name,S,"Min - 1
Max - 35",,Map this value from the DFF index 2.087 - Map only the First name,"SubmittedPatientLastName
Format: (SubmittedPatientLastName, Middle Name,Firstname)","If 2.087 doesnt have comma(,) Map from position 2.081 (Corrected patient information)",
2100,NM105,Patient Middle Initial,S,"Min - 1
Max - 25",,Map this value from the DFF index 2.087- Map only the Middle name,"SubmittedPatientLastName
Format: (SubmittedPatientLastName, Middle Name,Firstname)","If 2.087 doesnt have comma(,) Map from position 2.082 (Corrected patient information)",
2100,NM106,Name Prefix,NA,NA,,NA,NA,,
2100,NM107,Patient Name Suffix,S,"Min - 1
Max - 10",,NA,NA,,
2100,NM108,Identification Code Qualifier,S,"Min - 1
Max - 2","34 Social Security Number
HN Health Insurance Claim (HIC) Number
II Standard Unique Health Identifier for each Individual
in the United States
Use this code if mandated in a final Federal Rule.
MI Member Identification Number
MR Medicaid Recipient Identification Number","Hardcode as ""MI""",NA,,
2100,NM109,Patient Member Number,S,"Min - 2
Max - 80",,Map this value from the DFF index 2.084,SubmittedPatientID,If no values present in 2.084 then map from 2.005 (Corrected patient id),
2100,NM1,Insured Name,S,,If subscriber and patient are same we will not map this entire segment,,,,
2100,NM101,Entity Identifier Code,R,"Min - 2
Max - 3",IL,"Hardcode as ""IL""",,If the subscriber is not same as patient,
2100,NM102,Entity Type Qualifier,R,"Min - 1
Max - 1","1,2","Hardcode as ""1""",,,
2100,NM103,Name Last or Organization Name,S,"Min - 1
Max - 60",,Map this value from the DFF index 2.091,SubscriberLastName,,
2100,NM104,Name First,S,"Min - 1
Max - 35",,Map this value from the DFF index 2.089,SubscriberFirstName,,
2100,NM105,Name Middle,S,"Min - 1
Max - 25",,Map this value from the DFF index 2.090,SubscriberMiddleName,,
2100,NM107,Name Suffix,ISA,"Min - 1
Max - 10",,NA,NA,,
2100,NM108,Identification Code Qualifier,R,"Min - 1
Max - 2","FI,II,MI","Hardcode as ""MI""",NA,,
2100,NM109,Identification Code,R,"Min - 2
Max - 80",,Map this value from the DFF index 2.088,SubscriberID,,
2100,NM1,Corrected Patient/Insured Name,S,,,,,,
2100,NM101,Entity Identifier Code,R,"Min - 2
Max - 3",74 Corrected Insured,"Hardcode as ""74""",NA,"Map this segment only if
the name in 2.080+2.082+2.081 is different from 2.087
OR
ID in 2.005 is different from 2.084",
2100,NM102,Entity Type Qualifier,R,"Min - 1
Max - 1","1 Person
2 Non-Person Entity","Hardcode as ""1""",NA,,
2100,NM103,Name Last or Organization Name,S,"Min - 1
Max - 60",,Map this value from the DFF index 2.080,Patient Last name,Map only if  the name in 2.080+2.082+2.081 is different from 2.087,
2100,NM104,Name First,S,"Min - 1
Max - 35",,Map this value from the DFF index 2.081,Patient First name,Map only if  the name in 2.080+2.082+2.081 is different from 2.087,
2100,NM105,Name Middle,S,"Min - 1
Max - 25",,Map this value from the DFF index 2.082,Patient Middle name,Map only if  the name in 2.080+2.082+2.081 is different from 2.087,
2100,NM107,Name Suffix,S,"Min - 1
Max - 10",,NA,NA,,
2100,NM108,Identification Code Qualifier,S,"Min - 1
Max - 2",C Insured’s Changed Unique Identification Number,"Hardcode as ""C""",NA,,
2100,NM109,Identification Code,S,"Min - 2
Max - 80",,Map this value from the DFF index 2.005,PatientID,Map only if  ID in 2.005 is different from 2.084,
2100,NM1,Service Provider Name,S,,,,,,
2100,NM101,Entity Identifier Code,R,"Min - 2
Max - 3",82 Rendering Provider,"Hardcode as ""82""",NA,"1. This NM1*82 is a configurable item. A flag will be configured in Edifecs layer with Y/N value.
If Y - NM103, NM104 & NM105 will be splited and populated.
If N - only NM103 will populated with value. NM104 & NM105 should be blank
2. Populate NM1*82 only if 2.016 is different from 1.033",NPI should be the only check
2100,NM102,Entity Type Qualifier,R,"Min - 1
Max - 1","1 Person
2 Non-Person Entity","Hardcode as ""1""",NA,,
2100,NM103,Name Last or Organization Name,S,"Min - 1
Max - 60",,"Logic 1:
If Flag Y - Map this value from the DFF index 2.094
If Flag N - Map this value from the DFF index 2.018
Logic 2:
Do not populate NM1*82, If 2.018  is equal to 1.017",,Populate NM1*82 only if 2.018 is different from 1.017,"Currently we have Logic 2 in our code, but it Logic 2 is optional one to be considered"
2100,NM104,Name First,S,"Min - 1
Max - 35",,"If Flag Y - Map this value from the DFF index 2.092
If Flag N - NA",NA,,
2100,NM105,Name Middle,S,"Min - 1
Max - 25",,"If Flag Y - Map this value from the DFF index 2.093
If Flag N - NA",NA,,
2100,NM107,Name Suffix,S,"Min - 1
Max - 10",,NA,NA,,
2100,NM108,Identification Code Qualifier,R,"Min - 1
Max - 2","BD Blue Cross Provider Number
BS Blue Shield Provider Number
FI Federal Taxpayer’s Identification Number
MC Medicaid Provider Number
PC Provider Commercial Number
SL State License Number
UP Unique Physician Identification Number (UPIN)
XX Centers for Medicare and Medicaid Services
National Provider Identifier","Hardcode as ""XX""",NA,,
2100,NM109,Identification Code,R,"Min - 2
Max - 80",,Map this value from the DFF index 2.016,ProviderNPI,Map only if  ID in 2.005 is different from 2.084,
2100,NM1,Crossover Carrier Name,S,,,,,,
2100,NM101,Entity Identifier Code,R,"Min - 2
Max - 3",TT Transfer To,NA,NA,,
2100,NM102,Entity Type Qualifier,R,"Min - 1
Max - 1",2 Non-Person Entity,NA,NA,,
2100,NM103,Name Last or Organization Name,R,"Min - 1
Max - 60",,NA,NA,,
2100,NM108,Identification Code Qualifier,R,"Min - 1
Max - 2","AD Blue Cross Blue Shield Association Plan Code
FI Federal Taxpayer’s Identification Number
NI National Association of Insurance Commissioners
(NAIC) Identification
PI Payor Identification
PP Pharmacy Processor Number
XV Centers for Medicare and Medicaid Services PlanID",NA,NA,,
2100,NM109,Identification Code,R,"Min - 2
Max - 80",,NA,NA,,
2100,NM1,Corrected Priority Payer Name,S,,,,,,
2100,NM101,Entity Identifier Code,R,"Min - 2
Max - 3",PR Payer,NA,NA,,
2100,NM102,Entity Type Qualifier,R,"Min - 1
Max - 1",2 Non-Person Entity,NA,NA,,
2100,NM103,Name Last or Organization Name,R,"Min - 2
Max - 60",,NA,NA,,
2100,NM108,Identification Code Qualifier,R,"Min - 1
Max - 2","AD Blue Cross Blue Shield Association Plan Code
FI Federal Taxpayer’s Identification Number
NI National Association of Insurance Commissioners
(NAIC) Identification
PI Payor Identification
PP Pharmacy Processor Number
XV Centers for Medicare and Medicaid Services PlanID",NA,NA,,
2100,NM109,Identification Code,R,"Min - 2
Max - 80",,NA,NA,,
2100,NM1,Other Subscriber Name,S,,,,,,
2100,NM101,Entity Identifier Code,R,"Min - 2
Max - 3",GB Other Insured,NA,NA,,
2100,NM102,Entity Type Qualifier,R,"Min - 1
Max - 1","1 Person
2 Non-Person Entity",NA,NA,,
2100,NM103,Name Last or Organization Name,S,"Min - 1
Max - 60",,NA,NA,,
2100,NM104,Name First,S,"Min - 1
Max - 35",,NA,NA,,
2100,NM105,Name Middle,S,"Min - 1
Max - 25",,NA,NA,,
2100,NM107,Name Suffix,S,"Min - 1
Max - 10",,NA,NA,,
2100,NM108,Identification Code Qualifier,S,"Min - 1
Max - 2","FI Federal Taxpayer’s Identification Number
II Standard Unique Health Identifier for each Individual
in the United States
MI Member Identification Number",NA,NA,,
2100,NM109,Identification Code,S,"Min - 2
Max - 80",,NA,NA,,
2100,MIA,Inpatient Adjudication Information,S,,,,,,
2100,MIA01,Quantity,R,"Min - 1
Max - 15",,NA,NA,,
2100,MIA02,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA03,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2100,MIA04,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA05,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2100,MIA06,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA07,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA08,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA09,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA10,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA11,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA12,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA13,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA14,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA15,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2100,MIA16,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA17,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA18,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA19,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA20,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2100,MIA21,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2100,MIA22,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2100,MIA23,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2100,MIA24,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MOA,Outpatient Adjudication Information,S,,,,,,
2100,MOA01,Percentage as Decimal,S,"Min - 1
Max - 10",,NA,NA,,
2100,MOA02,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MOA03,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2100,MOA04,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2100,MOA05,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2100,MOA06,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2100,MOA07,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2100,MOA08,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MOA09,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,REF,Other Claim Related Identification,S,,,,,,
2100,REF01,Reference Identification Qualifier,R,"Min - 2
Max - 3","1L Group or Policy Number
1W Member Identification Number
28 Employee Identification Number
6P Group Number
9A Repriced Claim Reference Number
9C Adjusted Repriced Claim Reference Number
BB Authorization Number
CE Class of Contract Code
EA Medical Record Identification Number
F8 Original Reference Number
G1 Prior Authorization Number
G3 Predetermination of Benefits Identification Number
IG Insurance Policy Number
SY Social Security Number","Hardcode as ""1L""",NA,,
2100,REF02,Reference Identification,R,"Min - 1
Max - 50",,Map this value from the DFF index 2.025,GroupCode,,
2100,REF,Rendering Provider Identification,S,,,,,,
2100,REF01,Reference Identification Qualifier,R,"Min - 2
Max - 3","0B State License Number
1A Blue Cross Provider Number
1B Blue Shield Provider Number
1C Medicare Provider Number
1D Medicaid Provider Number
1G Provider UPIN Number
1H CHAMPUS Identification Number
1J Facility ID Number
D3 National Council for Prescription Drug Programs
Pharmacy Number
G2 Provider Commercial Number
LU Location Number",NA,NA,,
2100,REF02,Reference Identification,R,"Min - 1
Max - 50",,NA,NA,,
2100,DTM,Statement From or To Date,S,,,,,,
2100,DTM01,Date/Time Qualifier,R,"Min - 3
Max - 3",232 Claim Statement Period Start,"Hardcode as ""232""",NA,Only map when linelevel date is not present,
2100,DTM02,Date,R,"Min - 8
Max - 8",,Map this value from the DFF index 2.062,From Date,Date format is YYYYMMDD,
2100,DTM01,Date/Time Qualifier,R,"Min - 3
Max - 3",233 Claim Statement Period End,"Hardcode as ""233""",,Only map when linelevel date is not present,
2100,DTM02,Date,R,"Min - 8
Max - 8",,Map this value from the DFF index 2.063,To Date,Date format is YYYYMMDD,
2100,DTM,Coverage Expiration Date,S,,,,,,
2100,DTM01,Date Time Qualifier,R,"Min - 3
Max - 3",036 Expiration,Hardcode as “036”,NA,Coverage Expiration Date (DTM*036) should be populated only if one of the adjustment codes on the Line level is “27”,
2100,DTM02,Expiration Date,R,"Min - 8
Max - 8",,Map this value from the DFF index 2.042,CoverageExpiration,Date format is YYYYMMDD,
2100,DTM,Claim Received Date,S,,,,,,
2100,DTM01,Date Time Qualifier,R,"Min - 3
Max - 3",050 Received,Hardcode as “050”,NA,,
2100,DTM02,Received Date,R,"Min - 8
Max - 8",,Map this value from the DFF index 2.051,Claim Received Date,Date format is YYYYMMDD,
2100,PER,Claim Contact Information,S,,,,,,
2100,PER01,Contact Function Code,R,"Min - 2
Max - 2",CX Payers Claim Office,NA,NA,,
2100,PER02,Name,S,"Min - 1
Max - 60",,NA,NA,,
2100,PER03,Communication Number Qualifier,R,"Min - 2
Max - 2","EM Electronic Mail
FX Facsimile
TE Telephone",NA,NA,,
2100,PER04,Communication Number,R,"Min - 1
Max - 256",,NA,NA,,
2100,PER05,Communication Number Qualifier,S,"Min - 2
Max - 2","EM Electronic Mail
EX Telephone Extension
FX Facsimile
TE Telephone",NA,NA,,
2100,PER06,Communication Number,S,"Min - 1
Max - 256",,NA,NA,,
2100,PER07,Communication Number Qualifier,S,"Min - 2
Max - 2",EX Telephone Extension,NA,NA,,
2100,PER08,Communication Number,S,"Min - 1
Max - 256",,NA,NA,,
2100,AMT,Claim Supplemental Information,S,,,,,,
2100,6,Amount Qualifier Code,R,"Min - 1
Max - 3","AU Coverage Amount
D8 Discount Amount
DY Per Day Limit
F5 Patient Amount Paid
I Interest
NL Negative Ledger Balance
T Tax
T2 Total Claim Before Taxes
ZK Federal Medicare or Medicaid Payment Mandate -
Category 1
ZL Federal Medicare or Medicaid Payment Mandate -
Category 2
ZM Federal Medicare or Medicaid Payment Mandate -
Category 3
ZN Federal Medicare or Medicaid Payment Mandate -
Category 4
ZO Federal Medicare or Medicaid Payment Mandate -
Category 52","Hardcode as ""AU""",NA,,
2100,AMT02,Claim Supplemental Information Amount,R,"Min - 1
Max - 18",,Map this value from the DFF index 2.053,Prompt Pay Discount,This mapping required when the amount is greater than zero.,
2100,AMT01,Amount Qualifier Code,R,"Min - 1
Max - 3","AU Coverage Amount
D8 Discount Amount
DY Per Day Limit
F5 Patient Amount Paid
I Interest
NL Negative Ledger Balance
T Tax
T2 Total Claim Before Taxes
ZK Federal Medicare or Medicaid Payment Mandate -
Category 1
ZL Federal Medicare or Medicaid Payment Mandate -
Category 2
ZM Federal Medicare or Medicaid Payment Mandate -
Category 3
ZN Federal Medicare or Medicaid Payment Mandate -
Category 4
ZO Federal Medicare or Medicaid Payment Mandate -
Category 52","Hardcode as ""I""",NA,,
2100,AMT02,Claim Supplemental Information Amount,R,"Min - 1
Max - 18",,Map this value from the DFF index 2.052,Interest Amounts,,
2100,QTY,Claim Supplemental Information Quantity,S,,,,,,
2100,QTY01,Quantity Qualifier,R,"Min - 2
Max - 2","CA Covered - Actual
CD Co-insured - Actual
LA Life-time Reserve - Actual
LE Life-time Reserve - Estimated
NE Non-Covered - Estimated
NR Not Replaced Blood Units
OU Outlier Days
PS Prescription
VS Visits
ZK Federal Medicare or Medicaid Payment Mandate -
Category 1
ZL Federal Medicare or Medicaid Payment Mandate -
Category 2
ZM Federal Medicare or Medicaid Payment Mandate -
Category 3
ZN Federal Medicare or Medicaid Payment Mandate -
Category 4
ZO Federal Medicare or Medicaid Payment Mandate -
Category 5",NA,NA,,
2100,QTY02,Quantity,R,"Min - 1
Max - 15",,NA,NA,,
LOOP 2110 Service Payment Information,,,,,,,,,
2110,SVC,SERVICE PAYMENT INFORMATION,S,,,,,,
2110,SVC01,"COMPOSITE MEDICAL PROCEDURE
IDENTIFIER",R,"Min -
Max -",,NA,NA,,
2110,SVC01-1,Product/Service ID Qualifier,R,"Min - 2
Max - 2","AD American Dental Association Codes
ER Jurisdiction Specific Procedure and Supply Codes
HC Health Care Financing Administration Common
HP Health Insurance Prospective Payment System
IV Home Infusion EDI Coalition (HIEC) Product/Service
Code
N4 National Drug Code in 5-4-2 Format
N6 National Health Related Item Code
NU National Uniform Billing Committee (NUBC) UB92
Codes
UI U.P.C. Consumer Package Code (1-5-5)
WK Advanced Billing Concepts (ABC) Codes","If the procedure code(3.007) is present in DFF, then we need to Hardcode as ""HC""
Else If the procedure code (3.007) is blank and revenue code is present in index 3.034 then we need hardcode as ""NU""",NA,,
2110,SVC01-2,Product/Service ID,R,"Min - 1
Max - 48",,"If the procedure code is present Map this value from the DFF index 3.007
Else If the procedure code is blank and revenue code is present Map the value from the DFF index 3.034",ProcedureCode,,
2110,SVC01-3,PROCEDURE MODIFIER,S,"Min - 2
Max - 2",,Map this value from the DFF index 3.031,Procedure Modifier,,
2110,SVC01-4,PROCEDURE MODIFIER 2,S,"Min - 2
Max - 2",,Map this value from the DFF index 3.031.1,Procedure Modifier 2,,
2110,SVC01-5,PROCEDURE MODIFIER 3,S,"Min - 2
Max - 2",,Map this value from the DFF index 3.031.2,Procedure Modifier 3,,
2110,SVC01-6,PROCEDURE MODIFIER 4,S,"Min - 2
Max - 2",,Map this value from the DFF index 3.031.3,Procedure Modifier 4,,
2110,SVC01-7,Procedure Code Description,NA,NA,NA,NA,NA,,
2110,SVC02,Monetary Amount,R,"Min - 1
Max - 18",,Map this value from the DFF index 3.010,ChargeAmount,,
2110,SVC03,Monetary Amount,R,"Min - 1
Max - 18",,Map this value from the DFF index 3.019,PaidAmount,,
2110,SVC04,NUBC Revenue Code,S,"Min - 1
Max - 48",,When the procedure code is present and revenue code is present then Map SVC04 from the DFF index 3.034,Revenue Code,,
2110,SVC05,Units of Service Paid Count,S,"Min - 1
Max - 15",,Map this value from the DFF index 3.024,Units,The SVC05(Paid Units) required when the paid units of service are different than one if not required,
2110,SVC06-1,PRODUCT/SERVICE ID QUALIFIER,R,"Min - 2
Max - 2","AD American Dental Association Codes
ER Jurisdiction Specific Procedure and Supply Codes
HC Health Care Financing Administration Common
Procedural Coding System (HCPCS) Codes
HP Health Insurance Prospective Payment System
(HIPPS) Skilled Nursing Facility Rate Code
IV Home Infusion EDI Coalition (HIEC) Product/Service
Code
N4 National Drug Code
NU National Uniform Billing Committee (NUBC) UB92
Codes
WK Advanced Billing Concepts (ABC) Codes",Map this value from the DFF index 3.043,"Place holder for Submitted Product/Service id qualifier

Mapped based on getPaymentDetailsByIDResponse/paymentDetails/heexns:paymentExtract/eopPayment/eopClaimDetails/claim/claimLine/claimLine/serviceCode",Map SVC06 only when the valuein 3.007 is different from 3.044 (Service code),"PSD Ticket#502, 500, 499 based upon grooming call dated 11/7 , we are working along with IPlus team to analyse the feasiblity"
2110,SVC06-2,Procedure Code,R,"Min - 1
Max - 48",,Map this value from the DFF index 3.044,"Place holder for Submitted ProcedureCode

getPaymentDetailsByIDResponse/paymentDetails/heexns:paymentExtract/eopPayment/eopClaimDetails/claim/claimLine/claimLine/serviceCode",,
2110,SVC06-3,Procedure Modifier 1,S,"Min - 2
Max - 2",,Map this value from the DFF index 3.045,"Place holder for Submitted Procedure Modifier

getPaymentDetailsByIDResponse/paymentDetails/heexns:paymentExtract/eopPayment/eopClaimDetails/claim/claimLine/claimLine/modifierList",,
2110,SVC06-4,Procedure Modifier 2,S,"Min - 2
Max - 2",,Map this value from the DFF index 3.046,"Place holder for Submitted Procedure Modifier 2

getPaymentDetailsByIDResponse/paymentDetails/heexns:paymentExtract/eopPayment/eopClaimDetails/claim/claimLine/claimLine/modifierList",,
2110,SVC06-5,Procedure Modifier 3,S,"Min - 2
Max - 2",,Map this value from the DFF index 3.047,"Place holder for Submitted Procedure Modifier 3

getPaymentDetailsByIDResponse/paymentDetails/heexns:paymentExtract/eopPayment/eopClaimDetails/claim/claimLine/claimLine/modifierList",,
2110,SVC06-6,Procedure Modifier 4,S,"Min - 2
Max - 2",,Map this value from the DFF index 3.048,"Place holder for Submitted Procedure Modifier 4

getPaymentDetailsByIDResponse/paymentDetails/heexns:paymentExtract/eopPayment/eopClaimDetails/claim/claimLine/claimLine/modifierList",,
2110,SVC06-7,Procedure Code Description,S,"Min - 1
Max - 80",,NA,NA,,
2110,SVC07,Original Units of Service Count,S,"Min - 1
Max - 15",,Map this value from the DFF index 3.036,Original Units,The SVC07(Submitted Units) required when the paid unites of service provided in SVC05 is different from the submitted units of service from the original claim.,
2110,DTM,Service Start Date,S,,,,,,
2110,DTM01,Date Time Qualifier,R,"Min - 3
Max - 3",150 Service Period Start,"Hardcode as ""150""",NA,"1) Format the date to the below format ""YYYYMMDD""
2) If 3.005 and 3.006 same then map the DTM segment with qualifier 472(Rows 364 and 365).
Else If 3.005 is not equal to 3.006 Map the DTM segment with qualifiers 150 and 151(Rows 358 till 362)",
2110,DTM02,Service Date,R,"Min - 8
Max - 8",,Map this value from the DFF index 3.005,FromDate,,
2110,DTM,Service End Date,S,,,NA,NA,,
2110,DTM01,Date Time Qualifier,R,"Min - 3
Max - 3",151 Service Period End,"Hardcode as ""151""",NA,,
2110,DTM02,Service End Date,R,"Min - 8
Max - 8",,Map this value from the DFF index 3.006,ToDate,,
2110,DTM,Service Date,S,,,,,,
2110,DTM01,Date Time Qualifier,R,"Min - 3
Max - 3",472 Service,"Hardcode as ""472""",NA,,
2110,DTM02,Service Date,R,"Min - 8
Max - 8",,"Date format ""YYYYMMDD""",NA,,
2110,CAS,Service Adjustment,S,,,,,,
2110,CAS01,Claim Adjustment Group Code,R,"Min - 1
Max - 2","CO Contractual Obligations
OA Other adjustments
PI Payor Initiated Reductions",Map this value from the DFF index 4.011,CAGC,,
2110,CAS02,Claim Adjustment Reason Code,R,"Min - 1
Max - 5",,Map this value from the DFF index 4.009,CARC,,
2110,CAS03,Monetary Amount,R,"Min - 1
Max - 18",,Map this value from the DFF index 4.008,835 Adjusted Amount,,
2110,CAS04,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2110,CAS05,Claim Adjustment Reason Code,S,"Min - 1
Max - 2",,Map the same logic present in Rows 367 and 368,Map the same logic present in Rows 367 and 368,,
2110,CAS06,Monetary Amount,S,"Min - 1
Max - 18",,,,,
2110,CAS07,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2110,CAS08,Claim Adjustment Reason Code,S,"Min - 1
Max - 2",,Map the same logic present in Rows 367 and 368,Map the same logic present in Rows 367 and 368,,
2110,CAS09,Monetary Amount,S,"Min - 1
Max - 18",,,,,
2110,CAS10,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2110,CAS11,Claim Adjustment Reason Code,S,"Min - 1
Max - 2",,Map the same logic present in Rows 367 and 368,Map the same logic present in Rows 367 and 368,,
2110,CAS12,Monetary Amount,S,"Min - 1
Max - 18",,,,,
2110,CAS13,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2110,CAS14,Claim Adjustment Reason Code,S,"Min - 1
Max - 2",,Map the same logic present in Rows 367 and 368,Map the same logic present in Rows 367 and 368,,
2110,CAS15,Monetary Amount,S,"Min - 1
Max - 18",,,,,
2110,CAS16,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2110,CAS17,Claim Adjustment Reason Code,S,"Min - 1
Max - 2",,Map the same logic present in Rows 367 and 368,Map the same logic present in Rows 367 and 368,,
2110,CAS18,Monetary Amount,S,"Min - 1
Max - 18",,,,,
2110,CAS19,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2110,REF,Service Identification,S,,,,,,
2110,REF01,Reference Identification Qualifier,R,"Min - 2
Max - 3","1S Ambulatory Patient Group (APG) Number
APC Ambulatory Payment Classification
BB Authorization Number
E9 Attachment Code
G1 Prior Authorization Number
G3 Predetermination of Benefits Identification Number
LU Location Number
RB Rate code number",NA,NA,,
2110,REF02,Provider Identifier,R,"Min - 1
Max - 50",,NA,NA,,
2110,REF,Line Item Control Number,S,,,,,,
2110,REF01,Reference Identification Qualifier,R,"Min - 2
Max - 3",6R Provider Control Number,"Hardcode as ""6R""",NA,,
2110,REF02,Reference Identification,R,"Min - 1
Max - 50",,Map this value from the DFF index 3.037,Line Item Control Number,,
2110,REF,Rendering Provider Information,S,,,,,,
2110,REF01,Reference Identification Number,R,"Min - 2
Max - 3","0B State License Number
1A Blue Cross Provider Number
1B Blue Shield Provider Number
1C Medicare Provider Number
1D Medicaid Provider Number
1G Provider UPIN Number
1H CHAMPUS Identification Number
1J Facility ID Number
D3 National Council for Prescription Drug Programs
G2 Provider Commercial Number
HPI Centers for Medicare and Medicaid Services
National Provider Identifier
SY Social Security Number
TJ Federal Taxpayer’s Identification Number",NA,NA,,
2110,REF02,Rendering Provider Federal ID,R,"Min - 1
Max - 50",,NA,NA,"Corresponding identifier, Federal ID differs from provider to provider.",
2110,REF,HealthCare Policy Identification,S,,,,,,
2110,REF01,Reference Identification Qualifier,R,"Min - 2
Max - 3",0K Policy Form Identifying Number,NA,NA,,
2110,REF02,Reference Identification,R,"Min - 1
Max - 50",,NA,NA,,
2110,AMT,Service Supplemental Amount,S,,,,,,
2110,AMT01,Amount Qualifier Code,R,"Min - 1
Max - 3","B6 Allowed - Actual
KH Deduction Amount
T Tax
T2 Total Claim Before Taxes
ZK Federal Medicare or Medicaid Payment Mandate -
Category 1
ZL Federal Medicare or Medicaid Payment Mandate -
Category 2
ZM Federal Medicare or Medicaid Payment Mandate -
Category 3
ZN Federal Medicare or Medicaid Payment Mandate -
Category 4
ZO Federal Medicare or Medicaid Payment Mandate -
Category 5","Hardcode as ""B6""",NA,,
2110,AMT02,Service Line Allowed Amount,R,"Min - 1
Max - 18",,Map this value from the DFF index 3.033,Allowed Amount,This mapping required when the amount is greater than zero.,
2110,QTY,Service Supplemental Quantity,S,,,,,,
2110,QTY01,Quantity Qualifier,R,"Min - 2
Max - 2","ZK Federal Medicare or Medicaid Payment Mandate -
Category 1
ZL Federal Medicare or Medicaid Payment Mandate -
Category 2
ZM Federal Medicare or Medicaid Payment Mandate -
Category 3
ZN Federal Medicare or Medicaid Payment Mandate -
Category 4
ZO Federal Medicare or Medicaid Payment Mandate -
Category 5",NA,NA,,
2110,QTY02,Quantity,R,"Min - 1
Max - 15",,NA,NA,,
2110,LQ,Health Care Remark Code,S,,,,,,
2110,LQ01,Service Line Remittance Remark Code 1,R,"Min - 1
Max - 3","HE Claim Payment Remark Codes
RX National Council for Prescription Drug Programs","Hardcode as ""HE""",NA,,
2110,LQ02,Service Line Remittance Remark Code 2,R,"Min - 1
Max - 30",,Map this value from the DFF index 4.01,RARC,,
2110,PLB,Provider Adjustment,S,,,,,,
2110,PLB01,Provider Identifier,R,"Min - 1
Max - 50",,Map this value from the DFF index 1.033,Payee NPI,,
2110,PLB02,Fiscal Period Date,R,"Min - 8
Max - 8",,System Date YYYYMMDD format - December 31 of current year for example - 20231231,NA,"Last day of provider’s fiscal year(Financial Year) in YYYYMMDD format; if not known, December 31 of current year. (adjustment for the whole bill payment, monthly rebate , over payment )",
2110,PLB03-1,PROVIDER ADJUSTMENT REASON CODE,R,"Min - 2
Max - 2",20,Map this value from the DFF index 4.007,ProviderAdjustmentCode,,
2110,PLB03-2,Provider Adjustment Identifier,R,"Min - 1
Max - 50",,Map this value from the DFF index 4.013,PLB Identifier,,
2110,PLB04,Provider Adjustment Amount,R,"Min - 1
Max - 18",,Map this value from the DFF index 4.008,835 Adjusted Amount,,
2110,PLB05,Provider Adjustment Identifier,S,"Min - 1
Max - 50",,NA,NA,,
2110,PLB05-1,PROVIDER ADJUSTMENT REASON CODE,S,"Min - 2
Max - 2",,NA,NA,,
2110,PLB05-2,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2110,PLB06,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2110,PLB07,ADJUSTMENT IDENTIFIER,S,"Min - 1
Max - 50",,NA,NA,,
2110,PLB07-1,Adjustment Reason Code,S,"Min - 2
Max - 2",,NA,NA,,
2110,PLB07-2,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2110,PLB08,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2110,PLB09,ADJUSTMENT IDENTIFIER,S,"Min - 1
Max - 50",,NA,NA,,
2110,PLB09-1,Adjustment Reason Code,S,"Min - 2
Max - 2",,NA,NA,,
2110,PLB09-2,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2110,PLB010,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2110,PLB11,ADJUSTMENT IDENTIFIER,S,"Min - 1
Max - 50",,NA,NA,,
2110,PLB11-1,Adjustment Reason Code,S,"Min - 2
Max - 2",,NA,NA,,
2110,PLB11-2,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2110,PLB12,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2110,PLB13,ADJUSTMENT IDENTIFIER,S,"Min - 1
Max - 50",,NA,NA,,
2110,PLB13-1,Adjustment Reason Code,S,"Min - 2
Max - 2",,NA,NA,,
2110,PLB13-2,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2110,PLB14,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
SE - TRANSACTION SET TRAILER,,,,,,,,,
,SE,Transaction Set Trailer,R,,,,,,
,SE01,Number Of Included Segments,R,"Min - 1
Max - 10",,"Total number of segments included in a transaction set including ST and SE
segments",NA,,
,SE02,Transaction Set Control Number,R,"Min -
Max -",,STO2 Value,NA,,
,GE,Functional Group Trailer,R,,,,,,
,GE01,Number of Transaction Sets Included,R,"Min -
Max -",,"Total number of transaction sets included in the functional group or interchange
(transmission) group terminated by the trailer containing this data element",NA,,
,GE02,Group Control Number,R,"Min -
Max -",,GS06 Value,NA,,
Interchange Control Loop (End),,,,,,,,,
,IEA,Interchange Control Trailer,R,,,,,,
,IEA01,Number of Included Functional Groups,R,"Min -
Max -",,A count of the number of functional groups included in an interchange,NA,,
,IEA02,Interchange Control Number,R,"Min -
Max -",,ISA13 Value,NA,,
```

## Payment OB/Archive/V25.2.0.0/EdifecsProduct_Mapping Spec_OutboundPayment_835_DFF_to_EDIConversion_V1.5.xlsx — Payment Extract

```csv
Record Type 1 Payment Level Information,,,,,,
,,,,,,
INDEX,DATA ELEMENT,DATA TYPE,REQ,DESCRIPTION,Highmark Comments,UST
1.001,Record,Varchar(4),Required,0001,,
1.002,BatchKey,Varchar(75),Required,See key generation,,
1.003,CheckNumberPrefix,Varchar(4),Optional,The prefix for the check number assigned to the check.,,
1.004,CheckNumber,Varchar(25),Optional,The check number assigned to the check.,,
1.005,CheckDate,Date,Optional,The check date MMDDYYYY,,
1.006,CheckAmount,Money,Required,The numeric payment for the check,,
1.007,FractionTransitNumber,Varchar(25),Optional,"The Fractional Transit Number for the bank, as held in Fund Accounting for the applicable account for the group.",,
1.008,MICRTransitNumber,Varchar(9),Required,"The MICR Transit Number for the bank, as held in Fund Accounting for the applicable account for the group.",,
1.009,AccountNumber,Varchar(255),Required,"The Bank Account Number for the bank, as held in Fund Accounting for the applicable account for the group.",,
1.010,BankName,Varchar(255),Required,The Bank Name,,
1.011,BankAddress1,Varchar(255),Optional,The first bank address field,,
1.012,BankAddress2,Varchar(255),Optional,The second bank address field,,
1.013,BankCity,Varchar(255),Optional,The city for the bank,,
1.014,BankState,Varchar(2),Optional,The state for the bank,,
1.015,BankZip,Varchar(10),Optional,The zip for the bank,,
1.016,BankCountry,Varchar(255),Optional,The country code for the bank,,
1.017,PayeeName,Varchar(255),Required,The payee name. This is the recipient for the check.,,
1.018,PayeeAddress1,Varchar(255),Required,The first address line for the payee,,
1.019,PayeeAddress2,Varchar(255),"Required, if available",The second address line for the payee,Missing in the sample PNC extract,If address Line 2 is available in HRP this will be populated
1.020,PayeeCity,Varchar(255),Required,The city for the payee,,
1.021,PayeeState,Varchar(2),Required,The state for the payee,,
1.022,PayeeZip,Varchar(10),Required,The zip for the payee,,
1.023,PayeeCountry,Varchar(255),Required,The country for the payee,,
1.024,SpecHandle,Varchar(10),Optional,"Special Handling for the payment, i.e. reinsurance",,
1.025,ResponseType,Varchar(10),Optional,"Indicates the original response provided by payment vendor in the Response File (2). Valid values are: Payment, 835Only, None.",Missing in the sample PNC extract,This was a required field for another client. For 835 generation this is not used. Marked as optional field
1.026,PPO Network Contract Identifier,Varchar(3),Optional,"(If Available)PPO Contract Identifier from ClaimHeader. For provider voucher processing, it is assumed that the first non-blank PPO Contract Identifier will be communicated (if available).",Missing in the sample PNC extract,This was a required field for another client. For 835 generation this is not used. Marked as optional field
1.027,Provider Phone Number,Varchar(15),Optional,,,
1.028,Provider Email,Varchar(100,Optional,,,
1.029,Provider Type,Varchar(50),Optional,Provider taxonomy code,,
1.030,Provider TIN Sequence Code,Varchar(10),Optional,Sequence code for the payee provider,Missing in the sample PNC extract,This was a required field for another client. For 835 generation this is not used. Marked as optional field
1.031,Paid To,Varchar(1),Required,"if Fully Funded Paid To (E=Employee, D=Dependent, M = Member, P=Provider, S=Split pay)",,
1.032,Payee SSN/TIN,Varchar(9),Required,(if Member Payment) Payee SSN or TIN,,
1.033,Payee NPI,Int,Required,(If Available) The NPI for the payee provider,,
,,,,,,
,,,,,,
,,,,,,
Record Type 2 Claim Level Information,,,,,,
,,,,,,
INDEX,Data Element,Data Type,REQ,Description,,
2.001,Record,Varchar(4),Required,002,,
2.002,BatchKey,Varchar(75),Required,See key generation,,
2.003,ClaimNumber,Varchar(50),Required,The claim number assigned for the claim.,,
2.004,EOBNumber,Varchar(10),Optional,The EOB number assigned for the claim.,,
2.005,PatientID,Varchar(30),Required,The patient account number for the claim. This is assigned by the provider (ie. SSN),,
2.006,PatientName,Varchar(255),Required,The patient's name,,
2.007,PatientDOB,Date,Optional,The patient's Date of Birth.   MMDDYYYY,Missing in the sample PNC file,Marking as optional as it is not used for 835 mapping
2.008,ParticipantKey,Varchar(30),Optional,The insured's employee number Enrollee Member ID,Missing in the sample PNC file,Marking as optional as it is not used for 835 mapping
2.009,ParticipantName,Varchar(255),Optional,The insured's name,,
2.01,ParticipantAddress1,Varchar(255),Optional,The first address line for the insured,,
2.011,ParticipantAddress2,Varchar(255),Optional,The second address line for the insured,,
2.012,ParticipantCity,Varchar(255),Optional,The city for the insured,,
2.013,ParticipantState,Varchar(2),Optional,The state for the insured,,
2.014,ParticipantZip,Varchar(10),Optional,The zip for the insured,,
2.015,ParticipantCountry,Varchar(255),Optional,The country for the insured,,
2.016,ProviderNPI,Int,Required (If Available),The NPI for the provider of service,Missing in the sample PNC file,Available in the sample file.
2.017,ProviderTIN,Varchar(9),Required (If Available),The TIN for the provider of service,Missing in the sample PNC file,
2.017.1,Provider TIN Sequence Code,Varchar(7),Required (If Available),Sequence code for the providers,Missing in the sample PNC file,
2.018,ProviderName,Varchar(255),Required (If Available),The provider's name,Missing in the sample PNC file,
2.019,ProviderAddress1,Varchar(255),Required (If Available),The first address line for the provider,Missing in the sample PNC file,
2.02,ProviderAddress2,Varchar(255),Required (If Available),The second address line for the provider,Missing in the sample PNC file,
2.021,ProviderCity,Varchar(255),Required (If Available),The city for the provider,Missing in the sample PNC file,
2.022,ProviderState,Varchar(2),Required (If Available),The state for the provider,Missing in the sample PNC file,
2.023,ProviderZip,Varchar(10),Required (If Available),The zip for the provider,Missing in the sample PNC file,
2.024,ProviderCountry,Varchar(255),Required (If Available),The country for the provider,Missing in the sample PNC file,
2.025,GroupCode,Varchar(30),Required (If Available),The Group number for the insured,Missing in the sample PNC file,
2.026,GroupSubCode,Varchar(30),Required (If Available),The Sub Group number for the insured,,
2.027,GroupName,Varchar(255),Required (If Available),The group name for the insured.,,
2.028,ChargeAmount,Money,Required,"The amount billed, for all service lines for this claim.",,
2.029,PPODiscountAmount,Money,Required (If Available),"The PPO discount amount, for all service lines for this claim.",Missing in the sample PNC file,
2.03,RNCDiscountAmount,Money,Required (If Available),"The Reasonable and customary amount, for all service lines for this claim.",Missing in the sample PNC file,
2.031,COBAmount,Money,Required (If Available),"The COB amount, for all service lines for this claim for this claim",Missing in the sample PNC file,
2.032,DeductableAmount,Money,Required (If Available),The total amount applied to a deductible for all service lines for this claim,Missing in the sample PNC file,
2.033,CoInsuranceAmount,Money,Required (If Available),The total amount of Co -Insurance for all service lines for this claim,Missing in the sample PNC file,
2.034,CopayAmount,Money,Required (If Available),The total amount of the co-pay for all service lines for this claim,Missing in the sample PNC file,
2.035,SumDedCoinsCopayAmount,Money,Required (If Available),"The SUM of all Deductible Amounts, Co - Insurance, and CoPay for all service lines for this claim.",Missing in the sample PNC file,
2.036,OtherAdjustmentsAmount,Money,Required (If Available),The total amount of all other adjustments for all service lines for this claim. This will include all other adjustments not mentioned individually above.,Missing in the sample PNC file,
2.037,PaidAmount,Money,Required,"The total plan paid amount, for all service lines for this claim.",,
2.038,PatientOwedAmount,Money,Required (If Available),The employee responsibility for the service line,Missing in the sample PNC file,
2.039,PatientPaidAmountTotal,Money,Required (If Available),"The total patient paid amount, for all service lines for this claim.",,
2.04,ClaimStatusCode,Varchar(5),Required (If Available),"Determined based on whether it is a primary paid, denied, or reversal claim, etc. (1, 4, 22, etc.).",,
2.041,AlternateProcedureCode,Varchar(15),Required (If Available),Alternate Procedure Code/DRG. For Institutional Claims with DRG code.,Missing in the sample PNC file,
2.042,CoverageExpiration,Date,Required (If Available),Expiration date of patient’s coverage.,Missing in the sample PNC file,
2.043,AdjudicationAllowedAmount,Money,Required (If Available),This value is calculated as (Charge) minus (PPO Discount/RNC Discount) minus (Ineligible Amounts).,Missing in the sample PNC file,
2.044,Provider NAIC Code,Varchar(255),Required (If Available),National Association of Insurance Commissioners (NAIC) Code,Missing in the sample PNC file,
2.045,Corrected Patient/Insured Name,Varchar(255),Required (If Available),Corrected information about the patient or insured.,Missing in the sample PNC file,
2.046,Corrected Patient/Insured Member ID,Varchar(255),Required (If Available),Insured's Changed Unique Identification Number,Missing in the sample PNC file,
2.047,Corrected Priority Payer Name,Varchar(255),Required (If Available),Another payer has priority for making a payment and the claim is not being automatically transferred to that payer. This is the name of the new priority payer.,Missing in the sample PNC file,
2.048,Corrected Priority Payer NAIC or TIN,Varchar(255),Required (If Available),Another payer has priority for making a payment and the claim is not being automatically transferred to that payer. This is the unique id of the new priority payer.,Missing in the sample PNC file,
2.049,Corrected Priority Payer Subscriber Name,Varchar(255),Required (If Available),Another payer has priority for making a payment and the claim is not being automatically transferred to that payer. This is the name of the subscriber with the new priority payer.,Missing in the sample PNC file,
2.05,Corrected Priority Payer Subscriber Member Id,Varchar(255),Required (If Available),Another payer has priority for making a payment and the claim is not being automatically transferred to that payer. This is the name of the subscriber id the new priority payer.,Missing in the sample PNC file,
2.051,Claim Received Date,Date,Required,This is the date that the claim was received by the payer.,,
2.052,Interest Amounts,Money,Not Required,Use this monetary amount for the interest amount,Missing in the sample PNC file,This is not required field
2.053,Prompt Pay Discount,Money,Required (If Available),,Missing in the sample PNC file,
2.054,Over Coinsurance Maximum Amount,Money,Required (If Available),This is the total over coinsurance maximum ineligible amounts for the claim,Missing in the sample PNC file,
2.055,Over Benefit Maximum Amount,Money,Required (If Available),This is the total over benefit maximum ineligible amounts for the claim,Missing in the sample PNC file,
2.056,Over Period A Maximum Amount,Money,Required (If Available),This is the total Period A maximum ineligible amounts for the claim,Missing in the sample PNC file,
2.057,Over Period B Maximum Amount,Money,Required (If Available),This is the total Period B maximum ineligible amounts for the claim,Missing in the sample PNC file,
2.058,Miscellaneous Ineligible Amount,Money,Required (If Available),This is the total of any ineligible amounts not otherwise defined for the claim,Missing in the sample PNC file,
2.059,PPO Network Contract Identifier,Varchar(3),Required (If Available),"PPO Contract Identifier from Claim Header.  For provider voucher processing, this field may contain a different value than the value sent in the Pre-Pass record since there may be multiple record type 0002 records per voucher payment (if available).",Missing in the sample PNC file,
2.06,Provider Type,Varchar(50),Optional,Provider taxonomy code,Missing in the sample PNC file,
2.061,Facility Code Value,Varchar(50),Required (If Available),"Code identifying where services were, or may be, performed; the first and second positions of the Uniform Bill Type Code for Institutional Services or the Place of Service Codes for Professional or Dental Services. Loop 2100 CLP08 from the 835 specifications. Since professional or dental claims can have different place of service codes for services within a single claim, default to the place of service of the first service line when the service lines are not all for the same place of service. This number was received in CLM05-1 of the 837 claims.",,
2.062,From Date,DateTime,Required (If Available),"2100 DTM FROM AND TO DATES. Claim service date, may be overridden at the service level.
Required when the “Statement From or To Dates” are not supplied at the service (2110 loop) level. Dates at the claim level apply to the entire claim, including all service lines. Dates at the service line level apply only to the service line where they appear. When claim dates are not provided, service dates are required for every service line. When claim dates are provided, service dates are not required, but if used they override the claim dates for individual service lines. If the claim statement period start date is conveyed without a subsequent claim statement period end date, the end date is assumed to be the same as the start date.",Missing in the sample PNC file,
2.063,To Date,DateTime,Optional,"2100 DTM FROM AND TO DATES. Claim service date, may be overridden at the service level.
Required when the “Statement From or To Dates” are not supplied at the service (2110 loop) level. Dates at the claim level apply to the entire claim, including all service lines. Dates at the service line. level apply only to the service line where they appear. When claim dates are not provided, service dates are required for every service line. When claim dates are provided, service dates are not required, but if used they override the claim dates for individual service lines.",Missing in the sample PNC file,
2.064,Claim Filing Indicator Code,Varchar(5)`,Required (If Available),"Loop 2100 CLP06 For many providers to electronically post the 835remittance data to their patient accounting systems without human intervention, a unique, provider-specific insurance plan code is needed. This code allows the provider to separately identify and manage the different product lines or contractual arrangements between the payer and the provider. Because most payers maintain the same Originating Company Identifier in the TRN03 or BPR10 for all product lines or contractual relationships, the CLP06 is used by the provider as a table pointer in combination with the TRN03 or BPR10 to identify the unique, provider-specific insurance plan code needed to post the payment without human intervention. The value should mirror the value received in the original claim (2-005 SBR09 of the 837), if applicable, or provide the value as assigned or edited by the payer. For example, the BL from the SBR09 in the 837 would be returned as 12, 13, 15, in the 835 when more details are known. The 837 SBR09 code CI (Commercial Insurance) is generic, if through adjudication the specific type of plan is obtained a more specific code must be returned in the 835.
12  Preferred Provider
Organization (PPO)
13  Point of Service (POS)
14  Exclusive Provider Organization
(EPO)
15  Indemnity Insurance
16  Health Maintenance
Organization (HMO) Medicare
Risk
17  Dental Maintenance
Organization
AM Automobile Medical
CH Champus
DS Disability
HM Health Maintenance
Organization
LM Liability Medical
MA Medicare Part A
MB Medicare Part B
MC Medicaid
OF Other Federal Program 1049 Use this code for the Black Lung Program.
TV Title V
VA Veterans Affairs Plan
WC Workers’ Compensation
Health Claim
ZZ Mutually Defined",,
2.065,Discharge Fraction,"Decimal(3,2)",Required (If Available),"Loop 2100 CLP13 Percentage expressed as a decimal (e.g., 0.0 through 1.0 represents 0% through
100%). Required when a discharge
fraction was applied in the adjudication process.",Missing in the sample PNC file,
2.066,Patient Type Identifier,Varchar(2),Required (If Available),“I” for inpatient and “O” for outpatient. Needed for RARC reporting.,Missing in the sample PNC file,
2.067,Original Reference Number,Varchar(50),Required (If Available),"When this is a correction claim and CLP07 does not equal the CLP07 value from the original claim payment, one iteration of this REF segment using this qualifier is REQUIRED to identify the original claim CLP07 value in REF02. See section 1.10.2.8, Reversals and Corrections, for additional information.",Missing in the sample PNC file,
2.068,DRG Weight,Varchar(15),Required (If Available),Loop 2100 CLP12. The average diagnosis-related group (DRG) weight.,Missing in the sample PNC file,
2.069,Diagnosis Related Group Code,Varchar(4),Required (If Available),"Loop 2100 CLP11. Code indicating a patient’s diagnosis group based on a patient’s illness, diseases, and medical problems. Required for institutional claims when the claim was adjudicated using a DRG.",Missing in the sample PNC file,
2.07,Other Subscriber Name,Varchar(100),Required (If Available),"2100 NM1.  LAST, FIRST. This is the name and ID number of the other subscriber when a corrected priority payer has been identified. When used, either the name or ID must be supplied. Required when a corrected priority payer has been identified in another NM1 segment AND the name or ID of the other subscriber is known. If not required by this implementation guide, do not send.",Missing in the sample PNC file,
2.071,CDHP Type,Nvarchar(3),Optional,"Possible Values:
DEP
FSA
HRA
LFS
TMT
TPC
TPR

Populated when a claim is a CDHP claim to indicate CDHP status.",Missing in the sample PNC file,
2.072,Relationship Code,Varchar(5),Optional,Code representing relationship of insured to patient,Missing in the sample PNC file,
2.073,Alternate Provider ID,Varchar(50),Required (If Available),Required when additional rendering provider identification numbers not already reported in the Provider NM1 segment for this claim were submitted on the original claim and impacted adjudication.,Missing in the sample PNC file,
2.074,Crossover Carrier Name,Varchar(255),Required (If Available),"Required when the claim is transferred to another carrier or coverage (CLP02 equals 19, 20, 21 or 23).",Missing in the sample PNC file,
2.075,Crossover Carrier NAIC or TIN,Varchar(255),Required (If Available),"Required when the claim is transferred to another carrier or coverage (CLP02 equals 19, 20, 21 or 23).",Missing in the sample PNC file,
2.076,Claim Contact Telephone,Varchar(256),Required (If Available),Required when there is a claim specific communications contact.,Missing in the sample PNC file,
2.077,Tax Amount,Money,Required (If Available),Required when tax is non-zero.,Missing in the sample PNC file,
2.078,Total Claim Before Tax,Money,Required (If Available),Used only when tax also applies to the claim.,Missing in the sample PNC file,
2.079,Patient Control Number,,Required,Patient Control Number,,
2.080,Patient Last name,,Required,Last name,,
2.081,Patient First name,,Required,First Name,,
2.082,Patient Middle name,,Required,Middle Name,,
2.083,Frequency Code,,Required,Frequency  Code,,
2.084,SubmittedPatientID,Varchar(30),Required,Patient member ID as originally submitted in the claim,,
2.085,SubmittedPatientFirstName,Varchar(255),Required,First Name as originally submitted in the claim,,
2.086,SubmittedPatientMiddleName,Varchar(255),Required,Middle Name as originally submitted in the claim,,
2.087,SubmittedPatientLastName,Varchar(255),Required,Last name as originally submitted in the claim. This will be used to send the submitted patient Full Name as it is in HRDW database.,,
2.088,SubscriberID,Varchar(30),Required,Subscriber ID if the patient is not subscriber,,
2.089,SubscriberFirstName,Varchar(255),Required,Subscriber First Name if the patient is not subscriber,,
2.090,SubscriberMiddleName,Varchar(255),Required,Subscriber Middle Name if the patient is not subscriber,,
2.091,SubscriberLastName,Varchar(255),Required,Subscriber Last Name if the patient is not subscriber,,
2.092,PractitionerFirstName,varchar(107),Required (If Available),Practitioner First Name from the Claim,,
2.093,PractitionerMiddleName,varchar(107),Required (If Available),Practitioner Middle Initial from the Claim,,
2.094,PractitionerLastName,varchar(107),Required (If Available),Practitioner last name from the Claim,,
,,,,,,
Record Type 3 Claim line Level Information,,,,,,
,,,,,,
INDEX,Data Element,Data Type,REQ,Description,,
3.001,Record,Varchar(4),Required,0003,,
3.002,BatchKey,Varchar(75),Required,See key generation,,
3.003,ClaimNumber,Varchar(50),Required,The claim number assigned for the claim.,,
3.004,ClaimLineNumber,Varchar(4),Required(If Available),The service line number is used to specify the order of the services rendered on the claim,,
3.005,FromDate,Date,Required (If Available),The incurred from date MMDDYYYY,,
3.006,ToDate,Date,Required (If Available),The incurred through date MMDDYYYY,,
3.007,ProcedureCode,Varchar(5),Required (If Available),The procedure code,,
3.008,ProcedureDescription,Varchar(40),Required (If Available),The procedure description,,
3.009,LayProcedureDescription,Varchar(40),Required (If Available),The layperson procedure description,Missing in the sample PNC file,
3.010,ChargeAmount,Money,Required,The amount billed for the serviceline,,
3.011,PPODiscountAmount,Money,Required(If Available),The discount amount for the service line,,
3.012,RNCDiscountAmount,Money,Required(If Available),The Reasonable and customaryamount for the service line,Missing in the sample PNC file,
3.013,COBAmount,Money,Required(If Available),The COB amount for the service line,Missing in the sample PNC file,
3.014,DeductableAmount,Money,Required(If Available),Any amount applied to the deductible for the service line,Missing in the sample PNC file,
3.015,CoInsuranceAmount,Money,Required (If Available),Co-Insurance Amount detail line,Missing in the sample PNC file,
3.016,CopayAmount,Money,Required (If Available),Co-Payment amount per detail line,Missing in the sample PNC file,
3.017,SumDedCoinsCopayAmount,Money,Required(If Available),"The SUM of all deductible amounts,Co-Insurance, and Co-Payment",Missing in the sample PNC file,
3.018,OtherAdjustmentsAmount,Money,Required(If Available),Any other adjustment amount perdetail line,Missing in the sample PNC file,
3.019,PaidAmount,Money,Required,The plan paid amount for the service line,,
3.020,PatientOwedAmount,Money,Required (If Available),The employee responsibility for the service line,Missing in the sample PNC file,
3.021,ServiceProviderName,Varchar(255),Conditional,Only required if the service providername is not the payee for the claim,Missing in the sample PNC file,
3.022,ServiceProviderNationalProviderID,Varchar(255),Conditional,Only required if the service provider ID is not the payee for the claim,,
3.023,Product/Service ID Qualifier,Varchar(255),Required,The database from which the procedure code is derived,Missing in the sample PNC file,This is not used for 835 mapping yet this will be populated if its available in HRP
3.024,Units,Int,Required (if available),Units on the claim line. This is required by HIPAA if units on the claim line are > 1,,
3.025,Previously Paid Amount,Money,Required (If Available),"The previously paid amount on the claim, for “underpayment reversal” claims. This amount corresponds tothe amount already paid on the claim, on a check that is NOT being reversed (although the claim in the adjudication system IS being reversed.",Missing in the sample PNC file,
3.026,Over Coinsurance Maximum Amount,Money,Required (If Available),This is the total over coinsurance maximum ineligible amounts for the claim,Missing in the sample PNC file,
3.027,Over Benefit Maximum Amount,Money,Required (If Available),This is the total over benefit maximum ineligible amounts for the claim,Missing in the sample PNC file,
3.028,Over Period A Maximum Amount,Money,Required (If Available),This is the total Period A maximum ineligible amounts for the claim,Missing in the sample PNC file,
3.029,Over Period B Maximum Amount,Money,Required (If Available),This is the total Period B maximum ineligible amounts for the claim,Missing in the sample PNC file,
3.030,Miscellaneous Ineligible Amount,Money,Required (If Available),This is the total of any ineligible amounts not otherwise defined for the claim,Missing in the sample PNC file,
3.031,Procedure Modifier,Varchar(60),Required (if applies),Loop 2110 SV01-3. This identifies the special circumstances related to the performance of the service.,Missing in the sample PNC file,
3.031.1,Procedure Modifier 2,Varchar(60),Required (if applies),Loop 2110 SV01-4. This identifies the special circumstances related to the performance of the service.,Missing in the sample PNC file,
3.031.2,Procedure Modifier 3,Varchar(60),Required (if applies),Loop 2110 SV01-5. This identifies the special circumstances related to the performance of the service.,Missing in the sample PNC file,
3.031.3,Procedure Modifier 4,Varchar(60),Required (if applies),Loop 2110 SV01-6. This identifies the special circumstances related to the performance of the service.,Missing in the sample PNC file,
3.032,Healthcare Policy ID,Varchar(50),Required(if available),"Loop 2110 REF02. Supply the Healthcare policy identifier as provided by the payer’s published Healthcare policy code list. This policy code will be used to explain the policy used to process the claim which resulted
in the adjusted payment.
Required when;
• The payment is adjusted in
accordance with the Payer’s
published Healthcare Policy Code
list and
•A Claim Adjustment Reason Code
identified by the notation, “refer to
835 Healthcare Policy identification
segment”, in the Claim Adjustment
Reason Code List is present in a
related CAS segment and
• The payer has a published
enumerated healthcare policy code
list available to healthcare
providers via an un-secure public
website.|",Missing in the sample PNC file,
3.033,Allowed Amount,Money,Required,Loop 2110 AMT*B6. Allowed amount on this service line. Allowed amount is the amount the payer deems payable prior to considering patient responsibility. This can also be the COB allowed amount on a secondary claim.,,
3.034,Revenue Code,Varchar(4),Required(if available),Loop 2110 SVC01-2. Used when SVC01-1 is NU. National Uniform Billing Committee Revenue code,Missing in the sample PNC file,
3.035,Composite Code,Varchar(80),Required(if available),Used when sending the full 835 composite procedure code already formed for SVC01,Missing in the sample PNC file,
3.036,Original Units,Integer,Required(if available),Loop 2101 SVC07. The original submitted units of service,Missing in the sample PNC file,
3.037,Line Item Control Number,Varchar(20),Required(if available),"Loop 2110 RF02. This is the Line Item Control Number submitted in the 837, which is utilized by the provider for tracking purposes. Note - the value in REF02 can include alpha characters. Required when a Line Item Control Number was received on the original claim or when claim or service line splitting has occurred. If not required by this implementation guide, do not send",,
3.038,Rendering Provider TIN,Varchar(20),Required (if different from claim),"Loop 2110 REF02. The Service provider TIN, if it is different from the claim TIN. Required when the rendering provider for this service is different than the rendering provider applicable at the claim level",Missing in the sample PNC file,
3.039,Rendering Provider NPI,Varchar(50),Required (if available),Rendering provider NPI. Required if different from claim level NPI.,,
3.040,Tax Amount,Money,Required (If Available),Required if tax is non-zero.,Missing in the sample PNC file,
3.041,Late Filing Deduction,Money,Required (If Available),Required when there is a Late Filing Reduction,Missing in the sample PNC file,
3.042,Total Claim Before Taxes,Money,Required (If Available),Use this monetary amount for the service charge before taxes. This is only used when there is an applicable tax amount on this service.,Missing in the sample PNC file,
3.043,Submitted Product/Service id qualifier,Varchar(255),Required,The database from which the procedure code is derived,,
3.044,Submitted ProcedureCode,Varchar(5),Required (If Available),The procedure code,,
3.045,Submitted Procedure Modifier,Varchar(60),Required (if applies),Loop 2110 SV01-3. This identifies the special circumstances related to the performance of the service.,,
3.046,Submitted Procedure Modifier 2,Varchar(60),Required (if applies),Loop 2110 SV01-4. This identifies the special circumstances related to the performance of the service.,,
3.047,Submitted Procedure Modifier 3,Varchar(60),Required (if applies),Loop 2110 SV01-5. This identifies the special circumstances related to the performance of the service.,,
3.048,Submitted Procedure Modifier 4,Varchar(60),Required (if applies),Loop 2110 SV01-6. This identifies the special circumstances related to the performance of the service.,,
,,,,,,
Record Layout 4 (Remarks/ adjustment level information),,,,,,
,,,,,,
INDEX,Data Element,Data Type,REQ,Description,,
4.001,Record,Varchar(4),Required,0004,,
4.002,BatchKey,Varchar(75),Required,See key generation,,
4.003,ClaimNumber,Varchar(50),Optional,The claim number assigned for the claim. Required if remark is at claim line or claim service line,,
4.004,ClaimLineNumber,Varchar(15),Optional,The claim line number assigned for the particular service line. Required if remark is at the claim service line,,
4.005,System Remark Code,Varchar(10),Required,The internal system remark code for a service line,,
4.006,System Remark Description,Varchar(1000),Required (If Available),The description used for the above remark code,,
4.007,ProviderAdjustmentCode,Varchar(2),Required (If Available),Adjustments to the actual payment that are NOT specific to a particular claim or service,Missing in the sample PNC file,
4.008,835 Adjusted Amount,Money,Required (If Available),The respective adjusted amount for the aforementioned Remark Code,,
4.009,CARC,Varchar(50),Required (If Available),Client CARC Code mapped to System Remark Code,,
4.01,RARC,Varchar(50),Required (If Available),Client RARC Code mapped to corresponding 4.009 CARC,,
4.011,CAGC,Varchar(50),Required (If Available),Client CAGC Code mapped to corresponding 4.009 CARC,,
4.012,Remark Type,Varchar(10),Required (If Available),Defines type of ineligible amount from Payments File Detail record,Missing in the sample PNC file,
4.013,PLB Identifier,Varchar(100),Required (if available),"835 Summary Field PLB03-2. Provider Level Adjustment Code related claim number of another identifier.
Required when a control, account or tracking number applies to this adjustment.
For example, for Provider Level Adjustment Code 72, PLB03-2 must always contain an identifying reference number when the value is used.
For code “CS”, you must provide supporting identification information in PLB03-2.",Missing in the sample PNC file,
4.014,Covered Days,Int,Required (if available),"The number of days being adjusted. A positive value decreases the covered days, and a negative number increases the covered days. CAS04, CAS07, CAS10, CAS13, CAS16, CAS19",Missing in the sample PNC file,
```

## Payment OB/Archive/V25.2.0.0/EdifecsProduct_Mapping Spec_OutboundPayment_835_DFF_to_EDIConversion_V1.5.xlsx — PSD Tickets

```csv
S/No,PSD Ticket#,Clarification From Customer
1,503,"1. Current payment HRP webservice and DFF data - it fetches the original submitted Insured ID or matched data?  Based on above, changes needed on DFF file, Edifecs mapping to map   insured/patient names separately as per TR3.
 1. Step-1  evaluate DFF
 2. Evaluate the impact in existing customers

2. We do not have placeholder for dependents in DFF yet, need to add that and perform mapping according to that in Edifecs"
2,"502, 500, 499","1. Details related to bundling and unbundling fields has to be shared in DFF before we proceed with Edifecs Mapping.
2. We can discuss on this once Theju is back"
```

## Payment OB/Archive/V25.2.0.0/EdifecsProduct_Mapping Spec_OutboundPayment_835_DFF_to_EDIConversion_V1.5.xlsx — Attachments

```csv
Sl #,Attachment Name,Attachment
1,Sample EDI 835,
,,
,,
,,
2,Sample DFF,
,,
,,
3,Sample Payment Extract,
```

## Payment OB/V26.1.0.0/EdifecsProduct_Audit JSON_OB Payment Mapping_V1.0.xlsx — Cover Page

```csv
,OB Payment Audit Processing -  EDIFECS,,,,,,,,,
,,,,,,,,,,
,Business Area: Claims IB,,,,,,,,,
,,,,,,,,,,
,This document provides the Mapping Specification for EDI 835 OB Payment. Document is intended for EDIFECS Product Team,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,Version,,V25.2.0.0,,,
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

## Payment OB/V26.1.0.0/EdifecsProduct_Audit JSON_OB Payment Mapping_V1.0.xlsx — Legend

```csv
Legend,
,Mandatory for Edifecs to populate for all Audit points
,Mandatory for Edifecs to populate for the last point
,Optional fields can be passed if we have information
```

## Payment OB/V26.1.0.0/EdifecsProduct_Audit JSON_OB Payment Mapping_V1.0.xlsx — Audit JSON Mapping

```csv
Group,Fields,Sub Fields,Data Type,Mandatory (Present in all Audit points),Mandatory (Present in atleast one Audit Point),835 - Values,Description,Comments,
inputDetails,inputId,,String,,,"Value passed is  - {UID}- Uniqie for each file
Example - -dtBkcCHu9bkKu8O",EDI file id,NA for Edifecs,NA for OB payments
,inputType,,String,,,,Defines the type of input file - API or File,,
,totalTransactions,,Integer,,,,Total no. of transactions/Record received in API/File,,
,inputFileName,,String,,,Input Filename of the EDI file received with filename extension,Name of the input file received from source.,,
,inputArchiveFilename,,String,,,Input Filename of the EDI file archived in s3 with filename extension,Name of the input file after archiving the input file.,,
process,processStageName,,String,Y,,Edifecs-FileConversion & File Validation,Represent the name of the process stage which post the Audit point.,,
,processStatus,,String,Y,,"PROCESSED
SUCCESS
ERROR",Represent the Intermediate or Final status of the process stage which posts the Audit point.,,
,processMessage,,String,,,Error,Specific information of a particular step after the process is completed.,,
,processInputArchiveFilename,,String,,,Input Filename of the DFF file received with filename extension,Name of the input Archive file of the process stage which posts the Audit point.,This field is required only if Edifecs is archiving the Input File,
,processOutputArchiveFilename,,String,,,NA,Name of the output Archive file of the process stage which posts the Audit point.,This field is required only if Edifecs is archiving the Output File,
,auditTime,,DateTime,Y,,"The time the audit trigger event got generated in yyyy-MM-dd HH:mm:ss.SSS format
Sample: 2024-08-05 00:24:16:480",Auditing time of each audit point,,
identifiers,rayIdentifier,,String,Y,,"Shared as part of Summary file by Iplus Core team
Format: PaymentExtract_JobID_RayID_RecID_PaymentID
Sample: PaymentExtract_c5f8e2d9-4b6a-42d1-a3f7-9e01b5c3d7e8_a12f7b9d-3e4c-45f0-b8a6-71d9c25e0f34_f8d2a3b7-9c5e-42d1-b6a0-e71f4c0d95e2_62054","Unique Identifier for the complete lifecycle of transaction/Record. Will be unchanged even the transaction is Split, passed across various system, reprocessed.",,
,recordIdentifier,,String,,Y,"Shared as part of Summary file by Iplus Core team
Format: PaymentExtract_JobID_RayID_RecID_PaymentID
Sample: PaymentExtract_c5f8e2d9-4b6a-42d1-a3f7-9e01b5c3d7e8_a12f7b9d-3e4c-45f0-b8a6-71d9c25e0f34_f8d2a3b7-9c5e-42d1-b6a0-e71f4c0d95e2_62054",Unique Identifier for transaction level. Will be different when reprocess a same record.,,
,tenantIdentifier,,String,,,Product - Can be editable by Implementation team to send their client Name.,Unique identifier for the implementation team,,
,sourceTypeIdentifier,,String,,,"Enrollment_ADV, SMOKER_STATUS",Identifier to find from where we received(Starting point) the initial Transaction/Record.,Iplus Core team will be populating,
,recordIdentifierFromSource,,String,,,BlueCard_T78601104_1000178899,,,
,referenceIdentifier,,String,,,NA,Place holder to add any specific Reference Identifier based on Business Requirement,,
,retriedReferenceIdentifier,,String,Y (for retried transaction),,NA,This field indicates unique identifier for a transaction that has been retried,,
jobDetails,identifier,,String,Y,,"Extract File Name:
ExtractName_JobId_RayId_RecId_PaymentId.dat","Unique identifier for the job, will be unchanged throughout the lifecycle of the job","Use the 'JobID' from the Extract File name
ExtractName_JobId_RayId_RecId_PaymentId.dat

E.g.  PaymentExtract_c5f8e2d9-4b6a-42d1-a3f7-9e01b5c3d7e8_a12f7b9d-3e4c-45f0-b8a6-71d9c25e0f34_f8d2a3b7-9c5e-42d1-b6a0-e71f4c0d95e2_62054.dat

where,
ExtractName = PaymentExtract
JobId = c5f8e2d9-4b6a-42d1-a3f7-9e01b5c3d7e8
RayId = a12f7b9d-3e4c-45f0-b8a6-71d9c25e0f34
RecId = f8d2a3b7-9c5e-42d1-b6a0-e71f4c0d95e
PaymentId = 18002",
,referenceIdentifier,,String,,,,Placeholder to add any identifier specific to the job,,
,definition,,String,,Y,,Payment definition identifier,,
,transactionCount,,Integer,,Y,,Total number of payments available for processing in the job,,
,startTime,,String,,Y,,Job start time,,
,completionTime,,String,,Y,,"Job completion time, i.e., generation of EDI835 files for all the Payments in the job",,
,status,,String,,Y,,Current status of the job,,
,paymentId,,String,,Y,Actual Payment Id,Unique ID for each Payment transaction,,
,totalClaimCount,,Integer,,Y,Total Claim Count,Total number of claims associated/available under the specific Payment transaction,,
,outputFileName,,String,,Y,edi835 File Name,Generated EDI835 file name for the Payment,,
,requestPaymentArchiveFilename,,String,,,,,No use with business,
,responsePaymentArchiveFilename,,String,,,,,No use with business,
,claims,claimIdentifier,String,,Y,UUID - Claim level Identifier,"Unique identifier for each claim, will be different when the claim is reprocessed",NA for Edifecs,
,,claimHccId,String,,Y,20241110000948,"Claim HCC ID - Unique ID for each claim, will remain unchanged when reprocessed",,
,,claimNumber,String,,Y,714045,"Claim Number - Unique number for each claim, will remain unchanged when reprocessed",,
,,claimStatus,String,,Y,,PDS insertion status of the processed Claim,,
,,requestClaimArchiveFilename,String,,,,,,
,,responseClaimArchiveFilename,String,,,,,,
```

## Payment OB/V26.1.0.0/EdifecsProduct_Audit JSON_OB Payment Mapping_V1.0.xlsx — Audit events

```csv
processStageName,processStatus(Payment Level),processMessage,JSON TRIGGER EVENT,Comments
EDIFECS-Conversion,PROCESSED,,After the EDI conversion if it’s a success,
EDIFECS-Conversion,ERROR,Edifecs Translator Error,After the EDI conversion if it’s a failure,
EDIFECS-Validation,SUCCESS,,,Need an aggregation status for good and bad
EDIFECS-Validation,ERROR,Edifecs HIPAA Validation Error,"After the SNIP Validations, if it’s a bad record",
,,,,
,,,,
,,,,
Success,,,,
EDIFECS-Conversion,PROCESSED,,After the EDI conversion if it’s a success,
EDIFECS-Validation,SUCCESS,,,
,,,,
Error Scenario 1,,,,
EDIFECS-Conversion,ERROR,Edifecs Translator Error,After the EDI conversion if it’s a failure,"As this pre-requisite is difficult to implement in Test environment, this may not be able to be tested in SIT"
,,,,
Error Scenario 2,,,,
EDIFECS-Conversion,PROCESSED,,After the EDI conversion if it’s a success,
EDIFECS-Validation,ERROR,Edifecs HIPAA Validation Error,"After the SNIP Validations, if it’s a bad record",
```

## Payment OB/V26.1.0.0/EdifecsProduct_Mapping Spec_OutboundPayment_835_DFF_to_EDIConversion_V2.0.xlsx — Coversheet

```csv
Mapping Specification,,,,,,,,,
,,,,,,,,,
EDIFECS - Payment Extract (835) Outbound file,,,,,,,,,
,,,,,,,,,
"Healthcare Advisory and Consulting Team, UST HealthProof",,,,,,,,,
<Account Name> -,,,,,,,,,
,,,,,,,,,
,,,,Version,,1.1,,,
,,,,,,,,,
,Distribution of this document is limited to <Account Name> and UST HealthProof Associates,,,,,,,,
,,,,,,,,,
,Notice of Confidentiality and Custodial Responsibilities,,,,,,,,
,"This <Account Name> document contains confidential information that is
<Account Name> intellectual property. As a holder of this document, you
 may NOT disclose its content or any information derived from it to
any person outside of <Account Name> and UST <Account Name> Project Team.",,,,,,,,
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

## Payment OB/V26.1.0.0/EdifecsProduct_Mapping Spec_OutboundPayment_835_DFF_to_EDIConversion_V2.0.xlsx — Revision History

```csv
Revision History,,,,
,,,,
V#,Date,Author,Reviewer(s)/ Contributor(s),Comments
1.0,07/01/2023,Vijaya Raj Geethan P,Shijila Raveendran,Updated maaping spec
1.1,11/20/2023,Jishnu,Shijila Raveendran,"Changed the field position for 2100.NM103 2.018 to 2.019
Updated mapping in NM1*IL
Updated mapping in DTM*036
Updated mapping in DTM*232
Added bundling information"
1.2,02/05/2024,Jishnu,Shijila Raveendran,"Updated the mapping 2100.NM1*QC(Patient Name—PSD 1592)
Updated the mapping 2100.NM109(Patient Id—PSD 1628)
Updated the mapping 2110.SVC0-6(Patient Id—PSD 1592)"
1.3,30/4/2024,Ambily,Shijila Raveendran,Updated mapping for 2100.NM1*74 (PSD-2247)
1.4,9/10/24,Deepthi,Shijila Raveendran,Updated mapping for NM1*82*1  (User Story-8473)
1.5,5/7/25,Deepthi,Ambily,"Updated mapping for 1000B & NM1*82*3 (User Story - 16884)
Included NPI logic check"
```

## Payment OB/V26.1.0.0/EdifecsProduct_Mapping Spec_OutboundPayment_835_DFF_to_EDIConversion_V2.0.xlsx — 835 Mapping

```csv
Loop ID,EDI Segment,EDI Data Element Name,User Option,Length,Enumeration Values,Mapping Logic OR  DFF Position,DFF Field Description,Mapping Comments,Final Review Comments
ISA (Interchange Control Header),,,,,,,,,
,ISA,Segment: Interchange Control Header,R,,,,,,
,ISA01,Authorization Information Qualifier,R,"Min - 2
Max - 2","00 : No Authorization Information Present
03: Additional Data Identification","Hardcode as ""00""",NA,,
,ISA02,Authorization Information,R,"Min - 10
Max - 10",,Leave it blank,NA,,
,ISA03,Security Information Qualifier,R,"Min - 2
Max - 2","00 : No Security Information Present
01 : Password","Hardcode as ""00""",NA,,
,ISA04,Security InformationLQ,R,"Min - 10
Max - 10",,Leave it blank,NA,,
,ISA05,Interchange Sender ID Qualifier,R,"Min - 2
Max - 2","01: Duns (Dun & Bradstreet)
14 Duns Plus Suffix
20 Health Industry Number (HIN)
27 Carrier Identification Number
28 Fiscal Intermediary Identification Number
29 Medicare Provider and Supplier IdentificationNumber
30 U.S. Federal Tax Identification Number
33 National Association of Insurance Commissioners Company Code (NAIC)
ZZ Mutually Defined","Hardcode as ""ZZ""",NA,,
,ISA06,Interchange Sender ID,R,"Min - 15
Max - 15",,"Hardcode as  ""1234           """,NA,"Interchange Sender ID will be different for each customer.From product standpoint, we have hardcoded a random sender ID.",
,ISA07,Interchange Receiver ID Qualifier,R,"Min - 2
Max - 2","01: Duns (Dun & Bradstreet)
14 Duns Plus Suffix
20 Health Industry Number (HIN)
27 Carrier Identification Number
28 Fiscal Intermediary Identification Number
29 Medicare Provider and Supplier IdentificationNumber
30 U.S. Federal Tax Identification Number
33 National Association of Insurance Commissioners Company Code (NAIC)
ZZ Mutually Defined","Hardcode as ""ZZ""",NA,,
,ISA08,Interchange Receiver ID,R,"Min - 15
Max - 15",,"Hardcode  as ""123456789123456""",NA,"Interchange Receiver ID will be different for each customer.From product standpoint, we have hardcoded a random Receiver ID.",
,ISA09,Interchange Date,R,"Min - 6
Max - 6",The date format is YYMMDD.,"Map this value from  current date in the format of ""YYMMDD""",NA,Date  transaction is created – done by translator  (Date for the Process of converting 835 it will be the EDIFECS time of converting 835 ) YYMMDD,
,ISA10,Interchange Time,R,"Min -4
Max - 4",The time format is HHMM.,Map this value from   current time in the format of HHMM,NA,,
,ISA11,Interchange Control Standards Identifier,R,"Min - 1
Max - 1",,"Hardcode as ""^""",NA,,
,ISA12,Interchange Control Version Number,R,"Min - 5
Max - 5","00501 Standards Approved for Publication by ASC X12
Procedures Review Board through October 2003",Hardcode as “00501”,NA,,
,ISA13,Interchange Control Number,R,"Min - 9
Max - 9","The Interchange Control Number, ISA13, must be identical to the
associated Interchange Trailer IEA02.
This Must be a positive unsigned number and must be identical to the value in IEA02.",Refer Column H,NA,Unique ISI control number needs to generated in Edifecs for each 835 EDI file. It has to be 9 digits (for example -  000000764),
,ISA14,Acknowledgement Requested,R,"Min - 1
Max - 1","0 No Interchange Acknowledgment Requested
1 Interchange Acknowledgment Requested (TA1)","Hardcode as ""0""",NA,,
,ISA15,Usage Indicator,R,"Min - 1
Max - 1","P Production Data
T Test Data","Refer Column I and map based on below logic
Hardcode as ""P""  if it is a Production region
Hardcode as ""T""  if it is a Non-Production region",NA,Based on Environmental property whether it is lower region or production region.,
,ISA16,Component element Separator,R,"Min - 1
Max - 1",,"Hardcode  as "":""",NA,,
GS (Functional Group Header),,,,,,,,,
,GS,Segment: Functional Group Header,R,,,,,,
,GS01,Functional Identifier Code,R,"Min - 2
Max - 2",HP Health Care Claim Payment/Advice (835),Hardcode as “HP”,NA,,
,GS02,Application Sender Code,R,"Min -2
Max - 15",,"Hardcode as ""1234""",NA,"Application Sender Code will be different for each customer.From product standpoint, we have hardcoded a random Application Sender Code.",
,GS03,Application Receiver ID,R,"Min -2
Max - 15",,"Hardcode as ""Product""",NA,"Application Receiver ID will be different for each customer.From product standpoint, we have hardcoded a random Application Application Receiver ID.",
,GS04,Date,R,"Min - 8
Max - 8",Date Expressed in YYYYMMDD format (Current Date),"Map this value from  current date in the format of ""YYYYMMDD""",NA,,
,GS05,Time,R,"Min - 4
Max - 8",,"Map this value from   current Time in the format of ""HHMMSS""",NA,,
,GS06,Group Control Number,R,"Min - 1
Max - 9",,,NA,"Functional Group Control Number. Value must equal GE02

GS control number min length - 1 and max is 9",
,GS07,Responsible Agency Code,R,"Min - 1
Max - 2",X Accredited Standards Committee X12,"Hardcode as ""X""",NA,,
,GS08,Version/Release/Industry Identifier,R,"Min - 1
Max - 12","005010X221 Standards Approved for Publication by ASC X12
Procedures Review Board through October 2003","Hardcode as ""005010X221A1""",NA,,
ST Transaction Set Header,,,,,,,,,
,ST,Segment: Transaction Set Header,R,,,,,,
,ST01,Transaction Set Identifier Code,R,"Min - 3
Max - 3",835 Health Care Claim Payment/Advice,"Hardcode as ""835""",NA,,
,ST02,Transaction Set Control Number,R,"Min - 4
Max - 9",,Refer Column H,NA,Unique control number needs to populated from process flow or map,
BPR Financial Information,,,,,,,,,
,BPR,Segment: Financial Information,R,,,,,Currently we are not mapping ACH payments,
,BPR01,Transaction Handling Code,R,"Min - 1
Max - 2","C Payment Accompanies Remittance Advice
D Make Payment Only
H Notification Only
I Remittance Information Only
P Prenotification of Future Transfers
U Split Payment and Remittance
X Handling Party’s Option to Split Payment and
Remittance","Hardcode as ""I"" for EFT/Check payments
Hardcode as ""H"" when the actual provider payment amount(BPR02) is zero.",NA,Currently ACH payment is not in scope for product. Need to verify future scope for ACH payment mapping . IBC conifrmed they don’t have ACH scope.,
,BPR02,Monetary Amount,R,"Min - 1
Max - 18",Cheque Amount,Map this value from the DFF index 1.006,CheckAmount,,
,BPR03,Credit/Debit Flag,R,"Min - 1
Max - 1","C Credit
D Debit","Hardcode as ""C""",NA,,
,BPR04,PAYMENT METHOD CODE,R,"Min - 3
Max - 3","ACH Automated Clearing House (ACH)
BOP Financial Institution Option
CHK Check
FWT Federal Reserve Funds/Wire Transfer - Nonrepetitive
NON Non-Payment Data","Hardcode as ""CHK""  for check
Hardcode as ""ACH"" for Electronic payment
Hardcode as ""NON"" if the the actual provider payment amount(BPR02) is zero.",NA,"""CHK"" = Check, ""ACH"" = EFT payments, ""NON"" = Non payments",
,BPR05,PAYMENT FORMAT CODE,S,"Min - 1
Max - 10","CCP Cash Concentration/Disbursement plus Addenda
(CCD+) (ACH)

CTX Corporate Trade Exchange (CTX) (ACH)",,NA,Currently ACH payment is not in scope for product. Need to verify future scope for ACH payment mapping . IBC conifrmed they don’t have ACH scope.,
,BPR06,(DFI) ID NUMBER QUALIFIER,S,"Min - 2
Max - 2","01 ABA Transit Routing Number Including Check Digits
(9 digits)
04 Canadian Bank Branch and Institution Number",,NA,,
,BPR07,(DFI) IDENTIFICATION NUMBER,S,"Min - 3
Max - 12",,,MICRTransitNumber,,
,BPR08,Account Number Qualifier,S,"Min - 1
Max - 3",DA Demand Deposit,,NA,,
,BPR09,Sender Bank Account Number,S,"Min - 1
Max - 35",,,AccountNumber,,
,BPR010,ORIGINATING COMPANY IDENTIFIER,S,"Min - 10
Max - 10",,,NA,,
,BPR11,Originating Company Supplemental Code,S,"Min -9
Max - 9",,,NA,,
,BPR12,DFI Identification Number Qualifier,S,"Min - 2
Max - 2","01 ABA Transit Routing Number Including Check Digits
(9 digits)
04 Canadian Bank Branch and Institution Number",,NA,,
,BPR013,Receiver or Provider Bank ID Number,S,"Min - 3
Max - 12",,,Payee Bank ID Number,,
,BPR014,ACCOUNT NUMBER QUALIFIER,S,"Min - 1
Max - 3","DA Demand Deposit
SG Savings",,Account Number Qualifier,,
,BPR015,Receiver or Provider Account Number,S,"Min - 1
Max - 35",,,Payee Account Number,,
,BPR016,Check Issue or EFT Effective Date,S,"Min - 8
Max - 8",,"Map this value from the DFF index 1.005

Date format ""YYYYMMDD""",CheckDate,YYYYMMDD,
TRN Reassociation Trace Number,,,,,,,,,
,TRN,Segment: Reassociation Trace Number,R,,,,,,
,TRN01,Trace Type Code,R,"Min - 1
Max - 2",1 Current Transaction Trace Numbers,"Hardcode as ""1""",NA,,
,TRN02,REFERENCE IDENTIFICATION,R,"Min - 1
Max - 50",,Map this value from the DFF index 1.004,CheckNumber,,
,TRN03,ORIGINATING COMPANY IDENTIFIER,R,"Min - 10
Max - 10",,"Hardcode as ""1841297547""",NA,"1 Followed by payer TIN

ORIGINATING COMPANY IDENTIFIER will be different for each customer.From product standpoint, we have hardcoded a random ORIGINATING COMPANY IDENTIFIER.",
,TRN04,Originating Company Supplemental Code,S,"Min - 1
Max - 50",,NA,NA,,
CUR Foreign Currency Information,,,,,,,,,
,CUR,Segment: Foreign Currency Information,S,,,,,,
,CUR01,Entity Identifier Code,R,"Min - 2
Max - 3",PR Payer,NA,NA,,
,CUR02,Currency Code,R,"Min - 3
Max - 3",,NA,NA,,
REF Receiver Identification,,,,,,,,,
,REF,Segment: Receiver Identification,S,,,,,,
,REF01,Reference Identification Qualifier,R,"Min - 2
Max - 3",EV Receiver Identification Number,NA,NA,,
,REF02,Reference Identification,R,"Min - 1
Max - 50",,NA,NA,,
REF Version Identification,,,,,,,,,
,REF,Segment: Version Identification,S,,,,,,
,REF01,Reference Identification Qualifier,R,"Min - 2
Max - 3",F2 Version Code - Local,NA,NA,,
,REF02,Reference Identification,R,"Min - 1
Max - 50",,NA,NA,,
DTM Production Date,,,,,,,,,
,DTM,Segment: Production Date,S,,,,,,
,DTM01,Date/Time qualifier,R,"Min - 3
Max - 3",405 Production,"Hardcode as ""405""",NA,,
,DTM02,Date,R,"Min - 8
Max - 8",,"Map this value from  system date in the format ""YYYYMMDD""",NA,,
LOOP 1000A - Payer Identification,,,,,,,,,
1000A,N1,Payer Identification,R,,,,,,
1000A,N101,Payer Identifier Code,R,"Min - 2
Max - 3",PR Payer,"Hardcode as ""PR""",NA,,
1000A,N102,Payer NAME,R,"Min - 1
Maxi - 60",,"Hardcode as ""PRODUCT""",NA,,
1000A,N103,Identification Code Qualifier,S,"Min - 1
Max - 2",XV Centers for Medicare and Medicaid Services PlanID,NA,NA,,
1000A,N104,Payer Identification Code,S,"Min- 2
Max - 80",,NA,NA,,
1000A,N3,Payer Address,R,,,,,,
1000A,N301,Payer Address Line,R,"Min - 1
Max - 55",,"Hardcode as ""XXXX""",NA,,
1000A,N302,Payer Address Line,S,"Min - 1
Max - 55",,NA,NA,,
1000A,N4,"Segment : Payer City, State, Zip Code",R,,,,,,
1000A,N401,Payer City Name,R,"Min - 1
Max - 30",,"Hardcode as ""Aurora""",NA,"Payer City Name will be different for each customer.From product standpoint, we have hardcoded a random Payer City Name.",
1000A,N402,Payer State Code,S,"Min - 2
Max - 2",,"Hardcode as ""CO""",NA,"Payer state will be different for each customer.From product standpoint, we have hardcoded a random Payer state.",
1000A,N403,Payer Postal Zone or Zip Code,S,"Min - 1
Max - 15",,"Hardcode as ""80014""",NA,"Payer Postal Zone will be different for each customer.From product standpoint, we have hardcoded a random Payer Postal Zone.",
1000A,REF,Additional Payer Identification,S,,,,,,
1000A,REF01,Reference Identifier Qualifier,R,"Min - 2
Max - 3","2U Payer Identification Number
EO Submitter Identification Number
HI Health Industry Number (HIN)NF National Association of Insurance Commissioners (NAIC) Code","Hardcode as ""2U""",NA,,
1000A,REF02,Additional Payer Identifier,R,"Min - 1
Max - 50",,"Hardcode as ""6058028""",NA,"Payer identifier will be different for each customer.From product standpoint, we have hardcoded a random Payer identifier.",
1000A,PER,Payer Business Contact Information,S,,,,,,
1000A,PER01,Contact Function Code,R,"Min - 2
Max - 2",CX Payers Claim Office,"Hardcode as ""CX""",NA,,
1000A,PER02,Payer Contact Name,S,"Min - 1
Max - 60",,"Hardode as ""EDI Coordinator""",NA,"Payer Contact Name will be different for each customer.From product standpoint, we have hardcoded a random Payer Contact Name.",
1000A,PER03,Communication Number Qualifier,S,"Min - 2
Max - 2","EM Electronic Mail
FX Facsimile
TE Telephone","Hardcode as ""TE""",NA,,
1000A,PER04,Payer Contact Communication Number,S,"Min - 1
Max - 256",,"Hardcode as ""1234567890""",NA,"Payer Contact Communication Number will be different for each customer.From product standpoint, we have hardcoded a random Payer Contact Communication Number.",
1000A,PER05,Communication Email Qualifier,S,"Min - 2
Max - 2","EM Electronic Mail
EX Telephone Extension
FX Facsimile
TE Telephone",Hardcode as “EM”,NA,,
1000A,PER06,Payer Contact Communication Email,S,"Min - 1
Max - 256",,Hardcode as “xyz@xyz.com”,NA,"Payer Contact Communication Email will be different for each customer.From product standpoint, we have hardcoded a random Payer Contact Communication Email.",
1000A,PER07,Communication Number Qualifier,S,"Min - 2
Max - 2",EX Telephone Extension,,,,
1000A,PER08,Communication Number,S,"Min - 1
Max - 256",,,,,
1000A,PER,Payer Technical Contact Information,R,,,,,,
1000A,PER01,Contact Function Code,R,"Min - 2
Max - 2",BL Technical Department,Hardcode as “BL”,NA,,
1000A,PER02,Payer Technical Contact Name,S,"Min - 1
Max - 60",,"Hardode as ""EDI Coordinator""",NA,"Payer Technical Contact Name will be different for each customer.From product standpoint, we have hardcoded a random Payer Technical Contact Name.",
1000A,PER03,Communication Number Qualifier,S,"Min - 2
Max - 2","EM Electronic Mail
TE Telephone
Recommended
UR Uniform Resource Locator (URL)
Use only when there is no central telephone number
for the payer entity.",Hardcode as “TE”,NA,,
1000A,PER04,Payer Contact Communication Number,S,"Min - 1
Max - 256",,"Hardcode as ""1234567890""",NA,"Payer Contact Communication Number will be different for each customer.From product standpoint, we have hardcoded a random Payer Contact Communication Number.",
1000A,PER05,Payer Contact Communication Number,S,"Min - 2
Max - 2","M Electronic Mail
EX Telephone Extension
FX Facsimile
TE Telephone
UR Uniform Resource Locator (URL)",Hardcode as “EM”,NA,,
1000A,PER06,Payer Technical Contact Communication,S,"Min - 1
Max - 256",,"Hardcode as ""contactus@uhc.com""",NA,"Payer Technical Contact Communication will be different for each customer.From product standpoint, we have hardcoded a random Payer Technical Contact Communication.",
1000A,PER07,Communication Number Qualifier,S,"Min - 2
Max - 2","EM Electronic Mail
EX Telephone Extension
FX Facsimile
UR Uniform Resource Locator (URL)",,,,
1000A,PER08,Communication Number,S,"Min - 1
Max - 256",,,,,
1000A,PER,Payer Web Site,S,,,,,,
1000A,PER01,Contact Function Code,R,"Min - 2
Max - 2",IC Information Contact,"Hardcode as ""IC""",NA,,
1000A,PER02,Name,R,NA,NA,NA,NA,,
1000A,PER03,Communication Number Qualifier,R,"Min - 2
Max - 2",UR Uniform Resource Locator (URL),"Hardcode as ""UR""",NA,,
1000A,PER04,Communication Number,R,"Min - 1
Max - 256",,"Hardcode as ""www.uhc.com""",,"Communication Number will be different for each customer.From product standpoint, we have hardcoded a random Communication Number.",
LOOP 1000B Payee Identification,,,,,,,,,
1000B,N1,Payee Identification,R,,,,,,
1000B,N101,Payer Identifier Code,R,"Min - 2
Max - 3",PE Payee,"Hardcode as ""PE""",NA,,
1000B,N102,Payee Name,R,"Min - 1
Max - 60",,Map this value from the DFF index 1.017,PayeeName,,
1000B,N103,Payee Identification Code Qualifier,R,"Min - 1
Max - 2","FI Federal Taxpayer’s Identification Number
XV Centers for Medicare and Medicaid Services PlanID
XX Centers for Medicare and Medicaid Services
National Provider Identifier","Hardcode as ""XX""",NA,,
1000B,N104,Payee Identification Code,R,"Min - 2
Max - 80",,Map this value from the DFF index 1.033,Payee NPI,,
1000B,N3,Payee Address,S,,,,,,
1000B,N301,Payee Address Line,R,"Min - 1
Max - 55",,Map this value from the DFF index  1.018,PayeeAddress1,,
1000B,N302,Payee Address Line,S,"Min - 1
Max - 56",,Map this value from the DFF index  1.019,PayeeAddress2,,
1000B,N4,"Payee City, State, Zip Code",S,,,,,,
1000B,N401,Payee City Name,R,"Min - 2
Max - 30",,Map this value from the DFF index  1.020,PayeeCity,,
1000B,N402,Payee State Code,S,"Min - 2
Max - 2",,Map this value from the DFF index  1.021,PayeeState,,
1000B,N403,Payee Postal Zone or Zip Code,S,"Min - 3
Max - 15",,Map this value from the DFF index  1.022,PayeeZip,,
1000B,N404,Country Code,S,"Min - 2
Max - 3",,NA,NA,,
1000B,N407,Country Subdivision Code,S,"Min - 1
Max - 3",,NA,NA,,
1000B,REF,Payee Additional Identification,S,,,,,,
1000B,REF01,Additional Payee Identification Qualifier,R,"Min - 2
Max - 3","0B State License Number
D3 National Council for Prescription Drug Programs
Pharmacy Number
PQ Payee Identification
TJ Federal Taxpayer’s Identification Number","Hardcode as ""TJ""",NA,,
1000B,REF02,Reference Identification Code,R,"Min - 1
Max - 50",,Map this value from the DFF index  1.032,Payee SSN/TIN,"Remove ""-"" If it is present in 1.032",
1000B,RDM,Remittance Delivery Method,S,,,,,,
1000B,RDM01,Report Transmission Code,R,"Min - 1
Max - 2","BM By Mail
EM E-Mail
FT File Transfer
OL On-Line",NA,NA,,
1000B,RDM02,Name,S,"Min - 1
Max - 60",,NA,NA,,
1000B,RDM03,Communication Number,S,"Min - 1
Max - 256",,NA,NA,,
LOOP 2000 Header Number,,,,,,,,,
2000,LX,Header Number,S,,,,,,
2000,LX01,Assigned Number,R,"Min - 1
Max - 6",,Refer to column I,NA,"Assigned Number - When 835 is created it needs to generated, starts with 1 , it increments for each CLP segement mentioned in Row#174, 2100 Loop",
2000,TS3,Provider Summary Information,S,,,,,,
2000,TS301,Reference Identification,R,"Min - 1
Max - 50",,NA,NA,,
2000,TS302,Facility Code Value,R,"Min - 1
Max - 2",,NA,NA,,
2000,TS303,Date,R,"Min - 8
Max - 8",,,NA,,
2000,TS304,Quantity,R,"Min - 1
Max - 15",,NA,NA,,
2000,TS305,Monetary Amount,R,"Min - 1
Max - 18",,NA,NA,,
2000,TS313,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS315,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS317,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS318,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS320,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS321,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS322,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS323,Quantity,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS324,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS2,Provider supplemental Summary Information,S,,,,,,
2000,TS201,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS202,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS203,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS204,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS205,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS206,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS207,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2000,TS208,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS209,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS210,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2000,TS211,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2000,TS212,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2000,TS213,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2000,TS214,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2000,TS215,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS216,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2000,TS217,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS218,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS219,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
LOOP 2100 Claim payment Information,,,,,,,,,
2100,CLP,Claim payment Information,R,,,,,,
2100,CLP01,Patient Control Number,R,"Min - 1
Max - 38",,Map this value from the DFF index  2.079,Patient Control Number,,
2100,CLP02,Claim Status Code,R,"Min - 1
Max - 2","1 Processed as Primary
2 Processed as Secondary
3 Processed as Tertiary
4 Denied
19 Processed as Primary, Forwarded to Additional
Payer(s)
20 Processed as Secondary, Forwarded to Additional
Payer(s)
21 Processed as Tertiary, Forwarded to Additional
Payer(s)
22 Reversal of Previous Payment
23 Not Our Claim, Forwarded to Additional Payer(s)
25 Predetermination Pricing Only - No Payment",Map this value from the DFF index   2.04,ClaimStatusCode,,
2100,CLP03,Total Claim Charge Amount,R,"Min - 1
Ma - 18",,Map this value from the DFF index  2.028,ChargeAmount,,
2100,CLP04,Total Claim Payment Amount,R,"Min - 1
Max - 18",,Map this value from the DFF index  2.037,PaidAmount,,
2100,CLP05,Patient Responsibility Amount,S,"Min - 1
Max - 18",,Map this value from the DFF index  2.038,PatientOwedamount,"This mapping is required when the patient responsibility is greater than zero, if not required.",
2100,CLP06,Claim Filing Indicator Code,R,"Min - 2
Max - 2","12 Preferred Provider Organization (PPO)
13 Point of Service (POS)
14 Exclusive Provider Organization (EPO)
15 Indemnity Insurance
16 Health Maintenance Organization (HMO) Medicare
Risk
17 Dental Maintenance Organization
AM Automobile Medical
CH Champus
DS DisabilityHM Health Maintenance Organization
LM Liability Medical
MA Medicare Part A
MB Medicare Part B
MC Medicaid
OF Other Federal Program
TV Title V
VA Veterans Affairs Plan
WC Workers’ Compensation Health Claim
ZZ Mutually Defined","Hardcode as ""HM""",NA,,
2100,CLP07,Payer Claim Control Number (Payer Claim Control Number – HRP claim number ),R,"Min - 1
Max - 50",,Map this value from the DFF index 2.003,ClaimNumber,,
2100,CLP08,Facility Type Code,S,"Min - 1
Max - 2",,Map this value from the DFF index 2.061,Facility Code Value,,
2100,CLP09,Claim Frequency Code,S,"Min - 1
Max - 1",,Map this value from the DFF index 2.083,Frequency code,,
2100,CLP10,Patient Status Code,NA,NA,NA,NA,NA,,
2100,CLP11,Diagnosis Related Group (DRG) Code,S,"Min - 1
Max - 4",,Map this value from the DFF index 2.069,Diagnosis Related Group Code,,
2100,CLP12,DRG Weight,S,"Min - 1
Max - 15",,Map this value from the DFF index 2.068,DRG Weight (Record Type 2 Claim Level Information),,
2100,CLP13,PERCENT - Discharge Fraction,S,"Min - 1
Max - 10",,NA,NA,,
2100,CAS,Claim Adjustment,S,,,,,All the adjustment details are mentioned in line level (2110 CAS Segment),
2100,CAS01,Claim Adjustment Group Code,R,"Min - 1
Max - 2","CO Contractual Obligations
OA Other adjustments
PI Payor Initiated Reductions
PR Patient Responsibility",NA,NA,,
2100,CAS02,Adjustment Reason Code,R,"Min - 1
Max - 5",,NA,NA,,
2100,CAS03,Adjustment Amount,R,"Min - 1
Max - 18",,NA,NA,,
2100,CAS04,QUANTITY,S,"Min - 1
Max - 15",,NA,NA,,
2100,CAS05,Claim Adjustment Reason Code,S,"Min - 1
Max - 2",,NA,NA,,
2100,CAS06,Monetary Amount,S,"Min - 1
Max - 18",,,,,
2100,CAS07,Quantity,S,"Min - 1
Max - 15",,,,,
2100,CAS08,Claim Adjustment Reason Code,S,"Min - 1
Max - 2",,,,,
2100,CAS09,Monetary Amount,S,"Min - 1
Max - 18",,,,,
2100,CAS10,Quantity,S,"Min - 1
Max - 15",,,,,
2100,CAS11,Claim Adjustment Reason Code,S,"Min - 1
Max - 2",,,,,
2100,CAS12,Monetary Amount,S,"Min - 1
Max - 18",,,,,
2100,CAS13,Quantity,S,"Min - 1
Max - 15",,,,,
2100,CAS14,Claim Adjustment Reason Code,S,"Min - 1
Max - 2",,,,,
2100,CAS15,Monetary Amount,S,"Min - 1
Max - 18",,,,,
2100,CAS16,Quantity,S,"Min - 1
Max - 15",,,,,
2100,CAS17,Claim Adjustment Reason Code,S,"Min - 1
Max - 2",,,,,
2100,CAS18,Monetary Amount,S,"Min - 1
Max - 18",,,,,
2100,CAS19,Quantity,S,"Min - 1
Max - 15",,,,,
2100,NM1,Patient Name,R,,,,,,
2100,NM101,Patient Identifier Code,R,"Min - 2
Max - 3",QC Patient,"Hardcode as ""QC""",NA,,
2100,NM102,Entity Type Qualifier,R,"Min - 1
Max - 1",1 Person,"Hardcode as ""1""",NA,,
2100,NM103,Patient Last  Name,S,"Min - 1
Max - 60",,Map this value from the DFF index 2.087 - Map only the Lastname,"SubmittedPatientLastName
Format: (SubmittedPatientLastName, Middle Name,Firstname)","If 2.087 doesnt have comma(,) Map from position 2.080 (Corrected patient information)",
2100,NM104,Patient First Name,S,"Min - 1
Max - 35",,Map this value from the DFF index 2.087 - Map only the First name,"SubmittedPatientLastName
Format: (SubmittedPatientLastName, Middle Name,Firstname)","If 2.087 doesnt have comma(,) Map from position 2.081 (Corrected patient information)",
2100,NM105,Patient Middle Initial,S,"Min - 1
Max - 25",,Map this value from the DFF index 2.087- Map only the Middle name,"SubmittedPatientLastName
Format: (SubmittedPatientLastName, Middle Name,Firstname)","If 2.087 doesnt have comma(,) Map from position 2.082 (Corrected patient information)",
2100,NM106,Name Prefix,NA,NA,,NA,NA,,
2100,NM107,Patient Name Suffix,S,"Min - 1
Max - 10",,NA,NA,,
2100,NM108,Identification Code Qualifier,S,"Min - 1
Max - 2","34 Social Security Number
HN Health Insurance Claim (HIC) Number
II Standard Unique Health Identifier for each Individual
in the United States
Use this code if mandated in a final Federal Rule.
MI Member Identification Number
MR Medicaid Recipient Identification Number","Hardcode as ""MI""",NA,,
2100,NM109,Patient Member Number,S,"Min - 2
Max - 80",,Map this value from the DFF index 2.084,SubmittedPatientID,If no values present in 2.084 then map from 2.005 (Corrected patient id),
2100,NM1,Insured Name,S,,If subscriber and patient are same we will not map this entire segment,,,,
2100,NM101,Entity Identifier Code,R,"Min - 2
Max - 3",IL,"Hardcode as ""IL""",,If the subscriber is not same as patient,
2100,NM102,Entity Type Qualifier,R,"Min - 1
Max - 1","1,2","Hardcode as ""1""",,,
2100,NM103,Name Last or Organization Name,S,"Min - 1
Max - 60",,Map this value from the DFF index 2.091,SubscriberLastName,,
2100,NM104,Name First,S,"Min - 1
Max - 35",,Map this value from the DFF index 2.089,SubscriberFirstName,,
2100,NM105,Name Middle,S,"Min - 1
Max - 25",,Map this value from the DFF index 2.090,SubscriberMiddleName,,
2100,NM107,Name Suffix,ISA,"Min - 1
Max - 10",,NA,NA,,
2100,NM108,Identification Code Qualifier,R,"Min - 1
Max - 2","FI,II,MI","Hardcode as ""MI""",NA,,
2100,NM109,Identification Code,R,"Min - 2
Max - 80",,Map this value from the DFF index 2.088,SubscriberID,,
2100,NM1,Corrected Patient/Insured Name,S,,,,,,
2100,NM101,Entity Identifier Code,R,"Min - 2
Max - 3",74 Corrected Insured,"Hardcode as ""74""",NA,"Mapping Logic 1:
Map this segment, only
if 2.045 - CorrectedPatient/InsuredName
& 2.046 CorrectedPatient/InsuredMemberID is present in DFF and if 2.045 (Last name) is differrent from 2.087
& 2.046 is different from 2.084
Consider Mapping logic 2 only if Mapping Logic 1 doesn't satisfy/present in DFF
Mapping Logic 2:
Map this segment only if
the name in 2.080+2.082+2.081 is different from 2.087
OR
ID in 2.005 is different from 2.084",
2100,NM102,Entity Type Qualifier,R,"Min - 1
Max - 1","1 Person
2 Non-Person Entity","Hardcode as ""1""",NA,,
2100,NM103,Name Last or Organization Name,S,"Min - 1
Max - 60",,"Map this value from the DFF index 2.045
Format of data in 2.045: Last Name, First Name
Map this value from the DFF index 2.080","CorrectedPatient/InsuredName
Patient Last name","Mapping Logic 1:
Map only if 2.045 is present and  if 2.045 (Last name) is differrent from 2.087, else consider Logic 2
If present, Map Last Name only
Mapping Logic 2:
Map only if  the name in 2.080+2.082+2.081 is different from 2.087",
2100,NM104,Name First,S,"Min - 1
Max - 35",,"Map this value from the DFF index 2.045
Format of data in 2.045: Last Name, First Name
Map this value from the DFF index 2.081",Patient First name,"Mapping Logic 1:
Map only if 2.045 is present, else consider Logic 2
If present, Map First Name only
Mapping Logic 2:
Map only if  the name in 2.080+2.082+2.081 is different from 2.087",
2100,NM105,Name Middle,S,"Min - 1
Max - 25",,Map this value from the DFF index 2.082,Patient Middle name,Map only if  the name in 2.080+2.082+2.081 is different from 2.087,
2100,NM107,Name Suffix,S,"Min - 1
Max - 10",,NA,NA,,
2100,NM108,Identification Code Qualifier,S,"Min - 1
Max - 2",C Insured’s Changed Unique Identification Number,"Hardcode as ""C""",NA,,
2100,NM109,Identification Code,S,"Min - 2
Max - 80",,"Map this value from the DFF index 2.046
Map this value from the DFF index 2.005","CorrectedPatient/InsuredMemberID
PatientID","Mapping Logic 1:
Map only if 2.046 is present and 2.046 is different from 2.084, else consider Logic 2
Mapping Logic 2:
Map only if  ID in 2.005 is different from 2.084",
2100,NM1,Service Provider Name,S,,,,,,
2100,NM101,Entity Identifier Code,R,"Min - 2
Max - 3",82 Rendering Provider,"Hardcode as ""82""",NA,"1. This NM1*82 is a configurable item. A flag will be configured in Edifecs layer with Y/N value.
If Y - NM103, NM104 & NM105 will be splited and populated.
If N - only NM103 will populated with value. NM104 & NM105 should be blank
2. Populate NM1*82 only if 2.016 is different from 1.033",NPI should be the only check
2100,NM102,Entity Type Qualifier,R,"Min - 1
Max - 1","1 Person
2 Non-Person Entity","Hardcode as ""1""",NA,,
2100,NM103,Name Last or Organization Name,S,"Min - 1
Max - 60",,"Logic 1:
If Flag Y - Map this value from the DFF index 2.094
If Flag N - Map this value from the DFF index 2.018
Logic 2:
Do not populate NM1*82, If 2.018  is equal to 1.017",,Populate NM1*82 only if 2.018 is different from 1.017,"Currently we have Logic 2 in our code, but it Logic 2 is optional one to be considered"
2100,NM104,Name First,S,"Min - 1
Max - 35",,"If Flag Y - Map this value from the DFF index 2.092
If Flag N - NA",NA,,
2100,NM105,Name Middle,S,"Min - 1
Max - 25",,"If Flag Y - Map this value from the DFF index 2.093
If Flag N - NA",NA,,
2100,NM107,Name Suffix,S,"Min - 1
Max - 10",,NA,NA,,
2100,NM108,Identification Code Qualifier,R,"Min - 1
Max - 2","BD Blue Cross Provider Number
BS Blue Shield Provider Number
FI Federal Taxpayer’s Identification Number
MC Medicaid Provider Number
PC Provider Commercial Number
SL State License Number
UP Unique Physician Identification Number (UPIN)
XX Centers for Medicare and Medicaid Services
National Provider Identifier","Hardcode as ""XX""",NA,,
2100,NM109,Identification Code,R,"Min - 2
Max - 80",,Map this value from the DFF index 2.016,ProviderNPI,Map only if  ID in 2.005 is different from 2.084,
2100,NM1,Crossover Carrier Name,S,,,,,,
2100,NM101,Entity Identifier Code,R,"Min - 2
Max - 3",TT Transfer To,NA,NA,,
2100,NM102,Entity Type Qualifier,R,"Min - 1
Max - 1",2 Non-Person Entity,NA,NA,,
2100,NM103,Name Last or Organization Name,R,"Min - 1
Max - 60",,NA,NA,,
2100,NM108,Identification Code Qualifier,R,"Min - 1
Max - 2","AD Blue Cross Blue Shield Association Plan Code
FI Federal Taxpayer’s Identification Number
NI National Association of Insurance Commissioners
(NAIC) Identification
PI Payor Identification
PP Pharmacy Processor Number
XV Centers for Medicare and Medicaid Services PlanID",NA,NA,,
2100,NM109,Identification Code,R,"Min - 2
Max - 80",,NA,NA,,
2100,NM1,Corrected Priority Payer Name,S,,,,,,
2100,NM101,Entity Identifier Code,R,"Min - 2
Max - 3",PR Payer,NA,NA,,
2100,NM102,Entity Type Qualifier,R,"Min - 1
Max - 1",2 Non-Person Entity,NA,NA,,
2100,NM103,Name Last or Organization Name,R,"Min - 2
Max - 60",,NA,NA,,
2100,NM108,Identification Code Qualifier,R,"Min - 1
Max - 2","AD Blue Cross Blue Shield Association Plan Code
FI Federal Taxpayer’s Identification Number
NI National Association of Insurance Commissioners
(NAIC) Identification
PI Payor Identification
PP Pharmacy Processor Number
XV Centers for Medicare and Medicaid Services PlanID",NA,NA,,
2100,NM109,Identification Code,R,"Min - 2
Max - 80",,NA,NA,,
2100,NM1,Other Subscriber Name,S,,,,,,
2100,NM101,Entity Identifier Code,R,"Min - 2
Max - 3",GB Other Insured,NA,NA,,
2100,NM102,Entity Type Qualifier,R,"Min - 1
Max - 1","1 Person
2 Non-Person Entity",NA,NA,,
2100,NM103,Name Last or Organization Name,S,"Min - 1
Max - 60",,NA,NA,,
2100,NM104,Name First,S,"Min - 1
Max - 35",,NA,NA,,
2100,NM105,Name Middle,S,"Min - 1
Max - 25",,NA,NA,,
2100,NM107,Name Suffix,S,"Min - 1
Max - 10",,NA,NA,,
2100,NM108,Identification Code Qualifier,S,"Min - 1
Max - 2","FI Federal Taxpayer’s Identification Number
II Standard Unique Health Identifier for each Individual
in the United States
MI Member Identification Number",NA,NA,,
2100,NM109,Identification Code,S,"Min - 2
Max - 80",,NA,NA,,
2100,MIA,Inpatient Adjudication Information,S,,,,,,
2100,MIA01,Quantity,R,"Min - 1
Max - 15",,NA,NA,,
2100,MIA02,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA03,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2100,MIA04,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA05,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2100,MIA06,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA07,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA08,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA09,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA10,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA11,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA12,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA13,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA14,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA15,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2100,MIA16,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA17,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA18,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA19,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA20,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2100,MIA21,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2100,MIA22,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2100,MIA23,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2100,MIA24,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MOA,Outpatient Adjudication Information,S,,,,,,
2100,MOA01,Percentage as Decimal,S,"Min - 1
Max - 10",,NA,NA,,
2100,MOA02,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MOA03,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2100,MOA04,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2100,MOA05,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2100,MOA06,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2100,MOA07,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2100,MOA08,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MOA09,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,REF,Other Claim Related Identification,S,,,,,,
2100,REF01,Reference Identification Qualifier,R,"Min - 2
Max - 3","1L Group or Policy Number
1W Member Identification Number
28 Employee Identification Number
6P Group Number
9A Repriced Claim Reference Number
9C Adjusted Repriced Claim Reference Number
BB Authorization Number
CE Class of Contract Code
EA Medical Record Identification Number
F8 Original Reference Number
G1 Prior Authorization Number
G3 Predetermination of Benefits Identification Number
IG Insurance Policy Number
SY Social Security Number","Hardcode as ""1L""",NA,,
2100,REF02,Reference Identification,R,"Min - 1
Max - 50",,Map this value from the DFF index 2.025,GroupCode,,
2100,REF,Rendering Provider Identification,S,,,,,,
2100,REF01,Reference Identification Qualifier,R,"Min - 2
Max - 3","0B State License Number
1A Blue Cross Provider Number
1B Blue Shield Provider Number
1C Medicare Provider Number
1D Medicaid Provider Number
1G Provider UPIN Number
1H CHAMPUS Identification Number
1J Facility ID Number
D3 National Council for Prescription Drug Programs
Pharmacy Number
G2 Provider Commercial Number
LU Location Number",NA,NA,,
2100,REF02,Reference Identification,R,"Min - 1
Max - 50",,NA,NA,,
2100,DTM,Statement From or To Date,S,,,,,,
2100,DTM01,Date/Time Qualifier,R,"Min - 3
Max - 3",232 Claim Statement Period Start,"Hardcode as ""232""",NA,Only map when linelevel date is not present,
2100,DTM02,Date,R,"Min - 8
Max - 8",,Map this value from the DFF index 2.062,From Date,Date format is YYYYMMDD,
2100,DTM01,Date/Time Qualifier,R,"Min - 3
Max - 3",233 Claim Statement Period End,"Hardcode as ""233""",,Only map when linelevel date is not present,
2100,DTM02,Date,R,"Min - 8
Max - 8",,Map this value from the DFF index 2.063,To Date,Date format is YYYYMMDD,
2100,DTM,Coverage Expiration Date,S,,,,,,
2100,DTM01,Date Time Qualifier,R,"Min - 3
Max - 3",036 Expiration,Hardcode as “036”,NA,Coverage Expiration Date (DTM*036) should be populated only if one of the adjustment codes on the Line level is “27”,
2100,DTM02,Expiration Date,R,"Min - 8
Max - 8",,Map this value from the DFF index 2.042,CoverageExpiration,Date format is YYYYMMDD,
2100,DTM,Claim Received Date,S,,,,,,
2100,DTM01,Date Time Qualifier,R,"Min - 3
Max - 3",050 Received,Hardcode as “050”,NA,,
2100,DTM02,Received Date,R,"Min - 8
Max - 8",,Map this value from the DFF index 2.051,Claim Received Date,Date format is YYYYMMDD,
2100,PER,Claim Contact Information,S,,,,,,
2100,PER01,Contact Function Code,R,"Min - 2
Max - 2",CX Payers Claim Office,NA,NA,,
2100,PER02,Name,S,"Min - 1
Max - 60",,NA,NA,,
2100,PER03,Communication Number Qualifier,R,"Min - 2
Max - 2","EM Electronic Mail
FX Facsimile
TE Telephone",NA,NA,,
2100,PER04,Communication Number,R,"Min - 1
Max - 256",,NA,NA,,
2100,PER05,Communication Number Qualifier,S,"Min - 2
Max - 2","EM Electronic Mail
EX Telephone Extension
FX Facsimile
TE Telephone",NA,NA,,
2100,PER06,Communication Number,S,"Min - 1
Max - 256",,NA,NA,,
2100,PER07,Communication Number Qualifier,S,"Min - 2
Max - 2",EX Telephone Extension,NA,NA,,
2100,PER08,Communication Number,S,"Min - 1
Max - 256",,NA,NA,,
2100,AMT,Claim Supplemental Information,S,,,,,,
2100,6,Amount Qualifier Code,R,"Min - 1
Max - 3","AU Coverage Amount
D8 Discount Amount
DY Per Day Limit
F5 Patient Amount Paid
I Interest
NL Negative Ledger Balance
T Tax
T2 Total Claim Before Taxes
ZK Federal Medicare or Medicaid Payment Mandate -
Category 1
ZL Federal Medicare or Medicaid Payment Mandate -
Category 2
ZM Federal Medicare or Medicaid Payment Mandate -
Category 3
ZN Federal Medicare or Medicaid Payment Mandate -
Category 4
ZO Federal Medicare or Medicaid Payment Mandate -
Category 52","Hardcode as ""AU""",NA,,
2100,AMT02,Claim Supplemental Information Amount,R,"Min - 1
Max - 18",,Map this value from the DFF index 2.053,Prompt Pay Discount,This mapping required when the amount is greater than zero.,
2100,AMT01,Amount Qualifier Code,R,"Min - 1
Max - 3","AU Coverage Amount
D8 Discount Amount
DY Per Day Limit
F5 Patient Amount Paid
I Interest
NL Negative Ledger Balance
T Tax
T2 Total Claim Before Taxes
ZK Federal Medicare or Medicaid Payment Mandate -
Category 1
ZL Federal Medicare or Medicaid Payment Mandate -
Category 2
ZM Federal Medicare or Medicaid Payment Mandate -
Category 3
ZN Federal Medicare or Medicaid Payment Mandate -
Category 4
ZO Federal Medicare or Medicaid Payment Mandate -
Category 52","Hardcode as ""I""",NA,,
2100,AMT02,Claim Supplemental Information Amount,R,"Min - 1
Max - 18",,Map this value from the DFF index 2.052,Interest Amounts,,
2100,QTY,Claim Supplemental Information Quantity,S,,,,,,
2100,QTY01,Quantity Qualifier,R,"Min - 2
Max - 2","CA Covered - Actual
CD Co-insured - Actual
LA Life-time Reserve - Actual
LE Life-time Reserve - Estimated
NE Non-Covered - Estimated
NR Not Replaced Blood Units
OU Outlier Days
PS Prescription
VS Visits
ZK Federal Medicare or Medicaid Payment Mandate -
Category 1
ZL Federal Medicare or Medicaid Payment Mandate -
Category 2
ZM Federal Medicare or Medicaid Payment Mandate -
Category 3
ZN Federal Medicare or Medicaid Payment Mandate -
Category 4
ZO Federal Medicare or Medicaid Payment Mandate -
Category 5",NA,NA,,
2100,QTY02,Quantity,R,"Min - 1
Max - 15",,NA,NA,,
LOOP 2110 Service Payment Information,,,,,,,,,
2110,SVC,SERVICE PAYMENT INFORMATION,S,,,,,,
2110,SVC01,"COMPOSITE MEDICAL PROCEDURE
IDENTIFIER",R,"Min -
Max -",,NA,NA,,
2110,SVC01-1,Product/Service ID Qualifier,R,"Min - 2
Max - 2","AD American Dental Association Codes
ER Jurisdiction Specific Procedure and Supply Codes
HC Health Care Financing Administration Common
HP Health Insurance Prospective Payment System
IV Home Infusion EDI Coalition (HIEC) Product/Service
Code
N4 National Drug Code in 5-4-2 Format
N6 National Health Related Item Code
NU National Uniform Billing Committee (NUBC) UB92
Codes
UI U.P.C. Consumer Package Code (1-5-5)
WK Advanced Billing Concepts (ABC) Codes","If the procedure code(3.007) is present in DFF, then we need to Hardcode as ""HC""
Else If the procedure code (3.007) is blank and revenue code is present in index 3.034 then we need hardcode as ""NU""",NA,,
2110,SVC01-2,Product/Service ID,R,"Min - 1
Max - 48",,"If the procedure code is present Map this value from the DFF index 3.007
Else If the procedure code is blank and revenue code is present Map the value from the DFF index 3.034",ProcedureCode,,
2110,SVC01-3,PROCEDURE MODIFIER,S,"Min - 2
Max - 2",,Map this value from the DFF index 3.031,Procedure Modifier,,
2110,SVC01-4,PROCEDURE MODIFIER 2,S,"Min - 2
Max - 2",,Map this value from the DFF index 3.031.1,Procedure Modifier 2,,
2110,SVC01-5,PROCEDURE MODIFIER 3,S,"Min - 2
Max - 2",,Map this value from the DFF index 3.031.2,Procedure Modifier 3,,
2110,SVC01-6,PROCEDURE MODIFIER 4,S,"Min - 2
Max - 2",,Map this value from the DFF index 3.031.3,Procedure Modifier 4,,
2110,SVC01-7,Procedure Code Description,NA,NA,NA,NA,NA,,
2110,SVC02,Monetary Amount,R,"Min - 1
Max - 18",,Map this value from the DFF index 3.010,ChargeAmount,,
2110,SVC03,Monetary Amount,R,"Min - 1
Max - 18",,Map this value from the DFF index 3.019,PaidAmount,,
2110,SVC04,NUBC Revenue Code,S,"Min - 1
Max - 48",,When the procedure code is present and revenue code is present then Map SVC04 from the DFF index 3.034,Revenue Code,,
2110,SVC05,Units of Service Paid Count,S,"Min - 1
Max - 15",,Map this value from the DFF index 3.024,Units,The SVC05(Paid Units) required when the paid units of service are different than one if not required,
2110,SVC06-1,PRODUCT/SERVICE ID QUALIFIER,R,"Min - 2
Max - 2","AD American Dental Association Codes
ER Jurisdiction Specific Procedure and Supply Codes
HC Health Care Financing Administration Common
Procedural Coding System (HCPCS) Codes
HP Health Insurance Prospective Payment System
(HIPPS) Skilled Nursing Facility Rate Code
IV Home Infusion EDI Coalition (HIEC) Product/Service
Code
N4 National Drug Code
NU National Uniform Billing Committee (NUBC) UB92
Codes
WK Advanced Billing Concepts (ABC) Codes",Map this value from the DFF index 3.043,"Place holder for Submitted Product/Service id qualifier

Mapped based on getPaymentDetailsByIDResponse/paymentDetails/heexns:paymentExtract/eopPayment/eopClaimDetails/claim/claimLine/claimLine/serviceCode",Map SVC06 only when the valuein 3.007 is different from 3.044 (Service code),"PSD Ticket#502, 500, 499 based upon grooming call dated 11/7 , we are working along with IPlus team to analyse the feasiblity"
2110,SVC06-2,Procedure Code,R,"Min - 1
Max - 48",,Map this value from the DFF index 3.044,"Place holder for Submitted ProcedureCode

getPaymentDetailsByIDResponse/paymentDetails/heexns:paymentExtract/eopPayment/eopClaimDetails/claim/claimLine/claimLine/serviceCode",,
2110,SVC06-3,Procedure Modifier 1,S,"Min - 2
Max - 2",,Map this value from the DFF index 3.045,"Place holder for Submitted Procedure Modifier

getPaymentDetailsByIDResponse/paymentDetails/heexns:paymentExtract/eopPayment/eopClaimDetails/claim/claimLine/claimLine/modifierList",,
2110,SVC06-4,Procedure Modifier 2,S,"Min - 2
Max - 2",,Map this value from the DFF index 3.046,"Place holder for Submitted Procedure Modifier 2

getPaymentDetailsByIDResponse/paymentDetails/heexns:paymentExtract/eopPayment/eopClaimDetails/claim/claimLine/claimLine/modifierList",,
2110,SVC06-5,Procedure Modifier 3,S,"Min - 2
Max - 2",,Map this value from the DFF index 3.047,"Place holder for Submitted Procedure Modifier 3

getPaymentDetailsByIDResponse/paymentDetails/heexns:paymentExtract/eopPayment/eopClaimDetails/claim/claimLine/claimLine/modifierList",,
2110,SVC06-6,Procedure Modifier 4,S,"Min - 2
Max - 2",,Map this value from the DFF index 3.048,"Place holder for Submitted Procedure Modifier 4

getPaymentDetailsByIDResponse/paymentDetails/heexns:paymentExtract/eopPayment/eopClaimDetails/claim/claimLine/claimLine/modifierList",,
2110,SVC06-7,Procedure Code Description,S,"Min - 1
Max - 80",,NA,NA,,
2110,SVC07,Original Units of Service Count,S,"Min - 1
Max - 15",,Map this value from the DFF index 3.036,Original Units,The SVC07(Submitted Units) required when the paid unites of service provided in SVC05 is different from the submitted units of service from the original claim.,
2110,DTM,Service Start Date,S,,,,,,
2110,DTM01,Date Time Qualifier,R,"Min - 3
Max - 3",150 Service Period Start,"Hardcode as ""150""",NA,"1) Format the date to the below format ""YYYYMMDD""
2) If 3.005 and 3.006 same then map the DTM segment with qualifier 472(Rows 364 and 365).
Else If 3.005 is not equal to 3.006 Map the DTM segment with qualifiers 150 and 151(Rows 358 till 362)",
2110,DTM02,Service Date,R,"Min - 8
Max - 8",,Map this value from the DFF index 3.005,FromDate,,
2110,DTM,Service End Date,S,,,NA,NA,,
2110,DTM01,Date Time Qualifier,R,"Min - 3
Max - 3",151 Service Period End,"Hardcode as ""151""",NA,,
2110,DTM02,Service End Date,R,"Min - 8
Max - 8",,Map this value from the DFF index 3.006,ToDate,,
2110,DTM,Service Date,S,,,,,,
2110,DTM01,Date Time Qualifier,R,"Min - 3
Max - 3",472 Service,"Hardcode as ""472""",NA,,
2110,DTM02,Service Date,R,"Min - 8
Max - 8",,"Date format ""YYYYMMDD""",NA,,
2110,CAS,Service Adjustment,S,,,,,,
2110,CAS01,Claim Adjustment Group Code,R,"Min - 1
Max - 2","CO Contractual Obligations
OA Other adjustments
PI Payor Initiated Reductions",Map this value from the DFF index 4.011,CAGC,,
2110,CAS02,Claim Adjustment Reason Code,R,"Min - 1
Max - 5",,Map this value from the DFF index 4.009,CARC,,
2110,CAS03,Monetary Amount,R,"Min - 1
Max - 18",,Map this value from the DFF index 4.008,835 Adjusted Amount,,
2110,CAS04,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2110,CAS05,Claim Adjustment Reason Code,S,"Min - 1
Max - 2",,Map the same logic present in Rows 367 and 368,Map the same logic present in Rows 367 and 368,,
2110,CAS06,Monetary Amount,S,"Min - 1
Max - 18",,,,,
2110,CAS07,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2110,CAS08,Claim Adjustment Reason Code,S,"Min - 1
Max - 2",,Map the same logic present in Rows 367 and 368,Map the same logic present in Rows 367 and 368,,
2110,CAS09,Monetary Amount,S,"Min - 1
Max - 18",,,,,
2110,CAS10,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2110,CAS11,Claim Adjustment Reason Code,S,"Min - 1
Max - 2",,Map the same logic present in Rows 367 and 368,Map the same logic present in Rows 367 and 368,,
2110,CAS12,Monetary Amount,S,"Min - 1
Max - 18",,,,,
2110,CAS13,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2110,CAS14,Claim Adjustment Reason Code,S,"Min - 1
Max - 2",,Map the same logic present in Rows 367 and 368,Map the same logic present in Rows 367 and 368,,
2110,CAS15,Monetary Amount,S,"Min - 1
Max - 18",,,,,
2110,CAS16,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2110,CAS17,Claim Adjustment Reason Code,S,"Min - 1
Max - 2",,Map the same logic present in Rows 367 and 368,Map the same logic present in Rows 367 and 368,,
2110,CAS18,Monetary Amount,S,"Min - 1
Max - 18",,,,,
2110,CAS19,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2110,REF,Service Identification,S,,,,,,
2110,REF01,Reference Identification Qualifier,R,"Min - 2
Max - 3","1S Ambulatory Patient Group (APG) Number
APC Ambulatory Payment Classification
BB Authorization Number
E9 Attachment Code
G1 Prior Authorization Number
G3 Predetermination of Benefits Identification Number
LU Location Number
RB Rate code number",NA,NA,,
2110,REF02,Provider Identifier,R,"Min - 1
Max - 50",,NA,NA,,
2110,REF,Line Item Control Number,S,,,,,,
2110,REF01,Reference Identification Qualifier,R,"Min - 2
Max - 3",6R Provider Control Number,"Hardcode as ""6R""",NA,,
2110,REF02,Reference Identification,R,"Min - 1
Max - 50",,Map this value from the DFF index 3.037,Line Item Control Number,,
2110,REF,Rendering Provider Information,S,,,,,,
2110,REF01,Reference Identification Number,R,"Min - 2
Max - 3","0B State License Number
1A Blue Cross Provider Number
1B Blue Shield Provider Number
1C Medicare Provider Number
1D Medicaid Provider Number
1G Provider UPIN Number
1H CHAMPUS Identification Number
1J Facility ID Number
D3 National Council for Prescription Drug Programs
G2 Provider Commercial Number
HPI Centers for Medicare and Medicaid Services
National Provider Identifier
SY Social Security Number
TJ Federal Taxpayer’s Identification Number",NA,NA,,
2110,REF02,Rendering Provider Federal ID,R,"Min - 1
Max - 50",,NA,NA,"Corresponding identifier, Federal ID differs from provider to provider.",
2110,REF,HealthCare Policy Identification,S,,,,,,
2110,REF01,Reference Identification Qualifier,R,"Min - 2
Max - 3",0K Policy Form Identifying Number,NA,NA,,
2110,REF02,Reference Identification,R,"Min - 1
Max - 50",,NA,NA,,
2110,AMT,Service Supplemental Amount,S,,,,,,
2110,AMT01,Amount Qualifier Code,R,"Min - 1
Max - 3","B6 Allowed - Actual
KH Deduction Amount
T Tax
T2 Total Claim Before Taxes
ZK Federal Medicare or Medicaid Payment Mandate -
Category 1
ZL Federal Medicare or Medicaid Payment Mandate -
Category 2
ZM Federal Medicare or Medicaid Payment Mandate -
Category 3
ZN Federal Medicare or Medicaid Payment Mandate -
Category 4
ZO Federal Medicare or Medicaid Payment Mandate -
Category 5","Hardcode as ""B6""",NA,,
2110,AMT02,Service Line Allowed Amount,R,"Min - 1
Max - 18",,Map this value from the DFF index 3.033,Allowed Amount,This mapping required when the amount is greater than zero.,
2110,QTY,Service Supplemental Quantity,S,,,,,,
2110,QTY01,Quantity Qualifier,R,"Min - 2
Max - 2","ZK Federal Medicare or Medicaid Payment Mandate -
Category 1
ZL Federal Medicare or Medicaid Payment Mandate -
Category 2
ZM Federal Medicare or Medicaid Payment Mandate -
Category 3
ZN Federal Medicare or Medicaid Payment Mandate -
Category 4
ZO Federal Medicare or Medicaid Payment Mandate -
Category 5",NA,NA,,
2110,QTY02,Quantity,R,"Min - 1
Max - 15",,NA,NA,,
2110,LQ,Health Care Remark Code,S,,,,,,
2110,LQ01,Service Line Remittance Remark Code 1,R,"Min - 1
Max - 3","HE Claim Payment Remark Codes
RX National Council for Prescription Drug Programs","Hardcode as ""HE""",NA,,
2110,LQ02,Service Line Remittance Remark Code 2,R,"Min - 1
Max - 30",,Map this value from the DFF index 4.01,RARC,,
2110,PLB,Provider Adjustment,S,,,,,,
2110,PLB01,Provider Identifier,R,"Min - 1
Max - 50",,Map this value from the DFF index 1.033,Payee NPI,,
2110,PLB02,Fiscal Period Date,R,"Min - 8
Max - 8",,System Date YYYYMMDD format - December 31 of current year for example - 20231231,NA,"Last day of provider’s fiscal year(Financial Year) in YYYYMMDD format; if not known, December 31 of current year. (adjustment for the whole bill payment, monthly rebate , over payment )",
2110,PLB03-1,PROVIDER ADJUSTMENT REASON CODE,R,"Min - 2
Max - 2",20,Map this value from the DFF index 4.007,ProviderAdjustmentCode,,
2110,PLB03-2,Provider Adjustment Identifier,R,"Min - 1
Max - 50",,Map this value from the DFF index 4.013,PLB Identifier,,
2110,PLB04,Provider Adjustment Amount,R,"Min - 1
Max - 18",,Map this value from the DFF index 4.008,835 Adjusted Amount,,
2110,PLB05,Provider Adjustment Identifier,S,"Min - 1
Max - 50",,NA,NA,,
2110,PLB05-1,PROVIDER ADJUSTMENT REASON CODE,S,"Min - 2
Max - 2",,NA,NA,,
2110,PLB05-2,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2110,PLB06,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2110,PLB07,ADJUSTMENT IDENTIFIER,S,"Min - 1
Max - 50",,NA,NA,,
2110,PLB07-1,Adjustment Reason Code,S,"Min - 2
Max - 2",,NA,NA,,
2110,PLB07-2,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2110,PLB08,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2110,PLB09,ADJUSTMENT IDENTIFIER,S,"Min - 1
Max - 50",,NA,NA,,
2110,PLB09-1,Adjustment Reason Code,S,"Min - 2
Max - 2",,NA,NA,,
2110,PLB09-2,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2110,PLB010,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2110,PLB11,ADJUSTMENT IDENTIFIER,S,"Min - 1
Max - 50",,NA,NA,,
2110,PLB11-1,Adjustment Reason Code,S,"Min - 2
Max - 2",,NA,NA,,
2110,PLB11-2,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2110,PLB12,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2110,PLB13,ADJUSTMENT IDENTIFIER,S,"Min - 1
Max - 50",,NA,NA,,
2110,PLB13-1,Adjustment Reason Code,S,"Min - 2
Max - 2",,NA,NA,,
2110,PLB13-2,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2110,PLB14,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
SE - TRANSACTION SET TRAILER,,,,,,,,,
,SE,Transaction Set Trailer,R,,,,,,
,SE01,Number Of Included Segments,R,"Min - 1
Max - 10",,"Total number of segments included in a transaction set including ST and SE
segments",NA,,
,SE02,Transaction Set Control Number,R,"Min -
Max -",,STO2 Value,NA,,
,GE,Functional Group Trailer,R,,,,,,
,GE01,Number of Transaction Sets Included,R,"Min -
Max -",,"Total number of transaction sets included in the functional group or interchange
(transmission) group terminated by the trailer containing this data element",NA,,
,GE02,Group Control Number,R,"Min -
Max -",,GS06 Value,NA,,
Interchange Control Loop (End),,,,,,,,,
,IEA,Interchange Control Trailer,R,,,,,,
,IEA01,Number of Included Functional Groups,R,"Min -
Max -",,A count of the number of functional groups included in an interchange,NA,,
,IEA02,Interchange Control Number,R,"Min -
Max -",,ISA13 Value,NA,,
```

## Payment OB/V26.1.0.0/EdifecsProduct_Mapping Spec_OutboundPayment_835_DFF_to_EDIConversion_V2.0.xlsx — Payment Extract

```csv
Record Type 1 Payment Level Information,,,,,,
,,,,,,
INDEX,DATA ELEMENT,DATA TYPE,REQ,DESCRIPTION,Highmark Comments,UST
1.001,Record,Varchar(4),Required,0001,,
1.002,BatchKey,Varchar(75),Required,See key generation,,
1.003,CheckNumberPrefix,Varchar(4),Optional,The prefix for the check number assigned to the check.,,
1.004,CheckNumber,Varchar(25),Optional,The check number assigned to the check.,,
1.005,CheckDate,Date,Optional,The check date MMDDYYYY,,
1.006,CheckAmount,Money,Required,The numeric payment for the check,,
1.007,FractionTransitNumber,Varchar(25),Optional,"The Fractional Transit Number for the bank, as held in Fund Accounting for the applicable account for the group.",,
1.008,MICRTransitNumber,Varchar(9),Required,"The MICR Transit Number for the bank, as held in Fund Accounting for the applicable account for the group.",,
1.009,AccountNumber,Varchar(255),Required,"The Bank Account Number for the bank, as held in Fund Accounting for the applicable account for the group.",,
1.010,BankName,Varchar(255),Required,The Bank Name,,
1.011,BankAddress1,Varchar(255),Optional,The first bank address field,,
1.012,BankAddress2,Varchar(255),Optional,The second bank address field,,
1.013,BankCity,Varchar(255),Optional,The city for the bank,,
1.014,BankState,Varchar(2),Optional,The state for the bank,,
1.015,BankZip,Varchar(10),Optional,The zip for the bank,,
1.016,BankCountry,Varchar(255),Optional,The country code for the bank,,
1.017,PayeeName,Varchar(255),Required,The payee name. This is the recipient for the check.,,
1.018,PayeeAddress1,Varchar(255),Required,The first address line for the payee,,
1.019,PayeeAddress2,Varchar(255),"Required, if available",The second address line for the payee,Missing in the sample PNC extract,If address Line 2 is available in HRP this will be populated
1.020,PayeeCity,Varchar(255),Required,The city for the payee,,
1.021,PayeeState,Varchar(2),Required,The state for the payee,,
1.022,PayeeZip,Varchar(10),Required,The zip for the payee,,
1.023,PayeeCountry,Varchar(255),Required,The country for the payee,,
1.024,SpecHandle,Varchar(10),Optional,"Special Handling for the payment, i.e. reinsurance",,
1.025,ResponseType,Varchar(10),Optional,"Indicates the original response provided by payment vendor in the Response File (2). Valid values are: Payment, 835Only, None.",Missing in the sample PNC extract,This was a required field for another client. For 835 generation this is not used. Marked as optional field
1.026,PPO Network Contract Identifier,Varchar(3),Optional,"(If Available)PPO Contract Identifier from ClaimHeader. For provider voucher processing, it is assumed that the first non-blank PPO Contract Identifier will be communicated (if available).",Missing in the sample PNC extract,This was a required field for another client. For 835 generation this is not used. Marked as optional field
1.027,Provider Phone Number,Varchar(15),Optional,,,
1.028,Provider Email,Varchar(100,Optional,,,
1.029,Provider Type,Varchar(50),Optional,Provider taxonomy code,,
1.030,Provider TIN Sequence Code,Varchar(10),Optional,Sequence code for the payee provider,Missing in the sample PNC extract,This was a required field for another client. For 835 generation this is not used. Marked as optional field
1.031,Paid To,Varchar(1),Required,"if Fully Funded Paid To (E=Employee, D=Dependent, M = Member, P=Provider, S=Split pay)",,
1.032,Payee SSN/TIN,Varchar(9),Required,(if Member Payment) Payee SSN or TIN,,
1.033,Payee NPI,Int,Required,(If Available) The NPI for the payee provider,,
,,,,,,
,,,,,,
,,,,,,
Record Type 2 Claim Level Information,,,,,,
,,,,,,
INDEX,Data Element,Data Type,REQ,Description,,
2.001,Record,Varchar(4),Required,002,,
2.002,BatchKey,Varchar(75),Required,See key generation,,
2.003,ClaimNumber,Varchar(50),Required,The claim number assigned for the claim.,,
2.004,EOBNumber,Varchar(10),Optional,The EOB number assigned for the claim.,,
2.005,PatientID,Varchar(30),Required,The patient account number for the claim. This is assigned by the provider (ie. SSN),,
2.006,PatientName,Varchar(255),Required,The patient's name,,
2.007,PatientDOB,Date,Optional,The patient's Date of Birth.   MMDDYYYY,Missing in the sample PNC file,Marking as optional as it is not used for 835 mapping
2.008,ParticipantKey,Varchar(30),Optional,The insured's employee number Enrollee Member ID,Missing in the sample PNC file,Marking as optional as it is not used for 835 mapping
2.009,ParticipantName,Varchar(255),Optional,The insured's name,,
2.01,ParticipantAddress1,Varchar(255),Optional,The first address line for the insured,,
2.011,ParticipantAddress2,Varchar(255),Optional,The second address line for the insured,,
2.012,ParticipantCity,Varchar(255),Optional,The city for the insured,,
2.013,ParticipantState,Varchar(2),Optional,The state for the insured,,
2.014,ParticipantZip,Varchar(10),Optional,The zip for the insured,,
2.015,ParticipantCountry,Varchar(255),Optional,The country for the insured,,
2.016,ProviderNPI,Int,Required (If Available),The NPI for the provider of service,Missing in the sample PNC file,Available in the sample file.
2.017,ProviderTIN,Varchar(9),Required (If Available),The TIN for the provider of service,Missing in the sample PNC file,
2.017.1,Provider TIN Sequence Code,Varchar(7),Required (If Available),Sequence code for the providers,Missing in the sample PNC file,
2.018,ProviderName,Varchar(255),Required (If Available),The provider's name,Missing in the sample PNC file,
2.019,ProviderAddress1,Varchar(255),Required (If Available),The first address line for the provider,Missing in the sample PNC file,
2.02,ProviderAddress2,Varchar(255),Required (If Available),The second address line for the provider,Missing in the sample PNC file,
2.021,ProviderCity,Varchar(255),Required (If Available),The city for the provider,Missing in the sample PNC file,
2.022,ProviderState,Varchar(2),Required (If Available),The state for the provider,Missing in the sample PNC file,
2.023,ProviderZip,Varchar(10),Required (If Available),The zip for the provider,Missing in the sample PNC file,
2.024,ProviderCountry,Varchar(255),Required (If Available),The country for the provider,Missing in the sample PNC file,
2.025,GroupCode,Varchar(30),Required (If Available),The Group number for the insured,Missing in the sample PNC file,
2.026,GroupSubCode,Varchar(30),Required (If Available),The Sub Group number for the insured,,
2.027,GroupName,Varchar(255),Required (If Available),The group name for the insured.,,
2.028,ChargeAmount,Money,Required,"The amount billed, for all service lines for this claim.",,
2.029,PPODiscountAmount,Money,Required (If Available),"The PPO discount amount, for all service lines for this claim.",Missing in the sample PNC file,
2.03,RNCDiscountAmount,Money,Required (If Available),"The Reasonable and customary amount, for all service lines for this claim.",Missing in the sample PNC file,
2.031,COBAmount,Money,Required (If Available),"The COB amount, for all service lines for this claim for this claim",Missing in the sample PNC file,
2.032,DeductableAmount,Money,Required (If Available),The total amount applied to a deductible for all service lines for this claim,Missing in the sample PNC file,
2.033,CoInsuranceAmount,Money,Required (If Available),The total amount of Co -Insurance for all service lines for this claim,Missing in the sample PNC file,
2.034,CopayAmount,Money,Required (If Available),The total amount of the co-pay for all service lines for this claim,Missing in the sample PNC file,
2.035,SumDedCoinsCopayAmount,Money,Required (If Available),"The SUM of all Deductible Amounts, Co - Insurance, and CoPay for all service lines for this claim.",Missing in the sample PNC file,
2.036,OtherAdjustmentsAmount,Money,Required (If Available),The total amount of all other adjustments for all service lines for this claim. This will include all other adjustments not mentioned individually above.,Missing in the sample PNC file,
2.037,PaidAmount,Money,Required,"The total plan paid amount, for all service lines for this claim.",,
2.038,PatientOwedAmount,Money,Required (If Available),The employee responsibility for the service line,Missing in the sample PNC file,
2.039,PatientPaidAmountTotal,Money,Required (If Available),"The total patient paid amount, for all service lines for this claim.",,
2.04,ClaimStatusCode,Varchar(5),Required (If Available),"Determined based on whether it is a primary paid, denied, or reversal claim, etc. (1, 4, 22, etc.).",,
2.041,AlternateProcedureCode,Varchar(15),Required (If Available),Alternate Procedure Code/DRG. For Institutional Claims with DRG code.,Missing in the sample PNC file,
2.042,CoverageExpiration,Date,Required (If Available),Expiration date of patient’s coverage.,Missing in the sample PNC file,
2.043,AdjudicationAllowedAmount,Money,Required (If Available),This value is calculated as (Charge) minus (PPO Discount/RNC Discount) minus (Ineligible Amounts).,Missing in the sample PNC file,
2.044,Provider NAIC Code,Varchar(255),Required (If Available),National Association of Insurance Commissioners (NAIC) Code,Missing in the sample PNC file,
2.045,Corrected Patient/Insured Name,Varchar(255),Required (If Available),Corrected information about the patient or insured.,Missing in the sample PNC file,
2.046,Corrected Patient/Insured Member ID,Varchar(255),Required (If Available),Insured's Changed Unique Identification Number,Missing in the sample PNC file,
2.047,Corrected Priority Payer Name,Varchar(255),Required (If Available),Another payer has priority for making a payment and the claim is not being automatically transferred to that payer. This is the name of the new priority payer.,Missing in the sample PNC file,
2.048,Corrected Priority Payer NAIC or TIN,Varchar(255),Required (If Available),Another payer has priority for making a payment and the claim is not being automatically transferred to that payer. This is the unique id of the new priority payer.,Missing in the sample PNC file,
2.049,Corrected Priority Payer Subscriber Name,Varchar(255),Required (If Available),Another payer has priority for making a payment and the claim is not being automatically transferred to that payer. This is the name of the subscriber with the new priority payer.,Missing in the sample PNC file,
2.05,Corrected Priority Payer Subscriber Member Id,Varchar(255),Required (If Available),Another payer has priority for making a payment and the claim is not being automatically transferred to that payer. This is the name of the subscriber id the new priority payer.,Missing in the sample PNC file,
2.051,Claim Received Date,Date,Required,This is the date that the claim was received by the payer.,,
2.052,Interest Amounts,Money,Not Required,Use this monetary amount for the interest amount,Missing in the sample PNC file,This is not required field
2.053,Prompt Pay Discount,Money,Required (If Available),,Missing in the sample PNC file,
2.054,Over Coinsurance Maximum Amount,Money,Required (If Available),This is the total over coinsurance maximum ineligible amounts for the claim,Missing in the sample PNC file,
2.055,Over Benefit Maximum Amount,Money,Required (If Available),This is the total over benefit maximum ineligible amounts for the claim,Missing in the sample PNC file,
2.056,Over Period A Maximum Amount,Money,Required (If Available),This is the total Period A maximum ineligible amounts for the claim,Missing in the sample PNC file,
2.057,Over Period B Maximum Amount,Money,Required (If Available),This is the total Period B maximum ineligible amounts for the claim,Missing in the sample PNC file,
2.058,Miscellaneous Ineligible Amount,Money,Required (If Available),This is the total of any ineligible amounts not otherwise defined for the claim,Missing in the sample PNC file,
2.059,PPO Network Contract Identifier,Varchar(3),Required (If Available),"PPO Contract Identifier from Claim Header.  For provider voucher processing, this field may contain a different value than the value sent in the Pre-Pass record since there may be multiple record type 0002 records per voucher payment (if available).",Missing in the sample PNC file,
2.06,Provider Type,Varchar(50),Optional,Provider taxonomy code,Missing in the sample PNC file,
2.061,Facility Code Value,Varchar(50),Required (If Available),"Code identifying where services were, or may be, performed; the first and second positions of the Uniform Bill Type Code for Institutional Services or the Place of Service Codes for Professional or Dental Services. Loop 2100 CLP08 from the 835 specifications. Since professional or dental claims can have different place of service codes for services within a single claim, default to the place of service of the first service line when the service lines are not all for the same place of service. This number was received in CLM05-1 of the 837 claims.",,
2.062,From Date,DateTime,Required (If Available),"2100 DTM FROM AND TO DATES. Claim service date, may be overridden at the service level.
Required when the “Statement From or To Dates” are not supplied at the service (2110 loop) level. Dates at the claim level apply to the entire claim, including all service lines. Dates at the service line level apply only to the service line where they appear. When claim dates are not provided, service dates are required for every service line. When claim dates are provided, service dates are not required, but if used they override the claim dates for individual service lines. If the claim statement period start date is conveyed without a subsequent claim statement period end date, the end date is assumed to be the same as the start date.",Missing in the sample PNC file,
2.063,To Date,DateTime,Optional,"2100 DTM FROM AND TO DATES. Claim service date, may be overridden at the service level.
Required when the “Statement From or To Dates” are not supplied at the service (2110 loop) level. Dates at the claim level apply to the entire claim, including all service lines. Dates at the service line. level apply only to the service line where they appear. When claim dates are not provided, service dates are required for every service line. When claim dates are provided, service dates are not required, but if used they override the claim dates for individual service lines.",Missing in the sample PNC file,
2.064,Claim Filing Indicator Code,Varchar(5)`,Required (If Available),"Loop 2100 CLP06 For many providers to electronically post the 835remittance data to their patient accounting systems without human intervention, a unique, provider-specific insurance plan code is needed. This code allows the provider to separately identify and manage the different product lines or contractual arrangements between the payer and the provider. Because most payers maintain the same Originating Company Identifier in the TRN03 or BPR10 for all product lines or contractual relationships, the CLP06 is used by the provider as a table pointer in combination with the TRN03 or BPR10 to identify the unique, provider-specific insurance plan code needed to post the payment without human intervention. The value should mirror the value received in the original claim (2-005 SBR09 of the 837), if applicable, or provide the value as assigned or edited by the payer. For example, the BL from the SBR09 in the 837 would be returned as 12, 13, 15, in the 835 when more details are known. The 837 SBR09 code CI (Commercial Insurance) is generic, if through adjudication the specific type of plan is obtained a more specific code must be returned in the 835.
12  Preferred Provider
Organization (PPO)
13  Point of Service (POS)
14  Exclusive Provider Organization
(EPO)
15  Indemnity Insurance
16  Health Maintenance
Organization (HMO) Medicare
Risk
17  Dental Maintenance
Organization
AM Automobile Medical
CH Champus
DS Disability
HM Health Maintenance
Organization
LM Liability Medical
MA Medicare Part A
MB Medicare Part B
MC Medicaid
OF Other Federal Program 1049 Use this code for the Black Lung Program.
TV Title V
VA Veterans Affairs Plan
WC Workers’ Compensation
Health Claim
ZZ Mutually Defined",,
2.065,Discharge Fraction,"Decimal(3,2)",Required (If Available),"Loop 2100 CLP13 Percentage expressed as a decimal (e.g., 0.0 through 1.0 represents 0% through
100%). Required when a discharge
fraction was applied in the adjudication process.",Missing in the sample PNC file,
2.066,Patient Type Identifier,Varchar(2),Required (If Available),“I” for inpatient and “O” for outpatient. Needed for RARC reporting.,Missing in the sample PNC file,
2.067,Original Reference Number,Varchar(50),Required (If Available),"When this is a correction claim and CLP07 does not equal the CLP07 value from the original claim payment, one iteration of this REF segment using this qualifier is REQUIRED to identify the original claim CLP07 value in REF02. See section 1.10.2.8, Reversals and Corrections, for additional information.",Missing in the sample PNC file,
2.068,DRG Weight,Varchar(15),Required (If Available),Loop 2100 CLP12. The average diagnosis-related group (DRG) weight.,Missing in the sample PNC file,
2.069,Diagnosis Related Group Code,Varchar(4),Required (If Available),"Loop 2100 CLP11. Code indicating a patient’s diagnosis group based on a patient’s illness, diseases, and medical problems. Required for institutional claims when the claim was adjudicated using a DRG.",Missing in the sample PNC file,
2.07,Other Subscriber Name,Varchar(100),Required (If Available),"2100 NM1.  LAST, FIRST. This is the name and ID number of the other subscriber when a corrected priority payer has been identified. When used, either the name or ID must be supplied. Required when a corrected priority payer has been identified in another NM1 segment AND the name or ID of the other subscriber is known. If not required by this implementation guide, do not send.",Missing in the sample PNC file,
2.071,CDHP Type,Nvarchar(3),Optional,"Possible Values:
DEP
FSA
HRA
LFS
TMT
TPC
TPR

Populated when a claim is a CDHP claim to indicate CDHP status.",Missing in the sample PNC file,
2.072,Relationship Code,Varchar(5),Optional,Code representing relationship of insured to patient,Missing in the sample PNC file,
2.073,Alternate Provider ID,Varchar(50),Required (If Available),Required when additional rendering provider identification numbers not already reported in the Provider NM1 segment for this claim were submitted on the original claim and impacted adjudication.,Missing in the sample PNC file,
2.074,Crossover Carrier Name,Varchar(255),Required (If Available),"Required when the claim is transferred to another carrier or coverage (CLP02 equals 19, 20, 21 or 23).",Missing in the sample PNC file,
2.075,Crossover Carrier NAIC or TIN,Varchar(255),Required (If Available),"Required when the claim is transferred to another carrier or coverage (CLP02 equals 19, 20, 21 or 23).",Missing in the sample PNC file,
2.076,Claim Contact Telephone,Varchar(256),Required (If Available),Required when there is a claim specific communications contact.,Missing in the sample PNC file,
2.077,Tax Amount,Money,Required (If Available),Required when tax is non-zero.,Missing in the sample PNC file,
2.078,Total Claim Before Tax,Money,Required (If Available),Used only when tax also applies to the claim.,Missing in the sample PNC file,
2.079,Patient Control Number,,Required,Patient Control Number,,
2.080,Patient Last name,,Required,Last name,,
2.081,Patient First name,,Required,First Name,,
2.082,Patient Middle name,,Required,Middle Name,,
2.083,Frequency Code,,Required,Frequency  Code,,
2.084,SubmittedPatientID,Varchar(30),Required,Patient member ID as originally submitted in the claim,,
2.085,SubmittedPatientFirstName,Varchar(255),Required,First Name as originally submitted in the claim,,
2.086,SubmittedPatientMiddleName,Varchar(255),Required,Middle Name as originally submitted in the claim,,
2.087,SubmittedPatientLastName,Varchar(255),Required,Last name as originally submitted in the claim. This will be used to send the submitted patient Full Name as it is in HRDW database.,,
2.088,SubscriberID,Varchar(30),Required,Subscriber ID if the patient is not subscriber,,
2.089,SubscriberFirstName,Varchar(255),Required,Subscriber First Name if the patient is not subscriber,,
2.090,SubscriberMiddleName,Varchar(255),Required,Subscriber Middle Name if the patient is not subscriber,,
2.091,SubscriberLastName,Varchar(255),Required,Subscriber Last Name if the patient is not subscriber,,
2.092,PractitionerFirstName,varchar(107),Required (If Available),Practitioner First Name from the Claim,,
2.093,PractitionerMiddleName,varchar(107),Required (If Available),Practitioner Middle Initial from the Claim,,
2.094,PractitionerLastName,varchar(107),Required (If Available),Practitioner last name from the Claim,,
,,,,,,
Record Type 3 Claim line Level Information,,,,,,
,,,,,,
INDEX,Data Element,Data Type,REQ,Description,,
3.001,Record,Varchar(4),Required,0003,,
3.002,BatchKey,Varchar(75),Required,See key generation,,
3.003,ClaimNumber,Varchar(50),Required,The claim number assigned for the claim.,,
3.004,ClaimLineNumber,Varchar(4),Required(If Available),The service line number is used to specify the order of the services rendered on the claim,,
3.005,FromDate,Date,Required (If Available),The incurred from date MMDDYYYY,,
3.006,ToDate,Date,Required (If Available),The incurred through date MMDDYYYY,,
3.007,ProcedureCode,Varchar(5),Required (If Available),The procedure code,,
3.008,ProcedureDescription,Varchar(40),Required (If Available),The procedure description,,
3.009,LayProcedureDescription,Varchar(40),Required (If Available),The layperson procedure description,Missing in the sample PNC file,
3.010,ChargeAmount,Money,Required,The amount billed for the serviceline,,
3.011,PPODiscountAmount,Money,Required(If Available),The discount amount for the service line,,
3.012,RNCDiscountAmount,Money,Required(If Available),The Reasonable and customaryamount for the service line,Missing in the sample PNC file,
3.013,COBAmount,Money,Required(If Available),The COB amount for the service line,Missing in the sample PNC file,
3.014,DeductableAmount,Money,Required(If Available),Any amount applied to the deductible for the service line,Missing in the sample PNC file,
3.015,CoInsuranceAmount,Money,Required (If Available),Co-Insurance Amount detail line,Missing in the sample PNC file,
3.016,CopayAmount,Money,Required (If Available),Co-Payment amount per detail line,Missing in the sample PNC file,
3.017,SumDedCoinsCopayAmount,Money,Required(If Available),"The SUM of all deductible amounts,Co-Insurance, and Co-Payment",Missing in the sample PNC file,
3.018,OtherAdjustmentsAmount,Money,Required(If Available),Any other adjustment amount perdetail line,Missing in the sample PNC file,
3.019,PaidAmount,Money,Required,The plan paid amount for the service line,,
3.020,PatientOwedAmount,Money,Required (If Available),The employee responsibility for the service line,Missing in the sample PNC file,
3.021,ServiceProviderName,Varchar(255),Conditional,Only required if the service providername is not the payee for the claim,Missing in the sample PNC file,
3.022,ServiceProviderNationalProviderID,Varchar(255),Conditional,Only required if the service provider ID is not the payee for the claim,,
3.023,Product/Service ID Qualifier,Varchar(255),Required,The database from which the procedure code is derived,Missing in the sample PNC file,This is not used for 835 mapping yet this will be populated if its available in HRP
3.024,Units,Int,Required (if available),Units on the claim line. This is required by HIPAA if units on the claim line are > 1,,
3.025,Previously Paid Amount,Money,Required (If Available),"The previously paid amount on the claim, for “underpayment reversal” claims. This amount corresponds tothe amount already paid on the claim, on a check that is NOT being reversed (although the claim in the adjudication system IS being reversed.",Missing in the sample PNC file,
3.026,Over Coinsurance Maximum Amount,Money,Required (If Available),This is the total over coinsurance maximum ineligible amounts for the claim,Missing in the sample PNC file,
3.027,Over Benefit Maximum Amount,Money,Required (If Available),This is the total over benefit maximum ineligible amounts for the claim,Missing in the sample PNC file,
3.028,Over Period A Maximum Amount,Money,Required (If Available),This is the total Period A maximum ineligible amounts for the claim,Missing in the sample PNC file,
3.029,Over Period B Maximum Amount,Money,Required (If Available),This is the total Period B maximum ineligible amounts for the claim,Missing in the sample PNC file,
3.030,Miscellaneous Ineligible Amount,Money,Required (If Available),This is the total of any ineligible amounts not otherwise defined for the claim,Missing in the sample PNC file,
3.031,Procedure Modifier,Varchar(60),Required (if applies),Loop 2110 SV01-3. This identifies the special circumstances related to the performance of the service.,Missing in the sample PNC file,
3.031.1,Procedure Modifier 2,Varchar(60),Required (if applies),Loop 2110 SV01-4. This identifies the special circumstances related to the performance of the service.,Missing in the sample PNC file,
3.031.2,Procedure Modifier 3,Varchar(60),Required (if applies),Loop 2110 SV01-5. This identifies the special circumstances related to the performance of the service.,Missing in the sample PNC file,
3.031.3,Procedure Modifier 4,Varchar(60),Required (if applies),Loop 2110 SV01-6. This identifies the special circumstances related to the performance of the service.,Missing in the sample PNC file,
3.032,Healthcare Policy ID,Varchar(50),Required(if available),"Loop 2110 REF02. Supply the Healthcare policy identifier as provided by the payer’s published Healthcare policy code list. This policy code will be used to explain the policy used to process the claim which resulted
in the adjusted payment.
Required when;
• The payment is adjusted in
accordance with the Payer’s
published Healthcare Policy Code
list and
•A Claim Adjustment Reason Code
identified by the notation, “refer to
835 Healthcare Policy identification
segment”, in the Claim Adjustment
Reason Code List is present in a
related CAS segment and
• The payer has a published
enumerated healthcare policy code
list available to healthcare
providers via an un-secure public
website.|",Missing in the sample PNC file,
3.033,Allowed Amount,Money,Required,Loop 2110 AMT*B6. Allowed amount on this service line. Allowed amount is the amount the payer deems payable prior to considering patient responsibility. This can also be the COB allowed amount on a secondary claim.,,
3.034,Revenue Code,Varchar(4),Required(if available),Loop 2110 SVC01-2. Used when SVC01-1 is NU. National Uniform Billing Committee Revenue code,Missing in the sample PNC file,
3.035,Composite Code,Varchar(80),Required(if available),Used when sending the full 835 composite procedure code already formed for SVC01,Missing in the sample PNC file,
3.036,Original Units,Integer,Required(if available),Loop 2101 SVC07. The original submitted units of service,Missing in the sample PNC file,
3.037,Line Item Control Number,Varchar(20),Required(if available),"Loop 2110 RF02. This is the Line Item Control Number submitted in the 837, which is utilized by the provider for tracking purposes. Note - the value in REF02 can include alpha characters. Required when a Line Item Control Number was received on the original claim or when claim or service line splitting has occurred. If not required by this implementation guide, do not send",,
3.038,Rendering Provider TIN,Varchar(20),Required (if different from claim),"Loop 2110 REF02. The Service provider TIN, if it is different from the claim TIN. Required when the rendering provider for this service is different than the rendering provider applicable at the claim level",Missing in the sample PNC file,
3.039,Rendering Provider NPI,Varchar(50),Required (if available),Rendering provider NPI. Required if different from claim level NPI.,,
3.040,Tax Amount,Money,Required (If Available),Required if tax is non-zero.,Missing in the sample PNC file,
3.041,Late Filing Deduction,Money,Required (If Available),Required when there is a Late Filing Reduction,Missing in the sample PNC file,
3.042,Total Claim Before Taxes,Money,Required (If Available),Use this monetary amount for the service charge before taxes. This is only used when there is an applicable tax amount on this service.,Missing in the sample PNC file,
3.043,Submitted Product/Service id qualifier,Varchar(255),Required,The database from which the procedure code is derived,,
3.044,Submitted ProcedureCode,Varchar(5),Required (If Available),The procedure code,,
3.045,Submitted Procedure Modifier,Varchar(60),Required (if applies),Loop 2110 SV01-3. This identifies the special circumstances related to the performance of the service.,,
3.046,Submitted Procedure Modifier 2,Varchar(60),Required (if applies),Loop 2110 SV01-4. This identifies the special circumstances related to the performance of the service.,,
3.047,Submitted Procedure Modifier 3,Varchar(60),Required (if applies),Loop 2110 SV01-5. This identifies the special circumstances related to the performance of the service.,,
3.048,Submitted Procedure Modifier 4,Varchar(60),Required (if applies),Loop 2110 SV01-6. This identifies the special circumstances related to the performance of the service.,,
,,,,,,
Record Layout 4 (Remarks/ adjustment level information),,,,,,
,,,,,,
INDEX,Data Element,Data Type,REQ,Description,,
4.001,Record,Varchar(4),Required,0004,,
4.002,BatchKey,Varchar(75),Required,See key generation,,
4.003,ClaimNumber,Varchar(50),Optional,The claim number assigned for the claim. Required if remark is at claim line or claim service line,,
4.004,ClaimLineNumber,Varchar(15),Optional,The claim line number assigned for the particular service line. Required if remark is at the claim service line,,
4.005,System Remark Code,Varchar(10),Required,The internal system remark code for a service line,,
4.006,System Remark Description,Varchar(1000),Required (If Available),The description used for the above remark code,,
4.007,ProviderAdjustmentCode,Varchar(2),Required (If Available),Adjustments to the actual payment that are NOT specific to a particular claim or service,Missing in the sample PNC file,
4.008,835 Adjusted Amount,Money,Required (If Available),The respective adjusted amount for the aforementioned Remark Code,,
4.009,CARC,Varchar(50),Required (If Available),Client CARC Code mapped to System Remark Code,,
4.01,RARC,Varchar(50),Required (If Available),Client RARC Code mapped to corresponding 4.009 CARC,,
4.011,CAGC,Varchar(50),Required (If Available),Client CAGC Code mapped to corresponding 4.009 CARC,,
4.012,Remark Type,Varchar(10),Required (If Available),Defines type of ineligible amount from Payments File Detail record,Missing in the sample PNC file,
4.013,PLB Identifier,Varchar(100),Required (if available),"835 Summary Field PLB03-2. Provider Level Adjustment Code related claim number of another identifier.
Required when a control, account or tracking number applies to this adjustment.
For example, for Provider Level Adjustment Code 72, PLB03-2 must always contain an identifying reference number when the value is used.
For code “CS”, you must provide supporting identification information in PLB03-2.",Missing in the sample PNC file,
4.014,Covered Days,Int,Required (if available),"The number of days being adjusted. A positive value decreases the covered days, and a negative number increases the covered days. CAS04, CAS07, CAS10, CAS13, CAS16, CAS19",Missing in the sample PNC file,
```

## Payment OB/V26.1.0.0/EdifecsProduct_Mapping Spec_OutboundPayment_835_DFF_to_EDIConversion_V2.0.xlsx — PSD Tickets

```csv
S/No,PSD Ticket#,Clarification From Customer
1,503,"1. Current payment HRP webservice and DFF data - it fetches the original submitted Insured ID or matched data?  Based on above, changes needed on DFF file, Edifecs mapping to map   insured/patient names separately as per TR3.
 1. Step-1  evaluate DFF
 2. Evaluate the impact in existing customers

2. We do not have placeholder for dependents in DFF yet, need to add that and perform mapping according to that in Edifecs"
2,"502, 500, 499","1. Details related to bundling and unbundling fields has to be shared in DFF before we proceed with Edifecs Mapping.
2. We can discuss on this once Theju is back"
```

## Payment OB/V26.1.0.0/EdifecsProduct_Mapping Spec_OutboundPayment_835_DFF_to_EDIConversion_V2.0.xlsx — Attachments

```csv
Sl #,Attachment Name,Attachment
1,Sample EDI 835,
,,
,,
,,
2,Sample DFF,
,,
,,
3,Sample Payment Extract,
```

## Payment OB/V26.1.1.1/EdifecsProduct_Mapping Spec_OutboundPayment_835_DFF_to_EDIConversion_V2.1.xlsx — Coversheet

```csv
Mapping Specification,,,,,,,,,
,,,,,,,,,
EDIFECS - Payment Extract (835) Outbound file,,,,,,,,,
,,,,,,,,,
"Healthcare Advisory and Consulting Team, UST HealthProof",,,,,,,,,
<Account Name> -,,,,,,,,,
,,,,,,,,,
,,,,Version,,1.1,,,
,,,,,,,,,
,Distribution of this document is limited to <Account Name> and UST HealthProof Associates,,,,,,,,
,,,,,,,,,
,Notice of Confidentiality and Custodial Responsibilities,,,,,,,,
,"This <Account Name> document contains confidential information that is
<Account Name> intellectual property. As a holder of this document, you
 may NOT disclose its content or any information derived from it to
any person outside of <Account Name> and UST <Account Name> Project Team.",,,,,,,,
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

## Payment OB/V26.1.1.1/EdifecsProduct_Mapping Spec_OutboundPayment_835_DFF_to_EDIConversion_V2.1.xlsx — Revision History

```csv
Revision History,,,,
,,,,
V#,Date,Author,Reviewer(s)/ Contributor(s),Comments
1.0,07/01/2023,Vijaya Raj Geethan P,Shijila Raveendran,Updated maaping spec
1.1,11/20/2023,Jishnu,Shijila Raveendran,"Changed the field position for 2100.NM103 2.018 to 2.019
Updated mapping in NM1*IL
Updated mapping in DTM*036
Updated mapping in DTM*232
Added bundling information"
1.2,02/05/2024,Jishnu,Shijila Raveendran,"Updated the mapping 2100.NM1*QC(Patient Name—PSD 1592)
Updated the mapping 2100.NM109(Patient Id—PSD 1628)
Updated the mapping 2110.SVC0-6(Patient Id—PSD 1592)"
1.3,30/4/2024,Ambily,Shijila Raveendran,Updated mapping for 2100.NM1*74 (PSD-2247)
1.4,9/10/24,Deepthi,Shijila Raveendran,Updated mapping for NM1*82*1  (User Story-8473)
1.5,5/7/25,Deepthi,Ambily,"Updated mapping for 1000B & NM1*82*3 (User Story - 16884)
Included NPI logic check"
2.1,5/20/26,Deepthi,Ambily,Updated and refined the mapping logic for 2100.NM1*74 (PSD-11699)
2.1,5/20/26,Deepthi,Ambily,Added comments in 2100.NM109
```

## Payment OB/V26.1.1.1/EdifecsProduct_Mapping Spec_OutboundPayment_835_DFF_to_EDIConversion_V2.1.xlsx — 835 Mapping

```csv
Loop ID,EDI Segment,EDI Data Element Name,User Option,Length,Enumeration Values,Mapping Logic OR  DFF Position,DFF Field Description,Mapping Comments,Final Review Comments
ISA (Interchange Control Header),,,,,,,,,
,ISA,Segment: Interchange Control Header,R,,,,,,
,ISA01,Authorization Information Qualifier,R,"Min - 2
Max - 2","00 : No Authorization Information Present
03: Additional Data Identification","Hardcode as ""00""",NA,,
,ISA02,Authorization Information,R,"Min - 10
Max - 10",,Leave it blank,NA,,
,ISA03,Security Information Qualifier,R,"Min - 2
Max - 2","00 : No Security Information Present
01 : Password","Hardcode as ""00""",NA,,
,ISA04,Security InformationLQ,R,"Min - 10
Max - 10",,Leave it blank,NA,,
,ISA05,Interchange Sender ID Qualifier,R,"Min - 2
Max - 2","01: Duns (Dun & Bradstreet)
14 Duns Plus Suffix
20 Health Industry Number (HIN)
27 Carrier Identification Number
28 Fiscal Intermediary Identification Number
29 Medicare Provider and Supplier IdentificationNumber
30 U.S. Federal Tax Identification Number
33 National Association of Insurance Commissioners Company Code (NAIC)
ZZ Mutually Defined","Hardcode as ""ZZ""",NA,,
,ISA06,Interchange Sender ID,R,"Min - 15
Max - 15",,"Hardcode as  ""1234           """,NA,"Interchange Sender ID will be different for each customer.From product standpoint, we have hardcoded a random sender ID.",
,ISA07,Interchange Receiver ID Qualifier,R,"Min - 2
Max - 2","01: Duns (Dun & Bradstreet)
14 Duns Plus Suffix
20 Health Industry Number (HIN)
27 Carrier Identification Number
28 Fiscal Intermediary Identification Number
29 Medicare Provider and Supplier IdentificationNumber
30 U.S. Federal Tax Identification Number
33 National Association of Insurance Commissioners Company Code (NAIC)
ZZ Mutually Defined","Hardcode as ""ZZ""",NA,,
,ISA08,Interchange Receiver ID,R,"Min - 15
Max - 15",,"Hardcode  as ""123456789123456""",NA,"Interchange Receiver ID will be different for each customer.From product standpoint, we have hardcoded a random Receiver ID.",
,ISA09,Interchange Date,R,"Min - 6
Max - 6",The date format is YYMMDD.,"Map this value from  current date in the format of ""YYMMDD""",NA,Date  transaction is created – done by translator  (Date for the Process of converting 835 it will be the EDIFECS time of converting 835 ) YYMMDD,
,ISA10,Interchange Time,R,"Min -4
Max - 4",The time format is HHMM.,Map this value from   current time in the format of HHMM,NA,,
,ISA11,Interchange Control Standards Identifier,R,"Min - 1
Max - 1",,"Hardcode as ""^""",NA,,
,ISA12,Interchange Control Version Number,R,"Min - 5
Max - 5","00501 Standards Approved for Publication by ASC X12
Procedures Review Board through October 2003",Hardcode as “00501”,NA,,
,ISA13,Interchange Control Number,R,"Min - 9
Max - 9","The Interchange Control Number, ISA13, must be identical to the
associated Interchange Trailer IEA02.
This Must be a positive unsigned number and must be identical to the value in IEA02.",Refer Column H,NA,Unique ISI control number needs to generated in Edifecs for each 835 EDI file. It has to be 9 digits (for example -  000000764),
,ISA14,Acknowledgement Requested,R,"Min - 1
Max - 1","0 No Interchange Acknowledgment Requested
1 Interchange Acknowledgment Requested (TA1)","Hardcode as ""0""",NA,,
,ISA15,Usage Indicator,R,"Min - 1
Max - 1","P Production Data
T Test Data","Refer Column I and map based on below logic
Hardcode as ""P""  if it is a Production region
Hardcode as ""T""  if it is a Non-Production region",NA,Based on Environmental property whether it is lower region or production region.,
,ISA16,Component element Separator,R,"Min - 1
Max - 1",,"Hardcode  as "":""",NA,,
GS (Functional Group Header),,,,,,,,,
,GS,Segment: Functional Group Header,R,,,,,,
,GS01,Functional Identifier Code,R,"Min - 2
Max - 2",HP Health Care Claim Payment/Advice (835),Hardcode as “HP”,NA,,
,GS02,Application Sender Code,R,"Min -2
Max - 15",,"Hardcode as ""1234""",NA,"Application Sender Code will be different for each customer.From product standpoint, we have hardcoded a random Application Sender Code.",
,GS03,Application Receiver ID,R,"Min -2
Max - 15",,"Hardcode as ""Product""",NA,"Application Receiver ID will be different for each customer.From product standpoint, we have hardcoded a random Application Application Receiver ID.",
,GS04,Date,R,"Min - 8
Max - 8",Date Expressed in YYYYMMDD format (Current Date),"Map this value from  current date in the format of ""YYYYMMDD""",NA,,
,GS05,Time,R,"Min - 4
Max - 8",,"Map this value from   current Time in the format of ""HHMMSS""",NA,,
,GS06,Group Control Number,R,"Min - 1
Max - 9",,,NA,"Functional Group Control Number. Value must equal GE02

GS control number min length - 1 and max is 9",
,GS07,Responsible Agency Code,R,"Min - 1
Max - 2",X Accredited Standards Committee X12,"Hardcode as ""X""",NA,,
,GS08,Version/Release/Industry Identifier,R,"Min - 1
Max - 12","005010X221 Standards Approved for Publication by ASC X12
Procedures Review Board through October 2003","Hardcode as ""005010X221A1""",NA,,
ST Transaction Set Header,,,,,,,,,
,ST,Segment: Transaction Set Header,R,,,,,,
,ST01,Transaction Set Identifier Code,R,"Min - 3
Max - 3",835 Health Care Claim Payment/Advice,"Hardcode as ""835""",NA,,
,ST02,Transaction Set Control Number,R,"Min - 4
Max - 9",,Refer Column H,NA,Unique control number needs to populated from process flow or map,
BPR Financial Information,,,,,,,,,
,BPR,Segment: Financial Information,R,,,,,Currently we are not mapping ACH payments,
,BPR01,Transaction Handling Code,R,"Min - 1
Max - 2","C Payment Accompanies Remittance Advice
D Make Payment Only
H Notification Only
I Remittance Information Only
P Prenotification of Future Transfers
U Split Payment and Remittance
X Handling Party’s Option to Split Payment and
Remittance","Hardcode as ""I"" for EFT/Check payments
Hardcode as ""H"" when the actual provider payment amount(BPR02) is zero.",NA,Currently ACH payment is not in scope for product. Need to verify future scope for ACH payment mapping . IBC conifrmed they don’t have ACH scope.,
,BPR02,Monetary Amount,R,"Min - 1
Max - 18",Cheque Amount,Map this value from the DFF index 1.006,CheckAmount,,
,BPR03,Credit/Debit Flag,R,"Min - 1
Max - 1","C Credit
D Debit","Hardcode as ""C""",NA,,
,BPR04,PAYMENT METHOD CODE,R,"Min - 3
Max - 3","ACH Automated Clearing House (ACH)
BOP Financial Institution Option
CHK Check
FWT Federal Reserve Funds/Wire Transfer - Nonrepetitive
NON Non-Payment Data","Hardcode as ""CHK""  for check
Hardcode as ""ACH"" for Electronic payment
Hardcode as ""NON"" if the the actual provider payment amount(BPR02) is zero.",NA,"""CHK"" = Check, ""ACH"" = EFT payments, ""NON"" = Non payments",
,BPR05,PAYMENT FORMAT CODE,S,"Min - 1
Max - 10","CCP Cash Concentration/Disbursement plus Addenda
(CCD+) (ACH)

CTX Corporate Trade Exchange (CTX) (ACH)",,NA,Currently ACH payment is not in scope for product. Need to verify future scope for ACH payment mapping . IBC conifrmed they don’t have ACH scope.,
,BPR06,(DFI) ID NUMBER QUALIFIER,S,"Min - 2
Max - 2","01 ABA Transit Routing Number Including Check Digits
(9 digits)
04 Canadian Bank Branch and Institution Number",,NA,,
,BPR07,(DFI) IDENTIFICATION NUMBER,S,"Min - 3
Max - 12",,,MICRTransitNumber,,
,BPR08,Account Number Qualifier,S,"Min - 1
Max - 3",DA Demand Deposit,,NA,,
,BPR09,Sender Bank Account Number,S,"Min - 1
Max - 35",,,AccountNumber,,
,BPR010,ORIGINATING COMPANY IDENTIFIER,S,"Min - 10
Max - 10",,,NA,,
,BPR11,Originating Company Supplemental Code,S,"Min -9
Max - 9",,,NA,,
,BPR12,DFI Identification Number Qualifier,S,"Min - 2
Max - 2","01 ABA Transit Routing Number Including Check Digits
(9 digits)
04 Canadian Bank Branch and Institution Number",,NA,,
,BPR013,Receiver or Provider Bank ID Number,S,"Min - 3
Max - 12",,,Payee Bank ID Number,,
,BPR014,ACCOUNT NUMBER QUALIFIER,S,"Min - 1
Max - 3","DA Demand Deposit
SG Savings",,Account Number Qualifier,,
,BPR015,Receiver or Provider Account Number,S,"Min - 1
Max - 35",,,Payee Account Number,,
,BPR016,Check Issue or EFT Effective Date,S,"Min - 8
Max - 8",,"Map this value from the DFF index 1.005

Date format ""YYYYMMDD""",CheckDate,YYYYMMDD,
TRN Reassociation Trace Number,,,,,,,,,
,TRN,Segment: Reassociation Trace Number,R,,,,,,
,TRN01,Trace Type Code,R,"Min - 1
Max - 2",1 Current Transaction Trace Numbers,"Hardcode as ""1""",NA,,
,TRN02,REFERENCE IDENTIFICATION,R,"Min - 1
Max - 50",,Map this value from the DFF index 1.004,CheckNumber,,
,TRN03,ORIGINATING COMPANY IDENTIFIER,R,"Min - 10
Max - 10",,"Hardcode as ""1841297547""",NA,"1 Followed by payer TIN

ORIGINATING COMPANY IDENTIFIER will be different for each customer.From product standpoint, we have hardcoded a random ORIGINATING COMPANY IDENTIFIER.",
,TRN04,Originating Company Supplemental Code,S,"Min - 1
Max - 50",,NA,NA,,
CUR Foreign Currency Information,,,,,,,,,
,CUR,Segment: Foreign Currency Information,S,,,,,,
,CUR01,Entity Identifier Code,R,"Min - 2
Max - 3",PR Payer,NA,NA,,
,CUR02,Currency Code,R,"Min - 3
Max - 3",,NA,NA,,
REF Receiver Identification,,,,,,,,,
,REF,Segment: Receiver Identification,S,,,,,,
,REF01,Reference Identification Qualifier,R,"Min - 2
Max - 3",EV Receiver Identification Number,NA,NA,,
,REF02,Reference Identification,R,"Min - 1
Max - 50",,NA,NA,,
REF Version Identification,,,,,,,,,
,REF,Segment: Version Identification,S,,,,,,
,REF01,Reference Identification Qualifier,R,"Min - 2
Max - 3",F2 Version Code - Local,NA,NA,,
,REF02,Reference Identification,R,"Min - 1
Max - 50",,NA,NA,,
DTM Production Date,,,,,,,,,
,DTM,Segment: Production Date,S,,,,,,
,DTM01,Date/Time qualifier,R,"Min - 3
Max - 3",405 Production,"Hardcode as ""405""",NA,,
,DTM02,Date,R,"Min - 8
Max - 8",,"Map this value from  system date in the format ""YYYYMMDD""",NA,,
LOOP 1000A - Payer Identification,,,,,,,,,
1000A,N1,Payer Identification,R,,,,,,
1000A,N101,Payer Identifier Code,R,"Min - 2
Max - 3",PR Payer,"Hardcode as ""PR""",NA,,
1000A,N102,Payer NAME,R,"Min - 1
Maxi - 60",,"Hardcode as ""PRODUCT""",NA,,
1000A,N103,Identification Code Qualifier,S,"Min - 1
Max - 2",XV Centers for Medicare and Medicaid Services PlanID,NA,NA,,
1000A,N104,Payer Identification Code,S,"Min- 2
Max - 80",,NA,NA,,
1000A,N3,Payer Address,R,,,,,,
1000A,N301,Payer Address Line,R,"Min - 1
Max - 55",,"Hardcode as ""XXXX""",NA,,
1000A,N302,Payer Address Line,S,"Min - 1
Max - 55",,NA,NA,,
1000A,N4,"Segment : Payer City, State, Zip Code",R,,,,,,
1000A,N401,Payer City Name,R,"Min - 1
Max - 30",,"Hardcode as ""Aurora""",NA,"Payer City Name will be different for each customer.From product standpoint, we have hardcoded a random Payer City Name.",
1000A,N402,Payer State Code,S,"Min - 2
Max - 2",,"Hardcode as ""CO""",NA,"Payer state will be different for each customer.From product standpoint, we have hardcoded a random Payer state.",
1000A,N403,Payer Postal Zone or Zip Code,S,"Min - 1
Max - 15",,"Hardcode as ""80014""",NA,"Payer Postal Zone will be different for each customer.From product standpoint, we have hardcoded a random Payer Postal Zone.",
1000A,REF,Additional Payer Identification,S,,,,,,
1000A,REF01,Reference Identifier Qualifier,R,"Min - 2
Max - 3","2U Payer Identification Number
EO Submitter Identification Number
HI Health Industry Number (HIN)NF National Association of Insurance Commissioners (NAIC) Code","Hardcode as ""2U""",NA,,
1000A,REF02,Additional Payer Identifier,R,"Min - 1
Max - 50",,"Hardcode as ""6058028""",NA,"Payer identifier will be different for each customer.From product standpoint, we have hardcoded a random Payer identifier.",
1000A,PER,Payer Business Contact Information,S,,,,,,
1000A,PER01,Contact Function Code,R,"Min - 2
Max - 2",CX Payers Claim Office,"Hardcode as ""CX""",NA,,
1000A,PER02,Payer Contact Name,S,"Min - 1
Max - 60",,"Hardode as ""EDI Coordinator""",NA,"Payer Contact Name will be different for each customer.From product standpoint, we have hardcoded a random Payer Contact Name.",
1000A,PER03,Communication Number Qualifier,S,"Min - 2
Max - 2","EM Electronic Mail
FX Facsimile
TE Telephone","Hardcode as ""TE""",NA,,
1000A,PER04,Payer Contact Communication Number,S,"Min - 1
Max - 256",,"Hardcode as ""1234567890""",NA,"Payer Contact Communication Number will be different for each customer.From product standpoint, we have hardcoded a random Payer Contact Communication Number.",
1000A,PER05,Communication Email Qualifier,S,"Min - 2
Max - 2","EM Electronic Mail
EX Telephone Extension
FX Facsimile
TE Telephone",Hardcode as “EM”,NA,,
1000A,PER06,Payer Contact Communication Email,S,"Min - 1
Max - 256",,Hardcode as “xyz@xyz.com”,NA,"Payer Contact Communication Email will be different for each customer.From product standpoint, we have hardcoded a random Payer Contact Communication Email.",
1000A,PER07,Communication Number Qualifier,S,"Min - 2
Max - 2",EX Telephone Extension,,,,
1000A,PER08,Communication Number,S,"Min - 1
Max - 256",,,,,
1000A,PER,Payer Technical Contact Information,R,,,,,,
1000A,PER01,Contact Function Code,R,"Min - 2
Max - 2",BL Technical Department,Hardcode as “BL”,NA,,
1000A,PER02,Payer Technical Contact Name,S,"Min - 1
Max - 60",,"Hardode as ""EDI Coordinator""",NA,"Payer Technical Contact Name will be different for each customer.From product standpoint, we have hardcoded a random Payer Technical Contact Name.",
1000A,PER03,Communication Number Qualifier,S,"Min - 2
Max - 2","EM Electronic Mail
TE Telephone
Recommended
UR Uniform Resource Locator (URL)
Use only when there is no central telephone number
for the payer entity.",Hardcode as “TE”,NA,,
1000A,PER04,Payer Contact Communication Number,S,"Min - 1
Max - 256",,"Hardcode as ""1234567890""",NA,"Payer Contact Communication Number will be different for each customer.From product standpoint, we have hardcoded a random Payer Contact Communication Number.",
1000A,PER05,Payer Contact Communication Number,S,"Min - 2
Max - 2","M Electronic Mail
EX Telephone Extension
FX Facsimile
TE Telephone
UR Uniform Resource Locator (URL)",Hardcode as “EM”,NA,,
1000A,PER06,Payer Technical Contact Communication,S,"Min - 1
Max - 256",,"Hardcode as ""contactus@uhc.com""",NA,"Payer Technical Contact Communication will be different for each customer.From product standpoint, we have hardcoded a random Payer Technical Contact Communication.",
1000A,PER07,Communication Number Qualifier,S,"Min - 2
Max - 2","EM Electronic Mail
EX Telephone Extension
FX Facsimile
UR Uniform Resource Locator (URL)",,,,
1000A,PER08,Communication Number,S,"Min - 1
Max - 256",,,,,
1000A,PER,Payer Web Site,S,,,,,,
1000A,PER01,Contact Function Code,R,"Min - 2
Max - 2",IC Information Contact,"Hardcode as ""IC""",NA,,
1000A,PER02,Name,R,NA,NA,NA,NA,,
1000A,PER03,Communication Number Qualifier,R,"Min - 2
Max - 2",UR Uniform Resource Locator (URL),"Hardcode as ""UR""",NA,,
1000A,PER04,Communication Number,R,"Min - 1
Max - 256",,"Hardcode as ""www.uhc.com""",,"Communication Number will be different for each customer.From product standpoint, we have hardcoded a random Communication Number.",
LOOP 1000B Payee Identification,,,,,,,,,
1000B,N1,Payee Identification,R,,,,,,
1000B,N101,Payer Identifier Code,R,"Min - 2
Max - 3",PE Payee,"Hardcode as ""PE""",NA,,
1000B,N102,Payee Name,R,"Min - 1
Max - 60",,Map this value from the DFF index 1.017,PayeeName,,
1000B,N103,Payee Identification Code Qualifier,R,"Min - 1
Max - 2","FI Federal Taxpayer’s Identification Number
XV Centers for Medicare and Medicaid Services PlanID
XX Centers for Medicare and Medicaid Services
National Provider Identifier","Hardcode as ""XX""",NA,,
1000B,N104,Payee Identification Code,R,"Min - 2
Max - 80",,Map this value from the DFF index 1.033,Payee NPI,,
1000B,N3,Payee Address,S,,,,,,
1000B,N301,Payee Address Line,R,"Min - 1
Max - 55",,Map this value from the DFF index  1.018,PayeeAddress1,,
1000B,N302,Payee Address Line,S,"Min - 1
Max - 56",,Map this value from the DFF index  1.019,PayeeAddress2,,
1000B,N4,"Payee City, State, Zip Code",S,,,,,,
1000B,N401,Payee City Name,R,"Min - 2
Max - 30",,Map this value from the DFF index  1.020,PayeeCity,,
1000B,N402,Payee State Code,S,"Min - 2
Max - 2",,Map this value from the DFF index  1.021,PayeeState,,
1000B,N403,Payee Postal Zone or Zip Code,S,"Min - 3
Max - 15",,Map this value from the DFF index  1.022,PayeeZip,,
1000B,N404,Country Code,S,"Min - 2
Max - 3",,NA,NA,,
1000B,N407,Country Subdivision Code,S,"Min - 1
Max - 3",,NA,NA,,
1000B,REF,Payee Additional Identification,S,,,,,,
1000B,REF01,Additional Payee Identification Qualifier,R,"Min - 2
Max - 3","0B State License Number
D3 National Council for Prescription Drug Programs
Pharmacy Number
PQ Payee Identification
TJ Federal Taxpayer’s Identification Number","Hardcode as ""TJ""",NA,,
1000B,REF02,Reference Identification Code,R,"Min - 1
Max - 50",,Map this value from the DFF index  1.032,Payee SSN/TIN,"Remove ""-"" If it is present in 1.032",
1000B,RDM,Remittance Delivery Method,S,,,,,,
1000B,RDM01,Report Transmission Code,R,"Min - 1
Max - 2","BM By Mail
EM E-Mail
FT File Transfer
OL On-Line",NA,NA,,
1000B,RDM02,Name,S,"Min - 1
Max - 60",,NA,NA,,
1000B,RDM03,Communication Number,S,"Min - 1
Max - 256",,NA,NA,,
LOOP 2000 Header Number,,,,,,,,,
2000,LX,Header Number,S,,,,,,
2000,LX01,Assigned Number,R,"Min - 1
Max - 6",,Refer to column I,NA,"Assigned Number - When 835 is created it needs to generated, starts with 1 , it increments for each CLP segement mentioned in Row#174, 2100 Loop",
2000,TS3,Provider Summary Information,S,,,,,,
2000,TS301,Reference Identification,R,"Min - 1
Max - 50",,NA,NA,,
2000,TS302,Facility Code Value,R,"Min - 1
Max - 2",,NA,NA,,
2000,TS303,Date,R,"Min - 8
Max - 8",,,NA,,
2000,TS304,Quantity,R,"Min - 1
Max - 15",,NA,NA,,
2000,TS305,Monetary Amount,R,"Min - 1
Max - 18",,NA,NA,,
2000,TS313,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS315,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS317,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS318,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS320,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS321,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS322,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS323,Quantity,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS324,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS2,Provider supplemental Summary Information,S,,,,,,
2000,TS201,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS202,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS203,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS204,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS205,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS206,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS207,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2000,TS208,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS209,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS210,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2000,TS211,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2000,TS212,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2000,TS213,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2000,TS214,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2000,TS215,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS216,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2000,TS217,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS218,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2000,TS219,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
LOOP 2100 Claim payment Information,,,,,,,,,
2100,CLP,Claim payment Information,R,,,,,,
2100,CLP01,Patient Control Number,R,"Min - 1
Max - 38",,Map this value from the DFF index  2.079,Patient Control Number,,
2100,CLP02,Claim Status Code,R,"Min - 1
Max - 2","1 Processed as Primary
2 Processed as Secondary
3 Processed as Tertiary
4 Denied
19 Processed as Primary, Forwarded to Additional
Payer(s)
20 Processed as Secondary, Forwarded to Additional
Payer(s)
21 Processed as Tertiary, Forwarded to Additional
Payer(s)
22 Reversal of Previous Payment
23 Not Our Claim, Forwarded to Additional Payer(s)
25 Predetermination Pricing Only - No Payment",Map this value from the DFF index   2.04,ClaimStatusCode,,
2100,CLP03,Total Claim Charge Amount,R,"Min - 1
Ma - 18",,Map this value from the DFF index  2.028,ChargeAmount,,
2100,CLP04,Total Claim Payment Amount,R,"Min - 1
Max - 18",,Map this value from the DFF index  2.037,PaidAmount,,
2100,CLP05,Patient Responsibility Amount,S,"Min - 1
Max - 18",,Map this value from the DFF index  2.038,PatientOwedamount,"This mapping is required when the patient responsibility is greater than zero, if not required.",
2100,CLP06,Claim Filing Indicator Code,R,"Min - 2
Max - 2","12 Preferred Provider Organization (PPO)
13 Point of Service (POS)
14 Exclusive Provider Organization (EPO)
15 Indemnity Insurance
16 Health Maintenance Organization (HMO) Medicare
Risk
17 Dental Maintenance Organization
AM Automobile Medical
CH Champus
DS DisabilityHM Health Maintenance Organization
LM Liability Medical
MA Medicare Part A
MB Medicare Part B
MC Medicaid
OF Other Federal Program
TV Title V
VA Veterans Affairs Plan
WC Workers’ Compensation Health Claim
ZZ Mutually Defined","Hardcode as ""HM""",NA,,
2100,CLP07,Payer Claim Control Number (Payer Claim Control Number – HRP claim number ),R,"Min - 1
Max - 50",,Map this value from the DFF index 2.003,ClaimNumber,,
2100,CLP08,Facility Type Code,S,"Min - 1
Max - 2",,Map this value from the DFF index 2.061,Facility Code Value,,
2100,CLP09,Claim Frequency Code,S,"Min - 1
Max - 1",,Map this value from the DFF index 2.083,Frequency code,,
2100,CLP10,Patient Status Code,NA,NA,NA,NA,NA,,
2100,CLP11,Diagnosis Related Group (DRG) Code,S,"Min - 1
Max - 4",,Map this value from the DFF index 2.069,Diagnosis Related Group Code,,
2100,CLP12,DRG Weight,S,"Min - 1
Max - 15",,Map this value from the DFF index 2.068,DRG Weight (Record Type 2 Claim Level Information),,
2100,CLP13,PERCENT - Discharge Fraction,S,"Min - 1
Max - 10",,NA,NA,,
2100,CAS,Claim Adjustment,S,,,,,All the adjustment details are mentioned in line level (2110 CAS Segment),
2100,CAS01,Claim Adjustment Group Code,R,"Min - 1
Max - 2","CO Contractual Obligations
OA Other adjustments
PI Payor Initiated Reductions
PR Patient Responsibility",NA,NA,,
2100,CAS02,Adjustment Reason Code,R,"Min - 1
Max - 5",,NA,NA,,
2100,CAS03,Adjustment Amount,R,"Min - 1
Max - 18",,NA,NA,,
2100,CAS04,QUANTITY,S,"Min - 1
Max - 15",,NA,NA,,
2100,CAS05,Claim Adjustment Reason Code,S,"Min - 1
Max - 2",,NA,NA,,
2100,CAS06,Monetary Amount,S,"Min - 1
Max - 18",,,,,
2100,CAS07,Quantity,S,"Min - 1
Max - 15",,,,,
2100,CAS08,Claim Adjustment Reason Code,S,"Min - 1
Max - 2",,,,,
2100,CAS09,Monetary Amount,S,"Min - 1
Max - 18",,,,,
2100,CAS10,Quantity,S,"Min - 1
Max - 15",,,,,
2100,CAS11,Claim Adjustment Reason Code,S,"Min - 1
Max - 2",,,,,
2100,CAS12,Monetary Amount,S,"Min - 1
Max - 18",,,,,
2100,CAS13,Quantity,S,"Min - 1
Max - 15",,,,,
2100,CAS14,Claim Adjustment Reason Code,S,"Min - 1
Max - 2",,,,,
2100,CAS15,Monetary Amount,S,"Min - 1
Max - 18",,,,,
2100,CAS16,Quantity,S,"Min - 1
Max - 15",,,,,
2100,CAS17,Claim Adjustment Reason Code,S,"Min - 1
Max - 2",,,,,
2100,CAS18,Monetary Amount,S,"Min - 1
Max - 18",,,,,
2100,CAS19,Quantity,S,"Min - 1
Max - 15",,,,,
2100,NM1,Patient Name,R,,,,,,
2100,NM101,Patient Identifier Code,R,"Min - 2
Max - 3",QC Patient,"Hardcode as ""QC""",NA,,
2100,NM102,Entity Type Qualifier,R,"Min - 1
Max - 1",1 Person,"Hardcode as ""1""",NA,,
2100,NM103,Patient Last  Name,S,"Min - 1
Max - 60",,Map this value from the DFF index 2.087 - Map only the Lastname,"SubmittedPatientLastName
Format: (SubmittedPatientLastName, Middle Name,Firstname)","If 2.087 doesnt have comma(,) Map from position 2.080 (Corrected patient information)",
2100,NM104,Patient First Name,S,"Min - 1
Max - 35",,Map this value from the DFF index 2.087 - Map only the First name,"SubmittedPatientLastName
Format: (SubmittedPatientLastName, Middle Name,Firstname)","If 2.087 doesnt have comma(,) Map from position 2.081 (Corrected patient information)",
2100,NM105,Patient Middle Initial,S,"Min - 1
Max - 25",,Map this value from the DFF index 2.087- Map only the Middle name,"SubmittedPatientLastName
Format: (SubmittedPatientLastName, Middle Name,Firstname)","If 2.087 doesnt have comma(,) Map from position 2.082 (Corrected patient information)",
2100,NM106,Name Prefix,NA,NA,,NA,NA,,
2100,NM107,Patient Name Suffix,S,"Min - 1
Max - 10",,NA,NA,,
2100,NM108,Identification Code Qualifier,S,"Min - 1
Max - 2","34 Social Security Number
HN Health Insurance Claim (HIC) Number
II Standard Unique Health Identifier for each Individual
in the United States
Use this code if mandated in a final Federal Rule.
MI Member Identification Number
MR Medicaid Recipient Identification Number","Hardcode as ""MI""",NA,,
2100,NM109,Patient Member Number,S,"Min - 2
Max - 80",,Map this value from the DFF index 2.084,SubmittedPatientID,If no values present in 2.084 then map from 2.005 (Corrected patient id),
2100,NM1,Insured Name,S,,If subscriber and patient are same we will not map this entire segment,,,,
2100,NM101,Entity Identifier Code,R,"Min - 2
Max - 3",IL,"Hardcode as ""IL""",,If the subscriber is not same as patient,
2100,NM102,Entity Type Qualifier,R,"Min - 1
Max - 1","1,2","Hardcode as ""1""",,,
2100,NM103,Name Last or Organization Name,S,"Min - 1
Max - 60",,Map this value from the DFF index 2.091,SubscriberLastName,,
2100,NM104,Name First,S,"Min - 1
Max - 35",,Map this value from the DFF index 2.089,SubscriberFirstName,,
2100,NM105,Name Middle,S,"Min - 1
Max - 25",,Map this value from the DFF index 2.090,SubscriberMiddleName,,
2100,NM107,Name Suffix,ISA,"Min - 1
Max - 10",,NA,NA,,
2100,NM108,Identification Code Qualifier,R,"Min - 1
Max - 2","FI,II,MI","Hardcode as ""MI""",NA,,
2100,NM109,Identification Code,R,"Min - 2
Max - 80",,Map this value from the DFF index 2.088,SubscriberID,,
2100,NM1,Corrected Patient/Insured Name,S,,,,,,
2100,NM101,Entity Identifier Code,R,"Min - 2
Max - 3",74 Corrected Insured,"Hardcode as ""74""",NA,"Mapping Logic 1:
Map this segment, only
if 2.045 - CorrectedPatient/InsuredName & 2.046 if CorrectedPatient/InsuredMemberID is present in DFF and
if 2.045 (Last name) is differrent from 2.087 &
if 2.046 is different from 2.084
Consider Mapping logic 2 only if Mapping Logic 1 doesn't satisfy/present in DFF
Mapping Logic 2:
Map this segment only if
the name in 2.080+2.082+2.081 is different from 2.087
OR
ID in 2.005 is different from 2.084","Note:
1. As per X12 Standard, only the corrected patient information should be populated in NM1*74 which is expected product behavior, else Snip 4 error would be displayed which is not validated in product.
2. If any other implementation team request for populating all the values in NM1*74, that is to handled in adaptor

Example:
Load a DFF with a change in difference in the middle name in submitted and actual member information for a claim.
Actual Result:
NM1*74*1*Lname*Fname*L
Expected Result:
NM1*74*1***L"
2100,NM102,Entity Type Qualifier,R,"Min - 1
Max - 1","1 Person
2 Non-Person Entity","Hardcode as ""1""",NA,,
2100,NM103,Name Last or Organization Name,S,"Min - 1
Max - 60",,"Map this value from the DFF index 2.045
Format of data in 2.045: Last Name, First Name
Map this value from the DFF index 2.080","CorrectedPatient/InsuredName
Patient Last name","Mapping Logic 1:
Map only if 2.045 is present and  if 2.045 (Last name) is differrent from 2.087, else consider Logic 2
If present, Map Last Name only
Mapping Logic 2:
Map only if  the name in 2.080+2.082+2.081 is different from 2.087",
2100,NM104,Name First,S,"Min - 1
Max - 35",,"Map this value from the DFF index 2.045
Format of data in 2.045: Last Name, First Name
Map this value from the DFF index 2.081",Patient First name,"Mapping Logic 1:
Map only if 2.045 is present, else consider Logic 2
If present, Map First Name only
Mapping Logic 2:
Map only if  the name in 2.080+2.082+2.081 is different from 2.087",
2100,NM105,Name Middle,S,"Min - 1
Max - 25",,Map this value from the DFF index 2.082,Patient Middle name,Map only if  the name in 2.080+2.082+2.081 is different from 2.087,
2100,NM107,Name Suffix,S,"Min - 1
Max - 10",,NA,NA,,
2100,NM108,Identification Code Qualifier,S,"Min - 1
Max - 2",C Insured’s Changed Unique Identification Number,"Hardcode as ""C""",NA,,
2100,NM109,Identification Code,S,"Min - 2
Max - 80",,"Map this value from the DFF index 2.046
Map this value from the DFF index 2.005","CorrectedPatient/InsuredMemberID
PatientID","Mapping Logic 1:
Map only if 2.046 is present and 2.046 is different from 2.084, else consider Logic 2
Mapping Logic 2:
If both 2.005 and 2.084 has value, and both are different then populate NM109 with 2.005 value
else
Need not populate any value","If 2.005 is blank and 2.084 has value, populate NM109 with 2.084 value (Not a business scenario only for testing purpose)
if 2.084 is blank and 2.005 has value then do not populate any in NM109"
2100,NM1,Service Provider Name,S,,,,,,
2100,NM101,Entity Identifier Code,R,"Min - 2
Max - 3",82 Rendering Provider,"Hardcode as ""82""",NA,"1. This NM1*82 is a configurable item. A flag will be configured in Edifecs layer with Y/N value.
If Y - NM103, NM104 & NM105 will be splited and populated.
If N - only NM103 will populated with value. NM104 & NM105 should be blank
2. Populate NM1*82 only if 2.016 is different from 1.033",NPI should be the only check
2100,NM102,Entity Type Qualifier,R,"Min - 1
Max - 1","1 Person
2 Non-Person Entity","Hardcode as ""1""",NA,,
2100,NM103,Name Last or Organization Name,S,"Min - 1
Max - 60",,"Logic 1:
If Flag Y - Map this value from the DFF index 2.094
If Flag N - Map this value from the DFF index 2.018
Logic 2:
Do not populate NM1*82, If 2.018  is equal to 1.017",,Populate NM1*82 only if 2.018 is different from 1.017,"Currently we have Logic 2 in our code, but it Logic 2 is optional one to be considered"
2100,NM104,Name First,S,"Min - 1
Max - 35",,"If Flag Y - Map this value from the DFF index 2.092
If Flag N - NA",NA,,
2100,NM105,Name Middle,S,"Min - 1
Max - 25",,"If Flag Y - Map this value from the DFF index 2.093
If Flag N - NA",NA,,
2100,NM107,Name Suffix,S,"Min - 1
Max - 10",,NA,NA,,
2100,NM108,Identification Code Qualifier,R,"Min - 1
Max - 2","BD Blue Cross Provider Number
BS Blue Shield Provider Number
FI Federal Taxpayer’s Identification Number
MC Medicaid Provider Number
PC Provider Commercial Number
SL State License Number
UP Unique Physician Identification Number (UPIN)
XX Centers for Medicare and Medicaid Services
National Provider Identifier","Hardcode as ""XX""",NA,,
2100,NM109,Identification Code,R,"Min - 2
Max - 80",,Map this value from the DFF index 2.016,ProviderNPI,Map only if  ID in 2.005 is different from 2.084,
2100,NM1,Crossover Carrier Name,S,,,,,,
2100,NM101,Entity Identifier Code,R,"Min - 2
Max - 3",TT Transfer To,NA,NA,,
2100,NM102,Entity Type Qualifier,R,"Min - 1
Max - 1",2 Non-Person Entity,NA,NA,,
2100,NM103,Name Last or Organization Name,R,"Min - 1
Max - 60",,NA,NA,,
2100,NM108,Identification Code Qualifier,R,"Min - 1
Max - 2","AD Blue Cross Blue Shield Association Plan Code
FI Federal Taxpayer’s Identification Number
NI National Association of Insurance Commissioners
(NAIC) Identification
PI Payor Identification
PP Pharmacy Processor Number
XV Centers for Medicare and Medicaid Services PlanID",NA,NA,,
2100,NM109,Identification Code,R,"Min - 2
Max - 80",,NA,NA,,
2100,NM1,Corrected Priority Payer Name,S,,,,,,
2100,NM101,Entity Identifier Code,R,"Min - 2
Max - 3",PR Payer,NA,NA,,
2100,NM102,Entity Type Qualifier,R,"Min - 1
Max - 1",2 Non-Person Entity,NA,NA,,
2100,NM103,Name Last or Organization Name,R,"Min - 2
Max - 60",,NA,NA,,
2100,NM108,Identification Code Qualifier,R,"Min - 1
Max - 2","AD Blue Cross Blue Shield Association Plan Code
FI Federal Taxpayer’s Identification Number
NI National Association of Insurance Commissioners
(NAIC) Identification
PI Payor Identification
PP Pharmacy Processor Number
XV Centers for Medicare and Medicaid Services PlanID",NA,NA,,
2100,NM109,Identification Code,R,"Min - 2
Max - 80",,NA,NA,,
2100,NM1,Other Subscriber Name,S,,,,,,
2100,NM101,Entity Identifier Code,R,"Min - 2
Max - 3",GB Other Insured,NA,NA,,
2100,NM102,Entity Type Qualifier,R,"Min - 1
Max - 1","1 Person
2 Non-Person Entity",NA,NA,,
2100,NM103,Name Last or Organization Name,S,"Min - 1
Max - 60",,NA,NA,,
2100,NM104,Name First,S,"Min - 1
Max - 35",,NA,NA,,
2100,NM105,Name Middle,S,"Min - 1
Max - 25",,NA,NA,,
2100,NM107,Name Suffix,S,"Min - 1
Max - 10",,NA,NA,,
2100,NM108,Identification Code Qualifier,S,"Min - 1
Max - 2","FI Federal Taxpayer’s Identification Number
II Standard Unique Health Identifier for each Individual
in the United States
MI Member Identification Number",NA,NA,,
2100,NM109,Identification Code,S,"Min - 2
Max - 80",,NA,NA,,
2100,MIA,Inpatient Adjudication Information,S,,,,,,
2100,MIA01,Quantity,R,"Min - 1
Max - 15",,NA,NA,,
2100,MIA02,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA03,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2100,MIA04,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA05,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2100,MIA06,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA07,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA08,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA09,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA10,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA11,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA12,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA13,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA14,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA15,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2100,MIA16,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA17,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA18,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA19,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MIA20,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2100,MIA21,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2100,MIA22,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2100,MIA23,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2100,MIA24,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MOA,Outpatient Adjudication Information,S,,,,,,
2100,MOA01,Percentage as Decimal,S,"Min - 1
Max - 10",,NA,NA,,
2100,MOA02,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MOA03,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2100,MOA04,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2100,MOA05,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2100,MOA06,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2100,MOA07,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2100,MOA08,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,MOA09,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2100,REF,Other Claim Related Identification,S,,,,,,
2100,REF01,Reference Identification Qualifier,R,"Min - 2
Max - 3","1L Group or Policy Number
1W Member Identification Number
28 Employee Identification Number
6P Group Number
9A Repriced Claim Reference Number
9C Adjusted Repriced Claim Reference Number
BB Authorization Number
CE Class of Contract Code
EA Medical Record Identification Number
F8 Original Reference Number
G1 Prior Authorization Number
G3 Predetermination of Benefits Identification Number
IG Insurance Policy Number
SY Social Security Number","Hardcode as ""1L""",NA,,
2100,REF02,Reference Identification,R,"Min - 1
Max - 50",,Map this value from the DFF index 2.025,GroupCode,,
2100,REF,Rendering Provider Identification,S,,,,,,
2100,REF01,Reference Identification Qualifier,R,"Min - 2
Max - 3","0B State License Number
1A Blue Cross Provider Number
1B Blue Shield Provider Number
1C Medicare Provider Number
1D Medicaid Provider Number
1G Provider UPIN Number
1H CHAMPUS Identification Number
1J Facility ID Number
D3 National Council for Prescription Drug Programs
Pharmacy Number
G2 Provider Commercial Number
LU Location Number",NA,NA,,
2100,REF02,Reference Identification,R,"Min - 1
Max - 50",,NA,NA,,
2100,DTM,Statement From or To Date,S,,,,,,
2100,DTM01,Date/Time Qualifier,R,"Min - 3
Max - 3",232 Claim Statement Period Start,"Hardcode as ""232""",NA,Only map when linelevel date is not present,
2100,DTM02,Date,R,"Min - 8
Max - 8",,Map this value from the DFF index 2.062,From Date,Date format is YYYYMMDD,
2100,DTM01,Date/Time Qualifier,R,"Min - 3
Max - 3",233 Claim Statement Period End,"Hardcode as ""233""",,Only map when linelevel date is not present,
2100,DTM02,Date,R,"Min - 8
Max - 8",,Map this value from the DFF index 2.063,To Date,Date format is YYYYMMDD,
2100,DTM,Coverage Expiration Date,S,,,,,,
2100,DTM01,Date Time Qualifier,R,"Min - 3
Max - 3",036 Expiration,Hardcode as “036”,NA,Coverage Expiration Date (DTM*036) should be populated only if one of the adjustment codes on the Line level is “27”,
2100,DTM02,Expiration Date,R,"Min - 8
Max - 8",,Map this value from the DFF index 2.042,CoverageExpiration,Date format is YYYYMMDD,
2100,DTM,Claim Received Date,S,,,,,,
2100,DTM01,Date Time Qualifier,R,"Min - 3
Max - 3",050 Received,Hardcode as “050”,NA,,
2100,DTM02,Received Date,R,"Min - 8
Max - 8",,Map this value from the DFF index 2.051,Claim Received Date,Date format is YYYYMMDD,
2100,PER,Claim Contact Information,S,,,,,,
2100,PER01,Contact Function Code,R,"Min - 2
Max - 2",CX Payers Claim Office,NA,NA,,
2100,PER02,Name,S,"Min - 1
Max - 60",,NA,NA,,
2100,PER03,Communication Number Qualifier,R,"Min - 2
Max - 2","EM Electronic Mail
FX Facsimile
TE Telephone",NA,NA,,
2100,PER04,Communication Number,R,"Min - 1
Max - 256",,NA,NA,,
2100,PER05,Communication Number Qualifier,S,"Min - 2
Max - 2","EM Electronic Mail
EX Telephone Extension
FX Facsimile
TE Telephone",NA,NA,,
2100,PER06,Communication Number,S,"Min - 1
Max - 256",,NA,NA,,
2100,PER07,Communication Number Qualifier,S,"Min - 2
Max - 2",EX Telephone Extension,NA,NA,,
2100,PER08,Communication Number,S,"Min - 1
Max - 256",,NA,NA,,
2100,AMT,Claim Supplemental Information,S,,,,,,
2100,6,Amount Qualifier Code,R,"Min - 1
Max - 3","AU Coverage Amount
D8 Discount Amount
DY Per Day Limit
F5 Patient Amount Paid
I Interest
NL Negative Ledger Balance
T Tax
T2 Total Claim Before Taxes
ZK Federal Medicare or Medicaid Payment Mandate -
Category 1
ZL Federal Medicare or Medicaid Payment Mandate -
Category 2
ZM Federal Medicare or Medicaid Payment Mandate -
Category 3
ZN Federal Medicare or Medicaid Payment Mandate -
Category 4
ZO Federal Medicare or Medicaid Payment Mandate -
Category 52","Hardcode as ""AU""",NA,,
2100,AMT02,Claim Supplemental Information Amount,R,"Min - 1
Max - 18",,Map this value from the DFF index 2.053,Prompt Pay Discount,This mapping required when the amount is greater than zero.,
2100,AMT01,Amount Qualifier Code,R,"Min - 1
Max - 3","AU Coverage Amount
D8 Discount Amount
DY Per Day Limit
F5 Patient Amount Paid
I Interest
NL Negative Ledger Balance
T Tax
T2 Total Claim Before Taxes
ZK Federal Medicare or Medicaid Payment Mandate -
Category 1
ZL Federal Medicare or Medicaid Payment Mandate -
Category 2
ZM Federal Medicare or Medicaid Payment Mandate -
Category 3
ZN Federal Medicare or Medicaid Payment Mandate -
Category 4
ZO Federal Medicare or Medicaid Payment Mandate -
Category 52","Hardcode as ""I""",NA,,
2100,AMT02,Claim Supplemental Information Amount,R,"Min - 1
Max - 18",,Map this value from the DFF index 2.052,Interest Amounts,,
2100,QTY,Claim Supplemental Information Quantity,S,,,,,,
2100,QTY01,Quantity Qualifier,R,"Min - 2
Max - 2","CA Covered - Actual
CD Co-insured - Actual
LA Life-time Reserve - Actual
LE Life-time Reserve - Estimated
NE Non-Covered - Estimated
NR Not Replaced Blood Units
OU Outlier Days
PS Prescription
VS Visits
ZK Federal Medicare or Medicaid Payment Mandate -
Category 1
ZL Federal Medicare or Medicaid Payment Mandate -
Category 2
ZM Federal Medicare or Medicaid Payment Mandate -
Category 3
ZN Federal Medicare or Medicaid Payment Mandate -
Category 4
ZO Federal Medicare or Medicaid Payment Mandate -
Category 5",NA,NA,,
2100,QTY02,Quantity,R,"Min - 1
Max - 15",,NA,NA,,
LOOP 2110 Service Payment Information,,,,,,,,,
2110,SVC,SERVICE PAYMENT INFORMATION,S,,,,,,
2110,SVC01,"COMPOSITE MEDICAL PROCEDURE
IDENTIFIER",R,"Min -
Max -",,NA,NA,,
2110,SVC01-1,Product/Service ID Qualifier,R,"Min - 2
Max - 2","AD American Dental Association Codes
ER Jurisdiction Specific Procedure and Supply Codes
HC Health Care Financing Administration Common
HP Health Insurance Prospective Payment System
IV Home Infusion EDI Coalition (HIEC) Product/Service
Code
N4 National Drug Code in 5-4-2 Format
N6 National Health Related Item Code
NU National Uniform Billing Committee (NUBC) UB92
Codes
UI U.P.C. Consumer Package Code (1-5-5)
WK Advanced Billing Concepts (ABC) Codes","If the procedure code(3.007) is present in DFF, then we need to Hardcode as ""HC""
Else If the procedure code (3.007) is blank and revenue code is present in index 3.034 then we need hardcode as ""NU""",NA,,
2110,SVC01-2,Product/Service ID,R,"Min - 1
Max - 48",,"If the procedure code is present Map this value from the DFF index 3.007
Else If the procedure code is blank and revenue code is present Map the value from the DFF index 3.034",ProcedureCode,,
2110,SVC01-3,PROCEDURE MODIFIER,S,"Min - 2
Max - 2",,Map this value from the DFF index 3.031,Procedure Modifier,,
2110,SVC01-4,PROCEDURE MODIFIER 2,S,"Min - 2
Max - 2",,Map this value from the DFF index 3.031.1,Procedure Modifier 2,,
2110,SVC01-5,PROCEDURE MODIFIER 3,S,"Min - 2
Max - 2",,Map this value from the DFF index 3.031.2,Procedure Modifier 3,,
2110,SVC01-6,PROCEDURE MODIFIER 4,S,"Min - 2
Max - 2",,Map this value from the DFF index 3.031.3,Procedure Modifier 4,,
2110,SVC01-7,Procedure Code Description,NA,NA,NA,NA,NA,,
2110,SVC02,Monetary Amount,R,"Min - 1
Max - 18",,Map this value from the DFF index 3.010,ChargeAmount,,
2110,SVC03,Monetary Amount,R,"Min - 1
Max - 18",,Map this value from the DFF index 3.019,PaidAmount,,
2110,SVC04,NUBC Revenue Code,S,"Min - 1
Max - 48",,When the procedure code is present and revenue code is present then Map SVC04 from the DFF index 3.034,Revenue Code,,
2110,SVC05,Units of Service Paid Count,S,"Min - 1
Max - 15",,Map this value from the DFF index 3.024,Units,The SVC05(Paid Units) required when the paid units of service are different than one if not required,
2110,SVC06-1,PRODUCT/SERVICE ID QUALIFIER,R,"Min - 2
Max - 2","AD American Dental Association Codes
ER Jurisdiction Specific Procedure and Supply Codes
HC Health Care Financing Administration Common
Procedural Coding System (HCPCS) Codes
HP Health Insurance Prospective Payment System
(HIPPS) Skilled Nursing Facility Rate Code
IV Home Infusion EDI Coalition (HIEC) Product/Service
Code
N4 National Drug Code
NU National Uniform Billing Committee (NUBC) UB92
Codes
WK Advanced Billing Concepts (ABC) Codes",Map this value from the DFF index 3.043,"Place holder for Submitted Product/Service id qualifier

Mapped based on getPaymentDetailsByIDResponse/paymentDetails/heexns:paymentExtract/eopPayment/eopClaimDetails/claim/claimLine/claimLine/serviceCode",Map SVC06 only when the valuein 3.007 is different from 3.044 (Service code),"PSD Ticket#502, 500, 499 based upon grooming call dated 11/7 , we are working along with IPlus team to analyse the feasiblity"
2110,SVC06-2,Procedure Code,R,"Min - 1
Max - 48",,Map this value from the DFF index 3.044,"Place holder for Submitted ProcedureCode

getPaymentDetailsByIDResponse/paymentDetails/heexns:paymentExtract/eopPayment/eopClaimDetails/claim/claimLine/claimLine/serviceCode",,
2110,SVC06-3,Procedure Modifier 1,S,"Min - 2
Max - 2",,Map this value from the DFF index 3.045,"Place holder for Submitted Procedure Modifier

getPaymentDetailsByIDResponse/paymentDetails/heexns:paymentExtract/eopPayment/eopClaimDetails/claim/claimLine/claimLine/modifierList",,
2110,SVC06-4,Procedure Modifier 2,S,"Min - 2
Max - 2",,Map this value from the DFF index 3.046,"Place holder for Submitted Procedure Modifier 2

getPaymentDetailsByIDResponse/paymentDetails/heexns:paymentExtract/eopPayment/eopClaimDetails/claim/claimLine/claimLine/modifierList",,
2110,SVC06-5,Procedure Modifier 3,S,"Min - 2
Max - 2",,Map this value from the DFF index 3.047,"Place holder for Submitted Procedure Modifier 3

getPaymentDetailsByIDResponse/paymentDetails/heexns:paymentExtract/eopPayment/eopClaimDetails/claim/claimLine/claimLine/modifierList",,
2110,SVC06-6,Procedure Modifier 4,S,"Min - 2
Max - 2",,Map this value from the DFF index 3.048,"Place holder for Submitted Procedure Modifier 4

getPaymentDetailsByIDResponse/paymentDetails/heexns:paymentExtract/eopPayment/eopClaimDetails/claim/claimLine/claimLine/modifierList",,
2110,SVC06-7,Procedure Code Description,S,"Min - 1
Max - 80",,NA,NA,,
2110,SVC07,Original Units of Service Count,S,"Min - 1
Max - 15",,Map this value from the DFF index 3.036,Original Units,The SVC07(Submitted Units) required when the paid unites of service provided in SVC05 is different from the submitted units of service from the original claim.,
2110,DTM,Service Start Date,S,,,,,,
2110,DTM01,Date Time Qualifier,R,"Min - 3
Max - 3",150 Service Period Start,"Hardcode as ""150""",NA,"1) Format the date to the below format ""YYYYMMDD""
2) If 3.005 and 3.006 same then map the DTM segment with qualifier 472(Rows 364 and 365).
Else If 3.005 is not equal to 3.006 Map the DTM segment with qualifiers 150 and 151(Rows 358 till 362)",
2110,DTM02,Service Date,R,"Min - 8
Max - 8",,Map this value from the DFF index 3.005,FromDate,,
2110,DTM,Service End Date,S,,,NA,NA,,
2110,DTM01,Date Time Qualifier,R,"Min - 3
Max - 3",151 Service Period End,"Hardcode as ""151""",NA,,
2110,DTM02,Service End Date,R,"Min - 8
Max - 8",,Map this value from the DFF index 3.006,ToDate,,
2110,DTM,Service Date,S,,,,,,
2110,DTM01,Date Time Qualifier,R,"Min - 3
Max - 3",472 Service,"Hardcode as ""472""",NA,,
2110,DTM02,Service Date,R,"Min - 8
Max - 8",,"Date format ""YYYYMMDD""",NA,,
2110,CAS,Service Adjustment,S,,,,,,
2110,CAS01,Claim Adjustment Group Code,R,"Min - 1
Max - 2","CO Contractual Obligations
OA Other adjustments
PI Payor Initiated Reductions",Map this value from the DFF index 4.011,CAGC,,
2110,CAS02,Claim Adjustment Reason Code,R,"Min - 1
Max - 5",,Map this value from the DFF index 4.009,CARC,,
2110,CAS03,Monetary Amount,R,"Min - 1
Max - 18",,Map this value from the DFF index 4.008,835 Adjusted Amount,,
2110,CAS04,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2110,CAS05,Claim Adjustment Reason Code,S,"Min - 1
Max - 2",,Map the same logic present in Rows 367 and 368,Map the same logic present in Rows 367 and 368,,
2110,CAS06,Monetary Amount,S,"Min - 1
Max - 18",,,,,
2110,CAS07,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2110,CAS08,Claim Adjustment Reason Code,S,"Min - 1
Max - 2",,Map the same logic present in Rows 367 and 368,Map the same logic present in Rows 367 and 368,,
2110,CAS09,Monetary Amount,S,"Min - 1
Max - 18",,,,,
2110,CAS10,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2110,CAS11,Claim Adjustment Reason Code,S,"Min - 1
Max - 2",,Map the same logic present in Rows 367 and 368,Map the same logic present in Rows 367 and 368,,
2110,CAS12,Monetary Amount,S,"Min - 1
Max - 18",,,,,
2110,CAS13,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2110,CAS14,Claim Adjustment Reason Code,S,"Min - 1
Max - 2",,Map the same logic present in Rows 367 and 368,Map the same logic present in Rows 367 and 368,,
2110,CAS15,Monetary Amount,S,"Min - 1
Max - 18",,,,,
2110,CAS16,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2110,CAS17,Claim Adjustment Reason Code,S,"Min - 1
Max - 2",,Map the same logic present in Rows 367 and 368,Map the same logic present in Rows 367 and 368,,
2110,CAS18,Monetary Amount,S,"Min - 1
Max - 18",,,,,
2110,CAS19,Quantity,S,"Min - 1
Max - 15",,NA,NA,,
2110,REF,Service Identification,S,,,,,,
2110,REF01,Reference Identification Qualifier,R,"Min - 2
Max - 3","1S Ambulatory Patient Group (APG) Number
APC Ambulatory Payment Classification
BB Authorization Number
E9 Attachment Code
G1 Prior Authorization Number
G3 Predetermination of Benefits Identification Number
LU Location Number
RB Rate code number",NA,NA,,
2110,REF02,Provider Identifier,R,"Min - 1
Max - 50",,NA,NA,,
2110,REF,Line Item Control Number,S,,,,,,
2110,REF01,Reference Identification Qualifier,R,"Min - 2
Max - 3",6R Provider Control Number,"Hardcode as ""6R""",NA,,
2110,REF02,Reference Identification,R,"Min - 1
Max - 50",,Map this value from the DFF index 3.037,Line Item Control Number,,
2110,REF,Rendering Provider Information,S,,,,,,
2110,REF01,Reference Identification Number,R,"Min - 2
Max - 3","0B State License Number
1A Blue Cross Provider Number
1B Blue Shield Provider Number
1C Medicare Provider Number
1D Medicaid Provider Number
1G Provider UPIN Number
1H CHAMPUS Identification Number
1J Facility ID Number
D3 National Council for Prescription Drug Programs
G2 Provider Commercial Number
HPI Centers for Medicare and Medicaid Services
National Provider Identifier
SY Social Security Number
TJ Federal Taxpayer’s Identification Number",NA,NA,,
2110,REF02,Rendering Provider Federal ID,R,"Min - 1
Max - 50",,NA,NA,"Corresponding identifier, Federal ID differs from provider to provider.",
2110,REF,HealthCare Policy Identification,S,,,,,,
2110,REF01,Reference Identification Qualifier,R,"Min - 2
Max - 3",0K Policy Form Identifying Number,NA,NA,,
2110,REF02,Reference Identification,R,"Min - 1
Max - 50",,NA,NA,,
2110,AMT,Service Supplemental Amount,S,,,,,,
2110,AMT01,Amount Qualifier Code,R,"Min - 1
Max - 3","B6 Allowed - Actual
KH Deduction Amount
T Tax
T2 Total Claim Before Taxes
ZK Federal Medicare or Medicaid Payment Mandate -
Category 1
ZL Federal Medicare or Medicaid Payment Mandate -
Category 2
ZM Federal Medicare or Medicaid Payment Mandate -
Category 3
ZN Federal Medicare or Medicaid Payment Mandate -
Category 4
ZO Federal Medicare or Medicaid Payment Mandate -
Category 5","Hardcode as ""B6""",NA,,
2110,AMT02,Service Line Allowed Amount,R,"Min - 1
Max - 18",,Map this value from the DFF index 3.033,Allowed Amount,This mapping required when the amount is greater than zero.,
2110,QTY,Service Supplemental Quantity,S,,,,,,
2110,QTY01,Quantity Qualifier,R,"Min - 2
Max - 2","ZK Federal Medicare or Medicaid Payment Mandate -
Category 1
ZL Federal Medicare or Medicaid Payment Mandate -
Category 2
ZM Federal Medicare or Medicaid Payment Mandate -
Category 3
ZN Federal Medicare or Medicaid Payment Mandate -
Category 4
ZO Federal Medicare or Medicaid Payment Mandate -
Category 5",NA,NA,,
2110,QTY02,Quantity,R,"Min - 1
Max - 15",,NA,NA,,
2110,LQ,Health Care Remark Code,S,,,,,,
2110,LQ01,Service Line Remittance Remark Code 1,R,"Min - 1
Max - 3","HE Claim Payment Remark Codes
RX National Council for Prescription Drug Programs","Hardcode as ""HE""",NA,,
2110,LQ02,Service Line Remittance Remark Code 2,R,"Min - 1
Max - 30",,Map this value from the DFF index 4.01,RARC,,
2110,PLB,Provider Adjustment,S,,,,,,
2110,PLB01,Provider Identifier,R,"Min - 1
Max - 50",,Map this value from the DFF index 1.033,Payee NPI,,
2110,PLB02,Fiscal Period Date,R,"Min - 8
Max - 8",,System Date YYYYMMDD format - December 31 of current year for example - 20231231,NA,"Last day of provider’s fiscal year(Financial Year) in YYYYMMDD format; if not known, December 31 of current year. (adjustment for the whole bill payment, monthly rebate , over payment )",
2110,PLB03-1,PROVIDER ADJUSTMENT REASON CODE,R,"Min - 2
Max - 2",20,Map this value from the DFF index 4.007,ProviderAdjustmentCode,,
2110,PLB03-2,Provider Adjustment Identifier,R,"Min - 1
Max - 50",,Map this value from the DFF index 4.013,PLB Identifier,,
2110,PLB04,Provider Adjustment Amount,R,"Min - 1
Max - 18",,Map this value from the DFF index 4.008,835 Adjusted Amount,,
2110,PLB05,Provider Adjustment Identifier,S,"Min - 1
Max - 50",,NA,NA,,
2110,PLB05-1,PROVIDER ADJUSTMENT REASON CODE,S,"Min - 2
Max - 2",,NA,NA,,
2110,PLB05-2,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2110,PLB06,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2110,PLB07,ADJUSTMENT IDENTIFIER,S,"Min - 1
Max - 50",,NA,NA,,
2110,PLB07-1,Adjustment Reason Code,S,"Min - 2
Max - 2",,NA,NA,,
2110,PLB07-2,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2110,PLB08,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2110,PLB09,ADJUSTMENT IDENTIFIER,S,"Min - 1
Max - 50",,NA,NA,,
2110,PLB09-1,Adjustment Reason Code,S,"Min - 2
Max - 2",,NA,NA,,
2110,PLB09-2,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2110,PLB010,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2110,PLB11,ADJUSTMENT IDENTIFIER,S,"Min - 1
Max - 50",,NA,NA,,
2110,PLB11-1,Adjustment Reason Code,S,"Min - 2
Max - 2",,NA,NA,,
2110,PLB11-2,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2110,PLB12,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
2110,PLB13,ADJUSTMENT IDENTIFIER,S,"Min - 1
Max - 50",,NA,NA,,
2110,PLB13-1,Adjustment Reason Code,S,"Min - 2
Max - 2",,NA,NA,,
2110,PLB13-2,Reference Identification,S,"Min - 1
Max - 50",,NA,NA,,
2110,PLB14,Monetary Amount,S,"Min - 1
Max - 18",,NA,NA,,
SE - TRANSACTION SET TRAILER,,,,,,,,,
,SE,Transaction Set Trailer,R,,,,,,
,SE01,Number Of Included Segments,R,"Min - 1
Max - 10",,"Total number of segments included in a transaction set including ST and SE
segments",NA,,
,SE02,Transaction Set Control Number,R,"Min -
Max -",,STO2 Value,NA,,
,GE,Functional Group Trailer,R,,,,,,
,GE01,Number of Transaction Sets Included,R,"Min -
Max -",,"Total number of transaction sets included in the functional group or interchange
(transmission) group terminated by the trailer containing this data element",NA,,
,GE02,Group Control Number,R,"Min -
Max -",,GS06 Value,NA,,
Interchange Control Loop (End),,,,,,,,,
,IEA,Interchange Control Trailer,R,,,,,,
,IEA01,Number of Included Functional Groups,R,"Min -
Max -",,A count of the number of functional groups included in an interchange,NA,,
,IEA02,Interchange Control Number,R,"Min -
Max -",,ISA13 Value,NA,,
```

## Payment OB/V26.1.1.1/EdifecsProduct_Mapping Spec_OutboundPayment_835_DFF_to_EDIConversion_V2.1.xlsx — Payment Extract

```csv
Record Type 1 Payment Level Information,,,,,,
,,,,,,
INDEX,DATA ELEMENT,DATA TYPE,REQ,DESCRIPTION,Highmark Comments,UST
1.001,Record,Varchar(4),Required,0001,,
1.002,BatchKey,Varchar(75),Required,See key generation,,
1.003,CheckNumberPrefix,Varchar(4),Optional,The prefix for the check number assigned to the check.,,
1.004,CheckNumber,Varchar(25),Optional,The check number assigned to the check.,,
1.005,CheckDate,Date,Optional,The check date MMDDYYYY,,
1.006,CheckAmount,Money,Required,The numeric payment for the check,,
1.007,FractionTransitNumber,Varchar(25),Optional,"The Fractional Transit Number for the bank, as held in Fund Accounting for the applicable account for the group.",,
1.008,MICRTransitNumber,Varchar(9),Required,"The MICR Transit Number for the bank, as held in Fund Accounting for the applicable account for the group.",,
1.009,AccountNumber,Varchar(255),Required,"The Bank Account Number for the bank, as held in Fund Accounting for the applicable account for the group.",,
1.010,BankName,Varchar(255),Required,The Bank Name,,
1.011,BankAddress1,Varchar(255),Optional,The first bank address field,,
1.012,BankAddress2,Varchar(255),Optional,The second bank address field,,
1.013,BankCity,Varchar(255),Optional,The city for the bank,,
1.014,BankState,Varchar(2),Optional,The state for the bank,,
1.015,BankZip,Varchar(10),Optional,The zip for the bank,,
1.016,BankCountry,Varchar(255),Optional,The country code for the bank,,
1.017,PayeeName,Varchar(255),Required,The payee name. This is the recipient for the check.,,
1.018,PayeeAddress1,Varchar(255),Required,The first address line for the payee,,
1.019,PayeeAddress2,Varchar(255),"Required, if available",The second address line for the payee,Missing in the sample PNC extract,If address Line 2 is available in HRP this will be populated
1.020,PayeeCity,Varchar(255),Required,The city for the payee,,
1.021,PayeeState,Varchar(2),Required,The state for the payee,,
1.022,PayeeZip,Varchar(10),Required,The zip for the payee,,
1.023,PayeeCountry,Varchar(255),Required,The country for the payee,,
1.024,SpecHandle,Varchar(10),Optional,"Special Handling for the payment, i.e. reinsurance",,
1.025,ResponseType,Varchar(10),Optional,"Indicates the original response provided by payment vendor in the Response File (2). Valid values are: Payment, 835Only, None.",Missing in the sample PNC extract,This was a required field for another client. For 835 generation this is not used. Marked as optional field
1.026,PPO Network Contract Identifier,Varchar(3),Optional,"(If Available)PPO Contract Identifier from ClaimHeader. For provider voucher processing, it is assumed that the first non-blank PPO Contract Identifier will be communicated (if available).",Missing in the sample PNC extract,This was a required field for another client. For 835 generation this is not used. Marked as optional field
1.027,Provider Phone Number,Varchar(15),Optional,,,
1.028,Provider Email,Varchar(100,Optional,,,
1.029,Provider Type,Varchar(50),Optional,Provider taxonomy code,,
1.030,Provider TIN Sequence Code,Varchar(10),Optional,Sequence code for the payee provider,Missing in the sample PNC extract,This was a required field for another client. For 835 generation this is not used. Marked as optional field
1.031,Paid To,Varchar(1),Required,"if Fully Funded Paid To (E=Employee, D=Dependent, M = Member, P=Provider, S=Split pay)",,
1.032,Payee SSN/TIN,Varchar(9),Required,(if Member Payment) Payee SSN or TIN,,
1.033,Payee NPI,Int,Required,(If Available) The NPI for the payee provider,,
,,,,,,
,,,,,,
,,,,,,
Record Type 2 Claim Level Information,,,,,,
,,,,,,
INDEX,Data Element,Data Type,REQ,Description,,
2.001,Record,Varchar(4),Required,002,,
2.002,BatchKey,Varchar(75),Required,See key generation,,
2.003,ClaimNumber,Varchar(50),Required,The claim number assigned for the claim.,,
2.004,EOBNumber,Varchar(10),Optional,The EOB number assigned for the claim.,,
2.005,PatientID,Varchar(30),Required,The patient account number for the claim. This is assigned by the provider (ie. SSN),,
2.006,PatientName,Varchar(255),Required,The patient's name,,
2.007,PatientDOB,Date,Optional,The patient's Date of Birth.   MMDDYYYY,Missing in the sample PNC file,Marking as optional as it is not used for 835 mapping
2.008,ParticipantKey,Varchar(30),Optional,The insured's employee number Enrollee Member ID,Missing in the sample PNC file,Marking as optional as it is not used for 835 mapping
2.009,ParticipantName,Varchar(255),Optional,The insured's name,,
2.01,ParticipantAddress1,Varchar(255),Optional,The first address line for the insured,,
2.011,ParticipantAddress2,Varchar(255),Optional,The second address line for the insured,,
2.012,ParticipantCity,Varchar(255),Optional,The city for the insured,,
2.013,ParticipantState,Varchar(2),Optional,The state for the insured,,
2.014,ParticipantZip,Varchar(10),Optional,The zip for the insured,,
2.015,ParticipantCountry,Varchar(255),Optional,The country for the insured,,
2.016,ProviderNPI,Int,Required (If Available),The NPI for the provider of service,Missing in the sample PNC file,Available in the sample file.
2.017,ProviderTIN,Varchar(9),Required (If Available),The TIN for the provider of service,Missing in the sample PNC file,
2.017.1,Provider TIN Sequence Code,Varchar(7),Required (If Available),Sequence code for the providers,Missing in the sample PNC file,
2.018,ProviderName,Varchar(255),Required (If Available),The provider's name,Missing in the sample PNC file,
2.019,ProviderAddress1,Varchar(255),Required (If Available),The first address line for the provider,Missing in the sample PNC file,
2.02,ProviderAddress2,Varchar(255),Required (If Available),The second address line for the provider,Missing in the sample PNC file,
2.021,ProviderCity,Varchar(255),Required (If Available),The city for the provider,Missing in the sample PNC file,
2.022,ProviderState,Varchar(2),Required (If Available),The state for the provider,Missing in the sample PNC file,
2.023,ProviderZip,Varchar(10),Required (If Available),The zip for the provider,Missing in the sample PNC file,
2.024,ProviderCountry,Varchar(255),Required (If Available),The country for the provider,Missing in the sample PNC file,
2.025,GroupCode,Varchar(30),Required (If Available),The Group number for the insured,Missing in the sample PNC file,
2.026,GroupSubCode,Varchar(30),Required (If Available),The Sub Group number for the insured,,
2.027,GroupName,Varchar(255),Required (If Available),The group name for the insured.,,
2.028,ChargeAmount,Money,Required,"The amount billed, for all service lines for this claim.",,
2.029,PPODiscountAmount,Money,Required (If Available),"The PPO discount amount, for all service lines for this claim.",Missing in the sample PNC file,
2.03,RNCDiscountAmount,Money,Required (If Available),"The Reasonable and customary amount, for all service lines for this claim.",Missing in the sample PNC file,
2.031,COBAmount,Money,Required (If Available),"The COB amount, for all service lines for this claim for this claim",Missing in the sample PNC file,
2.032,DeductableAmount,Money,Required (If Available),The total amount applied to a deductible for all service lines for this claim,Missing in the sample PNC file,
2.033,CoInsuranceAmount,Money,Required (If Available),The total amount of Co -Insurance for all service lines for this claim,Missing in the sample PNC file,
2.034,CopayAmount,Money,Required (If Available),The total amount of the co-pay for all service lines for this claim,Missing in the sample PNC file,
2.035,SumDedCoinsCopayAmount,Money,Required (If Available),"The SUM of all Deductible Amounts, Co - Insurance, and CoPay for all service lines for this claim.",Missing in the sample PNC file,
2.036,OtherAdjustmentsAmount,Money,Required (If Available),The total amount of all other adjustments for all service lines for this claim. This will include all other adjustments not mentioned individually above.,Missing in the sample PNC file,
2.037,PaidAmount,Money,Required,"The total plan paid amount, for all service lines for this claim.",,
2.038,PatientOwedAmount,Money,Required (If Available),The employee responsibility for the service line,Missing in the sample PNC file,
2.039,PatientPaidAmountTotal,Money,Required (If Available),"The total patient paid amount, for all service lines for this claim.",,
2.04,ClaimStatusCode,Varchar(5),Required (If Available),"Determined based on whether it is a primary paid, denied, or reversal claim, etc. (1, 4, 22, etc.).",,
2.041,AlternateProcedureCode,Varchar(15),Required (If Available),Alternate Procedure Code/DRG. For Institutional Claims with DRG code.,Missing in the sample PNC file,
2.042,CoverageExpiration,Date,Required (If Available),Expiration date of patient’s coverage.,Missing in the sample PNC file,
2.043,AdjudicationAllowedAmount,Money,Required (If Available),This value is calculated as (Charge) minus (PPO Discount/RNC Discount) minus (Ineligible Amounts).,Missing in the sample PNC file,
2.044,Provider NAIC Code,Varchar(255),Required (If Available),National Association of Insurance Commissioners (NAIC) Code,Missing in the sample PNC file,
2.045,Corrected Patient/Insured Name,Varchar(255),Required (If Available),Corrected information about the patient or insured.,Missing in the sample PNC file,
2.046,Corrected Patient/Insured Member ID,Varchar(255),Required (If Available),Insured's Changed Unique Identification Number,Missing in the sample PNC file,
2.047,Corrected Priority Payer Name,Varchar(255),Required (If Available),Another payer has priority for making a payment and the claim is not being automatically transferred to that payer. This is the name of the new priority payer.,Missing in the sample PNC file,
2.048,Corrected Priority Payer NAIC or TIN,Varchar(255),Required (If Available),Another payer has priority for making a payment and the claim is not being automatically transferred to that payer. This is the unique id of the new priority payer.,Missing in the sample PNC file,
2.049,Corrected Priority Payer Subscriber Name,Varchar(255),Required (If Available),Another payer has priority for making a payment and the claim is not being automatically transferred to that payer. This is the name of the subscriber with the new priority payer.,Missing in the sample PNC file,
2.05,Corrected Priority Payer Subscriber Member Id,Varchar(255),Required (If Available),Another payer has priority for making a payment and the claim is not being automatically transferred to that payer. This is the name of the subscriber id the new priority payer.,Missing in the sample PNC file,
2.051,Claim Received Date,Date,Required,This is the date that the claim was received by the payer.,,
2.052,Interest Amounts,Money,Not Required,Use this monetary amount for the interest amount,Missing in the sample PNC file,This is not required field
2.053,Prompt Pay Discount,Money,Required (If Available),,Missing in the sample PNC file,
2.054,Over Coinsurance Maximum Amount,Money,Required (If Available),This is the total over coinsurance maximum ineligible amounts for the claim,Missing in the sample PNC file,
2.055,Over Benefit Maximum Amount,Money,Required (If Available),This is the total over benefit maximum ineligible amounts for the claim,Missing in the sample PNC file,
2.056,Over Period A Maximum Amount,Money,Required (If Available),This is the total Period A maximum ineligible amounts for the claim,Missing in the sample PNC file,
2.057,Over Period B Maximum Amount,Money,Required (If Available),This is the total Period B maximum ineligible amounts for the claim,Missing in the sample PNC file,
2.058,Miscellaneous Ineligible Amount,Money,Required (If Available),This is the total of any ineligible amounts not otherwise defined for the claim,Missing in the sample PNC file,
2.059,PPO Network Contract Identifier,Varchar(3),Required (If Available),"PPO Contract Identifier from Claim Header.  For provider voucher processing, this field may contain a different value than the value sent in the Pre-Pass record since there may be multiple record type 0002 records per voucher payment (if available).",Missing in the sample PNC file,
2.06,Provider Type,Varchar(50),Optional,Provider taxonomy code,Missing in the sample PNC file,
2.061,Facility Code Value,Varchar(50),Required (If Available),"Code identifying where services were, or may be, performed; the first and second positions of the Uniform Bill Type Code for Institutional Services or the Place of Service Codes for Professional or Dental Services. Loop 2100 CLP08 from the 835 specifications. Since professional or dental claims can have different place of service codes for services within a single claim, default to the place of service of the first service line when the service lines are not all for the same place of service. This number was received in CLM05-1 of the 837 claims.",,
2.062,From Date,DateTime,Required (If Available),"2100 DTM FROM AND TO DATES. Claim service date, may be overridden at the service level.
Required when the “Statement From or To Dates” are not supplied at the service (2110 loop) level. Dates at the claim level apply to the entire claim, including all service lines. Dates at the service line level apply only to the service line where they appear. When claim dates are not provided, service dates are required for every service line. When claim dates are provided, service dates are not required, but if used they override the claim dates for individual service lines. If the claim statement period start date is conveyed without a subsequent claim statement period end date, the end date is assumed to be the same as the start date.",Missing in the sample PNC file,
2.063,To Date,DateTime,Optional,"2100 DTM FROM AND TO DATES. Claim service date, may be overridden at the service level.
Required when the “Statement From or To Dates” are not supplied at the service (2110 loop) level. Dates at the claim level apply to the entire claim, including all service lines. Dates at the service line. level apply only to the service line where they appear. When claim dates are not provided, service dates are required for every service line. When claim dates are provided, service dates are not required, but if used they override the claim dates for individual service lines.",Missing in the sample PNC file,
2.064,Claim Filing Indicator Code,Varchar(5)`,Required (If Available),"Loop 2100 CLP06 For many providers to electronically post the 835remittance data to their patient accounting systems without human intervention, a unique, provider-specific insurance plan code is needed. This code allows the provider to separately identify and manage the different product lines or contractual arrangements between the payer and the provider. Because most payers maintain the same Originating Company Identifier in the TRN03 or BPR10 for all product lines or contractual relationships, the CLP06 is used by the provider as a table pointer in combination with the TRN03 or BPR10 to identify the unique, provider-specific insurance plan code needed to post the payment without human intervention. The value should mirror the value received in the original claim (2-005 SBR09 of the 837), if applicable, or provide the value as assigned or edited by the payer. For example, the BL from the SBR09 in the 837 would be returned as 12, 13, 15, in the 835 when more details are known. The 837 SBR09 code CI (Commercial Insurance) is generic, if through adjudication the specific type of plan is obtained a more specific code must be returned in the 835.
12  Preferred Provider
Organization (PPO)
13  Point of Service (POS)
14  Exclusive Provider Organization
(EPO)
15  Indemnity Insurance
16  Health Maintenance
Organization (HMO) Medicare
Risk
17  Dental Maintenance
Organization
AM Automobile Medical
CH Champus
DS Disability
HM Health Maintenance
Organization
LM Liability Medical
MA Medicare Part A
MB Medicare Part B
MC Medicaid
OF Other Federal Program 1049 Use this code for the Black Lung Program.
TV Title V
VA Veterans Affairs Plan
WC Workers’ Compensation
Health Claim
ZZ Mutually Defined",,
2.065,Discharge Fraction,"Decimal(3,2)",Required (If Available),"Loop 2100 CLP13 Percentage expressed as a decimal (e.g., 0.0 through 1.0 represents 0% through
100%). Required when a discharge
fraction was applied in the adjudication process.",Missing in the sample PNC file,
2.066,Patient Type Identifier,Varchar(2),Required (If Available),“I” for inpatient and “O” for outpatient. Needed for RARC reporting.,Missing in the sample PNC file,
2.067,Original Reference Number,Varchar(50),Required (If Available),"When this is a correction claim and CLP07 does not equal the CLP07 value from the original claim payment, one iteration of this REF segment using this qualifier is REQUIRED to identify the original claim CLP07 value in REF02. See section 1.10.2.8, Reversals and Corrections, for additional information.",Missing in the sample PNC file,
2.068,DRG Weight,Varchar(15),Required (If Available),Loop 2100 CLP12. The average diagnosis-related group (DRG) weight.,Missing in the sample PNC file,
2.069,Diagnosis Related Group Code,Varchar(4),Required (If Available),"Loop 2100 CLP11. Code indicating a patient’s diagnosis group based on a patient’s illness, diseases, and medical problems. Required for institutional claims when the claim was adjudicated using a DRG.",Missing in the sample PNC file,
2.07,Other Subscriber Name,Varchar(100),Required (If Available),"2100 NM1.  LAST, FIRST. This is the name and ID number of the other subscriber when a corrected priority payer has been identified. When used, either the name or ID must be supplied. Required when a corrected priority payer has been identified in another NM1 segment AND the name or ID of the other subscriber is known. If not required by this implementation guide, do not send.",Missing in the sample PNC file,
2.071,CDHP Type,Nvarchar(3),Optional,"Possible Values:
DEP
FSA
HRA
LFS
TMT
TPC
TPR

Populated when a claim is a CDHP claim to indicate CDHP status.",Missing in the sample PNC file,
2.072,Relationship Code,Varchar(5),Optional,Code representing relationship of insured to patient,Missing in the sample PNC file,
2.073,Alternate Provider ID,Varchar(50),Required (If Available),Required when additional rendering provider identification numbers not already reported in the Provider NM1 segment for this claim were submitted on the original claim and impacted adjudication.,Missing in the sample PNC file,
2.074,Crossover Carrier Name,Varchar(255),Required (If Available),"Required when the claim is transferred to another carrier or coverage (CLP02 equals 19, 20, 21 or 23).",Missing in the sample PNC file,
2.075,Crossover Carrier NAIC or TIN,Varchar(255),Required (If Available),"Required when the claim is transferred to another carrier or coverage (CLP02 equals 19, 20, 21 or 23).",Missing in the sample PNC file,
2.076,Claim Contact Telephone,Varchar(256),Required (If Available),Required when there is a claim specific communications contact.,Missing in the sample PNC file,
2.077,Tax Amount,Money,Required (If Available),Required when tax is non-zero.,Missing in the sample PNC file,
2.078,Total Claim Before Tax,Money,Required (If Available),Used only when tax also applies to the claim.,Missing in the sample PNC file,
2.079,Patient Control Number,,Required,Patient Control Number,,
2.080,Patient Last name,,Required,Last name,,
2.081,Patient First name,,Required,First Name,,
2.082,Patient Middle name,,Required,Middle Name,,
2.083,Frequency Code,,Required,Frequency  Code,,
2.084,SubmittedPatientID,Varchar(30),Required,Patient member ID as originally submitted in the claim,,
2.085,SubmittedPatientFirstName,Varchar(255),Required,First Name as originally submitted in the claim,,
2.086,SubmittedPatientMiddleName,Varchar(255),Required,Middle Name as originally submitted in the claim,,
2.087,SubmittedPatientLastName,Varchar(255),Required,Last name as originally submitted in the claim. This will be used to send the submitted patient Full Name as it is in HRDW database.,,
2.088,SubscriberID,Varchar(30),Required,Subscriber ID if the patient is not subscriber,,
2.089,SubscriberFirstName,Varchar(255),Required,Subscriber First Name if the patient is not subscriber,,
2.090,SubscriberMiddleName,Varchar(255),Required,Subscriber Middle Name if the patient is not subscriber,,
2.091,SubscriberLastName,Varchar(255),Required,Subscriber Last Name if the patient is not subscriber,,
2.092,PractitionerFirstName,varchar(107),Required (If Available),Practitioner First Name from the Claim,,
2.093,PractitionerMiddleName,varchar(107),Required (If Available),Practitioner Middle Initial from the Claim,,
2.094,PractitionerLastName,varchar(107),Required (If Available),Practitioner last name from the Claim,,
,,,,,,
Record Type 3 Claim line Level Information,,,,,,
,,,,,,
INDEX,Data Element,Data Type,REQ,Description,,
3.001,Record,Varchar(4),Required,0003,,
3.002,BatchKey,Varchar(75),Required,See key generation,,
3.003,ClaimNumber,Varchar(50),Required,The claim number assigned for the claim.,,
3.004,ClaimLineNumber,Varchar(4),Required(If Available),The service line number is used to specify the order of the services rendered on the claim,,
3.005,FromDate,Date,Required (If Available),The incurred from date MMDDYYYY,,
3.006,ToDate,Date,Required (If Available),The incurred through date MMDDYYYY,,
3.007,ProcedureCode,Varchar(5),Required (If Available),The procedure code,,
3.008,ProcedureDescription,Varchar(40),Required (If Available),The procedure description,,
3.009,LayProcedureDescription,Varchar(40),Required (If Available),The layperson procedure description,Missing in the sample PNC file,
3.010,ChargeAmount,Money,Required,The amount billed for the serviceline,,
3.011,PPODiscountAmount,Money,Required(If Available),The discount amount for the service line,,
3.012,RNCDiscountAmount,Money,Required(If Available),The Reasonable and customaryamount for the service line,Missing in the sample PNC file,
3.013,COBAmount,Money,Required(If Available),The COB amount for the service line,Missing in the sample PNC file,
3.014,DeductableAmount,Money,Required(If Available),Any amount applied to the deductible for the service line,Missing in the sample PNC file,
3.015,CoInsuranceAmount,Money,Required (If Available),Co-Insurance Amount detail line,Missing in the sample PNC file,
3.016,CopayAmount,Money,Required (If Available),Co-Payment amount per detail line,Missing in the sample PNC file,
3.017,SumDedCoinsCopayAmount,Money,Required(If Available),"The SUM of all deductible amounts,Co-Insurance, and Co-Payment",Missing in the sample PNC file,
3.018,OtherAdjustmentsAmount,Money,Required(If Available),Any other adjustment amount perdetail line,Missing in the sample PNC file,
3.019,PaidAmount,Money,Required,The plan paid amount for the service line,,
3.020,PatientOwedAmount,Money,Required (If Available),The employee responsibility for the service line,Missing in the sample PNC file,
3.021,ServiceProviderName,Varchar(255),Conditional,Only required if the service providername is not the payee for the claim,Missing in the sample PNC file,
3.022,ServiceProviderNationalProviderID,Varchar(255),Conditional,Only required if the service provider ID is not the payee for the claim,,
3.023,Product/Service ID Qualifier,Varchar(255),Required,The database from which the procedure code is derived,Missing in the sample PNC file,This is not used for 835 mapping yet this will be populated if its available in HRP
3.024,Units,Int,Required (if available),Units on the claim line. This is required by HIPAA if units on the claim line are > 1,,
3.025,Previously Paid Amount,Money,Required (If Available),"The previously paid amount on the claim, for “underpayment reversal” claims. This amount corresponds tothe amount already paid on the claim, on a check that is NOT being reversed (although the claim in the adjudication system IS being reversed.",Missing in the sample PNC file,
3.026,Over Coinsurance Maximum Amount,Money,Required (If Available),This is the total over coinsurance maximum ineligible amounts for the claim,Missing in the sample PNC file,
3.027,Over Benefit Maximum Amount,Money,Required (If Available),This is the total over benefit maximum ineligible amounts for the claim,Missing in the sample PNC file,
3.028,Over Period A Maximum Amount,Money,Required (If Available),This is the total Period A maximum ineligible amounts for the claim,Missing in the sample PNC file,
3.029,Over Period B Maximum Amount,Money,Required (If Available),This is the total Period B maximum ineligible amounts for the claim,Missing in the sample PNC file,
3.030,Miscellaneous Ineligible Amount,Money,Required (If Available),This is the total of any ineligible amounts not otherwise defined for the claim,Missing in the sample PNC file,
3.031,Procedure Modifier,Varchar(60),Required (if applies),Loop 2110 SV01-3. This identifies the special circumstances related to the performance of the service.,Missing in the sample PNC file,
3.031.1,Procedure Modifier 2,Varchar(60),Required (if applies),Loop 2110 SV01-4. This identifies the special circumstances related to the performance of the service.,Missing in the sample PNC file,
3.031.2,Procedure Modifier 3,Varchar(60),Required (if applies),Loop 2110 SV01-5. This identifies the special circumstances related to the performance of the service.,Missing in the sample PNC file,
3.031.3,Procedure Modifier 4,Varchar(60),Required (if applies),Loop 2110 SV01-6. This identifies the special circumstances related to the performance of the service.,Missing in the sample PNC file,
3.032,Healthcare Policy ID,Varchar(50),Required(if available),"Loop 2110 REF02. Supply the Healthcare policy identifier as provided by the payer’s published Healthcare policy code list. This policy code will be used to explain the policy used to process the claim which resulted
in the adjusted payment.
Required when;
• The payment is adjusted in
accordance with the Payer’s
published Healthcare Policy Code
list and
•A Claim Adjustment Reason Code
identified by the notation, “refer to
835 Healthcare Policy identification
segment”, in the Claim Adjustment
Reason Code List is present in a
related CAS segment and
• The payer has a published
enumerated healthcare policy code
list available to healthcare
providers via an un-secure public
website.|",Missing in the sample PNC file,
3.033,Allowed Amount,Money,Required,Loop 2110 AMT*B6. Allowed amount on this service line. Allowed amount is the amount the payer deems payable prior to considering patient responsibility. This can also be the COB allowed amount on a secondary claim.,,
3.034,Revenue Code,Varchar(4),Required(if available),Loop 2110 SVC01-2. Used when SVC01-1 is NU. National Uniform Billing Committee Revenue code,Missing in the sample PNC file,
3.035,Composite Code,Varchar(80),Required(if available),Used when sending the full 835 composite procedure code already formed for SVC01,Missing in the sample PNC file,
3.036,Original Units,Integer,Required(if available),Loop 2101 SVC07. The original submitted units of service,Missing in the sample PNC file,
3.037,Line Item Control Number,Varchar(20),Required(if available),"Loop 2110 RF02. This is the Line Item Control Number submitted in the 837, which is utilized by the provider for tracking purposes. Note - the value in REF02 can include alpha characters. Required when a Line Item Control Number was received on the original claim or when claim or service line splitting has occurred. If not required by this implementation guide, do not send",,
3.038,Rendering Provider TIN,Varchar(20),Required (if different from claim),"Loop 2110 REF02. The Service provider TIN, if it is different from the claim TIN. Required when the rendering provider for this service is different than the rendering provider applicable at the claim level",Missing in the sample PNC file,
3.039,Rendering Provider NPI,Varchar(50),Required (if available),Rendering provider NPI. Required if different from claim level NPI.,,
3.040,Tax Amount,Money,Required (If Available),Required if tax is non-zero.,Missing in the sample PNC file,
3.041,Late Filing Deduction,Money,Required (If Available),Required when there is a Late Filing Reduction,Missing in the sample PNC file,
3.042,Total Claim Before Taxes,Money,Required (If Available),Use this monetary amount for the service charge before taxes. This is only used when there is an applicable tax amount on this service.,Missing in the sample PNC file,
3.043,Submitted Product/Service id qualifier,Varchar(255),Required,The database from which the procedure code is derived,,
3.044,Submitted ProcedureCode,Varchar(5),Required (If Available),The procedure code,,
3.045,Submitted Procedure Modifier,Varchar(60),Required (if applies),Loop 2110 SV01-3. This identifies the special circumstances related to the performance of the service.,,
3.046,Submitted Procedure Modifier 2,Varchar(60),Required (if applies),Loop 2110 SV01-4. This identifies the special circumstances related to the performance of the service.,,
3.047,Submitted Procedure Modifier 3,Varchar(60),Required (if applies),Loop 2110 SV01-5. This identifies the special circumstances related to the performance of the service.,,
3.048,Submitted Procedure Modifier 4,Varchar(60),Required (if applies),Loop 2110 SV01-6. This identifies the special circumstances related to the performance of the service.,,
,,,,,,
Record Layout 4 (Remarks/ adjustment level information),,,,,,
,,,,,,
INDEX,Data Element,Data Type,REQ,Description,,
4.001,Record,Varchar(4),Required,0004,,
4.002,BatchKey,Varchar(75),Required,See key generation,,
4.003,ClaimNumber,Varchar(50),Optional,The claim number assigned for the claim. Required if remark is at claim line or claim service line,,
4.004,ClaimLineNumber,Varchar(15),Optional,The claim line number assigned for the particular service line. Required if remark is at the claim service line,,
4.005,System Remark Code,Varchar(10),Required,The internal system remark code for a service line,,
4.006,System Remark Description,Varchar(1000),Required (If Available),The description used for the above remark code,,
4.007,ProviderAdjustmentCode,Varchar(2),Required (If Available),Adjustments to the actual payment that are NOT specific to a particular claim or service,Missing in the sample PNC file,
4.008,835 Adjusted Amount,Money,Required (If Available),The respective adjusted amount for the aforementioned Remark Code,,
4.009,CARC,Varchar(50),Required (If Available),Client CARC Code mapped to System Remark Code,,
4.01,RARC,Varchar(50),Required (If Available),Client RARC Code mapped to corresponding 4.009 CARC,,
4.011,CAGC,Varchar(50),Required (If Available),Client CAGC Code mapped to corresponding 4.009 CARC,,
4.012,Remark Type,Varchar(10),Required (If Available),Defines type of ineligible amount from Payments File Detail record,Missing in the sample PNC file,
4.013,PLB Identifier,Varchar(100),Required (if available),"835 Summary Field PLB03-2. Provider Level Adjustment Code related claim number of another identifier.
Required when a control, account or tracking number applies to this adjustment.
For example, for Provider Level Adjustment Code 72, PLB03-2 must always contain an identifying reference number when the value is used.
For code “CS”, you must provide supporting identification information in PLB03-2.",Missing in the sample PNC file,
4.014,Covered Days,Int,Required (if available),"The number of days being adjusted. A positive value decreases the covered days, and a negative number increases the covered days. CAS04, CAS07, CAS10, CAS13, CAS16, CAS19",Missing in the sample PNC file,
```

## Payment OB/V26.1.1.1/EdifecsProduct_Mapping Spec_OutboundPayment_835_DFF_to_EDIConversion_V2.1.xlsx — PSD Tickets

```csv
S/No,PSD Ticket#,Clarification From Customer
1,503,"1. Current payment HRP webservice and DFF data - it fetches the original submitted Insured ID or matched data?  Based on above, changes needed on DFF file, Edifecs mapping to map   insured/patient names separately as per TR3.
 1. Step-1  evaluate DFF
 2. Evaluate the impact in existing customers

2. We do not have placeholder for dependents in DFF yet, need to add that and perform mapping according to that in Edifecs"
2,"502, 500, 499","1. Details related to bundling and unbundling fields has to be shared in DFF before we proceed with Edifecs Mapping.
2. We can discuss on this once Theju is back"
```

## Payment OB/V26.1.1.1/EdifecsProduct_Mapping Spec_OutboundPayment_835_DFF_to_EDIConversion_V2.1.xlsx — Attachments

```csv
Sl #,Attachment Name,Attachment
1,Sample EDI 835,
,,
,,
,,
2,Sample DFF,
,,
,,
3,Sample Payment Extract,
```
