# Enrollment OB

## Enrollment OB/V26.1.1.0/EdifecsProduct_Mappingspec_OutboundEnrollment _834_XML_to_EDIConversion_V1.2.xlsx — Cover Sheet

```csv
Mapping Specification - Integration Plus _EDIFECS,,,,,,,,,
,,,,,,,,,
Business Area: Enrollment OB 834 XML to EDI Conversion,,,,,,,,,
,,,,,,,,,
This document provides the mapping specification for Outbound Enrollment XML to EDI 834 EDI Conversion. Document is intended for EDIFECS Product Team,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,Version,,V24.4.0.0,,,
,,,,,,,,,
,Distribution of this document is limited to  Associates and UST Healthproof,,,,,,,,
,,,,,,,,,
,Notice of Confidentiality and Custodial Responsibilities,,,,,,,,
,"This  document contains confidential information that is 's intellectual property. As a holder of this document, you  may NOT disclose its content or any information derived from it to  any person outside of   and UST Healthproof  Project Team",,,,,,,,
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

## Enrollment OB/V26.1.1.0/EdifecsProduct_Mappingspec_OutboundEnrollment _834_XML_to_EDIConversion_V1.2.xlsx — Version History

```csv
Revision History,,,,
,,,,
V#,Date,Author,Reviewer(s)/ Contributor(s),Comments
0.1,07/17/2023,Jishnu RK,Shijila Muralidharan,Created the initial draft
0.2,07/26/2023,Jishnu RK,Shijila Muralidharan,Made changes in segments as per 2nd review
0.3,4/18/2024,Ambily Raj,,Updated
0.4,24/12/2024,Swedha Kumar,Ambily Raj,Updated
1.0,27/12/2024,Swedha Kumar,Ambily Raj,Baselined
1.1,25/02/2025,Swedha Kumar,Ambily Raj,Added logic for medicareHICN tags - INTP- 14775
1.2,2/3/25,Swedha Kumar,,Added logic for LUI04 Mapping - INTP-17614
```

## Enrollment OB/V26.1.1.0/EdifecsProduct_Mappingspec_OutboundEnrollment _834_XML_to_EDIConversion_V1.2.xlsx — Mapping Outbound

```csv
Loop ID,Segment ID,Segment Name,Element Description,Enumeration Values,Length,User Option,XML Field,Mapping Logic,Configurable Field?,Comments
,ISA,Interchange Control Header,,,,,,,,
,ISA01,Authorization Information Qualifier,"The plans use 00
No Authorization Information Present Qualifier","00 No Authorization Information Present (No
Meaningful Information in I02)
03 Additional Data Identification",,,,"Hardcoded to ""00""",,
,ISA02,Authorization Information,Submitter-specific ID number or 10-space placeholder,,,,,Leave it blank,,
,ISA03,Security Information Qualifier,No Security Information Present Qualifier,"00 No Security Information Present (No Meaningful
Information in I04)
01 Password",,,,"Hardcoded to ""00""",,
,ISA04,Security Information,Submitter-specific ID number or 10-space placeholder,,,,,Leave it blank,,
,ISA05,Interchange ID Qualifier,"Federal Tax Id, Mutually Defined","01 Duns (Dun & Bradstreet)
14 Duns Plus Suffix
20 Health Industry Number (HIN)
CODE SOURCE 121: Health Industry Number
27 Carrier Identification Number as assigned by Health
Care Financing Administration (HCFA)
28 Fiscal Intermediary Identification Number as
assigned by Health Care Financing Administration
(HCFA)
29 Medicare Provider and Supplier Identification
Number as assigned by Health Care Financing
Administration (HCFA)
30 U.S. Federal Tax Identification Number
33 National Association of Insurance Commissioners
Company Code (NAIC)
ZZ Mutually Defined",,,,"Hardcode as ""ZZ""",,
,ISA06,Interchange Sender ID,Interchange Sender ID,,,,,"Hardcode as ""1234           """,Yes. Please refer comments,"Interchange Sender ID will be different for each customer.From product standpoint, we have hardcoded space and it will be configurable on implementation."
,ISA07,Interchange ID Qualifier,"Federal Tax Id, Mutually Defined","01 Duns (Dun & Bradstreet)
14 Duns Plus Suffix
20 Health Industry Number (HIN)
CODE SOURCE 121: Health Industry Number
27 Carrier Identification Number as assigned by Health
Care Financing Administration (HCFA)
28 Fiscal Intermediary Identification Number as
assigned by Health Care Financing Administration
(HCFA)
29 Medicare Provider and Supplier Identification
Number as assigned by Health Care Financing
Administration (HCFA)
30 U.S. Federal Tax Identification Number
33 National Association of Insurance Commissioners
Company Code (NAIC)
ZZ Mutually Defined",,,,"Hardcode as  ""ZZ""",,
,ISA08,Interchange Receiver ID,The Trading Partner ID (TPID) assigned,,,,,"Hardcode as ""1234           """,,"Interchange Receiver ID will be different for each customer.From product standpoint, it will be configurable on implementation."
,ISA09,Interchange Date,Date the Interchange is created,,,,,"Map this value from  current date in the format of ""YYMMDD""",,Date  transaction is created – done by translator  (Date for the Process of converting 834OB it will be the EDIFECS time of converting 834 OB ) YYMMDD
,ISA10,Interchange Time,Time the Interchange is created,,,,,Map this value from   current time in the format of HHMM,,
,ISA11,Interchange Control Standards Identifier,Repetition Separator,,,,,"Hardcode as ""^""",,
,ISA12,Interchange Control Version Number,Standards Approved by ACS X12 Review Board,"00501 Standards Approved for Publication by ASC X12
Procedures Review Board through October 2003",,,,"Hardcode as ""00501""",,
,ISA13,Interchange Control Number,"Sender-specific control number
Unique Sequential Number Assigned by Internal Processes for each Interchange - Must be identical to the Interchange Trailer IEA02",,,,,Interchange Control Number. Must = IEA02,,Unique ISI control number needs to generated in Edifecs for each 834 EDI file. It has to be 9 digits (for example -  000000764)
,ISA14,Acknowledgment Requested,"0 = No Interchange Acknowledgement Requested
1 = Interchange Acknowledgment Requested","00501 Standards Approved for Publication by ASC X12
Procedures Review Board through October 2003",,,,"Hardcode as ""0""",,
,ISA15,Usage Identifier,P = Production Data T = Test,"P Production Data
T Test Data",,,,"Refer Column J and map based on below logic
Hardcode as ""P""  if it is a Production region
Hardcode as ""T""  if it is a Non-Production region",,Based on Environmental property whether it is lower region or production region.
,ISA16,Component Element Separator,"Colon - Delimiter to separate component data
Header",,,,,"Hardcode  as "":""",,
GS (Functional Group Header),,,,,,,,,,
,GS,Functional Group Header,,,,,,,,
,GS01,Functional Identifier Code,Benefit Enrollment And Maintenance (834),,,,,"Hardcode as ""BE""",,
,GS02,Application Senders Code,"Code identifying party sending transmission
This is Submitter-specific.",,,,,"Hardcode as ""123456789789""",Yes. Please refer comments,Application Sender Code will be different for each customer.From product standpoint we have mentioned the random senderId
,GS03,Application Receivers Code,The Trading Partner ID (TPID) assigned for the client,,,,,"Hardcode as ""123456789789""",Yes. Please refer comments,Application receiver Code will be different for each customer.From product standpoint we have mentioned the random receiver Id
,GS04,Date,"Date the Group Header is created.
Enter current date in the CCYYMMDD format",,,,,"Map this value from  current date in the format of ""YYYYMMDD""",,
,GS05,Time,"Time the Group Header is created.
Enter current time in the HHMM format",,,,,"Map this value from   current Time in the format of ""HHMMSS""",,
,GS06,Group Control Number,"Unique Sequential Number Assigned by Internal Processes for each Group Header  by the sender.
Must be identical to the Interchange Trailer GE02 .
This is Submitter-specific.",Assigned number originated and maintained by the sender,,,,"Functional Group Control Number. Value must equal GE02

