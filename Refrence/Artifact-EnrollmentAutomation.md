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
<!-- <Aliases><Alias ID="{S3000}" V="/Loop(ID = '2300')/Loop(ID = '2320')"/><Alias ID="{S3001}" V="/Loop(ID = '2100A')/Segment(ID = 'PER')"/><Alias ID="{S3002}" V="/Loop(ID = '2100A')/Segment(ID = 'DMG')"/><Alias ID="{S3003}" V="/Loop(ID = '2100A')/Segment(ID = 'NM1')"/><Alias ID="{S3004}" V="/Loop(ID = '2100A')/Segment(ID = 'LUI')"/><Alias ID="{S3005}" V="/Loop(ID = 'LS')/Loop(ID = '2700')/Loop(ID = '2750')"/><Alias ID="{S3006}" V="/Loop(ID = '2100A')/Segment(ID = 'N4')"/><Alias ID="{S3007}" V="/Loop(ID = '2100C')/Segment(ID = 'N4')"/><Alias ID="{S3008}" V="/Loop(ID = '2300')/Loop(ID = '2310')/Segment(ID = 'NM1')"/><Alias ID="{P1}" V="/Message(ID = 'Message')/Record(ID = 'Record')"/><Alias ID="{P2}" V="/Transaction(ID = '834')/Loop(ID = '2000')"/><Alias ID="{P3}" V="/Transaction(ID = '834')"/><Alias ID="{P4}" V="/InternalProperties/Level(Name = 'Interchange')"/></Aliases> -->
assets\
└── ArtifactsRepository
    └── EnrollmentAutomation
        ├── IBEnrollment834
        │   ├── Guideline
        │   ├── Map
        │   │   └── IB_834_Automation_Map.ems
        │   ├── Parser
        │   ├── SplitRule
        │   │   └── IB_834_Automation_EDI_Splitrule.xml
        │   └── Template
        │       └── IB_834_Automation_Header.txt
        └── IBEnrollmentADV
            ├── Groovy
            │   └── P_IB_DFF_Ordering.txt
            ├── Guideline
            ├── Map
            │   └── P_IB_DFF_CSV_AUTOMATION.ems
            ├── Parser
            ├── SplitRule
            │   └── P_IB_DFF_Splitrule.xml
            └── Template
                └── P_IB_CSV_Header.txt

<file path="ArtifactsRepository/EnrollmentAutomation/IBEnrollment834/Map/IB_834_Automation_Map.ems">
<?xml version="1.0" encoding="UTF-8"?><Map Version="3" ModelVersion="4" ModelRevision="1" LastCPID="1814"><Ps C="Variables"><P N="LastVarID">88</P><P N="1/ID">2</P><P N="1/Name">Maintenance_Type_Code</P><P N="2/ID">3</P><P N="2/Name">Maintenance</P><P N="2/InitValue">0</P><P N="3/ID">5</P><P N="3/Name">PER03_2100A</P><P N="4/ID">6</P><P N="4/Name">PER05_2100A</P><P N="5/ID">8</P><P N="5/Name">PER04_2100A</P><P N="6/ID">10</P><P N="6/Name">PER06_2100A</P><P N="7/ID">11</P><P N="7/Name">PER07_2100A</P><P N="8/ID">12</P><P N="8/Name">PER08_2100A</P><P N="9/ID">13</P><P N="9/Name">LUI_count</P><P N="9/InitValue">0</P><P N="10/ID">15</P><P N="10/Name">REF_2300_1L</P><P N="11/ID">16</P><P N="11/Name">COB01_2320</P><P N="12/ID">18</P><P N="12/Name">NM1_2330</P><P N="12/InitValue">0</P><P N="13/ID">19</P><P N="13/Name">N1_2750</P><P N="14/ID">20</P><P N="14/Name">REF01_2750</P><P N="14/InitValue">0</P><P N="15/ID">21</P><P N="15/Name">DTP03_2750</P><P N="15/InitValue">0</P><P N="16/ID">23</P><P N="16/Name">DTP_2300</P><P N="17/ID">24</P><P N="17/Name">DTP01_2300</P><P N="17/InitValue">0</P><P N="18/ID">25</P><P N="18/Name">INS03_2000</P><P N="19/ID">26</P><P N="19/Name">DMG_C_Count</P><P N="20/ID">27</P><P N="20/Name">DTP01_2320</P><P N="21/ID">28</P><P N="21/Name">DTP_2320</P><P N="21/InitValue">0</P><P N="22/ID">29</P><P N="22/Name">HD03_2300</P><P N="23/ID">30</P><P N="23/Name">Count_2300</P><P N="23/InitValue">0</P><P N="24/ID">31</P><P N="24/Name">HD01_2300</P><P N="25/ID">32</P><P N="25/Name">DMG_C01_2100A</P><P N="26/ID">33</P><P N="26/Name">LUI04_2100A</P><P N="27/ID">34</P><P N="27/Name">Count_2320</P><P N="27/InitValue">0</P><P N="28/ID">35</P><P N="28/Name">COB02_2320</P><P N="29/ID">36</P><P N="29/Name">DTP03_2320</P><P N="30/ID">37</P><P N="30/Name">DTP_Count</P><P N="30/InitValue">0</P><P N="31/ID">38</P><P N="31/Name">DTP_</P><P N="32/ID">39</P><P N="32/Name">DTP_01_2300</P><P N="33/ID">40</P><P N="33/Name">DTP_03_2300</P><P N="34/ID">45</P><P N="34/Name">REF_2300_CE</P><P N="35/ID">46</P><P N="35/Name">REF_2300_17</P><P N="36/ID">47</P><P N="36/Name">REF_2300_ZZ</P><P N="37/ID">48</P><P N="37/Name">Count__2000</P><P N="37/InitValue">0</P><P N="38/ID">51</P><P N="38/Name">EdiFileName</P><P N="39/ID">52</P><P N="39/Name">INS_Count</P><P N="39/InitValue">0</P><P N="40/ID">53</P><P N="40/Name">REF02_2000</P><P N="41/ID">54</P><P N="41/Name">ST_02_ControlNumber</P><P N="42/ID">55</P><P N="42/Name">Count_2700</P><P N="42/InitValue">0</P><P N="43/ID">56</P><P N="43/Name">REF02_2750</P><P N="44/ID">57</P><P N="44/Name">N1__2750</P><P N="45/ID">58</P><P N="45/Name">DTP03__2750</P><P N="46/ID">59</P><P N="46/Name">INS_2000</P><P N="47/ID">60</P><P N="47/Name">DTP01__2000</P><P N="48/ID">61</P><P N="48/Name">Member_Level_DTP357</P><P N="49/ID">62</P><P N="49/Name">DTP01__2300</P><P N="50/ID">63</P><P N="50/Name">Health_Coverage_DTP_349</P><P N="51/ID">64</P><P N="51/Name">File_Effective_DTP303</P><P N="52/ID">67</P><P N="52/Name">Member_Level_DTP303</P><P N="53/ID">68</P><P N="53/Name">Member_2100A_PER_Email</P><P N="54/ID">69</P><P N="54/Name">Member_2100A_PER_HP</P><P N="55/ID">70</P><P N="55/Name">Member_2100A_PER_WP</P><P N="56/ID">71</P><P N="56/Name">Member_2100A_PER_TE</P><P N="57/ID">72</P><P N="57/Name">Member_2100A_PER_CP</P><P N="58/ID">75</P><P N="58/Name">Count_______</P><P N="58/InitValue">0</P><P N="59/ID">76</P><P N="59/Name">COB_RefID</P><P N="60/ID">77</P><P N="60/Name">COB_StartDate_344</P><P N="61/ID">78</P><P N="61/Name">COB_EndDate_345</P><P N="62/ID">79</P><P N="62/Name">COB_CompanyName</P><P N="63/ID">80</P><P N="63/Name">File_Effective_DTP007</P><P N="64/ID">81</P><P N="64/Name">INS01_2000</P><P N="65/ID">82</P><P N="65/Name">Subscriber_ID</P><P N="66/ID">83</P><P N="66/Name">interchangeSenderId</P><P N="67/ID">84</P><P N="67/Name">interchangeReceiverId</P><P N="68/ID">85</P><P N="68/Name">DTP_343_2300</P><P N="69/ID">86</P><P N="69/Name">ediFileName</P><P N="70/ID">87</P><P N="70/Name">action_Code</P><P N="71/ID">88</P><P N="71/Name">receiptDate</P></Ps><Sources><ES ID="1" Type="File.ECS"><Ps><P N="Name">Source</P><P N="Location">..\Guideline\IB_834_Automation_EDI_Source.ecs</P></Ps><CPs><CP ID="11" Pth="{P2}/Segment(ID = 'INS')/Element(ID = '875')"/><CP ID="19" Pth="{P3}/Segment(ID = 'QTY')/Element(ID = '673')"/><CP ID="20" Pth="{P3}/Segment(ID = 'QTY')/Element(ID = '380')"/><CP ID="23" Pth="{P2}/Segment(ID = 'INS')/Element(ID = '1073')"/><CP ID="27" Pth="{P2}/Segment(ID = 'INS')/Element(ID = '1069')"/><CP ID="46" Pth="{P2}/Segment(ID = 'INS')/Element(ID = '1203')"/><CP ID="83" Pth="{P2}/Segment(ID = 'INS')/Element(ID = '1216')"/><CP ID="89" Pth="{P2}/Segment(ID = 'REF')/Element(ID = '127')"/><CP ID="91" Pth="{P2}/Segment(ID = 'REF')[2]/Element(ID = '127')"/><CP ID="102" Pth="{P2}/Segment(ID = 'REF')[3]/Element(ID = '127')"/><CP ID="111" Pth="{P2}{S3003}/Element(ID = '1035')"/><CP ID="113" Pth="{P2}{S3003}/Element(ID = '1036')"/><CP ID="115" Pth="{P2}{S3003}/Element(ID = '1037')"/><CP ID="117" Pth="{P2}{S3003}/Element(ID = '67')"/><CP ID="121" Pth="{P2}{S3001}/Element(ID = '365')"/><CP ID="123" Pth="{P2}{S3001}/Element(ID = '364')"/><CP ID="146" Pth="{P2}/Loop(ID = '2100A')/Segment(ID = 'N3')/Element(ID = '166')"/><CP ID="154" Pth="{P2}{S3006}/Element(ID = '19')"/><CP ID="156" Pth="{P2}{S3006}/Element(ID = '156')"/><CP ID="160" Pth="{P2}{S3006}/Element(ID = '116')"/><CP ID="165" Pth="{P2}{S3006}/Element(ID = '310')"/><CP ID="169" Pth="{P2}{S3002}/Element(ID = '1068')"/><CP ID="174" Pth="{P2}{S3002}/Element(ID = '1067')"/><CP ID="187" Pth="{P2}/Loop(ID = '2100A')/Segment(ID = 'HLH')/Element(ID = '1212')"/><CP ID="234" Pth="{P2}{S3001}/Element(ID = '365')[2]"/><CP ID="235" Pth="{P2}{S3001}/Element(ID = '364')[2]"/><CP ID="236" Pth="{P2}{S3001}/Element(ID = '365')[3]"/><CP ID="237" Pth="{P2}{S3001}/Element(ID = '364')[3]"/><CP ID="274" Pth="{P2}"/><CP ID="292" Pth="{P2}{S3004}/Element(ID = '66')"/><CP ID="298" Pth="{P2}{S3004}"/><CP ID="301" Pth="{P2}/Loop(ID = '2100A')"/><CP ID="304" Pth="{P2}{S3004}/Element(ID = '67')"/><CP ID="326" Pth="{P2}{S3004}/Element(ID = '1303')"/><CP ID="356" Pth="{P2}/Loop(ID = '2300')/Segment(ID = 'HD')/Element(ID = '1205')"/><CP ID="368" Pth="{P2}/Loop(ID = '2300')"/><CP ID="408" Pth="{P2}/Loop(ID = '2300')/Segment(ID = 'REF')/Element(ID = '128')"/><CP ID="411" Pth="{P2}/Loop(ID = '2300')/Segment(ID = 'REF')/Element(ID = '127')"/><CP ID="438" Pth="{P2}{S3000}/Segment(ID = 'COB')/Element(ID = '1138')"/><CP ID="468" Pth="{P2}{S3000}"/><CP ID="523" Pth="{P2}{S3000}/Loop(ID = '2330')/Segment(ID = 'NM1')/Element(ID = '98')"/><CP ID="524" Pth="{P2}{S3000}/Loop(ID = '2330')/Segment(ID = 'NM1')/Element(ID = '1035')"/><CP ID="529" Pth="{P2}{S3000}/Loop(ID = '2330')"/><CP ID="549" Pth="{P2}{S3005}/Segment(ID = 'N1')/Element(ID = '93')"/><CP ID="578" Pth="{P2}{S3005}/Segment(ID = 'REF')/Element(ID = '127')"/><CP ID="604" Pth="{P2}{S3005}/Segment(ID = 'DTP')/Element(ID = '1251')"/><CP ID="619" Pth="{P2}/Loop(ID = '2300')/Segment(ID = 'HD')/Element(ID = '875')"/><CP ID="660" Pth="{P2}/Loop(ID = '2300')/Segment(ID = 'DTP')/Element(ID = '1251')"/><CP ID="690" Pth="{P2}/Loop(ID = '2300')/Segment(ID = 'DTP')/Element(ID = '374')"/><CP ID="699" Pth="{P2}{S3008}/Element(ID = '98')"/><CP ID="703" Pth="{P2}{S3008}/Element(ID = '67')"/><CP ID="723" Pth="{P3}/Segment(ID = 'DTP')/Element(ID = '1251')"/><CP ID="728" Pth="{P3}/Segment(ID = 'DTP')/Element(ID = '374')"/><CP ID="730" Pth="{P2}/Segment(ID = 'DTP')/Element(ID = '374')"/><CP ID="734" Pth="{P2}/Segment(ID = 'DTP')/Element(ID = '1251')"/><CP ID="739" Pth="{P2}{S3002}/Composite(ID = 'C056')/Element(ID = '1109')"/><CP ID="752" Pth="{P2}{S3002}/Composite(ID = 'C056')"/><CP ID="764" Pth="{P2}{S3002}/Element(ID = '1251')"/><CP ID="778" Pth="{P2}/Loop(ID = '2300')/Loop(ID = '2310')/Segment(ID = 'PLA')/Element(ID = '373')"/><CP ID="811" Pth="{P2}{S3000}/Segment(ID = 'DTP')/Element(ID = '1251')"/><CP ID="813" Pth="{P2}{S3000}/Segment(ID = 'DTP')/Element(ID = '374')"/><CP ID="1169" Pth="{P2}/Loop(ID = 'LS')/Loop(ID = '2700')"/><CP ID="1178" Pth="{P2}/Segment(ID = 'INS')"/><CP ID="1181" Pth="{P3}/Segment(ID = 'ST')/Element(ID = '329')"/><CP ID="1187" Pth="{P3}/Segment(ID = 'BGN')/Element(ID = '306')"/><CP ID="1195" Pth="{P4}/Level(Name = 'Group')/Field(Name = 'GroupDate')"/><CP ID="1300" Pth="{P2}/Segment(ID = 'REF')[3]/Element(ID = '128')"/><CP ID="1328" Pth="{P2}/Loop(ID = '2100C')/Segment(ID = 'N3')/Element(ID = '166')"/><CP ID="1330" Pth="{P2}{S3007}/Element(ID = '19')"/><CP ID="1332" Pth="{P2}{S3007}/Element(ID = '156')"/><CP ID="1334" Pth="{P2}{S3007}/Element(ID = '116')"/><CP ID="1484" Pth="{P2}{S3000}/Segment(ID = 'COB')/Element(ID = '127')"/><CP ID="1493" Pth="{P2}{S3000}/Segment(ID = 'REF')/Element(ID = '128')"/><CP ID="1494" Pth="{P2}{S3000}/Segment(ID = 'REF')/Element(ID = '127')"/><CP ID="1717" Pth="{P3}"/><CP ID="1756" Pth="/InternalProperties/Field(Name = 'EdiFileName')"/><CP ID="1758" Pth="{P4}/Field(Name = 'InterchangeSenderID')"/><CP ID="1760" Pth="{P4}/Field(Name = 'InterchangeReceiverID')"/><CP ID="1783" Pth="{P2}{S3002}/Element(ID = '1066')"/></ConnectionPoints/></Sources><Targets><ES ID="2" Type="File.ECS"><Ps><P N="Name">Target</P><P N="Location">..\..\..\..\..\Adaptor\ArtifactsRepository\EnrollmentAutomation\IBEnrollment834\Guideline\IB_834_Automation_EDI_Target.ecs</P></Ps><CPs><CP ID="67" Pth="{P1}[2]/Field(ID = 'MemberIsSubscriber')"/><CP ID="71" Pth="{P1}[2]/Field(ID = 'Relationship_Name')"/><CP ID="74" Pth="{P1}[2]/Field(ID = 'Individual_Relationship_Code')"/><CP ID="75" Pth="{P1}[2]/Field(ID = 'Maintenance_type_code_EDI')"/><CP ID="76" Pth="{P1}[2]/Field(ID = 'Maintenance_Type_Code')"/><CP ID="77" Pth="{P1}[2]/Field(ID = 'Member_MaintenanceReasonCode_Name')"/><CP ID="93" Pth="{P1}[2]/Field(ID = 'BenefitStatusCode')"/><CP ID="94" Pth="{P1}[2]/Field(ID = 'Member_MaintenanceReasonCode_Entry')"/><CP ID="95" Pth="{P1}[2]/Field(ID = 'Subscriber_identification_number')"/><CP ID="96" Pth="{P1}[2]/Field(ID = 'Policy_number')"/><CP ID="103" Pth="{P1}[2]/Field(ID = 'Cross_Reference_Number')"/><CP ID="104" Pth="{P1}[2]/Field(ID = 'Client_Number')"/><CP ID="105" Pth="{P1}[2]/Field(ID = 'Client_Reporting_Category')"/><CP ID="106" Pth="{P1}[2]/Field(ID = 'Mutually_Defined_Identifier')"/><CP ID="108" Pth="{P1}[2]/Field(ID = 'Case_Number')"/><CP ID="112" Pth="{P1}[2]/Field(ID = 'Last_Name')"/><CP ID="114" Pth="{P1}[2]/Field(ID = 'First_Name')"/><CP ID="116" Pth="{P1}[2]/Field(ID = 'Middle_Name')"/><CP ID="118" Pth="{P1}[2]/Field(ID = 'Identification_Number')"/><CP ID="136" Pth="{P1}[2]/Field(ID = 'Phone_Area_Code')"/><CP ID="137" Pth="{P1}[2]/Field(ID = 'Phone_Number')"/><CP ID="139" Pth="{P1}[2]/Field(ID = 'emailAddress')"/><CP ID="147" Pth="{P1}[2]/Field(ID = 'Postal_Address')"/><CP ID="149" Pth="{P1}[2]/Field(ID = 'AddressTypeCode_Name')"/><CP ID="152" Pth="{P1}[2]/Field(ID = 'AddressTypeCode_Entry')"/><CP ID="155" Pth="{P1}[2]/Field(ID = 'City_Name')"/><CP ID="157" Pth="{P1}[2]/Field(ID = 'State_Code')"/><CP ID="161" Pth="{P1}[2]/Field(ID = 'Zip_Code')"/><CP ID="164" Pth="{P1}[2]/Field(ID = 'ZipExtension_Code')"/><CP ID="166" Pth="{P1}[2]/Field(ID = 'County_Code')"/><CP ID="171" Pth="{P1}[2]/Field(ID = 'Gender_Code')"/><CP ID="179" Pth="{P1}[2]/Field(ID = 'Marital_Status_Code')"/><CP ID="181" Pth="{P1}[2]/Field(ID = 'Ethnicity_codeSetName')"/><CP ID="188" Pth="{P1}[2]/Field(ID = 'Smoking_Status')"/><CP ID="293" Pth="{P1}[2]/Field(ID = 'Language_codeSetName[1]')"/><CP ID="294" Pth="{P1}[2]/Field(ID = 'Language_codeSetName[2]')"/><CP ID="295" Pth="{P1}[2]/Field(ID = 'Language_codeSetName[3]')"/><CP ID="318" Pth="{P1}[2]/Field(ID = 'Language_codeEntry[2]')"/><CP ID="319" Pth="{P1}[2]/Field(ID = 'Language_codeEntry[1]')"/><CP ID="322" Pth="{P1}[2]/Field(ID = 'Language_codeEntry[3]')"/><CP ID="339" Pth="{P1}[2]/Field(ID = 'Primary_Language[1]')"/><CP ID="340" Pth="{P1}[2]/Field(ID = 'Native_Language[1]')"/><CP ID="341" Pth="{P1}[2]/Field(ID = 'Primary_Language[2]')"/><CP ID="342" Pth="{P1}[2]/Field(ID = 'Native_Language[2]')"/><CP ID="343" Pth="{P1}[2]/Field(ID = 'Primary_Language[3]')"/><CP ID="344" Pth="{P1}[2]/Field(ID = 'Native_Language[3]')"/><CP ID="357" Pth="{P1}[2]/Field(ID = 'InsuranceLineCode[1]')"/><CP ID="358" Pth="{P1}[2]/Field(ID = 'HealthCoverageMaintenanceCode[2]')"/><CP ID="359" Pth="{P1}[2]/Field(ID = 'InsuranceLineCode[3]')"/><CP ID="360" Pth="{P1}[2]/Field(ID = 'InsuranceLineCode[4]')"/><CP ID="361" Pth="{P1}[2]/Field(ID = 'InsuranceLineCode[7]')"/><CP ID="362" Pth="{P1}[2]/Field(ID = 'InsuranceLineCode[8]')"/><CP ID="363" Pth="{P1}[2]/Field(ID = 'InsuranceLineCode[6]')"/><CP ID="364" Pth="{P1}[2]/Field(ID = 'InsuranceLineCode[5]')"/><CP ID="412" Pth="{P1}[2]/Field(ID = 'BenefitPlan_Hcc_Id_EDI_Group Number(1)')"/><CP ID="413" Pth="{P1}[2]/Field(ID = 'BenefitPlan_Hcc_Id_EDI_Group Number(2)')"/><CP ID="414" Pth="{P1}[2]/Field(ID = 'BenefitPlan_Hcc_Id_EDI_Group Number(3)')"/><CP ID="415" Pth="{P1}[2]/Field(ID = 'BenefitPlan_Hcc_Id_EDI_Group Number(4)')"/><CP ID="416" Pth="{P1}[2]/Field(ID = 'BenefitPlan_Hcc_Id_EDI_Group Number(5)')"/><CP ID="417" Pth="{P1}[2]/Field(ID = 'BenefitPlan_Hcc_Id_EDI_Group Number(6)')"/><CP ID="418" Pth="{P1}[2]/Field(ID = 'BenefitPlan_Hcc_Id_EDI_Group Number(7)')"/><CP ID="419" Pth="{P1}[2]/Field(ID = 'BenefitPlan_Hcc_Id_EDI_Group Number(8)')"/><CP ID="420" Pth="{P1}[2]/Field(ID = 'BenefitPlan_Hcc_Id_EDI_Class of Contract code(1)')"/><CP ID="421" Pth="{P1}[2]/Field(ID = 'BenefitPlan_Hcc_Id_EDI_Class of Contract code(2)')"/><CP ID="422" Pth="{P1}[2]/Field(ID = 'BenefitPlan_Hcc_Id_EDI_Class of Contract code(3)')"/><CP ID="423" Pth="{P1}[2]/Field(ID = 'BenefitPlan_Hcc_Id_EDI_Class of Contract code(4)')"/><CP ID="424" Pth="{P1}[2]/Field(ID = 'BenefitPlan_Hcc_Id_EDI_Class of Contract code(5)')"/><CP ID="425" Pth="{P1}[2]/Field(ID = 'BenefitPlan_Hcc_Id_EDI_Class of Contract code(6)')"/><CP ID="426" Pth="{P1}[2]/Field(ID = 'BenefitPlan_Hcc_Id_EDI_Class of Contract code(7)')"/><CP ID="427" Pth="{P1}[2]/Field(ID = 'BenefitPlan_Hcc_Id_EDI_Class of Contract code(8)')"/><CP ID="428" Pth="{P1}[2]/Field(ID = 'BenefitPlan_Hcc_Id_EDI_Client_Reporting Category(1)')"/><CP ID="429" Pth="{P1}[2]/Field(ID = 'BenefitPlan_Hcc_Id_EDI_Client_ReportingCategory(2)')"/><CP ID="430" Pth="{P1}[2]/Field(ID = 'BenefitPlan_Hcc_Id_EDI_Client_ReportingCategory(3)')"/><CP ID="431" Pth="{P1}[2]/Field(ID = 'BenefitPlan_Hcc_Id_EDI_Client_ReportingCategory(4)')"/><CP ID="432" Pth="{P1}[2]/Field(ID = 'BenefitPlan_Hcc_Id_EDI_Client_ReportingCategory(5)')"/><CP ID="433" Pth="{P1}[2]/Field(ID = 'BenefitPlan_Hcc_Id_EDI_Client_ReportingCategory(6)')"/><CP ID="434" Pth="{P1}[2]/Field(ID = 'BenefitPlan_Hcc_Id_EDI_Client_ReportingCategory(7)')"/><CP ID="435" Pth="{P1}[2]/Field(ID = 'BenefitPlan_Hcc_Id_EDI_Client_ReportingCategory(8)')"/><CP ID="459" Pth="{P1}[2]/Field(ID = 'COB_responsibilitySequenceCode[1]')"/><CP ID="460" Pth="{P1}[2]/Field(ID = 'COB_responsibilitySequenceCode[2]')"/><CP ID="461" Pth="{P1}[2]/Field(ID = 'COB_responsibilitySequenceCode[3]')"/><CP ID="462" Pth="{P1}[2]/Field(ID = 'COB_responsibilitySequenceCode[4]')"/><CP ID="463" Pth="{P1}[2]/Field(ID = 'COB_responsibilitySequenceCode[5]')"/><CP ID="486" Pth="{P1}[2]/Field(ID = 'BenefitPlan_Hcc_Id_EDI_MutuallyDefined(1)')"/><CP ID="487" Pth="{P1}[2]/Field(ID = 'BenefitPlan_Hcc_Id_EDI_MutuallyDefined(2)')"/><CP ID="488" Pth="{P1}[2]/Field(ID = 'BenefitPlan_Hcc_Id_EDI_MutuallyDefined(3)')"/><CP ID="489" Pth="{P1}[2]/Field(ID = 'BenefitPlan_Hcc_Id_EDI_MutuallyDefined(4)')"/><CP ID="490" Pth="{P1}[2]/Field(ID = 'BenefitPlan_Hcc_Id_EDI_MutuallyDefined(5)')"/><CP ID="491" Pth="{P1}[2]/Field(ID = 'BenefitPlan_Hcc_Id_EDI_MutuallyDefined(6)')"/><CP ID="492" Pth="{P1}[2]/Field(ID = 'BenefitPlan_Hcc_Id_EDI_MutuallyDefined(7)')"/><CP ID="493" Pth="{P1}[2]/Field(ID = 'BenefitPlan_Hcc_Id_EDI_MutuallyDefined(8)')"/><CP ID="530" Pth="{P1}[2]/Field(ID = 'COB_otherInsuranceCompanyName[1]')"/><CP ID="531" Pth="{P1}[2]/Field(ID = 'COB_otherInsuranceCompanyName[2]')"/><CP ID="532" Pth="{P1}[2]/Field(ID = 'COB_otherInsuranceCompanyName[3]')"/><CP ID="533" Pth="{P1}[2]/Field(ID = 'COB_otherInsuranceCompanyName[4]')"/><CP ID="534" Pth="{P1}[2]/Field(ID = 'COB_otherInsuranceCompanyName[5]')"/><CP ID="555" Pth="{P1}[2]/Field(ID = 'Reporting_Category_Name[1]')"/><CP ID="556" Pth="{P1}[2]/Field(ID = 'Reporting_Category_Name[2]')"/><CP ID="557" Pth="{P1}[2]/Field(ID = 'Reporting_Category_Name[3]')"/><CP ID="558" Pth="{P1}[2]/Field(ID = 'Reporting_Category_Name[4]')"/><CP ID="559" Pth="{P1}[2]/Field(ID = 'Reporting_Category_Name[5]')"/><CP ID="560" Pth="{P1}[2]/Field(ID = 'Reporting_Category_Name[6]')"/><CP ID="561" Pth="{P1}[2]/Field(ID = 'Reporting_Category_Name[7]')"/><CP ID="562" Pth="{P1}[2]/Field(ID = 'Reporting_Category_Name[8]')"/><CP ID="563" Pth="{P1}[2]/Field(ID = 'Reporting_Category_Name[9]')"/><CP ID="564" Pth="{P1}[2]/Field(ID = 'Reporting_Category_Name[10]')"/><CP ID="581" Pth="{P1}[2]/Field(ID = 'Reporting_Category_Identification[1]')"/><CP ID="582" Pth="{P1}[2]/Field(ID = 'Reporting_Category_Identification[2]')"/><CP ID="583" Pth="{P1}[2]/Field(ID = 'Reporting_Category_Identification[3]')"/><CP ID="584" Pth="{P1}[2]/Field(ID = 'Reporting_Category_Identification[4]')"/><CP ID="585" Pth="{P1}[2]/Field(ID = 'Reporting_Category_Identification[5]')"/><CP ID="586" Pth="{P1}[2]/Field(ID = 'Reporting_Category_Identification[6]')"/><CP ID="587" Pth="{P1}[2]/Field(ID = 'Reporting_Category_Identification[7]')"/><CP ID="588" Pth="{P1}[2]/Field(ID = 'Reporting_Category_Date[8]')"/><CP ID="589" Pth="{P1}[2]/Field(ID = 'Reporting_Category_Identification[9]')"/><CP ID="590" Pth="{P1}[2]/Field(ID = 'Reporting_Category_Identification[10]')"/><CP ID="605" Pth="{P1}[2]/Field(ID = 'Reporting_Category_Date[1]')"/><CP ID="606" Pth="{P1}[2]/Field(ID = 'Reporting_Category_Date[2]')"/><CP ID="607" Pth="{P1}[2]/Field(ID = 'Reporting_Category_Date[3]')"/><CP ID="608" Pth="{P1}[2]/Field(ID = 'Reporting_Category_Date[4]')"/><CP ID="609" Pth="{P1}[2]/Field(ID = 'Reporting_Category_Date[5]')"/><CP ID="610" Pth="{P1}[2]/Field(ID = 'Reporting_Category_Date[6]')"/><CP ID="611" Pth="{P1}[2]/Field(ID = 'Reporting_Category_Date[7]')"/><CP ID="612" Pth="{P1}[2]/Field(ID = 'Reporting_Category_Identification[8]')"/><CP ID="613" Pth="{P1}[2]/Field(ID = 'Reporting_Category_Date[9]')"/><CP ID="614" Pth="{P1}[2]/Field(ID = 'Reporting_Category_Date[10]')"/><CP ID="623" Pth="{P1}[2]/Field(ID = 'HealthCoverageMaintenanceCode[1]')"/><CP ID="624" Pth="{P1}[2]/Field(ID = 'InsuranceLineCode[2]')"/><CP ID="625" Pth="{P1}[2]/Field(ID = 'HealthCoverageMaintenanceCode[3]')"/><CP ID="626" Pth="{P1}[2]/Field(ID = 'HealthCoverageMaintenanceCode[4]')"/><CP ID="627" Pth="{P1}[2]/Field(ID = 'HealthCoverageMaintenanceCode[5]')"/><CP ID="628" Pth="{P1}[2]/Field(ID = 'HealthCoverageMaintenanceCode[6]')"/><CP ID="629" Pth="{P1}[2]/Field(ID = 'HealthCoverageMaintenanceCode[7]')"/><CP ID="630" Pth="{P1}[2]/Field(ID = 'HealthCoverageMaintenanceCode[8]')"/><CP ID="661" Pth="{P1}[2]/Field(ID = 'BenefitPlan_startDate[1]')"/><CP ID="662" Pth="{P1}[2]/Field(ID = 'BenefitPlan_endDate[1]')"/><CP ID="663" Pth="{P1}[2]/Field(ID = 'BenefitPlan_startDate[2]')"/><CP ID="664" Pth="{P1}[2]/Field(ID = 'BenefitPlan_endDate[2]')"/><CP ID="665" Pth="{P1}[2]/Field(ID = 'BenefitPlan_startDate[3]')"/><CP ID="666" Pth="{P1}[2]/Field(ID = 'BenefitPlan_endDate[3]')"/><CP ID="667" Pth="{P1}[2]/Field(ID = 'BenefitPlan_startDate[4]')"/><CP ID="668" Pth="{P1}[2]/Field(ID = 'BenefitPlan_endDate[4]')"/><CP ID="681" Pth="{P1}[2]/Field(ID = 'BenefitPlan_startDate[5]')"/><CP ID="682" Pth="{P1}[2]/Field(ID = 'BenefitPlan_endDate[5]')"/><CP ID="683" Pth="{P1}[2]/Field(ID = 'BenefitPlan_startDate[6]')"/><CP ID="684" Pth="{P1}[2]/Field(ID = 'BenefitPlan_endDate[6]')"/><CP ID="685" Pth="{P1}[2]/Field(ID = 'BenefitPlan_startDate[7]')"/><CP ID="686" Pth="{P1}[2]/Field(ID = 'BenefitPlan_endDate[7]')"/><CP ID="687" Pth="{P1}[2]/Field(ID = 'BenefitPlan_startDate[8]')"/><CP ID="688" Pth="{P1}[2]/Field(ID = 'BenefitPlan_endDate[8]')"/><CP ID="700" Pth="{P1}[2]/Field(ID = 'PCP_RoleType')"/><CP ID="704" Pth="{P1}[2]/Field(ID = 'PCP_hccIdentificationNumber')"/><CP ID="706" Pth="{P1}[2]/Field(ID = 'Receipt_Date')"/><CP ID="746" Pth="{P1}[2]/Field(ID = 'Ethnicity[1]')"/><CP ID="747" Pth="{P1}[2]/Field(ID = 'Ethnicity[2]')"/><CP ID="748" Pth="{P1}[2]/Field(ID = 'Ethnicity[3]')"/><CP ID="749" Pth="{P1}[2]/Field(ID = 'Ethnicity[4]')"/><CP ID="750" Pth="{P1}[2]/Field(ID = 'Ethnicity[5]')"/><CP ID="765" Pth="{P1}[2]/Field(ID = 'Birth_Date')"/><CP ID="779" Pth="{P1}[2]/Field(ID = 'PCP_Change_Effectivedate')"/><CP ID="801" Pth="{P1}[2]/Field(ID = 'COB_startDate[1]')"/><CP ID="802" Pth="{P1}[2]/Field(ID = 'COB_endDate[1]')"/><CP ID="803" Pth="{P1}[2]/Field(ID = 'COB_startDate[2]')"/><CP ID="804" Pth="{P1}[2]/Field(ID = 'COB_endDate[2]')"/><CP ID="805" Pth="{P1}[2]/Field(ID = 'COB_startDate[3]')"/><CP ID="806" Pth="{P1}[2]/Field(ID = 'COB_endDate[3]')"/><CP ID="807" Pth="{P1}[2]/Field(ID = 'COB_startDate[4]')"/><CP ID="808" Pth="{P1}[2]/Field(ID = 'COB_endDate[4]')"/><CP ID="809" Pth="{P1}[2]/Field(ID = 'COB_startDate[5]')"/><CP ID="810" Pth="{P1}[2]/Field(ID = 'COB_endDate[5]')"/><CP ID="1164" Pth="{P1}[2]/Field(ID = 'Subscriber_ID')"/><CP ID="1172" Pth="{P1}[2]/Field(ID = 'Maintenance_Override')"/><CP ID="1329" Pth="{P1}[2]/Field(ID = 'Correspondence_Address')"/><CP ID="1331" Pth="{P1}[2]/Field(ID = 'City_Name_correspondence')"/><CP ID="1333" Pth="{P1}[2]/Field(ID = 'State_Code_correspondence')"/><CP ID="1335" Pth="{P1}[2]/Field(ID = 'Zip_Code_correspondence')"/><CP ID="1485" Pth="{P1}[2]/Field(ID = 'COB_PolicyId[1]')"/><CP ID="1486" Pth="{P1}[2]/Field(ID = 'COB_PolicyId[2]')"/><CP ID="1487" Pth="{P1}[2]/Field(ID = 'COB_PolicyId[3]')"/><CP ID="1488" Pth="{P1}[2]/Field(ID = 'COB_PolicyId[4]')"/><CP ID="1489" Pth="{P1}[2]/Field(ID = 'COB_PolicyId[5]')"/><CP ID="1532" Pth="{P1}[2]/Field(ID = 'COB_groupNumber[1]')"/><CP ID="1533" Pth="{P1}[2]/Field(ID = 'COB_groupNumber[2]')"/><CP ID="1534" Pth="{P1}[2]/Field(ID = 'COB_groupNumber[3]')"/><CP ID="1535" Pth="{P1}[2]/Field(ID = 'COB_groupNumber[4]')"/><CP ID="1536" Pth="{P1}[2]/Field(ID = 'COB_groupNumber[5]')"/><CP ID="1718" Pth="{P1}[2]/Field(ID = 'EdiFilename')"/><CP ID="1719" Pth="{P1}[2]/Field(ID = 'SenderId')"/><CP ID="1720" Pth="{P1}[2]/Field(ID = 'ReceiverId')"/><CP ID="1721" Pth="{P1}[2]/Field(ID = 'ActionCode')"/><CP ID="1722" Pth="{P1}[2]/Field(ID = 'MaintenanceReasonCode_Name')"/><CP ID="1723" Pth="{P1}[2]/Field(ID = 'MaintenanceReasonCode_Entry')"/><CP ID="1724" Pth="{P1}[2]/Field(ID = 'AsOfDate')"/><CP ID="1725" Pth="{P1}[2]/Field(ID = 'Subscriber_count')"/><CP ID="1784" Pth="{P1}[2]/Field(ID = 'Immigration_Status')"/><CP ID="1807" Pth="{P1}[2]/Field(ID = 'Effectuation_Date_1')"/><CP ID="1808" Pth="{P1}[2]/Field(ID = 'Effectuation_Date_2')"/><CP ID="1809" Pth="{P1}[2]/Field(ID = 'Effectuation_Date_3')"/><CP ID="1810" Pth="{P1}[2]/Field(ID = 'Effectuation_Date_4')"/><CP ID="1811" Pth="{P1}[2]/Field(ID = 'Effectuation_Date_5')"/><CP ID="1812" Pth="{P1}[2]/Field(ID = 'Effectuation_Date_6')"/><CP ID="1813" Pth="{P1}[2]/Field(ID = 'Effectuation_Date_7')"/><CP ID="1814" Pth="{P1}[2]/Field(ID = 'Effectuation_Date_8')"/></CPs><ReverseConnectionPoints><CP ID="1385" O="1164"/></ReverseConnectionPoints/></Targets><Fs><F ID="3" N="Conditional Copy_QTY02" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">16</P><P N="if_1/conditions/expression_1/arg1/type">2</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">ET</P><P N="if_1/conditions/connective_1">0</P><P N="if_1/conditions/expression_2/arg1">1749</P><P N="if_1/conditions/expression_2/arg1/type">2</P><P N="if_1/conditions/expression_2/operation">0</P><P N="if_1/conditions/expression_2/operation/type">0</P><P N="if_1/conditions/expression_2/arg2">Y</P><P N="if_1/actions/assignment_1/lvalue">17</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">18</P><P N="if_1/actions/assignment_1/rvalue/type">2</P></Ps><CPs><CP ID="16" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="18" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1749" FP="A" P="2" N="value3"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="17" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="4" N="Conditional Copy_2000_INS01" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">21</P><P N="if_1/conditions/expression_1/arg1/type">2</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">Y</P><P N="if_1/actions/assignment_1/lvalue">22</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">True</P><P N="if_2/conditions/expression_1/arg1">21</P><P N="if_2/conditions/expression_1/arg1/type">2</P><P N="if_2/conditions/expression_1/operation">0</P><P N="if_2/conditions/expression_1/operation/type">0</P><P N="if_2/conditions/expression_1/arg2">N</P><P N="if_2/actions/assignment_1/lvalue">22</P><P N="if_2/actions/assignment_1/lvalue/type">2</P><P N="if_2/actions/assignment_1/rvalue">False</P></Ps><CPs><CP ID="21" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="22" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="6" N="Conversional Copy_2000_INS03" T="ConversionalCopy"><Ps C="S"><P N="in">,001,021,025,030,024</P><P N="out">,CHANGE,CREATE,REINSTATE,AUDIT,TERMINATE</P><P N="comment">,,,,,</P></Ps><CPs><CP ID="29" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="30" FP="X" N="r"/></ConnectionPoints/><F ID="8" N="Conversional Copy_2000_INS03" T="ConversionalCopy"><Ps C="S"><P N="in">,001,024,025,021</P><P N="out">,SubscriptionAmendReason,SubscriptionTeminateReason,SubscriptionReinstateReason,SubscriptionCreateReason</P><P N="comment">,,,,</P></Ps><CPs><CP ID="36" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="37" FP="X" N="r"/></ConnectionPoints/><F ID="9" N="Conditional Copy_2000_INS03" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">61</P><P N="if_1/conditions/expression_1/arg1/type">2</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">Y</P><P N="if_1/actions/assignment_1/lvalue">39</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">709</P><P N="if_1/actions/assignment_1/rvalue/type">2</P><P N="if_1/actions/assignment_2/lvalue">1753</P><P N="if_1/actions/assignment_2/lvalue/type">2</P><P N="if_1/actions/assignment_2/rvalue">1752</P><P N="if_1/actions/assignment_2/rvalue/type">2</P></Ps><CPs><CP ID="61" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="709" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1752" FP="A" P="2" N="value3"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="39" FP="X" P="0" N="result1"/><CP ID="1753" FP="X" P="1" N="result2"/></ConnectionPoints/><F ID="10" N="Conversional Copy_2000_INS03" T="ConversionalCopy"><Ps C="S"><P N="in">,021,001,024,025</P><P N="out">,SubscriptionCreateReason,SubscriptionAmendReason,SubscriptionTeminateReason,SubscriptionReinstateReason</P><P N="comment">,,,,</P></Ps><CPs><CP ID="41" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="42" FP="X" N="r"/></ConnectionPoints/><F ID="27" T="SetValue"><CPs><CP ID="1387" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="150" FP="A" N="v" DirectValue="IndividualAddressType"/><CP ID="148" FP="X" N="r"/></ConnectionPoints/><F ID="28" T="SetValue"><CPs><CP ID="1388" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="153" FP="A" N="v" DirectValue="2"/><CP ID="151" FP="X" N="r"/></ConnectionPoints/><F ID="29" N="Substring_2100A_N403" T="Substring"><Ps C="S"><P N="start">0</P><P N="length">5</P></Ps><CPs><CP ID="158" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="159" FP="X" N="r"/></ConnectionPoints/><F ID="30" N="Substring_2100A_N403" T="Substring"><Ps C="S"><P N="start">5</P><P N="length">4</P></Ps><CPs><CP ID="162" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="163" FP="X" N="r"/></ConnectionPoints/><F ID="34" N="Conversional Copy_2100A_DMG04" T="ConversionalCopy"><Ps C="S"><P N="in">,D,X,M,B,S,I,W,U,R</P><P N="out">,Divorced, Legally Separated,Married,Registered Domestic Partner,Separated,Single,Widowed,Unmarried,Unreported</P><P N="comment">,,,,,,,,,</P></Ps><CPs><CP ID="177" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="178" FP="X" N="r"/></ConnectionPoints/><F ID="35" T="SetValue"><CPs><CP ID="1386" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="182" FP="A" N="v" DirectValue="RaceOrEthnicityCode"/><CP ID="180" FP="X" N="r"/></ConnectionPoints/><F ID="59" N="Null_Check" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">287</P><P N="if_1/conditions/expression_1/arg1/type">2</P><P N="if_1/conditions/expression_1/operation">1</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/actions/assignment_1/lvalue">286</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">287</P><P N="if_1/actions/assignment_1/rvalue/type">2</P></Ps><CPs><CP ID="287" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="286" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="60" N="Identification_Code_Qualifier" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">13</P><P N="if_1/conditions/expression_1/arg1/type">1</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">1</P><P N="if_1/actions/assignment_1/lvalue">288</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">LanguageDomain</P><P N="if_2/conditions/expression_1/arg1">13</P><P N="if_2/conditions/expression_1/arg1/type">1</P><P N="if_2/conditions/expression_1/operation">0</P><P N="if_2/conditions/expression_1/operation/type">0</P><P N="if_2/conditions/expression_1/arg2">2</P><P N="if_2/actions/assignment_1/lvalue">289</P><P N="if_2/actions/assignment_1/lvalue/type">2</P><P N="if_2/actions/assignment_1/rvalue">LanguageDomain</P><P N="if_3/conditions/expression_1/arg1">13</P><P N="if_3/conditions/expression_1/arg1/type">1</P><P N="if_3/conditions/expression_1/operation">0</P><P N="if_3/conditions/expression_1/operation/type">0</P><P N="if_3/conditions/expression_1/arg2">3</P><P N="if_3/actions/assignment_1/lvalue">290</P><P N="if_3/actions/assignment_1/lvalue/type">2</P><P N="if_3/actions/assignment_1/rvalue">LanguageDomain</P></Ps><CPs><CP ID="291" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="288" FP="X" P="0" N="result1"/><CP ID="289" FP="X" P="1" N="result2"/><CP ID="290" FP="X" P="2" N="result3"/></ConnectionPoints/><F ID="62" T="Increment"><Ps C="S"><P N="variableID">13</P></Ps><CPs><CP ID="297" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="63" T="ChangeVariable"><Ps C="S"><P N="variableID">13</P></Ps><CPs><CP ID="300" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="299" FP="A" N="v" DirectValue="0"/></ConnectionPoints/><F ID="64" N="NULL_CHECK" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">303</P><P N="if_1/conditions/expression_1/arg1/type">2</P><P N="if_1/conditions/expression_1/operation">1</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/actions/assignment_1/lvalue">302</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">303</P><P N="if_1/actions/assignment_1/rvalue/type">2</P></Ps><CPs><CP ID="303" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="302" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="65" N="Identification_Code" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">13</P><P N="if_1/conditions/expression_1/arg1/type">1</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">1</P><P N="if_1/actions/assignment_1/lvalue">305</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">308</P><P N="if_1/actions/assignment_1/rvalue/type">2</P><P N="if_2/conditions/expression_1/arg1">13</P><P N="if_2/conditions/expression_1/arg1/type">1</P><P N="if_2/conditions/expression_1/operation">0</P><P N="if_2/conditions/expression_1/operation/type">0</P><P N="if_2/conditions/expression_1/arg2">2</P><P N="if_2/actions/assignment_1/lvalue">306</P><P N="if_2/actions/assignment_1/lvalue/type">2</P><P N="if_2/actions/assignment_1/rvalue">308</P><P N="if_2/actions/assignment_1/rvalue/type">2</P><P N="if_3/conditions/expression_1/arg1">13</P><P N="if_3/conditions/expression_1/arg1/type">1</P><P N="if_3/conditions/expression_1/operation">0</P><P N="if_3/conditions/expression_1/operation/type">0</P><P N="if_3/conditions/expression_1/arg2">3</P><P N="if_3/actions/assignment_1/lvalue">307</P><P N="if_3/actions/assignment_1/lvalue/type">2</P><P N="if_3/actions/assignment_1/rvalue">308</P><P N="if_3/actions/assignment_1/rvalue/type">2</P></Ps><CPs><CP ID="308" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="305" FP="X" P="0" N="result1"/><CP ID="306" FP="X" P="1" N="result2"/><CP ID="307" FP="X" P="2" N="result3"/></ConnectionPoints/><F ID="66" N="Crosswalk_Language_Code" T="Crosswalk"><Ps C="S"><P N="name">Language Code</P></Ps><CPs><CP ID="311" FP="VAL" P="0" N="Lang Codes"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="309" FP="RES" P="0" N="Language Shortname"/><CP ID="310" FP="CPL" N="completion"/></ConnectionPoints/><F ID="67" N="Crosswalk_Language_Code" T="Crosswalk"><Ps C="S"><P N="name">Language Code</P></Ps><CPs><CP ID="314" FP="VAL" P="0" N="Lang Codes"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="312" FP="RES" P="0" N="Language Shortname"/><CP ID="313" FP="CPL" N="completion"/></ConnectionPoints/><F ID="68" N="Crosswalk_Language_Code" T="Crosswalk"><Ps C="S"><P N="name">Language Code</P></Ps><CPs><CP ID="317" FP="VAL" P="0" N="Lang Codes"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="315" FP="RES" P="0" N="Language Shortname"/><CP ID="316" FP="CPL" N="completion"/></ConnectionPoints/><F ID="77" T="ChangeVariable"><Ps C="S"><P N="variableID">30</P></Ps><CPs><CP ID="367" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="366" FP="A" N="v" DirectValue="0"/></ConnectionPoints/><F ID="78" T="Increment"><Ps C="S"><P N="variableID">30</P></Ps><CPs><CP ID="369" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="105" T="Increment"><Ps C="S"><P N="variableID">18</P></Ps><CPs><CP ID="525" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="106" T="ChangeVariable"><Ps C="S"><P N="variableID">18</P></Ps><CPs><CP ID="528" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="527" FP="A" N="v" DirectValue="0"/></ConnectionPoints/><F ID="137" N="Conditional Copy_NM1_2310" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">697</P><P N="if_1/conditions/expression_1/arg1/type">2</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">P3</P><P N="if_1/actions/assignment_1/lvalue">698</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">PCP</P></Ps><CPs><CP ID="697" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="698" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="138" N="Conditional Copy_NM109_2310" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">701</P><P N="if_1/conditions/expression_1/arg1/type">2</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">P3</P><P N="if_1/actions/assignment_1/lvalue">702</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">1327</P><P N="if_1/actions/assignment_1/rvalue/type">2</P></Ps><CPs><CP ID="701" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1327" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="702" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="139" N="Conversional Copy_2000_INS02" T="ConversionalCopy"><Ps C="S"><P N="in">,01,03,04,05,06,07,08,09,10,11,12,13,14,15,16,17,18,19,23,24,25,26,31,38,53,60,D2,G8,G9</P><P N="out">,Spouse,Parent,Grandparent ,Grandchild ,Uncle or Aunt  ,Nephew or Niece ,Cousin ,Adopted Child ,Foster Child,Son/Daughter-inlaw,Brother/Sister-inlaw,Mother/Fatherin-law ,Sibling,Ward ,Stepparent ,Stepchild,Self  ,Child ,Sponsored Dependent ,Dependent of a Minor Dependent,Ex-spouse ,Guardian ,Court Appointed Guardian ,Collateral Dependent ,Life Partner ,Annuitant ,Trustee ,Other Relationship ,Other Relative </P><P N="comment">,,,,,,,,,,,,,,,,,,,,,,,,,,,,,</P></Ps><CPs><CP ID="707" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="708" FP="X" N="r"/></ConnectionPoints/><F ID="140" N="JavaScript_2100A_PER" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var PER03 = ec_DataHelper.GetValueByName(&quot;value1&quot;);
var PER05 = ec_DataHelper.GetValueByName(&quot;value3&quot;);
var PER07 = ec_DataHelper.GetValueByName(&quot;value5&quot;);
var PER04 = ec_DataHelper.GetValueByName(&quot;value2&quot;);
var PER06 = ec_DataHelper.GetValueByName(&quot;value4&quot;);
var PER08 = ec_DataHelper.GetValueByName(&quot;value6&quot;);
//For mapping member mail id
if  ((PER03 ==&quot;EM&quot;) &amp;&amp; (PER04 != &quot;&quot;))
{
ec_ResultHelper.ReportResultByIndex(0,PER04);
}
else if((PER05 ==&quot;EM&quot;)&amp;&amp; (PER06 != &quot;&quot;))
{
ec_ResultHelper.ReportResultByIndex(0,PER06);
}
else if ((PER07 ==&quot;EM&quot;)&amp;&amp; (PER08 !=&quot;&quot;))
{
ec_ResultHelper.ReportResultByIndex(0,PER08);
}
//For mapping member PHONE NUMBER
//Home Phone
if ((PER03 ==&quot;HP&quot;) &amp;&amp; (PER04 != &quot;&quot;))
{
ec_ResultHelper.ReportResultByIndex(1,PER04);
}
else if ((PER05 ==&quot;HP&quot;)&amp;&amp; (PER06 != &quot;&quot;))
{	ec_ResultHelper.ReportResultByIndex(1,PER06);
}
else if ((PER07 ==&quot;HP&quot;)&amp;&amp; (PER08 !=&quot;&quot;))
{
ec_ResultHelper.ReportResultByIndex(1,PER08);
}
//Work Phone
if ((PER03 ==&quot;WP&quot;) &amp;&amp; (PER04 != &quot;&quot;))
{
ec_ResultHelper.ReportResultByIndex(2,PER04);
}
else if ((PER05 ==&quot;WP&quot;)&amp;&amp; (PER06 != &quot;&quot;))
{
ec_ResultHelper.ReportResultByIndex(2,PER06);
}
else if ((PER07 ==&quot;WP&quot;)&amp;&amp; (PER08 !=&quot;&quot;))
{
ec_ResultHelper.ReportResultByIndex(2,PER08);
}
//Telephone
if ((PER03 ==&quot;TE&quot;) &amp;&amp; (PER04 != &quot;&quot;))
{
ec_ResultHelper.ReportResultByIndex(3,PER04);
}
else if ((PER05 ==&quot;TE&quot;)&amp;&amp; (PER06 != &quot;&quot;))
{
ec_ResultHelper.ReportResultByIndex(3,PER06);
}
else if ((PER07 ==&quot;TE&quot;)&amp;&amp; (PER08 !=&quot;&quot;))
{
ec_ResultHelper.ReportResultByIndex(3,PER08);
}
//Company Phone
if ((PER03 ==&quot;CP&quot;) &amp;&amp; (PER04 != &quot;&quot;))
{
ec_ResultHelper.ReportResultByIndex(4,PER04);
}
else if ((PER05 ==&quot;CP&quot;)&amp;&amp; (PER06 != &quot;&quot;))
{
ec_ResultHelper.ReportResultByIndex(4,PER06);
}
else if ((PER07 ==&quot;CP&quot;)&amp;&amp; (PER08 !=&quot;&quot;))
{
ec_ResultHelper.ReportResultByIndex(4,PER08);
}</P></Ps><CPs><CP ID="714" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="715" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="716" FP="A" P="2" N="value3"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="717" FP="A" P="3" N="value4"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="718" FP="A" P="4" N="value5"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="719" FP="A" P="5" N="value6"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="711" FP="X" P="0" N="result1"/><CP ID="712" FP="X" P="1" N="result2"/><CP ID="713" FP="X" P="2" N="result3"/><CP ID="1350" FP="X" P="3" N="result4"/><CP ID="1354" FP="X" P="4" N="result5"/></ConnectionPoints/><F ID="146" T="Increment"><Ps C="S"><P N="variableID">26</P></Ps><CPs><CP ID="751" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="147" T="ChangeVariable"><Ps C="S"><P N="variableID">26</P></Ps><CPs><CP ID="754" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="753" FP="A" N="v" DirectValue="0"/></ConnectionPoints/><F ID="151" N="JavaScript_Date_Conversion" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var birthDate = ec_DataHelper.GetValueByName(&quot;value1&quot;);
var inputDTP = birthDate.substr(0,4)+'-'+birthDate.substr(4,2)+'-'+birthDate.substr(6,2);
ec_ResultHelper.ReportResultByIndex(0,inputDTP);</P></Ps><CPs><CP ID="763" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="762" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="157" N="JavaScript_Date_Conversion" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var value = ec_DataHelper.GetValueByIndex(0);
var inputDTP = value.substr(0,4)+'-'+value.substr(4,2)+'-'+value.substr(6,2);
ec_ResultHelper.ReportResultByIndex(0,inputDTP);</P></Ps><CPs><CP ID="777" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="776" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="171" N="Insurance_Line_code" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var HD03 = ec_VariableHelper.GetVariable(&quot;HD03_2300&quot;);
var HDCOUNT = ec_VariableHelper.GetVariable(&quot;Count_2300&quot;);
if( HD03 !=&quot;&quot; )
{
ec_ResultHelper.ReportResultByIndex(HDCOUNT,HD03)
}</P></Ps><CPs><CP ID="830" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="831" FP="A" P="0" N="value1"/><CP ID="821" FP="X" P="0" N="result1"/><CP ID="822" FP="X" P="1" N="result2"/><CP ID="823" FP="X" P="2" N="result3"/><CP ID="824" FP="X" P="3" N="result4"/><CP ID="825" FP="X" P="4" N="result5"/><CP ID="826" FP="X" P="5" N="result6"/><CP ID="827" FP="X" P="6" N="result7"/><CP ID="828" FP="X" P="7" N="result8"/><CP ID="829" FP="X" P="8" N="result9"/></ConnectionPoints/><F ID="172" T="ChangeVariable"><Ps C="S"><P N="variableID">29</P></Ps><CPs><CP ID="832" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="173" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var HD01 = ec_VariableHelper.GetVariable(&quot;HD01_2300&quot;);
var HDCOUNT = ec_VariableHelper.GetVariable(&quot;Count_2300&quot;);
if( HD01 !=&quot;&quot;  )
{
ec_ResultHelper.ReportResultByIndex(HDCOUNT,HD01)
}</P></Ps><CPs><CP ID="842" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="843" FP="A" P="0" N="value1"/><CP ID="833" FP="X" P="0" N="result1"/><CP ID="834" FP="X" P="1" N="result2"/><CP ID="835" FP="X" P="2" N="result3"/><CP ID="836" FP="X" P="3" N="result4"/><CP ID="837" FP="X" P="4" N="result5"/><CP ID="838" FP="X" P="5" N="result6"/><CP ID="839" FP="X" P="6" N="result7"/><CP ID="840" FP="X" P="7" N="result8"/><CP ID="841" FP="X" P="8" N="result9"/></ConnectionPoints/><F ID="174" T="ChangeVariable"><Ps C="S"><P N="variableID">31</P></Ps><CPs><CP ID="844" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="175" N="Ethnicity" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var DMG_C_05 = ec_VariableHelper.GetVariable(&quot;DMG_C01_2100A&quot;);
var DMG_C_COUNT = ec_VariableHelper.GetVariable(&quot;DMG_C_Count&quot;);
if( DMG_C_COUNT &lt;= 5)
{
ec_ResultHelper.ReportResultByIndex(DMG_C_COUNT,DMG_C_05)
}</P></Ps><CPs><CP ID="854" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="855" FP="A" P="0" N="value1"/><CP ID="845" FP="X" P="0" N="result1"/><CP ID="846" FP="X" P="1" N="result2"/><CP ID="847" FP="X" P="2" N="result3"/><CP ID="848" FP="X" P="3" N="result4"/><CP ID="849" FP="X" P="4" N="result5"/><CP ID="850" FP="X" P="5" N="result6"/></ConnectionPoints/><F ID="176" T="ChangeVariable"><Ps C="S"><P N="variableID">32</P></Ps><CPs><CP ID="856" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="179" T="ChangeVariable"><Ps C="S"><P N="variableID">33</P></Ps><CPs><CP ID="863" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="180" N="2100_Language_code_indicator" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var LUI04 = ec_VariableHelper.GetVariable(&quot;LUI04_2100A&quot;);
var LUICOUNT = ec_VariableHelper.GetVariable(&quot;LUI_count&quot;);
if( LUI04 !=&quot;&quot; )
{
if((LUI04 == &quot;7&quot;) &amp;&amp; (LUICOUNT == &quot;1&quot;))
{
ec_ResultHelper.ReportResultByIndex(0,1);
}
else if((LUI04 == &quot;6&quot;)&amp;&amp; (LUICOUNT ==&quot;1&quot;))
{
ec_ResultHelper.ReportResultByIndex(1,1);
}
if((LUI04 == &quot;7&quot;) &amp;&amp; (LUICOUNT == &quot;2&quot;))
{
ec_ResultHelper.ReportResultByIndex(2,1);
}
else if((LUI04 == &quot;6&quot;) &amp;&amp; (LUICOUNT == &quot;2&quot;))
{
ec_ResultHelper.ReportResultByIndex(3,1);
}
if((LUI04 == &quot;7&quot;) &amp;&amp; (LUICOUNT == &quot;3&quot;))
{
ec_ResultHelper.ReportResultByIndex(4,1);
}
else if((LUI04 == &quot;6&quot;) &amp;&amp; (LUICOUNT == &quot;3&quot;))
{
ec_ResultHelper.ReportResultByIndex(5,1);
}
}
</P></Ps><CPs><CP ID="871" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="872" FP="A" P="0" N="value1"/><CP ID="864" FP="X" P="0" N="result1"/><CP ID="865" FP="X" P="1" N="result2"/><CP ID="866" FP="X" P="2" N="result3"/><CP ID="867" FP="X" P="3" N="result4"/><CP ID="868" FP="X" P="4" N="result5"/><CP ID="869" FP="X" P="5" N="result6"/></ConnectionPoints/><F ID="194" T="ChangeVariable"><Ps C="S"><P N="variableID">36</P></Ps><CPs><CP ID="918" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="195" T="ChangeVariable"><Ps C="S"><P N="variableID">27</P></Ps><CPs><CP ID="919" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="203" N="Conditional_DTP03_2300" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">978</P><P N="if_1/conditions/expression_1/arg1/type">2</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">348</P><P N="if_1/actions/assignment_1/lvalue">977</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">979</P><P N="if_1/actions/assignment_1/rvalue/type">2</P></Ps><CPs><CP ID="978" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="979" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="977" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="204" N="Conditiona_DTP03_2300" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">981</P><P N="if_1/conditions/expression_1/arg1/type">2</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">349</P><P N="if_1/actions/assignment_1/lvalue">980</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">982</P><P N="if_1/actions/assignment_1/rvalue/type">2</P></Ps><CPs><CP ID="981" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="982" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="980" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="205" T="ChangeVariable"><Ps C="S"><P N="variableID">39</P></Ps><CPs><CP ID="983" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="206" T="ChangeVariable"><Ps C="S"><P N="variableID">40</P></Ps><CPs><CP ID="984" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="209" N="JavaScript_DTP_2300" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var DTP_348 = ec_VariableHelper.GetVariable(&quot;DTP_01_2300&quot;)
var DTP_349 = ec_VariableHelper.GetVariable(&quot;DTP_03_2300&quot;)
var DTP01 =&quot;&quot;;
var DTP03 = &quot;&quot;;
if(DTP_348 != &quot;&quot;)
DTP01 = DTP_348.substr(0,4)+'-'+DTP_348.substr(4,2)+'-'+DTP_348.substr(6,2);
if(DTP_349 != &quot;&quot;)
DTP03 = DTP_349.substr(0,4)+'-'+DTP_349.substr(4,2)+'-'+DTP_349.substr(6,2);
var count_2300 = ec_VariableHelper.GetVariable(&quot;Count_2300&quot;)
if(count_2300 &gt; 0)
{
if(count_2300 == 1)
{
ec_ResultHelper.ReportResultByIndex(0,DTP01);
ec_ResultHelper.ReportResultByIndex(1,DTP03);
}
if(count_2300 == 2)
{
ec_ResultHelper.ReportResultByIndex(2,DTP01);
ec_ResultHelper.ReportResultByIndex(3,DTP03);
}
if(count_2300 == 3)
{
ec_ResultHelper.ReportResultByIndex(4,DTP01);
ec_ResultHelper.ReportResultByIndex(5,DTP03);
}
if(count_2300 == 4)
{
ec_ResultHelper.ReportResultByIndex(6,DTP01);
ec_ResultHelper.ReportResultByIndex(7,DTP03);
}
if(count_2300 == 5)
{
ec_ResultHelper.ReportResultByIndex(8,DTP01);
ec_ResultHelper.ReportResultByIndex(9,DTP03);
}
if(count_2300 == 6)
{
ec_ResultHelper.ReportResultByIndex(10,DTP01);
ec_ResultHelper.ReportResultByIndex(11,DTP03);
}
if(count_2300 == 7)
{
ec_ResultHelper.ReportResultByIndex(12,DTP01);
ec_ResultHelper.ReportResultByIndex(13,DTP03);
}
if(count_2300 == 8)
{
ec_ResultHelper.ReportResultByIndex(14,DTP01);
ec_ResultHelper.ReportResultByIndex(15,DTP03);
}
}
//ec_ResultHelper.Send();</P></Ps><CPs><CP ID="1014" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1015" FP="A" P="0" N="value1"/><CP ID="998" FP="X" P="0" N="result1"/><CP ID="999" FP="X" P="1" N="result2"/><CP ID="1000" FP="X" P="2" N="result3"/><CP ID="1001" FP="X" P="3" N="result4"/><CP ID="1002" FP="X" P="4" N="result5"/><CP ID="1003" FP="X" P="5" N="result6"/><CP ID="1004" FP="X" P="6" N="result7"/><CP ID="1005" FP="X" P="7" N="result8"/><CP ID="1006" FP="X" P="8" N="result9"/><CP ID="1007" FP="X" P="9" N="result10"/><CP ID="1008" FP="X" P="10" N="result11"/><CP ID="1009" FP="X" P="11" N="result12"/><CP ID="1010" FP="X" P="12" N="result13"/><CP ID="1011" FP="X" P="13" N="result14"/><CP ID="1012" FP="X" P="14" N="result15"/><CP ID="1013" FP="X" P="15" N="result16"/></ConnectionPoints/><F ID="210" T="ChangeVariable"><Ps C="S"><P N="variableID">40</P></Ps><CPs><CP ID="1020" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1016" FP="A" N="v"/></ConnectionPoints/><F ID="212" T="ChangeVariable"><Ps C="S"><P N="variableID">39</P></Ps><CPs><CP ID="1019" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1018" FP="A" N="v"/></ConnectionPoints/><F ID="220" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">
var REF1L = ec_VariableHelper.GetVariable(&quot;REF_2300_1L&quot;)
var REFCE = ec_VariableHelper.GetVariable(&quot;REF_2300_CE&quot;)
var REF17 = ec_VariableHelper.GetVariable(&quot;REF_2300_17&quot;)
var REFZZ = ec_VariableHelper.GetVariable(&quot;REF_2300_ZZ&quot;)
var count_2300 = ec_VariableHelper.GetVariable(&quot;Count__2000&quot;)
if(count_2300 &gt; 0)
{
if(count_2300 == 1)
{
ec_ResultHelper.ReportResultByIndex(0,REF1L);
ec_ResultHelper.ReportResultByIndex(1,REFCE);
ec_ResultHelper.ReportResultByIndex(2,REF17);
ec_ResultHelper.ReportResultByIndex(3,REFZZ);
}
if(count_2300 == 2)
{
ec_ResultHelper.ReportResultByIndex(4,REF1L);
ec_ResultHelper.ReportResultByIndex(5,REFCE);
ec_ResultHelper.ReportResultByIndex(6,REF17);
ec_ResultHelper.ReportResultByIndex(7,REFZZ);
}
if(count_2300 == 3)
{
ec_ResultHelper.ReportResultByIndex(8,REF1L);
ec_ResultHelper.ReportResultByIndex(9,REFCE);
ec_ResultHelper.ReportResultByIndex(10,REF17);
ec_ResultHelper.ReportResultByIndex(11,REFZZ);
}
if(count_2300 == 4)
{
ec_ResultHelper.ReportResultByIndex(12,REF1L);
ec_ResultHelper.ReportResultByIndex(13,REFCE);
ec_ResultHelper.ReportResultByIndex(14,REF17);
ec_ResultHelper.ReportResultByIndex(15,REFZZ);
}
if(count_2300 == 5)
{
ec_ResultHelper.ReportResultByIndex(16,REF1L);
ec_ResultHelper.ReportResultByIndex(17,REFCE);
ec_ResultHelper.ReportResultByIndex(18,REF17);
ec_ResultHelper.ReportResultByIndex(19,REFZZ);
}
if(count_2300 == 6)
{
ec_ResultHelper.ReportResultByIndex(20,REF1L);
ec_ResultHelper.ReportResultByIndex(21,REFCE);
ec_ResultHelper.ReportResultByIndex(22,REF17);
ec_ResultHelper.ReportResultByIndex(23,REFZZ);
}
if(count_2300 == 7)
{
ec_ResultHelper.ReportResultByIndex(24,REF1L);
ec_ResultHelper.ReportResultByIndex(25,REFCE);
ec_ResultHelper.ReportResultByIndex(26,REF17);
ec_ResultHelper.ReportResultByIndex(27,REFZZ);
}
if(count_2300 == 8)
{
ec_ResultHelper.ReportResultByIndex(28,REF1L);
ec_ResultHelper.ReportResultByIndex(29,REFCE);
ec_ResultHelper.ReportResultByIndex(30,REF17);
ec_ResultHelper.ReportResultByIndex(31,REFZZ);
}
}
</P></Ps><CPs><CP ID="1069" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1070" FP="A" P="0" N="value1"/><CP ID="1037" FP="X" P="0" N="result1"/><CP ID="1038" FP="X" P="1" N="result2"/><CP ID="1039" FP="X" P="2" N="result3"/><CP ID="1040" FP="X" P="3" N="result4"/><CP ID="1041" FP="X" P="4" N="result5"/><CP ID="1042" FP="X" P="5" N="result6"/><CP ID="1043" FP="X" P="6" N="result7"/><CP ID="1044" FP="X" P="7" N="result8"/><CP ID="1045" FP="X" P="8" N="result9"/><CP ID="1046" FP="X" P="9" N="result10"/><CP ID="1047" FP="X" P="10" N="result11"/><CP ID="1048" FP="X" P="11" N="result12"/><CP ID="1049" FP="X" P="12" N="result13"/><CP ID="1050" FP="X" P="13" N="result14"/><CP ID="1051" FP="X" P="14" N="result15"/><CP ID="1052" FP="X" P="15" N="result16"/><CP ID="1053" FP="X" P="16" N="result17"/><CP ID="1054" FP="X" P="17" N="result18"/><CP ID="1055" FP="X" P="18" N="result19"/><CP ID="1056" FP="X" P="19" N="result20"/><CP ID="1057" FP="X" P="20" N="result21"/><CP ID="1058" FP="X" P="21" N="result22"/><CP ID="1059" FP="X" P="22" N="result23"/><CP ID="1060" FP="X" P="23" N="result24"/><CP ID="1061" FP="X" P="24" N="result25"/><CP ID="1062" FP="X" P="25" N="result26"/><CP ID="1063" FP="X" P="26" N="result27"/><CP ID="1064" FP="X" P="27" N="result28"/><CP ID="1065" FP="X" P="28" N="result29"/><CP ID="1066" FP="X" P="29" N="result30"/><CP ID="1067" FP="X" P="30" N="result31"/><CP ID="1068" FP="X" P="31" N="result32"/></ConnectionPoints/><F ID="223" T="ChangeVariable"><Ps C="S"><P N="variableID">15</P></Ps><CPs><CP ID="1073" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="225" T="ChangeVariable"><Ps C="S"><P N="variableID">47</P></Ps><CPs><CP ID="1075" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="227" T="ChangeVariable"><Ps C="S"><P N="variableID">15</P></Ps><CPs><CP ID="1078" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1079" FP="A" N="v"/></ConnectionPoints/><F ID="229" T="ChangeVariable"><Ps C="S"><P N="variableID">45</P></Ps><CPs><CP ID="1082" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1083" FP="A" N="v"/></ConnectionPoints/><F ID="230" T="ChangeVariable"><Ps C="S"><P N="variableID">47</P></Ps><CPs><CP ID="1084" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1085" FP="A" N="v"/></ConnectionPoints/><F ID="231" T="ChangeVariable"><Ps C="S"><P N="variableID">46</P></Ps><CPs><CP ID="1086" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1087" FP="A" N="v"/></ConnectionPoints/><F ID="233" T="ChangeVariable"><Ps C="S"><P N="variableID">45</P></Ps><CPs><CP ID="1089" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="234" T="ChangeVariable"><Ps C="S"><P N="variableID">46</P></Ps><CPs><CP ID="1090" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="239" N="Conditional_REF_ZZ" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">1104</P><P N="if_1/conditions/expression_1/arg1/type">2</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">1L</P><P N="if_1/actions/assignment_1/lvalue">1103</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">1105</P><P N="if_1/actions/assignment_1/rvalue/type">2</P><P N="if_2/conditions/expression_1/arg1">1104</P><P N="if_2/conditions/expression_1/arg1/type">2</P><P N="if_2/conditions/expression_1/operation">0</P><P N="if_2/conditions/expression_1/operation/type">0</P><P N="if_2/conditions/expression_1/arg2">CE</P><P N="if_2/actions/assignment_1/lvalue">1144</P><P N="if_2/actions/assignment_1/lvalue/type">2</P><P N="if_2/actions/assignment_1/rvalue">1105</P><P N="if_2/actions/assignment_1/rvalue/type">2</P><P N="if_3/conditions/expression_1/arg1">1104</P><P N="if_3/conditions/expression_1/arg1/type">2</P><P N="if_3/conditions/expression_1/operation">0</P><P N="if_3/conditions/expression_1/operation/type">0</P><P N="if_3/conditions/expression_1/arg2">17</P><P N="if_3/actions/assignment_1/lvalue">1145</P><P N="if_3/actions/assignment_1/lvalue/type">2</P><P N="if_3/actions/assignment_1/rvalue">1105</P><P N="if_3/actions/assignment_1/rvalue/type">2</P><P N="if_4/conditions/expression_1/arg1">1104</P><P N="if_4/conditions/expression_1/arg1/type">2</P><P N="if_4/conditions/expression_1/operation">0</P><P N="if_4/conditions/expression_1/operation/type">0</P><P N="if_4/conditions/expression_1/arg2">ZZ</P><P N="if_4/actions/assignment_1/lvalue">1146</P><P N="if_4/actions/assignment_1/lvalue/type">2</P><P N="if_4/actions/assignment_1/rvalue">1105</P><P N="if_4/actions/assignment_1/rvalue/type">2</P></Ps><CPs><CP ID="1104" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1105" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1103" FP="X" P="0" N="result1"/><CP ID="1144" FP="X" P="1" N="result2"/><CP ID="1145" FP="X" P="2" N="result3"/><CP ID="1146" FP="X" P="3" N="result4"/><CP ID="1785" FP="X" P="4" N="result5"/></ConnectionPoints/><F ID="240" T="Increment"><Ps C="S"><P N="variableID">48</P></Ps><CPs><CP ID="1107" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="241" T="ChangeVariable"><Ps C="S"><P N="variableID">48</P></Ps><CPs><CP ID="1109" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1108" FP="A" N="v" DirectValue="0"/></ConnectionPoints/><F ID="243" T="SetValue"><CPs><CP ID="1384" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1176" FP="A" N="v" DirectValue="True"/><CP ID="1175" FP="X" N="r"/></ConnectionPoints/><F ID="244" T="Increment"><Ps C="S"><P N="variableID">52</P></Ps><CPs><CP ID="1177" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="245" T="ChangeVariable"><Ps C="S"><P N="variableID">53</P></Ps><CPs><CP ID="1179" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="246" T="ChangeVariable"><Ps C="S"><P N="variableID">54</P></Ps><CPs><CP ID="1180" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="247" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var ST_ControlNo = ec_VariableHelper.GetVariable(&quot;ST_02_ControlNumber&quot;);
var INSCount = ec_VariableHelper.GetVariable(&quot;INS_Count&quot;);
var REF02 = ec_VariableHelper.GetVariable(&quot;REF02_2000&quot;);
var INS2000 = ec_VariableHelper.GetVariable(&quot;INS_2000&quot;);
if( INS2000 == &quot;Y&quot; )
{
//var SubscriberID = Number(ST_ControlNo) +Number(INSCount) + Number(REF02);
var subsid = REF02.concat(ST_ControlNo,INSCount);
//ec_ResultHelper.println(subsid);
ec_ResultHelper.ReportResultByIndex(0,subsid);
}</P></Ps><CPs><CP ID="1184" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1182" FP="A" P="0" N="value1"/><CP ID="1183" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="252" N="JavaScript_Date_Conversion" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var value = ec_DataHelper.GetValueByIndex(0);
var inputDTP = value.substr(0,4)+'-'+value.substr(4,2)+'-'+value.substr(6,2);
ec_ResultHelper.ReportResultByIndex(0,inputDTP);</P></Ps><CPs><CP ID="1199" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1198" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="260" T="ChangeVariable"><Ps C="S"><P N="variableID">56</P></Ps><CPs><CP ID="1241" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="261" T="Increment"><Ps C="S"><P N="variableID">55</P></Ps><CPs><CP ID="1242" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="262" T="ChangeVariable"><Ps C="S"><P N="variableID">55</P></Ps><CPs><CP ID="1244" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1243" FP="A" N="v" DirectValue="0"/></ConnectionPoints/><F ID="263" N="Reporting_Category_REF" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var HD01 = ec_VariableHelper.GetVariable(&quot;REF02_2750&quot;);
var HDCOUNT = ec_VariableHelper.GetVariable(&quot;Count_2700&quot;);
if( HD01 !=&quot;&quot;  )
{
ec_ResultHelper.ReportResultByIndex(HDCOUNT,HD01)
}</P></Ps><CPs><CP ID="1254" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1255" FP="A" P="0" N="value1"/><CP ID="1245" FP="X" P="0" N="result1"/><CP ID="1246" FP="X" P="1" N="result2"/><CP ID="1247" FP="X" P="2" N="result3"/><CP ID="1248" FP="X" P="3" N="result4"/><CP ID="1249" FP="X" P="4" N="result5"/><CP ID="1250" FP="X" P="5" N="result6"/><CP ID="1251" FP="X" P="6" N="result7"/><CP ID="1252" FP="X" P="7" N="result8"/><CP ID="1253" FP="X" P="8" N="result9"/><CP ID="1256" FP="X" P="9" N="result10"/><CP ID="1257" FP="X" P="10" N="result11"/></ConnectionPoints/><F ID="264" N="Reporting_Category_2750" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var HD01 = ec_VariableHelper.GetVariable(&quot;N1__2750&quot;);
var HDCOUNT = ec_VariableHelper.GetVariable(&quot;Count_2700&quot;);
if( HD01 !=&quot;&quot;  )
{
ec_ResultHelper.ReportResultByIndex(HDCOUNT,HD01)
}</P></Ps><CPs><CP ID="1267" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1268" FP="A" P="0" N="value1"/><CP ID="1258" FP="X" P="0" N="result1"/><CP ID="1259" FP="X" P="1" N="result2"/><CP ID="1260" FP="X" P="2" N="result3"/><CP ID="1261" FP="X" P="3" N="result4"/><CP ID="1262" FP="X" P="4" N="result5"/><CP ID="1263" FP="X" P="5" N="result6"/><CP ID="1264" FP="X" P="6" N="result7"/><CP ID="1265" FP="X" P="7" N="result8"/><CP ID="1266" FP="X" P="8" N="result9"/><CP ID="1269" FP="X" P="9" N="result10"/><CP ID="1270" FP="X" P="10" N="result11"/></ConnectionPoints/><F ID="265" T="ChangeVariable"><Ps C="S"><P N="variableID">57</P></Ps><CPs><CP ID="1271" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="266" T="ChangeVariable"><Ps C="S"><P N="variableID">58</P></Ps><CPs><CP ID="1272" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="267" N="Reporting_Category_DTP" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var HD01 = ec_VariableHelper.GetVariable(&quot;DTP03__2750&quot;);
var HDCOUNT = ec_VariableHelper.GetVariable(&quot;Count_2700&quot;);
if( HD01 !=&quot;&quot;  )
{
ec_ResultHelper.ReportResultByIndex(HDCOUNT,HD01);
}</P></Ps><CPs><CP ID="1282" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1283" FP="A" P="0" N="value1"/><CP ID="1273" FP="X" P="0" N="result1"/><CP ID="1274" FP="X" P="1" N="result2"/><CP ID="1275" FP="X" P="2" N="result3"/><CP ID="1276" FP="X" P="3" N="result4"/><CP ID="1277" FP="X" P="4" N="result5"/><CP ID="1278" FP="X" P="5" N="result6"/><CP ID="1279" FP="X" P="6" N="result7"/><CP ID="1280" FP="X" P="7" N="result8"/><CP ID="1281" FP="X" P="8" N="result9"/><CP ID="1284" FP="X" P="9" N="result10"/><CP ID="1285" FP="X" P="10" N="result11"/></ConnectionPoints/><F ID="268" T="ChangeVariable"><Ps C="S"><P N="variableID">59</P></Ps><CPs><CP ID="1286" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="270" N="Conditional Copy_2000_REF_MSI" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">1299</P><P N="if_1/conditions/expression_1/arg1/type">2</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">6O</P><P N="if_1/actions/assignment_1/lvalue">1293</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">1298</P><P N="if_1/actions/assignment_1/rvalue/type">2</P><P N="if_2/conditions/expression_1/arg1">1299</P><P N="if_2/conditions/expression_1/arg1/type">2</P><P N="if_2/conditions/expression_1/operation">0</P><P N="if_2/conditions/expression_1/operation/type">0</P><P N="if_2/conditions/expression_1/arg2">23</P><P N="if_2/actions/assignment_1/lvalue">1294</P><P N="if_2/actions/assignment_1/lvalue/type">2</P><P N="if_2/actions/assignment_1/rvalue">1298</P><P N="if_2/actions/assignment_1/rvalue/type">2</P><P N="if_3/conditions/expression_1/arg1">1299</P><P N="if_3/conditions/expression_1/arg1/type">2</P><P N="if_3/conditions/expression_1/operation">0</P><P N="if_3/conditions/expression_1/operation/type">0</P><P N="if_3/conditions/expression_1/arg2">17</P><P N="if_3/actions/assignment_1/lvalue">1295</P><P N="if_3/actions/assignment_1/lvalue/type">2</P><P N="if_3/actions/assignment_1/rvalue">1298</P><P N="if_3/actions/assignment_1/rvalue/type">2</P><P N="if_4/conditions/expression_1/arg1">1299</P><P N="if_4/conditions/expression_1/arg1/type">2</P><P N="if_4/conditions/expression_1/operation">0</P><P N="if_4/conditions/expression_1/operation/type">0</P><P N="if_4/conditions/expression_1/arg2">ZZ</P><P N="if_4/actions/assignment_1/lvalue">1296</P><P N="if_4/actions/assignment_1/lvalue/type">2</P><P N="if_4/actions/assignment_1/rvalue">1298</P><P N="if_4/actions/assignment_1/rvalue/type">2</P><P N="if_5/conditions/expression_1/arg1">1299</P><P N="if_5/conditions/expression_1/arg1/type">2</P><P N="if_5/conditions/expression_1/operation">0</P><P N="if_5/conditions/expression_1/operation/type">0</P><P N="if_5/conditions/expression_1/arg2">3H</P><P N="if_5/actions/assignment_1/lvalue">1297</P><P N="if_5/actions/assignment_1/lvalue/type">2</P><P N="if_5/actions/assignment_1/rvalue">1298</P><P N="if_5/actions/assignment_1/rvalue/type">2</P></Ps><CPs><CP ID="1298" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1299" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1293" FP="X" P="0" N="result1"/><CP ID="1294" FP="X" P="1" N="result2"/><CP ID="1295" FP="X" P="2" N="result3"/><CP ID="1296" FP="X" P="3" N="result4"/><CP ID="1297" FP="X" P="4" N="result5"/></ConnectionPoints/><F ID="271" T="ChangeVariable"><Ps C="S"><P N="variableID">2</P></Ps><CPs><CP ID="1301" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="277" T="ChangeVariable"><Ps C="S"><P N="variableID">61</P></Ps><CPs><CP ID="1307" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="279" T="ChangeVariable"><Ps C="S"><P N="variableID">63</P></Ps><CPs><CP ID="1309" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="280" N="asOfDate_Mapping" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">//Get the change variables
var Member_Level_DTP357 = ec_VariableHelper.GetVariable(&quot;Member_Level_DTP357&quot;);
var Health_Coverage_DTP349 = ec_VariableHelper.GetVariable(&quot;Health_Coverage_DTP_349&quot;);
var File_Effective_DTP303 = ec_VariableHelper.GetVariable(&quot;File_Effective_DTP303&quot;);
var Maintenance_Type_Code = ec_VariableHelper.GetVariable(&quot;Maintenance_Type_Code&quot;);
var Member_Level_DTP303 = ec_VariableHelper.GetVariable(&quot;Member_Level_DTP303&quot;);
var File_Effective_DTP007 = ec_VariableHelper.GetVariable(&quot;File_Effective_DTP007&quot;);
var asOfDateMLD357 = Member_Level_DTP357.substr(0,4)+'-'+Member_Level_DTP357.substr(4,2)+'-'+Member_Level_DTP357.substr(6,2);
var asOfDateHCD349 = Health_Coverage_DTP349.substr(0,4)+'-'+Health_Coverage_DTP349.substr(4,2)+'-'+Health_Coverage_DTP349.substr(6,2);
var asOfDateFED007 = File_Effective_DTP007.substr(0,4)+'-'+File_Effective_DTP007.substr(4,2)+'-'+File_Effective_DTP007.substr(6,2);
var asOfDateMLD303 = Member_Level_DTP303.substr(0,4)+'-'+Member_Level_DTP303.substr(4,2)+'-'+Member_Level_DTP303.substr(6,2);
var count_2300 = ec_VariableHelper.GetVariable(&quot;Count_2300&quot;);
//Perform condition check to map asOfDate
if(count_2300==1)
{
if((Maintenance_Type_Code == &quot;001&quot; ) &amp;&amp; (Member_Level_DTP303 != &quot;&quot; ))
{
ec_ResultHelper.ReportResultByIndex(0,asOfDateMLD303);
}
else if((Maintenance_Type_Code == &quot;001&quot; ) &amp;&amp; (Member_Level_DTP303 == &quot;&quot; ))
{
ec_ResultHelper.ReportResultByIndex(0,asOfDateFED007);
}
if((Maintenance_Type_Code == &quot;024&quot;) &amp;&amp; (Member_Level_DTP357 != &quot;&quot;))
{
ec_ResultHelper.ReportResultByIndex(0,asOfDateMLD357);
}
else if((Maintenance_Type_Code == &quot;024&quot;) &amp;&amp; (Health_Coverage_DTP349 != &quot;&quot;))
{
ec_ResultHelper.ReportResultByIndex(0,asOfDateHCD349);
}
}
</P></Ps><CPs><CP ID="1312" FP="_AP" N="a"/><CP ID="1310" FP="A" P="0" N="value1"/><CP ID="1311" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="281" T="ChangeVariable"><Ps C="S"><P N="variableID">80</P></Ps><CPs><CP ID="1313" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="285" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">1319</P><P N="if_1/conditions/expression_1/arg1/type">2</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">357</P><P N="if_1/actions/assignment_1/lvalue">1320</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">1321</P><P N="if_1/actions/assignment_1/rvalue/type">2</P><P N="if_2/conditions/expression_1/arg1">1319</P><P N="if_2/conditions/expression_1/arg1/type">2</P><P N="if_2/conditions/expression_1/operation">0</P><P N="if_2/conditions/expression_1/operation/type">0</P><P N="if_2/conditions/expression_1/arg2">303</P><P N="if_2/actions/assignment_1/lvalue">1325</P><P N="if_2/actions/assignment_1/lvalue/type">2</P><P N="if_2/actions/assignment_1/rvalue">1321</P><P N="if_2/actions/assignment_1/rvalue/type">2</P></Ps><CPs><CP ID="1319" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1321" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1320" FP="X" P="0" N="result1"/><CP ID="1325" FP="X" P="1" N="result2"/></ConnectionPoints/><F ID="286" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">1322</P><P N="if_1/conditions/expression_1/arg1/type">2</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">349</P><P N="if_1/actions/assignment_1/lvalue">1323</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">1324</P><P N="if_1/actions/assignment_1/rvalue/type">2</P></Ps><CPs><CP ID="1322" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1324" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1323" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="287" T="ChangeVariable"><Ps C="S"><P N="variableID">67</P></Ps><CPs><CP ID="1326" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="288" T="Substring"><Ps C="S"><P N="start">0</P><P N="length">5</P></Ps><CPs><CP ID="1336" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1337" FP="X" N="r"/></ConnectionPoints/><F ID="289" T="ChangeVariable"><Ps C="S"><P N="variableID">58</P></Ps><CPs><CP ID="1339" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1338" FP="A" N="v"/></ConnectionPoints/><F ID="290" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var Member_2100A_PER_Email = ec_VariableHelper.GetVariable(&quot;Member_2100A_PER_Email&quot;);
var Member_2100A_PER_HP = ec_VariableHelper.GetVariable(&quot;Member_2100A_PER_HP&quot;);
var Member_2100A_PER_WP = ec_VariableHelper.GetVariable(&quot;Member_2100A_PER_WP&quot;);
var Member_2100A_PER_TE = ec_VariableHelper.GetVariable(&quot;Member_2100A_PER_TE&quot;);
var Member_2100A_PER_CP = ec_VariableHelper.GetVariable(&quot;Member_2100A_PER_CP&quot;);
if(Member_2100A_PER_Email != '')
{
ec_ResultHelper.ReportResultByIndex(0,Member_2100A_PER_Email);
}
if(Member_2100A_PER_HP != '')
{
var str = Member_2100A_PER_HP.substring(0,3);
var str2 = Member_2100A_PER_HP.substring(3,10);
ec_ResultHelper.ReportResultByIndex(1,str);
ec_ResultHelper.ReportResultByIndex(2, str2);
}
else if(Member_2100A_PER_WP != '')
{
var str = Member_2100A_PER_WP.substring(0,3);
var str2 = Member_2100A_PER_WP.substring(3,10);
ec_ResultHelper.ReportResultByIndex(1,str);
ec_ResultHelper.ReportResultByIndex(2, str2);
}
else if(Member_2100A_PER_TE != '')
{
var str = Member_2100A_PER_TE.substring(0,3);
var str2 = Member_2100A_PER_TE.substring(3,10);
ec_ResultHelper.ReportResultByIndex(1,str);
ec_ResultHelper.ReportResultByIndex(2, str2);
}
else if(Member_2100A_PER_CP != '')
{
var str = Member_2100A_PER_CP.substring(0,3);
var str2 = Member_2100A_PER_CP.substring(3,10);
ec_ResultHelper.ReportResultByIndex(1,str);
ec_ResultHelper.ReportResultByIndex(2, str2);
}
ec_VariableHelper.SetVariable(&quot;Member_2100A_PER_Email&quot;,&quot;&quot;);
ec_VariableHelper.SetVariable(&quot;Member_2100A_PER_HP&quot;,&quot;&quot;);
ec_VariableHelper.SetVariable(&quot;Member_2100A_PER_WP&quot;,&quot;&quot;);
ec_VariableHelper.SetVariable(&quot;Member_2100A_PER_TE&quot;,&quot;&quot;);
ec_VariableHelper.SetVariable(&quot;Member_2100A_PER_CP&quot;,&quot;&quot;);</P></Ps><CPs><CP ID="1344" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1340" FP="A" P="0" N="value1"/><CP ID="1341" FP="X" P="0" N="result1"/><CP ID="1342" FP="X" P="1" N="result2"/><CP ID="1343" FP="X" P="2" N="result3"/></ConnectionPoints/><F ID="291" T="ChangeVariable"><Ps C="S"><P N="variableID">68</P></Ps><CPs><CP ID="1345" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="293" T="ChangeVariable"><Ps C="S"><P N="variableID">69</P></Ps><CPs><CP ID="1347" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="295" T="ChangeVariable"><Ps C="S"><P N="variableID">70</P></Ps><CPs><CP ID="1349" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="297" T="ChangeVariable"><Ps C="S"><P N="variableID">72</P></Ps><CPs><CP ID="1352" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="299" T="ChangeVariable"><Ps C="S"><P N="variableID">71</P></Ps><CPs><CP ID="1355" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="300" N="Conversional Copy_2100A_HLH01" T="ConversionalCopy"><Ps C="S"><P N="in">,N,U,T,X</P><P N="out">,Non Smoker,Unknown,Smoker,Smoker</P><P N="comment">,,,,</P></Ps><CPs><CP ID="1362" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1363" FP="X" N="r"/></ConnectionPoints/><F ID="309" T="Increment"><Ps C="S"><P N="variableID">34</P></Ps><CPs><CP ID="1389" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="316" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">myRS = ec_VariableHelper.GetRecordSet(&quot;Payer_Resposibility_2320&quot;);
myRS.clear();</P></Ps><CPs><CP ID="1448" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1449" FP="A" P="0" N="value1"/><CP ID="1447" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="325" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">//COB_Details_2320
myRS = ec_VariableHelper.GetRecordSet(&quot;COB_Details_2320&quot;);
myRS.clear();
myRS.insertRow();
ec_VariableHelper.SetRecordSet(&quot;COB_Details_2320&quot;, myRS, true);</P></Ps><CPs><CP ID="1478" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1479" FP="A" P="0" N="value1"/><CP ID="1477" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="331" N="COB-Mapping" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">//Retrieve the recordset values and assign it to  myRS
/*myRS = ec_VariableHelper.GetRecordSet(&quot;COB_Details_2320&quot;);
var Fields = new Array();
//Report result to respective indexes
for(var i=0;i&lt;4;i++)
{
Fields[i] = ec_DataHelper.GetValueByIndex(i);
}
//Update the recorset with the values of the array 'resArr'
myRS.insertRow();
myRS.updateRow(Fields);
ec_VariableHelper.SetRecordSet(&quot;COB_Details_2320&quot;, myRS, true);
*/
var Count_2320 = ec_VariableHelper.GetVariable(&quot;Count_2320&quot;);
//ec_ResultHelper.println(&quot;Count_2320&quot;+Count_2320);
//ec_ResultHelper.println(subsid);
var PayerRespSeqCode = ec_DataHelper.GetValueByIndex(0);
var CobPolicyID = ec_DataHelper.GetValueByIndex(1);
var GroupNumber = ec_DataHelper.GetValueByIndex(2);
ec_ResultHelper.ReportResultByIndex(Count_2320,PayerRespSeqCode);
ec_ResultHelper.ReportResultByName(&quot;CobPolicyID&quot;+Count_2320,CobPolicyID);
//ec_ResultHelper.ReportResultByIndex(11,GroupNumber);
ec_ResultHelper.Send();
</P></Ps><CPs><CP ID="1537" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1539" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1540" FP="A" P="2" N="value3"/><CP ID="1541" FP="A" P="3" N="value4"/><CP ID="1542" FP="A" P="4" N="value5"/><CP ID="1543" FP="A" P="5" N="value6"/><CP ID="1538" FP="X" P="0" N="result1"/><CP ID="1564" FP="X" P="1" N="result2"/><CP ID="1565" FP="X" P="2" N="result3"/><CP ID="1566" FP="X" P="3" N="result4"/><CP ID="1567" FP="X" P="4" N="result5"/><CP ID="1568" FP="X" P="5" N="result6"/><CP ID="1569" FP="X" P="6" N="CobPolicyID1"/><CP ID="1570" FP="X" P="7" N="CobPolicyID2"/><CP ID="1571" FP="X" P="8" N="CobPolicyID3"/><CP ID="1572" FP="X" P="9" N="CobPolicyID4"/><CP ID="1573" FP="X" P="10" N="CobPolicyID5"/></ConnectionPoints/><F ID="332" N="RecordSet-COB-MappingOutput" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">//Retreive the values of the recordset &quot;Service_2320Details&quot;
myRS = ec_VariableHelper.GetRecordSet(&quot;COB_Details_2320&quot;);
myRS.last();// Move the cursor to the last record in the recordset
var RS1 = myRS.getRow();// Get the current row of the recordset
var count = 0;
// The code enters a while loop and continues as long as the value of RS1 is greater than 0.
while (RS1&gt;0)
{
//count++;
Fields = myRS.getFields();
count++;
var PayerResponsibilityCode = Fields[0];
var COBPolicyID = Fields[1];
var GroupQualifier = Fields[2];
var GroupID = Fields[3];
ec_ResultHelper.ReportResultByName(&quot;COBPolicyID&quot;+count,COBPolicyID);
if(GroupQualifier ==  &quot;6P&quot;)
{
ec_ResultHelper.ReportResultByName(&quot;GroupID&quot;+count,GroupID);
}
ec_ResultHelper.ReportResultByName(&quot;PayerResponsibilityCode&quot;+count,PayerResponsibilityCode);
ec_ResultHelper.Send();
myRS.previous();// Move the cursor to the previous row in the result set
RS1 = myRS.getRow();
}
</P></Ps><CPs><CP ID="1547" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1544" FP="A" P="0" N="value1"/><CP ID="1545" FP="X" P="0" N="COBPolicyID1"/><CP ID="1546" FP="X" P="1" N="GroupID1"/><CP ID="1548" FP="X" P="2" N="PayerResponsibilityCode1"/><CP ID="1552" FP="X" P="3" N="COBPolicyID2"/><CP ID="1553" FP="X" P="4" N="GroupID2"/><CP ID="1554" FP="X" P="5" N="PayerResponsibilityCode2"/><CP ID="1555" FP="X" P="6" N="COBPolicyID3"/><CP ID="1556" FP="X" P="7" N="GroupID3"/><CP ID="1557" FP="X" P="8" N="PayerResponsibilityCode3"/><CP ID="1558" FP="X" P="9" N="COBPolicyID4"/><CP ID="1559" FP="X" P="10" N="GroupID4"/><CP ID="1560" FP="X" P="11" N="PayerResponsibilityCode4"/><CP ID="1561" FP="X" P="12" N="COBPolicyID5"/><CP ID="1562" FP="X" P="13" N="GroupID5"/><CP ID="1563" FP="X" P="14" N="PayerResponsibilityCode5"/></ConnectionPoints/><F ID="334" N="COB-RefId" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">1575</P><P N="if_1/conditions/expression_1/arg1/type">2</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">6P</P><P N="if_1/actions/assignment_1/lvalue">1576</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">1577</P><P N="if_1/actions/assignment_1/rvalue/type">2</P></Ps><CPs><CP ID="1575" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1577" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1576" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="335" T="ChangeVariable"><Ps C="S"><P N="variableID">76</P></Ps><CPs><CP ID="1578" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="336" N="COB-Fields-Mapping" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var Count_2320 = ec_VariableHelper.GetVariable(&quot;Count_2320&quot;);
var COB_RefID = ec_VariableHelper.GetVariable(&quot;COB_RefID&quot;);
var COB_CompanyName = ec_VariableHelper.GetVariable(&quot;COB_CompanyName&quot;);
ec_ResultHelper.ReportResultByIndex(Count_2320,COB_RefID);
ec_ResultHelper.ReportResultByName(&quot;COB_CompanyName&quot;+Count_2320,COB_CompanyName);
</P></Ps><CPs><CP ID="1581" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1579" FP="A" P="0" N="value1"/><CP ID="1580" FP="X" P="0" N="result1"/><CP ID="1582" FP="X" P="1" N="result2"/><CP ID="1583" FP="X" P="2" N="result3"/><CP ID="1584" FP="X" P="3" N="result4"/><CP ID="1585" FP="X" P="4" N="result5"/><CP ID="1586" FP="X" P="5" N="result6"/><CP ID="1646" FP="X" P="6" N="COB_CompanyName1"/><CP ID="1647" FP="X" P="7" N="COB_CompanyName2"/><CP ID="1648" FP="X" P="8" N="COB_CompanyName3"/><CP ID="1649" FP="X" P="9" N="COB_CompanyName4"/><CP ID="1650" FP="X" P="10" N="COB_CompanyName5"/></ConnectionPoints/><F ID="337" N="COB-Date-Check" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">1587</P><P N="if_1/conditions/expression_1/arg1/type">2</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">344</P><P N="if_1/actions/assignment_1/lvalue">1588</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">1589</P><P N="if_1/actions/assignment_1/rvalue/type">2</P><P N="if_2/conditions/expression_1/arg1">1587</P><P N="if_2/conditions/expression_1/arg1/type">2</P><P N="if_2/conditions/expression_1/operation">0</P><P N="if_2/conditions/expression_1/operation/type">0</P><P N="if_2/conditions/expression_1/arg2">345</P><P N="if_2/actions/assignment_1/lvalue">1591</P><P N="if_2/actions/assignment_1/lvalue/type">2</P><P N="if_2/actions/assignment_1/rvalue">1589</P><P N="if_2/actions/assignment_1/rvalue/type">2</P></Ps><CPs><CP ID="1587" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1589" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1590" FP="A" P="2" N="value3"/><CP ID="1588" FP="X" P="0" N="result1"/><CP ID="1591" FP="X" P="1" N="result2"/></ConnectionPoints/><F ID="338" T="ChangeVariable"><Ps C="S"><P N="variableID">77</P></Ps><CPs><CP ID="1592" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="340" T="ChangeVariable"><Ps C="S"><P N="variableID">78</P></Ps><CPs><CP ID="1594" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="342" N="COB-DTP-CompanyName-Mapping" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var Count_2320 = ec_VariableHelper.GetVariable(&quot;Count_2320&quot;);
var COB_StartDate_344 = ec_VariableHelper.GetVariable(&quot;COB_StartDate_344&quot;);
var COB_EndDate_345 = ec_VariableHelper.GetVariable(&quot;COB_EndDate_345&quot;);
var COB_StartDateFormat_344 = COB_StartDate_344.substr(0,4)+&quot;-&quot;+COB_StartDate_344.substr(4,2)+&quot;-&quot;+COB_StartDate_344.substr(6,2);
var COB_EndDateFormat_345 = COB_EndDate_345.substr(0,4)+&quot;-&quot;+COB_EndDate_345.substr(4,2)+&quot;-&quot;+COB_EndDate_345.substr(6,2);
ec_ResultHelper.ReportResultByIndex(Count_2320,COB_StartDateFormat_344);
ec_ResultHelper.ReportResultByName(&quot;EndDate&quot;+Count_2320,COB_EndDateFormat_345);
</P></Ps><CPs><CP ID="1619" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1620" FP="A" P="0" N="value1"/><CP ID="1613" FP="X" P="0" N="result1"/><CP ID="1614" FP="X" P="1" N="result2"/><CP ID="1615" FP="X" P="2" N="result3"/><CP ID="1616" FP="X" P="3" N="result4"/><CP ID="1617" FP="X" P="4" N="result5"/><CP ID="1618" FP="X" P="5" N="result6"/><CP ID="1637" FP="X" P="6" N="EndDate1"/><CP ID="1638" FP="X" P="7" N="EndDate2"/><CP ID="1639" FP="X" P="8" N="EndDate3"/><CP ID="1640" FP="X" P="9" N="EndDate4"/><CP ID="1641" FP="X" P="10" N="EndDate5"/></ConnectionPoints/><F ID="345" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">1642</P><P N="if_1/conditions/expression_1/arg1/type">2</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">IN</P><P N="if_1/actions/assignment_1/lvalue">1643</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">1644</P><P N="if_1/actions/assignment_1/rvalue/type">2</P></Ps><CPs><CP ID="1642" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1644" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1643" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="346" T="ChangeVariable"><Ps C="S"><P N="variableID">79</P></Ps><CPs><CP ID="1645" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="347" N="Reset-COB-Variables" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">ec_VariableHelper.SetVariable(&quot;COB_StartDate_344&quot;,&quot;&quot;);
ec_VariableHelper.SetVariable(&quot;COB_EndDate_345&quot;,&quot;&quot;);
ec_VariableHelper.SetVariable(&quot;COB_CompanyName&quot;,&quot;&quot;);
ec_VariableHelper.SetVariable(&quot;COB_RefID&quot;,&quot;&quot;);</P></Ps><CPs><CP ID="1653" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1651" FP="A" P="0" N="value1"/><CP ID="1652" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="348" N="Conversional Copy_COB01_2320" T="ConversionalCopy"><Ps C="S"><P N="in">,P,S,T,U</P><P N="out">,Primary,Secondary,Tertiary,Unknown</P><P N="comment">,,,,</P></Ps><CPs><CP ID="1655" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1654" FP="X" N="r"/></ConnectionPoints/><F ID="349" N="Conversional Copy_COB01_2320" T="ConversionalCopy"><Ps C="S"><P N="in">,P,S,T,U</P><P N="out">,Primary,Secondary,Tertiary,Unknown</P><P N="comment">,,,,</P></Ps><CPs><CP ID="1657" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1656" FP="X" N="r"/></ConnectionPoints/><F ID="350" N="Conversional Copy_COB01_2320" T="ConversionalCopy"><Ps C="S"><P N="in">,P,S,T,U</P><P N="out">,Primary,Secondary,Tertiary,Unknown</P><P N="comment">,,,,</P></Ps><CPs><CP ID="1659" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1658" FP="X" N="r"/></ConnectionPoints/><F ID="351" N="Conversional Copy_COB01_2320" T="ConversionalCopy"><Ps C="S"><P N="in">,P,S,T,U</P><P N="out">,Primary,Secondary,Tertiary,Unknown</P><P N="comment">,,,,</P></Ps><CPs><CP ID="1661" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1660" FP="X" N="r"/></ConnectionPoints/><F ID="352" N="Conversional Copy_COB01_2320" T="ConversionalCopy"><Ps C="S"><P N="in">,P,S,T,U</P><P N="out">,Primary,Secondary,Tertiary,Unknown</P><P N="comment">,,,,</P></Ps><CPs><CP ID="1663" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1662" FP="X" N="r"/></ConnectionPoints/><F ID="354" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">1666</P><P N="if_1/conditions/expression_1/arg1/type">2</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">007</P><P N="if_1/actions/assignment_1/lvalue">1667</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">1668</P><P N="if_1/actions/assignment_1/rvalue/type">2</P></Ps><CPs><CP ID="1666" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1668" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1667" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="356" T="ChangeVariable"><Ps C="S"><P N="variableID">63</P></Ps><CPs><CP ID="1672" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1671" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="358" T="ChangeVariable"><Ps C="S"><P N="variableID">31</P></Ps><CPs><CP ID="1675" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1674" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="360" T="ChangeVariable"><Ps C="S"><P N="variableID">29</P></Ps><CPs><CP ID="1678" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1677" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="362" T="ChangeVariable"><Ps C="S"><P N="variableID">39</P></Ps><CPs><CP ID="1681" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1680" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="364" T="ChangeVariable"><Ps C="S"><P N="variableID">40</P></Ps><CPs><CP ID="1684" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1683" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="366" T="ChangeVariable"><Ps C="S"><P N="variableID">15</P></Ps><CPs><CP ID="1687" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1686" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="368" T="ChangeVariable"><Ps C="S"><P N="variableID">45</P></Ps><CPs><CP ID="1690" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1689" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="370" T="ChangeVariable"><Ps C="S"><P N="variableID">46</P></Ps><CPs><CP ID="1693" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1692" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="372" T="ChangeVariable"><Ps C="S"><P N="variableID">47</P></Ps><CPs><CP ID="1696" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1695" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="374" T="ChangeVariable"><Ps C="S"><P N="variableID">56</P></Ps><CPs><CP ID="1699" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1698" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="376" T="ChangeVariable"><Ps C="S"><P N="variableID">57</P></Ps><CPs><CP ID="1702" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1701" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="377" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">81</P><P N="if_1/conditions/expression_1/arg1/type">1</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">N</P><P N="if_1/actions/assignment_1/lvalue">1707</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">82</P><P N="if_1/actions/assignment_1/rvalue/type">1</P></Ps><CPs><CP ID="1708" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1706" FP="A" P="0" N="value1" DirectValue="{81}"/><CP ID="1707" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="378" T="ChangeVariable"><Ps C="S"><P N="variableID">81</P></Ps><CPs><CP ID="1709" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="379" T="ChangeVariable"><Ps C="S"><P N="variableID">82</P></Ps><CPs><CP ID="1710" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="381" T="ChangeVariable"><Ps C="S"><P N="variableID">81</P></Ps><CPs><CP ID="1713" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1712" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="383" T="ChangeVariable"><Ps C="S"><P N="variableID">82</P></Ps><CPs><CP ID="1716" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1715" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="384" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">1751</P><P N="if_1/conditions/expression_1/arg1/type">2</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">Y</P><P N="if_1/actions/assignment_1/lvalue">1727</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">1726</P><P N="if_1/actions/assignment_1/rvalue/type">2</P><P N="if_1/actions/assignment_2/lvalue">1731</P><P N="if_1/actions/assignment_2/lvalue/type">2</P><P N="if_1/actions/assignment_2/rvalue">1730</P><P N="if_1/actions/assignment_2/rvalue/type">2</P><P N="if_1/actions/assignment_3/lvalue">1733</P><P N="if_1/actions/assignment_3/lvalue/type">2</P><P N="if_1/actions/assignment_3/rvalue">1732</P><P N="if_1/actions/assignment_3/rvalue/type">2</P></Ps><CPs><CP ID="1754" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1726" FP="A" P="0" N="value1" DirectValue="{86}"/><CP ID="1730" FP="A" P="1" N="value2" DirectValue="{83}"/><CP ID="1732" FP="A" P="2" N="value3" DirectValue="{84}"/><CP ID="1751" FP="A" P="3" N="value4" DirectValue="{81}"/><CP ID="1727" FP="X" P="0" N="result1"/><CP ID="1731" FP="X" P="1" N="result2"/><CP ID="1733" FP="X" P="2" N="result3"/></ConnectionPoints/><F ID="386" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">1736</P><P N="if_1/conditions/expression_1/arg1/type">2</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">Y</P><P N="if_1/actions/assignment_1/lvalue">1737</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">1744</P><P N="if_1/actions/assignment_1/rvalue/type">2</P></Ps><CPs><CP ID="1769" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1736" FP="A" P="0" N="value1" DirectValue="{81}"/><CP ID="1744" FP="A" P="1" N="value2" DirectValue="{87}"/><CP ID="1737" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="390" T="ChangeVariable"><Ps C="S"><P N="variableID">86</P></Ps><CPs><CP ID="1755" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="391" T="ChangeVariable"><Ps C="S"><P N="variableID">83</P></Ps><CPs><CP ID="1757" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="392" T="ChangeVariable"><Ps C="S"><P N="variableID">84</P></Ps><CPs><CP ID="1759" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="393" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">81</P><P N="if_1/conditions/expression_1/arg1/type">1</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">Y</P><P N="if_1/actions/assignment_1/lvalue">1762</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">80</P><P N="if_1/actions/assignment_1/rvalue/type">1</P></Ps><CPs><CP ID="1763" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1761" FP="A" P="0" N="value1"/><CP ID="1762" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="395" N="JavaScript_Date_Conversion" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var asOfDate = ec_DataHelper.GetValueByName(&quot;value1&quot;);
var inputDTP = asOfDate.substr(0,4)+'-'+asOfDate.substr(4,2)+'-'+asOfDate.substr(6,2);
ec_ResultHelper.ReportResultByIndex(0,inputDTP);</P></Ps><CPs><CP ID="1767" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1766" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="396" T="ChangeVariable"><Ps C="S"><P N="variableID">87</P></Ps><CPs><CP ID="1768" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="401" T="ChangeVariable"><Ps C="S"><P N="variableID">53</P></Ps><CPs><CP ID="1778" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="402" T="ChangeVariable"><Ps C="S"><P N="variableID">88</P></Ps><CPs><CP ID="1779" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="403" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">88</P><P N="if_1/conditions/expression_1/arg1/type">1</P><P N="if_1/conditions/expression_1/operation">1</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/actions/assignment_1/lvalue">1781</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">88</P><P N="if_1/actions/assignment_1/rvalue/type">1</P></Ps><CPs><CP ID="1782" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1780" FP="A" P="0" N="value1"/><CP ID="1781" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="405" N="Conditiona_DTP03_2300" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">1790</P><P N="if_1/conditions/expression_1/arg1/type">2</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">343</P><P N="if_1/actions/assignment_1/lvalue">1789</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">1791</P><P N="if_1/actions/assignment_1/rvalue/type">2</P></Ps><CPs><CP ID="1790" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1791" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1789" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="407" T="ChangeVariable"><Ps C="S"><P N="variableID">85</P></Ps><CPs><CP ID="1793" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="409" T="ChangeVariable"><Ps C="S"><P N="variableID">85</P></Ps><CPs><CP ID="1796" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1795" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="410" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var DTP_343 = ec_VariableHelper.GetVariable(&quot;DTP_343_2300&quot;)
var DTP01 =&quot;&quot;;
if(DTP_343 != &quot;&quot;)
DTP01 = DTP_343.substr(0,4)+'-'+DTP_343.substr(4,2)+'-'+DTP_343.substr(6,2);
var count_2300 = ec_VariableHelper.GetVariable(&quot;Count_2300&quot;)
if(count_2300 &gt; 0)
{
if(count_2300 == 1)
{
ec_ResultHelper.ReportResultByIndex(0,DTP01);
}
if(count_2300 == 2)
{
ec_ResultHelper.ReportResultByIndex(1,DTP01);
}
if(count_2300 == 3)
{
ec_ResultHelper.ReportResultByIndex(2,DTP01);
}
if(count_2300 == 4)
{
ec_ResultHelper.ReportResultByIndex(3,DTP01);
}
if(count_2300 == 5)
{
ec_ResultHelper.ReportResultByIndex(4,DTP01);
}
if(count_2300 == 6)
{
ec_ResultHelper.ReportResultByIndex(5,DTP01);
}
if(count_2300 == 7)
{
ec_ResultHelper.ReportResultByIndex(6,DTP01);
}
if(count_2300 == 8)
{
ec_ResultHelper.ReportResultByIndex(7,DTP01);
}
}
//ec_ResultHelper.Send();</P></Ps><CPs><CP ID="1806" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1797" FP="A" P="0" N="value1"/><CP ID="1798" FP="X" P="0" N="result1"/><CP ID="1799" FP="X" P="1" N="result2"/><CP ID="1800" FP="X" P="2" N="result3"/><CP ID="1801" FP="X" P="3" N="result4"/><CP ID="1802" FP="X" P="4" N="result5"/><CP ID="1803" FP="X" P="5" N="result6"/><CP ID="1804" FP="X" P="6" N="result7"/><CP ID="1805" FP="X" P="7" N="result8"/></ConnectionPoints/></Fs><Cs><C OutputCP="19" InputCP="16"/><C OutputCP="20" InputCP="18"/><C OutputCP="23" InputCP="21"/><C OutputCP="11" InputCP="29"/><C OutputCP="11" InputCP="36"/><C OutputCP="39" InputCP="41"/><C OutputCP="22" InputCP="67"/><C OutputCP="27" InputCP="74"></C><C OutputCP="11" InputCP="75"></C><C OutputCP="30" InputCP="76"/><C OutputCP="37" InputCP="77"/><C OutputCP="83" InputCP="93"></C><C OutputCP="46" InputCP="94"></C><C OutputCP="89" InputCP="95"></C><C OutputCP="91" InputCP="96"></C><C OutputCP="111" InputCP="112"></C><C OutputCP="113" InputCP="114"></C><C OutputCP="115" InputCP="116"></C><C OutputCP="117" InputCP="118"></C><C OutputCP="146" InputCP="147"></C><C OutputCP="148" InputCP="149"/><C OutputCP="151" InputCP="152"/><C OutputCP="154" InputCP="155"></C><C OutputCP="156" InputCP="157"></C><C OutputCP="160" InputCP="158"/><C OutputCP="159" InputCP="161"/><C OutputCP="160" InputCP="162"/><C OutputCP="163" InputCP="164"/><C OutputCP="165" InputCP="166"></C><C OutputCP="169" InputCP="171"></C><C OutputCP="174" InputCP="177"/><C OutputCP="178" InputCP="179"/><C OutputCP="180" InputCP="181"/><C OutputCP="286" InputCP="291"/><C OutputCP="292" InputCP="287"/><C OutputCP="288" InputCP="293"/><C OutputCP="289" InputCP="294"/><C OutputCP="290" InputCP="295"/><C OutputCP="298" InputCP="297"/><C OutputCP="301" InputCP="300"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="304" InputCP="303"/><C OutputCP="306" InputCP="314"/><C OutputCP="307" InputCP="317"/><C OutputCP="368" InputCP="369"/><C OutputCP="699" InputCP="697"/><C OutputCP="698" InputCP="700"/><C OutputCP="702" InputCP="704"/><C OutputCP="27" InputCP="707"/><C OutputCP="708" InputCP="71"/><C OutputCP="121" InputCP="714"/><C OutputCP="123" InputCP="715"/><C OutputCP="234" InputCP="716"/><C OutputCP="235" InputCP="717"/><C OutputCP="236" InputCP="718"/><C OutputCP="237" InputCP="719"/><C OutputCP="752" InputCP="751"/><C OutputCP="274" InputCP="754"/><C OutputCP="368" InputCP="528"/><C OutputCP="529" InputCP="525"/><C OutputCP="764" InputCP="763"/><C OutputCP="762" InputCP="765"/><C OutputCP="778" InputCP="777"/><C OutputCP="776" InputCP="779"/><C OutputCP="356" InputCP="832"/><C OutputCP="274" InputCP="367"><Ps C="GuidelineFilters"><P N="Event">0</P></Ps></C><C OutputCP="368" InputCP="830"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="822" InputCP="357"/><C OutputCP="823" InputCP="624"/><C OutputCP="824" InputCP="359"/><C OutputCP="825" InputCP="360"/><C OutputCP="826" InputCP="364"/><C OutputCP="827" InputCP="363"/><C OutputCP="828" InputCP="361"/><C OutputCP="829" InputCP="362"/><C OutputCP="834" InputCP="623"/><C OutputCP="835" InputCP="358"/><C OutputCP="836" InputCP="625"/><C OutputCP="837" InputCP="626"/><C OutputCP="838" InputCP="627"/><C OutputCP="839" InputCP="628"/><C OutputCP="840" InputCP="629"/><C OutputCP="841" InputCP="630"/><C OutputCP="368" InputCP="842"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="619" InputCP="844"/><C OutputCP="739" InputCP="856"/><C OutputCP="752" InputCP="854"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="846" InputCP="746"/><C OutputCP="847" InputCP="747"/><C OutputCP="848" InputCP="748"/><C OutputCP="849" InputCP="749"/><C OutputCP="850" InputCP="750"/><C OutputCP="302" InputCP="308"/><C OutputCP="326" InputCP="863"/><C OutputCP="298" InputCP="871"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="864" InputCP="339"/><C OutputCP="865" InputCP="340"/><C OutputCP="866" InputCP="341"/><C OutputCP="867" InputCP="342"/><C OutputCP="868" InputCP="343"/><C OutputCP="869" InputCP="344"/><C OutputCP="690" InputCP="978"/><C OutputCP="660" InputCP="979"/><C OutputCP="690" InputCP="981"/><C OutputCP="660" InputCP="982"/><C OutputCP="977" InputCP="983"/><C OutputCP="980" InputCP="984"/><C OutputCP="998" InputCP="661"/><C OutputCP="999" InputCP="662"/><C OutputCP="1000" InputCP="663"/><C OutputCP="1001" InputCP="664"/><C OutputCP="1002" InputCP="665"/><C OutputCP="1003" InputCP="666"/><C OutputCP="1004" InputCP="667"/><C OutputCP="1005" InputCP="668"/><C OutputCP="1006" InputCP="681"/><C OutputCP="1007" InputCP="682"/><C OutputCP="1008" InputCP="683"/><C OutputCP="1009" InputCP="684"/><C OutputCP="1010" InputCP="685"/><C OutputCP="1011" InputCP="686"/><C OutputCP="1012" InputCP="687"/><C OutputCP="1013" InputCP="688"/><C OutputCP="368" InputCP="1014"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="274" InputCP="1019"/><C OutputCP="274" InputCP="1020"/><C OutputCP="1037" InputCP="412"/><C OutputCP="1038" InputCP="420"/><C OutputCP="1039" InputCP="428"/><C OutputCP="1040" InputCP="486"/><C OutputCP="1041" InputCP="413"/><C OutputCP="1042" InputCP="421"/><C OutputCP="1043" InputCP="429"/><C OutputCP="1044" InputCP="487"/><C OutputCP="1045" InputCP="414"/><C OutputCP="1046" InputCP="422"/><C OutputCP="1047" InputCP="430"/><C OutputCP="1048" InputCP="488"/><C OutputCP="1049" InputCP="415"/><C OutputCP="1050" InputCP="423"/><C OutputCP="1051" InputCP="431"/><C OutputCP="1052" InputCP="489"/><C OutputCP="1053" InputCP="416"/><C OutputCP="1054" InputCP="424"/><C OutputCP="1055" InputCP="432"/><C OutputCP="1056" InputCP="490"/><C OutputCP="1057" InputCP="417"/><C OutputCP="1058" InputCP="425"/><C OutputCP="1059" InputCP="433"/><C OutputCP="1060" InputCP="491"/><C OutputCP="1061" InputCP="418"/><C OutputCP="1062" InputCP="426"/><C OutputCP="1063" InputCP="434"/><C OutputCP="1064" InputCP="492"/><C OutputCP="1065" InputCP="419"/><C OutputCP="1066" InputCP="427"/><C OutputCP="1067" InputCP="435"/><C OutputCP="1068" InputCP="493"/><C OutputCP="408" InputCP="1104"/><C OutputCP="411" InputCP="1105"/><C OutputCP="274" InputCP="1078"><Ps C="GuidelineFilters"><P N="Event">0</P></Ps></C><C OutputCP="274" InputCP="1082"><Ps C="GuidelineFilters"><P N="Event">0</P></Ps></C><C OutputCP="274" InputCP="1086"><Ps C="GuidelineFilters"><P N="Event">0</P></Ps></C><C OutputCP="274" InputCP="1084"><Ps C="GuidelineFilters"><P N="Event">0</P></Ps></C><C OutputCP="368" InputCP="1107"/><C OutputCP="274" InputCP="1109"/><C OutputCP="368" InputCP="1069"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="1103" InputCP="1073"/><C OutputCP="1144" InputCP="1089"/><C OutputCP="1145" InputCP="1090"/><C OutputCP="1146" InputCP="1075"/><C OutputCP="1175" InputCP="1172"/><C OutputCP="1178" InputCP="1177"/><C OutputCP="89" InputCP="1179"/><C OutputCP="1181" InputCP="1180"/><C OutputCP="274" InputCP="1184"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="1183" InputCP="1164"/><C OutputCP="1198" InputCP="706"/><C OutputCP="578" InputCP="1241"/><C OutputCP="1169" InputCP="1242"/><C OutputCP="274" InputCP="1244"/><C OutputCP="1169" InputCP="1254"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="1246" InputCP="581"/><C OutputCP="1247" InputCP="582"/><C OutputCP="1248" InputCP="583"/><C OutputCP="1249" InputCP="584"/><C OutputCP="1250" InputCP="585"/><C OutputCP="1251" InputCP="586"/><C OutputCP="1252" InputCP="587"/><C OutputCP="1253" InputCP="612"/><C OutputCP="1256" InputCP="589"/><C OutputCP="1257" InputCP="590"/><C OutputCP="1259" InputCP="555"/><C OutputCP="1260" InputCP="556"/><C OutputCP="1261" InputCP="557"/><C OutputCP="1262" InputCP="558"/><C OutputCP="1263" InputCP="559"/><C OutputCP="1264" InputCP="560"/><C OutputCP="1265" InputCP="561"/><C OutputCP="1266" InputCP="562"/><C OutputCP="1269" InputCP="563"/><C OutputCP="1270" InputCP="564"/><C OutputCP="549" InputCP="1271"/><C OutputCP="1169" InputCP="1267"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="604" InputCP="1272"/><C OutputCP="1274" InputCP="605"/><C OutputCP="1275" InputCP="606"/><C OutputCP="1276" InputCP="607"/><C OutputCP="1277" InputCP="608"/><C OutputCP="1278" InputCP="609"/><C OutputCP="1279" InputCP="610"/><C OutputCP="1280" InputCP="611"/><C OutputCP="1281" InputCP="588"/><C OutputCP="1284" InputCP="613"/><C OutputCP="1285" InputCP="614"/><C OutputCP="1169" InputCP="1282"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="23" InputCP="1286"/><C OutputCP="102" InputCP="1298"/><C OutputCP="1300" InputCP="1299"/><C OutputCP="1297" InputCP="108"/><C OutputCP="1294" InputCP="104"/><C OutputCP="1296" InputCP="106"/><C OutputCP="1295" InputCP="105"/><C OutputCP="1293" InputCP="103"/><C OutputCP="11" InputCP="1301"/><C OutputCP="730" InputCP="1319"/><C OutputCP="734" InputCP="1321"/><C OutputCP="1320" InputCP="1307"/><C OutputCP="690" InputCP="1322"/><C OutputCP="660" InputCP="1324"/><C OutputCP="1323" InputCP="1309"/><C OutputCP="1325" InputCP="1326"/><C OutputCP="699" InputCP="701"/><C OutputCP="703" InputCP="1327"/><C OutputCP="1328" InputCP="1329"></C><C OutputCP="1330" InputCP="1331"></C><C OutputCP="1332" InputCP="1333"></C><C OutputCP="1334" InputCP="1336"/><C OutputCP="1337" InputCP="1335"/><C OutputCP="1169" InputCP="1339"/><C OutputCP="301" InputCP="1344"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="711" InputCP="1345"/><C OutputCP="712" InputCP="1347"/><C OutputCP="713" InputCP="1349"/><C OutputCP="1354" InputCP="1352"/><C OutputCP="1350" InputCP="1355"/><C OutputCP="1341" InputCP="139"/><C OutputCP="1342" InputCP="136"/><C OutputCP="1343" InputCP="137"/><C OutputCP="187" InputCP="1362"/><C OutputCP="1363" InputCP="188"/><C OutputCP="1385" InputCP="1384"/><C OutputCP="1385" InputCP="1386"/><C OutputCP="1385" InputCP="1387"/><C OutputCP="1385" InputCP="1388"/><C OutputCP="468" InputCP="1389"/><C OutputCP="274" InputCP="1448"/><C OutputCP="274" InputCP="1478"/><C OutputCP="274" InputCP="1547"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="1569" InputCP="1485"/><C OutputCP="1570" InputCP="1486"/><C OutputCP="438" InputCP="1537"/><C OutputCP="1484" InputCP="1539"/><C OutputCP="1571" InputCP="1487"/><C OutputCP="1572" InputCP="1488"/><C OutputCP="1573" InputCP="1489"/><C OutputCP="1493" InputCP="1575"/><C OutputCP="1494" InputCP="1577"/><C OutputCP="1576" InputCP="1578"/><C OutputCP="813" InputCP="1587"/><C OutputCP="811" InputCP="1589"/><C OutputCP="1588" InputCP="1592"/><C OutputCP="1591" InputCP="1594"/><C OutputCP="1614" InputCP="801"/><C OutputCP="1615" InputCP="803"/><C OutputCP="1616" InputCP="805"/><C OutputCP="1617" InputCP="807"/><C OutputCP="1618" InputCP="809"/><C OutputCP="1637" InputCP="802"/><C OutputCP="1638" InputCP="804"/><C OutputCP="1639" InputCP="806"/><C OutputCP="1640" InputCP="808"/><C OutputCP="1641" InputCP="810"/><C OutputCP="468" InputCP="1619"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="523" InputCP="1642"/><C OutputCP="524" InputCP="1644"/><C OutputCP="1643" InputCP="1645"/><C OutputCP="1582" InputCP="1532"/><C OutputCP="1583" InputCP="1533"/><C OutputCP="1584" InputCP="1534"/><C OutputCP="1585" InputCP="1535"/><C OutputCP="1586" InputCP="1536"/><C OutputCP="1646" InputCP="530"/><C OutputCP="1647" InputCP="531"/><C OutputCP="1648" InputCP="532"/><C OutputCP="1649" InputCP="533"/><C OutputCP="1650" InputCP="534"/><C OutputCP="468" InputCP="1581"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="468" InputCP="1653"/><C OutputCP="1564" InputCP="1655"/><C OutputCP="1654" InputCP="459"/><C OutputCP="1565" InputCP="1657"/><C OutputCP="1656" InputCP="460"/><C OutputCP="1566" InputCP="1659"/><C OutputCP="1658" InputCP="461"/><C OutputCP="1567" InputCP="1661"/><C OutputCP="1660" InputCP="462"/><C OutputCP="1568" InputCP="1663"/><C OutputCP="1662" InputCP="463"/><C OutputCP="1667" InputCP="1313"/><C OutputCP="728" InputCP="1666"/><C OutputCP="723" InputCP="1668"/><C OutputCP="368" InputCP="1672"/><C OutputCP="368" InputCP="1675"/><C OutputCP="368" InputCP="1678"/><C OutputCP="368" InputCP="1681"/><C OutputCP="368" InputCP="1684"/><C OutputCP="368" InputCP="1687"/><C OutputCP="368" InputCP="1690"/><C OutputCP="368" InputCP="1693"/><C OutputCP="368" InputCP="1696"/><C OutputCP="305" InputCP="311"/><C OutputCP="1169" InputCP="1699"/><C OutputCP="1169" InputCP="1702"/><C OutputCP="23" InputCP="1709"/><C OutputCP="1183" InputCP="1710"/><C OutputCP="274" InputCP="1713"/><C OutputCP="1717" InputCP="1716"/><C OutputCP="274" InputCP="1708"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="1707" InputCP="1164"><Ps C="TargetManipulation"><P N="Behavior">1</P></Ps></C><C OutputCP="17" InputCP="1725"/><C OutputCP="23" InputCP="1749"/><C OutputCP="46" InputCP="1752"/><C OutputCP="42" InputCP="1722"/><C OutputCP="1753" InputCP="1723"/><C OutputCP="23" InputCP="61"/><C OutputCP="11" InputCP="709"/><C OutputCP="1756" InputCP="1755"/><C OutputCP="1758" InputCP="1757"/><C OutputCP="1760" InputCP="1759"/><C OutputCP="274" InputCP="1754"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="1727" InputCP="1718"/><C OutputCP="1731" InputCP="1719"/><C OutputCP="1733" InputCP="1720"/><C OutputCP="274" InputCP="1763"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="1762" InputCP="1767"/><C OutputCP="1766" InputCP="1724"/><C OutputCP="1187" InputCP="1768"/><C OutputCP="1737" InputCP="1721"/><C OutputCP="274" InputCP="1769"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="1195" InputCP="1779"/><C OutputCP="1781" InputCP="1199"/><C OutputCP="274" InputCP="1782"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="309" InputCP="319"/><C OutputCP="312" InputCP="318"/><C OutputCP="315" InputCP="322"/><C OutputCP="1783" InputCP="1784"></C><C OutputCP="690" InputCP="1790"/><C OutputCP="660" InputCP="1791"/><C OutputCP="1789" InputCP="1793"/><C OutputCP="368" InputCP="1796"/><C OutputCP="368" InputCP="1806"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="1798" InputCP="1807"/><C OutputCP="1799" InputCP="1808"/><C OutputCP="1800" InputCP="1809"/><C OutputCP="1801" InputCP="1810"/><C OutputCP="1802" InputCP="1811"/><C OutputCP="1803" InputCP="1812"/><C OutputCP="1804" InputCP="1813"/><C OutputCP="1805" InputCP="1814"/></Cs></Map>
</file>
<file path="ArtifactsRepository/EnrollmentAutomation/IBEnrollment834/SplitRule/IB_834_Automation_EDI_Splitrule.xml">
<?xml version="1.0" encoding="UTF-8"?><DataSplitRules Version="2.0" N="Data Splitting rules" Description="Default data splitting rule set" xsi:noNamespaceSchemaLocation="DataSplitRules.xsd" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"><Rule name="good">Transaction[@AckCode='A'] and Member[@AckCode='A'] and Member[@SubscriberID='##unique##']</Rule><Rule name="bad">Group[@AckCode='R'] or Transaction[@AckCode='R'] or Member[@AckCode='R']</Rule></DataSplitRules>
</file>
<file path="ArtifactsRepository/EnrollmentAutomation/IBEnrollment834/Template/IB_834_Automation_Header.txt">
Subscriber_ID,EdiFilename,SenderId,ReceiverId,ActionCode,Maintenance_Type_Code,Maintenance_type_code_EDI,Maintenance_Override,MaintenanceReasonCode_Name,MaintenanceReasonCode_Entry,Member_MaintenanceReasonCode_Name,Member_MaintenanceReasonCode_Entry,Individual_Relationship_Code,Relationship_Name,BenefitStatusCode,MemberIsSubscriber,Ethnicity_codeSetName,Ethnicity_1,Ethnicity_2,Ethnicity_3,Ethnicity_4,Ethnicity_5,Smoking_Status,Gender_Code,Marital_Status_Code,Immigration_Status,Birth_Date,Last_Name,Middle_Name,First_Name,AddressTypeCode_Name,AddressTypeCode_Entry,Postal_Address,State_Code,Zip_Code,ZipExtension_Code,City_Name,County_Code,Phone_Area_Code,Phone_Number,emailAddress,Correspondence_Address,State_Code_correspondence,Zip_Code_correspondence,City_Name_correspondence,County_Code_correspondance,Receipt_Date,Identification_Number,BenefitPlan_Hcc_Id_EDI_Group Number_1,BenefitPlan_Hcc_Id_EDI_Class of Contract code_1,BenefitPlan_Hcc_Id_EDI_Client_Reporting Category_1,BenefitPlan_Hcc_Id_EDI_MutuallyDefined_1,BenefitPlan_startDate_1,BenefitPlan_endDate_1,Effectuation_Date_1,HealthCoverageMaintenanceCode_1,InsuranceLineCode_1,BenefitPlan_Hcc_Id_EDI_Group Number_2,BenefitPlan_Hcc_Id_EDI_Class of Contract code_2,BenefitPlan_Hcc_Id_EDI_Client_ReportingCategory_2,BenefitPlan_Hcc_Id_EDI_MutuallyDefined_2,BenefitPlan_startDate_2,BenefitPlan_endDate_2,Effectuation_Date_2,HealthCoverageMaintenanceCode_2,InsuranceLineCode_2,BenefitPlan_Hcc_Id_EDI_Group Number_3,BenefitPlan_Hcc_Id_EDI_Class of Contract code_3,BenefitPlan_Hcc_Id_EDI_Client_ReportingCategory_3,BenefitPlan_Hcc_Id_EDI_MutuallyDefined_3,BenefitPlan_startDate_3,BenefitPlan_endDate_3,Effectuation_Date_3,HealthCoverageMaintenanceCode_3,InsuranceLineCode_3,BenefitPlan_Hcc_Id_EDI_Group_Number_4,BenefitPlan_Hcc_Id_EDI_Class_of_Contract_code_4,BenefitPlan_Hcc_Id_EDI_Client_ReportingCategory_4,BenefitPlan_Hcc_Id_EDI_MutuallyDefined_4,BenefitPlan_startDate_4,BenefitPlan_endDate_4,Effectuation_Date_4,HealthCoverageMaintenanceCode_4,InsuranceLineCode_4,BenefitPlan_Hcc_Id_EDI_Group_Number_5,BenefitPlan_Hcc_Id_EDI_Class_of_Contract_code_5,BenefitPlan_Hcc_Id_EDI_Client_ReportingCategory_5,BenefitPlan_Hcc_Id_EDI_MutuallyDefined_5,BenefitPlan_startDate_5,BenefitPlan_endDate_5,Effectuation_Date_5,HealthCoverageMaintenanceCode_5,InsuranceLineCode_5,BenefitPlan_Hcc_Id_EDI_Group Number_6,BenefitPlan_Hcc_Id_EDI_Class_of_Contract_code_6,BenefitPlan_Hcc_Id_EDI_Client_ReportingCategory_6,BenefitPlan_Hcc_Id_EDI_MutuallyDefined_6,BenefitPlan_startDate_6,BenefitPlan_endDate_6,Effectuation_Date_6,HealthCoverageMaintenanceCode_6,InsuranceLineCode_6,BenefitPlan_Hcc_Id_EDI_Group_Number_7,BenefitPlan_Hcc_Id_EDI_Class_of_Contract_code_7,BenefitPlan_Hcc_Id_EDI_Client_ReportingCategory_7,BenefitPlan_Hcc_Id_EDI_MutuallyDefined_7,BenefitPlan_startDate_7,BenefitPlan_endDate_7,Effectuation_Date_7,HealthCoverageMaintenanceCode_7,InsuranceLineCode_7,BenefitPlan_Hcc_Id_EDI_Group_Number_8,BenefitPlan_Hcc_Id_EDI_Class_of_Contract_code_8,BenefitPlan_Hcc_Id_EDI_Client_ReportingCategory_8,BenefitPlan_Hcc_Id_EDI_MutuallyDefined_8,BenefitPlan_startDate_8,BenefitPlan_endDate_8,Effectuation_Date_8,HealthCoverageMaintenanceCode_8,InsuranceLineCode_8,COB_PolicyId_1,COB_otherInsuranceCompanyName_1,COB_groupNumber_1,COB_startDate_1,COB_endDate1,COB_responsibilitySequenceCode_1,COB_PolicyId_2,COB_otherInsuranceCompanyName_2,COB_groupNumber_2,COB_startDate_2,COB_endDate_2,COB_responsibilitySequenceCode_2,COB_PolicyId_3,COB_otherInsuranceCompanyName_3,COB_groupNumber_3,COB_startDate_3,COB_endDate_3,COB_responsibilitySequenceCode_3,COB_PolicyId_4,COB_otherInsuranceCompanyName_4,COB_groupNumber_4,COB_startDate_4,COB_endDate_4,COB_responsibilitySequenceCode_4,COB_PolicyId_5,COB_otherInsuranceCompanyName_5,COB_groupNumber_5,COB_startDate_5,COB_endDate_5,COB_responsibilitySequenceCode_5,PCP_RoleType,PCP_hccIdentificationNumber,PCP_Change_Effectivedate,Language_codeEntry_1,Language_shortName_1,Language_codeSetName_1,Primary_Language_1,Native_Language_1,Language_codeEntry_2,Language_shortName_2,Language_codeSetName_2,Primary_Language_2,Native_Language_2,Language_codeEntry_3,Language_shortName_3,Language_codeSetName_3,Primary_Language_3,Native_Language_3,AsOfDate,Subscriber_count,Policy_number,Case_Number,Client_Number,Client_Reporting_Category,Cross_Reference_Number,Mutually_Defined_Identifier,Reporting_Category_Name_1,Reporting_Category_Identification_1,Reporting_Category_Date_1,Reporting_Category_Name_2,Reporting_Category_Identification_2,Reporting_Category_Date_2,Reporting_Category_Name_3,Reporting_Category_Identification_3,Reporting_Category_Date_3,Reporting_Category_Name_4,Reporting_Category_Identification_4,Reporting_Category_Date_4,Reporting_Category_Name_5,Reporting_Category_Identification_5,Reporting_Category_Date_5,Reporting_Category_Name_6,Reporting_Category_Identification_6,Reporting_Category_Date_6,Reporting_Category_Name_7,Reporting_Category_Identification_7,Reporting_Category_Date_7,Reporting_Category_Name_8,Reporting_Category_Identification_8,Reporting_Category_Date_8,Reporting_Category_Name_9,Reporting_Category_Identification_9,Reporting_Category_Date_9,Reporting_Category_Name_10,Reporting_Category_Identification_10,Reporting_Category_Date_10,Subscriber_identification_number
${M_Body}
</file>
<file path="ArtifactsRepository/EnrollmentAutomation/IBEnrollmentADV/Groovy/P_IB_DFF_Ordering.txt">
import com.edifecs.etools.xeserver.proxy.ProxyMessage;
import com.edifecs.etools.commons.io.SmartStream;
import java.io.*;
import java.util.*;
// Access the exchange and message data
exchange = context.exchange;
exchProperties = exchange.properties;
messages = exchange.messages;
message = messages[0];
msgHeaders = message.headers;
// Read the input stream content into a string
messageBodyInputStream = message.getBodyAsSmartStream().getInputStream();
String messageContent = new String(messageBodyInputStream.readAllBytes());
exchProperties.each { k, v -> msgHeaders.put(k, v) }
// Split the input data into individual lines
String[] tempLines = messageContent.split("[\\r\\n]+");
// Initialize variables
char CR = (char) 0x0D;
char LF = (char) 0x0A;
// Create a map to hold subscriber IDs and their corresponding lines
Map<String, List<String>> subscriberToLinesMap = new HashMap<>();
// Process each line
for (String tempLine : tempLines) {
String[] parts = tempLine.split("\\|");
if (parts.length >= 2) {
String transactionType = parts[0];
String subscriberID = parts[1];
if (!subscriberToLinesMap.containsKey(subscriberID)) {
subscriberToLinesMap.put(subscriberID, new ArrayList<>());
}
if ("DEM".equals(transactionType)) {
subscriberToLinesMap.get(subscriberID).add(0, tempLine);
} else {
subscriberToLinesMap.get(subscriberID).add(tempLine);
}
}
}
// Generate the final data string using StringBuilder
StringBuilder finalDataStringBuilder = new StringBuilder();
for (String subscriberID : subscriberToLinesMap.keySet()) {
List<String> lines = subscriberToLinesMap.get(subscriberID);
for (String line : lines) {
finalDataStringBuilder.append(line).append(CR).append(LF);
}
}
String finalDataString = finalDataStringBuilder.toString();
// Create a new message headers map
def newMsgHeaders = [:]
exchProperties.each { k, v -> newMsgHeaders.put(k, v) }
// Create a new message and send the response
ProxyMessage newMessage = context.createNewMessage(finalDataString, newMsgHeaders);
context.createExchangeResponse(msgHeaders, newMessage);
</file>
<file path="ArtifactsRepository/EnrollmentAutomation/IBEnrollmentADV/Map/P_IB_DFF_CSV_AUTOMATION.ems">
<?xml version="1.0" encoding="UTF-8"?><Map Version="3" ModelVersion="4" ModelRevision="1" LastCPID="2327"><Ps C="Variables"><P N="LastVarID">54</P><P N="1/ID">1</P><P N="1/Name">Tr_Type</P><P N="2/ID">7</P><P N="2/Name">ethnicity</P><P N="3/ID">8</P><P N="3/Name">PCP_Count</P><P N="3/InitValue">0</P><P N="4/ID">9</P><P N="4/Name">PCP_ID</P><P N="5/ID">11</P><P N="5/Name">End_Date</P><P N="6/ID">12</P><P N="6/Name">LEP_NUM</P><P N="7/ID">13</P><P N="7/Name">LEP_Count</P><P N="7/InitValue">0</P><P N="8/ID">14</P><P N="8/Name">Start_Date</P><P N="9/ID">15</P><P N="9/Name">Lep_Ammount</P><P N="10/ID">16</P><P N="10/Name">Lep_Waided_Ammount</P><P N="11/ID">17</P><P N="11/Name">Subsidy_Ammount</P><P N="12/ID">18</P><P N="12/Name">LIS_Count</P><P N="12/InitValue">0</P><P N="13/ID">19</P><P N="13/Name">LIS_Subsidy</P><P N="14/ID">20</P><P N="14/Name">PartD_Subsidy</P><P N="15/ID">21</P><P N="15/Name">PartD_Copay</P><P N="16/ID">22</P><P N="16/Name">Contract_Number_Count</P><P N="16/InitValue">0</P><P N="17/ID">23</P><P N="17/Name">Contract_Number</P><P N="18/ID">24</P><P N="18/Name">PBP_Number</P><P N="19/ID">25</P><P N="19/Name">Group_ID_Count</P><P N="19/InitValue">0</P><P N="20/ID">26</P><P N="20/Name">Group_ID</P><P N="21/ID">27</P><P N="21/Name">DRC_Count</P><P N="21/InitValue">0</P><P N="22/ID">28</P><P N="22/Name">DRC</P><P N="23/ID">29</P><P N="23/Name">Signature_Date</P><P N="24/ID">30</P><P N="24/Name">Election_Type</P><P N="25/ID">31</P><P N="25/Name">PWO_Count</P><P N="25/InitValue">0</P><P N="26/ID">32</P><P N="26/Name">Payment_Method</P><P N="27/ID">33</P><P N="27/Name">Premium_PWO</P><P N="28/ID">34</P><P N="28/Name">FLG</P><P N="29/ID">35</P><P N="29/Name">FLG_Count</P><P N="29/InitValue">0</P><P N="30/ID">36</P><P N="30/Name">Hospice</P><P N="31/ID">37</P><P N="31/Name">Medicaid_Flg</P><P N="32/ID">38</P><P N="32/Name">Institutional_Flg</P><P N="33/ID">39</P><P N="33/Name">ESRD_Flg</P><P N="34/ID">40</P><P N="34/Name">Transplant_Flag</P><P N="35/ID">41</P><P N="35/Name">Dialysis_Flg</P><P N="36/ID">42</P><P N="36/Name">MCD_Count</P><P N="36/InitValue">0</P><P N="37/ID">43</P><P N="37/Name">MCD</P><P N="38/ID">44</P><P N="38/Name">COB_Count</P><P N="38/InitValue">0</P><P N="39/ID">45</P><P N="39/Name">COB_Date</P><P N="40/ID">46</P><P N="40/Name">Disabled_Flg</P><P N="41/ID">47</P><P N="41/Name">Name_of_Coverage</P><P N="42/ID">48</P><P N="42/Name">SubId_Coverage</P><P N="43/ID">49</P><P N="43/Name">GroupId_Covergae</P><P N="44/ID">50</P><P N="44/Name">KindOfInsurance</P><P N="45/ID">51</P><P N="45/Name">NameOfInsurance</P><P N="46/ID">52</P><P N="46/Name">Subscriber_Id</P><P N="47/ID">53</P><P N="47/Name">M3P</P><P N="47/InitValue"/><P N="48/ID">54</P><P N="48/Name">M3P_Count</P><P N="48/InitValue">0</P></Ps><Sources><ES ID="1" Type="File.ECS"><Ps><P N="Name">Source</P><P N="Location">..\Guideline\P_IB_DFF_AUTOMATION_SOURCE.ecs</P></Ps><CPs><CP ID="1" Pth="{P1}/Field(ID = 'Claim SubscriberID Number')"/><CP ID="3" Pth="{P1}/Field(ID = 'Member Social Security Number')"/><CP ID="7" Pth="{P1}/Field(ID = 'MBI')"/><CP ID="8" Pth="{P1}/Field(ID = 'Member Permanent Address1')"/><CP ID="10" Pth="{P1}/Field(ID = 'Subscriber Flag')"/><CP ID="11" Pth="{P1}/Field(ID = 'Member''s Title')"/><CP ID="15" Pth="{P1}/Field(ID = 'Member Billing State')"/><CP ID="16" Pth="{P1}/Field(ID = 'Transaction Type')"/><CP ID="21" Pth="{P1}"/><CP ID="42" Pth="{P1}/Field(ID = 'Member''s Last Name')"/><CP ID="45" Pth="{P1}/Field(ID = 'Member''s First Name')"/><CP ID="50" Pth="{P1}/Field(ID = 'Middle Initial')"/><CP ID="57" Pth="{P1}/Field(ID = 'Member Status')"/><CP ID="62" Pth="{P1}/Field(ID = 'Alternate Member ID')"/><CP ID="66" Pth="{P1}/Field(ID = 'Member Date of Birth')"/><CP ID="71" Pth="{P1}/Field(ID = 'Member Date of Death')"/><CP ID="83" Pth="{P1}/Field(ID = 'Member Gender')"/><CP ID="99" Pth="{P1}/Field(ID = 'Member Permanent Address2')"/><CP ID="101" Pth="{P1}/Field(ID = 'Member Permanent Address3')"/><CP ID="106" Pth="{P1}/Field(ID = 'Member Permanent City')"/><CP ID="110" Pth="{P1}/Field(ID = 'Member Permanent County')"/><CP ID="113" Pth="{P1}/Field(ID = 'Member Permanent State')"/><CP ID="117" Pth="{P1}/Field(ID = 'Member Permanent Zip Code')"/><CP ID="121" Pth="{P1}/Field(ID = 'Member Mailing Address1')"/><CP ID="125" Pth="{P1}/Field(ID = 'Member Mailing Address2')"/><CP ID="129" Pth="{P1}/Field(ID = 'Member Mailing Address3')"/><CP ID="133" Pth="{P1}/Field(ID = 'Member Mailing City')"/><CP ID="141" Pth="{P1}/Field(ID = 'Member Mailing State')"/><CP ID="143" Pth="{P1}/Field(ID = 'Member Mailing Zip Code')"/><CP ID="169" Pth="{P1}/Field(ID = 'Member Billing Address1')"/><CP ID="170" Pth="{P1}/Field(ID = 'Member Billing Address2')"/><CP ID="171" Pth="{P1}/Field(ID = 'Member Billing Address3')"/><CP ID="175" Pth="{P1}/Field(ID = 'Member Billing City')"/><CP ID="176" Pth="{P1}/Field(ID = 'Member Billing Zip Code')"/><CP ID="186" Pth="{P1}/Field(ID = 'Member Home Phone Number')"/><CP ID="193" Pth="{P1}/Field(ID = 'Alternate Member Phone Number')"/><CP ID="194" Pth="{P1}/Field(ID = 'Member Email Address')"/><CP ID="204" Pth="{P1}/Field(ID = 'Name of Emergency Contact')"/><CP ID="205" Pth="{P1}/Field(ID = 'Emergency Contact Relationship to Member')"/><CP ID="206" Pth="{P1}/Field(ID = 'Emergency Contact Phone Number')"/><CP ID="220" Pth="{P1}/Field(ID = 'Endangered Member Flag')"/><CP ID="224" Pth="{P1}/Field(ID = 'Medicaid ID')"/><CP ID="238" Pth="{P1}/Field(ID = 'Medicare Part A Eff Date')"/><CP ID="239" Pth="{P1}/Field(ID = 'Medicare Part A End Date')"/><CP ID="240" Pth="{P1}/Field(ID = 'Medicare Part B Eff Date')"/><CP ID="241" Pth="{P1}/Field(ID = 'Medicare Part B End Date')"/><CP ID="242" Pth="{P1}/Field(ID = 'Medicare Part D Eff Date')"/><CP ID="243" Pth="{P1}/Field(ID = 'Medicare Part D End Date')"/><CP ID="266" Pth="{P1}/Field(ID = 'Language Code')"/><CP ID="284" Pth="{P1}/Field(ID = 'Alternative Format Large Print')"/><CP ID="288" Pth="{P1}/Field(ID = 'Alternative Format Braille')"/><CP ID="292" Pth="{P1}/Field(ID = 'Alternative Format Audio Tape')"/><CP ID="296" Pth="{P1}/Field(ID = 'Fax Number')"/><CP ID="303" Pth="{P1}/Field(ID = 'Authorized Rep Name')"/><CP ID="310" Pth="{P1}/Field(ID = 'Authorized Rep Address1')"/><CP ID="313" Pth="{P1}/Field(ID = 'Authorized Rep Address2')"/><CP ID="314" Pth="{P1}/Field(ID = 'Authorized Rep Address3')"/><CP ID="323" Pth="{P1}/Field(ID = 'Authorized Rep City')"/><CP ID="326" Pth="{P1}/Field(ID = 'Authorized Rep County')"/><CP ID="329" Pth="{P1}/Field(ID = 'Authorized Rep State')"/><CP ID="338" Pth="{P1}/Field(ID = 'Authorized Rep Zip Code')"/><CP ID="339" Pth="{P1}/Field(ID = 'Authorized Rep Phone Number')"/><CP ID="340" Pth="{P1}/Field(ID = 'Authorized Rep Relationship')"/><CP ID="346" Pth="{P1}/Field(ID = 'PCP ID/Provider Number')"/><CP ID="370" Pth="{P1}/Field(ID = 'Race Code')"/><CP ID="440" Pth="{P1}/Field(ID = 'Ethnicity')"/><CP ID="516" Pth="{P1}/Field(ID = 'Start Date')"/><CP ID="530" Pth="{P1}/Field(ID = 'End Date')"/><CP ID="575" Pth="{P1}/Field(ID = 'LEP Number of uncovered Months')"/><CP ID="595" Pth="{P1}/Field(ID = 'Part D LEP Amount')"/><CP ID="604" Pth="{P1}/Field(ID = 'PartD LEP Waived Amount')"/><CP ID="613" Pth="{P1}/Field(ID = 'PartD LEP Subsidy Amount')"/><CP ID="655" Pth="{P1}/Field(ID = 'Current LIS Premium Subsidy')"/><CP ID="664" Pth="{P1}/Field(ID = 'PartD LIS Subsidy Level')"/><CP ID="675" Pth="{P1}/Field(ID = 'PartD LIS Copay Category')"/><CP ID="710" Pth="{P1}/Field(ID = 'Contract Number')"/><CP ID="722" Pth="{P1}/Field(ID = 'PBP Number')"/><CP ID="759" Pth="{P1}/Field(ID = 'Group ID')"/><CP ID="798" Pth="{P1}/Field(ID = 'Disenrollment Reason Code(DRC)')"/><CP ID="803" Pth="{P1}/Field(ID = 'Signature Date')"/><CP ID="814" Pth="{P1}/Field(ID = 'Election Type')"/><CP ID="855" Pth="{P1}/Field(ID = 'Payment Method Type')"/><CP ID="866" Pth="{P1}/Field(ID = 'Premium Withhold Option')"/><CP ID="915" Pth="{P1}/Field(ID = 'Hospice Flag')"/><CP ID="941" Pth="{P1}/Field(ID = 'Medicaid Flag')"/><CP ID="952" Pth="{P1}/Field(ID = 'Institutional Flag')"/><CP ID="977" Pth="{P1}/Field(ID = 'ESRD Flag')"/><CP ID="1005" Pth="{P1}/Field(ID = 'Transplant Flag')"/><CP ID="1030" Pth="{P1}/Field(ID = 'Dialysis Flag')"/><CP ID="1091" Pth="{P1}/Field(ID = 'Dual Status Code')"/><CP ID="1130" Pth="{P1}/Field(ID = 'Medicaid Record Type')"/><CP ID="1144" Pth="{P1}/Field(ID = 'COB Update Date')"/><CP ID="1148" Pth="{P1}/Field(ID = 'Disabled Flag')"/><CP ID="1173" Pth="{P1}/Field(ID = 'Name of Other Coverage')"/><CP ID="1183" Pth="{P1}/Field(ID = 'Subscriber ID of Other Coverage')"/><CP ID="1197" Pth="{P1}/Field(ID = 'Group ID of Other Coverage')"/><CP ID="1202" Pth="{P1}/Field(ID = 'Kind of Other insurance')"/><CP ID="1212" Pth="{P1}/Field(ID = 'Name of Other Insurance Company')"/><CP ID="1267" Pth="/InternalProperties/Field(Name = 'RecordID')"/><CP ID="2182" Pth="{P1}/Field(ID = 'M3P Term Reason')"/><CP ID="2290" Pth="{P1}/Field(ID = 'Gender Identity')"/><CP ID="2291" Pth="{P1}/Field(ID = 'Sexual Orientation')"/><CP ID="2292" Pth="{P1}/Field(ID = 'Alternative Format Data CD')"/></ConnectionPoints/></Sources><Targets><ES ID="2" Type="File.ECS"><Ps><P N="Name">Target</P><P N="Location">..\..\..\..\..\Adaptor\ArtifactsRepository\EnrollmentAutomation\IBEnrollmentADV\Guideline\P_IB_CSV_AUTOMATION_TARGET.ecs</P></Ps><CPs><CP ID="4" Pth="{P1}/Field(ID = 'MemberDateofBirth')"/><CP ID="22" Pth="{P1}/Field(ID = 'ClaimsSubscriberIDNumber')"/><CP ID="25" Pth="{P1}/Field(ID = 'SubscriberFlag')"/><CP ID="38" Pth="{P1}/Field(ID = 'MBI')"/><CP ID="43" Pth="{P1}/Field(ID = 'MemberLastName')"/><CP ID="47" Pth="{P1}/Field(ID = 'MemberFirstName')"/><CP ID="51" Pth="{P1}/Field(ID = 'MiddleInitial')"/><CP ID="55" Pth="{P1}/Field(ID = 'MemberTitle')"/><CP ID="59" Pth="{P1}/Field(ID = 'MemberStatus')"/><CP ID="63" Pth="{P1}/Field(ID = 'AlternateMemberID')"/><CP ID="76" Pth="{P1}/Field(ID = 'MemberDateofDeath')"/><CP ID="86" Pth="{P1}/Field(ID = 'MemberGender')"/><CP ID="91" Pth="{P1}/Field(ID = 'MemberSocialSecurityNumber')"/><CP ID="94" Pth="{P1}/Field(ID = 'MemberPermanentAddress _1')"/><CP ID="100" Pth="{P1}/Field(ID = 'MemberPermanentAddress_2')"/><CP ID="102" Pth="{P1}/Field(ID = 'Member Permanent Address_3')"/><CP ID="105" Pth="{P1}/Field(ID = 'MemberPermanentCity')"/><CP ID="109" Pth="{P1}/Field(ID = 'MemberPermanentCounty')"/><CP ID="114" Pth="{P1}/Field(ID = 'MemberPermanentState')"/><CP ID="118" Pth="{P1}/Field(ID = 'MemberPermanentZipCode')"/><CP ID="122" Pth="{P1}/Field(ID = 'MemberMailingAddress_1')"/><CP ID="126" Pth="{P1}/Field(ID = 'MemberMailingAddress_2')"/><CP ID="130" Pth="{P1}/Field(ID = 'MemberMailingAddress_3')"/><CP ID="134" Pth="{P1}/Field(ID = 'MemberMailingCity')"/><CP ID="142" Pth="{P1}/Field(ID = 'MemberMailingState')"/><CP ID="144" Pth="{P1}/Field(ID = 'MemberMailingZipCode')"/><CP ID="172" Pth="{P1}/Field(ID = 'MemberBillingAddress_1')"/><CP ID="173" Pth="{P1}/Field(ID = 'MemberBillingAddress_2')"/><CP ID="174" Pth="{P1}/Field(ID = 'MemberBillingAddress_3')"/><CP ID="177" Pth="{P1}/Field(ID = 'MemberBillingCity')"/><CP ID="178" Pth="{P1}/Field(ID = 'MemberBillingState')"/><CP ID="179" Pth="{P1}/Field(ID = 'MemberBillingZipCode')"/><CP ID="195" Pth="{P1}/Field(ID = 'MemberHomePhoneNumber')"/><CP ID="196" Pth="{P1}/Field(ID = 'AlternateMemberPhoneNumber')"/><CP ID="197" Pth="{P1}/Field(ID = 'MemberEmailAddress')"/><CP ID="210" Pth="{P1}/Field(ID = 'FirstNameofEmergencyContact')"/><CP ID="211" Pth="{P1}/Field(ID = 'LastNameofEmergencyContact')"/><CP ID="216" Pth="{P1}/Field(ID = 'EmergencyContactRelationshiptoMember')"/><CP ID="217" Pth="{P1}/Field(ID = 'EmergencyContactPhoneNumber')"/><CP ID="221" Pth="{P1}/Field(ID = 'EndangeredMemberFlag')"/><CP ID="225" Pth="{P1}/Field(ID = 'MedicaidID')"/><CP ID="256" Pth="{P1}/Field(ID = 'MedicarePartAEffDate')"/><CP ID="257" Pth="{P1}/Field(ID = 'MedicarePartAEndDate')"/><CP ID="258" Pth="{P1}/Field(ID = 'MedicarePartBEffDate')"/><CP ID="259" Pth="{P1}/Field(ID = 'MedicarePartBEndDate')"/><CP ID="260" Pth="{P1}/Field(ID = 'MedicarePartDEffDate')"/><CP ID="261" Pth="{P1}/Field(ID = 'MedicarePartDEndDate')"/><CP ID="267" Pth="{P1}/Field(ID = 'LanguageCode')"/><CP ID="285" Pth="{P1}/Field(ID = 'AlternativeFormatLargePrint')"/><CP ID="289" Pth="{P1}/Field(ID = 'AlternativeFormatBraille')"/><CP ID="293" Pth="{P1}/Field(ID = 'AlternativeFormatAudioTape')"/><CP ID="297" Pth="{P1}/Field(ID = 'FaxNumber')"/><CP ID="306" Pth="{P1}/Field(ID = 'AuthorizedRepFirstName')"/><CP ID="307" Pth="{P1}/Field(ID = 'AuthorizedRepLastName')"/><CP ID="317" Pth="{P1}/Field(ID = 'AuthorizedRepAddress_1')"/><CP ID="318" Pth="{P1}/Field(ID = 'AuthorizedRepAddress_2')"/><CP ID="319" Pth="{P1}/Field(ID = 'AuthorizedRepAddress_3')"/><CP ID="325" Pth="{P1}/Field(ID = 'AuthorizedRepCity')"/><CP ID="328" Pth="{P1}/Field(ID = 'AuthorizedRepCounty')"/><CP ID="331" Pth="{P1}/Field(ID = 'AuthorizedRepState')"/><CP ID="341" Pth="{P1}/Field(ID = 'AuthorizedRepZipCode')"/><CP ID="342" Pth="{P1}/Field(ID = 'AuthorizedRepPhonenumber')"/><CP ID="343" Pth="{P1}/Field(ID = 'AuthorizedRepRelationship')"/><CP ID="352" Pth="{P1}/Field(ID = 'ProviderNumber_1')"/><CP ID="354" Pth="{P1}/Field(ID = 'ProviderNumber_2')"/><CP ID="375" Pth="{P1}/Field(ID = 'Race_1')"/><CP ID="376" Pth="{P1}/Field(ID = 'Race_2')"/><CP ID="403" Pth="{P1}/Field(ID = 'Race_3')"/><CP ID="404" Pth="{P1}/Field(ID = 'Race_4')"/><CP ID="405" Pth="{P1}/Field(ID = 'Race_5')"/><CP ID="461" Pth="{P1}/Field(ID = 'Ethnicity_1')"/><CP ID="464" Pth="{P1}/Field(ID = 'Ethnicity_2')"/><CP ID="465" Pth="{P1}/Field(ID = 'Ethnicity_3')"/><CP ID="467" Pth="{P1}/Field(ID = 'Ethnicity_4')"/><CP ID="468" Pth="{P1}/Field(ID = 'Ethnicity_5')"/><CP ID="524" Pth="{P1}/Field(ID = 'PCP_Startdate1')"/><CP ID="525" Pth="{P1}/Field(ID = 'PCP_Startdate2')"/><CP ID="536" Pth="{P1}/Field(ID = 'PCP_Enddate1')"/><CP ID="537" Pth="{P1}/Field(ID = 'PCP_Enddate2')"/><CP ID="580" Pth="{P1}/Field(ID = 'LEPNumberofUncoveredMonths_1')"/><CP ID="581" Pth="{P1}/Field(ID = 'LEPNumberofUncoveredMonths_2')"/><CP ID="590" Pth="{P1}/Field(ID = 'PartDLEPStartdate1')"/><CP ID="591" Pth="{P1}/Field(ID = 'PartDLEPStartdate2')"/><CP ID="592" Pth="{P1}/Field(ID = 'PartDLEPEnddate2')"/><CP ID="593" Pth="{P1}/Field(ID = 'PartDLEPEnddate1')"/><CP ID="601" Pth="{P1}/Field(ID = 'PartDLEPAmount_1')"/><CP ID="602" Pth="{P1}/Field(ID = 'PartDLEPAmount_2')"/><CP ID="610" Pth="{P1}/Field(ID = 'PartDLEPWaivedAmount_1')"/><CP ID="611" Pth="{P1}/Field(ID = 'PartDLEPWaivedAmount_2')"/><CP ID="619" Pth="{P1}/Field(ID = 'PartDLEPSubsidyAmount_1')"/><CP ID="620" Pth="{P1}/Field(ID = 'PartDLEPSubsidyAmount_2')"/><CP ID="657" Pth="{P1}/Field(ID = 'CurrentLISPremiumSubsidy_1')"/><CP ID="658" Pth="{P1}/Field(ID = 'CurrentLISPremiumSubsidy_2')"/><CP ID="659" Pth="{P1}/Field(ID = 'PartDLISPStartdate1')"/><CP ID="660" Pth="{P1}/Field(ID = 'PartDLISStartdate2')"/><CP ID="661" Pth="{P1}/Field(ID = 'PartDLISEnddate1')"/><CP ID="662" Pth="{P1}/Field(ID = 'PartDLISEnddate2')"/><CP ID="670" Pth="{P1}/Field(ID = 'PartDLISSubsidyLevel_1')"/><CP ID="671" Pth="{P1}/Field(ID = 'PartDLISSubsidyLevel_2')"/><CP ID="679" Pth="{P1}/Field(ID = 'PartDLISCopayCategory_1')"/><CP ID="680" Pth="{P1}/Field(ID = 'PartDLISCopayCategory_2')"/><CP ID="716" Pth="{P1}/Field(ID = 'Contractnumber_1')"/><CP ID="717" Pth="{P1}/Field(ID = 'ContractNumber_2')"/><CP ID="718" Pth="{P1}/Field(ID = 'ContractNumber_3')"/><CP ID="727" Pth="{P1}/Field(ID = 'PBPNumber_1')"/><CP ID="728" Pth="{P1}/Field(ID = 'PBPNumber_2')"/><CP ID="729" Pth="{P1}/Field(ID = 'PBPNumber_3')"/><CP ID="763" Pth="{P1}/Field(ID = 'GroupID_1')"/><CP ID="764" Pth="{P1}/Field(ID = 'GroupID_2')"/><CP ID="765" Pth="{P1}/Field(ID = 'GroupID_3')"/><CP ID="794" Pth="{P1}/Field(ID = 'DisenrollmentReasoncode_DRC_1')"/><CP ID="795" Pth="{P1}/Field(ID = 'DisenrollmentReasoncode_DRC_2')"/><CP ID="796" Pth="{P1}/Field(ID = 'DisenrollmentReasoncode_DRC_3')"/><CP ID="810" Pth="{P1}/Field(ID = 'SignatureDate_1')"/><CP ID="811" Pth="{P1}/Field(ID = 'SignatureDate_2')"/><CP ID="812" Pth="{P1}/Field(ID = 'SignatureDate_3')"/><CP ID="821" Pth="{P1}/Field(ID = 'ElectionType_1')"/><CP ID="822" Pth="{P1}/Field(ID = 'ElectionType_2')"/><CP ID="823" Pth="{P1}/Field(ID = 'ElectionType_3')"/><CP ID="859" Pth="{P1}/Field(ID = 'PaymentMethodType_1')"/><CP ID="860" Pth="{P1}/Field(ID = 'PaymentMethodType_2')"/><CP ID="861" Pth="{P1}/Field(ID = 'PWOStartdate_1')"/><CP ID="862" Pth="{P1}/Field(ID = 'PWOStartdate_2')"/><CP ID="863" Pth="{P1}/Field(ID = 'PWOEnddate_1')"/><CP ID="864" Pth="{P1}/Field(ID = 'PWOEnddate_2')"/><CP ID="872" Pth="{P1}/Field(ID = 'PremiumWithholdOption_1')"/><CP ID="873" Pth="{P1}/Field(ID = 'PremiumWithholdOption_2')"/><CP ID="919" Pth="{P1}/Field(ID = 'HospiceFlag_1')"/><CP ID="920" Pth="{P1}/Field(ID = 'HospiceFlag_2')"/><CP ID="921" Pth="{P1}/Field(ID = 'HospiceFlagStartdate_1')"/><CP ID="922" Pth="{P1}/Field(ID = 'HospiceFlagStartdate_2')"/><CP ID="923" Pth="{P1}/Field(ID = 'HospiceFlagEnddate_1')"/><CP ID="924" Pth="{P1}/Field(ID = 'HospiceFlagEnddate_2')"/><CP ID="945" Pth="{P1}/Field(ID = 'MedicaidFlag_1')"/><CP ID="946" Pth="{P1}/Field(ID = 'MedicaidFlag_2')"/><CP ID="947" Pth="{P1}/Field(ID = 'MedicaidFlagStratDate_1')"/><CP ID="948" Pth="{P1}/Field(ID = 'MedicaidFlagStratDate_2')"/><CP ID="949" Pth="{P1}/Field(ID = 'MedicaidFlagEndDate_1')"/><CP ID="950" Pth="{P1}/Field(ID = 'MedicaidFlagEndDate_2')"/><CP ID="970" Pth="{P1}/Field(ID = 'InstitutionalFlag_1')"/><CP ID="971" Pth="{P1}/Field(ID = 'InstitutionalFlag_2')"/><CP ID="972" Pth="{P1}/Field(ID = 'InstitutionalFlagStartDate_1')"/><CP ID="973" Pth="{P1}/Field(ID = 'InstitutionalFlagStartDate_2')"/><CP ID="974" Pth="{P1}/Field(ID = 'InstitutionalFlagEndDate_1')"/><CP ID="975" Pth="{P1}/Field(ID = 'InstitutionalFlagEndDate_2')"/><CP ID="995" Pth="{P1}/Field(ID = 'ESRDFlag_1')"/><CP ID="996" Pth="{P1}/Field(ID = 'ESRDFlag_2')"/><CP ID="997" Pth="{P1}/Field(ID = 'ESRDFlagStartDate_1')"/><CP ID="998" Pth="{P1}/Field(ID = 'ESRDFlagStartDate_2')"/><CP ID="999" Pth="{P1}/Field(ID = 'ESRDFlagEndDate_1')"/><CP ID="1000" Pth="{P1}/Field(ID = 'ESRDFlagEndDate_2')"/><CP ID="1023" Pth="{P1}/Field(ID = 'TransplantFlag_1')"/><CP ID="1024" Pth="{P1}/Field(ID = 'TransplantFlag_2')"/><CP ID="1025" Pth="{P1}/Field(ID = 'TransplantFlagStartDate_1')"/><CP ID="1026" Pth="{P1}/Field(ID = 'TransplantFlagEndDate_1')"/><CP ID="1027" Pth="{P1}/Field(ID = 'TransplantFlagStartDate_2')"/><CP ID="1028" Pth="{P1}/Field(ID = 'TransplantFlagEndDate_2')"/><CP ID="1048" Pth="{P1}/Field(ID = 'DialysisFlag_1')"/><CP ID="1049" Pth="{P1}/Field(ID = 'DialysisFlag_2')"/><CP ID="1050" Pth="{P1}/Field(ID = 'DialysisFlagStartDate_1')"/><CP ID="1051" Pth="{P1}/Field(ID = 'DialysisFlagStartDate_2')"/><CP ID="1052" Pth="{P1}/Field(ID = 'DialysisFlagEndDate_1')"/><CP ID="1053" Pth="{P1}/Field(ID = 'DialysisFlagEndDate_2')"/><CP ID="1095" Pth="{P1}/Field(ID = 'DualStatusCode_1')"/><CP ID="1096" Pth="{P1}/Field(ID = 'DualStatusCode_2')"/><CP ID="1097" Pth="{P1}/Field(ID = 'MCD_Startdate1')"/><CP ID="1098" Pth="{P1}/Field(ID = 'MCD_Startdate2')"/><CP ID="1099" Pth="{P1}/Field(ID = 'MCD_Enddate1')"/><CP ID="1100" Pth="{P1}/Field(ID = 'MCD_Enddate2')"/><CP ID="1134" Pth="{P1}/Field(ID = 'COBUpdateDate_1')"/><CP ID="1135" Pth="{P1}/Field(ID = 'COBUpdateDate_2')"/><CP ID="1136" Pth="{P1}/Field(ID = 'COBStartdate_1')"/><CP ID="1137" Pth="{P1}/Field(ID = 'COBStartdate_2')"/><CP ID="1138" Pth="{P1}/Field(ID = 'COBEnddate_1')"/><CP ID="1139" Pth="{P1}/Field(ID = 'COBEnddate_2')"/><CP ID="1166" Pth="{P1}/Field(ID = 'DisabledFlag_1')"/><CP ID="1167" Pth="{P1}/Field(ID = 'DisabledFlag_2')"/><CP ID="1168" Pth="{P1}/Field(ID = 'DisabledFlagStartDate_1')"/><CP ID="1169" Pth="{P1}/Field(ID = 'DisabledFlagStartDate_2')"/><CP ID="1170" Pth="{P1}/Field(ID = 'DisabledFlagEndDate_1')"/><CP ID="1171" Pth="{P1}/Field(ID = 'DisabledFlagEndDate_2')"/><CP ID="1180" Pth="{P1}/Field(ID = 'NameofOtherCoverage_1')"/><CP ID="1181" Pth="{P1}/Field(ID = 'NameofOtherInsuranceCompany_1')"/><CP ID="1187" Pth="{P1}/Field(ID = 'NameofOtherCoverage_2')"/><CP ID="1190" Pth="{P1}/Field(ID = 'SubscriberIDofOtherCoverage_1')"/><CP ID="1191" Pth="{P1}/Field(ID = 'SubscriberIDofOtherCoverage_2')"/><CP ID="1194" Pth="{P1}/Field(ID = 'GroupIDofotherCoverage_1')"/><CP ID="1195" Pth="{P1}/Field(ID = 'GroupIDofotherCoverage_2')"/><CP ID="1209" Pth="{P1}/Field(ID = 'KindofOtherInsurance_1')"/><CP ID="1210" Pth="{P1}/Field(ID = 'KindofOtherInsurance_2')"/><CP ID="1218" Pth="{P1}/Field(ID = 'NameofOtherInsuranceCompany_2')"/><CP ID="1221" Pth="{P1}/Field(ID = 'Endofrecord')"/><CP ID="1225" Pth="{P1}/Field(ID = 'BenefitPlanStartDate_1')"/><CP ID="1226" Pth="{P1}/Field(ID = 'BenefitPlanStartDate_2')"/><CP ID="1227" Pth="{P1}/Field(ID = 'BenefitPlanStartDate_3')"/><CP ID="1231" Pth="{P1}/Field(ID = 'BenefitPlanEndDate_1')"/><CP ID="1232" Pth="{P1}/Field(ID = 'BenefitPlanEndDate_2')"/><CP ID="1233" Pth="{P1}/Field(ID = 'BenefitPlanEndDate_3')"/><CP ID="1266" Pth="{P1}/Field(ID = 'Subscriber ID')"/><CP ID="1296" Pth="{P1}/Field(ID = 'BenefitPlanStartDate_4')"/><CP ID="1297" Pth="{P1}/Field(ID = 'BenefitPlanStartDate_5')"/><CP ID="1298" Pth="{P1}/Field(ID = 'BenefitPlanStartDate_6')"/><CP ID="1299" Pth="{P1}/Field(ID = 'BenefitPlanStartDate_7')"/><CP ID="1300" Pth="{P1}/Field(ID = 'BenefitPlanStartDate_8')"/><CP ID="1301" Pth="{P1}/Field(ID = 'BenefitPlanStartDate_9')"/><CP ID="1302" Pth="{P1}/Field(ID = 'BenefitPlanStartDate_10')"/><CP ID="1303" Pth="{P1}/Field(ID = 'BenefitPlanEndDate_4')"/><CP ID="1304" Pth="{P1}/Field(ID = 'BenefitPlanEndDate_5')"/><CP ID="1305" Pth="{P1}/Field(ID = 'BenefitPlanEndDate_6')"/><CP ID="1306" Pth="{P1}/Field(ID = 'BenefitPlanEndDate_7')"/><CP ID="1307" Pth="{P1}/Field(ID = 'BenefitPlanEndDate_8')"/><CP ID="1308" Pth="{P1}/Field(ID = 'BenefitPlanEndDate_9')"/><CP ID="1309" Pth="{P1}/Field(ID = 'BenefitPlanEndDate_10')"/><CP ID="1310" Pth="{P1}/Field(ID = 'ContractNumber_4')"/><CP ID="1311" Pth="{P1}/Field(ID = 'ContractNumber_5')"/><CP ID="1312" Pth="{P1}/Field(ID = 'ContractNumber_6')"/><CP ID="1313" Pth="{P1}/Field(ID = 'ContractNumber_7')"/><CP ID="1314" Pth="{P1}/Field(ID = 'ContractNumber_8')"/><CP ID="1315" Pth="{P1}/Field(ID = 'ContractNumber_9')"/><CP ID="1316" Pth="{P1}/Field(ID = 'ContractNumber_10')"/><CP ID="1317" Pth="{P1}/Field(ID = 'PBPNumber_4')"/><CP ID="1318" Pth="{P1}/Field(ID = 'PBPNumber_5')"/><CP ID="1319" Pth="{P1}/Field(ID = 'PBPNumber_6')"/><CP ID="1320" Pth="{P1}/Field(ID = 'PBPNumber_7')"/><CP ID="1321" Pth="{P1}/Field(ID = 'PBPNumber_8')"/><CP ID="1322" Pth="{P1}/Field(ID = 'PBPNumber_9')"/><CP ID="1323" Pth="{P1}/Field(ID = 'PBPNumber_10')"/><CP ID="1331" Pth="{P1}/Field(ID = 'GroupID_4')"/><CP ID="1332" Pth="{P1}/Field(ID = 'GroupID_5')"/><CP ID="1333" Pth="{P1}/Field(ID = 'GroupID_6')"/><CP ID="1334" Pth="{P1}/Field(ID = 'GroupID_7')"/><CP ID="1335" Pth="{P1}/Field(ID = 'GroupID_8')"/><CP ID="1336" Pth="{P1}/Field(ID = 'GroupID_9')"/><CP ID="1337" Pth="{P1}/Field(ID = 'GroupID_10')"/><CP ID="1359" Pth="{P1}/Field(ID = 'DisenrollmentReasoncode_DRC_4')"/><CP ID="1360" Pth="{P1}/Field(ID = 'DisenrollmentReasoncode_DRC_5')"/><CP ID="1361" Pth="{P1}/Field(ID = 'DisenrollmentReasoncode_DRC_6')"/><CP ID="1362" Pth="{P1}/Field(ID = 'DisenrollmentReasoncode_DRC_7')"/><CP ID="1363" Pth="{P1}/Field(ID = 'DisenrollmentReasoncode_DRC_8')"/><CP ID="1364" Pth="{P1}/Field(ID = 'DisenrollmentReasoncode_DRC_9')"/><CP ID="1365" Pth="{P1}/Field(ID = 'DisenrollmentReasoncode_DRC_10')"/><CP ID="1366" Pth="{P1}/Field(ID = 'ElectionType_4')"/><CP ID="1367" Pth="{P1}/Field(ID = 'ElectionType_5')"/><CP ID="1368" Pth="{P1}/Field(ID = 'ElectionType_6')"/><CP ID="1369" Pth="{P1}/Field(ID = 'ElectionType_7')"/><CP ID="1370" Pth="{P1}/Field(ID = 'ElectionType_8')"/><CP ID="1371" Pth="{P1}/Field(ID = 'ElectionType_9')"/><CP ID="1372" Pth="{P1}/Field(ID = 'ElectionType_10')"/><CP ID="1373" Pth="{P1}/Field(ID = 'SignatureDate_4')"/><CP ID="1374" Pth="{P1}/Field(ID = 'SignatureDate_5')"/><CP ID="1375" Pth="{P1}/Field(ID = 'SignatureDate_6')"/><CP ID="1376" Pth="{P1}/Field(ID = 'SignatureDate_7')"/><CP ID="1377" Pth="{P1}/Field(ID = 'SignatureDate_8')"/><CP ID="1378" Pth="{P1}/Field(ID = 'SignatureDate_9')"/><CP ID="1379" Pth="{P1}/Field(ID = 'SignatureDate_10')"/><CP ID="1404" Pth="{P1}/Field(ID = 'ProviderNumber_3')"/><CP ID="1405" Pth="{P1}/Field(ID = 'ProviderNumber_4')"/><CP ID="1406" Pth="{P1}/Field(ID = 'ProviderNumber_5')"/><CP ID="1407" Pth="{P1}/Field(ID = 'ProviderNumber_6')"/><CP ID="1408" Pth="{P1}/Field(ID = 'ProviderNumber_7')"/><CP ID="1409" Pth="{P1}/Field(ID = 'ProviderNumber_8')"/><CP ID="1410" Pth="{P1}/Field(ID = 'ProviderNumber_9')"/><CP ID="1411" Pth="{P1}/Field(ID = 'ProviderNumber_10')"/><CP ID="1412" Pth="{P1}/Field(ID = 'PCP_Startdate3')"/><CP ID="1413" Pth="{P1}/Field(ID = 'PCP_Startdate4')"/><CP ID="1414" Pth="{P1}/Field(ID = 'PCP_Startdate5')"/><CP ID="1415" Pth="{P1}/Field(ID = 'PCP_Startdate6')"/><CP ID="1416" Pth="{P1}/Field(ID = 'PCP_Startdate7')"/><CP ID="1417" Pth="{P1}/Field(ID = 'PCP_Startdate8')"/><CP ID="1418" Pth="{P1}/Field(ID = 'PCP_Startdate9')"/><CP ID="1419" Pth="{P1}/Field(ID = 'PCP_Startdate10')"/><CP ID="1420" Pth="{P1}/Field(ID = 'PCP_Enddate3')"/><CP ID="1421" Pth="{P1}/Field(ID = 'PCP_Enddate4')"/><CP ID="1422" Pth="{P1}/Field(ID = 'PCP_Enddate5')"/><CP ID="1423" Pth="{P1}/Field(ID = 'PCP_Enddate6')"/><CP ID="1424" Pth="{P1}/Field(ID = 'PCP_Enddate7')"/><CP ID="1425" Pth="{P1}/Field(ID = 'PCP_Enddate8')"/><CP ID="1426" Pth="{P1}/Field(ID = 'PCP_Enddate9')"/><CP ID="1427" Pth="{P1}/Field(ID = 'PCP_Enddate10')"/><CP ID="1476" Pth="{P1}/Field(ID = 'LEPNumberofUncoveredMonths_3')"/><CP ID="1477" Pth="{P1}/Field(ID = 'LEPNumberofUncoveredMonths_4')"/><CP ID="1478" Pth="{P1}/Field(ID = 'LEPNumberofUncoveredMonths_5')"/><CP ID="1479" Pth="{P1}/Field(ID = 'LEPNumberofUncoveredMonths_6')"/><CP ID="1480" Pth="{P1}/Field(ID = 'LEPNumberofUncoveredMonths_7')"/><CP ID="1481" Pth="{P1}/Field(ID = 'LEPNumberofUncoveredMonths_8')"/><CP ID="1482" Pth="{P1}/Field(ID = 'LEPNumberofUncoveredMonths_9')"/><CP ID="1483" Pth="{P1}/Field(ID = 'LEPNumberofUncoveredMonths_10')"/><CP ID="1484" Pth="{P1}/Field(ID = 'PartDLEPAmount_3')"/><CP ID="1485" Pth="{P1}/Field(ID = 'PartDLEPAmount_4')"/><CP ID="1486" Pth="{P1}/Field(ID = 'PartDLEPAmount_5')"/><CP ID="1487" Pth="{P1}/Field(ID = 'PartDLEPAmount_6')"/><CP ID="1488" Pth="{P1}/Field(ID = 'PartDLEPAmount_7')"/><CP ID="1489" Pth="{P1}/Field(ID = 'PartDLEPAmount_8')"/><CP ID="1490" Pth="{P1}/Field(ID = 'PartDLEPAmount_9')"/><CP ID="1491" Pth="{P1}/Field(ID = 'PartDLEPAmount_10')"/><CP ID="1492" Pth="{P1}/Field(ID = 'PartDLEPWaivedAmount_10')"/><CP ID="1493" Pth="{P1}/Field(ID = 'PartDLEPWaivedAmount_9')"/><CP ID="1494" Pth="{P1}/Field(ID = 'PartDLEPWaivedAmount_8')"/><CP ID="1495" Pth="{P1}/Field(ID = 'PartDLEPWaivedAmount_7')"/><CP ID="1496" Pth="{P1}/Field(ID = 'PartDLEPWaivedAmount_6')"/><CP ID="1497" Pth="{P1}/Field(ID = 'PartDLEPWaivedAmount_5')"/><CP ID="1498" Pth="{P1}/Field(ID = 'PartDLEPWaivedAmount_4')"/><CP ID="1499" Pth="{P1}/Field(ID = 'PartDLEPWaivedAmount_3')"/><CP ID="1500" Pth="{P1}/Field(ID = 'PartDLEPSubsidyAmount_3')"/><CP ID="1501" Pth="{P1}/Field(ID = 'PartDLEPSubsidyAmount_4')"/><CP ID="1502" Pth="{P1}/Field(ID = 'PartDLEPSubsidyAmount_5')"/><CP ID="1503" Pth="{P1}/Field(ID = 'PartDLEPSubsidyAmount_6')"/><CP ID="1504" Pth="{P1}/Field(ID = 'PartDLEPSubsidyAmount_7')"/><CP ID="1505" Pth="{P1}/Field(ID = 'PartDLEPSubsidyAmount_8')"/><CP ID="1506" Pth="{P1}/Field(ID = 'PartDLEPSubsidyAmount_9')"/><CP ID="1507" Pth="{P1}/Field(ID = 'PartDLEPSubsidyAmount_10')"/><CP ID="1508" Pth="{P1}/Field(ID = 'PartDLEPStartdate10')"/><CP ID="1509" Pth="{P1}/Field(ID = 'PartDLEPStartdate9')"/><CP ID="1510" Pth="{P1}/Field(ID = 'PartDLEPStartdate8')"/><CP ID="1511" Pth="{P1}/Field(ID = 'PartDLEPStartdate7')"/><CP ID="1512" Pth="{P1}/Field(ID = 'PartDLEPStartdate6')"/><CP ID="1513" Pth="{P1}/Field(ID = 'PartDLEPStartdate5')"/><CP ID="1514" Pth="{P1}/Field(ID = 'PartDLEPStartdate4')"/><CP ID="1515" Pth="{P1}/Field(ID = 'PartDLEPStartdate3')"/><CP ID="1516" Pth="{P1}/Field(ID = 'PartDLEPEnddate3')"/><CP ID="1517" Pth="{P1}/Field(ID = 'PartDLEPEnddate4')"/><CP ID="1518" Pth="{P1}/Field(ID = 'PartDLEPEnddate5')"/><CP ID="1519" Pth="{P1}/Field(ID = 'PartDLEPEnddate6')"/><CP ID="1520" Pth="{P1}/Field(ID = 'PartDLEPEnddate7')"/><CP ID="1521" Pth="{P1}/Field(ID = 'PartDLEPEnddate8')"/><CP ID="1522" Pth="{P1}/Field(ID = 'PartDLEPEnddate9')"/><CP ID="1523" Pth="{P1}/Field(ID = 'PartDLEPEnddate10')"/><CP ID="1564" Pth="{P1}/Field(ID = 'CurrentLISPremiumSubsidy_3')"/><CP ID="1565" Pth="{P1}/Field(ID = 'CurrentLISPremiumSubsidy_4')"/><CP ID="1566" Pth="{P1}/Field(ID = 'CurrentLISPremiumSubsidy_5')"/><CP ID="1567" Pth="{P1}/Field(ID = 'CurrentLISPremiumSubsidy_6')"/><CP ID="1568" Pth="{P1}/Field(ID = 'CurrentLISPremiumSubsidy_7')"/><CP ID="1569" Pth="{P1}/Field(ID = 'CurrentLISPremiumSubsidy_8')"/><CP ID="1570" Pth="{P1}/Field(ID = 'CurrentLISPremiumSubsidy_9')"/><CP ID="1571" Pth="{P1}/Field(ID = 'CurrentLISPremiumSubsidy_10')"/><CP ID="1572" Pth="{P1}/Field(ID = 'PartDLISSubsidyLevel_10')"/><CP ID="1573" Pth="{P1}/Field(ID = 'PartDLISSubsidyLevel_9')"/><CP ID="1574" Pth="{P1}/Field(ID = 'PartDLISSubsidyLevel_8')"/><CP ID="1575" Pth="{P1}/Field(ID = 'PartDLISSubsidyLevel_7')"/><CP ID="1576" Pth="{P1}/Field(ID = 'PartDLISSubsidyLevel_6')"/><CP ID="1577" Pth="{P1}/Field(ID = 'PartDLISSubsidyLevel_5')"/><CP ID="1578" Pth="{P1}/Field(ID = 'PartDLISSubsidyLevel_4')"/><CP ID="1579" Pth="{P1}/Field(ID = 'PartDLISSubsidyLevel_3')"/><CP ID="1580" Pth="{P1}/Field(ID = 'PartDLISCopayCategory_3')"/><CP ID="1581" Pth="{P1}/Field(ID = 'PartDLISCopayCategory_4')"/><CP ID="1582" Pth="{P1}/Field(ID = 'PartDLISCopayCategory_5')"/><CP ID="1583" Pth="{P1}/Field(ID = 'PartDLISCopayCategory_6')"/><CP ID="1584" Pth="{P1}/Field(ID = 'PartDLISCopayCategory_7')"/><CP ID="1585" Pth="{P1}/Field(ID = 'PartDLISCopayCategory_8')"/><CP ID="1586" Pth="{P1}/Field(ID = 'PartDLISCopayCategory_9')"/><CP ID="1587" Pth="{P1}/Field(ID = 'PartDLISCopayCategory_10')"/><CP ID="1588" Pth="{P1}/Field(ID = 'PartDLISStartdate10')"/><CP ID="1589" Pth="{P1}/Field(ID = 'PartDLISStartdate9')"/><CP ID="1590" Pth="{P1}/Field(ID = 'PartDLISStartdate8')"/><CP ID="1591" Pth="{P1}/Field(ID = 'PartDLISStartdate7')"/><CP ID="1592" Pth="{P1}/Field(ID = 'PartDLISStartdate6')"/><CP ID="1593" Pth="{P1}/Field(ID = 'PartDLISStartdate5')"/><CP ID="1594" Pth="{P1}/Field(ID = 'PartDLISStartdate4')"/><CP ID="1595" Pth="{P1}/Field(ID = 'PartDLISStartdate3')"/><CP ID="1596" Pth="{P1}/Field(ID = 'PartDLISEnddate3')"/><CP ID="1597" Pth="{P1}/Field(ID = 'PartDLISEnddate4')"/><CP ID="1598" Pth="{P1}/Field(ID = 'PartDLISEnddate5')"/><CP ID="1599" Pth="{P1}/Field(ID = 'PartDLISEnddate6')"/><CP ID="1600" Pth="{P1}/Field(ID = 'PartDLISEnddate7')"/><CP ID="1601" Pth="{P1}/Field(ID = 'PartDLISEnddate8')"/><CP ID="1602" Pth="{P1}/Field(ID = 'PartDLISEnddate9')"/><CP ID="1603" Pth="{P1}/Field(ID = 'PartDLISEnddate10')"/><CP ID="1636" Pth="{P1}/Field(ID = 'PaymentMethodType_3')"/><CP ID="1637" Pth="{P1}/Field(ID = 'PaymentMethodType_4')"/><CP ID="1638" Pth="{P1}/Field(ID = 'PaymentMethodType_5')"/><CP ID="1639" Pth="{P1}/Field(ID = 'PaymentMethodType_6')"/><CP ID="1640" Pth="{P1}/Field(ID = 'PaymentMethodType_7')"/><CP ID="1641" Pth="{P1}/Field(ID = 'PaymentMethodType_8')"/><CP ID="1642" Pth="{P1}/Field(ID = 'PremiumWithholdOption_9')"/><CP ID="1643" Pth="{P1}/Field(ID = 'PaymentMethodType_9')"/><CP ID="1644" Pth="{P1}/Field(ID = 'PaymentMethodType_10')"/><CP ID="1645" Pth="{P1}/Field(ID = 'PremiumWithholdOption_10')"/><CP ID="1646" Pth="{P1}/Field(ID = 'PremiumWithholdOption_8')"/><CP ID="1647" Pth="{P1}/Field(ID = 'PremiumWithholdOption_7')"/><CP ID="1648" Pth="{P1}/Field(ID = 'PremiumWithholdOption_6')"/><CP ID="1649" Pth="{P1}/Field(ID = 'PremiumWithholdOption_5')"/><CP ID="1650" Pth="{P1}/Field(ID = 'PremiumWithholdOption_3')"/><CP ID="1651" Pth="{P1}/Field(ID = 'PremiumWithholdOption_4')"/><CP ID="1652" Pth="{P1}/Field(ID = 'PWOStartdate_10')"/><CP ID="1653" Pth="{P1}/Field(ID = 'PWOStartdate_9')"/><CP ID="1654" Pth="{P1}/Field(ID = 'PWOStartdate_8')"/><CP ID="1655" Pth="{P1}/Field(ID = 'PWOStartdate_7')"/><CP ID="1656" Pth="{P1}/Field(ID = 'PWOStartdate_6')"/><CP ID="1657" Pth="{P1}/Field(ID = 'PWOEnddate_3')"/><CP ID="1658" Pth="{P1}/Field(ID = 'PWOStartdate_5')"/><CP ID="1659" Pth="{P1}/Field(ID = 'PWOStartdate_4')"/><CP ID="1660" Pth="{P1}/Field(ID = 'PWOStartdate_3')"/><CP ID="1661" Pth="{P1}/Field(ID = 'PWOEnddate_4')"/><CP ID="1662" Pth="{P1}/Field(ID = 'PWOEnddate_5')"/><CP ID="1663" Pth="{P1}/Field(ID = 'PWOEnddate_6')"/><CP ID="1664" Pth="{P1}/Field(ID = 'PWOEnddate_7')"/><CP ID="1665" Pth="{P1}/Field(ID = 'PWOEnddate_8')"/><CP ID="1666" Pth="{P1}/Field(ID = 'PWOEnddate_9')"/><CP ID="1667" Pth="{P1}/Field(ID = 'PWOEnddate_10')"/><CP ID="1692" Pth="{P1}/Field(ID = 'HospiceFlag_3')"/><CP ID="1693" Pth="{P1}/Field(ID = 'HospiceFlag_4')"/><CP ID="1694" Pth="{P1}/Field(ID = 'HospiceFlag_5')"/><CP ID="1695" Pth="{P1}/Field(ID = 'HospiceFlag_6')"/><CP ID="1696" Pth="{P1}/Field(ID = 'HospiceFlag_7')"/><CP ID="1697" Pth="{P1}/Field(ID = 'HospiceFlag_8')"/><CP ID="1698" Pth="{P1}/Field(ID = 'HospiceFlag_9')"/><CP ID="1699" Pth="{P1}/Field(ID = 'HospiceFlag_10')"/><CP ID="1700" Pth="{P1}/Field(ID = 'HospiceFlagStartdate_3')"/><CP ID="1701" Pth="{P1}/Field(ID = 'HospiceFlagStartdate_4')"/><CP ID="1702" Pth="{P1}/Field(ID = 'HospiceFlagStartdate_5')"/><CP ID="1703" Pth="{P1}/Field(ID = 'HospiceFlagStartdate_6')"/><CP ID="1704" Pth="{P1}/Field(ID = 'HospiceFlagStartdate_7')"/><CP ID="1705" Pth="{P1}/Field(ID = 'HospiceFlagStartdate_8')"/><CP ID="1706" Pth="{P1}/Field(ID = 'HospiceFlagStartdate_9')"/><CP ID="1707" Pth="{P1}/Field(ID = 'HospiceFlagStartdate_10')"/><CP ID="1708" Pth="{P1}/Field(ID = 'HospiceFlagEnddate_3')"/><CP ID="1709" Pth="{P1}/Field(ID = 'HospiceFlagEnddate_4')"/><CP ID="1710" Pth="{P1}/Field(ID = 'HospiceFlagEnddate_5')"/><CP ID="1711" Pth="{P1}/Field(ID = 'HospiceFlagEnddate_6')"/><CP ID="1712" Pth="{P1}/Field(ID = 'HospiceFlagEnddate_7')"/><CP ID="1713" Pth="{P1}/Field(ID = 'HospiceFlagEnddate_8')"/><CP ID="1714" Pth="{P1}/Field(ID = 'HospiceFlagEnddate_9')"/><CP ID="1715" Pth="{P1}/Field(ID = 'HospiceFlagEnddate_10')"/><CP ID="1740" Pth="{P1}/Field(ID = 'MedicaidFlag_3')"/><CP ID="1741" Pth="{P1}/Field(ID = 'MedicaidFlag_4')"/><CP ID="1742" Pth="{P1}/Field(ID = 'MedicaidFlag_5')"/><CP ID="1743" Pth="{P1}/Field(ID = 'MedicaidFlag_6')"/><CP ID="1744" Pth="{P1}/Field(ID = 'MedicaidFlag_7')"/><CP ID="1745" Pth="{P1}/Field(ID = 'MedicaidFlag_8')"/><CP ID="1746" Pth="{P1}/Field(ID = 'MedicaidFlag_9')"/><CP ID="1747" Pth="{P1}/Field(ID = 'MedicaidFlag_10')"/><CP ID="1748" Pth="{P1}/Field(ID = 'MedicaidFlagStratDate_3')"/><CP ID="1749" Pth="{P1}/Field(ID = 'MedicaidFlagStratDate_4')"/><CP ID="1750" Pth="{P1}/Field(ID = 'MedicaidFlagStratDate_5')"/><CP ID="1751" Pth="{P1}/Field(ID = 'MedicaidFlagStratDate_6')"/><CP ID="1752" Pth="{P1}/Field(ID = 'MedicaidFlagStratDate_7')"/><CP ID="1753" Pth="{P1}/Field(ID = 'MedicaidFlagStratDate_8')"/><CP ID="1754" Pth="{P1}/Field(ID = 'MedicaidFlagStratDate_9')"/><CP ID="1755" Pth="{P1}/Field(ID = 'MedicaidFlagStratDate_10')"/><CP ID="1756" Pth="{P1}/Field(ID = 'MedicaidFlagEndDate_3')"/><CP ID="1757" Pth="{P1}/Field(ID = 'MedicaidFlagEndDate_4')"/><CP ID="1758" Pth="{P1}/Field(ID = 'MedicaidFlagEndDate_5')"/><CP ID="1759" Pth="{P1}/Field(ID = 'MedicaidFlagEndDate_6')"/><CP ID="1760" Pth="{P1}/Field(ID = 'MedicaidFlagEndDate_7')"/><CP ID="1761" Pth="{P1}/Field(ID = 'MedicaidFlagEndDate_8')"/><CP ID="1762" Pth="{P1}/Field(ID = 'MedicaidFlagEndDate_9')"/><CP ID="1763" Pth="{P1}/Field(ID = 'MedicaidFlagEndDate_10')"/><CP ID="1788" Pth="{P1}/Field(ID = 'InstitutionalFlag_3')"/><CP ID="1789" Pth="{P1}/Field(ID = 'InstitutionalFlag_4')"/><CP ID="1790" Pth="{P1}/Field(ID = 'InstitutionalFlag_5')"/><CP ID="1791" Pth="{P1}/Field(ID = 'InstitutionalFlag_6')"/><CP ID="1792" Pth="{P1}/Field(ID = 'InstitutionalFlag_7')"/><CP ID="1793" Pth="{P1}/Field(ID = 'InstitutionalFlag_8')"/><CP ID="1794" Pth="{P1}/Field(ID = 'InstitutionalFlag_9')"/><CP ID="1795" Pth="{P1}/Field(ID = 'InstitutionalFlag_10')"/><CP ID="1796" Pth="{P1}/Field(ID = 'InstitutionalFlagStartDate_3')"/><CP ID="1797" Pth="{P1}/Field(ID = 'InstitutionalFlagStartDate_4')"/><CP ID="1798" Pth="{P1}/Field(ID = 'InstitutionalFlagStartDate_5')"/><CP ID="1799" Pth="{P1}/Field(ID = 'InstitutionalFlagStartDate_6')"/><CP ID="1800" Pth="{P1}/Field(ID = 'InstitutionalFlagStartDate_7')"/><CP ID="1801" Pth="{P1}/Field(ID = 'InstitutionalFlagStartDate_8')"/><CP ID="1802" Pth="{P1}/Field(ID = 'InstitutionalFlagStartDate_9')"/><CP ID="1803" Pth="{P1}/Field(ID = 'InstitutionalFlagStartDate_10')"/><CP ID="1804" Pth="{P1}/Field(ID = 'InstitutionalFlagEndDate_3')"/><CP ID="1805" Pth="{P1}/Field(ID = 'InstitutionalFlagEndDate_4')"/><CP ID="1806" Pth="{P1}/Field(ID = 'InstitutionalFlagEndDate_5')"/><CP ID="1807" Pth="{P1}/Field(ID = 'InstitutionalFlagEndDate_6')"/><CP ID="1808" Pth="{P1}/Field(ID = 'InstitutionalFlagEndDate_7')"/><CP ID="1809" Pth="{P1}/Field(ID = 'InstitutionalFlagEndDate_8')"/><CP ID="1810" Pth="{P1}/Field(ID = 'InstitutionalFlagEndDate_9')"/><CP ID="1811" Pth="{P1}/Field(ID = 'InstitutionalFlagEndDate_10')"/><CP ID="1836" Pth="{P1}/Field(ID = 'TransplantFlag_3')"/><CP ID="1837" Pth="{P1}/Field(ID = 'TransplantFlag_4')"/><CP ID="1838" Pth="{P1}/Field(ID = 'TransplantFlag_5')"/><CP ID="1839" Pth="{P1}/Field(ID = 'TransplantFlag_6')"/><CP ID="1840" Pth="{P1}/Field(ID = 'TransplantFlag_7')"/><CP ID="1841" Pth="{P1}/Field(ID = 'TransplantFlag_8')"/><CP ID="1842" Pth="{P1}/Field(ID = 'TransplantFlag_9')"/><CP ID="1843" Pth="{P1}/Field(ID = 'TransplantFlag_10')"/><CP ID="1844" Pth="{P1}/Field(ID = 'TransplantFlagStartDate_3')"/><CP ID="1845" Pth="{P1}/Field(ID = 'TransplantFlagStartDate_4')"/><CP ID="1846" Pth="{P1}/Field(ID = 'TransplantFlagStartDate_5')"/><CP ID="1847" Pth="{P1}/Field(ID = 'TransplantFlagStartDate_6')"/><CP ID="1848" Pth="{P1}/Field(ID = 'TransplantFlagStartDate_7')"/><CP ID="1849" Pth="{P1}/Field(ID = 'TransplantFlagStartDate_8')"/><CP ID="1850" Pth="{P1}/Field(ID = 'TransplantFlagStartDate_9')"/><CP ID="1851" Pth="{P1}/Field(ID = 'TransplantFlagStartDate_10')"/><CP ID="1852" Pth="{P1}/Field(ID = 'TransplantFlagEndDate_3')"/><CP ID="1853" Pth="{P1}/Field(ID = 'TransplantFlagEndDate_4')"/><CP ID="1854" Pth="{P1}/Field(ID = 'TransplantFlagEndDate_5')"/><CP ID="1855" Pth="{P1}/Field(ID = 'TransplantFlagEndDate_6')"/><CP ID="1856" Pth="{P1}/Field(ID = 'TransplantFlagEndDate_7')"/><CP ID="1857" Pth="{P1}/Field(ID = 'TransplantFlagEndDate_8')"/><CP ID="1858" Pth="{P1}/Field(ID = 'TransplantFlagEndDate_9')"/><CP ID="1859" Pth="{P1}/Field(ID = 'TransplantFlagEndDate_10')"/><CP ID="1884" Pth="{P1}/Field(ID = 'DialysisFlag_3')"/><CP ID="1885" Pth="{P1}/Field(ID = 'DialysisFlag_4')"/><CP ID="1886" Pth="{P1}/Field(ID = 'DialysisFlag_5')"/><CP ID="1887" Pth="{P1}/Field(ID = 'DialysisFlag_6')"/><CP ID="1888" Pth="{P1}/Field(ID = 'DialysisFlag_7')"/><CP ID="1889" Pth="{P1}/Field(ID = 'DialysisFlag_8')"/><CP ID="1890" Pth="{P1}/Field(ID = 'DialysisFlag_9')"/><CP ID="1891" Pth="{P1}/Field(ID = 'DialysisFlag_10')"/><CP ID="1892" Pth="{P1}/Field(ID = 'DialysisFlagStartDate_3')"/><CP ID="1893" Pth="{P1}/Field(ID = 'DialysisFlagStartDate_4')"/><CP ID="1894" Pth="{P1}/Field(ID = 'DialysisFlagStartDate_5')"/><CP ID="1895" Pth="{P1}/Field(ID = 'DialysisFlagStartDate_6')"/><CP ID="1896" Pth="{P1}/Field(ID = 'DialysisFlagStartDate_7')"/><CP ID="1897" Pth="{P1}/Field(ID = 'DialysisFlagStartDate_8')"/><CP ID="1898" Pth="{P1}/Field(ID = 'DialysisFlagStartDate_9')"/><CP ID="1899" Pth="{P1}/Field(ID = 'DialysisFlagStartDate_10')"/><CP ID="1900" Pth="{P1}/Field(ID = 'DialysisFlagEndDate_3')"/><CP ID="1901" Pth="{P1}/Field(ID = 'DialysisFlagEndDate_4')"/><CP ID="1902" Pth="{P1}/Field(ID = 'DialysisFlagEndDate_5')"/><CP ID="1903" Pth="{P1}/Field(ID = 'DialysisFlagEndDate_6')"/><CP ID="1904" Pth="{P1}/Field(ID = 'DialysisFlagEndDate_7')"/><CP ID="1905" Pth="{P1}/Field(ID = 'DialysisFlagEndDate_8')"/><CP ID="1906" Pth="{P1}/Field(ID = 'DialysisFlagEndDate_9')"/><CP ID="1907" Pth="{P1}/Field(ID = 'DialysisFlagEndDate_10')"/><CP ID="1932" Pth="{P1}/Field(ID = 'ESRDFlagEndDate_10')"/><CP ID="1933" Pth="{P1}/Field(ID = 'ESRDFlagEndDate_9')"/><CP ID="1934" Pth="{P1}/Field(ID = 'ESRDFlagEndDate_8')"/><CP ID="1935" Pth="{P1}/Field(ID = 'ESRDFlagEndDate_7')"/><CP ID="1936" Pth="{P1}/Field(ID = 'ESRDFlagEndDate_6')"/><CP ID="1937" Pth="{P1}/Field(ID = 'ESRDFlagEndDate_5')"/><CP ID="1938" Pth="{P1}/Field(ID = 'ESRDFlagEndDate_4')"/><CP ID="1939" Pth="{P1}/Field(ID = 'ESRDFlagEndDate_3')"/><CP ID="1940" Pth="{P1}/Field(ID = 'ESRDFlagStartDate_10')"/><CP ID="1941" Pth="{P1}/Field(ID = 'ESRDFlagStartDate_9')"/><CP ID="1942" Pth="{P1}/Field(ID = 'ESRDFlagStartDate_8')"/><CP ID="1943" Pth="{P1}/Field(ID = 'ESRDFlagStartDate_7')"/><CP ID="1944" Pth="{P1}/Field(ID = 'ESRDFlagStartDate_6')"/><CP ID="1945" Pth="{P1}/Field(ID = 'ESRDFlagStartDate_5')"/><CP ID="1946" Pth="{P1}/Field(ID = 'ESRDFlagStartDate_4')"/><CP ID="1947" Pth="{P1}/Field(ID = 'ESRDFlagStartDate_3')"/><CP ID="1948" Pth="{P1}/Field(ID = 'ESRDFlag_3')"/><CP ID="1949" Pth="{P1}/Field(ID = 'ESRDFlag_4')"/><CP ID="1950" Pth="{P1}/Field(ID = 'ESRDFlag_5')"/><CP ID="1951" Pth="{P1}/Field(ID = 'ESRDFlag_6')"/><CP ID="1952" Pth="{P1}/Field(ID = 'ESRDFlag_7')"/><CP ID="1953" Pth="{P1}/Field(ID = 'ESRDFlag_8')"/><CP ID="1954" Pth="{P1}/Field(ID = 'ESRDFlag_9')"/><CP ID="1955" Pth="{P1}/Field(ID = 'ESRDFlag_10')"/><CP ID="1980" Pth="{P1}/Field(ID = 'DisabledFlagEndDate_10')"/><CP ID="1981" Pth="{P1}/Field(ID = 'DisabledFlagEndDate_9')"/><CP ID="1982" Pth="{P1}/Field(ID = 'DisabledFlagEndDate_8')"/><CP ID="1983" Pth="{P1}/Field(ID = 'DisabledFlagEndDate_7')"/><CP ID="1984" Pth="{P1}/Field(ID = 'DisabledFlagEndDate_6')"/><CP ID="1985" Pth="{P1}/Field(ID = 'DisabledFlagEndDate_5')"/><CP ID="1986" Pth="{P1}/Field(ID = 'DisabledFlagEndDate_4')"/><CP ID="1987" Pth="{P1}/Field(ID = 'DisabledFlagEndDate_3')"/><CP ID="1988" Pth="{P1}/Field(ID = 'DisabledFlagStartDate_10')"/><CP ID="1989" Pth="{P1}/Field(ID = 'DisabledFlagStartDate_9')"/><CP ID="1990" Pth="{P1}/Field(ID = 'DisabledFlagStartDate_8')"/><CP ID="1991" Pth="{P1}/Field(ID = 'DisabledFlagStartDate_7')"/><CP ID="1992" Pth="{P1}/Field(ID = 'DisabledFlagStartDate_6')"/><CP ID="1993" Pth="{P1}/Field(ID = 'DisabledFlagStartDate_5')"/><CP ID="1994" Pth="{P1}/Field(ID = 'DisabledFlagStartDate_4')"/><CP ID="1995" Pth="{P1}/Field(ID = 'DisabledFlagStartDate_3')"/><CP ID="1996" Pth="{P1}/Field(ID = 'DisabledFlag_3')"/><CP ID="1997" Pth="{P1}/Field(ID = 'DisabledFlag_4')"/><CP ID="1998" Pth="{P1}/Field(ID = 'DisabledFlag_5')"/><CP ID="1999" Pth="{P1}/Field(ID = 'DisabledFlag_6')"/><CP ID="2000" Pth="{P1}/Field(ID = 'DisabledFlag_7')"/><CP ID="2001" Pth="{P1}/Field(ID = 'DisabledFlag_8')"/><CP ID="2002" Pth="{P1}/Field(ID = 'DisabledFlag_9')"/><CP ID="2003" Pth="{P1}/Field(ID = 'DisabledFlag_10')"/><CP ID="2028" Pth="{P1}/Field(ID = 'MCD_Enddate10')"/><CP ID="2029" Pth="{P1}/Field(ID = 'MCD_Enddate9')"/><CP ID="2030" Pth="{P1}/Field(ID = 'MCD_Enddate8')"/><CP ID="2031" Pth="{P1}/Field(ID = 'MCD_Enddate7')"/><CP ID="2032" Pth="{P1}/Field(ID = 'MCD_Enddate6')"/><CP ID="2033" Pth="{P1}/Field(ID = 'MCD_Enddate5')"/><CP ID="2034" Pth="{P1}/Field(ID = 'MCD_Enddate4')"/><CP ID="2035" Pth="{P1}/Field(ID = 'MCD_Enddate3')"/><CP ID="2036" Pth="{P1}/Field(ID = 'MCD_Startdate10')"/><CP ID="2037" Pth="{P1}/Field(ID = 'MCD_Startdate9')"/><CP ID="2038" Pth="{P1}/Field(ID = 'MCD_Startdate8')"/><CP ID="2039" Pth="{P1}/Field(ID = 'MCD_Startdate7')"/><CP ID="2040" Pth="{P1}/Field(ID = 'MCD_Startdate6')"/><CP ID="2041" Pth="{P1}/Field(ID = 'MCD_Startdate5')"/><CP ID="2042" Pth="{P1}/Field(ID = 'MCD_Startdate4')"/><CP ID="2043" Pth="{P1}/Field(ID = 'MCD_Startdate3')"/><CP ID="2044" Pth="{P1}/Field(ID = 'DualStatusCode_10')"/><CP ID="2045" Pth="{P1}/Field(ID = 'DualStatusCode_9')"/><CP ID="2046" Pth="{P1}/Field(ID = 'DualStatusCode_8')"/><CP ID="2047" Pth="{P1}/Field(ID = 'DualStatusCode_7')"/><CP ID="2048" Pth="{P1}/Field(ID = 'DualStatusCode_6')"/><CP ID="2049" Pth="{P1}/Field(ID = 'DualStatusCode_5')"/><CP ID="2050" Pth="{P1}/Field(ID = 'DualStatusCode_4')"/><CP ID="2051" Pth="{P1}/Field(ID = 'DualStatusCode_3')"/><CP ID="2116" Pth="{P1}/Field(ID = 'NameofOtherCoverage_3')"/><CP ID="2117" Pth="{P1}/Field(ID = 'NameofOtherCoverage_4')"/><CP ID="2118" Pth="{P1}/Field(ID = 'NameofOtherCoverage_5')"/><CP ID="2119" Pth="{P1}/Field(ID = 'NameofOtherCoverage_6')"/><CP ID="2120" Pth="{P1}/Field(ID = 'NameofOtherCoverage_7')"/><CP ID="2121" Pth="{P1}/Field(ID = 'NameofOtherCoverage_8')"/><CP ID="2122" Pth="{P1}/Field(ID = 'NameofOtherCoverage_9')"/><CP ID="2123" Pth="{P1}/Field(ID = 'NameofOtherCoverage_10')"/><CP ID="2124" Pth="{P1}/Field(ID = 'SubscriberIDofOtherCoverage_10')"/><CP ID="2125" Pth="{P1}/Field(ID = 'SubscriberIDofOtherCoverage_9')"/><CP ID="2126" Pth="{P1}/Field(ID = 'SubscriberIDofOtherCoverage_8')"/><CP ID="2127" Pth="{P1}/Field(ID = 'SubscriberIDofOtherCoverage_7')"/><CP ID="2128" Pth="{P1}/Field(ID = 'SubscriberIDofOtherCoverage_6')"/><CP ID="2129" Pth="{P1}/Field(ID = 'SubscriberIDofOtherCoverage_5')"/><CP ID="2130" Pth="{P1}/Field(ID = 'SubscriberIDofOtherCoverage_4')"/><CP ID="2131" Pth="{P1}/Field(ID = 'SubscriberIDofOtherCoverage_3')"/><CP ID="2132" Pth="{P1}/Field(ID = 'COBUpdateDate_3')"/><CP ID="2133" Pth="{P1}/Field(ID = 'GroupIDofotherCoverage_3')"/><CP ID="2134" Pth="{P1}/Field(ID = 'GroupIDofotherCoverage_4')"/><CP ID="2135" Pth="{P1}/Field(ID = 'GroupIDofotherCoverage_5')"/><CP ID="2136" Pth="{P1}/Field(ID = 'GroupIDofotherCoverage_6')"/><CP ID="2137" Pth="{P1}/Field(ID = 'GroupIDofotherCoverage_7')"/><CP ID="2138" Pth="{P1}/Field(ID = 'GroupIDofotherCoverage_8')"/><CP ID="2139" Pth="{P1}/Field(ID = 'GroupIDofotherCoverage_9')"/><CP ID="2140" Pth="{P1}/Field(ID = 'GroupIDofotherCoverage_10')"/><CP ID="2141" Pth="{P1}/Field(ID = 'KindofOtherInsurance_10')"/><CP ID="2142" Pth="{P1}/Field(ID = 'KindofOtherInsurance_9')"/><CP ID="2143" Pth="{P1}/Field(ID = 'KindofOtherInsurance_8')"/><CP ID="2144" Pth="{P1}/Field(ID = 'KindofOtherInsurance_7')"/><CP ID="2145" Pth="{P1}/Field(ID = 'KindofOtherInsurance_6')"/><CP ID="2146" Pth="{P1}/Field(ID = 'KindofOtherInsurance_5')"/><CP ID="2147" Pth="{P1}/Field(ID = 'KindofOtherInsurance_4')"/><CP ID="2148" Pth="{P1}/Field(ID = 'KindofOtherInsurance_3')"/><CP ID="2149" Pth="{P1}/Field(ID = 'NameofOtherInsuranceCompany_3')"/><CP ID="2150" Pth="{P1}/Field(ID = 'NameofOtherInsuranceCompany_4')"/><CP ID="2151" Pth="{P1}/Field(ID = 'NameofOtherInsuranceCompany_5')"/><CP ID="2152" Pth="{P1}/Field(ID = 'NameofOtherInsuranceCompany_6')"/><CP ID="2153" Pth="{P1}/Field(ID = 'NameofOtherInsuranceCompany_7')"/><CP ID="2154" Pth="{P1}/Field(ID = 'NameofOtherInsuranceCompany_8')"/><CP ID="2155" Pth="{P1}/Field(ID = 'NameofOtherInsuranceCompany_9')"/><CP ID="2156" Pth="{P1}/Field(ID = 'NameofOtherInsuranceCompany_10')"/><CP ID="2157" Pth="{P1}/Field(ID = 'COBStartdate_10')"/><CP ID="2158" Pth="{P1}/Field(ID = 'COBStartdate_9')"/><CP ID="2159" Pth="{P1}/Field(ID = 'COBStartdate_8')"/><CP ID="2160" Pth="{P1}/Field(ID = 'COBStartdate_7')"/><CP ID="2161" Pth="{P1}/Field(ID = 'COBStartdate_6')"/><CP ID="2162" Pth="{P1}/Field(ID = 'COBUpdateDate_6')"/><CP ID="2163" Pth="{P1}/Field(ID = 'COBStartdate_5')"/><CP ID="2164" Pth="{P1}/Field(ID = 'COBStartdate_4')"/><CP ID="2165" Pth="{P1}/Field(ID = 'COBStartdate_3')"/><CP ID="2166" Pth="{P1}/Field(ID = 'COBUpdateDate_4')"/><CP ID="2167" Pth="{P1}/Field(ID = 'COBUpdateDate_5')"/><CP ID="2168" Pth="{P1}/Field(ID = 'COBUpdateDate_7')"/><CP ID="2169" Pth="{P1}/Field(ID = 'COBUpdateDate_8')"/><CP ID="2170" Pth="{P1}/Field(ID = 'COBUpdateDate_9')"/><CP ID="2171" Pth="{P1}/Field(ID = 'COBUpdateDate_10')"/><CP ID="2172" Pth="{P1}/Field(ID = 'COBEnddate_10')"/><CP ID="2173" Pth="{P1}/Field(ID = 'COBEnddate_9')"/><CP ID="2174" Pth="{P1}/Field(ID = 'COBEnddate_8')"/><CP ID="2175" Pth="{P1}/Field(ID = 'COBEnddate_7')"/><CP ID="2176" Pth="{P1}/Field(ID = 'COBEnddate_6')"/><CP ID="2177" Pth="{P1}/Field(ID = 'COBEnddate_5')"/><CP ID="2178" Pth="{P1}/Field(ID = 'COBEnddate_4')"/><CP ID="2179" Pth="{P1}/Field(ID = 'COBEnddate_3')"/><CP ID="2263" Pth="{P1}/Field(ID = 'M3PTermReason_1')"/><CP ID="2264" Pth="{P1}/Field(ID = 'M3PTermReason_2')"/><CP ID="2265" Pth="{P1}/Field(ID = 'M3PTermReason_3')"/><CP ID="2266" Pth="{P1}/Field(ID = 'M3PTermReason_4')"/><CP ID="2267" Pth="{P1}/Field(ID = 'M3PTermReason_5')"/><CP ID="2268" Pth="{P1}/Field(ID = 'M3PStartdate_1')"/><CP ID="2269" Pth="{P1}/Field(ID = 'M3PStartdate_2')"/><CP ID="2270" Pth="{P1}/Field(ID = 'M3PStartdate_3')"/><CP ID="2271" Pth="{P1}/Field(ID = 'M3PStartdate_4')"/><CP ID="2272" Pth="{P1}/Field(ID = 'M3PStartdate_5')"/><CP ID="2273" Pth="{P1}/Field(ID = 'M3PEnddate_1')"/><CP ID="2274" Pth="{P1}/Field(ID = 'M3PEnddate_2')"/><CP ID="2275" Pth="{P1}/Field(ID = 'M3PEnddate_3')"/><CP ID="2276" Pth="{P1}/Field(ID = 'M3PEnddate_4')"/><CP ID="2277" Pth="{P1}/Field(ID = 'M3PEnddate_5')"/><CP ID="2293" Pth="{P1}/Field(ID = 'GenderIdentity')"/><CP ID="2294" Pth="{P1}/Field(ID = 'SexualOrientation')"/><CP ID="2295" Pth="{P1}/Field(ID = 'AlternativeFormatDataCD')"/></CPs><ReverseConnectionPoints//></Targets><Fs><F ID="2" N="ClaimID" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">1</P><P N="if_1/conditions/expression_1/arg1/type">1</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">DEM</P><P N="if_1/actions/assignment_1/lvalue">18</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">17</P><P N="if_1/actions/assignment_1/rvalue/type">2</P></Ps><CPs><CP ID="17" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="18" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="3" T="ChangeVariable"><Ps C="S"><P N="variableID">1</P></Ps><CPs><CP ID="19" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="4" N="SubscriberFLG" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">1</P><P N="if_1/conditions/expression_1/arg1/type">1</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">DEM</P><P N="if_1/actions/assignment_1/lvalue">24</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">23</P><P N="if_1/actions/assignment_1/rvalue/type">2</P></Ps><CPs><CP ID="23" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="24" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="10" N="MBI" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">1</P><P N="if_1/conditions/expression_1/arg1/type">1</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">DEM</P><P N="if_1/actions/assignment_1/lvalue">36</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">37</P><P N="if_1/actions/assignment_1/rvalue/type">2</P></Ps><CPs><CP ID="37" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="36" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="11" N="Member_Details" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">1</P><P N="if_1/conditions/expression_1/arg1/type">1</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">DEM</P><P N="if_1/actions/assignment_1/lvalue">40</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">39</P><P N="if_1/actions/assignment_1/rvalue/type">2</P><P N="if_1/actions/assignment_2/lvalue">46</P><P N="if_1/actions/assignment_2/lvalue/type">2</P><P N="if_1/actions/assignment_2/rvalue">44</P><P N="if_1/actions/assignment_2/rvalue/type">2</P><P N="if_1/actions/assignment_3/lvalue">49</P><P N="if_1/actions/assignment_3/lvalue/type">2</P><P N="if_1/actions/assignment_3/rvalue">48</P><P N="if_1/actions/assignment_3/rvalue/type">2</P><P N="if_1/actions/assignment_4/lvalue">53</P><P N="if_1/actions/assignment_4/lvalue/type">2</P><P N="if_1/actions/assignment_4/rvalue">52</P><P N="if_1/actions/assignment_4/rvalue/type">2</P><P N="if_1/actions/assignment_5/lvalue">58</P><P N="if_1/actions/assignment_5/lvalue/type">2</P><P N="if_1/actions/assignment_5/rvalue">56</P><P N="if_1/actions/assignment_5/rvalue/type">2</P><P N="if_1/actions/assignment_6/lvalue">61</P><P N="if_1/actions/assignment_6/lvalue/type">2</P><P N="if_1/actions/assignment_6/rvalue">60</P><P N="if_1/actions/assignment_6/rvalue/type">2</P><P N="if_1/actions/assignment_7/lvalue">65</P><P N="if_1/actions/assignment_7/lvalue/type">2</P><P N="if_1/actions/assignment_7/rvalue">64</P><P N="if_1/actions/assignment_7/rvalue/type">2</P><P N="if_1/actions/assignment_8/lvalue">78</P><P N="if_1/actions/assignment_8/lvalue/type">2</P><P N="if_1/actions/assignment_8/rvalue">77</P><P N="if_1/actions/assignment_8/rvalue/type">2</P><P N="if_1/actions/assignment_9/lvalue">82</P><P N="if_1/actions/assignment_9/lvalue/type">2</P><P N="if_1/actions/assignment_9/rvalue">81</P><P N="if_1/actions/assignment_9/rvalue/type">2</P><P N="if_1/actions/assignment_10/lvalue">88</P><P N="if_1/actions/assignment_10/lvalue/type">2</P><P N="if_1/actions/assignment_10/rvalue">87</P><P N="if_1/actions/assignment_10/rvalue/type">2</P></Ps><CPs><CP ID="39" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="44" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="48" FP="A" P="2" N="value3"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="52" FP="A" P="3" N="value4"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="56" FP="A" P="4" N="value5"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="60" FP="A" P="5" N="value6"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="64" FP="A" P="6" N="value7"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="77" FP="A" P="7" N="value8"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="81" FP="A" P="8" N="value9"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="87" FP="A" P="9" N="value10"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="40" FP="X" P="0" N="result1"/><CP ID="46" FP="X" P="1" N="result2"/><CP ID="49" FP="X" P="2" N="result3"/><CP ID="53" FP="X" P="3" N="result4"/><CP ID="58" FP="X" P="4" N="result5"/><CP ID="61" FP="X" P="5" N="result6"/><CP ID="65" FP="X" P="6" N="result7"/><CP ID="78" FP="X" P="7" N="result8"/><CP ID="82" FP="X" P="8" N="result9"/><CP ID="88" FP="X" P="9" N="result10"/></ConnectionPoints/><F ID="13" N="Date_JS" T="JScript"><Ps C="GlobalUserNotes"><P N="{a96b6725-bb36-481b-9ad0-3b4ca440bedd}">Converting the date format CCYYMMDD to YYMMDD.</P></Ps><Ps C="S"><P N="Parameters/ec_Script">var birthDate=ec_DataHelper.GetValueByIndex(0);
var value = /[a-zA-Z!@#$%^&amp;*(),.?\&quot;:{}|&lt;&gt;]/;
if(birthDate!=&quot;&quot;){
var flag = value.test(birthDate);
if(flag == false)
{
ec_ResultHelper.ReportResultByIndex(0,+birthDate.substring(0,4)+&quot;-&quot;+birthDate.substring(4,6)+&quot;-&quot;+birthDate.substring(6,8));
}
}
var dateOfDeath=ec_DataHelper.GetValueByIndex(1);
var value = /[a-zA-Z!@#$%^&amp;*(),.?\&quot;:{}|&lt;&gt;]/;
if(dateOfDeath!=&quot;&quot;){
var flag = value.test(dateOfDeath);
if(flag == false)
{
ec_ResultHelper.ReportResultByIndex(1,+dateOfDeath.substring(0,4)+&quot;-&quot;+dateOfDeath.substring(4,6)+&quot;-&quot;+dateOfDeath.substring(6,8));
}
}
</P></Ps><CPs><CP ID="74" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="79" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="72" FP="X" P="0" N="result1"/><CP ID="80" FP="X" P="1" N="result2"/></ConnectionPoints/><F ID="14" N="Member_Gender" T="ConversionalCopy"><Ps C="S"><P N="in">,M,F,U</P><P N="out">,Male,Female,Unknown</P><P N="comment">,,,</P></Ps><CPs><CP ID="84" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="85" FP="X" N="r"/></ConnectionPoints/><F ID="15" N="Social_Security_Number" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var TaxId = ec_DataHelper.GetValueByIndex(0);
if(TaxId!=&quot;&quot;){
ec_ResultHelper.ReportResultByIndex(0, TaxId.substr(0,3) + &quot;-&quot; + TaxId.substr(3,2) + &quot;-&quot;+ TaxId.substr(5));
}</P></Ps><CPs><CP ID="90" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="89" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="16" N="Residential_Address" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">1</P><P N="if_1/conditions/expression_1/arg1/type">1</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">DEM</P><P N="if_1/actions/assignment_1/lvalue">93</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">92</P><P N="if_1/actions/assignment_1/rvalue/type">2</P><P N="if_1/actions/assignment_2/lvalue">96</P><P N="if_1/actions/assignment_2/lvalue/type">2</P><P N="if_1/actions/assignment_2/rvalue">95</P><P N="if_1/actions/assignment_2/rvalue/type">2</P><P N="if_1/actions/assignment_3/lvalue">98</P><P N="if_1/actions/assignment_3/lvalue/type">2</P><P N="if_1/actions/assignment_3/rvalue">97</P><P N="if_1/actions/assignment_3/rvalue/type">2</P><P N="if_1/actions/assignment_4/lvalue">104</P><P N="if_1/actions/assignment_4/lvalue/type">2</P><P N="if_1/actions/assignment_4/rvalue">103</P><P N="if_1/actions/assignment_4/rvalue/type">2</P><P N="if_1/actions/assignment_5/lvalue">108</P><P N="if_1/actions/assignment_5/lvalue/type">2</P><P N="if_1/actions/assignment_5/rvalue">107</P><P N="if_1/actions/assignment_5/rvalue/type">2</P><P N="if_1/actions/assignment_6/lvalue">112</P><P N="if_1/actions/assignment_6/lvalue/type">2</P><P N="if_1/actions/assignment_6/rvalue">111</P><P N="if_1/actions/assignment_6/rvalue/type">2</P><P N="if_1/actions/assignment_7/lvalue">116</P><P N="if_1/actions/assignment_7/lvalue/type">2</P><P N="if_1/actions/assignment_7/rvalue">115</P><P N="if_1/actions/assignment_7/rvalue/type">2</P></Ps><CPs><CP ID="92" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="95" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="97" FP="A" P="2" N="value3"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="103" FP="A" P="3" N="value4"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="107" FP="A" P="4" N="value5"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="111" FP="A" P="5" N="value6"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="115" FP="A" P="6" N="value7"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="93" FP="X" P="0" N="result1"/><CP ID="96" FP="X" P="1" N="result2"/><CP ID="98" FP="X" P="2" N="result3"/><CP ID="104" FP="X" P="3" N="result4"/><CP ID="108" FP="X" P="4" N="result5"/><CP ID="112" FP="X" P="5" N="result6"/><CP ID="116" FP="X" P="6" N="result7"/></ConnectionPoints/><F ID="17" N="Correspondence_Address" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">1</P><P N="if_1/conditions/expression_1/arg1/type">1</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">DEM</P><P N="if_1/actions/assignment_1/lvalue">120</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">119</P><P N="if_1/actions/assignment_1/rvalue/type">2</P><P N="if_1/actions/assignment_2/lvalue">124</P><P N="if_1/actions/assignment_2/lvalue/type">2</P><P N="if_1/actions/assignment_2/rvalue">123</P><P N="if_1/actions/assignment_2/rvalue/type">2</P><P N="if_1/actions/assignment_3/lvalue">128</P><P N="if_1/actions/assignment_3/lvalue/type">2</P><P N="if_1/actions/assignment_3/rvalue">127</P><P N="if_1/actions/assignment_3/rvalue/type">2</P><P N="if_1/actions/assignment_4/lvalue">132</P><P N="if_1/actions/assignment_4/lvalue/type">2</P><P N="if_1/actions/assignment_4/rvalue">131</P><P N="if_1/actions/assignment_4/rvalue/type">2</P><P N="if_1/actions/assignment_5/lvalue">136</P><P N="if_1/actions/assignment_5/lvalue/type">2</P><P N="if_1/actions/assignment_5/rvalue">135</P><P N="if_1/actions/assignment_5/rvalue/type">2</P><P N="if_1/actions/assignment_6/lvalue">138</P><P N="if_1/actions/assignment_6/lvalue/type">2</P><P N="if_1/actions/assignment_6/rvalue">137</P><P N="if_1/actions/assignment_6/rvalue/type">2</P></Ps><CPs><CP ID="119" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="123" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="127" FP="A" P="2" N="value3"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="131" FP="A" P="3" N="value4"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="135" FP="A" P="4" N="value5"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="137" FP="A" P="5" N="value6"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="120" FP="X" P="0" N="result1"/><CP ID="124" FP="X" P="1" N="result2"/><CP ID="128" FP="X" P="2" N="result3"/><CP ID="132" FP="X" P="3" N="result4"/><CP ID="136" FP="X" P="4" N="result5"/><CP ID="138" FP="X" P="5" N="result6"/></ConnectionPoints/><F ID="19" N="Billing_Address" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">1</P><P N="if_1/conditions/expression_1/arg1/type">1</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">DEM</P><P N="if_1/actions/assignment_1/lvalue">157</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">163</P><P N="if_1/actions/assignment_1/rvalue/type">2</P><P N="if_1/actions/assignment_2/lvalue">158</P><P N="if_1/actions/assignment_2/lvalue/type">2</P><P N="if_1/actions/assignment_2/rvalue">164</P><P N="if_1/actions/assignment_2/rvalue/type">2</P><P N="if_1/actions/assignment_3/lvalue">159</P><P N="if_1/actions/assignment_3/lvalue/type">2</P><P N="if_1/actions/assignment_3/rvalue">165</P><P N="if_1/actions/assignment_3/rvalue/type">2</P><P N="if_1/actions/assignment_4/lvalue">160</P><P N="if_1/actions/assignment_4/lvalue/type">2</P><P N="if_1/actions/assignment_4/rvalue">166</P><P N="if_1/actions/assignment_4/rvalue/type">2</P><P N="if_1/actions/assignment_5/lvalue">161</P><P N="if_1/actions/assignment_5/lvalue/type">2</P><P N="if_1/actions/assignment_5/rvalue">167</P><P N="if_1/actions/assignment_5/rvalue/type">2</P><P N="if_1/actions/assignment_6/lvalue">162</P><P N="if_1/actions/assignment_6/lvalue/type">2</P><P N="if_1/actions/assignment_6/rvalue">168</P><P N="if_1/actions/assignment_6/rvalue/type">2</P></Ps><CPs><CP ID="163" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="164" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="165" FP="A" P="2" N="value3"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="166" FP="A" P="3" N="value4"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="167" FP="A" P="4" N="value5"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="168" FP="A" P="5" N="value6"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="157" FP="X" P="0" N="result1"/><CP ID="158" FP="X" P="1" N="result2"/><CP ID="159" FP="X" P="2" N="result3"/><CP ID="160" FP="X" P="3" N="result4"/><CP ID="161" FP="X" P="4" N="result5"/><CP ID="162" FP="X" P="5" N="result6"/></ConnectionPoints/><F ID="20" N="Contact_Details" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">1</P><P N="if_1/conditions/expression_1/arg1/type">1</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">DEM</P><P N="if_1/actions/assignment_1/lvalue">188</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">187</P><P N="if_1/actions/assignment_1/rvalue/type">2</P><P N="if_1/actions/assignment_2/lvalue">190</P><P N="if_1/actions/assignment_2/lvalue/type">2</P><P N="if_1/actions/assignment_2/rvalue">189</P><P N="if_1/actions/assignment_2/rvalue/type">2</P><P N="if_1/actions/assignment_3/lvalue">192</P><P N="if_1/actions/assignment_3/lvalue/type">2</P><P N="if_1/actions/assignment_3/rvalue">191</P><P N="if_1/actions/assignment_3/rvalue/type">2</P></Ps><CPs><CP ID="187" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="189" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="191" FP="A" P="2" N="value3"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="188" FP="X" P="0" N="result1"/><CP ID="190" FP="X" P="1" N="result2"/><CP ID="192" FP="X" P="2" N="result3"/></ConnectionPoints/><F ID="21" N=" Emergency_Contact" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">1</P><P N="if_1/conditions/expression_1/arg1/type">1</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">DEM</P><P N="if_1/actions/assignment_1/lvalue">199</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">198</P><P N="if_1/actions/assignment_1/rvalue/type">2</P><P N="if_1/actions/assignment_2/lvalue">213</P><P N="if_1/actions/assignment_2/lvalue/type">2</P><P N="if_1/actions/assignment_2/rvalue">212</P><P N="if_1/actions/assignment_2/rvalue/type">2</P><P N="if_1/actions/assignment_3/lvalue">215</P><P N="if_1/actions/assignment_3/lvalue/type">2</P><P N="if_1/actions/assignment_3/rvalue">214</P><P N="if_1/actions/assignment_3/rvalue/type">2</P></Ps><CPs><CP ID="198" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="212" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="214" FP="A" P="2" N="value3"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="199" FP="X" P="0" N="result1"/><CP ID="213" FP="X" P="1" N="result2"/><CP ID="215" FP="X" P="2" N="result3"/></ConnectionPoints/><F ID="22" N="Emergency_Name" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var name = ec_DataHelper.GetValueByIndex(0);
var names = new Array();
names = name.split(' ');
var lastName= names.slice(1).join(' ');
if(names != '')
{
ec_ResultHelper.ReportResultByIndex(0, names[0]);
ec_ResultHelper.ReportResultByIndex(1,lastName);
}</P></Ps><CPs><CP ID="209" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="207" FP="X" P="0" N="result1"/><CP ID="208" FP="X" P="1" N="result2"/></ConnectionPoints/><F ID="23" N="Endangered_Member_Flag" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">1</P><P N="if_1/conditions/expression_1/arg1/type">1</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">DEM</P><P N="if_1/actions/assignment_1/lvalue">219</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">218</P><P N="if_1/actions/assignment_1/rvalue/type">2</P></Ps><CPs><CP ID="218" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="219" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="24" N="Medicaid" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">1</P><P N="if_1/conditions/expression_1/arg1/type">1</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">DEM</P><P N="if_1/actions/assignment_1/lvalue">223</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">222</P><P N="if_1/actions/assignment_1/rvalue/type">2</P></Ps><CPs><CP ID="222" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="223" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="25" N="Medicaid" T="ConditionalCopy"><Ps C="GlobalUserNotes"><P N="{a96b6725-bb36-481b-9ad0-3b4ca440bedd}">1.Checking the transcation type DEM
2.Passing the value 1 to 6 as well as it.</P></Ps><Ps C="S"><P N="if_1/conditions/expression_1/arg1">1</P><P N="if_1/conditions/expression_1/arg1/type">1</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">DEM</P><P N="if_1/actions/assignment_1/lvalue">226</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">232</P><P N="if_1/actions/assignment_1/rvalue/type">2</P><P N="if_1/actions/assignment_2/lvalue">227</P><P N="if_1/actions/assignment_2/lvalue/type">2</P><P N="if_1/actions/assignment_2/rvalue">233</P><P N="if_1/actions/assignment_2/rvalue/type">2</P><P N="if_1/actions/assignment_3/lvalue">228</P><P N="if_1/actions/assignment_3/lvalue/type">2</P><P N="if_1/actions/assignment_3/rvalue">234</P><P N="if_1/actions/assignment_3/rvalue/type">2</P><P N="if_1/actions/assignment_4/lvalue">229</P><P N="if_1/actions/assignment_4/lvalue/type">2</P><P N="if_1/actions/assignment_4/rvalue">235</P><P N="if_1/actions/assignment_4/rvalue/type">2</P><P N="if_1/actions/assignment_5/lvalue">230</P><P N="if_1/actions/assignment_5/lvalue/type">2</P><P N="if_1/actions/assignment_5/rvalue">236</P><P N="if_1/actions/assignment_5/rvalue/type">2</P><P N="if_1/actions/assignment_6/lvalue">231</P><P N="if_1/actions/assignment_6/lvalue/type">2</P><P N="if_1/actions/assignment_6/rvalue">237</P><P N="if_1/actions/assignment_6/rvalue/type">2</P></Ps><CPs><CP ID="232" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="233" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="234" FP="A" P="2" N="value3"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="235" FP="A" P="3" N="value4"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="236" FP="A" P="4" N="value5"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="237" FP="A" P="5" N="value6"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="226" FP="X" P="0" N="result1"/><CP ID="227" FP="X" P="1" N="result2"/><CP ID="228" FP="X" P="2" N="result3"/><CP ID="229" FP="X" P="3" N="result4"/><CP ID="230" FP="X" P="4" N="result5"/><CP ID="231" FP="X" P="5" N="result6"/></ConnectionPoints/><F ID="26" N="Date_JS" T="JScript"><Ps C="GlobalUserNotes"><P N="{a96b6725-bb36-481b-9ad0-3b4ca440bedd}">Converting the date format CCYYMMDD to YYMMDD.</P></Ps><Ps C="S"><P N="Parameters/ec_Script">var partAEffDate=ec_DataHelper.GetValueByIndex(0);
var value = /[a-zA-Z!@#$%^&amp;*(),.?\&quot;:{}|&lt;&gt;]/;
if(partAEffDate!=&quot;&quot;){
var flag = value.test(partAEffDate);
if(flag == false)
ec_ResultHelper.ReportResultByIndex(0,+partAEffDate.substring(0,4)+&quot;-&quot;+partAEffDate.substring(4,6)+&quot;-&quot;+partAEffDate.substring(6,8));
}
var partAEndDate=ec_DataHelper.GetValueByIndex(1);
if(partAEndDate!=&quot;&quot;){
var flag = value.test(partAEndDate);
if(flag == false)
ec_ResultHelper.ReportResultByIndex(1,+partAEndDate.substring(0,4)+&quot;-&quot;+partAEndDate.substring(4,6)+&quot;-&quot;+partAEndDate.substring(6,8));
}
var partBEffDate=ec_DataHelper.GetValueByIndex(2);
if(partBEffDate!=&quot;&quot;){
var flag = value.test(partBEffDate);
if(flag == false)
ec_ResultHelper.ReportResultByIndex(2,+partBEffDate.substring(0,4)+&quot;-&quot;+partBEffDate.substring(4,6)+&quot;-&quot;+partBEffDate.substring(6,8));
}
var partBEndDate=ec_DataHelper.GetValueByIndex(3);
if(partBEndDate!=&quot;&quot;){
var flag = value.test(partBEndDate);
if(flag == false)
ec_ResultHelper.ReportResultByIndex(3,+partBEndDate.substring(0,4)+&quot;-&quot;+partBEndDate.substring(4,6)+&quot;-&quot;+partBEndDate.substring(6,8));
}
var parDAEffDate=ec_DataHelper.GetValueByIndex(4);
if(parDAEffDate!=&quot;&quot;){
var flag = value.test(parDAEffDate);
if(flag == false)
ec_ResultHelper.ReportResultByIndex(4,+parDAEffDate.substring(0,4)+&quot;-&quot;+parDAEffDate.substring(4,6)+&quot;-&quot;+parDAEffDate.substring(6,8));
}
var partDEndDate=ec_DataHelper.GetValueByIndex(5);
if(partDEndDate!=&quot;&quot;){
var flag = value.test(partDEndDate);
if(flag == false)
ec_ResultHelper.ReportResultByIndex(5,+partDEndDate.substring(0,4)+&quot;-&quot;+partDEndDate.substring(4,6)+&quot;-&quot;+partDEndDate.substring(6,8));
}</P></Ps><CPs><CP ID="250" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="251" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="252" FP="A" P="2" N="value3"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="253" FP="A" P="3" N="value4"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="254" FP="A" P="4" N="value5"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="255" FP="A" P="5" N="value6"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="244" FP="X" P="0" N="result1"/><CP ID="245" FP="X" P="1" N="result2"/><CP ID="246" FP="X" P="2" N="result3"/><CP ID="247" FP="X" P="3" N="result4"/><CP ID="248" FP="X" P="4" N="result5"/><CP ID="249" FP="X" P="5" N="result6"/></ConnectionPoints/><F ID="34" N="Language" T="ConditionalCopy"><Ps C="GlobalUserNotes"><P N="{a96b6725-bb36-481b-9ad0-3b4ca440bedd}">1.Transcation type is equal to DEM
2.Output 1 result is equal to input value 1.</P></Ps><Ps C="S"><P N="if_1/conditions/expression_1/arg1">1</P><P N="if_1/conditions/expression_1/arg1/type">1</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">DEM</P><P N="if_1/conditions/connective_1">0</P><P N="if_1/conditions/expression_2/arg1">279</P><P N="if_1/conditions/expression_2/arg1/type">2</P><P N="if_1/conditions/expression_2/operation">1</P><P N="if_1/conditions/expression_2/operation/type">0</P><P N="if_1/actions/assignment_1/lvalue">277</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">279</P><P N="if_1/actions/assignment_1/rvalue/type">2</P><P N="if_2/conditions/expression_1/arg1">1</P><P N="if_2/conditions/expression_1/arg1/type">1</P><P N="if_2/conditions/expression_1/operation">0</P><P N="if_2/conditions/expression_1/operation/type">0</P><P N="if_2/conditions/expression_1/arg2">DEM</P><P N="if_2/conditions/connective_1">0</P><P N="if_2/conditions/expression_2/arg1">279</P><P N="if_2/conditions/expression_2/arg1/type">2</P><P N="if_2/conditions/expression_2/operation">0</P><P N="if_2/conditions/expression_2/operation/type">0</P><P N="if_2/actions/assignment_1/lvalue">277</P><P N="if_2/actions/assignment_1/lvalue/type">2</P><P N="if_2/actions/assignment_1/rvalue">EN</P></Ps><CPs><CP ID="279" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="277" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="35" N="Language" T="ConversionalCopy"><Ps C="GlobalUserNotes"><P N="{a96b6725-bb36-481b-9ad0-3b4ca440bedd}">Converting the data
1.ENG=EN
2.SPA=ES
3.FRA=FR
4.GER=DE
5.OTH=OT</P></Ps><Ps C="S"><P N="in">,ENG,SPA,FRA,GER,OTH</P><P N="out">EN,EN,ES,FR,DE,OT</P><P N="comment">,,,,,</P></Ps><CPs><CP ID="281" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="280" FP="X" N="r"/></ConnectionPoints/><F ID="36" N="Alternative_Format" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">1</P><P N="if_1/conditions/expression_1/arg1/type">1</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">DEM</P><P N="if_1/actions/assignment_1/lvalue">283</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">282</P><P N="if_1/actions/assignment_1/rvalue/type">2</P><P N="if_1/actions/assignment_2/lvalue">287</P><P N="if_1/actions/assignment_2/lvalue/type">2</P><P N="if_1/actions/assignment_2/rvalue">286</P><P N="if_1/actions/assignment_2/rvalue/type">2</P><P N="if_1/actions/assignment_3/lvalue">291</P><P N="if_1/actions/assignment_3/lvalue/type">2</P><P N="if_1/actions/assignment_3/rvalue">290</P><P N="if_1/actions/assignment_3/rvalue/type">2</P></Ps><CPs><CP ID="282" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="286" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="290" FP="A" P="2" N="value3"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="283" FP="X" P="0" N="result1"/><CP ID="287" FP="X" P="1" N="result2"/><CP ID="291" FP="X" P="2" N="result3"/></ConnectionPoints/><F ID="37" N="Fax_Number" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">1</P><P N="if_1/conditions/expression_1/arg1/type">1</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">DEM</P><P N="if_1/actions/assignment_1/lvalue">295</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">294</P><P N="if_1/actions/assignment_1/rvalue/type">2</P></Ps><CPs><CP ID="294" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="295" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="38" N="Authorized_Name" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var name = ec_DataHelper.GetValueByIndex(0);
var names = new Array();
names = name.split(' ');
var lastName= names.slice(1).join(' ');
if(names != '')
{
ec_ResultHelper.ReportResultByIndex(0, names[0]);
ec_ResultHelper.ReportResultByIndex(1,lastName);
}</P></Ps><CPs><CP ID="300" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="298" FP="X" P="0" N="result1"/><CP ID="299" FP="X" P="1" N="result2"/></ConnectionPoints/><F ID="40" N="Authorized_Name" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">1</P><P N="if_1/conditions/expression_1/arg1/type">1</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">DEM</P><P N="if_1/actions/assignment_1/lvalue">305</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">304</P><P N="if_1/actions/assignment_1/rvalue/type">2</P></Ps><CPs><CP ID="304" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="305" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="41" N="Authorized_Person_Address" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">1</P><P N="if_1/conditions/expression_1/arg1/type">1</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">DEM</P><P N="if_1/actions/assignment_1/lvalue">309</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">308</P><P N="if_1/actions/assignment_1/rvalue/type">2</P><P N="if_1/actions/assignment_2/lvalue">315</P><P N="if_1/actions/assignment_2/lvalue/type">2</P><P N="if_1/actions/assignment_2/rvalue">311</P><P N="if_1/actions/assignment_2/rvalue/type">2</P><P N="if_1/actions/assignment_3/lvalue">316</P><P N="if_1/actions/assignment_3/lvalue/type">2</P><P N="if_1/actions/assignment_3/rvalue">312</P><P N="if_1/actions/assignment_3/rvalue/type">2</P><P N="if_1/actions/assignment_4/lvalue">324</P><P N="if_1/actions/assignment_4/lvalue/type">2</P><P N="if_1/actions/assignment_4/rvalue">320</P><P N="if_1/actions/assignment_4/rvalue/type">2</P><P N="if_1/actions/assignment_5/lvalue">327</P><P N="if_1/actions/assignment_5/lvalue/type">2</P><P N="if_1/actions/assignment_5/rvalue">321</P><P N="if_1/actions/assignment_5/rvalue/type">2</P><P N="if_1/actions/assignment_6/lvalue">330</P><P N="if_1/actions/assignment_6/lvalue/type">2</P><P N="if_1/actions/assignment_6/rvalue">322</P><P N="if_1/actions/assignment_6/rvalue/type">2</P><P N="if_1/actions/assignment_7/lvalue">335</P><P N="if_1/actions/assignment_7/lvalue/type">2</P><P N="if_1/actions/assignment_7/rvalue">332</P><P N="if_1/actions/assignment_7/rvalue/type">2</P><P N="if_1/actions/assignment_8/lvalue">336</P><P N="if_1/actions/assignment_8/lvalue/type">2</P><P N="if_1/actions/assignment_8/rvalue">333</P><P N="if_1/actions/assignment_8/rvalue/type">2</P><P N="if_1/actions/assignment_9/lvalue">337</P><P N="if_1/actions/assignment_9/lvalue/type">2</P><P N="if_1/actions/assignment_9/rvalue">334</P><P N="if_1/actions/assignment_9/rvalue/type">2</P></Ps><CPs><CP ID="308" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="311" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="312" FP="A" P="2" N="value3"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="320" FP="A" P="3" N="value4"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="321" FP="A" P="4" N="value5"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="322" FP="A" P="5" N="value6"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="332" FP="A" P="6" N="value7"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="333" FP="A" P="7" N="value8"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="334" FP="A" P="8" N="value9"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="309" FP="X" P="0" N="result1"/><CP ID="315" FP="X" P="1" N="result2"/><CP ID="316" FP="X" P="2" N="result3"/><CP ID="324" FP="X" P="3" N="result4"/><CP ID="327" FP="X" P="4" N="result5"/><CP ID="330" FP="X" P="5" N="result6"/><CP ID="335" FP="X" P="6" N="result7"/><CP ID="336" FP="X" P="7" N="result8"/><CP ID="337" FP="X" P="8" N="result9"/></ConnectionPoints/><F ID="65" N="Race_Value" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var race = ec_DataHelper.GetValueByIndex(0);
var Trn_Type = &quot;DEM&quot;;
if (Trn_Type === &quot;DEM&quot;) {
if (race !== &quot;&quot;) {
var values = race.split(',');
// Loop through the values and report each non-empty value
for (var i = 0; i &lt; Math.min(values.length, 5); i++) {
var currentValue = values[i].trim(); // Trim to remove leading/trailing spaces
if (currentValue !== &quot;&quot;) {
ec_ResultHelper.ReportResultByIndex(i, currentValue);
}
}
}
}
</P></Ps><CPs><CP ID="397" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="398" FP="X" P="0" N="result1"/><CP ID="399" FP="X" P="1" N="result2"/><CP ID="400" FP="X" P="2" N="result3"/><CP ID="401" FP="X" P="3" N="result4"/><CP ID="402" FP="X" P="4" N="result5"/></ConnectionPoints/><F ID="72" N="Race_Code" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var raceCode1 = ec_DataHelper.GetValueByIndex(0);
if (raceCode1 != &quot;&quot;) {
var result1;
if (raceCode1 == &quot;300&quot;) {
result1 = &quot;I&quot;;
} else if (raceCode1 == &quot;401&quot;) {
result1 = &quot;5&quot;;
}
else if (raceCode1 == &quot;201&quot;) {
result1 = &quot;ROEC2&quot;;
}
else if (raceCode1 == &quot;411&quot;) {
result1 = &quot;14&quot;;
}
else if (raceCode1 == &quot;421&quot;) {
result1 = &quot;21&quot;;
}
else if (raceCode1 == &quot;521&quot;) {
result1 = &quot;ROEC4&quot;;
}
else if (raceCode1 == &quot;431&quot;) {
result1 = &quot;35&quot;;
}
else if (raceCode1 == &quot;441&quot;) {
result1 = &quot;37&quot;;
}
else if (raceCode1 == &quot;501&quot;) {
result1 = &quot;J&quot;;
}
else if (raceCode1 == &quot;499&quot;) {
result1 = &quot;4&quot;;
}
else if (raceCode1 == &quot;599&quot;) {
result1 = &quot;ROEC3&quot;;
}
else if (raceCode1 == &quot;511&quot;) {
result1 = &quot;52&quot;;
}
else if (raceCode1 == &quot;451&quot;) {
result1 = &quot;58&quot;;
}
else if (raceCode1 == &quot;101&quot;) {
result1 = &quot;R5&quot;;
}
else if (raceCode1 == &quot;999&quot;) {
result1 = &quot;7&quot;;
}
ec_ResultHelper.ReportResultByIndex(0, result1);
}
var raceCode2 = ec_DataHelper.GetValueByIndex(1);
if (raceCode2 != &quot;&quot;) {
var result2;
if (raceCode2 == &quot;300&quot;) {
raceCode2 = &quot;I&quot;;
} else if (raceCode2 == &quot;401&quot;) {
raceCode2 = &quot;5&quot;;
}
else if (raceCode2 == &quot;201&quot;) {
raceCode2 = &quot;ROEC2&quot;;
}
else if (raceCode2 == &quot;411&quot;) {
raceCode2 = &quot;14&quot;;
}
else if (raceCode2 == &quot;421&quot;) {
raceCode2 = &quot;21&quot;;
}
else if (raceCode2 == &quot;521&quot;) {
raceCode2 = &quot;ROEC4&quot;;
}
else if (raceCode2 == &quot;431&quot;) {
raceCode2 = &quot;35&quot;;
}
else if (raceCode2 == &quot;441&quot;) {
raceCode2 = &quot;37&quot;;
}
else if (raceCode2 == &quot;501&quot;) {
raceCode2 = &quot;J&quot;;
}
else if (raceCode2 == &quot;499&quot;) {
raceCode2 = &quot;4&quot;;
}
else if (raceCode2 == &quot;599&quot;) {
raceCode2 = &quot;ROEC3&quot;;
}
else if (raceCode2 == &quot;511&quot;) {
raceCode2 = &quot;52&quot;;
}
else if (raceCode2 == &quot;451&quot;) {
raceCode2 = &quot;58&quot;;
}
else if (raceCode2 == &quot;101&quot;) {
raceCode2 = &quot;R5&quot;;
}
else if (raceCode2 == &quot;999&quot;) {
raceCode2 = &quot;7&quot;;
}
ec_ResultHelper.ReportResultByIndex(1, raceCode2);
}
var raceCode3 = ec_DataHelper.GetValueByIndex(2);
if (raceCode3 != &quot;&quot;) {
var result3;
if (raceCode3 == &quot;300&quot;) {
raceCode3 = &quot;I&quot;;
} else if (raceCode3 == &quot;401&quot;) {
raceCode3 = &quot;5&quot;;
}
else if (raceCode3 == &quot;201&quot;) {
raceCode3 = &quot;ROEC2&quot;;
}
else if (raceCode3 == &quot;411&quot;) {
raceCode3 = &quot;14&quot;;
}
else if (raceCode3 == &quot;421&quot;) {
raceCode3 = &quot;21&quot;;
}
else if (raceCode3 == &quot;521&quot;) {
raceCode3 = &quot;ROEC4&quot;;
}
else if (raceCode3 == &quot;431&quot;) {
raceCode3 = &quot;35&quot;;
}
else if (raceCode3 == &quot;441&quot;) {
raceCode3 = &quot;37&quot;;
}
else if (raceCode3 == &quot;501&quot;) {
raceCode3 = &quot;J&quot;;
}
else if (raceCode3 == &quot;499&quot;) {
raceCode3 = &quot;4&quot;;
}
else if (raceCode3 == &quot;599&quot;) {
raceCode3 = &quot;ROEC3&quot;;
}
else if (raceCode3 == &quot;511&quot;) {
raceCode3 = &quot;52&quot;;
}
else if (raceCode3 == &quot;451&quot;) {
raceCode3 = &quot;58&quot;;
}
else if (raceCode3 == &quot;101&quot;) {
raceCode3 = &quot;R5&quot;;
}
else if (raceCode3 == &quot;999&quot;) {
raceCode3 = &quot;7&quot;;
}
ec_ResultHelper.ReportResultByIndex(2, raceCode3);
}
var raceCode4 = ec_DataHelper.GetValueByIndex(3);
if (raceCode4 != &quot;&quot;) {
var result4;
if (raceCode4 == &quot;300&quot;) {
raceCode4 = &quot;I&quot;;
} else if (raceCode4 == &quot;401&quot;) {
raceCode4 = &quot;5&quot;;
}
else if (raceCode4 == &quot;201&quot;) {
raceCode4 = &quot;ROEC2&quot;;
}
else if (raceCode4 == &quot;411&quot;) {
raceCode4 = &quot;14&quot;;
}
else if (raceCode4 == &quot;421&quot;) {
raceCode4 = &quot;21&quot;;
}
else if (raceCode4 == &quot;521&quot;) {
raceCode4 = &quot;ROEC4&quot;;
}
else if (raceCode4 == &quot;431&quot;) {
raceCode4 = &quot;35&quot;;
}
else if (raceCode4 == &quot;441&quot;) {
raceCode4 = &quot;37&quot;;
}
else if (raceCode4 == &quot;501&quot;) {
raceCode4 = &quot;J&quot;;
}
else if (raceCode4 == &quot;499&quot;) {
raceCode4 = &quot;4&quot;;
}
else if (raceCode4 == &quot;599&quot;) {
raceCode4 = &quot;ROEC3&quot;;
}
else if (raceCode4 == &quot;511&quot;) {
raceCode4 = &quot;52&quot;;
}
else if (raceCode4 == &quot;451&quot;) {
raceCode4 = &quot;58&quot;;
}
else if (raceCode4 == &quot;101&quot;) {
raceCode4 = &quot;R5&quot;;
}
else if (raceCode4 == &quot;999&quot;) {
raceCode4 = &quot;7&quot;;
}
ec_ResultHelper.ReportResultByIndex(3, raceCode4);
}
var raceCode5 = ec_DataHelper.GetValueByIndex(4);
if (raceCode5 != &quot;&quot;) {
var result5;
if (raceCode5 == &quot;300&quot;) {
raceCode5 = &quot;I&quot;;
} else if (raceCode5 == &quot;401&quot;) {
raceCode5 = &quot;5&quot;;
}
else if (raceCode5 == &quot;201&quot;) {
raceCode5 = &quot;ROEC2&quot;;
}
else if (raceCode5 == &quot;411&quot;) {
raceCode5 = &quot;14&quot;;
}
else if (raceCode5 == &quot;421&quot;) {
raceCode5 = &quot;21&quot;;
}
else if (raceCode5 == &quot;521&quot;) {
raceCode5 = &quot;ROEC4&quot;;
}
else if (raceCode5 == &quot;431&quot;) {
raceCode5 = &quot;35&quot;;
}
else if (raceCode5 == &quot;441&quot;) {
raceCode5 = &quot;37&quot;;
}
else if (raceCode5 == &quot;501&quot;) {
raceCode5 = &quot;J&quot;;
}
else if (raceCode5 == &quot;499&quot;) {
raceCode5 = &quot;4&quot;;
}
else if (raceCode5 == &quot;599&quot;) {
raceCode5 = &quot;ROEC3&quot;;
}
else if (raceCode5 == &quot;511&quot;) {
raceCode5 = &quot;52&quot;;
}
else if (raceCode5 == &quot;451&quot;) {
raceCode5 = &quot;58&quot;;
}
else if (raceCode5 == &quot;101&quot;) {
raceCode5 = &quot;R5&quot;;
}
else if (raceCode5 == &quot;999&quot;) {
raceCode5 = &quot;7&quot;;
}
ec_ResultHelper.ReportResultByIndex(4, raceCode5);
}
</P></Ps><CPs><CP ID="418" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="420" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="422" FP="A" P="2" N="value3"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="424" FP="A" P="3" N="value4"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="426" FP="A" P="4" N="value5"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="419" FP="X" P="0" N="result1"/><CP ID="421" FP="X" P="1" N="result2"/><CP ID="423" FP="X" P="2" N="result3"/><CP ID="425" FP="X" P="3" N="result4"/><CP ID="427" FP="X" P="4" N="result5"/></ConnectionPoints/><F ID="74" N="Ethnicity_Value" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var ethnicity = ec_VariableHelper.GetVariable(&quot;ethnicity&quot;);
var Trn_Type = &quot;DEM&quot;;
if (Trn_Type == &quot;DEM&quot;) {
if (ethnicity != &quot;&quot;) {
var values = ethnicity.split(',');
// Loop through the values and report each non-empty value
for (var i = 0; i &lt; Math.min(values.length, 5); i++) {
var currentValue = values[i].trim(); // Trim to remove leading/trailing spaces
if (currentValue !== &quot;&quot;) {
ec_ResultHelper.ReportResultByIndex(i, currentValue);
}
}
}
}
</P></Ps><CPs><CP ID="463" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="439" FP="A" P="0" N="value1"/><CP ID="434" FP="X" P="0" N="result1"/><CP ID="435" FP="X" P="1" N="result2"/><CP ID="436" FP="X" P="2" N="result3"/><CP ID="437" FP="X" P="3" N="result4"/><CP ID="438" FP="X" P="4" N="result5"/></ConnectionPoints/><F ID="76" N="Ethnicity_Code" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var ethnicity1 = ec_DataHelper.GetValueByIndex(0);
var ethnicityResult1=&quot;&quot;;
if (ethnicity1 == &quot;NA&quot;) {
ethnicityResult1 = &quot;ROEC1&quot;;
} else if(ethnicity1 == &quot;PR&quot;) {
ethnicityResult1 = &quot;47&quot;;
} else if (ethnicity1 == &quot;OTH&quot;) {
ethnicityResult1 = &quot;E1&quot;;
} else if (ethnicity1 == &quot;MX&quot;) {
ethnicityResult1 = &quot;40&quot;;
} else if (ethnicity1 == &quot;CUB&quot;) {
ethnicityResult1 = &quot;15&quot;;
} else if (ethnicity1 == &quot;NR&quot;) {
ethnicityResult1 = &quot;7&quot;;
}
ec_ResultHelper.ReportResultByIndex(0, ethnicityResult1);
var ethnicity2 = ec_DataHelper.GetValueByIndex(1);
var ethnicityResult2=&quot;&quot;;
if (ethnicity2 == &quot;NA&quot;) {
ethnicityResult2 = &quot;ROEC1&quot;;
} else if (ethnicity2 == &quot;PR&quot;) {
ethnicityResult2 = &quot;47&quot;;
} else if (ethnicity2 == &quot;OTH&quot;) {
ethnicityResult2 = &quot;E1&quot;;
} else if (ethnicity2 == &quot;MX&quot;) {
ethnicityResult2 = &quot;40&quot;;
} else if (ethnicity2 == &quot;CUB&quot;) {
ethnicityResult2 = &quot;15&quot;;
} else if (ethnicity2 == &quot;NR&quot;) {
ethnicityResult2 = &quot;7&quot;;
}
ec_ResultHelper.ReportResultByIndex(1, ethnicityResult2);
var ethnicity3 = ec_DataHelper.GetValueByIndex(2);
var ethnicityResult3=&quot;&quot;;
if (ethnicity3 == &quot;NA&quot;) {
ethnicityResult3 = &quot;ROEC1&quot;;
} else if (ethnicity3 == &quot;PR&quot;) {
ethnicityResult3 = &quot;47&quot;;
} else if (ethnicity3 == &quot;OTH&quot;) {
ethnicityResult3 = &quot;E1&quot;;
} else if (ethnicity3 == &quot;MX&quot;) {
ethnicityResult3 = &quot;40&quot;;
} else if (ethnicity3 == &quot;CUB&quot;) {
ethnicityResult3 = &quot;15&quot;;
} else if (ethnicity3 == &quot;NR&quot;) {
ethnicityResult3 = &quot;7&quot;;
}
ec_ResultHelper.ReportResultByIndex(2, ethnicityResult3);
var ethnicity4 = ec_DataHelper.GetValueByIndex(3);
var ethnicityResult4=&quot;&quot;;
if (ethnicity4 == &quot;NA&quot;) {
ethnicityResult4 = &quot;ROEC1&quot;;
} else if (ethnicity4 == &quot;PR&quot;) {
ethnicityResult4 = &quot;47&quot;;
} else if (ethnicity4 == &quot;OTH&quot;) {
ethnicityResult4 = &quot;E1&quot;;
} else if (ethnicity4 == &quot;MX&quot;) {
ethnicityResult4 = &quot;40&quot;;
} else if (ethnicity4 == &quot;CUB&quot;) {
ethnicityResult4 = &quot;15&quot;;
} else if (ethnicity4 == &quot;NR&quot;) {
ethnicityResult4 = &quot;7&quot;;
}
ec_ResultHelper.ReportResultByIndex(3, ethnicityResult4);
var ethnicity5 = ec_DataHelper.GetValueByIndex(4);
var ethnicityResult5=&quot;&quot;;
if (ethnicity5 == &quot;NA&quot;) {
ethnicityResult5 = &quot;ROEC1&quot;;
}else if (ethnicity5 == &quot;PR&quot;) {
ethnicityResult5 = &quot;47&quot;;
} else if (ethnicity5 == &quot;OTH&quot;) {
ethnicityResult5 = &quot;E1&quot;;
} else if (ethnicity5 == &quot;MX&quot;) {
ethnicityResult5 = &quot;40&quot;;
} else if (ethnicity5 == &quot;CUB&quot;) {
ethnicityResult5 = &quot;15&quot;;
} else if (ethnicity5 == &quot;NR&quot;) {
ethnicityResult5 = &quot;7&quot;;
}
ec_ResultHelper.ReportResultByIndex(4, ethnicityResult5);
</P></Ps><CPs><CP ID="456" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="457" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="458" FP="A" P="2" N="value3"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="459" FP="A" P="3" N="value4"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="460" FP="A" P="4" N="value5"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="451" FP="X" P="0" N="result1"/><CP ID="452" FP="X" P="1" N="result2"/><CP ID="453" FP="X" P="2" N="result3"/><CP ID="454" FP="X" P="3" N="result4"/><CP ID="455" FP="X" P="4" N="result5"/></ConnectionPoints/><F ID="77" T="ChangeVariable"><Ps C="S"><P N="variableID">7</P></Ps><CPs><CP ID="462" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="92" N="PCP_Increment" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">1</P><P N="if_1/conditions/expression_1/arg1/type">1</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">PCP</P><P N="if_1/actions/assignment_1/lvalue">495</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">496</P><P N="if_1/actions/assignment_1/rvalue/type">2</P></Ps><CPs><CP ID="496" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="494" FP="A" P="0" N="value1"/><CP ID="495" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="93" T="Increment"><Ps C="S"><P N="variableID">8</P></Ps><CPs><CP ID="497" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="96" N="PCP_Result" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var pcp_id = ec_VariableHelper.GetVariable(&quot;PCP_ID&quot;);
var pcp_count = ec_VariableHelper.GetVariable(&quot;PCP_Count&quot;);
var startdate = ec_VariableHelper.GetVariable(&quot;Start_Date&quot;);
var enddate = ec_VariableHelper.GetVariable(&quot;End_Date&quot;);
var value = /[a-zA-Z!@#$%^&amp;*(),.?\&quot;:{}|&lt;&gt;]/;
var transactionType = ec_VariableHelper.GetVariable(&quot;Tr_Type&quot;);
if (transactionType == &quot;PCP&quot;){
if (pcp_count == 1) {
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(0, pcp_id);
ec_ResultHelper.ReportResultByIndex(2, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(4, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (pcp_count == 2) {
ec_ResultHelper.ReportResultByIndex(1, pcp_id);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(3, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(5, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (pcp_count == 3) {
ec_ResultHelper.ReportResultByIndex(6, pcp_id);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(14, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(22, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (pcp_count == 4) {
ec_ResultHelper.ReportResultByIndex(7, pcp_id);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(15, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(23, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (pcp_count == 5) {
ec_ResultHelper.ReportResultByIndex(8, pcp_id);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(16, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(24, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (pcp_count == 6) {
ec_ResultHelper.ReportResultByIndex(9, pcp_id);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(17, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(25, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (pcp_count == 7) {
ec_ResultHelper.ReportResultByIndex(10, pcp_id);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(18, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(26, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (pcp_count == 8) {
ec_ResultHelper.ReportResultByIndex(11, pcp_id);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(19, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(27, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (pcp_count == 9) {
ec_ResultHelper.ReportResultByIndex(12, pcp_id);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(20, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(28, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (pcp_count == 10) {
ec_ResultHelper.ReportResultByIndex(13, pcp_id);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(21, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(29, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}</P></Ps><CPs><CP ID="2317" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="504" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="505" FP="X" P="0" N="result1"/><CP ID="506" FP="X" P="1" N="result2"/><CP ID="526" FP="X" P="2" N="result3"/><CP ID="527" FP="X" P="3" N="result4"/><CP ID="534" FP="X" P="4" N="result5"/><CP ID="535" FP="X" P="5" N="result6"/><CP ID="1380" FP="X" P="6" N="result7"/><CP ID="1381" FP="X" P="7" N="result8"/><CP ID="1382" FP="X" P="8" N="result9"/><CP ID="1383" FP="X" P="9" N="result10"/><CP ID="1384" FP="X" P="10" N="result11"/><CP ID="1385" FP="X" P="11" N="result12"/><CP ID="1386" FP="X" P="12" N="result13"/><CP ID="1387" FP="X" P="13" N="result14"/><CP ID="1388" FP="X" P="14" N="result15"/><CP ID="1389" FP="X" P="15" N="result16"/><CP ID="1390" FP="X" P="16" N="result17"/><CP ID="1391" FP="X" P="17" N="result18"/><CP ID="1392" FP="X" P="18" N="result19"/><CP ID="1393" FP="X" P="19" N="result20"/><CP ID="1394" FP="X" P="20" N="result21"/><CP ID="1395" FP="X" P="21" N="result22"/><CP ID="1396" FP="X" P="22" N="result23"/><CP ID="1397" FP="X" P="23" N="result24"/><CP ID="1398" FP="X" P="24" N="result25"/><CP ID="1399" FP="X" P="25" N="result26"/><CP ID="1400" FP="X" P="26" N="result27"/><CP ID="1401" FP="X" P="27" N="result28"/><CP ID="1402" FP="X" P="28" N="result29"/><CP ID="1403" FP="X" P="29" N="result30"/></ConnectionPoints/><F ID="97" T="ChangeVariable"><Ps C="S"><P N="variableID">9</P></Ps><CPs><CP ID="507" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="98" T="ChangeVariable"><Ps C="S"><P N="variableID">9</P></Ps><CPs><CP ID="509" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="508" FP="A" N="v"/></ConnectionPoints/><F ID="100" T="ChangeVariable"><Ps C="S"><P N="variableID">14</P></Ps><CPs><CP ID="513" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="102" T="ChangeVariable"><Ps C="S"><P N="variableID">14</P></Ps><CPs><CP ID="517" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="515" FP="A" N="v"/></ConnectionPoints/><F ID="106" T="ChangeVariable"><Ps C="S"><P N="variableID">11</P></Ps><CPs><CP ID="529" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="108" T="ChangeVariable"><Ps C="S"><P N="variableID">11</P></Ps><CPs><CP ID="533" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="532" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="115" N="LEP_Increment" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">1</P><P N="if_1/conditions/expression_1/arg1/type">1</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">LEP</P><P N="if_1/actions/assignment_1/lvalue">550</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">551</P><P N="if_1/actions/assignment_1/rvalue/type">2</P></Ps><CPs><CP ID="551" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="552" FP="A" P="0" N="value1"/><CP ID="550" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="116" T="Increment"><Ps C="S"><P N="variableID">13</P></Ps><CPs><CP ID="553" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="120" N="LEP_Result" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var lepNum = ec_VariableHelper.GetVariable(&quot;LEP_NUM&quot;);
var lepAmmount = ec_VariableHelper.GetVariable(&quot;Lep_Ammount&quot;);
var waidedAmmount = ec_VariableHelper.GetVariable(&quot;Lep_Waided_Ammount&quot;);
var subsidyAmmount = ec_VariableHelper.GetVariable(&quot;Subsidy_Ammount&quot;);
var lepCount = ec_VariableHelper.GetVariable(&quot;LEP_Count&quot;);
var startdate = ec_VariableHelper.GetVariable(&quot;Start_Date&quot;);
var enddate = ec_VariableHelper.GetVariable(&quot;End_Date&quot;);
var value = /[a-zA-Z!@#$%^&amp;*(),.?\&quot;:{}|&lt;&gt;]/;
var transactionType = ec_VariableHelper.GetVariable(&quot;Tr_Type&quot;);
if (transactionType == &quot;LEP&quot;){
if (lepCount == 1) {
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(0, lepNum);
ec_ResultHelper.ReportResultByIndex(6, lepAmmount);
ec_ResultHelper.ReportResultByIndex(8, waidedAmmount);
ec_ResultHelper.ReportResultByIndex(10, subsidyAmmount);
ec_ResultHelper.ReportResultByIndex(2, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(4, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (lepCount == 2) {
ec_ResultHelper.ReportResultByIndex(1, lepNum);
ec_ResultHelper.ReportResultByIndex(7, lepAmmount);
ec_ResultHelper.ReportResultByIndex(9, waidedAmmount);
ec_ResultHelper.ReportResultByIndex(11, subsidyAmmount);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(3, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(5, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (lepCount == 3) {
ec_ResultHelper.ReportResultByIndex(12, lepNum);
ec_ResultHelper.ReportResultByIndex(20, lepAmmount);
ec_ResultHelper.ReportResultByIndex(28, waidedAmmount);
ec_ResultHelper.ReportResultByIndex(36, subsidyAmmount);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(44, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(52, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (lepCount == 4) {
ec_ResultHelper.ReportResultByIndex(13, lepNum);
ec_ResultHelper.ReportResultByIndex(21, lepAmmount);
ec_ResultHelper.ReportResultByIndex(29, waidedAmmount);
ec_ResultHelper.ReportResultByIndex(37, subsidyAmmount);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(45, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(53, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (lepCount == 5) {
ec_ResultHelper.ReportResultByIndex(14, lepNum);
ec_ResultHelper.ReportResultByIndex(22, lepAmmount);
ec_ResultHelper.ReportResultByIndex(30, waidedAmmount);
ec_ResultHelper.ReportResultByIndex(38, subsidyAmmount);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(46, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(54, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (lepCount == 6) {
ec_ResultHelper.ReportResultByIndex(15, lepNum);
ec_ResultHelper.ReportResultByIndex(23, lepAmmount);
ec_ResultHelper.ReportResultByIndex(31, waidedAmmount);
ec_ResultHelper.ReportResultByIndex(39, subsidyAmmount);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(47, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(55, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (lepCount == 7) {
ec_ResultHelper.ReportResultByIndex(16, lepNum);
ec_ResultHelper.ReportResultByIndex(24, lepAmmount);
ec_ResultHelper.ReportResultByIndex(32, waidedAmmount);
ec_ResultHelper.ReportResultByIndex(40, subsidyAmmount);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(48, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(56, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (lepCount == 8) {
ec_ResultHelper.ReportResultByIndex(17, lepNum);
ec_ResultHelper.ReportResultByIndex(25, lepAmmount);
ec_ResultHelper.ReportResultByIndex(33, waidedAmmount);
ec_ResultHelper.ReportResultByIndex(41, subsidyAmmount);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(49, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(57, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (lepCount == 9) {
ec_ResultHelper.ReportResultByIndex(18, lepNum);
ec_ResultHelper.ReportResultByIndex(26, lepAmmount);
ec_ResultHelper.ReportResultByIndex(34, waidedAmmount);
ec_ResultHelper.ReportResultByIndex(42, subsidyAmmount);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(50, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(58, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (lepCount == 10) {
ec_ResultHelper.ReportResultByIndex(19, lepNum);
ec_ResultHelper.ReportResultByIndex(27, lepAmmount);
ec_ResultHelper.ReportResultByIndex(35, waidedAmmount);
ec_ResultHelper.ReportResultByIndex(43, subsidyAmmount);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(51, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(59, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}</P></Ps><CPs><CP ID="2315" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="573" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="567" FP="X" P="0" N="result1"/><CP ID="579" FP="X" P="1" N="result2"/><CP ID="585" FP="X" P="2" N="result3"/><CP ID="586" FP="X" P="3" N="result4"/><CP ID="588" FP="X" P="4" N="result5"/><CP ID="589" FP="X" P="5" N="result6"/><CP ID="599" FP="X" P="6" N="result7"/><CP ID="600" FP="X" P="7" N="result8"/><CP ID="608" FP="X" P="8" N="result9"/><CP ID="609" FP="X" P="9" N="result10"/><CP ID="617" FP="X" P="10" N="result11"/><CP ID="618" FP="X" P="11" N="result12"/><CP ID="1428" FP="X" P="12" N="result13"/><CP ID="1429" FP="X" P="13" N="result14"/><CP ID="1430" FP="X" P="14" N="result15"/><CP ID="1431" FP="X" P="15" N="result16"/><CP ID="1432" FP="X" P="16" N="result17"/><CP ID="1433" FP="X" P="17" N="result18"/><CP ID="1434" FP="X" P="18" N="result19"/><CP ID="1435" FP="X" P="19" N="result20"/><CP ID="1436" FP="X" P="20" N="result21"/><CP ID="1437" FP="X" P="21" N="result22"/><CP ID="1438" FP="X" P="22" N="result23"/><CP ID="1439" FP="X" P="23" N="result24"/><CP ID="1440" FP="X" P="24" N="result25"/><CP ID="1441" FP="X" P="25" N="result26"/><CP ID="1442" FP="X" P="26" N="result27"/><CP ID="1443" FP="X" P="27" N="result28"/><CP ID="1444" FP="X" P="28" N="result29"/><CP ID="1445" FP="X" P="29" N="result30"/><CP ID="1446" FP="X" P="30" N="result31"/><CP ID="1447" FP="X" P="31" N="result32"/><CP ID="1448" FP="X" P="32" N="result33"/><CP ID="1449" FP="X" P="33" N="result34"/><CP ID="1450" FP="X" P="34" N="result35"/><CP ID="1451" FP="X" P="35" N="result36"/><CP ID="1452" FP="X" P="36" N="result37"/><CP ID="1453" FP="X" P="37" N="result38"/><CP ID="1454" FP="X" P="38" N="result39"/><CP ID="1455" FP="X" P="39" N="result40"/><CP ID="1456" FP="X" P="40" N="result41"/><CP ID="1457" FP="X" P="41" N="result42"/><CP ID="1458" FP="X" P="42" N="result43"/><CP ID="1459" FP="X" P="43" N="result44"/><CP ID="1460" FP="X" P="44" N="result45"/><CP ID="1461" FP="X" P="45" N="result46"/><CP ID="1462" FP="X" P="46" N="result47"/><CP ID="1463" FP="X" P="47" N="result48"/><CP ID="1464" FP="X" P="48" N="result49"/><CP ID="1465" FP="X" P="49" N="result50"/><CP ID="1466" FP="X" P="50" N="result51"/><CP ID="1467" FP="X" P="51" N="result52"/><CP ID="1468" FP="X" P="52" N="result53"/><CP ID="1469" FP="X" P="53" N="result54"/><CP ID="1470" FP="X" P="54" N="result55"/><CP ID="1471" FP="X" P="55" N="result56"/><CP ID="1472" FP="X" P="56" N="result57"/><CP ID="1473" FP="X" P="57" N="result58"/><CP ID="1474" FP="X" P="58" N="result59"/><CP ID="1475" FP="X" P="59" N="result60"/></ConnectionPoints/><F ID="121" T="ChangeVariable"><Ps C="S"><P N="variableID">12</P></Ps><CPs><CP ID="574" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="123" T="ChangeVariable"><Ps C="S"><P N="variableID">12</P></Ps><CPs><CP ID="578" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="577" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="127" T="ChangeVariable"><Ps C="S"><P N="variableID">15</P></Ps><CPs><CP ID="594" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="129" T="ChangeVariable"><Ps C="S"><P N="variableID">15</P></Ps><CPs><CP ID="598" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="597" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="130" T="ChangeVariable"><Ps C="S"><P N="variableID">16</P></Ps><CPs><CP ID="603" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="132" T="ChangeVariable"><Ps C="S"><P N="variableID">16</P></Ps><CPs><CP ID="607" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="606" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="133" T="ChangeVariable"><Ps C="S"><P N="variableID">17</P></Ps><CPs><CP ID="612" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="135" T="ChangeVariable"><Ps C="S"><P N="variableID">17</P></Ps><CPs><CP ID="616" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="615" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="138" N="LIS_Increment" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">1</P><P N="if_1/conditions/expression_1/arg1/type">1</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">LIS</P><P N="if_1/actions/assignment_1/lvalue">627</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">628</P><P N="if_1/actions/assignment_1/rvalue/type">2</P></Ps><CPs><CP ID="628" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="629" FP="A" P="0" N="value1"/><CP ID="627" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="140" T="Increment"><Ps C="S"><P N="variableID">18</P></Ps><CPs><CP ID="631" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="144" N="LIS_Result" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var lis_Subsidy = ec_VariableHelper.GetVariable(&quot;LIS_Subsidy&quot;);
var partD_Subsidy = ec_VariableHelper.GetVariable(&quot;PartD_Subsidy&quot;);
var partD_Copay = ec_VariableHelper.GetVariable(&quot;PartD_Copay&quot;);
var lis_Count = ec_VariableHelper.GetVariable(&quot;LIS_Count&quot;);
var startdate = ec_VariableHelper.GetVariable(&quot;Start_Date&quot;);
var enddate = ec_VariableHelper.GetVariable(&quot;End_Date&quot;);
var value = /[a-zA-Z!@#$%^&amp;*(),.?\&quot;:{}|&lt;&gt;]/;
var transactionType = ec_VariableHelper.GetVariable(&quot;Tr_Type&quot;);
if (transactionType == &quot;LIS&quot;){
if (lis_Count == 1) {
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(0, lis_Subsidy);
ec_ResultHelper.ReportResultByIndex(6, partD_Subsidy);
ec_ResultHelper.ReportResultByIndex(8, partD_Copay);
ec_ResultHelper.ReportResultByIndex(2, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(4, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (lis_Count == 2) {
ec_ResultHelper.ReportResultByIndex(1, lis_Subsidy);
ec_ResultHelper.ReportResultByIndex(7, partD_Subsidy);
ec_ResultHelper.ReportResultByIndex(9, partD_Copay);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(3, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(5, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (lis_Count == 3) {
ec_ResultHelper.ReportResultByIndex(10, lis_Subsidy);
ec_ResultHelper.ReportResultByIndex(18, partD_Subsidy);
ec_ResultHelper.ReportResultByIndex(26, partD_Copay);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(34, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(42, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (lis_Count == 4) {
ec_ResultHelper.ReportResultByIndex(11, lis_Subsidy);
ec_ResultHelper.ReportResultByIndex(19, partD_Subsidy);
ec_ResultHelper.ReportResultByIndex(27, partD_Copay);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(35, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(43, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (lis_Count == 5) {
ec_ResultHelper.ReportResultByIndex(12, lis_Subsidy);
ec_ResultHelper.ReportResultByIndex(20, partD_Subsidy);
ec_ResultHelper.ReportResultByIndex(28, partD_Copay);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(36, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(44, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (lis_Count == 6) {
ec_ResultHelper.ReportResultByIndex(13, lis_Subsidy);
ec_ResultHelper.ReportResultByIndex(21, partD_Subsidy);
ec_ResultHelper.ReportResultByIndex(29, partD_Copay);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(37, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(45, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (lis_Count == 7) {
ec_ResultHelper.ReportResultByIndex(14, lis_Subsidy);
ec_ResultHelper.ReportResultByIndex(22, partD_Subsidy);
ec_ResultHelper.ReportResultByIndex(30, partD_Copay);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(38, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(46, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (lis_Count == 8) {
ec_ResultHelper.ReportResultByIndex(15, lis_Subsidy);
ec_ResultHelper.ReportResultByIndex(23, partD_Subsidy);
ec_ResultHelper.ReportResultByIndex(31, partD_Copay);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(39, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(47, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (lis_Count == 9) {
ec_ResultHelper.ReportResultByIndex(16, lis_Subsidy);
ec_ResultHelper.ReportResultByIndex(24, partD_Subsidy);
ec_ResultHelper.ReportResultByIndex(32, partD_Copay);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(40, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(48, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (lis_Count == 10) {
ec_ResultHelper.ReportResultByIndex(17, lis_Subsidy);
ec_ResultHelper.ReportResultByIndex(25, partD_Subsidy);
ec_ResultHelper.ReportResultByIndex(33, partD_Copay);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(41, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(49, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
</P></Ps><CPs><CP ID="2314" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="651" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="645" FP="X" P="0" N="result1"/><CP ID="646" FP="X" P="1" N="result2"/><CP ID="647" FP="X" P="2" N="result3"/><CP ID="648" FP="X" P="3" N="result4"/><CP ID="649" FP="X" P="4" N="result5"/><CP ID="650" FP="X" P="5" N="result6"/><CP ID="668" FP="X" P="6" N="result7"/><CP ID="669" FP="X" P="7" N="result8"/><CP ID="677" FP="X" P="8" N="result9"/><CP ID="678" FP="X" P="9" N="result10"/><CP ID="1524" FP="X" P="10" N="result11"/><CP ID="1525" FP="X" P="11" N="result12"/><CP ID="1526" FP="X" P="12" N="result13"/><CP ID="1527" FP="X" P="13" N="result14"/><CP ID="1528" FP="X" P="14" N="result15"/><CP ID="1529" FP="X" P="15" N="result16"/><CP ID="1530" FP="X" P="16" N="result17"/><CP ID="1531" FP="X" P="17" N="result18"/><CP ID="1532" FP="X" P="18" N="result19"/><CP ID="1533" FP="X" P="19" N="result20"/><CP ID="1534" FP="X" P="20" N="result21"/><CP ID="1535" FP="X" P="21" N="result22"/><CP ID="1536" FP="X" P="22" N="result23"/><CP ID="1537" FP="X" P="23" N="result24"/><CP ID="1538" FP="X" P="24" N="result25"/><CP ID="1539" FP="X" P="25" N="result26"/><CP ID="1540" FP="X" P="26" N="result27"/><CP ID="1541" FP="X" P="27" N="result28"/><CP ID="1542" FP="X" P="28" N="result29"/><CP ID="1543" FP="X" P="29" N="result30"/><CP ID="1544" FP="X" P="30" N="result31"/><CP ID="1545" FP="X" P="31" N="result32"/><CP ID="1546" FP="X" P="32" N="result33"/><CP ID="1547" FP="X" P="33" N="result34"/><CP ID="1548" FP="X" P="34" N="result35"/><CP ID="1549" FP="X" P="35" N="result36"/><CP ID="1550" FP="X" P="36" N="result37"/><CP ID="1551" FP="X" P="37" N="result38"/><CP ID="1552" FP="X" P="38" N="result39"/><CP ID="1553" FP="X" P="39" N="result40"/><CP ID="1554" FP="X" P="40" N="result41"/><CP ID="1555" FP="X" P="41" N="result42"/><CP ID="1556" FP="X" P="42" N="result43"/><CP ID="1557" FP="X" P="43" N="result44"/><CP ID="1558" FP="X" P="44" N="result45"/><CP ID="1559" FP="X" P="45" N="result46"/><CP ID="1560" FP="X" P="46" N="result47"/><CP ID="1561" FP="X" P="47" N="result48"/><CP ID="1562" FP="X" P="48" N="result49"/><CP ID="1563" FP="X" P="49" N="result50"/></ConnectionPoints/><F ID="145" T="ChangeVariable"><Ps C="S"><P N="variableID">19</P></Ps><CPs><CP ID="652" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="147" T="ChangeVariable"><Ps C="S"><P N="variableID">19</P></Ps><CPs><CP ID="656" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="654" FP="A" N="v"/></ConnectionPoints/><F ID="148" T="ChangeVariable"><Ps C="S"><P N="variableID">20</P></Ps><CPs><CP ID="663" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="150" T="ChangeVariable"><Ps C="S"><P N="variableID">20</P></Ps><CPs><CP ID="667" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="666" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="151" T="ChangeVariable"><Ps C="S"><P N="variableID">21</P></Ps><CPs><CP ID="672" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="153" T="ChangeVariable"><Ps C="S"><P N="variableID">21</P></Ps><CPs><CP ID="676" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="674" FP="A" N="v"/></ConnectionPoints/><F ID="156" N="Contract_Number" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">1</P><P N="if_1/conditions/expression_1/arg1/type">1</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">PLN</P><P N="if_1/actions/assignment_1/lvalue">685</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">686</P><P N="if_1/actions/assignment_1/rvalue/type">2</P></Ps><CPs><CP ID="686" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="687" FP="A" P="0" N="value1"/><CP ID="685" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="157" T="Increment"><Ps C="S"><P N="variableID">22</P></Ps><CPs><CP ID="688" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="161" N="PLN_Result" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var contract_Number = ec_VariableHelper.GetVariable(&quot;Contract_Number&quot;);
var pbp_Numner = ec_VariableHelper.GetVariable(&quot;PBP_Number&quot;);
var cn_Count = ec_VariableHelper.GetVariable(&quot;Contract_Number_Count&quot;);
var startdate = ec_VariableHelper.GetVariable(&quot;Start_Date&quot;);
var enddate = ec_VariableHelper.GetVariable(&quot;End_Date&quot;);
var value = /[a-zA-Z!@#$%^&amp;*(),.?\&quot;:{}|&lt;&gt;]/;
var transactionType = ec_VariableHelper.GetVariable(&quot;Tr_Type&quot;);
if (transactionType == &quot;PLN&quot;){
if (cn_Count == 1) {
ec_ResultHelper.ReportResultByIndex(0, contract_Number);
ec_ResultHelper.ReportResultByIndex(3, pbp_Numner);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(6, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(9, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (cn_Count == 2) {
ec_ResultHelper.ReportResultByIndex(1, contract_Number);
ec_ResultHelper.ReportResultByIndex(4, pbp_Numner);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(7, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(10, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (cn_Count == 3) {
ec_ResultHelper.ReportResultByIndex(2, contract_Number);
ec_ResultHelper.ReportResultByIndex(5, pbp_Numner);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(8, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(11, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (cn_Count == 4) {
ec_ResultHelper.ReportResultByIndex(12, contract_Number);
ec_ResultHelper.ReportResultByIndex(19, pbp_Numner);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(26, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(33, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (cn_Count == 5) {
ec_ResultHelper.ReportResultByIndex(13, contract_Number);
ec_ResultHelper.ReportResultByIndex(20, pbp_Numner);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(27, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(34, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (cn_Count == 6) {
ec_ResultHelper.ReportResultByIndex(14, contract_Number);
ec_ResultHelper.ReportResultByIndex(21, pbp_Numner);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(28, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(35, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (cn_Count == 7) {
ec_ResultHelper.ReportResultByIndex(15, contract_Number);
ec_ResultHelper.ReportResultByIndex(22, pbp_Numner);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(29, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(36, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (cn_Count == 8) {
ec_ResultHelper.ReportResultByIndex(16, contract_Number);
ec_ResultHelper.ReportResultByIndex(23, pbp_Numner);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(30, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(37, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (cn_Count == 9) {
ec_ResultHelper.ReportResultByIndex(17, contract_Number);
ec_ResultHelper.ReportResultByIndex(24, pbp_Numner);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(31, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(38, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (cn_Count == 10) {
ec_ResultHelper.ReportResultByIndex(18, contract_Number);
ec_ResultHelper.ReportResultByIndex(25, pbp_Numner);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(32, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(39, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}</P></Ps><CPs><CP ID="2309" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="708" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="702" FP="X" P="0" N="result1"/><CP ID="703" FP="X" P="1" N="result2"/><CP ID="715" FP="X" P="2" N="result3"/><CP ID="724" FP="X" P="3" N="result4"/><CP ID="725" FP="X" P="4" N="result5"/><CP ID="726" FP="X" P="5" N="result6"/><CP ID="1222" FP="X" P="6" N="result7"/><CP ID="1223" FP="X" P="7" N="result8"/><CP ID="1224" FP="X" P="8" N="result9"/><CP ID="1228" FP="X" P="9" N="result10"/><CP ID="1229" FP="X" P="10" N="result11"/><CP ID="1230" FP="X" P="11" N="result12"/><CP ID="1268" FP="X" P="12" N="result13"/><CP ID="1269" FP="X" P="13" N="result14"/><CP ID="1270" FP="X" P="14" N="result15"/><CP ID="1271" FP="X" P="15" N="result16"/><CP ID="1272" FP="X" P="16" N="result17"/><CP ID="1273" FP="X" P="17" N="result18"/><CP ID="1274" FP="X" P="18" N="result19"/><CP ID="1275" FP="X" P="19" N="result20"/><CP ID="1276" FP="X" P="20" N="result21"/><CP ID="1277" FP="X" P="21" N="result22"/><CP ID="1278" FP="X" P="22" N="result23"/><CP ID="1279" FP="X" P="23" N="result24"/><CP ID="1280" FP="X" P="24" N="result25"/><CP ID="1281" FP="X" P="25" N="result26"/><CP ID="1282" FP="X" P="26" N="result27"/><CP ID="1283" FP="X" P="27" N="result28"/><CP ID="1284" FP="X" P="28" N="result29"/><CP ID="1285" FP="X" P="29" N="result30"/><CP ID="1286" FP="X" P="30" N="result31"/><CP ID="1287" FP="X" P="31" N="result32"/><CP ID="1288" FP="X" P="32" N="result33"/><CP ID="1289" FP="X" P="33" N="result34"/><CP ID="1290" FP="X" P="34" N="result35"/><CP ID="1291" FP="X" P="35" N="result36"/><CP ID="1292" FP="X" P="36" N="result37"/><CP ID="1293" FP="X" P="37" N="result38"/><CP ID="1294" FP="X" P="38" N="result39"/><CP ID="1295" FP="X" P="39" N="result40"/></ConnectionPoints/><F ID="162" T="ChangeVariable"><Ps C="S"><P N="variableID">23</P></Ps><CPs><CP ID="709" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="164" T="ChangeVariable"><Ps C="S"><P N="variableID">23</P></Ps><CPs><CP ID="714" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="712" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="166" T="ChangeVariable"><Ps C="S"><P N="variableID">24</P></Ps><CPs><CP ID="719" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="168" T="ChangeVariable"><Ps C="S"><P N="variableID">24</P></Ps><CPs><CP ID="723" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="721" FP="A" N="v"/></ConnectionPoints/><F ID="170" N="Group_ID" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">1</P><P N="if_1/conditions/expression_1/arg1/type">1</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">PLN</P><P N="if_1/conditions/connective_1">1</P><P N="if_1/conditions/expression_2/arg1">1</P><P N="if_1/conditions/expression_2/arg1/type">1</P><P N="if_1/conditions/expression_2/operation">0</P><P N="if_1/conditions/expression_2/operation/type">0</P><P N="if_1/conditions/expression_2/arg2">GRP</P><P N="if_1/actions/assignment_1/lvalue">733</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">734</P><P N="if_1/actions/assignment_1/rvalue/type">2</P></Ps><CPs><CP ID="734" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="735" FP="A" P="0" N="value1"/><CP ID="733" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="172" T="Increment"><Ps C="S"><P N="variableID">25</P></Ps><CPs><CP ID="737" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="176" N="GRP_Result" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var group_id = ec_VariableHelper.GetVariable(&quot;Group_ID&quot;);
var groupCount = ec_VariableHelper.GetVariable(&quot;Group_ID_Count&quot;);
var transactionType = ec_VariableHelper.GetVariable(&quot;Tr_Type&quot;);
if (transactionType == &quot;PLN&quot;){
if (groupCount == 1) {
ec_ResultHelper.ReportResultByIndex(0, group_id);
}
if (groupCount == 2) {
ec_ResultHelper.ReportResultByIndex(1, group_id);
}
if (groupCount == 3) {
ec_ResultHelper.ReportResultByIndex(2, group_id);
}
if (groupCount == 4) {
ec_ResultHelper.ReportResultByIndex(3, group_id);
}
if (groupCount == 5) {
ec_ResultHelper.ReportResultByIndex(4, group_id);
}
if (groupCount == 6) {
ec_ResultHelper.ReportResultByIndex(5, group_id);
}
if (groupCount == 7) {
ec_ResultHelper.ReportResultByIndex(6, group_id);
}
if (groupCount == 8) {
ec_ResultHelper.ReportResultByIndex(7, group_id);
}
if (groupCount == 9) {
ec_ResultHelper.ReportResultByIndex(8, group_id);
}
if (groupCount == 10) {
ec_ResultHelper.ReportResultByIndex(9, group_id);
}
}</P></Ps><CPs><CP ID="2296" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="757" FP="A" P="0" N="value1"/><CP ID="751" FP="X" P="0" N="result1"/><CP ID="752" FP="X" P="1" N="result2"/><CP ID="753" FP="X" P="2" N="result3"/><CP ID="1324" FP="X" P="3" N="result4"/><CP ID="1325" FP="X" P="4" N="result5"/><CP ID="1326" FP="X" P="5" N="result6"/><CP ID="1327" FP="X" P="6" N="result7"/><CP ID="1328" FP="X" P="7" N="result8"/><CP ID="1329" FP="X" P="8" N="result9"/><CP ID="1330" FP="X" P="9" N="result10"/></ConnectionPoints/><F ID="177" T="ChangeVariable"><Ps C="S"><P N="variableID">26</P></Ps><CPs><CP ID="758" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="179" T="ChangeVariable"><Ps C="S"><P N="variableID">26</P></Ps><CPs><CP ID="762" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="761" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="186" N="DRC" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">1</P><P N="if_1/conditions/expression_1/arg1/type">1</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">PLN</P><P N="if_1/actions/assignment_1/lvalue">783</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">784</P><P N="if_1/actions/assignment_1/rvalue/type">2</P></Ps><CPs><CP ID="784" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="785" FP="A" P="0" N="value1"/><CP ID="783" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="187" T="Increment"><Ps C="S"><P N="variableID">27</P></Ps><CPs><CP ID="786" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="189" N="DRC_Result" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var drc = ec_VariableHelper.GetVariable(&quot;DRC&quot;);
var election_Type = ec_VariableHelper.GetVariable(&quot;Election_Type&quot;);
var signature_Date = ec_VariableHelper.GetVariable(&quot;Signature_Date&quot;);
var drc_Count = ec_VariableHelper.GetVariable(&quot;DRC_Count&quot;);
var value = /[a-zA-Z!@#$%^&amp;*(),.?\&quot;:{}|&lt;&gt;]/;
var transactionType = ec_VariableHelper.GetVariable(&quot;Tr_Type&quot;);
if (transactionType == &quot;PLN&quot;){
if (drc_Count == 1) {
ec_ResultHelper.ReportResultByIndex(0, drc);
ec_ResultHelper.ReportResultByIndex(6, election_Type);
if (signature_Date !== &quot;&quot;) {
var flag = value.test(signature_Date);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(3, +signature_Date.substring(0, 4) + &quot;-&quot; + signature_Date.substring(4, 6) + &quot;-&quot; + signature_Date.substring(6, 8));
}
}
}
if (drc_Count == 2) {
ec_ResultHelper.ReportResultByIndex(1, drc);
ec_ResultHelper.ReportResultByIndex(7, election_Type);
if (signature_Date !== &quot;&quot;) {
var flag = value.test(signature_Date);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(4, +signature_Date.substring(0, 4) + &quot;-&quot; + signature_Date.substring(4, 6) + &quot;-&quot; + signature_Date.substring(6, 8));
}
}
}
if (drc_Count == 3) {
ec_ResultHelper.ReportResultByIndex(2, drc);
ec_ResultHelper.ReportResultByIndex(8, election_Type);
if (signature_Date !== &quot;&quot;) {
var flag = value.test(signature_Date);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(5, +signature_Date.substring(0, 4) + &quot;-&quot; + signature_Date.substring(4, 6) + &quot;-&quot; + signature_Date.substring(6, 8));
}
}
}
if (drc_Count == 4) {
ec_ResultHelper.ReportResultByIndex(9, drc);
ec_ResultHelper.ReportResultByIndex(16, election_Type);
if (signature_Date !== &quot;&quot;) {
var flag = value.test(signature_Date);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(23, +signature_Date.substring(0, 4) + &quot;-&quot; + signature_Date.substring(4, 6) + &quot;-&quot; + signature_Date.substring(6, 8));
}
}
}
if (drc_Count == 5) {
ec_ResultHelper.ReportResultByIndex(10, drc);
ec_ResultHelper.ReportResultByIndex(17, election_Type);
if (signature_Date !== &quot;&quot;) {
var flag = value.test(signature_Date);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(24, +signature_Date.substring(0, 4) + &quot;-&quot; + signature_Date.substring(4, 6) + &quot;-&quot; + signature_Date.substring(6, 8));
}
}
}
if (drc_Count == 6) {
ec_ResultHelper.ReportResultByIndex(11, drc);
ec_ResultHelper.ReportResultByIndex(18, election_Type);
if (signature_Date !== &quot;&quot;) {
var flag = value.test(signature_Date);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(25, +signature_Date.substring(0, 4) + &quot;-&quot; + signature_Date.substring(4, 6) + &quot;-&quot; + signature_Date.substring(6, 8));
}
}
}
if (drc_Count == 7) {
ec_ResultHelper.ReportResultByIndex(12, drc);
ec_ResultHelper.ReportResultByIndex(19, election_Type);
if (signature_Date !== &quot;&quot;) {
var flag = value.test(signature_Date);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(26, +signature_Date.substring(0, 4) + &quot;-&quot; + signature_Date.substring(4, 6) + &quot;-&quot; + signature_Date.substring(6, 8));
}
}
}
if (drc_Count == 8) {
ec_ResultHelper.ReportResultByIndex(13, drc);
ec_ResultHelper.ReportResultByIndex(20, election_Type);
if (signature_Date !== &quot;&quot;) {
var flag = value.test(signature_Date);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(27, +signature_Date.substring(0, 4) + &quot;-&quot; + signature_Date.substring(4, 6) + &quot;-&quot; + signature_Date.substring(6, 8));
}
}
}
if (drc_Count == 9) {
ec_ResultHelper.ReportResultByIndex(14, drc);
ec_ResultHelper.ReportResultByIndex(21, election_Type);
if (signature_Date !== &quot;&quot;) {
var flag = value.test(signature_Date);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(28, +signature_Date.substring(0, 4) + &quot;-&quot; + signature_Date.substring(4, 6) + &quot;-&quot; + signature_Date.substring(6, 8));
}
}
}
if (drc_Count == 10) {
ec_ResultHelper.ReportResultByIndex(15, drc);
ec_ResultHelper.ReportResultByIndex(22, election_Type);
if (signature_Date !== &quot;&quot;) {
var flag = value.test(signature_Date);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(29, +signature_Date.substring(0, 4) + &quot;-&quot; + signature_Date.substring(4, 6) + &quot;-&quot; + signature_Date.substring(6, 8));
}
}
}
}</P></Ps><CPs><CP ID="2308" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="793" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="790" FP="X" P="0" N="result1"/><CP ID="791" FP="X" P="1" N="result2"/><CP ID="792" FP="X" P="2" N="result3"/><CP ID="807" FP="X" P="3" N="result4"/><CP ID="808" FP="X" P="4" N="result5"/><CP ID="809" FP="X" P="5" N="result6"/><CP ID="818" FP="X" P="6" N="result7"/><CP ID="819" FP="X" P="7" N="result8"/><CP ID="820" FP="X" P="8" N="result9"/><CP ID="1338" FP="X" P="9" N="result10"/><CP ID="1339" FP="X" P="10" N="result11"/><CP ID="1340" FP="X" P="11" N="result12"/><CP ID="1341" FP="X" P="12" N="result13"/><CP ID="1342" FP="X" P="13" N="result14"/><CP ID="1343" FP="X" P="14" N="result15"/><CP ID="1344" FP="X" P="15" N="result16"/><CP ID="1345" FP="X" P="16" N="result17"/><CP ID="1346" FP="X" P="17" N="result18"/><CP ID="1347" FP="X" P="18" N="result19"/><CP ID="1348" FP="X" P="19" N="result20"/><CP ID="1349" FP="X" P="20" N="result21"/><CP ID="1350" FP="X" P="21" N="result22"/><CP ID="1351" FP="X" P="22" N="result23"/><CP ID="1352" FP="X" P="23" N="result24"/><CP ID="1353" FP="X" P="24" N="result25"/><CP ID="1354" FP="X" P="25" N="result26"/><CP ID="1355" FP="X" P="26" N="result27"/><CP ID="1356" FP="X" P="27" N="result28"/><CP ID="1357" FP="X" P="28" N="result29"/><CP ID="1358" FP="X" P="29" N="result30"/></ConnectionPoints/><F ID="190" T="ChangeVariable"><Ps C="S"><P N="variableID">28</P></Ps><CPs><CP ID="797" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="192" T="ChangeVariable"><Ps C="S"><P N="variableID">28</P></Ps><CPs><CP ID="801" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="800" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="193" T="ChangeVariable"><Ps C="S"><P N="variableID">29</P></Ps><CPs><CP ID="802" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="195" T="ChangeVariable"><Ps C="S"><P N="variableID">29</P></Ps><CPs><CP ID="806" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="805" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="196" T="ChangeVariable"><Ps C="S"><P N="variableID">30</P></Ps><CPs><CP ID="813" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="198" T="ChangeVariable"><Ps C="S"><P N="variableID">30</P></Ps><CPs><CP ID="817" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="816" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="203" N="PWO" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">1</P><P N="if_1/conditions/expression_1/arg1/type">1</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">PWO</P><P N="if_1/actions/assignment_1/lvalue">838</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">839</P><P N="if_1/actions/assignment_1/rvalue/type">2</P></Ps><CPs><CP ID="839" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="840" FP="A" P="0" N="value1"/><CP ID="838" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="204" T="Increment"><Ps C="S"><P N="variableID">31</P></Ps><CPs><CP ID="841" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="206" N="PWO_Result" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var paymentCount = ec_VariableHelper.GetVariable(&quot;Payment_Method&quot;);
var premiumOption = ec_VariableHelper.GetVariable(&quot;Premium_PWO&quot;);
var pwo_Count = ec_VariableHelper.GetVariable(&quot;PWO_Count&quot;);
var value = /[a-zA-Z!@#$%^&amp;*(),.?\&quot;:{}|&lt;&gt;]/;
var startdate = ec_VariableHelper.GetVariable(&quot;Start_Date&quot;);
var enddate = ec_VariableHelper.GetVariable(&quot;End_Date&quot;);
var transactionType = ec_VariableHelper.GetVariable(&quot;Tr_Type&quot;);
if (transactionType == &quot;PWO&quot;){
if (pwo_Count == 1) {
ec_ResultHelper.ReportResultByIndex(0, paymentCount);
ec_ResultHelper.ReportResultByIndex(6, premiumOption);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(2, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(4, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (pwo_Count == 2) {
ec_ResultHelper.ReportResultByIndex(1, paymentCount);
ec_ResultHelper.ReportResultByIndex(7, premiumOption);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(3, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(5, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (pwo_Count == 3) {
ec_ResultHelper.ReportResultByIndex(8, paymentCount);
ec_ResultHelper.ReportResultByIndex(16, premiumOption);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(24, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(32, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (pwo_Count == 4) {
ec_ResultHelper.ReportResultByIndex(9, paymentCount);
ec_ResultHelper.ReportResultByIndex(17, premiumOption);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(25, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(33, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (pwo_Count == 5) {
ec_ResultHelper.ReportResultByIndex(10, paymentCount);
ec_ResultHelper.ReportResultByIndex(18, premiumOption);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(26, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(34, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (pwo_Count == 6) {
ec_ResultHelper.ReportResultByIndex(11, paymentCount);
ec_ResultHelper.ReportResultByIndex(19, premiumOption);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(27, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(35, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (pwo_Count == 7) {
ec_ResultHelper.ReportResultByIndex(12, paymentCount);
ec_ResultHelper.ReportResultByIndex(20, premiumOption);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(28, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(36, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (pwo_Count == 8) {
ec_ResultHelper.ReportResultByIndex(13, paymentCount);
ec_ResultHelper.ReportResultByIndex(21, premiumOption);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(29, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(37, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (pwo_Count == 9) {
ec_ResultHelper.ReportResultByIndex(14, paymentCount);
ec_ResultHelper.ReportResultByIndex(22, premiumOption);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(30, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(38, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (pwo_Count == 10) {
ec_ResultHelper.ReportResultByIndex(15, paymentCount);
ec_ResultHelper.ReportResultByIndex(23, premiumOption);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(31, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(39, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}</P></Ps><CPs><CP ID="2310" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="851" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="845" FP="X" P="0" N="result1"/><CP ID="846" FP="X" P="1" N="result2"/><CP ID="847" FP="X" P="2" N="result3"/><CP ID="848" FP="X" P="3" N="result4"/><CP ID="849" FP="X" P="4" N="result5"/><CP ID="850" FP="X" P="5" N="result6"/><CP ID="870" FP="X" P="6" N="result7"/><CP ID="871" FP="X" P="7" N="result8"/><CP ID="1604" FP="X" P="8" N="result9"/><CP ID="1605" FP="X" P="9" N="result10"/><CP ID="1606" FP="X" P="10" N="result11"/><CP ID="1607" FP="X" P="11" N="result12"/><CP ID="1608" FP="X" P="12" N="result13"/><CP ID="1609" FP="X" P="13" N="result14"/><CP ID="1610" FP="X" P="14" N="result15"/><CP ID="1611" FP="X" P="15" N="result16"/><CP ID="1612" FP="X" P="16" N="result17"/><CP ID="1613" FP="X" P="17" N="result18"/><CP ID="1614" FP="X" P="18" N="result19"/><CP ID="1615" FP="X" P="19" N="result20"/><CP ID="1616" FP="X" P="20" N="result21"/><CP ID="1617" FP="X" P="21" N="result22"/><CP ID="1618" FP="X" P="22" N="result23"/><CP ID="1619" FP="X" P="23" N="result24"/><CP ID="1620" FP="X" P="24" N="result25"/><CP ID="1621" FP="X" P="25" N="result26"/><CP ID="1622" FP="X" P="26" N="result27"/><CP ID="1623" FP="X" P="27" N="result28"/><CP ID="1624" FP="X" P="28" N="result29"/><CP ID="1625" FP="X" P="29" N="result30"/><CP ID="1626" FP="X" P="30" N="result31"/><CP ID="1627" FP="X" P="31" N="result32"/><CP ID="1628" FP="X" P="32" N="result33"/><CP ID="1629" FP="X" P="33" N="result34"/><CP ID="1630" FP="X" P="34" N="result35"/><CP ID="1631" FP="X" P="35" N="result36"/><CP ID="1632" FP="X" P="36" N="result37"/><CP ID="1633" FP="X" P="37" N="result38"/><CP ID="1634" FP="X" P="38" N="result39"/><CP ID="1635" FP="X" P="39" N="result40"/></ConnectionPoints/><F ID="207" T="ChangeVariable"><Ps C="S"><P N="variableID">32</P></Ps><CPs><CP ID="852" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="211" T="ChangeVariable"><Ps C="S"><P N="variableID">32</P></Ps><CPs><CP ID="858" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="857" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="212" T="ChangeVariable"><Ps C="S"><P N="variableID">33</P></Ps><CPs><CP ID="865" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="214" T="ChangeVariable"><Ps C="S"><P N="variableID">33</P></Ps><CPs><CP ID="869" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="868" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="219" N="FLG_Increment" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">1</P><P N="if_1/conditions/expression_1/arg1/type">1</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">FLG</P><P N="if_1/actions/assignment_1/lvalue">894</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">895</P><P N="if_1/actions/assignment_1/rvalue/type">2</P></Ps><CPs><CP ID="895" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="896" FP="A" P="0" N="value1"/><CP ID="894" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="220" T="Increment"><Ps C="S"><P N="variableID">35</P></Ps><CPs><CP ID="897" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="221" N="Transcation_Type_FLG" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">1</P><P N="if_1/conditions/expression_1/arg1/type">1</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">FLG</P><P N="if_1/actions/assignment_1/lvalue">898</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">899</P><P N="if_1/actions/assignment_1/rvalue/type">2</P></Ps><CPs><CP ID="899" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="900" FP="A" P="0" N="value1"/><CP ID="898" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="222" N="Hospice_Result" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var flg_Count = ec_VariableHelper.GetVariable(&quot;FLG_Count&quot;);
var hospice = ec_VariableHelper.GetVariable(&quot;Hospice&quot;);
var startdate = ec_VariableHelper.GetVariable(&quot;Start_Date&quot;);
var enddate = ec_VariableHelper.GetVariable(&quot;End_Date&quot;);
var value = /[a-zA-Z!@#$%^&amp;*(),.?\&quot;:{}|&lt;&gt;]/;
if (flg_Count == 1) {
if(hospice == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(0, hospice);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(2, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(4, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 2) {
if(hospice == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(1, hospice);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(3, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(5, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 3) {
if(hospice == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(6, hospice);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(14, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(22, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 4) {
if(hospice == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(7, hospice);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(15, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(23, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 5) {
if(hospice == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(8, hospice);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(16, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(24, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 6) {
if(hospice == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(9, hospice);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(17, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(25, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 7) {
if(hospice == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(10, hospice);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(18, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(26, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 8) {
if(hospice == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(11, hospice);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(19, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(27, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 9) {
if(hospice == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(12, hospice);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(20, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(28, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 10) {
if(hospice == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(13, hospice);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(21, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(29, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
</P></Ps><CPs><CP ID="913" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="901" FP="X" P="0" N="result1"/><CP ID="902" FP="X" P="1" N="result2"/><CP ID="903" FP="X" P="2" N="result3"/><CP ID="904" FP="X" P="3" N="result4"/><CP ID="905" FP="X" P="4" N="result5"/><CP ID="906" FP="X" P="5" N="result6"/><CP ID="1668" FP="X" P="6" N="result7"/><CP ID="1669" FP="X" P="7" N="result8"/><CP ID="1670" FP="X" P="8" N="result9"/><CP ID="1671" FP="X" P="9" N="result10"/><CP ID="1672" FP="X" P="10" N="result11"/><CP ID="1673" FP="X" P="11" N="result12"/><CP ID="1674" FP="X" P="12" N="result13"/><CP ID="1675" FP="X" P="13" N="result14"/><CP ID="1676" FP="X" P="14" N="result15"/><CP ID="1677" FP="X" P="15" N="result16"/><CP ID="1678" FP="X" P="16" N="result17"/><CP ID="1679" FP="X" P="17" N="result18"/><CP ID="1680" FP="X" P="18" N="result19"/><CP ID="1681" FP="X" P="19" N="result20"/><CP ID="1682" FP="X" P="20" N="result21"/><CP ID="1683" FP="X" P="21" N="result22"/><CP ID="1684" FP="X" P="22" N="result23"/><CP ID="1685" FP="X" P="23" N="result24"/><CP ID="1686" FP="X" P="24" N="result25"/><CP ID="1687" FP="X" P="25" N="result26"/><CP ID="1688" FP="X" P="26" N="result27"/><CP ID="1689" FP="X" P="27" N="result28"/><CP ID="1690" FP="X" P="28" N="result29"/><CP ID="1691" FP="X" P="29" N="result30"/></ConnectionPoints/><F ID="223" T="ChangeVariable"><Ps C="S"><P N="variableID">36</P></Ps><CPs><CP ID="914" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="225" T="ChangeVariable"><Ps C="S"><P N="variableID">36</P></Ps><CPs><CP ID="918" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="917" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="227" N="Medicaid_Result" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var flg_Count = ec_VariableHelper.GetVariable(&quot;FLG_Count&quot;);
var medicaidFlg = ec_VariableHelper.GetVariable(&quot;Medicaid_Flg&quot;);
var startdate = ec_VariableHelper.GetVariable(&quot;Start_Date&quot;);
var enddate = ec_VariableHelper.GetVariable(&quot;End_Date&quot;);
var value = /[a-zA-Z!@#$%^&amp;*(),.?\&quot;:{}|&lt;&gt;]/;
if (flg_Count == 1) {
if(medicaidFlg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(0, medicaidFlg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(2, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(4, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 2) {
if(medicaidFlg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(1, medicaidFlg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(3, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(5, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 3) {
if(medicaidFlg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(6, medicaidFlg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(14, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(22, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 4) {
if(medicaidFlg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(7, medicaidFlg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(15, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(23, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 5) {
if(medicaidFlg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(8, medicaidFlg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(16, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(24, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 6) {
if(medicaidFlg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(9, medicaidFlg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(17, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(25, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 7) {
if(medicaidFlg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(10, medicaidFlg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(18, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(26, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 8) {
if(medicaidFlg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(11, medicaidFlg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(19, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(27, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 9) {
if(medicaidFlg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(12, medicaidFlg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(20, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(28, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 10) {
if(medicaidFlg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(13, medicaidFlg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(21, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(29, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
</P></Ps><CPs><CP ID="938" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="932" FP="X" P="0" N="result1"/><CP ID="933" FP="X" P="1" N="result2"/><CP ID="934" FP="X" P="2" N="result3"/><CP ID="935" FP="X" P="3" N="result4"/><CP ID="936" FP="X" P="4" N="result5"/><CP ID="937" FP="X" P="5" N="result6"/><CP ID="1716" FP="X" P="6" N="result7"/><CP ID="1717" FP="X" P="7" N="result8"/><CP ID="1718" FP="X" P="8" N="result9"/><CP ID="1719" FP="X" P="9" N="result10"/><CP ID="1720" FP="X" P="10" N="result11"/><CP ID="1721" FP="X" P="11" N="result12"/><CP ID="1722" FP="X" P="12" N="result13"/><CP ID="1723" FP="X" P="13" N="result14"/><CP ID="1724" FP="X" P="14" N="result15"/><CP ID="1725" FP="X" P="15" N="result16"/><CP ID="1726" FP="X" P="16" N="result17"/><CP ID="1727" FP="X" P="17" N="result18"/><CP ID="1728" FP="X" P="18" N="result19"/><CP ID="1729" FP="X" P="19" N="result20"/><CP ID="1730" FP="X" P="20" N="result21"/><CP ID="1731" FP="X" P="21" N="result22"/><CP ID="1732" FP="X" P="22" N="result23"/><CP ID="1733" FP="X" P="23" N="result24"/><CP ID="1734" FP="X" P="24" N="result25"/><CP ID="1735" FP="X" P="25" N="result26"/><CP ID="1736" FP="X" P="26" N="result27"/><CP ID="1737" FP="X" P="27" N="result28"/><CP ID="1738" FP="X" P="28" N="result29"/><CP ID="1739" FP="X" P="29" N="result30"/></ConnectionPoints/><F ID="229" T="ChangeVariable"><Ps C="S"><P N="variableID">37</P></Ps><CPs><CP ID="940" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="231" T="ChangeVariable"><Ps C="S"><P N="variableID">37</P></Ps><CPs><CP ID="944" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="943" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="232" T="ChangeVariable"><Ps C="S"><P N="variableID">38</P></Ps><CPs><CP ID="951" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="234" T="ChangeVariable"><Ps C="S"><P N="variableID">38</P></Ps><CPs><CP ID="955" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="954" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="236" N="Insitiutional_Result" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var flg_Count = ec_VariableHelper.GetVariable(&quot;FLG_Count&quot;);
var institutionalFlg = ec_VariableHelper.GetVariable(&quot;Institutional_Flg&quot;);
var startdate = ec_VariableHelper.GetVariable(&quot;Start_Date&quot;);
var enddate = ec_VariableHelper.GetVariable(&quot;End_Date&quot;);
var value = /[a-zA-Z!@#$%^&amp;*(),.?\&quot;:{}|&lt;&gt;]/;
if (flg_Count == 1) {
if(institutionalFlg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(0, institutionalFlg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(2, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(4, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 2) {
if(institutionalFlg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(1, institutionalFlg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(3, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(5, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 3) {
if(institutionalFlg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(6, institutionalFlg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(14, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(22, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 4) {
if(institutionalFlg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(7, institutionalFlg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(15, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(23, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 5) {
if(institutionalFlg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(8, institutionalFlg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(16, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(24, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 6) {
if(institutionalFlg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(9, institutionalFlg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(17, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(25, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 7) {
if(institutionalFlg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(10, institutionalFlg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(18, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(26, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 8) {
if(institutionalFlg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(11, institutionalFlg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(19, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(27, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 9) {
if(institutionalFlg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(12, institutionalFlg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(20, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(28, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 10) {
if(institutionalFlg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(13, institutionalFlg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(21, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(29, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
</P></Ps><CPs><CP ID="969" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="963" FP="X" P="0" N="result1"/><CP ID="964" FP="X" P="1" N="result2"/><CP ID="965" FP="X" P="2" N="result3"/><CP ID="966" FP="X" P="3" N="result4"/><CP ID="967" FP="X" P="4" N="result5"/><CP ID="968" FP="X" P="5" N="result6"/><CP ID="1764" FP="X" P="6" N="result7"/><CP ID="1765" FP="X" P="7" N="result8"/><CP ID="1766" FP="X" P="8" N="result9"/><CP ID="1767" FP="X" P="9" N="result10"/><CP ID="1768" FP="X" P="10" N="result11"/><CP ID="1769" FP="X" P="11" N="result12"/><CP ID="1770" FP="X" P="12" N="result13"/><CP ID="1771" FP="X" P="13" N="result14"/><CP ID="1772" FP="X" P="14" N="result15"/><CP ID="1773" FP="X" P="15" N="result16"/><CP ID="1774" FP="X" P="16" N="result17"/><CP ID="1775" FP="X" P="17" N="result18"/><CP ID="1776" FP="X" P="18" N="result19"/><CP ID="1777" FP="X" P="19" N="result20"/><CP ID="1778" FP="X" P="20" N="result21"/><CP ID="1779" FP="X" P="21" N="result22"/><CP ID="1780" FP="X" P="22" N="result23"/><CP ID="1781" FP="X" P="23" N="result24"/><CP ID="1782" FP="X" P="24" N="result25"/><CP ID="1783" FP="X" P="25" N="result26"/><CP ID="1784" FP="X" P="26" N="result27"/><CP ID="1785" FP="X" P="27" N="result28"/><CP ID="1786" FP="X" P="28" N="result29"/><CP ID="1787" FP="X" P="29" N="result30"/></ConnectionPoints/><F ID="237" T="ChangeVariable"><Ps C="S"><P N="variableID">39</P></Ps><CPs><CP ID="976" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="239" T="ChangeVariable"><Ps C="S"><P N="variableID">39</P></Ps><CPs><CP ID="980" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="979" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="241" N="ESRD_Result" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var flg_Count = ec_VariableHelper.GetVariable(&quot;FLG_Count&quot;);
var esrd_Flg = ec_VariableHelper.GetVariable(&quot;ESRD_Flg&quot;);
var startdate = ec_VariableHelper.GetVariable(&quot;Start_Date&quot;);
var enddate = ec_VariableHelper.GetVariable(&quot;End_Date&quot;);
var value = /[a-zA-Z!@#$%^&amp;*(),.?\&quot;:{}|&lt;&gt;]/;
if (flg_Count == 1) {
if(esrd_Flg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(0, esrd_Flg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(2, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(4, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 2) {
if(esrd_Flg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(1, esrd_Flg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(3, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(5, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 3) {
if(esrd_Flg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(6, esrd_Flg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(14, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(22, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 4) {
if(esrd_Flg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(7, esrd_Flg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(15, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(23, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 5) {
if(esrd_Flg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(8, esrd_Flg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(16, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(24, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 6) {
if(esrd_Flg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(9, esrd_Flg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(17, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(25, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 7) {
if(esrd_Flg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(10, esrd_Flg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(18, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(26, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 8) {
if(esrd_Flg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(11, esrd_Flg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(19, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(27, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 9) {
if(esrd_Flg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(12, esrd_Flg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(20, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(28, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 10) {
if(esrd_Flg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(13, esrd_Flg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(21, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(29, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
</P></Ps><CPs><CP ID="994" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="988" FP="X" P="0" N="result1"/><CP ID="989" FP="X" P="1" N="result2"/><CP ID="990" FP="X" P="2" N="result3"/><CP ID="991" FP="X" P="3" N="result4"/><CP ID="992" FP="X" P="4" N="result5"/><CP ID="993" FP="X" P="5" N="result6"/><CP ID="1908" FP="X" P="6" N="result7"/><CP ID="1909" FP="X" P="7" N="result8"/><CP ID="1910" FP="X" P="8" N="result9"/><CP ID="1911" FP="X" P="9" N="result10"/><CP ID="1912" FP="X" P="10" N="result11"/><CP ID="1913" FP="X" P="11" N="result12"/><CP ID="1914" FP="X" P="12" N="result13"/><CP ID="1915" FP="X" P="13" N="result14"/><CP ID="1916" FP="X" P="14" N="result15"/><CP ID="1917" FP="X" P="15" N="result16"/><CP ID="1918" FP="X" P="16" N="result17"/><CP ID="1919" FP="X" P="17" N="result18"/><CP ID="1920" FP="X" P="18" N="result19"/><CP ID="1921" FP="X" P="19" N="result20"/><CP ID="1922" FP="X" P="20" N="result21"/><CP ID="1923" FP="X" P="21" N="result22"/><CP ID="1924" FP="X" P="22" N="result23"/><CP ID="1925" FP="X" P="23" N="result24"/><CP ID="1926" FP="X" P="24" N="result25"/><CP ID="1927" FP="X" P="25" N="result26"/><CP ID="1928" FP="X" P="26" N="result27"/><CP ID="1929" FP="X" P="27" N="result28"/><CP ID="1930" FP="X" P="28" N="result29"/><CP ID="1931" FP="X" P="29" N="result30"/></ConnectionPoints/><F ID="243" T="ChangeVariable"><Ps C="S"><P N="variableID">40</P></Ps><CPs><CP ID="1004" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="245" T="ChangeVariable"><Ps C="S"><P N="variableID">40</P></Ps><CPs><CP ID="1008" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1007" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="247" N="Trsnaplant_Result" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var flg_Count = ec_VariableHelper.GetVariable(&quot;FLG_Count&quot;);
var transplant_Flg = ec_VariableHelper.GetVariable(&quot;Transplant_Flag&quot;);
var startdate = ec_VariableHelper.GetVariable(&quot;Start_Date&quot;);
var enddate = ec_VariableHelper.GetVariable(&quot;End_Date&quot;);
var value = /[a-zA-Z!@#$%^&amp;*(),.?\&quot;:{}|&lt;&gt;]/;
if (flg_Count == 1) {
if(transplant_Flg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(0, transplant_Flg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(2, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(4, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 2) {
if(transplant_Flg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(1, transplant_Flg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(3, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(5, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 3) {
if(transplant_Flg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(6, transplant_Flg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(14, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(22, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 4) {
if(transplant_Flg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(7, transplant_Flg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(15, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(23, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 5) {
if(transplant_Flg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(8, transplant_Flg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(16, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(24, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 6) {
if(transplant_Flg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(9, transplant_Flg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(17, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(25, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 7) {
if(transplant_Flg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(10, transplant_Flg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(18, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(26, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 8) {
if(transplant_Flg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(11, transplant_Flg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(19, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(27, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 9) {
if(transplant_Flg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(12, transplant_Flg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(20, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(28, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 10) {
if(transplant_Flg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(13, transplant_Flg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(21, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(29, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
</P></Ps><CPs><CP ID="1022" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1016" FP="X" P="0" N="result1"/><CP ID="1017" FP="X" P="1" N="result2"/><CP ID="1018" FP="X" P="2" N="result3"/><CP ID="1019" FP="X" P="3" N="result4"/><CP ID="1020" FP="X" P="4" N="result5"/><CP ID="1021" FP="X" P="5" N="result6"/><CP ID="1812" FP="X" P="6" N="result7"/><CP ID="1813" FP="X" P="7" N="result8"/><CP ID="1814" FP="X" P="8" N="result9"/><CP ID="1815" FP="X" P="9" N="result10"/><CP ID="1816" FP="X" P="10" N="result11"/><CP ID="1817" FP="X" P="11" N="result12"/><CP ID="1818" FP="X" P="12" N="result13"/><CP ID="1819" FP="X" P="13" N="result14"/><CP ID="1820" FP="X" P="14" N="result15"/><CP ID="1821" FP="X" P="15" N="result16"/><CP ID="1822" FP="X" P="16" N="result17"/><CP ID="1823" FP="X" P="17" N="result18"/><CP ID="1824" FP="X" P="18" N="result19"/><CP ID="1825" FP="X" P="19" N="result20"/><CP ID="1826" FP="X" P="20" N="result21"/><CP ID="1827" FP="X" P="21" N="result22"/><CP ID="1828" FP="X" P="22" N="result23"/><CP ID="1829" FP="X" P="23" N="result24"/><CP ID="1830" FP="X" P="24" N="result25"/><CP ID="1831" FP="X" P="25" N="result26"/><CP ID="1832" FP="X" P="26" N="result27"/><CP ID="1833" FP="X" P="27" N="result28"/><CP ID="1834" FP="X" P="28" N="result29"/><CP ID="1835" FP="X" P="29" N="result30"/></ConnectionPoints/><F ID="248" T="ChangeVariable"><Ps C="S"><P N="variableID">41</P></Ps><CPs><CP ID="1029" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="250" T="ChangeVariable"><Ps C="S"><P N="variableID">41</P></Ps><CPs><CP ID="1033" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1032" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="252" N="Dialysis_Result" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var flg_Count = ec_VariableHelper.GetVariable(&quot;FLG_Count&quot;);
var dialysis_Flg = ec_VariableHelper.GetVariable(&quot;Dialysis_Flg&quot;);
var startdate = ec_VariableHelper.GetVariable(&quot;Start_Date&quot;);
var enddate = ec_VariableHelper.GetVariable(&quot;End_Date&quot;);
var value = /[a-zA-Z!@#$%^&amp;*(),.?\&quot;:{}|&lt;&gt;]/;
if (flg_Count == 1) {
if(dialysis_Flg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(0, dialysis_Flg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(2, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(4, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 2) {
if(dialysis_Flg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(1, dialysis_Flg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(3, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(5, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 3) {
if(dialysis_Flg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(6, dialysis_Flg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(14, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(22, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 4) {
if(dialysis_Flg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(7, dialysis_Flg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(15, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(23, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 5) {
if(dialysis_Flg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(8, dialysis_Flg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(16, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(24, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 6) {
if(dialysis_Flg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(9, dialysis_Flg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(17, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(25, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 7) {
if(dialysis_Flg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(10, dialysis_Flg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(18, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(26, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 8) {
if(dialysis_Flg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(11, dialysis_Flg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(19, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(27, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 9) {
if(dialysis_Flg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(12, dialysis_Flg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(20, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(28, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 10) {
if(dialysis_Flg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(13, dialysis_Flg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(21, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(29, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
</P></Ps><CPs><CP ID="1047" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1041" FP="X" P="0" N="result1"/><CP ID="1042" FP="X" P="1" N="result2"/><CP ID="1043" FP="X" P="2" N="result3"/><CP ID="1044" FP="X" P="3" N="result4"/><CP ID="1045" FP="X" P="4" N="result5"/><CP ID="1046" FP="X" P="5" N="result6"/><CP ID="1860" FP="X" P="6" N="result7"/><CP ID="1861" FP="X" P="7" N="result8"/><CP ID="1862" FP="X" P="8" N="result9"/><CP ID="1863" FP="X" P="9" N="result10"/><CP ID="1864" FP="X" P="10" N="result11"/><CP ID="1865" FP="X" P="11" N="result12"/><CP ID="1866" FP="X" P="12" N="result13"/><CP ID="1867" FP="X" P="13" N="result14"/><CP ID="1868" FP="X" P="14" N="result15"/><CP ID="1869" FP="X" P="15" N="result16"/><CP ID="1870" FP="X" P="16" N="result17"/><CP ID="1871" FP="X" P="17" N="result18"/><CP ID="1872" FP="X" P="18" N="result19"/><CP ID="1873" FP="X" P="19" N="result20"/><CP ID="1874" FP="X" P="20" N="result21"/><CP ID="1875" FP="X" P="21" N="result22"/><CP ID="1876" FP="X" P="22" N="result23"/><CP ID="1877" FP="X" P="23" N="result24"/><CP ID="1878" FP="X" P="24" N="result25"/><CP ID="1879" FP="X" P="25" N="result26"/><CP ID="1880" FP="X" P="26" N="result27"/><CP ID="1881" FP="X" P="27" N="result28"/><CP ID="1882" FP="X" P="28" N="result29"/><CP ID="1883" FP="X" P="29" N="result30"/></ConnectionPoints/><F ID="257" N="MCD_Increment" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">1</P><P N="if_1/conditions/expression_1/arg1/type">1</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">MCD</P><P N="if_1/actions/assignment_1/lvalue">1072</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">1073</P><P N="if_1/actions/assignment_1/rvalue/type">2</P></Ps><CPs><CP ID="1073" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1074" FP="A" P="0" N="value1"/><CP ID="1072" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="258" T="Increment"><Ps C="S"><P N="variableID">42</P></Ps><CPs><CP ID="1075" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="260" N="MCD_Result" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var mcd_Count = ec_VariableHelper.GetVariable(&quot;MCD_Count&quot;);
var mcd = ec_VariableHelper.GetVariable(&quot;MCD&quot;);
var startdate = ec_VariableHelper.GetVariable(&quot;Start_Date&quot;);
var enddate = ec_VariableHelper.GetVariable(&quot;End_Date&quot;);
var value = /[a-zA-Z!@#$%^&amp;*(),.?\&quot;:{}|&lt;&gt;]/;
var transactionType = ec_VariableHelper.GetVariable(&quot;Tr_Type&quot;);
if (transactionType == &quot;MCD&quot;){
if (mcd_Count == 1) {
ec_ResultHelper.ReportResultByIndex(0, mcd);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(2, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(4, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (mcd_Count == 2) {
ec_ResultHelper.ReportResultByIndex(1, mcd);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(3, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(5, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (mcd_Count == 3) {
ec_ResultHelper.ReportResultByIndex(6, mcd);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(14, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(22, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (mcd_Count == 4) {
ec_ResultHelper.ReportResultByIndex(7, mcd);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(15, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(23, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (mcd_Count == 5) {
ec_ResultHelper.ReportResultByIndex(8, mcd);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(16, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(24, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (mcd_Count == 6) {
ec_ResultHelper.ReportResultByIndex(9, mcd);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(17, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(25, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (mcd_Count == 7) {
ec_ResultHelper.ReportResultByIndex(10, mcd);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(18, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(26, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (mcd_Count == 8) {
ec_ResultHelper.ReportResultByIndex(11, mcd);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(19, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(27, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (mcd_Count == 9) {
ec_ResultHelper.ReportResultByIndex(12, mcd);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(20, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(28, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (mcd_Count == 10) {
ec_ResultHelper.ReportResultByIndex(13, mcd);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(21, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(29, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}</P></Ps><CPs><CP ID="2311" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1089" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1079" FP="X" P="0" N="result1"/><CP ID="1080" FP="X" P="1" N="result2"/><CP ID="1081" FP="X" P="2" N="result3"/><CP ID="1082" FP="X" P="3" N="result4"/><CP ID="1083" FP="X" P="4" N="result5"/><CP ID="1084" FP="X" P="5" N="result6"/><CP ID="2004" FP="X" P="6" N="result7"/><CP ID="2005" FP="X" P="7" N="result8"/><CP ID="2006" FP="X" P="8" N="result9"/><CP ID="2007" FP="X" P="9" N="result10"/><CP ID="2008" FP="X" P="10" N="result11"/><CP ID="2009" FP="X" P="11" N="result12"/><CP ID="2010" FP="X" P="12" N="result13"/><CP ID="2011" FP="X" P="13" N="result14"/><CP ID="2012" FP="X" P="14" N="result15"/><CP ID="2013" FP="X" P="15" N="result16"/><CP ID="2014" FP="X" P="16" N="result17"/><CP ID="2015" FP="X" P="17" N="result18"/><CP ID="2016" FP="X" P="18" N="result19"/><CP ID="2017" FP="X" P="19" N="result20"/><CP ID="2018" FP="X" P="20" N="result21"/><CP ID="2019" FP="X" P="21" N="result22"/><CP ID="2020" FP="X" P="22" N="result23"/><CP ID="2021" FP="X" P="23" N="result24"/><CP ID="2022" FP="X" P="24" N="result25"/><CP ID="2023" FP="X" P="25" N="result26"/><CP ID="2024" FP="X" P="26" N="result27"/><CP ID="2025" FP="X" P="27" N="result28"/><CP ID="2026" FP="X" P="28" N="result29"/><CP ID="2027" FP="X" P="29" N="result30"/></ConnectionPoints/><F ID="261" T="ChangeVariable"><Ps C="S"><P N="variableID">43</P></Ps><CPs><CP ID="1090" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="263" T="ChangeVariable"><Ps C="S"><P N="variableID">43</P></Ps><CPs><CP ID="1094" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1093" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="268" N="COB_Increment" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">1</P><P N="if_1/conditions/expression_1/arg1/type">1</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">COB</P><P N="if_1/actions/assignment_1/lvalue">1115</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">1116</P><P N="if_1/actions/assignment_1/rvalue/type">2</P></Ps><CPs><CP ID="1116" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1117" FP="A" P="0" N="value1"/><CP ID="1115" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="269" T="Increment"><Ps C="S"><P N="variableID">44</P></Ps><CPs><CP ID="1118" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="271" N="COB_Result" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var cob_Count = ec_VariableHelper.GetVariable(&quot;COB_Count&quot;);
var subIdCoverage = ec_VariableHelper.GetVariable(&quot;SubId_Coverage&quot;);
var name_of_Coverage = ec_VariableHelper.GetVariable(&quot;Name_of_Coverage&quot;);
var covergaeGroupId = ec_VariableHelper.GetVariable(&quot;GroupId_Covergae&quot;);
var kindOfInsurance = ec_VariableHelper.GetVariable(&quot;KindOfInsurance&quot;);
var nameOfInsurance = ec_VariableHelper.GetVariable(&quot;NameOfInsurance&quot;);
var cob_Date = ec_VariableHelper.GetVariable(&quot;COB_Date&quot;);
var startdate = ec_VariableHelper.GetVariable(&quot;Start_Date&quot;);
var enddate = ec_VariableHelper.GetVariable(&quot;End_Date&quot;);
var value = /[a-zA-Z!@#$%^&amp;*(),.?\&quot;:{}|&lt;&gt;]/;
var transactionType = ec_VariableHelper.GetVariable(&quot;Tr_Type&quot;);
if (transactionType == &quot;COB&quot;){
if (cob_Count == 1) {
ec_ResultHelper.ReportResultByIndex(6, name_of_Coverage);
ec_ResultHelper.ReportResultByIndex(8, subIdCoverage);
ec_ResultHelper.ReportResultByIndex(10, covergaeGroupId);
ec_ResultHelper.ReportResultByIndex(12, kindOfInsurance);
ec_ResultHelper.ReportResultByIndex(14, nameOfInsurance);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(2, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (cob_Date !== &quot;&quot;) {
var flag = value.test(cob_Date);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(0, +cob_Date.substring(0, 4) + &quot;-&quot; + cob_Date.substring(4, 6) + &quot;-&quot; + cob_Date.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(4, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (cob_Count == 2) {
ec_ResultHelper.ReportResultByIndex(7, name_of_Coverage);
ec_ResultHelper.ReportResultByIndex(9, subIdCoverage);
ec_ResultHelper.ReportResultByIndex(11, covergaeGroupId);
ec_ResultHelper.ReportResultByIndex(13, kindOfInsurance);
ec_ResultHelper.ReportResultByIndex(15, nameOfInsurance);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(3, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (cob_Date !== &quot;&quot;) {
var flag = value.test(cob_Date);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(1, +cob_Date.substring(0, 4) + &quot;-&quot; + cob_Date.substring(4, 6) + &quot;-&quot; + cob_Date.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(5, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (cob_Count == 3) {
ec_ResultHelper.ReportResultByIndex(16, name_of_Coverage);
ec_ResultHelper.ReportResultByIndex(24, subIdCoverage);
ec_ResultHelper.ReportResultByIndex(32, covergaeGroupId);
ec_ResultHelper.ReportResultByIndex(40, kindOfInsurance);
ec_ResultHelper.ReportResultByIndex(48, nameOfInsurance);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(56, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (cob_Date !== &quot;&quot;) {
var flag = value.test(cob_Date);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(64, +cob_Date.substring(0, 4) + &quot;-&quot; + cob_Date.substring(4, 6) + &quot;-&quot; + cob_Date.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(72, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (cob_Count == 4) {
ec_ResultHelper.ReportResultByIndex(17, name_of_Coverage);
ec_ResultHelper.ReportResultByIndex(25, subIdCoverage);
ec_ResultHelper.ReportResultByIndex(33, covergaeGroupId);
ec_ResultHelper.ReportResultByIndex(41, kindOfInsurance);
ec_ResultHelper.ReportResultByIndex(49, nameOfInsurance);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(57, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (cob_Date !== &quot;&quot;) {
var flag = value.test(cob_Date);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(65, +cob_Date.substring(0, 4) + &quot;-&quot; + cob_Date.substring(4, 6) + &quot;-&quot; + cob_Date.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(73, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (cob_Count == 5) {
ec_ResultHelper.ReportResultByIndex(18, name_of_Coverage);
ec_ResultHelper.ReportResultByIndex(26, subIdCoverage);
ec_ResultHelper.ReportResultByIndex(34, covergaeGroupId);
ec_ResultHelper.ReportResultByIndex(42, kindOfInsurance);
ec_ResultHelper.ReportResultByIndex(50, nameOfInsurance);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(58, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (cob_Date !== &quot;&quot;) {
var flag = value.test(cob_Date);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(66, +cob_Date.substring(0, 4) + &quot;-&quot; + cob_Date.substring(4, 6) + &quot;-&quot; + cob_Date.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(74, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (cob_Count == 6) {
ec_ResultHelper.ReportResultByIndex(19, name_of_Coverage);
ec_ResultHelper.ReportResultByIndex(27, subIdCoverage);
ec_ResultHelper.ReportResultByIndex(35, covergaeGroupId);
ec_ResultHelper.ReportResultByIndex(43, kindOfInsurance);
ec_ResultHelper.ReportResultByIndex(51, nameOfInsurance);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(59, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (cob_Date !== &quot;&quot;) {
var flag = value.test(cob_Date);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(67, +cob_Date.substring(0, 4) + &quot;-&quot; + cob_Date.substring(4, 6) + &quot;-&quot; + cob_Date.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(75, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (cob_Count == 7) {
ec_ResultHelper.ReportResultByIndex(20, name_of_Coverage);
ec_ResultHelper.ReportResultByIndex(28, subIdCoverage);
ec_ResultHelper.ReportResultByIndex(36, covergaeGroupId);
ec_ResultHelper.ReportResultByIndex(44, kindOfInsurance);
ec_ResultHelper.ReportResultByIndex(52, nameOfInsurance);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(60, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (cob_Date !== &quot;&quot;) {
var flag = value.test(cob_Date);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(68, +cob_Date.substring(0, 4) + &quot;-&quot; + cob_Date.substring(4, 6) + &quot;-&quot; + cob_Date.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(76, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (cob_Count == 8) {
ec_ResultHelper.ReportResultByIndex(21, name_of_Coverage);
ec_ResultHelper.ReportResultByIndex(29, subIdCoverage);
ec_ResultHelper.ReportResultByIndex(37, covergaeGroupId);
ec_ResultHelper.ReportResultByIndex(45, kindOfInsurance);
ec_ResultHelper.ReportResultByIndex(53, nameOfInsurance);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(61, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (cob_Date !== &quot;&quot;) {
var flag = value.test(cob_Date);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(69, +cob_Date.substring(0, 4) + &quot;-&quot; + cob_Date.substring(4, 6) + &quot;-&quot; + cob_Date.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(77, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (cob_Count == 9) {
ec_ResultHelper.ReportResultByIndex(22, name_of_Coverage);
ec_ResultHelper.ReportResultByIndex(30, subIdCoverage);
ec_ResultHelper.ReportResultByIndex(38, covergaeGroupId);
ec_ResultHelper.ReportResultByIndex(46, kindOfInsurance);
ec_ResultHelper.ReportResultByIndex(54, nameOfInsurance);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(62, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (cob_Date !== &quot;&quot;) {
var flag = value.test(cob_Date);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(70, +cob_Date.substring(0, 4) + &quot;-&quot; + cob_Date.substring(4, 6) + &quot;-&quot; + cob_Date.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(78, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (cob_Count == 10) {
ec_ResultHelper.ReportResultByIndex(23, name_of_Coverage);
ec_ResultHelper.ReportResultByIndex(31, subIdCoverage);
ec_ResultHelper.ReportResultByIndex(39, covergaeGroupId);
ec_ResultHelper.ReportResultByIndex(47, kindOfInsurance);
ec_ResultHelper.ReportResultByIndex(55, nameOfInsurance);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(63, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (cob_Date !== &quot;&quot;) {
var flag = value.test(cob_Date);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(71, +cob_Date.substring(0, 4) + &quot;-&quot; + cob_Date.substring(4, 6) + &quot;-&quot; + cob_Date.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(79, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
</P></Ps><CPs><CP ID="2312" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1128" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1122" FP="X" P="0" N="result1"/><CP ID="1123" FP="X" P="1" N="result2"/><CP ID="1124" FP="X" P="2" N="result3"/><CP ID="1125" FP="X" P="3" N="result4"/><CP ID="1126" FP="X" P="4" N="result5"/><CP ID="1127" FP="X" P="5" N="result6"/><CP ID="1178" FP="X" P="6" N="result7"/><CP ID="1179" FP="X" P="7" N="result8"/><CP ID="1188" FP="X" P="8" N="result9"/><CP ID="1189" FP="X" P="9" N="result10"/><CP ID="1192" FP="X" P="10" N="result11"/><CP ID="1193" FP="X" P="11" N="result12"/><CP ID="1207" FP="X" P="12" N="result13"/><CP ID="1208" FP="X" P="13" N="result14"/><CP ID="1216" FP="X" P="14" N="result15"/><CP ID="1217" FP="X" P="15" N="result16"/><CP ID="2052" FP="X" P="16" N="result17"/><CP ID="2053" FP="X" P="17" N="result18"/><CP ID="2054" FP="X" P="18" N="result19"/><CP ID="2055" FP="X" P="19" N="result20"/><CP ID="2056" FP="X" P="20" N="result21"/><CP ID="2057" FP="X" P="21" N="result22"/><CP ID="2058" FP="X" P="22" N="result23"/><CP ID="2059" FP="X" P="23" N="result24"/><CP ID="2060" FP="X" P="24" N="result25"/><CP ID="2061" FP="X" P="25" N="result26"/><CP ID="2062" FP="X" P="26" N="result27"/><CP ID="2063" FP="X" P="27" N="result28"/><CP ID="2064" FP="X" P="28" N="result29"/><CP ID="2065" FP="X" P="29" N="result30"/><CP ID="2066" FP="X" P="30" N="result31"/><CP ID="2067" FP="X" P="31" N="result32"/><CP ID="2068" FP="X" P="32" N="result33"/><CP ID="2069" FP="X" P="33" N="result34"/><CP ID="2070" FP="X" P="34" N="result35"/><CP ID="2071" FP="X" P="35" N="result36"/><CP ID="2072" FP="X" P="36" N="result37"/><CP ID="2073" FP="X" P="37" N="result38"/><CP ID="2074" FP="X" P="38" N="result39"/><CP ID="2075" FP="X" P="39" N="result40"/><CP ID="2076" FP="X" P="40" N="result41"/><CP ID="2077" FP="X" P="41" N="result42"/><CP ID="2078" FP="X" P="42" N="result43"/><CP ID="2079" FP="X" P="43" N="result44"/><CP ID="2080" FP="X" P="44" N="result45"/><CP ID="2081" FP="X" P="45" N="result46"/><CP ID="2082" FP="X" P="46" N="result47"/><CP ID="2083" FP="X" P="47" N="result48"/><CP ID="2084" FP="X" P="48" N="result49"/><CP ID="2085" FP="X" P="49" N="result50"/><CP ID="2086" FP="X" P="50" N="result51"/><CP ID="2087" FP="X" P="51" N="result52"/><CP ID="2088" FP="X" P="52" N="result53"/><CP ID="2089" FP="X" P="53" N="result54"/><CP ID="2090" FP="X" P="54" N="result55"/><CP ID="2091" FP="X" P="55" N="result56"/><CP ID="2092" FP="X" P="56" N="result57"/><CP ID="2093" FP="X" P="57" N="result58"/><CP ID="2094" FP="X" P="58" N="result59"/><CP ID="2095" FP="X" P="59" N="result60"/><CP ID="2096" FP="X" P="60" N="result61"/><CP ID="2097" FP="X" P="61" N="result62"/><CP ID="2098" FP="X" P="62" N="result63"/><CP ID="2099" FP="X" P="63" N="result64"/><CP ID="2100" FP="X" P="64" N="result65"/><CP ID="2101" FP="X" P="65" N="result66"/><CP ID="2102" FP="X" P="66" N="result67"/><CP ID="2103" FP="X" P="67" N="result68"/><CP ID="2104" FP="X" P="68" N="result69"/><CP ID="2105" FP="X" P="69" N="result70"/><CP ID="2106" FP="X" P="70" N="result71"/><CP ID="2107" FP="X" P="71" N="result72"/><CP ID="2108" FP="X" P="72" N="result73"/><CP ID="2109" FP="X" P="73" N="result74"/><CP ID="2110" FP="X" P="74" N="result75"/><CP ID="2111" FP="X" P="75" N="result76"/><CP ID="2112" FP="X" P="76" N="result77"/><CP ID="2113" FP="X" P="77" N="result78"/><CP ID="2114" FP="X" P="78" N="result79"/><CP ID="2115" FP="X" P="79" N="result80"/></ConnectionPoints/><F ID="272" T="ChangeVariable"><Ps C="S"><P N="variableID">45</P></Ps><CPs><CP ID="1129" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="274" T="ChangeVariable"><Ps C="S"><P N="variableID">45</P></Ps><CPs><CP ID="1133" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1132" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="276" T="ChangeVariable"><Ps C="S"><P N="variableID">45</P></Ps><CPs><CP ID="1143" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="278" T="ChangeVariable"><Ps C="S"><P N="variableID">46</P></Ps><CPs><CP ID="1147" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="280" T="ChangeVariable"><Ps C="S"><P N="variableID">46</P></Ps><CPs><CP ID="1151" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1150" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="282" N="Disabled_Result" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var flg_Count = ec_VariableHelper.GetVariable(&quot;FLG_Count&quot;);
var disabled_flg = ec_VariableHelper.GetVariable(&quot;Disabled_Flg&quot;);
var startdate = ec_VariableHelper.GetVariable(&quot;Start_Date&quot;);
var enddate = ec_VariableHelper.GetVariable(&quot;End_Date&quot;);
var value = /[a-zA-Z!@#$%^&amp;*(),.?\&quot;:{}|&lt;&gt;]/;
if (flg_Count == 1) {
if(disabled_flg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(0, disabled_flg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(2, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(4, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 2) {
if(disabled_flg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(1, disabled_flg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(3, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(5, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 3) {
if(disabled_flg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(6, disabled_flg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(14, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(22, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 4) {
if(disabled_flg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(7, disabled_flg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(15, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(23, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 5) {
if(disabled_flg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(8, disabled_flg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(16, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(24, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 6) {
if(disabled_flg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(9, disabled_flg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(17, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(25, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 7) {
if(disabled_flg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(10, disabled_flg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(18, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(26, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 8) {
if(disabled_flg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(11, disabled_flg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(19, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(27, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 9) {
if(disabled_flg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(12, disabled_flg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(20, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(28, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
if (flg_Count == 10) {
if(disabled_flg == &quot;Y&quot;){
ec_ResultHelper.ReportResultByIndex(13, disabled_flg);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(21, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(29, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}
</P></Ps><CPs><CP ID="1165" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1159" FP="X" P="0" N="result1"/><CP ID="1160" FP="X" P="1" N="result2"/><CP ID="1161" FP="X" P="2" N="result3"/><CP ID="1162" FP="X" P="3" N="result4"/><CP ID="1163" FP="X" P="4" N="result5"/><CP ID="1164" FP="X" P="5" N="result6"/><CP ID="1956" FP="X" P="6" N="result7"/><CP ID="1957" FP="X" P="7" N="result8"/><CP ID="1958" FP="X" P="8" N="result9"/><CP ID="1959" FP="X" P="9" N="result10"/><CP ID="1960" FP="X" P="10" N="result11"/><CP ID="1961" FP="X" P="11" N="result12"/><CP ID="1962" FP="X" P="12" N="result13"/><CP ID="1963" FP="X" P="13" N="result14"/><CP ID="1964" FP="X" P="14" N="result15"/><CP ID="1965" FP="X" P="15" N="result16"/><CP ID="1966" FP="X" P="16" N="result17"/><CP ID="1967" FP="X" P="17" N="result18"/><CP ID="1968" FP="X" P="18" N="result19"/><CP ID="1969" FP="X" P="19" N="result20"/><CP ID="1970" FP="X" P="20" N="result21"/><CP ID="1971" FP="X" P="21" N="result22"/><CP ID="1972" FP="X" P="22" N="result23"/><CP ID="1973" FP="X" P="23" N="result24"/><CP ID="1974" FP="X" P="24" N="result25"/><CP ID="1975" FP="X" P="25" N="result26"/><CP ID="1976" FP="X" P="26" N="result27"/><CP ID="1977" FP="X" P="27" N="result28"/><CP ID="1978" FP="X" P="28" N="result29"/><CP ID="1979" FP="X" P="29" N="result30"/></ConnectionPoints/><F ID="283" T="ChangeVariable"><Ps C="S"><P N="variableID">47</P></Ps><CPs><CP ID="1172" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="285" T="ChangeVariable"><Ps C="S"><P N="variableID">47</P></Ps><CPs><CP ID="1177" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1175" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="287" T="ChangeVariable"><Ps C="S"><P N="variableID">48</P></Ps><CPs><CP ID="1182" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="289" T="ChangeVariable"><Ps C="S"><P N="variableID">48</P></Ps><CPs><CP ID="1186" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1185" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="290" T="ChangeVariable"><Ps C="S"><P N="variableID">49</P></Ps><CPs><CP ID="1196" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="292" T="ChangeVariable"><Ps C="S"><P N="variableID">49</P></Ps><CPs><CP ID="1200" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1199" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="293" T="ChangeVariable"><Ps C="S"><P N="variableID">50</P></Ps><CPs><CP ID="1201" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="296" T="ChangeVariable"><Ps C="S"><P N="variableID">50</P></Ps><CPs><CP ID="1206" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1205" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="297" T="ChangeVariable"><Ps C="S"><P N="variableID">51</P></Ps><CPs><CP ID="1211" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="299" T="ChangeVariable"><Ps C="S"><P N="variableID">51</P></Ps><CPs><CP ID="1215" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1214" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="300" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">1219</P><P N="if_1/conditions/expression_1/arg1/type">2</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">DEM</P><P N="if_1/actions/assignment_1/lvalue">1220</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">EOR</P></Ps><CPs><CP ID="1219" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1220" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="305" T="ChangeVariable"><Ps C="S"><P N="variableID">52</P></Ps><CPs><CP ID="1245" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="307" T="ChangeVariable"><Ps C="S"><P N="variableID">52</P></Ps><CPs><CP ID="1248" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1247" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="309" T="ChangeVariable"><Ps C="S"><P N="variableID">53</P></Ps><CPs><CP ID="2181" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="311" T="ChangeVariable"><Ps C="S"><P N="variableID">53</P></Ps><CPs><CP ID="2185" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="2186" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="313" N="M3P_Increment" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">1</P><P N="if_1/conditions/expression_1/arg1/type">1</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">M3P</P><P N="if_1/actions/assignment_1/lvalue">2190</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">2191</P><P N="if_1/actions/assignment_1/rvalue/type">2</P></Ps><CPs><CP ID="2191" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="2192" FP="A" P="0" N="value1"/><CP ID="2190" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="315" T="Increment"><Ps C="S"><P N="variableID">54</P></Ps><CPs><CP ID="2194" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="319" N="M3P_Result" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var m3p_Count = ec_VariableHelper.GetVariable(&quot;M3P_Count&quot;);
var m3p = ec_VariableHelper.GetVariable(&quot;M3P&quot;);
var startdate = ec_VariableHelper.GetVariable(&quot;Start_Date&quot;);
var enddate = ec_VariableHelper.GetVariable(&quot;End_Date&quot;);
var value = /[a-zA-Z!@#$%^&amp;*(),.?\&quot;:{}|&lt;&gt;]/;
var transactionType = ec_VariableHelper.GetVariable(&quot;Tr_Type&quot;);
if (transactionType == &quot;M3P&quot;){
if (m3p_Count == 1) {
ec_ResultHelper.ReportResultByIndex(0, m3p);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(5, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(10, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (m3p_Count == 2) {
ec_ResultHelper.ReportResultByIndex(1, m3p);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(6, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(11, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (m3p_Count == 3) {
ec_ResultHelper.ReportResultByIndex(2, m3p);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(7, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(12, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (m3p_Count == 4) {
ec_ResultHelper.ReportResultByIndex(3, m3p);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(8, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(13, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
if (m3p_Count == 5) {
ec_ResultHelper.ReportResultByIndex(4, m3p);
if (startdate !== &quot;&quot;) {
var flag = value.test(startdate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(9, +startdate.substring(0, 4) + &quot;-&quot; + startdate.substring(4, 6) + &quot;-&quot; + startdate.substring(6, 8));
}
}
if (enddate !== &quot;&quot;) {
var flag = value.test(enddate);
if (!flag) {
ec_ResultHelper.ReportResultByIndex(14, +enddate.substring(0, 4) + &quot;-&quot; + enddate.substring(4, 6) + &quot;-&quot; + enddate.substring(6, 8));
}
}
}
}</P></Ps><CPs><CP ID="2313" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="2262" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="2232" FP="X" P="0" N="result1"/><CP ID="2233" FP="X" P="1" N="result2"/><CP ID="2234" FP="X" P="2" N="result3"/><CP ID="2235" FP="X" P="3" N="result4"/><CP ID="2236" FP="X" P="4" N="result5"/><CP ID="2237" FP="X" P="5" N="result6"/><CP ID="2238" FP="X" P="6" N="result7"/><CP ID="2239" FP="X" P="7" N="result8"/><CP ID="2240" FP="X" P="8" N="result9"/><CP ID="2241" FP="X" P="9" N="result10"/><CP ID="2242" FP="X" P="10" N="result11"/><CP ID="2243" FP="X" P="11" N="result12"/><CP ID="2244" FP="X" P="12" N="result13"/><CP ID="2245" FP="X" P="13" N="result14"/><CP ID="2246" FP="X" P="14" N="result15"/></ConnectionPoints/><F ID="321" N="SOGI_Details" T="ConditionalCopy"><Ps C="S"><P N="if_1/conditions/expression_1/arg1">1</P><P N="if_1/conditions/expression_1/arg1/type">1</P><P N="if_1/conditions/expression_1/operation">0</P><P N="if_1/conditions/expression_1/operation/type">0</P><P N="if_1/conditions/expression_1/arg2">DEM</P><P N="if_1/actions/assignment_1/lvalue">2284</P><P N="if_1/actions/assignment_1/lvalue/type">2</P><P N="if_1/actions/assignment_1/rvalue">2287</P><P N="if_1/actions/assignment_1/rvalue/type">2</P><P N="if_1/actions/assignment_2/lvalue">2285</P><P N="if_1/actions/assignment_2/lvalue/type">2</P><P N="if_1/actions/assignment_2/rvalue">2288</P><P N="if_1/actions/assignment_2/rvalue/type">2</P><P N="if_1/actions/assignment_3/lvalue">2286</P><P N="if_1/actions/assignment_3/lvalue/type">2</P><P N="if_1/actions/assignment_3/rvalue">2289</P><P N="if_1/actions/assignment_3/rvalue/type">2</P></Ps><CPs><CP ID="2287" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="2288" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="2289" FP="A" P="2" N="value3"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="2284" FP="X" P="0" N="result1"/><CP ID="2285" FP="X" P="1" N="result2"/><CP ID="2286" FP="X" P="2" N="result3"/></ConnectionPoints/><F ID="326" N="Gender_Identity" T="ConversionalCopy"><Ps C="GlobalUserNotes"><P N="{a96b6725-bb36-481b-9ad0-3b4ca440bedd}">Converting the data
1.ENG=EN
2.SPA=ES
3.FRA=FR
4.GER=DE
5.OTH=OT</P></Ps><Ps C="S"><P N="in">,1,2,3,4,5</P><P N="out">,2,1,5,7,6</P><P N="comment">,,,,,</P></Ps><CPs><CP ID="2305" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="2304" FP="X" N="r"/></ConnectionPoints/><F ID="327" N="Sexual_Orientation" T="ConversionalCopy"><Ps C="GlobalUserNotes"><P N="{a96b6725-bb36-481b-9ad0-3b4ca440bedd}">Converting the data
1.ENG=EN
2.SPA=ES
3.FRA=FR
4.GER=DE
5.OTH=OT</P></Ps><Ps C="S"><P N="in">,1,2,3,4,5,6</P><P N="out">,1,2,6,4,4,5</P><P N="comment">,,,,,,</P></Ps><CPs><CP ID="2307" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="2306" FP="X" N="r"/></ConnectionPoints/><F ID="330" T="Split"><Ps C="S"><P N="separator">,</P></Ps><CPs><CP ID="2322" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="2323" FP="X" N="r"/></ConnectionPoints/><F ID="332" T="Split"><Ps C="S"><P N="separator">,</P></Ps><CPs><CP ID="2327" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="2326" FP="X" N="r"/></ConnectionPoints/></Fs><Cs><C OutputCP="16" InputCP="19"/><C OutputCP="1" InputCP="17"/><C OutputCP="18" InputCP="22"/><C OutputCP="10" InputCP="23"/><C OutputCP="24" InputCP="25"/><C OutputCP="7" InputCP="37"/><C OutputCP="36" InputCP="38"/><C OutputCP="42" InputCP="39"/><C OutputCP="40" InputCP="43"/><C OutputCP="45" InputCP="44"/><C OutputCP="46" InputCP="47"/><C OutputCP="50" InputCP="48"/><C OutputCP="49" InputCP="51"/><C OutputCP="11" InputCP="52"/><C OutputCP="53" InputCP="55"/><C OutputCP="57" InputCP="56"/><C OutputCP="58" InputCP="59"/><C OutputCP="62" InputCP="60"/><C OutputCP="61" InputCP="63"/><C OutputCP="66" InputCP="64"/><C OutputCP="65" InputCP="74"/><C OutputCP="72" InputCP="4"/><C OutputCP="71" InputCP="77"/><C OutputCP="78" InputCP="79"/><C OutputCP="80" InputCP="76"/><C OutputCP="83" InputCP="81"/><C OutputCP="82" InputCP="84"/><C OutputCP="85" InputCP="86"/><C OutputCP="3" InputCP="87"/><C OutputCP="88" InputCP="90"/><C OutputCP="89" InputCP="91"/><C OutputCP="8" InputCP="92"/><C OutputCP="93" InputCP="94"/><C OutputCP="99" InputCP="95"/><C OutputCP="96" InputCP="100"/><C OutputCP="101" InputCP="97"/><C OutputCP="98" InputCP="102"/><C OutputCP="104" InputCP="105"/><C OutputCP="106" InputCP="103"/><C OutputCP="108" InputCP="109"/><C OutputCP="110" InputCP="107"/><C OutputCP="113" InputCP="111"/><C OutputCP="112" InputCP="114"/><C OutputCP="117" InputCP="115"/><C OutputCP="116" InputCP="118"/><C OutputCP="121" InputCP="119"/><C OutputCP="120" InputCP="122"/><C OutputCP="125" InputCP="123"/><C OutputCP="124" InputCP="126"/><C OutputCP="129" InputCP="127"/><C OutputCP="128" InputCP="130"/><C OutputCP="133" InputCP="131"/><C OutputCP="132" InputCP="134"/><C OutputCP="141" InputCP="135"/><C OutputCP="136" InputCP="142"/><C OutputCP="143" InputCP="137"/><C OutputCP="138" InputCP="144"/><C OutputCP="169" InputCP="163"/><C OutputCP="170" InputCP="164"/><C OutputCP="171" InputCP="165"/><C OutputCP="157" InputCP="172"/><C OutputCP="158" InputCP="173"/><C OutputCP="159" InputCP="174"/><C OutputCP="175" InputCP="166"/><C OutputCP="15" InputCP="167"/><C OutputCP="176" InputCP="168"/><C OutputCP="160" InputCP="177"/><C OutputCP="161" InputCP="178"/><C OutputCP="162" InputCP="179"/><C OutputCP="186" InputCP="187"/><C OutputCP="193" InputCP="189"/><C OutputCP="194" InputCP="191"/><C OutputCP="188" InputCP="195"/><C OutputCP="190" InputCP="196"/><C OutputCP="192" InputCP="197"/><C OutputCP="204" InputCP="198"/><C OutputCP="199" InputCP="209"/><C OutputCP="207" InputCP="210"/><C OutputCP="208" InputCP="211"/><C OutputCP="205" InputCP="212"/><C OutputCP="213" InputCP="216"/><C OutputCP="206" InputCP="214"/><C OutputCP="215" InputCP="217"/><C OutputCP="220" InputCP="218"/><C OutputCP="219" InputCP="221"/><C OutputCP="224" InputCP="222"/><C OutputCP="223" InputCP="225"/><C OutputCP="238" InputCP="232"/><C OutputCP="239" InputCP="233"/><C OutputCP="240" InputCP="234"/><C OutputCP="241" InputCP="235"/><C OutputCP="242" InputCP="236"/><C OutputCP="243" InputCP="237"/><C OutputCP="226" InputCP="250"/><C OutputCP="227" InputCP="251"/><C OutputCP="228" InputCP="252"/><C OutputCP="229" InputCP="253"/><C OutputCP="230" InputCP="254"/><C OutputCP="231" InputCP="255"/><C OutputCP="244" InputCP="256"/><C OutputCP="245" InputCP="257"/><C OutputCP="246" InputCP="258"/><C OutputCP="247" InputCP="259"/><C OutputCP="248" InputCP="260"/><C OutputCP="249" InputCP="261"/><C OutputCP="277" InputCP="281"/><C OutputCP="280" InputCP="267"/><C OutputCP="284" InputCP="282"/><C OutputCP="283" InputCP="285"/><C OutputCP="288" InputCP="286"/><C OutputCP="287" InputCP="289"/><C OutputCP="292" InputCP="290"/><C OutputCP="291" InputCP="293"/><C OutputCP="296" InputCP="294"/><C OutputCP="295" InputCP="297"/><C OutputCP="303" InputCP="304"/><C OutputCP="305" InputCP="300"/><C OutputCP="298" InputCP="306"/><C OutputCP="299" InputCP="307"/><C OutputCP="309" InputCP="317"/><C OutputCP="315" InputCP="318"/><C OutputCP="316" InputCP="319"/><C OutputCP="324" InputCP="325"/><C OutputCP="327" InputCP="328"/><C OutputCP="330" InputCP="331"/><C OutputCP="335" InputCP="341"/><C OutputCP="336" InputCP="342"/><C OutputCP="337" InputCP="343"/><C OutputCP="310" InputCP="308"/><C OutputCP="313" InputCP="311"/><C OutputCP="314" InputCP="312"/><C OutputCP="323" InputCP="320"/><C OutputCP="326" InputCP="321"/><C OutputCP="329" InputCP="322"/><C OutputCP="338" InputCP="332"/><C OutputCP="339" InputCP="333"/><C OutputCP="340" InputCP="334"/><C OutputCP="370" InputCP="397"/><C OutputCP="398" InputCP="418"/><C OutputCP="419" InputCP="375"/><C OutputCP="399" InputCP="420"/><C OutputCP="421" InputCP="376"/><C OutputCP="400" InputCP="422"/><C OutputCP="423" InputCP="403"/><C OutputCP="401" InputCP="424"/><C OutputCP="425" InputCP="404"/><C OutputCP="402" InputCP="426"/><C OutputCP="427" InputCP="405"/><C OutputCP="434" InputCP="456"><Ps C="DataFilters"><P N="DataExistence">0</P></Ps></C><C OutputCP="451" InputCP="461"/><C OutputCP="440" InputCP="462"/><C OutputCP="21" InputCP="463"><Ps C="GuidelineFilters"><P N="Event">2</P></Ps></C><C OutputCP="452" InputCP="464"/><C OutputCP="435" InputCP="457"/><C OutputCP="436" InputCP="458"/><C OutputCP="453" InputCP="465"/><C OutputCP="454" InputCP="467"/><C OutputCP="455" InputCP="468"/><C OutputCP="437" InputCP="459"/><C OutputCP="438" InputCP="460"/><C OutputCP="21" InputCP="496"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="495" InputCP="497"/><C OutputCP="505" InputCP="352"/><C OutputCP="506" InputCP="354"/><C OutputCP="346" InputCP="507"/><C OutputCP="21" InputCP="509"/><C OutputCP="516" InputCP="513"/><C OutputCP="526" InputCP="524"/><C OutputCP="527" InputCP="525"/><C OutputCP="530" InputCP="529"/><C OutputCP="21" InputCP="533"/><C OutputCP="534" InputCP="536"/><C OutputCP="535" InputCP="537"/><C OutputCP="550" InputCP="553"/><C OutputCP="21" InputCP="551"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="575" InputCP="574"/><C OutputCP="21" InputCP="578"/><C OutputCP="567" InputCP="580"/><C OutputCP="579" InputCP="581"/><C OutputCP="21" InputCP="517"/><C OutputCP="585" InputCP="590"/><C OutputCP="586" InputCP="591"/><C OutputCP="588" InputCP="593"/><C OutputCP="589" InputCP="592"/><C OutputCP="595" InputCP="594"/><C OutputCP="21" InputCP="598"/><C OutputCP="599" InputCP="601"/><C OutputCP="600" InputCP="602"/><C OutputCP="604" InputCP="603"/><C OutputCP="21" InputCP="607"/><C OutputCP="608" InputCP="610"/><C OutputCP="609" InputCP="611"/><C OutputCP="613" InputCP="612"/><C OutputCP="21" InputCP="616"/><C OutputCP="617" InputCP="619"/><C OutputCP="618" InputCP="620"/><C OutputCP="21" InputCP="628"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="627" InputCP="631"/><C OutputCP="655" InputCP="652"/><C OutputCP="21" InputCP="656"/><C OutputCP="645" InputCP="657"/><C OutputCP="646" InputCP="658"/><C OutputCP="647" InputCP="659"/><C OutputCP="648" InputCP="660"/><C OutputCP="649" InputCP="661"/><C OutputCP="650" InputCP="662"/><C OutputCP="664" InputCP="663"/><C OutputCP="21" InputCP="667"/><C OutputCP="668" InputCP="670"/><C OutputCP="669" InputCP="671"/><C OutputCP="675" InputCP="672"/><C OutputCP="21" InputCP="676"/><C OutputCP="677" InputCP="679"/><C OutputCP="678" InputCP="680"/><C OutputCP="685" InputCP="688"/><C OutputCP="21" InputCP="686"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="710" InputCP="709"/><C OutputCP="21" InputCP="714"/><C OutputCP="702" InputCP="716"/><C OutputCP="703" InputCP="717"/><C OutputCP="715" InputCP="718"/><C OutputCP="722" InputCP="719"/><C OutputCP="21" InputCP="723"/><C OutputCP="724" InputCP="727"/><C OutputCP="725" InputCP="728"/><C OutputCP="726" InputCP="729"/><C OutputCP="21" InputCP="734"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="733" InputCP="737"/><C OutputCP="759" InputCP="758"/><C OutputCP="21" InputCP="762"/><C OutputCP="751" InputCP="763"/><C OutputCP="752" InputCP="764"/><C OutputCP="753" InputCP="765"/><C OutputCP="783" InputCP="786"/><C OutputCP="21" InputCP="784"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="790" InputCP="794"/><C OutputCP="791" InputCP="795"/><C OutputCP="792" InputCP="796"/><C OutputCP="798" InputCP="797"/><C OutputCP="21" InputCP="801"/><C OutputCP="803" InputCP="802"/><C OutputCP="21" InputCP="806"/><C OutputCP="807" InputCP="810"/><C OutputCP="808" InputCP="811"/><C OutputCP="809" InputCP="812"/><C OutputCP="814" InputCP="813"/><C OutputCP="21" InputCP="817"/><C OutputCP="818" InputCP="821"/><C OutputCP="819" InputCP="822"/><C OutputCP="820" InputCP="823"/><C OutputCP="838" InputCP="841"/><C OutputCP="21" InputCP="839"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="855" InputCP="852"/><C OutputCP="21" InputCP="858"/><C OutputCP="845" InputCP="859"/><C OutputCP="846" InputCP="860"/><C OutputCP="847" InputCP="861"/><C OutputCP="848" InputCP="862"/><C OutputCP="849" InputCP="863"/><C OutputCP="850" InputCP="864"/><C OutputCP="866" InputCP="865"/><C OutputCP="21" InputCP="869"/><C OutputCP="870" InputCP="872"/><C OutputCP="871" InputCP="873"/><C OutputCP="894" InputCP="897"/><C OutputCP="898" InputCP="913"/><C OutputCP="21" InputCP="895"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="21" InputCP="899"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="915" InputCP="914"/><C OutputCP="21" InputCP="918"/><C OutputCP="901" InputCP="919"/><C OutputCP="902" InputCP="920"/><C OutputCP="903" InputCP="921"/><C OutputCP="904" InputCP="922"/><C OutputCP="905" InputCP="923"/><C OutputCP="906" InputCP="924"/><C OutputCP="941" InputCP="940"/><C OutputCP="21" InputCP="944"/><C OutputCP="898" InputCP="938"/><C OutputCP="932" InputCP="945"/><C OutputCP="933" InputCP="946"/><C OutputCP="934" InputCP="947"/><C OutputCP="935" InputCP="948"/><C OutputCP="936" InputCP="949"/><C OutputCP="937" InputCP="950"/><C OutputCP="952" InputCP="951"/><C OutputCP="21" InputCP="955"/><C OutputCP="898" InputCP="969"/><C OutputCP="963" InputCP="970"/><C OutputCP="964" InputCP="971"/><C OutputCP="965" InputCP="972"/><C OutputCP="966" InputCP="973"/><C OutputCP="967" InputCP="974"/><C OutputCP="968" InputCP="975"/><C OutputCP="977" InputCP="976"/><C OutputCP="21" InputCP="980"/><C OutputCP="898" InputCP="994"/><C OutputCP="988" InputCP="995"/><C OutputCP="989" InputCP="996"/><C OutputCP="990" InputCP="997"/><C OutputCP="991" InputCP="998"/><C OutputCP="992" InputCP="999"/><C OutputCP="993" InputCP="1000"/><C OutputCP="1005" InputCP="1004"/><C OutputCP="21" InputCP="1008"/><C OutputCP="898" InputCP="1022"/><C OutputCP="1016" InputCP="1023"/><C OutputCP="1017" InputCP="1024"/><C OutputCP="1018" InputCP="1025"/><C OutputCP="1019" InputCP="1027"/><C OutputCP="1020" InputCP="1026"/><C OutputCP="1021" InputCP="1028"/><C OutputCP="1030" InputCP="1029"/><C OutputCP="21" InputCP="1033"/><C OutputCP="898" InputCP="1047"/><C OutputCP="1041" InputCP="1048"/><C OutputCP="1042" InputCP="1049"/><C OutputCP="1043" InputCP="1050"/><C OutputCP="1044" InputCP="1051"/><C OutputCP="1045" InputCP="1052"/><C OutputCP="1046" InputCP="1053"/><C OutputCP="1072" InputCP="1075"/><C OutputCP="21" InputCP="1073"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="1091" InputCP="1090"/><C OutputCP="1079" InputCP="1095"/><C OutputCP="1080" InputCP="1096"/><C OutputCP="1081" InputCP="1097"/><C OutputCP="1082" InputCP="1098"/><C OutputCP="1083" InputCP="1099"/><C OutputCP="1084" InputCP="1100"/><C OutputCP="1115" InputCP="1118"/><C OutputCP="21" InputCP="1116"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="1130" InputCP="1129"/><C OutputCP="21" InputCP="1133"/><C OutputCP="1122" InputCP="1134"/><C OutputCP="1123" InputCP="1135"/><C OutputCP="1124" InputCP="1136"/><C OutputCP="1125" InputCP="1137"/><C OutputCP="1126" InputCP="1138"/><C OutputCP="1127" InputCP="1139"/><C OutputCP="1144" InputCP="1143"/><C OutputCP="1148" InputCP="1147"/><C OutputCP="21" InputCP="1151"/><C OutputCP="1159" InputCP="1166"/><C OutputCP="1160" InputCP="1167"/><C OutputCP="1161" InputCP="1168"/><C OutputCP="1162" InputCP="1169"/><C OutputCP="1163" InputCP="1170"/><C OutputCP="1164" InputCP="1171"/><C OutputCP="898" InputCP="1165"/><C OutputCP="1173" InputCP="1172"/><C OutputCP="21" InputCP="1177"/><C OutputCP="1178" InputCP="1180"/><C OutputCP="1183" InputCP="1182"/><C OutputCP="21" InputCP="1186"/><C OutputCP="1179" InputCP="1187"/><C OutputCP="1188" InputCP="1190"/><C OutputCP="1189" InputCP="1191"/><C OutputCP="1192" InputCP="1194"/><C OutputCP="1193" InputCP="1195"/><C OutputCP="1197" InputCP="1196"/><C OutputCP="21" InputCP="1200"/><C OutputCP="1202" InputCP="1201"/><C OutputCP="21" InputCP="1206"/><C OutputCP="1207" InputCP="1209"/><C OutputCP="1208" InputCP="1210"/><C OutputCP="1212" InputCP="1211"/><C OutputCP="21" InputCP="1215"/><C OutputCP="1216" InputCP="1181"/><C OutputCP="1217" InputCP="1218"/><C OutputCP="1220" InputCP="1221"/><C OutputCP="16" InputCP="1219"/><C OutputCP="1222" InputCP="1225"/><C OutputCP="1223" InputCP="1226"/><C OutputCP="1224" InputCP="1227"/><C OutputCP="1228" InputCP="1231"/><C OutputCP="1229" InputCP="1232"/><C OutputCP="1230" InputCP="1233"/><C OutputCP="1" InputCP="1245"/><C OutputCP="21" InputCP="1248"/><C OutputCP="1267" InputCP="1266"></C><C OutputCP="266" InputCP="279"><Ps C="DataFilters"><P N="DataExistence">2</P></Ps></C><C OutputCP="1282" InputCP="1296"/><C OutputCP="1283" InputCP="1297"/><C OutputCP="1284" InputCP="1298"/><C OutputCP="1285" InputCP="1299"/><C OutputCP="1286" InputCP="1300"/><C OutputCP="1287" InputCP="1301"/><C OutputCP="1288" InputCP="1302"/><C OutputCP="1289" InputCP="1303"/><C OutputCP="1290" InputCP="1304"/><C OutputCP="1291" InputCP="1305"/><C OutputCP="1292" InputCP="1306"/><C OutputCP="1293" InputCP="1307"/><C OutputCP="1294" InputCP="1308"/><C OutputCP="1295" InputCP="1309"/><C OutputCP="1268" InputCP="1310"/><C OutputCP="1269" InputCP="1311"/><C OutputCP="1270" InputCP="1312"/><C OutputCP="1271" InputCP="1313"/><C OutputCP="1272" InputCP="1314"/><C OutputCP="1273" InputCP="1315"/><C OutputCP="1274" InputCP="1316"/><C OutputCP="1275" InputCP="1317"/><C OutputCP="1276" InputCP="1318"/><C OutputCP="1277" InputCP="1319"/><C OutputCP="1278" InputCP="1320"/><C OutputCP="1279" InputCP="1321"/><C OutputCP="1280" InputCP="1322"/><C OutputCP="1281" InputCP="1323"/><C OutputCP="1324" InputCP="1331"/><C OutputCP="1325" InputCP="1332"/><C OutputCP="1326" InputCP="1333"/><C OutputCP="1327" InputCP="1334"/><C OutputCP="1328" InputCP="1335"/><C OutputCP="1329" InputCP="1336"/><C OutputCP="1330" InputCP="1337"/><C OutputCP="1338" InputCP="1359"/><C OutputCP="1339" InputCP="1360"/><C OutputCP="1340" InputCP="1361"/><C OutputCP="1341" InputCP="1362"/><C OutputCP="1342" InputCP="1363"/><C OutputCP="1343" InputCP="1364"/><C OutputCP="1344" InputCP="1365"/><C OutputCP="1345" InputCP="1366"/><C OutputCP="1346" InputCP="1367"/><C OutputCP="1347" InputCP="1368"/><C OutputCP="1348" InputCP="1369"/><C OutputCP="1349" InputCP="1370"/><C OutputCP="1350" InputCP="1371"/><C OutputCP="1351" InputCP="1372"/><C OutputCP="1352" InputCP="1373"/><C OutputCP="1353" InputCP="1374"/><C OutputCP="1354" InputCP="1375"/><C OutputCP="1355" InputCP="1376"/><C OutputCP="1356" InputCP="1377"/><C OutputCP="1357" InputCP="1378"/><C OutputCP="1358" InputCP="1379"/><C OutputCP="1380" InputCP="1404"/><C OutputCP="1381" InputCP="1405"/><C OutputCP="1382" InputCP="1406"/><C OutputCP="1383" InputCP="1407"/><C OutputCP="1384" InputCP="1408"/><C OutputCP="1385" InputCP="1409"/><C OutputCP="1386" InputCP="1410"/><C OutputCP="1387" InputCP="1411"/><C OutputCP="1388" InputCP="1412"/><C OutputCP="1389" InputCP="1413"/><C OutputCP="1390" InputCP="1414"/><C OutputCP="1391" InputCP="1415"/><C OutputCP="1392" InputCP="1416"/><C OutputCP="1393" InputCP="1417"/><C OutputCP="1394" InputCP="1418"/><C OutputCP="1395" InputCP="1419"/><C OutputCP="1396" InputCP="1420"/><C OutputCP="1397" InputCP="1421"/><C OutputCP="1398" InputCP="1422"/><C OutputCP="1399" InputCP="1423"/><C OutputCP="1400" InputCP="1424"/><C OutputCP="1401" InputCP="1425"/><C OutputCP="1402" InputCP="1426"/><C OutputCP="1403" InputCP="1427"/><C OutputCP="1428" InputCP="1476"/><C OutputCP="1429" InputCP="1477"/><C OutputCP="1430" InputCP="1478"/><C OutputCP="1431" InputCP="1479"/><C OutputCP="1432" InputCP="1480"/><C OutputCP="1433" InputCP="1481"/><C OutputCP="1434" InputCP="1482"/><C OutputCP="1435" InputCP="1483"/><C OutputCP="1436" InputCP="1484"/><C OutputCP="1437" InputCP="1485"/><C OutputCP="1438" InputCP="1486"/><C OutputCP="1439" InputCP="1487"/><C OutputCP="1440" InputCP="1488"/><C OutputCP="1441" InputCP="1489"/><C OutputCP="1442" InputCP="1490"/><C OutputCP="1443" InputCP="1491"/><C OutputCP="1451" InputCP="1492"/><C OutputCP="1450" InputCP="1493"/><C OutputCP="1449" InputCP="1494"/><C OutputCP="1448" InputCP="1495"/><C OutputCP="1447" InputCP="1496"/><C OutputCP="1446" InputCP="1497"/><C OutputCP="1445" InputCP="1498"/><C OutputCP="1444" InputCP="1499"/><C OutputCP="1452" InputCP="1500"/><C OutputCP="1453" InputCP="1501"/><C OutputCP="1454" InputCP="1502"/><C OutputCP="1455" InputCP="1503"/><C OutputCP="1456" InputCP="1504"/><C OutputCP="1457" InputCP="1505"/><C OutputCP="1458" InputCP="1506"/><C OutputCP="1459" InputCP="1507"/><C OutputCP="1467" InputCP="1508"/><C OutputCP="1466" InputCP="1509"/><C OutputCP="1465" InputCP="1510"/><C OutputCP="1464" InputCP="1511"/><C OutputCP="1463" InputCP="1512"/><C OutputCP="1462" InputCP="1513"/><C OutputCP="1461" InputCP="1514"/><C OutputCP="1460" InputCP="1515"/><C OutputCP="1468" InputCP="1516"/><C OutputCP="1469" InputCP="1517"/><C OutputCP="1470" InputCP="1518"/><C OutputCP="1471" InputCP="1519"/><C OutputCP="1472" InputCP="1520"/><C OutputCP="1473" InputCP="1521"/><C OutputCP="1474" InputCP="1522"/><C OutputCP="1475" InputCP="1523"/><C OutputCP="1524" InputCP="1564"/><C OutputCP="1525" InputCP="1565"/><C OutputCP="1526" InputCP="1566"/><C OutputCP="1527" InputCP="1567"/><C OutputCP="1528" InputCP="1568"/><C OutputCP="1529" InputCP="1569"/><C OutputCP="1530" InputCP="1570"/><C OutputCP="1531" InputCP="1571"/><C OutputCP="1539" InputCP="1572"/><C OutputCP="1538" InputCP="1573"/><C OutputCP="1537" InputCP="1574"/><C OutputCP="1536" InputCP="1575"/><C OutputCP="1535" InputCP="1576"/><C OutputCP="1534" InputCP="1577"/><C OutputCP="1533" InputCP="1578"/><C OutputCP="1532" InputCP="1579"/><C OutputCP="1540" InputCP="1580"/><C OutputCP="1541" InputCP="1581"/><C OutputCP="1542" InputCP="1582"/><C OutputCP="1543" InputCP="1583"/><C OutputCP="1544" InputCP="1584"/><C OutputCP="1545" InputCP="1585"/><C OutputCP="1546" InputCP="1586"/><C OutputCP="1547" InputCP="1587"/><C OutputCP="1555" InputCP="1588"/><C OutputCP="1554" InputCP="1589"/><C OutputCP="1553" InputCP="1590"/><C OutputCP="1552" InputCP="1591"/><C OutputCP="1551" InputCP="1592"/><C OutputCP="1550" InputCP="1593"/><C OutputCP="1549" InputCP="1594"/><C OutputCP="1548" InputCP="1595"/><C OutputCP="1556" InputCP="1596"/><C OutputCP="1557" InputCP="1597"/><C OutputCP="1558" InputCP="1598"/><C OutputCP="1559" InputCP="1599"/><C OutputCP="1560" InputCP="1600"/><C OutputCP="1561" InputCP="1601"/><C OutputCP="1562" InputCP="1602"/><C OutputCP="1563" InputCP="1603"/><C OutputCP="1604" InputCP="1636"/><C OutputCP="1605" InputCP="1637"/><C OutputCP="1606" InputCP="1638"/><C OutputCP="1607" InputCP="1639"/><C OutputCP="1608" InputCP="1640"/><C OutputCP="1609" InputCP="1641"/><C OutputCP="1610" InputCP="1643"/><C OutputCP="1611" InputCP="1644"/><C OutputCP="1612" InputCP="1650"/><C OutputCP="1613" InputCP="1651"/><C OutputCP="1614" InputCP="1649"/><C OutputCP="1615" InputCP="1648"/><C OutputCP="1616" InputCP="1647"/><C OutputCP="1617" InputCP="1646"/><C OutputCP="1618" InputCP="1642"/><C OutputCP="1619" InputCP="1645"/><C OutputCP="1627" InputCP="1652"/><C OutputCP="1626" InputCP="1653"/><C OutputCP="1625" InputCP="1654"/><C OutputCP="1624" InputCP="1655"/><C OutputCP="1623" InputCP="1656"/><C OutputCP="1622" InputCP="1658"/><C OutputCP="1621" InputCP="1659"/><C OutputCP="1620" InputCP="1660"/><C OutputCP="1628" InputCP="1657"/><C OutputCP="1629" InputCP="1661"/><C OutputCP="1630" InputCP="1662"/><C OutputCP="1631" InputCP="1663"/><C OutputCP="1632" InputCP="1664"/><C OutputCP="1633" InputCP="1665"/><C OutputCP="1634" InputCP="1666"/><C OutputCP="1635" InputCP="1667"/><C OutputCP="1668" InputCP="1692"/><C OutputCP="1669" InputCP="1693"/><C OutputCP="1670" InputCP="1694"/><C OutputCP="1671" InputCP="1695"/><C OutputCP="1672" InputCP="1696"/><C OutputCP="1673" InputCP="1697"/><C OutputCP="1674" InputCP="1698"/><C OutputCP="1675" InputCP="1699"/><C OutputCP="1676" InputCP="1700"/><C OutputCP="1677" InputCP="1701"/><C OutputCP="1678" InputCP="1702"/><C OutputCP="1679" InputCP="1703"/><C OutputCP="1680" InputCP="1704"/><C OutputCP="1681" InputCP="1705"/><C OutputCP="1682" InputCP="1706"/><C OutputCP="1683" InputCP="1707"/><C OutputCP="1684" InputCP="1708"/><C OutputCP="1685" InputCP="1709"/><C OutputCP="1686" InputCP="1710"/><C OutputCP="1687" InputCP="1711"/><C OutputCP="1688" InputCP="1712"/><C OutputCP="1689" InputCP="1713"/><C OutputCP="1690" InputCP="1714"/><C OutputCP="1691" InputCP="1715"/><C OutputCP="1716" InputCP="1740"/><C OutputCP="1717" InputCP="1741"/><C OutputCP="1718" InputCP="1742"/><C OutputCP="1719" InputCP="1743"/><C OutputCP="1720" InputCP="1744"/><C OutputCP="1721" InputCP="1745"/><C OutputCP="1722" InputCP="1746"/><C OutputCP="1723" InputCP="1747"/><C OutputCP="1724" InputCP="1748"/><C OutputCP="1725" InputCP="1749"/><C OutputCP="1726" InputCP="1750"/><C OutputCP="1727" InputCP="1751"/><C OutputCP="1728" InputCP="1752"/><C OutputCP="1729" InputCP="1753"/><C OutputCP="1730" InputCP="1754"/><C OutputCP="1731" InputCP="1755"/><C OutputCP="1732" InputCP="1756"/><C OutputCP="1733" InputCP="1757"/><C OutputCP="1734" InputCP="1758"/><C OutputCP="1735" InputCP="1759"/><C OutputCP="1736" InputCP="1760"/><C OutputCP="1737" InputCP="1761"/><C OutputCP="1738" InputCP="1762"/><C OutputCP="1739" InputCP="1763"/><C OutputCP="1764" InputCP="1788"/><C OutputCP="1765" InputCP="1789"/><C OutputCP="1766" InputCP="1790"/><C OutputCP="1767" InputCP="1791"/><C OutputCP="1768" InputCP="1792"/><C OutputCP="1769" InputCP="1793"/><C OutputCP="1770" InputCP="1794"/><C OutputCP="1771" InputCP="1795"/><C OutputCP="1772" InputCP="1796"/><C OutputCP="1773" InputCP="1797"/><C OutputCP="1774" InputCP="1798"/><C OutputCP="1775" InputCP="1799"/><C OutputCP="1776" InputCP="1800"/><C OutputCP="1777" InputCP="1801"/><C OutputCP="1778" InputCP="1802"/><C OutputCP="1779" InputCP="1803"/><C OutputCP="1780" InputCP="1804"/><C OutputCP="1781" InputCP="1805"/><C OutputCP="1782" InputCP="1806"/><C OutputCP="1783" InputCP="1807"/><C OutputCP="1784" InputCP="1808"/><C OutputCP="1785" InputCP="1809"/><C OutputCP="1786" InputCP="1810"/><C OutputCP="1787" InputCP="1811"/><C OutputCP="1812" InputCP="1836"/><C OutputCP="1813" InputCP="1837"/><C OutputCP="1814" InputCP="1838"/><C OutputCP="1815" InputCP="1839"/><C OutputCP="1816" InputCP="1840"/><C OutputCP="1817" InputCP="1841"/><C OutputCP="1818" InputCP="1842"/><C OutputCP="1819" InputCP="1843"/><C OutputCP="1820" InputCP="1844"/><C OutputCP="1821" InputCP="1845"/><C OutputCP="1822" InputCP="1846"/><C OutputCP="1823" InputCP="1847"/><C OutputCP="1824" InputCP="1848"/><C OutputCP="1825" InputCP="1849"/><C OutputCP="1826" InputCP="1850"/><C OutputCP="1827" InputCP="1851"/><C OutputCP="1828" InputCP="1852"/><C OutputCP="1829" InputCP="1853"/><C OutputCP="1830" InputCP="1854"/><C OutputCP="1831" InputCP="1855"/><C OutputCP="1832" InputCP="1856"/><C OutputCP="1833" InputCP="1857"/><C OutputCP="1834" InputCP="1858"/><C OutputCP="1835" InputCP="1859"/><C OutputCP="1860" InputCP="1884"/><C OutputCP="1861" InputCP="1885"/><C OutputCP="1862" InputCP="1886"/><C OutputCP="1863" InputCP="1887"/><C OutputCP="1864" InputCP="1888"/><C OutputCP="1865" InputCP="1889"/><C OutputCP="1866" InputCP="1890"/><C OutputCP="1867" InputCP="1891"/><C OutputCP="1868" InputCP="1892"/><C OutputCP="1869" InputCP="1893"/><C OutputCP="1870" InputCP="1894"/><C OutputCP="1871" InputCP="1895"/><C OutputCP="1872" InputCP="1896"/><C OutputCP="1873" InputCP="1897"/><C OutputCP="1874" InputCP="1898"/><C OutputCP="1875" InputCP="1899"/><C OutputCP="1876" InputCP="1900"/><C OutputCP="1877" InputCP="1901"/><C OutputCP="1878" InputCP="1902"/><C OutputCP="1879" InputCP="1903"/><C OutputCP="1880" InputCP="1904"/><C OutputCP="1881" InputCP="1905"/><C OutputCP="1882" InputCP="1906"/><C OutputCP="1883" InputCP="1907"/><C OutputCP="1931" InputCP="1932"/><C OutputCP="1930" InputCP="1933"/><C OutputCP="1929" InputCP="1934"/><C OutputCP="1928" InputCP="1935"/><C OutputCP="1927" InputCP="1936"/><C OutputCP="1926" InputCP="1937"/><C OutputCP="1925" InputCP="1938"/><C OutputCP="1924" InputCP="1939"/><C OutputCP="1923" InputCP="1940"/><C OutputCP="1922" InputCP="1941"/><C OutputCP="1921" InputCP="1942"/><C OutputCP="1920" InputCP="1943"/><C OutputCP="1919" InputCP="1944"/><C OutputCP="1918" InputCP="1945"/><C OutputCP="1917" InputCP="1946"/><C OutputCP="1916" InputCP="1947"/><C OutputCP="1908" InputCP="1948"/><C OutputCP="1909" InputCP="1949"/><C OutputCP="1910" InputCP="1950"/><C OutputCP="1911" InputCP="1951"/><C OutputCP="1912" InputCP="1952"/><C OutputCP="1913" InputCP="1953"/><C OutputCP="1914" InputCP="1954"/><C OutputCP="1915" InputCP="1955"/><C OutputCP="1979" InputCP="1980"/><C OutputCP="1978" InputCP="1981"/><C OutputCP="1977" InputCP="1982"/><C OutputCP="1976" InputCP="1983"/><C OutputCP="1975" InputCP="1984"/><C OutputCP="1974" InputCP="1985"/><C OutputCP="1973" InputCP="1986"/><C OutputCP="1956" InputCP="1996"/><C OutputCP="1957" InputCP="1997"/><C OutputCP="1958" InputCP="1998"/><C OutputCP="1959" InputCP="1999"/><C OutputCP="1960" InputCP="2000"/><C OutputCP="1961" InputCP="2001"/><C OutputCP="1962" InputCP="2002"/><C OutputCP="1963" InputCP="2003"/><C OutputCP="1972" InputCP="1987"/><C OutputCP="1964" InputCP="1995"/><C OutputCP="1965" InputCP="1994"/><C OutputCP="1966" InputCP="1993"/><C OutputCP="1967" InputCP="1992"/><C OutputCP="1968" InputCP="1991"/><C OutputCP="1969" InputCP="1990"/><C OutputCP="1970" InputCP="1989"/><C OutputCP="1971" InputCP="1988"/><C OutputCP="2027" InputCP="2028"/><C OutputCP="2026" InputCP="2029"/><C OutputCP="2025" InputCP="2030"/><C OutputCP="2024" InputCP="2031"/><C OutputCP="2023" InputCP="2032"/><C OutputCP="2022" InputCP="2033"/><C OutputCP="2021" InputCP="2034"/><C OutputCP="2020" InputCP="2035"/><C OutputCP="2019" InputCP="2036"/><C OutputCP="2018" InputCP="2037"/><C OutputCP="2017" InputCP="2038"/><C OutputCP="2016" InputCP="2039"/><C OutputCP="2015" InputCP="2040"/><C OutputCP="2014" InputCP="2041"/><C OutputCP="2013" InputCP="2042"/><C OutputCP="2012" InputCP="2043"/><C OutputCP="2011" InputCP="2044"/><C OutputCP="2010" InputCP="2045"/><C OutputCP="2009" InputCP="2046"/><C OutputCP="2008" InputCP="2047"/><C OutputCP="2007" InputCP="2048"/><C OutputCP="2006" InputCP="2049"/><C OutputCP="2005" InputCP="2050"/><C OutputCP="2004" InputCP="2051"/><C OutputCP="2052" InputCP="2116"/><C OutputCP="2053" InputCP="2117"/><C OutputCP="2054" InputCP="2118"/><C OutputCP="2055" InputCP="2119"/><C OutputCP="2056" InputCP="2120"/><C OutputCP="2057" InputCP="2121"/><C OutputCP="2058" InputCP="2122"/><C OutputCP="2059" InputCP="2123"/><C OutputCP="2067" InputCP="2124"/><C OutputCP="2066" InputCP="2125"/><C OutputCP="2065" InputCP="2126"/><C OutputCP="2064" InputCP="2127"/><C OutputCP="2063" InputCP="2128"/><C OutputCP="2062" InputCP="2129"/><C OutputCP="2061" InputCP="2130"/><C OutputCP="2060" InputCP="2131"/><C OutputCP="2068" InputCP="2133"/><C OutputCP="2069" InputCP="2134"/><C OutputCP="2070" InputCP="2135"/><C OutputCP="2071" InputCP="2136"/><C OutputCP="2072" InputCP="2137"/><C OutputCP="2073" InputCP="2138"/><C OutputCP="2074" InputCP="2139"/><C OutputCP="2075" InputCP="2140"/><C OutputCP="2083" InputCP="2141"/><C OutputCP="2082" InputCP="2142"/><C OutputCP="2081" InputCP="2143"/><C OutputCP="2080" InputCP="2144"/><C OutputCP="2079" InputCP="2145"/><C OutputCP="2078" InputCP="2146"/><C OutputCP="2077" InputCP="2147"/><C OutputCP="2076" InputCP="2148"/><C OutputCP="2084" InputCP="2149"/><C OutputCP="2085" InputCP="2150"/><C OutputCP="2086" InputCP="2151"/><C OutputCP="2087" InputCP="2152"/><C OutputCP="2088" InputCP="2153"/><C OutputCP="2089" InputCP="2154"/><C OutputCP="2090" InputCP="2155"/><C OutputCP="2091" InputCP="2156"/><C OutputCP="2099" InputCP="2157"/><C OutputCP="2098" InputCP="2158"/><C OutputCP="2097" InputCP="2159"/><C OutputCP="2096" InputCP="2160"/><C OutputCP="2095" InputCP="2161"/><C OutputCP="2094" InputCP="2163"/><C OutputCP="2093" InputCP="2164"/><C OutputCP="2092" InputCP="2165"/><C OutputCP="2100" InputCP="2132"/><C OutputCP="2101" InputCP="2166"/><C OutputCP="2102" InputCP="2167"/><C OutputCP="2103" InputCP="2162"/><C OutputCP="2104" InputCP="2168"/><C OutputCP="2105" InputCP="2169"/><C OutputCP="2106" InputCP="2170"/><C OutputCP="2107" InputCP="2171"/><C OutputCP="2115" InputCP="2172"/><C OutputCP="2114" InputCP="2173"/><C OutputCP="2113" InputCP="2174"/><C OutputCP="2112" InputCP="2175"/><C OutputCP="2111" InputCP="2176"/><C OutputCP="2110" InputCP="2177"/><C OutputCP="2109" InputCP="2178"/><C OutputCP="2108" InputCP="2179"/><C OutputCP="21" InputCP="1094"/><C OutputCP="2182" InputCP="2181"/><C OutputCP="21" InputCP="2185"/><C OutputCP="21" InputCP="2191"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="2190" InputCP="2194"/><C OutputCP="2232" InputCP="2263"/><C OutputCP="2233" InputCP="2264"/><C OutputCP="2234" InputCP="2265"/><C OutputCP="2235" InputCP="2266"/><C OutputCP="2236" InputCP="2267"/><C OutputCP="2237" InputCP="2268"/><C OutputCP="2238" InputCP="2269"/><C OutputCP="2239" InputCP="2270"/><C OutputCP="2240" InputCP="2271"/><C OutputCP="2241" InputCP="2272"/><C OutputCP="2242" InputCP="2273"/><C OutputCP="2243" InputCP="2274"/><C OutputCP="2244" InputCP="2275"/><C OutputCP="2245" InputCP="2276"/><C OutputCP="2246" InputCP="2277"/><C OutputCP="2292" InputCP="2289"/><C OutputCP="21" InputCP="2296"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="2304" InputCP="2293"/><C OutputCP="2286" InputCP="2295"/><C OutputCP="2306" InputCP="2294"/><C OutputCP="21" InputCP="2308"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="21" InputCP="2309"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="21" InputCP="2310"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="21" InputCP="2311"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="21" InputCP="2312"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="21" InputCP="2313"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="21" InputCP="2314"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="21" InputCP="2315"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="21" InputCP="2317"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="2291" InputCP="2288"/><C OutputCP="2290" InputCP="2287"/><C OutputCP="2284" InputCP="2322"/><C OutputCP="2323" InputCP="2305"/><C OutputCP="2285" InputCP="2327"/><C OutputCP="2326" InputCP="2307"/></Cs></Map>
</file>
<file path="ArtifactsRepository/EnrollmentAutomation/IBEnrollmentADV/SplitRule/P_IB_DFF_Splitrule.xml">
<?xml version="1.0" encoding="UTF-8"?><DataSplitRules Version="2.0" N="Data Splitting rules" Description="Default data splitting rule set" xsi:noNamespaceSchemaLocation="DataSplitRules.xsd" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"><Rule name="bad">Message[@AckCode='R' and @SubscriberID='##unique##']</Rule><Rule name="good">Message[@AckCode='A' and @SubscriberID='##unique##']</Rule></DataSplitRules>
</file>
<file path="ArtifactsRepository/EnrollmentAutomation/IBEnrollmentADV/Template/P_IB_CSV_Header.txt">
Subscriber ID,ClaimsSubscriberIDNumber,BenefitPlanStartDate_1,BenefitPlanEndDate_1,BenefitPlanStartDate_2,BenefitPlanEndDate_2,BenefitPlanStartDate_3,BenefitPlanEndDate_3,BenefitPlanStartDate_4,BenefitPlanEndDate_4,BenefitPlanStartDate_5,BenefitPlanEndDate_5,BenefitPlanStartDate_6,BenefitPlanEndDate_6,BenefitPlanStartDate_7,BenefitPlanEndDate_7,BenefitPlanStartDate_8,BenefitPlanEndDate_8,BenefitPlanStartDate_9,BenefitPlanEndDate_9,BenefitPlanStartDate_10,BenefitPlanEndDate_10,SubscriberFlag,MBI,MemberLastName,MemberFirstName,MiddleInitial,MemberTitle,MemberStatus,AlternateMemberID,MemberDateofBirth,MemberDateofDeath,MemberGender,MemberSocialSecurityNumber,MemberPermanentAddress _1,MemberPermanentAddress_2,Member Permanent Address_3,MemberPermanentCity,MemberPermanentCounty,MemberPermanentState,MemberPermanentZipCode,MemberMailingAddress_1,MemberMailingAddress_2,MemberMailingAddress_3,MemberMailingCity,MemberMailingState,MemberMailingZipCode,MemberBillingAddress_1,MemberBillingAddress_2,MemberBillingAddress_3,MemberBillingCity,MemberBillingState,MemberBillingZipCode,MemberHomePhoneNumber,AlternateMemberPhoneNumber,MemberEmailAddress,FirstNameofEmergencyContact,LastNameofEmergencyContact,EmergencyContactRelationshiptoMember,EmergencyContactPhoneNumber,EndangeredMemberFlag,MedicaidID,MedicarePartAEffDate,MedicarePartAEndDate,MedicarePartBEffDate,MedicarePartBEndDate,MedicarePartDEffDate,MedicarePartDEndDate,LanguageCode,AlternativeFormatLargePrint,AlternativeFormatBraille,AlternativeFormatAudioTape,FaxNumber,AuthorizedRepFirstName,AuthorizedRepLastName,AuthorizedRepAddress_1,AuthorizedRepAddress_2,AuthorizedRepAddress_3,AuthorizedRepCity,AuthorizedRepCounty,AuthorizedRepState,AuthorizedRepZipCode,AuthorizedRepPhoneNumber,AuthorizedRepRelationship,Race_1,Race_2,Race_3,Race_4,Race_5,Ethnicity_1,Ethnicity_2,Ethnicity_3,Ethnicity_4,Ethnicity_5,ProviderNumber_1,PCP_Startdate1,PCP_Enddate1,ProviderNumber_2,PCP_Startdate2,PCP_Enddate2,ProviderNumber_3,PCP_Startdate3,PCP_Enddate3,ProviderNumber_4,PCP_Startdate4,PCP_Enddate4,ProviderNumber_5,PCP_Startdate5,PCP_Enddate5,ProviderNumber_6,PCP_Startdate6,PCP_Enddate6,ProviderNumber_7,PCP_Startdate7,PCP_Enddate7,ProviderNumber_8,PCP_Startdate8,PCP_Enddate8,ProviderNumber_9,PCP_Startdate9,PCP_Enddate9,ProviderNumber_10,PCP_Startdate10,PCP_Enddate10,LEPNumberofUncoveredMonths_1,PartDLEPAmount_1,PartDLEPWaivedAmount_1,PartDLEPSubsidyAmount_1,PartDLEPStartdate1,PartDLEPEnddate1,LEPNumberofUncoveredMonths_2,PartDLEPAmount_2,PartDLEPWaivedAmount_2,PartDLEPSubsidyAmount_2,PartDLEPStartdate2,PartDLEPEnddate2,LEPNumberofUncoveredMonths_3,PartDLEPAmount_3,PartDLEPWaivedAmount_3,PartDLEPSubsidyAmount_3,PartDLEPStartdate3,PartDLEPEnddate3,LEPNumberofUncoveredMonths_4,PartDLEPAmount_4,PartDLEPWaivedAmount_4,PartDLEPSubsidyAmount_4,PartDLEPStartdate4,PartDLEPEnddate4,LEPNumberofUncoveredMonths_5,PartDLEPAmount_5,PartDLEPWaivedAmount_5,PartDLEPSubsidyAmount_5,PartDLEPStartdate5,PartDLEPEnddate5,LEPNumberofUncoveredMonths_6,PartDLEPAmount_6,PartDLEPWaivedAmount_6,PartDLEPSubsidyAmount_6,PartDLEPStartdate6,PartDLEPEnddate6,LEPNumberofUncoveredMonths_7,PartDLEPAmount_7,PartDLEPWaivedAmount_7,PartDLEPSubsidyAmount_7,PartDLEPStartdate7,PartDLEPEnddate7,LEPNumberofUncoveredMonths_8,PartDLEPAmount_8,PartDLEPWaivedAmount_8,PartDLEPSubsidyAmount_8,PartDLEPStartdate8,PartDLEPEnddate8,LEPNumberofUncoveredMonths_9,PartDLEPAmount_9,PartDLEPWaivedAmount_9,PartDLEPSubsidyAmount_9,PartDLEPStartdate9,PartDLEPEnddate9,LEPNumberofUncoveredMonths_10,PartDLEPAmount_10,PartDLEPWaivedAmount_10,PartDLEPSubsidyAmount_10,PartDLEPStartdate10,PartDLEPEnddate10,CurrentLISPremiumSubsidy_1,PartDLISSubsidyLevel_1,PartDLISCopayCategory_1,PartDLISPStartdate1,PartDLISEnddate1,CurrentLISPremiumSubsidy_2,PartDLISSubsidyLevel_2,PartDLISCopayCategory_2,PartDLISStartdate2,PartDLISEnddate2,CurrentLISPremiumSubsidy_3,PartDLISSubsidyLevel_3,PartDLISCopayCategory_3,PartDLISStartdate3,PartDLISEnddate3,CurrentLISPremiumSubsidy_4,PartDLISSubsidyLevel_4,PartDLISCopayCategory_4,PartDLISStartdate4,PartDLISEnddate4,CurrentLISPremiumSubsidy_5,PartDLISSubsidyLevel_5,PartDLISCopayCategory_5,PartDLISStartdate5,PartDLISEnddate5,CurrentLISPremiumSubsidy_6,PartDLISSubsidyLevel_6,PartDLISCopayCategory_6,PartDLISStartdate6,PartDLISEnddate6,CurrentLISPremiumSubsidy_7,PartDLISSubsidyLevel_7,PartDLISCopayCategory_7,PartDLISStartdate7,PartDLISEnddate7,CurrentLISPremiumSubsidy_8,PartDLISSubsidyLevel_8,PartDLISCopayCategory_8,PartDLISStartdate8,PartDLISEnddate8,CurrentLISPremiumSubsidy_9,PartDLISSubsidyLevel_9,PartDLISCopayCategory_9,PartDLISStartdate9,PartDLISEnddate9,CurrentLISPremiumSubsidy_10,PartDLISSubsidyLevel_10,PartDLISCopayCategory_10,PartDLISStartdate10,PartDLISEnddate10,ContractNumber_1,ContractNumber_2,ContractNumber_3,ContractNumber_4,ContractNumber_5,ContractNumber_6,ContractNumber_7,ContractNumber_8,ContractNumber_9,ContractNumber_10,PBPNumber_1,PBPNumber_2,PBPNumber_3,PBPNumber_4,PBPNumber_5,PBPNumber_6,PBPNumber_7,PBPNumber_8,PBPNumber_9,PBPNumber_10,GroupID_1,GroupID_2,GroupID_3,GroupID_4,GroupID_5,GroupID_6,GroupID_7,GroupID_8,GroupID_9,GroupID_10,DisenrollmentReasoncode_DRC_1,DisenrollmentReasoncode_DRC_2,DisenrollmentReasoncode_DRC_3,DisenrollmentReasoncode_DRC_4,DisenrollmentReasoncode_DRC_5,DisenrollmentReasoncode_DRC_6,DisenrollmentReasoncode_DRC_7,DisenrollmentReasoncode_DRC_8,DisenrollmentReasoncode_DRC_9,DisenrollmentReasoncode_DRC_10,SignatureDate_1,SignatureDate_2,SignatureDate_3,SignatureDate_4,SignatureDate_5,SignatureDate_6,SignatureDate_7,SignatureDate_8,SignatureDate_9,SignatureDate_10,ElectionType_1,ElectionType_2,ElectionType_3,ElectionType_4,ElectionType_5,ElectionType_6,ElectionType_7,ElectionType_8,ElectionType_9,ElectionType_10,PWOStartdate_1,PWOEnddate_1,PaymentMethodType_1,PremiumWithholdOption_1,PWOStartdate_2,PWOEnddate_2,PaymentMethodType_2,PremiumWithholdOption_2,PWOStartdate_3,PWOEnddate_3,PaymentMethodType_3,PremiumWithholdOption_3,PWOStartdate_4,PWOEnddate_4,PaymentMethodType_4,PremiumWithholdOption_4,PWOStartdate_5,PWOEnddate_5,PaymentMethodType_5,PremiumWithholdOption_5,PWOStartdate_6,PWOEnddate_6,PaymentMethodType_6,PremiumWithholdOption_6,PWOStartdate_7,PWOEnddate_7,PaymentMethodType_7,PremiumWithholdOption_7,PWOStartdate_8,PWOEnddate_8,PaymentMethodType_8,PremiumWithholdOption_8,PWOStartdate_9,PWOEnddate_9,PaymentMethodType_9,PremiumWithholdOption_9,PWOStartdate_10,PWOEnddate_10,PaymentMethodType_10,PremiumWithholdOption_10,HospiceFlag_1,HospiceFlagStartdate_1,HospiceFlagEnddate_1,HospiceFlag_2,HospiceFlagStartdate_2,HospiceFlagEnddate_2,HospiceFlag_3,HospiceFlagStartdate_3,HospiceFlagEnddate_3,HospiceFlag_4,HospiceFlagStartdate_4,HospiceFlagEnddate_4,HospiceFlag_5,HospiceFlagStartdate_5,HospiceFlagEnddate_5,HospiceFlag_6,HospiceFlagStartdate_6,HospiceFlagEnddate_6,HospiceFlag_7,HospiceFlagStartdate_7,HospiceFlagEnddate_7,HospiceFlag_8,HospiceFlagStartdate_8,HospiceFlagEnddate_8,HospiceFlag_9,HospiceFlagStartdate_9,HospiceFlagEnddate_9,HospiceFlag_10,HospiceFlagStartdate_10,HospiceFlagEnddate_10,MedicaidFlag_1,MedicaidFlagStratDate_1,MedicaidFlagEndDate_1,MedicaidFlag_2,MedicaidFlagStratDate_2,MedicaidFlagEndDate_2,MedicaidFlag_3,MedicaidFlagStratDate_3,MedicaidFlagEndDate_3,MedicaidFlag_4,MedicaidFlagStratDate_4,MedicaidFlagEndDate_4,MedicaidFlag_5,MedicaidFlagStratDate_5,MedicaidFlagEndDate_5,MedicaidFlag_6,MedicaidFlagStratDate_6,MedicaidFlagEndDate_6,MedicaidFlag_7,MedicaidFlagStratDate_7,MedicaidFlagEndDate_7,MedicaidFlag_8,MedicaidFlagStratDate_8,MedicaidFlagEndDate_8,MedicaidFlag_9,MedicaidFlagStratDate_9,MedicaidFlagEndDate_9,MedicaidFlag_10,MedicaidFlagStratDate_10,MedicaidFlagEndDate_10,InstitutionalFlag_1,InstitutionalFlagStartDate_1,InstitutionalFlagEndDate_1,InstitutionalFlag_2,InstitutionalFlagStartDate_2,InstitutionalFlagEndDate_2,InstitutionalFlag_3,InstitutionalFlagStartDate_3,InstitutionalFlagEndDate_3,InstitutionalFlag_4,InstitutionalFlagStartDate_4,InstitutionalFlagEndDate_4,InstitutionalFlag_5,InstitutionalFlagStartDate_5,InstitutionalFlagEndDate_5,InstitutionalFlag_6,InstitutionalFlagStartDate_6,InstitutionalFlagEndDate_6,InstitutionalFlag_7,InstitutionalFlagStartDate_7,InstitutionalFlagEndDate_7,InstitutionalFlag_8,InstitutionalFlagStartDate_8,InstitutionalFlagEndDate_8,InstitutionalFlag_9,InstitutionalFlagStartDate_9,InstitutionalFlagEndDate_9,InstitutionalFlag_10,InstitutionalFlagStartDate_10,InstitutionalFlagEndDate_10,ESRDFlag_1,ESRDFlagStartDate_1,ESRDFlagEndDate_1,ESRDFlag_2,ESRDFlagStartDate_2,ESRDFlagEndDate_2,ESRDFlag_3,ESRDFlagStartDate_3,ESRDFlagEndDate_3,ESRDFlag_4,ESRDFlagStartDate_4,ESRDFlagEndDate_4,ESRDFlag_5,ESRDFlagStartDate_5,ESRDFlagEndDate_5,ESRDFlag_6,ESRDFlagStartDate_6,ESRDFlagEndDate_6,ESRDFlag_7,ESRDFlagStartDate_7,ESRDFlagEndDate_7,ESRDFlag_8,ESRDFlagStartDate_8,ESRDFlagEndDate_8,ESRDFlag_9,ESRDFlagStartDate_9,ESRDFlagEndDate_9,ESRDFlag_10,ESRDFlagStartDate_10,ESRDFlagEndDate_10,TransplantFlag_1,TransplantFlagStartDate_1,TransplantFlagEndDate_1,TransplantFlag_2,TransplantFlagStartDate_2,TransplantFlagEndDate_2,TransplantFlag_3,TransplantFlagStartDate_3,TransplantFlagEndDate_3,TransplantFlag_4,TransplantFlagStartDate_4,TransplantFlagEndDate_4,TransplantFlag_5,TransplantFlagStartDate_5,TransplantFlagEndDate_5,TransplantFlag_6,TransplantFlagStartDate_6,TransplantFlagEndDate_6,TransplantFlag_7,TransplantFlagStartDate_7,TransplantFlagEndDate_7,TransplantFlag_8,TransplantFlagStartDate_8,TransplantFlagEndDate_8,TransplantFlag_9,TransplantFlagStartDate_9,TransplantFlagEndDate_9,TransplantFlag_10,TransplantFlagStartDate_10,TransplantFlagEndDate_10,DialysisFlag_1,DialysisFlagStartDate_1,DialysisFlagEndDate_1,DialysisFlag_2,DialysisFlagStartDate_2,DialysisFlagEndDate_2,DialysisFlag_3,DialysisFlagStartDate_3,DialysisFlagEndDate_3,DialysisFlag_4,DialysisFlagStartDate_4,DialysisFlagEndDate_4,DialysisFlag_5,DialysisFlagStartDate_5,DialysisFlagEndDate_5,DialysisFlag_6,DialysisFlagStartDate_6,DialysisFlagEndDate_6,DialysisFlag_7,DialysisFlagStartDate_7,DialysisFlagEndDate_7,DialysisFlag_8,DialysisFlagStartDate_8,DialysisFlagEndDate_8,DialysisFlag_9,DialysisFlagStartDate_9,DialysisFlagEndDate_9,DialysisFlag_10,DialysisFlagStartDate_10,DialysisFlagEndDate_10,DisabledFlag_1,DisabledFlagStartDate_1,DisabledFlagEndDate_1,DisabledFlag_2,DisabledFlagStartDate_2,DisabledFlagEndDate_2,DisabledFlag_3,DisabledFlagStartDate_3,DisabledFlagEndDate_3,DisabledFlag_4,DisabledFlagStartDate_4,DisabledFlagEndDate_4,DisabledFlag_5,DisabledFlagStartDate_5,DisabledFlagEndDate_5,DisabledFlag_6,DisabledFlagStartDate_6,DisabledFlagEndDate_6,DisabledFlag_7,DisabledFlagStartDate_7,DisabledFlagEndDate_7,DisabledFlag_8,DisabledFlagStartDate_8,DisabledFlagEndDate_8,DisabledFlag_9,DisabledFlagStartDate_9,DisabledFlagEndDate_9,DisabledFlag_10,DisabledFlagStartDate_10,DisabledFlagEndDate_10,DualStatusCode_1,MCD_Startdate1,MCD_Enddate1,DualStatusCode_2,MCD_Startdate2,MCD_Enddate2,DualStatusCode_3,MCD_Startdate3,MCD_Enddate3,DualStatusCode_4,MCD_Startdate4,MCD_Enddate4,DualStatusCode_5,MCD_Startdate5,MCD_Enddate5,DualStatusCode_6,MCD_Startdate6,MCD_Enddate6,DualStatusCode_7,MCD_Startdate7,MCD_Enddate7,DualStatusCode_8,MCD_Startdate8,MCD_Enddate8,DualStatusCode_9,MCD_Startdate9,MCD_Enddate9,DualStatusCode_10,MCD_Startdate10,MCD_Enddate10,COBUpdateDate_1,COBStartdate_1,COBEnddate_1,NameofOtherCoverage_1,SubscriberIDofOtherCoverage_1,GroupIDofotherCoverage_1,KindofOtherInsurance_1,NameofOtherInsuranceCompany_1,COBUpdateDate_2,COBStartdate_2,COBEnddate_2,NameofOtherCoverage_2,SubscriberIDofOtherCoverage_2,GroupIDofotherCoverage_2,KindofOtherInsurance_2,NameofOtherInsuranceCompany_2,COBUpdateDate_3,COBStartdate_3,COBEnddate_3,NameofOtherCoverage_3,SubscriberIDofOtherCoverage_3,GroupIDofotherCoverage_3,KindofOtherInsurance_3,NameofOtherInsuranceCompany_3,COBUpdateDate_4,COBStartdate_4,COBEnddate_4,NameofOtherCoverage_4,SubscriberIDofOtherCoverage_4,GroupIDofotherCoverage_4,KindofOtherInsurance_4,NameofOtherInsuranceCompany_4,COBUpdateDate_5,COBStartdate_5,COBEnddate_5,NameofOtherCoverage_5,SubscriberIDofOtherCoverage_5,GroupIDofotherCoverage_5,KindofOtherInsurance_5,NameofOtherInsuranceCompany_5,COBUpdateDate_6,COBStartdate_6,COBEnddate_6,NameofOtherCoverage_6,SubscriberIDofOtherCoverage_6,GroupIDofotherCoverage_6,KindofOtherInsurance_6,NameofOtherInsuranceCompany_6,COBUpdateDate_7,COBStartdate_7,COBEnddate_7,NameofOtherCoverage_7,SubscriberIDofOtherCoverage_7,GroupIDofotherCoverage_7,KindofOtherInsurance_7,NameofOtherInsuranceCompany_7,COBUpdateDate_8,COBStartdate_8,COBEnddate_8,NameofOtherCoverage_8,SubscriberIDofOtherCoverage_8,GroupIDofotherCoverage_8,KindofOtherInsurance_8,NameofOtherInsuranceCompany_8,COBUpdateDate_9,COBStartdate_9,COBEnddate_9,NameofOtherCoverage_9,SubscriberIDofOtherCoverage_9,GroupIDofotherCoverage_9,KindofOtherInsurance_9,NameofOtherInsuranceCompany_9,COBUpdateDate_10,COBStartdate_10,COBEnddate_10,NameofOtherCoverage_10,SubscriberIDofOtherCoverage_10,GroupIDofotherCoverage_10,KindofOtherInsurance_10,NameofOtherInsuranceCompany_10,M3PStartdate_1,M3PEnddate_1,M3PTermReason_1,M3PStartdate_2,M3PEnddate_2,M3PTermReason_2,M3PStartdate_3,M3PEnddate_3,M3PTermReason_3,M3PStartdate_4,M3PEnddate_4,M3PTermReason_4,M3PStartdate_5,M3PEnddate_5,M3PTermReason_5,GenderIdentity,SexualOrientation,AlternativeFormatDataCD,Endofrecord
${M_Body}
</file>