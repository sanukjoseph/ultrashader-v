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
<!-- <Aliases><Alias ID="{S3000}" V="/Record(ID = 'ENR_ADDRESS')"/><Alias ID="{S3001}" V="/Record(ID = 'ENR_MEMBER')"/><Alias ID="{S3002}" V="/Record(ID = 'ENR_MEMBER_REPORTING_CATEGORY_IDENTIFIERS')"/><Alias ID="{S3003}" V="/Field(ID = 'SOURCE_DATA_CREATED_TIME')"/><Alias ID="{S3004}" V="/Field(ID = 'SUBMITTED_MEMBER_KEY')"/><Alias ID="{S3005}" V="/Record(ID = 'ENR_MEMBER_SUPPLEMENTAL_IDENTIFICATION')"/><Alias ID="{S3006}" V="/Record(ID = 'ENR_MEMBER_REPORTING_CATEGORY')"/><Alias ID="{S3007}" V="/Loop(ID = '2100A')/Segment(ID = 'DMG')"/><Alias ID="{S3008}" V="/Loop(ID = '2100G')/Segment(ID = 'NM1')"/><Alias ID="{S3009}" V="/Loop(ID = '2100G')/Segment(ID = 'PER')"/><Alias ID="{S3010}" V="/Record(ID = 'ENR_MEMBER_RACE_OR_ETHNICITY')"/><Alias ID="{S3011}" V="/Loop(ID = 'LS')/Loop(ID = '2700')/Loop(ID = '2750')"/><Alias ID="{S3012}" V="/Record(ID = 'ENR_MEMBER_LANGUAGE')"/><Alias ID="{S3013}" V="/Loop(ID = '2100A')/Segment(ID = 'NM1')"/><Alias ID="{S3014}" V="/Loop(ID = '2100A')/Segment(ID = 'PER')"/><Alias ID="{S3015}" V="/Loop(ID = '2100F')/Segment(ID = 'NM1')"/><Alias ID="{S3016}" V="/Loop(ID = '2100F')/Segment(ID = 'PER')"/><Alias ID="{S3017}" V="/Loop(ID = '2100A')/Segment(ID = 'N4')"/><Alias ID="{S3018}" V="/Loop(ID = '2300')/Segment(ID = 'HD')"/><Alias ID="{S3019}" V="/Field(ID = 'COMMUNICATION_KEY')"/><Alias ID="{S3020}" V="/Field(ID = 'ADDRESS_KEY')"/><Alias ID="{S3021}" V="/Loop(ID = '2100C')/Segment(ID = 'N4')"/><Alias ID="{S3022}" V="/Loop(ID = '2100F')/Segment(ID = 'N4')"/><Alias ID="{S3023}" V="/Loop(ID = '2100G')/Segment(ID = 'N4')"/><Alias ID="{S3024}" V="/Field(ID = 'STATE_OR_PROVINCE_CODE')"/><Alias ID="{S3025}" V="/Loop(ID = '2100A')/Segment(ID = 'LUI')"/><Alias ID="{S3026}" V="/Field(ID = 'ADDRESS_LINE_1')"/><Alias ID="{S3027}" V="/Field(ID = 'ADDRESS_LINE_2')"/><Alias ID="{S3028}" V="/Loop(ID = '2300')/Segment(ID = 'DTP')"/><Alias ID="{S3029}" V="/Field(ID = 'COUNTRY_CODE')"/><Alias ID="{S3030}" V="/Field(ID = 'POSTAL_CODE')"/><Alias ID="{S3031}" V="/Field(ID = 'ALTERNATE_TELEPHONE')"/><Alias ID="{S3032}" V="/Field(ID = 'TELEPHONE_EXTENSION')"/><Alias ID="{S1000}" V="/Record(ID = 'ENR_COMMUNICATION_NUMBERS')"/><Alias ID="{S1001}" V="/Record(ID = 'ENR_MEMBER_PLAN_SELECTION')"/><Alias ID="{S1002}" V="/Record(ID = 'ENR_MEMBER_RESPONSIBLE_PARTY')"/><Alias ID="{S1003}" V="/Record(ID = 'ENR_MEMBER_CUSTODIAL_PARENT')"/><Alias ID="{P1}" V="/Message(ID = 'INTEGRATION_PLUS_DB')"/><Alias ID="{P2}" V="/Transaction(ID = '834')/Loop(ID = '2000')"/><Alias ID="{P3}" V="/Transaction(ID = '834')"/></Aliases> -->
assets\
└── ArtifactsRepository
    └── EnrollmentsRepo
        ├── Groovy
        │   └── IB_834REPO_CounterGroovy.groovy
        ├── Guideline
        ├── Map
        │   └── P_IB_834REPO_X12_To_DFF.ems
        ├── ParserSchema
        ├── SplitRule
        │   └── P_IB_834REPO_EDISplit.xml
        └── Velocity
            └── IB_834_EnrollmentsRepoVelocity.vtmpl