GS control number min length - 1 and max is 9",,
,GS07,Responsible Agency Code,"Code identifying the issuer of the EDI standard being used.
Accredited Standards Committee X12",X Accredited Standards Committee X12,,,,"Hardcode as ""X""",,
,GS08,Version/Release/Industry Identifier Code,,"005010X220 Standards Approved for Publication by ASC X12
Procedures Review Board through October 2003",,,,"Hardcode to ""005010X220A1""",,
ST (Transaction Set Header),,,,,,,,,,
,ST,Transaction Set Header,will contain one or more transactions,,,R,,,,
,ST01,Transaction Set Identifier Code,Benefit Enrollment and Maintenance,,Min-3   Max-3,R,,"Hardcode as ""834""",,
,ST02,Transaction Set Control Number,"Unique Sequential Number Assigned by Internal Processes for each Transaction Set
ST02 and SE02 must be identical",,Min-4   Max-9,R,,Unique control number needs to populated from process flow or map,,
,ST03,Implementation Convention Reference,"Standards Approved by ACS X12 Review Board
ST03 and GS08 must be identical",,Min-1   Max-35,R,,"Hardcode to ""005010X220A1""",,
,BGN,Beginning Segment,Header,,,R,,,,
,BGN01,Transaction Set Purpose Code,"“00” (original and resubmission of original upon request of trading partner)
“15” (re-submission to correct an error on original transmission)
22 = Information Copy","00 Original
15 Re-Submission
22 Information Copy",Min-2   Max-2,R,,"Hardcode as ""00""",,
,BGN02,Reference Identification,Transaction Set Reference Number,,Min-1   Max-50,R,,HF834.yymmdd,,
,BGN03,Date,"Date the Transaction Set is created.
Enter current date in the CCYYMMDD format",,Min-8   Max-8,R,,"Map this value from  current date in the format of ""CCYYMMDD""",,
,BGN04,Time,"Time the Transaction Set is created.
Enter current time in the HHMM format",,Min-4   Max-8,R,,"Map this value from   current Time in the format of ""HHMMSS""",,
,BGN05,Time Code,"Eastern Time, always sent","D Eastern Daylight Time
ES Eastern Standard Time
ET Eastern Time",Min-2   Max-2,S,,"Hardcode as ""ET""",,
,BGN06,Reference Identification,,,Min-1   Max-50,S,,,,
,BGN07,Transaction Type Code,,,,,,,,
,BGN08,Action Code,Code indicating type of action,"2 = Change/Update (Additions, Terminations and Changes to Current Enrollment),
4 = Verify (Full File Enrollment)
RX Replace",Min-1   Max-2,R,,"Hardcode as ""2""",,
,BGN09,Security Level Code,,,,,,,,
,REF,Transaction Set Policy Number,,,,S,,,,
,REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,38 Master Policy Number,Min-2   Max-3,R,,,,
,REF02,Reference Identification,Master Policy Number,,Min-1   Max-50,R,,,,
,DTP,TDTP - File Effective Date,,,,S,,,,
,DTP01,Date/Time Qualifier,007 - Effecive Date,"007 Effective
090 Report Start
091 Report End
303 Maintenance Effective
382 Enrollment
388 Payment Commencement",Min-3   Max-3,R,,"Hardcode as ""007""",,
,DTP02,Date Time Period Format Qualifier,,D8 Date Expressed in Format CCYYMMDD,Min-2   Max-3,R,,D8,,
,DTP03,Date Time Period,Current Date and time when the 834 batch is created,,Min-1   Max-35,R,,Current Date in CCYYMMDD,,
,QTY,Transaction Set Control Totals,,,,S,,Do not Populate,,
,QTY01,Quantity Qualifier,(Total),"DT Dependent Total
ET Employee Total
TO Total",Min-2   Max-2,R,,,,
,QTY02,Quantity,,,Min-1   Max-15,R,,,,
1000A,N1,Sponsor Name,This loop identifies the sponsor,,,R,,,,
1000A,N101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",P5 = Plan sponsor,Min-2   Max-3,R,,P5,,
1000A,N102,Plan Sponsor Name,Plan Sponsor Name,,Min-1   Max-60,S,,,,
1000A,N103,Identification Code Qualifier,FI = Federal Tax ID Number,"24 Employer’s Identification Number

94 Code assigned by the organization that is the
ultimate destination of the transaction set

FI Federal Taxpayer’s Identification Number",Min-1   Max-2,R,,FI,,
1000A,N104,Identification Code,,,Min-2   Max-80,R,,"Hardcode as ""123456789""",Yes. Please refer comments,"Sponsor name will be different for each customer.From product standpoint, we have to hardcoded  random numbers .It will be configured on implementation"
1000B,N1,Payer,,,,R,,,,
1000B,N101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",IN Insurer,Min-2   Max-3,R,,IN,,
1000B,N102,Name,Payer Name (free-form),,Min-1   Max-60,S,,"Hardcode as ""Product""",Yes. Please refer comments,"Payer name will be different for each customer.From product standpoint, we have to hardcoded  random numbers .It will be configured on implementation"
1000B,N103,Identification Code Qualifier,"FI = Federal Tax ID number
(Federal Taxpayer’s Identification Number)","94 Code assigned by the organization that is the
ultimate destination of the transaction set
FI Federal Taxpayer’s Identification Number
XV Centers for Medicare and Medicaid Services PlanID",Min-1   Max-2,R,,FI,,
1000B,N104,Identification Code,Enter the Tax ID number,(format is '9 digits or '000-00-0000',Min-2   Max-80,R,,"Hardcode as ""123456789""",Yes. Please refer comments,"Payer id will be different for each customer.From product standpoint, we have to hardcoded random numbers .It will be configured on implementation"
1000C,N1,TPA/Broker Name,,,,S,,,,
1000C,N101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual","BO Broker or Sales Office
TV Third Party Administrator (TPA)",Min-2   Max-3,R,,,,
1000C,N102,Name,TPA/Broker Name (free-form),,Min-1   Max-60,R,,,,
1000C,N103,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code","94 Code assigned by the organization that is the
ultimate destination of the transaction set
FI Federal Taxpayer’s Identification Number
XV Centers for Medicare and Medicaid Services PlanID",Min-1   Max-2,R,,,,
1000C,N104,Identification Code,Code that identifies the MCO Broker.,,Min-2   Max-80,R,,,,
1100C,ACT,TPA/Broker Account Information,,,,S,,,,
1100c,ACT01,Account Number,Account number assigned,,Min-1   Max-35,R,,,,
1100C,ACT06,Account Number,"Account number assigned
ACT06 is an account associated with the account in ACT01",,Min-1   Max-35,S,,,,
2000,INS,Member Level Detail,,,,R,,,,
2000,INS01,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,"N No
 Y Yes",Min-1   Max-1,R,Enrollment/member/memberIsSubscriber,"If True Populate as Y
If False Populate as N",,
2000,INS02,Individual Relationship Code,“18” (self) – insured is always the subscriber,Refer Tab Conversion Copy,Min-2   Max-2,R,Enrollment/member/relationshipToSubscriberDefinitionReference/relationshipName,Refer Tab Conversion Copy,,
2000,INS03,Maintenance Type Code,Code identifying the specific type of item maintenance,"001 = Change,
021 = Addition,
024 = Cancellation or Termination,
025 =  Reinstatement
030 =  Audit or Compare",Min-3   Max-3,R,,Hardcode as '030',,
2000,INS04,Maintenance Reason Code,Code identifying the reason for the maintenance change,"01 Divorce
02 Birth
03 Death
04 Retirement
05 Adoption
06 Strike
07 Termination of Benefits
08 Termination of Employment
09 Consolidation Omnibus Budget Reconciliation Act
(COBRA)
10 Consolidation Omnibus Budget Reconciliation Act
(COBRA) Premium Paid
11 Surviving Spouse
14 Voluntary Withdrawal
15 Primary Care Provider (PCP) Change
16 Quit
17 Fired
18 Suspended
20 Active
21 Disability
22 Plan Change
25 Change in Identifying Data Elements
26 Declined Coverage
27 Pre-Enrollment
28 Initial Enrollment
29 Benefit Selection
31 Legal Separation
32 Marriage
33 Personnel Data.
37 Leave of Absence with Benefits
38 Leave of Absence without Benefits
39 Lay Off with Benefits
40 Lay Off without Benefits
41 Re-enrollment
43 Change of Location
59 Non Payment
AA Dissatisfaction with Office Staff
AB Dissatisfaction with Medical Care/Services Rendered
AC Inconvenient Office Location
AD Dissatisfaction with Office Hours
AE Unable to Schedule Appointments in a Timely
Manner
AF Dissatisfaction with Physician’s Referral Policy
AG Less Respect and Attention Time Given than to
Other Patients
AH Patient Moved to a New Location
AI No Reason Given
AJ Appointment Times not Met in a Timely Manner
AL Algorithm Assigned Benefit Selection
EC Member Benefit Selection
XN Notification Only
(Audit/Compare).
XT Transfer",Min-2   Max-3,S,,Hardcode as 'XN',,
2000,INS05,Benefit Status Code,The type of coverage under which benefits are paid,"A Active
C Consolidated Omnibus Budget Reconciliation Act
(COBRA)
S Surviving Insured
T Tax Equity and Fiscal Responsibility Act (TEFRA)",Min-1   Max-1,R,,"Hardcode as  ""A""",,
2000,INS06,Medicare Status Code,To provide Medicare coverage and associated reason for Medicare eligibility,,,S,S,"1. In case of multiple /medicareHICN tags, traverse thru all /medicareHICN and take the one where  /medicareHICN/expirationdate is not present, considering it as the highest one and if  /medicareHICN/expirationdate is present then take the highest  /medicareHICN/expirationdate",,
2000,INS06-1,Medicare Plan Code,Code identifying the Medicare Plan,"A Medicare Part A
B Medicare Part B
C Medicare Part A and B
D Medicare
E No Medicare",Min-1   Max-1,R,,"2. If medicareHICN/mbi != """" AND
If  /enrollment/member/medicareHICN/partADates/partADate/effectiveDate != """" , can come alone or when /enrollment/member/medicareHICN/partDDateRanges/partDDateRanges/startDate !="""" comes along with this
Map  INS06-1 as ""A""
Else If /enrollment/member/medicareHICN/partBDates/partBDate/effectiveDate != """",  can come alone or when /enrollment/member/medicareHICN/partDDateRanges/partDDateRanges/startDate !="""" comes along with this
Map  INS06-1 as ""B""
Else If /enrollment/member/medicareHICN/partBDates/partBDate/effectiveDate != """" and /enrollment/member/medicareHICN/partADates/partADate/effectiveDate != """"
 Map  INS06-1 as ""C""
Else If
/enrollment/member/medicareHICN/partDDateRanges/partDDateRanges/startDate !=""""
Map INS06-1 as ""D""
Else
 Map it to ""E""",,
2000,INS06-2,Eligibility Reason Code,Code specifying reason for eligibility,"0 Age
1 Disability
2 End Stage Renal Disease (ESRD)",Min-1   Max-1,S,,"2. If medicareHICN/mbi != """"
 If  /enrollment/member/medicareHICN/esrdIndicator == ""true""
    Map ""2""
 Else If   /member/medicareHICN/medicareEligibilityReasonCode/codeSetName =""MedicareEligibilityReason  and /member/medicareHICN/medicareEligibilityReasonCode/Alternatives/codeEntry = ""1""
    Map ""0""
Else if
/member/medicareHICN/medicareEligibilityReasonCode/codeSetName =""MedicareEligibilityReason   and /member/medicareHICN/medicareEligibilityReasonCode/Alternatives/codeEntry = ""3""
    Map ""1""",,
2000,INS07,COBRA Qualifying Event,"A Qualifying Event is any of the following which results in loss of coverage for a
Qualified Beneficiary","1 Termination of Employment
2 Reduction of work hours
3 Medicare
4 Death
5 Divorce
6 Separation
7 Ineligible Child
8 Bankruptcy of Retiree’s Former Employer (26 U.S.C.
4980B(f)(3)(F))
9 Layoff
10 Leave of Absence
ZZ Mutually Defined",Min-1   Max-2,S,,,,
2000,INS08,Employment Status Code,Code showing the general employment status of an employee/claimant,"AC Active
AO Active Military - Overseas
AU Active Military - USA
FT Full-time
L1 Leave of Absence
PT Part-time
RT Retired
TE Terminated",Min-2   Max-2,S,/enrollment/member/employmentInfo/employmentStatusCodeCode/codeEntry,"If  INS01 = Y , map /enrollment/member/employmentInfo/employmentStatusCodeCode/codeSetName  = EmploymentStatusCode
Refer Conversion copy

If INS01 = N, Don't map INS08",,
2000,INS09,Student Status Code,"Code indicating the student status of the patient if 19 years of age or older, not
handicapped and not the insured","F Full-time
N Not a Student
P Part-time",Min-1   Max-1,S,,,,
2000,INS10,Handicap Indicator,Code indicating a Yes or No condition or response,"N No
Y Yes",Min-1   Max-1,S,/enrollment/member/IsHandicapped,"If True, populate as Y
If False, Populate as N",,
2000,INS11,DTP Format Qualifier,"Code indicating the date format, time format, or date and time format",D8 Date Expressed in Format CCYYMMDD,Min-2   Max-3,S,,"Hardcode as ""D8"" If /enrollment/member/individual/dateOfDeath != """"",,
2000,INS12,Date Time Period,Insured Individual Death Date,,Min-1   Max-35,S,/enrollment/member/individual/dateOfDeath,,,
2000,INS13,Confidentiality Code,Code indicating the access to insured information,"R Restricted Access
U Unrestricted Access",Min-1   Max-1,S,,,,
2000,INS17,Birth Sequence Number,A generic number,,Min-1   Max-9,S,,,,
2000,REF,Subscriber Identifier,,,,R,,,,
2000,REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,0F Subscriber Number,Min-2   Max-3,R,,"Hardcode as ""OF""",,
2000,REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier

Uniquie Subscriber HCC Identifier created in HRP for each membership from State",,Min-1   Max-50,R,/enrollment/subscription/hccIdentifier,,,
2000,REF,Member Policy Number,,,,S,,,,
2000,REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,1L Group or Policy Number,Min-2   Max-3,R,,,,
2000,REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",,Min-1   Max-50,R,,,,
2000,REF,Member Supplemental Identifier,,,,S,,,,
2000,REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,"17 Client Reporting Category
23 Client Number
3H Case Number
4A Personal Identification Number (PIN)
6O Cross Reference Number
D3 National Council for Prescription Drug Programs
Pharmacy Number
F6 Health Insurance Claim (HIC) Number
P5 Position Code
Q4 Prior Identifier Number
QQ Unit Number
ZZ Mutually Defined
DX Department/Agency Number
ABB Personal ID Number",Min-2   Max-3,R,/enrollment/member/otherIdNumberList/identificationNumber/identificationTypeCode/codeEntry,"whenever otherIdNumberList/identificationNumber/identificationTypeCode/codeEntry = ""F6"", exclude the reverse crosswalk and take the <medicareHICN>/<mbi> and incase of multiple <medicareHICN>/<mbi> pls refer logic from INS06.

For all other code enteries, In case of multiple similar /identificationNumber/identificationTypeCode/codeEntry tags, traverse thru all similar /identificationNumber/identificationTypeCode/codeEntry and take the one where  /identificationNumber/effectiveEndDate is not present and take the latest /identificationNumber/effectiveStartDate and if  /identificationNumber/effectiveEndDate is present then take the highest /identificationNumber/effectiveEndDate , and map accordingly.",Yes. Please refer comments,"EDIFECS will do the reverse crosswalk and the corresponding EDI value will be mapped to REF01
- From product standpoint map ref*02 only for the mentioned qualifier at ref*01 , else don't map this segment.
- Implementation team can customize their specific values at adaptor layer"
2000,REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",,Min-1   Max-50,R,/enrollment/member/otherIdNumberList/identificationNumber/identificationNumber,,Yes. Please refer comments,
2000,DTP,Member Level Dates,,,,S,,,,
2000,DTP01,Date Time Qualifier,"Code specifying type of date or time, or both date and time","050 Received
1000101 Used to identify the date an enrollment application
is received.
286 Retirement
296 Initial Disability Period Return To Work
297 Initial Disability Period Last Day Worked
300 Enrollment Signature Date
301 Consolidated Omnibus Budget Reconciliation Act
(COBRA) Qualifying Event
303 Maintenance Effective
336 Employment Begin
337 Employment End
338 Medicare Begin
339 Medicare End
340 Consolidated Omnibus Budget Reconciliation Act
(COBRA) Begin
341 Consolidated Omnibus Budget Reconciliation Act
(COBRA) End
350 Education Begin
351 Education End
356 Eligibility Begin
357 Eligibility End
383 Adjusted Hire
385 Credited Service Begin
386 Credited Service End
393 Plan Participation Suspension
394 Rehire
473 Medicaid Begin
474 Medicaid End",Min-3   Max-3,R,,"Hardcode as  ""356""",,
2000,DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",D8 Date Expressed in Format CCYYMMDD,Min-2   Max-3,R,,D8,,
2000,DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",,Min-1   Max-35,R,enrollment/member/Planselection/startdate,"In case of multiple HD segments, traverse thru all <Planselection> tags and take the earliest of /Planselection/startdate.",,
2000,DTP,Member Level Dates,,,,S,,,,
2000,DTP01,Date Time Qualifier,"Code specifying type of date or time, or both date and time","050 Received
1000101 Used to identify the date an enrollment application
is received.
286 Retirement
296 Initial Disability Period Return To Work
297 Initial Disability Period Last Day Worked
300 Enrollment Signature Date
301 Consolidated Omnibus Budget Reconciliation Act
(COBRA) Qualifying Event
303 Maintenance Effective
336 Employment Begin
337 Employment End
338 Medicare Begin
339 Medicare End
340 Consolidated Omnibus Budget Reconciliation Act
(COBRA) Begin
341 Consolidated Omnibus Budget Reconciliation Act
(COBRA) End
350 Education Begin
351 Education End
356 Eligibility Begin
357 Eligibility End
383 Adjusted Hire
385 Credited Service Begin
386 Credited Service End
393 Plan Participation Suspension
394 Rehire
473 Medicaid Begin
474 Medicaid End",Min-3   Max-3,R,,"Hardcode as  ""357""",,"custom field - map it in adaptor for testing
will be removed once testing is completed"
2000,DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",D8 Date Expressed in Format CCYYMMDD,Min-2   Max-3,R,,,,
2000,DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",,Min-1   Max-35,R,enrollment/member/Planselection/enddate,"In case of multiple HD segments, traverse thru all <Planselection> tags and take the earliest of /Planselection/startdate and map the corresponding /Planselection/enddate",,
2000,DTP,Member Level Dates,,,,S,,"1. In case of multiple /medicareHICN tags, traverse thru all /medicareHICN and take the one where  /medicareHICN/expirationdate is not present, considering it as the highest one and if  /medicareHICN/expirationdate is present then take the highest  /medicareHICN/expirationdate",,
2000,DTP01,Date Time Qualifier,"Code specifying type of date or time, or both date and time","050 Received
1000101 Used to identify the date an enrollment application
is received.
286 Retirement
296 Initial Disability Period Return To Work
297 Initial Disability Period Last Day Worked
300 Enrollment Signature Date
301 Consolidated Omnibus Budget Reconciliation Act
(COBRA) Qualifying Event
303 Maintenance Effective
336 Employment Begin
337 Employment End
338 Medicare Begin
339 Medicare End
340 Consolidated Omnibus Budget Reconciliation Act
(COBRA) Begin
341 Consolidated Omnibus Budget Reconciliation Act
(COBRA) End
350 Education Begin
351 Education End
356 Eligibility Begin
357 Eligibility End
383 Adjusted Hire
385 Credited Service Begin
386 Credited Service End
393 Plan Participation Suspension
394 Rehire
473 Medicaid Begin
474 Medicaid End",Min-3   Max-3,R,,"Hardcode as  ""338"" if enrollment/member/medicareHICN/effectiveDate  != "" """,,Medicare Begin date
2000,DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",D8 Date Expressed in Format CCYYMMDD,Min-2   Max-3,R,,D8,,
2000,DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",,Min-1   Max-35,R,enrollment/member/medicareHICN/effectiveDate,,,
2000,DTP,Member Level Dates,,,,S,,"1. In case of multiple /medicareHICN tags, traverse thru all /medicareHICN and take the one where  /medicareHICN/expirationdate is not present, considering it as the highest one and if  /medicareHICN/expirationdate is present then take the highest  /medicareHICN/expirationdate",,
2000,DTP01,Date Time Qualifier,"Code specifying type of date or time, or both date and time","050 Received
1000101 Used to identify the date an enrollment application
is received.
286 Retirement
296 Initial Disability Period Return To Work
297 Initial Disability Period Last Day Worked
300 Enrollment Signature Date
301 Consolidated Omnibus Budget Reconciliation Act
(COBRA) Qualifying Event
303 Maintenance Effective
336 Employment Begin
337 Employment End
338 Medicare Begin
339 Medicare End
340 Consolidated Omnibus Budget Reconciliation Act
(COBRA) Begin
341 Consolidated Omnibus Budget Reconciliation Act
(COBRA) End
350 Education Begin
351 Education End
356 Eligibility Begin
357 Eligibility End
383 Adjusted Hire
385 Credited Service Begin
386 Credited Service End
393 Plan Participation Suspension
394 Rehire
473 Medicaid Begin
474 Medicaid End",Min-3   Max-3,R,,"Hardcode as  ""339"" if enrollment/member/medicareHICN/expirationDate  != "" """,,
2000,DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",D8 Date Expressed in Format CCYYMMDD,Min-2   Max-3,R,,D8,,
2000,DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",,Min-1   Max-35,R,enrollment/member/medicareHICN/expirationDate,,,
2100A,NM1,Member Name,,,,R,,,,
2100A,NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual","74 Corrected Insured
IL Insured or Subscriber",Min-2   Max-3,R,,Hardcode as '1L',,
2100A,NM102,Entity Type Qualifier,Code qualifying the type of entity,1 Person,Min-1   Max-1,R,,Hardcode as '1',,
2100A,NM103,Subscriber Last Name,Individual last name or organizational name,,Min-1   Max-60,R,/enrollment/member/individual/primaryName/lastName,,,
2100A,NM104,Subscriber First Name,Individual first name,,Min-1   Max-35,S,/enrollment/member/individual/primaryName/firstName,,,
2100A,NM105,Subscriber Middle Name,Individual middle name or initial,,Min-1   Max-25,S,/enrollment/member/individual/primaryName/middleName,,,
2100A,NM106,Subscriber Name Prefix,Prefix to individual name,,Min-1   Max-10,S,/enrollment/member/individual/primaryName/namePrefix,,,
2100A,NM107,Subscriber Name Suffix,Suffix to individual nam,,Min-1   Max-10,S,/enrollment/member/individual/primaryName/nameSuffixList/suffix,,,
2100A,NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code","34 Social Security Number
ZZ Mutually Defined",Min-1   Max-2,S,,Hardcode as '34',,
2100A,NM109,Subscriber Identifier,Code identifying a party or other code,,Min-2   Max-80,S,/enrollment/member/individual/taxIdentificationNumber,"Remove any ""hyphens"" from /taxIdentificationNumber",,
2100A,PER,Members Communications Numbers,,,,S,,,,
2100A,PER01,Contact Function Code,Code identifying the major duty or responsibility of the person or group named,IP Insured Party,Min-2   Max-2,R,,Hardcode as 'IP',,
2100A,PER02,Name,,,,,,"Not used, leave blank",,
2100A,PER03,Communication Number Qualifier,Code identifying the type of communication number,"AP Alternate Telephone
BN Beeper Number
CP Cellular Phone
EM Electronic Mail
EX Telephone Extension
FX Facsimile
HP Home Phone Number
TE Telephone
WP Work Phone Number",Min-2   Max-2,R,"Populate with ""EM"" if /Member/physicalAddress/memberPhysicalAddress/emailAddress is present

Else

/enrollment/member/physicalAddress/memberPhysicalAddress/addressInfo/addressPhoneList/telephoneNumber/individualPhoneTypeCode/codeEntry","Depending on the number of  occurences of <telephoneNumber>, /codeEntry   needs to be mapped to PER03/05/07",,
2100A,PER04,Communication Number,"Complete communications number including country or area code when
applicable",,Min-1   Max-256,R,Enrollment/Member/physicalAddress/memberPhysicalAddress/emailAddress,If PER03 is  EM,,
,,,,,,,"/enrollment/member/physicalAddress/memberPhysicalAddress/addressInfo/addressPhoneList/telephoneNumber/phoneAreaCode
/enrollment/member/physicalAddress/memberPhysicalAddress/addressInfo/addressPhoneList/telephoneNumber/phoneNumber","Depending on the number of  occurences of <telephoneNumber>, /phoneAreaCode+/phoneNumber   needs to be mapped to PER04/06/08",,
2100A,PER05,Communication Number Qualifier,Code identifying the type of communication number,"AP Alternate Telephone
BN Beeper Number
CP Cellular Phone
EM Electronic Mail
EX Telephone Extension
FX Facsimile
HP Home Phone Number
TE Telephone
WP Work Phone Number",Min-2   Max-2,S,,,,
2100A,PER06,Communication Number,"Complete communications number including country or area code when
applicable",,Min-1   Max-256,S,,,,
2100A,PER07,Communication Number Qualifier,Code identifying the type of communication number,"AP Alternate Telephone
BN Beeper Number
CP Cellular Phone
EM Electronic Mail
EX Telephone Extension
FX Facsimile
HP Home Phone Number
TE Telephone
WP Work Phone Number",Min-2   Max-2,S,,,,
2100A,PER08,Communication Number,,,Min-1   Max-256,S,,,,
2100A,N3,Members Street Address,Always send both N3 and N4 segments for address changes,,,S,,,,
2100A,N301,Address Information,Address line 1 – input should be up to 35 characters,,Min-1   Max-55,R,/enrollment/member/physicalAddress/memberPhysicalAddress/addressInfo/postalAddress/address,,,
2100A,N302,Address Information,Address line 2 – input should be up to 35 characters,,Min-1   Max-55,S,/enrollment/member/physicalAddress/memberPhysicalAddress/addressInfo/postalAddress/address2,,,
2100A,N4,"Members City, State, and Zip Code",Always send both N3 and N4 segments for address changes,,,S,,,,
2100A,N401,City Name,Members city,,Min-2   Max-30,R,/enrollment/member/physicalAddress/memberPhysicalAddress/addressInfo/postalAddress/cityName,,,
2100A,N402,State or Province Code,Members state or province,,Min-2   Max-2,S,/enrollment/member/physicalAddress/memberPhysicalAddress/addressInfo/postalAddress/stateCode,,,
2100A,N403,Postal Code,Members zip code (no dashes),,Min-3   Max-15,S,Concatenate /enrollment/member/physicalAddress/memberPhysicalAddress/addressInfo/postalAddress/zipCode and /enrollment/member/physicalAddress/memberPhysicalAddress/addressInfo/postalAddress/zipExtensionCode,,,
2100A,N404,Country Code,,,Min-2   Max-3,S,/enrollment/member/physicalAddress/memberPhysicalAddress/addressInfo/postalAddress/countryCode,,,
2100A,N405,Location Qualifier,Code identifying type of location,"60 Area
CY County/Parish",Min-1   Max-2,S,,Hardcode as 'CY',,
2100A,N406,Location Identifier,Indicates County Code,,Min-1   Max-30,S,/enrollment/member/physicalAddress/memberPhysicalAddress/addressInfo/postalAddress/countyCode,,,
2100A,N407,Country Subdivision Code,Code identifying the country subdivision,,Min-1   Max-3,S,,,,
2100A,DMG,Member Demographics,,,,S,,,,
2100A,DMG01,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",D8 Date Expressed in Format CCYYMMDD,Min-2   Max-3,R,,Hardcode as D8,,
2100A,DMG02,Date Time Period,Member Birth Date,Members date of birth in the format of CCYYDDMM,Min-1   Max-35,R,/enrollment/member/individual/birthDate,Convert to Format : CCYYMMDD,,
2100A,DMG03,Gender Code,Code indicating the sex of the individual,"F Female
M Male
U Unknown",Min-1   Max-1,R,/enrollment/member/individual/genderCode,"If /genderCode  is
Male - Populate as M
Female  - Populate as F
Unknown - Populate as U",,
2100A,DMG04,Marital Status Code,Code defining the marital status of a person,"B Registered Domestic Partner
D Divorced
I Single
M Married
R Unreported
S Separated
U Unmarried (Single or Divorced or Widowed)
1273 This code should be used if the previous status is
unknown.
W Widowed
X Legally Separated",Min-1   Max-1,S,/enrollment/member/individual/maritalStatusCode,"Conversion Logic:
If /maritalStatusCode  is
Divorced   - Populate as D,
Legally Separated- Populate as X
Married - Populate as M
Registered Domestic Partner  - Populate as B
Separated - Populate as S
Single - Populate as I,
Widowed - Populate as  W
Unmarried  Populate as  U
Unreported -  Populate as  R",,
2100 A,DMG05,COMPOSITE RACE OR ETHNICITY INFORMATION,To send general and detailed information on race or ethnicity,,,S,,,,
2100 A,DMG05 - 1,Race or Ethnicity Code,"Code indicating the racial or ethnic background of a person; it is
normally self-reported; Under certain circumstances this information is
collected for United States Government statistical purposes","7 Not Provided
8 Not Applicable
A Asian or Pacific Islander
B Black
C Caucasian
D Subcontinent Asian American
E Other Race or Ethnicity
F Asian Pacific American
G Native American
H Hispanic
I American Indian or Alaskan Native
J Native Hawaiian
N Black (Non-Hispanic)
O White (Non-Hispanic)
P Pacific Islander
Z Mutually Defined",Min-1   Max-1,S,/enrollment/member/raceOrEthnicity/raceOrEthnicityCodes/codeEntry,If /enrollment/member/raceOrEthnicity/raceOrEthnicityCodes/Codeset name = RaceOrEthnicityCode,,"From product standpoint - please refer convertional copy for the expected available values and map the correspomding enumeration values
and dont populate the segment if any other values comes"
2100 A,DMG05 - 2,Code List Qualifier Code,Code identifying a specific industry code list,RET :Classification of Race or Ethnicity,Min-1   Max-3,S,,,,
2100 A,DMG05 - 3,Industry Code,Code indicating a code from a specific industry code list,,Min-1   Max-30,S,,,,Implementation team can handle the  classification of Race and Ethinicity in the adaptor layer
2100A,DMG06,Citizenship Status Code,Code indicating citizenship status,"1 U.S. Citizen
2 Non-Resident Alien
3 Resident Alien
4 Illegal Alien
5 Alien
6 U.S. Citizen - Non-Resident
7 U.S. Citizen - Resident",Min-1   Max-2,S,/enrollment/member/individual/immigrationStatusCode/codeEntry,/enrollment/member/individual/immigrationStatusCode/Codeset name as  ImmigrationStatus,,
2100A,DMG10,Code List Qualifier Code,Code identifying a specific industry code list,REC Race or Ethnicity Collection Code,Min-1   Max-3,S,,,,
2100A,DMG11,Industry Code,Code indicating a code from a specific industry code list,,Min-1   Max-30,S,,,,
2100A,EC,Employment Class,,,,S,,,,
2100A,EC01,Employment Class Code,Code indicating category of employee,"01 Union
02 Non-Union
03 Executive
04 Non-Executive
05 Management
06 Non-Management
07 Hourly
08 Salaried
09 Administrative
10 Non-Administrative
11 Exempt
12 Non-Exempt
17 Highly Compensated
18 Key-Employee
19 Bargaining
20 Non-Bargaining
21 Owner
22 President
23 Vice President",Min-2   Max-3,R,,,,
2100A,EC02,Employment Class Code,Code indicating category of employee,"01 Union
02 Non-Union
03 Executive
04 Non-Executive
05 Management
06 Non-Management
07 Hourly
08 Salaried
09 Administrative
10 Non-Administrative
11 Exempt
12 Non-Exempt
17 Highly Compensated
18 Key-Employee
19 Bargaining
20 Non-Bargaining
21 Owner
22 President
23 Vice President",Min-2   Max-3,S,,,,
2100A,EC03,Employment Class Code,Code indicating category of employee,"01 Union
02 Non-Union
03 Executive
04 Non-Executive
05 Management
06 Non-Management
07 Hourly
08 Salaried
09 Administrative
10 Non-Administrative
11 Exempt
12 Non-Exempt
17 Highly Compensated
18 Key-Employee
19 Bargaining
20 Non-Bargaining
21 Owner
22 President
23 Vice President",Min-2   Max-3,S,,,,
2100A,ICM,Member Income,,,,S,,,,
2100A,ICM01,Frequency Code,Code indicating frequency or type of activities or actions being reported,"1 Weekly
2 Biweekly
3 Semimonthly
4 Monthly
6 Daily
7 Annual
8 Two Calendar Months
9 Lump-Sum Separation Allowance
B Year-to-Date
C Single
H Hourly
Q Quarterly
S Semiannual
U Unknown",Min-1   Max-1,R,,,,
2100A,ICM02,Monetary Amount,Monetary amount,,Min-1   Max-18,R,,,,
2100A,ICM03,Quantity,Numeric value of quantity,,Min-1   Max-15,S,,,,
2100A,ICM04,Location Identifier,Code which identifies a specific location,,Min-1   Max-30,S,,,,
2100A,ICM05,Salary Grade,The salary grade code assigned by the employer,,Min-1   Max-5,S,,,,
2100A,AMT,Member Policy Amounts,,,,S,,,,
2100A,AMT01,Amount Qualifier Code,Code to qualify amount,"B9 Co-insurance - Actual
C1 Co-Payment Amount
D2 Deductible Amount
EBA Expected Expenditure Amount
FK Other Unlisted Amount
P3 Premium Amount
R Spend Down",Min-1   Max-3,R,,,,
2100A,AMT02,Monetary Amount,Monetary amount,,Min-1   Max-18,R,,,,
2100A,HLH,Member Health Information,,,,S,,,,
2100A,HLH01,Health-Related Cod,Code indicating a specific health situation,"N None
S Substance Abuse
T Tobacco Use
U Unknown
X Tobacco Use and Substance Abuse",Min-1   Max-1,R,/enrollment/member/smokingStatus,"If  /smokingStatus is,
Non Smoker - Populate N
Smoker - Populate S
Unknown - Populate U",,
2100A,HLH02,Height,Vertical dimension of an object measured when the object is in the upright position,,Min-1   Max-8,S,/enrollment/member/physicalCharacteristics/heightInchesCount,,,
2100A,HLH03,Weight,Numeric value of weight,,Min-1   Max-10,S,/enrollment/member/physicalCharacteristics/weightPoundsCount,,,
2100A,LUI,Member Language,,,,S,,,,
2100A,LUI01,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),"LD: NISO Z39.53 Language Codes
LE: ISO 639 Language Codes",Min-1   Max-2,S,,Hardcode as 'LE',,
2100A,LUI02,Identification Code,Code identifying a party or other code,,Min-2   Max-80,S,/enrollment/member/individual/languages/language/languageDomainCode/codeEntry,If /enrollment/member/individual/languages/language/languageDomainCode/codeSetName  as 'LanguageDomain',,
2100A,LUI03,Description,A free-form description to clarify the related data elements and their content,,Min-1   Max-80,S,,,,
2100A,LUI04,Language Indicator,Code indicating the use of a language,"5 Language Reading
6 Language Writing
7 Language Speaking
8 Native Language",Min-1   Max-2,S,/enrollment/member/individual/languages/language/primaryLanguage,"If True ,Populate as 7",,"Upon receiving both primary and native language tags in the XML extract, ensure that both values are appropriately mapped into the corresponding segments of the EDI 834 transaction set"
,,,,,,,/enrollment/member/individual/languages/language/nativeLanguage,"If True ,Populate as 6",,
2100A,LUI05,Language Proficiency,,,,,,,,
2100B,NM1,Incorrect Member Name,,,,S,,,,
2100B,NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",70 Prior Incorrect Insured,Min-2   Max-3,R,,,,
2100B,NM102,Entity Type Qualifier,Code qualifying the type of entity,1 Person,Min-1   Max-1,R,,,,
2100B,NM103,Name Last or Organization Name,ndividual last name or organizational name,,Min-1   Max-60,R,,,,
2100B,NM104,Name First,Individual first name,,Min-1   Max-35,S,,,,
2100B,NM105,Name Middle,Individual middle name or initia,,Min-1   Max-25,S,,,,
2100B,NM106,Name Prefix,Prefix to individual name,,Min-1   Max-10,S,,,,
2100B,NM107,Name Suffix,Suffix to individual name,,Min-1   Max-10,S,,,,
2100B,NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code","34 Social Security Number
ZZ Mutually Defined",Min-1   Max-2,S,,,,
2100B,NM109,Identification Code,Code identifying a party or other code,,Min-2   Max-80,S,,,,
2100B,DMG,Incorrect Member Demographics,,,,S,,,,
2100B,DMG01,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",D8 Date Expressed in Format CCYYMMDD,Min-2   Max-3,S,,,,
2100B,DMG02,Date Time Period,Member Birth Date,Members date of birth in the format of CCYYDDMM,Min-1   Max-35,S,,,,
2100B,DMG03,Gender Code,Code indicating the sex of the individual,"F Female
M Male
U Unknown",Min-1   Max-1,S,,,,
2100B,DMG04,Marital Status Code,Code defining the marital status of a person,"B Registered Domestic Partner
D Divorced
I Single
M Married
R Unreported
S Separated
U Unmarried (Single or Divorced or Widowed)
1273 This code should be used if the previous status is
unknown.
W Widowed
X Legally Separated",Min-1   Max-1,S,,,,
2100B,DMG05,COMPOSITE RACE OR ETHNICITY INFORMATION,To send general and detailed information on race or ethnicity,,,S,,,,
2100B,DMG05 - 1,Race or Ethnicity Code,"Code indicating the racial or ethnic background of a person; it is
normally self-reported; Under certain circumstances this information is
collected for United States Government statistical purposes","7 Not Provided
8 Not Applicable
A Asian or Pacific Islander
B Black
C Caucasian
D Subcontinent Asian American
E Other Race or Ethnicity
F Asian Pacific American
G Native American
H Hispanic
I American Indian or Alaskan Native
J Native Hawaiian
N Black (Non-Hispanic)
O White (Non-Hispanic)
P Pacific Islander
Z Mutually Defined",Min-1   Max-1,S,,,,
2100B,DMG05 - 2,Code List Qualifier Code,Code identifying a specific industry code list,,Min-1   Max-3,S,,,,
2100B,DMG05 - 3,Industry Code,Code indicating a code from a specific industry code list,,Min-1   Max-30,S,,,,
2100B,DMG06,Citizenship Status Code,Code indicating citizenship status,"1 U.S. Citizen
2 Non-Resident Alien
3 Resident Alien
4 Illegal Alien
5 Alien
6 U.S. Citizen - Non-Resident
7 U.S. Citizen - Resident",Min-1   Max-2,S,,,,
2100B,DMG10,Code List Qualifier Code,Code identifying a specific industry code list,REC Race or Ethnicity Collection Code,Min-1   Max-3,S,,,,
2100B,DMG11,Industry Code,Code indicating a code from a specific industry code list,,Min-1   Max-30,S,,,,
2100C,NM1,Member mailing address,,,,S,,Transmitted only if the Member's Correspondence Address is present,,
2100C,NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",31 Postal Mailing Address,Min-2   Max-3,R,,Hardcode as '31'  If /enrollment/member/correspondenceAddress/postalAddress/address is present.,,
2100C,NM102,Entity Type Qualifier,Code qualifying the type of entity,1 Person,Min-1   Max-1,R,,Hardcode as '1',,
2100C,N3,Member mail street address,,,,R,,,,
2100C,N301,Address Information,Member Address Line,,Min-1   Max-55,R,/enrollment/member/correspondenceAddress/postalAddress/address,,,
2100C,N302,Address Information,Member Address Line 2,,Min-1   Max-55,S,/enrollment/member/correspondenceAddress/postalAddress/address2,,,
2100C,N4,"Member mail,State,city ,zip code",,,,R,,,,
2100C,N401,City Name,Member City Name,,Min-2   Max-30,R,/enrollment/member/correspondenceAddress/postalAddress/cityName,,,
2100C,N402,State Code,Member State Code,,Min-2   Max-2,S,/enrollment/member/correspondenceAddress/postalAddress/stateCode,,,
2100C,N403,ZIP Code,Member ZIP Code,,Min-3   Max-15,S,Concatenate /enrollment/member/correspondenceAddress/postalAddress/zipCode and /enrollment/member/correspondenceAddress/postalAddress/zipExtensionCode,,,
2100C,N404,Country Code,Member Country Code,,Min-2   Max-3,S,,,,
2100C,N407,Country Subdivision Code,Code identifying the country subdivision,,Min-1   Max-3,S,,,,
2100D,NM1,Member Employer,,,,S,,,,
2100D,NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",36 Employer,Min-2   Max-3,R,,,,
2100D,NM102,Entity Type Qualifier,Code qualifying the type of entity,"1 Person
2 Non-Person Entity",Min-1   Max-1,R,,,,
2100D,NM103,Name Last or Organization Name,ndividual last name or organizational name,,Min-1   Max-60,S,,,,
2100D,NM104,Name First,Individual first name,,Min-1   Max-35,S,,,,
2100D,NM105,Name Middle,Individual middle name or initia,,Min-1   Max-25,S,,,,
2100D,NM106,Name Prefix,Prefix to individual name,,Min-1   Max-10,S,,,,
2100D,NM107,Name Suffix,Suffix to individual name,,Min-1   Max-10,S,,,,
2100D,NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code","24 Employer’s Identification Number
34 Social Security Number",Min-1   Max-2,S,,,,
2100D,NM109,Identification Code,Code identifying a party or other code,,Min-2   Max-80,S,,,,
2100D,PER,Member Employer Communication Numbers,,,,S,,,,
2100D,PER01,Contact Function Code,Code identifying the major duty or responsibility of the person or group named,EP Employer Contact,Min-2   Max-2,R,,,,
2100D,PER02,Name,Free-form name,,Min-1   Max-60,S,,,,
2100D,PER03,Communication Number Qualifier,Code identifying the type of communication number,"AP Alternate Telephone
BN Beeper Number
CP Cellular Phone
EM Electronic Mail
EX Telephone Extension
FX Facsimile
HP Home Phone Number
TE Telephone
WP Work Phone Number",Min-2   Max-2,R,,,,
2100D,PER04,Communication Number,"Complete communications number including country or area code when
applicable",,Min-1   Max-256,R,,,,
2100D,PER05,Communication Number Qualifier,Code identifying the type of communication number,"AP Alternate Telephone
BN Beeper Number
CP Cellular Phone
EM Electronic Mail
EX Telephone Extension
FX Facsimile
HP Home Phone Number
TE Telephone
WP Work Phone Number",Min-2   Max-2,S,,,,
2100D,PER06,Communication Number,"Complete communications number including country or area code when
applicable",,Min-1   Max-256,S,,,,
2100D,PER07,Communication Number Qualifier,Code identifying the type of communication number,,Min-2   Max-2,S,,,,
2100D,PER08,Communication Number,,"AP Alternate Telephone
BN Beeper Number
CP Cellular Phone
EM Electronic Mail
EX Telephone Extension
FX Facsimile
HP Home Phone Number
TE Telephone
WP Work Phone Number",Min-1   Max-256,S,,,,
2100D,N3,Member Employeer Street Address,,,,S,,,,
2100D,N301,Address Information,Member Employeer Address Line,,Min-1   Max-55,R,,,,
2100D,N302,Address Information,Member Employeer Address Line 2,,Min-1   Max-55,S,,,,
2100D,N4,"Member Employeer mail,State,city ,zip code",,,,S,,,,
2100D,N401,City Name,Member Employeer City Name,,Min-2   Max-30,R,,,,
2100D,N402,State Code,Member Employeer State Code,,Min-2   Max-2,S,,,,
2100D,N403,ZIP Code,Member Employeer ZIP Code,,Min-3   Max-15,S,,,,
2100D,N404,Country Code,Member Employeer Country Code,,Min-2   Max-3,S,,,,
2100D,N407,Country Subdivision Code,Member Employeer Country subdivision Code,,Min-1   Max-3,S,,,,
2100E,NM1,Member School,,,,S,,,,
2100E,NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",36 Employer,Min-2   Max-3,R,,,,
2100E,NM102,Entity Type Qualifier,Code qualifying the type of entity,"1 Person
2 Non-Person Entity",Min-1   Max-1,R,,,,
2100E,NM103,Name Last or Organization Name,ndividual last name or organizational name,,Min-1   Max-60,R,,,,
2100E,PER,Member School Communication Numbers,,,,S,,,,
2100E,PER01,Contact Function Code,Code identifying the major duty or responsibility of the person or group named,EP Employer Contact,Min-2   Max-2,R,,,,
2100E,PER02,Name,Free-form name,,Min-1   Max-60,S,,,,
2100E,PER03,Communication Number Qualifier,Code identifying the type of communication number,"AP Alternate Telephone
BN Beeper Number
CP Cellular Phone
EM Electronic Mail
EX Telephone Extension
FX Facsimile
HP Home Phone Number
TE Telephone
WP Work Phone Number",Min-2   Max-2,R,,,,
2100E,PER04,Communication Number,"Complete communications number including country or area code when
applicable",,Min-1   Max-256,R,,,,
2100E,PER05,Communication Number Qualifier,Code identifying the type of communication number,"AP Alternate Telephone
BN Beeper Number
CP Cellular Phone
EM Electronic Mail
EX Telephone Extension
FX Facsimile
HP Home Phone Number
TE Telephone
WP Work Phone Number",Min-2   Max-2,S,,,,
2100E,PER06,Communication Number,"Complete communications number including country or area code when
applicable",,Min-1   Max-256,S,,,,
2100E,PER07,Communication Number Qualifier,Code identifying the type of communication number,,Min-2   Max-2,S,,,,
2100E,PER08,Communication Number,,"AP Alternate Telephone
BN Beeper Number
CP Cellular Phone
EM Electronic Mail
EX Telephone Extension
FX Facsimile
HP Home Phone Number
TE Telephone
WP Work Phone Number",Min-1   Max-256,S,,,,
2100E,N3,Member School Street Address,,,,S,,,,
2100E,N301,Address Information,Member Employeer Address Line,,Min-1   Max-55,R,,,,
2100E,N302,Address Information,Member Employeer Address Line 2,,Min-1   Max-55,S,,,,
2100E,N4,"Member School,State,city ,zip code",,,,S,,,,
2100E,N401,City Name,Member Employeer City Name,,Min-2   Max-30,R,,,,
2100E,N402,State Code,Member Employeer State Code,,Min-2   Max-2,S,,,,
2100E,N403,ZIP Code,Member Employeer ZIP Code,,Min-3   Max-15,S,,,,
2100E,N404,Country Code,Member Employeer Country Code,,Min-2   Max-3,S,,,,
2100E,N407,Country Subdivision Code,Member Employeer Country subdivision Code,,Min-1   Max-3,S,,,,
2100F,NM1,Custodial Parent,,,,S,,"Populate with the Custodial Parent Information (when available in HRP)
(Applicable only for Dependents)",,
2100F,NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",S3 Custodial Parent,Min-2   Max-3,R,,"Hardcode as 'S3' If enrollment/member/otherResponsiblePersonInfo/responsibilityTypeCodeCode/codeSetName as ""ResposibilityTypeCode
/enrollment/member/otherResponsiblePersonInfo/responsibilityTypeCodeCode/codeEntry as ""1""",,
2100F,NM102,Entity Type Qualifier,Code qualifying the type of entity,1 = Person,Min-1   Max-1,R,,Hardcode as '1',,
2100F,NM103,Name Last or Organization Name,Custodial Parent Last Name,,Min-1   Max-60,R,/enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsiblePersonName/lastName,,,
2100F,NM104,Name First,Custodial Parent  First Name,,Min-1   Max-35,R,/enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsiblePersonName/firstName,,,
2100F,NM105,Name Middle,Custodial Parent Middle Name,,Min-1   Max-25,S,/enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsiblePersonName/middleName,,,
2100F,NM106,Name Prefix,Custodial Parent Name Prefix,,Min-1   Max-10,S,/enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsiblePersonName/namePrefix,,,
2100F,NM107,Name Suffix,Custodial Parent Name Suffix,,Min-1   Max-10,S,/enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsiblePersonName/nameSuffixList/suffix,,,
2100F,NM108,Identification Code Qualifier,,"34 Social Security Number
ZZ Mutually Defined",Min-1   Max-2,S,,,,
2100F,NM109,Subscriber Identifier,,,Min-2   Max-80,S,,,,
2100F,PER,Custodial Parent  Communications Numbers,,,,S,,,,
2100F,PER01,Contact Function Code,Code identifying the major duty or responsibility of the person or group named,PQ Parent or Guardian,Min-2   Max-2,R,,"Hardcode as 'PQ""",,
2100F,PER02,Name,,,,,,"Not used, leave blank",,
2100F,PER03,Communication Number Qualifier,Code identifying the type of communication number,"AP Alternate Telephone
BN Beeper Number
CP Cellular Phone
EM Electronic Mail
EX Telephone Extension
FX Facsimile
HP Home Phone Number
TE Telephone
WP Work Phone Number",Min-2   Max-2,R,"Populate with ""EM"" if enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsiblePersonEmailAddress is present
Else
Populate
enrollment/member/otherResponsiblePersonInfo/responsibleAddressInfo/addressPhoneList/telephoneNumber/individualPhoneTypeCode/codeEntry","Depending on the number of  occurences of <telephoneNumber>, /codeEntry   needs to be mapped to PER03/05/07",,
2100F,PER04,Communication Number,"Complete communications number including country or area code when
applicable",,Min-1   Max-256,R,enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsiblePersonEmailAddress,If PER03 is  EM,,
,,,,,,,"Concatenate
enrollment/member/otherResponsiblePersonInfo/responsibleAddressInfo/addressPhoneList/telephoneNumber/phoneAreaCode
enrollment/member/otherResponsiblePersonInfo/responsibleAddressInfo/addressPhoneList/telephoneNumber/phoneNumber","Depending on the number of  occurences of <telephoneNumber>, /phoneAreaCode+/phoneNumber   needs to be mapped to PER04/06/08",,
2100F,PER05,Communication Number Qualifier,Code identifying the type of communication number,"AP Alternate Telephone
BN Beeper Number
CP Cellular Phone
EM Electronic Mail
EX Telephone Extension
FX Facsimile
HP Home Phone Number
TE Telephone
WP Work Phone Number",Min-2   Max-2,S,,,,
2100F,PER06,Communication Number,"Complete communications number including country or area code when
applicable",,Min-1   Max-256,S,,,,
2100F,PER07,Communication Number Qualifier,Code identifying the type of communication number,"AP Alternate Telephone
BN Beeper Number
CP Cellular Phone
EM Electronic Mail
EX Telephone Extension
FX Facsimile
HP Home Phone Number
TE Telephone
WP Work Phone Number",Min-2   Max-2,S,,,,
2100F,PER08,Communication Number,"Complete communications number including country or area code when
applicable",,Min-1   Max-256,S,,,,
2100F,N3,Custodial Parent Street Address,,,,S,,,,
2100F,N301,Address Information,"Address Line 1
Input should be up to 35 characters",,Min-1   Max-55,R,/enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsibleAddressInfo/postalAddress/address,,,
2100F,N302,Address Information,"Address Line 2
Input should be up to 35 characters",,Min-1   Max-55,S,/enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsibleAddressInfo/postalAddress/address2,,,
2100F,N4,"Custodial Parent City, State, and Zip Code",,,,S,,,,
2100F,N401,City Name,Custodial Parent City Name,,Min-2   Max-30,R,/enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsibleAddressInfo/postalAddress/cityName,,,
2100F,N402,State or Province Code,State,,Min-2   Max-2,S,/enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsibleAddressInfo/postalAddress/stateCode,,,
2100F,N403,Postal Code,Postal Code,,Min-3   Max-15,S,cocatenate /enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsibleAddressInfo/postalAddress/zipExtensionCode and /enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsibleAddressInfo/postalAddress/zipCode,,,
2100F,N404,Country Code,"If Country Code Not Equal to USA, then populate element",,Min-2   Max-3,S,/enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsibleAddressInfo/postalAddress/countryCode/countryCode,,,
2100F,N407,Country Subdivision Code,Code identifying the country subdivision,,Min-1   Max-3,S,,,,
2100G,NM1,Responsible Person,,,,S,,,,
2100G,NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual","6Y Case Manager
9K Key Person
E1 Person or Other Entity Legally Responsible for a
Child
EI Executor of Estate
EXS Ex-spouse
GB Other Insured
GD Guardian
J6 Power of Attorney
LR Legal Representative
QD Responsible Party
S1 Parent
TZ Significant Other
X4 Spouse",Min-2   Max-3,R,/enrollment/member/otherResponsiblePersonInfo/responsibilityTypeCodeCode/codeEntry,"If enrollment/member/otherResponsiblePersonInfo/responsibilityTypeCodeCode/codeSetName is  ""ResposibilityTypeCode AND
/enrollment/member/otherResponsiblePersonInfo/responsibilityTypeCodeCode/codeEntry",,"From product standpoint it looks like only QD/GD is there in HRP.
-Map 2100G only if the responsibilityTypeCodeCode/codeEntry  = GD/QD,
ELSE don't map this segment"
2100G,NM102,Entity Type Qualifier,Code qualifying the type of entity,1 Person,Min-1   Max-1,R,,1,,
2100G,NM103,Name Last or Organization Name,Individual last name or organizational name,,Min-1   Max-60,R,/enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsiblePersonName/lastName,,,
2100G,NM104,Name First,Individual first name,,Min-1   Max-35,S,/enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsiblePersonName/firstName,,,
2100G,NM105,Name Middle,Individual middle name or initia,,Min-1   Max-25,S,/enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsiblePersonName/middleName,,,
2100G,NM106,Name Prefix,Prefix to individual name,,Min-1   Max-10,S,/enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsiblePersonName/namePrefix,,,
2100G,NM107,Name Suffix,Suffix to individual name,,Min-1   Max-10,S,/enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsiblePersonName//nameSuffixList/suffix,,,
2100G,NM108,Identification Code Qualifier,,"34 Social Security Number
ZZ Mutually Defined",Min-1   Max-2,S,,,,
2100G,NM109,Identification Code,Subscriber Identifier,,Min-2   Max-80,S,,,,
2100G,PER,Responsible Person Communications Numbers,,,,S,,,,
2100G,PER01,Contact Function Code,"Code identifying the major duty or responsibility of the person or group named
Parent or Guardian",RP Responsible Person,Min-2   Max-2,R,,"Hardcode as ""RP'",,
2100G,PER02,Name,,,,,,"Not used, leave blank",,
2100G,PER03,Communication Number Qualifier,Code identifying the type of communication number,"AP Alternate Telephone
BN Beeper Number
CP Cellular Phone
EM Electronic Mail
EX Telephone Extension
FX Facsimile
HP Home Phone Number
TE Telephone
WP Work Phone Number",Min-2   Max-2,R,"Populate with ""EM"" if enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsiblePersonEmailAddress is present
Else
Populate
enrollment/member/otherResponsiblePersonInfo/responsibleAddressInfo/addressPhoneList/telephoneNumber/individualPhoneTypeCode/codeEntry","Depending on the number of  occurences of <telephoneNumber>, /codeEntry   needs to be mapped to PER03/05/07",,
2100G,PER04,Communication Number,,,,,enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsiblePersonEmailAddress,If PER03 is  EM,,
,,,"Complete communications number including country or area code when
applicable",,Min-1   Max-256,R,"Concatenate
enrollment/member/otherResponsiblePersonInfo/responsibleAddressInfo/addressPhoneList/telephoneNumber/phoneAreaCode
enrollment/member/otherResponsiblePersonInfo/responsibleAddressInfo/addressPhoneList/telephoneNumber/phoneNumber","Depending on the number of  occurences of <telephoneNumber>, /phoneAreaCode+/phoneNumber   needs to be mapped to PER04/06/08",,
2100G,PER05,Communication Number Qualifier,Code identifying the type of communication number,"AP Alternate Telephone
BN Beeper Number
CP Cellular Phone
EM Electronic Mail
EX Telephone Extension
FX Facsimile
HP Home Phone Number
TE Telephone
WP Work Phone Number",Min-2   Max-2,S,,,,
2100G,PER06,Communication Number,"Complete communications number including country or area code when
applicable",,Min-1   Max-256,S,,,,
2100G,PER07,Communication Number Qualifier,Code identifying the type of communication number,"AP Alternate Telephone
BN Beeper Number
CP Cellular Phone
EM Electronic Mail
EX Telephone Extension
FX Facsimile
HP Home Phone Number
TE Telephone
WP Work Phone Number",Min-2   Max-2,S,,,,
2100G,PER08,Communication Number,"Complete communications number including country or area code when
applicable",,Min-1   Max-256,S,,,,
2100G,N3,Responsible Person Street Address,Always send both N3 and N4 segments for address changes,,,S,,,,
2100G,N301,Address Information,"Address Line 1
Input should be up to 35 characters",,Min-1   Max-55,R,/enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsibleAddressInfo/postalAddress/address,,,
2100G,N302,Address Information,"Address Line 2
Input should be up to 35 characters",,Min-1   Max-55,S,/enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsibleAddressInfo/postalAddress/address2,,,
2100G,N4,"Responsible Person City, State, and Zip Code",,,,S,,,,
2100G,N401,City Name,City Name,,Min-2   Max-30,R,/enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsibleAddressInfo/postalAddress/cityName,,,
2100G,N402,State or Province Code,State,,Min-2   Max-2,S,/enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsibleAddressInfo/postalAddress/stateCode,,,
2100G,N403,Postal Code,Postal Code,,Min-3   Max-15,S,cocatenate /enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsibleAddressInfo/postalAddress/zipExtensionCode and /enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsibleAddressInfo/postalAddress/zipCode,,,
2100G,N404,Country Code,"If Country Code Not Equal to USA, then populate element",,Min-2   Max-3,S,/enrollment/member/otherResponsiblePersonInfo/otherResponsiblePersonInfo/responsibleAddressInfo/postalAddress/countryCode/countryCode,,,
2100G,N407,Country Subdivision Code,Code identifying the country subdivision,,Min-1   Max-3,S,,,,
2100H,NM1,Drop Off Location,,,,S,,,,
2100H,NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",45 Drop-off Location,Min-2   Max-3,R,,,,
2100H,NM102,Entity Type Qualifier,Code qualifying the type of entity,1 Person,Min-1   Max-1,R,,,,
2100H,NM103,Name Last or Organization Name,Individual last name or organizational name,,Min-1   Max-60,S,,,,
2100H,NM104,Name First,Individual first name,,Min-1   Max-35,S,,,,
2100H,NM105,Name Middle,Individual middle name or initia,,Min-1   Max-25,S,,,,
2100H,NM106,Name Prefix,Prefix to individual name,,Min-1   Max-10,S,,,,
2100H,NM107,Name Suffix,Suffix to individual name,,Min-1   Max-10,S,,,,
2100H,N3,Drop off location Street Address,Always send both N3 and N4 segments for address changes,,,S,,,,
2100H,N301,Address Information,"Address Line 1
Input should be up to 35 characters",,Min-1   Max-55,R,,,,
2100H,N302,Address Information,"Address Line 2
Input should be up to 35 characters",,Min-1   Max-55,S,,,,
2100H,N4,"Drop off location City, State, and Zip Code",,,,S,,,,
2100H,N401,City Name,City Name,,Min-2   Max-30,R,,,,
2100H,N402,State or Province Code,State,,Min-2   Max-2,S,,,,
2100H,N403,Postal Code,Postal Code,,Min-3   Max-15,S,,,,
2100H,N404,Country Code,"If Country Code Not Equal to USA, then populate element",,Min-2   Max-3,S,,,,
2100H,N407,Country Subdivision Code,Code identifying the country subdivision,,Min-1   Max-3,S,,,,
2200,DSB,Disability Information,,,,S,,,,
2200,DSB01,Disability Type Code,Code identifying the disability status of the individual,"1 Short Term Disability
2 Long Term Disability
3 Permanent or Total Disability
4 No Disability",Min-1   Max-1,R,,,,
2200,DSB07,Product/Service ID Qualifier,"Code identifying the type/source of the descriptive number used in
Product/Service","DX International Classification of Diseases, 9th
Revision, Clinical Modification (ICD-9-CM) -
Diagnosis

