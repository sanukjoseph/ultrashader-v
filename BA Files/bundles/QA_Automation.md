# QA Automation

## QA Automation/EdifecsProduct_MappingSpec_QA Automation_834_EDI_to_CSVConversion_V1.3.xlsx — Cover Page

```csv
Mapping Specification,,,,,,,,,
,,,,,,,,,
Data Extraction for QA automation - EDI 834 to CSV Format,,,,,,,,,
,,,,,,,,,
This document provides the Mapping Specification for converting EDI 834 enrollment file into CSV format as part of the data extraction for QA automation. Document is intended for EDIFECS Product Team,,,,,,,,,
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

## QA Automation/EdifecsProduct_MappingSpec_QA Automation_834_EDI_to_CSVConversion_V1.3.xlsx — Revision History

```csv
Revision History,,,,
,,,,
,,,,
,,,,
V#,Date,Author,Reviewer(s)/ Contributor(s),Comments
1.0,16-06-2023,Ambily Raj,Shijila M,Baselined.
1.1,05-10-2023,Ambily Raj,Shijila M,"To Incorporate changes suggested by Automation Team
1. Header record section not required , header record details needs to populated inside the member detail record itself.
2. If possible, Dates in the csv generated should be in the format yyyy-mm-dd."
1.2,05-10-2023,Ambily Raj,Shijila M,Made all fields except Subscriber ID as Situational.
1.3,10/30/23,Ambily Raj,Shijila M,"Added new fields to the layout as per the request from IBC QA automation team.
1. Immigration_Status
2.Effectuation_Date_*"
```

## QA Automation/EdifecsProduct_MappingSpec_QA Automation_834_EDI_to_CSVConversion_V1.3.xlsx — CSV format

```csv
Sr No,Field Name,Datatype,Length,"Usage
_R: Required
 S: Situational",Comments
1,Subscriber_ID,VARCHAR,10,R,
2,EdiFilename,VARCHAR,100,S,Populate only for Subscriber
3,SenderId,VARCHAR,15,S,Populate only for Subscriber
4,ReceiverId,VARCHAR,15,S,Populate only for Subscriber
5,ActionCode,VARCHAR,2,S,Populate only for Subscriber
6,Maintenance_Type_Code,VARCHAR,20,S,
7,Maintenance_type_code_EDI,VARCHAR,3,S,
8,Maintenance_Override,VARCHAR,5,S,
9,MaintenanceReasonCode_Name,VARCHAR,30,S,Populate only for Subscriber
10,MaintenanceReasonCode_Entry,VARCHAR,3,S,Populate only for Subscriber
11,Member_MaintenanceReasonCode_Name,VARCHAR,30,S,
12,Member_MaintenanceReasonCode_Entry,VARCHAR,3,S,
13,Individual_Relationship_Code,VARCHAR,2,S,
14,Relationship_Name,VARCHAR,30,S,
15,BenefitStatusCode,VARCHAR,1,S,
16,MemberIsSubscriber,VARCHAR,5,S,
17,Ethnicity_codeSetName,VARCHAR,20,S,
18,Ethnicity_1,VARCHAR,1,S,
19,Ethnicity_2,VARCHAR,1,S,
20,Ethnicity_3,VARCHAR,1,S,
21,Ethnicity_4,VARCHAR,1,S,
22,Ethnicity_5,VARCHAR,1,S,
23,Smoking_Status,VARCHAR,20,S,
24,Gender_Code,VARCHAR,1,S,
25,Marital_Status_Code,VARCHAR,30,S,
26,Immigration_Status,VARCHAR,2,S,
27,Birth_Date,VARCHAR,10,S,
28,Last_Name,VARCHAR,60,S,
29,Middle_Name,VARCHAR,25,S,
30,First_Name,VARCHAR,35,S,
31,AddressTypeCode_Name,VARCHAR,30,S,
32,AddressTypeCode_Entry,VARCHAR,2,S,
33,Postal_Address,VARCHAR,55,S,
34,State_Code,VARCHAR,2,S,
35,Zip_Code,VARCHAR,6,S,
36,ZipExtension_Code,VARCHAR,4,S,
37,City_Name,VARCHAR,30,S,
38,County_Code,VARCHAR,30,S,
39,Phone_Area_Code,VARCHAR,3,S,
40,Phone_Number,VARCHAR,7,S,
41,emailAddress,VARCHAR,256,S,
42,Correspondence_Address,VARCHAR,55,S,
43,State_Code_correspondence,VARCHAR,2,S,
44,Zip_Code_correspondence,VARCHAR,15,S,
45,City_Name_correspondence,VARCHAR,30,S,
46,County_Code_correspondance,VARCHAR,3,S,
47,Receipt_Date,VARCHAR,10,S,
48,Identification_Number,VARCHAR,80,S,
49,BenefitPlan_Hcc_Id_EDI_Group Number_1,VARCHAR,50,S,
50,BenefitPlan_Hcc_Id_EDI_Class of Contract code_1,VARCHAR,50,S,
51,BenefitPlan_Hcc_Id_EDI_Client_Reporting Category_1,VARCHAR,50,S,
52,BenefitPlan_Hcc_Id_EDI_MutuallyDefined_1,VARCHAR,50,S,
53,BenefitPlan_startDate_1,VARCHAR,10,S,
54,BenefitPlan_endDate_1,VARCHAR,10,S,
55,Effectuation_Date_1,VARCHAR,10,S,
56,HealthCoverageMaintenanceCode_1,VARCHAR,3,S,
57,InsuranceLineCode_1,VARCHAR,3,S,
58,BenefitPlan_Hcc_Id_EDI_Group Number_2,VARCHAR,50,S,
59,BenefitPlan_Hcc_Id_EDI_Class of Contract code_2,VARCHAR,50,S,
60,BenefitPlan_Hcc_Id_EDI_Client_ReportingCategory_2,VARCHAR,50,S,
61,BenefitPlan_Hcc_Id_EDI_MutuallyDefined_2,VARCHAR,50,S,
62,BenefitPlan_startDate_2,VARCHAR,10,S,
63,BenefitPlan_endDate_2,VARCHAR,10,S,
64,Effectuation_Date_2,VARCHAR,10,S,
65,HealthCoverageMaintenanceCode_2,VARCHAR,3,S,
66,InsuranceLineCode_2,VARCHAR,3,S,
67,BenefitPlan_Hcc_Id_EDI_Group Number_3,VARCHAR,50,S,
68,BenefitPlan_Hcc_Id_EDI_Class of Contract code_3,VARCHAR,50,S,
69,BenefitPlan_Hcc_Id_EDI_Client_ReportingCategory_3,VARCHAR,50,S,
70,BenefitPlan_Hcc_Id_EDI_MutuallyDefined_3,VARCHAR,50,S,
71,BenefitPlan_startDate_3,VARCHAR,10,S,
72,BenefitPlan_endDate_3,VARCHAR,10,S,
73,Effectuation_Date_3,VARCHAR,10,S,
74,HealthCoverageMaintenanceCode_3,VARCHAR,3,S,
75,InsuranceLineCode_3,VARCHAR,3,S,
76,BenefitPlan_Hcc_Id_EDI_Group Number_4,VARCHAR,50,S,
77,BenefitPlan_Hcc_Id_EDI_Class of Contract code_4,VARCHAR,50,S,
78,BenefitPlan_Hcc_Id_EDI_Client_ReportingCategory_4,VARCHAR,50,S,
79,BenefitPlan_Hcc_Id_EDI_MutuallyDefined_4,VARCHAR,50,S,
80,BenefitPlan_startDate_4,VARCHAR,10,S,
81,BenefitPlan_endDate_4,VARCHAR,10,S,
82,Effectuation_Date_4,VARCHAR,10,S,
83,HealthCoverageMaintenanceCode_4,VARCHAR,3,S,
84,InsuranceLineCode_4,VARCHAR,3,S,
85,BenefitPlan_Hcc_Id_EDI_Group Number_5,VARCHAR,50,S,
86,BenefitPlan_Hcc_Id_EDI_Class of Contract code_5,VARCHAR,50,S,
87,BenefitPlan_Hcc_Id_EDI_Client_ReportingCategory_5,VARCHAR,50,S,
88,BenefitPlan_Hcc_Id_EDI_MutuallyDefined_5,VARCHAR,50,S,
89,BenefitPlan_startDate_5,VARCHAR,10,S,
90,BenefitPlan_endDate_5,VARCHAR,10,S,
91,Effectuation_Date_5,VARCHAR,10,S,
92,HealthCoverageMaintenanceCode_5,VARCHAR,3,S,
93,InsuranceLineCode_5,VARCHAR,3,S,
94,BenefitPlan_Hcc_Id_EDI_Group Number_6,VARCHAR,50,S,
95,BenefitPlan_Hcc_Id_EDI_Class of Contract code_6,VARCHAR,50,S,
96,BenefitPlan_Hcc_Id_EDI_Client_ReportingCategory_6,VARCHAR,50,S,
97,BenefitPlan_Hcc_Id_EDI_MutuallyDefined_6,VARCHAR,50,S,
98,BenefitPlan_startDate_6,VARCHAR,10,S,
99,BenefitPlan_endDate_6,VARCHAR,10,S,
100,Effectuation_Date_6,VARCHAR,10,S,
101,HealthCoverageMaintenanceCode_6,VARCHAR,3,S,
102,InsuranceLineCode_6,VARCHAR,3,S,
103,BenefitPlan_Hcc_Id_EDI_Group Number_7,VARCHAR,50,S,
104,BenefitPlan_Hcc_Id_EDI_Class of Contract code_7,VARCHAR,50,S,
105,BenefitPlan_Hcc_Id_EDI_Client_ReportingCategory_7,VARCHAR,50,S,
106,BenefitPlan_Hcc_Id_EDI_MutuallyDefined_7,VARCHAR,50,S,
107,BenefitPlan_startDate_7,VARCHAR,10,S,
108,BenefitPlan_endDate_7,VARCHAR,10,S,
109,Effectuation_Date_7,VARCHAR,10,S,
110,HealthCoverageMaintenanceCode_7,VARCHAR,3,S,
111,InsuranceLineCode_7,VARCHAR,3,S,
112,BenefitPlan_Hcc_Id_EDI_Group Number_8,VARCHAR,50,S,
113,BenefitPlan_Hcc_Id_EDI_Class of Contract code_8,VARCHAR,50,S,
114,BenefitPlan_Hcc_Id_EDI_Client_ReportingCategory_8,VARCHAR,50,S,
115,BenefitPlan_Hcc_Id_EDI_MutuallyDefined_8,VARCHAR,50,S,
116,BenefitPlan_startDate_8,VARCHAR,10,S,
117,BenefitPlan_endDate_8,VARCHAR,10,S,
118,Effectuation_Date_8,VARCHAR,10,S,
119,HealthCoverageMaintenanceCode_8,VARCHAR,3,S,
120,InsuranceLineCode_8,VARCHAR,3,S,
121,COB_PolicyId_1,VARCHAR,50,S,
122,COB_otherInsuranceCompanyName_1,VARCHAR,60,S,
123,COB_groupNumber_1,VARCHAR,50,S,
124,COB_startDate_1,VARCHAR,10,S,
125,COB_endDate_1,VARCHAR,10,S,
126,COB_responsibilitySequenceCode_1,VARCHAR,15,S,
127,COB_PolicyId_2,VARCHAR,50,S,
128,COB_otherInsuranceCompanyName_2,VARCHAR,60,S,
129,COB_groupNumber_2,VARCHAR,50,S,
130,COB_startDate_2,VARCHAR,10,S,
131,COB_endDate_2,VARCHAR,10,S,
132,COB_responsibilitySequenceCode_2,VARCHAR,15,S,
133,COB_PolicyId_3,VARCHAR,50,S,
134,COB_otherInsuranceCompanyName_3,VARCHAR,60,S,
135,COB_groupNumber_3,VARCHAR,50,S,
136,COB_startDate_3,VARCHAR,10,S,
137,COB_endDate_3,VARCHAR,10,S,
138,COB_responsibilitySequenceCode_3,VARCHAR,15,S,
139,COB_PolicyId_4,VARCHAR,50,S,
140,COB_otherInsuranceCompanyName_4,VARCHAR,60,S,
141,COB_groupNumber_4,VARCHAR,50,S,
142,COB_startDate_4,VARCHAR,10,S,
143,COB_endDate_4,VARCHAR,10,S,
144,COB_responsibilitySequenceCode_4,VARCHAR,15,S,
145,COB_PolicyId_5,VARCHAR,50,S,
146,COB_otherInsuranceCompanyName_5,VARCHAR,60,S,
147,COB_groupNumber_5,VARCHAR,50,S,
148,COB_startDate_5,VARCHAR,10,S,
149,COB_endDate_5,VARCHAR,10,S,
150,COB_responsibilitySequenceCode_5,VARCHAR,15,S,
151,PCP_RoleType,VARCHAR,10,S,
152,PCP_hccIdentificationNumber,VARCHAR,80,S,
153,PCP_Change_Effectivedate,VARCHAR,10,S,
154,Language_codeEntry_1,VARCHAR,10,S,
155,Language_shortName_1,VARCHAR,30,S,
156,Language_codeSetName_1,VARCHAR,30,S,
157,Primary_Language_1,VARCHAR,1,S,
158,Native_Language_1,VARCHAR,1,S,
159,Language_codeEntry_2,VARCHAR,10,S,
160,Language_shortName_2,VARCHAR,30,S,
161,Language_codeSetName_2,VARCHAR,30,S,
162,Primary_Language_2,VARCHAR,1,S,
163,Native_Language_2,VARCHAR,1,S,
164,Language_codeEntry_3,VARCHAR,10,S,
165,Language_shortName_3,VARCHAR,30,S,
166,Language_codeSetName_3,VARCHAR,30,S,
167,Primary_Language_3,VARCHAR,1,S,
168,Native_Language_3,VARCHAR,1,S,
169,AsOfDate,VARCHAR,10,S,Populate only for Subscriber
170,Subscriber_count,VARCHAR,15,S,Populate only for Subscriber
171,Policy_number,VARCHAR,50,S,
172,Case_Number,VARCHAR,50,S,
173,Client_Number,VARCHAR,50,S,
174,Client_Reporting_Category,VARCHAR,50,S,
175,Cross_Reference_Number,VARCHAR,50,S,
176,Mutually_Defined_Identifier,VARCHAR,50,S,
177,Reporting_Category_Name_1,VARCHAR,60,S,
178,Reporting_Category_Identification_1,VARCHAR,50,S,
179,Reporting_Category_Date_1,VARCHAR,35,S,
180,Reporting_Category_Name_2,VARCHAR,60,S,
181,Reporting_Category_Identification_2,VARCHAR,50,S,
182,Reporting_Category_Date_2,VARCHAR,35,S,
183,Reporting_Category_Name_3,VARCHAR,60,S,
184,Reporting_Category_Identification_3,VARCHAR,50,S,
185,Reporting_Category_Date_3,VARCHAR,35,S,
186,Reporting_Category_Name_4,VARCHAR,60,S,
187,Reporting_Category_Identification_4,VARCHAR,50,S,
188,Reporting_Category_Date_4,VARCHAR,35,S,
189,Reporting_Category_Name_5,VARCHAR,60,S,
190,Reporting_Category_Identification_5,VARCHAR,50,S,
191,Reporting_Category_Date_5,VARCHAR,35,S,
192,Reporting_Category_Name_6,VARCHAR,60,S,
193,Reporting_Category_Identification_6,VARCHAR,50,S,
194,Reporting_Category_Date_6,VARCHAR,35,S,
195,Reporting_Category_Name_7,VARCHAR,60,S,
196,Reporting_Category_Identification_7,VARCHAR,50,S,
197,Reporting_Category_Date_7,VARCHAR,35,S,
198,Reporting_Category_Name_8,VARCHAR,60,S,
199,Reporting_Category_Identification_8,VARCHAR,50,S,
200,Reporting_Category_Date_8,VARCHAR,35,S,
201,Reporting_Category_Name_9,VARCHAR,60,S,
202,Reporting_Category_Identification_9,VARCHAR,50,S,
203,Reporting_Category_Date_9,VARCHAR,35,S,
204,Reporting_Category_Name_10,VARCHAR,60,S,
205,Reporting_Category_Identification_10,VARCHAR,50,S,
206,Reporting_Category_Date_10,VARCHAR,35,S,
207,Subscriber_identification_number,VARCHAR,50,S,
```

## QA Automation/EdifecsProduct_MappingSpec_QA Automation_834_EDI_to_CSVConversion_V1.3.xlsx — Sample CSV Format

```csv
Subscriber_ID,EdiFilename,SenderId,ReceiverId,ActionCode,Maintenance_Type_Code,Maintenance_type_code_EDI,Maintenance_Override,MaintenanceReasonCode_Name,MaintenanceReasonCode_Entry,Member_MaintenanceReasonCode_Name,Member_MaintenanceReasonCode_Entry,Individual_Relationship_Code,Relationship_Name,BenefitStatusCode,MemberIsSubscriber,Ethnicity_codeSetName,Ethnicity_1,Ethnicity_2,Ethnicity_3,Ethnicity_4,Ethnicity_5,Smoking_Status,Gender_Code,Marital_Status_Code,Immigration_Status,Birth_Date,Last_Name,Middle_Name,First_Name,AddressTypeCode_Name,AddressTypeCode_Entry,Postal_Address,State_Code,Zip_Code,ZipExtension_Code,City_Name,County_Code,Phone_Area_Code,Phone_Number,emailAddress,Correspondence_Address,State_Code_correspondence,Zip_Code_correspondence,City_Name_correspondence,County_Code_correspondance,Receipt_Date,Identification_Number,BenefitPlan_Hcc_Id_EDI_Group_Number_1,BenefitPlan_Hcc_Id_EDI_Classof_Contractcode_1,BenefitPlan_Hcc_Id_EDI_Client_Reporting Category_1,BenefitPlan_Hcc_Id_EDI_MutuallyDefined_1,BenefitPlan_startDate_1,BenefitPlan_endDate_1,Effectuation_Date_1,HealthCoverageMaintenanceCode_1,InsuranceLineCode_1,BenefitPlan_Hcc_Id_EDI_Group_Number_2,BenefitPlan_Hcc_Id_EDI_Classof_Contractcode_2,BenefitPlan_Hcc_Id_EDI_Client_ReportingCategory_2,BenefitPlan_Hcc_Id_EDI_MutuallyDefined_2,BenefitPlan_startDate_2,BenefitPlan_endDate_2,Effectuation_Date_2,HealthCoverageMaintenanceCode_3,InsuranceLineCode_3,BenefitPlan_Hcc_Id_EDI_Group_Number_3,BenefitPlan_Hcc_Id_EDI_Classof_Contractcode_3,BenefitPlan_Hcc_Id_EDI_Client_ReportingCategory_3,BenefitPlan_Hcc_Id_EDI_MutuallyDefined_3,BenefitPlan_startDate_3,BenefitPlan_endDate_3,Effectuation_Date_3,HealthCoverageMaintenanceCode_3,InsuranceLineCode_3,BenefitPlan_Hcc_Id_EDI_Group_Number_4,BenefitPlan_Hcc_Id_EDI_Classof_Contractcode_4,BenefitPlan_Hcc_Id_EDI_Client_ReportingCategory_4,BenefitPlan_Hcc_Id_EDI_MutuallyDefined_4,BenefitPlan_startDate_4,BenefitPlan_endDate_4,Effectuation_Date_4,HealthCoverageMaintenanceCode_4,InsuranceLineCode_4,BenefitPlan_Hcc_Id_EDI_Group_Number_5,BenefitPlan_Hcc_Id_EDI_Classof_Contractcode_5,BenefitPlan_Hcc_Id_EDI_Client_ReportingCategory_5,BenefitPlan_Hcc_Id_EDI_MutuallyDefined_5,BenefitPlan_startDate_5,BenefitPlan_endDate_5,Effectuation_Date_5,HealthCoverageMaintenanceCode_5,InsuranceLineCode_5,BenefitPlan_Hcc_Id_EDI_Group_Number_6,BenefitPlan_Hcc_Id_EDI_Classof_Contractcode_6,BenefitPlan_Hcc_Id_EDI_Client_ReportingCategory_6,BenefitPlan_Hcc_Id_EDI_MutuallyDefined_6,BenefitPlan_startDate_6,BenefitPlan_endDate_6,Effectuation_Date_6,HealthCoverageMaintenanceCode_6,InsuranceLineCode_6,BenefitPlan_Hcc_Id_EDI_Group_Number_7,BenefitPlan_Hcc_Id_EDI_Classof_Contractcode_7,BenefitPlan_Hcc_Id_EDI_Client_ReportingCategory_7,BenefitPlan_Hcc_Id_EDI_MutuallyDefined_7,BenefitPlan_startDate_7,BenefitPlan_endDate_7,Effectuation_Date_7,HealthCoverageMaintenanceCode_7,InsuranceLineCode_7,BenefitPlan_Hcc_Id_EDI_Group_Number_8,BenefitPlan_Hcc_Id_EDI_Classof_Contractcode_8,BenefitPlan_Hcc_Id_EDI_Client_ReportingCategory_8,BenefitPlan_Hcc_Id_EDI_MutuallyDefined_8,BenefitPlan_startDate_8,BenefitPlan_endDate_8,HealthCoverageMaintenanceCode_8,InsuranceLineCode_8,COB_PolicyId_1,COB_otherInsuranceCompanyName_1,COB_groupNumber_1,COB_startDate_1,COB_endDate_1,COB_responsibilitySequenceCode_1,COB_PolicyId_2,COB_otherInsuranceCompanyName_2,COB_groupNumber_2,COB_startDate_2,COB_endDate_2,COB_responsibilitySequenceCode_2,COB_PolicyId_3,COB_otherInsuranceCompanyName_3,COB_groupNumber_3,COB_startDate_3,COB_endDate_3,COB_responsibilitySequenceCode_3,COB_PolicyId_4,COB_otherInsuranceCompanyName_4,COB_groupNumber_4,COB_startDate_4,COB_endDate_4,COB_responsibilitySequenceCode_4,COB_PolicyId_5,COB_otherInsuranceCompanyName_5,COB_groupNumber_5,COB_startDate_5,COB_endDate_5,COB_responsibilitySequenceCode_5,PCP_RoleType,PCP_hccIdentificationNumber,PCP_Change_Effectivedate,Language_codeEntry_1,Language_shortName_1,Language_codeSetName_1,Primary_Language_1,Native_Language_1,Language_codeEntry_2,Language_shortName_2,Language_codeSetName_2,Primary_Language_2,Native_Language_2,Language_codeEntry_3,Language_shortName_3,Language_codeSetName_3,Primary_Language_3,Native_Language_3,AsOfDate,Subscriber_count,Policy_number,Case_Number,Client_Number,Client_Reporting_Category,CrossReferenceNumber,Mutually_Defined_Identifier,Reporting_Category_Name_1,Reporting_Category_Identification_1,Reporting_Category_Date_1,Reporting_Category_Name_2,Reporting_Category_Identification_2,Reporting_Category_Date_2,Reporting_Category_Name_3,Reporting_Category_Identification_3,Reporting_Category_Date_3,Reporting_Category_Name_4,Reporting_Category_Identification_4,Reporting_Category_Date_4,Reporting_Category_Name_5,Reporting_Category_Identification_5,Reporting_Category_Date_5,Reporting_Category_Name_6,Reporting_Category_Identification_6,Reporting_Category_Date_6,Reporting_Category_Name_7,Reporting_Category_Identification_7,Reporting_Category_Date_7,Reporting_Category_Name_8,Reporting_Category_Identification_8,Reporting_Category_Date_8,Reporting_Category_Name_9,Reporting_Category_Identification_9,Reporting_Category_Date_9,Reporting_Category_Name_10,Reporting_Category_Identification_10,Reporting_Category_Date_10,Subscriber_identification_number
S1,6g814e4k9bk,QA559309,QA69983,2,CREATE,021,FALSE,SubscriptionCreateReason,28,SubscriptionCreateReason,28,18,Self,A,TRUE,RaceOrEthnicityCode,E,,,,,Non Smoker,M,Single,1,4/30/81,Griffin,,Chiquita,IndividualAddressType,2,50346 Samatha Forge,CO,80639,3456,Greeley,3,111,1122334,harry.styles@test.com,PO BOX 71,CO,80639,Greeley,35623,8/1/21,620-43-8892,3526277232,63312CO060005301,3526277232,3526277232,1/1/23,12/31/24,12/31/24,1,HMO,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,_1_4175_Morris Health Insurance,sudheesh company,A9856001,1/1/23,12/31/24,Primary,_1_4175_Hightech Insurance,ss company,D009897,8/1/21,1/1/00,Secondary,test,test,test,test,test,test,test,test,test,test,test,test,test,test,test,test,test,test,PCP,,1/1/23,EN,English,LanguageDomain,1,1,ES,Spanish,LanguageDomain,0,0,AZ,Azerbaijani,LanguageDomain,0,0,5/15/23,1,20000,30000,60000,284857326,50000,63312CO060005301,PRE AMT TOT,570.56,20230201,TOT RES AMT,570.56,20230201,,,,,,,,,,,,,,,,,,,,,,,,,592679749
S2,kikfdbf043d,QA418182,QA63776,2,CREATE,021,FALSE,SubscriptionCreateReason,28,SubscriptionCreateReason,28,18,Self,A,TRUE,RaceOrEthnicityCode,E,,,,,Non Smoker,M,Single,1,4/30/81,Scott,,Merrill,IndividualAddressType,2,0804 Keenan Isle,CO,80639,3456,Greeley,3,111,1122334,harry.styles@test.com,PO BOX 71,CO,80639,Greeley,35623,8/1/21,941-00-5934,3526277252,63312CO060005302,3526277252,3526277252,1/1/23,12/31/24,1/1/25,1,HMO,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,_1_4175_Morris Health Insurance,sudheesh company,A9856001,1/1/23,12/31/24,Primary,_1_4175_Hightech Insurance,ss company,D009897,8/1/21,1/1/00,Secondary,test,test,test,test,test,test,test,test,test,test,test,test,test,test,test,test,test,test,PCP,,1/1/23,EN,English,LanguageDomain,1,1,ES,Spanish,LanguageDomain,0,0,AZ,Azerbaijani,LanguageDomain,0,0,5/15/23,1,20001,30001,60001,241293899,50001,63312CO060005301,PRE AMT TOT,570.56,20230201,TOT RES AMT,570.56,20230201,,,,,,,,,,,,,,,,,,,,,,,,,573725803
S3,4485if68fhj,QA627512,QA84008,2,CREATE,021,FALSE,SubscriptionCreateReason,28,SubscriptionCreateReason,28,18,Self,A,TRUE,RaceOrEthnicityCode,E,,,,,Non Smoker,M,Single,1,4/30/81,Marsh,,Elvis,IndividualAddressType,2,2172 Wilkinson Mountain,CO,80639,3456,Greeley,3,111,1122334,harry.styles@test.com,PO BOX 71,CO,80639,Greeley,35623,8/1/21,542-04-1392,3526275232,63312CO060005303,3526275232,3526275232,1/1/23,12/31/24,1/2/25,1,HMO,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,_1_4175_Morris Health Insurance,sudheesh company,A9856001,1/1/23,12/31/24,Primary,_1_4175_Hightech Insurance,ss company,D009897,8/1/21,1/1/00,Secondary,test,test,test,test,test,test,test,test,test,test,test,test,test,test,test,test,test,test,PCP,,1/1/23,EN,English,LanguageDomain,1,1,ES,Spanish,LanguageDomain,0,0,AZ,Azerbaijani,LanguageDomain,0,0,5/15/23,1,20002,30002,60002,217027686,50002,63312CO060005301,PRE AMT TOT,570.56,20230201,TOT RES AMT,570.56,20230201,,,,,,,,,,,,,,,,,,,,,,,,,574347347
S3,,,,,CREATE,021,FALSE,,,SubscriptionCreateReason,28,18,Spouse,A,FALSE,RaceOrEthnicityCode,E,,,,,Non Smoker,M,Single,1,4/30/81,Haley,,Ashely,IndividualAddressType,2,4129 Kulas Cliffs,CO,80639,3456,Greeley,3,111,1122334,harry.styles@test.com,PO BOX 71,CO,80639,Greeley,35623,8/1/21,695-07-6783,3526275232,63312CO060005303,3526275232,3526275232,1/1/23,12/31/24,1/3/25,1,HMO,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,_1_4175_Morris Health Insurance,sudheesh company,A9856001,1/1/23,12/31/24,Primary,_1_4175_Hightech Insurance,ss company,D009897,8/1/21,1/1/00,Secondary,test,test,test,test,test,test,test,test,test,test,test,test,test,test,test,test,test,test,PCP,,1/1/23,EN,English,LanguageDomain,1,1,ES,Spanish,LanguageDomain,0,0,AZ,Azerbaijani,LanguageDomain,0,0,,,20002,30002,60002,217027686,50002,63312CO060005301,PRE AMT TOT,570.56,20230201,TOT RES AMT,570.56,20230201,,,,,,,,,,,,,,,,,,,,,,,,,574347347
```

## QA Automation/EdifecsProduct_MappingSpec_QA Automation_834_EDI_to_CSVConversion_V1.3.xlsx — EDI 834 Mapping

```csv
LoopID.Segment ID,EDI Element Name,Element Description,Enumeration Values,Field in CSV layout.,Mapping Logic
ISA,Interchange Control Header,,,,
ISA01,Authorization Information Qualifier,,00 : No Authorization Information Present,,
ISA02,Authorization Information,,Blank (10 spaces),,
ISA03,Security Information Qualifier,,00 : No Security Information Present,,
ISA04,Security Information,,Blank (10 spaces),,
ISA05,Interchange ID Qualifier,,ZZ : Mutually Defined,,
ISA06,Interchange Sender ID,Interchange Sender ID,,SenderId,Populate only for Subscriber record(INS01 =Y)
ISA07,Interchange ID Qualifier,,ZZ : Mutually Defined,,
ISA08,Interchange Receiver ID,The Trading Partner ID (TPID) assigned by the Client,,ReceiverId,Populate only for Subscriber record(INS01 =Y)
ISA09,Interchange Date,Date the Interchange is created,,,
ISA10,Interchange Time,Time the Interchange is created,,,
ISA11,Interchange Control Standards Identifier,Repetition Separator,^,,
ISA12,Interchange Control Version Number,Standards Approved by ACS X12 Review Board,,,
ISA13,Interchange Control Number,A control number assigned by the interchange sender,,,
ISA14,Acknowledgment Requested,Code indicating sender’s request for an interchange acknowledgment,"0 : No Interchange Acknowledgement Requested
1 : Interchange Acknowledgment Requested",,
ISA15,Usage Identifier,"Code indicating whether data enclosed by this interchange envelope is test,
production or information",P : Production Data T : Test,,
ISA16,Component Element Separator,The delimiter used to separate component data elements,": = Element separator
~ = Segment Terminator",,
GS,Functional Group Header,,,,
GS01,Functional Identifier Code,Benefit Enrollment And Maintenance (834),,,
GS02,Application Senders Code,Code identifying party sending transmission; codes agreed to by trading partners,,,
GS03,Application Receivers Code,"The Trading Partner ID (TPID)
assigned by the client",,,
GS04,Date,"Date the Group Header is created.
Enter current date in the CCYYMMDD format",,Receipt_Date,In the format of YYYY-MM-DD
GS05,Time,"Time the Group Header is created.
Enter current time in the HHMM format",,,
GS06,Group Control Number,"Unique Sequential Number Assigned by Internal Processes for each Group Header  by the sender.
Must be identical to the Interchange Trailer GE02 .
This is Submitter-specific.",,,
GS07,Responsible Agency Code,"Code identifying the issuer of the EDI standard being used.
Accredited Standards Committee X12",X : Accredited Standards Committee X12,,
GS08,Version/Release/Industry Identifier Code,"Standards Approved for
Publication by ASC X12
Procedures Review Board",005010X220: Standards Approved for Publication by ASC X12,,
ST,Transaction Set Header,,,,
ST01,Transaction Set Identifier Code,Code uniquely identifying a Transaction Set,834 Benefit Enrollment and Maintenance,,
ST02,Transaction Set Control Number,"Unique Sequential Number Assigned by Internal Processes for each Transaction Set
ST02 and SE02 must be identical",,,
ST03,Implementation Convention Reference,"Standards Approved by ACS X12 Review Board
ST03 and GS08 must be identical",,,
BGN,Beginning Segment,,,,
BGN01,Transaction Set Purpose Code,,"00 Original
15 Re-Submission
22 Information Copy",,
BGN02,Reference Identification,Transaction Set Reference Number,,,
BGN03,Date,Date the Transaction Set is created.,,,
BGN04,Time,Time the Transaction Set is created,,,
BGN05,Time Code,Time Zone Code,"Eastern Time, always sent",,
BGN06,Reference Identification,Original Transaction Set Reference Number,,,
BGN07,Transaction Type Code,,,,
BGN08,Action Code,,"2 = Change/Update
4 = Verify",ActionCode,Populate only for Subscriber record(INS01 =Y)
REF,Transaction Set Policy Number,,,,
REF01,Reference Identification Qualifier,,38 Master Policy Number,,
REF02,Reference Identification,Master Policy Number,,,
DTP,DTP - File Effective Date,,,,
DTP01,Date/Time Qualifier,Date Time Qualifier,"007 Effective
090 Report Start
091 Report End
303 Maintenance Effective
382 Enrollment
388 Payment Commencement",,
DTP02,Date Time Period Format Qualifier,,D8 Date Expressed in Format CCYYMMDD,,
DTP03,Date Time Period,,,AsOfDate,"Populate only for Subscriber record(INS01 =Y)

Format - YYYY-MM-DD.
When DTP01 = 007"
QTY,Transaction Set Control Totals,,,,
QTY01,Quantity Qualifier,,"DT Dependent Total
ET Employee Total
TO Total",,
QTY02,Quantity,Record Totals,,Subscriber_count,"when QTY01 = ET
Populate only for Subscriber record(INS01 =Y)"
1000A — SPONSOR NAME Loop Repeat: 1,,,,,
1000A.N1,Sponsor Name,,,,
1000A.N101,Entity Identifier Code,,P5 = Plan sponsor,,
1000A.N102,Plan Sponsor Name,Plan Sponsor Name,,,
1000A.N103,Identification Code Qualifier,,FI = Federal Tax ID Number,,
1000A.N104,Identification Code,Sponsor Identifier,,,
1000A.N2,Additional Name Information,,,,
1000A.N101,Name,,,,
1000A.N102,Name,,,,
1000A.N3,Party Location,,,,
1000A.N101,Address Information,,,,
1000A.N102,Address Information,,,,
1000A.N4,Geographic Location,,,,
1000A.N101,City Name,,,,
1000A.N102,State or Province Code,,,,
1000A.N103,Postal Code,,,,
1000A.N104,Country Code,,,,
1000A.N105,Location Qualifier,,,,
1000A.N106,Location Identifier,,,,
1000A.N107,Country Subdivision Code,,,,
1000A.PER,Administrative Communications Contact,,,,
1000A.PER01,Contact Function Code,,,,
1000A.PER02,Name,,,,
1000A.PER03,Communication Number Qualifier,,,,
1000A.PER04,Communication Number,,,,
1000A.PER05,Communication Number Qualifier,,,,
1000A.PER06,Communication Number,,,,
1000A.PER07,Communication Number Qualifier,,,,
1000A.PER08,Communication Number,,,,
1000A.PER09,Contact Inquiry Reference,,,,
1000B — PAYER Loop Repeat: 1,,,,,
1000B.N1,Payer,,,,
1000B.N101,Entity Identifier Code,,IN = Insurer,,
1000B.N102,Name,Insurer Name,,,
1000B.N103,Identification Code Qualifier,,FI = Federal Tax ID number,,
1000B.N104,Identification Code,Insurer Identification Code,,,
1000C — TPA/BROKER NAME Loop Repeat: 2,,,,,
1000C.N1,TPA/Broker Name,,,,
1000C.N101,Entity Identifier Code,,"BO : Broker or Sales Office
TV : Third Party Administrator (TPA)",,
1000C.N102,Name,TPA/Broker Name (free-form),,,
1000C.N103,Identification Code Qualifier,,FI = Federal Tax ID number,,
1000C.N104,Identification Code,TPA or Broker Identification Code,,,
1100C — TPA/BROKER ACCOUNT INFORMATION Loop Repeat: 1,,,,,
1100C.ACT,TPA/BROKER ACCOUNT INFORMATION,,,,
1100C.ACT1,"Account
Number",TPA or Broker Account Number,,,
1100C. ACT02,Name,,,,
1100C.ACT03,Identification Code Qualifier,,,,
1100C.ACT04,Identification Code,,,,
1100C.ACT05,Account Number Qualifier,,,,
1100C.ACT06,Account Number,,,,
1100C.ACT07,Description,,,,
1100C.ACT08,Payment Method Type Code,,,,
1100C.ACT09,Benefit Status Code,,,,
"2000 — MEMBER LEVEL DETAIL Loop Repeat: >1                            For a family(records with the same REF*0F), there should be  a member record for each INS. Refer Sample CSV Tab.",,,,,
2000.INS,Member Level Detail,,,,
2000.INS01,Subscriber Indicator,,"Y :Yes
N :No",MemberIsSubscriber,"TRUE if INS01 = Y
FALSE if INS01 = N"
2000.INS02,Individual Relationship Code,,"01 Spouse
03 Father or Mother
04 Grandfather or Grandmother
05 Grandson or Granddaughter
06 Uncle or Aunt
07 Nephew or Niece
08 Cousin
09 Adopted Child
10 Foster Child
11 Son-in-law or Daughter-in-law
12 Brother-in-law or Sister-in-law
13 Mother-in-law or Father-in-law
14 Brother or Sister
15 Ward
16 Stepparent
17 Stepson or Stepdaughter
18 Self
19 Child
23 Sponsored Dependent
24 Dependent of a Minor Dependent
25 Ex-spouse
26 Guardian
31 Court Appointed Guardian
38 Collateral Dependent
53 Life Partner
60 Annuitant
D2 Trustee
G8 Other Relationship
G9 Other Relative",Individual_Relationship_Code,
,,,,Relationship_Name,Refer Crosswalks Tab for the mapping logic
2000.INS03,Maintenance Type Code,,"001 = Change,
021 = Addition,
024 = Cancellation or Termination,
025 = Reinstatement/Benefit Plan change,
030 = Audit or Compare",Maintenance_type_code_EDI,
,,,,Maintenance_Type_Code,"CHANGE If INS03 = 001,
CREATE if INS03 =021,
TERMINATE if INS03 =024,
REINSTATE if INS03 =025,
AUDIT if INS03 =030."
,,,,Member_MaintenanceReasonCode_Name,"Member_MaintenanceReasonCode_Name will be  SubscriptionCreateReason if INS03=021,
SubscriptionAmendReason if INS03=01,
SubscriptionTeminateReason if INS03=024,
SubscriptionReinstateReason If INS03=025."
,,,,MaintenanceReasonCode_Name,"Populate for Subscriber record(.i.e INS01 = Y). MaintenanceReasonCode_Name will be  SubscriptionCreateReason if INS03=021,
SubscriptionAmendReason if INS03=01,
SubscriptionTeminateReason if INS03=024,
SubscriptionReinstateReason If INS03=025."
2000.INS04,Maintenance Reason Code,,"03=death
07=Termination of Benefits
15=Primary Care Provider Change
22=Plan Change
25=Change in Identifying Data Elements
28=Initial Enrollment
41=Re-enrollment
43=Change of Location
AI=Effective Date Change
XN=Notification Only (Audit)",MaintenanceReasonCode_Entry,Populate only for Subscriber record(.i.e INS01 = Y)..
,,,,Member_MaintenanceReasonCode_Entry,
2000.INS05,Benefit Status Code,,"A: Active
C: Consolidated Omnibus Budget Reconciliation Act
(COBRA)
S: Surviving Insured
T: Tax Equity and Fiscal Responsibility Act (TEFRA)",BenefitStatusCode,
2000.INS06,MEDICARE STATUS CODE,,,,
2000.INS06-1,Medicare Plan Code,,"A =  Medicare Part A
B =  Medicare Part B
C = Medicare Part A and B
D = Medicare
E  = No Medicare",,
2000.INS06-2,Eligibility Reason Code,,"0 Age
1 Disability
2 End Stage Renal Disease (ESRD)",,
2000.INS07,COBRA Qualifying Event,,"1 Termination of Employment
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
ZZ Mutually Defined",,
2000.INS08,Employment Status Code,,"Conversion Values:
AO - Active Military
AU - Active Military
RT - Retired
L1 - Leave of Absence
FT - Full-Time
PT - Part-Time
AC - Active for enrolled Members
TE - Terminate",,
2000.INS09,Student Status Code,,"F - Full-Time
N - Not a Student
P - Part-Time",,
2000.INS10,Handicap Indicator,,"Y = Yes
N= No",,
2000.INS11,DTP Format Qualifier,,D8 Date Expressed in Format CCYYMMDD,,
2000.INS12,Insured Individual Death Date,Date of Death,,,
2000.INS13,Confidentiality Code,,"R Restricted Access
U Unrestricted Acces",,
2000.INS17,Birth Sequence Number,,,,
2000.REF,Subscriber Identifier,,,,
2000.REF01,Reference Identification Qualifier,,0F Subscriber Number,,
2000.REF02,Reference Identification,Subscriber Identifier,,Subscriber_identification_number,
2000.REF,Member Policy Number,,,,
2000.REF01,Reference Identification Qualifier,,1L Group or Policy Number,,
2000.REF02,Reference Identification,Member Group or Policy Number,,Policy_number,
2000.REF,Member Supplemental Identifier Segment repeat = 13,,,,
2000.REF01,Reference Identification Qualifier,,"17 Client Reporting Category
23 Client Number
3H Case Number
6O Cross Reference Number
Q4 Prior Identifier Number
ZZ Mutually Defined",,
2000.REF02,Reference Identification,Member Supplemental Identifier,,Cross_Reference_Number,If 2000.REF01 = 6O
,,,,Client_Number,If 2000.REF01 = 23
,,,,Client_Reporting_Category,If 2000.REF01 = 17
,,,,Mutually_Defined_Identifier,If 2000.REF01 = ZZ
,,,,Case_Number,If 2000.REF01 = 3H
2000.DTP,Member Level Dates,,,,
2000.DTP01,Date Time Qualifier,,"050 Received
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
474 Medicaid End",,
2000.DTP02,Date Time Period Format Qualifier,D8 Date Expressed in Format CCYYMMDD,D8 Date Expressed in Format CCYYMMDD,,
2000.DTP03,Date Time Period,Status Information Effective Date,,,
2100A — MEMBER NAME Loop Repeat: 1,,,,,
2100A.NM1,Member Name,,,,
2100A.NM101,Entity Identifier Code,,"IL = Insured or Subscriber
74 : Corrected Insured",,
2100A.NM102,Entity Type Qualifier,,1 = Person,,
2100A.NM103,Subscriber Last Name,Members last name,,Last_Name,
2100A.NM104,Subscriber First Name,Members first name,,First_Name,
2100A.NM105,Subscriber Middle Name,Members middle initial,,Middle_Name,
2100A.NM106,Subscriber Name Prefix,Member Name Prefix,,,
2100A.NM107,Subscriber Name Suffix,Member Name Suffix,,,
2100A.NM108,Identification Code Qualifier,,"34 Social Security Number
ZZ Mutually Defined",,
2100A.NM109,Member Identifier,,,Identification_Number,
2100A.PER,Members Communications Numbers,,,Populate only the first instance of phone number and email address.,
2100A.PER01,Contact Function Code,,IP : Insured Party,,
2100A.PER03,Communication Number Qualifier,,"AP Alternate Telephone
BN Beeper Number
CP Cellular Phone
EM Electronic Mail
EX Telephone Extension
FX Facsimile
HP Home Phone Number
TE Telephone
WP Work Phone Number",,
2100A.PER04,Communication Number,,,"Phone_Area_Code
Phone_Number","If 2100A.PER03 is HP/WP/TE/CP (Populate any of the one in this order of preference)
First 3 digit will be Phone_Area_Code,
 Rest 7 Digit wil be Phone_Numer"
.,,,,emailAddress,If 2100A.PER03 is EM
2100A.PER05,Communication Number Qualifier,,"AP Alternate Telephone
BN Beeper Number
CP Cellular Phone
EM Electronic Mail
EX Telephone Extension
FX Facsimile
HP Home Phone Number
TE Telephone
WP Work Phone Number",,
2100A.PER06,Communication Number,,,"Phone_Area_Code
Phone_Number","If 2100A.PER05 is HP/WP/TE/CP (Populate any of the one in this order of preference)
First 3 digit will be Phone_Area_Code,
 Rest 7 Digit wil be Phone_Numer"
.,,,,emailAddress,If 2100A.PER05 is EM
2100A.PER07,Communication Number Qualifier,,"AP Alternate Telephone
BN Beeper Number
CP Cellular Phone
EM Electronic Mail
EX Telephone Extension
FX Facsimile
HP Home Phone Number
TE Telephone
WP Work Phone Number",,
2100A.PER08,Communication Number,,,"Phone_Area_Code
Phone_Number","If 2100A.PER07 is HP/WP/TE/CP (Populate any of the one in this order of preference)
First 3 digit will be Phone_Area_Code,
 Rest 7 Digit wil be Phone_Numer"
.,,,,emailAddress,If 2100A.PER07 is EM
2100A.N3,Members Residence street Address,,,,
2100A.N301,Members Address Line 1,,,Postal_Address,
,,,,"AddressTypeCode_Name
AddressTypeCode_Entry","Hardcode
AddressTypeCode_Name  = IndividualAddressType
AddressTypeCode_Entry = 2"
2100A.N302,Members Address Line 2,,,,
2100A.N4,"Members City, State, and Zip Code",,,,
2100A.N401,City Name,,,City_Name,
2100A.N402,State or Province Code,,,State_Code,
2100A.N403,Postal Code,,,"Zip_Code
ZipExtension_Code","1-5 Digits will be Zip_Code
6-9 digit will be ZipExtension_Code"
2100A.N404,Country Code,,,,
2100A.N405,Location Qualifier,,"60 Area
CY County/Parish",,
2100A.N406,Location Identifier,,,County_Code,
2100A.N407,Country Subdivision Code,,,,
2100A.DMG,Member Demographics,,,,
2100A.DMG01,Date Time Period Format Qualifier,,D8 :Date Expressed in Format CCYYMMDD,,
2100A.DMG02,Member Birth Date,Member Birth Date,,Birth_Date,In the format of YYYY-MM-DD
2100A.DMG03,Gender Code,,"F : Female
M :Male
U :Unknown",Gender_Code,
2100A.DMG04,Marital Status Code,,"B :Registered Domestic Partner
D :Divorced
I :Single
M : Married
R :Unreported
S :Separated",Marital_Status_Code,"If DMG04 is
D populate as Divorced,
X populate as  Legally Separated,
M populate as  Married,
B populate as Registered Domestic Partner,
S populate as Separated,
I populate as Single,
W populate as Widowed,
U populate as Unmarried,
R populate as Unreported"
2100A.DMG05,"COMPOSITE RACE OR ETHNICITY
INFORMATION",To send general and detailed information on race or ethnicity,,Ethnicity_codeSetName,Hardcode as RaceOrEthnicityCode
2100A.DMG05-1,Race or Ethnicity Code,,,Ethnicity_1,Populate the first 5 occurences of Race or Ethnicity Code
,,,,Ethnicity_2,
,,,,Ethnicity_3,
,,,,Ethnicity_4,
,,,,Ethnicity_5,
2100A.DMG05-2,Race or Ethnicity Code,,RET : Classification of Race or Ethnicity,,
2100A.DMG05-3,Industry Code,Classification of Race or Ethnicity,,,
2100A.DMG06,Citizenship Status Code,,"1 U.S. Citizen
2 Non-Resident Alien
3 Resident Alien
4 Illegal Alien
5 Alien
6 U.S. Citizen - Non-Resident
7 U.S. Citizen - Resident",Immigration_Status,
2100A.AMT,Member Policy Amounts,,,,
2100A.AMT01,Amount Qualifier Code,,,,
2100A.AMT02,Monetary Amount,,,,
2100A.HLH,Member Health Information,,,,
2100A.HLH01,Health Related Code,Code indicating a specific health situation,"U 	Unknown
N 	None
S 	Substance Abuse
T 	Tobacco Use
X 	Tobacco and Substance Abuse",Smoking_Status,"N=Non Smoker ,
U=Unknown ,
T/X=Smoker"
2100A.HLH02,Height,Member Height,,,
2100A.HLH03,Weight,Member Weight,,,
2100A.LUI,Member Language   Segment Repeat  > 1,A record is inserted into Enr_Member_Language table for each repetition of Member Language segment   (2100A.LUI),Map only the first three occurrence of 2100A.LUI segment.,,
2100A.LUI01,Identification Code Qualifier,,,Language_codeSetName_1,"For the first occurrence of LUI
Hardcode Language_codeSetName_1 = LanguageDomain"
,,,,Language_codeSetName_2,"For the second occurrence of LUI
Hardcode Language_codeSetName_2 = LanguageDomain"
,,,,Language_codeSetName_3,"For the third occurrence of LUI
Hardcode Language_codeSetName_3 = LanguageDomain"
2100A.LUI02,Identification Code,Language Code,,"Language_codeEntry_1
Language_shortName_1","For the first occurrence of LUI
Language_shortName_1  - Refer Crosswalks tab"
,,,,"Language_codeEntry_2
Language_shortName_2","For the second occurrence of LUI
Language_shortName_2  - Refer Crosswalks tab"
,,,,"Language_codeEntry_3
Language_shortName_3","For the third occurrence of LUI
Language_shortName_3  - ReferCrosswalks tab"
2100A.LUI03,Description,Language Description,,,
2100A.LUI04,Language Indicator,Language Use Indicator,"5 = Language Reading
6 = Language Writing
7 = Language Speaking
8 = Native Language","Primary_Language_1
Native_Language_1","For the first occurrence of LUI
If LUI04 = 7, Set  Primary Language_1 as 1.
If LUI04 = 6, Set Native_Language_1 as 1."
,,,,"Primary_Language_2
Native_Language_2","For the second occurrence of LUI
If LUI04 = 7, Set  Primary Language_2 as 1.
If LUI04 = 6, Set Native_Language_2 as 1."
,,,,"Primary_Language_3
Native_Language_3","For the third occurrence of LUI
If LUI04 = 7, Set  Primary Language_3 as 1.
If LUI04 = 6, Set Native_Language_3 as 1."
2100A.LUI05,Language Proficiency Indicator,,,,
2100B — INCORRECT MEMBER NAME Loop Repeat: 1,,,,,
2100B.NM1,Incorrect Member Name,,,,
2100B.NM101,Entity Identifier Code,,70 : Prior Incorrect Insured,,
2100B.NM102,Entity Type Qualifier,,1: Person,,
2100B.NM103,Member Last Name,Prior Incorrect Member Last Name,,,
2100B.NM104,Member First Name,Prior Incorrect Member First Name,,,
2100B.NM105,Member Middle Name,Prior Incorrect Member Middle Name,,,
2100B.NM106,Member Name Prefix,Prior Incorrect Member Name Prefix,,,
2100B.NM107,Member Name Suffix,Prior Incorrect Member Name Suffix,,,
2100B.NM108,ID Code Qualifier,,"34: SSN
ZZ: Mutually Defined",,
2100B.NM109,ID Code,Prior Incorrect Insured Identifier,,,
2100B.DMG,Incorrect Member Demographics,,,,
2100B.DMG01,Date Time Period Format Qualifier,,D8 : Date Expressed in Format CCYYMMDD,,
2100B.DMG02,Member Birth Date,Prior Incorrect Insured Birth Date,,,
2100B.DMG03,Gender Code,Prior Incorrect Insured Gender Code,,,
2100B.DMG04,Marital Status,,,,
2100B.DMG05,Race or Ethnicity,,,,
2100B.DMG06,Citizenship Status Code,,,,
2100B.DMG10,Code List Qualifier Code,,,,
2100B.DMG11,Industry Code,,,,
2100C — MEMBER MAILING ADDRESS Loop Repeat: 1,,,,,
2100C.NM1,MEMBER MAILING ADDRESS,,,,
2100C.NM101,Entity Identifier Code,,31: Postal Mailing Address,,
2100C.NM102,Entity Type Qualifier,,1: Person,,
2100C.N3,MEMBER MAIL STREET ADDRESS,,,,
2100C.N301,Member Address Line,,,Correspondence_Address,
2100C.N302,Member Address Line 2,,,,
2100C.N4,"MEMBER MAIL CITY, STATE, ZIP CODE",,,,
2100C.N401,Member City Name,,,City_Name_correspondence,
2100C.N402,Member State Code,,,State_Code_correspondence,
2100C.N403,Member ZIP Code,,,Zip_Code_correspondence,First 5 digits
2100C.N404,Member Country Code,,,,
2100C.N407,Country Subdivision Code,,,,
2100F — CUSTODIAL PARENT Loop Repeat: 1,,,,,
2100F.NM1,Custodial Parent  Loop Repeat = 1,,,,
2100F.NM101,Entity Identifier Code,,S3 : Custodial Parent,,
2100F.NM102,Entity Type Qualifier,,1 = Person,,
2100F.NM103,Name Last or Organization Name,Custodial Parent Last Name,,,
2100F.NM104,Name First,Custodial Parent  First Name,,,
2100F.NM105,Name Middle,Custodial Parent Middle Name,,,
2100F.NM106,Name Prefix,,,,
2100F.NM107,Name Suffix,,,,
2100F.NM108,Identification Code Qualifier,,"34 = Social Security Number
ZZ Mutually Defined",,
2100F.NM109,Subscriber Identifier,Custodial Parent Identifier,,,
2100F.PER,Custodial Parent  Communications Numbers,A record is inserted into Enr_Communication_Numbers table for Custodial Parent Communications Numbers (2100F.PER),,,
2100F.PER01,Contact Function Code,,PQ : Parent or Guardian,,
2100F.PER02,Name,,,,
2100F.PER03,Communication Number Qualifier,,"AP Alternate Telephone
BN Beeper Number
CP Cellular Phone
EM Electronic Mail
EX Telephone Extension
FX Facsimile
HP Home Phone Number
TE Telephone
WP Work Phone Number",,
2100F.PER04,Communication Number,,,,
2100F.PER05,Communication Number Qualifier,,"AP Alternate Telephone
BN Beeper Number
CP Cellular Phone
EM Electronic Mail
EX Telephone Extension
FX Facsimile
HP Home Phone Number
TE Telephone
WP Work Phone Number",,
2100F.PER06,Communication Number,,,,
2100F.PER07,Communication Number Qualifier,,"AP Alternate Telephone
BN Beeper Number
CP Cellular Phone
EM Electronic Mail
EX Telephone Extension
FX Facsimile
HP Home Phone Number
TE Telephone
WP Work Phone Number",,
2100F.PER08,Communication Number,,,,
2100F.N3,Custodial Parent Street Address,,,,
2100F.N301,Address Information,,,,
2100F.N302,Address Information,,,,
2100F.N4,"Custodial Parent City, State, and Zip Code",,,,
2100F.N401,City Name,Member's City Name,,,
2100F.N402,State or Province Code,State,,,
2100F.N403,Postal Code,Postal Code,,,
2100F.N404,Country Code,"If Country Code Not Equal to USA, then populate element",,,
2100F.N407,Country Subdivision Code,,,,
2100G — RESPONSIBLE PERSON Loop Repeat: 13,,,,,
2100G.NM1,Responsible Person Segment repeat = 1,,,,
2100G.NM101,Entity Identifier Code,,"GD :guardian
QD :responsible party
6Y :Case Manager
9K :Key Person
E1 :Person or Other Entity Legally Responsible for a
Child
J6 :Power of Attorney
LR :Legal Representative

S1 :Parent
TZ :Significant Other
X4 :Spouse
EI :Executor of Estate
EXS : Ex-spouse",,
2100G.NM102,Entity Type Qualifier,,1 = Person,,
2100G.NM103,Name Last or Organization Name,Responsible Person Last Name,,,
2100G.NM104,Name First,Responsible Person  First Name,,,
2100G.NM105,Name Middle,Responsible Person Middle Name,,,
2100G.NM106,Name Prefix,,,,
2100G.NM107,Name Suffix,,,,
2100G.NM108,Identification Code Qualifier,,"34 : Social Security Number
ZZ Mutually Defined",,
2100G.NM109,Subscriber Identifier,Responsible Party Identifier,,,
2100G.PER,Responsible Person Communications Numbers,A record is inserted into Enr_Communication_Numbers table for Responsible person Communications Numbers (2100G.PER),,,
2100G.PER01,Contact Function Code,,RP : Responsible Person,,
2100G.PER03,Communication Number Qualifier,,"AP Alternate Telephone
BN Beeper Number
CP Cellular Phone
EM Electronic Mail
EX Telephone Extension
FX Facsimile
HP Home Phone Number
TE Telephone
WP Work Phone Number",,
2100G.PER04,Communication Number,,,,
2100G.PER05,Communication Number Qualifier,,"AP Alternate Telephone
BN Beeper Number
CP Cellular Phone
EM Electronic Mail
EX Telephone Extension
FX Facsimile
HP Home Phone Number
TE Telephone
WP Work Phone Number",,
2100G.PER06,Communication Number,,,,
2100G.PER07,Communication Number Qualifier,,"AP Alternate Telephone
BN Beeper Number
CP Cellular Phone
EM Electronic Mail
EX Telephone Extension
FX Facsimile
HP Home Phone Number
TE Telephone
WP Work Phone Number",,
2100G.PER08,Communication Number,,,,
2100G.N3,Responsible Person Street Address,,,,
2100G.N301,Address Information,,,,
2100G.N302,Address Information,,,,
2100G.N4,"Responsible Person City, State, and Zip Code",,,,
2100G.N401,City Name,City Name,,,
2100G.N402,State or Province Code,State,,,
2100G.N403,Postal Code,Postal Code,,,
2100G.N404,Country Code,"If Country Code Not Equal to USA, then populate element",,,
2100G.N407,Country Subdivision Code,,,,
2200 — DISABILITY INFORMATION Loop Repeat: >1,,,,,
2200.DSB,Disability,,,,
2200.DSB01,Disability Type Code,,"1 Short Term Disability
2 Long Term Disability
3 Permanent or Total Disability
4 No Disability",,
2200.DSB07,Product/Service ID Qualifier,,"DX: ICD9, ZZ: ICD10/Mutually Defined",,
2200.DSB08,Medical Code Value,,,,
2200.DTP,DISABILITY ELIGIBILITY DATES,,,,
2200.DTP01,Date/Time Qualifier,,"360 Initial Disability Period Start
361 Initial Disability Period End",,
2200.DTP02,Date Time Period Format Qualifier,,D8 Date Expressed in Format CCYYMMDD,,
2200.DTP03,Date Time Period,Disability Eligibility Date,,,
2300 — HEALTH COVERAGE Loop Repeat: 99                                                                 Map only First 8 Occurences of 2300 Loop.,,,,,
2300.HD,Health Coverage Loop Repeat: 99,,,,
2300.HD01,Maintenance Type Code,,"001 Change
002 Delete
021 Addition
024 Cancellation or Termination
025 Reinstatement
026 Correction
030 Audit or Compare
032 Employee Information Not Applicable",HealthCoverageMaintenanceCode_1,For the first occurrence of 2300 loop
,,,,HealthCoverageMaintenanceCode_2,For the 2nd  occurrence of 2300 loop
,,,,HealthCoverageMaintenanceCode_3,For the 3rd  occurrence of 2300 loop
,,,,HealthCoverageMaintenanceCode_4,For the 4th  occurrence of 2300 loop
,,,,HealthCoverageMaintenanceCode_5,For the 5th  occurrence of 2300 loop
,,,,HealthCoverageMaintenanceCode_6,For the 6th  occurrence of 2300 loop
,,,,HealthCoverageMaintenanceCode_7,For the 7th  occurrence of 2300 loop
,,,,HealthCoverageMaintenanceCode_8,For the 8th  occurrence of 2300 loop
2300.HD03,Insurance Line Code,,,InsuranceLineCode_1,For the first occurrence of 2300 loop
,Insurance Line Code,,,InsuranceLineCode_2,For the 2nd  occurrence of 2300 loop
,,,,InsuranceLineCode_3,For the 3rd  occurrence of 2300 loop
,,,,InsuranceLineCode_4,For the 4th  occurrence of 2300 loop
,,,,InsuranceLineCode_5,For the 5th  occurrence of 2300 loop
,,,,InsuranceLineCode_6,For the 6th  occurrence of 2300 loop
,,,,InsuranceLineCode_7,For the 7th  occurrence of 2300 loop
,,,,InsuranceLineCode_8,For the 8th  occurrence of 2300 loop
2300.HD04,Plan Coverage Description,,,,
2300.HD05,Coverage Level Code,,"CHD Children Only
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
TWO Two Party",,
2300.HD09,Yes/No Condition or Response Code,Late Enrollment Indicator,,,
2300.DTP,Health Coverage Dates  Segment repeat = 6,,,,
2300.DTP01,Date Time Qualifier,,"348 Benefit Begin
349 Benefit End
543 Last Premium Paid Date
303 Maintenance Effective
356 Eligibility Begin
357 Eligibility End
343 Premium Paid to Date End",,
2300.DTP02,Date Time Period Format Qualifier,,"D8 Date Expressed in Format CCYYMMDD
RD8 Range of Dates Expressed in Format CCYYMMDDCCYYMMDD",,
2300.DTP03,Coverage Period,,,BenefitPlan_startDate_1,"If 2300.DTP01 is 348, For the first occurrence of 2300 loop
In the format of YYYY-MM-DD"
,,,,BenefitPlan_endDate_1,"If 2300.DTP01 is 349, For the first occurrence of 2300 loop
In the format of YYYY-MM-DD"
,,,,Effectuation_Date_1,"If 2300.DTP01 is 343, For the first occurrence of 2300 loop
In the format of YYYY-MM-DD"
,,,,BenefitPlan_startDate_2,"If 2300.DTP01 is 348 ,For the second occurrence of 2300 loop
In the format of YYYY-MM-DD"
,,,,BenefitPlan_endDate_2,"If 2300.DTP01 is 349, For the second  occurrence of 2300 loop
In the format of YYYY-MM-DD"
,,,,Effectuation_Date_2,"If 2300.DTP01 is 343, For the second  occurrence of 2300 loop
In the format of YYYY-MM-DD"
,,,,BenefitPlan_startDate_3,"If 2300.DTP01 is 348, For the 3rd occurrence of 2300 loop
In the format of YYYY-MM-DD"
,,,,BenefitPlan_endDate_3,"If 2300.DTP01 is 349, For the 3rd occurrence of 2300 loop
In the format of YYYY-MM-DD"
,,,,Effectuation_Date_3,"If 2300.DTP01 is 343, For the 3rd  occurrence of 2300 loop
In the format of YYYY-MM-DD"
,,,,BenefitPlan_startDate_4,"If 2300.DTP01 is 348 ,For the 4th occurrence of 2300 loop
In the format of YYYY-MM-DD"
,,,,BenefitPlan_endDate_4,"If 2300.DTP01 is 349, For the 4th  occurrence of 2300 loop
In the format of YYYY-MM-DD"
,,,,Effectuation_Date_4,"If 2300.DTP01 is 343, For the 4th  occurrence of 2300 loop
In the format of YYYY-MM-DD"
,,,,BenefitPlan_startDate_5,"If 2300.DTP01 is 348, For the 5th occurrence of 2300 loop
In the format of YYYY-MM-DD"
,,,,BenefitPlan_endDate_5,"If 2300.DTP01 is 349, For the 5th occurrence of 2300 loop
In the format of YYYY-MM-DD"
,,,,Effectuation_Date_5,"If 2300.DTP01 is 343, For the 5th  occurrence of 2300 loop
In the format of YYYY-MM-DD"
,,,,BenefitPlan_startDate_6,"If 2300.DTP01 is 348, For the 6th occurrence of 2300 loop
In the format of YYYY-MM-DD"
,,,,BenefitPlan_endDate_6,"If 2300.DTP01 is 349, For the 6th occurrence of 2300 loop
In the format of YYYY-MM-DD"
,,,,Effectuation_Date_6,"If 2300.DTP01 is 343, For the 6th  occurrence of 2300 loop
In the format of YYYY-MM-DD"
,,,,BenefitPlan_startDate_7,"If 2300.DTP01 is 348, For the 7th occurrence of 2300 loop
In the format of YYYY-MM-DD"
,,,,BenefitPlan_endDate_7,"If 2300.DTP01 is 349, For the 7th occurrence of 2300 loop
In the format of YYYY-MM-DD"
,,,,Effectuation_Date_7,"If 2300.DTP01 is 343, For the 7th  occurrence of 2300 loop
In the format of YYYY-MM-DD"
,,,,BenefitPlan_startDate_8,"If 2300.DTP01 is 348, For the 8th occurrence of 2300 loop
In the format of YYYY-MM-DD"
,,,,BenefitPlan_endDate_8,"If 2300.DTP01 is 349, For the 8th occurrence of 2300 loop
In the format of YYYY-MM-DD"
,,,,Effectuation_Date_8,"If 2300.DTP01 is 343, For the 8th  occurrence of 2300 loop
In the format of YYYY-MM-DD"
2300.AMT,Health Coverage Policy,,,,
2300.AMT01,Amount Qualifier Code,,"B9 Co-insurance - Actual
1283 co-insurance selection amount.
contract.
C1 Co-Payment Amount
D2 Deductible Amount
EBA Expected Expenditure Amount
FK Other Unlisted Amount
P3 Premium Amount
R Spend Down",,
2300.AMT02,Monetary Amount,Contract Amount,,,
2300.REF,Health Coverage Policy Number,,,,
2300.REF01,Reference Identification Qualifier,,"17 Client Reporting Category
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
ZZ Mutually Defined",,
2300.REF02,Member Group or Policy Number,,,BenefitPlan_Hcc_Id_EDI_Group Number_1,"If 2300.REF01 = 1L,  For the first occurrence of 2300 loop"
,,,,BenefitPlan_Hcc_Id_EDI_Class of Contract code_1,"If 2300.REF01 = CE, For the first occurrence of 2300 loop"
,,,,BenefitPlan_Hcc_Id_EDI_Client_ReportingCategory_1,If 2300.REF01 = 17 For the first occurrence of 2300 loop
,,,,BenefitPlan_Hcc_Id_EDI_MutuallyDefined_1,"If 2300.REF01 = ZZ, For the first occurrence of 2300 loop"
,,,,BenefitPlan_Hcc_Id_EDI_Group Number_2,"If 2300.REF01 = 1L,  For the 2nd occurrence of 2300 loop"
,,,,BenefitPlan_Hcc_Id_EDI_Class of Contract code_2,"If 2300.REF01 = CE, For the 2nd occurrence of 2300 loop"
,,,,BenefitPlan_Hcc_Id_EDI_Client_ReportingCategory_2,If 2300.REF01 = 17 For the 2nd occurrence of 2300 loop
,,,,BenefitPlan_Hcc_Id_EDI_MutuallyDefined_2,"If 2300.REF01 = ZZ, For the 2nd occurrence of 2300 loop"
,Reference Identification,Member Group or Policy Number,,BenefitPlan_Hcc_Id_EDI_Group Number_3,"If 2300.REF01 = 1L,  For the 3rd occurrence of 2300 loop"
,,,,BenefitPlan_Hcc_Id_EDI_Class of Contract code_3,"If 2300.REF01 = CE, For the 3rd occurrence of 2300 loop"
,,,,BenefitPlan_Hcc_Id_EDI_Client_ReportingCategory_3,If 2300.REF01 = 17 For the 3rd occurrence of 2300 loop
,,,,BenefitPlan_Hcc_Id_EDI_MutuallyDefined_3,"If 2300.REF01 = ZZ, For the 3rd occurrence of 2300 loop"
,,,,BenefitPlan_Hcc_Id_EDI_Group Number_4,"If 2300.REF01 = 1L,  For the 4th occurrence of 2300 loop"
,,,,BenefitPlan_Hcc_Id_EDI_Class of Contract code_4,"If 2300.REF01 = CE,  For the 4th occurrence of 2300 loop"
,,,,BenefitPlan_Hcc_Id_EDI_Client_ReportingCategory_4,If 2300.REF01 = 17 For the 4th occurrence of 2300 loop
,,,,BenefitPlan_Hcc_Id_EDI_MutuallyDefined_4,"If 2300.REF01 = ZZ, For the 4th occurrence of 2300 loop"
,,,,BenefitPlan_Hcc_Id_EDI_Group Number_5,"If 2300.REF01 = 1L,For the 5th occurrence of 2300 loop"
,,,,BenefitPlan_Hcc_Id_EDI_Class of Contract code_5,"If 2300.REF01 = CE, For the 5th occurrence of 2300 loop"
,,,,BenefitPlan_Hcc_Id_EDI_Client_ReportingCategory_5,If 2300.REF01 = 17 For the 5th occurrence of 2300 loop
,,,,BenefitPlan_Hcc_Id_EDI_MutuallyDefined_5,"If 2300.REF01 = ZZ, For the 5th occurrence of 2300 loop"
,,,,BenefitPlan_Hcc_Id_EDI_Group Number_6,"If 2300.REF01 = 1L, For the 6th occurrence of 2300 loop"
,,,,BenefitPlan_Hcc_Id_EDI_Class of Contract code_6,"If 2300.REF01 = CE, For the 6th occurrence of 2300 loop"
,,,,BenefitPlan_Hcc_Id_EDI_Client_ReportingCategory_6,If 2300.REF01 = 17 For the 6th occurrence of 2300 loop
,,,,BenefitPlan_Hcc_Id_EDI_MutuallyDefined_6,"If 2300.REF01 = ZZ, For the 6th occurrence of 2300 loop"
,,,,BenefitPlan_Hcc_Id_EDI_Group Number_7,"If 2300.REF01 = 1L, For the 7th occurrence of 2300 loop"
,,,,BenefitPlan_Hcc_Id_EDI_Class of Contract code_7,"If 2300.REF01 = CE, For the 7th occurrence of 2300 loop"
,,,,BenefitPlan_Hcc_Id_EDI_Client_ReportingCategory_7,If 2300.REF01 = 17 For the 6th occurrence of 2300 loop
,,,,BenefitPlan_Hcc_Id_EDI_MutuallyDefined_7,"If 2300.REF01 = ZZ, For the 6th occurrence of 2300 loop"
,,,,BenefitPlan_Hcc_Id_EDI_Group Number_8,"If 2300.REF01 = 1L, For the 8th occurrence of 2300 loop"
,,,,BenefitPlan_Hcc_Id_EDI_Class of Contract code_8,"If 2300.REF01 = CE, For the 8th occurrence of 2300 loop"
,,,,BenefitPlan_Hcc_Id_EDI_Client_ReportingCategory_8,If 2300.REF01 = 17 For the 6th occurrence of 2300 loop
,,,,BenefitPlan_Hcc_Id_EDI_MutuallyDefined_8,"If 2300.REF01 = ZZ, For the 6th occurrence of 2300 loop"
2310 — PROVIDER INFORMATION Loop Repeat: 30,,,,,
2310.LX,PROVIDER INFORMATION,,,,
2310.LX01,Assigned Number,,,,
2310.NM1,PROVIDER NAME,,,,
2310.NM101,Entity Identifier Code,,"1X Laboratory
3D Obstetrics and Gynecology Facility
80 Hospital
FA Facility
OD Doctor of Optometry
P3 Primary Care Provider
QA Pharmacy
QN Dentist
Y2 Managed Care Organization",PCP_RoleType,"If 2310.NM101 = P3, Map as PCP."
2310.NM102,Entity Type Qualifier,,"1 = Person
2 = Non-Person entity",,
2310.NM103,Provider Last Name,,,,
2310.NM104,Provider First Name,,,,
2310.NM105,Provider Middle Name,,,,
2310.NM106,Provider Name Prefix,,,,
2310.NM107,Provider Name Suffix,,,,
2310.NM108,ID Code Qualifier,,"34: SSN
FI: Federal Tax ID
SV: Service Provider Number
 XX: NPI",,
2310.NM109,ID Code,,,PCP_hccIdentificationNumber,If 2310.NM101 = P3
2310.NM110,Entity Relationship Code,,"25: Established Patient
26: Not Established Patient
72: Unknown",,
2310.N3,PROVIDER ADDRESS,,,,
2310.N301,Provider Address Line,,,,
2310.N302,Provider Address Line,,,,
2310.N4,"PROVIDER CITY, STATE, ZIP CODE",,,,
2310.N401,Provider City Name,,,,
2310.N402,Provider State Code,,,,
2310.N403,Provider ZIP Code,,,,
2310.N404,Provider Country Code,,,,
2310.PER,PROVIDER COMMUNICATIONS NUMBERS,,,,
2310.PER01,Contact Function Code,,IC = Information Contact,,
2310.PER03,Communication Number Qualifier,,"AP Alternate Telephone
BN Beeper Number
CP Cellular Phone
EM Electronic Mail
EX Telephone Extension
FX Facsimile
HP Home Phone Number
TE Telephone
WP Work Phone Number",,
2310.PER04,Communication Number,,,,
2310.PER05,Communication Number Qualifier,,"AP Alternate Telephone
BN Beeper Number
CP Cellular Phone
EM Electronic Mail
EX Telephone Extension
FX Facsimile
HP Home Phone Number
TE Telephone
WP Work Phone Number",,
2310.PER06,Communication Number,,,,
2310.PER07,Communication Number Qualifier,,"AP Alternate Telephone
BN Beeper Number
CP Cellular Phone
EM Electronic Mail
EX Telephone Extension
FX Facsimile
HP Home Phone Number
TE Telephone
WP Work Phone Number",,
2310.PER08,Communication Number,,,,
2310.PLA,Provider Change Reason,,,,
2310.PLA01,Action Code,,2: Change (Update),,
2310.PLA02,Entity Identifier Code,,1P : Provider,,
2310.PLA03,Date,,Provider Effective Date,PCP_Change_Effectivedate,In the format of YYYY-MM-DD
2310.PLA05,Maintenance Reason Code,,"14 Voluntary Withdrawal
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
AJ Appointment Times not Met in a Timely Manner",,
2320 — COORDINATION OF BENEFITS Loop Repeat: 5,,,,,
2320.COB,COB-Coordination of Benefits,,,,
2320.COB01,Payer Responsibility Sequence Number Code,,"P Primary
S Secondary
T Tertiary
U Unknown",COB_responsibilitySequenceCode_1,"For the first occurrence of 2320 loop
P - Primary
S - Secondary
T - Tertiary
U - Unknown"
,,,,COB_responsibilitySequenceCode_2,"For the second occurrence of 2320 loop
P - Primary
S - Secondary
T - Tertiary
U - Unknown"
,,,,COB_responsibilitySequenceCode_3,"For the third occurrence of 2320 loop
P - Primary
S - Secondary
T - Tertiary
U - Unknown"
,,,,COB_responsibilitySequenceCode_4,"For the 4th occurrence of 2320 loop
P - Primary
S - Secondary
T - Tertiary
U - Unknown"
,,,,COB_responsibilitySequenceCode_5,"For the 5th occurrence of 2320 loop
P - Primary
S - Secondary
T - Tertiary
U - Unknown"
2320.COB02,Member Group or Policy Number,Member Group or Policy Number,,COB_PolicyId_1,For the first occurrence of 2320 loop
,,,,COB_PolicyId_2,For the second occurrence of 2320 loop
,,,,COB_PolicyId_3,For the third occurrence of 2320 loop
,,,,COB_PolicyId_4,For the 4th occurrence of 2320 loop
,,,,COB_PolicyId_5,For the 5th occurrence of 2320 loop
2320.COB03,Coordination of Benefits Code,,"1: Coordination of Benefits;
5 Unknown
6: No Coordination of Benefits",,
2320.COB04,Service Type Code,,"1 Medical Care
35 Dental Care
48 Hospital - Inpatient
50 Hospital - Outpatient
54 Long Term Care
89 Free Standing Prescription Drug
90 Mail Order Prescription Drug
A4 Psychiatric
AG Skilled Nursing Care
AL Vision (Optometry)
BB Partial Hospitalization (Psychiatric)",,
2320.REF,Additional Coordination of Benefits Identifiers,,,,
2320.REF01,Reference Identification Qualifier,,"60 Account Suffix Code
6P Group Number
SY Social Security Numberr
ZZ Mutually Defined",,
2320.REF02,Member Group or Policy Number,,,COB_groupNumber_1,"2320.REF01 = 6P,  For the first occurrence of 2320 loop"
,,,,COB_groupNumber_2,"2320.REF01 = 6P,  For the second occurrence of 2320 loop"
,,,,COB_groupNumber_3,"2320.REF01 = 6P, For the third occurrence of 2320 loop"
,,,,COB_groupNumber_4,"2320.REF01 = 6P,  For the 4th occurrence of 2320 loop"
,,Member Group or Policy Number,,COB_groupNumber_5,"2320.REF01 = 6P, For the 5th occurrence of 2320 loop"
2320.DTP,Coordination of Benefits Eligibility Dates,,,,
2320.DTP01,Date/Time Qualifier,,"344 :Coordination of Benefits Begin
345 :Coordination of Benefits End",,
2320.DTP02,Date Time Period Format Qualifier,,D8 : CCYYMMDD,,
2320.DTP03,Date Time Period,Coordination of Benefit Date,,"COB_startDate_1 when 2320.DTP01 = 344
COB_endDate_1 when 2320.DTP01 = 345","For the first occurrence of 2320 loop
In the format of YYYY-MM-DD"
,,,,"COB_startDate_2 when 2320.DTP01 = 344
COB_endDate_2 when 2320.DTP01 = 345","For the second occurrence of 2320 loop
In the format of YYYY-MM-DD"
,,,,"COB_startDate_3 when 2320.DTP01 = 344
COB_endDate_3 when 2320.DTP01 = 345","For the third occurrence of 2320 loop
In the format of YYYY-MM-DD"
,,,,"COB_startDate_4 when 2320.DTP01 = 344
COB_endDate_4 when 2320.DTP01 = 345","For the 4th occurrence of 2320 loop
In the format of YYYY-MM-DD"
,,,,"COB_startDate_5 when 2320.DTP01 = 344
COB_endDate_5 when 2320.DTP01 = 345","For the 5th occurrence of 2320 loop
In the format of YYYY-MM-DD"
"2330 — COORDINATION OF BENEFITS RELATED ENTITY Loop
Repeat: 3",,,,,
2330.NM1,COORDINATION OF BENEFITS RELATED ENTITY,,,,
2330.NM101,Entity Identifier Code,,"36: Employer
GW: Group
IN: Insurer",,
2330.NM102,Entity Type Qualifier,,2 : Non-Person Entity,,
2330.NM103,Coordination of Benefits Insurer Name,Coordination of Benefits Insurer Name,,COB_otherInsuranceCompanyName_1,"2330.NM101 = IN, For the first occurrence of 2320 loop"
,,,,COB_otherInsuranceCompanyName_2,"2330.NM101 = IN, For the second occurrence of 2320 loop"
,,,,COB_otherInsuranceCompanyName_3,"2330.NM101 = IN, For the third occurrence of 2320 loop"
,,,,COB_otherInsuranceCompanyName_4,2330.NM101 = IN For the 4th occurrence of 2320 loop
,,,,COB_otherInsuranceCompanyName_5,"2330.NM101  = IN, For the 5th occurrence of 2320 loop"
2330.NM108,ID Code Qualifier,,"FI: Federal Tax ID
NI: NAIC
XV: CMS Plan ID",,
2330.NM109,"Coordination of Benefits Insurer Identification
Code","Coordination of Benefits Insurer Identification
Code",,,
2330.N3,COORDINATION OF BENEFITS RELATED ENTITY ADDRESS,,,,
2330.N301,Member Address Line,,,,
2330.N302,Member Address Line,,,,
2330.N4,"COORDINATION OF BENEFITS RELATED ENTITY OTHER INSURANCE COMPANY CITY, STATE, ZIPCODE",,,,
2330.N401,Member City Name,,,,
2330.N402,Member State Code,,,,
2330.N403,Member ZIP Code,,,,
2330.N404,Member Country Code,,,,
2330.N407,Country Subdivision Code,,,,
2700 — ADDITIONAL REPORTING CATEGORIES LOOP,,,,,
2700.LS,ADDITIONAL REPORTING CATEGORIES LOOP,,,,
.LS01,Loop Identifier Code,,Use the value 2700.,,
2710 — MEMBER REPORTING CATEGORIES Loop Repeat: >1                              Map only the first 10 occurences of 2710 loop.,,,,,
2710.LX,MEMBER REPORTING CATEGORIES,,,,
2710.LX01,Assigned Number,,,,
2750 — REPORTING CATEGORY Loop Repeat: 1,,,,,
2750.N1,REPORTING CATEGORY,,,,
2750.N101,Entity Identifier Code,,75 : Participant,,
2750.N102,Member Reporting Category Name,Member Reporting Category Name,`,Reporting_Category_Name_1,For the 1st occurrence of 2710 loop
,,,,Reporting_Category_Name_2,For the 2nd occurrence of 2710 loop
,,,,Reporting_Category_Name_3,For the 3rd occurrence of 2710 loop
,,,,Reporting_Category_Name_4,For the 4th occurrence of 2710 loop
,,,,Reporting_Category_Name_5,For the 5th occurrence of 2710 loop
,,,,Reporting_Category_Name_6,For the 6th occurrence of 2710 loop
,,,,Reporting_Category_Name_7,For the 7th occurrence of 2710 loop
,,,,Reporting_Category_Name_8,For the 8th occurrence of 2710 loop
,,,,Reporting_Category_Name_9,For the 9th occurrence of 2710 loop
,,,,Reporting_Category_Name_10,For the 10th occurrence of 2710 loop
2750.REF,REPORTING CATEGORY REFERENCE  Segment repeat = 16,A record is inserted into  Member_Reporting_Category_Identifiers  table  for each 2750.REF,,,
2750.REF01,Reference Identification Qualifier,,"00 Contracting District Number
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
ZZ Mutually Defined",,
2750.REF02,Reference Identification,,,Reporting_Category_Identification_1,For the 1st occurrence of 2710 loop. Map only the first occurrence of 2750.REF.
,,,,Reporting_Category_Identification_2,For the 2nd occurrence of 2710 loop. Map only the first occurrence of 2750.REF.
,,,,Reporting_Category_Identification_3,For the 3rd occurrence of 2710 loop. Map only the first occurrence of 2750.REF.
,,,,Reporting_Category_Identification_4,For the 4th occurrence of 2710 loop. Map only the first occurrence of 2750.REF.
,,,,Reporting_Category_Identification_5,For the 5th occurrence of 2710 loop. Map only the first occurrence of 2750.REF.
,,,,Reporting_Category_Identification_6,For the 6th occurrence of 2710 loop. Map only the first occurrence of 2750.REF.
,,,,Reporting_Category_Identification_7,For the 7th occurrence of 2710 loop. Map only the first occurrence of 2750.REF.
,,,,Reporting_Category_Identification_8,For the 8th occurrence of 2710 loop. Map only the first occurrence of 2750.REF.
,,,,Reporting_Category_Identification_9,For the 9th occurrence of 2710 loop. Map only the first occurrence of 2750.REF.
,,,,Reporting_Category_Identification_10,For the 10th occurrence of 2710 loop. Map only the first occurrence of 2750.REF.
2750.DTP,REPORTING CATEGORY DATE,,,,
2750.DTP01,Date/Time Qualifier,,007 = Effective,,
,,,,,
2750.DTP02,Date Time Period Format Qualifier,,"D8 : Date Expressed in Format CCYYMMDD
RD8 : Range of Dates Expressed in Format CCYYMMDD-CCYYMMDD",,
2750.DTP03,,,,Reporting_Category_Date_1,For the 1st occurrence of 2710 loop
,,,,Reporting_Category_Date_2,For the 2nd occurrence of 2710 loop
,,,,Reporting_Category_Date_3,For the 3rd occurrence of 2710 loop
,,,,Reporting_Category_Date_4,For the 4th occurrence of 2710 loop
,,,,Reporting_Category_Date_5,For the 5th occurrence of 2710 loop
,Date time period,,,Reporting_Category_Date_6,For the 6th occurrence of 2710 loop
,,,,Reporting_Category_Date_7,For the 7th occurrence of 2710 loop
,,,,Reporting_Category_Date_8,For the 8th occurrence of 2710 loop
,,,,Reporting_Category_Date_9,For the 9th occurrence of 2710 loop
,,,,Reporting_Category_Date_10,For the 10th occurrence of 2710 loop
2700.LE,"ADDITIONAL REPORTING CATEGORIES
LOOP TERMINATION",,,,
2700.LE01,Loop Identifier Code,,Use the value 2700,,
SE,Transaction Set Trailer,,,,
SE01,Number of Included Segments,Total number of segments included in the transaction set including ST and SE segments,,,
SE02,Transaction Set Control Number,ST02 and SE02 must be identical,,,
GE,Function Group Trailer,,,,
GE01,Number of Transaction Sets Included,Total number of transactions set included in the group or interchange,,,
GE02,Group Control Number,GS06 and GE02 must be identical,,,
IEA,Interchange Control Trailer,,,,
IEA01,Number of Included Functional Groups,,,,
IEA02,Interchange Control Number,ISA12 and IEA02 must be identical,,,
```

## QA Automation/EdifecsProduct_MappingSpec_QA Automation_834_EDI_to_CSVConversion_V1.3.xlsx — Default Values

```csv
Field in CSV,Default value/Mapping logic
Subscriber_ID,Unique value for a family (records with the same REF*0F).
EdiFilename,Name of the Edi file
Maintenance_Override,TRUE
```

## QA Automation/EdifecsProduct_MappingSpec_QA Automation_834_EDI_to_CSVConversion_V1.3.xlsx — Crosswalks

```csv
2000.INS02,,,,2100A.LUI02,
HIPAA Relationship Codes,,,,Language codes,
Code,Populate as,,",",Lang Codes,Language Shortname
1,Spouse,,,amh,Amharic
3,Parent,,,ara,Arabic
4,Grandparent,,,BSI,Bassi
5,Grandchild,,,chi,Chinese
6,Uncle or Aunt,,,dan,Danish
7,Nephew or Niece,,,dut,Dutch
8,Cousin,,,eng,English
9,Adopted Child,,,Far,Farsi
10,Foster Child,,,fre,French
11,Son/Daughter-inlaw,,,ger,German
12,Brother/Sister-inlaw,,,gre,Greek
13,Mother/Fatherin-law,,,guj,Gujarati
14,Sibling,,,hat,Haitian Creole
15,Ward,,,heb,Hebrew
16,Stepparent,,,hin,Hindi
17,Stepchild,,,hun,Hungarian
18,Self,,,igb,Igbo
19,Child,,,IND,Indian
23,Sponsored Dependent,,,ira,Iranian
24,Dependent of a Minor Dependent,,,ita,Italian
25,Ex-spouse,,,jpn,Japanese
26,Guardian,,,kor,Korean
31,Court Appointed Guardian,,,cmn,Mandarin
38,Collateral Dependent,,,NU,Not Used
53,Life Partner,,,NU,Not Used
60,Annuitant,,,oth,Other
D2,Trustee,,,PAK,Pakistani
G8,Other Relationship,,,per,Persian
G9,Other Relative,,,PH,Philipina
,,,,pol,Polish
,,,,por,Portuguese
,,,,rom,Romanian
,,,,rus,Russian
,,,,spa,Spanish
,,,,swe,Swedish
,,,,tgl,Tagalog
,,,,tha,Thai
,,,,tur,Turkish
,,,,ukr,Ukrainian
,,,,urdu,Urdu
,,,,vie,Vietnamese
,,,,yor,Yoruba
,,,,yug,Yugoslavian
```

## QA Automation/EdifecsProduct_MappingSpec_QA Automation_837I_CSV_to_EDI_Conversion_V1.1.xlsx — Cover Page

```csv
Data Extraction for QA Automation- EDIFECS,,,,,,,,,
,,,,,,,,,
Business Area: CSV to EDI 837I conversion,,,,,,,,,
,,,,,,,,,
This document provides the Mapping Specification for converting CSV format  into EDI 837I Claims file as part of the data extraction for QA automation. Document is intended for EDIFECS Product Team,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,Version,,24.1.0.0,,,
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

## QA Automation/EdifecsProduct_MappingSpec_QA Automation_837I_CSV_to_EDI_Conversion_V1.1.xlsx — Version History

```csv
,Revision History,,,,
,,,,,
,,,,,
,,,,,
,,,,,
,V#,Date,Author,Reviewer(s)/ Contributor(s),Comments
,0.1,02/29/2024,Jishnu Kumar & Swedha Kumar,Sandhya Pullundassery,Initial Version
,1,02/29/2024,Jishnu Kumar & Swedha Kumar,Sandhya Pullundassery,Baselined
,1.1,08/26/2024,Ambily R,Sandhya Pullundassery,Changes for INTP-9858
```

## QA Automation/EdifecsProduct_MappingSpec_QA Automation_837I_CSV_to_EDI_Conversion_V1.1.xlsx — CSV Layout

```csv
Sr#,CSV Field,Claim Level/Line Level,Data Type,Length,Usage
1,Claimid,Claim Level/Line Level,VARCHAR,10,R
2,Scenarios,Claim Level,VARCHAR,100,S
3,EdiFilename,Claim Level,VARCHAR,100,S
4,totalClaimCount,Claim Level,VARCHAR,10,S
5,SenderId,Claim Level,VARCHAR,15,S
6,ReceiverId,Claim Level,VARCHAR,15,S
7,Receipt_Date,Claim Level,VARCHAR,10,S
8,Entry_Date,Claim Level,VARCHAR,10,S
9,Clean_Claim_Date,Claim Level,VARCHAR,10,S
10,Payee_Type_Field,Claim Level,VARCHAR,10,S
11,Frequency_Code,Claim Level,VARCHAR,1,S
12,Clearing_House_TraceNumber,Claim Level,VARCHAR,50,S
13,Benefit_Plan_Type,Claim Level,VARCHAR,1,S
14,TradingPartnerID,Claim Level,VARCHAR,15,S
15,Claim_Source,Claim Level,VARCHAR,15,S
16,Claim_Payor_Type,Claim Level,VARCHAR,1,S
17,Claim_Filing_Code,Claim Level,VARCHAR,2,S
18,Type_Of_Bill_Code,Claim Level,VARCHAR,2,S
19,Totals,Claim Level,VARCHAR,18,S
20,Supplier_Address,Claim Level,VARCHAR,110,S
21,Supplier_CityName,Claim Level,VARCHAR,30,S
22,Supplier_StateCode,Claim Level,VARCHAR,2,S
23,Supplier_ZipCode,Claim Level,VARCHAR,5,S
24,Supplier_ZipSuffixCode,Claim Level,VARCHAR,4,S
25,Statement_Start_Date,Claim Level,VARCHAR,10,S
26,Statement_End_Date,Claim Level,VARCHAR,10,S
27,BillingRecipient_Name,Claim Level,VARCHAR,60,S
28,BillingRecipient_Address,Claim Level,VARCHAR,110,S
29,BillingRecipient_CityName,Claim Level,VARCHAR,30,S
30,BillingRecipient_StateCode,Claim Level,VARCHAR,2,S
31,BillingRecipient_ZipCode,Claim Level,VARCHAR,5,S
32,BillingRecipient_ZipSuffixCode,Claim Level,VARCHAR,4,S
33,BillingRecipient_TelephoneNumber,Claim Level,VARCHAR,15,S
34,Claim_Delivery_Type,Claim Level,VARCHAR,1,S
35,Attachment_Set_ID,Claim Level,VARCHAR,80,S
36,Claim_Number,Claim Level,VARCHAR,50,S
37,Submitted_Subscriber_Id,Claim Level,VARCHAR,80,S
38,Subscriber_Identification_Number,Claim Level,VARCHAR,80,S
39,Subscriber_Name,Claim Level,VARCHAR,150,S
40,Subscriber_Last_Name,Claim Level,VARCHAR,60,S
41,Subscriber_First_Name,Claim Level,VARCHAR,35,S
42,Subscriber_Street_Address,Claim Level,VARCHAR,55,S
43,Subscriber_City_Name,Claim Level,VARCHAR,30,S
44,Subscriber_State_Code,Claim Level,VARCHAR,2,S
45,Subscriber_Postal_Code,Claim Level,VARCHAR,15,S
46,Subscriber_Gender_Code,Claim Level,VARCHAR,1,S
47,Subscriber_Date_Of_Birth,Claim Level,VARCHAR,10,S
48,Subscriber_Insurance_Group_Number,Claim Level,VARCHAR,50,S
49,Subscriber_Group_Name,Claim Level,VARCHAR,60,S
50,Member_Identification_Number,Claim Level,VARCHAR,80,S
51,Member_Name,Claim Level,VARCHAR,150,S
52,Member_Last_Name,Claim Level,VARCHAR,60,S
53,Member_First_Name,Claim Level,VARCHAR,35,S
54,Member_Street_Address,Claim Level,VARCHAR,55,S
55,Member_City_Name,Claim Level,VARCHAR,30,S
56,Member_State_Code,Claim Level,VARCHAR,2,S
57,Member_Postal_Code,Claim Level,VARCHAR,15,S
58,Member_Gender_Code,Claim Level,VARCHAR,1,S
59,Member_DateOfBirth,Claim Level,VARCHAR,10,S
60,Submitter_Id,Claim Level,VARCHAR,80,S
61,Submitter_Name,Claim Level,VARCHAR,60,S
62,Relationship_To_Subscriber_Code,Claim Level,VARCHAR,2,S
63,Patient_Control_Number,Claim Level,VARCHAR,38,S
64,Medical_Record_Number,Claim Level,VARCHAR,50,S
65,Admission_Date,Claim Level,VARCHAR,10,S
66,Admission_TimeCount,Claim Level,VARCHAR,4,S
67,DIscharge_Time,Claim Level,VARCHAR,35,S
68,Admission_Type_Code,Claim Level,VARCHAR,1,S
69,Admission_Source_Code,Claim Level,VARCHAR,1,S
70,Discharge_Status_Code,Claim Level,VARCHAR,2,S
71,Tax_Identification_Number,Claim Level,VARCHAR,50,S
72,Supplier_Name,Claim Level,VARCHAR,60,S
73,Supplier_TelephoneNumber,Claim Level,VARCHAR,15,S
74,Supplier_Npi,Claim Level,VARCHAR,80,S
75,PayTo_Name,Claim Level,VARCHAR,60,S
76,PayTo_Address,Claim Level,VARCHAR,110,S
77,PayTo_CityName,Claim Level,VARCHAR,30,S
78,PayTo_StateCode,Claim Level,VARCHAR,2,S
79,PayTo_Zip_Code,Claim Level,VARCHAR,5,S
80,Attending_Practitioner_FullName,Claim Level,VARCHAR,130,S
81,Attending_Practitioner_FirstName,Claim Level,VARCHAR,35,S
82,Attending_practitioner_LastName,Claim Level,VARCHAR,60,S
83,Attending_practitioner_Npi,Claim Level,VARCHAR,80,S
84,Attending_Practitioner_Id,Claim Level,VARCHAR,50,S
85,Attending_Practitioner_Id_Qualifier,Claim Level,VARCHAR,3,S
86,Operating_Practitioner_FirstName,Claim Level,VARCHAR,35,S
87,Operating_practitioner_LastName,Claim Level,VARCHAR,60,S
88,Operating_practitioner_Npi,Claim Level,VARCHAR,80,S
89,Operating_Practitioner_Id,Claim Level,VARCHAR,50,S
90,Operating_Practitioner_Id_Qualifier,Claim Level,VARCHAR,3,S
91,Other_Practitioner_FirstName,Claim Level,VARCHAR,35,S
92,Other_practitioner_LastName,Claim Level,VARCHAR,60,S
93,Other_practitioner_Npi,Claim Level,VARCHAR,80,S
94,Other_Practitioner_Id,Claim Level,VARCHAR,50,S
95,Other_Practitioner_Id_Qualifier,Claim Level,VARCHAR,3,S
96,Payer_Identification_Number,Claim Level,VARCHAR,80,S
97,Primary_Diagnosis_Code,Claim Level,VARCHAR,30,S
98,Primary_Diagnosis_POAIndicator,Claim Level,VARCHAR,1,S
99,Admit_Diagnosis_Code,Claim Level,VARCHAR,30,S
100,PRV_Diagnosis_Code1,Claim Level,VARCHAR,30,S
101,PRV_Diagnosis_Code2,Claim Level,VARCHAR,30,S
102,PRV_Diagnosis_Code3,Claim Level,VARCHAR,30,S
103,External_Diagnosis_Code1,Claim Level,VARCHAR,30,S
104,External_Diagnosis_POA1,Claim Level,VARCHAR,1,S
105,External_Diagnosis_Code2,Claim Level,VARCHAR,30,S
106,External_Diagnosis_POA2,Claim Level,VARCHAR,1,S
107,External_Diagnosis_Code3,Claim Level,VARCHAR,30,S
108,External_Diagnosis_POA3,Claim Level,VARCHAR,1,S
109,External_Diagnosis_Code4,Claim Level,VARCHAR,30,S
110,External_Diagnosis_POA4,Claim Level,VARCHAR,1,S
111,External_Diagnosis_Code5,Claim Level,VARCHAR,30,S
112,External_Diagnosis_POA5,Claim Level,VARCHAR,1,S
113,External_Diagnosis_Code6,Claim Level,VARCHAR,30,S
114,External_Diagnosis_POA6,Claim Level,VARCHAR,1,S
115,DRG_Code,Claim Level,VARCHAR,30,S
116,Other_Diagnosis_Code1,Claim Level,VARCHAR,30,S
117,Other_Diagnosis_POA1,Claim Level,VARCHAR,1,S
118,Other_Diagnosis_Code2,Claim Level,VARCHAR,30,S
119,Other_Diagnosis_POA2,Claim Level,VARCHAR,1,S
120,Other_Diagnosis_Code3,Claim Level,VARCHAR,30,S
121,Other_Diagnosis_POA3,Claim Level,VARCHAR,1,S
122,Other_Diagnosis_Code4,Claim Level,VARCHAR,30,S
123,Other_Diagnosis_POA4,Claim Level,VARCHAR,1,S
124,Priniciple_Procedure_Code,Claim Level,VARCHAR,30,S
125,Priniciple_Procedure_Date,Claim Level,VARCHAR,10,S
126,Other_Proedurecode1,Claim Level,VARCHAR,30,S
127,Other_Proeduredate1,Claim Level,VARCHAR,10,S
128,Other_Proedurecode2,Claim Level,VARCHAR,30,S
129,Other_Proeduredate2,Claim Level,VARCHAR,10,S
130,Other_Proedurecode3,Claim Level,VARCHAR,30,S
131,Other_Proeduredate3,Claim Level,VARCHAR,10,S
132,Other_Proedurecode4,Claim Level,VARCHAR,30,S
133,Other_Proeduredate4,Claim Level,VARCHAR,10,S
134,Occurrencespan_code1,Claim Level,VARCHAR,30,S
135,Occurrencespan_Startdate1,Claim Level,VARCHAR,10,S
136,Occurrencespan_Enddate1,Claim Level,VARCHAR,10,S
137,Occurrencespan_code2,Claim Level,VARCHAR,30,S
138,Occurrencespan_Startdate2,Claim Level,VARCHAR,10,S
139,Occurrencespan_Enddate2,Claim Level,VARCHAR,10,S
140,Occurrencespan_code3,Claim Level,VARCHAR,30,S
141,Occurrencespan_Startdate3,Claim Level,VARCHAR,10,S
142,Occurrencespan_Enddate3,Claim Level,VARCHAR,10,S
143,Occurrencespan_code4,Claim Level,VARCHAR,30,S
144,Occurrencespan_Startdate4,Claim Level,VARCHAR,10,S
145,Occurrencespan_Enddate4,Claim Level,VARCHAR,10,S
146,Eventoccurence_Code1,Claim Level,VARCHAR,30,S
147,Eventoccurence_Date1,Claim Level,VARCHAR,10,S
148,Eventoccurence_Code2,Claim Level,VARCHAR,30,S
149,Eventoccurence_Date2,Claim Level,VARCHAR,10,S
150,Eventoccurence_Code3,Claim Level,VARCHAR,30,S
151,Eventoccurence_Date3,Claim Level,VARCHAR,10,S
152,Value_Code1,Claim Level,VARCHAR,30,S
153,Value_Code_Amount1,Claim Level,VARCHAR,18,S
154,Value_Code2,Claim Level,VARCHAR,30,S
155,Value_Code_Amount2,Claim Level,VARCHAR,18,S
156,Value_Code3,Claim Level,VARCHAR,30,S
157,Value_Code_Amount3,Claim Level,VARCHAR,18,S
158,Condition_Code1,Claim Level,VARCHAR,30,S
159,Condition_Code2,Claim Level,VARCHAR,30,S
160,Condition_Code3,Claim Level,VARCHAR,30,S
161,Condition_Code4,Claim Level,VARCHAR,30,S
162,Condition_Code5,Claim Level,VARCHAR,30,S
163,Condition_Code6,Claim Level,VARCHAR,30,S
164,Release_Information_Ind,Claim Level,VARCHAR,1,S
165,Benefit_Assignment_Indicator,Claim Level,VARCHAR,1,S
166,Payer_Name,Claim Level,VARCHAR,60,S
167,Number_of_service_lines,Claim Level,VARCHAR,,S
168,Original_Line_Number,Line Level,VARCHAR,6,S
169,Revenue_Code,Line Level,VARCHAR,48,S
170,Service_Code,Line Level,VARCHAR,48,S
171,Service_code_modifier_1,Line Level,VARCHAR,2,S
172,Service_code_modifier_2,Line Level,VARCHAR,2,S
173,Service_code_modifier_3,Line Level,VARCHAR,2,S
174,Service_code_modifier_4,Line Level,VARCHAR,2,S
175,NDCCode_Qualifier,Line Level,VARCHAR,2,S
176,NDC_Code,Line Level,VARCHAR,48,S
177,NDC_Quantity,Line Level,VARCHAR,15,S
178,NDC_measurement_Type,Line Level,VARCHAR,2,S
179,Service_StartDate,Line Level,VARCHAR,10,S
180,Service_EndDate,Line Level,VARCHAR,10,S
181,Service_Unit_Count,Line Level,VARCHAR,15,S
182,Total_Charge_Amount,Line Level,VARCHAR,18,S
183,Endofrecord,Claim Level/Line level,VARCHAR,3,S
```

## QA Automation/EdifecsProduct_MappingSpec_QA Automation_837I_CSV_to_EDI_Conversion_V1.1.xlsx — 837I Mapping Spec

```csv
EDI LoopID.Segment,EDI Data Element Name,EDI Element Description,Usage,Enumeration Values,Sample values,Hardcode,CSV Field,Claim Level/Line Level,Transformation Logic
"For each claim record  in the IB EDI 837I file, there should be
             1) A claim level record and
              2) Line level records corresponding to each line of the claim
           in the CSV file.",,,,,,,,,
ISA - Interchange Control Header Segment,,,,,,,,,
ISA01,Authorization Information Qualifier,Code identifying the type of information in the Authorization Information,R,00 : No Authorization Information Present,,"Hardcode as ""00""",,,
ISA02,Authorization Information,Code identifying the type of information in the Authorization Information,R,"00: No Authorization Information Present (No
Meaningful Information in I02)
03:Additional Data Identification",,Leave it blank,,,
ISA03,Security Information Qualifier,Code identifying the type of information in the Security Information,R,00,,"Hardcode as ""00""",,,
ISA04,Security Information,"security information about the interchange sender
or the data in the interchange",R,Blank (10 spaces),,Leave it blank,,,
ISA05,Interchange ID Qualifier,"Code indicating the system/method of code structure used to designate the
sender or receiver ID element being qualified",R,ZZ - Mutually Defined,,"Hardcode as ""ZZ""",,,
ISA06,Interchange Sender ID,"Identification code published by the sender for other parties to use as the receiver
ID to route data to them; the sender always codes this value in the sender ID
element",R,<Sender ID>,Example: 100SS,,SenderId,Claim Level,
,,,,,,,TradingPartnerID,Claim Level,
ISA07,Interchange ID Qualifier,"Code indicating the system/method of code structure used to designate the
sender or receiver ID element being qualified",R,ZZ,,"Hardcode as ""ZZ""",,,
ISA08,Interchange Receiver ID,Receiver Id,R,<Receiver ID>,,,ReceiverId,Claim Level,
ISA09,Interchange Date,Date of the interchange,R,SysDate (YYMMDD),Example : 220915,"Map this value from  current date in the format of ""YYMMDD""",,,
ISA10,Interchange Time,Time of the interchange,R,SysTime (HHMM),Example : 0145,Map this value from   current time in the format of HHMM,,,
ISA11,Repetition Separator,"the repetition separator is a delimiter and not a data
element; this field provides the delimiter used to separate repeated occurrences
of a simple data element or a composite data structure; this value must be
different than the data element separator, component element separator, and the
segment terminator",R,^,,"Hardcode as ""^""",,,
ISA12,Interchange Control Version Number,Code specifying the version number of the interchange control segments,R,00501,,Hardcode as “00501”,,,
ISA13,Interchange Control Number,A control number assigned by the interchange sender,R,,Exaample:000004846,"Hardcode as ""123456789""",,,
ISA14,Acknowledgment Requested,Code indicating sender’s request for an interchange acknowledgment,R,1= Interchange Acknowledgment Requested,,"Hardcode as ""0""",,,
ISA15,Interchange Usage Indicator,"Code indicating whether data enclosed by this interchange envelope is test,
production or information",R,P=Production,,"""P""  if it is a Production region
""T""  if it is a Non-Production region",,,
ISA16,Component Element Separator,The delimiter used to separate component data elements,R,: = Element Seperator,,"Hardcode  as "":""",,,
GS -Functional Group Header Segment,,,,,,,,,
GS01,Functional Identifier Code,The two-character identifier Code for the transaction set included.,R,HC : Health Care Claim (837),,Hardcode as “HC”,,,
GS02,Application Sender's Code,"Code identifying party sending transmission,  codes agreed to by trading partners
This is Submitter-specific.",R,<Sender ID>,Example : 100ZM,,SenderId,,
GS03,Application Receiver's Code,Code identifying party receiving transmission; codes agreed to by trading partners,R,<HealthPlan ID>,,,ReceiverId,,
GS04,Date,Date the Group Header is created.,R,SysDate (YYYYMMDD),20210701,"Map this value from  current date in the format of ""YYYYMMDD""",,,
GS05,Time,Time the Group Header is created.,R,SysTime (HHMM),1213,"Map this value from   current Time in the format of ""HHMMSS""",,,
GS06,Group Control Number,Submitter-specific number.,R,<Group Control Number>,75041,"Hardcode as ""123456789""",,,
GS07,Responsible Agency Code,Code identifying the issuer of the EDI standard being used.,R,X : Accredited Standards Committee X12,,"Hardcode as ""X""",,,
GS08,Version / Release / Industry Identifier Code,"Code indicating the version, release, subrelease, and industry identifier of the EDI
standard being used,
ST03 and GS08 must be identical",R,005010X223A2,,"Hardcode as ""005010X222A2""",,,
ST - Transaction Set Header Segment,,,,,,,,,
ST01,Transaction Set Identifier Code,Code uniquely identifying a Transaction Set,R,837 : Health Care Claim,,837,,,
ST02,Transaction Set Control Number,Unique Sequential Number Assigned by Internal Processes for each Transaction Set. Starts from 001 and increments with each transaction set,R,"<Transaction set Control Number>
Starts from 001 and increments with each transaction set",002,Unique control number needs to populated from process flow or map,,,
ST03,Implementation Convention Reference,Standards Approved by ACS X12 Review Board.                 ST03 and GS08 must be identical,R,005010X223A2,,005010X222A2,,,
BHT - Beginning Of Hierarchical Transaction Segment,,,,,,,,,
BHT01,Hierarchical Structure Code,Code indicating the hierarchical application structure of a transaction set,R,"0019- Information Source, Subscriber, Dependent",,0019,,,
BHT02,Transaction Set Purpose Code,"Code identifying purpose of transaction set.  Used to convey the electronic transmission status of
the 837 batch",R,"00 : Original
18 : Reissue",,"Hardcode as ""00""",,,
BHT03,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,<Originator Application Transaction Identifier>,75041,"Hardcode as ""12345""",,,
BHT04,Date,The date the transaction was created,R,SysDate (YYYYMMDD) -,20210701,,Receipt_Date,Claim Level,Format : YYYY-MM-DD
,,,,,,,Clean_Claim_Date,Claim Level,Format : YYYY-MM-DD
BHT05,Time,The time the transaction was created,R,SysTime (HHMMSS),121314,"Map this value from   current Time in the format of ""HHMMSS""",,,
BHT06,Transaction Type Code,Code specifying the type of transaction,R,CH- Chargeable,,"Hardcode as ""RP""",,,
Loop 1000A (Required)Loop Repeat: 1,,,,,,,,,
Segment NM1 - Submitter Name  (Required),,,,,,,,,
1000A.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,41 : Submitter,,"Hardcode as ""41""",,,
1000A.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,"1 : Person
2 : Non-person Entity",,"Hardcode as ""2""",,,
1000A.NM103,Name Last or Organization Name,Individual last name or organizational name,R,<Submitter Last/Org Name>,THE SSI GROUP,,Submitter_Name,Claim Level,
1000A.NM104,Name First,Individual first name,S,,,,,,
1000A.NM105,Name Middle,Individual middle name or initial,S,,,,,,
1000A.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code",R,46 : Electronic Transmitter Identification Number (ETIN,,"Hardcode as ""46""",,,
1000A.NM109,Identification Code,Code identifying a party or other code,R,<Submitter ID>,100SS,,Submitter_Id,Claim Level,
Segment PER - Submitter EDI Contact Information,,,,,,,,,
1000A.PER01,Contact Function Code,Code identifying the major duty or responsibility of the person or group named,R,IC,,"Hardcode  as ""IC""",,,
1000A.PER02,Name,Submitter Contact Name,S,<Submitter Name> - JOAN KOSSOW,,"""PRODUCT""",,,
1000A.PER03,Communication Number Qualifier,Code identifying the type of communication number,R,"""EM"" - Electronic Mail
""FX"" - Facsimile
""TE"" - Telephone",,"Hardcode  as ""TE""",,,
1000A.PER04,Communication Number,Complete communications number including country or area code when applicable,R,<Email/Faxsimile Number/Telephone Number> - 2513450000,,"Hardcode as ""1234567890""",,,
1000A.PER05,Communication Number Qualifier,Code identifying the type of communication number,S,"""EM"" - Electronic Mail
""FX"" - Facsimile
""TE"" - Telephone",,,,,
1000A.PER06,Communication Number,Complete communications number including country or area code when applicable,S,<Email/Faxsimile Number/Telephone Number> 2513450100,,,,,
1000A.PER07,Communication Number Qualifier,Code identifying the type of communication number,S,"""EM"" - Electronic Mail EM
""FX"" - Facsimile
""TE"" - Telephone",,,,,
1000A.PER08,Communication Number,Complete communications number including country or area code when applicable,S,<Email/Faxsimile Number/Telephone Number>,,,,,
Loop 1000B (Required)Loop Repeat: 1,,,,,,,,,
Segment NM1 - Receiver Name  (Required),,,,,,,,,
1000B.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,40 : Receiver,,"Hardcode as ""40""",,,
1000B.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,"1 : Person
2 : Non-person Entity",,"Hardcode as ""2""",,,
1000B.NM103,Name Last or Organization Name,Code identifying an organizational NAME,R,,HealthPlan Name,"Hardcode as ""Product""",,,
1000B.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code",R,46 : Electronic Transmitter Identification Number (ETIN,,"Hardcode as ""46""",,,
1000B.NM109,Identification Code,Code identifying a party,R,,<HealthPlan Payer ID>,"Default values
<123456789123>",,,
Loop 2000A (Required)Loop Repeat: >1,,,,,,,,,
Segment HL - Billing Provider Hierarchical Level  (Required),,,,,,,,,
2000A.HL01,Hierarchical ID Number,"A unique number assigned by the sender to identify a particular data segment in
a hierarchical structure",R,"The first HL01 within each ST-SE envelope must begin with “1”,
and be incremented by one each time an HL is used in the
transaction",,Generated by Edifecs,,,
2000A.HL03,Hierarchical Level Code,Code defining the characteristic of a level in a hierarchical structure,R,20 : Information Source,,"Hardcode as ""20""",,,
2000A.HL04,Hierarchical Child Code,"Code indicating if there are hierarchical child data segments subordinate to the
level being described.",R,"1 : Additional Subordinate HL Data Segment in This
Hierarchical Structure.",,Generated by Edifecs,,,
Segment PRV - Billing Provider Specialty Information  (Situational),,,,,,,,,
2000A.PRV01,Provider Code,Code identifying the type of provider,R,BI : Billing,,,,,
2000A.PRV02,Reference Identification Qualifier,Code qualifying the Reference Identification,R,PXC :  Health Care Provider Taxonomy Code,,,,,
2000A.PRV03,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,,
Segment CUR - Foreign Currency Information (Situational),,,,,,,,,
2000A.CUR01,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,85 - Billing provider,,,,,
2000A.CUR02,Currency Code,Code (Standard ISO) for country in whose currency the charges are specified,R,<Currency Code>,,,,,
Loop 2010AA (Required) Loop Repeat: 1,,,,,,,,,
Segment NM1 - Billing Provider Name (Required),,,,,,,,,
2010AA.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,85 - Billing provider,,"Hardcode as ""85""",,,
2010AA.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,"1 : Person
2 : Non-Person Entity",,"Hardcode as ""2""",,,
2010AA.NM103,Name Last or Organization Name,Individual last name or organizational name,R,<Billing Provider Organizational Name>,MILLCREEK OF ARKANSAS,,BillingRecipient_Name,Claim Level,"Supplier name should be loaded first(if present) ,then billingrecipient name can be loaded"
,,,,,,,Supplier_Name,Claim Level,
2010AA.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code (67)",S,"XX :  Centers for Medicare and Medicaid Services
National Provider Identifier",,"Hardcode as ""XX""",,,
2010AA.NM109,Identification Code,Code identifying a party or other code / Billing Provider Identifier,S,<Billing Provider NPI> -,0052482036,,Supplier_Npi,Claim Level,
Segment N3 - Billing Provider Address (Required),,,,,,,,,
2010AA.N301,Address Information,Code identifying the address,R,<Billing Provider Address Line>,4495 YUKON COURT APT 78,,BillingRecipient_Address,Claim Level,"Concatenate the N301 and N302 value (if present)  separated by comma and space (, ) , include it in this element, for example, “3933 Haley Grove , Anand Sr""."
,,,,,,,Supplier_Address,Claim Level,"Concatenate the N301 and N302 value (if present)  separated by comma and space (, ) include it in this element, for example, “3933 Haley Grove , Anand Sr""."
2010AA.N302,Address Information,Code identifying the address,S,<Billing Provider Address Line>,PO BOX 17471,,,,
"Segment N4 - Billing Provider City, State, ZIP Code (Required)",,,,,,,,,
2010AA.N401,City Name,Code identifying the address,R,,DENVER,,BillingRecipient_CityName,Claim Level,
,,,,,,,Supplier_CityName,Claim Level,
2010AA.N402,State or Province Code,Code identifying the address,S,,CO,,BillingRecipient_StateCode,Claim Level,
,,,,,,,Supplier_StateCode,Claim Level,
2010AA.N403,Postal Code,Code identifying the address,S,,802044507,,BillingRecipient_ZipCode,Claim Level,Map byte 1-5 byte
,,,,,,,Supplier_ZipCode,Claim Level,Map byte 1-5 byte
,,,,,,,BillingRecipient_ZipSuffixCode,Claim Level,Map byte 6-9
,,,,,,,Supplier_ZipSuffixCode,Claim Level,Map byte 6-9
2010AA.N404,Country Code,Code identifying the address,S,,,,,,
2010AA.N407,Country Subdivision Code,,S,,,,,,
Segment REF - Billing Provider Tax Identification (Required),,,,,,,,,
2010AA.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,EI : Employer’s Identification Number,,"Hardcode as ""EI""",,,
2010AA.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,Tax_Identification_Number,Claim Level,Format : XXX-XXXXXX
Segment - PER Billing Provider Contact Information (Situational),,,,,,,,,
2010AA.PER01,Contact Function Code,Code identifying the major duty or responsibility of the person or group name,R,IC -  Information Contact,,,,,
2010AA.PER02,Name,Billing Provider Contact Name,S,,,Hardcode as 'PRODUCT',,,
2010AA.PER03,Communication Number Qualifier,Code identifying the type of communication number,R,"""EM"" : Electronic Mail
""FX"" : Facsimile
""TE"" : Telephone","FX- Facsimile
TE - Telephone","Hardcode as ""TE""",,,
2010AA.PER04,Communication Number,"Complete communications number including
country or area code",R,,3033981735,,Supplier_TelephoneNumber,Claim Level,If PER03=TE'
,,,,,,,BillingRecipient_TelephoneNumber,Claim Level,If PER03=TE'
2010AA.PER05,Communication Number Qualifier,Code identifying the type of communication numbe,S,"""EM"" : Electronic Mail
""FX"" : Facsimile
""TE"" : Telephone
""EX"" : Telephone Extension","FX- Facsimile
TE - Telephone",,,,
2010AA.PER06,Communication Number,Communication Number,S,,3033981649,,,,
Loop 2010AB (Situational) Loop Repeat: 1,,,,,,,,,
Segment - NM1 Pay-to Address Name (Situational),,,,,,,,,
2010AB.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,87: Pay-to Provider,,"Hardcode as ""87""",,,
2010AB.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,"1 : Person
2:  Non-Person Entity",,"Hardcode as ""2""",,,
Segment - N3 Pay-to Address - ADDRESS (Required),,,,,,,,,
2010AB.N301,Address Information,Address Information,R,,PO BOX 17379,,PayTo_Address,Claim Level,"Concatenate the N301 and N302 value (if present)  separated by comma and space (, )include it in this element, for example, “3933 Haley Grove , Anand Sr""."
2010AB.N302,Address Information,Address Information,S,,,,PayTo_Address,Claim Level,
"Segment - N4 Pay-To Address City, State, ZIP Code (Required)",,,,,,,,,
2010AB.N401,City Name,Free-form text for city name,R,,DENVER,,PayTo_CityName,Claim Level,
2010AB.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,CO,,PayTo_StateCode,Claim Level,
2010AB.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,802170379,,PayTo_Zip_Code,Claim Level,1-5 digits
2010AB.N404,Country Code,Code identifying the country,S,,,,,,
2010AB.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,
Loop 2010AC (Situational)  Loop Repeat: 1,,,,,,,,,
Segment - NM1 Pay-To Plan Name (Situational),,,,,,,,,
2010AC.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,PE : Payee,,,,,
2010AC.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,2 : Non-Person Entity,,,,,
2010AC.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,,,,
2010AC.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),R,,,,,,
2010AC.NM109,Identification Code,Code identifying a party or other code,R,,,,,,
Segment - N3 Pay-to Plan Address (Required),,,,,,,,,
2010AC.N301,Address Information,Address Information,R,,,,,,
2010AC.N302,Address Information,Address Information,S,,,,,,
"Segment - N4 Pay-To Plan City, State, ZIP Code (Required)",,,,,,,,,
2010AC.N401,City Name,Free-form text for city name,R,,,,,,
2010AC.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,,,,
2010AC.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,,,,,
2010AC.N404,Country Code,Code identifying the country,S,,,,,,
2010AC.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,
Segment - REF Pay-to Plan Secondary Identification (Required),,,,,,,,,
2010AC.REF01,Reference Identification Qualifier,,R,,,,,,
2010AC.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,,
Segment - REF Pay-To Plan Tax Identification Number (Required),,,,,,,,,
2010AC.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,EI : Employer’s Identification Number,,,,,
2010AC.REF02,Reference Identification,"Reference information as specified
by the Reference Identification Qualifier",R,,,,,,
Loop 2000B (Required) Loop Repeat: >1,,,,,,,,,
Segment - HL Subscriber Hierarchical Level (Required),,,,,,,,,
2000B.HL01,Hierarchical ID Number,"A unique number assigned by the sender to identify a particular data segment in
a hierarchical structure",R,"2000A.HL01 + 1

Incremented at each new HL segment.",,Generated by Edifecs,,,
2000B.HL02,Hierarchical Parent ID Number,"Identification number of the next higher hierarchical data segment that the data
segment being described is subordinate to",R,2000A.HL01,,2000A.HL01,,,
2000B.HL03,Hierarchical Level Code,Code defining the characteristic of a level in a hierarchical structure,R,22- Subscriber,,"Hardcode as ""22""",,,
2000B.HL04,Hierarchical Child Code,"Code indicating if there are hierarchical child data segments subordinate to the
level being described.",R,"0 :  HL04 has no subordinate levels  (the subscriber is the patient and there are no dependent claims)
1: HL04 has subordinate levels",0 /1 Based On The Count - 1,Generated by Edifecs,,,
Segment - SBR Subscriber Information (Required),,,,,,,,,
2000B.SBR01,Payer Responsibility Sequence Number Code,"Code identifying the insurance carrier’s level of responsibility for a payment of a
claim",R,"P : Primary
S : Secondary
T  : Tertiary",S,"Hardcode as ""P""",,,
2000B.SBR02,Individual Relationship Code,Code indicating the relationship between two individuals or entities,S,"1 Spouse
18 Self
19 Child
20 Employee
21 Unknown
39 Organ Donor
40 Cadaver Donor
53 Life Partner
G8 Other Relationship",,,Relationship_To_Subscriber_Code,Claim Level,Only if 2000C loop doesn’t exists.
2000B.SBR03,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,S,,,,Subscriber_Insurance_Group_Number,Claim Level,
2000B.SBR04,Name,,S,,,,Subscriber_Group_Name,Claim Level,
2000B.SBR09,Claim Filing Indicator Code,Code identifying type of claim,S,"11 : Other Non-Federal Programs
12 : Preferred Provider Organization (PPO)
13 : Point of Service (POS)
14 : Exclusive Provider Organization (EPO)
15 : Indemnity Insurance
16 : Health Maintenance Organization (HMO) Medicare
Risk
17 : Dental Maintenance Organization
AM :  Automobile Medical
BL :  Blue Cross/Blue Shield
CH :  Champus
CI :  Commercial Insurance Co.
DS :  Disability
FI :  Federal Employees Program
HM :  Health Maintenance Organization
LM :  Liability Medical
MA :  Medicare Part A
MB :  Medicare Part B
MC :  Medicaid
OF :  Other Federal Program
1484 Use code OF when submitting Medicare Part D
claims.
TV Title V
VA Veterans Affairs Plan
WC Workers’ Compensation Health Claim
ZZ Mutually Defined
71 Use Code ZZ when Type of Insurance is not known.",,,Claim_Filing_Code,Claim Level,
Loop 2010BA (Required)Loop Repeat: 1,,,,,,,,,
Segment - NM1 Subscriber Name (Required),,,,,,,,,
2010BA.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,IL :  Insured or Subscriber,,"Hardcode as ""IL""",,,
2010BA.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,"1 : Person
2 : Non-Person Entity",,"Hardcode as ""1""",,,
2010BA.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,,Subscriber_Last_Name,Claim Level,
,,,,,,,Member_Last_Name,Claim Level,Only if 2000C loop doesn’t exists.
2010BA.NM104,Name First,Individual first name,S,,,,Subscriber_Name,Claim Level,concatenate NM104/5/3/7 (First Middle Last Suffix)
,,,,,,,Member_Name,Claim Level,"Only if 2000C loop doesn’t exists.
concatenate NM104/5/3/7 (First Middle Last Suffix)"
,,,,,,,Subscriber_First_Name,Claim Level,
,,,,,,,Member_First_Name,Claim Level,Only if 2000C loop doesn’t exists.
2010BA.NM105,Name Middle,Individual middle name or initial,S,,,,,,
2010BA.NM107,Name Suffix,Suffix,S,,,,,,
2010BA.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code",S,"II :  Standard Unique Health Identifier for each Individual in the United States
MI  :  Member Identification Number",,"Hardcode as ""MI""",,,
2010BA.NM109,Identification Code,Code identifying a party or other code / Subscriber Primary Identifier,S,,000561005,,Submitted_Subscriber_Id,Claim Level,
,,,,,,,Subscriber_Identification_Number,Claim Level,
,,,,,,,Member_Identification_Number,Claim Level,Only if 2000C loop doesn’t exists.
Segment - N3 Subscriber Address (Situational),,,,,,,,,
2010BA.N301,Address Information,Address Information,R,,4495 YUKON COURT APT 78,,Member_Street_Address,Claim Level,Only if 2000C loop doesn’t exists.
,,,,,,,Subscriber_Street_Address,Claim Level,
2010BA.N302,Address Information,,S,,,,,,
"Segment - N4 Subscriber City, State, ZIP Code (Situational)",,,,,,,,,
2010BA.N401,City Name,Free-form text for city name,R,,WHEAT RIDGE,,Member_City_Name,Claim Level,Only if 2000C loop doesn’t exists.
,,,,,,,Subscriber_City_Name,Claim Level,
2010BA.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,CO,,Member_State_Code,Claim Level,Only if 2000C loop doesn’t exists.
,,,,,,,Subscriber_State_Code,Claim Level,
2010BA.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,800333283,,Member_Postal_Code,Claim Level,Only if 2000C loop doesn’t exists.
,,,,,,,Subscriber_Postal_Code,Claim Level,
2010BA.N404,Country Code,Code identifying the country,S,,,,,,
2010BA.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,
Segment - DMG Subscriber Demographic Information (Situational),,,,,,,,,
2010BA.DMG01,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 :  Date Expressed in Format,,"Hardcode as ""D8""",,,
2010BA.DMG02,Date Time Period,Date Time Period,R,YYYYMMDD,,,Member_DateOfBirth,Claim Level,"Only if 2000C loop doesn’t exists.
Format :YYYY-MM-DD"
,,,,,,,Subscriber_Date_Of_Birth,Claim Level,Format :YYYY-MM-DD
2010BA.DMG03,Gender Code,Code indicating the sex of the individual,R,"F : Female
M : Male",,,Member_Gender_Code,Claim Level,Only if 2000C loop doesn’t exists.
,,,,,,,Subscriber_Gender_Code,Claim Level,
Segment - REF Subscriber Secondary Identification (Situational),,,,,,,,,
2010BA.REF01,Reference Identification Qualifier,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,SY Social Security Number,,,,,
2010BA.REF02,Reference Identification,Code qualifying the Reference Identification,R,,,,,,
Segment - REF Property and Casualty Claim Number (Situational),,,,,,,,,
2010BA.REF01,Reference Identification Qualifier,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,Y4 Agency Claim Number,,,,,
2010BA.REF02,Reference Identification,Code qualifying the Reference Identification,R,,,,,,
Loop 2010BB (Required) Loop Repeat: 1,,,,,,,,,
Segment - NM1 Payer Name (Required),,,,,,,,,
2010BB.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,PR -Payer,,"Hardcode as ""PR""",,,
2010BB.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,2 :Non-Person Entity,,"Hardcode as ""2""",,,
2010BB.NM103,Name Last or Organization Name,Name Last or Organization Name,R,HealthPlan,,,Payer_Name,Claim Level,
2010BB.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code",R,"PI :  Payor Identification
XV : Centers for Medicare and Medicaid Services PlanID",,"Hardcode as ""PI""",,,
2010BB.NM109,Identification Code,Code identifying a party or other code / Subscriber Primary Identifier,R,,COACC,,Payer_Identification_Number,Claim Level,
Segment - N3 Payer Address (Situational),,,,,,,,,
2010BB.N301,Address Information,Address Information,R,,PO BOX 17471,"Hardcode as ""XXXX""",,,
2010BB.N302,Address Information,Address Information,S,,,,,,
"Segment - N4 Payer City, State, ZIP Code (Situational)",,,,,,,,,
2010BB.N401,City Name,Free-form text for city name,R,,DENVER,"Default value as ""Product""",,,
2010BB.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,CO,"Default  value as ""CO""",,,
2010BB.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,802170470,"Default  value as ""80014""",,,
2010BB.N404,Country Code,Code identifying the country,S,,,,,,
2010BB.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,
Segment - REF Payer Secondary Identification (Situational),,,,,,,,,
2010BB.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,,,,,,
2010BB.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,
Segment - REF Billing Provider Secondary Identification (Situational),,,,,,,,,
2010BB.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,,,,,,
2010BB.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,
2010BB.DMG03,Gender Code,,R,,,,,,
"Loop 2000C - Patient Hierarchical Level (Situational)  In case of dependent claims (if the dependant is the patient ),  2000C loop will be there and the 2300 and 2400 loop will be below 2000C in that scenario)",,,,,,,,,
Segment HL -  Patient Hierarchical Level (Situational),,,,,,,,,
2000C.HL01,Hierarchical ID Number,"A unique number assigned by the sender to identify a particular data segment in
a hierarchical structure",R,,,System Generated,,,
2000C.HL02,Hierarchical Parent ID Number,"Identification number of the next higher hierarchical data segment that the data
segment being described is subordinate to",R,,,2000B.HL01,,,
2000C.HL03,Hierarchical Level Code,Code defining the characteristic of a level in a hierarchical structure,R,"23 : Dependent (the information
in this HL applies to the patient when the subscriber
and the patient are not the same person)",,"Hardcode as ""23""",,,
2000C.HL04,Hierarchical Child Code,"Code indicating if there are hierarchical child data segments subordinate to the
level being described",R,"0 :  No Subordinate HL Segment in This Hierarchical
Structure",,"Hardcode as ""0""",,,
Segment PAT - Patient information,,,,,,,,,
2000C.PAT01,Individual Relationship Code,Code indicating the relationship between two individuals or entities,R,"01 : Spouse
19 : Child
18:self
20 : Employee
21 : Unknown
39 : Organ Donor
40:  Cadaver Donor
53:  Life Partner
G8 : Other Relationship",,,Relationship_To_Subscriber_Code,Claim Level,
Loop 2010CA - Patient Name (Situational)  Loop Repeat: 1,,,,,,,,,
Segment - NM1 Patient Name (Required),,,,,,,,,
2010CA.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,QC : Patient,,"Hardcode as ""QC""",,,
2010CA.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,1: Person,,"Hardcode as ""1""",,,
2010CA.NM103,Name Last or Organization Name,Organization Name Last Name,R,,,,Member_Last_Name,Claim Level,
,,,,,,,Member_Name,Claim Level,concatenate NM104/5/3/7 (First Middle Last Suffix)
2010CA.NM104,Name First,Patient  First Name,S,,,,Member_First_Name,Claim Level,
2010CA.NM105,Name Middle,Patient Middle Name or Initial,S,,,,,,
2010CA.NM107,Name Suffix,Patient Name Suffix,S,,,,,,
Segment - N3 Patient Address (Situational),,,,,,,,,
2010CA.N301,Address Information,Code identifying the Patient address,R,,1000 JACKSON ST,,Member_Street_Address,Claim Level,
2010CA.N302,Address Information,Code identifying the Patient address,S,,,,,,
"Segment - N4 Patient City, State, ZIP Code (Situational)",,,,,,,,,
2010CA.N401,City Name,Free-form text for city name,R,,,,Member_City_Name,Claim Level,
2010CA.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,,Member_State_Code,Claim Level,
2010CA.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks,S,,,,Member_Postal_Code,Claim Level,
2010CA.N404,Country Code,Code identifying the country,S,,,,,,
2010CA.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,
Segment - DMG Patient Demographic Information (Situational),,,,,,,,,
2010CA.DMG01,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 : Date Expressed in Format CCYYMMDD,,"Hardcode as ""D8""",,,
2010CA.DMG02,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times/Patient Birth Date",R,,19670712,,Member_DateOfBirth,Claim Level,Format : YYYY-MM-DD
2010CA.DMG03,Gender Code,Code indicating the sex of the individual,R,"F: Female
M :Male
U : Unknown",,,Member_Gender_Code,Claim Level,
Segment - Property and Casuality Claim Number (Situational),,,,,,,,,
2010CA.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,Y4 Agency Claim Number,,,,,
2010CA.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,
"Loop 2300  - CLAIM INFORMATION(Required)  Loop Repeat: 100
       When patient is the subscriber : The claim information(Loop ID-2300), is placed following Loop ID-2010BB in the Subscriber Hierarchical Level(HL) and patient information is sent in Loop ID-2010BA.
       When patient is the dependent :  The claim information(Loop ID-2300),is placed following Loop ID-2010CA  in the Patient HL and the patient information is sent in Loop ID-2010CA .",,,,,,,,,
Segment - CLM Claim information (Situational),,,,,,,,,
2300.CLM01,Claim Submitter's Identifier,Identifier used to track a claim from creation by the health care provider through payment,R,,<patientControlNumber> 1003795048I7791539,,Patient_Control_Number,Claim Level,
2300.CLM02,Monetary Amount,"Monetary Amount   CLM02 is the total amount of all submitted charges of service segments
for this claim.",R,,214.25,,Totals,Claim Level,
2300.CLM05.01,Facility Code Value,"Code identifying where services were, or may be, performed; the first
and second positions of the Uniform Bill Type Code for Institutional
Services or the Place of Service Codes for Professional or Dental
Services.",R,,,,Type_Of_Bill_Code,Claim Level,
2300.CLM05.02,Facility Code Qualifier,Code identifying the type of facility referenced,R,A :Uniform Billing Claim Form Bill Type,,"Hardcode as ""A""",,,
2300.CLM05.03,Claim Frequency Type Code,"code specifying the frequency of the claim; this is the third position of
the Uniform Billing Claim Form Bill Type",R,1,,,Frequency_Code,Claim Level,
2300.CLM07,Provider Accept Assignment Code,Code indicating whether the provider accepts assignment,R,"A : Assigned
B : Assignment Accepted on Clinical Lab Services Only
C :  Not Assigned",,,,,"if 2300.CLM08 = Y then map it as ""A""; else,
If 2300.CLM08= N then Map it  as ""C""."
2300.CLM08,Yes/No Condition or Response Code,Benefits Assignment Certification Indicator,R,"Y : Yes
N : No
W :  Not Applicable",,,Benefit_Assignment_Indicator,Claim Level,
2300.CLM09,Release of Information Code,"Code indicating whether the provider has on file a signed statement by the patient
authorizing the release of medical data to other organizations",R,"I : Informed Consent  to Release Medical Information for Conditions or Diagnoses
Y :Yes, Provider has a Signed Statement Permitting
Release of Medical Billing Data Related to a Claim",,,Release_Information_Ind,Claim Level,
2300.CLM20,Delay Reason Code,Code indicating the reason why a request was delayed,S,,,,,,
Segment - DTP Discharge Date/Hour (Situational),,,,,,,,,
2300.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,096 Discharge,,"Hardcode as ""096""",,,
2300.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,TM Time Expressed in Format HHMM,,"Hardcode as ""TM""",,,
2300.DTP03,Date Time Period,Date Time Period,R,HH:MM,,,DIscharge_Time,,
Segment - DTP Statement Dates (Required),,,,,,,,,
2300.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,434 Statement,,"Hardcode as ""434""",,,
2300.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8: Range of Dates Expressed in Format CCYYMMDDCCYYMMDD,,"Hardcode as ""RD8""",,,
2300.DTP03,Date Time Period,Date Time Period,R,,20210311-20210311,,Statement_Start_Date,Claim Level,byte 1-8 in format YYYY-MM-DD
,,,,,,,Statement_End_Date,Claim Level,byte 10-17  in format YYYY-MM-DD
Segment - DTP Admission Date/Hour (Situational),,,,,,,,,
2300.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,435 :Admission,,"Hardcode as ""435""",,,
2300.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 :  Date Expressed in Format CCYYMMDD,,"Hardcode ""DT""  if Admission_TimeCount is present. Else D8.",,,
2300.DTP03,Date Time Period,Date Time Period,R,"If D8 - CCYYMMDD
If DT- CCYYMMDDHH",,,Admission_Date,Claim Level,In the format YYYY-MM-DD
,,,,,,,Admission_TimeCount,Claim Level,when DTP02=DT map byte 9-12
Segment - DTP Date - Repricer Received Date (Situational),,,,,,,,,
2300.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,050 Received,,,,,
2300.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 :  Date Expressed in Format CCYYMMDD,,,,,
2300.DTP03,Date Time Period,Date Time Period,R,"If D8 - CCYYMMDD
If DT- CCYYMMDDHH",,,,,
Segment - CL1 Institutional Claim Code (Required),,,,,,,,,
2300.CL101,Admission Type Code,Code indicating the priority of this admission,R,"1-Emergency
2-Urgent
3-Elective",,,Admission_Type_Code,Claim Level,
2300.CL102,Admission Source Code,Code indicating the source of this admissio,S,,,,Admission_Source_Code,Claim Level,
2300.CL103,Patient Status Code,Code indicating patient status as of the “statement covers through date,R,,,,Discharge_Status_Code,Claim Level,
Segment - PWK Claim Supplemental Information (Situational),,,,,,,,,
2300.PWK01,Report Type Code,"Code indicating the title or contents of a document, report or supporting item",R,"03 Report Justifying Treatment Beyond Utilization
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
XP Photographs",,"Hardcode as ""10""",,,
2300.PWK02,Report Transmission Code,"Code defining timing, transmission method or format by which reports are to be
sent",R,"AA Available on Request at Provider Site . BM By Mail
 EL Electronically.
 EM E-Mail
FT File Transfer
FX By Fax",,"Hardcode as ""BM""",,,
2300.PWK05,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code (67)",S,AC Attachment Control Number,,"Hardcode as ""AC""",,,
2300.PWK06,Identification Code,Code identifying a party or other code,S,,,,Attachment_Set_ID,Claim Level,
Segment - CN1 Contract Information (Situational),,,,,,,,,
2300.CN101,Contract Type Code,Code identifying a contract type,R,"01 Diagnosis Related Group (DRG)
02 Per Diem
03 Variable Per Diem
04 Flat
05 Capitated
06 Percent
09 Other",,,,,
2300.CN102,Monetary Amount,Monetary amount,S,,,,,,
2300.CN103,"Percent, Decimal Format","Percent given in decimal format (e.g., 0.0 through 100.0 represents 0% through
100%)",S,,,,,,
2300.CN104,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",S,,,,,,
2300.CN105,Terms Discount Percent,"Terms discount percentage, expressed as a percent, available to the purchaser if
an invoice is paid on or before the Terms Discount Due Date",S,,,,,,
2300.CN106,Version Identifier,"Revision level of a particular format, program, technique or algorithm",S,,,,,,
Segment - AMT Patient Estimated Amount Due (Situational),,,,,,,,,
2300.AMT01,Amount Qualifier Code,Code to qualify amount,R,F3 Patient Responsibility - Estimated,,,,,
2300.AMT02,Monetary Amount,Monetary Amount,R,,,,,,
Segment - REF Service Authorization Exception Code (Situational),,,,,,,,,
2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,4N :Special Payment Reference Number,,,,,
2300.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,"1 Immediate/Urgent Care
2 Services Rendered in a Retroactive Period
3 Emergency Care
4 Client has Temporary Medicaid
5 Request from County for Second Opinion to Determine
if Recipient Can Work
6 Request for Override Pending
7 Special Handling",,,,,
Segment - REF Referral Number (Situational),,,,,,,,,
2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,9F Referral Number,,,,,
2300.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,,
Segment - REF Prior Authorization (Situational),,,,,,,,,
2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,G1 : Prior Authorization Number,,,,,
2300.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,,
Segment - REF Payer Claim Control Number (Situational),,,,,,,,,
2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,F8 Original Reference Number,,"Hardcode as ""F8""",,,
2300.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,Claim_Number,Claim Level,
Segment - REF Repriced Claim Number (Situational),,,,,,,,,
2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,9A-Repriced Claim Reference Number,,,,,
2300.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,,
Segment - REF Adjusted Repriced Claim Number (Situational),,,,,,,,,
2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,9C :  Adjusted Repriced Claim Reference Number,,,,,
2300.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,,
Segment - REF Investigational Device Exemption Number (Situational),,,,,,,,,
2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,LX : Qualified Products List,,,,,
2300.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,,
Segment - REF Claim Identification For Transmission Intermediaries (Situational),,,,,,,,,
2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,D9 : Claim Number,,"Hardcode as ""D9""",,,
2300.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,Clearing_House_TraceNumber,Claim Level,
Segment - REF Auto Accident State (Situational),,,,,,,,,
2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,LU Location Number,,,,,
2300.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,,
Segment - REF Medical Record Number (Situational),,,,,,,,,
2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,EA Medical Record Identification Number,,"Hardcode as ""EA""",,,
2300.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,Medical_Record_Number,Claim Level,
Segment - REF Demonstration Project Identifier (Situational),,,,,,,,,
2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,P4 -Project Code,,,,,
2300.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,,
Segment - REF Peer Review Organization (PRO) Approval Number (Situational),,,,,,,,,
2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,G4-Peer Review Organization (PRO) Approval Number,,,,,
2300.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,,
Segment - K3 File Information (Situational),,,,,,,,,
2300.K301,Fixed Format Information,Data in fixed format agreed upon by sender and receiver,R,,,,,,
Segment - NTE Claim Note (Situational),,,,,,,,,
2300.NTE01,Note Reference Code,Code identifying the functional area or purpose for which the note applies,R,"ADD : Additional Information
CER : Certification Narrative
DCP : Goals, Rehabilitation Potential, or Discharge Plans",,,,,
2300.NTE02,Description,A free-form description to clarify the related data elements and their content  /  Claim Note Text,R,,,,,,
Segment - NTE Billing Note (Situational),,,,,,,,,
2300.NTE01,Note Reference Code,Code identifying the functional area or purpose for which the note applies,R,"ADD : Additional Information
CER : Certification Narrative
DCP : Goals, Rehabilitation Potential, or Discharge Plans",,,,,
2300.NTE02,Description,A free-form description to clarify the related data elements and their content  /  Claim Note Text,R,,,,,,
Segment - CRC EPSDT Referral (Situational),,,,,,,,,
2300.CRC01,Code Category,Specifies the situation or category to which the code applies,R,"E1 : Spectacle Lenses
E2 : Contact Lenses
E3 : Spectacle Frames",,,,,
2300.CRC02,Yes/No Condition or Response Code,Certification Condition Indicator,R,"Y: Yes
N:NO",,,,,
2300.CRC03,Condition Indicator,Code indicating a condition,R,"L1 : General Standard of 20 Degree or .5 Diopter Sphere or Cylinder Change Met
L2 : Replacement Due to Loss or Theft L3 : Replacement Due to Breakage or Damage
L4 : Replacement Due to Patient Preference
 L5 : Replacement Due to Medical Reason",,,,,
2300.CRC04,Condition Indicator,Code indicating a condition,S,"AV Available - Not Used
652 Patient refused referral.
NU Not Used
653 This conditioner indicator must be used when the
submitter answers “N” in CRC02.
S2 Under Treatment
654 Patient is currently under treatment for referred
diagnostic or corrective health problem.
ST New Services Requested
655 Patient is referred to another provider for diagnostic
or corrective treatment for at least one health
problem identified during an initial or periodic
screening service (not including dental referrals).
OR
Patient is scheduled for another appointment with
screening provider for diagnostic or corrective
treatment for at least one health problem identified
during an initial or periodic screening service (not
including dental referrals).",,,,,
2300.CRC05,Condition Indicator,Code indicating a condition,S,"AV Available - Not Used
652 Patient refused referral.
NU Not Used
653 This conditioner indicator must be used when the
submitter answers “N” in CRC02.
S2 Under Treatment
654 Patient is currently under treatment for referred
diagnostic or corrective health problem.
ST New Services Requested
655 Patient is referred to another provider for diagnostic
or corrective treatment for at least one health
problem identified during an initial or periodic
screening service (not including dental referrals).
OR
Patient is scheduled for another appointment with
screening provider for diagnostic or corrective
treatment for at least one health problem identified
during an initial or periodic screening service (not
including dental referrals).",,,,,
Segment - HI Principal Diagnosis (Required),,,,,,,,,
2300.HI01.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"ABK : ICD10 -CM - Principal Diagnosis
BK : ICD9 -CM - Principal Diagnosis",,"Hardcode as ""ABK""",,,
2300.HI01.02,Industry Code,Diagnosis Code,R,,,,Primary_Diagnosis_Code,Claim Level,Place a dot (.) after 3rd character
2300.HI01.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,,,,Primary_Diagnosis_POAIndicator,Claim Level,
Segment - HI Admitting Diagnosis (Situational),,,,,,,,,
2300.HI01.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"ABJ -  International Classification of Diseases Clinical
Modification (ICD-10-CM) Admitting Diagnosis",,"Hardcode as ""ABJ""",,,
2300.HI01.02,Industry Code,Diagnosis Code,R,,,,Admit_Diagnosis_Code,Claim Level,Place a dot (.) after 3rd character
Segment - HI Patient Reason For Visit (Situational),,,,,,,,,
2300.HI01.01,Code List Qualifier Code,Code identifying a specific industry code list/ Principal Diagnosis Type Code,R,"APR - International Classification of Diseases Clinical
Modification (ICD-10-CM) Patient’s Reason for Visit
PR- International Classification of Diseases Clinical
Modification (ICD-9-CM) Patient’s Reason for Visit",,"Hardcode as ""APR""",,,
2300.HI01.02,Industry Code,Diagnosis Code,R,,,,PRV_Diagnosis_Code1,Claim Level,Place a dot (.) after 3rd character
2300.HI02.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"APR - International Classification of Diseases Clinical
Modification (ICD-10-CM) Patient’s Reason for Visit
PR- International Classification of Diseases Clinical
Modification (ICD-9-CM) Patient’s Reason for Visit",,"Hardcode as ""APR""",,,
2300.HI02.02,Industry Code,Diagnosis Code,R,,,,PRV_Diagnosis_Code2,Claim Level,Place a dot (.) after 3rd character
2300.HI03.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"APR - International Classification of Diseases Clinical
Modification (ICD-10-CM) Patient’s Reason for Visit
PR- International Classification of Diseases Clinical
Modification (ICD-9-CM) Patient’s Reason for Visit",,"Hardcode as ""APR""",,,
2300.HI03.02,Industry Code,Diagnosis Code,R,,,,PRV_Diagnosis_Code3,Claim Level,Place a dot (.) after 3rd character
Segment - HI External Cause of Injury (Situational),,,,,,,,,
2300.HI01.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"ABN : International Classification of Diseases Clinical
Modification (ICD-10-CM) External Cause of Injury
Code
BN : International Classification of Diseases Clinical
Modification (ICD-9-CM) External Cause of Injury
Code (E-codes)",,"Hardcode as ""ABN""",,,
2300.HI01.02,Industry Code,Diagnosis Code,R,,,,External_Diagnosis_Code1,Claim Level,Place a dot (.) after 3rd character
2300.HI01.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,,,,External_Diagnosis_POA1,Claim Level,
2300.HI02.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"ABN : International Classification of Diseases Clinical
Modification (ICD-10-CM) External Cause of Injury
Code
BN : International Classification of Diseases Clinical
Modification (ICD-9-CM) External Cause of Injury
Code (E-codes)",,"Hardcode as ""ABN""",,,
2300.HI02.02,Industry Code,Diagnosis Code,R,,,,External_Diagnosis_Code2,Claim Level,Place a dot (.) after 3rd character
2300.HI02.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,,,,External_Diagnosis_POA2,Claim Level,
2300.HI03.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"ABN : International Classification of Diseases Clinical
Modification (ICD-10-CM) External Cause of Injury
Code
BN : International Classification of Diseases Clinical
Modification (ICD-9-CM) External Cause of Injury
Code (E-codes)",,"Hardcode as ""ABN""",,,
2300.HI03.02,Industry Code,Diagnosis Code,R,,,,External_Diagnosis_Code3,Claim Level,Place a dot (.) after 3rd character
2300.HI03.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,,,,External_Diagnosis_POA3,Claim Level,
2300.HI04.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"ABN : International Classification of Diseases Clinical
Modification (ICD-10-CM) External Cause of Injury
Code
BN : International Classification of Diseases Clinical
Modification (ICD-9-CM) External Cause of Injury
Code (E-codes)",,"Hardcode as ""ABN""",,,
2300.HI04.02,Industry Code,Diagnosis Code,R,,,,External_Diagnosis_Code4,Claim Level,Place a dot (.) after 3rd character
2300.HI04.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,,,,External_Diagnosis_POA4,Claim Level,
2300.HI05.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"ABN : International Classification of Diseases Clinical
Modification (ICD-10-CM) External Cause of Injury
Code
BN : International Classification of Diseases Clinical
Modification (ICD-9-CM) External Cause of Injury
Code (E-codes)",,"Hardcode as ""ABN""",,,
2300.HI05.02,Industry Code,Diagnosis Code,R,,,,External_Diagnosis_Code5,Claim Level,Place a dot (.) after 3rd character
2300.HI05.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,,,,External_Diagnosis_POA5,Claim Level,
2300.HI06.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"ABN : International Classification of Diseases Clinical
Modification (ICD-10-CM) External Cause of Injury
Code
BN : International Classification of Diseases Clinical
Modification (ICD-9-CM) External Cause of Injury
Code (E-codes)",,"Hardcode as ""ABN""",,,
2300.HI06.02,Industry Code,Diagnosis Code,R,,,,External_Diagnosis_Code6,Claim Level,Place a dot (.) after 3rd character
2300.HI06.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,,,,External_Diagnosis_POA6,Claim Level,
2300.HI07.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"ABN : International Classification of Diseases Clinical
Modification (ICD-10-CM) External Cause of Injury
Code
BN : International Classification of Diseases Clinical
Modification (ICD-9-CM) External Cause of Injury
Code (E-codes)",,"Hardcode as ""ABN""",,,
2300.HI07.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI07.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,,,,,,
2300.HI08.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"ABN : International Classification of Diseases Clinical
Modification (ICD-10-CM) External Cause of Injury
Code
BN : International Classification of Diseases Clinical
Modification (ICD-9-CM) External Cause of Injury
Code (E-codes)",,"Hardcode as ""ABN""",,,
2300.HI08.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI08.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,,,,,,
2300.HI09.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"ABN : International Classification of Diseases Clinical
Modification (ICD-10-CM) External Cause of Injury
Code
BN : International Classification of Diseases Clinical
Modification (ICD-9-CM) External Cause of Injury
Code (E-codes)",,"Hardcode as ""ABN""",,,
2300.HI09.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI09.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,,,,,,
2300.HI10.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"ABN : International Classification of Diseases Clinical
Modification (ICD-10-CM) External Cause of Injury
Code
BN : International Classification of Diseases Clinical
Modification (ICD-9-CM) External Cause of Injury
Code (E-codes)",,"Hardcode as ""ABN""",,,
2300.HI10.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI10.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,,,,,,
2300.HI11.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"ABN : International Classification of Diseases Clinical
Modification (ICD-10-CM) External Cause of Injury
Code
BN : International Classification of Diseases Clinical
Modification (ICD-9-CM) External Cause of Injury
Code (E-codes)",,"Hardcode as ""ABN""",,,
2300.HI11.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI11.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,,,,,,
2300.HI12.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"ABN : International Classification of Diseases Clinical
Modification (ICD-10-CM) External Cause of Injury
Code
BN : International Classification of Diseases Clinical
Modification (ICD-9-CM) External Cause of Injury
Code (E-codes)",,"Hardcode as ""ABN""",,,
2300.HI12.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI12.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,,,,,,
Segment - HI Diagnosis Related Group (DRG) Information (Situational),,,,,,,,,
2300.HI01.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,DR Diagnosis Related Group (DRG),,"Hardcode as ""DR""",,,
2300.HI01.02,Industry Code,Diagnosis Code,R,,,,DRG_Code,Claim Level,
Segment - HI Other Diagnosis Information (Situational),,,,,,,,,
2300.HI01.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis,,"Hardcode as ""ABF""",,,
2300.HI01.02,Industry Code,Diagnosis Code,R,,,,Other_Diagnosis_Code1,Claim Level,Place a dot (.) after 3rd character
2300.HI01.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,,,,Other_Diagnosis_POA1,Claim Level,
2300.HI02.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis,,"Hardcode as ""ABF""",,,
2300.HI02.02,Industry Code,Diagnosis Code,R,,,,Other_Diagnosis_Code2,Claim Level,Place a dot (.) after 3rd character
2300.HI02.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,,,,Other_Diagnosis_POA2,Claim Level,
2300.HI03.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis,,"Hardcode as ""ABF""",,,
2300.HI03.02,Industry Code,Diagnosis Code,R,,,,Other_Diagnosis_Code3,Claim Level,Place a dot (.) after 3rd character
2300.HI03.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,,,,Other_Diagnosis_POA3,Claim Level,
2300.HI04.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis,,"Hardcode as ""ABF""",,,
2300.HI04.02,Industry Code,Diagnosis Code,R,,,,Other_Diagnosis_Code4,Claim Level,Place a dot (.) after 3rd character
2300.HI04.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,,,,Other_Diagnosis_POA4,Claim Level,
2300.HI05.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis,,"Hardcode as ""ABF""",,,
2300.HI05.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI05.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,,,,,,
2300.HI06.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis,,"Hardcode as ""ABF""",,,
2300.HI06.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI06.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,,,,,,
2300.HI07.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis,,"Hardcode as ""ABF""",,,
2300.HI07.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI07.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,,,,,,
2300.HI08.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis,,"Hardcode as ""ABF""",,,
2300.HI08.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI08.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,,,,,,
2300.HI09.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis,,"Hardcode as ""ABF""",,,
2300.HI09.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI09.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,,,,,,
2300.HI10.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis,,"Hardcode as ""ABF""",,,
2300.HI10.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI10.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,,,,,,
2300.HI11.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis,,"Hardcode as ""ABF""",,,
2300.HI11.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI11.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,,,,,,
2300.HI12.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis,,"Hardcode as ""ABF""",,,
2300.HI12.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI12.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,,,,,,
Segment - HI Principal Procedure Information (Situational),,,,,,,,,
2300.HI01.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"BBR International Classification of Diseases Clinical
Modification (ICD-10-PCS) Principal Procedure
Codes",,"Hardcode as ""BBR""",,,
2300.HI01.02,Industry Code,Diagnosis Code,R,,,,Priniciple_Procedure_Code,Claim Level,
2300.HI01.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,,"Hardcode as ""D8""",,,
2300.HI01.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,Priniciple_Procedure_Date,Claim Level,Format - YYYY-MM-DD
Segment - HI Other Procedure Information (Situational),,,,,,,,,
2300.HI01.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"BBQ International Classification of Diseases Clinical
Modification (ICD-10-PCS) Other Procedure Codes",,"Hardcode as ""BBQ""",,,
2300.HI01.02,Industry Code,Diagnosis Code,R,,,,Other_Proedurecode1,Claim Level,
2300.HI01.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,,"Hardcode as ""D8""",,,
2300.HI01.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,Other_Proeduredate1,Claim Level,Format - YYYY-MM-DD
2300.HI02.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"BBQ International Classification of Diseases Clinical
Modification (ICD-10-PCS) Other Procedure Codes",,"Hardcode as ""BBQ""",,,
2300.HI02.02,Industry Code,Diagnosis Code,R,,,,Other_Proedurecode2,Claim Level,
2300.HI02.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,,"Hardcode as ""D8""",,,
2300.HI02.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,Other_Proeduredate2,Claim Level,Format - YYYY-MM-DD
2300.HI03.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"BBQ International Classification of Diseases Clinical
Modification (ICD-10-PCS) Other Procedure Codes",,"Hardcode as ""BBQ""",,,
2300.HI03.02,Industry Code,Diagnosis Code,R,,,,Other_Proedurecode3,Claim Level,
2300.HI03.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,,"Hardcode as ""D8""",,,
2300.HI03.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,Other_Proeduredate3,Claim Level,Format - YYYY-MM-DD
2300.HI04.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"BBQ International Classification of Diseases Clinical
Modification (ICD-10-PCS) Other Procedure Codes",,"Hardcode as ""BBQ""",,,
2300.HI04.02,Industry Code,Diagnosis Code,R,,,,Other_Proedurecode4,Claim Level,
2300.HI04.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,,"Hardcode as ""D8""",,,
2300.HI04.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,Other_Proeduredate4,Claim Level,Format - YYYY-MM-DD
2300.HI05.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"BBQ International Classification of Diseases Clinical
Modification (ICD-10-PCS) Other Procedure Codes",,"Hardcode as ""BBQ""",,,
2300.HI05.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI05.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,,"Hardcode as ""D8""",,,
2300.HI05.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,,
2300.HI06.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"BBQ International Classification of Diseases Clinical
Modification (ICD-10-PCS) Other Procedure Codes",,"Hardcode as ""BBQ""",,,
2300.HI06.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI06.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,,"Hardcode as ""D8""",,,
2300.HI06.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,,
2300.HI07.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"BBQ International Classification of Diseases Clinical
Modification (ICD-10-PCS) Other Procedure Codes",,"Hardcode as ""BBQ""",,,
2300.HI07.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI07.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,,"Hardcode as ""D8""",,,
2300.HI07.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,,
2300.HI08.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"BBQ International Classification of Diseases Clinical
Modification (ICD-10-PCS) Other Procedure Codes",,"Hardcode as ""BBQ""",,,
2300.HI08.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI08.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,,"Hardcode as ""D8""",,,
2300.HI08.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,,
2300.HI09.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"BBQ International Classification of Diseases Clinical
Modification (ICD-10-PCS) Other Procedure Codes",,"Hardcode as ""BBQ""",,,
2300.HI09.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI09.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,,"Hardcode as ""D8""",,,
2300.HI09.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,,
2300.HI10.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"BBQ International Classification of Diseases Clinical
Modification (ICD-10-PCS) Other Procedure Codes",,"Hardcode as ""BBQ""",,,
2300.HI10.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI10.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,,"Hardcode as ""D8""",,,
2300.HI10.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,,
2300.HI11.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"BBQ International Classification of Diseases Clinical
Modification (ICD-10-PCS) Other Procedure Codes",,"Hardcode as ""BBQ""",,,
2300.HI11.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI11.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,,"Hardcode as ""D8""",,,
2300.HI11.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,,
2300.HI12.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"BBQ International Classification of Diseases Clinical
Modification (ICD-10-PCS) Other Procedure Codes",,"Hardcode as ""BBQ""",,,
2300.HI12.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI12.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,,"Hardcode as ""D8""",,,
2300.HI12.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,,
Segment - HI Occurrence Span Information (Situational),,,,,,,,,
2300.HI01.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BI - Occurrence Span,,"Hardcode as ""BI""",,,
2300.HI01.02,Industry Code,Diagnosis Code,R,,,,Occurrencespan_code1,Claim Level,
2300.HI01.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8-Range of Dates Expressed in Format CCYYMMDDCCYYMMDD,,"Hardcode as ""RD8""",,,
2300.HI01.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,"Occurrencespan_Startdate1,Occurrencespan_Enddate1",Claim Level,Format - YYYY-MM-DD
2300.HI02.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BI - Occurrence Span,,"Hardcode as ""BI""",,,
2300.HI02.02,Industry Code,Diagnosis Code,R,,,,Occurrencespan_code2,Claim Level,
2300.HI02.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8-Range of Dates Expressed in Format CCYYMMDDCCYYMMDD,,"Hardcode as ""RD8""",,,
2300.HI02.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,"Occurrencespan_Startdate2,Occurrencespan_Enddate2",Claim Level,Format - YYYY-MM-DD
2300.HI03.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BI - Occurrence Span,,"Hardcode as ""BI""",,,
2300.HI03.02,Industry Code,Diagnosis Code,R,,,,Occurrencespan_code3,Claim Level,
2300.HI03.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8-Range of Dates Expressed in Format CCYYMMDDCCYYMMDD,,"Hardcode as ""RD8""",,,
2300.HI03.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,"Occurrencespan_Startdate3,Occurrencespan_Enddate3",Claim Level,Format - YYYY-MM-DD
2300.HI04.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BI - Occurrence Span,,"Hardcode as ""BI""",,,
2300.HI04.02,Industry Code,Diagnosis Code,R,,,,Occurrencespan_code4,Claim Level,
2300.HI04.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8-Range of Dates Expressed in Format CCYYMMDDCCYYMMDD,,"Hardcode as ""RD8""",,,
2300.HI04.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,"Occurrencespan_Startdate4,Occurrencespan_Enddate4",Claim Level,Format - YYYY-MM-DD
2300.HI05.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BI - Occurrence Span,,"Hardcode as ""BI""",,,
2300.HI05.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI05.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8-Range of Dates Expressed in Format CCYYMMDDCCYYMMDD,,"Hardcode as ""RD8""",,,
2300.HI05.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,,
2300.HI06.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BI - Occurrence Span,,"Hardcode as ""BI""",,,
2300.HI06.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI06.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8-Range of Dates Expressed in Format CCYYMMDDCCYYMMDD,,"Hardcode as ""RD8""",,,
2300.HI06.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,,
2300.HI07.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BI - Occurrence Span,,"Hardcode as ""BI""",,,
2300.HI07.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI07.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8-Range of Dates Expressed in Format CCYYMMDDCCYYMMDD,,"Hardcode as ""RD8""",,,
2300.HI07.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,,
2300.HI08.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BI - Occurrence Span,,"Hardcode as ""BI""",,,
2300.HI08.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI08.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8-Range of Dates Expressed in Format CCYYMMDDCCYYMMDD,,"Hardcode as ""RD8""",,,
2300.HI08.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,,
2300.HI09.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BI - Occurrence Span,,"Hardcode as ""BI""",,,
2300.HI09.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI09.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8-Range of Dates Expressed in Format CCYYMMDDCCYYMMDD,,"Hardcode as ""RD8""",,,
2300.HI09.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,,
2300.HI10.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BI - Occurrence Span,,"Hardcode as ""BI""",,,
2300.HI10.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI10.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8-Range of Dates Expressed in Format CCYYMMDDCCYYMMDD,,"Hardcode as ""RD8""",,,
2300.HI10.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,,
2300.HI11.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BI - Occurrence Span,,"Hardcode as ""BI""",,,
2300.HI11.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI11.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8-Range of Dates Expressed in Format CCYYMMDDCCYYMMDD,,"Hardcode as ""RD8""",,,
2300.HI11.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,,
2300.HI12.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BI - Occurrence Span,,"Hardcode as ""BI""",,,
2300.HI12.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI12.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8-Range of Dates Expressed in Format CCYYMMDDCCYYMMDD,,"Hardcode as ""RD8""",,,
2300.HI12.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,,
Segment - HI Occurrence Information (Situational),,,,,,,,,
2300.HI01.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BH - Occurrence,,"Hardcode as ""BH""",,,
2300.HI01.02,Industry Code,Diagnosis Code,R,,,,Eventoccurence_Code1,Claim Level,
2300.HI01.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 - Date Expressed in Format CCYYMMDD,,"Hardcode as ""D8""",,,
2300.HI01.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,Eventoccurence_Date1,Claim Level,Format - YYYY-MM-DD
2300.HI02.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BH - Occurrence,,"Hardcode as ""BH""",,,
2300.HI02.02,Industry Code,Diagnosis Code,R,,,,Eventoccurence_Code2,Claim Level,
2300.HI02.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 - Date Expressed in Format CCYYMMDD,,"Hardcode as ""D8""",,,
2300.HI02.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,Eventoccurence_Date2,Claim Level,Format - YYYY-MM-DD
2300.HI03.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BH - Occurrence,,"Hardcode as ""BH""",,,
2300.HI03.02,Industry Code,Diagnosis Code,R,,,,Eventoccurence_Code3,Claim Level,
2300.HI03.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 - Date Expressed in Format CCYYMMDD,,"Hardcode as ""D8""",,,
2300.HI03.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,Eventoccurence_Date3,Claim Level,Format - YYYY-MM-DD
2300.HI04.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BH - Occurrence,,"Hardcode as ""BH""",,,
2300.HI04.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI04.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 - Date Expressed in Format CCYYMMDD,,"Hardcode as ""D8""",,,
2300.HI04.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,,
2300.HI05.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BH - Occurrence,,"Hardcode as ""BH""",,,
2300.HI05.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI05.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 - Date Expressed in Format CCYYMMDD,,"Hardcode as ""D8""",,,
2300.HI05.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,,
2300.HI06.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BH - Occurrence,,"Hardcode as ""BH""",,,
2300.HI06.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI06.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 - Date Expressed in Format CCYYMMDD,,"Hardcode as ""D8""",,,
2300.HI06.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,,
2300.HI07.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BH - Occurrence,,"Hardcode as ""BH""",,,
2300.HI07.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI07.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 - Date Expressed in Format CCYYMMDD,,"Hardcode as ""D8""",,,
2300.HI07.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,,
2300.HI08.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BH - Occurrence,,"Hardcode as ""BH""",,,
2300.HI08.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI08.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 - Date Expressed in Format CCYYMMDD,,"Hardcode as ""D8""",,,
2300.HI08.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,,
2300.HI09.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BH - Occurrence,,"Hardcode as ""BH""",,,
2300.HI09.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI09.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 - Date Expressed in Format CCYYMMDD,,"Hardcode as ""D8""",,,
2300.HI09.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,,
2300.HI10.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BH - Occurrence,,"Hardcode as ""BH""",,,
2300.HI10.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI10.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 - Date Expressed in Format CCYYMMDD,,"Hardcode as ""D8""",,,
2300.HI10.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,,
2300.HI11.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BH - Occurrence,,"Hardcode as ""BH""",,,
2300.HI11.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI11.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 - Date Expressed in Format CCYYMMDD,,"Hardcode as ""D8""",,,
2300.HI11.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,,
2300.HI12.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BH - Occurrence,,"Hardcode as ""BH""",,,
2300.HI12.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI12.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 - Date Expressed in Format CCYYMMDD,,"Hardcode as ""D8""",,,
2300.HI12.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,,
Segment - HI Value Information (Situational),,,,,,,,,
2300.HI01.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BE -Value,,"Hardcode as ""BE""",,,
2300.HI01.02,Industry Code,Diagnosis Code,R,,,,Value_Code1,Claim Level,
2300.HI01.05,Monetary Amount,Monetary Amount,R,,,,Value_Code_Amount1,Claim Level,
2300.HI02.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BE -Value,,"Hardcode as ""BE""",,,
2300.HI02.02,Industry Code,Diagnosis Code,R,,,,Value_Code2,Claim Level,
2300.HI02.05,Monetary Amount,Monetary Amount,R,,,,Value_Code_Amount2,Claim Level,
2300.HI03.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BE -Value,,"Hardcode as ""BE""",,,
2300.HI03.02,Industry Code,Diagnosis Code,R,,,,Value_Code3,Claim Level,
2300.HI03.05,Monetary Amount,Monetary Amount,R,,,,Value_Code_Amount3,Claim Level,
2300.HI04.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BE -Value,,"Hardcode as ""BE""",,,
2300.HI04.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI04.05,Monetary Amount,Monetary Amount,R,,,,,,
2300.HI05.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BE -Value,,"Hardcode as ""BE""",,,
2300.HI05.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI05.05,Monetary Amount,Monetary Amount,R,,,,,,
2300.HI06.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BE -Value,,"Hardcode as ""BE""",,,
2300.HI06.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI06.05,Monetary Amount,Monetary Amount,R,,,,,,
2300.HI07.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BE -Value,,"Hardcode as ""BE""",,,
2300.HI07.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI07.05,Monetary Amount,Monetary Amount,R,,,,,,
2300.HI08.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BE -Value,,"Hardcode as ""BE""",,,
2300.HI08.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI08.05,Monetary Amount,Monetary Amount,R,,,,,,
2300.HI09.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BE -Value,,"Hardcode as ""BE""",,,
2300.HI09.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI09.05,Monetary Amount,Monetary Amount,R,,,,,,
2300.HI10.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BE -Value,,"Hardcode as ""BE""",,,
2300.HI10.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI10.05,Monetary Amount,Monetary Amount,R,,,,,,
2300.HI11.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BE -Value,,"Hardcode as ""BE""",,,
2300.HI11.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI11.05,Monetary Amount,Monetary Amount,R,,,,,,
2300.HI12.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BE -Value,,"Hardcode as ""BE""",,,
2300.HI12.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI12.05,Monetary Amount,Monetary Amount,R,,,,,,
Segment - HI Condition Information (Situational),,,,,,,,,
2300.HI01.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BG - Condition,,"Hardcode as ""BG""",,,
2300.HI01.02,Industry Code,Diagnosis Code,R,,,,Condition_Code1,Claim Level,
2300.HI02.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BG - Condition,,"Hardcode as ""BG""",,,
2300.HI02.02,Industry Code,Diagnosis Code,R,,,,Condition_Code2,Claim Level,
2300.HI03.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BG - Condition,,"Hardcode as ""BG""",,,
2300.HI03.02,Industry Code,Diagnosis Code,R,,,,Condition_Code3,Claim Level,
2300.HI04.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BG - Condition,,"Hardcode as ""BG""",,,
2300.HI04.02,Industry Code,Diagnosis Code,R,,,,Condition_Code4,Claim Level,
2300.HI05.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BG - Condition,,"Hardcode as ""BG""",,,
2300.HI05.02,Industry Code,Diagnosis Code,R,,,,Condition_Code5,Claim Level,
2300.HI06.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BG - Condition,,"Hardcode as ""BG""",,,
2300.HI06.02,Industry Code,Diagnosis Code,R,,,,Condition_Code6,Claim Level,
2300.HI07.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BG - Condition,,"Hardcode as ""BG""",,,
2300.HI07.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI08.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BG - Condition,,"Hardcode as ""BG""",,,
2300.HI08.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI09.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BG - Condition,,"Hardcode as ""BG""",,,
2300.HI09.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI10.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BG - Condition,,"Hardcode as ""BG""",,,
2300.HI10.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI11.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BG - Condition,,"Hardcode as ""BG""",,,
2300.HI11.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI12.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BG - Condition,,"Hardcode as ""BG""",,,
2300.HI12.02,Industry Code,Diagnosis Code,R,,,,,,
Segment - HI Treatment Code Information (Situational),,,,,,,,,
2300.HI01.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,TC -Treatment Codes,,,,,
2300.HI01.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI02.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,TC -Treatment Codes,,,,,
2300.HI02.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI03.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,TC -Treatment Codes,,,,,
2300.HI03.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI04.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,TC -Treatment Codes,,,,,
2300.HI04.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI05.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,TC -Treatment Codes,,,,,
2300.HI05.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI06.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,TC -Treatment Codes,,,,,
2300.HI06.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI07.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,TC -Treatment Codes,,,,,
2300.HI07.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI08.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,TC -Treatment Codes,,,,,
2300.HI08.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI09.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,TC -Treatment Codes,,,,,
2300.HI09.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI10.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,TC -Treatment Codes,,,,,
2300.HI10.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI11.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,TC -Treatment Codes,,,,,
2300.HI11.02,Industry Code,Diagnosis Code,R,,,,,,
2300.HI12.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,TC -Treatment Codes,,,,,
2300.HI12.02,Industry Code,Diagnosis Code,R,,,,,,
Segment - HCP Claim Pricing/Repricing Information (Situational),,,,,,,,,
2300.HCP01,Pricing Methodology,Code specifying pricing methodology at which the claim or line item has been priced or repriced,R,"00 Zero Pricing (Not Covered Under Contract)
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
14 Adjustment Pricin",,,,,
2300.HCP02,Monetary Amount,Monetary amount,R,,,,,,
2300.HCP03,Monetary Amount,Monetary amount,S,,,,,,
2300.HCP04,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",S,,,,,,
2300.HCP05,Rate,Rate,S,,,,,,
2300.HCP06,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",S,,,,,,
2300.HCP07,Monetary Amount,Monetary Amount,S,,,,,,
2300.HCP08,Product/Service ID,Identifying number for a product or service,S,,,,,,
2300.HCP09,Product/Service ID Qualifier,"Code identifying the type/source of the descriptive number used in
Product/Service ID (234",S,"ER :Jurisdiction Specific Procedure and Supply Codes
HC: Health Care Financing Administration Common
Procedural Coding System (HCPCS) Codes
HP Health Insurance Prospective Payment System
(HIPPS) Skilled Nursing Facility Rate Code
HP: Health Insurance Prospective Payment System
(HIPPS) Skilled Nursing Facility Rate Code
IV: Home Infusion EDI Coalition (HIEC) Product/Service
Code
WK Advanced Billing Concepts (ABC) Codes",,,,,
2300.HCP11,Unit or Basis for Measurement Code,"Code specifying the units in which a value is being expressed, or manner in which
a measurement has been taken",S,,,,,,
2300.HCP12,Quantity,Numeric value of quantity,S,,,,,,
2300.HCP13,Reject Reason Code,Code assigned by issuer to identify reason for rejection,S,"T1 Cannot Identify Provider as TPO (Third Party
Organization) Participant
T2 Cannot Identify Payer as TPO (Third Party
Organization) Participant
T3 Cannot Identify Insured as TPO (Third Party
Organization) Participant
T4 Payer Name or Identifier Missing
T5 Certification Information Missing
T6 Claim does not contain enough information for repricing",,,,,
2300.HCP14,Policy Compliance Code,Code specifying policy compliance,S,"1 Procedure Followed (Compliance)
2 Not Followed - Call Not Made (Non-Compliance Call
Not Made)
3 Not Medically Necessary (Non-Compliance NonMedically Necessary)
4 Not Followed Other (Non-Compliance Other)
5 Emergency Admit to Non-Network Hospital",,,,,
2300.HCP15,Exception Code,"Code specifying the exception reason for consideration of out-of-network health
care services",S,"1 Non-Network Professional Provider in Network
Hospital
2 Emergency Care
3 Services or Specialist not in Network
4 Out-of-Service Area
5 State Mandates
6 Other",,,,,
Loop 2310A (Situational),,,,,,,,,
Segment - NM1 Attending Provider Name (Situational),,,,,,,,,
2310A.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,71 Attending Physician,,"Hardcode as ""71""",,,
2310A.NM102,Entity Type Qualifier,"Code identifying an organizational entity, a physical location, property or an
individual",R,1 Person,,"Hardcode as ""1""",,,
2310A.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,,Attending_practitioner_LastName,Claim Level,
2310A.NM104,Name First,Individual first name,S,,,,Attending_Practitioner_FirstName,Claim Level,
,,,,,,,Attending_Practitioner_FullName,Claim Level,concatenate NM104/5/3/7 (First Middle Last Suffix)
2310A.NM105,Name Middle,Individual middle name or initial,S,,,,,,
2310A.NM107,Name Suffix,Suffix to individual name,S,,,,,,
2310A.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code",S,"XX Centers for Medicare and Medicaid Services
National Provider Identifier",,"Hardcode as ""XX""",,,
2310A.NM109,Identification Code,Code identifying a party or other code /Rendering Provider Identifier,S,1851470140,,,Attending_practitioner_Npi,Claim Level,
Segment - PRV Provider Information (Situational),,,,,,,,,
2310A.PRV01,Provider Code,Code identifying the type of provider,R,AT  : Attending,,,,,
2310A.PRV02,Reference Identification Qualifier,Code qualifying the Reference Identification,R,PXC :Health Care Provider Taxonomy Code,,,,,
2310A.PRV03,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,207Q00000X,,,,,
Segment - REF Attending Provider Secondary Identification (Situational),,,,,,,,,
2310A.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B : State License Number
1G : Provider UPIN Number
1555 UPINs must be formatted as either X99999 or
XXX999.
G2 : Provider Commercial Number
LU: Location Numbe",,,Attending_Practitioner_Id_Qualifier,Claim Level,
2310A.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,0121T3B0B,,,Attending_Practitioner_Id,Claim Level,
Loop 2310B (Situational),,,,,,,,,
Segment - NM1 Operating Physician Name (Situational),,,,,,,,,
2310B.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,72 - Operating Physician,,"Hardcode as ""72""",,,
2310B.NM102,Entity Type Qualifier,"Code identifying an organizational entity, a physical location, property or an
individual",R,1 - Person,,"Hardcode as ""1""",,,
2310B.NM103,Name Last or Organization Name,Individual last name or organizational name,R,Individual last name or organizational name,,,Operating_practitioner_LastName,Claim Level,
2310B.NM104,Name First,Individual first name,S,Individual first name,,,Operating_Practitioner_FirstName,Claim Level,
2310B.NM105,Name Middle,Individual middle name or initial,S,Individual middle name or initial,,,,,
2310B.NM107,Name Suffix,Suffix to individual name,S,Suffix to individual name,,,,,
2310B.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code",S,"XX Centers for Medicare and Medicaid Services
National Provider Identifier",,"Hardcode as ""XX""",,,
2310B.NM109,Identification Code,Code identifying a party or other code /Rendering Provider Identifier,S,,,,Operating_practitioner_Npi,Claim Level,
Segment - REF Operating Physician Secondary Identification (Situational),,,,,,,,,
2310B.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,,,,Operating_Practitioner_Id_Qualifier,Claim Level,
2310B.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,Operating_Practitioner_Id,Claim Level,
Loop 2310C (Situational),,,,,,,,,
Segment - NM1 Other Operating Physician Name (Situational),,,,,,,,,
2310C.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,ZZ : Mutually Defined,,"Hardcode as ""ZZ""",,,
2310C.NM102,Entity Type Qualifier,"Code identifying an organizational entity, a physical location, property or an
individual",R,1 :  Person,,"Hardcode as ""1""",,,
2310C.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,,Other_practitioner_LastName,Claim Level,
2310C.NM104,Name First,Individual first name,S,,,,Other_Practitioner_FirstName,Claim Level,
2310C.NM105,Name Middle,Individual middle name or initial,S,,,,,,
2310C.NM107,Name Suffix,Suffix to individual name,S,,,,,,
2310C.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code",S,"XX Centers for Medicare and Medicaid Services
National Provider Identifier",,"Hardcode as ""XX""",,,
2310C.NM109,Identification Code,Code identifying a party or other code /Rendering Provider Identifier,S,,,,Other_practitioner_Npi,Claim Level,
Segment - REF Other Operating Physician Secondary Identification (Situational),,,,,,,,,
2310C.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B : State License Number
1G : Provider UPIN Number
1555 UPINs must be formatted as either X99999 or
XXX999.
G2 :Provider Commercial Number
1464: This code designates a proprietary provider number
for the destination payer identified in the Payer
Name loop, Loop ID-2010BB, associated with this
claim. This is to be used by all payers including:
Medicare, Medicaid, Blue Cross, etc.
LU : Location Numbe",,,Other_Practitioner_Id_Qualifier,Claim Level,
2310C.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,Other_Practitioner_Id,Claim Level,
Loop 2310D (Situational),,,,,,,,,
Segment - NM1 Rendering Provider Name (Situational),,,,,,,,,
2310D.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,82 :Rendering Provider,,,,,
2310D.NM102,Entity Type Qualifier,"Code identifying an organizational entity, a physical location, property or an
individual",R,1 : Person,,,,,
2310D.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,,,,
2310D.NM104,Name First,Individual first name,S,,,,,,
2310D.NM105,Name Middle,Individual middle name or initial,S,,,,,,
2310D.NM107,Name Suffix,Suffix to individual name,S,,,,,,
2310D.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code",S,"XX Centers for Medicare and Medicaid Services
National Provider Identifier",,,,,
2310D.NM109,Identification Code,Code identifying a party or other code /Rendering Provider Identifier,S,,,,,,
Segment - REF Rendering Provider Secondary Identification (Situational),,,,,,,,,
2310D.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B :  State License Number
1G :  Provider UPIN Number
1555 UPINs must be formatted as either X99999 or
XXX999.
G2 :  Provider Commercial Number
1464 :  This code designates a proprietary provider number
for the destination payer identified in the Payer
Name loop, Loop ID-2010BB, associated with this
claim. This is to be used by all payers including:
Medicare, Medicaid, Blue Cross, etc.
LU : Location Number",,,,,
2310D.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,,
Loop 2310E (Situational),,,,,,,,,
Segment - NM1 Service Facility Location Name (Situational),,,,,,,,,
2310E.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,77 : Service Location,,,,,
2310E.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,2 :  Non-Person Entity,,,,,
2310E.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,,,,
2310E.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code (67)",S,"XX Centers for Medicare and Medicaid Services
National Provider Identifier",,,,,
2310E.NM109,Identification Code,Code identifying a party or other code,S,,,,,,
Segment - N3 Service Facility Location Address (Required),,,,,,,,,
2310E.N301,Address Information,Address Information,R,,,,,,
2310E.N302,Address Information,Address Information,S,,,,,,
"Segment - N4 Service Facility Location City, State, ZIP Code (Required)",,,,,,,,,
2310E.N401,City Name,Free-form text for city name,R,,,,,,
2310E.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,,,,
2310E.N403,Postal Code,"Code defining international postal zone code excluding punctuation and blanks
(zip code for United States)",S,,,,,,
2310E.N404,Country Code,Code identifying the country,S,,,,,,
2310E.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,
Segment - REF Service Facility Location Secondary Identification (Situational),,,,,,,,,
2310E.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B : State License Number
G2 :  Provider Commercial Number
1464 :  This code designates a proprietary provider number
for the destination payer identified in the Payer
Name loop, Loop ID-2010BB, associated with this
claim. This is to be used by all payers including:
Medicare, Medicaid, Blue Cross, etc.
LU :  Location Number",,,,,
2310E.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,,
Loop 2310F (Situational),,,,,,,,,
Segment - NM1 Referring Provider Name (Situational),,,,,,,,,
2310F.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,DN : Referring Provider,,,,,
2310F.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,1 Person,,,,,
2310F.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,,,,
2310F.NM104,Name First,Individual first name,S,,,,,,
2310F.NM105,Name Middle,Individual middle name or initial,S,,,,,,
2310F.NM107,Name Suffix,Suffix to individual name,S,,,,,,
2310F.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code (67)",S,"XX Centers for Medicare and Medicaid Services
National Provider Identifier",,,,,
2310F.NM109,Identification Code,Code identifying a party or other code,S,,,,,,
Segment - REF Referring Provider Secondary Identification (Situational),,,,,,,,,
2310F.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,,,,,,
2310F.REF02,Reference Identification,,R,,,,,,
Loop 2320 (Situational),,,,,,,,,
Segment - SBR Other Subscriber Information (Situational),,,,,,,,,
2320.SBR01,Payer Responsibility Sequence Number Code,"Code identifying the insurance carrier’s level of responsibility for a payment of a
claim",R,"A Payer Responsibility Four
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
U Unknown",,,,,
2320.SBR02,Individual Relationship Code,Code indicating the relationship between two individuals or entities,R,"01 Spouse
18 Self
19 Child
20 Employee
21 Unknown
39 Organ Donor
40 Cadaver Donor
53 Life Partner
G8 Other Relationship",18,,,,
2320.SBR03,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier/Insured Group or Policy Number",S,,,,,,
2320.SBR04,Name,Free-form name,S,,,,,,
2320.SBR09,Claim Filing Indicator Code,Code identifying type of claim,S,"MA Medicare Part A
MB Medicare Part B
MC Medicaid
OF Other Federal Program",,,,,
Segment - CAS Claim Level Adjustments (Situational),,,,,,,,,
2320.CAS01,Claim Adjustment Group Code,Code identifying the general category of payment adjustment,R,"CO : Contractual Obligations
CR : Correction and Reversals
OA : Other adjustments
PI : Payor Initiated Reductions
PR : Patient Responsibility",,,,,
2320.CAS02,Claim Adjustment Reason Code,Code identifying the detailed reason the adjustment was made,R,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
2320.CAS03,Monetary Amount,Monetary Amount,R,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
2320.CAS04,Quantity,Numeric value of quantity,S,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
2320.CAS05,Claim Adjustment Reason Code,Code identifying the detailed reason the adjustment was made,R,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
2320.CAS06,Monetary Amount,Monetary Amount,R,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
2320.CAS07,Quantity,Numeric value of quantity,S,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
2320.CAS08,Claim Adjustment Reason Code,Code identifying the detailed reason the adjustment was made,R,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
2320.CAS09,Monetary Amount,Monetary Amount,R,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
2320.CAS10,Quantity,Numeric value of quantity,S,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
2320.CAS11,Claim Adjustment Reason Code,Code identifying the detailed reason the adjustment was made,R,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
2320.CAS12,Monetary Amount,Monetary Amount,R,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
2320.CAS13,Quantity,Numeric value of quantity,S,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
2320.CAS14,Claim Adjustment Reason Code,Code identifying the detailed reason the adjustment was made,R,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
2320.CAS15,Monetary Amount,Monetary Amount,R,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
2320.CAS16,Quantity,Numeric value of quantity,S,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
2320.CAS17,Claim Adjustment Reason Code,Code identifying the detailed reason the adjustment was made,R,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
2320.CAS18,Monetary Amount,Monetary Amount,R,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
2320.CAS19,Quantity,Numeric value of quantity,S,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
Segment - AMT Coordination of Benefits (COB) Payer Paid Amount (Situational),,,,,,,,,
2320.AMT01,Amount Qualifier Code,Code to qualify amount,R,D : Payor Amount Paid,,,,,
2320.AMT02,Monetary Amount,Monetary amount,R,,,,,,
Segment - AMT Remaining Patient Liability (Situational),,,,,,,,,
2320.AMT01,Amount Qualifier Code,Code to qualify amount,R,EAF Amount Owed,,,,,
2320.AMT02,Monetary Amount,Monetary amount,R,,,,,,
Segment - AMT Coordination of Benefits (COB) Total Non-covered Amount (Situational),,,,,,,,,
2320.AMT01,Amount Qualifier Code,Code to qualify amount,R,A8 : Noncovered Charges - Actual,,,,,
2320.AMT02,Monetary Amount,Monetary amount,R,,,,,,
Segment - OI Other Insurance Coverage Information (Required),,,,,,,,,
2320.OI03,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,R,"N : No
W : Not Applicable
1563 Use code ‘W’ when the patient refuses to assign
benefits.
Y :  Yes",,,,,
2320.OI06,Release of Information Code,Code indicating whether the provider has on file a signed statement by the patient authorizing the release of medical data to other organizations,R,"I  : Informed Consent to Release Medical Information
for Conditions or Diagnoses Regulated by Federal
Statutes
488 Required when the provider has not collected a
signature AND state or federal laws do not require a
signature be collected.
Y : Yes, Provider has a Signed Statement Permitting
Release of Medical Billing Data Related to a Claim
489 Required when the provider has collected a
signature.
OR
Required when state or federal laws require a
signature be collected.",,,,,
Segment - MIA Inpatient Adjudication Information (Situational),,,,,,,,,
2320.MIA01,Quantity,Numeric value of quantity,R,,,,,,
2320.MIA03,Quantity,Numeric value of quantity,S,,,,,,
2320.MIA04,Monetary Amount,Monetary Amount,S,,,,,,
2320.MIA05,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",S,,,,,,
2320.MIA06,Monetary Amount,Monetary Amount,S,,,,,,
2320.MIA07,Monetary Amount,Monetary Amount,S,,,,,,
2320.MIA08,Monetary Amount,Monetary Amount,S,,,,,,
2320.MIA09,Monetary Amount,Monetary Amount,S,,,,,,
2320.MIA10,Monetary Amount,Monetary Amount,S,,,,,,
2320.MIA11,Monetary Amount,Monetary Amount,S,,,,,,
2320.MIA12,Monetary Amount,Monetary Amount,S,,,,,,
2320.MIA13,Monetary Amount,Monetary Amount,S,,,,,,
2320.MIA14,Monetary Amount,Monetary Amount,S,,,,,,
2320.MIA15,Quantity,Numeric value of quantity,S,,,,,,
2320.MIA16,Monetary Amount,Monetary Amount,S,,,,,,
2320.MIA17,Monetary Amount,Monetary Amount,S,,,,,,
2320.MIA18,Monetary Amount,Monetary Amount,S,,,,,,
2320.MIA19,Monetary Amount,Monetary Amount,S,,,,,,
2320.MIA20,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,S,,,,,,
2320.MIA21,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,S,,,,,,
2320.MIA22,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,S,,,,,,
2320.MIA23,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,S,,,,,,
2320.MIA24,Monetary Amount,Monetary Amount,S,,,,,,
Segment - MOA Outpatient Adjudication Information (Situational),,,,,,,,,
2320.MOA01,Percentage as Decimal,"Percentage expressed as a decimal (e.g., 0.0 through 1.0 represents 0% through
100%)",S,,,,,,
2320.MOA02,Monetary Amount,Monetary Amount,S,,,,,,
2320.MOA03,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,S,,,,,,
2320.MOA04,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,S,,,,,,
2320.MOA05,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,S,,,,,,
2320.MOA06,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,S,,,,,,
2320.MOA07,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,S,,,,,,
2320.MOA08,Monetary Amount,Monetary Amount,S,,,,,,
2320.MOA09,Monetary Amount,Monetary Amount,S,,,,,,
Loop 2330A(Situational),,,,,,,,,
Segment - NM1 Other Subscriber Name (Required),,,,,,,,,
2330A.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,IL : Insured or Subscriber,,,,,
2330A.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,"1 : Person
2 : Non-Person Entity",,,,,
2330A.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,,,,
2330A.NM104,Name First,Individual first name,S,,,,,,
2330A.NM105,Name Middle,Individual middle name or initial,S,,,,,,
2330A.NM107,Name Suffix,Suffix to individual name,S,,,,,,
2330A.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code (",R,PI  : Payor Identification,,,,,
2330A.NM109,Identification Code,Code identifying a party or other code,R,,,,,,
Segment - N3 Other Subscriber Address (Situational),,,,,,,,,
2330A.N301,Address Information,Address Information,R,,,,,,
2330A.N302,Address Information,Address Information,S,,,,,,
Segment - N4 Other Subscriber City/State/ZIP Code (Situational),,,,,,,,,
2330A.N401,City Name,Free-form text for city name,R,,,,,,
2330A.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,,,,
2330A.N403,Postal Code,"Code defining international postal zone code excluding punctuation and blanks
(zip code for United States)",S,,,,,,
,,,,,,,,,
2330A.N404,Country Code,Code identifying the country,S,,,,,,
2330A.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,
Segment - REF Other Subscriber Secondary Information (Situational),,,,,,,,,
2330A.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,,,,,,
2330A.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,
Loop 2330B(Situational),,,,,,,,,
Segment - NM1 Other Payer Name (Required),,,,,,,,,
2330B.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,PR: Payer,,,,,
2330B.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,2 :  Non-Person Entity,,,,,
2330B.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,,,,
2330B.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code",R,,,,,,
2330B.NM109,Identification Code,Code identifying a party or other code,R,,,,,,
Segment - N3 Other Payer Address (Situational),,,,,,,,,
2330B.N301,Address Information,Address Information,R,,,,,,
2330B.N302,Address Information,Address Information,S,,,,,,
Segment - N4 Other Payer City/State/ZIP Code (Situational),,,,,,,,,
2330B.N401,City Name,Free-form text for city name,R,,,,,,
2330B.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,,,,
2330B.N403,Postal Code,"Code defining international postal zone code excluding punctuation and blanks
(zip code for United States)",S,,,,,,
2330B.N404,Country Code,Code identifying the country,S,,US,,,,
2330B.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,
Segment - DTP Claim Check or Remittance Date (Situational),,,,,,,,,
2330B.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,573 : Date Claim Paid,,,,,
2330B.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 :Date Expressed in Format CCYYMMDD,,,,,
2330B.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,,
Segment - REF Other Payer Secondary Identifier (Situational),,,,,,,,,
2330B.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"2U: Payer Identification Number
EI: Employer’s Identification Number

FY: Claim Office Number
NF: National Association of Insurance Commissioners
(NAIC) Code",,,,,
2330B.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",,,,,
Segment - REF Other Payer Prior Authorization Number (Situational),,,,,,,,,
2330B.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,G1: Prior Authorization Number,,,,,
2330B.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,
Segment - REF Other Payer Referral Number (Situational),,,,,,,,,
2330B.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,9F : Referral Number,,,,,
2330B.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,
Segment - REF Other Payer Claim Adjustment Indicator (Situational),,,,,,,,,
2330B.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,T4 : Signal Code,,,,,
2330B.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,
Segment - REF Other Payer Claim Control Number (Situational),,,,,,,,,
2330B.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,F8 : Original Reference Number,,,,,
2330B.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,
Loop 2330C (Situational),,,,,,,,,
Segment - NM1 Other Payer Attending Provider (Situational),,,,,,,,,
2330C.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,71 : Attending Physician,,,,,
2330C.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,1 :Person,,,,,
Segment - REF Other Payer Attending Provider Secondary Identification (Required),,,,,,,,,
2330C.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B :State License Number
1G: Provider UPIN Number
1555
G2 :Provider Commercial Number
LU Location Number",,,,,
2330C.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,
Loop 2330D (Situational),,,,,,,,,
Segment - NM1 Other Payer Operating Physician (Situational),,,,,,,,,
2330D.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,,,,,,
2330D.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,,,,,,
Segment - REF Other Payer Operating Physician Secondary Identification (Required),,,,,,,,,
2330D.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,,,,,,
2330D.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,
Loop 2330E (Situational),,,,,,,,,
Segment - NM1 Other Payer Other Operating Physician (Situational),,,,,,,,,
2330E.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,,,,,,
2330E.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,,,,,,
Segment - REF Other Payer Other Operating Physician Secondary Identification (Required),,,,,,,,,
2330E.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,,,,,,
2330E.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,
Loop 2330F (Situational),,,,,,,,,
Segment - NM1 Other Payer Service Facility Location (Situational),,,,,,,,,
2330F.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,,,,,,
2330F.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,,,,,,
Segment - REF Other Payer Service Facility Location Identification (Required),,,,,,,,,
2330F.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,,,,,,
2330F.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,
Loop 2330G (Situational),,,,,,,,,
Segment - NM1 Other Payer Rendering Provider Name (Situational),,,,,,,,,
2330G.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,,,,,,
2330G.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,,,,,,
Segment - REF Other Payer Rendering Provider Secondary Identification (Required),,,,,,,,,
2330G.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,,,,,,
2330G.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,
Loop - 2330H (Situational),,,,,,,,,
Segment - NM1 Other Payer Referring Provider (Situational),,,,,,,,,
2330H.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,,,,,,
2330H.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,,,,,,
Segment - REF Other Payer Referring Provider Secondary Identification (Required),,,,,,,,,
2330H.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,,,,,,
2330H.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,
Loop - 2330I (Situational),,,,,,,,,
Segment - NM1 Other Payer Billing Provider (Situational),,,,,,,,,
2330I.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,,,,,,
2330I.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,,,,,,
Segment - REF Other Payer Billing Provider Secondary Identification (Required),,,,,,,,,
2330I.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,,,,,,
2330I.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,
Loop 2400 (Required),,,,,,,,,
Segment - LX Service Line Number (Required),,,,,,,,,
2400.LX01,Assigned Number,Number assigned for differentiation within a transaction set,R,1,,,Original_Line_Number,Line Level,
Segment - SV2 Institutional Service Line (Required),,,,1,,,,,
2400.SV201,Product/Service ID,Identifying number for a product or service,R,0900,,,Revenue_Code,Line Level,
2400.SV202,"COMPOSITE MEDICAL PROCEDURE
IDENTIFIER","To identify a medical procedure by its standardized codes and applicable
modifiers",S,,,,,,
2400.SV202.01,Product/Service ID Qualifier,"Code identifying the type/source of the descriptive number used in
Product/Service ID",R,"HC :Health Insurance Prospective Payment System
(HIPPS) Skilled Nursing Facility Rate Code",,"Hardcode as ""HC""",,,
2400.SV202.02,Product/Service ID,Identifying number for a product or service,R,H0023,,,Service_Code,Line Level,
2400.SV202.03,Procedure Modifier,"This identifies special circumstances related to the performance of the
service, as defined by trading partners",S,HE,,,Service_code_modifier_1,Line Level,
2400.SV202.04,Procedure Modifier,"This identifies special circumstances related to the performance of the
service, as defined by trading partners",S,HT,,,Service_code_modifier_2,Line Level,
2400.SV202.05,Procedure Modifier,"This identifies special circumstances related to the performance of the
service, as defined by trading partners",S,,,,Service_code_modifier_3,Line Level,
2400.SV202.06,Procedure Modifier,"This identifies special circumstances related to the performance of the
service, as defined by trading partners",S,,,,Service_code_modifier_4,Line Level,
2400.SV202.07,Description,"A free-form description to clarify the related data elements and their
content",S,,,,,,
2400.SV203,Monetary Amount,Monetary Amount,R,200,,,Total_Charge_Amount,Line Level,
2400.SV204,Unit or Basis for Measurement Code,"Code specifying the units in which a value is being expressed, or manner in which
a measurement has been taken",R,"DA : Days
UN : Unit",,"Hardcode as ""UN""",,,
2400.SV205,Quantity,Numeric value of quantity,R,1,,,Service_Unit_Count,Line Level,
,,,,,,,,,
2400.SV207,Monetary Amount,Monetary Amount,S,,,,,,
Segment - PWK Line Supplemental Information (Situational),,,,,,,,,
2400.PWK01,Report Type Code,"Code indicating the title or contents of a document, report or supporting item",R,"03 Report Justifying Treatment Beyond Utilization
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
I5 Immunization Record",,,,,
2400.PWK02,Report Transmission Code,"Code defining timing, transmission method or format by which reports are to be
sent",R,"AA Available on Request at Provider Site
179 This means that the additional information is not
being sent with the claim at this time. Instead, it is
available to the payer (or appropriate entity) at their
request.
BM By Mail
EL Electronically Only
180 Indicates that the attachment is being transmitted in
a separate X12 functional group.
EM E-Mail
FT File Transfer
FX: By FAX",,,,,
2400.PWK05,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code",S,AC Attachment Control Number,,,,,
2400.PWK06,Identification Code,Code identifying a party or other code,S,,,,,,
Segment - DTP Date - Service Date (Situational),,,,,,,,,
2400.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,472 Service,,"Hardcode as ""472""",,,
2400.DTP02,Date Time Period Format Qualifier,Date Time Period Format Qualifier,R,"D8 :Date Expressed in Format CCYYMMDD
RD8 :Range of Dates Expressed in Format CCYYMMDDCCYYMMDD",,"Hardcode ""RD8""  if Service_EndDate is present. Else D8.",,,
2400.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,"Expression of a date, a time, or range of dates, times or dates and times",,,Service_StartDate,Line Level,Format : YYYY-MM-DD
,,,,,,,Service_EndDate,,
Segment - REF Line Item Control Number (Situational),,,,,,,,,
2400.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,6R Provider Control Number,,,,,
2400.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier/ Line Item Control Number,R,,,,,,
Segment - REF Repriced Line Item Reference Number (Situational),,,,,,,,,
2400.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,9B Repriced Line Item Reference Number,,,,,
2400.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,
Segment - REF Adjusted Repriced Line Item Reference Number (Situational),,,,,,,,`,
2400.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,9D Adjusted Repriced Line Item Reference Number,,,,,
2400.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,
Segment - AMT Service Tax Amount (Situational),,,,,,,,,
2400.AMT01,Amount Qualifier Code,Code to qualify amount,R,GT Goods and Services Tax,,,,,
2400.AMT02,Monetary Amount,Monetary Amount,R,,,,,,
Segment - AMT Facility Tax Amount (Situational),,,,,,,,,
2400.AMT01,Amount Qualifier Code,Code to qualify amount,R,N8 Miscellaneous Taxes,,,,,
2400.AMT02,Monetary Amount,Monetary Amount,R,,,,,,
Segment - NTE Third Party Organization Notes (Situational),,,,,,,,,
2400.NTE01,Note Reference Code,Code identifying the functional area or purpose for which the note applies,R,TPO Third Party Organization Notes,,,,,
2400.NTE02,Description,A free-form description to clarify the related data elements and their content,R,,,,,,
Segment - HCP Line Pricing/Repricing Information (Situational),,,,,,,,`,
2400.HCP01,Pricing Methodology,"Code specifying pricing methodology at which the claim or line item has been
priced or repriced",R,"00 Zero Pricing (Not Covered Under Contract)
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
14 Adjustment Pricing",,,,,
2400.HCP02,Monetary Amount,Monetary Amount,R,,,,,,
2400.HCP03,Monetary Amount,Monetary Amount,S,,,,,,
2400.HCP04,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,S,,,,,,
2400.HCP05,Rate,Rate expressed in the standard monetary denomination for the currency specified,S,,,,,,
2400.HCP06,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,S,,,,,,
2400.HCP07,Monetary Amount,Monetary Amount,S,,,,,,
2400.HCP08,Product/Service ID,Identifying number for a product or service,S,,,,,,
2400.HCP09,Product/Service ID Qualifier,"Code identifying the type/source of the descriptive number used in
Product/Service ID",S,,,,,,
2400.HCP10,Product/Service ID,Identifying number for a product or service,S,,,,,,
2400.HCP11,Unit or Basis for Measurement Code,"Code specifying the units in which a value is being expressed, or manner in which
a measurement has been taken",S,"DA Days
UN Unit",,,,,
2400.HCP12,Quantity,Numeric value of quantity,S,,,,,,
2400.HCP13,Reject Reason Code,Code assigned by issuer to identify reason for rejection,S,"T1 Cannot Identify Provider as TPO (Third Party
Organization) Participant
T2 Cannot Identify Payer as TPO (Third Party
Organization) Participant
T3 Cannot Identify Insured as TPO (Third Party
Organization) Participant
T4 Payer Name or Identifier Missing
T5 Certification Information Missing
T6 Claim does not contain enough information for repricing",,,,,
2400.HCP14,Policy Compliance Code,Code specifying policy compliance,S,"1 Procedure Followed (Compliance)
2 Not Followed - Call Not Made (Non-Compliance Call
Not Made)
3 Not Medically Necessary (Non-Compliance NonMedically Necessary)
4 Not Followed Other (Non-Compliance Other)
5 Emergency Admit to Non-Network Hospital",,,,,
2400.HCP15,Exception Code,"Code specifying the exception reason for consideration of out-of-network health
care services",S,"1 Non-Network Professional Provider in Network
Hospital
2 Emergency Care
3 Services or Specialist not in Network
4 Out-of-Service Area
5 State Mandates
6 Other",,,,,
Loop 2410 - Drug identification,,,,,,,,`,
Segment - LIN Drug identification (Situational),,,,,,,,`,
2410.LIN02,Product/Service ID Qualifier,"Code identifying the type/source of the descriptive number used in
Product/Service ID",R,N4 National Drug Code in 5-4-2 Format,,,NDCCode_Qualifier,Line Level,
2410.LIN03,Product/Service ID,Identifying number for a product or service,R,,,,NDC_Code,Line Level,
Segment - CTP Drug Quantity (Required),,,,,,,,,
2410.CTP04,Quantity,Numeric value of quantity,R,,,,NDC_Quantity,Line Level,
2410.CTP05-1,COMPOSITE UNIT OF MEASURE-Unit or Basis for Measurement Code,To identify a composite unit of measure,R,,,,NDC_measurement_Type,Line Level,
Segment - REF Prescription or compound drug association Number (Situational),,,,,,,,,
2410.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"VY Link Sequence Number
XZ Pharmacy Prescription Number",,,,,
2410.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,
Loop 2420A (Situational),,,,,,,,,
Segment - NM1 Operating Physician Name (Situational),,,,,,,,,
2420A.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,72 Operating Physician,,,,,
2420A.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,1 Person,,,,,
2420A.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,,,,
2420A.NM104,Name First,Individual first name,S,,,,,,
2420A.NM105,Name Middle,Individual middle name or initial,S,,,,,,
2420A.NM107,Name Suffix,Suffix to individual name,S,,,,,,
2420A.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code",S,"XX Centers for Medicare and Medicaid Services
National Provider Identifier",,,,,
2420A.NM109,Identification Code,Code identifying a party or other code,S,,,,,,
Segment - REF Operating Physician Secondary Identification (Situational),,,,,,,,,
2420A.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number
LU Location Number",,,,,
2420A.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,
2420A.REF04.01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,2U Payer Identification Number,,,,,
2420A.REF04.02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,
Loop 2420B (Situational),,,,,,,,,
Segment - NM1 Other Operating Physician Name (Situational),,,,,,,,,
2420B.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,ZZ Mutually Defined,,,,,
2420B.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,1 Person,,,,,
2420B.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,,,,
2420B.NM104,Name First,Individual first name,S,,,,,,
2420B.NM105,Name Middle,Individual middle name or initial,S,,,,,,
2420B.NM107,Name Suffix,Suffix to individual name,S,,,,,,
2420B.NM108,Identification Code Qualifier,,S,XX Centers for Medicare and Medicaid Services National Provider Identifier,,,,,
2420B.NM109,Identification Code,Code identifying a party or other code,S,,,,,,
Segment - REF Other Operating Physician Secondary Identification (Situational),,,,,,,,,
2420B.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number
LU Location Number",,,,,
2420B.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,
2420B.REF04.01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,2U Payer Identification Number,,,,,
2420B.REF04.02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,
Loop 2420C (Situational),,,,,,,,,
Segment - NM1 Rendering Provider Name (Situational),,,,,,,,,
2420C.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,82 Rendering Provider,,,,,
2420C.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,1 Person,,,,,
2420C.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,,,,
2420C.NM104,Name First,Individual first name,S,,,,,,
2420C.NM105,Name Middle,Individual middle name or initial,S,,,,,,
2420C.NM107,Name Suffix,Suffix to individual name,S,,,,,,
2420C.NM108,Identification Code Qualifier,,S,"XX Centers for Medicare and Medicaid Services
National Provider Identifier",,,,,
2420C.NM109,Identification Code,Code identifying a party or other code,S,,,,,,
Segment - REF Rendering Provider Secondary Identification (Situational),,,,,,,,,
2420C.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number
LU Location Number",,,,,
2420C.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,
2420C.REF04.01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,2U Payer Identification Number,,,,,
2420C.REF04.02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,
Loop 2420D (Situational),,,,,,,,,
Segment - NM1 Referring Provider Name (Situational),,,,,,,,,
2420D.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,DN Referring Provider,,,,,
2420D.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,1 Person,,,,,
2420D.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,,,,
2420D.NM104,Name First,Individual first name,S,,,,,,
2420D.NM105,Name Middle,Individual middle name or initial,S,,,,,,
2420D.NM107,Name Suffix,Suffix to individual name,S,,,,,,
2420D.NM108,Identification Code Qualifier,,S,"XX Centers for Medicare and Medicaid Services
National Provider Identifier",,,,,
2420D.NM109,Identification Code,Code identifying a party or other code,S,,,,,,
Segment - REF Referring Provider Secondary Identification (Situational),,,,,,,,,
2420D.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number
LU Location Number",,,,,
2420D.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,S,,,,,,
2420D.REF04.01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,2U Payer Identification Number,,,,,
2420D.REF04.02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,
Loop 2430   — LINE ADJUDICATION INFORMATION(Situational) Loop Repeat: 15,,,,,,,,,
Segment - SVD Line Adjudication Information (Situational),,,,,,,,,
2430.SVD01,Identification Code,Code identifying a party or other code,R,,,,,,
2430.SVD02,Monetary Amount,Monetary Amount,R,,,,,,
2430.SVD03.01,Product/Service ID Qualifier,"Code identifying the type/source of the descriptive number used in
Product/Service ID",R,,,,,,
2430.SVD03.02,Product/Service ID,Identifying number for a product or service,R,,,,,,
2430.SVD03.03,Procedure Modifier,"This identifies special circumstances related to the performance of the
service, as defined by trading partners",S,,,,,,
2430.SVD03.04,Procedure Modifier,"This identifies special circumstances related to the performance of the
service, as defined by trading partners",S,,,,,,
2430.SVD03.05,Procedure Modifier,"This identifies special circumstances related to the performance of the
service, as defined by trading partners",S,,,,,,
2430.SVD03.06,Procedure Modifier,"This identifies special circumstances related to the performance of the
service, as defined by trading partners",S,,,,,,
2430.SVD03.07,Description,"A free-form description to clarify the related data elements and their
content",S,,,,,,
2430.SVD04,Product/Service ID,Identifying number for a product or service,R,,,,,,
2430.SVD05,Quantity,Numeric value of quantity,R,,,,,,
2430.SVD06,Assigned Number,Number assigned for differentiation within a transaction set,S,,,,,,
Segment - CAS Line Adjustment (Situational),,,,,,,,,
2430.CAS01,Claim Adjustment Group Code,Code identifying the general category of payment adjustment,R,"CO : Contractual Obligations
CR : Correction and Reversals
OA : Other adjustments
PI : Payor Initiated Reductions
PR : Patient Responsibility",,,,,
2430.CAS02,Claim Adjustment Reason Code,Code identifying the detailed reason the adjustment was made,R,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
2430.CAS03,Monetary Amount,Monetary Amount,R,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
2430.CAS04,Quantity,Numeric value of quantity,S,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
2430.CAS05,Claim Adjustment Reason Code,Code identifying the detailed reason the adjustment was made,R,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
2430.CAS06,Monetary Amount,Monetary Amount,R,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
2430.CAS07,Quantity,Numeric value of quantity,S,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
2430.CAS08,Claim Adjustment Reason Code,Code identifying the detailed reason the adjustment was made,R,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
2430.CAS09,Monetary Amount,Monetary Amount,R,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
2430.CAS10,Quantity,Numeric value of quantity,S,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
2430.CAS11,Claim Adjustment Reason Code,Code identifying the detailed reason the adjustment was made,R,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
2430.CAS12,Monetary Amount,Monetary Amount,R,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
2430.CAS13,Quantity,Numeric value of quantity,S,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
2430.CAS14,Claim Adjustment Reason Code,Code identifying the detailed reason the adjustment was made,R,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
2430.CAS15,Monetary Amount,Monetary Amount,R,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
2430.CAS16,Quantity,Numeric value of quantity,S,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
2430.CAS17,Claim Adjustment Reason Code,Code identifying the detailed reason the adjustment was made,R,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
2430.CAS18,Monetary Amount,Monetary Amount,R,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
2430.CAS19,Quantity,Numeric value of quantity,S,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
Segment - DTP Line Check or Remittance Date (Required),,,,,,,,,
2430.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,573 Date Claim Paid,,,,,
2430.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8,,,,,
2430.DTP03,Date Time Period,,R,,,,,,
Segment - AMT Remaining Patient Liability (Situational),,,,,,,,,
2430.AMT01,Amount Qualifier Code,Code to qualify amount,R,EAF Amount Owed,,,,,
2430.AMT02,Monetary Amount,Monetary Amount/Remaining Patient Liability,R,,,,,,
Segment SE (Required),,,,,,,,,
SE Transaction Set Trailer (Required),,,,,,,,,
SE01,Number of Included Segments,"Total number of segments included in a transaction set including ST and SE
segments",R,Count Of ST,,Count Of ST,,,
SE02,Transaction Set Control Number,Unique Sequential Number Assigned by Internal Processes for each Transaction Set. Starts from 001 and increments with each transaction set,R,ST02 Value,,,,,
Segment GE (Required),,,,,,,,,
GE Functional Group Trailer (Required),,,,,,,,,
GE01,Number of Transaction Sets Included,"Total number of transaction sets included in the functional group or interchange
(transmission) group terminated by the trailer containing this data element",R,Count Of GS,,Count Of GS,,,
GE02,Group Control Number,Assigned number originated and maintained by the sender,R,GS06 Value,,GS06 Value,,,
Segment IEA (Required),,,,,,,,,
IEA Interchange Control Trailer (Required),,,,,,,,,
IEA01,Number of Included Functional Groups,A count of the number of functional groups included in an interchange,R,Count Of ISA,,Count Of ISA,,,
IEA02,Interchange Control Number,A control number assigned by the interchange sender.  It must be identical to ISA13,R,ISA13 Value - 319003402,,ISA13 Value,,,
```

## QA Automation/EdifecsProduct_MappingSpec_QA Automation_837I_CSV_to_EDI_Conversion_V1.1.xlsx — Sample CSV Format

```csv
Claimid,Scenarios,EdiFilename,totalClaimCount,SenderId,ReceiverId,Receipt_Date,Entry_Date,Clean_Claim_Date,Payee_Type_Field,Frequency_Code,Clearing_House_TraceNumber,Benefit_Plan_Type,TradingPartnerID,Claim_Source,Claim_Payor_Type,Claim_Filing_Code,Type_Of_Bill_Code,Totals,PayTo_Name,PayTo_Address,PayTo_CityName,PayTo_StateCode,PayTo_Zip_Code,Statement_Start_Date,Statement_End_Date,BillingRecipient_Name,BillingRecipient_Address,BillingRecipient_CityName,BillingRecipient_StateCode,BillingRecipient_ZipCode,BillingRecipient_ZipSuffixCode,BillingRecipient_TelephoneNumber,Claim_Delivery_Type,Attachment_Set_ID,Claim_Number,Submitted_Subscriber_Id,Subscriber_Identification_Number,Subscriber_Name,Subscriber_Last_Name,Subscriber_First_Name,Subscriber_Street_Address,Subscriber_City_Name,Subscriber_State_Code,Subscriber_Postal_Code,Subscriber_Gender_Code,Subscriber_Date_Of_Birth,Subscriber_Insurance_Group_Number,Subscriber_Group_Name,Member_Identification_Number,Member_Name,Member_Last_Name,Member_First_Name,Member_Street_Address,Member_City_Name,Member_State_Code,Member_Postal_Code,Member_Gender_Code,Member_DateOfBirth,Submitter_Id,Submitter_Name,Relationship_To_Subscriber_Code,Patient_Control_Number,Medical_Record_Number,Admission_Date,Admission_TimeCount,Admission_Type_Code,Admission_Source_Code,Discharge_Status_Code,Tax_Identification_Number,Supplier_Name,Supplier_Address,Supplier_CityName,Supplier_StateCode,Supplier_ZipCode,Supplier_ZipSuffixCode,Supplier_TelephoneNumber,Supplier_Npi,Attending_Practitioner_FullName,Attending_Practitioner_FirstName,Attending_practitioner_LastName,Attending_practitioner_Npi,Attending_Practitioner_Id,Attending_Practitioner_Id_Qualifier,Operating_Practitioner_FirstName,Operating_practitioner_LastName,Operating_practitioner_Npi,Operating_Practitioner_Id,Operating_Practitioner_Id_Qualifier,Other_Practitioner_FirstName,Other_practitioner_LastName,Other_practitioner_Npi,Other_Practitioner_Id,Other_Practitioner_Id_Qualifier,Payer_Identification_Number,Primary_Diagnosis_Code,Primary_Diagnosis_POAIndicator,Admit_Diagnosis_Code,Release_Information_Ind,Benefit_Assignment_Indicator,Payer_Name,Number_of_service_lines,Original_Line_Number,Revenue_Code,Service_Code,Service_Date,Service_Unit_Count,Total_Charge_Amount
INS1,"Create Scenario (Final Status)
single line Claim",C123.xml,1,1,1,,2021-04-23T00:00:00.000,,Supplier,1,2011349153671323002,1,TP0001,Unknown,1,MA,131,1000,Supplier_Clinic,2050 E Osceola Pkwy,Kissimmee,FL,34743,,,Supplier_Clinic,2050 E Osceola Pkwy,Kissimmee,FL,34743,8602,617-123-1234,E,null,Dynamic,200008488,200008488,"Muller, Nathanial",Muller,Nathanial,72047 Isaias Underpass,Greeley,CO,80639,M,,SD0135,Individual OffEx,200008488-01,"Muller, Nathanial",Muller,Nathanial,72047 Isaias Underpass,Greeley,CO,80639,M,1981-04-30,200008488-01,"Muller, Nathanial",Self,123456,123,,1110,1,1,01,99-9999999,Supplier_Clinic,2050 E Osceola Pkwy,Kissimmee,FL,34743,8602,617-123-1234,Nill,Paul Aguillon,Paul,Aguillon,1275813552,P00000299,G2,Paul,Aguillon,1275813552,P00000299,G2,Paul,Aguillon,1275813552,P00000299,G2,S00000002,R45,Y,R45,Y,Y,Supplier_Clinic,1,,,,,,
INS1,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,1,0300,99242,,1,1000
INS2,Final to Replacement Claim,C123.xml,1,1,1,,2021-04-23T00:00:00.000,,Supplier,1,2011349153671323002,1,TP0001,Unknown,1,MA,131,1000,Supplier_Clinic,2050 E Osceola Pkwy,Kissimmee,FL,34743,,,Supplier_Clinic,2050 E Osceola Pkwy,Kissimmee,FL,34743,8602,617-123-1234,E,null,Dynamic,200008489,200008489,"Murazik, Ma",Murazik,Ma,1220 Greenholt Loop,Greeley,CO,80639,M,,SD0135,Individual OffEx,200008489-01,"Murazik, Ma",Murazik,Ma,1220 Greenholt Loop,Greeley,CO,80639,M,1981-04-30,200008489-01,"Murazik, Ma",Self,123456,123,,1110,1,1,01,99-9999999,Supplier_Clinic,2050 E Osceola Pkwy,Kissimmee,FL,34743,8602,617-123-1234,Nill,Paul Aguillon,Paul,Aguillon,1275813552,P00000299,G2,Paul,Aguillon,1275813552,P00000299,G2,Paul,Aguillon,1275813552,P00000299,G2,S00000002,R45,Y,R45,Y,Y,Supplier_Clinic,1,,,,,,
INS2,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,1,0300,99241,,1,1000
INS3,"Create Scenario (Final Status)
Multiple line Claim",C3123.xml,1,1,1,,2021-04-23T00:00:00.000,,Supplier,1,2011349153671323002,1,TP0001,Unknown,1,MA,131,1000,Supplier_Clinic,2050 E Osceola Pkwy,Kissimmee,FL,34743,,,Supplier_Clinic,2050 E Osceola Pkwy,Kissimmee,FL,34743,8602,617-123-1234,E,null,Dynamic,200008490,200008490,"McClure, Shin",McClure,Shin,898 Leana Grove,Greeley,CO,80639,M,,SD0135,Individual OffEx,200008490-01,"McClure, Shin",McClure,Shin,898 Leana Grove,Greeley,CO,80639,M,1981-04-30,200008490-01,"McClure, Shin",Self,123456,123,,1110,1,1,01,99-9999999,Supplier_Clinic,2050 E Osceola Pkwy,Kissimmee,FL,34743,8602,617-123-1234,Nill,Paul Aguillon,Paul,Aguillon,1275813552,P00000299,G2,Paul,Aguillon,1275813552,P00000299,G2,Paul,Aguillon,1275813552,P00000299,G2,S00000002,R45,Y,R45,Y,Y,Supplier_Clinic,3,,,,,,
INS3,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,1,0300,99241,,1,1000
INS3,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,2,0300,99242,,1,1000
INS3,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,3,0300,99243,,1,1000
INS4,Member Eligibility Scenario,C3123.xml,1,1,1,2021-12-12,2021-04-23T00:00:00.000,2021-12-12,Supplier,1,2011349153671323002,1,TP0001,Unknown,1,MA,131,1000,Supplier_Clinic,2050 E Osceola Pkwy,Kissimmee,FL,34743,2021-12-12,2021-12-12,Supplier_Clinic,2050 E Osceola Pkwy,Kissimmee,FL,34743,8602,617-123-1234,E,null,Dynamic,200008491,200008491,"Abbott, Sherwood",Abbott,Sherwood,79590 Quitzon Dale,Greeley,CO,80639,M,,SD0135,Individual OffEx,200008491-01,"Abbott, Sherwood",Abbott,Sherwood,79590 Quitzon Dale,Greeley,CO,80639,M,1981-04-30,200008491-01,"Abbott, Sherwood",Self,123456,123,,1110,1,1,01,99-9999999,Supplier_Clinic,2050 E Osceola Pkwy,Kissimmee,FL,34743,8602,617-123-1234,Nill,Paul Aguillon,Paul,Aguillon,1275813552,P00000299,G2,Paul,Aguillon,1275813552,P00000299,G2,Paul,Aguillon,1275813552,P00000299,G2,S00000002,R45,Y,R45,Y,Y,Supplier_Clinic,1,,,,,,
INS4,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,1,0300,99241,,1,1000
INS5,Invalid Type of bill Scenario - Single line,C123.xml,1,1,1,,2021-04-23T00:00:00.000,,Supplier,1,2011349153671323002,1,TP0001,Unknown,1,MA,1311,1000,Supplier_Clinic,2050 E Osceola Pkwy,Kissimmee,FL,34743,,,Supplier_Clinic,2050 E Osceola Pkwy,Kissimmee,FL,34743,8602,617-123-1234,E,null,Dynamic,200008492,200008492,"Koelpin, Kera",Koelpin,Kera,651 Williamson Via,Greeley,CO,80639,M,,SD0135,Individual OffEx,200008492-01,"Koelpin, Kera",Koelpin,Kera,651 Williamson Via,Greeley,CO,80639,M,1981-04-30,200008492-01,"Koelpin, Kera",Self,123456,123,,1110,1,1,01,99-9999999,Supplier_Clinic,2050 E Osceola Pkwy,Kissimmee,FL,34743,8602,617-123-1234,Nill,Paul Aguillon,Paul,Aguillon,1275813552,P00000299,G2,Paul,Aguillon,1275813552,P00000299,G2,Paul,Aguillon,1275813552,P00000299,G2,S00000002,R45,Y,R45,Y,Y,Supplier_Clinic,1,,,,,,
INS5,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,1,0300,99243,,1,1000
INS6,Rejected claim,C3123.xml,1,1,1,,2021-04-23T00:00:00.000,,Supplier,1,2011349153671323002,1,TP0001,Unknown,1,MA,131,1000,Supplier_Clinic,2050 E Osceola Pkwy,Kissimmee,FL,34743,,,Supplier_Clinic,2050 E Osceola Pkwy,Kissimmee,FL,34743,8602,617-123-1234,E,null,Dynamic,200008493,200008493,"Waters, Asley",Waters,Asley,76606 Christopher Shoals,Greeley,CO,80639,M,,SD0135,Individual OffEx,200008493-01,"Waters, Asley",Waters,Asley,76606 Christopher Shoals,Greeley,CO,80639,M,1981-04-30,200008493-01,"Waters, Asley",Self,123456,123,,1110,1,1,01,99-0000000,Supplier_Clinic12345,2050 E Osceola Pkwy,Kissimmee,FL,34743,8602,617-123-1234,Nill,Paul Aguillon,Paul,Aguillon,1275813552,P00000299,G2,Paul,Aguillon,1275813552,P00000299,G2,Paul,Aguillon,1275813552,P00000299,G2,S00000002,R45,Y,R45,Y,Y,Supplier_Clinic,1,,,,,,
INS6,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,1,0300,99241,,1,1000
INS7,High Dollar Claim,C123.xml,1,1,1,,2021-04-23T00:00:00.000,,Supplier,1,2011349153671323002,1,TP0001,Unknown,1,MA,131,1000,Supplier_Clinic,2050 E Osceola Pkwy,Kissimmee,FL,34743,,,Supplier_Clinic,2050 E Osceola Pkwy,Kissimmee,FL,34743,8602,617-123-1234,E,null,Dynamic,200008494,200008494,"Nikolaus, Stefanie",Nikolaus,Stefanie,541 Lynn Mount,Greeley,CO,80639,M,,SD0135,Individual OffEx,200008494-01,"Nikolaus, Stefanie",Nikolaus,Stefanie,541 Lynn Mount,Greeley,CO,80639,M,1981-04-30,200008494-01,"Nikolaus, Stefanie",Self,123456,123,,1110,1,1,01,99-9999999,Supplier_Clinic,2050 E Osceola Pkwy,Kissimmee,FL,34743,8602,617-123-1234,Nill,Paul Aguillon,Paul,Aguillon,1275813552,P00000299,G2,Paul,Aguillon,1275813552,P00000299,G2,Paul,Aguillon,1275813552,P00000299,G2,S00000002,R45,Y,R45,Y,Y,Supplier_Clinic,1,,,,,,
INS7,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,1,0300,99241,,1,50000
INS8,Claim Attachment Validation,C123.xml,1,1,1,,2021-04-23T00:00:00.000,,Supplier,1,2011349153671323002,1,TP0001,Unknown,1,MA,131,1000,Supplier_Clinic,2050 E Osceola Pkwy,Kissimmee,FL,34743,,,Supplier_Clinic,2050 E Osceola Pkwy,Kissimmee,FL,34743,8602,617-123-1234,S,www.google.com,Dynamic,200008495,200008495,"Kunde, Iona",Kunde,Iona,74937 Agueda Locks,Greeley,CO,80639,M,,SD0135,Individual OffEx,200008495-01,"Kunde, Iona",Kunde,Iona,74937 Agueda Locks,Greeley,CO,80639,M,1981-04-30,200008495-01,"Kunde, Iona",Self,123456,123,,1110,1,1,01,99-9999999,Supplier_Clinic,2050 E Osceola Pkwy,Kissimmee,FL,34743,8602,617-123-1234,Nill,Paul Aguillon,Paul,Aguillon,1275813552,P00000299,G2,Paul,Aguillon,1275813552,P00000299,G2,Paul,Aguillon,1275813552,P00000299,G2,S00000002,R45,Y,R45,Y,Y,Supplier_Clinic,Attachment_Claim,,,,,,
INS8,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,1,0300,99211,,1,1000
```

## QA Automation/EdifecsProduct_MappingSpec_QA Automation_837I_CSV_to_EDI_Conversion_V1.1.xlsx — Default Values

```csv
Field in CSV,Claim/Line Level Record,Default value/Mapping logic
Claimid,Claim Level/Line Level,An incremental value which is unique for each claim record in the file .
Scenarios,Claim Level,Blank
EdiFilename,Claim Level,Name of the IB EDI 837I file
totalClaimCount,Claim Level,Total number of claims in the IB file
Entry_Date,Claim Level,Processing date/time in the format: YYYY-MM-DDTHH:mm:ss
Claim_Source,Claim Level,Refer the ClaimsourceLookup crosswalk in IB 837 and populate.
Claim_Delivery_Type,Claim Level,Refer the ClaimsourceLookup crosswalk in IB 837 and populate.
Payee_Type_Field,Claim Level,Hardcode as 'Supplier'
Benefit_Plan_Type,Claim Level,Hardcode as 1 (medical)
claim_Payor_Type,Claim Level,Hardcode as '1 '
Number_of_service_lines,Claim Level,No of lines in the claim
Endofrecord,Claim Level/Line Level,Hardcode as 'EOR'
```

## QA Automation/EdifecsProduct_MappingSpec_QA Automation_837I_CSV_to_EDI_Conversion_V1.1.xlsx — Sheet1

```csv
institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/supplierInformation/address
```

## QA Automation/EdifecsProduct_MappingSpec_QA Automation_837I_EDI_to_CSVConversion_V1.0.xlsx — Cover Page

```csv
Data Extraction for QA Automation- EDIFECS,,,,,,,,,
,,,,,,,,,
Business Area: Inbound Claims  (EDI 837I),,,,,,,,,
,,,,,,,,,
This document provides the Mapping Specification for converting EDI 837I Claims file into CSV format as part of the data extraction for QA automation. Document is intended for EDIFECS Product Team,,,,,,,,,
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

## QA Automation/EdifecsProduct_MappingSpec_QA Automation_837I_EDI_to_CSVConversion_V1.0.xlsx — Version History

```csv
Revision History,,,,
,,,,
,,,,
,,,,
V#,Date,Author,Reviewer(s)/ Contributor(s),Comments
0.1,26/9/2023,Ambily Raj,Shijila M,Initial Version
1,26/9/2023,Ambily Raj,Shijila M,Baselined
```

## QA Automation/EdifecsProduct_MappingSpec_QA Automation_837I_EDI_to_CSVConversion_V1.0.xlsx — CSV Layout

```csv
Sr No,CSV Field,Claim Level/Line Level,Data Type,Length,R/S
1,Claimid,Claim Level,VARCHAR,10,R
2,Scenarios,Claim Level,VARCHAR,100,S
3,EdiFilename,Claim Level,VARCHAR,100,S
4,totalClaimCount,Claim Level,VARCHAR,10,S
5,SenderId,Claim Level,VARCHAR,15,S
6,ReceiverId,Claim Level,VARCHAR,15,S
7,Receipt_Date,Claim Level,VARCHAR,10,S
8,Entry_Date,Claim Level,VARCHAR,10,S
9,Clean_Claim_Date,Claim Level,VARCHAR,10,S
10,Payee_Type_Field,Claim Level,VARCHAR,10,S
11,Frequency_Code,Claim Level,VARCHAR,1,S
12,Clearing_House_TraceNumber,Claim Level,VARCHAR,50,S
13,Benefit_Plan_Type,Claim Level,VARCHAR,1,S
14,TradingPartnerID,Claim Level,VARCHAR,15,S
15,Claim_Source,Claim Level,VARCHAR,15,S
16,Claim_Payor_Type,Claim Level,VARCHAR,1,S
17,Claim_Filing_Code,Claim Level,VARCHAR,2,S
18,Type_Of_Bill_Code,Claim Level,VARCHAR,2,S
19,Totals,Claim Level,VARCHAR,18,S
20,PayTo_Name,Claim Level,VARCHAR,60,S
21,PayTo_Address,Claim Level,VARCHAR,110,S
22,PayTo_CityName,Claim Level,VARCHAR,30,S
23,PayTo_StateCode,Claim Level,VARCHAR,2,S
24,PayTo_Zip_Code,Claim Level,VARCHAR,5,S
25,Statement_Start_Date,Claim Level,VARCHAR,10,S
26,Statement_End_Date,Claim Level,VARCHAR,10,S
27,BillingRecipient_Name,Claim Level,VARCHAR,60,S
28,BillingRecipient_Address,Claim Level,VARCHAR,110,S
29,BillingRecipient_CityName,Claim Level,VARCHAR,30,S
30,BillingRecipient_StateCode,Claim Level,VARCHAR,2,S
31,BillingRecipient_ZipCode,Claim Level,VARCHAR,5,S
32,BillingRecipient_ZipSuffixCode,Claim Level,VARCHAR,4,S
33,BillingRecipient_TelephoneNumber,Claim Level,VARCHAR,15,S
34,Claim_Delivery_Type,Claim Level,VARCHAR,1,S
35,Attachment_Set_ID,Claim Level,VARCHAR,80,S
36,Claim_Number,Claim Level,VARCHAR,50,S
37,Submitted_Subscriber_Id,Claim Level,VARCHAR,80,S
38,Subscriber_Identification_Number,Claim Level,VARCHAR,80,S
39,Subscriber_Name,Claim Level,VARCHAR,150,S
40,Subscriber_Last_Name,Claim Level,VARCHAR,60,S
41,Subscriber_First_Name,Claim Level,VARCHAR,35,S
42,Subscriber_Street_Address,Claim Level,VARCHAR,55,S
43,Subscriber_City_Name,Claim Level,VARCHAR,30,S
44,Subscriber_State_Code,Claim Level,VARCHAR,2,S
45,Subscriber_Postal_Code,Claim Level,VARCHAR,15,S
46,Subscriber_Gender_Code,Claim Level,VARCHAR,1,S
47,Subscriber_Date_Of_Birth,Claim Level,VARCHAR,10,S
48,Subscriber_Insurance_Group_Number,Claim Level,VARCHAR,50,S
49,Subscriber_Group_Name,Claim Level,VARCHAR,60,S
50,Member_Identification_Number,Claim Level,VARCHAR,80,S
51,Member_Name,Claim Level,VARCHAR,150,S
52,Member_Last_Name,Claim Level,VARCHAR,60,S
53,Member_First_Name,Claim Level,VARCHAR,35,S
54,Member_Street_Address,Claim Level,VARCHAR,55,S
55,Member_City_Name,Claim Level,VARCHAR,30,S
56,Member_State_Code,Claim Level,VARCHAR,2,S
57,Member_Postal_Code,Claim Level,VARCHAR,15,S
58,Member_Gender_Code,Claim Level,VARCHAR,1,S
59,Member_DateOfBirth,Claim Level,VARCHAR,10,S
60,Submitter_Id,Claim Level,VARCHAR,80,S
61,Submitter_Name,Claim Level,VARCHAR,60,S
62,Relationship_To_Subscriber_Code,Claim Level,VARCHAR,2,S
63,Patient_Control_Number,Claim Level,VARCHAR,38,S
64,Medical_Record_Number,Claim Level,VARCHAR,50,S
65,Admission_Date,Claim Level,VARCHAR,10,S
66,Admission_TimeCount,Claim Level,VARCHAR,4,S
67,Admission_Type_Code,Claim Level,VARCHAR,1,S
68,Admission_Source_Code,Claim Level,VARCHAR,1,S
69,Discharge_Status_Code,Claim Level,VARCHAR,2,S
70,Tax_Identification_Number,Claim Level,VARCHAR,50,S
71,Supplier_Name,Claim Level,VARCHAR,60,S
72,Supplier_Address,Claim Level,VARCHAR,110,S
73,Supplier_CityName,Claim Level,VARCHAR,30,S
74,Supplier_StateCode,Claim Level,VARCHAR,2,S
75,Supplier_ZipCode,Claim Level,VARCHAR,5,S
76,Supplier_ZipSuffixCode,Claim Level,VARCHAR,4,S
77,Supplier_TelephoneNumber,Claim Level,VARCHAR,15,S
78,Supplier_Npi,Claim Level,VARCHAR,80,S
79,Attending_Practitioner_FullName,Claim Level,VARCHAR,130,S
80,Attending_Practitioner_FirstName,Claim Level,VARCHAR,35,S
81,Attending_practitioner_LastName,Claim Level,VARCHAR,60,S
82,Attending_practitioner_Npi,Claim Level,VARCHAR,80,S
83,Attending_Practitioner_Id,Claim Level,VARCHAR,50,S
84,Attending_Practitioner_Id_Qualifier,Claim Level,VARCHAR,3,S
85,Operating_Practitioner_FirstName,Claim Level,VARCHAR,35,S
86,Operating_practitioner_LastName,Claim Level,VARCHAR,60,S
87,Operating_practitioner_Npi,Claim Level,VARCHAR,80,S
88,Operating_Practitioner_Id,Claim Level,VARCHAR,50,S
89,Operating_Practitioner_Id_Qualifier,Claim Level,VARCHAR,3,S
90,Other_Practitioner_FirstName,Claim Level,VARCHAR,35,S
91,Other_practitioner_LastName,Claim Level,VARCHAR,60,S
92,Other_practitioner_Npi,Claim Level,VARCHAR,80,S
93,Other_Practitioner_Id,Claim Level,VARCHAR,50,S
94,Other_Practitioner_Id_Qualifier,Claim Level,VARCHAR,3,S
95,Payer_Identification_Number,Claim Level,VARCHAR,80,S
96,Primary_Diagnosis_Code,Claim Level,VARCHAR,30,S
97,Primary_Diagnosis_POAIndicator,Claim Level,VARCHAR,1,S
98,Admit_Diagnosis_Code,Claim Level,VARCHAR,30,S
99,PRV_Diagnosis_Code1,Claim Level,VARCHAR,30,S
100,PRV_Diagnosis_Code2,Claim Level,VARCHAR,30,S
101,PRV_Diagnosis_Code3,Claim Level,VARCHAR,30,S
102,External_Diagnosis_Code1,Claim Level,VARCHAR,30,S
103,External_Diagnosis_POA1,Claim Level,VARCHAR,1,S
104,External_Diagnosis_Code2,Claim Level,VARCHAR,30,S
105,External_Diagnosis_POA2,Claim Level,VARCHAR,1,S
106,External_Diagnosis_Code3,Claim Level,VARCHAR,30,S
107,External_Diagnosis_POA3,Claim Level,VARCHAR,1,S
108,External_Diagnosis_Code4,Claim Level,VARCHAR,30,S
109,External_Diagnosis_POA4,Claim Level,VARCHAR,1,S
110,External_Diagnosis_Code5,Claim Level,VARCHAR,30,S
111,External_Diagnosis_POA5,Claim Level,VARCHAR,1,S
112,External_Diagnosis_Code6,Claim Level,VARCHAR,30,S
113,External_Diagnosis_POA6,Claim Level,VARCHAR,1,S
114,DRG_Code,Claim Level,VARCHAR,30,S
115,Other_Diagnosis_Code1,Claim Level,VARCHAR,30,S
116,Other_Diagnosis_POA1,Claim Level,VARCHAR,1,S
117,Other_Diagnosis_Code2,Claim Level,VARCHAR,30,S
118,Other_Diagnosis_POA2,Claim Level,VARCHAR,1,S
119,Other_Diagnosis_Code3,Claim Level,VARCHAR,30,S
120,Other_Diagnosis_POA3,Claim Level,VARCHAR,1,S
121,Other_Diagnosis_Code4,Claim Level,VARCHAR,30,S
122,Other_Diagnosis_POA4,Claim Level,VARCHAR,1,S
123,Priniciple_Procedure_Code,Claim Level,VARCHAR,30,S
124,Priniciple_Procedure_Date,Claim Level,VARCHAR,10,S
125,Other_Proedurecode1,Claim Level,VARCHAR,30,S
126,Other_Proeduredate1,Claim Level,VARCHAR,10,S
127,Other_Proedurecode2,Claim Level,VARCHAR,30,S
128,Other_Proeduredate2,Claim Level,VARCHAR,10,S
129,Other_Proedurecode3,Claim Level,VARCHAR,30,S
130,Other_Proeduredate3,Claim Level,VARCHAR,10,S
131,Other_Proedurecode4,Claim Level,VARCHAR,30,S
132,Other_Proeduredate4,Claim Level,VARCHAR,10,S
133,Occurrencespan_code1,Claim Level,VARCHAR,30,S
134,Occurrencespan_Startdate1,Claim Level,VARCHAR,10,S
135,Occurrencespan_Enddate1,Claim Level,VARCHAR,10,S
136,Occurrencespan_code2,Claim Level,VARCHAR,30,S
137,Occurrencespan_Startdate2,Claim Level,VARCHAR,10,S
138,Occurrencespan_Enddate2,Claim Level,VARCHAR,10,S
139,Occurrencespan_code3,Claim Level,VARCHAR,30,S
140,Occurrencespan_Startdate3,Claim Level,VARCHAR,10,S
141,Occurrencespan_Enddate3,Claim Level,VARCHAR,10,S
142,Occurrencespan_code4,Claim Level,VARCHAR,30,S
143,Occurrencespan_Startdate4,Claim Level,VARCHAR,10,S
144,Occurrencespan_Enddate4,Claim Level,VARCHAR,10,S
145,Eventoccurence_Code1,Claim Level,VARCHAR,30,S
146,Eventoccurence_Date1,Claim Level,VARCHAR,10,S
147,Eventoccurence_Code2,Claim Level,VARCHAR,30,S
148,Eventoccurence_Date2,Claim Level,VARCHAR,10,S
149,Eventoccurence_Code3,Claim Level,VARCHAR,30,S
150,Eventoccurence_Date3,Claim Level,VARCHAR,10,S
151,Value_Code1,Claim Level,VARCHAR,30,S
152,Value_Code_Amount1,Claim Level,VARCHAR,18,S
153,Value_Code2,Claim Level,VARCHAR,30,S
154,Value_Code_Amount2,Claim Level,VARCHAR,18,S
155,Value_Code3,Claim Level,VARCHAR,30,S
156,Value_Code_Amount3,Claim Level,VARCHAR,18,S
157,Condition_Code1,Claim Level,VARCHAR,30,S
158,Condition_Code2,Claim Level,VARCHAR,30,S
159,Condition_Code3,Claim Level,VARCHAR,30,S
160,Condition_Code4,Claim Level,VARCHAR,30,S
161,Condition_Code5,Claim Level,VARCHAR,30,S
162,Condition_Code6,Claim Level,VARCHAR,30,S
163,Release_Information_Ind,Claim Level,VARCHAR,1,S
164,Benefit_Assignment_Indicator,Claim Level,VARCHAR,1,S
165,Payer_Name,Claim Level,VARCHAR,60,S
166,Number_of_service_lines,Claim Level,VARCHAR,,S
167,Original_Line_Number,Line Level,VARCHAR,6,S
168,Revenue_Code,Line Level,VARCHAR,48,S
169,Service_Code,Line Level,VARCHAR,48,S
170,Service_code_modifier_1,Line Level,VARCHAR,2,S
171,Service_code_modifier_2,Line Level,VARCHAR,2,S
172,Service_code_modifier_3,Line Level,VARCHAR,2,S
173,Service_code_modifier_4,Line Level,VARCHAR,2,S
174,NDCCode_Qualifier,Line Level,VARCHAR,2,S
175,NDC_Code,Line Level,VARCHAR,48,S
176,NDC_Quantity,Line Level,VARCHAR,15,S
177,NDC_measurement_Type,Line Level,VARCHAR,2,S
178,Service_Date,Line Level,VARCHAR,10,S
179,Service_Unit_Count,Line Level,VARCHAR,15,S
180,Total_Charge_Amount,Line Level,VARCHAR,18,S
181,Endofrecord,Claim Level/Line level,VARCHAR,3,S
```

## QA Automation/EdifecsProduct_MappingSpec_QA Automation_837I_EDI_to_CSVConversion_V1.0.xlsx — Sample CSV Format

```csv
Claimid,Scenarios,EdiFilename,totalClaimCount,SenderId,ReceiverId,Receipt_Date,Entry_Date,Clean_Claim_Date,Payee_Type_Field,Frequency_Code,Clearing_House_TraceNumber,Benefit_Plan_Type,TradingPartnerID,Claim_Source,Claim_Payor_Type,Claim_Filing_Code,Type_Of_Bill_Code,Totals,PayTo_Name,PayTo_Address,PayTo_CityName,PayTo_StateCode,PayTo_Zip_Code,Statement_Start_Date,Statement_End_Date,BillingRecipient_Name,BillingRecipient_Address,BillingRecipient_CityName,BillingRecipient_StateCode,BillingRecipient_ZipCode,BillingRecipient_ZipSuffixCode,BillingRecipient_TelephoneNumber,Claim_Delivery_Type,Attachment_Set_ID,Claim_Number,Submitted_Subscriber_Id,Subscriber_Identification_Number,Subscriber_Name,Subscriber_Last_Name,Subscriber_First_Name,Subscriber_Street_Address,Subscriber_City_Name,Subscriber_State_Code,Subscriber_Postal_Code,Subscriber_Gender_Code,Subscriber_Date_Of_Birth,Subscriber_Insurance_Group_Number,Subscriber_Group_Name,Member_Identification_Number,Member_Name,Member_Last_Name,Member_First_Name,Member_Street_Address,Member_City_Name,Member_State_Code,Member_Postal_Code,Member_Gender_Code,Member_DateOfBirth,Submitter_Id,Submitter_Name,Relationship_To_Subscriber_Code,Patient_Control_Number,Medical_Record_Number,Admission_Date,Admission_TimeCount,Admission_Type_Code,Admission_Source_Code,Discharge_Status_Code,Tax_Identification_Number,Supplier_Name,Supplier_Address,Supplier_CityName,Supplier_StateCode,Supplier_ZipCode,Supplier_ZipSuffixCode,Supplier_TelephoneNumber,Supplier_Npi,Attending_Practitioner_FullName,Attending_Practitioner_FirstName,Attending_practitioner_LastName,Attending_practitioner_Npi,Attending_Practitioner_Id,Attending_Practitioner_Id_Qualifier,Operating_Practitioner_FirstName,Operating_practitioner_LastName,Operating_practitioner_Npi,Operating_Practitioner_Id,Operating_Practitioner_Id_Qualifier,Other_Practitioner_FirstName,Other_practitioner_LastName,Other_practitioner_Npi,Other_Practitioner_Id,Other_Practitioner_Id_Qualifier,Payer_Identification_Number,Primary_Diagnosis_Code,Primary_Diagnosis_POAIndicator,Admit_Diagnosis_Code,Release_Information_Ind,Benefit_Assignment_Indicator,Payer_Name,Number_of_service_lines,Original_Line_Number,Revenue_Code,Service_Code,Service_Date,Service_Unit_Count,Total_Charge_Amount
INS1,"Create Scenario (Final Status)
single line Claim",C123.xml,1,1,1,,2021-04-23T00:00:00.000,,Supplier,1,2011349153671323002,1,TP0001,Unknown,1,MA,131,1000,Supplier_Clinic,2050 E Osceola Pkwy,Kissimmee,FL,34743,,,Supplier_Clinic,2050 E Osceola Pkwy,Kissimmee,FL,34743,8602,617-123-1234,E,null,Dynamic,200008488,200008488,"Muller, Nathanial",Muller,Nathanial,72047 Isaias Underpass,Greeley,CO,80639,M,,SD0135,Individual OffEx,200008488-01,"Muller, Nathanial",Muller,Nathanial,72047 Isaias Underpass,Greeley,CO,80639,M,1981-04-30,200008488-01,"Muller, Nathanial",Self,123456,123,,1110,1,1,01,99-9999999,Supplier_Clinic,2050 E Osceola Pkwy,Kissimmee,FL,34743,8602,617-123-1234,Nill,Paul Aguillon,Paul,Aguillon,1275813552,P00000299,G2,Paul,Aguillon,1275813552,P00000299,G2,Paul,Aguillon,1275813552,P00000299,G2,S00000002,R45,Y,R45,Y,Y,Supplier_Clinic,1,,,,,,
INS1,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,1,0300,99242,,1,1000
INS2,Final to Replacement Claim,C123.xml,1,1,1,,2021-04-23T00:00:00.000,,Supplier,1,2011349153671323002,1,TP0001,Unknown,1,MA,131,1000,Supplier_Clinic,2050 E Osceola Pkwy,Kissimmee,FL,34743,,,Supplier_Clinic,2050 E Osceola Pkwy,Kissimmee,FL,34743,8602,617-123-1234,E,null,Dynamic,200008489,200008489,"Murazik, Ma",Murazik,Ma,1220 Greenholt Loop,Greeley,CO,80639,M,,SD0135,Individual OffEx,200008489-01,"Murazik, Ma",Murazik,Ma,1220 Greenholt Loop,Greeley,CO,80639,M,1981-04-30,200008489-01,"Murazik, Ma",Self,123456,123,,1110,1,1,01,99-9999999,Supplier_Clinic,2050 E Osceola Pkwy,Kissimmee,FL,34743,8602,617-123-1234,Nill,Paul Aguillon,Paul,Aguillon,1275813552,P00000299,G2,Paul,Aguillon,1275813552,P00000299,G2,Paul,Aguillon,1275813552,P00000299,G2,S00000002,R45,Y,R45,Y,Y,Supplier_Clinic,1,,,,,,
INS2,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,1,0300,99241,,1,1000
INS3,"Create Scenario (Final Status)
Multiple line Claim",C3123.xml,1,1,1,,2021-04-23T00:00:00.000,,Supplier,1,2011349153671323002,1,TP0001,Unknown,1,MA,131,1000,Supplier_Clinic,2050 E Osceola Pkwy,Kissimmee,FL,34743,,,Supplier_Clinic,2050 E Osceola Pkwy,Kissimmee,FL,34743,8602,617-123-1234,E,null,Dynamic,200008490,200008490,"McClure, Shin",McClure,Shin,898 Leana Grove,Greeley,CO,80639,M,,SD0135,Individual OffEx,200008490-01,"McClure, Shin",McClure,Shin,898 Leana Grove,Greeley,CO,80639,M,1981-04-30,200008490-01,"McClure, Shin",Self,123456,123,,1110,1,1,01,99-9999999,Supplier_Clinic,2050 E Osceola Pkwy,Kissimmee,FL,34743,8602,617-123-1234,Nill,Paul Aguillon,Paul,Aguillon,1275813552,P00000299,G2,Paul,Aguillon,1275813552,P00000299,G2,Paul,Aguillon,1275813552,P00000299,G2,S00000002,R45,Y,R45,Y,Y,Supplier_Clinic,3,,,,,,
INS3,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,1,0300,99241,,1,1000
INS3,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,2,0300,99242,,1,1000
INS3,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,3,0300,99243,,1,1000
INS4,Member Eligibility Scenario,C3123.xml,1,1,1,2021-12-12,2021-04-23T00:00:00.000,2021-12-12,Supplier,1,2011349153671323002,1,TP0001,Unknown,1,MA,131,1000,Supplier_Clinic,2050 E Osceola Pkwy,Kissimmee,FL,34743,2021-12-12,2021-12-12,Supplier_Clinic,2050 E Osceola Pkwy,Kissimmee,FL,34743,8602,617-123-1234,E,null,Dynamic,200008491,200008491,"Abbott, Sherwood",Abbott,Sherwood,79590 Quitzon Dale,Greeley,CO,80639,M,,SD0135,Individual OffEx,200008491-01,"Abbott, Sherwood",Abbott,Sherwood,79590 Quitzon Dale,Greeley,CO,80639,M,1981-04-30,200008491-01,"Abbott, Sherwood",Self,123456,123,,1110,1,1,01,99-9999999,Supplier_Clinic,2050 E Osceola Pkwy,Kissimmee,FL,34743,8602,617-123-1234,Nill,Paul Aguillon,Paul,Aguillon,1275813552,P00000299,G2,Paul,Aguillon,1275813552,P00000299,G2,Paul,Aguillon,1275813552,P00000299,G2,S00000002,R45,Y,R45,Y,Y,Supplier_Clinic,1,,,,,,
INS4,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,1,0300,99241,,1,1000
INS5,Invalid Type of bill Scenario - Single line,C123.xml,1,1,1,,2021-04-23T00:00:00.000,,Supplier,1,2011349153671323002,1,TP0001,Unknown,1,MA,1311,1000,Supplier_Clinic,2050 E Osceola Pkwy,Kissimmee,FL,34743,,,Supplier_Clinic,2050 E Osceola Pkwy,Kissimmee,FL,34743,8602,617-123-1234,E,null,Dynamic,200008492,200008492,"Koelpin, Kera",Koelpin,Kera,651 Williamson Via,Greeley,CO,80639,M,,SD0135,Individual OffEx,200008492-01,"Koelpin, Kera",Koelpin,Kera,651 Williamson Via,Greeley,CO,80639,M,1981-04-30,200008492-01,"Koelpin, Kera",Self,123456,123,,1110,1,1,01,99-9999999,Supplier_Clinic,2050 E Osceola Pkwy,Kissimmee,FL,34743,8602,617-123-1234,Nill,Paul Aguillon,Paul,Aguillon,1275813552,P00000299,G2,Paul,Aguillon,1275813552,P00000299,G2,Paul,Aguillon,1275813552,P00000299,G2,S00000002,R45,Y,R45,Y,Y,Supplier_Clinic,1,,,,,,
INS5,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,1,0300,99243,,1,1000
INS6,Rejected claim,C3123.xml,1,1,1,,2021-04-23T00:00:00.000,,Supplier,1,2011349153671323002,1,TP0001,Unknown,1,MA,131,1000,Supplier_Clinic,2050 E Osceola Pkwy,Kissimmee,FL,34743,,,Supplier_Clinic,2050 E Osceola Pkwy,Kissimmee,FL,34743,8602,617-123-1234,E,null,Dynamic,200008493,200008493,"Waters, Asley",Waters,Asley,76606 Christopher Shoals,Greeley,CO,80639,M,,SD0135,Individual OffEx,200008493-01,"Waters, Asley",Waters,Asley,76606 Christopher Shoals,Greeley,CO,80639,M,1981-04-30,200008493-01,"Waters, Asley",Self,123456,123,,1110,1,1,01,99-0000000,Supplier_Clinic12345,2050 E Osceola Pkwy,Kissimmee,FL,34743,8602,617-123-1234,Nill,Paul Aguillon,Paul,Aguillon,1275813552,P00000299,G2,Paul,Aguillon,1275813552,P00000299,G2,Paul,Aguillon,1275813552,P00000299,G2,S00000002,R45,Y,R45,Y,Y,Supplier_Clinic,1,,,,,,
INS6,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,1,0300,99241,,1,1000
INS7,High Dollar Claim,C123.xml,1,1,1,,2021-04-23T00:00:00.000,,Supplier,1,2011349153671323002,1,TP0001,Unknown,1,MA,131,1000,Supplier_Clinic,2050 E Osceola Pkwy,Kissimmee,FL,34743,,,Supplier_Clinic,2050 E Osceola Pkwy,Kissimmee,FL,34743,8602,617-123-1234,E,null,Dynamic,200008494,200008494,"Nikolaus, Stefanie",Nikolaus,Stefanie,541 Lynn Mount,Greeley,CO,80639,M,,SD0135,Individual OffEx,200008494-01,"Nikolaus, Stefanie",Nikolaus,Stefanie,541 Lynn Mount,Greeley,CO,80639,M,1981-04-30,200008494-01,"Nikolaus, Stefanie",Self,123456,123,,1110,1,1,01,99-9999999,Supplier_Clinic,2050 E Osceola Pkwy,Kissimmee,FL,34743,8602,617-123-1234,Nill,Paul Aguillon,Paul,Aguillon,1275813552,P00000299,G2,Paul,Aguillon,1275813552,P00000299,G2,Paul,Aguillon,1275813552,P00000299,G2,S00000002,R45,Y,R45,Y,Y,Supplier_Clinic,1,,,,,,
INS7,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,1,0300,99241,,1,50000
INS8,Claim Attachment Validation,C123.xml,1,1,1,,2021-04-23T00:00:00.000,,Supplier,1,2011349153671323002,1,TP0001,Unknown,1,MA,131,1000,Supplier_Clinic,2050 E Osceola Pkwy,Kissimmee,FL,34743,,,Supplier_Clinic,2050 E Osceola Pkwy,Kissimmee,FL,34743,8602,617-123-1234,S,www.google.com,Dynamic,200008495,200008495,"Kunde, Iona",Kunde,Iona,74937 Agueda Locks,Greeley,CO,80639,M,,SD0135,Individual OffEx,200008495-01,"Kunde, Iona",Kunde,Iona,74937 Agueda Locks,Greeley,CO,80639,M,1981-04-30,200008495-01,"Kunde, Iona",Self,123456,123,,1110,1,1,01,99-9999999,Supplier_Clinic,2050 E Osceola Pkwy,Kissimmee,FL,34743,8602,617-123-1234,Nill,Paul Aguillon,Paul,Aguillon,1275813552,P00000299,G2,Paul,Aguillon,1275813552,P00000299,G2,Paul,Aguillon,1275813552,P00000299,G2,S00000002,R45,Y,R45,Y,Y,Supplier_Clinic,Attachment_Claim,,,,,,
INS8,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,1,0300,99211,,1,1000
```

## QA Automation/EdifecsProduct_MappingSpec_QA Automation_837I_EDI_to_CSVConversion_V1.0.xlsx — 837I

```csv
EDI LoopID.Segment,EDI Data Element Name,EDI Element Description,Usage,Enumeration Values,Sample values,CSV Field,Claim Level/Line Level,Transformation Logic
"For each claim record  in the IB EDI 837I file, there should be
             1) A claim level record and
              2) Line level records corresponding to each line of the claim
           in the CSV file.",,,,,,,,
ISA - Interchange Control Header Segment,,,,,,,,
ISA01,Authorization Information Qualifier,Code identifying the type of information in the Authorization Information,R,00 : No Authorization Information Present,,,,
ISA02,Authorization Information,Code identifying the type of information in the Authorization Information,R,"00: No Authorization Information Present (No
Meaningful Information in I02)
03:Additional Data Identification",,,,
ISA03,Security Information Qualifier,Code identifying the type of information in the Security Information,R,00,,,,
ISA04,Security Information,"security information about the interchange sender
or the data in the interchange",R,Blank (10 spaces),,,,
ISA05,Interchange ID Qualifier,"Code indicating the system/method of code structure used to designate the
sender or receiver ID element being qualified",R,ZZ - Mutually Defined,,,,
ISA06,Interchange Sender ID,"Identification code published by the sender for other parties to use as the receiver
ID to route data to them; the sender always codes this value in the sender ID
element",R,<Sender ID>,Example: 100SS,SenderId,Claim Level,
,,,,,,TradingPartnerID,Claim Level,
ISA07,Interchange ID Qualifier,"Code indicating the system/method of code structure used to designate the
sender or receiver ID element being qualified",R,ZZ,,,,
ISA08,Interchange Receiver ID,Receiver Id,R,<Receiver ID>,,ReceiverId,Claim Level,
ISA09,Interchange Date,Date of the interchange,R,SysDate (YYMMDD),Example : 220915,,,
ISA10,Interchange Time,Time of the interchange,R,SysTime (HHMM),Example : 0145,,,
ISA11,Repetition Separator,"the repetition separator is a delimiter and not a data
element; this field provides the delimiter used to separate repeated occurrences
of a simple data element or a composite data structure; this value must be
different than the data element separator, component element separator, and the
segment terminator",R,^,,,,
ISA12,Interchange Control Version Number,Code specifying the version number of the interchange control segments,R,00501,,,,
ISA13,Interchange Control Number,A control number assigned by the interchange sender,R,,Exaample:000004846,,,
ISA14,Acknowledgment Requested,Code indicating sender’s request for an interchange acknowledgment,R,1= Interchange Acknowledgment Requested,,,,
ISA15,Interchange Usage Indicator,"Code indicating whether data enclosed by this interchange envelope is test,
production or information",R,P=Production,,,,
ISA16,Component Element Separator,The delimiter used to separate component data elements,R,: = Element Seperator,,,,
GS -Functional Group Header Segment,,,,,,,,
GS01,Functional Identifier Code,The two-character identifier Code for the transaction set included.,R,HC : Health Care Claim (837),,,,
GS02,Application Sender's Code,"Code identifying party sending transmission,  codes agreed to by trading partners
This is Submitter-specific.",R,<Sender ID>,Example : 100ZM,,,
GS03,Application Receiver's Code,Code identifying party receiving transmission; codes agreed to by trading partners,R,<HealthPlan ID>,,,,
GS04,Date,Date the Group Header is created.,R,SysDate (YYYYMMDD),20210701,,,
GS05,Time,Time the Group Header is created.,R,SysTime (HHMM),1213,,,
GS06,Group Control Number,Submitter-specific number.,R,<Group Control Number>,75041,,,
GS07,Responsible Agency Code,Code identifying the issuer of the EDI standard being used.,R,X : Accredited Standards Committee X12,,,,
GS08,Version / Release / Industry Identifier Code,"Code indicating the version, release, subrelease, and industry identifier of the EDI
standard being used,
ST03 and GS08 must be identical",R,005010X223A2,,,,
ST - Transaction Set Header Segment,,,,,,,,
ST01,Transaction Set Identifier Code,Code uniquely identifying a Transaction Set,R,837 : Health Care Claim,,,,
ST02,Transaction Set Control Number,Unique Sequential Number Assigned by Internal Processes for each Transaction Set. Starts from 001 and increments with each transaction set,R,"<Transaction set Control Number>
Starts from 001 and increments with each transaction set",002,,,
ST03,Implementation Convention Reference,Standards Approved by ACS X12 Review Board.                 ST03 and GS08 must be identical,R,005010X223A2,,,,
BHT - Beginning Of Hierarchical Transaction Segment,,,,,,,,
BHT01,Hierarchical Structure Code,Code indicating the hierarchical application structure of a transaction set,R,"0019- Information Source, Subscriber, Dependent",,,,
BHT02,Transaction Set Purpose Code,"Code identifying purpose of transaction set.  Used to convey the electronic transmission status of
the 837 batch",R,"00 : Original
18 : Reissue",,,,
BHT03,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,<Originator Application Transaction Identifier>,75041,,,
BHT04,Date,The date the transaction was created,R,SysDate (YYYYMMDD) -,20210701,Receipt_Date,Claim Level,Format : YYYY-MM-DD
,,,,,,Clean_Claim_Date,Claim Level,Format : YYYY-MM-DD
BHT05,Time,The time the transaction was created,R,SysTime (HHMMSS),121314,,,
BHT06,Transaction Type Code,Code specifying the type of transaction,R,CH- Chargeable,,,,
Loop 1000A (Required)Loop Repeat: 1,,,,,,,,
Segment NM1 - Submitter Name  (Required),,,,,,,,
1000A.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,41 : Submitter,,,,
1000A.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,"1 : Person
2 : Non-person Entity",,,,
1000A.NM103,Name Last or Organization Name,Individual last name or organizational name,R,<Submitter Last/Org Name>,THE SSI GROUP,Submitter_Name,Claim Level,
1000A.NM104,Name First,Individual first name,S,,,,,
1000A.NM105,Name Middle,Individual middle name or initial,S,,,,,
1000A.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code",R,46 : Electronic Transmitter Identification Number (ETIN,,,,
1000A.NM109,Identification Code,Code identifying a party or other code,R,<Submitter ID>,100SS,Submitter_Id,Claim Level,
Segment PER - Submitter EDI Contact Information,,,,,,,,
1000A.PER01,Contact Function Code,Code identifying the major duty or responsibility of the person or group named,R,IC,,,,
1000A.PER02,Name,Submitter Contact Name,S,<Submitter Name> - JOAN KOSSOW,,,,
1000A.PER03,Communication Number Qualifier,Code identifying the type of communication number,R,"""EM"" - Electronic Mail
""FX"" - Facsimile
""TE"" - Telephone",,,,
1000A.PER04,Communication Number,Complete communications number including country or area code when applicable,R,<Email/Faxsimile Number/Telephone Number> - 2513450000,,,,
1000A.PER05,Communication Number Qualifier,Code identifying the type of communication number,S,"""EM"" - Electronic Mail
""FX"" - Facsimile
""TE"" - Telephone",,,,
1000A.PER06,Communication Number,Complete communications number including country or area code when applicable,S,<Email/Faxsimile Number/Telephone Number> 2513450100,,,,
1000A.PER07,Communication Number Qualifier,Code identifying the type of communication number,S,"""EM"" - Electronic Mail EM
""FX"" - Facsimile
""TE"" - Telephone",,,,
1000A.PER08,Communication Number,Complete communications number including country or area code when applicable,S,<Email/Faxsimile Number/Telephone Number>,,,,
Loop 1000B (Required)Loop Repeat: 1,,,,,,,,
Segment NM1 - Receiver Name  (Required),,,,,,,,
1000B.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,40 : Receiver,,,,
1000B.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,"1 : Person
2 : Non-person Entity",,,,
1000B.NM103,Name Last or Organization Name,Code identifying an organizational NAME,R,,HealthPlan Name,,,
1000B.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code",R,46 : Electronic Transmitter Identification Number (ETIN,,,,
1000B.NM109,Identification Code,Code identifying a party,R,,<HealthPlan Payer ID>,,,
Loop 2000A (Required)Loop Repeat: >1,,,,,,,,
Segment HL - Billing Provider Hierarchical Level  (Required),,,,,,,,
2000A.HL01,Hierarchical ID Number,"A unique number assigned by the sender to identify a particular data segment in
a hierarchical structure",R,"The first HL01 within each ST-SE envelope must begin with “1”,
and be incremented by one each time an HL is used in the
transaction",,,,
2000A.HL03,Hierarchical Level Code,Code defining the characteristic of a level in a hierarchical structure,R,20 : Information Source,,,,
2000A.HL04,Hierarchical Child Code,"Code indicating if there are hierarchical child data segments subordinate to the
level being described.",R,"1 : Additional Subordinate HL Data Segment in This
Hierarchical Structure.",,,,
Segment PRV - Billing Provider Specialty Information  (Situational),,,,,,,,
2000A.PRV01,Provider Code,Code identifying the type of provider,R,BI : Billing,,,,
2000A.PRV02,Reference Identification Qualifier,Code qualifying the Reference Identification,R,PXC :  Health Care Provider Taxonomy Code,,,,
2000A.PRV03,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,
Segment CUR - Foreign Currency Information (Situational),,,,,,,,
2000A.CUR01,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,85 - Billing provider,,,,
2000A.CUR02,Currency Code,Code (Standard ISO) for country in whose currency the charges are specified,R,<Currency Code>,,,,
Loop 2010AA (Required) Loop Repeat: 1,,,,,,,,
Segment NM1 - Billing Provider Name (Required),,,,,,,,
2010AA.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,85 - Billing provider,,,,
2010AA.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,"1 : Person
2 : Non-Person Entity",,,,
2010AA.NM103,Name Last or Organization Name,Individual last name or organizational name,R,<Billing Provider Organizational Name>,MILLCREEK OF ARKANSAS,PayTo_Name,Claim Level,
,,,,,,BillingRecipient_Name,Claim Level,
,,,,,,Supplier_Name,Claim Level,
2010AA.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code (67)",S,"XX :  Centers for Medicare and Medicaid Services
National Provider Identifier",,,,
2010AA.NM109,Identification Code,Code identifying a party or other code / Billing Provider Identifier,S,<Billing Provider NPI> -,0052482036,Supplier_Npi,Claim Level,
Segment N3 - Billing Provider Address (Required),,,,,,,,
2010AA.N301,Address Information,Code identifying the address,R,<Billing Provider Address Line>,4495 YUKON COURT APT 78,BillingRecipient_Address,Claim Level,"Concatenate the N301 and N302 value (if present)  separated by comma and space (, )"
,,,,,,Supplier_Address,Claim Level,"Concatenate the N301 and N302 value (if present)  separated by comma and space (, )"
2010AA.N302,Address Information,Code identifying the address,S,<Billing Provider Address Line>,PO BOX 17471,,,
"Segment N4 - Billing Provider City, State, ZIP Code (Required)",,,,,,,,
2010AA.N401,City Name,Code identifying the address,R,,DENVER,BillingRecipient_CityName,Claim Level,
,,,,,,Supplier_CityName,Claim Level,
2010AA.N402,State or Province Code,Code identifying the address,S,,CO,BillingRecipient_StateCode,Claim Level,
,,,,,,Supplier_StateCode,Claim Level,
2010AA.N403,Postal Code,Code identifying the address,S,,802044507,BillingRecipient_ZipCode,Claim Level,Map byte 1-5 byte
,,,,,,Supplier_ZipCode,Claim Level,Map byte 1-5 byte
,,,,,,BillingRecipient_ZipSuffixCode,Claim Level,Map byte 6-9
,,,,,,Supplier_ZipSuffixCode,Claim Level,Map byte 6-9
2010AA.N404,Country Code,Code identifying the address,S,,,,,
2010AA.N407,Country Subdivision Code,,S,,,,,
Segment REF - Billing Provider Tax Identification (Required),,,,,,,,
2010AA.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,EI : Employer’s Identification Number,,,,
2010AA.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,Tax_Identification_Number,Claim Level,Format : XXX-XXXXXX
Segment - PER Billing Provider Contact Information (Situational),,,,,,,,
2010AA.PER01,Contact Function Code,Code identifying the major duty or responsibility of the person or group name,R,IC -  Information Contact,,,,
2010AA.PER02,Name,Billing Provider Contact Name,S,,,,,
2010AA.PER03,Communication Number Qualifier,Code identifying the type of communication number,R,"""EM"" : Electronic Mail
""FX"" : Facsimile
""TE"" : Telephone","FX- Facsimile
TE - Telephone",,,
2010AA.PER04,Communication Number,"Complete communications number including
country or area code",R,,3033981735,Supplier_TelephoneNumber,Claim Level,If PER03=TE'
,,,,,,BillingRecipient_TelephoneNumber,Claim Level,If PER03=TE'
2010AA.PER05,Communication Number Qualifier,Code identifying the type of communication numbe,S,"""EM"" : Electronic Mail
""FX"" : Facsimile
""TE"" : Telephone
""EX"" : Telephone Extension","FX- Facsimile
TE - Telephone",,,
2010AA.PER06,Communication Number,Communication Number,S,,3033981649,,,
Loop 2010AB (Situational) Loop Repeat: 1,,,,,,,,
Segment - NM1 Pay-to Address Name (Situational),,,,,,,,
2010AB.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,87: Pay-to Provider,,,,
2010AB.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,"1 : Person
2:  Non-Person Entity",,,,
Segment - N3 Pay-to Address - ADDRESS (Required),,,,,,,,
2010AB.N301,Address Information,Address Information,R,,PO BOX 17379,PayTo_Address,Claim Level,"Concatenate the N301 and N302 value (if present)  separated by comma and space (, )"
2010AB.N302,Address Information,Address Information,S,,,PayTo_Address,Claim Level,
"Segment - N4 Pay-To Address City, State, ZIP Code (Required)",,,,,,,,
2010AB.N401,City Name,Free-form text for city name,R,,DENVER,PayTo_CityName,Claim Level,
2010AB.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,CO,PayTo_StateCode,Claim Level,
2010AB.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,802170379,PayTo_Zip_Code,Claim Level,1-5 digits
2010AB.N404,Country Code,Code identifying the country,S,,,,,
2010AB.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,
Loop 2010AC (Situational)  Loop Repeat: 1,,,,,,,,
Segment - NM1 Pay-To Plan Name (Situational),,,,,,,,
2010AC.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,PE : Payee,,,,
2010AC.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,2 : Non-Person Entity,,,,
2010AC.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,,,
2010AC.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),R,,,,,
2010AC.NM109,Identification Code,Code identifying a party or other code,R,,,,,
Segment - N3 Pay-to Plan Address (Required),,,,,,,,
2010AC.N301,Address Information,Address Information,R,,,,,
2010AC.N302,Address Information,Address Information,S,,,,,
"Segment - N4 Pay-To Plan City, State, ZIP Code (Required)",,,,,,,,
2010AC.N401,City Name,Free-form text for city name,R,,,,,
2010AC.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,,,
2010AC.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,,,,
2010AC.N404,Country Code,Code identifying the country,S,,,,,
2010AC.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,
Segment - REF Pay-to Plan Secondary Identification (Required),,,,,,,,
2010AC.REF01,Reference Identification Qualifier,,R,,,,,
2010AC.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,
Segment - REF Pay-To Plan Tax Identification Number (Required),,,,,,,,
2010AC.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,EI : Employer’s Identification Number,,,,
2010AC.REF02,Reference Identification,"Reference information as specified
by the Reference Identification Qualifier",R,,,,,
Loop 2000B (Required) Loop Repeat: >1,,,,,,,,
Segment - HL Subscriber Hierarchical Level (Required),,,,,,,,
2000B.HL01,Hierarchical ID Number,"A unique number assigned by the sender to identify a particular data segment in
a hierarchical structure",R,"2000A.HL01 + 1

Incremented at each new HL segment.",,,,
2000B.HL02,Hierarchical Parent ID Number,"Identification number of the next higher hierarchical data segment that the data
segment being described is subordinate to",R,2000A.HL01,,,,
2000B.HL03,Hierarchical Level Code,Code defining the characteristic of a level in a hierarchical structure,R,22- Subscriber,,,,
2000B.HL04,Hierarchical Child Code,"Code indicating if there are hierarchical child data segments subordinate to the
level being described.",R,"0 :  HL04 has no subordinate levels  (the subscriber is the patient and there are no dependent claims)
1: HL04 has subordinate levels",0 /1 Based On The Count - 1,,,
Segment - SBR Subscriber Information (Required),,,,,,,,
2000B.SBR01,Payer Responsibility Sequence Number Code,"Code identifying the insurance carrier’s level of responsibility for a payment of a
claim",R,"P : Primary
S : Secondary
T  : Tertiary",S,,,
2000B.SBR02,Individual Relationship Code,Code indicating the relationship between two individuals or entities,S,"1 Spouse
18 Self
19 Child
20 Employee
21 Unknown
39 Organ Donor
40 Cadaver Donor
53 Life Partner
G8 Other Relationship",,Relationship_To_Subscriber_Code,Claim Level,Only if 2000C loop doesn’t exists.
2000B.SBR03,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,S,,,Subscriber_Insurance_Group_Number,Claim Level,
2000B.SBR04,Name,,S,,,Subscriber_Group_Name,Claim Level,
2000B.SBR09,Claim Filing Indicator Code,Code identifying type of claim,S,"11 : Other Non-Federal Programs
12 : Preferred Provider Organization (PPO)
13 : Point of Service (POS)
14 : Exclusive Provider Organization (EPO)
15 : Indemnity Insurance
16 : Health Maintenance Organization (HMO) Medicare
Risk
17 : Dental Maintenance Organization
AM :  Automobile Medical
BL :  Blue Cross/Blue Shield
CH :  Champus
CI :  Commercial Insurance Co.
DS :  Disability
FI :  Federal Employees Program
HM :  Health Maintenance Organization
LM :  Liability Medical
MA :  Medicare Part A
MB :  Medicare Part B
MC :  Medicaid
OF :  Other Federal Program
1484 Use code OF when submitting Medicare Part D
claims.
TV Title V
VA Veterans Affairs Plan
WC Workers’ Compensation Health Claim
ZZ Mutually Defined
71 Use Code ZZ when Type of Insurance is not known.",,Claim_Filing_Code,Claim Level,
Loop 2010BA (Required)Loop Repeat: 1,,,,,,,,
Segment - NM1 Subscriber Name (Required),,,,,,,,
2010BA.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,IL :  Insured or Subscriber,,,,
2010BA.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,"1 : Person
2 : Non-Person Entity",,,,
2010BA.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,Subscriber_Last_Name,Claim Level,
,,,,,,Member_Last_Name,Claim Level,Only if 2000C loop doesn’t exists.
2010BA.NM104,Name First,Individual first name,S,,,Subscriber_Name,Claim Level,concatenate NM104/5/3/7 (First Middle Last Suffix)
,,,,,,Member_Name,Claim Level,"Only if 2000C loop doesn’t exists.
concatenate NM104/5/3/7 (First Middle Last Suffix)"
,,,,,,Subscriber_First_Name,Claim Level,
,,,,,,Member_First_Name,Claim Level,Only if 2000C loop doesn’t exists.
2010BA.NM105,Name Middle,Individual middle name or initial,S,,,,,
2010BA.NM107,Name Suffix,Suffix,S,,,,,
2010BA.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code",S,"II :  Standard Unique Health Identifier for each Individual in the United States
MI  :  Member Identification Number",,,,
2010BA.NM109,Identification Code,Code identifying a party or other code / Subscriber Primary Identifier,S,,000561005,Submitted_Subscriber_Id,Claim Level,
,,,,,,Subscriber_Identification_Number,Claim Level,
,,,,,,Member_Identification_Number,Claim Level,Only if 2000C loop doesn’t exists.
Segment - N3 Subscriber Address (Situational),,,,,,,,
2010BA.N301,Address Information,Address Information,R,,4495 YUKON COURT APT 78,Member_Street_Address,Claim Level,Only if 2000C loop doesn’t exists.
,,,,,,Subscriber_Street_Address,Claim Level,
2010BA.N302,Address Information,,S,,,,,
"Segment - N4 Subscriber City, State, ZIP Code (Situational)",,,,,,,,
2010BA.N401,City Name,Free-form text for city name,R,,WHEAT RIDGE,Member_City_Name,Claim Level,Only if 2000C loop doesn’t exists.
,,,,,,Subscriber_City_Name,Claim Level,
2010BA.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,CO,Member_State_Code,Claim Level,Only if 2000C loop doesn’t exists.
,,,,,,Subscriber_State_Code,Claim Level,
2010BA.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,800333283,Member_Postal_Code,Claim Level,Only if 2000C loop doesn’t exists.
,,,,,,Subscriber_Postal_Code,Claim Level,
2010BA.N404,Country Code,Code identifying the country,S,,,,,
2010BA.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,
Segment - DMG Subscriber Demographic Information (Situational),,,,,,,,
2010BA.DMG01,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 :  Date Expressed in Format,,,,
2010BA.DMG02,Date Time Period,Date Time Period,R,YYYYMMDD,,Member_DateOfBirth,Claim Level,"Only if 2000C loop doesn’t exists.
Format :YYYY-MM-DD"
,,,,,,Subscriber_Date_Of_Birth,Claim Level,Format :YYYY-MM-DD
2010BA.DMG03,Gender Code,Code indicating the sex of the individual,R,"F : Female
M : Male",,Member_Gender_Code,Claim Level,Only if 2000C loop doesn’t exists.
,,,,,,Subscriber_Gender_Code,Claim Level,
Segment - REF Subscriber Secondary Identification (Situational),,,,,,,,
2010BA.REF01,Reference Identification Qualifier,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,SY Social Security Number,,,,
2010BA.REF02,Reference Identification,Code qualifying the Reference Identification,R,,,,,
Segment - REF Property and Casualty Claim Number (Situational),,,,,,,,
2010BA.REF01,Reference Identification Qualifier,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,Y4 Agency Claim Number,,,,
2010BA.REF02,Reference Identification,Code qualifying the Reference Identification,R,,,,,
Loop 2010BB (Required) Loop Repeat: 1,,,,,,,,
Segment - NM1 Payer Name (Required),,,,,,,,
2010BB.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,PR -Payer,,,,
2010BB.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,2 :Non-Person Entity,,,,
2010BB.NM103,Name Last or Organization Name,Name Last or Organization Name,R,HealthPlan,,Payer_Name,Claim Level,
2010BB.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code",R,"PI :  Payor Identification
XV : Centers for Medicare and Medicaid Services PlanID",,,,
2010BB.NM109,Identification Code,Code identifying a party or other code / Subscriber Primary Identifier,R,,COACC,Payer_Identification_Number,Claim Level,
Segment - N3 Payer Address (Situational),,,,,,,,
2010BB.N301,Address Information,Address Information,R,,PO BOX 17471,,,
2010BB.N302,Address Information,Address Information,S,,,,,
"Segment - N4 Payer City, State, ZIP Code (Situational)",,,,,,,,
2010BB.N401,City Name,Free-form text for city name,R,,DENVER,,,
2010BB.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,CO,,,
2010BB.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,802170470,,,
2010BB.N404,Country Code,Code identifying the country,S,,,,,
2010BB.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,
Segment - REF Payer Secondary Identification (Situational),,,,,,,,
2010BB.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,,,,,
2010BB.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,
Segment - REF Billing Provider Secondary Identification (Situational),,,,,,,,
2010BB.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,,,,,
2010BB.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,
2010BB.DMG03,Gender Code,,R,,,,,
"Loop 2000C - Patient Hierarchical Level (Situational)  In case of dependent claims (if the dependant is the patient ),  2000C loop will be there and the 2300 and 2400 loop will be below 2000C in that scenario)",,,,,,,,
Segment HL -  Patient Hierarchical Level (Situational),,,,,,,,
2000C.HL01,Hierarchical ID Number,"A unique number assigned by the sender to identify a particular data segment in
a hierarchical structure",R,,,,,
2000C.HL02,Hierarchical Parent ID Number,"Identification number of the next higher hierarchical data segment that the data
segment being described is subordinate to",R,,,,,
2000C.HL03,Hierarchical Level Code,Code defining the characteristic of a level in a hierarchical structure,R,"23 : Dependent (the information
in this HL applies to the patient when the subscriber
and the patient are not the same person)",,,,
2000C.HL04,Hierarchical Child Code,"Code indicating if there are hierarchical child data segments subordinate to the
level being described",R,"0 :  No Subordinate HL Segment in This Hierarchical
Structure",,,,
Segment PAT - Patient information,,,,,,,,
2000C.PAT01,Individual Relationship Code,Code indicating the relationship between two individuals or entities,R,"01 : Spouse
19 : Child
18:self
20 : Employee
21 : Unknown
39 : Organ Donor
40:  Cadaver Donor
53:  Life Partner
G8 : Other Relationship",,Relationship_To_Subscriber_Code,Claim Level,
Loop 2010CA - Patient Name (Situational)  Loop Repeat: 1,,,,,,,,
Segment - NM1 Patient Name (Required),,,,,,,,
2010CA.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,QC : Patient,,,,
2010CA.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,1: Person,,,,
2010CA.NM103,Name Last or Organization Name,Organization Name Last Name,R,,,Member_Last_Name,Claim Level,
,,,,,,Member_Name,Claim Level,concatenate NM104/5/3/7 (First Middle Last Suffix)
2010CA.NM104,Name First,Patient  First Name,S,,,Member_First_Name,Claim Level,
2010CA.NM105,Name Middle,Patient Middle Name or Initial,S,,,,,
2010CA.NM107,Name Suffix,Patient Name Suffix,S,,,,,
Segment - N3 Patient Address (Situational),,,,,,,,
2010CA.N301,Address Information,Code identifying the Patient address,R,,1000 JACKSON ST,Member_Street_Address,Claim Level,
2010CA.N302,Address Information,Code identifying the Patient address,S,,,,,
"Segment - N4 Patient City, State, ZIP Code (Situational)",,,,,,,,
2010CA.N401,City Name,Free-form text for city name,R,,,Member_City_Name,Claim Level,
2010CA.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,Member_State_Code,Claim Level,
2010CA.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks,S,,,Member_Postal_Code,Claim Level,
2010CA.N404,Country Code,Code identifying the country,S,,,,,
2010CA.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,
Segment - DMG Patient Demographic Information (Situational),,,,,,,,
2010CA.DMG01,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 : Date Expressed in Format CCYYMMDD,,,,
2010CA.DMG02,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times/Patient Birth Date",R,,19670712,Member_DateOfBirth,Claim Level,Format : YYYY-MM-DD
2010CA.DMG03,Gender Code,Code indicating the sex of the individual,R,"F: Female
M :Male
U : Unknown",,Member_Gender_Code,Claim Level,
Segment - Property and Casuality Claim Number (Situational),,,,,,,,
2010CA.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,Y4 Agency Claim Number,,,,
2010CA.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,
"Loop 2300  - CLAIM INFORMATION(Required)  Loop Repeat: 100
       When patient is the subscriber : The claim information(Loop ID-2300), is placed following Loop ID-2010BB in the Subscriber Hierarchical Level(HL) and patient information is sent in Loop ID-2010BA.
       When patient is the dependent :  The claim information(Loop ID-2300),is placed following Loop ID-2010CA  in the Patient HL and the patient information is sent in Loop ID-2010CA .",,,,,,,,
Segment - CLM Claim information (Situational),,,,,,,,
2300.CLM01,Claim Submitter's Identifier,Identifier used to track a claim from creation by the health care provider through payment,R,,<patientControlNumber> 1003795048I7791539,Patient_Control_Number,Claim Level,
2300.CLM02,Monetary Amount,"Monetary Amount   CLM02 is the total amount of all submitted charges of service segments
for this claim.",R,,214.25,Totals,Claim Level,
2300.CLM05.01,Facility Code Value,"Code identifying where services were, or may be, performed; the first
and second positions of the Uniform Bill Type Code for Institutional
Services or the Place of Service Codes for Professional or Dental
Services.",R,,,Type_Of_Bill_Code,Claim Level,
2300.CLM05.02,Facility Code Qualifier,Code identifying the type of facility referenced,R,A :Uniform Billing Claim Form Bill Type,,,,
2300.CLM05.03,Claim Frequency Type Code,"code specifying the frequency of the claim; this is the third position of
the Uniform Billing Claim Form Bill Type",R,1,,Frequency_Code,Claim Level,
2300.CLM07,Provider Accept Assignment Code,Code indicating whether the provider accepts assignment,R,"A : Assigned
B : Assignment Accepted on Clinical Lab Services Only
C :  Not Assigned",,,,
2300.CLM08,Yes/No Condition or Response Code,Benefits Assignment Certification Indicator,R,"Y : Yes
N : No
W :  Not Applicable",,Benefit_Assignment_Indicator,Claim Level,
2300.CLM09,Release of Information Code,"Code indicating whether the provider has on file a signed statement by the patient
authorizing the release of medical data to other organizations",R,"I : Informed Consent  to Release Medical Information for Conditions or Diagnoses
Y :Yes, Provider has a Signed Statement Permitting
Release of Medical Billing Data Related to a Claim",,Release_Information_Ind,Claim Level,
2300.CLM20,Delay Reason Code,Code indicating the reason why a request was delayed,S,,,,,
Segment - DTP Discharge Date/Hour (Situational),,,,,,,,
2300.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,096 Discharge,,,,
2300.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,"D8 Date Expressed in Format CCYYMMDD
DT Date and Time Expressed in Format
CCYYMMDDHHMM",,,,
2300.DTP03,Date Time Period,Date Time Period,R,HH:MM,,,,
Segment - DTP Statement Dates (Required),,,,,,,,
2300.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,434 Statement,,,,
2300.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8: Range of Dates Expressed in Format CCYYMMDDCCYYMMDD,,,,
2300.DTP03,Date Time Period,Date Time Period,R,,20210311-20210311,Statement_Start_Date,Claim Level,byte 1-8 in format YYYY-MM-DD
,,,,,,Statement_End_Date,Claim Level,byte 10-17  in format YYYY-MM-DD
Segment - DTP Admission Date/Hour (Situational),,,,,,,,
2300.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,435 :Admission,,,,
2300.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 :  Date Expressed in Format CCYYMMDD,,,,
2300.DTP03,Date Time Period,Date Time Period,R,"If D8 - CCYYMMDD
If DT- CCYYMMDDHH",,Admission_Date,Claim Level,In the format YYYY-MM-DD
,,,,,,Admission_TimeCount,Claim Level,when DTP02=DT map byte 9-12
Segment - DTP Date - Repricer Received Date (Situational),,,,,,,,
2300.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,050 Received,,,,
2300.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 :  Date Expressed in Format CCYYMMDD,,,,
2300.DTP03,Date Time Period,Date Time Period,R,"If D8 - CCYYMMDD
If DT- CCYYMMDDHH",,,,
Segment - CL1 Institutional Claim Code (Required),,,,,,,,
2300.CL101,Admission Type Code,Code indicating the priority of this admission,R,"1-Emergency
2-Urgent
3-Elective",,Admission_Type_Code,Claim Level,
2300.CL102,Admission Source Code,Code indicating the source of this admissio,S,,,Admission_Source_Code,Claim Level,
2300.CL103,Patient Status Code,Code indicating patient status as of the “statement covers through date,R,,,Discharge_Status_Code,Claim Level,
Segment - PWK Claim Supplemental Information (Situational),,,,,,,,
2300.PWK01,Report Type Code,"Code indicating the title or contents of a document, report or supporting item",R,"03 Report Justifying Treatment Beyond Utilization
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
A3 Allergies/Sensitivities Doc",,,,
2300.PWK02,Report Transmission Code,"Code defining timing, transmission method or format by which reports are to be
sent",R,"AA Available on Request at Provider Site
179 This means that the additional information is not
being sent with the claim at this time. Instead, it is
available to the payer (or appropriate entity) at their
request.
BM By Mail
EL Electronically Only
180 Indicates that the attachment is being transmitted in
a separate X12 functional group.
EM E-Mail
FT File Transfe",,,,
2300.PWK05,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code (67)",S,,,,,
2300.PWK06,Identification Code,Code identifying a party or other code,S,,,Attachment_Set_ID,Claim Level,
Segment - CN1 Contract Information (Situational),,,,,,,,
2300.CN101,Contract Type Code,Code identifying a contract type,R,"01 Diagnosis Related Group (DRG)
02 Per Diem
03 Variable Per Diem
04 Flat
05 Capitated
06 Percent
09 Other",,,,
2300.CN102,Monetary Amount,Monetary amount,S,,,,,
2300.CN103,"Percent, Decimal Format","Percent given in decimal format (e.g., 0.0 through 100.0 represents 0% through
100%)",S,,,,,
2300.CN104,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",S,,,,,
2300.CN105,Terms Discount Percent,"Terms discount percentage, expressed as a percent, available to the purchaser if
an invoice is paid on or before the Terms Discount Due Date",S,,,,,
2300.CN106,Version Identifier,"Revision level of a particular format, program, technique or algorithm",S,,,,,
Segment - AMT Patient Estimated Amount Due (Situational),,,,,,,,
2300.AMT01,Amount Qualifier Code,Code to qualify amount,R,F3 Patient Responsibility - Estimated,,,,
2300.AMT02,Monetary Amount,Monetary Amount,R,,,,,
Segment - REF Service Authorization Exception Code (Situational),,,,,,,,
2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,4N :Special Payment Reference Number,,,,
2300.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,"1 Immediate/Urgent Care
2 Services Rendered in a Retroactive Period
3 Emergency Care
4 Client has Temporary Medicaid
5 Request from County for Second Opinion to Determine
if Recipient Can Work
6 Request for Override Pending
7 Special Handling",,,,
Segment - REF Referral Number (Situational),,,,,,,,
2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,9F Referral Number,,,,
2300.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,
Segment - REF Prior Authorization (Situational),,,,,,,,
2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,G1 : Prior Authorization Number,,,,
2300.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,
Segment - REF Payer Claim Control Number (Situational),,,,,,,,
2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,F8 Original Reference Number,,,,
2300.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,Claim_Number,Claim Level,
Segment - REF Repriced Claim Number (Situational),,,,,,,,
2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,9A-Repriced Claim Reference Number,,,,
2300.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,
Segment - REF Adjusted Repriced Claim Number (Situational),,,,,,,,
2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,9C :  Adjusted Repriced Claim Reference Number,,,,
2300.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,
Segment - REF Investigational Device Exemption Number (Situational),,,,,,,,
2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,LX : Qualified Products List,,,,
2300.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,
Segment - REF Claim Identification For Transmission Intermediaries (Situational),,,,,,,,
2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,D9 : Claim Number,,,,
2300.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,Clearing_House_TraceNumber,Claim Level,
Segment - REF Auto Accident State (Situational),,,,,,,,
2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,LU Location Number,,,,
2300.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,
Segment - REF Medical Record Number (Situational),,,,,,,,
2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,EA Medical Record Identification Number,,,,
2300.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,Medical_Record_Number,Claim Level,
Segment - REF Demonstration Project Identifier (Situational),,,,,,,,
2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,P4 -Project Code,,,,
2300.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,
Segment - REF Peer Review Organization (PRO) Approval Number (Situational),,,,,,,,
2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,G4-Peer Review Organization (PRO) Approval Number,,,,
2300.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,
Segment - K3 File Information (Situational),,,,,,,,
2300.K301,Fixed Format Information,Data in fixed format agreed upon by sender and receiver,R,,,,,
Segment - NTE Claim Note (Situational),,,,,,,,
2300.NTE01,Note Reference Code,Code identifying the functional area or purpose for which the note applies,R,"ADD : Additional Information
CER : Certification Narrative
DCP : Goals, Rehabilitation Potential, or Discharge Plans",,,,
2300.NTE02,Description,A free-form description to clarify the related data elements and their content  /  Claim Note Text,R,,,,,
Segment - NTE Billing Note (Situational),,,,,,,,
2300.NTE01,Note Reference Code,Code identifying the functional area or purpose for which the note applies,R,"ADD : Additional Information
CER : Certification Narrative
DCP : Goals, Rehabilitation Potential, or Discharge Plans",,,,
2300.NTE02,Description,A free-form description to clarify the related data elements and their content  /  Claim Note Text,R,,,,,
Segment - CRC EPSDT Referral (Situational),,,,,,,,
2300.CRC01,Code Category,Specifies the situation or category to which the code applies,R,"E1 : Spectacle Lenses
E2 : Contact Lenses
E3 : Spectacle Frames",,,,
2300.CRC02,Yes/No Condition or Response Code,Certification Condition Indicator,R,"Y: Yes
N:NO",,,,
2300.CRC03,Condition Indicator,Code indicating a condition,R,"L1 : General Standard of 20 Degree or .5 Diopter Sphere or Cylinder Change Met
L2 : Replacement Due to Loss or Theft L3 : Replacement Due to Breakage or Damage
L4 : Replacement Due to Patient Preference
 L5 : Replacement Due to Medical Reason",,,,
2300.CRC04,Condition Indicator,Code indicating a condition,S,"AV Available - Not Used
652 Patient refused referral.
NU Not Used
653 This conditioner indicator must be used when the
submitter answers “N” in CRC02.
S2 Under Treatment
654 Patient is currently under treatment for referred
diagnostic or corrective health problem.
ST New Services Requested
655 Patient is referred to another provider for diagnostic
or corrective treatment for at least one health
problem identified during an initial or periodic
screening service (not including dental referrals).
OR
Patient is scheduled for another appointment with
screening provider for diagnostic or corrective
treatment for at least one health problem identified
during an initial or periodic screening service (not
including dental referrals).",,,,
2300.CRC05,Condition Indicator,Code indicating a condition,S,"AV Available - Not Used
652 Patient refused referral.
NU Not Used
653 This conditioner indicator must be used when the
submitter answers “N” in CRC02.
S2 Under Treatment
654 Patient is currently under treatment for referred
diagnostic or corrective health problem.
ST New Services Requested
655 Patient is referred to another provider for diagnostic
or corrective treatment for at least one health
problem identified during an initial or periodic
screening service (not including dental referrals).
OR
Patient is scheduled for another appointment with
screening provider for diagnostic or corrective
treatment for at least one health problem identified
during an initial or periodic screening service (not
including dental referrals).",,,,
Segment - HI Principal Diagnosis (Required),,,,,,,,
2300.HI01.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"ABK : ICD10 -CM - Principal Diagnosis
BK : ICD9 -CM - Principal Diagnosis",,,,
2300.HI01.02,Industry Code,Diagnosis Code,R,,,Primary_Diagnosis_Code,Claim Level,Place a dot (.) after 3rd character
2300.HI01.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,,,Primary_Diagnosis_POAIndicator,Claim Level,
Segment - HI Admitting Diagnosis (Situational),,,,,,,,
2300.HI01.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"ABJ -  International Classification of Diseases Clinical
Modification (ICD-10-CM) Admitting Diagnosis",,,,
2300.HI01.02,Industry Code,Diagnosis Code,R,,,Admit_Diagnosis_Code,Claim Level,Place a dot (.) after 3rd character
Segment - HI Patient Reason For Visit (Situational),,,,,,,,
2300.HI01.01,Code List Qualifier Code,Code identifying a specific industry code list/ Principal Diagnosis Type Code,R,"APR - International Classification of Diseases Clinical
Modification (ICD-10-CM) Patient’s Reason for Visit
PR- International Classification of Diseases Clinical
Modification (ICD-9-CM) Patient’s Reason for Visit",,,,
2300.HI01.02,Industry Code,Diagnosis Code,R,,,PRV_Diagnosis_Code1,Claim Level,Place a dot (.) after 3rd character
2300.HI02.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"APR - International Classification of Diseases Clinical
Modification (ICD-10-CM) Patient’s Reason for Visit
PR- International Classification of Diseases Clinical
Modification (ICD-9-CM) Patient’s Reason for Visit",,,,
2300.HI02.02,Industry Code,Diagnosis Code,R,,,PRV_Diagnosis_Code2,Claim Level,Place a dot (.) after 3rd character
2300.HI03.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"APR - International Classification of Diseases Clinical
Modification (ICD-10-CM) Patient’s Reason for Visit
PR- International Classification of Diseases Clinical
Modification (ICD-9-CM) Patient’s Reason for Visit",,,,
2300.HI03.02,Industry Code,Diagnosis Code,R,,,PRV_Diagnosis_Code3,Claim Level,Place a dot (.) after 3rd character
Segment - HI External Cause of Injury (Situational),,,,,,,,
2300.HI01.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"ABN : International Classification of Diseases Clinical
Modification (ICD-10-CM) External Cause of Injury
Code
BN : International Classification of Diseases Clinical
Modification (ICD-9-CM) External Cause of Injury
Code (E-codes)",,,,
2300.HI01.02,Industry Code,Diagnosis Code,R,,,External_Diagnosis_Code1,Claim Level,Place a dot (.) after 3rd character
2300.HI01.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,,,External_Diagnosis_POA1,Claim Level,
2300.HI02.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"ABN : International Classification of Diseases Clinical
Modification (ICD-10-CM) External Cause of Injury
Code
BN : International Classification of Diseases Clinical
Modification (ICD-9-CM) External Cause of Injury
Code (E-codes)",,,,
2300.HI02.02,Industry Code,Diagnosis Code,R,,,External_Diagnosis_Code2,Claim Level,Place a dot (.) after 3rd character
2300.HI02.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,,,External_Diagnosis_POA2,Claim Level,
2300.HI03.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"ABN : International Classification of Diseases Clinical
Modification (ICD-10-CM) External Cause of Injury
Code
BN : International Classification of Diseases Clinical
Modification (ICD-9-CM) External Cause of Injury
Code (E-codes)",,,,
2300.HI03.02,Industry Code,Diagnosis Code,R,,,External_Diagnosis_Code3,Claim Level,Place a dot (.) after 3rd character
2300.HI03.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,,,External_Diagnosis_POA3,Claim Level,
2300.HI04.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"ABN : International Classification of Diseases Clinical
Modification (ICD-10-CM) External Cause of Injury
Code
BN : International Classification of Diseases Clinical
Modification (ICD-9-CM) External Cause of Injury
Code (E-codes)",,,,
2300.HI04.02,Industry Code,Diagnosis Code,R,,,External_Diagnosis_Code4,Claim Level,Place a dot (.) after 3rd character
2300.HI04.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,,,External_Diagnosis_POA4,Claim Level,
2300.HI05.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"ABN : International Classification of Diseases Clinical
Modification (ICD-10-CM) External Cause of Injury
Code
BN : International Classification of Diseases Clinical
Modification (ICD-9-CM) External Cause of Injury
Code (E-codes)",,,,
2300.HI05.02,Industry Code,Diagnosis Code,R,,,External_Diagnosis_Code5,Claim Level,Place a dot (.) after 3rd character
2300.HI05.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,,,External_Diagnosis_POA5,Claim Level,
2300.HI06.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"ABN : International Classification of Diseases Clinical
Modification (ICD-10-CM) External Cause of Injury
Code
BN : International Classification of Diseases Clinical
Modification (ICD-9-CM) External Cause of Injury
Code (E-codes)",,,,
2300.HI06.02,Industry Code,Diagnosis Code,R,,,External_Diagnosis_Code6,Claim Level,Place a dot (.) after 3rd character
2300.HI06.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,,,External_Diagnosis_POA6,Claim Level,
2300.HI07.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"ABN : International Classification of Diseases Clinical
Modification (ICD-10-CM) External Cause of Injury
Code
BN : International Classification of Diseases Clinical
Modification (ICD-9-CM) External Cause of Injury
Code (E-codes)",,,,
2300.HI07.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI07.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,,,,,
2300.HI08.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"ABN : International Classification of Diseases Clinical
Modification (ICD-10-CM) External Cause of Injury
Code
BN : International Classification of Diseases Clinical
Modification (ICD-9-CM) External Cause of Injury
Code (E-codes)",,,,
2300.HI08.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI08.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,,,,,
2300.HI09.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"ABN : International Classification of Diseases Clinical
Modification (ICD-10-CM) External Cause of Injury
Code
BN : International Classification of Diseases Clinical
Modification (ICD-9-CM) External Cause of Injury
Code (E-codes)",,,,
2300.HI09.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI09.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,,,,,
2300.HI10.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"ABN : International Classification of Diseases Clinical
Modification (ICD-10-CM) External Cause of Injury
Code
BN : International Classification of Diseases Clinical
Modification (ICD-9-CM) External Cause of Injury
Code (E-codes)",,,,
2300.HI10.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI10.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,,,,,
2300.HI11.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"ABN : International Classification of Diseases Clinical
Modification (ICD-10-CM) External Cause of Injury
Code
BN : International Classification of Diseases Clinical
Modification (ICD-9-CM) External Cause of Injury
Code (E-codes)",,,,
2300.HI11.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI11.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,,,,,
2300.HI12.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"ABN : International Classification of Diseases Clinical
Modification (ICD-10-CM) External Cause of Injury
Code
BN : International Classification of Diseases Clinical
Modification (ICD-9-CM) External Cause of Injury
Code (E-codes)",,,,
2300.HI12.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI12.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,,,,,
Segment - HI Diagnosis Related Group (DRG) Information (Situational),,,,,,,,
2300.HI01.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,DR Diagnosis Related Group (DRG),,,,
2300.HI01.02,Industry Code,Diagnosis Code,R,,,DRG_Code,Claim Level,
Segment - HI Other Diagnosis Information (Situational),,,,,,,,
2300.HI01.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis,,,,
2300.HI01.02,Industry Code,Diagnosis Code,R,,,Other_Diagnosis_Code1,Claim Level,Place a dot (.) after 3rd character
2300.HI01.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,,,Other_Diagnosis_POA1,Claim Level,
2300.HI02.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis,,,,
2300.HI02.02,Industry Code,Diagnosis Code,R,,,Other_Diagnosis_Code2,Claim Level,Place a dot (.) after 3rd character
2300.HI02.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,,,Other_Diagnosis_POA2,Claim Level,
2300.HI03.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis,,,,
2300.HI03.02,Industry Code,Diagnosis Code,R,,,Other_Diagnosis_Code3,Claim Level,Place a dot (.) after 3rd character
2300.HI03.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,,,Other_Diagnosis_POA3,Claim Level,
2300.HI04.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis,,,,
2300.HI04.02,Industry Code,Diagnosis Code,R,,,Other_Diagnosis_Code4,Claim Level,Place a dot (.) after 3rd character
2300.HI04.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,,,Other_Diagnosis_POA4,Claim Level,
2300.HI05.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis,,,,
2300.HI05.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI05.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,,,,,
2300.HI06.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis,,,,
2300.HI06.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI06.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,,,,,
2300.HI07.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis,,,,
2300.HI07.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI07.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,,,,,
2300.HI08.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis,,,,
2300.HI08.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI08.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,,,,,
2300.HI09.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis,,,,
2300.HI09.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI09.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,,,,,
2300.HI10.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis,,,,
2300.HI10.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI10.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,,,,,
2300.HI11.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis,,,,
2300.HI11.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI11.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,,,,,
2300.HI12.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,ABF International Classification of Diseases Clinical Modification (ICD-10-CM) Diagnosis,,,,
2300.HI12.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI12.09,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,S,,,,,
Segment - HI Principal Procedure Information (Situational),,,,,,,,
2300.HI01.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"BBR International Classification of Diseases Clinical
Modification (ICD-10-PCS) Principal Procedure
Codes",,,,
2300.HI01.02,Industry Code,Diagnosis Code,R,,,Priniciple_Procedure_Code,Claim Level,
2300.HI01.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,,,,
2300.HI01.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,Priniciple_Procedure_Date,Claim Level,Format - YYYY-MM-DD
Segment - HI Other Procedure Information (Situational),,,,,,,,
2300.HI01.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"BBQ International Classification of Diseases Clinical
Modification (ICD-10-PCS) Other Procedure Codes",,,,
2300.HI01.02,Industry Code,Diagnosis Code,R,,,Other_Proedurecode1,Claim Level,
2300.HI01.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,,,,
2300.HI01.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,Other_Proeduredate1,Claim Level,Format - YYYY-MM-DD
2300.HI02.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"BBQ International Classification of Diseases Clinical
Modification (ICD-10-PCS) Other Procedure Codes",,,,
2300.HI02.02,Industry Code,Diagnosis Code,R,,,Other_Proedurecode2,Claim Level,
2300.HI02.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,,,,
2300.HI02.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,Other_Proeduredate2,Claim Level,Format - YYYY-MM-DD
2300.HI03.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"BBQ International Classification of Diseases Clinical
Modification (ICD-10-PCS) Other Procedure Codes",,,,
2300.HI03.02,Industry Code,Diagnosis Code,R,,,Other_Proedurecode3,Claim Level,
2300.HI03.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,,,,
2300.HI03.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,Other_Proeduredate3,Claim Level,Format - YYYY-MM-DD
2300.HI04.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"BBQ International Classification of Diseases Clinical
Modification (ICD-10-PCS) Other Procedure Codes",,,,
2300.HI04.02,Industry Code,Diagnosis Code,R,,,Other_Proedurecode4,Claim Level,
2300.HI04.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,,,,
2300.HI04.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,Other_Proeduredate4,Claim Level,Format - YYYY-MM-DD
2300.HI05.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"BBQ International Classification of Diseases Clinical
Modification (ICD-10-PCS) Other Procedure Codes",,,,
2300.HI05.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI05.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,,,,
2300.HI05.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,
2300.HI06.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"BBQ International Classification of Diseases Clinical
Modification (ICD-10-PCS) Other Procedure Codes",,,,
2300.HI06.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI06.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,,,,
2300.HI06.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,
2300.HI07.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"BBQ International Classification of Diseases Clinical
Modification (ICD-10-PCS) Other Procedure Codes",,,,
2300.HI07.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI07.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,,,,
2300.HI07.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,
2300.HI08.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"BBQ International Classification of Diseases Clinical
Modification (ICD-10-PCS) Other Procedure Codes",,,,
2300.HI08.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI08.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,,,,
2300.HI08.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,
2300.HI09.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"BBQ International Classification of Diseases Clinical
Modification (ICD-10-PCS) Other Procedure Codes",,,,
2300.HI09.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI09.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,,,,
2300.HI09.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,
2300.HI10.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"BBQ International Classification of Diseases Clinical
Modification (ICD-10-PCS) Other Procedure Codes",,,,
2300.HI10.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI10.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,,,,
2300.HI10.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,
2300.HI11.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"BBQ International Classification of Diseases Clinical
Modification (ICD-10-PCS) Other Procedure Codes",,,,
2300.HI11.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI11.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,,,,
2300.HI11.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,
2300.HI12.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,"BBQ International Classification of Diseases Clinical
Modification (ICD-10-PCS) Other Procedure Codes",,,,
2300.HI12.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI12.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 Date Expressed in Format CCYYMMDD,,,,
2300.HI12.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,
Segment - HI Occurrence Span Information (Situational),,,,,,,,
2300.HI01.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BI - Occurrence Span,,,,
2300.HI01.02,Industry Code,Diagnosis Code,R,,,Occurrencespan_code1,Claim Level,
2300.HI01.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8-Range of Dates Expressed in Format CCYYMMDDCCYYMMDD,,,,
2300.HI01.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,"Occurrencespan_Startdate1,Occurrencespan_Enddate1",Claim Level,Format - YYYY-MM-DD
2300.HI02.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BI - Occurrence Span,,,,
2300.HI02.02,Industry Code,Diagnosis Code,R,,,Occurrencespan_code2,Claim Level,
2300.HI02.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8-Range of Dates Expressed in Format CCYYMMDDCCYYMMDD,,,,
2300.HI02.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,"Occurrencespan_Startdate2,Occurrencespan_Enddate2",Claim Level,Format - YYYY-MM-DD
2300.HI03.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BI - Occurrence Span,,,,
2300.HI03.02,Industry Code,Diagnosis Code,R,,,Occurrencespan_code3,Claim Level,
2300.HI03.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8-Range of Dates Expressed in Format CCYYMMDDCCYYMMDD,,,,
2300.HI03.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,"Occurrencespan_Startdate3,Occurrencespan_Enddate3",Claim Level,Format - YYYY-MM-DD
2300.HI04.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BI - Occurrence Span,,,,
2300.HI04.02,Industry Code,Diagnosis Code,R,,,Occurrencespan_code4,Claim Level,
2300.HI04.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8-Range of Dates Expressed in Format CCYYMMDDCCYYMMDD,,,,
2300.HI04.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,"Occurrencespan_Startdate4,Occurrencespan_Enddate4",Claim Level,Format - YYYY-MM-DD
2300.HI05.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BI - Occurrence Span,,,,
2300.HI05.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI05.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8-Range of Dates Expressed in Format CCYYMMDDCCYYMMDD,,,,
2300.HI05.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,
2300.HI06.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BI - Occurrence Span,,,,
2300.HI06.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI06.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8-Range of Dates Expressed in Format CCYYMMDDCCYYMMDD,,,,
2300.HI06.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,
2300.HI07.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BI - Occurrence Span,,,,
2300.HI07.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI07.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8-Range of Dates Expressed in Format CCYYMMDDCCYYMMDD,,,,
2300.HI07.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,
2300.HI08.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BI - Occurrence Span,,,,
2300.HI08.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI08.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8-Range of Dates Expressed in Format CCYYMMDDCCYYMMDD,,,,
2300.HI08.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,
2300.HI09.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BI - Occurrence Span,,,,
2300.HI09.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI09.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8-Range of Dates Expressed in Format CCYYMMDDCCYYMMDD,,,,
2300.HI09.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,
2300.HI10.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BI - Occurrence Span,,,,
2300.HI10.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI10.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8-Range of Dates Expressed in Format CCYYMMDDCCYYMMDD,,,,
2300.HI10.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,
2300.HI11.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BI - Occurrence Span,,,,
2300.HI11.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI11.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8-Range of Dates Expressed in Format CCYYMMDDCCYYMMDD,,,,
2300.HI11.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,
2300.HI12.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BI - Occurrence Span,,,,
2300.HI12.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI12.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,RD8-Range of Dates Expressed in Format CCYYMMDDCCYYMMDD,,,,
2300.HI12.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,
Segment - HI Occurrence Information (Situational),,,,,,,,
2300.HI01.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BH - Occurrence,,,,
2300.HI01.02,Industry Code,Diagnosis Code,R,,,Eventoccurence_Code1,Claim Level,
2300.HI01.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 - Date Expressed in Format CCYYMMDD,,,,
2300.HI01.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,Eventoccurence_Date1,Claim Level,Format - YYYY-MM-DD
2300.HI02.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BH - Occurrence,,,,
2300.HI02.02,Industry Code,Diagnosis Code,R,,,Eventoccurence_Code2,Claim Level,
2300.HI02.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 - Date Expressed in Format CCYYMMDD,,,,
2300.HI02.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,Eventoccurence_Date2,Claim Level,Format - YYYY-MM-DD
2300.HI03.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BH - Occurrence,,,,
2300.HI03.02,Industry Code,Diagnosis Code,R,,,Eventoccurence_Code3,Claim Level,
2300.HI03.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 - Date Expressed in Format CCYYMMDD,,,,
2300.HI03.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,Eventoccurence_Date3,Claim Level,Format - YYYY-MM-DD
2300.HI04.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BH - Occurrence,,,,
2300.HI04.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI04.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 - Date Expressed in Format CCYYMMDD,,,,
2300.HI04.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,
2300.HI05.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BH - Occurrence,,,,
2300.HI05.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI05.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 - Date Expressed in Format CCYYMMDD,,,,
2300.HI05.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,
2300.HI06.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BH - Occurrence,,,,
2300.HI06.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI06.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 - Date Expressed in Format CCYYMMDD,,,,
2300.HI06.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,
2300.HI07.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BH - Occurrence,,,,
2300.HI07.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI07.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 - Date Expressed in Format CCYYMMDD,,,,
2300.HI07.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,
2300.HI08.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BH - Occurrence,,,,
2300.HI08.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI08.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 - Date Expressed in Format CCYYMMDD,,,,
2300.HI08.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,
2300.HI09.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BH - Occurrence,,,,
2300.HI09.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI09.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 - Date Expressed in Format CCYYMMDD,,,,
2300.HI09.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,
2300.HI10.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BH - Occurrence,,,,
2300.HI10.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI10.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 - Date Expressed in Format CCYYMMDD,,,,
2300.HI10.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,
2300.HI11.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BH - Occurrence,,,,
2300.HI11.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI11.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 - Date Expressed in Format CCYYMMDD,,,,
2300.HI11.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,
2300.HI12.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BH - Occurrence,,,,
2300.HI12.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI12.03,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 - Date Expressed in Format CCYYMMDD,,,,
2300.HI12.04,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,
Segment - HI Value Information (Situational),,,,,,,,
2300.HI01.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BE -Value,,,,
2300.HI01.02,Industry Code,Diagnosis Code,R,,,Value_Code1,Claim Level,
2300.HI01.05,Monetary Amount,Monetary Amount,R,,,Value_Code_Amount1,Claim Level,
2300.HI02.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BE -Value,,,,
2300.HI02.02,Industry Code,Diagnosis Code,R,,,Value_Code2,Claim Level,
2300.HI02.05,Monetary Amount,Monetary Amount,R,,,Value_Code_Amount2,Claim Level,
2300.HI03.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BE -Value,,,,
2300.HI03.02,Industry Code,Diagnosis Code,R,,,Value_Code3,Claim Level,
2300.HI03.05,Monetary Amount,Monetary Amount,R,,,Value_Code_Amount3,Claim Level,
2300.HI04.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BE -Value,,,,
2300.HI04.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI04.05,Monetary Amount,Monetary Amount,R,,,,,
2300.HI05.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BE -Value,,,,
2300.HI05.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI05.05,Monetary Amount,Monetary Amount,R,,,,,
2300.HI06.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BE -Value,,,,
2300.HI06.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI06.05,Monetary Amount,Monetary Amount,R,,,,,
2300.HI07.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BE -Value,,,,
2300.HI07.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI07.05,Monetary Amount,Monetary Amount,R,,,,,
2300.HI08.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BE -Value,,,,
2300.HI08.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI08.05,Monetary Amount,Monetary Amount,R,,,,,
2300.HI09.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BE -Value,,,,
2300.HI09.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI09.05,Monetary Amount,Monetary Amount,R,,,,,
2300.HI10.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BE -Value,,,,
2300.HI10.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI10.05,Monetary Amount,Monetary Amount,R,,,,,
2300.HI11.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BE -Value,,,,
2300.HI11.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI11.05,Monetary Amount,Monetary Amount,R,,,,,
2300.HI12.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BE -Value,,,,
2300.HI12.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI12.05,Monetary Amount,Monetary Amount,R,,,,,
Segment - HI Condition Information (Situational),,,,,,,,
2300.HI01.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BG - Condition,,,,
2300.HI01.02,Industry Code,Diagnosis Code,R,,,Condition_Code1,Claim Level,
2300.HI02.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BG - Condition,,,,
2300.HI02.02,Industry Code,Diagnosis Code,R,,,Condition_Code2,Claim Level,
2300.HI03.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BG - Condition,,,,
2300.HI03.02,Industry Code,Diagnosis Code,R,,,Condition_Code3,Claim Level,
2300.HI04.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BG - Condition,,,,
2300.HI04.02,Industry Code,Diagnosis Code,R,,,Condition_Code4,Claim Level,
2300.HI05.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BG - Condition,,,,
2300.HI05.02,Industry Code,Diagnosis Code,R,,,Condition_Code5,Claim Level,
2300.HI06.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BG - Condition,,,,
2300.HI06.02,Industry Code,Diagnosis Code,R,,,Condition_Code6,Claim Level,
2300.HI07.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BG - Condition,,,,
2300.HI07.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI08.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BG - Condition,,,,
2300.HI08.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI09.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BG - Condition,,,,
2300.HI09.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI10.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BG - Condition,,,,
2300.HI10.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI11.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BG - Condition,,,,
2300.HI11.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI12.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,BG - Condition,,,,
2300.HI12.02,Industry Code,Diagnosis Code,R,,,,,
Segment - HI Treatment Code Information (Situational),,,,,,,,
2300.HI01.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,TC -Treatment Codes,,,,
2300.HI01.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI02.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,TC -Treatment Codes,,,,
2300.HI02.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI03.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,TC -Treatment Codes,,,,
2300.HI03.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI04.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,TC -Treatment Codes,,,,
2300.HI04.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI05.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,TC -Treatment Codes,,,,
2300.HI05.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI06.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,TC -Treatment Codes,,,,
2300.HI06.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI07.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,TC -Treatment Codes,,,,
2300.HI07.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI08.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,TC -Treatment Codes,,,,
2300.HI08.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI09.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,TC -Treatment Codes,,,,
2300.HI09.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI10.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,TC -Treatment Codes,,,,
2300.HI10.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI11.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,TC -Treatment Codes,,,,
2300.HI11.02,Industry Code,Diagnosis Code,R,,,,,
2300.HI12.01,Code List Qualifier Code,"Code identifying a specific industry code list
Principal Diagnosis Type Code",R,TC -Treatment Codes,,,,
2300.HI12.02,Industry Code,Diagnosis Code,R,,,,,
Segment - HCP Claim Pricing/Repricing Information (Situational),,,,,,,,
2300.HCP01,Pricing Methodology,Code specifying pricing methodology at which the claim or line item has been priced or repriced,R,"00 Zero Pricing (Not Covered Under Contract)
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
14 Adjustment Pricin",,,,
2300.HCP02,Monetary Amount,Monetary amount,R,,,,,
2300.HCP03,Monetary Amount,Monetary amount,S,,,,,
2300.HCP04,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",S,,,,,
2300.HCP05,Rate,Rate,S,,,,,
2300.HCP06,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",S,,,,,
2300.HCP07,Monetary Amount,Monetary Amount,S,,,,,
2300.HCP08,Product/Service ID,Identifying number for a product or service,S,,,,,
2300.HCP09,Product/Service ID Qualifier,"Code identifying the type/source of the descriptive number used in
Product/Service ID (234",S,"ER :Jurisdiction Specific Procedure and Supply Codes
HC: Health Care Financing Administration Common
Procedural Coding System (HCPCS) Codes
HP Health Insurance Prospective Payment System
(HIPPS) Skilled Nursing Facility Rate Code
HP: Health Insurance Prospective Payment System
(HIPPS) Skilled Nursing Facility Rate Code
IV: Home Infusion EDI Coalition (HIEC) Product/Service
Code
WK Advanced Billing Concepts (ABC) Codes",,,,
2300.HCP11,Unit or Basis for Measurement Code,"Code specifying the units in which a value is being expressed, or manner in which
a measurement has been taken",S,,,,,
2300.HCP12,Quantity,Numeric value of quantity,S,,,,,
2300.HCP13,Reject Reason Code,Code assigned by issuer to identify reason for rejection,S,"T1 Cannot Identify Provider as TPO (Third Party
Organization) Participant
T2 Cannot Identify Payer as TPO (Third Party
Organization) Participant
T3 Cannot Identify Insured as TPO (Third Party
Organization) Participant
T4 Payer Name or Identifier Missing
T5 Certification Information Missing
T6 Claim does not contain enough information for repricing",,,,
2300.HCP14,Policy Compliance Code,Code specifying policy compliance,S,"1 Procedure Followed (Compliance)
2 Not Followed - Call Not Made (Non-Compliance Call
Not Made)
3 Not Medically Necessary (Non-Compliance NonMedically Necessary)
4 Not Followed Other (Non-Compliance Other)
5 Emergency Admit to Non-Network Hospital",,,,
2300.HCP15,Exception Code,"Code specifying the exception reason for consideration of out-of-network health
care services",S,"1 Non-Network Professional Provider in Network
Hospital
2 Emergency Care
3 Services or Specialist not in Network
4 Out-of-Service Area
5 State Mandates
6 Other",,,,
Loop 2310A (Situational),,,,,,,,
Segment - NM1 Attending Provider Name (Situational),,,,,,,,
2310A.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,71 Attending Physician,,,,
2310A.NM102,Entity Type Qualifier,"Code identifying an organizational entity, a physical location, property or an
individual",R,1 Person,,,,
2310A.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,Attending_practitioner_LastName,Claim Level,
2310A.NM104,Name First,Individual first name,S,,,Attending_Practitioner_FirstName,Claim Level,
,,,,,,Attending_Practitioner_FullName,Claim Level,concatenate NM104/5/3/7 (First Middle Last Suffix)
2310A.NM105,Name Middle,Individual middle name or initial,S,,,,,
2310A.NM107,Name Suffix,Suffix to individual name,S,,,,,
2310A.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code",S,"XX Centers for Medicare and Medicaid Services
National Provider Identifier",,,,
2310A.NM109,Identification Code,Code identifying a party or other code /Rendering Provider Identifier,S,1851470140,,Attending_practitioner_Npi,Claim Level,
Segment - PRV Provider Information (Situational),,,,,,,,
2310A.PRV01,Provider Code,Code identifying the type of provider,R,AT  : Attending,,,,
2310A.PRV02,Reference Identification Qualifier,Code qualifying the Reference Identification,R,PXC :Health Care Provider Taxonomy Code,,,,
2310A.PRV03,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,207Q00000X,,,,
Segment - REF Attending Provider Secondary Identification (Situational),,,,,,,,
2310A.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B : State License Number
1G : Provider UPIN Number
1555 UPINs must be formatted as either X99999 or
XXX999.
G2 : Provider Commercial Number
LU: Location Numbe",,Attending_Practitioner_Id_Qualifier,Claim Level,
2310A.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,0121T3B0B,,Attending_Practitioner_Id,Claim Level,
Loop 2310B (Situational),,,,,,,,
Segment - NM1 Operating Physician Name (Situational),,,,,,,,
2310B.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,72 - Operating Physician,,,,
2310B.NM102,Entity Type Qualifier,"Code identifying an organizational entity, a physical location, property or an
individual",R,1 - Person,,,,
2310B.NM103,Name Last or Organization Name,Individual last name or organizational name,R,Individual last name or organizational name,,Operating_practitioner_LastName,Claim Level,
2310B.NM104,Name First,Individual first name,S,Individual first name,,Operating_Practitioner_FirstName,Claim Level,
2310B.NM105,Name Middle,Individual middle name or initial,S,Individual middle name or initial,,,,
2310B.NM107,Name Suffix,Suffix to individual name,S,Suffix to individual name,,,,
2310B.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code",S,"XX Centers for Medicare and Medicaid Services
National Provider Identifier",,,,
2310B.NM109,Identification Code,Code identifying a party or other code /Rendering Provider Identifier,S,,,Operating_practitioner_Npi,Claim Level,
Segment - REF Operating Physician Secondary Identification (Situational),,,,,,,,
2310B.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,,,Operating_Practitioner_Id_Qualifier,Claim Level,
2310B.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,Operating_Practitioner_Id,Claim Level,
Loop 2310C (Situational),,,,,,,,
Segment - NM1 Other Operating Physician Name (Situational),,,,,,,,
2310C.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,ZZ : Mutually Defined,,,,
2310C.NM102,Entity Type Qualifier,"Code identifying an organizational entity, a physical location, property or an
individual",R,1 :  Person,,,,
2310C.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,Other_practitioner_LastName,Claim Level,
2310C.NM104,Name First,Individual first name,S,,,Other_Practitioner_FirstName,Claim Level,
2310C.NM105,Name Middle,Individual middle name or initial,S,,,,,
2310C.NM107,Name Suffix,Suffix to individual name,S,,,,,
2310C.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code",S,"XX Centers for Medicare and Medicaid Services
National Provider Identifier",,,,
2310C.NM109,Identification Code,Code identifying a party or other code /Rendering Provider Identifier,S,,,Other_practitioner_Npi,Claim Level,
Segment - REF Other Operating Physician Secondary Identification (Situational),,,,,,,,
2310C.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B : State License Number
1G : Provider UPIN Number
1555 UPINs must be formatted as either X99999 or
XXX999.
G2 :Provider Commercial Number
1464: This code designates a proprietary provider number
for the destination payer identified in the Payer
Name loop, Loop ID-2010BB, associated with this
claim. This is to be used by all payers including:
Medicare, Medicaid, Blue Cross, etc.
LU : Location Numbe",,Other_Practitioner_Id_Qualifier,Claim Level,
2310C.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,Other_Practitioner_Id,Claim Level,
Loop 2310D (Situational),,,,,,,,
Segment - NM1 Rendering Provider Name (Situational),,,,,,,,
2310D.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,82 :Rendering Provider,,,,
2310D.NM102,Entity Type Qualifier,"Code identifying an organizational entity, a physical location, property or an
individual",R,1 : Person,,,,
2310D.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,,,
2310D.NM104,Name First,Individual first name,S,,,,,
2310D.NM105,Name Middle,Individual middle name or initial,S,,,,,
2310D.NM107,Name Suffix,Suffix to individual name,S,,,,,
2310D.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code",S,"XX Centers for Medicare and Medicaid Services
National Provider Identifier",,,,
2310D.NM109,Identification Code,Code identifying a party or other code /Rendering Provider Identifier,S,,,,,
Segment - REF Rendering Provider Secondary Identification (Situational),,,,,,,,
2310D.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B :  State License Number
1G :  Provider UPIN Number
1555 UPINs must be formatted as either X99999 or
XXX999.
G2 :  Provider Commercial Number
1464 :  This code designates a proprietary provider number
for the destination payer identified in the Payer
Name loop, Loop ID-2010BB, associated with this
claim. This is to be used by all payers including:
Medicare, Medicaid, Blue Cross, etc.
LU : Location Number",,,,
2310D.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,
Loop 2310E (Situational),,,,,,,,
Segment - NM1 Service Facility Location Name (Situational),,,,,,,,
2310E.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,77 : Service Location,,,,
2310E.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,2 :  Non-Person Entity,,,,
2310E.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,,,
2310E.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code (67)",S,"XX Centers for Medicare and Medicaid Services
National Provider Identifier",,,,
2310E.NM109,Identification Code,Code identifying a party or other code,S,,,,,
Segment - N3 Service Facility Location Address (Required),,,,,,,,
2310E.N301,Address Information,Address Information,R,,,,,
2310E.N302,Address Information,Address Information,S,,,,,
"Segment - N4 Service Facility Location City, State, ZIP Code (Required)",,,,,,,,
2310E.N401,City Name,Free-form text for city name,R,,,,,
2310E.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,,,
2310E.N403,Postal Code,"Code defining international postal zone code excluding punctuation and blanks
(zip code for United States)",S,,,,,
2310E.N404,Country Code,Code identifying the country,S,,,,,
2310E.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,
Segment - REF Service Facility Location Secondary Identification (Situational),,,,,,,,
2310E.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B : State License Number
G2 :  Provider Commercial Number
1464 :  This code designates a proprietary provider number
for the destination payer identified in the Payer
Name loop, Loop ID-2010BB, associated with this
claim. This is to be used by all payers including:
Medicare, Medicaid, Blue Cross, etc.
LU :  Location Number",,,,
2310E.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,
Loop 2310F (Situational),,,,,,,,
Segment - NM1 Referring Provider Name (Situational),,,,,,,,
2310F.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,DN : Referring Provider,,,,
2310F.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,1 Person,,,,
2310F.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,,,
2310F.NM104,Name First,Individual first name,S,,,,,
2310F.NM105,Name Middle,Individual middle name or initial,S,,,,,
2310F.NM107,Name Suffix,Suffix to individual name,S,,,,,
2310F.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code (67)",S,"XX Centers for Medicare and Medicaid Services
National Provider Identifier",,,,
2310F.NM109,Identification Code,Code identifying a party or other code,S,,,,,
Segment - REF Referring Provider Secondary Identification (Situational),,,,,,,,
2310F.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,,,,,
2310F.REF02,Reference Identification,,R,,,,,
Loop 2320 (Situational),,,,,,,,
Segment - SBR Other Subscriber Information (Situational),,,,,,,,
2320.SBR01,Payer Responsibility Sequence Number Code,"Code identifying the insurance carrier’s level of responsibility for a payment of a
claim",R,"A Payer Responsibility Four
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
U Unknown",,,,
2320.SBR02,Individual Relationship Code,Code indicating the relationship between two individuals or entities,R,"01 Spouse
18 Self
19 Child
20 Employee
21 Unknown
39 Organ Donor
40 Cadaver Donor
53 Life Partner
G8 Other Relationship",18,,,
2320.SBR03,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier/Insured Group or Policy Number",S,,,,,
2320.SBR04,Name,Free-form name,S,,,,,
2320.SBR09,Claim Filing Indicator Code,Code identifying type of claim,S,"MA Medicare Part A
MB Medicare Part B
MC Medicaid
OF Other Federal Program",,,,
Segment - CAS Claim Level Adjustments (Situational),,,,,,,,
2320.CAS01,Claim Adjustment Group Code,Code identifying the general category of payment adjustment,R,"CO : Contractual Obligations
CR : Correction and Reversals
OA : Other adjustments
PI : Payor Initiated Reductions
PR : Patient Responsibility",,,,
2320.CAS02,Claim Adjustment Reason Code,Code identifying the detailed reason the adjustment was made,R,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2320.CAS03,Monetary Amount,Monetary Amount,R,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2320.CAS04,Quantity,Numeric value of quantity,S,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2320.CAS05,Claim Adjustment Reason Code,Code identifying the detailed reason the adjustment was made,R,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2320.CAS06,Monetary Amount,Monetary Amount,R,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2320.CAS07,Quantity,Numeric value of quantity,S,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2320.CAS08,Claim Adjustment Reason Code,Code identifying the detailed reason the adjustment was made,R,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2320.CAS09,Monetary Amount,Monetary Amount,R,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2320.CAS10,Quantity,Numeric value of quantity,S,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2320.CAS11,Claim Adjustment Reason Code,Code identifying the detailed reason the adjustment was made,R,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2320.CAS12,Monetary Amount,Monetary Amount,R,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2320.CAS13,Quantity,Numeric value of quantity,S,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2320.CAS14,Claim Adjustment Reason Code,Code identifying the detailed reason the adjustment was made,R,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2320.CAS15,Monetary Amount,Monetary Amount,R,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2320.CAS16,Quantity,Numeric value of quantity,S,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2320.CAS17,Claim Adjustment Reason Code,Code identifying the detailed reason the adjustment was made,R,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2320.CAS18,Monetary Amount,Monetary Amount,R,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2320.CAS19,Quantity,Numeric value of quantity,S,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
Segment - AMT Coordination of Benefits (COB) Payer Paid Amount (Situational),,,,,,,,
2320.AMT01,Amount Qualifier Code,Code to qualify amount,R,D : Payor Amount Paid,,,,
2320.AMT02,Monetary Amount,Monetary amount,R,,,,,
Segment - AMT Remaining Patient Liability (Situational),,,,,,,,
2320.AMT01,Amount Qualifier Code,Code to qualify amount,R,EAF Amount Owed,,,,
2320.AMT02,Monetary Amount,Monetary amount,R,,,,,
Segment - AMT Coordination of Benefits (COB) Total Non-covered Amount (Situational),,,,,,,,
2320.AMT01,Amount Qualifier Code,Code to qualify amount,R,A8 : Noncovered Charges - Actual,,,,
2320.AMT02,Monetary Amount,Monetary amount,R,,,,,
Segment - OI Other Insurance Coverage Information (Required),,,,,,,,
2320.OI03,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,R,"N : No
W : Not Applicable
1563 Use code ‘W’ when the patient refuses to assign
benefits.
Y :  Yes",,,,
2320.OI06,Release of Information Code,Code indicating whether the provider has on file a signed statement by the patient authorizing the release of medical data to other organizations,R,"I  : Informed Consent to Release Medical Information
for Conditions or Diagnoses Regulated by Federal
Statutes
488 Required when the provider has not collected a
signature AND state or federal laws do not require a
signature be collected.
Y : Yes, Provider has a Signed Statement Permitting
Release of Medical Billing Data Related to a Claim
489 Required when the provider has collected a
signature.
OR
Required when state or federal laws require a
signature be collected.",,,,
Segment - MIA Inpatient Adjudication Information (Situational),,,,,,,,
2320.MIA01,Quantity,Numeric value of quantity,R,,,,,
2320.MIA03,Quantity,Numeric value of quantity,S,,,,,
2320.MIA04,Monetary Amount,Monetary Amount,S,,,,,
2320.MIA05,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",S,,,,,
2320.MIA06,Monetary Amount,Monetary Amount,S,,,,,
2320.MIA07,Monetary Amount,Monetary Amount,S,,,,,
2320.MIA08,Monetary Amount,Monetary Amount,S,,,,,
2320.MIA09,Monetary Amount,Monetary Amount,S,,,,,
2320.MIA10,Monetary Amount,Monetary Amount,S,,,,,
2320.MIA11,Monetary Amount,Monetary Amount,S,,,,,
2320.MIA12,Monetary Amount,Monetary Amount,S,,,,,
2320.MIA13,Monetary Amount,Monetary Amount,S,,,,,
2320.MIA14,Monetary Amount,Monetary Amount,S,,,,,
2320.MIA15,Quantity,Numeric value of quantity,S,,,,,
2320.MIA16,Monetary Amount,Monetary Amount,S,,,,,
2320.MIA17,Monetary Amount,Monetary Amount,S,,,,,
2320.MIA18,Monetary Amount,Monetary Amount,S,,,,,
2320.MIA19,Monetary Amount,Monetary Amount,S,,,,,
2320.MIA20,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,S,,,,,
2320.MIA21,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,S,,,,,
2320.MIA22,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,S,,,,,
2320.MIA23,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,S,,,,,
2320.MIA24,Monetary Amount,Monetary Amount,S,,,,,
Segment - MOA Outpatient Adjudication Information (Situational),,,,,,,,
2320.MOA01,Percentage as Decimal,"Percentage expressed as a decimal (e.g., 0.0 through 1.0 represents 0% through
100%)",S,,,,,
2320.MOA02,Monetary Amount,Monetary Amount,S,,,,,
2320.MOA03,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,S,,,,,
2320.MOA04,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,S,,,,,
2320.MOA05,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,S,,,,,
2320.MOA06,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,S,,,,,
2320.MOA07,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,S,,,,,
2320.MOA08,Monetary Amount,Monetary Amount,S,,,,,
2320.MOA09,Monetary Amount,Monetary Amount,S,,,,,
Loop 2330A(Situational),,,,,,,,
Segment - NM1 Other Subscriber Name (Required),,,,,,,,
2330A.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,IL : Insured or Subscriber,,,,
2330A.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,"1 : Person
2 : Non-Person Entity",,,,
2330A.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,,,
2330A.NM104,Name First,Individual first name,S,,,,,
2330A.NM105,Name Middle,Individual middle name or initial,S,,,,,
2330A.NM107,Name Suffix,Suffix to individual name,S,,,,,
2330A.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code (",R,PI  : Payor Identification,,,,
2330A.NM109,Identification Code,Code identifying a party or other code,R,,,,,
Segment - N3 Other Subscriber Address (Situational),,,,,,,,
2330A.N301,Address Information,Address Information,R,,,,,
2330A.N302,Address Information,Address Information,S,,,,,
Segment - N4 Other Subscriber City/State/ZIP Code (Situational),,,,,,,,
2330A.N401,City Name,Free-form text for city name,R,,,,,
2330A.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,,,
2330A.N403,Postal Code,"Code defining international postal zone code excluding punctuation and blanks
(zip code for United States)",S,,,,,
,,,,,,,,
2330A.N404,Country Code,Code identifying the country,S,,,,,
2330A.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,
Segment - REF Other Subscriber Secondary Information (Situational),,,,,,,,
2330A.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,,,,,
2330A.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,
Loop 2330B(Situational),,,,,,,,
Segment - NM1 Other Payer Name (Required),,,,,,,,
2330B.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,PR: Payer,,,,
2330B.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,2 :  Non-Person Entity,,,,
2330B.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,,,
2330B.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code",R,,,,,
2330B.NM109,Identification Code,Code identifying a party or other code,R,,,,,
Segment - N3 Other Payer Address (Situational),,,,,,,,
2330B.N301,Address Information,Address Information,R,,,,,
2330B.N302,Address Information,Address Information,S,,,,,
Segment - N4 Other Payer City/State/ZIP Code (Situational),,,,,,,,
2330B.N401,City Name,Free-form text for city name,R,,,,,
2330B.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,,,
2330B.N403,Postal Code,"Code defining international postal zone code excluding punctuation and blanks
(zip code for United States)",S,,,,,
2330B.N404,Country Code,Code identifying the country,S,,US,,,
2330B.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,
Segment - DTP Claim Check or Remittance Date (Situational),,,,,,,,
2330B.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,573 : Date Claim Paid,,,,
2330B.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 :Date Expressed in Format CCYYMMDD,,,,
2330B.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,
Segment - REF Other Payer Secondary Identifier (Situational),,,,,,,,
2330B.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"2U: Payer Identification Number
EI: Employer’s Identification Number

FY: Claim Office Number
NF: National Association of Insurance Commissioners
(NAIC) Code",,,,
2330B.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",,,,
Segment - REF Other Payer Prior Authorization Number (Situational),,,,,,,,
2330B.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,G1: Prior Authorization Number,,,,
2330B.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,
Segment - REF Other Payer Referral Number (Situational),,,,,,,,
2330B.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,9F : Referral Number,,,,
2330B.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,
Segment - REF Other Payer Claim Adjustment Indicator (Situational),,,,,,,,
2330B.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,T4 : Signal Code,,,,
2330B.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,
Segment - REF Other Payer Claim Control Number (Situational),,,,,,,,
2330B.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,F8 : Original Reference Number,,,,
2330B.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,
Loop 2330C (Situational),,,,,,,,
Segment - NM1 Other Payer Attending Provider (Situational),,,,,,,,
2330C.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,71 : Attending Physician,,,,
2330C.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,1 :Person,,,,
Segment - REF Other Payer Attending Provider Secondary Identification (Required),,,,,,,,
2330C.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B :State License Number
1G: Provider UPIN Number
1555
G2 :Provider Commercial Number
LU Location Number",,,,
2330C.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,
Loop 2330D (Situational),,,,,,,,
Segment - NM1 Other Payer Operating Physician (Situational),,,,,,,,
2330D.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,,,,,
2330D.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,,,,,
Segment - REF Other Payer Operating Physician Secondary Identification (Required),,,,,,,,
2330D.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,,,,,
2330D.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,
Loop 2330E (Situational),,,,,,,,
Segment - NM1 Other Payer Other Operating Physician (Situational),,,,,,,,
2330E.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,,,,,
2330E.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,,,,,
Segment - REF Other Payer Other Operating Physician Secondary Identification (Required),,,,,,,,
2330E.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,,,,,
2330E.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,
Loop 2330F (Situational),,,,,,,,
Segment - NM1 Other Payer Service Facility Location (Situational),,,,,,,,
2330F.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,,,,,
2330F.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,,,,,
Segment - REF Other Payer Service Facility Location Identification (Required),,,,,,,,
2330F.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,,,,,
2330F.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,
Loop 2330G (Situational),,,,,,,,
Segment - NM1 Other Payer Rendering Provider Name (Situational),,,,,,,,
2330G.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,,,,,
2330G.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,,,,,
Segment - REF Other Payer Rendering Provider Secondary Identification (Required),,,,,,,,
2330G.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,,,,,
2330G.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,
Loop - 2330H (Situational),,,,,,,,
Segment - NM1 Other Payer Referring Provider (Situational),,,,,,,,
2330H.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,,,,,
2330H.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,,,,,
Segment - REF Other Payer Referring Provider Secondary Identification (Required),,,,,,,,
2330H.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,,,,,
2330H.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,
Loop - 2330I (Situational),,,,,,,,
Segment - NM1 Other Payer Billing Provider (Situational),,,,,,,,
2330I.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,,,,,
2330I.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,,,,,
Segment - REF Other Payer Billing Provider Secondary Identification (Required),,,,,,,,
2330I.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,,,,,
2330I.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,
Loop 2400 (Required),,,,,,,,
Segment - LX Service Line Number (Required),,,,,,,,
2400.LX01,Assigned Number,Number assigned for differentiation within a transaction set,R,1,,Original_Line_Number,Line Level,
Segment - SV2 Institutional Service Line (Required),,,,1,,,,
2400.SV201,Product/Service ID,Identifying number for a product or service,R,0900,,Revenue_Code,Line Level,
2400.SV202,"COMPOSITE MEDICAL PROCEDURE
IDENTIFIER","To identify a medical procedure by its standardized codes and applicable
modifiers",S,,,,,
2400.SV202.01,Product/Service ID Qualifier,"Code identifying the type/source of the descriptive number used in
Product/Service ID",R,"HC :Health Insurance Prospective Payment System
(HIPPS) Skilled Nursing Facility Rate Code",,,,
2400.SV202.02,Product/Service ID,Identifying number for a product or service,R,H0023,,Service_Code,Line Level,
2400.SV202.03,Procedure Modifier,"This identifies special circumstances related to the performance of the
service, as defined by trading partners",S,HE,,Service_code_modifier_1,Line Level,
2400.SV202.04,Procedure Modifier,"This identifies special circumstances related to the performance of the
service, as defined by trading partners",S,HT,,Service_code_modifier_2,Line Level,
2400.SV202.05,Procedure Modifier,"This identifies special circumstances related to the performance of the
service, as defined by trading partners",S,,,Service_code_modifier_3,Line Level,
2400.SV202.06,Procedure Modifier,"This identifies special circumstances related to the performance of the
service, as defined by trading partners",S,,,Service_code_modifier_4,Line Level,
2400.SV202.07,Description,"A free-form description to clarify the related data elements and their
content",S,,,,,
2400.SV203,Monetary Amount,Monetary Amount,R,200,,Total_Charge_Amount,Line Level,
2400.SV204,Unit or Basis for Measurement Code,"Code specifying the units in which a value is being expressed, or manner in which
a measurement has been taken",R,"DA : Days
UN : Unit",,,,
2400.SV205,Quantity,Numeric value of quantity,R,1,,Service_Unit_Count,Line Level,
,,,,,,,,
2400.SV207,Monetary Amount,Monetary Amount,S,,,,,
Segment - PWK Line Supplemental Information (Situational),,,,,,,,
2400.PWK01,Report Type Code,"Code indicating the title or contents of a document, report or supporting item",R,"03 Report Justifying Treatment Beyond Utilization
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
I5 Immunization Record",,,,
2400.PWK02,Report Transmission Code,"Code defining timing, transmission method or format by which reports are to be
sent",R,"AA Available on Request at Provider Site
179 This means that the additional information is not
being sent with the claim at this time. Instead, it is
available to the payer (or appropriate entity) at their
request.
BM By Mail
EL Electronically Only
180 Indicates that the attachment is being transmitted in
a separate X12 functional group.
EM E-Mail
FT File Transfer
FX: By FAX",,,,
2400.PWK05,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code",S,AC Attachment Control Number,,,,
2400.PWK06,Identification Code,Code identifying a party or other code,S,,,,,
Segment - DTP Date - Service Date (Situational),,,,,,,,
2400.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,472 Service,,,,
2400.DTP02,Date Time Period Format Qualifier,Date Time Period Format Qualifier,R,"D8 :Date Expressed in Format CCYYMMDD
RD8 :Range of Dates Expressed in Format CCYYMMDDCCYYMMDD",,,,
2400.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,"Expression of a date, a time, or range of dates, times or dates and times",,Service_Date,Line Level,Format : YYYY-MM-DD
Segment - REF Line Item Control Number (Situational),,,,,,,,
2400.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,6R Provider Control Number,,,,
2400.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier/ Line Item Control Number,R,,,,,
Segment - REF Repriced Line Item Reference Number (Situational),,,,,,,,
2400.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,9B Repriced Line Item Reference Number,,,,
2400.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,
Segment - REF Adjusted Repriced Line Item Reference Number (Situational),,,,,,,`,
2400.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,9D Adjusted Repriced Line Item Reference Number,,,,
2400.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,
Segment - AMT Service Tax Amount (Situational),,,,,,,,
2400.AMT01,Amount Qualifier Code,Code to qualify amount,R,GT Goods and Services Tax,,,,
2400.AMT02,Monetary Amount,Monetary Amount,R,,,,,
Segment - AMT Facility Tax Amount (Situational),,,,,,,,
2400.AMT01,Amount Qualifier Code,Code to qualify amount,R,N8 Miscellaneous Taxes,,,,
2400.AMT02,Monetary Amount,Monetary Amount,R,,,,,
Segment - NTE Third Party Organization Notes (Situational),,,,,,,,
2400.NTE01,Note Reference Code,Code identifying the functional area or purpose for which the note applies,R,TPO Third Party Organization Notes,,,,
2400.NTE02,Description,A free-form description to clarify the related data elements and their content,R,,,,,
Segment - HCP Line Pricing/Repricing Information (Situational),,,,,,,`,
2400.HCP01,Pricing Methodology,"Code specifying pricing methodology at which the claim or line item has been
priced or repriced",R,"00 Zero Pricing (Not Covered Under Contract)
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
14 Adjustment Pricing",,,,
2400.HCP02,Monetary Amount,Monetary Amount,R,,,,,
2400.HCP03,Monetary Amount,Monetary Amount,S,,,,,
2400.HCP04,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,S,,,,,
2400.HCP05,Rate,Rate expressed in the standard monetary denomination for the currency specified,S,,,,,
2400.HCP06,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,S,,,,,
2400.HCP07,Monetary Amount,Monetary Amount,S,,,,,
2400.HCP08,Product/Service ID,Identifying number for a product or service,S,,,,,
2400.HCP09,Product/Service ID Qualifier,"Code identifying the type/source of the descriptive number used in
Product/Service ID",S,,,,,
2400.HCP10,Product/Service ID,Identifying number for a product or service,S,,,,,
2400.HCP11,Unit or Basis for Measurement Code,"Code specifying the units in which a value is being expressed, or manner in which
a measurement has been taken",S,"DA Days
UN Unit",,,,
2400.HCP12,Quantity,Numeric value of quantity,S,,,,,
2400.HCP13,Reject Reason Code,Code assigned by issuer to identify reason for rejection,S,"T1 Cannot Identify Provider as TPO (Third Party
Organization) Participant
T2 Cannot Identify Payer as TPO (Third Party
Organization) Participant
T3 Cannot Identify Insured as TPO (Third Party
Organization) Participant
T4 Payer Name or Identifier Missing
T5 Certification Information Missing
T6 Claim does not contain enough information for repricing",,,,
2400.HCP14,Policy Compliance Code,Code specifying policy compliance,S,"1 Procedure Followed (Compliance)
2 Not Followed - Call Not Made (Non-Compliance Call
Not Made)
3 Not Medically Necessary (Non-Compliance NonMedically Necessary)
4 Not Followed Other (Non-Compliance Other)
5 Emergency Admit to Non-Network Hospital",,,,
2400.HCP15,Exception Code,"Code specifying the exception reason for consideration of out-of-network health
care services",S,"1 Non-Network Professional Provider in Network
Hospital
2 Emergency Care
3 Services or Specialist not in Network
4 Out-of-Service Area
5 State Mandates
6 Other",,,,
Loop 2410 - Drug identification,,,,,,,`,
Segment - LIN Drug identification (Situational),,,,,,,`,
2410.LIN02,Product/Service ID Qualifier,"Code identifying the type/source of the descriptive number used in
Product/Service ID",R,N4 National Drug Code in 5-4-2 Format,,NDCCode_Qualifier,Line Level,
2410.LIN03,Product/Service ID,Identifying number for a product or service,R,,,NDC_Code,Line Level,
Segment - CTP Drug Quantity (Required),,,,,,,,
2410.CTP04,Quantity,Numeric value of quantity,R,,,NDC_Quantity,Line Level,
2410.CTP05-1,COMPOSITE UNIT OF MEASURE-Unit or Basis for Measurement Code,To identify a composite unit of measure,R,,,NDC_measurement_Type,Line Level,
Segment - REF Prescription or compound drug association Number (Situational),,,,,,,,
2410.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"VY Link Sequence Number
XZ Pharmacy Prescription Number",,,,
2410.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,
Loop 2420A (Situational),,,,,,,,
Segment - NM1 Operating Physician Name (Situational),,,,,,,,
2420A.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,72 Operating Physician,,,,
2420A.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,1 Person,,,,
2420A.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,,,
2420A.NM104,Name First,Individual first name,S,,,,,
2420A.NM105,Name Middle,Individual middle name or initial,S,,,,,
2420A.NM107,Name Suffix,Suffix to individual name,S,,,,,
2420A.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code",S,"XX Centers for Medicare and Medicaid Services
National Provider Identifier",,,,
2420A.NM109,Identification Code,Code identifying a party or other code,S,,,,,
Segment - REF Operating Physician Secondary Identification (Situational),,,,,,,,
2420A.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number
LU Location Number",,,,
2420A.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,
2420A.REF04.01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,2U Payer Identification Number,,,,
2420A.REF04.02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,
Loop 2420B (Situational),,,,,,,,
Segment - NM1 Other Operating Physician Name (Situational),,,,,,,,
2420B.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,ZZ Mutually Defined,,,,
2420B.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,1 Person,,,,
2420B.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,,,
2420B.NM104,Name First,Individual first name,S,,,,,
2420B.NM105,Name Middle,Individual middle name or initial,S,,,,,
2420B.NM107,Name Suffix,Suffix to individual name,S,,,,,
2420B.NM108,Identification Code Qualifier,,S,XX Centers for Medicare and Medicaid Services National Provider Identifier,,,,
2420B.NM109,Identification Code,Code identifying a party or other code,S,,,,,
Segment - REF Other Operating Physician Secondary Identification (Situational),,,,,,,,
2420B.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number
LU Location Number",,,,
2420B.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,
2420B.REF04.01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,2U Payer Identification Number,,,,
2420B.REF04.02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,
Loop 2420C (Situational),,,,,,,,
Segment - NM1 Rendering Provider Name (Situational),,,,,,,,
2420C.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,82 Rendering Provider,,,,
2420C.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,1 Person,,,,
2420C.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,,,
2420C.NM104,Name First,Individual first name,S,,,,,
2420C.NM105,Name Middle,Individual middle name or initial,S,,,,,
2420C.NM107,Name Suffix,Suffix to individual name,S,,,,,
2420C.NM108,Identification Code Qualifier,,S,"XX Centers for Medicare and Medicaid Services
National Provider Identifier",,,,
2420C.NM109,Identification Code,Code identifying a party or other code,S,,,,,
Segment - REF Rendering Provider Secondary Identification (Situational),,,,,,,,
2420C.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number
LU Location Number",,,,
2420C.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,
2420C.REF04.01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,2U Payer Identification Number,,,,
2420C.REF04.02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,
Loop 2420D (Situational),,,,,,,,
Segment - NM1 Referring Provider Name (Situational),,,,,,,,
2420D.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,DN Referring Provider,,,,
2420D.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,1 Person,,,,
2420D.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,,,
2420D.NM104,Name First,Individual first name,S,,,,,
2420D.NM105,Name Middle,Individual middle name or initial,S,,,,,
2420D.NM107,Name Suffix,Suffix to individual name,S,,,,,
2420D.NM108,Identification Code Qualifier,,S,"XX Centers for Medicare and Medicaid Services
National Provider Identifier",,,,
2420D.NM109,Identification Code,Code identifying a party or other code,S,,,,,
Segment - REF Referring Provider Secondary Identification (Situational),,,,,,,,
2420D.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B State License Number
1G Provider UPIN Number
G2 Provider Commercial Number
LU Location Number",,,,
2420D.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,S,,,,,
2420D.REF04.01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,2U Payer Identification Number,,,,
2420D.REF04.02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,
Loop 2430   — LINE ADJUDICATION INFORMATION(Situational) Loop Repeat: 15,,,,,,,,
Segment - SVD Line Adjudication Information (Situational),,,,,,,,
2430.SVD01,Identification Code,Code identifying a party or other code,R,,,,,
2430.SVD02,Monetary Amount,Monetary Amount,R,,,,,
2430.SVD03.01,Product/Service ID Qualifier,"Code identifying the type/source of the descriptive number used in
Product/Service ID",R,,,,,
2430.SVD03.02,Product/Service ID,Identifying number for a product or service,R,,,,,
2430.SVD03.03,Procedure Modifier,"This identifies special circumstances related to the performance of the
service, as defined by trading partners",S,,,,,
2430.SVD03.04,Procedure Modifier,"This identifies special circumstances related to the performance of the
service, as defined by trading partners",S,,,,,
2430.SVD03.05,Procedure Modifier,"This identifies special circumstances related to the performance of the
service, as defined by trading partners",S,,,,,
2430.SVD03.06,Procedure Modifier,"This identifies special circumstances related to the performance of the
service, as defined by trading partners",S,,,,,
2430.SVD03.07,Description,"A free-form description to clarify the related data elements and their
content",S,,,,,
2430.SVD04,Product/Service ID,Identifying number for a product or service,R,,,,,
2430.SVD05,Quantity,Numeric value of quantity,R,,,,,
2430.SVD06,Assigned Number,Number assigned for differentiation within a transaction set,S,,,,,
Segment - CAS Line Adjustment (Situational),,,,,,,,
2430.CAS01,Claim Adjustment Group Code,Code identifying the general category of payment adjustment,R,"CO : Contractual Obligations
CR : Correction and Reversals
OA : Other adjustments
PI : Payor Initiated Reductions
PR : Patient Responsibility",,,,
2430.CAS02,Claim Adjustment Reason Code,Code identifying the detailed reason the adjustment was made,R,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2430.CAS03,Monetary Amount,Monetary Amount,R,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2430.CAS04,Quantity,Numeric value of quantity,S,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2430.CAS05,Claim Adjustment Reason Code,Code identifying the detailed reason the adjustment was made,R,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2430.CAS06,Monetary Amount,Monetary Amount,R,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2430.CAS07,Quantity,Numeric value of quantity,S,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2430.CAS08,Claim Adjustment Reason Code,Code identifying the detailed reason the adjustment was made,R,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2430.CAS09,Monetary Amount,Monetary Amount,R,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2430.CAS10,Quantity,Numeric value of quantity,S,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2430.CAS11,Claim Adjustment Reason Code,Code identifying the detailed reason the adjustment was made,R,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2430.CAS12,Monetary Amount,Monetary Amount,R,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2430.CAS13,Quantity,Numeric value of quantity,S,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2430.CAS14,Claim Adjustment Reason Code,Code identifying the detailed reason the adjustment was made,R,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2430.CAS15,Monetary Amount,Monetary Amount,R,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2430.CAS16,Quantity,Numeric value of quantity,S,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2430.CAS17,Claim Adjustment Reason Code,Code identifying the detailed reason the adjustment was made,R,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2430.CAS18,Monetary Amount,Monetary Amount,R,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2430.CAS19,Quantity,Numeric value of quantity,S,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
Segment - DTP Line Check or Remittance Date (Required),,,,,,,,
2430.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,573 Date Claim Paid,,,,
2430.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8,,,,
2430.DTP03,Date Time Period,,R,,,,,
Segment - AMT Remaining Patient Liability (Situational),,,,,,,,
2430.AMT01,Amount Qualifier Code,Code to qualify amount,R,EAF Amount Owed,,,,
2430.AMT02,Monetary Amount,Monetary Amount/Remaining Patient Liability,R,,,,,
Segment SE (Required),,,,,,,,
SE Transaction Set Trailer (Required),,,,,,,,
SE01,Number of Included Segments,"Total number of segments included in a transaction set including ST and SE
segments",R,Count Of ST,,,,
SE02,Transaction Set Control Number,Unique Sequential Number Assigned by Internal Processes for each Transaction Set. Starts from 001 and increments with each transaction set,R,ST02 Value,,,,
Segment GE (Required),,,,,,,,
GE Functional Group Trailer (Required),,,,,,,,
GE01,Number of Transaction Sets Included,"Total number of transaction sets included in the functional group or interchange
(transmission) group terminated by the trailer containing this data element",R,Count Of GS,,,,
GE02,Group Control Number,Assigned number originated and maintained by the sender,R,GS06 Value,,,,
Segment IEA (Required),,,,,,,,
IEA Interchange Control Trailer (Required),,,,,,,,
IEA01,Number of Included Functional Groups,A count of the number of functional groups included in an interchange,R,Count Of ISA,,,,
IEA02,Interchange Control Number,A control number assigned by the interchange sender.  It must be identical to ISA13,R,ISA13 Value - 319003402,,,,
```

## QA Automation/EdifecsProduct_MappingSpec_QA Automation_837I_EDI_to_CSVConversion_V1.0.xlsx — Default Values

```csv
Field in CSV,Claim/Line Level Record,Default value/Mapping logic
Claimid,Claim Level/Line Level,An incremental value which is unique for each claim record in the file .
Scenarios,Claim Level,Blank
EdiFilename,Claim Level,Name of the IB EDI 837I file
totalClaimCount,Claim Level,Total number of claims in the IB file
Entry_Date,Claim Level,Processing date/time in the format: YYYY-MM-DDTHH:mm:ss
Claim_Source,Claim Level,Refer the ClaimsourceLookup crosswalk in IB 837 and populate.
Claim_Delivery_Type,Claim Level,Refer the ClaimsourceLookup crosswalk in IB 837 and populate.
Payee_Type_Field,Claim Level,Hardcode as 'Supplier'
Benefit_Plan_Type,Claim Level,Hardcode as 1 (medical)
claim_Payor_Type,Claim Level,Hardcode as '1 '
Number_of_service_lines,Claim Level,No of lines in the claim
Endofrecord,Claim Level/Line Level,Hardcode as 'EOR'
```

## QA Automation/EdifecsProduct_MappingSpec_QA Automation_837I_EDI_to_CSVConversion_V1.0.xlsx — Sheet1

```csv
institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/supplierInformation/address
```

## QA Automation/EdifecsProduct_MappingSpec_QA Automation_837P_CSV_to_EDI_Conversion_V1.1.xlsx — Cover Page

```csv
Data Extraction for QA Automation- EDIFECS,,,,,,,,,
,,,,,,,,,
Business Area: QA Automation 837P - CSV to EDI conversion,,,,,,,,,
,,,,,,,,,
This document provides the Mapping Specification for converting 837P  CSV format into EDI file as part of the data extraction for QA automation. Document is intended for EDIFECS Product Team,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,Version,,24.1.0.0,,,
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

## QA Automation/EdifecsProduct_MappingSpec_QA Automation_837P_CSV_to_EDI_Conversion_V1.1.xlsx — Version History

```csv
Revision History,,,,
,,,,
,,,,
,,,,
V#,Date,Author,Reviewer(s)/ Contributor(s),Comments
0.1,02/29/2024,Jishnu Kumar & Swedha Kumar,Sandhya Pullundassery,Initial Version
1,02/29/2024,Jishnu Kumar & Swedha Kumar,Sandhya Pullundassery,Final Version
1.1,08/26/2024,Ambily R,Sandhya Pullundassery,Added new fields in CSV layout - INTP-9858
```

## QA Automation/EdifecsProduct_MappingSpec_QA Automation_837P_CSV_to_EDI_Conversion_V1.1.xlsx — CSV Format

```csv
SI.No,CSV Field,,Claim/Line Level,Data Type,Length,Usage
1,Claimid,,Claim Level/Line Level,Varchar,10,R
2,Scenarios,,Claim Level,Varchar,100,S
3,EdiFilename,,Claim Level,Varchar,100,S
4,totalClaimCount,,Claim Level,Varchar,10,S
5,SenderId,ISA06,Claim Level,Varchar,15,S
6,ReceiverId,ISA08,Claim Level,Varchar,15,S
7,Receipt_Date,,Claim Level,Varchar,10,S
8,Entry_Date,,Claim Level,Varchar,10,S
9,Clean_Claim_Date,BHT04,Claim Level,Varchar,10,S
10,Claim_Delivery_Type,hardcode,Claim Level,Varchar,1,S
11,Payee_Type_Field,hardcode,Claim Level,Varchar,10,S
12,Frequency_Code,2300.CLM05.03,Claim Level,Varchar,1,S
13,Clearing_House_Trace_Number,2300.REF02*D9,Claim Level,Varchar,50,S
14,External_Batch_Sequence_Number,ST02,Claim Level,Varchar,9,S
15,Benefit_Plan_Type,hardcode,Claim Level,Varchar,1,S
16,TradingPartnerId,ISA06,Claim Level,Varchar,15,S
17,Claim_Source,ISA06,Claim Level,Varchar,15,S
18,claim_Payor_Type,hardcode,Claim Level,Varchar,1,S
19,Claim_Filing_Code,2000B.SBR09,Claim Level,Varchar,2,S
20,Attachment_Set_ID,2300.PWK06,Claim Level,Varchar,80,S
21,Claim_Number,2300.REF02,Claim Level,Varchar,50,S
22,Submitted_Subscriber_Id,2010BA.NM109,Claim Level,Varchar,80,S
23,Subscriber_Identification_Number,2010BA.NM109,Claim Level,Varchar,80,S
24,Subscriber_Name,,Claim Level,Varchar,120,S
25,Subscriber_Last_Name,2010BA.NM103,Claim Level,Varchar,60,S
26,Subscriber_First_Name,2010BA.NM104,Claim Level,Varchar,35,S
27,Subscriber_Middle_Name,2010BA.NM105,Claim Level,Varchar,25,S
28,Subscriber_Street_Address,2010BA.N301,Claim Level,Varchar,55,S
29,Subscriber_City_Name,2010BA.N401,Claim Level,Varchar,30,S
30,Subscriber_State_Code,2010BA.N402,Claim Level,Varchar,2,S
31,Subscriber_Postal_Code,2010BA.N403,Claim Level,Varchar,15,S
32,Subscriber_Gender_Code,2010BA.DMG03,Claim Level,Varchar,1,S
33,Subscriber_Date_Of_Birth,2010BA.DMG02,Claim Level,Varchar,10,S
34,Benefit_Assignment,2300.CLM08,Claim Level,Varchar,1,S
35,Member_Identification_Number,,Claim Level,Varchar,80,S
36,Member_Name,,Claim Level,Varchar,100,S
37,Member_Last_Name,2010CA.NM103,Claim Level,Varchar,60,S
38,Member_First_Name,2010CA.NM104,Claim Level,Varchar,35,S
39,Member_Street_Address,2010CA.N301,Claim Level,Varchar,55,S
40,Member_City_Name,2010CA.N401,Claim Level,Varchar,30,S
41,Member_State_Code,2010CA.N402,Claim Level,Varchar,2,S
42,Member_Postal_Code,2010CA.N403,Claim Level,Varchar,15,S
43,Member_Gender_Code,2010CA.DMG03,Claim Level,Varchar,1,S
44,Member_DateOfBirth,2010CA.DMG02,Claim Level,Varchar,10,S
45,Submitter_Id,1000A.NM109,Claim Level,Varchar,80,S
46,Submitter_Name,1000A.NM103,Claim Level,Varchar,60,S
47,Relationship_To_Subscriber_Code,2000B.SBR02,Claim Level,Varchar,2,S
48,Account_Number,2300.CLM01,Claim Level,Varchar,38,S
49,Release_Authorization,2300.CLM09,Claim Level,Varchar,1,S
50,Assignment_Acceptance,2300.CLM07,Claim Level,Varchar,1,S
51,Supplier_Billing_Name,2010AA.NM103,Claim Level,Varchar,60,S
52,Tax_Identification_Number,2010AA.REF02,Claim Level,Varchar,50,S
53,Tax_Id_Code,2010AA.REF01,Claim Level,Varchar,3,S
54,Supplier_Street_Address,,Claim Level,Varchar,55,S
55,Supplier_City_Name,2010AA.N401,Claim Level,Varchar,30,S
56,Supplier_State_Code,2010AA.N402,Claim Level,Varchar,2,S
57,Supplier_Postal_Code,2010AA.N403,Claim Level,Varchar,15,S
58,Phone_Country_Code,,Claim Level,Varchar,1,S
59,Phone_Area_Code,,Claim Level,Varchar,3,S
60,Phone_Number,,Claim Level,Varchar,7,S
61,Supplier_Npi,2010AA.NM109,Claim Level,Varchar,80,S
62,Supplier_PIN_Number,2010AA.REF02,Claim Level,Varchar,50,S
63,Additional_Code,,Claim Level,Varchar,50,S
64,Principal_Diagnosis_Code,,Claim Level,Varchar,30,S
65,Diagnosis_Code_1,,Claim Level,Varchar,30,S
66,Diagnosis_Code_2,,Claim Level,Varchar,30,S
67,Diagnosis_Code_3,,Claim Level,Varchar,30,S
68,Diagnosis_Code_4,,Claim Level,Varchar,30,S
69,Diagnosis_Code_5,,Claim Level,Varchar,30,S
70,Diagnosis_Code_6,,Claim Level,Varchar,30,S
71,Diagnosis_Code_7,,Claim Level,Varchar,30,S
72,Diagnosis_Code_8,,Claim Level,Varchar,30,S
73,Diagnosis_Code_9,,Claim Level,Varchar,30,S
74,Diagnosis_Code_10,,Claim Level,Varchar,30,S
75,Diagnosis_Code_11,,Claim Level,Varchar,30,S
76,Referring_Practitioner_Name,2310A.NM103,Claim Level,Varchar,130,S
77,Referring_Practitioner_FirstName,2310A.NM103,Claim Level,Varchar,35,S
78,Referring_Practitioner_LastName,2310A.NM104,Claim Level,Varchar,60,S
79,Referring_Practitioner_MiddleName,2310A.NM105,Claim Level,Varchar,25,S
80,Referring_Practitioner_Suffix,2310A.NM107,Claim Level,Varchar,10,S
81,Referring_Practitioner_Identification,2310A.REF02,Claim Level,Varchar,50,S
82,Referring_IdQualifier,2310A.REF01,Claim Level,Varchar,3,S
83,Referring_ReferralNumber,2300.REF02,Claim Level,Varchar,50,S
84,Referring_npi,2310A.NM109,Claim Level,Varchar,80,S
85,Rendering_Provider_FirstName,2310A.NM103,Claim Level,Varchar,35,S
86,Rendering_Provider_LastName,2310A.NM104,Claim Level,Varchar,60,S
87,Rendering_Provider_MiddleName,2310A.NM105,Claim Level,Varchar,25,S
88,Rendering_Provider_Suffix,2310A.NM107,Claim Level,Varchar,10,S
89,Rendering_Provider_npi,2310A.NM109,Claim Level,Varchar,80,S
90,RenderingFacility_Name,2310C.NM103,Claim Level,Varchar,60,S
91,RenderingFacility_StreetAddress,2310C.N301,Claim Level,Varchar,55,S
92,RenderingFacility_CityName,2310C.N401,Claim Level,Varchar,30,S
93,RenderingFacility_StateCode,2310C.N402,Claim Level,Varchar,2,S
94,RenderingFacility_PostalCode,2310C.N403,Claim Level,Varchar,15,S
95,Supervising_Provider_FirstName,2310A.NM103,Claim Level,Varchar,35,S
96,Supervising_Provider_LastName,2310A.NM104,Claim Level,Varchar,60,S
97,Supervising_Provider_MiddleName,2310A.NM105,Claim Level,Varchar,25,S
98,Supervising_Provider_Suffix,2310A.NM107,Claim Level,Varchar,10,S
99,Supervising_Provider_npi,2310A.NM109,Claim Level,Varchar,80,S
100,Charged_Amount,2300.CLM02,Claim Level,Varchar,18,S
101,Number_of_service_lines,2400.LX01,Claim Level,Varchar,6,S
102,Placeofservice_Code,,Claim Level,Varchar,2,S
103,Original_Line_Number,,Line Level,Varchar,6,S
104,Start_Date,,Line Level,Varchar,10,S
105,End_Date,,Line Level,Varchar,10,S
106,Service_Line_POS,2400.SV105,Line Level,Varchar,2,S
107,Service_Line_ServiceCode,2400.SV101.02,Line Level,Varchar,48,S
108,Service_Line_ServiceFee,,Line Level,Varchar,18,S
109,Service_Line_ServiceUnitCount,,Line Level,Varchar,15,S
110,Service_Line_ServiceMinuteCount,,Line Level,Varchar,15,S
111,Service_Line_RenderingProviderFirstName,2420A.NM103,Line Level,Varchar,35,S
112,Service_Line_RenderingProviderLastName,,Line Level,Varchar,60,S
113,Service_Line_RenderingProvidernpi,,Line Level,Varchar,80,S
114,Service_Line_OtherRenderingProviderId,,Line Level,Varchar,50,S
115,Service_Line_RenderingPractitionerSpecialty,2420A.PRV03,Line Level,Varchar,50,S
116,Line_Supervising_Physician_FirstName,,Line Level,Varchar,35,S
117,Line_Supervising_Physician_LastName,,Line Level,Varchar,60,S
118,Line_Supervising_Physician_npi,,Line Level,Varchar,80,S
119,Line_Ordering_Physician_FirstName,,Line Level,Varchar,35,S
120,Line_Ordering_Physician_LastName,,Line Level,Varchar,60,S
121,Diagnosis_Code_Pointer_1,,Line Level,Varchar,2,S
122,Diagnosis_Code_Pointer_2,,Line Level,Varchar,2,S
123,Diagnosis_Code_Pointer_3,,Line Level,Varchar,2,S
124,Diagnosis_Code_Pointer_4,2400.SV107.01,Line Level,Varchar,2,S
125,Service_Line_Modifier_1,,Line Level,Varchar,2,S
126,Service_Line_Modifier_2,,Line Level,Varchar,2,S
127,Service_Line_Modifier_3,,Line Level,Varchar,2,S
128,Service_Line_Modifier_4,,Line Level,Varchar,2,S
129,End_of_record,,Claim Level/Line Level,Varchar,3,S
```

## QA Automation/EdifecsProduct_MappingSpec_QA Automation_837P_CSV_to_EDI_Conversion_V1.1.xlsx — 837P MappingSpec

```csv
EDILoopID. Segment,EDI Data Element Name,EDI Element Description,Usage,Enumeration Values,Sample values,Hardcode,CSV Field,Claim/Line Level Record,Mapping Logic,
"For each claim record  in the IB EDI 837P file, there should be
             1) a claim level record and
              2) line level records corresponding to each line of the claim
           in the CSV file.",,,,,,,,,,
ISA (Interchange Control Header Segment),,,,,,,,,,
ISA,Segment: Interchange Control Header,,R,,,,,,,
ISA01,Authorization Information Qualifier,Code identifying the type of information in the Authorization Information,R,00 : No Authorization Information Present,,"Hardcode as ""00""",,,,
ISA02,Authorization Information,,R,Blank (10 spaces),,Leave it blank,,,,
ISA03,Security Information Qualifier,Code identifying the type of information in the Security Information,R,00 : No Security Information Present,,"Hardcode as ""00""",,,,
ISA04,Security Information,Augsep@2023,R,Blank (10 spaces),,Leave it blank,,,,
ISA05,Interchange ID Qualifier,"Code indicating the system/method of code structure used to designate the
sender or receiver ID element being qualified",R,ZZ : Mutually Defined,,"Hardcode as ""ZZ""",,,,
ISA06,Interchange Sender ID,Sender ID,R,<Sender ID>,,,TradingPartnerId,Claim Level,,
,,,,,,,SenderId,Claim Level,,
ISA07,Interchange ID Qualifier,"Code indicating the system/method of code structure used to designate the
sender or receiver ID element being qualified",R,ZZ : Mutually Defined,,"Hardcode as ""ZZ""",,,,
ISA08,Interchange Receiver ID,Receiver Id,R,<Receiver ID>,,,ReceiverId,Claim Level,,
ISA09,Interchange Date,Date of the interchange,R,SysDate (YYMMDD),Example : 210630,"Map this value from  current date in the format of ""YYMMDD""",,,,
ISA10,Interchange Time,Time of the interchange,R,SysTime (HHMM),Example : 1732,Map this value from   current time in the format of HHMM,,,,
ISA11,Interchange Control Standards Identifier,,R,^,,"Hardcode as ""^""",,,,
ISA12,Interchange Control Version Number,Code specifying the version number of the interchange control segments,R,00501,,Hardcode as “00501”,,,,
ISA13,Interchange Control Number,A control number assigned by the interchange sender,R,,Example : 319003402,"Hardcode as ""123456789""",,,,
ISA14,Acknowledgment Requested,Code indicating sender’s request for an interchange acknowledgment,R,"0 : No Interchange Acknowledgement Requested
1 : Interchange Acknowledgment Requested",,"Hardcode as ""0""",,,,
ISA15,Usage Identifier,"Code indicating whether data enclosed by this interchange envelope is test,
production or information",R,P : Production Data T : Test,,"""P""  if it is a Production region
""T""  if it is a Non-Production region",,,,
ISA16,Component Element Separator,The delimiter used to separate component data elements,R,": = Element separator
~ = Segment Terminator",,"Hardcode  as "":""",,,,
GS (Functional Group Header),,,,,,,,,,
GS,Segment: Functional Group Header,,R,,,,,,,
GS01,Functional Identifier Code,The two-character identifier Code for the transaction set included.,R,HC : Health Care Claim (837),,Hardcode as “HC”,,,,
GS02,Application Senders Code,"Code identifying party sending transmission,  codes agreed to by trading partners
This is Submitter-specific.",R,<Sender ID>,,,SenderId,,,
GS03,Application Receivers Code,Code identifying party receiving transmission; codes agreed to by trading partners,R,<HealthPlan ID>/,,,ReceiverId,,,
GS04,Date,Date the Group Header is created.,R,SysDate (YYYYMMDD),Example : 210630,"Map this value from  current date in the format of ""YYYYMMDD""",,,,
GS05,Time,Time the Group Header is created.,R,SysTime (HHMM),Example : 1732,"Map this value from   current Time in the format of ""HHMMSS""",,,,
GS06,Group Control Number,Submitter-specific number.,R,<Group Control Number>,319003402,"Hardcode as ""123456789""",,,,
GS07,Responsible Agency Code,Code identifying the issuer of the EDI standard being used.,R,X : Accredited Standards Committee X12,,"Hardcode as ""X""",,,,
GS08,Version/Release/Industry Identifier Code,"Code indicating the version, release, subrelease, and industry identifier of the EDI
standard being used,
ST03 and GS08 must be identical",R,005010X222A1,,"Hardcode as ""005010X222A1""",,,,
ST (Transaction Set Header),,,,,,,,,,
ST,Segment: Transaction Set Header,,R,,,,,,,
ST01,Transaction Set Identifier Code,Code uniquely identifying a Transaction Set,R,837 : Health Care Claim,,"Hardcode as ""837""",,,,
ST02,Transaction Set Control Number,Unique Sequential Number Assigned by Internal Processes for each Transaction Set. Starts from 001 and increments with each transaction set,R,"<Transaction set Control Number>
Starts from 001 and increments with each transaction set",319003402,Unique control number needs to populated from process flow or map,,,,
ST03,Implementation Convention Reference,Standards Approved by ACS X12 Review Board.                 ST03 and GS08 must be identical,R,005010X222A1,,Hardcode as 005010X222A1,,,,
BHT,Segment: Beginning Of Hierarchical Transaction,,R,,,,,,,
BHT01,Hierarchical Structure Code,Code indicating the hierarchical application structure of a transaction set,R,"0019 : Information Source, Subscriber, Dependent",,0019,,,,
BHT02,Transaction Set Purpose Code,"Code identifying purpose of transaction set.  Used to convey the electronic transmission status of
the 837 batch",R,"00 : Original
18 : Reissue",,"Hardcode as ""00""",,,,
BHT03,Reference Identification,Reference information as defined for a particular Transaction Set,R,<Originator Application Transaction Identifier>,319003402,"Hardcode as ""12345""",,,,
BHT04,Date,The date the transaction was created,R,SysDate (YYYYMMDD),20210630,,Clean_Claim_Date,Claim Level,Format : YYYY-MM-DD,
,,,,,,,Receipt_Date,Claim Level,Format : YYYY-MM-DD,
BHT05,Time,The time the transaction was created,R,SysTime (HHMMSS),173250,"Map this value from   current Time in the format of ""HHMMSS""",,,,
BHT06,Transaction Type Code,Code specifying the type of transaction,R,"CH- Chargeable
RP- Reporting",,"Hardcode as ""RP""",,,,
Loop 1000A — SUBMITTER NAME (Required)  Loop Repeat: 1,,,,,,,,,,
NM1,Segment NM1 - Submitter Name  (Required),,R,,,,,,,
1000A.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,41 : Submitter,,"Hardcode as ""41""",,,,
1000A.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,"1 : Person
2 : Non-person Entity",,"Hardcode as ""2""",,,,
1000A.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,,Submitter_Name,Claim Level,,
1000A.NM104,Name First,Individual first name,S,,,,,,,
1000A.NM105,Name Middle,Individual middle name or initial,S,,,,,,,
1000A.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code",R,46 : Electronic Transmitter Identification Number (ETIN,,"Hardcode as ""46""",,,,
1000A.NM109,Identification Code,Code identifying a party or other code,R,100X,,,Submitter_Id,Claim Level,,
PER,Segment PER - Submitter EDI Contact Information,,,,,,,,,
1000A.PER01,Contact Function Code,Code identifying the major duty or responsibility of the person or group named,R,IC -  Information Contact,,"Hardcode  as ""IC""",,,,
1000A.PER02,Name,Submitter Contact Name,S,<<Submitter Name>>,,"""PRODUCT""",,,,
1000A.PER03,Communication Number Qualifier,Code identifying the type of communication number,R,"""EM"" : Electronic Mail
""FX"" : Facsimile
""TE"" : Telephone",,"Hardcode  as ""TE""",,,,
1000A.PER04,Communication Number,Complete communications number including country or area code when applicable,R,,,"Hardcode as ""1234567890""",,,,
1000A.PER05,Communication Number Qualifier,Code identifying the type of communication number,S,"""EM"" : Electronic Mail
""FX"" : Facsimile
""TE"" : Telephone",,,,,,
1000A.PER06,Communication Number,Complete communications number including country or area code when applicable,S,,,,,,,
1000A.PER07,Communication Number Qualifier,Code identifying the type of communication number,S,"""EM"" : Electronic Mail
""FX"" : Facsimile
""TE"" : Telephone",,,,,,
1000A.PER08,Communication Number,Complete communications number including country or area code when applicable,S,,,,,,,
Loop 1000B — RECEIVER NAME (Required) Loop Repeat: 1,,,,,,,,,,
NM1,Segment NM1 - Receiver Name  (Required),,R,,,,,,,
1000B.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,40 : Receiver,,"Hardcode as ""40""",,,,
1000B.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,2 : Non-Person Entity,,"Hardcode as ""2""",,,,
1000B.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,"""PRODUCT""",,,,
1000B.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code",R,46 :  Electronic Transmitter Identification Number (ETIN,,"Hardcode as ""46""",,,,
1000B.NM109,Identification Code,Code identifying a party,R,,,"Default values
<123456789123>",,,,
Loop 2000A — BILLING PROVIDER HIERARCHICAL LEVEL (Required)  Loop Repeat: >1,,,,,,,,,,
HL,Segment HL - Billing Provider Hierarchical Level  (Required),,R,,,,,,,
2000A.HL01,Hierarchical ID Number,"A unique number assigned by the sender to identify a particular data segment in
a hierarchical structure",R,"The first HL01 within each ST-SE envelope must begin with “1”,
and be incremented by one each time an HL is used in the
transaction",,Generated by Edifecs,,,,
2000A.HL02,Hierarchical Parent ID Number,,R,,,,,,,
2000A.HL03,Hierarchical Level Code,Code defining the characteristic of a level in a hierarchical structure,R,20 : Information Source,,"Hardcode as ""20""",,,,
2000A.HL04,Hierarchical Child Code,"Code indicating if there are hierarchical child data segments subordinate to the
level being described.",R,"1 : Additional Subordinate HL Data Segment in This
Hierarchical Structure.",,Generated by Edifecs,,,,
PRV,Segment PRV - Billing Provider Specialty Information  (Situational),,,,,,,,,
2000A.PRV01,Provider Code,Code identifying the type of provider,R,BI : Billing,,"Hardcode as ""BI""",,,,
2000A.PRV02,Reference Identification Qualifier,Code qualifying the Reference Identification,R,PXC :  Health Care Provider Taxonomy Code,,"Hardcode as ""PXC""",,,,
2000A.PRV03,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,Additional_Code,Claim Level,,
CUR,Segment CUR - Foreign Currency Information (Situational),,,,,,,,,
2000A.CUR01,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,,,,,,,
2000A.CUR02,Currency Code,Code (Standard ISO) for country in whose currency the charges are specified,R,,,,,,,
Loop 2010AA - BILLING PROVIDER NAME (Required) Loop Repeat: 1,,,,,,,,,,
NM1,Segment NM1 - Billing Provider Name (Required),,R,,,,,,,
2010AA.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,85 :  Billing Provider,,"Hardcode as ""85""",,,,
2010AA.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,"1 : Person
2 : Non-Person Entity",,Hard code as '2',,,,
2010AA.NM103,Name Last or Organization Name,Individual last name or organizational name,S,,,,Supplier_Billing_Name,Claim Level,,
2010AA.NM104,Name First,Individual first name,S,,,,,,,
2010AA.NM105,Name Middle,Individual middle name or initial,S,,,,,,,
2010AA.NM107,Name Suffix,Suffix to individual name,S,,,,,,,
2010AA.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code (67)",S,"XX :  Centers for Medicare and Medicaid Services
National Provider Identifier",,"Hardcode as ""XX""",,,,
2010AA.NM109,Identification Code,Code identifying a party or other code / Billing Provider Identifier,S,,1477569838,,Supplier_Npi,Claim Level,,
N3,Segment N3 - Billing Provider Address (Required),,R,,,,,,,
2010AA.N301,Address Information,Address information,R,,777 BANNOCK ST,,Supplier_Street_Address,Claim Level,,
2010AA.N302,Address Information,Address information,S,,,,,,,
N4,"Segment N4 - Billing Provider City, State, ZIP Code (Required)",,R,,,,,,,
2010AA.N401,City Name,Free-form text for city name,R,,DENVER,,Supplier_City_Name,Claim Level,,
2010AA.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,CO,,Supplier_State_Code,Claim Level,,
2010AA.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,802044507,,Supplier_Postal_Code,Claim Level,,
2010AA.N404,Country Code,Code identifying the country,S,,,,,,,
2010AA.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,,
REF,Segment REF - Billing Provider Tax Identification (Required),,R,,,,,,,
2010AA.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"EI : Employer’s Identification Number
SY : Social Security Number",,,Tax_Id_Code,Claim Level,,
2010AA.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,Tax_Identification_Number,Claim Level,"If /837/2000A/2010AA/REF01 (Reference Identification Qualifier) is ‘EI’ then it will be mapped into ‘XX-XXXXXXX’ format to taxIdentificationNumber
If /837/2000A/2010AA/REF01 (Reference Identification Qualifier) is ‘SY’ then it will be mapped into ‘XXX-XX-XXXX’ format to taxIdentificationNumber",
REF,Segment REF - Billing Provider UPIN/License Information (Situational),,,,,,,,,
2010AA.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"1G  : Provider UPIN Number
0B :  State License Number",,,,,,
2010AA.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,Supplier_PIN_Number,Claim Level,When REF01=1G,
PER,Segment - PER Billing Provider Contact Information (Situational),,,,,,,,,
2010AA.PER01,Contact Function Code,Code identifying the major duty or responsibility of the person or group name,R,IC -  Information Contact,,"Hardcode as ""IC""",,,,
2010AA.PER02,Name,Billing Provider Contact Name,S,,,"Hardcode as ""Product""",,,,
2010AA.PER03,Communication Number Qualifier,Code identifying the type of communication number,R,"""EM"" : Electronic Mail
""FX"" : Facsimile
""TE"" : Telephone",,"Hardcode as ""TE""",,,,
2010AA.PER04,Communication Number,Communication Number,,,,,Concatenate Phone_Area_Code + Phone_Number,Claim Level,,
2010AA.PER05,Communication Number Qualifier,Code identifying the type of communication numbe,S,"""EM"" : Electronic Mail
""FX"" : Facsimile
""TE"" : Telephone
""EX"" : Telephone Extension",,,,,,
2010AA.PER06,Communication Number,Communication Number,S,,,,,,,
2010AA.PER07,Communication Number Qualifier,Code identifying the type of communication number,S,,,,,,,
2010AA.PER08,Communication Number,,S,,,,,,,
Loop 2010AB - PAY-TO ADDRESS NAME (Situational)  Loop Repeat: 1,,,,,,,,,,
NM1,Segment - NM1 Pay-to Address Name (Situational),,,,,,,,,
2010AB.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,87: Pay-to Provider,,,,,,
2010AB.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,"1 : Person
2:  Non-Person Entity",,,,,,
N3,Segment - N3 Pay-to Address - ADDRESS (Required),,R,,,,,,,
2010AB.N301,Address Information,Address Information,R,,PO BOX 677931,,,,,
2010AB.N302,Address Information,Address Information,S,,,,,,,
N4,"Segment - N4 Pay-To Address City, State, ZIP Code (Required)",,R,,,,,,,
2010AB.N401,City Name,Free-form text for city name,R,,DALLAS,,,,,
2010AB.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,TX,,,,,
2010AB.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,752677931,,,,,
2010AB.N404,Country Code,Code identifying the country,S,,,,,,,
2010AB.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,,
Loop 2010AC - — PAY-TO PLAN NAME  (Situational)   Loop Repeat: 1,,,,,,,,,,
NM1,Segment - NM1 Pay-To Plan Name (Situational),,,,,,,,,
2010AC.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,PE : Payee,,,,,,
2010AC.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,2 : Non-Person Entity,,,,,,
2010AC.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,,,,,
2010AC.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),R,,,,,,,
2010AC.NM109,Identification Code,Code identifying a party or other code,R,,,,,,,
N3,Segment - N3 Pay-to Plan Address (Required),,R,,,,,,,
2010AC.N301,Address Information,Address Information,R,,,,,,,
2010AC.N302,Address Information,Address Information,S,,,,,,,
N4,"Segment - N4 Pay-To Plan City, State, ZIP Code (Required)",,R,,,,,,,
2010AC.N401,City Name,Free-form text for city name,R,,,,,,,
2010AC.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,,,,,
2010AC.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,,,,,,
2010AC.N404,Country Code,Code identifying the country,S,,,,,,,
2010AC.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,,
REF,Segment - REF Pay-to Plan Secondary Identification (Required),,R,,,,,,,
2010AC.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,,,,,,,
2010AC.REF02,Reference Identification,"Reference information as specified
by the Reference Identification Qualifier",R,,,,,,,
REF,Segment - REF Pay-To Plan Tax Identification Number (Required),,R,,,,,,,
2010AC.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,EI : Employer’s Identification Number,,,,,,
2010AC.REF02,Reference Identification,"Reference information as specified
by the Reference Identification Qualifier",R,,,,,,,
Loop 2000B — SUBSCRIBER HIERARCHICAL LEVEL  (Required)  Loop Repeat: >1,,,,,,,,,,
HL,Segment - HL Subscriber Hierarchical Level (Required),,,,,,,,,
2000B.HL01,Hierarchical ID Number,"A unique number assigned by the sender to identify a particular data segment in
a hierarchical structure",R,"2000A.HL01 + 1

Incremented at each new HL segment.",,Generated by Edifecs,,,,
2000B.HL02,Hierarchical Parent ID Number,"Identification number of the next higher hierarchical data segment that the data
segment being described is subordinate to",R,2000A.HL01,,2000A.HL01,,,,
2000B.HL03,Hierarchical Level Code,Code defining the characteristic of a level in a hierarchical structure,R,22 - Subscriber,,"Hardcode as ""22""",,,,
2000B.HL04,Hierarchical Child Code,"Code indicating if there are hierarchical child data segments subordinate to the
level being described.",R,"0 :  HL04 has no subordinate levels  (the subscriber is the patient and there are no dependent claims)
1: HL04 has subordinate levels",,Generated by Edifecs,,,,
SBR,Segment - SBR Subscriber Information (Required),,,,,,,,,
2000B.SBR01,Payer Responsibility Sequence Number Code,"Code identifying the insurance carrier’s level of responsibility for a payment of a
claim",R,"P : Primary
S : Secondary
T  : Tertiary",,"Hardcode as ""P""",,,,
2000B.SBR02,Individual Relationship Code,Code indicating the relationship between two individuals or entities,S,18 : Self,,"Hardcode as ""18""",,Claim Level,,
2000B.SBR03,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,S,,,,,,,
2000B.SBR04,Name,,S,,,,,,,
2000B.SBR05,Insurance Type Code,Code identifying the type of insurance policy within a specific insurance program,S,"12 :  Medicare Secondary Working Aged Beneficiary or
Spouse with Employer Group Health Plan
13 : Medicare Secondary End-Stage Renal Disease
Beneficiary in the Mandated Coordination Period
with an Employer’s Group Health Plan
14 : Medicare Secondary, No-fault Insurance including
Auto is Primary
15 : Medicare Secondary Worker’s Compensation
16 : Medicare Secondary Public Health Service (PHS)or
Other Federal Agency
41 : Medicare Secondary Black Lung
42 : Medicare Secondary Veteran’s Administration
43 : Medicare Secondary Disabled Beneficiary Under
Age 65 with Large Group Health Plan (LGHP)
47 : Medicare Secondary, Other Liability Insurance",,,,,,
2000B.SBR09,Claim Filing Indicator Code,,S,"11 : Other Non-Federal Programs
12 : Preferred Provider Organization (PPO)
13 : Point of Service (POS)
14 : Exclusive Provider Organization (EPO)
15 : Indemnity Insurance
16 : Health Maintenance Organization (HMO) Medicare
Risk
17 : Dental Maintenance Organization
AM :  Automobile Medical
BL :  Blue Cross/Blue Shield
CH :  Champus
CI :  Commercial Insurance Co.
DS :  Disability
FI :  Federal Employees Program
HM :  Health Maintenance Organization
LM :  Liability Medical
MA :  Medicare Part A
MB :  Medicare Part B
MC :  Medicaid
OF :  Other Federal Program
1484 Use code OF when submitting Medicare Part D
claims.
TV Title V
VA Veterans Affairs Plan
WC Workers’ Compensation Health Claim
ZZ Mutually Defined
71 Use Code ZZ when Type of Insurance is not known.",,,Claim_Filing_Code,Claim Level,,
PAT,Segment - PAT Patient Information (Situational),,,,,,,,,
2000B.PAT05,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",S,D8 : Date Expressed in Format CCYYMMDD,,,,,,
2000B.PAT06,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times / Patient Death Date",S,,,,,,,
2000B.PAT07,Unit or Basis for Measurement Code,"Code specifying the units in which a value is being expressed, or manner in which
a measurement has been taken",S,01 : Actual Pounds,,,,,,
2000B.PAT08,Weight,Numeric value of weight,S,,,,,,,
2000B.PAT09,Yes/No Condition or Response Code,Code indicating  whether the patient is pregnant or not pregnant.,S,Y :Yes,,,,,,
Loop2010BA — SUBSCRIBER NAME (Required) Loop Repeat: 1,,,S,,,,,,,
NM1,Segment - NM1 Subscriber Name (Required),,,,,,,,,
2010BA.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,IL :  Insured or Subscriber,,"Hardcode as ""IL""",,,,
2010BA.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,"1 : Person
2 : Non-Person Entity",,"Hardcode as ""1""",,,,
2010BA.NM103,,Individual last name or organizational name,R,,,,Subscriber_Last_Name,Claim Level,,
2010BA.NM104,Name First,Individual first name,S,,,,Subscriber_First_Name,Claim Level,,
2010BA.NM105,Name Middle,Individual middle name or initial,S,,,,Subscriber_Middle_Name,Claim Level,,
2010BA.NM107,Name Suffix,Suffix to individual name,S,,,,,,,
2010BA.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code",S,"II :  Standard Unique Health Identifier for each Individual in the United States
MI  :  Member Identification Number",,"Hardcode as ""MI""",,,,
2010BA.NM109,,,,,,,Subscriber_Identification_Number,Claim Level,Remove all special characters including space and map only the alphanumeric characters,
N3,Segment - N3 Subscriber Address (Situational),,,,,,,,,
2010BA.N301,Address Information,Address Information,R,,4600 W 9TH AVE UNIT 216,,Subscriber_Street_Address,Claim Level,,
2010BA.N302,Address Information,Address Information,S,,,,,,,
N4,"Segment - N4 Subscriber City, State, ZIP Code (Situational)",,,,,,,,,
2010BA.N401,City Name,Free-form text for city name,R,,DENVER,,Subscriber_City_Name,Claim Level,,
2010BA.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,CO,,Subscriber_State_Code,Claim Level,,
2010BA.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,802042991,,Subscriber_Postal_Code,Claim Level,,
2010BA.N404,Country Code,Code identifying the country,S,,,,,,,
2010BA.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,,
DMG,Segment - DMG Subscriber Demographic Information (Situational),,,,,,,,,
2010BA.DMG01,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 :  Date Expressed in Format CCYYMMDD,,"Hardcode as ""D8""",,,,
2010BA.DMG02,Date Time Period,Date Time Period,R,,19471120,,Subscriber_Date_Of_Birth,Claim Level,Format : YYYY-MM-DD,
2010BA.DMG03,Gender Code,Code indicating the sex of the individual,R,"F : Female
M : Male",,,Subscriber_Gender_Code,Claim Level,,
REF,Segment - REF Subscriber Secondary Identification (Situational),,,,,,,,,
2010BA.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,SY:Social Security Number,,,,,,
2010BA.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier /: Subscriber Supplemental Identifier,R,,,,,,,
REF,Segment - REF Property and Casualty Claim Number (Situational),,,,,,,,,
2010BA.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,Y4: Agency Claim Number,,,,,,
2010BA.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier / Property Casualty Claim Number,R,,,,,,,
PER,Segment - PER Property and Casualty Subscriber Contact Information (Situational),,,,,,,,,
2010BA.PER01,Contact Function Code,Code identifying the major duty or responsibility of the person or group named,R,IC : Information Contact,,,,,,
2010BA.PER02,Name,,S,,,,,,,
2010BA.PER03,Communication Number Qualifier,Code identifying the type of communication number,R,TE :  Telephone,,,,,,
2010BA.PER04,Communication Number,,R,,,,,,,
2010BA.PER05,Communication Number Qualifier,Code identifying the type of communication number,S,EX :  Telephone Extension,,,,,,
2010BA.PER06,Communication Number,,S,,,,,,,
Loop 2010BB  — PAYER NAME (Required)  Loop Repeat: 1,,,,,,,,,,
NM1,Segment - NM1 Payer Name (Required),,,,,,,,,
2010BB.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,PR : Payer,,"Hardcode as ""PR""",,,,
2010BB.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,2 : Non-Person Entity,,"Hardcode as ""2""",,,,
2010BB.NM103,Name Last or Organization Name,,R,,,Product,,,,
2010BB.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code",R,"PI :  Payor Identification
XV : Centers for Medicare and Medicaid Services PlanID",,"Hardcode as ""PI""",,,,
2010BB.NM109,Identification Code,Code identifying a party or other code / Payer Identifier,R,,,"Default value ""1234567""",,,,
N3,Segment - N3 Payer Address (Situational),,,,,,,,,
2010BB.N301,Address Information,Address Information,R,,,,,,,
2010BB.N302,Address Information,Address Information,S,,,,,,,
N4,"Segment - N4 Payer City, State, ZIP Code (Situational)",,,,,,,,,
2010BB.N401,City Name,Free-form text for city name,R,,,"Default value as ""Product""",,,,
2010BB.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,"Default  value as ""CO""",,,,
2010BB.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,,"Default  value as ""80014""",,,,
2010BB.N404,Country Code,Code identifying the country,S,,,,,,,
2010BB.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,,
REF,Segment - REF Payer Secondary Identification (Situational),,,,,,,,,
2010BB.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"2U : Payer Identification Number
EI :  Employer’s Identification Number",,,,,,
2010BB.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,
REF,Segment - REF Billing Provider Secondary Identification (Situational),,,,,,,,,
2010BB.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,,,,,,,
2010BB.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,
"Loop 2000C - Patient Hierarchical Level (Situational)   Loop Repeat: >1
                In case of dependent claims, .i.e. when Relationship_To_Subscriber_Code  is not 18  (if  dependant is the patient ), Loop ID-2000C and Loop ID-2010CA are sent.
                When subscriber is the patient,, .i.e. when Relationship_To_Subscriber_Code  is 18 Loop ID-2000C and Loop ID-2010CA are not sent.",,,,,,,,,,
NM1,NM1 Patient Name (Required),,,,,,,,,
2000C.HL01,Hierarchical ID Number,"A unique number assigned by the sender to identify a particular data segment in
a hierarchical structure",R,,,System Generated,,,,
2000C.HL02,Hierarchical Parent ID Number,"Identification number of the next higher hierarchical data segment that the data
segment being described is subordinate to",R,,,System Generated,,,,
2000C.HL03,Hierarchical Level Code,Code defining the characteristic of a level in a hierarchical structure,R,"23 : Dependent (the information
in this HL applies to the patient when the subscriber
and the patient are not the same person)",,"Hardcode as ""23""",,,,
2000C.HL04,Hierarchical Child Code,"Code indicating if there are hierarchical child data segments subordinate to the
level being described",R,"0 :  No Subordinate HL Segment in This Hierarchical
Structure",,"Hardcode as ""0""",,,,
PAT,Patient information,,,,,,,,,
2000C.PAT01,Individual Relationship Code,Code indicating the relationship between two individuals or entities,R,"01 : Spouse
19 : Child
20 : Employee
21 : Unknown
39 : Organ Donor
40:  Cadaver Donor
53:  Life Partner
G8 : Other Relationship",,,Relationship_To_Subscriber_Code,Claim Level,,
2000C.PAT05,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",S,D8 : Date Expressed in Format CCYYMMDD,,,,,,
2000C.PAT06,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times / Patient Death Date",S,,,,,,,
2000C.PAT07,Unit or Basis for Measurement Code,"Code specifying the units in which a value is being expressed, or manner in which
a measurement has been taken",S,01 : Actual Pounds,,,,,,
2000C.PAT08,Weight,Numeric value of weight,S,,,,,,,
2000C.PAT09,Yes/No Condition or Response Code,Code indicating  whether the patient is pregnant or not pregnant.,S,Y :Yes,,,,,,
Loop 2010CA - Patient Name (Situational) Loop Repeat: 1,,,,,,,,,,
NM1,Patient Name (Required),,,,,,,,,
2010CA.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,QC : Patient,,"Hardcode as ""QC""",,,,
2010CA.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,1: Person,,"Hardcode as ""1""",,,,
,,,,,,,Member_Last_Name,Claim Level,,
2010CA.NM104,Name First,Patient First Name,S,,,,Member_First_Name,Claim Level,,
2010CA.NM105,Name Middle,Patient Middle Name or Initial,S,,,,,,,
2010CA.NM107,Name Suffix,Patient Name Suffix,S,,,,,,,
N3,Segment - N3 Patient Address (Situational),,,,,,,,,
2010CA.N301,Address Information,Patient Address Line,R,,,,Member_Street_Address,Claim Level,,
2010CA.N302,Address Information,Patient Address Line,S,,,,,,,
N4,"Segment - N4 Patient City, State, ZIP Code (Situational)",,,,,,,,,
2010CA.N401,City Name,Free-form text for city name,R,,,,Member_City_Name,Claim Level,,
2010CA.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,,Member_State_Code,Claim Level,,
2010CA.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks,S,,,,Member_Postal_Code,Claim Level,,
2010CA.N404,Country Code,Code identifying the country,S,,,,,,,
2010CA.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,,
DMG,Segment - DMG Patient Demographic Information (Situational),,,,,,,,,
2010CA.DMG01,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 : Date Expressed in Format CCYYMMDD,,"Hardcode as ""D8""",,,,
2010CA.DMG02,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times/Patient Birth Date",R,,19670712,,Member_DateOfBirth,Claim Level,Format : YYYY-MM-DD,
2010CA.DMG03,Gender Code,Code indicating the sex of the individual,R,"F: Female
M :Male
U : Unknown",,,Member_Gender_Code,Claim Level,,
REF,Segment - Property and Casuality Claim Number (Situational),,,,,,,,,
2010CA.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,Y4 : Agency Claim Number,,,,,,
2010CA.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,
PER,Segment -Property and Casuality Patient Contact Information (Situational),,,,,,,,,
2010CA.PER01,Contact Function Code,Code identifying the major duty or responsibility of the person or group named,R,IC :Information Contact,,,,,,
2010CA.PER02,Name,Free-form name,S,,,,,,,
2010CA.PER03,Communication Number Qualifier,Code identifying the type of communication number,R,TE :  Telephone,,,,,,
2010CA.PER04,Communication Number,"Complete communications number including country or area code when
applicable",R,,,,,,,
2010CA.PER05,Communication Number Qualifier,Code identifying the type of communication number,S,EX : Telephone Extension,,,,,,
2010CA.PER06,Communication Number,Complete communications number including country or area code when applicable,S,,,,,,,
"Loop 2300  - CLAIM INFORMATION(Required)  Loop Repeat: 100
       When patient is the subscriber : The claim information(Loop ID-2300), is placed following Loop ID-2010BB in the Subscriber Hierarchical Level(HL) and patient information is sent in Loop ID-2010BA.
       When patient is the dependent :  The claim information(Loop ID-2300),is placed following Loop ID-2010CA  in the Patient HL and the patient information is sent in Loop ID-2010CA .",,,,,,,,,,
CLM,Segment - CLM Claim information (Situational),,,,,,,,,
2300.CLM01,Claim Submitter's Identifier,Identifier used to track a claim from creation by the health care provider through payment,R,,,,Account_Number,Claim Level,,
2300.CLM02,Monetary Amount,Monetary Amount,R,,,,Charged_Amount,Claim Level,,
2300.CLM05.01,Facility Code Value,"Code identifying where services were, or may be, performed /Place of Service Code",R,,,,Placeofservice_Code,Claim Level,,
2300.CLM05.02,Facility Code Qualifier,Code identifying the type of facility referenced,R,B :Place of Service Codes for Professional Services,,"Hardcode as ""B""",,,,
2300.CLM05.03,Claim Frequency Type Code,Code specifying the frequency of the claim,R,,,,Frequency_Code,Claim Level,,
2300.CLM06,Yes/No Condition or Response Code,Provider or Supplier Signature Indicator,R,"Y : provider signature is on file
N : provider signature is not on file",,,,,,
2300.CLM07,Provider Accept Assignment Code,Code indicating whether the provider accepts assignment,R,"A : Assigned
B : Assignment Accepted on Clinical Lab Services Only
C :  Not Assigned",,,Assignment_Acceptance,Claim Level,"If 2300.CLM07 = “A”, Map “Y”
Else If 2300.CLM07  = “C”, Map “N”",
2300.CLM08,Yes/No Condition or Response Code,Benefits Assignment Certification Indicator,R,"Y : Yes
N : No
W :  Not Applicable",,,Benefit_Assignment,Claim Level,,
2300.CLM09,Release of Information Code,"Code indicating whether the provider has on file a signed statement by the patient
authorizing the release of medical data to other organizations",R,"I : Informed Consent  to Release Medical Information for Conditions or Diagnoses
Y :Yes, Provider has a Signed Statement Permitting
Release of Medical Billing Data Related to a Claim",,,Release_Authorization,Claim Level,,
2300.CLM10,Patient Signature Source Code,"Code indicating how the patient or subscriber authorization signatures were
obtained and how they are being retained by the provider",S,P :  Signature generated by provider because the patient was not physically present for services,,,,,,
2300.CLM11.01,Related-Causes Code,"Code identifying an accompanying cause of an illness, injury or an accident",R,"AA : Auto Accident
EM : Employment
OA : Other Accident",,,,,,
2300.CLM11.02,Related-Causes Code,"Code identifying an accompanying cause of an illness, injury or an accident (when more than one related cause code applies)",S,"AA : Auto Accident
EM : Employment
OA : Other Accident",,,,,,
2300.CLM11.04,State or Province Code,"Code (Standard State/Province) as defined by appropriate government
agency",S,,,,,,,
2300.CLM11.05,Country Code,Country Code,S,,,,,,,
2300.CLM12,Special Program Code,,S,,,,,,,
2300.CLM20,Delay Reason Code,,S,,,,,,,
DTP,Segment - DTP Date - Onset of Current Illness or Symptom (Situational),,,,,,,,,
2300.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,431 :Onset of Current Symptoms or Illness,,,,,,
2300.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 :  Date Expressed in Format CCYYMMDD,,,,,,
2300.DTP03,Date Time Period,Date Time Period,R,,,,,,,
DTP,Segment - DTP Date - Initial Treatment Date (Situational),,,,,,,,,
2300.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,454 : Initial Treatment,,,,,,
2300.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 :  Date Expressed in Format CCYYMMDD,,,,,,
2300.DTP03,Date Time Period,Date Time Period,R,,,,,,,
DTP,Segment - DTP Date - Last Seen Date (Situational),,,,,,,,,
2300.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,304: Latest Visit or Consultation,,,,,,
2300.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 :  Date Expressed in Format CCYYMMDD,,,,,,
2300.DTP03,Date Time Period,Date Time Period,R,,,,,,,
DTP,Segment - DTP Date - Acute Manifestation (Situational),,,,,,,,,
2300.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,453: Acute Manifestation of a Chronic Condition,,,,,,
2300.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 :  Date Expressed in Format CCYYMMDD,,,,,,
2300.DTP03,Date Time Period,Date Time Period,R,,,,,,,
DTP,Segment - DTP Date - Accident (Situational),,,,,,,,,
2300.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,439: Accident,,,,,,
2300.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 :  Date Expressed in Format CCYYMMDD,,,,,,
2300.DTP03,Date Time Period,Date Time Period,R,,,,,,,
DTP,Segment - DTP Date - Last Menstrual Period (Situational),,,,,,,,,
2300.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,484:  Last Menstrual Period,,,,,,
2300.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 :  Date Expressed in Format CCYYMMDD,,,,,,
2300.DTP03,Date Time Period,Date Time Period,R,,,,,,,
DTP,Segment - DTP Date - Last X-ray Date (Situational),,,,,,,,,
2300.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,455: Last X-Ray,,,,,,
2300.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 :  Date Expressed in Format CCYYMMDD,,,,,,
2300.DTP03,Date Time Period,Date Time Period,R,,,,,,,
DTP,Segment - DTP Date - Hearing and Vision Prescription Date (Situational),,,,,,,,,
2300.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,471: Prescription,,,,,,
2300.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 :  Date Expressed in Format CCYYMMDD,,,,,,
2300.DTP03,Date Time Period,Date Time Period,R,,,,,,,
DTP,Segment - DTP Date - Disability Dates (Situational),,,,,,,,,
2300.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,"314 : Disability ( when both disability start and end date are being reported)
360 :  Initial Disability Period Start (if patient is currently disabled and
disability end date is unknown.)
361 : Initial Disability Period End ( if patient is no longer disabled and the)
start date is unknown",,,,,,
2300.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,"D8 :  Date Expressed in Format CCYYMMDD
RD8 :  Range of Dates Expressed in Format CCYYMMDDCCYYMMDD",,,,,,
2300.DTP03,Date Time Period,Date Time Period,R,,,,,,,
DTP,Segment - DTP Date - Last Worked (Situational),,,,,,,,,
2300.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,297 : Initial Disability Period Last Day Worked,,,,,,
2300.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 :  Date Expressed in Format CCYYMMDD,,,,,,
2300.DTP03,Date Time Period,Date Time Period,R,,,,,,,
DTP,Segment - DTP Date - Authorized Return to Work (Situational),,,,,,,,,
2300.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,296 : Initial Disability Period Last Day Worked,,,,,,
2300.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 :  Date Expressed in Format CCYYMMDD,,,,,,
2300.DTP03,Date Time Period,Date Time Period,R,,,,,,,
DTP,Segment - DTP Date - Admission (Situational),,,,,,,,,
2300.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,435 : Admission,,,,,,
2300.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 : Date Expressed in Format CCYYMMDD,,,,,,
2300.DTP03,Date Time Period,Date Time Period,R,,,,,,,
DTP,Segment - DTP Date - Discharge (Situational),,,,,,,,,
2300.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,096 : Discharge,,,,,,
2300.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 : Date Expressed in Format CCYYMMDD,,,,,,
2300.DTP03,Date Time Period,Date Time Period,R,,,,,,,
DTP,Segment - DTP Date - Assumed and Relinquished Care Dates (Situational),,,,,,,,,
2300.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,090 :  Report Start,,,,,,
2300.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 : Date Expressed in Format CCYYMMDD,,,,,,
2300.DTP03,Date Time Period,Date Time Period,R,,,,,,,
DTP,Segment - DTP Date - Property and Casualty Date of First Contact (Situational),,,,,,,,,
2300.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,096 :  First Visit or Consultation,,,,,,
2300.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 : Date Expressed in Format CCYYMMDD,,,,,,
2300.DTP03,Date Time Period,Date Time Period,R,,,,,,,
DTP,Segment - DTP Date - Repricer Received Date (Situational),,,,,,,,,
2300.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,050 :  Received,,,,,,
2300.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 : Date Expressed in Format CCYYMMDD,,,,,,
2300.DTP03,Date Time Period,Date Time Period,R,,,,,,,
PWK,Segment - PWK Claim Supplemental Information (Situational),Map only firrst occurrence of PWK segment.,,,,,,,,
2300.PWK01,Report Type Code,"Code indicating the title or contents of a document, report or supporting item",R,"04 : Drugs Administered
05 : Treatment Diagnosis
06 : Initial Assessment",,"Hardcode as ""03""",,,,
2300.PWK02,Report Transmission Code,"Code defining timing, transmission method or format by which reports are to be
sent",R,"AA : Available on Request at Provider Site
BM : By Mail
EL : Electronically Only
EM : E-Mail
FT : File Transfer
FX : By Fax",,"Hardcode as ""BM""",,,,
2300.PWK05,Identification Code Qualifier,Code identifying a party or other code,S,AC:  Attachment Control Number,,"Hardcode as ""AC""",,,,
2300.PWK06,Identification Code,Attachment Control Number. Used to identify the attached electronic documentation.The number in PWK06 is carried in the TRN of the electronic attachment,S,,,,Attachment_Set_ID,Claim Level,,
CN1,Segment - CN1 Contract Information (Situational),,,,,,,,,
2300.CN101,Contract Type Code,Code identifying a contract type,R,"01 : Diagnosis Related Group (DRG)
02 : Per Diem
03 : Variable Per Diem
04 : Flat
05 : Capitated
06 : Percent
09 : Other",,,,,,
2300.CN102,Monetary Amount,Contract Amount,S,,,,,,,
2300.CN103,"Percent, Decimal Format",Contract Percentage,S,,,,,,,
2300.CN104,Reference Identification,Contract Code,S,,,,,,,
2300.CN105,Terms Discount Percent,"Terms discount percentage, expressed as a percent, available to the purchaser if
an invoice is paid on or before the Terms Discount Due Date",S,,,,,,,
2300.CN106,Version Identifier,Contract Version Identifier,S,,,,,,,
AMT,Segment - AMT Patient Amount Paid (Situational),,,,,,,,,
2300.AMT01,Amount Qualifier Code,Code to qualify amount,R,F5 : Patient Amount Paid,,,,,,
2300.AMT02,Monetary Amount,Patient Amount Paid,R,,,,,,,
REF,Segment - REF Service Authorization Exception Code (Situational),,,,,,,,,
2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,4N :  Special Payment Reference Number,,,,,,
2300.REF02,Reference Identification,Service Authorization Exception Code,R,,,,,,,
REF,Segment - REF Mandatory Medicare (Section 4081) Crossover Indicator (Situational),,,,,,,,,
2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,F5 : Medicare Version Code,,,,,,
2300.REF02,Reference Identification,Medicare Section 4081 Indicator,R,"Y : 4081
N : Regular crossover",,,,,,
REF,Segment - REF Mammography Certification Number (Situational),,,,,,,,,
2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,EW:  Mammography Certification Number,,,,,,
2300.REF02,Reference Identification,Mammography Certification Number,R,,,,,,,
REF,Segment - REF Referral Number (Situational),,,,,,,,,
2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,9F :  Referral Number,,"Hardcode as ""9F""",,,,
2300.REF02,Reference Identification,Referral Number,R,,,,Referring_ReferralNumber,Claim Level,,
REF,Segment - REF Prior Authorization (Situational),,,,,,,,,
2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,G1 : Prior Authorization Number,,,,,,
2300.REF02,Reference Identification,Prior Authorization Number,R,,,,,,,
REF,Segment - REF Payer Claim Control Number (Situational),,,,,,,,,
2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,F8 : Original Reference Number,,"Hardcode as ""F8""",,,,
2300.REF02,Reference Identification,Payer Claim Control Number,R,,,,Claim_Number,Claim Level,,
REF,Segment - REF Clinical Laboratory Improvement Amendment (CLIA) Number (Situational),,,,,,,,,
2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"X4 : Clinical Laboratory Improvement Amendment
Number",,,,,,
2300.REF02,Reference Identification,Clinical Laboratory Improvement Amendment Number,R,,,,,,,
REF,Segment - REF Repriced Claim Number (Situational),,,,,,,,,
2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,9A : Repriced Claim Reference Number,,,,,,
2300.REF02,Reference Identification,Repriced Claim Reference Number,R,,,,,,,
REF,Segment - REF Adjusted Repriced Claim Number (Situational),,,,,,,,,
2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,9C :  Adjusted Repriced Claim Reference Number,,,,,,
2300.REF02,Reference Identification,Adjusted Repriced Claim Reference Number,R,,,,,,,
REF,Segment - REF Investigational Device Exemption Number (Situational),,,,,,,,,
2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,LX : Qualified Products List,,,,,,
2300.REF02,Reference Identification,Investigational Device Exemption Identifier,R,,,,,,,
REF,Segment - REF Claim Identification For Transmission Intermediaries (Situational),,,,,,,,,
2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,D9 : Claim Number,,"Hardcode as ""D9""",,,,
2300.REF02,Reference Identification,Value Added Network Trace Number,R,,,,Clearing_House_Trace_Number,Claim Level,,
REF,Segment - REF Medical Record Number (Situational),,,,,,,,,
2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,EA :  Medical Record Identification Number,,,,,,
2300.REF02,Reference Identification,Value Added Network Trace Number,R,,,,,,,
REF,Segment - REF Demonstration Project Identifier (Situational),,,,,,,,,
2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,P4 :   Project Code,,,,,,
2300.REF02,Reference Identification,Value Added Network Trace Number,R,,,,,,,
K3,Segment - K3 File Information (Situational),,,,,,,,,
2300.K301,Fixed Format Information,Data in fixed format agreed upon by sender and receiver,R,,,,,,,
NTE,Segment - NTE Claim Note (Situational),,,,,,,,,
2300.NTE01,Note Reference Code,Code identifying the functional area or purpose for which the note applies,R,"ADD : Additional Information
CER : Certification Narrative
DCP : Goals, Rehabilitation Potential, or Discharge Plans",,,,,,
2300.NTE02,Description,A free-form description to clarify the related data elements and their content  /  Claim Note Text,R,,,,,,,
CR1,Segment - CR1 Ambulance Transport Information (Situational),,,,,,,,,
2300.CR101,Unit or Basis for Measurement Code,"Code specifying the units in which a value is being expressed, or manner in which
a measurement has been taken",S,LB : Pound,,,,,,
2300.CR102,Weight,Patient Weight,S,,,,,,,
2300.CR104,Ambulance Transport Reason Code,Code indicating the reason for ambulance transport,R,"A : Patient was transported to nearest facility
B : Patient was transported for the benefit of a preferred physician
C : Patient was transported for the nearness of family members
D : Patient was transported for the care of a specialist
E : Patient Transferred to Rehabilitation Facility",,,,,,
2300.CR105,Unit or Basis for Measurement Code,"Code specifying the units in which a value is being expressed, or manner in which a measurement has been taken",R,DH : Miles,,,,,,
2300.CR106,Quantity,Transport Distance,R,,,,,,,
2300.CR109,Description,"Round Trip Purpose Description. Required when the ambulance service is for a round
trip.",S,,,,,,,
2300.CR110,Description,Stretcher Purpose Description,S,,,,,,,
CR2,Segment - CR2 Spinal Manipulation Service Information (Situational),,,,,,,,,
2300.CR208,Nature of Condition Code,Code indicating the nature of a patient’s condition,R,,,,,,,
2300.CR210,Description,Patient Condition Description,S,,,,,,,
2300.CR211,Description,Patient Condition Description,S,,,,,,,
CRC,Segment - CRC Ambulance Certification (Situational),,,,,,,,,
2300.CRC01,Code Category,Specifies the situation or category to which the code applies,R,07 : Ambulance Certification,,,,,,
2300.CRC02,Yes/No Condition or Response Code,Certification Condition Indicator,R,"Y : Yes
N : No",,,,,,
2300.CRC03,Condition Indicator,Code indicating a condition,R,"01 : Patient was admitted to a hospital
04 : Patient was moved by stretcher
05 : Patient was unconscious or in shock
06 : Patient was transported in an emergency situation
07 : Patient had to be physically restrained
08 : Patient had visible hemorrhaging
09 : Ambulance service was medically necessary
12 : Patient is confined to a bed or chair",,,,,,
2300.CRC04,Condition Indicator,Code indicating a condition when a second condition code is necessary,S,"01 : Patient was admitted to a hospital
04 : Patient was moved by stretcher
05 : Patient was unconscious or in shock
06 : Patient was transported in an emergency situation
07 : Patient had to be physically restrained
08 : Patient had visible hemorrhaging
09 : Ambulance service was medically necessary
12 : Patient is confined to a bed or chair",,,,,,
2300.CRC05,Condition Indicator,Code indicating a condition when a third condition code is necessary,S,"01 : Patient was admitted to a hospital
04 : Patient was moved by stretcher
05 : Patient was unconscious or in shock
06 : Patient was transported in an emergency situation
07 : Patient had to be physically restrained
08 : Patient had visible hemorrhaging
09 : Ambulance service was medically necessary
12 : Patient is confined to a bed or chair",,,,,,
2300.CRC06,Condition Indicator,Code indicating a condition when a fourth condition code is necessary,S,"01 : Patient was admitted to a hospital
04 : Patient was moved by stretcher
05 : Patient was unconscious or in shock
06 : Patient was transported in an emergency situation
07 : Patient had to be physically restrained
08 : Patient had visible hemorrhaging
09 : Ambulance service was medically necessary
12 : Patient is confined to a bed or chair",,,,,,
2300.CRC07,Condition Indicator,Code indicating a condition when a fifth condition code is necessary,S,"01 : Patient was admitted to a hospital
04 : Patient was moved by stretcher
05 : Patient was unconscious or in shock
06 : Patient was transported in an emergency situation
07 : Patient had to be physically restrained
08 : Patient had visible hemorrhaging
09 : Ambulance service was medically necessary
12 : Patient is confined to a bed or chair",,,,,,
CRC,Segment - CRC Patient Condition Information: Vision (Situational),,,,,,,,,
2300.CRC01,Code Category,Specifies the situation or category to which the code applies,R,"E1 : Spectacle Lenses
E2 : Contact Lenses
E3 : Spectacle Frames",,,,,,
2300.CRC02,Yes/No Condition or Response Code,Certification Condition Indicator,R,"Y : Yes
N : No",,,,,,
2300.CRC03,Condition Indicator,Code indicating a condition,R,"L1 : General Standard of 20 Degree or .5 Diopter Sphere or Cylinder Change Met
L2 : Replacement Due to Loss or Theft L3 : Replacement Due to Breakage or Damage
L4 : Replacement Due to Patient Preference
 L5 : Replacement Due to Medical Reason",,,,,,
2300.CRC04,Condition Indicator,Code indicating a condition,S,,,,,,,
2300.CRC05,Condition Indicator,Code indicating a condition,S,,,,,,,
2300.CRC06,Condition Indicator,Code indicating a condition,S,,,,,,,
2300.CRC07,Condition Indicator,Code indicating a condition,S,,,,,,,
CRC,Segment - CRC Homebound Indicator (Situational),,,,,,,,,
2300.CRC01,Code Category,Specifies the situation or category to which the code applies,R,75 :  Functional Limitations,,,,,,
2300.CRC02,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,R,Y :Yes,,,,,,
2300.CRC03,Condition Indicator,Code indicating a condition,R,IH : Independent at Home,,,,,,
CRC,Segment - CRC EPSDT Referral (Situational),,,,,,,,,
2300.CRC01,Code Category,Specifies the situation or category to which the code applies,R,ZZ : Mutually Defined,,,,,,
2300.CRC02,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,R,"Y : Yes
N : No",,,,,,
2300.CRC03,Condition Indicator,Code indicating a condition,R,"AV : Available - Not Used
NU :Not Used
S2 :Under Treatment
ST :New Services Requested",,,,,,
2300.CRC04,Condition Indicator,Code indicating a condition,S,,,,,,,
2300.CRC05,Condition Indicator,Code indicating a condition,S,,,,,,,
HI,Segment - HEALTH CARE DIAGNOSIS CODE (Required),,,,,,,,,
2300.HI01.01,Code List Qualifier Code,Code identifying a specific industry code list/ Principal Diagnosis Type Code,R,"ABK : ICD10 -CM - Principal Diagnosis
BK : ICD9 -CM - Principal Diagnosis",,"Hardcode as ""ABK""",,,,
2300.HI01.02,Industry Code,Code indicating a code from a specific industry code list/Principal Diagnosis Code,R,,,,Principal_Diagnosis_Code,Claim Level,"If we get more than 3 digits, should add a dot (.)after 3rd Character",
2300.HI02.01,Code List Qualifier Code,Diagnosis Type Code,R,"ABF : ICD10 -CM -  Diagnosis
BF : ICD9 -CM -  Diagnosis",,"Hardcode as ""ABF""",,,,
2300.HI02.02,Industry Code,Diagnosis Code,R,,,,Diagnosis_Code_1,Claim Level,"If we get more than 3 digits, should add a dot (.)after 3rd Character",
2300.HI03.01,Code List Qualifier Code,"Diagnosis Type Code (Required when it is necessary to report an additional
diagnosis and the preceding HI data elements have been used to
report other diagnoses)",R,"ABF : ICD10 -CM -  Diagnosis
BF : ICD9 -CM -  Diagnosis",,"Hardcode as ""ABF""",,,,
2300.HI03.02,Industry Code,Diagnosis Code,R,,,,Diagnosis_Code_2,Claim Level,"If we get more than 3 digits, should add a dot (.)after 3rd Character",
2300.HI04.01,Code List Qualifier Code,"Diagnosis Type Code (Required when it is necessary to report an additional
diagnosis and the preceding HI data elements have been used to
report other diagnoses)",R,"ABF : ICD10 -CM -  Diagnosis
BF : ICD9 -CM -  Diagnosis",,"Hardcode as ""ABF""",,,,
2300.HI04.02,Industry Code,Diagnosis Code,R,,,,Diagnosis_Code_3,Claim Level,"If we get more than 3 digits, should add a dot (.)after 3rd Character",
2300.HI05.01,Code List Qualifier Code,"Diagnosis Type Code (Required when it is necessary to report an additional
diagnosis and the preceding HI data elements have been used to
report other diagnoses)",R,"ABF : ICD10 -CM -  Diagnosis
BF : ICD9 -CM -  Diagnosis",,"Hardcode as ""ABF""",,,,
2300.HI05.02,Industry Code,Diagnosis Code,R,,,,Diagnosis_Code_4,Claim Level,"If we get more than 3 digits, should add a dot (.)after 3rd Character",
2300.HI06.01,Code List Qualifier Code,"Diagnosis Type Code (Required when it is necessary to report an additional
diagnosis and the preceding HI data elements have been used to
report other diagnoses)",R,"ABF : ICD10 -CM -  Diagnosis
BF : ICD9 -CM -  Diagnosis",,"Hardcode as ""ABF""",,,,
2300.HI06.02,Industry Code,Diagnosis Code,R,,,,Diagnosis_Code_5,Claim Level,"If we get more than 3 digits, should add a dot (.)after 3rd Character",
2300.HI07.01,Code List Qualifier Code,"Diagnosis Type Code (Required when it is necessary to report an additional
diagnosis and the preceding HI data elements have been used to
report other diagnoses)",R,"ABF : ICD10 -CM -  Diagnosis
BF : ICD9 -CM -  Diagnosis",,"Hardcode as ""ABF""",,,,
2300.HI07.02,Industry Code,Diagnosis Code,R,,,,Diagnosis_Code_6,Claim Level,"If we get more than 3 digits, should add a dot (.)after 3rd Character",
2300.HI08.01,Code List Qualifier Code,"Diagnosis Type Code (Required when it is necessary to report an additional
diagnosis and the preceding HI data elements have been used to
report other diagnoses)",R,"ABF : ICD10 -CM -  Diagnosis
BF : ICD9 -CM -  Diagnosis",,"Hardcode as ""ABF""",,,,
2300.HI08.02,Industry Code,Diagnosis Code,R,,,,Diagnosis_Code_7,Claim Level,"If we get more than 3 digits, should add a dot (.)after 3rd Character",
2300.HI09.01,Code List Qualifier Code,"Diagnosis Type Code (Required when it is necessary to report an additional
diagnosis and the preceding HI data elements have been used to
report other diagnoses)",R,"ABF : ICD10 -CM -  Diagnosis
BF : ICD9 -CM -  Diagnosis",,"Hardcode as ""ABF""",,,,
2300.HI09.02,Industry Code,Diagnosis Code,R,,,,Diagnosis_Code_8,Claim Level,"If we get more than 3 digits, should add a dot (.)after 3rd Character",
2300.HI10.01,Code List Qualifier Code,"Diagnosis Type Code (Required when it is necessary to report an additional
diagnosis and the preceding HI data elements have been used to
report other diagnoses)",R,"ABF : ICD10 -CM -  Diagnosis
BF : ICD9 -CM -  Diagnosis",,"Hardcode as ""ABF""",,,,
2300.HI10.02,Industry Code,Diagnosis Code,R,,,,Diagnosis_Code_9,Claim Level,"If we get more than 3 digits, should add a dot (.)after 3rd Character",
2300.HI11.01,Code List Qualifier Code,"Diagnosis Type Code (Required when it is necessary to report an additional
diagnosis and the preceding HI data elements have been used to
report other diagnoses)",R,"ABF : ICD10 -CM -  Diagnosis
BF : ICD9 -CM -  Diagnosis",,"Hardcode as ""ABF""",,,,
2300.HI11.02,Industry Code,Diagnosis Code,R,,,,Diagnosis_Code_10,Claim Level,"If we get more than 3 digits, should add a dot (.)after 3rd Character",
2300.HI12.01,Code List Qualifier Code,"Diagnosis Type Code (Required when it is necessary to report an additional
diagnosis and the preceding HI data elements have been used to
report other diagnoses)",R,"ABF : ICD10 -CM -  Diagnosis
BF : ICD9 -CM -  Diagnosis",,"Hardcode as ""ABF""",,,,
2300.HI12.02,Industry Code,Diagnosis Code,R,,,,Diagnosis_Code_11,Claim Level,"If we get more than 3 digits, should add a dot (.)after 3rd Character",
HI,Segment - HI Anesthesia Related Procedure (Situational),,,,,,,,,
2300.HI01.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BP : Health Care Financing Administration Common Procedural Coding System Principal Procedure,,,,,,
2300.HI01.02,Industry Code,Anesthesia Related Principal Surgical Procedure,R,,,,,,,
2300.HI02.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BO :  Health Care Financing Administration Common Procedural Coding System,,,,,,
2300.HI02.02,Industry Code,Anesthesia Related  Surgical Procedure,R,,,,,,,
HI,Segment - HI CONDITION INFORMATION (Situational),,,,,,,,,
2300.HI01.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG: Condition,,,,,,
2300.HI01.02,Industry Code,Condition Code,R,,,,,,,
2300.HI02.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG: Condition,,,,,,
2300.HI02.02,Industry Code,Condition Code,R,,,,,,,
2300.HI03.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG: Condition,,,,,,
2300.HI03.02,Industry Code,Condition Code,R,,,,,,,
2300.HI04.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG: Condition,,,,,,
2300.HI04.02,Industry Code,Condition Code,R,,,,,,,
2300.HI05.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG: Condition,,,,,,
2300.HI05.02,Industry Code,Condition Code,R,,,,,,,
2300.HI06.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG: Condition,,,,,,
2300.HI06.02,Industry Code,Condition Code,R,,,,,,,
2300.HI07.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG: Condition,,,,,,
2300.HI07.02,Industry Code,Condition Code,R,,,,,,,
2300.HI08.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG: Condition,,,,,,
2300.HI08.02,Industry Code,Condition Code,R,,,,,,,
2300.HI09.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG: Condition,,,,,,
2300.HI09.02,Industry Code,Condition Code,R,,,,,,,
2300.HI10.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG: Condition,,,,,,
2300.HI10.02,Industry Code,Condition Code,R,,,,,,,
2300.HI11.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG: Condition,,,,,,
2300.HI11.02,Industry Code,Condition Code,R,,,,,,,
2300.HI12.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG: Condition,,,,,,
2300.HI12.02,Industry Code,Condition Code,R,,,,,,,
HCP,Segment - HCP Claim Pricing/Repricing Information (Situational),,,,,,,,,
2300.HCP01,Pricing Methodology,"Code specifying pricing methodology at which the claim or line item has been
priced or repriced",R,,,,,,,
2300.HCP02,Monetary Amount,Repriced Allowed Amount,R,,,,,,,
2300.HCP03,Monetary Amount,Repriced Saving Amount,S,,,,,,,
2300.HCP04,Reference Identification,Repricing Organization Identifier,S,,,,,,,
2300.HCP05,Rate,Repricing Per Diem or Flat Rate Amount,S,,,,,,,
2300.HCP06,Reference Identification,Repriced Approved Ambulatory Patient Group Code,S,,,,,,,
2300.HCP07,Monetary Amount,Repriced Approved Ambulatory Patient Group Amount,S,,,,,,,
2300.HCP13,Reject Reason Code,Code assigned by issuer to identify reason for rejection,S,,,,,,,
2300.HCP14,Policy Compliance Code,Code specifying policy compliance,S,,,,,,,
2300.HCP15,Exception Code,Code specifying the exception reason for consideration of out-of-network health care services,S,,,,,,,
Loop 2310A  - REFERRING PROVIDER NAME (Situational)  Loop Repeat: 2,,,R,,,,,,,
NM1,Segment - NM1 Referring Provider Name (Situational),,R,,,,,,,
2310A.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,"DN : Referring Provider
P3 : Primary Care Provider",,"Hardcode as ""DN""",,,,
2310A.NM102,Entity Type Qualifier,y,R,1 : Person,,"Hardcode as ""1""",,,,
2310A.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,,Referring_Practitioner_LastName,Claim Level,when 2310A.NM101 = DN,
2310A.NM104,Name First,Individual first name,S,,,,Referring_Practitioner_FirstName,Claim Level,when 2310A.NM101 = DN,
2310A.NM105,Name Middle,Individual middle name or initial,S,,,,Referring_Practitioner_MiddleName,Claim Level,when 2310A.NM101 = DN,
2310A.NM107,Name Suffix,Suffix to individual name,S,,,,Referring_Practitioner_Suffix,Claim Level,when 2310A.NM101 = DN,
2310A.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code",S,"XX :  Centers for Medicare and Medicaid Services
National Provider Identifier",,"Hardcode as ""XX""",,,,
2310A.NM109,Identification Code,Referring Provider Identifier,S,,,,Referring_npi,Claim Level,when 2310A.NM101 = DN,
REF,Segment - REF Referring Provider Secondary Identification (Situational),,,,,,,,,
2310A.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B : State License Number
1G : Provider UPIN Number
G2 : Provider Commercial Number",,,Referring_IdQualifier,Claim Level,,
2310A.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier/ Referring Provider Secondary Identifier",R,,,,Referring_Practitioner_Identification,Claim Level,,
Loop 2310B — RENDERING PROVIDER NAME Loop Repeat: 1 (Situational),,,,,,,,,,
NM1,Segment - NM1 Rendering Physician Name (Situational),,,,,,,,,
2310B.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,82 : Rendering Provider,,Hardcode as '82',,,,
2310B.NM102,Entity Type Qualifier,"Code identifying an organizational entity, a physical location, property or an
individual",R,"1 : Person
2 : Non-Person Entity",,Hardcode as '1',,,,
2310B.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,,Rendering_Provider_LastName,,,
2310B.NM104,Name First,Individual first name,S,,,,Rendering_Provider_FirstName,,,
2310B.NM105,Name Middle,Individual middle name or initial,S,,,,Rendering_Provider_MiddleName,,,
2310B.NM107,Name Suffix,Suffix to individual name,S,,,,Rendering_Provider_Suffix,,,
2310B.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code",S,"XX :  Centers for Medicare and Medicaid Services
National Provider Identifier",,Hardcode as 'XX',,,,
2310B.NM109,Identification Code,Code identifying a party or other code /Rendering Provider Identifier,S,,,,Rendering_Provider_npi,,,
PRV,Segment - PRV Rendering Provider Specialty Information (Situational),,,,,,,,,
2310B.PRV01,Provider Code,Code identifying the type of provider,R,PE : Performing,,,,,,
2310B.PRV02,Reference Identification Qualifier,Code qualifying the Reference Identification,R,PXC : Health Care Provider Taxonomy Code,,,,,,
2310B.PRV03,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier / Provider Taxonomy Code",R,,,,,,,
REF,Segment - REF Rendering Provider Secondary Identification (Situational),,,,,,,,,
2310B.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B : State License Number
1G : Provider UPIN Number
G2 : Provider Commercial Number
LU : Location Number",,,,,,
2310B.REF02,Reference Identification,Rendering Provider Secondary Identifier,R,,,,,,,
Loop 2310C — SERVICE FACILITY LOCATION NAME Loop Repeat: 1 (Situational),,,,,,,,,,
NM1,Segment - NM1 Service Facility Location Name (Situational),,,,,,,,,
2310C.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,77 : Service Location,,"Hardcode as ""77""",,,,
2310C.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,2 : Non-Person Entity,,"Hardcode as ""2""",,,,
2310C.NM103,Name Last or Organization Name,Individual last name or organizational name /Laboratory or Facility Name,R,,,,RenderingFacility_Name,Claim Level,,
2310C.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code",S,"XX :  Centers for Medicare and Medicaid Services
National Provider Identifier",,,,,,
2310C.NM109,Identification Code,Laboratory or Facility Primary Identifier,S,,,,,,,
N3,Segment - N3 Service Facility Location Address (Required),,,,,,,,,
2310C.N301,Address Information,Address information,R,,,,RenderingFacility_StreetAddress,Claim Level,,
2310C.N302,Address Information,Address information,S,,,,,,,
N4,"Segment - N4 Service Facility Location City, State, ZIP Code (Required)",,,,,,,,,
2310C.N401,City Name,Free-form text for city name,R,,,,RenderingFacility_CityName,Claim Level,,
2310C.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,,RenderingFacility_StateCode,Claim Level,,
2310C.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,,,RenderingFacility_PostalCode,Claim Level,,
2310C.N404,Country Code,Code identifying the country,S,,,,,,,
2310C.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,,
REF,Segment - REF Service Facility Location Secondary Identification (Situational),,,,,,,,,
2310C.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B : State License Number
G2 : Provider Commercial Number
LU : Location Number",,,,,,
2310C.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier/Laboratory or Facility Secondary Identifier",R,,,,,,,
PER,Segment - PER Service Facility Contact Information (Situational),,,,,,,,,
2310C.PER01,Contact Function Code,Code identifying the major duty or responsibility of the person or group named,R,IC : Information Contact,,,,,,
2310C.PER02,Name,Name,S,,,,,,,
2310C.PER03,Communication Number Qualifier,Code identifying the type of communication number,R,TE : Telephone,,,,,,
2310C.PER04,Communication Number,Complete communications number including country or area code when applicable,R,,,,,,,
2310C.PER05,Communication Number Qualifier,Code identifying the type of communication number,R,EX :  Telephone Extension,,,,,,
2310C.PER06,Communication Number,"Complete communications number including country or area code when
applicable",S,,,,,,,
Loop 2310D — SUPERVISING PROVIDER NAME (Situational)   Loop Repeat: 1,,,,,,,,,,
NM1,Segment - NM1 Supervising Provider Name (Situational),,,,,,,,,
2310D.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,DQ : Supervising Physician,,"Hardcode as 'DQ""",,,,
2310D.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,1 : Person,,"Hardcode as '1""",,,,
2310D.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,,Supervising_Provider_LastName,,,
2310D.NM104,Name First,Individual first name,S,,,,Supervising_Provider_FirstName,,,
2310D.NM105,Name Middle,Individual middle name or initial,S,,,,Supervising_Provider_MiddleName,,,
2310D.NM107,Name Suffix,Suffix to individual name,S,,,,Supervising_Provider_Suffix,,,
2310D.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code",S,"XX Centers for Medicare and Medicaid Services
National Provider Identifier",,"Hardcode as 'XX""",,,,
2310D.NM109,Identification Code,Code identifying a party or other code /  Supervising Provider Identifier,S,,,,Supervising_Provider_npi,,,
REF,Segment - REF Supervising Provider Secondary Identification (Situational),,,,,,,,,
2310D.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B : State License Number
G2 : Provider Commercial Number
LU : Location Number",,,,,,
2310D.REF02,Reference Identification,Supervising Provider Secondary Identifier,R,,,,,,,
Loop 2310E  - AMBULANCE PICK-UP LOCATION  (Situational)  Loop Repeat: 1,,,,,,,,,,
NM1,Segment - NM1 Ambulance Pick-up Location (Situational),,,,,,,,,
2310E.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,PW :  Pickup Address,,,,,,
2310E.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,2  :  Non-Person Entity,,,,,,
N3,Segment - N3 Ambulance Pick-up Location Address (Required),,,,,,,,,
2310E.N301,Address Information,Ambulance Pick-up Address Line,R,,,,,,,
2310E.N302,Address Information,Ambulance Pick-up Address Line,S,,,,,,,
N4,"Segment - N4 Ambulance Pick-up Location City, State, ZIP Code (Required)",,,,,,,,,
2310E.N401,City Name,Free-form text for city name,R,,,,,,,
2310E.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,,,,,
2310E.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,,,,,,
,,,,,,,,,,
2310E.N404,Country Code,Code identifying the country,S,,,,,,,
2310E.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,,
Loop 2310F — AMBULANCE DROP-OFF LOCATION (Situational) Loop Repeat: 1,,,,,,,,,,
NM1,Segment - NM1 Ambulance Drop-off Location (Situational),,,,,,,,,
2310F.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,45 : Drop-off Location,,,,,,
2310F.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,2  :  Non-Person Entity,,,,,,
2310F.NM103,Name Last or Organization Name,Ambulance Drop-off Location,S,,,,,,,
N3,Segment - N3 Ambulance Drop-off Location Address (Required),,,,,,,,,
2310F.N301,Address Information,Ambulance Drop-off Address Line,R,,,,,,,
2310F.N302,Address Information,Ambulance Drop-off Address Line,S,,,,,,,
N4,"Segment - N4 Ambulance Drop-off Location City, State, ZIP Code (Required)",,,,,,,,,
2310F.N401,City Name,Free-form text for city name,R,,,,,,,
2310F.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,,,,,
2310F.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,,,,,,
2310F.N404,Country Code,Code identifying the country,S,,,,,,,
2310F.N407,Country Subdivision Code,Code identifying the country subdivision,,,,,,,,
Loop 2320 — OTHER SUBSCRIBER INFORMATION(Situational) Loop Repeat: 10,,,S,,,,,,,
SBR,Segment - SBR Other Subscriber Information (Situational),,,,,,,,,
2320.SBR01,Payer Responsibility Sequence Number Code,"Code identifying the insurance carrier’s level of responsibility for a payment of a
claim",R,"P : Primary
S : Secondary
T : Tertiary",,,,,,
2320.SBR02,Individual Relationship Code,Code indicating the relationship between two individuals or entities,R,"01 Spouse
18 Self
19 Child
20 Employee
21 Unknown
39 Organ Donor
40 Cadaver Donor
53 Life Partner
G8 Other Relationship",,,,,,
2320.SBR03,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier/Insured Group or Policy Number",S,,,,,,,
2320.SBR04,Name,Other Insured Group Name,S,,,,,,,
2320.SBR05,Insurance Type Code,Code identifying the type of insurance policy within a specific insurance program,S,,,,,,,
2320.SBR09,Claim Filing Indicator Code,Code identifying type of claim,S,,"MB :Medicare Part B
MA: Medicare Part A
MC: Medicaid",,,,,
CAS,Segment - CAS Claim Level Adjustments (Situational),,,,,,,,,
2320.CAS01,Claim Adjustment Group Code,Code identifying the general category of payment adjustment,R,"CO : Contractual Obligations
CR : Correction and Reversals
OA : Other adjustments
PI : Payor Initiated Reductions
PR : Patient Responsibility",,,,,,
2320.CAS02,Claim Adjustment Reason Code,Code identifying the detailed reason the adjustment was made,R,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
2320.CAS03,Monetary Amount,Monetary Amount,R,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
2320.CAS04,Quantity,Numeric value of quantity,S,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
2320.CAS05,Claim Adjustment Reason Code,Code identifying the detailed reason the adjustment was made,R,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
2320.CAS06,Monetary Amount,Monetary Amount,R,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
2320.CAS07,Quantity,Numeric value of quantity,S,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
2320.CAS08,Claim Adjustment Reason Code,Code identifying the detailed reason the adjustment was made,R,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
2320.CAS09,Monetary Amount,Monetary Amount,R,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
2320.CAS10,Quantity,Numeric value of quantity,S,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
2320.CAS11,Claim Adjustment Reason Code,Code identifying the detailed reason the adjustment was made,R,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
2320.CAS12,Monetary Amount,Monetary Amount,R,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
2320.CAS13,Quantity,Numeric value of quantity,S,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
2320.CAS14,Claim Adjustment Reason Code,Code identifying the detailed reason the adjustment was made,R,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
2320.CAS15,Monetary Amount,Monetary Amount,R,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
2320.CAS16,Quantity,Numeric value of quantity,S,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
2320.CAS17,Claim Adjustment Reason Code,Code identifying the detailed reason the adjustment was made,R,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
2320.CAS18,Monetary Amount,Monetary Amount,R,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
2320.CAS19,Quantity,Numeric value of quantity,S,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
AMT,Segment - AMT Coordination of Benefits (COB) Payer Paid Amount (Situational),,,,,,,,,
2320.AMT01,Amount Qualifier Code,Code to qualify amount,R,D : Payor Amount Paid,,,,,,
2320.AMT02,Monetary Amount,Monetary Amount,R,,,,,,,
AMT,Segment - AMT Remaining Patient Liability (Situational),,,,,,,,,
2320.AMT01,Amount Qualifier Code,Code to qualify amount,R,EAF :  Amount Owed,,,,,,
2320.AMT02,Monetary Amount,Monetary Amount,R,,,,,,,
AMT,Segment - AMT Coordination of Benefits (COB) Total Non-covered Amount (Situational),,,,,,,,,
2320.AMT01,Amount Qualifier Code,Code to qualify amount,R,A8 :  Noncovered Charges - Actual,,,,,,
2320.AMT02,Monetary Amount,Monetary Amount,R,,,,,,,
OI,Segment - OI Other Insurance Coverage Information (Required),,,,,,,,,
2320.OI03,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response/Benefits Assignment Certification Indicator,R,"N : No
W : Not Applicable
Use code ‘W’ when the patient refuses to assign
benefits.
Y :  Yes",,,,,,
2320.OI04,Patient Signature Source Code,"Code indicating how the patient or subscriber authorization signatures were
obtained and how they are being retained by the provider",S,,,,,,,
2320.OI06,Release of Information Code,Code indicating whether the provider has on file a signed statement by the patient authorizing the release of medical data to other organizations,R,"I  : Informed Consent to Release Medical Information
Y : Yes, Provider has a Signed Statement Permitting
Release of Medical Billing Data Related to a Claim",,,,,,
MOA,Segment - MOA Outpatient Adjudication Information (Situational),,,,,,,,,
2320.MOA01,Percentage as Decimal,"Percentage expressed as a decimal (e.g., 0.0 through 1.0 represents 0% through
100%)",S,,,,,,,
2320.MOA02,Monetary Amount,Monetary amount,S,,,,,,,
2320.MOA03,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier /  Claim Payment Remark Code",S,,,,,,,
2320.MOA04,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier /  Claim Payment Remark Code",S,,,,,,,
2320.MOA05,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier /  Claim Payment Remark Code",S,,,,,,,
2320.MOA06,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier /  Claim Payment Remark Code",S,,,,,,,
2320.MOA07,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier /  Claim Payment Remark Code",S,,,,,,,
2320.MOA08,Monetary Amount,Monetary Amount/End Stage Renal Disease Payment Amount,S,,,,,,,
2320.MOA09,Monetary Amount,"Monetary Amount/ Non-Payable Professional Component Billed
Amount",S,,,,,,,
Loop 2330A —  OTHER SUBSCRIBER NAME (Situational) Loop Repeat: 1,,,,,,,,,,
NM1,Segment - NM1 Other Subscriber Name (Required),,,,,,,,,
2330A.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,IL : Insured or Subscriber,,,,,,
2330A.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,"1 : Person
2 : Non-Person Entity",,,,,,
2330A.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,,,,,
2330A.NM104,Name First,Individual first name,S,,,,,,,
2330A.NM105,Name Middle,Individual middle name or initial,S,,,,,,,
2330A.NM107,Name Suffix,Suffix to individual name,S,E,,,,,,
2330A.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code",R,"II : Standard Unique Health Identifier for each Individual
in the United States
MI :Member Identification Number",,,,,,
2330A.NM109,Identification Code,Code identifying a party or other code,R,,,,,,,
N3,Segment - N3 Other Subscriber Address (Situational),,,,,,,,,
2330A.N301,Address Information,Address Information,R,,,,,,,
2330A.N302,Address Information,Address Information,S,,,,,,,
N4,Segment - N4 Other Subscriber City/State/ZIP Code (Situational),,,,,,,,,
2330A.N401,City Name,Free-form text for city name,R,,,,,,,
2330A.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,,,,,
2330A.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,,,,,,
2330A.N404,Country Code,Code identifying the country,S,,,,,,,
2330A.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,,
REF,Segment - REF Other Subscriber Secondary Information (Situational),,,,,,,,,
2330A.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,SY :  Social Security Number,,,,,,
2330A.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier / Other Insured Additional Identifier",R,,,,,,,
Loop 2330B — OTHER PAYER NAME (Situational) Loop Repeat: 1,,,,,,,,,,
NM1,Segment - NM1 Other Payer Name (Required),,,,,,,,,
2330B.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,PR : Payer,,,,,,
2330B.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,2 :  Non-Person Entity,,,,,,
2330B.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,,,,,
2330B.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code (67)",R,"PI :  Payor Identification
XV : Centers for Medicare and Medicaid Services PlanID",,,,,,
2330B.NM109,Identification Code,Code identifying a party or other code,R,,,,,,,
N3,Segment - N3 Other Payer Address (Situational),,,,,,,,,
2330B.N301,Address Information,Address Information,R,,,,,,,
2330B.N302,Address Information,Address Information,S,,,,,,,
N4,Segment - N4 Other Payer City/State/ZIP Code (Situational),,,,,,,,,
2330B.N401,City Name,Free-form text for city name,R,,,,,,,
2330B.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,,,,,
2330B.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,,,,,,
2330B.N404,Country Code,Code identifying the country,S,,,,,,,
2330B.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,,
DTP,Segment - DTP Claim Check or Remittance Date (Situational),,,,,,,,,
2330B.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,573 : Date Claim Paid,,,,,,
2330B.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 :  Date Expressed in Format CCYYMMDD,,,,,,
2330B.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,20210305,,,,,
REF,Segment - REF Other Payer Secondary Identifier (Situational),,,,,,,,,
2330B.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"2U : Payer Identification Number
EI : Employer’s Identification Number
FY : Claim Office Number
NF : National Association of Insurance Commissioners
(NAIC) Code",,,,,,
2330B.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier/Other Payer Secondary Identifier",R,,22105302412107COA,,,,,
REF,Segment - REF Other Payer Prior Authorization Number (Situational),,,,,,,,,
2330B.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,G1 : Prior Authorization Number,,,,,,
2330B.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier/ Other Payer Prior Authorization Number",R,,,,,,,
REF,Segment - REF Other Payer Referral Number (Situational),,,,,,,,,
2330B.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,9F :  Referral Number,,,,,,
2330B.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier/  Other Payer Prior Authorization or Referral
Number",R,,,,,,,
REF,Segment - REF Other Payer Claim Adjustment Indicator (Situational),,,,,,,,,
2330B.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,T4 : Signal Code,,,,,,
2330B.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier/ : Other Payer Claim Adjustment Indicator",R,,,,,,,
REF,Segment - REF Other Payer Claim Control Number (Situational),,,,,,,,,
2330B.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,F8 : Original Reference Number,,,,,,
2330B.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier/ : Other Payer’s Claim Control Number",R,,,,,,,
Loop 2330C — OTHER PAYER REFERRING PROVIDER (Situational)  Loop Repeat: 2,,,,,,,,,,
NM1,Segment - NM1 Other Payer Referring Provider (Situational),,,,,,,,,
2330C.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,"DN : Referring Provider
P3 : Primary Care Provider",,,,,,
2330C.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,1 : Person,,,,,,
REF,Segment - REF Other Payer Referring Provider Secondary Identification (Required),,,,,,,,,
2330C.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B : State License Number
1G : Provider UPIN Number
G2 : Provider Commercial Number",,,,,,
2330C.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier  /Other Payer Referring Provider Identifier,R,,,,,,,
Loop 2330D — OTHER PAYER RENDERING PROVIDER (Situational) Loop Repeat: 1,,,,,,,,,,
NM1,Segment - NM1 Other Payer Rendering Provider (Situational),,,,,,,,,
2330D.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,82 :Other Payer Referring Provider Identifier,,,,,,
2330D.NM102,Entity Type Qualifier,Code qualifying the type of entity /Other Payer Referring Provider Identifier,R,"1 :Person
2 :Non-Person Entity",,,,,,
REF,Segment - REF Other Payer Rendering Provider Secondary Identification (Required),,,,,,,,,
2330D.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B :State License Number
1G :Provider UPIN Number
G2 :Provider Commercial Number
LU :Location Number",,,,,,
2330D.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier /Other Payer Referring Provider Identifier,R,,,,,,,
Loop 2330E — OTHER PAYER SERVICE FACILITY LOCATION (Situational) Loop Repeat: 1,,,,,,,,,,
NM1,Segment - NM1 Other Payer Service Facility Location (Situational),,,,,,,,,
2330E.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,77 : Service Location,,,,,,
2330E.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,2 :Non-Person Entity,,,,,,
REF,Segment - REF Other Payer Service Facility Location Secondary Identification (Required),,,,,,,,,
2330E.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B : State License Number
G2 : Provider Commercial Number
LU : Location Number",,,,,,
2330E.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier /Other Payer Service Facility Location Secondary
Identifie",R,,,,,,,
Loop 2330F  — OTHER PAYER SUPERVISING PROVIDER (Situational) Loop Repeat: 1,,,,,,,,,,
NM1,Segment - NM1 Other Payer Supervising Provider (Situational),,,,,,,,,
2330F.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,DQ : Supervising Physician,,,,,,
2330F.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,1 : Person,,,,,,
REF,Segment - REF Other Payer Supervising Provider Secondary Identification (Required),,,,,,,,,
2330F.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B : State License Number
1G : Provider UPIN Number
G2 : Provider Commercial Number
LU : Location Number",,,,,,
2330F.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier/ Other Payer Supervising Provider Identifier",R,,,,,,,
Loop 2330G — OTHER PAYER BILLING PROVIDER  (Situational) Loop Repeat: 1,,,,,,,,,,
NM1,Segment - NM1 Other Payer Billing Provider (Situational),,,,,,,,,
2330G.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,85 : Billing Provider,,,,,,
2330G.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,"1 : Person
2 : Non-Person Entity",,,,,,
REF,Segment - REF Other Payer Billing Provider Secondary Identification (Required),,,,,,,,,
2330G.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"G2 : Provider Commercial Number
LU : Location Number",,,,,,
2330G.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier/ Other Payer Billing Provider Identifier",R,,,,,,,
Loop 2400  — SERVICE LINE NUMBER(Required) Loop Repeat: 50,,,,,,,,,,
LX,Segment - LX Service Line Number (Required),,,,,,,,,
2400.LX01,Assigned Number,Number assigned for differentiation within a transaction set,R,,,,,,,
,,,,,,,Original_Line_Number,Line Level,,
SV1,Segment - SV1 Professional Service (Required),,,,,,,,,
2400.SV101.01,Product/Service ID Qualifier,"Code identifying the type/source of the descriptive number used in
Product/Service ID (234)",R,"HC  :  Health Care Financing Administration Common
Procedural Coding System (HCPCS) Codes
ER : Jurisdiction Specific Procedure and Supply Codes
IV :Home Infusion EDI Coalition (HIEC) Product/Service
Code
WK :Advanced Billing Concepts (ABC) Codes",,"Hardcode as ""HC""",,,,
,Product/Service ID,identifying number for a product or service,R,,90837,,Service_Line_ServiceCode,Line Level,,
2400.SV101.03,Procedure Modifier,"This identifies special circumstances related to the performance of the service, as defined by trading partners",S,,HE,,Service_Line_Modifier_1,Line Level,,
2400.SV101.04,Procedure Modifier,"This identifies special circumstances related to the performance of the service, as defined by trading partners",S,,GT,,Service_Line_Modifier_2,Line Level,,
2400.SV101.05,Procedure Modifier,"This identifies special circumstances related to the performance of the service, as defined by trading partners",S,,GT,,Service_Line_Modifier_3,Line Level,,
2400.SV101.06,Procedure Modifier,"This identifies special circumstances related to the performance of the service, as defined by trading partners",S,,GT,,Service_Line_Modifier_4,Line Level,,
2400.SV101.07,Description,A free-form description to clarify the related data elements and their content,S,,,,,,,
2400.SV102,Monetary Amount,Monetary Amount,R,,233.19,,Service_Line_ServiceFee,Line Level,,
2400.SV103,Unit or Basis for Measurement Code,"Code specifying the units in which a value is being expressed, or manner in which a measurement has been taken",R,"UN : Unit
MJ : Minutes",,"Hardcode as ""UN""",,,,
2400.SV104,Quantity,Numeric value of quantity,R,,,,Service_Line_ServiceUnitCount,Line Level,when 2400.SV103 = UN,
,,,,,,,Service_Line_ServiceMinuteCount,Line Level,when 2400.SV103 = MJ,
2400.SV105,Facility Code Value,"Code identifying where services were, or may be, performed; the first and second positions of the Uniform Bill Type Code for Institutional Services or the Place of Service Codes for Professional or Dental Services.",S,,,,Service_Line_POS,Line Level,,
2400.SV107.01,Diagnosis Code Pointer,A pointer to the diagnosis code in the order of importance to this service,R,,,,Diagnosis_Code_Pointer_1,Line Level,,
2400.SV107.02,Diagnosis Code Pointer,A pointer to the diagnosis code in the order of importance to this service,S,,,,Diagnosis_Code_Pointer_2,Line Level,,
2400.SV107.03,Diagnosis Code Pointer,A pointer to the diagnosis code in the order of importance to this service,S,,,,Diagnosis_Code_Pointer_3,Line Level,,
2400.SV107.04,Diagnosis Code Pointer,A pointer to the diagnosis code in the order of importance to this service,S,,,,Diagnosis_Code_Pointer_4,Line Level,,
2400.SV109,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response /Emergency Indicator,S,Y :Yes,,,,,,
2400.SV111,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response /EPSDT Indicator,S,Y :Yes,,,,,,
2400.SV112,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response/ Family Planning Indicator,S,Y :Yes,,,,,,
2400.SV115,Copay Status Code,"Code indicating whether or not co-payment requirements were met on a line by
line basis",S,0 : Copay exempt,,,,,,
SV5,Segment - SV5 Durable Medical Equipment Service (Situational),,,,,,,,,
2400.SV501.01,Product/Service ID Qualifier,"Code identifying the type/source of the descriptive number used in
Product/Service ID",R,"HC : Health Care Financing Administration Common
Procedural Coding System (HCPCS) Codes",,,,,,
2400.SV501.02,Product/Service ID,Identifying number for a product or service,R,,,,,,,
2400.SV502,Unit or Basis for Measurement Code,"Code specifying the units in which a value is being expressed, or manner in which
a measurement has been taken",R,DA: Days,,,,,,
2400.SV503,Quantity,Numeric value of quantity,R,,,,,,,
2400.SV504,Monetary Amount,Monetary Amount,R,,,,,,,
2400.SV505,Monetary Amount,Monetary Amount,R,,,,,,,
2400.SV506,Frequency Code,Code indicating frequency or type of activities or actions being reported,R,"1 :Weekly
4 :Monthly
6 :Daily",,,,,,
PWK,Segment - PWK Line Supplemental Information (Situational),,,,,,,,,
2400.PWK01,Report Type Code,"Code indicating the title or contents of a document, report or supporting item",R,,,,,,,
2400.PWK02,Report Transmission Code,"Code defining timing, transmission method or format by which reports are to be sent",R,,,,,,,
2400.PWK05,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code",S,AC :  Attachment Control Number,,,,,,
2400.PWK06,Identification Code,Code identifying a party or other code,S,,,,,,,
PWK,Segment - PWK Durable Medical Equipment Certificate of Medical Necessity Indicator (Situational),,,,,,,,,
2400.PWK01,Report Type Code,"Code indicating the title or contents of a document, report or supporting item",R,CT : Certification,,,,,,
2400.PWK02,Report Transmission Code,"Code defining timing, transmission method or format by which reports are to be
sent",R,"AB :Previously Submitted to Payer
AD :Certification Included in this Claim
AF :Narrative Segment Included in this Claim
AG :No Documentation is Required
NS :Not Specified",,,,,,
CR1,Segment - CR1 Ambulance Transport Information (Situational),,,,,,,,,
2400.CR101,Unit or Basis for Measurement Code,"Code specifying the units in which a value is being expressed, or manner in which a measurement has been taken",S,LB : Pound,,,,,,
2400.CR102,Weight,Numeric value of weight,S,,,,,,,
2400.CR104,Ambulance Transport Reason Code,Code indicating the reason for ambulance transport,R,"A : Patient was transported to nearest facility
B : Patient was transported for the benefit of a preferred physician
C : Patient was transported for the nearness of family members
D : Patient was transported for the care of a specialist
E : Patient Transferred to Rehabilitation Facility",,,,,,
2400.CR105,Unit or Basis for Measurement Code,"Code specifying the units in which a value is being expressed, or manner in which a measurement has been taken",R,DH : Miles,,,,,,
2400.CR106,Quantity,Transport Distance,R,,,,,,,
2400.CR109,Description,"Round Trip Purpose Description. Required when the ambulance service is for a round
trip.",S,,,,,,,
2400.CR110,Description,Stretcher Purpose Description,S,,,,,,,
CR3,Segment - CR3 Durable Medical Equipment Certification (Situational),,,,,,,,,
2400.CR301,Certification Type Code,Code indicating the type of certification,R,"I : Initial
R : Renewal
S : Revised",,,,,,
2400.CR302,Unit or Basis for Measurement Code,"Code specifying the units in which a value is being expressed, or manner in which a measurement has been taken",R,MO : Months,,,,,,
2400.CR303,Quantity,Numeric value of quantity,R,,,,,,,
CRC,Segment - CRC Ambulance Certification (Situational),,,,,,,,,
2400.CRC01,Code Category,Specifies the situation or category to which the code applies,R,07 : Ambulance Certification,,,,,,
2400.CRC02,Yes/No Condition or Response Code,Certification Condition Indicator,R,"Y : Yes
N : No",,,,,,
2400.CRC03,Condition Indicator,Code indicating a condition,R,"01 : Patient was admitted to a hospital
04 : Patient was moved by stretcher
05 : Patient was unconscious or in shock
06 : Patient was transported in an emergency situation
07 : Patient had to be physically restrained
08 : Patient had visible hemorrhaging
09 : Ambulance service was medically necessary
12 : Patient is confined to a bed or chair",,,,,,
2400.CRC04,Condition Indicator,Code indicating a condition when a second condition code is necessary,S,"01 : Patient was admitted to a hospital
04 : Patient was moved by stretcher
05 : Patient was unconscious or in shock
06 : Patient was transported in an emergency situation
07 : Patient had to be physically restrained
08 : Patient had visible hemorrhaging
09 : Ambulance service was medically necessary
12 : Patient is confined to a bed or chair",,,,,,
2400.CRC05,Condition Indicator,Code indicating a condition when a third condition code is necessary,S,"01 : Patient was admitted to a hospital
04 : Patient was moved by stretcher
05 : Patient was unconscious or in shock
06 : Patient was transported in an emergency situation
07 : Patient had to be physically restrained
08 : Patient had visible hemorrhaging
09 : Ambulance service was medically necessary
12 : Patient is confined to a bed or chair",,,,,,
2400.CRC06,Condition Indicator,Code indicating a condition when a fourth condition code is necessary,S,"01 : Patient was admitted to a hospital
04 : Patient was moved by stretcher
05 : Patient was unconscious or in shock
06 : Patient was transported in an emergency situation
07 : Patient had to be physically restrained
08 : Patient had visible hemorrhaging
09 : Ambulance service was medically necessary
12 : Patient is confined to a bed or chair",,,,,,
2400.CRC07,Condition Indicator,Code indicating a condition when a fifth condition code is necessary,S,"01 : Patient was admitted to a hospital
04 : Patient was moved by stretcher
05 : Patient was unconscious or in shock
06 : Patient was transported in an emergency situation
07 : Patient had to be physically restrained
08 : Patient had visible hemorrhaging
09 : Ambulance service was medically necessary
12 : Patient is confined to a bed or chair",,,,,,
CRC,Segment - CRC Hospice Employee Indicator (Situational),,R,,,,,,,
2400.CRC01,Code Category,Specifies the situation or category to which the code applies,R,70 : Hospice,,,,,,
2400.CRC02,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,R,"Y : Yes
N : No",,,,,,
2400.CRC03,Condition Indicator,Code indicating a condition,R,65 : Open,,,,,,
CRC,Segment - CRC Condition Indicator/Durable Medical Equipment (Situational),,,,,,,,,
2400.CRC01,Code Category,Specifies the situation or category to which the code applies,R,09 : Durable Medical Equipment Certification,,,,,,
2400.CRC02,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,R,"Y : Yes
N : No",,,,,,
2400.CRC03,Condition Indicator,Code indicating a condition,R,"38 :  Certification signed by the physician is on file at the
supplier’s office
ZV : Replacement Item",,,,,,
2400.CRC04,Condition Indicator,Code indicating a condition,S,"38 :  Certification signed by the physician is on file at the
supplier’s office
ZV : Replacement Item",,,,,,
DTP,Segment - DTP Date - Service Date (Required),,,,,,,,,
2400.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,472 : Service,,"Hardcode as ""472""",,,,
2400.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,"RD8 :  Range of Dates Expressed in Format CCYYMMDDCCYYMMDD
D8 : Date Expressed in Format CCYYMMDD",,"Hardcode ""RD8""  if End_Date is present. Else D8.",,,,need to check hardcode
2400.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,20201112,,Start_Date,Line Level,byte 1-8 in the format YYYY-MM-DD,
,,,,,,,End_Date,Line Level,byte 10-17 in the format YYYY-MM-DD,
DTP,Segment - DTP Date - Prescription Date (Situational),,,,,,,,,
2400.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,471 : Prescription,,,,,,
2400.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 : Date Expressed in Format CCYYMMDD,,,,,,
2400.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,,,
DTP,Segment - DTP DATE - Certification Revision/Recertification Date (Situational),,,,,,,,,
2400.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,607 :  Certification Revision,,,,,,
2400.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 : Date Expressed in Format CCYYMMDD,,,,,,
2400.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,,,
DTP,Segment - DTP Date - Begin Therapy Date (Situational),,,,,,,,,
2400.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,463 : Begin Therapy,,,,,,
2400.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 : Date Expressed in Format CCYYMMDD,,,,,,
2400.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,,,
DTP,Segment - DTP Date - Last Certification Date (Situational),,,,,,,,,
2400.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,461 : Last Certification,,,,,,
2400.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 : Date Expressed in Format CCYYMMDD,,,,,,
2400.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,,,
DTP,Segment - DTP Date - Last Seen Date (Situational),,,,,,,,,
2400.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,304 : Latest Visit or Consultation,,,,,,
2400.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 : Date Expressed in Format CCYYMMDD,,,,,,
2400.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,,,
DTP,Segment - DTP Date - Test Date (Situational),,,,,,,,,
2400.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,"738 :Most Recent Hemoglobin or Hematocrit or Both
739 :Most Recent Serum Creatine",,,,,,
2400.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 : Date Expressed in Format CCYYMMDD,,,,,,
2400.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,,,
DTP,Segment - DTP Date - Shipped Date (Situational),,,,,,,,,
2400.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,011 : Shipped,,,,,,
2400.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 : Date Expressed in Format CCYYMMDD,,,,,,
2400.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,,,
DTP,Segment - DTP Date - Last X-ray Date (Situational),,,,,,,,,
2400.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,455 : Last X-Ray,,,,,,
2400.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 : Date Expressed in Format CCYYMMDD,,,,,,
2400.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,,,
DTP,Segment - DTP Date - Initial Treatment Date (Situational),,,,,,,,,
2400.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,454:  Initial Treatment,,,,,,
2400.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 : Date Expressed in Format CCYYMMDD,,,,,,
2400.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,,,
QTY,Segment - QTY Ambulance Patient Count (Situational),,,,,,,,,
2400.QTY01,Quantity Qualifier,Code specifying the type of quantity,R,PT : Patients,,,,,,
2400.QTY02,Quantity,Numeric value of quantity,R,,,,,,,
QTY,Segment - QTY Obstetric Anesthesia Additional Units (Situational),,,,,,,,,
2400.QTY01,Quantity Qualifier,Code specifying the type of quantity,R,FL : Units,,,,,,
2400.QTY02,Quantity,Numeric value of quantity,R,,,,,,,
MEA,Segment - MEA Test Result (Situational),,,,,,,,,
2400.MEA01,Measurement Reference ID Code,Code identifying the broad category to which a measurement applies,R,"OG Original
TR Test Results",,,,,,
2400.MEA02,Measurement Qualifier,"Code identifying a specific product or process characteristic to which a
measurement applies",R,"HT Height
R1 Hemoglobin
R2 Hematocrit
R3 Epoetin Starting Dosage
R4 Creatinine",,,,,,
2400.MEA03,Measurement Value,The value of the measurement,R,,,,,,,
CN1,Segment - CN1 Contract Information (Situational),,,,,,,,,
2400.CN101,Contract Type Code,Code identifying a contract type,R,"01 : Diagnosis Related Group (DRG)
02 : Per Diem
03 : Variable Per Diem
04 : Flat
05 : Capitated
06 : Percent
09 : Other",,,,,,
2400.CN102,Monetary Amount,Monetary Amount,S,,,,,,,
2400.CN103,"Percent, Decimal Format",Percent given in decimal format,S,,,,,,,
2400.CN104,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier /: Contract Code",S,,,,,,,
2400.CN105,Terms Discount Percent,"Terms discount percentage, expressed as a percent, available to the purchaser if
an invoice is paid on or before the Terms Discount Due Date",S,,,,,,,
2400.CN106,Version Identifier,"Revision level of a particular format, program, technique or algorithm",S,,,,,,,
REF,Segment - REF Line Item Control Number (Situational),,,,,,,,,
2400.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,6R : Provider Control Number,,,,,,
2400.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,,,
REF,Segment - REF Repriced Line Item Reference Number (Situational),,,,,,,,,
2400.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,9B : Repriced Line Item Reference Number,,,,,,
2400.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,,,
REF,Segment - REF Adjusted Repriced Line Item Reference Number (Situational),,,,,,,,,
2400.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,9D : Adjusted Repriced Line Item Reference Number,,,,,,
2400.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,,,
REF,Segment - REF Prior Authorization (Situational),,,,,,,,,
2400.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,G1 : Prior Authorization Number,,,,,,
2400.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,,,
2400.REF04.01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,2U : Payer Identification Number,,,,,,
2400.REF04.02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,,,
REF,Segment - REF Mammography Certification Number (Situational),,,,,,,,,
2400.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,EW : Mammography Certification Number,,,,,,
2400.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,,,
REF,Segment - REF Clinical Laboratory Improvement Amendment (CLIA) Number (Situational),,,,,,,,,
2400.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"X4 : Clinical Laboratory Improvement Amendment
Number",,,,,,
2400.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,,,
REF,Segment - REF Immunization Batch Number (Situational),,,,,,,,,
2400.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,BT : Batch Number,,,,,,
2400.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,,,
REF,Segment - REF Referral Number (Situational),,,,,,,,,
2400.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,9F  :Referral Number,,,,,,
2400.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,,,
2400.REF04.01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,2U : Payer Identification Number,,,,,,
2400.REF04.02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,,,
AMT,Segment - AMT Sales Tax Amount (Situational),,,,,,,,,
2400.AMT01,Amount Qualifier Code,Code to qualify amount,R,T :Tax,,,,,,
2400.AMT02,Monetary Amount,Monetary Amount,R,,,,,,,
AMT,Segment - AMT Postage Claimed Amount (Situational),,,,,,,,,
2400.AMT01,Amount Qualifier Code,Code to qualify amount,R,F4 : Postage Claimed,,,,,,
2400.AMT02,Monetary Amount,Monetary Amount,R,,,,,,,
K3,Segment - K3 File Information (Situational),,,,,,,,,
2400.K301,Fixed Format Information,Data in fixed format agreed upon by sender and receiver,R,,,,,,,
NTE,Segment - NTE Line Note (Situational),,,,,,,,,
2400.NTE01,Note Reference Code,Code identifying the functional area or purpose for which the note applies,R,"ADD :Additional Information
DCP: Goals, Rehabilitation Potential, or Discharge Plans",,,,,,
2400.NTE02,Description,A free-form description to clarify the related data elements and their content,R,,,,,,,
NTE,Segment - NTE Third Party Organization Notes (Situational),,,,,,,,,
2400.NTE01,Note Reference Code,Code identifying the functional area or purpose for which the note applies,R,TPO : Third Party Organization Notes,,,,,,
2400.NTE02,Description,A free-form description to clarify the related data elements and their content,R,,,,,,,
PS1,Segment - PS1 Purchased Service Information (Situational),,,,,,,,,
2400.PS101,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,
2400.PS102,Monetary Amount,Monetary Amount,R,,,,,,,
HCP,Segment - HCP Line Pricing/Repricing Information (Situational),,,,,,,,,
2400.HCP01,Pricing Methodology,"Code specifying pricing methodology at which the claim or line item has been
priced or repriced",R,"00: Zero Pricing (Not Covered Under Contract)
01: Priced as Billed at 100%
02 :Priced at the Standard Fee Schedule
03 :Priced at a Contractual Percentage
04 : Bundled Pricing
05 : Peer Review Pricing
06 : Per Diem Pricing
07 : Flat Rate Pricing
08  :Combination Pricing
09 : Maternity Pricing
10 : Other Pricing
11 : Lower of Cost
12 : Ratio of Cost
13 : Cost Reimbursed
14 : Adjustment Pricing",,,,,,
2400.HCP02,Monetary Amount,Monetary Amount,R,,,,,,,
2400.HCP03,Monetary Amount,Monetary Amount,S,,,,,,,
2400.HCP04,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifie /Repricing Organization Identifier",S,,,,,,,
2400.HCP05,Rate,Rate expressed in the standard monetary denomination for the currency specified,S,,,,,,,
2400.HCP06,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier /Repriced Approved Ambulatory Patient Group
Code",S,,,,,,,
2400.HCP07,Monetary Amount,,S,,,,,,,
2400.HCP09,Product/Service ID Qualifier,"Code identifying the type/source of the descriptive number used in
Product/Service ID",S,"ER : Jurisdiction Specific Procedure and Supply Codes
HC :Health Care Financing Administration Common
Procedural Coding System (HCPCS) Codes
IV : Home Infusion EDI Coalition (HIEC) Product/Service
Code
WK : Advanced Billing Concepts (ABC) Codes",,,,,,
2400.HCP10,Product/Service ID,Identifying number for a product or service,S,,,,,,,
2400.HCP11,Unit or Basis for Measurement Code,"Code specifying the units in which a value is being expressed, or manner in which a measurement has been taken",S,"MJ : Minutes
UN: Unit",,,,,,
2400.HCP12,Quantity,Numeric value of quantity,S,,,,,,,
2400.HCP13,Reject Reason Code,Code assigned by issuer to identify reason for rejection,S,"T1 :Cannot Identify Provider as TPO (Third Party
Organization) Participant
T2 :Cannot Identify Payer as TPO (Third Party
Organization) Participant
T3 :Cannot Identify Insured as TPO (Third Party
Organization) Participant
T4 :Payer Name or Identifier Missing
T5 :Certification Information Missing
T6 :Claim does not contain enough information for repricing",,,,,,
2400.HCP14,Policy Compliance Code,Code specifying policy compliance,S,"1 :Procedure Followed (Compliance)
2:Not Followed - Call Not Made (Non-Compliance Call
Not Made)
3: Not Medically Necessary (Non-Compliance NonMedically Necessary)
4 :Not Followed Other (Non-Compliance Other)
5 : Emergency Admit to Non-Network Hospital",,,,,,
2400.HCP15,Exception Code,"Code specifying the exception reason for consideration of out-of-network health
care services",S,"1 :Non-Network Professional Provider in Network
Hospital
2 :Emergency Care
3: Services or Specialist not in Network
4 :Out-of-Service Area
5 :State Mandates
6 :Other",,,,,,
Loop 2410  — DRUG IDENTIFICATION Drug identification Loop Repeat: 1,,,,,,,,,,
LIN,Segment - LIN Drug identification (Situational),,,,,,,,,
2410.LIN02,Product/Service ID Qualifier,"Code identifying the type/source of the descriptive number used in
Product/Service ID",R,N4 : National Drug Code in 5-4-2 Format,,,,,,
2410.LIN03,Product/Service ID,Identifying number for a product or service,R,,,,,,,
CTP,Segment - CTP Drug Quantity (Required),,,,,,,,,
2410.CTP04,Quantity,Numeric value of quantity,R,,,,,,,
2410.CTP05-1,COMPOSITE UNIT OF MEASURE-Unit or Basis for Measurement Code,"To identify a composite unit of measure. Code specifying the units in which a value is being expressed, or
manner in which a measurement has been taken",R,"F2 : International Unit
GR : Gram
ME :Milligram
ML :Milliliter
UN :Unit",,,,,,
REF,Segment - REF Prescription or Compound Drug Association Number (Situational),,,,,,,,,
2410.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"VY : Link Sequence Number
XZ : Pharmacy Prescription Number",,,,,,
2410.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,,,
Loop 2420A  — RENDERING PROVIDER NAME(Situational) Loop Repeat: 1,,,,,,,,,,
NM1,Segment - NM1 Renderring Physician Name (Situational),,,,,,,,,
2420A.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,82 : Rendering Provider,,"Hardcode as ""82""",,,,
2420A.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,"1 : Person
2 : Non-Person Entity",,"Hardcode as ""1""",,,,
2420A.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,,Service_Line_RenderingProviderLastName,Line Level,,
2420A.NM104,Name First,Individual first name,S,,,,Service_Line_RenderingProviderFirstName,Line Level,,
2420A.NM105,Name Middle,Individual middle name or initial,S,,,,,,,
2420A.NM107,Name Suffix,Suffix to individual name,S,,,,,,,
2420A.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code,S,"XX :  Centers for Medicare and Medicaid Services
National Provider Identifier",,"Hardcode as ""XX""",,,,
2420A.NM109,Identification Code,Code identifying a party or other code /: Rendering Provider Identifier,S,1000959250,,,Service_Line_RenderingProvidernpi,,,
PRV,Segment - PRV Rendering Provider Specialty Information (Situational),,,,,,,,,
2420A.PRV01,Provider Code,Code identifying the type of provider,R,PE : Performing,,"Hardcode as ""PE""",,,,
2420A.PRV02,Reference Identification Qualifier,Code qualifying the Reference Identification,R,PXC : Health Care Provider Taxonomy Code,,"Hardcode as ""PXC""",,,,
2420A.PRV03,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,1041C0700X,,Service_Line_RenderingPractitionerSpecialty,Line Level,,
REF,Segment - REF Rendering Provider Secondary Identification (Situational),,,,,,,,,
2420A.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B: State License Number
1G : Provider UPIN Number
G2 : Provider Commercial Number
LU : Location Number",,"Hardcode as ""0B""",,,,
2420A.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,Service_Line_OtherRenderingProviderId,Line Level,,
2420A.REF04.01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,2U : Payer Identification Number,,,,,,
2420A.REF04.02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,,,
Loop 2420B  — PURCHASED SERVICE PROVIDER NAME (Situational) Loop Repeat: 1,,,,,,,,,,
NM1,Segment - NM1 Purchased Service Provider Name (Situational),,,,,,,,,
2420B.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,QB : Purchase Service Provider,,,,,,
2420B.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,"1 : Person
2 : Non-Person Entity",,,,,,
2420B.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code",S,"XX :  Centers for Medicare and Medicaid Services
National Provider Identifier",,,,,,
2420B.NM109,Identification Code,Code identifying a party or other code,S,,,,,,,
REF,Segment - REF Purchased Service Provider Secondary Identification (Situational),,,,,,,,,
2420B.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B: State License Number
1G : Provider UPIN Number
G2 : Provider Commercial Number",,,,,,
2420B.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,,,
2420B.REF04.01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,2U : Payer Identification Number,,,,,,
2420B.REF04.02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,,,
Loop 2420C  — SERVICE FACILITY LOCATION NAME  (Situational) Loop Repeat: 1,,,,,,,,,,
NM1,Segment - NM1 Service Facility Location Name (Situational),,,,,,,,,
2420C.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,77 : Service Location,,,,,,
2420C.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,2 :Non-Person Entity,,,,,,
2420C.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,,,,,
2420C.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code",S,"XX :  Centers for Medicare and Medicaid Services
National Provider Identifier",,,,,,
2420C.NM109,Identification Code,Code identifying a party or other code,S,,,,,,,
N3,Segment - N3 Service Facility Location Address (Required),,,,,,,,,
2420C.N301,Address Information,Address Information,R,,,,,,,
2420C.N302,Address Information,Address Information,S,,,,,,,
N4,"Segment - N4 Service Facility Location City, State, ZIP Code (Required)",,,,,,,,,
2420C.N401,City Name,Free-form text for city name,R,,,,,,,
2420C.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,,,,,
2420C.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,,,,,,
2420C.N404,Country Code,Code identifying the country,S,,,,,,,
2420C.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,,
REF,Segment - REF Service Facility Location Secondary Identification (Situational),,,,,,,,,
2420C.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"LU : Location Number
G2 : Provider Commercial Number",,,,,,
2420C.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,,,
2420C.REF04.01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,2U : Payer Identification Number,,,,,,
2420C.REF04.02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,,,
Loop 2420D — SUPERVISING PROVIDER NAME (Situational) Loop Repeat: 1,,,,,,,,,,
NM1,Segment - NM1 Supervising Provider Name (Situational),,,,,,,,,
2420D.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,DQ : Supervising Physician,,"Hardcode as ""DQ""",,,,
2420D.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,1 : Person,,"Hardcode as ""1""",,,,
2420D.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,,Line_Supervising_Physician_LastName,Line Level,,
2420D.NM104,Name First,Individual first name,S,,,,Line_Supervising_Physician_FirstName,Line Level,,
2420D.NM105,Name Middle,Individual middle name or initial,S,,,,,,,
2420D.NM107,Name Suffix,Suffix to individual name,S,,,,,,,
2420D.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code,S,"XX :  Centers for Medicare and Medicaid Services
National Provider Identifier",,"Hardcode as 'XX""",,,,
2420D.NM109,Identification Code,Code identifying a party or other code,S,,,,Line_Supervising_Physician_npi,Line Level,,
REF,Segment - REF Supervising Provider Secondary Identification (Situational),,,,,,,,,
2420D.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B: State License Number
1G : Provider UPIN Number
G2 : Provider Commercial Number
LU: Location Number",,,,,,
2420D.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,,,
2420D.REF04.01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,2U : Payer Identification Number,,,,,,
2420D.REF04.02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,,,
Loop 2420E — ORDERING PROVIDER NAME (Situational) Loop Repeat: 1,,,R,,,,,,,
NM1,Segment - NM1 Ordering Provider Name (Situational),,,,,,,,,
2420E.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,DK :Ordering Physician,,"Hardcode as ""DK""",,,,
2420E.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,1 : Person,,"Hardcode as ""1""",,,,
2420E.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,,Line_Ordering_Physician_LastName,Line Level,,
2420E.NM104,Name First,Individual first name,S,,,,Line_Ordering_Physician_FirstName,Line Level,,
2420E.NM105,Name Middle,Individual middle name or initial,S,,,,,,,
2420E.NM107,Name Suffix,Suffix to individual name,S,,,,,,,
2420E.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code (67)",S,"XX :  Centers for Medicare and Medicaid Services
National Provider Identifier",,,,,,
2420E.NM109,Identification Code,Code identifying a party or other code,S,,,,,,,
N3,Segment - N3 Ordering Provider Address (Situational),,,,,,,,,
2420E.N301,Address Information,Address Information,R,,,,,,,
2420E.N302,Address Information,Address Information,S,,,,,,,
N4,"Segment - N4 Ordering Provider City, State, ZIP Code (Situational)",,,,,,,,,
2420E.N401,City Name,Free-form text for city name,R,,,,,,,
2420E.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,,,,,
2420E.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,,,,,,
2420E.N404,Country Code,Code identifying the country,S,,,,,,,
2420E.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,,
REF,Segment - REF Ordering Provider Secondary Identification (Situational),,,,,,,,,
2420E.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B: State License Number
1G : Provider UPIN Number
G2 : Provider Commercial Number",,,,,,
2420E.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,,,
2420E.REF04.01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,2U  :Payer Identification Number,,,,,,
2420E.REF04.02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,,,
PER,Segment - PER Ordering Provider Contact Information (Situational),,,,,,,,,
2420E.PER01,Contact Function Code,Code identifying the major duty or responsibility of the person or group named,R,IC -  Information Contact,,,,,,
2420E.PER02,Name,Submitter Contact Name,S,<<Submitter Name>>,,,,,,
2420E.PER03,Communication Number Qualifier,Code identifying the type of communication number,R,"""EM"" : Electronic Mail
""FX"" : Facsimile
""TE"" : Telephone",,,,,,
2420E.PER04,Communication Number,Complete communications number including country or area code when applicable,R,,,,,,,
2420E.PER05,Communication Number Qualifier,Code identifying the type of communication number,S,"""EM"" : Electronic Mail
""FX"" : Facsimile
""TE"" : Telephone",,,,,,
2420E.PER06,Communication Number,Complete communications number including country or area code when applicable,S,,,,,,,
2420E.PER07,Communication Number Qualifier,Code identifying the type of communication number,S,"""EM"" : Electronic Mail
""FX"" : Facsimile
""TE"" : Telephone",,,,,,
2420E.PER08,Communication Number,Complete communications number including country or area code when applicable,S,,,,,,,
Loop 2420F — REFERRING PROVIDER NAME (Situational) Loop Repeat: 2,,,,,,,,,,
NM1,Segment - NM1 Referring Provider Name (Situational),,,,,,,,,
2420F.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,"DN :Referring Provider
P3 :Primary Care Provider",,,,,,
2420F.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,,,,,,,
2420F.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,,,,,
2420F.NM104,Name First,Individual first name,S,,,,,,,
2420F.NM105,Name Middle,Individual middle name or initial,S,,,,,,,
2420F.NM107,Name Suffix,Suffix to individual name,S,,,,,,,
2420F.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code (67)",S,"XX :  Centers for Medicare and Medicaid Services
National Provider Identifier",,,,,,
2420F.NM109,Identification Code,Code identifying a party or other code,S,,,,,,,
REF,Segment - REF Referring Provider Secondary Identification (Situational),,,,,,,,,
2420F.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B: State License Number
1G : Provider UPIN Number
G2 : Provider Commercial Number",,,,,,
2420F.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,,,
2420F.REF04.01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,2U : Payer Identification Number,,,,,,
2420F.REF04.02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,,,
Loop 2420G — AMBULANCE PICK-UP LOCATION (Situational) Loop Repeat: 1,,,,,,,,,,
NM1,Segment - NM1 Ambulance Pick-up Location (Situational),,,,,,,,,
2420G.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,PW : Pickup Address,,,,,,
2420G.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,2 : Non-Person Entity,,,,,,
N3,Segment- N3 Ambulance Pick-up Location Address (Required),,,,,,,,,
2420G.N301,Address Information,Address Information,R,,,,,,,
2420G.N302,Address Information,Address Information,S,,,,,,,
N4,"Segment - N4 Ambulance Pick-up Location City, State, ZIP Code (Required)",,,,,,,,,
2420G.N401,City Name,Free-form text for city name,R,,,,,,,
2420G.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,,,,,
2420G.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,,,,,,
2420G.N404,Country Code,Code identifying the country,S,,,,,,,
2420G.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,,
Loop 2420H  — AMBULANCE DROP-OFF LOCATION (Situational) Loop Repeat: 1,,,,,,,,,,
NM1,Segment - NM1 Ambulance Drop-off Location (Situational),,,,,,,,,
2420H.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,45 :  Drop-off Location,,,,,,
2420H.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,2 : Non-Person Entity,,,,,,
2420H.NM103,Name Last or Organization Name,Individual last name or organizational name,S,,,,,,,
N3,Segment - N3 Ambulance Drop-off Location Address (Required),,,,,,,,,
2420H.N301,Address Information,Address Information,R,,,,,,,
2420H.N302,Address Information,Address Information,S,,,,,,,
N4,"Segment - N4 Ambulance Drop-off Location City, State, ZIP Code (Required)",,,,,,,,,
2420H.N401,City Name,Free-form text for city name,R,,,,,,,
2420H.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,,,,,
2420H.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,,,,,,
2420H.N404,Country Code,Code identifying the country,S,,,,,,,
2420H.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,,,
Loop 2430   — LINE ADJUDICATION INFORMATION(Situational) Loop Repeat: 15,,,,,,,,,,
SVD,Segment - SVD Line Adjudication Information (Situational),,,,,,,,,
2430.SVD01,Identification Code,Code identifying a party or other code,R,,611X1,,,,,
2430.SVD02,Monetary Amount,Monetary Amount,R,,,,,,,
2430.SVD03.01,Product/Service ID Qualifier,Code identifying the type/source of the descriptive number used in Product/Service ID,R,"ER : Jurisdiction Specific Procedure and Supply Codes
HC : Health Care Financing Administration Common
Procedural Coding System (HCPCS) Codes
IV :Home Infusion EDI Coalition (HIEC) Product/Service
Code",HC,,,,,
2430.SVD03.02,Product/Service ID,Identifying number for a product or service,R,,90837,,,,,
2430.SVD03.03,Procedure Modifier,"This identifies special circumstances related to the performance of the
service, as defined by trading partners",S,,HE,,,,,
2430.SVD03.04,Procedure Modifier,"This identifies special circumstances related to the performance of the service, as defined by trading partners",S,,GT,,,,,
2430.SVD03.05,Procedure Modifier,"This identifies special circumstances related to the performance of the service, as defined by trading partners",S,,GT,,,,,
2430.SVD03.06,Procedure Modifier,"This identifies special circumstances related to the performance of the service, as defined by trading partners",S,,GT,,,,,
2430.SVD03.07,Description,"A free-form description to clarify the related data elements and their
content",S,,,,,,,
2430.SVD05,Quantity,Numeric value of quantity/: Paid Service Unit Count,R,,,,,,,
2430.SVD06,Assigned Number,Number assigned for differentiation within a transaction set/: Bundled or Unbundled Line Number,S,,,,,,,
CAS,Segment - CAS Line Adjustment (Situational),,,,,,,,,
2430.CAS01,Claim Adjustment Group Code,Code identifying the general category of payment adjustment,R,"CO : Contractual Obligations
CR : Correction and Reversals
OA : Other adjustments
PI : Payor Initiated Reductions
PR : Patient Responsibility",,,,,,
2430.CAS02,Claim Adjustment Reason Code,Code identifying the detailed reason the adjustment was made,R,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
2430.CAS03,Monetary Amount,Monetary Amount,R,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
2430.CAS04,Quantity,Numeric value of quantity,S,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
2430.CAS05,Claim Adjustment Reason Code,Code identifying the detailed reason the adjustment was made,R,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
2430.CAS06,Monetary Amount,Monetary Amount,R,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
2430.CAS07,Quantity,Numeric value of quantity,S,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
2430.CAS08,Claim Adjustment Reason Code,Code identifying the detailed reason the adjustment was made,R,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
2430.CAS09,Monetary Amount,Monetary Amount,R,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
2430.CAS10,Quantity,Numeric value of quantity,S,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
2430.CAS11,Claim Adjustment Reason Code,Code identifying the detailed reason the adjustment was made,R,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
2430.CAS12,Monetary Amount,Monetary Amount,R,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
2430.CAS13,Quantity,Numeric value of quantity,S,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
2430.CAS14,Claim Adjustment Reason Code,Code identifying the detailed reason the adjustment was made,R,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
2430.CAS15,Monetary Amount,Monetary Amount,R,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
2430.CAS16,Quantity,Numeric value of quantity,S,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
2430.CAS17,Claim Adjustment Reason Code,Code identifying the detailed reason the adjustment was made,R,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
2430.CAS18,Monetary Amount,Monetary Amount,R,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
2430.CAS19,Quantity,Numeric value of quantity,S,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
,,,,,,,,,,
DTP,Segment - DTP Line Check or Remittance Date (Required),,,,,,,,,
2430.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,573 : Date Claim Paid,,,,,,
2430.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 :Date Expressed in Format CCYYMMDD,,,,,,
2430.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,20210526,,,,,
AMT,Segment - AMT Remaining Patient Liability (Situational),,,,,,,,,
2430.AMT01,Amount Qualifier Code,Code to qualify amounT,R,EAF : Amount Owed,,,,,,
2430.AMT02,Monetary Amount,Monetary Amount,R,,,,,,,
Loop 2440  — FORM IDENTIFICATION CODE (Situational) Loop Repeat: >1,,,,,,,,,,
LQ,Segment - LQ Form Identification Code (Situational),,,,,,,,,
2440.LQ01,Code List Qualifier Code,Code identifying a specific industry code list,R,"AS : Form Type Code
UT : Centers for Medicare and Medicaid Services (CMS)
Durable Medical Equipment Regional Carrier
(DMERC) Certificate of Medical Necessity (CMN)
Forms",,,,,,
2440.LQ02,Industry Code,Code indicating a code from a specific industry code list,R,,,,,,,
FRM,Segment - FRM Supporting Documentation (Required),,,,,,,,,
2440.FRM01,Assigned Identification,Alphanumeric characters assigned for differentiation within a transaction set,R,,,,,,,
2440.FRM02,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response/ Question Response,S,"N No
W Not Applicable
Y Yes",,,,,,
2440.FRM03,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",S,,,,,,,
2440.FRM04,Date,"Date expressed as CCYYMMDD where CC represents the first two digits of the
calendar year",S,,,,,,,
2440.FRM05,"Percent, Decimal Format","Percent given in decimal format (e.g., 0.0 through 100.0 represents 0% through
100%)",S,,,,,,,
Segment SE - Transaction Set Trailer (Required),,,,,,,,,,
SE,SE Transaction Set Trailer (Required),,R,,,,,,,
SE01,Number of Included Segments,"Total number of segments included in a transaction set including ST and SE
segments",R,,Count Of ST - 74,,,,,
SE02,Transaction Set Control Number,"Identifying control number that must be unique within the transaction set
functional group assigned by the originator for a transaction set.  It must be identical to ST02.",R,,ST02 Value - 319003402,,,,,
Segment GE - Functional Group Trailer  (Required),,,,,,,,,,
GE,GE Functional Group Trailer (Required),,R,,,,,,,
GE01,Number of Transaction Sets Included,"Total number of transaction sets included in the functional group or interchange
(transmission) group",R,,Count Of GS - 1,,,,,
GE02,Group Control Number,Assigned number originated and maintained by the sender .  It must be identical to GS06.,R,,319003402,,,,,
Segment IEA -  Interchange Control Trailer(Required),,,,,,,,,,
IEA,IEA Interchange Control Trailer (Required),,R,,,,,,,
IEA01,Number of Included Functional Groups,A count of the number of functional groups included in an interchange,R,,Count Of ISA - 1,,,,,
IEA02,Interchange Control Number,A control number assigned by the interchange sender.  It must be identical to ISA13,R,,ISA13 Value - 319003402,,,,,
```

## QA Automation/EdifecsProduct_MappingSpec_QA Automation_837P_CSV_to_EDI_Conversion_V1.1.xlsx — Sheet1

```csv
institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/supplierInformation/address
```

## QA Automation/EdifecsProduct_MappingSpec_QA Automation_837P_CSV_to_EDI_Conversion_V1.1.xlsx — Sample CSV

```csv
Claimid,Scenarios,EdiFilename,totalClaimCount,SenderId,ReceiverId,Receipt_Date,Entry_Date,Clean_Claim_Date,Claim_Delivery_Type,Payee_Type_Field,Frequency_Code,Clearing_House_Trace_Number,External_Batch_Sequence_Number,Benefit_Plan_Type,TradingPartnerId,Claim_Source,claim_Payor_Type,Claim_Filing_Code,Attachment_Set_ID,Claim_Number,Submitted_Subscriber_Id,Subscriber_Identification_Number,Subscriber_Name,Subscriber_Last_Name,Subscriber_First_Name,Subscriber_Middle_Name,Subscriber_Street_Address,Subscriber_City_Name,Subscriber_State_Code,Subscriber_Postal_Code,Subscriber_Gender_Code,Subscriber_Date_Of_Birth,Benefit_Assignment,Member_Identification_Number,Member_Name,Member_Last_Name,Member_First_Name,Member_Street_Address,Member_City_Name,Member_State_Code,Member_Postal_Code,Member_Gender_Code,Member_DateOfBirth,Submitter_Id,Submitter_Name,Relationship_To_Subscriber_Code,Account_Number,Release_Authorization,Assignment_Acceptance,Supplier_Billing_Name,Tax_Identification_Number,Tax_Id_Code,Supplier_Street_Address,Supplier_City_Name,Supplier_State_Code,Supplier_Postal_Code,Phone_Country_Code,Phone_Area_Code,Phone_Number,Supplier_Npi,Supplier_PIN_Number,Additional_Code,Principal_Diagnosis_Code,Diagnosis_Code_1,Diagnosis_Code_2,Diagnosis_Code_3,Diagnosis_Code_4,Diagnosis_Code_5,Diagnosis_Code_6,Diagnosis_Code_7,Diagnosis_Code_8,Diagnosis_Code_9,Diagnosis_Code_10,Diagnosis_Code_11,RenderingFacility_Name,RenderingFacility_StreetAddress,RenderingFacility_CityName,RenderingFacility_StateCode,RenderingFacility_PostalCode,Referring_Practitioner_Name,Referring_Practitioner_FirstName,Referring_Practitioner_LastName,Referring_Practitioner_MiddleName,Referring_Practitioner_Suffix,Referring_Practitioner_Identification,Referring_IdQualifier,Referring_ReferralNumber,Referring_npi,ChargedAmount,Number_of_service_lines,Placeofservice_Code,Original_Line_Number,Start_Date,End_Date,Service_Line_POS,Service_Line_ServiceCode,Service_Line_ServiceFee,Service_Line_ServiceUnitCount,Service_Line_ServiceMinuteCount,Service_Line_RenderingProviderFirstName,Service_Line_RenderingProviderLastName,Service_Line_OtherRenderingProviderId,Service_Line_RenderingPractitionerSpecialty,Line_Supervising_Physician_FirstName,Line_Supervising_Physician_LastName,Line_Ordering_Physician_FirstName,Line_Ordering_Physician_LastName,Diagnosis_Code_Pointer_1,Diagnosis_Code_Pointer_2,Diagnosis_Code_Pointer_3,Diagnosis_Code_Pointer_4,Service_Line_Modifier_1,Service_Line_Modifier_2,Service_Line_Modifier_3,Service_Line_Modifier_4,End_of_record
PROF1,"Create Scenario (Final Status)
Single line Claim",Proclaim1083110176.xml,1,1,1,2023-04-28,2021-12-25T11:15:27,2023-04-28,E,Supplier,1,2011349153671320000,0,1,TP0001,Unknown,1,MA,null,Dynamic,M000005794,M000005794-01,"Amal, Julieet",Amal,Julieet,,1769 Main St,Greeley,CO,80639,M,1983-04-30,Y,M000005794-01,"Amal, Julieet",Amal,Julieet,1769 Main St,Greeley,CO,80639,M,1983-04-30,M000005794-01,"Amal, Julieet",Self,121212121,Y,Y,Supplier_Clinic,99-9999999,EI,2050 E Osceola,Kissimmee,FL,34743,,,6171231234,1801943754,,261QM1300X,J30.89,,,,,,,,,,,,Supplier_Clinic,2050 E Osceola,Kissimmee,FL,34743,Paul Aguillon,Paul,Aguillon,J,Sr,P00000299,G2,13579,1275813552,,1,21,,,,,,,,,,,,,,,,,,,,,,,,,EOR
PROF1,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,"$1,000.00",,,1,2023-04-28,2023-04-28,11,99214,1000,1,,Test,Practitioner 2,P00007508,,Paul,Aguillon,Paul,Aguillon,1,1,1,1,GT,GT,GT,GT,EOR
PROF2,Final to Replacement Claim,Proclaim1083110176.xml,1,1,1,2023-04-28,2021-12-25T11:15:27,2023-04-28,E,Supplier,1,2011349153671320000,0,1,TP0001,Unknown,1,MA,null,Dynamic,M000005979,M000005979-01,"Gilliam, Zeus",Gilliam,Zeus,,919 Farrell Terrace,Greeley,CO,80639,M,1981-04-30,Y,M000005979-01,"Gilliam, Zeus",Gilliam,Zeus,919 Farrell Terrace,Greeley,CO,80639,M,1981-04-30,M000005979-01,"Gilliam, Zeus",Self,121212121,Y,Y,Supplier_Clinic,99-9999999,EI,2050 E Osceola,Kissimmee,FL,34743,,,6171231234,1801943754,,261QM1300X,J30.89,,,,,,,,,,,,Supplier_Clinic,2050 E Osceola,Kissimmee,FL,34743,Paul Aguillon,Paul,Aguillon,J,Sr,P00000299,G2,13579,1275813552,,1,,,,,,,,,,,,,,,,,,,,,,,,,,EOR
PROF2,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,1,2023-04-28,2023-04-28,11,99214,1000,1,,Test,Practitioner 2,P00007508,,Paul,Aguillon,Paul,Aguillon,1,1,1,1,GT,GT,GT,,EOR
PROF3,"Duplicate Status-
Single line claim",Proclaim1083110176.xml,1,1,1,2023-04-28,2021-12-25T11:15:27,2023-04-28,E,Supplier,1,2011349153671320000,0,1,TP0001,Unknown,1,MA,null,Dynamic,M000005995,M000005995-01,"Benton, Eve",Benton,Eve,,391 Barbera Pines,Greeley,CO,80639,M,1981-04-30,Y,M000005995-01,"Benton, Eve",Benton,Eve,391 Barbera Pines,Greeley,CO,80639,M,1981-04-30,M000005995-01,"Benton, Eve",Self,121212121,Y,Y,Supplier_Clinic,99-9999999,EI,2050 E Osceola,Kissimmee,FL,34743,,,6171231234,1801943754,,261QM1300X,J30.89,,,,,,,,,,,,Supplier_Clinic,2050 E Osceola,Kissimmee,FL,34743,Paul Aguillon,Paul,Aguillon,J,Sr,P00000299,G2,13579,1275813552,,1,,,,,,,,,,,,,,,,,,,,,,,,,,EOR
PROF3,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,"$1,000.00",,,1,2023-04-28,2023-04-28,11,99212,1000,1,,Test,Practitioner 2,P00007508,,Paul,Aguillon,Paul,Aguillon,1,1,1,1,GT,GT,GT,,EOR
PROF4,"Create Scenario (Final Status)
Multiple line Claim",Proclaim1083110176.xml,1,1,1,2023-04-28,2021-12-25T11:15:27,2023-04-28,E,Supplier,1,2011349153671320000,0,1,TP0001,Unknown,1,MA,null,Dynamic,MEM005,MEM005-01,"KANNAN, JOSY",KANNAN,JOSY,,PO Box 1230,Blakeslee,PA,18610,M,1960-09-05,Y,MEM005-01,"KANNAN, JOSY",KANNAN,JOSY,PO Box 1230,Blakeslee,PA,18610,M,1960-09-05,MEM005-01,"KANNAN, JOSY",Self,121212121,Y,Y,Supplier_Clinic,99-9999999,EI,2050 E Osceola,Kissimmee,FL,34743,,,6171231234,1801943754,,261QM1300X,J30.89,,,,,,,,,,,,Supplier_Clinic,2050 E Osceola,Kissimmee,FL,34743,Paul Aguillon,Paul,Aguillon,J,Sr,P00000299,G2,13579,1275813552,,3,,,,,,,,,,,,,,,,,,,,,,,,,,EOR
PROF4,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,1,2023-04-28,2023-04-28,11,99212,1000,1,,Test,Practitioner 2,P00007508,,Paul,Aguillon,Paul,Aguillon,1,1,1,1,GT,GT,GT,,EOR
PROF4,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,2,2023-04-28,2023-04-28,11,99213,1000,1,,Test,Practitioner 2,P00007508,,Paul,Aguillon,Paul,Aguillon,1,1,1,1,GT,GT,GT,,EOR
PROF4,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,3,2023-04-28,2023-04-28,11,99214,1000,1,,Test,Practitioner 2,P00007508,,Paul,Aguillon,Paul,Aguillon,1,1,1,1,GT,GT,GT,,EOR
PROF5,High Dollar Claim Scenario,Proclaim1083110176.xml,1,1,1,2023-04-28,2021-12-25T11:15:27,2023-04-28,E,Supplier,1,2011349153671320000,0,1,TP0001,Unknown,1,MA,null,Dynamic,M000005948,M000005948-01,"Kirkm, Quinn",Kirkm,Quinn,,176 Hessel Rue,Greeley,CO,80639,M,1981-04-30,Y,M000005948-01,"Kirkm, Quinn",Kirkm,Quinn,176 Hessel Rue,Greeley,CO,80639,M,1981-04-30,M000005948-01,"Kirkm, Quinn",Self,121212121,Y,Y,Supplier_Clinic,99-9999999,EI,2050 E Osceola,Kissimmee,FL,34743,,,6171231234,1801943754,,261QM1300X,J30.89,,,,,,,,,,,,Supplier_Clinic,2050 E Osceola,Kissimmee,FL,34743,Paul Aguillon,Paul,Aguillon,J,Sr,P00000299,G2,13579,1275813552,,1,,,,,,,,,,,,,,,,,,,,,,,,,,EOR
PROF5,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,1,2023-04-28,2023-04-28,11,99212,50000,1,,Test,Practitioner 2,P00007508,,Paul,Aguillon,Paul,Aguillon,1,1,1,1,GT,GT,GT,,EOR
PROF6,Workbasket Scenario,Proclaim1083110176.xml,1,1,1,2023-04-28,2021-12-25T11:15:27,2023-04-28,E,Supplier,1,2011349153671320000,0,1,TP0001,Unknown,1,MA,null,Dynamic,M000005956,M000005956-01,"Doyle, Valentine",Doyle,Valentine,,4427 Batz Point,Greeley,CO,80639,M,1981-04-30,Y,M000005956-01,"Doyle, Valentine",Doyle,Valentine,4427 Batz Point,Greeley,CO,80639,M,1981-04-30,M000005956-01,"Doyle, Valentine",Self,121212121,Y,Y,Supplier_Clinic,99-9999999,EI,2050 E Osceola,Kissimmee,FL,34743,,,6171231234,1801943754,,261QM1300X,J30.89,,,,,,,,,,,,Supplier_Clinic,2050 E Osceola,Kissimmee,FL,34743,Paul Aguillon,Paul,Aguillon,J,Sr,P00000299,G2,13579,1275813552,,1,,,,,,,,,,,,,,,,,,,,,,,,,,EOR
PROF6,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,1,2023-04-28,2023-04-28,,99212,1000,1,,Test,Practitioner 2,P00007508,,Paul,Aguillon,Paul,Aguillon,1,1,1,1,GT,GT,GT,,EOR
PROF7,Rejected Claim,Proclaim1083110176.xml,1,1,1,2023-04-28,2021-12-25T11:15:27,2023-04-28,E,Supplier,1,2011349153671320000,0,1,TP0001,Unknown,1,MA,null,Dynamic,M000005996,M000005996-01,"Allison, Samson",Allison,Samson,,8768 Lynnette Route,Greeley,CO,80639,M,1981-04-30,Y,M000005996-01,"Allison, Samson",Allison,Samson,8768 Lynnette Route,Greeley,CO,80639,M,1981-04-30,M000005996-01,"Allison, Samson",Self,121212121,Y,Y,Supplier_Clinic12345,99-0000000,EI,2050 E Osceola,Kissimmee,FL,34743,,,6171231234,1801943754,,261QM1300X,J30.89,,,,,,,,,,,,Supplier_Clinic,2050 E Osceola,Kissimmee,FL,34743,Paul Aguillon,Paul,Aguillon,J,Sr,P00000299,G2,13579,1275813552,,1,,,,,,,,,,,,,,,,,,,,,,,,,,EOR
PROF7,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,1,2023-04-28,2023-04-28,11,99212,1000,1,,Test,Practitioner 2,P00007508,,Paul,Aguillon,Paul,Aguillon,1,1,1,1,GT,GT,GT,,EOR
PROF8,Claim Attachment validation,Proclaim1083110176.xml,1,1,1,2023-04-28,2021-12-25T11:15:27,2023-04-28,E,Supplier,1,2011349153671320000,0,1,TP0001,Unknown,1,MA,www.google.com,Dynamic,M000006063,M000006063-01,"Jerde, Lexie",Jerde,Lexie,,3650 Steuber Garden,Greeley,CO,80639,M,1981-04-30,Y,M000006063-01,"Jerde, Lexie",Jerde,Lexie,3650 Steuber Garden,Greeley,CO,80639,M,1981-04-30,M000006063-01,"Jerde, Lexie",Self,121212121,Y,Y,Supplier_Clinic,99-9999999,EI,2050 E Osceola,Kissimmee,FL,34743,,,6171231234,1801943754,,261QM1300X,J30.89,,,,,,,,,,,,Supplier_Clinic,2050 E Osceola,Kissimmee,FL,34743,Paul Aguillon,Paul,Aguillon,J,Sr,P00000299,G2,13579,1275813552,,Attachment_Claim,,,,,,,,,,,,,,,,,,,,,,,,,,EOR
PROF8,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,"$1,000.00",,,1,2023-04-28,2023-04-28,11,99212,1000,1,,Test,Practitioner 2,P00007508,,Paul,Aguillon,Paul,Aguillon,1,1,1,1,GT,GT,GT,,EOR
,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,EOR
```

## QA Automation/EdifecsProduct_MappingSpec_QA Automation_837P_CSV_to_EDI_Conversion_V1.1.xlsx — Default Values

```csv
Field in CSV,Claim/Line Level Record,Default value/Mapping logic
Claimid,Claim Level/Line Level,An incremental value which is unique for each claim record in the file  (P1/P2/P3).
Scenarios,Claim Level,Blank
EdiFilename,Claim Level,Name of the IB EDI 837P file
totalClaimCount,Claim Level,Total number of claims in the IB file
Entry_Date,Claim Level,Processing date/time in the format: YYYY-MM-DDTHH:mm:ss
Claim_Source,Claim Level,Refer the ClaimsourceLookup crosswalk in IB 837 and populate.
Claim_Delivery_Type,Claim Level,Refer the ClaimsourceLookup crosswalk in IB 837 and populate.
Payee_Type_Field,Claim Level,Hardcode as 'Supplier'
Benefit_Plan_Type,Claim Level,Hardcode as 1 (medical)
claim_Payor_Type,Claim Level,Hardcode as '1 '
End_of_record,Claim Level/Line Level,Hardcode as 'EOR'
```

## QA Automation/EdifecsProduct_MappingSpec_QA Automation_837P_EDI_to_CSVConversion_V1.0.xlsx — Cover Page

```csv
Data Extraction for QA Automation- EDIFECS,,,,,,,,,
,,,,,,,,,
Business Area: Inbound Claims  (EDI 837P),,,,,,,,,
,,,,,,,,,
This document provides the Mapping Specification for converting EDI 837P Claims file into CSV format as part of the data extraction for QA automation. Document is intended for EDIFECS Product Team,,,,,,,,,
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

## QA Automation/EdifecsProduct_MappingSpec_QA Automation_837P_EDI_to_CSVConversion_V1.0.xlsx — Version History

```csv
Revision History,,,,
,,,,
,,,,
,,,,
V#,Date,Author,Reviewer(s)/ Contributor(s),Comments
0.1,27/8/2023,Ambily Raj,Shijila M,Initial Version
1,31/8/2023,Ambily Raj,Shijila M,Made changes as per review comments. Baselined.
```

## QA Automation/EdifecsProduct_MappingSpec_QA Automation_837P_EDI_to_CSVConversion_V1.0.xlsx — CSV Format

```csv
Sr No,CSV Field,,Claim/Line Level,Data Type,Length,Usage
1,Claimid,,Claim Level/Line Level,Varchar,10,R
2,Scenarios,,Claim Level,Varchar,100,S
3,EdiFilename,,Claim Level,Varchar,100,R
4,totalClaimCount,,Claim Level,Varchar,10,S
5,SenderId,ISA06,Claim Level,Varchar,15,S
6,ReceiverId,ISA08,Claim Level,Varchar,15,S
7,Receipt_Date,,Claim Level,Varchar,10,S
8,Entry_Date,,Claim Level,Varchar,10,S
9,Clean_Claim_Date,BHT04,Claim Level,Varchar,10,S
10,Claim_Delivery_Type,hardcode,Claim Level,Varchar,1,S
11,Payee_Type_Field,hardcode,Claim Level,Varchar,10,S
12,Frequency_Code,2300.CLM05.03,Claim Level,Varchar,1,S
13,Clearing_House_Trace_Number,2300.REF02*D9,Claim Level,Varchar,50,S
14,External_Batch_Sequence_Number,ST02,Claim Level,Varchar,9,S
15,Benefit_Plan_Type,hardcode,Claim Level,Varchar,1,S
16,TradingPartnerId,ISA06,Claim Level,Varchar,15,S
17,Claim_Source,ISA06,Claim Level,Varchar,15,S
18,claim_Payor_Type,hardcode,Claim Level,Varchar,1,S
19,Claim_Filing_Code,2000B.SBR09,Claim Level,Varchar,2,S
20,Attachment_Set_ID,2300.PWK06,Claim Level,Varchar,80,S
21,Claim_Number,2300.REF02,Claim Level,Varchar,50,S
22,Submitted_Subscriber_Id,2010BA.NM109,Claim Level,Varchar,80,S
23,Subscriber_Identification_Number,2010BA.NM109,Claim Level,Varchar,80,S
24,Subscriber_Name,,Claim Level,Varchar,120,S
25,Subscriber_Last_Name,2010BA.NM103,Claim Level,Varchar,60,S
26,Subscriber_First_Name,2010BA.NM104,Claim Level,Varchar,35,S
27,Subscriber_Middle_Name,2010BA.NM105,Claim Level,Varchar,25,S
28,Subscriber_Street_Address,2010BA.N301,Claim Level,Varchar,55,S
29,Subscriber_City_Name,2010BA.N401,Claim Level,Varchar,30,S
30,Subscriber_State_Code,2010BA.N402,Claim Level,Varchar,2,S
31,Subscriber_Postal_Code,2010BA.N403,Claim Level,Varchar,15,S
32,Subscriber_Gender_Code,2010BA.DMG03,Claim Level,Varchar,1,S
33,Subscriber_Date_Of_Birth,2010BA.DMG02,Claim Level,Varchar,10,S
34,Benefit_Assignment,2300.CLM08,Claim Level,Varchar,1,S
35,Member_Identification_Number,,Claim Level,Varchar,80,S
36,Member_Name,,Claim Level,Varchar,100,S
37,Member_Last_Name,2010CA.NM103,Claim Level,Varchar,60,S
38,Member_First_Name,2010CA.NM104,Claim Level,Varchar,35,S
39,Member_Street_Address,2010CA.N301,Claim Level,Varchar,55,S
40,Member_City_Name,2010CA.N401,Claim Level,Varchar,30,S
41,Member_State_Code,2010CA.N402,Claim Level,Varchar,2,S
42,Member_Postal_Code,2010CA.N403,Claim Level,Varchar,15,S
43,Member_Gender_Code,2010CA.DMG03,Claim Level,Varchar,1,S
44,Member_DateOfBirth,2010CA.DMG02,Claim Level,Varchar,10,S
45,Submitter_Id,1000A.NM109,Claim Level,Varchar,80,S
46,Submitter_Name,1000A.NM103,Claim Level,Varchar,60,S
47,Relationship_To_Subscriber_Code,2000B.SBR02,Claim Level,Varchar,2,S
48,Account_Number,2300.CLM01,Claim Level,Varchar,38,S
49,Release_Authorization,2300.CLM09,Claim Level,Varchar,1,S
50,Assignment_Acceptance,2300.CLM07,Claim Level,Varchar,1,S
51,Supplier_Billing_Name,2010AA.NM103,Claim Level,Varchar,60,S
52,Tax_Identification_Number,2010AA.REF02,Claim Level,Varchar,50,S
53,Tax_Id_Code,2010AA.REF01,Claim Level,Varchar,3,S
54,Supplier_Street_Address,,Claim Level,Varchar,55,S
55,Supplier_City_Name,2010AA.N401,Claim Level,Varchar,30,S
56,Supplier_State_Code,2010AA.N402,Claim Level,Varchar,2,S
57,Supplier_Postal_Code,2010AA.N403,Claim Level,Varchar,15,S
58,Phone_Country_Code,,Claim Level,Varchar,1,S
59,Phone_Area_Code,,Claim Level,Varchar,3,S
60,Phone_Number,,Claim Level,Varchar,7,S
61,Supplier_Npi,2010AA.NM109,Claim Level,Varchar,80,S
62,Supplier_PIN_Number,2010AA.REF02,Claim Level,Varchar,50,S
63,Additional_Code,,Claim Level,Varchar,50,S
64,Principal_Diagnosis_Code,,Claim Level,Varchar,30,S
65,Diagnosis_Code_1,,Claim Level,Varchar,30,S
66,Diagnosis_Code_2,,Claim Level,Varchar,30,S
67,Diagnosis_Code_3,,Claim Level,Varchar,30,S
68,Diagnosis_Code_4,,Claim Level,Varchar,30,S
69,Diagnosis_Code_5,,Claim Level,Varchar,30,S
70,Diagnosis_Code_6,,Claim Level,Varchar,30,S
71,Diagnosis_Code_7,,Claim Level,Varchar,30,S
72,Diagnosis_Code_8,,Claim Level,Varchar,30,S
73,Diagnosis_Code_9,,Claim Level,Varchar,30,S
74,Diagnosis_Code_10,,Claim Level,Varchar,30,S
75,Diagnosis_Code_11,,Claim Level,Varchar,30,S
76,RenderingFacility_Name,2310C.NM103,Claim Level,Varchar,60,S
77,RenderingFacility_StreetAddress,2310C.N301,Claim Level,Varchar,55,S
78,RenderingFacility_CityName,2310C.N401,Claim Level,Varchar,30,S
79,RenderingFacility_StateCode,2310C.N402,Claim Level,Varchar,2,S
80,RenderingFacility_PostalCode,2310C.N403,Claim Level,Varchar,15,S
81,Referring_Practitioner_Name,2310A.NM103,Claim Level,Varchar,130,S
82,Referring_Practitioner_FirstName,2310A.NM103,Claim Level,Varchar,35,S
83,Referring_Practitioner_LastName,2310A.NM104,Claim Level,Varchar,60,S
84,Referring_Practitioner_MiddleName,2310A.NM105,Claim Level,Varchar,25,S
85,Referring_Practitioner_Suffix,2310A.NM107,Claim Level,Varchar,10,S
86,Referring_Practitioner_Identification,2310A.REF02,Claim Level,Varchar,50,S
87,Referring_IdQualifier,2310A.REF01,Claim Level,Varchar,3,S
88,Referring_ReferralNumber,2300.REF02,Claim Level,Varchar,50,S
89,Referring_npi,2310A.NM109,Claim Level,Varchar,80,S
90,Charged_Amount,2300.CLM02,Claim Level,Varchar,18,S
91,Number_of_service_lines,2400.LX01,Claim Level,Varchar,6,S
92,Placeofservice_Code,,Claim Level,Varchar,2,S
93,Original_Line_Number,,Line Level,Varchar,6,S
94,Start_Date,,Line Level,Varchar,10,S
95,End_Date,,Line Level,Varchar,10,S
96,Service_Line_POS,2400.SV105,Line Level,Varchar,2,S
97,Service_Line_ServiceCode,2400.SV101.02,Line Level,Varchar,48,S
98,Service_Line_ServiceFee,,Line Level,Varchar,18,S
99,Service_Line_ServiceUnitCount,,Line Level,Varchar,15,S
100,Service_Line_ServiceMinuteCount,,Line Level,Varchar,15,S
101,Service_Line_RenderingProviderFirstName,2420A.NM103,Line Level,Varchar,35,S
102,Service_Line_RenderingProviderLastName,,Line Level,Varchar,60,S
103,Service_Line_OtherRenderingProviderId,,Line Level,Varchar,50,S
104,Service_Line_RenderingPractitionerSpecialty,2420A.PRV03,Line Level,Varchar,50,S
105,Line_Supervising_Physician_FirstName,,Line Level,Varchar,35,S
106,Line_Supervising_Physician_LastName,,Line Level,Varchar,60,S
107,Line_Ordering_Physician_FirstName,,Line Level,Varchar,35,S
108,Line_Ordering_Physician_LastName,,Line Level,Varchar,60,S
109,Diagnosis_Code_Pointer_1,,Line Level,Varchar,2,S
110,Diagnosis_Code_Pointer_2,,Line Level,Varchar,2,S
111,Diagnosis_Code_Pointer_3,,Line Level,Varchar,2,S
112,Diagnosis_Code_Pointer_4,2400.SV107.01,Line Level,Varchar,2,S
113,Service_Line_Modifier_1,,Line Level,Varchar,2,S
114,Service_Line_Modifier_2,,Line Level,Varchar,2,S
115,Service_Line_Modifier_3,,Line Level,Varchar,2,S
116,Service_Line_Modifier_4,,Line Level,Varchar,2,S
117,End_of_record,,Claim Level/Line Level,Varchar,3,S
```

## QA Automation/EdifecsProduct_MappingSpec_QA Automation_837P_EDI_to_CSVConversion_V1.0.xlsx — Sample CSV

```csv
Claimid,Scenarios,EdiFilename,totalClaimCount,SenderId,ReceiverId,Receipt_Date,Entry_Date,Clean_Claim_Date,Claim_Delivery_Type,Payee_Type_Field,Frequency_Code,Clearing_House_Trace_Number,External_Batch_Sequence_Number,Benefit_Plan_Type,TradingPartnerId,Claim_Source,claim_Payor_Type,Claim_Filing_Code,Attachment_Set_ID,Claim_Number,Submitted_Subscriber_Id,Subscriber_Identification_Number,Subscriber_Name,Subscriber_Last_Name,Subscriber_First_Name,Subscriber_Middle_Name,Subscriber_Street_Address,Subscriber_City_Name,Subscriber_State_Code,Subscriber_Postal_Code,Subscriber_Gender_Code,Subscriber_Date_Of_Birth,Benefit_Assignment,Member_Identification_Number,Member_Name,Member_Last_Name,Member_First_Name,Member_Street_Address,Member_City_Name,Member_State_Code,Member_Postal_Code,Member_Gender_Code,Member_DateOfBirth,Submitter_Id,Submitter_Name,Relationship_To_Subscriber_Code,Account_Number,Release_Authorization,Assignment_Acceptance,Supplier_Billing_Name,Tax_Identification_Number,Tax_Id_Code,Supplier_Street_Address,Supplier_City_Name,Supplier_State_Code,Supplier_Postal_Code,Phone_Country_Code,Phone_Area_Code,Phone_Number,Supplier_Npi,Supplier_PIN_Number,Additional_Code,Principal_Diagnosis_Code,Diagnosis_Code_1,Diagnosis_Code_2,Diagnosis_Code_3,Diagnosis_Code_4,Diagnosis_Code_5,Diagnosis_Code_6,Diagnosis_Code_7,Diagnosis_Code_8,Diagnosis_Code_9,Diagnosis_Code_10,Diagnosis_Code_11,RenderingFacility_Name,RenderingFacility_StreetAddress,RenderingFacility_CityName,RenderingFacility_StateCode,RenderingFacility_PostalCode,Referring_Practitioner_Name,Referring_Practitioner_FirstName,Referring_Practitioner_LastName,Referring_Practitioner_MiddleName,Referring_Practitioner_Suffix,Referring_Practitioner_Identification,Referring_IdQualifier,Referring_ReferralNumber,Referring_npi,ChargedAmount,Number_of_service_lines,Placeofservice_Code,Original_Line_Number,Start_Date,End_Date,Service_Line_POS,Service_Line_ServiceCode,Service_Line_ServiceFee,Service_Line_ServiceUnitCount,Service_Line_ServiceMinuteCount,Service_Line_RenderingProviderFirstName,Service_Line_RenderingProviderLastName,Service_Line_OtherRenderingProviderId,Service_Line_RenderingPractitionerSpecialty,Line_Supervising_Physician_FirstName,Line_Supervising_Physician_LastName,Line_Ordering_Physician_FirstName,Line_Ordering_Physician_LastName,Diagnosis_Code_Pointer_1,Diagnosis_Code_Pointer_2,Diagnosis_Code_Pointer_3,Diagnosis_Code_Pointer_4,Service_Line_Modifier_1,Service_Line_Modifier_2,Service_Line_Modifier_3,Service_Line_Modifier_4,End_of_record
PROF1,"Create Scenario (Final Status)
Single line Claim",Proclaim1083110176.xml,1,1,1,2023-04-28,2021-12-25T11:15:27,2023-04-28,E,Supplier,1,2011349153671320000,0,1,TP0001,Unknown,1,MA,null,Dynamic,M000005794,M000005794-01,"Amal, Julieet",Amal,Julieet,,1769 Main St,Greeley,CO,80639,M,1983-04-30,Y,M000005794-01,"Amal, Julieet",Amal,Julieet,1769 Main St,Greeley,CO,80639,M,1983-04-30,M000005794-01,"Amal, Julieet",Self,121212121,Y,Y,Supplier_Clinic,99-9999999,EI,2050 E Osceola,Kissimmee,FL,34743,,,6171231234,1801943754,,261QM1300X,J30.89,,,,,,,,,,,,Supplier_Clinic,2050 E Osceola,Kissimmee,FL,34743,Paul Aguillon,Paul,Aguillon,J,Sr,P00000299,G2,13579,1275813552,,1,21,,,,,,,,,,,,,,,,,,,,,,,,,EOR
PROF1,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,"$1,000.00",,,1,2023-04-28,2023-04-28,11,99214,1000,1,,Test,Practitioner 2,P00007508,,Paul,Aguillon,Paul,Aguillon,1,1,1,1,GT,GT,GT,GT,EOR
PROF2,Final to Replacement Claim,Proclaim1083110176.xml,1,1,1,2023-04-28,2021-12-25T11:15:27,2023-04-28,E,Supplier,1,2011349153671320000,0,1,TP0001,Unknown,1,MA,null,Dynamic,M000005979,M000005979-01,"Gilliam, Zeus",Gilliam,Zeus,,919 Farrell Terrace,Greeley,CO,80639,M,1981-04-30,Y,M000005979-01,"Gilliam, Zeus",Gilliam,Zeus,919 Farrell Terrace,Greeley,CO,80639,M,1981-04-30,M000005979-01,"Gilliam, Zeus",Self,121212121,Y,Y,Supplier_Clinic,99-9999999,EI,2050 E Osceola,Kissimmee,FL,34743,,,6171231234,1801943754,,261QM1300X,J30.89,,,,,,,,,,,,Supplier_Clinic,2050 E Osceola,Kissimmee,FL,34743,Paul Aguillon,Paul,Aguillon,J,Sr,P00000299,G2,13579,1275813552,,1,,,,,,,,,,,,,,,,,,,,,,,,,,EOR
PROF2,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,1,2023-04-28,2023-04-28,11,99214,1000,1,,Test,Practitioner 2,P00007508,,Paul,Aguillon,Paul,Aguillon,1,1,1,1,GT,GT,GT,,EOR
PROF3,"Duplicate Status-
Single line claim",Proclaim1083110176.xml,1,1,1,2023-04-28,2021-12-25T11:15:27,2023-04-28,E,Supplier,1,2011349153671320000,0,1,TP0001,Unknown,1,MA,null,Dynamic,M000005995,M000005995-01,"Benton, Eve",Benton,Eve,,391 Barbera Pines,Greeley,CO,80639,M,1981-04-30,Y,M000005995-01,"Benton, Eve",Benton,Eve,391 Barbera Pines,Greeley,CO,80639,M,1981-04-30,M000005995-01,"Benton, Eve",Self,121212121,Y,Y,Supplier_Clinic,99-9999999,EI,2050 E Osceola,Kissimmee,FL,34743,,,6171231234,1801943754,,261QM1300X,J30.89,,,,,,,,,,,,Supplier_Clinic,2050 E Osceola,Kissimmee,FL,34743,Paul Aguillon,Paul,Aguillon,J,Sr,P00000299,G2,13579,1275813552,,1,,,,,,,,,,,,,,,,,,,,,,,,,,EOR
PROF3,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,"$1,000.00",,,1,2023-04-28,2023-04-28,11,99212,1000,1,,Test,Practitioner 2,P00007508,,Paul,Aguillon,Paul,Aguillon,1,1,1,1,GT,GT,GT,,EOR
PROF4,"Create Scenario (Final Status)
Multiple line Claim",Proclaim1083110176.xml,1,1,1,2023-04-28,2021-12-25T11:15:27,2023-04-28,E,Supplier,1,2011349153671320000,0,1,TP0001,Unknown,1,MA,null,Dynamic,MEM005,MEM005-01,"KANNAN, JOSY",KANNAN,JOSY,,PO Box 1230,Blakeslee,PA,18610,M,1960-09-05,Y,MEM005-01,"KANNAN, JOSY",KANNAN,JOSY,PO Box 1230,Blakeslee,PA,18610,M,1960-09-05,MEM005-01,"KANNAN, JOSY",Self,121212121,Y,Y,Supplier_Clinic,99-9999999,EI,2050 E Osceola,Kissimmee,FL,34743,,,6171231234,1801943754,,261QM1300X,J30.89,,,,,,,,,,,,Supplier_Clinic,2050 E Osceola,Kissimmee,FL,34743,Paul Aguillon,Paul,Aguillon,J,Sr,P00000299,G2,13579,1275813552,,3,,,,,,,,,,,,,,,,,,,,,,,,,,EOR
PROF4,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,1,2023-04-28,2023-04-28,11,99212,1000,1,,Test,Practitioner 2,P00007508,,Paul,Aguillon,Paul,Aguillon,1,1,1,1,GT,GT,GT,,EOR
PROF4,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,2,2023-04-28,2023-04-28,11,99213,1000,1,,Test,Practitioner 2,P00007508,,Paul,Aguillon,Paul,Aguillon,1,1,1,1,GT,GT,GT,,EOR
PROF4,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,3,2023-04-28,2023-04-28,11,99214,1000,1,,Test,Practitioner 2,P00007508,,Paul,Aguillon,Paul,Aguillon,1,1,1,1,GT,GT,GT,,EOR
PROF5,High Dollar Claim Scenario,Proclaim1083110176.xml,1,1,1,2023-04-28,2021-12-25T11:15:27,2023-04-28,E,Supplier,1,2011349153671320000,0,1,TP0001,Unknown,1,MA,null,Dynamic,M000005948,M000005948-01,"Kirkm, Quinn",Kirkm,Quinn,,176 Hessel Rue,Greeley,CO,80639,M,1981-04-30,Y,M000005948-01,"Kirkm, Quinn",Kirkm,Quinn,176 Hessel Rue,Greeley,CO,80639,M,1981-04-30,M000005948-01,"Kirkm, Quinn",Self,121212121,Y,Y,Supplier_Clinic,99-9999999,EI,2050 E Osceola,Kissimmee,FL,34743,,,6171231234,1801943754,,261QM1300X,J30.89,,,,,,,,,,,,Supplier_Clinic,2050 E Osceola,Kissimmee,FL,34743,Paul Aguillon,Paul,Aguillon,J,Sr,P00000299,G2,13579,1275813552,,1,,,,,,,,,,,,,,,,,,,,,,,,,,EOR
PROF5,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,1,2023-04-28,2023-04-28,11,99212,50000,1,,Test,Practitioner 2,P00007508,,Paul,Aguillon,Paul,Aguillon,1,1,1,1,GT,GT,GT,,EOR
PROF6,Workbasket Scenario,Proclaim1083110176.xml,1,1,1,2023-04-28,2021-12-25T11:15:27,2023-04-28,E,Supplier,1,2011349153671320000,0,1,TP0001,Unknown,1,MA,null,Dynamic,M000005956,M000005956-01,"Doyle, Valentine",Doyle,Valentine,,4427 Batz Point,Greeley,CO,80639,M,1981-04-30,Y,M000005956-01,"Doyle, Valentine",Doyle,Valentine,4427 Batz Point,Greeley,CO,80639,M,1981-04-30,M000005956-01,"Doyle, Valentine",Self,121212121,Y,Y,Supplier_Clinic,99-9999999,EI,2050 E Osceola,Kissimmee,FL,34743,,,6171231234,1801943754,,261QM1300X,J30.89,,,,,,,,,,,,Supplier_Clinic,2050 E Osceola,Kissimmee,FL,34743,Paul Aguillon,Paul,Aguillon,J,Sr,P00000299,G2,13579,1275813552,,1,,,,,,,,,,,,,,,,,,,,,,,,,,EOR
PROF6,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,1,2023-04-28,2023-04-28,,99212,1000,1,,Test,Practitioner 2,P00007508,,Paul,Aguillon,Paul,Aguillon,1,1,1,1,GT,GT,GT,,EOR
PROF7,Rejected Claim,Proclaim1083110176.xml,1,1,1,2023-04-28,2021-12-25T11:15:27,2023-04-28,E,Supplier,1,2011349153671320000,0,1,TP0001,Unknown,1,MA,null,Dynamic,M000005996,M000005996-01,"Allison, Samson",Allison,Samson,,8768 Lynnette Route,Greeley,CO,80639,M,1981-04-30,Y,M000005996-01,"Allison, Samson",Allison,Samson,8768 Lynnette Route,Greeley,CO,80639,M,1981-04-30,M000005996-01,"Allison, Samson",Self,121212121,Y,Y,Supplier_Clinic12345,99-0000000,EI,2050 E Osceola,Kissimmee,FL,34743,,,6171231234,1801943754,,261QM1300X,J30.89,,,,,,,,,,,,Supplier_Clinic,2050 E Osceola,Kissimmee,FL,34743,Paul Aguillon,Paul,Aguillon,J,Sr,P00000299,G2,13579,1275813552,,1,,,,,,,,,,,,,,,,,,,,,,,,,,EOR
PROF7,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,1,2023-04-28,2023-04-28,11,99212,1000,1,,Test,Practitioner 2,P00007508,,Paul,Aguillon,Paul,Aguillon,1,1,1,1,GT,GT,GT,,EOR
PROF8,Claim Attachment validation,Proclaim1083110176.xml,1,1,1,2023-04-28,2021-12-25T11:15:27,2023-04-28,E,Supplier,1,2011349153671320000,0,1,TP0001,Unknown,1,MA,www.google.com,Dynamic,M000006063,M000006063-01,"Jerde, Lexie",Jerde,Lexie,,3650 Steuber Garden,Greeley,CO,80639,M,1981-04-30,Y,M000006063-01,"Jerde, Lexie",Jerde,Lexie,3650 Steuber Garden,Greeley,CO,80639,M,1981-04-30,M000006063-01,"Jerde, Lexie",Self,121212121,Y,Y,Supplier_Clinic,99-9999999,EI,2050 E Osceola,Kissimmee,FL,34743,,,6171231234,1801943754,,261QM1300X,J30.89,,,,,,,,,,,,Supplier_Clinic,2050 E Osceola,Kissimmee,FL,34743,Paul Aguillon,Paul,Aguillon,J,Sr,P00000299,G2,13579,1275813552,,Attachment_Claim,,,,,,,,,,,,,,,,,,,,,,,,,,EOR
PROF8,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,"$1,000.00",,,1,2023-04-28,2023-04-28,11,99212,1000,1,,Test,Practitioner 2,P00007508,,Paul,Aguillon,Paul,Aguillon,1,1,1,1,GT,GT,GT,,EOR
,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,EOR
```

## QA Automation/EdifecsProduct_MappingSpec_QA Automation_837P_EDI_to_CSVConversion_V1.0.xlsx — 837P

```csv
EDILoopID. Segment,EDI Data Element Name,EDI Element Description,Usage,Enumeration Values,Sample values,CSV Field,Claim/Line Level Record,Mapping Logic
"For each claim record  in the IB EDI 837P file, there should be
             1) a claim level record and
              2) line level records corresponding to each line of the claim
           in the CSV file.",,,,,,,,
ISA (Interchange Control Header Segment),,,,,,,,
ISA,Segment: Interchange Control Header,,R,,,,,
ISA01,Authorization Information Qualifier,Code identifying the type of information in the Authorization Information,R,00 : No Authorization Information Present,,,,
ISA02,Authorization Information,,R,Blank (10 spaces),,,,
ISA03,Security Information Qualifier,Code identifying the type of information in the Security Information,R,00 : No Security Information Present,,,,
ISA04,Security Information,Augsep@2023,R,Blank (10 spaces),,,,
ISA05,Interchange ID Qualifier,"Code indicating the system/method of code structure used to designate the
sender or receiver ID element being qualified",R,ZZ : Mutually Defined,,,,
ISA06,Interchange Sender ID,Sender ID,R,<Sender ID>,,TradingPartnerId,Claim Level,
,,,,,,SenderId,Claim Level,
ISA07,Interchange ID Qualifier,"Code indicating the system/method of code structure used to designate the
sender or receiver ID element being qualified",R,ZZ : Mutually Defined,,,,
ISA08,Interchange Receiver ID,Receiver Id,R,<Receiver ID>,,ReceiverId,Claim Level,
ISA09,Interchange Date,Date of the interchange,R,SysDate (YYMMDD),Example : 210630,,,
ISA10,Interchange Time,Time of the interchange,R,SysTime (HHMM),Example : 1732,,,
ISA11,Interchange Control Standards Identifier,,R,^,,,,
ISA12,Interchange Control Version Number,Code specifying the version number of the interchange control segments,R,00501,,,,
ISA13,Interchange Control Number,A control number assigned by the interchange sender,R,,Example : 319003402,,,
ISA14,Acknowledgment Requested,Code indicating sender’s request for an interchange acknowledgment,R,"0 : No Interchange Acknowledgement Requested
1 : Interchange Acknowledgment Requested",,,,
ISA15,Usage Identifier,"Code indicating whether data enclosed by this interchange envelope is test,
production or information",R,P : Production Data T : Test,,,,
ISA16,Component Element Separator,The delimiter used to separate component data elements,R,": = Element separator
~ = Segment Terminator",,,,
GS (Functional Group Header),,,,,,,,
GS,Segment: Functional Group Header,,R,,,,,
GS01,Functional Identifier Code,The two-character identifier Code for the transaction set included.,R,HC : Health Care Claim (837),,,,
GS02,Application Senders Code,"Code identifying party sending transmission,  codes agreed to by trading partners
This is Submitter-specific.",R,<Sender ID>,,,,
GS03,Application Receivers Code,Code identifying party receiving transmission; codes agreed to by trading partners,R,<HealthPlan ID>/,,,,
GS04,Date,Date the Group Header is created.,R,SysDate (YYYYMMDD),Example : 210630,,,
GS05,Time,Time the Group Header is created.,R,SysTime (HHMM),Example : 1732,,,
GS06,Group Control Number,Submitter-specific number.,R,<Group Control Number>,319003402,,,
GS07,Responsible Agency Code,Code identifying the issuer of the EDI standard being used.,R,X : Accredited Standards Committee X12,,,,
GS08,Version/Release/Industry Identifier Code,"Code indicating the version, release, subrelease, and industry identifier of the EDI
standard being used,
ST03 and GS08 must be identical",R,005010X222A1,,,,
ST (Transaction Set Header),,,,,,,,
ST,Segment: Transaction Set Header,,R,,,,,
ST01,Transaction Set Identifier Code,Code uniquely identifying a Transaction Set,R,837 : Health Care Claim,,,,
ST02,Transaction Set Control Number,Unique Sequential Number Assigned by Internal Processes for each Transaction Set. Starts from 001 and increments with each transaction set,R,"<Transaction set Control Number>
Starts from 001 and increments with each transaction set",319003402,External_Batch_Sequence_Number,Claim Level,
ST03,Implementation Convention Reference,Standards Approved by ACS X12 Review Board.                 ST03 and GS08 must be identical,R,005010X222A1,,,,
BHT,Segment: Beginning Of Hierarchical Transaction,,R,,,,,
BHT01,Hierarchical Structure Code,Code indicating the hierarchical application structure of a transaction set,R,"0019 : Information Source, Subscriber, Dependent",,,,
BHT02,Transaction Set Purpose Code,"Code identifying purpose of transaction set.  Used to convey the electronic transmission status of
the 837 batch",R,"00 : Original
18 : Reissue",,,,
BHT03,Reference Identification,Reference information as defined for a particular Transaction Set,R,<Originator Application Transaction Identifier>,319003402,,,
BHT04,Date,The date the transaction was created,R,SysDate (YYYYMMDD),20210630,Clean_Claim_Date,Claim Level,Format : YYYY-MM-DD
,,,,,,Receipt_Date,Claim Level,Format : YYYY-MM-DD
BHT05,Time,The time the transaction was created,R,SysTime (HHMMSS),173250,,,
BHT06,Transaction Type Code,Code specifying the type of transaction,R,"CH- Chargeable
RP- Reporting",,,,
Loop 1000A — SUBMITTER NAME (Required)  Loop Repeat: 1,,,,,,,,
NM1,Segment NM1 - Submitter Name  (Required),,R,,,,,
1000A.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,41 : Submitter,,,,
1000A.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,"1 : Person
2 : Non-person Entity",,,,
1000A.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,Submitter_Name,Claim Level,
1000A.NM104,Name First,Individual first name,S,,,,,
1000A.NM105,Name Middle,Individual middle name or initial,S,,,,,
1000A.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code",R,46 : Electronic Transmitter Identification Number (ETIN,,,,
1000A.NM109,Identification Code,Code identifying a party or other code,R,100X,,Submitter_Id,Claim Level,
PER,Segment PER - Submitter EDI Contact Information,,,,,,,
1000A.PER01,Contact Function Code,Code identifying the major duty or responsibility of the person or group named,R,IC -  Information Contact,,,,
1000A.PER02,Name,Submitter Contact Name,S,<<Submitter Name>>,,,,
1000A.PER03,Communication Number Qualifier,Code identifying the type of communication number,R,"""EM"" : Electronic Mail
""FX"" : Facsimile
""TE"" : Telephone",,,,
1000A.PER04,Communication Number,Complete communications number including country or area code when applicable,R,,,,,
1000A.PER05,Communication Number Qualifier,Code identifying the type of communication number,S,"""EM"" : Electronic Mail
""FX"" : Facsimile
""TE"" : Telephone",,,,
1000A.PER06,Communication Number,Complete communications number including country or area code when applicable,S,,,,,
1000A.PER07,Communication Number Qualifier,Code identifying the type of communication number,S,"""EM"" : Electronic Mail
""FX"" : Facsimile
""TE"" : Telephone",,,,
1000A.PER08,Communication Number,Complete communications number including country or area code when applicable,S,,,,,
Loop 1000B — RECEIVER NAME (Required) Loop Repeat: 1,,,,,,,,
NM1,Segment NM1 - Receiver Name  (Required),,R,,,,,
1000B.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,40 : Receiver,,,,
1000B.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,2 : Non-Person Entity,,,,
1000B.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,,,
1000B.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code",R,46 :  Electronic Transmitter Identification Number (ETIN,,,,
1000B.NM109,Identification Code,Code identifying a party,R,,,,,
Loop 2000A — BILLING PROVIDER HIERARCHICAL LEVEL (Required)  Loop Repeat: >1,,,,,,,,
HL,Segment HL - Billing Provider Hierarchical Level  (Required),,R,,,,,
2000A.HL01,Hierarchical ID Number,"A unique number assigned by the sender to identify a particular data segment in
a hierarchical structure",R,"The first HL01 within each ST-SE envelope must begin with “1”,
and be incremented by one each time an HL is used in the
transaction",,,,
2000A.HL02,Hierarchical Parent ID Number,,R,,,,,
2000A.HL03,Hierarchical Level Code,Code defining the characteristic of a level in a hierarchical structure,R,20 : Information Source,,,,
2000A.HL04,Hierarchical Child Code,"Code indicating if there are hierarchical child data segments subordinate to the
level being described.",R,"1 : Additional Subordinate HL Data Segment in This
Hierarchical Structure.",,,,
PRV,Segment PRV - Billing Provider Specialty Information  (Situational),,,,,,,
2000A.PRV01,Provider Code,Code identifying the type of provider,R,BI : Billing,,,,
2000A.PRV02,Reference Identification Qualifier,Code qualifying the Reference Identification,R,PXC :  Health Care Provider Taxonomy Code,,,,
2000A.PRV03,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,Additional_Code,Claim Level,
CUR,Segment CUR - Foreign Currency Information (Situational),,,,,,,
2000A.CUR01,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,,,,,
2000A.CUR02,Currency Code,Code (Standard ISO) for country in whose currency the charges are specified,R,,,,,
Loop 2010AA - BILLING PROVIDER NAME (Required) Loop Repeat: 1,,,,,,,,
NM1,Segment NM1 - Billing Provider Name (Required),,R,,,,,
2010AA.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,85 :  Billing Provider,,,,
2010AA.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,"1 : Person
2 : Non-Person Entity",,,,
2010AA.NM103,Name Last or Organization Name,Individual last name or organizational name,S,,,Supplier_Billing_Name,Claim Level,
2010AA.NM104,Name First,Individual first name,S,,,,,
2010AA.NM105,Name Middle,Individual middle name or initial,S,,,,,
2010AA.NM107,Name Suffix,Suffix to individual name,S,,,,,
2010AA.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code (67)",S,"XX :  Centers for Medicare and Medicaid Services
National Provider Identifier",,,,
2010AA.NM109,Identification Code,Code identifying a party or other code / Billing Provider Identifier,S,,1477569838,Supplier_Npi,Claim Level,
N3,Segment N3 - Billing Provider Address (Required),,R,,,,,
2010AA.N301,Address Information,Address information,R,,777 BANNOCK ST,Supplier_Street_Address,Claim Level,
2010AA.N302,Address Information,Address information,S,,,,,
N4,"Segment N4 - Billing Provider City, State, ZIP Code (Required)",,R,,,,,
2010AA.N401,City Name,Free-form text for city name,R,,DENVER,Supplier_City_Name,Claim Level,
2010AA.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,CO,Supplier_State_Code,Claim Level,
2010AA.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,802044507,Supplier_Postal_Code,Claim Level,
2010AA.N404,Country Code,Code identifying the country,S,,,,,
2010AA.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,
REF,Segment REF - Billing Provider Tax Identification (Required),,R,,,,,
2010AA.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"EI : Employer’s Identification Number
SY : Social Security Number",,Tax_Id_Code,Claim Level,
2010AA.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,Tax_Identification_Number,Claim Level,"If /837/2000A/2010AA/REF01 (Reference Identification Qualifier) is ‘EI’ then it will be mapped into ‘XX-XXXXXXX’ format to taxIdentificationNumber
If /837/2000A/2010AA/REF01 (Reference Identification Qualifier) is ‘SY’ then it will be mapped into ‘XXX-XX-XXXX’ format to taxIdentificationNumber"
REF,Segment REF - Billing Provider UPIN/License Information (Situational),,,,,,,
2010AA.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"1G  : Provider UPIN Number
0B :  State License Number",,,,
2010AA.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,Supplier_PIN_Number,Claim Level,When REF01=1G
PER,Segment - PER Billing Provider Contact Information (Situational),,,,,,,
2010AA.PER01,Contact Function Code,Code identifying the major duty or responsibility of the person or group name,R,IC -  Information Contact,,,,
2010AA.PER02,Name,Billing Provider Contact Name,S,,,,,
2010AA.PER03,Communication Number Qualifier,Code identifying the type of communication number,R,"""EM"" : Electronic Mail
""FX"" : Facsimile
""TE"" : Telephone",,,,
2010AA.PER04,Communication Number,,R,,,Phone_Country_Code,Claim Level,"2010AA.PER03  = TE

First byte  of 2010AA.PER04 Only If 2010AA.PER04  is 11 bytes"
,,,,,,Phone_Area_Code,Claim Level,"2010AA.PER03  = TE

2nd, 3rd, 4th bytes  if  2010AA.PER04  is 11 bytes

First 3 bytes If 2010AA.PER04  is 10 bytes"
,,,,,,Phone_Number,Claim Level,"2010AA.PER03  = TE

last 7 bytes of 2010AA.PER04"
2010AA.PER05,Communication Number Qualifier,Code identifying the type of communication numbe,S,"""EM"" : Electronic Mail
""FX"" : Facsimile
""TE"" : Telephone
""EX"" : Telephone Extension",,,,
2010AA.PER06,Communication Number,Communication Number,S,,,,,
2010AA.PER07,Communication Number Qualifier,Code identifying the type of communication number,S,,,,,
2010AA.PER08,Communication Number,,S,,,,,
Loop 2010AB - PAY-TO ADDRESS NAME (Situational)  Loop Repeat: 1,,,,,,,,
NM1,Segment - NM1 Pay-to Address Name (Situational),,,,,,,
2010AB.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,87: Pay-to Provider,,,,
2010AB.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,"1 : Person
2:  Non-Person Entity",,,,
N3,Segment - N3 Pay-to Address - ADDRESS (Required),,R,,,,,
2010AB.N301,Address Information,Address Information,R,,PO BOX 677931,,,
2010AB.N302,Address Information,Address Information,S,,,,,
N4,"Segment - N4 Pay-To Address City, State, ZIP Code (Required)",,R,,,,,
2010AB.N401,City Name,Free-form text for city name,R,,DALLAS,,,
2010AB.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,TX,,,
2010AB.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,752677931,,,
2010AB.N404,Country Code,Code identifying the country,S,,,,,
2010AB.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,
Loop 2010AC - — PAY-TO PLAN NAME  (Situational)   Loop Repeat: 1,,,,,,,,
NM1,Segment - NM1 Pay-To Plan Name (Situational),,,,,,,
2010AC.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,PE : Payee,,,,
2010AC.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,2 : Non-Person Entity,,,,
2010AC.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,,,
2010AC.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code (67),R,,,,,
2010AC.NM109,Identification Code,Code identifying a party or other code,R,,,,,
N3,Segment - N3 Pay-to Plan Address (Required),,R,,,,,
2010AC.N301,Address Information,Address Information,R,,,,,
2010AC.N302,Address Information,Address Information,S,,,,,
N4,"Segment - N4 Pay-To Plan City, State, ZIP Code (Required)",,R,,,,,
2010AC.N401,City Name,Free-form text for city name,R,,,,,
2010AC.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,,,
2010AC.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,,,,
2010AC.N404,Country Code,Code identifying the country,S,,,,,
2010AC.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,
REF,Segment - REF Pay-to Plan Secondary Identification (Required),,R,,,,,
2010AC.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,,,,,
2010AC.REF02,Reference Identification,"Reference information as specified
by the Reference Identification Qualifier",R,,,,,
REF,Segment - REF Pay-To Plan Tax Identification Number (Required),,R,,,,,
2010AC.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,EI : Employer’s Identification Number,,,,
2010AC.REF02,Reference Identification,"Reference information as specified
by the Reference Identification Qualifier",R,,,,,
Loop 2000B — SUBSCRIBER HIERARCHICAL LEVEL  (Required)  Loop Repeat: >1,,,,,,,,
HL,Segment - HL Subscriber Hierarchical Level (Required),,,,,,,
2000B.HL01,Hierarchical ID Number,"A unique number assigned by the sender to identify a particular data segment in
a hierarchical structure",R,"2000A.HL01 + 1

Incremented at each new HL segment.",,,,
2000B.HL02,Hierarchical Parent ID Number,"Identification number of the next higher hierarchical data segment that the data
segment being described is subordinate to",R,2000A.HL01,,,,
2000B.HL03,Hierarchical Level Code,Code defining the characteristic of a level in a hierarchical structure,R,22 - Subscriber,,,,
2000B.HL04,Hierarchical Child Code,"Code indicating if there are hierarchical child data segments subordinate to the
level being described.",R,"0 :  HL04 has no subordinate levels  (the subscriber is the patient and there are no dependent claims)
1: HL04 has subordinate levels",,,,
SBR,Segment - SBR Subscriber Information (Required),,,,,,,
2000B.SBR01,Payer Responsibility Sequence Number Code,"Code identifying the insurance carrier’s level of responsibility for a payment of a
claim",R,"P : Primary
S : Secondary
T  : Tertiary",,,,
2000B.SBR02,Individual Relationship Code,Code indicating the relationship between two individuals or entities,S,18 : Self,,Relationship_To_Subscriber_Code,Claim Level,If 2000C loop does not exist.
2000B.SBR03,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,S,,,,,
2000B.SBR04,Name,,S,,,,,
2000B.SBR05,Insurance Type Code,Code identifying the type of insurance policy within a specific insurance program,S,"12 :  Medicare Secondary Working Aged Beneficiary or
Spouse with Employer Group Health Plan
13 : Medicare Secondary End-Stage Renal Disease
Beneficiary in the Mandated Coordination Period
with an Employer’s Group Health Plan
14 : Medicare Secondary, No-fault Insurance including
Auto is Primary
15 : Medicare Secondary Worker’s Compensation
16 : Medicare Secondary Public Health Service (PHS)or
Other Federal Agency
41 : Medicare Secondary Black Lung
42 : Medicare Secondary Veteran’s Administration
43 : Medicare Secondary Disabled Beneficiary Under
Age 65 with Large Group Health Plan (LGHP)
47 : Medicare Secondary, Other Liability Insurance",,,,
2000B.SBR09,Claim Filing Indicator Code,,S,"11 : Other Non-Federal Programs
12 : Preferred Provider Organization (PPO)
13 : Point of Service (POS)
14 : Exclusive Provider Organization (EPO)
15 : Indemnity Insurance
16 : Health Maintenance Organization (HMO) Medicare
Risk
17 : Dental Maintenance Organization
AM :  Automobile Medical
BL :  Blue Cross/Blue Shield
CH :  Champus
CI :  Commercial Insurance Co.
DS :  Disability
FI :  Federal Employees Program
HM :  Health Maintenance Organization
LM :  Liability Medical
MA :  Medicare Part A
MB :  Medicare Part B
MC :  Medicaid
OF :  Other Federal Program
1484 Use code OF when submitting Medicare Part D
claims.
TV Title V
VA Veterans Affairs Plan
WC Workers’ Compensation Health Claim
ZZ Mutually Defined
71 Use Code ZZ when Type of Insurance is not known.",,Claim_Filing_Code,Claim Level,
PAT,Segment - PAT Patient Information (Situational),,,,,,,
2000B.PAT05,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",S,D8 : Date Expressed in Format CCYYMMDD,,,,
2000B.PAT06,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times / Patient Death Date",S,,,,,
2000B.PAT07,Unit or Basis for Measurement Code,"Code specifying the units in which a value is being expressed, or manner in which
a measurement has been taken",S,01 : Actual Pounds,,,,
2000B.PAT08,Weight,Numeric value of weight,S,,,,,
2000B.PAT09,Yes/No Condition or Response Code,Code indicating  whether the patient is pregnant or not pregnant.,S,Y :Yes,,,,
Loop2010BA — SUBSCRIBER NAME (Required) Loop Repeat: 1,,,S,,,,,
NM1,Segment - NM1 Subscriber Name (Required),,,,,,,
2010BA.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,IL :  Insured or Subscriber,,,,
2010BA.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,"1 : Person
2 : Non-Person Entity",,,,
2010BA.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,Subscriber_Name,Claim Level,Subscriber's full name concatenate NM104/5/3/7 (First Middle Last Suffix)
,,,,,,Member_Name,Claim Level,"Only if 2000C loop doesn’t exists.

 concatenate NM104/5/3/7 (First Middle Last Suffix)"
,,Individual last name or organizational name,R,,,Subscriber_Last_Name,Claim Level,
,,,,,,Member_Last_Name,Claim Level,Only if 2000C loop doesn’t exists.
2010BA.NM104,Name First,Individual first name,S,,,Subscriber_First_Name,Claim Level,
,,,,,,Member_First_Name,Claim Level,Only if 2000C loop doesn’t exists.
2010BA.NM105,Name Middle,Individual middle name or initial,S,,,Subscriber_Middle_Name,Claim Level,
2010BA.NM107,Name Suffix,Suffix to individual name,S,,,,,
2010BA.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code",S,"II :  Standard Unique Health Identifier for each Individual in the United States
MI  :  Member Identification Number",,,,
2010BA.NM109,,,,,,Subscriber_Identification_Number,Claim Level,Remove all special characters including space and map only the alphanumeric characters
,,,,,,Member_Identification_Number,Claim Level,"Only if 2000C loop doesn’t exists.

Remove all special characters including space and map only the alphanumeric characters."
,Identification Code,Code identifying a party or other code / Subscriber Primary Identifier,S,,,"Submitted_Subscriber_Id,",Claim Level,Remove all special characters including space and map only the alphanumeric characters
N3,Segment - N3 Subscriber Address (Situational),,,,,,,
2010BA.N301,Address Information,Address Information,R,,4600 W 9TH AVE UNIT 216,Subscriber_Street_Address,Claim Level,
,,,,,,Member_Street_Address,Claim Level,Only if 2000C loop doesn’t exists.
2010BA.N302,Address Information,Address Information,S,,,,,
N4,"Segment - N4 Subscriber City, State, ZIP Code (Situational)",,,,,,,
2010BA.N401,City Name,Free-form text for city name,R,,DENVER,Subscriber_City_Name,Claim Level,
,,,,,,Member_City_Name,Claim Level,Only if 2000C loop doesn’t exists.
2010BA.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,CO,Subscriber_State_Code,Claim Level,
,,,,,,Member_State_Code,Claim Level,Only if 2000C loop doesn’t exists.
2010BA.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,802042991,Subscriber_Postal_Code,Claim Level,
,,,,,,Member_Postal_Code,Claim Level,Only if 2000C loop doesn’t exists.
2010BA.N404,Country Code,Code identifying the country,S,,,,,
2010BA.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,
DMG,Segment - DMG Subscriber Demographic Information (Situational),,,,,,,
2010BA.DMG01,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 :  Date Expressed in Format CCYYMMDD,,,,
2010BA.DMG02,Date Time Period,Date Time Period,R,,19471120,Subscriber_Date_Of_Birth,Claim Level,Format : YYYY-MM-DD
,,,,,,Member_DateOfBirth,Claim Level,"Only if 2000C loop doesn’t exists.

Format : DD-MM-YYYY"
2010BA.DMG03,Gender Code,Code indicating the sex of the individual,R,"F : Female
M : Male",,Subscriber_Gender_Code,Claim Level,
,,,,,,Member_Gender_Code,Claim Level,Only if 2000C loop doesn’t exists.
REF,Segment - REF Subscriber Secondary Identification (Situational),,,,,,,
2010BA.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,SY:Social Security Number,,,,
2010BA.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier /: Subscriber Supplemental Identifier,R,,,,,
REF,Segment - REF Property and Casualty Claim Number (Situational),,,,,,,
2010BA.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,Y4: Agency Claim Number,,,,
2010BA.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier / Property Casualty Claim Number,R,,,,,
PER,Segment - PER Property and Casualty Subscriber Contact Information (Situational),,,,,,,
2010BA.PER01,Contact Function Code,Code identifying the major duty or responsibility of the person or group named,R,IC : Information Contact,,,,
2010BA.PER02,Name,,S,,,,,
2010BA.PER03,Communication Number Qualifier,Code identifying the type of communication number,R,TE :  Telephone,,,,
2010BA.PER04,Communication Number,,R,,,,,
2010BA.PER05,Communication Number Qualifier,Code identifying the type of communication number,S,EX :  Telephone Extension,,,,
2010BA.PER06,Communication Number,,S,,,,,
Loop 2010BB  — PAYER NAME (Required)  Loop Repeat: 1,,,,,,,,
NM1,Segment - NM1 Payer Name (Required),,,,,,,
2010BB.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,PR : Payer,,,,
2010BB.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,2 : Non-Person Entity,,,,
2010BB.NM103,Name Last or Organization Name,,R,,,,,
2010BB.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code",R,"PI :  Payor Identification
XV : Centers for Medicare and Medicaid Services PlanID",,,,
2010BB.NM109,Identification Code,Code identifying a party or other code / Payer Identifier,R,,,,,
N3,Segment - N3 Payer Address (Situational),,,,,,,
2010BB.N301,Address Information,Address Information,R,,,,,
2010BB.N302,Address Information,Address Information,S,,,,,
N4,"Segment - N4 Payer City, State, ZIP Code (Situational)",,,,,,,
2010BB.N401,City Name,Free-form text for city name,R,,,,,
2010BB.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,,,
2010BB.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,,,,
2010BB.N404,Country Code,Code identifying the country,S,,,,,
2010BB.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,
REF,Segment - REF Payer Secondary Identification (Situational),,,,,,,
2010BB.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"2U : Payer Identification Number
EI :  Employer’s Identification Number",,,,
2010BB.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,
REF,Segment - REF Billing Provider Secondary Identification (Situational),,,,,,,
2010BB.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,,,,,
2010BB.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,
"Loop 2000C - Patient Hierarchical Level (Situational)   Loop Repeat: >1
                In case of dependent claims (if  dependant is the patient ), Loop ID-2000C and Loop ID-2010CA are sent.
                When subscriber is the patient, Loop ID-2000C and Loop ID-2010CA are not sent.",,,,,,,,
NM1,NM1 Patient Name (Required),,,,,,,
2000C.HL01,Hierarchical ID Number,"A unique number assigned by the sender to identify a particular data segment in
a hierarchical structure",R,,,,,
2000C.HL02,Hierarchical Parent ID Number,"Identification number of the next higher hierarchical data segment that the data
segment being described is subordinate to",R,,,,,
2000C.HL03,Hierarchical Level Code,Code defining the characteristic of a level in a hierarchical structure,R,"23 : Dependent (the information
in this HL applies to the patient when the subscriber
and the patient are not the same person)",,,,
2000C.HL04,Hierarchical Child Code,"Code indicating if there are hierarchical child data segments subordinate to the
level being described",R,"0 :  No Subordinate HL Segment in This Hierarchical
Structure",,,,
PAT,Patient information,,,,,,,
2000C.PAT01,Individual Relationship Code,Code indicating the relationship between two individuals or entities,R,"01 : Spouse
19 : Child
20 : Employee
21 : Unknown
39 : Organ Donor
40:  Cadaver Donor
53:  Life Partner
G8 : Other Relationship",,Relationship_To_Subscriber_Code,Claim Level,
2000C.PAT05,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",S,D8 : Date Expressed in Format CCYYMMDD,,,,
2000C.PAT06,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times / Patient Death Date",S,,,,,
2000C.PAT07,Unit or Basis for Measurement Code,"Code specifying the units in which a value is being expressed, or manner in which
a measurement has been taken",S,01 : Actual Pounds,,,,
2000C.PAT08,Weight,Numeric value of weight,S,,,,,
2000C.PAT09,Yes/No Condition or Response Code,Code indicating  whether the patient is pregnant or not pregnant.,S,Y :Yes,,,,
Loop 2010CA - Patient Name (Situational) Loop Repeat: 1,,,,,,,,
NM1,Patient Name (Required),,,,,,,
2010CA.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,QC : Patient,,,,
2010CA.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,1: Person,,,,
2010CA.NM103,Name Last or Organization Name,Patient Last Name,R,,,Member_Name,Claim Level,concatenate NM104/5/3/7 (First Middle Last Suffix)
,,,,,,Member_Last_Name,Claim Level,
2010CA.NM104,Name First,Patient First Name,S,,,Member_First_Name,Claim Level,
2010CA.NM105,Name Middle,Patient Middle Name or Initial,S,,,,,
2010CA.NM107,Name Suffix,Patient Name Suffix,S,,,,,
N3,Segment - N3 Patient Address (Situational),,,,,,,
2010CA.N301,Address Information,Patient Address Line,R,,,Member_Street_Address,Claim Level,
2010CA.N302,Address Information,Patient Address Line,S,,,,,
N4,"Segment - N4 Patient City, State, ZIP Code (Situational)",,,,,,,
2010CA.N401,City Name,Free-form text for city name,R,,,Member_City_Name,Claim Level,
2010CA.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,Member_State_Code,Claim Level,
2010CA.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks,S,,,Member_Postal_Code,Claim Level,
2010CA.N404,Country Code,Code identifying the country,S,,,,,
2010CA.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,
DMG,Segment - DMG Patient Demographic Information (Situational),,,,,,,
2010CA.DMG01,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 : Date Expressed in Format CCYYMMDD,,,,
2010CA.DMG02,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times/Patient Birth Date",R,,19670712,Member_DateOfBirth,Claim Level,Format : YYYY-MM-DD
2010CA.DMG03,Gender Code,Code indicating the sex of the individual,R,"F: Female
M :Male
U : Unknown",,Member_Gender_Code,Claim Level,
REF,Segment - Property and Casuality Claim Number (Situational),,,,,,,
2010CA.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,Y4 : Agency Claim Number,,,,
2010CA.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,
PER,Segment -Property and Casuality Patient Contact Information (Situational),,,,,,,
2010CA.PER01,Contact Function Code,Code identifying the major duty or responsibility of the person or group named,R,IC :Information Contact,,,,
2010CA.PER02,Name,Free-form name,S,,,,,
2010CA.PER03,Communication Number Qualifier,Code identifying the type of communication number,R,TE :  Telephone,,,,
2010CA.PER04,Communication Number,"Complete communications number including country or area code when
applicable",R,,,,,
2010CA.PER05,Communication Number Qualifier,Code identifying the type of communication number,S,EX : Telephone Extension,,,,
2010CA.PER06,Communication Number,Complete communications number including country or area code when applicable,S,,,,,
"Loop 2300  - CLAIM INFORMATION(Required)  Loop Repeat: 100
       When patient is the subscriber : The claim information(Loop ID-2300), is placed following Loop ID-2010BB in the Subscriber Hierarchical Level(HL) and patient information is sent in Loop ID-2010BA.
       When patient is the dependent :  The claim information(Loop ID-2300),is placed following Loop ID-2010CA  in the Patient HL and the patient information is sent in Loop ID-2010CA .",,,,,,,,
CLM,Segment - CLM Claim information (Situational),,,,,,,
2300.CLM01,Claim Submitter's Identifier,Identifier used to track a claim from creation by the health care provider through payment,R,,,Account_Number,Claim Level,
2300.CLM02,Monetary Amount,Monetary Amount,R,,,Charged_Amount,Claim Level,
2300.CLM05.01,Facility Code Value,"Code identifying where services were, or may be, performed /Place of Service Code",R,,,Placeofservice_Code,Claim Level,
2300.CLM05.02,Facility Code Qualifier,Code identifying the type of facility referenced,R,B :Place of Service Codes for Professional Services,,,,
2300.CLM05.03,Claim Frequency Type Code,Code specifying the frequency of the claim,R,,,Frequency_Code,Claim Level,
2300.CLM06,Yes/No Condition or Response Code,Provider or Supplier Signature Indicator,R,"Y : provider signature is on file
N : provider signature is not on file",,,,
2300.CLM07,Provider Accept Assignment Code,Code indicating whether the provider accepts assignment,R,"A : Assigned
B : Assignment Accepted on Clinical Lab Services Only
C :  Not Assigned",,Assignment_Acceptance,Claim Level,"If 2300.CLM07 = “A”, Map “Y”
Else If 2300.CLM07  = “C”, Map “N”"
2300.CLM08,Yes/No Condition or Response Code,Benefits Assignment Certification Indicator,R,"Y : Yes
N : No
W :  Not Applicable",,Benefit_Assignment,Claim Level,
2300.CLM09,Release of Information Code,"Code indicating whether the provider has on file a signed statement by the patient
authorizing the release of medical data to other organizations",R,"I : Informed Consent  to Release Medical Information for Conditions or Diagnoses
Y :Yes, Provider has a Signed Statement Permitting
Release of Medical Billing Data Related to a Claim",,Release_Authorization,Claim Level,
2300.CLM10,Patient Signature Source Code,"Code indicating how the patient or subscriber authorization signatures were
obtained and how they are being retained by the provider",S,P :  Signature generated by provider because the patient was not physically present for services,,,,
2300.CLM11.01,Related-Causes Code,"Code identifying an accompanying cause of an illness, injury or an accident",R,"AA : Auto Accident
EM : Employment
OA : Other Accident",,,,
2300.CLM11.02,Related-Causes Code,"Code identifying an accompanying cause of an illness, injury or an accident (when more than one related cause code applies)",S,"AA : Auto Accident
EM : Employment
OA : Other Accident",,,,
2300.CLM11.04,State or Province Code,"Code (Standard State/Province) as defined by appropriate government
agency",S,,,,,
2300.CLM11.05,Country Code,Country Code,S,,,,,
2300.CLM12,Special Program Code,,S,,,,,
2300.CLM20,Delay Reason Code,,S,,,,,
DTP,Segment - DTP Date - Onset of Current Illness or Symptom (Situational),,,,,,,
2300.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,431 :Onset of Current Symptoms or Illness,,,,
2300.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 :  Date Expressed in Format CCYYMMDD,,,,
2300.DTP03,Date Time Period,Date Time Period,R,,,,,
DTP,Segment - DTP Date - Initial Treatment Date (Situational),,,,,,,
2300.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,454 : Initial Treatment,,,,
2300.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 :  Date Expressed in Format CCYYMMDD,,,,
2300.DTP03,Date Time Period,Date Time Period,R,,,,,
DTP,Segment - DTP Date - Last Seen Date (Situational),,,,,,,
2300.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,304: Latest Visit or Consultation,,,,
2300.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 :  Date Expressed in Format CCYYMMDD,,,,
2300.DTP03,Date Time Period,Date Time Period,R,,,,,
DTP,Segment - DTP Date - Acute Manifestation (Situational),,,,,,,
2300.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,453: Acute Manifestation of a Chronic Condition,,,,
2300.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 :  Date Expressed in Format CCYYMMDD,,,,
2300.DTP03,Date Time Period,Date Time Period,R,,,,,
DTP,Segment - DTP Date - Accident (Situational),,,,,,,
2300.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,439: Accident,,,,
2300.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 :  Date Expressed in Format CCYYMMDD,,,,
2300.DTP03,Date Time Period,Date Time Period,R,,,,,
DTP,Segment - DTP Date - Last Menstrual Period (Situational),,,,,,,
2300.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,484:  Last Menstrual Period,,,,
2300.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 :  Date Expressed in Format CCYYMMDD,,,,
2300.DTP03,Date Time Period,Date Time Period,R,,,,,
DTP,Segment - DTP Date - Last X-ray Date (Situational),,,,,,,
2300.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,455: Last X-Ray,,,,
2300.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 :  Date Expressed in Format CCYYMMDD,,,,
2300.DTP03,Date Time Period,Date Time Period,R,,,,,
DTP,Segment - DTP Date - Hearing and Vision Prescription Date (Situational),,,,,,,
2300.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,471: Prescription,,,,
2300.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 :  Date Expressed in Format CCYYMMDD,,,,
2300.DTP03,Date Time Period,Date Time Period,R,,,,,
DTP,Segment - DTP Date - Disability Dates (Situational),,,,,,,
2300.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,"314 : Disability ( when both disability start and end date are being reported)
360 :  Initial Disability Period Start (if patient is currently disabled and
disability end date is unknown.)
361 : Initial Disability Period End ( if patient is no longer disabled and the)
start date is unknown",,,,
2300.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,"D8 :  Date Expressed in Format CCYYMMDD
RD8 :  Range of Dates Expressed in Format CCYYMMDDCCYYMMDD",,,,
2300.DTP03,Date Time Period,Date Time Period,R,,,,,
DTP,Segment - DTP Date - Last Worked (Situational),,,,,,,
2300.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,297 : Initial Disability Period Last Day Worked,,,,
2300.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 :  Date Expressed in Format CCYYMMDD,,,,
2300.DTP03,Date Time Period,Date Time Period,R,,,,,
DTP,Segment - DTP Date - Authorized Return to Work (Situational),,,,,,,
2300.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,296 : Initial Disability Period Last Day Worked,,,,
2300.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 :  Date Expressed in Format CCYYMMDD,,,,
2300.DTP03,Date Time Period,Date Time Period,R,,,,,
DTP,Segment - DTP Date - Admission (Situational),,,,,,,
2300.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,435 : Admission,,,,
2300.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 : Date Expressed in Format CCYYMMDD,,,,
2300.DTP03,Date Time Period,Date Time Period,R,,,,,
DTP,Segment - DTP Date - Discharge (Situational),,,,,,,
2300.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,096 : Discharge,,,,
2300.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 : Date Expressed in Format CCYYMMDD,,,,
2300.DTP03,Date Time Period,Date Time Period,R,,,,,
DTP,Segment - DTP Date - Assumed and Relinquished Care Dates (Situational),,,,,,,
2300.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,090 :  Report Start,,,,
2300.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 : Date Expressed in Format CCYYMMDD,,,,
2300.DTP03,Date Time Period,Date Time Period,R,,,,,
DTP,Segment - DTP Date - Property and Casualty Date of First Contact (Situational),,,,,,,
2300.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,096 :  First Visit or Consultation,,,,
2300.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 : Date Expressed in Format CCYYMMDD,,,,
2300.DTP03,Date Time Period,Date Time Period,R,,,,,
DTP,Segment - DTP Date - Repricer Received Date (Situational),,,,,,,
2300.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,050 :  Received,,,,
2300.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 : Date Expressed in Format CCYYMMDD,,,,
2300.DTP03,Date Time Period,Date Time Period,R,,,,,
PWK,Segment - PWK Claim Supplemental Information (Situational),Map only firrst occurrence of PWK segment.,,,,,,
2300.PWK01,Report Type Code,"Code indicating the title or contents of a document, report or supporting item",R,"04 : Drugs Administered
05 : Treatment Diagnosis
06 : Initial Assessment",,,,
2300.PWK02,Report Transmission Code,"Code defining timing, transmission method or format by which reports are to be
sent",R,"AA : Available on Request at Provider Site
BM : By Mail
EL : Electronically Only
EM : E-Mail
FT : File Transfer
FX : By Fax",,,,
2300.PWK05,Identification Code Qualifier,Code identifying a party or other code,S,AC:  Attachment Control Number,,,,
2300.PWK06,Identification Code,Attachment Control Number. Used to identify the attached electronic documentation.The number in PWK06 is carried in the TRN of the electronic attachment,S,,,Attachment_Set_ID,Claim Level,
CN1,Segment - CN1 Contract Information (Situational),,,,,,,
2300.CN101,Contract Type Code,Code identifying a contract type,R,"01 : Diagnosis Related Group (DRG)
02 : Per Diem
03 : Variable Per Diem
04 : Flat
05 : Capitated
06 : Percent
09 : Other",,,,
2300.CN102,Monetary Amount,Contract Amount,S,,,,,
2300.CN103,"Percent, Decimal Format",Contract Percentage,S,,,,,
2300.CN104,Reference Identification,Contract Code,S,,,,,
2300.CN105,Terms Discount Percent,"Terms discount percentage, expressed as a percent, available to the purchaser if
an invoice is paid on or before the Terms Discount Due Date",S,,,,,
2300.CN106,Version Identifier,Contract Version Identifier,S,,,,,
AMT,Segment - AMT Patient Amount Paid (Situational),,,,,,,
2300.AMT01,Amount Qualifier Code,Code to qualify amount,R,F5 : Patient Amount Paid,,,,
2300.AMT02,Monetary Amount,Patient Amount Paid,R,,,,,
REF,Segment - REF Service Authorization Exception Code (Situational),,,,,,,
2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,4N :  Special Payment Reference Number,,,,
2300.REF02,Reference Identification,Service Authorization Exception Code,R,,,,,
REF,Segment - REF Mandatory Medicare (Section 4081) Crossover Indicator (Situational),,,,,,,
2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,F5 : Medicare Version Code,,,,
2300.REF02,Reference Identification,Medicare Section 4081 Indicator,R,"Y : 4081
N : Regular crossover",,,,
REF,Segment - REF Mammography Certification Number (Situational),,,,,,,
2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,EW:  Mammography Certification Number,,,,
2300.REF02,Reference Identification,Mammography Certification Number,R,,,,,
REF,Segment - REF Referral Number (Situational),,,,,,,
2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,9F :  Referral Number,,,,
2300.REF02,Reference Identification,Referral Number,R,,,Referring_ReferralNumber,Claim Level,
REF,Segment - REF Prior Authorization (Situational),,,,,,,
2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,G1 : Prior Authorization Number,,,,
2300.REF02,Reference Identification,Prior Authorization Number,R,,,,,
REF,Segment - REF Payer Claim Control Number (Situational),,,,,,,
2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,F8 : Original Reference Number,,,,
2300.REF02,Reference Identification,Payer Claim Control Number,R,,,Claim_Number,Claim Level,
REF,Segment - REF Clinical Laboratory Improvement Amendment (CLIA) Number (Situational),,,,,,,
2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"X4 : Clinical Laboratory Improvement Amendment
Number",,,,
2300.REF02,Reference Identification,Clinical Laboratory Improvement Amendment Number,R,,,,,
REF,Segment - REF Repriced Claim Number (Situational),,,,,,,
2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,9A : Repriced Claim Reference Number,,,,
2300.REF02,Reference Identification,Repriced Claim Reference Number,R,,,,,
REF,Segment - REF Adjusted Repriced Claim Number (Situational),,,,,,,
2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,9C :  Adjusted Repriced Claim Reference Number,,,,
2300.REF02,Reference Identification,Adjusted Repriced Claim Reference Number,R,,,,,
REF,Segment - REF Investigational Device Exemption Number (Situational),,,,,,,
2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,LX : Qualified Products List,,,,
2300.REF02,Reference Identification,Investigational Device Exemption Identifier,R,,,,,
REF,Segment - REF Claim Identification For Transmission Intermediaries (Situational),,,,,,,
2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,D9 : Claim Number,,,,
2300.REF02,Reference Identification,Value Added Network Trace Number,R,,,Clearing_House_Trace_Number,Claim Level,
REF,Segment - REF Medical Record Number (Situational),,,,,,,
2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,EA :  Medical Record Identification Number,,,,
2300.REF02,Reference Identification,Value Added Network Trace Number,R,,,,,
REF,Segment - REF Demonstration Project Identifier (Situational),,,,,,,
2300.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,P4 :   Project Code,,,,
2300.REF02,Reference Identification,Value Added Network Trace Number,R,,,,,
K3,Segment - K3 File Information (Situational),,,,,,,
2300.K301,Fixed Format Information,Data in fixed format agreed upon by sender and receiver,R,,,,,
NTE,Segment - NTE Claim Note (Situational),,,,,,,
2300.NTE01,Note Reference Code,Code identifying the functional area or purpose for which the note applies,R,"ADD : Additional Information
CER : Certification Narrative
DCP : Goals, Rehabilitation Potential, or Discharge Plans",,,,
2300.NTE02,Description,A free-form description to clarify the related data elements and their content  /  Claim Note Text,R,,,,,
CR1,Segment - CR1 Ambulance Transport Information (Situational),,,,,,,
2300.CR101,Unit or Basis for Measurement Code,"Code specifying the units in which a value is being expressed, or manner in which
a measurement has been taken",S,LB : Pound,,,,
2300.CR102,Weight,Patient Weight,S,,,,,
2300.CR104,Ambulance Transport Reason Code,Code indicating the reason for ambulance transport,R,"A : Patient was transported to nearest facility
B : Patient was transported for the benefit of a preferred physician
C : Patient was transported for the nearness of family members
D : Patient was transported for the care of a specialist
E : Patient Transferred to Rehabilitation Facility",,,,
2300.CR105,Unit or Basis for Measurement Code,"Code specifying the units in which a value is being expressed, or manner in which a measurement has been taken",R,DH : Miles,,,,
2300.CR106,Quantity,Transport Distance,R,,,,,
2300.CR109,Description,"Round Trip Purpose Description. Required when the ambulance service is for a round
trip.",S,,,,,
2300.CR110,Description,Stretcher Purpose Description,S,,,,,
CR2,Segment - CR2 Spinal Manipulation Service Information (Situational),,,,,,,
2300.CR208,Nature of Condition Code,Code indicating the nature of a patient’s condition,R,,,,,
2300.CR210,Description,Patient Condition Description,S,,,,,
2300.CR211,Description,Patient Condition Description,S,,,,,
CRC,Segment - CRC Ambulance Certification (Situational),,,,,,,
2300.CRC01,Code Category,Specifies the situation or category to which the code applies,R,07 : Ambulance Certification,,,,
2300.CRC02,Yes/No Condition or Response Code,Certification Condition Indicator,R,"Y : Yes
N : No",,,,
2300.CRC03,Condition Indicator,Code indicating a condition,R,"01 : Patient was admitted to a hospital
04 : Patient was moved by stretcher
05 : Patient was unconscious or in shock
06 : Patient was transported in an emergency situation
07 : Patient had to be physically restrained
08 : Patient had visible hemorrhaging
09 : Ambulance service was medically necessary
12 : Patient is confined to a bed or chair",,,,
2300.CRC04,Condition Indicator,Code indicating a condition when a second condition code is necessary,S,"01 : Patient was admitted to a hospital
04 : Patient was moved by stretcher
05 : Patient was unconscious or in shock
06 : Patient was transported in an emergency situation
07 : Patient had to be physically restrained
08 : Patient had visible hemorrhaging
09 : Ambulance service was medically necessary
12 : Patient is confined to a bed or chair",,,,
2300.CRC05,Condition Indicator,Code indicating a condition when a third condition code is necessary,S,"01 : Patient was admitted to a hospital
04 : Patient was moved by stretcher
05 : Patient was unconscious or in shock
06 : Patient was transported in an emergency situation
07 : Patient had to be physically restrained
08 : Patient had visible hemorrhaging
09 : Ambulance service was medically necessary
12 : Patient is confined to a bed or chair",,,,
2300.CRC06,Condition Indicator,Code indicating a condition when a fourth condition code is necessary,S,"01 : Patient was admitted to a hospital
04 : Patient was moved by stretcher
05 : Patient was unconscious or in shock
06 : Patient was transported in an emergency situation
07 : Patient had to be physically restrained
08 : Patient had visible hemorrhaging
09 : Ambulance service was medically necessary
12 : Patient is confined to a bed or chair",,,,
2300.CRC07,Condition Indicator,Code indicating a condition when a fifth condition code is necessary,S,"01 : Patient was admitted to a hospital
04 : Patient was moved by stretcher
05 : Patient was unconscious or in shock
06 : Patient was transported in an emergency situation
07 : Patient had to be physically restrained
08 : Patient had visible hemorrhaging
09 : Ambulance service was medically necessary
12 : Patient is confined to a bed or chair",,,,
CRC,Segment - CRC Patient Condition Information: Vision (Situational),,,,,,,
2300.CRC01,Code Category,Specifies the situation or category to which the code applies,R,"E1 : Spectacle Lenses
E2 : Contact Lenses
E3 : Spectacle Frames",,,,
2300.CRC02,Yes/No Condition or Response Code,Certification Condition Indicator,R,"Y : Yes
N : No",,,,
2300.CRC03,Condition Indicator,Code indicating a condition,R,"L1 : General Standard of 20 Degree or .5 Diopter Sphere or Cylinder Change Met
L2 : Replacement Due to Loss or Theft L3 : Replacement Due to Breakage or Damage
L4 : Replacement Due to Patient Preference
 L5 : Replacement Due to Medical Reason",,,,
2300.CRC04,Condition Indicator,Code indicating a condition,S,,,,,
2300.CRC05,Condition Indicator,Code indicating a condition,S,,,,,
2300.CRC06,Condition Indicator,Code indicating a condition,S,,,,,
2300.CRC07,Condition Indicator,Code indicating a condition,S,,,,,
CRC,Segment - CRC Homebound Indicator (Situational),,,,,,,
2300.CRC01,Code Category,Specifies the situation or category to which the code applies,R,75 :  Functional Limitations,,,,
2300.CRC02,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,R,Y :Yes,,,,
2300.CRC03,Condition Indicator,Code indicating a condition,R,IH : Independent at Home,,,,
CRC,Segment - CRC EPSDT Referral (Situational),,,,,,,
2300.CRC01,Code Category,Specifies the situation or category to which the code applies,R,ZZ : Mutually Defined,,,,
2300.CRC02,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,R,"Y : Yes
N : No",,,,
2300.CRC03,Condition Indicator,Code indicating a condition,R,"AV : Available - Not Used
NU :Not Used
S2 :Under Treatment
ST :New Services Requested",,,,
2300.CRC04,Condition Indicator,Code indicating a condition,S,,,,,
2300.CRC05,Condition Indicator,Code indicating a condition,S,,,,,
HI,Segment - HEALTH CARE DIAGNOSIS CODE (Required),,,,,,,
2300.HI01.01,Code List Qualifier Code,Code identifying a specific industry code list/ Principal Diagnosis Type Code,R,"ABK : ICD10 -CM - Principal Diagnosis
BK : ICD9 -CM - Principal Diagnosis",,,,
2300.HI01.02,Industry Code,Code indicating a code from a specific industry code list/Principal Diagnosis Code,R,,,Principal_Diagnosis_Code,Claim Level,"If we get more than 3 digits, should add a dot (.)after 3rd Character"
2300.HI02.01,Code List Qualifier Code,Diagnosis Type Code,R,"ABF : ICD10 -CM -  Diagnosis
BF : ICD9 -CM -  Diagnosis",,,,
2300.HI02.02,Industry Code,Diagnosis Code,R,,,Diagnosis_Code_1,Claim Level,"If we get more than 3 digits, should add a dot (.)after 3rd Character"
2300.HI03.01,Code List Qualifier Code,"Diagnosis Type Code (Required when it is necessary to report an additional
diagnosis and the preceding HI data elements have been used to
report other diagnoses)",R,"ABF : ICD10 -CM -  Diagnosis
BF : ICD9 -CM -  Diagnosis",,,,
2300.HI03.02,Industry Code,Diagnosis Code,R,,,Diagnosis_Code_2,Claim Level,"If we get more than 3 digits, should add a dot (.)after 3rd Character"
2300.HI04.01,Code List Qualifier Code,"Diagnosis Type Code (Required when it is necessary to report an additional
diagnosis and the preceding HI data elements have been used to
report other diagnoses)",R,"ABF : ICD10 -CM -  Diagnosis
BF : ICD9 -CM -  Diagnosis",,,,
2300.HI04.02,Industry Code,Diagnosis Code,R,,,Diagnosis_Code_3,Claim Level,"If we get more than 3 digits, should add a dot (.)after 3rd Character"
2300.HI05.01,Code List Qualifier Code,"Diagnosis Type Code (Required when it is necessary to report an additional
diagnosis and the preceding HI data elements have been used to
report other diagnoses)",R,"ABF : ICD10 -CM -  Diagnosis
BF : ICD9 -CM -  Diagnosis",,,,
2300.HI05.02,Industry Code,Diagnosis Code,R,,,Diagnosis_Code_4,Claim Level,"If we get more than 3 digits, should add a dot (.)after 3rd Character"
2300.HI06.01,Code List Qualifier Code,"Diagnosis Type Code (Required when it is necessary to report an additional
diagnosis and the preceding HI data elements have been used to
report other diagnoses)",R,"ABF : ICD10 -CM -  Diagnosis
BF : ICD9 -CM -  Diagnosis",,,,
2300.HI06.02,Industry Code,Diagnosis Code,R,,,Diagnosis_Code_5,Claim Level,"If we get more than 3 digits, should add a dot (.)after 3rd Character"
2300.HI07.01,Code List Qualifier Code,"Diagnosis Type Code (Required when it is necessary to report an additional
diagnosis and the preceding HI data elements have been used to
report other diagnoses)",R,"ABF : ICD10 -CM -  Diagnosis
BF : ICD9 -CM -  Diagnosis",,,,
2300.HI07.02,Industry Code,Diagnosis Code,R,,,Diagnosis_Code_6,Claim Level,"If we get more than 3 digits, should add a dot (.)after 3rd Character"
2300.HI08.01,Code List Qualifier Code,"Diagnosis Type Code (Required when it is necessary to report an additional
diagnosis and the preceding HI data elements have been used to
report other diagnoses)",R,"ABF : ICD10 -CM -  Diagnosis
BF : ICD9 -CM -  Diagnosis",,,,
2300.HI08.02,Industry Code,Diagnosis Code,R,,,Diagnosis_Code_7,Claim Level,"If we get more than 3 digits, should add a dot (.)after 3rd Character"
2300.HI09.01,Code List Qualifier Code,"Diagnosis Type Code (Required when it is necessary to report an additional
diagnosis and the preceding HI data elements have been used to
report other diagnoses)",R,"ABF : ICD10 -CM -  Diagnosis
BF : ICD9 -CM -  Diagnosis",,,,
2300.HI09.02,Industry Code,Diagnosis Code,R,,,Diagnosis_Code_8,Claim Level,"If we get more than 3 digits, should add a dot (.)after 3rd Character"
2300.HI10.01,Code List Qualifier Code,"Diagnosis Type Code (Required when it is necessary to report an additional
diagnosis and the preceding HI data elements have been used to
report other diagnoses)",R,"ABF : ICD10 -CM -  Diagnosis
BF : ICD9 -CM -  Diagnosis",,,,
2300.HI10.02,Industry Code,Diagnosis Code,R,,,Diagnosis_Code_9,Claim Level,"If we get more than 3 digits, should add a dot (.)after 3rd Character"
2300.HI11.01,Code List Qualifier Code,"Diagnosis Type Code (Required when it is necessary to report an additional
diagnosis and the preceding HI data elements have been used to
report other diagnoses)",R,"ABF : ICD10 -CM -  Diagnosis
BF : ICD9 -CM -  Diagnosis",,,,
2300.HI11.02,Industry Code,Diagnosis Code,R,,,Diagnosis_Code_10,Claim Level,"If we get more than 3 digits, should add a dot (.)after 3rd Character"
2300.HI12.01,Code List Qualifier Code,"Diagnosis Type Code (Required when it is necessary to report an additional
diagnosis and the preceding HI data elements have been used to
report other diagnoses)",R,"ABF : ICD10 -CM -  Diagnosis
BF : ICD9 -CM -  Diagnosis",,,,
2300.HI12.02,Industry Code,Diagnosis Code,R,,,Diagnosis_Code_11,Claim Level,"If we get more than 3 digits, should add a dot (.)after 3rd Character"
HI,Segment - HI Anesthesia Related Procedure (Situational),,,,,,,
2300.HI01.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BP : Health Care Financing Administration Common Procedural Coding System Principal Procedure,,,,
2300.HI01.02,Industry Code,Anesthesia Related Principal Surgical Procedure,R,,,,,
2300.HI02.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BO :  Health Care Financing Administration Common Procedural Coding System,,,,
2300.HI02.02,Industry Code,Anesthesia Related  Surgical Procedure,R,,,,,
HI,Segment - HI CONDITION INFORMATION (Situational),,,,,,,
2300.HI01.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG: Condition,,,,
2300.HI01.02,Industry Code,Condition Code,R,,,,,
2300.HI02.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG: Condition,,,,
2300.HI02.02,Industry Code,Condition Code,R,,,,,
2300.HI03.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG: Condition,,,,
2300.HI03.02,Industry Code,Condition Code,R,,,,,
2300.HI04.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG: Condition,,,,
2300.HI04.02,Industry Code,Condition Code,R,,,,,
2300.HI05.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG: Condition,,,,
2300.HI05.02,Industry Code,Condition Code,R,,,,,
2300.HI06.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG: Condition,,,,
2300.HI06.02,Industry Code,Condition Code,R,,,,,
2300.HI07.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG: Condition,,,,
2300.HI07.02,Industry Code,Condition Code,R,,,,,
2300.HI08.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG: Condition,,,,
2300.HI08.02,Industry Code,Condition Code,R,,,,,
2300.HI09.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG: Condition,,,,
2300.HI09.02,Industry Code,Condition Code,R,,,,,
2300.HI10.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG: Condition,,,,
2300.HI10.02,Industry Code,Condition Code,R,,,,,
2300.HI11.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG: Condition,,,,
2300.HI11.02,Industry Code,Condition Code,R,,,,,
2300.HI12.01,Code List Qualifier Code,Code identifying a specific industry code list,R,BG: Condition,,,,
2300.HI12.02,Industry Code,Condition Code,R,,,,,
HCP,Segment - HCP Claim Pricing/Repricing Information (Situational),,,,,,,
2300.HCP01,Pricing Methodology,"Code specifying pricing methodology at which the claim or line item has been
priced or repriced",R,,,,,
2300.HCP02,Monetary Amount,Repriced Allowed Amount,R,,,,,
2300.HCP03,Monetary Amount,Repriced Saving Amount,S,,,,,
2300.HCP04,Reference Identification,Repricing Organization Identifier,S,,,,,
2300.HCP05,Rate,Repricing Per Diem or Flat Rate Amount,S,,,,,
2300.HCP06,Reference Identification,Repriced Approved Ambulatory Patient Group Code,S,,,,,
2300.HCP07,Monetary Amount,Repriced Approved Ambulatory Patient Group Amount,S,,,,,
2300.HCP13,Reject Reason Code,Code assigned by issuer to identify reason for rejection,S,,,,,
2300.HCP14,Policy Compliance Code,Code specifying policy compliance,S,,,,,
2300.HCP15,Exception Code,Code specifying the exception reason for consideration of out-of-network health care services,S,,,,,
Loop 2310A  - REFERRING PROVIDER NAME (Situational)  Loop Repeat: 2,,,R,,,,,
NM1,Segment - NM1 Referring Provider Name (Situational),,R,,,,,
2310A.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,"DN : Referring Provider
P3 : Primary Care Provider",,,,
2310A.NM102,Entity Type Qualifier,y,R,1 : Person,,,,
2310A.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,`,Referring_Practitioner_Name,Claim Level,"when 2310A.NM101 = DN

Form this element by concatenating First Name and Last Name separated by space ( )

2310A.NM104  + 2310A.NM103"
,Name Last or Organization Name,Individual last name or organizational name,R,,,Referring_Practitioner_LastName,Claim Level,when 2310A.NM101 = DN
2310A.NM104,Name First,Individual first name,S,,,Referring_Practitioner_FirstName,Claim Level,when 2310A.NM101 = DN
2310A.NM105,Name Middle,Individual middle name or initial,S,,,Referring_Practitioner_MiddleName,Claim Level,when 2310A.NM101 = DN
2310A.NM107,Name Suffix,Suffix to individual name,S,,,Referring_Practitioner_Suffix,Claim Level,when 2310A.NM101 = DN
2310A.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code",S,"XX :  Centers for Medicare and Medicaid Services
National Provider Identifier",,,,
2310A.NM109,Identification Code,Referring Provider Identifier,S,,,Referring_npi,Claim Level,when 2310A.NM101 = DN
REF,Segment - REF Referring Provider Secondary Identification (Situational),,,,,,,
2310A.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B : State License Number
1G : Provider UPIN Number
G2 : Provider Commercial Number",,Referring_IdQualifier,Claim Level,
2310A.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier/ Referring Provider Secondary Identifier",R,,,Referring_Practitioner_Identification,Claim Level,
Loop 2310B — RENDERING PROVIDER NAME Loop Repeat: 1 (Situational),,,,,,,,
NM1,Segment - NM1 Rendering Physician Name (Situational),,,,,,,
2310B.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,82 : Rendering Provider,,,,
2310B.NM102,Entity Type Qualifier,"Code identifying an organizational entity, a physical location, property or an
individual",R,"1 : Person
2 : Non-Person Entity",,,,
2310B.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,,,
2310B.NM104,Name First,Individual first name,S,,,,,
2310B.NM105,Name Middle,Individual middle name or initial,S,,,,,
2310B.NM107,Name Suffix,Suffix to individual name,S,,,,,
2310B.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code",S,"XX :  Centers for Medicare and Medicaid Services
National Provider Identifier",,,,
2310B.NM109,Identification Code,Code identifying a party or other code /Rendering Provider Identifier,S,,,,,
PRV,Segment - PRV Rendering Provider Specialty Information (Situational),,,,,,,
2310B.PRV01,Provider Code,Code identifying the type of provider,R,PE : Performing,,,,
2310B.PRV02,Reference Identification Qualifier,Code qualifying the Reference Identification,R,PXC : Health Care Provider Taxonomy Code,,,,
2310B.PRV03,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier / Provider Taxonomy Code",R,,,,,
REF,Segment - REF Rendering Provider Secondary Identification (Situational),,,,,,,
2310B.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B : State License Number
1G : Provider UPIN Number
G2 : Provider Commercial Number
LU : Location Number",,,,
2310B.REF02,Reference Identification,Rendering Provider Secondary Identifier,R,,,,,
Loop 2310C — SERVICE FACILITY LOCATION NAME Loop Repeat: 1 (Situational),,,,,,,,
NM1,Segment - NM1 Service Facility Location Name (Situational),,,,,,,
2310C.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,77 : Service Location,,,,
2310C.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,2 : Non-Person Entity,,,,
2310C.NM103,Name Last or Organization Name,Individual last name or organizational name /Laboratory or Facility Name,R,,,RenderingFacility_Name,Claim Level,
2310C.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code",S,"XX :  Centers for Medicare and Medicaid Services
National Provider Identifier",,,,
2310C.NM109,Identification Code,Laboratory or Facility Primary Identifier,S,,,,,
N3,Segment - N3 Service Facility Location Address (Required),,,,,,,
2310C.N301,Address Information,Address information,R,,,RenderingFacility_StreetAddress,Claim Level,
2310C.N302,Address Information,Address information,S,,,,,
N4,"Segment - N4 Service Facility Location City, State, ZIP Code (Required)",,,,,,,
2310C.N401,City Name,Free-form text for city name,R,,,RenderingFacility_CityName,Claim Level,
2310C.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,RenderingFacility_StateCode,Claim Level,
2310C.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,,RenderingFacility_PostalCode,Claim Level,
2310C.N404,Country Code,Code identifying the country,S,,,,,
2310C.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,
REF,Segment - REF Service Facility Location Secondary Identification (Situational),,,,,,,
2310C.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B : State License Number
G2 : Provider Commercial Number
LU : Location Number",,,,
2310C.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier/Laboratory or Facility Secondary Identifier",R,,,,,
PER,Segment - PER Service Facility Contact Information (Situational),,,,,,,
2310C.PER01,Contact Function Code,Code identifying the major duty or responsibility of the person or group named,R,IC : Information Contact,,,,
2310C.PER02,Name,Name,S,,,,,
2310C.PER03,Communication Number Qualifier,Code identifying the type of communication number,R,TE : Telephone,,,,
2310C.PER04,Communication Number,Complete communications number including country or area code when applicable,R,,,,,
2310C.PER05,Communication Number Qualifier,Code identifying the type of communication number,R,EX :  Telephone Extension,,,,
2310C.PER06,Communication Number,"Complete communications number including country or area code when
applicable",S,,,,,
Loop 2310D — SUPERVISING PROVIDER NAME (Situational)   Loop Repeat: 1,,,,,,,,
NM1,Segment - NM1 Supervising Provider Name (Situational),,,,,,,
2310D.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,DQ : Supervising Physician,,,,
2310D.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,1 : Person,,,,
2310D.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,,,
2310D.NM104,Name First,Individual first name,S,,,,,
2310D.NM105,Name Middle,Individual middle name or initial,S,,,,,
2310D.NM107,Name Suffix,Suffix to individual name,S,,,,,
2310D.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code",S,,,,,
2310D.NM109,Identification Code,Code identifying a party or other code /  Supervising Provider Identifier,S,,,,,
REF,Segment - REF Supervising Provider Secondary Identification (Situational),,,,,,,
2310D.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B : State License Number
G2 : Provider Commercial Number
LU : Location Number",,,,
2310D.REF02,Reference Identification,Supervising Provider Secondary Identifier,R,,,,,
Loop 2310E  - AMBULANCE PICK-UP LOCATION  (Situational)  Loop Repeat: 1,,,,,,,,
NM1,Segment - NM1 Ambulance Pick-up Location (Situational),,,,,,,
2310E.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,PW :  Pickup Address,,,,
2310E.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,2  :  Non-Person Entity,,,,
N3,Segment - N3 Ambulance Pick-up Location Address (Required),,,,,,,
2310E.N301,Address Information,Ambulance Pick-up Address Line,R,,,,,
2310E.N302,Address Information,Ambulance Pick-up Address Line,S,,,,,
N4,"Segment - N4 Ambulance Pick-up Location City, State, ZIP Code (Required)",,,,,,,
2310E.N401,City Name,Free-form text for city name,R,,,,,
2310E.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,,,
2310E.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,,,,
,,,,,,,,
2310E.N404,Country Code,Code identifying the country,S,,,,,
2310E.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,
Loop 2310F — AMBULANCE DROP-OFF LOCATION (Situational) Loop Repeat: 1,,,,,,,,
NM1,Segment - NM1 Ambulance Drop-off Location (Situational),,,,,,,
2310F.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,45 : Drop-off Location,,,,
2310F.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,2  :  Non-Person Entity,,,,
2310F.NM103,Name Last or Organization Name,Ambulance Drop-off Location,S,,,,,
N3,Segment - N3 Ambulance Drop-off Location Address (Required),,,,,,,
2310F.N301,Address Information,Ambulance Drop-off Address Line,R,,,,,
2310F.N302,Address Information,Ambulance Drop-off Address Line,S,,,,,
N4,"Segment - N4 Ambulance Drop-off Location City, State, ZIP Code (Required)",,,,,,,
2310F.N401,City Name,Free-form text for city name,R,,,,,
2310F.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,,,
2310F.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,,,,
2310F.N404,Country Code,Code identifying the country,S,,,,,
2310F.N407,Country Subdivision Code,Code identifying the country subdivision,,,,,,
Loop 2320 — OTHER SUBSCRIBER INFORMATION(Situational) Loop Repeat: 10,,,S,,,,,
SBR,Segment - SBR Other Subscriber Information (Situational),,,,,,,
2320.SBR01,Payer Responsibility Sequence Number Code,"Code identifying the insurance carrier’s level of responsibility for a payment of a
claim",R,"P : Primary
S : Secondary
T : Tertiary",,,,
2320.SBR02,Individual Relationship Code,Code indicating the relationship between two individuals or entities,R,"01 Spouse
18 Self
19 Child
20 Employee
21 Unknown
39 Organ Donor
40 Cadaver Donor
53 Life Partner
G8 Other Relationship",,,,
2320.SBR03,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier/Insured Group or Policy Number",S,,,,,
2320.SBR04,Name,Other Insured Group Name,S,,,,,
2320.SBR05,Insurance Type Code,Code identifying the type of insurance policy within a specific insurance program,S,,,,,
2320.SBR09,Claim Filing Indicator Code,Code identifying type of claim,S,,"MB :Medicare Part B
MA: Medicare Part A
MC: Medicaid",,,
CAS,Segment - CAS Claim Level Adjustments (Situational),,,,,,,
2320.CAS01,Claim Adjustment Group Code,Code identifying the general category of payment adjustment,R,"CO : Contractual Obligations
CR : Correction and Reversals
OA : Other adjustments
PI : Payor Initiated Reductions
PR : Patient Responsibility",,,,
2320.CAS02,Claim Adjustment Reason Code,Code identifying the detailed reason the adjustment was made,R,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2320.CAS03,Monetary Amount,Monetary Amount,R,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2320.CAS04,Quantity,Numeric value of quantity,S,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2320.CAS05,Claim Adjustment Reason Code,Code identifying the detailed reason the adjustment was made,R,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2320.CAS06,Monetary Amount,Monetary Amount,R,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2320.CAS07,Quantity,Numeric value of quantity,S,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2320.CAS08,Claim Adjustment Reason Code,Code identifying the detailed reason the adjustment was made,R,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2320.CAS09,Monetary Amount,Monetary Amount,R,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2320.CAS10,Quantity,Numeric value of quantity,S,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2320.CAS11,Claim Adjustment Reason Code,Code identifying the detailed reason the adjustment was made,R,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2320.CAS12,Monetary Amount,Monetary Amount,R,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2320.CAS13,Quantity,Numeric value of quantity,S,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2320.CAS14,Claim Adjustment Reason Code,Code identifying the detailed reason the adjustment was made,R,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2320.CAS15,Monetary Amount,Monetary Amount,R,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2320.CAS16,Quantity,Numeric value of quantity,S,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2320.CAS17,Claim Adjustment Reason Code,Code identifying the detailed reason the adjustment was made,R,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2320.CAS18,Monetary Amount,Monetary Amount,R,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2320.CAS19,Quantity,Numeric value of quantity,S,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
AMT,Segment - AMT Coordination of Benefits (COB) Payer Paid Amount (Situational),,,,,,,
2320.AMT01,Amount Qualifier Code,Code to qualify amount,R,D : Payor Amount Paid,,,,
2320.AMT02,Monetary Amount,Monetary Amount,R,,,,,
AMT,Segment - AMT Remaining Patient Liability (Situational),,,,,,,
2320.AMT01,Amount Qualifier Code,Code to qualify amount,R,EAF :  Amount Owed,,,,
2320.AMT02,Monetary Amount,Monetary Amount,R,,,,,
AMT,Segment - AMT Coordination of Benefits (COB) Total Non-covered Amount (Situational),,,,,,,
2320.AMT01,Amount Qualifier Code,Code to qualify amount,R,A8 :  Noncovered Charges - Actual,,,,
2320.AMT02,Monetary Amount,Monetary Amount,R,,,,,
OI,Segment - OI Other Insurance Coverage Information (Required),,,,,,,
2320.OI03,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response/Benefits Assignment Certification Indicator,R,"N : No
W : Not Applicable
Use code ‘W’ when the patient refuses to assign
benefits.
Y :  Yes",,,,
2320.OI04,Patient Signature Source Code,"Code indicating how the patient or subscriber authorization signatures were
obtained and how they are being retained by the provider",S,,,,,
2320.OI06,Release of Information Code,Code indicating whether the provider has on file a signed statement by the patient authorizing the release of medical data to other organizations,R,"I  : Informed Consent to Release Medical Information
Y : Yes, Provider has a Signed Statement Permitting
Release of Medical Billing Data Related to a Claim",,,,
MOA,Segment - MOA Outpatient Adjudication Information (Situational),,,,,,,
2320.MOA01,Percentage as Decimal,"Percentage expressed as a decimal (e.g., 0.0 through 1.0 represents 0% through
100%)",S,,,,,
2320.MOA02,Monetary Amount,Monetary amount,S,,,,,
2320.MOA03,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier /  Claim Payment Remark Code",S,,,,,
2320.MOA04,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier /  Claim Payment Remark Code",S,,,,,
2320.MOA05,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier /  Claim Payment Remark Code",S,,,,,
2320.MOA06,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier /  Claim Payment Remark Code",S,,,,,
2320.MOA07,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier /  Claim Payment Remark Code",S,,,,,
2320.MOA08,Monetary Amount,Monetary Amount/End Stage Renal Disease Payment Amount,S,,,,,
2320.MOA09,Monetary Amount,"Monetary Amount/ Non-Payable Professional Component Billed
Amount",S,,,,,
Loop 2330A —  OTHER SUBSCRIBER NAME (Situational) Loop Repeat: 1,,,,,,,,
NM1,Segment - NM1 Other Subscriber Name (Required),,,,,,,
2330A.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,IL : Insured or Subscriber,,,,
2330A.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,"1 : Person
2 : Non-Person Entity",,,,
2330A.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,,,
2330A.NM104,Name First,Individual first name,S,,,,,
2330A.NM105,Name Middle,Individual middle name or initial,S,,,,,
2330A.NM107,Name Suffix,Suffix to individual name,S,E,,,,
2330A.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code",R,"II : Standard Unique Health Identifier for each Individual
in the United States
MI :Member Identification Number",,,,
2330A.NM109,Identification Code,Code identifying a party or other code,R,,,,,
N3,Segment - N3 Other Subscriber Address (Situational),,,,,,,
2330A.N301,Address Information,Address Information,R,,,,,
2330A.N302,Address Information,Address Information,S,,,,,
N4,Segment - N4 Other Subscriber City/State/ZIP Code (Situational),,,,,,,
2330A.N401,City Name,Free-form text for city name,R,,,,,
2330A.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,,,
2330A.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,,,,
2330A.N404,Country Code,Code identifying the country,S,,,,,
2330A.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,
REF,Segment - REF Other Subscriber Secondary Information (Situational),,,,,,,
2330A.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,SY :  Social Security Number,,,,
2330A.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier / Other Insured Additional Identifier",R,,,,,
Loop 2330B — OTHER PAYER NAME (Situational) Loop Repeat: 1,,,,,,,,
NM1,Segment - NM1 Other Payer Name (Required),,,,,,,
2330B.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,PR : Payer,,,,
2330B.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,2 :  Non-Person Entity,,,,
2330B.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,,,
2330B.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code (67)",R,"PI :  Payor Identification
XV : Centers for Medicare and Medicaid Services PlanID",,,,
2330B.NM109,Identification Code,Code identifying a party or other code,R,,,,,
N3,Segment - N3 Other Payer Address (Situational),,,,,,,
2330B.N301,Address Information,Address Information,R,,,,,
2330B.N302,Address Information,Address Information,S,,,,,
N4,Segment - N4 Other Payer City/State/ZIP Code (Situational),,,,,,,
2330B.N401,City Name,Free-form text for city name,R,,,,,
2330B.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,,,
2330B.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,,,,
2330B.N404,Country Code,Code identifying the country,S,,,,,
2330B.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,
DTP,Segment - DTP Claim Check or Remittance Date (Situational),,,,,,,
2330B.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,573 : Date Claim Paid,,,,
2330B.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 :  Date Expressed in Format CCYYMMDD,,,,
2330B.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,20210305,,,
REF,Segment - REF Other Payer Secondary Identifier (Situational),,,,,,,
2330B.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"2U : Payer Identification Number
EI : Employer’s Identification Number
FY : Claim Office Number
NF : National Association of Insurance Commissioners
(NAIC) Code",,,,
2330B.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier/Other Payer Secondary Identifier",R,,22105302412107COA,,,
REF,Segment - REF Other Payer Prior Authorization Number (Situational),,,,,,,
2330B.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,G1 : Prior Authorization Number,,,,
2330B.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier/ Other Payer Prior Authorization Number",R,,,,,
REF,Segment - REF Other Payer Referral Number (Situational),,,,,,,
2330B.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,9F :  Referral Number,,,,
2330B.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier/  Other Payer Prior Authorization or Referral
Number",R,,,,,
REF,Segment - REF Other Payer Claim Adjustment Indicator (Situational),,,,,,,
2330B.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,T4 : Signal Code,,,,
2330B.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier/ : Other Payer Claim Adjustment Indicator",R,,,,,
REF,Segment - REF Other Payer Claim Control Number (Situational),,,,,,,
2330B.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,F8 : Original Reference Number,,,,
2330B.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier/ : Other Payer’s Claim Control Number",R,,,,,
Loop 2330C — OTHER PAYER REFERRING PROVIDER (Situational)  Loop Repeat: 2,,,,,,,,
NM1,Segment - NM1 Other Payer Referring Provider (Situational),,,,,,,
2330C.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,"DN : Referring Provider
P3 : Primary Care Provider",,,,
2330C.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,1 : Person,,,,
REF,Segment - REF Other Payer Referring Provider Secondary Identification (Required),,,,,,,
2330C.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B : State License Number
1G : Provider UPIN Number
G2 : Provider Commercial Number",,,,
2330C.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier  /Other Payer Referring Provider Identifier,R,,,,,
Loop 2330D — OTHER PAYER RENDERING PROVIDER (Situational) Loop Repeat: 1,,,,,,,,
NM1,Segment - NM1 Other Payer Rendering Provider (Situational),,,,,,,
2330D.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,82 :Other Payer Referring Provider Identifier,,,,
2330D.NM102,Entity Type Qualifier,Code qualifying the type of entity /Other Payer Referring Provider Identifier,R,"1 :Person
2 :Non-Person Entity",,,,
REF,Segment - REF Other Payer Rendering Provider Secondary Identification (Required),,,,,,,
2330D.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B :State License Number
1G :Provider UPIN Number
G2 :Provider Commercial Number
LU :Location Number",,,,
2330D.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier /Other Payer Referring Provider Identifier,R,,,,,
Loop 2330E — OTHER PAYER SERVICE FACILITY LOCATION (Situational) Loop Repeat: 1,,,,,,,,
NM1,Segment - NM1 Other Payer Service Facility Location (Situational),,,,,,,
2330E.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,77 : Service Location,,,,
2330E.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,2 :Non-Person Entity,,,,
REF,Segment - REF Other Payer Service Facility Location Secondary Identification (Required),,,,,,,
2330E.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B : State License Number
G2 : Provider Commercial Number
LU : Location Number",,,,
2330E.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier /Other Payer Service Facility Location Secondary
Identifie",R,,,,,
Loop 2330F  — OTHER PAYER SUPERVISING PROVIDER (Situational) Loop Repeat: 1,,,,,,,,
NM1,Segment - NM1 Other Payer Supervising Provider (Situational),,,,,,,
2330F.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,DQ : Supervising Physician,,,,
2330F.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,1 : Person,,,,
REF,Segment - REF Other Payer Supervising Provider Secondary Identification (Required),,,,,,,
2330F.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B : State License Number
1G : Provider UPIN Number
G2 : Provider Commercial Number
LU : Location Number",,,,
2330F.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier/ Other Payer Supervising Provider Identifier",R,,,,,
Loop 2330G — OTHER PAYER BILLING PROVIDER  (Situational) Loop Repeat: 1,,,,,,,,
NM1,Segment - NM1 Other Payer Billing Provider (Situational),,,,,,,
2330G.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,85 : Billing Provider,,,,
2330G.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,"1 : Person
2 : Non-Person Entity",,,,
REF,Segment - REF Other Payer Billing Provider Secondary Identification (Required),,,,,,,
2330G.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"G2 : Provider Commercial Number
LU : Location Number",,,,
2330G.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier/ Other Payer Billing Provider Identifier",R,,,,,
Loop 2400  — SERVICE LINE NUMBER(Required) Loop Repeat: 50,,,,,,,,
LX,Segment - LX Service Line Number (Required),,,,,,,
2400.LX01,Assigned Number,Number assigned for differentiation within a transaction set,R,,,Number_of_service_lines,Claim Level,Total no of lines in the claim
,,,,,,Original_Line_Number,Line Level,
SV1,Segment - SV1 Professional Service (Required),,,,,,,
2400.SV101.01,Product/Service ID Qualifier,"Code identifying the type/source of the descriptive number used in
Product/Service ID (234)",R,"HC  :  Health Care Financing Administration Common
Procedural Coding System (HCPCS) Codes
ER : Jurisdiction Specific Procedure and Supply Codes
IV :Home Infusion EDI Coalition (HIEC) Product/Service
Code
WK :Advanced Billing Concepts (ABC) Codes",,,,
,Product/Service ID,identifying number for a product or service,R,,90837,Service_Line_ServiceCode,Line Level,
2400.SV101.03,Procedure Modifier,"This identifies special circumstances related to the performance of the service, as defined by trading partners",S,,HE,Service_Line_Modifier_1,Line Level,
2400.SV101.04,Procedure Modifier,"This identifies special circumstances related to the performance of the service, as defined by trading partners",S,,GT,Service_Line_Modifier_2,Line Level,
2400.SV101.05,Procedure Modifier,"This identifies special circumstances related to the performance of the service, as defined by trading partners",S,,GT,Service_Line_Modifier_3,Line Level,
2400.SV101.06,Procedure Modifier,"This identifies special circumstances related to the performance of the service, as defined by trading partners",S,,GT,Service_Line_Modifier_4,Line Level,
2400.SV101.07,Description,A free-form description to clarify the related data elements and their content,S,,,,,
2400.SV102,Monetary Amount,Monetary Amount,R,,233.19,Service_Line_ServiceFee,Line Level,
2400.SV103,Unit or Basis for Measurement Code,"Code specifying the units in which a value is being expressed, or manner in which a measurement has been taken",R,"UN : Unit
MJ : Minutes",,,,
2400.SV104,Quantity,Numeric value of quantity,R,,,Service_Line_ServiceUnitCount,Line Level,when 2400.SV103 = UN
,,,,,,Service_Line_ServiceMinuteCount,Line Level,when 2400.SV103 = MJ
2400.SV105,Facility Code Value,"Code identifying where services were, or may be, performed; the first and second positions of the Uniform Bill Type Code for Institutional Services or the Place of Service Codes for Professional or Dental Services.",S,,,Service_Line_POS,Line Level,
2400.SV107.01,Diagnosis Code Pointer,A pointer to the diagnosis code in the order of importance to this service,R,,,Diagnosis_Code_Pointer_1,Line Level,
2400.SV107.02,Diagnosis Code Pointer,A pointer to the diagnosis code in the order of importance to this service,S,,,Diagnosis_Code_Pointer_2,Line Level,
2400.SV107.03,Diagnosis Code Pointer,A pointer to the diagnosis code in the order of importance to this service,S,,,Diagnosis_Code_Pointer_3,Line Level,
2400.SV107.04,Diagnosis Code Pointer,A pointer to the diagnosis code in the order of importance to this service,S,,,Diagnosis_Code_Pointer_4,Line Level,
2400.SV109,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response /Emergency Indicator,S,Y :Yes,,,,
2400.SV111,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response /EPSDT Indicator,S,Y :Yes,,,,
2400.SV112,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response/ Family Planning Indicator,S,Y :Yes,,,,
2400.SV115,Copay Status Code,"Code indicating whether or not co-payment requirements were met on a line by
line basis",S,0 : Copay exempt,,,,
SV5,Segment - SV5 Durable Medical Equipment Service (Situational),,,,,,,
2400.SV501.01,Product/Service ID Qualifier,"Code identifying the type/source of the descriptive number used in
Product/Service ID",R,"HC : Health Care Financing Administration Common
Procedural Coding System (HCPCS) Codes",,,,
2400.SV501.02,Product/Service ID,Identifying number for a product or service,R,,,,,
2400.SV502,Unit or Basis for Measurement Code,"Code specifying the units in which a value is being expressed, or manner in which
a measurement has been taken",R,DA: Days,,,,
2400.SV503,Quantity,Numeric value of quantity,R,,,,,
2400.SV504,Monetary Amount,Monetary Amount,R,,,,,
2400.SV505,Monetary Amount,Monetary Amount,R,,,,,
2400.SV506,Frequency Code,Code indicating frequency or type of activities or actions being reported,R,"1 :Weekly
4 :Monthly
6 :Daily",,,,
PWK,Segment - PWK Line Supplemental Information (Situational),,,,,,,
2400.PWK01,Report Type Code,"Code indicating the title or contents of a document, report or supporting item",R,,,,,
2400.PWK02,Report Transmission Code,"Code defining timing, transmission method or format by which reports are to be sent",R,,,,,
2400.PWK05,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code",S,AC :  Attachment Control Number,,,,
2400.PWK06,Identification Code,Code identifying a party or other code,S,,,,,
PWK,Segment - PWK Durable Medical Equipment Certificate of Medical Necessity Indicator (Situational),,,,,,,
2400.PWK01,Report Type Code,"Code indicating the title or contents of a document, report or supporting item",R,CT : Certification,,,,
2400.PWK02,Report Transmission Code,"Code defining timing, transmission method or format by which reports are to be
sent",R,"AB :Previously Submitted to Payer
AD :Certification Included in this Claim
AF :Narrative Segment Included in this Claim
AG :No Documentation is Required
NS :Not Specified",,,,
CR1,Segment - CR1 Ambulance Transport Information (Situational),,,,,,,
2400.CR101,Unit or Basis for Measurement Code,"Code specifying the units in which a value is being expressed, or manner in which a measurement has been taken",S,LB : Pound,,,,
2400.CR102,Weight,Numeric value of weight,S,,,,,
2400.CR104,Ambulance Transport Reason Code,Code indicating the reason for ambulance transport,R,"A : Patient was transported to nearest facility
B : Patient was transported for the benefit of a preferred physician
C : Patient was transported for the nearness of family members
D : Patient was transported for the care of a specialist
E : Patient Transferred to Rehabilitation Facility",,,,
2400.CR105,Unit or Basis for Measurement Code,"Code specifying the units in which a value is being expressed, or manner in which a measurement has been taken",R,DH : Miles,,,,
2400.CR106,Quantity,Transport Distance,R,,,,,
2400.CR109,Description,"Round Trip Purpose Description. Required when the ambulance service is for a round
trip.",S,,,,,
2400.CR110,Description,Stretcher Purpose Description,S,,,,,
CR3,Segment - CR3 Durable Medical Equipment Certification (Situational),,,,,,,
2400.CR301,Certification Type Code,Code indicating the type of certification,R,"I : Initial
R : Renewal
S : Revised",,,,
2400.CR302,Unit or Basis for Measurement Code,"Code specifying the units in which a value is being expressed, or manner in which a measurement has been taken",R,MO : Months,,,,
2400.CR303,Quantity,Numeric value of quantity,R,,,,,
CRC,Segment - CRC Ambulance Certification (Situational),,,,,,,
2400.CRC01,Code Category,Specifies the situation or category to which the code applies,R,07 : Ambulance Certification,,,,
2400.CRC02,Yes/No Condition or Response Code,Certification Condition Indicator,R,"Y : Yes
N : No",,,,
2400.CRC03,Condition Indicator,Code indicating a condition,R,"01 : Patient was admitted to a hospital
04 : Patient was moved by stretcher
05 : Patient was unconscious or in shock
06 : Patient was transported in an emergency situation
07 : Patient had to be physically restrained
08 : Patient had visible hemorrhaging
09 : Ambulance service was medically necessary
12 : Patient is confined to a bed or chair",,,,
2400.CRC04,Condition Indicator,Code indicating a condition when a second condition code is necessary,S,"01 : Patient was admitted to a hospital
04 : Patient was moved by stretcher
05 : Patient was unconscious or in shock
06 : Patient was transported in an emergency situation
07 : Patient had to be physically restrained
08 : Patient had visible hemorrhaging
09 : Ambulance service was medically necessary
12 : Patient is confined to a bed or chair",,,,
2400.CRC05,Condition Indicator,Code indicating a condition when a third condition code is necessary,S,"01 : Patient was admitted to a hospital
04 : Patient was moved by stretcher
05 : Patient was unconscious or in shock
06 : Patient was transported in an emergency situation
07 : Patient had to be physically restrained
08 : Patient had visible hemorrhaging
09 : Ambulance service was medically necessary
12 : Patient is confined to a bed or chair",,,,
2400.CRC06,Condition Indicator,Code indicating a condition when a fourth condition code is necessary,S,"01 : Patient was admitted to a hospital
04 : Patient was moved by stretcher
05 : Patient was unconscious or in shock
06 : Patient was transported in an emergency situation
07 : Patient had to be physically restrained
08 : Patient had visible hemorrhaging
09 : Ambulance service was medically necessary
12 : Patient is confined to a bed or chair",,,,
2400.CRC07,Condition Indicator,Code indicating a condition when a fifth condition code is necessary,S,"01 : Patient was admitted to a hospital
04 : Patient was moved by stretcher
05 : Patient was unconscious or in shock
06 : Patient was transported in an emergency situation
07 : Patient had to be physically restrained
08 : Patient had visible hemorrhaging
09 : Ambulance service was medically necessary
12 : Patient is confined to a bed or chair",,,,
CRC,Segment - CRC Hospice Employee Indicator (Situational),,R,,,,,
2400.CRC01,Code Category,Specifies the situation or category to which the code applies,R,70 : Hospice,,,,
2400.CRC02,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,R,"Y : Yes
N : No",,,,
2400.CRC03,Condition Indicator,Code indicating a condition,R,65 : Open,,,,
CRC,Segment - CRC Condition Indicator/Durable Medical Equipment (Situational),,,,,,,
2400.CRC01,Code Category,Specifies the situation or category to which the code applies,R,09 : Durable Medical Equipment Certification,,,,
2400.CRC02,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response,R,"Y : Yes
N : No",,,,
2400.CRC03,Condition Indicator,Code indicating a condition,R,"38 :  Certification signed by the physician is on file at the
supplier’s office
ZV : Replacement Item",,,,
2400.CRC04,Condition Indicator,Code indicating a condition,S,"38 :  Certification signed by the physician is on file at the
supplier’s office
ZV : Replacement Item",,,,
DTP,Segment - DTP Date - Service Date (Required),,,,,,,
2400.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,472 : Service,,,,
2400.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,"RD8 :  Range of Dates Expressed in Format CCYYMMDDCCYYMMDD
D8 : Date Expressed in Format CCYYMMDD",,,,
2400.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,20201112,Start_Date,Line Level,byte 1-8 in the format YYYY-MM-DD
,,,,,,End_Date,Line Level,byte 10-17 in the format YYYY-MM-DD
DTP,Segment - DTP Date - Prescription Date (Situational),,,,,,,
2400.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,471 : Prescription,,,,
2400.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 : Date Expressed in Format CCYYMMDD,,,,
2400.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,
DTP,Segment - DTP DATE - Certification Revision/Recertification Date (Situational),,,,,,,
2400.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,607 :  Certification Revision,,,,
2400.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 : Date Expressed in Format CCYYMMDD,,,,
2400.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,
DTP,Segment - DTP Date - Begin Therapy Date (Situational),,,,,,,
2400.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,463 : Begin Therapy,,,,
2400.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 : Date Expressed in Format CCYYMMDD,,,,
2400.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,
DTP,Segment - DTP Date - Last Certification Date (Situational),,,,,,,
2400.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,461 : Last Certification,,,,
2400.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 : Date Expressed in Format CCYYMMDD,,,,
2400.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,
DTP,Segment - DTP Date - Last Seen Date (Situational),,,,,,,
2400.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,304 : Latest Visit or Consultation,,,,
2400.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 : Date Expressed in Format CCYYMMDD,,,,
2400.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,
DTP,Segment - DTP Date - Test Date (Situational),,,,,,,
2400.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,"738 :Most Recent Hemoglobin or Hematocrit or Both
739 :Most Recent Serum Creatine",,,,
2400.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 : Date Expressed in Format CCYYMMDD,,,,
2400.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,
DTP,Segment - DTP Date - Shipped Date (Situational),,,,,,,
2400.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,011 : Shipped,,,,
2400.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 : Date Expressed in Format CCYYMMDD,,,,
2400.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,
DTP,Segment - DTP Date - Last X-ray Date (Situational),,,,,,,
2400.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,455 : Last X-Ray,,,,
2400.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 : Date Expressed in Format CCYYMMDD,,,,
2400.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,
DTP,Segment - DTP Date - Initial Treatment Date (Situational),,,,,,,
2400.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,454:  Initial Treatment,,,,
2400.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 : Date Expressed in Format CCYYMMDD,,,,
2400.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,,,,
QTY,Segment - QTY Ambulance Patient Count (Situational),,,,,,,
2400.QTY01,Quantity Qualifier,Code specifying the type of quantity,R,PT : Patients,,,,
2400.QTY02,Quantity,Numeric value of quantity,R,,,,,
QTY,Segment - QTY Obstetric Anesthesia Additional Units (Situational),,,,,,,
2400.QTY01,Quantity Qualifier,Code specifying the type of quantity,R,FL : Units,,,,
2400.QTY02,Quantity,Numeric value of quantity,R,,,,,
MEA,Segment - MEA Test Result (Situational),,,,,,,
2400.MEA01,Measurement Reference ID Code,Code identifying the broad category to which a measurement applies,R,"OG Original
TR Test Results",,,,
2400.MEA02,Measurement Qualifier,"Code identifying a specific product or process characteristic to which a
measurement applies",R,"HT Height
R1 Hemoglobin
R2 Hematocrit
R3 Epoetin Starting Dosage
R4 Creatinine",,,,
2400.MEA03,Measurement Value,The value of the measurement,R,,,,,
CN1,Segment - CN1 Contract Information (Situational),,,,,,,
2400.CN101,Contract Type Code,Code identifying a contract type,R,"01 : Diagnosis Related Group (DRG)
02 : Per Diem
03 : Variable Per Diem
04 : Flat
05 : Capitated
06 : Percent
09 : Other",,,,
2400.CN102,Monetary Amount,Monetary Amount,S,,,,,
2400.CN103,"Percent, Decimal Format",Percent given in decimal format,S,,,,,
2400.CN104,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier /: Contract Code",S,,,,,
2400.CN105,Terms Discount Percent,"Terms discount percentage, expressed as a percent, available to the purchaser if
an invoice is paid on or before the Terms Discount Due Date",S,,,,,
2400.CN106,Version Identifier,"Revision level of a particular format, program, technique or algorithm",S,,,,,
REF,Segment - REF Line Item Control Number (Situational),,,,,,,
2400.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,6R : Provider Control Number,,,,
2400.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,
REF,Segment - REF Repriced Line Item Reference Number (Situational),,,,,,,
2400.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,9B : Repriced Line Item Reference Number,,,,
2400.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,
REF,Segment - REF Adjusted Repriced Line Item Reference Number (Situational),,,,,,,
2400.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,9D : Adjusted Repriced Line Item Reference Number,,,,
2400.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,
REF,Segment - REF Prior Authorization (Situational),,,,,,,
2400.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,G1 : Prior Authorization Number,,,,
2400.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,
2400.REF04.01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,2U : Payer Identification Number,,,,
2400.REF04.02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,
REF,Segment - REF Mammography Certification Number (Situational),,,,,,,
2400.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,EW : Mammography Certification Number,,,,
2400.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,
REF,Segment - REF Clinical Laboratory Improvement Amendment (CLIA) Number (Situational),,,,,,,
2400.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"X4 : Clinical Laboratory Improvement Amendment
Number",,,,
2400.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,
REF,Segment - REF Immunization Batch Number (Situational),,,,,,,
2400.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,BT : Batch Number,,,,
2400.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,
REF,Segment - REF Referral Number (Situational),,,,,,,
2400.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,9F  :Referral Number,,,,
2400.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,
2400.REF04.01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,2U : Payer Identification Number,,,,
2400.REF04.02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,
AMT,Segment - AMT Sales Tax Amount (Situational),,,,,,,
2400.AMT01,Amount Qualifier Code,Code to qualify amount,R,T :Tax,,,,
2400.AMT02,Monetary Amount,Monetary Amount,R,,,,,
AMT,Segment - AMT Postage Claimed Amount (Situational),,,,,,,
2400.AMT01,Amount Qualifier Code,Code to qualify amount,R,F4 : Postage Claimed,,,,
2400.AMT02,Monetary Amount,Monetary Amount,R,,,,,
K3,Segment - K3 File Information (Situational),,,,,,,
2400.K301,Fixed Format Information,Data in fixed format agreed upon by sender and receiver,R,,,,,
NTE,Segment - NTE Line Note (Situational),,,,,,,
2400.NTE01,Note Reference Code,Code identifying the functional area or purpose for which the note applies,R,"ADD :Additional Information
DCP: Goals, Rehabilitation Potential, or Discharge Plans",,,,
2400.NTE02,Description,A free-form description to clarify the related data elements and their content,R,,,,,
NTE,Segment - NTE Third Party Organization Notes (Situational),,,,,,,
2400.NTE01,Note Reference Code,Code identifying the functional area or purpose for which the note applies,R,TPO : Third Party Organization Notes,,,,
2400.NTE02,Description,A free-form description to clarify the related data elements and their content,R,,,,,
PS1,Segment - PS1 Purchased Service Information (Situational),,,,,,,
2400.PS101,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,
2400.PS102,Monetary Amount,Monetary Amount,R,,,,,
HCP,Segment - HCP Line Pricing/Repricing Information (Situational),,,,,,,
2400.HCP01,Pricing Methodology,"Code specifying pricing methodology at which the claim or line item has been
priced or repriced",R,"00: Zero Pricing (Not Covered Under Contract)
01: Priced as Billed at 100%
02 :Priced at the Standard Fee Schedule
03 :Priced at a Contractual Percentage
04 : Bundled Pricing
05 : Peer Review Pricing
06 : Per Diem Pricing
07 : Flat Rate Pricing
08  :Combination Pricing
09 : Maternity Pricing
10 : Other Pricing
11 : Lower of Cost
12 : Ratio of Cost
13 : Cost Reimbursed
14 : Adjustment Pricing",,,,
2400.HCP02,Monetary Amount,Monetary Amount,R,,,,,
2400.HCP03,Monetary Amount,Monetary Amount,S,,,,,
2400.HCP04,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifie /Repricing Organization Identifier",S,,,,,
2400.HCP05,Rate,Rate expressed in the standard monetary denomination for the currency specified,S,,,,,
2400.HCP06,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier /Repriced Approved Ambulatory Patient Group
Code",S,,,,,
2400.HCP07,Monetary Amount,,S,,,,,
2400.HCP09,Product/Service ID Qualifier,"Code identifying the type/source of the descriptive number used in
Product/Service ID",S,"ER : Jurisdiction Specific Procedure and Supply Codes
HC :Health Care Financing Administration Common
Procedural Coding System (HCPCS) Codes
IV : Home Infusion EDI Coalition (HIEC) Product/Service
Code
WK : Advanced Billing Concepts (ABC) Codes",,,,
2400.HCP10,Product/Service ID,Identifying number for a product or service,S,,,,,
2400.HCP11,Unit or Basis for Measurement Code,"Code specifying the units in which a value is being expressed, or manner in which a measurement has been taken",S,"MJ : Minutes
UN: Unit",,,,
2400.HCP12,Quantity,Numeric value of quantity,S,,,,,
2400.HCP13,Reject Reason Code,Code assigned by issuer to identify reason for rejection,S,"T1 :Cannot Identify Provider as TPO (Third Party
Organization) Participant
T2 :Cannot Identify Payer as TPO (Third Party
Organization) Participant
T3 :Cannot Identify Insured as TPO (Third Party
Organization) Participant
T4 :Payer Name or Identifier Missing
T5 :Certification Information Missing
T6 :Claim does not contain enough information for repricing",,,,
2400.HCP14,Policy Compliance Code,Code specifying policy compliance,S,"1 :Procedure Followed (Compliance)
2:Not Followed - Call Not Made (Non-Compliance Call
Not Made)
3: Not Medically Necessary (Non-Compliance NonMedically Necessary)
4 :Not Followed Other (Non-Compliance Other)
5 : Emergency Admit to Non-Network Hospital",,,,
2400.HCP15,Exception Code,"Code specifying the exception reason for consideration of out-of-network health
care services",S,"1 :Non-Network Professional Provider in Network
Hospital
2 :Emergency Care
3: Services or Specialist not in Network
4 :Out-of-Service Area
5 :State Mandates
6 :Other",,,,
Loop 2410  — DRUG IDENTIFICATION Drug identification Loop Repeat: 1,,,,,,,,
LIN,Segment - LIN Drug identification (Situational),,,,,,,
2410.LIN02,Product/Service ID Qualifier,"Code identifying the type/source of the descriptive number used in
Product/Service ID",R,N4 : National Drug Code in 5-4-2 Format,,,,
2410.LIN03,Product/Service ID,Identifying number for a product or service,R,,,,,
CTP,Segment - CTP Drug Quantity (Required),,,,,,,
2410.CTP04,Quantity,Numeric value of quantity,R,,,,,
2410.CTP05-1,COMPOSITE UNIT OF MEASURE-Unit or Basis for Measurement Code,"To identify a composite unit of measure. Code specifying the units in which a value is being expressed, or
manner in which a measurement has been taken",R,"F2 : International Unit
GR : Gram
ME :Milligram
ML :Milliliter
UN :Unit",,,,
REF,Segment - REF Prescription or Compound Drug Association Number (Situational),,,,,,,
2410.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"VY : Link Sequence Number
XZ : Pharmacy Prescription Number",,,,
2410.REF02,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,,,,
Loop 2420A  — RENDERING PROVIDER NAME(Situational) Loop Repeat: 1,,,,,,,,
NM1,Segment - NM1 Renderring Physician Name (Situational),,,,,,,
2420A.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,82 : Rendering Provider,,,,
2420A.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,"1 : Person
2 : Non-Person Entity",,,,
2420A.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,Service_Line_RenderingProviderLastName,Line Level,
2420A.NM104,Name First,Individual first name,S,,,Service_Line_RenderingProviderFirstName,Line Level,
2420A.NM105,Name Middle,Individual middle name or initial,S,,,,,
2420A.NM107,Name Suffix,Suffix to individual name,S,,,,,
2420A.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code,S,"XX :  Centers for Medicare and Medicaid Services
National Provider Identifier",,,,
2420A.NM109,Identification Code,Code identifying a party or other code /: Rendering Provider Identifier,S,1000959250,,,,
PRV,Segment - PRV Rendering Provider Specialty Information (Situational),,,,,,,
2420A.PRV01,Provider Code,Code identifying the type of provider,R,PE : Performing,,,,
2420A.PRV02,Reference Identification Qualifier,Code qualifying the Reference Identification,R,PXC : Health Care Provider Taxonomy Code,,,,
2420A.PRV03,Reference Identification,Reference information as defined for a particular Transaction Set or as specified by the Reference Identification Qualifier,R,,1041C0700X,Service_Line_RenderingPractitionerSpecialty,Line Level,
REF,Segment - REF Rendering Provider Secondary Identification (Situational),,,,,,,
2420A.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B: State License Number
1G : Provider UPIN Number
G2 : Provider Commercial Number
LU : Location Number",,,,
2420A.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,Service_Line_OtherRenderingProviderId,Line Level,
2420A.REF04.01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,2U : Payer Identification Number,,,,
2420A.REF04.02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,
Loop 2420B  — PURCHASED SERVICE PROVIDER NAME (Situational) Loop Repeat: 1,,,,,,,,
NM1,Segment - NM1 Purchased Service Provider Name (Situational),,,,,,,
2420B.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,QB : Purchase Service Provider,,,,
2420B.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,"1 : Person
2 : Non-Person Entity",,,,
2420B.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code",S,"XX :  Centers for Medicare and Medicaid Services
National Provider Identifier",,,,
2420B.NM109,Identification Code,Code identifying a party or other code,S,,,,,
REF,Segment - REF Purchased Service Provider Secondary Identification (Situational),,,,,,,
2420B.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B: State License Number
1G : Provider UPIN Number
G2 : Provider Commercial Number",,,,
2420B.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,
2420B.REF04.01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,2U : Payer Identification Number,,,,
2420B.REF04.02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,
Loop 2420C  — SERVICE FACILITY LOCATION NAME  (Situational) Loop Repeat: 1,,,,,,,,
NM1,Segment - NM1 Service Facility Location Name (Situational),,,,,,,
2420C.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,77 : Service Location,,,,
2420C.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,2 :Non-Person Entity,,,,
2420C.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,,,
2420C.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code",S,"XX :  Centers for Medicare and Medicaid Services
National Provider Identifier",,,,
2420C.NM109,Identification Code,Code identifying a party or other code,S,,,,,
N3,Segment - N3 Service Facility Location Address (Required),,,,,,,
2420C.N301,Address Information,Address Information,R,,,,,
2420C.N302,Address Information,Address Information,S,,,,,
N4,"Segment - N4 Service Facility Location City, State, ZIP Code (Required)",,,,,,,
2420C.N401,City Name,Free-form text for city name,R,,,,,
2420C.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,,,
2420C.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,,,,
2420C.N404,Country Code,Code identifying the country,S,,,,,
2420C.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,
REF,Segment - REF Service Facility Location Secondary Identification (Situational),,,,,,,
2420C.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"LU : Location Number
G2 : Provider Commercial Number",,,,
2420C.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,
2420C.REF04.01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,2U : Payer Identification Number,,,,
2420C.REF04.02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,
Loop 2420D — SUPERVISING PROVIDER NAME (Situational) Loop Repeat: 1,,,,,,,,
NM1,Segment - NM1 Supervising Provider Name (Situational),,,,,,,
2420D.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,DQ : Supervising Physician,,,,
2420D.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,1 : Person,,,,
2420D.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,Line_Supervising_Physician_LastName,Line Level,
2420D.NM104,Name First,Individual first name,S,,,Line_Supervising_Physician_FirstName,Line Level,
2420D.NM105,Name Middle,Individual middle name or initial,S,,,,,
2420D.NM107,Name Suffix,Suffix to individual name,S,,,,,
2420D.NM108,Identification Code Qualifier,Code designating the system/method of code structure used for Identification Code,S,"XX :  Centers for Medicare and Medicaid Services
National Provider Identifier",,,,
2420D.NM109,Identification Code,Code identifying a party or other code,S,,,,,
REF,Segment - REF Supervising Provider Secondary Identification (Situational),,,,,,,
2420D.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B: State License Number
1G : Provider UPIN Number
G2 : Provider Commercial Number
LU: Location Number",,,,
2420D.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,
2420D.REF04.01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,2U : Payer Identification Number,,,,
2420D.REF04.02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,
Loop 2420E — ORDERING PROVIDER NAME (Situational) Loop Repeat: 1,,,R,,,,,
NM1,Segment - NM1 Ordering Provider Name (Situational),,,,,,,
2420E.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,DK :Ordering Physician,,,,
2420E.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,1 : Person,,,,
2420E.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,Line_Ordering_Physician_LastName,Line Level,
2420E.NM104,Name First,Individual first name,S,,,Line_Ordering_Physician_FirstName,Line Level,
2420E.NM105,Name Middle,Individual middle name or initial,S,,,,,
2420E.NM107,Name Suffix,Suffix to individual name,S,,,,,
2420E.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code (67)",S,"XX :  Centers for Medicare and Medicaid Services
National Provider Identifier",,,,
2420E.NM109,Identification Code,Code identifying a party or other code,S,,,,,
N3,Segment - N3 Ordering Provider Address (Situational),,,,,,,
2420E.N301,Address Information,Address Information,R,,,,,
2420E.N302,Address Information,Address Information,S,,,,,
N4,"Segment - N4 Ordering Provider City, State, ZIP Code (Situational)",,,,,,,
2420E.N401,City Name,Free-form text for city name,R,,,,,
2420E.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,,,
2420E.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,,,,
2420E.N404,Country Code,Code identifying the country,S,,,,,
2420E.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,
REF,Segment - REF Ordering Provider Secondary Identification (Situational),,,,,,,
2420E.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B: State License Number
1G : Provider UPIN Number
G2 : Provider Commercial Number",,,,
2420E.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,
2420E.REF04.01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,2U  :Payer Identification Number,,,,
2420E.REF04.02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,
PER,Segment - PER Ordering Provider Contact Information (Situational),,,,,,,
2420E.PER01,Contact Function Code,Code identifying the major duty or responsibility of the person or group named,R,IC -  Information Contact,,,,
2420E.PER02,Name,Submitter Contact Name,S,<<Submitter Name>>,,,,
2420E.PER03,Communication Number Qualifier,Code identifying the type of communication number,R,"""EM"" : Electronic Mail
""FX"" : Facsimile
""TE"" : Telephone",,,,
2420E.PER04,Communication Number,Complete communications number including country or area code when applicable,R,,,,,
2420E.PER05,Communication Number Qualifier,Code identifying the type of communication number,S,"""EM"" : Electronic Mail
""FX"" : Facsimile
""TE"" : Telephone",,,,
2420E.PER06,Communication Number,Complete communications number including country or area code when applicable,S,,,,,
2420E.PER07,Communication Number Qualifier,Code identifying the type of communication number,S,"""EM"" : Electronic Mail
""FX"" : Facsimile
""TE"" : Telephone",,,,
2420E.PER08,Communication Number,Complete communications number including country or area code when applicable,S,,,,,
Loop 2420F — REFERRING PROVIDER NAME (Situational) Loop Repeat: 2,,,,,,,,
NM1,Segment - NM1 Referring Provider Name (Situational),,,,,,,
2420F.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an individual",R,"DN :Referring Provider
P3 :Primary Care Provider",,,,
2420F.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,,,,,
2420F.NM103,Name Last or Organization Name,Individual last name or organizational name,R,,,,,
2420F.NM104,Name First,Individual first name,S,,,,,
2420F.NM105,Name Middle,Individual middle name or initial,S,,,,,
2420F.NM107,Name Suffix,Suffix to individual name,S,,,,,
2420F.NM108,Identification Code Qualifier,"Code designating the system/method of code structure used for Identification
Code (67)",S,"XX :  Centers for Medicare and Medicaid Services
National Provider Identifier",,,,
2420F.NM109,Identification Code,Code identifying a party or other code,S,,,,,
REF,Segment - REF Referring Provider Secondary Identification (Situational),,,,,,,
2420F.REF01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,"0B: State License Number
1G : Provider UPIN Number
G2 : Provider Commercial Number",,,,
2420F.REF02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,
2420F.REF04.01,Reference Identification Qualifier,Code qualifying the Reference Identification,R,2U : Payer Identification Number,,,,
2420F.REF04.02,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",R,,,,,
Loop 2420G — AMBULANCE PICK-UP LOCATION (Situational) Loop Repeat: 1,,,,,,,,
NM1,Segment - NM1 Ambulance Pick-up Location (Situational),,,,,,,
2420G.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,PW : Pickup Address,,,,
2420G.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,2 : Non-Person Entity,,,,
N3,Segment- N3 Ambulance Pick-up Location Address (Required),,,,,,,
2420G.N301,Address Information,Address Information,R,,,,,
2420G.N302,Address Information,Address Information,S,,,,,
N4,"Segment - N4 Ambulance Pick-up Location City, State, ZIP Code (Required)",,,,,,,
2420G.N401,City Name,Free-form text for city name,R,,,,,
2420G.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,,,
2420G.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,,,,
2420G.N404,Country Code,Code identifying the country,S,,,,,
2420G.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,
Loop 2420H  — AMBULANCE DROP-OFF LOCATION (Situational) Loop Repeat: 1,,,,,,,,
NM1,Segment - NM1 Ambulance Drop-off Location (Situational),,,,,,,
2420H.NM101,Entity Identifier Code,"Code identifying an organizational entity, a physical location, property or an
individual",R,45 :  Drop-off Location,,,,
2420H.NM102,Entity Type Qualifier,Code qualifying the type of entity,R,2 : Non-Person Entity,,,,
2420H.NM103,Name Last or Organization Name,Individual last name or organizational name,S,,,,,
N3,Segment - N3 Ambulance Drop-off Location Address (Required),,,,,,,
2420H.N301,Address Information,Address Information,R,,,,,
2420H.N302,Address Information,Address Information,S,,,,,
N4,"Segment - N4 Ambulance Drop-off Location City, State, ZIP Code (Required)",,,,,,,
2420H.N401,City Name,Free-form text for city name,R,,,,,
2420H.N402,State or Province Code,Code (Standard State/Province) as defined by appropriate government agency,S,,,,,
2420H.N403,Postal Code,Code defining international postal zone code excluding punctuation and blanks (zip code for United States),S,,,,,
2420H.N404,Country Code,Code identifying the country,S,,,,,
2420H.N407,Country Subdivision Code,Code identifying the country subdivision,S,,,,,
Loop 2430   — LINE ADJUDICATION INFORMATION(Situational) Loop Repeat: 15,,,,,,,,
SVD,Segment - SVD Line Adjudication Information (Situational),,,,,,,
2430.SVD01,Identification Code,Code identifying a party or other code,R,,611X1,,,
2430.SVD02,Monetary Amount,Monetary Amount,R,,,,,
2430.SVD03.01,Product/Service ID Qualifier,Code identifying the type/source of the descriptive number used in Product/Service ID,R,"ER : Jurisdiction Specific Procedure and Supply Codes
HC : Health Care Financing Administration Common
Procedural Coding System (HCPCS) Codes
IV :Home Infusion EDI Coalition (HIEC) Product/Service
Code",HC,,,
2430.SVD03.02,Product/Service ID,Identifying number for a product or service,R,,90837,,,
2430.SVD03.03,Procedure Modifier,"This identifies special circumstances related to the performance of the
service, as defined by trading partners",S,,HE,,,
2430.SVD03.04,Procedure Modifier,"This identifies special circumstances related to the performance of the service, as defined by trading partners",S,,GT,,,
2430.SVD03.05,Procedure Modifier,"This identifies special circumstances related to the performance of the service, as defined by trading partners",S,,GT,,,
2430.SVD03.06,Procedure Modifier,"This identifies special circumstances related to the performance of the service, as defined by trading partners",S,,GT,,,
2430.SVD03.07,Description,"A free-form description to clarify the related data elements and their
content",S,,,,,
2430.SVD05,Quantity,Numeric value of quantity/: Paid Service Unit Count,R,,,,,
2430.SVD06,Assigned Number,Number assigned for differentiation within a transaction set/: Bundled or Unbundled Line Number,S,,,,,
CAS,Segment - CAS Line Adjustment (Situational),,,,,,,
2430.CAS01,Claim Adjustment Group Code,Code identifying the general category of payment adjustment,R,"CO : Contractual Obligations
CR : Correction and Reversals
OA : Other adjustments
PI : Payor Initiated Reductions
PR : Patient Responsibility",,,,
2430.CAS02,Claim Adjustment Reason Code,Code identifying the detailed reason the adjustment was made,R,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2430.CAS03,Monetary Amount,Monetary Amount,R,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2430.CAS04,Quantity,Numeric value of quantity,S,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2430.CAS05,Claim Adjustment Reason Code,Code identifying the detailed reason the adjustment was made,R,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2430.CAS06,Monetary Amount,Monetary Amount,R,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2430.CAS07,Quantity,Numeric value of quantity,S,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2430.CAS08,Claim Adjustment Reason Code,Code identifying the detailed reason the adjustment was made,R,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2430.CAS09,Monetary Amount,Monetary Amount,R,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2430.CAS10,Quantity,Numeric value of quantity,S,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2430.CAS11,Claim Adjustment Reason Code,Code identifying the detailed reason the adjustment was made,R,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2430.CAS12,Monetary Amount,Monetary Amount,R,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2430.CAS13,Quantity,Numeric value of quantity,S,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2430.CAS14,Claim Adjustment Reason Code,Code identifying the detailed reason the adjustment was made,R,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2430.CAS15,Monetary Amount,Monetary Amount,R,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2430.CAS16,Quantity,Numeric value of quantity,S,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2430.CAS17,Claim Adjustment Reason Code,Code identifying the detailed reason the adjustment was made,R,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2430.CAS18,Monetary Amount,Monetary Amount,R,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
2430.CAS19,Quantity,Numeric value of quantity,S,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
,,,,,,,,
DTP,Segment - DTP Line Check or Remittance Date (Required),,,,,,,
2430.DTP01,Date/Time Qualifier,"Code specifying type of date or time, or both date and time",R,573 : Date Claim Paid,,,,
2430.DTP02,Date Time Period Format Qualifier,"Code indicating the date format, time format, or date and time format",R,D8 :Date Expressed in Format CCYYMMDD,,,,
2430.DTP03,Date Time Period,"Expression of a date, a time, or range of dates, times or dates and times",R,,20210526,,,
AMT,Segment - AMT Remaining Patient Liability (Situational),,,,,,,
2430.AMT01,Amount Qualifier Code,Code to qualify amounT,R,EAF : Amount Owed,,,,
2430.AMT02,Monetary Amount,Monetary Amount,R,,,,,
Loop 2440  — FORM IDENTIFICATION CODE (Situational) Loop Repeat: >1,,,,,,,,
LQ,Segment - LQ Form Identification Code (Situational),,,,,,,
2440.LQ01,Code List Qualifier Code,Code identifying a specific industry code list,R,"AS : Form Type Code
UT : Centers for Medicare and Medicaid Services (CMS)
Durable Medical Equipment Regional Carrier
(DMERC) Certificate of Medical Necessity (CMN)
Forms",,,,
2440.LQ02,Industry Code,Code indicating a code from a specific industry code list,R,,,,,
FRM,Segment - FRM Supporting Documentation (Required),,,,,,,
2440.FRM01,Assigned Identification,Alphanumeric characters assigned for differentiation within a transaction set,R,,,,,
2440.FRM02,Yes/No Condition or Response Code,Code indicating a Yes or No condition or response/ Question Response,S,"N No
W Not Applicable
Y Yes",,,,
2440.FRM03,Reference Identification,"Reference information as defined for a particular Transaction Set or as specified
by the Reference Identification Qualifier",S,,,,,
2440.FRM04,Date,"Date expressed as CCYYMMDD where CC represents the first two digits of the
calendar year",S,,,,,
2440.FRM05,"Percent, Decimal Format","Percent given in decimal format (e.g., 0.0 through 100.0 represents 0% through
100%)",S,,,,,
Segment SE - Transaction Set Trailer (Required),,,,,,,,
SE,SE Transaction Set Trailer (Required),,R,,,,,
SE01,Number of Included Segments,"Total number of segments included in a transaction set including ST and SE
segments",R,,Count Of ST - 74,,,
SE02,Transaction Set Control Number,"Identifying control number that must be unique within the transaction set
functional group assigned by the originator for a transaction set.  It must be identical to ST02.",R,,ST02 Value - 319003402,,,
Segment GE - Functional Group Trailer  (Required),,,,,,,,
GE,GE Functional Group Trailer (Required),,R,,,,,
GE01,Number of Transaction Sets Included,"Total number of transaction sets included in the functional group or interchange
(transmission) group",R,,Count Of GS - 1,,,
GE02,Group Control Number,Assigned number originated and maintained by the sender .  It must be identical to GS06.,R,,319003402,,,
Segment IEA -  Interchange Control Trailer(Required),,,,,,,,
IEA,IEA Interchange Control Trailer (Required),,R,,,,,
IEA01,Number of Included Functional Groups,A count of the number of functional groups included in an interchange,R,,Count Of ISA - 1,,,
IEA02,Interchange Control Number,A control number assigned by the interchange sender.  It must be identical to ISA13,R,,ISA13 Value - 319003402,,,
```

## QA Automation/EdifecsProduct_MappingSpec_QA Automation_837P_EDI_to_CSVConversion_V1.0.xlsx — Sheet1

```csv
institutionalClaimIBRequestRoot/institutionalClaimIBRequest/institutionalClaimSubmitRequestRecordList/institutionalClaimSubmitRequestRecord/institutionalClaim/supplierInformation/address
```

## QA Automation/EdifecsProduct_MappingSpec_QA Automation_837P_EDI_to_CSVConversion_V1.0.xlsx — Default Values

```csv
Field in CSV,Claim/Line Level Record,Default value/Mapping logic
Claimid,Claim Level/Line Level,An incremental value which is unique for each claim record in the file  (P1/P2/P3).
Scenarios,Claim Level,Blank
EdiFilename,Claim Level,Name of the IB EDI 837P file
totalClaimCount,Claim Level,Total number of claims in the IB file
Entry_Date,Claim Level,Processing date/time in the format: YYYY-MM-DDTHH:mm:ss
Claim_Source,Claim Level,Refer the ClaimsourceLookup crosswalk in IB 837 and populate.
Claim_Delivery_Type,Claim Level,Refer the ClaimsourceLookup crosswalk in IB 837 and populate.
Payee_Type_Field,Claim Level,Hardcode as 'Supplier'
Benefit_Plan_Type,Claim Level,Hardcode as 1 (medical)
claim_Payor_Type,Claim Level,Hardcode as '1 '
End_of_record,Claim Level/Line Level,Hardcode as 'EOR'
```

## QA Automation/EDIFECSProduct_MappingSpec_QA Automation_Advantasure_DFF_to_CSV_conversion_V2.0.xlsx — Cover Page

```csv
Mapping Specification,,,,,,,,,
,,,,,,,,,
Data Extraction for QA automation - Adavntasure Enrollment DFF to CSV,,,,,,,,,
,,,,,,,,,
This document provides the Mapping Specification for converting Adavantasure Enrollment DFF file into CSV format as part of the data extraction for QA automation. Document is intended for EDIFECS Product Team,,,,,,,,,
,,,,,,,,,
,,,,,,,,,
,,,,Version,,0.1,,,
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

## QA Automation/EDIFECSProduct_MappingSpec_QA Automation_Advantasure_DFF_to_CSV_conversion_V2.0.xlsx — Revision History

```csv
Revision History,,,,
,,,,
,,,,
,,,,
V#,Date,Author,Reviewer(s)/ Contributor(s),Comments
0.1,10/11/23,Swedha Kumar,Shijila Muralidharan,Initial Version
1,10/11/23,Swedha Kumar,Shijila Muralidharan,Baselined
2,11/06/24,Ambily Raj,,Updated version
```

## QA Automation/EDIFECSProduct_MappingSpec_QA Automation_Advantasure_DFF_to_CSV_conversion_V2.0.xlsx — CSV Format

```csv
No,Field,Data Type,Length,Data Source,Usage,Sample Format
"All Transaction Types of a member needs to be grouped together and one record should be written to the CSV file. For the initial version of the product,
DEM transaction, 10 occurences of PLN/PWO/LIS/LEP/FLG/PCP/COB/MCD and 5 occurences of M3P  transactions for a member will be mapped to CSV format.",,,,,,
1,Subscriber ID,VARCHAR,10,,R,
2,ClaimsSubscriberIDNumber,VARCHAR,11,Member Details,S,369258147
3,BenefitPlanStartDate_1,VARCHAR,10,PCP/Enroll History,S,20080101
4,BenefitPlanEndDate_1,VARCHAR,10,Sytem logic,S,20081231
5,BenefitPlanStartDate_2,VARCHAR,10,PCP/Enroll History,S,20080101
6,BenefitPlanEndDate_2,VARCHAR,10,Sytem logic,S,20081231
7,BenefitPlanStartDate_3,VARCHAR,10,PCP/Enroll History,S,20080101
8,BenefitPlanEndDate_3,VARCHAR,10,Sytem logic,S,20081231
9,BenefitPlanStartDate_4,VARCHAR,10,PCP/Enroll History,S,20080101
10,BenefitPlanEndDate_4,VARCHAR,10,Sytem logic,S,20081231
11,BenefitPlanStartDate_5,VARCHAR,10,PCP/Enroll History,S,20080101
12,BenefitPlanEndDate_5,VARCHAR,10,Sytem logic,S,20081231
13,BenefitPlanStartDate_6,VARCHAR,10,PCP/Enroll History,S,20080101
14,BenefitPlanEndDate_6,VARCHAR,10,Sytem logic,S,20081231
15,BenefitPlanStartDate_7,VARCHAR,10,PCP/Enroll History,S,20080101
16,BenefitPlanEndDate_7,VARCHAR,10,Sytem logic,S,20081231
17,BenefitPlanStartDate_8,VARCHAR,10,PCP/Enroll History,S,20080101
18,BenefitPlanEndDate_8,VARCHAR,10,Sytem logic,S,20081231
19,BenefitPlanStartDate_9,VARCHAR,10,PCP/Enroll History,S,20080101
20,BenefitPlanEndDate_9,VARCHAR,10,Sytem logic,S,20081231
21,BenefitPlanStartDate_10,VARCHAR,10,PCP/Enroll History,S,20080101
22,BenefitPlanEndDate_10,VARCHAR,10,Sytem logic,S,20081231
23,SubscriberFlag,VARCHAR,1,Member Details,S,Y
24,MBI,VARCHAR,12,Sytem logic,S,357269487A
25,MemberLastName,VARCHAR,50,Member Details,S,Smith
26,MemberFirstName,VARCHAR,50,Member Details,S,John
27,MiddleInitial,VARCHAR,1,Member Details,S,T
28,MemberTitle,VARCHAR,10,Member Details,S,Mr
29,MemberStatus,VARCHAR,20,Member Details,S,ACTIVE
30,AlternateMemberID,VARCHAR,11,Member Details,S,
31,MemberDateofBirth,VARCHAR,10,Member Details,R,19400528
32,MemberDateofDeath,VARCHAR,10,Member Details,S,20080624
33,MemberGender,VARCHAR,10,Member Details,S,M
34,MemberSocialSecurityNumber,VARCHAR,12,Member Details,S,159357852
35,MemberPermanentAddress _1,VARCHAR,55,PCP/Enroll History,S,123 Main Street
36,MemberPermanentAddress_2,VARCHAR,55,PCP/Enroll History,S,Apt 201
37,Member Permanent Address_3,VARCHAR,55,PCP/Enroll History,S,
38,MemberPermanentCity,VARCHAR,30,PCP/Enroll History,S,Cambridge
39,MemberPermanentCounty,VARCHAR,30,PCP/Enroll History,S,Middlesex
40,MemberPermanentState,VARCHAR,2,PCP/Enroll History,S,MA
41,MemberPermanentZipCode,VARCHAR,9,PCP/Enroll History,S,"02138 (5 Digit)
021389999 (9 Digit)"
42,MemberMailingAddress_1,VARCHAR,55,PCP/Enroll History,S,
43,MemberMailingAddress_2,VARCHAR,55,PCP/Enroll History,S,
44,MemberMailingAddress_3,VARCHAR,55,PCP/Enroll History,S,
45,MemberMailingCity,VARCHAR,30,PCP/Enroll History,S,
46,MemberMailingState,VARCHAR,2,PCP/Enroll History,S,
47,MemberMailingZipCode,VARCHAR,9,PCP/Enroll History,S,
48,MemberBillingAddress_1,VARCHAR,55,PCP/Enroll History,S,
49,MemberBillingAddress_2,VARCHAR,55,PCP/Enroll History,S,
50,MemberBillingAddress_3,VARCHAR,55,PCP/Enroll History,S,
51,MemberBillingCity,VARCHAR,30,PCP/Enroll History,S,
52,MemberBillingState,VARCHAR,2,PCP/Enroll History,S,
53,MemberBillingZipCode,VARCHAR,9,PCP/Enroll History,S,
54,MemberHomePhoneNumber,VARCHAR,10,Member Details,S,5552227654
55,AlternateMemberPhoneNumber,VARCHAR,10,Member Details,S,5552345612
56,MemberEmailAddress,VARCHAR,60,Member Details,S,jsmith@add ress.com
57,FirstNameofEmergencyContact,VARCHAR,100,Member Details,S,Jane
58,LastNameofEmergencyContact,VARCHAR,100,Member Details,S,Good
59,EmergencyContactRelationshiptoMember,VARCHAR,50,Member Details,S,Daughter
60,EmergencyContactPhoneNumber,VARCHAR,10,Member Details,S,5551347629
61,EndangeredMemberFlag,VARCHAR,1,Member Details,S,Y
62,MedicaidID,VARCHAR,14,Member Details,S,612452885
63,MedicarePartAEffDate,VARCHAR,10,IEQ,S,20000101
64,MedicarePartAEndDate,VARCHAR,10,IEQ,S,
65,MedicarePartBEffDate,VARCHAR,10,IEQ,S,20020301
66,MedicarePartBEndDate,VARCHAR,10,IEQ,S,
67,MedicarePartDEffDate,VARCHAR,10,IEQ,S,20020401
68,MedicarePartDEndDate,VARCHAR,10,IEQ,S,20120430
69,LanguageCode,VARCHAR,3,Member Details,S,SPA
70,AlternativeFormatLargePrint,VARCHAR,1,Member Details,S,Y
71,AlternativeFormatBraille,VARCHAR,1,Member Details,S,Y
72,AlternativeFormatAudioTape,VARCHAR,1,Member Details,S,Y
73,FaxNumber,VARCHAR,10,Member Details,S,8885552222
74,AuthorizedRepFirstName,VARCHAR,105,Member Details,S,Nancy
75,AuthorizedRepLastName,VARCHAR,105,Member Details,S,James
76,AuthorizedRepAddress_1,VARCHAR,55,Member Details,S,123 Main
77,AuthorizedRepAddress_2,VARCHAR,55,Member Details,S,Apt 2
78,AuthorizedRepAddress_3,VARCHAR,55,Member Details,S,
79,AuthorizedRepCity,VARCHAR,30,Member Details,S,Las Vegas
80,AuthorizedRepCounty,VARCHAR,30,Member Details,S,Henderson
81,AuthorizedRepState,VARCHAR,2,Member Details,S,NV
82,AuthorizedRepZipCode,VARCHAR,9,Member Details,S,
83,AuthorizedRepPhoneNumber,VARCHAR,10,Member Details,S,5554445678
84,AuthorizedRepRelationship,VARCHAR,30,Member Details,S,Son
85,Race_1,VARCHAR,10,Member Details,S,1001
86,Race_2,VARCHAR,10,Member Details,S,1002
87,Race_3,VARCHAR,10,Member Details,S,1003
88,Race_4,VARCHAR,10,Member Details,S,1004
89,Race_5,VARCHAR,10,Member Details,S,1005
90,Ethnicity_1,VARCHAR,10,Member Details,S,CUB
91,Ethnicity_2,VARCHAR,10,Member Details,S,CUB
92,Ethnicity_3,VARCHAR,10,Member Details,S,CUB
93,Ethnicity_4,VARCHAR,10,Member Details,S,CUB
94,Ethnicity_5,VARCHAR,10,Member Details,S,CUB
95,ProviderNumber_1,VARCHAR,25,PCP/Enroll History,S,IM29867
96,PCP_Startdate1,VARCHAR,10,PCP/Enroll History,S,
97,PCP_Enddate1,VARCHAR,10,PCP/Enroll History,S,
98,ProviderNumber_2,VARCHAR,25,PCP/Enroll History,S,IM29868
99,PCP_Startdate2,VARCHAR,10,PCP/Enroll History,S,
100,PCP_Enddate2,VARCHAR,10,PCP/Enroll History,S,
101,ProviderNumber_3,VARCHAR,25,PCP/Enroll History,S,IM29869
102,PCP_Startdate3,VARCHAR,10,PCP/Enroll History,S,
103,PCP_Enddate3,VARCHAR,10,PCP/Enroll History,S,
104,ProviderNumber_4,VARCHAR,25,PCP/Enroll History,S,IM29870
105,PCP_Startdate4,VARCHAR,10,PCP/Enroll History,S,
106,PCP_Enddate4,VARCHAR,10,PCP/Enroll History,S,
107,ProviderNumber_5,VARCHAR,25,PCP/Enroll History,S,IM29871
108,PCP_Startdate5,VARCHAR,10,PCP/Enroll History,S,
109,PCP_Enddate5,VARCHAR,10,PCP/Enroll History,S,
110,ProviderNumber_6,VARCHAR,25,PCP/Enroll History,S,IM29872
111,PCP_Startdate6,VARCHAR,10,PCP/Enroll History,S,
112,PCP_Enddate6,VARCHAR,10,PCP/Enroll History,S,
113,ProviderNumber_7,VARCHAR,25,PCP/Enroll History,S,IM29873
114,PCP_Startdate7,VARCHAR,10,PCP/Enroll History,S,
115,PCP_Enddate7,VARCHAR,10,PCP/Enroll History,S,
116,ProviderNumber_8,VARCHAR,25,PCP/Enroll History,S,IM29874
117,PCP_Startdate8,VARCHAR,10,PCP/Enroll History,S,
118,PCP_Enddate8,VARCHAR,10,PCP/Enroll History,S,
119,ProviderNumber_9,VARCHAR,25,PCP/Enroll History,S,IM29875
120,PCP_Startdate9,VARCHAR,10,PCP/Enroll History,S,
121,PCP_Enddate9,VARCHAR,10,PCP/Enroll History,S,
122,ProviderNumber_10,VARCHAR,25,PCP/Enroll History,S,IM29876
123,PCP_Startdate10,VARCHAR,10,PCP/Enroll History,S,
124,PCP_Enddate10,VARCHAR,10,PCP/Enroll History,S,
125,LEPNumberofUncoveredMonths_1,VARCHAR,3,PCP/Enroll History,S,18
126,PartDLEPAmount_1,VARCHAR,6,PCP/Enroll History,S,4.40
127,PartDLEPWaivedAmount_1,VARCHAR,6,PCP/Enroll History,S,1.00
128,PartDLEPSubsidyAmount_1,VARCHAR,6,PCP/Enroll History,S,1.00
129,PartDLEPStartdate1,VARCHAR,10,PCP/Enroll History,S,
130,PartDLEPEnddate1,VARCHAR,10,PCP/Enroll History,S,
131,LEPNumberofUncoveredMonths_2,VARCHAR,3,PCP/Enroll History,S,18
132,PartDLEPAmount_2,VARCHAR,6,PCP/Enroll History,S,4.40
133,PartDLEPWaivedAmount_2,VARCHAR,6,PCP/Enroll History,S,1.00
134,PartDLEPSubsidyAmount_2,VARCHAR,6,PCP/Enroll History,S,1.00
135,PartDLEPStartdate2,VARCHAR,10,PCP/Enroll History,S,
136,PartDLEPEnddate2,VARCHAR,10,PCP/Enroll History,S,
137,LEPNumberofUncoveredMonths_3,VARCHAR,3,PCP/Enroll History,S,18
138,PartDLEPAmount_3,VARCHAR,6,PCP/Enroll History,S,4.40
139,PartDLEPWaivedAmount_3,VARCHAR,6,PCP/Enroll History,S,1.00
140,PartDLEPSubsidyAmount_3,VARCHAR,6,PCP/Enroll History,S,1.00
141,PartDLEPStartdate3,VARCHAR,10,PCP/Enroll History,S,
142,PartDLEPEnddate3,VARCHAR,10,PCP/Enroll History,S,
143,LEPNumberofUncoveredMonths_4,VARCHAR,3,PCP/Enroll History,S,18
144,PartDLEPAmount_4,VARCHAR,6,PCP/Enroll History,S,4.40
145,PartDLEPWaivedAmount_4,VARCHAR,6,PCP/Enroll History,S,1.00
146,PartDLEPSubsidyAmount_4,VARCHAR,6,PCP/Enroll History,S,1.00
147,PartDLEPStartdate4,VARCHAR,10,PCP/Enroll History,S,
148,PartDLEPEnddate4,VARCHAR,10,PCP/Enroll History,S,
149,LEPNumberofUncoveredMonths_5,VARCHAR,3,PCP/Enroll History,S,18
150,PartDLEPAmount_5,VARCHAR,6,PCP/Enroll History,S,4.40
151,PartDLEPWaivedAmount_5,VARCHAR,6,PCP/Enroll History,S,1.00
152,PartDLEPSubsidyAmount_5,VARCHAR,6,PCP/Enroll History,S,1.00
153,PartDLEPStartdate5,VARCHAR,10,PCP/Enroll History,S,
154,PartDLEPEnddate5,VARCHAR,10,PCP/Enroll History,S,
155,LEPNumberofUncoveredMonths_6,VARCHAR,3,PCP/Enroll History,S,18
156,PartDLEPAmount_6,VARCHAR,6,PCP/Enroll History,S,4.40
157,PartDLEPWaivedAmount_6,VARCHAR,6,PCP/Enroll History,S,1.00
158,PartDLEPSubsidyAmount_6,VARCHAR,6,PCP/Enroll History,S,1.00
159,PartDLEPStartdate6,VARCHAR,10,PCP/Enroll History,S,
160,PartDLEPEnddate6,VARCHAR,10,PCP/Enroll History,S,
161,LEPNumberofUncoveredMonths_7,VARCHAR,3,PCP/Enroll History,S,18
162,PartDLEPAmount_7,VARCHAR,6,PCP/Enroll History,S,4.40
163,PartDLEPWaivedAmount_7,VARCHAR,6,PCP/Enroll History,S,1.00
164,PartDLEPSubsidyAmount_7,VARCHAR,6,PCP/Enroll History,S,1.00
165,PartDLEPStartdate7,VARCHAR,10,PCP/Enroll History,S,
166,PartDLEPEnddate7,VARCHAR,10,PCP/Enroll History,S,
167,LEPNumberofUncoveredMonths_8,VARCHAR,3,PCP/Enroll History,S,18
168,PartDLEPAmount_8,VARCHAR,6,PCP/Enroll History,S,4.40
169,PartDLEPWaivedAmount_8,VARCHAR,6,PCP/Enroll History,S,1.00
170,PartDLEPSubsidyAmount_8,VARCHAR,6,PCP/Enroll History,S,1.00
171,PartDLEPStartdate8,VARCHAR,10,PCP/Enroll History,S,
172,PartDLEPEnddate8,VARCHAR,10,PCP/Enroll History,S,
173,LEPNumberofUncoveredMonths_9,VARCHAR,3,PCP/Enroll History,S,18
174,PartDLEPAmount_9,VARCHAR,6,PCP/Enroll History,S,4.40
175,PartDLEPWaivedAmount_9,VARCHAR,6,PCP/Enroll History,S,1.00
176,PartDLEPSubsidyAmount_9,VARCHAR,6,PCP/Enroll History,S,1.00
177,PartDLEPStartdate9,VARCHAR,10,PCP/Enroll History,S,
178,PartDLEPEnddate9,VARCHAR,10,PCP/Enroll History,S,
179,LEPNumberofUncoveredMonths_10,VARCHAR,3,PCP/Enroll History,S,18
180,PartDLEPAmount_10,VARCHAR,6,PCP/Enroll History,S,4.40
181,PartDLEPWaivedAmount_10,VARCHAR,6,PCP/Enroll History,S,1.00
182,PartDLEPSubsidyAmount_10,VARCHAR,6,PCP/Enroll History,S,1.00
183,PartDLEPStartdate10,VARCHAR,10,PCP/Enroll History,S,
184,PartDLEPEnddate10,VARCHAR,10,PCP/Enroll History,S,
185,CurrentLISPremiumSubsidy_1,VARCHAR,6,PCP/Enroll History,S,34.20
186,PartDLISSubsidyLevel_1,VARCHAR,3,PCP/Enroll History,S,50
187,PartDLISCopayCategory_1,VARCHAR,1,PCP/Enroll History,S,4
188,PartDLISPStartdate1,VARCHAR,10,PCP/Enroll History,S,
189,PartDLISEnddate1,VARCHAR,10,PCP/Enroll History,S,
190,CurrentLISPremiumSubsidy_2,VARCHAR,6,PCP/Enroll History,S,34.20
191,PartDLISSubsidyLevel_2,VARCHAR,3,PCP/Enroll History,S,50
192,PartDLISCopayCategory_2,VARCHAR,1,PCP/Enroll History,S,4
193,PartDLISStartdate2,VARCHAR,10,PCP/Enroll History,S,
194,PartDLISEnddate2,VARCHAR,10,PCP/Enroll History,S,
195,CurrentLISPremiumSubsidy_3,VARCHAR,6,PCP/Enroll History,S,34.20
196,PartDLISSubsidyLevel_3,VARCHAR,3,PCP/Enroll History,S,50
197,PartDLISCopayCategory_3,VARCHAR,1,PCP/Enroll History,S,4
198,PartDLISStartdate3,VARCHAR,10,PCP/Enroll History,S,
199,PartDLISEnddate3,VARCHAR,10,PCP/Enroll History,S,
200,CurrentLISPremiumSubsidy_4,VARCHAR,6,PCP/Enroll History,S,34.20
201,PartDLISSubsidyLevel_4,VARCHAR,3,PCP/Enroll History,S,50
202,PartDLISCopayCategory_4,VARCHAR,1,PCP/Enroll History,S,4
203,PartDLISStartdate4,VARCHAR,10,PCP/Enroll History,S,
204,PartDLISEnddate4,VARCHAR,10,PCP/Enroll History,S,
205,CurrentLISPremiumSubsidy_5,VARCHAR,6,PCP/Enroll History,S,34.20
206,PartDLISSubsidyLevel_5,VARCHAR,3,PCP/Enroll History,S,50
207,PartDLISCopayCategory_5,VARCHAR,1,PCP/Enroll History,S,4
208,PartDLISStartdate5,VARCHAR,10,PCP/Enroll History,S,
209,PartDLISEnddate5,VARCHAR,10,PCP/Enroll History,S,
210,CurrentLISPremiumSubsidy_6,VARCHAR,6,PCP/Enroll History,S,34.20
211,PartDLISSubsidyLevel_6,VARCHAR,3,PCP/Enroll History,S,50
212,PartDLISCopayCategory_6,VARCHAR,1,PCP/Enroll History,S,4
213,PartDLISStartdate6,VARCHAR,10,PCP/Enroll History,S,
214,PartDLISEnddate6,VARCHAR,10,PCP/Enroll History,S,
215,CurrentLISPremiumSubsidy_7,VARCHAR,6,PCP/Enroll History,S,34.20
216,PartDLISSubsidyLevel_7,VARCHAR,3,PCP/Enroll History,S,50
217,PartDLISCopayCategory_7,VARCHAR,1,PCP/Enroll History,S,4
218,PartDLISStartdate7,VARCHAR,10,PCP/Enroll History,S,
219,PartDLISEnddate7,VARCHAR,10,PCP/Enroll History,S,
220,CurrentLISPremiumSubsidy_8,VARCHAR,6,PCP/Enroll History,S,34.20
221,PartDLISSubsidyLevel_8,VARCHAR,3,PCP/Enroll History,S,50
222,PartDLISCopayCategory_8,VARCHAR,1,PCP/Enroll History,S,4
223,PartDLISStartdate8,VARCHAR,10,PCP/Enroll History,S,
224,PartDLISEnddate8,VARCHAR,10,PCP/Enroll History,S,
225,CurrentLISPremiumSubsidy_9,VARCHAR,6,PCP/Enroll History,S,34.20
226,PartDLISSubsidyLevel_9,VARCHAR,3,PCP/Enroll History,S,50
227,PartDLISCopayCategory_9,VARCHAR,1,PCP/Enroll History,S,4
228,PartDLISStartdate9,VARCHAR,10,PCP/Enroll History,S,
229,PartDLISEnddate9,VARCHAR,10,PCP/Enroll History,S,
230,CurrentLISPremiumSubsidy_10,VARCHAR,6,PCP/Enroll History,S,34.20
231,PartDLISSubsidyLevel_10,VARCHAR,3,PCP/Enroll History,S,50
232,PartDLISCopayCategory_10,VARCHAR,1,PCP/Enroll History,S,4
233,PartDLISStartdate10,VARCHAR,10,PCP/Enroll History,S,
234,PartDLISEnddate10,VARCHAR,10,PCP/Enroll History,S,
235,ContractNumber_1,VARCHAR,5,PCP/Enroll History,S,H1234
236,ContractNumber_2,VARCHAR,5,PCP/Enroll History,S,H1234
237,ContractNumber_3,VARCHAR,5,PCP/Enroll History,S,H1234
238,ContractNumber_4,VARCHAR,5,PCP/Enroll History,S,H1234
239,ContractNumber_5,VARCHAR,5,PCP/Enroll History,S,H1234
240,ContractNumber_6,VARCHAR,5,PCP/Enroll History,S,H1234
241,ContractNumber_7,VARCHAR,5,PCP/Enroll History,S,H1234
242,ContractNumber_8,VARCHAR,5,PCP/Enroll History,S,H1234
243,ContractNumber_9,VARCHAR,5,PCP/Enroll History,S,H1234
244,ContractNumber_10,VARCHAR,5,PCP/Enroll History,S,H1234
245,PBPNumber_1,VARCHAR,3,PCP/Enroll History,S,067
246,PBPNumber_2,VARCHAR,3,PCP/Enroll History,S,067
247,PBPNumber_3,VARCHAR,3,PCP/Enroll History,S,067
248,PBPNumber_4,VARCHAR,3,PCP/Enroll History,S,067
249,PBPNumber_5,VARCHAR,3,PCP/Enroll History,S,067
250,PBPNumber_6,VARCHAR,3,PCP/Enroll History,S,067
251,PBPNumber_7,VARCHAR,3,PCP/Enroll History,S,067
252,PBPNumber_8,VARCHAR,3,PCP/Enroll History,S,067
253,PBPNumber_9,VARCHAR,3,PCP/Enroll History,S,067
254,PBPNumber_10,VARCHAR,3,PCP/Enroll History,S,067
255,GroupID_1,VARCHAR,25,Claims Eligibilty,S,56129R
256,GroupID_2,VARCHAR,25,Claims Eligibilty,S,56129R
257,GroupID_3,VARCHAR,25,Claims Eligibilty,S,56129R
258,GroupID_4,VARCHAR,25,Claims Eligibilty,S,56129R
259,GroupID_5,VARCHAR,25,Claims Eligibilty,S,56129R
260,GroupID_6,VARCHAR,25,Claims Eligibilty,S,56129R
261,GroupID_7,VARCHAR,25,Claims Eligibilty,S,56129R
262,GroupID_8,VARCHAR,25,Claims Eligibilty,S,56129R
263,GroupID_9,VARCHAR,25,Claims Eligibilty,S,56129R
264,GroupID_10,VARCHAR,25,Claims Eligibilty,S,56129R
265,DisenrollmentReasoncode_DRC_1,VARCHAR,2,Plan Span,S,
266,DisenrollmentReasoncode_DRC_2,VARCHAR,2,Plan Span,S,
267,DisenrollmentReasoncode_DRC_3,VARCHAR,2,Plan Span,S,
268,DisenrollmentReasoncode_DRC_4,VARCHAR,2,Plan Span,S,
269,DisenrollmentReasoncode_DRC_5,VARCHAR,2,Plan Span,S,
270,DisenrollmentReasoncode_DRC_6,VARCHAR,2,Plan Span,S,
271,DisenrollmentReasoncode_DRC_7,VARCHAR,2,Plan Span,S,
272,DisenrollmentReasoncode_DRC_8,VARCHAR,2,Plan Span,S,
273,DisenrollmentReasoncode_DRC_9,VARCHAR,2,Plan Span,S,
274,DisenrollmentReasoncode_DRC_10,VARCHAR,2,Plan Span,S,
275,SignatureDate_1,VARCHAR,10,Application data,S,20120210
276,SignatureDate_2,VARCHAR,10,Application data,S,20120210
277,SignatureDate_3,VARCHAR,10,Application data,S,20120210
278,SignatureDate_4,VARCHAR,10,Application data,S,20120210
279,SignatureDate_5,VARCHAR,10,Application data,S,20120210
280,SignatureDate_6,VARCHAR,10,Application data,S,20120210
281,SignatureDate_7,VARCHAR,10,Application data,S,20120210
282,SignatureDate_8,VARCHAR,10,Application data,S,20120210
283,SignatureDate_9,VARCHAR,10,Application data,S,20120210
284,SignatureDate_10,VARCHAR,10,Application data,S,20120210
285,ElectionType_1,VARCHAR,300,Application data,S,
286,ElectionType_2,VARCHAR,300,Application data,S,
287,ElectionType_3,VARCHAR,300,Application data,S,
288,ElectionType_4,VARCHAR,300,Application data,S,
289,ElectionType_5,VARCHAR,300,Application data,S,
290,ElectionType_6,VARCHAR,300,Application data,S,
291,ElectionType_7,VARCHAR,300,Application data,S,
292,ElectionType_8,VARCHAR,300,Application data,S,
293,ElectionType_9,VARCHAR,300,Application data,S,
294,ElectionType_10,VARCHAR,300,Application data,S,
295,PWOStartdate_1,VARCHAR,10,,S,
296,PWOEnddate_1,VARCHAR,10,,S,
297,PaymentMethodType_1,VARCHAR,20,,S,SSA
298,PremiumWithholdOption_1,VARCHAR,1,,S,SSA
299,PWOStartdate_2,VARCHAR,10,,S,
300,PWOEnddate_2,VARCHAR,10,,S,
301,PaymentMethodType_2,VARCHAR,20,,S,SSA
302,PremiumWithholdOption_2,VARCHAR,1,,S,SSA
303,PWOStartdate_3,VARCHAR,10,,S,
304,PWOEnddate_3,VARCHAR,10,,S,
305,PaymentMethodType_3,VARCHAR,20,,S,SSA
306,PremiumWithholdOption_3,VARCHAR,1,,S,SSA
307,PWOStartdate_4,VARCHAR,10,,S,
308,PWOEnddate_4,VARCHAR,10,,S,
309,PaymentMethodType_4,VARCHAR,20,,S,SSA
310,PremiumWithholdOption_4,VARCHAR,1,,S,SSA
311,PWOStartdate_5,VARCHAR,10,,S,
312,PWOEnddate_5,VARCHAR,10,,S,
313,PaymentMethodType_5,VARCHAR,20,,S,SSA
314,PremiumWithholdOption_5,VARCHAR,1,,S,SSA
315,PWOStartdate_6,VARCHAR,10,,S,
316,PWOEnddate_6,VARCHAR,10,,S,
317,PaymentMethodType_6,VARCHAR,20,,S,SSA
318,PremiumWithholdOption_6,VARCHAR,1,,S,SSA
319,PWOStartdate_7,VARCHAR,10,,S,
320,PWOEnddate_7,VARCHAR,10,,S,
321,PaymentMethodType_7,VARCHAR,20,,S,SSA
322,PremiumWithholdOption_7,VARCHAR,1,,S,SSA
323,PWOStartdate_8,VARCHAR,10,,S,
324,PWOEnddate_8,VARCHAR,10,,S,
325,PaymentMethodType_8,VARCHAR,20,,S,SSA
326,PremiumWithholdOption_8,VARCHAR,1,,S,SSA
327,PWOStartdate_9,VARCHAR,10,,S,
328,PWOEnddate_9,VARCHAR,10,,S,
329,PaymentMethodType_9,VARCHAR,20,,S,SSA
330,PremiumWithholdOption_9,VARCHAR,1,,S,SSA
331,PWOStartdate_10,VARCHAR,10,,S,
332,PWOEnddate_10,VARCHAR,10,,S,
333,PaymentMethodType_10,VARCHAR,20,,S,SSA
334,PremiumWithholdOption_10,VARCHAR,1,,S,SSA
335,HospiceFlag_1,VARCHAR,1,PCP/Enroll History,S,Y
336,HospiceFlagStartdate_1,VARCHAR,10,PCP/Enroll History,S,
337,HospiceFlagEnddate_1,VARCHAR,10,PCP/Enroll History,S,
338,HospiceFlag_2,VARCHAR,1,PCP/Enroll History,S,Y
339,HospiceFlagStartdate_2,VARCHAR,10,PCP/Enroll History,S,
340,HospiceFlagEnddate_2,VARCHAR,10,PCP/Enroll History,S,
341,HospiceFlag_3,VARCHAR,1,PCP/Enroll History,S,
342,HospiceFlagStartdate_3,VARCHAR,10,PCP/Enroll History,S,
343,HospiceFlagEnddate_3,VARCHAR,10,PCP/Enroll History,S,
344,HospiceFlag_4,VARCHAR,1,PCP/Enroll History,S,
345,HospiceFlagStartdate_4,VARCHAR,10,PCP/Enroll History,S,
346,HospiceFlagEnddate_4,VARCHAR,10,PCP/Enroll History,S,
347,HospiceFlag_5,VARCHAR,1,PCP/Enroll History,S,
348,HospiceFlagStartdate_5,VARCHAR,10,PCP/Enroll History,S,
349,HospiceFlagEnddate_5,VARCHAR,10,PCP/Enroll History,S,
350,HospiceFlag_6,VARCHAR,1,PCP/Enroll History,S,
351,HospiceFlagStartdate_6,VARCHAR,10,PCP/Enroll History,S,
352,HospiceFlagEnddate_6,VARCHAR,10,PCP/Enroll History,S,
353,HospiceFlag_7,VARCHAR,1,PCP/Enroll History,S,
354,HospiceFlagStartdate_7,VARCHAR,10,PCP/Enroll History,S,
355,HospiceFlagEnddate_7,VARCHAR,10,PCP/Enroll History,S,
356,HospiceFlag_8,VARCHAR,1,PCP/Enroll History,S,
357,HospiceFlagStartdate_8,VARCHAR,10,PCP/Enroll History,S,
358,HospiceFlagEnddate_8,VARCHAR,10,PCP/Enroll History,S,
359,HospiceFlag_9,VARCHAR,1,PCP/Enroll History,S,
360,HospiceFlagStartdate_9,VARCHAR,10,PCP/Enroll History,S,
361,HospiceFlagEnddate_9,VARCHAR,10,PCP/Enroll History,S,
362,HospiceFlag_10,VARCHAR,1,PCP/Enroll History,S,
363,HospiceFlagStartdate_10,VARCHAR,10,PCP/Enroll History,S,
364,HospiceFlagEnddate_10,VARCHAR,10,PCP/Enroll History,S,
365,MedicaidFlag_1,VARCHAR,1,PCP/Enroll History,S,Y
366,MedicaidFlagStratDate_1,VARCHAR,10,PCP/Enroll History,S,
367,MedicaidFlagEndDate_1,VARCHAR,10,PCP/Enroll History,S,
368,MedicaidFlag_2,VARCHAR,1,PCP/Enroll History,S,Y
369,MedicaidFlagStratDate_2,VARCHAR,10,PCP/Enroll History,S,
370,MedicaidFlagEndDate_2,VARCHAR,10,PCP/Enroll History,S,
371,MedicaidFlag_3,VARCHAR,1,PCP/Enroll History,S,
372,MedicaidFlagStratDate_3,VARCHAR,10,PCP/Enroll History,S,
373,MedicaidFlagEndDate_3,VARCHAR,10,PCP/Enroll History,S,
374,MedicaidFlag_4,VARCHAR,1,PCP/Enroll History,S,
375,MedicaidFlagStratDate_4,VARCHAR,10,PCP/Enroll History,S,
376,MedicaidFlagEndDate_4,VARCHAR,10,PCP/Enroll History,S,
377,MedicaidFlag_5,VARCHAR,1,PCP/Enroll History,S,
378,MedicaidFlagStratDate_5,VARCHAR,10,PCP/Enroll History,S,
379,MedicaidFlagEndDate_5,VARCHAR,10,PCP/Enroll History,S,
380,MedicaidFlag_6,VARCHAR,1,PCP/Enroll History,S,
381,MedicaidFlagStratDate_6,VARCHAR,10,PCP/Enroll History,S,
382,MedicaidFlagEndDate_6,VARCHAR,10,PCP/Enroll History,S,
383,MedicaidFlag_7,VARCHAR,1,PCP/Enroll History,S,
384,MedicaidFlagStratDate_7,VARCHAR,10,PCP/Enroll History,S,
385,MedicaidFlagEndDate_7,VARCHAR,10,PCP/Enroll History,S,
386,MedicaidFlag_8,VARCHAR,1,PCP/Enroll History,S,
387,MedicaidFlagStratDate_8,VARCHAR,10,PCP/Enroll History,S,
388,MedicaidFlagEndDate_8,VARCHAR,10,PCP/Enroll History,S,
389,MedicaidFlag_9,VARCHAR,1,PCP/Enroll History,S,
390,MedicaidFlagStratDate_9,VARCHAR,10,PCP/Enroll History,S,
391,MedicaidFlagEndDate_9,VARCHAR,10,PCP/Enroll History,S,
392,MedicaidFlag_10,VARCHAR,1,PCP/Enroll History,S,
393,MedicaidFlagStratDate_10,VARCHAR,10,PCP/Enroll History,S,
394,MedicaidFlagEndDate_10,VARCHAR,10,PCP/Enroll History,S,
395,InstitutionalFlag_1,VARCHAR,1,PCP/Enroll History,S,Y
396,InstitutionalFlagStartDate_1,VARCHAR,10,PCP/Enroll History,S,
397,InstitutionalFlagEndDate_1,VARCHAR,10,PCP/Enroll History,S,
398,InstitutionalFlag_2,VARCHAR,1,PCP/Enroll History,S,Y
399,InstitutionalFlagStartDate_2,VARCHAR,10,PCP/Enroll History,S,
400,InstitutionalFlagEndDate_2,VARCHAR,10,PCP/Enroll History,S,
401,InstitutionalFlag_3,VARCHAR,1,PCP/Enroll History,S,
402,InstitutionalFlagStartDate_3,VARCHAR,10,PCP/Enroll History,S,
403,InstitutionalFlagEndDate_3,VARCHAR,10,PCP/Enroll History,S,
404,InstitutionalFlag_4,VARCHAR,1,PCP/Enroll History,S,
405,InstitutionalFlagStartDate_4,VARCHAR,10,PCP/Enroll History,S,
406,InstitutionalFlagEndDate_4,VARCHAR,10,PCP/Enroll History,S,
407,InstitutionalFlag_5,VARCHAR,1,PCP/Enroll History,S,
408,InstitutionalFlagStartDate_5,VARCHAR,10,PCP/Enroll History,S,
409,InstitutionalFlagEndDate_5,VARCHAR,10,PCP/Enroll History,S,
410,InstitutionalFlag_6,VARCHAR,1,PCP/Enroll History,S,
411,InstitutionalFlagStartDate_6,VARCHAR,10,PCP/Enroll History,S,
412,InstitutionalFlagEndDate_6,VARCHAR,10,PCP/Enroll History,S,
413,InstitutionalFlag_7,VARCHAR,1,PCP/Enroll History,S,
414,InstitutionalFlagStartDate_7,VARCHAR,10,PCP/Enroll History,S,
415,InstitutionalFlagEndDate_7,VARCHAR,10,PCP/Enroll History,S,
416,InstitutionalFlag_8,VARCHAR,1,PCP/Enroll History,S,
417,InstitutionalFlagStartDate_8,VARCHAR,10,PCP/Enroll History,S,
418,InstitutionalFlagEndDate_8,VARCHAR,10,PCP/Enroll History,S,
419,InstitutionalFlag_9,VARCHAR,1,PCP/Enroll History,S,
420,InstitutionalFlagStartDate_9,VARCHAR,10,PCP/Enroll History,S,
421,InstitutionalFlagEndDate_9,VARCHAR,10,PCP/Enroll History,S,
422,InstitutionalFlag_10,VARCHAR,1,PCP/Enroll History,S,
423,InstitutionalFlagStartDate_10,VARCHAR,10,PCP/Enroll History,S,
424,InstitutionalFlagEndDate_10,VARCHAR,10,PCP/Enroll History,S,
425,ESRDFlag_1,VARCHAR,1,PCP/Enroll History,S,Y
426,ESRDFlagStartDate_1,VARCHAR,10,PCP/Enroll History,S,
427,ESRDFlagEndDate_1,VARCHAR,10,PCP/Enroll History,S,
428,ESRDFlag_2,VARCHAR,1,PCP/Enroll History,S,Y
429,ESRDFlagStartDate_2,VARCHAR,10,PCP/Enroll History,S,
430,ESRDFlagEndDate_2,VARCHAR,10,PCP/Enroll History,S,
431,ESRDFlag_3,VARCHAR,1,PCP/Enroll History,S,
432,ESRDFlagStartDate_3,VARCHAR,10,PCP/Enroll History,S,
433,ESRDFlagEndDate_3,VARCHAR,10,PCP/Enroll History,S,
434,ESRDFlag_4,VARCHAR,1,PCP/Enroll History,S,
435,ESRDFlagStartDate_4,VARCHAR,10,PCP/Enroll History,S,
436,ESRDFlagEndDate_4,VARCHAR,10,PCP/Enroll History,S,
437,ESRDFlag_5,VARCHAR,1,PCP/Enroll History,S,
438,ESRDFlagStartDate_5,VARCHAR,10,PCP/Enroll History,S,
439,ESRDFlagEndDate_5,VARCHAR,10,PCP/Enroll History,S,
440,ESRDFlag_6,VARCHAR,1,PCP/Enroll History,S,
441,ESRDFlagStartDate_6,VARCHAR,10,PCP/Enroll History,S,
442,ESRDFlagEndDate_6,VARCHAR,10,PCP/Enroll History,S,
443,ESRDFlag_7,VARCHAR,1,PCP/Enroll History,S,
444,ESRDFlagStartDate_7,VARCHAR,10,PCP/Enroll History,S,
445,ESRDFlagEndDate_7,VARCHAR,10,PCP/Enroll History,S,
446,ESRDFlag_8,VARCHAR,1,PCP/Enroll History,S,
447,ESRDFlagStartDate_8,VARCHAR,10,PCP/Enroll History,S,
448,ESRDFlagEndDate_8,VARCHAR,10,PCP/Enroll History,S,
449,ESRDFlag_9,VARCHAR,1,PCP/Enroll History,S,
450,ESRDFlagStartDate_9,VARCHAR,10,PCP/Enroll History,S,
451,ESRDFlagEndDate_9,VARCHAR,10,PCP/Enroll History,S,
452,ESRDFlag_10,VARCHAR,1,PCP/Enroll History,S,
453,ESRDFlagStartDate_10,VARCHAR,10,PCP/Enroll History,S,
454,ESRDFlagEndDate_10,VARCHAR,10,PCP/Enroll History,S,
455,TransplantFlag_1,VARCHAR,1,PCP/Enroll History,S,Y
456,TransplantFlagStartDate_1,VARCHAR,10,PCP/Enroll History,S,
457,TransplantFlagEndDate_1,VARCHAR,10,PCP/Enroll History,S,
458,TransplantFlag_2,VARCHAR,1,PCP/Enroll History,S,Y
459,TransplantFlagStartDate_2,VARCHAR,10,PCP/Enroll History,S,
460,TransplantFlagEndDate_2,VARCHAR,10,PCP/Enroll History,S,
461,TransplantFlag_3,VARCHAR,1,PCP/Enroll History,S,
462,TransplantFlagStartDate_3,VARCHAR,10,PCP/Enroll History,S,
463,TransplantFlagEndDate_3,VARCHAR,10,PCP/Enroll History,S,
464,TransplantFlag_4,VARCHAR,1,PCP/Enroll History,S,
465,TransplantFlagStartDate_4,VARCHAR,10,PCP/Enroll History,S,
466,TransplantFlagEndDate_4,VARCHAR,10,PCP/Enroll History,S,
467,TransplantFlag_5,VARCHAR,1,PCP/Enroll History,S,
468,TransplantFlagStartDate_5,VARCHAR,10,PCP/Enroll History,S,
469,TransplantFlagEndDate_5,VARCHAR,10,PCP/Enroll History,S,
470,TransplantFlag_6,VARCHAR,1,PCP/Enroll History,S,
471,TransplantFlagStartDate_6,VARCHAR,10,PCP/Enroll History,S,
472,TransplantFlagEndDate_6,VARCHAR,10,PCP/Enroll History,S,
473,TransplantFlag_7,VARCHAR,1,PCP/Enroll History,S,
474,TransplantFlagStartDate_7,VARCHAR,10,PCP/Enroll History,S,
475,TransplantFlagEndDate_7,VARCHAR,10,PCP/Enroll History,S,
476,TransplantFlag_8,VARCHAR,1,PCP/Enroll History,S,
477,TransplantFlagStartDate_8,VARCHAR,10,PCP/Enroll History,S,
478,TransplantFlagEndDate_8,VARCHAR,10,PCP/Enroll History,S,
479,TransplantFlag_9,VARCHAR,1,PCP/Enroll History,S,
480,TransplantFlagStartDate_9,VARCHAR,10,PCP/Enroll History,S,
481,TransplantFlagEndDate_9,VARCHAR,10,PCP/Enroll History,S,
482,TransplantFlag_10,VARCHAR,1,PCP/Enroll History,S,
483,TransplantFlagStartDate_10,VARCHAR,10,PCP/Enroll History,S,
484,TransplantFlagEndDate_10,VARCHAR,10,PCP/Enroll History,S,
485,DialysisFlag_1,VARCHAR,1,PCP/Enroll History,S,Y
486,DialysisFlagStartDate_1,VARCHAR,10,PCP/Enroll History,S,
487,DialysisFlagEndDate_1,VARCHAR,10,PCP/Enroll History,S,
488,DialysisFlag_2,VARCHAR,1,PCP/Enroll History,S,Y
489,DialysisFlagStartDate_2,VARCHAR,10,PCP/Enroll History,S,
490,DialysisFlagEndDate_2,VARCHAR,10,PCP/Enroll History,S,
491,DialysisFlag_3,VARCHAR,1,PCP/Enroll History,S,
492,DialysisFlagStartDate_3,VARCHAR,10,PCP/Enroll History,S,
493,DialysisFlagEndDate_3,VARCHAR,10,PCP/Enroll History,S,
494,DialysisFlag_4,VARCHAR,1,PCP/Enroll History,S,
495,DialysisFlagStartDate_4,VARCHAR,10,PCP/Enroll History,S,
496,DialysisFlagEndDate_4,VARCHAR,10,PCP/Enroll History,S,
497,DialysisFlag_5,VARCHAR,1,PCP/Enroll History,S,
498,DialysisFlagStartDate_5,VARCHAR,10,PCP/Enroll History,S,
499,DialysisFlagEndDate_5,VARCHAR,10,PCP/Enroll History,S,
500,DialysisFlag_6,VARCHAR,1,PCP/Enroll History,S,
501,DialysisFlagStartDate_6,VARCHAR,10,PCP/Enroll History,S,
502,DialysisFlagEndDate_6,VARCHAR,10,PCP/Enroll History,S,
503,DialysisFlag_7,VARCHAR,1,PCP/Enroll History,S,
504,DialysisFlagStartDate_7,VARCHAR,10,PCP/Enroll History,S,
505,DialysisFlagEndDate_7,VARCHAR,10,PCP/Enroll History,S,
506,DialysisFlag_8,VARCHAR,1,PCP/Enroll History,S,
507,DialysisFlagStartDate_8,VARCHAR,10,PCP/Enroll History,S,
508,DialysisFlagEndDate_8,VARCHAR,10,PCP/Enroll History,S,
509,DialysisFlag_9,VARCHAR,1,PCP/Enroll History,S,
510,DialysisFlagStartDate_9,VARCHAR,10,PCP/Enroll History,S,
511,DialysisFlagEndDate_9,VARCHAR,10,PCP/Enroll History,S,
512,DialysisFlag_10,VARCHAR,1,PCP/Enroll History,S,
513,DialysisFlagStartDate_10,VARCHAR,10,PCP/Enroll History,S,
514,DialysisFlagEndDate_10,VARCHAR,10,PCP/Enroll History,S,
515,DisabledFlag_1,VARCHAR,1,PCP/Enroll History,S,Y
516,DisabledFlagStartDate_1,VARCHAR,10,PCP/Enroll History,S,
517,DisabledFlagEndDate_1,VARCHAR,10,PCP/Enroll History,S,
518,DisabledFlag_2,VARCHAR,1,PCP/Enroll History,S,Y
519,DisabledFlagStartDate_2,VARCHAR,10,PCP/Enroll History,S,
520,DisabledFlagEndDate_2,VARCHAR,10,PCP/Enroll History,S,
521,DisabledFlag_3,VARCHAR,1,PCP/Enroll History,S,
522,DisabledFlagStartDate_3,VARCHAR,10,PCP/Enroll History,S,
523,DisabledFlagEndDate_3,VARCHAR,10,PCP/Enroll History,S,
524,DisabledFlag_4,VARCHAR,1,PCP/Enroll History,S,
525,DisabledFlagStartDate_4,VARCHAR,10,PCP/Enroll History,S,
526,DisabledFlagEndDate_4,VARCHAR,10,PCP/Enroll History,S,
527,DisabledFlag_5,VARCHAR,1,PCP/Enroll History,S,
528,DisabledFlagStartDate_5,VARCHAR,10,PCP/Enroll History,S,
529,DisabledFlagEndDate_5,VARCHAR,10,PCP/Enroll History,S,
530,DisabledFlag_6,VARCHAR,1,PCP/Enroll History,S,
531,DisabledFlagStartDate_6,VARCHAR,10,PCP/Enroll History,S,
532,DisabledFlagEndDate_6,VARCHAR,10,PCP/Enroll History,S,
533,DisabledFlag_7,VARCHAR,1,PCP/Enroll History,S,
534,DisabledFlagStartDate_7,VARCHAR,10,PCP/Enroll History,S,
535,DisabledFlagEndDate_7,VARCHAR,10,PCP/Enroll History,S,
536,DisabledFlag_8,VARCHAR,1,PCP/Enroll History,S,
537,DisabledFlagStartDate_8,VARCHAR,10,PCP/Enroll History,S,
538,DisabledFlagEndDate_8,VARCHAR,10,PCP/Enroll History,S,
539,DisabledFlag_9,VARCHAR,1,PCP/Enroll History,S,
540,DisabledFlagStartDate_9,VARCHAR,10,PCP/Enroll History,S,
541,DisabledFlagEndDate_9,VARCHAR,10,PCP/Enroll History,S,
542,DisabledFlag_10,VARCHAR,1,PCP/Enroll History,S,
543,DisabledFlagStartDate_10,VARCHAR,10,PCP/Enroll History,S,
544,DisabledFlagEndDate_10,VARCHAR,10,PCP/Enroll History,S,
545,DualStatusCode_1,VARCHAR,2,PCP/Enroll History,S,
546,MCD_Startdate1,VARCHAR,10,PCP/Enroll History,S,
547,MCD_Enddate1,VARCHAR,10,PCP/Enroll History,S,
548,DualStatusCode_2,VARCHAR,2,PCP/Enroll History,S,
549,MCD_Startdate2,VARCHAR,10,PCP/Enroll History,S,
550,MCD_Enddate2,VARCHAR,10,PCP/Enroll History,S,
551,DualStatusCode_3,VARCHAR,2,PCP/Enroll History,S,
552,MCD_Startdate3,VARCHAR,10,PCP/Enroll History,S,
553,MCD_Enddate3,VARCHAR,10,PCP/Enroll History,S,
554,DualStatusCode_4,VARCHAR,2,PCP/Enroll History,S,
555,MCD_Startdate4,VARCHAR,10,PCP/Enroll History,S,
556,MCD_Enddate4,VARCHAR,10,PCP/Enroll History,S,
557,DualStatusCode_5,VARCHAR,2,PCP/Enroll History,S,
558,MCD_Startdate5,VARCHAR,10,PCP/Enroll History,S,
559,MCD_Enddate5,VARCHAR,10,PCP/Enroll History,S,
560,DualStatusCode_6,VARCHAR,2,PCP/Enroll History,S,
561,MCD_Startdate6,VARCHAR,10,PCP/Enroll History,S,
562,MCD_Enddate6,VARCHAR,10,PCP/Enroll History,S,
563,DualStatusCode_7,VARCHAR,2,PCP/Enroll History,S,
564,MCD_Startdate7,VARCHAR,10,PCP/Enroll History,S,
565,MCD_Enddate7,VARCHAR,10,PCP/Enroll History,S,
566,DualStatusCode_8,VARCHAR,2,PCP/Enroll History,S,
567,MCD_Startdate8,VARCHAR,10,PCP/Enroll History,S,
568,MCD_Enddate8,VARCHAR,10,PCP/Enroll History,S,
569,DualStatusCode_9,VARCHAR,2,PCP/Enroll History,S,
570,MCD_Startdate9,VARCHAR,10,PCP/Enroll History,S,
571,MCD_Enddate9,VARCHAR,10,PCP/Enroll History,S,
572,DualStatusCode_10,VARCHAR,2,PCP/Enroll History,S,
573,MCD_Startdate10,VARCHAR,10,PCP/Enroll History,S,
574,MCD_Enddate10,VARCHAR,10,PCP/Enroll History,S,
575,COBUpdateDate_1,VARCHAR,10,CMS Files,S,
576,COBStartdate_1,VARCHAR,10,CMS Files,S,
577,COBEnddate_1,VARCHAR,10,CMS Files,S,
578,NameofOtherCoverage_1,VARCHAR,50,CMS Files,S,
579,SubscriberIDofOtherCoverage_1,VARCHAR,20,CMS Files,S,
580,GroupIDofotherCoverage_1,VARCHAR,20,CMS Files,S,
581,KindofOtherInsurance_1,VARCHAR,3,CMS Files,S,
582,NameofOtherInsuranceCompany_1,VARCHAR,200,CMS Files,S,
583,COBUpdateDate_2,VARCHAR,10,CMS Files,S,
584,COBStartdate_2,VARCHAR,10,CMS Files,S,
585,COBEnddate_2,VARCHAR,10,CMS Files,S,
586,NameofOtherCoverage_2,VARCHAR,50,CMS Files,S,
587,SubscriberIDofOtherCoverage_2,VARCHAR,20,CMS Files,S,
588,GroupIDofotherCoverage_2,VARCHAR,20,CMS Files,S,
589,KindofOtherInsurance_2,VARCHAR,3,CMS Files,S,
590,NameofOtherInsuranceCompany_2,VARCHAR,200,CMS Files,S,
591,COBUpdateDate_3,VARCHAR,10,CMS Files,S,
592,COBStartdate_3,VARCHAR,10,CMS Files,S,
593,COBEnddate_3,VARCHAR,10,CMS Files,S,
594,NameofOtherCoverage_3,VARCHAR,50,CMS Files,S,
595,SubscriberIDofOtherCoverage_3,VARCHAR,20,CMS Files,S,
596,GroupIDofotherCoverage_3,VARCHAR,20,CMS Files,S,
597,KindofOtherInsurance_3,VARCHAR,3,CMS Files,S,
598,NameofOtherInsuranceCompany_3,VARCHAR,200,CMS Files,S,
599,COBUpdateDate_4,VARCHAR,10,CMS Files,S,
600,COBStartdate_4,VARCHAR,10,CMS Files,S,
601,COBEnddate_4,VARCHAR,10,CMS Files,S,
602,NameofOtherCoverage_4,VARCHAR,50,CMS Files,S,
603,SubscriberIDofOtherCoverage_4,VARCHAR,20,CMS Files,S,
604,GroupIDofotherCoverage_4,VARCHAR,20,CMS Files,S,
605,KindofOtherInsurance_4,VARCHAR,3,CMS Files,S,
606,NameofOtherInsuranceCompany_4,VARCHAR,200,CMS Files,S,
607,COBUpdateDate_5,VARCHAR,10,CMS Files,S,
608,COBStartdate_5,VARCHAR,10,CMS Files,S,
609,COBEnddate_5,VARCHAR,10,CMS Files,S,
610,NameofOtherCoverage_5,VARCHAR,50,CMS Files,S,
611,SubscriberIDofOtherCoverage_5,VARCHAR,20,CMS Files,S,
612,GroupIDofotherCoverage_5,VARCHAR,20,CMS Files,S,
613,KindofOtherInsurance_5,VARCHAR,3,CMS Files,S,
614,NameofOtherInsuranceCompany_5,VARCHAR,200,CMS Files,S,
615,COBUpdateDate_6,VARCHAR,10,CMS Files,S,
616,COBStartdate_6,VARCHAR,10,CMS Files,S,
617,COBEnddate_6,VARCHAR,10,CMS Files,S,
618,NameofOtherCoverage_6,VARCHAR,50,CMS Files,S,
619,SubscriberIDofOtherCoverage_6,VARCHAR,20,CMS Files,S,
620,GroupIDofotherCoverage_6,VARCHAR,20,CMS Files,S,
621,KindofOtherInsurance_6,VARCHAR,3,CMS Files,S,
622,NameofOtherInsuranceCompany_6,VARCHAR,200,CMS Files,S,
623,COBUpdateDate_7,VARCHAR,10,CMS Files,S,
624,COBStartdate_7,VARCHAR,10,CMS Files,S,
625,COBEnddate_7,VARCHAR,10,CMS Files,S,
626,NameofOtherCoverage_7,VARCHAR,50,CMS Files,S,
627,SubscriberIDofOtherCoverage_7,VARCHAR,20,CMS Files,S,
628,GroupIDofotherCoverage_7,VARCHAR,20,CMS Files,S,
629,KindofOtherInsurance_7,VARCHAR,3,CMS Files,S,
630,NameofOtherInsuranceCompany_7,VARCHAR,200,CMS Files,S,
631,COBUpdateDate_8,VARCHAR,10,CMS Files,S,
632,COBStartdate_8,VARCHAR,10,CMS Files,S,
633,COBEnddate_8,VARCHAR,10,CMS Files,S,
634,NameofOtherCoverage_8,VARCHAR,50,CMS Files,S,
635,SubscriberIDofOtherCoverage_8,VARCHAR,20,CMS Files,S,
636,GroupIDofotherCoverage_8,VARCHAR,20,CMS Files,S,
637,KindofOtherInsurance_8,VARCHAR,3,CMS Files,S,
638,NameofOtherInsuranceCompany_8,VARCHAR,200,CMS Files,S,
639,COBUpdateDate_9,VARCHAR,10,CMS Files,S,
640,COBStartdate_9,VARCHAR,10,CMS Files,S,
641,COBEnddate_9,VARCHAR,10,CMS Files,S,
642,NameofOtherCoverage_9,VARCHAR,50,CMS Files,S,
643,SubscriberIDofOtherCoverage_9,VARCHAR,20,CMS Files,S,
644,GroupIDofotherCoverage_9,VARCHAR,20,CMS Files,S,
645,KindofOtherInsurance_9,VARCHAR,3,CMS Files,S,
646,NameofOtherInsuranceCompany_9,VARCHAR,200,CMS Files,S,
647,COBUpdateDate_10,VARCHAR,10,CMS Files,S,
648,COBStartdate_10,VARCHAR,10,CMS Files,S,
649,COBEnddate_10,VARCHAR,10,CMS Files,S,
650,NameofOtherCoverage_10,VARCHAR,50,CMS Files,S,
651,SubscriberIDofOtherCoverage_10,VARCHAR,20,CMS Files,S,
652,GroupIDofotherCoverage_10,VARCHAR,20,CMS Files,S,
653,KindofOtherInsurance_10,VARCHAR,3,CMS Files,S,
654,NameofOtherInsuranceCompany_10,VARCHAR,200,CMS Files,S,
655,M3PStartdate_1,VARCHAR,10,,S,
656,M3PEnddate_1,VARCHAR,10,,S,
657,M3PTermReason_1,VARCHAR,1,,S,
658,M3PStartdate_2,VARCHAR,10,,S,
659,M3PEnddate_2,VARCHAR,10,,S,
660,M3PTermReason_2,VARCHAR,1,,S,
661,M3PStartdate_3,VARCHAR,10,,S,
662,M3PEnddate_3,VARCHAR,10,,S,
663,M3PTermReason_3,VARCHAR,1,,S,
664,M3PStartdate_4,VARCHAR,10,,S,
665,M3PEnddate_4,VARCHAR,10,,S,
666,M3PTermReason_4,VARCHAR,1,,S,
667,M3PStartdate_5,VARCHAR,10,,S,
668,M3PEnddate_5,VARCHAR,10,,S,
669,M3PTermReason_5,VARCHAR,1,,S,
670,GenderIdentity,VARCHAR,1,,S,
671,SexualOrientation,VARCHAR,1,,S,
672,AlternativeFormatDataCD,VARCHAR,1,Member Details,S,Y
673,Endofrecord,VARCHAR,3,CMS Files,R,
```

## QA Automation/EDIFECSProduct_MappingSpec_QA Automation_Advantasure_DFF_to_CSV_conversion_V2.0.xlsx — CSV Mapping

```csv
Advantasure fields,,,,,,,,HRP,,,HE - Enrollment Sparse,,
No,field,Type,,Details,Sample,Description,,,,,CSV Mapping,Mapping Logics,Comments
1,Transaction Type,ALL,3,,D,The transaction type that is being output and determines which fields will be populated on the record.,,NA,Not needed,NA,NA,,
,,,,,,,,,,,,,
,,,,,,LOV:,,,,,,,
,,,,,,▪    DEM (Demographics) – Non spanable always contains the latest value,,,,,,,
,,,,,,▪    ADR – Address History,,,,,,,
,,,,,,▪    PLN – Plan Enrollment History,,,,,,,
,,,,,,▪    PWO – Premium Withhold,,,,,,,
,,,,,,▪    LIS – Low Income Subsidy,,,,,,,
,,,,,,▪    LEP – Late Enrollment Penalty,,,,,,,
,,,,,,▪    FLG – Flag set in the system,,,,,,,
,,,,,,▪    BRK – Broker,,,,,,,
,,,,,,▪    PCP – Primary Care Physician,,,,,,,
,,,,,,▪    GRP – Group/Subgroup information,,,,,,,
,,,,,,▪    RDR – Rider,,,,,,,
,,,,,,▪    COB – Coordination of Benefits,,,,,,,
,,,,,,▪    MCD - Medicaid,,,,,,,
2,Claims SubscriberID Number,ALL,11,Member Details,369258147,Unique ID assigned to each member generally assigned by the Claims system,Field may be blank if a member is new and has not been assigned an ID by the client,Subscrier/Member HCCID,Y,Member - ID details,ClaimsSubscriberIDNumber,,"a.Member will maintain the same subscriber ID when switching plans (e.g. HMO to PPO and Vice Versa)
b. Member will maintain their original subscriber id even if they were disenrolled and reenrolled into the same plan or a different plan
c. Member will maintain their original subscriber id if they are reinstated (no gap in coverage)"
3,Start Date,ALL,8,PCP/Enroll History,20080101,Span start date,Start date of the span indicated by the specific transaction type of each record,"Start Date for each transaction type
When Transaction type is PLN - this is the Benefit start date
When Transaction type is PCP - this is the PCP start date",Y,"Member  - Plan
Member - provider",BenefitPlanStartDate_X,"When Transaction Tupe = PLN

Populate it based on the number of occurences PLN Transaction.",
4,End Date,ALL,8,PCP/Enroll History,20081231,Span end date,End date of the span indicated by the specific transaction type of each record,"End Date for each transaction type
When Transaction type DEM comes along with an END Date (a date in field 4) - this is the Benefit end date and PCP end date.
When Transaction type is PCP - this is the PCP end date",Y,"Member  - Plan
Member - provider",BenefitPlanEndDate_X,"When Transaction Tupe = PLN

Populate it based on the number of occurences PLN Transaction.",
5,Subscriber Flag,DEM,1,System Logic,Y,"LOV: Y = Yes, or Null",Will always be Y on DEM record and be blank on all other records.,General: Subscriber Relationship,Y,Member Details,SubscriberFlag,,
6,MBI,ALL,12,Member Details,357269487A,"Medicare Beneficiary Identifier (MBI) of the
member in the system",,Medicare: Medicare Beneficary ID,Y,Member- Medicare,MBI,,
7,Member Name,DEM,105,System Logic,John Smith,First name Last Name,Created by combining first name and last name,General: Primary Name,Y,Member - Demographic,,,
8,Member’s Last Name,DEM,50,Member Details,Smith,Last name of the member in the system,"Note: if member has suffix (e.g. Jr.), it will be appended to the last name",General: Primary Name,Y,Member - Demographic,MemberLastName,,
9,Member’s First Name,DEM,50,Member Details,John,First name of the member in the system,,General: Primary Name,Y,Member - Demographic,MemberFirstName,,
10,Middle Initial,DEM,1,Member Details,T,Member middle initial in the system,,General: Primary Name,Y,Member - Demographic,MiddleInitial,,
11,Member’s Title,DEM,10,Member Details,Mr,"Title or prefix of the member in the system. LOV: Mr, Ms, or Mrs",,General: Primary Name,Y,Member - Demographic,MemberTitle,,
12,Member Status,DEM,20,Member Details,"ACTIVE
PENDING
TERM SUBMITTED
DENIED

We will process any member status in EDIFECS",Current status of the member in the Advantasure system,The current status of the member will be sent (see Member Status Values),General: Status ?? (top most of the screen),Y,Member - Demographic,MemberStatus,,
13,Alternate Member ID,DEM,11,Member Details,,Alternate member ID issued by the client,ID number is separate from the family link indicator number,General: Other ID,Y,Member - ID details,AlternateMemberID,,
14,Member Date of Birth,DEM,8,Member Details,19400528,Member’s date of birth in format YYYYMMDD,,General : Birth Date,Y,Member- Demograohic,MemberDateofBirth,Date format - YYYY-MM-DD,
15,Member Date of Death,DEM,8,Member Details,20080624,Member’s date of death in format YYYYMMDD,,General : Date of Death,Y,Member- Demograohic,MemberDateofDeath,Date format - YYYY-MM-DD,
16,Member Gender,DEM,1,Member Details,M,LOV: M = Male; F = Female; U=Unknown,,General : Gender,Y,Member- Demograohic,MemberGender,"If the input field is 'M' then hardcode as 'Male'
If the input field is 'F' then hardcode as 'Female'
Else, if we get any other input field then hardcode as 'Unknown'",
17,Member Social Security Number,DEM,9,Member Details,159357852,Member’s social security number,Will only populate if SSN is populated on Member Details field but is not collected or required for an MA application,General : SSN,Y,Member- Demograohic,MemberSocialSecurityNumber,"Format of tax identification number - 161-11-7187.

Include hyphen as per the example mentioned above",
18,Address Type,ADR,9,PCP/Enroll History,Permanent,Type of address listed on this ADR record,Will be blank for DEM,NA,Y,NA,,,
19,Member Permanent Address 1,"DEM,",55,PCP/Enroll History,123 Main Street,Address line 1 of the Permanent Residence Address of the member in the system,DEM transaction: contains most recent address,Contact: Residential Address,Y,Member - Contact,MemberPermanentAddress _1,,
20,Member Permanent Address 2,"DEM,",55,PCP/Enroll History,Apt 201,Address line 2 of the Permanent Residence Address of the member in the system,DEM transaction: contains most recent address,,Y,,MemberPermanentAddress _2,,
21,Member Permanent Address 3,"DEM,",55,PCP/Enroll History,,Address line 3 of the Permanent Residence Address of the member in the system,DEM transaction: contains most recent address,,Y,,MemberPermanentAddress _3,,
22,Member Permanent City,"DEM,",30,PCP/Enroll History,Cambridge,City of the Permanent Residence Address of the member in the system,DEM transaction: contains most recent address,,Y,,MemberPermanentCity,,
23,Member Permanent County,"DEM,",30,PCP/Enroll History,Middlesex,County of the Permanent Residence Address of the member in the system,DEM transaction: contains most recent address,,Y,,MemberPermanentCounty,,
24,Member Permanent State,"DEM,",2,PCP/Enroll History,MA,State of the Permanent Residence Address of the member in the system,DEM transaction: contains most recent address,,Y,,MemberPermanentState,,
25,Member Permanent SCC,"DEM, ADR",5,PCP/Enroll History,25017,Unique code used by SSA to identify each combination of State and County,DEM transaction: contains most recent address,,N,,,,
26,Member Permanent Zip Code,"DEM,",9,PCP/Enroll History,02138 (5 Digit) 021389999 (9 Digit),Zip Code of the Permanent Residence Address of the member in the system,DEM transaction: contains most recent address,,Y,,MemberPermanentZipCode,,
27,Member Mailing Address 1,"DEM,",55,PCP/Enroll History,,Address line 1 of the mailing address of the member in the system,DEM transaction: contains most recent address,Contact:Correspondence Address,Y,,MemberMailingAddress_1,,
28,Member Mailing Address 2,"DEM,",55,PCP/Enroll History,,Address line 2 of the mailing address of the member in the system,DEM transaction: contains most recent address,,Y,,MemberMailingAddress_2,,
29,Member Mailing Address 3,"DEM,",55,PCP/Enroll History,,Address line 3 of the mailing address of the member in the system,DEM transaction: contains most recent address,,Y,,MemberMailingAddress_3,,
30,Member Mailing City,"DEM,",30,PCP/Enroll History,,City of the mailing address of the member in the system,DEM transaction: contains most recent address,,Y,,MemberMailingCity,,
31,Member Mailing State,"DEM,",2,PCP/Enroll History,,State of the mailing address of the member in the system,DEM transaction: contains most recent address,,Y,,MemberMailingState,,
32,Member Mailing Zip Code,"DEM,",9,PCP/Enroll History,02138 (5 Digit) 021389999 (9 Digit),Zip code of the mailing address of the member in the system,DEM transaction: contains most recent address,,Y,,MemberMailingZipCode,,
33,Member Billing Address 1,"DEM,",55,PCP/Enroll History,,Address line 1 of the billing address of the member in the system,DEM transaction: contains most recent address,Contact: Billing Address,Y,,MemberBillingAddress_1,,
34,Member Billing Address 2,"DEM,",55,PCP/Enroll History,,Address line 2 of the billing address of the member in the system,DEM transaction: contains most recent address,,Y,,MemberBillingAddress_2,,
35,Member Billing Address 3,"DEM,",55,PCP/Enroll History,,Address line 3 of the billing address of the member in the system,DEM transaction: contains most recent address,,Y,,MemberBillingAddress_3,,
36,Member Billing City,"DEM,",30,PCP/Enroll History,,City of the billing address of the member in the system,DEM transaction: contains most recent address,,Y,,MemberBillingCity,,
37,Member Billing State,"DEM,",2,PCP/Enroll History,,State of the billing address of the member in the system,DEM transaction: contains most recent address,,Y,,MemberBillingState,,
38,Member Billing Zip Code,"DEM,",9,PCP/Enroll History,02138 (5 Digit) 021389999 (9 Digit),Zip code of the billing address of the member in the system,DEM transaction: contains most recent address,,Y,,MemberBillingZipCode,"byte1-5zipcode
byte6-9extensioncode",
39,Member Home Phone Number,DEM,10,Member Details,5552227654,Primary phone number for contact,No dashes or hyphens,Contact:Phone number,Y,,MemberHomePhoneNumber,,
40,Alternate Member Phone Number,DEM,10,Member Details,5552345612,"Alternate phone number can be mobile, office, or other voice line",No dashes or hyphens,Contact:Phone number,Y,,AlternateMemberPhoneNumber,,
41,Member Email Address,DEM,60,Member Details,jsmith@add ress.com,Email address supplied by member on the election form,,Contact:Email,Y,,MemberEmailAddress,,
42,Name of Emergency Contact,DEM,200,Member Details,Jane Good,Name of individual to be contacted in case of emergency,,"Couldn’t locate in HRP UI for other responsible
PHI- Personal Representatives",N,"NA
Member - PHI","FirstNameofEmergencyContact
LastNameofEmergencyContact",The Full name is sent across the file. Based on spaces we need to split First name and Last name.,
43,Emergency Contact Relationship to Member,DEM,50,Member Details,Daughter,Emergency contacts relationship to member,,Couldn’t locate in HRP UI,Y,NA,EmergencyContactRelationshiptoMember,,
44,Emergency Contact Phone Number,DEM,10,Member Details,5551347629,Emergency contact phone number,,Couldn’t locate in HRP UI,Y,NA,EmergencyContactPhoneNumber,,
45,"ID Card Trigger flag
The significance of this field",DEM,1,Member Details,Y,Flag indicates if a new ID Card is requested LOV: Y = Yes; N = No,Flag will be reset to No after the file is generated,NA,Not needed,NA,NA,,
46,Endangered Member Flag,DEM,1,Member Details,Y,Flag indicates that member is endangered/at risk; LOV: Y = Yes; N = No,"If Y, member is at risk from family member or cohabiting person",PHI:Confidential communication,,Member-PHI,EndangeredMemberFlag,,
47,Member in OOA Process,DEM,1,Member Details,Y,Flag indicating that the member is currently in the Out Of Area process; LOV: Y = Yes; N = No,,,,,,,
48,Source for placing in OOA process,DEM,30,Member Details,Returned Mail,Provides source of information that placed member in the OOA process,Source could be a TRC received from CMS or an update by a user,Couldn’t locate in HRP UI,N,NA,NA,,
49,Date of Move,DEM,8,Member Details,20120416,"Date member moved out of the service area, in the format YYYYMMDD",Date of move can be prospective or retroactive,Couldn’t locate in HRP UI,N,NA,NA,,
50,Move Deadline,DEM,8,Member Details,20121131,Date calculated by the system based on client logic after which member will be Involuntarily disenrolled,Date Involuntary Termination will be triggered based on move date,Couldn’t locate in HRP UI,N,NA,NA,,
51,Medicaid ID,DEM,14,Member Details,612452885,Medicaid number of the member in the system,,General:Other ID,,Member - ID details,MedicaidID,,
52,Medicare Part A Eff Date,DEM,8,IEQ,20000101,YYYYMMDD,Value received in response to latest IEQ,Medicare: Part A,Y,Member- Medicare,MedicarePartAEffDate,Date format - YYYY-MM-DD,Map from field '3'
53,Medicare Part A End Date,DEM,8,IEQ,,YYYYMMDD,Value received in response to latest IEQ – usually blank (open),Medicare: Part A,Y,Member- Medicare,MedicarePartAEndDate,Date format - YYYY-MM-DD,
54,Medicare Part B Eff Date,DEM,8,IEQ,20020301,YYYYMMDD,Value received in response to latest IEQ,Medicare: Part B,Y,Member- Medicare,MedicarePartBEffDate,Date format - YYYY-MM-DD,
55,Medicare Part B End Date,DEM,8,IEQ,,YYYYMMDD,Value received in response to latest IEQ usually blank (open),Medicare: Part B,Y,Member- Medicare,MedicarePartBEndDate,Date format - YYYY-MM-DD,
56,Medicare Part D Eff Date,DEM,8,IEQ,20020401,YYYYMMDD,Value received in response to latest IEQ,Medicare: Part D,Y,Member- Medicare,MedicarePartDEffDate,Date format - YYYY-MM-DD,
57,Medicare Part D End Date,DEM,8,IEQ,20120430,YYYYMMDD,Value received in response to latest IEQ – usually blank (open),Medicare: Part D,Y,Member- Medicare,MedicarePartDEndDate,Date format - YYYY-MM-DD,
58,Language Code,DEM,3,Member Details,SPA,Language code selected on Member Details screen,Refer Language Codes in the Advantasure specification document,General:Language,Y,Member-Demographic,LanguageCode,refer crosswalk,
59,Alternative Format Large Print,DEM,1,Member Details,Y,Flag indicating materials requested in large print format; LOV: Y = Yes; N = No,,Couldn’t locate in HRP UI,N,NA,AlternativeFormatLargePrint,,
60,Alternative Format Braille,DEM,1,Member Details,Y,Flag indicating materials requested in Braille format; LOV: Y = Yes; N = No,,Couldn’t locate in HRP UI,N,NA,AlternativeFormatBraille,,
61,Alternative Format Audio Tape,DEM,1,Member Details,Y,Flag indicating materials requested in audio tape format; LOV: Y = Yes; N = No,,Couldn’t locate in HRP UI,N,NA,AlternativeFormatAudioTape,,
62,Fax Number,DEM,10,Member Details,8885552222,Fax number with no hyphens or special characters,Client-specific,Contact:Phone number,Y,Member-Contact,FaxNumber,,
63,"In LEP Process Status
If in LEP process, what are the processes",DEM,1,Member Details,Y,Indicates whether the member is in the LEP queue/creditable coverage determination process; LOV: Y = Yes; N = No,,Couldn’t locate in HRP UI,N,NA,NA,,
64,"Authorized Rep Name
Available in UI,",DEM,105,Member Details,Nancy James,Name of individual listed as Authorized Representative on member record. Formerly POA Name field.,,PHI:POA,Y,Member-PHI,"AuthorizedRepFirstName, AuthorizedRepLastName",The Full name is sent across the file. Based on spaces we need to split First name and Last name.,
65,"Authorized Rep
Address 1",DEM,55,Member Details,123 Main,"Authorized Rep address line 1 from member
record. Formerly POA Address 1 field.",,,Y,,AuthorizedRepAddress_1,,
66,"Authorized Rep
Address 2",DEM,55,Member Details,Apt 2,"Authorized Rep address line 2 from member
record. Formerly POA Address 2 field.",,,Y,,AuthorizedRepAddress_2,,
67,"Authorized Rep
Address 3",DEM,55,Member Details,,Not applicable and not displayed on UI. Formerly POA Address 3 field.,NA,,Not needed,,AuthorizedRepAddress_3,,
68,Authorized Rep City,DEM,30,Member Details,Las Vegas,"Authorized Rep city from member record.
Formerly POA City field.",,,Y,,AuthorizedRepCity,,
69,"Authorized Rep
County",DEM,30,Member Details,Henderson,Authorized Rep county from member record. Formerly POA County field.,,,Y,,AuthorizedRepCounty,,
70,Authorized Rep State,DEM,2,Member Details,NV,"Authorized Rep state from member record.
Formerly POA State field.",,,Y,,AuthorizedRepState,,
71,Authorized Rep Zip Code,DEM,9,Member Details,,Authorized Rep zip code from member record. Formerly POA Zip Code field.,,,Y,,AuthorizedRepZipCode,,
72,"Authorized Rep Phone
Number",DEM,10,Member Details,5554445678,"Authorized Rep phone number from member
record. Formerly POA Phone Number field.",,,Y,,AuthorizedRepPhoneNumber,,
73,"Authorized Rep
Relationship",DEM,30,Member Details,Son,"Authorized Rep relationship from member
record. Formerly POA Relationship field.",,,Y,,AuthorizedRepRelationship,,
74,Race Code,DEM,128,Member Details,999,See ‘CMS OEC Race and Ethnicity Values’ section for LOV,"Multiple values can be within this one field. Values will be comma separated. IE: 999, 499",Not available,Y,Race,Race_1/Race_2/Race_3/Race_4/Race_5,"Multiple values can be send across the Memout file for a member. Values will be comma seperated. Populate depend on the number of occurences

Please refer the cross walk table 'Race Values' for code entry mapping",
75,ikaUniqueID,DEM,11,System,1234,Unique sequential number assigned by internal process,,NA,Not needed,NA,NA,,Seena04/06: Adv team confirmed this id is used for Adv internal processing and this is not fed to upstream/downstream processing
76,Family Link Indicator,DEM,12,Member Details,987654321,ID number used by the client to link family members together in commercial systems,,Couldn’t locate in HRP UI,NA,NA,NA,,
77,In Premium Delinquency Process,DEM,1,Member Details,Y,Flag indicating if member is currently in the Premium Delinquency process,,Couldn’t locate in HRP UI,N,NA,NA,,
78,Ethnicity,DEM,128,Member Details,CUB,See ‘CMS OEC Race and Ethnicity Values’ section for LOV,"Multiple values can be within this one field. Values will be comma separated. IE: CUB, OTH",General : Ethnicity,Y,Member - Demographic,Ethnicity_1/Ethnicity_2/Ethnicity_3/Ethnicity_4/Ethnicity_5,"Multiple values can be send across the Memout file for a member. Values will be comma seperated. Populate depend on the number of occurences

Refer the cross walk table 'Ethnicity Values' for code entry mapping",
79,Filler Field,DEM,50,,,Filler Field – to be used for future enhancements,,NA,Not needed,NA,NA,,
80,Filler Field,DEM,50,,,Filler Field – to be used for future enhancements,,NA,Not needed,NA,NA,,
81,Filler Field,DEM,50,,,Filler Field – to be used for future enhancements,,NA,Not needed,NA,NA,,
82,PCP ID/Provider Number,PCP,25,PCP/Enroll History,IM29867,Provider number or PCP ID for MA and MAPD plans,Information is captured from PCP & Enrollment History,Provider,Y,Provider - Practitioner,"ProviderNumber_X

X : 1 to 10",Populate it based on the number of occurences of PCP Transaction.,
,,,,,,,,,,,"PCP_StartdateX
X : 1 to 10","Populate from Start Date of PCP transaction.
Date format - YYYY-MM-DD",
,,,,,,,,,,,"PCP_EnddateX
X : 1 to 10","Populate from End Date of PCP transaction.
Date format - YYYY-MM-DD",
83,PCP/Provider Address Suffix,PCP,20,PCP/Enroll History,567423,Client-specific,If applicable,Couldn’t locate in HRP UI,N,NA,NA,,
84,PCP/Provider Eff Date,PCP,8,PCP/Enroll History,20120401,PCP effective date as listed in the member record,Information is captured from PCP & Enrollment History,Provider Choice,Y,Member - Provider,No need to map.,,
85,Filler Field,PCP,50,PCP/Enroll History,,Filler Field – to be used for future enhancements,,NA,Not needed,NA,NA,,
86,Filler Field,PCP,50,PCP/Enroll History,,Filler Field – to be used for future enhancements,,NA,Not needed,NA,NA,,
87,Broker Name,BRK,105,Application,Amy Cooper,Name of selling broker,,Subscriber:Broker Selection,Y,Member- Broker,,,
88,Broker Code,BRK,10,Application,J3905,Broker code,,Subscriber:Broker Selection,Y,Member- Broker,,,
89,Broker Association/Agency,BRK,10,Application,4,Agency code,,Subscriber:Broker Selection,Y,Member- Broker,,,
90,Filler Field,BRK,50,PCP/Enroll History,,Filler Field – to be used for future enhancements,,NA,Not needed,NA,NA,,
91,Filler Field,BRK,50,PCP/Enroll History,,Filler Field – to be used for future enhancements,,NA,Not needed,NA,NA,,
92,Filler Field,BRK,50,PCP/Enroll History,,Filler Field – to be used for future enhancements,,NA,Not needed,NA,NA,,
93,Filler Field,BRK,50,PCP/Enroll History,,Filler Field – to be used for future enhancements,,NA,Not needed,NA,NA,,
94,Creditable Coverage Flag,LEP,1,System Logic,N,LOV: Y = Yes; N = No,This value is always NULL,NA,Not needed,NA,NA,,
95,LEP Number of Uncovered Months,LEP,3,PCP/Enroll History,18,Number of months for which a member did not have creditable drug coverage,,Medicare : Part D LEP,Y,Member-Medicare,LEPNumberofUncoveredMonths_X,Populate it based on the number of occurences of LEP Transaction.,
,,,,,,,,,,,PartDLEPStartdateX,"Populate from Start Date of LEP transaction.
Date format - YYYY-MM-DD",
,,,,,,,,,,,PartDLEPEnddateX,"Populate from End Date of LEP transaction.
Date format - YYYY-MM-DD",
96,Part D LEP Amount,LEP,6,PCP/Enroll History,4.4,Member LEP amount received from CMS,,Medicare : Part D LEP,Y,Member-Medicare,PartDLEPAmount_X,Populate it based on the number of occurences of LEP Transaction.,
97,PartD LEP Waived Amount,LEP,6,PCP/Enroll History,1,Data from CMS,,Medicare : Part D LEP,Y,Member-Medicare,PartDLEPWaivedAmount_X,Populate it based on the number of occurences of LEP Transaction.,
98,PartD LEP Subsidy Amount,LEP,6,PCP/Enroll History,1,Data from CMS,,Medicare : Part D LEP,Y,Member-Medicare,PartDLEPSubsidyAmount_X,Populate it based on the number of occurences of LEP Transaction.,
99,LEP Source,LEP,6,PCP/Enroll History,TRR,"LOV: LISLEP, MPWR, TRR, Other",,couldn't locate in HRP,N,NA,NA,,
100,Filler Field,LEP,50,PCP/Enroll History,,Filler Field – to be used for future enhancements,,NA,Not needed,NA,NA,,
101,Filler Field,LEP,50,PCP/Enroll History,,Filler Field – to be used for future enhancements,,NA,Not needed,NA,NA,,
102,Current LIS Premium Subsidy,LIS,6,Plan set up value,34.2,Subsidy amount that CMS contributes toward Part D premium,,Medicare Part D LIS,Y,Member: Medicare,CurrentLISPremiumSubsidy_X,Populate it based on the number of occurences of LIS Transaction.,
,,,,,,,,,,,PartDLISPStartdateX,"Populate from Start Date of LIS transaction.
Date format - YYYY-MM-DD",
,,,,,,,,,,,PartDLISEnddateX,"Populate from End Date of LIS transaction.
Date format - YYYY-MM-DD",
103,PartD LIS Subsidy Level,LIS,3,PCP/Enroll History,50,"LOV: 000, 025, 050, 075, and 100",,Medicare Part D LIS,Y,Member: Medicare,PartDLISSubsidyLevel_X,Populate it based on the number of occurences of LIS Transaction.,
104,PartD LIS Copay Category,LIS,1,PCP/Enroll History,4,"LOV: 0, 1, 2, 3, 4",,Medicare Part D LIS,Y,Member: Medicare,PartDLISCopayCategory_X,Populate it based on the number of occurences of LIS Transaction.,
105,LIS Source Code,LIS,50,PCP/Enroll History,A,LOV: A = Applicant; D = Deemed,,Couldn’t locate in HRP UI,N,NA,NA,,
106,Filler Field,LIS,50,PCP/Enroll History,,Filler Field – to be used for future enhancements,,NA,Not needed,NA,NA,,
107,Filler Field,LIS,50,PCP/Enroll History,,Filler Field – to be used for future enhancements,,NA,Not needed,NA,NA,,
108,Contract Number,PLN,5,PCP/Enroll History,H1234,Contract number (K#) of the current plan,,Benefit Plan Configurtaion,Y,NA,ContractNumber_X,Populate it based on the number of occurences of PLN transaction.,
109,PBP Number,PLN,3,PCP/Enroll History,67,PBP number for the plan,,Benefit Plan Configurtaion,Y,NA,PBPNumber_X,Populate it based on the number of occurences of PLN transaction.,
110,Segment,PLN,3,Claims Eligibility,5,"Plan segment number, if applicable",Value is only for segmented plans and has a unique relationship with the county in which a member resides,Benefit plan configuration,Y,NA,NA,,
111,Group ID,PLN / GRP,25,Claims Eligibility,56129R,Group number associated with the member’s,,General:Account,Y,Member-Account,GroupID_X,Populate it based on the number of occurences of PLN transaction.,
,,,,,,plan,,,,,,,
112,Subgroup,GRP,20,Claims Eligibility,1000,Subgroup number associated with the,,NA,Not needed,NA,No need to map,,
,,,,,,member’s plan,,,,,,,
113,Class ID,PLN,25,Claims Eligibility,,Client-specific,,May be Benefit plan configuration,Y,NA,NA,,
114,Plan Code,PLN,3,Claims Eligibility,,Client-specific,,Benefit Plan,Y,Member - Coverage,,,
115,Disenrollment Reason code (DRC),PLN,2,Plan Span,,Disenrollment Reason Code,"Refer to the CMS PCUG for the latest
Disenrollment Reason Codes.
Always populated",Not Available,N,Member-Coverage,DisenrollmentReasoncode_DRC_X,"Populate it based on the number of occurences of PLN transaction.

refer Crosswalk 'Dis Enrollment Reason Code'",
116,Filler Field,PLN,50,,,Filler Field – to be used for future enhancements,,NA,Not needed,NA,NA,,
117,Filler Field,PLN,50,,,Filler Field – to be used for future enhancements,,NA,Not needed,NA,NA,,
118,Filler Field,PLN,50,,,Filler Field – to be used for future enhancements,,NA,Not needed,NA,NA,,
119,Signature Date,PLN,8,Application data,20120210,Date that the application was signed by applicant or POA in the format YYYYMMDD,,Not Available,N,Member-Coverage,SignatureDate_X,"Date format - YYYY-MM-DD

Populate it based on the number of occurences of PLN transaction.",
120,CSNP Disenrollment Eff. Date,PLN,8,System Logic,20120901,Chronic Special Need Plan Disenrollment Eff date,,Couldn’t locate in HRP UI,N,NA,,,
121,Election Type,PLN,300,Application data,,Election type,Will contain a value only if the last transaction is enrollment or PBP change,Couldn’t locate in HRP UI,N,NA,ElectionType_X,Populate it based on the number of occurences of PLN transaction.,
122,Term Reason Code,PLN,20,PCP/Enroll History,DOD,Termination reason code listed in the Plan Override section of PCP & Enrollment History,Not always populated,Benefit Plan,Y,Member-Coverage,,,
123,Plan Rider,RDR,1,Claims Eligibility,,LOV: D = Dental; V = Vision; R= Rx,,Benefit plan configuration,Y,NA,NA,,
124,Rider Code,RDR,50,Claims Eligibility,,Code used to identify specific rider benefit,,Benefit plan configuration,Y,NA,NA,,
125,Filler Field,RDR,50,PCP/Enroll History,,Filler Field – to be used for future enhancements,,NA,Not needed,NA,NA,,
126,Filler Field,RDR,50,PCP/Enroll History,,Filler Field – to be used for future enhancements,,NA,Not needed,NA,NA,,
127,Payment Method Type,PWO,20,PCP/Enroll History,SSA,Member premium payment option,No Premium; Receive monthly bill; EFT/APO;CC; RRB; SSA; No data,NA,NA,NA,PaymentMethodType_X,,
,,,,,,,,,,,PWOStartdate_X,"Date format - YYYY-MM-DD

Populate it based on the number of occurences of PWO transaction.",
,,,,,,,,,,,PWOEnddate_X,"Date format - YYYY-MM-DD

Populate it based on the number of occurences of PWO transaction.",
128,Premium Withhold Option,PWO,1,PCP/Enroll History,SSA,Premium Withhold Option submitted to CMS; LOV: D= Bill; S= SSA; R= RRB,,,,,PremiumWithholdOption_X,Populate it based on the number of occurences of PWO transaction.,
129,Name of Account Holder,PWO,105,PCP/Enroll History,John Smith,Account holder name listed on member record,No longer supported. Value is always blank,NA,Not needed,NA,NA,,
130,Account Number,PWO,20,PCP/Enroll History History,78912378900,Account number listed on member record,NACHA/BizTalk encrypted eff spring 2023,,,,,,
131,Bank Routing Number,PWO,20,PCP/Enroll History,123456789,Bank routing number listed on member record,NACHA/BizTalk encrypted eff spring 2023,,,,,,
132,Bank Account Type,PWO,1,PCP/Enroll History,C,"LOV: C = Checking, S = Savings",If applicable,,,,,,
133,Credit Card Type,PWO,50,PCP/Enroll History,,Credit card type selected in the system,No longer supported. Value is always blank,NA,Not needed,NA,NA,,
134,Credit Card Account Holder Name,PWO,105,PCP/Enroll History,,Credit card type selected in the system,No longer supported. Value is always blank,NA,Not needed,NA,NA,,
135,Credit Card Number,PWO,16,PCP/Enroll History,,Credit card number,No longer supported. Value is always blank,NA,Not needed,NA,NA,,
136,Credit card Security Code,PWO,3,PCP/Enroll History,,Credit card security code from back of card,No longer supported. Value is always blank,NA,Not needed,NA,NA,,
137,Credit Card Expiration Date,PWO,6,PCP/Enroll History,,Expiration date of the credit card in the format YYYYMM,No longer supported. Value is always blank,NA,Not needed,NA,NA,,
138,Filler Field,PWO,50,PCP/Enroll History,,Filler Field – to be used for future enhancements,,NA,Not needed,NA,NA,,
139,Filler Field,PWO,50,PCP/Enroll History,,Filler Field – to be used for future enhancements,,NA,Not needed,NA,NA,,
140,Hospice Flag,FLG,1,PCP/Enroll History,Y,Member has a Hospice flag; LOV: Y = Yes; N = No U=Unknown,Source can be TRR or user update. Each status flag record in the system will send a separate record on this file,Medicare and General tab,Y,Member - Health Indicators,HospiceFlag_X,"Map only if Hospice Flag = Y.


Populate it based on the number of occurences of FLG trasaction,",
,,,,,,,,,,,HospiceFlagStartdate_X,"Date format - YYYY-MM-DD
Populate from Start Date of FLG  transaction",
,,,,,,,,,,,HospiceFlagEnddate_X,"Date format - YYYY-MM-DD
Populate from End Date of FLG transaction",
141,Medicaid Flag,FLG,1,PCP/Enroll History,Y,Member has a Medicaid flag; LOV: Y = Yes; N = No,Source can be TRR or user update. Each status flag record in the system will send a separate record on this file,Couldn’t locate in HRP UI,N,NA,MedicaidFlag_X,"Map only if Medicaid Flag = Y.


Populate it based on the number of occurences of FLG trasaction,",
,,,,,,,,,,,MedicaidFlagStratDate_X,"Date format - YYYY-MM-DD
Populate from Start Date of FLG  transaction",
,,,,,,,,,,,MedicaidFlagEndDate_X,"Date format - YYYY-MM-DD
Populate from End Date of FLG transaction",
143,Institutional Flag,FLG,1,PCP/Enroll History,Y,"Member is a resident of an institution; LOV: Y = Yes; N = No, U=Unknown",Source can be TRR or user update. Each status flag record in the system will send a separate record on this file,Medicare,Y,Member - Health Indicators,InstitutionalFlag_X,"Map only if Institutional Flag = Y.


Populate it based on the number of occurences of FLG trasaction,",
,,,,,,,,,,,InstitutionalFlagStartDate_X,"Date format - YYYY-MM-DD
Populate from Start Date of FLG  transaction",
,,,,,,,,,,,InstitutionalFlagEndDate_X,"Date format - YYYY-MM-DD
Populate from End Date of FLG transaction",
144,ESRD Flag,FLG,1,PCP/Enroll History,Y,Member has ESRD; LOV: Y = Yes; N = No,Source can be TRR or user update. Each status flag record in the system will send a separate record on this file,Medicare,Y,Member - Health Indicators,ESRDFlag_X,"Map only if ESRD  Flag = Y.


Populate it based on the number of occurences of FLG trasaction,",
,,,,,,,,,,,ESRDFlagStartDate_X,"Date format - YYYY-MM-DD
Populate from Start Date of FLG  transaction",
,,,,,,,,,,,ESRDFlagEndDate_X,"Date format - YYYY-MM-DD
Populate from End Date of FLG transaction",
145,Transplant Flag,FLG,1,PCP/Enroll History,Y,Member received a transplant; LOV: Y = Yes; N = No,Source can be TRR or user update. Each status flag record in the system will send a separate record on this file,couldn't locate in HRP,N,NA,TransplantFlag_X,"Map only if Transplant  Flag = Y.


Populate it based on the number of occurences of FLG trasaction,",
,,,,,,,,,,,TransplantFlagStartDate_X,"Date format - YYYY-MM-DD
Populate from Start Date of FLG  transaction",
,,,,,,,,,,,TransplantFlagEndDate_X,"Date format - YYYY-MM-DD
Populate from End Date of FLG transaction",
146,Dialysis Flag,FLG,1,PCP/Enroll History,Y,Member is on Dialysis; LOV: Y = Yes; N = No,Source can be TRR or user update. Each status flag record in the system will send a separate record on this file,couldn't locate in HRP,N,NA,DialysisFlag_X,"Map only if Dialysis  Flag = Y.


Populate it based on the number of occurences of FLG trasaction,",
,,,,,,,,,,,DialysisFlagStartDate_X,"Date format - YYYY-MM-DD
Populate from Start Date of FLG  transaction",
,,,,,,,,,,,DialysisFlagEndDate_X,"Date format - YYYY-MM-DD
Populate from End Date of FLG transaction",
147,Disabled Flag,FLG,1,PCP/Enroll History,Y,Member is on Dialysis; LOV: Y = Yes; N = No,Source can be TRR or user update. Each status flag record in the system will send a separate record on this file,couldn't locate in HRP,N,NA,DisabledFlag_X,"If Disabled Flag = Y, map /isHandicapped as True
If Disabled Flag = N, map /isHandicapped as False

Populate it based on the number of occurences of FLG trasaction",
,,,,,,,,,,,DisabledFlagStartDate_X,"Date format - YYYY-MM-DD
Populate from Start Date of FLG  transaction",
,,,,,,,,,,,DisabledFlagEndDate_X,"Date format - YYYY-MM-DD
Populate from End Date of FLG transaction",
148,Plan Override Indicator,FLG,1,PCP/Enroll History,Y,Plan override indicator: Y = Yes; N = No,Source can be TRR or user update. Each status flag record in the system will send a separate record on this file,couldn't locate in HRP,N,NA,,,
149,Dual Status Code,MCD,2,PCP/Enroll History,,"Member has Medicaid Dual Status in Medicaid Eligibility History.
LOV: 01, 02, 03, 04, 05, 06, 08, 09, 99",Values will be captured from MCMD processing or user updates,Medicare,Y,Member - Medicare,DualStatusCode_X,Populate it based on the number of occurences of MCD transaction.,
,,,,,,,,,,,MCD_StartdateX,"Date format - YYYY-MM-DD

Populate from Start Date of MCD transaction.",
,,,,,,,,,,,MCD_EnddateX,"Date format - YYYY-MM-DD

Populate from End Date of MCD transaction",
150,Medicaid Record Type,MCD,1,PCP/Enroll History,,"Dual Status record type; LOV: A = Audited, V = Valid",Values will be captured from MCMD processing or user updates,Couldn’t locate in HRP UI,N,NA,xml TAG not available in Sparse,,
151,COB Update Date,COB,8,CMS Files,,YYYYMMDD,Client-specific,Date,Y,Member-COB,COBUpdateDate_X,"Populate it based on the number of occurences.

Date format - YYYY-MM-DD",
,,,,,,,,,,,COBStartdate_X,"Date format - YYYY-MM-DD

Populate start date from COB transaction",
,,,,,,,,,,,COBEnddate_X,"Date format - YYYY-MM-DD
Populate from End Date of COB transaction",
152,Name of Other Coverage,COB,50,CMS Files,,Other insurance name,Client-specific,COB,Y,Member - COB,NameofOtherCoverage_X,Populate it based on the number of occurences of COB transaction.,
153,Subscriber ID of Other Coverage,COB,20,CMS Files,,Other insurance ID number,Client-specific,COB,Y,Member - COB,SubscriberIDofOtherCoverage_X,Populate it based on the number of occurences of COB transaction.,
154,Group ID of other Coverage,COB,20,CMS Files,,Other insurance group number,Client-specific,COB,Y,Member - COB,GroupIDofotherCoverage_X,Populate it based on the number of occurences of COB transaction.,
155,Kind of Other Insurance,COB,3,CMS Files,,Type of other insurance,Client-specific,COB,Y,Member - COB,KindofOtherInsurance_X,Populate it based on the number of occurences of COB transaction.,
156,Name of Other Insurance Company,COB,200,CMS Files,,Name of other insurance company,Client-specific,COB,Y,Member - COB,NameofOtherInsuranceCompany_X,Populate it based on the number of occurences of COB transaction.,
157,Filler Field,,50,,,Filler Field – to be used for future enhancements,Client-specific,NA,Not needed,NA,NA,,
158,Filler Field,,50,,,Filler Field – to be used for future enhancements,Client-specific,NA,Not needed,NA,NA,,
159,Filler Field,,50,,,Filler Field – to be used for future enhancements,Client-specific,NA,Not needed,NA,NA,,
160,M3P Term Reason,M3P,50,PCP/Enroll History,,"LOV: V = Voluntary, I = Involuntary If a member’s M3P span has an end date, there must be a termination reason populated",M3P Term Reason,NA,Not needed,NA,"M3PTermReason_X
M3PStartdate_X
M3PEnddate_X","Date format - YYYY-MM-DD

Populate start date/end date from M3P transaction",
161,Filler Field,,50,,,Filler Field – to be used for future enhancements,,NA,Not needed,NA,NA,,
162,Gender Identity,DEM,50,Member Details,,"This element will populate with the code that is stored on the member details table. If a gender code also has an associated free text element, both will display within this field delimited by a comma.",,NA,Not needed,NA,GenderIdentity,,
163,Sexual Orientation,DEM,50,Member Details,,"This element will populate with the code that is stored on the member details table. If a gender code also has an associated free text element, both will display within this field delimited by a comma.",,NA,Not needed,NA,SexualOrientation,,
164,Alternative Format Data CD,DEM,1,Member Details,,Flag indicating materials requested in Data CD format; LOV: Y = Yes; N = No,Alternate Format: Data CD,NA,Not needed,NA,AlternativeFormatDataCD,,
165,Filler Field,,50,,,Filler Field – to be used for future enhancements,Client-specific,NA,Not needed,NA,NA,,
166,Filler Field,,50,,,Filler Field – to be used for future enhancements,Client-specific,NA,Not needed,NA,NA,,
```

## QA Automation/EDIFECSProduct_MappingSpec_QA Automation_Advantasure_DFF_to_CSV_conversion_V2.0.xlsx — Default Values

```csv
Field in CSV,Default value/Mapping logic
Subscriber_ID,Unique value populated from EDIFECS for a member
Endofrecord,Hardcode as 'EOR'
```

## QA Automation/EDIFECSProduct_MappingSpec_QA Automation_Advantasure_DFF_to_CSV_conversion_V2.0.xlsx — Crosswalk

```csv
Race Values,,,,,Disenrollment Reason codes,,,,PHIRelationshipToMember,,
,,,,,,,,,,,
Advantasure,,HRP /Enrollment sparse value,Shortname in HRP,,Advantasure,,HRP /Enrollment sparse value,,CODEENTRY,SHORTNAME,DESCRIPTION
Value in Memout file,Description,Code entry for code set name=RaceOrEthnicityCode,,,Value in Memout file,ShortName,ShortDescription,,10,Emancipated Minor,Emancipated Minor
300,American Indian or Alaska Native,I,American Indian or Alaska Native,,3,Date of Death Auto-Termination Policy,Date of Death Auto-Termination Policy,,11,Employee,Employee
401,Asian Indian,5,Asian Indian,,2,Member No longer Eligible,Member No longer Eligible,,12,Ex-spouse,Ex-spouse
201,Black or African American,ROEC2,Black or African American,,,,,,13,Father,Father
411,Chinese,14,Chinese,,10,Overdue payment,Overdue payment,,14,Father or Mother,Father or Mother
421,Filipino,21,Filipino,,1,Qualif  Event-Member Term,Qualif  Event-Member Term,,15,Foster Child,Foster Child
521,Guamanian or Chamorro,ROEC4,Guamanian or Chamorro,,,,,,16,Grandmother or Grandfather,Grandmother or Grandfather
431,Japanese,35,Japanese,,,,,,17,Grandson or Granddaughter,Grandson or Granddaughter
441,Korean,37,Korean,,,,,,18,Guardian,Guardian
501,Native Hawaiian,J,Native Hawaiian,,,,,,19,Handicapped Dependent,Handicapped Dependent
499,Other Asian,4,Asian,,,,,,1,Adopted Child,Adopted Child
599,Other Pacific Islander,ROEC3,Other Pacific Islander,,,,,,20,Injured Plaintiff,Injured Plaintiff
511,Samoan,52,Samoan,,,,,,21,Life Partner,Life Partner
451,Vietnamese,58,Vietnamese,,,,,,22,Mother,Mother
101,White,R5,White-CDC,,,,,,23,Mother-in-law or Father-in-law,Mother-in-law or Father-in-law
999,I choose not to answer,7,Not Provided,,,,,,24,Nephew or Niece,Nephew or Niece
,,,,,,,,,25,Other Adult,Other Adult
Ethnicity Values,,,,,,,,,26,Other Relationship,Other Relationship
,,,,,,,,,27,Significant Other,Significant Other
Advantasure,,HRP /Enrollment sparse value,Shortname in HRP,,,,,,28,Son-in-law or Daughter-in-law,Son-in-law or Daughter-in-law
Value in Memout file,Description,Code entry for code set name=RaceOrEthnicityCode,,,,,,,29,Sponsored Dependent,Sponsored Dependent
NA,"Not of Hispanic, Latino/a or Spanish
Origin",ROEC1,Not Hispanic or Latino,,,,,,2,Brother or Sister,Brother or Sister
PR,Puerto Rican,47,Puerto Rican,,,,,,30,Spouse,Spouse
OTH,"Another Hispanic, Latino or Spanish
Origin",E1,Hispanic or Latino -CDC,,,,,,31,Stepfather,Stepfather
MX,"Mexican, Mexican American, Chicano/a",40,Mexican American,,,,,,32,Stepmother,Stepmother
CUB,Cuban,15,Cuban,,,,,,33,Stepson or Stepdaughter,Stepson or Stepdaughter
NR,I choose not to answer,7,Not Provided,,,,,,34,Uncle or Aunt,Uncle or Aunt
,,,,,,,,,35,Unknown,Unknown
,,,,,,,,,36,Ward,Ward
Language Codes,,,,,,,,,3,Brother-in-law or Sister-in-law,Brother-in-law or Sister-in-law
,,,,,,,,,4,Child,Child
Advantasure,,HRP /Enrollment sparse value,Comments,,,,,,5,Child - Insured Has No Financial Responsibility,Child where Insured Has No Financial Responsibility
Value in Memout file,Description,Code entry for code set name=LanguageDomain,,,,,,,6,Collateral Dependent,Collateral Dependent
<null>,English,EN,,,,,,,7,Court Appointed Guardian,Court Appointed Guardian
ENG,English,EN,,,,,,,8,Cousin,Cousin
SPA,Spanish,ES,,,,,,,9,Dependent of a Minor Dependent,Dependent of a Minor Dependent
FRA,French,FR,,,,,,,,,
GER,German,DE,,,,,,,,,
OTH,Other,OT,,,,,,,,,
,,,,,,,,,,,
,,,,,,,,,,,
,,,,,,,,,,,
Relationship to the Member,,,,,,,,,,,
Code,Description,,,,,,,,,,
1,Spouse,,,,,,,,,,
3,Parent,,,,,,,,,,
4,Grandparent,,,,,,,,,,
5,Grandchild,,,,,,,,,,
6,Uncle or Aunt,,,,,,,,,,
7,Nephew or Niece,,,,,,,,,,
8,Cousin,,,,,,,,,,
9,Adopted Child,,,,,,,,,,
10,Foster Child,,,,,,,,,,
11,Son/Daughter-inlaw,,,,,,,,,,
12,Brother/Sister-inlaw,,,,,,,,,,
13,Mother/Fatherin-law,,,,,,,,,,
14,Sibling,,,,,,,,,,
15,Ward,,,,,,,,,,
16,Stepparent,,,,,,,,,,
17,Stepchild,,,,,,,,,,
18,Self,,,,,,,,,,
19,Child,,,,,,,,,,
23,Sponsored Dependent,,,,,,,,,,
24,Dependent of a Minor Dependent,,,,,,,,,,
25,Ex-spouse,,,,,,,,,,
26,Guardian,,,,,,,,,,
31,Court Appointed Guardian,,,,,,,,,,
38,Collateral Dependent,,,,,,,,,,
53,Life Partner,,,,,,,,,,
60,Annuitant,,,,,,,,,,
D2,Trustee,,,,,,,,,,
G8,Other Relationship,,,,,,,,,,
G9,Other Relative,,,,,,,,,,
```