<file path="ArtifactsRepository/EnrollmentsRepo/Groovy/IB_834REPO_CounterGroovy.groovy">
import com.edifecs.etools.xeserver.proxy.ProxyMessage;
import com.edifecs.etools.commons.io.SmartStream;
import groovy.util.slurpersupport.NodeChild;
import java.io.*;
import groovy.util.XmlSlurper
import org.apache.commons.lang.StringUtils
exchange = context.exchange;
exchProperties = exchange.properties;
messages = exchange.messages;
message = messages[0];
msgHeaders = message.headers;
messageBodyInputStream = message.getBodyAsSmartStream().getInputStream()
//fetch counter property
def counterValue = exchange.properties.get("counter")
// Convert to int
int counter = counterValue ? counterValue.toString().toInteger() : 0
/*if(counter == 0) // this code should only execute once to calculate actual splitGoodCount
{
// Fetch the GoodCount property
def splitgoodValue = exchange.properties.get('GoodCount')
//println ("GoodCount=" + splitgoodValue)
// Make sure it exists and is numeric
if (splitgoodValue != null) {
def numericValue = splitgoodValue as BigDecimal // convert to BigDecimal
def result = numericValue/ 3  // divide by 3 to get actual splitGoodCount
// Store result in a new property
exchange.properties.put("SplitGoodCount", result)
}
}*/
// to increment counter
counter++
// Store result in a new property
exchange.properties.put("counter", counter)
context.createExchangeResponse(exchProperties, messageBodyInputStream)
</file>
<file path="ArtifactsRepository/EnrollmentsRepo/Map/P_IB_834REPO_X12_To_DFF.ems">
<?xml version="1.0" encoding="UTF-8"?><Map Version="3" ModelVersion="4" ModelRevision="1" LastCPID="1154"><Ps C="Variables"><P N="LastVarID">25</P><P N="1/ID">11</P><P N="1/Name">Submitted_Member_Key</P><P N="2/ID">12</P><P N="2/Name">HealthCovPolicy_2300REF</P><P N="3/ID">13</P><P N="3/Name">HealthCovPolicy_2300AMT</P><P N="4/ID">14</P><P N="4/Name">Address_Count</P><P N="4/InitValue">0</P><P N="5/ID">15</P><P N="5/Name">CommNo_Count</P><P N="5/InitValue">0</P><P N="6/ID">16</P><P N="6/Name">Mem_CustodialParent_Count</P><P N="6/InitValue">0</P><P N="7/ID">17</P><P N="7/Name">Mem_RespParty_Count</P><P N="7/InitValue">0</P><P N="8/ID">18</P><P N="8/Name">Mem_Language_Count</P><P N="8/InitValue">0</P><P N="9/ID">19</P><P N="9/Name">Mem_RaceOrEthnicity_Count</P><P N="9/InitValue">0</P><P N="10/ID">20</P><P N="10/Name">Mem_RepCategoryIdentifiers_Count</P><P N="10/InitValue">0</P><P N="11/ID">21</P><P N="11/Name">Mem_RepCategory_Count</P><P N="11/InitValue">0</P><P N="12/ID">22</P><P N="12/Name">Mem_SuppIdentification_Count</P><P N="12/InitValue">0</P><P N="13/ID">23</P><P N="13/Name">Mem_PlanSelection_Count</P><P N="13/InitValue">0</P><P N="14/ID">25</P><P N="14/Name">TPA_BrokerName_1000C</P><P N="14/InitValue">0</P></Ps><Sources><ES ID="1" Type="DataBase.Standards"><Ps><P N="Name">Source</P><P N="Location">standard://HIPAA/V5010A/834x220A1</P></Ps><CPs><CP ID="6" Pth="{P3}/Loop(ID = '1000A')/Segment(ID = 'N1')/Element(ID = '93')"/><CP ID="8" Pth="{P3}/Loop(ID = '1000A')/Segment(ID = 'N1')/Element(ID = '67')"/><CP ID="9" Pth="{P3}/Loop(ID = '1000B')/Segment(ID = 'N1')/Element(ID = '93')"/><CP ID="13" Pth="{P3}/Loop(ID = '1000B')/Segment(ID = 'N1')/Element(ID = '67')"/><CP ID="17" Pth="{P3}/Loop(ID = '1000C')/Segment(ID = 'N1')/Element(ID = '93')"/><CP ID="19" Pth="{P3}/Loop(ID = '1000C')/Segment(ID = 'N1')/Element(ID = '67')"/><CP ID="21" Pth="{P3}/Loop(ID = '1000C')/Loop(ID = '1100C')/Segment(ID = 'ACT')/Element(ID = '508')"/><CP ID="27" Pth="{P2}/Segment(ID = 'INS')/Element(ID = '1073')"/><CP ID="28" Pth="{P2}/Segment(ID = 'INS')/Element(ID = '1069')"/><CP ID="29" Pth="{P2}/Segment(ID = 'INS')/Element(ID = '875')"/><CP ID="30" Pth="{P2}/Segment(ID = 'INS')/Element(ID = '1203')"/><CP ID="31" Pth="{P2}/Segment(ID = 'INS')/Element(ID = '1216')"/><CP ID="34" Pth="{P2}/Segment(ID = 'INS')/Composite(ID = 'C052')/Element(ID = '1218')"/><CP ID="35" Pth="{P2}/Segment(ID = 'INS')/Composite(ID = 'C052')/Element(ID = '1701')"/><CP ID="40" Pth="{P2}/Segment(ID = 'INS')/Element(ID = '1219')"/><CP ID="41" Pth="{P2}/Segment(ID = 'INS')/Element(ID = '584')"/><CP ID="42" Pth="{P2}/Segment(ID = 'INS')/Element(ID = '1220')"/><CP ID="43" Pth="{P2}/Segment(ID = 'INS')/Element(ID = '1073')[2]"/><CP ID="45" Pth="{P2}/Segment(ID = 'INS')/Element(ID = '1251')"/><CP ID="173" Pth="{P2}/Segment(ID = 'REF')/Element(ID = '127')"/><CP ID="175" Pth="{P2}/Segment(ID = 'REF')[2]/Element(ID = '127')"/><CP ID="177" Pth="{P2}/Segment(ID = 'REF')[3]/Element(ID = '128')"/><CP ID="179" Pth="{P2}/Segment(ID = 'REF')[3]/Element(ID = '127')"/><CP ID="188" Pth="{P2}{S3013}/Element(ID = '1035')"/><CP ID="190" Pth="{P2}{S3013}/Element(ID = '1036')"/><CP ID="192" Pth="{P2}{S3013}/Element(ID = '1037')"/><CP ID="194" Pth="{P2}{S3013}/Element(ID = '1038')"/><CP ID="196" Pth="{P2}{S3013}/Element(ID = '1039')"/><CP ID="221" Pth="{P2}{S3013}/Element(ID = '67')"/><CP ID="268" Pth="{P2}/Segment(ID = 'REF')[3]"/><CP ID="285" Pth="{P2}{S3014}/Element(ID = '365')"/><CP ID="286" Pth="{P2}{S3014}/Element(ID = '364')"/><CP ID="287" Pth="{P2}{S3014}/Element(ID = '365')[2]"/><CP ID="288" Pth="{P2}{S3014}/Element(ID = '364')[2]"/><CP ID="289" Pth="{P2}{S3014}/Element(ID = '365')[3]"/><CP ID="290" Pth="{P2}{S3014}/Element(ID = '364')[3]"/><CP ID="339" Pth="{P2}/Loop(ID = '2100A')/Segment(ID = 'N3')/Element(ID = '166')"/><CP ID="341" Pth="{P2}/Loop(ID = '2100A')/Segment(ID = 'N3')/Element(ID = '166')[2]"/><CP ID="343" Pth="{P2}{S3017}/Element(ID = '19')"/><CP ID="345" Pth="{P2}{S3017}/Element(ID = '156')"/><CP ID="347" Pth="{P2}{S3017}/Element(ID = '116')"/><CP ID="349" Pth="{P2}{S3017}/Element(ID = '26')"/><CP ID="351" Pth="{P2}{S3017}/Element(ID = '310')"/><CP ID="353" Pth="{P2}{S3007}/Element(ID = '1251')"/><CP ID="354" Pth="{P2}{S3007}/Element(ID = '1068')"/><CP ID="356" Pth="{P2}{S3007}/Element(ID = '1067')"/><CP ID="359" Pth="{P2}{S3007}/Composite(ID = 'C056')/Element(ID = '1109')"/><CP ID="360" Pth="{P2}{S3007}/Composite(ID = 'C056')/Element(ID = '1271')"/><CP ID="362" Pth="{P2}{S3007}/Element(ID = '1066')"/><CP ID="382" Pth="{P2}/Loop(ID = '2100A')/Segment(ID = 'HLH')/Element(ID = '1212')"/><CP ID="385" Pth="{P2}{S3025}/Element(ID = '67')"/><CP ID="387" Pth="{P2}{S3025}/Element(ID = '352')"/><CP ID="389" Pth="{P2}{S3025}/Element(ID = '1303')"/><CP ID="391" Pth="{P2}/Loop(ID = '2100C')/Segment(ID = 'N3')/Element(ID = '166')"/><CP ID="392" Pth="{P2}/Loop(ID = '2100C')/Segment(ID = 'N3')/Element(ID = '166')[2]"/><CP ID="393" Pth="{P2}{S3021}/Element(ID = '19')"/><CP ID="394" Pth="{P2}{S3021}/Element(ID = '156')"/><CP ID="395" Pth="{P2}{S3021}/Element(ID = '116')"/><CP ID="396" Pth="{P2}{S3021}/Element(ID = '26')"/><CP ID="432" Pth="{P2}{S3015}/Element(ID = '1035')"/><CP ID="434" Pth="{P2}{S3015}/Element(ID = '1036')"/><CP ID="436" Pth="{P2}{S3015}/Element(ID = '1037')"/><CP ID="438" Pth="{P2}{S3015}/Element(ID = '1038')"/><CP ID="440" Pth="{P2}{S3015}/Element(ID = '1039')"/><CP ID="442" Pth="{P2}{S3015}/Element(ID = '67')"/><CP ID="450" Pth="{P2}/Loop(ID = '2100F')/Segment(ID = 'N3')/Element(ID = '166')"/><CP ID="451" Pth="{P2}/Loop(ID = '2100F')/Segment(ID = 'N3')/Element(ID = '166')[2]"/><CP ID="453" Pth="{P2}{S3022}/Element(ID = '19')"/><CP ID="454" Pth="{P2}{S3022}/Element(ID = '156')"/><CP ID="455" Pth="{P2}{S3022}/Element(ID = '116')"/><CP ID="456" Pth="{P2}{S3022}/Element(ID = '26')"/><CP ID="457" Pth="{P2}{S3008}/Element(ID = '1035')"/><CP ID="459" Pth="{P2}{S3008}/Element(ID = '1036')"/><CP ID="461" Pth="{P2}{S3008}/Element(ID = '1037')"/><CP ID="463" Pth="{P2}{S3008}/Element(ID = '1038')"/><CP ID="465" Pth="{P2}{S3008}/Element(ID = '1039')"/><CP ID="467" Pth="{P2}{S3008}/Element(ID = '67')"/><CP ID="476" Pth="{P2}/Loop(ID = '2100G')/Segment(ID = 'N3')/Element(ID = '166')"/><CP ID="477" Pth="{P2}/Loop(ID = '2100G')/Segment(ID = 'N3')/Element(ID = '166')[2]"/><CP ID="478" Pth="{P2}{S3023}/Element(ID = '19')"/><CP ID="479" Pth="{P2}{S3023}/Element(ID = '156')"/><CP ID="480" Pth="{P2}{S3023}/Element(ID = '116')"/><CP ID="481" Pth="{P2}{S3023}/Element(ID = '26')"/><CP ID="482" Pth="{P2}{S3018}/Element(ID = '875')"/><CP ID="484" Pth="{P2}{S3018}/Element(ID = '1205')"/><CP ID="486" Pth="{P2}{S3018}/Element(ID = '1204')"/><CP ID="488" Pth="{P2}{S3018}/Element(ID = '1207')"/><CP ID="490" Pth="{P2}{S3018}/Element(ID = '1073')"/><CP ID="495" Pth="{P2}/Loop(ID = '2300')/Segment(ID = 'AMT')/Element(ID = '522')"/><CP ID="496" Pth="{P2}/Loop(ID = '2300')/Segment(ID = 'AMT')/Element(ID = '782')"/><CP ID="501" Pth="{P2}/Loop(ID = '2300')/Segment(ID = 'REF')/Element(ID = '128')"/><CP ID="502" Pth="{P2}/Loop(ID = '2300')/Segment(ID = 'REF')/Element(ID = '127')"/><CP ID="510" Pth="/InternalProperties/Field(Name = 'Submitted_Member_Key')"/><CP ID="514" Pth="{P2}{S3011}/Segment(ID = 'N1')/Element(ID = '93')"/><CP ID="517" Pth="{P2}{S3011}/Segment(ID = 'REF')/Element(ID = '128')"/><CP ID="518" Pth="{P2}{S3011}/Segment(ID = 'REF')/Element(ID = '127')"/><CP ID="523" Pth="{P2}{S3011}/Segment(ID = 'DTP')/Element(ID = '1250')"/><CP ID="524" Pth="{P2}{S3011}/Segment(ID = 'DTP')/Element(ID = '1251')"/><CP ID="619" Pth="{P2}{S3007}/Composite(ID = 'C056')"/><CP ID="634" Pth="{P2}{S3016}/Element(ID = '365')"/><CP ID="635" Pth="{P2}{S3016}/Element(ID = '364')"/><CP ID="636" Pth="{P2}{S3016}/Element(ID = '365')[2]"/><CP ID="637" Pth="{P2}{S3016}/Element(ID = '364')[2]"/><CP ID="638" Pth="{P2}{S3016}/Element(ID = '365')[3]"/><CP ID="639" Pth="{P2}{S3016}/Element(ID = '364')[3]"/><CP ID="646" Pth="{P2}{S3008}/Element(ID = '98')"/><CP ID="662" Pth="{P2}{S3009}/Element(ID = '365')"/><CP ID="663" Pth="{P2}{S3009}/Element(ID = '364')"/><CP ID="664" Pth="{P2}{S3009}/Element(ID = '365')[2]"/><CP ID="665" Pth="{P2}{S3009}/Element(ID = '364')[2]"/><CP ID="666" Pth="{P2}{S3009}/Element(ID = '365')[3]"/><CP ID="667" Pth="{P2}{S3009}/Element(ID = '364')[3]"/><CP ID="690" Pth="{P2}{S3028}/Element(ID = '374')"/><CP ID="691" Pth="{P2}{S3028}/Element(ID = '1250')"/><CP ID="693" Pth="{P2}{S3028}/Element(ID = '1251')"/><CP ID="1063" Pth="{P2}/Loop(ID = '2300')"/><CP ID="1095" Pth="{P3}/Loop(ID = '1000C')"/><CP ID="1148" Pth="{P2}{S3009}"/></ConnectionPoints/></Sources><Targets><ES ID="2" Type="File.ECS"><Ps><P N="Name">Target</P><P N="Location">..\Guideline\P_IB_834REPO_DFF_TARGET.ecs</P></Ps><Ps C="InstancedNodes"><P N="1/Path">/Message(ID = 'INTEGRATION_PLUS_DB'){S1000}</P><P N="1/Instance_1"/><P N="1/Instance_2"/><P N="1/Instance_3"/><P N="2/Path">/Message(ID = 'INTEGRATION_PLUS_DB'){S3000}</P><P N="2/Instance_1"/><P N="2/Instance_2"/><P N="2/Instance_3"/><P N="2/Instance_4"/></Ps><CPs><CP ID="233" Pth="{P1}{S3001}/Field(ID = 'SPONSOR_NAME')"/><CP ID="234" Pth="{P1}{S3001}/Field(ID = 'SPONSOR_IDENTIFICATION')"/><CP ID="235" Pth="{P1}{S3001}/Field(ID = 'PAYER_NAME')"/><CP ID="236" Pth="{P1}{S3001}/Field(ID = 'PAYER_IDENTIFICATION')"/><CP ID="237" Pth="{P1}{S3001}/Field(ID = 'BROKER_NAME')"/><CP ID="238" Pth="{P1}{S3001}/Field(ID = 'BROKER_IDENTIFICATION')"/><CP ID="239" Pth="{P1}{S3001}/Field(ID = 'BROKER_LICENSE_NUMBER')"/><CP ID="240" Pth="{P1}{S3001}/Field(ID = 'IS_SUBSCRIBER')"/><CP ID="241" Pth="{P1}{S3001}/Field(ID = 'RELATIONSHIP_CODE')"/><CP ID="242" Pth="{P1}{S3001}/Field(ID = 'MAINTENANCE_TYPE_CODE')"/><CP ID="243" Pth="{P1}{S3001}/Field(ID = 'MAINTENANCE_REASON_CODE')"/><CP ID="244" Pth="{P1}{S3001}/Field(ID = 'BENEFIT_STATUS_CODE')"/><CP ID="245" Pth="{P1}{S3001}/Field(ID = 'MEDICARE_PLAN_CODE')"/><CP ID="246" Pth="{P1}{S3001}/Field(ID = 'ELIGIBILITY_REASON_CODE')"/><CP ID="247" Pth="{P1}{S3001}/Field(ID = 'COBRA_EVENT_CODE')"/><CP ID="248" Pth="{P1}{S3001}/Field(ID = 'EMPLOYMENT_STATUS_CODE')"/><CP ID="249" Pth="{P1}{S3001}/Field(ID = 'STUDENT_STATUS_CODE')"/><CP ID="250" Pth="{P1}{S3001}/Field(ID = 'HANDICAP_STATUS_CODE')"/><CP ID="251" Pth="{P1}{S3001}/Field(ID = 'DATE_OF_DEATH')"/><CP ID="252" Pth="{P1}{S3001}/Field(ID = 'SUBSCRIBER_IDENTIFIER')"/><CP ID="253" Pth="{P1}{S3001}/Field(ID = 'GROUP_OR_POLICY_NUMBER')"/><CP ID="254" Pth="{P1}{S3005}/Field(ID = 'IDENTIFICATION_TYPE')"/><CP ID="255" Pth="{P1}{S3005}/Field(ID = 'MEMBER_SUPPLEMENTAL_IDENTIFIER')"/><CP ID="256" Pth="{P1}{S3001}/Field(ID = 'LAST_NAME')"/><CP ID="257" Pth="{P1}{S3001}/Field(ID = 'FIRST_NAME')"/><CP ID="258" Pth="{P1}{S3001}/Field(ID = 'MIDDLE_NAME')"/><CP ID="259" Pth="{P1}{S3001}/Field(ID = 'PREFIX')"/><CP ID="260" Pth="{P1}{S3001}/Field(ID = 'SUFFIX')"/><CP ID="261" Pth="{P1}{S3001}/Field(ID = 'IDENTIFICATION_CODE')"/><CP ID="305" Pth="{P1}{S1000}{1}/Field(ID = 'EMAIL_ADDRESS')"/><CP ID="306" Pth="{P1}{S1000}{1}{S3031}"/><CP ID="307" Pth="{P1}{S1000}{1}/Field(ID = 'BEEPER')"/><CP ID="308" Pth="{P1}{S1000}{1}/Field(ID = 'CELLULAR_PHONE')"/><CP ID="309" Pth="{P1}{S1000}{1}{S3032}"/><CP ID="310" Pth="{P1}{S1000}{1}/Field(ID = 'FACSIMILE')"/><CP ID="312" Pth="{P1}{S1000}{1}/Field(ID = 'HOME_PHONE')"/><CP ID="314" Pth="{P1}{S1000}{1}/Field(ID = 'TELEPHONE')"/><CP ID="316" Pth="{P1}{S1000}{1}/Field(ID = 'WORK_PHONE')"/><CP ID="340" Pth="{P1}{S3000}{1}{S3026}"/><CP ID="342" Pth="{P1}{S3000}{1}{S3027}"/><CP ID="344" Pth="{P1}{S3000}{1}/Field(ID = 'CITY')"/><CP ID="346" Pth="{P1}{S3000}{1}{S3024}"/><CP ID="348" Pth="{P1}{S3000}{1}{S3030}"/><CP ID="350" Pth="{P1}{S3000}{1}{S3029}"/><CP ID="352" Pth="{P1}{S3000}{1}/Field(ID = 'LOCATION_IDENTIFIER')"/><CP ID="363" Pth="{P1}{S3001}/Field(ID = 'DATE_OF_BIRTH')"/><CP ID="364" Pth="{P1}{S3001}/Field(ID = 'GENDER_CODE')"/><CP ID="366" Pth="{P1}{S3001}/Field(ID = 'MARITAL_STATUS_CODE')"/><CP ID="368" Pth="{P1}{S3001}/Field(ID = 'CITIZENSHIP_STATUS_CODE')"/><CP ID="377" Pth="{P1}{S3010}/Field(ID = 'RACE_OR_ETHNICITY_CODE')"/><CP ID="378" Pth="{P1}{S3010}/Field(ID = 'RACE_OR_ETHNICITY_CLASSIFICATION')"/><CP ID="384" Pth="{P1}{S3001}/Field(ID = 'SMOKING_STATUS_CODE')"/><CP ID="386" Pth="{P1}{S3012}/Field(ID = 'LANGUAGE_CODE')"/><CP ID="388" Pth="{P1}{S3012}/Field(ID = 'LANGUAGE_DESCRIPTION')"/><CP ID="390" Pth="{P1}{S3012}/Field(ID = 'LANGUAGE_INDICATOR')"/><CP ID="433" Pth="{P1}{S1003}/Field(ID = 'LAST_NAME')"/><CP ID="435" Pth="{P1}{S1003}/Field(ID = 'FIRST_NAME')"/><CP ID="437" Pth="{P1}{S1003}/Field(ID = 'MIDDLE_NAME')"/><CP ID="439" Pth="{P1}{S1003}/Field(ID = 'PREFIX')"/><CP ID="441" Pth="{P1}{S1003}/Field(ID = 'SUFFIX')"/><CP ID="443" Pth="{P1}{S1003}/Field(ID = 'IDENTIFICATION_CODE')"/><CP ID="458" Pth="{P1}{S1002}/Field(ID = 'LAST_NAME')"/><CP ID="460" Pth="{P1}{S1002}/Field(ID = 'FIRST_NAME')"/><CP ID="462" Pth="{P1}{S1002}/Field(ID = 'MIDDLE_NAME')"/><CP ID="464" Pth="{P1}{S1002}/Field(ID = 'PREFIX')"/><CP ID="466" Pth="{P1}{S1002}/Field(ID = 'SUFFIX')"/><CP ID="468" Pth="{P1}{S1002}/Field(ID = 'IDENTIFICATION_CODE')"/><CP ID="483" Pth="{P1}{S1001}/Field(ID = 'MAINTENANCE_TYPE_CODE')"/><CP ID="485" Pth="{P1}{S1001}/Field(ID = 'INSURANCE_LINE_CODE')"/><CP ID="487" Pth="{P1}{S1001}/Field(ID = 'PLAN_COVERAGE_DESCRIPTION')"/><CP ID="489" Pth="{P1}{S1001}/Field(ID = 'COVERAGE_LEVEL_CODE')"/><CP ID="491" Pth="{P1}{S1001}/Field(ID = 'LATE_ENROLLMENT_INDICATOR')"/><CP ID="497" Pth="{P1}{S1001}/Field(ID = 'PREMIUM_AMOUNT')"/><CP ID="506" Pth="{P1}{S1001}/Field(ID = 'GROUP_OR_POLICY_NUMBER')"/><CP ID="507" Pth="{P1}{S1001}/Field(ID = 'CLASS_OF_CONTRACT_CODE')"/><CP ID="513" Pth="{P1}{S1001}{S3004}"/><CP ID="515" Pth="{P1}{S3006}/Field(ID = 'NAME')"/><CP ID="516" Pth="{P1}{S3002}/Field(ID = 'IDENTIFICATION_TYPE')"/><CP ID="519" Pth="{P1}{S3002}/Field(ID = 'IDENTIFICATION')"/><CP ID="527" Pth="{P1}{S3006}/Field(ID = 'START_DATE')"/><CP ID="528" Pth="{P1}{S3006}/Field(ID = 'END_DATE')"/><CP ID="647" Pth="{P1}{S1002}/Field(ID = 'MEMBER_RESPONSIBLE_PARTY_TYPE')"/><CP ID="718" Pth="{P1}{S1001}/Field(ID = 'BENEFIT_BEGIN_DATE')"/><CP ID="719" Pth="{P1}{S1001}/Field(ID = 'BENEFIT_END_DATE')"/><CP ID="720" Pth="{P1}{S1001}/Field(ID = 'MAINTENANCE_EFFECTIVE_DATE')"/><CP ID="721" Pth="{P1}{S1001}/Field(ID = 'LAST_PREMIUM_PAID_DATE')"/><CP ID="735" Pth="{P1}{S1000}{2}/Field(ID = 'WORK_PHONE')"/><CP ID="736" Pth="{P1}{S1000}{2}/Field(ID = 'TELEPHONE')"/><CP ID="737" Pth="{P1}{S1000}{2}/Field(ID = 'HOME_PHONE')"/><CP ID="738" Pth="{P1}{S1000}{2}/Field(ID = 'FACSIMILE')"/><CP ID="739" Pth="{P1}{S1000}{2}{S3032}"/><CP ID="740" Pth="{P1}{S1000}{2}/Field(ID = 'EMAIL_ADDRESS')"/><CP ID="741" Pth="{P1}{S1000}{2}/Field(ID = 'CELLULAR_PHONE')"/><CP ID="742" Pth="{P1}{S1000}{2}/Field(ID = 'BEEPER')"/><CP ID="743" Pth="{P1}{S1000}{2}{S3031}"/><CP ID="744" Pth="{P1}{S1000}{3}{S3031}"/><CP ID="745" Pth="{P1}{S1000}{3}/Field(ID = 'BEEPER')"/><CP ID="746" Pth="{P1}{S1000}{3}/Field(ID = 'CELLULAR_PHONE')"/><CP ID="747" Pth="{P1}{S1000}{3}/Field(ID = 'EMAIL_ADDRESS')"/><CP ID="748" Pth="{P1}{S1000}{3}{S3032}"/><CP ID="749" Pth="{P1}{S1000}{3}/Field(ID = 'FACSIMILE')"/><CP ID="750" Pth="{P1}{S1000}{3}/Field(ID = 'HOME_PHONE')"/><CP ID="751" Pth="{P1}{S1000}{3}/Field(ID = 'TELEPHONE')"/><CP ID="752" Pth="{P1}{S1000}{3}/Field(ID = 'WORK_PHONE')"/><CP ID="833" Pth="{P1}{S3000}{2}{S3026}"/><CP ID="834" Pth="{P1}{S3000}{2}{S3027}"/><CP ID="835" Pth="{P1}{S3000}{2}/Field(ID = 'CITY')"/><CP ID="836" Pth="{P1}{S3000}{2}{S3024}"/><CP ID="837" Pth="{P1}{S3000}{2}{S3030}"/><CP ID="838" Pth="{P1}{S3000}{2}{S3029}"/><CP ID="844" Pth="{P1}{S3000}{3}{S3026}"/><CP ID="845" Pth="{P1}{S3000}{3}{S3027}"/><CP ID="846" Pth="{P1}{S3000}{3}/Field(ID = 'CITY')"/><CP ID="847" Pth="{P1}{S3000}{3}{S3024}"/><CP ID="848" Pth="{P1}{S3000}{3}{S3030}"/><CP ID="849" Pth="{P1}{S3000}{3}{S3029}"/><CP ID="855" Pth="{P1}{S3000}{4}{S3026}"/><CP ID="856" Pth="{P1}{S3000}{4}{S3027}"/><CP ID="857" Pth="{P1}{S3000}{4}/Field(ID = 'CITY')"/><CP ID="858" Pth="{P1}{S3000}{4}{S3024}"/><CP ID="859" Pth="{P1}{S3000}{4}{S3030}"/><CP ID="860" Pth="{P1}{S3000}{4}{S3029}"/><CP ID="873" Pth="{P1}{S3000}{1}{S3020}"/><CP ID="876" Pth="{P1}{S3000}{2}{S3020}"/><CP ID="878" Pth="{P1}{S3000}{3}{S3020}"/><CP ID="880" Pth="{P1}{S3000}{4}{S3020}"/><CP ID="884" Pth="{P1}{S3001}{S3004}"/><CP ID="906" Pth="{P1}{S3000}{1}{S3004}"/><CP ID="907" Pth="{P1}{S3000}{2}{S3004}"/><CP ID="908" Pth="{P1}{S3000}{3}{S3004}"/><CP ID="909" Pth="{P1}{S3000}{4}{S3004}"/><CP ID="910" Pth="{P1}{S1000}{1}{S3019}"/><CP ID="911" Pth="{P1}{S1000}{2}{S3019}"/><CP ID="912" Pth="{P1}{S1000}{3}{S3019}"/><CP ID="913" Pth="{P1}{S1003}{S3004}"/><CP ID="914" Pth="{P1}{S1002}{S3004}"/><CP ID="915" Pth="{P1}{S3012}{S3004}"/><CP ID="916" Pth="{P1}{S3010}{S3004}"/><CP ID="917" Pth="{P1}{S3002}{S3004}"/><CP ID="918" Pth="{P1}{S3006}{S3004}"/><CP ID="919" Pth="{P1}{S3005}{S3004}"/><CP ID="920" Pth="{P1}{S1000}{1}{S3004}"/><CP ID="921" Pth="{P1}{S1000}{2}{S3004}"/><CP ID="922" Pth="{P1}{S1000}{3}{S3004}"/><CP ID="943" Pth="{P1}{S1003}"/><CP ID="947" Pth="{P1}{S1003}/Field(ID = 'MEMBER_CUSTODIAL_PARENT_KEY')"/><CP ID="949" Pth="{P1}{S1002}"/><CP ID="953" Pth="{P1}{S1002}/Field(ID = 'MEMBER_RESPONSIBLE_PARTY_KEY')"/><CP ID="955" Pth="{P1}{S3012}"/><CP ID="959" Pth="{P1}{S3012}/Field(ID = 'MEMBER_LANGUAGE_KEY')"/><CP ID="961" Pth="{P1}{S3010}"/><CP ID="965" Pth="{P1}{S3010}/Field(ID = 'MEMBER_RACE_OR_ETHNICITY_KEY')"/><CP ID="979" Pth="{P1}{S3002}"/><CP ID="984" Pth="{P1}{S3002}/Field(ID = 'MEMBER_REPORTING_CATEGORY_KEY')"/><CP ID="986" Pth="{P1}{S3006}"/><CP ID="991" Pth="{P1}{S3006}/Field(ID = 'MEMBER_REPORTING_CATEGORY_KEY')"/><CP ID="993" Pth="{P1}{S3005}"/><CP ID="998" Pth="{P1}{S3005}/Field(ID = 'MEMBER_IDENTIFICATION_KEY')"/><CP ID="1000" Pth="{P1}{S1001}"/><CP ID="1005" Pth="{P1}{S1001}/Field(ID = 'MEMBER_PLAN_SELECTION_KEY')"/><CP ID="1006" Pth="{P1}{S3002}/Field(ID = 'REPORTING_CATEGORY_IDENTIFIER_KEY')"/><CP ID="1114" Pth="{P1}{S3001}/Field(ID = 'RESIDENCE_ADDRESS_KEY')"/><CP ID="1115" Pth="{P1}{S3001}/Field(ID = 'MAILING_ADDRESS_KEY')"/><CP ID="1116" Pth="{P1}{S3001}{S3019}"/><CP ID="1117" Pth="{P1}{S1003}{S3020}"/><CP ID="1118" Pth="{P1}{S1003}{S3019}"/><CP ID="1119" Pth="{P1}{S1002}{S3020}"/><CP ID="1120" Pth="{P1}{S1002}{S3019}"/><CP ID="1122" Pth="{P1}{S3001}{S3003}"/><CP ID="1123" Pth="{P1}{S3000}{1}{S3003}"/><CP ID="1124" Pth="{P1}{S3000}{2}{S3003}"/><CP ID="1125" Pth="{P1}{S3000}{3}{S3003}"/><CP ID="1126" Pth="{P1}{S3000}{4}{S3003}"/><CP ID="1127" Pth="{P1}{S1000}{1}{S3003}"/><CP ID="1128" Pth="{P1}{S1000}{2}{S3003}"/><CP ID="1129" Pth="{P1}{S1000}{3}{S3003}"/><CP ID="1130" Pth="{P1}{S1003}{S3003}"/><CP ID="1131" Pth="{P1}{S1002}{S3003}"/><CP ID="1132" Pth="{P1}{S3012}{S3003}"/><CP ID="1133" Pth="{P1}{S3010}{S3003}"/><CP ID="1134" Pth="{P1}{S3006}{S3003}"/><CP ID="1135" Pth="{P1}{S3002}{S3003}"/><CP ID="1136" Pth="{P1}{S3005}{S3003}"/><CP ID="1137" Pth="{P1}{S1001}{S3003}"/><CP ID="1140" Pth="/InternalProperties/Level(Name = 'Message')/Field(Name = 'ElementDelimiter')"/><CP ID="1147" Pth="{P1}{S1000}{3}"/></CPs><ReverseConnectionPoints><CP ID="944" O="943"/><CP ID="950" O="949"/><CP ID="956" O="955"/><CP ID="962" O="961"/><CP ID="980" O="979"/><CP ID="987" O="986"/><CP ID="994" O="993"/><CP ID="1001" O="1000"/></ReverseConnectionPoints/></Targets><Fs><F ID="21" N="JS-2000REF-MemSuppIdentifier_IP" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">myRS = ec_VariableHelper.GetRecordSet(&quot;Mem_SupplementalIden&quot;);
var resArr = new Array();
for (var i = 0; i &lt;2; i++)
{
resArr [i] = ec_DataHelper.GetValueByIndex(i);
}
myRS.insertRow();
myRS.updateRow(resArr);
ec_VariableHelper.SetRecordSet(&quot;Mem_SupplementalIden&quot;, myRS, true);</P></Ps><CPs><CP ID="262" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="264" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="263" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="22" N="JS-2000REF-MemSuppIdentifier_OP" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var myRS = ec_VariableHelper.GetRecordSet(&quot;Mem_SupplementalIden&quot;);
myRS.last();
var RS = myRS.getRow();
while(RS&gt;0)
{
Fields = myRS.getFields();
for (var i = 0; i &lt;Fields.length; i++)
{
ec_ResultHelper.ReportResultByIndex(i, Fields[i]);
}
myRS.previous();
RS = myRS.getRow();
}
</P></Ps><CPs><CP ID="267" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="265" FP="A" P="0" N="value1"/><CP ID="266" FP="X" P="0" N="result1"/><CP ID="269" FP="X" P="1" N="result2"/></ConnectionPoints/><F ID="24" N="JavaScript - Clear RS" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var A1 = ec_VariableHelper.GetRecordSet(&quot;Mem_SupplementalIden&quot;);
A1.clear();</P></Ps><CPs><CP ID="274" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="275" FP="A" P="0" N="value1"/><CP ID="273" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="30" N="S-2100A_DMG05_IP" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">myRS = ec_VariableHelper.GetRecordSet(&quot;Mem_Race_Ethnicity&quot;);
var resArr = new Array();
for (var i = 0; i &lt;2; i++)
{
resArr [i] = ec_DataHelper.GetValueByIndex(i);
}
myRS.insertRow();
myRS.updateRow(resArr);
ec_VariableHelper.SetRecordSet(&quot;Mem_Race_Ethnicity&quot;, myRS, true);</P></Ps><CPs><CP ID="369" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="371" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="370" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="31" N="JS-2100A_DMG05_OP" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var myRS = ec_VariableHelper.GetRecordSet(&quot;Mem_Race_Ethnicity&quot;);
myRS.last();
var RS = myRS.getRow();
while(RS&gt;0)
{
Fields = myRS.getFields();
for (var i = 0; i &lt;Fields.length; i++)
{
ec_ResultHelper.ReportResultByIndex(i, Fields[i]);
}
myRS.previous();
RS = myRS.getRow();
}
</P></Ps><CPs><CP ID="375" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="372" FP="A" P="0" N="value1"/><CP ID="373" FP="X" P="0" N="result1"/><CP ID="374" FP="X" P="1" N="result2"/></ConnectionPoints/><F ID="32" N="JavaScript - Clear RS" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var A1 = ec_VariableHelper.GetRecordSet(&quot;Mem_Race_Ethnicity&quot;);
A1.clear();</P></Ps><CPs><CP ID="381" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="379" FP="A" P="0" N="value1"/><CP ID="380" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="33" N="JS - 2100A_N3_N4" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var Address_1 = ec_DataHelper.GetValueByIndex(0);
var Address_2 = ec_DataHelper.GetValueByIndex(1);
var City = ec_DataHelper.GetValueByIndex(2);
var State = ec_DataHelper.GetValueByIndex(3);
var PostalCode = ec_DataHelper.GetValueByIndex(4);
var CountryCode = ec_DataHelper.GetValueByIndex(5);
var LocationIdentifier = ec_DataHelper.GetValueByIndex(6);
var Address_Count = ec_VariableHelper.GetVariable(&quot;Address_Count&quot;);
if(Address_1 != &quot;&quot;) ec_ResultHelper.ReportResultByIndex(0, Address_1);
if(Address_2 != &quot;&quot;) ec_ResultHelper.ReportResultByIndex(1, Address_2);
if(City != &quot;&quot;)
{
ec_ResultHelper.ReportResultByIndex(2, City);
if(Address_Count != &quot;&quot;)
{
Address_Count++;
ec_ResultHelper.ReportResultByIndex(7, Address_Count);
}
}
if(State != &quot;&quot;) ec_ResultHelper.ReportResultByIndex(3, State);
if(PostalCode != &quot;&quot;) ec_ResultHelper.ReportResultByIndex(4, PostalCode);
if(CountryCode != &quot;&quot;) ec_ResultHelper.ReportResultByIndex(5, CountryCode);
if(LocationIdentifier != &quot;&quot;) ec_ResultHelper.ReportResultByIndex(6, LocationIdentifier);</P></Ps><CPs><CP ID="397" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="399" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="400" FP="A" P="2" N="value3"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="401" FP="A" P="3" N="value4"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="402" FP="A" P="4" N="value5"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="403" FP="A" P="5" N="value6"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="404" FP="A" P="6" N="value7"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="398" FP="X" P="0" N="result1"/><CP ID="822" FP="X" P="1" N="result2"/><CP ID="823" FP="X" P="2" N="result3"/><CP ID="824" FP="X" P="3" N="result4"/><CP ID="825" FP="X" P="4" N="result5"/><CP ID="826" FP="X" P="5" N="result6"/><CP ID="827" FP="X" P="6" N="result7"/><CP ID="874" FP="X" P="7" N="result8"/></ConnectionPoints/><F ID="34" N="JS - 2100C_N3_N4" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var Address_1 = ec_DataHelper.GetValueByIndex(0);
var Address_2 = ec_DataHelper.GetValueByIndex(1);
var City = ec_DataHelper.GetValueByIndex(2);
var State = ec_DataHelper.GetValueByIndex(3);
var PostalCode = ec_DataHelper.GetValueByIndex(4);
var CountryCode = ec_DataHelper.GetValueByIndex(5);
var Address_Count = ec_VariableHelper.GetVariable(&quot;Address_Count&quot;);
if(Address_1 != &quot;&quot;) ec_ResultHelper.ReportResultByIndex(0, Address_1);
if(Address_2 != &quot;&quot;) ec_ResultHelper.ReportResultByIndex(1, Address_2);
if(City != &quot;&quot;)
{
ec_ResultHelper.ReportResultByIndex(2, City);
if(Address_Count != &quot;&quot;)
{
Address_Count++;
ec_ResultHelper.ReportResultByIndex(6, Address_Count);
}
}
if(State != &quot;&quot;) ec_ResultHelper.ReportResultByIndex(3, State);
if(PostalCode != &quot;&quot;) ec_ResultHelper.ReportResultByIndex(4, PostalCode);
if(CountryCode != &quot;&quot;) ec_ResultHelper.ReportResultByIndex(5, CountryCode);
</P></Ps><CPs><CP ID="412" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="414" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="415" FP="A" P="2" N="value3"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="416" FP="A" P="3" N="value4"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="417" FP="A" P="4" N="value5"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="418" FP="A" P="5" N="value6"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="413" FP="X" P="0" N="result1"/><CP ID="828" FP="X" P="1" N="result2"/><CP ID="829" FP="X" P="2" N="result3"/><CP ID="830" FP="X" P="3" N="result4"/><CP ID="831" FP="X" P="4" N="result5"/><CP ID="832" FP="X" P="5" N="result6"/><CP ID="875" FP="X" P="6" N="result7"/></ConnectionPoints/><F ID="37" N="JS - 2100F_N3_N4" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var Address_1 = ec_DataHelper.GetValueByIndex(0);
var Address_2 = ec_DataHelper.GetValueByIndex(1);
var City = ec_DataHelper.GetValueByIndex(2);
var State = ec_DataHelper.GetValueByIndex(3);
var PostalCode = ec_DataHelper.GetValueByIndex(4);
var CountryCode = ec_DataHelper.GetValueByIndex(5);
var Address_Count = ec_VariableHelper.GetVariable(&quot;Address_Count&quot;);
if(Address_1 != &quot;&quot;) ec_ResultHelper.ReportResultByIndex(0, Address_1);
if(Address_2 != &quot;&quot;) ec_ResultHelper.ReportResultByIndex(1, Address_2);
if(City != &quot;&quot;)
{
ec_ResultHelper.ReportResultByIndex(2, City);
if(Address_Count != &quot;&quot;)
{
Address_Count++;
ec_ResultHelper.ReportResultByIndex(6, Address_Count);
}
}
if(State != &quot;&quot;) ec_ResultHelper.ReportResultByIndex(3, State);
if(PostalCode != &quot;&quot;) ec_ResultHelper.ReportResultByIndex(4, PostalCode);
if(CountryCode != &quot;&quot;) ec_ResultHelper.ReportResultByIndex(5, CountryCode);</P></Ps><CPs><CP ID="444" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="446" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="447" FP="A" P="2" N="value3"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="448" FP="A" P="3" N="value4"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="449" FP="A" P="4" N="value5"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="452" FP="A" P="5" N="value6"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="445" FP="X" P="0" N="result1"/><CP ID="839" FP="X" P="1" N="result2"/><CP ID="840" FP="X" P="2" N="result3"/><CP ID="841" FP="X" P="3" N="result4"/><CP ID="842" FP="X" P="4" N="result5"/><CP ID="843" FP="X" P="5" N="result6"/><CP ID="877" FP="X" P="6" N="result7"/></ConnectionPoints/><F ID="38" N="JS-2100G_N3_N4" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var Address_1 = ec_DataHelper.GetValueByIndex(0);
var Address_2 = ec_DataHelper.GetValueByIndex(1);
var City = ec_DataHelper.GetValueByIndex(2);
var State = ec_DataHelper.GetValueByIndex(3);
var PostalCode = ec_DataHelper.GetValueByIndex(4);
var CountryCode = ec_DataHelper.GetValueByIndex(5);
var Address_Count = ec_VariableHelper.GetVariable(&quot;Address_Count&quot;);
if(Address_1 != &quot;&quot;) ec_ResultHelper.ReportResultByIndex(0, Address_1);
if(Address_2 != &quot;&quot;) ec_ResultHelper.ReportResultByIndex(1, Address_2);
if(City != &quot;&quot;)
{
ec_ResultHelper.ReportResultByIndex(2, City);
if(Address_Count != &quot;&quot;)
{
Address_Count++;
ec_ResultHelper.ReportResultByIndex(6, Address_Count);
}
}
if(State != &quot;&quot;) ec_ResultHelper.ReportResultByIndex(3, State);
if(PostalCode != &quot;&quot;) ec_ResultHelper.ReportResultByIndex(4, PostalCode);
if(CountryCode != &quot;&quot;) ec_ResultHelper.ReportResultByIndex(5, CountryCode);</P></Ps><CPs><CP ID="469" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="471" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="472" FP="A" P="2" N="value3"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="473" FP="A" P="3" N="value4"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="474" FP="A" P="4" N="value5"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="475" FP="A" P="5" N="value6"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="470" FP="X" P="0" N="result1"/><CP ID="850" FP="X" P="1" N="result2"/><CP ID="851" FP="X" P="2" N="result3"/><CP ID="852" FP="X" P="3" N="result4"/><CP ID="853" FP="X" P="4" N="result5"/><CP ID="854" FP="X" P="5" N="result6"/><CP ID="879" FP="X" P="6" N="result7"/></ConnectionPoints/><F ID="44" N="JS-2750-DTP" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var DTP02_2750 =  ec_DataHelper.GetValueByIndex(0);
var DTP03_2750 =  ec_DataHelper.GetValueByIndex(1);
var DateArray  = new Array();
if(DTP03_2750.includes(&quot;-&quot;))
{
var resN = DTP03_2750.split(&quot;-&quot;);
for(var i=0;i&lt;resN.length;i++)
{
DateArray[i] = resN[i];
}
}
else
{
DateArray[0] = DTP03_2750;
}
if(DTP02_2750 == &quot;D8&quot;)
{
ec_ResultHelper.ReportResultByIndex(0,DateArray[0]);
}
if(DTP02_2750 == &quot;RD8&quot;)
{
ec_ResultHelper.ReportResultByIndex(0,DateArray[0]);
ec_ResultHelper.ReportResultByIndex(1,DateArray[1]);
}
</P></Ps><CPs><CP ID="520" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="522" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="521" FP="X" P="0" N="result1"/><CP ID="525" FP="X" P="1" N="result2"/></ConnectionPoints/><F ID="45" N="JS-2100A_PER_IP" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var PER03 = ec_DataHelper.GetValueByIndex(0);
var PER04 = ec_DataHelper.GetValueByIndex(1);
var PER05 = ec_DataHelper.GetValueByIndex(2);
var PER06 = ec_DataHelper.GetValueByIndex(3);
var PER07 = ec_DataHelper.GetValueByIndex(4);
var PER08 = ec_DataHelper.GetValueByIndex(5);
var CommNo_Count = ec_VariableHelper.GetVariable(&quot;CommNo_Count&quot;);
if(PER03 != &quot;&quot;)
{
if(CommNo_Count != &quot;&quot;)
{
CommNo_Count++;
ec_ResultHelper.ReportResultByIndex(9, CommNo_Count);
}
}
if(PER03 == &quot;AP&quot;) ec_ResultHelper.ReportResultByIndex(0, PER04);
else if(PER05 == &quot;AP&quot;) ec_ResultHelper.ReportResultByIndex(0, PER06);
else if(PER07 == &quot;AP&quot;) ec_ResultHelper.ReportResultByIndex(0, PER08);
if(PER03 == &quot;BN&quot;) ec_ResultHelper.ReportResultByIndex(1, PER04);
else if(PER05 == &quot;BN&quot;) ec_ResultHelper.ReportResultByIndex(1, PER06);
else if(PER07 == &quot;BN&quot;) ec_ResultHelper.ReportResultByIndex(1, PER08);
if(PER03 == &quot;CP&quot;) ec_ResultHelper.ReportResultByIndex(2, PER04);
else if(PER05 == &quot;CP&quot;) ec_ResultHelper.ReportResultByIndex(2, PER06);
else if(PER07 == &quot;CP&quot;) ec_ResultHelper.ReportResultByIndex(2, PER08);
if(PER03 == &quot;EM&quot;) ec_ResultHelper.ReportResultByIndex(3, PER04);
else if(PER05 == &quot;EM&quot;) ec_ResultHelper.ReportResultByIndex(3, PER06);
else if(PER07 == &quot;EM&quot;) ec_ResultHelper.ReportResultByIndex(3, PER08);
if(PER03 == &quot;EX&quot;) ec_ResultHelper.ReportResultByIndex(4, PER04);
else if(PER05 == &quot;EX&quot;) ec_ResultHelper.ReportResultByIndex(4, PER06);
else if(PER07 == &quot;EX&quot;) ec_ResultHelper.ReportResultByIndex(4, PER08);
if(PER03 == &quot;FX&quot;) ec_ResultHelper.ReportResultByIndex(5, PER04);
else if(PER05 == &quot;FX&quot;) ec_ResultHelper.ReportResultByIndex(5, PER06);
else if(PER07 == &quot;FX&quot;) ec_ResultHelper.ReportResultByIndex(5, PER08);
if(PER03 == &quot;HP&quot;) ec_ResultHelper.ReportResultByIndex(6, PER04);
else if(PER05 == &quot;HP&quot;) ec_ResultHelper.ReportResultByIndex(6, PER06);
else if(PER07 == &quot;HP&quot;) ec_ResultHelper.ReportResultByIndex(6, PER08);
if(PER03 == &quot;TE&quot;) ec_ResultHelper.ReportResultByIndex(7, PER04);
else if(PER05 == &quot;TE&quot;) ec_ResultHelper.ReportResultByIndex(7, PER06);
else if(PER07 == &quot;TE&quot;) ec_ResultHelper.ReportResultByIndex(7, PER08);
if(PER03 == &quot;WP&quot;) ec_ResultHelper.ReportResultByIndex(8, PER04);
else if(PER05 == &quot;WP&quot;) ec_ResultHelper.ReportResultByIndex(8, PER06);
else if(PER07 == &quot;WP&quot;) ec_ResultHelper.ReportResultByIndex(8, PER08);</P></Ps><CPs><CP ID="529" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="531" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="532" FP="A" P="2" N="value3"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="533" FP="A" P="3" N="value4"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="534" FP="A" P="4" N="value5"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="535" FP="A" P="5" N="value6"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="530" FP="X" P="0" N="result1"/><CP ID="760" FP="X" P="1" N="result2"/><CP ID="761" FP="X" P="2" N="result3"/><CP ID="762" FP="X" P="3" N="result4"/><CP ID="763" FP="X" P="4" N="result5"/><CP ID="764" FP="X" P="5" N="result6"/><CP ID="765" FP="X" P="6" N="result7"/><CP ID="766" FP="X" P="7" N="result8"/><CP ID="767" FP="X" P="8" N="result9"/><CP ID="927" FP="X" P="9" N="result10"/></ConnectionPoints/><F ID="64" N="JS-2100F_PER_IP" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var PER03 = ec_DataHelper.GetValueByIndex(0);
var PER04 = ec_DataHelper.GetValueByIndex(1);
var PER05 = ec_DataHelper.GetValueByIndex(2);
var PER06 = ec_DataHelper.GetValueByIndex(3);
var PER07 = ec_DataHelper.GetValueByIndex(4);
var PER08 = ec_DataHelper.GetValueByIndex(5);
var CommNo_Count = ec_VariableHelper.GetVariable(&quot;CommNo_Count&quot;);
if(PER03 != &quot;&quot;)
{
if(CommNo_Count != &quot;&quot;)
{
CommNo_Count++;
ec_ResultHelper.ReportResultByIndex(9, CommNo_Count);
}
}
if(PER03 == &quot;AP&quot;) ec_ResultHelper.ReportResultByIndex(0, PER04);
else if(PER05 == &quot;AP&quot;) ec_ResultHelper.ReportResultByIndex(0, PER06);
else if(PER07 == &quot;AP&quot;) ec_ResultHelper.ReportResultByIndex(0, PER08);
if(PER03 == &quot;BN&quot;) ec_ResultHelper.ReportResultByIndex(1, PER04);
else if(PER05 == &quot;BN&quot;) ec_ResultHelper.ReportResultByIndex(1, PER06);
else if(PER07 == &quot;BN&quot;) ec_ResultHelper.ReportResultByIndex(1, PER08);
if(PER03 == &quot;CP&quot;) ec_ResultHelper.ReportResultByIndex(2, PER04);
else if(PER05 == &quot;CP&quot;) ec_ResultHelper.ReportResultByIndex(2, PER06);
else if(PER07 == &quot;CP&quot;) ec_ResultHelper.ReportResultByIndex(2, PER08);
if(PER03 == &quot;EM&quot;) ec_ResultHelper.ReportResultByIndex(3, PER04);
else if(PER05 == &quot;EM&quot;) ec_ResultHelper.ReportResultByIndex(3, PER06);
else if(PER07 == &quot;EM&quot;) ec_ResultHelper.ReportResultByIndex(3, PER08);
if(PER03 == &quot;EX&quot;) ec_ResultHelper.ReportResultByIndex(4, PER04);
else if(PER05 == &quot;EX&quot;) ec_ResultHelper.ReportResultByIndex(4, PER06);
else if(PER07 == &quot;EX&quot;) ec_ResultHelper.ReportResultByIndex(4, PER08);
if(PER03 == &quot;FX&quot;) ec_ResultHelper.ReportResultByIndex(5, PER04);
else if(PER05 == &quot;FX&quot;) ec_ResultHelper.ReportResultByIndex(5, PER06);
else if(PER07 == &quot;FX&quot;) ec_ResultHelper.ReportResultByIndex(5, PER08);
if(PER03 == &quot;HP&quot;) ec_ResultHelper.ReportResultByIndex(6, PER04);
else if(PER05 == &quot;HP&quot;) ec_ResultHelper.ReportResultByIndex(6, PER06);
else if(PER07 == &quot;HP&quot;) ec_ResultHelper.ReportResultByIndex(6, PER08);
if(PER03 == &quot;TE&quot;) ec_ResultHelper.ReportResultByIndex(7, PER04);
else if(PER05 == &quot;TE&quot;) ec_ResultHelper.ReportResultByIndex(7, PER06);
else if(PER07 == &quot;TE&quot;) ec_ResultHelper.ReportResultByIndex(7, PER08);
if(PER03 == &quot;WP&quot;) ec_ResultHelper.ReportResultByIndex(8, PER04);
else if(PER05 == &quot;WP&quot;) ec_ResultHelper.ReportResultByIndex(8, PER06);
else if(PER07 == &quot;WP&quot;) ec_ResultHelper.ReportResultByIndex(8, PER08);
</P></Ps><CPs><CP ID="628" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="629" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="630" FP="A" P="2" N="value3"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="631" FP="A" P="3" N="value4"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="632" FP="A" P="4" N="value5"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="633" FP="A" P="5" N="value6"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="627" FP="X" P="0" N="result1"/><CP ID="783" FP="X" P="1" N="result2"/><CP ID="784" FP="X" P="2" N="result3"/><CP ID="785" FP="X" P="3" N="result4"/><CP ID="786" FP="X" P="4" N="result5"/><CP ID="787" FP="X" P="5" N="result6"/><CP ID="788" FP="X" P="6" N="result7"/><CP ID="789" FP="X" P="7" N="result8"/><CP ID="790" FP="X" P="8" N="result9"/><CP ID="928" FP="X" P="9" N="result10"/></ConnectionPoints/><F ID="75" T="Append"><Ps C="S"><P N="separator">|</P><P N="variableID">12</P></Ps><CPs><CP ID="700" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="77" T="Append"><Ps C="S"><P N="separator">|</P><P N="variableID">12</P></Ps><CPs><CP ID="702" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="79" T="Append"><Ps C="S"><P N="separator">|</P><P N="variableID">13</P></Ps><CPs><CP ID="706" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="80" T="Append"><Ps C="S"><P N="separator">|</P><P N="variableID">13</P></Ps><CPs><CP ID="707" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="87" N="JS-2100G_PER_IP" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var PER03 = ec_DataHelper.GetValueByIndex(0);
var PER04 = ec_DataHelper.GetValueByIndex(1);
var PER05 = ec_DataHelper.GetValueByIndex(2);
var PER06 = ec_DataHelper.GetValueByIndex(3);
var PER07 = ec_DataHelper.GetValueByIndex(4);
var PER08 = ec_DataHelper.GetValueByIndex(5);
var CommNo_Count = ec_VariableHelper.GetVariable(&quot;CommNo_Count&quot;);
if(PER03 != &quot;&quot;)
{
if(CommNo_Count != &quot;&quot;)
{
CommNo_Count++;
ec_ResultHelper.ReportResultByIndex(9, CommNo_Count);
}
}
if(PER03 == &quot;AP&quot;) ec_ResultHelper.ReportResultByIndex(0, PER04);
else if(PER05 == &quot;AP&quot;) ec_ResultHelper.ReportResultByIndex(0, PER06);
else if(PER07 == &quot;AP&quot;) ec_ResultHelper.ReportResultByIndex(0, PER08);
if(PER03 == &quot;BN&quot;) ec_ResultHelper.ReportResultByIndex(1, PER04);
else if(PER05 == &quot;BN&quot;) ec_ResultHelper.ReportResultByIndex(1, PER06);
else if(PER07 == &quot;BN&quot;) ec_ResultHelper.ReportResultByIndex(1, PER08);
if(PER03 == &quot;CP&quot;) ec_ResultHelper.ReportResultByIndex(2, PER04);
else if(PER05 == &quot;CP&quot;) ec_ResultHelper.ReportResultByIndex(2, PER06);
else if(PER07 == &quot;CP&quot;) ec_ResultHelper.ReportResultByIndex(2, PER08);
if(PER03 == &quot;EM&quot;) ec_ResultHelper.ReportResultByIndex(3, PER04);
else if(PER05 == &quot;EM&quot;) ec_ResultHelper.ReportResultByIndex(3, PER06);
else if(PER07 == &quot;EM&quot;) ec_ResultHelper.ReportResultByIndex(3, PER08);
if(PER03 == &quot;EX&quot;) ec_ResultHelper.ReportResultByIndex(4, PER04);
else if(PER05 == &quot;EX&quot;) ec_ResultHelper.ReportResultByIndex(4, PER06);
else if(PER07 == &quot;EX&quot;) ec_ResultHelper.ReportResultByIndex(4, PER08);
if(PER03 == &quot;FX&quot;) ec_ResultHelper.ReportResultByIndex(5, PER04);
else if(PER05 == &quot;FX&quot;) ec_ResultHelper.ReportResultByIndex(5, PER06);
else if(PER07 == &quot;FX&quot;) ec_ResultHelper.ReportResultByIndex(5, PER08);
if(PER03 == &quot;HP&quot;) ec_ResultHelper.ReportResultByIndex(6, PER04);
else if(PER05 == &quot;HP&quot;) ec_ResultHelper.ReportResultByIndex(6, PER06);
else if(PER07 == &quot;HP&quot;) ec_ResultHelper.ReportResultByIndex(6, PER08);
if(PER03 == &quot;TE&quot;) ec_ResultHelper.ReportResultByIndex(7, PER04);
else if(PER05 == &quot;TE&quot;) ec_ResultHelper.ReportResultByIndex(7, PER06);
else if(PER07 == &quot;TE&quot;) ec_ResultHelper.ReportResultByIndex(7, PER08);
if(PER03 == &quot;WP&quot;) ec_ResultHelper.ReportResultByIndex(8, PER04);
else if(PER05 == &quot;WP&quot;) ec_ResultHelper.ReportResultByIndex(8, PER06);
else if(PER07 == &quot;WP&quot;) ec_ResultHelper.ReportResultByIndex(8, PER08);
</P></Ps><CPs><CP ID="816" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="817" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="818" FP="A" P="2" N="value3"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="819" FP="A" P="3" N="value4"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="820" FP="A" P="4" N="value5"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="821" FP="A" P="5" N="value6"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="807" FP="X" P="0" N="result1"/><CP ID="808" FP="X" P="1" N="result2"/><CP ID="809" FP="X" P="2" N="result3"/><CP ID="810" FP="X" P="3" N="result4"/><CP ID="811" FP="X" P="4" N="result5"/><CP ID="812" FP="X" P="5" N="result6"/><CP ID="813" FP="X" P="6" N="result7"/><CP ID="814" FP="X" P="7" N="result8"/><CP ID="815" FP="X" P="8" N="result9"/><CP ID="929" FP="X" P="9" N="result10"/></ConnectionPoints/><F ID="90" T="ChangeVariable"><Ps C="S"><P N="variableID">14</P></Ps><CPs><CP ID="868" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="92" T="ChangeVariable"><Ps C="S"><P N="variableID">14</P></Ps><CPs><CP ID="870" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="93" T="ChangeVariable"><Ps C="S"><P N="variableID">14</P></Ps><CPs><CP ID="871" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="94" T="ChangeVariable"><Ps C="S"><P N="variableID">14</P></Ps><CPs><CP ID="872" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="95" T="SetValue"><CPs><CP ID="883" FP="A" N="v" DirectValue="{11}"/><CP ID="881" FP="X" N="r"/></ConnectionPoints/><F ID="96" T="ChangeVariable"><Ps C="S"><P N="variableID">11</P></Ps><CPs><CP ID="882" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="97" T="Concatenate"><CPs><CP ID="885" FP="A" P="0" N="value1" DirectValue="RA"/><CP ID="887" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="886" FP="X" N="r"/></ConnectionPoints/><F ID="99" T="Concatenate"><CPs><CP ID="892" FP="A" P="0" N="value1" DirectValue="MA"/><CP ID="893" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="891" FP="X" N="r"/></ConnectionPoints/><F ID="101" T="Concatenate"><CPs><CP ID="898" FP="A" P="0" N="value1" DirectValue="CPA"/><CP ID="899" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="897" FP="X" N="r"/></ConnectionPoints/><F ID="103" T="Concatenate"><CPs><CP ID="904" FP="A" P="0" N="value1" DirectValue="RPA"/><CP ID="905" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="903" FP="X" N="r"/></ConnectionPoints/><F ID="104" T="ChangeVariable"><Ps C="S"><P N="variableID">15</P></Ps><CPs><CP ID="923" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="106" T="ChangeVariable"><Ps C="S"><P N="variableID">15</P></Ps><CPs><CP ID="925" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="107" T="ChangeVariable"><Ps C="S"><P N="variableID">15</P></Ps><CPs><CP ID="926" FP="A" N="v"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="108" T="Concatenate"><CPs><CP ID="930" FP="A" P="0" N="value1" DirectValue="RPC"/><CP ID="932" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="931" FP="X" N="r"/></ConnectionPoints/><F ID="110" T="Concatenate"><CPs><CP ID="937" FP="A" P="0" N="value1" DirectValue="CPC"/><CP ID="938" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="936" FP="X" N="r"/></ConnectionPoints/><F ID="111" T="Concatenate"><CPs><CP ID="940" FP="A" P="0" N="value1" DirectValue="MC"/><CP ID="941" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="939" FP="X" N="r"/></ConnectionPoints/><F ID="112" T="Increment"><Ps C="S"><P N="variableID">16</P></Ps><CPs><CP ID="942" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="114" T="Increment"><Ps C="S"><P N="variableID">17</P></Ps><CPs><CP ID="948" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="116" T="Increment"><Ps C="S"><P N="variableID">18</P></Ps><CPs><CP ID="954" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="118" T="Increment"><Ps C="S"><P N="variableID">19</P></Ps><CPs><CP ID="960" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="120" T="Concatenate"><CPs><CP ID="966" FP="A" P="0" N="value1" DirectValue="CP"/><CP ID="968" FP="A" P="1" N="value2" DirectValue="{16}"/><CP ID="967" FP="X" N="r"/></ConnectionPoints/><F ID="121" T="Concatenate"><CPs><CP ID="969" FP="A" P="0" N="value1" DirectValue="RP"/><CP ID="971" FP="A" P="1" N="value2" DirectValue="{17}"/><CP ID="970" FP="X" N="r"/></ConnectionPoints/><F ID="122" T="Concatenate"><CPs><CP ID="972" FP="A" P="0" N="value1" DirectValue="L"/><CP ID="974" FP="A" P="1" N="value2" DirectValue="{18}"/><CP ID="973" FP="X" N="r"/></ConnectionPoints/><F ID="123" T="Concatenate"><CPs><CP ID="975" FP="A" P="0" N="value1" DirectValue="RE"/><CP ID="977" FP="A" P="1" N="value2" DirectValue="{19}"/><CP ID="976" FP="X" N="r"/></ConnectionPoints/><F ID="124" T="Increment"><Ps C="S"><P N="variableID">20</P></Ps><CPs><CP ID="978" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="125" T="Concatenate"><CPs><CP ID="981" FP="A" P="0" N="value1" DirectValue="RCI"/><CP ID="983" FP="A" P="1" N="value2" DirectValue="{20}"/><CP ID="982" FP="X" N="r"/></ConnectionPoints/><F ID="126" T="Increment"><Ps C="S"><P N="variableID">21</P></Ps><CPs><CP ID="985" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="127" T="Concatenate"><CPs><CP ID="988" FP="A" P="0" N="value1" DirectValue="MRC"/><CP ID="990" FP="A" P="1" N="value2" DirectValue="{21}"/><CP ID="989" FP="X" N="r"/></ConnectionPoints/><F ID="128" T="Increment"><Ps C="S"><P N="variableID">22</P></Ps><CPs><CP ID="992" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="129" T="Concatenate"><CPs><CP ID="995" FP="A" P="0" N="value1" DirectValue="SI"/><CP ID="997" FP="A" P="1" N="value2" DirectValue="{22}"/><CP ID="996" FP="X" N="r"/></ConnectionPoints/><F ID="130" T="Increment"><Ps C="S"><P N="variableID">23</P></Ps><CPs><CP ID="999" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/><F ID="131" T="Concatenate"><CPs><CP ID="1002" FP="A" P="0" N="value1" DirectValue="PS"/><CP ID="1004" FP="A" P="1" N="value2" DirectValue="{23}"/><CP ID="1003" FP="X" N="r"/></ConnectionPoints/><F ID="134" N="JS-2300IP" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">myRS = ec_VariableHelper.GetRecordSet(&quot;Enr_Mem_PlanSelection_2300&quot;);
var resArr = new Array();
for (var i = 0; i &lt;5; i++)
{
resArr [i] = ec_DataHelper.GetValueByIndex(i);
}
myRS.insertRow();
myRS.updateRow(resArr);
ec_VariableHelper.SetRecordSet(&quot;Enr_Mem_PlanSelection_2300&quot;, myRS, true);</P></Ps><CPs><CP ID="1013" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1015" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1016" FP="A" P="2" N="value3"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1017" FP="A" P="3" N="value4"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1018" FP="A" P="4" N="value5"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1014" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="135" N="JS-2300-OP" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var myRS = ec_VariableHelper.GetRecordSet(&quot;Enr_Mem_PlanSelection_2300&quot;);
myRS.last();
var RS = myRS.getRow();
var HealthCovPolicy_2300REF = ec_VariableHelper.GetVariable(&quot;HealthCovPolicy_2300REF&quot;);
var HealthCovPolicy_2300AMT = ec_VariableHelper.GetVariable(&quot;HealthCovPolicy_2300AMT&quot;);
while(RS&gt;0)
{
Fields = myRS.getFields();
for (var i = 0; i &lt;5; i++)
{
ec_ResultHelper.ReportResultByIndex(i, Fields[i]);
}
//2300.DTP
var myRS1 = ec_VariableHelper.GetRecordSet(&quot;HealthCovDates_2300DTP&quot;);
//myRS1.last();
var RS1 = myRS1.getRow();
while(RS1&gt;0)
{
Fields1 = myRS1.getFields();
if(Fields1[0] == &quot;348&quot;)
{
ec_ResultHelper.ReportResultByIndex(5,Fields1[2]);
}
if(Fields1[0] == &quot;349&quot; &amp;&amp; Fields1[2]!=&quot;&quot;)
{
ec_ResultHelper.ReportResultByIndex(6,Fields1[2]);
}
else ec_ResultHelper.ReportResultByIndex(6,&quot;30000101&quot;);
if(Fields1[0] == &quot;543&quot;)
{
ec_ResultHelper.ReportResultByIndex(7,Fields1[2]);
}
if(Fields1[0] == &quot;303&quot;)
{
ec_ResultHelper.ReportResultByIndex(8,Fields1[2]);
}
//myRS1.previous();
myRS1.next();
RS1 = myRS1.getRow();
}
//2300.REF
if(HealthCovPolicy_2300REF != &quot;&quot;)
{
if(HealthCovPolicy_2300REF.length &gt; 0)
{
var res = HealthCovPolicy_2300REF.split(&quot;|&quot;);
for(i=0 ; i&lt;res.length ; i++)
{
if (res[i] != &quot;&quot;)
{
if(res[i]== &quot;1L&quot;)
{
ec_ResultHelper.ReportResultByIndex(9,res[i+1]);
}
if(res[i]== &quot;CE&quot;)
{
ec_ResultHelper.ReportResultByIndex(10,res[i+1]);
}
}
}
}
}
//2300.AMT
if(HealthCovPolicy_2300AMT != &quot;&quot;)
{
if(HealthCovPolicy_2300AMT.length &gt; 0)
{
var res = HealthCovPolicy_2300AMT.split(&quot;|&quot;);
for(i=0 ; i&lt;res.length ; i++)
{
if (res[i] != &quot;&quot;)
{
if(res[i]== &quot;P3&quot;)
{
ec_ResultHelper.ReportResultByIndex(11,res[i+1]);
}
}
}
}
}
ec_ResultHelper.Send();
myRS.previous();
RS = myRS.getRow();
}</P></Ps><CPs><CP ID="1031" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1019" FP="A" P="0" N="value1"/><CP ID="1020" FP="X" P="0" N="result1"/><CP ID="1024" FP="X" P="1" N="result2"/><CP ID="1025" FP="X" P="2" N="result3"/><CP ID="1026" FP="X" P="3" N="result4"/><CP ID="1027" FP="X" P="4" N="result5"/><CP ID="1028" FP="X" P="5" N="result6"/><CP ID="1029" FP="X" P="6" N="result7"/><CP ID="1030" FP="X" P="7" N="result8"/><CP ID="1038" FP="X" P="8" N="result9"/><CP ID="1039" FP="X" P="9" N="result10"/><CP ID="1040" FP="X" P="10" N="result11"/><CP ID="1045" FP="X" P="11" N="result12"/><CP ID="1046" FP="X" P="12" N="result13"/><CP ID="1047" FP="X" P="13" N="result14"/></ConnectionPoints/><F ID="137" N="JavaScript - Clear RS" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var A1 = ec_VariableHelper.GetRecordSet(&quot;Enr_Mem_PlanSelection_2300&quot;);
var B1 = ec_VariableHelper.GetRecordSet(&quot;HealthCovDates_2300DTP&quot;);
A1.clear();
B1.clear();</P></Ps><CPs><CP ID="1036" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1037" FP="A" P="0" N="value1"/><CP ID="1035" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="139" N="JS-2300DTP_IP" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">myRS = ec_VariableHelper.GetRecordSet(&quot;HealthCovDates_2300DTP&quot;);
var resArr = new Array();
for (var i = 0; i &lt;3; i++)
{
resArr [i] = ec_DataHelper.GetValueByIndex(i);
}
myRS.insertRow();
myRS.updateRow(resArr);
ec_VariableHelper.SetRecordSet(&quot;HealthCovDates_2300DTP&quot;, myRS, true);</P></Ps><CPs><CP ID="1050" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1052" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1053" FP="A" P="2" N="value3"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1051" FP="X" P="0" N="result1"/></ConnectionPoints/><F ID="140" T="ChangeVariable"><Ps C="S"><P N="variableID">12</P></Ps><CPs><CP ID="1056" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1055" FP="A" N="v"/></ConnectionPoints/><F ID="142" T="ChangeVariable"><Ps C="S"><P N="variableID">13</P></Ps><CPs><CP ID="1060" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1061" FP="A" N="v"/></ConnectionPoints/><F ID="153" N="JS-1000C-OP" T="JScript"><Ps C="S"><P N="Parameters/ec_Script">var BrokerName_1000C_N102 = ec_DataHelper.GetValueByIndex(0);
var IdentificationCode_1000C_N104 = ec_DataHelper.GetValueByIndex(1);
var AccountNo_1100C_ACT01 = ec_DataHelper.GetValueByIndex(2);
var TPA_BrokerName_1000C = ec_VariableHelper.GetVariable(&quot;TPA_BrokerName_1000C&quot;);
if(TPA_BrokerName_1000C != &quot;&quot;)
{
if(TPA_BrokerName_1000C == 1)
{
ec_ResultHelper.ReportResultByIndex(0, BrokerName_1000C_N102);
ec_ResultHelper.ReportResultByIndex(1, IdentificationCode_1000C_N104);
ec_ResultHelper.ReportResultByIndex(2, AccountNo_1100C_ACT01);
}
}</P></Ps><CPs><CP ID="1092" FP="A" P="0" N="value1"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1142" FP="A" P="1" N="value2"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1143" FP="A" P="2" N="value3"><Ps C="R"><P N="RV">true</P></Properties/><CP ID="1093" FP="X" P="0" N="result1"/><CP ID="1104" FP="X" P="1" N="result2"/><CP ID="1105" FP="X" P="2" N="result3"/></ConnectionPoints/><F ID="159" T="SystemDateTime"><Ps C="S"><P N="format">CCYYMMDD</P><P N="format_spec">1</P></Ps><CPs><CP ID="1121" FP="X" N="r"/></ConnectionPoints/><F ID="160" T="SetValue"><CPs><CP ID="1139" FP="A" N="v" DirectValue="|"/><CP ID="1138" FP="X" N="r"/></ConnectionPoints/><F ID="161" T="Increment"><Ps C="S"><P N="variableID">25</P></Ps><CPs><CP ID="1141" FP="_AP" N="a"><Ps C="R"><P N="RV">true</P></Properties/></ConnectionPoints/></Fs><Cs><C OutputCP="177" InputCP="262"/><C OutputCP="179" InputCP="264"/><C OutputCP="266" InputCP="254"/><C OutputCP="269" InputCP="255"/><C OutputCP="268" InputCP="267"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="268" InputCP="274"/><C OutputCP="359" InputCP="369"/><C OutputCP="360" InputCP="371"/><C OutputCP="373" InputCP="377"/><C OutputCP="374" InputCP="378"/><C OutputCP="385" InputCP="386"></C><C OutputCP="387" InputCP="388"></C><C OutputCP="389" InputCP="390"></C><C OutputCP="391" InputCP="412"/><C OutputCP="392" InputCP="414"/><C OutputCP="393" InputCP="415"/><C OutputCP="394" InputCP="416"/><C OutputCP="395" InputCP="417"/><C OutputCP="396" InputCP="418"/><C OutputCP="349" InputCP="403"/><C OutputCP="343" InputCP="400"/><C OutputCP="351" InputCP="404"/><C OutputCP="341" InputCP="399"/><C OutputCP="345" InputCP="401"/><C OutputCP="347" InputCP="402"/><C OutputCP="339" InputCP="397"/><C OutputCP="432" InputCP="433"></C><C OutputCP="434" InputCP="435"></C><C OutputCP="436" InputCP="437"></C><C OutputCP="438" InputCP="439"></C><C OutputCP="440" InputCP="441"></C><C OutputCP="442" InputCP="443"></C><C OutputCP="450" InputCP="444"/><C OutputCP="451" InputCP="446"/><C OutputCP="453" InputCP="447"/><C OutputCP="454" InputCP="448"/><C OutputCP="455" InputCP="449"/><C OutputCP="456" InputCP="452"/><C OutputCP="457" InputCP="458"></C><C OutputCP="459" InputCP="460"></C><C OutputCP="461" InputCP="462"></C><C OutputCP="463" InputCP="464"></C><C OutputCP="465" InputCP="466"></C><C OutputCP="467" InputCP="468"></C><C OutputCP="476" InputCP="469"/><C OutputCP="477" InputCP="471"/><C OutputCP="478" InputCP="472"/><C OutputCP="479" InputCP="473"/><C OutputCP="480" InputCP="474"/><C OutputCP="481" InputCP="475"/><C OutputCP="514" InputCP="515"></C><C OutputCP="517" InputCP="516"></C><C OutputCP="518" InputCP="519"></C><C OutputCP="523" InputCP="520"/><C OutputCP="524" InputCP="522"/><C OutputCP="521" InputCP="527"/><C OutputCP="525" InputCP="528"/><C OutputCP="619" InputCP="375"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="619" InputCP="381"/><C OutputCP="634" InputCP="628"/><C OutputCP="635" InputCP="629"/><C OutputCP="636" InputCP="630"/><C OutputCP="637" InputCP="631"/><C OutputCP="638" InputCP="632"/><C OutputCP="639" InputCP="633"/><C OutputCP="646" InputCP="647"></C><C OutputCP="501" InputCP="700"/><C OutputCP="502" InputCP="702"/><C OutputCP="495" InputCP="707"/><C OutputCP="496" InputCP="706"/><C OutputCP="285" InputCP="529"/><C OutputCP="286" InputCP="531"/><C OutputCP="287" InputCP="532"/><C OutputCP="288" InputCP="533"/><C OutputCP="289" InputCP="534"/><C OutputCP="290" InputCP="535"/><C OutputCP="530" InputCP="306"/><C OutputCP="760" InputCP="307"/><C OutputCP="761" InputCP="308"/><C OutputCP="762" InputCP="305"/><C OutputCP="763" InputCP="309"/><C OutputCP="764" InputCP="310"/><C OutputCP="765" InputCP="312"/><C OutputCP="766" InputCP="314"/><C OutputCP="767" InputCP="316"/><C OutputCP="627" InputCP="743"/><C OutputCP="783" InputCP="742"/><C OutputCP="784" InputCP="741"/><C OutputCP="785" InputCP="740"/><C OutputCP="786" InputCP="739"/><C OutputCP="787" InputCP="738"/><C OutputCP="788" InputCP="737"/><C OutputCP="789" InputCP="736"/><C OutputCP="790" InputCP="735"/><C OutputCP="662" InputCP="816"/><C OutputCP="663" InputCP="817"/><C OutputCP="664" InputCP="818"/><C OutputCP="665" InputCP="819"/><C OutputCP="666" InputCP="820"/><C OutputCP="667" InputCP="821"/><C OutputCP="807" InputCP="744"/><C OutputCP="808" InputCP="745"/><C OutputCP="809" InputCP="746"/><C OutputCP="810" InputCP="747"/><C OutputCP="811" InputCP="748"/><C OutputCP="812" InputCP="749"/><C OutputCP="813" InputCP="750"/><C OutputCP="814" InputCP="751"/><C OutputCP="815" InputCP="752"/><C OutputCP="398" InputCP="340"/><C OutputCP="822" InputCP="342"/><C OutputCP="823" InputCP="344"/><C OutputCP="824" InputCP="346"/><C OutputCP="825" InputCP="348"/><C OutputCP="826" InputCP="350"/><C OutputCP="827" InputCP="352"/><C OutputCP="413" InputCP="833"/><C OutputCP="828" InputCP="834"/><C OutputCP="829" InputCP="835"/><C OutputCP="830" InputCP="836"/><C OutputCP="831" InputCP="837"/><C OutputCP="832" InputCP="838"/><C OutputCP="445" InputCP="844"/><C OutputCP="839" InputCP="845"/><C OutputCP="840" InputCP="846"/><C OutputCP="841" InputCP="847"/><C OutputCP="842" InputCP="848"/><C OutputCP="843" InputCP="849"/><C OutputCP="470" InputCP="855"/><C OutputCP="850" InputCP="856"/><C OutputCP="851" InputCP="857"/><C OutputCP="852" InputCP="858"/><C OutputCP="853" InputCP="859"/><C OutputCP="854" InputCP="860"/><C OutputCP="874" InputCP="868"/><C OutputCP="875" InputCP="870"/><C OutputCP="877" InputCP="871"/><C OutputCP="879" InputCP="872"/><C OutputCP="510" InputCP="882"/><C OutputCP="881" InputCP="884"/><C OutputCP="881" InputCP="906"/><C OutputCP="881" InputCP="907"/><C OutputCP="881" InputCP="908"/><C OutputCP="881" InputCP="909"/><C OutputCP="881" InputCP="913"/><C OutputCP="881" InputCP="914"/><C OutputCP="881" InputCP="915"/><C OutputCP="881" InputCP="916"/><C OutputCP="881" InputCP="917"/><C OutputCP="881" InputCP="918"/><C OutputCP="881" InputCP="919"/><C OutputCP="881" InputCP="513"/><C OutputCP="881" InputCP="920"/><C OutputCP="881" InputCP="921"/><C OutputCP="881" InputCP="922"/><C OutputCP="927" InputCP="923"/><C OutputCP="928" InputCP="926"/><C OutputCP="929" InputCP="925"/><C OutputCP="944" InputCP="942"/><C OutputCP="950" InputCP="948"/><C OutputCP="956" InputCP="954"/><C OutputCP="962" InputCP="960"/><C OutputCP="967" InputCP="947"/><C OutputCP="970" InputCP="953"/><C OutputCP="973" InputCP="959"/><C OutputCP="976" InputCP="965"/><C OutputCP="980" InputCP="978"/><C OutputCP="994" InputCP="992"/><C OutputCP="996" InputCP="998"/><C OutputCP="1001" InputCP="999"/><C OutputCP="1003" InputCP="1005"/><C OutputCP="982" InputCP="1006"/><C OutputCP="989" InputCP="991"/><C OutputCP="987" InputCP="985"/><C OutputCP="989" InputCP="984"/><C OutputCP="1020" InputCP="483"/><C OutputCP="1024" InputCP="485"/><C OutputCP="1025" InputCP="487"/><C OutputCP="1026" InputCP="489"/><C OutputCP="1027" InputCP="491"/><C OutputCP="482" InputCP="1013"/><C OutputCP="484" InputCP="1015"/><C OutputCP="486" InputCP="1016"/><C OutputCP="488" InputCP="1017"/><C OutputCP="490" InputCP="1018"/><C OutputCP="690" InputCP="1050"/><C OutputCP="693" InputCP="1053"/><C OutputCP="1030" InputCP="721"/><C OutputCP="1038" InputCP="720"/><C OutputCP="1039" InputCP="506"/><C OutputCP="1040" InputCP="507"/><C OutputCP="1045" InputCP="497"/><C OutputCP="1063" InputCP="1031"><Ps C="GuidelineFilters"><P N="Event">1</P></Ps></C><C OutputCP="1063" InputCP="1036"/><C OutputCP="1063" InputCP="1056"/><C OutputCP="1063" InputCP="1060"/><C OutputCP="6" InputCP="233"></C><C OutputCP="9" InputCP="235"></C><C OutputCP="27" InputCP="240"></C><C OutputCP="28" InputCP="241"></C><C OutputCP="29" InputCP="242"></C><C OutputCP="30" InputCP="243"></C><C OutputCP="31" InputCP="244"></C><C OutputCP="34" InputCP="245"></C><C OutputCP="35" InputCP="246"></C><C OutputCP="40" InputCP="247"></C><C OutputCP="41" InputCP="248"></C><C OutputCP="42" InputCP="249"></C><C OutputCP="43" InputCP="250"></C><C OutputCP="45" InputCP="251"></C><C OutputCP="173" InputCP="252"></C><C OutputCP="175" InputCP="253"></C><C OutputCP="188" InputCP="256"></C><C OutputCP="190" InputCP="257"></C><C OutputCP="192" InputCP="258"></C><C OutputCP="194" InputCP="259"></C><C OutputCP="196" InputCP="260"></C><C OutputCP="221" InputCP="261"></C><C OutputCP="353" InputCP="363"></C><C OutputCP="354" InputCP="364"></C><C OutputCP="356" InputCP="366"></C><C OutputCP="362" InputCP="368"></C><C OutputCP="382" InputCP="384"></C><C OutputCP="874" InputCP="887"/><C OutputCP="886" InputCP="873"/><C OutputCP="875" InputCP="893"/><C OutputCP="891" InputCP="876"/><C OutputCP="877" InputCP="899"/><C OutputCP="897" InputCP="878"/><C OutputCP="879" InputCP="905"/><C OutputCP="903" InputCP="880"/><C OutputCP="886" InputCP="1114"/><C OutputCP="891" InputCP="1115"/><C OutputCP="897" InputCP="1117"/><C OutputCP="927" InputCP="941"/><C OutputCP="939" InputCP="910"/><C OutputCP="939" InputCP="1116"/><C OutputCP="928" InputCP="938"/><C OutputCP="936" InputCP="911"/><C OutputCP="929" InputCP="932"/><C OutputCP="931" InputCP="912"/><C OutputCP="936" InputCP="1118"/><C OutputCP="903" InputCP="1119"/><C OutputCP="931" InputCP="1120"/><C OutputCP="1121" InputCP="1122"/><C OutputCP="1121" InputCP="1123"/><C OutputCP="1121" InputCP="1124"/><C OutputCP="1121" InputCP="1125"/><C OutputCP="1121" InputCP="1126"/><C OutputCP="1121" InputCP="1127"/><C OutputCP="1121" InputCP="1128"/><C OutputCP="1121" InputCP="1129"/><C OutputCP="1121" InputCP="1130"/><C OutputCP="1121" InputCP="1131"/><C OutputCP="1121" InputCP="1132"/><C OutputCP="1121" InputCP="1133"/><C OutputCP="1121" InputCP="1134"/><C OutputCP="1121" InputCP="1135"/><C OutputCP="1121" InputCP="1136"/><C OutputCP="1121" InputCP="1137"/><C OutputCP="1138" InputCP="1140"/><C OutputCP="1095" InputCP="1141"/><C OutputCP="17" InputCP="1092"/><C OutputCP="1093" InputCP="237"/><C OutputCP="1104" InputCP="238"/><C OutputCP="1105" InputCP="239"/><C OutputCP="8" InputCP="234"></C><C OutputCP="13" InputCP="236"></C><C OutputCP="19" InputCP="1142"/><C OutputCP="21" InputCP="1143"/><C OutputCP="1148" InputCP="1147"><Ps C="TargetManipulation"><P N="Behavior">2</P></Ps></C><C OutputCP="1028" InputCP="718"/><C OutputCP="1029" InputCP="719"/><C OutputCP="691" InputCP="1052"/></Cs></Map>
</file>
<file path="ArtifactsRepository/EnrollmentsRepo/SplitRule/P_IB_834REPO_EDISplit.xml">
<?xml version="1.0" encoding="UTF-8"?><DataSplitRules Version="2.0" N="Data Splitting rules" Description="Default data splitting rule set" xsi:noNamespaceSchemaLocation="DataSplitRules.xsd" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"><Rule name="good">Member[@AckCode='A' and batch(.='1')]</Rule></DataSplitRules>
</file>
<file path="ArtifactsRepository/EnrollmentsRepo/Velocity/IB_834_EnrollmentsRepoVelocity.vtmpl">
{
"eventName": ${eventName},
"executionReferenceId": "${executionReferenceId}",
"feedback": {
"messageUUID": "${messageUUID}",
"messageCreateTimeUTC": "${messageCreateTimeUTC}",
"jobStatus": "${jobStatus}",
"jobCode": "${jobCode}"
}
}
</file>