ZZ Mutually Defined",Min-2   Max-2,S,,,,
2200,DSB08,Medical Code Value,Code value for describing a medical condition or procedure,,Min-1   Max-15,S,,,,
,DTP,Disability Eligibility Dates,,,,S,,,,
2200,DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time","360 Initial Disability Period Start
361 Initial Disability Period End",Min-3   Max-3,R,,,,
2200,DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",D8 Date Expressed in Format CCYYMMDD,Min-2   Max-3,R,,,,
2200,DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",,Min-1   Max-35,R,,,,
2300,HD,Health Coverage,,,,S,"This loop can occur multiple times. For each <planselection> tag, there should be one HD Loop",,,
2300,HD01,Maintenance Type Code,Code identifying the specific type of item maintenance,"001 Change
002 Delete
021 Addition
024 Cancellation or Termination
025 Reinstatement
026 Correction
030 Audit or Compare
032 Employee Information Not Applicable",Min-3   Max-3,R,,Hardcode as '030',,
2300,HD03,Insurance Line Code,Code identifying a group of insurance products,"AG Preventative Care/Wellness
AH 24 Hour Care
AJ Medicare Risk
AK Mental Health
DCP Dental Capitation
DEN Dental
EPO Exclusive Provider Organization
FAC Facility
HE Hearing
HLT Health
HMO Health Maintenance Organization
LTC Long-Term Care
LTD Long-Term Disability
MM Major Medical
MOD Mail Order Drug
PDG Prescription Drug
POS Point of Service
PPO Preferred Provider Organization
PRA Practitioners
STD Short-Term Disability
UR Utilization Review
VIS Vision",Min-2   Max-3,R,,"Hardcode  to ""HLT""",Yes,"From Product standpoint in current mapping is done for only Health plans
Implementation team can handle for vision / dental plans"
2300,HD04,Plan Coverage Description,Code identifying a group of insurance products,,Min-1   Max-50,S,/enrollment/member/planSelection/benefitPlanMatchData/benefitPlanName,,Yes,"Benefitplanname information should be fetched from the BenefitPlan Xwalk (crosswalk) table. From a product standpoint, this can be handled in two ways at the adaptor layer, and the implementation team can choose one of the following approaches:
1. From product standpoint, after reversecrosswalk taking the parameter 1 and parameter 3 and mapped to  REF*CE and HD04 respectively.
- The lookup paramter will be appended with comma following the benefitplanname and then the parameter values can be mapped to respective target - handled in adaptor layer.
- Based on the implementation team the target may vary
2. Direct mapping can be done, value in the benefitPlanName can be mapped to HD04. - this will be handled in adaptor layer"
2300,HD05,Coverage Level Code,Code indicating the level of coverage being provided for this insured,"CHD Children Only
DEP Dependents Only
E1D Employee and One Dependent
E2D Employee and Two Dependents
E3D Employee and Three Dependents
E5D Employee and One or More Dependents
E6D Employee and Two or More Dependents
E7D Employee and Three or More Dependents
E8D Employee and Four or More Dependents
E9D Employee and Five or More Dependents
ECH Employee and Children
EMP Employee Only
ESP Employee and Spouse
FAM Family
IND Individual
SPC Spouse and Children
SPO Spouse Only
TWO Two Party",Min-3   Max-3,S,,,,
2300,HD09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,,Min-1   Max-1,S,,,,
2300,DTP,Health Coverage Dates,"This date could be an active, terminated or reinstated coverage for a past date or an future date",,,R,,,,
2300,DTP01,Date Time Qualifier,348 - Being Date,"300 Enrollment Signature Date
303 Maintenance Effective
343 Premium Paid to Date End
348 Benefit Begin
349 Benefit End
543 Last Premium Paid Date
695 Previous Period",Min-3   Max-3,R,,Hardcode as 348 (Coverage Begin Date),,
2300,DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format","D8 Date Expressed in Format CCYYMMDD
RD8 Range of Dates Expressed in Format CCYYMMDDCCYYMMDD",Min-2   Max-3,R,,"Hardcode  to ""D8""",,
2300,DTP03,Date Time Period,"Coverage Period
Expression of a date, a time, or range of dates, times or dates and times",,Min-1   Max-35,R,/enrollment/member/planSelection/startDate,,,
2300,DTP,Health Coverage Dates,"This date could be an active, terminated or reinstated coverage for a past date or an future date",,,R,,,,
2300,DTP01,Date Time Qualifier,349 - End Date,,Min-3   Max-3,R,,Hardcode as 349  If enrollment/member/planSelection/EndDate is present,,
2300,DTP02,Date Time Period Format Qualifier,,,Min-2   Max-3,R,,"Hardcode  to ""D8""",,
2300,DTP03,Coverage Period,,,Min-1   Max-35,R,enrollment/member/planSelection/EndDate,,,
2300,AMT,Health Coverage Policy,,,,S,,,,
2300,AMT01,Amount Qualifier Code,Code to qualify amount,"B9 Co-insurance - Actual
C1 Co-Payment Amount
D2 Deductible Amount
EBA Expected Expenditure Amount
FK Other Unlisted Amount
P3 Premium Amount
R Spend Down",Min-1   Max-3,R,,,,
2300,AMT02,Monetary Amount,monetary amount,,Min-1   Max-18,R,,,,
2300,REF,Health Coverage Policy Number,,,,S,,,,
2300,REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,"17 Client Reporting Category
1L Group or Policy Number
9V Payment Category
CE Class of Contract Code
E8 Service Contract (Coverage) Number
M7 Medical Assistance Category
PID Program Identification Number
RB Rate code number
X9 Internal Control Number
XM Issuer Number
XX1 Special Program Code
XX2 Service Area Code
ZX County Code
ZZ Mutually Defined",Min-2   Max-3,R,,,,
2300,REF02,Reference Identification,,,Min-1   Max-50,R,,,,
2300,REF,Prior Covergae Months,,,,S,,,,
2300,REF01,Reference Identification Qualifier,,QQ Unit Number,Min-2   Max-3,R,,,,
2300,REF02,Reference Identification,,,Min-1   Max-50,R,,,,
2300,IDC,Identification Card,,,,S,,,,
2300,IDC01,Plan Coverage Description,A description or number that identifies the plan or coverage,,Min-1   Max-50,R,,,,
2300,IDC02,Identification Card Type Code,Code identifying the type of identification card,"D Dental Insurance
H Health Insurance
P Prescription Drug Service Drug Insurance",Min-1   Max-1,R,,,,
2300,IDC03,Quantity,Numeric value of quantity,,Min-1   Max-15,S,,,,
2300,IDC04,Action Code,Code indicating type of action,"1 Add
2 Change (Update)
RX Replace",Min-1   Max-2,S,,,,
2310,LX,PROVIDER INFORMATION,,,,S,,"Do not populate this instance of the loop when the PCP NPI is ""P00000000""",,We need increment  the value +1 based on counter on every occurrence
2310,LX01,Assigned Number,"Assined Number
This is a sequential number representing the number of loops for
this insured person. Begin with 1 for each insured person.",,Min-1   Max-6,R,,Hardcode as 1 when reporting PCP,,
2310,NM1,PROVIDER NAME,"It will be custom change for Implementation team,they can configure the qualifier based on UDT/Otherid",,,R,,,,
2310,NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual","1X Laboratory
3D Obstetrics and Gynecology Facility
80 Hospital
FA Facility
OD Doctor of Optometry
P3 Primary Care Provider
QA Pharmacy
QN Dentist
Y2 Managed Care Organization",Min-2   Max-3,R,,"Harcode as ""P3"" if enrollment/member/providerSelections/providerSelection/providerRoleType = '1'",,
2310,NM102,Entity Type Qualifier,Code qualifying the type of entity,"1 Person
2 Non-Person Entity",Min-1   Max-1,R,,"Hardcode as 1 if
enrollment/member/providerSelections/providerSelection/providerDateRanges/providerMatch/practitioner/hccIdentificationNumber != "" ""

Hardcode as 2 if

enrollment/member/providerSelections/providerSelection/providerDateRanges/providerMatch/supplier/hccIdentificationNumber != "" """,,
2310,NM103,Provider Last Name,Individual last name or organizational /clinicname,,Min-1   Max-60,S,,,,
2310,NM104,Provider First Name,Individual first name,,Min-1   Max-35,S,,,,
2310,NM105,Provider Middle Name,Individual middle name or initia,,Min-1   Max-25,S,,,,
2310,NM106,Provider Name Prefix,Individual middle name or initia,,Min-1   Max-10,S,,,,
2310,NM107,Provider Name Suffix,,,Min-1   Max-10,S,,,,
2310,NM108,ID Code Qualifier,"34 Social Security Number
FI Federal Taxpayer’s Identification Number
SV Service Provider Number
XX Centers for Medicare and Medicaid Services
National Provider Identifier","34: SSN
FI: Federal Tax ID
SV: Service Provider Number(This is a number assigned by the payer used to identify a provider.)
 XX: Centers for Medicare and Medicaid Services
National Provider Identifier",Min-1   Max-2,S,,"Hardcode as 'SV""",,
2310,NM109,ID Code,Provider Identifier,,Min-2   Max-80,S,"//Practitioner
enrollment/member/providerSelections/providerSelection/providerDateRanges/providerMatch/practitioner/hccIdentificationNumber",,,
,,,,,,,"//Supplier
enrollment/member/providerSelections/providerSelection/providerDateRanges/providerMatch/supplier/hccIdentificationNumber",,,
2310,NM110,Entity Relationship Code,Code describing entity relationship,"25 Established Patient
26 Not Established Patient
72 Unknown",Min-2   Max-2,R,,"Hardcode as ""72""",,
2310,N3,PROVIDER ADDRESS,,,,S,,Populate when corresponding PCP address information is available in HRP,,
2310,N301,Provider Address Line,Address line1,,Min-1   Max-55,R,,,,
2310,N302,Provider Address Line,Address line2,,Min-1   Max-55,S,,,,
2310,N4,"PROVIDER CITY, STATE, ZIP CODE",,,,S,,,,
2310,N401,Provider City Name,Free-form text for city name,,Min-2   Max-30,R,,,,
2310,N402,Provider State Code,Code (Standard State/Province) as defined by appropriate government agency,,Min-2   Max-2,S,,,,
2310,N403,Provider ZIP Code,"Code defining international postal zone code excluding punctuation and blanks
(zip code for United States)",,Min-3   Max-15,S,,,,
2310,N404,Provider Country Code,Code identifying the country,,Min-2   Max-3,S,,,,
2310,N407,Country Subdivision Code,Code identifying the country subdivision,,Min-1   Max-3,S,,,,
2310,PER,PROVIDER COMMUNICATIONS NUMBERS,,,,S,,,,
2310,PER01,Contact Function Code,Code identifying the major duty or responsibility of the person or group named,IC = Information Contact,Min-2   Max-2,R,,,,
2310,PER03,Communication Number Qualifier,Code identifying the type of communication number,"AP Alternate Telephone
BN Beeper Number
CP Cellular Phone
EM Electronic Mail
EX Telephone Extension
FX Facsimile
HP Home Phone Number
TE Telephone
WP Work Phone Number",Min-2   Max-2,R,,,,
2310,PER04,Communication Number,Code identifying the major duty or responsibility of the person or group named,IC = Information Contact,Min-1   Max-256,R,,,,
2310,PER05,Communication Number Qualifier,Code identifying the type of communication number,"AP Alternate Telephone
BN Beeper Number
CP Cellular Phone
EM Electronic Mail
EX Telephone Extension
FX Facsimile
HP Home Phone Number
TE Telephone
WP Work Phone Number",Min-2   Max-2,S,,,,
2310,PER06,Communication Number,Code identifying the major duty or responsibility of the person or group named,IC = Information Contact,Min-1   Max-256,S,,,,
2310,PER07,Communication Number Qualifier,Code identifying the type of communication number,"AP Alternate Telephone
BN Beeper Number
CP Cellular Phone
EM Electronic Mail
EX Telephone Extension
FX Facsimile
HP Home Phone Number
TE Telephone
WP Work Phone Number",Min-2   Max-2,S,,,,
2310,PER08,Communication Number,,"Complete communications number including country or area code when
applicable",Min-1   Max-256,S,,,,
2310,PLA,Provider Change Reason,,,,S,,,,
2310,PLA01,Action Code,Code indicating type of action,2 Change (Update),Min-1   Max-2,R,,,,
2310,PLA02,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",1P Provider,Min-2   Max-3,R,,,,
2310,PLA03,Date,"Date expressed as CCYYMMDD where CC represents the first two digits of the
calendar year
Provider Effective Date",,Min-8   Max-8,R,,,,
2310,PLA05,Maintenance Reason Code,Maintenance Reason Code,"14 Voluntary Withdrawal
22 Plan Change
46 Current Customer Information File in Error
AA Dissatisfaction with Office Staff
AB Dissatisfaction with Medical Care/Services Rendered
AC Inconvenient Office Location
AD Dissatisfaction with Office Hours
AE Unable to Schedule Appointments in a Timely
Manner
AF Dissatisfaction with Physician’s Referral Policy
AG Less Respect and Attention Time Given than to
Other Patients
AH Patient Moved to a New Location
AI No Reason Given
AJ Appointment Times not Met in a Timely Manner",Min-2   Max-3,R,,,,
2320,COB,COB-Coordination of Benefits,,,,S,COB mapping is currently not in product scope.,"This loop occurs up to 5 times depending on number policies for the recipient and whether the coverage dates of the policy are current. If a client has >5 TPL spans, only the 5 most current spans will be used.",,This loop should be mapped only on the 1st instance of the HD loop
2320,COB01,Payer Responsibility Sequence Number Code,"Code identifying the insurance carrier’s level of responsibility for a payment of a
claim
C","P Primary
S Secondary
T Tertiary
U Unknown",Min-1   Max-1,R,/enrollment/member/cobPolicy/dateRanges/responsibilitySequenceCode,"P=Primary, S=Secondary, U=Unknown",,COB mapping is currently not in product scope.
2320,COB02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier
Member Group or Policy Number",,Min-1   Max-50,S,enrollment/member/cobPolicy/groupNumber,,,
2320,COB03,Coordination of Benefits Code,Code identifying whether there is a coordination of benefits,"1 Coordination of Benefits
5 Unknown
6 No Coordination of Benefits",Min-1   Max-1,R,,"Always Hardcode it to ""1"" if <cobPolicy> is present",,
2320,COB04,Service Type Code,Code identifying the classification of service,"1 Medical Care
35 Dental Care
48 Hospital - Inpatient
50 Hospital - Outpatient
54 Long Term Care
89 Free Standing Prescription Drug
90 Mail Order Prescription Drug
A4 Psychiatric
AG Skilled Nursing Care
AL Vision (Optometry)
BB Partial Hospitalization (Psychiatric)",Min-1   Max-2,S,,,,
2320,REF,Additional Coordination of Benefits Identifiers,,,,S,,,,
2320,REF01,Reference Identification Qualifier,6P Group Number,"60 Account Suffix Code
6P Group Number
SY Social Security Number
ZZ Mutually Defined",Min-2   Max-3,R,,,,
2320,REF02,Reference Identification,Member Group or Policy Number,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",Min-1   Max-50,R,,,,
2320,DTP,Coordination of Benefits Eligibility Dates,,,,S,,,,
2320,DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time","344 Coordination of Benefits Begin
345 Coordination of Benefits End",Min-3   Max-3,R,,"Populate with ""344"" if /enrollment/member/cobPolicy/dateRanges/startDate is present",,
2320,DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",D8 Date Expressed in Format CCYYMMD,Min-2   Max-3,R,,"Hardcode  with ""D8""  if enrollment/member/cobPolicy/dateRanges/startDate is present",,
2320,DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times
Coordination of Benefit Date",,Min-1   Max-35,R,/enrollment/member/cobPolicy/dateRanges/startDate,,,
2320,DTP,Coordination of Benefits Eligibility Dates,,,,S,,Populate only when the Member's COB Eligibility End date is available,,
2320,DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time","344 Coordination of Benefits Begin
345 Coordination of Benefits End",Min-3   Max-3,R,,"Populate with ""345"" if enrollment/member/cobPolicy/dateRanges/endDate is present",,
2320,DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",D8 Date Expressed in Format CCYYMMD,Min-2   Max-3,R,,"Hardcode  with ""D8""  if enrollment/member/cobPolicy/dateRanges/endDate is present",,
2320,DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times
Coordination of Benefit Date",,Min-1   Max-35,R,enrollment/member/cobPolicy/dateRanges/endDate,Populdated with the COB End Date,,
2330,NM1,Coordination of Benefits Related Entity,,,,S,,,,
2330,NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual","36 Employer
GW Group
IN Insurer",Min-2   Max-3,R,,,,
2330,NM102,Entity Type Qualifier,Code qualifying the type of entity,2 Non-Person Entity,Min-1   Max-1,R,,,,
2330,NM103,Member Last Name,Name Last or Organization Name,,Min-1   Max-60,S,,,,
2330,NM108,ID Code Qualifier,"Code designating the system/method of code structure used for Identification
Code","FI Federal Taxpayer’s Identification Number
NI National Association of Insurance Commissioners
(NAIC) Identification
XV Centers for Medicare and Medicaid Services PlanID",Min-1   Max-2,S,,,,
2330,NM109,Identification Code,Code identifying a party or other code,,Min-2   Max-80,S,,,,
2330,N3,Coordination of Benefits Related Entity Address,,,,S,,,,
2330,N301,Address Line,Address Information,,Min-1   Max-55,R,,,,
2330,N302,Address Line,Address Information,,Min-1   Max-55,S,,,,
2330,N4,"Coordination of benefits related entity other insurance company city,state,zipcode",,,,S,,,,
2330,N401,City Name,Free-form text for city name,,Min-2   Max-30,R,,,,
2330,N402,State Code,Code (Standard State/Province) as defined by appropriate government agency,,Min-2   Max-2,S,,,,
2330,N403,ZIP Code,"Code defining international postal zone code excluding punctuation and blanks
(zip code for United States)",,Min-3   Max-15,S,,,,
2330,N404,Country Code,Code identifying the country,,Min-2   Max-3,S,,,,
2330,N407,Country Subdivision Code,Code identifying the country subdivision,,Min-1   Max-3,S,,,,
2330,PER,Administrative Communications Contact,,,,S,,,,
2330,PER01,Contact Function Code,Code identifying the major duty or responsibility of the person or group named,CN General Contact,Min-2   Max-2,R,,,,
2330,PER03,Communication Number Qualifier,Code identifying the type of communication number,TE Telephone,Min-2   Max-2,R,,,,
2330,PER04,Communication Number,"Complete communications number including country or area code when
applicable",,Min-1   Max-256,R,,,,
2700,LS,Additional Reporting Categories,,,,S,,,,
2700,LS01,Loop Identifier Code,"The loop ID number given on the transaction set diagram is the value for this data
element in segments LS and LE",,Min-1   Max-4,R,,,,
2710,LX,Member reporting categories,,,,S,,,,
2710,LX01,Assigned Number,Number assigned for differentiation within a transaction set,,Min-1   Max-6,R,,,,
2750,N1,Reporting Category,,,,S,"From Product standpoint ,we are not currently dealing with the Reporting category. Instead, the implementation team will be responsible for making the necessary changes from their end without touching the core map.",,,
2750,N101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",75 Participant,Min-2   Max-3,R,,,,
2750,N102,Name,Free-form name,,Min-1   Max-60,R,,,,
2750,REF,Reporting Category Reference,,,,S,,,,
2750,REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,"00 Contracting District Number
17 Client Reporting Category
18 Plan Number
19 Division Identifier
26 Union Number
3L Branch Identifier
6M Application Number
9V Payment Category
9X Account Category
GE Geographic Number
LU Location Number
PID Program Identification Number
XX1 Special Program Code
XX2 Service Area Code
YY Geographic Key
ZZ Mutually Defined",Min-2   Max-3,R,,,,
2750,REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",,Min-1   Max-50,R,,,,
2750,DTP,Reporting Category Date,,,,S,,,,
2750,DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",007 Effective,Min-3   Max-3,R,,,,
2750,DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format","D8 Date Expressed in Format CCYYMMDD
RD8 Range of Dates Expressed in Format CCYYMMDDCCYYMMDD",Min-2   Max-3,R,,,,
2750,DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",,Min-1   Max-35,R,,,,
2000,LE,Additional Reporting Categories loop Termination,,,,S,,,,
,LE01,Loop Identifier Code,"The loop ID number given on the transaction set diagram is the value for this data
element in segments LS and LE",,Min-1   Max-4,R,,,,
SE (Transaction Set Trailer),,,,,,,,,,
,SE,Transaction Set Trailer,,,,R,,,,
,SE01,Number of Included Segments,"The loop ID number given on the transaction set diagram is the value for this data
element in segments LS and LE",,Min-1   Max-10,R,,Total number of segments included in the transaction set including ST and SE segments,,
,SE02,Transaction Set Control Number,"Identifying control number that must be unique within the transaction set
functional group assigned by the originator for a transaction set",,Min-4   Max-9,R,,ST02 and SE02 will be identical,,
GE (Functional Group Trailer),,,,,,,,,,
,GE,Function Group Trailer,,,,,,,,
,GE01,Number of Transaction Sets Included,,,,,,Total number of transactions set included in the group or interchange,,
,GE02,Group Control Number,,,,,,Submitter-specific number.,,
,,,,,,,,GS06 and GE02 will be identical,,
IEA (Interchange Control Trailer Segment),,,,,,,,,,
,IEA,Interchange Control Trailer,,,,,,,,
,IEA01,Number of Included Functional Groups,,,,,,Submitter-specific number.  A count of the number of functional groups,,
,IEA02,Interchange Control Number,,,,,,Sender-specific control number.,,
,,,,,,,,ISA12 and IEA02 will be identical,,
```

## Enrollment OB/V26.1.1.0/EdifecsProduct_Mappingspec_OutboundEnrollment _834_XML_to_EDIConversion_V1.2.xlsx — Comparison with IB and OB

```csv
Enrollment 834,,,,,
Inbound,,,Outbound,,
1000A,N1,Sponsor Name,1000A,N1,Sponsor Name
1000B,N1,Payer,1000B,N1,Payer
1000C,N1,TPA/Broker Name,1000C,N1,TPA/Broker Name
2000,INS,Member Level Detail,2000,INS,Member Level Detail
2100A,NM1,Member Name,2100A,NM1,Member Name
2100B,NM1,Incorrect Member Name,,,
2100C,NM1,Member Mailing Address,2100C,NM1,Member Mailing Address
2100F,NM1,Custodial Parent,2100F,NM1,Custodial Parent
2100G,NM1,Responsible Person,2100G,NM1,Responsible Person
2200,DSB,Disability,,,
2200,DTP,Disability Eligibility Dates,,,
2300,HD,Health Coverage,2300,HD,Health Coverage
2310,LX,Provider Information,2310,LX,Provider Information
2320,COB,COB-Coordination of Benefits,2320,COB,COB-Coordination of Benefits
2330,NM1,Coordination of Benefits Related Entity,2330,NM1,Coordination of Benefits Related Entity
2700,LS,Additional Reporting Categories Loop,,,
2710,LX,Member Reporting Categories,,,
2750,N1,Reporting Category,,,
```

## Enrollment OB/V26.1.1.0/EdifecsProduct_Mappingspec_OutboundEnrollment _834_XML_to_EDIConversion_V1.2.xlsx — Conversion copy

```csv
Individual Relationship Codes,,Employment Status Code,,Race Codes - 2100A.DMG05 - 1,
2000.INS02,Value in XML.,Value in XML,2000.INS08,Code,Description
01,Spouse,AC,AC,7,Not Provided
02,Father or Mother,AO,AO,8,Not Applicable
03,Grandmother or Grandfather,3,AU,A,Asian or Pacific Islander
04,Grandson or Granddaughter,1,FT,B,Black
05,Uncle or Aunt,6,L1,C,Caucasian
06,Nephew or Niece,2,PT,D,Subcontinent Asian American
07,Cousin,4,RT,E,Other Race or Ethnicity
08,Adopted Child,TE,TE,F,Asian Pacific American
10,Foster Child,,,G,Native American
11,Son-in-law or Daughter-in-law,,,H,Hispanic
12,Brother-in-law or Sister-in-law,,,I,American Indian or Alaskan Native
13,Mother-in-law or Father-in-law,,,J,Native Hawaiian
14,Brother or Sister,,,N,Black (Non-Hispanic)
15,Ward,,,O,White (Non-Hispanic)
16,Stepparent,,,P,Pacific Islander
17,Stepson or Stepdaughter,,,Z,Mutually Defined
18,Self,,,,
19,Child,,,,
23,Sponsored Dependent,,,,
24,Dependent of a Minor Dependent,,,,
25,Ex-spouse,,,,
26,Guardian,,,,
31,Court Appointed Guardian,,,,
38,Collateral Dependent,,,,
53,Life Partner,,,,
60,Annuitant,,,,
D2,Trustee,,,,
G8,Other Relationship,,,,
G9,Other Relative,,,,
```

## Enrollment OB/V26.1.1.0/OB Enrollment_Audit Mapping_V1.0.xlsx — Cover sheet

```csv
,OB Enrollment Audit Processing -  EDIFECS,,,,,,,,,
,,,,,,,,,,
,Business Area: OB enrollment XML - EDI 834 Conversion,,,,,,,,,
,,,,,,,,,,
,This document provides the Audit Mapping Specification for EDI 834 Ob Enrollment. Document is intended for EDIFECS Product Team,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,Version,,V24.4.0.0,,,
,,,,,,,,,,
,,Distribution of this document is limited to UST HealthProof,,,,,,,,
,,,,,,,,,,
,,Notice of Confidentiality and Custodial Responsibilities,,,,,,,,
,,This UST HealthProof document contains confidential information that is,,,,,,,,
,,"UST HealthProof’s intellectual property. As a holder of this document, you",,,,,,,,
,,may NOT disclose its content or any information derived from it to,,,,,,,,
,,any person outside of UST Proof Project Team.,,,,,,,,
,,,,,,,,,,
,Sign Off,,,,,,,,,
,,Name,,Role,,Organization,,Date,,Approval
,Approver #1,,,,,,,,,
,Approver #2,,,,,,,,,
,Approver #3,,,,,,,,,
,Approver #4,,,,,,,,,
```

## Enrollment OB/V26.1.1.0/OB Enrollment_Audit Mapping_V1.0.xlsx — Version History

```csv
,,Revision History,,,,
,,,,,,
,,V#,Date,Author,Reviewer(s)/ Contributor(s),Comments
,,0.1,10/12/24,SwedhaKumar,Ambily Raj,Initial Version
,,1.0,16/12/2024,SwedhaKumar,Ambily Raj,Baselined
```

## Enrollment OB/V26.1.1.0/OB Enrollment_Audit Mapping_V1.0.xlsx — Audit Mapping

```csv
JSON field,Mandatory field(Y/N),EDIFECS Logic,Sample value,,,,,,,,
spInvokedBy,N,OUTBOUND-ENROLLMENT-EDIFECS-SERVICE,OUTBOUND-ENROLLMENT-EDIFECS-SERVICE,,,,,,,,
extractName,Y,OB_Enrollment_Extract,OB_Enrollment_Extract,,,,,,,,
recipientName,N,blank,null (custom field),,,,,,,,
extractId,Y,extraction id from summary file,"""20240227-a18118bf-9a7c-40c8-b5d5-e9b864557366""",,,,,,,,
jobId,Y,job ID fetched from summary file,null,,,,,,,,// unique Id
recordCount,N,number of member in a  single family,1,,,,,,,,
pageId,Y,unique id for each memberid,20240227-033631f0-a976-4a05-abe0-a5fb18876b66,,,,,,,,
pageNum,Y,Incremental value for each Xml wrt to the respective extractionid,1,,,,,,,,
extractFileName,Y,"For good EDI event filename = EDI_OB_834_{Prp[summaryExtractionID]}
For bad EDI event filename - Rejected_EDI_OB_834_{Prp[summaryExtractionID]}",Rejected_EDI_OB_834_40241216-b4c1bc44-2d46-4c28-97f2-4cfc7bf516fa,,,,,,,,
pageExtractStatus,N,Refer Audit events tab,"""Publishing_to_Service_Success""",,,,,,,,
pageErrorDesc,N,Refer Audit events tab,null,,,,,,,,
pageProcessStartTs,Y,current date and time,yyyy-MM-dd'T'HH:mm:ss.SSS+00:00,,,,,,,,
pageProcessEndTs,N,blank,null,,,,,,,,
pageDataId,Y,Populate member ID,M000008024-01,,,,,,,,
auditCreatedTs,N,current date and time,yyyy-MM-dd'T'HH:mm:ss.SSS+00:00,,,,,,,,
fileLocation,N,location of the xml file and edi  file,null,,,,,,,,
```

## Enrollment OB/V26.1.1.0/OB Enrollment_Audit Mapping_V1.0.xlsx — Audit Events

```csv
Audit events,,
Audit Json trigger events,pageExtractStatus,pageErrorDesc
XML file received,SUCCESS-EDIFECS- XML FILE RECEIVED,
EDI validtion,"SUCCESS-EDIFECS-HIPAA VALIDATION/
FAILURE",FAILURE-EDIFECS-HIPAA VALIDATION
```

## Enrollment OB/V26.1.1.0/OB Enrollment_Audit Mapping_V1.0.xlsx — Json layout

```csv
Sample JSON - Jira # - https://usthp-products.atlassian.net/browse/INTP-8207
"{
    ""extractId"": ""20241212-0ee14402-922e-4595-8777-456dcf5f008"",
    ""extractName"": ""Ob_835_extraction_service"",
    ""spInvokedBy"": ""Generic_Extraction_Service"",
    ""pageId"": ""20241209-b698292d-f51c-4304-Testjj"",
    ""jobId"": ""OB-with-date-demo-Test"",
    ""pageNum"": 9,
    ""extractFileName"": null,
    ""pageExtractStatus"": ""SUCCESS-EDIFECS-HIPAA VALIDATION"",
    ""pageErrorDesc"": null,
    ""pageProcessStartTs"": ""2024-12-09T09:39:26.639+00:00"",
    ""pageProcessEndTs"": null,
    ""auditCreatedTs"": ""2024-12-09T09:39:26.639+00:00"",
    ""recordCount"": 1,
    ""recipientName"": null,
    ""pageDataId"": ""218225"",
    ""fileLocation"": ""/GenericExtract/Enrollments/CSV/TEST/NEW""
}"


Jira # - https://usthp-products.atlassian.net/browse/INTP-8207
```

## Enrollment OB/V26.1.1.0/OB Enrollment_Audit Mapping_V1.0.xlsx — Sample Audit Json

```csv
Sample Audit from EDIFECS
"{
  ""extractId"": ""40241216-b4c1bc44-2d46-4c28-97f2-4cfc7bf516fa"",
  ""extractName"": ""OB_Enrollment_Extract"",
  ""spInvokedBy"": ""OUTBOUND_ENROLLMENT_EDIFECS_SERVICE"",
  ""pageId"": ""K8LBk-9zZgEUpglS"",
  ""jobId"": ""Enrollment-Extraction"",
  ""pageNum"": 5,
  ""extractFileName"": ""Rejected_EDI_OB_834_40241216-b4c1bc44-2d46-4c28-97f2-4cfc7bf516fa"",
  ""pageExtractStatus"": ""FAILURE"",
  ""pageErrorDesc"": ""FAILURE-EDIFECS-HIPAA VALIDATION"",
  ""pageProcessStartTs"": ""2024-12-22T12:38:57.263+00:00"",
  ""pageProcessEndTs"": null,
  ""auditCreatedTs"": ""2024-12-22T12:38:57.718+00:00"",
  ""recordCount"": 1,
  ""recipientName"": null,
  ""pageDataId"": ""111TEST45"",
  ""fileLocation"": null
}"
```

## Enrollment OB/V26.1.1.0/OB Enrollment_Audit Mapping_V1.0.xlsx — queue details

```csv
Queues used:,
,healthproof-iplus-generic-extraction-audit-dev
,
Tables used:,
,integrationPlus.generic_extract_page_info
,integrationPlus.generic_extraction_summary
```
